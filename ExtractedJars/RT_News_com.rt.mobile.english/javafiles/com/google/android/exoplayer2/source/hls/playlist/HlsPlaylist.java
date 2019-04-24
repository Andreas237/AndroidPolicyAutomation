// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.FilterableManifest;
import java.util.Collections;
import java.util.List;

public abstract class HlsPlaylist
	implements FilterableManifest
{

	protected HlsPlaylist(String s, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		baseUri = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String baseUri>
		tags = Collections.unmodifiableList(list);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #25  <Method List Collections.unmodifiableList(List)>
	//    8   14:putfield        #27  <Field List tags>
	//    9   17:return          
	}

	public final String baseUri;
	public final List tags;
}
