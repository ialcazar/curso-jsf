package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

public class MiLabel extends TagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5138047572167587857L;
	private String name;

	@Override
	public int doAfterBody() throws JspException {
		
		return super.doAfterBody();
	}

	@Override
	public int doEndTag() throws JspException {
		
		try {
			pageContext.getOut().print("</div>");
		} catch (IOException ex) {
			throw new JspTagException("SimpleTag: " + ex.getMessage(),ex);
		}
		
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().print("<div>"+this.name);
		} catch (IOException ex) {
			throw new JspTagException("SimpleTag: " + ex.getMessage(),ex);
		}
		return  EVAL_BODY_INCLUDE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 

}
