// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class SelfClosingTagState
	implements State
{

	public SelfClosingTagState(XMLParser xmlparser)
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
		if(c == '>')
	//*   0    0:iload_1         
	//*   1    1:bipush          62
	//*   2    3:icmpne          48
		{
			parser.startElement();
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #23  <Method void XMLParser.startElement()>
			parser.endElement();
	//    6   13:aload_0         
	//    7   14:getfield        #15  <Field XMLParser parser>
	//    8   17:invokevirtual   #26  <Method void XMLParser.endElement()>
			parser.flush();
	//    9   20:aload_0         
	//   10   21:getfield        #15  <Field XMLParser parser>
	//   11   24:invokevirtual   #29  <Method void XMLParser.flush()>
			parser.memory().flushNameSpace();
	//   12   27:aload_0         
	//   13   28:getfield        #15  <Field XMLParser parser>
	//   14   31:invokevirtual   #33  <Method XMLParserMemory XMLParser.memory()>
	//   15   34:invokevirtual   #38  <Method void XMLParserMemory.flushNameSpace()>
			parser.selectState().inTag();
	//   16   37:aload_0         
	//   17   38:getfield        #15  <Field XMLParser parser>
	//   18   41:invokevirtual   #42  <Method StateController XMLParser.selectState()>
	//   19   44:invokevirtual   #48  <Method XMLParser StateController.inTag()>
	//   20   47:pop             
		}
	//   21   48:return          
	}

	private final XMLParser parser;
}
