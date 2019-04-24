// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class AttributeValueState
	implements State
{

	public AttributeValueState(XMLParser xmlparser)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		parser = xmlparser;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field XMLParser parser>
	//    5    9:return          
	}

	public void process(char c)
	{
		if(c == '\'')
	//*   0    0:iload_1         
	//*   1    1:bipush          39
	//*   2    3:icmpne          18
		{
			parser.selectState().singleQuotedAttr();
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #24  <Method StateController XMLParser.selectState()>
	//    6   13:invokevirtual   #30  <Method XMLParser StateController.singleQuotedAttr()>
	//    7   16:pop             
		} else
	//*   8   17:return          
		{
			if(c == '"')
	//*   9   18:iload_1         
	//*  10   19:bipush          34
	//*  11   21:icmpne          36
			{
				parser.selectState().doubleQuotedAttr();
	//   12   24:aload_0         
	//   13   25:getfield        #15  <Field XMLParser parser>
	//   14   28:invokevirtual   #24  <Method StateController XMLParser.selectState()>
	//   15   31:invokevirtual   #33  <Method XMLParser StateController.doubleQuotedAttr()>
	//   16   34:pop             
				return;
	//   17   35:return          
			}
			if(!Character.isWhitespace(c))
	//*  18   36:iload_1         
	//*  19   37:invokestatic    #39  <Method boolean Character.isWhitespace(char)>
	//*  20   40:ifne            17
			{
				parser.append(c);
	//   21   43:aload_0         
	//   22   44:getfield        #15  <Field XMLParser parser>
	//   23   47:iload_1         
	//   24   48:invokevirtual   #43  <Method XMLParser XMLParser.append(char)>
	//   25   51:pop             
				parser.selectState().unquotedAttr();
	//   26   52:aload_0         
	//   27   53:getfield        #15  <Field XMLParser parser>
	//   28   56:invokevirtual   #24  <Method StateController XMLParser.selectState()>
	//   29   59:invokevirtual   #46  <Method XMLParser StateController.unquotedAttr()>
	//   30   62:pop             
				return;
	//   31   63:return          
			}
		}
	}

	private final XMLParser parser;
}
