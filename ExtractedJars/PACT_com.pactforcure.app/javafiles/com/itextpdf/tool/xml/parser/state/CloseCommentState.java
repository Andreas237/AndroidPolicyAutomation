// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class CloseCommentState
	implements State
{

	public CloseCommentState(XMLParser xmlparser)
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
		if(c == '-')
	//*   0    0:iload_1         
	//*   1    1:bipush          45
	//*   2    3:icmpne          23
		{
			parser.memory().comment().append('-');
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field XMLParser parser>
	//    5   10:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//    6   13:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//    7   16:bipush          45
	//    8   18:invokevirtual   #36  <Method StringBuilder StringBuilder.append(char)>
	//    9   21:pop             
			return;
	//   10   22:return          
		}
		if(c == '>' && parser.memory().comment().length() == 2)
	//*  11   23:iload_1         
	//*  12   24:bipush          62
	//*  13   26:icmpne          86
	//*  14   29:aload_0         
	//*  15   30:getfield        #15  <Field XMLParser parser>
	//*  16   33:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//*  17   36:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//*  18   39:invokevirtual   #40  <Method int StringBuilder.length()>
	//*  19   42:iconst_2        
	//*  20   43:icmpne          86
		{
			parser.memory().comment().setLength(0);
	//   21   46:aload_0         
	//   22   47:getfield        #15  <Field XMLParser parser>
	//   23   50:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   24   53:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//   25   56:iconst_0        
	//   26   57:invokevirtual   #44  <Method void StringBuilder.setLength(int)>
			parser.comment();
	//   27   60:aload_0         
	//   28   61:getfield        #15  <Field XMLParser parser>
	//   29   64:invokevirtual   #46  <Method void XMLParser.comment()>
			parser.flush();
	//   30   67:aload_0         
	//   31   68:getfield        #15  <Field XMLParser parser>
	//   32   71:invokevirtual   #49  <Method void XMLParser.flush()>
			parser.selectState().inTag();
	//   33   74:aload_0         
	//   34   75:getfield        #15  <Field XMLParser parser>
	//   35   78:invokevirtual   #53  <Method StateController XMLParser.selectState()>
	//   36   81:invokevirtual   #59  <Method XMLParser StateController.inTag()>
	//   37   84:pop             
			return;
	//   38   85:return          
		} else
		{
			parser.append(parser.memory().comment().toString());
	//   39   86:aload_0         
	//   40   87:getfield        #15  <Field XMLParser parser>
	//   41   90:aload_0         
	//   42   91:getfield        #15  <Field XMLParser parser>
	//   43   94:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   44   97:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//   45  100:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   46  103:invokevirtual   #66  <Method XMLParser XMLParser.append(String)>
	//   47  106:pop             
			parser.memory().comment().setLength(0);
	//   48  107:aload_0         
	//   49  108:getfield        #15  <Field XMLParser parser>
	//   50  111:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   51  114:invokevirtual   #30  <Method StringBuilder XMLParserMemory.comment()>
	//   52  117:iconst_0        
	//   53  118:invokevirtual   #44  <Method void StringBuilder.setLength(int)>
			parser.selectState().comment();
	//   54  121:aload_0         
	//   55  122:getfield        #15  <Field XMLParser parser>
	//   56  125:invokevirtual   #53  <Method StateController XMLParser.selectState()>
	//   57  128:invokevirtual   #68  <Method XMLParser StateController.comment()>
	//   58  131:pop             
			return;
	//   59  132:return          
		}
	}

	private final XMLParser parser;
}
