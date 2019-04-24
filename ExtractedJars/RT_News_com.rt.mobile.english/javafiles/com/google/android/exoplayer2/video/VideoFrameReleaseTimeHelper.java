// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.*;
import android.view.*;
import com.google.android.exoplayer2.util.Util;

public final class VideoFrameReleaseTimeHelper
{
	private final class DefaultDisplayListener
		implements android.hardware.display.DisplayManager.DisplayListener
	{

		public void onDisplayAdded(int i)
		{
		//    0    0:return          
		}

		public void onDisplayChanged(int i)
		{
			if(i == 0)
		//*   0    0:iload_1         
		//*   1    1:ifne            11
				updateDefaultDisplayRefreshRateParams();
		//    2    4:aload_0         
		//    3    5:getfield        #20  <Field VideoFrameReleaseTimeHelper this$0>
		//    4    8:invokestatic    #33  <Method void VideoFrameReleaseTimeHelper.access$000(VideoFrameReleaseTimeHelper)>
		//    5   11:return          
		}

		public void onDisplayRemoved(int i)
		{
		//    0    0:return          
		}

		public void register()
		{
			displayManager.registerDisplayListener(((android.hardware.display.DisplayManager.DisplayListener) (this)), ((Handler) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field DisplayManager displayManager>
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokevirtual   #41  <Method void DisplayManager.registerDisplayListener(android.hardware.display.DisplayManager$DisplayListener, Handler)>
		//    5    9:return          
		}

		public void unregister()
		{
			displayManager.unregisterDisplayListener(((android.hardware.display.DisplayManager.DisplayListener) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field DisplayManager displayManager>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #46  <Method void DisplayManager.unregisterDisplayListener(android.hardware.display.DisplayManager$DisplayListener)>
		//    4    8:return          
		}

		private final DisplayManager displayManager;
		final VideoFrameReleaseTimeHelper this$0;

		public DefaultDisplayListener(DisplayManager displaymanager)
		{
			this$0 = VideoFrameReleaseTimeHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field VideoFrameReleaseTimeHelper this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			displayManager = displaymanager;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field DisplayManager displayManager>
		//    8   14:return          
		}
	}

	private static final class VSyncSampler
		implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback
	{

		private void addObserverInternal()
		{
			observerCount = observerCount + 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #72  <Field int observerCount>
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:putfield        #72  <Field int observerCount>
			if(observerCount == 1)
		//*   6   10:aload_0         
		//*   7   11:getfield        #72  <Field int observerCount>
		//*   8   14:iconst_1        
		//*   9   15:icmpne          26
				choreographer.postFrameCallback(((android.view.Choreographer.FrameCallback) (this)));
		//   10   18:aload_0         
		//   11   19:getfield        #74  <Field Choreographer choreographer>
		//   12   22:aload_0         
		//   13   23:invokevirtual   #80  <Method void Choreographer.postFrameCallback(android.view.Choreographer$FrameCallback)>
		//   14   26:return          
		}

		private void createChoreographerInstanceInternal()
		{
			choreographer = Choreographer.getInstance();
		//    0    0:aload_0         
		//    1    1:invokestatic    #85  <Method Choreographer Choreographer.getInstance()>
		//    2    4:putfield        #74  <Field Choreographer choreographer>
		//    3    7:return          
		}

		public static VSyncSampler getInstance()
		{
			return INSTANCE;
		//    0    0:getstatic       #36  <Field VideoFrameReleaseTimeHelper$VSyncSampler INSTANCE>
		//    1    3:areturn         
		}

		private void removeObserverInternal()
		{
			observerCount = observerCount - 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #72  <Field int observerCount>
		//    3    5:iconst_1        
		//    4    6:isub            
		//    5    7:putfield        #72  <Field int observerCount>
			if(observerCount == 0)
		//*   6   10:aload_0         
		//*   7   11:getfield        #72  <Field int observerCount>
		//*   8   14:ifne            32
			{
				choreographer.removeFrameCallback(((android.view.Choreographer.FrameCallback) (this)));
		//    9   17:aload_0         
		//   10   18:getfield        #74  <Field Choreographer choreographer>
		//   11   21:aload_0         
		//   12   22:invokevirtual   #90  <Method void Choreographer.removeFrameCallback(android.view.Choreographer$FrameCallback)>
				sampledVsyncTimeNs = 0x1L;
		//   13   25:aload_0         
		//   14   26:ldc2w           #39  <Long 0x1L>
		//   15   29:putfield        #42  <Field long sampledVsyncTimeNs>
			}
		//   16   32:return          
		}

		public void addObserver()
		{
			handler.sendEmptyMessage(1);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Handler handler>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #69  <Method boolean Handler.sendEmptyMessage(int)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void doFrame(long l)
		{
			sampledVsyncTimeNs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #42  <Field long sampledVsyncTimeNs>
			choreographer.postFrameCallbackDelayed(((android.view.Choreographer.FrameCallback) (this)), 500L);
		//    3    5:aload_0         
		//    4    6:getfield        #74  <Field Choreographer choreographer>
		//    5    9:aload_0         
		//    6   10:ldc2w           #94  <Long 500L>
		//    7   13:invokevirtual   #99  <Method void Choreographer.postFrameCallbackDelayed(android.view.Choreographer$FrameCallback, long)>
		//    8   16:return          
		}

		public boolean handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #106 <Field int Message.what>
			{
		//*   2    4:tableswitch     0 2: default 32
		//		               0 46
		//		               1 40
		//		               2 34
			default:
				return false;
		//    3   32:iconst_0        
		//    4   33:ireturn         

			case 2: // '\002'
				removeObserverInternal();
		//    5   34:aload_0         
		//    6   35:invokespecial   #108 <Method void removeObserverInternal()>
				return true;
		//    7   38:iconst_1        
		//    8   39:ireturn         

			case 1: // '\001'
				addObserverInternal();
		//    9   40:aload_0         
		//   10   41:invokespecial   #110 <Method void addObserverInternal()>
				return true;
		//   11   44:iconst_1        
		//   12   45:ireturn         

			case 0: // '\0'
				createChoreographerInstanceInternal();
		//   13   46:aload_0         
		//   14   47:invokespecial   #112 <Method void createChoreographerInstanceInternal()>
				return true;
		//   15   50:iconst_1        
		//   16   51:ireturn         
			}
		}

		public void removeObserver()
		{
			handler.sendEmptyMessage(2);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Handler handler>
		//    2    4:iconst_2        
		//    3    5:invokevirtual   #69  <Method boolean Handler.sendEmptyMessage(int)>
		//    4    8:pop             
		//    5    9:return          
		}

		private static final int CREATE_CHOREOGRAPHER = 0;
		private static final VSyncSampler INSTANCE = new VSyncSampler();
		private static final int MSG_ADD_OBSERVER = 1;
		private static final int MSG_REMOVE_OBSERVER = 2;
		private Choreographer choreographer;
		private final HandlerThread choreographerOwnerThread = new HandlerThread("ChoreographerOwner:Handler");
		private final Handler handler;
		private int observerCount;
		public volatile long sampledVsyncTimeNs;

		static 
		{
		//    0    0:new             #2   <Class VideoFrameReleaseTimeHelper$VSyncSampler>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void VideoFrameReleaseTimeHelper$VSyncSampler()>
		//    3    7:putstatic       #36  <Field VideoFrameReleaseTimeHelper$VSyncSampler INSTANCE>
		//*   4   10:return          
		}

		private VSyncSampler()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Object()>
			sampledVsyncTimeNs = 0x1L;
		//    2    4:aload_0         
		//    3    5:ldc2w           #39  <Long 0x1L>
		//    4    8:putfield        #42  <Field long sampledVsyncTimeNs>
		//    5   11:aload_0         
		//    6   12:new             #44  <Class HandlerThread>
		//    7   15:dup             
		//    8   16:ldc1            #46  <String "ChoreographerOwner:Handler">
		//    9   18:invokespecial   #49  <Method void HandlerThread(String)>
		//   10   21:putfield        #51  <Field HandlerThread choreographerOwnerThread>
			choreographerOwnerThread.start();
		//   11   24:aload_0         
		//   12   25:getfield        #51  <Field HandlerThread choreographerOwnerThread>
		//   13   28:invokevirtual   #54  <Method void HandlerThread.start()>
			handler = new Handler(choreographerOwnerThread.getLooper(), ((android.os.Handler.Callback) (this)));
		//   14   31:aload_0         
		//   15   32:new             #56  <Class Handler>
		//   16   35:dup             
		//   17   36:aload_0         
		//   18   37:getfield        #51  <Field HandlerThread choreographerOwnerThread>
		//   19   40:invokevirtual   #60  <Method android.os.Looper HandlerThread.getLooper()>
		//   20   43:aload_0         
		//   21   44:invokespecial   #63  <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
		//   22   47:putfield        #65  <Field Handler handler>
			handler.sendEmptyMessage(0);
		//   23   50:aload_0         
		//   24   51:getfield        #65  <Field Handler handler>
		//   25   54:iconst_0        
		//   26   55:invokevirtual   #69  <Method boolean Handler.sendEmptyMessage(int)>
		//   27   58:pop             
		//   28   59:return          
		}
	}


	public VideoFrameReleaseTimeHelper()
	{
		this(((Context) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #47  <Method void VideoFrameReleaseTimeHelper(Context)>
	//    3    5:return          
	}

	public VideoFrameReleaseTimeHelper(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		DefaultDisplayListener defaultdisplaylistener = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		if(context != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          31
		{
			context = context.getApplicationContext();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #57  <Method Context Context.getApplicationContext()>
	//    8   14:astore_1        
			windowManager = (WindowManager)context.getSystemService("window");
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:ldc1            #59  <String "window">
	//   12   19:invokevirtual   #63  <Method Object Context.getSystemService(String)>
	//   13   22:checkcast       #65  <Class WindowManager>
	//   14   25:putfield        #67  <Field WindowManager windowManager>
		} else
	//*  15   28:goto            36
		{
			windowManager = null;
	//   16   31:aload_0         
	//   17   32:aconst_null     
	//   18   33:putfield        #67  <Field WindowManager windowManager>
		}
		if(windowManager != null)
	//*  19   36:aload_0         
	//*  20   37:getfield        #67  <Field WindowManager windowManager>
	//*  21   40:ifnull          72
		{
			if(Util.SDK_INT >= 17)
	//*  22   43:getstatic       #72  <Field int Util.SDK_INT>
	//*  23   46:bipush          17
	//*  24   48:icmplt          57
				defaultdisplaylistener = maybeBuildDefaultDisplayListenerV17(context);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #76  <Method VideoFrameReleaseTimeHelper$DefaultDisplayListener maybeBuildDefaultDisplayListenerV17(Context)>
	//   28   56:astore_2        
			displayListener = defaultdisplaylistener;
	//   29   57:aload_0         
	//   30   58:aload_2         
	//   31   59:putfield        #78  <Field VideoFrameReleaseTimeHelper$DefaultDisplayListener displayListener>
			vsyncSampler = VSyncSampler.getInstance();
	//   32   62:aload_0         
	//   33   63:invokestatic    #82  <Method VideoFrameReleaseTimeHelper$VSyncSampler VideoFrameReleaseTimeHelper$VSyncSampler.getInstance()>
	//   34   66:putfield        #84  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
		} else
	//*  35   69:goto            82
		{
			displayListener = null;
	//   36   72:aload_0         
	//   37   73:aconst_null     
	//   38   74:putfield        #78  <Field VideoFrameReleaseTimeHelper$DefaultDisplayListener displayListener>
			vsyncSampler = null;
	//   39   77:aload_0         
	//   40   78:aconst_null     
	//   41   79:putfield        #84  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
		}
		vsyncDurationNs = 0x1L;
	//   42   82:aload_0         
	//   43   83:ldc2w           #85  <Long 0x1L>
	//   44   86:putfield        #88  <Field long vsyncDurationNs>
		vsyncOffsetNs = 0x1L;
	//   45   89:aload_0         
	//   46   90:ldc2w           #85  <Long 0x1L>
	//   47   93:putfield        #90  <Field long vsyncOffsetNs>
	//   48   96:return          
	}

	private static long closestVsync(long l, long l1, long l2)
	{
		l1 += ((l - l1) / l2) * l2;
	//    0    0:lload_2         
	//    1    1:lload_0         
	//    2    2:lload_2         
	//    3    3:lsub            
	//    4    4:lload           4
	//    5    6:ldiv            
	//    6    7:lload           4
	//    7    9:lmul            
	//    8   10:ladd            
	//    9   11:lstore_2        
		long l3;
		if(l <= l1)
	//*  10   12:lload_0         
	//*  11   13:lload_2         
	//*  12   14:lcmp            
	//*  13   15:ifgt            29
		{
			l3 = l1;
	//   14   18:lload_2         
	//   15   19:lstore          6
			l1 -= l2;
	//   16   21:lload_2         
	//   17   22:lload           4
	//   18   24:lsub            
	//   19   25:lstore_2        
		} else
	//*  20   26:goto            35
		{
			l3 = l1 + l2;
	//   21   29:lload_2         
	//   22   30:lload           4
	//   23   32:ladd            
	//   24   33:lstore          6
		}
		if(l3 - l < l - l1)
	//*  25   35:lload           6
	//*  26   37:lload_0         
	//*  27   38:lsub            
	//*  28   39:lload_0         
	//*  29   40:lload_2         
	//*  30   41:lsub            
	//*  31   42:lcmp            
	//*  32   43:ifge            49
			return l3;
	//   33   46:lload           6
	//   34   48:lreturn         
		else
			return l1;
	//   35   49:lload_2         
	//   36   50:lreturn         
	}

	private boolean isDriftTooLarge(long l, long l1)
	{
		long l2 = syncFramePresentationTimeNs;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field long syncFramePresentationTimeNs>
	//    2    4:lstore          5
		return Math.abs(l1 - syncUnadjustedReleaseTimeNs - (l - l2)) > 0x1312d00L;
	//    3    6:lload_3         
	//    4    7:aload_0         
	//    5    8:getfield        #104 <Field long syncUnadjustedReleaseTimeNs>
	//    6   11:lsub            
	//    7   12:lload_1         
	//    8   13:lload           5
	//    9   15:lsub            
	//   10   16:lsub            
	//   11   17:invokestatic    #110 <Method long Math.abs(long)>
	//   12   20:ldc2w           #19  <Long 0x1312d00L>
	//   13   23:lcmp            
	//   14   24:ifle            29
	//   15   27:iconst_1        
	//   16   28:ireturn         
	//   17   29:iconst_0        
	//   18   30:ireturn         
	}

	private DefaultDisplayListener maybeBuildDefaultDisplayListenerV17(Context context)
	{
		context = ((Context) ((DisplayManager)context.getSystemService("display")));
	//    0    0:aload_1         
	//    1    1:ldc1            #113 <String "display">
	//    2    3:invokevirtual   #63  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #115 <Class DisplayManager>
	//    4    9:astore_1        
		if(context == null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		else
			return new DefaultDisplayListener(((DisplayManager) (context)));
	//    9   16:new             #6   <Class VideoFrameReleaseTimeHelper$DefaultDisplayListener>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokespecial   #118 <Method void VideoFrameReleaseTimeHelper$DefaultDisplayListener(VideoFrameReleaseTimeHelper, DisplayManager)>
	//   14   25:areturn         
	}

	private void updateDefaultDisplayRefreshRateParams()
	{
		Display display = windowManager.getDefaultDisplay();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field WindowManager windowManager>
	//    2    4:invokeinterface #123 <Method Display WindowManager.getDefaultDisplay()>
	//    3    9:astore_1        
		if(display != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          44
		{
			vsyncDurationNs = (long)(1000000000D / (double)display.getRefreshRate());
	//    6   14:aload_0         
	//    7   15:ldc2w           #124 <Double 1000000000D>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #131 <Method float Display.getRefreshRate()>
	//   10   22:f2d             
	//   11   23:ddiv            
	//   12   24:d2l             
	//   13   25:putfield        #88  <Field long vsyncDurationNs>
			vsyncOffsetNs = (vsyncDurationNs * 80L) / 100L;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #88  <Field long vsyncDurationNs>
	//   17   33:ldc2w           #25  <Long 80L>
	//   18   36:lmul            
	//   19   37:ldc2w           #132 <Long 100L>
	//   20   40:ldiv            
	//   21   41:putfield        #90  <Field long vsyncOffsetNs>
		}
	//   22   44:return          
	}

	public long adjustReleaseTime(long l, long l1)
	{
		long l2;
		long l3;
		long l4;
label0:
		{
			l4 = 1000L * l;
	//    0    0:ldc2w           #136 <Long 1000L>
	//    1    3:lload_1         
	//    2    4:lmul            
	//    3    5:lstore          9
			if(haveSync)
	//*   4    7:aload_0         
	//*   5    8:getfield        #139 <Field boolean haveSync>
	//*   6   11:ifeq            125
			{
				if(l != lastFramePresentationTimeUs)
	//*   7   14:lload_1         
	//*   8   15:aload_0         
	//*   9   16:getfield        #141 <Field long lastFramePresentationTimeUs>
	//*  10   19:lcmp            
	//*  11   20:ifeq            41
				{
					frameCount = frameCount + 1L;
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #143 <Field long frameCount>
	//   15   28:lconst_1        
	//   16   29:ladd            
	//   17   30:putfield        #143 <Field long frameCount>
					adjustedLastFrameTimeNs = pendingAdjustedFrameTimeNs;
	//   18   33:aload_0         
	//   19   34:aload_0         
	//   20   35:getfield        #145 <Field long pendingAdjustedFrameTimeNs>
	//   21   38:putfield        #147 <Field long adjustedLastFrameTimeNs>
				}
				if(frameCount >= 6L)
	//*  22   41:aload_0         
	//*  23   42:getfield        #143 <Field long frameCount>
	//*  24   45:ldc2w           #148 <Long 6L>
	//*  25   48:lcmp            
	//*  26   49:iflt            110
				{
					l2 = (l4 - syncFramePresentationTimeNs) / frameCount;
	//   27   52:lload           9
	//   28   54:aload_0         
	//   29   55:getfield        #102 <Field long syncFramePresentationTimeNs>
	//   30   58:lsub            
	//   31   59:aload_0         
	//   32   60:getfield        #143 <Field long frameCount>
	//   33   63:ldiv            
	//   34   64:lstore          5
					l3 = adjustedLastFrameTimeNs + l2;
	//   35   66:aload_0         
	//   36   67:getfield        #147 <Field long adjustedLastFrameTimeNs>
	//   37   70:lload           5
	//   38   72:ladd            
	//   39   73:lstore          7
					if(isDriftTooLarge(l3, l1))
	//*  40   75:aload_0         
	//*  41   76:lload           7
	//*  42   78:lload_3         
	//*  43   79:invokespecial   #151 <Method boolean isDriftTooLarge(long, long)>
	//*  44   82:ifeq            93
					{
						haveSync = false;
	//   45   85:aload_0         
	//   46   86:iconst_0        
	//   47   87:putfield        #139 <Field boolean haveSync>
					} else
	//*  48   90:goto            125
					{
						l2 = (syncUnadjustedReleaseTimeNs + l3) - syncFramePresentationTimeNs;
	//   49   93:aload_0         
	//   50   94:getfield        #104 <Field long syncUnadjustedReleaseTimeNs>
	//   51   97:lload           7
	//   52   99:ladd            
	//   53  100:aload_0         
	//   54  101:getfield        #102 <Field long syncFramePresentationTimeNs>
	//   55  104:lsub            
	//   56  105:lstore          5
						break label0;
	//   57  107:goto            132
					}
				} else
				if(isDriftTooLarge(l4, l1))
	//*  58  110:aload_0         
	//*  59  111:lload           9
	//*  60  113:lload_3         
	//*  61  114:invokespecial   #151 <Method boolean isDriftTooLarge(long, long)>
	//*  62  117:ifeq            125
					haveSync = false;
	//   63  120:aload_0         
	//   64  121:iconst_0        
	//   65  122:putfield        #139 <Field boolean haveSync>
			}
			l2 = l1;
	//   66  125:lload_3         
	//   67  126:lstore          5
			l3 = l4;
	//   68  128:lload           9
	//   69  130:lstore          7
		}
		if(!haveSync)
	//*  70  132:aload_0         
	//*  71  133:getfield        #139 <Field boolean haveSync>
	//*  72  136:ifne            160
		{
			syncFramePresentationTimeNs = l4;
	//   73  139:aload_0         
	//   74  140:lload           9
	//   75  142:putfield        #102 <Field long syncFramePresentationTimeNs>
			syncUnadjustedReleaseTimeNs = l1;
	//   76  145:aload_0         
	//   77  146:lload_3         
	//   78  147:putfield        #104 <Field long syncUnadjustedReleaseTimeNs>
			frameCount = 0L;
	//   79  150:aload_0         
	//   80  151:lconst_0        
	//   81  152:putfield        #143 <Field long frameCount>
			haveSync = true;
	//   82  155:aload_0         
	//   83  156:iconst_1        
	//   84  157:putfield        #139 <Field boolean haveSync>
		}
		lastFramePresentationTimeUs = l;
	//   85  160:aload_0         
	//   86  161:lload_1         
	//   87  162:putfield        #141 <Field long lastFramePresentationTimeUs>
		pendingAdjustedFrameTimeNs = l3;
	//   88  165:aload_0         
	//   89  166:lload           7
	//   90  168:putfield        #145 <Field long pendingAdjustedFrameTimeNs>
		if(vsyncSampler != null)
	//*  91  171:aload_0         
	//*  92  172:getfield        #84  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
	//*  93  175:ifnull          227
		{
			if(vsyncDurationNs == 0x1L)
	//*  94  178:aload_0         
	//*  95  179:getfield        #88  <Field long vsyncDurationNs>
	//*  96  182:ldc2w           #85  <Long 0x1L>
	//*  97  185:lcmp            
	//*  98  186:ifne            192
				return l2;
	//   99  189:lload           5
	//  100  191:lreturn         
			l = vsyncSampler.sampledVsyncTimeNs;
	//  101  192:aload_0         
	//  102  193:getfield        #84  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
	//  103  196:getfield        #154 <Field long VideoFrameReleaseTimeHelper$VSyncSampler.sampledVsyncTimeNs>
	//  104  199:lstore_1        
			if(l == 0x1L)
	//* 105  200:lload_1         
	//* 106  201:ldc2w           #85  <Long 0x1L>
	//* 107  204:lcmp            
	//* 108  205:ifne            211
				return l2;
	//  109  208:lload           5
	//  110  210:lreturn         
			else
				return closestVsync(l2, l, vsyncDurationNs) - vsyncOffsetNs;
	//  111  211:lload           5
	//  112  213:lload_1         
	//  113  214:aload_0         
	//  114  215:getfield        #88  <Field long vsyncDurationNs>
	//  115  218:invokestatic    #156 <Method long closestVsync(long, long, long)>
	//  116  221:aload_0         
	//  117  222:getfield        #90  <Field long vsyncOffsetNs>
	//  118  225:lsub            
	//  119  226:lreturn         
		} else
		{
			return l2;
	//  120  227:lload           5
	//  121  229:lreturn         
		}
	}

	public void disable()
	{
		if(windowManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field WindowManager windowManager>
	//*   2    4:ifnull          28
		{
			if(displayListener != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #78  <Field VideoFrameReleaseTimeHelper$DefaultDisplayListener displayListener>
	//*   5   11:ifnull          21
				displayListener.unregister();
	//    6   14:aload_0         
	//    7   15:getfield        #78  <Field VideoFrameReleaseTimeHelper$DefaultDisplayListener displayListener>
	//    8   18:invokevirtual   #160 <Method void VideoFrameReleaseTimeHelper$DefaultDisplayListener.unregister()>
			vsyncSampler.removeObserver();
	//    9   21:aload_0         
	//   10   22:getfield        #84  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
	//   11   25:invokevirtual   #163 <Method void VideoFrameReleaseTimeHelper$VSyncSampler.removeObserver()>
		}
	//   12   28:return          
	}

	public void enable()
	{
		haveSync = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #139 <Field boolean haveSync>
		if(windowManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #67  <Field WindowManager windowManager>
	//*   5    9:ifnull          37
		{
			vsyncSampler.addObserver();
	//    6   12:aload_0         
	//    7   13:getfield        #84  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
	//    8   16:invokevirtual   #167 <Method void VideoFrameReleaseTimeHelper$VSyncSampler.addObserver()>
			if(displayListener != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #78  <Field VideoFrameReleaseTimeHelper$DefaultDisplayListener displayListener>
	//*  11   23:ifnull          33
				displayListener.register();
	//   12   26:aload_0         
	//   13   27:getfield        #78  <Field VideoFrameReleaseTimeHelper$DefaultDisplayListener displayListener>
	//   14   30:invokevirtual   #170 <Method void VideoFrameReleaseTimeHelper$DefaultDisplayListener.register()>
			updateDefaultDisplayRefreshRateParams();
	//   15   33:aload_0         
	//   16   34:invokespecial   #96  <Method void updateDefaultDisplayRefreshRateParams()>
		}
	//   17   37:return          
	}

	private static final long CHOREOGRAPHER_SAMPLE_DELAY_MILLIS = 500L;
	private static final long MAX_ALLOWED_DRIFT_NS = 0x1312d00L;
	private static final int MIN_FRAMES_FOR_ADJUSTMENT = 6;
	private static final long VSYNC_OFFSET_PERCENTAGE = 80L;
	private long adjustedLastFrameTimeNs;
	private final DefaultDisplayListener displayListener;
	private long frameCount;
	private boolean haveSync;
	private long lastFramePresentationTimeUs;
	private long pendingAdjustedFrameTimeNs;
	private long syncFramePresentationTimeNs;
	private long syncUnadjustedReleaseTimeNs;
	private long vsyncDurationNs;
	private long vsyncOffsetNs;
	private final VSyncSampler vsyncSampler;
	private final WindowManager windowManager;


/*
	static void access$000(VideoFrameReleaseTimeHelper videoframereleasetimehelper)
	{
		videoframereleasetimehelper.updateDefaultDisplayRefreshRateParams();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void updateDefaultDisplayRefreshRateParams()>
		return;
	//    2    4:return          
	}

*/
}
