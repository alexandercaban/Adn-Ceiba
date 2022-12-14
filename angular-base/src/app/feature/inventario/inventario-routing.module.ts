import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { InventarioComponent } from './components/inventario/inventario.component';


const routes: Routes = [
  {
    path: '',
    component: InventarioComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class InventarioRoutingModule { }
