// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser.state;

import com.itextpdf.tool.xml.css.parser.CssStateController;
import com.itextpdf.tool.xml.css.parser.State;

public class CommentEnd
	implements State
{

	public CommentEnd(CssStateController cssstatecontroller)
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
		if('/' == c)
	//*   0    0:bipush          47
	//*   1    2:iload_1         
	//*   2    3:icmpne          14
		{
			controller.previous();
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field CssStateController controller>
	//    5   10:invokevirtual   #23  <Method void CssStateController.previous()>
			return;
	//    6   13:return          
		} else
		{
			controller.stateCommentInside();
	//    7   14:aload_0         
	//    8   15:getfield        #15  <Field CssStateController controller>
	//    9   18:invokevirtual   #26  <Method void CssStateController.stateCommentInside()>
			return;
	//   10   21:return          
		}
	}

	private final CssStateController controller;
}
