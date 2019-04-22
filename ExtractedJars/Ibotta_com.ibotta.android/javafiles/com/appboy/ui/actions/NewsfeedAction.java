// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.enums.Channel;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.activities.AppboyFeedActivity;

// Referenced classes of package com.appboy.ui.actions:
//			IAction

public class NewsfeedAction
	implements IAction
{

	public NewsfeedAction(Bundle bundle, Channel channel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mExtras = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Bundle mExtras>
		mChannel = channel;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Channel mChannel>
	//    8   14:return          
	}

	public void execute(Context context)
	{
		try
		{
			Intent intent = new Intent(context, com/appboy/ui/activities/AppboyFeedActivity);
	//    0    0:new             #26  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #28  <Class AppboyFeedActivity>
	//    4    7:invokespecial   #31  <Method void Intent(Context, Class)>
	//    5   10:astore_2        
			if(mExtras != null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #17  <Field Bundle mExtras>
	//*   8   15:ifnull          27
				intent.putExtras(mExtras);
	//    9   18:aload_2         
	//   10   19:aload_0         
	//   11   20:getfield        #17  <Field Bundle mExtras>
	//   12   23:invokevirtual   #35  <Method Intent Intent.putExtras(Bundle)>
	//   13   26:pop             
			context.startActivity(intent);
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #41  <Method void Context.startActivity(Intent)>
			return;
	//   17   32:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  18   33:astore_1        
		{
			AppboyLogger.e("ContentValues", "AppboyFeedActivity was not opened successfully.", ((Throwable) (context)));
	//   19   34:ldc1            #43  <String "ContentValues">
	//   20   36:ldc1            #45  <String "AppboyFeedActivity was not opened successfully.">
	//   21   38:aload_1         
	//   22   39:invokestatic    #51  <Method int AppboyLogger.e(String, String, Throwable)>
	//   23   42:pop             
		}
	//   24   43:return          
	}

	public Channel getChannel()
	{
		return mChannel;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Channel mChannel>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	private final Channel mChannel;
	private final Bundle mExtras;
}
