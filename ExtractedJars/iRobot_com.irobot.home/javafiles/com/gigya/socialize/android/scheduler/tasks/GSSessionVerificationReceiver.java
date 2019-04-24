// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.scheduler.tasks;

import android.content.*;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.log.GigyaLog;
import com.gigya.socialize.android.utils.Utils;

public abstract class GSSessionVerificationReceiver extends BroadcastReceiver
{

	public GSSessionVerificationReceiver(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BroadcastReceiver()>
		activityName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field String activityName>
	//    5    9:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) ((GSObject)intent.getSerializableExtra("session_verification_data")));
	//    0    0:aload_2         
	//    1    1:ldc1            #18  <String "session_verification_data">
	//    2    3:invokevirtual   #24  <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//    3    6:checkcast       #26  <Class GSObject>
	//    4    9:astore_1        
		intent = ((Intent) (intent.getStringExtra("session_verification_target")));
	//    5   10:aload_2         
	//    6   11:ldc1            #28  <String "session_verification_target">
	//    7   13:invokevirtual   #32  <Method String Intent.getStringExtra(String)>
	//    8   16:astore_2        
		if(context != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          70
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #34  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #35  <Method void StringBuilder()>
	//   14   28:astore_3        
			stringbuilder.append("received with resolve = ");
	//   15   29:aload_3         
	//   16   30:ldc1            #37  <String "received with resolve = ">
	//   17   32:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			stringbuilder.append(((GSObject) (context)).toJsonString());
	//   19   36:aload_3         
	//   20   37:aload_1         
	//   21   38:invokevirtual   #45  <Method String GSObject.toJsonString()>
	//   22   41:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			GigyaLog.d("GSSessionVerificationReceiver", stringbuilder.toString());
	//   24   45:ldc1            #47  <String "GSSessionVerificationReceiver">
	//   25   47:aload_3         
	//   26   48:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   27   51:invokestatic    #56  <Method void GigyaLog.d(String, String)>
			if(Utils.safeEquals(((Object) (intent)), ((Object) (activityName))))
	//*  28   54:aload_2         
	//*  29   55:aload_0         
	//*  30   56:getfield        #13  <Field String activityName>
	//*  31   59:invokestatic    #62  <Method boolean Utils.safeEquals(Object, Object)>
	//*  32   62:ifeq            70
				onSessionVerificationReceive(((GSObject) (context)));
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokevirtual   #66  <Method void onSessionVerificationReceive(GSObject)>
		}
	//   36   70:return          
	}

	public abstract void onSessionVerificationReceive(GSObject gsobject);

	private String activityName;
}
