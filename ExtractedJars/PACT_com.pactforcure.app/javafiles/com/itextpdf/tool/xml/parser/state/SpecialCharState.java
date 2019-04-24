// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.text.xml.simpleparser.EntitiesToUnicode;
import com.itextpdf.tool.xml.parser.*;

public class SpecialCharState
	implements State
{

	public SpecialCharState(XMLParser xmlparser)
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
		StringBuilder stringbuilder = parser.memory().currentEntity();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field XMLParser parser>
	//    2    4:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//    3    7:invokevirtual   #30  <Method StringBuilder XMLParserMemory.currentEntity()>
	//    4   10:astore_2        
		if(c == ';')
	//*   5   11:iload_1         
	//*   6   12:bipush          59
	//*   7   14:icmpne          115
		{
			c = EntitiesToUnicode.decodeEntity(stringbuilder.toString());
	//    8   17:aload_2         
	//    9   18:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   10   21:invokestatic    #42  <Method char EntitiesToUnicode.decodeEntity(String)>
	//   11   24:istore_1        
			if(c == 0)
	//*  12   25:iload_1         
	//*  13   26:ifne            89
			{
				parser.append('&').append(stringbuilder.toString()).append(';');
	//   14   29:aload_0         
	//   15   30:getfield        #15  <Field XMLParser parser>
	//   16   33:bipush          38
	//   17   35:invokevirtual   #46  <Method XMLParser XMLParser.append(char)>
	//   18   38:aload_2         
	//   19   39:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   20   42:invokevirtual   #49  <Method XMLParser XMLParser.append(String)>
	//   21   45:bipush          59
	//   22   47:invokevirtual   #46  <Method XMLParser XMLParser.append(char)>
	//   23   50:pop             
				parser.memory().lastChar(';');
	//   24   51:aload_0         
	//   25   52:getfield        #15  <Field XMLParser parser>
	//   26   55:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   27   58:bipush          59
	//   28   60:invokevirtual   #52  <Method void XMLParserMemory.lastChar(char)>
			} else
	//*  29   63:aload_0         
	//*  30   64:getfield        #15  <Field XMLParser parser>
	//*  31   67:invokevirtual   #56  <Method StateController XMLParser.selectState()>
	//*  32   70:invokevirtual   #62  <Method XMLParser StateController.previousState()>
	//*  33   73:pop             
	//*  34   74:aload_0         
	//*  35   75:getfield        #15  <Field XMLParser parser>
	//*  36   78:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//*  37   81:invokevirtual   #30  <Method StringBuilder XMLParserMemory.currentEntity()>
	//*  38   84:iconst_0        
	//*  39   85:invokevirtual   #66  <Method void StringBuilder.setLength(int)>
	//*  40   88:return          
			{
				parser.append(Character.toString(c));
	//   41   89:aload_0         
	//   42   90:getfield        #15  <Field XMLParser parser>
	//   43   93:iload_1         
	//   44   94:invokestatic    #71  <Method String Character.toString(char)>
	//   45   97:invokevirtual   #49  <Method XMLParser XMLParser.append(String)>
	//   46  100:pop             
				parser.memory().lastChar(c);
	//   47  101:aload_0         
	//   48  102:getfield        #15  <Field XMLParser parser>
	//   49  105:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   50  108:iload_1         
	//   51  109:invokevirtual   #52  <Method void XMLParserMemory.lastChar(char)>
			}
			parser.selectState().previousState();
			parser.memory().currentEntity().setLength(0);
			return;
		}
	//*  52  112:goto            63
		if(c != '#' && (c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') || stringbuilder.length() >= 7)
	//*  53  115:iload_1         
	//*  54  116:bipush          35
	//*  55  118:icmpeq          157
	//*  56  121:iload_1         
	//*  57  122:bipush          48
	//*  58  124:icmplt          133
	//*  59  127:iload_1         
	//*  60  128:bipush          57
	//*  61  130:icmple          157
	//*  62  133:iload_1         
	//*  63  134:bipush          97
	//*  64  136:icmplt          145
	//*  65  139:iload_1         
	//*  66  140:bipush          122
	//*  67  142:icmple          157
	//*  68  145:iload_1         
	//*  69  146:bipush          65
	//*  70  148:icmplt          166
	//*  71  151:iload_1         
	//*  72  152:bipush          90
	//*  73  154:icmpgt          166
	//*  74  157:aload_2         
	//*  75  158:invokevirtual   #75  <Method int StringBuilder.length()>
	//*  76  161:bipush          7
	//*  77  163:icmplt          213
		{
			parser.append('&').append(stringbuilder.toString()).append(c);
	//   78  166:aload_0         
	//   79  167:getfield        #15  <Field XMLParser parser>
	//   80  170:bipush          38
	//   81  172:invokevirtual   #46  <Method XMLParser XMLParser.append(char)>
	//   82  175:aload_2         
	//   83  176:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   84  179:invokevirtual   #49  <Method XMLParser XMLParser.append(String)>
	//   85  182:iload_1         
	//   86  183:invokevirtual   #46  <Method XMLParser XMLParser.append(char)>
	//   87  186:pop             
			parser.selectState().previousState();
	//   88  187:aload_0         
	//   89  188:getfield        #15  <Field XMLParser parser>
	//   90  191:invokevirtual   #56  <Method StateController XMLParser.selectState()>
	//   91  194:invokevirtual   #62  <Method XMLParser StateController.previousState()>
	//   92  197:pop             
			parser.memory().currentEntity().setLength(0);
	//   93  198:aload_0         
	//   94  199:getfield        #15  <Field XMLParser parser>
	//   95  202:invokevirtual   #24  <Method XMLParserMemory XMLParser.memory()>
	//   96  205:invokevirtual   #30  <Method StringBuilder XMLParserMemory.currentEntity()>
	//   97  208:iconst_0        
	//   98  209:invokevirtual   #66  <Method void StringBuilder.setLength(int)>
			return;
	//   99  212:return          
		} else
		{
			stringbuilder.append(c);
	//  100  213:aload_2         
	//  101  214:iload_1         
	//  102  215:invokevirtual   #78  <Method StringBuilder StringBuilder.append(char)>
	//  103  218:pop             
			return;
	//  104  219:return          
		}
	}

	private final XMLParser parser;
}
