import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { DatePipe } from '@angular/common';

import { AppComponent } from './app.component';
import { EntityFormatComponent } from './format/consultarformatos/entityformat.component';
import { AppRoutingModule } from './app.routing.module';
import {EntityFormatService} from './format/entityformat.service';
import {HttpClientModule} from "@angular/common/http";
import {AddEntityFormatComponent} from './format/agregar/addformat.component';
import {ByFormatComponent} from './format/consultarformato/byformat.component';
import {AddEntityDocsComponent} from './format/consultardocumentos/adddocument.component';
import {CutOutComponent} from './format/cutout/cutout.component';


@NgModule({
  declarations: [
    AppComponent,
    EntityFormatComponent,
    AddEntityFormatComponent,
    ByFormatComponent,
    AddEntityDocsComponent,
    CutOutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [EntityFormatService, DatePipe],
  bootstrap: [AppComponent]
})
export class AppModule { }
