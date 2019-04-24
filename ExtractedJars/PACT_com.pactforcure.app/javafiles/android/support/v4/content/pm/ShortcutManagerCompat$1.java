// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.*;

// Referenced classes of package android.support.v4.content.pm:
//			ShortcutManagerCompat

static final class ShortcutManagerCompat$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		try
		{
			val$callback.sendIntent(context, 0, ((Intent) (null)), ((android.content.IntentSender$OnFinished) (null)), ((android.os.Handler) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field IntentSender val$callback>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #29  <Method void IntentSender.sendIntent(Context, int, Intent, android.content.IntentSender$OnFinished, android.os.Handler)>
			return;
	//    8   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   9   13:astore_1        
		{
			return;
	//   10   14:return          
		}
	}

	final IntentSender val$callback;

	ShortcutManagerCompat$1(IntentSender intentsender)
	{
		val$callback = intentsender;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field IntentSender val$callback>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
