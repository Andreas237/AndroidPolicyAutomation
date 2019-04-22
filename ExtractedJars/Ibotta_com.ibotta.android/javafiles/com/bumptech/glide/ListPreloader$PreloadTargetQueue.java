// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import java.util.Queue;

// Referenced classes of package com.bumptech.glide:
//			ListPreloader

private static final class ListPreloader$PreloadTargetQueue
{

	public ListPreloader.PreloadTarget next(int i, int j)
	{
		ListPreloader.PreloadTarget preloadtarget = (ListPreloader.PreloadTarget)queue.poll();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Queue queue>
	//    2    4:invokeinterface #20  <Method Object Queue.poll()>
	//    3    9:checkcast       #22  <Class ListPreloader$PreloadTarget>
	//    4   12:astore_3        
		queue.offer(((Object) (preloadtarget)));
	//    5   13:aload_0         
	//    6   14:getfield        #14  <Field Queue queue>
	//    7   17:aload_3         
	//    8   18:invokeinterface #26  <Method boolean Queue.offer(Object)>
	//    9   23:pop             
		preloadtarget.photoWidth = i;
	//   10   24:aload_3         
	//   11   25:iload_1         
	//   12   26:putfield        #30  <Field int ListPreloader$PreloadTarget.photoWidth>
		preloadtarget.photoHeight = j;
	//   13   29:aload_3         
	//   14   30:iload_2         
	//   15   31:putfield        #33  <Field int ListPreloader$PreloadTarget.photoHeight>
		return preloadtarget;
	//   16   34:aload_3         
	//   17   35:areturn         
	}

	private final Queue queue;
}
