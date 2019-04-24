// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.internal:
//			zzabh

final class zzabh$zza extends Handler
{

	public void handleMessage(Message message)
	{
		boolean flag;
		if(message.what == 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #25  <Field int Message.what>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		zzac.zzax(flag);
	//    9   15:iload_2         
	//   10   16:invokestatic    #31  <Method void zzac.zzax(boolean)>
		zzaCZ.zzb((zzabh$zzc)message.obj);
	//   11   19:aload_0         
	//   12   20:getfield        #13  <Field zzabh zzaCZ>
	//   13   23:aload_1         
	//   14   24:getfield        #35  <Field Object Message.obj>
	//   15   27:checkcast       #37  <Class zzabh$zzc>
	//   16   30:invokevirtual   #41  <Method void zzabh.zzb(zzabh$zzc)>
	//   17   33:return          
	}

	final zzabh zzaCZ;

	public zzabh$zza(zzabh zzabh1, Looper looper)
	{
		zzaCZ = zzabh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzabh zzaCZ>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
