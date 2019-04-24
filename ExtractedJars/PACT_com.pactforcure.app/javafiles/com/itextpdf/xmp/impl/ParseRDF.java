// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.options.PropertyOptions;
import java.util.*;
import org.w3c.dom.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPMetaImpl, XMPNodeUtils, XMPNode, Utils

public class ParseRDF
	implements XMPError, XMPConst
{

	public ParseRDF()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
	//    2    4:return          
	}

	private static XMPNode addChildNode(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node, String s, boolean flag)
		throws XMPException
	{
		boolean flag2;
label0:
		{
			XMPSchemaRegistry xmpschemaregistry = XMPMetaFactory.getSchemaRegistry();
	//    0    0:invokestatic    #71  <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//    1    3:astore          11
			String s1 = node.getNamespaceURI();
	//    2    5:aload_2         
	//    3    6:invokeinterface #77  <Method String Node.getNamespaceURI()>
	//    4   11:astore          9
			if(s1 != null)
	//*   5   13:aload           9
	//*   6   15:ifnull          280
			{
				Object obj = ((Object) (s1));
	//    7   18:aload           9
	//    8   20:astore          8
				if("http://purl.org/dc/1.1/".equals(((Object) (s1))))
	//*   9   22:ldc1            #79  <String "http://purl.org/dc/1.1/">
	//*  10   24:aload           9
	//*  11   26:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  12   29:ifeq            36
					obj = "http://purl.org/dc/elements/1.1/";
	//   13   32:ldc1            #87  <String "http://purl.org/dc/elements/1.1/">
	//   14   34:astore          8
				String s2 = xmpschemaregistry.getNamespacePrefix(((String) (obj)));
	//   15   36:aload           11
	//   16   38:aload           8
	//   17   40:invokeinterface #93  <Method String XMPSchemaRegistry.getNamespacePrefix(String)>
	//   18   45:astore          10
				s1 = s2;
	//   19   47:aload           10
	//   20   49:astore          9
				if(s2 == null)
	//*  21   51:aload           10
	//*  22   53:ifnonnull       86
				{
					boolean flag1;
					boolean flag3;
					PropertyOptions propertyoptions;
					if(node.getPrefix() != null)
	//*  23   56:aload_2         
	//*  24   57:invokeinterface #96  <Method String Node.getPrefix()>
	//*  25   62:ifnull          273
						s1 = node.getPrefix();
	//   26   65:aload_2         
	//   27   66:invokeinterface #96  <Method String Node.getPrefix()>
	//   28   71:astore          9
					else
	//*  29   73:aload           11
	//*  30   75:aload           8
	//*  31   77:aload           9
	//*  32   79:invokeinterface #100 <Method String XMPSchemaRegistry.registerNamespace(String, String)>
	//*  33   84:astore          9
	//*  34   86:new             #102 <Class StringBuilder>
	//*  35   89:dup             
	//*  36   90:invokespecial   #103 <Method void StringBuilder()>
	//*  37   93:aload           9
	//*  38   95:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  39   98:aload_2         
	//*  40   99:invokeinterface #110 <Method String Node.getLocalName()>
	//*  41  104:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//*  42  107:invokevirtual   #113 <Method String StringBuilder.toString()>
	//*  43  110:astore          9
	//*  44  112:new             #115 <Class PropertyOptions>
	//*  45  115:dup             
	//*  46  116:invokespecial   #116 <Method void PropertyOptions()>
	//*  47  119:astore          10
	//*  48  121:iconst_0        
	//*  49  122:istore          6
	//*  50  124:iload           6
	//*  51  126:istore          5
	//*  52  128:iload           4
	//*  53  130:ifeq            193
	//*  54  133:aload_0         
	//*  55  134:invokevirtual   #122 <Method XMPNode XMPMetaImpl.getRoot()>
	//*  56  137:aload           8
	//*  57  139:ldc1            #14  <String "_dflt">
	//*  58  141:iconst_1        
	//*  59  142:invokestatic    #128 <Method XMPNode XMPNodeUtils.findSchemaNode(XMPNode, String, String, boolean)>
	//*  60  145:astore          8
	//*  61  147:aload           8
	//*  62  149:iconst_0        
	//*  63  150:invokevirtual   #134 <Method void XMPNode.setImplicit(boolean)>
	//*  64  153:aload           8
	//*  65  155:astore_2        
	//*  66  156:iload           6
	//*  67  158:istore          5
	//*  68  160:aload_2         
	//*  69  161:astore_1        
	//*  70  162:aload           11
	//*  71  164:aload           9
	//*  72  166:invokeinterface #138 <Method com.itextpdf.xmp.properties.XMPAliasInfo XMPSchemaRegistry.findAlias(String)>
	//*  73  171:ifnull          193
	//*  74  174:iconst_1        
	//*  75  175:istore          5
	//*  76  177:aload_0         
	//*  77  178:invokevirtual   #122 <Method XMPNode XMPMetaImpl.getRoot()>
	//*  78  181:iconst_1        
	//*  79  182:invokevirtual   #141 <Method void XMPNode.setHasAliases(boolean)>
	//*  80  185:aload           8
	//*  81  187:iconst_1        
	//*  82  188:invokevirtual   #141 <Method void XMPNode.setHasAliases(boolean)>
	//*  83  191:aload_2         
	//*  84  192:astore_1        
	//*  85  193:ldc1            #143 <String "rdf:li">
	//*  86  195:aload           9
	//*  87  197:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  88  200:istore          6
	//*  89  202:ldc1            #145 <String "rdf:value">
	//*  90  204:aload           9
	//*  91  206:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  92  209:istore          7
	//*  93  211:new             #130 <Class XMPNode>
	//*  94  214:dup             
	//*  95  215:aload           9
	//*  96  217:aload_3         
	//*  97  218:aload           10
	//*  98  220:invokespecial   #148 <Method void XMPNode(String, String, PropertyOptions)>
	//*  99  223:astore_0        
	//* 100  224:aload_0         
	//* 101  225:iload           5
	//* 102  227:invokevirtual   #151 <Method void XMPNode.setAlias(boolean)>
	//* 103  230:iload           7
	//* 104  232:ifne            293
	//* 105  235:aload_1         
	//* 106  236:aload_0         
	//* 107  237:invokevirtual   #155 <Method void XMPNode.addChild(XMPNode)>
	//* 108  240:iload           7
	//* 109  242:ifeq            307
	//* 110  245:iload           4
	//* 111  247:ifne            260
	//* 112  250:aload_1         
	//* 113  251:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//* 114  254:invokevirtual   #162 <Method boolean PropertyOptions.isStruct()>
	//* 115  257:ifne            302
	//* 116  260:new             #65  <Class XMPException>
	//* 117  263:dup             
	//* 118  264:ldc1            #164 <String "Misplaced rdf:value element">
	//* 119  266:sipush          202
	//* 120  269:invokespecial   #167 <Method void XMPException(String, int)>
	//* 121  272:athrow          
						s1 = "_dflt";
	//  122  273:ldc1            #14  <String "_dflt">
	//  123  275:astore          9
					s1 = xmpschemaregistry.registerNamespace(((String) (obj)), s1);
				}
				s1 = (new StringBuilder()).append(s1).append(node.getLocalName()).toString();
				propertyoptions = new PropertyOptions();
				flag2 = false;
				flag1 = flag2;
				if(flag)
				{
					obj = ((Object) (XMPNodeUtils.findSchemaNode(xmpmetaimpl.getRoot(), ((String) (obj)), "_dflt", true)));
					((XMPNode) (obj)).setImplicit(false);
					node = ((Node) (obj));
					flag1 = flag2;
					xmpnode = ((XMPNode) (node));
					if(xmpschemaregistry.findAlias(s1) != null)
					{
						flag1 = true;
						xmpmetaimpl.getRoot().setHasAliases(true);
						((XMPNode) (obj)).setHasAliases(true);
						xmpnode = ((XMPNode) (node));
					}
				}
				flag2 = "rdf:li".equals(((Object) (s1)));
				flag3 = "rdf:value".equals(((Object) (s1)));
				xmpmetaimpl = ((XMPMetaImpl) (new XMPNode(s1, s, propertyoptions)));
				((XMPNode) (xmpmetaimpl)).setAlias(flag1);
				if(!flag3)
					xmpnode.addChild(((XMPNode) (xmpmetaimpl)));
				else
	//* 124  277:goto            73
	//* 125  280:new             #65  <Class XMPException>
	//* 126  283:dup             
	//* 127  284:ldc1            #169 <String "XML namespace required for all elements and attributes">
	//* 128  286:sipush          202
	//* 129  289:invokespecial   #167 <Method void XMPException(String, int)>
	//* 130  292:athrow          
					xmpnode.addChild(1, ((XMPNode) (xmpmetaimpl)));
	//  131  293:aload_1         
	//  132  294:iconst_1        
	//  133  295:aload_0         
	//  134  296:invokevirtual   #172 <Method void XMPNode.addChild(int, XMPNode)>
				if(!flag3)
					break label0;
				if(flag || !xmpnode.getOptions().isStruct())
					throw new XMPException("Misplaced rdf:value element", 202);
			} else
			{
				throw new XMPException("XML namespace required for all elements and attributes", 202);
			}
	//* 135  299:goto            240
			xmpnode.setHasValueChild(true);
	//  136  302:aload_1         
	//  137  303:iconst_1        
	//  138  304:invokevirtual   #175 <Method void XMPNode.setHasValueChild(boolean)>
		}
		if(flag2)
	//* 139  307:iload           6
	//* 140  309:ifeq            341
		{
			if(!xmpnode.getOptions().isArray())
	//* 141  312:aload_1         
	//* 142  313:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//* 143  316:invokevirtual   #178 <Method boolean PropertyOptions.isArray()>
	//* 144  319:ifne            335
				throw new XMPException("Misplaced rdf:li element", 202);
	//  145  322:new             #65  <Class XMPException>
	//  146  325:dup             
	//  147  326:ldc1            #180 <String "Misplaced rdf:li element">
	//  148  328:sipush          202
	//  149  331:invokespecial   #167 <Method void XMPException(String, int)>
	//  150  334:athrow          
			((XMPNode) (xmpmetaimpl)).setName("[]");
	//  151  335:aload_0         
	//  152  336:ldc1            #182 <String "[]">
	//  153  338:invokevirtual   #186 <Method void XMPNode.setName(String)>
		}
		return ((XMPNode) (xmpmetaimpl));
	//  154  341:aload_0         
	//  155  342:areturn         
	}

	private static XMPNode addQualifierNode(XMPNode xmpnode, String s, String s1)
		throws XMPException
	{
		String s2 = s1;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if("xml:lang".equals(((Object) (s))))
	//*   2    2:ldc1            #191 <String "xml:lang">
	//*   3    4:aload_1         
	//*   4    5:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*   5    8:ifeq            16
			s2 = Utils.normalizeLangValue(s1);
	//    6   11:aload_2         
	//    7   12:invokestatic    #196 <Method String Utils.normalizeLangValue(String)>
	//    8   15:astore_3        
		s = ((String) (new XMPNode(s, s2, ((PropertyOptions) (null)))));
	//    9   16:new             #130 <Class XMPNode>
	//   10   19:dup             
	//   11   20:aload_1         
	//   12   21:aload_3         
	//   13   22:aconst_null     
	//   14   23:invokespecial   #148 <Method void XMPNode(String, String, PropertyOptions)>
	//   15   26:astore_1        
		xmpnode.addQualifier(((XMPNode) (s)));
	//   16   27:aload_0         
	//   17   28:aload_1         
	//   18   29:invokevirtual   #199 <Method void XMPNode.addQualifier(XMPNode)>
		return ((XMPNode) (s));
	//   19   32:aload_1         
	//   20   33:areturn         
	}

	private static void fixupQualifiedNode(XMPNode xmpnode)
		throws XMPException
	{
		if(!$assertionsDisabled && (!xmpnode.getOptions().isStruct() || !xmpnode.hasChildren()))
	//*   0    0:getstatic       #57  <Field boolean $assertionsDisabled>
	//*   1    3:ifne            31
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//*   4   10:invokevirtual   #162 <Method boolean PropertyOptions.isStruct()>
	//*   5   13:ifeq            23
	//*   6   16:aload_0         
	//*   7   17:invokevirtual   #203 <Method boolean XMPNode.hasChildren()>
	//*   8   20:ifne            31
			throw new AssertionError();
	//    9   23:new             #205 <Class AssertionError>
	//   10   26:dup             
	//   11   27:invokespecial   #206 <Method void AssertionError()>
	//   12   30:athrow          
		Object obj = ((Object) (xmpnode.getChild(1)));
	//   13   31:aload_0         
	//   14   32:iconst_1        
	//   15   33:invokevirtual   #210 <Method XMPNode XMPNode.getChild(int)>
	//   16   36:astore_2        
		if(!$assertionsDisabled && !"rdf:value".equals(((Object) (((XMPNode) (obj)).getName()))))
	//*  17   37:getstatic       #57  <Field boolean $assertionsDisabled>
	//*  18   40:ifne            63
	//*  19   43:ldc1            #145 <String "rdf:value">
	//*  20   45:aload_2         
	//*  21   46:invokevirtual   #213 <Method String XMPNode.getName()>
	//*  22   49:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  23   52:ifne            63
			throw new AssertionError();
	//   24   55:new             #205 <Class AssertionError>
	//   25   58:dup             
	//   26   59:invokespecial   #206 <Method void AssertionError()>
	//   27   62:athrow          
		if(((XMPNode) (obj)).getOptions().getHasLanguage())
	//*  28   63:aload_2         
	//*  29   64:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//*  30   67:invokevirtual   #216 <Method boolean PropertyOptions.getHasLanguage()>
	//*  31   70:ifeq            112
		{
			if(xmpnode.getOptions().getHasLanguage())
	//*  32   73:aload_0         
	//*  33   74:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//*  34   77:invokevirtual   #216 <Method boolean PropertyOptions.getHasLanguage()>
	//*  35   80:ifeq            96
				throw new XMPException("Redundant xml:lang for rdf:value element", 203);
	//   36   83:new             #65  <Class XMPException>
	//   37   86:dup             
	//   38   87:ldc1            #218 <String "Redundant xml:lang for rdf:value element">
	//   39   89:sipush          203
	//   40   92:invokespecial   #167 <Method void XMPException(String, int)>
	//   41   95:athrow          
			XMPNode xmpnode1 = ((XMPNode) (obj)).getQualifier(1);
	//   42   96:aload_2         
	//   43   97:iconst_1        
	//   44   98:invokevirtual   #221 <Method XMPNode XMPNode.getQualifier(int)>
	//   45  101:astore_3        
			((XMPNode) (obj)).removeQualifier(xmpnode1);
	//   46  102:aload_2         
	//   47  103:aload_3         
	//   48  104:invokevirtual   #224 <Method void XMPNode.removeQualifier(XMPNode)>
			xmpnode.addQualifier(xmpnode1);
	//   49  107:aload_0         
	//   50  108:aload_3         
	//   51  109:invokevirtual   #199 <Method void XMPNode.addQualifier(XMPNode)>
		}
		for(int i = 1; i <= ((XMPNode) (obj)).getQualifierLength(); i++)
	//*  52  112:iconst_1        
	//*  53  113:istore_1        
	//*  54  114:iload_1         
	//*  55  115:aload_2         
	//*  56  116:invokevirtual   #228 <Method int XMPNode.getQualifierLength()>
	//*  57  119:icmpgt          138
			xmpnode.addQualifier(((XMPNode) (obj)).getQualifier(i));
	//   58  122:aload_0         
	//   59  123:aload_2         
	//   60  124:iload_1         
	//   61  125:invokevirtual   #221 <Method XMPNode XMPNode.getQualifier(int)>
	//   62  128:invokevirtual   #199 <Method void XMPNode.addQualifier(XMPNode)>

	//   63  131:iload_1         
	//   64  132:iconst_1        
	//   65  133:iadd            
	//   66  134:istore_1        
	//*  67  135:goto            114
		for(int j = 2; j <= xmpnode.getChildrenLength(); j++)
	//*  68  138:iconst_2        
	//*  69  139:istore_1        
	//*  70  140:iload_1         
	//*  71  141:aload_0         
	//*  72  142:invokevirtual   #231 <Method int XMPNode.getChildrenLength()>
	//*  73  145:icmpgt          164
			xmpnode.addQualifier(xmpnode.getChild(j));
	//   74  148:aload_0         
	//   75  149:aload_0         
	//   76  150:iload_1         
	//   77  151:invokevirtual   #210 <Method XMPNode XMPNode.getChild(int)>
	//   78  154:invokevirtual   #199 <Method void XMPNode.addQualifier(XMPNode)>

	//   79  157:iload_1         
	//   80  158:iconst_1        
	//   81  159:iadd            
	//   82  160:istore_1        
	//*  83  161:goto            140
		if(!$assertionsDisabled && !xmpnode.getOptions().isStruct() && !xmpnode.getHasValueChild())
	//*  84  164:getstatic       #57  <Field boolean $assertionsDisabled>
	//*  85  167:ifne            195
	//*  86  170:aload_0         
	//*  87  171:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//*  88  174:invokevirtual   #162 <Method boolean PropertyOptions.isStruct()>
	//*  89  177:ifne            195
	//*  90  180:aload_0         
	//*  91  181:invokevirtual   #234 <Method boolean XMPNode.getHasValueChild()>
	//*  92  184:ifne            195
			throw new AssertionError();
	//   93  187:new             #205 <Class AssertionError>
	//   94  190:dup             
	//   95  191:invokespecial   #206 <Method void AssertionError()>
	//   96  194:athrow          
		xmpnode.setHasValueChild(false);
	//   97  195:aload_0         
	//   98  196:iconst_0        
	//   99  197:invokevirtual   #175 <Method void XMPNode.setHasValueChild(boolean)>
		xmpnode.getOptions().setStruct(false);
	//  100  200:aload_0         
	//  101  201:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//  102  204:iconst_0        
	//  103  205:invokevirtual   #238 <Method PropertyOptions PropertyOptions.setStruct(boolean)>
	//  104  208:pop             
		xmpnode.getOptions().mergeWith(((XMPNode) (obj)).getOptions());
	//  105  209:aload_0         
	//  106  210:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//  107  213:aload_2         
	//  108  214:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//  109  217:invokevirtual   #242 <Method void PropertyOptions.mergeWith(PropertyOptions)>
		xmpnode.setValue(((XMPNode) (obj)).getValue());
	//  110  220:aload_0         
	//  111  221:aload_2         
	//  112  222:invokevirtual   #245 <Method String XMPNode.getValue()>
	//  113  225:invokevirtual   #248 <Method void XMPNode.setValue(String)>
		xmpnode.removeChildren();
	//  114  228:aload_0         
	//  115  229:invokevirtual   #251 <Method void XMPNode.removeChildren()>
		for(obj = ((Object) (((XMPNode) (obj)).iterateChildren())); ((Iterator) (obj)).hasNext(); xmpnode.addChild((XMPNode)((Iterator) (obj)).next()));
	//  116  232:aload_2         
	//  117  233:invokevirtual   #255 <Method Iterator XMPNode.iterateChildren()>
	//  118  236:astore_2        
	//  119  237:aload_2         
	//  120  238:invokeinterface #260 <Method boolean Iterator.hasNext()>
	//  121  243:ifeq            262
	//  122  246:aload_0         
	//  123  247:aload_2         
	//  124  248:invokeinterface #264 <Method Object Iterator.next()>
	//  125  253:checkcast       #130 <Class XMPNode>
	//  126  256:invokevirtual   #155 <Method void XMPNode.addChild(XMPNode)>
	//* 127  259:goto            237
	//  128  262:return          
	}

	private static int getRDFTermKind(Node node)
	{
		String s;
		String s2;
label0:
		{
			s2 = node.getLocalName();
	//    0    0:aload_0         
	//    1    1:invokeinterface #110 <Method String Node.getLocalName()>
	//    2    6:astore_3        
			String s1 = node.getNamespaceURI();
	//    3    7:aload_0         
	//    4    8:invokeinterface #77  <Method String Node.getNamespaceURI()>
	//    5   13:astore_2        
			s = s1;
	//    6   14:aload_2         
	//    7   15:astore_1        
			if(s1 != null)
				break label0;
	//    8   16:aload_2         
	//    9   17:ifnonnull       80
			if(!"about".equals(((Object) (s2))))
	//*  10   20:ldc2            #268 <String "about">
	//*  11   23:aload_3         
	//*  12   24:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  13   27:ifne            42
			{
				s = s1;
	//   14   30:aload_2         
	//   15   31:astore_1        
				if(!"ID".equals(((Object) (s2))))
					break label0;
	//   16   32:ldc2            #270 <String "ID">
	//   17   35:aload_3         
	//   18   36:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   19   39:ifeq            80
			}
			s = s1;
	//   20   42:aload_2         
	//   21   43:astore_1        
			if(node instanceof Attr)
	//*  22   44:aload_0         
	//*  23   45:instanceof      #272 <Class Attr>
	//*  24   48:ifeq            80
			{
				s = s1;
	//   25   51:aload_2         
	//   26   52:astore_1        
				if("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (((Attr)node).getOwnerElement().getNamespaceURI()))))
	//*  27   53:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//*  28   56:aload_0         
	//*  29   57:checkcast       #272 <Class Attr>
	//*  30   60:invokeinterface #278 <Method Element Attr.getOwnerElement()>
	//*  31   65:invokeinterface #281 <Method String Element.getNamespaceURI()>
	//*  32   70:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  33   73:ifeq            80
					s = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
	//   34   76:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//   35   79:astore_1        
			}
		}
		if("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (s))))
	//*  36   80:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//*  37   83:aload_1         
	//*  38   84:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  39   87:ifeq            241
		{
			if("li".equals(((Object) (s2))))
	//*  40   90:ldc2            #283 <String "li">
	//*  41   93:aload_3         
	//*  42   94:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  43   97:ifeq            103
				return 9;
	//   44  100:bipush          9
	//   45  102:ireturn         
			if("parseType".equals(((Object) (s2))))
	//*  46  103:ldc2            #285 <String "parseType">
	//*  47  106:aload_3         
	//*  48  107:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  49  110:ifeq            115
				return 4;
	//   50  113:iconst_4        
	//   51  114:ireturn         
			if("Description".equals(((Object) (s2))))
	//*  52  115:ldc2            #287 <String "Description">
	//*  53  118:aload_3         
	//*  54  119:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  55  122:ifeq            128
				return 8;
	//   56  125:bipush          8
	//   57  127:ireturn         
			if("about".equals(((Object) (s2))))
	//*  58  128:ldc2            #268 <String "about">
	//*  59  131:aload_3         
	//*  60  132:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  61  135:ifeq            140
				return 3;
	//   62  138:iconst_3        
	//   63  139:ireturn         
			if("resource".equals(((Object) (s2))))
	//*  64  140:ldc2            #289 <String "resource">
	//*  65  143:aload_3         
	//*  66  144:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  67  147:ifeq            152
				return 5;
	//   68  150:iconst_5        
	//   69  151:ireturn         
			if("RDF".equals(((Object) (s2))))
	//*  70  152:ldc2            #291 <String "RDF">
	//*  71  155:aload_3         
	//*  72  156:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  73  159:ifeq            164
				return 1;
	//   74  162:iconst_1        
	//   75  163:ireturn         
			if("ID".equals(((Object) (s2))))
	//*  76  164:ldc2            #270 <String "ID">
	//*  77  167:aload_3         
	//*  78  168:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  79  171:ifeq            176
				return 2;
	//   80  174:iconst_2        
	//   81  175:ireturn         
			if("nodeID".equals(((Object) (s2))))
	//*  82  176:ldc2            #293 <String "nodeID">
	//*  83  179:aload_3         
	//*  84  180:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  85  183:ifeq            189
				return 6;
	//   86  186:bipush          6
	//   87  188:ireturn         
			if("datatype".equals(((Object) (s2))))
	//*  88  189:ldc2            #295 <String "datatype">
	//*  89  192:aload_3         
	//*  90  193:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  91  196:ifeq            202
				return 7;
	//   92  199:bipush          7
	//   93  201:ireturn         
			if("aboutEach".equals(((Object) (s2))))
	//*  94  202:ldc2            #297 <String "aboutEach">
	//*  95  205:aload_3         
	//*  96  206:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  97  209:ifeq            215
				return 10;
	//   98  212:bipush          10
	//   99  214:ireturn         
			if("aboutEachPrefix".equals(((Object) (s2))))
	//* 100  215:ldc2            #299 <String "aboutEachPrefix">
	//* 101  218:aload_3         
	//* 102  219:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 103  222:ifeq            228
				return 11;
	//  104  225:bipush          11
	//  105  227:ireturn         
			if("bagID".equals(((Object) (s2))))
	//* 106  228:ldc2            #301 <String "bagID">
	//* 107  231:aload_3         
	//* 108  232:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 109  235:ifeq            241
				return 12;
	//  110  238:bipush          12
	//  111  240:ireturn         
		}
		return 0;
	//  112  241:iconst_0        
	//  113  242:ireturn         
	}

	private static boolean isCoreSyntaxTerm(int i)
	{
		return 1 <= i && i <= 7;
	//    0    0:iconst_1        
	//    1    1:iload_0         
	//    2    2:icmpgt          13
	//    3    5:iload_0         
	//    4    6:bipush          7
	//    5    8:icmpgt          13
	//    6   11:iconst_1        
	//    7   12:ireturn         
	//    8   13:iconst_0        
	//    9   14:ireturn         
	}

	private static boolean isOldTerm(int i)
	{
		return 10 <= i && i <= 12;
	//    0    0:bipush          10
	//    1    2:iload_0         
	//    2    3:icmpgt          14
	//    3    6:iload_0         
	//    4    7:bipush          12
	//    5    9:icmpgt          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private static boolean isPropertyElementName(int i)
	{
		while(i == 8 || isOldTerm(i) || isCoreSyntaxTerm(i)) 
	//*   0    0:iload_0         
	//*   1    1:bipush          8
	//*   2    3:icmpeq          13
	//*   3    6:iload_0         
	//*   4    7:invokestatic    #307 <Method boolean isOldTerm(int)>
	//*   5   10:ifeq            15
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	//    8   15:iload_0         
	//    9   16:invokestatic    #309 <Method boolean isCoreSyntaxTerm(int)>
	//   10   19:ifne            13
		return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
	}

	private static boolean isWhitespaceNode(Node node)
	{
		if(node.getNodeType() == 3) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokeinterface #315 <Method short Node.getNodeType()>
	//    2    6:iconst_3        
	//    3    7:icmpeq          12
_L1:
		return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
_L2:
		node = ((Node) (node.getNodeValue()));
	//    6   12:aload_0         
	//    7   13:invokeinterface #318 <Method String Node.getNodeValue()>
	//    8   18:astore_0        
		int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
label0:
		do
		{
label1:
			{
				if(i >= ((String) (node)).length())
					break label1;
	//   11   21:iload_1         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #321 <Method int String.length()>
	//   14   26:icmpge          47
				if(!Character.isWhitespace(((String) (node)).charAt(i)))
					break label0;
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #325 <Method char String.charAt(int)>
	//   18   34:invokestatic    #331 <Method boolean Character.isWhitespace(char)>
	//   19   37:ifeq            10
				i++;
	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:istore_1        
			}
		} while(true);
	//   24   44:goto            21
		if(true) goto _L1; else goto _L3
_L3:
		return true;
	//   25   47:iconst_1        
	//   26   48:ireturn         
	}

	static XMPMetaImpl parse(Node node)
		throws XMPException
	{
		XMPMetaImpl xmpmetaimpl = new XMPMetaImpl();
	//    0    0:new             #118 <Class XMPMetaImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #334 <Method void XMPMetaImpl()>
	//    3    7:astore_1        
		rdf_RDF(xmpmetaimpl, node);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #338 <Method void rdf_RDF(XMPMetaImpl, Node)>
		return xmpmetaimpl;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	private static void rdf_EmptyPropertyElement(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node, boolean flag)
		throws XMPException
	{
		boolean flag1;
		int j;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		Node node1;
		flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		flag4 = false;
	//    2    3:iconst_0        
	//    3    4:istore          7
		flag5 = false;
	//    4    6:iconst_0        
	//    5    7:istore          8
		flag1 = false;
	//    6    9:iconst_0        
	//    7   10:istore          4
		node1 = null;
	//    8   12:aconst_null     
	//    9   13:astore          14
		if(node.hasChildNodes())
	//*  10   15:aload_2         
	//*  11   16:invokeinterface #343 <Method boolean Node.hasChildNodes()>
	//*  12   21:ifeq            38
			throw new XMPException("Nested content not allowed with rdf:resource or property attributes", 202);
	//   13   24:new             #65  <Class XMPException>
	//   14   27:dup             
	//   15   28:ldc2            #345 <String "Nested content not allowed with rdf:resource or property attributes">
	//   16   31:sipush          202
	//   17   34:invokespecial   #167 <Method void XMPException(String, int)>
	//   18   37:athrow          
		j = 0;
	//   19   38:iconst_0        
	//   20   39:istore          5
_L7:
		if(j >= node.getAttributes().getLength()) goto _L2; else goto _L1
	//   21   41:iload           5
	//   22   43:aload_2         
	//   23   44:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   24   49:invokeinterface #354 <Method int NamedNodeMap.getLength()>
	//   25   54:icmpge          526
_L1:
		boolean flag6;
		boolean flag7;
		boolean flag8;
		boolean flag9;
		Object obj;
		Node node2;
		node2 = node.getAttributes().item(j);
	//   26   57:aload_2         
	//   27   58:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   28   63:iload           5
	//   29   65:invokeinterface #358 <Method Node NamedNodeMap.item(int)>
	//   30   70:astore          15
		flag6 = flag5;
	//   31   72:iload           8
	//   32   74:istore          9
		flag7 = flag3;
	//   33   76:iload           6
	//   34   78:istore          10
		flag8 = flag4;
	//   35   80:iload           7
	//   36   82:istore          11
		flag9 = flag1;
	//   37   84:iload           4
	//   38   86:istore          12
		obj = ((Object) (node1));
	//   39   88:aload           14
	//   40   90:astore          13
		if("xmlns".equals(((Object) (node2.getPrefix())))) goto _L4; else goto _L3
	//   41   92:ldc2            #360 <String "xmlns">
	//   42   95:aload           15
	//   43   97:invokeinterface #96  <Method String Node.getPrefix()>
	//   44  102:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   45  105:ifne            154
_L3:
		if(node2.getPrefix() != null || !"xmlns".equals(((Object) (node2.getNodeName())))) goto _L6; else goto _L5
	//   46  108:aload           15
	//   47  110:invokeinterface #96  <Method String Node.getPrefix()>
	//   48  115:ifnonnull       183
	//   49  118:ldc2            #360 <String "xmlns">
	//   50  121:aload           15
	//   51  123:invokeinterface #363 <Method String Node.getNodeName()>
	//   52  128:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   53  131:ifeq            183
_L5:
		obj = ((Object) (node1));
	//   54  134:aload           14
	//   55  136:astore          13
		flag9 = flag1;
	//   56  138:iload           4
	//   57  140:istore          12
		flag8 = flag4;
	//   58  142:iload           7
	//   59  144:istore          11
		flag7 = flag3;
	//   60  146:iload           6
	//   61  148:istore          10
		flag6 = flag5;
	//   62  150:iload           8
	//   63  152:istore          9
_L4:
		j++;
	//   64  154:iload           5
	//   65  156:iconst_1        
	//   66  157:iadd            
	//   67  158:istore          5
		flag5 = flag6;
	//   68  160:iload           9
	//   69  162:istore          8
		flag3 = flag7;
	//   70  164:iload           10
	//   71  166:istore          6
		flag4 = flag8;
	//   72  168:iload           11
	//   73  170:istore          7
		flag1 = flag9;
	//   74  172:iload           12
	//   75  174:istore          4
		node1 = ((Node) (obj));
	//   76  176:aload           13
	//   77  178:astore          14
		  goto _L7
	//*  78  180:goto            41
_L6:
		flag6 = flag5;
	//   79  183:iload           8
	//   80  185:istore          9
		flag7 = flag3;
	//   81  187:iload           6
	//   82  189:istore          10
		flag8 = flag4;
	//   83  191:iload           7
	//   84  193:istore          11
		flag9 = flag1;
	//   85  195:iload           4
	//   86  197:istore          12
		obj = ((Object) (node1));
	//   87  199:aload           14
	//   88  201:astore          13
		switch(getRDFTermKind(node2))
	//*  89  203:aload           15
	//*  90  205:invokestatic    #365 <Method int getRDFTermKind(Node)>
		{
	//*  91  208:tableswitch     0 6: default 252
	//	               0 396
	//	               1 252
	//	               2 154
	//	               3 252
	//	               4 252
	//	               5 266
	//	               6 355
		case 1: // '\001'
		case 3: // '\003'
		case 4: // '\004'
		default:
			throw new XMPException("Unrecognized attribute of empty property element", 202);
	//   92  252:new             #65  <Class XMPException>
	//   93  255:dup             
	//   94  256:ldc2            #367 <String "Unrecognized attribute of empty property element">
	//   95  259:sipush          202
	//   96  262:invokespecial   #167 <Method void XMPException(String, int)>
	//   97  265:athrow          

		case 5: // '\005'
			if(flag5)
	//*  98  266:iload           8
	//*  99  268:ifeq            285
				throw new XMPException("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
	//  100  271:new             #65  <Class XMPException>
	//  101  274:dup             
	//  102  275:ldc2            #369 <String "Empty property element can't have both rdf:resource and rdf:nodeID">
	//  103  278:sipush          202
	//  104  281:invokespecial   #167 <Method void XMPException(String, int)>
	//  105  284:athrow          
			if(flag1)
	//* 106  285:iload           4
	//* 107  287:ifeq            304
				throw new XMPException("Empty property element can't have both rdf:value and rdf:resource", 203);
	//  108  290:new             #65  <Class XMPException>
	//  109  293:dup             
	//  110  294:ldc2            #371 <String "Empty property element can't have both rdf:value and rdf:resource">
	//  111  297:sipush          203
	//  112  300:invokespecial   #167 <Method void XMPException(String, int)>
	//  113  303:athrow          
			flag4 = true;
	//  114  304:iconst_1        
	//  115  305:istore          7
			flag6 = flag5;
	//  116  307:iload           8
	//  117  309:istore          9
			flag7 = flag3;
	//  118  311:iload           6
	//  119  313:istore          10
			flag8 = flag4;
	//  120  315:iload           7
	//  121  317:istore          11
			flag9 = flag1;
	//  122  319:iload           4
	//  123  321:istore          12
			obj = ((Object) (node1));
	//  124  323:aload           14
	//  125  325:astore          13
			if(!flag1)
	//* 126  327:iload           4
	//* 127  329:ifne            154
			{
				obj = ((Object) (node2));
	//  128  332:aload           15
	//  129  334:astore          13
				flag6 = flag5;
	//  130  336:iload           8
	//  131  338:istore          9
				flag7 = flag3;
	//  132  340:iload           6
	//  133  342:istore          10
				flag8 = flag4;
	//  134  344:iload           7
	//  135  346:istore          11
				flag9 = flag1;
	//  136  348:iload           4
	//  137  350:istore          12
			}
			break;

	//* 138  352:goto            154
		case 6: // '\006'
			if(flag4)
	//* 139  355:iload           7
	//* 140  357:ifeq            374
				throw new XMPException("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
	//  141  360:new             #65  <Class XMPException>
	//  142  363:dup             
	//  143  364:ldc2            #369 <String "Empty property element can't have both rdf:resource and rdf:nodeID">
	//  144  367:sipush          202
	//  145  370:invokespecial   #167 <Method void XMPException(String, int)>
	//  146  373:athrow          
			flag6 = true;
	//  147  374:iconst_1        
	//  148  375:istore          9
			flag7 = flag3;
	//  149  377:iload           6
	//  150  379:istore          10
			flag8 = flag4;
	//  151  381:iload           7
	//  152  383:istore          11
			flag9 = flag1;
	//  153  385:iload           4
	//  154  387:istore          12
			obj = ((Object) (node1));
	//  155  389:aload           14
	//  156  391:astore          13
			break;

	//* 157  393:goto            154
		case 0: // '\0'
			if("value".equals(((Object) (node2.getLocalName()))) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (node2.getNamespaceURI()))))
	//* 158  396:ldc2            #373 <String "value">
	//* 159  399:aload           15
	//* 160  401:invokeinterface #110 <Method String Node.getLocalName()>
	//* 161  406:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 162  409:ifeq            469
	//* 163  412:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//* 164  415:aload           15
	//* 165  417:invokeinterface #77  <Method String Node.getNamespaceURI()>
	//* 166  422:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 167  425:ifeq            469
			{
				if(flag4)
	//* 168  428:iload           7
	//* 169  430:ifeq            447
					throw new XMPException("Empty property element can't have both rdf:value and rdf:resource", 203);
	//  170  433:new             #65  <Class XMPException>
	//  171  436:dup             
	//  172  437:ldc2            #371 <String "Empty property element can't have both rdf:value and rdf:resource">
	//  173  440:sipush          203
	//  174  443:invokespecial   #167 <Method void XMPException(String, int)>
	//  175  446:athrow          
				flag9 = true;
	//  176  447:iconst_1        
	//  177  448:istore          12
				obj = ((Object) (node2));
	//  178  450:aload           15
	//  179  452:astore          13
				flag6 = flag5;
	//  180  454:iload           8
	//  181  456:istore          9
				flag7 = flag3;
	//  182  458:iload           6
	//  183  460:istore          10
				flag8 = flag4;
	//  184  462:iload           7
	//  185  464:istore          11
			} else
	//* 186  466:goto            154
			{
				flag6 = flag5;
	//  187  469:iload           8
	//  188  471:istore          9
				flag7 = flag3;
	//  189  473:iload           6
	//  190  475:istore          10
				flag8 = flag4;
	//  191  477:iload           7
	//  192  479:istore          11
				flag9 = flag1;
	//  193  481:iload           4
	//  194  483:istore          12
				obj = ((Object) (node1));
	//  195  485:aload           14
	//  196  487:astore          13
				if(!"xml:lang".equals(((Object) (node2.getNodeName()))))
	//* 197  489:ldc1            #191 <String "xml:lang">
	//* 198  491:aload           15
	//* 199  493:invokeinterface #363 <Method String Node.getNodeName()>
	//* 200  498:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 201  501:ifne            154
				{
					flag7 = true;
	//  202  504:iconst_1        
	//  203  505:istore          10
					flag6 = flag5;
	//  204  507:iload           8
	//  205  509:istore          9
					flag8 = flag4;
	//  206  511:iload           7
	//  207  513:istore          11
					flag9 = flag1;
	//  208  515:iload           4
	//  209  517:istore          12
					obj = ((Object) (node1));
	//  210  519:aload           14
	//  211  521:astore          13
				}
			}
			break;

		case 2: // '\002'
			break;
		}
		continue; /* Loop/switch isn't completed */
	//  212  523:goto            154
_L2:
		obj = ((Object) (addChildNode(xmpmetaimpl, xmpnode, node, "", flag)));
	//  213  526:aload_0         
	//  214  527:aload_1         
	//  215  528:aload_2         
	//  216  529:ldc2            #375 <String "">
	//  217  532:iload_3         
	//  218  533:invokestatic    #377 <Method XMPNode addChildNode(XMPMetaImpl, XMPNode, Node, String, boolean)>
	//  219  536:astore          13
		flag5 = false;
	//  220  538:iconst_0        
	//  221  539:istore          8
		if(!flag1 && !flag4) goto _L9; else goto _L8
	//  222  541:iload           4
	//  223  543:ifne            551
	//  224  546:iload           7
	//  225  548:ifeq            687
_L8:
		boolean flag2;
		int i;
		if(node1 != null)
	//* 226  551:aload           14
	//* 227  553:ifnull          680
			xmpnode = ((XMPNode) (node1.getNodeValue()));
	//  228  556:aload           14
	//  229  558:invokeinterface #318 <Method String Node.getNodeValue()>
	//  230  563:astore_1        
		else
	//* 231  564:aload           13
	//* 232  566:aload_1         
	//* 233  567:invokevirtual   #248 <Method void XMPNode.setValue(String)>
	//* 234  570:iload           8
	//* 235  572:istore          5
	//* 236  574:iload           4
	//* 237  576:ifne            593
	//* 238  579:aload           13
	//* 239  581:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//* 240  584:iconst_1        
	//* 241  585:invokevirtual   #380 <Method PropertyOptions PropertyOptions.setURI(boolean)>
	//* 242  588:pop             
	//* 243  589:iload           8
	//* 244  591:istore          5
	//* 245  593:iconst_0        
	//* 246  594:istore          4
	//* 247  596:iload           4
	//* 248  598:aload_2         
	//* 249  599:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//* 250  604:invokeinterface #354 <Method int NamedNodeMap.getLength()>
	//* 251  609:icmpge          867
	//* 252  612:aload_2         
	//* 253  613:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//* 254  618:iload           4
	//* 255  620:invokeinterface #358 <Method Node NamedNodeMap.item(int)>
	//* 256  625:astore_1        
	//* 257  626:aload_1         
	//* 258  627:aload           14
	//* 259  629:if_acmpeq       671
	//* 260  632:ldc2            #360 <String "xmlns">
	//* 261  635:aload_1         
	//* 262  636:invokeinterface #96  <Method String Node.getPrefix()>
	//* 263  641:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 264  644:ifne            671
	//* 265  647:aload_1         
	//* 266  648:invokeinterface #96  <Method String Node.getPrefix()>
	//* 267  653:ifnonnull       712
	//* 268  656:ldc2            #360 <String "xmlns">
	//* 269  659:aload_1         
	//* 270  660:invokeinterface #363 <Method String Node.getNodeName()>
	//* 271  665:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 272  668:ifeq            712
	//* 273  671:iload           4
	//* 274  673:iconst_1        
	//* 275  674:iadd            
	//* 276  675:istore          4
	//* 277  677:goto            596
			xmpnode = "";
	//  278  680:ldc2            #375 <String "">
	//  279  683:astore_1        
		((XMPNode) (obj)).setValue(((String) (xmpnode)));
		flag2 = flag5;
		if(!flag1)
		{
			((XMPNode) (obj)).getOptions().setURI(true);
			flag2 = flag5;
		}
_L15:
		i = 0;
_L11:
		if(i >= node.getAttributes().getLength())
			continue; /* Loop/switch isn't completed */
		xmpnode = ((XMPNode) (node.getAttributes().item(i)));
		if(xmpnode != node1 && !"xmlns".equals(((Object) (((Node) (xmpnode)).getPrefix()))) && (((Node) (xmpnode)).getPrefix() != null || !"xmlns".equals(((Object) (((Node) (xmpnode)).getNodeName())))))
			break; /* Loop/switch isn't completed */
_L13:
		i++;
		if(true) goto _L11; else goto _L10
	//* 280  684:goto            564
_L9:
		flag2 = flag5;
	//  281  687:iload           8
	//  282  689:istore          5
		if(flag3)
	//* 283  691:iload           6
	//* 284  693:ifeq            593
		{
			((XMPNode) (obj)).getOptions().setStruct(true);
	//  285  696:aload           13
	//  286  698:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//  287  701:iconst_1        
	//  288  702:invokevirtual   #238 <Method PropertyOptions PropertyOptions.setStruct(boolean)>
	//  289  705:pop             
			flag2 = true;
	//  290  706:iconst_1        
	//  291  707:istore          5
		}
		continue; /* Loop/switch isn't completed */
	//  292  709:goto            593
_L10:
		switch(getRDFTermKind(((Node) (xmpnode))))
	//* 293  712:aload_1         
	//* 294  713:invokestatic    #365 <Method int getRDFTermKind(Node)>
		{
	//* 295  716:tableswitch     0 6: default 760
	//	               0 792
	//	               1 760
	//	               2 671
	//	               3 760
	//	               4 760
	//	               5 774
	//	               6 671
		case 1: // '\001'
		case 3: // '\003'
		case 4: // '\004'
		default:
			throw new XMPException("Unrecognized attribute of empty property element", 202);
	//  296  760:new             #65  <Class XMPException>
	//  297  763:dup             
	//  298  764:ldc2            #367 <String "Unrecognized attribute of empty property element">
	//  299  767:sipush          202
	//  300  770:invokespecial   #167 <Method void XMPException(String, int)>
	//  301  773:athrow          

		case 5: // '\005'
			addQualifierNode(((XMPNode) (obj)), "rdf:resource", ((Node) (xmpnode)).getNodeValue());
	//  302  774:aload           13
	//  303  776:ldc2            #382 <String "rdf:resource">
	//  304  779:aload_1         
	//  305  780:invokeinterface #318 <Method String Node.getNodeValue()>
	//  306  785:invokestatic    #384 <Method XMPNode addQualifierNode(XMPNode, String, String)>
	//  307  788:pop             
			break;

	//* 308  789:goto            671
		case 0: // '\0'
			if(!flag2)
	//* 309  792:iload           5
	//* 310  794:ifne            818
				addQualifierNode(((XMPNode) (obj)), ((Node) (xmpnode)).getNodeName(), ((Node) (xmpnode)).getNodeValue());
	//  311  797:aload           13
	//  312  799:aload_1         
	//  313  800:invokeinterface #363 <Method String Node.getNodeName()>
	//  314  805:aload_1         
	//  315  806:invokeinterface #318 <Method String Node.getNodeValue()>
	//  316  811:invokestatic    #384 <Method XMPNode addQualifierNode(XMPNode, String, String)>
	//  317  814:pop             
			else
	//* 318  815:goto            671
			if("xml:lang".equals(((Object) (((Node) (xmpnode)).getNodeName()))))
	//* 319  818:ldc1            #191 <String "xml:lang">
	//* 320  820:aload_1         
	//* 321  821:invokeinterface #363 <Method String Node.getNodeName()>
	//* 322  826:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 323  829:ifeq            849
				addQualifierNode(((XMPNode) (obj)), "xml:lang", ((Node) (xmpnode)).getNodeValue());
	//  324  832:aload           13
	//  325  834:ldc1            #191 <String "xml:lang">
	//  326  836:aload_1         
	//  327  837:invokeinterface #318 <Method String Node.getNodeValue()>
	//  328  842:invokestatic    #384 <Method XMPNode addQualifierNode(XMPNode, String, String)>
	//  329  845:pop             
			else
	//* 330  846:goto            671
				addChildNode(xmpmetaimpl, ((XMPNode) (obj)), ((Node) (xmpnode)), ((Node) (xmpnode)).getNodeValue(), false);
	//  331  849:aload_0         
	//  332  850:aload           13
	//  333  852:aload_1         
	//  334  853:aload_1         
	//  335  854:invokeinterface #318 <Method String Node.getNodeValue()>
	//  336  859:iconst_0        
	//  337  860:invokestatic    #377 <Method XMPNode addChildNode(XMPMetaImpl, XMPNode, Node, String, boolean)>
	//  338  863:pop             
			break;

		case 2: // '\002'
		case 6: // '\006'
			break;
		}
		if(true) goto _L13; else goto _L12
_L12:
	//* 339  864:goto            671
		return;
	//  340  867:return          
		if(true) goto _L15; else goto _L14
		if(true) goto _L4; else goto _L14
_L14:
	}

	private static void rdf_LiteralPropertyElement(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node, boolean flag)
		throws XMPException
	{
		int i;
		xmpnode = addChildNode(xmpmetaimpl, xmpnode, node, ((String) (null)), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iload_3         
	//    5    5:invokestatic    #377 <Method XMPNode addChildNode(XMPMetaImpl, XMPNode, Node, String, boolean)>
	//    6    8:astore_1        
		i = 0;
	//    7    9:iconst_0        
	//    8   10:istore          4
_L1:
		String s;
		String s1;
		if(i >= node.getAttributes().getLength())
			break MISSING_BLOCK_LABEL_183;
	//    9   12:iload           4
	//   10   14:aload_2         
	//   11   15:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   12   20:invokeinterface #354 <Method int NamedNodeMap.getLength()>
	//   13   25:icmpge          183
		xmpmetaimpl = ((XMPMetaImpl) (node.getAttributes().item(i)));
	//   14   28:aload_2         
	//   15   29:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   16   34:iload           4
	//   17   36:invokeinterface #358 <Method Node NamedNodeMap.item(int)>
	//   18   41:astore_0        
		if(!"xmlns".equals(((Object) (((Node) (xmpmetaimpl)).getPrefix()))) && (((Node) (xmpmetaimpl)).getPrefix() != null || !"xmlns".equals(((Object) (((Node) (xmpmetaimpl)).getNodeName())))))
	//*  19   42:ldc2            #360 <String "xmlns">
	//*  20   45:aload_0         
	//*  21   46:invokeinterface #96  <Method String Node.getPrefix()>
	//*  22   51:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  23   54:ifne            81
	//*  24   57:aload_0         
	//*  25   58:invokeinterface #96  <Method String Node.getPrefix()>
	//*  26   63:ifnonnull       90
	//*  27   66:ldc2            #360 <String "xmlns">
	//*  28   69:aload_0         
	//*  29   70:invokeinterface #363 <Method String Node.getNodeName()>
	//*  30   75:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  31   78:ifeq            90
	//*  32   81:iload           4
	//*  33   83:iconst_1        
	//*  34   84:iadd            
	//*  35   85:istore          4
	//*  36   87:goto            12
		{
			s = ((Node) (xmpmetaimpl)).getNamespaceURI();
	//   37   90:aload_0         
	//   38   91:invokeinterface #77  <Method String Node.getNamespaceURI()>
	//   39   96:astore          5
			s1 = ((Node) (xmpmetaimpl)).getLocalName();
	//   40   98:aload_0         
	//   41   99:invokeinterface #110 <Method String Node.getLocalName()>
	//   42  104:astore          6
			if(!"xml:lang".equals(((Object) (((Node) (xmpmetaimpl)).getNodeName()))))
				continue; /* Loop/switch isn't completed */
	//   43  106:ldc1            #191 <String "xml:lang">
	//   44  108:aload_0         
	//   45  109:invokeinterface #363 <Method String Node.getNodeName()>
	//   46  114:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   47  117:ifeq            136
			addQualifierNode(xmpnode, "xml:lang", ((Node) (xmpmetaimpl)).getNodeValue());
	//   48  120:aload_1         
	//   49  121:ldc1            #191 <String "xml:lang">
	//   50  123:aload_0         
	//   51  124:invokeinterface #318 <Method String Node.getNodeValue()>
	//   52  129:invokestatic    #384 <Method XMPNode addQualifierNode(XMPNode, String, String)>
	//   53  132:pop             
		}
_L3:
		i++;
		  goto _L1
	//*  54  133:goto            81
		if("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (s))) && ("ID".equals(((Object) (s1))) || "datatype".equals(((Object) (s1))))) goto _L3; else goto _L2
	//   55  136:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//   56  139:aload           5
	//   57  141:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   58  144:ifeq            169
	//   59  147:ldc2            #270 <String "ID">
	//   60  150:aload           6
	//   61  152:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   62  155:ifne            81
	//   63  158:ldc2            #295 <String "datatype">
	//   64  161:aload           6
	//   65  163:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   66  166:ifne            81
_L2:
		throw new XMPException("Invalid attribute for literal property element", 202);
	//   67  169:new             #65  <Class XMPException>
	//   68  172:dup             
	//   69  173:ldc2            #387 <String "Invalid attribute for literal property element">
	//   70  176:sipush          202
	//   71  179:invokespecial   #167 <Method void XMPException(String, int)>
	//   72  182:athrow          
		xmpmetaimpl = "";
	//   73  183:ldc2            #375 <String "">
	//   74  186:astore_0        
		for(int j = 0; j < node.getChildNodes().getLength();)
	//*  75  187:iconst_0        
	//*  76  188:istore          4
	//*  77  190:iload           4
	//*  78  192:aload_2         
	//*  79  193:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//*  80  198:invokeinterface #394 <Method int NodeList.getLength()>
	//*  81  203:icmpge          280
		{
			Node node1 = node.getChildNodes().item(j);
	//   82  206:aload_2         
	//   83  207:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//   84  212:iload           4
	//   85  214:invokeinterface #395 <Method Node NodeList.item(int)>
	//   86  219:astore          5
			if(node1.getNodeType() == 3)
	//*  87  221:aload           5
	//*  88  223:invokeinterface #315 <Method short Node.getNodeType()>
	//*  89  228:iconst_3        
	//*  90  229:icmpne          266
			{
				xmpmetaimpl = ((XMPMetaImpl) ((new StringBuilder()).append(((String) (xmpmetaimpl))).append(node1.getNodeValue()).toString()));
	//   91  232:new             #102 <Class StringBuilder>
	//   92  235:dup             
	//   93  236:invokespecial   #103 <Method void StringBuilder()>
	//   94  239:aload_0         
	//   95  240:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   96  243:aload           5
	//   97  245:invokeinterface #318 <Method String Node.getNodeValue()>
	//   98  250:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   99  253:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  100  256:astore_0        
				j++;
	//  101  257:iload           4
	//  102  259:iconst_1        
	//  103  260:iadd            
	//  104  261:istore          4
			} else
	//* 105  263:goto            190
			{
				throw new XMPException("Invalid child of literal property element", 202);
	//  106  266:new             #65  <Class XMPException>
	//  107  269:dup             
	//  108  270:ldc2            #397 <String "Invalid child of literal property element">
	//  109  273:sipush          202
	//  110  276:invokespecial   #167 <Method void XMPException(String, int)>
	//  111  279:athrow          
			}
		}

		xmpnode.setValue(((String) (xmpmetaimpl)));
	//  112  280:aload_1         
	//  113  281:aload_0         
	//  114  282:invokevirtual   #248 <Method void XMPNode.setValue(String)>
		return;
	//  115  285:return          
	}

	private static void rdf_NodeElement(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node, boolean flag)
		throws XMPException
	{
		int i = getRDFTermKind(node);
	//    0    0:aload_2         
	//    1    1:invokestatic    #365 <Method int getRDFTermKind(Node)>
	//    2    4:istore          4
		if(i != 8 && i != 0)
	//*   3    6:iload           4
	//*   4    8:bipush          8
	//*   5   10:icmpeq          32
	//*   6   13:iload           4
	//*   7   15:ifeq            32
			throw new XMPException("Node element must be rdf:Description or typed node", 202);
	//    8   18:new             #65  <Class XMPException>
	//    9   21:dup             
	//   10   22:ldc2            #400 <String "Node element must be rdf:Description or typed node">
	//   11   25:sipush          202
	//   12   28:invokespecial   #167 <Method void XMPException(String, int)>
	//   13   31:athrow          
		if(flag && i == 0)
	//*  14   32:iload_3         
	//*  15   33:ifeq            55
	//*  16   36:iload           4
	//*  17   38:ifne            55
		{
			throw new XMPException("Top level typed node not allowed", 203);
	//   18   41:new             #65  <Class XMPException>
	//   19   44:dup             
	//   20   45:ldc2            #402 <String "Top level typed node not allowed">
	//   21   48:sipush          203
	//   22   51:invokespecial   #167 <Method void XMPException(String, int)>
	//   23   54:athrow          
		} else
		{
			rdf_NodeElementAttrs(xmpmetaimpl, xmpnode, node, flag);
	//   24   55:aload_0         
	//   25   56:aload_1         
	//   26   57:aload_2         
	//   27   58:iload_3         
	//   28   59:invokestatic    #405 <Method void rdf_NodeElementAttrs(XMPMetaImpl, XMPNode, Node, boolean)>
			rdf_PropertyElementList(xmpmetaimpl, xmpnode, node, flag);
	//   29   62:aload_0         
	//   30   63:aload_1         
	//   31   64:aload_2         
	//   32   65:iload_3         
	//   33   66:invokestatic    #408 <Method void rdf_PropertyElementList(XMPMetaImpl, XMPNode, Node, boolean)>
			return;
	//   34   69:return          
		}
	}

	private static void rdf_NodeElementAttrs(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node, boolean flag)
		throws XMPException
	{
		int i;
		int k;
		k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		i = 0;
	//    2    3:iconst_0        
	//    3    4:istore          4
_L7:
		if(i >= node.getAttributes().getLength()) goto _L2; else goto _L1
	//    4    6:iload           4
	//    5    8:aload_2         
	//    6    9:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//    7   14:invokeinterface #354 <Method int NamedNodeMap.getLength()>
	//    8   19:icmpge          302
_L1:
		int j;
		Node node1;
		node1 = node.getAttributes().item(i);
	//    9   22:aload_2         
	//   10   23:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   11   28:iload           4
	//   12   30:invokeinterface #358 <Method Node NamedNodeMap.item(int)>
	//   13   35:astore          8
		j = k;
	//   14   37:iload           6
	//   15   39:istore          5
		if("xmlns".equals(((Object) (node1.getPrefix())))) goto _L4; else goto _L3
	//   16   41:ldc2            #360 <String "xmlns">
	//   17   44:aload           8
	//   18   46:invokeinterface #96  <Method String Node.getPrefix()>
	//   19   51:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   20   54:ifne            87
_L3:
		if(node1.getPrefix() != null || !"xmlns".equals(((Object) (node1.getNodeName())))) goto _L6; else goto _L5
	//   21   57:aload           8
	//   22   59:invokeinterface #96  <Method String Node.getPrefix()>
	//   23   64:ifnonnull       100
	//   24   67:ldc2            #360 <String "xmlns">
	//   25   70:aload           8
	//   26   72:invokeinterface #363 <Method String Node.getNodeName()>
	//   27   77:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   28   80:ifeq            100
_L5:
		j = k;
	//   29   83:iload           6
	//   30   85:istore          5
_L4:
		i++;
	//   31   87:iload           4
	//   32   89:iconst_1        
	//   33   90:iadd            
	//   34   91:istore          4
		k = j;
	//   35   93:iload           5
	//   36   95:istore          6
		  goto _L7
	//*  37   97:goto            6
_L6:
		int l = getRDFTermKind(node1);
	//   38  100:aload           8
	//   39  102:invokestatic    #365 <Method int getRDFTermKind(Node)>
	//   40  105:istore          7
		switch(l)
	//*  41  107:iload           7
		{
	//*  42  109:tableswitch     0 6: default 152
	//	               0 279
	//	               1 152
	//	               2 166
	//	               3 166
	//	               4 152
	//	               5 152
	//	               6 166
		case 1: // '\001'
		case 4: // '\004'
		case 5: // '\005'
		default:
			throw new XMPException("Invalid nodeElement attribute", 202);
	//   43  152:new             #65  <Class XMPException>
	//   44  155:dup             
	//   45  156:ldc2            #410 <String "Invalid nodeElement attribute">
	//   46  159:sipush          202
	//   47  162:invokespecial   #167 <Method void XMPException(String, int)>
	//   48  165:athrow          

		case 2: // '\002'
		case 3: // '\003'
		case 6: // '\006'
			if(k > 0)
	//*  49  166:iload           6
	//*  50  168:ifle            185
				throw new XMPException("Mutally exclusive about, ID, nodeID attributes", 202);
	//   51  171:new             #65  <Class XMPException>
	//   52  174:dup             
	//   53  175:ldc2            #412 <String "Mutally exclusive about, ID, nodeID attributes">
	//   54  178:sipush          202
	//   55  181:invokespecial   #167 <Method void XMPException(String, int)>
	//   56  184:athrow          
			k++;
	//   57  185:iload           6
	//   58  187:iconst_1        
	//   59  188:iadd            
	//   60  189:istore          6
			j = k;
	//   61  191:iload           6
	//   62  193:istore          5
			if(flag)
	//*  63  195:iload_3         
	//*  64  196:ifeq            87
			{
				j = k;
	//   65  199:iload           6
	//   66  201:istore          5
				if(l == 3)
	//*  67  203:iload           7
	//*  68  205:iconst_3        
	//*  69  206:icmpne          87
					if(xmpnode.getName() != null && xmpnode.getName().length() > 0)
	//*  70  209:aload_1         
	//*  71  210:invokevirtual   #213 <Method String XMPNode.getName()>
	//*  72  213:ifnull          261
	//*  73  216:aload_1         
	//*  74  217:invokevirtual   #213 <Method String XMPNode.getName()>
	//*  75  220:invokevirtual   #321 <Method int String.length()>
	//*  76  223:ifle            261
					{
						j = k;
	//   77  226:iload           6
	//   78  228:istore          5
						if(!xmpnode.getName().equals(((Object) (node1.getNodeValue()))))
	//*  79  230:aload_1         
	//*  80  231:invokevirtual   #213 <Method String XMPNode.getName()>
	//*  81  234:aload           8
	//*  82  236:invokeinterface #318 <Method String Node.getNodeValue()>
	//*  83  241:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  84  244:ifne            87
							throw new XMPException("Mismatched top level rdf:about values", 203);
	//   85  247:new             #65  <Class XMPException>
	//   86  250:dup             
	//   87  251:ldc2            #414 <String "Mismatched top level rdf:about values">
	//   88  254:sipush          203
	//   89  257:invokespecial   #167 <Method void XMPException(String, int)>
	//   90  260:athrow          
					} else
					{
						xmpnode.setName(node1.getNodeValue());
	//   91  261:aload_1         
	//   92  262:aload           8
	//   93  264:invokeinterface #318 <Method String Node.getNodeValue()>
	//   94  269:invokevirtual   #186 <Method void XMPNode.setName(String)>
						j = k;
	//   95  272:iload           6
	//   96  274:istore          5
					}
			}
			break;

	//*  97  276:goto            87
		case 0: // '\0'
			addChildNode(xmpmetaimpl, xmpnode, node1, node1.getNodeValue(), flag);
	//   98  279:aload_0         
	//   99  280:aload_1         
	//  100  281:aload           8
	//  101  283:aload           8
	//  102  285:invokeinterface #318 <Method String Node.getNodeValue()>
	//  103  290:iload_3         
	//  104  291:invokestatic    #377 <Method XMPNode addChildNode(XMPMetaImpl, XMPNode, Node, String, boolean)>
	//  105  294:pop             
			j = k;
	//  106  295:iload           6
	//  107  297:istore          5
			break;
		}
		if(true) goto _L4; else goto _L2
	//* 108  299:goto            87
_L2:
	//  109  302:return          
	}

	private static void rdf_NodeElementList(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node)
		throws XMPException
	{
		for(int i = 0; i < node.getChildNodes().getLength(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_2         
	//*   4    4:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//*   5    9:invokeinterface #394 <Method int NodeList.getLength()>
	//*   6   14:icmpge          54
		{
			Node node1 = node.getChildNodes().item(i);
	//    7   17:aload_2         
	//    8   18:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//    9   23:iload_3         
	//   10   24:invokeinterface #395 <Method Node NodeList.item(int)>
	//   11   29:astore          4
			if(!isWhitespaceNode(node1))
	//*  12   31:aload           4
	//*  13   33:invokestatic    #418 <Method boolean isWhitespaceNode(Node)>
	//*  14   36:ifne            47
				rdf_NodeElement(xmpmetaimpl, xmpnode, node1, true);
	//   15   39:aload_0         
	//   16   40:aload_1         
	//   17   41:aload           4
	//   18   43:iconst_1        
	//   19   44:invokestatic    #420 <Method void rdf_NodeElement(XMPMetaImpl, XMPNode, Node, boolean)>
		}

	//   20   47:iload_3         
	//   21   48:iconst_1        
	//   22   49:iadd            
	//   23   50:istore_3        
	//*  24   51:goto            2
	//   25   54:return          
	}

	private static void rdf_ParseTypeCollectionPropertyElement()
		throws XMPException
	{
		throw new XMPException("ParseTypeCollection property element not allowed", 203);
	//    0    0:new             #65  <Class XMPException>
	//    1    3:dup             
	//    2    4:ldc2            #423 <String "ParseTypeCollection property element not allowed">
	//    3    7:sipush          203
	//    4   10:invokespecial   #167 <Method void XMPException(String, int)>
	//    5   13:athrow          
	}

	private static void rdf_ParseTypeLiteralPropertyElement()
		throws XMPException
	{
		throw new XMPException("ParseTypeLiteral property element not allowed", 203);
	//    0    0:new             #65  <Class XMPException>
	//    1    3:dup             
	//    2    4:ldc2            #426 <String "ParseTypeLiteral property element not allowed">
	//    3    7:sipush          203
	//    4   10:invokespecial   #167 <Method void XMPException(String, int)>
	//    5   13:athrow          
	}

	private static void rdf_ParseTypeOtherPropertyElement()
		throws XMPException
	{
		throw new XMPException("ParseTypeOther property element not allowed", 203);
	//    0    0:new             #65  <Class XMPException>
	//    1    3:dup             
	//    2    4:ldc2            #429 <String "ParseTypeOther property element not allowed">
	//    3    7:sipush          203
	//    4   10:invokespecial   #167 <Method void XMPException(String, int)>
	//    5   13:athrow          
	}

	private static void rdf_ParseTypeResourcePropertyElement(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node, boolean flag)
		throws XMPException
	{
		int i;
		xmpnode = addChildNode(xmpmetaimpl, xmpnode, node, "", flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc2            #375 <String "">
	//    4    6:iload_3         
	//    5    7:invokestatic    #377 <Method XMPNode addChildNode(XMPMetaImpl, XMPNode, Node, String, boolean)>
	//    6   10:astore_1        
		xmpnode.getOptions().setStruct(true);
	//    7   11:aload_1         
	//    8   12:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #238 <Method PropertyOptions PropertyOptions.setStruct(boolean)>
	//   11   19:pop             
		i = 0;
	//   12   20:iconst_0        
	//   13   21:istore          4
_L1:
		String s;
		String s1;
		if(i >= node.getAttributes().getLength())
			break MISSING_BLOCK_LABEL_202;
	//   14   23:iload           4
	//   15   25:aload_2         
	//   16   26:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   17   31:invokeinterface #354 <Method int NamedNodeMap.getLength()>
	//   18   36:icmpge          202
		Node node1 = node.getAttributes().item(i);
	//   19   39:aload_2         
	//   20   40:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   21   45:iload           4
	//   22   47:invokeinterface #358 <Method Node NamedNodeMap.item(int)>
	//   23   52:astore          5
		if(!"xmlns".equals(((Object) (node1.getPrefix()))) && (node1.getPrefix() != null || !"xmlns".equals(((Object) (node1.getNodeName())))))
	//*  24   54:ldc2            #360 <String "xmlns">
	//*  25   57:aload           5
	//*  26   59:invokeinterface #96  <Method String Node.getPrefix()>
	//*  27   64:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  28   67:ifne            96
	//*  29   70:aload           5
	//*  30   72:invokeinterface #96  <Method String Node.getPrefix()>
	//*  31   77:ifnonnull       105
	//*  32   80:ldc2            #360 <String "xmlns">
	//*  33   83:aload           5
	//*  34   85:invokeinterface #363 <Method String Node.getNodeName()>
	//*  35   90:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  36   93:ifeq            105
	//*  37   96:iload           4
	//*  38   98:iconst_1        
	//*  39   99:iadd            
	//*  40  100:istore          4
	//*  41  102:goto            23
		{
			s = node1.getLocalName();
	//   42  105:aload           5
	//   43  107:invokeinterface #110 <Method String Node.getLocalName()>
	//   44  112:astore          6
			s1 = node1.getNamespaceURI();
	//   45  114:aload           5
	//   46  116:invokeinterface #77  <Method String Node.getNamespaceURI()>
	//   47  121:astore          7
			if(!"xml:lang".equals(((Object) (node1.getNodeName()))))
				continue; /* Loop/switch isn't completed */
	//   48  123:ldc1            #191 <String "xml:lang">
	//   49  125:aload           5
	//   50  127:invokeinterface #363 <Method String Node.getNodeName()>
	//   51  132:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   52  135:ifeq            155
			addQualifierNode(xmpnode, "xml:lang", node1.getNodeValue());
	//   53  138:aload_1         
	//   54  139:ldc1            #191 <String "xml:lang">
	//   55  141:aload           5
	//   56  143:invokeinterface #318 <Method String Node.getNodeValue()>
	//   57  148:invokestatic    #384 <Method XMPNode addQualifierNode(XMPNode, String, String)>
	//   58  151:pop             
		}
_L3:
		i++;
		  goto _L1
	//*  59  152:goto            96
		if("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (s1))) && ("ID".equals(((Object) (s))) || "parseType".equals(((Object) (s))))) goto _L3; else goto _L2
	//   60  155:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//   61  158:aload           7
	//   62  160:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   63  163:ifeq            188
	//   64  166:ldc2            #270 <String "ID">
	//   65  169:aload           6
	//   66  171:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   67  174:ifne            96
	//   68  177:ldc2            #285 <String "parseType">
	//   69  180:aload           6
	//   70  182:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   71  185:ifne            96
_L2:
		throw new XMPException("Invalid attribute for ParseTypeResource property element", 202);
	//   72  188:new             #65  <Class XMPException>
	//   73  191:dup             
	//   74  192:ldc2            #432 <String "Invalid attribute for ParseTypeResource property element">
	//   75  195:sipush          202
	//   76  198:invokespecial   #167 <Method void XMPException(String, int)>
	//   77  201:athrow          
		rdf_PropertyElementList(xmpmetaimpl, xmpnode, node, false);
	//   78  202:aload_0         
	//   79  203:aload_1         
	//   80  204:aload_2         
	//   81  205:iconst_0        
	//   82  206:invokestatic    #408 <Method void rdf_PropertyElementList(XMPMetaImpl, XMPNode, Node, boolean)>
		if(xmpnode.getHasValueChild())
	//*  83  209:aload_1         
	//*  84  210:invokevirtual   #234 <Method boolean XMPNode.getHasValueChild()>
	//*  85  213:ifeq            220
			fixupQualifiedNode(xmpnode);
	//   86  216:aload_1         
	//   87  217:invokestatic    #434 <Method void fixupQualifiedNode(XMPNode)>
		return;
	//   88  220:return          
	}

	private static void rdf_PropertyElement(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node, boolean flag)
		throws XMPException
	{
		if(!isPropertyElementName(getRDFTermKind(node)))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #365 <Method int getRDFTermKind(Node)>
	//*   2    4:invokestatic    #437 <Method boolean isPropertyElementName(int)>
	//*   3    7:ifne            24
			throw new XMPException("Invalid property element name", 202);
	//    4   10:new             #65  <Class XMPException>
	//    5   13:dup             
	//    6   14:ldc2            #439 <String "Invalid property element name">
	//    7   17:sipush          202
	//    8   20:invokespecial   #167 <Method void XMPException(String, int)>
	//    9   23:athrow          
		NamedNodeMap namednodemap = node.getAttributes();
	//   10   24:aload_2         
	//   11   25:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   12   30:astore          7
		Object obj = null;
	//   13   32:aconst_null     
	//   14   33:astore          5
		for(int i = 0; i < namednodemap.getLength();)
	//*  15   35:iconst_0        
	//*  16   36:istore          4
	//*  17   38:iload           4
	//*  18   40:aload           7
	//*  19   42:invokeinterface #354 <Method int NamedNodeMap.getLength()>
	//*  20   47:icmpge          157
		{
			ArrayList arraylist;
label0:
			{
				Node node2 = namednodemap.item(i);
	//   21   50:aload           7
	//   22   52:iload           4
	//   23   54:invokeinterface #358 <Method Node NamedNodeMap.item(int)>
	//   24   59:astore          8
				if(!"xmlns".equals(((Object) (node2.getPrefix()))))
	//*  25   61:ldc2            #360 <String "xmlns">
	//*  26   64:aload           8
	//*  27   66:invokeinterface #96  <Method String Node.getPrefix()>
	//*  28   71:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  29   74:ifne            111
				{
					arraylist = ((ArrayList) (obj));
	//   30   77:aload           5
	//   31   79:astore          6
					if(node2.getPrefix() != null)
						break label0;
	//   32   81:aload           8
	//   33   83:invokeinterface #96  <Method String Node.getPrefix()>
	//   34   88:ifnonnull       144
					arraylist = ((ArrayList) (obj));
	//   35   91:aload           5
	//   36   93:astore          6
					if(!"xmlns".equals(((Object) (node2.getNodeName()))))
						break label0;
	//   37   95:ldc2            #360 <String "xmlns">
	//   38   98:aload           8
	//   39  100:invokeinterface #363 <Method String Node.getNodeName()>
	//   40  105:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   41  108:ifeq            144
				}
				arraylist = ((ArrayList) (obj));
	//   42  111:aload           5
	//   43  113:astore          6
				if(obj == null)
	//*  44  115:aload           5
	//*  45  117:ifnonnull       129
					arraylist = new ArrayList();
	//   46  120:new             #441 <Class ArrayList>
	//   47  123:dup             
	//   48  124:invokespecial   #442 <Method void ArrayList()>
	//   49  127:astore          6
				((List) (arraylist)).add(((Object) (node2.getNodeName())));
	//   50  129:aload           6
	//   51  131:aload           8
	//   52  133:invokeinterface #363 <Method String Node.getNodeName()>
	//   53  138:invokeinterface #447 <Method boolean List.add(Object)>
	//   54  143:pop             
			}
			i++;
	//   55  144:iload           4
	//   56  146:iconst_1        
	//   57  147:iadd            
	//   58  148:istore          4
			obj = ((Object) (arraylist));
	//   59  150:aload           6
	//   60  152:astore          5
		}

	//*  61  154:goto            38
		if(obj != null)
	//*  62  157:aload           5
	//*  63  159:ifnull          202
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); namednodemap.removeNamedItem((String)((Iterator) (obj)).next()));
	//   64  162:aload           5
	//   65  164:invokeinterface #450 <Method Iterator List.iterator()>
	//   66  169:astore          5
	//   67  171:aload           5
	//   68  173:invokeinterface #260 <Method boolean Iterator.hasNext()>
	//   69  178:ifeq            202
	//   70  181:aload           7
	//   71  183:aload           5
	//   72  185:invokeinterface #264 <Method Object Iterator.next()>
	//   73  190:checkcast       #81  <Class String>
	//   74  193:invokeinterface #454 <Method Node NamedNodeMap.removeNamedItem(String)>
	//   75  198:pop             
	//*  76  199:goto            171
		if(namednodemap.getLength() > 3)
	//*  77  202:aload           7
	//*  78  204:invokeinterface #354 <Method int NamedNodeMap.getLength()>
	//*  79  209:iconst_3        
	//*  80  210:icmple          221
		{
			rdf_EmptyPropertyElement(xmpmetaimpl, xmpnode, node, flag);
	//   81  213:aload_0         
	//   82  214:aload_1         
	//   83  215:aload_2         
	//   84  216:iload_3         
	//   85  217:invokestatic    #456 <Method void rdf_EmptyPropertyElement(XMPMetaImpl, XMPNode, Node, boolean)>
			return;
	//   86  220:return          
		}
		for(int j = 0; j < namednodemap.getLength(); j++)
	//*  87  221:iconst_0        
	//*  88  222:istore          4
	//*  89  224:iload           4
	//*  90  226:aload           7
	//*  91  228:invokeinterface #354 <Method int NamedNodeMap.getLength()>
	//*  92  233:icmpge          433
		{
			Node node1 = namednodemap.item(j);
	//   93  236:aload           7
	//   94  238:iload           4
	//   95  240:invokeinterface #358 <Method Node NamedNodeMap.item(int)>
	//   96  245:astore          5
			String s = node1.getLocalName();
	//   97  247:aload           5
	//   98  249:invokeinterface #110 <Method String Node.getLocalName()>
	//   99  254:astore          6
			String s1 = node1.getNamespaceURI();
	//  100  256:aload           5
	//  101  258:invokeinterface #77  <Method String Node.getNamespaceURI()>
	//  102  263:astore          8
			String s2 = node1.getNodeValue();
	//  103  265:aload           5
	//  104  267:invokeinterface #318 <Method String Node.getNodeValue()>
	//  105  272:astore          9
			if(!"xml:lang".equals(((Object) (node1.getNodeName()))) || "ID".equals(((Object) (s))) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (s1))))
	//* 106  274:ldc1            #191 <String "xml:lang">
	//* 107  276:aload           5
	//* 108  278:invokeinterface #363 <Method String Node.getNodeName()>
	//* 109  283:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 110  286:ifeq            311
	//* 111  289:ldc2            #270 <String "ID">
	//* 112  292:aload           6
	//* 113  294:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 114  297:ifeq            424
	//* 115  300:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//* 116  303:aload           8
	//* 117  305:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 118  308:ifeq            424
			{
				if("datatype".equals(((Object) (s))) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (s1))))
	//* 119  311:ldc2            #295 <String "datatype">
	//* 120  314:aload           6
	//* 121  316:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 122  319:ifeq            341
	//* 123  322:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//* 124  325:aload           8
	//* 125  327:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 126  330:ifeq            341
				{
					rdf_LiteralPropertyElement(xmpmetaimpl, xmpnode, node, flag);
	//  127  333:aload_0         
	//  128  334:aload_1         
	//  129  335:aload_2         
	//  130  336:iload_3         
	//  131  337:invokestatic    #458 <Method void rdf_LiteralPropertyElement(XMPMetaImpl, XMPNode, Node, boolean)>
					return;
	//  132  340:return          
				}
				if(!"parseType".equals(((Object) (s))) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (s1))))
	//* 133  341:ldc2            #285 <String "parseType">
	//* 134  344:aload           6
	//* 135  346:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 136  349:ifeq            363
	//* 137  352:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//* 138  355:aload           8
	//* 139  357:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 140  360:ifne            371
				{
					rdf_EmptyPropertyElement(xmpmetaimpl, xmpnode, node, flag);
	//  141  363:aload_0         
	//  142  364:aload_1         
	//  143  365:aload_2         
	//  144  366:iload_3         
	//  145  367:invokestatic    #456 <Method void rdf_EmptyPropertyElement(XMPMetaImpl, XMPNode, Node, boolean)>
					return;
	//  146  370:return          
				}
				if("Literal".equals(((Object) (s2))))
	//* 147  371:ldc2            #460 <String "Literal">
	//* 148  374:aload           9
	//* 149  376:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 150  379:ifeq            386
				{
					rdf_ParseTypeLiteralPropertyElement();
	//  151  382:invokestatic    #462 <Method void rdf_ParseTypeLiteralPropertyElement()>
					return;
	//  152  385:return          
				}
				if("Resource".equals(((Object) (s2))))
	//* 153  386:ldc2            #464 <String "Resource">
	//* 154  389:aload           9
	//* 155  391:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 156  394:ifeq            405
				{
					rdf_ParseTypeResourcePropertyElement(xmpmetaimpl, xmpnode, node, flag);
	//  157  397:aload_0         
	//  158  398:aload_1         
	//  159  399:aload_2         
	//  160  400:iload_3         
	//  161  401:invokestatic    #466 <Method void rdf_ParseTypeResourcePropertyElement(XMPMetaImpl, XMPNode, Node, boolean)>
					return;
	//  162  404:return          
				}
				if("Collection".equals(((Object) (s2))))
	//* 163  405:ldc2            #468 <String "Collection">
	//* 164  408:aload           9
	//* 165  410:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 166  413:ifeq            420
				{
					rdf_ParseTypeCollectionPropertyElement();
	//  167  416:invokestatic    #470 <Method void rdf_ParseTypeCollectionPropertyElement()>
					return;
	//  168  419:return          
				} else
				{
					rdf_ParseTypeOtherPropertyElement();
	//  169  420:invokestatic    #472 <Method void rdf_ParseTypeOtherPropertyElement()>
					return;
	//  170  423:return          
				}
			}
		}

	//  171  424:iload           4
	//  172  426:iconst_1        
	//  173  427:iadd            
	//  174  428:istore          4
	//* 175  430:goto            224
		if(node.hasChildNodes())
	//* 176  433:aload_2         
	//* 177  434:invokeinterface #343 <Method boolean Node.hasChildNodes()>
	//* 178  439:ifeq            508
		{
			for(int k = 0; k < node.getChildNodes().getLength(); k++)
	//* 179  442:iconst_0        
	//* 180  443:istore          4
	//* 181  445:iload           4
	//* 182  447:aload_2         
	//* 183  448:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//* 184  453:invokeinterface #394 <Method int NodeList.getLength()>
	//* 185  458:icmpge          500
				if(node.getChildNodes().item(k).getNodeType() != 3)
	//* 186  461:aload_2         
	//* 187  462:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//* 188  467:iload           4
	//* 189  469:invokeinterface #395 <Method Node NodeList.item(int)>
	//* 190  474:invokeinterface #315 <Method short Node.getNodeType()>
	//* 191  479:iconst_3        
	//* 192  480:icmpeq          491
				{
					rdf_ResourcePropertyElement(xmpmetaimpl, xmpnode, node, flag);
	//  193  483:aload_0         
	//  194  484:aload_1         
	//  195  485:aload_2         
	//  196  486:iload_3         
	//  197  487:invokestatic    #475 <Method void rdf_ResourcePropertyElement(XMPMetaImpl, XMPNode, Node, boolean)>
					return;
	//  198  490:return          
				}

	//  199  491:iload           4
	//  200  493:iconst_1        
	//  201  494:iadd            
	//  202  495:istore          4
	//* 203  497:goto            445
			rdf_LiteralPropertyElement(xmpmetaimpl, xmpnode, node, flag);
	//  204  500:aload_0         
	//  205  501:aload_1         
	//  206  502:aload_2         
	//  207  503:iload_3         
	//  208  504:invokestatic    #458 <Method void rdf_LiteralPropertyElement(XMPMetaImpl, XMPNode, Node, boolean)>
			return;
	//  209  507:return          
		} else
		{
			rdf_EmptyPropertyElement(xmpmetaimpl, xmpnode, node, flag);
	//  210  508:aload_0         
	//  211  509:aload_1         
	//  212  510:aload_2         
	//  213  511:iload_3         
	//  214  512:invokestatic    #456 <Method void rdf_EmptyPropertyElement(XMPMetaImpl, XMPNode, Node, boolean)>
			return;
	//  215  515:return          
		}
	}

	private static void rdf_PropertyElementList(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node, boolean flag)
		throws XMPException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		while(i < node.getChildNodes().getLength()) 
	//*   2    3:iload           4
	//*   3    5:aload_2         
	//*   4    6:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//*   5   11:invokeinterface #394 <Method int NodeList.getLength()>
	//*   6   16:icmpge          87
		{
			Node node1 = node.getChildNodes().item(i);
	//    7   19:aload_2         
	//    8   20:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//    9   25:iload           4
	//   10   27:invokeinterface #395 <Method Node NodeList.item(int)>
	//   11   32:astore          5
			if(!isWhitespaceNode(node1))
	//*  12   34:aload           5
	//*  13   36:invokestatic    #418 <Method boolean isWhitespaceNode(Node)>
	//*  14   39:ifeq            51
	//*  15   42:iload           4
	//*  16   44:iconst_1        
	//*  17   45:iadd            
	//*  18   46:istore          4
	//*  19   48:goto            3
			{
				if(node1.getNodeType() != 1)
	//*  20   51:aload           5
	//*  21   53:invokeinterface #315 <Method short Node.getNodeType()>
	//*  22   58:iconst_1        
	//*  23   59:icmpeq          76
					throw new XMPException("Expected property element node not found", 202);
	//   24   62:new             #65  <Class XMPException>
	//   25   65:dup             
	//   26   66:ldc2            #477 <String "Expected property element node not found">
	//   27   69:sipush          202
	//   28   72:invokespecial   #167 <Method void XMPException(String, int)>
	//   29   75:athrow          
				rdf_PropertyElement(xmpmetaimpl, xmpnode, node1, flag);
	//   30   76:aload_0         
	//   31   77:aload_1         
	//   32   78:aload           5
	//   33   80:iload_3         
	//   34   81:invokestatic    #479 <Method void rdf_PropertyElement(XMPMetaImpl, XMPNode, Node, boolean)>
			}
			i++;
		}
	//*  35   84:goto            42
	//   36   87:return          
	}

	static void rdf_RDF(XMPMetaImpl xmpmetaimpl, Node node)
		throws XMPException
	{
		if(node.hasAttributes())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #482 <Method boolean Node.hasAttributes()>
	//*   2    6:ifeq            19
		{
			rdf_NodeElementList(xmpmetaimpl, xmpmetaimpl.getRoot(), node);
	//    3    9:aload_0         
	//    4   10:aload_0         
	//    5   11:invokevirtual   #122 <Method XMPNode XMPMetaImpl.getRoot()>
	//    6   14:aload_1         
	//    7   15:invokestatic    #484 <Method void rdf_NodeElementList(XMPMetaImpl, XMPNode, Node)>
			return;
	//    8   18:return          
		} else
		{
			throw new XMPException("Invalid attributes of rdf:RDF element", 202);
	//    9   19:new             #65  <Class XMPException>
	//   10   22:dup             
	//   11   23:ldc2            #486 <String "Invalid attributes of rdf:RDF element">
	//   12   26:sipush          202
	//   13   29:invokespecial   #167 <Method void XMPException(String, int)>
	//   14   32:athrow          
		}
	}

	private static void rdf_ResourcePropertyElement(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, Node node, boolean flag)
		throws XMPException
	{
		if(!flag || !"iX:changes".equals(((Object) (node.getNodeName())))) goto _L2; else goto _L1
	//    0    0:iload_3         
	//    1    1:ifeq            20
	//    2    4:ldc2            #488 <String "iX:changes">
	//    3    7:aload_2         
	//    4    8:invokeinterface #363 <Method String Node.getNodeName()>
	//    5   13:invokevirtual   #85  <Method boolean String.equals(Object)>
	//    6   16:ifeq            20
_L1:
		return;
	//    7   19:return          
_L2:
		int i;
		xmpnode = addChildNode(xmpmetaimpl, xmpnode, node, "", flag);
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:ldc2            #375 <String "">
	//   12   26:iload_3         
	//   13   27:invokestatic    #377 <Method XMPNode addChildNode(XMPMetaImpl, XMPNode, Node, String, boolean)>
	//   14   30:astore_1        
		i = 0;
	//   15   31:iconst_0        
	//   16   32:istore          4
_L3:
		String s;
		String s2;
		if(i >= node.getAttributes().getLength())
			break MISSING_BLOCK_LABEL_202;
	//   17   34:iload           4
	//   18   36:aload_2         
	//   19   37:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   20   42:invokeinterface #354 <Method int NamedNodeMap.getLength()>
	//   21   47:icmpge          202
		Node node1 = node.getAttributes().item(i);
	//   22   50:aload_2         
	//   23   51:invokeinterface #349 <Method NamedNodeMap Node.getAttributes()>
	//   24   56:iload           4
	//   25   58:invokeinterface #358 <Method Node NamedNodeMap.item(int)>
	//   26   63:astore          7
		if(!"xmlns".equals(((Object) (node1.getPrefix()))) && (node1.getPrefix() != null || !"xmlns".equals(((Object) (node1.getNodeName())))))
	//*  27   65:ldc2            #360 <String "xmlns">
	//*  28   68:aload           7
	//*  29   70:invokeinterface #96  <Method String Node.getPrefix()>
	//*  30   75:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  31   78:ifne            107
	//*  32   81:aload           7
	//*  33   83:invokeinterface #96  <Method String Node.getPrefix()>
	//*  34   88:ifnonnull       116
	//*  35   91:ldc2            #360 <String "xmlns">
	//*  36   94:aload           7
	//*  37   96:invokeinterface #363 <Method String Node.getNodeName()>
	//*  38  101:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  39  104:ifeq            116
	//*  40  107:iload           4
	//*  41  109:iconst_1        
	//*  42  110:iadd            
	//*  43  111:istore          4
	//*  44  113:goto            34
		{
			s = node1.getLocalName();
	//   45  116:aload           7
	//   46  118:invokeinterface #110 <Method String Node.getLocalName()>
	//   47  123:astore          8
			s2 = node1.getNamespaceURI();
	//   48  125:aload           7
	//   49  127:invokeinterface #77  <Method String Node.getNamespaceURI()>
	//   50  132:astore          9
			if(!"xml:lang".equals(((Object) (node1.getNodeName()))))
				continue; /* Loop/switch isn't completed */
	//   51  134:ldc1            #191 <String "xml:lang">
	//   52  136:aload           7
	//   53  138:invokeinterface #363 <Method String Node.getNodeName()>
	//   54  143:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   55  146:ifeq            166
			addQualifierNode(xmpnode, "xml:lang", node1.getNodeValue());
	//   56  149:aload_1         
	//   57  150:ldc1            #191 <String "xml:lang">
	//   58  152:aload           7
	//   59  154:invokeinterface #318 <Method String Node.getNodeValue()>
	//   60  159:invokestatic    #384 <Method XMPNode addQualifierNode(XMPNode, String, String)>
	//   61  162:pop             
		}
_L5:
		i++;
		  goto _L3
	//*  62  163:goto            107
		if("ID".equals(((Object) (s))) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (s2)))) goto _L5; else goto _L4
	//   63  166:ldc2            #270 <String "ID">
	//   64  169:aload           8
	//   65  171:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   66  174:ifeq            188
	//   67  177:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//   68  180:aload           9
	//   69  182:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   70  185:ifne            107
