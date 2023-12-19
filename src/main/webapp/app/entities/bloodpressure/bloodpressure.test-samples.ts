import { IBloodpressure, NewBloodpressure } from './bloodpressure.model';

export const sampleWithRequiredData: IBloodpressure = {
  id: 29369,
};

export const sampleWithPartialData: IBloodpressure = {
  id: 16660,
  pulse: 21289,
  recorded_at: 'abzüglich',
};

export const sampleWithFullData: IBloodpressure = {
  id: 12046,
  systolic: 9731,
  diastolic: 1062,
  pulse: 5057,
  recorded_at: 'whose per',
};

export const sampleWithNewData: NewBloodpressure = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
