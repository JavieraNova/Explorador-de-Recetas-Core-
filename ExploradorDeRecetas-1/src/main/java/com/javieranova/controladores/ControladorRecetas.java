package com.javieranova.controladores;

// Se importa todo lo que necesitamos
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Arrays;
import java.util.HashMap;

// Se usa porque queremos devolver un JSP
@Controller
public class ControladorRecetas {

    private static String[] listaRecetas = {"Pizza", "Espagueti", "Lasaña"};
    private static HashMap<String, String[]> recetasConIngredientes = new HashMap<>();

    // Constructor para inicializar las recetas con sus ingredientes
    public ControladorRecetas() {
        String[] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
        recetasConIngredientes.put("Pizza", pizza);

        String[] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
        recetasConIngredientes.put("Espagueti", espagueti);

        String[] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
        recetasConIngredientes.put("Lasaña", lasaña);
    }

    // Método para obtener todas las recetas en recetras.jsp
    @GetMapping("/recetas")
    public String obtenerTodasLasRecetas(Model model) {
        System.out.println("Lista de recetas: " + Arrays.toString(listaRecetas)); 

        model.addAttribute("listaRecetas", listaRecetas);
        return "recetas"; 
    }

    // Método para obtener los detalles de una receta
    @GetMapping("/recetas/{nombre}")
    public String obtenerRecetaPorNombre(@PathVariable String nombre, Model model) {
        if (recetasConIngredientes.containsKey(nombre)) {
            model.addAttribute("nombreReceta", nombre);
            model.addAttribute("ingredientes", recetasConIngredientes.get(nombre));
        } else {
            model.addAttribute("mensaje", "La receta no se encuentra en nuestra lista.");
        }
        return "detalleReceta"; 
    }
}
