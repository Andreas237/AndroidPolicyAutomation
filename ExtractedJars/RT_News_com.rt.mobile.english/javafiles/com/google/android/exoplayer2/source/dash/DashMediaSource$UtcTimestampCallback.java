// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaSource

private final class DashMediaSource$UtcTimestampCallback
	implements com.google.android.exoplayer2.upstream.Loader.Callback
{

	public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
	{
		onLoadCanceled((ParsingLoadable)loadable, l, l1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class ParsingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:invokevirtual   #30  <Method void onLoadCanceled(ParsingLoadable, long, long, boolean)>
	//    7   13:return          
	}

	public void onLoadCanceled(ParsingLoadable parsingloadable, long l, long l1, boolean flag)
	{
		DashMediaSource.this.onLoadCanceled(parsingloadable, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DashMediaSource this$0>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #33  <Method void DashMediaSource.onLoadCanceled(ParsingLoadable, long, long)>
	//    6   11:return          
	}

	public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
	{
		onLoadCompleted((ParsingLoadable)loadable, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class ParsingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #39  <Method void onLoadCompleted(ParsingLoadable, long, long)>
	//    6   11:return          
	}

	public void onLoadCompleted(ParsingLoadable parsingloadable, long l, long l1)
	{
		onUtcTimestampLoadCompleted(parsingloadable, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DashMediaSource this$0>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #42  <Method void DashMediaSource.onUtcTimestampLoadCompleted(ParsingLoadable, long, long)>
	//    6   11:return          
	}

	public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
	{
		return onLoadError((ParsingLoadable)loadable, l, l1, ioexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class ParsingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:aload           6
	//    6   10:invokevirtual   #48  <Method int onLoadError(ParsingLoadable, long, long, IOException)>
	//    7   13:ireturn         
	}

	public int onLoadError(ParsingLoadable parsingloadable, long l, long l1, IOException ioexception)
	{
		return onUtcTimestampLoadError(parsingloadable, l, l1, ioexception);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DashMediaSource this$0>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:aload           6
	//    6   10:invokevirtual   #51  <Method int DashMediaSource.onUtcTimestampLoadError(ParsingLoadable, long, long, IOException)>
	//    7   13:ireturn         
	}

	final DashMediaSource this$0;

	private DashMediaSource$UtcTimestampCallback()
	{
		this$0 = DashMediaSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DashMediaSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	DashMediaSource$UtcTimestampCallback(DashMediaSource._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void DashMediaSource$UtcTimestampCallback(DashMediaSource)>
	//    3    5:return          
	}
}
