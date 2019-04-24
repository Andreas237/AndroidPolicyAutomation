// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

public class TagEncounteredState
	implements State
{

	public TagEncounteredState(XMLParser xmlparser)
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
		String s;
		s = parser.bufferToString();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field XMLParser parser>
	//    2    4:invokevirtual   #24  <Method String XMLParser.bufferToString()>
	//    3    7:astore_2        
		if(!Character.isWhitespace(c) && c != '>' && c != '/' && c != ':' && c != '?' && !s.equals("!--") && (!s.equals("![CDATA") || c != '['))
			break MISSING_BLOCK_LABEL_406;
	//    4    8:iload_1         
	//    5    9:invokestatic    #30  <Method boolean Character.isWhitespace(char)>
	//    6   12:ifne            63
	//    7   15:iload_1         
	//    8   16:bipush          62
	//    9   18:icmpeq          63
	//   10   21:iload_1         
	//   11   22:bipush          47
	//   12   24:icmpeq          63
	//   13   27:iload_1         
	//   14   28:bipush          58
	//   15   30:icmpeq          63
	//   16   33:iload_1         
	//   17   34:bipush          63
	//   18   36:icmpeq          63
	//   19   39:aload_2         
	//   20   40:ldc1            #32  <String "!--">
	//   21   42:invokevirtual   #38  <Method boolean String.equals(Object)>
	//   22   45:ifne            63
	//   23   48:aload_2         
	//   24   49:ldc1            #40  <String "![CDATA">
	//   25   51:invokevirtual   #38  <Method boolean String.equals(Object)>
	//   26   54:ifeq            406
	//   27   57:iload_1         
	//   28   58:bipush          91
	//   29   60:icmpne          406
		if(s.length() <= 0) goto _L2; else goto _L1
	//   30   63:aload_2         
	//   31   64:invokevirtual   #44  <Method int String.length()>
	//   32   67:ifle            361
_L1:
		if(!s.equals("!--")) goto _L4; else goto _L3
	//   33   70:aload_2         
	//   34   71:ldc1            #32  <String "!--">
	//   35   73:invokevirtual   #38  <Method boolean String.equals(Object)>
	//   36   76:ifeq            143
_L3:
		parser.flush();
	//   37   79:aload_0         
	//   38   80:getfield        #15  <Field XMLParser parser>
	//   39   83:invokevirtual   #47  <Method void XMLParser.flush()>
		parser.memory().comment().setLength(0);
	//   40   86:aload_0         
	//   41   87:getfield        #15  <Field XMLParser parser>
	//   42   90:invokevirtual   #51  <Method XMLParserMemory XMLParser.memory()>
	//   43   93:invokevirtual   #57  <Method StringBuilder XMLParserMemory.comment()>
	//   44   96:iconst_0        
	//   45   97:invokevirtual   #63  <Method void StringBuilder.setLength(int)>
		parser.selectState().comment();
	//   46  100:aload_0         
	//   47  101:getfield        #15  <Field XMLParser parser>
	//   48  104:invokevirtual   #67  <Method StateController XMLParser.selectState()>
	//   49  107:invokevirtual   #72  <Method XMLParser StateController.comment()>
	//   50  110:pop             
		if(c == '-') goto _L6; else goto _L5
	//   51  111:iload_1         
	//   52  112:bipush          45
	//   53  114:icmpeq          127
_L5:
		parser.append(c);
	//   54  117:aload_0         
	//   55  118:getfield        #15  <Field XMLParser parser>
	//   56  121:iload_1         
	//   57  122:invokevirtual   #76  <Method XMLParser XMLParser.append(char)>
	//   58  125:pop             
_L8:
		return;
	//   59  126:return          
_L6:
		parser.memory().comment().append(c);
	//   60  127:aload_0         
	//   61  128:getfield        #15  <Field XMLParser parser>
	//   62  131:invokevirtual   #51  <Method XMLParserMemory XMLParser.memory()>
	//   63  134:invokevirtual   #57  <Method StringBuilder XMLParserMemory.comment()>
	//   64  137:iload_1         
	//   65  138:invokevirtual   #79  <Method StringBuilder StringBuilder.append(char)>
	//   66  141:pop             
		return;
	//   67  142:return          
_L4:
		if(s.equals("![CDATA") && c == '[')
	//*  68  143:aload_2         
	//*  69  144:ldc1            #40  <String "![CDATA">
	//*  70  146:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*  71  149:ifeq            177
	//*  72  152:iload_1         
	//*  73  153:bipush          91
	//*  74  155:icmpne          177
		{
			parser.flush();
	//   75  158:aload_0         
	//   76  159:getfield        #15  <Field XMLParser parser>
	//   77  162:invokevirtual   #47  <Method void XMLParser.flush()>
			parser.selectState().cdata();
	//   78  165:aload_0         
	//   79  166:getfield        #15  <Field XMLParser parser>
	//   80  169:invokevirtual   #67  <Method StateController XMLParser.selectState()>
	//   81  172:invokevirtual   #82  <Method XMLParser StateController.cdata()>
	//   82  175:pop             
			return;
	//   83  176:return          
		}
		if(s.equals("!DOCTYPE"))
	//*  84  177:aload_2         
	//*  85  178:ldc1            #84  <String "!DOCTYPE">
	//*  86  180:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*  87  183:ifeq            214
		{
			parser.flush();
	//   88  186:aload_0         
	//   89  187:getfield        #15  <Field XMLParser parser>
	//   90  190:invokevirtual   #47  <Method void XMLParser.flush()>
			parser.selectState().doctype();
	//   91  193:aload_0         
	//   92  194:getfield        #15  <Field XMLParser parser>
	//   93  197:invokevirtual   #67  <Method StateController XMLParser.selectState()>
	//   94  200:invokevirtual   #87  <Method XMLParser StateController.doctype()>
	//   95  203:pop             
			parser.append(c);
	//   96  204:aload_0         
	//   97  205:getfield        #15  <Field XMLParser parser>
	//   98  208:iload_1         
	//   99  209:invokevirtual   #76  <Method XMLParser XMLParser.append(char)>
	//  100  212:pop             
			return;
	//  101  213:return          
		}
		if(Character.isWhitespace(c))
	//* 102  214:iload_1         
	//* 103  215:invokestatic    #30  <Method boolean Character.isWhitespace(char)>
	//* 104  218:ifeq            257
		{
			parser.memory().currentTag(parser.bufferToString());
	//  105  221:aload_0         
	//  106  222:getfield        #15  <Field XMLParser parser>
	//  107  225:invokevirtual   #51  <Method XMLParserMemory XMLParser.memory()>
	//  108  228:aload_0         
	//  109  229:getfield        #15  <Field XMLParser parser>
	//  110  232:invokevirtual   #24  <Method String XMLParser.bufferToString()>
	//  111  235:invokevirtual   #91  <Method void XMLParserMemory.currentTag(String)>
			parser.flush();
	//  112  238:aload_0         
	//  113  239:getfield        #15  <Field XMLParser parser>
	//  114  242:invokevirtual   #47  <Method void XMLParser.flush()>
			parser.selectState().tagAttributes();
	//  115  245:aload_0         
	//  116  246:getfield        #15  <Field XMLParser parser>
	//  117  249:invokevirtual   #67  <Method StateController XMLParser.selectState()>
	//  118  252:invokevirtual   #94  <Method XMLParser StateController.tagAttributes()>
	//  119  255:pop             
			return;
	//  120  256:return          
		}
		if(c == '>')
	//* 121  257:iload_1         
	//* 122  258:bipush          62
	//* 123  260:icmpne          300
		{
			parser.memory().currentTag(s);
	//  124  263:aload_0         
	//  125  264:getfield        #15  <Field XMLParser parser>
	//  126  267:invokevirtual   #51  <Method XMLParserMemory XMLParser.memory()>
	//  127  270:aload_2         
	//  128  271:invokevirtual   #91  <Method void XMLParserMemory.currentTag(String)>
			parser.flush();
	//  129  274:aload_0         
	//  130  275:getfield        #15  <Field XMLParser parser>
	//  131  278:invokevirtual   #47  <Method void XMLParser.flush()>
			parser.startElement();
	//  132  281:aload_0         
	//  133  282:getfield        #15  <Field XMLParser parser>
	//  134  285:invokevirtual   #97  <Method void XMLParser.startElement()>
			parser.selectState().inTag();
	//  135  288:aload_0         
	//  136  289:getfield        #15  <Field XMLParser parser>
	//  137  292:invokevirtual   #67  <Method StateController XMLParser.selectState()>
	//  138  295:invokevirtual   #100 <Method XMLParser StateController.inTag()>
	//  139  298:pop             
			return;
	//  140  299:return          
		}
		if(c == '/')
	//* 141  300:iload_1         
	//* 142  301:bipush          47
	//* 143  303:icmpne          336
		{
			parser.memory().currentTag(s);
	//  144  306:aload_0         
	//  145  307:getfield        #15  <Field XMLParser parser>
	//  146  310:invokevirtual   #51  <Method XMLParserMemory XMLParser.memory()>
	//  147  313:aload_2         
	//  148  314:invokevirtual   #91  <Method void XMLParserMemory.currentTag(String)>
			parser.flush();
	//  149  317:aload_0         
	//  150  318:getfield        #15  <Field XMLParser parser>
	//  151  321:invokevirtual   #47  <Method void XMLParser.flush()>
			parser.selectState().selfClosing();
	//  152  324:aload_0         
	//  153  325:getfield        #15  <Field XMLParser parser>
	//  154  328:invokevirtual   #67  <Method StateController XMLParser.selectState()>
	//  155  331:invokevirtual   #103 <Method XMLParser StateController.selfClosing()>
	//  156  334:pop             
			return;
	//  157  335:return          
		}
		if(c != ':') goto _L8; else goto _L7
	//  158  336:iload_1         
	//  159  337:bipush          58
	//  160  339:icmpne          126
_L7:
		parser.memory().namespace(s);
	//  161  342:aload_0         
	//  162  343:getfield        #15  <Field XMLParser parser>
	//  163  346:invokevirtual   #51  <Method XMLParserMemory XMLParser.memory()>
	//  164  349:aload_2         
	//  165  350:invokevirtual   #106 <Method void XMLParserMemory.namespace(String)>
		parser.flush();
	//  166  353:aload_0         
	//  167  354:getfield        #15  <Field XMLParser parser>
	//  168  357:invokevirtual   #47  <Method void XMLParser.flush()>
		return;
	//  169  360:return          
_L2:
		if(c == '/')
	//* 170  361:iload_1         
	//* 171  362:bipush          47
	//* 172  364:icmpne          379
		{
			parser.selectState().closingTag();
	//  173  367:aload_0         
	//  174  368:getfield        #15  <Field XMLParser parser>
	//  175  371:invokevirtual   #67  <Method StateController XMLParser.selectState()>
	//  176  374:invokevirtual   #109 <Method XMLParser StateController.closingTag()>
	//  177  377:pop             
			return;
	//  178  378:return          
		}
		if(c != '?') goto _L8; else goto _L9
	//  179  379:iload_1         
	//  180  380:bipush          63
	//  181  382:icmpne          126
_L9:
		parser.append(c);
	//  182  385:aload_0         
	//  183  386:getfield        #15  <Field XMLParser parser>
	//  184  389:iload_1         
	//  185  390:invokevirtual   #76  <Method XMLParser XMLParser.append(char)>
	//  186  393:pop             
		parser.selectState().processingInstructions();
	//  187  394:aload_0         
	//  188  395:getfield        #15  <Field XMLParser parser>
	//  189  398:invokevirtual   #67  <Method StateController XMLParser.selectState()>
	//  190  401:invokevirtual   #112 <Method XMLParser StateController.processingInstructions()>
	//  191  404:pop             
		return;
	//  192  405:return          
		parser.append(c);
	//  193  406:aload_0         
	//  194  407:getfield        #15  <Field XMLParser parser>
	//  195  410:iload_1         
	//  196  411:invokevirtual   #76  <Method XMLParser XMLParser.append(char)>
	//  197  414:pop             
		return;
	//  198  415:return          
	}

	private final XMLParser parser;
}
