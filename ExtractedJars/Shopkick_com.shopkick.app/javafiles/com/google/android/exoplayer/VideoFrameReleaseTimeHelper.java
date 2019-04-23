// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.content.Context;
import android.os.*;
import android.view.*;

public final class VideoFrameReleaseTimeHelper
{
	private static final class VSyncSampler
		implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback
	{

		private void addObserverInternal()
		{
			observerCount = observerCount + 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #68  <Field int observerCount>
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:putfield        #68  <Field int observerCount>
			if(observerCount == 1)
		//*   6   10:aload_0         
		//*   7   11:getfield        #68  <Field int observerCount>
		//*   8   14:iconst_1        
		//*   9   15:icmpne          26
				choreographer.postFrameCallback(((android.view.Choreographer.FrameCallback) (this)));
		//   10   18:aload_0         
		//   11   19:getfield        #70  <Field Choreographer choreographer>
		//   12   22:aload_0         
		//   13   23:invokevirtual   #76  <Method void Choreographer.postFrameCallback(android.view.Choreographer$FrameCallback)>
		//   14   26:return          
		}

		private void createChoreographerInstanceInternal()
		{
			choreographer = Choreographer.getInstance();
		//    0    0:aload_0         
		//    1    1:invokestatic    #81  <Method Choreographer Choreographer.getInstance()>
		//    2    4:putfield        #70  <Field Choreographer choreographer>
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
		//    2    2:getfield        #68  <Field int observerCount>
		//    3    5:iconst_1        
		//    4    6:isub            
		//    5    7:putfield        #68  <Field int observerCount>
			if(observerCount == 0)
		//*   6   10:aload_0         
		//*   7   11:getfield        #68  <Field int observerCount>
		//*   8   14:ifne            30
			{
				choreographer.removeFrameCallback(((android.view.Choreographer.FrameCallback) (this)));
		//    9   17:aload_0         
		//   10   18:getfield        #70  <Field Choreographer choreographer>
		//   11   21:aload_0         
		//   12   22:invokevirtual   #86  <Method void Choreographer.removeFrameCallback(android.view.Choreographer$FrameCallback)>
				sampledVsyncTimeNs = 0L;
		//   13   25:aload_0         
		//   14   26:lconst_0        
		//   15   27:putfield        #88  <Field long sampledVsyncTimeNs>
			}
		//   16   30:return          
		}

		public void addObserver()
		{
			handler.sendEmptyMessage(1);
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field Handler handler>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #65  <Method boolean Handler.sendEmptyMessage(int)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void doFrame(long l)
		{
			sampledVsyncTimeNs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #88  <Field long sampledVsyncTimeNs>
			choreographer.postFrameCallbackDelayed(((android.view.Choreographer.FrameCallback) (this)), 500L);
		//    3    5:aload_0         
		//    4    6:getfield        #70  <Field Choreographer choreographer>
		//    5    9:aload_0         
		//    6   10:ldc2w           #92  <Long 500L>
		//    7   13:invokevirtual   #97  <Method void Choreographer.postFrameCallbackDelayed(android.view.Choreographer$FrameCallback, long)>
		//    8   16:return          
		}

		public boolean handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #104 <Field int Message.what>
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
		//    6   35:invokespecial   #106 <Method void removeObserverInternal()>
				return true;
		//    7   38:iconst_1        
		//    8   39:ireturn         

			case 1: // '\001'
				addObserverInternal();
		//    9   40:aload_0         
		//   10   41:invokespecial   #108 <Method void addObserverInternal()>
				return true;
		//   11   44:iconst_1        
		//   12   45:ireturn         

			case 0: // '\0'
				createChoreographerInstanceInternal();
		//   13   46:aload_0         
		//   14   47:invokespecial   #110 <Method void createChoreographerInstanceInternal()>
				return true;
		//   15   50:iconst_1        
		//   16   51:ireturn         
			}
		}

