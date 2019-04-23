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
		//*   0    0:getstatic       #56  <Field HandlerThread sHandlerThread>
		//*   1    3:ifnonnull       40
			{
				sHandlerThread = new HandlerThread("FrameMetricsAggregator");
		//    2    6:new             #58  <Class HandlerThread>
		//    3    9:dup             
		//    4   10:ldc1            #60  <String "FrameMetricsAggregator">
		//    5   12:invokespecial   #63  <Method void HandlerThread(String)>
		//    6   15:putstatic       #56  <Field HandlerThread sHandlerThread>
				sHandlerThread.start();
		//    7   18:getstatic       #56  <Field HandlerThread sHandlerThread>
		//    8   21:invokevirtual   #66  <Method void HandlerThread.start()>
				sHandler = new Handler(sHandlerThread.getLooper());
		//    9   24:new             #68  <Class Handler>
		//   10   27:dup             
		//   11   28:getstatic       #56  <Field HandlerThread sHandlerThread>
		//   12   31:invokevirtual   #72  <Method android.os.Looper HandlerThread.getLooper()>
		//   13   34:invokespecial   #75  <Method void Handler(android.os.Looper)>
		//   14   37:putstatic       #77  <Field Handler sHandler>
			}
			for(int i = 0; i <= 8; i++)
		//*  15   40:iconst_0        
		//*  16   41:istore_2        
		//*  17   42:iload_2         
		//*  18   43:bipush          8
		//*  19   45:icmpgt          87
			{
				SparseIntArray asparseintarray[] = mMetrics;
		//   20   48:aload_0         
		//   21   49:getfield        #40  <Field SparseIntArray[] mMetrics>
		//   22   52:astore_3        
				if(asparseintarray[i] == null && (mTrackingFlags & 1 << i) != 0)
		//*  23   53:aload_3         
		//*  24   54:iload_2         
		//*  25   55:aaload          
		//*  26   56:ifnonnull       80
		//*  27   59:aload_0         
		//*  28   60:getfield        #52  <Field int mTrackingFlags>
		//*  29   63:iconst_1        
		//*  30   64:iload_2         
		//*  31   65:ishl            
		//*  32   66:iand            
		//*  33   67:ifeq            80
					asparseintarray[i] = new SparseIntArray();
		//   34   70:aload_3         
		//   35   71:iload_2         
		//   36   72:new             #38  <Class SparseIntArray>
		//   37   75:dup             
		//   38   76:invokespecial   #78  <Method void SparseIntArray()>
		//   39   79:aastore         
			}

		//   40   80:iload_2         
		//   41   81:iconst_1        
		//   42   82:iadd            
		//   43   83:istore_2        
		//*  44   84:goto            42
			activity.getWindow().addOnFrameMetricsAvailableListener(mListener, sHandler);
		//   45   87:aload_1         
		//   46   88:invokevirtual   #84  <Method Window Activity.getWindow()>
		//   47   91:aload_0         
		//   48   92:getfield        #50  <Field android.view.Window$OnFrameMetricsAvailableListener mListener>
		//   49   95:getstatic       #77  <Field Handler sHandler>
		//   50   98:invokevirtual   #90  <Method void Window.addOnFrameMetricsAvailableListener(android.view.Window$OnFrameMetricsAvailableListener, Handler)>
			mActivities.add(((Object) (new WeakReference(((Object) (activity))))));
		//   51  101:aload_0         
		//   52  102:getfield        #45  <Field ArrayList mActivities>
		//   53  105:new             #92  <Class WeakReference>
		//   54  108:dup             
		//   55  109:aload_1         
		//   56  110:invokespecial   #95  <Method void WeakReference(Object)>
		//   57  113:invokevirtual   #98  <Method boolean ArrayList.add(Object)>
		//   58  116:pop             
		//   59  117:return          
		}

		void addDurationItem(SparseIntArray sparseintarray, long l)
		{
			if(sparseintarray != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          36
			{
				int i = (int)((0x7a120L + l) / 0xf4240L);
		//    2    4:ldc2w           #101 <Long 0x7a120L>
		//    3    7:lload_2         
		//    4    8:ladd            
		//    5    9:ldc2w           #103 <Long 0xf4240L>
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
		//   17   28:invokevirtual   #108 <Method int SparseIntArray.get(int)>
		//   18   31:iconst_1        
		//   19   32:iadd            
		//   20   33:invokevirtual   #112 <Method void SparseIntArray.put(int, int)>
			}
		//   21   36:return          
		}

		public SparseIntArray[] getMetrics()
		{
			return mMetrics;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field SparseIntArray[] mMetrics>
		//    2    4:areturn         
		}

		public SparseIntArray[] remove(Activity activity)
		{
			Iterator iterator = mActivities.iterator();
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field ArrayList mActivities>
		//    2    4:invokevirtual   #120 <Method Iterator ArrayList.iterator()>
		//    3    7:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
		//    4    8:aload_2         
		//    5    9:invokeinterface #126 <Method boolean Iterator.hasNext()>
		//    6   14:ifeq            44
				WeakReference weakreference = (WeakReference)iterator.next();
		//    7   17:aload_2         
		//    8   18:invokeinterface #130 <Method Object Iterator.next()>
		//    9   23:checkcast       #92  <Class WeakReference>
		//   10   26:astore_3        
				if(weakreference.get() != activity)
					continue;
		//   11   27:aload_3         
		//   12   28:invokevirtual   #132 <Method Object WeakReference.get()>
		//   13   31:aload_1         
		//   14   32:if_acmpne       8
				mActivities.remove(((Object) (weakreference)));
		//   15   35:aload_0         
		//   16   36:getfield        #45  <Field ArrayList mActivities>
		//   17   39:aload_3         
		//   18   40:invokevirtual   #134 <Method boolean ArrayList.remove(Object)>
		//   19   43:pop             
				break;
			} while(true);
			activity.getWindow().removeOnFrameMetricsAvailableListener(mListener);
		//   20   44:aload_1         
		//   21   45:invokevirtual   #84  <Method Window Activity.getWindow()>
		//   22   48:aload_0         
		//   23   49:getfield        #50  <Field android.view.Window$OnFrameMetricsAvailableListener mListener>
		//   24   52:invokevirtual   #138 <Method void Window.removeOnFrameMetricsAvailableListener(android.view.Window$OnFrameMetricsAvailableListener)>
			return mMetrics;
		//   25   55:aload_0         
		//   26   56:getfield        #40  <Field SparseIntArray[] mMetrics>
		//   27   59:areturn         
		}

		public SparseIntArray[] reset()
		{
			SparseIntArray asparseintarray[] = mMetrics;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field SparseIntArray[] mMetrics>
		//    2    4:astore_1        
			mMetrics = new SparseIntArray[9];
		//    3    5:aload_0         
		//    4    6:bipush          9
		//    5    8:anewarray       SparseIntArray[]
		//    6   11:putfield        #40  <Field SparseIntArray[] mMetrics>
			return asparseintarray;
		//    7   14:aload_1         
		//    8   15:areturn         
		}

		public SparseIntArray[] stop()
		{
			for(int i = mActivities.size() - 1; i >= 0; i--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #45  <Field ArrayList mActivities>
		//*   2    4:invokevirtual   #144 <Method int ArrayList.size()>
		//*   3    7:iconst_1        
		//*   4    8:isub            
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iflt            68
			{
				WeakReference weakreference = (WeakReference)mActivities.get(i);
		//    8   14:aload_0         
		//    9   15:getfield        #45  <Field ArrayList mActivities>
		//   10   18:iload_1         
		//   11   19:invokevirtual   #147 <Method Object ArrayList.get(int)>
		//   12   22:checkcast       #92  <Class WeakReference>
		//   13   25:astore_2        
				Activity activity = (Activity)weakreference.get();
		//   14   26:aload_2         
		//   15   27:invokevirtual   #132 <Method Object WeakReference.get()>
		//   16   30:checkcast       #80  <Class Activity>
		//   17   33:astore_3        
				if(weakreference.get() != null)
		//*  18   34:aload_2         
		//*  19   35:invokevirtual   #132 <Method Object WeakReference.get()>
		//*  20   38:ifnull          61
				{
					activity.getWindow().removeOnFrameMetricsAvailableListener(mListener);
		//   21   41:aload_3         
		//   22   42:invokevirtual   #84  <Method Window Activity.getWindow()>
		//   23   45:aload_0         
		//   24   46:getfield        #50  <Field android.view.Window$OnFrameMetricsAvailableListener mListener>
		//   25   49:invokevirtual   #138 <Method void Window.removeOnFrameMetricsAvailableListener(android.view.Window$OnFrameMetricsAvailableListener)>
					mActivities.remove(i);
		//   26   52:aload_0         
		//   27   53:getfield        #45  <Field ArrayList mActivities>
		//   28   56:iload_1         
		//   29   57:invokevirtual   #149 <Method Object ArrayList.remove(int)>
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
		//   37   69:getfield        #40  <Field SparseIntArray[] mMetrics>
		//   38   72:areturn         
		}

		private static final int NANOS_PER_MS = 0xf4240;
		private static final int NANOS_ROUNDING_VALUE = 0x7a120;
		private static Handler sHandler;
		private static HandlerThread sHandlerThread;
		private ArrayList mActivities;
		android.view.Window.OnFrameMetricsAvailableListener mListener;
		SparseIntArray mMetrics[];
		int mTrackingFlags;

		static 
		{
		//    0    0:return          
		}

		FrameMetricsApi24Impl(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void FrameMetricsAggregator$FrameMetricsBaseImpl()>
			mMetrics = new SparseIntArray[9];
		//    2    4:aload_0         
		//    3    5:bipush          9
		//    4    7:anewarray       SparseIntArray[]
		//    5   10:putfield        #40  <Field SparseIntArray[] mMetrics>
			mActivities = new ArrayList();
		//    6   13:aload_0         
		//    7   14:new             #42  <Class ArrayList>
		//    8   17:dup             
		//    9   18:invokespecial   #43  <Method void ArrayList()>
		//   10   21:putfield        #45  <Field ArrayList mActivities>
			mListener = new _cls1();
		//   11   24:aload_0         
		//   12   25:new             #9   <Class FrameMetricsAggregator$FrameMetricsApi24Impl$1>
		//   13   28:dup             
		//   14   29:aload_0         
		//   15   30:invokespecial   #48  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl$1(FrameMetricsAggregator$FrameMetricsApi24Impl)>
		//   16   33:putfield        #50  <Field android.view.Window$OnFrameMetricsAvailableListener mListener>
			mTrackingFlags = i;
		//   17   36:aload_0         
		//   18   37:iload_1         
		//   19   38:putfield        #52  <Field int mTrackingFlags>
		//   20   41:return          
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

		FrameMetricsBaseImpl()
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
	//    2    2:invokespecial   #64  <Method void FrameMetricsAggregator(int)>
	//    3    5:return          
	}

	public FrameMetricsAggregator(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   2    4:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          24
	//*   4    9:icmplt          25
		{
			mInstance = ((FrameMetricsBaseImpl) (new FrameMetricsApi24Impl(i)));
	//    5   12:aload_0         
	//    6   13:new             #6   <Class FrameMetricsAggregator$FrameMetricsApi24Impl>
	//    7   16:dup             
	//    8   17:iload_1         
	//    9   18:invokespecial   #73  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl(int)>
	//   10   21:putfield        #75  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
			return;
	//   11   24:return          
		} else
		{
			mInstance = new FrameMetricsBaseImpl();
	//   12   25:aload_0         
	//   13   26:new             #11  <Class FrameMetricsAggregator$FrameMetricsBaseImpl>
	//   14   29:dup             
	//   15   30:invokespecial   #76  <Method void FrameMetricsAggregator$FrameMetricsBaseImpl()>
	//   16   33:putfield        #75  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
			return;
	//   17   36:return          
		}
	}

	public void add(Activity activity)
	{
		mInstance.add(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method void FrameMetricsAggregator$FrameMetricsBaseImpl.add(Activity)>
	//    4    8:return          
	}

	public SparseIntArray[] getMetrics()
	{
		return mInstance.getMetrics();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:invokevirtual   #87  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsBaseImpl.getMetrics()>
	//    3    7:areturn         
	}

	public SparseIntArray[] remove(Activity activity)
	{
		return mInstance.remove(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #92  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsBaseImpl.remove(Activity)>
	//    4    8:areturn         
	}

	public SparseIntArray[] reset()
	{
		return mInstance.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:invokevirtual   #95  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsBaseImpl.reset()>
	//    3    7:areturn         
	}

	public SparseIntArray[] stop()
	{
		return mInstance.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field FrameMetricsAggregator$FrameMetricsBaseImpl mInstance>
	//    2    4:invokevirtual   #98  <Method SparseIntArray[] FrameMetricsAggregator$FrameMetricsBaseImpl.stop()>
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
		//*   2    4:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
		//*   3    7:iconst_1        
		//*   4    8:iand            
		//*   5    9:ifeq            33
			{
				window = ((Window) (FrameMetricsApi24Impl.this));
		//    6   12:aload_0         
		//    7   13:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//    8   16:astore_1        
				((FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsApi24Impl) (window)).mMetrics[0], framemetrics.getMetric(8));
		//    9   17:aload_1         
		//   10   18:aload_1         
		//   11   19:getfield        #31  <Field SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
		//   12   22:iconst_0        
		//   13   23:aaload          
		//   14   24:aload_2         
		//   15   25:bipush          8
		//   16   27:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   17   30:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			}
			if((mTrackingFlags & 2) != 0)
		//*  18   33:aload_0         
		//*  19   34:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  20   37:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
		//*  21   40:iconst_2        
		//*  22   41:iand            
		//*  23   42:ifeq            65
			{
				window = ((Window) (FrameMetricsApi24Impl.this));
		//   24   45:aload_0         
		//   25   46:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   26   49:astore_1        
				((FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsApi24Impl) (window)).mMetrics[1], framemetrics.getMetric(1));
		//   27   50:aload_1         
		//   28   51:aload_1         
		//   29   52:getfield        #31  <Field SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
		//   30   55:iconst_1        
		//   31   56:aaload          
		//   32   57:aload_2         
		//   33   58:iconst_1        
		//   34   59:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   35   62:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			}
			if((mTrackingFlags & 4) != 0)
		//*  36   65:aload_0         
		//*  37   66:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  38   69:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
		//*  39   72:iconst_4        
		//*  40   73:iand            
		//*  41   74:ifeq            97
			{
				window = ((Window) (FrameMetricsApi24Impl.this));
		//   42   77:aload_0         
		//   43   78:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   44   81:astore_1        
				((FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsApi24Impl) (window)).mMetrics[2], framemetrics.getMetric(3));
		//   45   82:aload_1         
		//   46   83:aload_1         
		//   47   84:getfield        #31  <Field SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
		//   48   87:iconst_2        
		//   49   88:aaload          
		//   50   89:aload_2         
		//   51   90:iconst_3        
		//   52   91:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   53   94:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			}
			if((mTrackingFlags & 8) != 0)
		//*  54   97:aload_0         
		//*  55   98:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  56  101:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
		//*  57  104:bipush          8
		//*  58  106:iand            
		//*  59  107:ifeq            130
			{
				window = ((Window) (FrameMetricsApi24Impl.this));
		//   60  110:aload_0         
		//   61  111:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   62  114:astore_1        
				((FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsApi24Impl) (window)).mMetrics[3], framemetrics.getMetric(4));
		//   63  115:aload_1         
		//   64  116:aload_1         
		//   65  117:getfield        #31  <Field SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
		//   66  120:iconst_3        
		//   67  121:aaload          
		//   68  122:aload_2         
		//   69  123:iconst_4        
		//   70  124:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   71  127:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			}
			if((mTrackingFlags & 0x10) != 0)
		//*  72  130:aload_0         
		//*  73  131:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  74  134:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
		//*  75  137:bipush          16
		//*  76  139:iand            
		//*  77  140:ifeq            163
			{
				window = ((Window) (FrameMetricsApi24Impl.this));
		//   78  143:aload_0         
		//   79  144:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   80  147:astore_1        
				((FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsApi24Impl) (window)).mMetrics[4], framemetrics.getMetric(5));
		//   81  148:aload_1         
		//   82  149:aload_1         
		//   83  150:getfield        #31  <Field SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
		//   84  153:iconst_4        
		//   85  154:aaload          
		//   86  155:aload_2         
		//   87  156:iconst_5        
		//   88  157:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//   89  160:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			}
			if((mTrackingFlags & 0x40) != 0)
		//*  90  163:aload_0         
		//*  91  164:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//*  92  167:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
		//*  93  170:bipush          64
		//*  94  172:iand            
		//*  95  173:ifeq            198
			{
				window = ((Window) (FrameMetricsApi24Impl.this));
		//   96  176:aload_0         
		//   97  177:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//   98  180:astore_1        
				((FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsApi24Impl) (window)).mMetrics[6], framemetrics.getMetric(7));
		//   99  181:aload_1         
		//  100  182:aload_1         
		//  101  183:getfield        #31  <Field SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
		//  102  186:bipush          6
		//  103  188:aaload          
		//  104  189:aload_2         
		//  105  190:bipush          7
		//  106  192:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//  107  195:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			}
			if((mTrackingFlags & 0x20) != 0)
		//* 108  198:aload_0         
		//* 109  199:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//* 110  202:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
		//* 111  205:bipush          32
		//* 112  207:iand            
		//* 113  208:ifeq            232
			{
				window = ((Window) (FrameMetricsApi24Impl.this));
		//  114  211:aload_0         
		//  115  212:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//  116  215:astore_1        
				((FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsApi24Impl) (window)).mMetrics[5], framemetrics.getMetric(6));
		//  117  216:aload_1         
		//  118  217:aload_1         
		//  119  218:getfield        #31  <Field SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
		//  120  221:iconst_5        
		//  121  222:aaload          
		//  122  223:aload_2         
		//  123  224:bipush          6
		//  124  226:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//  125  229:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			}
			if((mTrackingFlags & 0x80) != 0)
		//* 126  232:aload_0         
		//* 127  233:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//* 128  236:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
		//* 129  239:sipush          128
		//* 130  242:iand            
		//* 131  243:ifeq            267
			{
				window = ((Window) (FrameMetricsApi24Impl.this));
		//  132  246:aload_0         
		//  133  247:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//  134  250:astore_1        
				((FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsApi24Impl) (window)).mMetrics[7], framemetrics.getMetric(0));
		//  135  251:aload_1         
		//  136  252:aload_1         
		//  137  253:getfield        #31  <Field SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
		//  138  256:bipush          7
		//  139  258:aaload          
		//  140  259:aload_2         
		//  141  260:iconst_0        
		//  142  261:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//  143  264:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			}
			if((mTrackingFlags & 0x100) != 0)
		//* 144  267:aload_0         
		//* 145  268:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//* 146  271:getfield        #27  <Field int FrameMetricsAggregator$FrameMetricsApi24Impl.mTrackingFlags>
		//* 147  274:sipush          256
		//* 148  277:iand            
		//* 149  278:ifeq            302
			{
				window = ((Window) (FrameMetricsApi24Impl.this));
		//  150  281:aload_0         
		//  151  282:getfield        #17  <Field FrameMetricsAggregator$FrameMetricsApi24Impl this$0>
		//  152  285:astore_1        
				((FrameMetricsApi24Impl) (window)).addDurationItem(((FrameMetricsApi24Impl) (window)).mMetrics[8], framemetrics.getMetric(2));
		//  153  286:aload_1         
		//  154  287:aload_1         
		//  155  288:getfield        #31  <Field SparseIntArray[] FrameMetricsAggregator$FrameMetricsApi24Impl.mMetrics>
		//  156  291:bipush          8
		//  157  293:aaload          
		//  158  294:aload_2         
		//  159  295:iconst_2        
		//  160  296:invokevirtual   #37  <Method long FrameMetrics.getMetric(int)>
		//  161  299:invokevirtual   #41  <Method void FrameMetricsAggregator$FrameMetricsApi24Impl.addDurationItem(SparseIntArray, long)>
			}
		//  162  302:return          
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
