// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.crypto;

import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class AESCipher
{

	public AESCipher(boolean flag, byte abyte0[], byte abyte1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		bp = new PaddedBufferedBlockCipher(((org.spongycastle.crypto.BlockCipher) (new CBCBlockCipher(((org.spongycastle.crypto.BlockCipher) (new AESFastEngine()))))));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class PaddedBufferedBlockCipher>
	//    4    8:dup             
	//    5    9:new             #15  <Class CBCBlockCipher>
	//    6   12:dup             
	//    7   13:new             #17  <Class AESFastEngine>
	//    8   16:dup             
	//    9   17:invokespecial   #18  <Method void AESFastEngine()>
	//   10   20:invokespecial   #21  <Method void CBCBlockCipher(org.spongycastle.crypto.BlockCipher)>
	//   11   23:invokespecial   #22  <Method void PaddedBufferedBlockCipher(org.spongycastle.crypto.BlockCipher)>
	//   12   26:putfield        #24  <Field PaddedBufferedBlockCipher bp>
		abyte0 = ((byte []) (new ParametersWithIV(((org.spongycastle.crypto.CipherParameters) (new KeyParameter(abyte0))), abyte1)));
	//   13   29:new             #26  <Class ParametersWithIV>
	//   14   32:dup             
	//   15   33:new             #28  <Class KeyParameter>
	//   16   36:dup             
	//   17   37:aload_2         
	//   18   38:invokespecial   #31  <Method void KeyParameter(byte[])>
	//   19   41:aload_3         
	//   20   42:invokespecial   #34  <Method void ParametersWithIV(org.spongycastle.crypto.CipherParameters, byte[])>
	//   21   45:astore_2        
		bp.init(flag, ((org.spongycastle.crypto.CipherParameters) (abyte0)));
	//   22   46:aload_0         
	//   23   47:getfield        #24  <Field PaddedBufferedBlockCipher bp>
	//   24   50:iload_1         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #38  <Method void PaddedBufferedBlockCipher.init(boolean, org.spongycastle.crypto.CipherParameters)>
	//   27   55:return          
	}

	public byte[] doFinal()
	{
		byte abyte1[] = new byte[bp.getOutputSize(0)];
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PaddedBufferedBlockCipher bp>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #47  <Method int PaddedBufferedBlockCipher.getOutputSize(int)>
	//    4    8:newarray        byte[]
	//    5   10:astore_3        
		int i;
		byte abyte0[];
		try
		{
			i = bp.doFinal(abyte1, 0);
	//    6   11:aload_0         
	//    7   12:getfield        #24  <Field PaddedBufferedBlockCipher bp>
	//    8   15:aload_3         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #50  <Method int PaddedBufferedBlockCipher.doFinal(byte[], int)>
	//   11   20:istore_1        
		}
	//*  12   21:aload_3         
	//*  13   22:astore_2        
	//*  14   23:iload_1         
	//*  15   24:aload_3         
	//*  16   25:arraylength     
	//*  17   26:icmpeq          41
	//*  18   29:iload_1         
	//*  19   30:newarray        byte[]
	//*  20   32:astore_2        
	//*  21   33:aload_3         
	//*  22   34:iconst_0        
	//*  23   35:aload_2         
	//*  24   36:iconst_0        
	//*  25   37:iload_1         
	//*  26   38:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  27   41:aload_2         
	//*  28   42:areturn         
		catch(Exception exception)
	//*  29   43:astore_2        
		{
			return abyte1;
	//   30   44:aload_3         
	//   31   45:areturn         
		}
		abyte0 = abyte1;
		if(i != abyte1.length)
		{
			abyte0 = new byte[i];
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), 0, i);
		}
		return abyte0;
	}

	public byte[] update(byte abyte0[], int i, int j)
	{
		int k = bp.getUpdateOutputSize(j);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PaddedBufferedBlockCipher bp>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #61  <Method int PaddedBufferedBlockCipher.getUpdateOutputSize(int)>
	//    4    8:istore          4
		byte abyte1[] = null;
	//    5   10:aconst_null     
	//    6   11:astore          5
		if(k > 0)
	//*   7   13:iload           4
	//*   8   15:ifle            41
			abyte1 = new byte[k];
	//    9   18:iload           4
	//   10   20:newarray        byte[]
	//   11   22:astore          5
		bp.processBytes(abyte0, i, j, abyte1, 0);
	//   12   24:aload_0         
	//   13   25:getfield        #24  <Field PaddedBufferedBlockCipher bp>
	//   14   28:aload_1         
	//   15   29:iload_2         
	//   16   30:iload_3         
	//   17   31:aload           5
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #65  <Method int PaddedBufferedBlockCipher.processBytes(byte[], int, int, byte[], int)>
	//   20   37:pop             
		return abyte1;
	//   21   38:aload           5
	//   22   40:areturn         
	//*  23   41:goto            24
	}

	private PaddedBufferedBlockCipher bp;
}
