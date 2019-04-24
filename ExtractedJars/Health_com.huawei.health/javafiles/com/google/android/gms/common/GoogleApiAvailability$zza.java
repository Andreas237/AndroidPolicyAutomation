// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Context;
import android.os.*;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common:
//			GoogleApiAvailability

class GoogleApiAvailability$zza extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #47  <Field int Message.what>
		{
	//*   2    4:lookupswitch    1: default 24
	//	               1: 27
	//*   3   24:goto            63
		case 1: // '\001'
			int i = zzayn.isGooglePlayServicesAvailable(zzwi);
	//    4   27:aload_0         
	//    5   28:getfield        #18  <Field GoogleApiAvailability zzayn>
	//    6   31:aload_0         
	//    7   32:getfield        #38  <Field Context zzwi>
	//    8   35:invokevirtual   #51  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
	//    9   38:istore_2        
			if(zzayn.isUserResolvableError(i))
	//*  10   39:aload_0         
	//*  11   40:getfield        #18  <Field GoogleApiAvailability zzayn>
	//*  12   43:iload_2         
	//*  13   44:invokevirtual   #55  <Method boolean GoogleApiAvailability.isUserResolvableError(int)>
	//*  14   47:ifeq            95
			{
				zzayn.showErrorNotification(zzwi, i);
	//   15   50:aload_0         
	//   16   51:getfield        #18  <Field GoogleApiAvailability zzayn>
	//   17   54:aload_0         
	//   18   55:getfield        #38  <Field Context zzwi>
	//   19   58:iload_2         
	//   20   59:invokevirtual   #59  <Method void GoogleApiAvailability.showErrorNotification(Context, int)>
				return;
	//   21   62:return          
			}
			break;

		default:
			int j = message.what;
	//   22   63:aload_1         
	//   23   64:getfield        #47  <Field int Message.what>
	//   24   67:istore_2        
			Log.w("GoogleApiAvailability", (new StringBuilder(50)).append("Don't know how to handle this message: ").append(j).toString());
	//   25   68:ldc1            #61  <String "GoogleApiAvailability">
	//   26   70:new             #63  <Class StringBuilder>
	//   27   73:dup             
	//   28   74:bipush          50
	//   29   76:invokespecial   #66  <Method void StringBuilder(int)>
	//   30   79:ldc1            #68  <String "Don't know how to handle this message: ">
	//   31   81:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   32   84:iload_2         
	//   33   85:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   34   88:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   35   91:invokestatic    #85  <Method int Log.w(String, String)>
	//   36   94:pop             
			break;
		}
	//   37   95:return          
	}

	final GoogleApiAvailability zzayn;
	private final Context zzwi;

	public GoogleApiAvailability$zza(GoogleApiAvailability googleapiavailability, Context context)
	{
		zzayn = googleapiavailability;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GoogleApiAvailability zzayn>
		if(Looper.myLooper() == null)
	//*   3    5:invokestatic    #24  <Method Looper Looper.myLooper()>
	//*   4    8:ifnonnull       18
			googleapiavailability = ((GoogleApiAvailability) (Looper.getMainLooper()));
	//    5   11:invokestatic    #27  <Method Looper Looper.getMainLooper()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            22
			googleapiavailability = ((GoogleApiAvailability) (Looper.myLooper()));
	//    8   18:invokestatic    #24  <Method Looper Looper.myLooper()>
	//    9   21:astore_1        
		super(((Looper) (googleapiavailability)));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #30  <Method void Handler(Looper)>
		zzwi = context.getApplicationContext();
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #36  <Method Context Context.getApplicationContext()>
	//   16   32:putfield        #38  <Field Context zzwi>
	//   17   35:return          
	}
}
