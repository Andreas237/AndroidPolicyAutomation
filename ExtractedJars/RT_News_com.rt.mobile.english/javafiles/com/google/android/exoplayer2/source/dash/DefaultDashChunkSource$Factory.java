// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DefaultDashChunkSource, DashChunkSource

public static final class DefaultDashChunkSource$Factory
	implements DashChunkSource.Factory
{

	public DashChunkSource createDashChunkSource(LoaderErrorThrower loadererrorthrower, DashManifest dashmanifest, int i, int ai[], TrackSelection trackselection, int j, long l, boolean flag, boolean flag1, sgHandler sghandler)
	{
		return ((DashChunkSource) (new DefaultDashChunkSource(loadererrorthrower, dashmanifest, i, ai, trackselection, j, dataSourceFactory.createDataSource(), l, maxSegmentsPerLoad, flag, flag1, sghandler)));
	//    0    0:new             #8   <Class DefaultDashChunkSource>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:iload           6
	//    8   13:aload_0         
	//    9   14:getfield        #24  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
	//   10   17:invokeinterface #35  <Method com.google.android.exoplayer2.upstream.DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//   11   22:lload           7
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field int maxSegmentsPerLoad>
	//   14   28:iload           9
	//   15   30:iload           10
	//   16   32:aload           11
	//   17   34:invokespecial   #38  <Method void DefaultDashChunkSource(LoaderErrorThrower, DashManifest, int, int[], TrackSelection, int, com.google.android.exoplayer2.upstream.DataSource, long, int, boolean, boolean, PlayerEmsgHandler$PlayerTrackEmsgHandler)>
	//   18   37:areturn         
	}

	private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
	private final int maxSegmentsPerLoad;

	public DefaultDashChunkSource$Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
	{
		this(factory, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #18  <Method void DefaultDashChunkSource$Factory(com.google.android.exoplayer2.upstream.DataSource$Factory, int)>
	//    4    6:return          
	}

	public DefaultDashChunkSource$Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		dataSourceFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
		maxSegmentsPerLoad = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int maxSegmentsPerLoad>
	//    8   14:return          
	}
}
