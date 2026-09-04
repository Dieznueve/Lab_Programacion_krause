package com.estudiantes;
public class EstudianteService{
        private final EstudianteDao eDao;

        public EstudianteService(){
            this.eDao = new EstudianteDaoImpl();
        }
    public void registrar(String nombre,String apellido, String dni, String curso){
        Estudiante e = new Estudiante(nombre,apellido,dni,curso);
        eDao.insertar(e);
    }
}