_L4:
		throw new XMPException("Invalid attribute for resource property element", 202);
	//   71  188:new             #65  <Class XMPException>
	//   72  191:dup             
	//   73  192:ldc2            #490 <String "Invalid attribute for resource property element">
	//   74  195:sipush          202
	//   75  198:invokespecial   #167 <Method void XMPException(String, int)>
	//   76  201:athrow          
		boolean flag1;
		flag1 = false;
	//   77  202:iconst_0        
	//   78  203:istore          5
		int j = 0;
	//   79  205:iconst_0        
	//   80  206:istore          4
		do
		{
			if(j >= node.getChildNodes().getLength())
				continue; /* Loop/switch isn't completed */
	//   81  208:iload           4
	//   82  210:aload_2         
	//   83  211:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//   84  216:invokeinterface #394 <Method int NodeList.getLength()>
	//   85  221:icmpge          553
			Node node2 = node.getChildNodes().item(j);
	//   86  224:aload_2         
	//   87  225:invokeinterface #391 <Method NodeList Node.getChildNodes()>
	//   88  230:iload           4
	//   89  232:invokeinterface #395 <Method Node NodeList.item(int)>
	//   90  237:astore          7
			boolean flag2 = flag1;
	//   91  239:iload           5
	//   92  241:istore          6
			if(!isWhitespaceNode(node2))
	//*  93  243:aload           7
	//*  94  245:invokestatic    #418 <Method boolean isWhitespaceNode(Node)>
	//*  95  248:ifne            336
			{
				if(node2.getNodeType() != 1 || flag1)
					break;
	//   96  251:aload           7
	//   97  253:invokeinterface #315 <Method short Node.getNodeType()>
	//   98  258:iconst_1        
	//   99  259:icmpne          520
	//  100  262:iload           5
	//  101  264:ifne            520
				flag = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (node2.getNamespaceURI())));
	//  102  267:ldc2            #274 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//  103  270:aload           7
	//  104  272:invokeinterface #77  <Method String Node.getNamespaceURI()>
	//  105  277:invokevirtual   #85  <Method boolean String.equals(Object)>
	//  106  280:istore_3        
				String s1 = node2.getLocalName();
	//  107  281:aload           7
	//  108  283:invokeinterface #110 <Method String Node.getLocalName()>
	//  109  288:astore          8
				if(flag && "Bag".equals(((Object) (s1))))
	//* 110  290:iload_3         
	//* 111  291:ifeq            349
	//* 112  294:ldc2            #492 <String "Bag">
	//* 113  297:aload           8
	//* 114  299:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 115  302:ifeq            349
					xmpnode.getOptions().setArray(true);
	//  116  305:aload_1         
	//  117  306:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//  118  309:iconst_1        
	//  119  310:invokevirtual   #495 <Method PropertyOptions PropertyOptions.setArray(boolean)>
	//  120  313:pop             
				else
	//* 121  314:aload_0         
	//* 122  315:aload_1         
	//* 123  316:aload           7
	//* 124  318:iconst_0        
	//* 125  319:invokestatic    #420 <Method void rdf_NodeElement(XMPMetaImpl, XMPNode, Node, boolean)>
	//* 126  322:aload_1         
	//* 127  323:invokevirtual   #234 <Method boolean XMPNode.getHasValueChild()>
	//* 128  326:ifeq            503
	//* 129  329:aload_1         
	//* 130  330:invokestatic    #434 <Method void fixupQualifiedNode(XMPNode)>
	//* 131  333:iconst_1        
	//* 132  334:istore          6
	//* 133  336:iload           4
	//* 134  338:iconst_1        
	//* 135  339:iadd            
	//* 136  340:istore          4
	//* 137  342:iload           6
	//* 138  344:istore          5
	//* 139  346:goto            208
				if(flag && "Seq".equals(((Object) (s1))))
	//* 140  349:iload_3         
	//* 141  350:ifeq            380
	//* 142  353:ldc2            #497 <String "Seq">
	//* 143  356:aload           8
	//* 144  358:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 145  361:ifeq            380
					xmpnode.getOptions().setArray(true).setArrayOrdered(true);
	//  146  364:aload_1         
	//  147  365:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//  148  368:iconst_1        
	//  149  369:invokevirtual   #495 <Method PropertyOptions PropertyOptions.setArray(boolean)>
	//  150  372:iconst_1        
	//  151  373:invokevirtual   #500 <Method PropertyOptions PropertyOptions.setArrayOrdered(boolean)>
	//  152  376:pop             
				else
	//* 153  377:goto            314
				if(flag && "Alt".equals(((Object) (s1))))
	//* 154  380:iload_3         
	//* 155  381:ifeq            415
	//* 156  384:ldc2            #502 <String "Alt">
	//* 157  387:aload           8
	//* 158  389:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 159  392:ifeq            415
				{
					xmpnode.getOptions().setArray(true).setArrayOrdered(true).setArrayAlternate(true);
	//  160  395:aload_1         
	//  161  396:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//  162  399:iconst_1        
	//  163  400:invokevirtual   #495 <Method PropertyOptions PropertyOptions.setArray(boolean)>
	//  164  403:iconst_1        
	//  165  404:invokevirtual   #500 <Method PropertyOptions PropertyOptions.setArrayOrdered(boolean)>
	//  166  407:iconst_1        
	//  167  408:invokevirtual   #505 <Method PropertyOptions PropertyOptions.setArrayAlternate(boolean)>
	//  168  411:pop             
				} else
	//* 169  412:goto            314
				{
					xmpnode.getOptions().setStruct(true);
	//  170  415:aload_1         
	//  171  416:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//  172  419:iconst_1        
	//  173  420:invokevirtual   #238 <Method PropertyOptions PropertyOptions.setStruct(boolean)>
	//  174  423:pop             
					if(!flag && !"Description".equals(((Object) (s1))))
	//* 175  424:iload_3         
	//* 176  425:ifne            314
	//* 177  428:ldc2            #287 <String "Description">
	//* 178  431:aload           8
	//* 179  433:invokevirtual   #85  <Method boolean String.equals(Object)>
	//* 180  436:ifne            314
					{
						String s3 = node2.getNamespaceURI();
	//  181  439:aload           7
	//  182  441:invokeinterface #77  <Method String Node.getNamespaceURI()>
	//  183  446:astore          9
						if(s3 == null)
	//* 184  448:aload           9
	//* 185  450:ifnonnull       467
							throw new XMPException("All XML elements must be in a namespace", 203);
	//  186  453:new             #65  <Class XMPException>
	//  187  456:dup             
	//  188  457:ldc2            #507 <String "All XML elements must be in a namespace">
	//  189  460:sipush          203
	//  190  463:invokespecial   #167 <Method void XMPException(String, int)>
	//  191  466:athrow          
						addQualifierNode(xmpnode, "rdf:type", (new StringBuilder()).append(s3).append(':').append(s1).toString());
	//  192  467:aload_1         
	//  193  468:ldc2            #509 <String "rdf:type">
	//  194  471:new             #102 <Class StringBuilder>
	//  195  474:dup             
	//  196  475:invokespecial   #103 <Method void StringBuilder()>
	//  197  478:aload           9
	//  198  480:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  199  483:bipush          58
	//  200  485:invokevirtual   #512 <Method StringBuilder StringBuilder.append(char)>
	//  201  488:aload           8
	//  202  490:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  203  493:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  204  496:invokestatic    #384 <Method XMPNode addQualifierNode(XMPNode, String, String)>
	//  205  499:pop             
					}
				}
				rdf_NodeElement(xmpmetaimpl, xmpnode, node2, false);
				if(xmpnode.getHasValueChild())
					fixupQualifiedNode(xmpnode);
				else
	//* 206  500:goto            314
				if(xmpnode.getOptions().isArrayAlternate())
	//* 207  503:aload_1         
	//* 208  504:invokevirtual   #159 <Method PropertyOptions XMPNode.getOptions()>
	//* 209  507:invokevirtual   #515 <Method boolean PropertyOptions.isArrayAlternate()>
	//* 210  510:ifeq            333
					XMPNodeUtils.detectAltText(xmpnode);
	//  211  513:aload_1         
	//  212  514:invokestatic    #518 <Method void XMPNodeUtils.detectAltText(XMPNode)>
				flag2 = true;
			}
			j++;
			flag1 = flag2;
		} while(true);
	//* 213  517:goto            333
		if(flag1)
	//* 214  520:iload           5
	//* 215  522:ifeq            539
			throw new XMPException("Invalid child of resource property element", 202);
	//  216  525:new             #65  <Class XMPException>
	//  217  528:dup             
	//  218  529:ldc2            #520 <String "Invalid child of resource property element">
	//  219  532:sipush          202
	//  220  535:invokespecial   #167 <Method void XMPException(String, int)>
	//  221  538:athrow          
		else
			throw new XMPException("Children of resource property element must be XML elements", 202);
	//  222  539:new             #65  <Class XMPException>
	//  223  542:dup             
	//  224  543:ldc2            #522 <String "Children of resource property element must be XML elements">
	//  225  546:sipush          202
	//  226  549:invokespecial   #167 <Method void XMPException(String, int)>
	//  227  552:athrow          
		if(flag1) goto _L1; else goto _L6
	//  228  553:iload           5
	//  229  555:ifne            19
