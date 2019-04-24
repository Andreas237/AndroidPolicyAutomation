// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;

import android.content.Context;

public class JsSplashInterface
{

	public JsSplashInterface(Context context, Runnable runnable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		processed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean processed>
		closeCallback = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field Runnable closeCallback>
		closeCallback = runnable;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #19  <Field Runnable closeCallback>
		mContext = context;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #21  <Field Context mContext>
	//   14   24:return          
	}

	public void closeSplash()
	{
		if(processed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean processed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			processed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #17  <Field boolean processed>
			closeCallback.run();
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field Runnable closeCallback>
	//    9   17:invokeinterface #29  <Method void Runnable.run()>
			return;
	//   10   22:return          
		}
	}

	private Runnable closeCallback;
	protected Context mContext;
	private boolean processed;
}
