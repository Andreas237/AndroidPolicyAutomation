// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.iid;

import android.util.Log;

// Referenced classes of package com.google.firebase.iid:
//			zzl, FirebaseInstanceId

public static final class zzl$a extends ClassLoader
{

	protected final Class loadClass(String s, boolean flag)
	{
		if("com.google.android.gms.iid.MessengerCompat".equals(((Object) (s))))
	//*   0    0:ldc1            #16  <String "com.google.android.gms.iid.MessengerCompat">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #22  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            26
		{
			if(FirebaseInstanceId.g())
	//*   4    9:invokestatic    #28  <Method boolean FirebaseInstanceId.g()>
	//*   5   12:ifeq            23
				Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
	//    6   15:ldc1            #30  <String "FirebaseInstanceId">
	//    7   17:ldc1            #32  <String "Using renamed FirebaseIidMessengerCompat class">
	//    8   19:invokestatic    #38  <Method int Log.d(String, String)>
	//    9   22:pop             
			return com/google/firebase/iid/zzl;
	//   10   23:ldc1            #6   <Class zzl>
	//   11   25:areturn         
		} else
		{
			return super.loadClass(s, flag);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:iload_2         
	//   15   29:invokespecial   #40  <Method Class ClassLoader.loadClass(String, boolean)>
	//   16   32:areturn         
		}
	}

	public zzl$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ClassLoader()>
	//    2    4:return          
	}
}
