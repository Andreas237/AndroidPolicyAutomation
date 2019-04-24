// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Utilities;
import com.itextpdf.text.pdf.fonts.otf.Language;
import com.itextpdf.text.pdf.languages.BanglaGlyphRepositioner;
import com.itextpdf.text.pdf.languages.GlyphRepositioner;
import com.itextpdf.text.pdf.languages.IndicCompositeCharacterComparator;
import java.io.UnsupportedEncodingException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseFont, IntHashtable, CJKFont, TrueTypeFontUnicode, 
//			ArrayBasedStringTokenizer, Glyph, PdfEncodings, StringUtils, 
//			PdfName, PdfIndirectReference, PdfWriter

class FontDetails
{

	FontDetails(PdfName pdfname, PdfIndirectReference pdfindirectreference, BaseFont basefont)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		subset = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #35  <Field boolean subset>
		fontName = pdfname;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #37  <Field PdfName fontName>
		indirectReference = pdfindirectreference;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #39  <Field PdfIndirectReference indirectReference>
		baseFont = basefont;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #41  <Field BaseFont baseFont>
		fontType = basefont.getFontType();
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #47  <Method int BaseFont.getFontType()>
	//   17   29:putfield        #49  <Field int fontType>
		switch(fontType)
	//*  18   32:aload_0         
	//*  19   33:getfield        #49  <Field int fontType>
		{
	//*  20   36:tableswitch     0 3: default 68
	//	               0 69
	//	               1 69
	//	               2 79
	//	               3 99
		default:
			return;
	//   21   68:return          

		case 0: // '\0'
		case 1: // '\001'
			shortTag = new byte[256];
	//   22   69:aload_0         
	//   23   70:sipush          256
	//   24   73:newarray        byte[]
	//   25   75:putfield        #51  <Field byte[] shortTag>
			return;
	//   26   78:return          

		case 2: // '\002'
			cjkTag = new IntHashtable();
	//   27   79:aload_0         
	//   28   80:new             #53  <Class IntHashtable>
	//   29   83:dup             
	//   30   84:invokespecial   #54  <Method void IntHashtable()>
	//   31   87:putfield        #56  <Field IntHashtable cjkTag>
			cjkFont = (CJKFont)basefont;
	//   32   90:aload_0         
	//   33   91:aload_3         
	//   34   92:checkcast       #58  <Class CJKFont>
	//   35   95:putfield        #60  <Field CJKFont cjkFont>
			return;
	//   36   98:return          

		case 3: // '\003'
			longTag = new HashMap();
	//   37   99:aload_0         
	//   38  100:new             #62  <Class HashMap>
	//   39  103:dup             
	//   40  104:invokespecial   #63  <Method void HashMap()>
	//   41  107:putfield        #65  <Field HashMap longTag>
			break;
		}
		ttu = (TrueTypeFontUnicode)basefont;
	//   42  110:aload_0         
	//   43  111:aload_3         
	//   44  112:checkcast       #67  <Class TrueTypeFontUnicode>
	//   45  115:putfield        #69  <Field TrueTypeFontUnicode ttu>
		symbolic = basefont.isFontSpecific();
	//   46  118:aload_0         
	//   47  119:aload_3         
	//   48  120:invokevirtual   #73  <Method boolean BaseFont.isFontSpecific()>
	//   49  123:putfield        #75  <Field boolean symbolic>
	//   50  126:return          
	}

	private boolean canApplyGlyphSubstitution()
	{
		return fontType == 3 && ttu.getGlyphSubstitutionMap() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int fontType>
	//    2    4:iconst_3        
	//    3    5:icmpne          20
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//    6   12:invokevirtual   #81  <Method Map TrueTypeFontUnicode.getGlyphSubstitutionMap()>
	//    7   15:ifnull          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private byte[] convertToBytesAfterGlyphSubstitution(String s)
		throws UnsupportedEncodingException
	{
		if(!canApplyGlyphSubstitution())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #87  <Method boolean canApplyGlyphSubstitution()>
	//*   2    4:ifne            17
			throw new IllegalArgumentException("Make sure the font type if TTF Unicode and a valid GlyphSubstitutionTable exists!");
	//    3    7:new             #89  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #91  <String "Make sure the font type if TTF Unicode and a valid GlyphSubstitutionTable exists!">
	//    6   13:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		Object obj = ((Object) (ttu.getGlyphSubstitutionMap()));
	//    8   17:aload_0         
	//    9   18:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//   10   21:invokevirtual   #81  <Method Map TrueTypeFontUnicode.getGlyphSubstitutionMap()>
	//   11   24:astore          7
		TreeSet treeset = new TreeSet(((java.util.Comparator) (new IndicCompositeCharacterComparator())));
	//   12   26:new             #96  <Class TreeSet>
	//   13   29:dup             
	//   14   30:new             #98  <Class IndicCompositeCharacterComparator>
	//   15   33:dup             
	//   16   34:invokespecial   #99  <Method void IndicCompositeCharacterComparator()>
	//   17   37:invokespecial   #102 <Method void TreeSet(java.util.Comparator)>
	//   18   40:astore          8
		((Set) (treeset)).addAll(((java.util.Collection) (((Map) (obj)).keySet())));
	//   19   42:aload           8
	//   20   44:aload           7
	//   21   46:invokeinterface #108 <Method Set Map.keySet()>
	//   22   51:invokeinterface #114 <Method boolean Set.addAll(java.util.Collection)>
	//   23   56:pop             
		String as[] = (new ArrayBasedStringTokenizer((String[])((Set) (treeset)).toArray(((Object []) (new String[0]))))).tokenize(s);
	//   24   57:new             #116 <Class ArrayBasedStringTokenizer>
	//   25   60:dup             
	//   26   61:aload           8
	//   27   63:iconst_0        
	//   28   64:anewarray       String[]
	//   29   67:invokeinterface #122 <Method Object[] Set.toArray(Object[])>
	//   30   72:checkcast       #124 <Class String[]>
	//   31   75:invokespecial   #127 <Method void ArrayBasedStringTokenizer(String[])>
	//   32   78:aload_1         
	//   33   79:invokevirtual   #131 <Method String[] ArrayBasedStringTokenizer.tokenize(String)>
	//   34   82:astore          8
		s = ((String) (new ArrayList(50)));
	//   35   84:new             #133 <Class ArrayList>
	//   36   87:dup             
	//   37   88:bipush          50
	//   38   90:invokespecial   #136 <Method void ArrayList(int)>
	//   39   93:astore_1        
		int l = as.length;
	//   40   94:aload           8
	//   41   96:arraylength     
	//   42   97:istore          5
		int i = 0;
	//   43   99:iconst_0        
	//   44  100:istore_3        
		while(i < l) 
	//*  45  101:iload_3         
	//*  46  102:iload           5
	//*  47  104:icmpge          221
		{
			String s1 = as[i];
	//   48  107:aload           8
	//   49  109:iload_3         
	//   50  110:aaload          
	//   51  111:astore          9
			Glyph glyph1 = (Glyph)((Map) (obj)).get(((Object) (s1)));
	//   52  113:aload           7
	//   53  115:aload           9
	//   54  117:invokeinterface #140 <Method Object Map.get(Object)>
	//   55  122:checkcast       #142 <Class Glyph>
	//   56  125:astore          10
			if(glyph1 != null)
	//*  57  127:aload           10
	//*  58  129:ifnull          148
			{
				((List) (s)).add(((Object) (glyph1)));
	//   59  132:aload_1         
	//   60  133:aload           10
	//   61  135:invokeinterface #148 <Method boolean List.add(Object)>
	//   62  140:pop             
			} else
	//*  63  141:iload_3         
	//*  64  142:iconst_1        
	//*  65  143:iadd            
	//*  66  144:istore_3        
	//*  67  145:goto            101
			{
				char ac1[] = s1.toCharArray();
	//   68  148:aload           9
	//   69  150:invokevirtual   #152 <Method char[] String.toCharArray()>
	//   70  153:astore          9
				int i1 = ac1.length;
	//   71  155:aload           9
	//   72  157:arraylength     
	//   73  158:istore          6
				int k = 0;
	//   74  160:iconst_0        
	//   75  161:istore          4
				while(k < i1) 
	//*  76  163:iload           4
	//*  77  165:iload           6
	//*  78  167:icmpge          141
				{
					char c = ac1[k];
	//   79  170:aload           9
	//   80  172:iload           4
	//   81  174:caload          
	//   82  175:istore_2        
					int ai[] = ttu.getMetricsTT(((int) (c)));
	//   83  176:aload_0         
	//   84  177:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//   85  180:iload_2         
	//   86  181:invokevirtual   #156 <Method int[] TrueTypeFontUnicode.getMetricsTT(int)>
	//   87  184:astore          10
					((List) (s)).add(((Object) (new Glyph(ai[0], ai[1], String.valueOf(c)))));
	//   88  186:aload_1         
	//   89  187:new             #142 <Class Glyph>
	//   90  190:dup             
	//   91  191:aload           10
	//   92  193:iconst_0        
	//   93  194:iaload          
	//   94  195:aload           10
	//   95  197:iconst_1        
	//   96  198:iaload          
	//   97  199:iload_2         
	//   98  200:invokestatic    #160 <Method String String.valueOf(char)>
	//   99  203:invokespecial   #163 <Method void Glyph(int, int, String)>
	//  100  206:invokeinterface #148 <Method boolean List.add(Object)>
	//  101  211:pop             
					k++;
	//  102  212:iload           4
	//  103  214:iconst_1        
	//  104  215:iadd            
	//  105  216:istore          4
				}
			}
			i++;
		}
	//* 106  218:goto            163
		obj = ((Object) (getGlyphRepositioner()));
	//  107  221:aload_0         
	//  108  222:invokespecial   #167 <Method GlyphRepositioner getGlyphRepositioner()>
	//  109  225:astore          7
		if(obj != null)
	//* 110  227:aload           7
	//* 111  229:ifnull          240
			((GlyphRepositioner) (obj)).repositionGlyphs(((List) (s)));
	//  112  232:aload           7
	//  113  234:aload_1         
	//  114  235:invokeinterface #173 <Method void GlyphRepositioner.repositionGlyphs(List)>
		char ac[] = new char[((List) (s)).size()];
	//  115  240:aload_1         
	//  116  241:invokeinterface #176 <Method int List.size()>
	//  117  246:newarray        char[]
	//  118  248:astore          7
		for(int j = 0; j < ((List) (s)).size(); j++)
	//* 119  250:iconst_0        
	//* 120  251:istore_3        
	//* 121  252:iload_3         
	//* 122  253:aload_1         
	//* 123  254:invokeinterface #176 <Method int List.size()>
	//* 124  259:icmpge          354
		{
			Glyph glyph = (Glyph)((List) (s)).get(j);
	//  125  262:aload_1         
	//  126  263:iload_3         
	//  127  264:invokeinterface #179 <Method Object List.get(int)>
	//  128  269:checkcast       #142 <Class Glyph>
	//  129  272:astore          8
			ac[j] = (char)glyph.code;
	//  130  274:aload           7
	//  131  276:iload_3         
	//  132  277:aload           8
	//  133  279:getfield        #182 <Field int Glyph.code>
	//  134  282:int2char        
	//  135  283:castore         
			Integer integer = Integer.valueOf(glyph.code);
	//  136  284:aload           8
	//  137  286:getfield        #182 <Field int Glyph.code>
	//  138  289:invokestatic    #187 <Method Integer Integer.valueOf(int)>
	//  139  292:astore          9
			if(!longTag.containsKey(((Object) (integer))))
	//* 140  294:aload_0         
	//* 141  295:getfield        #65  <Field HashMap longTag>
	//* 142  298:aload           9
	//* 143  300:invokevirtual   #190 <Method boolean HashMap.containsKey(Object)>
	//* 144  303:ifne            347
				longTag.put(((Object) (integer)), ((Object) (new int[] {
					glyph.code, glyph.width, glyph.chars.charAt(0)
				})));
	//  145  306:aload_0         
	//  146  307:getfield        #65  <Field HashMap longTag>
	//  147  310:aload           9
	//  148  312:iconst_3        
	//  149  313:newarray        int[]
	//  150  315:dup             
	//  151  316:iconst_0        
	//  152  317:aload           8
	//  153  319:getfield        #182 <Field int Glyph.code>
	//  154  322:iastore         
	//  155  323:dup             
	//  156  324:iconst_1        
	//  157  325:aload           8
	//  158  327:getfield        #193 <Field int Glyph.width>
	//  159  330:iastore         
	//  160  331:dup             
	//  161  332:iconst_2        
	//  162  333:aload           8
	//  163  335:getfield        #197 <Field String Glyph.chars>
	//  164  338:iconst_0        
	//  165  339:invokevirtual   #201 <Method char String.charAt(int)>
	//  166  342:iastore         
	//  167  343:invokevirtual   #205 <Method Object HashMap.put(Object, Object)>
	//  168  346:pop             
		}

	//  169  347:iload_3         
	//  170  348:iconst_1        
	//  171  349:iadd            
	//  172  350:istore_3        
	//* 173  351:goto            252
		return (new String(ac)).getBytes("UnicodeBigUnmarked");
	//  174  354:new             #118 <Class String>
	//  175  357:dup             
	//  176  358:aload           7
	//  177  360:invokespecial   #208 <Method void String(char[])>
	//  178  363:ldc1            #210 <String "UnicodeBigUnmarked">
	//  179  365:invokevirtual   #213 <Method byte[] String.getBytes(String)>
	//  180  368:areturn         
	}

	private GlyphRepositioner getGlyphRepositioner()
	{
		Language language = ttu.getSupportedLanguage();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//    2    4:invokevirtual   #218 <Method Language TrueTypeFontUnicode.getSupportedLanguage()>
	//    3    7:astore_1        
		if(language == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       48
			throw new IllegalArgumentException((new StringBuilder()).append("The supported language field cannot be null in ").append(((Object) (ttu)).getClass().getName()).toString());
	//    6   12:new             #89  <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:new             #220 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #221 <Method void StringBuilder()>
	//   11   23:ldc1            #223 <String "The supported language field cannot be null in ">
	//   12   25:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:aload_0         
	//   14   29:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//   15   32:invokevirtual   #231 <Method Class Object.getClass()>
	//   16   35:invokevirtual   #237 <Method String Class.getName()>
	//   17   38:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   19   44:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//   20   47:athrow          
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language[];

			static 
			{
				$SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language = new int[Language.values().length];
			//    0    0:invokestatic    #18  <Method Language[] Language.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language>
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language[Language.BENGALI.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language>
			//    5   12:getstatic       #24  <Field Language Language.BENGALI>
			//    6   15:invokevirtual   #28  <Method int Language.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
			//    9   20:return          
				}
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   21:astore_0        
			//*  11   22:return          
			}
		}

		switch(_cls1..SwitchMap.com.itextpdf.text.pdf.fonts.otf.Language[language.ordinal()])
	//*  21   48:getstatic       #244 <Field int[] FontDetails$1.$SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language>
	//*  22   51:aload_1         
	//*  23   52:invokevirtual   #249 <Method int Language.ordinal()>
	//*  24   55:iaload          
		{
	//*  25   56:tableswitch     1 1: default 76
	//	               1 78
		default:
			return null;
	//   26   76:aconst_null     
	//   27   77:areturn         

		case 1: // '\001'
			return ((GlyphRepositioner) (new BanglaGlyphRepositioner(Collections.unmodifiableMap(((Map) (ttu.cmap31))), ttu.getGlyphSubstitutionMap())));
	//   28   78:new             #251 <Class BanglaGlyphRepositioner>
	//   29   81:dup             
	//   30   82:aload_0         
	//   31   83:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//   32   86:getfield        #254 <Field HashMap TrueTypeFontUnicode.cmap31>
	//   33   89:invokestatic    #260 <Method Map Collections.unmodifiableMap(Map)>
	//   34   92:aload_0         
	//   35   93:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//   36   96:invokevirtual   #81  <Method Map TrueTypeFontUnicode.getGlyphSubstitutionMap()>
	//   37   99:invokespecial   #263 <Method void BanglaGlyphRepositioner(Map, Map)>
	//   38  102:areturn         
		}
	}

	byte[] convertToBytes(String s)
	{
		char ac[] = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		fontType;
	//    2    3:aload_0         
	//    3    4:getfield        #49  <Field int fontType>
		JVM INSTR tableswitch 0 5: default 44
	//	               0 58
	//	               1 58
	//	               2 103
	//	               3 231
	//	               4 219
	//	               5 49;
	//    4    7:tableswitch     0 5: default 44
	//	               0 58
	//	               1 58
	//	               2 103
	//	               3 231
	//	               4 219
	//	               5 49
		   goto _L1 _L2 _L2 _L3 _L4 _L5 _L6
_L1:
		s = ((String) (ac));
	//    5   44:aload           7
	//    6   46:astore_1        
_L8:
		return ((byte []) (s));
	//    7   47:aload_1         
	//    8   48:areturn         
_L6:
		return baseFont.convertToBytes(s);
	//    9   49:aload_0         
	//   10   50:getfield        #41  <Field BaseFont baseFont>
	//   11   53:aload_1         
	//   12   54:invokevirtual   #266 <Method byte[] BaseFont.convertToBytes(String)>
	//   13   57:areturn         
_L2:
		int i;
		int j;
		ac = ((char []) (baseFont.convertToBytes(s)));
	//   14   58:aload_0         
	//   15   59:getfield        #41  <Field BaseFont baseFont>
	//   16   62:aload_1         
	//   17   63:invokevirtual   #266 <Method byte[] BaseFont.convertToBytes(String)>
	//   18   66:astore          7
		j = ac.length;
	//   19   68:aload           7
	//   20   70:arraylength     
	//   21   71:istore_3        
		i = 0;
	//   22   72:iconst_0        
	//   23   73:istore_2        
_L9:
		s = ((String) (ac));
	//   24   74:aload           7
	//   25   76:astore_1        
		if(i >= j) goto _L8; else goto _L7
	//   26   77:iload_2         
	//   27   78:iload_3         
	//   28   79:icmpge          47
_L7:
		shortTag[ac[i] & 0xff] = 1;
	//   29   82:aload_0         
	//   30   83:getfield        #51  <Field byte[] shortTag>
	//   31   86:aload           7
	//   32   88:iload_2         
	//   33   89:baload          
	//   34   90:sipush          255
	//   35   93:iand            
	//   36   94:iconst_1        
	//   37   95:bastore         
		i++;
	//   38   96:iload_2         
	//   39   97:iconst_1        
	//   40   98:iadd            
	//   41   99:istore_2        
		  goto _L9
	//*  42  100:goto            74
_L3:
		int k = s.length();
	//   43  103:aload_1         
	//   44  104:invokevirtual   #269 <Method int String.length()>
	//   45  107:istore          4
		if(cjkFont.isIdentity())
	//*  46  109:aload_0         
	//*  47  110:getfield        #60  <Field CJKFont cjkFont>
	//*  48  113:invokevirtual   #272 <Method boolean CJKFont.isIdentity()>
	//*  49  116:ifeq            148
		{
			for(i = 0; i < k; i++)
	//*  50  119:iconst_0        
	//*  51  120:istore_2        
	//*  52  121:iload_2         
	//*  53  122:iload           4
	//*  54  124:icmpge          207
				cjkTag.put(((int) (s.charAt(i))), 0);
	//   55  127:aload_0         
	//   56  128:getfield        #56  <Field IntHashtable cjkTag>
	//   57  131:aload_1         
	//   58  132:iload_2         
	//   59  133:invokevirtual   #201 <Method char String.charAt(int)>
	//   60  136:iconst_0        
	//   61  137:invokevirtual   #275 <Method int IntHashtable.put(int, int)>
	//   62  140:pop             

	//   63  141:iload_2         
	//   64  142:iconst_1        
	//   65  143:iadd            
	//   66  144:istore_2        
		} else
	//*  67  145:goto            121
		{
			i = 0;
	//   68  148:iconst_0        
	//   69  149:istore_2        
			while(i < k) 
	//*  70  150:iload_2         
	//*  71  151:iload           4
	//*  72  153:icmpge          207
			{
				if(Utilities.isSurrogatePair(s, i))
	//*  73  156:aload_1         
	//*  74  157:iload_2         
	//*  75  158:invokestatic    #281 <Method boolean Utilities.isSurrogatePair(String, int)>
	//*  76  161:ifeq            198
				{
					j = Utilities.convertToUtf32(s, i);
	//   77  164:aload_1         
	//   78  165:iload_2         
	//   79  166:invokestatic    #285 <Method int Utilities.convertToUtf32(String, int)>
	//   80  169:istore_3        
					i++;
	//   81  170:iload_2         
	//   82  171:iconst_1        
	//   83  172:iadd            
	//   84  173:istore_2        
				} else
	//*  85  174:aload_0         
	//*  86  175:getfield        #56  <Field IntHashtable cjkTag>
	//*  87  178:aload_0         
	//*  88  179:getfield        #60  <Field CJKFont cjkFont>
	//*  89  182:iload_3         
	//*  90  183:invokevirtual   #289 <Method int CJKFont.getCidCode(int)>
	//*  91  186:iconst_0        
	//*  92  187:invokevirtual   #275 <Method int IntHashtable.put(int, int)>
	//*  93  190:pop             
	//*  94  191:iload_2         
	//*  95  192:iconst_1        
	//*  96  193:iadd            
	//*  97  194:istore_2        
	//*  98  195:goto            150
				{
					j = ((int) (s.charAt(i)));
	//   99  198:aload_1         
	//  100  199:iload_2         
	//  101  200:invokevirtual   #201 <Method char String.charAt(int)>
	//  102  203:istore_3        
				}
				cjkTag.put(cjkFont.getCidCode(j), 0);
				i++;
			}
		}
	//* 103  204:goto            174
		s = ((String) (cjkFont.convertToBytes(s)));
	//  104  207:aload_0         
	//  105  208:getfield        #60  <Field CJKFont cjkFont>
	//  106  211:aload_1         
	//  107  212:invokevirtual   #290 <Method byte[] CJKFont.convertToBytes(String)>
	//  108  215:astore_1        
		  goto _L8
	//* 109  216:goto            47
_L5:
		s = ((String) (baseFont.convertToBytes(s)));
	//  110  219:aload_0         
	//  111  220:getfield        #41  <Field BaseFont baseFont>
	//  112  223:aload_1         
	//  113  224:invokevirtual   #266 <Method byte[] BaseFont.convertToBytes(String)>
	//  114  227:astore_1        
		  goto _L8
	//* 115  228:goto            47
_L4:
		int k1;
		k1 = s.length();
	//  116  231:aload_1         
	//  117  232:invokevirtual   #269 <Method int String.length()>
	//  118  235:istore          5
		ac = new char[k1];
	//  119  237:iload           5
	//  120  239:newarray        char[]
	//  121  241:astore          7
		if(!symbolic) goto _L11; else goto _L10
	//  122  243:aload_0         
	//  123  244:getfield        #75  <Field boolean symbolic>
	//  124  247:ifeq            389
_L10:
		s = ((String) (PdfEncodings.convertToBytes(s, "symboltt")));
	//  125  250:aload_1         
	//  126  251:ldc2            #292 <String "symboltt">
	//  127  254:invokestatic    #297 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//  128  257:astore_1        
		k1 = s.length;
	//  129  258:aload_1         
	//  130  259:arraylength     
	//  131  260:istore          5
		j = 0;
	//  132  262:iconst_0        
	//  133  263:istore_3        
		i = 0;
	//  134  264:iconst_0        
	//  135  265:istore_2        
_L22:
		if(j >= k1) goto _L13; else goto _L12
	//  136  266:iload_3         
	//  137  267:iload           5
	//  138  269:icmpge          375
_L12:
		int ai[];
		try
		{
			ai = ttu.getMetricsTT(s[j] & 0xff);
	//  139  272:aload_0         
	//  140  273:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//  141  276:aload_1         
	//  142  277:iload_3         
	//  143  278:baload          
	//  144  279:sipush          255
	//  145  282:iand            
	//  146  283:invokevirtual   #156 <Method int[] TrueTypeFontUnicode.getMetricsTT(int)>
	//  147  286:astore          8
		}
	//* 148  288:aload           8
	//* 149  290:ifnonnull       296
	//* 150  293:goto            532
	//* 151  296:aload_0         
	//* 152  297:getfield        #65  <Field HashMap longTag>
	//* 153  300:aload           8
	//* 154  302:iconst_0        
	//* 155  303:iaload          
	//* 156  304:invokestatic    #187 <Method Integer Integer.valueOf(int)>
	//* 157  307:iconst_3        
	//* 158  308:newarray        int[]
	//* 159  310:dup             
	//* 160  311:iconst_0        
	//* 161  312:aload           8
	//* 162  314:iconst_0        
	//* 163  315:iaload          
	//* 164  316:iastore         
	//* 165  317:dup             
	//* 166  318:iconst_1        
	//* 167  319:aload           8
	//* 168  321:iconst_1        
	//* 169  322:iaload          
	//* 170  323:iastore         
	//* 171  324:dup             
	//* 172  325:iconst_2        
	//* 173  326:aload_0         
	//* 174  327:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//* 175  330:aload_1         
	//* 176  331:iload_3         
	//* 177  332:baload          
	//* 178  333:sipush          255
	//* 179  336:iand            
	//* 180  337:invokevirtual   #300 <Method char TrueTypeFontUnicode.getUnicodeDifferences(int)>
	//* 181  340:iastore         
	//* 182  341:invokevirtual   #205 <Method Object HashMap.put(Object, Object)>
	//* 183  344:pop             
	//* 184  345:iload_2         
	//* 185  346:iconst_1        
	//* 186  347:iadd            
	//* 187  348:istore          4
	//* 188  350:aload           7
	//* 189  352:iload_2         
	//* 190  353:aload           8
	//* 191  355:iconst_0        
	//* 192  356:iaload          
	//* 193  357:int2char        
	//* 194  358:castore         
	//* 195  359:iload           4
	//* 196  361:istore_2        
	//* 197  362:goto            532
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 198  365:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//  199  366:new             #302 <Class ExceptionConverter>
	//  200  369:dup             
	//  201  370:aload_1         
	//  202  371:invokespecial   #305 <Method void ExceptionConverter(Exception)>
	//  203  374:athrow          
		}
		if(ai != null) goto _L15; else goto _L14
_L15:
		longTag.put(((Object) (Integer.valueOf(ai[0]))), ((Object) (new int[] {
			ai[0], ai[1], ttu.getUnicodeDifferences(s[j] & 0xff)
		})));
		int l = i + 1;
		ac[i] = (char)ai[0];
		i = l;
		  goto _L14
_L13:
		s = ((String) (StringUtils.convertCharsToBytes(Utilities.copyOfRange(ac, 0, i))));
	//  204  375:aload           7
	//  205  377:iconst_0        
	//  206  378:iload_2         
	//  207  379:invokestatic    #309 <Method char[] Utilities.copyOfRange(char[], int, int)>
	//  208  382:invokestatic    #315 <Method byte[] StringUtils.convertCharsToBytes(char[])>
	//  209  385:astore_1        
		  goto _L8
	//* 210  386:goto            47
_L11:
		if(canApplyGlyphSubstitution())
	//* 211  389:aload_0         
	//* 212  390:invokespecial   #87  <Method boolean canApplyGlyphSubstitution()>
	//* 213  393:ifeq            539
			return convertToBytesAfterGlyphSubstitution(s);
	//  214  396:aload_0         
	//  215  397:aload_1         
	//  216  398:invokespecial   #317 <Method byte[] convertToBytesAfterGlyphSubstitution(String)>
	//  217  401:areturn         
		  goto _L16
_L23:
		if(j >= k1) goto _L13; else goto _L17
	//  218  402:iload_3         
	//  219  403:iload           5
	//  220  405:icmpge          529
_L17:
		if(!Utilities.isSurrogatePair(s, j)) goto _L19; else goto _L18
	//  221  408:aload_1         
	//  222  409:iload_3         
	//  223  410:invokestatic    #281 <Method boolean Utilities.isSurrogatePair(String, int)>
	//  224  413:ifeq            446
_L18:
		int i1 = Utilities.convertToUtf32(s, j);
	//  225  416:aload_1         
	//  226  417:iload_3         
	//  227  418:invokestatic    #285 <Method int Utilities.convertToUtf32(String, int)>
	//  228  421:istore          4
		j++;
	//  229  423:iload_3         
	//  230  424:iconst_1        
	//  231  425:iadd            
	//  232  426:istore_3        
_L21:
		ai = ttu.getMetricsTT(i1);
	//  233  427:aload_0         
	//  234  428:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//  235  431:iload           4
	//  236  433:invokevirtual   #156 <Method int[] TrueTypeFontUnicode.getMetricsTT(int)>
	//  237  436:astore          8
		if(ai == null)
	//* 238  438:aload           8
	//* 239  440:ifnonnull       456
			break MISSING_BLOCK_LABEL_546;
	//  240  443:goto            546
		break; /* Loop/switch isn't completed */
_L19:
		i1 = ((int) (s.charAt(j)));
	//  241  446:aload_1         
	//  242  447:iload_3         
	//  243  448:invokevirtual   #201 <Method char String.charAt(int)>
	//  244  451:istore          4
		if(true) goto _L21; else goto _L20
	//  245  453:goto            427
_L20:
		int l1 = ai[0];
	//  246  456:aload           8
	//  247  458:iconst_0        
	//  248  459:iaload          
	//  249  460:istore          6
		Integer integer = Integer.valueOf(l1);
	//  250  462:iload           6
	//  251  464:invokestatic    #187 <Method Integer Integer.valueOf(int)>
	//  252  467:astore          9
		if(!longTag.containsKey(((Object) (integer))))
	//* 253  469:aload_0         
	//* 254  470:getfield        #65  <Field HashMap longTag>
	//* 255  473:aload           9
	//* 256  475:invokevirtual   #190 <Method boolean HashMap.containsKey(Object)>
	//* 257  478:ifne            511
			longTag.put(((Object) (integer)), ((Object) (new int[] {
				l1, ai[1], i1
			})));
	//  258  481:aload_0         
	//  259  482:getfield        #65  <Field HashMap longTag>
	//  260  485:aload           9
	//  261  487:iconst_3        
	//  262  488:newarray        int[]
	//  263  490:dup             
	//  264  491:iconst_0        
	//  265  492:iload           6
	//  266  494:iastore         
	//  267  495:dup             
	//  268  496:iconst_1        
	//  269  497:aload           8
	//  270  499:iconst_1        
	//  271  500:iaload          
	//  272  501:iastore         
	//  273  502:dup             
	//  274  503:iconst_2        
	//  275  504:iload           4
	//  276  506:iastore         
	//  277  507:invokevirtual   #205 <Method Object HashMap.put(Object, Object)>
	//  278  510:pop             
		int j1 = i + 1;
	//  279  511:iload_2         
	//  280  512:iconst_1        
	//  281  513:iadd            
	//  282  514:istore          4
		ac[i] = (char)l1;
	//  283  516:aload           7
	//  284  518:iload_2         
	//  285  519:iload           6
	//  286  521:int2char        
	//  287  522:castore         
		i = j1;
	//  288  523:iload           4
	//  289  525:istore_2        
		break MISSING_BLOCK_LABEL_546;
	//  290  526:goto            546
	//* 291  529:goto            375
_L14:
		j++;
	//  292  532:iload_3         
	//  293  533:iconst_1        
	//  294  534:iadd            
	//  295  535:istore_3        
		  goto _L22
	//* 296  536:goto            266
_L16:
		j = 0;
	//  297  539:iconst_0        
	//  298  540:istore_3        
		i = 0;
	//  299  541:iconst_0        
	//  300  542:istore_2        
		  goto _L23
	//* 301  543:goto            402
		j++;
	//  302  546:iload_3         
	//  303  547:iconst_1        
	//  304  548:iadd            
	//  305  549:istore_3        
		  goto _L23
	//* 306  550:goto            402
	}

	Object[] convertToBytesGid(String s)
	{
		int i;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(fontType != 3)
	//*   2    2:aload_0         
	//*   3    3:getfield        #49  <Field int fontType>
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          21
			throw new IllegalArgumentException("GID require TT Unicode");
	//    6   10:new             #89  <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc2            #323 <String "GID require TT Unicode">
	//    9   17:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//   10   20:athrow          
		int j;
		int k;
		char c;
		int l;
		int i1;
		Object obj;
		char ac[];
		Integer integer;
		try
		{
			obj = ((Object) (new StringBuilder()));
	//   11   21:new             #220 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #221 <Method void StringBuilder()>
	//   14   28:astore          8
		}
	//*  15   30:iconst_0        
	//*  16   31:istore_3        
	//*  17   32:aload_1         
	//*  18   33:invokevirtual   #152 <Method char[] String.toCharArray()>
	//*  19   36:astore          9
	//*  20   38:aload           9
	//*  21   40:arraylength     
	//*  22   41:istore          4
	//*  23   43:iload_2         
	//*  24   44:iload           4
	//*  25   46:icmpge          148
	//*  26   49:aload           9
	//*  27   51:iload_2         
	//*  28   52:caload          
	//*  29   53:istore          5
	//*  30   55:aload_0         
	//*  31   56:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//*  32   59:iload           5
	//*  33   61:invokevirtual   #326 <Method int TrueTypeFontUnicode.getGlyphWidth(int)>
	//*  34   64:istore          6
	//*  35   66:iload_3         
	//*  36   67:iload           6
	//*  37   69:iadd            
	//*  38   70:istore_3        
	//*  39   71:aload_0         
	//*  40   72:getfield        #69  <Field TrueTypeFontUnicode ttu>
	//*  41   75:iload           5
	//*  42   77:invokevirtual   #329 <Method int TrueTypeFontUnicode.GetCharFromGlyphId(int)>
	//*  43   80:istore          7
	//*  44   82:iload           7
	//*  45   84:ifeq            98
	//*  46   87:aload           8
	//*  47   89:iload           7
	//*  48   91:invokestatic    #333 <Method String Utilities.convertFromUtf32(int)>
	//*  49   94:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//*  50   97:pop             
	//*  51   98:iload           5
	//*  52  100:invokestatic    #187 <Method Integer Integer.valueOf(int)>
	//*  53  103:astore          10
	//*  54  105:aload_0         
	//*  55  106:getfield        #65  <Field HashMap longTag>
	//*  56  109:aload           10
	//*  57  111:invokevirtual   #190 <Method boolean HashMap.containsKey(Object)>
	//*  58  114:ifne            193
	//*  59  117:aload_0         
	//*  60  118:getfield        #65  <Field HashMap longTag>
	//*  61  121:aload           10
	//*  62  123:iconst_3        
	//*  63  124:newarray        int[]
	//*  64  126:dup             
	//*  65  127:iconst_0        
	//*  66  128:iload           5
	//*  67  130:iastore         
	//*  68  131:dup             
	//*  69  132:iconst_1        
	//*  70  133:iload           6
	//*  71  135:iastore         
	//*  72  136:dup             
	//*  73  137:iconst_2        
	//*  74  138:iload           7
	//*  75  140:iastore         
	//*  76  141:invokevirtual   #205 <Method Object HashMap.put(Object, Object)>
	//*  77  144:pop             
	//*  78  145:goto            193
	//*  79  148:aload_1         
	//*  80  149:ldc1            #210 <String "UnicodeBigUnmarked">
	//*  81  151:invokevirtual   #213 <Method byte[] String.getBytes(String)>
	//*  82  154:astore_1        
	//*  83  155:aload           8
	//*  84  157:invokevirtual   #240 <Method String StringBuilder.toString()>
	//*  85  160:astore          8
	//*  86  162:iconst_3        
	//*  87  163:anewarray       Object[]
	//*  88  166:dup             
	//*  89  167:iconst_0        
	//*  90  168:aload_1         
	//*  91  169:aastore         
	//*  92  170:dup             
	//*  93  171:iconst_1        
	//*  94  172:aload           8
	//*  95  174:aastore         
	//*  96  175:dup             
	//*  97  176:iconst_2        
	//*  98  177:iload_3         
	//*  99  178:invokestatic    #187 <Method Integer Integer.valueOf(int)>
	//* 100  181:aastore         
	//* 101  182:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 102  183:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//  103  184:new             #302 <Class ExceptionConverter>
	//  104  187:dup             
	//  105  188:aload_1         
	//  106  189:invokespecial   #305 <Method void ExceptionConverter(Exception)>
	//  107  192:athrow          
		}
		j = 0;
		ac = s.toCharArray();
		k = ac.length;
