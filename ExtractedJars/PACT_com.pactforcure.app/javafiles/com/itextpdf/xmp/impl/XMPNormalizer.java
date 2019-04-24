// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.impl.xpath.XMPPathParser;
import com.itextpdf.xmp.options.*;
import com.itextpdf.xmp.properties.XMPAliasInfo;
import java.util.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPNode, XMPNodeUtils, XMPDateTimeImpl, XMPMetaImpl, 
//			Utils

public class XMPNormalizer
{

	private XMPNormalizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static void compareAliasedSubtrees(XMPNode xmpnode, XMPNode xmpnode1, boolean flag)
		throws XMPException
	{
		if(!xmpnode.getValue().equals(((Object) (xmpnode1.getValue()))) || xmpnode.getChildrenLength() != xmpnode1.getChildrenLength())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #25  <Method String XMPNode.getValue()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #25  <Method String XMPNode.getValue()>
	//*   4    8:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*   5   11:ifeq            25
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #35  <Method int XMPNode.getChildrenLength()>
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #35  <Method int XMPNode.getChildrenLength()>
	//*  10   22:icmpeq          38
			throw new XMPException("Mismatch between alias and base nodes", 203);
	//   11   25:new             #19  <Class XMPException>
	//   12   28:dup             
	//   13   29:ldc1            #37  <String "Mismatch between alias and base nodes">
	//   14   31:sipush          203
	//   15   34:invokespecial   #40  <Method void XMPException(String, int)>
	//   16   37:athrow          
		if(!flag && (!xmpnode.getName().equals(((Object) (xmpnode1.getName()))) || !xmpnode.getOptions().equals(((Object) (xmpnode1.getOptions()))) || xmpnode.getQualifierLength() != xmpnode1.getQualifierLength()))
	//*  17   38:iload_2         
	//*  18   39:ifne            94
	//*  19   42:aload_0         
	//*  20   43:invokevirtual   #43  <Method String XMPNode.getName()>
	//*  21   46:aload_1         
	//*  22   47:invokevirtual   #43  <Method String XMPNode.getName()>
	//*  23   50:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  24   53:ifeq            81
	//*  25   56:aload_0         
	//*  26   57:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*  27   60:aload_1         
	//*  28   61:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*  29   64:invokevirtual   #50  <Method boolean PropertyOptions.equals(Object)>
	//*  30   67:ifeq            81
	//*  31   70:aload_0         
	//*  32   71:invokevirtual   #53  <Method int XMPNode.getQualifierLength()>
	//*  33   74:aload_1         
	//*  34   75:invokevirtual   #53  <Method int XMPNode.getQualifierLength()>
	//*  35   78:icmpeq          94
			throw new XMPException("Mismatch between alias and base nodes", 203);
	//   36   81:new             #19  <Class XMPException>
	//   37   84:dup             
	//   38   85:ldc1            #37  <String "Mismatch between alias and base nodes">
	//   39   87:sipush          203
	//   40   90:invokespecial   #40  <Method void XMPException(String, int)>
	//   41   93:athrow          
		Iterator iterator = xmpnode.iterateChildren();
	//   42   94:aload_0         
	//   43   95:invokevirtual   #57  <Method Iterator XMPNode.iterateChildren()>
	//   44   98:astore_3        
		for(Iterator iterator1 = xmpnode1.iterateChildren(); iterator.hasNext() && iterator1.hasNext(); compareAliasedSubtrees((XMPNode)iterator.next(), (XMPNode)iterator1.next(), false));
	//   45   99:aload_1         
	//   46  100:invokevirtual   #57  <Method Iterator XMPNode.iterateChildren()>
	//   47  103:astore          4
	//   48  105:aload_3         
	//   49  106:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   50  111:ifeq            150
	//   51  114:aload           4
	//   52  116:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   53  121:ifeq            150
	//   54  124:aload_3         
	//   55  125:invokeinterface #67  <Method Object Iterator.next()>
	//   56  130:checkcast       #21  <Class XMPNode>
	//   57  133:aload           4
	//   58  135:invokeinterface #67  <Method Object Iterator.next()>
	//   59  140:checkcast       #21  <Class XMPNode>
	//   60  143:iconst_0        
	//   61  144:invokestatic    #69  <Method void compareAliasedSubtrees(XMPNode, XMPNode, boolean)>
	//*  62  147:goto            105
		xmpnode = ((XMPNode) (xmpnode.iterateQualifier()));
	//   63  150:aload_0         
	//   64  151:invokevirtual   #72  <Method Iterator XMPNode.iterateQualifier()>
	//   65  154:astore_0        
		for(xmpnode1 = ((XMPNode) (xmpnode1.iterateQualifier())); ((Iterator) (xmpnode)).hasNext() && ((Iterator) (xmpnode1)).hasNext(); compareAliasedSubtrees((XMPNode)((Iterator) (xmpnode)).next(), (XMPNode)((Iterator) (xmpnode1)).next(), false));
	//   66  155:aload_1         
	//   67  156:invokevirtual   #72  <Method Iterator XMPNode.iterateQualifier()>
	//   68  159:astore_1        
	//   69  160:aload_0         
	//   70  161:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   71  166:ifeq            203
	//   72  169:aload_1         
	//   73  170:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   74  175:ifeq            203
	//   75  178:aload_0         
	//   76  179:invokeinterface #67  <Method Object Iterator.next()>
	//   77  184:checkcast       #21  <Class XMPNode>
	//   78  187:aload_1         
	//   79  188:invokeinterface #67  <Method Object Iterator.next()>
	//   80  193:checkcast       #21  <Class XMPNode>
	//   81  196:iconst_0        
	//   82  197:invokestatic    #69  <Method void compareAliasedSubtrees(XMPNode, XMPNode, boolean)>
	//*  83  200:goto            160
	//   84  203:return          
	}

