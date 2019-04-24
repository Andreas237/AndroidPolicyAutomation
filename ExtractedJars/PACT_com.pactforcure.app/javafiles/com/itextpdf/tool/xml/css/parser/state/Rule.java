// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser.state;

import com.itextpdf.tool.xml.css.parser.CssStateController;
import com.itextpdf.tool.xml.css.parser.State;

public class Rule
	implements State
{

	public Rule(CssStateController cssstatecontroller)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		openParenthesesCount = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int openParenthesesCount>
		controller = cssstatecontroller;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field CssStateController controller>
	//    8   14:return          
	}

	public void process(char c)
	{
		if('}' == c && isCss3AtRule)
	//*   0    0:bipush          125
	//*   1    2:iload_1         
	//*   2    3:icmpne          43
	//*   3    6:aload_0         
	//*   4    7:getfield        #26  <Field boolean isCss3AtRule>
	//*   5   10:ifeq            43
		{
			openParenthesesCount = openParenthesesCount - 1;
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field int openParenthesesCount>
	//    9   18:iconst_1        
	//   10   19:isub            
	//   11   20:putfield        #19  <Field int openParenthesesCount>
			if(openParenthesesCount == 0)
	//*  12   23:aload_0         
	//*  13   24:getfield        #19  <Field int openParenthesesCount>
	//*  14   27:ifne            42
			{
				controller.stateUnknown();
	//   15   30:aload_0         
	//   16   31:getfield        #21  <Field CssStateController controller>
	//   17   34:invokevirtual   #31  <Method void CssStateController.stateUnknown()>
				isCss3AtRule = false;
	//   18   37:aload_0         
	//   19   38:iconst_0        
	//   20   39:putfield        #26  <Field boolean isCss3AtRule>
			}
		} else
	//*  21   42:return          
		{
			if(';' == c && !isCss3AtRule)
	//*  22   43:bipush          59
	//*  23   45:iload_1         
	//*  24   46:icmpne          64
	//*  25   49:aload_0         
	//*  26   50:getfield        #26  <Field boolean isCss3AtRule>
	//*  27   53:ifne            64
			{
				controller.stateUnknown();
	//   28   56:aload_0         
	//   29   57:getfield        #21  <Field CssStateController controller>
	//   30   60:invokevirtual   #31  <Method void CssStateController.stateUnknown()>
				return;
	//   31   63:return          
			}
			if('{' == c)
	//*  32   64:bipush          123
	//*  33   66:iload_1         
	//*  34   67:icmpne          42
			{
				openParenthesesCount = openParenthesesCount + 1;
	//   35   70:aload_0         
	//   36   71:aload_0         
	//   37   72:getfield        #19  <Field int openParenthesesCount>
	//   38   75:iconst_1        
	//   39   76:iadd            
	//   40   77:putfield        #19  <Field int openParenthesesCount>
				isCss3AtRule = true;
	//   41   80:aload_0         
	//   42   81:iconst_1        
	//   43   82:putfield        #26  <Field boolean isCss3AtRule>
				return;
	//   44   85:return          
			}
		}
	}

	private final CssStateController controller;
	private boolean isCss3AtRule;
	private int openParenthesesCount;
}