_L2:
		if(i >= k)
			break MISSING_BLOCK_LABEL_148;
		c = ac[i];
		l = ttu.getGlyphWidth(((int) (c)));
		j += l;
		i1 = ttu.GetCharFromGlyphId(((int) (c)));
		if(i1 == 0)
			break MISSING_BLOCK_LABEL_98;
		((StringBuilder) (obj)).append(Utilities.convertFromUtf32(i1));
		integer = Integer.valueOf(((int) (c)));
		if(!longTag.containsKey(((Object) (integer))))
			longTag.put(((Object) (integer)), ((Object) (new int[] {
				c, l, i1
			})));
		break MISSING_BLOCK_LABEL_193;
		s = ((String) (s.getBytes("UnicodeBigUnmarked")));
		obj = ((Object) (((StringBuilder) (obj)).toString()));
		return (new Object[] {
			s, obj, Integer.valueOf(j)
		});
		i++;
	//  108  193:iload_2         
	//  109  194:iconst_1        
	//  110  195:iadd            
	//  111  196:istore_2        
		if(true) goto _L2; else goto _L1
	//  112  197:goto            43
_L1:
	}

	BaseFont getBaseFont()
	{
		return baseFont;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BaseFont baseFont>
	//    2    4:areturn         
	}

	PdfName getFontName()
	{
		return fontName;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field PdfName fontName>
	//    2    4:areturn         
	}

	PdfIndirectReference getIndirectReference()
	{
		return indirectReference;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field PdfIndirectReference indirectReference>
	//    2    4:areturn         
	}

	public boolean isSubset()
	{
		return subset;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean subset>
	//    2    4:ireturn         
	}

	public void setSubset(boolean flag)
	{
		subset = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean subset>
	//    3    5:return          
	}

	public void writeFont(PdfWriter pdfwriter)
	{
		fontType;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int fontType>
		JVM INSTR tableswitch 0 5: default 213
	//	               0 68
	//	               1 68
	//	               2 155
	//	               3 179
	//	               4 213
	//	               5 44;
	//    2    4:tableswitch     0 5: default 213
	//	               0 68
	//	               1 68
	//	               2 155
	//	               3 179
	//	               4 213
	//	               5 44
		   goto _L1 _L2 _L2 _L3 _L4 _L1 _L5
_L5:
		baseFont.writeFont(pdfwriter, indirectReference, ((Object []) (null)));
	//    3   44:aload_0         
	//    4   45:getfield        #41  <Field BaseFont baseFont>
	//    5   48:aload_1         
	//    6   49:aload_0         
	//    7   50:getfield        #39  <Field PdfIndirectReference indirectReference>
	//    8   53:aconst_null     
	//    9   54:invokevirtual   #347 <Method void BaseFont.writeFont(PdfWriter, PdfIndirectReference, Object[])>
		return;
	//   10   57:return          
	//*  11   58:astore_1        
	//*  12   59:new             #302 <Class ExceptionConverter>
	//*  13   62:dup             
	//*  14   63:aload_1         
	//*  15   64:invokespecial   #305 <Method void ExceptionConverter(Exception)>
	//*  16   67:athrow          
_L2:
		int i = 0;
	//   17   68:iconst_0        
	//   18   69:istore_2        
_L13:
		if(i >= 256) goto _L7; else goto _L6
	//   19   70:iload_2         
	//   20   71:sipush          256
	//   21   74:icmpge          214
_L6:
		if(shortTag[i] == 0) goto _L8; else goto _L7
	//   22   77:aload_0         
	//   23   78:getfield        #51  <Field byte[] shortTag>
	//   24   81:iload_2         
	//   25   82:baload          
	//   26   83:ifeq            243
	//*  27   86:goto            214
_L12:
		int j;
		if(j < i) goto _L10; else goto _L9
	//   28   89:iload_3         
	//   29   90:iload_2         
	//   30   91:icmplt          221
_L9:
		if(shortTag[j] == 0) goto _L11; else goto _L10
	//   31   94:aload_0         
	//   32   95:getfield        #51  <Field byte[] shortTag>
	//   33   98:iload_3         
	//   34   99:baload          
	//   35  100:ifeq            250
	//*  36  103:goto            221
	//*  37  106:aload_0         
	//*  38  107:getfield        #41  <Field BaseFont baseFont>
	//*  39  110:aload_1         
	//*  40  111:aload_0         
	//*  41  112:getfield        #39  <Field PdfIndirectReference indirectReference>
	//*  42  115:iconst_4        
	//*  43  116:anewarray       Object[]
	//*  44  119:dup             
	//*  45  120:iconst_0        
	//*  46  121:iload           4
	//*  47  123:invokestatic    #187 <Method Integer Integer.valueOf(int)>
	//*  48  126:aastore         
	//*  49  127:dup             
	//*  50  128:iconst_1        
	//*  51  129:iload_3         
	//*  52  130:invokestatic    #187 <Method Integer Integer.valueOf(int)>
	//*  53  133:aastore         
	//*  54  134:dup             
	//*  55  135:iconst_2        
	//*  56  136:aload_0         
	//*  57  137:getfield        #51  <Field byte[] shortTag>
	//*  58  140:aastore         
	//*  59  141:dup             
	//*  60  142:iconst_3        
	//*  61  143:aload_0         
	//*  62  144:getfield        #35  <Field boolean subset>
	//*  63  147:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//*  64  150:aastore         
	//*  65  151:invokevirtual   #347 <Method void BaseFont.writeFont(PdfWriter, PdfIndirectReference, Object[])>
	//*  66  154:return          
	//*  67  155:aload_0         
	//*  68  156:getfield        #41  <Field BaseFont baseFont>
	//*  69  159:aload_1         
	//*  70  160:aload_0         
	//*  71  161:getfield        #39  <Field PdfIndirectReference indirectReference>
	//*  72  164:iconst_1        
	//*  73  165:anewarray       Object[]
	//*  74  168:dup             
	//*  75  169:iconst_0        
	//*  76  170:aload_0         
	//*  77  171:getfield        #56  <Field IntHashtable cjkTag>
	//*  78  174:aastore         
	//*  79  175:invokevirtual   #347 <Method void BaseFont.writeFont(PdfWriter, PdfIndirectReference, Object[])>
	//*  80  178:return          
	//*  81  179:aload_0         
	//*  82  180:getfield        #41  <Field BaseFont baseFont>
	//*  83  183:aload_1         
	//*  84  184:aload_0         
	//*  85  185:getfield        #39  <Field PdfIndirectReference indirectReference>
	//*  86  188:iconst_2        
	//*  87  189:anewarray       Object[]
	//*  88  192:dup             
	//*  89  193:iconst_0        
	//*  90  194:aload_0         
	//*  91  195:getfield        #65  <Field HashMap longTag>
	//*  92  198:aastore         
	//*  93  199:dup             
	//*  94  200:iconst_1        
	//*  95  201:aload_0         
	//*  96  202:getfield        #35  <Field boolean subset>
	//*  97  205:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//*  98  208:aastore         
	//*  99  209:invokevirtual   #347 <Method void BaseFont.writeFont(PdfWriter, PdfIndirectReference, Object[])>
	//* 100  212:return          
	//* 101  213:return          
	//* 102  214:sipush          255
	//* 103  217:istore_3        
	//* 104  218:goto            89
_L10:
		k = i;
	//  105  221:iload_2         
	//  106  222:istore          4
		if(i > 255)
	//* 107  224:iload_2         
	//* 108  225:sipush          255
	//* 109  228:icmple          106
		{
			k = 255;
	//  110  231:sipush          255
	//  111  234:istore          4
			j = 255;
	//  112  236:sipush          255
	//  113  239:istore_3        
		}
		try
		{
			baseFont.writeFont(pdfwriter, indirectReference, new Object[] {
				Integer.valueOf(k), Integer.valueOf(j), shortTag, Boolean.valueOf(subset)
			});
			return;
		}
		// Misplaced declaration of an exception variable
		catch(PdfWriter pdfwriter)
		{
			throw new ExceptionConverter(((Exception) (pdfwriter)));
		}
_L3:
		baseFont.writeFont(pdfwriter, indirectReference, new Object[] {
			cjkTag
		});
		return;
_L4:
		baseFont.writeFont(pdfwriter, indirectReference, new Object[] {
			longTag, Boolean.valueOf(subset)
		});
		return;
_L1:
		return;
_L7:
		j = 255;
		  goto _L12
	//* 114  240:goto            106
_L8:
		i++;
	//  115  243:iload_2         
	//  116  244:iconst_1        
	//  117  245:iadd            
	//  118  246:istore_2        
		  goto _L13
	//* 119  247:goto            70
_L11:
		j--;
	//  120  250:iload_3         
	//  121  251:iconst_1        
	//  122  252:isub            
	//  123  253:istore_3        
		  goto _L12
	//* 124  254:goto            89
	}

	BaseFont baseFont;
	CJKFont cjkFont;
	IntHashtable cjkTag;
	PdfName fontName;
	int fontType;
	PdfIndirectReference indirectReference;
	HashMap longTag;
	byte shortTag[];
	protected boolean subset;
	boolean symbolic;
	TrueTypeFontUnicode ttu;
}
