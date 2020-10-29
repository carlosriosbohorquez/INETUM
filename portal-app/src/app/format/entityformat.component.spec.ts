import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EntityFormatComponent } from './consultarformatos/entityformat.component';

describe('EntityComponent', () => {
  let component: EntityFormatComponent;
  let fixture: ComponentFixture<EntityFormatComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EntityFormatComponent ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EntityFormatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
