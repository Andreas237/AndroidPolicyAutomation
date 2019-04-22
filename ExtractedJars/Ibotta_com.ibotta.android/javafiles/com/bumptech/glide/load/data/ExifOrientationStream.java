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
	//    2    2:invokespecial   #39  <Method void FilterInputStream(InputStream)>
		if(i >= -1 && i <= 8)
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmplt          23
	//*   6   10:iload_2         
	//*   7   11:bipush          8
	//*   8   13:icmpgt          23
		{
			orientation = (byte)i;
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:int2byte        
	//   12   19:putfield        #41  <Field byte orientation>
			return;
	//   13   22:return          
		} else
		{
			inputstream = ((InputStream) (new StringBuilder()));
	//   14   23:new             #43  <Class StringBuilder>
	//   15   26:dup             
	//   16   27:invokespecial   #45  <Method void StringBuilder()>
	//   17   30:astore_1        
			((StringBuilder) (inputstream)).append("Cannot add invalid orientation: ");
	//   18   31:aload_1         
	//   19   32:ldc1            #47  <String "Cannot add invalid orientation: ">
	//   20   34:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             
			((StringBuilder) (inputstream)).append(i);
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   25   43:pop             
			throw new IllegalArgumentException(((StringBuilder) (inputstream)).toString());
	//   26   44:new             #56  <Class IllegalArgumentException>
	//   27   47:dup             
	//   28   48:aload_1         
	//   29   49:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   30   52:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//   31   55:athrow          
		}
	}

	public void mark(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #67  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void UnsupportedOperationException()>
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
label0:
		{
			i = position;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int position>
	//    2    4:istore_1        
			if(i >= 2)
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:icmplt          50
			{
				int j = ORIENTATION_POSITION;
	//    6   10:getstatic       #33  <Field int ORIENTATION_POSITION>
	//    7   13:istore_2        
				if(i <= j)
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmple          22
	//*  11   19:goto            50
				{
					if(i == j)
	//*  12   22:iload_1         
	//*  13   23:iload_2         
	//*  14   24:icmpne          35
						i = ((int) (orientation));
	//   15   27:aload_0         
	//   16   28:getfield        #41  <Field byte orientation>
	//   17   31:istore_1        
					else
	//*  18   32:goto            55
						i = EXIF_SEGMENT[i - 2] & 0xff;
	//   19   35:getstatic       #29  <Field byte[] EXIF_SEGMENT>
	//   20   38:iload_1         
	//   21   39:iconst_2        
	//   22   40:isub            
	//   23   41:baload          
	//   24   42:sipush          255
	//   25   45:iand            
	//   26   46:istore_1        
					break label0;
	//   27   47:goto            55
				}
			}
			i = super.read();
	//   28   50:aload_0         
	//   29   51:invokespecial   #78  <Method int FilterInputStream.read()>
	//   30   54:istore_1        
		}
		if(i != -1)
	//*  31   55:iload_1         
	//*  32   56:iconst_m1       
	//*  33   57:icmpeq          70
			position = position + 1;
	//   34   60:aload_0         
	//   35   61:aload_0         
	//   36   62:getfield        #76  <Field int position>
	//   37   65:iconst_1        
	//   38   66:iadd            
	//   39   67:putfield        #76  <Field int position>
		return i;
	//   40   70:iload_1         
	//   41   71:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		int k = position;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int position>
	//    2    4:istore          4
		int l = ORIENTATION_POSITION;
	//    3    6:getstatic       #33  <Field int ORIENTATION_POSITION>
	//    4    9:istore          5
		if(k > l)
	//*   5   11:iload           4
	//*   6   13:iload           5
	//*   7   15:icmple          29
			i = super.read(abyte0, i, j);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:iload_3         
	//   12   22:invokespecial   #83  <Method int FilterInputStream.read(byte[], int, int)>
	//   13   25:istore_2        
		else
	//*  14   26:goto            95
		if(k == l)
	//*  15   29:iload           4
	//*  16   31:iload           5
	//*  17   33:icmpne          48
		{
			abyte0[i] = orientation;
	//   18   36:aload_1         
	//   19   37:iload_2         
	//   20   38:aload_0         
	//   21   39:getfield        #41  <Field byte orientation>
	//   22   42:bastore         
			i = 1;
	//   23   43:iconst_1        
	//   24   44:istore_2        
		} else
	//*  25   45:goto            95
		if(k < 2)
	//*  26   48:iload           4
	//*  27   50:iconst_2        
	//*  28   51:icmpge          68
		{
			i = super.read(abyte0, i, 2 - k);
	//   29   54:aload_0         
	//   30   55:aload_1         
	//   31   56:iload_2         
	//   32   57:iconst_2        
	//   33   58:iload           4
	//   34   60:isub            
	//   35   61:invokespecial   #83  <Method int FilterInputStream.read(byte[], int, int)>
	//   36   64:istore_2        
		} else
	//*  37   65:goto            95
		{
			j = Math.min(l - k, j);
	//   38   68:iload           5
	//   39   70:iload           4
	//   40   72:isub            
	//   41   73:iload_3         
	//   42   74:invokestatic    #89  <Method int Math.min(int, int)>
	//   43   77:istore_3        
			System.arraycopy(((Object) (EXIF_SEGMENT)), position - 2, ((Object) (abyte0)), i, j);
	//   44   78:getstatic       #29  <Field byte[] EXIF_SEGMENT>
	//   45   81:aload_0         
	//   46   82:getfield        #76  <Field int position>
	//   47   85:iconst_2        
	//   48   86:isub            
	//   49   87:aload_1         
	//   50   88:iload_2         
	//   51   89:iload_3         
	//   52   90:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
			i = j;
	//   53   93:iload_3         
	//   54   94:istore_2        
		}
		if(i > 0)
	//*  55   95:iload_2         
	//*  56   96:ifle            109
			position = position + i;
	//   57   99:aload_0         
	//   58  100:aload_0         
	//   59  101:getfield        #76  <Field int position>
	//   60  104:iload_2         
	//   61  105:iadd            
	//   62  106:putfield        #76  <Field int position>
		return i;
	//   63  109:iload_2         
	//   64  110:ireturn         
	}

	public void reset()
		throws IOException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #67  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		l = super.skip(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #101 <Method long FilterInputStream.skip(long)>
	//    3    5:lstore_1        
		if(l > 0L)
	//*   4    6:lload_1         
	//*   5    7:lconst_0        
	//*   6    8:lcmp            
	//*   7    9:ifle            24
			position = (int)((long)position + l);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #76  <Field int position>
	//   11   17:i2l             
	//   12   18:lload_1         
	//   13   19:ladd            
	//   14   20:l2i             
	//   15   21:putfield        #76  <Field int position>
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
	private final byte orientation;
	private int position;

	static 
	{
	//    0    0:bipush          29
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #15  <Int -1>
	//    5    8:bastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #16  <Int -31>
	//    9   13:bastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #17  <Int 0>
	//   13   18:bastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #18  <Int 28>
	//   17   23:bastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #19  <Int 69>
	//   21   28:bastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #20  <Int 120>
	//   25   33:bastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #21  <Int 105>
	//   29   39:bastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #22  <Int 102>
	//   33   45:bastore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #17  <Int 0>
	//   37   51:bastore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:ldc1            #17  <Int 0>
	//   41   57:bastore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:ldc1            #23  <Int 77>
	//   45   63:bastore         
	//   46   64:dup             
	//   47   65:bipush          11
	//   48   67:ldc1            #23  <Int 77>
	//   49   69:bastore         
	//   50   70:dup             
	//   51   71:bipush          12
	//   52   73:ldc1            #17  <Int 0>
	//   53   75:bastore         
	//   54   76:dup             
	//   55   77:bipush          13
	//   56   79:ldc1            #17  <Int 0>
	//   57   81:bastore         
	//   58   82:dup             
	//   59   83:bipush          14
	//   60   85:ldc1            #17  <Int 0>
	//   61   87:bastore         
	//   62   88:dup             
	//   63   89:bipush          15
	//   64   91:ldc1            #17  <Int 0>
	//   65   93:bastore         
	//   66   94:dup             
	//   67   95:bipush          16
	//   68   97:ldc1            #17  <Int 0>
	//   69   99:bastore         
	//   70  100:dup             
	//   71  101:bipush          17
	//   72  103:ldc1            #24  <Int 8>
	//   73  105:bastore         
	//   74  106:dup             
	//   75  107:bipush          18
	//   76  109:ldc1            #17  <Int 0>
	//   77  111:bastore         
	//   78  112:dup             
	//   79  113:bipush          19
	//   80  115:ldc1            #25  <Int 1>
	//   81  117:bastore         
	//   82  118:dup             
	//   83  119:bipush          20
	//   84  121:ldc1            #25  <Int 1>
	//   85  123:bastore         
	//   86  124:dup             
	//   87  125:bipush          21
	//   88  127:ldc1            #26  <Int 18>
	//   89  129:bastore         
	//   90  130:dup             
	//   91  131:bipush          22
	//   92  133:ldc1            #17  <Int 0>
	//   93  135:bastore         
	//   94  136:dup             
	//   95  137:bipush          23
	//   96  139:ldc1            #27  <Int 2>
	//   97  141:bastore         
	//   98  142:dup             
	//   99  143:bipush          24
	//  100  145:ldc1            #17  <Int 0>
	//  101  147:bastore         
	//  102  148:dup             
	//  103  149:bipush          25
	//  104  151:ldc1            #17  <Int 0>
	//  105  153:bastore         
	//  106  154:dup             
	//  107  155:bipush          26
	//  108  157:ldc1            #17  <Int 0>
	//  109  159:bastore         
	//  110  160:dup             
	//  111  161:bipush          27
	//  112  163:ldc1            #25  <Int 1>
	//  113  165:bastore         
	//  114  166:dup             
	//  115  167:bipush          28
	//  116  169:ldc1            #17  <Int 0>
	//  117  171:bastore         
	//  118  172:putstatic       #29  <Field byte[] EXIF_SEGMENT>
		SEGMENT_LENGTH = EXIF_SEGMENT.length;
	//  119  175:getstatic       #29  <Field byte[] EXIF_SEGMENT>
	//  120  178:arraylength     
	//  121  179:putstatic       #31  <Field int SEGMENT_LENGTH>
		ORIENTATION_POSITION = SEGMENT_LENGTH + 2;
	//  122  182:getstatic       #31  <Field int SEGMENT_LENGTH>
	//  123  185:iconst_2        
	//  124  186:iadd            
	//  125  187:putstatic       #33  <Field int ORIENTATION_POSITION>
	//* 126  190:return          
	}
}
