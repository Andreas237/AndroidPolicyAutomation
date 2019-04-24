// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TiffWriter

public static abstract class TiffWriter$FieldBase
{

	public int getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int tag>
	//    2    4:ireturn         
	}

	public int getValueSize()
	{
		return data.length + 1 & -2;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field byte[] data>
	//    2    4:arraylength     
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:bipush          -2
	//    6    9:iand            
	//    7   10:ireturn         
	}

	public void setOffset(int i)
	{
		offset = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int offset>
	//    3    5:return          
	}

	public void writeField(OutputStream outputstream)
		throws IOException
	{
		TiffWriter.writeShort(tag, outputstream);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int tag>
	//    2    4:aload_1         
	//    3    5:invokestatic    #43  <Method void TiffWriter.writeShort(int, OutputStream)>
		TiffWriter.writeShort(fieldType, outputstream);
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field int fieldType>
	//    6   12:aload_1         
	//    7   13:invokestatic    #43  <Method void TiffWriter.writeShort(int, OutputStream)>
		TiffWriter.writeLong(count, outputstream);
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field int count>
	//   10   20:aload_1         
	//   11   21:invokestatic    #46  <Method void TiffWriter.writeLong(int, OutputStream)>
		if(data.length <= 4)
	//*  12   24:aload_0         
	//*  13   25:getfield        #31  <Field byte[] data>
	//*  14   28:arraylength     
	//*  15   29:iconst_4        
	//*  16   30:icmpgt          64
		{
			outputstream.write(data);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #31  <Field byte[] data>
	//   20   38:invokevirtual   #52  <Method void OutputStream.write(byte[])>
			for(int i = data.length; i < 4; i++)
	//*  21   41:aload_0         
	//*  22   42:getfield        #31  <Field byte[] data>
	//*  23   45:arraylength     
	//*  24   46:istore_2        
	//*  25   47:iload_2         
	//*  26   48:iconst_4        
	//*  27   49:icmpge          72
				outputstream.write(0);
	//   28   52:aload_1         
	//   29   53:iconst_0        
	//   30   54:invokevirtual   #54  <Method void OutputStream.write(int)>

	//   31   57:iload_2         
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore_2        
		} else
	//*  35   61:goto            47
		{
			TiffWriter.writeLong(offset, outputstream);
	//   36   64:aload_0         
	//   37   65:getfield        #35  <Field int offset>
	//   38   68:aload_1         
	//   39   69:invokestatic    #46  <Method void TiffWriter.writeLong(int, OutputStream)>
		}
	//   40   72:return          
	}

	public void writeValue(OutputStream outputstream)
		throws IOException
	{
		if(data.length > 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field byte[] data>
	//*   2    4:arraylength     
	//*   3    5:iconst_4        
	//*   4    6:icmpgt          10
	//*   5    9:return          
		{
			outputstream.write(data);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #31  <Field byte[] data>
	//    9   15:invokevirtual   #52  <Method void OutputStream.write(byte[])>
			if((data.length & 1) == 1)
	//*  10   18:aload_0         
	//*  11   19:getfield        #31  <Field byte[] data>
	//*  12   22:arraylength     
	//*  13   23:iconst_1        
	//*  14   24:iand            
	//*  15   25:iconst_1        
	//*  16   26:icmpne          9
			{
				outputstream.write(0);
	//   17   29:aload_1         
	//   18   30:iconst_0        
	//   19   31:invokevirtual   #54  <Method void OutputStream.write(int)>
				return;
	//   20   34:return          
			}
		}
	}

	private int count;
	protected byte data[];
	private int fieldType;
	private int offset;
	private int tag;

	protected TiffWriter$FieldBase(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		tag = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int tag>
		fieldType = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int fieldType>
		count = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int count>
	//   11   19:return          
	}
}
