// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzagu, zzane

public final class zzahh
	implements RewardItem
{

	public zzahh(zzagu zzagu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzcli = zzagu1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field zzagu zzcli>
	//    5    9:return          
	}

	public final int getAmount()
	{
		if(zzcli == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field zzagu zzcli>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i;
		try
		{
			i = zzcli.getAmount();
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field zzagu zzcli>
	//    7   13:invokeinterface #25  <Method int zzagu.getAmount()>
	//    8   18:istore_1        
		}
	//*   9   19:iload_1         
	//*  10   20:ireturn         
		catch(RemoteException remoteexception)
	//*  11   21:astore_2        
		{
			zzane.zzc("Could not forward getAmount to RewardItem", ((Throwable) (remoteexception)));
	//   12   22:ldc1            #27  <String "Could not forward getAmount to RewardItem">
	//   13   24:aload_2         
	//   14   25:invokestatic    #33  <Method void zzane.zzc(String, Throwable)>
			return 0;
	//   15   28:iconst_0        
	//   16   29:ireturn         
		}
		return i;
	}

	public final String getType()
	{
		if(zzcli == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field zzagu zzcli>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		String s;
		try
		{
			s = zzcli.getType();
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field zzagu zzcli>
	//    7   13:invokeinterface #37  <Method String zzagu.getType()>
	//    8   18:astore_1        
		}
	//*   9   19:aload_1         
	//*  10   20:areturn         
		catch(RemoteException remoteexception)
	//*  11   21:astore_1        
		{
			zzane.zzc("Could not forward getType to RewardItem", ((Throwable) (remoteexception)));
	//   12   22:ldc1            #39  <String "Could not forward getType to RewardItem">
	//   13   24:aload_1         
	//   14   25:invokestatic    #33  <Method void zzane.zzc(String, Throwable)>
			return null;
	//   15   28:aconst_null     
	//   16   29:areturn         
		}
		return s;
	}

	private final zzagu zzcli;
}
