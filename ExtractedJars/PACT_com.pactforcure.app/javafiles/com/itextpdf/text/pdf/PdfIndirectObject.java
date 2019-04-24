// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocWriter;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfWriter, PdfEncryption, PdfIndirectReference, PdfObject

public class PdfIndirectObject
{

	PdfIndirectObject(int i, int j, PdfObject pdfobject, PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		generation = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field int generation>
		writer = pdfwriter;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #42  <Field PdfWriter writer>
		number = i;
	//    8   15:aload_0         
	//    9   16:iload_1         
	//   10   17:putfield        #44  <Field int number>
		generation = j;
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:putfield        #40  <Field int generation>
		object = pdfobject;
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:putfield        #46  <Field PdfObject object>
		pdfobject = null;
	//   17   30:aconst_null     
	//   18   31:astore_3        
		if(pdfwriter != null)
	//*  19   32:aload           4
	//*  20   34:ifnull          43
			pdfobject = ((PdfObject) (pdfwriter.getEncryption()));
	//   21   37:aload           4
	//   22   39:invokevirtual   #52  <Method PdfEncryption PdfWriter.getEncryption()>
	//   23   42:astore_3        
		if(pdfobject != null)
	//*  24   43:aload_3         
	//*  25   44:ifnull          53
			((PdfEncryption) (pdfobject)).setHashKey(i, j);
	//   26   47:aload_3         
	//   27   48:iload_1         
	//   28   49:iload_2         
	//   29   50:invokevirtual   #58  <Method void PdfEncryption.setHashKey(int, int)>
	//   30   53:return          
	}

	protected PdfIndirectObject(int i, PdfObject pdfobject, PdfWriter pdfwriter)
	{
		this(i, 0, pdfobject, pdfwriter);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #61  <Method void PdfIndirectObject(int, int, PdfObject, PdfWriter)>
	//    6    8:return          
	}

	PdfIndirectObject(PdfIndirectReference pdfindirectreference, PdfObject pdfobject, PdfWriter pdfwriter)
	{
		this(pdfindirectreference.getNumber(), pdfindirectreference.getGeneration(), pdfobject, pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #68  <Method int PdfIndirectReference.getNumber()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #71  <Method int PdfIndirectReference.getGeneration()>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #61  <Method void PdfIndirectObject(int, int, PdfObject, PdfWriter)>
	//    8   14:return          
	}

	public PdfIndirectReference getIndirectReference()
	{
		return new PdfIndirectReference(object.type(), number, generation);
	//    0    0:new             #64  <Class PdfIndirectReference>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field PdfObject object>
	//    4    8:invokevirtual   #78  <Method int PdfObject.type()>
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field int number>
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field int generation>
	//    9   19:invokespecial   #81  <Method void PdfIndirectReference(int, int, int)>
	//   10   22:areturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = (new StringBuffer()).append(number).append(' ').append(generation).append(" R: ");
	//    0    0:new             #85  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void StringBuffer()>
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field int number>
	//    5   11:invokevirtual   #90  <Method StringBuffer StringBuffer.append(int)>
	//    6   14:bipush          32
	//    7   16:invokevirtual   #93  <Method StringBuffer StringBuffer.append(char)>
	//    8   19:aload_0         
	//    9   20:getfield        #40  <Field int generation>
	//   10   23:invokevirtual   #90  <Method StringBuffer StringBuffer.append(int)>
	//   11   26:ldc1            #95  <String " R: ">
	//   12   28:invokevirtual   #98  <Method StringBuffer StringBuffer.append(String)>
	//   13   31:astore_2        
		String s;
		if(object != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #46  <Field PdfObject object>
	//*  16   36:ifnull          56
			s = object.toString();
	//   17   39:aload_0         
	//   18   40:getfield        #46  <Field PdfObject object>
	//   19   43:invokevirtual   #100 <Method String PdfObject.toString()>
	//   20   46:astore_1        
		else
	//*  21   47:aload_2         
	//*  22   48:aload_1         
	//*  23   49:invokevirtual   #98  <Method StringBuffer StringBuffer.append(String)>
	//*  24   52:invokevirtual   #101 <Method String StringBuffer.toString()>
	//*  25   55:areturn         
			s = "null";
	//   26   56:ldc1            #103 <String "null">
	//   27   58:astore_1        
		return stringbuffer.append(s).toString();
	//*  28   59:goto            47
	}

	protected void writeTo(OutputStream outputstream)
		throws IOException
	{
		outputstream.write(DocWriter.getISOBytes(String.valueOf(number)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field int number>
	//    3    5:invokestatic    #113 <Method String String.valueOf(int)>
	//    4    8:invokestatic    #25  <Method byte[] DocWriter.getISOBytes(String)>
	//    5   11:invokevirtual   #119 <Method void OutputStream.write(byte[])>
		outputstream.write(32);
	//    6   14:aload_1         
	//    7   15:bipush          32
	//    8   17:invokevirtual   #122 <Method void OutputStream.write(int)>
		outputstream.write(DocWriter.getISOBytes(String.valueOf(generation)));
	//    9   20:aload_1         
	//   10   21:aload_0         
	//   11   22:getfield        #40  <Field int generation>
	//   12   25:invokestatic    #113 <Method String String.valueOf(int)>
	//   13   28:invokestatic    #25  <Method byte[] DocWriter.getISOBytes(String)>
	//   14   31:invokevirtual   #119 <Method void OutputStream.write(byte[])>
		outputstream.write(STARTOBJ);
	//   15   34:aload_1         
	//   16   35:getstatic       #27  <Field byte[] STARTOBJ>
	//   17   38:invokevirtual   #119 <Method void OutputStream.write(byte[])>
		object.toPdf(writer, outputstream);
	//   18   41:aload_0         
	//   19   42:getfield        #46  <Field PdfObject object>
	//   20   45:aload_0         
	//   21   46:getfield        #42  <Field PdfWriter writer>
	//   22   49:aload_1         
	//   23   50:invokevirtual   #126 <Method void PdfObject.toPdf(PdfWriter, OutputStream)>
		outputstream.write(ENDOBJ);
	//   24   53:aload_1         
	//   25   54:getstatic       #31  <Field byte[] ENDOBJ>
	//   26   57:invokevirtual   #119 <Method void OutputStream.write(byte[])>
	//   27   60:return          
	}

	static final byte ENDOBJ[];
	static final int SIZEOBJ;
	static final byte STARTOBJ[];
	protected int generation;
	protected int number;
	protected PdfObject object;
	protected PdfWriter writer;

	static 
	{
		STARTOBJ = DocWriter.getISOBytes(" obj\n");
	//    0    0:ldc1            #19  <String " obj\n">
	//    1    2:invokestatic    #25  <Method byte[] DocWriter.getISOBytes(String)>
	//    2    5:putstatic       #27  <Field byte[] STARTOBJ>
		ENDOBJ = DocWriter.getISOBytes("\nendobj\n");
	//    3    8:ldc1            #29  <String "\nendobj\n">
	//    4   10:invokestatic    #25  <Method byte[] DocWriter.getISOBytes(String)>
	//    5   13:putstatic       #31  <Field byte[] ENDOBJ>
		SIZEOBJ = STARTOBJ.length + ENDOBJ.length;
	//    6   16:getstatic       #27  <Field byte[] STARTOBJ>
	//    7   19:arraylength     
	//    8   20:getstatic       #31  <Field byte[] ENDOBJ>
	//    9   23:arraylength     
	//   10   24:iadd            
	//   11   25:putstatic       #33  <Field int SIZEOBJ>
	//*  12   28:return          
	}
}
