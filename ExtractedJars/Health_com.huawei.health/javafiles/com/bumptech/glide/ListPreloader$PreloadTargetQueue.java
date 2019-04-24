// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.util.Util;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide:
//			ListPreloader

static final class ListPreloader$PreloadTargetQueue
{

	public ListPreloader.PreloadTarget next(int i, int j)
	{
		ListPreloader.PreloadTarget preloadtarget = (ListPreloader.PreloadTarget)queue.poll();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Queue queue>
	//    2    4:invokeinterface #39  <Method Object Queue.poll()>
	//    3    9:checkcast       #25  <Class ListPreloader$PreloadTarget>
	//    4   12:astore_3        
		queue.offer(((Object) (preloadtarget)));
	//    5   13:aload_0         
	//    6   14:getfield        #23  <Field Queue queue>
	//    7   17:aload_3         
	//    8   18:invokeinterface #32  <Method boolean Queue.offer(Object)>
	//    9   23:pop             
		preloadtarget.photoWidth = i;
	//   10   24:aload_3         
	//   11   25:iload_1         
	//   12   26:putfield        #43  <Field int ListPreloader$PreloadTarget.photoWidth>
		preloadtarget.photoHeight = j;
	//   13   29:aload_3         
	//   14   30:iload_2         
	//   15   31:putfield        #46  <Field int ListPreloader$PreloadTarget.photoHeight>
		return preloadtarget;
	//   16   34:aload_3         
	//   17   35:areturn         
	}

	private final Queue queue;

	public ListPreloader$PreloadTargetQueue(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		queue = Util.createQueue(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #21  <Method Queue Util.createQueue(int)>
	//    5    9:putfield        #23  <Field Queue queue>
		for(int j = 0; j < i; j++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iload_1         
	//*  10   16:icmpge          43
			queue.offer(((Object) (new ListPreloader.PreloadTarget())));
	//   11   19:aload_0         
	//   12   20:getfield        #23  <Field Queue queue>
	//   13   23:new             #25  <Class ListPreloader$PreloadTarget>
	//   14   26:dup             
	//   15   27:invokespecial   #26  <Method void ListPreloader$PreloadTarget()>
	//   16   30:invokeinterface #32  <Method boolean Queue.offer(Object)>
	//   17   35:pop             

	//   18   36:iload_2         
	//   19   37:iconst_1        
	//   20   38:iadd            
	//   21   39:istore_2        
	//*  22   40:goto            14
	//   23   43:return          
	}
}
