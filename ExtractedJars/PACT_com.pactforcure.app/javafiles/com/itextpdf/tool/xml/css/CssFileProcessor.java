// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.css.parser.CssStateController;
import com.itextpdf.tool.xml.net.ReadingProcessor;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssFileImpl, CssFile

public class CssFileProcessor
	implements ReadingProcessor
{

	public CssFileProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class CssFileImpl>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void CssFileImpl()>
	//    6   12:putfield        #19  <Field CssFile css>
		controller = new CssStateController(css);
	//    7   15:aload_0         
	//    8   16:new             #21  <Class CssStateController>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field CssFile css>
	//   12   24:invokespecial   #24  <Method void CssStateController(CssFile)>
	//   13   27:putfield        #26  <Field CssStateController controller>
	//   14   30:return          
	}

	public CssFile getCss()
	{
		return css;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CssFile css>
	//    2    4:areturn         
	}

	public void process(int i)
	{
		controller.process((char)i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CssStateController controller>
	//    2    4:iload_1         
	//    3    5:int2char        
	//    4    6:invokevirtual   #34  <Method void CssStateController.process(char)>
	//    5    9:return          
	}

	private final CssStateController controller;
	private final CssFile css = new CssFileImpl();
}
