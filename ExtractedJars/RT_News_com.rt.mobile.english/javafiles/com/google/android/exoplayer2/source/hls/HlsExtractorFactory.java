// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			DefaultHlsExtractorFactory

public interface HlsExtractorFactory
{

	public abstract Pair createExtractor(Extractor extractor, Uri uri, Format format, List list, DrmInitData drminitdata, TimestampAdjuster timestampadjuster);

	public static final HlsExtractorFactory DEFAULT = new DefaultHlsExtractorFactory();

	/* static  */
	/* { */
	//    0    0:new             #10  <Class DefaultHlsExtractorFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void DefaultHlsExtractorFactory()>
	//    3    7:putstatic       #15  <Field HlsExtractorFactory DEFAULT>
	//*   4   10:return          
	/* } */
}
