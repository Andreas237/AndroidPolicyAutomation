// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.Assertions;
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
		if(cipherInputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field CipherInputStream cipherInputStream>
	//*   2    4:ifnull          21
		{
			cipherInputStream = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #30  <Field CipherInputStream cipherInputStream>
			upstream.close();
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field DataSource upstream>
	//    8   16:invokeinterface #32  <Method void DataSource.close()>
		}
	//    9   21:return          
	}

	public Uri getUri()
	{
		return upstream.getUri();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DataSource upstream>
	//    2    4:invokeinterface #37  <Method Uri DataSource.getUri()>
	//    3    9:areturn         
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
	//    0    0:ldc1            #49  <String "AES/CBC/PKCS7Padding">
	//    1    2:invokestatic    #55  <Method Cipher Cipher.getInstance(String)>
	//    2    5:astore_2        
		}
	//*   3    6:new             #57  <Class SecretKeySpec>
	//*   4    9:dup             
	//*   5   10:aload_0         
	//*   6   11:getfield        #22  <Field byte[] encryptionKey>
	//*   7   14:ldc1            #59  <String "AES">
	//*   8   16:invokespecial   #62  <Method void SecretKeySpec(byte[], String)>
	//*   9   19:astore_3        
	//*  10   20:new             #64  <Class IvParameterSpec>
	//*  11   23:dup             
	//*  12   24:aload_0         
	//*  13   25:getfield        #24  <Field byte[] encryptionIv>
	//*  14   28:invokespecial   #67  <Method void IvParameterSpec(byte[])>
	//*  15   31:astore          4
	//*  16   33:aload_2         
	//*  17   34:iconst_2        
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:invokevirtual   #71  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
	//*  21   41:new             #73  <Class DataSourceInputStream>
	//*  22   44:dup             
	//*  23   45:aload_0         
	//*  24   46:getfield        #20  <Field DataSource upstream>
	//*  25   49:aload_1         
	//*  26   50:invokespecial   #76  <Method void DataSourceInputStream(DataSource, DataSpec)>
	//*  27   53:astore_1        
	//*  28   54:aload_0         
	//*  29   55:new             #78  <Class CipherInputStream>
	//*  30   58:dup             
	//*  31   59:aload_1         
	//*  32   60:aload_2         
	//*  33   61:invokespecial   #81  <Method void CipherInputStream(java.io.InputStream, Cipher)>
	//*  34   64:putfield        #30  <Field CipherInputStream cipherInputStream>
	//*  35   67:aload_1         
	//*  36   68:invokevirtual   #83  <Method void DataSourceInputStream.open()>
	//*  37   71:ldc2w           #84  <Long -1L>
	//*  38   74:lreturn         
	//*  39   75:astore_1        
	//*  40   76:new             #87  <Class RuntimeException>
	//*  41   79:dup             
	//*  42   80:aload_1         
	//*  43   81:invokespecial   #90  <Method void RuntimeException(Throwable)>
	//*  44   84:athrow          
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  45   85:astore_1        
		{
			throw new RuntimeException(((Throwable) (dataspec)));
	//   46   86:new             #87  <Class RuntimeException>
	//   47   89:dup             
	//   48   90:aload_1         
	//   49   91:invokespecial   #90  <Method void RuntimeException(Throwable)>
	//   50   94:athrow          
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
		dataspec = ((DataSpec) (new DataSourceInputStream(upstream, dataspec)));
		cipherInputStream = new CipherInputStream(((java.io.InputStream) (dataspec)), cipher);
		((DataSourceInputStream) (dataspec)).open();
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
	//    9   18:invokestatic    #98  <Method void Assertions.checkState(boolean)>
		i = cipherInputStream.read(abyte0, i, j);
	//   10   21:aload_0         
	//   11   22:getfield        #30  <Field CipherInputStream cipherInputStream>
	//   12   25:aload_1         
	//   13   26:iload_2         
	//   14   27:iload_3         
	//   15   28:invokevirtual   #100 <Method int CipherInputStream.read(byte[], int, int)>
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
