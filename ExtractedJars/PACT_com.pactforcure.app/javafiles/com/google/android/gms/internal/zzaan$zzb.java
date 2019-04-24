// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//			zzaan

final class zzaan$zzb extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #25  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 61
	//	               2 76
		default:
			int i = message.what;
	//    3   28:aload_1         
	//    4   29:getfield        #25  <Field int Message.what>
	//    5   32:istore_2        
			Log.w("GACStateManager", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
	//    6   33:ldc1            #27  <String "GACStateManager">
	//    7   35:new             #29  <Class StringBuilder>
	//    8   38:dup             
	//    9   39:bipush          31
	//   10   41:invokespecial   #32  <Method void StringBuilder(int)>
	//   11   44:ldc1            #34  <String "Unknown message id: ">
	//   12   46:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   13   49:iload_2         
	//   14   50:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   15   53:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   16   56:invokestatic    #51  <Method int Log.w(String, String)>
	//   17   59:pop             
			return;
	//   18   60:return          

		case 1: // '\001'
			((zzaan$zza)message.obj).zzc(zzaAM);
	//   19   61:aload_1         
	//   20   62:getfield        #55  <Field Object Message.obj>
	//   21   65:checkcast       #57  <Class zzaan$zza>
	//   22   68:aload_0         
	//   23   69:getfield        #13  <Field zzaan zzaAM>
	//   24   72:invokevirtual   #61  <Method void zzaan$zza.zzc(zzaan)>
			return;
	//   25   75:return          

		case 2: // '\002'
			throw (RuntimeException)message.obj;
	//   26   76:aload_1         
	//   27   77:getfield        #55  <Field Object Message.obj>
	//   28   80:checkcast       #63  <Class RuntimeException>
	//   29   83:athrow          
		}
	}

	final zzaan zzaAM;

	zzaan$zzb(zzaan zzaan1, Looper looper)
	{
		zzaAM = zzaan1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzaan zzaAM>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
