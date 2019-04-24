// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocWriter;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfWriter, PdfName, PdfNumber, 
//			PdfIndirectReference, PdfObject

public static class PdfWriter$PdfTrailer extends PdfDictionary
{

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 8, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokestatic    #58  <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		outputstream.write(DocWriter.getISOBytes("trailer\n"));
	//    4    7:aload_2         
	//    5    8:ldc1            #60  <String "trailer\n">
	//    6   10:invokestatic    #66  <Method byte[] DocWriter.getISOBytes(String)>
	//    7   13:invokevirtual   #72  <Method void OutputStream.write(byte[])>
		super.toPdf(((PdfWriter) (null)), outputstream);
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:aload_2         
	//   11   19:invokespecial   #74  <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
		outputstream.write(10);
	//   12   22:aload_2         
	//   13   23:bipush          10
	//   14   25:invokevirtual   #76  <Method void OutputStream.write(int)>
		PdfWriter.writeKeyInfo(outputstream);
	//   15   28:aload_2         
	//   16   29:invokestatic    #80  <Method void PdfWriter.writeKeyInfo(OutputStream)>
		outputstream.write(DocWriter.getISOBytes("startxref\n"));
	//   17   32:aload_2         
	//   18   33:ldc1            #82  <String "startxref\n">
	//   19   35:invokestatic    #66  <Method byte[] DocWriter.getISOBytes(String)>
	//   20   38:invokevirtual   #72  <Method void OutputStream.write(byte[])>
		outputstream.write(DocWriter.getISOBytes(String.valueOf(offset)));
	//   21   41:aload_2         
	//   22   42:aload_0         
	//   23   43:getfield        #16  <Field long offset>
	//   24   46:invokestatic    #88  <Method String String.valueOf(long)>
	//   25   49:invokestatic    #66  <Method byte[] DocWriter.getISOBytes(String)>
	//   26   52:invokevirtual   #72  <Method void OutputStream.write(byte[])>
		outputstream.write(DocWriter.getISOBytes("\n%%EOF\n"));
	//   27   55:aload_2         
	//   28   56:ldc1            #90  <String "\n%%EOF\n">
	//   29   58:invokestatic    #66  <Method byte[] DocWriter.getISOBytes(String)>
	//   30   61:invokevirtual   #72  <Method void OutputStream.write(byte[])>
	//   31   64:return          
	}

	long offset;

	public PdfWriter$PdfTrailer(int i, long l, PdfIndirectReference pdfindirectreference, PdfIndirectReference pdfindirectreference1, PdfIndirectReference pdfindirectreference2, PdfObject pdfobject, 
			long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void PdfDictionary()>
		offset = l;
	//    2    4:aload_0         
	//    3    5:lload_2         
	//    4    6:putfield        #16  <Field long offset>
		put(PdfName.SIZE, ((PdfObject) (new PdfNumber(i))));
	//    5    9:aload_0         
	//    6   10:getstatic       #22  <Field PdfName PdfName.SIZE>
	//    7   13:new             #24  <Class PdfNumber>
	//    8   16:dup             
	//    9   17:iload_1         
	//   10   18:invokespecial   #27  <Method void PdfNumber(int)>
	//   11   21:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
		put(PdfName.ROOT, ((PdfObject) (pdfindirectreference)));
	//   12   24:aload_0         
	//   13   25:getstatic       #34  <Field PdfName PdfName.ROOT>
	//   14   28:aload           4
	//   15   30:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
		if(pdfindirectreference1 != null)
	//*  16   33:aload           5
	//*  17   35:ifnull          47
			put(PdfName.INFO, ((PdfObject) (pdfindirectreference1)));
	//   18   38:aload_0         
	//   19   39:getstatic       #37  <Field PdfName PdfName.INFO>
	//   20   42:aload           5
	//   21   44:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
		if(pdfindirectreference2 != null)
	//*  22   47:aload           6
	//*  23   49:ifnull          61
			put(PdfName.ENCRYPT, ((PdfObject) (pdfindirectreference2)));
	//   24   52:aload_0         
	//   25   53:getstatic       #40  <Field PdfName PdfName.ENCRYPT>
	//   26   56:aload           6
	//   27   58:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
		if(pdfobject != null)
	//*  28   61:aload           7
	//*  29   63:ifnull          75
			put(PdfName.ID, pdfobject);
	//   30   66:aload_0         
	//   31   67:getstatic       #43  <Field PdfName PdfName.ID>
	//   32   70:aload           7
	//   33   72:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
		if(l1 > 0L)
	//*  34   75:lload           8
	//*  35   77:lconst_0        
	//*  36   78:lcmp            
	//*  37   79:ifle            98
			put(PdfName.PREV, ((PdfObject) (new PdfNumber(l1))));
	//   38   82:aload_0         
	//   39   83:getstatic       #46  <Field PdfName PdfName.PREV>
	//   40   86:new             #24  <Class PdfNumber>
	//   41   89:dup             
	//   42   90:lload           8
	//   43   92:invokespecial   #49  <Method void PdfNumber(long)>
	//   44   95:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
	//   45   98:return          
	}
}
