// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser.state;

import com.itextpdf.tool.xml.css.parser.CssStateController;
import com.itextpdf.tool.xml.css.parser.State;

public class Unknown
	implements State
{

	public Unknown(CssStateController cssstatecontroller)
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
			controller.stateCommentStart();
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field CssStateController controller>
	//    5   10:invokevirtual   #23  <Method void CssStateController.stateCommentStart()>
			return;
	//    6   13:return          
		}
		if('{' == c)
	//*   7   14:bipush          123
	//*   8   16:iload_1         
	//*   9   17:icmpne          35
		{
			controller.storeSelector();
	//   10   20:aload_0         
	//   11   21:getfield        #15  <Field CssStateController controller>
	//   12   24:invokevirtual   #26  <Method void CssStateController.storeSelector()>
			controller.stateProperties();
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field CssStateController controller>
	//   15   31:invokevirtual   #29  <Method void CssStateController.stateProperties()>
			return;
	//   16   34:return          
		}
		if('@' == c)
	//*  17   35:bipush          64
	//*  18   37:iload_1         
	//*  19   38:icmpne          49
		{
			controller.stateRule();
	//   20   41:aload_0         
	//   21   42:getfield        #15  <Field CssStateController controller>
	//   22   45:invokevirtual   #32  <Method void CssStateController.stateRule()>
			return;
	//   23   48:return          
		} else
		{
			controller.append(c);
	//   24   49:aload_0         
	//   25   50:getfield        #15  <Field CssStateController controller>
	//   26   53:iload_1         
	//   27   54:invokevirtual   #35  <Method void CssStateController.append(char)>
			return;
	//   28   57:return          
		}
	}

	private final CssStateController controller;
}
