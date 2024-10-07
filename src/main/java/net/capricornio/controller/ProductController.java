package net.capricornio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.capricornio.entity.Product;
import net.capricornio.service.IProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
public class ProductController {
	
	private  final IProductService productService;
	
	@GetMapping("/all-products")
	public List<Product> getProducts(){
		return  productService.retrieveAll();
	}
	@PostMapping("/add-product")
	public Product addProduct(@RequestBody Product p) {
		return  productService.addProduct(p);
	}
	 // http://localhost:8081/edit-product
	 @PutMapping("/edit-product")
	 public Product editProduct(@RequestBody Product p) {
	  return productService.editProduct(p);
	 }

	 // http://localhost:8081/delet-product/id
	  @DeleteMapping("/delete-product/{idProduct}")
	  public void deleteProduct(@PathVariable("idProduct") Long id) {
	    productService.deleteProduct(id);
	  }
}
