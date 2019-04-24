// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStream, BadPdfFormatException, PdfContentByte, PdfWriter, 
//			ByteBuffer, PdfName, PdfNumber

class PdfContents extends PdfStream
{

	PdfContents(PdfContentByte pdfcontentbyte, PdfContentByte pdfcontentbyte1, PdfContentByte pdfcontentbyte2, PdfContentByte pdfcontentbyte3, Rectangle rectangle)
		throws BadPdfFormatException
	{
		Deflater deflater;
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void PdfStream()>
		deflater = null;
	//    2    4:aconst_null     
	//    3    5:astore          6
		streamBytes = new ByteArrayOutputStream();
	//    4    7:aload_0         
	//    5    8:new             #54  <Class ByteArrayOutputStream>
	//    6   11:dup             
	//    7   12:invokespecial   #55  <Method void ByteArrayOutputStream()>
	//    8   15:putfield        #59  <Field ByteArrayOutputStream streamBytes>
		if(!Document.compress) goto _L2; else goto _L1
	//    9   18:getstatic       #65  <Field boolean Document.compress>
	//   10   21:ifeq            308
_L1:
		compressed = true;
	//   11   24:aload_0         
	//   12   25:iconst_1        
	//   13   26:putfield        #68  <Field boolean compressed>
		if(pdfcontentbyte2 == null) goto _L4; else goto _L3
	//   14   29:aload_3         
	//   15   30:ifnull          277
_L3:
		compressionLevel = pdfcontentbyte2.getPdfWriter().getCompressionLevel();
	//   16   33:aload_0         
	//   17   34:aload_3         
	//   18   35:invokevirtual   #74  <Method PdfWriter PdfContentByte.getPdfWriter()>
	//   19   38:invokevirtual   #80  <Method int PdfWriter.getCompressionLevel()>
	//   20   41:putfield        #84  <Field int compressionLevel>
_L10:
		deflater = new Deflater(compressionLevel);
	//   21   44:new             #86  <Class Deflater>
	//   22   47:dup             
	//   23   48:aload_0         
	//   24   49:getfield        #84  <Field int compressionLevel>
	//   25   52:invokespecial   #89  <Method void Deflater(int)>
	//   26   55:astore          6
		Object obj = ((Object) (new DeflaterOutputStream(((OutputStream) (streamBytes)), deflater)));
	//   27   57:new             #91  <Class DeflaterOutputStream>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:getfield        #59  <Field ByteArrayOutputStream streamBytes>
	//   31   65:aload           6
	//   32   67:invokespecial   #94  <Method void DeflaterOutputStream(OutputStream, Deflater)>
	//   33   70:astore          7
_L11:
		rectangle.getRotation();
	//   34   72:aload           5
	//   35   74:invokevirtual   #99  <Method int Rectangle.getRotation()>
		JVM INSTR lookupswitch 3: default 481
	//	               90: 317
	//	               180: 367
	//	               270: 427;
	//   36   77:lookupswitch    3: default 481
	//	               90: 317
	//	               180: 367
	//	               270: 427
		   goto _L5 _L6 _L7 _L8
_L5:
		if(pdfcontentbyte.size() > 0)
	//*  37  112:aload_1         
	//*  38  113:invokevirtual   #102 <Method int PdfContentByte.size()>
	//*  39  116:ifle            144
		{
			((OutputStream) (obj)).write(SAVESTATE);
	//   40  119:aload           7
	//   41  121:getstatic       #23  <Field byte[] SAVESTATE>
	//   42  124:invokevirtual   #108 <Method void OutputStream.write(byte[])>
			pdfcontentbyte.getInternalBuffer().writeTo(((OutputStream) (obj)));
	//   43  127:aload_1         
	//   44  128:invokevirtual   #112 <Method ByteBuffer PdfContentByte.getInternalBuffer()>
	//   45  131:aload           7
	//   46  133:invokevirtual   #118 <Method void ByteBuffer.writeTo(OutputStream)>
			((OutputStream) (obj)).write(RESTORESTATE);
	//   47  136:aload           7
	//   48  138:getstatic       #27  <Field byte[] RESTORESTATE>
	//   49  141:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		}
		if(pdfcontentbyte1.size() > 0)
	//*  50  144:aload_2         
	//*  51  145:invokevirtual   #102 <Method int PdfContentByte.size()>
	//*  52  148:ifle            176
		{
			((OutputStream) (obj)).write(SAVESTATE);
	//   53  151:aload           7
	//   54  153:getstatic       #23  <Field byte[] SAVESTATE>
	//   55  156:invokevirtual   #108 <Method void OutputStream.write(byte[])>
			pdfcontentbyte1.getInternalBuffer().writeTo(((OutputStream) (obj)));
	//   56  159:aload_2         
	//   57  160:invokevirtual   #112 <Method ByteBuffer PdfContentByte.getInternalBuffer()>
	//   58  163:aload           7
	//   59  165:invokevirtual   #118 <Method void ByteBuffer.writeTo(OutputStream)>
			((OutputStream) (obj)).write(RESTORESTATE);
	//   60  168:aload           7
	//   61  170:getstatic       #27  <Field byte[] RESTORESTATE>
	//   62  173:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		}
		if(pdfcontentbyte2 == null)
			break MISSING_BLOCK_LABEL_205;
	//   63  176:aload_3         
	//   64  177:ifnull          205
		((OutputStream) (obj)).write(SAVESTATE);
	//   65  180:aload           7
	//   66  182:getstatic       #23  <Field byte[] SAVESTATE>
	//   67  185:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		pdfcontentbyte2.getInternalBuffer().writeTo(((OutputStream) (obj)));
	//   68  188:aload_3         
	//   69  189:invokevirtual   #112 <Method ByteBuffer PdfContentByte.getInternalBuffer()>
	//   70  192:aload           7
	//   71  194:invokevirtual   #118 <Method void ByteBuffer.writeTo(OutputStream)>
		((OutputStream) (obj)).write(RESTORESTATE);
	//   72  197:aload           7
	//   73  199:getstatic       #27  <Field byte[] RESTORESTATE>
	//   74  202:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		if(pdfcontentbyte3.size() > 0)
	//*  75  205:aload           4
	//*  76  207:invokevirtual   #102 <Method int PdfContentByte.size()>
	//*  77  210:ifle            223
			pdfcontentbyte3.getInternalBuffer().writeTo(((OutputStream) (obj)));
	//   78  213:aload           4
	//   79  215:invokevirtual   #112 <Method ByteBuffer PdfContentByte.getInternalBuffer()>
	//   80  218:aload           7
	//   81  220:invokevirtual   #118 <Method void ByteBuffer.writeTo(OutputStream)>
		((OutputStream) (obj)).close();
	//   82  223:aload           7
	//   83  225:invokevirtual   #121 <Method void OutputStream.close()>
		if(deflater == null)
			break MISSING_BLOCK_LABEL_238;
	//   84  228:aload           6
	//   85  230:ifnull          238
		deflater.end();
	//   86  233:aload           6
	//   87  235:invokevirtual   #124 <Method void Deflater.end()>
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(streamBytes.size()))));
	//   88  238:aload_0         
	//   89  239:getstatic       #130 <Field PdfName PdfName.LENGTH>
	//   90  242:new             #132 <Class PdfNumber>
	//   91  245:dup             
	//   92  246:aload_0         
	//   93  247:getfield        #59  <Field ByteArrayOutputStream streamBytes>
	//   94  250:invokevirtual   #133 <Method int ByteArrayOutputStream.size()>
	//   95  253:invokespecial   #134 <Method void PdfNumber(int)>
	//   96  256:invokevirtual   #138 <Method void put(PdfName, PdfObject)>
		if(compressed)
	//*  97  259:aload_0         
	//*  98  260:getfield        #68  <Field boolean compressed>
	//*  99  263:ifeq            276
			put(PdfName.FILTER, ((PdfObject) (PdfName.FLATEDECODE)));
	//  100  266:aload_0         
	//  101  267:getstatic       #141 <Field PdfName PdfName.FILTER>
	//  102  270:getstatic       #144 <Field PdfName PdfName.FLATEDECODE>
	//  103  273:invokevirtual   #138 <Method void put(PdfName, PdfObject)>
		return;
	//  104  276:return          
_L4:
		if(pdfcontentbyte1 == null) goto _L10; else goto _L9
	//  105  277:aload_2         
	//  106  278:ifnull          44
_L9:
		compressionLevel = pdfcontentbyte1.getPdfWriter().getCompressionLevel();
	//  107  281:aload_0         
	//  108  282:aload_2         
	//  109  283:invokevirtual   #74  <Method PdfWriter PdfContentByte.getPdfWriter()>
	//  110  286:invokevirtual   #80  <Method int PdfWriter.getCompressionLevel()>
	//  111  289:putfield        #84  <Field int compressionLevel>
		  goto _L10
	//* 112  292:goto            44
		pdfcontentbyte;
	//  113  295:astore_1        
_L12:
		throw new BadPdfFormatException(((Exception) (pdfcontentbyte)).getMessage());
	//  114  296:new             #48  <Class BadPdfFormatException>
	//  115  299:dup             
	//  116  300:aload_1         
	//  117  301:invokevirtual   #148 <Method String Exception.getMessage()>
	//  118  304:invokespecial   #151 <Method void BadPdfFormatException(String)>
	//  119  307:athrow          
_L2:
		obj = ((Object) (streamBytes));
	//  120  308:aload_0         
	//  121  309:getfield        #59  <Field ByteArrayOutputStream streamBytes>
	//  122  312:astore          7
		  goto _L11
	//* 123  314:goto            72
_L6:
		((OutputStream) (obj)).write(ROTATE90);
	//  124  317:aload           7
	//  125  319:getstatic       #31  <Field byte[] ROTATE90>
	//  126  322:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		((OutputStream) (obj)).write(DocWriter.getISOBytes(ByteBuffer.formatDouble(rectangle.getTop())));
	//  127  325:aload           7
	//  128  327:aload           5
	//  129  329:invokevirtual   #155 <Method float Rectangle.getTop()>
	//  130  332:f2d             
	//  131  333:invokestatic    #159 <Method String ByteBuffer.formatDouble(double)>
	//  132  336:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//  133  339:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		((OutputStream) (obj)).write(32);
	//  134  342:aload           7
	//  135  344:bipush          32
	//  136  346:invokevirtual   #161 <Method void OutputStream.write(int)>
		((OutputStream) (obj)).write(48);
	//  137  349:aload           7
	//  138  351:bipush          48
	//  139  353:invokevirtual   #161 <Method void OutputStream.write(int)>
		((OutputStream) (obj)).write(ROTATEFINAL);
	//  140  356:aload           7
	//  141  358:getstatic       #43  <Field byte[] ROTATEFINAL>
	//  142  361:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		  goto _L5
	//* 143  364:goto            112
_L7:
		((OutputStream) (obj)).write(ROTATE180);
	//  144  367:aload           7
	//  145  369:getstatic       #35  <Field byte[] ROTATE180>
	//  146  372:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		((OutputStream) (obj)).write(DocWriter.getISOBytes(ByteBuffer.formatDouble(rectangle.getRight())));
	//  147  375:aload           7
	//  148  377:aload           5
	//  149  379:invokevirtual   #164 <Method float Rectangle.getRight()>
	//  150  382:f2d             
	//  151  383:invokestatic    #159 <Method String ByteBuffer.formatDouble(double)>
	//  152  386:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//  153  389:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		((OutputStream) (obj)).write(32);
	//  154  392:aload           7
	//  155  394:bipush          32
	//  156  396:invokevirtual   #161 <Method void OutputStream.write(int)>
		((OutputStream) (obj)).write(DocWriter.getISOBytes(ByteBuffer.formatDouble(rectangle.getTop())));
	//  157  399:aload           7
	//  158  401:aload           5
	//  159  403:invokevirtual   #155 <Method float Rectangle.getTop()>
	//  160  406:f2d             
	//  161  407:invokestatic    #159 <Method String ByteBuffer.formatDouble(double)>
	//  162  410:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//  163  413:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		((OutputStream) (obj)).write(ROTATEFINAL);
	//  164  416:aload           7
	//  165  418:getstatic       #43  <Field byte[] ROTATEFINAL>
	//  166  421:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		  goto _L5
	//* 167  424:goto            112
_L8:
		((OutputStream) (obj)).write(ROTATE270);
	//  168  427:aload           7
	//  169  429:getstatic       #39  <Field byte[] ROTATE270>
	//  170  432:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		((OutputStream) (obj)).write(48);
	//  171  435:aload           7
	//  172  437:bipush          48
	//  173  439:invokevirtual   #161 <Method void OutputStream.write(int)>
		((OutputStream) (obj)).write(32);
	//  174  442:aload           7
	//  175  444:bipush          32
	//  176  446:invokevirtual   #161 <Method void OutputStream.write(int)>
		((OutputStream) (obj)).write(DocWriter.getISOBytes(ByteBuffer.formatDouble(rectangle.getRight())));
	//  177  449:aload           7
	//  178  451:aload           5
	//  179  453:invokevirtual   #164 <Method float Rectangle.getRight()>
	//  180  456:f2d             
	//  181  457:invokestatic    #159 <Method String ByteBuffer.formatDouble(double)>
	//  182  460:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//  183  463:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		((OutputStream) (obj)).write(ROTATEFINAL);
	//  184  466:aload           7
	//  185  468:getstatic       #43  <Field byte[] ROTATEFINAL>
	//  186  471:invokevirtual   #108 <Method void OutputStream.write(byte[])>
		  goto _L5
	//* 187  474:goto            112
		pdfcontentbyte;
	//  188  477:astore_1        
		  goto _L12
	//* 189  478:goto            296
	//* 190  481:goto            112
	}

	static final byte RESTORESTATE[] = DocWriter.getISOBytes("Q\n");
	static final byte ROTATE180[] = DocWriter.getISOBytes("-1 0 0 -1 ");
	static final byte ROTATE270[] = DocWriter.getISOBytes("0 -1 1 0 ");
	static final byte ROTATE90[] = DocWriter.getISOBytes("0 1 -1 0 ");
	static final byte ROTATEFINAL[] = DocWriter.getISOBytes(" cm\n");
	static final byte SAVESTATE[] = DocWriter.getISOBytes("q\n");

	static 
	{
	//    0    0:ldc1            #15  <String "q\n">
	//    1    2:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//    2    5:putstatic       #23  <Field byte[] SAVESTATE>
	//    3    8:ldc1            #25  <String "Q\n">
	//    4   10:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//    5   13:putstatic       #27  <Field byte[] RESTORESTATE>
	//    6   16:ldc1            #29  <String "0 1 -1 0 ">
	//    7   18:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//    8   21:putstatic       #31  <Field byte[] ROTATE90>
	//    9   24:ldc1            #33  <String "-1 0 0 -1 ">
	//   10   26:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//   11   29:putstatic       #35  <Field byte[] ROTATE180>
	//   12   32:ldc1            #37  <String "0 -1 1 0 ">
	//   13   34:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//   14   37:putstatic       #39  <Field byte[] ROTATE270>
	//   15   40:ldc1            #41  <String " cm\n">
	//   16   42:invokestatic    #21  <Method byte[] DocWriter.getISOBytes(String)>
	//   17   45:putstatic       #43  <Field byte[] ROTATEFINAL>
	//*  18   48:return          
	}
}
