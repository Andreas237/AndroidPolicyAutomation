// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.*;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStream, PdfName, PdfWriter, PdfEncryption, 
//			PdfArray, PdfDictionary, PdfNull, PdfObject, 
//			PdfNumber, OutputStreamCounter, OutputStreamEncryption

public class PdfEFStream extends PdfStream
{

	public PdfEFStream(InputStream inputstream, PdfWriter pdfwriter)
	{
		super(inputstream, pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void PdfStream(InputStream, PdfWriter)>
	//    4    6:return          
	}

	public PdfEFStream(byte abyte0[])
	{
		super(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void PdfStream(byte[])>
	//    3    5:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		int i;
		Object obj;
		if(inputStream != null && compressed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field InputStream inputStream>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #24  <Field boolean compressed>
	//*   5   11:ifeq            24
			put(PdfName.FILTER, ((PdfObject) (PdfName.FLATEDECODE)));
	//    6   14:aload_0         
	//    7   15:getstatic       #30  <Field PdfName PdfName.FILTER>
	//    8   18:getstatic       #33  <Field PdfName PdfName.FLATEDECODE>
	//    9   21:invokevirtual   #37  <Method void put(PdfName, PdfObject)>
		Object obj1 = null;
	//   10   24:aconst_null     
	//   11   25:astore          5
		if(pdfwriter != null)
	//*  12   27:aload_1         
	//*  13   28:ifnull          37
			obj1 = ((Object) (pdfwriter.getEncryption()));
	//   14   31:aload_1         
	//   15   32:invokevirtual   #43  <Method PdfEncryption PdfWriter.getEncryption()>
	//   16   35:astore          5
		obj = obj1;
	//   17   37:aload           5
	//   18   39:astore          4
		if(obj1 != null)
	//*  19   41:aload           5
	//*  20   43:ifnull          78
		{
			Object obj2 = ((Object) (get(PdfName.FILTER)));
	//   21   46:aload_0         
	//   22   47:getstatic       #30  <Field PdfName PdfName.FILTER>
	//   23   50:invokevirtual   #47  <Method PdfObject get(PdfName)>
	//   24   53:astore          6
			obj = obj1;
	//   25   55:aload           5
	//   26   57:astore          4
			Object obj3;
			OutputStreamCounter outputstreamcounter;
			if(obj2 != null)
	//*  27   59:aload           6
	//*  28   61:ifnull          78
				if(PdfName.CRYPT.equals(obj2))
	//*  29   64:getstatic       #50  <Field PdfName PdfName.CRYPT>
	//*  30   67:aload           6
	//*  31   69:invokevirtual   #54  <Method boolean PdfName.equals(Object)>
	//*  32   72:ifeq            437
				{
					obj = null;
	//   33   75:aconst_null     
	//   34   76:astore          4
				} else
	//*  35   78:aload           4
	//*  36   80:ifnull          193
	//*  37   83:aload           4
	//*  38   85:invokevirtual   #60  <Method boolean PdfEncryption.isEmbeddedFilesOnly()>
	//*  39   88:ifeq            193
	//*  40   91:new             #62  <Class PdfArray>
	//*  41   94:dup             
	//*  42   95:invokespecial   #65  <Method void PdfArray()>
	//*  43   98:astore          5
	//*  44  100:new             #62  <Class PdfArray>
	//*  45  103:dup             
	//*  46  104:invokespecial   #65  <Method void PdfArray()>
	//*  47  107:astore          6
	//*  48  109:new             #67  <Class PdfDictionary>
	//*  49  112:dup             
	//*  50  113:invokespecial   #68  <Method void PdfDictionary()>
	//*  51  116:astore          7
	//*  52  118:aload           7
	//*  53  120:getstatic       #71  <Field PdfName PdfName.NAME>
	//*  54  123:getstatic       #74  <Field PdfName PdfName.STDCF>
	//*  55  126:invokevirtual   #75  <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  56  129:aload           5
	//*  57  131:getstatic       #50  <Field PdfName PdfName.CRYPT>
	//*  58  134:invokevirtual   #79  <Method boolean PdfArray.add(PdfObject)>
	//*  59  137:pop             
	//*  60  138:aload           6
	//*  61  140:aload           7
	//*  62  142:invokevirtual   #79  <Method boolean PdfArray.add(PdfObject)>
	//*  63  145:pop             
	//*  64  146:aload_0         
	//*  65  147:getfield        #24  <Field boolean compressed>
	//*  66  150:ifeq            175
	//*  67  153:aload           5
	//*  68  155:getstatic       #33  <Field PdfName PdfName.FLATEDECODE>
	//*  69  158:invokevirtual   #79  <Method boolean PdfArray.add(PdfObject)>
	//*  70  161:pop             
	//*  71  162:aload           6
	//*  72  164:new             #81  <Class PdfNull>
	//*  73  167:dup             
	//*  74  168:invokespecial   #82  <Method void PdfNull()>
	//*  75  171:invokevirtual   #79  <Method boolean PdfArray.add(PdfObject)>
	//*  76  174:pop             
	//*  77  175:aload_0         
	//*  78  176:getstatic       #30  <Field PdfName PdfName.FILTER>
	//*  79  179:aload           5
	//*  80  181:invokevirtual   #37  <Method void put(PdfName, PdfObject)>
	//*  81  184:aload_0         
	//*  82  185:getstatic       #85  <Field PdfName PdfName.DECODEPARMS>
	//*  83  188:aload           6
	//*  84  190:invokevirtual   #37  <Method void put(PdfName, PdfObject)>
	//*  85  193:aload_0         
	//*  86  194:getstatic       #88  <Field PdfName PdfName.LENGTH>
	//*  87  197:invokevirtual   #47  <Method PdfObject get(PdfName)>
	//*  88  200:astore          5
	//*  89  202:aload           4
	//*  90  204:ifnull          493
	//*  91  207:aload           5
	//*  92  209:ifnull          493
	//*  93  212:aload           5
	//*  94  214:invokevirtual   #93  <Method boolean PdfObject.isNumber()>
	//*  95  217:ifeq            493
	//*  96  220:aload           5
	//*  97  222:checkcast       #95  <Class PdfNumber>
	//*  98  225:invokevirtual   #99  <Method int PdfNumber.intValue()>
	//*  99  228:istore_3        
	//* 100  229:aload_0         
	//* 101  230:getstatic       #88  <Field PdfName PdfName.LENGTH>
	//* 102  233:new             #95  <Class PdfNumber>
	//* 103  236:dup             
	//* 104  237:aload           4
	//* 105  239:iload_3         
	//* 106  240:invokevirtual   #103 <Method int PdfEncryption.calculateStreamSize(int)>
	//* 107  243:invokespecial   #106 <Method void PdfNumber(int)>
	//* 108  246:invokevirtual   #37  <Method void put(PdfName, PdfObject)>
	//* 109  249:aload_0         
	//* 110  250:aload_1         
	//* 111  251:aload_2         
	//* 112  252:invokevirtual   #109 <Method void superToPdf(PdfWriter, OutputStream)>
	//* 113  255:aload_0         
	//* 114  256:getstatic       #88  <Field PdfName PdfName.LENGTH>
	//* 115  259:aload           5
	//* 116  261:invokevirtual   #37  <Method void put(PdfName, PdfObject)>
	//* 117  264:aload_2         
	//* 118  265:getstatic       #113 <Field byte[] STARTSTREAM>
	//* 119  268:invokevirtual   #118 <Method void OutputStream.write(byte[])>
	//* 120  271:aload_0         
	//* 121  272:getfield        #20  <Field InputStream inputStream>
	//* 122  275:ifnull          523
	//* 123  278:aload_0         
	//* 124  279:iconst_0        
	//* 125  280:putfield        #122 <Field int rawLength>
	//* 126  283:aconst_null     
	//* 127  284:astore          7
	//* 128  286:new             #124 <Class OutputStreamCounter>
	//* 129  289:dup             
	//* 130  290:aload_2         
	//* 131  291:invokespecial   #127 <Method void OutputStreamCounter(OutputStream)>
	//* 132  294:astore          8
	//* 133  296:aconst_null     
	//* 134  297:astore          5
	//* 135  299:aload           8
	//* 136  301:astore          6
	//* 137  303:aload           6
	//* 138  305:astore_1        
	//* 139  306:aload           4
	//* 140  308:ifnull          323
	//* 141  311:aload           4
	//* 142  313:aload           6
	//* 143  315:invokevirtual   #131 <Method OutputStreamEncryption PdfEncryption.getEncryptionStream(OutputStream)>
	//* 144  318:astore          5
	//* 145  320:aload           5
	//* 146  322:astore_1        
	//* 147  323:aconst_null     
	//* 148  324:astore          4
	//* 149  326:aload           7
	//* 150  328:astore          6
	//* 151  330:aload           4
	//* 152  332:astore          7
	//* 153  334:aload_1         
	//* 154  335:astore          4
	//* 155  337:aload_0         
	//* 156  338:getfield        #24  <Field boolean compressed>
	//* 157  341:ifeq            375
	//* 158  344:new             #133 <Class Deflater>
	//* 159  347:dup             
	//* 160  348:aload_0         
	//* 161  349:getfield        #136 <Field int compressionLevel>
	//* 162  352:invokespecial   #137 <Method void Deflater(int)>
	//* 163  355:astore          7
	//* 164  357:new             #139 <Class DeflaterOutputStream>
	//* 165  360:dup             
	//* 166  361:aload_1         
	//* 167  362:aload           7
	//* 168  364:ldc1            #140 <Int 32768>
	//* 169  366:invokespecial   #143 <Method void DeflaterOutputStream(OutputStream, Deflater, int)>
	//* 170  369:astore          6
	//* 171  371:aload           6
	//* 172  373:astore          4
	//* 173  375:sipush          4192
	//* 174  378:newarray        byte[]
	//* 175  380:astore_1        
	//* 176  381:aload_0         
	//* 177  382:getfield        #20  <Field InputStream inputStream>
	//* 178  385:aload_1         
	//* 179  386:invokevirtual   #149 <Method int InputStream.read(byte[])>
	//* 180  389:istore_3        
	//* 181  390:iload_3         
	//* 182  391:ifgt            502
	//* 183  394:aload           6
	//* 184  396:ifnull          409
	//* 185  399:aload           6
	//* 186  401:invokevirtual   #152 <Method void DeflaterOutputStream.finish()>
	//* 187  404:aload           7
	//* 188  406:invokevirtual   #155 <Method void Deflater.end()>
	//* 189  409:aload           5
	//* 190  411:ifnull          419
	//* 191  414:aload           5
	//* 192  416:invokevirtual   #158 <Method void OutputStreamEncryption.finish()>
	//* 193  419:aload_0         
	//* 194  420:aload           8
	//* 195  422:invokevirtual   #162 <Method long OutputStreamCounter.getCounter()>
	//* 196  425:l2i             
	//* 197  426:putfield        #165 <Field int inputStreamLength>
	//* 198  429:aload_2         
	//* 199  430:getstatic       #168 <Field byte[] ENDSTREAM>
	//* 200  433:invokevirtual   #118 <Method void OutputStream.write(byte[])>
	//* 201  436:return          
				{
					obj = obj1;
	//  202  437:aload           5
	//  203  439:astore          4
					if(((PdfObject) (obj2)).isArray())
	//* 204  441:aload           6
	//* 205  443:invokevirtual   #171 <Method boolean PdfObject.isArray()>
	//* 206  446:ifeq            78
					{
						obj2 = ((Object) ((PdfArray)obj2));
	//  207  449:aload           6
	//  208  451:checkcast       #62  <Class PdfArray>
	//  209  454:astore          6
						obj = obj1;
	//  210  456:aload           5
	//  211  458:astore          4
						if(!((PdfArray) (obj2)).isEmpty())
	//* 212  460:aload           6
	//* 213  462:invokevirtual   #174 <Method boolean PdfArray.isEmpty()>
	//* 214  465:ifne            78
						{
							obj = obj1;
	//  215  468:aload           5
	//  216  470:astore          4
							if(PdfName.CRYPT.equals(((Object) (((PdfArray) (obj2)).getPdfObject(0)))))
	//* 217  472:getstatic       #50  <Field PdfName PdfName.CRYPT>
	//* 218  475:aload           6
	//* 219  477:iconst_0        
	//* 220  478:invokevirtual   #178 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 221  481:invokevirtual   #54  <Method boolean PdfName.equals(Object)>
	//* 222  484:ifeq            78
								obj = null;
	//  223  487:aconst_null     
	//  224  488:astore          4
						}
					}
				}
		}
		if(obj != null && ((PdfEncryption) (obj)).isEmbeddedFilesOnly())
		{
			obj1 = ((Object) (new PdfArray()));
			obj2 = ((Object) (new PdfArray()));
			obj3 = ((Object) (new PdfDictionary()));
			((PdfDictionary) (obj3)).put(PdfName.NAME, ((PdfObject) (PdfName.STDCF)));
			((PdfArray) (obj1)).add(((PdfObject) (PdfName.CRYPT)));
			((PdfArray) (obj2)).add(((PdfObject) (obj3)));
			if(compressed)
			{
				((PdfArray) (obj1)).add(((PdfObject) (PdfName.FLATEDECODE)));
				((PdfArray) (obj2)).add(((PdfObject) (new PdfNull())));
			}
			put(PdfName.FILTER, ((PdfObject) (obj1)));
			put(PdfName.DECODEPARMS, ((PdfObject) (obj2)));
		}
		obj1 = ((Object) (get(PdfName.LENGTH)));
		if(obj != null && obj1 != null && ((PdfObject) (obj1)).isNumber())
		{
			i = ((PdfNumber)obj1).intValue();
			put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(((PdfEncryption) (obj)).calculateStreamSize(i)))));
			superToPdf(pdfwriter, outputstream);
			put(PdfName.LENGTH, ((PdfObject) (obj1)));
		} else
	//* 225  490:goto            78
		{
			superToPdf(pdfwriter, outputstream);
	//  226  493:aload_0         
	//  227  494:aload_1         
	//  228  495:aload_2         
	//  229  496:invokevirtual   #109 <Method void superToPdf(PdfWriter, OutputStream)>
		}
		outputstream.write(STARTSTREAM);
		if(inputStream == null)
			break MISSING_BLOCK_LABEL_523;
		rawLength = 0;
		obj3 = null;
		outputstreamcounter = new OutputStreamCounter(outputstream);
		obj1 = null;
		obj2 = ((Object) (outputstreamcounter));
		pdfwriter = ((PdfWriter) (obj2));
		if(obj != null)
		{
			obj1 = ((Object) (((PdfEncryption) (obj)).getEncryptionStream(((OutputStream) (obj2)))));
			pdfwriter = ((PdfWriter) (obj1));
		}
		obj = null;
		obj2 = obj3;
		obj3 = obj;
		obj = ((Object) (pdfwriter));
		if(compressed)
		{
			obj3 = ((Object) (new Deflater(compressionLevel)));
			obj2 = ((Object) (new DeflaterOutputStream(((OutputStream) (pdfwriter)), ((Deflater) (obj3)), 32768)));
			obj = obj2;
		}
		pdfwriter = ((PdfWriter) (new byte[4192]));
_L3:
		i = inputStream.read(((byte []) (pdfwriter)));
		if(i > 0) goto _L2; else goto _L1
_L1:
		if(obj2 != null)
		{
			((DeflaterOutputStream) (obj2)).finish();
			((Deflater) (obj3)).end();
		}
		if(obj1 != null)
			((OutputStreamEncryption) (obj1)).finish();
		inputStreamLength = (int)outputstreamcounter.getCounter();
_L4:
		outputstream.write(ENDSTREAM);
		return;
	//* 230  499:goto            264
_L2:
		((OutputStream) (obj)).write(((byte []) (pdfwriter)), 0, i);
	//  231  502:aload           4
	//  232  504:aload_1         
	//  233  505:iconst_0        
	//  234  506:iload_3         
	//  235  507:invokevirtual   #181 <Method void OutputStream.write(byte[], int, int)>
		rawLength = rawLength + i;
	//  236  510:aload_0         
	//  237  511:aload_0         
	//  238  512:getfield        #122 <Field int rawLength>
	//  239  515:iload_3         
	//  240  516:iadd            
	//  241  517:putfield        #122 <Field int rawLength>
		  goto _L3
	//* 242  520:goto            381
		if(obj == null)
	//* 243  523:aload           4
	//* 244  525:ifnonnull       557
		{
			if(streamBytes != null)
	//* 245  528:aload_0         
	//* 246  529:getfield        #185 <Field ByteArrayOutputStream streamBytes>
	//* 247  532:ifnull          546
				streamBytes.writeTo(outputstream);
	//  248  535:aload_0         
	//  249  536:getfield        #185 <Field ByteArrayOutputStream streamBytes>
	//  250  539:aload_2         
	//  251  540:invokevirtual   #190 <Method void ByteArrayOutputStream.writeTo(OutputStream)>
			else
	//* 252  543:goto            429
				outputstream.write(bytes);
	//  253  546:aload_2         
	//  254  547:aload_0         
	//  255  548:getfield        #193 <Field byte[] bytes>
	//  256  551:invokevirtual   #118 <Method void OutputStream.write(byte[])>
		} else
	//* 257  554:goto            429
		{
			if(streamBytes != null)
	//* 258  557:aload_0         
	//* 259  558:getfield        #185 <Field ByteArrayOutputStream streamBytes>
	//* 260  561:ifnull          585
				pdfwriter = ((PdfWriter) (((PdfEncryption) (obj)).encryptByteArray(streamBytes.toByteArray())));
	//  261  564:aload           4
	//  262  566:aload_0         
	//  263  567:getfield        #185 <Field ByteArrayOutputStream streamBytes>
	//  264  570:invokevirtual   #197 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  265  573:invokevirtual   #201 <Method byte[] PdfEncryption.encryptByteArray(byte[])>
	//  266  576:astore_1        
			else
	//* 267  577:aload_2         
	//* 268  578:aload_1         
	//* 269  579:invokevirtual   #118 <Method void OutputStream.write(byte[])>
	//* 270  582:goto            429
				pdfwriter = ((PdfWriter) (((PdfEncryption) (obj)).encryptByteArray(bytes)));
	//  271  585:aload           4
	//  272  587:aload_0         
	//  273  588:getfield        #193 <Field byte[] bytes>
	//  274  591:invokevirtual   #201 <Method byte[] PdfEncryption.encryptByteArray(byte[])>
	//  275  594:astore_1        
			outputstream.write(((byte []) (pdfwriter)));
		}
		  goto _L4
	//* 276  595:goto            577
	}
}
