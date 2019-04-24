// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.crypto;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream.crypto:
//			CryptoUtil, AesFlushingCipher

public final class AesCipherDataSource
	implements DataSource
{

	public AesCipherDataSource(byte abyte0[], DataSource datasource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		upstream = datasource;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #19  <Field DataSource upstream>
		secretKey = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field byte[] secretKey>
	//    8   14:return          
	}

	public void close()
		throws IOException
	{
		cipher = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #27  <Field AesFlushingCipher cipher>
		upstream.close();
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field DataSource upstream>
	//    5    9:invokeinterface #29  <Method void DataSource.close()>
	//    6   14:return          
	}

	public Uri getUri()
	{
		return upstream.getUri();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DataSource upstream>
	//    2    4:invokeinterface #34  <Method Uri DataSource.getUri()>
	//    3    9:areturn         
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		long l = upstream.open(dataspec);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DataSource upstream>
	//    2    4:aload_1         
	//    3    5:invokeinterface #38  <Method long DataSource.open(DataSpec)>
	//    4   10:lstore_2        
		long l1 = CryptoUtil.getFNV64Hash(dataspec.key);
	//    5   11:aload_1         
	//    6   12:getfield        #44  <Field String DataSpec.key>
	//    7   15:invokestatic    #50  <Method long CryptoUtil.getFNV64Hash(String)>
	//    8   18:lstore          4
		cipher = new AesFlushingCipher(2, secretKey, l1, dataspec.absoluteStreamPosition);
	//    9   20:aload_0         
	//   10   21:new             #52  <Class AesFlushingCipher>
	//   11   24:dup             
	//   12   25:iconst_2        
	//   13   26:aload_0         
	//   14   27:getfield        #21  <Field byte[] secretKey>
	//   15   30:lload           4
	//   16   32:aload_1         
	//   17   33:getfield        #56  <Field long DataSpec.absoluteStreamPosition>
	//   18   36:invokespecial   #59  <Method void AesFlushingCipher(int, byte[], long, long)>
	//   19   39:putfield        #27  <Field AesFlushingCipher cipher>
		return l;
	//   20   42:lload_2         
	//   21   43:lreturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		j = upstream.read(abyte0, i, j);
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field DataSource upstream>
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:iload_3         
	//    9   13:invokeinterface #63  <Method int DataSource.read(byte[], int, int)>
	//   10   18:istore_3        
		if(j == -1)
	//*  11   19:iload_3         
	//*  12   20:iconst_m1       
	//*  13   21:icmpne          26
		{
			return -1;
	//   14   24:iconst_m1       
	//   15   25:ireturn         
		} else
		{
			cipher.updateInPlace(abyte0, i, j);
	//   16   26:aload_0         
	//   17   27:getfield        #27  <Field AesFlushingCipher cipher>
	//   18   30:aload_1         
	//   19   31:iload_2         
	//   20   32:iload_3         
	//   21   33:invokevirtual   #67  <Method void AesFlushingCipher.updateInPlace(byte[], int, int)>
			return j;
	//   22   36:iload_3         
	//   23   37:ireturn         
		}
	}

	private AesFlushingCipher cipher;
	private final byte secretKey[];
	private final DataSource upstream;
}
