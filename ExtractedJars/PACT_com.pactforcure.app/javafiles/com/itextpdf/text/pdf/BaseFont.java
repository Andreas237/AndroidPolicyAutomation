// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.InvalidPdfException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfReader, PdfObject, PdfDictionary, 
//			PRIndirectReference, IntHashtable, DocumentFont, CJKFont, 
//			Type1Font, TrueTypeFontUnicode, TrueTypeFont, EnumerateTTC, 
//			PdfEncodings, GlyphList, PdfStream, PdfWriter, 
//			PdfIndirectReference, PdfNumber

public abstract class BaseFont
{
	static class StreamFont extends PdfStream
	{

		public StreamFont(byte abyte0[], String s, int i)
			throws DocumentException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void PdfStream()>
			try
			{
				bytes = abyte0;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field byte[] bytes>
				put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
		//    5    9:aload_0         
		//    6   10:getstatic       #26  <Field PdfName PdfName.LENGTH>
		//    7   13:new             #28  <Class PdfNumber>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #20  <Field byte[] bytes>
		//   11   21:arraylength     
		//   12   22:invokespecial   #31  <Method void PdfNumber(int)>
		//   13   25:invokevirtual   #35  <Method void put(PdfName, PdfObject)>
			}
		//*  14   28:aload_2         
		//*  15   29:ifnull          47
		//*  16   32:aload_0         
		//*  17   33:getstatic       #38  <Field PdfName PdfName.SUBTYPE>
		//*  18   36:new             #22  <Class PdfName>
		//*  19   39:dup             
		//*  20   40:aload_2         
		//*  21   41:invokespecial   #41  <Method void PdfName(String)>
		//*  22   44:invokevirtual   #35  <Method void put(PdfName, PdfObject)>
		//*  23   47:aload_0         
		//*  24   48:iload_3         
		//*  25   49:invokevirtual   #44  <Method void flateCompress(int)>
		//*  26   52:return          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  27   53:astore_1        
			{
				throw new DocumentException(((Exception) (abyte0)));
		//   28   54:new             #11  <Class DocumentException>
		//   29   57:dup             
		//   30   58:aload_1         
		//   31   59:invokespecial   #47  <Method void DocumentException(Exception)>
		//   32   62:athrow          
			}
			if(s == null)
				break MISSING_BLOCK_LABEL_47;
			put(PdfName.SUBTYPE, ((PdfObject) (new PdfName(s))));
			flateCompress(i);
			return;
		}

