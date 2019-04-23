// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsPlaylist

public final class HlsMasterPlaylist extends HlsPlaylist
{

	public HlsMasterPlaylist(String s, List list, List list1, List list2, String s1, String s2)
	{
		super(s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #17  <Method void HlsPlaylist(String, int)>
		variants = Collections.unmodifiableList(list);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokestatic    #23  <Method List Collections.unmodifiableList(List)>
	//    7   11:putfield        #25  <Field List variants>
		audios = Collections.unmodifiableList(list1);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #23  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #27  <Field List audios>
		subtitles = Collections.unmodifiableList(list2);
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:invokestatic    #23  <Method List Collections.unmodifiableList(List)>
	//   15   28:putfield        #29  <Field List subtitles>
		muxedAudioLanguage = s1;
	//   16   31:aload_0         
	//   17   32:aload           5
	//   18   34:putfield        #31  <Field String muxedAudioLanguage>
		muxedCaptionLanguage = s2;
	//   19   37:aload_0         
	//   20   38:aload           6
	//   21   40:putfield        #33  <Field String muxedCaptionLanguage>
	//   22   43:return          
	}

	public final List audios;
	public final String muxedAudioLanguage;
	public final String muxedCaptionLanguage;
	public final List subtitles;
	public final List variants;
}
