// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;

// Referenced classes of package o:
//			kk

final class iv extends BroadcastReceiver
{

	iv(kk kk1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		if(intent == null)
			break MISSING_BLOCK_LABEL_20;
	//    0    0:aload_2         
	//    1    1:ifnull          20
		if(intent.getAction().equals("android.location.GPS_FIX_CHANGE"))
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #20  <Method String Intent.getAction()>
	//*   4    8:ldc1            #22  <String "android.location.GPS_FIX_CHANGE">
	//*   5   10:invokevirtual   #28  <Method boolean String.equals(Object)>
	//*   6   13:ifeq            20
			kk.b = false;
	//    7   16:iconst_0        
	//    8   17:putstatic       #34  <Field boolean kk.b>
		return;
	//    9   20:return          
		context;
	//   10   21:astore_1        
	//   11   22:return          
	}
}
