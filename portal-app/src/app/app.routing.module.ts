import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { EntityFormatComponent } from './format/consultarformatos/entityformat.component';
import {AddEntityFormatComponent} from './format/agregar/addformat.component';
import {ByFormatComponent} from './format/consultarformato/byformat.component';
import {AddEntityDocsComponent} from './format/consultardocumentos/adddocument.component';
import {CutOutComponent} from './format/cutout/cutout.component';

const routes: Routes = [
  { path: 'list', component: EntityFormatComponent },
  { path: 'add', component: AddEntityFormatComponent },
  { path: 'addOne', component: ByFormatComponent },
  { path: 'addDocs', component: AddEntityDocsComponent },
  { path: 'cutOut', component: CutOutComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
