import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { DatePipe } from '@angular/common';

import { EntityFormat } from '../../models/entityformat.model';
import { EntityFormatService } from '../entityformat.service';



@Component({
  templateUrl: './byformat.component.html'
})
export class ByFormatComponent {
  

  entityFormat: EntityFormat = new EntityFormat();

  constructor(private router: Router, private entityFormatService: EntityFormatService, public datePipe: DatePipe) {

  }
  
  searchFormat(idformat : any): void {
    this.entityFormatService.searchFormatByID(idformat)
        .subscribe( data => {
          this.entityFormat = data;
          let latest_date =this.datePipe.transform(this.entityFormat.dateCreation, 'yyyy-MM-dd');
          this.entityFormat.dateCreation = latest_date;
          latest_date =this.datePipe.transform(this.entityFormat.dateModification, 'yyyy-MM-dd');
          this.entityFormat.dateModification = latest_date;
        });
    }

}
