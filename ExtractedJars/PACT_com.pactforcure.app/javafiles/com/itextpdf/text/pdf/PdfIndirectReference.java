// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, PdfEncodings, PdfWriter

public class PdfIndirectReference extends PdfObject
{

	protected PdfIndirectReference()
	{
		super(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #12  <Method void PdfObject(int)>
		generation = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #14  <Field int generation>
	//    6   10:return          
	}

	protected PdfIndirectReference(int i, int j)
	{
		this(i, j, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #19  <Method void PdfIndirectReference(int, int, int)>
	//    5    7:return          
	}

	PdfIndirectReference(int i, int j, int k)
	{
		super(0, j + " " + k + " R");
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:new             #21  <Class StringBuffer>
	//    3    5:dup             
	//    4    6:invokespecial   #23  <Method void StringBuffer()>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #27  <Method StringBuffer StringBuffer.append(int)>
	//    7   13:ldc1            #29  <String " ">
	//    8   15:invokevirtual   #32  <Method StringBuffer StringBuffer.append(String)>
	//    9   18:iload_3         
	//   10   19:invokevirtual   #27  <Method StringBuffer StringBuffer.append(int)>
	//   11   22:ldc1            #34  <String " R">
	//   12   24:invokevirtual   #32  <Method StringBuffer StringBuffer.append(String)>
	//   13   27:invokevirtual   #38  <Method String StringBuffer.toString()>
	//   14   30:invokespecial   #41  <Method void PdfObject(int, String)>
		generation = 0;
	//   15   33:aload_0         
	//   16   34:iconst_0        
	//   17   35:putfield        #14  <Field int generation>
		number = j;
	//   18   38:aload_0         
	//   19   39:iload_2         
	//   20   40:putfield        #43  <Field int number>
		generation = k;
	//   21   43:aload_0         
	//   22   44:iload_3         
	//   23   45:putfield        #14  <Field int generation>
	//   24   48:return          
	}

	public int getGeneration()
	{
		return generation;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int generation>
	//    2    4:ireturn         
	}

	public int getNumber()
	{
		return number;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int number>
	//    2    4:ireturn         
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		outputstream.write(PdfEncodings.convertToBytes(toString(), ((String) (null))));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #51  <Method String toString()>
	//    3    5:aconst_null     
	//    4    6:invokestatic    #57  <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//    5    9:invokevirtual   #63  <Method void OutputStream.write(byte[])>
	//    6   12:return          
	}

	public String toString()
	{
		return number + " " + generation + " R";
	//    0    0:new             #21  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuffer()>
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field int number>
	//    5   11:invokevirtual   #27  <Method StringBuffer StringBuffer.append(int)>
	//    6   14:ldc1            #29  <String " ">
	//    7   16:invokevirtual   #32  <Method StringBuffer StringBuffer.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #14  <Field int generation>
	//   10   23:invokevirtual   #27  <Method StringBuffer StringBuffer.append(int)>
	//   11   26:ldc1            #34  <String " R">
	//   12   28:invokevirtual   #32  <Method StringBuffer StringBuffer.append(String)>
	//   13   31:invokevirtual   #38  <Method String StringBuffer.toString()>
	//   14   34:areturn         
	}

	protected int generation;
	protected int number;
}
