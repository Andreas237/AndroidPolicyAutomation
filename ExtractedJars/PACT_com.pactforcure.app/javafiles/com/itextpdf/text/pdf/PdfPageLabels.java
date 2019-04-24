// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.factories.RomanAlphabetFactory;
import com.itextpdf.text.factories.RomanNumberFactory;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfReader, PdfDictionary, PdfNumberTree, 
//			PdfObject, PdfNumber, PdfString, PdfWriter

public class PdfPageLabels
{
	public static class PdfPageLabelFormat
	{

		public String toString()
		{
			return String.format("Physical page %s: style: %s; prefix '%s'; logical page: %s", new Object[] {
				Integer.valueOf(physicalPage), Integer.valueOf(numberStyle), prefix, Integer.valueOf(logicalPage)
			});
		//    0    0:ldc1            #31  <String "Physical page %s: style: %s; prefix '%s'; logical page: %s">
		//    1    2:iconst_4        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:getfield        #20  <Field int physicalPage>
		//    7   12:invokestatic    #37  <Method Integer Integer.valueOf(int)>
		//    8   15:aastore         
		//    9   16:dup             
		//   10   17:iconst_1        
		//   11   18:aload_0         
		//   12   19:getfield        #22  <Field int numberStyle>
		//   13   22:invokestatic    #37  <Method Integer Integer.valueOf(int)>
		//   14   25:aastore         
		//   15   26:dup             
		//   16   27:iconst_2        
		//   17   28:aload_0         
		//   18   29:getfield        #24  <Field String prefix>
		//   19   32:aastore         
		//   20   33:dup             
		//   21   34:iconst_3        
		//   22   35:aload_0         
		//   23   36:getfield        #26  <Field int logicalPage>
		//   24   39:invokestatic    #37  <Method Integer Integer.valueOf(int)>
		//   25   42:aastore         
		//   26   43:invokestatic    #43  <Method String String.format(String, Object[])>
		//   27   46:areturn         
		}

		public int logicalPage;
		public int numberStyle;
		public int physicalPage;
		public String prefix;

		public PdfPageLabelFormat(int i, int j, String s, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			physicalPage = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int physicalPage>
			numberStyle = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int numberStyle>
			prefix = s;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field String prefix>
			logicalPage = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #26  <Field int logicalPage>
		//   14   25:return          
		}
	}


