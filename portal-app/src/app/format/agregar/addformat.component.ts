import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { EntityFormat } from '../../models/entityformat.model';
import { EntityFormatService } from '../entityformat.service';

@Component({
  templateUrl: './addformat.component.html'
})
export class AddEntityFormatComponent {

  entityFormat: EntityFormat = new EntityFormat();

  constructor(private router: Router, private entityFormatService: EntityFormatService) {

  }

  createFormat(): void {
    this.entityFormatService.createEntityFormat(this.entityFormat)
        .subscribe( data => {
          alert("Format created successfully.");
        });

  };

}
