import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { EntityFormat } from '../../models/entityformat.model';
import { EntityFormatService} from '../entityformat.service';

@Component({
  selector: 'app-user',
  templateUrl: './entityformat.component.html',
  styles: []
})
export class EntityFormatComponent implements OnInit {

  formats: EntityFormat[];

  constructor(private router: Router, private userService: EntityFormatService) {

  }

  ngOnInit() {
    this.userService.getEntityFormat()
      .subscribe( data => {
        this.formats = data;
      });
  };
/*
  deleteUser(user: User): void {
    this.userService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };
*/
}


