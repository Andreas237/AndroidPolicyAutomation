// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

public abstract class Chunk
	implements com.google.android.exoplayer2.upstream.Loader.Loadable
{

	public Chunk(DataSource datasource, DataSpec dataspec, int i, Format format, int j, Object obj, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		dataSource = (DataSource)Assertions.checkNotNull(((Object) (datasource)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #32  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #34  <Class DataSource>
	//    6   12:putfield        #36  <Field DataSource dataSource>
		dataSpec = (DataSpec)Assertions.checkNotNull(((Object) (dataspec)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #32  <Method Object Assertions.checkNotNull(Object)>
	//   10   20:checkcast       #38  <Class DataSpec>
	//   11   23:putfield        #40  <Field DataSpec dataSpec>
		type = i;
	//   12   26:aload_0         
	//   13   27:iload_3         
	//   14   28:putfield        #42  <Field int type>
		trackFormat = format;
	//   15   31:aload_0         
	//   16   32:aload           4
	//   17   34:putfield        #44  <Field Format trackFormat>
		trackSelectionReason = j;
	//   18   37:aload_0         
	//   19   38:iload           5
	//   20   40:putfield        #46  <Field int trackSelectionReason>
		trackSelectionData = obj;
	//   21   43:aload_0         
	//   22   44:aload           6
	//   23   46:putfield        #48  <Field Object trackSelectionData>
		startTimeUs = l;
	//   24   49:aload_0         
	//   25   50:lload           7
	//   26   52:putfield        #50  <Field long startTimeUs>
		endTimeUs = l1;
	//   27   55:aload_0         
	//   28   56:lload           9
	//   29   58:putfield        #52  <Field long endTimeUs>
	//   30   61:return          
	}

	public abstract long bytesLoaded();

	public final long getDurationUs()
	{
		return endTimeUs - startTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long endTimeUs>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field long startTimeUs>
	//    4    8:lsub            
	//    5    9:lreturn         
	}

	protected final DataSource dataSource;
	public final DataSpec dataSpec;
	public final long endTimeUs;
	public final long startTimeUs;
	public final Format trackFormat;
	public final Object trackSelectionData;
	public final int trackSelectionReason;
	public final int type;
}
