import { IPatient } from 'app/entities/patient/patient.model';

export interface IBloodpressure {
  id: number;
  systolic?: number | null;
  diastolic?: number | null;
  pulse?: number | null;
  recorded_at?: string | null;
  patient?: Pick<IPatient, 'id'> | null;
}

export type NewBloodpressure = Omit<IBloodpressure, 'id'> & { id: null };
