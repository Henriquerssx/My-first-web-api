package dio.my_first_web_api.controller;

import dio.my_first_web_api.model.Usuario;
import dio.my_first_web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/users")
    public List<Usuario> getUsers() {
      return usuarioRepository.findAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return usuarioRepository.findByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
       usuarioRepository.deleteById(id);
    }
    public void PostUser(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
