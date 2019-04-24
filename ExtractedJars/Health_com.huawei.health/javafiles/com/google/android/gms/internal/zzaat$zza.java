// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//			zzaat

final class zzaat$zza extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #25  <Field int Message.what>
		{
	//*   2    4:lookupswitch    2: default 32
	//	               1: 35
	//	               2: 43
	//*   3   32:goto            51
		case 1: // '\001'
			zzaat.zzb(zzaBY);
	//    4   35:aload_0         
	//    5   36:getfield        #13  <Field zzaat zzaBY>
	//    6   39:invokestatic    #29  <Method void zzaat.zzb(zzaat)>
			return;
	//    7   42:return          

		case 2: // '\002'
			zzaat.zza(zzaBY);
	//    8   43:aload_0         
	//    9   44:getfield        #13  <Field zzaat zzaBY>
	//   10   47:invokestatic    #31  <Method void zzaat.zza(zzaat)>
			return;
	//   11   50:return          
		}
		int i = message.what;
	//   12   51:aload_1         
	//   13   52:getfield        #25  <Field int Message.what>
	//   14   55:istore_2        
		Log.w("GoogleApiClientImpl", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
	//   15   56:ldc1            #33  <String "GoogleApiClientImpl">
	//   16   58:new             #35  <Class StringBuilder>
	//   17   61:dup             
	//   18   62:bipush          31
	//   19   64:invokespecial   #38  <Method void StringBuilder(int)>
	//   20   67:ldc1            #40  <String "Unknown message id: ">
	//   21   69:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   22   72:iload_2         
	//   23   73:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//   24   76:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   25   79:invokestatic    #57  <Method int Log.w(String, String)>
	//   26   82:pop             
	//   27   83:return          
	}

	final zzaat zzaBY;

	zzaat$zza(zzaat zzaat1, Looper looper)
	{
		zzaBY = zzaat1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzaat zzaBY>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
