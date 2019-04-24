// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.hls.playlist:
//			HlsPlaylistTracker

public static final class HlsPlaylistTracker$PlaylistResetException extends IOException
{

	public final String url;

	public HlsPlaylistTracker$PlaylistResetException(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void IOException()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String url>
	//    5    9:return          
	}
}
