// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.upstream.DataSpec;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener

public static final class MediaSourceEventListener$LoadEventInfo
{

	public final long bytesLoaded;
	public final DataSpec dataSpec;
	public final long elapsedRealtimeMs;
	public final long loadDurationMs;

	public MediaSourceEventListener$LoadEventInfo(DataSpec dataspec, long l, long l1, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		dataSpec = dataspec;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field DataSpec dataSpec>
		elapsedRealtimeMs = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #22  <Field long elapsedRealtimeMs>
		loadDurationMs = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #24  <Field long loadDurationMs>
		bytesLoaded = l2;
	//   11   20:aload_0         
	//   12   21:lload           6
	//   13   23:putfield        #26  <Field long bytesLoaded>
	//   14   26:return          
	}
}
