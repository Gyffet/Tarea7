package NEG;

import com.google.gson.*;

public class User
{
  int id_usuario;
  String email;
  String nombre;
  String apellido_paterno;
  String apellido_materno;
  String fecha_nacimiento;
  String telefono;
  String genero;
  byte[] foto;

  public static User valueOf(String s) throws Exception
  {
    Gson j = new GsonBuilder().registerTypeAdapter(byte[].class,new AdapBase64()).create();
    return (User)j.fromJson(s,User.class);
  }
}
