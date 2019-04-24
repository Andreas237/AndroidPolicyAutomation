// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class DoubleQuotedAttrValueState
	implements State
{

	public DoubleQuotedAttrValueState(XMLParser xmlparser)
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
		if(c == '"')
	//*   0    0:iload_1         
	//*   1    1:bipush          34
	//*   2    3:icmpne          42
		{
			parser.memory().putCurrentAttrValue(parser.bufferToString());
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//    6   13:aload_0         
	//    7   14:getfield        #15  <Field XMLParser parser>
	//    8   17:invokevirtual   #28  <Method String XMLParser.bufferToString()>
	//    9   20:invokevirtual   #34  <Method void XMLParserMemory.putCurrentAttrValue(String)>
			parser.flush();
	//   10   23:aload_0         
	//   11   24:getfield        #15  <Field XMLParser parser>
	//   12   27:invokevirtual   #37  <Method void XMLParser.flush()>
			parser.selectState().tagAttributes();
	//   13   30:aload_0         
	//   14   31:getfield        #15  <Field XMLParser parser>
	//   15   34:invokevirtual   #41  <Method StateController XMLParser.selectState()>
	//   16   37:invokevirtual   #47  <Method XMLParser StateController.tagAttributes()>
	//   17   40:pop             
			return;
	//   18   41:return          
		}
		if(c == '&')
	//*  19   42:iload_1         
	//*  20   43:bipush          38
	//*  21   45:icmpne          60
		{
			parser.selectState().specialChar();
	//   22   48:aload_0         
	//   23   49:getfield        #15  <Field XMLParser parser>
	//   24   52:invokevirtual   #41  <Method StateController XMLParser.selectState()>
	//   25   55:invokevirtual   #50  <Method XMLParser StateController.specialChar()>
	//   26   58:pop             
			return;
	//   27   59:return          
		} else
		{
			parser.append(c);
	//   28   60:aload_0         
	//   29   61:getfield        #15  <Field XMLParser parser>
	//   30   64:iload_1         
	//   31   65:invokevirtual   #54  <Method XMLParser XMLParser.append(char)>
	//   32   68:pop             
			return;
	//   33   69:return          
		}
	}

	private final XMLParser parser;
}
