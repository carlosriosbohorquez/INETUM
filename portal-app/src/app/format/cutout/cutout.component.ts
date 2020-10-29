import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { DatePipe } from '@angular/common';

import { EntityFormat } from '../../models/entityformat.model';
import { EntityCutOut } from '../../models/entitycutout.model';
import { EntityDoc } from '../../models/entitydoc.model';
import { EntityFormatService } from '../entityformat.service';



@Component({
  templateUrl: './cutout.component.html'
})
export class CutOutComponent {
  

  entityFormat: EntityFormat = new EntityFormat();
  entityDoc: EntityDoc = new EntityDoc();
  entityCutOut: EntityCutOut = new EntityCutOut();

  constructor(private router: Router, private entityFormatService: EntityFormatService, public datePipe: DatePipe) {

  }
  
  searchFormat(idDoc : any): void {
    this.entityFormatService.searchDocByID(idDoc)
        .subscribe( data => {
          this.entityDoc = data;
          
          
        });
    }

}
