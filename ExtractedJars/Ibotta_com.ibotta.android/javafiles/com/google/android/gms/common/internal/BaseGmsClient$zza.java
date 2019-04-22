// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

private abstract class BaseGmsClient$zza extends backProxy
{

	protected void deliverCallback(Boolean boolean1)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(boolean1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       16
		{
			BaseGmsClient.zza(zzru, 1, ((android.os.IInterface) (null)));
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field BaseGmsClient zzru>
	//    6   10:iconst_1        
	//    7   11:aconst_null     
	//    8   12:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
			return;
	//    9   15:return          
		}
		int i = statusCode;
	//   10   16:aload_0         
	//   11   17:getfield        #30  <Field int statusCode>
	//   12   20:istore_2        
		if(i != 0)
	//*  13   21:iload_2         
	//*  14   22:ifeq            100
			if(i != 10)
	//*  15   25:iload_2         
	//*  16   26:bipush          10
	//*  17   28:icmpeq          81
			{
				BaseGmsClient.zza(zzru, 1, ((android.os.IInterface) (null)));
	//   18   31:aload_0         
	//   19   32:getfield        #19  <Field BaseGmsClient zzru>
	//   20   35:iconst_1        
	//   21   36:aconst_null     
	//   22   37:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
				Bundle bundle = resolution;
	//   23   40:aload_0         
	//   24   41:getfield        #32  <Field Bundle resolution>
	//   25   44:astore          4
				boolean1 = ((Boolean) (obj));
	//   26   46:aload_3         
	//   27   47:astore_1        
				if(bundle != null)
	//*  28   48:aload           4
	//*  29   50:ifnull          64
					boolean1 = ((Boolean) ((PendingIntent)bundle.getParcelable("pendingIntent")));
	//   30   53:aload           4
	//   31   55:ldc1            #41  <String "pendingIntent">
	//   32   57:invokevirtual   #47  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   33   60:checkcast       #49  <Class PendingIntent>
	//   34   63:astore_1        
				handleServiceFailure(new ConnectionResult(statusCode, ((PendingIntent) (boolean1))));
	//   35   64:aload_0         
	//   36   65:new             #51  <Class ConnectionResult>
	//   37   68:dup             
	//   38   69:aload_0         
	//   39   70:getfield        #30  <Field int statusCode>
	//   40   73:aload_1         
	//   41   74:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
	//   42   77:invokevirtual   #58  <Method void handleServiceFailure(ConnectionResult)>
				return;
	//   43   80:return          
			} else
			{
				BaseGmsClient.zza(zzru, 1, ((android.os.IInterface) (null)));
	//   44   81:aload_0         
	//   45   82:getfield        #19  <Field BaseGmsClient zzru>
	//   46   85:iconst_1        
	//   47   86:aconst_null     
	//   48   87:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
				throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
	//   49   90:new             #60  <Class IllegalStateException>
	//   50   93:dup             
	//   51   94:ldc1            #62  <String "A fatal developer error has occurred. Check the logs for further information.">
	//   52   96:invokespecial   #65  <Method void IllegalStateException(String)>
	//   53   99:athrow          
			}
		if(!handleServiceSuccess())
	//*  54  100:aload_0         
	//*  55  101:invokevirtual   #69  <Method boolean handleServiceSuccess()>
	//*  56  104:ifne            130
		{
			BaseGmsClient.zza(zzru, 1, ((android.os.IInterface) (null)));
	//   57  107:aload_0         
	//   58  108:getfield        #19  <Field BaseGmsClient zzru>
	//   59  111:iconst_1        
	//   60  112:aconst_null     
	//   61  113:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
			handleServiceFailure(new ConnectionResult(8, ((PendingIntent) (null))));
	//   62  116:aload_0         
	//   63  117:new             #51  <Class ConnectionResult>
	//   64  120:dup             
	//   65  121:bipush          8
	//   66  123:aconst_null     
	//   67  124:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
	//   68  127:invokevirtual   #58  <Method void handleServiceFailure(ConnectionResult)>
		}
	//   69  130:return          
	}

	protected volatile void deliverCallback(Object obj)
	{
		deliverCallback((Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Boolean>
	//    3    5:invokevirtual   #72  <Method void deliverCallback(Boolean)>
	//    4    8:return          
	}

	protected abstract void handleServiceFailure(ConnectionResult connectionresult);

	protected abstract boolean handleServiceSuccess();

	protected void onDeliverCallbackFailed()
	{
	//    0    0:return          
	}

	public final Bundle resolution;
	public final int statusCode;
	private final BaseGmsClient zzru;

	protected BaseGmsClient$zza(BaseGmsClient basegmsclient, int i, Bundle bundle)
	{
		zzru = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BaseGmsClient zzru>
		super(basegmsclient, ((Object) (Boolean.valueOf(true))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:invokestatic    #25  <Method Boolean Boolean.valueOf(boolean)>
	//    7   11:invokespecial   #28  <Method void BaseGmsClient$CallbackProxy(BaseGmsClient, Object)>
		statusCode = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #30  <Field int statusCode>
		resolution = bundle;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #32  <Field Bundle resolution>
	//   14   24:return          
	}
}
