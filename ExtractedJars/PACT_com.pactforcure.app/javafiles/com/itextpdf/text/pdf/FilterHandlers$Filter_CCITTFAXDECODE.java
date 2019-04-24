// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.UnsupportedPdfException;
import com.itextpdf.text.pdf.codec.TIFFFaxDecoder;
import com.itextpdf.text.pdf.codec.TIFFFaxDecompressor;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			FilterHandlers, PdfName, PdfDictionary, PdfReader, 
//			PdfNumber, PdfBoolean, PdfObject

private static class FilterHandlers$Filter_CCITTFAXDECODE
	implements FilterHandlers.FilterHandler
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

	private FilterHandlers$Filter_CCITTFAXDECODE()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	FilterHandlers$Filter_CCITTFAXDECODE(FilterHandlers._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void FilterHandlers$Filter_CCITTFAXDECODE()>
	//    2    4:return          
	}
}
