// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, OutputStreamCounter, PdfWriter

public class PdfLiteral extends PdfObject
{

	public PdfLiteral(int i)
	{
		super(0, (byte[])null);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:checkcast       #10  <Class byte[]>
	//    4    6:invokespecial   #13  <Method void PdfObject(int, byte[])>
		bytes = new byte[i];
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:newarray        byte[]
	//    8   13:putfield        #16  <Field byte[] bytes>
		Arrays.fill(bytes, (byte)32);
	//    9   16:aload_0         
	//   10   17:getfield        #16  <Field byte[] bytes>
	//   11   20:bipush          32
	//   12   22:invokestatic    #22  <Method void Arrays.fill(byte[], byte)>
	//   13   25:return          
	}

	public PdfLiteral(int i, String s)
	{
		super(i, s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void PdfObject(int, String)>
	//    4    6:return          
	}

	public PdfLiteral(int i, byte abyte0[])
	{
		super(i, abyte0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void PdfObject(int, byte[])>
	//    4    6:return          
	}

	public PdfLiteral(String s)
	{
		super(0, s);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokespecial   #26  <Method void PdfObject(int, String)>
	//    4    6:return          
	}

	public PdfLiteral(byte abyte0[])
	{
		super(0, abyte0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokespecial   #13  <Method void PdfObject(int, byte[])>
	//    4    6:return          
	}

	public int getPosLength()
	{
		if(bytes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field byte[] bytes>
	//*   2    4:ifnull          13
			return bytes.length;
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field byte[] bytes>
	//    5   11:arraylength     
	//    6   12:ireturn         
		else
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public long getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long position>
	//    2    4:lreturn         
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		if(outputstream instanceof OutputStreamCounter)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #40  <Class OutputStreamCounter>
	//*   2    4:ifeq            18
			position = ((OutputStreamCounter)outputstream).getCounter();
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:checkcast       #40  <Class OutputStreamCounter>
	//    6   12:invokevirtual   #43  <Method long OutputStreamCounter.getCounter()>
	//    7   15:putfield        #34  <Field long position>
		super.toPdf(pdfwriter, outputstream);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #45  <Method void PdfObject.toPdf(PdfWriter, OutputStream)>
	//   12   24:return          
	}

	private long position;
}