		public void removeObserver()
		{
			handler.sendEmptyMessage(2);
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field Handler handler>
		//    2    4:iconst_2        
		//    3    5:invokevirtual   #65  <Method boolean Handler.sendEmptyMessage(int)>
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
		//    2    4:aload_0         
		//    3    5:new             #40  <Class HandlerThread>
		//    4    8:dup             
		//    5    9:ldc1            #42  <String "ChoreographerOwner:Handler">
		//    6   11:invokespecial   #45  <Method void HandlerThread(String)>
		//    7   14:putfield        #47  <Field HandlerThread choreographerOwnerThread>
			choreographerOwnerThread.start();
		//    8   17:aload_0         
		//    9   18:getfield        #47  <Field HandlerThread choreographerOwnerThread>
		//   10   21:invokevirtual   #50  <Method void HandlerThread.start()>
			handler = new Handler(choreographerOwnerThread.getLooper(), ((android.os.Handler.Callback) (this)));
		//   11   24:aload_0         
		//   12   25:new             #52  <Class Handler>
		//   13   28:dup             
		//   14   29:aload_0         
		//   15   30:getfield        #47  <Field HandlerThread choreographerOwnerThread>
		//   16   33:invokevirtual   #56  <Method android.os.Looper HandlerThread.getLooper()>
		//   17   36:aload_0         
		//   18   37:invokespecial   #59  <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
		//   19   40:putfield        #61  <Field Handler handler>
			handler.sendEmptyMessage(0);
		//   20   43:aload_0         
		//   21   44:getfield        #61  <Field Handler handler>
		//   22   47:iconst_0        
		//   23   48:invokevirtual   #65  <Method boolean Handler.sendEmptyMessage(int)>
		//   24   51:pop             
		//   25   52:return          
		}
	}


	public VideoFrameReleaseTimeHelper()
	{
		this(-1F, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <Float -1F>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #42  <Method void VideoFrameReleaseTimeHelper(float, boolean)>
	//    4    7:return          
	}

	private VideoFrameReleaseTimeHelper(float f, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		useDefaultDisplayVsync = flag;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #47  <Field boolean useDefaultDisplayVsync>
		if(flag)
	//*   5    9:iload_2         
	//*   6   10:ifeq            48
		{
			vsyncSampler = VSyncSampler.getInstance();
	//    7   13:aload_0         
	//    8   14:invokestatic    #51  <Method VideoFrameReleaseTimeHelper$VSyncSampler VideoFrameReleaseTimeHelper$VSyncSampler.getInstance()>
	//    9   17:putfield        #53  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
			vsyncDurationNs = (long)(1000000000D / (double)f);
	//   10   20:aload_0         
	//   11   21:ldc2w           #54  <Double 1000000000D>
	//   12   24:fload_1         
	//   13   25:f2d             
	//   14   26:ddiv            
	//   15   27:d2l             
	//   16   28:putfield        #57  <Field long vsyncDurationNs>
			vsyncOffsetNs = (vsyncDurationNs * 80L) / 100L;
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #57  <Field long vsyncDurationNs>
	//   20   36:ldc2w           #22  <Long 80L>
	//   21   39:lmul            
	//   22   40:ldc2w           #58  <Long 100L>
	//   23   43:ldiv            
	//   24   44:putfield        #61  <Field long vsyncOffsetNs>
			return;
	//   25   47:return          
		} else
		{
			vsyncSampler = null;
	//   26   48:aload_0         
	//   27   49:aconst_null     
	//   28   50:putfield        #53  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
			vsyncDurationNs = -1L;
	//   29   53:aload_0         
	//   30   54:ldc2w           #62  <Long -1L>
	//   31   57:putfield        #57  <Field long vsyncDurationNs>
			vsyncOffsetNs = -1L;
	//   32   60:aload_0         
	//   33   61:ldc2w           #62  <Long -1L>
	//   34   64:putfield        #61  <Field long vsyncOffsetNs>
			return;
	//   35   67:return          
		}
	}

	public VideoFrameReleaseTimeHelper(Context context)
	{
		this(getDefaultDisplayRefreshRate(context), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #68  <Method float getDefaultDisplayRefreshRate(Context)>
	//    3    5:iconst_1        
	//    4    6:invokespecial   #42  <Method void VideoFrameReleaseTimeHelper(float, boolean)>
	//    5    9:return          
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
		if(l <= l1)
	//*  10   12:lload_0         
	//*  11   13:lload_2         
	//*  12   14:lcmp            
	//*  13   15:ifgt            27
		{
			l2 = l1 - l2;
	//   14   18:lload_2         
	//   15   19:lload           4
	//   16   21:lsub            
	//   17   22:lstore          4
		} else
	//*  18   24:goto            39
		{
			long l3 = l2 + l1;
	//   19   27:lload           4
	//   20   29:lload_2         
	//   21   30:ladd            
	//   22   31:lstore          6
			l2 = l1;
	//   23   33:lload_2         
	//   24   34:lstore          4
			l1 = l3;
	//   25   36:lload           6
	//   26   38:lstore_2        
		}
		if(l1 - l < l - l2)
	//*  27   39:lload_2         
	//*  28   40:lload_0         
	//*  29   41:lsub            
	//*  30   42:lload_0         
	//*  31   43:lload           4
	//*  32   45:lsub            
	//*  33   46:lcmp            
	//*  34   47:ifge            52
			return l1;
	//   35   50:lload_2         
	//   36   51:lreturn         
		else
			return l2;
	//   37   52:lload           4
	//   38   54:lreturn         
	}

	private static float getDefaultDisplayRefreshRate(Context context)
	{
		return ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
	//    0    0:aload_0         
	//    1    1:ldc1            #72  <String "window">
	//    2    3:invokevirtual   #78  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #80  <Class WindowManager>
	//    4    9:invokeinterface #84  <Method Display WindowManager.getDefaultDisplay()>
	//    5   14:invokevirtual   #90  <Method float Display.getRefreshRate()>
	//    6   17:freturn         
	}

	private boolean isDriftTooLarge(long l, long l1)
	{
		long l2 = syncFramePresentationTimeNs;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field long syncFramePresentationTimeNs>
	//    2    4:lstore          5
		return Math.abs(l1 - syncUnadjustedReleaseTimeNs - (l - l2)) > 0x1312d00L;
	//    3    6:lload_3         
	//    4    7:aload_0         
	//    5    8:getfield        #96  <Field long syncUnadjustedReleaseTimeNs>
	//    6   11:lsub            
	//    7   12:lload_1         
	//    8   13:lload           5
	//    9   15:lsub            
	//   10   16:lsub            
	//   11   17:invokestatic    #102 <Method long Math.abs(long)>
	//   12   20:ldc2w           #16  <Long 0x1312d00L>
	//   13   23:lcmp            
	//   14   24:ifle            29
	//   15   27:iconst_1        
	//   16   28:ireturn         
	//   17   29:iconst_0        
	//   18   30:ireturn         
	}

	public long adjustReleaseTime(long l, long l1)
	{
		long l2;
		long l3;
		long l4;
label0:
		{
			l4 = 1000L * l;
	//    0    0:ldc2w           #105 <Long 1000L>
	//    1    3:lload_1         
	//    2    4:lmul            
	//    3    5:lstore          9
			if(haveSync)
	//*   4    7:aload_0         
	//*   5    8:getfield        #108 <Field boolean haveSync>
	//*   6   11:ifeq            134
			{
				if(l != lastFramePresentationTimeUs)
	//*   7   14:lload_1         
	//*   8   15:aload_0         
	//*   9   16:getfield        #110 <Field long lastFramePresentationTimeUs>
	//*  10   19:lcmp            
	//*  11   20:ifeq            41
				{
					frameCount = frameCount + 1L;
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #112 <Field long frameCount>
	//   15   28:lconst_1        
	//   16   29:ladd            
	//   17   30:putfield        #112 <Field long frameCount>
					adjustedLastFrameTimeNs = pendingAdjustedFrameTimeNs;
	//   18   33:aload_0         
	//   19   34:aload_0         
	//   20   35:getfield        #114 <Field long pendingAdjustedFrameTimeNs>
	//   21   38:putfield        #116 <Field long adjustedLastFrameTimeNs>
				}
				l2 = frameCount;
	//   22   41:aload_0         
	//   23   42:getfield        #112 <Field long frameCount>
	//   24   45:lstore          5
				if(l2 >= 6L)
	//*  25   47:lload           5
	//*  26   49:ldc2w           #117 <Long 6L>
	//*  27   52:lcmp            
	//*  28   53:iflt            119
				{
					l2 = (l4 - syncFramePresentationTimeNs) / l2;
	//   29   56:lload           9
	//   30   58:aload_0         
	//   31   59:getfield        #94  <Field long syncFramePresentationTimeNs>
	//   32   62:lsub            
	//   33   63:lload           5
	//   34   65:ldiv            
	//   35   66:lstore          5
					l2 = adjustedLastFrameTimeNs + l2;
	//   36   68:aload_0         
	//   37   69:getfield        #116 <Field long adjustedLastFrameTimeNs>
	//   38   72:lload           5
	//   39   74:ladd            
	//   40   75:lstore          5
					if(isDriftTooLarge(l2, l1))
	//*  41   77:aload_0         
	//*  42   78:lload           5
	//*  43   80:lload_3         
	//*  44   81:invokespecial   #120 <Method boolean isDriftTooLarge(long, long)>
	//*  45   84:ifeq            102
					{
						haveSync = false;
	//   46   87:aload_0         
	//   47   88:iconst_0        
	//   48   89:putfield        #108 <Field boolean haveSync>
						l3 = l1;
	//   49   92:lload_3         
	//   50   93:lstore          7
						l2 = l4;
	//   51   95:lload           9
	//   52   97:lstore          5
					} else
	//*  53   99:goto            141
					{
						l3 = (syncUnadjustedReleaseTimeNs + l2) - syncFramePresentationTimeNs;
	//   54  102:aload_0         
	//   55  103:getfield        #96  <Field long syncUnadjustedReleaseTimeNs>
	//   56  106:lload           5
	//   57  108:ladd            
	//   58  109:aload_0         
	//   59  110:getfield        #94  <Field long syncFramePresentationTimeNs>
	//   60  113:lsub            
	//   61  114:lstore          7
					}
					break label0;
	//   62  116:goto            141
				}
				if(isDriftTooLarge(l4, l1))
	//*  63  119:aload_0         
	//*  64  120:lload           9
	//*  65  122:lload_3         
	//*  66  123:invokespecial   #120 <Method boolean isDriftTooLarge(long, long)>
	//*  67  126:ifeq            134
					haveSync = false;
	//   68  129:aload_0         
	//   69  130:iconst_0        
	//   70  131:putfield        #108 <Field boolean haveSync>
			}
			l3 = l1;
	//   71  134:lload_3         
	//   72  135:lstore          7
			l2 = l4;
	//   73  137:lload           9
	//   74  139:lstore          5
		}
		if(!haveSync)
	//*  75  141:aload_0         
	//*  76  142:getfield        #108 <Field boolean haveSync>
	//*  77  145:ifne            173
		{
			syncFramePresentationTimeNs = l4;
	//   78  148:aload_0         
	//   79  149:lload           9
	//   80  151:putfield        #94  <Field long syncFramePresentationTimeNs>
			syncUnadjustedReleaseTimeNs = l1;
	//   81  154:aload_0         
	//   82  155:lload_3         
	//   83  156:putfield        #96  <Field long syncUnadjustedReleaseTimeNs>
			frameCount = 0L;
	//   84  159:aload_0         
	//   85  160:lconst_0        
	//   86  161:putfield        #112 <Field long frameCount>
			haveSync = true;
	//   87  164:aload_0         
	//   88  165:iconst_1        
	//   89  166:putfield        #108 <Field boolean haveSync>
			onSynced();
	//   90  169:aload_0         
	//   91  170:invokevirtual   #123 <Method void onSynced()>
		}
		lastFramePresentationTimeUs = l;
	//   92  173:aload_0         
	//   93  174:lload_1         
	//   94  175:putfield        #110 <Field long lastFramePresentationTimeUs>
		pendingAdjustedFrameTimeNs = l2;
	//   95  178:aload_0         
	//   96  179:lload           5
	//   97  181:putfield        #114 <Field long pendingAdjustedFrameTimeNs>
		VSyncSampler vsyncsampler = vsyncSampler;
	//   98  184:aload_0         
	//   99  185:getfield        #53  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
	//  100  188:astore          11
		if(vsyncsampler != null)
	//* 101  190:aload           11
	//* 102  192:ifnull          230
		{
			if(vsyncsampler.sampledVsyncTimeNs == 0L)
	//* 103  195:aload           11
	//* 104  197:getfield        #126 <Field long VideoFrameReleaseTimeHelper$VSyncSampler.sampledVsyncTimeNs>
	//* 105  200:lconst_0        
	//* 106  201:lcmp            
	//* 107  202:ifne            208
				return l3;
	//  108  205:lload           7
	//  109  207:lreturn         
			else
				return closestVsync(l3, vsyncSampler.sampledVsyncTimeNs, vsyncDurationNs) - vsyncOffsetNs;
	//  110  208:lload           7
	//  111  210:aload_0         
	//  112  211:getfield        #53  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
	//  113  214:getfield        #126 <Field long VideoFrameReleaseTimeHelper$VSyncSampler.sampledVsyncTimeNs>
	//  114  217:aload_0         
	//  115  218:getfield        #57  <Field long vsyncDurationNs>
	//  116  221:invokestatic    #128 <Method long closestVsync(long, long, long)>
	//  117  224:aload_0         
	//  118  225:getfield        #61  <Field long vsyncOffsetNs>
	//  119  228:lsub            
	//  120  229:lreturn         
		} else
		{
			return l3;
	//  121  230:lload           7
	//  122  232:lreturn         
		}
	}

	public void disable()
	{
		if(useDefaultDisplayVsync)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean useDefaultDisplayVsync>
	//*   2    4:ifeq            14
			vsyncSampler.removeObserver();
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
	//    5   11:invokevirtual   #132 <Method void VideoFrameReleaseTimeHelper$VSyncSampler.removeObserver()>
	//    6   14:return          
	}

	public void enable()
	{
		haveSync = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #108 <Field boolean haveSync>
		if(useDefaultDisplayVsync)
	//*   3    5:aload_0         
	//*   4    6:getfield        #47  <Field boolean useDefaultDisplayVsync>
	//*   5    9:ifeq            19
			vsyncSampler.addObserver();
	//    6   12:aload_0         
	//    7   13:getfield        #53  <Field VideoFrameReleaseTimeHelper$VSyncSampler vsyncSampler>
	//    8   16:invokevirtual   #136 <Method void VideoFrameReleaseTimeHelper$VSyncSampler.addObserver()>
	//    9   19:return          
	}

	protected void onSynced()
	{
	//    0    0:return          
	}

	private static final long CHOREOGRAPHER_SAMPLE_DELAY_MILLIS = 500L;
	private static final long MAX_ALLOWED_DRIFT_NS = 0x1312d00L;
	private static final int MIN_FRAMES_FOR_ADJUSTMENT = 6;
	private static final long VSYNC_OFFSET_PERCENTAGE = 80L;
	private long adjustedLastFrameTimeNs;
	private long frameCount;
	private boolean haveSync;
	private long lastFramePresentationTimeUs;
	private long pendingAdjustedFrameTimeNs;
	private long syncFramePresentationTimeNs;
	private long syncUnadjustedReleaseTimeNs;
	private final boolean useDefaultDisplayVsync;
	private final long vsyncDurationNs;
	private final long vsyncOffsetNs;
	private final VSyncSampler vsyncSampler;
}
