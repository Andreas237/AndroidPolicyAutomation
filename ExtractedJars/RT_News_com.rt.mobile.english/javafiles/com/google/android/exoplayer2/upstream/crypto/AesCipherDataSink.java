// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream.crypto:
//			CryptoUtil, AesFlushingCipher

public final class AesCipherDataSink
	implements DataSink
{

	public AesCipherDataSink(byte abyte0[], DataSink datasink)
	{
		this(abyte0, datasink, ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #18  <Method void AesCipherDataSink(byte[], DataSink, byte[])>
	//    5    7:return          
	}

	public AesCipherDataSink(byte abyte0[], DataSink datasink, byte abyte1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		wrappedDataSink = datasink;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #24  <Field DataSink wrappedDataSink>
		secretKey = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #26  <Field byte[] secretKey>
		scratch = abyte1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field byte[] scratch>
	//   11   19:return          
	}

	public void close()
		throws IOException
	{
		cipher = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #33  <Field AesFlushingCipher cipher>
		wrappedDataSink.close();
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field DataSink wrappedDataSink>
	//    5    9:invokeinterface #35  <Method void DataSink.close()>
	//    6   14:return          
	}

	public void open(DataSpec dataspec)
		throws IOException
	{
		wrappedDataSink.open(dataspec);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataSink wrappedDataSink>
	//    2    4:aload_1         
	//    3    5:invokeinterface #40  <Method void DataSink.open(DataSpec)>
		long l = CryptoUtil.getFNV64Hash(dataspec.key);
	//    4   10:aload_1         
	//    5   11:getfield        #46  <Field String DataSpec.key>
	//    6   14:invokestatic    #52  <Method long CryptoUtil.getFNV64Hash(String)>
	//    7   17:lstore_2        
		cipher = new AesFlushingCipher(1, secretKey, l, dataspec.absoluteStreamPosition);
	//    8   18:aload_0         
	//    9   19:new             #54  <Class AesFlushingCipher>
	//   10   22:dup             
	//   11   23:iconst_1        
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field byte[] secretKey>
	//   14   28:lload_2         
	//   15   29:aload_1         
	//   16   30:getfield        #58  <Field long DataSpec.absoluteStreamPosition>
	//   17   33:invokespecial   #61  <Method void AesFlushingCipher(int, byte[], long, long)>
	//   18   36:putfield        #33  <Field AesFlushingCipher cipher>
	//   19   39:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		if(scratch == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field byte[] scratch>
	//*   2    4:ifnonnull       30
		{
			cipher.updateInPlace(abyte0, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field AesFlushingCipher cipher>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #66  <Method void AesFlushingCipher.updateInPlace(byte[], int, int)>
			wrappedDataSink.write(abyte0, i, j);
	//    9   17:aload_0         
	//   10   18:getfield        #24  <Field DataSink wrappedDataSink>
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:iload_3         
	//   14   24:invokeinterface #68  <Method void DataSink.write(byte[], int, int)>
			return;
	//   15   29:return          
		}
		int l;
		for(int k = 0; k < j; k += l)
	//*  16   30:iconst_0        
	//*  17   31:istore          4
	//*  18   33:iload           4
	//*  19   35:iload_3         
	//*  20   36:icmpge          98
		{
			l = Math.min(j - k, scratch.length);
	//   21   39:iload_3         
	//   22   40:iload           4
	//   23   42:isub            
	//   24   43:aload_0         
	//   25   44:getfield        #28  <Field byte[] scratch>
	//   26   47:arraylength     
	//   27   48:invokestatic    #74  <Method int Math.min(int, int)>
	//   28   51:istore          5
			cipher.update(abyte0, i + k, l, scratch, 0);
	//   29   53:aload_0         
	//   30   54:getfield        #33  <Field AesFlushingCipher cipher>
	//   31   57:aload_1         
	//   32   58:iload_2         
	//   33   59:iload           4
	//   34   61:iadd            
	//   35   62:iload           5
	//   36   64:aload_0         
	//   37   65:getfield        #28  <Field byte[] scratch>
	//   38   68:iconst_0        
	//   39   69:invokevirtual   #78  <Method void AesFlushingCipher.update(byte[], int, int, byte[], int)>
			wrappedDataSink.write(scratch, 0, l);
	//   40   72:aload_0         
	//   41   73:getfield        #24  <Field DataSink wrappedDataSink>
	//   42   76:aload_0         
	//   43   77:getfield        #28  <Field byte[] scratch>
	//   44   80:iconst_0        
	//   45   81:iload           5
	//   46   83:invokeinterface #68  <Method void DataSink.write(byte[], int, int)>
		}

	//   47   88:iload           4
	//   48   90:iload           5
	//   49   92:iadd            
	//   50   93:istore          4
	//*  51   95:goto            33
	//   52   98:return          
	}

	private AesFlushingCipher cipher;
	private final byte scratch[];
	private final byte secretKey[];
	private final DataSink wrappedDataSink;
}
