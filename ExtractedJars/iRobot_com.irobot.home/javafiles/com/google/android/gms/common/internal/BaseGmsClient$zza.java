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
	//    1    1:checkcast       #20  <Class Boolean>
	//    2    4:astore_3        
		obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_1        
		if(boolean1 == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       21
		{
			BaseGmsClient.zza(zzcs, 1, ((android.os.IInterface) (null)));
	//    7   11:aload_0         
	//    8   12:getfield        #18  <Field BaseGmsClient zzcs>
	//    9   15:iconst_1        
	//   10   16:aconst_null     
	//   11   17:invokestatic    #37  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
			return;
	//   12   20:return          
		}
		int i = statusCode;
	//   13   21:aload_0         
	//   14   22:getfield        #29  <Field int statusCode>
	//   15   25:istore_2        
		if(i != 0)
	//*  16   26:iload_2         
	//*  17   27:ifeq            138
			if(i != 10)
	//*  18   30:iload_2         
	//*  19   31:bipush          10
	//*  20   33:icmpeq          82
			{
				BaseGmsClient.zza(zzcs, 1, ((android.os.IInterface) (null)));
	//   21   36:aload_0         
	//   22   37:getfield        #18  <Field BaseGmsClient zzcs>
	//   23   40:iconst_1        
	//   24   41:aconst_null     
	//   25   42:invokestatic    #37  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
				if(zzcr != null)
	//*  26   45:aload_0         
	//*  27   46:getfield        #31  <Field Bundle zzcr>
	//*  28   49:ifnull          65
					obj = ((Object) ((PendingIntent)zzcr.getParcelable("pendingIntent")));
	//   29   52:aload_0         
	//   30   53:getfield        #31  <Field Bundle zzcr>
	//   31   56:ldc1            #39  <String "pendingIntent">
	//   32   58:invokevirtual   #45  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   33   61:checkcast       #47  <Class PendingIntent>
	//   34   64:astore_1        
				zza(new ConnectionResult(statusCode, ((PendingIntent) (obj))));
	//   35   65:aload_0         
	//   36   66:new             #49  <Class ConnectionResult>
	//   37   69:dup             
	//   38   70:aload_0         
	//   39   71:getfield        #29  <Field int statusCode>
	//   40   74:aload_1         
	//   41   75:invokespecial   #52  <Method void ConnectionResult(int, PendingIntent)>
	//   42   78:invokevirtual   #54  <Method void zza(ConnectionResult)>
				return;
	//   43   81:return          
			} else
			{
				BaseGmsClient.zza(zzcs, 1, ((android.os.IInterface) (null)));
	//   44   82:aload_0         
	//   45   83:getfield        #18  <Field BaseGmsClient zzcs>
	//   46   86:iconst_1        
	//   47   87:aconst_null     
	//   48   88:invokestatic    #37  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
				throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[] {
					((Object)this).getClass().getSimpleName(), zzcs.getStartServiceAction(), zzcs.getServiceDescriptor()
				}));
	//   49   91:new             #56  <Class IllegalStateException>
	//   50   94:dup             
	//   51   95:ldc1            #58  <String "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ">
	//   52   97:iconst_3        
	//   53   98:anewarray       Object[]
	//   54  101:dup             
	//   55  102:iconst_0        
	//   56  103:aload_0         
	//   57  104:invokevirtual   #64  <Method Class Object.getClass()>
	//   58  107:invokevirtual   #70  <Method String Class.getSimpleName()>
	//   59  110:aastore         
	//   60  111:dup             
	//   61  112:iconst_1        
	//   62  113:aload_0         
	//   63  114:getfield        #18  <Field BaseGmsClient zzcs>
	//   64  117:invokevirtual   #73  <Method String BaseGmsClient.getStartServiceAction()>
	//   65  120:aastore         
	//   66  121:dup             
	//   67  122:iconst_2        
	//   68  123:aload_0         
	//   69  124:getfield        #18  <Field BaseGmsClient zzcs>
	//   70  127:invokevirtual   #76  <Method String BaseGmsClient.getServiceDescriptor()>
	//   71  130:aastore         
	//   72  131:invokestatic    #82  <Method String String.format(String, Object[])>
	//   73  134:invokespecial   #85  <Method void IllegalStateException(String)>
	//   74  137:athrow          
			}
		if(!zzm())
	//*  75  138:aload_0         
	//*  76  139:invokevirtual   #89  <Method boolean zzm()>
	//*  77  142:ifne            168
		{
			BaseGmsClient.zza(zzcs, 1, ((android.os.IInterface) (null)));
	//   78  145:aload_0         
	//   79  146:getfield        #18  <Field BaseGmsClient zzcs>
	//   80  149:iconst_1        
	//   81  150:aconst_null     
	//   82  151:invokestatic    #37  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
			zza(new ConnectionResult(8, ((PendingIntent) (null))));
	//   83  154:aload_0         
	//   84  155:new             #49  <Class ConnectionResult>
	//   85  158:dup             
	//   86  159:bipush          8
	//   87  161:aconst_null     
	//   88  162:invokespecial   #52  <Method void ConnectionResult(int, PendingIntent)>
	//   89  165:invokevirtual   #54  <Method void zza(ConnectionResult)>
		}
	//   90  168:return          
	}

	protected abstract boolean zzm();

	protected final void zzn()
	{
	//    0    0:return          
	}

	private final int statusCode;
	private final Bundle zzcr;
	private final BaseGmsClient zzcs;

	protected BaseGmsClient$zza(BaseGmsClient basegmsclient, int i, Bundle bundle)
	{
		zzcs = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field BaseGmsClient zzcs>
		super(basegmsclient, ((Object) (Boolean.valueOf(true))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:invokestatic    #24  <Method Boolean Boolean.valueOf(boolean)>
	//    7   11:invokespecial   #27  <Method void BaseGmsClient$zzc(BaseGmsClient, Object)>
		statusCode = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #29  <Field int statusCode>
		zzcr = bundle;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #31  <Field Bundle zzcr>
	//   14   24:return          
	}
}
