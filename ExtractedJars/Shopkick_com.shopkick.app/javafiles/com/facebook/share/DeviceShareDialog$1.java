// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import android.content.Intent;
import com.facebook.FacebookCallback;
import com.facebook.FacebookRequestError;

// Referenced classes of package com.facebook.share:
//			DeviceShareDialog

class DeviceShareDialog$1
	implements com.facebook.internal.Callback
{

	public boolean onActivityResult(int i, Intent intent)
	{
		if(intent.hasExtra("error"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #29  <String "error">
	//*   2    3:invokevirtual   #35  <Method boolean Intent.hasExtra(String)>
	//*   3    6:ifeq            34
		{
			intent = ((Intent) ((FacebookRequestError)intent.getParcelableExtra("error")));
	//    4    9:aload_2         
	//    5   10:ldc1            #29  <String "error">
	//    6   12:invokevirtual   #39  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    7   15:checkcast       #41  <Class FacebookRequestError>
	//    8   18:astore_2        
			val$callback.onError(((FacebookRequestError) (intent)).getException());
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field FacebookCallback val$callback>
	//   11   23:aload_2         
	//   12   24:invokevirtual   #45  <Method com.facebook.FacebookException FacebookRequestError.getException()>
	//   13   27:invokeinterface #51  <Method void FacebookCallback.onError(com.facebook.FacebookException)>
			return true;
	//   14   32:iconst_1        
	//   15   33:ireturn         
		} else
		{
			val$callback.onSuccess(((Object) (new sult())));
	//   16   34:aload_0         
	//   17   35:getfield        #21  <Field FacebookCallback val$callback>
	//   18   38:new             #53  <Class DeviceShareDialog$Result>
	//   19   41:dup             
	//   20   42:invokespecial   #54  <Method void DeviceShareDialog$Result()>
	//   21   45:invokeinterface #58  <Method void FacebookCallback.onSuccess(Object)>
			return true;
	//   22   50:iconst_1        
	//   23   51:ireturn         
		}
	}

	final DeviceShareDialog this$0;
	final FacebookCallback val$callback;

	DeviceShareDialog$1()
	{
		this$0 = final_devicesharedialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DeviceShareDialog this$0>
		val$callback = FacebookCallback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FacebookCallback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
