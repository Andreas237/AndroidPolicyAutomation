// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

// Referenced classes of package android.arch.lifecycle:
//			LifecycleOwner, LifecycleRegistry, Lifecycle, EmptyActivityLifecycleCallbacks, 
//			ReportFragment

public class ProcessLifecycleOwner
	implements LifecycleOwner
{

	private ProcessLifecycleOwner()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mStartedCounter = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #44  <Field int mStartedCounter>
		mResumedCounter = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #46  <Field int mResumedCounter>
		mPauseSent = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #48  <Field boolean mPauseSent>
		mStopSent = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #50  <Field boolean mStopSent>
	//   14   24:aload_0         
	//   15   25:new             #52  <Class LifecycleRegistry>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:invokespecial   #55  <Method void LifecycleRegistry(LifecycleOwner)>
	//   19   33:putfield        #57  <Field LifecycleRegistry mRegistry>
		mDelayedPauseRunnable = new Runnable() {

			public void run()
			{
				dispatchPauseIfNeeded();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ProcessLifecycleOwner this$0>
			//    2    4:invokestatic    #22  <Method void ProcessLifecycleOwner.access$000(ProcessLifecycleOwner)>
				dispatchStopIfNeeded();
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field ProcessLifecycleOwner this$0>
			//    5   11:invokestatic    #25  <Method void ProcessLifecycleOwner.access$100(ProcessLifecycleOwner)>
			//    6   14:return          
			}

			final ProcessLifecycleOwner this$0;

			
			{
				this$0 = ProcessLifecycleOwner.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ProcessLifecycleOwner this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   20   36:aload_0         
	//   21   37:new             #8   <Class ProcessLifecycleOwner$1>
	//   22   40:dup             
	//   23   41:aload_0         
	//   24   42:invokespecial   #60  <Method void ProcessLifecycleOwner$1(ProcessLifecycleOwner)>
	//   25   45:putfield        #62  <Field Runnable mDelayedPauseRunnable>
		mInitializationListener = new ReportFragment.ActivityInitializationListener() {

			public void onCreate()
			{
			//    0    0:return          
			}

			public void onResume()
			{
				activityResumed();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ProcessLifecycleOwner this$0>
			//    2    4:invokevirtual   #23  <Method void ProcessLifecycleOwner.activityResumed()>
			//    3    7:return          
			}

			public void onStart()
			{
				activityStarted();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ProcessLifecycleOwner this$0>
			//    2    4:invokevirtual   #27  <Method void ProcessLifecycleOwner.activityStarted()>
			//    3    7:return          
			}

			final ProcessLifecycleOwner this$0;

			
			{
				this$0 = ProcessLifecycleOwner.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ProcessLifecycleOwner this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   26   48:aload_0         
	//   27   49:new             #10  <Class ProcessLifecycleOwner$2>
	//   28   52:dup             
	//   29   53:aload_0         
	//   30   54:invokespecial   #63  <Method void ProcessLifecycleOwner$2(ProcessLifecycleOwner)>
	//   31   57:putfield        #65  <Field ReportFragment$ActivityInitializationListener mInitializationListener>
	//   32   60:return          
	}

	private void dispatchPauseIfNeeded()
	{
		if(mResumedCounter == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field int mResumedCounter>
	//*   2    4:ifne            22
		{
			mPauseSent = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #48  <Field boolean mPauseSent>
			mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field LifecycleRegistry mRegistry>
	//    8   16:getstatic       #81  <Field Lifecycle$Event Lifecycle$Event.ON_PAUSE>
	//    9   19:invokevirtual   #85  <Method void LifecycleRegistry.handleLifecycleEvent(Lifecycle$Event)>
		}
	//   10   22:return          
	}

	private void dispatchStopIfNeeded()
	{
		if(mStartedCounter == 0 && mPauseSent)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int mStartedCounter>
	//*   2    4:ifne            29
	//*   3    7:aload_0         
	//*   4    8:getfield        #48  <Field boolean mPauseSent>
	//*   5   11:ifeq            29
		{
			mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
	//    6   14:aload_0         
	//    7   15:getfield        #57  <Field LifecycleRegistry mRegistry>
	//    8   18:getstatic       #88  <Field Lifecycle$Event Lifecycle$Event.ON_STOP>
	//    9   21:invokevirtual   #85  <Method void LifecycleRegistry.handleLifecycleEvent(Lifecycle$Event)>
			mStopSent = true;
	//   10   24:aload_0         
	//   11   25:iconst_1        
	//   12   26:putfield        #50  <Field boolean mStopSent>
		}
	//   13   29:return          
	}

	public static LifecycleOwner get()
	{
		return ((LifecycleOwner) (sInstance));
	//    0    0:getstatic       #40  <Field ProcessLifecycleOwner sInstance>
	//    1    3:areturn         
	}

	static void init(Context context)
	{
		sInstance.attach(context);
	//    0    0:getstatic       #40  <Field ProcessLifecycleOwner sInstance>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #95  <Method void attach(Context)>
	//    3    7:return          
	}

	void activityPaused()
	{
		mResumedCounter = mResumedCounter - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field int mResumedCounter>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #46  <Field int mResumedCounter>
		if(mResumedCounter == 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field int mResumedCounter>
	//*   8   14:ifne            32
			mHandler.postDelayed(mDelayedPauseRunnable, 700L);
	//    9   17:aload_0         
	//   10   18:getfield        #98  <Field Handler mHandler>
	//   11   21:aload_0         
	//   12   22:getfield        #62  <Field Runnable mDelayedPauseRunnable>
	//   13   25:ldc2w           #15  <Long 700L>
	//   14   28:invokevirtual   #104 <Method boolean Handler.postDelayed(Runnable, long)>
	//   15   31:pop             
	//   16   32:return          
	}

	void activityResumed()
	{
		mResumedCounter = mResumedCounter + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field int mResumedCounter>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #46  <Field int mResumedCounter>
		if(mResumedCounter == 1)
	//*   6   10:aload_0         
	//*   7   11:getfield        #46  <Field int mResumedCounter>
	//*   8   14:iconst_1        
	//*   9   15:icmpne          52
		{
			if(mPauseSent)
	//*  10   18:aload_0         
	//*  11   19:getfield        #48  <Field boolean mPauseSent>
	//*  12   22:ifeq            41
			{
				mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
	//   13   25:aload_0         
	//   14   26:getfield        #57  <Field LifecycleRegistry mRegistry>
	//   15   29:getstatic       #108 <Field Lifecycle$Event Lifecycle$Event.ON_RESUME>
	//   16   32:invokevirtual   #85  <Method void LifecycleRegistry.handleLifecycleEvent(Lifecycle$Event)>
				mPauseSent = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #48  <Field boolean mPauseSent>
				return;
	//   20   40:return          
			}
			mHandler.removeCallbacks(mDelayedPauseRunnable);
	//   21   41:aload_0         
	//   22   42:getfield        #98  <Field Handler mHandler>
	//   23   45:aload_0         
	//   24   46:getfield        #62  <Field Runnable mDelayedPauseRunnable>
	//   25   49:invokevirtual   #112 <Method void Handler.removeCallbacks(Runnable)>
		}
	//   26   52:return          
	}

	void activityStarted()
	{
		mStartedCounter = mStartedCounter + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field int mStartedCounter>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #44  <Field int mStartedCounter>
		if(mStartedCounter == 1 && mStopSent)
	//*   6   10:aload_0         
	//*   7   11:getfield        #44  <Field int mStartedCounter>
	//*   8   14:iconst_1        
	//*   9   15:icmpne          40
	//*  10   18:aload_0         
	//*  11   19:getfield        #50  <Field boolean mStopSent>
	//*  12   22:ifeq            40
		{
			mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
	//   13   25:aload_0         
	//   14   26:getfield        #57  <Field LifecycleRegistry mRegistry>
	//   15   29:getstatic       #116 <Field Lifecycle$Event Lifecycle$Event.ON_START>
	//   16   32:invokevirtual   #85  <Method void LifecycleRegistry.handleLifecycleEvent(Lifecycle$Event)>
			mStopSent = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #50  <Field boolean mStopSent>
		}
	//   20   40:return          
	}

	void activityStopped()
	{
		mStartedCounter = mStartedCounter - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field int mStartedCounter>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #44  <Field int mStartedCounter>
		dispatchStopIfNeeded();
	//    6   10:aload_0         
	//    7   11:invokespecial   #73  <Method void dispatchStopIfNeeded()>
	//    8   14:return          
	}

	void attach(Context context)
	{
		mHandler = new Handler();
	//    0    0:aload_0         
	//    1    1:new             #100 <Class Handler>
	//    2    4:dup             
	//    3    5:invokespecial   #118 <Method void Handler()>
	//    4    8:putfield        #98  <Field Handler mHandler>
		mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
	//    5   11:aload_0         
	//    6   12:getfield        #57  <Field LifecycleRegistry mRegistry>
	//    7   15:getstatic       #121 <Field Lifecycle$Event Lifecycle$Event.ON_CREATE>
	//    8   18:invokevirtual   #85  <Method void LifecycleRegistry.handleLifecycleEvent(Lifecycle$Event)>
		((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (new EmptyActivityLifecycleCallbacks() {

			public void onActivityCreated(Activity activity, Bundle bundle)
			{
				ReportFragment.get(activity).setProcessListener(mInitializationListener);
			//    0    0:aload_1         
			//    1    1:invokestatic    #27  <Method ReportFragment ReportFragment.get(Activity)>
			//    2    4:aload_0         
			//    3    5:getfield        #15  <Field ProcessLifecycleOwner this$0>
			//    4    8:invokestatic    #31  <Method ReportFragment$ActivityInitializationListener ProcessLifecycleOwner.access$200(ProcessLifecycleOwner)>
			//    5   11:invokevirtual   #35  <Method void ReportFragment.setProcessListener(ReportFragment$ActivityInitializationListener)>
			//    6   14:return          
			}

			public void onActivityPaused(Activity activity)
			{
				activityPaused();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ProcessLifecycleOwner this$0>
			//    2    4:invokevirtual   #40  <Method void ProcessLifecycleOwner.activityPaused()>
			//    3    7:return          
			}

			public void onActivityStopped(Activity activity)
			{
				activityStopped();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ProcessLifecycleOwner this$0>
			//    2    4:invokevirtual   #44  <Method void ProcessLifecycleOwner.activityStopped()>
			//    3    7:return          
			}

			final ProcessLifecycleOwner this$0;

			
			{
				this$0 = ProcessLifecycleOwner.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ProcessLifecycleOwner this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void EmptyActivityLifecycleCallbacks()>
			//    5    9:return          
			}
		}
)));
	//    9   21:aload_1         
	//   10   22:invokevirtual   #127 <Method Context Context.getApplicationContext()>
	//   11   25:checkcast       #129 <Class Application>
	//   12   28:new             #12  <Class ProcessLifecycleOwner$3>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:invokespecial   #130 <Method void ProcessLifecycleOwner$3(ProcessLifecycleOwner)>
	//   16   36:invokevirtual   #134 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//   17   39:return          
	}

	public Lifecycle getLifecycle()
	{
		return ((Lifecycle) (mRegistry));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LifecycleRegistry mRegistry>
	//    2    4:areturn         
	}

	static final long TIMEOUT_MS = 700L;
	private static final ProcessLifecycleOwner sInstance = new ProcessLifecycleOwner();
	private Runnable mDelayedPauseRunnable;
	private Handler mHandler;
	private ReportFragment.ActivityInitializationListener mInitializationListener;
	private boolean mPauseSent;
	private final LifecycleRegistry mRegistry = new LifecycleRegistry(((LifecycleOwner) (this)));
	private int mResumedCounter;
	private int mStartedCounter;
	private boolean mStopSent;

	static 
	{
	//    0    0:new             #2   <Class ProcessLifecycleOwner>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void ProcessLifecycleOwner()>
	//    3    7:putstatic       #40  <Field ProcessLifecycleOwner sInstance>
	//*   4   10:return          
	}


/*
	static void access$000(ProcessLifecycleOwner processlifecycleowner)
	{
		processlifecycleowner.dispatchPauseIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void dispatchPauseIfNeeded()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$100(ProcessLifecycleOwner processlifecycleowner)
	{
		processlifecycleowner.dispatchStopIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void dispatchStopIfNeeded()>
		return;
	//    2    4:return          
	}

*/


/*
	static ReportFragment.ActivityInitializationListener access$200(ProcessLifecycleOwner processlifecycleowner)
	{
		return processlifecycleowner.mInitializationListener;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field ReportFragment$ActivityInitializationListener mInitializationListener>
	//    2    4:areturn         
	}

*/
}
