// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.*;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.common.api.internal.LifecycleFragment;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzb, zzc, zzd

public abstract class DialogRedirect
	implements android.content.DialogInterface.OnClickListener
{

	public DialogRedirect()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static DialogRedirect getInstance(Activity activity, Intent intent, int i)
	{
		return ((DialogRedirect) (new zzb(intent, activity, i)));
	//    0    0:new             #15  <Class zzb>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #18  <Method void zzb(Intent, Activity, int)>
	//    6   10:areturn         
	}

	public static DialogRedirect getInstance(Fragment fragment, Intent intent, int i)
	{
		return ((DialogRedirect) (new zzc(intent, fragment, i)));
	//    0    0:new             #22  <Class zzc>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #25  <Method void zzc(Intent, Fragment, int)>
	//    6   10:areturn         
	}

	public static DialogRedirect getInstance(LifecycleFragment lifecyclefragment, Intent intent, int i)
	{
		return ((DialogRedirect) (new zzd(intent, lifecyclefragment, i)));
	//    0    0:new             #29  <Class zzd>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #32  <Method void zzd(Intent, LifecycleFragment, int)>
	//    6   10:areturn         
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		redirect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method void redirect()>
		dialoginterface.dismiss();
	//    2    4:aload_1         
	//    3    5:invokeinterface #44  <Method void DialogInterface.dismiss()>
		return;
	//    4   10:return          
		Object obj;
		obj;
	//    5   11:astore_3        
		break MISSING_BLOCK_LABEL_32;
	//    6   12:goto            32
		obj;
	//    7   15:astore_3        
		Log.e("DialogRedirect", "Failed to start resolution intent", ((Throwable) (obj)));
	//    8   16:ldc1            #46  <String "DialogRedirect">
	//    9   18:ldc1            #48  <String "Failed to start resolution intent">
	//   10   20:aload_3         
	//   11   21:invokestatic    #54  <Method int Log.e(String, String, Throwable)>
	//   12   24:pop             
		dialoginterface.dismiss();
	//   13   25:aload_1         
	//   14   26:invokeinterface #44  <Method void DialogInterface.dismiss()>
		return;
	//   15   31:return          
		dialoginterface.dismiss();
	//   16   32:aload_1         
	//   17   33:invokeinterface #44  <Method void DialogInterface.dismiss()>
		throw obj;
	//   18   38:aload_3         
	//   19   39:athrow          
	}

	protected abstract void redirect();
}
