// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.DataChunk;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsChunkSource, HlsPlaylistParser, HlsMediaPlaylist

private static final class HlsChunkSource$MediaPlaylistChunk extends DataChunk
{

	protected void consume(byte abyte0[], int i)
		throws IOException
	{
		rawResponse = Arrays.copyOf(abyte0, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #39  <Method byte[] Arrays.copyOf(byte[], int)>
	//    4    6:putfield        #41  <Field byte[] rawResponse>
		result = (HlsMediaPlaylist)playlistParser.parse(playlistUrl, ((java.io.InputStream) (new ByteArrayInputStream(rawResponse))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #26  <Field HlsPlaylistParser playlistParser>
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field String playlistUrl>
	//   10   18:new             #43  <Class ByteArrayInputStream>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #41  <Field byte[] rawResponse>
	//   14   26:invokespecial   #46  <Method void ByteArrayInputStream(byte[])>
	//   15   29:invokevirtual   #52  <Method HlsPlaylist HlsPlaylistParser.parse(String, java.io.InputStream)>
	//   16   32:checkcast       #54  <Class HlsMediaPlaylist>
	//   17   35:putfield        #56  <Field HlsMediaPlaylist result>
	//   18   38:return          
	}

	public byte[] getRawResponse()
	{
		return rawResponse;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field byte[] rawResponse>
	//    2    4:areturn         
	}

	public HlsMediaPlaylist getResult()
	{
		return result;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field HlsMediaPlaylist result>
	//    2    4:areturn         
	}

	private final HlsPlaylistParser playlistParser;
	private final String playlistUrl;
	private byte rawResponse[];
	private HlsMediaPlaylist result;
	public final int variantIndex;

	public HlsChunkSource$MediaPlaylistChunk(DataSource datasource, DataSpec dataspec, byte abyte0[], HlsPlaylistParser hlsplaylistparser, int i, String s)
	{
		super(datasource, dataspec, 4, 0, ((com.google.android.exoplayer.chunk.Format) (null)), -1, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_4        
	//    4    4:iconst_0        
	//    5    5:aconst_null     
	//    6    6:iconst_m1       
	//    7    7:aload_3         
	//    8    8:invokespecial   #22  <Method void DataChunk(DataSource, DataSpec, int, int, com.google.android.exoplayer.chunk.Format, int, byte[])>
		variantIndex = i;
	//    9   11:aload_0         
	//   10   12:iload           5
	//   11   14:putfield        #24  <Field int variantIndex>
		playlistParser = hlsplaylistparser;
	//   12   17:aload_0         
	//   13   18:aload           4
	//   14   20:putfield        #26  <Field HlsPlaylistParser playlistParser>
		playlistUrl = s;
	//   15   23:aload_0         
	//   16   24:aload           6
	//   17   26:putfield        #28  <Field String playlistUrl>
	//   18   29:return          
	}
}
