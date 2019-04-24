// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2:
//			LoadControl, Renderer

public class DefaultLoadControl
	implements LoadControl
{
	public static final class Builder
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

		public Builder setAllocator(DefaultAllocator defaultallocator)
		{
			allocator = defaultallocator;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field DefaultAllocator allocator>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setBufferDurationsMs(int i, int j, int k, int l)
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

		public Builder setPrioritizeTimeOverSizeThresholds(boolean flag)
		{
			prioritizeTimeOverSizeThresholds = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #38  <Field boolean prioritizeTimeOverSizeThresholds>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPriorityTaskManager(PriorityTaskManager prioritytaskmanager)
		{
			priorityTaskManager = prioritytaskmanager;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field PriorityTaskManager priorityTaskManager>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTargetBufferBytes(int i)
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

		public Builder()
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


	public DefaultLoadControl()
	{
		this(new DefaultAllocator(true, 0x10000));
	//    0    0:aload_0         
	//    1    1:new             #40  <Class DefaultAllocator>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:ldc1            #41  <Int 0x10000>
	//    5    8:invokespecial   #44  <Method void DefaultAllocator(boolean, int)>
	//    6   11:invokespecial   #47  <Method void DefaultLoadControl(DefaultAllocator)>
	//    7   14:return          
	}

	public DefaultLoadControl(DefaultAllocator defaultallocator)
	{
		this(defaultallocator, 15000, 50000, 2500, 5000, -1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          15000
	//    3    5:ldc1            #16  <Int 50000>
	//    4    7:sipush          2500
	//    5   10:sipush          5000
	//    6   13:iconst_m1       
	//    7   14:iconst_1        
	//    8   15:invokespecial   #52  <Method void DefaultLoadControl(DefaultAllocator, int, int, int, int, int, boolean)>
	//    9   18:return          
	}

	public DefaultLoadControl(DefaultAllocator defaultallocator, int i, int j, int k, int l, int i1, boolean flag)
	{
		this(defaultallocator, i, j, k, l, i1, flag, ((PriorityTaskManager) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:aconst_null     
	//    9   13:invokespecial   #56  <Method void DefaultLoadControl(DefaultAllocator, int, int, int, int, int, boolean, PriorityTaskManager)>
	//   10   16:return          
	}

	public DefaultLoadControl(DefaultAllocator defaultallocator, int i, int j, int k, int l, int i1, boolean flag, 
			PriorityTaskManager prioritytaskmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		assertGreaterOrEqual(k, 0, "bufferForPlaybackMs", "0");
	//    2    4:iload           4
	//    3    6:iconst_0        
	//    4    7:ldc1            #60  <String "bufferForPlaybackMs">
	//    5    9:ldc1            #62  <String "0">
	//    6   11:invokestatic    #66  <Method void assertGreaterOrEqual(int, int, String, String)>
		assertGreaterOrEqual(l, 0, "bufferForPlaybackAfterRebufferMs", "0");
	//    7   14:iload           5
	//    8   16:iconst_0        
	//    9   17:ldc1            #68  <String "bufferForPlaybackAfterRebufferMs">
	//   10   19:ldc1            #62  <String "0">
	//   11   21:invokestatic    #66  <Method void assertGreaterOrEqual(int, int, String, String)>
		assertGreaterOrEqual(i, k, "minBufferMs", "bufferForPlaybackMs");
	//   12   24:iload_2         
	//   13   25:iload           4
	//   14   27:ldc1            #70  <String "minBufferMs">
	//   15   29:ldc1            #60  <String "bufferForPlaybackMs">
	//   16   31:invokestatic    #66  <Method void assertGreaterOrEqual(int, int, String, String)>
		assertGreaterOrEqual(i, l, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
	//   17   34:iload_2         
	//   18   35:iload           5
	//   19   37:ldc1            #70  <String "minBufferMs">
	//   20   39:ldc1            #68  <String "bufferForPlaybackAfterRebufferMs">
	//   21   41:invokestatic    #66  <Method void assertGreaterOrEqual(int, int, String, String)>
		assertGreaterOrEqual(j, i, "maxBufferMs", "minBufferMs");
	//   22   44:iload_3         
	//   23   45:iload_2         
	//   24   46:ldc1            #72  <String "maxBufferMs">
	//   25   48:ldc1            #70  <String "minBufferMs">
	//   26   50:invokestatic    #66  <Method void assertGreaterOrEqual(int, int, String, String)>
		allocator = defaultallocator;
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:putfield        #74  <Field DefaultAllocator allocator>
		minBufferUs = (long)i * 1000L;
	//   30   58:aload_0         
	//   31   59:iload_2         
	//   32   60:i2l             
	//   33   61:ldc2w           #75  <Long 1000L>
	//   34   64:lmul            
	//   35   65:putfield        #78  <Field long minBufferUs>
		maxBufferUs = (long)j * 1000L;
	//   36   68:aload_0         
	//   37   69:iload_3         
	//   38   70:i2l             
	//   39   71:ldc2w           #75  <Long 1000L>
	//   40   74:lmul            
	//   41   75:putfield        #80  <Field long maxBufferUs>
		bufferForPlaybackUs = (long)k * 1000L;
	//   42   78:aload_0         
	//   43   79:iload           4
	//   44   81:i2l             
	//   45   82:ldc2w           #75  <Long 1000L>
	//   46   85:lmul            
	//   47   86:putfield        #82  <Field long bufferForPlaybackUs>
		bufferForPlaybackAfterRebufferUs = (long)l * 1000L;
	//   48   89:aload_0         
	//   49   90:iload           5
	//   50   92:i2l             
	//   51   93:ldc2w           #75  <Long 1000L>
	//   52   96:lmul            
	//   53   97:putfield        #84  <Field long bufferForPlaybackAfterRebufferUs>
		targetBufferBytesOverwrite = i1;
	//   54  100:aload_0         
	//   55  101:iload           6
	//   56  103:putfield        #86  <Field int targetBufferBytesOverwrite>
		prioritizeTimeOverSizeThresholds = flag;
	//   57  106:aload_0         
	//   58  107:iload           7
	//   59  109:putfield        #88  <Field boolean prioritizeTimeOverSizeThresholds>
		priorityTaskManager = prioritytaskmanager;
	//   60  112:aload_0         
	//   61  113:aload           8
	//   62  115:putfield        #90  <Field PriorityTaskManager priorityTaskManager>
	//   63  118:return          
	}

	private static void assertGreaterOrEqual(int i, int j, String s, String s1)
	{
		boolean flag;
		if(i >= j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmplt          11
			flag = true;
	//    3    5:iconst_1        
	//    4    6:istore          4
		else
	//*   5    8:goto            14
			flag = false;
	//    6   11:iconst_0        
	//    7   12:istore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #92  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #93  <Method void StringBuilder()>
	//   11   21:astore          5
		stringbuilder.append(s);
	//   12   23:aload           5
	//   13   25:aload_2         
	//   14   26:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(" cannot be less than ");
	//   16   30:aload           5
	//   17   32:ldc1            #99  <String " cannot be less than ">
	//   18   34:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		stringbuilder.append(s1);
	//   20   38:aload           5
	//   21   40:aload_3         
	//   22   41:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		Assertions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   24   45:iload           4
	//   25   47:aload           5
	//   26   49:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   27   52:invokestatic    #109 <Method void Assertions.checkArgument(boolean, Object)>
	//   28   55:return          
	}

	private void reset(boolean flag)
	{
		targetBufferSize = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #113 <Field int targetBufferSize>
		if(priorityTaskManager != null && isBuffering)
	//*   3    5:aload_0         
	//*   4    6:getfield        #90  <Field PriorityTaskManager priorityTaskManager>
	//*   5    9:ifnull          27
	//*   6   12:aload_0         
	//*   7   13:getfield        #115 <Field boolean isBuffering>
	//*   8   16:ifeq            27
			priorityTaskManager.remove(0);
	//    9   19:aload_0         
	//   10   20:getfield        #90  <Field PriorityTaskManager priorityTaskManager>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #121 <Method void PriorityTaskManager.remove(int)>
		isBuffering = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #115 <Field boolean isBuffering>
		if(flag)
	//*  16   32:iload_1         
	//*  17   33:ifeq            43
			allocator.reset();
	//   18   36:aload_0         
	//   19   37:getfield        #74  <Field DefaultAllocator allocator>
	//   20   40:invokevirtual   #123 <Method void DefaultAllocator.reset()>
	//   21   43:return          
	}

	protected int calculateTargetBufferSize(Renderer arenderer[], TrackSelectionArray trackselectionarray)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j;
		int k;
		for(j = 0; i < arenderer.length; j = k)
	//*   2    2:iconst_0        
	//*   3    3:istore          4
	//*   4    5:iload_3         
	//*   5    6:aload_1         
	//*   6    7:arraylength     
	//*   7    8:icmpge          50
		{
			k = j;
	//    8   11:iload           4
	//    9   13:istore          5
			if(trackselectionarray.get(i) != null)
	//*  10   15:aload_2         
	//*  11   16:iload_3         
	//*  12   17:invokevirtual   #131 <Method com.google.android.exoplayer2.trackselection.TrackSelection TrackSelectionArray.get(int)>
	//*  13   20:ifnull          39
				k = j + Util.getDefaultBufferSize(arenderer[i].getTrackType());
	//   14   23:iload           4
	//   15   25:aload_1         
	//   16   26:iload_3         
	//   17   27:aaload          
	//   18   28:invokeinterface #137 <Method int Renderer.getTrackType()>
	//   19   33:invokestatic    #143 <Method int Util.getDefaultBufferSize(int)>
	//   20   36:iadd            
	//   21   37:istore          5
			i++;
	//   22   39:iload_3         
	//   23   40:iconst_1        
	//   24   41:iadd            
	//   25   42:istore_3        
		}

	//   26   43:iload           5
	//   27   45:istore          4
	//*  28   47:goto            5
		return j;
	//   29   50:iload           4
	//   30   52:ireturn         
	}

	public Allocator getAllocator()
	{
		return ((Allocator) (allocator));
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field DefaultAllocator allocator>
	//    2    4:areturn         
	}

	public long getBackBufferDurationUs()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public void onPrepared()
	{
		reset(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #150 <Method void reset(boolean)>
	//    3    5:return          
	}

	public void onReleased()
	{
		reset(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #150 <Method void reset(boolean)>
	//    3    5:return          
	}

	public void onStopped()
	{
		reset(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #150 <Method void reset(boolean)>
	//    3    5:return          
	}

	public void onTracksSelected(Renderer arenderer[], TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray)
	{
		int i;
		if(targetBufferBytesOverwrite == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field int targetBufferBytesOverwrite>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          19
			i = calculateTargetBufferSize(arenderer, trackselectionarray);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #156 <Method int calculateTargetBufferSize(Renderer[], TrackSelectionArray)>
	//    8   14:istore          4
		else
	//*   9   16:goto            25
			i = targetBufferBytesOverwrite;
	//   10   19:aload_0         
	//   11   20:getfield        #86  <Field int targetBufferBytesOverwrite>
	//   12   23:istore          4
		targetBufferSize = i;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #113 <Field int targetBufferSize>
		allocator.setTargetBufferSize(targetBufferSize);
	//   16   31:aload_0         
	//   17   32:getfield        #74  <Field DefaultAllocator allocator>
	//   18   35:aload_0         
	//   19   36:getfield        #113 <Field int targetBufferSize>
	//   20   39:invokevirtual   #159 <Method void DefaultAllocator.setTargetBufferSize(int)>
	//   21   42:return          
	}

	public boolean retainBackBufferFromKeyframe()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean shouldContinueLoading(long l, float f)
	{
		int i = allocator.getTotalBytesAllocated();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field DefaultAllocator allocator>
	//    2    4:invokevirtual   #166 <Method int DefaultAllocator.getTotalBytesAllocated()>
	//    3    7:istore          4
		int j = targetBufferSize;
	//    4    9:aload_0         
	//    5   10:getfield        #113 <Field int targetBufferSize>
	//    6   13:istore          5
		boolean flag2 = true;
	//    7   15:iconst_1        
	//    8   16:istore          11
		boolean flag;
		if(i >= j)
	//*   9   18:iload           4
	//*  10   20:iload           5
	//*  11   22:icmplt          31
			flag = true;
	//   12   25:iconst_1        
	//   13   26:istore          4
		else
	//*  14   28:goto            34
			flag = false;
	//   15   31:iconst_0        
	//   16   32:istore          4
		boolean flag3 = isBuffering;
	//   17   34:aload_0         
	//   18   35:getfield        #115 <Field boolean isBuffering>
	//   19   38:istore          12
		long l2 = minBufferUs;
	//   20   40:aload_0         
	//   21   41:getfield        #78  <Field long minBufferUs>
	//   22   44:lstore          8
		long l1 = l2;
	//   23   46:lload           8
	//   24   48:lstore          6
		if(f > 1.0F)
	//*  25   50:fload_3         
	//*  26   51:fconst_1        
	//*  27   52:fcmpl           
	//*  28   53:ifle            71
			l1 = Math.min(Util.getMediaDurationForPlayoutDuration(l2, f), maxBufferUs);
	//   29   56:lload           8
	//   30   58:fload_3         
	//   31   59:invokestatic    #170 <Method long Util.getMediaDurationForPlayoutDuration(long, float)>
	//   32   62:aload_0         
	//   33   63:getfield        #80  <Field long maxBufferUs>
	//   34   66:invokestatic    #176 <Method long Math.min(long, long)>
	//   35   69:lstore          6
		if(l < l1)
	//*  36   71:lload_1         
	//*  37   72:lload           6
	//*  38   74:lcmp            
	//*  39   75:ifge            113
		{
			boolean flag1 = flag2;
	//   40   78:iload           11
	//   41   80:istore          10
			if(!prioritizeTimeOverSizeThresholds)
	//*  42   82:aload_0         
	//*  43   83:getfield        #88  <Field boolean prioritizeTimeOverSizeThresholds>
	//*  44   86:ifne            104
				if(!flag)
	//*  45   89:iload           4
	//*  46   91:ifne            101
					flag1 = flag2;
	//   47   94:iload           11
	//   48   96:istore          10
				else
	//*  49   98:goto            104
					flag1 = false;
	//   50  101:iconst_0        
	//   51  102:istore          10
			isBuffering = flag1;
	//   52  104:aload_0         
	//   53  105:iload           10
	//   54  107:putfield        #115 <Field boolean isBuffering>
		} else
	//*  55  110:goto            132
		if(l > maxBufferUs || flag)
	//*  56  113:lload_1         
	//*  57  114:aload_0         
	//*  58  115:getfield        #80  <Field long maxBufferUs>
	//*  59  118:lcmp            
	//*  60  119:ifgt            127
	//*  61  122:iload           4
	//*  62  124:ifeq            132
			isBuffering = false;
	//   63  127:aload_0         
	//   64  128:iconst_0        
	//   65  129:putfield        #115 <Field boolean isBuffering>
		if(priorityTaskManager != null && isBuffering != flag3)
	//*  66  132:aload_0         
	//*  67  133:getfield        #90  <Field PriorityTaskManager priorityTaskManager>
	//*  68  136:ifnull          174
	//*  69  139:aload_0         
	//*  70  140:getfield        #115 <Field boolean isBuffering>
	//*  71  143:iload           12
	//*  72  145:icmpeq          174
			if(isBuffering)
	//*  73  148:aload_0         
	//*  74  149:getfield        #115 <Field boolean isBuffering>
	//*  75  152:ifeq            166
				priorityTaskManager.add(0);
	//   76  155:aload_0         
	//   77  156:getfield        #90  <Field PriorityTaskManager priorityTaskManager>
	//   78  159:iconst_0        
	//   79  160:invokevirtual   #179 <Method void PriorityTaskManager.add(int)>
			else
	//*  80  163:goto            174
				priorityTaskManager.remove(0);
	//   81  166:aload_0         
	//   82  167:getfield        #90  <Field PriorityTaskManager priorityTaskManager>
	//   83  170:iconst_0        
	//   84  171:invokevirtual   #121 <Method void PriorityTaskManager.remove(int)>
		return isBuffering;
	//   85  174:aload_0         
	//   86  175:getfield        #115 <Field boolean isBuffering>
	//   87  178:ireturn         
	}

	public boolean shouldStartPlayback(long l, float f, boolean flag)
	{
		long l1 = Util.getPlayoutDurationForMediaDuration(l, f);
	//    0    0:lload_1         
	//    1    1:fload_3         
	//    2    2:invokestatic    #184 <Method long Util.getPlayoutDurationForMediaDuration(long, float)>
	//    3    5:lstore          5
		if(flag)
	//*   4    7:iload           4
	//*   5    9:ifeq            20
			l = bufferForPlaybackAfterRebufferUs;
	//    6   12:aload_0         
	//    7   13:getfield        #84  <Field long bufferForPlaybackAfterRebufferUs>
	//    8   16:lstore_1        
		else
	//*   9   17:goto            25
			l = bufferForPlaybackUs;
	//   10   20:aload_0         
	//   11   21:getfield        #82  <Field long bufferForPlaybackUs>
	//   12   24:lstore_1        
		return l <= 0L || l1 >= l || !prioritizeTimeOverSizeThresholds && allocator.getTotalBytesAllocated() >= targetBufferSize;
	//   13   25:lload_1         
	//   14   26:lconst_0        
	//   15   27:lcmp            
	//   16   28:ifle            64
	//   17   31:lload           5
	//   18   33:lload_1         
	//   19   34:lcmp            
	//   20   35:ifge            64
	//   21   38:aload_0         
	//   22   39:getfield        #88  <Field boolean prioritizeTimeOverSizeThresholds>
	//   23   42:ifne            62
	//   24   45:aload_0         
	//   25   46:getfield        #74  <Field DefaultAllocator allocator>
	//   26   49:invokevirtual   #166 <Method int DefaultAllocator.getTotalBytesAllocated()>
	//   27   52:aload_0         
	//   28   53:getfield        #113 <Field int targetBufferSize>
	//   29   56:icmplt          62
	//   30   59:goto            64
	//   31   62:iconst_0        
	//   32   63:ireturn         
	//   33   64:iconst_1        
	//   34   65:ireturn         
	}

	public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
	public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
	public static final int DEFAULT_MAX_BUFFER_MS = 50000;
	public static final int DEFAULT_MIN_BUFFER_MS = 15000;
	public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = true;
	public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
	private final DefaultAllocator allocator;
	private final long bufferForPlaybackAfterRebufferUs;
	private final long bufferForPlaybackUs;
	private boolean isBuffering;
	private final long maxBufferUs;
	private final long minBufferUs;
	private final boolean prioritizeTimeOverSizeThresholds;
	private final PriorityTaskManager priorityTaskManager;
	private final int targetBufferBytesOverwrite;
	private int targetBufferSize;
}
