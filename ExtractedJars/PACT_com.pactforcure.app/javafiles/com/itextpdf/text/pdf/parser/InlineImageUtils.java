// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.exceptions.UnsupportedPdfException;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			InlineImageInfo

public final class InlineImageUtils
{
	public static class InlineImageParseException extends IOException
	{

		private static final long serialVersionUID = 0xeb31af04L;

		public InlineImageParseException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void IOException(String)>
		//    3    5:return          
		}
	}


	private InlineImageUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method void Object()>
	//    2    4:return          
	}

	private static int computeBytesPerRow(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1)
	{
		PdfNumber pdfnumber = pdfdictionary.getAsNumber(PdfName.WIDTH);
	//    0    0:aload_0         
	//    1    1:getstatic       #76  <Field PdfName PdfName.WIDTH>
	//    2    4:invokevirtual   #164 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//    3    7:astore          5
		PdfNumber pdfnumber1 = pdfdictionary.getAsNumber(PdfName.BITSPERCOMPONENT);
	//    4    9:aload_0         
	//    5   10:getstatic       #43  <Field PdfName PdfName.BITSPERCOMPONENT>
	//    6   13:invokevirtual   #164 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//    7   16:astore          6
		int j = getComponentsPerPixel(pdfdictionary.getAsName(PdfName.COLORSPACE), pdfdictionary1);
	//    8   18:aload_0         
	//    9   19:getstatic       #52  <Field PdfName PdfName.COLORSPACE>
	//   10   22:invokevirtual   #168 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   11   25:aload_1         
	//   12   26:invokestatic    #172 <Method int getComponentsPerPixel(PdfName, PdfDictionary)>
	//   13   29:istore_3        
		int k = pdfnumber.intValue();
	//   14   30:aload           5
	//   15   32:invokevirtual   #178 <Method int PdfNumber.intValue()>
	//   16   35:istore          4
		int i;
		if(pdfnumber1 != null)
	//*  17   37:aload           6
	//*  18   39:ifnull          61
			i = pdfnumber1.intValue();
	//   19   42:aload           6
	//   20   44:invokevirtual   #178 <Method int PdfNumber.intValue()>
	//   21   47:istore_2        
		else
	//*  22   48:iload           4
	//*  23   50:iload_2         
	//*  24   51:imul            
	//*  25   52:iload_3         
	//*  26   53:imul            
	//*  27   54:bipush          7
	//*  28   56:iadd            
	//*  29   57:bipush          8
	//*  30   59:idiv            
	//*  31   60:ireturn         
			i = 1;
	//   32   61:iconst_1        
	//   33   62:istore_2        
		return (k * i * j + 7) / 8;
	//*  34   63:goto            48
	}

	private static PdfObject getAlternateValue(PdfName pdfname, PdfObject pdfobject)
	{
		if(pdfname != PdfName.FILTER) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getstatic       #61  <Field PdfName PdfName.FILTER>
	//    2    4:if_acmpne       91
_L1:
		if(!(pdfobject instanceof PdfName)) goto _L4; else goto _L3
	//    3    7:aload_1         
	//    4    8:instanceof      #39  <Class PdfName>
	//    5   11:ifeq            33
_L3:
		pdfname = (PdfName)inlineImageFilterAbbreviationMap.get(((Object) (pdfobject)));
	//    6   14:getstatic       #119 <Field Map inlineImageFilterAbbreviationMap>
	//    7   17:aload_1         
	//    8   18:invokeinterface #184 <Method Object Map.get(Object)>
	//    9   23:checkcast       #39  <Class PdfName>
	//   10   26:astore_0        
		if(pdfname == null) goto _L6; else goto _L5
	//   11   27:aload_0         
	//   12   28:ifnull          120
_L5:
		return ((PdfObject) (pdfname));
	//   13   31:aload_0         
	//   14   32:areturn         
_L4:
		if(pdfobject instanceof PdfArray)
	//*  15   33:aload_1         
	//*  16   34:instanceof      #186 <Class PdfArray>
	//*  17   37:ifeq            120
		{
			pdfobject = ((PdfObject) ((PdfArray)pdfobject));
	//   18   40:aload_1         
	//   19   41:checkcast       #186 <Class PdfArray>
	//   20   44:astore_1        
			PdfArray pdfarray = new PdfArray();
	//   21   45:new             #186 <Class PdfArray>
	//   22   48:dup             
	//   23   49:invokespecial   #187 <Method void PdfArray()>
	//   24   52:astore          4
			int j = ((PdfArray) (pdfobject)).size();
	//   25   54:aload_1         
	//   26   55:invokevirtual   #190 <Method int PdfArray.size()>
	//   27   58:istore_3        
			for(int i = 0; i < j; i++)
	//*  28   59:iconst_0        
	//*  29   60:istore_2        
	//*  30   61:iload_2         
	//*  31   62:iload_3         
	//*  32   63:icmpge          88
				pdfarray.add(getAlternateValue(pdfname, ((PdfArray) (pdfobject)).getPdfObject(i)));
	//   33   66:aload           4
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:iload_2         
	//   37   71:invokevirtual   #194 <Method PdfObject PdfArray.getPdfObject(int)>
	//   38   74:invokestatic    #196 <Method PdfObject getAlternateValue(PdfName, PdfObject)>
	//   39   77:invokevirtual   #200 <Method boolean PdfArray.add(PdfObject)>
	//   40   80:pop             

	//   41   81:iload_2         
	//   42   82:iconst_1        
	//   43   83:iadd            
	//   44   84:istore_2        
	//*  45   85:goto            61
			return ((PdfObject) (pdfarray));
	//   46   88:aload           4
	//   47   90:areturn         
		}
		break; /* Loop/switch isn't completed */
_L2:
		PdfName pdfname1;
		if(pdfname != PdfName.COLORSPACE)
			break; /* Loop/switch isn't completed */
	//   48   91:aload_0         
	//   49   92:getstatic       #52  <Field PdfName PdfName.COLORSPACE>
	//   50   95:if_acmpne       120
		pdfname1 = (PdfName)inlineImageColorSpaceAbbreviationMap.get(((Object) (pdfobject)));
	//   51   98:getstatic       #99  <Field Map inlineImageColorSpaceAbbreviationMap>
	//   52  101:aload_1         
	//   53  102:invokeinterface #184 <Method Object Map.get(Object)>
	//   54  107:checkcast       #39  <Class PdfName>
	//   55  110:astore          4
		pdfname = pdfname1;
	//   56  112:aload           4
	//   57  114:astore_0        
		if(pdfname1 != null) goto _L5; else goto _L6
	//   58  115:aload           4
	//   59  117:ifnonnull       31
_L6:
		return pdfobject;
	//   60  120:aload_1         
	//   61  121:areturn         
	}

	private static int getComponentsPerPixel(PdfName pdfname, PdfDictionary pdfdictionary)
	{
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
_L2:
		return 1;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		if(pdfname == null || pdfname.equals(((Object) (PdfName.DEVICEGRAY)))) goto _L2; else goto _L1
	//    4    6:aload_0         
	//    5    7:getstatic       #104 <Field PdfName PdfName.DEVICEGRAY>
	//    6   10:invokevirtual   #204 <Method boolean PdfName.equals(Object)>
	//    7   13:ifne            4
_L1:
		PdfArray pdfarray;
		if(pdfname.equals(((Object) (PdfName.DEVICERGB))))
	//*   8   16:aload_0         
	//*   9   17:getstatic       #109 <Field PdfName PdfName.DEVICERGB>
	//*  10   20:invokevirtual   #204 <Method boolean PdfName.equals(Object)>
	//*  11   23:ifeq            28
			return 3;
	//   12   26:iconst_3        
	//   13   27:ireturn         
		if(pdfname.equals(((Object) (PdfName.DEVICECMYK))))
	//*  14   28:aload_0         
	//*  15   29:getstatic       #114 <Field PdfName PdfName.DEVICECMYK>
	//*  16   32:invokevirtual   #204 <Method boolean PdfName.equals(Object)>
	//*  17   35:ifeq            40
			return 4;
	//   18   38:iconst_4        
	//   19   39:ireturn         
		if(pdfdictionary == null)
			break; /* Loop/switch isn't completed */
	//   20   40:aload_1         
	//   21   41:ifnull          68
		pdfarray = pdfdictionary.getAsArray(pdfname);
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:invokevirtual   #208 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   25   49:astore_2        
		if(pdfarray == null) goto _L4; else goto _L3
	//   26   50:aload_2         
	//   27   51:ifnull          95
_L3:
		if(PdfName.INDEXED.equals(((Object) (pdfarray.getAsName(0))))) goto _L2; else goto _L5
	//   28   54:getstatic       #117 <Field PdfName PdfName.INDEXED>
	//   29   57:aload_2         
	//   30   58:iconst_0        
	//   31   59:invokevirtual   #211 <Method PdfName PdfArray.getAsName(int)>
	//   32   62:invokevirtual   #204 <Method boolean PdfName.equals(Object)>
	//   33   65:ifne            4
_L5:
		throw new IllegalArgumentException((new StringBuilder()).append("Unexpected color space ").append(((Object) (pdfname))).toString());
	//   34   68:new             #213 <Class IllegalArgumentException>
	//   35   71:dup             
	//   36   72:new             #215 <Class StringBuilder>
	//   37   75:dup             
	//   38   76:invokespecial   #216 <Method void StringBuilder()>
	//   39   79:ldc1            #218 <String "Unexpected color space ">
	//   40   81:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:aload_0         
	//   42   85:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   43   88:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   44   91:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//   45   94:athrow          
_L4:
		PdfName pdfname1 = pdfdictionary.getAsName(pdfname);
	//   46   95:aload_1         
	//   47   96:aload_0         
	//   48   97:invokevirtual   #168 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   49  100:astore_2        
		if(pdfname1 != null)
	//*  50  101:aload_2         
	//*  51  102:ifnull          68
			return getComponentsPerPixel(pdfname1, pdfdictionary);
	//   52  105:aload_2         
	//   53  106:aload_1         
	//   54  107:invokestatic    #172 <Method int getComponentsPerPixel(PdfName, PdfDictionary)>
	//   55  110:ireturn         
		if(true) goto _L5; else goto _L6
_L6:
	}

	private static boolean inlineImageStreamBytesAreComplete(byte abyte0[], PdfDictionary pdfdictionary)
	{
		try
		{
			PdfReader.decodeBytes(abyte0, pdfdictionary, FilterHandlers.getDefaultFilterHandlers());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #241 <Method Map FilterHandlers.getDefaultFilterHandlers()>
	//    3    5:invokestatic    #247 <Method byte[] PdfReader.decodeBytes(byte[], PdfDictionary, Map)>
	//    4    8:pop             
		}
	//*   5    9:iconst_1        
	//*   6   10:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   7   11:astore_0        
		{
			LOGGER.warn(((UnsupportedPdfException) (abyte0)).getMessage());
	//    8   12:getstatic       #30  <Field Logger LOGGER>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #250 <Method String UnsupportedPdfException.getMessage()>
	//   11   19:invokeinterface #255 <Method void Logger.warn(String)>
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  14   26:astore_0        
		{
			return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		}
		return true;
	}

	public static InlineImageInfo parseInlineImage(PdfContentParser pdfcontentparser, PdfDictionary pdfdictionary)
		throws IOException
	{
		PdfDictionary pdfdictionary1 = parseInlineImageDictionary(pdfcontentparser);
	//    0    0:aload_0         
	//    1    1:invokestatic    #261 <Method PdfDictionary parseInlineImageDictionary(PdfContentParser)>
	//    2    4:astore_2        
		return new InlineImageInfo(parseInlineImageSamples(pdfdictionary1, pdfdictionary, pdfcontentparser), pdfdictionary1);
	//    3    5:new             #263 <Class InlineImageInfo>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokestatic    #267 <Method byte[] parseInlineImageSamples(PdfDictionary, PdfDictionary, PdfContentParser)>
	//    9   15:aload_2         
	//   10   16:invokespecial   #270 <Method void InlineImageInfo(byte[], PdfDictionary)>
	//   11   19:areturn         
	}

	private static PdfDictionary parseInlineImageDictionary(PdfContentParser pdfcontentparser)
		throws IOException
	{
		PdfDictionary pdfdictionary = new PdfDictionary();
	//    0    0:new             #160 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #272 <Method void PdfDictionary()>
	//    3    7:astore          5
		for(PdfObject pdfobject = pdfcontentparser.readPRObject(); pdfobject != null && !"ID".equals(((Object) (pdfobject.toString()))); pdfobject = pdfcontentparser.readPRObject())
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #278 <Method PdfObject PdfContentParser.readPRObject()>
	//*   6   13:astore_2        
	//*   7   14:aload_2         
	//*   8   15:ifnull          84
	//*   9   18:ldc2            #280 <String "ID">
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #283 <Method String PdfObject.toString()>
	//*  12   25:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  13   28:ifne            84
		{
			PdfObject pdfobject1 = pdfcontentparser.readPRObject();
	//   14   31:aload_0         
	//   15   32:invokevirtual   #278 <Method PdfObject PdfContentParser.readPRObject()>
	//   16   35:astore          6
			PdfName pdfname1 = (PdfName)inlineImageEntryAbbreviationMap.get(((Object) (pdfobject)));
	//   17   37:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   18   40:aload_2         
	//   19   41:invokeinterface #184 <Method Object Map.get(Object)>
	//   20   46:checkcast       #39  <Class PdfName>
	//   21   49:astore          4
			PdfName pdfname = pdfname1;
	//   22   51:aload           4
	//   23   53:astore_3        
			if(pdfname1 == null)
	//*  24   54:aload           4
	//*  25   56:ifnonnull       64
				pdfname = (PdfName)pdfobject;
	//   26   59:aload_2         
	//   27   60:checkcast       #39  <Class PdfName>
	//   28   63:astore_3        
			pdfdictionary.put(pdfname, getAlternateValue(pdfname, pdfobject1));
	//   29   64:aload           5
	//   30   66:aload_3         
	//   31   67:aload_3         
	//   32   68:aload           6
	//   33   70:invokestatic    #196 <Method PdfObject getAlternateValue(PdfName, PdfObject)>
	//   34   73:invokevirtual   #289 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}

	//   35   76:aload_0         
	//   36   77:invokevirtual   #278 <Method PdfObject PdfContentParser.readPRObject()>
	//   37   80:astore_2        
	//*  38   81:goto            14
		int i = pdfcontentparser.getTokeniser().read();
	//   39   84:aload_0         
	//   40   85:invokevirtual   #293 <Method PRTokeniser PdfContentParser.getTokeniser()>
	//   41   88:invokevirtual   #298 <Method int PRTokeniser.read()>
	//   42   91:istore_1        
		if(!PRTokeniser.isWhitespace(i))
	//*  43   92:iload_1         
	//*  44   93:invokestatic    #302 <Method boolean PRTokeniser.isWhitespace(int)>
	//*  45   96:ifne            133
			throw new IOException((new StringBuilder()).append("Unexpected character ").append(i).append(" found after ID in inline image").toString());
	//   46   99:new             #235 <Class IOException>
	//   47  102:dup             
	//   48  103:new             #215 <Class StringBuilder>
	//   49  106:dup             
	//   50  107:invokespecial   #216 <Method void StringBuilder()>
	//   51  110:ldc2            #304 <String "Unexpected character ">
	//   52  113:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   53  116:iload_1         
	//   54  117:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//   55  120:ldc2            #309 <String " found after ID in inline image">
	//   56  123:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   57  126:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   58  129:invokespecial   #310 <Method void IOException(String)>
	//   59  132:athrow          
		else
			return pdfdictionary;
	//   60  133:aload           5
	//   61  135:areturn         
	}

	private static byte[] parseInlineImageSamples(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1, PdfContentParser pdfcontentparser)
		throws IOException
	{
		if(pdfdictionary.contains(PdfName.FILTER)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getstatic       #61  <Field PdfName PdfName.FILTER>
	//    2    4:invokevirtual   #314 <Method boolean PdfDictionary.contains(PdfName)>
	//    3    7:ifne            19
_L1:
		pdfdictionary1 = ((PdfDictionary) (parseUnfilteredSamples(pdfdictionary, pdfdictionary1, pdfcontentparser)));
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokestatic    #317 <Method byte[] parseUnfilteredSamples(PdfDictionary, PdfDictionary, PdfContentParser)>
	//    8   16:astore_1        
_L4:
		return ((byte []) (pdfdictionary1));
	//    9   17:aload_1         
	//   10   18:areturn         
_L2:
		int i;
		ByteArrayOutputStream bytearrayoutputstream;
		ByteArrayOutputStream bytearrayoutputstream1;
		PRTokeniser prtokeniser;
		bytearrayoutputstream = new ByteArrayOutputStream();
	//   11   19:new             #319 <Class ByteArrayOutputStream>
	//   12   22:dup             
	//   13   23:invokespecial   #320 <Method void ByteArrayOutputStream()>
	//   14   26:astore          5
		bytearrayoutputstream1 = new ByteArrayOutputStream();
	//   15   28:new             #319 <Class ByteArrayOutputStream>
	//   16   31:dup             
	//   17   32:invokespecial   #320 <Method void ByteArrayOutputStream()>
	//   18   35:astore          6
		i = 0;
	//   19   37:iconst_0        
	//   20   38:istore_3        
		prtokeniser = pdfcontentparser.getTokeniser();
	//   21   39:aload_2         
	//   22   40:invokevirtual   #293 <Method PRTokeniser PdfContentParser.getTokeniser()>
	//   23   43:astore          7
_L5:
		int j;
		do
		{
			j = prtokeniser.read();
	//   24   45:aload           7
	//   25   47:invokevirtual   #298 <Method int PRTokeniser.read()>
	//   26   50:istore          4
			if(j == -1)
				break MISSING_BLOCK_LABEL_257;
	//   27   52:iload           4
	//   28   54:iconst_m1       
	//   29   55:icmpeq          257
			if(i == 0 && PRTokeniser.isWhitespace(j))
	//*  30   58:iload_3         
	//*  31   59:ifne            84
	//*  32   62:iload           4
	//*  33   64:invokestatic    #302 <Method boolean PRTokeniser.isWhitespace(int)>
	//*  34   67:ifeq            84
			{
				i++;
	//   35   70:iload_3         
	//   36   71:iconst_1        
	//   37   72:iadd            
	//   38   73:istore_3        
				bytearrayoutputstream1.write(j);
	//   39   74:aload           6
	//   40   76:iload           4
	//   41   78:invokevirtual   #324 <Method void ByteArrayOutputStream.write(int)>
			} else
	//*  42   81:goto            45
			if(i == 1 && j == 69)
	//*  43   84:iload_3         
	//*  44   85:iconst_1        
	//*  45   86:icmpne          110
	//*  46   89:iload           4
	//*  47   91:bipush          69
	//*  48   93:icmpne          110
			{
				i++;
	//   49   96:iload_3         
	//   50   97:iconst_1        
	//   51   98:iadd            
	//   52   99:istore_3        
				bytearrayoutputstream1.write(j);
	//   53  100:aload           6
	//   54  102:iload           4
	//   55  104:invokevirtual   #324 <Method void ByteArrayOutputStream.write(int)>
			} else
	//*  56  107:goto            45
			if(i == 1 && PRTokeniser.isWhitespace(j))
	//*  57  110:iload_3         
	//*  58  111:iconst_1        
	//*  59  112:icmpne          148
	//*  60  115:iload           4
	//*  61  117:invokestatic    #302 <Method boolean PRTokeniser.isWhitespace(int)>
	//*  62  120:ifeq            148
			{
				bytearrayoutputstream.write(bytearrayoutputstream1.toByteArray());
	//   63  123:aload           5
	//   64  125:aload           6
	//   65  127:invokevirtual   #328 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   66  130:invokevirtual   #331 <Method void ByteArrayOutputStream.write(byte[])>
				bytearrayoutputstream1.reset();
	//   67  133:aload           6
	//   68  135:invokevirtual   #334 <Method void ByteArrayOutputStream.reset()>
				bytearrayoutputstream1.write(j);
	//   69  138:aload           6
	//   70  140:iload           4
	//   71  142:invokevirtual   #324 <Method void ByteArrayOutputStream.write(int)>
			} else
	//*  72  145:goto            45
			{
label0:
				{
					if(i != 2 || j != 73)
						break label0;
	//   73  148:iload_3         
	//   74  149:iconst_2        
	//   75  150:icmpne          174
	//   76  153:iload           4
	//   77  155:bipush          73
	//   78  157:icmpne          174
					i++;
	//   79  160:iload_3         
	//   80  161:iconst_1        
	//   81  162:iadd            
	//   82  163:istore_3        
					bytearrayoutputstream1.write(j);
	//   83  164:aload           6
	//   84  166:iload           4
	//   85  168:invokevirtual   #324 <Method void ByteArrayOutputStream.write(int)>
				}
			}
		} while(true);
	//   86  171:goto            45
		if(i != 3 || !PRTokeniser.isWhitespace(j))
			break MISSING_BLOCK_LABEL_230;
	//   87  174:iload_3         
	//   88  175:iconst_3        
	//   89  176:icmpne          230
	//   90  179:iload           4
	//   91  181:invokestatic    #302 <Method boolean PRTokeniser.isWhitespace(int)>
	//   92  184:ifeq            230
		pdfcontentparser = ((PdfContentParser) (bytearrayoutputstream.toByteArray()));
	//   93  187:aload           5
	//   94  189:invokevirtual   #328 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   95  192:astore_2        
		pdfdictionary1 = ((PdfDictionary) (pdfcontentparser));
	//   96  193:aload_2         
	//   97  194:astore_1        
		if(inlineImageStreamBytesAreComplete(((byte []) (pdfcontentparser)), pdfdictionary)) goto _L4; else goto _L3
	//   98  195:aload_2         
	//   99  196:aload_0         
	//  100  197:invokestatic    #336 <Method boolean inlineImageStreamBytesAreComplete(byte[], PdfDictionary)>
	//  101  200:ifne            17
_L3:
		bytearrayoutputstream.write(bytearrayoutputstream1.toByteArray());
	//  102  203:aload           5
	//  103  205:aload           6
	//  104  207:invokevirtual   #328 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  105  210:invokevirtual   #331 <Method void ByteArrayOutputStream.write(byte[])>
		bytearrayoutputstream1.reset();
	//  106  213:aload           6
	//  107  215:invokevirtual   #334 <Method void ByteArrayOutputStream.reset()>
		bytearrayoutputstream.write(j);
	//  108  218:aload           5
	//  109  220:iload           4
	//  110  222:invokevirtual   #324 <Method void ByteArrayOutputStream.write(int)>
		i = 0;
	//  111  225:iconst_0        
	//  112  226:istore_3        
		  goto _L5
	//* 113  227:goto            45
		bytearrayoutputstream.write(bytearrayoutputstream1.toByteArray());
	//  114  230:aload           5
	//  115  232:aload           6
	//  116  234:invokevirtual   #328 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  117  237:invokevirtual   #331 <Method void ByteArrayOutputStream.write(byte[])>
		bytearrayoutputstream1.reset();
	//  118  240:aload           6
	//  119  242:invokevirtual   #334 <Method void ByteArrayOutputStream.reset()>
		bytearrayoutputstream.write(j);
	//  120  245:aload           5
	//  121  247:iload           4
	//  122  249:invokevirtual   #324 <Method void ByteArrayOutputStream.write(int)>
		i = 0;
	//  123  252:iconst_0        
	//  124  253:istore_3        
		  goto _L5
	//* 125  254:goto            45
		throw new InlineImageParseException("Could not find image data or EI");
	//  126  257:new             #6   <Class InlineImageUtils$InlineImageParseException>
	//  127  260:dup             
	//  128  261:ldc2            #338 <String "Could not find image data or EI">
	//  129  264:invokespecial   #339 <Method void InlineImageUtils$InlineImageParseException(String)>
	//  130  267:athrow          
	}

	private static byte[] parseUnfilteredSamples(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1, PdfContentParser pdfcontentparser)
		throws IOException
	{
		if(pdfdictionary.contains(PdfName.FILTER))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #61  <Field PdfName PdfName.FILTER>
	//*   2    4:invokevirtual   #314 <Method boolean PdfDictionary.contains(PdfName)>
	//*   3    7:ifeq            21
			throw new IllegalArgumentException("Dictionary contains filters");
	//    4   10:new             #213 <Class IllegalArgumentException>
	//    5   13:dup             
	//    6   14:ldc2            #341 <String "Dictionary contains filters">
	//    7   17:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//    8   20:athrow          
		PdfNumber pdfnumber = pdfdictionary.getAsNumber(PdfName.HEIGHT);
	//    9   21:aload_0         
	//   10   22:getstatic       #64  <Field PdfName PdfName.HEIGHT>
	//   11   25:invokevirtual   #164 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   12   28:astore          6
		int j = computeBytesPerRow(pdfdictionary, pdfdictionary1) * pdfnumber.intValue();
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:invokestatic    #343 <Method int computeBytesPerRow(PdfDictionary, PdfDictionary)>
	//   16   35:aload           6
	//   17   37:invokevirtual   #178 <Method int PdfNumber.intValue()>
	//   18   40:imul            
	//   19   41:istore          4
		pdfdictionary = ((PdfDictionary) (new byte[j]));
	//   20   43:iload           4
	//   21   45:newarray        byte[]
	//   22   47:astore_0        
		pdfdictionary1 = ((PdfDictionary) (pdfcontentparser.getTokeniser()));
	//   23   48:aload_2         
	//   24   49:invokevirtual   #293 <Method PRTokeniser PdfContentParser.getTokeniser()>
	//   25   52:astore_1        
		int k = ((PRTokeniser) (pdfdictionary1)).read();
	//   26   53:aload_1         
	//   27   54:invokevirtual   #298 <Method int PRTokeniser.read()>
	//   28   57:istore          5
		int i = 0;
	//   29   59:iconst_0        
	//   30   60:istore_3        
		if(!PRTokeniser.isWhitespace(k) || k == 0)
	//*  31   61:iload           5
	//*  32   63:invokestatic    #302 <Method boolean PRTokeniser.isWhitespace(int)>
	//*  33   66:ifeq            74
	//*  34   69:iload           5
	//*  35   71:ifne            84
		{
			pdfdictionary[0] = (byte)k;
	//   36   74:aload_0         
	//   37   75:iconst_0        
	//   38   76:iload           5
	//   39   78:int2byte        
	//   40   79:bastore         
			i = 0 + 1;
	//   41   80:iconst_0        
	//   42   81:iconst_1        
	//   43   82:iadd            
	//   44   83:istore_3        
		}
		for(; i < j; i++)
	//*  45   84:iload_3         
	//*  46   85:iload           4
	//*  47   87:icmpge          126
		{
			int l = ((PRTokeniser) (pdfdictionary1)).read();
	//   48   90:aload_1         
	//   49   91:invokevirtual   #298 <Method int PRTokeniser.read()>
	//   50   94:istore          5
			if(l == -1)
	//*  51   96:iload           5
	//*  52   98:iconst_m1       
	//*  53   99:icmpne          113
				throw new InlineImageParseException("End of content stream reached before end of image data");
	//   54  102:new             #6   <Class InlineImageUtils$InlineImageParseException>
	//   55  105:dup             
	//   56  106:ldc2            #345 <String "End of content stream reached before end of image data">
	//   57  109:invokespecial   #339 <Method void InlineImageUtils$InlineImageParseException(String)>
	//   58  112:athrow          
			pdfdictionary[i] = (byte)l;
	//   59  113:aload_0         
	//   60  114:iload_3         
	//   61  115:iload           5
	//   62  117:int2byte        
	//   63  118:bastore         
		}

	//   64  119:iload_3         
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:istore_3        
	//*  68  123:goto            84
		if(!pdfcontentparser.readPRObject().toString().equals("EI") && !pdfcontentparser.readPRObject().toString().equals("EI"))
	//*  69  126:aload_2         
	//*  70  127:invokevirtual   #278 <Method PdfObject PdfContentParser.readPRObject()>
	//*  71  130:invokevirtual   #283 <Method String PdfObject.toString()>
	//*  72  133:ldc2            #347 <String "EI">
	//*  73  136:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  74  139:ifne            169
	//*  75  142:aload_2         
	//*  76  143:invokevirtual   #278 <Method PdfObject PdfContentParser.readPRObject()>
	//*  77  146:invokevirtual   #283 <Method String PdfObject.toString()>
	//*  78  149:ldc2            #347 <String "EI">
	//*  79  152:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  80  155:ifne            169
			throw new InlineImageParseException("EI not found after end of image data");
	//   81  158:new             #6   <Class InlineImageUtils$InlineImageParseException>
	//   82  161:dup             
	//   83  162:ldc2            #349 <String "EI not found after end of image data">
	//   84  165:invokespecial   #339 <Method void InlineImageUtils$InlineImageParseException(String)>
	//   85  168:athrow          
		else
			return ((byte []) (pdfdictionary));
	//   86  169:aload_0         
	//   87  170:areturn         
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(((Class) (com/itextpdf/text/pdf/parser/InlineImageUtils)).getName());
	private static final Map inlineImageColorSpaceAbbreviationMap;
	private static final Map inlineImageEntryAbbreviationMap;
	private static final Map inlineImageFilterAbbreviationMap;

	static 
	{
	//    0    0:ldc1            #2   <Class InlineImageUtils>
	//    1    2:invokevirtual   #22  <Method String Class.getName()>
	//    2    5:invokestatic    #28  <Method Logger LoggerFactory.getLogger(String)>
	//    3    8:putstatic       #30  <Field Logger LOGGER>
		inlineImageEntryAbbreviationMap = ((Map) (new HashMap()));
	//    4   11:new             #32  <Class HashMap>
	//    5   14:dup             
	//    6   15:invokespecial   #35  <Method void HashMap()>
	//    7   18:putstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.BITSPERCOMPONENT)), ((Object) (PdfName.BITSPERCOMPONENT)));
	//    8   21:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//    9   24:getstatic       #43  <Field PdfName PdfName.BITSPERCOMPONENT>
	//   10   27:getstatic       #43  <Field PdfName PdfName.BITSPERCOMPONENT>
	//   11   30:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   12   35:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.COLORSPACE)), ((Object) (PdfName.COLORSPACE)));
	//   13   36:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   14   39:getstatic       #52  <Field PdfName PdfName.COLORSPACE>
	//   15   42:getstatic       #52  <Field PdfName PdfName.COLORSPACE>
	//   16   45:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   17   50:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.DECODE)), ((Object) (PdfName.DECODE)));
	//   18   51:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   19   54:getstatic       #55  <Field PdfName PdfName.DECODE>
	//   20   57:getstatic       #55  <Field PdfName PdfName.DECODE>
	//   21   60:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   22   65:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.DECODEPARMS)), ((Object) (PdfName.DECODEPARMS)));
	//   23   66:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   24   69:getstatic       #58  <Field PdfName PdfName.DECODEPARMS>
	//   25   72:getstatic       #58  <Field PdfName PdfName.DECODEPARMS>
	//   26   75:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   27   80:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.FILTER)), ((Object) (PdfName.FILTER)));
	//   28   81:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   29   84:getstatic       #61  <Field PdfName PdfName.FILTER>
	//   30   87:getstatic       #61  <Field PdfName PdfName.FILTER>
	//   31   90:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   32   95:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.HEIGHT)), ((Object) (PdfName.HEIGHT)));
	//   33   96:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   34   99:getstatic       #64  <Field PdfName PdfName.HEIGHT>
	//   35  102:getstatic       #64  <Field PdfName PdfName.HEIGHT>
	//   36  105:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   37  110:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.IMAGEMASK)), ((Object) (PdfName.IMAGEMASK)));
	//   38  111:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   39  114:getstatic       #67  <Field PdfName PdfName.IMAGEMASK>
	//   40  117:getstatic       #67  <Field PdfName PdfName.IMAGEMASK>
	//   41  120:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   42  125:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.INTENT)), ((Object) (PdfName.INTENT)));
	//   43  126:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   44  129:getstatic       #70  <Field PdfName PdfName.INTENT>
	//   45  132:getstatic       #70  <Field PdfName PdfName.INTENT>
	//   46  135:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   47  140:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.INTERPOLATE)), ((Object) (PdfName.INTERPOLATE)));
	//   48  141:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   49  144:getstatic       #73  <Field PdfName PdfName.INTERPOLATE>
	//   50  147:getstatic       #73  <Field PdfName PdfName.INTERPOLATE>
	//   51  150:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   52  155:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (PdfName.WIDTH)), ((Object) (PdfName.WIDTH)));
	//   53  156:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   54  159:getstatic       #76  <Field PdfName PdfName.WIDTH>
	//   55  162:getstatic       #76  <Field PdfName PdfName.WIDTH>
	//   56  165:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   57  170:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (new PdfName("BPC"))), ((Object) (PdfName.BITSPERCOMPONENT)));
	//   58  171:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   59  174:new             #39  <Class PdfName>
	//   60  177:dup             
	//   61  178:ldc1            #78  <String "BPC">
	//   62  180:invokespecial   #81  <Method void PdfName(String)>
	//   63  183:getstatic       #43  <Field PdfName PdfName.BITSPERCOMPONENT>
	//   64  186:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   65  191:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (new PdfName("CS"))), ((Object) (PdfName.COLORSPACE)));
	//   66  192:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   67  195:new             #39  <Class PdfName>
	//   68  198:dup             
	//   69  199:ldc1            #83  <String "CS">
	//   70  201:invokespecial   #81  <Method void PdfName(String)>
	//   71  204:getstatic       #52  <Field PdfName PdfName.COLORSPACE>
	//   72  207:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   73  212:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (new PdfName("D"))), ((Object) (PdfName.DECODE)));
	//   74  213:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   75  216:new             #39  <Class PdfName>
	//   76  219:dup             
	//   77  220:ldc1            #85  <String "D">
	//   78  222:invokespecial   #81  <Method void PdfName(String)>
	//   79  225:getstatic       #55  <Field PdfName PdfName.DECODE>
	//   80  228:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   81  233:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (new PdfName("DP"))), ((Object) (PdfName.DECODEPARMS)));
	//   82  234:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   83  237:new             #39  <Class PdfName>
	//   84  240:dup             
	//   85  241:ldc1            #87  <String "DP">
	//   86  243:invokespecial   #81  <Method void PdfName(String)>
	//   87  246:getstatic       #58  <Field PdfName PdfName.DECODEPARMS>
	//   88  249:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   89  254:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (new PdfName("F"))), ((Object) (PdfName.FILTER)));
	//   90  255:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   91  258:new             #39  <Class PdfName>
	//   92  261:dup             
	//   93  262:ldc1            #89  <String "F">
	//   94  264:invokespecial   #81  <Method void PdfName(String)>
	//   95  267:getstatic       #61  <Field PdfName PdfName.FILTER>
	//   96  270:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   97  275:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (new PdfName("H"))), ((Object) (PdfName.HEIGHT)));
	//   98  276:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//   99  279:new             #39  <Class PdfName>
	//  100  282:dup             
	//  101  283:ldc1            #91  <String "H">
	//  102  285:invokespecial   #81  <Method void PdfName(String)>
	//  103  288:getstatic       #64  <Field PdfName PdfName.HEIGHT>
	//  104  291:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  105  296:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (new PdfName("IM"))), ((Object) (PdfName.IMAGEMASK)));
	//  106  297:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//  107  300:new             #39  <Class PdfName>
	//  108  303:dup             
	//  109  304:ldc1            #93  <String "IM">
	//  110  306:invokespecial   #81  <Method void PdfName(String)>
	//  111  309:getstatic       #67  <Field PdfName PdfName.IMAGEMASK>
	//  112  312:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  113  317:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (new PdfName("I"))), ((Object) (PdfName.INTERPOLATE)));
	//  114  318:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//  115  321:new             #39  <Class PdfName>
	//  116  324:dup             
	//  117  325:ldc1            #95  <String "I">
	//  118  327:invokespecial   #81  <Method void PdfName(String)>
	//  119  330:getstatic       #73  <Field PdfName PdfName.INTERPOLATE>
	//  120  333:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  121  338:pop             
		inlineImageEntryAbbreviationMap.put(((Object) (new PdfName("W"))), ((Object) (PdfName.WIDTH)));
	//  122  339:getstatic       #37  <Field Map inlineImageEntryAbbreviationMap>
	//  123  342:new             #39  <Class PdfName>
	//  124  345:dup             
	//  125  346:ldc1            #97  <String "W">
	//  126  348:invokespecial   #81  <Method void PdfName(String)>
	//  127  351:getstatic       #76  <Field PdfName PdfName.WIDTH>
	//  128  354:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  129  359:pop             
		inlineImageColorSpaceAbbreviationMap = ((Map) (new HashMap()));
	//  130  360:new             #32  <Class HashMap>
	//  131  363:dup             
	//  132  364:invokespecial   #35  <Method void HashMap()>
	//  133  367:putstatic       #99  <Field Map inlineImageColorSpaceAbbreviationMap>
		inlineImageColorSpaceAbbreviationMap.put(((Object) (new PdfName("G"))), ((Object) (PdfName.DEVICEGRAY)));
	//  134  370:getstatic       #99  <Field Map inlineImageColorSpaceAbbreviationMap>
	//  135  373:new             #39  <Class PdfName>
	//  136  376:dup             
	//  137  377:ldc1            #101 <String "G">
	//  138  379:invokespecial   #81  <Method void PdfName(String)>
	//  139  382:getstatic       #104 <Field PdfName PdfName.DEVICEGRAY>
	//  140  385:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  141  390:pop             
		inlineImageColorSpaceAbbreviationMap.put(((Object) (new PdfName("RGB"))), ((Object) (PdfName.DEVICERGB)));
	//  142  391:getstatic       #99  <Field Map inlineImageColorSpaceAbbreviationMap>
	//  143  394:new             #39  <Class PdfName>
	//  144  397:dup             
	//  145  398:ldc1            #106 <String "RGB">
	//  146  400:invokespecial   #81  <Method void PdfName(String)>
	//  147  403:getstatic       #109 <Field PdfName PdfName.DEVICERGB>
	//  148  406:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  149  411:pop             
		inlineImageColorSpaceAbbreviationMap.put(((Object) (new PdfName("CMYK"))), ((Object) (PdfName.DEVICECMYK)));
	//  150  412:getstatic       #99  <Field Map inlineImageColorSpaceAbbreviationMap>
	//  151  415:new             #39  <Class PdfName>
	//  152  418:dup             
	//  153  419:ldc1            #111 <String "CMYK">
	//  154  421:invokespecial   #81  <Method void PdfName(String)>
	//  155  424:getstatic       #114 <Field PdfName PdfName.DEVICECMYK>
	//  156  427:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  157  432:pop             
		inlineImageColorSpaceAbbreviationMap.put(((Object) (new PdfName("I"))), ((Object) (PdfName.INDEXED)));
	//  158  433:getstatic       #99  <Field Map inlineImageColorSpaceAbbreviationMap>
	//  159  436:new             #39  <Class PdfName>
	//  160  439:dup             
	//  161  440:ldc1            #95  <String "I">
	//  162  442:invokespecial   #81  <Method void PdfName(String)>
	//  163  445:getstatic       #117 <Field PdfName PdfName.INDEXED>
	//  164  448:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  165  453:pop             
		inlineImageFilterAbbreviationMap = ((Map) (new HashMap()));
	//  166  454:new             #32  <Class HashMap>
	//  167  457:dup             
	//  168  458:invokespecial   #35  <Method void HashMap()>
	//  169  461:putstatic       #119 <Field Map inlineImageFilterAbbreviationMap>
		inlineImageFilterAbbreviationMap.put(((Object) (new PdfName("AHx"))), ((Object) (PdfName.ASCIIHEXDECODE)));
	//  170  464:getstatic       #119 <Field Map inlineImageFilterAbbreviationMap>
	//  171  467:new             #39  <Class PdfName>
	//  172  470:dup             
	//  173  471:ldc1            #121 <String "AHx">
	//  174  473:invokespecial   #81  <Method void PdfName(String)>
	//  175  476:getstatic       #124 <Field PdfName PdfName.ASCIIHEXDECODE>
	//  176  479:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  177  484:pop             
		inlineImageFilterAbbreviationMap.put(((Object) (new PdfName("A85"))), ((Object) (PdfName.ASCII85DECODE)));
	//  178  485:getstatic       #119 <Field Map inlineImageFilterAbbreviationMap>
	//  179  488:new             #39  <Class PdfName>
	//  180  491:dup             
	//  181  492:ldc1            #126 <String "A85">
	//  182  494:invokespecial   #81  <Method void PdfName(String)>
	//  183  497:getstatic       #129 <Field PdfName PdfName.ASCII85DECODE>
	//  184  500:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  185  505:pop             
		inlineImageFilterAbbreviationMap.put(((Object) (new PdfName("LZW"))), ((Object) (PdfName.LZWDECODE)));
	//  186  506:getstatic       #119 <Field Map inlineImageFilterAbbreviationMap>
	//  187  509:new             #39  <Class PdfName>
	//  188  512:dup             
	//  189  513:ldc1            #131 <String "LZW">
	//  190  515:invokespecial   #81  <Method void PdfName(String)>
	//  191  518:getstatic       #134 <Field PdfName PdfName.LZWDECODE>
	//  192  521:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  193  526:pop             
		inlineImageFilterAbbreviationMap.put(((Object) (new PdfName("Fl"))), ((Object) (PdfName.FLATEDECODE)));
	//  194  527:getstatic       #119 <Field Map inlineImageFilterAbbreviationMap>
	//  195  530:new             #39  <Class PdfName>
	//  196  533:dup             
	//  197  534:ldc1            #136 <String "Fl">
	//  198  536:invokespecial   #81  <Method void PdfName(String)>
	//  199  539:getstatic       #139 <Field PdfName PdfName.FLATEDECODE>
	//  200  542:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  201  547:pop             
		inlineImageFilterAbbreviationMap.put(((Object) (new PdfName("RL"))), ((Object) (PdfName.RUNLENGTHDECODE)));
	//  202  548:getstatic       #119 <Field Map inlineImageFilterAbbreviationMap>
	//  203  551:new             #39  <Class PdfName>
	//  204  554:dup             
	//  205  555:ldc1            #141 <String "RL">
	//  206  557:invokespecial   #81  <Method void PdfName(String)>
	//  207  560:getstatic       #144 <Field PdfName PdfName.RUNLENGTHDECODE>
	//  208  563:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  209  568:pop             
		inlineImageFilterAbbreviationMap.put(((Object) (new PdfName("CCF"))), ((Object) (PdfName.CCITTFAXDECODE)));
	//  210  569:getstatic       #119 <Field Map inlineImageFilterAbbreviationMap>
	//  211  572:new             #39  <Class PdfName>
	//  212  575:dup             
	//  213  576:ldc1            #146 <String "CCF">
	//  214  578:invokespecial   #81  <Method void PdfName(String)>
	//  215  581:getstatic       #149 <Field PdfName PdfName.CCITTFAXDECODE>
	//  216  584:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  217  589:pop             
		inlineImageFilterAbbreviationMap.put(((Object) (new PdfName("DCT"))), ((Object) (PdfName.DCTDECODE)));
	//  218  590:getstatic       #119 <Field Map inlineImageFilterAbbreviationMap>
	//  219  593:new             #39  <Class PdfName>
	//  220  596:dup             
	//  221  597:ldc1            #151 <String "DCT">
	//  222  599:invokespecial   #81  <Method void PdfName(String)>
	//  223  602:getstatic       #154 <Field PdfName PdfName.DCTDECODE>
	//  224  605:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//  225  610:pop             
	//* 226  611:return          
	}
}
