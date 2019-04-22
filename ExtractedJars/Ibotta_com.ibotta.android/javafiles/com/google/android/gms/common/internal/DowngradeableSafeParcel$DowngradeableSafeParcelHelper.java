// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//			DowngradeableSafeParcel

public static final class DowngradeableSafeParcel$DowngradeableSafeParcelHelper
{

	public static Bundle getExtras(Intent intent, Context context, Integer integer)
	{
		synchronized(DowngradeableSafeParcel.zzcs())
	//*   0    0:invokestatic    #18  <Method Object DowngradeableSafeParcel.zzcs()>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
		{
			intent = ((Intent) (DowngradeableSafeParcel.getExtras(intent, context, integer)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokestatic    #20  <Method Bundle DowngradeableSafeParcel.getExtras(Intent, Context, Integer)>
	//    8   12:astore_0        
		}
	//    9   13:aload_3         
	//   10   14:monitorexit     
		return ((Bundle) (intent));
	//   11   15:aload_0         
	//   12   16:areturn         
		intent;
	//   13   17:astore_0        
		obj;
	//   14   18:aload_3         
		JVM INSTR monitorexit ;
	//   15   19:monitorexit     
		throw intent;
	//   16   20:aload_0         
	//   17   21:athrow          
	}

	public static Parcelable getParcelable(Intent intent, String s, Context context, Integer integer)
	{
		synchronized(DowngradeableSafeParcel.zzcs())
	//*   0    0:invokestatic    #18  <Method Object DowngradeableSafeParcel.zzcs()>
	//*   1    3:astore          4
	//*   2    5:aload           4
	//*   3    7:monitorenter    
		{
			intent = ((Intent) (DowngradeableSafeParcel.getParcelable(intent, s, context, integer)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #24  <Method Parcelable DowngradeableSafeParcel.getParcelable(Intent, String, Context, Integer)>
	//    9   15:astore_0        
		}
	//   10   16:aload           4
	//   11   18:monitorexit     
		return ((Parcelable) (intent));
	//   12   19:aload_0         
	//   13   20:areturn         
		intent;
	//   14   21:astore_0        
		obj;
	//   15   22:aload           4
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		throw intent;
	//   17   25:aload_0         
	//   18   26:athrow          
	}

	public static Parcelable getParcelable(Bundle bundle, String s, Context context, Integer integer)
	{
		synchronized(DowngradeableSafeParcel.zzcs())
	//*   0    0:invokestatic    #18  <Method Object DowngradeableSafeParcel.zzcs()>
	//*   1    3:astore          4
	//*   2    5:aload           4
	//*   3    7:monitorenter    
		{
			bundle = ((Bundle) (DowngradeableSafeParcel.getParcelable(bundle, s, context, integer)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #29  <Method Parcelable DowngradeableSafeParcel.getParcelable(Bundle, String, Context, Integer)>
	//    9   15:astore_0        
		}
	//   10   16:aload           4
	//   11   18:monitorexit     
		return ((Parcelable) (bundle));
	//   12   19:aload_0         
	//   13   20:areturn         
		bundle;
	//   14   21:astore_0        
		obj;
	//   15   22:aload           4
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		throw bundle;
	//   17   25:aload_0         
	//   18   26:athrow          
	}

	public static boolean putParcelable(Bundle bundle, String s, DowngradeableSafeParcel downgradeablesafeparcel, Context context, Integer integer)
	{
		return DowngradeableSafeParcel.putParcelable(bundle, s, downgradeablesafeparcel, context, integer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #34  <Method boolean DowngradeableSafeParcel.putParcelable(Bundle, String, DowngradeableSafeParcel, Context, Integer)>
	//    6    9:ireturn         
	}

	public DowngradeableSafeParcel$DowngradeableSafeParcelHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
