import { IPatient, NewPatient } from './patient.model';

export const sampleWithRequiredData: IPatient = {
  id: 22097,
};

export const sampleWithPartialData: IPatient = {
  id: 1178,
  name: 'gliedern',
  age: 4003,
  health: 'immerdar phooey',
};

export const sampleWithFullData: IPatient = {
  id: 21965,
  name: 'alleweg durchschlagend Klassik',
  age: 9824,
  gender: 'that ratlos grundsolide',
  health: 'durchsetzungsstark hinauf monströs',
  geo: 'tapern',
};

export const sampleWithNewData: NewPatient = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
