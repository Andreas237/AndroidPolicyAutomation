// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.io.RandomAccessSourceFactory;
import com.itextpdf.text.pdf.fonts.cmaps.CMapParserEx;
import com.itextpdf.text.pdf.fonts.cmaps.CMapToUnicode;
import com.itextpdf.text.pdf.fonts.cmaps.CidLocationFromByte;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseFont, IntHashtable, PdfReader, PdfDictionary, 
//			PdfName, PdfString, PdfEncodings, PdfObject, 
//			GlyphList, PdfArray, PdfNumber, PdfContentParser, 
//			PRTokeniser, RandomAccessFileOrArray, CJKFont, PRStream, 
//			PRIndirectReference, PdfStream, PdfIndirectReference, PdfWriter

public class DocumentFont extends BaseFont
{

	DocumentFont(PRIndirectReference prindirectreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void BaseFont()>
		metrics = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #51  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void HashMap()>
	//    6   12:putfield        #54  <Field HashMap metrics>
		uni2byte = new IntHashtable();
	//    7   15:aload_0         
	//    8   16:new             #56  <Class IntHashtable>
	//    9   19:dup             
	//   10   20:invokespecial   #57  <Method void IntHashtable()>
	//   11   23:putfield        #59  <Field IntHashtable uni2byte>
		byte2uni = new IntHashtable();
	//   12   26:aload_0         
	//   13   27:new             #56  <Class IntHashtable>
	//   14   30:dup             
	//   15   31:invokespecial   #57  <Method void IntHashtable()>
	//   16   34:putfield        #61  <Field IntHashtable byte2uni>
		ascender = 800F;
	//   17   37:aload_0         
	//   18   38:ldc1            #62  <Float 800F>
	//   19   40:putfield        #64  <Field float ascender>
		capHeight = 700F;
	//   20   43:aload_0         
	//   21   44:ldc1            #65  <Float 700F>
	//   22   46:putfield        #67  <Field float capHeight>
		descender = -200F;
	//   23   49:aload_0         
	//   24   50:ldc1            #68  <Float -200F>
	//   25   52:putfield        #70  <Field float descender>
		italicAngle = 0.0F;
	//   26   55:aload_0         
	//   27   56:fconst_0        
	//   28   57:putfield        #72  <Field float italicAngle>
		fontWeight = 0.0F;
	//   29   60:aload_0         
	//   30   61:fconst_0        
	//   31   62:putfield        #74  <Field float fontWeight>
		llx = -50F;
	//   32   65:aload_0         
	//   33   66:ldc1            #75  <Float -50F>
	//   34   68:putfield        #77  <Field float llx>
		lly = -200F;
	//   35   71:aload_0         
	//   36   72:ldc1            #68  <Float -200F>
	//   37   74:putfield        #79  <Field float lly>
		urx = 100F;
	//   38   77:aload_0         
	//   39   78:ldc1            #80  <Float 100F>
	//   40   80:putfield        #82  <Field float urx>
		ury = 900F;
	//   41   83:aload_0         
	//   42   84:ldc1            #83  <Float 900F>
	//   43   86:putfield        #85  <Field float ury>
		isType0 = false;
	//   44   89:aload_0         
	//   45   90:iconst_0        
	//   46   91:putfield        #87  <Field boolean isType0>
		defaultWidth = 1000;
	//   47   94:aload_0         
	//   48   95:sipush          1000
	//   49   98:putfield        #89  <Field int defaultWidth>
		refFont = prindirectreference;
	//   50  101:aload_0         
	//   51  102:aload_1         
	//   52  103:putfield        #91  <Field PRIndirectReference refFont>
		font = (PdfDictionary)PdfReader.getPdfObject(((PdfObject) (prindirectreference)));
	//   53  106:aload_0         
	//   54  107:aload_1         
	//   55  108:invokestatic    #97  <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   56  111:checkcast       #99  <Class PdfDictionary>
	//   57  114:putfield        #101 <Field PdfDictionary font>
		init();
	//   58  117:aload_0         
	//   59  118:invokespecial   #104 <Method void init()>
	//   60  121:return          
	}