	private static void deleteEmptySchemas(XMPNode xmpnode)
	{
		xmpnode = ((XMPNode) (xmpnode.iterateChildren()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method Iterator XMPNode.iterateChildren()>
	//    2    4:astore_0        
		do
		{
			if(!((Iterator) (xmpnode)).hasNext())
				break;
	//    3    5:aload_0         
	//    4    6:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            38
			if(!((XMPNode)((Iterator) (xmpnode)).next()).hasChildren())
	//*   6   14:aload_0         
	//*   7   15:invokeinterface #67  <Method Object Iterator.next()>
	//*   8   20:checkcast       #21  <Class XMPNode>
	//*   9   23:invokevirtual   #78  <Method boolean XMPNode.hasChildren()>
	//*  10   26:ifne            5
				((Iterator) (xmpnode)).remove();
	//   11   29:aload_0         
	//   12   30:invokeinterface #81  <Method void Iterator.remove()>
		} while(true);
	//   13   35:goto            5
	//   14   38:return          
	}

	private static void fixGPSTimeStamp(XMPNode xmpnode)
		throws XMPException
	{
		XMPNode xmpnode2 = XMPNodeUtils.findChildNode(xmpnode, "exif:GPSTimeStamp", false);
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <String "exif:GPSTimeStamp">
	//    2    3:iconst_0        
	//    3    4:invokestatic    #90  <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//    4    7:astore_3        
		if(xmpnode2 != null) goto _L2; else goto _L1
	//    5    8:aload_3         
	//    6    9:ifnonnull       13
_L1:
		XMPDateTime xmpdatetime;
		return;
	//    7   12:return          
	//*   8   13:aload_3         
	//*   9   14:invokevirtual   #25  <Method String XMPNode.getValue()>
	//*  10   17:invokestatic    #96  <Method XMPDateTime XMPUtils.convertToDate(String)>
	//*  11   20:astore          4
_L2:
		if((xmpdatetime = XMPUtils.convertToDate(xmpnode2.getValue())).getYear() != 0 || xmpdatetime.getMonth() != 0 || xmpdatetime.getDay() != 0) goto _L1; else goto _L3
	//   12   22:aload           4
	//   13   24:invokeinterface #101 <Method int XMPDateTime.getYear()>
	//   14   29:ifne            12
	//   15   32:aload           4
	//   16   34:invokeinterface #104 <Method int XMPDateTime.getMonth()>
	//   17   39:ifne            12
	//   18   42:aload           4
	//   19   44:invokeinterface #107 <Method int XMPDateTime.getDay()>
	//   20   49:ifne            12
_L3:
		XMPNode xmpnode1 = XMPNodeUtils.findChildNode(xmpnode, "exif:DateTimeOriginal", false);
	//   21   52:aload_0         
	//   22   53:ldc1            #109 <String "exif:DateTimeOriginal">
	//   23   55:iconst_0        
	//   24   56:invokestatic    #90  <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//   25   59:astore_2        
		Object obj;
		obj = ((Object) (xmpnode1));
	//   26   60:aload_2         
	//   27   61:astore_1        
		if(xmpnode1 != null)
			break MISSING_BLOCK_LABEL_74;
	//   28   62:aload_2         
	//   29   63:ifnonnull       74
		obj = ((Object) (XMPNodeUtils.findChildNode(xmpnode, "exif:DateTimeDigitized", false)));
	//   30   66:aload_0         
	//   31   67:ldc1            #111 <String "exif:DateTimeDigitized">
	//   32   69:iconst_0        
	//   33   70:invokestatic    #90  <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//   34   73:astore_1        
		xmpnode = ((XMPNode) (XMPUtils.convertToDate(((XMPNode) (obj)).getValue())));
	//   35   74:aload_1         
	//   36   75:invokevirtual   #25  <Method String XMPNode.getValue()>
	//   37   78:invokestatic    #96  <Method XMPDateTime XMPUtils.convertToDate(String)>
	//   38   81:astore_0        
		obj = ((Object) (xmpdatetime.getCalendar()));
	//   39   82:aload           4
	//   40   84:invokeinterface #115 <Method Calendar XMPDateTime.getCalendar()>
	//   41   89:astore_1        
		((Calendar) (obj)).set(1, ((XMPDateTime) (xmpnode)).getYear());
	//   42   90:aload_1         
	//   43   91:iconst_1        
	//   44   92:aload_0         
	//   45   93:invokeinterface #101 <Method int XMPDateTime.getYear()>
	//   46   98:invokevirtual   #121 <Method void Calendar.set(int, int)>
		((Calendar) (obj)).set(2, ((XMPDateTime) (xmpnode)).getMonth());
	//   47  101:aload_1         
	//   48  102:iconst_2        
	//   49  103:aload_0         
	//   50  104:invokeinterface #104 <Method int XMPDateTime.getMonth()>
	//   51  109:invokevirtual   #121 <Method void Calendar.set(int, int)>
		((Calendar) (obj)).set(5, ((XMPDateTime) (xmpnode)).getDay());
	//   52  112:aload_1         
	//   53  113:iconst_5        
	//   54  114:aload_0         
	//   55  115:invokeinterface #107 <Method int XMPDateTime.getDay()>
	//   56  120:invokevirtual   #121 <Method void Calendar.set(int, int)>
		xmpnode2.setValue(XMPUtils.convertFromDate(((XMPDateTime) (new XMPDateTimeImpl(((Calendar) (obj)))))));
	//   57  123:aload_3         
	//   58  124:new             #123 <Class XMPDateTimeImpl>
	//   59  127:dup             
	//   60  128:aload_1         
	//   61  129:invokespecial   #126 <Method void XMPDateTimeImpl(Calendar)>
	//   62  132:invokestatic    #130 <Method String XMPUtils.convertFromDate(XMPDateTime)>
	//   63  135:invokevirtual   #134 <Method void XMPNode.setValue(String)>
		return;
	//   64  138:return          
		xmpnode;
	//   65  139:astore_0        
	//   66  140:return          
	}

	private static void initDCArrays()
	{
		dcArrayForms = ((Map) (new HashMap()));
	//    0    0:new             #136 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #137 <Method void HashMap()>
	//    3    7:putstatic       #139 <Field Map dcArrayForms>
		PropertyOptions propertyoptions = new PropertyOptions();
	//    4   10:new             #49  <Class PropertyOptions>
	//    5   13:dup             
	//    6   14:invokespecial   #140 <Method void PropertyOptions()>
	//    7   17:astore_0        
		propertyoptions.setArray(true);
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #144 <Method PropertyOptions PropertyOptions.setArray(boolean)>
	//   11   23:pop             
		dcArrayForms.put("dc:contributor", ((Object) (propertyoptions)));
	//   12   24:getstatic       #139 <Field Map dcArrayForms>
	//   13   27:ldc1            #146 <String "dc:contributor">
	//   14   29:aload_0         
	//   15   30:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   16   35:pop             
		dcArrayForms.put("dc:language", ((Object) (propertyoptions)));
	//   17   36:getstatic       #139 <Field Map dcArrayForms>
	//   18   39:ldc1            #154 <String "dc:language">
	//   19   41:aload_0         
	//   20   42:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   21   47:pop             
		dcArrayForms.put("dc:publisher", ((Object) (propertyoptions)));
	//   22   48:getstatic       #139 <Field Map dcArrayForms>
	//   23   51:ldc1            #156 <String "dc:publisher">
	//   24   53:aload_0         
	//   25   54:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   26   59:pop             
		dcArrayForms.put("dc:relation", ((Object) (propertyoptions)));
	//   27   60:getstatic       #139 <Field Map dcArrayForms>
	//   28   63:ldc1            #158 <String "dc:relation">
	//   29   65:aload_0         
	//   30   66:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   31   71:pop             
		dcArrayForms.put("dc:subject", ((Object) (propertyoptions)));
	//   32   72:getstatic       #139 <Field Map dcArrayForms>
	//   33   75:ldc1            #160 <String "dc:subject">
	//   34   77:aload_0         
	//   35   78:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   36   83:pop             
		dcArrayForms.put("dc:type", ((Object) (propertyoptions)));
	//   37   84:getstatic       #139 <Field Map dcArrayForms>
	//   38   87:ldc1            #162 <String "dc:type">
	//   39   89:aload_0         
	//   40   90:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   41   95:pop             
		propertyoptions = new PropertyOptions();
	//   42   96:new             #49  <Class PropertyOptions>
	//   43   99:dup             
	//   44  100:invokespecial   #140 <Method void PropertyOptions()>
	//   45  103:astore_0        
		propertyoptions.setArray(true);
	//   46  104:aload_0         
	//   47  105:iconst_1        
	//   48  106:invokevirtual   #144 <Method PropertyOptions PropertyOptions.setArray(boolean)>
	//   49  109:pop             
		propertyoptions.setArrayOrdered(true);
	//   50  110:aload_0         
	//   51  111:iconst_1        
	//   52  112:invokevirtual   #165 <Method PropertyOptions PropertyOptions.setArrayOrdered(boolean)>
	//   53  115:pop             
		dcArrayForms.put("dc:creator", ((Object) (propertyoptions)));
	//   54  116:getstatic       #139 <Field Map dcArrayForms>
	//   55  119:ldc1            #167 <String "dc:creator">
	//   56  121:aload_0         
	//   57  122:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   58  127:pop             
		dcArrayForms.put("dc:date", ((Object) (propertyoptions)));
	//   59  128:getstatic       #139 <Field Map dcArrayForms>
	//   60  131:ldc1            #169 <String "dc:date">
	//   61  133:aload_0         
	//   62  134:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   63  139:pop             
		propertyoptions = new PropertyOptions();
	//   64  140:new             #49  <Class PropertyOptions>
	//   65  143:dup             
	//   66  144:invokespecial   #140 <Method void PropertyOptions()>
	//   67  147:astore_0        
		propertyoptions.setArray(true);
	//   68  148:aload_0         
	//   69  149:iconst_1        
	//   70  150:invokevirtual   #144 <Method PropertyOptions PropertyOptions.setArray(boolean)>
	//   71  153:pop             
		propertyoptions.setArrayOrdered(true);
	//   72  154:aload_0         
	//   73  155:iconst_1        
	//   74  156:invokevirtual   #165 <Method PropertyOptions PropertyOptions.setArrayOrdered(boolean)>
	//   75  159:pop             
		propertyoptions.setArrayAlternate(true);
	//   76  160:aload_0         
	//   77  161:iconst_1        
	//   78  162:invokevirtual   #172 <Method PropertyOptions PropertyOptions.setArrayAlternate(boolean)>
	//   79  165:pop             
		propertyoptions.setArrayAltText(true);
	//   80  166:aload_0         
	//   81  167:iconst_1        
	//   82  168:invokevirtual   #175 <Method PropertyOptions PropertyOptions.setArrayAltText(boolean)>
	//   83  171:pop             
		dcArrayForms.put("dc:description", ((Object) (propertyoptions)));
	//   84  172:getstatic       #139 <Field Map dcArrayForms>
	//   85  175:ldc1            #177 <String "dc:description">
	//   86  177:aload_0         
	//   87  178:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   88  183:pop             
		dcArrayForms.put("dc:rights", ((Object) (propertyoptions)));
	//   89  184:getstatic       #139 <Field Map dcArrayForms>
	//   90  187:ldc1            #179 <String "dc:rights">
	//   91  189:aload_0         
	//   92  190:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   93  195:pop             
		dcArrayForms.put("dc:title", ((Object) (propertyoptions)));
	//   94  196:getstatic       #139 <Field Map dcArrayForms>
	//   95  199:ldc1            #181 <String "dc:title">
	//   96  201:aload_0         
	//   97  202:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   98  207:pop             
	//   99  208:return          
	}

	private static void migrateAudioCopyright(XMPMeta xmpmeta, XMPNode xmpnode)
	{
		int i;
		int j;
		String s;
		Object obj;
		try
		{
			obj = ((Object) (XMPNodeUtils.findSchemaNode(((XMPMetaImpl)xmpmeta).getRoot(), "http://purl.org/dc/elements/1.1/", true)));
	//    0    0:aload_0         
	//    1    1:checkcast       #185 <Class XMPMetaImpl>
	//    2    4:invokevirtual   #189 <Method XMPNode XMPMetaImpl.getRoot()>
	//    3    7:ldc1            #191 <String "http://purl.org/dc/elements/1.1/">
	//    4    9:iconst_1        
	//    5   10:invokestatic    #194 <Method XMPNode XMPNodeUtils.findSchemaNode(XMPNode, String, boolean)>
	//    6   13:astore          5
			s = xmpnode.getValue();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #25  <Method String XMPNode.getValue()>
	//    9   19:astore          4
			obj = ((Object) (XMPNodeUtils.findChildNode(((XMPNode) (obj)), "dc:rights", false)));
	//   10   21:aload           5
	//   11   23:ldc1            #179 <String "dc:rights">
	//   12   25:iconst_0        
	//   13   26:invokestatic    #90  <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//   14   29:astore          5
		}
	//*  15   31:aload           5
	//*  16   33:ifnull          44
	//*  17   36:aload           5
	//*  18   38:invokevirtual   #78  <Method boolean XMPNode.hasChildren()>
	//*  19   41:ifne            88
	//*  20   44:aload_0         
	//*  21   45:ldc1            #191 <String "http://purl.org/dc/elements/1.1/">
	//*  22   47:ldc1            #196 <String "rights">
	//*  23   49:ldc1            #198 <String "">
	//*  24   51:ldc1            #200 <String "x-default">
	//*  25   53:new             #202 <Class StringBuilder>
	//*  26   56:dup             
	//*  27   57:invokespecial   #203 <Method void StringBuilder()>
	//*  28   60:ldc1            #205 <String "\n\n">
	//*  29   62:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//*  30   65:aload           4
	//*  31   67:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//*  32   70:invokevirtual   #212 <Method String StringBuilder.toString()>
	//*  33   73:aconst_null     
	//*  34   74:invokeinterface #218 <Method void XMPMeta.setLocalizedText(String, String, String, String, String, PropertyOptions)>
	//*  35   79:aload_1         
	//*  36   80:invokevirtual   #221 <Method XMPNode XMPNode.getParent()>
	//*  37   83:aload_1         
	//*  38   84:invokevirtual   #224 <Method void XMPNode.removeChild(XMPNode)>
	//*  39   87:return          
	//*  40   88:aload           5
	//*  41   90:ldc1            #200 <String "x-default">
	//*  42   92:invokestatic    #228 <Method int XMPNodeUtils.lookupLanguageItem(XMPNode, String)>
	//*  43   95:istore_3        
	//*  44   96:iload_3         
	//*  45   97:istore_2        
	//*  46   98:iload_3         
	//*  47   99:ifge            134
	//*  48  102:aload_0         
	//*  49  103:ldc1            #191 <String "http://purl.org/dc/elements/1.1/">
	//*  50  105:ldc1            #196 <String "rights">
	//*  51  107:ldc1            #198 <String "">
	//*  52  109:ldc1            #200 <String "x-default">
	//*  53  111:aload           5
	//*  54  113:iconst_1        
	//*  55  114:invokevirtual   #232 <Method XMPNode XMPNode.getChild(int)>
	//*  56  117:invokevirtual   #25  <Method String XMPNode.getValue()>
	//*  57  120:aconst_null     
	//*  58  121:invokeinterface #218 <Method void XMPMeta.setLocalizedText(String, String, String, String, String, PropertyOptions)>
	//*  59  126:aload           5
	//*  60  128:ldc1            #200 <String "x-default">
	//*  61  130:invokestatic    #228 <Method int XMPNodeUtils.lookupLanguageItem(XMPNode, String)>
	//*  62  133:istore_2        
	//*  63  134:aload           5
	//*  64  136:iload_2         
	//*  65  137:invokevirtual   #232 <Method XMPNode XMPNode.getChild(int)>
	//*  66  140:astore_0        
	//*  67  141:aload_0         
	//*  68  142:invokevirtual   #25  <Method String XMPNode.getValue()>
	//*  69  145:astore          5
	//*  70  147:aload           5
	//*  71  149:ldc1            #205 <String "\n\n">
	//*  72  151:invokevirtual   #236 <Method int String.indexOf(String)>
	//*  73  154:istore_2        
	//*  74  155:iload_2         
	//*  75  156:ifge            201
	//*  76  159:aload           4
	//*  77  161:aload           5
	//*  78  163:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  79  166:ifne            79
	//*  80  169:aload_0         
	//*  81  170:new             #202 <Class StringBuilder>
	//*  82  173:dup             
	//*  83  174:invokespecial   #203 <Method void StringBuilder()>
	//*  84  177:aload           5
	//*  85  179:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//*  86  182:ldc1            #205 <String "\n\n">
	//*  87  184:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//*  88  187:aload           4
	//*  89  189:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//*  90  192:invokevirtual   #212 <Method String StringBuilder.toString()>
	//*  91  195:invokevirtual   #134 <Method void XMPNode.setValue(String)>
	//*  92  198:goto            79
	//*  93  201:aload           5
	//*  94  203:iload_2         
	//*  95  204:iconst_2        
	//*  96  205:iadd            
	//*  97  206:invokevirtual   #240 <Method String String.substring(int)>
	//*  98  209:aload           4
	//*  99  211:invokevirtual   #31  <Method boolean String.equals(Object)>
	//* 100  214:ifne            79
	//* 101  217:aload_0         
	//* 102  218:new             #202 <Class StringBuilder>
	//* 103  221:dup             
	//* 104  222:invokespecial   #203 <Method void StringBuilder()>
	//* 105  225:aload           5
	//* 106  227:iconst_0        
	//* 107  228:iload_2         
	//* 108  229:iconst_2        
	//* 109  230:iadd            
	//* 110  231:invokevirtual   #243 <Method String String.substring(int, int)>
	//* 111  234:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//* 112  237:aload           4
	//* 113  239:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//* 114  242:invokevirtual   #212 <Method String StringBuilder.toString()>
	//* 115  245:invokevirtual   #134 <Method void XMPNode.setValue(String)>
	//* 116  248:goto            79
		// Misplaced declaration of an exception variable
		catch(XMPMeta xmpmeta)
	//* 117  251:astore_0        
		{
			return;
	//  118  252:return          
		}
		if(obj == null) goto _L2; else goto _L1
_L1:
		if(((XMPNode) (obj)).hasChildren()) goto _L3; else goto _L2
_L2:
		xmpmeta.setLocalizedText("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", (new StringBuilder()).append("\n\n").append(s).toString(), ((PropertyOptions) (null)));
_L7:
		xmpnode.getParent().removeChild(xmpnode);
		return;
_L3:
		j = XMPNodeUtils.lookupLanguageItem(((XMPNode) (obj)), "x-default");
		i = j;
		if(j >= 0)
			break MISSING_BLOCK_LABEL_134;
		xmpmeta.setLocalizedText("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", ((XMPNode) (obj)).getChild(1).getValue(), ((PropertyOptions) (null)));
		i = XMPNodeUtils.lookupLanguageItem(((XMPNode) (obj)), "x-default");
		xmpmeta = ((XMPMeta) (((XMPNode) (obj)).getChild(i)));
		obj = ((Object) (((XMPNode) (xmpmeta)).getValue()));
		i = ((String) (obj)).indexOf("\n\n");
		if(i >= 0) goto _L5; else goto _L4
_L4:
		if(s.equals(obj)) goto _L7; else goto _L6
_L6:
		((XMPNode) (xmpmeta)).setValue((new StringBuilder()).append(((String) (obj))).append("\n\n").append(s).toString());
		  goto _L7
_L5:
		if(((String) (obj)).substring(i + 2).equals(((Object) (s)))) goto _L7; else goto _L8
_L8:
		((XMPNode) (xmpmeta)).setValue((new StringBuilder()).append(((String) (obj)).substring(0, i + 2)).append(s).toString());
		  goto _L7
	}

	private static void moveExplicitAliases(XMPNode xmpnode, ParseOptions parseoptions)
		throws XMPException
	{
		if(xmpnode.getHasAliases())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #248 <Method boolean XMPNode.getHasAliases()>
	//*   2    4:ifne            8
	//*   3    7:return          
		{
			xmpnode.setHasAliases(false);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #252 <Method void XMPNode.setHasAliases(boolean)>
			boolean flag = parseoptions.getStrictAliasing();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #257 <Method boolean ParseOptions.getStrictAliasing()>
	//    9   17:istore_3        
			Iterator iterator = xmpnode.getUnmodifiableChildren().iterator();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #261 <Method List XMPNode.getUnmodifiableChildren()>
	//   12   22:invokeinterface #266 <Method Iterator List.iterator()>
	//   13   27:astore          4
			while(iterator.hasNext()) 
	//*  14   29:aload           4
	//*  15   31:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*  16   36:ifeq            7
			{
				XMPNode xmpnode1 = (XMPNode)iterator.next();
	//   17   39:aload           4
	//   18   41:invokeinterface #67  <Method Object Iterator.next()>
	//   19   46:checkcast       #21  <Class XMPNode>
	//   20   49:astore          5
				if(xmpnode1.getHasAliases())
	//*  21   51:aload           5
	//*  22   53:invokevirtual   #248 <Method boolean XMPNode.getHasAliases()>
	//*  23   56:ifeq            29
				{
					for(Iterator iterator1 = xmpnode1.iterateChildren(); iterator1.hasNext();)
	//*  24   59:aload           5
	//*  25   61:invokevirtual   #57  <Method Iterator XMPNode.iterateChildren()>
	//*  26   64:astore          6
	//*  27   66:aload           6
	//*  28   68:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*  29   73:ifeq            439
					{
						XMPNode xmpnode2 = (XMPNode)iterator1.next();
	//   30   76:aload           6
	//   31   78:invokeinterface #67  <Method Object Iterator.next()>
	//   32   83:checkcast       #21  <Class XMPNode>
	//   33   86:astore          7
						if(xmpnode2.isAlias())
	//*  34   88:aload           7
	//*  35   90:invokevirtual   #269 <Method boolean XMPNode.isAlias()>
	//*  36   93:ifeq            66
						{
							xmpnode2.setAlias(false);
	//   37   96:aload           7
	//   38   98:iconst_0        
	//   39   99:invokevirtual   #272 <Method void XMPNode.setAlias(boolean)>
							XMPAliasInfo xmpaliasinfo = XMPMetaFactory.getSchemaRegistry().findAlias(xmpnode2.getName());
	//   40  102:invokestatic    #278 <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//   41  105:aload           7
	//   42  107:invokevirtual   #43  <Method String XMPNode.getName()>
	//   43  110:invokeinterface #284 <Method XMPAliasInfo XMPSchemaRegistry.findAlias(String)>
	//   44  115:astore          9
							if(xmpaliasinfo != null)
	//*  45  117:aload           9
	//*  46  119:ifnull          66
							{
								parseoptions = ((ParseOptions) (XMPNodeUtils.findSchemaNode(xmpnode, xmpaliasinfo.getNamespace(), ((String) (null)), true)));
	//   47  122:aload_0         
	//   48  123:aload           9
	//   49  125:invokeinterface #289 <Method String XMPAliasInfo.getNamespace()>
	//   50  130:aconst_null     
	//   51  131:iconst_1        
	//   52  132:invokestatic    #292 <Method XMPNode XMPNodeUtils.findSchemaNode(XMPNode, String, String, boolean)>
	//   53  135:astore_1        
								((XMPNode) (parseoptions)).setImplicit(false);
	//   54  136:aload_1         
	//   55  137:iconst_0        
	//   56  138:invokevirtual   #295 <Method void XMPNode.setImplicit(boolean)>
								XMPNode xmpnode3 = XMPNodeUtils.findChildNode(((XMPNode) (parseoptions)), (new StringBuilder()).append(xmpaliasinfo.getPrefix()).append(xmpaliasinfo.getPropName()).toString(), false);
	//   57  141:aload_1         
	//   58  142:new             #202 <Class StringBuilder>
	//   59  145:dup             
	//   60  146:invokespecial   #203 <Method void StringBuilder()>
	//   61  149:aload           9
	//   62  151:invokeinterface #298 <Method String XMPAliasInfo.getPrefix()>
	//   63  156:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   64  159:aload           9
	//   65  161:invokeinterface #301 <Method String XMPAliasInfo.getPropName()>
	//   66  166:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   67  169:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   68  172:iconst_0        
	//   69  173:invokestatic    #90  <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//   70  176:astore          8
								if(xmpnode3 == null)
	//*  71  178:aload           8
	//*  72  180:ifnonnull       314
								{
									if(xmpaliasinfo.getAliasForm().isSimple())
	//*  73  183:aload           9
	//*  74  185:invokeinterface #305 <Method AliasOptions XMPAliasInfo.getAliasForm()>
	//*  75  190:invokevirtual   #310 <Method boolean AliasOptions.isSimple()>
	//*  76  193:ifeq            247
									{
										xmpnode2.setName((new StringBuilder()).append(xmpaliasinfo.getPrefix()).append(xmpaliasinfo.getPropName()).toString());
	//   77  196:aload           7
	//   78  198:new             #202 <Class StringBuilder>
	//   79  201:dup             
	//   80  202:invokespecial   #203 <Method void StringBuilder()>
	//   81  205:aload           9
	//   82  207:invokeinterface #298 <Method String XMPAliasInfo.getPrefix()>
	//   83  212:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   84  215:aload           9
	//   85  217:invokeinterface #301 <Method String XMPAliasInfo.getPropName()>
	//   86  222:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   87  225:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   88  228:invokevirtual   #313 <Method void XMPNode.setName(String)>
										((XMPNode) (parseoptions)).addChild(xmpnode2);
	//   89  231:aload_1         
	//   90  232:aload           7
	//   91  234:invokevirtual   #316 <Method void XMPNode.addChild(XMPNode)>
										iterator1.remove();
	//   92  237:aload           6
	//   93  239:invokeinterface #81  <Method void Iterator.remove()>
									} else
	//*  94  244:goto            66
									{
										xmpnode3 = new XMPNode((new StringBuilder()).append(xmpaliasinfo.getPrefix()).append(xmpaliasinfo.getPropName()).toString(), xmpaliasinfo.getAliasForm().toPropertyOptions());
	//   95  247:new             #21  <Class XMPNode>
	//   96  250:dup             
	//   97  251:new             #202 <Class StringBuilder>
	//   98  254:dup             
	//   99  255:invokespecial   #203 <Method void StringBuilder()>
	//  100  258:aload           9
	//  101  260:invokeinterface #298 <Method String XMPAliasInfo.getPrefix()>
	//  102  265:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//  103  268:aload           9
	//  104  270:invokeinterface #301 <Method String XMPAliasInfo.getPropName()>
	//  105  275:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//  106  278:invokevirtual   #212 <Method String StringBuilder.toString()>
	//  107  281:aload           9
	//  108  283:invokeinterface #305 <Method AliasOptions XMPAliasInfo.getAliasForm()>
	//  109  288:invokevirtual   #319 <Method PropertyOptions AliasOptions.toPropertyOptions()>
	//  110  291:invokespecial   #322 <Method void XMPNode(String, PropertyOptions)>
	//  111  294:astore          8
										((XMPNode) (parseoptions)).addChild(xmpnode3);
	//  112  296:aload_1         
	//  113  297:aload           8
	//  114  299:invokevirtual   #316 <Method void XMPNode.addChild(XMPNode)>
										transplantArrayItemAlias(iterator1, xmpnode2, xmpnode3);
	//  115  302:aload           6
	//  116  304:aload           7
	//  117  306:aload           8
	//  118  308:invokestatic    #326 <Method void transplantArrayItemAlias(Iterator, XMPNode, XMPNode)>
									}
								} else
	//* 119  311:goto            66
								if(xmpaliasinfo.getAliasForm().isSimple())
	//* 120  314:aload           9
	//* 121  316:invokeinterface #305 <Method AliasOptions XMPAliasInfo.getAliasForm()>
	//* 122  321:invokevirtual   #310 <Method boolean AliasOptions.isSimple()>
	//* 123  324:ifeq            349
								{
									if(flag)
	//* 124  327:iload_3         
	//* 125  328:ifeq            339
										compareAliasedSubtrees(xmpnode2, xmpnode3, true);
	//  126  331:aload           7
	//  127  333:aload           8
	//  128  335:iconst_1        
	//  129  336:invokestatic    #69  <Method void compareAliasedSubtrees(XMPNode, XMPNode, boolean)>
									iterator1.remove();
	//  130  339:aload           6
	//  131  341:invokeinterface #81  <Method void Iterator.remove()>
								} else
	//* 132  346:goto            66
								{
									parseoptions = null;
	//  133  349:aconst_null     
	//  134  350:astore_1        
									if(xmpaliasinfo.getAliasForm().isArrayAltText())
	//* 135  351:aload           9
	//* 136  353:invokeinterface #305 <Method AliasOptions XMPAliasInfo.getAliasForm()>
	//* 137  358:invokevirtual   #329 <Method boolean AliasOptions.isArrayAltText()>
	//* 138  361:ifeq            400
									{
										int i = XMPNodeUtils.lookupLanguageItem(xmpnode3, "x-default");
	//  139  364:aload           8
	//  140  366:ldc1            #200 <String "x-default">
	//  141  368:invokestatic    #228 <Method int XMPNodeUtils.lookupLanguageItem(XMPNode, String)>
	//  142  371:istore_2        
										if(i != -1)
	//* 143  372:iload_2         
	//* 144  373:iconst_m1       
	//* 145  374:icmpeq          384
											parseoptions = ((ParseOptions) (xmpnode3.getChild(i)));
	//  146  377:aload           8
	//  147  379:iload_2         
	//  148  380:invokevirtual   #232 <Method XMPNode XMPNode.getChild(int)>
	//  149  383:astore_1        
									} else
	//* 150  384:aload_1         
	//* 151  385:ifnonnull       418
	//* 152  388:aload           6
	//* 153  390:aload           7
	//* 154  392:aload           8
	//* 155  394:invokestatic    #326 <Method void transplantArrayItemAlias(Iterator, XMPNode, XMPNode)>
	//* 156  397:goto            66
									if(xmpnode3.hasChildren())
	//* 157  400:aload           8
	//* 158  402:invokevirtual   #78  <Method boolean XMPNode.hasChildren()>
	//* 159  405:ifeq            384
										parseoptions = ((ParseOptions) (xmpnode3.getChild(1)));
	//  160  408:aload           8
	//  161  410:iconst_1        
	//  162  411:invokevirtual   #232 <Method XMPNode XMPNode.getChild(int)>
	//  163  414:astore_1        
									if(parseoptions == null)
									{
										transplantArrayItemAlias(iterator1, xmpnode2, xmpnode3);
									} else
	//* 164  415:goto            384
									{
										if(flag)
	//* 165  418:iload_3         
	//* 166  419:ifeq            429
											compareAliasedSubtrees(xmpnode2, ((XMPNode) (parseoptions)), true);
	//  167  422:aload           7
	//  168  424:aload_1         
	//  169  425:iconst_1        
	//  170  426:invokestatic    #69  <Method void compareAliasedSubtrees(XMPNode, XMPNode, boolean)>
										iterator1.remove();
	//  171  429:aload           6
	//  172  431:invokeinterface #81  <Method void Iterator.remove()>
									}
								}
							}
						}
					}

	//* 173  436:goto            66
					xmpnode1.setHasAliases(false);
	//  174  439:aload           5
	//  175  441:iconst_0        
	//  176  442:invokevirtual   #252 <Method void XMPNode.setHasAliases(boolean)>
				}
			}
		}
	//* 177  445:goto            29
	}

	private static void normalizeDCArrays(XMPNode xmpnode)
		throws XMPException
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		while(i <= xmpnode.getChildrenLength()) 
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #35  <Method int XMPNode.getChildrenLength()>
	//*   5    7:icmpgt          157
		{
			XMPNode xmpnode1 = xmpnode.getChild(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #232 <Method XMPNode XMPNode.getChild(int)>
	//    9   15:astore_2        
			PropertyOptions propertyoptions = (PropertyOptions)dcArrayForms.get(((Object) (xmpnode1.getName())));
	//   10   16:getstatic       #139 <Field Map dcArrayForms>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #43  <Method String XMPNode.getName()>
	//   13   23:invokeinterface #334 <Method Object Map.get(Object)>
	//   14   28:checkcast       #49  <Class PropertyOptions>
	//   15   31:astore_3        
			if(propertyoptions != null)
	//*  16   32:aload_3         
	//*  17   33:ifnonnull       43
	//*  18   36:iload_1         
	//*  19   37:iconst_1        
	//*  20   38:iadd            
	//*  21   39:istore_1        
	//*  22   40:goto            2
				if(xmpnode1.getOptions().isSimple())
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*  25   47:invokevirtual   #335 <Method boolean PropertyOptions.isSimple()>
	//*  26   50:ifeq            124
				{
					XMPNode xmpnode2 = new XMPNode(xmpnode1.getName(), propertyoptions);
	//   27   53:new             #21  <Class XMPNode>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:invokevirtual   #43  <Method String XMPNode.getName()>
	//   31   61:aload_3         
	//   32   62:invokespecial   #322 <Method void XMPNode(String, PropertyOptions)>
	//   33   65:astore          4
					xmpnode1.setName("[]");
	//   34   67:aload_2         
	//   35   68:ldc2            #337 <String "[]">
	//   36   71:invokevirtual   #313 <Method void XMPNode.setName(String)>
					xmpnode2.addChild(xmpnode1);
	//   37   74:aload           4
	//   38   76:aload_2         
	//   39   77:invokevirtual   #316 <Method void XMPNode.addChild(XMPNode)>
					xmpnode.replaceChild(i, xmpnode2);
	//   40   80:aload_0         
	//   41   81:iload_1         
	//   42   82:aload           4
	//   43   84:invokevirtual   #341 <Method void XMPNode.replaceChild(int, XMPNode)>
					if(propertyoptions.isArrayAltText() && !xmpnode1.getOptions().getHasLanguage())
	//*  44   87:aload_3         
	//*  45   88:invokevirtual   #342 <Method boolean PropertyOptions.isArrayAltText()>
	//*  46   91:ifeq            36
	//*  47   94:aload_2         
	//*  48   95:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*  49   98:invokevirtual   #345 <Method boolean PropertyOptions.getHasLanguage()>
	//*  50  101:ifne            36
						xmpnode1.addQualifier(new XMPNode("xml:lang", "x-default", ((PropertyOptions) (null))));
	//   51  104:aload_2         
	//   52  105:new             #21  <Class XMPNode>
	//   53  108:dup             
	//   54  109:ldc2            #347 <String "xml:lang">
	//   55  112:ldc1            #200 <String "x-default">
	//   56  114:aconst_null     
	//   57  115:invokespecial   #350 <Method void XMPNode(String, String, PropertyOptions)>
	//   58  118:invokevirtual   #353 <Method void XMPNode.addQualifier(XMPNode)>
				} else
	//*  59  121:goto            36
				{
					xmpnode1.getOptions().setOption(7680, false);
	//   60  124:aload_2         
	//   61  125:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//   62  128:sipush          7680
	//   63  131:iconst_0        
	//   64  132:invokevirtual   #357 <Method void PropertyOptions.setOption(int, boolean)>
					xmpnode1.getOptions().mergeWith(propertyoptions);
	//   65  135:aload_2         
	//   66  136:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//   67  139:aload_3         
	//   68  140:invokevirtual   #361 <Method void PropertyOptions.mergeWith(PropertyOptions)>
					if(propertyoptions.isArrayAltText())
	//*  69  143:aload_3         
	//*  70  144:invokevirtual   #342 <Method boolean PropertyOptions.isArrayAltText()>
	//*  71  147:ifeq            36
						repairAltText(xmpnode1);
	//   72  150:aload_2         
	//   73  151:invokestatic    #364 <Method void repairAltText(XMPNode)>
				}
			i++;
		}
	//*  74  154:goto            36
	//   75  157:return          
	}

	static XMPMeta process(XMPMetaImpl xmpmetaimpl, ParseOptions parseoptions)
		throws XMPException
	{
		XMPNode xmpnode = xmpmetaimpl.getRoot();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #189 <Method XMPNode XMPMetaImpl.getRoot()>
	//    2    4:astore_2        
		touchUpDataModel(xmpmetaimpl);
	//    3    5:aload_0         
	//    4    6:invokestatic    #370 <Method void touchUpDataModel(XMPMetaImpl)>
		moveExplicitAliases(xmpnode, parseoptions);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #372 <Method void moveExplicitAliases(XMPNode, ParseOptions)>
		tweakOldXMP(xmpnode);
	//    8   14:aload_2         
	//    9   15:invokestatic    #375 <Method void tweakOldXMP(XMPNode)>
		deleteEmptySchemas(xmpnode);
	//   10   18:aload_2         
	//   11   19:invokestatic    #377 <Method void deleteEmptySchemas(XMPNode)>
		return ((XMPMeta) (xmpmetaimpl));
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	private static void repairAltText(XMPNode xmpnode)
		throws XMPException
	{
		if(xmpnode != null && xmpnode.getOptions().isArray())
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*   4    8:invokevirtual   #380 <Method boolean PropertyOptions.isArray()>
	//*   5   11:ifne            15
	//*   6   14:return          
		{
			xmpnode.getOptions().setArrayOrdered(true).setArrayAlternate(true).setArrayAltText(true);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #165 <Method PropertyOptions PropertyOptions.setArrayOrdered(boolean)>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #172 <Method PropertyOptions PropertyOptions.setArrayAlternate(boolean)>
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #175 <Method PropertyOptions PropertyOptions.setArrayAltText(boolean)>
	//   15   31:pop             
			xmpnode = ((XMPNode) (xmpnode.iterateChildren()));
	//   16   32:aload_0         
	//   17   33:invokevirtual   #57  <Method Iterator XMPNode.iterateChildren()>
	//   18   36:astore_0        
			while(((Iterator) (xmpnode)).hasNext()) 
	//*  19   37:aload_0         
	//*  20   38:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*  21   43:ifeq            14
			{
				XMPNode xmpnode1 = (XMPNode)((Iterator) (xmpnode)).next();
	//   22   46:aload_0         
	//   23   47:invokeinterface #67  <Method Object Iterator.next()>
	//   24   52:checkcast       #21  <Class XMPNode>
	//   25   55:astore_1        
				if(xmpnode1.getOptions().isCompositeProperty())
	//*  26   56:aload_1         
	//*  27   57:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*  28   60:invokevirtual   #383 <Method boolean PropertyOptions.isCompositeProperty()>
	//*  29   63:ifeq            75
					((Iterator) (xmpnode)).remove();
	//   30   66:aload_0         
	//   31   67:invokeinterface #81  <Method void Iterator.remove()>
				else
	//*  32   72:goto            37
				if(!xmpnode1.getOptions().getHasLanguage())
	//*  33   75:aload_1         
	//*  34   76:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*  35   79:invokevirtual   #345 <Method boolean PropertyOptions.getHasLanguage()>
	//*  36   82:ifne            37
				{
					String s = xmpnode1.getValue();
	//   37   85:aload_1         
	//   38   86:invokevirtual   #25  <Method String XMPNode.getValue()>
	//   39   89:astore_2        
					if(s == null || s.length() == 0)
	//*  40   90:aload_2         
	//*  41   91:ifnull          101
	//*  42   94:aload_2         
	//*  43   95:invokevirtual   #386 <Method int String.length()>
	//*  44   98:ifne            110
						((Iterator) (xmpnode)).remove();
	//   45  101:aload_0         
	//   46  102:invokeinterface #81  <Method void Iterator.remove()>
					else
	//*  47  107:goto            37
						xmpnode1.addQualifier(new XMPNode("xml:lang", "x-repair", ((PropertyOptions) (null))));
	//   48  110:aload_1         
	//   49  111:new             #21  <Class XMPNode>
	//   50  114:dup             
	//   51  115:ldc2            #347 <String "xml:lang">
	//   52  118:ldc2            #388 <String "x-repair">
	//   53  121:aconst_null     
	//   54  122:invokespecial   #350 <Method void XMPNode(String, String, PropertyOptions)>
	//   55  125:invokevirtual   #353 <Method void XMPNode.addQualifier(XMPNode)>
				}
			}
		}
	//*  56  128:goto            37
	}

	private static void touchUpDataModel(XMPMetaImpl xmpmetaimpl)
		throws XMPException
	{
		XMPNodeUtils.findSchemaNode(xmpmetaimpl.getRoot(), "http://purl.org/dc/elements/1.1/", true);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #189 <Method XMPNode XMPMetaImpl.getRoot()>
	//    2    4:ldc1            #191 <String "http://purl.org/dc/elements/1.1/">
	//    3    6:iconst_1        
	//    4    7:invokestatic    #194 <Method XMPNode XMPNodeUtils.findSchemaNode(XMPNode, String, boolean)>
	//    5   10:pop             
		Iterator iterator = xmpmetaimpl.getRoot().iterateChildren();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #189 <Method XMPNode XMPMetaImpl.getRoot()>
	//    8   15:invokevirtual   #57  <Method Iterator XMPNode.iterateChildren()>
	//    9   18:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   19:aload_1         
	//   11   20:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   12   25:ifeq            161
			XMPNode xmpnode = (XMPNode)iterator.next();
	//   13   28:aload_1         
	//   14   29:invokeinterface #67  <Method Object Iterator.next()>
	//   15   34:checkcast       #21  <Class XMPNode>
	//   16   37:astore_2        
			if("http://purl.org/dc/elements/1.1/".equals(((Object) (xmpnode.getName()))))
	//*  17   38:ldc1            #191 <String "http://purl.org/dc/elements/1.1/">
	//*  18   40:aload_2         
	//*  19   41:invokevirtual   #43  <Method String XMPNode.getName()>
	//*  20   44:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  21   47:ifeq            57
				normalizeDCArrays(xmpnode);
	//   22   50:aload_2         
	//   23   51:invokestatic    #390 <Method void normalizeDCArrays(XMPNode)>
			else
	//*  24   54:goto            19
			if("http://ns.adobe.com/exif/1.0/".equals(((Object) (xmpnode.getName()))))
	//*  25   57:ldc2            #392 <String "http://ns.adobe.com/exif/1.0/">
	//*  26   60:aload_2         
	//*  27   61:invokevirtual   #43  <Method String XMPNode.getName()>
	//*  28   64:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  29   67:ifeq            94
			{
				fixGPSTimeStamp(xmpnode);
	//   30   70:aload_2         
	//   31   71:invokestatic    #394 <Method void fixGPSTimeStamp(XMPNode)>
				xmpnode = XMPNodeUtils.findChildNode(xmpnode, "exif:UserComment", false);
	//   32   74:aload_2         
	//   33   75:ldc2            #396 <String "exif:UserComment">
	//   34   78:iconst_0        
	//   35   79:invokestatic    #90  <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//   36   82:astore_2        
				if(xmpnode != null)
	//*  37   83:aload_2         
	//*  38   84:ifnull          19
					repairAltText(xmpnode);
	//   39   87:aload_2         
	//   40   88:invokestatic    #364 <Method void repairAltText(XMPNode)>
			} else
	//*  41   91:goto            19
			if("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(((Object) (xmpnode.getName()))))
	//*  42   94:ldc2            #398 <String "http://ns.adobe.com/xmp/1.0/DynamicMedia/">
	//*  43   97:aload_2         
	//*  44   98:invokevirtual   #43  <Method String XMPNode.getName()>
	//*  45  101:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  46  104:ifeq            128
			{
				xmpnode = XMPNodeUtils.findChildNode(xmpnode, "xmpDM:copyright", false);
	//   47  107:aload_2         
	//   48  108:ldc2            #400 <String "xmpDM:copyright">
	//   49  111:iconst_0        
	//   50  112:invokestatic    #90  <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//   51  115:astore_2        
				if(xmpnode != null)
	//*  52  116:aload_2         
	//*  53  117:ifnull          19
					migrateAudioCopyright(((XMPMeta) (xmpmetaimpl)), xmpnode);
	//   54  120:aload_0         
	//   55  121:aload_2         
	//   56  122:invokestatic    #402 <Method void migrateAudioCopyright(XMPMeta, XMPNode)>
			} else
	//*  57  125:goto            19
			if("http://ns.adobe.com/xap/1.0/rights/".equals(((Object) (xmpnode.getName()))))
	//*  58  128:ldc2            #404 <String "http://ns.adobe.com/xap/1.0/rights/">
	//*  59  131:aload_2         
	//*  60  132:invokevirtual   #43  <Method String XMPNode.getName()>
	//*  61  135:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  62  138:ifeq            19
			{
				xmpnode = XMPNodeUtils.findChildNode(xmpnode, "xmpRights:UsageTerms", false);
	//   63  141:aload_2         
	//   64  142:ldc2            #406 <String "xmpRights:UsageTerms">
	//   65  145:iconst_0        
	//   66  146:invokestatic    #90  <Method XMPNode XMPNodeUtils.findChildNode(XMPNode, String, boolean)>
	//   67  149:astore_2        
				if(xmpnode != null)
	//*  68  150:aload_2         
	//*  69  151:ifnull          19
					repairAltText(xmpnode);
	//   70  154:aload_2         
	//   71  155:invokestatic    #364 <Method void repairAltText(XMPNode)>
			}
		} while(true);
	//   72  158:goto            19
	//   73  161:return          
	}

	private static void transplantArrayItemAlias(Iterator iterator, XMPNode xmpnode, XMPNode xmpnode1)
		throws XMPException
	{
		if(xmpnode1.getOptions().isArrayAltText())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*   2    4:invokevirtual   #342 <Method boolean PropertyOptions.isArrayAltText()>
	//*   3    7:ifeq            51
		{
			if(xmpnode.getOptions().getHasLanguage())
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*   6   14:invokevirtual   #345 <Method boolean PropertyOptions.getHasLanguage()>
	//*   7   17:ifeq            34
				throw new XMPException("Alias to x-default already has a language qualifier", 203);
	//    8   20:new             #19  <Class XMPException>
	//    9   23:dup             
	//   10   24:ldc2            #408 <String "Alias to x-default already has a language qualifier">
	//   11   27:sipush          203
	//   12   30:invokespecial   #40  <Method void XMPException(String, int)>
	//   13   33:athrow          
			xmpnode.addQualifier(new XMPNode("xml:lang", "x-default", ((PropertyOptions) (null))));
	//   14   34:aload_1         
	//   15   35:new             #21  <Class XMPNode>
	//   16   38:dup             
	//   17   39:ldc2            #347 <String "xml:lang">
	//   18   42:ldc1            #200 <String "x-default">
	//   19   44:aconst_null     
	//   20   45:invokespecial   #350 <Method void XMPNode(String, String, PropertyOptions)>
	//   21   48:invokevirtual   #353 <Method void XMPNode.addQualifier(XMPNode)>
		}
		iterator.remove();
	//   22   51:aload_0         
	//   23   52:invokeinterface #81  <Method void Iterator.remove()>
		xmpnode.setName("[]");
	//   24   57:aload_1         
	//   25   58:ldc2            #337 <String "[]">
	//   26   61:invokevirtual   #313 <Method void XMPNode.setName(String)>
		xmpnode1.addChild(xmpnode);
	//   27   64:aload_2         
	//   28   65:aload_1         
	//   29   66:invokevirtual   #316 <Method void XMPNode.addChild(XMPNode)>
	//   30   69:return          
	}

	private static void tweakOldXMP(XMPNode xmpnode)
		throws XMPException
	{
label0:
		{
			if(xmpnode.getName() != null && xmpnode.getName().length() >= 36)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method String XMPNode.getName()>
	//*   2    4:ifnull          114
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #43  <Method String XMPNode.getName()>
	//*   5   11:invokevirtual   #386 <Method int String.length()>
	//*   6   14:bipush          36
	//*   7   16:icmplt          114
			{
				String s1 = xmpnode.getName().toLowerCase();
	//    8   19:aload_0         
	//    9   20:invokevirtual   #43  <Method String XMPNode.getName()>
	//   10   23:invokevirtual   #411 <Method String String.toLowerCase()>
	//   11   26:astore_2        
				String s = s1;
	//   12   27:aload_2         
	//   13   28:astore_1        
				if(s1.startsWith("uuid:"))
	//*  14   29:aload_2         
	//*  15   30:ldc2            #413 <String "uuid:">
	//*  16   33:invokevirtual   #417 <Method boolean String.startsWith(String)>
	//*  17   36:ifeq            45
					s = s1.substring(5);
	//   18   39:aload_2         
	//   19   40:iconst_5        
	//   20   41:invokevirtual   #240 <Method String String.substring(int)>
	//   21   44:astore_1        
				if(Utils.checkUUIDFormat(s))
	//*  22   45:aload_1         
	//*  23   46:invokestatic    #422 <Method boolean Utils.checkUUIDFormat(String)>
	//*  24   49:ifeq            114
				{
					XMPNode xmpnode1 = XMPNodeUtils.findNode(xmpnode, XMPPathParser.expandXPath("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, ((PropertyOptions) (null)));
	//   25   52:aload_0         
	//   26   53:ldc2            #424 <String "http://ns.adobe.com/xap/1.0/mm/">
	//   27   56:ldc2            #426 <String "InstanceID">
	//   28   59:invokestatic    #432 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//   29   62:iconst_1        
	//   30   63:aconst_null     
	//   31   64:invokestatic    #436 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   32   67:astore_2        
					if(xmpnode1 == null)
						break label0;
	//   33   68:aload_2         
	//   34   69:ifnull          115
					xmpnode1.setOptions(((PropertyOptions) (null)));
	//   35   72:aload_2         
	//   36   73:aconst_null     
	//   37   74:invokevirtual   #439 <Method void XMPNode.setOptions(PropertyOptions)>
					xmpnode1.setValue((new StringBuilder()).append("uuid:").append(s).toString());
	//   38   77:aload_2         
	//   39   78:new             #202 <Class StringBuilder>
	//   40   81:dup             
	//   41   82:invokespecial   #203 <Method void StringBuilder()>
	//   42   85:ldc2            #413 <String "uuid:">
	//   43   88:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   44   91:aload_1         
	//   45   92:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   46   95:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   47   98:invokevirtual   #134 <Method void XMPNode.setValue(String)>
					xmpnode1.removeChildren();
	//   48  101:aload_2         
	//   49  102:invokevirtual   #442 <Method void XMPNode.removeChildren()>
					xmpnode1.removeQualifiers();
	//   50  105:aload_2         
	//   51  106:invokevirtual   #445 <Method void XMPNode.removeQualifiers()>
					xmpnode.setName(((String) (null)));
	//   52  109:aload_0         
	//   53  110:aconst_null     
	//   54  111:invokevirtual   #313 <Method void XMPNode.setName(String)>
				}
			}
			return;
	//   55  114:return          
		}
		throw new XMPException("Failure creating xmpMM:InstanceID", 9);
	//   56  115:new             #19  <Class XMPException>
	//   57  118:dup             
	//   58  119:ldc2            #447 <String "Failure creating xmpMM:InstanceID">
	//   59  122:bipush          9
	//   60  124:invokespecial   #40  <Method void XMPException(String, int)>
	//   61  127:athrow          
	}

	private static Map dcArrayForms;

	static 
	{
		initDCArrays();
	//    0    0:invokestatic    #11  <Method void initDCArrays()>
	//*   1    3:return          
	}
}
