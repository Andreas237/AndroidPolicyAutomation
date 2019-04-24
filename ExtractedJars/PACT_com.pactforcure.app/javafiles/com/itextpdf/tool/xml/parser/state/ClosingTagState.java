// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class ClosingTagState
	implements State
{

	public ClosingTagState(XMLParser xmlparser)
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
	//*   2    3:icmpne          59
		{
			parser.memory().currentTag(parser.bufferToString());
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//    6   13:aload_0         
	//    7   14:getfield        #15  <Field XMLParser parser>
	//    8   17:invokevirtual   #28  <Method String XMLParser.bufferToString()>
	//    9   20:invokevirtual   #34  <Method void XMLParserMemory.currentTag(String)>
			parser.endElement();
	//   10   23:aload_0         
	//   11   24:getfield        #15  <Field XMLParser parser>
	//   12   27:invokevirtual   #37  <Method void XMLParser.endElement()>
			parser.flush();
	//   13   30:aload_0         
	//   14   31:getfield        #15  <Field XMLParser parser>
	//   15   34:invokevirtual   #40  <Method void XMLParser.flush()>
			parser.memory().flushNameSpace();
	//   16   37:aload_0         
	//   17   38:getfield        #15  <Field XMLParser parser>
	//   18   41:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   19   44:invokevirtual   #43  <Method void XMLParserMemory.flushNameSpace()>
			parser.selectState().inTag();
	//   20   47:aload_0         
	//   21   48:getfield        #15  <Field XMLParser parser>
	//   22   51:invokevirtual   #47  <Method StateController XMLParser.selectState()>
	//   23   54:invokevirtual   #53  <Method XMLParser StateController.inTag()>
	//   24   57:pop             
		} else
	//*  25   58:return          
		{
			if(c == ':')
	//*  26   59:iload_1         
	//*  27   60:bipush          58
	//*  28   62:icmpne          90
			{
				parser.memory().namespace(parser.bufferToString());
	//   29   65:aload_0         
	//   30   66:getfield        #15  <Field XMLParser parser>
	//   31   69:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   32   72:aload_0         
	//   33   73:getfield        #15  <Field XMLParser parser>
	//   34   76:invokevirtual   #28  <Method String XMLParser.bufferToString()>
	//   35   79:invokevirtual   #56  <Method void XMLParserMemory.namespace(String)>
				parser.flush();
	//   36   82:aload_0         
	//   37   83:getfield        #15  <Field XMLParser parser>
	//   38   86:invokevirtual   #40  <Method void XMLParser.flush()>
				return;
	//   39   89:return          
			}
			if(!Character.isWhitespace(c))
	//*  40   90:iload_1         
	//*  41   91:invokestatic    #62  <Method boolean Character.isWhitespace(char)>
	//*  42   94:ifne            58
			{
				parser.append(c);
	//   43   97:aload_0         
	//   44   98:getfield        #15  <Field XMLParser parser>
	//   45  101:iload_1         
	//   46  102:invokevirtual   #66  <Method XMLParser XMLParser.append(char)>
	//   47  105:pop             
				return;
	//   48  106:return          
			}
		}
	}

	private final XMLParser parser;
}
