// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzcc, LifecycleCallback

final class zzcd
	implements Runnable
{

	zzcd(zzcc zzcc1, LifecycleCallback lifecyclecallback, String s)
	{
		zzly = zzcc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzcc zzly>
		zzle = lifecyclecallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field LifecycleCallback zzle>
		zzlf = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field String zzlf>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		if(zzcc.zza(zzly) > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field zzcc zzly>
	//*   2    4:invokestatic    #31  <Method int zzcc.zza(zzcc)>
	//*   3    7:ifle            50
		{
			LifecycleCallback lifecyclecallback = zzle;
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field LifecycleCallback zzle>
	//    6   14:astore_2        
			Bundle bundle;
			if(zzcc.zzb(zzly) != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #16  <Field zzcc zzly>
	//*   9   19:invokestatic    #35  <Method Bundle zzcc.zzb(zzcc)>
	//*  10   22:ifnull          43
				bundle = zzcc.zzb(zzly).getBundle(zzlf);
	//   11   25:aload_0         
	//   12   26:getfield        #16  <Field zzcc zzly>
	//   13   29:invokestatic    #35  <Method Bundle zzcc.zzb(zzcc)>
	//   14   32:aload_0         
	//   15   33:getfield        #20  <Field String zzlf>
	//   16   36:invokevirtual   #41  <Method Bundle Bundle.getBundle(String)>
	//   17   39:astore_1        
			else
	//*  18   40:goto            45
				bundle = null;
	//   19   43:aconst_null     
	//   20   44:astore_1        
			lifecyclecallback.onCreate(bundle);
	//   21   45:aload_2         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #47  <Method void LifecycleCallback.onCreate(Bundle)>
		}
		if(zzcc.zza(zzly) >= 2)
	//*  24   50:aload_0         
	//*  25   51:getfield        #16  <Field zzcc zzly>
	//*  26   54:invokestatic    #31  <Method int zzcc.zza(zzcc)>
	//*  27   57:iconst_2        
	//*  28   58:icmplt          68
			zzle.onStart();
	//   29   61:aload_0         
	//   30   62:getfield        #18  <Field LifecycleCallback zzle>
	//   31   65:invokevirtual   #50  <Method void LifecycleCallback.onStart()>
		if(zzcc.zza(zzly) >= 3)
	//*  32   68:aload_0         
	//*  33   69:getfield        #16  <Field zzcc zzly>
	//*  34   72:invokestatic    #31  <Method int zzcc.zza(zzcc)>
	//*  35   75:iconst_3        
	//*  36   76:icmplt          86
			zzle.onResume();
	//   37   79:aload_0         
	//   38   80:getfield        #18  <Field LifecycleCallback zzle>
	//   39   83:invokevirtual   #53  <Method void LifecycleCallback.onResume()>
		if(zzcc.zza(zzly) >= 4)
	//*  40   86:aload_0         
	//*  41   87:getfield        #16  <Field zzcc zzly>
	//*  42   90:invokestatic    #31  <Method int zzcc.zza(zzcc)>
	//*  43   93:iconst_4        
	//*  44   94:icmplt          104
			zzle.onStop();
	//   45   97:aload_0         
	//   46   98:getfield        #18  <Field LifecycleCallback zzle>
	//   47  101:invokevirtual   #56  <Method void LifecycleCallback.onStop()>
		if(zzcc.zza(zzly) >= 5)
	//*  48  104:aload_0         
	//*  49  105:getfield        #16  <Field zzcc zzly>
	//*  50  108:invokestatic    #31  <Method int zzcc.zza(zzcc)>
	//*  51  111:iconst_5        
	//*  52  112:icmplt          122
			zzle.onDestroy();
	//   53  115:aload_0         
	//   54  116:getfield        #18  <Field LifecycleCallback zzle>
	//   55  119:invokevirtual   #59  <Method void LifecycleCallback.onDestroy()>
	//   56  122:return          
	}

	private final LifecycleCallback zzle;
	private final String zzlf;
	private final zzcc zzly;
}
