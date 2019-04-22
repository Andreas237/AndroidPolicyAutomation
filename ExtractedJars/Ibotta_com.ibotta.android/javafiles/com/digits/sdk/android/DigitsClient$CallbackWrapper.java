// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterException;

// Referenced classes of package com.digits.sdk.android:
//			DigitsClient

static abstract class DigitsClient$CallbackWrapper extends Callback
{

	public void failure(TwitterException twitterexception)
	{
		Callback callback1 = callback;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Callback callback>
	//    2    4:astore_2        
		if(callback1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			callback1.failure(twitterexception);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #25  <Method void Callback.failure(TwitterException)>
	//    8   14:return          
	}

	final Callback callback;

	public DigitsClient$CallbackWrapper(Callback callback1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Callback()>
		callback = callback1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Callback callback>
	//    5    9:return          
	}
}
