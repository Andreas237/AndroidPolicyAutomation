// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.StreamUtil;
import com.itextpdf.text.pdf.fonts.cmaps.CMapCache;
import com.itextpdf.text.pdf.fonts.cmaps.CMapCidByte;
import com.itextpdf.text.pdf.fonts.cmaps.CMapCidUni;
import com.itextpdf.text.pdf.fonts.cmaps.CMapUniCid;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseFont, IntHashtable, PdfDictionary, PdfName, 
//			PdfLiteral, PdfString, PdfNumber, PdfArray, 
//			PdfWriter, PdfIndirectObject, PdfIndirectReference, PdfStream

class CJKFont extends BaseFont
{

	CJKFont(String s, String s1, boolean flag)
		throws DocumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void BaseFont()>
		style = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #73  <String "">
	//    4    7:putfield        #75  <Field String style>
		cidDirect = false;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #77  <Field boolean cidDirect>
		loadProperties();
	//    8   15:invokestatic    #80  <Method void loadProperties()>
		fontType = 2;
	//    9   18:aload_0         
	//   10   19:iconst_2        
	//   11   20:putfield        #83  <Field int fontType>
		String s3 = getBaseName(s);
	//   12   23:aload_1         
	//   13   24:invokestatic    #87  <Method String getBaseName(String)>
	//   14   27:astore          5
		if(!isCJKFont(s3, s1))
	//*  15   29:aload           5
	//*  16   31:aload_2         
	//*  17   32:invokestatic    #91  <Method boolean isCJKFont(String, String)>
	//*  18   35:ifne            63
			throw new DocumentException(MessageLocalization.getComposedMessage("font.1.with.2.encoding.is.not.a.cjk.font", new Object[] {
				s, s1
			}));
	//   19   38:new             #70  <Class DocumentException>
	//   20   41:dup             
	//   21   42:ldc1            #93  <String "font.1.with.2.encoding.is.not.a.cjk.font">
	//   22   44:iconst_2        
	//   23   45:anewarray       Object[]
	//   24   48:dup             
	//   25   49:iconst_0        
	//   26   50:aload_1         
	//   27   51:aastore         
	//   28   52:dup             
	//   29   53:iconst_1        
	//   30   54:aload_2         
	//   31   55:aastore         
	//   32   56:invokestatic    #101 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   33   59:invokespecial   #104 <Method void DocumentException(String)>
	//   34   62:athrow          
		String s2 = s;
	//   35   63:aload_1         
	//   36   64:astore          4
		if(s3.length() < s.length())
	//*  37   66:aload           5
	//*  38   68:invokevirtual   #110 <Method int String.length()>
	//*  39   71:aload_1         
	//*  40   72:invokevirtual   #110 <Method int String.length()>
	//*  41   75:icmpge          95
		{
			style = s.substring(s3.length());
	//   42   78:aload_0         
	//   43   79:aload_1         
	//   44   80:aload           5
	//   45   82:invokevirtual   #110 <Method int String.length()>
	//   46   85:invokevirtual   #114 <Method String String.substring(int)>
	//   47   88:putfield        #75  <Field String style>
			s2 = s3;
	//   48   91:aload           5
	//   49   93:astore          4
		}
		fontName = s2;
	//   50   95:aload_0         
	//   51   96:aload           4
	//   52   98:putfield        #116 <Field String fontName>
		encoding = "UnicodeBigUnmarked";
	//   53  101:aload_0         
	//   54  102:ldc1            #11  <String "UnicodeBigUnmarked">
	//   55  104:putfield        #119 <Field String encoding>
		vertical = s1.endsWith("V");
	//   56  107:aload_0         
	//   57  108:aload_2         
	//   58  109:ldc1            #121 <String "V">
	//   59  111:invokevirtual   #125 <Method boolean String.endsWith(String)>
	//   60  114:putfield        #128 <Field boolean vertical>
		CMap = s1;
	//   61  117:aload_0         
	//   62  118:aload_2         
	//   63  119:putfield        #130 <Field String CMap>
		if(s1.equals("Identity-H") || s1.equals("Identity-V"))
	//*  64  122:aload_2         
	//*  65  123:ldc1            #132 <String "Identity-H">
	//*  66  125:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  67  128:ifne            140
	//*  68  131:aload_2         
	//*  69  132:ldc1            #138 <String "Identity-V">
	//*  70  134:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  71  137:ifeq            145
			cidDirect = true;
	//   72  140:aload_0         
	//   73  141:iconst_1        
	//   74  142:putfield        #77  <Field boolean cidDirect>
		loadCMaps();
	//   75  145:aload_0         
	//   76  146:invokespecial   #141 <Method void loadCMaps()>
	//   77  149:return          
	}

	public static String GetCompatibleFont(String s)
	{
		loadProperties();
	//    0    0:invokestatic    #80  <Method void loadProperties()>
		Iterator iterator = registryNames.entrySet().iterator();
	//    1    3:getstatic       #66  <Field HashMap registryNames>
	//    2    6:invokevirtual   #147 <Method Set HashMap.entrySet()>
	//    3    9:invokeinterface #153 <Method Iterator Set.iterator()>
	//    4   14:astore_1        
		java.util.Map.Entry entry;
label0:
		do
			if(iterator.hasNext())
	//*   5   15:aload_1         
	//*   6   16:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            127
			{
				Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//    8   24:aload_1         
	//    9   25:invokeinterface #163 <Method Object Iterator.next()>
	//   10   30:checkcast       #165 <Class java.util.Map$Entry>
	//   11   33:astore_2        
				if(!((Set)((java.util.Map.Entry) (obj)).getValue()).contains(((Object) (s))))
					continue;
	//   12   34:aload_2         
	//   13   35:invokeinterface #168 <Method Object java.util.Map$Entry.getValue()>
	//   14   40:checkcast       #149 <Class Set>
	//   15   43:aload_0         
	//   16   44:invokeinterface #171 <Method boolean Set.contains(Object)>
	//   17   49:ifeq            15
				obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getKey()));
	//   18   52:aload_2         
	//   19   53:invokeinterface #174 <Method Object java.util.Map$Entry.getKey()>
	//   20   58:checkcast       #106 <Class String>
	//   21   61:astore_2        
				Iterator iterator1 = allFonts.entrySet().iterator();
	//   22   62:getstatic       #62  <Field HashMap allFonts>
	//   23   65:invokevirtual   #147 <Method Set HashMap.entrySet()>
	//   24   68:invokeinterface #153 <Method Iterator Set.iterator()>
	//   25   73:astore_3        
				do
				{
					if(!iterator1.hasNext())
						continue label0;
	//   26   74:aload_3         
	//   27   75:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//   28   80:ifeq            15
					entry = (java.util.Map.Entry)iterator1.next();
	//   29   83:aload_3         
	//   30   84:invokeinterface #163 <Method Object Iterator.next()>
	//   31   89:checkcast       #165 <Class java.util.Map$Entry>
	//   32   92:astore          4
				} while(!((String) (obj)).equals(((HashMap)entry.getValue()).get("Registry")));
	//   33   94:aload_2         
	//   34   95:aload           4
	//   35   97:invokeinterface #168 <Method Object java.util.Map$Entry.getValue()>
	//   36  102:checkcast       #59  <Class HashMap>
	//   37  105:ldc1            #176 <String "Registry">
	//   38  107:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   39  110:invokevirtual   #136 <Method boolean String.equals(Object)>
	//   40  113:ifeq            74
				break;
			} else
	//*  41  116:aload           4
	//*  42  118:invokeinterface #174 <Method Object java.util.Map$Entry.getKey()>
	//*  43  123:checkcast       #106 <Class String>
	//*  44  126:areturn         
			{
				return null;
	//   45  127:aconst_null     
	//   46  128:areturn         
			}
		while(true);
		return (String)entry.getKey();
	}

	static String convertToHCIDMetrics(int ai[], IntHashtable inthashtable)
	{
		if(ai.length != 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:ifne            7
_L1:
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
_L2:
		int i;
		int j;
		int k;
		j = 0;
	//    5    7:iconst_0        
	//    6    8:istore_3        
		k = 0;
	//    7    9:iconst_0        
	//    8   10:istore          4
		i = 0;
	//    9   12:iconst_0        
	//   10   13:istore_2        
_L8:
		int l;
		l = i;
	//   11   14:iload_2         
	//   12   15:istore          5
		if(i >= ai.length)
			continue; /* Loop/switch isn't completed */
	//   13   17:iload_2         
	//   14   18:aload_0         
	//   15   19:arraylength     
	//   16   20:icmpge          44
		j = ai[i];
	//   17   23:aload_0         
	//   18   24:iload_2         
	//   19   25:iaload          
	//   20   26:istore_3        
		k = inthashtable.get(j);
	//   21   27:aload_1         
	//   22   28:iload_3         
	//   23   29:invokevirtual   #187 <Method int IntHashtable.get(int)>
	//   24   32:istore          4
		if(k == 0) goto _L4; else goto _L3
	//   25   34:iload           4
	//   26   36:ifeq            116
_L3:
		l = i + 1;
	//   27   39:iload_2         
	//   28   40:iconst_1        
	//   29   41:iadd            
	//   30   42:istore          5
		if(k == 0) goto _L1; else goto _L5
	//   31   44:iload           4
	//   32   46:ifeq            5
_L5:
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//   33   49:new             #189 <Class StringBuilder>
	//   34   52:dup             
	//   35   53:invokespecial   #190 <Method void StringBuilder()>
	//   36   56:astore          8
		stringbuilder.append('[');
	//   37   58:aload           8
	//   38   60:bipush          91
	//   39   62:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//   40   65:pop             
		stringbuilder.append(j);
	//   41   66:aload           8
	//   42   68:iload_3         
	//   43   69:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//   44   72:pop             
		i = 0;
	//   45   73:iconst_0        
	//   46   74:istore_2        
		int i1 = l;
	//   47   75:iload           5
	//   48   77:istore          6
		l = j;
	//   49   79:iload_3         
	//   50   80:istore          5
		j = i1;
	//   51   82:iload           6
	//   52   84:istore_3        
_L7:
		int j1;
		int k1;
		if(j >= ai.length)
			break MISSING_BLOCK_LABEL_378;
	//   53   85:iload_3         
	//   54   86:aload_0         
	//   55   87:arraylength     
	//   56   88:icmpge          378
		j1 = ai[j];
	//   57   91:aload_0         
	//   58   92:iload_3         
	//   59   93:iaload          
	//   60   94:istore          6
		k1 = inthashtable.get(j1);
	//   61   96:aload_1         
	//   62   97:iload           6
	//   63   99:invokevirtual   #187 <Method int IntHashtable.get(int)>
	//   64  102:istore          7
		if(k1 != 0)
			break; /* Loop/switch isn't completed */
	//   65  104:iload           7
	//   66  106:ifne            123
_L13:
		j++;
	//   67  109:iload_3         
	//   68  110:iconst_1        
	//   69  111:iadd            
	//   70  112:istore_3        
		if(true) goto _L7; else goto _L6
	//   71  113:goto            85
_L4:
		i++;
	//   72  116:iload_2         
	//   73  117:iconst_1        
	//   74  118:iadd            
	//   75  119:istore_2        
		  goto _L8
	//*  76  120:goto            14
_L6:
		i;
	//   77  123:iload_2         
		JVM INSTR tableswitch 0 2: default 152
	//	               0 163
	//	               1 237
	//	               2 324;
	//   78  124:tableswitch     0 2: default 152
	//	               0 163
	//	               1 237
	//	               2 324
		   goto _L9 _L10 _L11 _L12
_L9:
		break; /* Loop/switch isn't completed */
_L12:
		break MISSING_BLOCK_LABEL_324;
_L14:
		k = k1;
	//   79  152:iload           7
	//   80  154:istore          4
		l = j1;
	//   81  156:iload           6
	//   82  158:istore          5
		  goto _L13
	//*  83  160:goto            109
_L10:
		if(j1 == l + 1 && k1 == k)
	//*  84  163:iload           6
	//*  85  165:iload           5
	//*  86  167:iconst_1        
	//*  87  168:iadd            
	//*  88  169:icmpne          184
	//*  89  172:iload           7
	//*  90  174:iload           4
	//*  91  176:icmpne          184
			i = 2;
	//   92  179:iconst_2        
	//   93  180:istore_2        
		else
	//*  94  181:goto            152
		if(j1 == l + 1)
	//*  95  184:iload           6
	//*  96  186:iload           5
	//*  97  188:iconst_1        
	//*  98  189:iadd            
	//*  99  190:icmpne          211
		{
			i = 1;
	//  100  193:iconst_1        
	//  101  194:istore_2        
			stringbuilder.append('[').append(k);
	//  102  195:aload           8
	//  103  197:bipush          91
	//  104  199:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  105  202:iload           4
	//  106  204:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  107  207:pop             
		} else
	//* 108  208:goto            152
		{
			stringbuilder.append('[').append(k).append(']').append(j1);
	//  109  211:aload           8
	//  110  213:bipush          91
	//  111  215:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  112  218:iload           4
	//  113  220:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  114  223:bipush          93
	//  115  225:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  116  228:iload           6
	//  117  230:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  118  233:pop             
		}
		  goto _L14
	//* 119  234:goto            152
_L11:
		if(j1 == l + 1 && k1 == k)
	//* 120  237:iload           6
	//* 121  239:iload           5
	//* 122  241:iconst_1        
	//* 123  242:iadd            
	//* 124  243:icmpne          271
	//* 125  246:iload           7
	//* 126  248:iload           4
	//* 127  250:icmpne          271
		{
			i = 2;
	//  128  253:iconst_2        
	//  129  254:istore_2        
			stringbuilder.append(']').append(l);
	//  130  255:aload           8
	//  131  257:bipush          93
	//  132  259:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  133  262:iload           5
	//  134  264:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  135  267:pop             
		} else
	//* 136  268:goto            152
		if(j1 == l + 1)
	//* 137  271:iload           6
	//* 138  273:iload           5
	//* 139  275:iconst_1        
	//* 140  276:iadd            
	//* 141  277:icmpne          296
		{
			stringbuilder.append(' ').append(k);
	//  142  280:aload           8
	//  143  282:bipush          32
	//  144  284:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  145  287:iload           4
	//  146  289:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  147  292:pop             
		} else
	//* 148  293:goto            152
		{
			i = 0;
	//  149  296:iconst_0        
	//  150  297:istore_2        
			stringbuilder.append(' ').append(k).append(']').append(j1);
	//  151  298:aload           8
	//  152  300:bipush          32
	//  153  302:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  154  305:iload           4
	//  155  307:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  156  310:bipush          93
	//  157  312:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  158  315:iload           6
	//  159  317:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  160  320:pop             
		}
		  goto _L14
	//* 161  321:goto            152
		if(j1 != l + 1 || k1 != k)
	//* 162  324:iload           6
	//* 163  326:iload           5
	//* 164  328:iconst_1        
	//* 165  329:iadd            
	//* 166  330:icmpne          340
	//* 167  333:iload           7
	//* 168  335:iload           4
	//* 169  337:icmpeq          152
		{
			stringbuilder.append(' ').append(l).append(' ').append(k).append(' ').append(j1);
	//  170  340:aload           8
	//  171  342:bipush          32
	//  172  344:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  173  347:iload           5
	//  174  349:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  175  352:bipush          32
	//  176  354:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  177  357:iload           4
	//  178  359:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  179  362:bipush          32
	//  180  364:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  181  367:iload           6
	//  182  369:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  183  372:pop             
			i = 0;
	//  184  373:iconst_0        
	//  185  374:istore_2        
		}
		  goto _L14
	//* 186  375:goto            152
		i;
	//  187  378:iload_2         
		JVM INSTR tableswitch 0 2: default 404
	//	               0 410
	//	               1 431
	//	               2 452;
	//  188  379:tableswitch     0 2: default 404
	//	               0 410
	//	               1 431
	//	               2 452
		   goto _L15 _L16 _L17 _L18
_L15:
		return stringbuilder.toString();
	//  189  404:aload           8
	//  190  406:invokevirtual   #201 <Method String StringBuilder.toString()>
	//  191  409:areturn         
_L16:
		stringbuilder.append('[').append(k).append("]]");
	//  192  410:aload           8
	//  193  412:bipush          91
	//  194  414:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  195  417:iload           4
	//  196  419:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  197  422:ldc1            #203 <String "]]">
	//  198  424:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  199  427:pop             
		continue; /* Loop/switch isn't completed */
	//  200  428:goto            404
_L17:
		stringbuilder.append(' ').append(k).append("]]");
	//  201  431:aload           8
	//  202  433:bipush          32
	//  203  435:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  204  438:iload           4
	//  205  440:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  206  443:ldc1            #203 <String "]]">
	//  207  445:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  208  448:pop             
		continue; /* Loop/switch isn't completed */
	//  209  449:goto            404
_L18:
		stringbuilder.append(' ').append(l).append(' ').append(k).append(']');
	//  210  452:aload           8
	//  211  454:bipush          32
	//  212  456:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  213  459:iload           5
	//  214  461:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  215  464:bipush          32
	//  216  466:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  217  469:iload           4
	//  218  471:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  219  474:bipush          93
	//  220  476:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  221  479:pop             
		if(true) goto _L15; else goto _L19
	//  222  480:goto            404
_L19:
		  goto _L8
	}

	static String convertToVCIDMetrics(int ai[], IntHashtable inthashtable, IntHashtable inthashtable1)
	{
		int k;
		int j1;
		int k1;
		int l1;
		int i2;
		StringBuilder stringbuilder;
		if(ai.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            7
			return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
		int l = 0;
	//    5    7:iconst_0        
	//    6    8:istore          5
		j1 = 0;
	//    7   10:iconst_0        
	//    8   11:istore          6
		int i = 0;
	//    9   13:iconst_0        
	//   10   14:istore_3        
		k = 0;
	//   11   15:iconst_0        
	//   12   16:istore          4
label0:
		do
		{
label1:
			{
				k1 = k;
	//   13   18:iload           4
	//   14   20:istore          7
				if(k < ai.length)
	//*  15   22:iload           4
	//*  16   24:aload_0         
	//*  17   25:arraylength     
	//*  18   26:icmpge          54
				{
					l = ai[k];
	//   19   29:aload_0         
	//   20   30:iload           4
	//   21   32:iaload          
	//   22   33:istore          5
					j1 = inthashtable.get(l);
	//   23   35:aload_1         
	//   24   36:iload           5
	//   25   38:invokevirtual   #187 <Method int IntHashtable.get(int)>
	//   26   41:istore          6
					if(j1 == 0)
						break label1;
	//   27   43:iload           6
	//   28   45:ifeq            61
					k1 = k + 1;
	//   29   48:iload           4
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:istore          7
				}
				if(j1 == 0)
	//*  33   54:iload           6
	//*  34   56:ifne            77
					return null;
	//   35   59:aconst_null     
	//   36   60:areturn         
				break label0;
			}
			i = inthashtable1.get(l);
	//   37   61:aload_2         
	//   38   62:iload           5
	//   39   64:invokevirtual   #187 <Method int IntHashtable.get(int)>
	//   40   67:istore_3        
			k++;
	//   41   68:iload           4
	//   42   70:iconst_1        
	//   43   71:iadd            
	//   44   72:istore          4
		} while(true);
	//   45   74:goto            18
		l1 = i;
	//   46   77:iload_3         
	//   47   78:istore          8
		if(i == 0)
	//*  48   80:iload_3         
	//*  49   81:ifne            89
			l1 = 1000;
	//   50   84:sipush          1000
	//   51   87:istore          8
		stringbuilder = new StringBuilder();
	//   52   89:new             #189 <Class StringBuilder>
	//   53   92:dup             
	//   54   93:invokespecial   #190 <Method void StringBuilder()>
	//   55   96:astore          12
		stringbuilder.append('[');
	//   56   98:aload           12
	//   57  100:bipush          91
	//   58  102:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//   59  105:pop             
		stringbuilder.append(l);
	//   60  106:aload           12
	//   61  108:iload           5
	//   62  110:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//   63  113:pop             
		k = 0;
	//   64  114:iconst_0        
	//   65  115:istore          4
		i = k1;
	//   66  117:iload           7
	//   67  119:istore_3        
		i2 = j1;
	//   68  120:iload           6
	//   69  122:istore          9
		k1 = l;
	//   70  124:iload           5
	//   71  126:istore          7
		j1 = i;
	//   72  128:iload_3         
	//   73  129:istore          6
_L2:
		int j;
		int j2;
		int k2;
		if(j1 >= ai.length)
			break MISSING_BLOCK_LABEL_421;
	//   74  131:iload           6
	//   75  133:aload_0         
	//   76  134:arraylength     
	//   77  135:icmpge          421
		j2 = ai[j1];
	//   78  138:aload_0         
	//   79  139:iload           6
	//   80  141:iaload          
	//   81  142:istore          10
		k2 = inthashtable.get(j2);
	//   82  144:aload_1         
	//   83  145:iload           10
	//   84  147:invokevirtual   #187 <Method int IntHashtable.get(int)>
	//   85  150:istore          11
		if(k2 != 0)
			break; /* Loop/switch isn't completed */
	//   86  152:iload           11
	//   87  154:ifne            172
		j = k;
	//   88  157:iload           4
	//   89  159:istore_3        
_L7:
		j1++;
	//   90  160:iload           6
	//   91  162:iconst_1        
	//   92  163:iadd            
	//   93  164:istore          6
		k = j;
	//   94  166:iload_3         
	//   95  167:istore          4
		if(true) goto _L2; else goto _L1
	//   96  169:goto            131
_L1:
		int i1;
		j = inthashtable1.get(k1);
	//   97  172:aload_2         
	//   98  173:iload           7
	//   99  175:invokevirtual   #187 <Method int IntHashtable.get(int)>
	//  100  178:istore_3        
		i1 = j;
	//  101  179:iload_3         
	//  102  180:istore          5
		if(j == 0)
	//* 103  182:iload_3         
	//* 104  183:ifne            191
			i1 = 1000;
	//  105  186:sipush          1000
	//  106  189:istore          5
		j = k;
	//  107  191:iload           4
	//  108  193:istore_3        
		k;
	//  109  194:iload           4
		JVM INSTR tableswitch 0 2: default 224
	//	               0 242
	//	               1 227
	//	               2 333;
	//  110  196:tableswitch     0 2: default 224
	//	               0 242
	//	               1 227
	//	               2 333
		   goto _L3 _L4 _L5 _L6
_L5:
		break; /* Loop/switch isn't completed */
_L3:
		j = k;
	//  111  224:iload           4
	//  112  226:istore_3        
_L8:
		i2 = k2;
	//  113  227:iload           11
	//  114  229:istore          9
		k1 = j2;
	//  115  231:iload           10
	//  116  233:istore          7
		l1 = i1;
	//  117  235:iload           5
	//  118  237:istore          8
		  goto _L7
	//* 119  239:goto            160
_L4:
		if(j2 == k1 + 1 && k2 == i2 && i1 == l1)
	//* 120  242:iload           10
	//* 121  244:iload           7
	//* 122  246:iconst_1        
	//* 123  247:iadd            
	//* 124  248:icmpne          270
	//* 125  251:iload           11
	//* 126  253:iload           9
	//* 127  255:icmpne          270
	//* 128  258:iload           5
	//* 129  260:iload           8
	//* 130  262:icmpne          270
		{
			j = 2;
	//  131  265:iconst_2        
	//  132  266:istore_3        
		} else
	//* 133  267:goto            227
		{
			stringbuilder.append(' ').append(k1).append(' ').append(-i2).append(' ').append(l1 / 2).append(' ').append(880).append(' ').append(j2);
	//  134  270:aload           12
	//  135  272:bipush          32
	//  136  274:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  137  277:iload           7
	//  138  279:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  139  282:bipush          32
	//  140  284:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  141  287:iload           9
	//  142  289:ineg            
	//  143  290:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  144  293:bipush          32
	//  145  295:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  146  298:iload           8
	//  147  300:iconst_2        
	//  148  301:idiv            
	//  149  302:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  150  305:bipush          32
	//  151  307:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  152  310:sipush          880
	//  153  313:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  154  316:bipush          32
	//  155  318:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  156  321:iload           10
	//  157  323:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  158  326:pop             
			j = k;
	//  159  327:iload           4
	//  160  329:istore_3        
		}
		  goto _L8
	//* 161  330:goto            227
_L6:
		if(j2 != k1 + 1 || k2 != i2) goto _L10; else goto _L9
	//  162  333:iload           10
	//  163  335:iload           7
	//  164  337:iconst_1        
	//  165  338:iadd            
	//  166  339:icmpne          359
	//  167  342:iload           11
	//  168  344:iload           9
	//  169  346:icmpne          359
_L9:
		j = k;
	//  170  349:iload           4
	//  171  351:istore_3        
		if(i1 == l1) goto _L8; else goto _L10
	//  172  352:iload           5
	//  173  354:iload           8
	//  174  356:icmpeq          227
_L10:
		stringbuilder.append(' ').append(k1).append(' ').append(-i2).append(' ').append(l1 / 2).append(' ').append(880).append(' ').append(j2);
	//  175  359:aload           12
	//  176  361:bipush          32
	//  177  363:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  178  366:iload           7
	//  179  368:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  180  371:bipush          32
	//  181  373:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  182  376:iload           9
	//  183  378:ineg            
	//  184  379:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  185  382:bipush          32
	//  186  384:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  187  387:iload           8
	//  188  389:iconst_2        
	//  189  390:idiv            
	//  190  391:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  191  394:bipush          32
	//  192  396:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  193  399:sipush          880
	//  194  402:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  195  405:bipush          32
	//  196  407:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  197  410:iload           10
	//  198  412:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  199  415:pop             
		j = 0;
	//  200  416:iconst_0        
	//  201  417:istore_3        
		  goto _L8
	//* 202  418:goto            227
		stringbuilder.append(' ').append(k1).append(' ').append(-i2).append(' ').append(l1 / 2).append(' ').append(880).append(" ]");
	//  203  421:aload           12
	//  204  423:bipush          32
	//  205  425:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  206  428:iload           7
	//  207  430:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  208  433:bipush          32
	//  209  435:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  210  438:iload           9
	//  211  440:ineg            
	//  212  441:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  213  444:bipush          32
	//  214  446:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  215  449:iload           8
	//  216  451:iconst_2        
	//  217  452:idiv            
	//  218  453:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  219  456:bipush          32
	//  220  458:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//  221  461:sipush          880
	//  222  464:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  223  467:ldc1            #210 <String " ]">
	//  224  469:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  225  472:pop             
		return stringbuilder.toString();
	//  226  473:aload           12
	//  227  475:invokevirtual   #201 <Method String StringBuilder.toString()>
	//  228  478:areturn         
	}

	static IntHashtable createMetric(String s)
	{
		IntHashtable inthashtable = new IntHashtable();
	//    0    0:new             #184 <Class IntHashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #213 <Method void IntHashtable()>
	//    3    7:astore_1        
		for(s = ((String) (new StringTokenizer(s))); ((StringTokenizer) (s)).hasMoreTokens(); inthashtable.put(Integer.parseInt(((StringTokenizer) (s)).nextToken()), Integer.parseInt(((StringTokenizer) (s)).nextToken())));
	//    4    8:new             #215 <Class StringTokenizer>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #216 <Method void StringTokenizer(String)>
	//    8   16:astore_0        
	//    9   17:aload_0         
	//   10   18:invokevirtual   #219 <Method boolean StringTokenizer.hasMoreTokens()>
	//   11   21:ifeq            46
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #222 <Method String StringTokenizer.nextToken()>
	//   15   29:invokestatic    #228 <Method int Integer.parseInt(String)>
	//   16   32:aload_0         
	//   17   33:invokevirtual   #222 <Method String StringTokenizer.nextToken()>
	//   18   36:invokestatic    #228 <Method int Integer.parseInt(String)>
	//   19   39:invokevirtual   #232 <Method int IntHashtable.put(int, int)>
	//   20   42:pop             
	//*  21   43:goto            17
		return inthashtable;
	//   22   46:aload_1         
	//   23   47:areturn         
	}

	private float getBBox(int i)
	{
		StringTokenizer stringtokenizer = new StringTokenizer((String)fontDesc.get("FontBBox"), " []\r\n\t\f");
	//    0    0:new             #215 <Class StringTokenizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #236 <Field HashMap fontDesc>
	//    4    8:ldc1            #238 <String "FontBBox">
	//    5   10:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//    6   13:checkcast       #106 <Class String>
	//    7   16:ldc1            #240 <String " []\r\n\t\f">
	//    8   18:invokespecial   #243 <Method void StringTokenizer(String, String)>
	//    9   21:astore          4
		String s = stringtokenizer.nextToken();
	//   10   23:aload           4
	//   11   25:invokevirtual   #222 <Method String StringTokenizer.nextToken()>
	//   12   28:astore_3        
		for(int j = 0; j < i; j++)
	//*  13   29:iconst_0        
	//*  14   30:istore_2        
	//*  15   31:iload_2         
	//*  16   32:iload_1         
	//*  17   33:icmpge          49
			s = stringtokenizer.nextToken();
	//   18   36:aload           4
	//   19   38:invokevirtual   #222 <Method String StringTokenizer.nextToken()>
	//   20   41:astore_3        

	//   21   42:iload_2         
	//   22   43:iconst_1        
	//   23   44:iadd            
	//   24   45:istore_2        
	//*  25   46:goto            31
		return (float)Integer.parseInt(s);
	//   26   49:aload_3         
	//   27   50:invokestatic    #228 <Method int Integer.parseInt(String)>
	//   28   53:i2f             
	//   29   54:freturn         
	}

	private PdfDictionary getCIDFont(PdfIndirectReference pdfindirectreference, IntHashtable inthashtable)
	{
		PdfDictionary pdfdictionary = new PdfDictionary(PdfName.FONT);
	//    0    0:new             #247 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:getstatic       #253 <Field PdfName PdfName.FONT>
	//    3    7:invokespecial   #256 <Method void PdfDictionary(PdfName)>
	//    4   10:astore_3        
		pdfdictionary.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.CIDFONTTYPE0)));
	//    5   11:aload_3         
	//    6   12:getstatic       #259 <Field PdfName PdfName.SUBTYPE>
	//    7   15:getstatic       #262 <Field PdfName PdfName.CIDFONTTYPE0>
	//    8   18:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.BASEFONT, ((PdfObject) (new PdfName((new StringBuilder()).append(fontName).append(style).toString()))));
	//    9   21:aload_3         
	//   10   22:getstatic       #268 <Field PdfName PdfName.BASEFONT>
	//   11   25:new             #249 <Class PdfName>
	//   12   28:dup             
	//   13   29:new             #189 <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #190 <Method void StringBuilder()>
	//   16   36:aload_0         
	//   17   37:getfield        #116 <Field String fontName>
	//   18   40:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:aload_0         
	//   20   44:getfield        #75  <Field String style>
	//   21   47:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #269 <Method void PdfName(String)>
	//   24   56:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.FONTDESCRIPTOR, ((PdfObject) (pdfindirectreference)));
	//   25   59:aload_3         
	//   26   60:getstatic       #272 <Field PdfName PdfName.FONTDESCRIPTOR>
	//   27   63:aload_1         
	//   28   64:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfindirectreference = ((PdfIndirectReference) (inthashtable.toOrderedKeys()));
	//   29   67:aload_2         
	//   30   68:invokevirtual   #276 <Method int[] IntHashtable.toOrderedKeys()>
	//   31   71:astore_1        
		inthashtable = ((IntHashtable) (convertToHCIDMetrics(((int []) (pdfindirectreference)), hMetrics)));
	//   32   72:aload_1         
	//   33   73:aload_0         
	//   34   74:getfield        #278 <Field IntHashtable hMetrics>
	//   35   77:invokestatic    #280 <Method String convertToHCIDMetrics(int[], IntHashtable)>
	//   36   80:astore_2        
		if(inthashtable != null)
	//*  37   81:aload_2         
	//*  38   82:ifnull          100
			pdfdictionary.put(PdfName.W, ((PdfObject) (new PdfLiteral(((String) (inthashtable))))));
	//   39   85:aload_3         
	//   40   86:getstatic       #283 <Field PdfName PdfName.W>
	//   41   89:new             #285 <Class PdfLiteral>
	//   42   92:dup             
	//   43   93:aload_2         
	//   44   94:invokespecial   #286 <Method void PdfLiteral(String)>
	//   45   97:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(vertical)
	//*  46  100:aload_0         
	//*  47  101:getfield        #128 <Field boolean vertical>
	//*  48  104:ifeq            229
		{
			pdfindirectreference = ((PdfIndirectReference) (convertToVCIDMetrics(((int []) (pdfindirectreference)), vMetrics, hMetrics)));
	//   49  107:aload_1         
	//   50  108:aload_0         
	//   51  109:getfield        #288 <Field IntHashtable vMetrics>
	//   52  112:aload_0         
	//   53  113:getfield        #278 <Field IntHashtable hMetrics>
	//   54  116:invokestatic    #290 <Method String convertToVCIDMetrics(int[], IntHashtable, IntHashtable)>
	//   55  119:astore_1        
			if(pdfindirectreference != null)
	//*  56  120:aload_1         
	//*  57  121:ifnull          139
				pdfdictionary.put(PdfName.W2, ((PdfObject) (new PdfLiteral(((String) (pdfindirectreference))))));
	//   58  124:aload_3         
	//   59  125:getstatic       #293 <Field PdfName PdfName.W2>
	//   60  128:new             #285 <Class PdfLiteral>
	//   61  131:dup             
	//   62  132:aload_1         
	//   63  133:invokespecial   #286 <Method void PdfLiteral(String)>
	//   64  136:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//*  65  139:new             #247 <Class PdfDictionary>
	//*  66  142:dup             
	//*  67  143:invokespecial   #294 <Method void PdfDictionary()>
	//*  68  146:astore_1        
	//*  69  147:aload_0         
	//*  70  148:getfield        #77  <Field boolean cidDirect>
	//*  71  151:ifeq            249
	//*  72  154:aload_1         
	//*  73  155:getstatic       #297 <Field PdfName PdfName.REGISTRY>
	//*  74  158:new             #299 <Class PdfString>
	//*  75  161:dup             
	//*  76  162:aload_0         
	//*  77  163:getfield        #301 <Field CMapCidUni cidUni>
	//*  78  166:invokevirtual   #306 <Method String CMapCidUni.getRegistry()>
	//*  79  169:aconst_null     
	//*  80  170:invokespecial   #307 <Method void PdfString(String, String)>
	//*  81  173:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  82  176:aload_1         
	//*  83  177:getstatic       #310 <Field PdfName PdfName.ORDERING>
	//*  84  180:new             #299 <Class PdfString>
	//*  85  183:dup             
	//*  86  184:aload_0         
	//*  87  185:getfield        #301 <Field CMapCidUni cidUni>
	//*  88  188:invokevirtual   #313 <Method String CMapCidUni.getOrdering()>
	//*  89  191:aconst_null     
	//*  90  192:invokespecial   #307 <Method void PdfString(String, String)>
	//*  91  195:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  92  198:aload_1         
	//*  93  199:getstatic       #316 <Field PdfName PdfName.SUPPLEMENT>
	//*  94  202:new             #318 <Class PdfNumber>
	//*  95  205:dup             
	//*  96  206:aload_0         
	//*  97  207:getfield        #301 <Field CMapCidUni cidUni>
	//*  98  210:invokevirtual   #321 <Method int CMapCidUni.getSupplement()>
	//*  99  213:invokespecial   #324 <Method void PdfNumber(int)>
	//* 100  216:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 101  219:aload_3         
	//* 102  220:getstatic       #327 <Field PdfName PdfName.CIDSYSTEMINFO>
	//* 103  223:aload_1         
	//* 104  224:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 105  227:aload_3         
	//* 106  228:areturn         
		{
			pdfdictionary.put(PdfName.DW, ((PdfObject) (new PdfNumber(1000))));
	//  107  229:aload_3         
	//  108  230:getstatic       #330 <Field PdfName PdfName.DW>
	//  109  233:new             #318 <Class PdfNumber>
	//  110  236:dup             
	//  111  237:sipush          1000
	//  112  240:invokespecial   #324 <Method void PdfNumber(int)>
	//  113  243:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		pdfindirectreference = ((PdfIndirectReference) (new PdfDictionary()));
		if(cidDirect)
		{
			((PdfDictionary) (pdfindirectreference)).put(PdfName.REGISTRY, ((PdfObject) (new PdfString(cidUni.getRegistry(), ((String) (null))))));
			((PdfDictionary) (pdfindirectreference)).put(PdfName.ORDERING, ((PdfObject) (new PdfString(cidUni.getOrdering(), ((String) (null))))));
			((PdfDictionary) (pdfindirectreference)).put(PdfName.SUPPLEMENT, ((PdfObject) (new PdfNumber(cidUni.getSupplement()))));
		} else
	//* 114  246:goto            139
		{
			((PdfDictionary) (pdfindirectreference)).put(PdfName.REGISTRY, ((PdfObject) (new PdfString(cidByte.getRegistry(), ((String) (null))))));
	//  115  249:aload_1         
	//  116  250:getstatic       #297 <Field PdfName PdfName.REGISTRY>
	//  117  253:new             #299 <Class PdfString>
	//  118  256:dup             
	//  119  257:aload_0         
	//  120  258:getfield        #332 <Field CMapCidByte cidByte>
	//  121  261:invokevirtual   #335 <Method String CMapCidByte.getRegistry()>
	//  122  264:aconst_null     
	//  123  265:invokespecial   #307 <Method void PdfString(String, String)>
	//  124  268:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
			((PdfDictionary) (pdfindirectreference)).put(PdfName.ORDERING, ((PdfObject) (new PdfString(cidByte.getOrdering(), ((String) (null))))));
	//  125  271:aload_1         
	//  126  272:getstatic       #310 <Field PdfName PdfName.ORDERING>
	//  127  275:new             #299 <Class PdfString>
	//  128  278:dup             
	//  129  279:aload_0         
	//  130  280:getfield        #332 <Field CMapCidByte cidByte>
	//  131  283:invokevirtual   #336 <Method String CMapCidByte.getOrdering()>
	//  132  286:aconst_null     
	//  133  287:invokespecial   #307 <Method void PdfString(String, String)>
	//  134  290:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
			((PdfDictionary) (pdfindirectreference)).put(PdfName.SUPPLEMENT, ((PdfObject) (new PdfNumber(cidByte.getSupplement()))));
	//  135  293:aload_1         
	//  136  294:getstatic       #316 <Field PdfName PdfName.SUPPLEMENT>
	//  137  297:new             #318 <Class PdfNumber>
	//  138  300:dup             
	//  139  301:aload_0         
	//  140  302:getfield        #332 <Field CMapCidByte cidByte>
	//  141  305:invokevirtual   #337 <Method int CMapCidByte.getSupplement()>
	//  142  308:invokespecial   #324 <Method void PdfNumber(int)>
	//  143  311:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		pdfdictionary.put(PdfName.CIDSYSTEMINFO, ((PdfObject) (pdfindirectreference)));
		return pdfdictionary;
	//* 144  314:goto            219
	}

	private float getDescNumber(String s)
	{
		return (float)Integer.parseInt((String)fontDesc.get(((Object) (s))));
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field HashMap fontDesc>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #106 <Class String>
	//    5   11:invokestatic    #228 <Method int Integer.parseInt(String)>
	//    6   14:i2f             
	//    7   15:freturn         
	}

	private PdfDictionary getFontBaseType(PdfIndirectReference pdfindirectreference)
	{
		PdfDictionary pdfdictionary = new PdfDictionary(PdfName.FONT);
	//    0    0:new             #247 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:getstatic       #253 <Field PdfName PdfName.FONT>
	//    3    7:invokespecial   #256 <Method void PdfDictionary(PdfName)>
	//    4   10:astore          4
		pdfdictionary.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TYPE0)));
	//    5   12:aload           4
	//    6   14:getstatic       #259 <Field PdfName PdfName.SUBTYPE>
	//    7   17:getstatic       #344 <Field PdfName PdfName.TYPE0>
	//    8   20:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		String s1 = fontName;
	//    9   23:aload_0         
	//   10   24:getfield        #116 <Field String fontName>
	//   11   27:astore_3        
		String s = s1;
	//   12   28:aload_3         
	//   13   29:astore_2        
		if(style.length() > 0)
	//*  14   30:aload_0         
	//*  15   31:getfield        #75  <Field String style>
	//*  16   34:invokevirtual   #110 <Method int String.length()>
	//*  17   37:ifle            72
			s = (new StringBuilder()).append(s1).append("-").append(style.substring(1)).toString();
	//   18   40:new             #189 <Class StringBuilder>
	//   19   43:dup             
	//   20   44:invokespecial   #190 <Method void StringBuilder()>
	//   21   47:aload_3         
	//   22   48:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:ldc2            #346 <String "-">
	//   24   54:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:aload_0         
	//   26   58:getfield        #75  <Field String style>
	//   27   61:iconst_1        
	//   28   62:invokevirtual   #114 <Method String String.substring(int)>
	//   29   65:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   31   71:astore_2        
		s = (new StringBuilder()).append(s).append("-").append(CMap).toString();
	//   32   72:new             #189 <Class StringBuilder>
	//   33   75:dup             
	//   34   76:invokespecial   #190 <Method void StringBuilder()>
	//   35   79:aload_2         
	//   36   80:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   37   83:ldc2            #346 <String "-">
	//   38   86:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   39   89:aload_0         
	//   40   90:getfield        #130 <Field String CMap>
	//   41   93:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   42   96:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   43   99:astore_2        
		pdfdictionary.put(PdfName.BASEFONT, ((PdfObject) (new PdfName(s))));
	//   44  100:aload           4
	//   45  102:getstatic       #268 <Field PdfName PdfName.BASEFONT>
	//   46  105:new             #249 <Class PdfName>
	//   47  108:dup             
	//   48  109:aload_2         
	//   49  110:invokespecial   #269 <Method void PdfName(String)>
	//   50  113:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.ENCODING, ((PdfObject) (new PdfName(CMap))));
	//   51  116:aload           4
	//   52  118:getstatic       #349 <Field PdfName PdfName.ENCODING>
	//   53  121:new             #249 <Class PdfName>
	//   54  124:dup             
	//   55  125:aload_0         
	//   56  126:getfield        #130 <Field String CMap>
	//   57  129:invokespecial   #269 <Method void PdfName(String)>
	//   58  132:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.DESCENDANTFONTS, ((PdfObject) (new PdfArray(((PdfObject) (pdfindirectreference))))));
	//   59  135:aload           4
	//   60  137:getstatic       #352 <Field PdfName PdfName.DESCENDANTFONTS>
	//   61  140:new             #354 <Class PdfArray>
	//   62  143:dup             
	//   63  144:aload_1         
	//   64  145:invokespecial   #357 <Method void PdfArray(PdfObject)>
	//   65  148:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfdictionary;
	//   66  151:aload           4
	//   67  153:areturn         
	}

	private PdfDictionary getFontDescriptor()
	{
		PdfDictionary pdfdictionary = new PdfDictionary(PdfName.FONTDESCRIPTOR);
	//    0    0:new             #247 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:getstatic       #272 <Field PdfName PdfName.FONTDESCRIPTOR>
	//    3    7:invokespecial   #256 <Method void PdfDictionary(PdfName)>
	//    4   10:astore_1        
		pdfdictionary.put(PdfName.ASCENT, ((PdfObject) (new PdfLiteral((String)fontDesc.get("Ascent")))));
	//    5   11:aload_1         
	//    6   12:getstatic       #362 <Field PdfName PdfName.ASCENT>
	//    7   15:new             #285 <Class PdfLiteral>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #236 <Field HashMap fontDesc>
	//   11   23:ldc2            #364 <String "Ascent">
	//   12   26:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   13   29:checkcast       #106 <Class String>
	//   14   32:invokespecial   #286 <Method void PdfLiteral(String)>
	//   15   35:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.CAPHEIGHT, ((PdfObject) (new PdfLiteral((String)fontDesc.get("CapHeight")))));
	//   16   38:aload_1         
	//   17   39:getstatic       #367 <Field PdfName PdfName.CAPHEIGHT>
	//   18   42:new             #285 <Class PdfLiteral>
	//   19   45:dup             
	//   20   46:aload_0         
	//   21   47:getfield        #236 <Field HashMap fontDesc>
	//   22   50:ldc2            #369 <String "CapHeight">
	//   23   53:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   24   56:checkcast       #106 <Class String>
	//   25   59:invokespecial   #286 <Method void PdfLiteral(String)>
	//   26   62:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.DESCENT, ((PdfObject) (new PdfLiteral((String)fontDesc.get("Descent")))));
	//   27   65:aload_1         
	//   28   66:getstatic       #372 <Field PdfName PdfName.DESCENT>
	//   29   69:new             #285 <Class PdfLiteral>
	//   30   72:dup             
	//   31   73:aload_0         
	//   32   74:getfield        #236 <Field HashMap fontDesc>
	//   33   77:ldc2            #374 <String "Descent">
	//   34   80:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   35   83:checkcast       #106 <Class String>
	//   36   86:invokespecial   #286 <Method void PdfLiteral(String)>
	//   37   89:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.FLAGS, ((PdfObject) (new PdfLiteral((String)fontDesc.get("Flags")))));
	//   38   92:aload_1         
	//   39   93:getstatic       #377 <Field PdfName PdfName.FLAGS>
	//   40   96:new             #285 <Class PdfLiteral>
	//   41   99:dup             
	//   42  100:aload_0         
	//   43  101:getfield        #236 <Field HashMap fontDesc>
	//   44  104:ldc2            #379 <String "Flags">
	//   45  107:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   46  110:checkcast       #106 <Class String>
	//   47  113:invokespecial   #286 <Method void PdfLiteral(String)>
	//   48  116:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.FONTBBOX, ((PdfObject) (new PdfLiteral((String)fontDesc.get("FontBBox")))));
	//   49  119:aload_1         
	//   50  120:getstatic       #382 <Field PdfName PdfName.FONTBBOX>
	//   51  123:new             #285 <Class PdfLiteral>
	//   52  126:dup             
	//   53  127:aload_0         
	//   54  128:getfield        #236 <Field HashMap fontDesc>
	//   55  131:ldc1            #238 <String "FontBBox">
	//   56  133:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   57  136:checkcast       #106 <Class String>
	//   58  139:invokespecial   #286 <Method void PdfLiteral(String)>
	//   59  142:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.FONTNAME, ((PdfObject) (new PdfName((new StringBuilder()).append(fontName).append(style).toString()))));
	//   60  145:aload_1         
	//   61  146:getstatic       #385 <Field PdfName PdfName.FONTNAME>
	//   62  149:new             #249 <Class PdfName>
	//   63  152:dup             
	//   64  153:new             #189 <Class StringBuilder>
	//   65  156:dup             
	//   66  157:invokespecial   #190 <Method void StringBuilder()>
	//   67  160:aload_0         
	//   68  161:getfield        #116 <Field String fontName>
	//   69  164:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   70  167:aload_0         
	//   71  168:getfield        #75  <Field String style>
	//   72  171:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   73  174:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   74  177:invokespecial   #269 <Method void PdfName(String)>
	//   75  180:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.ITALICANGLE, ((PdfObject) (new PdfLiteral((String)fontDesc.get("ItalicAngle")))));
	//   76  183:aload_1         
	//   77  184:getstatic       #388 <Field PdfName PdfName.ITALICANGLE>
	//   78  187:new             #285 <Class PdfLiteral>
	//   79  190:dup             
	//   80  191:aload_0         
	//   81  192:getfield        #236 <Field HashMap fontDesc>
	//   82  195:ldc2            #390 <String "ItalicAngle">
	//   83  198:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   84  201:checkcast       #106 <Class String>
	//   85  204:invokespecial   #286 <Method void PdfLiteral(String)>
	//   86  207:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.STEMV, ((PdfObject) (new PdfLiteral((String)fontDesc.get("StemV")))));
	//   87  210:aload_1         
	//   88  211:getstatic       #393 <Field PdfName PdfName.STEMV>
	//   89  214:new             #285 <Class PdfLiteral>
	//   90  217:dup             
	//   91  218:aload_0         
	//   92  219:getfield        #236 <Field HashMap fontDesc>
	//   93  222:ldc2            #395 <String "StemV">
	//   94  225:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   95  228:checkcast       #106 <Class String>
	//   96  231:invokespecial   #286 <Method void PdfLiteral(String)>
	//   97  234:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//   98  237:new             #247 <Class PdfDictionary>
	//   99  240:dup             
	//  100  241:invokespecial   #294 <Method void PdfDictionary()>
	//  101  244:astore_2        
		pdfdictionary1.put(PdfName.PANOSE, ((PdfObject) (new PdfString((String)fontDesc.get("Panose"), ((String) (null))))));
	//  102  245:aload_2         
	//  103  246:getstatic       #398 <Field PdfName PdfName.PANOSE>
	//  104  249:new             #299 <Class PdfString>
	//  105  252:dup             
	//  106  253:aload_0         
	//  107  254:getfield        #236 <Field HashMap fontDesc>
	//  108  257:ldc2            #400 <String "Panose">
	//  109  260:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//  110  263:checkcast       #106 <Class String>
	//  111  266:aconst_null     
	//  112  267:invokespecial   #307 <Method void PdfString(String, String)>
	//  113  270:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.STYLE, ((PdfObject) (pdfdictionary1)));
	//  114  273:aload_1         
	//  115  274:getstatic       #403 <Field PdfName PdfName.STYLE>
	//  116  277:aload_2         
	//  117  278:invokevirtual   #265 <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfdictionary;
	//  118  281:aload_1         
	//  119  282:areturn         
	}

	public static boolean isCJKFont(String s, String s1)
	{
		loadProperties();
	//    0    0:invokestatic    #80  <Method void loadProperties()>
		while(!registryNames.containsKey("fonts") || !((Set)registryNames.get("fonts")).contains(((Object) (s)))) 
	//*   1    3:getstatic       #66  <Field HashMap registryNames>
	//*   2    6:ldc2            #405 <String "fonts">
	//*   3    9:invokevirtual   #408 <Method boolean HashMap.containsKey(Object)>
	//*   4   12:ifne            17
			return false;
	//    5   15:iconst_0        
	//    6   16:ireturn         
	//    7   17:getstatic       #66  <Field HashMap registryNames>
	//    8   20:ldc2            #405 <String "fonts">
	//    9   23:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   10   26:checkcast       #149 <Class Set>
	//   11   29:aload_0         
	//   12   30:invokeinterface #171 <Method boolean Set.contains(Object)>
	//   13   35:ifeq            15
		if(s1.equals("Identity-H") || s1.equals("Identity-V"))
	//*  14   38:aload_1         
	//*  15   39:ldc1            #132 <String "Identity-H">
	//*  16   41:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  17   44:ifne            56
	//*  18   47:aload_1         
	//*  19   48:ldc1            #138 <String "Identity-V">
	//*  20   50:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  21   53:ifeq            58
			return true;
	//   22   56:iconst_1        
	//   23   57:ireturn         
		s = (String)((HashMap)allFonts.get(((Object) (s)))).get("Registry");
	//   24   58:getstatic       #62  <Field HashMap allFonts>
	//   25   61:aload_0         
	//   26   62:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   27   65:checkcast       #59  <Class HashMap>
	//   28   68:ldc1            #176 <String "Registry">
	//   29   70:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   30   73:checkcast       #106 <Class String>
	//   31   76:astore_0        
		s = ((String) ((Set)registryNames.get(((Object) (s)))));
	//   32   77:getstatic       #66  <Field HashMap registryNames>
	//   33   80:aload_0         
	//   34   81:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   35   84:checkcast       #149 <Class Set>
	//   36   87:astore_0        
		boolean flag;
		if(s != null && ((Set) (s)).contains(((Object) (s1))))
	//*  37   88:aload_0         
	//*  38   89:ifnull          106
	//*  39   92:aload_0         
	//*  40   93:aload_1         
	//*  41   94:invokeinterface #171 <Method boolean Set.contains(Object)>
	//*  42   99:ifeq            106
			flag = true;
	//   43  102:iconst_1        
	//   44  103:istore_2        
		else
	//*  45  104:iload_2         
	//*  46  105:ireturn         
			flag = false;
	//   47  106:iconst_0        
	//   48  107:istore_2        
		return flag;
	//*  49  108:goto            104
	}

	private void loadCMaps()
		throws DocumentException
	{
		Object obj;
		fontDesc = (HashMap)allFonts.get(((Object) (fontName)));
	//    0    0:aload_0         
	//    1    1:getstatic       #62  <Field HashMap allFonts>
	//    2    4:aload_0         
	//    3    5:getfield        #116 <Field String fontName>
	//    4    8:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #59  <Class HashMap>
	//    6   14:putfield        #236 <Field HashMap fontDesc>
		hMetrics = (IntHashtable)fontDesc.get("W");
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:getfield        #236 <Field HashMap fontDesc>
	//   10   22:ldc2            #411 <String "W">
	//   11   25:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   12   28:checkcast       #184 <Class IntHashtable>
	//   13   31:putfield        #278 <Field IntHashtable hMetrics>
		vMetrics = (IntHashtable)fontDesc.get("W2");
	//   14   34:aload_0         
	//   15   35:aload_0         
	//   16   36:getfield        #236 <Field HashMap fontDesc>
	//   17   39:ldc2            #412 <String "W2">
	//   18   42:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   19   45:checkcast       #184 <Class IntHashtable>
	//   20   48:putfield        #288 <Field IntHashtable vMetrics>
		obj = ((Object) ((String)fontDesc.get("Registry")));
	//   21   51:aload_0         
	//   22   52:getfield        #236 <Field HashMap fontDesc>
	//   23   55:ldc1            #176 <String "Registry">
	//   24   57:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   25   60:checkcast       #106 <Class String>
	//   26   63:astore_1        
		uniMap = "";
	//   27   64:aload_0         
	//   28   65:ldc1            #73  <String "">
	//   29   67:putfield        #414 <Field String uniMap>
		obj = ((Object) (((Set)registryNames.get(((Object) ((new StringBuilder()).append(((String) (obj))).append("_Uni").toString())))).iterator()));
	//   30   70:getstatic       #66  <Field HashMap registryNames>
	//   31   73:new             #189 <Class StringBuilder>
	//   32   76:dup             
	//   33   77:invokespecial   #190 <Method void StringBuilder()>
	//   34   80:aload_1         
	//   35   81:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   36   84:ldc2            #416 <String "_Uni">
	//   37   87:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   38   90:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   39   93:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//   40   96:checkcast       #149 <Class Set>
	//   41   99:invokeinterface #153 <Method Iterator Set.iterator()>
	//   42  104:astore_1        
_L5:
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
	//   43  105:aload_1         
	//   44  106:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//   45  111:ifeq            145
_L1:
		String s;
		s = (String)((Iterator) (obj)).next();
	//   46  114:aload_1         
	//   47  115:invokeinterface #163 <Method Object Iterator.next()>
	//   48  120:checkcast       #106 <Class String>
	//   49  123:astore_2        
		uniMap = s;
	//   50  124:aload_0         
	//   51  125:aload_2         
	//   52  126:putfield        #414 <Field String uniMap>
		if(!s.endsWith("V") || !vertical) goto _L3; else goto _L2
	//   53  129:aload_2         
	//   54  130:ldc1            #121 <String "V">
	//   55  132:invokevirtual   #125 <Method boolean String.endsWith(String)>
	//   56  135:ifeq            164
	//   57  138:aload_0         
	//   58  139:getfield        #128 <Field boolean vertical>
	//   59  142:ifeq            164
_L2:
		if(cidDirect)
	//*  60  145:aload_0         
	//*  61  146:getfield        #77  <Field boolean cidDirect>
	//*  62  149:ifeq            183
		{
			cidUni = CMapCache.getCachedCMapCidUni(uniMap);
	//   63  152:aload_0         
	//   64  153:aload_0         
	//   65  154:getfield        #414 <Field String uniMap>
	//   66  157:invokestatic    #422 <Method CMapCidUni CMapCache.getCachedCMapCidUni(String)>
	//   67  160:putfield        #301 <Field CMapCidUni cidUni>
			return;
	//   68  163:return          
		}
		  goto _L4
_L3:
		if(s.endsWith("V") || vertical) goto _L5; else goto _L2
	//   69  164:aload_2         
	//   70  165:ldc1            #121 <String "V">
	//   71  167:invokevirtual   #125 <Method boolean String.endsWith(String)>
	//   72  170:ifne            105
	//   73  173:aload_0         
	//   74  174:getfield        #128 <Field boolean vertical>
	//   75  177:ifne            105
	//*  76  180:goto            145
_L4:
		try
		{
			uniCid = CMapCache.getCachedCMapUniCid(uniMap);
	//   77  183:aload_0         
	//   78  184:aload_0         
	//   79  185:getfield        #414 <Field String uniMap>
	//   80  188:invokestatic    #426 <Method CMapUniCid CMapCache.getCachedCMapUniCid(String)>
	//   81  191:putfield        #428 <Field CMapUniCid uniCid>
			cidByte = CMapCache.getCachedCMapCidByte(CMap);
	//   82  194:aload_0         
	//   83  195:aload_0         
	//   84  196:getfield        #130 <Field String CMap>
	//   85  199:invokestatic    #432 <Method CMapCidByte CMapCache.getCachedCMapCidByte(String)>
	//   86  202:putfield        #332 <Field CMapCidByte cidByte>
			return;
	//   87  205:return          
		}
		catch(Exception exception)
	//*  88  206:astore_1        
		{
			throw new DocumentException(exception);
	//   89  207:new             #70  <Class DocumentException>
	//   90  210:dup             
	//   91  211:aload_1         
	//   92  212:invokespecial   #435 <Method void DocumentException(Exception)>
	//   93  215:athrow          
		}
	}

	private static void loadProperties()
	{
		if(propertiesLoaded)
	//*   0    0:getstatic       #64  <Field boolean propertiesLoaded>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		synchronized(allFonts)
	//*   3    7:getstatic       #62  <Field HashMap allFonts>
	//*   4   10:astore_0        
	//*   5   11:aload_0         
	//*   6   12:monitorenter    
		{
			if(!propertiesLoaded)
				break MISSING_BLOCK_LABEL_27;
	//    7   13:getstatic       #64  <Field boolean propertiesLoaded>
	//    8   16:ifeq            27
		}
	//    9   19:aload_0         
	//   10   20:monitorexit     
		return;
	//   11   21:return          
		exception;
	//   12   22:astore_1        
		hashmap;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		throw exception;
	//   15   25:aload_1         
	//   16   26:athrow          
		try
		{
			loadRegistry();
	//   17   27:invokestatic    #438 <Method void loadRegistry()>
			String s;
			for(Iterator iterator = ((Set)registryNames.get("fonts")).iterator(); iterator.hasNext(); allFonts.put(((Object) (s)), ((Object) (readFontProperties(s)))))
	//*  18   30:getstatic       #66  <Field HashMap registryNames>
	//*  19   33:ldc2            #405 <String "fonts">
	//*  20   36:invokevirtual   #180 <Method Object HashMap.get(Object)>
	//*  21   39:checkcast       #149 <Class Set>
	//*  22   42:invokeinterface #153 <Method Iterator Set.iterator()>
	//*  23   47:astore_1        
	//*  24   48:aload_1         
	//*  25   49:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//*  26   54:ifeq            83
				s = (String)iterator.next();
	//   27   57:aload_1         
	//   28   58:invokeinterface #163 <Method Object Iterator.next()>
	//   29   63:checkcast       #106 <Class String>
	//   30   66:astore_2        

	//   31   67:getstatic       #62  <Field HashMap allFonts>
	//   32   70:aload_2         
	//   33   71:aload_2         
	//   34   72:invokestatic    #442 <Method HashMap readFontProperties(String)>
	//   35   75:invokevirtual   #445 <Method Object HashMap.put(Object, Object)>
	//   36   78:pop             
		}
	//*  37   79:goto            48
		catch(Exception exception1) { }
	//   38   82:astore_1        
		propertiesLoaded = true;
	//   39   83:iconst_1        
	//   40   84:putstatic       #64  <Field boolean propertiesLoaded>
		hashmap;
	//   41   87:aload_0         
		JVM INSTR monitorexit ;
	//   42   88:monitorexit     
	//   43   89:return          
	}

	private static void loadRegistry()
		throws IOException
	{
		InputStream inputstream = StreamUtil.getResourceStream("com/itextpdf/text/pdf/fonts/cmaps/cjk_registry.properties");
	//    0    0:ldc2            #449 <String "com/itextpdf/text/pdf/fonts/cmaps/cjk_registry.properties">
	//    1    3:invokestatic    #455 <Method InputStream StreamUtil.getResourceStream(String)>
	//    2    6:astore_3        
		Properties properties = new Properties();
	//    3    7:new             #50  <Class Properties>
	//    4   10:dup             
	//    5   11:invokespecial   #53  <Method void Properties()>
	//    6   14:astore_2        
		properties.load(inputstream);
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #459 <Method void Properties.load(InputStream)>
		inputstream.close();
	//   10   20:aload_3         
	//   11   21:invokevirtual   #464 <Method void InputStream.close()>
		Object obj;
		HashSet hashset;
		for(Iterator iterator = properties.keySet().iterator(); iterator.hasNext(); registryNames.put(((Object) ((String)obj)), ((Object) (hashset))))
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #467 <Method Set Properties.keySet()>
	//*  14   28:invokeinterface #153 <Method Iterator Set.iterator()>
	//*  15   33:astore_3        
	//*  16   34:aload_3         
	//*  17   35:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//*  18   40:ifeq            136
		{
			obj = iterator.next();
	//   19   43:aload_3         
	//   20   44:invokeinterface #163 <Method Object Iterator.next()>
	//   21   49:astore          4
			String as[] = properties.getProperty((String)obj).split(" ");
	//   22   51:aload_2         
	//   23   52:aload           4
	//   24   54:checkcast       #106 <Class String>
	//   25   57:invokevirtual   #470 <Method String Properties.getProperty(String)>
	//   26   60:ldc2            #472 <String " ">
	//   27   63:invokevirtual   #476 <Method String[] String.split(String)>
	//   28   66:astore          5
			hashset = new HashSet();
	//   29   68:new             #478 <Class HashSet>
	//   30   71:dup             
	//   31   72:invokespecial   #479 <Method void HashSet()>
	//   32   75:astore          6
			int j = as.length;
	//   33   77:aload           5
	//   34   79:arraylength     
	//   35   80:istore_1        
			for(int i = 0; i < j; i++)
	//*  36   81:iconst_0        
	//*  37   82:istore_0        
	//*  38   83:iload_0         
	//*  39   84:iload_1         
	//*  40   85:icmpge          119
			{
				String s = as[i];
	//   41   88:aload           5
	//   42   90:iload_0         
	//   43   91:aaload          
	//   44   92:astore          7
				if(s.length() > 0)
	//*  45   94:aload           7
	//*  46   96:invokevirtual   #110 <Method int String.length()>
	//*  47   99:ifle            112
					((Set) (hashset)).add(((Object) (s)));
	//   48  102:aload           6
	//   49  104:aload           7
	//   50  106:invokeinterface #482 <Method boolean Set.add(Object)>
	//   51  111:pop             
			}

	//   52  112:iload_0         
	//   53  113:iconst_1        
	//   54  114:iadd            
	//   55  115:istore_0        
		}

	//   56  116:goto            83
	//   57  119:getstatic       #66  <Field HashMap registryNames>
	//   58  122:aload           4
	//   59  124:checkcast       #106 <Class String>
	//   60  127:aload           6
	//   61  129:invokevirtual   #445 <Method Object HashMap.put(Object, Object)>
	//   62  132:pop             
	//*  63  133:goto            34
	//   64  136:return          
	}

	private static HashMap readFontProperties(String s)
		throws IOException
	{
		s = (new StringBuilder()).append(s).append(".properties").toString();
	//    0    0:new             #189 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #190 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc2            #484 <String ".properties">
	//    6   14:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:invokevirtual   #201 <Method String StringBuilder.toString()>
	//    8   20:astore_0        
		Object obj = ((Object) (StreamUtil.getResourceStream((new StringBuilder()).append("com/itextpdf/text/pdf/fonts/cmaps/").append(s).toString())));
	//    9   21:new             #189 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #190 <Method void StringBuilder()>
	//   12   28:ldc1            #16  <String "com/itextpdf/text/pdf/fonts/cmaps/">
	//   13   30:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:aload_0         
	//   15   34:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   17   40:invokestatic    #455 <Method InputStream StreamUtil.getResourceStream(String)>
	//   18   43:astore_1        
		s = ((String) (new Properties()));
	//   19   44:new             #50  <Class Properties>
	//   20   47:dup             
	//   21   48:invokespecial   #53  <Method void Properties()>
	//   22   51:astore_0        
		((Properties) (s)).load(((InputStream) (obj)));
	//   23   52:aload_0         
	//   24   53:aload_1         
	//   25   54:invokevirtual   #459 <Method void Properties.load(InputStream)>
		((InputStream) (obj)).close();
	//   26   57:aload_1         
	//   27   58:invokevirtual   #464 <Method void InputStream.close()>
		obj = ((Object) (createMetric(((Properties) (s)).getProperty("W"))));
	//   28   61:aload_0         
	//   29   62:ldc2            #411 <String "W">
	//   30   65:invokevirtual   #470 <Method String Properties.getProperty(String)>
	//   31   68:invokestatic    #486 <Method IntHashtable createMetric(String)>
	//   32   71:astore_1        
		((Properties) (s)).remove("W");
	//   33   72:aload_0         
	//   34   73:ldc2            #411 <String "W">
	//   35   76:invokevirtual   #489 <Method Object Properties.remove(Object)>
	//   36   79:pop             
		IntHashtable inthashtable = createMetric(((Properties) (s)).getProperty("W2"));
	//   37   80:aload_0         
	//   38   81:ldc2            #412 <String "W2">
	//   39   84:invokevirtual   #470 <Method String Properties.getProperty(String)>
	//   40   87:invokestatic    #486 <Method IntHashtable createMetric(String)>
	//   41   90:astore_2        
		((Properties) (s)).remove("W2");
	//   42   91:aload_0         
	//   43   92:ldc2            #412 <String "W2">
	//   44   95:invokevirtual   #489 <Method Object Properties.remove(Object)>
	//   45   98:pop             
		HashMap hashmap = new HashMap();
	//   46   99:new             #59  <Class HashMap>
	//   47  102:dup             
	//   48  103:invokespecial   #60  <Method void HashMap()>
	//   49  106:astore_3        
		Object obj1;
		for(Enumeration enumeration = ((Properties) (s)).keys(); enumeration.hasMoreElements(); hashmap.put(((Object) ((String)obj1)), ((Object) (((Properties) (s)).getProperty((String)obj1)))))
	//*  50  107:aload_0         
	//*  51  108:invokevirtual   #493 <Method Enumeration Properties.keys()>
	//*  52  111:astore          4
	//*  53  113:aload           4
	//*  54  115:invokeinterface #498 <Method boolean Enumeration.hasMoreElements()>
	//*  55  120:ifeq            154
			obj1 = enumeration.nextElement();
	//   56  123:aload           4
	//   57  125:invokeinterface #501 <Method Object Enumeration.nextElement()>
	//   58  130:astore          5

	//   59  132:aload_3         
	//   60  133:aload           5
	//   61  135:checkcast       #106 <Class String>
	//   62  138:aload_0         
	//   63  139:aload           5
	//   64  141:checkcast       #106 <Class String>
	//   65  144:invokevirtual   #470 <Method String Properties.getProperty(String)>
	//   66  147:invokevirtual   #445 <Method Object HashMap.put(Object, Object)>
	//   67  150:pop             
	//*  68  151:goto            113
		hashmap.put("W", obj);
	//   69  154:aload_3         
	//   70  155:ldc2            #411 <String "W">
	//   71  158:aload_1         
	//   72  159:invokevirtual   #445 <Method Object HashMap.put(Object, Object)>
	//   73  162:pop             
		hashmap.put("W2", ((Object) (inthashtable)));
	//   74  163:aload_3         
	//   75  164:ldc2            #412 <String "W2">
	//   76  167:aload_2         
	//   77  168:invokevirtual   #445 <Method Object HashMap.put(Object, Object)>
	//   78  171:pop             
		return hashmap;
	//   79  172:aload_3         
	//   80  173:areturn         
	}

	public boolean charExists(int i)
	{
		while(cidDirect || cidByte.lookup(uniCid.lookup(i)).length > 0) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean cidDirect>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:aload_0         
	//    6   10:getfield        #332 <Field CMapCidByte cidByte>
	//    7   13:aload_0         
	//    8   14:getfield        #428 <Field CMapUniCid uniCid>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #510 <Method int CMapUniCid.lookup(int)>
	//   11   21:invokevirtual   #513 <Method byte[] CMapCidByte.lookup(int)>
	//   12   24:arraylength     
	//   13   25:ifgt            7
		return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	byte[] convertToBytes(int i)
	{
		if(cidDirect)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean cidDirect>
	//*   2    4:ifeq            13
			return super.convertToBytes(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #516 <Method byte[] BaseFont.convertToBytes(int)>
	//    6   12:areturn         
		else
			return cidByte.lookup(uniCid.lookup(i));
	//    7   13:aload_0         
	//    8   14:getfield        #332 <Field CMapCidByte cidByte>
	//    9   17:aload_0         
	//   10   18:getfield        #428 <Field CMapUniCid uniCid>
	//   11   21:iload_1         
	//   12   22:invokevirtual   #510 <Method int CMapUniCid.lookup(int)>
	//   13   25:invokevirtual   #513 <Method byte[] CMapCidByte.lookup(int)>
	//   14   28:areturn         
	}

	public byte[] convertToBytes(String s)
	{
		if(cidDirect)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean cidDirect>
	//*   2    4:ifeq            13
			return super.convertToBytes(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #519 <Method byte[] BaseFont.convertToBytes(String)>
	//    6   12:areturn         
		int i;
		int j;
		ByteArrayOutputStream bytearrayoutputstream;
		try
		{
			if(s.length() == 1)
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #110 <Method int String.length()>
	//*   9   17:iconst_1        
	//*  10   18:icmpne          31
				return convertToBytes(((int) (s.charAt(0))));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #523 <Method char String.charAt(int)>
	//   15   27:invokevirtual   #524 <Method byte[] convertToBytes(int)>
	//   16   30:areturn         
			bytearrayoutputstream = new ByteArrayOutputStream();
	//   17   31:new             #526 <Class ByteArrayOutputStream>
	//   18   34:dup             
	//   19   35:invokespecial   #527 <Method void ByteArrayOutputStream()>
	//   20   38:astore          4
		}
	//*  21   40:iconst_0        
	//*  22   41:istore_2        
	//*  23   42:iload_2         
	//*  24   43:aload_1         
	//*  25   44:invokevirtual   #110 <Method int String.length()>
	//*  26   47:icmpge          94
	//*  27   50:aload_1         
	//*  28   51:iload_2         
	//*  29   52:invokestatic    #533 <Method boolean Utilities.isSurrogatePair(String, int)>
	//*  30   55:ifeq            85
	//*  31   58:aload_1         
	//*  32   59:iload_2         
	//*  33   60:invokestatic    #537 <Method int Utilities.convertToUtf32(String, int)>
	//*  34   63:istore_3        
	//*  35   64:iload_2         
	//*  36   65:iconst_1        
	//*  37   66:iadd            
	//*  38   67:istore_2        
	//*  39   68:aload           4
	//*  40   70:aload_0         
	//*  41   71:iload_3         
	//*  42   72:invokevirtual   #524 <Method byte[] convertToBytes(int)>
	//*  43   75:invokevirtual   #541 <Method void ByteArrayOutputStream.write(byte[])>
	//*  44   78:iload_2         
	//*  45   79:iconst_1        
	//*  46   80:iadd            
	//*  47   81:istore_2        
	//*  48   82:goto            42
	//*  49   85:aload_1         
	//*  50   86:iload_2         
	//*  51   87:invokevirtual   #523 <Method char String.charAt(int)>
	//*  52   90:istore_3        
	//*  53   91:goto            68
	//*  54   94:aload           4
	//*  55   96:invokevirtual   #545 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  56   99:astore_1        
	//*  57  100:aload_1         
	//*  58  101:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  59  102:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   60  103:new             #547 <Class ExceptionConverter>
	//   61  106:dup             
	//   62  107:aload_1         
	//   63  108:invokespecial   #548 <Method void ExceptionConverter(Exception)>
	//   64  111:athrow          
		}
		i = 0;
		if(i >= s.length())
			break MISSING_BLOCK_LABEL_94;
		if(!Utilities.isSurrogatePair(s, i))
			break MISSING_BLOCK_LABEL_85;
		j = Utilities.convertToUtf32(s, i);
		i++;
_L1:
		bytearrayoutputstream.write(convertToBytes(j));
		i++;
		continue; /* Loop/switch isn't completed */
		j = ((int) (s.charAt(i)));
		  goto _L1
		s = ((String) (bytearrayoutputstream.toByteArray()));
		return ((byte []) (s));
		if(true) goto _L3; else goto _L2
_L3:
		break MISSING_BLOCK_LABEL_42;
_L2:
	}

	public String[][] getAllNameEntries()
	{
		return (new String[][] {
			new String[] {
				"4", "", "", "", fontName
			}
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_5        
	//    5    7:anewarray       String[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc2            #554 <String "4">
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:ldc1            #73  <String "">
	//   13   20:aastore         
	//   14   21:dup             
	//   15   22:iconst_2        
	//   16   23:ldc1            #73  <String "">
	//   17   25:aastore         
	//   18   26:dup             
	//   19   27:iconst_3        
	//   20   28:ldc1            #73  <String "">
	//   21   30:aastore         
	//   22   31:dup             
	//   23   32:iconst_4        
	//   24   33:aload_0         
	//   25   34:getfield        #116 <Field String fontName>
	//   26   37:aastore         
	//   27   38:aastore         
	//   28   39:areturn         
	}

	public int[] getCharBBox(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getCidCode(int i)
	{
		if(cidDirect)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean cidDirect>
	//*   2    4:ifeq            9
			return i;
	//    3    7:iload_1         
	//    4    8:ireturn         
		else
			return uniCid.lookup(i);
	//    5    9:aload_0         
	//    6   10:getfield        #428 <Field CMapUniCid uniCid>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #510 <Method int CMapUniCid.lookup(int)>
	//    9   17:ireturn         
	}

	public String[][] getFamilyFontName()
	{
		return getFullFontName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #561 <Method String[][] getFullFontName()>
	//    2    4:areturn         
	}

	public float getFontDescriptor(int i, float f)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 12: default 64
	//	               1 66
	//	               2 80
	//	               3 94
	//	               4 108
	//	               5 116
	//	               6 128
	//	               7 140
	//	               8 152
	//	               9 66
	//	               10 94
	//	               11 64
	//	               12 164
		case 11: // '\013'
		default:
			return 0.0F;
	//    2   64:fconst_0        
	//    3   65:freturn         

		case 1: // '\001'
		case 9: // '\t'
			return (getDescNumber("Ascent") * f) / 1000F;
	//    4   66:aload_0         
	//    5   67:ldc2            #364 <String "Ascent">
	//    6   70:invokespecial   #564 <Method float getDescNumber(String)>
	//    7   73:fload_2         
	//    8   74:fmul            
	//    9   75:ldc2            #565 <Float 1000F>
	//   10   78:fdiv            
	//   11   79:freturn         

		case 2: // '\002'
			return (getDescNumber("CapHeight") * f) / 1000F;
	//   12   80:aload_0         
	//   13   81:ldc2            #369 <String "CapHeight">
	//   14   84:invokespecial   #564 <Method float getDescNumber(String)>
	//   15   87:fload_2         
	//   16   88:fmul            
	//   17   89:ldc2            #565 <Float 1000F>
	//   18   92:fdiv            
	//   19   93:freturn         

		case 3: // '\003'
		case 10: // '\n'
			return (getDescNumber("Descent") * f) / 1000F;
	//   20   94:aload_0         
	//   21   95:ldc2            #374 <String "Descent">
	//   22   98:invokespecial   #564 <Method float getDescNumber(String)>
	//   23  101:fload_2         
	//   24  102:fmul            
	//   25  103:ldc2            #565 <Float 1000F>
	//   26  106:fdiv            
	//   27  107:freturn         

		case 4: // '\004'
			return getDescNumber("ItalicAngle");
	//   28  108:aload_0         
	//   29  109:ldc2            #390 <String "ItalicAngle">
	//   30  112:invokespecial   #564 <Method float getDescNumber(String)>
	//   31  115:freturn         

		case 5: // '\005'
			return (getBBox(0) * f) / 1000F;
	//   32  116:aload_0         
	//   33  117:iconst_0        
	//   34  118:invokespecial   #567 <Method float getBBox(int)>
	//   35  121:fload_2         
	//   36  122:fmul            
	//   37  123:ldc2            #565 <Float 1000F>
	//   38  126:fdiv            
	//   39  127:freturn         

		case 6: // '\006'
			return (getBBox(1) * f) / 1000F;
	//   40  128:aload_0         
	//   41  129:iconst_1        
	//   42  130:invokespecial   #567 <Method float getBBox(int)>
	//   43  133:fload_2         
	//   44  134:fmul            
	//   45  135:ldc2            #565 <Float 1000F>
	//   46  138:fdiv            
	//   47  139:freturn         

		case 7: // '\007'
			return (getBBox(2) * f) / 1000F;
	//   48  140:aload_0         
	//   49  141:iconst_2        
	//   50  142:invokespecial   #567 <Method float getBBox(int)>
	//   51  145:fload_2         
	//   52  146:fmul            
	//   53  147:ldc2            #565 <Float 1000F>
	//   54  150:fdiv            
	//   55  151:freturn         

		case 8: // '\b'
			return (getBBox(3) * f) / 1000F;
	//   56  152:aload_0         
	//   57  153:iconst_3        
	//   58  154:invokespecial   #567 <Method float getBBox(int)>
	//   59  157:fload_2         
	//   60  158:fmul            
	//   61  159:ldc2            #565 <Float 1000F>
	//   62  162:fdiv            
	//   63  163:freturn         

		case 12: // '\f'
			return ((getBBox(2) - getBBox(0)) * f) / 1000F;
	//   64  164:aload_0         
	//   65  165:iconst_2        
	//   66  166:invokespecial   #567 <Method float getBBox(int)>
	//   67  169:aload_0         
	//   68  170:iconst_0        
	//   69  171:invokespecial   #567 <Method float getBBox(int)>
	//   70  174:fsub            
	//   71  175:fload_2         
	//   72  176:fmul            
	//   73  177:ldc2            #565 <Float 1000F>
	//   74  180:fdiv            
	//   75  181:freturn         
		}
	}

	public String[][] getFullFontName()
	{
		return (new String[][] {
			new String[] {
				"", "", "", fontName
			}
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_4        
	//    5    7:anewarray       String[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc1            #73  <String "">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:ldc1            #73  <String "">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:ldc1            #73  <String "">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_3        
	//   20   27:aload_0         
	//   21   28:getfield        #116 <Field String fontName>
	//   22   31:aastore         
	//   23   32:aastore         
	//   24   33:areturn         
	}

	public PdfStream getFullFontStream()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getKerning(int i, int j)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getPostscriptFontName()
	{
		return fontName;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field String fontName>
	//    2    4:areturn         
	}

	protected int[] getRawCharBBox(int i, String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	int getRawWidth(int i, String s)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	String getUniMap()
	{
		return uniMap;
	//    0    0:aload_0         
	//    1    1:getfield        #414 <Field String uniMap>
	//    2    4:areturn         
	}

	public int getUnicodeEquivalent(int i)
	{
label0:
		{
			int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
			if(cidDirect)
	//*   2    2:aload_0         
	//*   3    3:getfield        #77  <Field boolean cidDirect>
	//*   4    6:ifeq            19
			{
				if(i != 32767)
					break label0;
	//    5    9:iload_1         
	//    6   10:sipush          32767
	//    7   13:icmpne          21
				j = 10;
	//    8   16:bipush          10
	//    9   18:istore_2        
			}
			return j;
	//   10   19:iload_2         
	//   11   20:ireturn         
		}
		return cidUni.lookup(i);
	//   12   21:aload_0         
	//   13   22:getfield        #301 <Field CMapCidUni cidUni>
	//   14   25:iload_1         
	//   15   26:invokevirtual   #578 <Method int CMapCidUni.lookup(int)>
	//   16   29:ireturn         
	}

	public int getWidth(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(!cidDirect)
	//*   2    2:aload_0         
	//*   3    3:getfield        #77  <Field boolean cidDirect>
	//*   4    6:ifne            18
			j = uniCid.lookup(i);
	//    5    9:aload_0         
	//    6   10:getfield        #428 <Field CMapUniCid uniCid>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #510 <Method int CMapUniCid.lookup(int)>
	//    9   17:istore_2        
		if(vertical)
	//*  10   18:aload_0         
	//*  11   19:getfield        #128 <Field boolean vertical>
	//*  12   22:ifeq            40
			i = vMetrics.get(j);
	//   13   25:aload_0         
	//   14   26:getfield        #288 <Field IntHashtable vMetrics>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #187 <Method int IntHashtable.get(int)>
	//   17   33:istore_1        
		else
	//*  18   34:iload_1         
	//*  19   35:ifle            52
	//*  20   38:iload_1         
	//*  21   39:ireturn         
			i = hMetrics.get(j);
	//   22   40:aload_0         
	//   23   41:getfield        #278 <Field IntHashtable hMetrics>
	//   24   44:iload_2         
	//   25   45:invokevirtual   #187 <Method int IntHashtable.get(int)>
	//   26   48:istore_1        
		if(i > 0)
			return i;
		else
	//*  27   49:goto            34
			return 1000;
	//   28   52:sipush          1000
	//   29   55:ireturn         
	}

	public int getWidth(String s)
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		if(cidDirect)
	//*   4    5:aload_0         
	//*   5    6:getfield        #77  <Field boolean cidDirect>
	//*   6    9:ifeq            44
		{
			int k = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
			do
			{
				i1 = i;
	//    9   14:iload_2         
	//   10   15:istore          4
				if(k >= s.length())
					break;
	//   11   17:iload_3         
	//   12   18:aload_1         
	//   13   19:invokevirtual   #110 <Method int String.length()>
	//   14   22:icmpge          105
				i += getWidth(((int) (s.charAt(k))));
	//   15   25:iload_2         
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:iload_3         
	//   19   29:invokevirtual   #523 <Method char String.charAt(int)>
	//   20   32:invokevirtual   #581 <Method int getWidth(int)>
	//   21   35:iadd            
	//   22   36:istore_2        
				k++;
	//   23   37:iload_3         
	//   24   38:iconst_1        
	//   25   39:iadd            
	//   26   40:istore_3        
			} while(true);
	//   27   41:goto            14
		} else
		{
			int l = 0;
	//   28   44:iconst_0        
	//   29   45:istore_3        
			int j = i1;
	//   30   46:iload           4
	//   31   48:istore_2        
			do
			{
				i1 = j;
	//   32   49:iload_2         
	//   33   50:istore          4
				if(l >= s.length())
					break;
	//   34   52:iload_3         
	//   35   53:aload_1         
	//   36   54:invokevirtual   #110 <Method int String.length()>
	//   37   57:icmpge          105
				if(Utilities.isSurrogatePair(s, l))
	//*  38   60:aload_1         
	//*  39   61:iload_3         
	//*  40   62:invokestatic    #533 <Method boolean Utilities.isSurrogatePair(String, int)>
	//*  41   65:ifeq            95
				{
					i1 = Utilities.convertToUtf32(s, l);
	//   42   68:aload_1         
	//   43   69:iload_3         
	//   44   70:invokestatic    #537 <Method int Utilities.convertToUtf32(String, int)>
	//   45   73:istore          4
					l++;
	//   46   75:iload_3         
	//   47   76:iconst_1        
	//   48   77:iadd            
	//   49   78:istore_3        
				} else
	//*  50   79:iload_2         
	//*  51   80:aload_0         
	//*  52   81:iload           4
	//*  53   83:invokevirtual   #581 <Method int getWidth(int)>
	//*  54   86:iadd            
	//*  55   87:istore_2        
	//*  56   88:iload_3         
	//*  57   89:iconst_1        
	//*  58   90:iadd            
	//*  59   91:istore_3        
	//*  60   92:goto            49
				{
					i1 = ((int) (s.charAt(l)));
	//   61   95:aload_1         
	//   62   96:iload_3         
	//   63   97:invokevirtual   #523 <Method char String.charAt(int)>
	//   64  100:istore          4
				}
				j += getWidth(i1);
				l++;
			} while(true);
	//   65  102:goto            79
		}
		return i1;
	//   66  105:iload           4
	//   67  107:ireturn         
	}

	public boolean hasKernPairs()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isIdentity()
	{
		return cidDirect;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean cidDirect>
	//    2    4:ireturn         
	}

	public boolean setCharAdvance(int i, int j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean setKerning(int i, int j, int k)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setPostscriptFontName(String s)
	{
		fontName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field String fontName>
	//    3    5:return          
	}

	void writeFont(PdfWriter pdfwriter, PdfIndirectReference pdfindirectreference, Object aobj[])
		throws DocumentException, IOException
	{
		Object obj = ((Object) ((IntHashtable)aobj[0]));
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:checkcast       #184 <Class IntHashtable>
	//    4    6:astore          4
		aobj = null;
	//    5    8:aconst_null     
	//    6    9:astore_3        
		PdfDictionary pdfdictionary = getFontDescriptor();
	//    7   10:aload_0         
	//    8   11:invokespecial   #592 <Method PdfDictionary getFontDescriptor()>
	//    9   14:astore          5
		if(pdfdictionary != null)
	//*  10   16:aload           5
	//*  11   18:ifnull          31
			aobj = ((Object []) (pdfwriter.addToBody(((PdfObject) (pdfdictionary))).getIndirectReference()));
	//   12   21:aload_1         
	//   13   22:aload           5
	//   14   24:invokevirtual   #598 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   15   27:invokevirtual   #604 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   16   30:astore_3        
		obj = ((Object) (getCIDFont(((PdfIndirectReference) (aobj)), ((IntHashtable) (obj)))));
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:aload           4
	//   20   35:invokespecial   #606 <Method PdfDictionary getCIDFont(PdfIndirectReference, IntHashtable)>
	//   21   38:astore          4
		if(obj != null)
	//*  22   40:aload           4
	//*  23   42:ifnull          55
			aobj = ((Object []) (pdfwriter.addToBody(((PdfObject) (obj))).getIndirectReference()));
	//   24   45:aload_1         
	//   25   46:aload           4
	//   26   48:invokevirtual   #598 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   27   51:invokevirtual   #604 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   28   54:astore_3        
		pdfwriter.addToBody(((PdfObject) (getFontBaseType(((PdfIndirectReference) (aobj))))), pdfindirectreference);
	//   29   55:aload_1         
	//   30   56:aload_0         
	//   31   57:aload_3         
	//   32   58:invokespecial   #608 <Method PdfDictionary getFontBaseType(PdfIndirectReference)>
	//   33   61:aload_2         
	//   34   62:invokevirtual   #611 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//   35   65:pop             
	//   36   66:return          
	}

	private static final int BRACKET = 1;
	static final String CJK_ENCODING = "UnicodeBigUnmarked";
	private static final int FIRST = 0;
	public static final String RESOURCE_PATH_CMAP = "com/itextpdf/text/pdf/fonts/cmaps/";
	private static final int SERIAL = 2;
	private static final int V1Y = 880;
	private static final HashMap allFonts = new HashMap();
	static Properties cjkEncodings = new Properties();
	static Properties cjkFonts = new Properties();
	private static boolean propertiesLoaded = false;
	private static final HashMap registryNames = new HashMap();
	private String CMap;
	private CMapCidByte cidByte;
	private boolean cidDirect;
	private CMapCidUni cidUni;
	private HashMap fontDesc;
	private String fontName;
	private IntHashtable hMetrics;
	private String style;
	private CMapUniCid uniCid;
	private String uniMap;
	private IntHashtable vMetrics;

	static 
	{
	//    0    0:new             #50  <Class Properties>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void Properties()>
	//    3    7:putstatic       #55  <Field Properties cjkFonts>
	//    4   10:new             #50  <Class Properties>
	//    5   13:dup             
	//    6   14:invokespecial   #53  <Method void Properties()>
	//    7   17:putstatic       #57  <Field Properties cjkEncodings>
	//    8   20:new             #59  <Class HashMap>
	//    9   23:dup             
	//   10   24:invokespecial   #60  <Method void HashMap()>
	//   11   27:putstatic       #62  <Field HashMap allFonts>
	//   12   30:iconst_0        
	//   13   31:putstatic       #64  <Field boolean propertiesLoaded>
	//   14   34:new             #59  <Class HashMap>
	//   15   37:dup             
	//   16   38:invokespecial   #60  <Method void HashMap()>
	//   17   41:putstatic       #66  <Field HashMap registryNames>
	//*  18   44:return          
	}
}
