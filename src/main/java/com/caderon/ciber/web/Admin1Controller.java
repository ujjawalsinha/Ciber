package com.caderon.ciber.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.caderon.ciber.dao.Admin1DAO;
import com.caderon.ciber.domain.Admin1;
import com.caderon.ciber.service.Admin1Service;

/**
 * Spring MVC controller that handles CRUD requests for Admin1 entities
 * 
 */

@Controller("Admin1Controller")
public class Admin1Controller {

	/**
	 * DAO injected by Spring that manages Admin1 entities
	 * 
	 */
	@Autowired
	private Admin1DAO admin1DAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Admin1 entities
	 * 
	 */
	@Autowired
	private Admin1Service admin1Service;

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Create a new Admin1 entity
	 * 
	 */
	@RequestMapping("/newAdmin1")
	public ModelAndView newAdmin1() {
		ModelAndView mav = new ModelAndView();

		
		mav.addObject("admin1", new Admin1());
		mav.addObject("newFlag", true);
		//mav.setViewName("admin1/editAdmin1.jsp"); // ujjawal
		
		mav.setViewName("admin1/newsale.jsp"); 

		return mav;
	}

	/**
	 * Delete an existing Admin1 entity
	 * 
	 */
	@RequestMapping("/deleteAdmin1")
	public String deleteAdmin1(@RequestParam Integer idKey) {
		Admin1 admin1 = admin1DAO.findAdmin1ByPrimaryKey(idKey);
		admin1Service.deleteAdmin1(admin1);
	//	return "forward:/indexAdmin1";
		
		return "forward:/adminlist";
	}

	/**
	 * Show all Admin1 entities
	 * 
	 */
	@RequestMapping("/indexAdmin1")
	public ModelAndView listAdmin1s() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("admin1s", admin1Service.loadAdmin1s());

		mav.setViewName("admin1/listAdmin1s.jsp");

		return mav;
	}
	
	/**
	 * after login this is welcome page 
	 * @return
	 */
	@RequestMapping("/welcome")
	public ModelAndView welcomePage() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("admin1s", admin1Service.loadAdmin1s());

		mav.setViewName("admin1/welcome.jsp");

		return mav;
	}
	
	
	@RequestMapping("/adminlist")
	public ModelAndView adminlist() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("admin1s", admin1Service.loadAdmin1s());

		mav.setViewName("admin1/adminlist.jsp");

		return mav;
	}
	
	@RequestMapping("/adminListPage")
	public ModelAndView adminListPage() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("admin1s", admin1Service.loadAdmin1s());

		mav.setViewName("admin1/adminListPage.jsp");

		return mav;
	}
	
	
	
	
	/**
	 * Edit an existing Admin1 entity
	 * 
	 */
	@RequestMapping("/editAdmin1")
	public ModelAndView editAdmin1(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("admin1", admin1DAO.findAdmin1ByPrimaryKey(idKey));
		mav.setViewName("admin1/editAdmin1.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Admin1 entities
	 * 
	 */ 	
	public String indexAdmin1() {
		return "redirect:/indexAdmin1";
	}

	/**
	 * Save an existing Admin1 entity
	 * 
	 */
	@RequestMapping("/saveAdmin1")
	public String saveAdmin1(@ModelAttribute Admin1 admin1) {
		admin1Service.saveAdmin1(admin1);
		return "forward:/adminlist";
		
	}

	/**
	 * Select the Admin1 entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAdmin1")
	public ModelAndView confirmDeleteAdmin1(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("admin1", admin1DAO.findAdmin1ByPrimaryKey(idKey));
		mav.setViewName("admin1/adminListPage.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/admin1Controller/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Admin1 entity
	 * 
	 */
	@RequestMapping("/selectAdmin1")
	public ModelAndView selectAdmin1(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("admin1", admin1DAO.findAdmin1ByPrimaryKey(idKey));
		mav.setViewName("admin1/viewAdmin1.jsp");

		return mav;
	}
	
	 @RequestMapping(value = "/jj", method = RequestMethod.GET)
		@ResponseBody
		public List<Admin1> asdasda(@RequestParam("file") MultipartFile file, @RequestParam("name") String name) {
			return new java.util.ArrayList<Admin1>(admin1Service.loadAdmin1s());
		}
	
	 @RequestMapping(value = "/kk", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String  uploadFile(  @RequestParam("file") MultipartFile file, @RequestParam("name") String name ) {

         try {
             if (!file.isEmpty()) {
                 byte[] bytes = file.getBytes();
                 // store the bytes somewhere
                 return "redirect:uploadSuccess";
             } else {
                 return "redirect:uploadFailure";
             }
         }
         catch (Exception ex)
         {

         }
         return "200";
     }
	 
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
		@ResponseBody
		public List<Admin1> list() {
			return new java.util.ArrayList<Admin1>(admin1Service.loadAdmin1s());
		}
	
	 
	 // for trans search page 
	 @RequestMapping("/tranSearch")
		public ModelAndView tranSearch() {
			ModelAndView mav = new ModelAndView();

			mav.addObject("admin1s", admin1Service.loadAdmin1s());

			mav.setViewName("admin1/tranSearch.jsp");

			return mav;
		}
	 
	// for trans search page 
		 @RequestMapping("/tranList")
			public ModelAndView tranList() {
				ModelAndView mav = new ModelAndView();

				mav.addObject("admin1s", admin1Service.loadAdmin1s());

				mav.setViewName("admin1/tranList.jsp");

				return mav;
			}
		 @RequestMapping("/tranListPage")
			public ModelAndView tranListPage() {
				ModelAndView mav = new ModelAndView();

				mav.addObject("admin1s", admin1Service.loadAdmin1s());

				mav.setViewName("admin1/tranListPage.jsp");

				return mav;
			}
		 @RequestMapping("/AdminList")
			public ModelAndView AdminList() {
				ModelAndView mav = new ModelAndView();
				mav.addObject("admin1s", admin1Service.loadAdmin1s());
				mav.setViewName("Admin/list.jsp");
				return mav;
			}
		 
		 @RequestMapping("/AdminEdit")
			public ModelAndView AdminEdit() {
				ModelAndView mav = new ModelAndView();
				mav.addObject("admin1", new Admin1());
				mav.addObject("newFlag", true);
				mav.setViewName("Admin/edit.jsp");
				return mav;
				
			}
		 
		
		 
		 @RequestMapping("/AdminSave")
			public String AdminSave(@ModelAttribute Admin1 admin1) {
				admin1Service.saveAdmin1(admin1);
				return "forward:/AdminList";
				
			}
		 
		
		 
		 
}