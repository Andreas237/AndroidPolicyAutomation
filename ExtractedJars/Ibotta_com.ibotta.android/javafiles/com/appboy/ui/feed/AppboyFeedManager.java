// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.feed;

import com.appboy.ui.feed.listeners.AppboyDefaultFeedClickActionListener;
import com.appboy.ui.feed.listeners.IFeedClickActionListener;

public class AppboyFeedManager
{

	public AppboyFeedManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mDefaultFeedClickActionListener = ((IFeedClickActionListener) (new AppboyDefaultFeedClickActionListener()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class AppboyDefaultFeedClickActionListener>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void AppboyDefaultFeedClickActionListener()>
	//    6   12:putfield        #20  <Field IFeedClickActionListener mDefaultFeedClickActionListener>
	//    7   15:return          
	}

	public static AppboyFeedManager getInstance()
	{
		if(sInstance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #24  <Field AppboyFeedManager sInstance>
	//    1    3:ifnonnull       37
		com/appboy/ui/feed/AppboyFeedManager;
	//    2    6:ldc1            #2   <Class AppboyFeedManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(sInstance == null)
	//*   4    9:getstatic       #24  <Field AppboyFeedManager sInstance>
	//*   5   12:ifnonnull       25
			sInstance = new AppboyFeedManager();
	//    6   15:new             #2   <Class AppboyFeedManager>
	//    7   18:dup             
	//    8   19:invokespecial   #25  <Method void AppboyFeedManager()>
	//    9   22:putstatic       #24  <Field AppboyFeedManager sInstance>
		com/appboy/ui/feed/AppboyFeedManager;
	//   10   25:ldc1            #2   <Class AppboyFeedManager>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/appboy/ui/feed/AppboyFeedManager;
	//   14   32:ldc1            #2   <Class AppboyFeedManager>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return sInstance;
	//   18   37:getstatic       #24  <Field AppboyFeedManager sInstance>
	//   19   40:areturn         
	}

	public IFeedClickActionListener getFeedCardClickActionListener()
	{
		IFeedClickActionListener ifeedclickactionlistener = mCustomFeedClickActionListener;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IFeedClickActionListener mCustomFeedClickActionListener>
	//    2    4:astore_1        
		if(ifeedclickactionlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ifeedclickactionlistener;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return mDefaultFeedClickActionListener;
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field IFeedClickActionListener mDefaultFeedClickActionListener>
	//    9   15:areturn         
	}

	public void setFeedCardClickActionListener(IFeedClickActionListener ifeedclickactionlistener)
	{
		mCustomFeedClickActionListener = ifeedclickactionlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field IFeedClickActionListener mCustomFeedClickActionListener>
	//    3    5:return          
	}

	private static volatile AppboyFeedManager sInstance;
	private IFeedClickActionListener mCustomFeedClickActionListener;
	private IFeedClickActionListener mDefaultFeedClickActionListener;

	static 
	{
	//    0    0:return          
	}
}
