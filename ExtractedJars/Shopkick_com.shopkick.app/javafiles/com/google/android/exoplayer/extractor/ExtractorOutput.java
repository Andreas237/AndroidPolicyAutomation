// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.drm.DrmInitData;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			SeekMap, TrackOutput

public interface ExtractorOutput
{

	public abstract void drmInitData(DrmInitData drminitdata);

	public abstract void endTracks();

	public abstract void seekMap(SeekMap seekmap);

	public abstract TrackOutput track(int i);
}
