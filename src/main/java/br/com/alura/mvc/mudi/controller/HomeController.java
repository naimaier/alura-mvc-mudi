package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Kindle Paperwhite");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51+TWOfdtiL._AC_SX679_.jpg");
		pedido.setUrlProduto("https://www.amazon.com/Kindle-Paperwhite-Waterproof-International/dp/B07741S7Y8/ref=sr_1_9?keywords=Kindle+E-readers&pd_rd_r=c4c90631-05f6-45e6-b59c-71568872bb24&pd_rd_w=UV6b5&pd_rd_wg=0qWoP&pf_rd_p=b9deb6fa-f7f0-4f9b-bfa0-824f28f79589&pf_rd_r=ERFXRBDRBBA1QCMV0HEH&qid=1651432114&sr=8-9");
		pedido.setDescricao("Kindle Paperwhite");
		pedido.setValorNegociado(new BigDecimal(120.00));
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
