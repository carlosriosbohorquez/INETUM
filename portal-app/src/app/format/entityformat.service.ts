import {Injectable} from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { catchError, tap, map } from 'rxjs/operators';
import { Observable } from 'rxjs'; 
import {_throw} from 'rxjs/observable/throw';
import { EntityFormat } from '../models/entityformat.model';
import { EntityDoc } from '../models/entitydoc.model';
import { EntityCutOut } from '../models/entitycutout.model';

@Injectable()
export class EntityFormatService {

  constructor(private http:HttpClient) {}

  private userUrl = '/api/docs/';

  public getEntityFormat() {
    return this.http.get<EntityFormat[]>(this.userUrl+"listAllFormats/");
  }

  public deleteEntityFormat(entityformat) {
    return this.http.delete(this.userUrl + "listFormatByID/"+ entityformat.id);
  }

  public searchFormatByID(id : any) {
    return this.http.get<EntityFormat>(this.userUrl + "listFormatByID/"+ id).pipe(
        tap(data => console.log('Formato por id: ' + data )),
        catchError(this.handleError)
    );
  }

  public searchDocByID(id : any) {
    return this.http.get<EntityDoc>(this.userUrl + "listDocByID/"+ id).pipe(
        tap(data => console.log('Formato por id: ' + data )),
        catchError(this.handleError)
    );
  }

  public createEntityFormat(entityformat : any) {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json', 'Access-Control-Allow-Origin' : '*'  })
    console.log("Crear: " + entityformat);
    return this.http.post<EntityFormat>(this.userUrl +'saveFormat', JSON.stringify(entityformat), { headers: headers })    
        .pipe(
            tap(data => console.log('Crear Formato: ' + data )),
            catchError(this.handleError)
        );
  }

  public createEntityDocs(entityDocs : any) {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json', 'Access-Control-Allow-Origin' : '*'  })
    console.log("Crear: " + entityDocs);
    return this.http.post<EntityDoc>(this.userUrl +'saveDoc', JSON.stringify(entityDocs), { headers: headers })    
        .pipe(
            tap(data => console.log('Crear Documentos: ' + data )),
            catchError(this.handleError)
        );
  }
  
  private handleError(err: HttpErrorResponse){
    let errorMessage = '';
    if(err.error instanceof ErrorEvent){
        errorMessage = 'Ocurrio un error : ${err.error.message}';
    } else {
        errorMessage = 'El servidor retorno: ${err.status}, el error del mensaje es: ${err.message}';
    }
    console.error(errorMessage);
    return Observable.throw(errorMessage);
}

}
