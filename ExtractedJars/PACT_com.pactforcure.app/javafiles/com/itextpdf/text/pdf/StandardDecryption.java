// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.pdf.crypto.AESCipher;
import com.itextpdf.text.pdf.crypto.ARCFOUREncryption;

public class StandardDecryption
{

	public StandardDecryption(byte abyte0[], int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		iv = new byte[16];
	//    2    4:aload_0         
	//    3    5:bipush          16
	//    4    7:newarray        byte[]
	//    5    9:putfield        #27  <Field byte[] iv>
		boolean flag;
		if(k == 4 || k == 5)
	//*   6   12:iload           4
	//*   7   14:iconst_4        
	//*   8   15:icmpeq          24
	//*   9   18:iload           4
	//*  10   20:iconst_5        
	//*  11   21:icmpne          59
			flag = true;
	//   12   24:iconst_1        
	//   13   25:istore          5
		else
	//*  14   27:aload_0         
	//*  15   28:iload           5
	//*  16   30:putfield        #29  <Field boolean aes>
	//*  17   33:aload_0         
	//*  18   34:getfield        #29  <Field boolean aes>
	//*  19   37:ifeq            65
	//*  20   40:aload_0         
	//*  21   41:iload_3         
	//*  22   42:newarray        byte[]
	//*  23   44:putfield        #31  <Field byte[] key>
	//*  24   47:aload_1         
	//*  25   48:iload_2         
	//*  26   49:aload_0         
	//*  27   50:getfield        #31  <Field byte[] key>
	//*  28   53:iconst_0        
	//*  29   54:iload_3         
	//*  30   55:invokestatic    #37  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  31   58:return          
			flag = false;
	//   32   59:iconst_0        
	//   33   60:istore          5
		aes = flag;
		if(aes)
		{
			key = new byte[j];
			System.arraycopy(((Object) (abyte0)), i, ((Object) (key)), 0, j);
			return;
		} else
	//*  34   62:goto            27
		{
			arcfour = new ARCFOUREncryption();
	//   35   65:aload_0         
	//   36   66:new             #39  <Class ARCFOUREncryption>
	//   37   69:dup             
	//   38   70:invokespecial   #40  <Method void ARCFOUREncryption()>
	//   39   73:putfield        #42  <Field ARCFOUREncryption arcfour>
			arcfour.prepareARCFOURKey(abyte0, i, j);
	//   40   76:aload_0         
	//   41   77:getfield        #42  <Field ARCFOUREncryption arcfour>
	//   42   80:aload_1         
	//   43   81:iload_2         
	//   44   82:iload_3         
	//   45   83:invokevirtual   #46  <Method void ARCFOUREncryption.prepareARCFOURKey(byte[], int, int)>
			return;
	//   46   86:return          
		}
	}

	public byte[] finish()
	{
		if(cipher != null && aes)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field AESCipher cipher>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:getfield        #29  <Field boolean aes>
	//*   5   11:ifeq            22
			return cipher.doFinal();
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field AESCipher cipher>
	//    8   18:invokevirtual   #56  <Method byte[] AESCipher.doFinal()>
	//    9   21:areturn         
		else
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
	}

	public byte[] update(byte abyte0[], int i, int j)
	{
		if(aes)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean aes>
	//*   2    4:ifeq            129
		{
			if(initiated)
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field boolean initiated>
	//*   5   11:ifeq            25
				return cipher.update(abyte0, i, j);
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field AESCipher cipher>
	//    8   18:aload_1         
	//    9   19:iload_2         
	//   10   20:iload_3         
	//   11   21:invokevirtual   #62  <Method byte[] AESCipher.update(byte[], int, int)>
	//   12   24:areturn         
			int k = Math.min(iv.length - ivptr, j);
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field byte[] iv>
	//   15   29:arraylength     
	//   16   30:aload_0         
	//   17   31:getfield        #64  <Field int ivptr>
	//   18   34:isub            
	//   19   35:iload_3         
	//   20   36:invokestatic    #70  <Method int Math.min(int, int)>
	//   21   39:istore          4
			System.arraycopy(((Object) (abyte0)), i, ((Object) (iv)), ivptr, k);
	//   22   41:aload_1         
	//   23   42:iload_2         
	//   24   43:aload_0         
	//   25   44:getfield        #27  <Field byte[] iv>
	//   26   47:aload_0         
	//   27   48:getfield        #64  <Field int ivptr>
	//   28   51:iload           4
	//   29   53:invokestatic    #37  <Method void System.arraycopy(Object, int, Object, int, int)>
			j -= k;
	//   30   56:iload_3         
	//   31   57:iload           4
	//   32   59:isub            
	//   33   60:istore_3        
			ivptr = ivptr + k;
	//   34   61:aload_0         
	//   35   62:aload_0         
	//   36   63:getfield        #64  <Field int ivptr>
	//   37   66:iload           4
	//   38   68:iadd            
	//   39   69:putfield        #64  <Field int ivptr>
			if(ivptr == iv.length)
	//*  40   72:aload_0         
	//*  41   73:getfield        #64  <Field int ivptr>
	//*  42   76:aload_0         
	//*  43   77:getfield        #27  <Field byte[] iv>
	//*  44   80:arraylength     
	//*  45   81:icmpne          127
			{
				cipher = new AESCipher(false, key, iv);
	//   46   84:aload_0         
	//   47   85:new             #53  <Class AESCipher>
	//   48   88:dup             
	//   49   89:iconst_0        
	//   50   90:aload_0         
	//   51   91:getfield        #31  <Field byte[] key>
	//   52   94:aload_0         
	//   53   95:getfield        #27  <Field byte[] iv>
	//   54   98:invokespecial   #73  <Method void AESCipher(boolean, byte[], byte[])>
	//   55  101:putfield        #51  <Field AESCipher cipher>
				initiated = true;
	//   56  104:aload_0         
	//   57  105:iconst_1        
	//   58  106:putfield        #60  <Field boolean initiated>
				if(j > 0)
	//*  59  109:iload_3         
	//*  60  110:ifle            127
					return cipher.update(abyte0, i + k, j);
	//   61  113:aload_0         
	//   62  114:getfield        #51  <Field AESCipher cipher>
	//   63  117:aload_1         
	//   64  118:iload_2         
	//   65  119:iload           4
	//   66  121:iadd            
	//   67  122:iload_3         
	//   68  123:invokevirtual   #62  <Method byte[] AESCipher.update(byte[], int, int)>
	//   69  126:areturn         
			}
			return null;
	//   70  127:aconst_null     
	//   71  128:areturn         
		} else
		{
			byte abyte1[] = new byte[j];
	//   72  129:iload_3         
	//   73  130:newarray        byte[]
	//   74  132:astore          5
			arcfour.encryptARCFOUR(abyte0, i, j, abyte1, 0);
	//   75  134:aload_0         
	//   76  135:getfield        #42  <Field ARCFOUREncryption arcfour>
	//   77  138:aload_1         
	//   78  139:iload_2         
	//   79  140:iload_3         
	//   80  141:aload           5
	//   81  143:iconst_0        
	//   82  144:invokevirtual   #77  <Method void ARCFOUREncryption.encryptARCFOUR(byte[], int, int, byte[], int)>
			return abyte1;
	//   83  147:aload           5
	//   84  149:areturn         
		}
	}

	private static final int AES_128 = 4;
	private static final int AES_256 = 5;
	private boolean aes;
	protected ARCFOUREncryption arcfour;
	protected AESCipher cipher;
	private boolean initiated;
	private byte iv[];
	private int ivptr;
	private byte key[];
}
