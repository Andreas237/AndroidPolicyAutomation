// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;
import android.os.HandlerThread;

class MyHandlerThread extends HandlerThread
{

	public MyHandlerThread(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void HandlerThread(String)>
		prepareHandler();
	//    3    5:aload_0         
	//    4    6:invokespecial   #14  <Method void prepareHandler()>
	//    5    9:return          
	}

	private void prepareHandler()
	{
		if(getLooper() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #19  <Method android.os.Looper getLooper()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mHandler == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #21  <Field Handler mHandler>
	//*   6   12:ifnonnull       30
			mHandler = new Handler(getLooper());
	//    7   15:aload_0         
	//    8   16:new             #23  <Class Handler>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokevirtual   #19  <Method android.os.Looper getLooper()>
	//   12   24:invokespecial   #26  <Method void Handler(android.os.Looper)>
	//   13   27:putfield        #21  <Field Handler mHandler>
	//   14   30:return          
	}

	public Handler getHandler()
	{
		return mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Handler mHandler>
	//    2    4:areturn         
	}

	public void onLooperPrepared()
	{
		prepareHandler();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void prepareHandler()>
	//    2    4:return          
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void HandlerThread.start()>
		prepareHandler();
	//    2    4:aload_0         
	//    3    5:invokespecial   #14  <Method void prepareHandler()>
	//    4    8:return          
	}

	Handler mHandler;
}
