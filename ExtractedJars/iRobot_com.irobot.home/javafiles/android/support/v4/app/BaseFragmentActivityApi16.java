// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			BaseFragmentActivityApi14

abstract class BaseFragmentActivityApi16 extends BaseFragmentActivityApi14
{

	BaseFragmentActivityApi16()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BaseFragmentActivityApi14()>
	//    2    4:return          
	}

	public void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		if(!mStartedActivityFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean mStartedActivityFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #19  <Method void checkForValidRequestCode(int)>
		super.startActivityForResult(intent, i, bundle);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:aload_3         
	//   12   20:invokespecial   #21  <Method void BaseFragmentActivityApi14.startActivityForResult(Intent, int, Bundle)>
	//   13   23:return          
	}

	public void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
	{
		if(!mStartedIntentSenderFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean mStartedIntentSenderFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #19  <Method void checkForValidRequestCode(int)>
		super.startIntentSenderForResult(intentsender, i, intent, j, k, l, bundle);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:aload_3         
	//   12   20:iload           4
	//   13   22:iload           5
	//   14   24:iload           6
	//   15   26:aload           7
	//   16   28:invokespecial   #28  <Method void BaseFragmentActivityApi14.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
	//   17   31:return          
	}

	boolean mStartedActivityFromFragment;
}
