// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.craftar:
//			Build, SearchController, CraftARCamera

public abstract class CraftARGenericSDK
{
	public static interface OnFinderTimeoutListener
	{

		public abstract void finderTimeoutOver();
	}


	public CraftARGenericSDK()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mIsFinding = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field boolean mIsFinding>
		mTimer = new Timer();
	//    5    9:aload_0         
	//    6   10:new             #33  <Class Timer>
	//    7   13:dup             
	//    8   14:invokespecial   #34  <Method void Timer()>
	//    9   17:putfield        #36  <Field Timer mTimer>
	//   10   20:return          
	}

	public abstract CraftARCamera getCamera();

	Context getContext()
	{
		return context;
	//    0    0:getstatic       #51  <Field Context context>
	//    1    3:areturn         
	}

	public SearchController getSearchController()
	{
		return mSearchController;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field SearchController mSearchController>
	//    2    4:areturn         
	}

	public void init(Context context1)
	{
		context = context1;
	//    0    0:aload_1         
	//    1    1:putstatic       #51  <Field Context context>
		Build.setup();
	//    2    4:invokestatic    #62  <Method void Build.setup()>
		mMainHandler = new Handler(context.getMainLooper());
	//    3    7:aload_0         
	//    4    8:new             #64  <Class Handler>
	//    5   11:dup             
	//    6   12:getstatic       #51  <Field Context context>
	//    7   15:invokevirtual   #70  <Method android.os.Looper Context.getMainLooper()>
	//    8   18:invokespecial   #73  <Method void Handler(android.os.Looper)>
	//    9   21:putfield        #45  <Field Handler mMainHandler>
	//   10   24:return          
	}

	public boolean isFinding()
	{
		return mIsFinding;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean mIsFinding>
	//    2    4:ireturn         
	}

	public abstract void setSearchController(SearchController searchcontroller);

	public abstract void singleShotSearch();

	public void startFinder()
	{
		mIsFinding = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #31  <Field boolean mIsFinding>
		SearchController searchcontroller = mSearchController;
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field SearchController mSearchController>
	//    5    9:astore_1        
		if(searchcontroller != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          20
			searchcontroller.onFinderActivated();
	//    8   14:aload_1         
	//    9   15:invokeinterface #84  <Method void SearchController.onFinderActivated()>
	//   10   20:return          
	}

	public void startFinder(long l, OnFinderTimeoutListener onfindertimeoutlistener)
	{
		mTimer.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Timer mTimer>
	//    2    4:invokevirtual   #88  <Method void Timer.cancel()>
		mTimer = new Timer();
	//    3    7:aload_0         
	//    4    8:new             #33  <Class Timer>
	//    5   11:dup             
	//    6   12:invokespecial   #34  <Method void Timer()>
	//    7   15:putfield        #36  <Field Timer mTimer>
		mOnFinderTimeoutListener = onfindertimeoutlistener;
	//    8   18:aload_0         
	//    9   19:aload_3         
	//   10   20:putfield        #41  <Field CraftARGenericSDK$OnFinderTimeoutListener mOnFinderTimeoutListener>
		startFinder();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #90  <Method void startFinder()>
		mTimer.schedule(((TimerTask) (new TimerTask() {

			public void run()
			{
				if(isFinding())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field CraftARGenericSDK this$0>
			//*   2    4:invokevirtual   #26  <Method boolean CraftARGenericSDK.isFinding()>
			//*   3    7:ifeq            56
				{
					stopFinder();
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field CraftARGenericSDK this$0>
			//    6   14:invokevirtual   #29  <Method void CraftARGenericSDK.stopFinder()>
					if(mOnFinderTimeoutListener != null && mMainHandler != null)
			//*   7   17:aload_0         
			//*   8   18:getfield        #17  <Field CraftARGenericSDK this$0>
			//*   9   21:invokestatic    #33  <Method CraftARGenericSDK$OnFinderTimeoutListener CraftARGenericSDK.access$000(CraftARGenericSDK)>
			//*  10   24:ifnull          56
			//*  11   27:aload_0         
			//*  12   28:getfield        #17  <Field CraftARGenericSDK this$0>
			//*  13   31:invokestatic    #37  <Method Handler CraftARGenericSDK.access$100(CraftARGenericSDK)>
			//*  14   34:ifnull          56
						mMainHandler.post(new Runnable() {

							public void run()
							{
								mOnFinderTimeoutListener.finderTimeoutOver();
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field CraftARGenericSDK$1 this$1>
							//    2    4:getfield        #24  <Field CraftARGenericSDK CraftARGenericSDK$1.this$0>
							//    3    7:invokestatic    #30  <Method CraftARGenericSDK$OnFinderTimeoutListener CraftARGenericSDK.access$000(CraftARGenericSDK)>
							//    4   10:invokeinterface #35  <Method void CraftARGenericSDK$OnFinderTimeoutListener.finderTimeoutOver()>
							//    5   15:return          
							}

							final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CraftARGenericSDK$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
);
			//   15   37:aload_0         
			//   16   38:getfield        #17  <Field CraftARGenericSDK this$0>
			//   17   41:invokestatic    #37  <Method Handler CraftARGenericSDK.access$100(CraftARGenericSDK)>
			//   18   44:new             #11  <Class CraftARGenericSDK$1$1>
			//   19   47:dup             
			//   20   48:aload_0         
			//   21   49:invokespecial   #40  <Method void CraftARGenericSDK$1$1(CraftARGenericSDK$1)>
			//   22   52:invokevirtual   #46  <Method boolean Handler.post(Runnable)>
			//   23   55:pop             
				}
			//   24   56:return          
			}

			final CraftARGenericSDK this$0;

			
			{
				this$0 = CraftARGenericSDK.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CraftARGenericSDK this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void TimerTask()>
			//    5    9:return          
			}
		}
)), l);
	//   13   27:aload_0         
	//   14   28:getfield        #36  <Field Timer mTimer>
	//   15   31:new             #6   <Class CraftARGenericSDK$1>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:invokespecial   #93  <Method void CraftARGenericSDK$1(CraftARGenericSDK)>
	//   19   39:lload_1         
	//   20   40:invokevirtual   #97  <Method void Timer.schedule(TimerTask, long)>
	//   21   43:return          
	}

	public void stopFinder()
	{
		mIsFinding = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #31  <Field boolean mIsFinding>
		Object obj = ((Object) (mSearchController));
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field SearchController mSearchController>
	//    5    9:astore_1        
		if(obj != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          20
			((SearchController) (obj)).onFinderDeactivated();
	//    8   14:aload_1         
	//    9   15:invokeinterface #101 <Method void SearchController.onFinderDeactivated()>
		obj = ((Object) (mTimer));
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field Timer mTimer>
	//   12   24:astore_1        
		if(obj != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          33
			((Timer) (obj)).cancel();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #88  <Method void Timer.cancel()>
	//   17   33:return          
	}

	abstract void updateItemsInfo();

	static Context context;
	static CraftARGenericSDK genericInstance;
	boolean mIsFinding;
	private Handler mMainHandler;
	private OnFinderTimeoutListener mOnFinderTimeoutListener;
	SearchController mSearchController;
	private Timer mTimer;


/*
	static OnFinderTimeoutListener access$000(CraftARGenericSDK craftargenericsdk)
	{
		return craftargenericsdk.mOnFinderTimeoutListener;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field CraftARGenericSDK$OnFinderTimeoutListener mOnFinderTimeoutListener>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$100(CraftARGenericSDK craftargenericsdk)
	{
		return craftargenericsdk.mMainHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Handler mMainHandler>
	//    2    4:areturn         
	}

*/
}
