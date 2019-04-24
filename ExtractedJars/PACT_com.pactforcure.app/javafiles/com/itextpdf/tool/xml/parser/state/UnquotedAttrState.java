// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class UnquotedAttrState
	implements State
{

	public UnquotedAttrState(XMLParser xmlparser)
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
		if(Character.isWhitespace(c))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #24  <Method boolean Character.isWhitespace(char)>
	//*   2    4:ifeq            43
		{
			parser.memory().putCurrentAttrValue(parser.bufferToString());
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field XMLParser parser>
	//    5   11:invokevirtual   #30  <Method XMLParserMemory XMLParser.memory()>
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field XMLParser parser>
	//    8   18:invokevirtual   #34  <Method String XMLParser.bufferToString()>
	//    9   21:invokevirtual   #40  <Method void XMLParserMemory.putCurrentAttrValue(String)>
			parser.flush();
	//   10   24:aload_0         
	//   11   25:getfield        #15  <Field XMLParser parser>
	//   12   28:invokevirtual   #43  <Method void XMLParser.flush()>
			parser.selectState().tagAttributes();
	//   13   31:aload_0         
	//   14   32:getfield        #15  <Field XMLParser parser>
	//   15   35:invokevirtual   #47  <Method StateController XMLParser.selectState()>
	//   16   38:invokevirtual   #53  <Method XMLParser StateController.tagAttributes()>
	//   17   41:pop             
			return;
	//   18   42:return          
		}
		if(c == '>')
	//*  19   43:iload_1         
	//*  20   44:bipush          62
	//*  21   46:icmpne          85
		{
			parser.memory().putCurrentAttrValue(parser.bufferToString());
	//   22   49:aload_0         
	//   23   50:getfield        #15  <Field XMLParser parser>
	//   24   53:invokevirtual   #30  <Method XMLParserMemory XMLParser.memory()>
	//   25   56:aload_0         
	//   26   57:getfield        #15  <Field XMLParser parser>
	//   27   60:invokevirtual   #34  <Method String XMLParser.bufferToString()>
	//   28   63:invokevirtual   #40  <Method void XMLParserMemory.putCurrentAttrValue(String)>
			parser.startElement();
	//   29   66:aload_0         
	//   30   67:getfield        #15  <Field XMLParser parser>
	//   31   70:invokevirtual   #56  <Method void XMLParser.startElement()>
			parser.selectState().inTag();
	//   32   73:aload_0         
	//   33   74:getfield        #15  <Field XMLParser parser>
	//   34   77:invokevirtual   #47  <Method StateController XMLParser.selectState()>
	//   35   80:invokevirtual   #59  <Method XMLParser StateController.inTag()>
	//   36   83:pop             
			return;
	//   37   84:return          
		}
		if(c == '/')
	//*  38   85:iload_1         
	//*  39   86:bipush          47
	//*  40   88:icmpne          127
		{
			parser.memory().putCurrentAttrValue(parser.bufferToString());
	//   41   91:aload_0         
	//   42   92:getfield        #15  <Field XMLParser parser>
	//   43   95:invokevirtual   #30  <Method XMLParserMemory XMLParser.memory()>
	//   44   98:aload_0         
	//   45   99:getfield        #15  <Field XMLParser parser>
	//   46  102:invokevirtual   #34  <Method String XMLParser.bufferToString()>
	//   47  105:invokevirtual   #40  <Method void XMLParserMemory.putCurrentAttrValue(String)>
			parser.flush();
	//   48  108:aload_0         
	//   49  109:getfield        #15  <Field XMLParser parser>
	//   50  112:invokevirtual   #43  <Method void XMLParser.flush()>
			parser.selectState().selfClosing();
	//   51  115:aload_0         
	//   52  116:getfield        #15  <Field XMLParser parser>
	//   53  119:invokevirtual   #47  <Method StateController XMLParser.selectState()>
	//   54  122:invokevirtual   #62  <Method XMLParser StateController.selfClosing()>
	//   55  125:pop             
			return;
	//   56  126:return          
		} else
		{
			parser.append(c);
	//   57  127:aload_0         
	//   58  128:getfield        #15  <Field XMLParser parser>
	//   59  131:iload_1         
	//   60  132:invokevirtual   #66  <Method XMLParser XMLParser.append(char)>
	//   61  135:pop             
			return;
	//   62  136:return          
		}
	}

	private final XMLParser parser;
}
