// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.UnsupportedPdfException;
import com.itextpdf.text.pdf.codec.TIFFFaxDecoder;
import com.itextpdf.text.pdf.codec.TIFFFaxDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfObject, PdfDictionary, PdfReader, 
//			PdfNumber, PdfBoolean

public final class FilterHandlers
{
	public static interface FilterHandler
	{

		public abstract byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
			throws IOException;
	}

	private static class Filter_ASCII85DECODE
		implements FilterHandler
	{

		public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
			throws IOException
		{
			return PdfReader.ASCII85Decode(abyte0);
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method byte[] PdfReader.ASCII85Decode(byte[])>
		//    2    4:areturn         
		}

		private Filter_ASCII85DECODE()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Filter_ASCIIHEXDECODE
		implements FilterHandler
	{

		public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
			throws IOException
		{
			return PdfReader.ASCIIHexDecode(abyte0);
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method byte[] PdfReader.ASCIIHexDecode(byte[])>
		//    2    4:areturn         
		}

		private Filter_ASCIIHEXDECODE()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Filter_CCITTFAXDECODE
		implements FilterHandler
	{

		public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
			throws IOException
		{
			pdfname = ((PdfName) ((PdfNumber)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.WIDTH))));
		//    0    0:aload           4
		//    1    2:getstatic       #26  <Field PdfName PdfName.WIDTH>
		//    2    5:invokevirtual   #32  <Method PdfObject PdfDictionary.get(PdfName)>
		//    3    8:invokestatic    #38  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
		//    4   11:checkcast       #40  <Class PdfNumber>
		//    5   14:astore_2        
			pdfdictionary = ((PdfDictionary) ((PdfNumber)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.HEIGHT))));
		//    6   15:aload           4
		//    7   17:getstatic       #43  <Field PdfName PdfName.HEIGHT>
		//    8   20:invokevirtual   #32  <Method PdfObject PdfDictionary.get(PdfName)>
		//    9   23:invokestatic    #38  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
		//   10   26:checkcast       #40  <Class PdfNumber>
		//   11   29:astore          4
			if(pdfname == null || pdfdictionary == null)
		//*  12   31:aload_2         
		//*  13   32:ifnull          40
		//*  14   35:aload           4
		//*  15   37:ifnonnull       57
				throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("filter.ccittfaxdecode.is.only.supported.for.images", new Object[0]));
		//   16   40:new             #45  <Class UnsupportedPdfException>
		//   17   43:dup             
		//   18   44:ldc1            #47  <String "filter.ccittfaxdecode.is.only.supported.for.images">
		//   19   46:iconst_0        
		//   20   47:anewarray       Object[]
		//   21   50:invokestatic    #53  <Method String MessageLocalization.getComposedMessage(String, Object[])>
		//   22   53:invokespecial   #56  <Method void UnsupportedPdfException(String)>
		//   23   56:athrow          
			int l = ((PdfNumber) (pdfname)).intValue();
		//   24   57:aload_2         
		//   25   58:invokevirtual   #60  <Method int PdfNumber.intValue()>
		//   26   61:istore          7
			int i1 = ((PdfNumber) (pdfdictionary)).intValue();
		//   27   63:aload           4
		//   28   65:invokevirtual   #60  <Method int PdfNumber.intValue()>
		//   29   68:istore          8
			int i;
			int k;
			boolean flag;
			boolean flag1;
			boolean flag2;
			boolean flag3;
			TIFFFaxDecompressor tifffaxdecompressor;
			if(pdfobject instanceof PdfDictionary)
		//*  30   70:aload_3         
		//*  31   71:instanceof      #28  <Class PdfDictionary>
		//*  32   74:ifeq            366
				pdfname = ((PdfName) ((PdfDictionary)pdfobject));
		//   33   77:aload_3         
		//   34   78:checkcast       #28  <Class PdfDictionary>
		//   35   81:astore_2        
			else
		//*  36   82:iconst_0        
		//*  37   83:istore          6
		//*  38   85:iconst_0        
		//*  39   86:istore          5
		//*  40   88:iconst_0        
		//*  41   89:istore          10
		//*  42   91:iconst_0        
		//*  43   92:istore          9
		//*  44   94:iconst_0        
		//*  45   95:istore          12
		//*  46   97:iload           12
		//*  47   99:istore          11
		//*  48  101:aload_2         
		//*  49  102:ifnull          179
		//*  50  105:aload_2         
		//*  51  106:getstatic       #63  <Field PdfName PdfName.K>
		//*  52  109:invokevirtual   #67  <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
		//*  53  112:astore_3        
		//*  54  113:aload_3         
		//*  55  114:ifnull          123
		//*  56  117:aload_3         
		//*  57  118:invokevirtual   #60  <Method int PdfNumber.intValue()>
		//*  58  121:istore          5
		//*  59  123:aload_2         
		//*  60  124:getstatic       #70  <Field PdfName PdfName.BLACKIS1>
		//*  61  127:invokevirtual   #74  <Method PdfBoolean PdfDictionary.getAsBoolean(PdfName)>
		//*  62  130:astore_3        
		//*  63  131:aload_3         
		//*  64  132:ifnull          141
		//*  65  135:aload_3         
		//*  66  136:invokevirtual   #80  <Method boolean PdfBoolean.booleanValue()>
		//*  67  139:istore          9
		//*  68  141:aload_2         
		//*  69  142:getstatic       #83  <Field PdfName PdfName.ENCODEDBYTEALIGN>
		//*  70  145:invokevirtual   #74  <Method PdfBoolean PdfDictionary.getAsBoolean(PdfName)>
		//*  71  148:astore_2        
		//*  72  149:iload           9
		//*  73  151:istore          10
		//*  74  153:iload           12
		//*  75  155:istore          11
		//*  76  157:iload           5
		//*  77  159:istore          6
		//*  78  161:aload_2         
		//*  79  162:ifnull          179
		//*  80  165:aload_2         
		//*  81  166:invokevirtual   #80  <Method boolean PdfBoolean.booleanValue()>
		//*  82  169:istore          11
		//*  83  171:iload           5
		//*  84  173:istore          6
		//*  85  175:iload           9
		//*  86  177:istore          10
		//*  87  179:iload           7
		//*  88  181:bipush          7
		//*  89  183:iadd            
		//*  90  184:bipush          8
		//*  91  186:idiv            
		//*  92  187:iload           8
		//*  93  189:imul            
		//*  94  190:newarray        byte[]
		//*  95  192:astore_3        
		//*  96  193:new             #85  <Class TIFFFaxDecompressor>
		//*  97  196:dup             
		//*  98  197:invokespecial   #86  <Method void TIFFFaxDecompressor()>
		//*  99  200:astore          13
		//* 100  202:iload           6
		//* 101  204:ifeq            212
		//* 102  207:iload           6
		//* 103  209:ifle            383
		//* 104  212:iload           6
		//* 105  214:ifle            371
		//* 106  217:iconst_1        
		//* 107  218:istore          5
		//* 108  220:iload           11
		//* 109  222:ifeq            377
		//* 110  225:iconst_4        
		//* 111  226:istore          6
		//* 112  228:iload           5
		//* 113  230:iload           6
		//* 114  232:ior             
		//* 115  233:istore          5
		//* 116  235:aload           13
		//* 117  237:iconst_1        
		//* 118  238:iconst_3        
		//* 119  239:iload           5
		//* 120  241:iconst_0        
		//* 121  242:invokevirtual   #90  <Method void TIFFFaxDecompressor.SetOptions(int, int, int, int)>
		//* 122  245:aload           13
		//* 123  247:aload_3         
		//* 124  248:aload_1         
		//* 125  249:iload           7
		//* 126  251:iload           8
		//* 127  253:invokevirtual   #94  <Method void TIFFFaxDecompressor.decodeRaw(byte[], byte[], int, int)>
		//* 128  256:aload_3         
		//* 129  257:astore_2        
		//* 130  258:aload           13
		//* 131  260:getfield        #98  <Field int TIFFFaxDecompressor.fails>
		//* 132  263:ifle            325
		//* 133  266:iload           7
		//* 134  268:bipush          7
		//* 135  270:iadd            
		//* 136  271:bipush          8
		//* 137  273:idiv            
		//* 138  274:iload           8
		//* 139  276:imul            
		//* 140  277:newarray        byte[]
		//* 141  279:astore          4
		//* 142  281:aload           13
		//* 143  283:getfield        #98  <Field int TIFFFaxDecompressor.fails>
		//* 144  286:istore          6
		//* 145  288:aload           13
		//* 146  290:iconst_1        
		//* 147  291:iconst_2        
		//* 148  292:iload           5
		//* 149  294:iconst_0        
		//* 150  295:invokevirtual   #90  <Method void TIFFFaxDecompressor.SetOptions(int, int, int, int)>
		//* 151  298:aload           13
		//* 152  300:aload           4
		//* 153  302:aload_1         
		//* 154  303:iload           7
		//* 155  305:iload           8
		//* 156  307:invokevirtual   #94  <Method void TIFFFaxDecompressor.decodeRaw(byte[], byte[], int, int)>
		//* 157  310:aload_3         
		//* 158  311:astore_2        
		//* 159  312:aload           13
		//* 160  314:getfield        #98  <Field int TIFFFaxDecompressor.fails>
		//* 161  317:iload           6
		//* 162  319:icmpge          325
		//* 163  322:aload           4
		//* 164  324:astore_2        
		//* 165  325:iload           10
		//* 166  327:ifne            409
		//* 167  330:aload_2         
		//* 168  331:arraylength     
		//* 169  332:istore          6
		//* 170  334:iconst_0        
		//* 171  335:istore          5
		//* 172  337:iload           5
		//* 173  339:iload           6
		//* 174  341:icmpge          409
		//* 175  344:aload_2         
		//* 176  345:iload           5
		//* 177  347:aload_2         
		//* 178  348:iload           5
		//* 179  350:baload          
		//* 180  351:sipush          255
		//* 181  354:ixor            
		//* 182  355:int2byte        
		//* 183  356:bastore         
		//* 184  357:iload           5
		//* 185  359:iconst_1        
		//* 186  360:iadd            
		//* 187  361:istore          5
		//* 188  363:goto            337
				pdfname = null;
		//  189  366:aconst_null     
		//  190  367:astore_2        
			k = 0;
			i = 0;
			flag1 = false;
			flag = false;
			flag3 = false;
			flag2 = flag3;
			if(pdfname != null)
			{
				pdfobject = ((PdfObject) (((PdfDictionary) (pdfname)).getAsNumber(PdfName.K)));
				if(pdfobject != null)
					i = ((PdfNumber) (pdfobject)).intValue();
				pdfobject = ((PdfObject) (((PdfDictionary) (pdfname)).getAsBoolean(PdfName.BLACKIS1)));
				if(pdfobject != null)
					flag = ((PdfBoolean) (pdfobject)).booleanValue();
				pdfname = ((PdfName) (((PdfDictionary) (pdfname)).getAsBoolean(PdfName.ENCODEDBYTEALIGN)));
				flag1 = flag;
				flag2 = flag3;
				k = i;
				if(pdfname != null)
				{
					flag2 = ((PdfBoolean) (pdfname)).booleanValue();
					k = i;
					flag1 = flag;
				}
			}
			pdfobject = ((PdfObject) (new byte[((l + 7) / 8) * i1]));
			tifffaxdecompressor = new TIFFFaxDecompressor();
			if(k == 0 || k > 0)
			{
				int j;
				if(k > 0)
					j = 1;
				else
		//* 191  368:goto            82
					j = 0;
		//  192  371:iconst_0        
		//  193  372:istore          5
				if(flag2)
					k = 4;
				else
		//* 194  374:goto            220
					k = 0;
		//  195  377:iconst_0        
		//  196  378:istore          6
				j |= k;
				tifffaxdecompressor.SetOptions(1, 3, j, 0);
				tifffaxdecompressor.decodeRaw(((byte []) (pdfobject)), abyte0, l, i1);
				pdfname = ((PdfName) (pdfobject));
				if(tifffaxdecompressor.fails > 0)
				{
					pdfdictionary = ((PdfDictionary) (new byte[((l + 7) / 8) * i1]));
					k = tifffaxdecompressor.fails;
					tifffaxdecompressor.SetOptions(1, 2, j, 0);
					tifffaxdecompressor.decodeRaw(((byte []) (pdfdictionary)), abyte0, l, i1);
					pdfname = ((PdfName) (pdfobject));
					if(tifffaxdecompressor.fails < k)
						pdfname = ((PdfName) (pdfdictionary));
				}
			} else
		//* 197  380:goto            228
			{
				(new TIFFFaxDecoder(1L, l, i1)).decodeT6(((byte []) (pdfobject)), abyte0, 0, i1, 0L);
		//  198  383:new             #100 <Class TIFFFaxDecoder>
		//  199  386:dup             
		//  200  387:lconst_1        
		//  201  388:iload           7
		//  202  390:iload           8
		//  203  392:invokespecial   #103 <Method void TIFFFaxDecoder(long, int, int)>
		//  204  395:aload_3         
		//  205  396:aload_1         
		//  206  397:iconst_0        
		//  207  398:iload           8
		//  208  400:lconst_0        
		//  209  401:invokevirtual   #107 <Method void TIFFFaxDecoder.decodeT6(byte[], byte[], int, int, long)>
				pdfname = ((PdfName) (pdfobject));
		//  210  404:aload_3         
		//  211  405:astore_2        
			}
			if(!flag1)
			{
				k = pdfname.length;
				for(j = 0; j < k; j++)
					pdfname[j] = (byte)(pdfname[j] ^ 0xff);

			}
		//* 212  406:goto            325
			return ((byte []) (pdfname));
		//  213  409:aload_2         
		//  214  410:areturn         
		}

		private Filter_CCITTFAXDECODE()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Filter_DoNothing
		implements FilterHandler
	{

		public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
			throws IOException
		{
			return abyte0;
		//    0    0:aload_1         
		//    1    1:areturn         
		}

		private Filter_DoNothing()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Filter_FLATEDECODE
		implements FilterHandler
	{

		public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
			throws IOException
		{
			return PdfReader.decodePredictor(PdfReader.FlateDecode(abyte0), pdfobject);
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method byte[] PdfReader.FlateDecode(byte[])>
		//    2    4:aload_3         
		//    3    5:invokestatic    #30  <Method byte[] PdfReader.decodePredictor(byte[], PdfObject)>
		//    4    8:areturn         
		}

		private Filter_FLATEDECODE()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Filter_LZWDECODE
		implements FilterHandler
	{

		public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
			throws IOException
		{
			return PdfReader.decodePredictor(PdfReader.LZWDecode(abyte0), pdfobject);
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method byte[] PdfReader.LZWDecode(byte[])>
		//    2    4:aload_3         
		//    3    5:invokestatic    #30  <Method byte[] PdfReader.decodePredictor(byte[], PdfObject)>
		//    4    8:areturn         
		}

		private Filter_LZWDECODE()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Filter_RUNLENGTHDECODE
		implements FilterHandler
	{

		public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
			throws IOException
		{
			int i;
			pdfname = ((PdfName) (new ByteArrayOutputStream()));
		//    0    0:new             #22  <Class ByteArrayOutputStream>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void ByteArrayOutputStream()>
		//    3    7:astore_2        
			i = 0;
		//    4    8:iconst_0        
		//    5    9:istore          5
_L2:
			byte byte0;
label0:
			{
				if(i < abyte0.length)
		//*   6   11:iload           5
		//*   7   13:aload_1         
		//*   8   14:arraylength     
		//*   9   15:icmpge          31
				{
					byte0 = abyte0[i];
		//   10   18:aload_1         
		//   11   19:iload           5
		//   12   21:baload          
		//   13   22:istore          8
					if(byte0 != -128)
						break label0;
		//   14   24:iload           8
		//   15   26:bipush          -128
		//   16   28:icmpne          36
				}
				return ((ByteArrayOutputStream) (pdfname)).toByteArray();
		//   17   31:aload_2         
		//   18   32:invokevirtual   #27  <Method byte[] ByteArrayOutputStream.toByteArray()>
		//   19   35:areturn         
			}
			if(byte0 < 0 || byte0 > 127)
				break; /* Loop/switch isn't completed */
		//   20   36:iload           8
		//   21   38:iflt            79
		//   22   41:iload           8
		//   23   43:bipush          127
		//   24   45:icmpgt          79
			int j = byte0 + 1;
		//   25   48:iload           8
		//   26   50:iconst_1        
		//   27   51:iadd            
		//   28   52:istore          6
			((ByteArrayOutputStream) (pdfname)).write(abyte0, i, j);
		//   29   54:aload_2         
		//   30   55:aload_1         
		//   31   56:iload           5
		//   32   58:iload           6
		//   33   60:invokevirtual   #31  <Method void ByteArrayOutputStream.write(byte[], int, int)>
			i += j;
		//   34   63:iload           5
		//   35   65:iload           6
		//   36   67:iadd            
		//   37   68:istore          5
_L4:
			i++;
		//   38   70:iload           5
		//   39   72:iconst_1        
		//   40   73:iadd            
		//   41   74:istore          5
			if(true) goto _L2; else goto _L1
		//   42   76:goto            11
_L1:
			int k;
			int l;
			l = i + 1;
		//   43   79:iload           5
		//   44   81:iconst_1        
		//   45   82:iadd            
		//   46   83:istore          7
			k = 0;
		//   47   85:iconst_0        
		//   48   86:istore          6
_L5:
			i = l;
		//   49   88:iload           7
		//   50   90:istore          5
			if(k >= 1 - byte0) goto _L4; else goto _L3
		//   51   92:iload           6
		//   52   94:iconst_1        
		//   53   95:iload           8
		//   54   97:isub            
		//   55   98:icmpge          70
_L3:
			((ByteArrayOutputStream) (pdfname)).write(((int) (abyte0[l])));
		//   56  101:aload_2         
		//   57  102:aload_1         
		//   58  103:iload           7
		//   59  105:baload          
		//   60  106:invokevirtual   #34  <Method void ByteArrayOutputStream.write(int)>
			k++;
		//   61  109:iload           6
		//   62  111:iconst_1        
		//   63  112:iadd            
		//   64  113:istore          6
			  goto _L5
		//*  65  115:goto            88
		}

		private Filter_RUNLENGTHDECODE()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	public FilterHandlers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
	//    2    4:return          
	}

	public static Map getDefaultFilterHandlers()
	{
		return defaults;
	//    0    0:getstatic       #94  <Field Map defaults>
	//    1    3:areturn         
	}

	private static final Map defaults;

	static 
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #37  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void HashMap()>
	//    3    7:astore_0        
		hashmap.put(((Object) (PdfName.FLATEDECODE)), ((Object) (new Filter_FLATEDECODE())));
	//    4    8:aload_0         
	//    5    9:getstatic       #46  <Field PdfName PdfName.FLATEDECODE>
	//    6   12:new             #23  <Class FilterHandlers$Filter_FLATEDECODE>
	//    7   15:dup             
	//    8   16:aconst_null     
	//    9   17:invokespecial   #49  <Method void FilterHandlers$Filter_FLATEDECODE(FilterHandlers$1)>
	//   10   20:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   11   23:pop             
		hashmap.put(((Object) (PdfName.FL)), ((Object) (new Filter_FLATEDECODE())));
	//   12   24:aload_0         
	//   13   25:getstatic       #56  <Field PdfName PdfName.FL>
	//   14   28:new             #23  <Class FilterHandlers$Filter_FLATEDECODE>
	//   15   31:dup             
	//   16   32:aconst_null     
	//   17   33:invokespecial   #49  <Method void FilterHandlers$Filter_FLATEDECODE(FilterHandlers$1)>
	//   18   36:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   19   39:pop             
		hashmap.put(((Object) (PdfName.ASCIIHEXDECODE)), ((Object) (new Filter_ASCIIHEXDECODE())));
	//   20   40:aload_0         
	//   21   41:getstatic       #59  <Field PdfName PdfName.ASCIIHEXDECODE>
	//   22   44:new             #14  <Class FilterHandlers$Filter_ASCIIHEXDECODE>
	//   23   47:dup             
	//   24   48:aconst_null     
	//   25   49:invokespecial   #60  <Method void FilterHandlers$Filter_ASCIIHEXDECODE(FilterHandlers$1)>
	//   26   52:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   27   55:pop             
		hashmap.put(((Object) (PdfName.AHX)), ((Object) (new Filter_ASCIIHEXDECODE())));
	//   28   56:aload_0         
	//   29   57:getstatic       #63  <Field PdfName PdfName.AHX>
	//   30   60:new             #14  <Class FilterHandlers$Filter_ASCIIHEXDECODE>
	//   31   63:dup             
	//   32   64:aconst_null     
	//   33   65:invokespecial   #60  <Method void FilterHandlers$Filter_ASCIIHEXDECODE(FilterHandlers$1)>
	//   34   68:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   35   71:pop             
		hashmap.put(((Object) (PdfName.ASCII85DECODE)), ((Object) (new Filter_ASCII85DECODE())));
	//   36   72:aload_0         
	//   37   73:getstatic       #66  <Field PdfName PdfName.ASCII85DECODE>
	//   38   76:new             #11  <Class FilterHandlers$Filter_ASCII85DECODE>
	//   39   79:dup             
	//   40   80:aconst_null     
	//   41   81:invokespecial   #67  <Method void FilterHandlers$Filter_ASCII85DECODE(FilterHandlers$1)>
	//   42   84:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   43   87:pop             
		hashmap.put(((Object) (PdfName.A85)), ((Object) (new Filter_ASCII85DECODE())));
	//   44   88:aload_0         
	//   45   89:getstatic       #70  <Field PdfName PdfName.A85>
	//   46   92:new             #11  <Class FilterHandlers$Filter_ASCII85DECODE>
	//   47   95:dup             
	//   48   96:aconst_null     
	//   49   97:invokespecial   #67  <Method void FilterHandlers$Filter_ASCII85DECODE(FilterHandlers$1)>
	//   50  100:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   51  103:pop             
		hashmap.put(((Object) (PdfName.LZWDECODE)), ((Object) (new Filter_LZWDECODE())));
	//   52  104:aload_0         
	//   53  105:getstatic       #73  <Field PdfName PdfName.LZWDECODE>
	//   54  108:new             #26  <Class FilterHandlers$Filter_LZWDECODE>
	//   55  111:dup             
	//   56  112:aconst_null     
	//   57  113:invokespecial   #74  <Method void FilterHandlers$Filter_LZWDECODE(FilterHandlers$1)>
	//   58  116:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   59  119:pop             
		hashmap.put(((Object) (PdfName.CCITTFAXDECODE)), ((Object) (new Filter_CCITTFAXDECODE())));
	//   60  120:aload_0         
	//   61  121:getstatic       #77  <Field PdfName PdfName.CCITTFAXDECODE>
	//   62  124:new             #17  <Class FilterHandlers$Filter_CCITTFAXDECODE>
	//   63  127:dup             
	//   64  128:aconst_null     
	//   65  129:invokespecial   #78  <Method void FilterHandlers$Filter_CCITTFAXDECODE(FilterHandlers$1)>
	//   66  132:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   67  135:pop             
		hashmap.put(((Object) (PdfName.CRYPT)), ((Object) (new Filter_DoNothing())));
	//   68  136:aload_0         
	//   69  137:getstatic       #81  <Field PdfName PdfName.CRYPT>
	//   70  140:new             #20  <Class FilterHandlers$Filter_DoNothing>
	//   71  143:dup             
	//   72  144:aconst_null     
	//   73  145:invokespecial   #82  <Method void FilterHandlers$Filter_DoNothing(FilterHandlers$1)>
	//   74  148:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   75  151:pop             
		hashmap.put(((Object) (PdfName.RUNLENGTHDECODE)), ((Object) (new Filter_RUNLENGTHDECODE())));
	//   76  152:aload_0         
	//   77  153:getstatic       #85  <Field PdfName PdfName.RUNLENGTHDECODE>
	//   78  156:new             #29  <Class FilterHandlers$Filter_RUNLENGTHDECODE>
	//   79  159:dup             
	//   80  160:aconst_null     
	//   81  161:invokespecial   #86  <Method void FilterHandlers$Filter_RUNLENGTHDECODE(FilterHandlers$1)>
	//   82  164:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   83  167:pop             
		defaults = Collections.unmodifiableMap(((Map) (hashmap)));
	//   84  168:aload_0         
	//   85  169:invokestatic    #92  <Method Map Collections.unmodifiableMap(Map)>
	//   86  172:putstatic       #94  <Field Map defaults>
	//*  87  175:return          
	}
}
