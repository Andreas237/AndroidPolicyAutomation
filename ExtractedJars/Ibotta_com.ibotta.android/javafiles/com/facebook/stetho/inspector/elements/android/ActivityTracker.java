// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import com.facebook.stetho.common.Util;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ActivityTracker
{
	private static abstract class AutomaticTracker
	{

		public static AutomaticTracker newInstanceIfPossible(Application application, ActivityTracker activitytracker)
		{
			if(android.os.Build.VERSION.SDK_INT >= 14)
		//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          14
		//*   2    5:icmplt          18
				return ((AutomaticTracker) (new AutomaticTrackerICSAndBeyond(application, activitytracker)));
		//    3    8:new             #9   <Class ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond>
		//    4   11:dup             
		//    5   12:aload_0         
		//    6   13:aload_1         
		//    7   14:invokespecial   #31  <Method void ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond(Application, ActivityTracker)>
		//    8   17:areturn         
			else
				return null;
		//    9   18:aconst_null     
		//   10   19:areturn         
		}

		public abstract void register();

		public abstract void unregister();

		private AutomaticTracker()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class AutomaticTracker.AutomaticTrackerICSAndBeyond extends AutomaticTracker
	{

		public void register()
		{
			mApplication.registerActivityLifecycleCallbacks(mLifecycleCallbacks);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Application mApplication>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field android.app.Application$ActivityLifecycleCallbacks mLifecycleCallbacks>
		//    4    8:invokevirtual   #44  <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
		//    5   11:return          
		}

		public void unregister()
		{
			mApplication.unregisterActivityLifecycleCallbacks(mLifecycleCallbacks);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Application mApplication>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field android.app.Application$ActivityLifecycleCallbacks mLifecycleCallbacks>
		//    4    8:invokevirtual   #48  <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
		//    5   11:return          
		}

		private final Application mApplication;
		private final android.app.Application.ActivityLifecycleCallbacks mLifecycleCallbacks = new _cls1();
		private final ActivityTracker mTracker;


/*
		static ActivityTracker access$100(AutomaticTracker.AutomaticTrackerICSAndBeyond automatictrackericsandbeyond)
		{
			return automatictrackericsandbeyond.mTracker;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field ActivityTracker mTracker>
		//    2    4:areturn         
		}

*/

		public AutomaticTracker.AutomaticTrackerICSAndBeyond(Application application, ActivityTracker activitytracker)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #24  <Method void ActivityTracker$AutomaticTracker(ActivityTracker$1)>
		//    3    5:aload_0         
		//    4    6:new             #10  <Class ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond$1>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:invokespecial   #27  <Method void ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond$1(ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond)>
		//    8   14:putfield        #29  <Field android.app.Application$ActivityLifecycleCallbacks mLifecycleCallbacks>
			mApplication = application;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:putfield        #31  <Field Application mApplication>
			mTracker = activitytracker;
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:putfield        #33  <Field ActivityTracker mTracker>
		//   15   27:return          
		}
	}

	public static interface Listener
	{

		public abstract void onActivityAdded(Activity activity);

		public abstract void onActivityRemoved(Activity activity);
	}


	public ActivityTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void ArrayList()>
	//    6   12:putfield        #48  <Field ArrayList mActivities>
		mActivitiesUnmodifiable = Collections.unmodifiableList(((List) (mActivities)));
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #48  <Field ArrayList mActivities>
	//   10   20:invokestatic    #54  <Method List Collections.unmodifiableList(List)>
	//   11   23:putfield        #56  <Field List mActivitiesUnmodifiable>
	//   12   26:aload_0         
	//   13   27:new             #58  <Class CopyOnWriteArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #59  <Method void CopyOnWriteArrayList()>
	//   16   34:putfield        #61  <Field List mListeners>
	//   17   37:return          
	}

	public static ActivityTracker get()
	{
		return sInstance;
	//    0    0:getstatic       #41  <Field ActivityTracker sInstance>
	//    1    3:areturn         
	}

	public void add(Activity activity)
	{
		Util.throwIfNull(((Object) (activity)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #71  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		boolean flag;
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   3    5:invokestatic    #77  <Method Looper Looper.myLooper()>
	//*   4    8:invokestatic    #80  <Method Looper Looper.getMainLooper()>
	//*   5   11:if_acmpne       19
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_2        
		else
	//*   8   16:goto            21
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		Util.throwIfNot(flag);
	//   11   21:iload_2         
	//   12   22:invokestatic    #84  <Method void Util.throwIfNot(boolean)>
		mActivities.add(((Object) (activity)));
	//   13   25:aload_0         
	//   14   26:getfield        #48  <Field ArrayList mActivities>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #87  <Method boolean ArrayList.add(Object)>
	//   17   33:pop             
		for(Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onActivityAdded(activity));
	//   18   34:aload_0         
	//   19   35:getfield        #61  <Field List mListeners>
	//   20   38:invokeinterface #93  <Method Iterator List.iterator()>
	//   21   43:astore_3        
	//   22   44:aload_3         
	//   23   45:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   24   50:ifeq            71
	//   25   53:aload_3         
	//   26   54:invokeinterface #103 <Method Object Iterator.next()>
	//   27   59:checkcast       #16  <Class ActivityTracker$Listener>
	//   28   62:aload_1         
	//   29   63:invokeinterface #106 <Method void ActivityTracker$Listener.onActivityAdded(Activity)>
	//*  30   68:goto            44
	//   31   71:return          
	}

	public boolean beginTrackingIfPossible(Application application)
	{
		if(mAutomaticTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field ActivityTracker$AutomaticTracker mAutomaticTracker>
	//*   2    4:ifnonnull       28
		{
			application = ((Application) (AutomaticTracker.newInstanceIfPossible(application, this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokestatic    #114 <Method ActivityTracker$AutomaticTracker ActivityTracker$AutomaticTracker.newInstanceIfPossible(Application, ActivityTracker)>
	//    6   12:astore_1        
			if(application != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          28
			{
				((AutomaticTracker) (application)).register();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #117 <Method void ActivityTracker$AutomaticTracker.register()>
				mAutomaticTracker = ((AutomaticTracker) (application));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #110 <Field ActivityTracker$AutomaticTracker mAutomaticTracker>
				return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
			}
		}
		return false;
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	public boolean endTracking()
	{
		AutomaticTracker automatictracker = mAutomaticTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ActivityTracker$AutomaticTracker mAutomaticTracker>
	//    2    4:astore_1        
		if(automatictracker != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			automatictracker.unregister();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #121 <Method void ActivityTracker$AutomaticTracker.unregister()>
			mAutomaticTracker = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #110 <Field ActivityTracker$AutomaticTracker mAutomaticTracker>
			return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		} else
		{
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
	}

	public List getActivitiesView()
	{
		return mActivitiesUnmodifiable;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List mActivitiesUnmodifiable>
	//    2    4:areturn         
	}

	public void registerListener(Listener listener)
	{
		mListeners.add(((Object) (listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field List mListeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #128 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void remove(Activity activity)
	{
		Util.throwIfNull(((Object) (activity)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #71  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		boolean flag;
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   3    5:invokestatic    #77  <Method Looper Looper.myLooper()>
	//*   4    8:invokestatic    #80  <Method Looper Looper.getMainLooper()>
	//*   5   11:if_acmpne       19
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_2        
		else
	//*   8   16:goto            21
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		Util.throwIfNot(flag);
	//   11   21:iload_2         
	//   12   22:invokestatic    #84  <Method void Util.throwIfNot(boolean)>
		if(mActivities.remove(((Object) (activity))))
	//*  13   25:aload_0         
	//*  14   26:getfield        #48  <Field ArrayList mActivities>
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #131 <Method boolean ArrayList.remove(Object)>
	//*  17   33:ifeq            73
		{
			for(Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onActivityRemoved(activity));
	//   18   36:aload_0         
	//   19   37:getfield        #61  <Field List mListeners>
	//   20   40:invokeinterface #93  <Method Iterator List.iterator()>
	//   21   45:astore_3        
	//   22   46:aload_3         
	//   23   47:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   24   52:ifeq            73
	//   25   55:aload_3         
	//   26   56:invokeinterface #103 <Method Object Iterator.next()>
	//   27   61:checkcast       #16  <Class ActivityTracker$Listener>
	//   28   64:aload_1         
	//   29   65:invokeinterface #134 <Method void ActivityTracker$Listener.onActivityRemoved(Activity)>
		}
	//*  30   70:goto            46
	//   31   73:return          
	}

	public Activity tryGetTopActivity()
	{
		if(mActivitiesUnmodifiable.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field List mActivitiesUnmodifiable>
	//*   2    4:invokeinterface #139 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
		{
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		} else
		{
			List list = mActivitiesUnmodifiable;
	//    6   14:aload_0         
	//    7   15:getfield        #56  <Field List mActivitiesUnmodifiable>
	//    8   18:astore_1        
			return (Activity)list.get(list.size() - 1);
	//    9   19:aload_1         
	//   10   20:aload_1         
	//   11   21:invokeinterface #143 <Method int List.size()>
	//   12   26:iconst_1        
	//   13   27:isub            
	//   14   28:invokeinterface #146 <Method Object List.get(int)>
	//   15   33:checkcast       #148 <Class Activity>
	//   16   36:areturn         
		}
	}

	public void unregisterListener(Listener listener)
	{
		mListeners.remove(((Object) (listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field List mListeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #150 <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private static final ActivityTracker sInstance = new ActivityTracker();
	private final ArrayList mActivities = new ArrayList();
	private final List mActivitiesUnmodifiable;
	private AutomaticTracker mAutomaticTracker;
	private final List mListeners = new CopyOnWriteArrayList();

	static 
	{
	//    0    0:new             #2   <Class ActivityTracker>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void ActivityTracker()>
	//    3    7:putstatic       #41  <Field ActivityTracker sInstance>
	//*   4   10:return          
	}

	// Unreferenced inner class com/facebook/stetho/inspector/elements/android/ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond$1

/* anonymous class */
	class AutomaticTracker.AutomaticTrackerICSAndBeyond._cls1
		implements android.app.Application.ActivityLifecycleCallbacks
	{

		public void onActivityCreated(Activity activity, Bundle bundle)
		{
			mTracker.add(activity);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond this$0>
		//    2    4:invokestatic    #30  <Method ActivityTracker ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond.access$100(ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond)>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #34  <Method void ActivityTracker.add(Activity)>
		//    5   11:return          
		}

		public void onActivityDestroyed(Activity activity)
		{
			mTracker.remove(activity);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond this$0>
		//    2    4:invokestatic    #30  <Method ActivityTracker ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond.access$100(ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond)>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #38  <Method void ActivityTracker.remove(Activity)>
		//    5   11:return          
		}

		public void onActivityPaused(Activity activity)
		{
		//    0    0:return          
		}

		public void onActivityResumed(Activity activity)
		{
		//    0    0:return          
		}

		public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onActivityStarted(Activity activity)
		{
		//    0    0:return          
		}

		public void onActivityStopped(Activity activity)
		{
		//    0    0:return          
		}

		final AutomaticTracker.AutomaticTrackerICSAndBeyond this$0;

			
			{
				this$0 = AutomaticTracker.AutomaticTrackerICSAndBeyond.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
	}

}
