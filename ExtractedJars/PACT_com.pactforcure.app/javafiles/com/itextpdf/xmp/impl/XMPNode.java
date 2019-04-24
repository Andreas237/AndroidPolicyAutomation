// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPException;
import com.itextpdf.xmp.options.PropertyOptions;
import java.util.*;

class XMPNode
	implements Comparable
{

	public XMPNode(String s, PropertyOptions propertyoptions)
	{
		this(s, ((String) (null)), propertyoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #40  <Method void XMPNode(String, String, PropertyOptions)>
	//    5    7:return          
	}

	public XMPNode(String s, String s1, PropertyOptions propertyoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		children = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #44  <Field List children>
		qualifier = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #46  <Field List qualifier>
		options = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #48  <Field PropertyOptions options>
		name = s;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #50  <Field String name>
		value = s1;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #52  <Field String value>
		options = propertyoptions;
	//   17   29:aload_0         
	//   18   30:aload_3         
	//   19   31:putfield        #48  <Field PropertyOptions options>
	//   20   34:return          
	}

	private void assertChildNotExisting(String s)
		throws XMPException
	{
		if(!"[]".equals(((Object) (s))) && findChildByName(s) != null)
	//*   0    0:ldc1            #58  <String "[]">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*   3    6:ifne            52
	//*   4    9:aload_0         
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #68  <Method XMPNode findChildByName(String)>
	//*   7   14:ifnull          52
			throw new XMPException((new StringBuilder()).append("Duplicate property or field node '").append(s).append("'").toString(), 203);
	//    8   17:new             #56  <Class XMPException>
	//    9   20:dup             
	//   10   21:new             #70  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #71  <Method void StringBuilder()>
	//   13   28:ldc1            #73  <String "Duplicate property or field node '">
	//   14   30:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:ldc1            #79  <String "'">
	//   18   39:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   20   45:sipush          203
	//   21   48:invokespecial   #86  <Method void XMPException(String, int)>
	//   22   51:athrow          
		else
			return;
	//   23   52:return          
	}

	private void assertQualifierNotExisting(String s)
		throws XMPException
	{
		if(!"[]".equals(((Object) (s))) && findQualifierByName(s) != null)
	//*   0    0:ldc1            #58  <String "[]">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*   3    6:ifne            52
	//*   4    9:aload_0         
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #91  <Method XMPNode findQualifierByName(String)>
	//*   7   14:ifnull          52
			throw new XMPException((new StringBuilder()).append("Duplicate '").append(s).append("' qualifier").toString(), 203);
	//    8   17:new             #56  <Class XMPException>
	//    9   20:dup             
	//   10   21:new             #70  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #71  <Method void StringBuilder()>
	//   13   28:ldc1            #93  <String "Duplicate '">
	//   14   30:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:ldc1            #95  <String "' qualifier">
	//   18   39:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   20   45:sipush          203
	//   21   48:invokespecial   #86  <Method void XMPException(String, int)>
	//   22   51:athrow          
		else
			return;
	//   23   52:return          
	}

	private void dumpNode(StringBuffer stringbuffer, boolean flag, int i, int j)
	{
		for(int k = 0; k < i; k++)
	//*   0    0:iconst_0        
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:iload_3         
	//*   4    6:icmpge          25
			stringbuffer.append('\t');
	//    5    9:aload_1         
	//    6   10:bipush          9
	//    7   12:invokevirtual   #102 <Method StringBuffer StringBuffer.append(char)>
	//    8   15:pop             

	//    9   16:iload           5
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:istore          5
	//*  13   22:goto            3
		if(parent != null)
	//*  14   25:aload_0         
	//*  15   26:getfield        #104 <Field XMPNode parent>
	//*  16   29:ifnull          297
		{
			if(getOptions().isQualifier())
	//*  17   32:aload_0         
	//*  18   33:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//*  19   36:invokevirtual   #113 <Method boolean PropertyOptions.isQualifier()>
	//*  20   39:ifeq            248
			{
				stringbuffer.append('?');
	//   21   42:aload_1         
	//   22   43:bipush          63
	//   23   45:invokevirtual   #102 <Method StringBuffer StringBuffer.append(char)>
	//   24   48:pop             
				stringbuffer.append(name);
	//   25   49:aload_1         
	//   26   50:aload_0         
	//   27   51:getfield        #50  <Field String name>
	//   28   54:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//   29   57:pop             
			} else
	//*  30   58:aload_0         
	//*  31   59:getfield        #52  <Field String value>
	//*  32   62:ifnull          98
	//*  33   65:aload_0         
	//*  34   66:getfield        #52  <Field String value>
	//*  35   69:invokevirtual   #120 <Method int String.length()>
	//*  36   72:ifle            98
	//*  37   75:aload_1         
	//*  38   76:ldc1            #122 <String " = \"">
	//*  39   78:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//*  40   81:pop             
	//*  41   82:aload_1         
	//*  42   83:aload_0         
	//*  43   84:getfield        #52  <Field String value>
	//*  44   87:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//*  45   90:pop             
	//*  46   91:aload_1         
	//*  47   92:bipush          34
	//*  48   94:invokevirtual   #102 <Method StringBuffer StringBuffer.append(char)>
	//*  49   97:pop             
	//*  50   98:aload_0         
	//*  51   99:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//*  52  102:iconst_m1       
	//*  53  103:invokevirtual   #126 <Method boolean PropertyOptions.containsOneOf(int)>
	//*  54  106:ifeq            154
	//*  55  109:aload_1         
	//*  56  110:ldc1            #128 <String "\t(">
	//*  57  112:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//*  58  115:pop             
	//*  59  116:aload_1         
	//*  60  117:aload_0         
	//*  61  118:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//*  62  121:invokevirtual   #129 <Method String PropertyOptions.toString()>
	//*  63  124:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//*  64  127:pop             
	//*  65  128:aload_1         
	//*  66  129:ldc1            #131 <String " : ">
	//*  67  131:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//*  68  134:pop             
	//*  69  135:aload_1         
	//*  70  136:aload_0         
	//*  71  137:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//*  72  140:invokevirtual   #134 <Method String PropertyOptions.getOptionsString()>
	//*  73  143:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//*  74  146:pop             
	//*  75  147:aload_1         
	//*  76  148:bipush          41
	//*  77  150:invokevirtual   #102 <Method StringBuffer StringBuffer.append(char)>
	//*  78  153:pop             
	//*  79  154:aload_1         
	//*  80  155:bipush          10
	//*  81  157:invokevirtual   #102 <Method StringBuffer StringBuffer.append(char)>
	//*  82  160:pop             
	//*  83  161:iload_2         
	//*  84  162:ifeq            394
	//*  85  165:aload_0         
	//*  86  166:invokevirtual   #137 <Method boolean hasQualifier()>
	//*  87  169:ifeq            394
	//*  88  172:aload_0         
	//*  89  173:invokespecial   #141 <Method List getQualifier()>
	//*  90  176:aload_0         
	//*  91  177:invokevirtual   #144 <Method int getQualifierLength()>
	//*  92  180:anewarray       XMPNode[]
	//*  93  183:invokeinterface #150 <Method Object[] List.toArray(Object[])>
	//*  94  188:checkcast       #152 <Class XMPNode[]>
	//*  95  191:checkcast       #152 <Class XMPNode[]>
	//*  96  194:astore          6
	//*  97  196:iconst_0        
	//*  98  197:istore          4
	//*  99  199:aload           6
	//* 100  201:arraylength     
	//* 101  202:iload           4
	//* 102  204:icmple          347
	//* 103  207:ldc1            #154 <String "xml:lang">
	//* 104  209:aload           6
	//* 105  211:iload           4
	//* 106  213:aaload          
	//* 107  214:invokevirtual   #157 <Method String getName()>
	//* 108  217:invokevirtual   #64  <Method boolean String.equals(Object)>
	//* 109  220:ifne            239
	//* 110  223:ldc1            #159 <String "rdf:type">
	//* 111  225:aload           6
	//* 112  227:iload           4
	//* 113  229:aaload          
	//* 114  230:invokevirtual   #157 <Method String getName()>
	//* 115  233:invokevirtual   #64  <Method boolean String.equals(Object)>
	//* 116  236:ifeq            347
	//* 117  239:iload           4
	//* 118  241:iconst_1        
	//* 119  242:iadd            
	//* 120  243:istore          4
	//* 121  245:goto            199
			if(getParent().getOptions().isArray())
	//* 122  248:aload_0         
	//* 123  249:invokevirtual   #163 <Method XMPNode getParent()>
	//* 124  252:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//* 125  255:invokevirtual   #166 <Method boolean PropertyOptions.isArray()>
	//* 126  258:ifeq            285
			{
				stringbuffer.append('[');
	//  127  261:aload_1         
	//  128  262:bipush          91
	//  129  264:invokevirtual   #102 <Method StringBuffer StringBuffer.append(char)>
	//  130  267:pop             
				stringbuffer.append(j);
	//  131  268:aload_1         
	//  132  269:iload           4
	//  133  271:invokevirtual   #169 <Method StringBuffer StringBuffer.append(int)>
	//  134  274:pop             
				stringbuffer.append(']');
	//  135  275:aload_1         
	//  136  276:bipush          93
	//  137  278:invokevirtual   #102 <Method StringBuffer StringBuffer.append(char)>
	//  138  281:pop             
			} else
	//* 139  282:goto            58
			{
				stringbuffer.append(name);
	//  140  285:aload_1         
	//  141  286:aload_0         
	//  142  287:getfield        #50  <Field String name>
	//  143  290:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//  144  293:pop             
			}
		} else
	//* 145  294:goto            58
		{
			stringbuffer.append("ROOT NODE");
	//  146  297:aload_1         
	//  147  298:ldc1            #171 <String "ROOT NODE">
	//  148  300:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//  149  303:pop             
			if(name != null && name.length() > 0)
	//* 150  304:aload_0         
	//* 151  305:getfield        #50  <Field String name>
	//* 152  308:ifnull          58
	//* 153  311:aload_0         
	//* 154  312:getfield        #50  <Field String name>
	//* 155  315:invokevirtual   #120 <Method int String.length()>
	//* 156  318:ifle            58
			{
				stringbuffer.append(" (");
	//  157  321:aload_1         
	//  158  322:ldc1            #173 <String " (">
	//  159  324:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//  160  327:pop             
				stringbuffer.append(name);
	//  161  328:aload_1         
	//  162  329:aload_0         
	//  163  330:getfield        #50  <Field String name>
	//  164  333:invokevirtual   #116 <Method StringBuffer StringBuffer.append(String)>
	//  165  336:pop             
				stringbuffer.append(')');
	//  166  337:aload_1         
	//  167  338:bipush          41
	//  168  340:invokevirtual   #102 <Method StringBuffer StringBuffer.append(char)>
	//  169  343:pop             
			}
		}
		if(value != null && value.length() > 0)
		{
			stringbuffer.append(" = \"");
			stringbuffer.append(value);
			stringbuffer.append('"');
		}
		if(getOptions().containsOneOf(-1))
		{
			stringbuffer.append("\t(");
			stringbuffer.append(getOptions().toString());
			stringbuffer.append(" : ");
			stringbuffer.append(getOptions().getOptionsString());
			stringbuffer.append(')');
		}
		stringbuffer.append('\n');
		if(flag && hasQualifier())
		{
			XMPNode axmpnode[] = (XMPNode[])(XMPNode[])getQualifier().toArray(((Object []) (new XMPNode[getQualifierLength()])));
			for(j = 0; axmpnode.length > j && ("xml:lang".equals(((Object) (axmpnode[j].getName()))) || "rdf:type".equals(((Object) (axmpnode[j].getName())))); j++);
	//* 170  344:goto            58
			Arrays.sort(((Object []) (axmpnode)), j, axmpnode.length);
	//  171  347:aload           6
	//  172  349:iload           4
	//  173  351:aload           6
	//  174  353:arraylength     
	//  175  354:invokestatic    #179 <Method void Arrays.sort(Object[], int, int)>
			for(j = 0; j < axmpnode.length; j++)
	//* 176  357:iconst_0        
	//* 177  358:istore          4
	//* 178  360:iload           4
	//* 179  362:aload           6
	//* 180  364:arraylength     
	//* 181  365:icmpge          394
				axmpnode[j].dumpNode(stringbuffer, flag, i + 2, j + 1);
	//  182  368:aload           6
	//  183  370:iload           4
	//  184  372:aaload          
	//  185  373:aload_1         
	//  186  374:iload_2         
	//  187  375:iload_3         
	//  188  376:iconst_2        
	//  189  377:iadd            
	//  190  378:iload           4
	//  191  380:iconst_1        
	//  192  381:iadd            
	//  193  382:invokespecial   #181 <Method void dumpNode(StringBuffer, boolean, int, int)>

	//  194  385:iload           4
	//  195  387:iconst_1        
	//  196  388:iadd            
	//  197  389:istore          4
		}
	//* 198  391:goto            360
		if(flag && hasChildren())
	//* 199  394:iload_2         
	//* 200  395:ifeq            481
	//* 201  398:aload_0         
	//* 202  399:invokevirtual   #184 <Method boolean hasChildren()>
	//* 203  402:ifeq            481
		{
			XMPNode axmpnode1[] = (XMPNode[])(XMPNode[])getChildren().toArray(((Object []) (new XMPNode[getChildrenLength()])));
	//  204  405:aload_0         
	//  205  406:invokespecial   #187 <Method List getChildren()>
	//  206  409:aload_0         
	//  207  410:invokevirtual   #190 <Method int getChildrenLength()>
	//  208  413:anewarray       XMPNode[]
	//  209  416:invokeinterface #150 <Method Object[] List.toArray(Object[])>
	//  210  421:checkcast       #152 <Class XMPNode[]>
	//  211  424:checkcast       #152 <Class XMPNode[]>
	//  212  427:astore          6
			if(!getOptions().isArray())
	//* 213  429:aload_0         
	//* 214  430:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//* 215  433:invokevirtual   #166 <Method boolean PropertyOptions.isArray()>
	//* 216  436:ifne            444
				Arrays.sort(((Object []) (axmpnode1)));
	//  217  439:aload           6
	//  218  441:invokestatic    #193 <Method void Arrays.sort(Object[])>
			for(j = 0; j < axmpnode1.length; j++)
	//* 219  444:iconst_0        
	//* 220  445:istore          4
	//* 221  447:iload           4
	//* 222  449:aload           6
	//* 223  451:arraylength     
	//* 224  452:icmpge          481
				axmpnode1[j].dumpNode(stringbuffer, flag, i + 1, j + 1);
	//  225  455:aload           6
	//  226  457:iload           4
	//  227  459:aaload          
	//  228  460:aload_1         
	//  229  461:iload_2         
	//  230  462:iload_3         
	//  231  463:iconst_1        
	//  232  464:iadd            
	//  233  465:iload           4
	//  234  467:iconst_1        
	//  235  468:iadd            
	//  236  469:invokespecial   #181 <Method void dumpNode(StringBuffer, boolean, int, int)>

	//  237  472:iload           4
	//  238  474:iconst_1        
	//  239  475:iadd            
	//  240  476:istore          4
		}
	//* 241  478:goto            447
	//  242  481:return          
	}

	private XMPNode find(List list, String s)
	{
label0:
		{
			if(list == null)
				break label0;
	//    0    0:aload_1         
	//    1    1:ifnull          43
			list = ((List) (list.iterator()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #199 <Method Iterator List.iterator()>
	//    4   10:astore_1        
			XMPNode xmpnode;
			do
			{
				if(!((Iterator) (list)).hasNext())
					break label0;
	//    5   11:aload_1         
	//    6   12:invokeinterface #204 <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            43
				xmpnode = (XMPNode)((Iterator) (list)).next();
	//    8   20:aload_1         
	//    9   21:invokeinterface #208 <Method Object Iterator.next()>
	//   10   26:checkcast       #2   <Class XMPNode>
	//   11   29:astore_3        
			} while(!xmpnode.getName().equals(((Object) (s))));
	//   12   30:aload_3         
	//   13   31:invokevirtual   #157 <Method String getName()>
	//   14   34:aload_2         
	//   15   35:invokevirtual   #64  <Method boolean String.equals(Object)>
	//   16   38:ifeq            11
			return xmpnode;
	//   17   41:aload_3         
	//   18   42:areturn         
		}
		return null;
	//   19   43:aconst_null     
	//   20   44:areturn         
	}

	private List getChildren()
	{
		if(children == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List children>
	//*   2    4:ifnonnull       19
			children = ((List) (new ArrayList(0)));
	//    3    7:aload_0         
	//    4    8:new             #210 <Class ArrayList>
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:invokespecial   #213 <Method void ArrayList(int)>
	//    8   16:putfield        #44  <Field List children>
		return children;
	//    9   19:aload_0         
	//   10   20:getfield        #44  <Field List children>
	//   11   23:areturn         
	}

	private List getQualifier()
	{
		if(qualifier == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field List qualifier>
	//*   2    4:ifnonnull       19
			qualifier = ((List) (new ArrayList(0)));
	//    3    7:aload_0         
	//    4    8:new             #210 <Class ArrayList>
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:invokespecial   #213 <Method void ArrayList(int)>
	//    8   16:putfield        #46  <Field List qualifier>
		return qualifier;
	//    9   19:aload_0         
	//   10   20:getfield        #46  <Field List qualifier>
	//   11   23:areturn         
	}

	private boolean isLanguageNode()
	{
		return "xml:lang".equals(((Object) (name)));
	//    0    0:ldc1            #154 <String "xml:lang">
	//    1    2:aload_0         
	//    2    3:getfield        #50  <Field String name>
	//    3    6:invokevirtual   #64  <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	private boolean isTypeNode()
	{
		return "rdf:type".equals(((Object) (name)));
	//    0    0:ldc1            #159 <String "rdf:type">
	//    1    2:aload_0         
	//    2    3:getfield        #50  <Field String name>
	//    3    6:invokevirtual   #64  <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public void addChild(int i, XMPNode xmpnode)
		throws XMPException
	{
		assertChildNotExisting(xmpnode.getName());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #157 <Method String getName()>
	//    3    5:invokespecial   #219 <Method void assertChildNotExisting(String)>
		xmpnode.setParent(this);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #223 <Method void setParent(XMPNode)>
		getChildren().add(i - 1, ((Object) (xmpnode)));
	//    7   13:aload_0         
	//    8   14:invokespecial   #187 <Method List getChildren()>
	//    9   17:iload_1         
	//   10   18:iconst_1        
	//   11   19:isub            
	//   12   20:aload_2         
	//   13   21:invokeinterface #227 <Method void List.add(int, Object)>
	//   14   26:return          
	}

	public void addChild(XMPNode xmpnode)
		throws XMPException
	{
		assertChildNotExisting(xmpnode.getName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #157 <Method String getName()>
	//    3    5:invokespecial   #219 <Method void assertChildNotExisting(String)>
		xmpnode.setParent(this);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #223 <Method void setParent(XMPNode)>
		getChildren().add(((Object) (xmpnode)));
	//    7   13:aload_0         
	//    8   14:invokespecial   #187 <Method List getChildren()>
	//    9   17:aload_1         
	//   10   18:invokeinterface #229 <Method boolean List.add(Object)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void addQualifier(XMPNode xmpnode)
		throws XMPException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		assertQualifierNotExisting(xmpnode.getName());
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #157 <Method String getName()>
	//    5    7:invokespecial   #232 <Method void assertQualifierNotExisting(String)>
		xmpnode.setParent(this);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #223 <Method void setParent(XMPNode)>
		xmpnode.getOptions().setQualifier(true);
	//    9   15:aload_1         
	//   10   16:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//   11   19:iconst_1        
	//   12   20:invokevirtual   #236 <Method PropertyOptions PropertyOptions.setQualifier(boolean)>
	//   13   23:pop             
		getOptions().setHasQualifiers(true);
	//   14   24:aload_0         
	//   15   25:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//   16   28:iconst_1        
	//   17   29:invokevirtual   #239 <Method PropertyOptions PropertyOptions.setHasQualifiers(boolean)>
	//   18   32:pop             
		if(xmpnode.isLanguageNode())
	//*  19   33:aload_1         
	//*  20   34:invokespecial   #241 <Method boolean isLanguageNode()>
	//*  21   37:ifeq            61
		{
			options.setHasLanguage(true);
	//   22   40:aload_0         
	//   23   41:getfield        #48  <Field PropertyOptions options>
	//   24   44:iconst_1        
	//   25   45:invokevirtual   #244 <Method PropertyOptions PropertyOptions.setHasLanguage(boolean)>
	//   26   48:pop             
			getQualifier().add(0, ((Object) (xmpnode)));
	//   27   49:aload_0         
	//   28   50:invokespecial   #141 <Method List getQualifier()>
	//   29   53:iconst_0        
	//   30   54:aload_1         
	//   31   55:invokeinterface #227 <Method void List.add(int, Object)>
			return;
	//   32   60:return          
		}
		if(xmpnode.isTypeNode())
	//*  33   61:aload_1         
	//*  34   62:invokespecial   #246 <Method boolean isTypeNode()>
	//*  35   65:ifeq            106
		{
			options.setHasType(true);
	//   36   68:aload_0         
	//   37   69:getfield        #48  <Field PropertyOptions options>
	//   38   72:iconst_1        
	//   39   73:invokevirtual   #249 <Method PropertyOptions PropertyOptions.setHasType(boolean)>
	//   40   76:pop             
			List list = getQualifier();
	//   41   77:aload_0         
	//   42   78:invokespecial   #141 <Method List getQualifier()>
	//   43   81:astore_3        
			if(options.getHasLanguage())
	//*  44   82:aload_0         
	//*  45   83:getfield        #48  <Field PropertyOptions options>
	//*  46   86:invokevirtual   #252 <Method boolean PropertyOptions.getHasLanguage()>
	//*  47   89:ifne            101
	//*  48   92:aload_3         
	//*  49   93:iload_2         
	//*  50   94:aload_1         
	//*  51   95:invokeinterface #227 <Method void List.add(int, Object)>
	//*  52  100:return          
				i = 1;
	//   53  101:iconst_1        
	//   54  102:istore_2        
			list.add(i, ((Object) (xmpnode)));
			return;
		} else
	//*  55  103:goto            92
		{
			getQualifier().add(((Object) (xmpnode)));
	//   56  106:aload_0         
	//   57  107:invokespecial   #141 <Method List getQualifier()>
	//   58  110:aload_1         
	//   59  111:invokeinterface #229 <Method boolean List.add(Object)>
	//   60  116:pop             
			return;
	//   61  117:return          
		}
	}

	protected void cleanupChildren()
	{
		if(children.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List children>
	//*   2    4:invokeinterface #256 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            17
			children = null;
	//    4   12:aload_0         
	//    5   13:aconst_null     
	//    6   14:putfield        #44  <Field List children>
	//    7   17:return          
	}

	public void clear()
	{
		options = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #48  <Field PropertyOptions options>
		name = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #50  <Field String name>
		value = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #52  <Field String value>
		children = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #44  <Field List children>
		qualifier = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #46  <Field List qualifier>
	//   15   25:return          
	}

	public Object clone()
	{
		Object obj;
		try
		{
			obj = ((Object) (new PropertyOptions(getOptions().getOptions())));
	//    0    0:new             #110 <Class PropertyOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//    4    8:invokevirtual   #260 <Method int PropertyOptions.getOptions()>
	//    5   11:invokespecial   #261 <Method void PropertyOptions(int)>
	//    6   14:astore_1        
		}
	//*   7   15:new             #2   <Class XMPNode>
	//*   8   18:dup             
	//*   9   19:aload_0         
	//*  10   20:getfield        #50  <Field String name>
	//*  11   23:aload_0         
	//*  12   24:getfield        #52  <Field String value>
	//*  13   27:aload_1         
	//*  14   28:invokespecial   #40  <Method void XMPNode(String, String, PropertyOptions)>
	//*  15   31:astore_1        
	//*  16   32:aload_0         
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #264 <Method void cloneSubtree(XMPNode)>
	//*  19   37:aload_1         
	//*  20   38:areturn         
		catch(XMPException xmpexception)
	//*  21   39:astore_1        
		{
			xmpexception = ((XMPException) (new PropertyOptions()));
	//   22   40:new             #110 <Class PropertyOptions>
	//   23   43:dup             
	//   24   44:invokespecial   #265 <Method void PropertyOptions()>
	//   25   47:astore_1        
		}
		obj = ((Object) (new XMPNode(name, value, ((PropertyOptions) (obj)))));
		cloneSubtree(((XMPNode) (obj)));
		return obj;
	//*  26   48:goto            15
	}

	public void cloneSubtree(XMPNode xmpnode)
	{
		for(Iterator iterator = iterateChildren(); iterator.hasNext(); xmpnode.addChild((XMPNode)((XMPNode)iterator.next()).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #268 <Method Iterator iterateChildren()>
	//    2    4:astore_2        
	//    3    5:aload_2         
	//    4    6:invokeinterface #204 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            51
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokeinterface #208 <Method Object Iterator.next()>
	//    9   21:checkcast       #2   <Class XMPNode>
	//   10   24:invokevirtual   #270 <Method Object clone()>
	//   11   27:checkcast       #2   <Class XMPNode>
	//   12   30:invokevirtual   #272 <Method void addChild(XMPNode)>
	//*  13   33:goto            5
	//*  14   36:astore_1        
	//*  15   37:getstatic       #34  <Field boolean $assertionsDisabled>
	//*  16   40:ifne            87
	//*  17   43:new             #274 <Class AssertionError>
	//*  18   46:dup             
	//*  19   47:invokespecial   #275 <Method void AssertionError()>
	//*  20   50:athrow          
		try
		{
			for(Iterator iterator1 = iterateQualifier(); iterator1.hasNext(); xmpnode.addQualifier((XMPNode)((XMPNode)iterator1.next()).clone()));
	//   21   51:aload_0         
	//   22   52:invokevirtual   #278 <Method Iterator iterateQualifier()>
	//   23   55:astore_2        
	//   24   56:aload_2         
	//   25   57:invokeinterface #204 <Method boolean Iterator.hasNext()>
	//   26   62:ifeq            87
	//   27   65:aload_1         
	//   28   66:aload_2         
	//   29   67:invokeinterface #208 <Method Object Iterator.next()>
	//   30   72:checkcast       #2   <Class XMPNode>
	//   31   75:invokevirtual   #270 <Method Object clone()>
	//   32   78:checkcast       #2   <Class XMPNode>
	//   33   81:invokevirtual   #280 <Method void addQualifier(XMPNode)>
		}
		// Misplaced declaration of an exception variable
		catch(XMPNode xmpnode)
		{
			if(!$assertionsDisabled)
				throw new AssertionError();
		}
	//*  34   84:goto            56
		return;
	//   35   87:return          
	}

	public int compareTo(Object obj)
	{
		if(getOptions().isSchemaNode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//*   2    4:invokevirtual   #285 <Method boolean PropertyOptions.isSchemaNode()>
	//*   3    7:ifeq            25
			return value.compareTo(((XMPNode)obj).getValue());
	//    4   10:aload_0         
	//    5   11:getfield        #52  <Field String value>
	//    6   14:aload_1         
	//    7   15:checkcast       #2   <Class XMPNode>
	//    8   18:invokevirtual   #288 <Method String getValue()>
	//    9   21:invokevirtual   #291 <Method int String.compareTo(String)>
	//   10   24:ireturn         
		else
			return name.compareTo(((XMPNode)obj).getName());
	//   11   25:aload_0         
	//   12   26:getfield        #50  <Field String name>
	//   13   29:aload_1         
	//   14   30:checkcast       #2   <Class XMPNode>
	//   15   33:invokevirtual   #157 <Method String getName()>
	//   16   36:invokevirtual   #291 <Method int String.compareTo(String)>
	//   17   39:ireturn         
	}

	public String dumpNode(boolean flag)
	{
		StringBuffer stringbuffer = new StringBuffer(512);
	//    0    0:new             #99  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:sipush          512
	//    3    7:invokespecial   #293 <Method void StringBuffer(int)>
	//    4   10:astore_2        
		dumpNode(stringbuffer, flag, 0, 0);
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:iload_1         
	//    8   14:iconst_0        
	//    9   15:iconst_0        
	//   10   16:invokespecial   #181 <Method void dumpNode(StringBuffer, boolean, int, int)>
		return stringbuffer.toString();
	//   11   19:aload_2         
	//   12   20:invokevirtual   #294 <Method String StringBuffer.toString()>
	//   13   23:areturn         
	}

	public XMPNode findChildByName(String s)
	{
		return find(getChildren(), s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #187 <Method List getChildren()>
	//    3    5:aload_1         
	//    4    6:invokespecial   #296 <Method XMPNode find(List, String)>
	//    5    9:areturn         
	}

	public XMPNode findQualifierByName(String s)
	{
		return find(qualifier, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field List qualifier>
	//    3    5:aload_1         
	//    4    6:invokespecial   #296 <Method XMPNode find(List, String)>
	//    5    9:areturn         
	}

	public XMPNode getChild(int i)
	{
		return (XMPNode)getChildren().get(i - 1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method List getChildren()>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:invokeinterface #302 <Method Object List.get(int)>
	//    6   12:checkcast       #2   <Class XMPNode>
	//    7   15:areturn         
	}

	public int getChildrenLength()
	{
		if(children != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List children>
	//*   2    4:ifnull          17
			return children.size();
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field List children>
	//    5   11:invokeinterface #305 <Method int List.size()>
	//    6   16:ireturn         
		else
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public boolean getHasAliases()
	{
		return hasAliases;
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field boolean hasAliases>
	//    2    4:ireturn         
	}

	public boolean getHasValueChild()
	{
		return hasValueChild;
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field boolean hasValueChild>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String name>
	//    2    4:areturn         
	}

	public PropertyOptions getOptions()
	{
		if(options == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field PropertyOptions options>
	//*   2    4:ifnonnull       18
			options = new PropertyOptions();
	//    3    7:aload_0         
	//    4    8:new             #110 <Class PropertyOptions>
	//    5   11:dup             
	//    6   12:invokespecial   #265 <Method void PropertyOptions()>
	//    7   15:putfield        #48  <Field PropertyOptions options>
		return options;
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field PropertyOptions options>
	//   10   22:areturn         
	}

	public XMPNode getParent()
	{
		return parent;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field XMPNode parent>
	//    2    4:areturn         
	}

	public XMPNode getQualifier(int i)
	{
		return (XMPNode)getQualifier().get(i - 1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method List getQualifier()>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:invokeinterface #302 <Method Object List.get(int)>
	//    6   12:checkcast       #2   <Class XMPNode>
	//    7   15:areturn         
	}

	public int getQualifierLength()
	{
		if(qualifier != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field List qualifier>
	//*   2    4:ifnull          17
			return qualifier.size();
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field List qualifier>
	//    5   11:invokeinterface #305 <Method int List.size()>
	//    6   16:ireturn         
		else
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public List getUnmodifiableChildren()
	{
		return Collections.unmodifiableList(((List) (new ArrayList(((java.util.Collection) (getChildren()))))));
	//    0    0:new             #210 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #187 <Method List getChildren()>
	//    4    8:invokespecial   #315 <Method void ArrayList(java.util.Collection)>
	//    5   11:invokestatic    #321 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
	}

	public String getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String value>
	//    2    4:areturn         
	}

	public boolean hasChildren()
	{
		return children != null && children.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List children>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field List children>
	//    5   11:invokeinterface #305 <Method int List.size()>
	//    6   16:ifle            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean hasQualifier()
	{
		return qualifier != null && qualifier.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List qualifier>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field List qualifier>
	//    5   11:invokeinterface #305 <Method int List.size()>
	//    6   16:ifle            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isAlias()
	{
		return alias;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field boolean alias>
	//    2    4:ireturn         
	}

	public boolean isImplicit()
	{
		return implicit;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field boolean implicit>
	//    2    4:ireturn         
	}

	public Iterator iterateChildren()
	{
		if(children != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List children>
	//*   2    4:ifnull          17
			return getChildren().iterator();
	//    3    7:aload_0         
	//    4    8:invokespecial   #187 <Method List getChildren()>
	//    5   11:invokeinterface #199 <Method Iterator List.iterator()>
	//    6   16:areturn         
		else
			return ((Iterator) (Collections.EMPTY_LIST.listIterator()));
	//    7   17:getstatic       #330 <Field List Collections.EMPTY_LIST>
	//    8   20:invokeinterface #334 <Method ListIterator List.listIterator()>
	//    9   25:areturn         
	}

	public Iterator iterateQualifier()
	{
		if(qualifier != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field List qualifier>
	//*   2    4:ifnull          25
			return new Iterator() {

				public boolean hasNext()
				{
					return it.hasNext();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Iterator val$it>
				//    2    4:invokeinterface #29  <Method boolean Iterator.hasNext()>
				//    3    9:ireturn         
				}

				public Object next()
				{
					return it.next();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Iterator val$it>
				//    2    4:invokeinterface #33  <Method Object Iterator.next()>
				//    3    9:areturn         
				}

				public void remove()
				{
					throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
				//    0    0:new             #36  <Class UnsupportedOperationException>
				//    1    3:dup             
				//    2    4:ldc1            #38  <String "remove() is not allowed due to the internal contraints">
				//    3    6:invokespecial   #41  <Method void UnsupportedOperationException(String)>
				//    4    9:athrow          
				}

				final XMPNode this$0;
				final Iterator val$it;

			
			{
				this$0 = XMPNode.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field XMPNode this$0>
				it = iterator;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Iterator val$it>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//    3    7:new             #8   <Class XMPNode$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokespecial   #141 <Method List getQualifier()>
	//    8   16:invokeinterface #199 <Method Iterator List.iterator()>
	//    9   21:invokespecial   #337 <Method void XMPNode$1(XMPNode, Iterator)>
	//   10   24:areturn         
		else
			return Collections.EMPTY_LIST.iterator();
	//   11   25:getstatic       #330 <Field List Collections.EMPTY_LIST>
	//   12   28:invokeinterface #199 <Method Iterator List.iterator()>
	//   13   33:areturn         
	}

	public void removeChild(int i)
	{
		getChildren().remove(i - 1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method List getChildren()>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:invokeinterface #341 <Method Object List.remove(int)>
	//    6   12:pop             
		cleanupChildren();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #343 <Method void cleanupChildren()>
	//    9   17:return          
	}

	public void removeChild(XMPNode xmpnode)
	{
		getChildren().remove(((Object) (xmpnode)));
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method List getChildren()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #345 <Method boolean List.remove(Object)>
	//    4   10:pop             
		cleanupChildren();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #343 <Method void cleanupChildren()>
	//    7   15:return          
	}

	public void removeChildren()
	{
		children = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #44  <Field List children>
	//    3    5:return          
	}

	public void removeQualifier(XMPNode xmpnode)
	{
		PropertyOptions propertyoptions = getOptions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//    2    4:astore_2        
		if(!xmpnode.isLanguageNode()) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:invokespecial   #241 <Method boolean isLanguageNode()>
	//    5    9:ifeq            53
_L1:
		propertyoptions.setHasLanguage(false);
	//    6   12:aload_2         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #244 <Method PropertyOptions PropertyOptions.setHasLanguage(boolean)>
	//    9   17:pop             
_L4:
		getQualifier().remove(((Object) (xmpnode)));
	//   10   18:aload_0         
	//   11   19:invokespecial   #141 <Method List getQualifier()>
	//   12   22:aload_1         
	//   13   23:invokeinterface #345 <Method boolean List.remove(Object)>
	//   14   28:pop             
		if(qualifier.isEmpty())
	//*  15   29:aload_0         
	//*  16   30:getfield        #46  <Field List qualifier>
	//*  17   33:invokeinterface #256 <Method boolean List.isEmpty()>
	//*  18   38:ifeq            52
		{
			propertyoptions.setHasQualifiers(false);
	//   19   41:aload_2         
	//   20   42:iconst_0        
	//   21   43:invokevirtual   #239 <Method PropertyOptions PropertyOptions.setHasQualifiers(boolean)>
	//   22   46:pop             
			qualifier = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #46  <Field List qualifier>
		}
		return;
	//   26   52:return          
_L2:
		if(xmpnode.isTypeNode())
	//*  27   53:aload_1         
	//*  28   54:invokespecial   #246 <Method boolean isTypeNode()>
	//*  29   57:ifeq            18
			propertyoptions.setHasType(false);
	//   30   60:aload_2         
	//   31   61:iconst_0        
	//   32   62:invokevirtual   #249 <Method PropertyOptions PropertyOptions.setHasType(boolean)>
	//   33   65:pop             
		if(true) goto _L4; else goto _L3
	//   34   66:goto            18
_L3:
	}

	public void removeQualifiers()
	{
		PropertyOptions propertyoptions = getOptions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//    2    4:astore_1        
		propertyoptions.setHasQualifiers(false);
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #239 <Method PropertyOptions PropertyOptions.setHasQualifiers(boolean)>
	//    6   10:pop             
		propertyoptions.setHasLanguage(false);
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #244 <Method PropertyOptions PropertyOptions.setHasLanguage(boolean)>
	//   10   16:pop             
		propertyoptions.setHasType(false);
	//   11   17:aload_1         
	//   12   18:iconst_0        
	//   13   19:invokevirtual   #249 <Method PropertyOptions PropertyOptions.setHasType(boolean)>
	//   14   22:pop             
		qualifier = null;
	//   15   23:aload_0         
	//   16   24:aconst_null     
	//   17   25:putfield        #46  <Field List qualifier>
	//   18   28:return          
	}

	public void replaceChild(int i, XMPNode xmpnode)
	{
		xmpnode.setParent(this);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #223 <Method void setParent(XMPNode)>
		getChildren().set(i - 1, ((Object) (xmpnode)));
	//    3    5:aload_0         
	//    4    6:invokespecial   #187 <Method List getChildren()>
	//    5    9:iload_1         
	//    6   10:iconst_1        
	//    7   11:isub            
	//    8   12:aload_2         
	//    9   13:invokeinterface #353 <Method Object List.set(int, Object)>
	//   10   18:pop             
	//   11   19:return          
	}

	public void setAlias(boolean flag)
	{
		alias = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #324 <Field boolean alias>
	//    3    5:return          
	}

	public void setHasAliases(boolean flag)
	{
		hasAliases = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #308 <Field boolean hasAliases>
	//    3    5:return          
	}

	public void setHasValueChild(boolean flag)
	{
		hasValueChild = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #311 <Field boolean hasValueChild>
	//    3    5:return          
	}

	public void setImplicit(boolean flag)
	{
		implicit = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #327 <Field boolean implicit>
	//    3    5:return          
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String name>
	//    3    5:return          
	}

	public void setOptions(PropertyOptions propertyoptions)
	{
		options = propertyoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field PropertyOptions options>
	//    3    5:return          
	}

	protected void setParent(XMPNode xmpnode)
	{
		parent = xmpnode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field XMPNode parent>
	//    3    5:return          
	}

	public void setValue(String s)
	{
		value = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String value>
	//    3    5:return          
	}

	public void sort()
	{
		if(hasQualifier())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #137 <Method boolean hasQualifier()>
	//*   2    4:ifeq            133
		{
			XMPNode axmpnode[] = (XMPNode[])(XMPNode[])getQualifier().toArray(((Object []) (new XMPNode[getQualifierLength()])));
	//    3    7:aload_0         
	//    4    8:invokespecial   #141 <Method List getQualifier()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #144 <Method int getQualifierLength()>
	//    7   15:anewarray       XMPNode[]
	//    8   18:invokeinterface #150 <Method Object[] List.toArray(Object[])>
	//    9   23:checkcast       #152 <Class XMPNode[]>
	//   10   26:checkcast       #152 <Class XMPNode[]>
	//   11   29:astore_2        
			int i;
			for(i = 0; axmpnode.length > i && ("xml:lang".equals(((Object) (axmpnode[i].getName()))) || "rdf:type".equals(((Object) (axmpnode[i].getName())))); i++)
	//*  12   30:iconst_0        
	//*  13   31:istore_1        
	//*  14   32:aload_2         
	//*  15   33:arraylength     
	//*  16   34:iload_1         
	//*  17   35:icmple          79
	//*  18   38:ldc1            #154 <String "xml:lang">
	//*  19   40:aload_2         
	//*  20   41:iload_1         
	//*  21   42:aaload          
	//*  22   43:invokevirtual   #157 <Method String getName()>
	//*  23   46:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  24   49:ifne            66
	//*  25   52:ldc1            #159 <String "rdf:type">
	//*  26   54:aload_2         
	//*  27   55:iload_1         
	//*  28   56:aaload          
	//*  29   57:invokevirtual   #157 <Method String getName()>
	//*  30   60:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  31   63:ifeq            79
				axmpnode[i].sort();
	//   32   66:aload_2         
	//   33   67:iload_1         
	//   34   68:aaload          
	//   35   69:invokevirtual   #364 <Method void sort()>

	//   36   72:iload_1         
	//   37   73:iconst_1        
	//   38   74:iadd            
	//   39   75:istore_1        
	//*  40   76:goto            32
			Arrays.sort(((Object []) (axmpnode)), i, axmpnode.length);
	//   41   79:aload_2         
	//   42   80:iload_1         
	//   43   81:aload_2         
	//   44   82:arraylength     
	//   45   83:invokestatic    #179 <Method void Arrays.sort(Object[], int, int)>
			ListIterator listiterator = qualifier.listIterator();
	//   46   86:aload_0         
	//   47   87:getfield        #46  <Field List qualifier>
	//   48   90:invokeinterface #334 <Method ListIterator List.listIterator()>
	//   49   95:astore_3        
			for(int j = 0; j < axmpnode.length; j++)
	//*  50   96:iconst_0        
	//*  51   97:istore_1        
	//*  52   98:iload_1         
	//*  53   99:aload_2         
	//*  54  100:arraylength     
	//*  55  101:icmpge          133
			{
				listiterator.next();
	//   56  104:aload_3         
	//   57  105:invokeinterface #367 <Method Object ListIterator.next()>
	//   58  110:pop             
				listiterator.set(((Object) (axmpnode[j])));
	//   59  111:aload_3         
	//   60  112:aload_2         
	//   61  113:iload_1         
	//   62  114:aaload          
	//   63  115:invokeinterface #370 <Method void ListIterator.set(Object)>
				axmpnode[j].sort();
	//   64  120:aload_2         
	//   65  121:iload_1         
	//   66  122:aaload          
	//   67  123:invokevirtual   #364 <Method void sort()>
			}

	//   68  126:iload_1         
	//   69  127:iconst_1        
	//   70  128:iadd            
	//   71  129:istore_1        
		}
	//*  72  130:goto            98
		if(hasChildren())
	//*  73  133:aload_0         
	//*  74  134:invokevirtual   #184 <Method boolean hasChildren()>
	//*  75  137:ifeq            186
		{
			if(!getOptions().isArray())
	//*  76  140:aload_0         
	//*  77  141:invokevirtual   #108 <Method PropertyOptions getOptions()>
	//*  78  144:invokevirtual   #166 <Method boolean PropertyOptions.isArray()>
	//*  79  147:ifne            157
				Collections.sort(children);
	//   80  150:aload_0         
	//   81  151:getfield        #44  <Field List children>
	//   82  154:invokestatic    #373 <Method void Collections.sort(List)>
			for(Iterator iterator = iterateChildren(); iterator.hasNext(); ((XMPNode)iterator.next()).sort());
	//   83  157:aload_0         
	//   84  158:invokevirtual   #268 <Method Iterator iterateChildren()>
	//   85  161:astore_2        
	//   86  162:aload_2         
	//   87  163:invokeinterface #204 <Method boolean Iterator.hasNext()>
	//   88  168:ifeq            186
	//   89  171:aload_2         
	//   90  172:invokeinterface #208 <Method Object Iterator.next()>
	//   91  177:checkcast       #2   <Class XMPNode>
	//   92  180:invokevirtual   #364 <Method void sort()>
		}
	//*  93  183:goto            162
	//   94  186:return          
	}

	static final boolean $assertionsDisabled;
	private boolean alias;
	private List children;
	private boolean hasAliases;
	private boolean hasValueChild;
	private boolean implicit;
	private String name;
	private PropertyOptions options;
	private XMPNode parent;
	private List qualifier;
	private String value;

	static 
	{
		boolean flag;
		if(!((Class) (com/itextpdf/xmp/impl/XMPNode)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class XMPNode>
	//*   1    2:invokevirtual   #32  <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #34  <Field boolean $assertionsDisabled>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		$assertionsDisabled = flag;
	//*  10   17:goto            10
	}
}
