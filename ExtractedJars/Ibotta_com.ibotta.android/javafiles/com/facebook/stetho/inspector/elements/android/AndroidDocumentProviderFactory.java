// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.facebook.stetho.common.*;
import com.facebook.stetho.common.android.HandlerUtil;
import com.facebook.stetho.inspector.elements.DocumentProvider;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			AndroidDocumentProvider

public final class AndroidDocumentProviderFactory
	implements ThreadBound, DocumentProviderFactory
{

	public AndroidDocumentProviderFactory(Application application)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mApplication = (Application)Util.throwIfNull(((Object) (application)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Object Util.throwIfNull(Object)>
	//    5    9:checkcast       #25  <Class Application>
	//    6   12:putfield        #27  <Field Application mApplication>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class Handler>
	//    9   19:dup             
	//   10   20:invokestatic    #35  <Method Looper Looper.getMainLooper()>
	//   11   23:invokespecial   #38  <Method void Handler(Looper)>
	//   12   26:putfield        #40  <Field Handler mHandler>
	//   13   29:return          
	}

	public boolean checkThreadAccess()
	{
		return HandlerUtil.checkThreadAccess(mHandler);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Handler mHandler>
	//    2    4:invokestatic    #48  <Method boolean HandlerUtil.checkThreadAccess(Handler)>
	//    3    7:ireturn         
	}

	public DocumentProvider create()
	{
		return ((DocumentProvider) (new AndroidDocumentProvider(mApplication, ((ThreadBound) (this)))));
	//    0    0:new             #52  <Class AndroidDocumentProvider>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Application mApplication>
	//    4    8:aload_0         
	//    5    9:invokespecial   #55  <Method void AndroidDocumentProvider(Application, ThreadBound)>
	//    6   12:areturn         
	}

	public Object postAndWait(UncheckedCallable uncheckedcallable)
	{
		return HandlerUtil.postAndWait(mHandler, uncheckedcallable);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Handler mHandler>
	//    2    4:aload_1         
	//    3    5:invokestatic    #60  <Method Object HandlerUtil.postAndWait(Handler, UncheckedCallable)>
	//    4    8:areturn         
	}

	public void postAndWait(Runnable runnable)
	{
		HandlerUtil.postAndWait(mHandler, runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Handler mHandler>
	//    2    4:aload_1         
	//    3    5:invokestatic    #66  <Method void HandlerUtil.postAndWait(Handler, Runnable)>
	//    4    8:return          
	}

	public void postDelayed(Runnable runnable, long l)
	{
		if(mHandler.postDelayed(runnable, l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Handler mHandler>
	//*   2    4:aload_1         
	//*   3    5:lload_2         
	//*   4    6:invokevirtual   #71  <Method boolean Handler.postDelayed(Runnable, long)>
	//*   5    9:ifeq            13
			return;
	//    6   12:return          
		else
			throw new RuntimeException("Handler.postDelayed() returned false");
	//    7   13:new             #73  <Class RuntimeException>
	//    8   16:dup             
	//    9   17:ldc1            #75  <String "Handler.postDelayed() returned false">
	//   10   19:invokespecial   #78  <Method void RuntimeException(String)>
	//   11   22:athrow          
	}

	public void removeCallbacks(Runnable runnable)
	{
		mHandler.removeCallbacks(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Handler mHandler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method void Handler.removeCallbacks(Runnable)>
	//    4    8:return          
	}

	public void verifyThreadAccess()
	{
		HandlerUtil.verifyThreadAccess(mHandler);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Handler mHandler>
	//    2    4:invokestatic    #85  <Method void HandlerUtil.verifyThreadAccess(Handler)>
	//    3    7:return          
	}

	private final Application mApplication;
	private final Handler mHandler = new Handler(Looper.getMainLooper());
}
