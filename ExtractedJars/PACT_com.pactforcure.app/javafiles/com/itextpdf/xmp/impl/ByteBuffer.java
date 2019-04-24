// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import java.io.*;

public class ByteBuffer
{

	public ByteBuffer(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		encoding = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field String encoding>
		buffer = new byte[i];
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:newarray        byte[]
	//    8   13:putfield        #19  <Field byte[] buffer>
		length = 0;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #21  <Field int length>
	//   12   21:return          
	}

	public ByteBuffer(InputStream inputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		encoding = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field String encoding>
		length = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field int length>
		buffer = new byte[16384];
	//    8   14:aload_0         
	//    9   15:sipush          16384
	//   10   18:newarray        byte[]
	//   11   20:putfield        #19  <Field byte[] buffer>
		do
		{
			int i = inputstream.read(buffer, length, 16384);
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:getfield        #19  <Field byte[] buffer>
	//   15   28:aload_0         
	//   16   29:getfield        #21  <Field int length>
	//   17   32:sipush          16384
	//   18   35:invokevirtual   #31  <Method int InputStream.read(byte[], int, int)>
	//   19   38:istore_2        
			if(i <= 0)
				break;
	//   20   39:iload_2         
	//   21   40:ifle            75
			length = length + i;
	//   22   43:aload_0         
	//   23   44:aload_0         
	//   24   45:getfield        #21  <Field int length>
	//   25   48:iload_2         
	//   26   49:iadd            
	//   27   50:putfield        #21  <Field int length>
			if(i != 16384)
				break;
	//   28   53:iload_2         
	//   29   54:sipush          16384
	//   30   57:icmpne          75
			ensureCapacity(length + 16384);
	//   31   60:aload_0         
	//   32   61:aload_0         
	//   33   62:getfield        #21  <Field int length>
	//   34   65:sipush          16384
	//   35   68:iadd            
	//   36   69:invokespecial   #34  <Method void ensureCapacity(int)>
		} while(true);
	//   37   72:goto            23
	//   38   75:return          
	}

	public ByteBuffer(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		encoding = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field String encoding>
		buffer = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field byte[] buffer>
		length = abyte0.length;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:arraylength     
	//   11   17:putfield        #21  <Field int length>
	//   12   20:return          
	}

	public ByteBuffer(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		encoding = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field String encoding>
		if(i > abyte0.length)
	//*   5    9:iload_2         
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:icmple          25
		{
			throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
	//    9   15:new             #39  <Class ArrayIndexOutOfBoundsException>
	//   10   18:dup             
	//   11   19:ldc1            #41  <String "Valid length exceeds the buffer length.">
	//   12   21:invokespecial   #44  <Method void ArrayIndexOutOfBoundsException(String)>
	//   13   24:athrow          
		} else
		{
			buffer = abyte0;
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:putfield        #19  <Field byte[] buffer>
			length = i;
	//   17   30:aload_0         
	//   18   31:iload_2         
	//   19   32:putfield        #21  <Field int length>
			return;
	//   20   35:return          
		}
	}

