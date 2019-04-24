// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.PriorityTaskManager;

// Referenced classes of package com.google.android.exoplayer2:
//			DefaultLoadControl

public static final class DefaultLoadControl$Builder
{

	public DefaultLoadControl createDefaultLoadControl()
	{
		if(allocator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field DefaultAllocator allocator>
	//*   2    4:ifnonnull       21
			allocator = new DefaultAllocator(true, 0x10000);
	//    3    7:aload_0         
	//    4    8:new             #45  <Class DefaultAllocator>
	//    5   11:dup             
	//    6   12:iconst_1        
	//    7   13:ldc1            #46  <Int 0x10000>
	//    8   15:invokespecial   #49  <Method void DefaultAllocator(boolean, int)>
	//    9   18:putfield        #25  <Field DefaultAllocator allocator>
		return new DefaultLoadControl(allocator, minBufferMs, maxBufferMs, bufferForPlaybackMs, bufferForPlaybackAfterRebufferMs, targetBufferBytes, prioritizeTimeOverSizeThresholds, priorityTaskManager);
	//   10   21:new             #6   <Class DefaultLoadControl>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:getfield        #25  <Field DefaultAllocator allocator>
	//   14   29:aload_0         
	//   15   30:getfield        #27  <Field int minBufferMs>
	//   16   33:aload_0         
	//   17   34:getfield        #30  <Field int maxBufferMs>
	//   18   37:aload_0         
	//   19   38:getfield        #32  <Field int bufferForPlaybackMs>
	//   20   41:aload_0         
	//   21   42:getfield        #34  <Field int bufferForPlaybackAfterRebufferMs>
	//   22   45:aload_0         
	//   23   46:getfield        #36  <Field int targetBufferBytes>
	//   24   49:aload_0         
	//   25   50:getfield        #38  <Field boolean prioritizeTimeOverSizeThresholds>
	//   26   53:aload_0         
	//   27   54:getfield        #40  <Field PriorityTaskManager priorityTaskManager>
	//   28   57:invokespecial   #52  <Method void DefaultLoadControl(DefaultAllocator, int, int, int, int, int, boolean, PriorityTaskManager)>
	//   29   60:areturn         
	}

	public DefaultLoadControl$Builder setAllocator(DefaultAllocator defaultallocator)
	{
		allocator = defaultallocator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field DefaultAllocator allocator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultLoadControl$Builder setBufferDurationsMs(int i, int j, int k, int l)
	{
		minBufferMs = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int minBufferMs>
		maxBufferMs = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #30  <Field int maxBufferMs>
		bufferForPlaybackMs = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #32  <Field int bufferForPlaybackMs>
		bufferForPlaybackAfterRebufferMs = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #34  <Field int bufferForPlaybackAfterRebufferMs>
		return this;
	//   12   21:aload_0         
	//   13   22:areturn         
	}

	public DefaultLoadControl$Builder setPrioritizeTimeOverSizeThresholds(boolean flag)
	{
		prioritizeTimeOverSizeThresholds = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field boolean prioritizeTimeOverSizeThresholds>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultLoadControl$Builder setPriorityTaskManager(PriorityTaskManager prioritytaskmanager)
	{
		priorityTaskManager = prioritytaskmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field PriorityTaskManager priorityTaskManager>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DefaultLoadControl$Builder setTargetBufferBytes(int i)
	{
		targetBufferBytes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int targetBufferBytes>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private DefaultAllocator allocator;
	private int bufferForPlaybackAfterRebufferMs;
	private int bufferForPlaybackMs;
	private int maxBufferMs;
	private int minBufferMs;
	private boolean prioritizeTimeOverSizeThresholds;
	private PriorityTaskManager priorityTaskManager;
	private int targetBufferBytes;

	public DefaultLoadControl$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		allocator = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field DefaultAllocator allocator>
		minBufferMs = 15000;
	//    5    9:aload_0         
	//    6   10:sipush          15000
	//    7   13:putfield        #27  <Field int minBufferMs>
		maxBufferMs = 50000;
	//    8   16:aload_0         
	//    9   17:ldc1            #28  <Int 50000>
	//   10   19:putfield        #30  <Field int maxBufferMs>
		bufferForPlaybackMs = 2500;
	//   11   22:aload_0         
	//   12   23:sipush          2500
	//   13   26:putfield        #32  <Field int bufferForPlaybackMs>
		bufferForPlaybackAfterRebufferMs = 5000;
	//   14   29:aload_0         
	//   15   30:sipush          5000
	//   16   33:putfield        #34  <Field int bufferForPlaybackAfterRebufferMs>
		targetBufferBytes = -1;
	//   17   36:aload_0         
	//   18   37:iconst_m1       
	//   19   38:putfield        #36  <Field int targetBufferBytes>
		prioritizeTimeOverSizeThresholds = true;
	//   20   41:aload_0         
	//   21   42:iconst_1        
	//   22   43:putfield        #38  <Field boolean prioritizeTimeOverSizeThresholds>
		priorityTaskManager = null;
	//   23   46:aload_0         
	//   24   47:aconst_null     
	//   25   48:putfield        #40  <Field PriorityTaskManager priorityTaskManager>
	//   26   51:return          
	}
}
