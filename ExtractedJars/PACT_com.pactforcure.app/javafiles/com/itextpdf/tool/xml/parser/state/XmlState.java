// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class XmlState
	implements State
{

	public XmlState(XMLParser xmlparser)
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
	//*   2    3:icmpne          24
		{
			parser.endElement();
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #23  <Method void XMLParser.endElement()>
			parser.selectState().unknown();
	//    6   13:aload_0         
	//    7   14:getfield        #15  <Field XMLParser parser>
	//    8   17:invokevirtual   #27  <Method StateController XMLParser.selectState()>
	//    9   20:invokevirtual   #33  <Method XMLParser StateController.unknown()>
	//   10   23:pop             
		}
	//   11   24:return          
	}

	private final XMLParser parser;
}
