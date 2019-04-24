// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import java.io.*;

public final class ExifOrientationStream extends FilterInputStream
{

	public ExifOrientationStream(InputStream inputstream, int i)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void FilterInputStream(InputStream)>
		if(i < -1 || i > 8)
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmplt          16
	//*   6   10:iload_2         
	//*   7   11:bipush          8
	//*   8   13:icmple          43
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Cannot add invalid orientation: ").append(i).toString());
	//    9   16:new             #42  <Class IllegalArgumentException>
	//   10   19:dup             
	//   11   20:new             #44  <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #46  <Method void StringBuilder()>
	//   14   27:ldc1            #48  <String "Cannot add invalid orientation: ">
	//   15   29:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:iload_2         
	//   17   33:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
	//   18   36:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   19   39:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   20   42:athrow          
		} else
		{
			orientation = (byte)i;
	//   21   43:aload_0         
	//   22   44:iload_2         
	//   23   45:int2byte        
	//   24   46:putfield        #64  <Field byte orientation>
			return;
	//   25   49:return          
		}
	}

	public void mark(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #68  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean markSupported()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int read()
		throws IOException
	{
		int i;
		if(position < 2 || position > ORIENTATION_POSITION)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field int position>
	//*   2    4:iconst_2        
	//*   3    5:icmplt          18
	//*   4    8:aload_0         
	//*   5    9:getfield        #77  <Field int position>
	//*   6   12:getstatic       #34  <Field int ORIENTATION_POSITION>
	//*   7   15:icmple          26
			i = super.read();
	//    8   18:aload_0         
	//    9   19:invokespecial   #79  <Method int FilterInputStream.read()>
	//   10   22:istore_1        
		else
	//*  11   23:goto            59
		if(position == ORIENTATION_POSITION)
	//*  12   26:aload_0         
	//*  13   27:getfield        #77  <Field int position>
	//*  14   30:getstatic       #34  <Field int ORIENTATION_POSITION>
	//*  15   33:icmpne          44
			i = ((int) (orientation));
	//   16   36:aload_0         
	//   17   37:getfield        #64  <Field byte orientation>
	//   18   40:istore_1        
		else
	//*  19   41:goto            59
			i = EXIF_SEGMENT[position - 2] & 0xff;
	//   20   44:getstatic       #30  <Field byte[] EXIF_SEGMENT>
	//   21   47:aload_0         
	//   22   48:getfield        #77  <Field int position>
	//   23   51:iconst_2        
	//   24   52:isub            
	//   25   53:baload          
	//   26   54:sipush          255
	//   27   57:iand            
	//   28   58:istore_1        
		if(i != -1)
	//*  29   59:iload_1         
	//*  30   60:iconst_m1       
	//*  31   61:icmpeq          74
			position = position + 1;
	//   32   64:aload_0         
	//   33   65:aload_0         
	//   34   66:getfield        #77  <Field int position>
	//   35   69:iconst_1        
	//   36   70:iadd            
	//   37   71:putfield        #77  <Field int position>
		return i;
	//   38   74:iload_1         
	//   39   75:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		if(position > ORIENTATION_POSITION)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field int position>
	//*   2    4:getstatic       #34  <Field int ORIENTATION_POSITION>
	//*   3    7:icmple          21
			i = super.read(abyte0, i, j);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokespecial   #83  <Method int FilterInputStream.read(byte[], int, int)>
	//    9   17:istore_2        
		else
	//*  10   18:goto            97
		if(position == ORIENTATION_POSITION)
	//*  11   21:aload_0         
	//*  12   22:getfield        #77  <Field int position>
	//*  13   25:getstatic       #34  <Field int ORIENTATION_POSITION>
	//*  14   28:icmpne          43
		{
			abyte0[i] = orientation;
	//   15   31:aload_1         
	//   16   32:iload_2         
	//   17   33:aload_0         
	//   18   34:getfield        #64  <Field byte orientation>
	//   19   37:bastore         
			i = 1;
	//   20   38:iconst_1        
	//   21   39:istore_2        
		} else
	//*  22   40:goto            97
		if(position < 2)
	//*  23   43:aload_0         
	//*  24   44:getfield        #77  <Field int position>
	//*  25   47:iconst_2        
	//*  26   48:icmpge          67
		{
			i = super.read(abyte0, i, 2 - position);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:iload_2         
	//   30   54:iconst_2        
	//   31   55:aload_0         
	//   32   56:getfield        #77  <Field int position>
	//   33   59:isub            
	//   34   60:invokespecial   #83  <Method int FilterInputStream.read(byte[], int, int)>
	//   35   63:istore_2        
		} else
	//*  36   64:goto            97
		{
			j = Math.min(ORIENTATION_POSITION - position, j);
	//   37   67:getstatic       #34  <Field int ORIENTATION_POSITION>
	//   38   70:aload_0         
	//   39   71:getfield        #77  <Field int position>
	//   40   74:isub            
	//   41   75:iload_3         
	//   42   76:invokestatic    #89  <Method int Math.min(int, int)>
	//   43   79:istore_3        
			System.arraycopy(((Object) (EXIF_SEGMENT)), position - 2, ((Object) (abyte0)), i, j);
	//   44   80:getstatic       #30  <Field byte[] EXIF_SEGMENT>
	//   45   83:aload_0         
	//   46   84:getfield        #77  <Field int position>
	//   47   87:iconst_2        
	//   48   88:isub            
	//   49   89:aload_1         
	//   50   90:iload_2         
	//   51   91:iload_3         
	//   52   92:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
			i = j;
	//   53   95:iload_3         
	//   54   96:istore_2        
		}
		if(i > 0)
	//*  55   97:iload_2         
	//*  56   98:ifle            111
			position = position + i;
	//   57  101:aload_0         
	//   58  102:aload_0         
	//   59  103:getfield        #77  <Field int position>
	//   60  106:iload_2         
	//   61  107:iadd            
	//   62  108:putfield        #77  <Field int position>
		return i;
	//   63  111:iload_2         
	//   64  112:ireturn         
	}

	public void reset()
		throws IOException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #68  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		l = super.skip(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #100 <Method long FilterInputStream.skip(long)>
	//    3    5:lstore_1        
		if(l > 0L)
	//*   4    6:lload_1         
	//*   5    7:lconst_0        
	//*   6    8:lcmp            
	//*   7    9:ifle            24
			position = (int)((long)position + l);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #77  <Field int position>
	//   11   17:i2l             
	//   12   18:lload_1         
	//   13   19:ladd            
	//   14   20:l2i             
	//   15   21:putfield        #77  <Field int position>
		return l;
	//   16   24:lload_1         
	//   17   25:lreturn         
	}

	private static final byte EXIF_SEGMENT[] = {
		-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 
		77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 
		1, 18, 0, 2, 0, 0, 0, 1, 0
	};
	private static final int ORIENTATION_POSITION;
	private static final int SEGMENT_LENGTH;
	private static final int SEGMENT_START_POSITION = 2;
	private final byte orientation;
	private int position;

	static 
	{
	//    0    0:bipush          29
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #17  <Int -1>
	//    5    8:bastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #18  <Int -31>
	//    9   13:bastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #19  <Int 0>
	//   13   18:bastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #20  <Int 28>
	//   17   23:bastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #21  <Int 69>
	//   21   28:bastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #22  <Int 120>
	//   25   33:bastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #23  <Int 105>
	//   29   39:bastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #24  <Int 102>
	//   33   45:bastore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #19  <Int 0>
	//   37   51:bastore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:ldc1            #19  <Int 0>
	//   41   57:bastore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:ldc1            #25  <Int 77>
	//   45   63:bastore         
	//   46   64:dup             
	//   47   65:bipush          11
	//   48   67:ldc1            #25  <Int 77>
	//   49   69:bastore         
	//   50   70:dup             
	//   51   71:bipush          12
	//   52   73:ldc1            #19  <Int 0>
	//   53   75:bastore         
	//   54   76:dup             
	//   55   77:bipush          13
	//   56   79:ldc1            #19  <Int 0>
	//   57   81:bastore         
	//   58   82:dup             
	//   59   83:bipush          14
	//   60   85:ldc1            #19  <Int 0>
	//   61   87:bastore         
	//   62   88:dup             
	//   63   89:bipush          15
	//   64   91:ldc1            #19  <Int 0>
	//   65   93:bastore         
	//   66   94:dup             
	//   67   95:bipush          16
	//   68   97:ldc1            #19  <Int 0>
	//   69   99:bastore         
	//   70  100:dup             
	//   71  101:bipush          17
	//   72  103:ldc1            #26  <Int 8>
	//   73  105:bastore         
	//   74  106:dup             
	//   75  107:bipush          18
	//   76  109:ldc1            #19  <Int 0>
	//   77  111:bastore         
	//   78  112:dup             
	//   79  113:bipush          19
	//   80  115:ldc1            #27  <Int 1>
	//   81  117:bastore         
	//   82  118:dup             
	//   83  119:bipush          20
	//   84  121:ldc1            #27  <Int 1>
	//   85  123:bastore         
	//   86  124:dup             
	//   87  125:bipush          21
	//   88  127:ldc1            #28  <Int 18>
	//   89  129:bastore         
	//   90  130:dup             
	//   91  131:bipush          22
	//   92  133:ldc1            #19  <Int 0>
	//   93  135:bastore         
	//   94  136:dup             
	//   95  137:bipush          23
	//   96  139:ldc1            #11  <Int 2>
	//   97  141:bastore         
	//   98  142:dup             
	//   99  143:bipush          24
	//  100  145:ldc1            #19  <Int 0>
	//  101  147:bastore         
	//  102  148:dup             
	//  103  149:bipush          25
	//  104  151:ldc1            #19  <Int 0>
	//  105  153:bastore         
	//  106  154:dup             
	//  107  155:bipush          26
	//  108  157:ldc1            #19  <Int 0>
	//  109  159:bastore         
	//  110  160:dup             
	//  111  161:bipush          27
	//  112  163:ldc1            #27  <Int 1>
	//  113  165:bastore         
	//  114  166:dup             
	//  115  167:bipush          28
	//  116  169:ldc1            #19  <Int 0>
	//  117  171:bastore         
	//  118  172:putstatic       #30  <Field byte[] EXIF_SEGMENT>
		SEGMENT_LENGTH = EXIF_SEGMENT.length;
	//  119  175:getstatic       #30  <Field byte[] EXIF_SEGMENT>
	//  120  178:arraylength     
	//  121  179:putstatic       #32  <Field int SEGMENT_LENGTH>
		ORIENTATION_POSITION = SEGMENT_LENGTH + 2;
	//  122  182:getstatic       #32  <Field int SEGMENT_LENGTH>
	//  123  185:iconst_2        
	//  124  186:iadd            
	//  125  187:putstatic       #34  <Field int ORIENTATION_POSITION>
	//* 126  190:return          
	}
}
