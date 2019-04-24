// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class CdataState
	implements State
{

	public CdataState(XMLParser xmlparser)
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
		if(c == '>' && "]]".equals(((Object) (parser.memory().comment().toString()))))
	//*   0    0:iload_1         
	//*   1    1:bipush          62
	//*   2    3:icmpne          97
	//*   3    6:ldc1            #20  <String "]]">
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field XMLParser parser>
	//*   6   12:invokevirtual   #26  <Method XMLParserMemory XMLParser.memory()>
	//*   7   15:invokevirtual   #32  <Method StringBuilder XMLParserMemory.comment()>
	//*   8   18:invokevirtual   #38  <Method String StringBuilder.toString()>
	//*   9   21:invokevirtual   #44  <Method boolean String.equals(Object)>
	//*  10   24:ifeq            97
		{
			parser.memory().comment().setLength(0);
	//   11   27:aload_0         
	//   12   28:getfield        #15  <Field XMLParser parser>
	//   13   31:invokevirtual   #26  <Method XMLParserMemory XMLParser.memory()>
	//   14   34:invokevirtual   #32  <Method StringBuilder XMLParserMemory.comment()>
	//   15   37:iconst_0        
	//   16   38:invokevirtual   #48  <Method void StringBuilder.setLength(int)>
			parser.text((new StringBuilder()).append("<![CDATA[").append(parser.bufferToString()).append("]]>").toString());
	//   17   41:aload_0         
	//   18   42:getfield        #15  <Field XMLParser parser>
	//   19   45:new             #34  <Class StringBuilder>
	//   20   48:dup             
	//   21   49:invokespecial   #49  <Method void StringBuilder()>
	//   22   52:ldc1            #51  <String "<![CDATA[">
	//   23   54:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   24   57:aload_0         
	//   25   58:getfield        #15  <Field XMLParser parser>
	//   26   61:invokevirtual   #58  <Method String XMLParser.bufferToString()>
	//   27   64:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   28   67:ldc1            #60  <String "]]>">
	//   29   69:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   30   72:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   31   75:invokevirtual   #64  <Method void XMLParser.text(String)>
			parser.flush();
	//   32   78:aload_0         
	//   33   79:getfield        #15  <Field XMLParser parser>
	//   34   82:invokevirtual   #67  <Method void XMLParser.flush()>
			parser.selectState().inTag();
	//   35   85:aload_0         
	//   36   86:getfield        #15  <Field XMLParser parser>
	//   37   89:invokevirtual   #71  <Method StateController XMLParser.selectState()>
	//   38   92:invokevirtual   #77  <Method XMLParser StateController.inTag()>
	//   39   95:pop             
			return;
	//   40   96:return          
		}
		if(c == ']')
	//*  41   97:iload_1         
	//*  42   98:bipush          93
	//*  43  100:icmpne          119
		{
			parser.memory().comment().append(c);
	//   44  103:aload_0         
	//   45  104:getfield        #15  <Field XMLParser parser>
	//   46  107:invokevirtual   #26  <Method XMLParserMemory XMLParser.memory()>
	//   47  110:invokevirtual   #32  <Method StringBuilder XMLParserMemory.comment()>
	//   48  113:iload_1         
	//   49  114:invokevirtual   #80  <Method StringBuilder StringBuilder.append(char)>
	//   50  117:pop             
			return;
	//   51  118:return          
		} else
		{
			parser.append(c);
	//   52  119:aload_0         
	//   53  120:getfield        #15  <Field XMLParser parser>
	//   54  123:iload_1         
	//   55  124:invokevirtual   #83  <Method XMLParser XMLParser.append(char)>
	//   56  127:pop             
			parser.memory().comment().setLength(0);
	//   57  128:aload_0         
	//   58  129:getfield        #15  <Field XMLParser parser>
	//   59  132:invokevirtual   #26  <Method XMLParserMemory XMLParser.memory()>
	//   60  135:invokevirtual   #32  <Method StringBuilder XMLParserMemory.comment()>
	//   61  138:iconst_0        
	//   62  139:invokevirtual   #48  <Method void StringBuilder.setLength(int)>
			return;
	//   63  142:return          
		}
	}

	private final XMLParser parser;
}