		public StreamFont(byte abyte0[], int ai[], int i)
			throws DocumentException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void PdfStream()>
			int j;
			try
			{
				bytes = abyte0;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field byte[] bytes>
				put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
		//    5    9:aload_0         
		//    6   10:getstatic       #26  <Field PdfName PdfName.LENGTH>
		//    7   13:new             #28  <Class PdfNumber>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #20  <Field byte[] bytes>
		//   11   21:arraylength     
		//   12   22:invokespecial   #31  <Method void PdfNumber(int)>
		//   13   25:invokevirtual   #35  <Method void put(PdfName, PdfObject)>
			}
		//*  14   28:iconst_0        
		//*  15   29:istore          4
		//*  16   31:iload           4
		//*  17   33:aload_2         
		//*  18   34:arraylength     
		//*  19   35:icmpge          91
		//*  20   38:aload_0         
		//*  21   39:new             #22  <Class PdfName>
		//*  22   42:dup             
		//*  23   43:new             #52  <Class StringBuilder>
		//*  24   46:dup             
		//*  25   47:invokespecial   #53  <Method void StringBuilder()>
		//*  26   50:ldc1            #55  <String "Length">
		//*  27   52:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
		//*  28   55:iload           4
		//*  29   57:iconst_1        
		//*  30   58:iadd            
		//*  31   59:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
		//*  32   62:invokevirtual   #66  <Method String StringBuilder.toString()>
		//*  33   65:invokespecial   #41  <Method void PdfName(String)>
		//*  34   68:new             #28  <Class PdfNumber>
		//*  35   71:dup             
		//*  36   72:aload_2         
		//*  37   73:iload           4
		//*  38   75:iaload          
		//*  39   76:invokespecial   #31  <Method void PdfNumber(int)>
		//*  40   79:invokevirtual   #35  <Method void put(PdfName, PdfObject)>
		//*  41   82:iload           4
		//*  42   84:iconst_1        
		//*  43   85:iadd            
		//*  44   86:istore          4
		//*  45   88:goto            31
		//*  46   91:aload_0         
		//*  47   92:iload_3         
		//*  48   93:invokevirtual   #44  <Method void flateCompress(int)>
		//*  49   96:return          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  50   97:astore_1        
			{
				throw new DocumentException(((Exception) (abyte0)));
		//   51   98:new             #11  <Class DocumentException>
		//   52  101:dup             
		//   53  102:aload_1         
		//   54  103:invokespecial   #47  <Method void DocumentException(Exception)>
		//   55  106:athrow          
			}
			j = 0;
			if(j >= ai.length)
				break; /* Loop/switch isn't completed */
			put(new PdfName((new StringBuilder()).append("Length").append(j + 1).toString()), ((PdfObject) (new PdfNumber(ai[j]))));
			j++;
			if(true) goto _L2; else goto _L1
_L2:
			break MISSING_BLOCK_LABEL_31;
_L1:
			flateCompress(i);
			return;
		}
	}


	protected BaseFont()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #245 <Method void Object()>
		widths = new int[256];
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        int[]
	//    5   10:putfield        #247 <Field int[] widths>
		differences = new String[256];
	//    6   13:aload_0         
	//    7   14:sipush          256
	//    8   17:anewarray       String[]
	//    9   20:putfield        #251 <Field String[] differences>
		unicodeDifferences = new char[256];
	//   10   23:aload_0         
	//   11   24:sipush          256
	//   12   27:newarray        char[]
	//   13   29:putfield        #253 <Field char[] unicodeDifferences>
		charBBoxes = new int[256][];
	//   14   32:aload_0         
	//   15   33:sipush          256
	//   16   36:anewarray       int[][]
	//   17   39:putfield        #256 <Field int[][] charBBoxes>
		compressionLevel = -1;
	//   18   42:aload_0         
	//   19   43:iconst_m1       
	//   20   44:putfield        #258 <Field int compressionLevel>
		fontSpecific = true;
	//   21   47:aload_0         
	//   22   48:iconst_1        
	//   23   49:putfield        #260 <Field boolean fontSpecific>
		forceWidthsOutput = false;
	//   24   52:aload_0         
	//   25   53:iconst_0        
	//   26   54:putfield        #262 <Field boolean forceWidthsOutput>
		directTextToByte = false;
	//   27   57:aload_0         
	//   28   58:iconst_0        
	//   29   59:putfield        #264 <Field boolean directTextToByte>
		subset = true;
	//   30   62:aload_0         
	//   31   63:iconst_1        
	//   32   64:putfield        #266 <Field boolean subset>
		fastWinansi = false;
	//   33   67:aload_0         
	//   34   68:iconst_0        
	//   35   69:putfield        #268 <Field boolean fastWinansi>
		vertical = false;
	//   36   72:aload_0         
	//   37   73:iconst_0        
	//   38   74:putfield        #270 <Field boolean vertical>
	//   39   77:return          
	}

	private static void addFont(PRIndirectReference prindirectreference, IntHashtable inthashtable, ArrayList arraylist)
	{
		Object obj = ((Object) (PdfReader.getPdfObject(((PdfObject) (prindirectreference)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #278 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    2    4:astore_3        
		if(obj != null && ((PdfObject) (obj)).isDictionary())
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #284 <Method boolean PdfObject.isDictionary()>
	//*   7   13:ifne            17
	//*   8   16:return          
		{
			obj = ((Object) ((PdfDictionary)obj));
	//    9   17:aload_3         
	//   10   18:checkcast       #286 <Class PdfDictionary>
	//   11   21:astore_3        
			PdfName pdfname = ((PdfDictionary) (obj)).getAsName(PdfName.SUBTYPE);
	//   12   22:aload_3         
	//   13   23:getstatic       #289 <Field PdfName PdfName.SUBTYPE>
	//   14   26:invokevirtual   #293 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   15   29:astore          4
			if(PdfName.TYPE1.equals(((Object) (pdfname))) || PdfName.TRUETYPE.equals(((Object) (pdfname))) || PdfName.TYPE0.equals(((Object) (pdfname))))
	//*  16   31:getstatic       #296 <Field PdfName PdfName.TYPE1>
	//*  17   34:aload           4
	//*  18   36:invokevirtual   #300 <Method boolean PdfName.equals(Object)>
	//*  19   39:ifne            64
	//*  20   42:getstatic       #303 <Field PdfName PdfName.TRUETYPE>
	//*  21   45:aload           4
	//*  22   47:invokevirtual   #300 <Method boolean PdfName.equals(Object)>
	//*  23   50:ifne            64
	//*  24   53:getstatic       #306 <Field PdfName PdfName.TYPE0>
	//*  25   56:aload           4
	//*  26   58:invokevirtual   #300 <Method boolean PdfName.equals(Object)>
	//*  27   61:ifeq            16
			{
				arraylist.add(((Object) (new Object[] {
					PdfName.decodeName(((PdfDictionary) (obj)).getAsName(PdfName.BASEFONT).toString()), prindirectreference
				})));
	//   28   64:aload_2         
	//   29   65:iconst_2        
	//   30   66:anewarray       Object[]
	//   31   69:dup             
	//   32   70:iconst_0        
	//   33   71:aload_3         
	//   34   72:getstatic       #309 <Field PdfName PdfName.BASEFONT>
	//   35   75:invokevirtual   #293 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   36   78:invokevirtual   #313 <Method String PdfName.toString()>
	//   37   81:invokestatic    #317 <Method String PdfName.decodeName(String)>
	//   38   84:aastore         
	//   39   85:dup             
	//   40   86:iconst_1        
	//   41   87:aload_0         
	//   42   88:aastore         
	//   43   89:invokevirtual   #322 <Method boolean ArrayList.add(Object)>
	//   44   92:pop             
				inthashtable.put(prindirectreference.getNumber(), 1);
	//   45   93:aload_1         
	//   46   94:aload_0         
	//   47   95:invokevirtual   #328 <Method int PRIndirectReference.getNumber()>
	//   48   98:iconst_1        
	//   49   99:invokevirtual   #333 <Method int IntHashtable.put(int, int)>
	//   50  102:pop             
				return;
	//   51  103:return          
			}
		}
	}

	public static BaseFont createFont()
		throws DocumentException, IOException
	{
		return createFont("Helvetica", "Cp1252", false);
	//    0    0:ldc1            #81  <String "Helvetica">
	//    1    2:ldc1            #60  <String "Cp1252">
	//    2    4:iconst_0        
	//    3    5:invokestatic    #344 <Method BaseFont createFont(String, String, boolean)>
	//    4    8:areturn         
	}

	public static BaseFont createFont(PRIndirectReference prindirectreference)
	{
		return ((BaseFont) (new DocumentFont(prindirectreference)));
	//    0    0:new             #348 <Class DocumentFont>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #351 <Method void DocumentFont(PRIndirectReference)>
	//    4    8:areturn         
	}

	public static BaseFont createFont(String s, String s1, boolean flag)
		throws DocumentException, IOException
	{
		return createFont(s, s1, flag, true, ((byte []) (null)), ((byte []) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:iconst_0        
	//    7    7:invokestatic    #354 <Method BaseFont createFont(String, String, boolean, boolean, byte[], byte[], boolean)>
	//    8   10:areturn         
	}

	public static BaseFont createFont(String s, String s1, boolean flag, boolean flag1)
		throws DocumentException, IOException
	{
		return createFont(s, s1, flag, true, ((byte []) (null)), ((byte []) (null)), flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:iload_3         
	//    7    7:invokestatic    #354 <Method BaseFont createFont(String, String, boolean, boolean, byte[], byte[], boolean)>
	//    8   10:areturn         
	}

	public static BaseFont createFont(String s, String s1, boolean flag, boolean flag1, byte abyte0[], byte abyte1[])
		throws DocumentException, IOException
	{
		return createFont(s, s1, flag, flag1, abyte0, abyte1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iconst_0        
	//    7    9:invokestatic    #354 <Method BaseFont createFont(String, String, boolean, boolean, byte[], byte[], boolean)>
	//    8   12:areturn         
	}

	public static BaseFont createFont(String s, String s1, boolean flag, boolean flag1, byte abyte0[], byte abyte1[], boolean flag2)
		throws DocumentException, IOException
	{
		return createFont(s, s1, flag, flag1, abyte0, abyte1, flag2, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:iconst_0        
	//    8   11:invokestatic    #359 <Method BaseFont createFont(String, String, boolean, boolean, byte[], byte[], boolean, boolean)>
	//    9   14:areturn         
	}

	public static BaseFont createFont(String s, String s1, boolean flag, boolean flag1, byte abyte0[], byte abyte1[], boolean flag2, boolean flag3)
		throws DocumentException, IOException
	{
		boolean flag4;
		boolean flag5;
		String s2;
		String s3;
		s3 = getBaseName(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #362 <Method String getBaseName(String)>
	//    2    4:astore          11
		s2 = normalizeEncoding(s1);
	//    3    6:aload_1         
	//    4    7:invokestatic    #365 <Method String normalizeEncoding(String)>
	//    5   10:astore          10
		flag5 = BuiltinFonts14.containsKey(((Object) (s)));
	//    6   12:getstatic       #208 <Field HashMap BuiltinFonts14>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #368 <Method boolean HashMap.containsKey(Object)>
	//    9   19:istore          9
		BaseFont basefont;
		if(flag5)
	//*  10   21:iload           9
	//*  11   23:ifeq            101
			flag4 = false;
	//   12   26:iconst_0        
	//   13   27:istore          8
		else
	//*  14   29:iload           9
	//*  15   31:ifne            39
	//*  16   34:iload           8
	//*  17   36:ifeq            113
	//*  18   39:iconst_0        
	//*  19   40:istore_2        
	//*  20   41:new             #370 <Class StringBuilder>
	//*  21   44:dup             
	//*  22   45:invokespecial   #371 <Method void StringBuilder()>
	//*  23   48:aload_0         
	//*  24   49:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//*  25   52:ldc2            #377 <String "\n">
	//*  26   55:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//*  27   58:aload           10
	//*  28   60:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//*  29   63:ldc2            #377 <String "\n">
	//*  30   66:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//*  31   69:iload_2         
	//*  32   70:invokevirtual   #380 <Method StringBuilder StringBuilder.append(boolean)>
	//*  33   73:invokevirtual   #381 <Method String StringBuilder.toString()>
	//*  34   76:astore_1        
	//*  35   77:iload_3         
	//*  36   78:ifeq            138
	//*  37   81:getstatic       #203 <Field ConcurrentHashMap fontCache>
	//*  38   84:aload_1         
	//*  39   85:invokevirtual   #385 <Method Object ConcurrentHashMap.get(Object)>
	//*  40   88:checkcast       #2   <Class BaseFont>
	//*  41   91:astore          12
	//*  42   93:aload           12
	//*  43   95:ifnull          138
	//*  44   98:aload           12
	//*  45  100:areturn         
			flag4 = CJKFont.isCJKFont(s3, s2);
	//   46  101:aload           11
	//   47  103:aload           10
	//   48  105:invokestatic    #391 <Method boolean CJKFont.isCJKFont(String, String)>
	//   49  108:istore          8
		if(!flag5 && !flag4) goto _L2; else goto _L1
_L1:
		flag = false;
_L4:
		s1 = (new StringBuilder()).append(s).append("\n").append(s2).append("\n").append(flag).toString();
		if(flag1)
		{
			basefont = (BaseFont)fontCache.get(((Object) (s1)));
			if(basefont != null)
				return basefont;
		}
		break; /* Loop/switch isn't completed */
	//*  50  110:goto            29
_L2:
		if(s2.equals("Identity-H") || s2.equals("Identity-V"))
	//*  51  113:aload           10
	//*  52  115:ldc1            #93  <String "Identity-H">
	//*  53  117:invokevirtual   #392 <Method boolean String.equals(Object)>
	//*  54  120:ifne            133
	//*  55  123:aload           10
	//*  56  125:ldc1            #96  <String "Identity-V">
	//*  57  127:invokevirtual   #392 <Method boolean String.equals(Object)>
	//*  58  130:ifeq            41
			flag = true;
	//   59  133:iconst_1        
	//   60  134:istore_2        
		if(true) goto _L4; else goto _L3
	//   61  135:goto            41
_L3:
		if(flag5 || s.toLowerCase().endsWith(".afm") || s.toLowerCase().endsWith(".pfm"))
	//*  62  138:iload           9
	//*  63  140:ifne            169
	//*  64  143:aload_0         
	//*  65  144:invokevirtual   #395 <Method String String.toLowerCase()>
	//*  66  147:ldc2            #397 <String ".afm">
	//*  67  150:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*  68  153:ifne            169
	//*  69  156:aload_0         
	//*  70  157:invokevirtual   #395 <Method String String.toLowerCase()>
	//*  71  160:ldc2            #403 <String ".pfm">
	//*  72  163:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*  73  166:ifeq            222
		{
			s = ((String) (new Type1Font(s, s2, flag, abyte0, abyte1, flag3)));
	//   74  169:new             #405 <Class Type1Font>
	//   75  172:dup             
	//   76  173:aload_0         
	//   77  174:aload           10
	//   78  176:iload_2         
	//   79  177:aload           4
	//   80  179:aload           5
	//   81  181:iload           7
	//   82  183:invokespecial   #408 <Method void Type1Font(String, String, boolean, byte[], byte[], boolean)>
	//   83  186:astore_0        
			s.fastWinansi = s2.equals("Cp1252");
	//   84  187:aload_0         
	//   85  188:aload           10
	//   86  190:ldc1            #60  <String "Cp1252">
	//   87  192:invokevirtual   #392 <Method boolean String.equals(Object)>
	//   88  195:putfield        #268 <Field boolean fastWinansi>
		} else
	//*  89  198:iload_3         
	//*  90  199:ifeq            397
	//*  91  202:getstatic       #203 <Field ConcurrentHashMap fontCache>
	//*  92  205:aload_1         
	//*  93  206:invokevirtual   #385 <Method Object ConcurrentHashMap.get(Object)>
	//*  94  209:checkcast       #2   <Class BaseFont>
	//*  95  212:astore          4
	//*  96  214:aload           4
	//*  97  216:ifnull          388
	//*  98  219:aload           4
	//*  99  221:areturn         
		if(s3.toLowerCase().endsWith(".ttf") || s3.toLowerCase().endsWith(".otf") || s3.toLowerCase().indexOf(".ttc,") > 0)
	//* 100  222:aload           11
	//* 101  224:invokevirtual   #395 <Method String String.toLowerCase()>
	//* 102  227:ldc2            #410 <String ".ttf">
	//* 103  230:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//* 104  233:ifne            264
	//* 105  236:aload           11
	//* 106  238:invokevirtual   #395 <Method String String.toLowerCase()>
	//* 107  241:ldc2            #412 <String ".otf">
	//* 108  244:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//* 109  247:ifne            264
	//* 110  250:aload           11
	//* 111  252:invokevirtual   #395 <Method String String.toLowerCase()>
	//* 112  255:ldc2            #414 <String ".ttc,">
	//* 113  258:invokevirtual   #418 <Method int String.indexOf(String)>
	//* 114  261:ifle            334
		{
			if(s2.equals("Identity-H") || s2.equals("Identity-V"))
	//* 115  264:aload           10
	//* 116  266:ldc1            #93  <String "Identity-H">
	//* 117  268:invokevirtual   #392 <Method boolean String.equals(Object)>
	//* 118  271:ifne            284
	//* 119  274:aload           10
	//* 120  276:ldc1            #96  <String "Identity-V">
	//* 121  278:invokevirtual   #392 <Method boolean String.equals(Object)>
	//* 122  281:ifeq            303
			{
				s = ((String) (new TrueTypeFontUnicode(s, s2, flag, abyte0, flag3)));
	//  123  284:new             #420 <Class TrueTypeFontUnicode>
	//  124  287:dup             
	//  125  288:aload_0         
	//  126  289:aload           10
	//  127  291:iload_2         
	//  128  292:aload           4
	//  129  294:iload           7
	//  130  296:invokespecial   #423 <Method void TrueTypeFontUnicode(String, String, boolean, byte[], boolean)>
	//  131  299:astore_0        
			} else
	//* 132  300:goto            198
			{
				s = ((String) (new TrueTypeFont(s, s2, flag, abyte0, false, flag3)));
	//  133  303:new             #425 <Class TrueTypeFont>
	//  134  306:dup             
	//  135  307:aload_0         
	//  136  308:aload           10
	//  137  310:iload_2         
	//  138  311:aload           4
	//  139  313:iconst_0        
	//  140  314:iload           7
	//  141  316:invokespecial   #428 <Method void TrueTypeFont(String, String, boolean, byte[], boolean, boolean)>
	//  142  319:astore_0        
				s.fastWinansi = s2.equals("Cp1252");
	//  143  320:aload_0         
	//  144  321:aload           10
	//  145  323:ldc1            #60  <String "Cp1252">
	//  146  325:invokevirtual   #392 <Method boolean String.equals(Object)>
	//  147  328:putfield        #268 <Field boolean fastWinansi>
			}
		} else
	//* 148  331:goto            198
		if(flag4)
	//* 149  334:iload           8
	//* 150  336:ifeq            354
			s = ((String) (new CJKFont(s, s2, flag)));
	//  151  339:new             #387 <Class CJKFont>
	//  152  342:dup             
	//  153  343:aload_0         
	//  154  344:aload           10
	//  155  346:iload_2         
	//  156  347:invokespecial   #431 <Method void CJKFont(String, String, boolean)>
	//  157  350:astore_0        
		else
	//* 158  351:goto            198
		if(flag2)
	//* 159  354:iload           6
	//* 160  356:ifeq            361
			return null;
	//  161  359:aconst_null     
	//  162  360:areturn         
		else
			throw new DocumentException(MessageLocalization.getComposedMessage("font.1.with.2.is.not.recognized", new Object[] {
				s, s2
			}));
	//  163  361:new             #339 <Class DocumentException>
	//  164  364:dup             
	//  165  365:ldc2            #433 <String "font.1.with.2.is.not.recognized">
	//  166  368:iconst_2        
	//  167  369:anewarray       Object[]
	//  168  372:dup             
	//  169  373:iconst_0        
	//  170  374:aload_0         
	//  171  375:aastore         
	//  172  376:dup             
	//  173  377:iconst_1        
	//  174  378:aload           10
	//  175  380:aastore         
	//  176  381:invokestatic    #439 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  177  384:invokespecial   #442 <Method void DocumentException(String)>
	//  178  387:athrow          
		if(flag1)
		{
			abyte0 = ((byte []) ((BaseFont)fontCache.get(((Object) (s1)))));
			if(abyte0 != null)
				return ((BaseFont) (abyte0));
			fontCache.putIfAbsent(((Object) (s1)), ((Object) (s)));
	//  179  388:getstatic       #203 <Field ConcurrentHashMap fontCache>
	//  180  391:aload_1         
	//  181  392:aload_0         
	//  182  393:invokevirtual   #445 <Method Object ConcurrentHashMap.putIfAbsent(Object, Object)>
	//  183  396:pop             
		}
		return ((BaseFont) (s));
	//  184  397:aload_0         
	//  185  398:areturn         
	}

	public static String createSubsetPrefix()
	{
		StringBuilder stringbuilder = new StringBuilder("");
	//    0    0:new             #370 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #448 <String "">
	//    3    7:invokespecial   #449 <Method void StringBuilder(String)>
	//    4   10:astore_1        
		for(int i = 0; i < 6; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_0        
	//*   7   13:iload_0         
	//*   8   14:bipush          6
	//*   9   16:icmpge          44
			stringbuilder.append((char)(int)(Math.random() * 26D + 65D));
	//   10   19:aload_1         
	//   11   20:invokestatic    #455 <Method double Math.random()>
	//   12   23:ldc2w           #456 <Double 26D>
	//   13   26:dmul            
	//   14   27:ldc2w           #458 <Double 65D>
	//   15   30:dadd            
	//   16   31:d2i             
	//   17   32:int2char        
	//   18   33:invokevirtual   #462 <Method StringBuilder StringBuilder.append(char)>
	//   19   36:pop             

	//   20   37:iload_0         
	//   21   38:iconst_1        
	//   22   39:iadd            
	//   23   40:istore_0        
	//*  24   41:goto            13
		return (new StringBuilder()).append(((Object) (stringbuilder))).append("+").toString();
	//   25   44:new             #370 <Class StringBuilder>
	//   26   47:dup             
	//   27   48:invokespecial   #371 <Method void StringBuilder()>
	//   28   51:aload_1         
	//   29   52:invokevirtual   #465 <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:ldc2            #467 <String "+">
	//   31   58:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:invokevirtual   #381 <Method String StringBuilder.toString()>
	//   33   64:areturn         
	}

	public static String[] enumerateTTCNames(String s)
		throws DocumentException, IOException
	{
		return (new EnumerateTTC(s)).getNames();
	//    0    0:new             #471 <Class EnumerateTTC>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #472 <Method void EnumerateTTC(String)>
	//    4    8:invokevirtual   #476 <Method String[] EnumerateTTC.getNames()>
	//    5   11:areturn         
	}

	public static String[] enumerateTTCNames(byte abyte0[])
		throws DocumentException, IOException
	{
		return (new EnumerateTTC(abyte0)).getNames();
	//    0    0:new             #471 <Class EnumerateTTC>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #480 <Method void EnumerateTTC(byte[])>
	//    4    8:invokevirtual   #476 <Method String[] EnumerateTTC.getNames()>
	//    5   11:areturn         
	}

	public static Object[] getAllFontNames(String s, String s1, byte abyte0[])
		throws DocumentException, IOException
	{
		String s2 = getBaseName(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #362 <Method String getBaseName(String)>
	//    2    4:astore_3        
		if(s2.toLowerCase().endsWith(".ttf") || s2.toLowerCase().endsWith(".otf") || s2.toLowerCase().indexOf(".ttc,") > 0)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #395 <Method String String.toLowerCase()>
	//*   5    9:ldc2            #410 <String ".ttf">
	//*   6   12:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*   7   15:ifne            44
	//*   8   18:aload_3         
	//*   9   19:invokevirtual   #395 <Method String String.toLowerCase()>
	//*  10   22:ldc2            #412 <String ".otf">
	//*  11   25:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*  12   28:ifne            44
	//*  13   31:aload_3         
	//*  14   32:invokevirtual   #395 <Method String String.toLowerCase()>
	//*  15   35:ldc2            #414 <String ".ttc,">
	//*  16   38:invokevirtual   #418 <Method int String.indexOf(String)>
	//*  17   41:ifle            85
			s = ((String) (new TrueTypeFont(s, "Cp1252", false, abyte0, true, false)));
	//   18   44:new             #425 <Class TrueTypeFont>
	//   19   47:dup             
	//   20   48:aload_0         
	//   21   49:ldc1            #60  <String "Cp1252">
	//   22   51:iconst_0        
	//   23   52:aload_2         
	//   24   53:iconst_1        
	//   25   54:iconst_0        
	//   26   55:invokespecial   #428 <Method void TrueTypeFont(String, String, boolean, byte[], boolean, boolean)>
	//   27   58:astore_0        
		else
	//*  28   59:iconst_3        
	//*  29   60:anewarray       Object[]
	//*  30   63:dup             
	//*  31   64:iconst_0        
	//*  32   65:aload_0         
	//*  33   66:invokevirtual   #485 <Method String getPostscriptFontName()>
	//*  34   69:aastore         
	//*  35   70:dup             
	//*  36   71:iconst_1        
	//*  37   72:aload_0         
	//*  38   73:invokevirtual   #489 <Method String[][] getFamilyFontName()>
	//*  39   76:aastore         
	//*  40   77:dup             
	//*  41   78:iconst_2        
	//*  42   79:aload_0         
	//*  43   80:invokevirtual   #492 <Method String[][] getFullFontName()>
	//*  44   83:aastore         
	//*  45   84:areturn         
			s = ((String) (createFont(s, s1, false, false, abyte0, ((byte []) (null)))));
	//   46   85:aload_0         
	//   47   86:aload_1         
	//   48   87:iconst_0        
	//   49   88:iconst_0        
	//   50   89:aload_2         
	//   51   90:aconst_null     
	//   52   91:invokestatic    #494 <Method BaseFont createFont(String, String, boolean, boolean, byte[], byte[])>
	//   53   94:astore_0        
		return (new Object[] {
			((BaseFont) (s)).getPostscriptFontName(), ((BaseFont) (s)).getFamilyFontName(), ((BaseFont) (s)).getFullFontName()
		});
	//*  54   95:goto            59
	}

	public static String[][] getAllNameEntries(String s, String s1, byte abyte0[])
		throws DocumentException, IOException
	{
		String s2 = getBaseName(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #362 <Method String getBaseName(String)>
	//    2    4:astore_3        
		if(s2.toLowerCase().endsWith(".ttf") || s2.toLowerCase().endsWith(".otf") || s2.toLowerCase().indexOf(".ttc,") > 0)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #395 <Method String String.toLowerCase()>
	//*   5    9:ldc2            #410 <String ".ttf">
	//*   6   12:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*   7   15:ifne            44
	//*   8   18:aload_3         
	//*   9   19:invokevirtual   #395 <Method String String.toLowerCase()>
	//*  10   22:ldc2            #412 <String ".otf">
	//*  11   25:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*  12   28:ifne            44
	//*  13   31:aload_3         
	//*  14   32:invokevirtual   #395 <Method String String.toLowerCase()>
	//*  15   35:ldc2            #414 <String ".ttc,">
	//*  16   38:invokevirtual   #418 <Method int String.indexOf(String)>
	//*  17   41:ifle            64
			s = ((String) (new TrueTypeFont(s, "Cp1252", false, abyte0, true, false)));
	//   18   44:new             #425 <Class TrueTypeFont>
	//   19   47:dup             
	//   20   48:aload_0         
	//   21   49:ldc1            #60  <String "Cp1252">
	//   22   51:iconst_0        
	//   23   52:aload_2         
	//   24   53:iconst_1        
	//   25   54:iconst_0        
	//   26   55:invokespecial   #428 <Method void TrueTypeFont(String, String, boolean, byte[], boolean, boolean)>
	//   27   58:astore_0        
		else
	//*  28   59:aload_0         
	//*  29   60:invokevirtual   #498 <Method String[][] getAllNameEntries()>
	//*  30   63:areturn         
			s = ((String) (createFont(s, s1, false, false, abyte0, ((byte []) (null)))));
	//   31   64:aload_0         
	//   32   65:aload_1         
	//   33   66:iconst_0        
	//   34   67:iconst_0        
	//   35   68:aload_2         
	//   36   69:aconst_null     
	//   37   70:invokestatic    #494 <Method BaseFont createFont(String, String, boolean, boolean, byte[], byte[])>
	//   38   73:astore_0        
		return ((BaseFont) (s)).getAllNameEntries();
	//*  39   74:goto            59
	}

	protected static String getBaseName(String s)
	{
		String s1;
		if(s.endsWith(",Bold"))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #500 <String ",Bold">
	//*   2    4:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*   3    7:ifeq            24
		{
			s1 = s.substring(0, s.length() - 5);
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:invokevirtual   #503 <Method int String.length()>
	//    8   16:iconst_5        
	//    9   17:isub            
	//   10   18:invokevirtual   #507 <Method String String.substring(int, int)>
	//   11   21:astore_1        
		} else
	//*  12   22:aload_1         
	//*  13   23:areturn         
		{
			if(s.endsWith(",Italic"))
	//*  14   24:aload_0         
	//*  15   25:ldc2            #509 <String ",Italic">
	//*  16   28:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*  17   31:ifeq            47
				return s.substring(0, s.length() - 7);
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:aload_0         
	//   21   37:invokevirtual   #503 <Method int String.length()>
	//   22   40:bipush          7
	//   23   42:isub            
	//   24   43:invokevirtual   #507 <Method String String.substring(int, int)>
	//   25   46:areturn         
			s1 = s;
	//   26   47:aload_0         
	//   27   48:astore_1        
			if(s.endsWith(",BoldItalic"))
	//*  28   49:aload_0         
	//*  29   50:ldc2            #511 <String ",BoldItalic">
	//*  30   53:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*  31   56:ifeq            22
				return s.substring(0, s.length() - 11);
	//   32   59:aload_0         
	//   33   60:iconst_0        
	//   34   61:aload_0         
	//   35   62:invokevirtual   #503 <Method int String.length()>
	//   36   65:bipush          11
	//   37   67:isub            
	//   38   68:invokevirtual   #507 <Method String String.substring(int, int)>
	//   39   71:areturn         
		}
		return s1;
	}

	public static ArrayList getDocumentFonts(PdfReader pdfreader)
	{
		IntHashtable inthashtable = new IntHashtable();
	//    0    0:new             #330 <Class IntHashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #514 <Method void IntHashtable()>
	//    3    7:astore_3        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #319 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #515 <Method void ArrayList()>
	//    7   15:astore          4
		int j = pdfreader.getNumberOfPages();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #518 <Method int PdfReader.getNumberOfPages()>
	//   10   21:istore_2        
		for(int i = 1; i <= j; i++)
	//*  11   22:iconst_1        
	//*  12   23:istore_1        
	//*  13   24:iload_1         
	//*  14   25:iload_2         
	//*  15   26:icmpgt          55
			recourseFonts(pdfreader.getPageN(i), inthashtable, arraylist, 1, new HashSet());
	//   16   29:aload_0         
	//   17   30:iload_1         
	//   18   31:invokevirtual   #522 <Method PdfDictionary PdfReader.getPageN(int)>
	//   19   34:aload_3         
	//   20   35:aload           4
	//   21   37:iconst_1        
	//   22   38:new             #524 <Class HashSet>
	//   23   41:dup             
	//   24   42:invokespecial   #525 <Method void HashSet()>
	//   25   45:invokestatic    #529 <Method void recourseFonts(PdfDictionary, IntHashtable, ArrayList, int, HashSet)>

	//   26   48:iload_1         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore_1        
	//*  30   52:goto            24
		return arraylist;
	//   31   55:aload           4
	//   32   57:areturn         
	}

	public static ArrayList getDocumentFonts(PdfReader pdfreader, int i)
	{
		IntHashtable inthashtable = new IntHashtable();
	//    0    0:new             #330 <Class IntHashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #514 <Method void IntHashtable()>
	//    3    7:astore_2        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #319 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #515 <Method void ArrayList()>
	//    7   15:astore_3        
		recourseFonts(pdfreader.getPageN(i), inthashtable, arraylist, 1, new HashSet());
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokevirtual   #522 <Method PdfDictionary PdfReader.getPageN(int)>
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:iconst_1        
	//   14   24:new             #524 <Class HashSet>
	//   15   27:dup             
	//   16   28:invokespecial   #525 <Method void HashSet()>
	//   17   31:invokestatic    #529 <Method void recourseFonts(PdfDictionary, IntHashtable, ArrayList, int, HashSet)>
		return arraylist;
	//   18   34:aload_3         
	//   19   35:areturn         
	}

	public static String[][] getFullFontName(String s, String s1, byte abyte0[])
		throws DocumentException, IOException
	{
		String s2 = getBaseName(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #362 <Method String getBaseName(String)>
	//    2    4:astore_3        
		if(s2.toLowerCase().endsWith(".ttf") || s2.toLowerCase().endsWith(".otf") || s2.toLowerCase().indexOf(".ttc,") > 0)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #395 <Method String String.toLowerCase()>
	//*   5    9:ldc2            #410 <String ".ttf">
	//*   6   12:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*   7   15:ifne            44
	//*   8   18:aload_3         
	//*   9   19:invokevirtual   #395 <Method String String.toLowerCase()>
	//*  10   22:ldc2            #412 <String ".otf">
	//*  11   25:invokevirtual   #401 <Method boolean String.endsWith(String)>
	//*  12   28:ifne            44
	//*  13   31:aload_3         
	//*  14   32:invokevirtual   #395 <Method String String.toLowerCase()>
	//*  15   35:ldc2            #414 <String ".ttc,">
	//*  16   38:invokevirtual   #418 <Method int String.indexOf(String)>
	//*  17   41:ifle            64
			s = ((String) (new TrueTypeFont(s, "Cp1252", false, abyte0, true, false)));
	//   18   44:new             #425 <Class TrueTypeFont>
	//   19   47:dup             
	//   20   48:aload_0         
	//   21   49:ldc1            #60  <String "Cp1252">
	//   22   51:iconst_0        
	//   23   52:aload_2         
	//   24   53:iconst_1        
	//   25   54:iconst_0        
	//   26   55:invokespecial   #428 <Method void TrueTypeFont(String, String, boolean, byte[], boolean, boolean)>
	//   27   58:astore_0        
		else
	//*  28   59:aload_0         
	//*  29   60:invokevirtual   #492 <Method String[][] getFullFontName()>
	//*  30   63:areturn         
			s = ((String) (createFont(s, s1, false, false, abyte0, ((byte []) (null)))));
	//   31   64:aload_0         
	//   32   65:aload_1         
	//   33   66:iconst_0        
	//   34   67:iconst_0        
	//   35   68:aload_2         
	//   36   69:aconst_null     
	//   37   70:invokestatic    #494 <Method BaseFont createFont(String, String, boolean, boolean, byte[], byte[])>
	//   38   73:astore_0        
		return ((BaseFont) (s)).getFullFontName();
	//*  39   74:goto            59
	}

	protected static String normalizeEncoding(String s)
	{
		String s1;
		if(s.equals("winansi") || s.equals(""))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #534 <String "winansi">
	//*   2    4:invokevirtual   #392 <Method boolean String.equals(Object)>
	//*   3    7:ifne            20
	//*   4   10:aload_0         
	//*   5   11:ldc2            #448 <String "">
	//*   6   14:invokevirtual   #392 <Method boolean String.equals(Object)>
	//*   7   17:ifeq            25
		{
			s1 = "Cp1252";
	//    8   20:ldc1            #60  <String "Cp1252">
	//    9   22:astore_1        
		} else
	//*  10   23:aload_1         
	//*  11   24:areturn         
		{
			s1 = s;
	//   12   25:aload_0         
	//   13   26:astore_1        
			if(s.equals("macroman"))
	//*  14   27:aload_0         
	//*  15   28:ldc2            #536 <String "macroman">
	//*  16   31:invokevirtual   #392 <Method boolean String.equals(Object)>
	//*  17   34:ifeq            23
				return "MacRoman";
	//   18   37:ldc1            #100 <String "MacRoman">
	//   19   39:areturn         
		}
		return s1;
	}

	private static void recourseFonts(PdfDictionary pdfdictionary, IntHashtable inthashtable, ArrayList arraylist, int i, HashSet hashset)
	{
		i++;
	//    0    0:iload_3         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore_3        
		break MISSING_BLOCK_LABEL_4;
		if(i <= 50 && pdfdictionary != null)
	//*   4    4:iload_3         
	//*   5    5:bipush          50
	//*   6    7:icmple          11
	//*   7   10:return          
	//*   8   11:aload_0         
	//*   9   12:ifnull          10
		{
			pdfdictionary = pdfdictionary.getAsDict(PdfName.RESOURCES);
	//   10   15:aload_0         
	//   11   16:getstatic       #539 <Field PdfName PdfName.RESOURCES>
	//   12   19:invokevirtual   #543 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   13   22:astore_0        
			if(pdfdictionary != null)
	//*  14   23:aload_0         
	//*  15   24:ifnull          10
			{
				PdfDictionary pdfdictionary1 = pdfdictionary.getAsDict(PdfName.FONT);
	//   16   27:aload_0         
	//   17   28:getstatic       #546 <Field PdfName PdfName.FONT>
	//   18   31:invokevirtual   #543 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   19   34:astore          5
				if(pdfdictionary1 != null)
	//*  20   36:aload           5
	//*  21   38:ifnull          121
				{
					Iterator iterator1 = pdfdictionary1.getKeys().iterator();
	//   22   41:aload           5
	//   23   43:invokevirtual   #550 <Method Set PdfDictionary.getKeys()>
	//   24   46:invokeinterface #556 <Method Iterator Set.iterator()>
	//   25   51:astore          6
					do
					{
						if(!iterator1.hasNext())
							break;
	//   26   53:aload           6
	//   27   55:invokeinterface #561 <Method boolean Iterator.hasNext()>
	//   28   60:ifeq            121
						PdfObject pdfobject1 = pdfdictionary1.get((PdfName)iterator1.next());
	//   29   63:aload           5
	//   30   65:aload           6
	//   31   67:invokeinterface #565 <Method Object Iterator.next()>
	//   32   72:checkcast       #210 <Class PdfName>
	//   33   75:invokevirtual   #568 <Method PdfObject PdfDictionary.get(PdfName)>
	//   34   78:astore          7
						if(pdfobject1 != null && pdfobject1.isIndirect() && !inthashtable.containsKey(((PRIndirectReference)pdfobject1).getNumber()))
	//*  35   80:aload           7
	//*  36   82:ifnull          53
	//*  37   85:aload           7
	//*  38   87:invokevirtual   #571 <Method boolean PdfObject.isIndirect()>
	//*  39   90:ifeq            53
	//*  40   93:aload_1         
	//*  41   94:aload           7
	//*  42   96:checkcast       #324 <Class PRIndirectReference>
	//*  43   99:invokevirtual   #328 <Method int PRIndirectReference.getNumber()>
	//*  44  102:invokevirtual   #574 <Method boolean IntHashtable.containsKey(int)>
	//*  45  105:ifne            53
							addFont((PRIndirectReference)pdfobject1, inthashtable, arraylist);
	//   46  108:aload           7
	//   47  110:checkcast       #324 <Class PRIndirectReference>
	//   48  113:aload_1         
	//   49  114:aload_2         
	//   50  115:invokestatic    #576 <Method void addFont(PRIndirectReference, IntHashtable, ArrayList)>
					} while(true);
	//   51  118:goto            53
				}
				pdfdictionary = pdfdictionary.getAsDict(PdfName.XOBJECT);
	//   52  121:aload_0         
	//   53  122:getstatic       #579 <Field PdfName PdfName.XOBJECT>
	//   54  125:invokevirtual   #543 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   55  128:astore_0        
				if(pdfdictionary != null)
	//*  56  129:aload_0         
	//*  57  130:ifnull          10
					if(hashset.add(((Object) (pdfdictionary))))
	//*  58  133:aload           4
	//*  59  135:aload_0         
	//*  60  136:invokevirtual   #580 <Method boolean HashSet.add(Object)>
	//*  61  139:ifeq            211
					{
						Iterator iterator = pdfdictionary.getKeys().iterator();
	//   62  142:aload_0         
	//   63  143:invokevirtual   #550 <Method Set PdfDictionary.getKeys()>
	//   64  146:invokeinterface #556 <Method Iterator Set.iterator()>
	//   65  151:astore          5
						do
						{
							if(!iterator.hasNext())
								break;
	//   66  153:aload           5
	//   67  155:invokeinterface #561 <Method boolean Iterator.hasNext()>
	//   68  160:ifeq            203
							PdfObject pdfobject = pdfdictionary.getDirectObject((PdfName)iterator.next());
	//   69  163:aload_0         
	//   70  164:aload           5
	//   71  166:invokeinterface #565 <Method Object Iterator.next()>
	//   72  171:checkcast       #210 <Class PdfName>
	//   73  174:invokevirtual   #583 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   74  177:astore          6
							if(pdfobject instanceof PdfDictionary)
	//*  75  179:aload           6
	//*  76  181:instanceof      #286 <Class PdfDictionary>
	//*  77  184:ifeq            153
								recourseFonts((PdfDictionary)pdfobject, inthashtable, arraylist, i, hashset);
	//   78  187:aload           6
	//   79  189:checkcast       #286 <Class PdfDictionary>
	//   80  192:aload_1         
	//   81  193:aload_2         
	//   82  194:iload_3         
	//   83  195:aload           4
	//   84  197:invokestatic    #529 <Method void recourseFonts(PdfDictionary, IntHashtable, ArrayList, int, HashSet)>
						} while(true);
	//   85  200:goto            153
						hashset.remove(((Object) (pdfdictionary)));
	//   86  203:aload           4
	//   87  205:aload_0         
	//   88  206:invokevirtual   #586 <Method boolean HashSet.remove(Object)>
	//   89  209:pop             
						return;
	//   90  210:return          
					} else
					{
						throw new ExceptionConverter(((Exception) (new InvalidPdfException(MessageLocalization.getComposedMessage("illegal.resources.tree", new Object[0])))));
	//   91  211:new             #588 <Class ExceptionConverter>
	//   92  214:dup             
	//   93  215:new             #590 <Class InvalidPdfException>
	//   94  218:dup             
	//   95  219:ldc2            #592 <String "illegal.resources.tree">
	//   96  222:iconst_0        
	//   97  223:anewarray       Object[]
	//   98  226:invokestatic    #439 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   99  229:invokespecial   #593 <Method void InvalidPdfException(String)>
	//  100  232:invokespecial   #596 <Method void ExceptionConverter(Exception)>
	//  101  235:athrow          
					}
			}
		}
		return;
	}

	public void addSubsetRange(int ai[])
	{
		if(subsetRanges == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #601 <Field ArrayList subsetRanges>
	//*   2    4:ifnonnull       18
			subsetRanges = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #319 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #515 <Method void ArrayList()>
	//    7   15:putfield        #601 <Field ArrayList subsetRanges>
		subsetRanges.add(((Object) (ai)));
	//    8   18:aload_0         
	//    9   19:getfield        #601 <Field ArrayList subsetRanges>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #322 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public boolean charExists(int i)
	{
		return convertToBytes(i).length > 0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #606 <Method byte[] convertToBytes(int)>
	//    3    5:arraylength     
	//    4    6:ifle            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	byte[] convertToBytes(int i)
	{
		if(directTextToByte)
	//*   0    0:aload_0         
	//*   1    1:getfield        #264 <Field boolean directTextToByte>
	//*   2    4:ifeq            14
			return PdfEncodings.convertToBytes((char)i, ((String) (null)));
	//    3    7:iload_1         
	//    4    8:int2char        
	//    5    9:aconst_null     
	//    6   10:invokestatic    #611 <Method byte[] PdfEncodings.convertToBytes(char, String)>
	//    7   13:areturn         
		if(specialMap != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #613 <Field IntHashtable specialMap>
	//*  10   18:ifnull          52
		{
			if(specialMap.containsKey(i))
	//*  11   21:aload_0         
	//*  12   22:getfield        #613 <Field IntHashtable specialMap>
	//*  13   25:iload_1         
	//*  14   26:invokevirtual   #574 <Method boolean IntHashtable.containsKey(int)>
	//*  15   29:ifeq            48
				return (new byte[] {
					(byte)specialMap.get(i)
				});
	//   16   32:iconst_1        
	//   17   33:newarray        byte[]
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:aload_0         
	//   21   38:getfield        #613 <Field IntHashtable specialMap>
	//   22   41:iload_1         
	//   23   42:invokevirtual   #616 <Method int IntHashtable.get(int)>
	//   24   45:int2byte        
	//   25   46:bastore         
	//   26   47:areturn         
			else
				return new byte[0];
	//   27   48:iconst_0        
	//   28   49:newarray        byte[]
	//   29   51:areturn         
		} else
		{
			return PdfEncodings.convertToBytes((char)i, encoding);
	//   30   52:iload_1         
	//   31   53:int2char        
	//   32   54:aload_0         
	//   33   55:getfield        #618 <Field String encoding>
	//   34   58:invokestatic    #611 <Method byte[] PdfEncodings.convertToBytes(char, String)>
	//   35   61:areturn         
		}
	}

	public byte[] convertToBytes(String s)
	{
		if(directTextToByte)
	//*   0    0:aload_0         
	//*   1    1:getfield        #264 <Field boolean directTextToByte>
	//*   2    4:ifeq            13
			return PdfEncodings.convertToBytes(s, ((String) (null)));
	//    3    7:aload_1         
	//    4    8:aconst_null     
	//    5    9:invokestatic    #622 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//    6   12:areturn         
		if(specialMap != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #613 <Field IntHashtable specialMap>
	//*   9   17:ifnull          116
		{
			byte abyte0[] = new byte[s.length()];
	//   10   20:aload_1         
	//   11   21:invokevirtual   #503 <Method int String.length()>
	//   12   24:newarray        byte[]
	//   13   26:astore          7
			int l = s.length();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #503 <Method int String.length()>
	//   16   32:istore          5
			int j = 0;
	//   17   34:iconst_0        
	//   18   35:istore_3        
			int i = 0;
	//   19   36:iconst_0        
	//   20   37:istore_2        
			for(; j < l; j++)
	//*  21   38:iload_3         
	//*  22   39:iload           5
	//*  23   41:icmpge          92
			{
				char c = s.charAt(j);
	//   24   44:aload_1         
	//   25   45:iload_3         
	//   26   46:invokevirtual   #626 <Method char String.charAt(int)>
	//   27   49:istore          6
				if(specialMap.containsKey(((int) (c))))
	//*  28   51:aload_0         
	//*  29   52:getfield        #613 <Field IntHashtable specialMap>
	//*  30   55:iload           6
	//*  31   57:invokevirtual   #574 <Method boolean IntHashtable.containsKey(int)>
	//*  32   60:ifeq            125
				{
					int k = i + 1;
	//   33   63:iload_2         
	//   34   64:iconst_1        
	//   35   65:iadd            
	//   36   66:istore          4
					abyte0[i] = (byte)specialMap.get(((int) (c)));
	//   37   68:aload           7
	//   38   70:iload_2         
	//   39   71:aload_0         
	//   40   72:getfield        #613 <Field IntHashtable specialMap>
	//   41   75:iload           6
	//   42   77:invokevirtual   #616 <Method int IntHashtable.get(int)>
	//   43   80:int2byte        
	//   44   81:bastore         
					i = k;
	//   45   82:iload           4
	//   46   84:istore_2        
				}
			}

	//   47   85:iload_3         
	//   48   86:iconst_1        
	//   49   87:iadd            
	//   50   88:istore_3        
	//*  51   89:goto            38
			if(i < l)
	//*  52   92:iload_2         
	//*  53   93:iload           5
	//*  54   95:icmpge          113
			{
				s = ((String) (new byte[i]));
	//   55   98:iload_2         
	//   56   99:newarray        byte[]
	//   57  101:astore_1        
				System.arraycopy(((Object) (abyte0)), 0, ((Object) (s)), 0, i);
	//   58  102:aload           7
	//   59  104:iconst_0        
	//   60  105:aload_1         
	//   61  106:iconst_0        
	//   62  107:iload_2         
	//   63  108:invokestatic    #632 <Method void System.arraycopy(Object, int, Object, int, int)>
				return ((byte []) (s));
	//   64  111:aload_1         
	//   65  112:areturn         
			} else
			{
				return abyte0;
	//   66  113:aload           7
	//   67  115:areturn         
			}
		} else
		{
			return PdfEncodings.convertToBytes(s, encoding);
	//   68  116:aload_1         
	//   69  117:aload_0         
	//   70  118:getfield        #618 <Field String encoding>
	//   71  121:invokestatic    #622 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//   72  124:areturn         
		}
	//*  73  125:goto            85
	}

	public void correctArabicAdvance()
	{
		for(char c = '\u064B'; c <= '\u0658'; c++)
	//*   0    0:sipush          1611
	//*   1    3:istore_1        
	//*   2    4:iload_1         
	//*   3    5:sipush          1624
	//*   4    8:icmpgt          26
			setCharAdvance(((int) (c)), 0);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #637 <Method boolean setCharAdvance(int, int)>
	//    9   17:pop             

	//   10   18:iload_1         
	//   11   19:iconst_1        
	//   12   20:iadd            
	//   13   21:int2char        
	//   14   22:istore_1        
	//*  15   23:goto            4
		setCharAdvance(1648, 0);
	//   16   26:aload_0         
	//   17   27:sipush          1648
	//   18   30:iconst_0        
	//   19   31:invokevirtual   #637 <Method boolean setCharAdvance(int, int)>
	//   20   34:pop             
		for(char c1 = '\u06D6'; c1 <= '\u06DC'; c1++)
	//*  21   35:sipush          1750
	//*  22   38:istore_1        
	//*  23   39:iload_1         
	//*  24   40:sipush          1756
	//*  25   43:icmpgt          61
			setCharAdvance(((int) (c1)), 0);
	//   26   46:aload_0         
	//   27   47:iload_1         
	//   28   48:iconst_0        
	//   29   49:invokevirtual   #637 <Method boolean setCharAdvance(int, int)>
	//   30   52:pop             

	//   31   53:iload_1         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:int2char        
	//   35   57:istore_1        
	//*  36   58:goto            39
		for(char c2 = '\u06DF'; c2 <= '\u06E4'; c2++)
	//*  37   61:sipush          1759
	//*  38   64:istore_1        
	//*  39   65:iload_1         
	//*  40   66:sipush          1764
	//*  41   69:icmpgt          87
			setCharAdvance(((int) (c2)), 0);
	//   42   72:aload_0         
	//   43   73:iload_1         
	//   44   74:iconst_0        
	//   45   75:invokevirtual   #637 <Method boolean setCharAdvance(int, int)>
	//   46   78:pop             

	//   47   79:iload_1         
	//   48   80:iconst_1        
	//   49   81:iadd            
	//   50   82:int2char        
	//   51   83:istore_1        
	//*  52   84:goto            65
		for(char c3 = '\u06E7'; c3 <= '\u06E8'; c3++)
	//*  53   87:sipush          1767
	//*  54   90:istore_1        
	//*  55   91:iload_1         
	//*  56   92:sipush          1768
	//*  57   95:icmpgt          113
			setCharAdvance(((int) (c3)), 0);
	//   58   98:aload_0         
	//   59   99:iload_1         
	//   60  100:iconst_0        
	//   61  101:invokevirtual   #637 <Method boolean setCharAdvance(int, int)>
	//   62  104:pop             

	//   63  105:iload_1         
	//   64  106:iconst_1        
	//   65  107:iadd            
	//   66  108:int2char        
	//   67  109:istore_1        
	//*  68  110:goto            91
		for(char c4 = '\u06EA'; c4 <= '\u06ED'; c4++)
	//*  69  113:sipush          1770
	//*  70  116:istore_1        
	//*  71  117:iload_1         
	//*  72  118:sipush          1773
	//*  73  121:icmpgt          139
			setCharAdvance(((int) (c4)), 0);
	//   74  124:aload_0         
	//   75  125:iload_1         
	//   76  126:iconst_0        
	//   77  127:invokevirtual   #637 <Method boolean setCharAdvance(int, int)>
	//   78  130:pop             

	//   79  131:iload_1         
	//   80  132:iconst_1        
	//   81  133:iadd            
	//   82  134:int2char        
	//   83  135:istore_1        
	//*  84  136:goto            117
	//   85  139:return          
	}

	protected void createEncoding()
	{
		if(encoding.startsWith("#"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #618 <Field String encoding>
	//*   2    4:ldc2            #640 <String "#">
	//*   3    7:invokevirtual   #643 <Method boolean String.startsWith(String)>
	//*   4   10:ifeq            331
		{
			specialMap = new IntHashtable();
	//    5   13:aload_0         
	//    6   14:new             #330 <Class IntHashtable>
	//    7   17:dup             
	//    8   18:invokespecial   #514 <Method void IntHashtable()>
	//    9   21:putfield        #613 <Field IntHashtable specialMap>
			StringTokenizer stringtokenizer = new StringTokenizer(encoding.substring(1), " ,\t\n\r\f");
	//   10   24:new             #645 <Class StringTokenizer>
	//   11   27:dup             
	//   12   28:aload_0         
	//   13   29:getfield        #618 <Field String encoding>
	//   14   32:iconst_1        
	//   15   33:invokevirtual   #648 <Method String String.substring(int)>
	//   16   36:ldc2            #650 <String " ,\t\n\r\f">
	//   17   39:invokespecial   #653 <Method void StringTokenizer(String, String)>
	//   18   42:astore          4
			if(stringtokenizer.nextToken().equals("full"))
	//*  19   44:aload           4
	//*  20   46:invokevirtual   #656 <Method String StringTokenizer.nextToken()>
	//*  21   49:ldc2            #658 <String "full">
	//*  22   52:invokevirtual   #392 <Method boolean String.equals(Object)>
	//*  23   55:ifeq            179
			{
				while(stringtokenizer.hasMoreTokens()) 
	//*  24   58:aload           4
	//*  25   60:invokevirtual   #661 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  26   63:ifeq            298
				{
					String s1 = stringtokenizer.nextToken();
	//   27   66:aload           4
	//   28   68:invokevirtual   #656 <Method String StringTokenizer.nextToken()>
	//   29   71:astore          5
					String s4 = stringtokenizer.nextToken();
	//   30   73:aload           4
	//   31   75:invokevirtual   #656 <Method String StringTokenizer.nextToken()>
	//   32   78:astore          6
					char c = (char)Integer.parseInt(stringtokenizer.nextToken(), 16);
	//   33   80:aload           4
	//   34   82:invokevirtual   #656 <Method String StringTokenizer.nextToken()>
	//   35   85:bipush          16
	//   36   87:invokestatic    #667 <Method int Integer.parseInt(String, int)>
	//   37   90:int2char        
	//   38   91:istore_1        
					int i;
					if(s1.startsWith("'"))
	//*  39   92:aload           5
	//*  40   94:ldc2            #669 <String "'">
	//*  41   97:invokevirtual   #643 <Method boolean String.startsWith(String)>
	//*  42  100:ifeq            170
						i = ((int) (s1.charAt(1)));
	//   43  103:aload           5
	//   44  105:iconst_1        
	//   45  106:invokevirtual   #626 <Method char String.charAt(int)>
	//   46  109:istore_2        
					else
	//*  47  110:iload_2         
	//*  48  111:sipush          256
	//*  49  114:irem            
	//*  50  115:istore_2        
	//*  51  116:aload_0         
	//*  52  117:getfield        #613 <Field IntHashtable specialMap>
	//*  53  120:iload_1         
	//*  54  121:iload_2         
	//*  55  122:invokevirtual   #333 <Method int IntHashtable.put(int, int)>
	//*  56  125:pop             
	//*  57  126:aload_0         
	//*  58  127:getfield        #251 <Field String[] differences>
	//*  59  130:iload_2         
	//*  60  131:aload           6
	//*  61  133:aastore         
	//*  62  134:aload_0         
	//*  63  135:getfield        #253 <Field char[] unicodeDifferences>
	//*  64  138:iload_2         
	//*  65  139:iload_1         
	//*  66  140:castore         
	//*  67  141:aload_0         
	//*  68  142:getfield        #247 <Field int[] widths>
	//*  69  145:iload_2         
	//*  70  146:aload_0         
	//*  71  147:iload_1         
	//*  72  148:aload           6
	//*  73  150:invokevirtual   #673 <Method int getRawWidth(int, String)>
	//*  74  153:iastore         
	//*  75  154:aload_0         
	//*  76  155:getfield        #256 <Field int[][] charBBoxes>
	//*  77  158:iload_2         
	//*  78  159:aload_0         
	//*  79  160:iload_1         
	//*  80  161:aload           6
	//*  81  163:invokevirtual   #677 <Method int[] getRawCharBBox(int, String)>
	//*  82  166:aastore         
	//*  83  167:goto            58
						i = Integer.parseInt(s1);
	//   84  170:aload           5
	//   85  172:invokestatic    #679 <Method int Integer.parseInt(String)>
	//   86  175:istore_2        
					i %= 256;
					specialMap.put(((int) (c)), i);
					differences[i] = s4;
					unicodeDifferences[i] = c;
					widths[i] = getRawWidth(((int) (c)), s4);
					charBBoxes[i] = getRawCharBBox(((int) (c)), s4);
				}
			} else
	//*  87  176:goto            110
			{
				int j = 0;
	//   88  179:iconst_0        
	//   89  180:istore_2        
				if(stringtokenizer.hasMoreTokens())
	//*  90  181:aload           4
	//*  91  183:invokevirtual   #661 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  92  186:ifeq            198
					j = Integer.parseInt(stringtokenizer.nextToken());
	//   93  189:aload           4
	//   94  191:invokevirtual   #656 <Method String StringTokenizer.nextToken()>
	//   95  194:invokestatic    #679 <Method int Integer.parseInt(String)>
	//   96  197:istore_2        
				do
				{
					if(!stringtokenizer.hasMoreTokens() || j >= 256)
						break;
	//   97  198:aload           4
	//   98  200:invokevirtual   #661 <Method boolean StringTokenizer.hasMoreTokens()>
	//   99  203:ifeq            298
	//  100  206:iload_2         
	//  101  207:sipush          256
	//  102  210:icmpge          298
					int j1 = Integer.parseInt(stringtokenizer.nextToken(), 16) % 0x10000;
	//  103  213:aload           4
	//  104  215:invokevirtual   #656 <Method String StringTokenizer.nextToken()>
	//  105  218:bipush          16
	//  106  220:invokestatic    #667 <Method int Integer.parseInt(String, int)>
	//  107  223:ldc2            #680 <Int 0x10000>
	//  108  226:irem            
	//  109  227:istore_3        
					String s2 = GlyphList.unicodeToName(j1);
	//  110  228:iload_3         
	//  111  229:invokestatic    #685 <Method String GlyphList.unicodeToName(int)>
	//  112  232:astore          5
					if(s2 != null)
	//* 113  234:aload           5
	//* 114  236:ifnull          198
					{
						specialMap.put(j1, j);
	//  115  239:aload_0         
	//  116  240:getfield        #613 <Field IntHashtable specialMap>
	//  117  243:iload_3         
	//  118  244:iload_2         
	//  119  245:invokevirtual   #333 <Method int IntHashtable.put(int, int)>
	//  120  248:pop             
						differences[j] = s2;
	//  121  249:aload_0         
	//  122  250:getfield        #251 <Field String[] differences>
	//  123  253:iload_2         
	//  124  254:aload           5
	//  125  256:aastore         
						unicodeDifferences[j] = (char)j1;
	//  126  257:aload_0         
	//  127  258:getfield        #253 <Field char[] unicodeDifferences>
	//  128  261:iload_2         
	//  129  262:iload_3         
	//  130  263:int2char        
	//  131  264:castore         
						widths[j] = getRawWidth(j1, s2);
	//  132  265:aload_0         
	//  133  266:getfield        #247 <Field int[] widths>
	//  134  269:iload_2         
	//  135  270:aload_0         
	//  136  271:iload_3         
	//  137  272:aload           5
	//  138  274:invokevirtual   #673 <Method int getRawWidth(int, String)>
	//  139  277:iastore         
						charBBoxes[j] = getRawCharBBox(j1, s2);
	//  140  278:aload_0         
	//  141  279:getfield        #256 <Field int[][] charBBoxes>
	//  142  282:iload_2         
	//  143  283:aload_0         
	//  144  284:iload_3         
	//  145  285:aload           5
	//  146  287:invokevirtual   #677 <Method int[] getRawCharBBox(int, String)>
	//  147  290:aastore         
						j++;
	//  148  291:iload_2         
	//  149  292:iconst_1        
	//  150  293:iadd            
	//  151  294:istore_2        
					}
				} while(true);
	//  152  295:goto            198
			}
			for(int k = 0; k < 256; k++)
	//* 153  298:iconst_0        
	//* 154  299:istore_2        
	//* 155  300:iload_2         
	//* 156  301:sipush          256
	//* 157  304:icmpge          497
				if(differences[k] == null)
	//* 158  307:aload_0         
	//* 159  308:getfield        #251 <Field String[] differences>
	//* 160  311:iload_2         
	//* 161  312:aaload          
	//* 162  313:ifnonnull       324
					differences[k] = ".notdef";
	//  163  316:aload_0         
	//  164  317:getfield        #251 <Field String[] differences>
	//  165  320:iload_2         
	//  166  321:ldc1            #152 <String ".notdef">
	//  167  323:aastore         

	//  168  324:iload_2         
	//  169  325:iconst_1        
	//  170  326:iadd            
	//  171  327:istore_2        
		} else
	//* 172  328:goto            300
		if(fontSpecific)
	//* 173  331:aload_0         
	//* 174  332:getfield        #260 <Field boolean fontSpecific>
	//* 175  335:ifeq            378
		{
			for(int l = 0; l < 256; l++)
	//* 176  338:iconst_0        
	//* 177  339:istore_2        
	//* 178  340:iload_2         
	//* 179  341:sipush          256
	//* 180  344:icmpge          497
			{
				widths[l] = getRawWidth(l, ((String) (null)));
	//  181  347:aload_0         
	//  182  348:getfield        #247 <Field int[] widths>
	//  183  351:iload_2         
	//  184  352:aload_0         
	//  185  353:iload_2         
	//  186  354:aconst_null     
	//  187  355:invokevirtual   #673 <Method int getRawWidth(int, String)>
	//  188  358:iastore         
				charBBoxes[l] = getRawCharBBox(l, ((String) (null)));
	//  189  359:aload_0         
	//  190  360:getfield        #256 <Field int[][] charBBoxes>
	//  191  363:iload_2         
	//  192  364:aload_0         
	//  193  365:iload_2         
	//  194  366:aconst_null     
	//  195  367:invokevirtual   #677 <Method int[] getRawCharBBox(int, String)>
	//  196  370:aastore         
			}

	//  197  371:iload_2         
	//  198  372:iconst_1        
	//  199  373:iadd            
	//  200  374:istore_2        
		} else
	//* 201  375:goto            340
		{
			byte abyte0[] = new byte[1];
	//  202  378:iconst_1        
	//  203  379:newarray        byte[]
	//  204  381:astore          6
			int i1 = 0;
	//  205  383:iconst_0        
	//  206  384:istore_2        
			while(i1 < 256) 
	//* 207  385:iload_2         
	//* 208  386:sipush          256
	//* 209  389:icmpge          497
			{
				abyte0[0] = (byte)i1;
	//  210  392:aload           6
	//  211  394:iconst_0        
	//  212  395:iload_2         
	//  213  396:int2byte        
	//  214  397:bastore         
				String s = PdfEncodings.convertToString(abyte0, encoding);
	//  215  398:aload           6
	//  216  400:aload_0         
	//  217  401:getfield        #618 <Field String encoding>
	//  218  404:invokestatic    #689 <Method String PdfEncodings.convertToString(byte[], String)>
	//  219  407:astore          4
				char c1;
				String s3;
				if(s.length() > 0)
	//* 220  409:aload           4
	//* 221  411:invokevirtual   #503 <Method int String.length()>
	//* 222  414:ifle            491
					c1 = s.charAt(0);
	//  223  417:aload           4
	//  224  419:iconst_0        
	//  225  420:invokevirtual   #626 <Method char String.charAt(int)>
	//  226  423:istore_1        
				else
	//* 227  424:iload_1         
	//* 228  425:invokestatic    #685 <Method String GlyphList.unicodeToName(int)>
	//* 229  428:astore          5
	//* 230  430:aload           5
	//* 231  432:astore          4
	//* 232  434:aload           5
	//* 233  436:ifnonnull       443
	//* 234  439:ldc1            #152 <String ".notdef">
	//* 235  441:astore          4
	//* 236  443:aload_0         
	//* 237  444:getfield        #251 <Field String[] differences>
	//* 238  447:iload_2         
	//* 239  448:aload           4
	//* 240  450:aastore         
	//* 241  451:aload_0         
	//* 242  452:getfield        #253 <Field char[] unicodeDifferences>
	//* 243  455:iload_2         
	//* 244  456:iload_1         
	//* 245  457:castore         
	//* 246  458:aload_0         
	//* 247  459:getfield        #247 <Field int[] widths>
	//* 248  462:iload_2         
	//* 249  463:aload_0         
	//* 250  464:iload_1         
	//* 251  465:aload           4
	//* 252  467:invokevirtual   #673 <Method int getRawWidth(int, String)>
	//* 253  470:iastore         
	//* 254  471:aload_0         
	//* 255  472:getfield        #256 <Field int[][] charBBoxes>
	//* 256  475:iload_2         
	//* 257  476:aload_0         
	//* 258  477:iload_1         
	//* 259  478:aload           4
	//* 260  480:invokevirtual   #677 <Method int[] getRawCharBBox(int, String)>
	//* 261  483:aastore         
	//* 262  484:iload_2         
	//* 263  485:iconst_1        
	//* 264  486:iadd            
	//* 265  487:istore_2        
	//* 266  488:goto            385
					c1 = '?';
	//  267  491:bipush          63
	//  268  493:istore_1        
				s3 = GlyphList.unicodeToName(((int) (c1)));
				s = s3;
				if(s3 == null)
					s = ".notdef";
				differences[i1] = s;
				unicodeDifferences[i1] = c1;
				widths[i1] = getRawWidth(((int) (c1)), s);
				charBBoxes[i1] = getRawCharBBox(((int) (c1)), s);
				i1++;
			}
		}
	//* 269  494:goto            424
	//  270  497:return          
	}

	public abstract String[][] getAllNameEntries();

	public int getAscent(String s)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		s = ((String) (s.toCharArray()));
	//    2    2:aload_1         
	//    3    3:invokevirtual   #694 <Method char[] String.toCharArray()>
	//    4    6:astore_1        
		for(int i = 0; i < s.length;)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:aload_1         
	//*   9   11:arraylength     
	//*  10   12:icmpge          59
		{
			int ai[] = getCharBBox(((int) (s[i])));
	//   11   15:aload_0         
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:caload          
	//   15   19:invokevirtual   #698 <Method int[] getCharBBox(int)>
	//   16   22:astore          5
			int k = j;
	//   17   24:iload_3         
	//   18   25:istore          4
			if(ai != null)
	//*  19   27:aload           5
	//*  20   29:ifnull          49
			{
				k = j;
	//   21   32:iload_3         
	//   22   33:istore          4
				if(ai[3] > j)
	//*  23   35:aload           5
	//*  24   37:iconst_3        
	//*  25   38:iaload          
	//*  26   39:iload_3         
	//*  27   40:icmple          49
					k = ai[3];
	//   28   43:aload           5
	//   29   45:iconst_3        
	//   30   46:iaload          
	//   31   47:istore          4
			}
			i++;
	//   32   49:iload_2         
	//   33   50:iconst_1        
	//   34   51:iadd            
	//   35   52:istore_2        
			j = k;
	//   36   53:iload           4
	//   37   55:istore_3        
		}

	//*  38   56:goto            9
		return j;
	//   39   59:iload_3         
	//   40   60:ireturn         
	}

	public float getAscentPoint(String s, float f)
	{
		return (float)getAscent(s) * 0.001F * f;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #702 <Method int getAscent(String)>
	//    3    5:i2f             
	//    4    6:ldc2            #703 <Float 0.001F>
	//    5    9:fmul            
	//    6   10:fload_2         
	//    7   11:fmul            
	//    8   12:freturn         
	}

	public int[] getCharBBox(int i)
	{
		byte abyte0[] = convertToBytes(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #606 <Method byte[] convertToBytes(int)>
	//    3    5:astore_2        
		if(abyte0.length == 0)
	//*   4    6:aload_2         
	//*   5    7:arraylength     
	//*   6    8:ifne            13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		else
			return charBBoxes[abyte0[0] & 0xff];
	//    9   13:aload_0         
	//   10   14:getfield        #256 <Field int[][] charBBoxes>
	//   11   17:aload_2         
	//   12   18:iconst_0        
	//   13   19:baload          
	//   14   20:sipush          255
	//   15   23:iand            
	//   16   24:aaload          
	//   17   25:areturn         
	}

	public int getCidCode(int i)
	{
		return i;
	//    0    0:iload_1         
	//    1    1:ireturn         
	}

	public String[] getCodePagesSupported()
	{
		return new String[0];
	//    0    0:iconst_0        
	//    1    1:anewarray       String[]
	//    2    4:areturn         
	}

	public int getCompressionLevel()
	{
		return compressionLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field int compressionLevel>
	//    2    4:ireturn         
	}

	public int getDescent(String s)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		s = ((String) (s.toCharArray()));
	//    2    2:aload_1         
	//    3    3:invokevirtual   #694 <Method char[] String.toCharArray()>
	//    4    6:astore_1        
		for(int i = 0; i < s.length;)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:aload_1         
	//*   9   11:arraylength     
	//*  10   12:icmpge          59
		{
			int ai[] = getCharBBox(((int) (s[i])));
	//   11   15:aload_0         
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:caload          
	//   15   19:invokevirtual   #698 <Method int[] getCharBBox(int)>
	//   16   22:astore          5
			int k = j;
	//   17   24:iload_3         
	//   18   25:istore          4
			if(ai != null)
	//*  19   27:aload           5
	//*  20   29:ifnull          49
			{
				k = j;
	//   21   32:iload_3         
	//   22   33:istore          4
				if(ai[1] < j)
	//*  23   35:aload           5
	//*  24   37:iconst_1        
	//*  25   38:iaload          
	//*  26   39:iload_3         
	//*  27   40:icmpge          49
					k = ai[1];
	//   28   43:aload           5
	//   29   45:iconst_1        
	//   30   46:iaload          
	//   31   47:istore          4
			}
			i++;
	//   32   49:iload_2         
	//   33   50:iconst_1        
	//   34   51:iadd            
	//   35   52:istore_2        
			j = k;
	//   36   53:iload           4
	//   37   55:istore_3        
		}

	//*  38   56:goto            9
		return j;
	//   39   59:iload_3         
	//   40   60:ireturn         
	}

	public float getDescentPoint(String s, float f)
	{
		return (float)getDescent(s) * 0.001F * f;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #710 <Method int getDescent(String)>
	//    3    5:i2f             
	//    4    6:ldc2            #703 <Float 0.001F>
	//    5    9:fmul            
	//    6   10:fload_2         
	//    7   11:fmul            
	//    8   12:freturn         
	}

	public String[] getDifferences()
	{
		return differences;
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field String[] differences>
	//    2    4:areturn         
	}

	public String getEncoding()
	{
		return encoding;
	//    0    0:aload_0         
	//    1    1:getfield        #618 <Field String encoding>
	//    2    4:areturn         
	}

	public abstract String[][] getFamilyFontName();

	public abstract float getFontDescriptor(int i, float f);

	public double[] getFontMatrix()
	{
		return DEFAULT_FONT_MATRIX;
	//    0    0:getstatic       #196 <Field double[] DEFAULT_FONT_MATRIX>
	//    1    3:areturn         
	}

	public int getFontType()
	{
		return fontType;
	//    0    0:aload_0         
	//    1    1:getfield        #719 <Field int fontType>
	//    2    4:ireturn         
	}

	public abstract String[][] getFullFontName();

	abstract PdfStream getFullFontStream()
		throws IOException, DocumentException;

	public abstract int getKerning(int i, int j);

	public abstract String getPostscriptFontName();

	protected abstract int[] getRawCharBBox(int i, String s);

	abstract int getRawWidth(int i, String s);

	public String getSubfamily()
	{
		return "";
	//    0    0:ldc2            #448 <String "">
	//    1    3:areturn         
	}

	char getUnicodeDifferences(int i)
	{
		return unicodeDifferences[i];
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field char[] unicodeDifferences>
	//    2    4:iload_1         
	//    3    5:caload          
	//    4    6:ireturn         
	}

	public char[] getUnicodeDifferences()
	{
		return unicodeDifferences;
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field char[] unicodeDifferences>
	//    2    4:areturn         
	}

	public int getUnicodeEquivalent(int i)
	{
		return i;
	//    0    0:iload_1         
	//    1    1:ireturn         
	}

	public int getWidth(int i)
	{
		if(!fastWinansi) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field boolean fastWinansi>
	//    2    4:ifeq            50
_L1:
		if(i >= 128 && (i < 160 || i > 255)) goto _L4; else goto _L3
	//    3    7:iload_1         
	//    4    8:sipush          128
	//    5   11:icmplt          28
	//    6   14:iload_1         
	//    7   15:sipush          160
	//    8   18:icmplt          37
	//    9   21:iload_1         
	//   10   22:sipush          255
	//   11   25:icmpgt          37
_L3:
		int k = widths[i];
	//   12   28:aload_0         
	//   13   29:getfield        #247 <Field int[] widths>
	//   14   32:iload_1         
	//   15   33:iaload          
	//   16   34:istore_3        
_L6:
		return k;
	//   17   35:iload_3         
	//   18   36:ireturn         
_L4:
		return widths[PdfEncodings.winansi.get(i)];
	//   19   37:aload_0         
	//   20   38:getfield        #247 <Field int[] widths>
	//   21   41:getstatic       #728 <Field IntHashtable PdfEncodings.winansi>
	//   22   44:iload_1         
	//   23   45:invokevirtual   #616 <Method int IntHashtable.get(int)>
	//   24   48:iaload          
	//   25   49:ireturn         
_L2:
		int j = 0;
	//   26   50:iconst_0        
	//   27   51:istore_2        
		byte abyte0[] = convertToBytes(i);
	//   28   52:aload_0         
	//   29   53:iload_1         
	//   30   54:invokevirtual   #606 <Method byte[] convertToBytes(int)>
	//   31   57:astore          4
		k = 0;
	//   32   59:iconst_0        
	//   33   60:istore_3        
		i = j;
	//   34   61:iload_2         
	//   35   62:istore_1        
		j = k;
	//   36   63:iload_3         
	//   37   64:istore_2        
		do
		{
			k = i;
	//   38   65:iload_1         
	//   39   66:istore_3        
			if(j >= abyte0.length)
				continue;
	//   40   67:iload_2         
	//   41   68:aload           4
	//   42   70:arraylength     
	//   43   71:icmpge          35
			i += widths[abyte0[j] & 0xff];
	//   44   74:iload_1         
	//   45   75:aload_0         
	//   46   76:getfield        #247 <Field int[] widths>
	//   47   79:aload           4
	//   48   81:iload_2         
	//   49   82:baload          
	//   50   83:sipush          255
	//   51   86:iand            
	//   52   87:iaload          
	//   53   88:iadd            
	//   54   89:istore_1        
			j++;
	//   55   90:iload_2         
	//   56   91:iconst_1        
	//   57   92:iadd            
	//   58   93:istore_2        
		} while(true);
	//   59   94:goto            65
		if(true) goto _L6; else goto _L5
_L5:
	}

	public int getWidth(String s)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(fastWinansi)
	//*   4    4:aload_0         
	//*   5    5:getfield        #268 <Field boolean fastWinansi>
	//*   6    8:ifeq            94
		{
			int l = s.length();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #503 <Method int String.length()>
	//    9   15:istore          4
			k = 0;
	//   10   17:iconst_0        
	//   11   18:istore_3        
			while(k < l) 
	//*  12   19:iload_3         
	//*  13   20:iload           4
	//*  14   22:icmpge          92
			{
				char c = s.charAt(k);
	//   15   25:aload_1         
	//   16   26:iload_3         
	//   17   27:invokevirtual   #626 <Method char String.charAt(int)>
	//   18   30:istore          5
				if(c < '\200' || c >= '\240' && c <= '\377')
	//*  19   32:iload           5
	//*  20   34:sipush          128
	//*  21   37:icmplt          56
	//*  22   40:iload           5
	//*  23   42:sipush          160
	//*  24   45:icmplt          73
	//*  25   48:iload           5
	//*  26   50:sipush          255
	//*  27   53:icmpgt          73
					i += widths[c];
	//   28   56:iload_2         
	//   29   57:aload_0         
	//   30   58:getfield        #247 <Field int[] widths>
	//   31   61:iload           5
	//   32   63:iaload          
	//   33   64:iadd            
	//   34   65:istore_2        
				else
	//*  35   66:iload_3         
	//*  36   67:iconst_1        
	//*  37   68:iadd            
	//*  38   69:istore_3        
	//*  39   70:goto            19
					i += widths[PdfEncodings.winansi.get(((int) (c)))];
	//   40   73:iload_2         
	//   41   74:aload_0         
	//   42   75:getfield        #247 <Field int[] widths>
	//   43   78:getstatic       #728 <Field IntHashtable PdfEncodings.winansi>
	//   44   81:iload           5
	//   45   83:invokevirtual   #616 <Method int IntHashtable.get(int)>
	//   46   86:iaload          
	//   47   87:iadd            
	//   48   88:istore_2        
				k++;
			}
	//*  49   89:goto            66
			return i;
	//   50   92:iload_2         
	//   51   93:ireturn         
		}
		s = ((String) (convertToBytes(s)));
	//   52   94:aload_0         
	//   53   95:aload_1         
	//   54   96:invokevirtual   #730 <Method byte[] convertToBytes(String)>
	//   55   99:astore_1        
		for(int j = 0; j < s.length; j++)
	//*  56  100:iconst_0        
	//*  57  101:istore_2        
	//*  58  102:iload_2         
	//*  59  103:aload_1         
	//*  60  104:arraylength     
	//*  61  105:icmpge          130
			k += widths[s[j] & 0xff];
	//   62  108:iload_3         
	//   63  109:aload_0         
	//   64  110:getfield        #247 <Field int[] widths>
	//   65  113:aload_1         
	//   66  114:iload_2         
	//   67  115:baload          
	//   68  116:sipush          255
	//   69  119:iand            
	//   70  120:iaload          
	//   71  121:iadd            
	//   72  122:istore_3        

	//   73  123:iload_2         
	//   74  124:iconst_1        
	//   75  125:iadd            
	//   76  126:istore_2        
	//*  77  127:goto            102
		return k;
	//   78  130:iload_3         
	//   79  131:ireturn         
	}

	public float getWidthPoint(int i, float f)
	{
		return (float)getWidth(i) * 0.001F * f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #733 <Method int getWidth(int)>
	//    3    5:i2f             
	//    4    6:ldc2            #703 <Float 0.001F>
	//    5    9:fmul            
	//    6   10:fload_2         
	//    7   11:fmul            
	//    8   12:freturn         
	}

	public float getWidthPoint(String s, float f)
	{
		return (float)getWidth(s) * 0.001F * f;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #735 <Method int getWidth(String)>
	//    3    5:i2f             
	//    4    6:ldc2            #703 <Float 0.001F>
	//    5    9:fmul            
	//    6   10:fload_2         
	//    7   11:fmul            
	//    8   12:freturn         
	}

	public float getWidthPointKerned(String s, float f)
	{
		float f1 = (float)getWidth(s) * 0.001F * f;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #735 <Method int getWidth(String)>
	//    3    5:i2f             
	//    4    6:ldc2            #703 <Float 0.001F>
	//    5    9:fmul            
	//    6   10:fload_2         
	//    7   11:fmul            
	//    8   12:fstore_3        
		if(!hasKernPairs())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #739 <Method boolean hasKernPairs()>
	//*  11   17:ifne            22
			return f1;
	//   12   20:fload_3         
	//   13   21:freturn         
		int k = s.length();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #503 <Method int String.length()>
	//   16   26:istore          6
		int j = 0;
	//   17   28:iconst_0        
	//   18   29:istore          5
		s = ((String) (s.toCharArray()));
	//   19   31:aload_1         
	//   20   32:invokevirtual   #694 <Method char[] String.toCharArray()>
	//   21   35:astore_1        
		for(int i = 0; i < k - 1; i++)
	//*  22   36:iconst_0        
	//*  23   37:istore          4
	//*  24   39:iload           4
	//*  25   41:iload           6
	//*  26   43:iconst_1        
	//*  27   44:isub            
	//*  28   45:icmpge          76
			j += getKerning(((int) (s[i])), ((int) (s[i + 1])));
	//   29   48:iload           5
	//   30   50:aload_0         
	//   31   51:aload_1         
	//   32   52:iload           4
	//   33   54:caload          
	//   34   55:aload_1         
	//   35   56:iload           4
	//   36   58:iconst_1        
	//   37   59:iadd            
	//   38   60:caload          
	//   39   61:invokevirtual   #741 <Method int getKerning(int, int)>
	//   40   64:iadd            
	//   41   65:istore          5

	//   42   67:iload           4
	//   43   69:iconst_1        
	//   44   70:iadd            
	//   45   71:istore          4
	//*  46   73:goto            39
		return f1 + (float)j * 0.001F * f;
	//   47   76:fload_3         
	//   48   77:iload           5
	//   49   79:i2f             
	//   50   80:ldc2            #703 <Float 0.001F>
	//   51   83:fmul            
	//   52   84:fload_2         
	//   53   85:fmul            
	//   54   86:fadd            
	//   55   87:freturn         
	}

	public int[] getWidths()
	{
		return widths;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field int[] widths>
	//    2    4:areturn         
	}

	public abstract boolean hasKernPairs();

	public boolean isDirectTextToByte()
	{
		return directTextToByte;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field boolean directTextToByte>
	//    2    4:ireturn         
	}

	public boolean isEmbedded()
	{
		return embedded;
	//    0    0:aload_0         
	//    1    1:getfield        #747 <Field boolean embedded>
	//    2    4:ireturn         
	}

	public boolean isFontSpecific()
	{
		return fontSpecific;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field boolean fontSpecific>
	//    2    4:ireturn         
	}

	public boolean isForceWidthsOutput()
	{
		return forceWidthsOutput;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field boolean forceWidthsOutput>
	//    2    4:ireturn         
	}

	public boolean isSubset()
	{
		return subset;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field boolean subset>
	//    2    4:ireturn         
	}

	public boolean isVertical()
	{
		return vertical;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field boolean vertical>
	//    2    4:ireturn         
	}

	public boolean setCharAdvance(int i, int j)
	{
		byte abyte0[] = convertToBytes(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #606 <Method byte[] convertToBytes(int)>
	//    3    5:astore_3        
		if(abyte0.length == 0)
	//*   4    6:aload_3         
	//*   5    7:arraylength     
	//*   6    8:ifne            13
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		} else
		{
			widths[abyte0[0] & 0xff] = j;
	//    9   13:aload_0         
	//   10   14:getfield        #247 <Field int[] widths>
	//   11   17:aload_3         
	//   12   18:iconst_0        
	//   13   19:baload          
	//   14   20:sipush          255
	//   15   23:iand            
	//   16   24:iload_2         
	//   17   25:iastore         
			return true;
	//   18   26:iconst_1        
	//   19   27:ireturn         
		}
	}

	public void setCompressionLevel(int i)
	{
		if(i < 0 || i > 9)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
	//*   2    4:iload_1         
	//*   3    5:bipush          9
	//*   4    7:icmple          16
		{
			compressionLevel = -1;
	//    5   10:aload_0         
	//    6   11:iconst_m1       
	//    7   12:putfield        #258 <Field int compressionLevel>
			return;
	//    8   15:return          
		} else
		{
			compressionLevel = i;
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:putfield        #258 <Field int compressionLevel>
			return;
	//   12   21:return          
		}
	}

	public void setDirectTextToByte(boolean flag)
	{
		directTextToByte = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #264 <Field boolean directTextToByte>
	//    3    5:return          
	}

	public void setFontDescriptor(int i, float f)
	{
	//    0    0:return          
	}

	public void setForceWidthsOutput(boolean flag)
	{
		forceWidthsOutput = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #262 <Field boolean forceWidthsOutput>
	//    3    5:return          
	}

	public abstract boolean setKerning(int i, int j, int k);

	public abstract void setPostscriptFontName(String s);

	public void setSubset(boolean flag)
	{
		subset = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #266 <Field boolean subset>
	//    3    5:return          
	}

	abstract void writeFont(PdfWriter pdfwriter, PdfIndirectReference pdfindirectreference, Object aobj[])
		throws DocumentException, IOException;

	public static final int ASCENT = 1;
	public static final int AWT_ASCENT = 9;
	public static final int AWT_DESCENT = 10;
	public static final int AWT_LEADING = 11;
	public static final int AWT_MAXADVANCE = 12;
	public static final int BBOXLLX = 5;
	public static final int BBOXLLY = 6;
	public static final int BBOXURX = 7;
	public static final int BBOXURY = 8;
	protected static final HashMap BuiltinFonts14;
	public static final boolean CACHED = true;
	public static final int CAPHEIGHT = 2;
	public static final int CHAR_RANGE_ARABIC[] = {
		0, 127, 1536, 1663, 8352, 8399, 64336, 64511, 65136, 65279
	};
	public static final int CHAR_RANGE_CYRILLIC[] = {
		0, 127, 1024, 1327, 8192, 8303, 8352, 8399
	};
	public static final int CHAR_RANGE_HEBREW[] = {
		0, 127, 1424, 1535, 8352, 8399, 64285, 64335
	};
	public static final int CHAR_RANGE_LATIN[] = {
		0, 383, 8192, 8303, 8352, 8399, 64256, 64262
	};
	public static final char CID_NEWLINE = 32767;
	public static final String COURIER = "Courier";
	public static final String COURIER_BOLD = "Courier-Bold";
	public static final String COURIER_BOLDOBLIQUE = "Courier-BoldOblique";
	public static final String COURIER_OBLIQUE = "Courier-Oblique";
	public static final String CP1250 = "Cp1250";
	public static final String CP1252 = "Cp1252";
	public static final String CP1257 = "Cp1257";
	public static final double DEFAULT_FONT_MATRIX[] = {
		0.001D, 0.0D, 0.0D, 0.001D, 0.0D, 0.0D
	};
	public static final int DESCENT = 3;
	public static final boolean EMBEDDED = true;
	public static final int FONT_TYPE_CJK = 2;
	public static final int FONT_TYPE_DOCUMENT = 4;
	public static final int FONT_TYPE_T1 = 0;
	public static final int FONT_TYPE_T3 = 5;
	public static final int FONT_TYPE_TT = 1;
	public static final int FONT_TYPE_TTUNI = 3;
	public static final int FONT_WEIGHT = 23;
	public static final String HELVETICA = "Helvetica";
	public static final String HELVETICA_BOLD = "Helvetica-Bold";
	public static final String HELVETICA_BOLDOBLIQUE = "Helvetica-BoldOblique";
	public static final String HELVETICA_OBLIQUE = "Helvetica-Oblique";
	public static final String IDENTITY_H = "Identity-H";
	public static final String IDENTITY_V = "Identity-V";
	public static final int ITALICANGLE = 4;
	public static final String MACROMAN = "MacRoman";
	public static final boolean NOT_CACHED = false;
	public static final boolean NOT_EMBEDDED = false;
	public static final char PARAGRAPH_SEPARATOR = 8233;
	public static final String RESOURCE_PATH = "com/itextpdf/text/pdf/fonts/";
	public static final int STRIKETHROUGH_POSITION = 15;
	public static final int STRIKETHROUGH_THICKNESS = 16;
	public static final int SUBSCRIPT_OFFSET = 18;
	public static final int SUBSCRIPT_SIZE = 17;
	public static final int SUPERSCRIPT_OFFSET = 20;
	public static final int SUPERSCRIPT_SIZE = 19;
	public static final String SYMBOL = "Symbol";
	public static final String TIMES_BOLD = "Times-Bold";
	public static final String TIMES_BOLDITALIC = "Times-BoldItalic";
	public static final String TIMES_ITALIC = "Times-Italic";
	public static final String TIMES_ROMAN = "Times-Roman";
	public static final int UNDERLINE_POSITION = 13;
	public static final int UNDERLINE_THICKNESS = 14;
	public static final int WEIGHT_CLASS = 21;
	public static final int WIDTH_CLASS = 22;
	public static final String WINANSI = "Cp1252";
	public static final String ZAPFDINGBATS = "ZapfDingbats";
	protected static ConcurrentHashMap fontCache = new ConcurrentHashMap();
	public static final String notdef = ".notdef";
	protected int charBBoxes[][];
	protected int compressionLevel;
	protected String differences[];
	protected boolean directTextToByte;
	protected boolean embedded;
	protected String encoding;
	protected boolean fastWinansi;
	protected boolean fontSpecific;
	int fontType;
	protected boolean forceWidthsOutput;
	protected IntHashtable specialMap;
	protected boolean subset;
	protected ArrayList subsetRanges;
	protected char unicodeDifferences[];
	protected boolean vertical;
	protected int widths[];

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:sipush          383
	//    9   13:iastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:sipush          8192
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:sipush          8303
	//   17   25:iastore         
	//   18   26:dup             
	//   19   27:iconst_4        
	//   20   28:sipush          8352
	//   21   31:iastore         
	//   22   32:dup             
	//   23   33:iconst_5        
	//   24   34:sipush          8399
	//   25   37:iastore         
	//   26   38:dup             
	//   27   39:bipush          6
	//   28   41:ldc1            #177 <Int 64256>
	//   29   43:iastore         
	//   30   44:dup             
	//   31   45:bipush          7
	//   32   47:ldc1            #178 <Int 64262>
	//   33   49:iastore         
	//   34   50:putstatic       #180 <Field int[] CHAR_RANGE_LATIN>
	//   35   53:bipush          10
	//   36   55:newarray        int[]
	//   37   57:dup             
	//   38   58:iconst_0        
	//   39   59:iconst_0        
	//   40   60:iastore         
	//   41   61:dup             
	//   42   62:iconst_1        
	//   43   63:bipush          127
	//   44   65:iastore         
	//   45   66:dup             
	//   46   67:iconst_2        
	//   47   68:sipush          1536
	//   48   71:iastore         
	//   49   72:dup             
	//   50   73:iconst_3        
	//   51   74:sipush          1663
	//   52   77:iastore         
	//   53   78:dup             
	//   54   79:iconst_4        
	//   55   80:sipush          8352
	//   56   83:iastore         
	//   57   84:dup             
	//   58   85:iconst_5        
	//   59   86:sipush          8399
	//   60   89:iastore         
	//   61   90:dup             
	//   62   91:bipush          6
	//   63   93:ldc1            #181 <Int 64336>
	//   64   95:iastore         
	//   65   96:dup             
	//   66   97:bipush          7
	//   67   99:ldc1            #182 <Int 64511>
	//   68  101:iastore         
	//   69  102:dup             
	//   70  103:bipush          8
	//   71  105:ldc1            #183 <Int 65136>
	//   72  107:iastore         
	//   73  108:dup             
	//   74  109:bipush          9
	//   75  111:ldc1            #184 <Int 65279>
	//   76  113:iastore         
	//   77  114:putstatic       #186 <Field int[] CHAR_RANGE_ARABIC>
	//   78  117:bipush          8
	//   79  119:newarray        int[]
	//   80  121:dup             
	//   81  122:iconst_0        
	//   82  123:iconst_0        
	//   83  124:iastore         
	//   84  125:dup             
	//   85  126:iconst_1        
	//   86  127:bipush          127
	//   87  129:iastore         
	//   88  130:dup             
	//   89  131:iconst_2        
	//   90  132:sipush          1424
	//   91  135:iastore         
	//   92  136:dup             
	//   93  137:iconst_3        
	//   94  138:sipush          1535
	//   95  141:iastore         
	//   96  142:dup             
	//   97  143:iconst_4        
	//   98  144:sipush          8352
	//   99  147:iastore         
	//  100  148:dup             
	//  101  149:iconst_5        
	//  102  150:sipush          8399
	//  103  153:iastore         
	//  104  154:dup             
	//  105  155:bipush          6
	//  106  157:ldc1            #187 <Int 64285>
	//  107  159:iastore         
	//  108  160:dup             
	//  109  161:bipush          7
	//  110  163:ldc1            #188 <Int 64335>
	//  111  165:iastore         
	//  112  166:putstatic       #190 <Field int[] CHAR_RANGE_HEBREW>
	//  113  169:bipush          8
	//  114  171:newarray        int[]
	//  115  173:dup             
	//  116  174:iconst_0        
	//  117  175:iconst_0        
	//  118  176:iastore         
	//  119  177:dup             
	//  120  178:iconst_1        
	//  121  179:bipush          127
	//  122  181:iastore         
	//  123  182:dup             
	//  124  183:iconst_2        
	//  125  184:sipush          1024
	//  126  187:iastore         
	//  127  188:dup             
	//  128  189:iconst_3        
	//  129  190:sipush          1327
	//  130  193:iastore         
	//  131  194:dup             
	//  132  195:iconst_4        
	//  133  196:sipush          8192
	//  134  199:iastore         
	//  135  200:dup             
	//  136  201:iconst_5        
	//  137  202:sipush          8303
	//  138  205:iastore         
	//  139  206:dup             
	//  140  207:bipush          6
	//  141  209:sipush          8352
	//  142  212:iastore         
	//  143  213:dup             
	//  144  214:bipush          7
	//  145  216:sipush          8399
	//  146  219:iastore         
	//  147  220:putstatic       #192 <Field int[] CHAR_RANGE_CYRILLIC>
	//  148  223:bipush          6
	//  149  225:newarray        double[]
	//  150  227:dup             
	//  151  228:iconst_0        
	//  152  229:ldc2w           #193 <Double 0.001D>
	//  153  232:dastore         
	//  154  233:dup             
	//  155  234:iconst_1        
	//  156  235:dconst_0        
	//  157  236:dastore         
	//  158  237:dup             
	//  159  238:iconst_2        
	//  160  239:dconst_0        
	//  161  240:dastore         
	//  162  241:dup             
	//  163  242:iconst_3        
	//  164  243:ldc2w           #193 <Double 0.001D>
	//  165  246:dastore         
	//  166  247:dup             
	//  167  248:iconst_4        
	//  168  249:dconst_0        
	//  169  250:dastore         
	//  170  251:dup             
	//  171  252:iconst_5        
	//  172  253:dconst_0        
	//  173  254:dastore         
	//  174  255:putstatic       #196 <Field double[] DEFAULT_FONT_MATRIX>
	//  175  258:new             #198 <Class ConcurrentHashMap>
	//  176  261:dup             
	//  177  262:invokespecial   #201 <Method void ConcurrentHashMap()>
	//  178  265:putstatic       #203 <Field ConcurrentHashMap fontCache>
		BuiltinFonts14 = new HashMap();
	//  179  268:new             #205 <Class HashMap>
	//  180  271:dup             
	//  181  272:invokespecial   #206 <Method void HashMap()>
	//  182  275:putstatic       #208 <Field HashMap BuiltinFonts14>
		BuiltinFonts14.put("Courier", ((Object) (PdfName.COURIER)));
	//  183  278:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  184  281:ldc1            #45  <String "Courier">
	//  185  283:getstatic       #213 <Field PdfName PdfName.COURIER>
	//  186  286:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  187  289:pop             
		BuiltinFonts14.put("Courier-Bold", ((Object) (PdfName.COURIER_BOLD)));
	//  188  290:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  189  293:ldc1            #48  <String "Courier-Bold">
	//  190  295:getstatic       #219 <Field PdfName PdfName.COURIER_BOLD>
	//  191  298:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  192  301:pop             
		BuiltinFonts14.put("Courier-BoldOblique", ((Object) (PdfName.COURIER_BOLDOBLIQUE)));
	//  193  302:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  194  305:ldc1            #51  <String "Courier-BoldOblique">
	//  195  307:getstatic       #221 <Field PdfName PdfName.COURIER_BOLDOBLIQUE>
	//  196  310:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  197  313:pop             
		BuiltinFonts14.put("Courier-Oblique", ((Object) (PdfName.COURIER_OBLIQUE)));
	//  198  314:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  199  317:ldc1            #54  <String "Courier-Oblique">
	//  200  319:getstatic       #223 <Field PdfName PdfName.COURIER_OBLIQUE>
	//  201  322:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  202  325:pop             
		BuiltinFonts14.put("Helvetica", ((Object) (PdfName.HELVETICA)));
	//  203  326:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  204  329:ldc1            #81  <String "Helvetica">
	//  205  331:getstatic       #225 <Field PdfName PdfName.HELVETICA>
	//  206  334:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  207  337:pop             
		BuiltinFonts14.put("Helvetica-Bold", ((Object) (PdfName.HELVETICA_BOLD)));
	//  208  338:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  209  341:ldc1            #84  <String "Helvetica-Bold">
	//  210  343:getstatic       #227 <Field PdfName PdfName.HELVETICA_BOLD>
	//  211  346:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  212  349:pop             
		BuiltinFonts14.put("Helvetica-BoldOblique", ((Object) (PdfName.HELVETICA_BOLDOBLIQUE)));
	//  213  350:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  214  353:ldc1            #87  <String "Helvetica-BoldOblique">
	//  215  355:getstatic       #229 <Field PdfName PdfName.HELVETICA_BOLDOBLIQUE>
	//  216  358:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  217  361:pop             
		BuiltinFonts14.put("Helvetica-Oblique", ((Object) (PdfName.HELVETICA_OBLIQUE)));
	//  218  362:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  219  365:ldc1            #90  <String "Helvetica-Oblique">
	//  220  367:getstatic       #231 <Field PdfName PdfName.HELVETICA_OBLIQUE>
	//  221  370:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  222  373:pop             
		BuiltinFonts14.put("Symbol", ((Object) (PdfName.SYMBOL)));
	//  223  374:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  224  377:ldc1            #122 <String "Symbol">
	//  225  379:getstatic       #233 <Field PdfName PdfName.SYMBOL>
	//  226  382:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  227  385:pop             
		BuiltinFonts14.put("Times-Roman", ((Object) (PdfName.TIMES_ROMAN)));
	//  228  386:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  229  389:ldc1            #134 <String "Times-Roman">
	//  230  391:getstatic       #235 <Field PdfName PdfName.TIMES_ROMAN>
	//  231  394:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  232  397:pop             
		BuiltinFonts14.put("Times-Bold", ((Object) (PdfName.TIMES_BOLD)));
	//  233  398:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  234  401:ldc1            #125 <String "Times-Bold">
	//  235  403:getstatic       #237 <Field PdfName PdfName.TIMES_BOLD>
	//  236  406:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  237  409:pop             
		BuiltinFonts14.put("Times-BoldItalic", ((Object) (PdfName.TIMES_BOLDITALIC)));
	//  238  410:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  239  413:ldc1            #128 <String "Times-BoldItalic">
	//  240  415:getstatic       #239 <Field PdfName PdfName.TIMES_BOLDITALIC>
	//  241  418:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  242  421:pop             
		BuiltinFonts14.put("Times-Italic", ((Object) (PdfName.TIMES_ITALIC)));
	//  243  422:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  244  425:ldc1            #131 <String "Times-Italic">
	//  245  427:getstatic       #241 <Field PdfName PdfName.TIMES_ITALIC>
	//  246  430:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  247  433:pop             
		BuiltinFonts14.put("ZapfDingbats", ((Object) (PdfName.ZAPFDINGBATS)));
	//  248  434:getstatic       #208 <Field HashMap BuiltinFonts14>
	//  249  437:ldc1            #146 <String "ZapfDingbats">
	//  250  439:getstatic       #243 <Field PdfName PdfName.ZAPFDINGBATS>
	//  251  442:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//  252  445:pop             
	//* 253  446:return          
	}
}
