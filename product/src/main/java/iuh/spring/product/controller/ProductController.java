package iuh.spring.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class ProductController {
	@GetMapping("/product")
	public String getProduct() {
		return "Product nhe";
	}
}
