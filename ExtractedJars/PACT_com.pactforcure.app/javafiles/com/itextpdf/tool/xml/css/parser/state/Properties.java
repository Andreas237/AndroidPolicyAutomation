// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser.state;

import com.itextpdf.tool.xml.css.parser.CssStateController;
import com.itextpdf.tool.xml.css.parser.State;

public class Properties
	implements State
{

	public Properties(CssStateController cssstatecontroller)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		controller = cssstatecontroller;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field CssStateController controller>
	//    5    9:return          
	}

	public void process(char c)
	{
		if('}' == c)
	//*   0    0:bipush          125
	//*   1    2:iload_1         
	//*   2    3:icmpne          21
		{
			controller.storeProperties();
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field CssStateController controller>
	//    5   10:invokevirtual   #23  <Method void CssStateController.storeProperties()>
			controller.stateUnknown();
	//    6   13:aload_0         
	//    7   14:getfield        #15  <Field CssStateController controller>
	//    8   17:invokevirtual   #26  <Method void CssStateController.stateUnknown()>
			return;
	//    9   20:return          
		}
		if('/' == c)
	//*  10   21:bipush          47
	//*  11   23:iload_1         
	//*  12   24:icmpne          35
		{
			controller.stateCommentStart();
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field CssStateController controller>
	//   15   31:invokevirtual   #29  <Method void CssStateController.stateCommentStart()>
			return;
	//   16   34:return          
		} else
		{
			controller.append(c);
	//   17   35:aload_0         
	//   18   36:getfield        #15  <Field CssStateController controller>
	//   19   39:iload_1         
	//   20   40:invokevirtual   #32  <Method void CssStateController.append(char)>
			return;
	//   21   43:return          
		}
	}

	private final CssStateController controller;
}
