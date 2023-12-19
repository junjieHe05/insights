export interface IPatient {
  id: number;
  name?: string | null;
  age?: number | null;
  gender?: string | null;
  health?: string | null;
  geo?: string | null;
}

export type NewPatient = Omit<IPatient, 'id'> & { id: null };
