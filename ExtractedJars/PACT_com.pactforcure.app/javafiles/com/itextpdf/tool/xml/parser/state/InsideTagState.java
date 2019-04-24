// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class InsideTagState
	implements State
{

	public InsideTagState(XMLParser xmlparser)
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
	//*   2    3:icmpne          49
		{
			if(parser.bufferSize() > 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #15  <Field XMLParser parser>
	//*   5   10:invokevirtual   #24  <Method int XMLParser.bufferSize()>
	//*   6   13:ifle            30
				parser.text(parser.current());
	//    7   16:aload_0         
	//    8   17:getfield        #15  <Field XMLParser parser>
	//    9   20:aload_0         
	//   10   21:getfield        #15  <Field XMLParser parser>
	//   11   24:invokevirtual   #28  <Method String XMLParser.current()>
	//   12   27:invokevirtual   #32  <Method void XMLParser.text(String)>
			parser.flush();
	//   13   30:aload_0         
	//   14   31:getfield        #15  <Field XMLParser parser>
	//   15   34:invokevirtual   #35  <Method void XMLParser.flush()>
			parser.selectState().tagEncountered();
	//   16   37:aload_0         
	//   17   38:getfield        #15  <Field XMLParser parser>
	//   18   41:invokevirtual   #39  <Method StateController XMLParser.selectState()>
	//   19   44:invokevirtual   #45  <Method XMLParser StateController.tagEncountered()>
	//   20   47:pop             
			return;
	//   21   48:return          
		}
		if(c == '&')
	//*  22   49:iload_1         
	//*  23   50:bipush          38
	//*  24   52:icmpne          67
		{
			parser.selectState().specialChar();
	//   25   55:aload_0         
	//   26   56:getfield        #15  <Field XMLParser parser>
	//   27   59:invokevirtual   #39  <Method StateController XMLParser.selectState()>
	//   28   62:invokevirtual   #48  <Method XMLParser StateController.specialChar()>
	//   29   65:pop             
			return;
	//   30   66:return          
		} else
		{
			parser.append(c);
	//   31   67:aload_0         
	//   32   68:getfield        #15  <Field XMLParser parser>
	//   33   71:iload_1         
	//   34   72:invokevirtual   #52  <Method XMLParser XMLParser.append(char)>
	//   35   75:pop             
			return;
	//   36   76:return          
		}
	}

	private final XMLParser parser;
}
