package org.pratap.aqjmsrp.controller;

import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.pratap.aqjmsrp.service.MfManager;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ProducerController implements Controller
{
	private MfManager mfManager;
	protected final Log logger= LogFactory.getLog(getClass()); 
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("ProductController call...");
		
		
		
		Enumeration mfDetails=request.getAttributeNames();
		HashMap<String, String> mfValue= new HashMap<String, String>();
		while(mfDetails.hasMoreElements()){
			String mfData = (String) mfDetails.nextElement();
			mfValue.put(mfData,(String) request.getAttribute(mfData));
		}
		
		return new ModelAndView("endpage");
	}
	
	public MfManager getMfManager() {
		return mfManager;
	}

	public void setMfManager(MfManager mfManager) {
		this.mfManager = mfManager;
	}

}
