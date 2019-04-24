// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.impl.xpath.XMPPath;
import com.itextpdf.xmp.impl.xpath.XMPPathParser;
import com.itextpdf.xmp.impl.xpath.XMPPathSegment;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.properties.XMPAliasInfo;
import java.util.Iterator;

// Referenced classes of package com.itextpdf.xmp.impl:
//			ParameterAsserts, XMPMetaImpl, XMPNode, XMPNodeUtils, 
//			Utils

public class XMPUtilsImpl
	implements XMPConst
{

	private XMPUtilsImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:return          
	}

	public static void appendProperties(XMPMeta xmpmeta, XMPMeta xmpmeta1, boolean flag, boolean flag1, boolean flag2)
		throws XMPException
	{
		ParameterAsserts.assertImplementation(xmpmeta);
	//    0    0:aload_0         
	//    1    1:invokestatic    #61  <Method void ParameterAsserts.assertImplementation(XMPMeta)>
		ParameterAsserts.assertImplementation(xmpmeta1);
	//    2    4:aload_1         
	//    3    5:invokestatic    #61  <Method void ParameterAsserts.assertImplementation(XMPMeta)>
		xmpmeta = ((XMPMeta) ((XMPMetaImpl)xmpmeta));
	//    4    8:aload_0         
	//    5    9:checkcast       #63  <Class XMPMetaImpl>
	//    6   12:astore_0        
		XMPMetaImpl xmpmetaimpl = (XMPMetaImpl)xmpmeta1;
	//    7   13:aload_1         
	//    8   14:checkcast       #63  <Class XMPMetaImpl>
	//    9   17:astore          6
		Iterator iterator = ((XMPMetaImpl) (xmpmeta)).getRoot().iterateChildren();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   12   23:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//   13   26:astore          7
		do
		{
			if(!iterator.hasNext())
				break;
	//   14   28:aload           7
	//   15   30:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//   16   35:ifeq            204
			XMPNode xmpnode = (XMPNode)iterator.next();
	//   17   38:aload           7
	//   18   40:invokeinterface #82  <Method Object Iterator.next()>
	//   19   45:checkcast       #69  <Class XMPNode>
	//   20   48:astore          8
			xmpmeta1 = ((XMPMeta) (XMPNodeUtils.findSchemaNode(xmpmetaimpl.getRoot(), xmpnode.getName(), false)));
	//   21   50:aload           6
	//   22   52:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   23   55:aload           8
	//   24   57:invokevirtual   #86  <Method String XMPNode.getName()>
	//   25   60:iconst_0        
	//   26   61:invokestatic    #92  <Method XMPNode XMPNodeUtils.findSchemaNode(XMPNode, String, boolean)>
	//   27   64:astore_1        
			boolean flag3 = false;
	//   28   65:iconst_0        
	//   29   66:istore          5
			xmpmeta = xmpmeta1;
	//   30   68:aload_1         
	//   31   69:astore_0        
			if(xmpmeta1 == null)
	//*  32   70:aload_1         
	//*  33   71:ifnonnull       115
			{
				xmpmeta = ((XMPMeta) (new XMPNode(xmpnode.getName(), xmpnode.getValue(), (new PropertyOptions()).setSchemaNode(true))));
	//   34   74:new             #69  <Class XMPNode>
	//   35   77:dup             
	//   36   78:aload           8
	//   37   80:invokevirtual   #86  <Method String XMPNode.getName()>
	//   38   83:aload           8
	//   39   85:invokevirtual   #95  <Method String XMPNode.getValue()>
	//   40   88:new             #97  <Class PropertyOptions>
	//   41   91:dup             
	//   42   92:invokespecial   #98  <Method void PropertyOptions()>
	//   43   95:iconst_1        
	//   44   96:invokevirtual   #102 <Method PropertyOptions PropertyOptions.setSchemaNode(boolean)>
	//   45   99:invokespecial   #105 <Method void XMPNode(String, String, PropertyOptions)>
	//   46  102:astore_0        
				xmpmetaimpl.getRoot().addChild(((XMPNode) (xmpmeta)));
	//   47  103:aload           6
	//   48  105:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   49  108:aload_0         
	//   50  109:invokevirtual   #109 <Method void XMPNode.addChild(XMPNode)>
				flag3 = true;
	//   51  112:iconst_1        
	//   52  113:istore          5
			}
			xmpmeta1 = ((XMPMeta) (xmpnode.iterateChildren()));
	//   53  115:aload           8
	//   54  117:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//   55  120:astore_1        
			do
			{
				if(!((Iterator) (xmpmeta1)).hasNext())
					break;
	//   56  121:aload_1         
	//   57  122:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//   58  127:ifeq            175
				XMPNode xmpnode1 = (XMPNode)((Iterator) (xmpmeta1)).next();
	//   59  130:aload_1         
	//   60  131:invokeinterface #82  <Method Object Iterator.next()>
	//   61  136:checkcast       #69  <Class XMPNode>
	//   62  139:astore          9
				if(flag || !Utils.isInternalProperty(xmpnode.getName(), xmpnode1.getName()))
	//*  63  141:iload_2         
	//*  64  142:ifne            161
	//*  65  145:aload           8
	//*  66  147:invokevirtual   #86  <Method String XMPNode.getName()>
	//*  67  150:aload           9
	//*  68  152:invokevirtual   #86  <Method String XMPNode.getName()>
	//*  69  155:invokestatic    #115 <Method boolean Utils.isInternalProperty(String, String)>
	//*  70  158:ifne            121
					appendSubtree(xmpmetaimpl, xmpnode1, ((XMPNode) (xmpmeta)), flag1, flag2);
	//   71  161:aload           6
	//   72  163:aload           9
	//   73  165:aload_0         
	//   74  166:iload_3         
	//   75  167:iload           4
	//   76  169:invokestatic    #119 <Method void appendSubtree(XMPMetaImpl, XMPNode, XMPNode, boolean, boolean)>
			} while(true);
	//   77  172:goto            121
			if(!((XMPNode) (xmpmeta)).hasChildren() && (flag3 || flag2))
	//*  78  175:aload_0         
	//*  79  176:invokevirtual   #122 <Method boolean XMPNode.hasChildren()>
	//*  80  179:ifne            28
	//*  81  182:iload           5
	//*  82  184:ifne            192
	//*  83  187:iload           4
	//*  84  189:ifeq            28
				xmpmetaimpl.getRoot().removeChild(((XMPNode) (xmpmeta)));
	//   85  192:aload           6
	//   86  194:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   87  197:aload_0         
	//   88  198:invokevirtual   #125 <Method void XMPNode.removeChild(XMPNode)>
		} while(true);
	//   89  201:goto            28
	//   90  204:return          
	}

	private static void appendSubtree(XMPMetaImpl xmpmetaimpl, XMPNode xmpnode, XMPNode xmpnode1, boolean flag, boolean flag1)
		throws XMPException
	{
		XMPNode xmpnode2;
		xmpnode2 = XMPNodeUtils.findChildNode(xmpnode1, xmpnode.getName(), false);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method String XMPNode.getName()>
	//    3    5:iconst_0        
	//    4    6:invokestatic    #129 <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//    5    9:astore          6
		boolean flag2 = false;
	//    6   11:iconst_0        
	//    7   12:istore          5
		if(flag1)
	//*   8   14:iload           4
	//*   9   16:ifeq            49
			if(xmpnode.getOptions().isSimple())
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//*  12   23:invokevirtual   #136 <Method boolean PropertyOptions.isSimple()>
	//*  13   26:ifeq            77
			{
				if(xmpnode.getValue() == null || xmpnode.getValue().length() == 0)
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #95  <Method String XMPNode.getValue()>
	//*  16   33:ifnull          46
	//*  17   36:aload_1         
	//*  18   37:invokevirtual   #95  <Method String XMPNode.getValue()>
	//*  19   40:invokevirtual   #142 <Method int String.length()>
	//*  20   43:ifne            71
					flag2 = true;
	//   21   46:iconst_1        
	//   22   47:istore          5
				else
	//*  23   49:iload           4
	//*  24   51:ifeq            96
	//*  25   54:iload           5
	//*  26   56:ifeq            96
	//*  27   59:aload           6
	//*  28   61:ifnull          70
	//*  29   64:aload_2         
	//*  30   65:aload           6
	//*  31   67:invokevirtual   #125 <Method void XMPNode.removeChild(XMPNode)>
	//*  32   70:return          
					flag2 = false;
	//   33   71:iconst_0        
	//   34   72:istore          5
			} else
	//*  35   74:goto            49
			if(!xmpnode.hasChildren())
	//*  36   77:aload_1         
	//*  37   78:invokevirtual   #122 <Method boolean XMPNode.hasChildren()>
	//*  38   81:ifne            90
				flag2 = true;
	//   39   84:iconst_1        
	//   40   85:istore          5
			else
	//*  41   87:goto            49
				flag2 = false;
	//   42   90:iconst_0        
	//   43   91:istore          5
		if(!flag1 || !flag2) goto _L2; else goto _L1
_L1:
		if(xmpnode2 != null)
			xmpnode1.removeChild(xmpnode2);
_L4:
		return;
	//*  44   93:goto            49
_L2:
		Object obj;
		if(xmpnode2 == null)
	//*  45   96:aload           6
	//*  46   98:ifnonnull       113
		{
			xmpnode1.addChild((XMPNode)xmpnode.clone());
	//   47  101:aload_2         
	//   48  102:aload_1         
	//   49  103:invokevirtual   #145 <Method Object XMPNode.clone()>
	//   50  106:checkcast       #69  <Class XMPNode>
	//   51  109:invokevirtual   #109 <Method void XMPNode.addChild(XMPNode)>
			return;
	//   52  112:return          
		}
		if(flag)
	//*  53  113:iload_3         
	//*  54  114:ifeq            150
		{
			xmpmetaimpl.setNode(xmpnode2, ((Object) (xmpnode.getValue())), xmpnode.getOptions(), true);
	//   55  117:aload_0         
	//   56  118:aload           6
	//   57  120:aload_1         
	//   58  121:invokevirtual   #95  <Method String XMPNode.getValue()>
	//   59  124:aload_1         
	//   60  125:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//   61  128:iconst_1        
	//   62  129:invokevirtual   #149 <Method void XMPMetaImpl.setNode(XMPNode, Object, PropertyOptions, boolean)>
			xmpnode1.removeChild(xmpnode2);
	//   63  132:aload_2         
	//   64  133:aload           6
	//   65  135:invokevirtual   #125 <Method void XMPNode.removeChild(XMPNode)>
			xmpnode1.addChild((XMPNode)xmpnode.clone());
	//   66  138:aload_2         
	//   67  139:aload_1         
	//   68  140:invokevirtual   #145 <Method Object XMPNode.clone()>
	//   69  143:checkcast       #69  <Class XMPNode>
	//   70  146:invokevirtual   #109 <Method void XMPNode.addChild(XMPNode)>
			return;
	//   71  149:return          
		}
		obj = ((Object) (xmpnode.getOptions()));
	//   72  150:aload_1         
	//   73  151:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//   74  154:astore          7
		if(obj != xmpnode2.getOptions())
			continue; /* Loop/switch isn't completed */
	//   75  156:aload           7
	//   76  158:aload           6
	//   77  160:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//   78  163:if_acmpne       70
		if(!((PropertyOptions) (obj)).isStruct())
			break; /* Loop/switch isn't completed */
	//   79  166:aload           7
	//   80  168:invokevirtual   #152 <Method boolean PropertyOptions.isStruct()>
	//   81  171:ifeq            228
		xmpnode = ((XMPNode) (xmpnode.iterateChildren()));
	//   82  174:aload_1         
	//   83  175:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//   84  178:astore_1        
		while(((Iterator) (xmpnode)).hasNext()) 
	//*  85  179:aload_1         
	//*  86  180:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  87  185:ifeq            70
		{
			appendSubtree(xmpmetaimpl, (XMPNode)((Iterator) (xmpnode)).next(), xmpnode2, flag, flag1);
	//   88  188:aload_0         
	//   89  189:aload_1         
	//   90  190:invokeinterface #82  <Method Object Iterator.next()>
	//   91  195:checkcast       #69  <Class XMPNode>
	//   92  198:aload           6
	//   93  200:iload_3         
	//   94  201:iload           4
	//   95  203:invokestatic    #119 <Method void appendSubtree(XMPMetaImpl, XMPNode, XMPNode, boolean, boolean)>
			if(flag1 && !xmpnode2.hasChildren())
	//*  96  206:iload           4
	//*  97  208:ifeq            179
	//*  98  211:aload           6
	//*  99  213:invokevirtual   #122 <Method boolean XMPNode.hasChildren()>
	//* 100  216:ifne            179
				xmpnode1.removeChild(xmpnode2);
	//  101  219:aload_2         
	//  102  220:aload           6
	//  103  222:invokevirtual   #125 <Method void XMPNode.removeChild(XMPNode)>
		}
		if(true) goto _L4; else goto _L3
	//  104  225:goto            179
_L3:
		if(!((PropertyOptions) (obj)).isArrayAltText())
			continue; /* Loop/switch isn't completed */
	//  105  228:aload           7
	//  106  230:invokevirtual   #155 <Method boolean PropertyOptions.isArrayAltText()>
	//  107  233:ifeq            427
		xmpmetaimpl = ((XMPMetaImpl) (xmpnode.iterateChildren()));
	//  108  236:aload_1         
	//  109  237:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//  110  240:astore_0        
		while(((Iterator) (xmpmetaimpl)).hasNext()) 
	//* 111  241:aload_0         
	//* 112  242:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//* 113  247:ifeq            70
		{
			xmpnode = (XMPNode)((Iterator) (xmpmetaimpl)).next();
	//  114  250:aload_0         
	//  115  251:invokeinterface #82  <Method Object Iterator.next()>
	//  116  256:checkcast       #69  <Class XMPNode>
	//  117  259:astore_1        
			if(xmpnode.hasQualifier() && "xml:lang".equals(((Object) (xmpnode.getQualifier(1).getName()))))
	//* 118  260:aload_1         
	//* 119  261:invokevirtual   #158 <Method boolean XMPNode.hasQualifier()>
	//* 120  264:ifeq            241
	//* 121  267:ldc1            #160 <String "xml:lang">
	//* 122  269:aload_1         
	//* 123  270:iconst_1        
	//* 124  271:invokevirtual   #164 <Method XMPNode XMPNode.getQualifier(int)>
	//* 125  274:invokevirtual   #86  <Method String XMPNode.getName()>
	//* 126  277:invokevirtual   #168 <Method boolean String.equals(Object)>
	//* 127  280:ifeq            241
			{
				int i = XMPNodeUtils.lookupLanguageItem(xmpnode2, xmpnode.getQualifier(1).getValue());
	//  128  283:aload           6
	//  129  285:aload_1         
	//  130  286:iconst_1        
	//  131  287:invokevirtual   #164 <Method XMPNode XMPNode.getQualifier(int)>
	//  132  290:invokevirtual   #95  <Method String XMPNode.getValue()>
	//  133  293:invokestatic    #172 <Method int XMPNodeUtils.lookupLanguageItem(XMPNode, String)>
	//  134  296:istore          5
				if(flag1 && (xmpnode.getValue() == null || xmpnode.getValue().length() == 0))
	//* 135  298:iload           4
	//* 136  300:ifeq            350
	//* 137  303:aload_1         
	//* 138  304:invokevirtual   #95  <Method String XMPNode.getValue()>
	//* 139  307:ifnull          320
	//* 140  310:aload_1         
	//* 141  311:invokevirtual   #95  <Method String XMPNode.getValue()>
	//* 142  314:invokevirtual   #142 <Method int String.length()>
	//* 143  317:ifne            350
				{
					if(i != -1)
	//* 144  320:iload           5
	//* 145  322:iconst_m1       
	//* 146  323:icmpeq          241
					{
						xmpnode2.removeChild(i);
	//  147  326:aload           6
	//  148  328:iload           5
	//  149  330:invokevirtual   #175 <Method void XMPNode.removeChild(int)>
						if(!xmpnode2.hasChildren())
	//* 150  333:aload           6
	//* 151  335:invokevirtual   #122 <Method boolean XMPNode.hasChildren()>
	//* 152  338:ifne            241
							xmpnode1.removeChild(xmpnode2);
	//  153  341:aload_2         
	//  154  342:aload           6
	//  155  344:invokevirtual   #125 <Method void XMPNode.removeChild(XMPNode)>
					}
				} else
	//* 156  347:goto            241
				if(i == -1)
	//* 157  350:iload           5
	//* 158  352:iconst_m1       
	//* 159  353:icmpne          241
					if(!"x-default".equals(((Object) (xmpnode.getQualifier(1).getValue()))) || !xmpnode2.hasChildren())
	//* 160  356:ldc1            #177 <String "x-default">
	//* 161  358:aload_1         
	//* 162  359:iconst_1        
	//* 163  360:invokevirtual   #164 <Method XMPNode XMPNode.getQualifier(int)>
	//* 164  363:invokevirtual   #95  <Method String XMPNode.getValue()>
	//* 165  366:invokevirtual   #168 <Method boolean String.equals(Object)>
	//* 166  369:ifeq            380
	//* 167  372:aload           6
	//* 168  374:invokevirtual   #122 <Method boolean XMPNode.hasChildren()>
	//* 169  377:ifne            389
					{
						xmpnode.cloneSubtree(xmpnode2);
	//  170  380:aload_1         
	//  171  381:aload           6
	//  172  383:invokevirtual   #180 <Method void XMPNode.cloneSubtree(XMPNode)>
					} else
	//* 173  386:goto            241
					{
						obj = ((Object) (new XMPNode(xmpnode.getName(), xmpnode.getValue(), xmpnode.getOptions())));
	//  174  389:new             #69  <Class XMPNode>
	//  175  392:dup             
	//  176  393:aload_1         
	//  177  394:invokevirtual   #86  <Method String XMPNode.getName()>
	//  178  397:aload_1         
	//  179  398:invokevirtual   #95  <Method String XMPNode.getValue()>
	//  180  401:aload_1         
	//  181  402:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//  182  405:invokespecial   #105 <Method void XMPNode(String, String, PropertyOptions)>
	//  183  408:astore          7
						xmpnode.cloneSubtree(((XMPNode) (obj)));
	//  184  410:aload_1         
	//  185  411:aload           7
	//  186  413:invokevirtual   #180 <Method void XMPNode.cloneSubtree(XMPNode)>
						xmpnode2.addChild(1, ((XMPNode) (obj)));
	//  187  416:aload           6
	//  188  418:iconst_1        
	//  189  419:aload           7
	//  190  421:invokevirtual   #183 <Method void XMPNode.addChild(int, XMPNode)>
					}
			}
		}
		if(true)
			continue; /* Loop/switch isn't completed */
	//  191  424:goto            241
		if(!((PropertyOptions) (obj)).isArray()) goto _L4; else goto _L5
	//  192  427:aload           7
	//  193  429:invokevirtual   #186 <Method boolean PropertyOptions.isArray()>
	//  194  432:ifeq            70
_L5:
		xmpnode = ((XMPNode) (xmpnode.iterateChildren()));
	//  195  435:aload_1         
	//  196  436:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//  197  439:astore_1        
		xmpmetaimpl = ((XMPMetaImpl) (xmpnode2));
	//  198  440:aload           6
	//  199  442:astore_0        
		while(((Iterator) (xmpnode)).hasNext()) 
	//* 200  443:aload_1         
	//* 201  444:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//* 202  449:ifeq            70
		{
			XMPNode xmpnode3 = (XMPNode)((Iterator) (xmpnode)).next();
	//  203  452:aload_1         
	//  204  453:invokeinterface #82  <Method Object Iterator.next()>
	//  205  458:checkcast       #69  <Class XMPNode>
	//  206  461:astore          6
			boolean flag3 = false;
	//  207  463:iconst_0        
	//  208  464:istore          5
			Iterator iterator = ((XMPNode) (xmpmetaimpl)).iterateChildren();
	//  209  466:aload_0         
	//  210  467:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//  211  470:astore          7
			do
			{
				if(!iterator.hasNext())
					break;
	//  212  472:aload           7
	//  213  474:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//  214  479:ifeq            506
				if(itemValuesMatch(xmpnode3, (XMPNode)iterator.next()))
	//* 215  482:aload           6
	//* 216  484:aload           7
	//* 217  486:invokeinterface #82  <Method Object Iterator.next()>
	//* 218  491:checkcast       #69  <Class XMPNode>
	//* 219  494:invokestatic    #190 <Method boolean itemValuesMatch(XMPNode, XMPNode)>
	//* 220  497:ifeq            472
					flag3 = true;
	//  221  500:iconst_1        
	//  222  501:istore          5
			} while(true);
	//  223  503:goto            472
			if(!flag3)
	//* 224  506:iload           5
	//* 225  508:ifne            443
			{
				xmpmetaimpl = ((XMPMetaImpl) ((XMPNode)xmpnode3.clone()));
	//  226  511:aload           6
	//  227  513:invokevirtual   #145 <Method Object XMPNode.clone()>
	//  228  516:checkcast       #69  <Class XMPNode>
	//  229  519:astore_0        
				xmpnode1.addChild(((XMPNode) (xmpmetaimpl)));
	//  230  520:aload_2         
	//  231  521:aload_0         
	//  232  522:invokevirtual   #109 <Method void XMPNode.addChild(XMPNode)>
			}
		}
		if(true) goto _L4; else goto _L6
	//  233  525:goto            443
_L6:
	}

	private static String applyQuotes(String s, char c, char c1, boolean flag)
	{
		int i;
		int j;
		String s1;
		s1 = s;
	//    0    0:aload_0         
	//    1    1:astore          8
		if(s == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       11
			s1 = "";
	//    4    7:ldc1            #194 <String "">
	//    5    9:astore          8
		i = 0;
	//    6   11:iconst_0        
	//    7   12:istore          4
		j = 0;
	//    8   14:iconst_0        
	//    9   15:istore          5
_L10:
		if(j >= s1.length()) goto _L2; else goto _L1
	//   10   17:iload           5
	//   11   19:aload           8
	//   12   21:invokevirtual   #142 <Method int String.length()>
	//   13   24:icmpge          50
_L1:
		int k = classifyCharacter(s1.charAt(j));
	//   14   27:aload           8
	//   15   29:iload           5
	//   16   31:invokevirtual   #198 <Method char String.charAt(int)>
	//   17   34:invokestatic    #202 <Method int classifyCharacter(char)>
	//   18   37:istore          7
		if(j != 0 || k != 4) goto _L3; else goto _L2
	//   19   39:iload           5
	//   20   41:ifne            191
	//   21   44:iload           7
	//   22   46:iconst_4        
	//   23   47:icmpne          191
	//*  24   50:aload           8
	//*  25   52:astore_0        
	//*  26   53:iload           5
	//*  27   55:aload           8
	//*  28   57:invokevirtual   #142 <Method int String.length()>
	//*  29   60:icmpge          270
	//*  30   63:new             #204 <Class StringBuffer>
	//*  31   66:dup             
	//*  32   67:aload           8
	//*  33   69:invokevirtual   #142 <Method int String.length()>
	//*  34   72:iconst_2        
	//*  35   73:iadd            
	//*  36   74:invokespecial   #206 <Method void StringBuffer(int)>
	//*  37   77:astore_0        
	//*  38   78:iconst_0        
	//*  39   79:istore          4
	//*  40   81:iload           4
	//*  41   83:iload           5
	//*  42   85:icmpgt          102
	//*  43   88:aload           8
	//*  44   90:iload           5
	//*  45   92:invokevirtual   #198 <Method char String.charAt(int)>
	//*  46   95:invokestatic    #202 <Method int classifyCharacter(char)>
	//*  47   98:iconst_4        
	//*  48   99:icmpne          250
	//*  49  102:aload_0         
	//*  50  103:iload_1         
	//*  51  104:invokevirtual   #210 <Method StringBuffer StringBuffer.append(char)>
	//*  52  107:aload           8
	//*  53  109:iconst_0        
	//*  54  110:iload           4
	//*  55  112:invokevirtual   #214 <Method String String.substring(int, int)>
	//*  56  115:invokevirtual   #217 <Method StringBuffer StringBuffer.append(String)>
	//*  57  118:pop             
	//*  58  119:iload           4
	//*  59  121:aload           8
	//*  60  123:invokevirtual   #142 <Method int String.length()>
	//*  61  126:icmpge          259
	//*  62  129:aload_0         
	//*  63  130:aload           8
	//*  64  132:iload           4
	//*  65  134:invokevirtual   #198 <Method char String.charAt(int)>
	//*  66  137:invokevirtual   #210 <Method StringBuffer StringBuffer.append(char)>
	//*  67  140:pop             
	//*  68  141:aload           8
	//*  69  143:iload           4
	//*  70  145:invokevirtual   #198 <Method char String.charAt(int)>
	//*  71  148:invokestatic    #202 <Method int classifyCharacter(char)>
	//*  72  151:iconst_4        
	//*  73  152:icmpne          182
	//*  74  155:aload           8
	//*  75  157:iload           4
	//*  76  159:invokevirtual   #198 <Method char String.charAt(int)>
	//*  77  162:iload_1         
	//*  78  163:iload_2         
	//*  79  164:invokestatic    #221 <Method boolean isSurroundingQuote(char, char, char)>
	//*  80  167:ifeq            182
	//*  81  170:aload_0         
	//*  82  171:aload           8
	//*  83  173:iload           4
	//*  84  175:invokevirtual   #198 <Method char String.charAt(int)>
	//*  85  178:invokevirtual   #210 <Method StringBuffer StringBuffer.append(char)>
	//*  86  181:pop             
	//*  87  182:iload           4
	//*  88  184:iconst_1        
	//*  89  185:iadd            
	//*  90  186:istore          4
	//*  91  188:goto            119
_L3:
		if(k != 1) goto _L5; else goto _L4
	//   92  191:iload           7
	//   93  193:iconst_1        
	//   94  194:icmpne          214
_L4:
		if(i != 0) goto _L2; else goto _L6
	//   95  197:iload           4
	//   96  199:ifne            50
_L6:
		i = 1;
	//   97  202:iconst_1        
	//   98  203:istore          4
_L8:
		j++;
	//   99  205:iload           5
	//  100  207:iconst_1        
	//  101  208:iadd            
	//  102  209:istore          5
		continue; /* Loop/switch isn't completed */
	//  103  211:goto            17
_L5:
		flag1 = false;
	//  104  214:iconst_0        
	//  105  215:istore          6
		if(k == 3 || k == 5)
			break; /* Loop/switch isn't completed */
	//  106  217:iload           7
	//  107  219:iconst_3        
	//  108  220:icmpeq          50
	//  109  223:iload           7
	//  110  225:iconst_5        
	//  111  226:icmpeq          50
		i = ((int) (flag1));
	//  112  229:iload           6
	//  113  231:istore          4
		if(k != 2) goto _L8; else goto _L7
	//  114  233:iload           7
	//  115  235:iconst_2        
	//  116  236:icmpne          205
_L7:
		i = ((int) (flag1));
	//  117  239:iload           6
	//  118  241:istore          4
		if(flag) goto _L8; else goto _L2
	//  119  243:iload_3         
	//  120  244:ifne            205
_L2:
		s = s1;
		if(j >= s1.length())
			break MISSING_BLOCK_LABEL_270;
		s = ((String) (new StringBuffer(s1.length() + 2)));
		i = 0;
		do
		{
			boolean flag1;
			if(i > j || classifyCharacter(s1.charAt(j)) == 4)
			{
				((StringBuffer) (s)).append(c).append(s1.substring(0, i));
				for(; i < s1.length(); i++)
				{
					((StringBuffer) (s)).append(s1.charAt(i));
					if(classifyCharacter(s1.charAt(i)) == 4 && isSurroundingQuote(s1.charAt(i), c, c1))
						((StringBuffer) (s)).append(s1.charAt(i));
				}

				break MISSING_BLOCK_LABEL_259;
			}
	//* 121  247:goto            50
			i++;
	//  122  250:iload           4
	//  123  252:iconst_1        
	//  124  253:iadd            
	//  125  254:istore          4
		} while(true);
	//  126  256:goto            81
		((StringBuffer) (s)).append(c1);
	//  127  259:aload_0         
	//  128  260:iload_2         
	//  129  261:invokevirtual   #210 <Method StringBuffer StringBuffer.append(char)>
	//  130  264:pop             
		s = ((StringBuffer) (s)).toString();
	//  131  265:aload_0         
	//  132  266:invokevirtual   #224 <Method String StringBuffer.toString()>
	//  133  269:astore_0        
		return s;
	//  134  270:aload_0         
	//  135  271:areturn         
		if(true) goto _L10; else goto _L9
_L9:
	}

	public static String catenateArrayItems(XMPMeta xmpmeta, String s, String s1, String s2, String s3, boolean flag)
		throws XMPException
	{
		String s4;
label0:
		{
			ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #230 <Method void ParameterAsserts.assertSchemaNS(String)>
			ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #233 <Method void ParameterAsserts.assertArrayName(String)>
			ParameterAsserts.assertImplementation(xmpmeta);
	//    4    8:aload_0         
	//    5    9:invokestatic    #61  <Method void ParameterAsserts.assertImplementation(XMPMeta)>
			if(s2 != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          26
			{
				s4 = s2;
	//    8   16:aload_3         
	//    9   17:astore          8
				if(s2.length() != 0)
					break label0;
	//   10   19:aload_3         
	//   11   20:invokevirtual   #142 <Method int String.length()>
	//   12   23:ifne            30
			}
			s4 = "; ";
	//   13   26:ldc1            #235 <String "; ">
	//   14   28:astore          8
		}
label1:
		{
			if(s3 != null)
	//*  15   30:aload           4
	//*  16   32:ifnull          46
			{
				s2 = s3;
	//   17   35:aload           4
	//   18   37:astore_3        
				if(s3.length() != 0)
					break label1;
	//   19   38:aload           4
	//   20   40:invokevirtual   #142 <Method int String.length()>
	//   21   43:ifne            49
			}
			s2 = "\"";
	//   22   46:ldc1            #237 <String "\"">
	//   23   48:astore_3        
		}
		xmpmeta = ((XMPMeta) ((XMPMetaImpl)xmpmeta));
	//   24   49:aload_0         
	//   25   50:checkcast       #63  <Class XMPMetaImpl>
	//   26   53:astore_0        
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//   27   54:aload_1         
	//   28   55:aload_2         
	//   29   56:invokestatic    #243 <Method XMPPath XMPPathParser.expandXPath(String, String)>
	//   30   59:astore_1        
		s = ((String) (XMPNodeUtils.findNode(((XMPMetaImpl) (xmpmeta)).getRoot(), ((XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//   31   60:aload_0         
	//   32   61:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   33   64:aload_1         
	//   34   65:iconst_0        
	//   35   66:aconst_null     
	//   36   67:invokestatic    #247 <Method XMPNode XMPNodeUtils.findNode(XMPNode, XMPPath, boolean, PropertyOptions)>
	//   37   70:astore_1        
		if(s == null)
	//*  38   71:aload_1         
	//*  39   72:ifnonnull       78
			return "";
	//   40   75:ldc1            #194 <String "">
	//   41   77:areturn         
		if(!((XMPNode) (s)).getOptions().isArray() || ((XMPNode) (s)).getOptions().isArrayAlternate())
	//*  42   78:aload_1         
	//*  43   79:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//*  44   82:invokevirtual   #186 <Method boolean PropertyOptions.isArray()>
	//*  45   85:ifeq            98
	//*  46   88:aload_1         
	//*  47   89:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//*  48   92:invokevirtual   #250 <Method boolean PropertyOptions.isArrayAlternate()>
	//*  49   95:ifeq            109
			throw new XMPException("Named property must be non-alternate array", 4);
	//   50   98:new             #55  <Class XMPException>
	//   51  101:dup             
	//   52  102:ldc1            #252 <String "Named property must be non-alternate array">
	//   53  104:iconst_4        
	//   54  105:invokespecial   #255 <Method void XMPException(String, int)>
	//   55  108:athrow          
		checkSeparator(s4);
	//   56  109:aload           8
	//   57  111:invokestatic    #258 <Method void checkSeparator(String)>
		char c = s2.charAt(0);
	//   58  114:aload_3         
	//   59  115:iconst_0        
	//   60  116:invokevirtual   #198 <Method char String.charAt(int)>
	//   61  119:istore          6
		char c1 = checkQuotes(s2, c);
	//   62  121:aload_3         
	//   63  122:iload           6
	//   64  124:invokestatic    #262 <Method char checkQuotes(String, char)>
	//   65  127:istore          7
		xmpmeta = ((XMPMeta) (new StringBuffer()));
	//   66  129:new             #204 <Class StringBuffer>
	//   67  132:dup             
	//   68  133:invokespecial   #263 <Method void StringBuffer()>
	//   69  136:astore_0        
		s = ((String) (((XMPNode) (s)).iterateChildren()));
	//   70  137:aload_1         
	//   71  138:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//   72  141:astore_1        
		do
		{
			if(!((Iterator) (s)).hasNext())
				break;
	//   73  142:aload_1         
	//   74  143:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//   75  148:ifeq            220
			s1 = ((String) ((XMPNode)((Iterator) (s)).next()));
	//   76  151:aload_1         
	//   77  152:invokeinterface #82  <Method Object Iterator.next()>
	//   78  157:checkcast       #69  <Class XMPNode>
	//   79  160:astore_2        
			if(((XMPNode) (s1)).getOptions().isCompositeProperty())
	//*  80  161:aload_2         
	//*  81  162:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//*  82  165:invokevirtual   #266 <Method boolean PropertyOptions.isCompositeProperty()>
	//*  83  168:ifeq            183
				throw new XMPException("Array items must be simple", 4);
	//   84  171:new             #55  <Class XMPException>
	//   85  174:dup             
	//   86  175:ldc2            #268 <String "Array items must be simple">
	//   87  178:iconst_4        
	//   88  179:invokespecial   #255 <Method void XMPException(String, int)>
	//   89  182:athrow          
			((StringBuffer) (xmpmeta)).append(applyQuotes(((XMPNode) (s1)).getValue(), c, c1, flag));
	//   90  183:aload_0         
	//   91  184:aload_2         
	//   92  185:invokevirtual   #95  <Method String XMPNode.getValue()>
	//   93  188:iload           6
	//   94  190:iload           7
	//   95  192:iload           5
	//   96  194:invokestatic    #270 <Method String applyQuotes(String, char, char, boolean)>
	//   97  197:invokevirtual   #217 <Method StringBuffer StringBuffer.append(String)>
	//   98  200:pop             
			if(((Iterator) (s)).hasNext())
	//*  99  201:aload_1         
	//* 100  202:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//* 101  207:ifeq            142
				((StringBuffer) (xmpmeta)).append(s4);
	//  102  210:aload_0         
	//  103  211:aload           8
	//  104  213:invokevirtual   #217 <Method StringBuffer StringBuffer.append(String)>
	//  105  216:pop             
		} while(true);
	//  106  217:goto            142
		return ((StringBuffer) (xmpmeta)).toString();
	//  107  220:aload_0         
	//  108  221:invokevirtual   #224 <Method String StringBuffer.toString()>
	//  109  224:areturn         
	}

	private static char checkQuotes(String s, char c)
		throws XMPException
	{
		if(classifyCharacter(c) != 4)
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #202 <Method int classifyCharacter(char)>
	//*   2    4:iconst_4        
	//*   3    5:icmpeq          20
			throw new XMPException("Invalid quoting character", 4);
	//    4    8:new             #55  <Class XMPException>
	//    5   11:dup             
	//    6   12:ldc2            #272 <String "Invalid quoting character">
	//    7   15:iconst_4        
	//    8   16:invokespecial   #255 <Method void XMPException(String, int)>
	//    9   19:athrow          
		char c1;
		if(s.length() == 1)
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #142 <Method int String.length()>
	//*  12   24:iconst_1        
	//*  13   25:icmpne          50
		{
			c1 = c;
	//   14   28:iload_1         
	//   15   29:istore_2        
		} else
	//*  16   30:iload_2         
	//*  17   31:iload_1         
	//*  18   32:invokestatic    #276 <Method char getClosingQuote(char)>
	//*  19   35:icmpeq          78
	//*  20   38:new             #55  <Class XMPException>
	//*  21   41:dup             
	//*  22   42:ldc2            #278 <String "Mismatched quote pair">
	//*  23   45:iconst_4        
	//*  24   46:invokespecial   #255 <Method void XMPException(String, int)>
	//*  25   49:athrow          
		{
			char c2 = s.charAt(1);
	//   26   50:aload_0         
	//   27   51:iconst_1        
	//   28   52:invokevirtual   #198 <Method char String.charAt(int)>
	//   29   55:istore_3        
			c1 = c2;
	//   30   56:iload_3         
	//   31   57:istore_2        
			if(classifyCharacter(c2) != 4)
	//*  32   58:iload_3         
	//*  33   59:invokestatic    #202 <Method int classifyCharacter(char)>
	//*  34   62:iconst_4        
	//*  35   63:icmpeq          30
				throw new XMPException("Invalid quoting character", 4);
	//   36   66:new             #55  <Class XMPException>
	//   37   69:dup             
	//   38   70:ldc2            #272 <String "Invalid quoting character">
	//   39   73:iconst_4        
	//   40   74:invokespecial   #255 <Method void XMPException(String, int)>
	//   41   77:athrow          
		}
		if(c1 != getClosingQuote(c))
			throw new XMPException("Mismatched quote pair", 4);
		else
			return c1;
	//   42   78:iload_2         
	//   43   79:ireturn         
	}

	private static void checkSeparator(String s)
		throws XMPException
	{
		int i;
		boolean flag;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
_L2:
		int j;
		if(i >= s.length())
			break MISSING_BLOCK_LABEL_68;
	//    4    4:iload_1         
	//    5    5:aload_0         
	//    6    6:invokevirtual   #142 <Method int String.length()>
	//    7    9:icmpge          68
		j = classifyCharacter(s.charAt(i));
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #198 <Method char String.charAt(int)>
	//   11   17:invokestatic    #202 <Method int classifyCharacter(char)>
	//   12   20:istore_3        
		if(j != 3)
			break; /* Loop/switch isn't completed */
	//   13   21:iload_3         
	//   14   22:iconst_3        
	//   15   23:icmpne          51
		if(flag)
	//*  16   26:iload_2         
	//*  17   27:ifeq            42
			throw new XMPException("Separator can have only one semicolon", 4);
	//   18   30:new             #55  <Class XMPException>
	//   19   33:dup             
	//   20   34:ldc2            #280 <String "Separator can have only one semicolon">
	//   21   37:iconst_4        
	//   22   38:invokespecial   #255 <Method void XMPException(String, int)>
	//   23   41:athrow          
		flag = true;
	//   24   42:iconst_1        
	//   25   43:istore_2        
_L4:
		i++;
	//   26   44:iload_1         
	//   27   45:iconst_1        
	//   28   46:iadd            
	//   29   47:istore_1        
		if(true) goto _L2; else goto _L1
	//   30   48:goto            4
_L1:
		if(j == 1) goto _L4; else goto _L3
	//   31   51:iload_3         
	//   32   52:iconst_1        
	//   33   53:icmpeq          44
_L3:
		throw new XMPException("Separator can have only spaces and one semicolon", 4);
	//   34   56:new             #55  <Class XMPException>
	//   35   59:dup             
	//   36   60:ldc2            #282 <String "Separator can have only spaces and one semicolon">
	//   37   63:iconst_4        
	//   38   64:invokespecial   #255 <Method void XMPException(String, int)>
	//   39   67:athrow          
		if(!flag)
	//*  40   68:iload_2         
	//*  41   69:ifne            84
			throw new XMPException("Separator must have one semicolon", 4);
	//   42   72:new             #55  <Class XMPException>
	//   43   75:dup             
	//   44   76:ldc2            #284 <String "Separator must have one semicolon">
	//   45   79:iconst_4        
	//   46   80:invokespecial   #255 <Method void XMPException(String, int)>
	//   47   83:athrow          
		else
			return;
	//   48   84:return          
	}

	private static int classifyCharacter(char c)
	{
		if(" \u3000\u303F".indexOf(((int) (c))) >= 0 || '\u2000' <= c && c <= '\u200B')
	//*   0    0:ldc1            #24  <String " \u3000\u303F">
	//*   1    2:iload_0         
	//*   2    3:invokevirtual   #288 <Method int String.indexOf(int)>
	//*   3    6:ifge            23
	//*   4    9:sipush          8192
	//*   5   12:iload_0         
	//*   6   13:icmpgt          25
	//*   7   16:iload_0         
	//*   8   17:sipush          8203
	//*   9   20:icmpgt          25
			return 1;
	//   10   23:iconst_1        
	//   11   24:ireturn         
		if(",\uFF0C\uFF64\uFE50\uFE51\u3001\u060C\u055D".indexOf(((int) (c))) >= 0)
	//*  12   25:ldc1            #12  <String ",\uFF0C\uFF64\uFE50\uFE51\u3001\u060C\u055D">
	//*  13   27:iload_0         
	//*  14   28:invokevirtual   #288 <Method int String.indexOf(int)>
	//*  15   31:iflt            36
			return 2;
	//   16   34:iconst_2        
	//   17   35:ireturn         
		if(";\uFF1B\uFE54\u061B\u037E".indexOf(((int) (c))) >= 0)
	//*  18   36:ldc1            #21  <String ";\uFF1B\uFE54\u061B\u037E">
	//*  19   38:iload_0         
	//*  20   39:invokevirtual   #288 <Method int String.indexOf(int)>
	//*  21   42:iflt            47
			return 3;
	//   22   45:iconst_3        
	//   23   46:ireturn         
		if("\"\253\273\u301D\u301E\u301F\u2015\u2039\u203A".indexOf(((int) (c))) >= 0 || '\u3008' <= c && c <= '\u300F' || '\u2018' <= c && c <= '\u201F')
	//*  24   47:ldc1            #18  <String "\"\253\273\u301D\u301E\u301F\u2015\u2039\u203A">
	//*  25   49:iload_0         
	//*  26   50:invokevirtual   #288 <Method int String.indexOf(int)>
	//*  27   53:ifge            84
	//*  28   56:sipush          12296
	//*  29   59:iload_0         
	//*  30   60:icmpgt          70
	//*  31   63:iload_0         
	//*  32   64:sipush          12303
	//*  33   67:icmple          84
	//*  34   70:sipush          8216
	//*  35   73:iload_0         
	//*  36   74:icmpgt          86
	//*  37   77:iload_0         
	//*  38   78:sipush          8223
	//*  39   81:icmpgt          86
			return 4;
	//   40   84:iconst_4        
	//   41   85:ireturn         
		return c >= ' ' && "\u2028\u2029".indexOf(((int) (c))) < 0 ? 0 : 5;
	//   42   86:iload_0         
	//   43   87:bipush          32
	//   44   89:icmplt          101
	//   45   92:ldc1            #15  <String "\u2028\u2029">
	//   46   94:iload_0         
	//   47   95:invokevirtual   #288 <Method int String.indexOf(int)>
	//   48   98:iflt            103
	//   49  101:iconst_5        
	//   50  102:ireturn         
	//   51  103:iconst_0        
	//   52  104:ireturn         
	}

	private static char getClosingQuote(char c)
	{
		switch(c)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    15: default 132
	//	               34: 134
	//	               171: 137
	//	               187: 141
	//	               8213: 145
	//	               8216: 149
	//	               8218: 153
	//	               8220: 157
	//	               8222: 161
	//	               8249: 165
	//	               8250: 169
	//	               12296: 173
	//	               12298: 177
	//	               12300: 181
	//	               12302: 185
	//	               12317: 189
		default:
			return '\0';
	//    2  132:iconst_0        
	//    3  133:ireturn         

		case 34: // '"'
			return '"';
	//    4  134:bipush          34
	//    5  136:ireturn         

		case 171: 
			return '\273';
	//    6  137:sipush          187
	//    7  140:ireturn         

		case 187: 
			return '\253';
	//    8  141:sipush          171
	//    9  144:ireturn         

		case 8213: 
			return '\u2015';
	//   10  145:sipush          8213
	//   11  148:ireturn         

		case 8216: 
			return '\u2019';
	//   12  149:sipush          8217
	//   13  152:ireturn         

		case 8218: 
			return '\u201B';
	//   14  153:sipush          8219
	//   15  156:ireturn         

		case 8220: 
			return '\u201D';
	//   16  157:sipush          8221
	//   17  160:ireturn         

		case 8222: 
			return '\u201F';
	//   18  161:sipush          8223
	//   19  164:ireturn         

		case 8249: 
			return '\u203A';
	//   20  165:sipush          8250
	//   21  168:ireturn         

		case 8250: 
			return '\u2039';
	//   22  169:sipush          8249
	//   23  172:ireturn         

		case 12296: 
			return '\u3009';
	//   24  173:sipush          12297
	//   25  176:ireturn         

		case 12298: 
			return '\u300B';
	//   26  177:sipush          12299
	//   27  180:ireturn         

		case 12300: 
			return '\u300D';
	//   28  181:sipush          12301
	//   29  184:ireturn         

		case 12302: 
			return '\u300F';
	//   30  185:sipush          12303
	//   31  188:ireturn         

		case 12317: 
			return '\u301F';
	//   32  189:sipush          12319
	//   33  192:ireturn         
		}
	}

	private static boolean isClosingingQuote(char c, char c1, char c2)
	{
		return c == c2 || c1 == '\u301D' && c == '\u301E' || c == '\u301F';
	//    0    0:iload_0         
	//    1    1:iload_2         
	//    2    2:icmpeq          26
	//    3    5:iload_1         
	//    4    6:sipush          12317
	//    5    9:icmpne          19
	//    6   12:iload_0         
	//    7   13:sipush          12318
	//    8   16:icmpeq          26
	//    9   19:iload_0         
	//   10   20:sipush          12319
	//   11   23:icmpne          28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	private static boolean isSurroundingQuote(char c, char c1, char c2)
	{
		return c == c1 || isClosingingQuote(c, c1, c2);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:icmpeq          14
	//    3    5:iload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:invokestatic    #291 <Method boolean isClosingingQuote(char, char, char)>
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	private static boolean itemValuesMatch(XMPNode xmpnode, XMPNode xmpnode1)
		throws XMPException
	{
		Object obj = ((Object) (xmpnode.getOptions()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//    2    4:astore          4
		if(!((PropertyOptions) (obj)).equals(((Object) (xmpnode1.getOptions())))) goto _L2; else goto _L1
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//    6   12:invokevirtual   #292 <Method boolean PropertyOptions.equals(Object)>
	//    7   15:ifeq            20
_L1:
		return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
_L2:
		if(((PropertyOptions) (obj)).getOptions() != 0) goto _L4; else goto _L3
	//   10   20:aload           4
	//   11   22:invokevirtual   #294 <Method int PropertyOptions.getOptions()>
	//   12   25:ifne            93
_L3:
		if(!xmpnode.getValue().equals(((Object) (xmpnode1.getValue()))) || xmpnode.getOptions().getHasLanguage() != xmpnode1.getOptions().getHasLanguage() || xmpnode.getOptions().getHasLanguage() && !xmpnode.getQualifier(1).getValue().equals(((Object) (xmpnode1.getQualifier(1).getValue())))) goto _L1; else goto _L5
	//   13   28:aload_0         
	//   14   29:invokevirtual   #95  <Method String XMPNode.getValue()>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #95  <Method String XMPNode.getValue()>
	//   17   36:invokevirtual   #168 <Method boolean String.equals(Object)>
	//   18   39:ifeq            18
	//   19   42:aload_0         
	//   20   43:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//   21   46:invokevirtual   #297 <Method boolean PropertyOptions.getHasLanguage()>
	//   22   49:aload_1         
	//   23   50:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//   24   53:invokevirtual   #297 <Method boolean PropertyOptions.getHasLanguage()>
	//   25   56:icmpne          18
	//   26   59:aload_0         
	//   27   60:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//   28   63:invokevirtual   #297 <Method boolean PropertyOptions.getHasLanguage()>
	//   29   66:ifeq            91
	//   30   69:aload_0         
	//   31   70:iconst_1        
	//   32   71:invokevirtual   #164 <Method XMPNode XMPNode.getQualifier(int)>
	//   33   74:invokevirtual   #95  <Method String XMPNode.getValue()>
	//   34   77:aload_1         
	//   35   78:iconst_1        
	//   36   79:invokevirtual   #164 <Method XMPNode XMPNode.getQualifier(int)>
	//   37   82:invokevirtual   #95  <Method String XMPNode.getValue()>
	//   38   85:invokevirtual   #168 <Method boolean String.equals(Object)>
	//   39   88:ifeq            18
_L5:
		return true;
	//   40   91:iconst_1        
	//   41   92:ireturn         
_L4:
		if(!((PropertyOptions) (obj)).isStruct())
			break MISSING_BLOCK_LABEL_166;
	//   42   93:aload           4
	//   43   95:invokevirtual   #152 <Method boolean PropertyOptions.isStruct()>
	//   44   98:ifeq            166
		if(xmpnode.getChildrenLength() != xmpnode1.getChildrenLength()) goto _L1; else goto _L6
	//   45  101:aload_0         
	//   46  102:invokevirtual   #300 <Method int XMPNode.getChildrenLength()>
	//   47  105:aload_1         
	//   48  106:invokevirtual   #300 <Method int XMPNode.getChildrenLength()>
	//   49  109:icmpne          18
_L6:
		xmpnode = ((XMPNode) (xmpnode.iterateChildren()));
	//   50  112:aload_0         
	//   51  113:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//   52  116:astore_0        
_L9:
		XMPNode xmpnode3;
		if(!((Iterator) (xmpnode)).hasNext())
			continue; /* Loop/switch isn't completed */
	//   53  117:aload_0         
	//   54  118:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//   55  123:ifeq            91
		obj = ((Object) ((XMPNode)((Iterator) (xmpnode)).next()));
	//   56  126:aload_0         
	//   57  127:invokeinterface #82  <Method Object Iterator.next()>
	//   58  132:checkcast       #69  <Class XMPNode>
	//   59  135:astore          4
		xmpnode3 = XMPNodeUtils.findChildNode(xmpnode1, ((XMPNode) (obj)).getName(), false);
	//   60  137:aload_1         
	//   61  138:aload           4
	//   62  140:invokevirtual   #86  <Method String XMPNode.getName()>
	//   63  143:iconst_0        
	//   64  144:invokestatic    #129 <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//   65  147:astore          5
		if(xmpnode3 == null) goto _L1; else goto _L7
	//   66  149:aload           5
	//   67  151:ifnull          18
_L7:
		if(itemValuesMatch(((XMPNode) (obj)), xmpnode3)) goto _L9; else goto _L8
	//   68  154:aload           4
	//   69  156:aload           5
	//   70  158:invokestatic    #190 <Method boolean itemValuesMatch(XMPNode, XMPNode)>
	//   71  161:ifne            117
_L8:
		return false;
	//   72  164:iconst_0        
	//   73  165:ireturn         
		if(!$assertionsDisabled && !((PropertyOptions) (obj)).isArray())
	//*  74  166:getstatic       #47  <Field boolean $assertionsDisabled>
	//*  75  169:ifne            188
	//*  76  172:aload           4
	//*  77  174:invokevirtual   #186 <Method boolean PropertyOptions.isArray()>
	//*  78  177:ifne            188
			throw new AssertionError();
	//   79  180:new             #302 <Class AssertionError>
	//   80  183:dup             
	//   81  184:invokespecial   #303 <Method void AssertionError()>
	//   82  187:athrow          
		xmpnode = ((XMPNode) (xmpnode.iterateChildren()));
	//   83  188:aload_0         
	//   84  189:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//   85  192:astore_0        
		boolean flag;
label0:
		do
		{
			if(!((Iterator) (xmpnode)).hasNext())
				continue; /* Loop/switch isn't completed */
	//   86  193:aload_0         
	//   87  194:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//   88  199:ifeq            91
			XMPNode xmpnode2 = (XMPNode)((Iterator) (xmpnode)).next();
	//   89  202:aload_0         
	//   90  203:invokeinterface #82  <Method Object Iterator.next()>
	//   91  208:checkcast       #69  <Class XMPNode>
	//   92  211:astore          4
			boolean flag1 = false;
	//   93  213:iconst_0        
	//   94  214:istore_3        
			Iterator iterator = xmpnode1.iterateChildren();
	//   95  215:aload_1         
	//   96  216:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//   97  219:astore          5
			do
			{
				flag = flag1;
	//   98  221:iload_3         
	//   99  222:istore_2        
				if(!iterator.hasNext())
					continue label0;
	//  100  223:aload           5
	//  101  225:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//  102  230:ifeq            253
			} while(!itemValuesMatch(xmpnode2, (XMPNode)iterator.next()));
	//  103  233:aload           4
	//  104  235:aload           5
	//  105  237:invokeinterface #82  <Method Object Iterator.next()>
	//  106  242:checkcast       #69  <Class XMPNode>
	//  107  245:invokestatic    #190 <Method boolean itemValuesMatch(XMPNode, XMPNode)>
	//  108  248:ifeq            221
			flag = true;
	//  109  251:iconst_1        
	//  110  252:istore_2        
		} while(flag);
	//  111  253:iload_2         
	//  112  254:ifne            193
		break; /* Loop/switch isn't completed */
		if(true) goto _L5; else goto _L10
_L10:
		return false;
	//  113  257:iconst_0        
	//  114  258:ireturn         
	}

	public static void removeProperties(XMPMeta xmpmeta, String s, String s1, boolean flag, boolean flag1)
		throws XMPException
	{
		ParameterAsserts.assertImplementation(xmpmeta);
	//    0    0:aload_0         
	//    1    1:invokestatic    #61  <Method void ParameterAsserts.assertImplementation(XMPMeta)>
		xmpmeta = ((XMPMeta) ((XMPMetaImpl)xmpmeta));
	//    2    4:aload_0         
	//    3    5:checkcast       #63  <Class XMPMetaImpl>
	//    4    8:astore_0        
		if(s1 == null || s1.length() <= 0) goto _L2; else goto _L1
	//    5    9:aload_2         
	//    6   10:ifnull          126
	//    7   13:aload_2         
	//    8   14:invokevirtual   #142 <Method int String.length()>
	//    9   17:ifle            126
_L1:
		if(s == null || s.length() == 0)
	//*  10   20:aload_1         
	//*  11   21:ifnull          31
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #142 <Method int String.length()>
	//*  14   28:ifne            43
			throw new XMPException("Property name requires schema namespace", 4);
	//   15   31:new             #55  <Class XMPException>
	//   16   34:dup             
	//   17   35:ldc2            #307 <String "Property name requires schema namespace">
	//   18   38:iconst_4        
	//   19   39:invokespecial   #255 <Method void XMPException(String, int)>
	//   20   42:athrow          
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:invokestatic    #243 <Method XMPPath XMPPathParser.expandXPath(String, String)>
	//   24   48:astore_1        
		xmpmeta = ((XMPMeta) (XMPNodeUtils.findNode(((XMPMetaImpl) (xmpmeta)).getRoot(), ((XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//   25   49:aload_0         
	//   26   50:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   27   53:aload_1         
	//   28   54:iconst_0        
	//   29   55:aconst_null     
	//   30   56:invokestatic    #247 <Method XMPNode XMPNodeUtils.findNode(XMPNode, XMPPath, boolean, PropertyOptions)>
	//   31   59:astore_0        
		if(xmpmeta != null && (flag || !Utils.isInternalProperty(((XMPPath) (s)).getSegment(0).getName(), ((XMPPath) (s)).getSegment(1).getName())))
	//*  32   60:aload_0         
	//*  33   61:ifnull          125
	//*  34   64:iload_3         
	//*  35   65:ifne            90
	//*  36   68:aload_1         
	//*  37   69:iconst_0        
	//*  38   70:invokevirtual   #313 <Method XMPPathSegment XMPPath.getSegment(int)>
	//*  39   73:invokevirtual   #316 <Method String XMPPathSegment.getName()>
	//*  40   76:aload_1         
	//*  41   77:iconst_1        
	//*  42   78:invokevirtual   #313 <Method XMPPathSegment XMPPath.getSegment(int)>
	//*  43   81:invokevirtual   #316 <Method String XMPPathSegment.getName()>
	//*  44   84:invokestatic    #115 <Method boolean Utils.isInternalProperty(String, String)>
	//*  45   87:ifne            125
		{
			s = ((String) (((XMPNode) (xmpmeta)).getParent()));
	//   46   90:aload_0         
	//   47   91:invokevirtual   #319 <Method XMPNode XMPNode.getParent()>
	//   48   94:astore_1        
			((XMPNode) (s)).removeChild(((XMPNode) (xmpmeta)));
	//   49   95:aload_1         
	//   50   96:aload_0         
	//   51   97:invokevirtual   #125 <Method void XMPNode.removeChild(XMPNode)>
			if(((XMPNode) (s)).getOptions().isSchemaNode() && !((XMPNode) (s)).hasChildren())
	//*  52  100:aload_1         
	//*  53  101:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//*  54  104:invokevirtual   #322 <Method boolean PropertyOptions.isSchemaNode()>
	//*  55  107:ifeq            125
	//*  56  110:aload_1         
	//*  57  111:invokevirtual   #122 <Method boolean XMPNode.hasChildren()>
	//*  58  114:ifne            125
				((XMPNode) (s)).getParent().removeChild(((XMPNode) (s)));
	//   59  117:aload_1         
	//   60  118:invokevirtual   #319 <Method XMPNode XMPNode.getParent()>
	//   61  121:aload_1         
	//   62  122:invokevirtual   #125 <Method void XMPNode.removeChild(XMPNode)>
		}
_L4:
		return;
	//   63  125:return          
_L2:
		if(s == null || s.length() <= 0)
			break; /* Loop/switch isn't completed */
	//   64  126:aload_1         
	//   65  127:ifnull          245
	//   66  130:aload_1         
	//   67  131:invokevirtual   #142 <Method int String.length()>
	//   68  134:ifle            245
		s1 = ((String) (XMPNodeUtils.findSchemaNode(((XMPMetaImpl) (xmpmeta)).getRoot(), s, false)));
	//   69  137:aload_0         
	//   70  138:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   71  141:aload_1         
	//   72  142:iconst_0        
	//   73  143:invokestatic    #92  <Method XMPNode XMPNodeUtils.findSchemaNode(XMPNode, String, boolean)>
	//   74  146:astore_2        
		if(s1 != null && removeSchemaChildren(((XMPNode) (s1)), flag))
	//*  75  147:aload_2         
	//*  76  148:ifnull          167
	//*  77  151:aload_2         
	//*  78  152:iload_3         
	//*  79  153:invokestatic    #326 <Method boolean removeSchemaChildren(XMPNode, boolean)>
	//*  80  156:ifeq            167
			((XMPMetaImpl) (xmpmeta)).getRoot().removeChild(((XMPNode) (s1)));
	//   81  159:aload_0         
	//   82  160:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   83  163:aload_2         
	//   84  164:invokevirtual   #125 <Method void XMPNode.removeChild(XMPNode)>
		if(flag1)
	//*  85  167:iload           4
	//*  86  169:ifeq            125
		{
			s = ((String) (XMPMetaFactory.getSchemaRegistry().findAliases(s)));
	//   87  172:invokestatic    #332 <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//   88  175:aload_1         
	//   89  176:invokeinterface #338 <Method XMPAliasInfo[] XMPSchemaRegistry.findAliases(String)>
	//   90  181:astore_1        
			int i = 0;
	//   91  182:iconst_0        
	//   92  183:istore          5
			while(i < s.length) 
	//*  93  185:iload           5
	//*  94  187:aload_1         
	//*  95  188:arraylength     
	//*  96  189:icmpge          125
			{
				s1 = ((String) (s[i]));
	//   97  192:aload_1         
	//   98  193:iload           5
	//   99  195:aaload          
	//  100  196:astore_2        
				s1 = ((String) (XMPPathParser.expandXPath(((XMPAliasInfo) (s1)).getNamespace(), ((XMPAliasInfo) (s1)).getPropName())));
	//  101  197:aload_2         
	//  102  198:invokeinterface #343 <Method String XMPAliasInfo.getNamespace()>
	//  103  203:aload_2         
	//  104  204:invokeinterface #346 <Method String XMPAliasInfo.getPropName()>
	//  105  209:invokestatic    #243 <Method XMPPath XMPPathParser.expandXPath(String, String)>
	//  106  212:astore_2        
				s1 = ((String) (XMPNodeUtils.findNode(((XMPMetaImpl) (xmpmeta)).getRoot(), ((XMPPath) (s1)), false, ((PropertyOptions) (null)))));
	//  107  213:aload_0         
	//  108  214:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//  109  217:aload_2         
	//  110  218:iconst_0        
	//  111  219:aconst_null     
	//  112  220:invokestatic    #247 <Method XMPNode XMPNodeUtils.findNode(XMPNode, XMPPath, boolean, PropertyOptions)>
	//  113  223:astore_2        
				if(s1 != null)
	//* 114  224:aload_2         
	//* 115  225:ifnull          236
					((XMPNode) (s1)).getParent().removeChild(((XMPNode) (s1)));
	//  116  228:aload_2         
	//  117  229:invokevirtual   #319 <Method XMPNode XMPNode.getParent()>
	//  118  232:aload_2         
	//  119  233:invokevirtual   #125 <Method void XMPNode.removeChild(XMPNode)>
				i++;
	//  120  236:iload           5
	//  121  238:iconst_1        
	//  122  239:iadd            
	//  123  240:istore          5
			}
		}
		if(true) goto _L4; else goto _L3
	//  124  242:goto            185
_L3:
		xmpmeta = ((XMPMeta) (((XMPMetaImpl) (xmpmeta)).getRoot().iterateChildren()));
	//  125  245:aload_0         
	//  126  246:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//  127  249:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//  128  252:astore_0        
		while(((Iterator) (xmpmeta)).hasNext()) 
	//* 129  253:aload_0         
	//* 130  254:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//* 131  259:ifeq            125
			if(removeSchemaChildren((XMPNode)((Iterator) (xmpmeta)).next(), flag))
	//* 132  262:aload_0         
	//* 133  263:invokeinterface #82  <Method Object Iterator.next()>
	//* 134  268:checkcast       #69  <Class XMPNode>
	//* 135  271:iload_3         
	//* 136  272:invokestatic    #326 <Method boolean removeSchemaChildren(XMPNode, boolean)>
	//* 137  275:ifeq            253
				((Iterator) (xmpmeta)).remove();
	//  138  278:aload_0         
	//  139  279:invokeinterface #349 <Method void Iterator.remove()>
		if(true) goto _L4; else goto _L5
	//  140  284:goto            253
_L5:
	}

	private static boolean removeSchemaChildren(XMPNode xmpnode, boolean flag)
	{
		Iterator iterator = xmpnode.iterateChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method Iterator XMPNode.iterateChildren()>
	//    2    4:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    3    5:aload_2         
	//    4    6:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            51
			XMPNode xmpnode1 = (XMPNode)iterator.next();
	//    6   14:aload_2         
	//    7   15:invokeinterface #82  <Method Object Iterator.next()>
	//    8   20:checkcast       #69  <Class XMPNode>
	//    9   23:astore_3        
			if(flag || !Utils.isInternalProperty(xmpnode.getName(), xmpnode1.getName()))
	//*  10   24:iload_1         
	//*  11   25:ifne            42
	//*  12   28:aload_0         
	//*  13   29:invokevirtual   #86  <Method String XMPNode.getName()>
	//*  14   32:aload_3         
	//*  15   33:invokevirtual   #86  <Method String XMPNode.getName()>
	//*  16   36:invokestatic    #115 <Method boolean Utils.isInternalProperty(String, String)>
	//*  17   39:ifne            5
				iterator.remove();
	//   18   42:aload_2         
	//   19   43:invokeinterface #349 <Method void Iterator.remove()>
		} while(true);
	//   20   48:goto            5
		return !xmpnode.hasChildren();
	//   21   51:aload_0         
	//   22   52:invokevirtual   #122 <Method boolean XMPNode.hasChildren()>
	//   23   55:ifne            60
	//   24   58:iconst_1        
	//   25   59:ireturn         
	//   26   60:iconst_0        
	//   27   61:ireturn         
	}

	public static void separateArrayItems(XMPMeta xmpmeta, String s, String s1, String s2, PropertyOptions propertyoptions, boolean flag)
		throws XMPException
	{
		char c;
		int k;
		int l;
		int k1;
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #230 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #233 <Method void ParameterAsserts.assertArrayName(String)>
		if(s2 == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       24
			throw new XMPException("Parameter must not be null", 4);
	//    6   12:new             #55  <Class XMPException>
	//    7   15:dup             
	//    8   16:ldc2            #353 <String "Parameter must not be null">
	//    9   19:iconst_4        
	//   10   20:invokespecial   #255 <Method void XMPException(String, int)>
	//   11   23:athrow          
		ParameterAsserts.assertImplementation(xmpmeta);
	//   12   24:aload_0         
	//   13   25:invokestatic    #61  <Method void ParameterAsserts.assertImplementation(XMPMeta)>
		s1 = ((String) (separateFindCreateArray(s, s1, propertyoptions, (XMPMetaImpl)xmpmeta)));
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:aload           4
	//   17   32:aload_0         
	//   18   33:checkcast       #63  <Class XMPMetaImpl>
	//   19   36:invokestatic    #357 <Method XMPNode separateFindCreateArray(String, String, PropertyOptions, XMPMetaImpl)>
	//   20   39:astore_2        
		k = 0;
	//   21   40:iconst_0        
	//   22   41:istore          12
		c = '\0';
	//   23   43:iconst_0        
	//   24   44:istore          6
		l = 0;
	//   25   46:iconst_0        
	//   26   47:istore          13
		k1 = s2.length();
	//   27   49:aload_3         
	//   28   50:invokevirtual   #142 <Method int String.length()>
	//   29   53:istore          15
_L22:
		if(l >= k1) goto _L2; else goto _L1
	//   30   55:iload           13
	//   31   57:iload           15
	//   32   59:icmpge          126
_L1:
		int i;
		int j;
		j = l;
	//   33   62:iload           13
	//   34   64:istore          11
		i = k;
	//   35   66:iload           12
	//   36   68:istore          10
_L9:
		if(j >= k1) goto _L4; else goto _L3
	//   37   70:iload           11
	//   38   72:iload           15
	//   39   74:icmpge          119
_L3:
		char c1;
		c1 = s2.charAt(j);
	//   40   77:aload_3         
	//   41   78:iload           11
	//   42   80:invokevirtual   #198 <Method char String.charAt(int)>
	//   43   83:istore          7
		k = classifyCharacter(c1);
	//   44   85:iload           7
	//   45   87:invokestatic    #202 <Method int classifyCharacter(char)>
	//   46   90:istore          12
		c = c1;
	//   47   92:iload           7
	//   48   94:istore          6
		i = k;
	//   49   96:iload           12
	//   50   98:istore          10
		if(k == 0) goto _L4; else goto _L5
	//   51  100:iload           12
	//   52  102:ifeq            119
_L5:
		if(k != 4) goto _L7; else goto _L6
	//   53  105:iload           12
	//   54  107:iconst_4        
	//   55  108:icmpne          127
_L6:
		i = k;
	//   56  111:iload           12
	//   57  113:istore          10
		c = c1;
	//   58  115:iload           7
	//   59  117:istore          6
_L4:
		if(j < k1)
			break; /* Loop/switch isn't completed */
	//   60  119:iload           11
	//   61  121:iload           15
	//   62  123:icmplt          144
_L2:
		return;
	//   63  126:return          
_L7:
		j++;
	//   64  127:iload           11
	//   65  129:iconst_1        
	//   66  130:iadd            
	//   67  131:istore          11
		c = c1;
	//   68  133:iload           7
	//   69  135:istore          6
		i = k;
	//   70  137:iload           12
	//   71  139:istore          10
		if(true) goto _L9; else goto _L8
	//   72  141:goto            70
_L8:
		if(i == 4) goto _L11; else goto _L10
	//   73  144:iload           10
	//   74  146:iconst_4        
	//   75  147:icmpeq          420
_L10:
		k = j;
	//   76  150:iload           11
	//   77  152:istore          12
_L19:
		c1 = c;
	//   78  154:iload           6
	//   79  156:istore          7
		if(k >= k1) goto _L13; else goto _L12
	//   80  158:iload           12
	//   81  160:iload           15
	//   82  162:icmpge          237
_L12:
		c1 = s2.charAt(k);
	//   83  165:aload_3         
	//   84  166:iload           12
	//   85  168:invokevirtual   #198 <Method char String.charAt(int)>
	//   86  171:istore          7
		l = classifyCharacter(c1);
	//   87  173:iload           7
	//   88  175:invokestatic    #202 <Method int classifyCharacter(char)>
	//   89  178:istore          13
		c = c1;
	//   90  180:iload           7
	//   91  182:istore          6
		if(l == 0) goto _L15; else goto _L14
	//   92  184:iload           13
	//   93  186:ifeq            214
_L14:
		c = c1;
	//   94  189:iload           7
	//   95  191:istore          6
		if(l == 4) goto _L15; else goto _L16
	//   96  193:iload           13
	//   97  195:iconst_4        
	//   98  196:icmpeq          214
_L16:
		if(l != 2 || !flag) goto _L18; else goto _L17
	//   99  199:iload           13
	//  100  201:iconst_2        
	//  101  202:icmpne          227
	//  102  205:iload           5
	//  103  207:ifeq            227
_L17:
		c = c1;
	//  104  210:iload           7
	//  105  212:istore          6
_L15:
		k++;
	//  106  214:iload           12
	//  107  216:iconst_1        
	//  108  217:iadd            
	//  109  218:istore          12
		i = l;
	//  110  220:iload           13
	//  111  222:istore          10
		  goto _L19
	//* 112  224:goto            154
_L18:
		if(l == 1) goto _L21; else goto _L20
	//  113  227:iload           13
	//  114  229:iconst_1        
	//  115  230:icmpeq          337
_L20:
		i = l;
	//  116  233:iload           13
	//  117  235:istore          10
_L13:
		s = s2.substring(j, k);
	//  118  237:aload_3         
	//  119  238:iload           11
	//  120  240:iload           12
	//  121  242:invokevirtual   #214 <Method String String.substring(int, int)>
	//  122  245:astore_1        
		j = k;
	//  123  246:iload           12
	//  124  248:istore          11
_L29:
		l = -1;
	//  125  250:iconst_m1       
	//  126  251:istore          13
		k = 1;
	//  127  253:iconst_1        
	//  128  254:istore          12
_L31:
		int i1 = l;
	//  129  256:iload           13
	//  130  258:istore          14
		if(k <= ((XMPNode) (s1)).getChildrenLength())
	//* 131  260:iload           12
	//* 132  262:aload_2         
	//* 133  263:invokevirtual   #300 <Method int XMPNode.getChildrenLength()>
	//* 134  266:icmpgt          289
		{
			if(!s.equals(((Object) (((XMPNode) (s1)).getChild(k).getValue()))))
				break MISSING_BLOCK_LABEL_633;
	//  135  269:aload_1         
	//  136  270:aload_2         
	//  137  271:iload           12
	//  138  273:invokevirtual   #360 <Method XMPNode XMPNode.getChild(int)>
	//  139  276:invokevirtual   #95  <Method String XMPNode.getValue()>
	//  140  279:invokevirtual   #168 <Method boolean String.equals(Object)>
	//  141  282:ifeq            633
			i1 = k;
	//  142  285:iload           12
	//  143  287:istore          14
		}
		c = c1;
	//  144  289:iload           7
	//  145  291:istore          6
		k = i;
	//  146  293:iload           10
	//  147  295:istore          12
		l = j;
	//  148  297:iload           11
	//  149  299:istore          13
		if(i1 < 0)
	//* 150  301:iload           14
	//* 151  303:ifge            55
		{
			((XMPNode) (s1)).addChild(new XMPNode("[]", s, ((PropertyOptions) (null))));
	//  152  306:aload_2         
	//  153  307:new             #69  <Class XMPNode>
	//  154  310:dup             
	//  155  311:ldc2            #362 <String "[]">
	//  156  314:aload_1         
	//  157  315:aconst_null     
	//  158  316:invokespecial   #105 <Method void XMPNode(String, String, PropertyOptions)>
	//  159  319:invokevirtual   #109 <Method void XMPNode.addChild(XMPNode)>
			c = c1;
	//  160  322:iload           7
	//  161  324:istore          6
			k = i;
	//  162  326:iload           10
	//  163  328:istore          12
			l = j;
	//  164  330:iload           11
	//  165  332:istore          13
		}
		  goto _L22
	//* 166  334:goto            55
_L21:
		i = l;
	//  167  337:iload           13
	//  168  339:istore          10
		if(k + 1 >= k1) goto _L13; else goto _L23
	//  169  341:iload           12
	//  170  343:iconst_1        
	//  171  344:iadd            
	//  172  345:iload           15
	//  173  347:icmpge          237
_L23:
		char c2;
		int j1;
		c2 = s2.charAt(k + 1);
	//  174  350:aload_3         
	//  175  351:iload           12
	//  176  353:iconst_1        
	//  177  354:iadd            
	//  178  355:invokevirtual   #198 <Method char String.charAt(int)>
	//  179  358:istore          8
		j1 = classifyCharacter(c2);
	//  180  360:iload           8
	//  181  362:invokestatic    #202 <Method int classifyCharacter(char)>
	//  182  365:istore          14
		c = c2;
	//  183  367:iload           8
	//  184  369:istore          6
		if(j1 == 0) goto _L15; else goto _L24
	//  185  371:iload           14
	//  186  373:ifeq            214
_L24:
		c = c2;
	//  187  376:iload           8
	//  188  378:istore          6
		if(j1 == 4) goto _L15; else goto _L25
	//  189  380:iload           14
	//  190  382:iconst_4        
	//  191  383:icmpeq          214
_L25:
		c1 = c2;
	//  192  386:iload           8
	//  193  388:istore          7
		i = l;
	//  194  390:iload           13
	//  195  392:istore          10
		if(j1 != 2) goto _L13; else goto _L26
	//  196  394:iload           14
	//  197  396:iconst_2        
	//  198  397:icmpne          237
_L26:
		c1 = c2;
	//  199  400:iload           8
	//  200  402:istore          7
		i = l;
	//  201  404:iload           13
	//  202  406:istore          10
		if(!flag) goto _L13; else goto _L27
	//  203  408:iload           5
	//  204  410:ifeq            237
_L27:
		c = c2;
	//  205  413:iload           8
	//  206  415:istore          6
		  goto _L15
	//* 207  417:goto            214
_L11:
		c2 = getClosingQuote(c);
	//  208  420:iload           6
	//  209  422:invokestatic    #276 <Method char getClosingQuote(char)>
	//  210  425:istore          8
		xmpmeta = "";
	//  211  427:ldc1            #194 <String "">
	//  212  429:astore_0        
		k = j + 1;
	//  213  430:iload           11
	//  214  432:iconst_1        
	//  215  433:iadd            
	//  216  434:istore          12
		c1 = c;
	//  217  436:iload           6
	//  218  438:istore          7
_L30:
		j = k;
	//  219  440:iload           12
	//  220  442:istore          11
		s = ((String) (xmpmeta));
	//  221  444:aload_0         
	//  222  445:astore_1        
		if(k >= k1) goto _L29; else goto _L28
	//  223  446:iload           12
	//  224  448:iload           15
	//  225  450:icmpge          250
_L28:
		c1 = s2.charAt(k);
	//  226  453:aload_3         
	//  227  454:iload           12
	//  228  456:invokevirtual   #198 <Method char String.charAt(int)>
	//  229  459:istore          7
		i = classifyCharacter(c1);
	//  230  461:iload           7
	//  231  463:invokestatic    #202 <Method int classifyCharacter(char)>
	//  232  466:istore          10
		if(i != 4 || !isSurroundingQuote(c1, c, c2))
	//* 233  468:iload           10
	//* 234  470:iconst_4        
	//* 235  471:icmpne          486
	//* 236  474:iload           7
	//* 237  476:iload           6
	//* 238  478:iload           8
	//* 239  480:invokestatic    #221 <Method boolean isSurroundingQuote(char, char, char)>
	//* 240  483:ifne            515
		{
			xmpmeta = ((XMPMeta) ((new StringBuilder()).append(((String) (xmpmeta))).append(c1).toString()));
	//  241  486:new             #364 <Class StringBuilder>
	//  242  489:dup             
	//  243  490:invokespecial   #365 <Method void StringBuilder()>
	//  244  493:aload_0         
	//  245  494:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//  246  497:iload           7
	//  247  499:invokevirtual   #371 <Method StringBuilder StringBuilder.append(char)>
	//  248  502:invokevirtual   #372 <Method String StringBuilder.toString()>
	//  249  505:astore_0        
		} else
	//* 250  506:iload           12
	//* 251  508:iconst_1        
	//* 252  509:iadd            
	//* 253  510:istore          12
	//* 254  512:goto            440
		{
			if(k + 1 < k1)
	//* 255  515:iload           12
	//* 256  517:iconst_1        
	//* 257  518:iadd            
	//* 258  519:iload           15
	//* 259  521:icmpge          580
			{
				char c3 = s2.charAt(k + 1);
	//  260  524:aload_3         
	//  261  525:iload           12
	//  262  527:iconst_1        
	//  263  528:iadd            
	//  264  529:invokevirtual   #198 <Method char String.charAt(int)>
	//  265  532:istore          9
				classifyCharacter(c3);
	//  266  534:iload           9
	//  267  536:invokestatic    #202 <Method int classifyCharacter(char)>
	//  268  539:pop             
				j = ((int) (c3));
	//  269  540:iload           9
	//  270  542:istore          11
			} else
	//* 271  544:iload           7
	//* 272  546:iload           11
	//* 273  548:icmpne          587
	//* 274  551:new             #364 <Class StringBuilder>
	//* 275  554:dup             
	//* 276  555:invokespecial   #365 <Method void StringBuilder()>
	//* 277  558:aload_0         
	//* 278  559:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//* 279  562:iload           7
	//* 280  564:invokevirtual   #371 <Method StringBuilder StringBuilder.append(char)>
	//* 281  567:invokevirtual   #372 <Method String StringBuilder.toString()>
	//* 282  570:astore_0        
	//* 283  571:iload           12
	//* 284  573:iconst_1        
	//* 285  574:iadd            
	//* 286  575:istore          12
	//* 287  577:goto            506
			{
				j = 59;
	//  288  580:bipush          59
	//  289  582:istore          11
			}
			if(c1 == j)
			{
				xmpmeta = ((XMPMeta) ((new StringBuilder()).append(((String) (xmpmeta))).append(c1).toString()));
				k++;
			} else
	//* 290  584:goto            544
			{
label0:
				{
					if(isClosingingQuote(c1, c, c2))
						break label0;
	//  291  587:iload           7
	//  292  589:iload           6
	//  293  591:iload           8
	//  294  593:invokestatic    #291 <Method boolean isClosingingQuote(char, char, char)>
	//  295  596:ifne            622
					xmpmeta = ((XMPMeta) ((new StringBuilder()).append(((String) (xmpmeta))).append(c1).toString()));
	//  296  599:new             #364 <Class StringBuilder>
	//  297  602:dup             
	//  298  603:invokespecial   #365 <Method void StringBuilder()>
	//  299  606:aload_0         
	//  300  607:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//  301  610:iload           7
	//  302  612:invokevirtual   #371 <Method StringBuilder StringBuilder.append(char)>
	//  303  615:invokevirtual   #372 <Method String StringBuilder.toString()>
	//  304  618:astore_0        
				}
			}
		}
		k++;
		  goto _L30
	//* 305  619:goto            506
		j = k + 1;
	//  306  622:iload           12
	//  307  624:iconst_1        
	//  308  625:iadd            
	//  309  626:istore          11
		s = ((String) (xmpmeta));
	//  310  628:aload_0         
	//  311  629:astore_1        
		  goto _L29
	//* 312  630:goto            250
		k++;
	//  313  633:iload           12
	//  314  635:iconst_1        
	//  315  636:iadd            
	//  316  637:istore          12
		  goto _L31
	//* 317  639:goto            256
	}

	private static XMPNode separateFindCreateArray(String s, String s1, PropertyOptions propertyoptions, XMPMetaImpl xmpmetaimpl)
		throws XMPException
	{
		propertyoptions = XMPNodeUtils.verifySetOptions(propertyoptions, ((Object) (null)));
	//    0    0:aload_2         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #376 <Method PropertyOptions XMPNodeUtils.verifySetOptions(PropertyOptions, Object)>
	//    3    5:astore_2        
		if(!propertyoptions.isOnlyArrayOptions())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #379 <Method boolean PropertyOptions.isOnlyArrayOptions()>
	//*   6   10:ifne            26
			throw new XMPException("Options can only provide array form", 103);
	//    7   13:new             #55  <Class XMPException>
	//    8   16:dup             
	//    9   17:ldc2            #381 <String "Options can only provide array form">
	//   10   20:bipush          103
	//   11   22:invokespecial   #255 <Method void XMPException(String, int)>
	//   12   25:athrow          
		s1 = ((String) (XMPPathParser.expandXPath(s, s1)));
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokestatic    #243 <Method XMPPath XMPPathParser.expandXPath(String, String)>
	//   16   31:astore_1        
		s = ((String) (XMPNodeUtils.findNode(xmpmetaimpl.getRoot(), ((XMPPath) (s1)), false, ((PropertyOptions) (null)))));
	//   17   32:aload_3         
	//   18   33:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   19   36:aload_1         
	//   20   37:iconst_0        
	//   21   38:aconst_null     
	//   22   39:invokestatic    #247 <Method XMPNode XMPNodeUtils.findNode(XMPNode, XMPPath, boolean, PropertyOptions)>
	//   23   42:astore_0        
		if(s != null)
	//*  24   43:aload_0         
	//*  25   44:ifnull          99
		{
			s1 = ((String) (((XMPNode) (s)).getOptions()));
	//   26   47:aload_0         
	//   27   48:invokevirtual   #133 <Method PropertyOptions XMPNode.getOptions()>
	//   28   51:astore_1        
			if(!((PropertyOptions) (s1)).isArray() || ((PropertyOptions) (s1)).isArrayAlternate())
	//*  29   52:aload_1         
	//*  30   53:invokevirtual   #186 <Method boolean PropertyOptions.isArray()>
	//*  31   56:ifeq            66
	//*  32   59:aload_1         
	//*  33   60:invokevirtual   #250 <Method boolean PropertyOptions.isArrayAlternate()>
	//*  34   63:ifeq            78
				throw new XMPException("Named property must be non-alternate array", 102);
	//   35   66:new             #55  <Class XMPException>
	//   36   69:dup             
	//   37   70:ldc1            #252 <String "Named property must be non-alternate array">
	//   38   72:bipush          102
	//   39   74:invokespecial   #255 <Method void XMPException(String, int)>
	//   40   77:athrow          
			if(propertyoptions.equalArrayTypes(((PropertyOptions) (s1))))
	//*  41   78:aload_2         
	//*  42   79:aload_1         
	//*  43   80:invokevirtual   #385 <Method boolean PropertyOptions.equalArrayTypes(PropertyOptions)>
	//*  44   83:ifeq            133
				throw new XMPException("Mismatch of specified and existing array form", 102);
	//   45   86:new             #55  <Class XMPException>
	//   46   89:dup             
	//   47   90:ldc2            #387 <String "Mismatch of specified and existing array form">
	//   48   93:bipush          102
	//   49   95:invokespecial   #255 <Method void XMPException(String, int)>
	//   50   98:athrow          
		} else
		{
			s1 = ((String) (XMPNodeUtils.findNode(xmpmetaimpl.getRoot(), ((XMPPath) (s1)), true, propertyoptions.setArray(true))));
	//   51   99:aload_3         
	//   52  100:invokevirtual   #67  <Method XMPNode XMPMetaImpl.getRoot()>
	//   53  103:aload_1         
	//   54  104:iconst_1        
	//   55  105:aload_2         
	//   56  106:iconst_1        
	//   57  107:invokevirtual   #390 <Method PropertyOptions PropertyOptions.setArray(boolean)>
	//   58  110:invokestatic    #247 <Method XMPNode XMPNodeUtils.findNode(XMPNode, XMPPath, boolean, PropertyOptions)>
	//   59  113:astore_1        
			s = s1;
	//   60  114:aload_1         
	//   61  115:astore_0        
			if(s1 == null)
	//*  62  116:aload_1         
	//*  63  117:ifnonnull       133
				throw new XMPException("Failed to create named array", 102);
	//   64  120:new             #55  <Class XMPException>
	//   65  123:dup             
	//   66  124:ldc2            #392 <String "Failed to create named array">
	//   67  127:bipush          102
	//   68  129:invokespecial   #255 <Method void XMPException(String, int)>
	//   69  132:athrow          
		}
		return ((XMPNode) (s));
	//   70  133:aload_0         
	//   71  134:areturn         
	}

	static final boolean $assertionsDisabled;
	private static final String COMMAS = ",\uFF0C\uFF64\uFE50\uFE51\u3001\u060C\u055D";
	private static final String CONTROLS = "\u2028\u2029";
	private static final String QUOTES = "\"\253\273\u301D\u301E\u301F\u2015\u2039\u203A";
	private static final String SEMICOLA = ";\uFF1B\uFE54\u061B\u037E";
	private static final String SPACES = " \u3000\u303F";
	private static final int UCK_COMMA = 2;
	private static final int UCK_CONTROL = 5;
	private static final int UCK_NORMAL = 0;
	private static final int UCK_QUOTE = 4;
	private static final int UCK_SEMICOLON = 3;
	private static final int UCK_SPACE = 1;

	static 
	{
		boolean flag;
		if(!((Class) (com/itextpdf/xmp/impl/XMPUtilsImpl)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class XMPUtilsImpl>
	//*   1    2:invokevirtual   #45  <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #47  <Field boolean $assertionsDisabled>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		$assertionsDisabled = flag;
	//*  10   17:goto            10
	}
}
