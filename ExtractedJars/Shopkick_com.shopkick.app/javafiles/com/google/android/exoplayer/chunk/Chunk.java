// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			Format

public abstract class Chunk
	implements com.google.android.exoplayer.upstream.Loader.Loadable
{

	public Chunk(DataSource datasource, DataSpec dataspec, int i, int j, Format format1, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		dataSource = (DataSource)Assertions.checkNotNull(((Object) (datasource)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #47  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #49  <Class DataSource>
	//    6   12:putfield        #51  <Field DataSource dataSource>
		dataSpec = (DataSpec)Assertions.checkNotNull(((Object) (dataspec)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #47  <Method Object Assertions.checkNotNull(Object)>
	//   10   20:checkcast       #53  <Class DataSpec>
	//   11   23:putfield        #55  <Field DataSpec dataSpec>
		type = i;
	//   12   26:aload_0         
	//   13   27:iload_3         
	//   14   28:putfield        #57  <Field int type>
		trigger = j;
	//   15   31:aload_0         
	//   16   32:iload           4
	//   17   34:putfield        #59  <Field int trigger>
		format = format1;
	//   18   37:aload_0         
	//   19   38:aload           5
	//   20   40:putfield        #61  <Field Format format>
		parentId = k;
	//   21   43:aload_0         
	//   22   44:iload           6
	//   23   46:putfield        #63  <Field int parentId>
	//   24   49:return          
	}

	public abstract long bytesLoaded();

	public static final int NO_PARENT_ID = -1;
	public static final int TRIGGER_ADAPTIVE = 3;
	public static final int TRIGGER_CUSTOM_BASE = 10000;
	public static final int TRIGGER_INITIAL = 1;
	public static final int TRIGGER_MANUAL = 2;
	public static final int TRIGGER_TRICK_PLAY = 4;
	public static final int TRIGGER_UNSPECIFIED = 0;
	public static final int TYPE_CUSTOM_BASE = 10000;
	public static final int TYPE_DRM = 3;
	public static final int TYPE_MANIFEST = 4;
	public static final int TYPE_MEDIA = 1;
	public static final int TYPE_MEDIA_INITIALIZATION = 2;
	public static final int TYPE_UNSPECIFIED = 0;
	protected final DataSource dataSource;
	public final DataSpec dataSpec;
	public final Format format;
	public final int parentId;
	public final int trigger;
	public final int type;
}
