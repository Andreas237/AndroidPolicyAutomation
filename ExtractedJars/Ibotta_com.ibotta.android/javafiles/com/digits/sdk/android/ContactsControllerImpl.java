// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.digits.sdk.android:
//			ContactsController, ContactsUploadService

class ContactsControllerImpl
	implements ContactsController
{

	ContactsControllerImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void startUploadService(Context context)
	{
		context.startService(new Intent(context, com/digits/sdk/android/ContactsUploadService));
	//    0    0:aload_1         
	//    1    1:new             #15  <Class Intent>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <Class ContactsUploadService>
	//    5    8:invokespecial   #20  <Method void Intent(Context, Class)>
	//    6   11:invokevirtual   #26  <Method android.content.ComponentName Context.startService(Intent)>
	//    7   14:pop             
	//    8   15:return          
	}
}
