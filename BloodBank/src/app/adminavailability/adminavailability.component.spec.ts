import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminavailabilityComponent } from './adminavailability.component';

describe('AdminavailabilityComponent', () => {
  let component: AdminavailabilityComponent;
  let fixture: ComponentFixture<AdminavailabilityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminavailabilityComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminavailabilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
