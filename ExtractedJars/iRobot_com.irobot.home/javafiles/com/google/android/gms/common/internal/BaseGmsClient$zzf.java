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
		if(BaseGmsClient.zzg(zzcs) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field BaseGmsClient zzcs>
	//*   2    4:invokestatic    #28  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//*   3    7:ifnull          23
			BaseGmsClient.zzg(zzcs).onConnectionFailed(connectionresult);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field BaseGmsClient zzcs>
	//    6   14:invokestatic    #28  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//    7   17:aload_1         
	//    8   18:invokeinterface #33  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
		zzcs.onConnectionFailed(connectionresult);
	//    9   23:aload_0         
	//   10   24:getfield        #16  <Field BaseGmsClient zzcs>
	//   11   27:aload_1         
	//   12   28:invokevirtual   #34  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
	//   13   31:return          
	}

	protected final boolean zzm()
	{
		RemoteException remoteexception;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
			boolean flag;
			Object obj;
			try
			{
				obj = ((Object) (zzcx.getInterfaceDescriptor()));
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field IBinder zzcx>
	//    4    6:invokeinterface #44  <Method String IBinder.getInterfaceDescriptor()>
	//    5   11:astore_3        
			}
	//*   6   12:aload_0         
	//*   7   13:getfield        #16  <Field BaseGmsClient zzcs>
	//*   8   16:invokevirtual   #47  <Method String BaseGmsClient.getServiceDescriptor()>
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  11   23:ifne            107
	//*  12   26:aload_0         
	//*  13   27:getfield        #16  <Field BaseGmsClient zzcs>
	//*  14   30:invokevirtual   #47  <Method String BaseGmsClient.getServiceDescriptor()>
	//*  15   33:astore          4
	//*  16   35:new             #55  <Class StringBuilder>
	//*  17   38:dup             
	//*  18   39:aload           4
	//*  19   41:invokestatic    #59  <Method String String.valueOf(Object)>
	//*  20   44:invokevirtual   #63  <Method int String.length()>
	//*  21   47:bipush          34
	//*  22   49:iadd            
	//*  23   50:aload_3         
	//*  24   51:invokestatic    #59  <Method String String.valueOf(Object)>
	//*  25   54:invokevirtual   #63  <Method int String.length()>
	//*  26   57:iadd            
	//*  27   58:invokespecial   #66  <Method void StringBuilder(int)>
	//*  28   61:astore          5
	//*  29   63:aload           5
	//*  30   65:ldc1            #68  <String "service descriptor mismatch: ">
	//*  31   67:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//*  32   70:pop             
	//*  33   71:aload           5
	//*  34   73:aload           4
	//*  35   75:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//*  36   78:pop             
	//*  37   79:aload           5
	//*  38   81:ldc1            #74  <String " vs. ">
	//*  39   83:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//*  40   86:pop             
	//*  41   87:aload           5
	//*  42   89:aload_3         
	//*  43   90:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//*  44   93:pop             
	//*  45   94:ldc1            #76  <String "GmsClient">
	//*  46   96:aload           5
	//*  47   98:invokevirtual   #79  <Method String StringBuilder.toString()>
	//*  48  101:invokestatic    #85  <Method int Log.e(String, String)>
	//*  49  104:pop             
	//*  50  105:iconst_0        
	//*  51  106:ireturn         
	//*  52  107:aload_0         
	//*  53  108:getfield        #16  <Field BaseGmsClient zzcs>
	//*  54  111:aload_0         
	//*  55  112:getfield        #21  <Field IBinder zzcx>
	//*  56  115:invokevirtual   #89  <Method android.os.IInterface BaseGmsClient.createServiceInterface(IBinder)>
	//*  57  118:astore_3        
	//*  58  119:iload_2         
	//*  59  120:istore_1        
	//*  60  121:aload_3         
	//*  61  122:ifnull          195
	//*  62  125:aload_0         
	//*  63  126:getfield        #16  <Field BaseGmsClient zzcs>
	//*  64  129:iconst_2        
	//*  65  130:iconst_4        
	//*  66  131:aload_3         
	//*  67  132:invokestatic    #92  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, android.os.IInterface)>
	//*  68  135:ifne            153
	//*  69  138:iload_2         
	//*  70  139:istore_1        
	//*  71  140:aload_0         
	//*  72  141:getfield        #16  <Field BaseGmsClient zzcs>
	//*  73  144:iconst_3        
	//*  74  145:iconst_4        
	//*  75  146:aload_3         
	//*  76  147:invokestatic    #92  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, android.os.IInterface)>
	//*  77  150:ifeq            195
	//*  78  153:aload_0         
	//*  79  154:getfield        #16  <Field BaseGmsClient zzcs>
	//*  80  157:aconst_null     
	//*  81  158:invokestatic    #95  <Method ConnectionResult BaseGmsClient.zza(BaseGmsClient, ConnectionResult)>
	//*  82  161:pop             
	//*  83  162:aload_0         
	//*  84  163:getfield        #16  <Field BaseGmsClient zzcs>
	//*  85  166:invokevirtual   #99  <Method Bundle BaseGmsClient.getConnectionHint()>
	//*  86  169:astore_3        
	//*  87  170:aload_0         
	//*  88  171:getfield        #16  <Field BaseGmsClient zzcs>
	//*  89  174:invokestatic    #103 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
	//*  90  177:ifnull          193
	//*  91  180:aload_0         
	//*  92  181:getfield        #16  <Field BaseGmsClient zzcs>
	//*  93  184:invokestatic    #103 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
	//*  94  187:aload_3         
	//*  95  188:invokeinterface #109 <Method void BaseGmsClient$BaseConnectionCallbacks.onConnected(Bundle)>
	//*  96  193:iconst_1        
	//*  97  194:istore_1        
	//*  98  195:iload_1         
	//*  99  196:ireturn         
	//* 100  197:ldc1            #76  <String "GmsClient">
	//* 101  199:ldc1            #111 <String "service probably died">
	//* 102  201:invokestatic    #114 <Method int Log.w(String, String)>
	//* 103  204:pop             
	//* 104  205:iconst_0        
	//* 105  206:ireturn         
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				Log.w("GmsClient", "service probably died");
				return false;
			}
			if(!zzcs.getServiceDescriptor().equals(obj))
			{
				String s = zzcs.getServiceDescriptor();
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34 + String.valueOf(obj).length());
				stringbuilder.append("service descriptor mismatch: ");
				stringbuilder.append(s);
				stringbuilder.append(" vs. ");
				stringbuilder.append(((String) (obj)));
				Log.e("GmsClient", stringbuilder.toString());
				return false;
			}
			obj = ((Object) (zzcs.createServiceInterface(zzcx)));
			flag = flag1;
			if(obj == null)
				break label0;
			if(!BaseGmsClient.zza(zzcs, 2, 4, ((android.os.IInterface) (obj))))
			{
				flag = flag1;
				if(!BaseGmsClient.zza(zzcs, 3, 4, ((android.os.IInterface) (obj))))
					break label0;
			}
			BaseGmsClient.zza(zzcs, ((ConnectionResult) (null)));
			obj = ((Object) (zzcs.getConnectionHint()));
			if(BaseGmsClient.zze(zzcs) != null)
				BaseGmsClient.zze(zzcs).onConnected(((Bundle) (obj)));
			flag = true;
		}
		return flag;
	//* 106  207:astore_3        
	//* 107  208:goto            197
	}

	private final BaseGmsClient zzcs;
	private final IBinder zzcx;

	public BaseGmsClient$zzf(BaseGmsClient basegmsclient, int i, IBinder ibinder, Bundle bundle)
	{
		zzcs = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseGmsClient zzcs>
		super(basegmsclient, i, bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload           4
	//    7   10:invokespecial   #19  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
		zzcx = ibinder;
	//    8   13:aload_0         
	//    9   14:aload_3         
	//   10   15:putfield        #21  <Field IBinder zzcx>
	//   11   18:return          
	}
}
