// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class FrameMetricsAggregator
{
	private static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl
	{

		public void add(Activity activity)
		{
			if(sHandlerThread == null)
		//*   0    0:getstatic       #62  <Field HandlerThread sHandlerThread>
		//*   1    3:ifnonnull       40
			{
				sHandlerThread = new HandlerThread("FrameMetricsAggregator");
		//    2    6:new             #64  <Class HandlerThread>
		//    3    9:dup             
		//    4   10:ldc1            #66  <String "FrameMetricsAggregator">
		//    5   12:invokespecial   #69  <Method void HandlerThread(String)>
		//    6   15:putstatic       #62  <Field HandlerThread sHandlerThread>
				sHandlerThread.start();
		//    7   18:getstatic       #62  <Field HandlerThread sHandlerThread>
		//    8   21:invokevirtual   #72  <Method void HandlerThread.start()>
				sHandler = new Handler(sHandlerThread.getLooper());
		//    9   24:new             #74  <Class Handler>
		//   10   27:dup             
		//   11   28:getstatic       #62  <Field HandlerThread sHandlerThread>
		//   12   31:invokevirtual   #78  <Method android.os.Looper HandlerThread.getLooper()>
		//   13   34:invokespecial   #81  <Method void Handler(android.os.Looper)>
		//   14   37:putstatic       #83  <Field Handler sHandler>
			}
			for(int i = 0; i <= 8; i++)
		//*  15   40:iconst_0        
		//*  16   41:istore_2        
		//*  17   42:iload_2         
		//*  18   43:bipush          8
		//*  19   45:icmpgt          88
				if(mMetrics[i] == null && (mTrackingFlags & 1 << i) != 0)
		//*  20   48:aload_0         
		//*  21   49:getfield        #41  <Field SparseIntArray[] mMetrics>
		//*  22   52:iload_2         
		//*  23   53:aaload          
		//*  24   54:ifnonnull       81
		//*  25   57:aload_0         
		//*  26   58:getfield        #54  <Field int mTrackingFlags>
		//*  27   61:iconst_1        
		//*  28   62:iload_2         
		//*  29   63:ishl            
		//*  30   64:iand            
		//*  31   65:ifeq            81
					mMetrics[i] = new SparseIntArray();
		//   32   68:aload_0         
		//   33   69:getfield        #41  <Field SparseIntArray[] mMetrics>
		//   34   72:iload_2         
		//   35   73:new             #39  <Class SparseIntArray>
		//   36   76:dup             
		//   37   77:invokespecial   #84  <Method void SparseIntArray()>
		//   38   80:aastore         

		//   39   81:iload_2         
		//   40   82:iconst_1        
		//   41   83:iadd            
		//   42   84:istore_2        
		//*  43   85:goto            42
			activity.getWindow().addOnFrameMetricsAvailableListener(mListener, sHandler);
		//   44   88:aload_1         
		//   45   89:invokevirtual   #90  <Method Window Activity.getWindow()>
		//   46   92:aload_0         
		//   47   93:getfield        #52  <Field android.view.Window$OnFrameMetricsAvailableListener mListener>
		//   48   96:getstatic       #83  <Field Handler sHandler>
		//   49   99:invokevirtual   #96  <Method void Window.addOnFrameMetricsAvailableListener(android.view.Window$OnFrameMetricsAvailableListener, Handler)>
			mActivities.add(((Object) (new WeakReference(((Object) (activity))))));
		//   50  102:aload_0         
		//   51  103:getfield        #47  <Field ArrayList mActivities>
		//   52  106:new             #98  <Class WeakReference>
		//   53  109:dup             
		//   54  110:aload_1         
		//   55  111:invokespecial   #101 <Method void WeakReference(Object)>
		//   56  114:invokevirtual   #104 <Method boolean ArrayList.add(Object)>
		//   57  117:pop             
		//   58  118:return          
		}

		void addDurationItem(SparseIntArray sparseintarray, long l)
		{
			if(sparseintarray != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          36
			{
				int i = (int)((l + 0x7a120L) / 0xf4240L);
		//    2    4:lload_2         
		//    3    5:ldc2w           #107 <Long 0x7a120L>
		//    4    8:ladd            
		//    5    9:ldc2w           #109 <Long 0xf4240L>
		//    6   12:ldiv            
		//    7   13:l2i             
		//    8   14:istore          4
				if(l >= 0L)
		//*   9   16:lload_2         
		//*  10   17:lconst_0        
		//*  11   18:lcmp            
		//*  12   19:iflt            36
					sparseintarray.put(i, sparseintarray.get(i) + 1);
		//   13   22:aload_1         
		//   14   23:iload           4
		//   15   25:aload_1         
		//   16   26:iload           4
		//   17   28:invokevirtual   #114 <Method int SparseIntArray.get(int)>
		//   18   31:iconst_1        
		//   19   32:iadd            
		//   20   33:invokevirtual   #118 <Method void SparseIntArray.put(int, int)>
			}
		//   21   36:return          
		}

		public SparseIntArray[] getMetrics()
		{
			return mMetrics;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field SparseIntArray[] mMetrics>
		//    2    4:areturn         
		}

		public SparseIntArray[] remove(Activity activity)
		{
			Iterator iterator = mActivities.iterator();
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field ArrayList mActivities>
		//    2    4:invokevirtual   #126 <Method Iterator ArrayList.iterator()>
		//    3    7:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
		//    4    8:aload_2         
		//    5    9:invokeinterface #132 <Method boolean Iterator.hasNext()>
		//    6   14:ifeq            44
				WeakReference weakreference = (WeakReference)iterator.next();
		//    7   17:aload_2         
		//    8   18:invokeinterface #136 <Method Object Iterator.next()>
		//    9   23:checkcast       #98  <Class WeakReference>
		//   10   26:astore_3        
				if(weakreference.get() != activity)
					continue;
		//   11   27:aload_3         
		//   12   28:invokevirtual   #138 <Method Object WeakReference.get()>
		//   13   31:aload_1         
		//   14   32:if_acmpne       8
				mActivities.remove(((Object) (weakreference)));
		//   15   35:aload_0         
		//   16   36:getfield        #47  <Field ArrayList mActivities>
		//   17   39:aload_3         
		//   18   40:invokevirtual   #140 <Method boolean ArrayList.remove(Object)>
		//   19   43:pop             
				break;
			} while(true);
			activity.getWindow().removeOnFrameMetricsAvailableListener(mListener);
		//   20   44:aload_1         
		//   21   45:invokevirtual   #90  <Method Window Activity.getWindow()>
		//   22   48:aload_0         
		//   23   49:getfield        #52  <Field android.view.Window$OnFrameMetricsAvailableListener mListener>
		//   24   52:invokevirtual   #144 <Method void Window.removeOnFrameMetricsAvailableListener(android.view.Window$OnFrameMetricsAvailableListener)>
			return mMetrics;
		//   25   55:aload_0         
		//   26   56:getfield        #41  <Field SparseIntArray[] mMetrics>
		//   27   59:areturn         
		}

		public SparseIntArray[] reset()
		{
			SparseIntArray asparseintarray[] = mMetrics;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field SparseIntArray[] mMetrics>
		//    2    4:astore_1        
			mMetrics = new SparseIntArray[9];
		//    3    5:aload_0         
		//    4    6:bipush          9
		//    5    8:anewarray       SparseIntArray[]
		//    6   11:putfield        #41  <Field SparseIntArray[] mMetrics>
			return asparseintarray;
		//    7   14:aload_1         
		//    8   15:areturn         
		}

		public SparseIntArray[] stop()
		{
			for(int i = mActivities.size() - 1; i >= 0; i--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field ArrayList mActivities>
		//*   2    4:invokevirtual   #150 <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iflt            68
			{
				WeakReference weakreference = (WeakReference)mActivities.get(i);
		//    8   14:aload_0         
		//    9   15:getfield        #47  <Field ArrayList mActivities>
		//   10   18:iload_1         
		//   11   19:invokevirtual   #153 <Method Object ArrayList.get(int)>
		//   12   22:checkcast       #98  <Class WeakReference>
		//   13   25:astore_2        
				Activity activity = (Activity)weakreference.get();
		//   14   26:aload_2         
		//   15   27:invokevirtual   #138 <Method Object WeakReference.get()>
		//   16   30:checkcast       #86  <Class Activity>
		//   17   33:astore_3        
				if(weakreference.get() != null)
		//*  18   34:aload_2         
		//*  19   35:invokevirtual   #138 <Method Object WeakReference.get()>
		//*  20   38:ifnull          61
				{
					activity.getWindow().removeOnFrameMetricsAvailableListener(mListener);
		//   21   41:aload_3         
		//   22   42:invokevirtual   #90  <Method Window Activity.getWindow()>
		//   23   45:aload_0         
		//   24   46:getfield        #52  <Field android.view.Window$OnFrameMetricsAvailableListener mListener>
		//   25   49:invokevirtual   #144 <Method void Window.removeOnFrameMetricsAvailableListener(android.view.Window$OnFrameMetricsAvailableListener)>
					mActivities.remove(i);
		//   26   52:aload_0         
		//   27   53:getfield        #47  <Field ArrayList mActivities>
		//   28   56:iload_1         
		//   29   57:invokevirtual   #155 <Method Object ArrayList.remove(int)>
		//   30   60:pop             
				}
			}

		//   31   61:iload_1         
		//   32   62:iconst_1        
		//   33   63:isub            
		//   34   64:istore_1        
		//*  35   65:goto            10
			return mMetrics;
		//   36   68:aload_0         
		//   37   69:getfield        #41  <Field SparseIntArray[] mMetrics>
		//   38   72:areturn         
		}

		private static final int NANOS_PER_MS = 0xf4240;
		private static final int NANOS_ROUNDING_VALUE = 0x7a120;
		private static Handler sHandler;
		private static HandlerThread sHandlerThread;
		private ArrayList mActivities;
		android.view.Window.OnFrameMetricsAvailableListener mListener;
		private SparseIntArray mMetrics[];
		private int mTrackingFlags;

		static 
		{
		//    0    0:return          
		}


/*
		static int access$100(FrameMetricsApi24Impl framemetricsapi24impl)
		{
			return framemetricsapi24impl.mTrackingFlags;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field int mTrackingFlags>
		//    2    4:ireturn         
		}

*/


/*
		static SparseIntArray[] access$200(FrameMetricsApi24Impl framemetricsapi24impl)
		{
			return framemetricsapi24impl.mMetrics;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field SparseIntArray[] mMetrics>
		//    2    4:areturn         
		}

*/

		FrameMetricsApi24Impl(int i)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #37  <Method void FrameMetricsAggregator$FrameMetricsBaseImpl(FrameMetricsAggregator$1)>
			mMetrics = new SparseIntArray[9];
		//    3    5:aload_0         
		//    4    6:bipush          9
		//    5    8:anewarray       SparseIntArray[]
		//    6   11:putfield        #41  <Field SparseIntArray[] mMetrics>
			mActivities = new ArrayList();
		//    7   14:aload_0         
		//    8   15:new             #43  <Class ArrayList>
		//    9   18:dup             
		//   10   19:invokespecial   #45  <Method void ArrayList()>
		//   11   22:putfield        #47  <Field ArrayList mActivities>
			mListener = new _cls1();
		//   12   25:aload_0         
		//   13   26:new             #9   <Class FrameMetricsAggregator$FrameMetricsApi24Impl$1>
		//   14   29:dup             
		//   15   30:aload_0         
		//   16   31:invokespecial   #50  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl$1(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//   17   34:putfield        #52  <Field android.view.Window$OnFrameMetricsAvailableListener mListener>
			mTrackingFlags = i;
		//   18   37:aload_0         
		//   19   38:iload_1         
		//   20   39:putfield        #54  <Field int mTrackingFlags>
		//   21   42:return          
		}
	}

	private static class FrameMetricsBaseImpl
	{

		public void add(Activity activity)
		{
		//    0    0:return          
		}

		public SparseIntArray[] getMetrics()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public SparseIntArray[] remove(Activity activity)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public SparseIntArray[] reset()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public SparseIntArray[] stop()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		private FrameMetricsBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}

	}

	public static interface MetricType
		extends Annotation
	{
	}


	public FrameMetricsAggregator()
	{
		this(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #66  <Method void FrameMetricsAggregator(int)>
	//    3    5:return          
	}

	public FrameMetricsAggregator(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   2    4:getstatic       #74  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          24
	//*   4    9:icmplt          25
		{
			mInstance = ((FrameMetricsBaseImpl) (new FrameMetricsApi24Impl(i)));
	//    5   12:aload_0         
	//    6   13:new             #8   <Class FrameMetricsAggregator$FrameMetricsApi24Impl>
	//    7   16:dup             
	//    8   17:iload_1         
	//    9   18:invokespecial   #75  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl(int)>
	//   10   21:putfield        #77  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
			return;
	//   11   24:return          
		} else
		{
			mInstance = new FrameMetricsBaseImpl();
	//   12   25:aload_0         
	//   13   26:new             #13  <Class FrameMetricsAggregator$FrameMetricsBaseImpl>
	//   14   29:dup             
	//   15   30:aconst_null     
	//   16   31:invokespecial   #80  <Method void FrameMetricsAggregator$FrameMetricsBaseImpl(FrameMetricsAggregator$1)>
	//   17   34:putfield        #77  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
			return;
	//   18   37:return          
		}
	}

	public void add(Activity activity)
	{
		mInstance.add(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #85  <Method void FrameMetricsAggregator$FrameMetricsBaseImpl.add(Activity)>
	//    4    8:return          
	}

	public SparseIntArray[] getMetrics()
	{
		return mInstance.getMetrics();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:invokevirtual   #91  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsBaseImpl.getMetrics()>
	//    3    7:areturn         
	}

	public SparseIntArray[] remove(Activity activity)
	{
		return mInstance.remove(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsBaseImpl.remove(Activity)>
	//    4    8:areturn         
	}

	public SparseIntArray[] reset()
	{
		return mInstance.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:invokevirtual   #99  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsBaseImpl.reset()>
	//    3    7:areturn         
	}

	public SparseIntArray[] stop()
	{
		return mInstance.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:invokevirtual   #102 <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsBaseImpl.stop()>
	//    3    7:areturn         
	}

	public static final int ANIMATION_DURATION = 256;
	public static final int ANIMATION_INDEX = 8;
	public static final int COMMAND_DURATION = 32;
	public static final int COMMAND_INDEX = 5;
	private static final boolean DBG = false;
	public static final int DELAY_DURATION = 128;
	public static final int DELAY_INDEX = 7;
	public static final int DRAW_DURATION = 8;
	public static final int DRAW_INDEX = 3;
	public static final int EVERY_DURATION = 511;
	public static final int INPUT_DURATION = 2;
	public static final int INPUT_INDEX = 1;
	private static final int LAST_INDEX = 8;
	public static final int LAYOUT_MEASURE_DURATION = 4;
	public static final int LAYOUT_MEASURE_INDEX = 2;
	public static final int SWAP_DURATION = 64;
	public static final int SWAP_INDEX = 6;
	public static final int SYNC_DURATION = 16;
	public static final int SYNC_INDEX = 4;
	private static final String TAG = "FrameMetrics";
	public static final int TOTAL_DURATION = 1;
	public static final int TOTAL_INDEX = 0;
	private FrameMetricsBaseImpl mInstance;

	// Unreferenced inner class android/support/v4/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1

/* anonymous class */
	class FrameMetricsApi24Impl._cls1
		implements android.view.Window.OnFrameMetricsAvailableListener
	{

		public void onFrameMetricsAvailable(Window window, FrameMetrics framemetrics, int i)
		{
			if((mTrackingFlags & 1) != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*   2    4:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//*   3    7:iconst_1        
		//*   4    8:iand            
		//*   5    9:ifeq            34
				addDurationItem(mMetrics[0], framemetrics.getMetric(8));
		//    6   12:aload_0         
		//    7   13:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//    8   16:aload_0         
		//    9   17:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   10   20:invokestatic    #31  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//   11   23:iconst_0        
		//   12   24:aaload          
		//   13   25:aload_2         
		//   14   26:bipush          8
		//   15   28:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   16   31:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			if((mTrackingFlags & 2) != 0)
		//*  17   34:aload_0         
		//*  18   35:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  19   38:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//*  20   41:iconst_2        
		//*  21   42:iand            
		//*  22   43:ifeq            67
				addDurationItem(mMetrics[1], framemetrics.getMetric(1));
		//   23   46:aload_0         
		//   24   47:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   25   50:aload_0         
		//   26   51:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   27   54:invokestatic    #31  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//   28   57:iconst_1        
		//   29   58:aaload          
		//   30   59:aload_2         
		//   31   60:iconst_1        
		//   32   61:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   33   64:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			if((mTrackingFlags & 4) != 0)
		//*  34   67:aload_0         
		//*  35   68:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  36   71:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//*  37   74:iconst_4        
		//*  38   75:iand            
		//*  39   76:ifeq            100
				addDurationItem(mMetrics[2], framemetrics.getMetric(3));
		//   40   79:aload_0         
		//   41   80:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   42   83:aload_0         
		//   43   84:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   44   87:invokestatic    #31  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//   45   90:iconst_2        
		//   46   91:aaload          
		//   47   92:aload_2         
		//   48   93:iconst_3        
		//   49   94:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   50   97:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			if((mTrackingFlags & 8) != 0)
		//*  51  100:aload_0         
		//*  52  101:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  53  104:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//*  54  107:bipush          8
		//*  55  109:iand            
		//*  56  110:ifeq            134
				addDurationItem(mMetrics[3], framemetrics.getMetric(4));
		//   57  113:aload_0         
		//   58  114:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   59  117:aload_0         
		//   60  118:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   61  121:invokestatic    #31  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//   62  124:iconst_3        
		//   63  125:aaload          
		//   64  126:aload_2         
		//   65  127:iconst_4        
		//   66  128:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   67  131:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			if((mTrackingFlags & 0x10) != 0)
		//*  68  134:aload_0         
		//*  69  135:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  70  138:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//*  71  141:bipush          16
		//*  72  143:iand            
		//*  73  144:ifeq            168
				addDurationItem(mMetrics[4], framemetrics.getMetric(5));
		//   74  147:aload_0         
		//   75  148:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   76  151:aload_0         
		//   77  152:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   78  155:invokestatic    #31  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//   79  158:iconst_4        
		//   80  159:aaload          
		//   81  160:aload_2         
		//   82  161:iconst_5        
		//   83  162:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   84  165:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			if((mTrackingFlags & 0x40) != 0)
		//*  85  168:aload_0         
		//*  86  169:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  87  172:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//*  88  175:bipush          64
		//*  89  177:iand            
		//*  90  178:ifeq            204
				addDurationItem(mMetrics[6], framemetrics.getMetric(7));
		//   91  181:aload_0         
		//   92  182:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   93  185:aload_0         
		//   94  186:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   95  189:invokestatic    #31  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//   96  192:bipush          6
		//   97  194:aaload          
		//   98  195:aload_2         
		//   99  196:bipush          7
		//  100  198:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//  101  201:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			if((mTrackingFlags & 0x20) != 0)
		//* 102  204:aload_0         
		//* 103  205:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//* 104  208:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//* 105  211:bipush          32
		//* 106  213:iand            
		//* 107  214:ifeq            239
				addDurationItem(mMetrics[5], framemetrics.getMetric(6));
		//  108  217:aload_0         
		//  109  218:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//  110  221:aload_0         
		//  111  222:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//  112  225:invokestatic    #31  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//  113  228:iconst_5        
		//  114  229:aaload          
		//  115  230:aload_2         
		//  116  231:bipush          6
		//  117  233:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//  118  236:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			if((mTrackingFlags & 0x80) != 0)
		//* 119  239:aload_0         
		//* 120  240:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//* 121  243:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//* 122  246:sipush          128
		//* 123  249:iand            
		//* 124  250:ifeq            275
				addDurationItem(mMetrics[7], framemetrics.getMetric(0));
		//  125  253:aload_0         
		//  126  254:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//  127  257:aload_0         
		//  128  258:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//  129  261:invokestatic    #31  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//  130  264:bipush          7
		//  131  266:aaload          
		//  132  267:aload_2         
		//  133  268:iconst_0        
		//  134  269:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//  135  272:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			if((mTrackingFlags & 0x100) != 0)
		//* 136  275:aload_0         
		//* 137  276:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//* 138  279:invokestatic    #27  <Method int FrameMetricsAggregator$FrameMetricsApi24Impl.access$100(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//* 139  282:sipush          256
		//* 140  285:iand            
		//* 141  286:ifeq            311
				addDurationItem(mMetrics[8], framemetrics.getMetric(2));
		//  142  289:aload_0         
		//  143  290:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//  144  293:aload_0         
		//  145  294:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//  146  297:invokestatic    #31  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.access$200(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//  147  300:bipush          8
		//  148  302:aaload          
		//  149  303:aload_2         
		//  150  304:iconst_2        
		//  151  305:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//  152  308:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
		//  153  311:return          
		}

		final FrameMetricsApi24Impl this$0;

			
			{
				this$0 = FrameMetricsApi24Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}

}
