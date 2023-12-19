import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'patient',
        data: { pageTitle: 'insightsApp.patient.home.title' },
        loadChildren: () => import('./patient/patient.routes'),
      },
      {
        path: 'bloodpressure',
        data: { pageTitle: 'insightsApp.bloodpressure.home.title' },
        loadChildren: () => import('./bloodpressure/bloodpressure.routes'),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
