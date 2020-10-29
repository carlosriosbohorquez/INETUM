package com.formato.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formato.api.dto.EntityCutOut;
import com.formato.api.dto.EntityDoc;
import com.formato.api.dto.EntityFormat;
import com.formato.api.exception.ContentNotAllowedException;
import com.formato.api.service.EntidadCutOutService;
import com.formato.api.service.EntidadDocService;
import com.formato.api.service.EntidadFormatoService;

@RestController
@RequestMapping("/api/docs")
public class FormatoController {

	@Autowired
	EntidadFormatoService formatoService;

	@PostMapping(path = "/saveFormat", consumes = "application/json", produces = "application/json")
	public long save(@RequestBody EntityFormat format) {
		formatoService.save(format);		
		return format.getIdformat();
	}

	@GetMapping("/listAllFormats")
	public Iterable<EntityFormat> listAllFormats() {
		return formatoService.list();
	}

	@GetMapping("/listFormatByID/{id}")
	public EntityFormat listPersonById(@PathVariable("id") int id) throws ContentNotAllowedException {
		Optional<EntityFormat> person = formatoService.listId(id);
		if (person.isPresent()) {
			return person.get();
		}
		throw new ContentNotAllowedException("Invalid find format provided");
	}

	/** FORMAT **/

	@Autowired
	EntidadDocService docService;

	@PostMapping("/saveDoc")
	public long save(@RequestBody EntityDoc docs) {
		docService.save(docs);
		return docs.getIdDoc();
	}

	@GetMapping("/listAllDocs")
	public Iterable<EntityDoc> listAllDocs() {
		return docService.list();
	}

	@GetMapping("/listDocByID/{id}")
	public EntityDoc listDocsById(@PathVariable("id") int id) throws ContentNotAllowedException {
		Optional<EntityDoc> person = docService.listId(id);
		if (person.isPresent()) {
			return person.get();
		}
		throw new ContentNotAllowedException("Invalid find format provided");
	}

	/** FORMAT **/

	@Autowired
	EntidadCutOutService cutService;

	@PostMapping("/saveCut")
	public long saveCut(@RequestBody EntityCutOut cutOut) {
		cutService.save(cutOut);
		return cutOut.getIdCutOut();
	}

	@GetMapping("/listAllCut")
	public Iterable<EntityCutOut> listAllCuts() {
		return cutService.list();
	}

	@GetMapping("/listCutByID/{id}")
	public EntityCutOut listCutsByID(@PathVariable("id") int id) throws ContentNotAllowedException {
		Optional<EntityCutOut> cut = cutService.listId(id);
		if (cut.isPresent()) {
			return cut.get();
		}
		throw new ContentNotAllowedException("Invalid find format provided");
	}

}
