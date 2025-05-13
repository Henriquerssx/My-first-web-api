package dio.my_first_web_api.repository;

import dio.my_first_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo usuario na camada de repositorio");
        }else{
            System.out.println("UPDATE - Recebendo  usuario na camada de repositorio");
        }
        System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        System.out.println("DELETE/id - Recebendo o id " +id+ " para excluir");
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("LIST - Recebendo  usuario");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("jose","senha"));
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.println("FIND/id - Recebendo  id do usuario para localizar");
        return (new Usuario("jose","senha"));
    }
    public Usuario findByUsername(String username) {
        System.out.println("FIND/username - Recebendo o username");
        return (new Usuario("jose","senha"));
    }
}
