// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class CloseStarCommentState
	implements State
{

	public CloseStarCommentState(XMLParser xmlparser)
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
		if(c == '*')
	//*   0    0:iload_1         
	//*   1    1:bipush          42
	//*   2    3:icmpne          22
		{
			parser.memory().comment().append(c);
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//    6   13:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//    7   16:iload_1         
	//    8   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(char)>
	//    9   20:pop             
			return;
	//   10   21:return          
		}
		if(c == '/')
	//*  11   22:iload_1         
	//*  12   23:bipush          47
	//*  13   25:icmpne          86
		{
			parser.memory().comment().setLength(0);
	//   14   28:aload_0         
	//   15   29:getfield        #15  <Field XMLParser parser>
	//   16   32:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   17   35:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//   18   38:iconst_0        
	//   19   39:invokevirtual   #40  <Method void StringBuilder.setLength(int)>
			parser.comment();
	//   20   42:aload_0         
	//   21   43:getfield        #15  <Field XMLParser parser>
	//   22   46:invokevirtual   #42  <Method void XMLParser.comment()>
			parser.flush();
	//   23   49:aload_0         
	//   24   50:getfield        #15  <Field XMLParser parser>
	//   25   53:invokevirtual   #45  <Method void XMLParser.flush()>
			parser.append(parser.memory().getStoredString());
	//   26   56:aload_0         
	//   27   57:getfield        #15  <Field XMLParser parser>
	//   28   60:aload_0         
	//   29   61:getfield        #15  <Field XMLParser parser>
	//   30   64:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   31   67:invokevirtual   #49  <Method String XMLParserMemory.getStoredString()>
	//   32   70:invokevirtual   #52  <Method XMLParser XMLParser.append(String)>
	//   33   73:pop             
			parser.selectState().inTag();
	//   34   74:aload_0         
	//   35   75:getfield        #15  <Field XMLParser parser>
	//   36   78:invokevirtual   #56  <Method StateController XMLParser.selectState()>
	//   37   81:invokevirtual   #62  <Method XMLParser StateController.inTag()>
	//   38   84:pop             
			return;
	//   39   85:return          
		} else
		{
			parser.append(parser.memory().comment().toString());
	//   40   86:aload_0         
	//   41   87:getfield        #15  <Field XMLParser parser>
	//   42   90:aload_0         
	//   43   91:getfield        #15  <Field XMLParser parser>
	//   44   94:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   45   97:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//   46  100:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   47  103:invokevirtual   #52  <Method XMLParser XMLParser.append(String)>
	//   48  106:pop             
			parser.memory().comment().setLength(0);
	//   49  107:aload_0         
	//   50  108:getfield        #15  <Field XMLParser parser>
	//   51  111:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   52  114:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//   53  117:iconst_0        
	//   54  118:invokevirtual   #40  <Method void StringBuilder.setLength(int)>
			parser.selectState().starComment();
	//   55  121:aload_0         
	//   56  122:getfield        #15  <Field XMLParser parser>
	//   57  125:invokevirtual   #56  <Method StateController XMLParser.selectState()>
	//   58  128:invokevirtual   #68  <Method XMLParser StateController.starComment()>
	//   59  131:pop             
			return;
	//   60  132:return          
		}
	}

	private final XMLParser parser;
}
