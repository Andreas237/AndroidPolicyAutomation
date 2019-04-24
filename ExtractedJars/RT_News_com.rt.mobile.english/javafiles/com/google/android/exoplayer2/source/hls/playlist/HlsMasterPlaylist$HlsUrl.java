// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.Format;

// Referenced classes of package com.google.android.exoplayer2.source.hls.playlist:
//			HlsMasterPlaylist

public static final class HlsMasterPlaylist$HlsUrl
{

	public static HlsMasterPlaylist$HlsUrl createMediaPlaylistHlsUrl(String s)
	{
		return new HlsMasterPlaylist$HlsUrl(s, Format.createContainerFormat("0", "application/x-mpegURL", ((String) (null)), ((String) (null)), -1, 0, ((String) (null))));
	//    0    0:new             #2   <Class HlsMasterPlaylist$HlsUrl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #25  <String "0">
	//    4    7:ldc1            #27  <String "application/x-mpegURL">
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:iconst_m1       
	//    8   12:iconst_0        
	//    9   13:aconst_null     
	//   10   14:invokestatic    #33  <Method Format Format.createContainerFormat(String, String, String, String, int, int, String)>
	//   11   17:invokespecial   #35  <Method void HlsMasterPlaylist$HlsUrl(String, Format)>
	//   12   20:areturn         
	}

	public final Format format;
	public final String url;

	public HlsMasterPlaylist$HlsUrl(String s, Format format1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String url>
		format = format1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Format format>
	//    8   14:return          
	}
}
