// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//			zzaav

final class zzaav$zzb extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #25  <Field int Message.what>
		{
	//*   2    4:lookupswitch    2: default 32
	//	               1: 35
	//	               2: 50
	//*   3   32:goto            58
		case 1: // '\001'
			((zzaav$zza)message.obj).zzc(zzaCl);
	//    4   35:aload_1         
	//    5   36:getfield        #29  <Field Object Message.obj>
	//    6   39:checkcast       #31  <Class zzaav$zza>
	//    7   42:aload_0         
	//    8   43:getfield        #13  <Field zzaav zzaCl>
	//    9   46:invokevirtual   #35  <Method void zzaav$zza.zzc(zzaav)>
			return;
	//   10   49:return          

		case 2: // '\002'
			throw (RuntimeException)message.obj;
	//   11   50:aload_1         
	//   12   51:getfield        #29  <Field Object Message.obj>
	//   13   54:checkcast       #37  <Class RuntimeException>
	//   14   57:athrow          
		}
		int i = message.what;
	//   15   58:aload_1         
	//   16   59:getfield        #25  <Field int Message.what>
	//   17   62:istore_2        
		Log.w("GACStateManager", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
	//   18   63:ldc1            #39  <String "GACStateManager">
	//   19   65:new             #41  <Class StringBuilder>
	//   20   68:dup             
	//   21   69:bipush          31
	//   22   71:invokespecial   #44  <Method void StringBuilder(int)>
	//   23   74:ldc1            #46  <String "Unknown message id: ">
	//   24   76:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   25   79:iload_2         
	//   26   80:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
	//   27   83:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   28   86:invokestatic    #63  <Method int Log.w(String, String)>
	//   29   89:pop             
	//   30   90:return          
	}

	final zzaav zzaCl;

	zzaav$zzb(zzaav zzaav1, Looper looper)
	{
		zzaCl = zzaav1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzaav zzaCl>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
