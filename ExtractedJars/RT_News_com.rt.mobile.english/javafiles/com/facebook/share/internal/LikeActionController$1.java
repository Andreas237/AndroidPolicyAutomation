// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

static final class LikeActionController$1
	implements eationCallback
{

	public void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception)
	{
		if(facebookexception == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       21
		{
			LikeActionController.access$000(likeactioncontroller, val$requestCode, val$resultCode, val$data);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field int val$requestCode>
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field int val$resultCode>
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field Intent val$data>
	//    9   17:invokestatic    #34  <Method void LikeActionController.access$000(LikeActionController, int, int, Intent)>
			return;
	//   10   20:return          
		} else
		{
			Utility.logd(LikeActionController.access$100(), ((Exception) (facebookexception)));
	//   11   21:invokestatic    #38  <Method String LikeActionController.access$100()>
	//   12   24:aload_2         
	//   13   25:invokestatic    #44  <Method void Utility.logd(String, Exception)>
			return;
	//   14   28:return          
		}
	}

	final Intent val$data;
	final int val$requestCode;
	final int val$resultCode;

	LikeActionController$1(int i, int j, Intent intent)
	{
		val$requestCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field int val$requestCode>
		val$resultCode = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$resultCode>
		val$data = intent;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field Intent val$data>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
