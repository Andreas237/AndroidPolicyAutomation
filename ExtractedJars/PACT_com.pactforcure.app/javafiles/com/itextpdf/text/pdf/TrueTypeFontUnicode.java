// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Utilities;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.fonts.otf.GlyphSubstitutionTableReader;
import com.itextpdf.text.pdf.fonts.otf.Language;
import com.itextpdf.text.pdf.languages.ArabicLigaturizer;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			TrueTypeFont, PdfDictionary, PdfName, PdfString, 
//			PdfNumber, PdfLiteral, PdfArray, PdfStream, 
//			PdfEncodings, PdfWriter, TtfUnicodeWriter, PdfIndirectReference

class TrueTypeFontUnicode extends TrueTypeFont
	implements Comparator
{

	TrueTypeFontUnicode(String s, String s1, boolean flag, byte abyte0[], boolean flag1)
		throws DocumentException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void TrueTypeFont()>
		String s2 = getBaseName(s);
	//    2    4:aload_1         
	//    3    5:invokestatic    #55  <Method String getBaseName(String)>
	//    4    8:astore          6
		String s3 = getTTCName(s2);
	//    5   10:aload           6
	//    6   12:invokestatic    #58  <Method String getTTCName(String)>
	//    7   15:astore          7
		if(s2.length() < s.length())
	//*   8   17:aload           6
	//*   9   19:invokevirtual   #64  <Method int String.length()>
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #64  <Method int String.length()>
	//*  12   26:icmpge          42
			style = s.substring(s2.length());
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload           6
	//   16   33:invokevirtual   #64  <Method int String.length()>
	//   17   36:invokevirtual   #68  <Method String String.substring(int)>
	//   18   39:putfield        #72  <Field String style>
		encoding = s1;
	//   19   42:aload_0         
	//   20   43:aload_2         
	//   21   44:putfield        #75  <Field String encoding>
		embedded = flag;
	//   22   47:aload_0         
	//   23   48:iload_3         
	//   24   49:putfield        #79  <Field boolean embedded>
		fileName = s3;
	//   25   52:aload_0         
	//   26   53:aload           7
	//   27   55:putfield        #82  <Field String fileName>
		ttcIndex = "";
	//   28   58:aload_0         
	//   29   59:ldc1            #84  <String "">
	//   30   61:putfield        #87  <Field String ttcIndex>
		if(s3.length() < s2.length())
	//*  31   64:aload           7
	//*  32   66:invokevirtual   #64  <Method int String.length()>
	//*  33   69:aload           6
	//*  34   71:invokevirtual   #64  <Method int String.length()>
	//*  35   74:icmpge          93
			ttcIndex = s2.substring(s3.length() + 1);
	//   36   77:aload_0         
	//   37   78:aload           6
	//   38   80:aload           7
	//   39   82:invokevirtual   #64  <Method int String.length()>
	//   40   85:iconst_1        
	//   41   86:iadd            
	//   42   87:invokevirtual   #68  <Method String String.substring(int)>
	//   43   90:putfield        #87  <Field String ttcIndex>
		fontType = 3;
	//   44   93:aload_0         
	//   45   94:iconst_3        
	//   46   95:putfield        #91  <Field int fontType>
		if((fileName.toLowerCase().endsWith(".ttf") || fileName.toLowerCase().endsWith(".otf") || fileName.toLowerCase().endsWith(".ttc")) && (s1.equals("Identity-H") || s1.equals("Identity-V")) && flag)
	//*  47   98:aload_0         
	//*  48   99:getfield        #82  <Field String fileName>
	//*  49  102:invokevirtual   #95  <Method String String.toLowerCase()>
	//*  50  105:ldc1            #97  <String ".ttf">
	//*  51  107:invokevirtual   #101 <Method boolean String.endsWith(String)>
	//*  52  110:ifne            143
	//*  53  113:aload_0         
	//*  54  114:getfield        #82  <Field String fileName>
	//*  55  117:invokevirtual   #95  <Method String String.toLowerCase()>
	//*  56  120:ldc1            #103 <String ".otf">
	//*  57  122:invokevirtual   #101 <Method boolean String.endsWith(String)>
	//*  58  125:ifne            143
	//*  59  128:aload_0         
	//*  60  129:getfield        #82  <Field String fileName>
	//*  61  132:invokevirtual   #95  <Method String String.toLowerCase()>
	//*  62  135:ldc1            #105 <String ".ttc">
	//*  63  137:invokevirtual   #101 <Method boolean String.endsWith(String)>
	//*  64  140:ifeq            309
	//*  65  143:aload_2         
	//*  66  144:ldc1            #107 <String "Identity-H">
	//*  67  146:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  68  149:ifne            161
	//*  69  152:aload_2         
	//*  70  153:ldc1            #113 <String "Identity-V">
	//*  71  155:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  72  158:ifeq            309
	//*  73  161:iload_3         
	//*  74  162:ifeq            309
		{
			process(abyte0, flag1);
	//   75  165:aload_0         
	//   76  166:aload           4
	//   77  168:iload           5
	//   78  170:invokevirtual   #117 <Method void process(byte[], boolean)>
			if(os_2.fsType == 2)
	//*  79  173:aload_0         
	//*  80  174:getfield        #121 <Field TrueTypeFont$WindowsMetrics os_2>
	//*  81  177:getfield        #127 <Field short TrueTypeFont$WindowsMetrics.fsType>
	//*  82  180:iconst_2        
	//*  83  181:icmpne          228
				throw new DocumentException(MessageLocalization.getComposedMessage("1.cannot.be.embedded.due.to.licensing.restrictions", new Object[] {
					(new StringBuilder()).append(fileName).append(style).toString()
				}));
	//   84  184:new             #47  <Class DocumentException>
	//   85  187:dup             
	//   86  188:ldc1            #129 <String "1.cannot.be.embedded.due.to.licensing.restrictions">
	//   87  190:iconst_1        
	//   88  191:anewarray       Object[]
	//   89  194:dup             
	//   90  195:iconst_0        
	//   91  196:new             #133 <Class StringBuilder>
	//   92  199:dup             
	//   93  200:invokespecial   #134 <Method void StringBuilder()>
	//   94  203:aload_0         
	//   95  204:getfield        #82  <Field String fileName>
	//   96  207:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   97  210:aload_0         
	//   98  211:getfield        #72  <Field String style>
	//   99  214:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  100  217:invokevirtual   #141 <Method String StringBuilder.toString()>
	//  101  220:aastore         
	//  102  221:invokestatic    #147 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  103  224:invokespecial   #150 <Method void DocumentException(String)>
	//  104  227:athrow          
			if(cmap31 == null && !fontSpecific || cmap10 == null && fontSpecific)
	//* 105  228:aload_0         
	//* 106  229:getfield        #154 <Field HashMap cmap31>
	//* 107  232:ifnonnull       242
	//* 108  235:aload_0         
	//* 109  236:getfield        #157 <Field boolean fontSpecific>
	//* 110  239:ifeq            256
	//* 111  242:aload_0         
	//* 112  243:getfield        #160 <Field HashMap cmap10>
	//* 113  246:ifnonnull       261
	//* 114  249:aload_0         
	//* 115  250:getfield        #157 <Field boolean fontSpecific>
	//* 116  253:ifeq            261
				directTextToByte = true;
	//  117  256:aload_0         
	//  118  257:iconst_1        
	//  119  258:putfield        #163 <Field boolean directTextToByte>
			if(fontSpecific)
	//* 120  261:aload_0         
	//* 121  262:getfield        #157 <Field boolean fontSpecific>
	//* 122  265:ifeq            298
			{
				fontSpecific = false;
	//  123  268:aload_0         
	//  124  269:iconst_0        
	//  125  270:putfield        #157 <Field boolean fontSpecific>
				s = encoding;
	//  126  273:aload_0         
	//  127  274:getfield        #75  <Field String encoding>
	//  128  277:astore_1        
				encoding = "";
	//  129  278:aload_0         
	//  130  279:ldc1            #84  <String "">
	//  131  281:putfield        #75  <Field String encoding>
				createEncoding();
	//  132  284:aload_0         
	//  133  285:invokevirtual   #166 <Method void createEncoding()>
				encoding = s;
	//  134  288:aload_0         
	//  135  289:aload_1         
	//  136  290:putfield        #75  <Field String encoding>
				fontSpecific = true;
	//  137  293:aload_0         
	//  138  294:iconst_1        
	//  139  295:putfield        #157 <Field boolean fontSpecific>
			}
			vertical = s1.endsWith("V");
	//  140  298:aload_0         
	//  141  299:aload_2         
	//  142  300:ldc1            #168 <String "V">
	//  143  302:invokevirtual   #101 <Method boolean String.endsWith(String)>
	//  144  305:putfield        #171 <Field boolean vertical>
			return;
	//  145  308:return          
		} else
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("1.2.is.not.a.ttf.font.file", new Object[] {
				fileName, style
			}));
	//  146  309:new             #47  <Class DocumentException>
	//  147  312:dup             
	//  148  313:ldc1            #173 <String "1.2.is.not.a.ttf.font.file">
	//  149  315:iconst_2        
	//  150  316:anewarray       Object[]
	//  151  319:dup             
	//  152  320:iconst_0        
	//  153  321:aload_0         
	//  154  322:getfield        #82  <Field String fileName>
	//  155  325:aastore         
	//  156  326:dup             
	//  157  327:iconst_1        
	//  158  328:aload_0         
	//  159  329:getfield        #72  <Field String style>
	//  160  332:aastore         
	//  161  333:invokestatic    #147 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  162  336:invokespecial   #150 <Method void DocumentException(String)>
	//  163  339:athrow          
		}
	}

	private void readGsubTable()
		throws IOException
	{
		Object obj;
		if(tables.get("GSUB") == null)
			break MISSING_BLOCK_LABEL_164;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field HashMap tables>
	//    2    4:ldc1            #182 <String "GSUB">
	//    3    6:invokevirtual   #188 <Method Object HashMap.get(Object)>
	//    4    9:ifnull          164
		obj = ((Object) (new HashMap(cmap31.size())));
	//    5   12:new             #184 <Class HashMap>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:getfield        #154 <Field HashMap cmap31>
	//    9   20:invokevirtual   #191 <Method int HashMap.size()>
	//   10   23:invokespecial   #194 <Method void HashMap(int)>
	//   11   26:astore_2        
		char c;
		Integer integer;
		for(Iterator iterator = cmap31.keySet().iterator(); iterator.hasNext(); ((Map) (obj)).put(((Object) (Integer.valueOf(((int[])cmap31.get(((Object) (integer))))[0]))), ((Object) (Character.valueOf(c)))))
	//*  12   27:aload_0         
	//*  13   28:getfield        #154 <Field HashMap cmap31>
	//*  14   31:invokevirtual   #198 <Method Set HashMap.keySet()>
	//*  15   34:invokeinterface #204 <Method Iterator Set.iterator()>
	//*  16   39:astore_3        
	//*  17   40:aload_3         
	//*  18   41:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  19   46:ifeq            98
		{
			integer = (Integer)iterator.next();
	//   20   49:aload_3         
	//   21   50:invokeinterface #214 <Method Object Iterator.next()>
	//   22   55:checkcast       #216 <Class Integer>
	//   23   58:astore          4
			c = (char)integer.intValue();
	//   24   60:aload           4
	//   25   62:invokevirtual   #219 <Method int Integer.intValue()>
	//   26   65:int2char        
	//   27   66:istore_1        
		}

	//   28   67:aload_2         
	//   29   68:aload_0         
	//   30   69:getfield        #154 <Field HashMap cmap31>
	//   31   72:aload           4
	//   32   74:invokevirtual   #188 <Method Object HashMap.get(Object)>
	//   33   77:checkcast       #221 <Class int[]>
	//   34   80:iconst_0        
	//   35   81:iaload          
	//   36   82:invokestatic    #225 <Method Integer Integer.valueOf(int)>
	//   37   85:iload_1         
	//   38   86:invokestatic    #230 <Method Character Character.valueOf(char)>
	//   39   89:invokeinterface #236 <Method Object Map.put(Object, Object)>
	//   40   94:pop             
	//*  41   95:goto            40
		obj = ((Object) (new GlyphSubstitutionTableReader(rf, ((int[])tables.get("GSUB"))[0], ((Map) (obj)), glyphWidthsByIndex)));
	//   42   98:new             #238 <Class GlyphSubstitutionTableReader>
	//   43  101:dup             
	//   44  102:aload_0         
	//   45  103:getfield        #242 <Field RandomAccessFileOrArray rf>
	//   46  106:aload_0         
	//   47  107:getfield        #180 <Field HashMap tables>
	//   48  110:ldc1            #182 <String "GSUB">
	//   49  112:invokevirtual   #188 <Method Object HashMap.get(Object)>
	//   50  115:checkcast       #221 <Class int[]>
	//   51  118:iconst_0        
	//   52  119:iaload          
	//   53  120:aload_2         
	//   54  121:aload_0         
	//   55  122:getfield        #245 <Field int[] glyphWidthsByIndex>
	//   56  125:invokespecial   #248 <Method void GlyphSubstitutionTableReader(RandomAccessFileOrArray, int, Map, int[])>
	//   57  128:astore_2        
		((GlyphSubstitutionTableReader) (obj)).read();
	//   58  129:aload_2         
	//   59  130:invokevirtual   #251 <Method void GlyphSubstitutionTableReader.read()>
		supportedLanguage = ((GlyphSubstitutionTableReader) (obj)).getSupportedLanguage();
	//   60  133:aload_0         
	//   61  134:aload_2         
	//   62  135:invokevirtual   #255 <Method Language GlyphSubstitutionTableReader.getSupportedLanguage()>
	//   63  138:putfield        #257 <Field Language supportedLanguage>
		if(SUPPORTED_LANGUAGES_FOR_OTF.contains(((Object) (supportedLanguage))))
	//*  64  141:getstatic       #32  <Field List SUPPORTED_LANGUAGES_FOR_OTF>
	//*  65  144:aload_0         
	//*  66  145:getfield        #257 <Field Language supportedLanguage>
	//*  67  148:invokeinterface #262 <Method boolean List.contains(Object)>
	//*  68  153:ifeq            164
			glyphSubstitutionMap = ((GlyphSubstitutionTableReader) (obj)).getGlyphSubstitutionMap();
	//   69  156:aload_0         
	//   70  157:aload_2         
	//   71  158:invokevirtual   #266 <Method Map GlyphSubstitutionTableReader.getGlyphSubstitutionMap()>
	//   72  161:putfield        #268 <Field Map glyphSubstitutionMap>
		return;
	//   73  164:return          
		Exception exception;
		exception;
	//   74  165:astore_2        
		exception.printStackTrace();
	//   75  166:aload_2         
	//   76  167:invokevirtual   #271 <Method void Exception.printStackTrace()>
		return;
	//   77  170:return          
	}

	static String toHex(int i)
	{
		if(i < 0x10000)
	//*   0    0:iload_0         
	//*   1    1:ldc2            #273 <Int 0x10000>
	//*   2    4:icmpge          37
		{
			return (new StringBuilder()).append("<").append(toHex4(i)).append(">").toString();
	//    3    7:new             #133 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #134 <Method void StringBuilder()>
	//    6   14:ldc2            #275 <String "<">
	//    7   17:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:iload_0         
	//    9   21:invokestatic    #278 <Method String toHex4(int)>
	//   10   24:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:ldc2            #280 <String ">">
	//   12   30:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   13   33:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   14   36:areturn         
		} else
		{
			i -= 0x10000;
	//   15   37:iload_0         
	//   16   38:ldc2            #273 <Int 0x10000>
	//   17   41:isub            
	//   18   42:istore_0        
			int j = i / 1024;
	//   19   43:iload_0         
	//   20   44:sipush          1024
	//   21   47:idiv            
	//   22   48:istore_1        
			return (new StringBuilder()).append("[<").append(toHex4(j + 55296)).append(toHex4(i % 1024 + 56320)).append(">]").toString();
	//   23   49:new             #133 <Class StringBuilder>
	//   24   52:dup             
	//   25   53:invokespecial   #134 <Method void StringBuilder()>
	//   26   56:ldc2            #282 <String "[<">
	//   27   59:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:iload_1         
	//   29   63:ldc2            #283 <Int 55296>
	//   30   66:iadd            
	//   31   67:invokestatic    #278 <Method String toHex4(int)>
	//   32   70:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:iload_0         
	//   34   74:sipush          1024
	//   35   77:irem            
	//   36   78:ldc2            #284 <Int 56320>
	//   37   81:iadd            
	//   38   82:invokestatic    #278 <Method String toHex4(int)>
	//   39   85:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   40   88:ldc2            #286 <String ">]">
	//   41   91:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   42   94:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   43   97:areturn         
		}
	}

	private static String toHex4(int i)
	{
		String s = (new StringBuilder()).append("0000").append(Integer.toHexString(i)).toString();
	//    0    0:new             #133 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void StringBuilder()>
	//    3    7:ldc2            #288 <String "0000">
	//    4   10:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:iload_0         
	//    6   14:invokestatic    #291 <Method String Integer.toHexString(int)>
	//    7   17:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:invokevirtual   #141 <Method String StringBuilder.toString()>
	//    9   23:astore_1        
		return s.substring(s.length() - 4);
	//   10   24:aload_1         
	//   11   25:aload_1         
	//   12   26:invokevirtual   #64  <Method int String.length()>
	//   13   29:iconst_4        
	//   14   30:isub            
	//   15   31:invokevirtual   #68  <Method String String.substring(int)>
	//   16   34:areturn         
	}

	public int GetCharFromGlyphId(int i)
	{
		Object obj;
		int ai[];
		if(glyphIdToChar != null)
			break MISSING_BLOCK_LABEL_112;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field int[] glyphIdToChar>
	//    2    4:ifnonnull       112
		ai = new int[maxGlyphId];
	//    3    7:aload_0         
	//    4    8:getfield        #299 <Field int maxGlyphId>
	//    5   11:newarray        int[]
	//    6   13:astore_3        
		obj = null;
	//    7   14:aconst_null     
	//    8   15:astore_2        
		if(cmapExt == null) goto _L2; else goto _L1
	//    9   16:aload_0         
	//   10   17:getfield        #302 <Field HashMap cmapExt>
	//   11   20:ifnull          92
_L1:
		obj = ((Object) (cmapExt));
	//   12   23:aload_0         
	//   13   24:getfield        #302 <Field HashMap cmapExt>
	//   14   27:astore_2        
_L4:
		if(obj != null)
	//*  15   28:aload_2         
	//*  16   29:ifnull          107
			for(obj = ((Object) (((HashMap) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext();)
	//*  17   32:aload_2         
	//*  18   33:invokevirtual   #305 <Method Set HashMap.entrySet()>
	//*  19   36:invokeinterface #204 <Method Iterator Set.iterator()>
	//*  20   41:astore_2        
	//*  21   42:aload_2         
	//*  22   43:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  23   48:ifeq            107
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   24   51:aload_2         
	//   25   52:invokeinterface #214 <Method Object Iterator.next()>
	//   26   57:checkcast       #307 <Class java.util.Map$Entry>
	//   27   60:astore          4
				ai[((int[])entry.getValue())[0]] = ((Integer)entry.getKey()).intValue();
	//   28   62:aload_3         
	//   29   63:aload           4
	//   30   65:invokeinterface #310 <Method Object java.util.Map$Entry.getValue()>
	//   31   70:checkcast       #221 <Class int[]>
	//   32   73:iconst_0        
	//   33   74:iaload          
	//   34   75:aload           4
	//   35   77:invokeinterface #313 <Method Object java.util.Map$Entry.getKey()>
	//   36   82:checkcast       #216 <Class Integer>
	//   37   85:invokevirtual   #219 <Method int Integer.intValue()>
	//   38   88:iastore         
			}

		break; /* Loop/switch isn't completed */
	//   39   89:goto            42
_L2:
		if(cmap31 != null)
	//*  40   92:aload_0         
	//*  41   93:getfield        #154 <Field HashMap cmap31>
	//*  42   96:ifnull          28
			obj = ((Object) (cmap31));
	//   43   99:aload_0         
	//   44  100:getfield        #154 <Field HashMap cmap31>
	//   45  103:astore_2        
		if(true) goto _L4; else goto _L3
	//   46  104:goto            28
_L3:
		glyphIdToChar = ai;
	//   47  107:aload_0         
	//   48  108:aload_3         
	//   49  109:putfield        #296 <Field int[] glyphIdToChar>
		return glyphIdToChar[i];
	//   50  112:aload_0         
	//   51  113:getfield        #296 <Field int[] glyphIdToChar>
	//   52  116:iload_1         
	//   53  117:iaload          
	//   54  118:ireturn         
	}

	public boolean charExists(int i)
	{
		return getMetricsTT(i) != null;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #319 <Method int[] getMetricsTT(int)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((int[])obj, (int[])obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #221 <Class int[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #221 <Class int[]>
	//    5    9:invokevirtual   #324 <Method int compare(int[], int[])>
	//    6   12:ireturn         
	}

	public int compare(int ai[], int ai1[])
	{
		byte byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = ai[0];
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:iaload          
	//    5    5:istore          4
		int j = ai1[0];
	//    6    7:aload_2         
	//    7    8:iconst_0        
	//    8    9:iaload          
	//    9   10:istore          5
		if(i < j)
	//*  10   12:iload           4
	//*  11   14:iload           5
	//*  12   16:icmpge          23
			byte0 = -1;
	//   13   19:iconst_m1       
	//   14   20:istore_3        
		else
	//*  15   21:iload_3         
	//*  16   22:ireturn         
		if(i != j)
	//*  17   23:iload           4
	//*  18   25:iload           5
	//*  19   27:icmpeq          21
			return 1;
	//   20   30:iconst_1        
	//   21   31:ireturn         
		return ((int) (byte0));
	}

	byte[] convertToBytes(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public byte[] convertToBytes(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public PdfDictionary getCIDFontType2(PdfIndirectReference pdfindirectreference, String s, Object aobj[])
	{
		PdfDictionary pdfdictionary = new PdfDictionary(PdfName.FONT);
	//    0    0:new             #331 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:getstatic       #337 <Field PdfName PdfName.FONT>
	//    3    7:invokespecial   #340 <Method void PdfDictionary(PdfName)>
	//    4   10:astore          8
		if(cff)
	//*   5   12:aload_0         
	//*   6   13:getfield        #343 <Field boolean cff>
	//*   7   16:ifeq            254
		{
			pdfdictionary.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.CIDFONTTYPE0)));
	//    8   19:aload           8
	//    9   21:getstatic       #346 <Field PdfName PdfName.SUBTYPE>
	//   10   24:getstatic       #349 <Field PdfName PdfName.CIDFONTTYPE0>
	//   11   27:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.BASEFONT, ((PdfObject) (new PdfName((new StringBuilder()).append(s).append(fontName).append("-").append(encoding).toString()))));
	//   12   30:aload           8
	//   13   32:getstatic       #355 <Field PdfName PdfName.BASEFONT>
	//   14   35:new             #333 <Class PdfName>
	//   15   38:dup             
	//   16   39:new             #133 <Class StringBuilder>
	//   17   42:dup             
	//   18   43:invokespecial   #134 <Method void StringBuilder()>
	//   19   46:aload_2         
	//   20   47:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:aload_0         
	//   22   51:getfield        #358 <Field String fontName>
	//   23   54:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   24   57:ldc2            #360 <String "-">
	//   25   60:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   26   63:aload_0         
	//   27   64:getfield        #75  <Field String encoding>
	//   28   67:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   29   70:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   30   73:invokespecial   #361 <Method void PdfName(String)>
	//   31   76:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//*  32   79:aload           8
	//*  33   81:getstatic       #364 <Field PdfName PdfName.FONTDESCRIPTOR>
	//*  34   84:aload_1         
	//*  35   85:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  36   88:aload_0         
	//*  37   89:getfield        #343 <Field boolean cff>
	//*  38   92:ifne            106
	//*  39   95:aload           8
	//*  40   97:getstatic       #367 <Field PdfName PdfName.CIDTOGIDMAP>
	//*  41  100:getstatic       #370 <Field PdfName PdfName.IDENTITY>
	//*  42  103:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  43  106:new             #331 <Class PdfDictionary>
	//*  44  109:dup             
	//*  45  110:invokespecial   #371 <Method void PdfDictionary()>
	//*  46  113:astore_1        
	//*  47  114:aload_1         
	//*  48  115:getstatic       #374 <Field PdfName PdfName.REGISTRY>
	//*  49  118:new             #376 <Class PdfString>
	//*  50  121:dup             
	//*  51  122:ldc2            #378 <String "Adobe">
	//*  52  125:invokespecial   #379 <Method void PdfString(String)>
	//*  53  128:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  54  131:aload_1         
	//*  55  132:getstatic       #382 <Field PdfName PdfName.ORDERING>
	//*  56  135:new             #376 <Class PdfString>
	//*  57  138:dup             
	//*  58  139:ldc2            #384 <String "Identity">
	//*  59  142:invokespecial   #379 <Method void PdfString(String)>
	//*  60  145:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  61  148:aload_1         
	//*  62  149:getstatic       #387 <Field PdfName PdfName.SUPPLEMENT>
	//*  63  152:new             #389 <Class PdfNumber>
	//*  64  155:dup             
	//*  65  156:iconst_0        
	//*  66  157:invokespecial   #390 <Method void PdfNumber(int)>
	//*  67  160:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  68  163:aload           8
	//*  69  165:getstatic       #393 <Field PdfName PdfName.CIDSYSTEMINFO>
	//*  70  168:aload_1         
	//*  71  169:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  72  172:aload_0         
	//*  73  173:getfield        #171 <Field boolean vertical>
	//*  74  176:ifne            409
	//*  75  179:aload           8
	//*  76  181:getstatic       #396 <Field PdfName PdfName.DW>
	//*  77  184:new             #389 <Class PdfNumber>
	//*  78  187:dup             
	//*  79  188:sipush          1000
	//*  80  191:invokespecial   #390 <Method void PdfNumber(int)>
	//*  81  194:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  82  197:new             #398 <Class StringBuffer>
	//*  83  200:dup             
	//*  84  201:ldc2            #400 <String "[">
	//*  85  204:invokespecial   #401 <Method void StringBuffer(String)>
	//*  86  207:astore_1        
	//*  87  208:bipush          -10
	//*  88  210:istore          6
	//*  89  212:iconst_1        
	//*  90  213:istore          4
	//*  91  215:iconst_0        
	//*  92  216:istore          5
	//*  93  218:iload           5
	//*  94  220:aload_3         
	//*  95  221:arraylength     
	//*  96  222:icmpge          374
	//*  97  225:aload_3         
	//*  98  226:iload           5
	//*  99  228:aaload          
	//* 100  229:checkcast       #221 <Class int[]>
	//* 101  232:checkcast       #221 <Class int[]>
	//* 102  235:astore_2        
	//* 103  236:aload_2         
	//* 104  237:iconst_1        
	//* 105  238:iaload          
	//* 106  239:sipush          1000
	//* 107  242:icmpne          304
	//* 108  245:iload           5
	//* 109  247:iconst_1        
	//* 110  248:iadd            
	//* 111  249:istore          5
	//* 112  251:goto            218
		{
			pdfdictionary.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.CIDFONTTYPE2)));
	//  113  254:aload           8
	//  114  256:getstatic       #346 <Field PdfName PdfName.SUBTYPE>
	//  115  259:getstatic       #404 <Field PdfName PdfName.CIDFONTTYPE2>
	//  116  262:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.BASEFONT, ((PdfObject) (new PdfName((new StringBuilder()).append(s).append(fontName).toString()))));
	//  117  265:aload           8
	//  118  267:getstatic       #355 <Field PdfName PdfName.BASEFONT>
	//  119  270:new             #333 <Class PdfName>
	//  120  273:dup             
	//  121  274:new             #133 <Class StringBuilder>
	//  122  277:dup             
	//  123  278:invokespecial   #134 <Method void StringBuilder()>
	//  124  281:aload_2         
	//  125  282:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  126  285:aload_0         
	//  127  286:getfield        #358 <Field String fontName>
	//  128  289:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  129  292:invokevirtual   #141 <Method String StringBuilder.toString()>
	//  130  295:invokespecial   #361 <Method void PdfName(String)>
	//  131  298:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		pdfdictionary.put(PdfName.FONTDESCRIPTOR, ((PdfObject) (pdfindirectreference)));
		if(!cff)
			pdfdictionary.put(PdfName.CIDTOGIDMAP, ((PdfObject) (PdfName.IDENTITY)));
		pdfindirectreference = ((PdfIndirectReference) (new PdfDictionary()));
		((PdfDictionary) (pdfindirectreference)).put(PdfName.REGISTRY, ((PdfObject) (new PdfString("Adobe"))));
		((PdfDictionary) (pdfindirectreference)).put(PdfName.ORDERING, ((PdfObject) (new PdfString("Identity"))));
		((PdfDictionary) (pdfindirectreference)).put(PdfName.SUPPLEMENT, ((PdfObject) (new PdfNumber(0))));
		pdfdictionary.put(PdfName.CIDSYSTEMINFO, ((PdfObject) (pdfindirectreference)));
		if(!vertical)
		{
			pdfdictionary.put(PdfName.DW, ((PdfObject) (new PdfNumber(1000))));
			pdfindirectreference = ((PdfIndirectReference) (new StringBuffer("[")));
			int j = -10;
			boolean flag = true;
			int i = 0;
			while(i < aobj.length) 
			{
				s = ((String) ((int[])(int[])aobj[i]));
				if(s[1] != 1000)
	//* 132  301:goto            79
				{
					int k = s[0];
	//  133  304:aload_2         
	//  134  305:iconst_0        
	//  135  306:iaload          
	//  136  307:istore          7
					if(k == j + 1)
	//* 137  309:iload           7
	//* 138  311:iload           6
	//* 139  313:iconst_1        
	//* 140  314:iadd            
	//* 141  315:icmpne          338
					{
						((StringBuffer) (pdfindirectreference)).append(' ').append(s[1]);
	//  142  318:aload_1         
	//  143  319:bipush          32
	//  144  321:invokevirtual   #407 <Method StringBuffer StringBuffer.append(char)>
	//  145  324:aload_2         
	//  146  325:iconst_1        
	//  147  326:iaload          
	//  148  327:invokevirtual   #410 <Method StringBuffer StringBuffer.append(int)>
	//  149  330:pop             
					} else
	//* 150  331:iload           7
	//* 151  333:istore          6
	//* 152  335:goto            245
					{
						if(!flag)
	//* 153  338:iload           4
	//* 154  340:ifne            350
							((StringBuffer) (pdfindirectreference)).append(']');
	//  155  343:aload_1         
	//  156  344:bipush          93
	//  157  346:invokevirtual   #407 <Method StringBuffer StringBuffer.append(char)>
	//  158  349:pop             
						flag = false;
	//  159  350:iconst_0        
	//  160  351:istore          4
						((StringBuffer) (pdfindirectreference)).append(k).append('[').append(s[1]);
	//  161  353:aload_1         
	//  162  354:iload           7
	//  163  356:invokevirtual   #410 <Method StringBuffer StringBuffer.append(int)>
	//  164  359:bipush          91
	//  165  361:invokevirtual   #407 <Method StringBuffer StringBuffer.append(char)>
	//  166  364:aload_2         
	//  167  365:iconst_1        
	//  168  366:iaload          
	//  169  367:invokevirtual   #410 <Method StringBuffer StringBuffer.append(int)>
	//  170  370:pop             
					}
					j = k;
				}
				i++;
			}
	//* 171  371:goto            331
			if(((StringBuffer) (pdfindirectreference)).length() > 1)
	//* 172  374:aload_1         
	//* 173  375:invokevirtual   #411 <Method int StringBuffer.length()>
	//* 174  378:iconst_1        
	//* 175  379:icmple          409
			{
				((StringBuffer) (pdfindirectreference)).append("]]");
	//  176  382:aload_1         
	//  177  383:ldc2            #413 <String "]]">
	//  178  386:invokevirtual   #416 <Method StringBuffer StringBuffer.append(String)>
	//  179  389:pop             
				pdfdictionary.put(PdfName.W, ((PdfObject) (new PdfLiteral(((StringBuffer) (pdfindirectreference)).toString()))));
	//  180  390:aload           8
	//  181  392:getstatic       #419 <Field PdfName PdfName.W>
	//  182  395:new             #421 <Class PdfLiteral>
	//  183  398:dup             
	//  184  399:aload_1         
	//  185  400:invokevirtual   #422 <Method String StringBuffer.toString()>
	//  186  403:invokespecial   #423 <Method void PdfLiteral(String)>
	//  187  406:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
		}
		return pdfdictionary;
	//  188  409:aload           8
	//  189  411:areturn         
	}

	public int[] getCharBBox(int i)
	{
		int ai[];
		if(bboxes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #428 <Field int[][] bboxes>
	//*   2    4:ifnonnull       9
	//*   3    7:aconst_null     
	//*   4    8:areturn         
	//*   5    9:aload_0         
	//*   6   10:iload_1         
	//*   7   11:invokevirtual   #319 <Method int[] getMetricsTT(int)>
	//*   8   14:astore_2        
			if((ai = getMetricsTT(i)) != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          7
				return bboxes[ai[0]];
	//   11   19:aload_0         
	//   12   20:getfield        #428 <Field int[][] bboxes>
	//   13   23:aload_2         
	//   14   24:iconst_0        
	//   15   25:iaload          
	//   16   26:aaload          
	//   17   27:areturn         
		return null;
	}

	public PdfDictionary getFontBaseType(PdfIndirectReference pdfindirectreference, String s, PdfIndirectReference pdfindirectreference1)
	{
		PdfDictionary pdfdictionary = new PdfDictionary(PdfName.FONT);
	//    0    0:new             #331 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:getstatic       #337 <Field PdfName PdfName.FONT>
	//    3    7:invokespecial   #340 <Method void PdfDictionary(PdfName)>
	//    4   10:astore          4
		pdfdictionary.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TYPE0)));
	//    5   12:aload           4
	//    6   14:getstatic       #346 <Field PdfName PdfName.SUBTYPE>
	//    7   17:getstatic       #433 <Field PdfName PdfName.TYPE0>
	//    8   20:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(cff)
	//*   9   23:aload_0         
	//*  10   24:getfield        #343 <Field boolean cff>
	//*  11   27:ifeq            130
			pdfdictionary.put(PdfName.BASEFONT, ((PdfObject) (new PdfName((new StringBuilder()).append(s).append(fontName).append("-").append(encoding).toString()))));
	//   12   30:aload           4
	//   13   32:getstatic       #355 <Field PdfName PdfName.BASEFONT>
	//   14   35:new             #333 <Class PdfName>
	//   15   38:dup             
	//   16   39:new             #133 <Class StringBuilder>
	//   17   42:dup             
	//   18   43:invokespecial   #134 <Method void StringBuilder()>
	//   19   46:aload_2         
	//   20   47:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:aload_0         
	//   22   51:getfield        #358 <Field String fontName>
	//   23   54:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   24   57:ldc2            #360 <String "-">
	//   25   60:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   26   63:aload_0         
	//   27   64:getfield        #75  <Field String encoding>
	//   28   67:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   29   70:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   30   73:invokespecial   #361 <Method void PdfName(String)>
	//   31   76:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		else
	//*  32   79:aload           4
	//*  33   81:getstatic       #436 <Field PdfName PdfName.ENCODING>
	//*  34   84:new             #333 <Class PdfName>
	//*  35   87:dup             
	//*  36   88:aload_0         
	//*  37   89:getfield        #75  <Field String encoding>
	//*  38   92:invokespecial   #361 <Method void PdfName(String)>
	//*  39   95:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  40   98:aload           4
	//*  41  100:getstatic       #439 <Field PdfName PdfName.DESCENDANTFONTS>
	//*  42  103:new             #441 <Class PdfArray>
	//*  43  106:dup             
	//*  44  107:aload_1         
	//*  45  108:invokespecial   #444 <Method void PdfArray(PdfObject)>
	//*  46  111:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  47  114:aload_3         
	//*  48  115:ifnull          127
	//*  49  118:aload           4
	//*  50  120:getstatic       #447 <Field PdfName PdfName.TOUNICODE>
	//*  51  123:aload_3         
	//*  52  124:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  53  127:aload           4
	//*  54  129:areturn         
			pdfdictionary.put(PdfName.BASEFONT, ((PdfObject) (new PdfName((new StringBuilder()).append(s).append(fontName).toString()))));
	//   55  130:aload           4
	//   56  132:getstatic       #355 <Field PdfName PdfName.BASEFONT>
	//   57  135:new             #333 <Class PdfName>
	//   58  138:dup             
	//   59  139:new             #133 <Class StringBuilder>
	//   60  142:dup             
	//   61  143:invokespecial   #134 <Method void StringBuilder()>
	//   62  146:aload_2         
	//   63  147:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   64  150:aload_0         
	//   65  151:getfield        #358 <Field String fontName>
	//   66  154:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   67  157:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   68  160:invokespecial   #361 <Method void PdfName(String)>
	//   69  163:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.ENCODING, ((PdfObject) (new PdfName(encoding))));
		pdfdictionary.put(PdfName.DESCENDANTFONTS, ((PdfObject) (new PdfArray(((PdfObject) (pdfindirectreference))))));
		if(pdfindirectreference1 != null)
			pdfdictionary.put(PdfName.TOUNICODE, ((PdfObject) (pdfindirectreference1)));
		return pdfdictionary;
	//*  70  166:goto            79
	}

	public PdfStream getFullFontStream()
		throws IOException, DocumentException
	{
		if(cff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #343 <Field boolean cff>
	//*   2    4:ifeq            26
			return ((PdfStream) (new BaseFont.StreamFont(readCffFont(), "CIDFontType0C", compressionLevel)));
	//    3    7:new             #451 <Class BaseFont$StreamFont>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokevirtual   #455 <Method byte[] readCffFont()>
	//    7   15:ldc2            #457 <String "CIDFontType0C">
	//    8   18:aload_0         
	//    9   19:getfield        #460 <Field int compressionLevel>
	//   10   22:invokespecial   #463 <Method void BaseFont$StreamFont(byte[], String, int)>
	//   11   25:areturn         
		else
			return super.getFullFontStream();
	//   12   26:aload_0         
	//   13   27:invokespecial   #465 <Method PdfStream TrueTypeFont.getFullFontStream()>
	//   14   30:areturn         
	}

	protected Map getGlyphSubstitutionMap()
	{
		return glyphSubstitutionMap;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field Map glyphSubstitutionMap>
	//    2    4:areturn         
	}

	public int[] getMetricsTT(int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(cmapExt == null) goto _L2; else goto _L1
	//    2    3:aload_0         
	//    3    4:getfield        #302 <Field HashMap cmapExt>
	//    4    7:ifnull          27
_L1:
		int ai[] = (int[])cmapExt.get(((Object) (Integer.valueOf(i))));
	//    5   10:aload_0         
	//    6   11:getfield        #302 <Field HashMap cmapExt>
	//    7   14:iload_1         
	//    8   15:invokestatic    #225 <Method Integer Integer.valueOf(int)>
	//    9   18:invokevirtual   #188 <Method Object HashMap.get(Object)>
	//   10   21:checkcast       #221 <Class int[]>
	//   11   24:astore_3        
_L4:
		return ai;
	//   12   25:aload_3         
	//   13   26:areturn         
_L2:
		HashMap hashmap;
		if(fontSpecific)
	//*  14   27:aload_0         
	//*  15   28:getfield        #157 <Field boolean fontSpecific>
	//*  16   31:ifeq            91
			hashmap = cmap10;
	//   17   34:aload_0         
	//   18   35:getfield        #160 <Field HashMap cmap10>
	//   19   38:astore_2        
		else
	//*  20   39:aload           4
	//*  21   41:astore_3        
	//*  22   42:aload_2         
	//*  23   43:ifnull          25
	//*  24   46:aload_0         
	//*  25   47:getfield        #157 <Field boolean fontSpecific>
	//*  26   50:ifeq            99
	//*  27   53:iload_1         
	//*  28   54:sipush          -256
	//*  29   57:iand            
	//*  30   58:ifeq            75
	//*  31   61:aload           4
	//*  32   63:astore_3        
	//*  33   64:iload_1         
	//*  34   65:sipush          -256
	//*  35   68:iand            
	//*  36   69:ldc2            #468 <Int 61440>
	//*  37   72:icmpne          25
	//*  38   75:aload_2         
	//*  39   76:iload_1         
	//*  40   77:sipush          255
	//*  41   80:iand            
	//*  42   81:invokestatic    #225 <Method Integer Integer.valueOf(int)>
	//*  43   84:invokevirtual   #188 <Method Object HashMap.get(Object)>
	//*  44   87:checkcast       #221 <Class int[]>
	//*  45   90:areturn         
			hashmap = cmap31;
	//   46   91:aload_0         
	//   47   92:getfield        #154 <Field HashMap cmap31>
	//   48   95:astore_2        
		ai = ((int []) (obj));
		if(hashmap == null) goto _L4; else goto _L3
_L3:
		if(!fontSpecific)
			break MISSING_BLOCK_LABEL_99;
		if((i & 0xffffff00) == 0)
			break; /* Loop/switch isn't completed */
		ai = ((int []) (obj));
		if((i & 0xffffff00) != 61440) goto _L4; else goto _L5
_L5:
		return (int[])hashmap.get(((Object) (Integer.valueOf(i & 0xff))));
	//*  49   96:goto            39
		int ai2[] = (int[])hashmap.get(((Object) (Integer.valueOf(i))));
	//   50   99:aload_2         
	//   51  100:iload_1         
	//   52  101:invokestatic    #225 <Method Integer Integer.valueOf(int)>
	//   53  104:invokevirtual   #188 <Method Object HashMap.get(Object)>
	//   54  107:checkcast       #221 <Class int[]>
	//   55  110:astore          4
		int ai1[] = ai2;
	//   56  112:aload           4
	//   57  114:astore_3        
		if(ai2 == null)
	//*  58  115:aload           4
	//*  59  117:ifnonnull       151
		{
			Character character = ArabicLigaturizer.getReverseMapping((char)i);
	//   60  120:iload_1         
	//   61  121:int2char        
	//   62  122:invokestatic    #473 <Method Character ArabicLigaturizer.getReverseMapping(char)>
	//   63  125:astore          5
			ai1 = ai2;
	//   64  127:aload           4
	//   65  129:astore_3        
			if(character != null)
	//*  66  130:aload           5
	//*  67  132:ifnull          151
				ai1 = (int[])hashmap.get(((Object) (Integer.valueOf(((int) (character.charValue()))))));
	//   68  135:aload_2         
	//   69  136:aload           5
	//   70  138:invokevirtual   #477 <Method char Character.charValue()>
	//   71  141:invokestatic    #225 <Method Integer Integer.valueOf(int)>
	//   72  144:invokevirtual   #188 <Method Object HashMap.get(Object)>
	//   73  147:checkcast       #221 <Class int[]>
	//   74  150:astore_3        
		}
		return ai1;
	//   75  151:aload_3         
	//   76  152:areturn         
	}

	Language getSupportedLanguage()
	{
		return supportedLanguage;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field Language supportedLanguage>
	//    2    4:areturn         
	}

	public PdfStream getToUnicode(Object aobj[])
	{
		if(aobj.length == 0)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ifne            7
			return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
		StringBuffer stringbuffer = new StringBuffer("/CIDInit /ProcSet findresource begin\n12 dict begin\nbegincmap\n/CIDSystemInfo\n<< /Registry (TTX+0)\n/Ordering (T42UV)\n/Supplement 0\n>> def\n/CMapName /TTX+0 def\n/CMapType 2 def\n1 begincodespacerange\n<0000><FFFF>\nendcodespacerange\n");
	//    5    7:new             #398 <Class StringBuffer>
	//    6   10:dup             
	//    7   11:ldc2            #481 <String "/CIDInit /ProcSet findresource begin\n12 dict begin\nbegincmap\n/CIDSystemInfo\n<< /Registry (TTX+0)\n/Ordering (T42UV)\n/Supplement 0\n>> def\n/CMapName /TTX+0 def\n/CMapType 2 def\n1 begincodespacerange\n<0000><FFFF>\nendcodespacerange\n">
	//    8   14:invokespecial   #401 <Method void StringBuffer(String)>
	//    9   17:astore          5
		int i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		for(int j = 0; j < aobj.length; j++)
	//*  12   21:iconst_0        
	//*  13   22:istore_3        
	//*  14   23:iload_3         
	//*  15   24:aload_1         
	//*  16   25:arraylength     
	//*  17   26:icmpge          134
		{
			int k = i;
	//   18   29:iload_2         
	//   19   30:istore          4
			if(i == 0)
	//*  20   32:iload_2         
	//*  21   33:ifne            74
			{
				if(j != 0)
	//*  22   36:iload_3         
	//*  23   37:ifeq            49
					stringbuffer.append("endbfrange\n");
	//   24   40:aload           5
	//   25   42:ldc2            #483 <String "endbfrange\n">
	//   26   45:invokevirtual   #416 <Method StringBuffer StringBuffer.append(String)>
	//   27   48:pop             
				k = Math.min(100, aobj.length - j);
	//   28   49:bipush          100
	//   29   51:aload_1         
	//   30   52:arraylength     
	//   31   53:iload_3         
	//   32   54:isub            
	//   33   55:invokestatic    #489 <Method int Math.min(int, int)>
	//   34   58:istore          4
				stringbuffer.append(k).append(" beginbfrange\n");
	//   35   60:aload           5
	//   36   62:iload           4
	//   37   64:invokevirtual   #410 <Method StringBuffer StringBuffer.append(int)>
	//   38   67:ldc2            #491 <String " beginbfrange\n">
	//   39   70:invokevirtual   #416 <Method StringBuffer StringBuffer.append(String)>
	//   40   73:pop             
			}
			i = k - 1;
	//   41   74:iload           4
	//   42   76:iconst_1        
	//   43   77:isub            
	//   44   78:istore_2        
			int ai[] = (int[])(int[])aobj[j];
	//   45   79:aload_1         
	//   46   80:iload_3         
	//   47   81:aaload          
	//   48   82:checkcast       #221 <Class int[]>
	//   49   85:checkcast       #221 <Class int[]>
	//   50   88:astore          6
			String s = toHex(ai[0]);
	//   51   90:aload           6
	//   52   92:iconst_0        
	//   53   93:iaload          
	//   54   94:invokestatic    #493 <Method String toHex(int)>
	//   55   97:astore          7
			stringbuffer.append(s).append(s).append(toHex(ai[2])).append('\n');
	//   56   99:aload           5
	//   57  101:aload           7
	//   58  103:invokevirtual   #416 <Method StringBuffer StringBuffer.append(String)>
	//   59  106:aload           7
	//   60  108:invokevirtual   #416 <Method StringBuffer StringBuffer.append(String)>
	//   61  111:aload           6
	//   62  113:iconst_2        
	//   63  114:iaload          
	//   64  115:invokestatic    #493 <Method String toHex(int)>
	//   65  118:invokevirtual   #416 <Method StringBuffer StringBuffer.append(String)>
	//   66  121:bipush          10
	//   67  123:invokevirtual   #407 <Method StringBuffer StringBuffer.append(char)>
	//   68  126:pop             
		}

	//   69  127:iload_3         
	//   70  128:iconst_1        
	//   71  129:iadd            
	//   72  130:istore_3        
	//*  73  131:goto            23
		stringbuffer.append("endbfrange\nendcmap\nCMapName currentdict /CMap defineresource pop\nend end\n");
	//   74  134:aload           5
	//   75  136:ldc2            #495 <String "endbfrange\nendcmap\nCMapName currentdict /CMap defineresource pop\nend end\n">
	//   76  139:invokevirtual   #416 <Method StringBuffer StringBuffer.append(String)>
	//   77  142:pop             
		aobj = ((Object []) (new PdfStream(PdfEncodings.convertToBytes(stringbuffer.toString(), ((String) (null))))));
	//   78  143:new             #497 <Class PdfStream>
	//   79  146:dup             
	//   80  147:aload           5
	//   81  149:invokevirtual   #422 <Method String StringBuffer.toString()>
	//   82  152:aconst_null     
	//   83  153:invokestatic    #502 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//   84  156:invokespecial   #505 <Method void PdfStream(byte[])>
	//   85  159:astore_1        
		((PdfStream) (aobj)).flateCompress(compressionLevel);
	//   86  160:aload_1         
	//   87  161:aload_0         
	//   88  162:getfield        #460 <Field int compressionLevel>
	//   89  165:invokevirtual   #508 <Method void PdfStream.flateCompress(int)>
		return ((PdfStream) (aobj));
	//   90  168:aload_1         
	//   91  169:areturn         
	}

	public int getWidth(int i)
	{
		if(vertical)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field boolean vertical>
	//*   2    4:ifeq            11
			return 1000;
	//    3    7:sipush          1000
	//    4   10:ireturn         
		if(fontSpecific)
	//*   5   11:aload_0         
	//*   6   12:getfield        #157 <Field boolean fontSpecific>
	//*   7   15:ifeq            50
		{
			if((i & 0xff00) == 0 || (i & 0xff00) == 61440)
	//*   8   18:iload_1         
	//*   9   19:ldc2            #510 <Int 65280>
	//*  10   22:iand            
	//*  11   23:ifeq            37
	//*  12   26:iload_1         
	//*  13   27:ldc2            #510 <Int 65280>
	//*  14   30:iand            
	//*  15   31:ldc2            #468 <Int 61440>
	//*  16   34:icmpne          48
				return getRawWidth(i & 0xff, ((String) (null)));
	//   17   37:aload_0         
	//   18   38:iload_1         
	//   19   39:sipush          255
	//   20   42:iand            
	//   21   43:aconst_null     
	//   22   44:invokevirtual   #514 <Method int getRawWidth(int, String)>
	//   23   47:ireturn         
			else
				return 0;
	//   24   48:iconst_0        
	//   25   49:ireturn         
		} else
		{
			return getRawWidth(i, encoding);
	//   26   50:aload_0         
	//   27   51:iload_1         
	//   28   52:aload_0         
	//   29   53:getfield        #75  <Field String encoding>
	//   30   56:invokevirtual   #514 <Method int getRawWidth(int, String)>
	//   31   59:ireturn         
		}
	}

	public int getWidth(String s)
	{
		if(!vertical) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field boolean vertical>
	//    2    4:ifeq            18
_L1:
		int i = s.length() * 1000;
	//    3    7:aload_1         
	//    4    8:invokevirtual   #64  <Method int String.length()>
	//    5   11:sipush          1000
	//    6   14:imul            
	//    7   15:istore_2        
_L4:
		return i;
	//    8   16:iload_2         
	//    9   17:ireturn         
_L2:
		int l = 0;
	//   10   18:iconst_0        
	//   11   19:istore          4
		int j = 0;
	//   12   21:iconst_0        
	//   13   22:istore_3        
		if(fontSpecific)
	//*  14   23:aload_0         
	//*  15   24:getfield        #157 <Field boolean fontSpecific>
	//*  16   27:ifeq            105
		{
			s = ((String) (s.toCharArray()));
	//   17   30:aload_1         
	//   18   31:invokevirtual   #519 <Method char[] String.toCharArray()>
	//   19   34:astore_1        
			int i1 = s.length;
	//   20   35:aload_1         
	//   21   36:arraylength     
	//   22   37:istore          5
			l = 0;
	//   23   39:iconst_0        
	//   24   40:istore          4
			do
			{
label0:
				{
					i = j;
	//   25   42:iload_3         
	//   26   43:istore_2        
					if(l >= i1)
						continue;
	//   27   44:iload           4
	//   28   46:iload           5
	//   29   48:icmpge          16
					char c = s[l];
	//   30   51:aload_1         
	//   31   52:iload           4
	//   32   54:caload          
	//   33   55:istore          6
					if((c & 0xff00) != 0)
	//*  34   57:iload           6
	//*  35   59:ldc2            #510 <Int 65280>
	//*  36   62:iand            
	//*  37   63:ifeq            80
					{
						i = j;
	//   38   66:iload_3         
	//   39   67:istore_2        
						if((c & 0xff00) != 61440)
							break label0;
	//   40   68:iload           6
	//   41   70:ldc2            #510 <Int 65280>
	//   42   73:iand            
	//   43   74:ldc2            #468 <Int 61440>
	//   44   77:icmpne          94
					}
					i = j + getRawWidth(c & 0xff, ((String) (null)));
	//   45   80:iload_3         
	//   46   81:aload_0         
	//   47   82:iload           6
	//   48   84:sipush          255
	//   49   87:iand            
	//   50   88:aconst_null     
	//   51   89:invokevirtual   #514 <Method int getRawWidth(int, String)>
	//   52   92:iadd            
	//   53   93:istore_2        
				}
				l++;
	//   54   94:iload           4
	//   55   96:iconst_1        
	//   56   97:iadd            
	//   57   98:istore          4
				j = i;
	//   58  100:iload_2         
	//   59  101:istore_3        
			} while(true);
	//   60  102:goto            42
		} else
		{
			int j1 = s.length();
	//   61  105:aload_1         
	//   62  106:invokevirtual   #64  <Method int String.length()>
	//   63  109:istore          5
			int k = 0;
	//   64  111:iconst_0        
	//   65  112:istore_3        
			do
			{
				i = l;
	//   66  113:iload           4
	//   67  115:istore_2        
				if(k >= j1)
					continue;
	//   68  116:iload_3         
	//   69  117:iload           5
	//   70  119:icmpge          16
				if(Utilities.isSurrogatePair(s, k))
	//*  71  122:aload_1         
	//*  72  123:iload_3         
	//*  73  124:invokestatic    #525 <Method boolean Utilities.isSurrogatePair(String, int)>
	//*  74  127:ifeq            161
				{
					i = l + getRawWidth(Utilities.convertToUtf32(s, k), encoding);
	//   75  130:iload           4
	//   76  132:aload_0         
	//   77  133:aload_1         
	//   78  134:iload_3         
	//   79  135:invokestatic    #529 <Method int Utilities.convertToUtf32(String, int)>
	//   80  138:aload_0         
	//   81  139:getfield        #75  <Field String encoding>
	//   82  142:invokevirtual   #514 <Method int getRawWidth(int, String)>
	//   83  145:iadd            
	//   84  146:istore_2        
					k++;
	//   85  147:iload_3         
	//   86  148:iconst_1        
	//   87  149:iadd            
	//   88  150:istore_3        
				} else
	//*  89  151:iload_3         
	//*  90  152:iconst_1        
	//*  91  153:iadd            
	//*  92  154:istore_3        
	//*  93  155:iload_2         
	//*  94  156:istore          4
	//*  95  158:goto            113
				{
					i = l + getRawWidth(((int) (s.charAt(k))), encoding);
	//   96  161:iload           4
	//   97  163:aload_0         
	//   98  164:aload_1         
	//   99  165:iload_3         
	//  100  166:invokevirtual   #533 <Method char String.charAt(int)>
	//  101  169:aload_0         
	//  102  170:getfield        #75  <Field String encoding>
	//  103  173:invokevirtual   #514 <Method int getRawWidth(int, String)>
	//  104  176:iadd            
	//  105  177:istore_2        
				}
				k++;
				l = i;
			} while(true);
	//  106  178:goto            151
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	void process(byte abyte0[], boolean flag)
		throws DocumentException, IOException
	{
		super.process(abyte0, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #534 <Method void TrueTypeFont.process(byte[], boolean)>
	//    4    6:return          
	}

	public boolean setCharAdvance(int i, int j)
	{
		int ai[] = getMetricsTT(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #319 <Method int[] getMetricsTT(int)>
	//    3    5:astore_3        
		if(ai == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       12
		{
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		} else
		{
			ai[1] = j;
	//    8   12:aload_3         
	//    9   13:iconst_1        
	//   10   14:iload_2         
	//   11   15:iastore         
			return true;
	//   12   16:iconst_1        
	//   13   17:ireturn         
		}
	}

	void writeFont(PdfWriter pdfwriter, PdfIndirectReference pdfindirectreference, Object aobj[])
		throws DocumentException, IOException
	{
		pdfwriter.getTtfUnicodeWriter().writeFont(this, pdfindirectreference, aobj, rotbits);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #544 <Method TtfUnicodeWriter PdfWriter.getTtfUnicodeWriter()>
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:getstatic       #42  <Field byte[] rotbits>
	//    6   10:invokevirtual   #549 <Method void TtfUnicodeWriter.writeFont(TrueTypeFontUnicode, PdfIndirectReference, Object[], byte[])>
	//    7   13:return          
	}

	private static final List SUPPORTED_LANGUAGES_FOR_OTF;
	private static final byte rotbits[] = {
		-128, 64, 32, 16, 8, 4, 2, 1
	};
	private Map glyphSubstitutionMap;
	private Language supportedLanguage;

	static 
	{
		SUPPORTED_LANGUAGES_FOR_OTF = Arrays.asList(((Object []) (new Language[] {
			Language.BENGALI
		})));
	//    0    0:iconst_1        
	//    1    1:anewarray       Language[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:getstatic       #24  <Field Language Language.BENGALI>
	//    5    9:aastore         
	//    6   10:invokestatic    #30  <Method List Arrays.asList(Object[])>
	//    7   13:putstatic       #32  <Field List SUPPORTED_LANGUAGES_FOR_OTF>
	//    8   16:bipush          8
	//    9   18:newarray        byte[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:ldc1            #33  <Int -128>
	//   13   24:bastore         
	//   14   25:dup             
	//   15   26:iconst_1        
	//   16   27:ldc1            #34  <Int 64>
	//   17   29:bastore         
	//   18   30:dup             
	//   19   31:iconst_2        
	//   20   32:ldc1            #35  <Int 32>
	//   21   34:bastore         
	//   22   35:dup             
	//   23   36:iconst_3        
	//   24   37:ldc1            #36  <Int 16>
	//   25   39:bastore         
	//   26   40:dup             
	//   27   41:iconst_4        
	//   28   42:ldc1            #37  <Int 8>
	//   29   44:bastore         
	//   30   45:dup             
	//   31   46:iconst_5        
	//   32   47:ldc1            #38  <Int 4>
	//   33   49:bastore         
	//   34   50:dup             
	//   35   51:bipush          6
	//   36   53:ldc1            #39  <Int 2>
	//   37   55:bastore         
	//   38   56:dup             
	//   39   57:bipush          7
	//   40   59:ldc1            #40  <Int 1>
	//   41   61:bastore         
	//   42   62:putstatic       #42  <Field byte[] rotbits>
	//*  43   65:return          
	}
}
