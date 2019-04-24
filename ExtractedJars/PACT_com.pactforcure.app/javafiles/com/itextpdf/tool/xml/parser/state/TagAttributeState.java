// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class TagAttributeState
	implements State
{

	public TagAttributeState(XMLParser xmlparser)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		parser = xmlparser;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field XMLParser parser>
	//    5    9:return          
	}

	protected void checkAttributeWithNoValue()
	{
		if(setAttribute())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method boolean setAttribute()>
	//*   2    4:ifeq            19
			parser.memory().putCurrentAttrValue("");
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field XMLParser parser>
	//    5   11:invokevirtual   #27  <Method XMLParserMemory XMLParser.memory()>
	//    6   14:ldc1            #29  <String "">
	//    7   16:invokevirtual   #35  <Method void XMLParserMemory.putCurrentAttrValue(String)>
	//    8   19:return          
	}

	public void process(char c)
	{
		if(c == '/')
	//*   0    0:iload_1         
	//*   1    1:bipush          47
	//*   2    3:icmpne          18
		{
			parser.selectState().selfClosing();
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #41  <Method StateController XMLParser.selectState()>
	//    6   13:invokevirtual   #47  <Method XMLParser StateController.selfClosing()>
	//    7   16:pop             
			return;
	//    8   17:return          
		}
		if(c == '=')
	//*   9   18:iload_1         
	//*  10   19:bipush          61
	//*  11   21:icmpne          60
		{
			parser.memory().currentAttr(parser.bufferToString());
	//   12   24:aload_0         
	//   13   25:getfield        #15  <Field XMLParser parser>
	//   14   28:invokevirtual   #27  <Method XMLParserMemory XMLParser.memory()>
	//   15   31:aload_0         
	//   16   32:getfield        #15  <Field XMLParser parser>
	//   17   35:invokevirtual   #51  <Method String XMLParser.bufferToString()>
	//   18   38:invokevirtual   #54  <Method void XMLParserMemory.currentAttr(String)>
			parser.flush();
	//   19   41:aload_0         
	//   20   42:getfield        #15  <Field XMLParser parser>
	//   21   45:invokevirtual   #57  <Method void XMLParser.flush()>
			parser.selectState().attributeValue();
	//   22   48:aload_0         
	//   23   49:getfield        #15  <Field XMLParser parser>
	//   24   52:invokevirtual   #41  <Method StateController XMLParser.selectState()>
	//   25   55:invokevirtual   #60  <Method XMLParser StateController.attributeValue()>
	//   26   58:pop             
			return;
	//   27   59:return          
		}
		if(Character.isWhitespace(c))
	//*  28   60:iload_1         
	//*  29   61:invokestatic    #66  <Method boolean Character.isWhitespace(char)>
	//*  30   64:ifeq            73
		{
			setAttribute();
	//   31   67:aload_0         
	//   32   68:invokevirtual   #21  <Method boolean setAttribute()>
	//   33   71:pop             
			return;
	//   34   72:return          
		}
		if(c == '>')
	//*  35   73:iload_1         
	//*  36   74:bipush          62
	//*  37   76:icmpne          109
		{
			checkAttributeWithNoValue();
	//   38   79:aload_0         
	//   39   80:invokevirtual   #68  <Method void checkAttributeWithNoValue()>
			parser.startElement();
	//   40   83:aload_0         
	//   41   84:getfield        #15  <Field XMLParser parser>
	//   42   87:invokevirtual   #71  <Method void XMLParser.startElement()>
			parser.flush();
	//   43   90:aload_0         
	//   44   91:getfield        #15  <Field XMLParser parser>
	//   45   94:invokevirtual   #57  <Method void XMLParser.flush()>
			parser.selectState().inTag();
	//   46   97:aload_0         
	//   47   98:getfield        #15  <Field XMLParser parser>
	//   48  101:invokevirtual   #41  <Method StateController XMLParser.selectState()>
	//   49  104:invokevirtual   #74  <Method XMLParser StateController.inTag()>
	//   50  107:pop             
			return;
	//   51  108:return          
		}
		if(parser.memory().hasCurrentAttribute() && !Character.isWhitespace(c))
	//*  52  109:aload_0         
	//*  53  110:getfield        #15  <Field XMLParser parser>
	//*  54  113:invokevirtual   #27  <Method XMLParserMemory XMLParser.memory()>
	//*  55  116:invokevirtual   #77  <Method boolean XMLParserMemory.hasCurrentAttribute()>
	//*  56  119:ifeq            151
	//*  57  122:iload_1         
	//*  58  123:invokestatic    #66  <Method boolean Character.isWhitespace(char)>
	//*  59  126:ifne            151
		{
			parser.memory().putCurrentAttrValue("");
	//   60  129:aload_0         
	//   61  130:getfield        #15  <Field XMLParser parser>
	//   62  133:invokevirtual   #27  <Method XMLParserMemory XMLParser.memory()>
	//   63  136:ldc1            #29  <String "">
	//   64  138:invokevirtual   #35  <Method void XMLParserMemory.putCurrentAttrValue(String)>
			parser.append(c);
	//   65  141:aload_0         
	//   66  142:getfield        #15  <Field XMLParser parser>
	//   67  145:iload_1         
	//   68  146:invokevirtual   #81  <Method XMLParser XMLParser.append(char)>
	//   69  149:pop             
			return;
	//   70  150:return          
		} else
		{
			parser.append(c);
	//   71  151:aload_0         
	//   72  152:getfield        #15  <Field XMLParser parser>
	//   73  155:iload_1         
	//   74  156:invokevirtual   #81  <Method XMLParser XMLParser.append(char)>
	//   75  159:pop             
			return;
	//   76  160:return          
		}
	}

	protected boolean setAttribute()
	{
		String s = parser.bufferToString();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field XMLParser parser>
	//    2    4:invokevirtual   #51  <Method String XMLParser.bufferToString()>
	//    3    7:astore_1        
		if(s.length() > 0)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #87  <Method int String.length()>
	//*   6   12:ifle            35
		{
			parser.memory().currentAttr(s);
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field XMLParser parser>
	//    9   19:invokevirtual   #27  <Method XMLParserMemory XMLParser.memory()>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #54  <Method void XMLParserMemory.currentAttr(String)>
			parser.flush();
	//   12   26:aload_0         
	//   13   27:getfield        #15  <Field XMLParser parser>
	//   14   30:invokevirtual   #57  <Method void XMLParser.flush()>
			return true;
	//   15   33:iconst_1        
	//   16   34:ireturn         
		} else
		{
			return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
		}
	}

	protected final XMLParser parser;
}
