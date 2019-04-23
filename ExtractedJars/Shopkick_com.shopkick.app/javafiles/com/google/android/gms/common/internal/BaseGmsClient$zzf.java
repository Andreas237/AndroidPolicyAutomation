// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

protected final class BaseGmsClient$zzf extends BaseGmsClient$zza
{

	protected final void zza(ConnectionResult connectionresult)
	{
		if(BaseGmsClient.zzg(zzct) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field BaseGmsClient zzct>
	//*   2    4:invokestatic    #30  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//*   3    7:ifnull          23
			BaseGmsClient.zzg(zzct).onConnectionFailed(connectionresult);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field BaseGmsClient zzct>
	//    6   14:invokestatic    #30  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//    7   17:aload_1         
	//    8   18:invokeinterface #35  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
		zzct.onConnectionFailed(connectionresult);
	//    9   23:aload_0         
	//   10   24:getfield        #17  <Field BaseGmsClient zzct>
	//   11   27:aload_1         
	//   12   28:invokevirtual   #36  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
	//   13   31:return          
	}

	protected final boolean zzm()
	{
		RemoteException remoteexception;
		Object obj;
		try
		{
			obj = ((Object) (zzcy.getInterfaceDescriptor()));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field IBinder zzcy>
	//    2    4:invokeinterface #46  <Method String IBinder.getInterfaceDescriptor()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field BaseGmsClient zzct>
	//*   6   14:invokevirtual   #49  <Method String BaseGmsClient.getServiceDescriptor()>
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*   9   21:ifne            96
	//*  10   24:aload_0         
	//*  11   25:getfield        #17  <Field BaseGmsClient zzct>
	//*  12   28:invokevirtual   #49  <Method String BaseGmsClient.getServiceDescriptor()>
	//*  13   31:astore_2        
	//*  14   32:new             #57  <Class StringBuilder>
	//*  15   35:dup             
	//*  16   36:aload_2         
	//*  17   37:invokestatic    #61  <Method String String.valueOf(Object)>
	//*  18   40:invokevirtual   #65  <Method int String.length()>
	//*  19   43:bipush          34
	//*  20   45:iadd            
	//*  21   46:aload_1         
	//*  22   47:invokestatic    #61  <Method String String.valueOf(Object)>
	//*  23   50:invokevirtual   #65  <Method int String.length()>
	//*  24   53:iadd            
	//*  25   54:invokespecial   #68  <Method void StringBuilder(int)>
	//*  26   57:astore_3        
	//*  27   58:aload_3         
	//*  28   59:ldc1            #70  <String "service descriptor mismatch: ">
	//*  29   61:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  30   64:pop             
	//*  31   65:aload_3         
	//*  32   66:aload_2         
	//*  33   67:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  34   70:pop             
	//*  35   71:aload_3         
	//*  36   72:ldc1            #76  <String " vs. ">
	//*  37   74:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  38   77:pop             
	//*  39   78:aload_3         
	//*  40   79:aload_1         
	//*  41   80:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  42   83:pop             
	//*  43   84:ldc1            #78  <String "GmsClient">
	//*  44   86:aload_3         
	//*  45   87:invokevirtual   #81  <Method String StringBuilder.toString()>
	//*  46   90:invokestatic    #87  <Method int Log.e(String, String)>
	//*  47   93:pop             
	//*  48   94:iconst_0        
	//*  49   95:ireturn         
	//*  50   96:aload_0         
	//*  51   97:getfield        #17  <Field BaseGmsClient zzct>
	//*  52  100:aload_0         
	//*  53  101:getfield        #22  <Field IBinder zzcy>
	//*  54  104:invokevirtual   #91  <Method android.os.IInterface BaseGmsClient.createServiceInterface(IBinder)>
	//*  55  107:astore_1        
	//*  56  108:aload_1         
	//*  57  109:ifnull          180
	//*  58  112:aload_0         
	//*  59  113:getfield        #17  <Field BaseGmsClient zzct>
	//*  60  116:iconst_2        
	//*  61  117:iconst_4        
	//*  62  118:aload_1         
	//*  63  119:invokestatic    #94  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, android.os.IInterface)>
	//*  64  122:ifne            138
	//*  65  125:aload_0         
	//*  66  126:getfield        #17  <Field BaseGmsClient zzct>
	//*  67  129:iconst_3        
	//*  68  130:iconst_4        
	//*  69  131:aload_1         
	//*  70  132:invokestatic    #94  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, android.os.IInterface)>
	//*  71  135:ifeq            180
	//*  72  138:aload_0         
	//*  73  139:getfield        #17  <Field BaseGmsClient zzct>
	//*  74  142:aconst_null     
	//*  75  143:invokestatic    #97  <Method ConnectionResult BaseGmsClient.zza(BaseGmsClient, ConnectionResult)>
	//*  76  146:pop             
	//*  77  147:aload_0         
	//*  78  148:getfield        #17  <Field BaseGmsClient zzct>
	//*  79  151:invokevirtual   #101 <Method Bundle BaseGmsClient.getConnectionHint()>
	//*  80  154:astore_1        
	//*  81  155:aload_0         
	//*  82  156:getfield        #17  <Field BaseGmsClient zzct>
	//*  83  159:invokestatic    #105 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
	//*  84  162:ifnull          178
	//*  85  165:aload_0         
	//*  86  166:getfield        #17  <Field BaseGmsClient zzct>
	//*  87  169:invokestatic    #105 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
	//*  88  172:aload_1         
	//*  89  173:invokeinterface #111 <Method void BaseGmsClient$BaseConnectionCallbacks.onConnected(Bundle)>
	//*  90  178:iconst_1        
	//*  91  179:ireturn         
	//*  92  180:iconst_0        
	//*  93  181:ireturn         
	//*  94  182:ldc1            #78  <String "GmsClient">
	//*  95  184:ldc1            #113 <String "service probably died">
	//*  96  186:invokestatic    #116 <Method int Log.w(String, String)>
	//*  97  189:pop             
	//*  98  190:iconst_0        
	//*  99  191:ireturn         
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			Log.w("GmsClient", "service probably died");
			return false;
		}
		if(!zzct.getServiceDescriptor().equals(obj))
		{
			String s = zzct.getServiceDescriptor();
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34 + String.valueOf(obj).length());
			stringbuilder.append("service descriptor mismatch: ");
			stringbuilder.append(s);
			stringbuilder.append(" vs. ");
			stringbuilder.append(((String) (obj)));
			Log.e("GmsClient", stringbuilder.toString());
			return false;
		}
		obj = ((Object) (zzct.createServiceInterface(zzcy)));
		if(obj != null && (BaseGmsClient.zza(zzct, 2, 4, ((android.os.IInterface) (obj))) || BaseGmsClient.zza(zzct, 3, 4, ((android.os.IInterface) (obj)))))
		{
			BaseGmsClient.zza(zzct, ((ConnectionResult) (null)));
			Bundle bundle = zzct.getConnectionHint();
			if(BaseGmsClient.zze(zzct) != null)
				BaseGmsClient.zze(zzct).onConnected(bundle);
			return true;
		} else
		{
			return false;
		}
	//* 100  192:astore_1        
	//* 101  193:goto            182
	}

	private final BaseGmsClient zzct;
	private final IBinder zzcy;

	public BaseGmsClient$zzf(BaseGmsClient basegmsclient, int i, IBinder ibinder, Bundle bundle)
	{
		zzct = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BaseGmsClient zzct>
		super(basegmsclient, i, bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload           4
	//    7   10:invokespecial   #20  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
		zzcy = ibinder;
	//    8   13:aload_0         
	//    9   14:aload_3         
	//   10   15:putfield        #22  <Field IBinder zzcy>
	//   11   18:return          
	}
}
