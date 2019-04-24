// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfIndirectReference, PdfWriter, PdfReader, PdfEncodings

public class PRIndirectReference extends PdfIndirectReference
{

	public PRIndirectReference(PdfReader pdfreader, int i)
	{
		this(pdfreader, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #11  <Method void PRIndirectReference(PdfReader, int, int)>
	//    5    7:return          
	}

	public PRIndirectReference(PdfReader pdfreader, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void PdfIndirectReference()>
		type = 10;
	//    2    4:aload_0         
	//    3    5:bipush          10
	//    4    7:putfield        #19  <Field int type>
		number = i;
	//    5   10:aload_0         
	//    6   11:iload_2         
	//    7   12:putfield        #22  <Field int number>
		generation = j;
	//    8   15:aload_0         
	//    9   16:iload_3         
	//   10   17:putfield        #25  <Field int generation>
		reader = pdfreader;
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:putfield        #27  <Field PdfReader reader>
	//   14   25:return          
	}

	public PdfReader getReader()
	{
		return reader;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field PdfReader reader>
	//    2    4:areturn         
	}

	public void setNumber(int i, int j)
	{
		number = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int number>
		generation = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field int generation>
	//    6   10:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		if(pdfwriter != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          80
		{
			int i = pdfwriter.getNewObjectNumber(reader, number, generation);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field PdfReader reader>
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field int number>
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field int generation>
	//    9   17:invokevirtual   #41  <Method int PdfWriter.getNewObjectNumber(PdfReader, int, int)>
	//   10   20:istore_3        
			pdfwriter = ((PdfWriter) ((new StringBuffer()).append(i).append(" ")));
	//   11   21:new             #43  <Class StringBuffer>
	//   12   24:dup             
	//   13   25:invokespecial   #44  <Method void StringBuffer()>
	//   14   28:iload_3         
	//   15   29:invokevirtual   #48  <Method StringBuffer StringBuffer.append(int)>
	//   16   32:ldc1            #50  <String " ">
	//   17   34:invokevirtual   #53  <Method StringBuffer StringBuffer.append(String)>
	//   18   37:astore_1        
			if(reader.isAppendable())
	//*  19   38:aload_0         
	//*  20   39:getfield        #27  <Field PdfReader reader>
	//*  21   42:invokevirtual   #59  <Method boolean PdfReader.isAppendable()>
	//*  22   45:ifeq            75
				i = generation;
	//   23   48:aload_0         
	//   24   49:getfield        #25  <Field int generation>
	//   25   52:istore_3        
			else
	//*  26   53:aload_2         
	//*  27   54:aload_1         
	//*  28   55:iload_3         
	//*  29   56:invokevirtual   #48  <Method StringBuffer StringBuffer.append(int)>
	//*  30   59:ldc1            #61  <String " R">
	//*  31   61:invokevirtual   #53  <Method StringBuffer StringBuffer.append(String)>
	//*  32   64:invokevirtual   #65  <Method String StringBuffer.toString()>
	//*  33   67:aconst_null     
	//*  34   68:invokestatic    #71  <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//*  35   71:invokevirtual   #77  <Method void OutputStream.write(byte[])>
	//*  36   74:return          
				i = 0;
	//   37   75:iconst_0        
	//   38   76:istore_3        
			outputstream.write(PdfEncodings.convertToBytes(((StringBuffer) (pdfwriter)).append(i).append(" R").toString(), ((String) (null))));
			return;
		} else
	//*  39   77:goto            53
		{
			super.toPdf(((PdfWriter) (null)), outputstream);
	//   40   80:aload_0         
	//   41   81:aconst_null     
	//   42   82:aload_2         
	//   43   83:invokespecial   #79  <Method void PdfIndirectReference.toPdf(PdfWriter, OutputStream)>
			return;
	//   44   86:return          
		}
	}

	protected PdfReader reader;
}
