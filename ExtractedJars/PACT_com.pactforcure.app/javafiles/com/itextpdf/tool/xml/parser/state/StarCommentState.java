// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class StarCommentState
	implements State
{

	public StarCommentState(XMLParser xmlparser)
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
		if(c == '*')
	//*   0    0:iload_1         
	//*   1    1:bipush          42
	//*   2    3:icmpne          33
		{
			parser.memory().comment().append(c);
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//    6   13:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//    7   16:iload_1         
	//    8   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(char)>
	//    9   20:pop             
			parser.selectState().closeStarComment();
	//   10   21:aload_0         
	//   11   22:getfield        #15  <Field XMLParser parser>
	//   12   25:invokevirtual   #40  <Method StateController XMLParser.selectState()>
	//   13   28:invokevirtual   #46  <Method XMLParser StateController.closeStarComment()>
	//   14   31:pop             
			return;
	//   15   32:return          
		} else
		{
			parser.append(c);
	//   16   33:aload_0         
	//   17   34:getfield        #15  <Field XMLParser parser>
	//   18   37:iload_1         
	//   19   38:invokevirtual   #49  <Method XMLParser XMLParser.append(char)>
	//   20   41:pop             
			return;
	//   21   42:return          
		}
	}

	private final XMLParser parser;
}
