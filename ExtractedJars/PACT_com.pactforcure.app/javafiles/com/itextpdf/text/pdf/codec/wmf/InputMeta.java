// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec.wmf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Utilities;
import java.io.IOException;
import java.io.InputStream;

public class InputMeta
{

	public InputMeta(InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		in = inputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field InputStream in>
	//    5    9:return          
	}

	public int getLength()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int length>
	//    2    4:ireturn         
	}

	public int readByte()
		throws IOException
	{
		length = length + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field int length>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #20  <Field int length>
		return in.read() & 0xff;
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field InputStream in>
	//    8   14:invokevirtual   #28  <Method int InputStream.read()>
	//    9   17:sipush          255
	//   10   20:iand            
	//   11   21:ireturn         
	}

	public BaseColor readColor()
		throws IOException
	{
		int i = readByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method int readByte()>
	//    2    4:istore_1        
		int j = readByte();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #33  <Method int readByte()>
	//    5    9:istore_2        
		int k = readByte();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #33  <Method int readByte()>
	//    8   14:istore_3        
		readByte();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #33  <Method int readByte()>
	//   11   19:pop             
		return new BaseColor(i, j, k);
	//   12   20:new             #35  <Class BaseColor>
	//   13   23:dup             
	//   14   24:iload_1         
	//   15   25:iload_2         
	//   16   26:iload_3         
	//   17   27:invokespecial   #38  <Method void BaseColor(int, int, int)>
	//   18   30:areturn         
	}

	public int readInt()
		throws IOException
	{
		length = length + 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field int length>
	//    3    5:iconst_4        
	//    4    6:iadd            
	//    5    7:putfield        #20  <Field int length>
		int i = in.read();
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field InputStream in>
	//    8   14:invokevirtual   #28  <Method int InputStream.read()>
	//    9   17:istore_1        
		if(i < 0)
	//*  10   18:iload_1         
	//*  11   19:ifge            24
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		else
			return i + (in.read() << 8) + (in.read() << 16) + (in.read() << 24);
	//   14   24:iload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #15  <Field InputStream in>
	//   17   29:invokevirtual   #28  <Method int InputStream.read()>
	//   18   32:bipush          8
	//   19   34:ishl            
	//   20   35:iadd            
	//   21   36:aload_0         
	//   22   37:getfield        #15  <Field InputStream in>
	//   23   40:invokevirtual   #28  <Method int InputStream.read()>
	//   24   43:bipush          16
	//   25   45:ishl            
	//   26   46:iadd            
	//   27   47:aload_0         
	//   28   48:getfield        #15  <Field InputStream in>
	//   29   51:invokevirtual   #28  <Method int InputStream.read()>
	//   30   54:bipush          24
	//   31   56:ishl            
	//   32   57:iadd            
	//   33   58:ireturn         
	}

	public int readShort()
		throws IOException
	{
		int j = readWord();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method int readWord()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j > 32767)
	//*   5    7:iload_2         
	//*   6    8:sipush          32767
	//*   7   11:icmple          19
			i = j - 0x10000;
	//    8   14:iload_2         
	//    9   15:ldc1            #44  <Int 0x10000>
	//   10   17:isub            
	//   11   18:istore_1        
		return i;
	//   12   19:iload_1         
	//   13   20:ireturn         
	}

	public int readWord()
		throws IOException
	{
		length = length + 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field int length>
	//    3    5:iconst_2        
	//    4    6:iadd            
	//    5    7:putfield        #20  <Field int length>
		int i = in.read();
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field InputStream in>
	//    8   14:invokevirtual   #28  <Method int InputStream.read()>
	//    9   17:istore_1        
		if(i < 0)
	//*  10   18:iload_1         
	//*  11   19:ifge            24
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		else
			return (in.read() << 8) + i & 0xffff;
	//   14   24:aload_0         
	//   15   25:getfield        #15  <Field InputStream in>
	//   16   28:invokevirtual   #28  <Method int InputStream.read()>
	//   17   31:bipush          8
	//   18   33:ishl            
	//   19   34:iload_1         
	//   20   35:iadd            
	//   21   36:ldc1            #45  <Int 65535>
	//   22   38:iand            
	//   23   39:ireturn         
	}

	public void skip(int i)
		throws IOException
	{
		length = length + i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field int length>
	//    3    5:iload_1         
	//    4    6:iadd            
	//    5    7:putfield        #20  <Field int length>
		Utilities.skip(in, i);
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field InputStream in>
	//    8   14:iload_1         
	//    9   15:invokestatic    #52  <Method void Utilities.skip(InputStream, int)>
	//   10   18:return          
	}

	InputStream in;
	int length;
}
