// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class AesFlushingCipher
{

	public AesFlushingCipher(int i, byte abyte0[], long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		int j;
		try
		{
			cipher = Cipher.getInstance("AES/CTR/NoPadding");
	//    2    4:aload_0         
	//    3    5:ldc1            #27  <String "AES/CTR/NoPadding">
	//    4    7:invokestatic    #33  <Method Cipher Cipher.getInstance(String)>
	//    5   10:putfield        #35  <Field Cipher cipher>
			blockSize = cipher.getBlockSize();
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:getfield        #35  <Field Cipher cipher>
	//    9   18:invokevirtual   #39  <Method int Cipher.getBlockSize()>
	//   10   21:putfield        #41  <Field int blockSize>
			zerosBlock = new byte[blockSize];
	//   11   24:aload_0         
	//   12   25:aload_0         
	//   13   26:getfield        #41  <Field int blockSize>
	//   14   29:newarray        byte[]
	//   15   31:putfield        #43  <Field byte[] zerosBlock>
			flushedBlock = new byte[blockSize];
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #41  <Field int blockSize>
	//   19   39:newarray        byte[]
	//   20   41:putfield        #45  <Field byte[] flushedBlock>
			long l2 = l1 / (long)blockSize;
	//   21   44:lload           5
	//   22   46:aload_0         
	//   23   47:getfield        #41  <Field int blockSize>
	//   24   50:i2l             
	//   25   51:ldiv            
	//   26   52:lstore          8
			j = (int)(l1 % (long)blockSize);
	//   27   54:lload           5
	//   28   56:aload_0         
	//   29   57:getfield        #41  <Field int blockSize>
	//   30   60:i2l             
	//   31   61:lrem            
	//   32   62:l2i             
	//   33   63:istore          7
			cipher.init(i, ((java.security.Key) (new SecretKeySpec(abyte0, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]))), ((java.security.spec.AlgorithmParameterSpec) (new IvParameterSpec(getInitializationVector(l, l2)))));
	//   34   65:aload_0         
	//   35   66:getfield        #35  <Field Cipher cipher>
	//   36   69:iload_1         
	//   37   70:new             #47  <Class SecretKeySpec>
	//   38   73:dup             
	//   39   74:aload_2         
	//   40   75:aload_0         
	//   41   76:getfield        #35  <Field Cipher cipher>
	//   42   79:invokevirtual   #51  <Method String Cipher.getAlgorithm()>
	//   43   82:ldc1            #53  <String "/">
	//   44   84:invokestatic    #59  <Method String[] Util.splitAtFirst(String, String)>
	//   45   87:iconst_0        
	//   46   88:aaload          
	//   47   89:invokespecial   #62  <Method void SecretKeySpec(byte[], String)>
	//   48   92:new             #64  <Class IvParameterSpec>
	//   49   95:dup             
	//   50   96:aload_0         
	//   51   97:lload_3         
	//   52   98:lload           8
	//   53  100:invokespecial   #68  <Method byte[] getInitializationVector(long, long)>
	//   54  103:invokespecial   #71  <Method void IvParameterSpec(byte[])>
	//   55  106:invokevirtual   #75  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		}
	//*  56  109:iload           7
	//*  57  111:ifeq            125
	//*  58  114:aload_0         
	//*  59  115:iload           7
	//*  60  117:newarray        byte[]
	//*  61  119:iconst_0        
	//*  62  120:iload           7
	//*  63  122:invokevirtual   #79  <Method void updateInPlace(byte[], int, int)>
	//*  64  125:return          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  65  126:astore_2        
		{
			throw new RuntimeException(((Throwable) (abyte0)));
	//   66  127:new             #81  <Class RuntimeException>
	//   67  130:dup             
	//   68  131:aload_2         
	//   69  132:invokespecial   #84  <Method void RuntimeException(Throwable)>
	//   70  135:athrow          
		}
		if(j == 0)
			break MISSING_BLOCK_LABEL_125;
		updateInPlace(new byte[j], 0, j);
	}

	private byte[] getInitializationVector(long l, long l1)
	{
		return ByteBuffer.allocate(16).putLong(l).putLong(l1).array();
	//    0    0:bipush          16
	//    1    2:invokestatic    #91  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    2    5:lload_1         
	//    3    6:invokevirtual   #95  <Method ByteBuffer ByteBuffer.putLong(long)>
	//    4    9:lload_3         
	//    5   10:invokevirtual   #95  <Method ByteBuffer ByteBuffer.putLong(long)>
	//    6   13:invokevirtual   #99  <Method byte[] ByteBuffer.array()>
	//    7   16:areturn         
	}

	private int nonFlushingUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
	{
		try
		{
			i = cipher.update(abyte0, i, j, abyte1, k);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Cipher cipher>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #106 <Method int Cipher.update(byte[], int, int, byte[], int)>
	//    8   14:istore_2        
		}
	//*   9   15:iload_2         
	//*  10   16:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  11   17:astore_1        
		{
			throw new RuntimeException(((Throwable) (abyte0)));
	//   12   18:new             #81  <Class RuntimeException>
	//   13   21:dup             
	//   14   22:aload_1         
	//   15   23:invokespecial   #84  <Method void RuntimeException(Throwable)>
	//   16   26:athrow          
		}
		return i;
	}

	public void update(byte abyte0[], int i, int j, byte abyte1[], int k)
	{
		int l = i;
	//    0    0:iload_2         
	//    1    1:istore          6
		i = k;
	//    2    3:iload           5
	//    3    5:istore_2        
		do
		{
			k = pendingXorBytes;
	//    4    6:aload_0         
	//    5    7:getfield        #109 <Field int pendingXorBytes>
	//    6   10:istore          5
			boolean flag1 = true;
	//    7   12:iconst_1        
	//    8   13:istore          9
			if(k > 0)
	//*   9   15:iload           5
	//*  10   17:ifle            78
			{
				abyte1[i] = (byte)(abyte0[l] ^ flushedBlock[blockSize - pendingXorBytes]);
	//   11   20:aload           4
	//   12   22:iload_2         
	//   13   23:aload_1         
	//   14   24:iload           6
	//   15   26:baload          
	//   16   27:aload_0         
	//   17   28:getfield        #45  <Field byte[] flushedBlock>
	//   18   31:aload_0         
	//   19   32:getfield        #41  <Field int blockSize>
	//   20   35:aload_0         
	//   21   36:getfield        #109 <Field int pendingXorBytes>
	//   22   39:isub            
	//   23   40:baload          
	//   24   41:ixor            
	//   25   42:int2byte        
	//   26   43:bastore         
				i++;
	//   27   44:iload_2         
	//   28   45:iconst_1        
	//   29   46:iadd            
	//   30   47:istore_2        
				l++;
	//   31   48:iload           6
	//   32   50:iconst_1        
	//   33   51:iadd            
	//   34   52:istore          6
				pendingXorBytes = pendingXorBytes - 1;
	//   35   54:aload_0         
	//   36   55:aload_0         
	//   37   56:getfield        #109 <Field int pendingXorBytes>
	//   38   59:iconst_1        
	//   39   60:isub            
	//   40   61:putfield        #109 <Field int pendingXorBytes>
				k = j - 1;
	//   41   64:iload_3         
	//   42   65:iconst_1        
	//   43   66:isub            
	//   44   67:istore          5
				j = k;
	//   45   69:iload           5
	//   46   71:istore_3        
				if(k == 0)
	//*  47   72:iload           5
	//*  48   74:ifne            6
					return;
	//   49   77:return          
			} else
			{
				l = nonFlushingUpdate(abyte0, l, j, abyte1, i);
	//   50   78:aload_0         
	//   51   79:aload_1         
	//   52   80:iload           6
	//   53   82:iload_3         
	//   54   83:aload           4
	//   55   85:iload_2         
	//   56   86:invokespecial   #111 <Method int nonFlushingUpdate(byte[], int, int, byte[], int)>
	//   57   89:istore          6
				if(j == l)
	//*  58   91:iload_3         
	//*  59   92:iload           6
	//*  60   94:icmpne          98
					return;
	//   61   97:return          
				k = j - l;
	//   62   98:iload_3         
	//   63   99:iload           6
	//   64  101:isub            
	//   65  102:istore          5
				int i1 = blockSize;
	//   66  104:aload_0         
	//   67  105:getfield        #41  <Field int blockSize>
	//   68  108:istore          7
				j = 0;
	//   69  110:iconst_0        
	//   70  111:istore_3        
				boolean flag;
				if(k < i1)
	//*  71  112:iload           5
	//*  72  114:iload           7
	//*  73  116:icmpge          125
					flag = true;
	//   74  119:iconst_1        
	//   75  120:istore          8
				else
	//*  76  122:goto            128
					flag = false;
	//   77  125:iconst_0        
	//   78  126:istore          8
				Assertions.checkState(flag);
	//   79  128:iload           8
	//   80  130:invokestatic    #117 <Method void Assertions.checkState(boolean)>
				i += l;
	//   81  133:iload_2         
	//   82  134:iload           6
	//   83  136:iadd            
	//   84  137:istore_2        
				pendingXorBytes = blockSize - k;
	//   85  138:aload_0         
	//   86  139:aload_0         
	//   87  140:getfield        #41  <Field int blockSize>
	//   88  143:iload           5
	//   89  145:isub            
	//   90  146:putfield        #109 <Field int pendingXorBytes>
				if(nonFlushingUpdate(zerosBlock, 0, pendingXorBytes, flushedBlock, 0) == blockSize)
	//*  91  149:aload_0         
	//*  92  150:aload_0         
	//*  93  151:getfield        #43  <Field byte[] zerosBlock>
	//*  94  154:iconst_0        
	//*  95  155:aload_0         
	//*  96  156:getfield        #109 <Field int pendingXorBytes>
	//*  97  159:aload_0         
	//*  98  160:getfield        #45  <Field byte[] flushedBlock>
	//*  99  163:iconst_0        
	//* 100  164:invokespecial   #111 <Method int nonFlushingUpdate(byte[], int, int, byte[], int)>
	//* 101  167:aload_0         
	//* 102  168:getfield        #41  <Field int blockSize>
	//* 103  171:icmpne          181
					flag = flag1;
	//  104  174:iload           9
	//  105  176:istore          8
				else
	//* 106  178:goto            184
					flag = false;
	//  107  181:iconst_0        
	//  108  182:istore          8
				Assertions.checkState(flag);
	//  109  184:iload           8
	//  110  186:invokestatic    #117 <Method void Assertions.checkState(boolean)>
				while(j < k) 
	//* 111  189:iload_3         
	//* 112  190:iload           5
	//* 113  192:icmpge          216
				{
					abyte1[i] = flushedBlock[j];
	//  114  195:aload           4
	//  115  197:iload_2         
	//  116  198:aload_0         
	//  117  199:getfield        #45  <Field byte[] flushedBlock>
	//  118  202:iload_3         
	//  119  203:baload          
	//  120  204:bastore         
					j++;
	//  121  205:iload_3         
	//  122  206:iconst_1        
	//  123  207:iadd            
	//  124  208:istore_3        
					i++;
	//  125  209:iload_2         
	//  126  210:iconst_1        
	//  127  211:iadd            
	//  128  212:istore_2        
				}
	//* 129  213:goto            189
				return;
	//  130  216:return          
			}
		} while(true);
	}

	public void updateInPlace(byte abyte0[], int i, int j)
	{
		update(abyte0, i, j, abyte0, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload_1         
	//    5    5:iload_2         
	//    6    6:invokevirtual   #119 <Method void update(byte[], int, int, byte[], int)>
	//    7    9:return          
	}

	private final int blockSize;
	private final Cipher cipher;
	private final byte flushedBlock[];
	private int pendingXorBytes;
	private final byte zerosBlock[];
}
