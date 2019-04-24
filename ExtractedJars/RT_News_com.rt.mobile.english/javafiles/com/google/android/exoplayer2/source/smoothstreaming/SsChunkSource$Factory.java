// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming:
//			SsChunkSource

public static interface SsChunkSource$Factory
{

	public abstract SsChunkSource createChunkSource(LoaderErrorThrower loadererrorthrower, SsManifest ssmanifest, int i, TrackSelection trackselection, TrackEncryptionBox atrackencryptionbox[]);
}
