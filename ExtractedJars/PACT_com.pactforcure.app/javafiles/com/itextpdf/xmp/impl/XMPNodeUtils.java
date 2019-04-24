// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.impl.xpath.XMPPath;
import com.itextpdf.xmp.impl.xpath.XMPPathSegment;
import com.itextpdf.xmp.options.PropertyOptions;
import java.util.GregorianCalendar;
import java.util.Iterator;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPNode, Utils

public class XMPNodeUtils
	implements XMPConst
{

	private XMPNodeUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	static void appendLangItem(XMPNode xmpnode, String s, String s1)
		throws XMPException
	{
		s1 = ((String) (new XMPNode("[]", s1, ((PropertyOptions) (null)))));
	//    0    0:new             #41  <Class XMPNode>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "[]">
	//    3    6:aload_2         
	//    4    7:aconst_null     
	//    5    8:invokespecial   #46  <Method void XMPNode(String, String, PropertyOptions)>
	//    6   11:astore_2        
		s = ((String) (new XMPNode("xml:lang", s, ((PropertyOptions) (null)))));
	//    7   12:new             #41  <Class XMPNode>
	//    8   15:dup             
	//    9   16:ldc1            #48  <String "xml:lang">
	//   10   18:aload_1         
	//   11   19:aconst_null     
	//   12   20:invokespecial   #46  <Method void XMPNode(String, String, PropertyOptions)>
	//   13   23:astore_1        
		((XMPNode) (s1)).addQualifier(((XMPNode) (s)));
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #52  <Method void XMPNode.addQualifier(XMPNode)>
		if(!"x-default".equals(((Object) (((XMPNode) (s)).getValue()))))
	//*  17   29:ldc1            #54  <String "x-default">
	//*  18   31:aload_1         
	//*  19   32:invokevirtual   #58  <Method String XMPNode.getValue()>
	//*  20   35:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  21   38:ifne            47
		{
			xmpnode.addChild(((XMPNode) (s1)));
	//   22   41:aload_0         
	//   23   42:aload_2         
	//   24   43:invokevirtual   #67  <Method void XMPNode.addChild(XMPNode)>
			return;
	//   25   46:return          
		} else
		{
			xmpnode.addChild(1, ((XMPNode) (s1)));
	//   26   47:aload_0         
	//   27   48:iconst_1        
	//   28   49:aload_2         
	//   29   50:invokevirtual   #70  <Method void XMPNode.addChild(int, XMPNode)>
			return;
	//   30   53:return          
		}
	}

	static Object[] chooseLocalizedText(XMPNode xmpnode, String s, String s1)
		throws XMPException
	{
		if(!xmpnode.getOptions().isArrayAltText())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*   2    4:invokevirtual   #82  <Method boolean PropertyOptions.isArrayAltText()>
	//*   3    7:ifne            22
			throw new XMPException("Localized text array is not alt-text", 102);
	//    4   10:new             #39  <Class XMPException>
	//    5   13:dup             
	//    6   14:ldc1            #84  <String "Localized text array is not alt-text">
	//    7   16:bipush          102
	//    8   18:invokespecial   #87  <Method void XMPException(String, int)>
	//    9   21:athrow          
		if(!xmpnode.hasChildren())
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #90  <Method boolean XMPNode.hasChildren()>
	//*  12   26:ifne            49
			return (new Object[] {
				new Integer(0), null
			});
	//   13   29:iconst_2        
	//   14   30:anewarray       Object[]
	//   15   33:dup             
	//   16   34:iconst_0        
	//   17   35:new             #92  <Class Integer>
	//   18   38:dup             
	//   19   39:iconst_0        
	//   20   40:invokespecial   #95  <Method void Integer(int)>
	//   21   43:aastore         
	//   22   44:dup             
	//   23   45:iconst_1        
	//   24   46:aconst_null     
	//   25   47:aastore         
	//   26   48:areturn         
		int i = 0;
	//   27   49:iconst_0        
	//   28   50:istore_3        
		Object obj = null;
	//   29   51:aconst_null     
	//   30   52:astore          5
		XMPNode xmpnode1 = null;
	//   31   54:aconst_null     
	//   32   55:astore          4
		Iterator iterator = xmpnode.iterateChildren();
	//   33   57:aload_0         
	//   34   58:invokevirtual   #99  <Method Iterator XMPNode.iterateChildren()>
	//   35   61:astore          8
		do
		{
			if(!iterator.hasNext())
				break;
	//   36   63:aload           8
	//   37   65:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   38   70:ifeq            240
			XMPNode xmpnode2 = (XMPNode)iterator.next();
	//   39   73:aload           8
	//   40   75:invokeinterface #108 <Method Object Iterator.next()>
	//   41   80:checkcast       #41  <Class XMPNode>
	//   42   83:astore          6
			if(xmpnode2.getOptions().isCompositeProperty())
	//*  43   85:aload           6
	//*  44   87:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*  45   90:invokevirtual   #111 <Method boolean PropertyOptions.isCompositeProperty()>
	//*  46   93:ifeq            108
				throw new XMPException("Alt-text array item is not simple", 102);
	//   47   96:new             #39  <Class XMPException>
	//   48   99:dup             
	//   49  100:ldc1            #113 <String "Alt-text array item is not simple">
	//   50  102:bipush          102
	//   51  104:invokespecial   #87  <Method void XMPException(String, int)>
	//   52  107:athrow          
			if(!xmpnode2.hasQualifier() || !"xml:lang".equals(((Object) (xmpnode2.getQualifier(1).getName()))))
	//*  53  108:aload           6
	//*  54  110:invokevirtual   #116 <Method boolean XMPNode.hasQualifier()>
	//*  55  113:ifeq            133
	//*  56  116:ldc1            #48  <String "xml:lang">
	//*  57  118:aload           6
	//*  58  120:iconst_1        
	//*  59  121:invokevirtual   #120 <Method XMPNode XMPNode.getQualifier(int)>
	//*  60  124:invokevirtual   #123 <Method String XMPNode.getName()>
	//*  61  127:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  62  130:ifne            145
				throw new XMPException("Alt-text array item has no language qualifier", 102);
	//   63  133:new             #39  <Class XMPException>
	//   64  136:dup             
	//   65  137:ldc1            #125 <String "Alt-text array item has no language qualifier">
	//   66  139:bipush          102
	//   67  141:invokespecial   #87  <Method void XMPException(String, int)>
	//   68  144:athrow          
			Object obj1 = ((Object) (xmpnode2.getQualifier(1).getValue()));
	//   69  145:aload           6
	//   70  147:iconst_1        
	//   71  148:invokevirtual   #120 <Method XMPNode XMPNode.getQualifier(int)>
	//   72  151:invokevirtual   #58  <Method String XMPNode.getValue()>
	//   73  154:astore          7
			if(s1.equals(obj1))
	//*  74  156:aload_2         
	//*  75  157:aload           7
	//*  76  159:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  77  162:ifeq            186
				return (new Object[] {
					new Integer(1), xmpnode2
				});
	//   78  165:iconst_2        
	//   79  166:anewarray       Object[]
	//   80  169:dup             
	//   81  170:iconst_0        
	//   82  171:new             #92  <Class Integer>
	//   83  174:dup             
	//   84  175:iconst_1        
	//   85  176:invokespecial   #95  <Method void Integer(int)>
	//   86  179:aastore         
	//   87  180:dup             
	//   88  181:iconst_1        
	//   89  182:aload           6
	//   90  184:aastore         
	//   91  185:areturn         
			if(s != null && ((String) (obj1)).startsWith(s))
	//*  92  186:aload_1         
	//*  93  187:ifnull          223
	//*  94  190:aload           7
	//*  95  192:aload_1         
	//*  96  193:invokevirtual   #129 <Method boolean String.startsWith(String)>
	//*  97  196:ifeq            223
			{
				obj1 = obj;
	//   98  199:aload           5
	//   99  201:astore          7
				if(obj == null)
	//* 100  203:aload           5
	//* 101  205:ifnonnull       212
					obj1 = ((Object) (xmpnode2));
	//  102  208:aload           6
	//  103  210:astore          7
				i++;
	//  104  212:iload_3         
	//  105  213:iconst_1        
	//  106  214:iadd            
	//  107  215:istore_3        
				obj = obj1;
	//  108  216:aload           7
	//  109  218:astore          5
			} else
	//* 110  220:goto            63
			if("x-default".equals(obj1))
	//* 111  223:ldc1            #54  <String "x-default">
	//* 112  225:aload           7
	//* 113  227:invokevirtual   #64  <Method boolean String.equals(Object)>
	//* 114  230:ifeq            63
				xmpnode1 = xmpnode2;
	//  115  233:aload           6
	//  116  235:astore          4
		} while(true);
	//  117  237:goto            63
		if(i == 1)
	//* 118  240:iload_3         
	//* 119  241:iconst_1        
	//* 120  242:icmpne          266
			return (new Object[] {
				new Integer(2), obj
			});
	//  121  245:iconst_2        
	//  122  246:anewarray       Object[]
	//  123  249:dup             
	//  124  250:iconst_0        
	//  125  251:new             #92  <Class Integer>
	//  126  254:dup             
	//  127  255:iconst_2        
	//  128  256:invokespecial   #95  <Method void Integer(int)>
	//  129  259:aastore         
	//  130  260:dup             
	//  131  261:iconst_1        
	//  132  262:aload           5
	//  133  264:aastore         
	//  134  265:areturn         
		if(i > 1)
	//* 135  266:iload_3         
	//* 136  267:iconst_1        
	//* 137  268:icmple          292
			return (new Object[] {
				new Integer(3), obj
			});
	//  138  271:iconst_2        
	//  139  272:anewarray       Object[]
	//  140  275:dup             
	//  141  276:iconst_0        
	//  142  277:new             #92  <Class Integer>
	//  143  280:dup             
	//  144  281:iconst_3        
	//  145  282:invokespecial   #95  <Method void Integer(int)>
	//  146  285:aastore         
	//  147  286:dup             
	//  148  287:iconst_1        
	//  149  288:aload           5
	//  150  290:aastore         
	//  151  291:areturn         
		if(xmpnode1 != null)
	//* 152  292:aload           4
	//* 153  294:ifnull          318
			return (new Object[] {
				new Integer(4), xmpnode1
			});
	//  154  297:iconst_2        
	//  155  298:anewarray       Object[]
	//  156  301:dup             
	//  157  302:iconst_0        
	//  158  303:new             #92  <Class Integer>
	//  159  306:dup             
	//  160  307:iconst_4        
	//  161  308:invokespecial   #95  <Method void Integer(int)>
	//  162  311:aastore         
	//  163  312:dup             
	//  164  313:iconst_1        
	//  165  314:aload           4
	//  166  316:aastore         
	//  167  317:areturn         
		else
			return (new Object[] {
				new Integer(5), xmpnode.getChild(1)
			});
	//  168  318:iconst_2        
	//  169  319:anewarray       Object[]
	//  170  322:dup             
	//  171  323:iconst_0        
	//  172  324:new             #92  <Class Integer>
	//  173  327:dup             
	//  174  328:iconst_5        
	//  175  329:invokespecial   #95  <Method void Integer(int)>
	//  176  332:aastore         
	//  177  333:dup             
	//  178  334:iconst_1        
	//  179  335:aload_0         
	//  180  336:iconst_1        
	//  181  337:invokevirtual   #132 <Method XMPNode XMPNode.getChild(int)>
	//  182  340:aastore         
	//  183  341:areturn         
	}

	static void deleteNode(XMPNode xmpnode)
	{
		XMPNode xmpnode1 = xmpnode.getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #137 <Method XMPNode XMPNode.getParent()>
	//    2    4:astore_1        
		if(xmpnode.getOptions().isQualifier())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*   5    9:invokevirtual   #140 <Method boolean PropertyOptions.isQualifier()>
	//*   6   12:ifeq            46
			xmpnode1.removeQualifier(xmpnode);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #143 <Method void XMPNode.removeQualifier(XMPNode)>
		else
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #90  <Method boolean XMPNode.hasChildren()>
	//*  12   24:ifne            45
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*  15   31:invokevirtual   #146 <Method boolean PropertyOptions.isSchemaNode()>
	//*  16   34:ifeq            45
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #137 <Method XMPNode XMPNode.getParent()>
	//*  19   41:aload_1         
	//*  20   42:invokevirtual   #149 <Method void XMPNode.removeChild(XMPNode)>
	//*  21   45:return          
			xmpnode1.removeChild(xmpnode);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:invokevirtual   #149 <Method void XMPNode.removeChild(XMPNode)>
		if(!xmpnode1.hasChildren() && xmpnode1.getOptions().isSchemaNode())
			xmpnode1.getParent().removeChild(xmpnode1);
	//*  25   51:goto            20
	}

	static void detectAltText(XMPNode xmpnode)
	{
		if(xmpnode.getOptions().isArrayAlternate() && xmpnode.hasChildren())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*   2    4:invokevirtual   #153 <Method boolean PropertyOptions.isArrayAlternate()>
	//*   3    7:ifeq            72
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #90  <Method boolean XMPNode.hasChildren()>
	//*   6   14:ifeq            72
		{
			boolean flag1 = false;
	//    7   17:iconst_0        
	//    8   18:istore_2        
			Iterator iterator = xmpnode.iterateChildren();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #99  <Method Iterator XMPNode.iterateChildren()>
	//   11   23:astore_3        
			boolean flag;
			do
			{
				flag = flag1;
	//   12   24:iload_2         
	//   13   25:istore_1        
				if(!iterator.hasNext())
					break;
	//   14   26:aload_3         
	//   15   27:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   16   32:ifeq            55
				if(!((XMPNode)iterator.next()).getOptions().getHasLanguage())
					continue;
	//   17   35:aload_3         
	//   18   36:invokeinterface #108 <Method Object Iterator.next()>
	//   19   41:checkcast       #41  <Class XMPNode>
	//   20   44:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//   21   47:invokevirtual   #156 <Method boolean PropertyOptions.getHasLanguage()>
	//   22   50:ifeq            24
				flag = true;
	//   23   53:iconst_1        
	//   24   54:istore_1        
				break;
			} while(true);
			if(flag)
	//*  25   55:iload_1         
	//*  26   56:ifeq            72
			{
				xmpnode.getOptions().setArrayAltText(true);
	//   27   59:aload_0         
	//   28   60:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//   29   63:iconst_1        
	//   30   64:invokevirtual   #160 <Method PropertyOptions PropertyOptions.setArrayAltText(boolean)>
	//   31   67:pop             
				normalizeLangArray(xmpnode);
	//   32   68:aload_0         
	//   33   69:invokestatic    #163 <Method void normalizeLangArray(XMPNode)>
			}
		}
	//   34   72:return          
	}

	static XMPNode findChildNode(XMPNode xmpnode, String s, boolean flag)
		throws XMPException
	{
		if(!xmpnode.getOptions().isSchemaNode() && !xmpnode.getOptions().isStruct())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*   2    4:invokevirtual   #146 <Method boolean PropertyOptions.isSchemaNode()>
	//*   3    7:ifne            74
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*   6   14:invokevirtual   #168 <Method boolean PropertyOptions.isStruct()>
	//*   7   17:ifne            74
		{
			if(!xmpnode.isImplicit())
	//*   8   20:aload_0         
	//*   9   21:invokevirtual   #171 <Method boolean XMPNode.isImplicit()>
	//*  10   24:ifne            39
				throw new XMPException("Named children only allowed for schemas and structs", 102);
	//   11   27:new             #39  <Class XMPException>
	//   12   30:dup             
	//   13   31:ldc1            #173 <String "Named children only allowed for schemas and structs">
	//   14   33:bipush          102
	//   15   35:invokespecial   #87  <Method void XMPException(String, int)>
	//   16   38:athrow          
			if(xmpnode.getOptions().isArray())
	//*  17   39:aload_0         
	//*  18   40:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*  19   43:invokevirtual   #176 <Method boolean PropertyOptions.isArray()>
	//*  20   46:ifeq            61
				throw new XMPException("Named children not allowed for arrays", 102);
	//   21   49:new             #39  <Class XMPException>
	//   22   52:dup             
	//   23   53:ldc1            #178 <String "Named children not allowed for arrays">
	//   24   55:bipush          102
	//   25   57:invokespecial   #87  <Method void XMPException(String, int)>
	//   26   60:athrow          
			if(flag)
	//*  27   61:iload_2         
	//*  28   62:ifeq            74
				xmpnode.getOptions().setStruct(true);
	//   29   65:aload_0         
	//   30   66:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//   31   69:iconst_1        
	//   32   70:invokevirtual   #181 <Method PropertyOptions PropertyOptions.setStruct(boolean)>
	//   33   73:pop             
		}
		XMPNode xmpnode2 = xmpnode.findChildByName(s);
	//   34   74:aload_0         
	//   35   75:aload_1         
	//   36   76:invokevirtual   #185 <Method XMPNode XMPNode.findChildByName(String)>
	//   37   79:astore          4
		XMPNode xmpnode1 = xmpnode2;
	//   38   81:aload           4
	//   39   83:astore_3        
		if(xmpnode2 == null)
	//*  40   84:aload           4
	//*  41   86:ifnonnull       122
		{
			xmpnode1 = xmpnode2;
	//   42   89:aload           4
	//   43   91:astore_3        
			if(flag)
	//*  44   92:iload_2         
	//*  45   93:ifeq            122
			{
				xmpnode1 = new XMPNode(s, new PropertyOptions());
	//   46   96:new             #41  <Class XMPNode>
	//   47   99:dup             
	//   48  100:aload_1         
	//   49  101:new             #79  <Class PropertyOptions>
	//   50  104:dup             
	//   51  105:invokespecial   #186 <Method void PropertyOptions()>
	//   52  108:invokespecial   #189 <Method void XMPNode(String, PropertyOptions)>
	//   53  111:astore_3        
				xmpnode1.setImplicit(true);
	//   54  112:aload_3         
	//   55  113:iconst_1        
	//   56  114:invokevirtual   #193 <Method void XMPNode.setImplicit(boolean)>
				xmpnode.addChild(xmpnode1);
	//   57  117:aload_0         
	//   58  118:aload_3         
	//   59  119:invokevirtual   #67  <Method void XMPNode.addChild(XMPNode)>
			}
		}
		if(!$assertionsDisabled && xmpnode1 == null && flag)
	//*  60  122:getstatic       #31  <Field boolean $assertionsDisabled>
	//*  61  125:ifne            144
	//*  62  128:aload_3         
	//*  63  129:ifnonnull       144
	//*  64  132:iload_2         
	//*  65  133:ifeq            144
			throw new AssertionError();
	//   66  136:new             #195 <Class AssertionError>
	//   67  139:dup             
	//   68  140:invokespecial   #196 <Method void AssertionError()>
	//   69  143:athrow          
		else
			return xmpnode1;
	//   70  144:aload_3         
	//   71  145:areturn         
	}

	private static int findIndexedItem(XMPNode xmpnode, String s, boolean flag)
		throws XMPException
	{
		int i;
		try
		{
			i = Integer.parseInt(s.substring(1, s.length() - 1));
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokevirtual   #204 <Method int String.length()>
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:invokevirtual   #208 <Method String String.substring(int, int)>
	//    7   11:invokestatic    #212 <Method int Integer.parseInt(String)>
	//    8   14:istore_3        
		}
	//*   9   15:iload_3         
	//*  10   16:iconst_1        
	//*  11   17:icmpge          45
	//*  12   20:new             #39  <Class XMPException>
	//*  13   23:dup             
	//*  14   24:ldc1            #214 <String "Array index must be larger than zero">
	//*  15   26:bipush          102
	//*  16   28:invokespecial   #87  <Method void XMPException(String, int)>
	//*  17   31:athrow          
		// Misplaced declaration of an exception variable
		catch(XMPNode xmpnode)
	//*  18   32:astore_0        
		{
			throw new XMPException("Array index not digits.", 102);
	//   19   33:new             #39  <Class XMPException>
	//   20   36:dup             
	//   21   37:ldc1            #216 <String "Array index not digits.">
	//   22   39:bipush          102
	//   23   41:invokespecial   #87  <Method void XMPException(String, int)>
	//   24   44:athrow          
		}
		if(i >= 1)
			break MISSING_BLOCK_LABEL_45;
		throw new XMPException("Array index must be larger than zero", 102);
		if(flag && i == xmpnode.getChildrenLength() + 1)
	//*  25   45:iload_2         
	//*  26   46:ifeq            80
	//*  27   49:iload_3         
	//*  28   50:aload_0         
	//*  29   51:invokevirtual   #219 <Method int XMPNode.getChildrenLength()>
	//*  30   54:iconst_1        
	//*  31   55:iadd            
	//*  32   56:icmpne          80
		{
			s = ((String) (new XMPNode("[]", ((PropertyOptions) (null)))));
	//   33   59:new             #41  <Class XMPNode>
	//   34   62:dup             
	//   35   63:ldc1            #43  <String "[]">
	//   36   65:aconst_null     
	//   37   66:invokespecial   #189 <Method void XMPNode(String, PropertyOptions)>
	//   38   69:astore_1        
			((XMPNode) (s)).setImplicit(true);
	//   39   70:aload_1         
	//   40   71:iconst_1        
	//   41   72:invokevirtual   #193 <Method void XMPNode.setImplicit(boolean)>
			xmpnode.addChild(((XMPNode) (s)));
	//   42   75:aload_0         
	//   43   76:aload_1         
	//   44   77:invokevirtual   #67  <Method void XMPNode.addChild(XMPNode)>
		}
		return i;
	//   45   80:iload_3         
	//   46   81:ireturn         
	}

	static XMPNode findNode(XMPNode xmpnode, XMPPath xmppath, boolean flag, PropertyOptions propertyoptions)
		throws XMPException
	{
		XMPNode xmpnode1;
		XMPNode xmpnode2;
		if(xmppath == null || xmppath.size() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #226 <Method int XMPPath.size()>
	//*   4    8:ifne            23
			throw new XMPException("Empty XMPPath", 102);
	//    5   11:new             #39  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #228 <String "Empty XMPPath">
	//    8   17:bipush          102
	//    9   19:invokespecial   #87  <Method void XMPException(String, int)>
	//   10   22:athrow          
		xmpnode2 = null;
	//   11   23:aconst_null     
	//   12   24:astore          6
		xmpnode1 = findSchemaNode(xmpnode, xmppath.getSegment(0).getName(), flag);
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:iconst_0        
	//   16   29:invokevirtual   #232 <Method XMPPathSegment XMPPath.getSegment(int)>
	//   17   32:invokevirtual   #235 <Method String XMPPathSegment.getName()>
	//   18   35:iload_2         
	//   19   36:invokestatic    #238 <Method XMPNode findSchemaNode(XMPNode, String, boolean)>
	//   20   39:astore          5
		if(xmpnode1 != null) goto _L2; else goto _L1
	//   21   41:aload           5
	//   22   43:ifnonnull       48
_L1:
		return null;
	//   23   46:aconst_null     
	//   24   47:areturn         
_L2:
		int i;
		xmpnode = xmpnode2;
	//   25   48:aload           6
	//   26   50:astore_0        
		if(xmpnode1.isImplicit())
	//*  27   51:aload           5
	//*  28   53:invokevirtual   #171 <Method boolean XMPNode.isImplicit()>
	//*  29   56:ifeq            68
		{
			xmpnode1.setImplicit(false);
	//   30   59:aload           5
	//   31   61:iconst_0        
	//   32   62:invokevirtual   #193 <Method void XMPNode.setImplicit(boolean)>
			xmpnode = xmpnode1;
	//   33   65:aload           5
	//   34   67:astore_0        
		}
		i = 1;
	//   35   68:iconst_1        
	//   36   69:istore          4
_L3:
		if(i >= xmppath.size())
			break MISSING_BLOCK_LABEL_236;
	//   37   71:iload           4
	//   38   73:aload_1         
	//   39   74:invokevirtual   #226 <Method int XMPPath.size()>
	//   40   77:icmpge          236
		xmpnode1 = followXPathStep(xmpnode1, xmppath.getSegment(i), flag);
	//   41   80:aload           5
	//   42   82:aload_1         
	//   43   83:iload           4
	//   44   85:invokevirtual   #232 <Method XMPPathSegment XMPPath.getSegment(int)>
	//   45   88:iload_2         
	//   46   89:invokestatic    #242 <Method XMPNode followXPathStep(XMPNode, XMPPathSegment, boolean)>
	//   47   92:astore          5
label0:
		{
			if(xmpnode1 != null)
				break label0;
	//   48   94:aload           5
	//   49   96:ifnonnull       120
			if(flag)
	//*  50   99:iload_2         
	//*  51  100:ifeq            46
			{
				try
				{
					deleteNode(xmpnode);
	//   52  103:aload_0         
	//   53  104:invokestatic    #244 <Method void deleteNode(XMPNode)>
				}
	//*  54  107:aconst_null     
	//*  55  108:areturn         
				// Misplaced declaration of an exception variable
				catch(XMPPath xmppath)
	//*  56  109:astore_1        
				{
					if(xmpnode != null)
	//*  57  110:aload_0         
	//*  58  111:ifnull          118
						deleteNode(xmpnode);
	//   59  114:aload_0         
	//   60  115:invokestatic    #244 <Method void deleteNode(XMPNode)>
					throw xmppath;
	//   61  118:aload_1         
	//   62  119:athrow          
				}
				return null;
			}
		}
		  goto _L1
		xmpnode2 = xmpnode;
	//   63  120:aload_0         
	//   64  121:astore          6
		if(!xmpnode1.isImplicit())
			break MISSING_BLOCK_LABEL_273;
	//   65  123:aload           5
	//   66  125:invokevirtual   #171 <Method boolean XMPNode.isImplicit()>
	//   67  128:ifeq            273
		xmpnode1.setImplicit(false);
	//   68  131:aload           5
	//   69  133:iconst_0        
	//   70  134:invokevirtual   #193 <Method void XMPNode.setImplicit(boolean)>
		if(i != 1)
			break MISSING_BLOCK_LABEL_188;
	//   71  137:iload           4
	//   72  139:iconst_1        
	//   73  140:icmpne          188
		if(xmppath.getSegment(i).isAlias() && xmppath.getSegment(i).getAliasForm() != 0)
	//*  74  143:aload_1         
	//*  75  144:iload           4
	//*  76  146:invokevirtual   #232 <Method XMPPathSegment XMPPath.getSegment(int)>
	//*  77  149:invokevirtual   #247 <Method boolean XMPPathSegment.isAlias()>
	//*  78  152:ifeq            188
	//*  79  155:aload_1         
	//*  80  156:iload           4
	//*  81  158:invokevirtual   #232 <Method XMPPathSegment XMPPath.getSegment(int)>
	//*  82  161:invokevirtual   #250 <Method int XMPPathSegment.getAliasForm()>
	//*  83  164:ifeq            188
		{
			xmpnode1.getOptions().setOption(xmppath.getSegment(i).getAliasForm(), true);
	//   84  167:aload           5
	//   85  169:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//   86  172:aload_1         
	//   87  173:iload           4
	//   88  175:invokevirtual   #232 <Method XMPPathSegment XMPPath.getSegment(int)>
	//   89  178:invokevirtual   #250 <Method int XMPPathSegment.getAliasForm()>
	//   90  181:iconst_1        
	//   91  182:invokevirtual   #254 <Method void PropertyOptions.setOption(int, boolean)>
			break MISSING_BLOCK_LABEL_262;
	//   92  185:goto            262
		}
		if(i < xmppath.size() - 1 && xmppath.getSegment(i).getKind() == 1 && !xmpnode1.getOptions().isCompositeProperty())
	//*  93  188:iload           4
	//*  94  190:aload_1         
	//*  95  191:invokevirtual   #226 <Method int XMPPath.size()>
	//*  96  194:iconst_1        
	//*  97  195:isub            
	//*  98  196:icmpge          262
	//*  99  199:aload_1         
	//* 100  200:iload           4
	//* 101  202:invokevirtual   #232 <Method XMPPathSegment XMPPath.getSegment(int)>
	//* 102  205:invokevirtual   #257 <Method int XMPPathSegment.getKind()>
	//* 103  208:iconst_1        
	//* 104  209:icmpne          262
	//* 105  212:aload           5
	//* 106  214:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//* 107  217:invokevirtual   #111 <Method boolean PropertyOptions.isCompositeProperty()>
	//* 108  220:ifne            262
			xmpnode1.getOptions().setStruct(true);
	//  109  223:aload           5
	//  110  225:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//  111  228:iconst_1        
	//  112  229:invokevirtual   #181 <Method PropertyOptions PropertyOptions.setStruct(boolean)>
	//  113  232:pop             
		break MISSING_BLOCK_LABEL_262;
	//  114  233:goto            262
		if(xmpnode != null)
	//* 115  236:aload_0         
	//* 116  237:ifnull          259
		{
			xmpnode1.getOptions().mergeWith(propertyoptions);
	//  117  240:aload           5
	//  118  242:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//  119  245:aload_3         
	//  120  246:invokevirtual   #261 <Method void PropertyOptions.mergeWith(PropertyOptions)>
			xmpnode1.setOptions(xmpnode1.getOptions());
	//  121  249:aload           5
	//  122  251:aload           5
	//  123  253:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//  124  256:invokevirtual   #264 <Method void XMPNode.setOptions(PropertyOptions)>
		}
		return xmpnode1;
	//  125  259:aload           5
	//  126  261:areturn         
		xmpnode2 = xmpnode;
	//  127  262:aload_0         
	//  128  263:astore          6
		if(xmpnode == null)
	//* 129  265:aload_0         
	//* 130  266:ifnonnull       273
			xmpnode2 = xmpnode1;
	//  131  269:aload           5
	//  132  271:astore          6
		i++;
	//  133  273:iload           4
	//  134  275:iconst_1        
	//  135  276:iadd            
	//  136  277:istore          4
		xmpnode = xmpnode2;
	//  137  279:aload           6
	//  138  281:astore_0        
		  goto _L3
	//* 139  282:goto            71
	}

	private static XMPNode findQualifierNode(XMPNode xmpnode, String s, boolean flag)
		throws XMPException
	{
		if(!$assertionsDisabled && s.startsWith("?"))
	//*   0    0:getstatic       #31  <Field boolean $assertionsDisabled>
	//*   1    3:ifne            24
	//*   2    6:aload_1         
	//*   3    7:ldc2            #267 <String "?">
	//*   4   10:invokevirtual   #129 <Method boolean String.startsWith(String)>
	//*   5   13:ifeq            24
			throw new AssertionError();
	//    6   16:new             #195 <Class AssertionError>
	//    7   19:dup             
	//    8   20:invokespecial   #196 <Method void AssertionError()>
	//    9   23:athrow          
		XMPNode xmpnode2 = xmpnode.findQualifierByName(s);
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:invokevirtual   #270 <Method XMPNode XMPNode.findQualifierByName(String)>
	//   13   29:astore          4
		XMPNode xmpnode1 = xmpnode2;
	//   14   31:aload           4
	//   15   33:astore_3        
		if(xmpnode2 == null)
	//*  16   34:aload           4
	//*  17   36:ifnonnull       66
		{
			xmpnode1 = xmpnode2;
	//   18   39:aload           4
	//   19   41:astore_3        
			if(flag)
	//*  20   42:iload_2         
	//*  21   43:ifeq            66
			{
				xmpnode1 = new XMPNode(s, ((PropertyOptions) (null)));
	//   22   46:new             #41  <Class XMPNode>
	//   23   49:dup             
	//   24   50:aload_1         
	//   25   51:aconst_null     
	//   26   52:invokespecial   #189 <Method void XMPNode(String, PropertyOptions)>
	//   27   55:astore_3        
				xmpnode1.setImplicit(true);
	//   28   56:aload_3         
	//   29   57:iconst_1        
	//   30   58:invokevirtual   #193 <Method void XMPNode.setImplicit(boolean)>
				xmpnode.addQualifier(xmpnode1);
	//   31   61:aload_0         
	//   32   62:aload_3         
	//   33   63:invokevirtual   #52  <Method void XMPNode.addQualifier(XMPNode)>
			}
		}
		return xmpnode1;
	//   34   66:aload_3         
	//   35   67:areturn         
	}

	static XMPNode findSchemaNode(XMPNode xmpnode, String s, String s1, boolean flag)
		throws XMPException
	{
label0:
		{
			if(!$assertionsDisabled && xmpnode.getParent() != null)
	//*   0    0:getstatic       #31  <Field boolean $assertionsDisabled>
	//*   1    3:ifne            21
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #137 <Method XMPNode XMPNode.getParent()>
	//*   4   10:ifnull          21
				throw new AssertionError();
	//    5   13:new             #195 <Class AssertionError>
	//    6   16:dup             
	//    7   17:invokespecial   #196 <Method void AssertionError()>
	//    8   20:athrow          
			XMPNode xmpnode1 = xmpnode.findChildByName(s);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #185 <Method XMPNode XMPNode.findChildByName(String)>
	//   12   26:astore          5
			Object obj = ((Object) (xmpnode1));
	//   13   28:aload           5
	//   14   30:astore          4
			if(xmpnode1 == null)
	//*  15   32:aload           5
	//*  16   34:ifnonnull       132
			{
				obj = ((Object) (xmpnode1));
	//   17   37:aload           5
	//   18   39:astore          4
				if(flag)
	//*  19   41:iload_3         
	//*  20   42:ifeq            132
				{
					XMPNode xmpnode2 = new XMPNode(s, (new PropertyOptions()).setSchemaNode(true));
	//   21   45:new             #41  <Class XMPNode>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:new             #79  <Class PropertyOptions>
	//   25   53:dup             
	//   26   54:invokespecial   #186 <Method void PropertyOptions()>
	//   27   57:iconst_1        
	//   28   58:invokevirtual   #274 <Method PropertyOptions PropertyOptions.setSchemaNode(boolean)>
	//   29   61:invokespecial   #189 <Method void XMPNode(String, PropertyOptions)>
	//   30   64:astore          5
					xmpnode2.setImplicit(true);
	//   31   66:aload           5
	//   32   68:iconst_1        
	//   33   69:invokevirtual   #193 <Method void XMPNode.setImplicit(boolean)>
					String s2 = XMPMetaFactory.getSchemaRegistry().getNamespacePrefix(s);
	//   34   72:invokestatic    #280 <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//   35   75:aload_1         
	//   36   76:invokeinterface #286 <Method String XMPSchemaRegistry.getNamespacePrefix(String)>
	//   37   81:astore          6
					obj = ((Object) (s2));
	//   38   83:aload           6
	//   39   85:astore          4
					if(s2 == null)
	//*  40   87:aload           6
	//*  41   89:ifnonnull       115
					{
						if(s1 == null || s1.length() == 0)
							break label0;
	//   42   92:aload_2         
	//   43   93:ifnull          135
	//   44   96:aload_2         
	//   45   97:invokevirtual   #204 <Method int String.length()>
	//   46  100:ifeq            135
						obj = ((Object) (XMPMetaFactory.getSchemaRegistry().registerNamespace(s, s1)));
	//   47  103:invokestatic    #280 <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//   48  106:aload_1         
	//   49  107:aload_2         
	//   50  108:invokeinterface #290 <Method String XMPSchemaRegistry.registerNamespace(String, String)>
	//   51  113:astore          4
					}
					xmpnode2.setValue(((String) (obj)));
	//   52  115:aload           5
	//   53  117:aload           4
	//   54  119:invokevirtual   #294 <Method void XMPNode.setValue(String)>
					xmpnode.addChild(xmpnode2);
	//   55  122:aload_0         
	//   56  123:aload           5
	//   57  125:invokevirtual   #67  <Method void XMPNode.addChild(XMPNode)>
					obj = ((Object) (xmpnode2));
	//   58  128:aload           5
	//   59  130:astore          4
				}
			}
			return ((XMPNode) (obj));
	//   60  132:aload           4
	//   61  134:areturn         
		}
		throw new XMPException("Unregistered schema namespace URI", 101);
	//   62  135:new             #39  <Class XMPException>
	//   63  138:dup             
	//   64  139:ldc2            #296 <String "Unregistered schema namespace URI">
	//   65  142:bipush          101
	//   66  144:invokespecial   #87  <Method void XMPException(String, int)>
	//   67  147:athrow          
	}

	static XMPNode findSchemaNode(XMPNode xmpnode, String s, boolean flag)
		throws XMPException
	{
		return findSchemaNode(xmpnode, s, ((String) (null)), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:invokestatic    #298 <Method XMPNode findSchemaNode(XMPNode, String, String, boolean)>
	//    5    7:areturn         
	}

	private static XMPNode followXPathStep(XMPNode xmpnode, XMPPathSegment xmppathsegment, boolean flag)
		throws XMPException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		int i = xmppathsegment.getKind();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #257 <Method int XMPPathSegment.getKind()>
	//    4    7:istore_3        
		if(i == 1)
	//*   5    8:iload_3         
	//*   6    9:iconst_1        
	//*   7   10:icmpne          25
		{
			xmppathsegment = ((XMPPathSegment) (findChildNode(xmpnode, xmppathsegment.getName(), flag)));
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:invokevirtual   #235 <Method String XMPPathSegment.getName()>
	//   11   18:iload_2         
	//   12   19:invokestatic    #300 <Method XMPNode findChildNode(XMPNode, String, boolean)>
	//   13   22:astore_1        
		} else
	//*  14   23:aload_1         
	//*  15   24:areturn         
		{
			if(i == 2)
	//*  16   25:iload_3         
	//*  17   26:iconst_2        
	//*  18   27:icmpne          44
				return findQualifierNode(xmpnode, xmppathsegment.getName().substring(1), flag);
	//   19   30:aload_0         
	//   20   31:aload_1         
	//   21   32:invokevirtual   #235 <Method String XMPPathSegment.getName()>
	//   22   35:iconst_1        
	//   23   36:invokevirtual   #303 <Method String String.substring(int)>
	//   24   39:iload_2         
	//   25   40:invokestatic    #305 <Method XMPNode findQualifierNode(XMPNode, String, boolean)>
	//   26   43:areturn         
			if(!xmpnode.getOptions().isArray())
	//*  27   44:aload_0         
	//*  28   45:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*  29   48:invokevirtual   #176 <Method boolean PropertyOptions.isArray()>
	//*  30   51:ifne            67
				throw new XMPException("Indexing applied to non-array", 102);
	//   31   54:new             #39  <Class XMPException>
	//   32   57:dup             
	//   33   58:ldc2            #307 <String "Indexing applied to non-array">
	//   34   61:bipush          102
	//   35   63:invokespecial   #87  <Method void XMPException(String, int)>
	//   36   66:athrow          
			if(i == 3)
	//*  37   67:iload_3         
	//*  38   68:iconst_3        
	//*  39   69:icmpne          107
				i = findIndexedItem(xmpnode, xmppathsegment.getName(), flag);
	//   40   72:aload_0         
	//   41   73:aload_1         
	//   42   74:invokevirtual   #235 <Method String XMPPathSegment.getName()>
	//   43   77:iload_2         
	//   44   78:invokestatic    #309 <Method int findIndexedItem(XMPNode, String, boolean)>
	//   45   81:istore_3        
			else
	//*  46   82:aload           4
	//*  47   84:astore_1        
	//*  48   85:iconst_1        
	//*  49   86:iload_3         
	//*  50   87:icmpgt          23
	//*  51   90:aload           4
	//*  52   92:astore_1        
	//*  53   93:iload_3         
	//*  54   94:aload_0         
	//*  55   95:invokevirtual   #219 <Method int XMPNode.getChildrenLength()>
	//*  56   98:icmpgt          23
	//*  57  101:aload_0         
	//*  58  102:iload_3         
	//*  59  103:invokevirtual   #132 <Method XMPNode XMPNode.getChild(int)>
	//*  60  106:areturn         
			if(i == 4)
	//*  61  107:iload_3         
	//*  62  108:iconst_4        
	//*  63  109:icmpne          120
				i = xmpnode.getChildrenLength();
	//   64  112:aload_0         
	//   65  113:invokevirtual   #219 <Method int XMPNode.getChildrenLength()>
	//   66  116:istore_3        
			else
	//*  67  117:goto            82
			if(i == 6)
	//*  68  120:iload_3         
	//*  69  121:bipush          6
	//*  70  123:icmpne          148
			{
				xmppathsegment = ((XMPPathSegment) (Utils.splitNameAndValue(xmppathsegment.getName())));
	//   71  126:aload_1         
	//   72  127:invokevirtual   #235 <Method String XMPPathSegment.getName()>
	//   73  130:invokestatic    #315 <Method String[] Utils.splitNameAndValue(String)>
	//   74  133:astore_1        
				i = lookupFieldSelector(xmpnode, ((String) (xmppathsegment[0])), ((String) (xmppathsegment[1])));
	//   75  134:aload_0         
	//   76  135:aload_1         
	//   77  136:iconst_0        
	//   78  137:aaload          
	//   79  138:aload_1         
	//   80  139:iconst_1        
	//   81  140:aaload          
	//   82  141:invokestatic    #319 <Method int lookupFieldSelector(XMPNode, String, String)>
	//   83  144:istore_3        
			} else
	//*  84  145:goto            82
			if(i == 5)
	//*  85  148:iload_3         
	//*  86  149:iconst_5        
	//*  87  150:icmpne          182
			{
				String as[] = Utils.splitNameAndValue(xmppathsegment.getName());
	//   88  153:aload_1         
	//   89  154:invokevirtual   #235 <Method String XMPPathSegment.getName()>
	//   90  157:invokestatic    #315 <Method String[] Utils.splitNameAndValue(String)>
	//   91  160:astore          5
				i = lookupQualSelector(xmpnode, as[0], as[1], xmppathsegment.getAliasForm());
	//   92  162:aload_0         
	//   93  163:aload           5
	//   94  165:iconst_0        
	//   95  166:aaload          
	//   96  167:aload           5
	//   97  169:iconst_1        
	//   98  170:aaload          
	//   99  171:aload_1         
	//  100  172:invokevirtual   #250 <Method int XMPPathSegment.getAliasForm()>
	//  101  175:invokestatic    #323 <Method int lookupQualSelector(XMPNode, String, String, int)>
	//  102  178:istore_3        
			} else
	//* 103  179:goto            82
			{
				throw new XMPException("Unknown array indexing step in FollowXPathStep", 9);
	//  104  182:new             #39  <Class XMPException>
	//  105  185:dup             
	//  106  186:ldc2            #325 <String "Unknown array indexing step in FollowXPathStep">
	//  107  189:bipush          9
	//  108  191:invokespecial   #87  <Method void XMPException(String, int)>
	//  109  194:athrow          
			}
			xmppathsegment = ((XMPPathSegment) (obj));
			if(1 <= i)
			{
				xmppathsegment = ((XMPPathSegment) (obj));
				if(i <= xmpnode.getChildrenLength())
					return xmpnode.getChild(i);
			}
		}
		return ((XMPNode) (xmppathsegment));
	}

	private static int lookupFieldSelector(XMPNode xmpnode, String s, String s1)
		throws XMPException
	{
		int i;
		int j;
		j = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          4
		i = 1;
	//    2    3:iconst_1        
	//    3    4:istore_3        
_L8:
		if(i > xmpnode.getChildrenLength() || j >= 0) goto _L2; else goto _L1
	//    4    5:iload_3         
	//    5    6:aload_0         
	//    6    7:invokevirtual   #219 <Method int XMPNode.getChildrenLength()>
	//    7   10:icmpgt          122
	//    8   13:iload           4
	//    9   15:ifge            122
_L1:
		int l;
		XMPNode xmpnode1;
		xmpnode1 = xmpnode.getChild(i);
	//   10   18:aload_0         
	//   11   19:iload_3         
	//   12   20:invokevirtual   #132 <Method XMPNode XMPNode.getChild(int)>
	//   13   23:astore          7
		if(!xmpnode1.getOptions().isStruct())
	//*  14   25:aload           7
	//*  15   27:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*  16   30:invokevirtual   #168 <Method boolean PropertyOptions.isStruct()>
	//*  17   33:ifne            49
			throw new XMPException("Field selector must be used on array of struct", 102);
	//   18   36:new             #39  <Class XMPException>
	//   19   39:dup             
	//   20   40:ldc2            #327 <String "Field selector must be used on array of struct">
	//   21   43:bipush          102
	//   22   45:invokespecial   #87  <Method void XMPException(String, int)>
	//   23   48:athrow          
		l = 1;
	//   24   49:iconst_1        
	//   25   50:istore          6
_L5:
		int k;
		XMPNode xmpnode2;
		k = j;
	//   26   52:iload           4
	//   27   54:istore          5
		if(l > xmpnode1.getChildrenLength())
			break; /* Loop/switch isn't completed */
	//   28   56:iload           6
	//   29   58:aload           7
	//   30   60:invokevirtual   #219 <Method int XMPNode.getChildrenLength()>
	//   31   63:icmpgt          111
		xmpnode2 = xmpnode1.getChild(l);
	//   32   66:aload           7
	//   33   68:iload           6
	//   34   70:invokevirtual   #132 <Method XMPNode XMPNode.getChild(int)>
	//   35   73:astore          8
		  goto _L3
	//*  36   75:aload_1         
	//*  37   76:aload           8
	//*  38   78:invokevirtual   #123 <Method String XMPNode.getName()>
	//*  39   81:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  40   84:ifne            96
_L7:
		l++;
	//   41   87:iload           6
	//   42   89:iconst_1        
	//   43   90:iadd            
	//   44   91:istore          6
		if(true) goto _L5; else goto _L4
	//   45   93:goto            52
_L3:
		if(!s.equals(((Object) (xmpnode2.getName()))) || !s1.equals(((Object) (xmpnode2.getValue())))) goto _L7; else goto _L6
	//   46   96:aload_2         
	//   47   97:aload           8
	//   48   99:invokevirtual   #58  <Method String XMPNode.getValue()>
	//   49  102:invokevirtual   #64  <Method boolean String.equals(Object)>
	//   50  105:ifeq            87
_L6:
		k = i;
	//   51  108:iload_3         
	//   52  109:istore          5
_L4:
		i++;
	//   53  111:iload_3         
	//   54  112:iconst_1        
	//   55  113:iadd            
	//   56  114:istore_3        
		j = k;
	//   57  115:iload           5
	//   58  117:istore          4
		  goto _L8
	//*  59  119:goto            5
_L2:
		return j;
	//   60  122:iload           4
	//   61  124:ireturn         
	}

	static int lookupLanguageItem(XMPNode xmpnode, String s)
		throws XMPException
	{
		int i;
		if(!xmpnode.getOptions().isArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*   2    4:invokevirtual   #176 <Method boolean PropertyOptions.isArray()>
	//*   3    7:ifne            23
			throw new XMPException("Language item must be used on array", 102);
	//    4   10:new             #39  <Class XMPException>
	//    5   13:dup             
	//    6   14:ldc2            #331 <String "Language item must be used on array">
	//    7   17:bipush          102
	//    8   19:invokespecial   #87  <Method void XMPException(String, int)>
	//    9   22:athrow          
		i = 1;
	//   10   23:iconst_1        
	//   11   24:istore_2        
_L3:
		XMPNode xmpnode1;
		if(i > xmpnode.getChildrenLength())
			break; /* Loop/switch isn't completed */
	//   12   25:iload_2         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #219 <Method int XMPNode.getChildrenLength()>
	//   15   30:icmpgt          86
		xmpnode1 = xmpnode.getChild(i);
	//   16   33:aload_0         
	//   17   34:iload_2         
	//   18   35:invokevirtual   #132 <Method XMPNode XMPNode.getChild(int)>
	//   19   38:astore_3        
		  goto _L1
	//*  20   39:aload_3         
	//*  21   40:invokevirtual   #116 <Method boolean XMPNode.hasQualifier()>
	//*  22   43:ifeq            62
	//*  23   46:ldc1            #48  <String "xml:lang">
	//*  24   48:aload_3         
	//*  25   49:iconst_1        
	//*  26   50:invokevirtual   #120 <Method XMPNode XMPNode.getQualifier(int)>
	//*  27   53:invokevirtual   #123 <Method String XMPNode.getName()>
	//*  28   56:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  29   59:ifne            69
_L5:
		i++;
	//   30   62:iload_2         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:istore_2        
		if(true) goto _L3; else goto _L2
	//   34   66:goto            25
_L1:
		if(!xmpnode1.hasQualifier() || !"xml:lang".equals(((Object) (xmpnode1.getQualifier(1).getName()))) || !s.equals(((Object) (xmpnode1.getQualifier(1).getValue())))) goto _L5; else goto _L4
	//   35   69:aload_1         
	//   36   70:aload_3         
	//   37   71:iconst_1        
	//   38   72:invokevirtual   #120 <Method XMPNode XMPNode.getQualifier(int)>
	//   39   75:invokevirtual   #58  <Method String XMPNode.getValue()>
	//   40   78:invokevirtual   #64  <Method boolean String.equals(Object)>
	//   41   81:ifeq            62
_L4:
		return i;
	//   42   84:iload_2         
	//   43   85:ireturn         
_L2:
		return -1;
	//   44   86:iconst_m1       
	//   45   87:ireturn         
	}

	private static int lookupQualSelector(XMPNode xmpnode, String s, String s1, int i)
		throws XMPException
	{
		if("xml:lang".equals(((Object) (s))))
	//*   0    0:ldc1            #48  <String "xml:lang">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            70
		{
			int j = lookupLanguageItem(xmpnode, Utils.normalizeLangValue(s1));
	//    4    9:aload_0         
	//    5   10:aload_2         
	//    6   11:invokestatic    #334 <Method String Utils.normalizeLangValue(String)>
	//    7   14:invokestatic    #336 <Method int lookupLanguageItem(XMPNode, String)>
	//    8   17:istore          4
			if(j < 0 && (i & 0x1000) > 0)
	//*   9   19:iload           4
	//*  10   21:ifge            67
	//*  11   24:iload_3         
	//*  12   25:sipush          4096
	//*  13   28:iand            
	//*  14   29:ifle            67
			{
				s = ((String) (new XMPNode("[]", ((PropertyOptions) (null)))));
	//   15   32:new             #41  <Class XMPNode>
	//   16   35:dup             
	//   17   36:ldc1            #43  <String "[]">
	//   18   38:aconst_null     
	//   19   39:invokespecial   #189 <Method void XMPNode(String, PropertyOptions)>
	//   20   42:astore_1        
				((XMPNode) (s)).addQualifier(new XMPNode("xml:lang", "x-default", ((PropertyOptions) (null))));
	//   21   43:aload_1         
	//   22   44:new             #41  <Class XMPNode>
	//   23   47:dup             
	//   24   48:ldc1            #48  <String "xml:lang">
	//   25   50:ldc1            #54  <String "x-default">
	//   26   52:aconst_null     
	//   27   53:invokespecial   #46  <Method void XMPNode(String, String, PropertyOptions)>
	//   28   56:invokevirtual   #52  <Method void XMPNode.addQualifier(XMPNode)>
				xmpnode.addChild(1, ((XMPNode) (s)));
	//   29   59:aload_0         
	//   30   60:iconst_1        
	//   31   61:aload_1         
	//   32   62:invokevirtual   #70  <Method void XMPNode.addChild(int, XMPNode)>
				return 1;
	//   33   65:iconst_1        
	//   34   66:ireturn         
			} else
			{
				return j;
	//   35   67:iload           4
	//   36   69:ireturn         
			}
		}
		i = 1;
	//   37   70:iconst_1        
	//   38   71:istore_3        
		do
		{
			if(i >= xmpnode.getChildrenLength())
				break;
	//   39   72:iload_3         
	//   40   73:aload_0         
	//   41   74:invokevirtual   #219 <Method int XMPNode.getChildrenLength()>
	//   42   77:icmpge          145
			for(Iterator iterator = xmpnode.getChild(i).iterateQualifier(); iterator.hasNext();)
	//*  43   80:aload_0         
	//*  44   81:iload_3         
	//*  45   82:invokevirtual   #132 <Method XMPNode XMPNode.getChild(int)>
	//*  46   85:invokevirtual   #339 <Method Iterator XMPNode.iterateQualifier()>
	//*  47   88:astore          5
	//*  48   90:aload           5
	//*  49   92:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//*  50   97:ifeq            138
			{
				XMPNode xmpnode1 = (XMPNode)iterator.next();
	//   51  100:aload           5
	//   52  102:invokeinterface #108 <Method Object Iterator.next()>
	//   53  107:checkcast       #41  <Class XMPNode>
	//   54  110:astore          6
				if(s.equals(((Object) (xmpnode1.getName()))) && s1.equals(((Object) (xmpnode1.getValue()))))
	//*  55  112:aload_1         
	//*  56  113:aload           6
	//*  57  115:invokevirtual   #123 <Method String XMPNode.getName()>
	//*  58  118:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  59  121:ifeq            90
	//*  60  124:aload_2         
	//*  61  125:aload           6
	//*  62  127:invokevirtual   #58  <Method String XMPNode.getValue()>
	//*  63  130:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  64  133:ifeq            90
					return i;
	//   65  136:iload_3         
	//   66  137:ireturn         
			}

			i++;
	//   67  138:iload_3         
	//   68  139:iconst_1        
	//   69  140:iadd            
	//   70  141:istore_3        
		} while(true);
	//   71  142:goto            72
		return -1;
	//   72  145:iconst_m1       
	//   73  146:ireturn         
	}

	static void normalizeLangArray(XMPNode xmpnode)
	{
		if(xmpnode.getOptions().isArrayAltText()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//    2    4:invokevirtual   #82  <Method boolean PropertyOptions.isArrayAltText()>
	//    3    7:ifne            11
_L1:
		return;
	//    4   10:return          
_L2:
		int i = 2;
	//    5   11:iconst_2        
	//    6   12:istore_1        
_L6:
		if(i > xmpnode.getChildrenLength()) goto _L1; else goto _L3
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #219 <Method int XMPNode.getChildrenLength()>
	//   10   18:icmpgt          10
_L3:
		XMPNode xmpnode1;
		xmpnode1 = xmpnode.getChild(i);
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #132 <Method XMPNode XMPNode.getChild(int)>
	//   14   26:astore_2        
		if(!xmpnode1.hasQualifier() || !"x-default".equals(((Object) (xmpnode1.getQualifier(1).getValue()))))
			break MISSING_BLOCK_LABEL_94;
	//   15   27:aload_2         
	//   16   28:invokevirtual   #116 <Method boolean XMPNode.hasQualifier()>
	//   17   31:ifeq            94
	//   18   34:ldc1            #54  <String "x-default">
	//   19   36:aload_2         
	//   20   37:iconst_1        
	//   21   38:invokevirtual   #120 <Method XMPNode XMPNode.getQualifier(int)>
	//   22   41:invokevirtual   #58  <Method String XMPNode.getValue()>
	//   23   44:invokevirtual   #64  <Method boolean String.equals(Object)>
	//   24   47:ifeq            94
		xmpnode.removeChild(i);
	//   25   50:aload_0         
	//   26   51:iload_1         
	//   27   52:invokevirtual   #341 <Method void XMPNode.removeChild(int)>
		xmpnode.addChild(1, xmpnode1);
	//   28   55:aload_0         
	//   29   56:iconst_1        
	//   30   57:aload_2         
	//   31   58:invokevirtual   #70  <Method void XMPNode.addChild(int, XMPNode)>
_L5:
		if(i == 2)
	//*  32   61:iload_1         
	//*  33   62:iconst_2        
	//*  34   63:icmpne          10
		{
			xmpnode.getChild(2).setValue(xmpnode1.getValue());
	//   35   66:aload_0         
	//   36   67:iconst_2        
	//   37   68:invokevirtual   #132 <Method XMPNode XMPNode.getChild(int)>
	//   38   71:aload_2         
	//   39   72:invokevirtual   #58  <Method String XMPNode.getValue()>
	//   40   75:invokevirtual   #294 <Method void XMPNode.setValue(String)>
			return;
	//   41   78:return          
		}
		  goto _L1
		XMPException xmpexception;
		xmpexception;
	//   42   79:astore_3        
		if($assertionsDisabled) goto _L5; else goto _L4
	//   43   80:getstatic       #31  <Field boolean $assertionsDisabled>
	//   44   83:ifne            61
_L4:
		throw new AssertionError();
	//   45   86:new             #195 <Class AssertionError>
	//   46   89:dup             
	//   47   90:invokespecial   #196 <Method void AssertionError()>
	//   48   93:athrow          
		i++;
	//   49   94:iload_1         
	//   50   95:iconst_1        
	//   51   96:iadd            
	//   52   97:istore_1        
		  goto _L6
	//*  53   98:goto            13
	}

	static String serializeNodeValue(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_0        
		else
	//*   4    6:aload_0         
	//*   5    7:ifnull          167
	//*   6   10:aload_0         
	//*   7   11:invokestatic    #346 <Method String Utils.removeControlChars(String)>
	//*   8   14:areturn         
		if(obj instanceof Boolean)
	//*   9   15:aload_0         
	//*  10   16:instanceof      #348 <Class Boolean>
	//*  11   19:ifeq            36
			obj = ((Object) (XMPUtils.convertFromBoolean(((Boolean)obj).booleanValue())));
	//   12   22:aload_0         
	//   13   23:checkcast       #348 <Class Boolean>
	//   14   26:invokevirtual   #351 <Method boolean Boolean.booleanValue()>
	//   15   29:invokestatic    #357 <Method String XMPUtils.convertFromBoolean(boolean)>
	//   16   32:astore_0        
		else
	//*  17   33:goto            6
		if(obj instanceof Integer)
	//*  18   36:aload_0         
	//*  19   37:instanceof      #92  <Class Integer>
	//*  20   40:ifeq            57
			obj = ((Object) (XMPUtils.convertFromInteger(((Integer)obj).intValue())));
	//   21   43:aload_0         
	//   22   44:checkcast       #92  <Class Integer>
	//   23   47:invokevirtual   #360 <Method int Integer.intValue()>
	//   24   50:invokestatic    #363 <Method String XMPUtils.convertFromInteger(int)>
	//   25   53:astore_0        
		else
	//*  26   54:goto            6
		if(obj instanceof Long)
	//*  27   57:aload_0         
	//*  28   58:instanceof      #365 <Class Long>
	//*  29   61:ifeq            78
			obj = ((Object) (XMPUtils.convertFromLong(((Long)obj).longValue())));
	//   30   64:aload_0         
	//   31   65:checkcast       #365 <Class Long>
	//   32   68:invokevirtual   #369 <Method long Long.longValue()>
	//   33   71:invokestatic    #373 <Method String XMPUtils.convertFromLong(long)>
	//   34   74:astore_0        
		else
	//*  35   75:goto            6
		if(obj instanceof Double)
	//*  36   78:aload_0         
	//*  37   79:instanceof      #375 <Class Double>
	//*  38   82:ifeq            99
			obj = ((Object) (XMPUtils.convertFromDouble(((Double)obj).doubleValue())));
	//   39   85:aload_0         
	//   40   86:checkcast       #375 <Class Double>
	//   41   89:invokevirtual   #379 <Method double Double.doubleValue()>
	//   42   92:invokestatic    #383 <Method String XMPUtils.convertFromDouble(double)>
	//   43   95:astore_0        
		else
	//*  44   96:goto            6
		if(obj instanceof XMPDateTime)
	//*  45   99:aload_0         
	//*  46  100:instanceof      #385 <Class XMPDateTime>
	//*  47  103:ifeq            117
			obj = ((Object) (XMPUtils.convertFromDate((XMPDateTime)obj)));
	//   48  106:aload_0         
	//   49  107:checkcast       #385 <Class XMPDateTime>
	//   50  110:invokestatic    #389 <Method String XMPUtils.convertFromDate(XMPDateTime)>
	//   51  113:astore_0        
		else
	//*  52  114:goto            6
		if(obj instanceof GregorianCalendar)
	//*  53  117:aload_0         
	//*  54  118:instanceof      #391 <Class GregorianCalendar>
	//*  55  121:ifeq            138
			obj = ((Object) (XMPUtils.convertFromDate(XMPDateTimeFactory.createFromCalendar(((java.util.Calendar) ((GregorianCalendar)obj))))));
	//   56  124:aload_0         
	//   57  125:checkcast       #391 <Class GregorianCalendar>
	//   58  128:invokestatic    #397 <Method XMPDateTime XMPDateTimeFactory.createFromCalendar(java.util.Calendar)>
	//   59  131:invokestatic    #389 <Method String XMPUtils.convertFromDate(XMPDateTime)>
	//   60  134:astore_0        
		else
	//*  61  135:goto            6
		if(obj instanceof byte[])
	//*  62  138:aload_0         
	//*  63  139:instanceof      #399 <Class byte[]>
	//*  64  142:ifeq            159
			obj = ((Object) (XMPUtils.encodeBase64((byte[])(byte[])obj)));
	//   65  145:aload_0         
	//   66  146:checkcast       #399 <Class byte[]>
	//   67  149:checkcast       #399 <Class byte[]>
	//   68  152:invokestatic    #403 <Method String XMPUtils.encodeBase64(byte[])>
	//   69  155:astore_0        
		else
	//*  70  156:goto            6
			obj = ((Object) (obj.toString()));
	//   71  159:aload_0         
	//   72  160:invokevirtual   #406 <Method String Object.toString()>
	//   73  163:astore_0        
		if(obj != null)
			return Utils.removeControlChars(((String) (obj)));
		else
	//*  74  164:goto            6
			return null;
	//   75  167:aconst_null     
	//   76  168:areturn         
	}

	static void setNodeValue(XMPNode xmpnode, Object obj)
	{
		obj = ((Object) (serializeNodeValue(obj)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #410 <Method String serializeNodeValue(Object)>
	//    2    4:astore_1        
		if(!xmpnode.getOptions().isQualifier() || !"xml:lang".equals(((Object) (xmpnode.getName()))))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #77  <Method PropertyOptions XMPNode.getOptions()>
	//*   5    9:invokevirtual   #140 <Method boolean PropertyOptions.isQualifier()>
	//*   6   12:ifeq            27
	//*   7   15:ldc1            #48  <String "xml:lang">
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #123 <Method String XMPNode.getName()>
	//*  10   21:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  11   24:ifne            33
		{
			xmpnode.setValue(((String) (obj)));
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokevirtual   #294 <Method void XMPNode.setValue(String)>
			return;
	//   15   32:return          
		} else
		{
			xmpnode.setValue(Utils.normalizeLangValue(((String) (obj))));
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:invokestatic    #334 <Method String Utils.normalizeLangValue(String)>
	//   19   38:invokevirtual   #294 <Method void XMPNode.setValue(String)>
			return;
	//   20   41:return          
		}
	}

	static PropertyOptions verifySetOptions(PropertyOptions propertyoptions, Object obj)
		throws XMPException
	{
		PropertyOptions propertyoptions1 = propertyoptions;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(propertyoptions == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       14
			propertyoptions1 = new PropertyOptions();
	//    4    6:new             #79  <Class PropertyOptions>
	//    5    9:dup             
	//    6   10:invokespecial   #186 <Method void PropertyOptions()>
	//    7   13:astore_2        
		if(propertyoptions1.isArrayAltText())
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #82  <Method boolean PropertyOptions.isArrayAltText()>
	//*  10   18:ifeq            27
			propertyoptions1.setArrayAlternate(true);
	//   11   21:aload_2         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #415 <Method PropertyOptions PropertyOptions.setArrayAlternate(boolean)>
	//   14   26:pop             
		if(propertyoptions1.isArrayAlternate())
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #153 <Method boolean PropertyOptions.isArrayAlternate()>
	//*  17   31:ifeq            40
			propertyoptions1.setArrayOrdered(true);
	//   18   34:aload_2         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #418 <Method PropertyOptions PropertyOptions.setArrayOrdered(boolean)>
	//   21   39:pop             
		if(propertyoptions1.isArrayOrdered())
	//*  22   40:aload_2         
	//*  23   41:invokevirtual   #421 <Method boolean PropertyOptions.isArrayOrdered()>
	//*  24   44:ifeq            53
			propertyoptions1.setArray(true);
	//   25   47:aload_2         
	//   26   48:iconst_1        
	//   27   49:invokevirtual   #424 <Method PropertyOptions PropertyOptions.setArray(boolean)>
	//   28   52:pop             
		if(propertyoptions1.isCompositeProperty() && obj != null && obj.toString().length() > 0)
	//*  29   53:aload_2         
	//*  30   54:invokevirtual   #111 <Method boolean PropertyOptions.isCompositeProperty()>
	//*  31   57:ifeq            87
	//*  32   60:aload_1         
	//*  33   61:ifnull          87
	//*  34   64:aload_1         
	//*  35   65:invokevirtual   #406 <Method String Object.toString()>
	//*  36   68:invokevirtual   #204 <Method int String.length()>
	//*  37   71:ifle            87
		{
			throw new XMPException("Structs and arrays can't have values", 103);
	//   38   74:new             #39  <Class XMPException>
	//   39   77:dup             
	//   40   78:ldc2            #426 <String "Structs and arrays can't have values">
	//   41   81:bipush          103
	//   42   83:invokespecial   #87  <Method void XMPException(String, int)>
	//   43   86:athrow          
		} else
		{
			propertyoptions1.assertConsistency(propertyoptions1.getOptions());
	//   44   87:aload_2         
	//   45   88:aload_2         
	//   46   89:invokevirtual   #428 <Method int PropertyOptions.getOptions()>
	//   47   92:invokevirtual   #431 <Method void PropertyOptions.assertConsistency(int)>
			return propertyoptions1;
	//   48   95:aload_2         
	//   49   96:areturn         
		}
	}

	static final boolean $assertionsDisabled;
	static final int CLT_FIRST_ITEM = 5;
	static final int CLT_MULTIPLE_GENERIC = 3;
	static final int CLT_NO_VALUES = 0;
	static final int CLT_SINGLE_GENERIC = 2;
	static final int CLT_SPECIFIC_MATCH = 1;
	static final int CLT_XDEFAULT = 4;

	static 
	{
		boolean flag;
		if(!((Class) (com/itextpdf/xmp/impl/XMPNodeUtils)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class XMPNodeUtils>
	//*   1    2:invokevirtual   #29  <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #31  <Field boolean $assertionsDisabled>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		$assertionsDisabled = flag;
	//*  10   17:goto            10
	}
}