	public ByteBuffer(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		encoding = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field String encoding>
		if(j > abyte0.length - i)
	//*   5    9:iload_3         
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:iload_2         
	//*   9   13:isub            
	//*  10   14:icmple          27
		{
			throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
	//   11   17:new             #39  <Class ArrayIndexOutOfBoundsException>
	//   12   20:dup             
	//   13   21:ldc1            #41  <String "Valid length exceeds the buffer length.">
	//   14   23:invokespecial   #44  <Method void ArrayIndexOutOfBoundsException(String)>
	//   15   26:athrow          
		} else
		{
			buffer = new byte[j];
	//   16   27:aload_0         
	//   17   28:iload_3         
	//   18   29:newarray        byte[]
	//   19   31:putfield        #19  <Field byte[] buffer>
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), 0, j);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:aload_0         
	//   23   37:getfield        #19  <Field byte[] buffer>
	//   24   40:iconst_0        
	//   25   41:iload_3         
	//   26   42:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
			length = j;
	//   27   45:aload_0         
	//   28   46:iload_3         
	//   29   47:putfield        #21  <Field int length>
			return;
	//   30   50:return          
		}
	}

	private void ensureCapacity(int i)
	{
		if(i > buffer.length)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #19  <Field byte[] buffer>
	//*   3    5:arraylength     
	//*   4    6:icmple          36
		{
			byte abyte0[] = buffer;
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field byte[] buffer>
	//    7   13:astore_2        
			buffer = new byte[abyte0.length * 2];
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:arraylength     
	//   11   17:iconst_2        
	//   12   18:imul            
	//   13   19:newarray        byte[]
	//   14   21:putfield        #19  <Field byte[] buffer>
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (buffer)), 0, abyte0.length);
	//   15   24:aload_2         
	//   16   25:iconst_0        
	//   17   26:aload_0         
	//   18   27:getfield        #19  <Field byte[] buffer>
	//   19   30:iconst_0        
	//   20   31:aload_2         
	//   21   32:arraylength     
	//   22   33:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
	//   23   36:return          
	}

	public void append(byte byte0)
	{
		ensureCapacity(length + 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field int length>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:invokespecial   #34  <Method void ensureCapacity(int)>
		byte abyte0[] = buffer;
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field byte[] buffer>
	//    8   14:astore_3        
		int i = length;
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field int length>
	//   11   19:istore_2        
		length = i + 1;
	//   12   20:aload_0         
	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:putfield        #21  <Field int length>
		abyte0[i] = byte0;
	//   17   27:aload_3         
	//   18   28:iload_2         
	//   19   29:iload_1         
	//   20   30:bastore         
	//   21   31:return          
	}

	public void append(ByteBuffer bytebuffer)
	{
		append(bytebuffer.buffer, 0, bytebuffer.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #19  <Field byte[] buffer>
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:getfield        #21  <Field int length>
	//    6   10:invokevirtual   #56  <Method void append(byte[], int, int)>
	//    7   13:return          
	}

	public void append(byte abyte0[])
	{
		append(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #56  <Method void append(byte[], int, int)>
	//    6    8:return          
	}

	public void append(byte abyte0[], int i, int j)
	{
		ensureCapacity(length + j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field int length>
	//    3    5:iload_3         
	//    4    6:iadd            
	//    5    7:invokespecial   #34  <Method void ensureCapacity(int)>
		System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), length, j);
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #19  <Field byte[] buffer>
	//   10   16:aload_0         
	//   11   17:getfield        #21  <Field int length>
	//   12   20:iload_3         
	//   13   21:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
		length = length + j;
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #21  <Field int length>
	//   17   29:iload_3         
	//   18   30:iadd            
	//   19   31:putfield        #21  <Field int length>
	//   20   34:return          
	}

	public byte byteAt(int i)
	{
		if(i < length)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #21  <Field int length>
	//*   3    5:icmpge          15
			return buffer[i];
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field byte[] buffer>
	//    6   12:iload_1         
	//    7   13:baload          
	//    8   14:ireturn         
		else
			throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
	//    9   15:new             #60  <Class IndexOutOfBoundsException>
	//   10   18:dup             
	//   11   19:ldc1            #62  <String "The index exceeds the valid buffer area">
	//   12   21:invokespecial   #63  <Method void IndexOutOfBoundsException(String)>
	//   13   24:athrow          
	}

	public int charAt(int i)
	{
		if(i < length)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #21  <Field int length>
	//*   3    5:icmpge          19
			return buffer[i] & 0xff;
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field byte[] buffer>
	//    6   12:iload_1         
	//    7   13:baload          
	//    8   14:sipush          255
	//    9   17:iand            
	//   10   18:ireturn         
		else
			throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
	//   11   19:new             #60  <Class IndexOutOfBoundsException>
	//   12   22:dup             
	//   13   23:ldc1            #62  <String "The index exceeds the valid buffer area">
	//   14   25:invokespecial   #63  <Method void IndexOutOfBoundsException(String)>
	//   15   28:athrow          
	}

	public InputStream getByteStream()
	{
		return ((InputStream) (new ByteArrayInputStream(buffer, 0, length)));
	//    0    0:new             #69  <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field byte[] buffer>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field int length>
	//    7   13:invokespecial   #71  <Method void ByteArrayInputStream(byte[], int, int)>
	//    8   16:areturn         
	}

	public String getEncoding()
	{
		if(encoding == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field String encoding>
	//*   2    4:ifnonnull       21
			if(length < 2)
	//*   3    7:aload_0         
	//*   4    8:getfield        #21  <Field int length>
	//*   5   11:iconst_2        
	//*   6   12:icmpge          26
				encoding = "UTF-8";
	//    7   15:aload_0         
	//    8   16:ldc1            #75  <String "UTF-8">
	//    9   18:putfield        #17  <Field String encoding>
			else
	//*  10   21:aload_0         
	//*  11   22:getfield        #17  <Field String encoding>
	//*  12   25:areturn         
			if(buffer[0] == 0)
	//*  13   26:aload_0         
	//*  14   27:getfield        #19  <Field byte[] buffer>
	//*  15   30:iconst_0        
	//*  16   31:baload          
	//*  17   32:ifne            111
			{
				if(length < 4 || buffer[1] != 0)
	//*  18   35:aload_0         
	//*  19   36:getfield        #21  <Field int length>
	//*  20   39:iconst_4        
	//*  21   40:icmplt          52
	//*  22   43:aload_0         
	//*  23   44:getfield        #19  <Field byte[] buffer>
	//*  24   47:iconst_1        
	//*  25   48:baload          
	//*  26   49:ifeq            61
					encoding = "UTF-16BE";
	//   27   52:aload_0         
	//   28   53:ldc1            #77  <String "UTF-16BE">
	//   29   55:putfield        #17  <Field String encoding>
				else
	//*  30   58:goto            21
				if((buffer[2] & 0xff) == 254 && (buffer[3] & 0xff) == 255)
	//*  31   61:aload_0         
	//*  32   62:getfield        #19  <Field byte[] buffer>
	//*  33   65:iconst_2        
	//*  34   66:baload          
	//*  35   67:sipush          255
	//*  36   70:iand            
	//*  37   71:sipush          254
	//*  38   74:icmpne          102
	//*  39   77:aload_0         
	//*  40   78:getfield        #19  <Field byte[] buffer>
	//*  41   81:iconst_3        
	//*  42   82:baload          
	//*  43   83:sipush          255
	//*  44   86:iand            
	//*  45   87:sipush          255
	//*  46   90:icmpne          102
					encoding = "UTF-32BE";
	//   47   93:aload_0         
	//   48   94:ldc1            #79  <String "UTF-32BE">
	//   49   96:putfield        #17  <Field String encoding>
				else
	//*  50   99:goto            21
					encoding = "UTF-32";
	//   51  102:aload_0         
	//   52  103:ldc1            #81  <String "UTF-32">
	//   53  105:putfield        #17  <Field String encoding>
			} else
	//*  54  108:goto            21
			if((buffer[0] & 0xff) < 128)
	//*  55  111:aload_0         
	//*  56  112:getfield        #19  <Field byte[] buffer>
	//*  57  115:iconst_0        
	//*  58  116:baload          
	//*  59  117:sipush          255
	//*  60  120:iand            
	//*  61  121:sipush          128
	//*  62  124:icmpge          180
			{
				if(buffer[1] != 0)
	//*  63  127:aload_0         
	//*  64  128:getfield        #19  <Field byte[] buffer>
	//*  65  131:iconst_1        
	//*  66  132:baload          
	//*  67  133:ifeq            145
					encoding = "UTF-8";
	//   68  136:aload_0         
	//   69  137:ldc1            #75  <String "UTF-8">
	//   70  139:putfield        #17  <Field String encoding>
				else
	//*  71  142:goto            21
				if(length < 4 || buffer[2] != 0)
	//*  72  145:aload_0         
	//*  73  146:getfield        #21  <Field int length>
	//*  74  149:iconst_4        
	//*  75  150:icmplt          162
	//*  76  153:aload_0         
	//*  77  154:getfield        #19  <Field byte[] buffer>
	//*  78  157:iconst_2        
	//*  79  158:baload          
	//*  80  159:ifeq            171
					encoding = "UTF-16LE";
	//   81  162:aload_0         
	//   82  163:ldc1            #83  <String "UTF-16LE">
	//   83  165:putfield        #17  <Field String encoding>
				else
	//*  84  168:goto            21
					encoding = "UTF-32LE";
	//   85  171:aload_0         
	//   86  172:ldc1            #85  <String "UTF-32LE">
	//   87  174:putfield        #17  <Field String encoding>
			} else
	//*  88  177:goto            21
			if((buffer[0] & 0xff) == 239)
	//*  89  180:aload_0         
	//*  90  181:getfield        #19  <Field byte[] buffer>
	//*  91  184:iconst_0        
	//*  92  185:baload          
	//*  93  186:sipush          255
	//*  94  189:iand            
	//*  95  190:sipush          239
	//*  96  193:icmpne          205
				encoding = "UTF-8";
	//   97  196:aload_0         
	//   98  197:ldc1            #75  <String "UTF-8">
	//   99  199:putfield        #17  <Field String encoding>
			else
	//* 100  202:goto            21
			if((buffer[0] & 0xff) == 254)
	//* 101  205:aload_0         
	//* 102  206:getfield        #19  <Field byte[] buffer>
	//* 103  209:iconst_0        
	//* 104  210:baload          
	//* 105  211:sipush          255
	//* 106  214:iand            
	//* 107  215:sipush          254
	//* 108  218:icmpne          230
				encoding = "UTF-16";
	//  109  221:aload_0         
	//  110  222:ldc1            #87  <String "UTF-16">
	//  111  224:putfield        #17  <Field String encoding>
			else
	//* 112  227:goto            21
			if(length < 4 || buffer[2] != 0)
	//* 113  230:aload_0         
	//* 114  231:getfield        #21  <Field int length>
	//* 115  234:iconst_4        
	//* 116  235:icmplt          247
	//* 117  238:aload_0         
	//* 118  239:getfield        #19  <Field byte[] buffer>
	//* 119  242:iconst_2        
	//* 120  243:baload          
	//* 121  244:ifeq            256
				encoding = "UTF-16";
	//  122  247:aload_0         
	//  123  248:ldc1            #87  <String "UTF-16">
	//  124  250:putfield        #17  <Field String encoding>
			else
	//* 125  253:goto            21
				encoding = "UTF-32";
	//  126  256:aload_0         
	//  127  257:ldc1            #81  <String "UTF-32">
	//  128  259:putfield        #17  <Field String encoding>
		return encoding;
	//* 129  262:goto            21
	}

	public int length()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int length>
	//    2    4:ireturn         
	}

	private byte buffer[];
	private String encoding;
	private int length;
}
