// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards;

import com.appboy.ui.contentcards.listeners.AppboyContentCardsActionListener;
import com.appboy.ui.contentcards.listeners.IContentCardsActionListener;

public class AppboyContentCardsManager
{

	public AppboyContentCardsManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mDefaultContentCardsActionListener = ((IContentCardsActionListener) (new AppboyContentCardsActionListener()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class AppboyContentCardsActionListener>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void AppboyContentCardsActionListener()>
	//    6   12:putfield        #20  <Field IContentCardsActionListener mDefaultContentCardsActionListener>
	//    7   15:return          
	}

	public static AppboyContentCardsManager getInstance()
	{
		if(sInstance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #24  <Field AppboyContentCardsManager sInstance>
	//    1    3:ifnonnull       37
		com/appboy/ui/contentcards/AppboyContentCardsManager;
	//    2    6:ldc1            #2   <Class AppboyContentCardsManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(sInstance == null)
	//*   4    9:getstatic       #24  <Field AppboyContentCardsManager sInstance>
	//*   5   12:ifnonnull       25
			sInstance = new AppboyContentCardsManager();
	//    6   15:new             #2   <Class AppboyContentCardsManager>
	//    7   18:dup             
	//    8   19:invokespecial   #25  <Method void AppboyContentCardsManager()>
	//    9   22:putstatic       #24  <Field AppboyContentCardsManager sInstance>
		com/appboy/ui/contentcards/AppboyContentCardsManager;
	//   10   25:ldc1            #2   <Class AppboyContentCardsManager>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/appboy/ui/contentcards/AppboyContentCardsManager;
	//   14   32:ldc1            #2   <Class AppboyContentCardsManager>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return sInstance;
	//   18   37:getstatic       #24  <Field AppboyContentCardsManager sInstance>
	//   19   40:areturn         
	}

	public IContentCardsActionListener getContentCardsActionListener()
	{
		IContentCardsActionListener icontentcardsactionlistener = mCustomContentCardsActionListener;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IContentCardsActionListener mCustomContentCardsActionListener>
	//    2    4:astore_1        
		if(icontentcardsactionlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return icontentcardsactionlistener;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return mDefaultContentCardsActionListener;
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field IContentCardsActionListener mDefaultContentCardsActionListener>
	//    9   15:areturn         
	}

	public void setContentCardsActionListener(IContentCardsActionListener icontentcardsactionlistener)
	{
		mCustomContentCardsActionListener = icontentcardsactionlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field IContentCardsActionListener mCustomContentCardsActionListener>
	//    3    5:return          
	}

	private static volatile AppboyContentCardsManager sInstance;
	private IContentCardsActionListener mCustomContentCardsActionListener;
	private IContentCardsActionListener mDefaultContentCardsActionListener;

	static 
	{
	//    0    0:return          
	}
}
