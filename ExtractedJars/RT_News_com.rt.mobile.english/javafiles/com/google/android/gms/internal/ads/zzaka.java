// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajx, zzakb, zzamy

final class zzaka extends zzajx
{

	zzaka(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzajx()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Context mContext>
	//    5    9:return          
	}

	public final void onStop()
	{
	//    0    0:return          
	}

	public final void zzdn()
	{
		boolean flag;
		try
		{
			flag = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context mContext>
	//    2    4:invokestatic    #30  <Method boolean AdvertisingIdClient.getIsAdIdFakeForDebugLogging(Context)>
	//    3    7:istore_1        
		}
	//*   4    8:goto            20
		catch(Object obj)
	//*   5   11:astore_2        
		{
			zzakb.zzb("Fail to get isAdIdFakeForDebugLogging", ((Throwable) (obj)));
	//    6   12:ldc1            #32  <String "Fail to get isAdIdFakeForDebugLogging">
	//    7   14:aload_2         
	//    8   15:invokestatic    #38  <Method void zzakb.zzb(String, Throwable)>
			flag = false;
	//    9   18:iconst_0        
	//   10   19:istore_1        
		}
		zzamy.zzaf(flag);
	//   11   20:iload_1         
	//   12   21:invokestatic    #44  <Method void zzamy.zzaf(boolean)>
		StringBuilder stringbuilder = new StringBuilder(43);
	//   13   24:new             #46  <Class StringBuilder>
	//   14   27:dup             
	//   15   28:bipush          43
	//   16   30:invokespecial   #49  <Method void StringBuilder(int)>
	//   17   33:astore_2        
		stringbuilder.append("Update ad debug logging enablement as ");
	//   18   34:aload_2         
	//   19   35:ldc1            #51  <String "Update ad debug logging enablement as ">
	//   20   37:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(flag);
	//   22   41:aload_2         
	//   23   42:iload_1         
	//   24   43:invokevirtual   #58  <Method StringBuilder StringBuilder.append(boolean)>
	//   25   46:pop             
		zzakb.zzdk(stringbuilder.toString());
	//   26   47:aload_2         
	//   27   48:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   28   51:invokestatic    #66  <Method void zzakb.zzdk(String)>
	//   29   54:return          
	}

	private Context mContext;
}
