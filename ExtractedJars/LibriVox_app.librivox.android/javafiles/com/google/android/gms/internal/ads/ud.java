// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			tp, aag

public final class ud
	implements b
{

	public ud(tp tp1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = tp1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field tp a>
	//    5    9:return          
	}

	public final String a()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field tp a>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		try
		{
			obj = ((Object) (((tp) (obj)).a()));
	//    7   11:aload_1         
	//    8   12:invokeinterface #24  <Method String tp.a()>
	//    9   17:astore_1        
		}
	//*  10   18:aload_1         
	//*  11   19:areturn         
		catch(RemoteException remoteexception)
	//*  12   20:astore_1        
		{
			aag.c("Could not forward getType to RewardItem", ((Throwable) (remoteexception)));
	//   13   21:ldc1            #26  <String "Could not forward getType to RewardItem">
	//   14   23:aload_1         
	//   15   24:invokestatic    #32  <Method void aag.c(String, Throwable)>
			return null;
	//   16   27:aconst_null     
	//   17   28:areturn         
		}
		return ((String) (obj));
	}

	public final int b()
	{
		tp tp1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field tp a>
	//    2    4:astore_2        
		if(tp1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		int i;
		try
		{
			i = tp1.b();
	//    7   11:aload_2         
	//    8   12:invokeinterface #36  <Method int com.google.android.gms.internal.ads.tp.b()>
	//    9   17:istore_1        
		}
	//*  10   18:iload_1         
	//*  11   19:ireturn         
		catch(RemoteException remoteexception)
	//*  12   20:astore_2        
		{
			aag.c("Could not forward getAmount to RewardItem", ((Throwable) (remoteexception)));
	//   13   21:ldc1            #38  <String "Could not forward getAmount to RewardItem">
	//   14   23:aload_2         
	//   15   24:invokestatic    #32  <Method void aag.c(String, Throwable)>
			return 0;
	//   16   27:iconst_0        
	//   17   28:ireturn         
		}
		return i;
	}

	private final tp a;
}
