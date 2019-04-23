// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.upstream.*;
import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class Aes128DataSource
	implements DataSource
{

	public Aes128DataSource(DataSource datasource, byte abyte0[], byte abyte1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		upstream = datasource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field DataSource upstream>
		encryptionKey = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field byte[] encryptionKey>
		encryptionIv = abyte1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field byte[] encryptionIv>
	//   11   19:return          
	}

	public void close()
		throws IOException
	{
		cipherInputStream = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #30  <Field CipherInputStream cipherInputStream>
		upstream.close();
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field DataSource upstream>
	//    5    9:invokeinterface #32  <Method void DataSource.close()>
	//    6   14:return          
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		Cipher cipher;
		SecretKeySpec secretkeyspec;
		IvParameterSpec ivparameterspec;
		try
		{
			cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
	//    0    0:ldc1            #45  <String "AES/CBC/PKCS7Padding">
	//    1    2:invokestatic    #51  <Method Cipher Cipher.getInstance(String)>
	//    2    5:astore_2        
		}
	//*   3    6:new             #53  <Class SecretKeySpec>
	//*   4    9:dup             
	//*   5   10:aload_0         
	//*   6   11:getfield        #22  <Field byte[] encryptionKey>
	//*   7   14:ldc1            #55  <String "AES">
	//*   8   16:invokespecial   #58  <Method void SecretKeySpec(byte[], String)>
	//*   9   19:astore_3        
	//*  10   20:new             #60  <Class IvParameterSpec>
	//*  11   23:dup             
	//*  12   24:aload_0         
	//*  13   25:getfield        #24  <Field byte[] encryptionIv>
	//*  14   28:invokespecial   #63  <Method void IvParameterSpec(byte[])>
	//*  15   31:astore          4
	//*  16   33:aload_2         
	//*  17   34:iconst_2        
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:invokevirtual   #67  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
	//*  21   41:aload_0         
	//*  22   42:new             #69  <Class CipherInputStream>
	//*  23   45:dup             
	//*  24   46:new             #71  <Class DataSourceInputStream>
	//*  25   49:dup             
	//*  26   50:aload_0         
	//*  27   51:getfield        #20  <Field DataSource upstream>
	//*  28   54:aload_1         
	//*  29   55:invokespecial   #74  <Method void DataSourceInputStream(DataSource, DataSpec)>
	//*  30   58:aload_2         
	//*  31   59:invokespecial   #77  <Method void CipherInputStream(java.io.InputStream, Cipher)>
	//*  32   62:putfield        #30  <Field CipherInputStream cipherInputStream>
	//*  33   65:ldc2w           #78  <Long -1L>
	//*  34   68:lreturn         
	//*  35   69:astore_1        
	//*  36   70:new             #81  <Class RuntimeException>
	//*  37   73:dup             
	//*  38   74:aload_1         
	//*  39   75:invokespecial   #84  <Method void RuntimeException(Throwable)>
	//*  40   78:athrow          
	//*  41   79:astore_1        
	//*  42   80:new             #81  <Class RuntimeException>
	//*  43   83:dup             
	//*  44   84:aload_1         
	//*  45   85:invokespecial   #84  <Method void RuntimeException(Throwable)>
	//*  46   88:athrow          
	//*  47   89:astore_1        
	//*  48   90:new             #81  <Class RuntimeException>
	//*  49   93:dup             
	//*  50   94:aload_1         
	//*  51   95:invokespecial   #84  <Method void RuntimeException(Throwable)>
	//*  52   98:athrow          
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  53   99:astore_1        
		{
			throw new RuntimeException(((Throwable) (dataspec)));
	//   54  100:new             #81  <Class RuntimeException>
	//   55  103:dup             
	//   56  104:aload_1         
	//   57  105:invokespecial   #84  <Method void RuntimeException(Throwable)>
	//   58  108:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
		{
			throw new RuntimeException(((Throwable) (dataspec)));
		}
		secretkeyspec = new SecretKeySpec(encryptionKey, "AES");
		ivparameterspec = new IvParameterSpec(encryptionIv);
		try
		{
			cipher.init(2, ((java.security.Key) (secretkeyspec)), ((java.security.spec.AlgorithmParameterSpec) (ivparameterspec)));
		}
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
		{
			throw new RuntimeException(((Throwable) (dataspec)));
		}
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
		{
			throw new RuntimeException(((Throwable) (dataspec)));
		}
		cipherInputStream = new CipherInputStream(((java.io.InputStream) (new DataSourceInputStream(upstream, dataspec))), cipher);
		return -1L;
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		boolean flag;
		if(cipherInputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field CipherInputStream cipherInputStream>
	//*   2    4:ifnull          13
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          4
		else
	//*   5   10:goto            16
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          4
		Assertions.checkState(flag);
	//    8   16:iload           4
	//    9   18:invokestatic    #92  <Method void Assertions.checkState(boolean)>
		i = cipherInputStream.read(abyte0, i, j);
	//   10   21:aload_0         
	//   11   22:getfield        #30  <Field CipherInputStream cipherInputStream>
	//   12   25:aload_1         
	//   13   26:iload_2         
	//   14   27:iload_3         
	//   15   28:invokevirtual   #94  <Method int CipherInputStream.read(byte[], int, int)>
	//   16   31:istore_2        
		if(i < 0)
	//*  17   32:iload_2         
	//*  18   33:ifge            38
			return -1;
	//   19   36:iconst_m1       
	//   20   37:ireturn         
		else
			return i;
	//   21   38:iload_2         
	//   22   39:ireturn         
	}

	private CipherInputStream cipherInputStream;
	private final byte encryptionIv[];
	private final byte encryptionKey[];
	private final DataSource upstream;
}
