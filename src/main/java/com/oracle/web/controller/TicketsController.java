package com.oracle.web.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.oracle.domain.Ticket;
import com.oracle.domain.Users;
import com.oracle.dto.UserDto;
import com.oracle.service.TicketService;

@CrossOrigin // 跨域访问，所有网站可以跨域访问
@Controller
public class TicketsController {

	@Autowired
	private TicketService ticketService;

	// 查询门票所有
	@ResponseBody
	@RequestMapping("findAll")
	public List<Ticket> selectAll() {
		List<Ticket> list=this.ticketService.ticketSearch();
		return list;
	}

	// 跳转新增门票信息
	@RequestMapping("addUI")
	public String addUI() {
		return "redirect:TicketsAdd.jsp";
	}

	// 新增门票信息
	@RequestMapping("add")
	public String add(Ticket ticket) {
		this.ticketService.sevaadd(ticket);
		return "findAll";
	}

	// 修改门票信息
	@RequestMapping("updateUI")
	public String updateUI(Integer id, ModelMap modelmap) {
		modelmap.put("upid", this.ticketService.updateId(id));
		return "TicketModify.jsp";
	}

	// 信息修改中
	@RequestMapping("saveupdate")
	public String saveupdate(Ticket tackets) {
		this.ticketService.saveupdate(tackets);
		return "findAll";
	}

	// 删除门票信息
	@RequestMapping("delete")
	public String savedelete(Integer id) {
		this.ticketService.savedelete(id);
		return "findall";
	}

	// 用户的分页查询：每页显示条数pageSize，当前页page
	@RequestMapping("findPages")
	public String fingPages(UserDto userDto, ModelMap modelMap) {
		modelMap.addAttribute("pageInfo", this.ticketService.findPages(userDto));
		return "redirect:list.jsp";
	}
	
	
	
	//添加Users
	@ResponseBody
	@RequestMapping("saves")
	public String save(Users user,MultipartFile  img,HttpSession session) throws Exception {
		if(img!=null && !"".equals(img.getOriginalFilename())) {
			//文件上传处理
			String oldName=img.getOriginalFilename();
			//得到源文件的扩展名
			String ext=oldName.substring(oldName.lastIndexOf("."));
			//得新的名称
			String newName=UUID.randomUUID()+ext;
			//自己增加，每天上传的文件，对应一个文件夹2020-2-21
			//实际应用中，要考虑各种情况，本次例子中只讲了最简单的情况
			
			//得到绝对路径
			String realpath= session.getServletContext().getRealPath("upload")+"/"+newName;
			//保存
			img.transferTo(new File(realpath));
			
			//将路径保存到user对象中
			user.setPothe(newName);
		}
		
		this.ticketService.save(user);
		return "redirect:findUsers";
	}
	

	@ResponseBody
	@RequestMapping("findUsers")
	public List<Users> selectUsers() {
		List<Users> list=this.ticketService.UsersSearch();
		return list;
	}
	
}
