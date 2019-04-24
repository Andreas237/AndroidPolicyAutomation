// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class DocTypeState
	implements State
{

	public DocTypeState(XMLParser xmlparser)
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
	//*   2    3:icmpne          17
			parser.selectState().unknown();
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #24  <Method StateController XMLParser.selectState()>
	//    6   13:invokevirtual   #30  <Method XMLParser StateController.unknown()>
	//    7   16:pop             
	//    8   17:return          
	}

	private final XMLParser parser;
}
