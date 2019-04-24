// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class CommentState
	implements State
{

	public CommentState(XMLParser xmlparser)
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
		if(c == '-')
	//*   0    0:iload_1         
	//*   1    1:bipush          45
	//*   2    3:icmpne          34
		{
			parser.memory().comment().append('-');
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//    6   13:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//    7   16:bipush          45
	//    8   18:invokevirtual   #36  <Method StringBuilder StringBuilder.append(char)>
	//    9   21:pop             
			parser.selectState().closeComment();
	//   10   22:aload_0         
	//   11   23:getfield        #15  <Field XMLParser parser>
	//   12   26:invokevirtual   #40  <Method StateController XMLParser.selectState()>
	//   13   29:invokevirtual   #46  <Method XMLParser StateController.closeComment()>
	//   14   32:pop             
			return;
	//   15   33:return          
		} else
		{
			parser.append(c);
	//   16   34:aload_0         
	//   17   35:getfield        #15  <Field XMLParser parser>
	//   18   38:iload_1         
	//   19   39:invokevirtual   #49  <Method XMLParser XMLParser.append(char)>
	//   20   42:pop             
			return;
	//   21   43:return          
		}
	}

	private final XMLParser parser;
}
