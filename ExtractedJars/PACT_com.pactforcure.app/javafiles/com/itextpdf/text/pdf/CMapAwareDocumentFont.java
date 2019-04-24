// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Utilities;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.fonts.cmaps.CMapByteCid;
import com.itextpdf.text.pdf.fonts.cmaps.CMapCache;
import com.itextpdf.text.pdf.fonts.cmaps.CMapCidUni;
import com.itextpdf.text.pdf.fonts.cmaps.CMapParserEx;
import com.itextpdf.text.pdf.fonts.cmaps.CMapSequence;
import com.itextpdf.text.pdf.fonts.cmaps.CMapToUnicode;
import com.itextpdf.text.pdf.fonts.cmaps.CidLocationFromByte;
import com.itextpdf.text.pdf.fonts.cmaps.IdentityToUnicode;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			DocumentFont, PdfReader, PdfDictionary, PdfName, 
//			PRStream, PdfArray, PdfString, IntHashtable, 
//			PRIndirectReference

public class CMapAwareDocumentFont extends DocumentFont
{

	public CMapAwareDocumentFont(PRIndirectReference prindirectreference)
	{
		super(prindirectreference);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void DocumentFont(PRIndirectReference)>
		fontDic = (PdfDictionary)PdfReader.getPdfObjectRelease(((PdfObject) (prindirectreference)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #29  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    6   10:checkcast       #31  <Class PdfDictionary>
	//    7   13:putfield        #33  <Field PdfDictionary fontDic>
		initFont();
	//    8   16:aload_0         
	//    9   17:invokespecial   #37  <Method void initFont()>
	//   10   20:return          
	}

	public CMapAwareDocumentFont(PdfDictionary pdfdictionary)
	{
		super(pdfdictionary);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void DocumentFont(PdfDictionary)>
		fontDic = pdfdictionary;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #33  <Field PdfDictionary fontDic>
		initFont();
	//    6   10:aload_0         
	//    7   11:invokespecial   #37  <Method void initFont()>
	//    8   14:return          
	}

	private int computeAverageWidth()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		for(int i = 0; i < super.widths.length;)
	//*   4    4:iconst_0        
	//*   5    5:istore_1        
	//*   6    6:iload_1         
	//*   7    7:aload_0         
	//*   8    8:getfield        #47  <Field int[] DocumentFont.widths>
	//*   9   11:arraylength     
	//*  10   12:icmpge          58
		{
			int i1 = j;
	//   11   15:iload_2         
	//   12   16:istore          5
			int l = k;
	//   13   18:iload_3         
	//   14   19:istore          4
			if(super.widths[i] != 0)
	//*  15   21:aload_0         
	//*  16   22:getfield        #47  <Field int[] DocumentFont.widths>
	//*  17   25:iload_1         
	//*  18   26:iaload          
	//*  19   27:ifeq            45
			{
				l = k + super.widths[i];
	//   20   30:iload_3         
	//   21   31:aload_0         
	//   22   32:getfield        #47  <Field int[] DocumentFont.widths>
	//   23   35:iload_1         
	//   24   36:iaload          
	//   25   37:iadd            
	//   26   38:istore          4
				i1 = j + 1;
	//   27   40:iload_2         
	//   28   41:iconst_1        
	//   29   42:iadd            
	//   30   43:istore          5
			}
			i++;
	//   31   45:iload_1         
	//   32   46:iconst_1        
	//   33   47:iadd            
	//   34   48:istore_1        
			j = i1;
	//   35   49:iload           5
	//   36   51:istore_2        
			k = l;
	//   37   52:iload           4
	//   38   54:istore_3        
		}

	//*  39   55:goto            6
		if(j != 0)
	//*  40   58:iload_2         
	//*  41   59:ifeq            66
			return k / j;
	//   42   62:iload_3         
	//   43   63:iload_2         
	//   44   64:idiv            
	//   45   65:ireturn         
		else
			return 0;
	//   46   66:iconst_0        
	//   47   67:ireturn         
	}

	private String decodeSingleCID(byte abyte0[], int i, int j)
	{
		if(toUnicodeCmap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field CMapToUnicode toUnicodeCmap>
	//*   2    4:ifnull          65
		{
			if(i + j > abyte0.length)
	//*   3    7:iload_2         
	//*   4    8:iload_3         
	//*   5    9:iadd            
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:icmple          31
				throw new ArrayIndexOutOfBoundsException(MessageLocalization.getComposedMessage("invalid.index.1", i + j));
	//    9   15:new             #53  <Class ArrayIndexOutOfBoundsException>
	//   10   18:dup             
	//   11   19:ldc1            #55  <String "invalid.index.1">
	//   12   21:iload_2         
	//   13   22:iload_3         
	//   14   23:iadd            
	//   15   24:invokestatic    #61  <Method String MessageLocalization.getComposedMessage(String, int)>
	//   16   27:invokespecial   #64  <Method void ArrayIndexOutOfBoundsException(String)>
	//   17   30:athrow          
			String s = toUnicodeCmap.lookup(abyte0, i, j);
	//   18   31:aload_0         
	//   19   32:getfield        #51  <Field CMapToUnicode toUnicodeCmap>
	//   20   35:aload_1         
	//   21   36:iload_2         
	//   22   37:iload_3         
	//   23   38:invokevirtual   #69  <Method String CMapToUnicode.lookup(byte[], int, int)>
	//   24   41:astore          4
			if(s != null)
	//*  25   43:aload           4
	//*  26   45:ifnull          51
				return s;
	//   27   48:aload           4
	//   28   50:areturn         
			if(j != 1 || cidbyte2uni == null)
	//*  29   51:iload_3         
	//*  30   52:iconst_1        
	//*  31   53:icmpne          63
	//*  32   56:aload_0         
	//*  33   57:getfield        #71  <Field char[] cidbyte2uni>
	//*  34   60:ifnonnull       65
				return null;
	//   35   63:aconst_null     
	//   36   64:areturn         
		}
		if(j == 1)
	//*  37   65:iload_3         
	//*  38   66:iconst_1        
	//*  39   67:icmpne          100
		{
			if(cidbyte2uni == null)
	//*  40   70:aload_0         
	//*  41   71:getfield        #71  <Field char[] cidbyte2uni>
	//*  42   74:ifnonnull       80
				return "";
	//   43   77:ldc1            #73  <String "">
	//   44   79:areturn         
			else
				return new String(cidbyte2uni, abyte0[i] & 0xff, 1);
	//   45   80:new             #75  <Class String>
	//   46   83:dup             
	//   47   84:aload_0         
	//   48   85:getfield        #71  <Field char[] cidbyte2uni>
	//   49   88:aload_1         
	//   50   89:iload_2         
	//   51   90:baload          
	//   52   91:sipush          255
	//   53   94:iand            
	//   54   95:iconst_1        
	//   55   96:invokespecial   #78  <Method void String(char[], int, int)>
	//   56   99:areturn         
		} else
		{
			throw new Error("Multi-byte glyphs not implemented yet");
	//   57  100:new             #80  <Class Error>
	//   58  103:dup             
	//   59  104:ldc1            #82  <String "Multi-byte glyphs not implemented yet">
	//   60  106:invokespecial   #83  <Method void Error(String)>
	//   61  109:athrow          
		}
	}

	private void initFont()
	{
		processToUnicode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void processToUnicode()>
		try
		{
			processUni2Byte();
	//    2    4:aload_0         
	//    3    5:invokespecial   #91  <Method void processUni2Byte()>
			spaceWidth = super.getWidth(32);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:bipush          32
	//    7   12:invokespecial   #95  <Method int DocumentFont.getWidth(int)>
	//    8   15:putfield        #97  <Field int spaceWidth>
			if(spaceWidth == 0)
	//*   9   18:aload_0         
	//*  10   19:getfield        #97  <Field int spaceWidth>
	//*  11   22:ifne            33
				spaceWidth = computeAverageWidth();
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:invokespecial   #99  <Method int computeAverageWidth()>
	//   15   30:putfield        #97  <Field int spaceWidth>
			if(cjkEncoding != null)
	//*  16   33:aload_0         
	//*  17   34:getfield        #103 <Field String cjkEncoding>
	//*  18   37:ifnull          62
			{
				byteCid = CMapCache.getCachedCMapByteCid(cjkEncoding);
	//   19   40:aload_0         
	//   20   41:aload_0         
	//   21   42:getfield        #103 <Field String cjkEncoding>
	//   22   45:invokestatic    #109 <Method CMapByteCid CMapCache.getCachedCMapByteCid(String)>
	//   23   48:putfield        #111 <Field CMapByteCid byteCid>
				cidUni = CMapCache.getCachedCMapCidUni(uniMap);
	//   24   51:aload_0         
	//   25   52:aload_0         
	//   26   53:getfield        #114 <Field String uniMap>
	//   27   56:invokestatic    #118 <Method CMapCidUni CMapCache.getCachedCMapCidUni(String)>
	//   28   59:putfield        #120 <Field CMapCidUni cidUni>
			}
			return;
	//   29   62:return          
		}
		catch(Exception exception)
	//*  30   63:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   31   64:new             #122 <Class ExceptionConverter>
	//   32   67:dup             
	//   33   68:aload_1         
	//   34   69:invokespecial   #125 <Method void ExceptionConverter(Exception)>
	//   35   72:athrow          
		}
	}

	private void processToUnicode()
	{
		Object obj = ((Object) (PdfReader.getPdfObjectRelease(fontDic.get(PdfName.TOUNICODE))));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field PdfDictionary fontDic>
	//    2    4:getstatic       #133 <Field PdfName PdfName.TOUNICODE>
	//    3    7:invokevirtual   #137 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:invokestatic    #29  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    5   13:astore_1        
		if(!(obj instanceof PRStream)) goto _L2; else goto _L1
	//    6   14:aload_1         
	//    7   15:instanceof      #139 <Class PRStream>
	//    8   18:ifeq            81
_L1:
		obj = ((Object) (new CidLocationFromByte(PdfReader.getStreamBytes((PRStream)obj))));
	//    9   21:new             #141 <Class CidLocationFromByte>
	//   10   24:dup             
	//   11   25:aload_1         
	//   12   26:checkcast       #139 <Class PRStream>
	//   13   29:invokestatic    #145 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   14   32:invokespecial   #148 <Method void CidLocationFromByte(byte[])>
	//   15   35:astore_1        
		toUnicodeCmap = new CMapToUnicode();
	//   16   36:aload_0         
	//   17   37:new             #66  <Class CMapToUnicode>
	//   18   40:dup             
	//   19   41:invokespecial   #150 <Method void CMapToUnicode()>
	//   20   44:putfield        #51  <Field CMapToUnicode toUnicodeCmap>
		CMapParserEx.parseCid("", ((com.itextpdf.text.pdf.fonts.cmaps.AbstractCMap) (toUnicodeCmap)), ((com.itextpdf.text.pdf.fonts.cmaps.CidLocation) (obj)));
	//   21   47:ldc1            #73  <String "">
	//   22   49:aload_0         
	//   23   50:getfield        #51  <Field CMapToUnicode toUnicodeCmap>
	//   24   53:aload_1         
	//   25   54:invokestatic    #156 <Method void CMapParserEx.parseCid(String, com.itextpdf.text.pdf.fonts.cmaps.AbstractCMap, com.itextpdf.text.pdf.fonts.cmaps.CidLocation)>
		uni2cid = toUnicodeCmap.createReverseMapping();
	//   26   57:aload_0         
	//   27   58:aload_0         
	//   28   59:getfield        #51  <Field CMapToUnicode toUnicodeCmap>
	//   29   62:invokevirtual   #160 <Method Map CMapToUnicode.createReverseMapping()>
	//   30   65:putfield        #162 <Field Map uni2cid>
_L4:
		return;
	//   31   68:return          
		IOException ioexception;
		ioexception;
	//   32   69:astore_1        
		toUnicodeCmap = null;
	//   33   70:aload_0         
	//   34   71:aconst_null     
	//   35   72:putfield        #51  <Field CMapToUnicode toUnicodeCmap>
		uni2cid = null;
	//   36   75:aload_0         
	//   37   76:aconst_null     
	//   38   77:putfield        #162 <Field Map uni2cid>
		return;
	//   39   80:return          
_L2:
		if(!isType0) goto _L4; else goto _L3
	//   40   81:aload_0         
	//   41   82:getfield        #166 <Field boolean isType0>
	//   42   85:ifeq            68
_L3:
		ioexception = ((IOException) (fontDic.getAsName(PdfName.ENCODING)));
	//   43   88:aload_0         
	//   44   89:getfield        #33  <Field PdfDictionary fontDic>
	//   45   92:getstatic       #169 <Field PdfName PdfName.ENCODING>
	//   46   95:invokevirtual   #173 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   47   98:astore_1        
		if(ioexception == null) goto _L4; else goto _L5
	//   48   99:aload_1         
	//   49  100:ifnull          68
_L5:
		if(!PdfName.decodeName(((PdfName) (ioexception)).toString()).equals("Identity-H")) goto _L4; else goto _L6
	//   50  103:aload_1         
	//   51  104:invokevirtual   #177 <Method String PdfName.toString()>
	//   52  107:invokestatic    #181 <Method String PdfName.decodeName(String)>
	//   53  110:ldc1            #183 <String "Identity-H">
	//   54  112:invokevirtual   #187 <Method boolean String.equals(Object)>
	//   55  115:ifeq            68
_L6:
		ioexception = ((IOException) (((PdfDictionary)PdfReader.getPdfObjectRelease(((PdfArray)PdfReader.getPdfObjectRelease(fontDic.get(PdfName.DESCENDANTFONTS))).getPdfObject(0))).getAsDict(PdfName.CIDSYSTEMINFO)));
	//   56  118:aload_0         
	//   57  119:getfield        #33  <Field PdfDictionary fontDic>
	//   58  122:getstatic       #190 <Field PdfName PdfName.DESCENDANTFONTS>
	//   59  125:invokevirtual   #137 <Method PdfObject PdfDictionary.get(PdfName)>
	//   60  128:invokestatic    #29  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   61  131:checkcast       #192 <Class PdfArray>
	//   62  134:iconst_0        
	//   63  135:invokevirtual   #196 <Method PdfObject PdfArray.getPdfObject(int)>
	//   64  138:invokestatic    #29  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   65  141:checkcast       #31  <Class PdfDictionary>
	//   66  144:getstatic       #199 <Field PdfName PdfName.CIDSYSTEMINFO>
	//   67  147:invokevirtual   #203 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   68  150:astore_1        
		if(ioexception == null) goto _L4; else goto _L7
	//   69  151:aload_1         
	//   70  152:ifnull          68
_L7:
		ioexception = ((IOException) (((PdfDictionary) (ioexception)).getAsString(PdfName.ORDERING)));
	//   71  155:aload_1         
	//   72  156:getstatic       #206 <Field PdfName PdfName.ORDERING>
	//   73  159:invokevirtual   #210 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   74  162:astore_1        
		if(ioexception == null) goto _L4; else goto _L8
	//   75  163:aload_1         
	//   76  164:ifnull          68
_L8:
		ioexception = ((IOException) (IdentityToUnicode.GetMapFromOrdering(((PdfString) (ioexception)).toUnicodeString())));
	//   77  167:aload_1         
	//   78  168:invokevirtual   #215 <Method String PdfString.toUnicodeString()>
	//   79  171:invokestatic    #221 <Method CMapToUnicode IdentityToUnicode.GetMapFromOrdering(String)>
	//   80  174:astore_1        
		if(ioexception != null)
	//*  81  175:aload_1         
	//*  82  176:ifnull          68
		{
			try
			{
				toUnicodeCmap = ((CMapToUnicode) (ioexception));
	//   83  179:aload_0         
	//   84  180:aload_1         
	//   85  181:putfield        #51  <Field CMapToUnicode toUnicodeCmap>
				uni2cid = toUnicodeCmap.createReverseMapping();
	//   86  184:aload_0         
	//   87  185:aload_0         
	//   88  186:getfield        #51  <Field CMapToUnicode toUnicodeCmap>
	//   89  189:invokevirtual   #160 <Method Map CMapToUnicode.createReverseMapping()>
	//   90  192:putfield        #162 <Field Map uni2cid>
				return;
	//   91  195:return          
			}
			catch(IOException ioexception1)
	//*  92  196:astore_1        
			{
				toUnicodeCmap = null;
	//   93  197:aload_0         
	//   94  198:aconst_null     
	//   95  199:putfield        #51  <Field CMapToUnicode toUnicodeCmap>
			}
			uni2cid = null;
	//   96  202:aload_0         
	//   97  203:aconst_null     
	//   98  204:putfield        #162 <Field Map uni2cid>
			return;
	//   99  207:return          
		}
		  goto _L4
	}

	private void processUni2Byte()
		throws IOException
	{
		Object obj;
		int ai[];
		obj = ((Object) (getByte2Uni()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method IntHashtable getByte2Uni()>
	//    2    4:astore_3        
		ai = ((IntHashtable) (obj)).toOrderedKeys();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #231 <Method int[] IntHashtable.toOrderedKeys()>
	//    5    9:astore          4
		if(ai.length != 0) goto _L2; else goto _L1
	//    6   11:aload           4
	//    7   13:arraylength     
	//    8   14:ifne            18
_L1:
		return;
	//    9   17:return          
_L2:
		cidbyte2uni = new char[256];
	//   10   18:aload_0         
	//   11   19:sipush          256
	//   12   22:newarray        char[]
	//   13   24:putfield        #71  <Field char[] cidbyte2uni>
		for(int i = 0; i < ai.length; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_1        
	//*  16   29:iload_1         
	//*  17   30:aload           4
	//*  18   32:arraylength     
	//*  19   33:icmpge          60
		{
			int k = ai[i];
	//   20   36:aload           4
	//   21   38:iload_1         
	//   22   39:iaload          
	//   23   40:istore_2        
			cidbyte2uni[k] = (char)((IntHashtable) (obj)).get(k);
	//   24   41:aload_0         
	//   25   42:getfield        #71  <Field char[] cidbyte2uni>
	//   26   45:iload_2         
	//   27   46:aload_3         
	//   28   47:iload_2         
	//   29   48:invokevirtual   #233 <Method int IntHashtable.get(int)>
	//   30   51:int2char        
	//   31   52:castore         
		}

	//   32   53:iload_1         
	//   33   54:iconst_1        
	//   34   55:iadd            
	//   35   56:istore_1        
	//*  36   57:goto            29
		if(toUnicodeCmap != null)
	//*  37   60:aload_0         
	//*  38   61:getfield        #51  <Field CMapToUnicode toUnicodeCmap>
	//*  39   64:ifnull          159
		{
			obj = ((Object) (toUnicodeCmap.createDirectMapping().entrySet().iterator()));
	//   40   67:aload_0         
	//   41   68:getfield        #51  <Field CMapToUnicode toUnicodeCmap>
	//   42   71:invokevirtual   #236 <Method Map CMapToUnicode.createDirectMapping()>
	//   43   74:invokeinterface #242 <Method Set Map.entrySet()>
	//   44   79:invokeinterface #248 <Method Iterator Set.iterator()>
	//   45   84:astore_3        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   46   85:aload_3         
	//   47   86:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//   48   91:ifeq            159
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   49   94:aload_3         
	//   50   95:invokeinterface #258 <Method Object Iterator.next()>
	//   51  100:checkcast       #260 <Class java.util.Map$Entry>
	//   52  103:astore          4
				if(((Integer)entry.getKey()).intValue() < 256)
	//*  53  105:aload           4
	//*  54  107:invokeinterface #263 <Method Object java.util.Map$Entry.getKey()>
	//*  55  112:checkcast       #265 <Class Integer>
	//*  56  115:invokevirtual   #268 <Method int Integer.intValue()>
	//*  57  118:sipush          256
	//*  58  121:icmpge          85
					cidbyte2uni[((Integer)entry.getKey()).intValue()] = (char)((Integer)entry.getValue()).intValue();
	//   59  124:aload_0         
	//   60  125:getfield        #71  <Field char[] cidbyte2uni>
	//   61  128:aload           4
	//   62  130:invokeinterface #263 <Method Object java.util.Map$Entry.getKey()>
	//   63  135:checkcast       #265 <Class Integer>
	//   64  138:invokevirtual   #268 <Method int Integer.intValue()>
	//   65  141:aload           4
	//   66  143:invokeinterface #271 <Method Object java.util.Map$Entry.getValue()>
	//   67  148:checkcast       #265 <Class Integer>
	//   68  151:invokevirtual   #268 <Method int Integer.intValue()>
	//   69  154:int2char        
	//   70  155:castore         
			} while(true);
	//   71  156:goto            85
		}
		obj = ((Object) (getDiffmap()));
	//   72  159:aload_0         
	//   73  160:invokevirtual   #274 <Method IntHashtable getDiffmap()>
	//   74  163:astore_3        
		if(obj != null)
	//*  75  164:aload_3         
	//*  76  165:ifnull          17
		{
			int ai1[] = ((IntHashtable) (obj)).toOrderedKeys();
	//   77  168:aload_3         
	//   78  169:invokevirtual   #231 <Method int[] IntHashtable.toOrderedKeys()>
	//   79  172:astore          4
			int j = 0;
	//   80  174:iconst_0        
	//   81  175:istore_1        
			while(j < ai1.length) 
	//*  82  176:iload_1         
	//*  83  177:aload           4
	//*  84  179:arraylength     
	//*  85  180:icmpge          17
			{
				int l = ((IntHashtable) (obj)).get(ai1[j]);
	//   86  183:aload_3         
	//   87  184:aload           4
	//   88  186:iload_1         
	//   89  187:iaload          
	//   90  188:invokevirtual   #233 <Method int IntHashtable.get(int)>
	//   91  191:istore_2        
				if(l < 256)
	//*  92  192:iload_2         
	//*  93  193:sipush          256
	//*  94  196:icmpge          210
					cidbyte2uni[l] = (char)ai1[j];
	//   95  199:aload_0         
	//   96  200:getfield        #71  <Field char[] cidbyte2uni>
	//   97  203:iload_2         
	//   98  204:aload           4
	//   99  206:iload_1         
	//  100  207:iaload          
	//  101  208:int2char        
	//  102  209:castore         
				j++;
	//  103  210:iload_1         
	//  104  211:iconst_1        
	//  105  212:iadd            
	//  106  213:istore_1        
			}
		}
		if(true) goto _L1; else goto _L3
	//  107  214:goto            176
_L3:
	}

	public String decode(byte abyte0[], int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #278 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #279 <Method void StringBuilder()>
	//    3    7:astore          8
		if(toUnicodeCmap == null && byteCid != null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #51  <Field CMapToUnicode toUnicodeCmap>
	//*   6   13:ifnonnull       87
	//*   7   16:aload_0         
	//*   8   17:getfield        #111 <Field CMapByteCid byteCid>
	//*   9   20:ifnull          87
		{
			abyte0 = ((byte []) (new CMapSequence(abyte0, i, j)));
	//   10   23:new             #281 <Class CMapSequence>
	//   11   26:dup             
	//   12   27:aload_1         
	//   13   28:iload_2         
	//   14   29:iload_3         
	//   15   30:invokespecial   #284 <Method void CMapSequence(byte[], int, int)>
	//   16   33:astore_1        
			abyte0 = ((byte []) (byteCid.decodeSequence(((CMapSequence) (abyte0)))));
	//   17   34:aload_0         
	//   18   35:getfield        #111 <Field CMapByteCid byteCid>
	//   19   38:aload_1         
	//   20   39:invokevirtual   #290 <Method String CMapByteCid.decodeSequence(CMapSequence)>
	//   21   42:astore_1        
			for(i = 0; i < ((String) (abyte0)).length(); i++)
	//*  22   43:iconst_0        
	//*  23   44:istore_2        
	//*  24   45:iload_2         
	//*  25   46:aload_1         
	//*  26   47:invokevirtual   #293 <Method int String.length()>
	//*  27   50:icmpge          177
			{
				j = cidUni.lookup(((int) (((String) (abyte0)).charAt(i))));
	//   28   53:aload_0         
	//   29   54:getfield        #120 <Field CMapCidUni cidUni>
	//   30   57:aload_1         
	//   31   58:iload_2         
	//   32   59:invokevirtual   #297 <Method char String.charAt(int)>
	//   33   62:invokevirtual   #301 <Method int CMapCidUni.lookup(int)>
	//   34   65:istore_3        
				if(j > 0)
	//*  35   66:iload_3         
	//*  36   67:ifle            80
					stringbuilder.append(Utilities.convertFromUtf32(j));
	//   37   70:aload           8
	//   38   72:iload_3         
	//   39   73:invokestatic    #307 <Method String Utilities.convertFromUtf32(int)>
	//   40   76:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
			}

	//   42   80:iload_2         
	//   43   81:iconst_1        
	//   44   82:iadd            
	//   45   83:istore_2        
		} else
	//*  46   84:goto            45
		{
			int l;
			for(int k = i; k < i + j; k = l + 1)
	//*  47   87:iload_2         
	//*  48   88:istore          4
	//*  49   90:iload           4
	//*  50   92:iload_2         
	//*  51   93:iload_3         
	//*  52   94:iadd            
	//*  53   95:icmpge          177
			{
				String s1 = decodeSingleCID(abyte0, k, 1);
	//   54   98:aload_0         
	//   55   99:aload_1         
	//   56  100:iload           4
	//   57  102:iconst_1        
	//   58  103:invokespecial   #313 <Method String decodeSingleCID(byte[], int, int)>
	//   59  106:astore          7
				l = k;
	//   60  108:iload           4
	//   61  110:istore          5
				String s = s1;
	//   62  112:aload           7
	//   63  114:astore          6
				if(s1 == null)
	//*  64  116:aload           7
	//*  65  118:ifnonnull       155
				{
					l = k;
	//   66  121:iload           4
	//   67  123:istore          5
					s = s1;
	//   68  125:aload           7
	//   69  127:astore          6
					if(k < (i + j) - 1)
	//*  70  129:iload           4
	//*  71  131:iload_2         
	//*  72  132:iload_3         
	//*  73  133:iadd            
	//*  74  134:iconst_1        
	//*  75  135:isub            
	//*  76  136:icmpge          155
					{
						s = decodeSingleCID(abyte0, k, 2);
	//   77  139:aload_0         
	//   78  140:aload_1         
	//   79  141:iload           4
	//   80  143:iconst_2        
	//   81  144:invokespecial   #313 <Method String decodeSingleCID(byte[], int, int)>
	//   82  147:astore          6
						l = k + 1;
	//   83  149:iload           4
	//   84  151:iconst_1        
	//   85  152:iadd            
	//   86  153:istore          5
					}
				}
				if(s != null)
	//*  87  155:aload           6
	//*  88  157:ifnull          168
					stringbuilder.append(s);
	//   89  160:aload           8
	//   90  162:aload           6
	//   91  164:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   92  167:pop             
			}

	//   93  168:iload           5
	//   94  170:iconst_1        
	//   95  171:iadd            
	//   96  172:istore          4
		}
	//*  97  174:goto            90
		return stringbuilder.toString();
	//   98  177:aload           8
	//   99  179:invokevirtual   #314 <Method String StringBuilder.toString()>
	//  100  182:areturn         
	}

	public String encode(byte abyte0[], int i, int j)
	{
		return decode(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #317 <Method String decode(byte[], int, int)>
	//    5    7:areturn         
	}

	public int getWidth(int i)
	{
		if(i == 32)
	//*   0    0:iload_1         
	//*   1    1:bipush          32
	//*   2    3:icmpne          23
		{
			if(spaceWidth != 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #97  <Field int spaceWidth>
	//*   5   10:ifeq            18
				return spaceWidth;
	//    6   13:aload_0         
	//    7   14:getfield        #97  <Field int spaceWidth>
	//    8   17:ireturn         
			else
				return defaultWidth;
	//    9   18:aload_0         
	//   10   19:getfield        #320 <Field int defaultWidth>
	//   11   22:ireturn         
		} else
		{
			return super.getWidth(i);
	//   12   23:aload_0         
	//   13   24:iload_1         
	//   14   25:invokespecial   #95  <Method int DocumentFont.getWidth(int)>
	//   15   28:ireturn         
		}
	}

	private CMapByteCid byteCid;
	private CMapCidUni cidUni;
	private char cidbyte2uni[];
	private PdfDictionary fontDic;
	private int spaceWidth;
	private CMapToUnicode toUnicodeCmap;
	private Map uni2cid;
}
