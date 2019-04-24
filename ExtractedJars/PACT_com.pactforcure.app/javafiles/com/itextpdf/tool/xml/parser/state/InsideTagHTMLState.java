// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;
import java.util.ArrayList;
import java.util.List;

public class InsideTagHTMLState
	implements State
{

	public InsideTagHTMLState(XMLParser xmlparser)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #22  <Method void ArrayList(int)>
	//    7   13:putfield        #24  <Field List noSanitize>
	//    8   16:aload_0         
	//    9   17:new             #19  <Class ArrayList>
	//   10   20:dup             
	//   11   21:bipush          9
	//   12   23:invokespecial   #22  <Method void ArrayList(int)>
	//   13   26:putfield        #26  <Field List ignoreLastChars>
		parser = xmlparser;
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:putfield        #28  <Field XMLParser parser>
		noSanitize.add("pre");
	//   17   34:aload_0         
	//   18   35:getfield        #24  <Field List noSanitize>
	//   19   38:ldc1            #30  <String "pre">
	//   20   40:invokeinterface #36  <Method boolean List.add(Object)>
	//   21   45:pop             
		ignoreLastChars.add("p");
	//   22   46:aload_0         
	//   23   47:getfield        #26  <Field List ignoreLastChars>
	//   24   50:ldc1            #38  <String "p">
	//   25   52:invokeinterface #36  <Method boolean List.add(Object)>
	//   26   57:pop             
		ignoreLastChars.add("div");
	//   27   58:aload_0         
	//   28   59:getfield        #26  <Field List ignoreLastChars>
	//   29   62:ldc1            #40  <String "div">
	//   30   64:invokeinterface #36  <Method boolean List.add(Object)>
	//   31   69:pop             
		ignoreLastChars.add("h1");
	//   32   70:aload_0         
	//   33   71:getfield        #26  <Field List ignoreLastChars>
	//   34   74:ldc1            #42  <String "h1">
	//   35   76:invokeinterface #36  <Method boolean List.add(Object)>
	//   36   81:pop             
		ignoreLastChars.add("h2");
	//   37   82:aload_0         
	//   38   83:getfield        #26  <Field List ignoreLastChars>
	//   39   86:ldc1            #44  <String "h2">
	//   40   88:invokeinterface #36  <Method boolean List.add(Object)>
	//   41   93:pop             
		ignoreLastChars.add("h3");
	//   42   94:aload_0         
	//   43   95:getfield        #26  <Field List ignoreLastChars>
	//   44   98:ldc1            #46  <String "h3">
	//   45  100:invokeinterface #36  <Method boolean List.add(Object)>
	//   46  105:pop             
		ignoreLastChars.add("h4");
	//   47  106:aload_0         
	//   48  107:getfield        #26  <Field List ignoreLastChars>
	//   49  110:ldc1            #48  <String "h4">
	//   50  112:invokeinterface #36  <Method boolean List.add(Object)>
	//   51  117:pop             
		ignoreLastChars.add("h5");
	//   52  118:aload_0         
	//   53  119:getfield        #26  <Field List ignoreLastChars>
	//   54  122:ldc1            #50  <String "h5">
	//   55  124:invokeinterface #36  <Method boolean List.add(Object)>
	//   56  129:pop             
		ignoreLastChars.add("h6");
	//   57  130:aload_0         
	//   58  131:getfield        #26  <Field List ignoreLastChars>
	//   59  134:ldc1            #52  <String "h6">
	//   60  136:invokeinterface #36  <Method boolean List.add(Object)>
	//   61  141:pop             
		ignoreLastChars.add("td");
	//   62  142:aload_0         
	//   63  143:getfield        #26  <Field List ignoreLastChars>
	//   64  146:ldc1            #54  <String "td">
	//   65  148:invokeinterface #36  <Method boolean List.add(Object)>
	//   66  153:pop             
		ignoreLastChars.add("th");
	//   67  154:aload_0         
	//   68  155:getfield        #26  <Field List ignoreLastChars>
	//   69  158:ldc1            #56  <String "th">
	//   70  160:invokeinterface #36  <Method boolean List.add(Object)>
	//   71  165:pop             
		ignoreLastChars.add("ul");
	//   72  166:aload_0         
	//   73  167:getfield        #26  <Field List ignoreLastChars>
	//   74  170:ldc1            #58  <String "ul">
	//   75  172:invokeinterface #36  <Method boolean List.add(Object)>
	//   76  177:pop             
		ignoreLastChars.add("ol");
	//   77  178:aload_0         
	//   78  179:getfield        #26  <Field List ignoreLastChars>
	//   79  182:ldc1            #60  <String "ol">
	//   80  184:invokeinterface #36  <Method boolean List.add(Object)>
	//   81  189:pop             
		ignoreLastChars.add("li");
	//   82  190:aload_0         
	//   83  191:getfield        #26  <Field List ignoreLastChars>
	//   84  194:ldc1            #62  <String "li">
	//   85  196:invokeinterface #36  <Method boolean List.add(Object)>
	//   86  201:pop             
		ignoreLastChars.add("dd");
	//   87  202:aload_0         
	//   88  203:getfield        #26  <Field List ignoreLastChars>
	//   89  206:ldc1            #64  <String "dd">
	//   90  208:invokeinterface #36  <Method boolean List.add(Object)>
	//   91  213:pop             
		ignoreLastChars.add("dt");
	//   92  214:aload_0         
	//   93  215:getfield        #26  <Field List ignoreLastChars>
	//   94  218:ldc1            #66  <String "dt">
	//   95  220:invokeinterface #36  <Method boolean List.add(Object)>
	//   96  225:pop             
		ignoreLastChars.add("hr");
	//   97  226:aload_0         
	//   98  227:getfield        #26  <Field List ignoreLastChars>
	//   99  230:ldc1            #68  <String "hr">
	//  100  232:invokeinterface #36  <Method boolean List.add(Object)>
	//  101  237:pop             
		ignoreLastChars.add("br");
	//  102  238:aload_0         
	//  103  239:getfield        #26  <Field List ignoreLastChars>
	//  104  242:ldc1            #70  <String "br">
	//  105  244:invokeinterface #36  <Method boolean List.add(Object)>
	//  106  249:pop             
	//  107  250:return          
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
	//*   4    7:getfield        #28  <Field XMLParser parser>
	//*   5   10:invokevirtual   #79  <Method int XMLParser.bufferSize()>
	//*   6   13:ifle            30
				parser.text(parser.current());
	//    7   16:aload_0         
	//    8   17:getfield        #28  <Field XMLParser parser>
	//    9   20:aload_0         
	//   10   21:getfield        #28  <Field XMLParser parser>
	//   11   24:invokevirtual   #83  <Method String XMLParser.current()>
	//   12   27:invokevirtual   #87  <Method void XMLParser.text(String)>
			parser.flush();
	//   13   30:aload_0         
	//   14   31:getfield        #28  <Field XMLParser parser>
	//   15   34:invokevirtual   #90  <Method void XMLParser.flush()>
			parser.selectState().tagEncountered();
	//   16   37:aload_0         
	//   17   38:getfield        #28  <Field XMLParser parser>
	//   18   41:invokevirtual   #94  <Method StateController XMLParser.selectState()>
	//   19   44:invokevirtual   #100 <Method XMLParser StateController.tagEncountered()>
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
	//   26   56:getfield        #28  <Field XMLParser parser>
	//   27   59:invokevirtual   #94  <Method StateController XMLParser.selectState()>
	//   28   62:invokevirtual   #103 <Method XMLParser StateController.specialChar()>
	//   29   65:pop             
			return;
	//   30   66:return          
		}
		if(c == '*' && parser.memory().lastChar() == '/')
	//*  31   67:iload_1         
	//*  32   68:bipush          42
	//*  33   70:icmpne          163
	//*  34   73:aload_0         
	//*  35   74:getfield        #28  <Field XMLParser parser>
	//*  36   77:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//*  37   80:invokevirtual   #113 <Method char XMLParserMemory.lastChar()>
	//*  38   83:bipush          47
	//*  39   85:icmpne          163
		{
			parser.selectState().starComment();
	//   40   88:aload_0         
	//   41   89:getfield        #28  <Field XMLParser parser>
	//   42   92:invokevirtual   #94  <Method StateController XMLParser.selectState()>
	//   43   95:invokevirtual   #116 <Method XMLParser StateController.starComment()>
	//   44   98:pop             
			parser.memory().current().deleteCharAt(parser.memory().current().lastIndexOf("/"));
	//   45   99:aload_0         
	//   46  100:getfield        #28  <Field XMLParser parser>
	//   47  103:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//   48  106:invokevirtual   #119 <Method StringBuilder XMLParserMemory.current()>
	//   49  109:aload_0         
	//   50  110:getfield        #28  <Field XMLParser parser>
	//   51  113:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//   52  116:invokevirtual   #119 <Method StringBuilder XMLParserMemory.current()>
	//   53  119:ldc1            #121 <String "/">
	//   54  121:invokevirtual   #127 <Method int StringBuilder.lastIndexOf(String)>
	//   55  124:invokevirtual   #131 <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//   56  127:pop             
			if(parser.bufferSize() > 0)
	//*  57  128:aload_0         
	//*  58  129:getfield        #28  <Field XMLParser parser>
	//*  59  132:invokevirtual   #79  <Method int XMLParser.bufferSize()>
	//*  60  135:ifle            155
				parser.memory().setStoredString(parser.current());
	//   61  138:aload_0         
	//   62  139:getfield        #28  <Field XMLParser parser>
	//   63  142:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//   64  145:aload_0         
	//   65  146:getfield        #28  <Field XMLParser parser>
	//   66  149:invokevirtual   #83  <Method String XMLParser.current()>
	//   67  152:invokevirtual   #134 <Method void XMLParserMemory.setStoredString(String)>
			parser.flush();
	//   68  155:aload_0         
	//   69  156:getfield        #28  <Field XMLParser parser>
	//   70  159:invokevirtual   #90  <Method void XMLParser.flush()>
			return;
	//   71  162:return          
		}
		String s = parser.currentTag();
	//   72  163:aload_0         
	//   73  164:getfield        #28  <Field XMLParser parser>
	//   74  167:invokevirtual   #137 <Method String XMLParser.currentTag()>
	//   75  170:astore          4
		TagState tagstate = parser.currentTagState();
	//   76  172:aload_0         
	//   77  173:getfield        #28  <Field XMLParser parser>
	//   78  176:invokevirtual   #141 <Method TagState XMLParser.currentTagState()>
	//   79  179:astore          5
		if(noSanitize.contains(((Object) (s))) && TagState.OPEN == tagstate)
	//*  80  181:aload_0         
	//*  81  182:getfield        #24  <Field List noSanitize>
	//*  82  185:aload           4
	//*  83  187:invokeinterface #144 <Method boolean List.contains(Object)>
	//*  84  192:ifeq            213
	//*  85  195:getstatic       #150 <Field TagState TagState.OPEN>
	//*  86  198:aload           5
	//*  87  200:if_acmpne       213
		{
			parser.append(c);
	//   88  203:aload_0         
	//   89  204:getfield        #28  <Field XMLParser parser>
	//   90  207:iload_1         
	//   91  208:invokevirtual   #154 <Method XMLParser XMLParser.append(char)>
	//   92  211:pop             
			return;
	//   93  212:return          
		}
		if(parser.memory().whitespaceTag().length() != 0)
	//*  94  213:aload_0         
	//*  95  214:getfield        #28  <Field XMLParser parser>
	//*  96  217:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//*  97  220:invokevirtual   #157 <Method String XMLParserMemory.whitespaceTag()>
	//*  98  223:invokevirtual   #162 <Method int String.length()>
	//*  99  226:ifeq            278
		{
			if(ignoreLastChars.contains(((Object) (parser.memory().whitespaceTag().toLowerCase()))))
	//* 100  229:aload_0         
	//* 101  230:getfield        #26  <Field List ignoreLastChars>
	//* 102  233:aload_0         
	//* 103  234:getfield        #28  <Field XMLParser parser>
	//* 104  237:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//* 105  240:invokevirtual   #157 <Method String XMLParserMemory.whitespaceTag()>
	//* 106  243:invokevirtual   #165 <Method String String.toLowerCase()>
	//* 107  246:invokeinterface #144 <Method boolean List.contains(Object)>
	//* 108  251:ifeq            266
				parser.memory().lastChar(' ');
	//  109  254:aload_0         
	//  110  255:getfield        #28  <Field XMLParser parser>
	//  111  258:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//  112  261:bipush          32
	//  113  263:invokevirtual   #167 <Method void XMLParserMemory.lastChar(char)>
			parser.memory().whitespaceTag("");
	//  114  266:aload_0         
	//  115  267:getfield        #28  <Field XMLParser parser>
	//  116  270:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//  117  273:ldc1            #169 <String "">
	//  118  275:invokevirtual   #171 <Method void XMLParserMemory.whitespaceTag(String)>
		}
		boolean flag1 = Character.isWhitespace(parser.memory().lastChar());
	//  119  278:aload_0         
	//  120  279:getfield        #28  <Field XMLParser parser>
	//  121  282:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//  122  285:invokevirtual   #113 <Method char XMLParserMemory.lastChar()>
	//  123  288:invokestatic    #177 <Method boolean Character.isWhitespace(char)>
	//  124  291:istore_3        
		boolean flag;
		if(!Character.isWhitespace(c))
	//* 125  292:iload_1         
	//* 126  293:invokestatic    #177 <Method boolean Character.isWhitespace(char)>
	//* 127  296:ifne            338
			flag = true;
	//  128  299:iconst_1        
	//  129  300:istore_2        
		else
	//* 130  301:iload_3         
	//* 131  302:ifeq            313
	//* 132  305:iload_3         
	//* 133  306:ifeq            326
	//* 134  309:iload_2         
	//* 135  310:ifeq            326
	//* 136  313:iload_2         
	//* 137  314:ifeq            343
	//* 138  317:aload_0         
	//* 139  318:getfield        #28  <Field XMLParser parser>
	//* 140  321:iload_1         
	//* 141  322:invokevirtual   #154 <Method XMLParser XMLParser.append(char)>
	//* 142  325:pop             
	//* 143  326:aload_0         
	//* 144  327:getfield        #28  <Field XMLParser parser>
	//* 145  330:invokevirtual   #107 <Method XMLParserMemory XMLParser.memory()>
	//* 146  333:iload_1         
	//* 147  334:invokevirtual   #167 <Method void XMLParserMemory.lastChar(char)>
	//* 148  337:return          
			flag = false;
	//  149  338:iconst_0        
	//  150  339:istore_2        
		if(!flag1 || flag1 && flag)
			if(flag)
				parser.append(c);
			else
	//* 151  340:goto            301
				parser.append(' ');
	//  152  343:aload_0         
	//  153  344:getfield        #28  <Field XMLParser parser>
	//  154  347:bipush          32
	//  155  349:invokevirtual   #154 <Method XMLParser XMLParser.append(char)>
	//  156  352:pop             
		parser.memory().lastChar(c);
	//* 157  353:goto            326
	}

	private final List ignoreLastChars = new ArrayList(9);
	private final List noSanitize = new ArrayList(1);
	private final XMLParser parser;
}
