// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocWriter;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfWriter

public static class PdfWriter$PdfBody$PdfCrossReference
	implements Comparable
{

	public int compareTo(PdfWriter$PdfBody$PdfCrossReference pdfwriter$pdfbody$pdfcrossreference)
	{
		if(refnum < pdfwriter$pdfbody$pdfcrossreference.refnum)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field int refnum>
	//*   2    4:aload_1         
	//*   3    5:getfield        #30  <Field int refnum>
	//*   4    8:icmpge          13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		return refnum != pdfwriter$pdfbody$pdfcrossreference.refnum ? 1 : 0;
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field int refnum>
	//    9   17:aload_1         
	//   10   18:getfield        #30  <Field int refnum>
	//   11   21:icmpne          26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((PdfWriter$PdfBody$PdfCrossReference)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class PdfWriter$PdfBody$PdfCrossReference>
	//    3    5:invokevirtual   #40  <Method int compareTo(PdfWriter$PdfBody$PdfCrossReference)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(obj instanceof PdfWriter$PdfBody$PdfCrossReference)
	//*   4    4:aload_1         
	//*   5    5:instanceof      #2   <Class PdfWriter$PdfBody$PdfCrossReference>
	//*   6    8:ifeq            31
		{
			obj = ((Object) ((PdfWriter$PdfBody$PdfCrossReference)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class PdfWriter$PdfBody$PdfCrossReference>
	//    9   15:astore_1        
			flag = flag1;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(refnum == ((PdfWriter$PdfBody$PdfCrossReference) (obj)).refnum)
	//*  12   18:aload_0         
	//*  13   19:getfield        #30  <Field int refnum>
	//*  14   22:aload_1         
	//*  15   23:getfield        #30  <Field int refnum>
	//*  16   26:icmpne          31
				flag = true;
	//   17   29:iconst_1        
	//   18   30:istore_2        
		}
		return flag;
	//   19   31:iload_2         
	//   20   32:ireturn         
	}

	public int getRefnum()
	{
		return refnum;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int refnum>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return refnum;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int refnum>
	//    2    4:ireturn         
	}

	public void toPdf(int i, OutputStream outputstream)
		throws IOException
	{
		outputstream.write(((int) ((byte)type)));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field int type>
	//    3    5:int2byte        
	//    4    6:invokevirtual   #55  <Method void OutputStream.write(int)>
		do
		{
			i--;
	//    5    9:iload_1         
	//    6   10:iconst_1        
	//    7   11:isub            
	//    8   12:istore_1        
			if(i >= 0)
	//*   9   13:iload_1         
	//*  10   14:iflt            39
			{
				outputstream.write(((int) ((byte)(int)(offset >>> i * 8 & 255L))));
	//   11   17:aload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #28  <Field long offset>
	//   14   22:iload_1         
	//   15   23:bipush          8
	//   16   25:imul            
	//   17   26:lushr           
	//   18   27:ldc2w           #56  <Long 255L>
	//   19   30:land            
	//   20   31:l2i             
	//   21   32:int2byte        
	//   22   33:invokevirtual   #55  <Method void OutputStream.write(int)>
			} else
	//*  23   36:goto            9
			{
				outputstream.write(((int) ((byte)(generation >>> 8 & 0xff))));
	//   24   39:aload_2         
	//   25   40:aload_0         
	//   26   41:getfield        #32  <Field int generation>
	//   27   44:bipush          8
	//   28   46:iushr           
	//   29   47:sipush          255
	//   30   50:iand            
	//   31   51:int2byte        
	//   32   52:invokevirtual   #55  <Method void OutputStream.write(int)>
				outputstream.write(((int) ((byte)(generation & 0xff))));
	//   33   55:aload_2         
	//   34   56:aload_0         
	//   35   57:getfield        #32  <Field int generation>
	//   36   60:sipush          255
	//   37   63:iand            
	//   38   64:int2byte        
	//   39   65:invokevirtual   #55  <Method void OutputStream.write(int)>
				return;
	//   40   68:return          
			}
		} while(true);
	}

	public void toPdf(OutputStream outputstream)
		throws IOException
	{
		StringBuffer stringbuffer = (new StringBuffer("0000000000")).append(offset);
	//    0    0:new             #61  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:ldc1            #63  <String "0000000000">
	//    3    6:invokespecial   #66  <Method void StringBuffer(String)>
	//    4    9:aload_0         
	//    5   10:getfield        #28  <Field long offset>
	//    6   13:invokevirtual   #70  <Method StringBuffer StringBuffer.append(long)>
	//    7   16:astore_3        
		stringbuffer.delete(0, stringbuffer.length() - 10);
	//    8   17:aload_3         
	//    9   18:iconst_0        
	//   10   19:aload_3         
	//   11   20:invokevirtual   #73  <Method int StringBuffer.length()>
	//   12   23:bipush          10
	//   13   25:isub            
	//   14   26:invokevirtual   #77  <Method StringBuffer StringBuffer.delete(int, int)>
	//   15   29:pop             
		Object obj = ((Object) ((new StringBuffer("00000")).append(generation)));
	//   16   30:new             #61  <Class StringBuffer>
	//   17   33:dup             
	//   18   34:ldc1            #79  <String "00000">
	//   19   36:invokespecial   #66  <Method void StringBuffer(String)>
	//   20   39:aload_0         
	//   21   40:getfield        #32  <Field int generation>
	//   22   43:invokevirtual   #82  <Method StringBuffer StringBuffer.append(int)>
	//   23   46:astore_2        
		((StringBuffer) (obj)).delete(0, ((StringBuffer) (obj)).length() - 5);
	//   24   47:aload_2         
	//   25   48:iconst_0        
	//   26   49:aload_2         
	//   27   50:invokevirtual   #73  <Method int StringBuffer.length()>
	//   28   53:iconst_5        
	//   29   54:isub            
	//   30   55:invokevirtual   #77  <Method StringBuffer StringBuffer.delete(int, int)>
	//   31   58:pop             
		StringBuffer stringbuffer1 = stringbuffer.append(' ').append(((StringBuffer) (obj)));
	//   32   59:aload_3         
	//   33   60:bipush          32
	//   34   62:invokevirtual   #85  <Method StringBuffer StringBuffer.append(char)>
	//   35   65:aload_2         
	//   36   66:invokevirtual   #88  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//   37   69:astore          4
		if(generation == 65535)
	//*  38   71:aload_0         
	//*  39   72:getfield        #32  <Field int generation>
	//*  40   75:ldc1            #89  <Int 65535>
	//*  41   77:icmpne          102
			obj = " f \n";
	//   42   80:ldc1            #91  <String " f \n">
	//   43   82:astore_2        
		else
	//*  44   83:aload           4
	//*  45   85:aload_2         
	//*  46   86:invokevirtual   #94  <Method StringBuffer StringBuffer.append(String)>
	//*  47   89:pop             
	//*  48   90:aload_1         
	//*  49   91:aload_3         
	//*  50   92:invokevirtual   #98  <Method String StringBuffer.toString()>
	//*  51   95:invokestatic    #104 <Method byte[] DocWriter.getISOBytes(String)>
	//*  52   98:invokevirtual   #107 <Method void OutputStream.write(byte[])>
	//*  53  101:return          
			obj = " n \n";
	//   54  102:ldc1            #109 <String " n \n">
	//   55  104:astore_2        
		stringbuffer1.append(((String) (obj)));
		outputstream.write(DocWriter.getISOBytes(stringbuffer.toString()));
	//*  56  105:goto            83
	}

	private final int generation;
	private final long offset;
	private final int refnum;
	private final int type;

	public PdfWriter$PdfBody$PdfCrossReference(int i, int j, long l, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int type>
		offset = l;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #28  <Field long offset>
		refnum = j;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #30  <Field int refnum>
		generation = k;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #32  <Field int generation>
	//   14   25:return          
	}

	public PdfWriter$PdfBody$PdfCrossReference(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		type = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #26  <Field int type>
		offset = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #28  <Field long offset>
		refnum = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #30  <Field int refnum>
		generation = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #32  <Field int generation>
	//   14   24:return          
	}

	public PdfWriter$PdfBody$PdfCrossReference(int i, long l, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		type = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field int type>
		offset = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #28  <Field long offset>
		refnum = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #30  <Field int refnum>
		generation = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #32  <Field int generation>
	//   14   25:return          
	}
}
