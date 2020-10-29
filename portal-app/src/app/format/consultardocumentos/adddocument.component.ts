import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { EntityDoc } from '../../models/entitydoc.model';
import { EntityFormat } from '../../models/entityformat.model';
import { EntityFormatService } from '../entityformat.service';

@Component({
  templateUrl: './adddocument.component.html'
})
export class AddEntityDocsComponent {

  entityDoc: EntityDoc = new EntityDoc();
  entityFormat: EntityFormat = new EntityFormat();
  formats: EntityFormat[];
  list : string[];

  constructor(private router: Router, private entityFormatService: EntityFormatService, private userService: EntityFormatService) {

  }

  ngOnInit() {
    this.userService.getEntityFormat()
      .subscribe( data => {
        this.formats = data;
        console.log(this.formats);
      });
  };

  createDocument(): void {
    console.log(this.entityDoc);
    this.entityFormatService.createEntityDocs(this.entityDoc)
        .subscribe( data => {
          alert("Document created successfully.");
        });

  };

}
