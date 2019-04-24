// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class UnknownState
	implements State
{

	public UnknownState(XMLParser xmlparser)
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
		if(c == '<')
	//*   0    0:iload_1         
	//*   1    1:bipush          60
	//*   2    3:icmpne          32
		{
			parser.unknownData();
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #23  <Method void XMLParser.unknownData()>
			parser.flush();
	//    6   13:aload_0         
	//    7   14:getfield        #15  <Field XMLParser parser>
	//    8   17:invokevirtual   #26  <Method void XMLParser.flush()>
			parser.selectState().tagEncountered();
	//    9   20:aload_0         
	//   10   21:getfield        #15  <Field XMLParser parser>
	//   11   24:invokevirtual   #30  <Method StateController XMLParser.selectState()>
	//   12   27:invokevirtual   #36  <Method XMLParser StateController.tagEncountered()>
	//   13   30:pop             
			return;
	//   14   31:return          
		} else
		{
			parser.append(c);
	//   15   32:aload_0         
	//   16   33:getfield        #15  <Field XMLParser parser>
	//   17   36:iload_1         
	//   18   37:invokevirtual   #40  <Method XMLParser XMLParser.append(char)>
	//   19   40:pop             
			return;
	//   20   41:return          
		}
	}

	private final XMLParser parser;
}
