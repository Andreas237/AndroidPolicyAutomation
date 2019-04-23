// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.extractor.TrackOutput;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			ChunkExtractorWrapper

public static interface ChunkExtractorWrapper$SingleTrackOutput
	extends TrackOutput
{

	public abstract void drmInitData(DrmInitData drminitdata);

	public abstract void seekMap(SeekMap seekmap);
}
