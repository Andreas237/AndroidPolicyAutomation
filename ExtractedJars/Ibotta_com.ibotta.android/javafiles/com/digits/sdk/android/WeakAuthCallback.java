// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import java.lang.ref.WeakReference;

// Referenced classes of package com.digits.sdk.android:
//			AuthCallback, DigitsException, DigitsSession

class WeakAuthCallback
	implements AuthCallback
{

	public void failure(DigitsException digitsexception)
	{
		AuthCallback authcallback = (AuthCallback)callbackWeakReference.get();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field WeakReference callbackWeakReference>
	//    2    4:invokevirtual   #19  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class AuthCallback>
	//    4   10:astore_2        
		if(authcallback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
			authcallback.failure(digitsexception);
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokeinterface #21  <Method void AuthCallback.failure(DigitsException)>
	//   10   22:return          
	}

	public void success(DigitsSession digitssession, String s)
	{
		AuthCallback authcallback = (AuthCallback)callbackWeakReference.get();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field WeakReference callbackWeakReference>
	//    2    4:invokevirtual   #19  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class AuthCallback>
	//    4   10:astore_3        
		if(authcallback != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          23
			authcallback.success(digitssession, s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #26  <Method void AuthCallback.success(DigitsSession, String)>
	//   11   23:return          
	}

	private final WeakReference callbackWeakReference;
}
