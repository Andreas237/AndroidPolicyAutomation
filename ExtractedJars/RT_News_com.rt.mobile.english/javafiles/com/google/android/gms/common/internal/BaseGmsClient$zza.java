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
	//*  14   22:ifeq            98
			if(i != 10)
	//*  15   25:iload_2         
	//*  16   26:bipush          10
	//*  17   28:icmpeq          79
			{
				BaseGmsClient.zza(zzru, 1, ((android.os.IInterface) (null)));
	//   18   31:aload_0         
	//   19   32:getfield        #19  <Field BaseGmsClient zzru>
	//   20   35:iconst_1        
	//   21   36:aconst_null     
	//   22   37:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
				boolean1 = ((Boolean) (obj));
	//   23   40:aload_3         
	//   24   41:astore_1        
				if(resolution != null)
	//*  25   42:aload_0         
	//*  26   43:getfield        #32  <Field Bundle resolution>
	//*  27   46:ifnull          62
					boolean1 = ((Boolean) ((PendingIntent)resolution.getParcelable("pendingIntent")));
	//   28   49:aload_0         
	//   29   50:getfield        #32  <Field Bundle resolution>
	//   30   53:ldc1            #41  <String "pendingIntent">
	//   31   55:invokevirtual   #47  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   32   58:checkcast       #49  <Class PendingIntent>
	//   33   61:astore_1        
				handleServiceFailure(new ConnectionResult(statusCode, ((PendingIntent) (boolean1))));
	//   34   62:aload_0         
	//   35   63:new             #51  <Class ConnectionResult>
	//   36   66:dup             
	//   37   67:aload_0         
	//   38   68:getfield        #30  <Field int statusCode>
	//   39   71:aload_1         
	//   40   72:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
	//   41   75:invokevirtual   #58  <Method void handleServiceFailure(ConnectionResult)>
				return;
	//   42   78:return          
			} else
			{
				BaseGmsClient.zza(zzru, 1, ((android.os.IInterface) (null)));
	//   43   79:aload_0         
	//   44   80:getfield        #19  <Field BaseGmsClient zzru>
	//   45   83:iconst_1        
	//   46   84:aconst_null     
	//   47   85:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
				throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
	//   48   88:new             #60  <Class IllegalStateException>
	//   49   91:dup             
	//   50   92:ldc1            #62  <String "A fatal developer error has occurred. Check the logs for further information.">
	//   51   94:invokespecial   #65  <Method void IllegalStateException(String)>
	//   52   97:athrow          
			}
		if(!handleServiceSuccess())
	//*  53   98:aload_0         
	//*  54   99:invokevirtual   #69  <Method boolean handleServiceSuccess()>
	//*  55  102:ifne            128
		{
			BaseGmsClient.zza(zzru, 1, ((android.os.IInterface) (null)));
	//   56  105:aload_0         
	//   57  106:getfield        #19  <Field BaseGmsClient zzru>
	//   58  109:iconst_1        
	//   59  110:aconst_null     
	//   60  111:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
			handleServiceFailure(new ConnectionResult(8, ((PendingIntent) (null))));
	//   61  114:aload_0         
	//   62  115:new             #51  <Class ConnectionResult>
	//   63  118:dup             
	//   64  119:bipush          8
	//   65  121:aconst_null     
	//   66  122:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
	//   67  125:invokevirtual   #58  <Method void handleServiceFailure(ConnectionResult)>
		}
	//   68  128:return          
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
