// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.content.*;
import android.util.Log;
import android.view.View;

// Referenced classes of package com.google.android.gms.dynamic:
//			zza

final class zza$5
	implements android.view.nClickListener
{

	public void onClick(View view)
	{
		try
		{
			zztf.startActivity(zzaRJ);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context zztf>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Intent zzaRJ>
	//    4    8:invokevirtual   #35  <Method void Context.startActivity(Intent)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   6   12:astore_1        
		{
			Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", ((Throwable) (view)));
	//    7   13:ldc1            #37  <String "DeferredLifecycleHelper">
	//    8   15:ldc1            #39  <String "Failed to start resolution intent">
	//    9   17:aload_1         
	//   10   18:invokestatic    #45  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	final Intent zzaRJ;
	final Context zztf;

	zza$5(Context context, Intent intent)
	{
		zztf = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Context zztf>
		zzaRJ = intent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Intent zzaRJ>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
