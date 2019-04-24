// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
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
		long l = (long)abyte0[0] & 255L;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:baload          
	//    3    3:i2l             
	//    4    4:ldc2w           #42  <Long 255L>
	//    5    7:land            
	//    6    8:lstore          4
		if(flag)
	//*   7   10:iload_2         
	//*   8   11:ifeq            33
			l &= ~VARINT_LENGTH_MASKS[i - 1];
	//    9   14:lload           4
	//   10   16:getstatic       #33  <Field long[] VARINT_LENGTH_MASKS>
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:laload          
	//   15   23:ldc2w           #44  <Long -1L>
	//   16   26:lxor            
	//   17   27:land            
	//   18   28:lstore          4
	//*  19   30:goto            33
		for(int j = 1; j < i;)
	//*  20   33:iconst_1        
	//*  21   34:istore_3        
	//*  22   35:iload_3         
	//*  23   36:iload_1         
	//*  24   37:icmpge          67
		{
			long l1 = abyte0[j];
	//   25   40:aload_0         
	//   26   41:iload_3         
	//   27   42:baload          
	//   28   43:i2l             
	//   29   44:lstore          6
			j++;
	//   30   46:iload_3         
	//   31   47:iconst_1        
	//   32   48:iadd            
	//   33   49:istore_3        
			l = l << 8 | l1 & 255L;
	//   34   50:lload           4
	//   35   52:bipush          8
	//   36   54:lshl            
	//   37   55:lload           6
	//   38   57:ldc2w           #42  <Long 255L>
	//   39   60:land            
	//   40   61:lor             
	//   41   62:lstore          4
		}

	//*  42   64:goto            35
		return l;
	//   43   67:lload           4
	//   44   69:lreturn         
	}

	public static int parseUnsignedVarintLength(int i)
	{
		for(int j = 0; j < VARINT_LENGTH_MASKS.length; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:getstatic       #33  <Field long[] VARINT_LENGTH_MASKS>
	//*   4    6:arraylength     
	//*   5    7:icmpge          34
			if((VARINT_LENGTH_MASKS[j] & (long)i) != 0L)
	//*   6   10:getstatic       #33  <Field long[] VARINT_LENGTH_MASKS>
	//*   7   13:iload_1         
	//*   8   14:laload          
	//*   9   15:iload_0         
	//*  10   16:i2l             
	//*  11   17:land            
	//*  12   18:lconst_0        
	//*  13   19:lcmp            
	//*  14   20:ifeq            27
				return j + 1;
	//   15   23:iload_1         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:ireturn         

	//   19   27:iload_1         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:istore_1        
	//*  23   31:goto            2
		return -1;
	//   24   34:iconst_m1       
	//   25   35:ireturn         
	}

	public int getLastLength()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int length>
	//    2    4:ireturn         
	}

	public long readUnsignedVarint(ExtractorInput extractorinput, boolean flag, boolean flag1, int i)
		throws IOException, InterruptedException
	{
		if(state == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field int state>
	//*   2    4:ifne            67
		{
			if(!extractorinput.readFully(scratch, 0, 1, flag))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #39  <Field byte[] scratch>
	//*   6   12:iconst_0        
	//*   7   13:iconst_1        
	//*   8   14:iload_2         
	//*   9   15:invokeinterface #65  <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  10   20:ifne            27
				return -1L;
	//   11   23:ldc2w           #44  <Long -1L>
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
	//   21   41:putfield        #51  <Field int length>
			if(length == -1)
	//*  22   44:aload_0         
	//*  23   45:getfield        #51  <Field int length>
	//*  24   48:iconst_m1       
	//*  25   49:icmpne          62
				throw new IllegalStateException("No valid varint length mask found");
	//   26   52:new             #69  <Class IllegalStateException>
	//   27   55:dup             
	//   28   56:ldc1            #71  <String "No valid varint length mask found">
	//   29   58:invokespecial   #74  <Method void IllegalStateException(String)>
	//   30   61:athrow          
			state = 1;
	//   31   62:aload_0         
	//   32   63:iconst_1        
	//   33   64:putfield        #59  <Field int state>
		}
		if(length > i)
	//*  34   67:aload_0         
	//*  35   68:getfield        #51  <Field int length>
	//*  36   71:iload           4
	//*  37   73:icmple          85
		{
			state = 0;
	//   38   76:aload_0         
	//   39   77:iconst_0        
	//   40   78:putfield        #59  <Field int state>
			return -2L;
	//   41   81:ldc2w           #75  <Long -2L>
	//   42   84:lreturn         
		}
		if(length != 1)
	//*  43   85:aload_0         
	//*  44   86:getfield        #51  <Field int length>
	//*  45   89:iconst_1        
	//*  46   90:icmpeq          110
			extractorinput.readFully(scratch, 1, length - 1);
	//   47   93:aload_1         
	//   48   94:aload_0         
	//   49   95:getfield        #39  <Field byte[] scratch>
	//   50   98:iconst_1        
	//   51   99:aload_0         
	//   52  100:getfield        #51  <Field int length>
	//   53  103:iconst_1        
	//   54  104:isub            
	//   55  105:invokeinterface #79  <Method void ExtractorInput.readFully(byte[], int, int)>
		state = 0;
	//   56  110:aload_0         
	//   57  111:iconst_0        
	//   58  112:putfield        #59  <Field int state>
		return assembleVarint(scratch, length, flag1);
	//   59  115:aload_0         
	//   60  116:getfield        #39  <Field byte[] scratch>
	//   61  119:aload_0         
	//   62  120:getfield        #51  <Field int length>
	//   63  123:iload_3         
	//   64  124:invokestatic    #81  <Method long assembleVarint(byte[], int, boolean)>
	//   65  127:lreturn         
	}

	public void reset()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #59  <Field int state>
		length = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #51  <Field int length>
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
