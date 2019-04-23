// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.DataChunk;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsChunkSource

private static final class HlsChunkSource$EncryptionKeyChunk extends DataChunk
{

	protected void consume(byte abyte0[], int i)
		throws IOException
	{
		result = Arrays.copyOf(abyte0, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #33  <Method byte[] Arrays.copyOf(byte[], int)>
	//    4    6:putfield        #35  <Field byte[] result>
	//    5    9:return          
	}

	public byte[] getResult()
	{
		return result;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field byte[] result>
	//    2    4:areturn         
	}

	public final String iv;
	private byte result[];
	public final int variantIndex;

	public HlsChunkSource$EncryptionKeyChunk(DataSource datasource, DataSpec dataspec, byte abyte0[], String s, int i)
	{
		super(datasource, dataspec, 3, 0, ((com.google.android.exoplayer.chunk.Format) (null)), -1, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_3        
	//    4    4:iconst_0        
	//    5    5:aconst_null     
	//    6    6:iconst_m1       
	//    7    7:aload_3         
	//    8    8:invokespecial   #18  <Method void DataChunk(DataSource, DataSpec, int, int, com.google.android.exoplayer.chunk.Format, int, byte[])>
		iv = s;
	//    9   11:aload_0         
	//   10   12:aload           4
	//   11   14:putfield        #20  <Field String iv>
		variantIndex = i;
	//   12   17:aload_0         
	//   13   18:iload           5
	//   14   20:putfield        #22  <Field int variantIndex>
	//   15   23:return          
	}
}
