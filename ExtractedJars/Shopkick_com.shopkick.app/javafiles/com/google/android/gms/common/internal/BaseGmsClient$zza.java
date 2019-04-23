// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

private abstract class BaseGmsClient$zza extends BaseGmsClient$zzc
{

	protected abstract void zza(ConnectionResult connectionresult);

	protected final void zza(Object obj)
	{
		Boolean boolean1 = (Boolean)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class Boolean>
	//    2    4:astore_3        
		obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_1        
		if(boolean1 == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       21
		{
			BaseGmsClient.zza(zzct, 1, ((android.os.IInterface) (null)));
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field BaseGmsClient zzct>
	//    9   15:iconst_1        
	//   10   16:aconst_null     
	//   11   17:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
			return;
	//   12   20:return          
		}
		int i = statusCode;
	//   13   21:aload_0         
	//   14   22:getfield        #30  <Field int statusCode>
	//   15   25:istore_2        
		if(i != 0)
	//*  16   26:iload_2         
	//*  17   27:ifeq            137
			if(i != 10)
	//*  18   30:iload_2         
	//*  19   31:bipush          10
	//*  20   33:icmpeq          81
			{
				BaseGmsClient.zza(zzct, 1, ((android.os.IInterface) (null)));
	//   21   36:aload_0         
	//   22   37:getfield        #19  <Field BaseGmsClient zzct>
	//   23   40:iconst_1        
	//   24   41:aconst_null     
	//   25   42:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
				Bundle bundle = zzcs;
	//   26   45:aload_0         
	//   27   46:getfield        #32  <Field Bundle zzcs>
	//   28   49:astore_3        
				if(bundle != null)
	//*  29   50:aload_3         
	//*  30   51:ifnull          64
					obj = ((Object) ((PendingIntent)bundle.getParcelable("pendingIntent")));
	//   31   54:aload_3         
	//   32   55:ldc1            #41  <String "pendingIntent">
	//   33   57:invokevirtual   #47  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   34   60:checkcast       #49  <Class PendingIntent>
	//   35   63:astore_1        
				zza(new ConnectionResult(statusCode, ((PendingIntent) (obj))));
	//   36   64:aload_0         
	//   37   65:new             #51  <Class ConnectionResult>
	//   38   68:dup             
	//   39   69:aload_0         
	//   40   70:getfield        #30  <Field int statusCode>
	//   41   73:aload_1         
	//   42   74:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
	//   43   77:invokevirtual   #56  <Method void zza(ConnectionResult)>
				return;
	//   44   80:return          
			} else
			{
				BaseGmsClient.zza(zzct, 1, ((android.os.IInterface) (null)));
	//   45   81:aload_0         
	//   46   82:getfield        #19  <Field BaseGmsClient zzct>
	//   47   85:iconst_1        
	//   48   86:aconst_null     
	//   49   87:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
				throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[] {
					((Object)this).getClass().getSimpleName(), zzct.getStartServiceAction(), zzct.getServiceDescriptor()
				}));
	//   50   90:new             #58  <Class IllegalStateException>
	//   51   93:dup             
	//   52   94:ldc1            #60  <String "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ">
	//   53   96:iconst_3        
	//   54   97:anewarray       Object[]
	//   55  100:dup             
	//   56  101:iconst_0        
	//   57  102:aload_0         
	//   58  103:invokevirtual   #66  <Method Class Object.getClass()>
	//   59  106:invokevirtual   #72  <Method String Class.getSimpleName()>
	//   60  109:aastore         
	//   61  110:dup             
	//   62  111:iconst_1        
	//   63  112:aload_0         
	//   64  113:getfield        #19  <Field BaseGmsClient zzct>
	//   65  116:invokevirtual   #75  <Method String BaseGmsClient.getStartServiceAction()>
	//   66  119:aastore         
	//   67  120:dup             
	//   68  121:iconst_2        
	//   69  122:aload_0         
	//   70  123:getfield        #19  <Field BaseGmsClient zzct>
	//   71  126:invokevirtual   #78  <Method String BaseGmsClient.getServiceDescriptor()>
	//   72  129:aastore         
	//   73  130:invokestatic    #84  <Method String String.format(String, Object[])>
	//   74  133:invokespecial   #87  <Method void IllegalStateException(String)>
	//   75  136:athrow          
			}
		if(!zzm())
	//*  76  137:aload_0         
	//*  77  138:invokevirtual   #91  <Method boolean zzm()>
	//*  78  141:ifne            168
		{
			BaseGmsClient.zza(zzct, 1, ((android.os.IInterface) (null)));
	//   79  144:aload_0         
	//   80  145:getfield        #19  <Field BaseGmsClient zzct>
	//   81  148:iconst_1        
	//   82  149:aconst_null     
	//   83  150:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
			zza(new ConnectionResult(8, ((PendingIntent) (null))));
	//   84  153:aload_0         
	//   85  154:new             #51  <Class ConnectionResult>
	//   86  157:dup             
	//   87  158:bipush          8
	//   88  160:aconst_null     
	//   89  161:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
	//   90  164:invokevirtual   #56  <Method void zza(ConnectionResult)>
			return;
	//   91  167:return          
		} else
		{
			return;
	//   92  168:return          
		}
	}

	protected abstract boolean zzm();

	protected final void zzn()
	{
	//    0    0:return          
	}

	private final int statusCode;
	private final Bundle zzcs;
	private final BaseGmsClient zzct;

	protected BaseGmsClient$zza(BaseGmsClient basegmsclient, int i, Bundle bundle)
	{
		zzct = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BaseGmsClient zzct>
		super(basegmsclient, ((Object) (Boolean.valueOf(true))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:invokestatic    #25  <Method Boolean Boolean.valueOf(boolean)>
	//    7   11:invokespecial   #28  <Method void BaseGmsClient$zzc(BaseGmsClient, Object)>
		statusCode = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #30  <Field int statusCode>
		zzcs = bundle;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #32  <Field Bundle zzcs>
	//   14   24:return          
	}
}