	public PdfPageLabels()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		map = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #54  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #55  <Method void HashMap()>
	//    6   12:putfield        #57  <Field HashMap map>
		addPageLabel(1, 0, ((String) (null)), 1);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:iconst_0        
	//   10   18:aconst_null     
	//   11   19:iconst_1        
	//   12   20:invokevirtual   #61  <Method void addPageLabel(int, int, String, int)>
	//   13   23:return          
	}

	public static PdfPageLabelFormat[] getPageLabelFormats(PdfReader pdfreader)
	{
		pdfreader = ((PdfReader) ((PdfDictionary)PdfReader.getPdfObjectRelease(pdfreader.getCatalog().get(PdfName.PAGELABELS))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method PdfDictionary PdfReader.getCatalog()>
	//    2    4:getstatic       #72  <Field PdfName PdfName.PAGELABELS>
	//    3    7:invokevirtual   #78  <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:invokestatic    #82  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    5   13:checkcast       #74  <Class PdfDictionary>
	//    6   16:astore_0        
		if(pdfreader != null) goto _L2; else goto _L1
	//    7   17:aload_0         
	//    8   18:ifnonnull       25
_L1:
		pdfreader = null;
	//    9   21:aconst_null     
	//   10   22:astore_0        
_L4:
		return ((PdfPageLabelFormat []) (pdfreader));
	//   11   23:aload_0         
	//   12   24:areturn         
_L2:
		int j;
		PdfPageLabelFormat apdfpagelabelformat[];
		HashMap hashmap;
		Integer ainteger[];
		hashmap = PdfNumberTree.readTree(((PdfDictionary) (pdfreader)));
	//   13   25:aload_0         
	//   14   26:invokestatic    #88  <Method HashMap PdfNumberTree.readTree(PdfDictionary)>
	//   15   29:astore          5
		pdfreader = ((PdfReader) (new Integer[hashmap.size()]));
	//   16   31:aload           5
	//   17   33:invokevirtual   #92  <Method int HashMap.size()>
	//   18   36:anewarray       Integer[]
	//   19   39:astore_0        
		ainteger = (Integer[])hashmap.keySet().toArray(((Object []) (pdfreader)));
	//   20   40:aload           5
	//   21   42:invokevirtual   #98  <Method Set HashMap.keySet()>
	//   22   45:aload_0         
	//   23   46:invokeinterface #104 <Method Object[] Set.toArray(Object[])>
	//   24   51:checkcast       #106 <Class Integer[]>
	//   25   54:astore          6
		Arrays.sort(((Object []) (ainteger)));
	//   26   56:aload           6
	//   27   58:invokestatic    #112 <Method void Arrays.sort(Object[])>
		apdfpagelabelformat = new PdfPageLabelFormat[hashmap.size()];
	//   28   61:aload           5
	//   29   63:invokevirtual   #92  <Method int HashMap.size()>
	//   30   66:anewarray       PdfPageLabelFormat[]
	//   31   69:astore          4
		j = 0;
	//   32   71:iconst_0        
	//   33   72:istore_2        
_L10:
		pdfreader = ((PdfReader) (apdfpagelabelformat));
	//   34   73:aload           4
	//   35   75:astore_0        
		if(j >= ainteger.length) goto _L4; else goto _L3
	//   36   76:iload_2         
	//   37   77:aload           6
	//   38   79:arraylength     
	//   39   80:icmpge          23
_L3:
		int i;
		Integer integer = ainteger[j];
	//   40   83:aload           6
	//   41   85:iload_2         
	//   42   86:aaload          
	//   43   87:astore          7
		PdfDictionary pdfdictionary = (PdfDictionary)PdfReader.getPdfObjectRelease((PdfObject)hashmap.get(((Object) (integer))));
	//   44   89:aload           5
	//   45   91:aload           7
	//   46   93:invokevirtual   #115 <Method Object HashMap.get(Object)>
	//   47   96:checkcast       #117 <Class PdfObject>
	//   48   99:invokestatic    #82  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   49  102:checkcast       #74  <Class PdfDictionary>
	//   50  105:astore          8
		int k;
		if(pdfdictionary.contains(PdfName.ST))
	//*  51  107:aload           8
	//*  52  109:getstatic       #120 <Field PdfName PdfName.ST>
	//*  53  112:invokevirtual   #124 <Method boolean PdfDictionary.contains(PdfName)>
	//*  54  115:ifeq            262
			k = ((PdfNumber)pdfdictionary.get(PdfName.ST)).intValue();
	//   55  118:aload           8
	//   56  120:getstatic       #120 <Field PdfName PdfName.ST>
	//   57  123:invokevirtual   #78  <Method PdfObject PdfDictionary.get(PdfName)>
	//   58  126:checkcast       #126 <Class PdfNumber>
	//   59  129:invokevirtual   #129 <Method int PdfNumber.intValue()>
	//   60  132:istore_3        
		else
	//*  61  133:aload           8
	//*  62  135:getstatic       #132 <Field PdfName PdfName.P>
	//*  63  138:invokevirtual   #124 <Method boolean PdfDictionary.contains(PdfName)>
	//*  64  141:ifeq            267
	//*  65  144:aload           8
	//*  66  146:getstatic       #132 <Field PdfName PdfName.P>
	//*  67  149:invokevirtual   #78  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  68  152:checkcast       #134 <Class PdfString>
	//*  69  155:invokevirtual   #138 <Method String PdfString.toUnicodeString()>
	//*  70  158:astore_0        
	//*  71  159:aload           8
	//*  72  161:getstatic       #141 <Field PdfName PdfName.S>
	//*  73  164:invokevirtual   #124 <Method boolean PdfDictionary.contains(PdfName)>
	//*  74  167:ifeq            293
	//*  75  170:aload           8
	//*  76  172:getstatic       #141 <Field PdfName PdfName.S>
	//*  77  175:invokevirtual   #78  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  78  178:checkcast       #29  <Class PdfName>
	//*  79  181:invokevirtual   #144 <Method String PdfName.toString()>
	//*  80  184:iconst_1        
	//*  81  185:invokevirtual   #150 <Method char String.charAt(int)>
	//*  82  188:lookupswitch    4: default 232
	//	               65: 283
	//	               82: 273
	//	               97: 288
	//	               114: 278
	//*  83  232:iconst_0        
	//*  84  233:istore_1        
	//*  85  234:aload           4
	//*  86  236:iload_2         
	//*  87  237:new             #6   <Class PdfPageLabels$PdfPageLabelFormat>
	//*  88  240:dup             
	//*  89  241:aload           7
	//*  90  243:invokevirtual   #151 <Method int Integer.intValue()>
	//*  91  246:iconst_1        
	//*  92  247:iadd            
	//*  93  248:iload_1         
	//*  94  249:aload_0         
	//*  95  250:iload_3         
	//*  96  251:invokespecial   #153 <Method void PdfPageLabels$PdfPageLabelFormat(int, int, String, int)>
	//*  97  254:aastore         
	//*  98  255:iload_2         
	//*  99  256:iconst_1        
	//* 100  257:iadd            
	//* 101  258:istore_2        
	//* 102  259:goto            73
			k = 1;
	//  103  262:iconst_1        
	//  104  263:istore_3        
		if(pdfdictionary.contains(PdfName.P))
			pdfreader = ((PdfReader) (((PdfString)pdfdictionary.get(PdfName.P)).toUnicodeString()));
		else
	//* 105  264:goto            133
			pdfreader = "";
	//  106  267:ldc1            #155 <String "">
	//  107  269:astore_0        
		if(!pdfdictionary.contains(PdfName.S))
			break MISSING_BLOCK_LABEL_293;
		((PdfName)pdfdictionary.get(PdfName.S)).toString().charAt(1);
		JVM INSTR lookupswitch 4: default 232
	//	               65: 283
	//	               82: 273
	//	               97: 288
	//	               114: 278;
		   goto _L5 _L6 _L7 _L8 _L9
_L5:
		i = 0;
_L11:
		apdfpagelabelformat[j] = new PdfPageLabelFormat(integer.intValue() + 1, i, ((String) (pdfreader)), k);
		j++;
		  goto _L10
	//* 108  270:goto            159
_L7:
		i = 1;
	//  109  273:iconst_1        
	//  110  274:istore_1        
		  goto _L11
	//* 111  275:goto            234
_L9:
		i = 2;
	//  112  278:iconst_2        
	//  113  279:istore_1        
		  goto _L11
	//* 114  280:goto            234
_L6:
		i = 3;
	//  115  283:iconst_3        
	//  116  284:istore_1        
		  goto _L11
	//* 117  285:goto            234
_L8:
		i = 4;
	//  118  288:iconst_4        
	//  119  289:istore_1        
		  goto _L11
	//* 120  290:goto            234
		i = 5;
	//  121  293:iconst_5        
	//  122  294:istore_1        
		  goto _L11
	//* 123  295:goto            234
	}

	public static String[] getPageLabels(PdfReader pdfreader)
	{
		int k;
		k = pdfreader.getNumberOfPages();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method int PdfReader.getNumberOfPages()>
	//    2    4:istore          4
		pdfreader = ((PdfReader) ((PdfDictionary)PdfReader.getPdfObjectRelease(pdfreader.getCatalog().get(PdfName.PAGELABELS))));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #69  <Method PdfDictionary PdfReader.getCatalog()>
	//    5   10:getstatic       #72  <Field PdfName PdfName.PAGELABELS>
	//    6   13:invokevirtual   #78  <Method PdfObject PdfDictionary.get(PdfName)>
	//    7   16:invokestatic    #82  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    8   19:checkcast       #74  <Class PdfDictionary>
	//    9   22:astore_0        
		if(pdfreader != null) goto _L2; else goto _L1
	//   10   23:aload_0         
	//   11   24:ifnonnull       33
_L1:
		String as[] = null;
	//   12   27:aconst_null     
	//   13   28:astore          5
_L4:
		return as;
	//   14   30:aload           5
	//   15   32:areturn         
_L2:
		char c;
		int i;
		int j;
		String as1[];
		HashMap hashmap;
		as1 = new String[k];
	//   16   33:iload           4
	//   17   35:anewarray       String[]
	//   18   38:astore          6
		hashmap = PdfNumberTree.readTree(((PdfDictionary) (pdfreader)));
	//   19   40:aload_0         
	//   20   41:invokestatic    #88  <Method HashMap PdfNumberTree.readTree(PdfDictionary)>
	//   21   44:astore          7
		i = 1;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		pdfreader = "";
	//   24   48:ldc1            #155 <String "">
	//   25   50:astore_0        
		c = 'D';
	//   26   51:bipush          68
	//   27   53:istore_1        
		j = 0;
	//   28   54:iconst_0        
	//   29   55:istore_3        
_L11:
		as = as1;
	//   30   56:aload           6
	//   31   58:astore          5
		if(j >= k) goto _L4; else goto _L3
	//   32   60:iload_3         
	//   33   61:iload           4
	//   34   63:icmpge          30
_L3:
		Object obj = ((Object) (Integer.valueOf(j)));
	//   35   66:iload_3         
	//   36   67:invokestatic    #164 <Method Integer Integer.valueOf(int)>
	//   37   70:astore          5
		if(hashmap.containsKey(obj))
	//*  38   72:aload           7
	//*  39   74:aload           5
	//*  40   76:invokevirtual   #168 <Method boolean HashMap.containsKey(Object)>
	//*  41   79:ifeq            182
		{
			obj = ((Object) ((PdfDictionary)PdfReader.getPdfObjectRelease((PdfObject)hashmap.get(obj))));
	//   42   82:aload           7
	//   43   84:aload           5
	//   44   86:invokevirtual   #115 <Method Object HashMap.get(Object)>
	//   45   89:checkcast       #117 <Class PdfObject>
	//   46   92:invokestatic    #82  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   47   95:checkcast       #74  <Class PdfDictionary>
	//   48   98:astore          5
			if(((PdfDictionary) (obj)).contains(PdfName.ST))
	//*  49  100:aload           5
	//*  50  102:getstatic       #120 <Field PdfName PdfName.ST>
	//*  51  105:invokevirtual   #124 <Method boolean PdfDictionary.contains(PdfName)>
	//*  52  108:ifeq            265
				i = ((PdfNumber)((PdfDictionary) (obj)).get(PdfName.ST)).intValue();
	//   53  111:aload           5
	//   54  113:getstatic       #120 <Field PdfName PdfName.ST>
	//   55  116:invokevirtual   #78  <Method PdfObject PdfDictionary.get(PdfName)>
	//   56  119:checkcast       #126 <Class PdfNumber>
	//   57  122:invokevirtual   #129 <Method int PdfNumber.intValue()>
	//   58  125:istore_2        
			else
	//*  59  126:aload           5
	//*  60  128:getstatic       #132 <Field PdfName PdfName.P>
	//*  61  131:invokevirtual   #124 <Method boolean PdfDictionary.contains(PdfName)>
	//*  62  134:ifeq            270
	//*  63  137:aload           5
	//*  64  139:getstatic       #132 <Field PdfName PdfName.P>
	//*  65  142:invokevirtual   #78  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  66  145:checkcast       #134 <Class PdfString>
	//*  67  148:invokevirtual   #138 <Method String PdfString.toUnicodeString()>
	//*  68  151:astore_0        
	//*  69  152:aload           5
	//*  70  154:getstatic       #141 <Field PdfName PdfName.S>
	//*  71  157:invokevirtual   #124 <Method boolean PdfDictionary.contains(PdfName)>
	//*  72  160:ifeq            276
	//*  73  163:aload           5
	//*  74  165:getstatic       #141 <Field PdfName PdfName.S>
	//*  75  168:invokevirtual   #78  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  76  171:checkcast       #29  <Class PdfName>
	//*  77  174:invokevirtual   #144 <Method String PdfName.toString()>
	//*  78  177:iconst_1        
	//*  79  178:invokevirtual   #150 <Method char String.charAt(int)>
	//*  80  181:istore_1        
	//*  81  182:iload_1         
	//*  82  183:lookupswitch    5: default 232
	//	               65: 338
	//	               82: 282
	//	               97: 366
	//	               101: 394
	//	               114: 310
	//*  83  232:aload           6
	//*  84  234:iload_3         
	//*  85  235:new             #170 <Class StringBuilder>
	//*  86  238:dup             
	//*  87  239:invokespecial   #171 <Method void StringBuilder()>
	//*  88  242:aload_0         
	//*  89  243:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//*  90  246:iload_2         
	//*  91  247:invokevirtual   #178 <Method StringBuilder StringBuilder.append(int)>
	//*  92  250:invokevirtual   #179 <Method String StringBuilder.toString()>
	//*  93  253:aastore         
	//*  94  254:iload_2         
	//*  95  255:iconst_1        
	//*  96  256:iadd            
	//*  97  257:istore_2        
	//*  98  258:iload_3         
	//*  99  259:iconst_1        
	//* 100  260:iadd            
	//* 101  261:istore_3        
	//* 102  262:goto            56
				i = 1;
	//  103  265:iconst_1        
	//  104  266:istore_2        
			if(((PdfDictionary) (obj)).contains(PdfName.P))
				pdfreader = ((PdfReader) (((PdfString)((PdfDictionary) (obj)).get(PdfName.P)).toUnicodeString()));
			else
	//* 105  267:goto            126
				pdfreader = "";
	//  106  270:ldc1            #155 <String "">
	//  107  272:astore_0        
			if(((PdfDictionary) (obj)).contains(PdfName.S))
				c = ((PdfName)((PdfDictionary) (obj)).get(PdfName.S)).toString().charAt(1);
			else
	//* 108  273:goto            152
				c = 'e';
	//  109  276:bipush          101
	//  110  278:istore_1        
		}
		c;
		JVM INSTR lookupswitch 5: default 232
	//	               65: 338
	//	               82: 282
	//	               97: 366
	//	               101: 394
	//	               114: 310;
		   goto _L5 _L6 _L7 _L8 _L9 _L10
_L9:
		break MISSING_BLOCK_LABEL_394;
_L5:
		as1[j] = (new StringBuilder()).append(((String) (pdfreader))).append(i).toString();
_L12:
		i++;
		j++;
		  goto _L11
	//* 111  279:goto            182
_L7:
		as1[j] = (new StringBuilder()).append(((String) (pdfreader))).append(RomanNumberFactory.getUpperCaseString(i)).toString();
	//  112  282:aload           6
	//  113  284:iload_3         
	//  114  285:new             #170 <Class StringBuilder>
	//  115  288:dup             
	//  116  289:invokespecial   #171 <Method void StringBuilder()>
	//  117  292:aload_0         
	//  118  293:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  119  296:iload_2         
	//  120  297:invokestatic    #185 <Method String RomanNumberFactory.getUpperCaseString(int)>
	//  121  300:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  122  303:invokevirtual   #179 <Method String StringBuilder.toString()>
	//  123  306:aastore         
		  goto _L12
	//* 124  307:goto            254
_L10:
		as1[j] = (new StringBuilder()).append(((String) (pdfreader))).append(RomanNumberFactory.getLowerCaseString(i)).toString();
	//  125  310:aload           6
	//  126  312:iload_3         
	//  127  313:new             #170 <Class StringBuilder>
	//  128  316:dup             
	//  129  317:invokespecial   #171 <Method void StringBuilder()>
	//  130  320:aload_0         
	//  131  321:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  132  324:iload_2         
	//  133  325:invokestatic    #188 <Method String RomanNumberFactory.getLowerCaseString(int)>
	//  134  328:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  135  331:invokevirtual   #179 <Method String StringBuilder.toString()>
	//  136  334:aastore         
		  goto _L12
	//* 137  335:goto            254
_L6:
		as1[j] = (new StringBuilder()).append(((String) (pdfreader))).append(RomanAlphabetFactory.getUpperCaseString(i)).toString();
	//  138  338:aload           6
	//  139  340:iload_3         
	//  140  341:new             #170 <Class StringBuilder>
	//  141  344:dup             
	//  142  345:invokespecial   #171 <Method void StringBuilder()>
	//  143  348:aload_0         
	//  144  349:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  145  352:iload_2         
	//  146  353:invokestatic    #191 <Method String RomanAlphabetFactory.getUpperCaseString(int)>
	//  147  356:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  148  359:invokevirtual   #179 <Method String StringBuilder.toString()>
	//  149  362:aastore         
		  goto _L12
	//* 150  363:goto            254
_L8:
		as1[j] = (new StringBuilder()).append(((String) (pdfreader))).append(RomanAlphabetFactory.getLowerCaseString(i)).toString();
	//  151  366:aload           6
	//  152  368:iload_3         
	//  153  369:new             #170 <Class StringBuilder>
	//  154  372:dup             
	//  155  373:invokespecial   #171 <Method void StringBuilder()>
	//  156  376:aload_0         
	//  157  377:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  158  380:iload_2         
	//  159  381:invokestatic    #192 <Method String RomanAlphabetFactory.getLowerCaseString(int)>
	//  160  384:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  161  387:invokevirtual   #179 <Method String StringBuilder.toString()>
	//  162  390:aastore         
		  goto _L12
	//* 163  391:goto            254
		as1[j] = ((String) (pdfreader));
	//  164  394:aload           6
	//  165  396:iload_3         
	//  166  397:aload_0         
	//  167  398:aastore         
		  goto _L12
	//* 168  399:goto            254
	}

	public void addPageLabel(int i, int j)
	{
		addPageLabel(i, j, ((String) (null)), 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_1        
	//    5    5:invokevirtual   #61  <Method void addPageLabel(int, int, String, int)>
	//    6    8:return          
	}

	public void addPageLabel(int i, int j, String s)
	{
		addPageLabel(i, j, s, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokevirtual   #61  <Method void addPageLabel(int, int, String, int)>
	//    6    8:return          
	}

	public void addPageLabel(int i, int j, String s, int k)
	{
		if(i < 1 || k < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          11
	//*   3    5:iload           4
	//*   4    7:iconst_1        
	//*   5    8:icmpge          28
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("in.a.page.label.the.page.numbers.must.be.greater.or.equal.to.1", new Object[0]));
	//    6   11:new             #196 <Class IllegalArgumentException>
	//    7   14:dup             
	//    8   15:ldc1            #198 <String "in.a.page.label.the.page.numbers.must.be.greater.or.equal.to.1">
	//    9   17:iconst_0        
	//   10   18:anewarray       Object[]
	//   11   21:invokestatic    #204 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   12   24:invokespecial   #205 <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		PdfDictionary pdfdictionary = new PdfDictionary();
	//   14   28:new             #74  <Class PdfDictionary>
	//   15   31:dup             
	//   16   32:invokespecial   #206 <Method void PdfDictionary()>
	//   17   35:astore          5
		if(j >= 0 && j < numberingStyle.length)
	//*  18   37:iload_2         
	//*  19   38:iflt            62
	//*  20   41:iload_2         
	//*  21   42:getstatic       #49  <Field PdfName[] numberingStyle>
	//*  22   45:arraylength     
	//*  23   46:icmpge          62
			pdfdictionary.put(PdfName.S, ((PdfObject) (numberingStyle[j])));
	//   24   49:aload           5
	//   25   51:getstatic       #141 <Field PdfName PdfName.S>
	//   26   54:getstatic       #49  <Field PdfName[] numberingStyle>
	//   27   57:iload_2         
	//   28   58:aaload          
	//   29   59:invokevirtual   #210 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(s != null)
	//*  30   62:aload_3         
	//*  31   63:ifnull          84
			pdfdictionary.put(PdfName.P, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//   32   66:aload           5
	//   33   68:getstatic       #132 <Field PdfName PdfName.P>
	//   34   71:new             #134 <Class PdfString>
	//   35   74:dup             
	//   36   75:aload_3         
	//   37   76:ldc1            #212 <String "UnicodeBig">
	//   38   78:invokespecial   #215 <Method void PdfString(String, String)>
	//   39   81:invokevirtual   #210 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(k != 1)
	//*  40   84:iload           4
	//*  41   86:iconst_1        
	//*  42   87:icmpeq          107
			pdfdictionary.put(PdfName.ST, ((PdfObject) (new PdfNumber(k))));
	//   43   90:aload           5
	//   44   92:getstatic       #120 <Field PdfName PdfName.ST>
	//   45   95:new             #126 <Class PdfNumber>
	//   46   98:dup             
	//   47   99:iload           4
	//   48  101:invokespecial   #218 <Method void PdfNumber(int)>
	//   49  104:invokevirtual   #210 <Method void PdfDictionary.put(PdfName, PdfObject)>
		map.put(((Object) (Integer.valueOf(i - 1))), ((Object) (pdfdictionary)));
	//   50  107:aload_0         
	//   51  108:getfield        #57  <Field HashMap map>
	//   52  111:iload_1         
	//   53  112:iconst_1        
	//   54  113:isub            
	//   55  114:invokestatic    #164 <Method Integer Integer.valueOf(int)>
	//   56  117:aload           5
	//   57  119:invokevirtual   #221 <Method Object HashMap.put(Object, Object)>
	//   58  122:pop             
	//   59  123:return          
	}

	public void addPageLabel(int i, int j, String s, int k, boolean flag)
	{
		if(i < 1 || k < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          11
	//*   3    5:iload           4
	//*   4    7:iconst_1        
	//*   5    8:icmpge          28
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("in.a.page.label.the.page.numbers.must.be.greater.or.equal.to.1", new Object[0]));
	//    6   11:new             #196 <Class IllegalArgumentException>
	//    7   14:dup             
	//    8   15:ldc1            #198 <String "in.a.page.label.the.page.numbers.must.be.greater.or.equal.to.1">
	//    9   17:iconst_0        
	//   10   18:anewarray       Object[]
	//   11   21:invokestatic    #204 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   12   24:invokespecial   #205 <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		PdfDictionary pdfdictionary = new PdfDictionary();
	//   14   28:new             #74  <Class PdfDictionary>
	//   15   31:dup             
	//   16   32:invokespecial   #206 <Method void PdfDictionary()>
	//   17   35:astore          6
		if(j >= 0 && j < numberingStyle.length)
	//*  18   37:iload_2         
	//*  19   38:iflt            62
	//*  20   41:iload_2         
	//*  21   42:getstatic       #49  <Field PdfName[] numberingStyle>
	//*  22   45:arraylength     
	//*  23   46:icmpge          62
			pdfdictionary.put(PdfName.S, ((PdfObject) (numberingStyle[j])));
	//   24   49:aload           6
	//   25   51:getstatic       #141 <Field PdfName PdfName.S>
	//   26   54:getstatic       #49  <Field PdfName[] numberingStyle>
	//   27   57:iload_2         
	//   28   58:aaload          
	//   29   59:invokevirtual   #210 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(s != null)
	//*  30   62:aload_3         
	//*  31   63:ifnull          84
			pdfdictionary.put(PdfName.P, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//   32   66:aload           6
	//   33   68:getstatic       #132 <Field PdfName PdfName.P>
	//   34   71:new             #134 <Class PdfString>
	//   35   74:dup             
	//   36   75:aload_3         
	//   37   76:ldc1            #212 <String "UnicodeBig">
	//   38   78:invokespecial   #215 <Method void PdfString(String, String)>
	//   39   81:invokevirtual   #210 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(k != 1 || flag)
	//*  40   84:iload           4
	//*  41   86:iconst_1        
	//*  42   87:icmpne          95
	//*  43   90:iload           5
	//*  44   92:ifeq            112
			pdfdictionary.put(PdfName.ST, ((PdfObject) (new PdfNumber(k))));
	//   45   95:aload           6
	//   46   97:getstatic       #120 <Field PdfName PdfName.ST>
	//   47  100:new             #126 <Class PdfNumber>
	//   48  103:dup             
	//   49  104:iload           4
	//   50  106:invokespecial   #218 <Method void PdfNumber(int)>
	//   51  109:invokevirtual   #210 <Method void PdfDictionary.put(PdfName, PdfObject)>
		map.put(((Object) (Integer.valueOf(i - 1))), ((Object) (pdfdictionary)));
	//   52  112:aload_0         
	//   53  113:getfield        #57  <Field HashMap map>
	//   54  116:iload_1         
	//   55  117:iconst_1        
	//   56  118:isub            
	//   57  119:invokestatic    #164 <Method Integer Integer.valueOf(int)>
	//   58  122:aload           6
	//   59  124:invokevirtual   #221 <Method Object HashMap.put(Object, Object)>
	//   60  127:pop             
	//   61  128:return          
	}

	public void addPageLabel(PdfPageLabelFormat pdfpagelabelformat)
	{
		addPageLabel(pdfpagelabelformat.physicalPage, pdfpagelabelformat.numberStyle, pdfpagelabelformat.prefix, pdfpagelabelformat.logicalPage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #226 <Field int PdfPageLabels$PdfPageLabelFormat.physicalPage>
	//    3    5:aload_1         
	//    4    6:getfield        #229 <Field int PdfPageLabels$PdfPageLabelFormat.numberStyle>
	//    5    9:aload_1         
	//    6   10:getfield        #233 <Field String PdfPageLabels$PdfPageLabelFormat.prefix>
	//    7   13:aload_1         
	//    8   14:getfield        #236 <Field int PdfPageLabels$PdfPageLabelFormat.logicalPage>
	//    9   17:invokevirtual   #61  <Method void addPageLabel(int, int, String, int)>
	//   10   20:return          
	}

	public PdfDictionary getDictionary(PdfWriter pdfwriter)
	{
		try
		{
			pdfwriter = ((PdfWriter) (PdfNumberTree.writeTree(map, pdfwriter)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field HashMap map>
	//    2    4:aload_1         
	//    3    5:invokestatic    #244 <Method PdfDictionary PdfNumberTree.writeTree(HashMap, PdfWriter)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(PdfWriter pdfwriter)
	//*   7   11:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfwriter)));
	//    8   12:new             #246 <Class ExceptionConverter>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #249 <Method void ExceptionConverter(Exception)>
	//   12   20:athrow          
		}
		return ((PdfDictionary) (pdfwriter));
	}

	public void removePageLabel(int i)
	{
		if(i <= 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpgt          6
		{
			return;
	//    3    5:return          
		} else
		{
			map.remove(((Object) (Integer.valueOf(i - 1))));
	//    4    6:aload_0         
	//    5    7:getfield        #57  <Field HashMap map>
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:invokestatic    #164 <Method Integer Integer.valueOf(int)>
	//   10   16:invokevirtual   #253 <Method Object HashMap.remove(Object)>
	//   11   19:pop             
			return;
	//   12   20:return          
		}
	}

	public static final int DECIMAL_ARABIC_NUMERALS = 0;
	public static final int EMPTY = 5;
	public static final int LOWERCASE_LETTERS = 4;
	public static final int LOWERCASE_ROMAN_NUMERALS = 2;
	public static final int UPPERCASE_LETTERS = 3;
	public static final int UPPERCASE_ROMAN_NUMERALS = 1;
	static PdfName numberingStyle[];
	private HashMap map;

	static 
	{
		numberingStyle = (new PdfName[] {
			PdfName.D, PdfName.R, new PdfName("r"), PdfName.A, new PdfName("a")
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       PdfName[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:getstatic       #33  <Field PdfName PdfName.D>
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:getstatic       #36  <Field PdfName PdfName.R>
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:new             #29  <Class PdfName>
	//   13   21:dup             
	//   14   22:ldc1            #38  <String "r">
	//   15   24:invokespecial   #42  <Method void PdfName(String)>
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:getstatic       #45  <Field PdfName PdfName.A>
	//   20   33:aastore         
	//   21   34:dup             
	//   22   35:iconst_4        
	//   23   36:new             #29  <Class PdfName>
	//   24   39:dup             
	//   25   40:ldc1            #47  <String "a">
	//   26   42:invokespecial   #42  <Method void PdfName(String)>
	//   27   45:aastore         
	//   28   46:putstatic       #49  <Field PdfName[] numberingStyle>
	//*  29   49:return          
	}
}
