// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming:
//			DefaultSsChunkSource, SsChunkSource

public static final class DefaultSsChunkSource$Factory
	implements SsChunkSource.Factory
{

	public SsChunkSource createChunkSource(LoaderErrorThrower loadererrorthrower, SsManifest ssmanifest, int i, TrackSelection trackselection, TrackEncryptionBox atrackencryptionbox[])
	{
		return ((SsChunkSource) (new DefaultSsChunkSource(loadererrorthrower, ssmanifest, i, trackselection, dataSourceFactory.createDataSource(), atrackencryptionbox)));
	//    0    0:new             #8   <Class DefaultSsChunkSource>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:aload_0         
	//    7   10:getfield        #18  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
	//    8   13:invokeinterface #27  <Method com.google.android.exoplayer2.upstream.DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//    9   18:aload           5
	//   10   20:invokespecial   #30  <Method void DefaultSsChunkSource(LoaderErrorThrower, SsManifest, int, TrackSelection, com.google.android.exoplayer2.upstream.DataSource, TrackEncryptionBox[])>
	//   11   23:areturn         
	}

	private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;

	public DefaultSsChunkSource$Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		dataSourceFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
	//    5    9:return          
	}
}
