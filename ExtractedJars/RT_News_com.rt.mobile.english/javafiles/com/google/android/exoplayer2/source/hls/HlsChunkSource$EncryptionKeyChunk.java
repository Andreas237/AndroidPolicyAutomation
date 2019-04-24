// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
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
	//    3    3:invokestatic    #29  <Method byte[] Arrays.copyOf(byte[], int)>
	//    4    6:putfield        #31  <Field byte[] result>
	//    5    9:return          
	}

	public byte[] getResult()
	{
		return result;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field byte[] result>
	//    2    4:areturn         
	}

	public final String iv;
	private byte result[];

	public HlsChunkSource$EncryptionKeyChunk(DataSource datasource, DataSpec dataspec, Format format, int i, Object obj, byte abyte0[], String s)
	{
		super(datasource, dataspec, 3, format, i, obj, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_3        
	//    4    4:aload_3         
	//    5    5:iload           4
	//    6    7:aload           5
	//    7    9:aload           6
	//    8   11:invokespecial   #16  <Method void DataChunk(DataSource, DataSpec, int, Format, int, Object, byte[])>
		iv = s;
	//    9   14:aload_0         
	//   10   15:aload           7
	//   11   17:putfield        #18  <Field String iv>
	//   12   20:return          
	}
}
