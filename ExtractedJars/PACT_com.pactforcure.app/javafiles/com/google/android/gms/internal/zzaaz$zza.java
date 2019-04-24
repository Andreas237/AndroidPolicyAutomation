// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaz

private final class zzaaz$zza extends Handler
{

	public void handleMessage(Message message)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(message.what != 1)
	//*   2    2:aload_1         
	//*   3    3:getfield        #25  <Field int Message.what>
	//*   4    6:iconst_1        
	//*   5    7:icmpne          29
	//*   6   10:iload_2         
	//*   7   11:invokestatic    #31  <Method void zzac.zzas(boolean)>
	//*   8   14:aload_0         
	//*   9   15:getfield        #13  <Field zzaaz zzaBA>
	//*  10   18:aload_1         
	//*  11   19:getfield        #35  <Field Object Message.obj>
	//*  12   22:checkcast       #37  <Class zzaaz$zzc>
	//*  13   25:invokevirtual   #41  <Method void zzaaz.zzb(zzaaz$zzc)>
	//*  14   28:return          
			flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_2        
		zzac.zzas(flag);
		zzaBA.zzb((zzaaz$zzc)message.obj);
	//*  17   31:goto            10
	}

	final zzaaz zzaBA;

	public zzaaz$zza(zzaaz zzaaz1, Looper looper)
	{
		zzaBA = zzaaz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzaaz zzaBA>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
