// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.extractor.ExtractorInput;
import java.io.IOException;

final class VarintReader
{

	public VarintReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          8
	//    4    7:newarray        byte[]
	//    5    9:putfield        #39  <Field byte[] scratch>
	//    6   12:return          
	}

	public static long assembleVarint(byte abyte0[], int i, boolean flag)
	{
		long l1 = (long)abyte0[0] & 255L;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:baload          
	//    3    3:i2l             
	//    4    4:ldc2w           #42  <Long 255L>
	//    5    7:land            
	//    6    8:lstore          6
		long l = l1;
	//    7   10:lload           6
	//    8   12:lstore          4
		if(flag)
	//*   9   14:iload_2         
	//*  10   15:ifeq            30
			l = l1 & VARINT_LENGTH_MASKS[i - 1];
	//   11   18:lload           6
	//   12   20:getstatic       #33  <Field long[] VARINT_LENGTH_MASKS>
	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:isub            
	//   16   26:laload          
	//   17   27:land            
	//   18   28:lstore          4
		for(int j = 1; j < i; j++)
	//*  19   30:iconst_1        
	//*  20   31:istore_3        
	//*  21   32:iload_3         
	//*  22   33:iload_1         
	//*  23   34:icmpge          60
			l = l << 8 | (long)abyte0[j] & 255L;
	//   24   37:lload           4
	//   25   39:bipush          8
	//   26   41:lshl            
	//   27   42:aload_0         
	//   28   43:iload_3         
	//   29   44:baload          
	//   30   45:i2l             
	//   31   46:ldc2w           #42  <Long 255L>
	//   32   49:land            
	//   33   50:lor             
	//   34   51:lstore          4

	//   35   53:iload_3         
	//   36   54:iconst_1        
	//   37   55:iadd            
	//   38   56:istore_3        
	//*  39   57:goto            32
		return l;
	//   40   60:lload           4
	//   41   62:lreturn         
	}

	public static int parseUnsignedVarintLength(int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		do
		{
			long al[] = VARINT_LENGTH_MASKS;
	//    2    2:getstatic       #33  <Field long[] VARINT_LENGTH_MASKS>
	//    3    5:astore_2        
			if(j < al.length)
	//*   4    6:iload_1         
	//*   5    7:aload_2         
	//*   6    8:arraylength     
	//*   7    9:icmpge          34
			{
				if((al[j] & (long)i) != 0L)
	//*   8   12:aload_2         
	//*   9   13:iload_1         
	//*  10   14:laload          
	//*  11   15:iload_0         
	//*  12   16:i2l             
	//*  13   17:land            
	//*  14   18:lconst_0        
	//*  15   19:lcmp            
	//*  16   20:ifeq            27
					return j + 1;
	//   17   23:iload_1         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:ireturn         
				j++;
	//   21   27:iload_1         
	//   22   28:iconst_1        
	//   23   29:iadd            
	//   24   30:istore_1        
			} else
	//*  25   31:goto            2
			{
				return -1;
	//   26   34:iconst_m1       
	//   27   35:ireturn         
			}
		} while(true);
	}

	public int getLastLength()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int length>
	//    2    4:ireturn         
	}

	public long readUnsignedVarint(ExtractorInput extractorinput, boolean flag, boolean flag1, int i)
		throws IOException, InterruptedException
	{
		if(state == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field int state>
	//*   2    4:ifne            70
		{
			if(!extractorinput.readFully(scratch, 0, 1, flag))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #39  <Field byte[] scratch>
	//*   6   12:iconst_0        
	//*   7   13:iconst_1        
	//*   8   14:iload_2         
	//*   9   15:invokeinterface #63  <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  10   20:ifne            27
				return -1L;
	//   11   23:ldc2w           #64  <Long -1L>
	//   12   26:lreturn         
			length = parseUnsignedVarintLength(scratch[0] & 0xff);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #39  <Field byte[] scratch>
	//   16   32:iconst_0        
	//   17   33:baload          
	//   18   34:sipush          255
	//   19   37:iand            
	//   20   38:invokestatic    #67  <Method int parseUnsignedVarintLength(int)>
	//   21   41:putfield        #49  <Field int length>
			if(length != -1)
	//*  22   44:aload_0         
	//*  23   45:getfield        #49  <Field int length>
	//*  24   48:iconst_m1       
	//*  25   49:icmpeq          60
				state = 1;
	//   26   52:aload_0         
	//   27   53:iconst_1        
	//   28   54:putfield        #57  <Field int state>
			else
	//*  29   57:goto            70
				throw new IllegalStateException("No valid varint length mask found");
	//   30   60:new             #69  <Class IllegalStateException>
	//   31   63:dup             
	//   32   64:ldc1            #71  <String "No valid varint length mask found">
	//   33   66:invokespecial   #74  <Method void IllegalStateException(String)>
	//   34   69:athrow          
		}
		int j = length;
	//   35   70:aload_0         
	//   36   71:getfield        #49  <Field int length>
	//   37   74:istore          5
		if(j > i)
	//*  38   76:iload           5
	//*  39   78:iload           4
	//*  40   80:icmple          92
		{
			state = 0;
	//   41   83:aload_0         
	//   42   84:iconst_0        
	//   43   85:putfield        #57  <Field int state>
			return -2L;
	//   44   88:ldc2w           #75  <Long -2L>
	//   45   91:lreturn         
		}
		if(j != 1)
	//*  46   92:iload           5
	//*  47   94:iconst_1        
	//*  48   95:icmpeq          113
			extractorinput.readFully(scratch, 1, j - 1);
	//   49   98:aload_1         
	//   50   99:aload_0         
	//   51  100:getfield        #39  <Field byte[] scratch>
	//   52  103:iconst_1        
	//   53  104:iload           5
	//   54  106:iconst_1        
	//   55  107:isub            
	//   56  108:invokeinterface #79  <Method void ExtractorInput.readFully(byte[], int, int)>
		state = 0;
	//   57  113:aload_0         
	//   58  114:iconst_0        
	//   59  115:putfield        #57  <Field int state>
		return assembleVarint(scratch, length, flag1);
	//   60  118:aload_0         
	//   61  119:getfield        #39  <Field byte[] scratch>
	//   62  122:aload_0         
	//   63  123:getfield        #49  <Field int length>
	//   64  126:iload_3         
	//   65  127:invokestatic    #81  <Method long assembleVarint(byte[], int, boolean)>
	//   66  130:lreturn         
	}

	public void reset()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #57  <Field int state>
		length = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #49  <Field int length>
	//    6   10:return          
	}

	private static final int STATE_BEGIN_READING = 0;
	private static final int STATE_READ_CONTENTS = 1;
	private static final long VARINT_LENGTH_MASKS[] = {
		128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L
	};
	private int length;
	private final byte scratch[] = new byte[8];
	private int state;

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        long[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc2w           #18  <Long 128L>
	//    5    9:lastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc2w           #20  <Long 64L>
	//    9   15:lastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:ldc2w           #22  <Long 32L>
	//   13   21:lastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:ldc2w           #24  <Long 16L>
	//   17   27:lastore         
	//   18   28:dup             
	//   19   29:iconst_4        
	//   20   30:ldc2w           #26  <Long 8L>
	//   21   33:lastore         
	//   22   34:dup             
	//   23   35:iconst_5        
	//   24   36:ldc2w           #28  <Long 4L>
	//   25   39:lastore         
	//   26   40:dup             
	//   27   41:bipush          6
	//   28   43:ldc2w           #30  <Long 2L>
	//   29   46:lastore         
	//   30   47:dup             
	//   31   48:bipush          7
	//   32   50:lconst_1        
	//   33   51:lastore         
	//   34   52:putstatic       #33  <Field long[] VARINT_LENGTH_MASKS>
	//*  35   55:return          
	}
}