	DocumentFont(PRIndirectReference prindirectreference, PdfDictionary pdfdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void BaseFont()>
		metrics = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #51  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void HashMap()>
	//    6   12:putfield        #54  <Field HashMap metrics>
		uni2byte = new IntHashtable();
	//    7   15:aload_0         
	//    8   16:new             #56  <Class IntHashtable>
	//    9   19:dup             
	//   10   20:invokespecial   #57  <Method void IntHashtable()>
	//   11   23:putfield        #59  <Field IntHashtable uni2byte>
		byte2uni = new IntHashtable();
	//   12   26:aload_0         
	//   13   27:new             #56  <Class IntHashtable>
	//   14   30:dup             
	//   15   31:invokespecial   #57  <Method void IntHashtable()>
	//   16   34:putfield        #61  <Field IntHashtable byte2uni>
		ascender = 800F;
	//   17   37:aload_0         
	//   18   38:ldc1            #62  <Float 800F>
	//   19   40:putfield        #64  <Field float ascender>
		capHeight = 700F;
	//   20   43:aload_0         
	//   21   44:ldc1            #65  <Float 700F>
	//   22   46:putfield        #67  <Field float capHeight>
		descender = -200F;
	//   23   49:aload_0         
	//   24   50:ldc1            #68  <Float -200F>
	//   25   52:putfield        #70  <Field float descender>
		italicAngle = 0.0F;
	//   26   55:aload_0         
	//   27   56:fconst_0        
	//   28   57:putfield        #72  <Field float italicAngle>
		fontWeight = 0.0F;
	//   29   60:aload_0         
	//   30   61:fconst_0        
	//   31   62:putfield        #74  <Field float fontWeight>
		llx = -50F;
	//   32   65:aload_0         
	//   33   66:ldc1            #75  <Float -50F>
	//   34   68:putfield        #77  <Field float llx>
		lly = -200F;
	//   35   71:aload_0         
	//   36   72:ldc1            #68  <Float -200F>
	//   37   74:putfield        #79  <Field float lly>
		urx = 100F;
	//   38   77:aload_0         
	//   39   78:ldc1            #80  <Float 100F>
	//   40   80:putfield        #82  <Field float urx>
		ury = 900F;
	//   41   83:aload_0         
	//   42   84:ldc1            #83  <Float 900F>
	//   43   86:putfield        #85  <Field float ury>
		isType0 = false;
	//   44   89:aload_0         
	//   45   90:iconst_0        
	//   46   91:putfield        #87  <Field boolean isType0>
		defaultWidth = 1000;
	//   47   94:aload_0         
	//   48   95:sipush          1000
	//   49   98:putfield        #89  <Field int defaultWidth>
		refFont = prindirectreference;
	//   50  101:aload_0         
	//   51  102:aload_1         
	//   52  103:putfield        #91  <Field PRIndirectReference refFont>
		font = (PdfDictionary)PdfReader.getPdfObject(((PdfObject) (prindirectreference)));
	//   53  106:aload_0         
	//   54  107:aload_1         
	//   55  108:invokestatic    #97  <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   56  111:checkcast       #99  <Class PdfDictionary>
	//   57  114:putfield        #101 <Field PdfDictionary font>
		if(font.get(PdfName.ENCODING) == null && pdfdictionary != null)
	//*  58  117:aload_0         
	//*  59  118:getfield        #101 <Field PdfDictionary font>
	//*  60  121:getstatic       #111 <Field PdfName PdfName.ENCODING>
	//*  61  124:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  62  127:ifnonnull       181
	//*  63  130:aload_2         
	//*  64  131:ifnull          181
		{
			PdfName pdfname;
			for(prindirectreference = ((PRIndirectReference) (pdfdictionary.getKeys().iterator())); ((Iterator) (prindirectreference)).hasNext(); font.put(PdfName.ENCODING, pdfdictionary.get(pdfname)))
	//*  65  134:aload_2         
	//*  66  135:invokevirtual   #119 <Method Set PdfDictionary.getKeys()>
	//*  67  138:invokeinterface #125 <Method Iterator Set.iterator()>
	//*  68  143:astore_1        
	//*  69  144:aload_1         
	//*  70  145:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//*  71  150:ifeq            181
				pdfname = (PdfName)((Iterator) (prindirectreference)).next();
	//   72  153:aload_1         
	//   73  154:invokeinterface #135 <Method Object Iterator.next()>
	//   74  159:checkcast       #107 <Class PdfName>
	//   75  162:astore_3        

	//   76  163:aload_0         
	//   77  164:getfield        #101 <Field PdfDictionary font>
	//   78  167:getstatic       #111 <Field PdfName PdfName.ENCODING>
	//   79  170:aload_2         
	//   80  171:aload_3         
	//   81  172:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//   82  175:invokevirtual   #139 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
	//*  83  178:goto            144
		init();
	//   84  181:aload_0         
	//   85  182:invokespecial   #104 <Method void init()>
	//   86  185:return          
	}

	DocumentFont(PdfDictionary pdfdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void BaseFont()>
		metrics = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #51  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void HashMap()>
	//    6   12:putfield        #54  <Field HashMap metrics>
		uni2byte = new IntHashtable();
	//    7   15:aload_0         
	//    8   16:new             #56  <Class IntHashtable>
	//    9   19:dup             
	//   10   20:invokespecial   #57  <Method void IntHashtable()>
	//   11   23:putfield        #59  <Field IntHashtable uni2byte>
		byte2uni = new IntHashtable();
	//   12   26:aload_0         
	//   13   27:new             #56  <Class IntHashtable>
	//   14   30:dup             
	//   15   31:invokespecial   #57  <Method void IntHashtable()>
	//   16   34:putfield        #61  <Field IntHashtable byte2uni>
		ascender = 800F;
	//   17   37:aload_0         
	//   18   38:ldc1            #62  <Float 800F>
	//   19   40:putfield        #64  <Field float ascender>
		capHeight = 700F;
	//   20   43:aload_0         
	//   21   44:ldc1            #65  <Float 700F>
	//   22   46:putfield        #67  <Field float capHeight>
		descender = -200F;
	//   23   49:aload_0         
	//   24   50:ldc1            #68  <Float -200F>
	//   25   52:putfield        #70  <Field float descender>
		italicAngle = 0.0F;
	//   26   55:aload_0         
	//   27   56:fconst_0        
	//   28   57:putfield        #72  <Field float italicAngle>
		fontWeight = 0.0F;
	//   29   60:aload_0         
	//   30   61:fconst_0        
	//   31   62:putfield        #74  <Field float fontWeight>
		llx = -50F;
	//   32   65:aload_0         
	//   33   66:ldc1            #75  <Float -50F>
	//   34   68:putfield        #77  <Field float llx>
		lly = -200F;
	//   35   71:aload_0         
	//   36   72:ldc1            #68  <Float -200F>
	//   37   74:putfield        #79  <Field float lly>
		urx = 100F;
	//   38   77:aload_0         
	//   39   78:ldc1            #80  <Float 100F>
	//   40   80:putfield        #82  <Field float urx>
		ury = 900F;
	//   41   83:aload_0         
	//   42   84:ldc1            #83  <Float 900F>
	//   43   86:putfield        #85  <Field float ury>
		isType0 = false;
	//   44   89:aload_0         
	//   45   90:iconst_0        
	//   46   91:putfield        #87  <Field boolean isType0>
		defaultWidth = 1000;
	//   47   94:aload_0         
	//   48   95:sipush          1000
	//   49   98:putfield        #89  <Field int defaultWidth>
		refFont = null;
	//   50  101:aload_0         
	//   51  102:aconst_null     
	//   52  103:putfield        #91  <Field PRIndirectReference refFont>
		font = pdfdictionary;
	//   53  106:aload_0         
	//   54  107:aload_1         
	//   55  108:putfield        #101 <Field PdfDictionary font>
		init();
	//   56  111:aload_0         
	//   57  112:invokespecial   #104 <Method void init()>
	//   58  115:return          
	}

	private String decodeString(PdfString pdfstring)
	{
		if(pdfstring.isHexWriting())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #147 <Method boolean PdfString.isHexWriting()>
	//*   2    4:ifeq            17
			return PdfEncodings.convertToString(pdfstring.getBytes(), "UnicodeBigUnmarked");
	//    3    7:aload_1         
	//    4    8:invokevirtual   #151 <Method byte[] PdfString.getBytes()>
	//    5   11:ldc1            #153 <String "UnicodeBigUnmarked">
	//    6   13:invokestatic    #159 <Method String PdfEncodings.convertToString(byte[], String)>
	//    7   16:areturn         
		else
			return pdfstring.toUnicodeString();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #163 <Method String PdfString.toUnicodeString()>
	//   10   21:areturn         
	}

	private void doType1TT()
	{
		Object obj;
		obj = ((Object) (PdfReader.getPdfObject(font.get(PdfName.ENCODING))));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field PdfDictionary font>
	//    2    4:getstatic       #111 <Field PdfName PdfName.ENCODING>
	//    3    7:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:invokestatic    #97  <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    5   13:astore_3        
		if(obj != null)
			break MISSING_BLOCK_LABEL_200;
	//    6   14:aload_3         
	//    7   15:ifnonnull       200
		obj = ((Object) (font.getAsName(PdfName.BASEFONT)));
	//    8   18:aload_0         
	//    9   19:getfield        #101 <Field PdfDictionary font>
	//   10   22:getstatic       #169 <Field PdfName PdfName.BASEFONT>
	//   11   25:invokevirtual   #173 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   12   28:astore_3        
		java.util.Map.Entry entry;
		if(BuiltinFonts14.containsKey(((Object) (fontName))) && (PdfName.SYMBOL.equals(obj) || PdfName.ZAPFDINGBATS.equals(obj)))
	//*  13   29:getstatic       #176 <Field HashMap BuiltinFonts14>
	//*  14   32:aload_0         
	//*  15   33:getfield        #178 <Field String fontName>
	//*  16   36:invokevirtual   #182 <Method boolean HashMap.containsKey(Object)>
	//*  17   39:ifeq            192
	//*  18   42:getstatic       #185 <Field PdfName PdfName.SYMBOL>
	//*  19   45:aload_3         
	//*  20   46:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//*  21   49:ifne            62
	//*  22   52:getstatic       #191 <Field PdfName PdfName.ZAPFDINGBATS>
	//*  23   55:aload_3         
	//*  24   56:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//*  25   59:ifeq            192
			fillEncoding(((PdfName) (obj)));
	//   26   62:aload_0         
	//   27   63:aload_3         
	//   28   64:invokespecial   #195 <Method void fillEncoding(PdfName)>
		else
	//*  29   67:aload_0         
	//*  30   68:invokespecial   #199 <Method CMapToUnicode processToUnicode()>
	//*  31   71:astore_3        
	//*  32   72:aload_3         
	//*  33   73:ifnull          215
	//*  34   76:aload_3         
	//*  35   77:invokevirtual   #205 <Method Map CMapToUnicode.createReverseMapping()>
	//*  36   80:invokeinterface #210 <Method Set Map.entrySet()>
	//*  37   85:invokeinterface #125 <Method Iterator Set.iterator()>
	//*  38   90:astore_3        
	//*  39   91:aload_3         
	//*  40   92:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//*  41   97:ifeq            215
	//*  42  100:aload_3         
	//*  43  101:invokeinterface #135 <Method Object Iterator.next()>
	//*  44  106:checkcast       #212 <Class java.util.Map$Entry>
	//*  45  109:astore          4
	//*  46  111:aload_0         
	//*  47  112:getfield        #59  <Field IntHashtable uni2byte>
	//*  48  115:aload           4
	//*  49  117:invokeinterface #215 <Method Object java.util.Map$Entry.getKey()>
	//*  50  122:checkcast       #217 <Class Integer>
	//*  51  125:invokevirtual   #221 <Method int Integer.intValue()>
	//*  52  128:aload           4
	//*  53  130:invokeinterface #224 <Method Object java.util.Map$Entry.getValue()>
	//*  54  135:checkcast       #217 <Class Integer>
	//*  55  138:invokevirtual   #221 <Method int Integer.intValue()>
	//*  56  141:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//*  57  144:pop             
	//*  58  145:aload_0         
	//*  59  146:getfield        #61  <Field IntHashtable byte2uni>
	//*  60  149:aload           4
	//*  61  151:invokeinterface #224 <Method Object java.util.Map$Entry.getValue()>
	//*  62  156:checkcast       #217 <Class Integer>
	//*  63  159:invokevirtual   #221 <Method int Integer.intValue()>
	//*  64  162:aload           4
	//*  65  164:invokeinterface #215 <Method Object java.util.Map$Entry.getKey()>
	//*  66  169:checkcast       #217 <Class Integer>
	//*  67  172:invokevirtual   #221 <Method int Integer.intValue()>
	//*  68  175:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//*  69  178:pop             
	//*  70  179:goto            91
	//*  71  182:astore_3        
	//*  72  183:new             #229 <Class ExceptionConverter>
	//*  73  186:dup             
	//*  74  187:aload_3         
	//*  75  188:invokespecial   #232 <Method void ExceptionConverter(Exception)>
	//*  76  191:athrow          
			fillEncoding(((PdfName) (null)));
	//   77  192:aload_0         
	//   78  193:aconst_null     
	//   79  194:invokespecial   #195 <Method void fillEncoding(PdfName)>
		try
		{
			obj = ((Object) (processToUnicode()));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw new ExceptionConverter(((Exception) (obj)));
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_215;
		for(obj = ((Object) (((CMapToUnicode) (obj)).createReverseMapping().entrySet().iterator())); ((Iterator) (obj)).hasNext(); byte2uni.put(((Integer)entry.getValue()).intValue(), ((Integer)entry.getKey()).intValue()))
		{
			entry = (java.util.Map.Entry)((Iterator) (obj)).next();
			uni2byte.put(((Integer)entry.getKey()).intValue(), ((Integer)entry.getValue()).intValue());
		}

		break MISSING_BLOCK_LABEL_215;
	//*  80  197:goto            67
		if(((PdfObject) (obj)).isName())
	//*  81  200:aload_3         
	//*  82  201:invokevirtual   #237 <Method boolean PdfObject.isName()>
	//*  83  204:ifeq            294
			fillEncoding((PdfName)obj);
	//   84  207:aload_0         
	//   85  208:aload_3         
	//   86  209:checkcast       #107 <Class PdfName>
	//   87  212:invokespecial   #195 <Method void fillEncoding(PdfName)>
		else
	//*  88  215:getstatic       #176 <Field HashMap BuiltinFonts14>
	//*  89  218:aload_0         
	//*  90  219:getfield        #178 <Field String fontName>
	//*  91  222:invokevirtual   #182 <Method boolean HashMap.containsKey(Object)>
	//*  92  225:ifeq            538
	//*  93  228:aload_0         
	//*  94  229:getfield        #178 <Field String fontName>
	//*  95  232:ldc1            #239 <String "Cp1252">
	//*  96  234:iconst_0        
	//*  97  235:invokestatic    #243 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//*  98  238:astore_3        
	//*  99  239:aload_0         
	//* 100  240:getfield        #59  <Field IntHashtable uni2byte>
	//* 101  243:invokevirtual   #247 <Method int[] IntHashtable.toOrderedKeys()>
	//* 102  246:astore          4
	//* 103  248:iconst_0        
	//* 104  249:istore_1        
	//* 105  250:iload_1         
	//* 106  251:aload           4
	//* 107  253:arraylength     
	//* 108  254:icmpge          359
	//* 109  257:aload_0         
	//* 110  258:getfield        #59  <Field IntHashtable uni2byte>
	//* 111  261:aload           4
	//* 112  263:iload_1         
	//* 113  264:iaload          
	//* 114  265:invokevirtual   #250 <Method int IntHashtable.get(int)>
	//* 115  268:istore_2        
	//* 116  269:aload_0         
	//* 117  270:getfield        #253 <Field int[] widths>
	//* 118  273:iload_2         
	//* 119  274:aload_3         
	//* 120  275:iload_2         
	//* 121  276:aload           4
	//* 122  278:iload_1         
	//* 123  279:iaload          
	//* 124  280:invokestatic    #259 <Method String GlyphList.unicodeToName(int)>
	//* 125  283:invokevirtual   #263 <Method int BaseFont.getRawWidth(int, String)>
	//* 126  286:iastore         
	//* 127  287:iload_1         
	//* 128  288:iconst_1        
	//* 129  289:iadd            
	//* 130  290:istore_1        
	//* 131  291:goto            250
		if(((PdfObject) (obj)).isDictionary())
	//* 132  294:aload_3         
	//* 133  295:invokevirtual   #266 <Method boolean PdfObject.isDictionary()>
	//* 134  298:ifeq            215
		{
			obj = ((Object) ((PdfDictionary)obj));
	//  135  301:aload_3         
	//  136  302:checkcast       #99  <Class PdfDictionary>
	//  137  305:astore_3        
			PdfObject pdfobject = PdfReader.getPdfObject(((PdfDictionary) (obj)).get(PdfName.BASEENCODING));
	//  138  306:aload_3         
	//  139  307:getstatic       #269 <Field PdfName PdfName.BASEENCODING>
	//  140  310:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//  141  313:invokestatic    #97  <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//  142  316:astore          4
			if(pdfobject == null)
	//* 143  318:aload           4
	//* 144  320:ifnonnull       337
				fillEncoding(((PdfName) (null)));
	//  145  323:aload_0         
	//  146  324:aconst_null     
	//  147  325:invokespecial   #195 <Method void fillEncoding(PdfName)>
			else
	//* 148  328:aload_0         
	//* 149  329:aload_3         
	//* 150  330:aconst_null     
	//* 151  331:invokespecial   #273 <Method void fillDiffMap(PdfDictionary, CMapToUnicode)>
	//* 152  334:goto            215
				fillEncoding((PdfName)pdfobject);
	//  153  337:aload_0         
	//  154  338:aload           4
	//  155  340:checkcast       #107 <Class PdfName>
	//  156  343:invokespecial   #195 <Method void fillEncoding(PdfName)>
			fillDiffMap(((PdfDictionary) (obj)), ((CMapToUnicode) (null)));
		}
		if(BuiltinFonts14.containsKey(((Object) (fontName))))
		{
			int ai[];
			try
			{
				obj = ((Object) (BaseFont.createFont(fontName, "Cp1252", false)));
			}
	//* 157  346:goto            328
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 158  349:astore_3        
			{
				throw new ExceptionConverter(((Exception) (obj)));
	//  159  350:new             #229 <Class ExceptionConverter>
	//  160  353:dup             
	//  161  354:aload_3         
	//  162  355:invokespecial   #232 <Method void ExceptionConverter(Exception)>
	//  163  358:athrow          
			}
			ai = uni2byte.toOrderedKeys();
			for(int i = 0; i < ai.length; i++)
			{
				int k = uni2byte.get(ai[i]);
				widths[k] = ((BaseFont) (obj)).getRawWidth(k, GlyphList.unicodeToName(ai[i]));
			}

			if(diffmap != null)
	//* 164  359:aload_0         
	//* 165  360:getfield        #275 <Field IntHashtable diffmap>
	//* 166  363:ifnull          426
			{
				int ai1[] = diffmap.toOrderedKeys();
	//  167  366:aload_0         
	//  168  367:getfield        #275 <Field IntHashtable diffmap>
	//  169  370:invokevirtual   #247 <Method int[] IntHashtable.toOrderedKeys()>
	//  170  373:astore          4
				for(int j = 0; j < ai1.length; j++)
	//* 171  375:iconst_0        
	//* 172  376:istore_1        
	//* 173  377:iload_1         
	//* 174  378:aload           4
	//* 175  380:arraylength     
	//* 176  381:icmpge          421
				{
					int l = diffmap.get(ai1[j]);
	//  177  384:aload_0         
	//  178  385:getfield        #275 <Field IntHashtable diffmap>
	//  179  388:aload           4
	//  180  390:iload_1         
	//  181  391:iaload          
	//  182  392:invokevirtual   #250 <Method int IntHashtable.get(int)>
	//  183  395:istore_2        
					widths[l] = ((BaseFont) (obj)).getRawWidth(l, GlyphList.unicodeToName(ai1[j]));
	//  184  396:aload_0         
	//  185  397:getfield        #253 <Field int[] widths>
	//  186  400:iload_2         
	//  187  401:aload_3         
	//  188  402:iload_2         
	//  189  403:aload           4
	//  190  405:iload_1         
	//  191  406:iaload          
	//  192  407:invokestatic    #259 <Method String GlyphList.unicodeToName(int)>
	//  193  410:invokevirtual   #263 <Method int BaseFont.getRawWidth(int, String)>
	//  194  413:iastore         
				}

	//  195  414:iload_1         
	//  196  415:iconst_1        
	//  197  416:iadd            
	//  198  417:istore_1        
	//* 199  418:goto            377
				diffmap = null;
	//  200  421:aload_0         
	//  201  422:aconst_null     
	//  202  423:putfield        #275 <Field IntHashtable diffmap>
			}
			ascender = ((BaseFont) (obj)).getFontDescriptor(1, 1000F);
	//  203  426:aload_0         
	//  204  427:aload_3         
	//  205  428:iconst_1        
	//  206  429:ldc2            #276 <Float 1000F>
	//  207  432:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//  208  435:putfield        #64  <Field float ascender>
			capHeight = ((BaseFont) (obj)).getFontDescriptor(2, 1000F);
	//  209  438:aload_0         
	//  210  439:aload_3         
	//  211  440:iconst_2        
	//  212  441:ldc2            #276 <Float 1000F>
	//  213  444:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//  214  447:putfield        #67  <Field float capHeight>
			descender = ((BaseFont) (obj)).getFontDescriptor(3, 1000F);
	//  215  450:aload_0         
	//  216  451:aload_3         
	//  217  452:iconst_3        
	//  218  453:ldc2            #276 <Float 1000F>
	//  219  456:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//  220  459:putfield        #70  <Field float descender>
			italicAngle = ((BaseFont) (obj)).getFontDescriptor(4, 1000F);
	//  221  462:aload_0         
	//  222  463:aload_3         
	//  223  464:iconst_4        
	//  224  465:ldc2            #276 <Float 1000F>
	//  225  468:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//  226  471:putfield        #72  <Field float italicAngle>
			fontWeight = ((BaseFont) (obj)).getFontDescriptor(23, 1000F);
	//  227  474:aload_0         
	//  228  475:aload_3         
	//  229  476:bipush          23
	//  230  478:ldc2            #276 <Float 1000F>
	//  231  481:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//  232  484:putfield        #74  <Field float fontWeight>
			llx = ((BaseFont) (obj)).getFontDescriptor(5, 1000F);
	//  233  487:aload_0         
	//  234  488:aload_3         
	//  235  489:iconst_5        
	//  236  490:ldc2            #276 <Float 1000F>
	//  237  493:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//  238  496:putfield        #77  <Field float llx>
			lly = ((BaseFont) (obj)).getFontDescriptor(6, 1000F);
	//  239  499:aload_0         
	//  240  500:aload_3         
	//  241  501:bipush          6
	//  242  503:ldc2            #276 <Float 1000F>
	//  243  506:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//  244  509:putfield        #79  <Field float lly>
			urx = ((BaseFont) (obj)).getFontDescriptor(7, 1000F);
	//  245  512:aload_0         
	//  246  513:aload_3         
	//  247  514:bipush          7
	//  248  516:ldc2            #276 <Float 1000F>
	//  249  519:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//  250  522:putfield        #82  <Field float urx>
			ury = ((BaseFont) (obj)).getFontDescriptor(8, 1000F);
	//  251  525:aload_0         
	//  252  526:aload_3         
	//  253  527:bipush          8
	//  254  529:ldc2            #276 <Float 1000F>
	//  255  532:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//  256  535:putfield        #85  <Field float ury>
		}
		fillWidths();
	//  257  538:aload_0         
	//  258  539:invokespecial   #283 <Method void fillWidths()>
		fillFontDesc(font.getAsDict(PdfName.FONTDESCRIPTOR));
	//  259  542:aload_0         
	//  260  543:aload_0         
	//  261  544:getfield        #101 <Field PdfDictionary font>
	//  262  547:getstatic       #286 <Field PdfName PdfName.FONTDESCRIPTOR>
	//  263  550:invokevirtual   #290 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  264  553:invokespecial   #293 <Method void fillFontDesc(PdfDictionary)>
		return;
	//  265  556:return          
	}

	private void fillDiffMap(PdfDictionary pdfdictionary, CMapToUnicode cmaptounicode)
	{
		PdfArray pdfarray = pdfdictionary.getAsArray(PdfName.DIFFERENCES);
	//    0    0:aload_1         
	//    1    1:getstatic       #296 <Field PdfName PdfName.DIFFERENCES>
	//    2    4:invokevirtual   #300 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//    3    7:astore          5
		if(pdfarray != null)
	//*   4    9:aload           5
	//*   5   11:ifnull          247
		{
			diffmap = new IntHashtable();
	//    6   14:aload_0         
	//    7   15:new             #56  <Class IntHashtable>
	//    8   18:dup             
	//    9   19:invokespecial   #57  <Method void IntHashtable()>
	//   10   22:putfield        #275 <Field IntHashtable diffmap>
			int i = 0;
	//   11   25:iconst_0        
	//   12   26:istore_3        
			int j = 0;
	//   13   27:iconst_0        
	//   14   28:istore          4
			while(j < pdfarray.size()) 
	//*  15   30:iload           4
	//*  16   32:aload           5
	//*  17   34:invokevirtual   #305 <Method int PdfArray.size()>
	//*  18   37:icmpge          247
			{
				pdfdictionary = ((PdfDictionary) (pdfarray.getPdfObject(j)));
	//   19   40:aload           5
	//   20   42:iload           4
	//   21   44:invokevirtual   #308 <Method PdfObject PdfArray.getPdfObject(int)>
	//   22   47:astore_1        
				if(((PdfObject) (pdfdictionary)).isNumber())
	//*  23   48:aload_1         
	//*  24   49:invokevirtual   #311 <Method boolean PdfObject.isNumber()>
	//*  25   52:ifeq            72
				{
					i = ((PdfNumber)pdfdictionary).intValue();
	//   26   55:aload_1         
	//   27   56:checkcast       #313 <Class PdfNumber>
	//   28   59:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//   29   62:istore_3        
				} else
	//*  30   63:iload           4
	//*  31   65:iconst_1        
	//*  32   66:iadd            
	//*  33   67:istore          4
	//*  34   69:goto            30
				{
					pdfdictionary = ((PdfDictionary) (GlyphList.nameToUnicode(PdfName.decodeName(((PdfName)pdfdictionary).toString()))));
	//   35   72:aload_1         
	//   36   73:checkcast       #107 <Class PdfName>
	//   37   76:invokevirtual   #317 <Method String PdfName.toString()>
	//   38   79:invokestatic    #321 <Method String PdfName.decodeName(String)>
	//   39   82:invokestatic    #325 <Method int[] GlyphList.nameToUnicode(String)>
	//   40   85:astore_1        
					if(pdfdictionary != null && pdfdictionary.length > 0)
	//*  41   86:aload_1         
	//*  42   87:ifnull          138
	//*  43   90:aload_1         
	//*  44   91:arraylength     
	//*  45   92:ifle            138
					{
						uni2byte.put(pdfdictionary[0], i);
	//   46   95:aload_0         
	//   47   96:getfield        #59  <Field IntHashtable uni2byte>
	//   48   99:aload_1         
	//   49  100:iconst_0        
	//   50  101:iaload          
	//   51  102:iload_3         
	//   52  103:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//   53  106:pop             
						byte2uni.put(i, pdfdictionary[0]);
	//   54  107:aload_0         
	//   55  108:getfield        #61  <Field IntHashtable byte2uni>
	//   56  111:iload_3         
	//   57  112:aload_1         
	//   58  113:iconst_0        
	//   59  114:iaload          
	//   60  115:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//   61  118:pop             
						diffmap.put(pdfdictionary[0], i);
	//   62  119:aload_0         
	//   63  120:getfield        #275 <Field IntHashtable diffmap>
	//   64  123:aload_1         
	//   65  124:iconst_0        
	//   66  125:iaload          
	//   67  126:iload_3         
	//   68  127:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//   69  130:pop             
					} else
	//*  70  131:iload_3         
	//*  71  132:iconst_1        
	//*  72  133:iadd            
	//*  73  134:istore_3        
	//*  74  135:goto            63
					{
						pdfdictionary = ((PdfDictionary) (cmaptounicode));
	//   75  138:aload_2         
	//   76  139:astore_1        
						if(cmaptounicode == null)
	//*  77  140:aload_2         
	//*  78  141:ifnonnull       163
						{
							cmaptounicode = processToUnicode();
	//   79  144:aload_0         
	//   80  145:invokespecial   #199 <Method CMapToUnicode processToUnicode()>
	//   81  148:astore_2        
							pdfdictionary = ((PdfDictionary) (cmaptounicode));
	//   82  149:aload_2         
	//   83  150:astore_1        
							if(cmaptounicode == null)
	//*  84  151:aload_2         
	//*  85  152:ifnonnull       163
								pdfdictionary = ((PdfDictionary) (new CMapToUnicode()));
	//   86  155:new             #201 <Class CMapToUnicode>
	//   87  158:dup             
	//   88  159:invokespecial   #326 <Method void CMapToUnicode()>
	//   89  162:astore_1        
						}
						String s = ((CMapToUnicode) (pdfdictionary)).lookup(new byte[] {
							(byte)i
						}, 0, 1);
	//   90  163:aload_1         
	//   91  164:iconst_1        
	//   92  165:newarray        byte[]
	//   93  167:dup             
	//   94  168:iconst_0        
	//   95  169:iload_3         
	//   96  170:int2byte        
	//   97  171:bastore         
	//   98  172:iconst_0        
	//   99  173:iconst_1        
	//  100  174:invokevirtual   #330 <Method String CMapToUnicode.lookup(byte[], int, int)>
	//  101  177:astore          6
						cmaptounicode = ((CMapToUnicode) (pdfdictionary));
	//  102  179:aload_1         
	//  103  180:astore_2        
						if(s != null)
	//* 104  181:aload           6
	//* 105  183:ifnull          131
						{
							cmaptounicode = ((CMapToUnicode) (pdfdictionary));
	//  106  186:aload_1         
	//  107  187:astore_2        
							if(s.length() == 1)
	//* 108  188:aload           6
	//* 109  190:invokevirtual   #335 <Method int String.length()>
	//* 110  193:iconst_1        
	//* 111  194:icmpne          131
							{
								uni2byte.put(((int) (s.charAt(0))), i);
	//  112  197:aload_0         
	//  113  198:getfield        #59  <Field IntHashtable uni2byte>
	//  114  201:aload           6
	//  115  203:iconst_0        
	//  116  204:invokevirtual   #339 <Method char String.charAt(int)>
	//  117  207:iload_3         
	//  118  208:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//  119  211:pop             
								byte2uni.put(i, ((int) (s.charAt(0))));
	//  120  212:aload_0         
	//  121  213:getfield        #61  <Field IntHashtable byte2uni>
	//  122  216:iload_3         
	//  123  217:aload           6
	//  124  219:iconst_0        
	//  125  220:invokevirtual   #339 <Method char String.charAt(int)>
	//  126  223:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//  127  226:pop             
								diffmap.put(((int) (s.charAt(0))), i);
	//  128  227:aload_0         
	//  129  228:getfield        #275 <Field IntHashtable diffmap>
	//  130  231:aload           6
	//  131  233:iconst_0        
	//  132  234:invokevirtual   #339 <Method char String.charAt(int)>
	//  133  237:iload_3         
	//  134  238:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//  135  241:pop             
								cmaptounicode = ((CMapToUnicode) (pdfdictionary));
	//  136  242:aload_1         
	//  137  243:astore_2        
							}
						}
					}
					i++;
				}
				j++;
			}
		}
	//* 138  244:goto            131
	//  139  247:return          
	}

	private void fillEncoding(PdfName pdfname)
	{
		if(pdfname != null || !isSymbolic()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       47
	//    2    4:aload_0         
	//    3    5:invokevirtual   #342 <Method boolean isSymbolic()>
	//    4    8:ifeq            47
_L1:
		for(int i = 0; i < 256; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_2        
	//*   7   13:iload_2         
	//*   8   14:sipush          256
	//*   9   17:icmpge          222
		{
			uni2byte.put(i, i);
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field IntHashtable uni2byte>
	//   12   24:iload_2         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//   15   29:pop             
			byte2uni.put(i, i);
	//   16   30:aload_0         
	//   17   31:getfield        #61  <Field IntHashtable byte2uni>
	//   18   34:iload_2         
	//   19   35:iload_2         
	//   20   36:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//   21   39:pop             
		}

	//   22   40:iload_2         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_2        
		  goto _L3
	//*  26   44:goto            13
_L2:
		if(!PdfName.MAC_ROMAN_ENCODING.equals(((Object) (pdfname))) && !PdfName.WIN_ANSI_ENCODING.equals(((Object) (pdfname))) && !PdfName.SYMBOL.equals(((Object) (pdfname))) && !PdfName.ZAPFDINGBATS.equals(((Object) (pdfname)))) goto _L5; else goto _L4
	//   27   47:getstatic       #345 <Field PdfName PdfName.MAC_ROMAN_ENCODING>
	//   28   50:aload_1         
	//   29   51:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//   30   54:ifne            87
	//   31   57:getstatic       #348 <Field PdfName PdfName.WIN_ANSI_ENCODING>
	//   32   60:aload_1         
	//   33   61:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//   34   64:ifne            87
	//   35   67:getstatic       #185 <Field PdfName PdfName.SYMBOL>
	//   36   70:aload_1         
	//   37   71:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//   38   74:ifne            87
	//   39   77:getstatic       #191 <Field PdfName PdfName.ZAPFDINGBATS>
	//   40   80:aload_1         
	//   41   81:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//   42   84:ifeq            223
_L4:
		String s;
		byte abyte0[];
		abyte0 = new byte[256];
	//   43   87:sipush          256
	//   44   90:newarray        byte[]
	//   45   92:astore          4
		for(int j = 0; j < 256; j++)
	//*  46   94:iconst_0        
	//*  47   95:istore_2        
	//*  48   96:iload_2         
	//*  49   97:sipush          256
	//*  50  100:icmpge          116
			abyte0[j] = (byte)j;
	//   51  103:aload           4
	//   52  105:iload_2         
	//   53  106:iload_2         
	//   54  107:int2byte        
	//   55  108:bastore         

	//   56  109:iload_2         
	//   57  110:iconst_1        
	//   58  111:iadd            
	//   59  112:istore_2        
	//*  60  113:goto            96
		s = "Cp1252";
	//   61  116:ldc1            #239 <String "Cp1252">
	//   62  118:astore_3        
		if(!PdfName.MAC_ROMAN_ENCODING.equals(((Object) (pdfname)))) goto _L7; else goto _L6
	//   63  119:getstatic       #345 <Field PdfName PdfName.MAC_ROMAN_ENCODING>
	//   64  122:aload_1         
	//   65  123:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//   66  126:ifeq            183
_L6:
		s = "MacRoman";
	//   67  129:ldc2            #350 <String "MacRoman">
	//   68  132:astore_3        
_L9:
		pdfname = ((PdfName) (PdfEncodings.convertToString(abyte0, s).toCharArray()));
	//   69  133:aload           4
	//   70  135:aload_3         
	//   71  136:invokestatic    #159 <Method String PdfEncodings.convertToString(byte[], String)>
	//   72  139:invokevirtual   #354 <Method char[] String.toCharArray()>
	//   73  142:astore_1        
		for(int k = 0; k < 256; k++)
	//*  74  143:iconst_0        
	//*  75  144:istore_2        
	//*  76  145:iload_2         
	//*  77  146:sipush          256
	//*  78  149:icmpge          217
		{
			uni2byte.put(((int) (pdfname[k])), k);
	//   79  152:aload_0         
	//   80  153:getfield        #59  <Field IntHashtable uni2byte>
	//   81  156:aload_1         
	//   82  157:iload_2         
	//   83  158:caload          
	//   84  159:iload_2         
	//   85  160:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//   86  163:pop             
			byte2uni.put(k, ((int) (pdfname[k])));
	//   87  164:aload_0         
	//   88  165:getfield        #61  <Field IntHashtable byte2uni>
	//   89  168:iload_2         
	//   90  169:aload_1         
	//   91  170:iload_2         
	//   92  171:caload          
	//   93  172:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//   94  175:pop             
		}

	//   95  176:iload_2         
	//   96  177:iconst_1        
	//   97  178:iadd            
	//   98  179:istore_2        
		break; /* Loop/switch isn't completed */
	//   99  180:goto            145
_L7:
		if(PdfName.SYMBOL.equals(((Object) (pdfname))))
	//* 100  183:getstatic       #185 <Field PdfName PdfName.SYMBOL>
	//* 101  186:aload_1         
	//* 102  187:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//* 103  190:ifeq            200
			s = "Symbol";
	//  104  193:ldc2            #356 <String "Symbol">
	//  105  196:astore_3        
		else
	//* 106  197:goto            133
		if(PdfName.ZAPFDINGBATS.equals(((Object) (pdfname))))
	//* 107  200:getstatic       #191 <Field PdfName PdfName.ZAPFDINGBATS>
	//* 108  203:aload_1         
	//* 109  204:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//* 110  207:ifeq            133
			s = "ZapfDingbats";
	//  111  210:ldc2            #358 <String "ZapfDingbats">
	//  112  213:astore_3        
		if(true) goto _L9; else goto _L8
	//  113  214:goto            133
_L8:
		encoding = s;
	//  114  217:aload_0         
	//  115  218:aload_3         
	//  116  219:putfield        #361 <Field String encoding>
_L3:
		return;
	//  117  222:return          
_L5:
		int l = 0;
	//  118  223:iconst_0        
	//  119  224:istore_2        
		while(l < 256) 
	//* 120  225:iload_2         
	//* 121  226:sipush          256
	//* 122  229:icmpge          222
		{
			uni2byte.put(stdEnc[l], l);
	//  123  232:aload_0         
	//  124  233:getfield        #59  <Field IntHashtable uni2byte>
	//  125  236:getstatic       #44  <Field int[] stdEnc>
	//  126  239:iload_2         
	//  127  240:iaload          
	//  128  241:iload_2         
	//  129  242:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//  130  245:pop             
			byte2uni.put(l, stdEnc[l]);
	//  131  246:aload_0         
	//  132  247:getfield        #61  <Field IntHashtable byte2uni>
	//  133  250:iload_2         
	//  134  251:getstatic       #44  <Field int[] stdEnc>
	//  135  254:iload_2         
	//  136  255:iaload          
	//  137  256:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//  138  259:pop             
			l++;
	//  139  260:iload_2         
	//  140  261:iconst_1        
	//  141  262:iadd            
	//  142  263:istore_2        
		}
		if(true) goto _L3; else goto _L10
	//  143  264:goto            225
_L10:
	}

	private void fillFontDesc(PdfDictionary pdfdictionary)
	{
		if(pdfdictionary == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		PdfNumber pdfnumber = pdfdictionary.getAsNumber(PdfName.ASCENT);
	//    3    5:aload_1         
	//    4    6:getstatic       #364 <Field PdfName PdfName.ASCENT>
	//    5    9:invokevirtual   #368 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//    6   12:astore          4
		if(pdfnumber != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          28
			ascender = pdfnumber.floatValue();
	//    9   19:aload_0         
	//   10   20:aload           4
	//   11   22:invokevirtual   #372 <Method float PdfNumber.floatValue()>
	//   12   25:putfield        #64  <Field float ascender>
		pdfnumber = pdfdictionary.getAsNumber(PdfName.CAPHEIGHT);
	//   13   28:aload_1         
	//   14   29:getstatic       #375 <Field PdfName PdfName.CAPHEIGHT>
	//   15   32:invokevirtual   #368 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   16   35:astore          4
		if(pdfnumber != null)
	//*  17   37:aload           4
	//*  18   39:ifnull          51
			capHeight = pdfnumber.floatValue();
	//   19   42:aload_0         
	//   20   43:aload           4
	//   21   45:invokevirtual   #372 <Method float PdfNumber.floatValue()>
	//   22   48:putfield        #67  <Field float capHeight>
		pdfnumber = pdfdictionary.getAsNumber(PdfName.DESCENT);
	//   23   51:aload_1         
	//   24   52:getstatic       #378 <Field PdfName PdfName.DESCENT>
	//   25   55:invokevirtual   #368 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   26   58:astore          4
		if(pdfnumber != null)
	//*  27   60:aload           4
	//*  28   62:ifnull          74
			descender = pdfnumber.floatValue();
	//   29   65:aload_0         
	//   30   66:aload           4
	//   31   68:invokevirtual   #372 <Method float PdfNumber.floatValue()>
	//   32   71:putfield        #70  <Field float descender>
		pdfnumber = pdfdictionary.getAsNumber(PdfName.ITALICANGLE);
	//   33   74:aload_1         
	//   34   75:getstatic       #381 <Field PdfName PdfName.ITALICANGLE>
	//   35   78:invokevirtual   #368 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   36   81:astore          4
		if(pdfnumber != null)
	//*  37   83:aload           4
	//*  38   85:ifnull          97
			italicAngle = pdfnumber.floatValue();
	//   39   88:aload_0         
	//   40   89:aload           4
	//   41   91:invokevirtual   #372 <Method float PdfNumber.floatValue()>
	//   42   94:putfield        #72  <Field float italicAngle>
		pdfnumber = pdfdictionary.getAsNumber(PdfName.FONTWEIGHT);
	//   43   97:aload_1         
	//   44   98:getstatic       #384 <Field PdfName PdfName.FONTWEIGHT>
	//   45  101:invokevirtual   #368 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   46  104:astore          4
		if(pdfnumber != null)
	//*  47  106:aload           4
	//*  48  108:ifnull          120
			fontWeight = pdfnumber.floatValue();
	//   49  111:aload_0         
	//   50  112:aload           4
	//   51  114:invokevirtual   #372 <Method float PdfNumber.floatValue()>
	//   52  117:putfield        #74  <Field float fontWeight>
		pdfdictionary = ((PdfDictionary) (pdfdictionary.getAsArray(PdfName.FONTBBOX)));
	//   53  120:aload_1         
	//   54  121:getstatic       #387 <Field PdfName PdfName.FONTBBOX>
	//   55  124:invokevirtual   #300 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   56  127:astore_1        
		if(pdfdictionary != null)
	//*  57  128:aload_1         
	//*  58  129:ifnull          240
		{
			llx = ((PdfArray) (pdfdictionary)).getAsNumber(0).floatValue();
	//   59  132:aload_0         
	//   60  133:aload_1         
	//   61  134:iconst_0        
	//   62  135:invokevirtual   #390 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   63  138:invokevirtual   #372 <Method float PdfNumber.floatValue()>
	//   64  141:putfield        #77  <Field float llx>
			lly = ((PdfArray) (pdfdictionary)).getAsNumber(1).floatValue();
	//   65  144:aload_0         
	//   66  145:aload_1         
	//   67  146:iconst_1        
	//   68  147:invokevirtual   #390 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   69  150:invokevirtual   #372 <Method float PdfNumber.floatValue()>
	//   70  153:putfield        #79  <Field float lly>
			urx = ((PdfArray) (pdfdictionary)).getAsNumber(2).floatValue();
	//   71  156:aload_0         
	//   72  157:aload_1         
	//   73  158:iconst_2        
	//   74  159:invokevirtual   #390 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   75  162:invokevirtual   #372 <Method float PdfNumber.floatValue()>
	//   76  165:putfield        #82  <Field float urx>
			ury = ((PdfArray) (pdfdictionary)).getAsNumber(3).floatValue();
	//   77  168:aload_0         
	//   78  169:aload_1         
	//   79  170:iconst_3        
	//   80  171:invokevirtual   #390 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   81  174:invokevirtual   #372 <Method float PdfNumber.floatValue()>
	//   82  177:putfield        #85  <Field float ury>
			if(llx > urx)
	//*  83  180:aload_0         
	//*  84  181:getfield        #77  <Field float llx>
	//*  85  184:aload_0         
	//*  86  185:getfield        #82  <Field float urx>
	//*  87  188:fcmpl           
	//*  88  189:ifle            210
			{
				float f = llx;
	//   89  192:aload_0         
	//   90  193:getfield        #77  <Field float llx>
	//   91  196:fstore_2        
				llx = urx;
	//   92  197:aload_0         
	//   93  198:aload_0         
	//   94  199:getfield        #82  <Field float urx>
	//   95  202:putfield        #77  <Field float llx>
				urx = f;
	//   96  205:aload_0         
	//   97  206:fload_2         
	//   98  207:putfield        #82  <Field float urx>
			}
			if(lly > ury)
	//*  99  210:aload_0         
	//* 100  211:getfield        #79  <Field float lly>
	//* 101  214:aload_0         
	//* 102  215:getfield        #85  <Field float ury>
	//* 103  218:fcmpl           
	//* 104  219:ifle            240
			{
				float f1 = lly;
	//  105  222:aload_0         
	//  106  223:getfield        #79  <Field float lly>
	//  107  226:fstore_2        
				lly = ury;
	//  108  227:aload_0         
	//  109  228:aload_0         
	//  110  229:getfield        #85  <Field float ury>
	//  111  232:putfield        #79  <Field float lly>
				ury = f1;
	//  112  235:aload_0         
	//  113  236:fload_2         
	//  114  237:putfield        #85  <Field float ury>
			}
		}
		float f2 = Math.max(ury, ascender);
	//  115  240:aload_0         
	//  116  241:getfield        #85  <Field float ury>
	//  117  244:aload_0         
	//  118  245:getfield        #64  <Field float ascender>
	//  119  248:invokestatic    #396 <Method float Math.max(float, float)>
	//  120  251:fstore_2        
		float f3 = Math.min(lly, descender);
	//  121  252:aload_0         
	//  122  253:getfield        #79  <Field float lly>
	//  123  256:aload_0         
	//  124  257:getfield        #70  <Field float descender>
	//  125  260:invokestatic    #399 <Method float Math.min(float, float)>
	//  126  263:fstore_3        
		ascender = (f2 * 1000F) / (f2 - f3);
	//  127  264:aload_0         
	//  128  265:fload_2         
	//  129  266:ldc2            #276 <Float 1000F>
	//  130  269:fmul            
	//  131  270:fload_2         
	//  132  271:fload_3         
	//  133  272:fsub            
	//  134  273:fdiv            
	//  135  274:putfield        #64  <Field float ascender>
		descender = (f3 * 1000F) / (f2 - f3);
	//  136  277:aload_0         
	//  137  278:fload_3         
	//  138  279:ldc2            #276 <Float 1000F>
	//  139  282:fmul            
	//  140  283:fload_2         
	//  141  284:fload_3         
	//  142  285:fsub            
	//  143  286:fdiv            
	//  144  287:putfield        #70  <Field float descender>
	//  145  290:return          
	}

	private void fillMetrics(byte abyte0[], IntHashtable inthashtable, int i)
	{
		Object obj;
		int j;
		int k;
		boolean flag;
		int l;
		char c;
		char c1;
		String s;
		try
		{
			abyte0 = ((byte []) (new PdfContentParser(new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(abyte0))))));
	//    0    0:new             #403 <Class PdfContentParser>
	//    1    3:dup             
	//    2    4:new             #405 <Class PRTokeniser>
	//    3    7:dup             
	//    4    8:new             #407 <Class RandomAccessFileOrArray>
	//    5   11:dup             
	//    6   12:new             #409 <Class RandomAccessSourceFactory>
	//    7   15:dup             
	//    8   16:invokespecial   #410 <Method void RandomAccessSourceFactory()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #414 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//   11   23:invokespecial   #417 <Method void RandomAccessFileOrArray(com.itextpdf.text.io.RandomAccessSource)>
	//   12   26:invokespecial   #420 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   13   29:invokespecial   #423 <Method void PdfContentParser(PRTokeniser)>
	//   14   32:astore_1        
		}
	//*  15   33:iconst_1        
	//*  16   34:istore          6
	//*  17   36:iconst_0        
	//*  18   37:istore          4
	//*  19   39:bipush          50
	//*  20   41:istore          5
	//*  21   43:iload           6
	//*  22   45:ifne            53
	//*  23   48:iload           4
	//*  24   50:ifle            64
	//*  25   53:aload_1         
	//*  26   54:invokevirtual   #427 <Method PdfObject PdfContentParser.readPRObject()>
	//*  27   57:astore          11
	//*  28   59:aload           11
	//*  29   61:ifnonnull       83
	//*  30   64:return          
	//*  31   65:astore          11
	//*  32   67:iload           5
	//*  33   69:iconst_1        
	//*  34   70:isub            
	//*  35   71:istore          7
	//*  36   73:iload           7
	//*  37   75:istore          5
	//*  38   77:iload           7
	//*  39   79:ifge            43
	//*  40   82:return          
	//*  41   83:aload           11
	//*  42   85:invokevirtual   #430 <Method int PdfObject.type()>
	//*  43   88:sipush          200
	//*  44   91:icmpne          43
	//*  45   94:aload           11
	//*  46   96:invokevirtual   #431 <Method String PdfObject.toString()>
	//*  47   99:ldc2            #433 <String "begin">
	//*  48  102:invokevirtual   #434 <Method boolean String.equals(Object)>
	//*  49  105:ifeq            120
	//*  50  108:iconst_0        
	//*  51  109:istore          6
	//*  52  111:iload           4
	//*  53  113:iconst_1        
	//*  54  114:iadd            
	//*  55  115:istore          4
	//*  56  117:goto            43
	//*  57  120:aload           11
	//*  58  122:invokevirtual   #431 <Method String PdfObject.toString()>
	//*  59  125:ldc2            #436 <String "end">
	//*  60  128:invokevirtual   #434 <Method boolean String.equals(Object)>
	//*  61  131:ifeq            143
	//*  62  134:iload           4
	//*  63  136:iconst_1        
	//*  64  137:isub            
	//*  65  138:istore          4
	//*  66  140:goto            43
	//*  67  143:aload           11
	//*  68  145:invokevirtual   #431 <Method String PdfObject.toString()>
	//*  69  148:ldc2            #438 <String "beginbfchar">
	//*  70  151:invokevirtual   #434 <Method boolean String.equals(Object)>
	//*  71  154:ifeq            291
	//*  72  157:aload_1         
	//*  73  158:invokevirtual   #427 <Method PdfObject PdfContentParser.readPRObject()>
	//*  74  161:astore          11
	//*  75  163:aload           11
	//*  76  165:invokevirtual   #431 <Method String PdfObject.toString()>
	//*  77  168:ldc2            #440 <String "endbfchar">
	//*  78  171:invokevirtual   #434 <Method boolean String.equals(Object)>
	//*  79  174:ifne            43
	//*  80  177:aload_0         
	//*  81  178:aload           11
	//*  82  180:checkcast       #144 <Class PdfString>
	//*  83  183:invokespecial   #442 <Method String decodeString(PdfString)>
	//*  84  186:astore          11
	//*  85  188:aload_0         
	//*  86  189:aload_1         
	//*  87  190:invokevirtual   #427 <Method PdfObject PdfContentParser.readPRObject()>
	//*  88  193:checkcast       #144 <Class PdfString>
	//*  89  196:invokespecial   #442 <Method String decodeString(PdfString)>
	//*  90  199:astore          12
	//*  91  201:aload           12
	//*  92  203:invokevirtual   #335 <Method int String.length()>
	//*  93  206:iconst_1        
	//*  94  207:icmpne          157
	//*  95  210:aload           11
	//*  96  212:iconst_0        
	//*  97  213:invokevirtual   #339 <Method char String.charAt(int)>
	//*  98  216:istore          8
	//*  99  218:aload           12
	//* 100  220:aload           12
	//* 101  222:invokevirtual   #335 <Method int String.length()>
	//* 102  225:iconst_1        
	//* 103  226:isub            
	//* 104  227:invokevirtual   #339 <Method char String.charAt(int)>
	//* 105  230:istore          9
	//* 106  232:iload_3         
	//* 107  233:istore          7
	//* 108  235:aload_2         
	//* 109  236:iload           8
	//* 110  238:invokevirtual   #445 <Method boolean IntHashtable.containsKey(int)>
	//* 111  241:ifeq            252
	//* 112  244:aload_2         
	//* 113  245:iload           8
	//* 114  247:invokevirtual   #250 <Method int IntHashtable.get(int)>
	//* 115  250:istore          7
	//* 116  252:aload_0         
	//* 117  253:getfield        #54  <Field HashMap metrics>
	//* 118  256:iload           9
	//* 119  258:invokestatic    #449 <Method Integer Integer.valueOf(int)>
	//* 120  261:iconst_2        
	//* 121  262:newarray        int[]
	//* 122  264:dup             
	//* 123  265:iconst_0        
	//* 124  266:iload           8
	//* 125  268:iastore         
	//* 126  269:dup             
	//* 127  270:iconst_1        
	//* 128  271:iload           7
	//* 129  273:iastore         
	//* 130  274:invokevirtual   #452 <Method Object HashMap.put(Object, Object)>
	//* 131  277:pop             
	//* 132  278:goto            157
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 133  281:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//  134  282:new             #229 <Class ExceptionConverter>
	//  135  285:dup             
	//  136  286:aload_1         
	//  137  287:invokespecial   #232 <Method void ExceptionConverter(Exception)>
	//  138  290:athrow          
		}
		flag = true;
		j = 0;
		k = 50;
_L5:
label0:
		{
			if(flag || j > 0)
			{
				try
				{
					obj = ((Object) (((PdfContentParser) (abyte0)).readPRObject()));
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					l = k - 1;
					k = l;
					if(l < 0)
						return;
					continue; /* Loop/switch isn't completed */
				}
				if(obj != null)
					break label0;
			}
			return;
		}
		if(((PdfObject) (obj)).type() != 200)
			continue; /* Loop/switch isn't completed */
		if(((PdfObject) (obj)).toString().equals("begin"))
		{
			flag = false;
			j++;
			continue; /* Loop/switch isn't completed */
		}
		if(!((PdfObject) (obj)).toString().equals("end"))
			break; /* Loop/switch isn't completed */
		j--;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_43;
_L1:
		if(!((PdfObject) (obj)).toString().equals("beginbfchar"))
			continue; /* Loop/switch isn't completed */
_L3:
		do
		{
			obj = ((Object) (((PdfContentParser) (abyte0)).readPRObject()));
			if(((PdfObject) (obj)).toString().equals("endbfchar"))
				break MISSING_BLOCK_LABEL_43;
			obj = ((Object) (decodeString((PdfString)obj)));
			s = decodeString((PdfString)((PdfContentParser) (abyte0)).readPRObject());
		} while(s.length() != 1);
		c = ((String) (obj)).charAt(0);
		c1 = s.charAt(s.length() - 1);
		l = i;
		if(inthashtable.containsKey(((int) (c))))
			l = inthashtable.get(((int) (c)));
		metrics.put(((Object) (Integer.valueOf(((int) (c1))))), ((Object) (new int[] {
			c, l
		})));
		  goto _L3
		if(!((PdfObject) (obj)).toString().equals("beginbfrange")) goto _L5; else goto _L4
	//  139  291:aload           11
	//  140  293:invokevirtual   #431 <Method String PdfObject.toString()>
	//  141  296:ldc2            #454 <String "beginbfrange">
	//  142  299:invokevirtual   #434 <Method boolean String.equals(Object)>
	//  143  302:ifeq            43
_L4:
		obj = ((Object) (((PdfContentParser) (abyte0)).readPRObject()));
	//  144  305:aload_1         
	//  145  306:invokevirtual   #427 <Method PdfObject PdfContentParser.readPRObject()>
	//  146  309:astore          11
		if(((PdfObject) (obj)).toString().equals("endbfrange")) goto _L5; else goto _L6
	//  147  311:aload           11
	//  148  313:invokevirtual   #431 <Method String PdfObject.toString()>
	//  149  316:ldc2            #456 <String "endbfrange">
	//  150  319:invokevirtual   #434 <Method boolean String.equals(Object)>
	//  151  322:ifne            43
_L6:
		int k1;
		char c2;
		obj = ((Object) (decodeString((PdfString)obj)));
	//  152  325:aload_0         
	//  153  326:aload           11
	//  154  328:checkcast       #144 <Class PdfString>
	//  155  331:invokespecial   #442 <Method String decodeString(PdfString)>
	//  156  334:astore          11
		String s1 = decodeString((PdfString)((PdfContentParser) (abyte0)).readPRObject());
	//  157  336:aload_0         
	//  158  337:aload_1         
	//  159  338:invokevirtual   #427 <Method PdfObject PdfContentParser.readPRObject()>
	//  160  341:checkcast       #144 <Class PdfString>
	//  161  344:invokespecial   #442 <Method String decodeString(PdfString)>
	//  162  347:astore          12
		k1 = ((int) (((String) (obj)).charAt(0)));
	//  163  349:aload           11
	//  164  351:iconst_0        
	//  165  352:invokevirtual   #339 <Method char String.charAt(int)>
	//  166  355:istore          9
		c2 = s1.charAt(0);
	//  167  357:aload           12
	//  168  359:iconst_0        
	//  169  360:invokevirtual   #339 <Method char String.charAt(int)>
	//  170  363:istore          10
		obj = ((Object) (((PdfContentParser) (abyte0)).readPRObject()));
	//  171  365:aload_1         
	//  172  366:invokevirtual   #427 <Method PdfObject PdfContentParser.readPRObject()>
	//  173  369:astore          11
		if(!((PdfObject) (obj)).isString()) goto _L8; else goto _L7
	//  174  371:aload           11
	//  175  373:invokevirtual   #459 <Method boolean PdfObject.isString()>
	//  176  376:ifeq            485
_L7:
		obj = ((Object) (decodeString((PdfString)obj)));
	//  177  379:aload_0         
	//  178  380:aload           11
	//  179  382:checkcast       #144 <Class PdfString>
	//  180  385:invokespecial   #442 <Method String decodeString(PdfString)>
	//  181  388:astore          11
		if(((String) (obj)).length() != 1) goto _L4; else goto _L9
	//  182  390:aload           11
	//  183  392:invokevirtual   #335 <Method int String.length()>
	//  184  395:iconst_1        
	//  185  396:icmpne          305
_L9:
		int i1 = ((int) (((String) (obj)).charAt(((String) (obj)).length() - 1)));
	//  186  399:aload           11
	//  187  401:aload           11
	//  188  403:invokevirtual   #335 <Method int String.length()>
	//  189  406:iconst_1        
	//  190  407:isub            
	//  191  408:invokevirtual   #339 <Method char String.charAt(int)>
	//  192  411:istore          7
		int j1 = k1;
	//  193  413:iload           9
	//  194  415:istore          8
_L11:
		if(j1 > c2) goto _L4; else goto _L10
	//  195  417:iload           8
	//  196  419:iload           10
	//  197  421:icmpgt          305
_L10:
		k1 = i;
	//  198  424:iload_3         
	//  199  425:istore          9
		if(inthashtable.containsKey(j1))
	//* 200  427:aload_2         
	//* 201  428:iload           8
	//* 202  430:invokevirtual   #445 <Method boolean IntHashtable.containsKey(int)>
	//* 203  433:ifeq            444
			k1 = inthashtable.get(j1);
	//  204  436:aload_2         
	//  205  437:iload           8
	//  206  439:invokevirtual   #250 <Method int IntHashtable.get(int)>
	//  207  442:istore          9
		metrics.put(((Object) (Integer.valueOf(i1))), ((Object) (new int[] {
			j1, k1
		})));
	//  208  444:aload_0         
	//  209  445:getfield        #54  <Field HashMap metrics>
	//  210  448:iload           7
	//  211  450:invokestatic    #449 <Method Integer Integer.valueOf(int)>
	//  212  453:iconst_2        
	//  213  454:newarray        int[]
	//  214  456:dup             
	//  215  457:iconst_0        
	//  216  458:iload           8
	//  217  460:iastore         
	//  218  461:dup             
	//  219  462:iconst_1        
	//  220  463:iload           9
	//  221  465:iastore         
	//  222  466:invokevirtual   #452 <Method Object HashMap.put(Object, Object)>
	//  223  469:pop             
		j1++;
	//  224  470:iload           8
	//  225  472:iconst_1        
	//  226  473:iadd            
	//  227  474:istore          8
		i1++;
	//  228  476:iload           7
	//  229  478:iconst_1        
	//  230  479:iadd            
	//  231  480:istore          7
		  goto _L11
	//* 232  482:goto            417
_L8:
		obj = ((Object) ((PdfArray)obj));
	//  233  485:aload           11
	//  234  487:checkcast       #302 <Class PdfArray>
	//  235  490:astore          11
		j1 = 0;
	//  236  492:iconst_0        
	//  237  493:istore          8
		i1 = k1;
	//  238  495:iload           9
	//  239  497:istore          7
_L13:
		if(j1 >= ((PdfArray) (obj)).size()) goto _L4; else goto _L12
	//  240  499:iload           8
	//  241  501:aload           11
	//  242  503:invokevirtual   #305 <Method int PdfArray.size()>
	//  243  506:icmpge          305
_L12:
		String s2 = decodeString(((PdfArray) (obj)).getAsString(j1));
	//  244  509:aload_0         
	//  245  510:aload           11
	//  246  512:iload           8
	//  247  514:invokevirtual   #463 <Method PdfString PdfArray.getAsString(int)>
	//  248  517:invokespecial   #442 <Method String decodeString(PdfString)>
	//  249  520:astore          12
		if(s2.length() != 1)
			break MISSING_BLOCK_LABEL_591;
	//  250  522:aload           12
	//  251  524:invokevirtual   #335 <Method int String.length()>
	//  252  527:iconst_1        
	//  253  528:icmpne          591
		c2 = s2.charAt(s2.length() - 1);
	//  254  531:aload           12
	//  255  533:aload           12
	//  256  535:invokevirtual   #335 <Method int String.length()>
	//  257  538:iconst_1        
	//  258  539:isub            
	//  259  540:invokevirtual   #339 <Method char String.charAt(int)>
	//  260  543:istore          10
		k1 = i;
	//  261  545:iload_3         
	//  262  546:istore          9
		if(inthashtable.containsKey(i1))
	//* 263  548:aload_2         
	//* 264  549:iload           7
	//* 265  551:invokevirtual   #445 <Method boolean IntHashtable.containsKey(int)>
	//* 266  554:ifeq            565
			k1 = inthashtable.get(i1);
	//  267  557:aload_2         
	//  268  558:iload           7
	//  269  560:invokevirtual   #250 <Method int IntHashtable.get(int)>
	//  270  563:istore          9
		metrics.put(((Object) (Integer.valueOf(((int) (c2))))), ((Object) (new int[] {
			i1, k1
		})));
	//  271  565:aload_0         
	//  272  566:getfield        #54  <Field HashMap metrics>
	//  273  569:iload           10
	//  274  571:invokestatic    #449 <Method Integer Integer.valueOf(int)>
	//  275  574:iconst_2        
	//  276  575:newarray        int[]
	//  277  577:dup             
	//  278  578:iconst_0        
	//  279  579:iload           7
	//  280  581:iastore         
	//  281  582:dup             
	//  282  583:iconst_1        
	//  283  584:iload           9
	//  284  586:iastore         
	//  285  587:invokevirtual   #452 <Method Object HashMap.put(Object, Object)>
	//  286  590:pop             
		j1++;
	//  287  591:iload           8
	//  288  593:iconst_1        
	//  289  594:iadd            
	//  290  595:istore          8
		i1++;
	//  291  597:iload           7
	//  292  599:iconst_1        
	//  293  600:iadd            
	//  294  601:istore          7
		  goto _L13
	//* 295  603:goto            499
	}

	private void fillMetricsIdentity(IntHashtable inthashtable, int i)
	{
		for(int j = 0; j < 0x10000; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:ldc2            #466 <Int 0x10000>
	//*   4    6:icmpge          58
		{
			int k = i;
	//    5    9:iload_2         
	//    6   10:istore          4
			if(inthashtable.containsKey(j))
	//*   7   12:aload_1         
	//*   8   13:iload_3         
	//*   9   14:invokevirtual   #445 <Method boolean IntHashtable.containsKey(int)>
	//*  10   17:ifeq            27
				k = inthashtable.get(j);
	//   11   20:aload_1         
	//   12   21:iload_3         
	//   13   22:invokevirtual   #250 <Method int IntHashtable.get(int)>
	//   14   25:istore          4
			metrics.put(((Object) (Integer.valueOf(j))), ((Object) (new int[] {
				j, k
			})));
	//   15   27:aload_0         
	//   16   28:getfield        #54  <Field HashMap metrics>
	//   17   31:iload_3         
	//   18   32:invokestatic    #449 <Method Integer Integer.valueOf(int)>
	//   19   35:iconst_2        
	//   20   36:newarray        int[]
	//   21   38:dup             
	//   22   39:iconst_0        
	//   23   40:iload_3         
	//   24   41:iastore         
	//   25   42:dup             
	//   26   43:iconst_1        
	//   27   44:iload           4
	//   28   46:iastore         
	//   29   47:invokevirtual   #452 <Method Object HashMap.put(Object, Object)>
	//   30   50:pop             
		}

	//   31   51:iload_3         
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:istore_3        
	//*  35   55:goto            2
	//   36   58:return          
	}

	private void fillWidths()
	{
		PdfArray pdfarray = font.getAsArray(PdfName.WIDTHS);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field PdfDictionary font>
	//    2    4:getstatic       #469 <Field PdfName PdfName.WIDTHS>
	//    3    7:invokevirtual   #300 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//    4   10:astore_3        
		PdfNumber pdfnumber = font.getAsNumber(PdfName.FIRSTCHAR);
	//    5   11:aload_0         
	//    6   12:getfield        #101 <Field PdfDictionary font>
	//    7   15:getstatic       #472 <Field PdfName PdfName.FIRSTCHAR>
	//    8   18:invokevirtual   #368 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//    9   21:astore          4
		PdfNumber pdfnumber1 = font.getAsNumber(PdfName.LASTCHAR);
	//   10   23:aload_0         
	//   11   24:getfield        #101 <Field PdfDictionary font>
	//   12   27:getstatic       #475 <Field PdfName PdfName.LASTCHAR>
	//   13   30:invokevirtual   #368 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   14   33:astore          5
		if(pdfnumber != null && pdfnumber1 != null && pdfarray != null)
	//*  15   35:aload           4
	//*  16   37:ifnull          127
	//*  17   40:aload           5
	//*  18   42:ifnull          127
	//*  19   45:aload_3         
	//*  20   46:ifnull          127
		{
			int k = pdfnumber.intValue();
	//   21   49:aload           4
	//   22   51:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//   23   54:istore_2        
			int i = k + pdfarray.size();
	//   24   55:iload_2         
	//   25   56:aload_3         
	//   26   57:invokevirtual   #305 <Method int PdfArray.size()>
	//   27   60:iadd            
	//   28   61:istore_1        
			if(widths.length < i)
	//*  29   62:aload_0         
	//*  30   63:getfield        #253 <Field int[] widths>
	//*  31   66:arraylength     
	//*  32   67:iload_1         
	//*  33   68:icmpge          94
			{
				int ai[] = new int[i];
	//   34   71:iload_1         
	//   35   72:newarray        int[]
	//   36   74:astore          4
				System.arraycopy(((Object) (widths)), 0, ((Object) (ai)), 0, k);
	//   37   76:aload_0         
	//   38   77:getfield        #253 <Field int[] widths>
	//   39   80:iconst_0        
	//   40   81:aload           4
	//   41   83:iconst_0        
	//   42   84:iload_2         
	//   43   85:invokestatic    #481 <Method void System.arraycopy(Object, int, Object, int, int)>
				widths = ai;
	//   44   88:aload_0         
	//   45   89:aload           4
	//   46   91:putfield        #253 <Field int[] widths>
			}
			for(int j = 0; j < pdfarray.size(); j++)
	//*  47   94:iconst_0        
	//*  48   95:istore_1        
	//*  49   96:iload_1         
	//*  50   97:aload_3         
	//*  51   98:invokevirtual   #305 <Method int PdfArray.size()>
	//*  52  101:icmpge          127
				widths[k + j] = pdfarray.getAsNumber(j).intValue();
	//   53  104:aload_0         
	//   54  105:getfield        #253 <Field int[] widths>
	//   55  108:iload_2         
	//   56  109:iload_1         
	//   57  110:iadd            
	//   58  111:aload_3         
	//   59  112:iload_1         
	//   60  113:invokevirtual   #390 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   61  116:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//   62  119:iastore         

	//   63  120:iload_1         
	//   64  121:iconst_1        
	//   65  122:iadd            
	//   66  123:istore_1        
		}
	//*  67  124:goto            96
	//   68  127:return          
	}

	private void init()
	{
		encoding = "";
	//    0    0:aload_0         
	//    1    1:ldc2            #483 <String "">
	//    2    4:putfield        #361 <Field String encoding>
		fontSpecific = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #486 <Field boolean fontSpecific>
		fontType = 4;
	//    6   12:aload_0         
	//    7   13:iconst_4        
	//    8   14:putfield        #489 <Field int fontType>
		Object obj = ((Object) (font.getAsName(PdfName.BASEFONT)));
	//    9   17:aload_0         
	//   10   18:getfield        #101 <Field PdfDictionary font>
	//   11   21:getstatic       #169 <Field PdfName PdfName.BASEFONT>
	//   12   24:invokevirtual   #173 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   13   27:astore_1        
		if(obj != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          81
			obj = ((Object) (PdfName.decodeName(((PdfName) (obj)).toString())));
	//   16   32:aload_1         
	//   17   33:invokevirtual   #317 <Method String PdfName.toString()>
	//   18   36:invokestatic    #321 <Method String PdfName.decodeName(String)>
	//   19   39:astore_1        
		else
	//*  20   40:aload_0         
	//*  21   41:aload_1         
	//*  22   42:putfield        #178 <Field String fontName>
	//*  23   45:aload_0         
	//*  24   46:getfield        #101 <Field PdfDictionary font>
	//*  25   49:getstatic       #492 <Field PdfName PdfName.SUBTYPE>
	//*  26   52:invokevirtual   #173 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  27   55:astore_1        
	//*  28   56:getstatic       #495 <Field PdfName PdfName.TYPE1>
	//*  29   59:aload_1         
	//*  30   60:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//*  31   63:ifne            76
	//*  32   66:getstatic       #498 <Field PdfName PdfName.TRUETYPE>
	//*  33   69:aload_1         
	//*  34   70:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//*  35   73:ifeq            88
	//*  36   76:aload_0         
	//*  37   77:invokespecial   #500 <Method void doType1TT()>
	//*  38   80:return          
			obj = "Unspecified Font Name";
	//   39   81:ldc2            #502 <String "Unspecified Font Name">
	//   40   84:astore_1        
		fontName = ((String) (obj));
		obj = ((Object) (font.getAsName(PdfName.SUBTYPE)));
		if(PdfName.TYPE1.equals(obj) || PdfName.TRUETYPE.equals(obj))
		{
			doType1TT();
		} else
	//*  41   85:goto            40
		{
			if(PdfName.TYPE3.equals(obj))
	//*  42   88:getstatic       #505 <Field PdfName PdfName.TYPE3>
	//*  43   91:aload_1         
	//*  44   92:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//*  45   95:ifeq            123
			{
				fillEncoding(((PdfName) (null)));
	//   46   98:aload_0         
	//   47   99:aconst_null     
	//   48  100:invokespecial   #195 <Method void fillEncoding(PdfName)>
				fillDiffMap(font.getAsDict(PdfName.ENCODING), ((CMapToUnicode) (null)));
	//   49  103:aload_0         
	//   50  104:aload_0         
	//   51  105:getfield        #101 <Field PdfDictionary font>
	//   52  108:getstatic       #111 <Field PdfName PdfName.ENCODING>
	//   53  111:invokevirtual   #290 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   54  114:aconst_null     
	//   55  115:invokespecial   #273 <Method void fillDiffMap(PdfDictionary, CMapToUnicode)>
				fillWidths();
	//   56  118:aload_0         
	//   57  119:invokespecial   #283 <Method void fillWidths()>
				return;
	//   58  122:return          
			}
			Object obj1 = ((Object) (font.getAsName(PdfName.ENCODING)));
	//   59  123:aload_0         
	//   60  124:getfield        #101 <Field PdfDictionary font>
	//   61  127:getstatic       #111 <Field PdfName PdfName.ENCODING>
	//   62  130:invokevirtual   #173 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   63  133:astore_2        
			if(obj1 != null)
	//*  64  134:aload_2         
	//*  65  135:ifnull          80
			{
				obj1 = ((Object) (PdfName.decodeName(((PdfName) (obj1)).toString())));
	//   66  138:aload_2         
	//   67  139:invokevirtual   #317 <Method String PdfName.toString()>
	//   68  142:invokestatic    #321 <Method String PdfName.decodeName(String)>
	//   69  145:astore_2        
				String s = CJKFont.GetCompatibleFont(((String) (obj1)));
	//   70  146:aload_2         
	//   71  147:invokestatic    #510 <Method String CJKFont.GetCompatibleFont(String)>
	//   72  150:astore_3        
				if(s != null)
	//*  73  151:aload_3         
	//*  74  152:ifnull          184
				{
					try
					{
						cjkMirror = BaseFont.createFont(s, ((String) (obj1)), false);
	//   75  155:aload_0         
	//   76  156:aload_3         
	//   77  157:aload_2         
	//   78  158:iconst_0        
	//   79  159:invokestatic    #243 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//   80  162:putfield        #512 <Field BaseFont cjkMirror>
					}
	//*  81  165:aload_0         
	//*  82  166:aload_2         
	//*  83  167:putfield        #514 <Field String cjkEncoding>
	//*  84  170:aload_0         
	//*  85  171:aload_0         
	//*  86  172:getfield        #512 <Field BaseFont cjkMirror>
	//*  87  175:checkcast       #507 <Class CJKFont>
	//*  88  178:invokevirtual   #517 <Method String CJKFont.getUniMap()>
	//*  89  181:putfield        #519 <Field String uniMap>
	//*  90  184:getstatic       #522 <Field PdfName PdfName.TYPE0>
	//*  91  187:aload_1         
	//*  92  188:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//*  93  191:ifeq            80
	//*  94  194:aload_0         
	//*  95  195:iconst_1        
	//*  96  196:putfield        #87  <Field boolean isType0>
	//*  97  199:aload_2         
	//*  98  200:ldc2            #524 <String "Identity-H">
	//*  99  203:invokevirtual   #434 <Method boolean String.equals(Object)>
	//* 100  206:ifne            318
	//* 101  209:aload_0         
	//* 102  210:getfield        #512 <Field BaseFont cjkMirror>
	//* 103  213:ifnull          318
	//* 104  216:aload_0         
	//* 105  217:getfield        #101 <Field PdfDictionary font>
	//* 106  220:getstatic       #527 <Field PdfName PdfName.DESCENDANTFONTS>
	//* 107  223:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 108  226:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 109  229:checkcast       #302 <Class PdfArray>
	//* 110  232:iconst_0        
	//* 111  233:invokevirtual   #308 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 112  236:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 113  239:checkcast       #99  <Class PdfDictionary>
	//* 114  242:astore_1        
	//* 115  243:aload_1         
	//* 116  244:getstatic       #533 <Field PdfName PdfName.DW>
	//* 117  247:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 118  250:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 119  253:checkcast       #313 <Class PdfNumber>
	//* 120  256:astore_2        
	//* 121  257:aload_2         
	//* 122  258:ifnull          269
	//* 123  261:aload_0         
	//* 124  262:aload_2         
	//* 125  263:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//* 126  266:putfield        #89  <Field int defaultWidth>
	//* 127  269:aload_0         
	//* 128  270:aload_0         
	//* 129  271:aload_1         
	//* 130  272:getstatic       #536 <Field PdfName PdfName.W>
	//* 131  275:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 132  278:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 133  281:checkcast       #302 <Class PdfArray>
	//* 134  284:invokespecial   #540 <Method IntHashtable readWidths(PdfArray)>
	//* 135  287:putfield        #542 <Field IntHashtable hMetrics>
	//* 136  290:aload_0         
	//* 137  291:aload_1         
	//* 138  292:getstatic       #286 <Field PdfName PdfName.FONTDESCRIPTOR>
	//* 139  295:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 140  298:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 141  301:checkcast       #99  <Class PdfDictionary>
	//* 142  304:invokespecial   #293 <Method void fillFontDesc(PdfDictionary)>
	//* 143  307:return          
					catch(Exception exception)
	//* 144  308:astore_1        
					{
						throw new ExceptionConverter(exception);
	//  145  309:new             #229 <Class ExceptionConverter>
	//  146  312:dup             
	//  147  313:aload_1         
	//  148  314:invokespecial   #232 <Method void ExceptionConverter(Exception)>
	//  149  317:athrow          
					}
					cjkEncoding = ((String) (obj1));
					uniMap = ((CJKFont)cjkMirror).getUniMap();
				}
				if(PdfName.TYPE0.equals(obj))
				{
					isType0 = true;
					if(!((String) (obj1)).equals("Identity-H") && cjkMirror != null)
					{
						obj = ((Object) ((PdfDictionary)PdfReader.getPdfObjectRelease(((PdfArray)PdfReader.getPdfObjectRelease(font.get(PdfName.DESCENDANTFONTS))).getPdfObject(0))));
						obj1 = ((Object) ((PdfNumber)PdfReader.getPdfObjectRelease(((PdfDictionary) (obj)).get(PdfName.DW))));
						if(obj1 != null)
							defaultWidth = ((PdfNumber) (obj1)).intValue();
						hMetrics = readWidths((PdfArray)PdfReader.getPdfObjectRelease(((PdfDictionary) (obj)).get(PdfName.W)));
						fillFontDesc((PdfDictionary)PdfReader.getPdfObjectRelease(((PdfDictionary) (obj)).get(PdfName.FONTDESCRIPTOR)));
						return;
					} else
					{
						processType0(font);
	//  150  318:aload_0         
	//  151  319:aload_0         
	//  152  320:getfield        #101 <Field PdfDictionary font>
	//  153  323:invokespecial   #545 <Method void processType0(PdfDictionary)>
						return;
	//  154  326:return          
					}
				}
			}
		}
	}

	private CMapToUnicode processToUnicode()
	{
		CMapToUnicode cmaptounicode;
		Object obj;
		cmaptounicode = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		obj = ((Object) (PdfReader.getPdfObjectRelease(font.get(PdfName.TOUNICODE))));
	//    2    2:aload_0         
	//    3    3:getfield        #101 <Field PdfDictionary font>
	//    4    6:getstatic       #548 <Field PdfName PdfName.TOUNICODE>
	//    5    9:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//    6   12:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    7   15:astore_2        
		if(!(obj instanceof PRStream))
			break MISSING_BLOCK_LABEL_54;
	//    8   16:aload_2         
	//    9   17:instanceof      #550 <Class PRStream>
	//   10   20:ifeq            54
		obj = ((Object) (new CidLocationFromByte(PdfReader.getStreamBytes((PRStream)obj))));
	//   11   23:new             #552 <Class CidLocationFromByte>
	//   12   26:dup             
	//   13   27:aload_2         
	//   14   28:checkcast       #550 <Class PRStream>
	//   15   31:invokestatic    #556 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   16   34:invokespecial   #559 <Method void CidLocationFromByte(byte[])>
	//   17   37:astore_2        
		cmaptounicode = new CMapToUnicode();
	//   18   38:new             #201 <Class CMapToUnicode>
	//   19   41:dup             
	//   20   42:invokespecial   #326 <Method void CMapToUnicode()>
	//   21   45:astore_1        
		CMapParserEx.parseCid("", ((com.itextpdf.text.pdf.fonts.cmaps.AbstractCMap) (cmaptounicode)), ((com.itextpdf.text.pdf.fonts.cmaps.CidLocation) (obj)));
	//   22   46:ldc2            #483 <String "">
	//   23   49:aload_1         
	//   24   50:aload_2         
	//   25   51:invokestatic    #565 <Method void CMapParserEx.parseCid(String, com.itextpdf.text.pdf.fonts.cmaps.AbstractCMap, com.itextpdf.text.pdf.fonts.cmaps.CidLocation)>
		return cmaptounicode;
	//   26   54:aload_1         
	//   27   55:areturn         
		Exception exception;
		exception;
	//   28   56:astore_1        
_L2:
		return null;
	//   29   57:aconst_null     
	//   30   58:areturn         
		exception;
	//   31   59:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  32   60:goto            57
	}

	private void processType0(PdfDictionary pdfdictionary)
	{
		int i;
		PdfObject pdfobject;
		Object obj;
		try
		{
			pdfobject = PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.TOUNICODE));
	//    0    0:aload_1         
	//    1    1:getstatic       #548 <Field PdfName PdfName.TOUNICODE>
	//    2    4:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//    3    7:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    4   10:astore_3        
			pdfdictionary = (PdfDictionary)PdfReader.getPdfObjectRelease(((PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.DESCENDANTFONTS))).getPdfObject(0));
	//    5   11:aload_1         
	//    6   12:getstatic       #527 <Field PdfName PdfName.DESCENDANTFONTS>
	//    7   15:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//    8   18:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    9   21:checkcast       #302 <Class PdfArray>
	//   10   24:iconst_0        
	//   11   25:invokevirtual   #308 <Method PdfObject PdfArray.getPdfObject(int)>
	//   12   28:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   13   31:checkcast       #99  <Class PdfDictionary>
	//   14   34:astore_1        
			obj = ((Object) ((PdfNumber)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.DW))));
	//   15   35:aload_1         
	//   16   36:getstatic       #533 <Field PdfName PdfName.DW>
	//   17   39:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//   18   42:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   19   45:checkcast       #313 <Class PdfNumber>
	//   20   48:astore          4
		}
	//*  21   50:sipush          1000
	//*  22   53:istore_2        
	//*  23   54:aload           4
	//*  24   56:ifnull          65
	//*  25   59:aload           4
	//*  26   61:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//*  27   64:istore_2        
	//*  28   65:aload_0         
	//*  29   66:aload_1         
	//*  30   67:getstatic       #536 <Field PdfName PdfName.W>
	//*  31   70:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  32   73:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//*  33   76:checkcast       #302 <Class PdfArray>
	//*  34   79:invokespecial   #540 <Method IntHashtable readWidths(PdfArray)>
	//*  35   82:astore          4
	//*  36   84:aload_0         
	//*  37   85:aload_1         
	//*  38   86:getstatic       #286 <Field PdfName PdfName.FONTDESCRIPTOR>
	//*  39   89:invokevirtual   #115 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  40   92:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//*  41   95:checkcast       #99  <Class PdfDictionary>
	//*  42   98:invokespecial   #293 <Method void fillFontDesc(PdfDictionary)>
	//*  43  101:aload_3         
	//*  44  102:instanceof      #550 <Class PRStream>
	//*  45  105:ifeq            123
	//*  46  108:aload_0         
	//*  47  109:aload_3         
	//*  48  110:checkcast       #550 <Class PRStream>
	//*  49  113:invokestatic    #556 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//*  50  116:aload           4
	//*  51  118:iload_2         
	//*  52  119:invokespecial   #567 <Method void fillMetrics(byte[], IntHashtable, int)>
	//*  53  122:return          
	//*  54  123:new             #107 <Class PdfName>
	//*  55  126:dup             
	//*  56  127:ldc2            #524 <String "Identity-H">
	//*  57  130:invokespecial   #570 <Method void PdfName(String)>
	//*  58  133:aload_3         
	//*  59  134:invokevirtual   #188 <Method boolean PdfName.equals(Object)>
	//*  60  137:ifeq            158
	//*  61  140:aload_0         
	//*  62  141:aload           4
	//*  63  143:iload_2         
	//*  64  144:invokespecial   #572 <Method void fillMetricsIdentity(IntHashtable, int)>
	//*  65  147:return          
		// Misplaced declaration of an exception variable
		catch(PdfDictionary pdfdictionary)
	//*  66  148:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfdictionary)));
	//   67  149:new             #229 <Class ExceptionConverter>
	//   68  152:dup             
	//   69  153:aload_1         
	//   70  154:invokespecial   #232 <Method void ExceptionConverter(Exception)>
	//   71  157:athrow          
		}
		i = 1000;
		if(obj == null)
			break MISSING_BLOCK_LABEL_65;
		i = ((PdfNumber) (obj)).intValue();
		obj = ((Object) (readWidths((PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.W)))));
		fillFontDesc((PdfDictionary)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.FONTDESCRIPTOR)));
		if(pdfobject instanceof PRStream)
		{
			fillMetrics(PdfReader.getStreamBytes((PRStream)pdfobject), ((IntHashtable) (obj)), i);
			return;
		}
		if((new PdfName("Identity-H")).equals(((Object) (pdfobject))))
		{
			fillMetricsIdentity(((IntHashtable) (obj)), i);
			return;
		}
	//   72  158:return          
	}

	private IntHashtable readWidths(PdfArray pdfarray)
	{
		IntHashtable inthashtable = new IntHashtable();
	//    0    0:new             #56  <Class IntHashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void IntHashtable()>
	//    3    7:astore          7
		if(pdfarray != null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       16
	//*   6   13:aload           7
	//*   7   15:areturn         
		{
			int j = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
			while(j < pdfarray.size()) 
	//*  10   18:iload_3         
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #305 <Method int PdfArray.size()>
	//*  13   23:icmpge          13
			{
				int i = ((PdfNumber)PdfReader.getPdfObjectRelease(pdfarray.getPdfObject(j))).intValue();
	//   14   26:aload_1         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #308 <Method PdfObject PdfArray.getPdfObject(int)>
	//   17   31:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   18   34:checkcast       #313 <Class PdfNumber>
	//   19   37:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//   20   40:istore_2        
				int i1 = j + 1;
	//   21   41:iload_3         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          5
				Object obj = ((Object) (PdfReader.getPdfObjectRelease(pdfarray.getPdfObject(i1))));
	//   25   46:aload_1         
	//   26   47:iload           5
	//   27   49:invokevirtual   #308 <Method PdfObject PdfArray.getPdfObject(int)>
	//   28   52:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   29   55:astore          8
				if(((PdfObject) (obj)).isArray())
	//*  30   57:aload           8
	//*  31   59:invokevirtual   #575 <Method boolean PdfObject.isArray()>
	//*  32   62:ifeq            126
				{
					obj = ((Object) ((PdfArray)obj));
	//   33   65:aload           8
	//   34   67:checkcast       #302 <Class PdfArray>
	//   35   70:astore          8
					int k = 0;
	//   36   72:iconst_0        
	//   37   73:istore          4
					j = i;
	//   38   75:iload_2         
	//   39   76:istore_3        
					do
					{
						i = i1;
	//   40   77:iload           5
	//   41   79:istore_2        
						if(k >= ((PdfArray) (obj)).size())
							break;
	//   42   80:iload           4
	//   43   82:aload           8
	//   44   84:invokevirtual   #305 <Method int PdfArray.size()>
	//   45   87:icmpge          186
						inthashtable.put(j, ((PdfNumber)PdfReader.getPdfObjectRelease(((PdfArray) (obj)).getPdfObject(k))).intValue());
	//   46   90:aload           7
	//   47   92:iload_3         
	//   48   93:aload           8
	//   49   95:iload           4
	//   50   97:invokevirtual   #308 <Method PdfObject PdfArray.getPdfObject(int)>
	//   51  100:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   52  103:checkcast       #313 <Class PdfNumber>
	//   53  106:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//   54  109:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//   55  112:pop             
						k++;
	//   56  113:iload           4
	//   57  115:iconst_1        
	//   58  116:iadd            
	//   59  117:istore          4
						j++;
	//   60  119:iload_3         
	//   61  120:iconst_1        
	//   62  121:iadd            
	//   63  122:istore_3        
					} while(true);
	//   64  123:goto            77
				} else
				{
					int j1 = ((PdfNumber)obj).intValue();
	//   65  126:aload           8
	//   66  128:checkcast       #313 <Class PdfNumber>
	//   67  131:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//   68  134:istore          6
					int l = i1 + 1;
	//   69  136:iload           5
	//   70  138:iconst_1        
	//   71  139:iadd            
	//   72  140:istore          4
					i1 = ((PdfNumber)PdfReader.getPdfObjectRelease(pdfarray.getPdfObject(l))).intValue();
	//   73  142:aload_1         
	//   74  143:iload           4
	//   75  145:invokevirtual   #308 <Method PdfObject PdfArray.getPdfObject(int)>
	//   76  148:invokestatic    #530 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   77  151:checkcast       #313 <Class PdfNumber>
	//   78  154:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//   79  157:istore          5
					j = i;
	//   80  159:iload_2         
	//   81  160:istore_3        
					do
					{
						i = l;
	//   82  161:iload           4
	//   83  163:istore_2        
						if(j > j1)
							break;
	//   84  164:iload_3         
	//   85  165:iload           6
	//   86  167:icmpgt          186
						inthashtable.put(j, i1);
	//   87  170:aload           7
	//   88  172:iload_3         
	//   89  173:iload           5
	//   90  175:invokevirtual   #227 <Method int IntHashtable.put(int, int)>
	//   91  178:pop             
						j++;
	//   92  179:iload_3         
	//   93  180:iconst_1        
	//   94  181:iadd            
	//   95  182:istore_3        
					} while(true);
	//   96  183:goto            161
				}
				j = i + 1;
	//   97  186:iload_2         
	//   98  187:iconst_1        
	//   99  188:iadd            
	//  100  189:istore_3        
			}
		}
		return inthashtable;
	//* 101  190:goto            18
	}

	public boolean charExists(int i)
	{
		if(cjkMirror != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #512 <Field BaseFont cjkMirror>
	//*   2    4:ifnull          16
			return cjkMirror.charExists(i);
	//    3    7:aload_0         
	//    4    8:getfield        #512 <Field BaseFont cjkMirror>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #578 <Method boolean BaseFont.charExists(int)>
	//    7   15:ireturn         
		if(isType0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #87  <Field boolean isType0>
	//*  10   20:ifeq            35
			return metrics.containsKey(((Object) (Integer.valueOf(i))));
	//   11   23:aload_0         
	//   12   24:getfield        #54  <Field HashMap metrics>
	//   13   27:iload_1         
	//   14   28:invokestatic    #449 <Method Integer Integer.valueOf(int)>
	//   15   31:invokevirtual   #182 <Method boolean HashMap.containsKey(Object)>
	//   16   34:ireturn         
		else
			return super.charExists(i);
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:invokespecial   #578 <Method boolean BaseFont.charExists(int)>
	//   20   40:ireturn         
	}

	byte[] convertToBytes(int i)
	{
		if(cjkMirror != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #512 <Field BaseFont cjkMirror>
	//*   2    4:ifnull          16
			return cjkMirror.convertToBytes(i);
	//    3    7:aload_0         
	//    4    8:getfield        #512 <Field BaseFont cjkMirror>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #582 <Method byte[] BaseFont.convertToBytes(int)>
	//    7   15:areturn         
		if(isType0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #87  <Field boolean isType0>
	//*  10   20:ifeq            68
		{
			int ai[] = (int[])metrics.get(((Object) (Integer.valueOf(i))));
	//   11   23:aload_0         
	//   12   24:getfield        #54  <Field HashMap metrics>
	//   13   27:iload_1         
	//   14   28:invokestatic    #449 <Method Integer Integer.valueOf(int)>
	//   15   31:invokevirtual   #585 <Method Object HashMap.get(Object)>
	//   16   34:checkcast       #586 <Class int[]>
	//   17   37:astore_2        
			if(ai != null)
	//*  18   38:aload_2         
	//*  19   39:ifnull          64
			{
				i = ai[0];
	//   20   42:aload_2         
	//   21   43:iconst_0        
	//   22   44:iaload          
	//   23   45:istore_1        
				return (new byte[] {
					(byte)(i / 256), (byte)i
				});
	//   24   46:iconst_2        
	//   25   47:newarray        byte[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:iload_1         
	//   29   52:sipush          256
	//   30   55:idiv            
	//   31   56:int2byte        
	//   32   57:bastore         
	//   33   58:dup             
	//   34   59:iconst_1        
	//   35   60:iload_1         
	//   36   61:int2byte        
	//   37   62:bastore         
	//   38   63:areturn         
			} else
			{
				return new byte[0];
	//   39   64:iconst_0        
	//   40   65:newarray        byte[]
	//   41   67:areturn         
			}
		}
		if(uni2byte.containsKey(i))
	//*  42   68:aload_0         
	//*  43   69:getfield        #59  <Field IntHashtable uni2byte>
	//*  44   72:iload_1         
	//*  45   73:invokevirtual   #445 <Method boolean IntHashtable.containsKey(int)>
	//*  46   76:ifeq            95
			return (new byte[] {
				(byte)uni2byte.get(i)
			});
	//   47   79:iconst_1        
	//   48   80:newarray        byte[]
	//   49   82:dup             
	//   50   83:iconst_0        
	//   51   84:aload_0         
	//   52   85:getfield        #59  <Field IntHashtable uni2byte>
	//   53   88:iload_1         
	//   54   89:invokevirtual   #250 <Method int IntHashtable.get(int)>
	//   55   92:int2byte        
	//   56   93:bastore         
	//   57   94:areturn         
		else
			return new byte[0];
	//   58   95:iconst_0        
	//   59   96:newarray        byte[]
	//   60   98:areturn         
	}

	public byte[] convertToBytes(String s)
	{
		if(cjkMirror == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field BaseFont cjkMirror>
	//    2    4:ifnull          18
_L1:
		s = ((String) (cjkMirror.convertToBytes(s)));
	//    3    7:aload_0         
	//    4    8:getfield        #512 <Field BaseFont cjkMirror>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #589 <Method byte[] BaseFont.convertToBytes(String)>
	//    7   15:astore_1        
_L4:
		return ((byte []) (s));
	//    8   16:aload_1         
	//    9   17:areturn         
_L2:
		if(!isType0)
			break; /* Loop/switch isn't completed */
	//   10   18:aload_0         
	//   11   19:getfield        #87  <Field boolean isType0>
	//   12   22:ifeq            151
		s = ((String) (s.toCharArray()));
	//   13   25:aload_1         
	//   14   26:invokevirtual   #354 <Method char[] String.toCharArray()>
	//   15   29:astore_1        
		int k1 = s.length;
	//   16   30:aload_1         
	//   17   31:arraylength     
	//   18   32:istore          5
		byte abyte0[] = new byte[k1 * 2];
	//   19   34:iload           5
	//   20   36:iconst_2        
	//   21   37:imul            
	//   22   38:newarray        byte[]
	//   23   40:astore          8
		int i1 = 0;
	//   24   42:iconst_0        
	//   25   43:istore          4
		int i;
		int k;
		for(i = 0; i1 < k1; i = k)
	//*  26   45:iconst_0        
	//*  27   46:istore_2        
	//*  28   47:iload           4
	//*  29   49:iload           5
	//*  30   51:icmpge          126
		{
			int ai[] = (int[])metrics.get(((Object) (Integer.valueOf(((int) (s[i1]))))));
	//   31   54:aload_0         
	//   32   55:getfield        #54  <Field HashMap metrics>
	//   33   58:aload_1         
	//   34   59:iload           4
	//   35   61:caload          
	//   36   62:invokestatic    #449 <Method Integer Integer.valueOf(int)>
	//   37   65:invokevirtual   #585 <Method Object HashMap.get(Object)>
	//   38   68:checkcast       #586 <Class int[]>
	//   39   71:astore          9
			k = i;
	//   40   73:iload_2         
	//   41   74:istore_3        
			if(ai != null)
	//*  42   75:aload           9
	//*  43   77:ifnull          115
			{
				int l1 = ai[0];
	//   44   80:aload           9
	//   45   82:iconst_0        
	//   46   83:iaload          
	//   47   84:istore          6
				int i2 = i + 1;
	//   48   86:iload_2         
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:istore          7
				abyte0[i] = (byte)(l1 / 256);
	//   52   91:aload           8
	//   53   93:iload_2         
	//   54   94:iload           6
	//   55   96:sipush          256
	//   56   99:idiv            
	//   57  100:int2byte        
	//   58  101:bastore         
				k = i2 + 1;
	//   59  102:iload           7
	//   60  104:iconst_1        
	//   61  105:iadd            
	//   62  106:istore_3        
				abyte0[i2] = (byte)l1;
	//   63  107:aload           8
	//   64  109:iload           7
	//   65  111:iload           6
	//   66  113:int2byte        
	//   67  114:bastore         
			}
			i1++;
	//   68  115:iload           4
	//   69  117:iconst_1        
	//   70  118:iadd            
	//   71  119:istore          4
		}

	//   72  121:iload_3         
	//   73  122:istore_2        
	//*  74  123:goto            47
		s = ((String) (abyte0));
	//   75  126:aload           8
	//   76  128:astore_1        
		if(i != abyte0.length)
	//*  77  129:iload_2         
	//*  78  130:aload           8
	//*  79  132:arraylength     
	//*  80  133:icmpeq          16
		{
			s = ((String) (new byte[i]));
	//   81  136:iload_2         
	//   82  137:newarray        byte[]
	//   83  139:astore_1        
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (s)), 0, i);
	//   84  140:aload           8
	//   85  142:iconst_0        
	//   86  143:aload_1         
	//   87  144:iconst_0        
	//   88  145:iload_2         
	//   89  146:invokestatic    #481 <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((byte []) (s));
	//   90  149:aload_1         
	//   91  150:areturn         
		}
		if(true) goto _L4; else goto _L3
_L3:
		s = ((String) (s.toCharArray()));
	//   92  151:aload_1         
	//   93  152:invokevirtual   #354 <Method char[] String.toCharArray()>
	//   94  155:astore_1        
		byte abyte1[] = new byte[s.length];
	//   95  156:aload_1         
	//   96  157:arraylength     
	//   97  158:newarray        byte[]
	//   98  160:astore          8
		int l = 0;
	//   99  162:iconst_0        
	//  100  163:istore_3        
		for(int j = 0; j < s.length;)
	//* 101  164:iconst_0        
	//* 102  165:istore_2        
	//* 103  166:iload_2         
	//* 104  167:aload_1         
	//* 105  168:arraylength     
	//* 106  169:icmpge          218
		{
			int j1 = l;
	//  107  172:iload_3         
	//  108  173:istore          4
			if(uni2byte.containsKey(((int) (s[j]))))
	//* 109  175:aload_0         
	//* 110  176:getfield        #59  <Field IntHashtable uni2byte>
	//* 111  179:aload_1         
	//* 112  180:iload_2         
	//* 113  181:caload          
	//* 114  182:invokevirtual   #445 <Method boolean IntHashtable.containsKey(int)>
	//* 115  185:ifeq            208
			{
				abyte1[l] = (byte)uni2byte.get(((int) (s[j])));
	//  116  188:aload           8
	//  117  190:iload_3         
	//  118  191:aload_0         
	//  119  192:getfield        #59  <Field IntHashtable uni2byte>
	//  120  195:aload_1         
	//  121  196:iload_2         
	//  122  197:caload          
	//  123  198:invokevirtual   #250 <Method int IntHashtable.get(int)>
	//  124  201:int2byte        
	//  125  202:bastore         
				j1 = l + 1;
	//  126  203:iload_3         
	//  127  204:iconst_1        
	//  128  205:iadd            
	//  129  206:istore          4
			}
			j++;
	//  130  208:iload_2         
	//  131  209:iconst_1        
	//  132  210:iadd            
	//  133  211:istore_2        
			l = j1;
	//  134  212:iload           4
	//  135  214:istore_3        
		}

	//* 136  215:goto            166
		s = ((String) (abyte1));
	//  137  218:aload           8
	//  138  220:astore_1        
		if(l != abyte1.length)
	//* 139  221:iload_3         
	//* 140  222:aload           8
	//* 141  224:arraylength     
	//* 142  225:icmpeq          16
		{
			s = ((String) (new byte[l]));
	//  143  228:iload_3         
	//  144  229:newarray        byte[]
	//  145  231:astore_1        
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (s)), 0, l);
	//  146  232:aload           8
	//  147  234:iconst_0        
	//  148  235:aload_1         
	//  149  236:iconst_0        
	//  150  237:iload_3         
	//  151  238:invokestatic    #481 <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((byte []) (s));
	//  152  241:aload_1         
	//  153  242:areturn         
		}
		if(true) goto _L4; else goto _L5
_L5:
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
	//    8   12:ldc2            #595 <String "4">
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:ldc2            #483 <String "">
	//   13   21:aastore         
	//   14   22:dup             
	//   15   23:iconst_2        
	//   16   24:ldc2            #483 <String "">
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_3        
	//   20   30:ldc2            #483 <String "">
	//   21   33:aastore         
	//   22   34:dup             
	//   23   35:iconst_4        
	//   24   36:aload_0         
	//   25   37:getfield        #178 <Field String fontName>
	//   26   40:aastore         
	//   27   41:aastore         
	//   28   42:areturn         
	}

	IntHashtable getByte2Uni()
	{
		return byte2uni;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field IntHashtable byte2uni>
	//    2    4:areturn         
	}

	public int[] getCharBBox(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	IntHashtable getDiffmap()
	{
		return diffmap;
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field IntHashtable diffmap>
	//    2    4:areturn         
	}

	public String[][] getFamilyFontName()
	{
		return getFullFontName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #604 <Method String[][] getFullFontName()>
	//    2    4:areturn         
	}

	public float getFontDescriptor(int i, float f)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		if(cjkMirror == null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #512 <Field BaseFont cjkMirror>
	//    4    6:ifnull          21
_L1:
		f1 = cjkMirror.getFontDescriptor(i, f);
	//    5    9:aload_0         
	//    6   10:getfield        #512 <Field BaseFont cjkMirror>
	//    7   13:iload_1         
	//    8   14:fload_2         
	//    9   15:invokevirtual   #280 <Method float BaseFont.getFontDescriptor(int, float)>
	//   10   18:fstore_3        
_L4:
		return f1;
	//   11   19:fload_3         
	//   12   20:freturn         
_L2:
		switch(i)
	//*  13   21:iload_1         
		{
	//*  14   22:tableswitch     1 23: default 128
	//	               1 130
	//	               2 141
	//	               3 152
	//	               4 163
	//	               5 168
	//	               6 179
	//	               7 190
	//	               8 201
	//	               9 130
	//	               10 152
	//	               11 19
	//	               12 212
	//	               13 128
	//	               14 128
	//	               15 128
	//	               16 128
	//	               17 128
	//	               18 128
	//	               19 128
	//	               20 128
	//	               21 128
	//	               22 128
	//	               23 228
		case 13: // '\r'
		case 14: // '\016'
		case 15: // '\017'
		case 16: // '\020'
		case 17: // '\021'
		case 18: // '\022'
		case 19: // '\023'
		case 20: // '\024'
		case 21: // '\025'
		case 22: // '\026'
		default:
			return 0.0F;
	//   15  128:fconst_0        
	//   16  129:freturn         

		case 1: // '\001'
		case 9: // '\t'
			return (ascender * f) / 1000F;
	//   17  130:aload_0         
	//   18  131:getfield        #64  <Field float ascender>
	//   19  134:fload_2         
	//   20  135:fmul            
	//   21  136:ldc2            #276 <Float 1000F>
	//   22  139:fdiv            
	//   23  140:freturn         

		case 2: // '\002'
			return (capHeight * f) / 1000F;
	//   24  141:aload_0         
	//   25  142:getfield        #67  <Field float capHeight>
	//   26  145:fload_2         
	//   27  146:fmul            
	//   28  147:ldc2            #276 <Float 1000F>
	//   29  150:fdiv            
	//   30  151:freturn         

		case 3: // '\003'
		case 10: // '\n'
			return (descender * f) / 1000F;
	//   31  152:aload_0         
	//   32  153:getfield        #70  <Field float descender>
	//   33  156:fload_2         
	//   34  157:fmul            
	//   35  158:ldc2            #276 <Float 1000F>
	//   36  161:fdiv            
	//   37  162:freturn         

		case 4: // '\004'
			return italicAngle;
	//   38  163:aload_0         
	//   39  164:getfield        #72  <Field float italicAngle>
	//   40  167:freturn         

		case 5: // '\005'
			return (llx * f) / 1000F;
	//   41  168:aload_0         
	//   42  169:getfield        #77  <Field float llx>
	//   43  172:fload_2         
	//   44  173:fmul            
	//   45  174:ldc2            #276 <Float 1000F>
	//   46  177:fdiv            
	//   47  178:freturn         

		case 6: // '\006'
			return (lly * f) / 1000F;
	//   48  179:aload_0         
	//   49  180:getfield        #79  <Field float lly>
	//   50  183:fload_2         
	//   51  184:fmul            
	//   52  185:ldc2            #276 <Float 1000F>
	//   53  188:fdiv            
	//   54  189:freturn         

		case 7: // '\007'
			return (urx * f) / 1000F;
	//   55  190:aload_0         
	//   56  191:getfield        #82  <Field float urx>
	//   57  194:fload_2         
	//   58  195:fmul            
	//   59  196:ldc2            #276 <Float 1000F>
	//   60  199:fdiv            
	//   61  200:freturn         

		case 8: // '\b'
			return (ury * f) / 1000F;
	//   62  201:aload_0         
	//   63  202:getfield        #85  <Field float ury>
	//   64  205:fload_2         
	//   65  206:fmul            
	//   66  207:ldc2            #276 <Float 1000F>
	//   67  210:fdiv            
	//   68  211:freturn         

		case 12: // '\f'
			return ((urx - llx) * f) / 1000F;
	//   69  212:aload_0         
	//   70  213:getfield        #82  <Field float urx>
	//   71  216:aload_0         
	//   72  217:getfield        #77  <Field float llx>
	//   73  220:fsub            
	//   74  221:fload_2         
	//   75  222:fmul            
	//   76  223:ldc2            #276 <Float 1000F>
	//   77  226:fdiv            
	//   78  227:freturn         

		case 23: // '\027'
			return (fontWeight * f) / 1000F;
	//   79  228:aload_0         
	//   80  229:getfield        #74  <Field float fontWeight>
	//   81  232:fload_2         
	//   82  233:fmul            
	//   83  234:ldc2            #276 <Float 1000F>
	//   84  237:fdiv            
	//   85  238:freturn         

		case 11: // '\013'
			break;
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	public PdfDictionary getFontDictionary()
	{
		return font;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field PdfDictionary font>
	//    2    4:areturn         
	}

	public double[] getFontMatrix()
	{
		if(font.getAsArray(PdfName.FONTMATRIX) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field PdfDictionary font>
	//*   2    4:getstatic       #611 <Field PdfName PdfName.FONTMATRIX>
	//*   3    7:invokevirtual   #300 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//*   4   10:ifnull          27
			return font.getAsArray(PdfName.FONTMATRIX).asDoubleArray();
	//    5   13:aload_0         
	//    6   14:getfield        #101 <Field PdfDictionary font>
	//    7   17:getstatic       #611 <Field PdfName PdfName.FONTMATRIX>
	//    8   20:invokevirtual   #300 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//    9   23:invokevirtual   #614 <Method double[] PdfArray.asDoubleArray()>
	//   10   26:areturn         
		else
			return DEFAULT_FONT_MATRIX;
	//   11   27:getstatic       #618 <Field double[] DEFAULT_FONT_MATRIX>
	//   12   30:areturn         
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
	//    8   12:ldc2            #483 <String "">
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:ldc2            #483 <String "">
	//   13   21:aastore         
	//   14   22:dup             
	//   15   23:iconst_2        
	//   16   24:ldc2            #483 <String "">
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_3        
	//   20   30:aload_0         
	//   21   31:getfield        #178 <Field String fontName>
	//   22   34:aastore         
	//   23   35:aastore         
	//   24   36:areturn         
	}

	public PdfStream getFullFontStream()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	PdfIndirectReference getIndirectReference()
	{
		if(refFont == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field PRIndirectReference refFont>
	//*   2    4:ifnonnull       18
			throw new IllegalArgumentException("Font reuse not allowed with direct font objects.");
	//    3    7:new             #624 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #626 <String "Font reuse not allowed with direct font objects.">
	//    6   14:invokespecial   #627 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		else
			return ((PdfIndirectReference) (refFont));
	//    8   18:aload_0         
	//    9   19:getfield        #91  <Field PRIndirectReference refFont>
	//   10   22:areturn         
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
	//    1    1:getfield        #178 <Field String fontName>
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

	IntHashtable getUni2Byte()
	{
		return uni2byte;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field IntHashtable uni2byte>
	//    2    4:areturn         
	}

	public int getWidth(int i)
	{
		if(isType0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field boolean isType0>
	//*   2    4:ifeq            85
		{
			if(hMetrics != null && cjkMirror != null && !cjkMirror.isVertical())
	//*   3    7:aload_0         
	//*   4    8:getfield        #542 <Field IntHashtable hMetrics>
	//*   5   11:ifnull          60
	//*   6   14:aload_0         
	//*   7   15:getfield        #512 <Field BaseFont cjkMirror>
	//*   8   18:ifnull          60
	//*   9   21:aload_0         
	//*  10   22:getfield        #512 <Field BaseFont cjkMirror>
	//*  11   25:invokevirtual   #636 <Method boolean BaseFont.isVertical()>
	//*  12   28:ifne            60
			{
				i = cjkMirror.getCidCode(i);
	//   13   31:aload_0         
	//   14   32:getfield        #512 <Field BaseFont cjkMirror>
	//   15   35:iload_1         
	//   16   36:invokevirtual   #639 <Method int BaseFont.getCidCode(int)>
	//   17   39:istore_1        
				i = hMetrics.get(i);
	//   18   40:aload_0         
	//   19   41:getfield        #542 <Field IntHashtable hMetrics>
	//   20   44:iload_1         
	//   21   45:invokevirtual   #250 <Method int IntHashtable.get(int)>
	//   22   48:istore_1        
				if(i > 0)
	//*  23   49:iload_1         
	//*  24   50:ifle            55
					return i;
	//   25   53:iload_1         
	//   26   54:ireturn         
				else
					return defaultWidth;
	//   27   55:aload_0         
	//   28   56:getfield        #89  <Field int defaultWidth>
	//   29   59:ireturn         
			}
			int ai[] = (int[])metrics.get(((Object) (Integer.valueOf(i))));
	//   30   60:aload_0         
	//   31   61:getfield        #54  <Field HashMap metrics>
	//   32   64:iload_1         
	//   33   65:invokestatic    #449 <Method Integer Integer.valueOf(int)>
	//   34   68:invokevirtual   #585 <Method Object HashMap.get(Object)>
	//   35   71:checkcast       #586 <Class int[]>
	//   36   74:astore_2        
			if(ai != null)
	//*  37   75:aload_2         
	//*  38   76:ifnull          83
				return ai[1];
	//   39   79:aload_2         
	//   40   80:iconst_1        
	//   41   81:iaload          
	//   42   82:ireturn         
			else
				return 0;
	//   43   83:iconst_0        
	//   44   84:ireturn         
		}
		if(cjkMirror != null)
	//*  45   85:aload_0         
	//*  46   86:getfield        #512 <Field BaseFont cjkMirror>
	//*  47   89:ifnull          101
			return cjkMirror.getWidth(i);
	//   48   92:aload_0         
	//   49   93:getfield        #512 <Field BaseFont cjkMirror>
	//   50   96:iload_1         
	//   51   97:invokevirtual   #641 <Method int BaseFont.getWidth(int)>
	//   52  100:ireturn         
		else
			return super.getWidth(i);
	//   53  101:aload_0         
	//   54  102:iload_1         
	//   55  103:invokespecial   #641 <Method int BaseFont.getWidth(int)>
	//   56  106:ireturn         
	}

	public int getWidth(String s)
	{
label0:
		{
			int i;
			if(isType0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field boolean isType0>
	//*   2    4:ifeq            222
			{
				int k = 0;
	//    3    7:iconst_0        
	//    4    8:istore          4
				int j = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
				i = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
				if(hMetrics != null && cjkMirror != null && !cjkMirror.isVertical())
	//*   9   14:aload_0         
	//*  10   15:getfield        #542 <Field IntHashtable hMetrics>
	//*  11   18:ifnull          157
	//*  12   21:aload_0         
	//*  13   22:getfield        #512 <Field BaseFont cjkMirror>
	//*  14   25:ifnull          157
	//*  15   28:aload_0         
	//*  16   29:getfield        #512 <Field BaseFont cjkMirror>
	//*  17   32:invokevirtual   #636 <Method boolean BaseFont.isVertical()>
	//*  18   35:ifne            157
				{
					if(((CJKFont)cjkMirror).isIdentity())
	//*  19   38:aload_0         
	//*  20   39:getfield        #512 <Field BaseFont cjkMirror>
	//*  21   42:checkcast       #507 <Class CJKFont>
	//*  22   45:invokevirtual   #645 <Method boolean CJKFont.isIdentity()>
	//*  23   48:ifeq            89
					{
						k = 0;
	//   24   51:iconst_0        
	//   25   52:istore          4
						j = i;
	//   26   54:iload_2         
	//   27   55:istore_3        
						do
						{
							i = j;
	//   28   56:iload_3         
	//   29   57:istore_2        
							if(k >= s.length())
								break;
	//   30   58:iload           4
	//   31   60:aload_1         
	//   32   61:invokevirtual   #335 <Method int String.length()>
	//   33   64:icmpge          238
							j += getWidth(((int) (s.charAt(k))));
	//   34   67:iload_3         
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:iload           4
	//   38   72:invokevirtual   #339 <Method char String.charAt(int)>
	//   39   75:invokevirtual   #646 <Method int getWidth(int)>
	//   40   78:iadd            
	//   41   79:istore_3        
							k++;
	//   42   80:iload           4
	//   43   82:iconst_1        
	//   44   83:iadd            
	//   45   84:istore          4
						} while(true);
	//   46   86:goto            56
					} else
					{
						i = 0;
	//   47   89:iconst_0        
	//   48   90:istore_2        
						j = k;
	//   49   91:iload           4
	//   50   93:istore_3        
						k = i;
	//   51   94:iload_2         
	//   52   95:istore          4
						do
						{
							i = j;
	//   53   97:iload_3         
	//   54   98:istore_2        
							if(k >= s.length())
								break;
	//   55   99:iload           4
	//   56  101:aload_1         
	//   57  102:invokevirtual   #335 <Method int String.length()>
	//   58  105:icmpge          238
							if(Utilities.isSurrogatePair(s, k))
	//*  59  108:aload_1         
	//*  60  109:iload           4
	//*  61  111:invokestatic    #652 <Method boolean Utilities.isSurrogatePair(String, int)>
	//*  62  114:ifeq            147
							{
								i = Utilities.convertToUtf32(s, k);
	//   63  117:aload_1         
	//   64  118:iload           4
	//   65  120:invokestatic    #656 <Method int Utilities.convertToUtf32(String, int)>
	//   66  123:istore_2        
								k++;
	//   67  124:iload           4
	//   68  126:iconst_1        
	//   69  127:iadd            
	//   70  128:istore          4
							} else
	//*  71  130:iload_3         
	//*  72  131:aload_0         
	//*  73  132:iload_2         
	//*  74  133:invokevirtual   #646 <Method int getWidth(int)>
	//*  75  136:iadd            
	//*  76  137:istore_3        
	//*  77  138:iload           4
	//*  78  140:iconst_1        
	//*  79  141:iadd            
	//*  80  142:istore          4
	//*  81  144:goto            97
							{
								i = ((int) (s.charAt(k)));
	//   82  147:aload_1         
	//   83  148:iload           4
	//   84  150:invokevirtual   #339 <Method char String.charAt(int)>
	//   85  153:istore_2        
							}
							j += getWidth(i);
							k++;
						} while(true);
	//   86  154:goto            130
					}
				} else
				{
					s = ((String) (s.toCharArray()));
	//   87  157:aload_1         
	//   88  158:invokevirtual   #354 <Method char[] String.toCharArray()>
	//   89  161:astore_1        
					int i1 = s.length;
	//   90  162:aload_1         
	//   91  163:arraylength     
	//   92  164:istore          5
					int l = 0;
	//   93  166:iconst_0        
	//   94  167:istore          4
					do
					{
						i = j;
	//   95  169:iload_3         
	//   96  170:istore_2        
						if(l >= i1)
							break;
	//   97  171:iload           4
	//   98  173:iload           5
	//   99  175:icmpge          238
						int ai[] = (int[])metrics.get(((Object) (Integer.valueOf(((int) (s[l]))))));
	//  100  178:aload_0         
	//  101  179:getfield        #54  <Field HashMap metrics>
	//  102  182:aload_1         
	//  103  183:iload           4
	//  104  185:caload          
	//  105  186:invokestatic    #449 <Method Integer Integer.valueOf(int)>
	//  106  189:invokevirtual   #585 <Method Object HashMap.get(Object)>
	//  107  192:checkcast       #586 <Class int[]>
	//  108  195:astore          6
						i = j;
	//  109  197:iload_3         
	//  110  198:istore_2        
						if(ai != null)
	//* 111  199:aload           6
	//* 112  201:ifnull          211
							i = j + ai[1];
	//  113  204:iload_3         
	//  114  205:aload           6
	//  115  207:iconst_1        
	//  116  208:iaload          
	//  117  209:iadd            
	//  118  210:istore_2        
						l++;
	//  119  211:iload           4
	//  120  213:iconst_1        
	//  121  214:iadd            
	//  122  215:istore          4
						j = i;
	//  123  217:iload_2         
	//  124  218:istore_3        
					} while(true);
	//  125  219:goto            169
				}
			} else
			{
				if(cjkMirror == null)
					break label0;
	//  126  222:aload_0         
	//  127  223:getfield        #512 <Field BaseFont cjkMirror>
	//  128  226:ifnull          240
				i = cjkMirror.getWidth(s);
	//  129  229:aload_0         
	//  130  230:getfield        #512 <Field BaseFont cjkMirror>
	//  131  233:aload_1         
	//  132  234:invokevirtual   #658 <Method int BaseFont.getWidth(String)>
	//  133  237:istore_2        
			}
			return i;
	//  134  238:iload_2         
	//  135  239:ireturn         
		}
		return super.getWidth(s);
	//  136  240:aload_0         
	//  137  241:aload_1         
	//  138  242:invokespecial   #658 <Method int BaseFont.getWidth(String)>
	//  139  245:ireturn         
	}

	public boolean hasKernPairs()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	boolean isSymbolic()
	{
		Object obj = ((Object) (font.getAsDict(PdfName.FONTDESCRIPTOR)));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field PdfDictionary font>
	//    2    4:getstatic       #286 <Field PdfName PdfName.FONTDESCRIPTOR>
	//    3    7:invokevirtual   #290 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    4   10:astore_1        
		if(obj != null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
	//*   7   15:iconst_0        
	//*   8   16:ireturn         
	//*   9   17:aload_1         
	//*  10   18:getstatic       #662 <Field PdfName PdfName.FLAGS>
	//*  11   21:invokevirtual   #368 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//*  12   24:astore_1        
			if((obj = ((Object) (((PdfDictionary) (obj)).getAsNumber(PdfName.FLAGS)))) != null && (((PdfNumber) (obj)).intValue() & 4) != 0)
	//*  13   25:aload_1         
	//*  14   26:ifnull          15
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #314 <Method int PdfNumber.intValue()>
	//*  17   33:iconst_4        
	//*  18   34:iand            
	//*  19   35:ifeq            15
				return true;
	//   20   38:iconst_1        
	//   21   39:ireturn         
		return false;
	}

	public boolean isVertical()
	{
		if(cjkMirror != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #512 <Field BaseFont cjkMirror>
	//*   2    4:ifnull          15
			return cjkMirror.isVertical();
	//    3    7:aload_0         
	//    4    8:getfield        #512 <Field BaseFont cjkMirror>
	//    5   11:invokevirtual   #636 <Method boolean BaseFont.isVertical()>
	//    6   14:ireturn         
		else
			return super.isVertical();
	//    7   15:aload_0         
	//    8   16:invokespecial   #636 <Method boolean BaseFont.isVertical()>
	//    9   19:ireturn         
	}

	public boolean setKerning(int i, int j, int k)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setPostscriptFontName(String s)
	{
	//    0    0:return          
	}

	void writeFont(PdfWriter pdfwriter, PdfIndirectReference pdfindirectreference, Object aobj[])
		throws DocumentException, IOException
	{
	//    0    0:return          
	}

	private static final int stdEnc[] = {
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 32, 33, 34, 35, 36, 37, 38, 8217, 
		40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 
		50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 
		60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 
		70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 
		80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 
		90, 91, 92, 93, 94, 95, 8216, 97, 98, 99, 
		100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 
		110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 
		120, 121, 122, 123, 124, 125, 126, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 161, 162, 163, 8260, 165, 402, 167, 164, 39, 
		8220, 171, 8249, 8250, 64257, 64258, 0, 8211, 8224, 8225, 
		183, 0, 182, 8226, 8218, 8222, 8221, 187, 8230, 8240, 
		0, 191, 0, 96, 180, 710, 732, 175, 728, 729, 
		168, 0, 730, 184, 0, 733, 731, 711, 8212, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 198, 0, 170, 0, 0, 
		0, 0, 321, 216, 338, 186, 0, 0, 0, 0, 
		0, 230, 0, 0, 0, 305, 0, 0, 322, 248, 
		339, 223, 0, 0, 0, 0
	};
	private float ascender;
	private IntHashtable byte2uni;
	private float capHeight;
	protected String cjkEncoding;
	private BaseFont cjkMirror;
	protected int defaultWidth;
	private float descender;
	private IntHashtable diffmap;
	private PdfDictionary font;
	private String fontName;
	private float fontWeight;
	private IntHashtable hMetrics;
	protected boolean isType0;
	private float italicAngle;
	private float llx;
	private float lly;
	private HashMap metrics;
	private PRIndirectReference refFont;
	private IntHashtable uni2byte;
	protected String uniMap;
	private float urx;
	private float ury;

	static 
	{
	//    0    0:sipush          256
	//    1    3:newarray        int[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:iconst_0        
	//    9   12:iastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:iconst_0        
	//   13   16:iastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:iconst_0        
	//   17   20:iastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:iconst_0        
	//   21   24:iastore         
	//   22   25:dup             
	//   23   26:iconst_5        
	//   24   27:iconst_0        
	//   25   28:iastore         
	//   26   29:dup             
	//   27   30:bipush          6
	//   28   32:iconst_0        
	//   29   33:iastore         
	//   30   34:dup             
	//   31   35:bipush          7
	//   32   37:iconst_0        
	//   33   38:iastore         
	//   34   39:dup             
	//   35   40:bipush          8
	//   36   42:iconst_0        
	//   37   43:iastore         
	//   38   44:dup             
	//   39   45:bipush          9
	//   40   47:iconst_0        
	//   41   48:iastore         
	//   42   49:dup             
	//   43   50:bipush          10
	//   44   52:iconst_0        
	//   45   53:iastore         
	//   46   54:dup             
	//   47   55:bipush          11
	//   48   57:iconst_0        
	//   49   58:iastore         
	//   50   59:dup             
	//   51   60:bipush          12
	//   52   62:iconst_0        
	//   53   63:iastore         
	//   54   64:dup             
	//   55   65:bipush          13
	//   56   67:iconst_0        
	//   57   68:iastore         
	//   58   69:dup             
	//   59   70:bipush          14
	//   60   72:iconst_0        
	//   61   73:iastore         
	//   62   74:dup             
	//   63   75:bipush          15
	//   64   77:iconst_0        
	//   65   78:iastore         
	//   66   79:dup             
	//   67   80:bipush          16
	//   68   82:iconst_0        
	//   69   83:iastore         
	//   70   84:dup             
	//   71   85:bipush          17
	//   72   87:iconst_0        
	//   73   88:iastore         
	//   74   89:dup             
	//   75   90:bipush          18
	//   76   92:iconst_0        
	//   77   93:iastore         
	//   78   94:dup             
	//   79   95:bipush          19
	//   80   97:iconst_0        
	//   81   98:iastore         
	//   82   99:dup             
	//   83  100:bipush          20
	//   84  102:iconst_0        
	//   85  103:iastore         
	//   86  104:dup             
	//   87  105:bipush          21
	//   88  107:iconst_0        
	//   89  108:iastore         
	//   90  109:dup             
	//   91  110:bipush          22
	//   92  112:iconst_0        
	//   93  113:iastore         
	//   94  114:dup             
	//   95  115:bipush          23
	//   96  117:iconst_0        
	//   97  118:iastore         
	//   98  119:dup             
	//   99  120:bipush          24
	//  100  122:iconst_0        
	//  101  123:iastore         
	//  102  124:dup             
	//  103  125:bipush          25
	//  104  127:iconst_0        
	//  105  128:iastore         
	//  106  129:dup             
	//  107  130:bipush          26
	//  108  132:iconst_0        
	//  109  133:iastore         
	//  110  134:dup             
	//  111  135:bipush          27
	//  112  137:iconst_0        
	//  113  138:iastore         
	//  114  139:dup             
	//  115  140:bipush          28
	//  116  142:iconst_0        
	//  117  143:iastore         
	//  118  144:dup             
	//  119  145:bipush          29
	//  120  147:iconst_0        
	//  121  148:iastore         
	//  122  149:dup             
	//  123  150:bipush          30
	//  124  152:iconst_0        
	//  125  153:iastore         
	//  126  154:dup             
	//  127  155:bipush          31
	//  128  157:iconst_0        
	//  129  158:iastore         
	//  130  159:dup             
	//  131  160:bipush          32
	//  132  162:bipush          32
	//  133  164:iastore         
	//  134  165:dup             
	//  135  166:bipush          33
	//  136  168:bipush          33
	//  137  170:iastore         
	//  138  171:dup             
	//  139  172:bipush          34
	//  140  174:bipush          34
	//  141  176:iastore         
	//  142  177:dup             
	//  143  178:bipush          35
	//  144  180:bipush          35
	//  145  182:iastore         
	//  146  183:dup             
	//  147  184:bipush          36
	//  148  186:bipush          36
	//  149  188:iastore         
	//  150  189:dup             
	//  151  190:bipush          37
	//  152  192:bipush          37
	//  153  194:iastore         
	//  154  195:dup             
	//  155  196:bipush          38
	//  156  198:bipush          38
	//  157  200:iastore         
	//  158  201:dup             
	//  159  202:bipush          39
	//  160  204:sipush          8217
	//  161  207:iastore         
	//  162  208:dup             
	//  163  209:bipush          40
	//  164  211:bipush          40
	//  165  213:iastore         
	//  166  214:dup             
	//  167  215:bipush          41
	//  168  217:bipush          41
	//  169  219:iastore         
	//  170  220:dup             
	//  171  221:bipush          42
	//  172  223:bipush          42
	//  173  225:iastore         
	//  174  226:dup             
	//  175  227:bipush          43
	//  176  229:bipush          43
	//  177  231:iastore         
	//  178  232:dup             
	//  179  233:bipush          44
	//  180  235:bipush          44
	//  181  237:iastore         
	//  182  238:dup             
	//  183  239:bipush          45
	//  184  241:bipush          45
	//  185  243:iastore         
	//  186  244:dup             
	//  187  245:bipush          46
	//  188  247:bipush          46
	//  189  249:iastore         
	//  190  250:dup             
	//  191  251:bipush          47
	//  192  253:bipush          47
	//  193  255:iastore         
	//  194  256:dup             
	//  195  257:bipush          48
	//  196  259:bipush          48
	//  197  261:iastore         
	//  198  262:dup             
	//  199  263:bipush          49
	//  200  265:bipush          49
	//  201  267:iastore         
	//  202  268:dup             
	//  203  269:bipush          50
	//  204  271:bipush          50
	//  205  273:iastore         
	//  206  274:dup             
	//  207  275:bipush          51
	//  208  277:bipush          51
	//  209  279:iastore         
	//  210  280:dup             
	//  211  281:bipush          52
	//  212  283:bipush          52
	//  213  285:iastore         
	//  214  286:dup             
	//  215  287:bipush          53
	//  216  289:bipush          53
	//  217  291:iastore         
	//  218  292:dup             
	//  219  293:bipush          54
	//  220  295:bipush          54
	//  221  297:iastore         
	//  222  298:dup             
	//  223  299:bipush          55
	//  224  301:bipush          55
	//  225  303:iastore         
	//  226  304:dup             
	//  227  305:bipush          56
	//  228  307:bipush          56
	//  229  309:iastore         
	//  230  310:dup             
	//  231  311:bipush          57
	//  232  313:bipush          57
	//  233  315:iastore         
	//  234  316:dup             
	//  235  317:bipush          58
	//  236  319:bipush          58
	//  237  321:iastore         
	//  238  322:dup             
	//  239  323:bipush          59
	//  240  325:bipush          59
	//  241  327:iastore         
	//  242  328:dup             
	//  243  329:bipush          60
	//  244  331:bipush          60
	//  245  333:iastore         
	//  246  334:dup             
	//  247  335:bipush          61
	//  248  337:bipush          61
	//  249  339:iastore         
	//  250  340:dup             
	//  251  341:bipush          62
	//  252  343:bipush          62
	//  253  345:iastore         
	//  254  346:dup             
	//  255  347:bipush          63
	//  256  349:bipush          63
	//  257  351:iastore         
	//  258  352:dup             
	//  259  353:bipush          64
	//  260  355:bipush          64
	//  261  357:iastore         
	//  262  358:dup             
	//  263  359:bipush          65
	//  264  361:bipush          65
	//  265  363:iastore         
	//  266  364:dup             
	//  267  365:bipush          66
	//  268  367:bipush          66
	//  269  369:iastore         
	//  270  370:dup             
	//  271  371:bipush          67
	//  272  373:bipush          67
	//  273  375:iastore         
	//  274  376:dup             
	//  275  377:bipush          68
	//  276  379:bipush          68
	//  277  381:iastore         
	//  278  382:dup             
	//  279  383:bipush          69
	//  280  385:bipush          69
	//  281  387:iastore         
	//  282  388:dup             
	//  283  389:bipush          70
	//  284  391:bipush          70
	//  285  393:iastore         
	//  286  394:dup             
	//  287  395:bipush          71
	//  288  397:bipush          71
	//  289  399:iastore         
	//  290  400:dup             
	//  291  401:bipush          72
	//  292  403:bipush          72
	//  293  405:iastore         
	//  294  406:dup             
	//  295  407:bipush          73
	//  296  409:bipush          73
	//  297  411:iastore         
	//  298  412:dup             
	//  299  413:bipush          74
	//  300  415:bipush          74
	//  301  417:iastore         
	//  302  418:dup             
	//  303  419:bipush          75
	//  304  421:bipush          75
	//  305  423:iastore         
	//  306  424:dup             
	//  307  425:bipush          76
	//  308  427:bipush          76
	//  309  429:iastore         
	//  310  430:dup             
	//  311  431:bipush          77
	//  312  433:bipush          77
	//  313  435:iastore         
	//  314  436:dup             
	//  315  437:bipush          78
	//  316  439:bipush          78
	//  317  441:iastore         
	//  318  442:dup             
	//  319  443:bipush          79
	//  320  445:bipush          79
	//  321  447:iastore         
	//  322  448:dup             
	//  323  449:bipush          80
	//  324  451:bipush          80
	//  325  453:iastore         
	//  326  454:dup             
	//  327  455:bipush          81
	//  328  457:bipush          81
	//  329  459:iastore         
	//  330  460:dup             
	//  331  461:bipush          82
	//  332  463:bipush          82
	//  333  465:iastore         
	//  334  466:dup             
	//  335  467:bipush          83
	//  336  469:bipush          83
	//  337  471:iastore         
	//  338  472:dup             
	//  339  473:bipush          84
	//  340  475:bipush          84
	//  341  477:iastore         
	//  342  478:dup             
	//  343  479:bipush          85
	//  344  481:bipush          85
	//  345  483:iastore         
	//  346  484:dup             
	//  347  485:bipush          86
	//  348  487:bipush          86
	//  349  489:iastore         
	//  350  490:dup             
	//  351  491:bipush          87
	//  352  493:bipush          87
	//  353  495:iastore         
	//  354  496:dup             
	//  355  497:bipush          88
	//  356  499:bipush          88
	//  357  501:iastore         
	//  358  502:dup             
	//  359  503:bipush          89
	//  360  505:bipush          89
	//  361  507:iastore         
	//  362  508:dup             
	//  363  509:bipush          90
	//  364  511:bipush          90
	//  365  513:iastore         
	//  366  514:dup             
	//  367  515:bipush          91
	//  368  517:bipush          91
	//  369  519:iastore         
	//  370  520:dup             
	//  371  521:bipush          92
	//  372  523:bipush          92
	//  373  525:iastore         
	//  374  526:dup             
	//  375  527:bipush          93
	//  376  529:bipush          93
	//  377  531:iastore         
	//  378  532:dup             
	//  379  533:bipush          94
	//  380  535:bipush          94
	//  381  537:iastore         
	//  382  538:dup             
	//  383  539:bipush          95
	//  384  541:bipush          95
	//  385  543:iastore         
	//  386  544:dup             
	//  387  545:bipush          96
	//  388  547:sipush          8216
	//  389  550:iastore         
	//  390  551:dup             
	//  391  552:bipush          97
	//  392  554:bipush          97
	//  393  556:iastore         
	//  394  557:dup             
	//  395  558:bipush          98
	//  396  560:bipush          98
	//  397  562:iastore         
	//  398  563:dup             
	//  399  564:bipush          99
	//  400  566:bipush          99
	//  401  568:iastore         
	//  402  569:dup             
	//  403  570:bipush          100
	//  404  572:bipush          100
	//  405  574:iastore         
	//  406  575:dup             
	//  407  576:bipush          101
	//  408  578:bipush          101
	//  409  580:iastore         
	//  410  581:dup             
	//  411  582:bipush          102
	//  412  584:bipush          102
	//  413  586:iastore         
	//  414  587:dup             
	//  415  588:bipush          103
	//  416  590:bipush          103
	//  417  592:iastore         
	//  418  593:dup             
	//  419  594:bipush          104
	//  420  596:bipush          104
	//  421  598:iastore         
	//  422  599:dup             
	//  423  600:bipush          105
	//  424  602:bipush          105
	//  425  604:iastore         
	//  426  605:dup             
	//  427  606:bipush          106
	//  428  608:bipush          106
	//  429  610:iastore         
	//  430  611:dup             
	//  431  612:bipush          107
	//  432  614:bipush          107
	//  433  616:iastore         
	//  434  617:dup             
	//  435  618:bipush          108
	//  436  620:bipush          108
	//  437  622:iastore         
	//  438  623:dup             
	//  439  624:bipush          109
	//  440  626:bipush          109
	//  441  628:iastore         
	//  442  629:dup             
	//  443  630:bipush          110
	//  444  632:bipush          110
	//  445  634:iastore         
	//  446  635:dup             
	//  447  636:bipush          111
	//  448  638:bipush          111
	//  449  640:iastore         
	//  450  641:dup             
	//  451  642:bipush          112
	//  452  644:bipush          112
	//  453  646:iastore         
	//  454  647:dup             
	//  455  648:bipush          113
	//  456  650:bipush          113
	//  457  652:iastore         
	//  458  653:dup             
	//  459  654:bipush          114
	//  460  656:bipush          114
	//  461  658:iastore         
	//  462  659:dup             
	//  463  660:bipush          115
	//  464  662:bipush          115
	//  465  664:iastore         
	//  466  665:dup             
	//  467  666:bipush          116
	//  468  668:bipush          116
	//  469  670:iastore         
	//  470  671:dup             
	//  471  672:bipush          117
	//  472  674:bipush          117
	//  473  676:iastore         
	//  474  677:dup             
	//  475  678:bipush          118
	//  476  680:bipush          118
	//  477  682:iastore         
	//  478  683:dup             
	//  479  684:bipush          119
	//  480  686:bipush          119
	//  481  688:iastore         
	//  482  689:dup             
	//  483  690:bipush          120
	//  484  692:bipush          120
	//  485  694:iastore         
	//  486  695:dup             
	//  487  696:bipush          121
	//  488  698:bipush          121
	//  489  700:iastore         
	//  490  701:dup             
	//  491  702:bipush          122
	//  492  704:bipush          122
	//  493  706:iastore         
	//  494  707:dup             
	//  495  708:bipush          123
	//  496  710:bipush          123
	//  497  712:iastore         
	//  498  713:dup             
	//  499  714:bipush          124
	//  500  716:bipush          124
	//  501  718:iastore         
	//  502  719:dup             
	//  503  720:bipush          125
	//  504  722:bipush          125
	//  505  724:iastore         
	//  506  725:dup             
	//  507  726:bipush          126
	//  508  728:bipush          126
	//  509  730:iastore         
	//  510  731:dup             
	//  511  732:bipush          127
	//  512  734:iconst_0        
	//  513  735:iastore         
	//  514  736:dup             
	//  515  737:sipush          128
	//  516  740:iconst_0        
	//  517  741:iastore         
	//  518  742:dup             
	//  519  743:sipush          129
	//  520  746:iconst_0        
	//  521  747:iastore         
	//  522  748:dup             
	//  523  749:sipush          130
	//  524  752:iconst_0        
	//  525  753:iastore         
	//  526  754:dup             
	//  527  755:sipush          131
	//  528  758:iconst_0        
	//  529  759:iastore         
	//  530  760:dup             
	//  531  761:sipush          132
	//  532  764:iconst_0        
	//  533  765:iastore         
	//  534  766:dup             
	//  535  767:sipush          133
	//  536  770:iconst_0        
	//  537  771:iastore         
	//  538  772:dup             
	//  539  773:sipush          134
	//  540  776:iconst_0        
	//  541  777:iastore         
	//  542  778:dup             
	//  543  779:sipush          135
	//  544  782:iconst_0        
	//  545  783:iastore         
	//  546  784:dup             
	//  547  785:sipush          136
	//  548  788:iconst_0        
	//  549  789:iastore         
	//  550  790:dup             
	//  551  791:sipush          137
	//  552  794:iconst_0        
	//  553  795:iastore         
	//  554  796:dup             
	//  555  797:sipush          138
	//  556  800:iconst_0        
	//  557  801:iastore         
	//  558  802:dup             
	//  559  803:sipush          139
	//  560  806:iconst_0        
	//  561  807:iastore         
	//  562  808:dup             
	//  563  809:sipush          140
	//  564  812:iconst_0        
	//  565  813:iastore         
	//  566  814:dup             
	//  567  815:sipush          141
	//  568  818:iconst_0        
	//  569  819:iastore         
	//  570  820:dup             
	//  571  821:sipush          142
	//  572  824:iconst_0        
	//  573  825:iastore         
	//  574  826:dup             
	//  575  827:sipush          143
	//  576  830:iconst_0        
	//  577  831:iastore         
	//  578  832:dup             
	//  579  833:sipush          144
	//  580  836:iconst_0        
	//  581  837:iastore         
	//  582  838:dup             
	//  583  839:sipush          145
	//  584  842:iconst_0        
	//  585  843:iastore         
	//  586  844:dup             
	//  587  845:sipush          146
	//  588  848:iconst_0        
	//  589  849:iastore         
	//  590  850:dup             
	//  591  851:sipush          147
	//  592  854:iconst_0        
	//  593  855:iastore         
	//  594  856:dup             
	//  595  857:sipush          148
	//  596  860:iconst_0        
	//  597  861:iastore         
	//  598  862:dup             
	//  599  863:sipush          149
	//  600  866:iconst_0        
	//  601  867:iastore         
	//  602  868:dup             
	//  603  869:sipush          150
	//  604  872:iconst_0        
	//  605  873:iastore         
	//  606  874:dup             
	//  607  875:sipush          151
	//  608  878:iconst_0        
	//  609  879:iastore         
	//  610  880:dup             
	//  611  881:sipush          152
	//  612  884:iconst_0        
	//  613  885:iastore         
	//  614  886:dup             
	//  615  887:sipush          153
	//  616  890:iconst_0        
	//  617  891:iastore         
	//  618  892:dup             
	//  619  893:sipush          154
	//  620  896:iconst_0        
	//  621  897:iastore         
	//  622  898:dup             
	//  623  899:sipush          155
	//  624  902:iconst_0        
	//  625  903:iastore         
	//  626  904:dup             
	//  627  905:sipush          156
	//  628  908:iconst_0        
	//  629  909:iastore         
	//  630  910:dup             
	//  631  911:sipush          157
	//  632  914:iconst_0        
	//  633  915:iastore         
	//  634  916:dup             
	//  635  917:sipush          158
	//  636  920:iconst_0        
	//  637  921:iastore         
	//  638  922:dup             
	//  639  923:sipush          159
	//  640  926:iconst_0        
	//  641  927:iastore         
	//  642  928:dup             
	//  643  929:sipush          160
	//  644  932:iconst_0        
	//  645  933:iastore         
	//  646  934:dup             
	//  647  935:sipush          161
	//  648  938:sipush          161
	//  649  941:iastore         
	//  650  942:dup             
	//  651  943:sipush          162
	//  652  946:sipush          162
	//  653  949:iastore         
	//  654  950:dup             
	//  655  951:sipush          163
	//  656  954:sipush          163
	//  657  957:iastore         
	//  658  958:dup             
	//  659  959:sipush          164
	//  660  962:sipush          8260
	//  661  965:iastore         
	//  662  966:dup             
	//  663  967:sipush          165
	//  664  970:sipush          165
	//  665  973:iastore         
	//  666  974:dup             
	//  667  975:sipush          166
	//  668  978:sipush          402
	//  669  981:iastore         
	//  670  982:dup             
	//  671  983:sipush          167
	//  672  986:sipush          167
	//  673  989:iastore         
	//  674  990:dup             
	//  675  991:sipush          168
	//  676  994:sipush          164
	//  677  997:iastore         
	//  678  998:dup             
	//  679  999:sipush          169
	//  680 1002:bipush          39
	//  681 1004:iastore         
	//  682 1005:dup             
	//  683 1006:sipush          170
	//  684 1009:sipush          8220
	//  685 1012:iastore         
	//  686 1013:dup             
	//  687 1014:sipush          171
	//  688 1017:sipush          171
	//  689 1020:iastore         
	//  690 1021:dup             
	//  691 1022:sipush          172
	//  692 1025:sipush          8249
	//  693 1028:iastore         
	//  694 1029:dup             
	//  695 1030:sipush          173
	//  696 1033:sipush          8250
	//  697 1036:iastore         
	//  698 1037:dup             
	//  699 1038:sipush          174
	//  700 1041:ldc1            #41  <Int 64257>
	//  701 1043:iastore         
	//  702 1044:dup             
	//  703 1045:sipush          175
	//  704 1048:ldc1            #42  <Int 64258>
	//  705 1050:iastore         
	//  706 1051:dup             
	//  707 1052:sipush          176
	//  708 1055:iconst_0        
	//  709 1056:iastore         
	//  710 1057:dup             
	//  711 1058:sipush          177
	//  712 1061:sipush          8211
	//  713 1064:iastore         
	//  714 1065:dup             
	//  715 1066:sipush          178
	//  716 1069:sipush          8224
	//  717 1072:iastore         
	//  718 1073:dup             
	//  719 1074:sipush          179
	//  720 1077:sipush          8225
	//  721 1080:iastore         
	//  722 1081:dup             
	//  723 1082:sipush          180
	//  724 1085:sipush          183
	//  725 1088:iastore         
	//  726 1089:dup             
	//  727 1090:sipush          181
	//  728 1093:iconst_0        
	//  729 1094:iastore         
	//  730 1095:dup             
	//  731 1096:sipush          182
	//  732 1099:sipush          182
	//  733 1102:iastore         
	//  734 1103:dup             
	//  735 1104:sipush          183
	//  736 1107:sipush          8226
	//  737 1110:iastore         
	//  738 1111:dup             
	//  739 1112:sipush          184
	//  740 1115:sipush          8218
	//  741 1118:iastore         
	//  742 1119:dup             
	//  743 1120:sipush          185
	//  744 1123:sipush          8222
	//  745 1126:iastore         
	//  746 1127:dup             
	//  747 1128:sipush          186
	//  748 1131:sipush          8221
	//  749 1134:iastore         
	//  750 1135:dup             
	//  751 1136:sipush          187
	//  752 1139:sipush          187
	//  753 1142:iastore         
	//  754 1143:dup             
	//  755 1144:sipush          188
	//  756 1147:sipush          8230
	//  757 1150:iastore         
	//  758 1151:dup             
	//  759 1152:sipush          189
	//  760 1155:sipush          8240
	//  761 1158:iastore         
	//  762 1159:dup             
	//  763 1160:sipush          190
	//  764 1163:iconst_0        
	//  765 1164:iastore         
	//  766 1165:dup             
	//  767 1166:sipush          191
	//  768 1169:sipush          191
	//  769 1172:iastore         
	//  770 1173:dup             
	//  771 1174:sipush          192
	//  772 1177:iconst_0        
	//  773 1178:iastore         
	//  774 1179:dup             
	//  775 1180:sipush          193
	//  776 1183:bipush          96
	//  777 1185:iastore         
	//  778 1186:dup             
	//  779 1187:sipush          194
	//  780 1190:sipush          180
	//  781 1193:iastore         
	//  782 1194:dup             
	//  783 1195:sipush          195
	//  784 1198:sipush          710
	//  785 1201:iastore         
	//  786 1202:dup             
	//  787 1203:sipush          196
	//  788 1206:sipush          732
	//  789 1209:iastore         
	//  790 1210:dup             
	//  791 1211:sipush          197
	//  792 1214:sipush          175
	//  793 1217:iastore         
	//  794 1218:dup             
	//  795 1219:sipush          198
	//  796 1222:sipush          728
	//  797 1225:iastore         
	//  798 1226:dup             
	//  799 1227:sipush          199
	//  800 1230:sipush          729
	//  801 1233:iastore         
	//  802 1234:dup             
	//  803 1235:sipush          200
	//  804 1238:sipush          168
	//  805 1241:iastore         
	//  806 1242:dup             
	//  807 1243:sipush          201
	//  808 1246:iconst_0        
	//  809 1247:iastore         
	//  810 1248:dup             
	//  811 1249:sipush          202
	//  812 1252:sipush          730
	//  813 1255:iastore         
	//  814 1256:dup             
	//  815 1257:sipush          203
	//  816 1260:sipush          184
	//  817 1263:iastore         
	//  818 1264:dup             
	//  819 1265:sipush          204
	//  820 1268:iconst_0        
	//  821 1269:iastore         
	//  822 1270:dup             
	//  823 1271:sipush          205
	//  824 1274:sipush          733
	//  825 1277:iastore         
	//  826 1278:dup             
	//  827 1279:sipush          206
	//  828 1282:sipush          731
	//  829 1285:iastore         
	//  830 1286:dup             
	//  831 1287:sipush          207
	//  832 1290:sipush          711
	//  833 1293:iastore         
	//  834 1294:dup             
	//  835 1295:sipush          208
	//  836 1298:sipush          8212
	//  837 1301:iastore         
	//  838 1302:dup             
	//  839 1303:sipush          209
	//  840 1306:iconst_0        
	//  841 1307:iastore         
	//  842 1308:dup             
	//  843 1309:sipush          210
	//  844 1312:iconst_0        
	//  845 1313:iastore         
	//  846 1314:dup             
	//  847 1315:sipush          211
	//  848 1318:iconst_0        
	//  849 1319:iastore         
	//  850 1320:dup             
	//  851 1321:sipush          212
	//  852 1324:iconst_0        
	//  853 1325:iastore         
	//  854 1326:dup             
	//  855 1327:sipush          213
	//  856 1330:iconst_0        
	//  857 1331:iastore         
	//  858 1332:dup             
	//  859 1333:sipush          214
	//  860 1336:iconst_0        
	//  861 1337:iastore         
	//  862 1338:dup             
	//  863 1339:sipush          215
	//  864 1342:iconst_0        
	//  865 1343:iastore         
	//  866 1344:dup             
	//  867 1345:sipush          216
	//  868 1348:iconst_0        
	//  869 1349:iastore         
	//  870 1350:dup             
	//  871 1351:sipush          217
	//  872 1354:iconst_0        
	//  873 1355:iastore         
	//  874 1356:dup             
	//  875 1357:sipush          218
	//  876 1360:iconst_0        
	//  877 1361:iastore         
	//  878 1362:dup             
	//  879 1363:sipush          219
	//  880 1366:iconst_0        
	//  881 1367:iastore         
	//  882 1368:dup             
	//  883 1369:sipush          220
	//  884 1372:iconst_0        
	//  885 1373:iastore         
	//  886 1374:dup             
	//  887 1375:sipush          221
	//  888 1378:iconst_0        
	//  889 1379:iastore         
	//  890 1380:dup             
	//  891 1381:sipush          222
	//  892 1384:iconst_0        
	//  893 1385:iastore         
	//  894 1386:dup             
	//  895 1387:sipush          223
	//  896 1390:iconst_0        
	//  897 1391:iastore         
	//  898 1392:dup             
	//  899 1393:sipush          224
	//  900 1396:iconst_0        
	//  901 1397:iastore         
	//  902 1398:dup             
	//  903 1399:sipush          225
	//  904 1402:sipush          198
	//  905 1405:iastore         
	//  906 1406:dup             
	//  907 1407:sipush          226
	//  908 1410:iconst_0        
	//  909 1411:iastore         
	//  910 1412:dup             
	//  911 1413:sipush          227
	//  912 1416:sipush          170
	//  913 1419:iastore         
	//  914 1420:dup             
	//  915 1421:sipush          228
	//  916 1424:iconst_0        
	//  917 1425:iastore         
	//  918 1426:dup             
	//  919 1427:sipush          229
	//  920 1430:iconst_0        
	//  921 1431:iastore         
	//  922 1432:dup             
	//  923 1433:sipush          230
	//  924 1436:iconst_0        
	//  925 1437:iastore         
	//  926 1438:dup             
	//  927 1439:sipush          231
	//  928 1442:iconst_0        
	//  929 1443:iastore         
	//  930 1444:dup             
	//  931 1445:sipush          232
	//  932 1448:sipush          321
	//  933 1451:iastore         
	//  934 1452:dup             
	//  935 1453:sipush          233
	//  936 1456:sipush          216
	//  937 1459:iastore         
	//  938 1460:dup             
	//  939 1461:sipush          234
	//  940 1464:sipush          338
	//  941 1467:iastore         
	//  942 1468:dup             
	//  943 1469:sipush          235
	//  944 1472:sipush          186
	//  945 1475:iastore         
	//  946 1476:dup             
	//  947 1477:sipush          236
	//  948 1480:iconst_0        
	//  949 1481:iastore         
	//  950 1482:dup             
	//  951 1483:sipush          237
	//  952 1486:iconst_0        
	//  953 1487:iastore         
	//  954 1488:dup             
	//  955 1489:sipush          238
	//  956 1492:iconst_0        
	//  957 1493:iastore         
	//  958 1494:dup             
	//  959 1495:sipush          239
	//  960 1498:iconst_0        
	//  961 1499:iastore         
	//  962 1500:dup             
	//  963 1501:sipush          240
	//  964 1504:iconst_0        
	//  965 1505:iastore         
	//  966 1506:dup             
	//  967 1507:sipush          241
	//  968 1510:sipush          230
	//  969 1513:iastore         
	//  970 1514:dup             
	//  971 1515:sipush          242
	//  972 1518:iconst_0        
	//  973 1519:iastore         
	//  974 1520:dup             
	//  975 1521:sipush          243
	//  976 1524:iconst_0        
	//  977 1525:iastore         
	//  978 1526:dup             
	//  979 1527:sipush          244
	//  980 1530:iconst_0        
	//  981 1531:iastore         
	//  982 1532:dup             
	//  983 1533:sipush          245
	//  984 1536:sipush          305
	//  985 1539:iastore         
	//  986 1540:dup             
	//  987 1541:sipush          246
	//  988 1544:iconst_0        
	//  989 1545:iastore         
	//  990 1546:dup             
	//  991 1547:sipush          247
	//  992 1550:iconst_0        
	//  993 1551:iastore         
	//  994 1552:dup             
	//  995 1553:sipush          248
	//  996 1556:sipush          322
	//  997 1559:iastore         
	//  998 1560:dup             
	//  999 1561:sipush          249
	// 1000 1564:sipush          248
	// 1001 1567:iastore         
	// 1002 1568:dup             
	// 1003 1569:sipush          250
	// 1004 1572:sipush          339
	// 1005 1575:iastore         
	// 1006 1576:dup             
	// 1007 1577:sipush          251
	// 1008 1580:sipush          223
	// 1009 1583:iastore         
	// 1010 1584:dup             
	// 1011 1585:sipush          252
	// 1012 1588:iconst_0        
	// 1013 1589:iastore         
	// 1014 1590:dup             
	// 1015 1591:sipush          253
	// 1016 1594:iconst_0        
	// 1017 1595:iastore         
	// 1018 1596:dup             
	// 1019 1597:sipush          254
	// 1020 1600:iconst_0        
	// 1021 1601:iastore         
	// 1022 1602:dup             
	// 1023 1603:sipush          255
	// 1024 1606:iconst_0        
	// 1025 1607:iastore         
	// 1026 1608:putstatic       #44  <Field int[] stdEnc>
	//*1027 1611:return          
	}
}