_L6:
		throw new XMPException("Missing child of resource property element", 202);
	//  230  558:new             #65  <Class XMPException>
	//  231  561:dup             
	//  232  562:ldc2            #524 <String "Missing child of resource property element">
	//  233  565:sipush          202
	//  234  568:invokespecial   #167 <Method void XMPException(String, int)>
	//  235  571:athrow          
	}

	static final boolean $assertionsDisabled;
	public static final String DEFAULT_PREFIX = "_dflt";
	public static final int RDFTERM_ABOUT = 3;
	public static final int RDFTERM_ABOUT_EACH = 10;
	public static final int RDFTERM_ABOUT_EACH_PREFIX = 11;
	public static final int RDFTERM_BAG_ID = 12;
	public static final int RDFTERM_DATATYPE = 7;
	public static final int RDFTERM_DESCRIPTION = 8;
	public static final int RDFTERM_FIRST_CORE = 1;
	public static final int RDFTERM_FIRST_OLD = 10;
	public static final int RDFTERM_FIRST_SYNTAX = 1;
	public static final int RDFTERM_ID = 2;
	public static final int RDFTERM_LAST_CORE = 7;
	public static final int RDFTERM_LAST_OLD = 12;
	public static final int RDFTERM_LAST_SYNTAX = 9;
	public static final int RDFTERM_LI = 9;
	public static final int RDFTERM_NODE_ID = 6;
	public static final int RDFTERM_OTHER = 0;
	public static final int RDFTERM_PARSE_TYPE = 4;
	public static final int RDFTERM_RDF = 1;
	public static final int RDFTERM_RESOURCE = 5;

	static 
	{
		boolean flag;
		if(!((Class) (com/itextpdf/xmp/impl/ParseRDF)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class ParseRDF>
	//*   1    2:invokevirtual   #55  <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #57  <Field boolean $assertionsDisabled>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		$assertionsDisabled = flag;
	//*  10   17:goto            10
	}
}
