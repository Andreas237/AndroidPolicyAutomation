// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.*;

// Referenced classes of package com.facebook:
//			ProfileTracker, Profile

private class ProfileTracker$ProfileBroadcastReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #24  <String "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #30  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            41
		{
			context = ((Context) ((Profile)intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_PROFILE")));
	//    5   12:aload_2         
	//    6   13:ldc1            #38  <String "com.facebook.sdk.EXTRA_OLD_PROFILE">
	//    7   15:invokevirtual   #42  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    8   18:checkcast       #44  <Class Profile>
	//    9   21:astore_1        
			intent = ((Intent) ((Profile)intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE")));
	//   10   22:aload_2         
	//   11   23:ldc1            #46  <String "com.facebook.sdk.EXTRA_NEW_PROFILE">
	//   12   25:invokevirtual   #42  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   13   28:checkcast       #44  <Class Profile>
	//   14   31:astore_2        
			onCurrentProfileChanged(((Profile) (context)), ((Profile) (intent)));
	//   15   32:aload_0         
	//   16   33:getfield        #13  <Field ProfileTracker this$0>
	//   17   36:aload_1         
	//   18   37:aload_2         
	//   19   38:invokevirtual   #50  <Method void ProfileTracker.onCurrentProfileChanged(Profile, Profile)>
		}
	//   20   41:return          
	}

	final ProfileTracker this$0;

	private ProfileTracker$ProfileBroadcastReceiver()
	{
		this$0 = ProfileTracker.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ProfileTracker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	ProfileTracker$ProfileBroadcastReceiver(ProfileTracker._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void ProfileTracker$ProfileBroadcastReceiver(ProfileTracker)>
	//    3    5:return          
	}
}
