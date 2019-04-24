// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;

import java.lang.reflect.Array;

public final class ByteMatrix
{

	public ByteMatrix(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		bytes = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
			j, i
		});
	//    2    4:aload_0         
	//    3    5:getstatic       #20  <Field Class Byte.TYPE>
	//    4    8:iconst_2        
	//    5    9:newarray        int[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:iload_2         
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:iload_1         
	//   13   18:iastore         
	//   14   19:invokestatic    #26  <Method Object Array.newInstance(Class, int[])>
	//   15   22:checkcast       #27  <Class byte[][]>
	//   16   25:putfield        #29  <Field byte[][] bytes>
		width = i;
	//   17   28:aload_0         
	//   18   29:iload_1         
	//   19   30:putfield        #31  <Field int width>
		height = j;
	//   20   33:aload_0         
	//   21   34:iload_2         
	//   22   35:putfield        #33  <Field int height>
	//   23   38:return          
	}

	public void clear(byte byte0)
	{
		for(int i = 0; i < height; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #33  <Field int height>
	//*   5    7:icmpge          43
		{
			for(int j = 0; j < width; j++)
	//*   6   10:iconst_0        
	//*   7   11:istore_3        
	//*   8   12:iload_3         
	//*   9   13:aload_0         
	//*  10   14:getfield        #31  <Field int width>
	//*  11   17:icmpge          36
				bytes[i][j] = byte0;
	//   12   20:aload_0         
	//   13   21:getfield        #29  <Field byte[][] bytes>
	//   14   24:iload_2         
	//   15   25:aaload          
	//   16   26:iload_3         
	//   17   27:iload_1         
	//   18   28:bastore         

	//   19   29:iload_3         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_3        
		}

	//   23   33:goto            12
	//   24   36:iload_2         
	//   25   37:iconst_1        
	//   26   38:iadd            
	//   27   39:istore_2        
	//*  28   40:goto            2
	//   29   43:return          
	}

	public byte get(int i, int j)
	{
		return bytes[j][i];
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte[][] bytes>
	//    2    4:iload_2         
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:baload          
	//    6    8:ireturn         
	}

	public byte[][] getArray()
	{
		return bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte[][] bytes>
	//    2    4:areturn         
	}

	public int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int height>
	//    2    4:ireturn         
	}

	public int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int width>
	//    2    4:ireturn         
	}

	public void set(int i, int j, byte byte0)
	{
		bytes[j][i] = byte0;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte[][] bytes>
	//    2    4:iload_2         
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:iload_3         
	//    6    8:bastore         
	//    7    9:return          
	}

	public void set(int i, int j, int k)
	{
		bytes[j][i] = (byte)k;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte[][] bytes>
	//    2    4:iload_2         
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:iload_3         
	//    6    8:int2byte        
	//    7    9:bastore         
	//    8   10:return          
	}

	public String toString()
	{
		int i;
		StringBuffer stringbuffer;
		stringbuffer = new StringBuffer(width * 2 * height + 2);
	//    0    0:new             #50  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int width>
	//    4    8:iconst_2        
	//    5    9:imul            
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field int height>
	//    8   14:imul            
	//    9   15:iconst_2        
	//   10   16:iadd            
	//   11   17:invokespecial   #53  <Method void StringBuffer(int)>
	//   12   20:astore_3        
		i = 0;
	//   13   21:iconst_0        
	//   14   22:istore_1        
_L5:
		int j;
		if(i >= height)
			break; /* Loop/switch isn't completed */
	//   15   23:iload_1         
	//   16   24:aload_0         
	//   17   25:getfield        #33  <Field int height>
	//   18   28:icmpge          120
		j = 0;
	//   19   31:iconst_0        
	//   20   32:istore_2        
_L2:
		if(j >= width)
			break MISSING_BLOCK_LABEL_106;
	//   21   33:iload_2         
	//   22   34:aload_0         
	//   23   35:getfield        #31  <Field int width>
	//   24   38:icmpge          106
		switch(bytes[i][j])
	//*  25   41:aload_0         
	//*  26   42:getfield        #29  <Field byte[][] bytes>
	//*  27   45:iload_1         
	//*  28   46:aaload          
	//*  29   47:iload_2         
	//*  30   48:iaload          
		{
	//*  31   49:tableswitch     0 1: default 72
	//	               0 86
	//	               1 96
		default:
			stringbuffer.append("  ");
	//   32   72:aload_3         
	//   33   73:ldc1            #55  <String "  ">
	//   34   75:invokevirtual   #59  <Method StringBuffer StringBuffer.append(String)>
	//   35   78:pop             
			break;

		case 0: // '\0'
			break; /* Loop/switch isn't completed */

		case 1: // '\001'
			break MISSING_BLOCK_LABEL_96;
		}
_L3:
		j++;
	//   36   79:iload_2         
	//   37   80:iconst_1        
	//   38   81:iadd            
	//   39   82:istore_2        
		if(true) goto _L2; else goto _L1
	//   40   83:goto            33
_L1:
		stringbuffer.append(" 0");
	//   41   86:aload_3         
	//   42   87:ldc1            #61  <String " 0">
	//   43   89:invokevirtual   #59  <Method StringBuffer StringBuffer.append(String)>
	//   44   92:pop             
		  goto _L3
	//*  45   93:goto            79
		stringbuffer.append(" 1");
	//   46   96:aload_3         
	//   47   97:ldc1            #63  <String " 1">
	//   48   99:invokevirtual   #59  <Method StringBuffer StringBuffer.append(String)>
	//   49  102:pop             
		  goto _L3
	//*  50  103:goto            79
		stringbuffer.append('\n');
	//   51  106:aload_3         
	//   52  107:bipush          10
	//   53  109:invokevirtual   #66  <Method StringBuffer StringBuffer.append(char)>
	//   54  112:pop             
		i++;
	//   55  113:iload_1         
	//   56  114:iconst_1        
	//   57  115:iadd            
	//   58  116:istore_1        
		if(true) goto _L5; else goto _L4
	//   59  117:goto            23
_L4:
		return stringbuffer.toString();
	//   60  120:aload_3         
	//   61  121:invokevirtual   #68  <Method String StringBuffer.toString()>
	//   62  124:areturn         
	}

	private final byte bytes[][];
	private final int height;
	private final int width;
}
