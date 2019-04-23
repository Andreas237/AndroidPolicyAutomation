// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			AppboyAdmReceiver

public class AppboyAdmReceiver$HandleAppboyAdmMessageTask extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Void[]>
	//    3    5:invokevirtual   #39  <Method Void doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient Void doInBackground(Void avoid[])
	{
		try
		{
			handleAppboyAdmMessage(mContext, mIntent);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AppboyAdmReceiver this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Intent mIntent>
	//    6   12:invokevirtual   #45  <Method boolean AppboyAdmReceiver.handleAppboyAdmMessage(Context, Intent)>
	//    7   15:pop             
		}
	//*   8   16:goto            30
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//*   9   19:astore_1        
		{
			AppboyLogger.e(AppboyAdmReceiver.access$000(), "Failed to create and display notification.", ((Throwable) (avoid)));
	//   10   20:invokestatic    #49  <Method String AppboyAdmReceiver.access$000()>
	//   11   23:ldc1            #51  <String "Failed to create and display notification.">
	//   12   25:aload_1         
	//   13   26:invokestatic    #57  <Method int AppboyLogger.e(String, String, Throwable)>
	//   14   29:pop             
		}
		return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
	}

	private final Context mContext;
	private final Intent mIntent;
	final AppboyAdmReceiver this$0;

	public AppboyAdmReceiver$HandleAppboyAdmMessageTask(Context context, Intent intent)
	{
		this$0 = AppboyAdmReceiver.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AppboyAdmReceiver this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void AsyncTask()>
		mContext = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Context mContext>
		mIntent = intent;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Intent mIntent>
		execute(((Object []) (new Void[0])));
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:anewarray       Void[]
	//   14   24:invokevirtual   #31  <Method AsyncTask execute(Object[])>
	//   15   27:pop             
	//   16   28:return          
	}
}
