export class Tasks {
  taskName: '';
  taskStatus: '';
  taskPriority: '';

constructor(values: Object = {}) {
    Object.assign(this, values);
  }
}
