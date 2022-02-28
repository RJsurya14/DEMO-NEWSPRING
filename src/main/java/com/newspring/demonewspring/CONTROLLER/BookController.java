package com.newspring.demonewspring.CONTROLLER;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newspring.demonewspring.dao.BookRepo;
import com.newspring.demonewspring.model.Book_details;


@Controller
public class BookController {
    @Autowired
	BookRepo br;
	
	@RequestMapping("/")
	public String show()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/addbook")
	@ResponseBody
	public String addpd(Book_details b)
	{
		br.save(b);
		return "Book Added...";
	}
	
	@RequestMapping("/viewbook")
	@ResponseBody
	public String viewbook(int id)
	{
		
		Book_details b = br.findById(id).orElse(new Book_details());
		return b.toString();
	}
	
	@RequestMapping("/viewbooks")
	@ResponseBody
	public String viewbooks()
	{
		List<Book_details> l = (List<Book_details>) br.findAll();
		return l.toString();
	}
	
	@RequestMapping("/updatebook")
	@ResponseBody
	public String updatepd(Book_details b)
	{
		br.save(b);
		return "Book Updated...";
	}
	
	@RequestMapping("/deletebook")
	@ResponseBody
	public String deletepd(int id)
	{
			br.deleteById(id);
			return "Book Deleted";
	}
}

