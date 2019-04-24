// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.crypto;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;

public class AESCipherCBCnoPad
{

	public AESCipherCBCnoPad(boolean flag, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		cbc = ((BlockCipher) (new CBCBlockCipher(((BlockCipher) (new AESFastEngine())))));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class CBCBlockCipher>
	//    4    8:dup             
	//    5    9:new             #15  <Class AESFastEngine>
	//    6   12:dup             
	//    7   13:invokespecial   #16  <Method void AESFastEngine()>
	//    8   16:invokespecial   #19  <Method void CBCBlockCipher(BlockCipher)>
	//    9   19:putfield        #21  <Field BlockCipher cbc>
		abyte0 = ((byte []) (new KeyParameter(abyte0)));
	//   10   22:new             #23  <Class KeyParameter>
	//   11   25:dup             
	//   12   26:aload_2         
	//   13   27:invokespecial   #26  <Method void KeyParameter(byte[])>
	//   14   30:astore_2        
		cbc.init(flag, ((org.spongycastle.crypto.CipherParameters) (abyte0)));
	//   15   31:aload_0         
	//   16   32:getfield        #21  <Field BlockCipher cbc>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokeinterface #32  <Method void BlockCipher.init(boolean, org.spongycastle.crypto.CipherParameters)>
	//   20   42:return          
	}

	public byte[] processBlock(byte abyte0[], int i, int j)
	{
		if(j % cbc.getBlockSize() != 0)
	//*   0    0:iload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #21  <Field BlockCipher cbc>
	//*   3    5:invokeinterface #39  <Method int BlockCipher.getBlockSize()>
	//*   4   10:irem            
	//*   5   11:ifeq            41
			throw new IllegalArgumentException((new StringBuilder()).append("Not multiple of block: ").append(j).toString());
	//    6   14:new             #41  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:new             #43  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #44  <Method void StringBuilder()>
	//   11   25:ldc1            #46  <String "Not multiple of block: ">
	//   12   27:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:iload_3         
	//   14   31:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
	//   15   34:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   16   37:invokespecial   #60  <Method void IllegalArgumentException(String)>
	//   17   40:athrow          
		byte abyte1[] = new byte[j];
	//   18   41:iload_3         
	//   19   42:newarray        byte[]
	//   20   44:astore          6
		boolean flag = false;
	//   21   46:iconst_0        
	//   22   47:istore          5
		int k = j;
	//   23   49:iload_3         
	//   24   50:istore          4
		j = ((int) (flag));
	//   25   52:iload           5
	//   26   54:istore_3        
		while(k > 0) 
	//*  27   55:iload           4
	//*  28   57:ifle            116
		{
			cbc.processBlock(abyte0, i, abyte1, j);
	//   29   60:aload_0         
	//   30   61:getfield        #21  <Field BlockCipher cbc>
	//   31   64:aload_1         
	//   32   65:iload_2         
	//   33   66:aload           6
	//   34   68:iload_3         
	//   35   69:invokeinterface #63  <Method int BlockCipher.processBlock(byte[], int, byte[], int)>
	//   36   74:pop             
			k -= cbc.getBlockSize();
	//   37   75:iload           4
	//   38   77:aload_0         
	//   39   78:getfield        #21  <Field BlockCipher cbc>
	//   40   81:invokeinterface #39  <Method int BlockCipher.getBlockSize()>
	//   41   86:isub            
	//   42   87:istore          4
			j += cbc.getBlockSize();
	//   43   89:iload_3         
	//   44   90:aload_0         
	//   45   91:getfield        #21  <Field BlockCipher cbc>
	//   46   94:invokeinterface #39  <Method int BlockCipher.getBlockSize()>
	//   47   99:iadd            
	//   48  100:istore_3        
			i += cbc.getBlockSize();
	//   49  101:iload_2         
	//   50  102:aload_0         
	//   51  103:getfield        #21  <Field BlockCipher cbc>
	//   52  106:invokeinterface #39  <Method int BlockCipher.getBlockSize()>
	//   53  111:iadd            
	//   54  112:istore_2        
		}
	//*  55  113:goto            55
		return abyte1;
	//   56  116:aload           6
	//   57  118:areturn         
	}

	private BlockCipher cbc;
}
