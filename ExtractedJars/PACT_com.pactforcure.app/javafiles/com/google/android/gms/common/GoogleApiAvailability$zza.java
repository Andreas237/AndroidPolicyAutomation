// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Context;
import android.os.*;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common:
//			GoogleApiAvailability

private class GoogleApiAvailability$zza extends Handler
{

	public void handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #47  <Field int Message.what>
		JVM INSTR tableswitch 1 1: default 24
	//	               1 57;
	//    2    4:tableswitch     1 1: default 24
	//	               1 57
		   goto _L1 _L2
_L1:
		int i = message.what;
	//    3   24:aload_1         
	//    4   25:getfield        #47  <Field int Message.what>
	//    5   28:istore_2        
		Log.w("GoogleApiAvailability", (new StringBuilder(50)).append("Don't know how to handle this message: ").append(i).toString());
	//    6   29:ldc1            #49  <String "GoogleApiAvailability">
	//    7   31:new             #51  <Class StringBuilder>
	//    8   34:dup             
	//    9   35:bipush          50
	//   10   37:invokespecial   #54  <Method void StringBuilder(int)>
	//   11   40:ldc1            #56  <String "Don't know how to handle this message: ">
	//   12   42:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   13   45:iload_2         
	//   14   46:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
	//   15   49:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   16   52:invokestatic    #73  <Method int Log.w(String, String)>
	//   17   55:pop             
_L4:
		return;
	//   18   56:return          
_L2:
		int j = zzaxb.isGooglePlayServicesAvailable(zzvZ);
	//   19   57:aload_0         
	//   20   58:getfield        #18  <Field GoogleApiAvailability zzaxb>
	//   21   61:aload_0         
	//   22   62:getfield        #38  <Field Context zzvZ>
	//   23   65:invokevirtual   #77  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
	//   24   68:istore_2        
		if(zzaxb.isUserResolvableError(j))
	//*  25   69:aload_0         
	//*  26   70:getfield        #18  <Field GoogleApiAvailability zzaxb>
	//*  27   73:iload_2         
	//*  28   74:invokevirtual   #81  <Method boolean GoogleApiAvailability.isUserResolvableError(int)>
	//*  29   77:ifeq            56
		{
			zzaxb.showErrorNotification(zzvZ, j);
	//   30   80:aload_0         
	//   31   81:getfield        #18  <Field GoogleApiAvailability zzaxb>
	//   32   84:aload_0         
	//   33   85:getfield        #38  <Field Context zzvZ>
	//   34   88:iload_2         
	//   35   89:invokevirtual   #85  <Method void GoogleApiAvailability.showErrorNotification(Context, int)>
			return;
	//   36   92:return          
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	final GoogleApiAvailability zzaxb;
	private final Context zzvZ;

	public GoogleApiAvailability$zza(GoogleApiAvailability googleapiavailability, Context context)
	{
		zzaxb = googleapiavailability;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GoogleApiAvailability zzaxb>
		if(Looper.myLooper() == null)
	//*   3    5:invokestatic    #24  <Method Looper Looper.myLooper()>
	//*   4    8:ifnonnull       29
			googleapiavailability = ((GoogleApiAvailability) (Looper.getMainLooper()));
	//    5   11:invokestatic    #27  <Method Looper Looper.getMainLooper()>
	//    6   14:astore_1        
		else
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokespecial   #30  <Method void Handler(Looper)>
	//*  10   20:aload_0         
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #36  <Method Context Context.getApplicationContext()>
	//*  13   25:putfield        #38  <Field Context zzvZ>
	//*  14   28:return          
			googleapiavailability = ((GoogleApiAvailability) (Looper.myLooper()));
	//   15   29:invokestatic    #24  <Method Looper Looper.myLooper()>
	//   16   32:astore_1        
		super(((Looper) (googleapiavailability)));
		zzvZ = context.getApplicationContext();
	//*  17   33:goto            15
	}
}
