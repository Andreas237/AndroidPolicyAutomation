// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.*;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzaw, zzat, zzan, zzal

class zzcq extends BroadcastReceiver
{

	zzcq(zzaw zzaw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void BroadcastReceiver()>
		Preconditions.checkNotNull(((Object) (zzaw1)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:pop             
		zzvy = zzaw1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field zzaw zzvy>
	//    8   14:return          
	}

	private final void zzez()
	{
		zzvy.zzby();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field zzaw zzvy>
	//    2    4:invokevirtual   #36  <Method zzcp zzaw.zzby()>
	//    3    7:pop             
		zzvy.zzcc();
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field zzaw zzvy>
	//    6   12:invokevirtual   #40  <Method zzal zzaw.zzcc()>
	//    7   15:pop             
	//    8   16:return          
	}

	private final boolean zzfb()
	{
		Object obj = ((Object) ((ConnectivityManager)zzvy.getContext().getSystemService("connectivity")));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field zzaw zzvy>
	//    2    4:invokevirtual   #48  <Method Context zzaw.getContext()>
	//    3    7:ldc1            #50  <String "connectivity">
	//    4    9:invokevirtual   #56  <Method Object Context.getSystemService(String)>
	//    5   12:checkcast       #58  <Class ConnectivityManager>
	//    6   15:astore_2        
		boolean flag;
		try
		{
			obj = ((Object) (((ConnectivityManager) (obj)).getActiveNetworkInfo()));
	//    7   16:aload_2         
	//    8   17:invokevirtual   #62  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    9   20:astore_2        
		}
	//*  10   21:aload_2         
	//*  11   22:ifnull          36
	//*  12   25:aload_2         
	//*  13   26:invokevirtual   #67  <Method boolean NetworkInfo.isConnected()>
	//*  14   29:istore_1        
	//*  15   30:iload_1         
	//*  16   31:ifeq            36
	//*  17   34:iconst_1        
	//*  18   35:ireturn         
	//*  19   36:iconst_0        
	//*  20   37:ireturn         
		catch(SecurityException securityexception)
	//*  21   38:astore_2        
		{
			return false;
	//   22   39:iconst_0        
	//   23   40:ireturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_36;
		flag = ((NetworkInfo) (obj)).isConnected();
		if(flag)
			return true;
		return false;
	}

	public final boolean isConnected()
	{
		if(!zzabj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field boolean zzabj>
	//*   2    4:ifne            19
			((zzat) (zzvy.zzby())).zzt("Connectivity unknown. Receiver not registered");
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field zzaw zzvy>
	//    5   11:invokevirtual   #36  <Method zzcp zzaw.zzby()>
	//    6   14:ldc1            #72  <String "Connectivity unknown. Receiver not registered">
	//    7   16:invokevirtual   #78  <Method void zzat.zzt(String)>
		return zzabk;
	//    8   19:aload_0         
	//    9   20:getfield        #80  <Field boolean zzabk>
	//   10   23:ireturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		zzez();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void zzez()>
		context = ((Context) (intent.getAction()));
	//    2    4:aload_2         
	//    3    5:invokevirtual   #90  <Method String Intent.getAction()>
	//    4    8:astore_1        
		((zzat) (zzvy.zzby())).zza("NetworkBroadcastReceiver received action", ((Object) (context)));
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field zzaw zzvy>
	//    7   13:invokevirtual   #36  <Method zzcp zzaw.zzby()>
	//    8   16:ldc1            #92  <String "NetworkBroadcastReceiver received action">
	//    9   18:aload_1         
	//   10   19:invokevirtual   #96  <Method void zzat.zza(String, Object)>
		if("android.net.conn.CONNECTIVITY_CHANGE".equals(((Object) (context))))
	//*  11   22:ldc1            #98  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #104 <Method boolean String.equals(Object)>
	//*  14   28:ifeq            84
		{
			boolean flag = zzfb();
	//   15   31:aload_0         
	//   16   32:invokespecial   #106 <Method boolean zzfb()>
	//   17   35:istore_3        
			if(zzabk != flag)
	//*  18   36:aload_0         
	//*  19   37:getfield        #80  <Field boolean zzabk>
	//*  20   40:iload_3         
	//*  21   41:icmpeq          83
			{
				zzabk = flag;
	//   22   44:aload_0         
	//   23   45:iload_3         
	//   24   46:putfield        #80  <Field boolean zzabk>
				context = ((Context) (zzvy.zzcc()));
	//   25   49:aload_0         
	//   26   50:getfield        #29  <Field zzaw zzvy>
	//   27   53:invokevirtual   #40  <Method zzal zzaw.zzcc()>
	//   28   56:astore_1        
				((zzat) (context)).zza("Network connectivity status changed", ((Object) (Boolean.valueOf(flag))));
	//   29   57:aload_1         
	//   30   58:ldc1            #108 <String "Network connectivity status changed">
	//   31   60:iload_3         
	//   32   61:invokestatic    #114 <Method Boolean Boolean.valueOf(boolean)>
	//   33   64:invokevirtual   #96  <Method void zzat.zza(String, Object)>
				((zzat) (context)).zzca().zza(((Runnable) (new zzan(((zzal) (context)), flag))));
	//   34   67:aload_1         
	//   35   68:invokevirtual   #118 <Method zzk zzat.zzca()>
	//   36   71:new             #120 <Class zzan>
	//   37   74:dup             
	//   38   75:aload_1         
	//   39   76:iload_3         
	//   40   77:invokespecial   #123 <Method void zzan(zzal, boolean)>
	//   41   80:invokevirtual   #128 <Method void zzk.zza(Runnable)>
			}
			return;
	//   42   83:return          
		}
		if("com.google.analytics.RADIO_POWERED".equals(((Object) (context))))
	//*  43   84:ldc1            #130 <String "com.google.analytics.RADIO_POWERED">
	//*  44   86:aload_1         
	//*  45   87:invokevirtual   #104 <Method boolean String.equals(Object)>
	//*  46   90:ifeq            122
		{
			if(!intent.hasExtra(zzabi))
	//*  47   93:aload_2         
	//*  48   94:getstatic       #132 <Field String zzabi>
	//*  49   97:invokevirtual   #136 <Method boolean Intent.hasExtra(String)>
	//*  50  100:ifne            121
			{
				context = ((Context) (zzvy.zzcc()));
	//   51  103:aload_0         
	//   52  104:getfield        #29  <Field zzaw zzvy>
	//   53  107:invokevirtual   #40  <Method zzal zzaw.zzcc()>
	//   54  110:astore_1        
				((zzat) (context)).zzq("Radio powered up");
	//   55  111:aload_1         
	//   56  112:ldc1            #138 <String "Radio powered up">
	//   57  114:invokevirtual   #141 <Method void zzat.zzq(String)>
				((zzal) (context)).zzbs();
	//   58  117:aload_1         
	//   59  118:invokevirtual   #146 <Method void zzal.zzbs()>
			}
			return;
	//   60  121:return          
		} else
		{
			((zzat) (zzvy.zzby())).zzd("NetworkBroadcastReceiver received unknown action", ((Object) (context)));
	//   61  122:aload_0         
	//   62  123:getfield        #29  <Field zzaw zzvy>
	//   63  126:invokevirtual   #36  <Method zzcp zzaw.zzby()>
	//   64  129:ldc1            #148 <String "NetworkBroadcastReceiver received unknown action">
	//   65  131:aload_1         
	//   66  132:invokevirtual   #151 <Method void zzat.zzd(String, Object)>
			return;
	//   67  135:return          
		}
	}

	public final void unregister()
	{
		if(!zzabj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field boolean zzabj>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		((zzat) (zzvy.zzby())).zzq("Unregistering connectivity change receiver");
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field zzaw zzvy>
	//    6   12:invokevirtual   #36  <Method zzcp zzaw.zzby()>
	//    7   15:ldc1            #156 <String "Unregistering connectivity change receiver">
	//    8   17:invokevirtual   #141 <Method void zzat.zzq(String)>
		zzabj = false;
	//    9   20:aload_0         
	//   10   21:iconst_0        
	//   11   22:putfield        #70  <Field boolean zzabj>
		zzabk = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #80  <Field boolean zzabk>
		Context context = zzvy.getContext();
	//   15   30:aload_0         
	//   16   31:getfield        #29  <Field zzaw zzvy>
	//   17   34:invokevirtual   #48  <Method Context zzaw.getContext()>
	//   18   37:astore_1        
		try
		{
			context.unregisterReceiver(((BroadcastReceiver) (this)));
	//   19   38:aload_1         
	//   20   39:aload_0         
	//   21   40:invokevirtual   #160 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			return;
	//   22   43:return          
		}
		catch(IllegalArgumentException illegalargumentexception)
	//*  23   44:astore_1        
		{
			((zzat) (zzvy.zzby())).zze("Failed to unregister the network broadcast receiver", ((Object) (illegalargumentexception)));
	//   24   45:aload_0         
	//   25   46:getfield        #29  <Field zzaw zzvy>
	//   26   49:invokevirtual   #36  <Method zzcp zzaw.zzby()>
	//   27   52:ldc1            #162 <String "Failed to unregister the network broadcast receiver">
	//   28   54:aload_1         
	//   29   55:invokevirtual   #165 <Method void zzat.zze(String, Object)>
		}
	//   30   58:return          
	}

	public final void zzey()
	{
		zzez();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void zzez()>
		if(zzabj)
	//*   2    4:aload_0         
	//*   3    5:getfield        #70  <Field boolean zzabj>
	//*   4    8:ifeq            12
		{
			return;
	//    5   11:return          
		} else
		{
			Context context = zzvy.getContext();
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field zzaw zzvy>
	//    8   16:invokevirtual   #48  <Method Context zzaw.getContext()>
	//    9   19:astore_1        
			context.registerReceiver(((BroadcastReceiver) (this)), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:new             #168 <Class IntentFilter>
	//   13   25:dup             
	//   14   26:ldc1            #98  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   15   28:invokespecial   #170 <Method void IntentFilter(String)>
	//   16   31:invokevirtual   #174 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   17   34:pop             
			IntentFilter intentfilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
	//   18   35:new             #168 <Class IntentFilter>
	//   19   38:dup             
	//   20   39:ldc1            #130 <String "com.google.analytics.RADIO_POWERED">
	//   21   41:invokespecial   #170 <Method void IntentFilter(String)>
	//   22   44:astore_2        
			intentfilter.addCategory(context.getPackageName());
	//   23   45:aload_2         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #177 <Method String Context.getPackageName()>
	//   26   50:invokevirtual   #180 <Method void IntentFilter.addCategory(String)>
			context.registerReceiver(((BroadcastReceiver) (this)), intentfilter);
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:aload_2         
	//   30   56:invokevirtual   #174 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   31   59:pop             
			zzabk = zzfb();
	//   32   60:aload_0         
	//   33   61:aload_0         
	//   34   62:invokespecial   #106 <Method boolean zzfb()>
	//   35   65:putfield        #80  <Field boolean zzabk>
			((zzat) (zzvy.zzby())).zza("Registering connectivity change receiver. Network connected", ((Object) (Boolean.valueOf(zzabk))));
	//   36   68:aload_0         
	//   37   69:getfield        #29  <Field zzaw zzvy>
	//   38   72:invokevirtual   #36  <Method zzcp zzaw.zzby()>
	//   39   75:ldc1            #182 <String "Registering connectivity change receiver. Network connected">
	//   40   77:aload_0         
	//   41   78:getfield        #80  <Field boolean zzabk>
	//   42   81:invokestatic    #114 <Method Boolean Boolean.valueOf(boolean)>
	//   43   84:invokevirtual   #96  <Method void zzat.zza(String, Object)>
			zzabj = true;
	//   44   87:aload_0         
	//   45   88:iconst_1        
	//   46   89:putfield        #70  <Field boolean zzabj>
			return;
	//   47   92:return          
		}
	}

	public final void zzfa()
	{
		Context context = zzvy.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field zzaw zzvy>
	//    2    4:invokevirtual   #48  <Method Context zzaw.getContext()>
	//    3    7:astore_1        
		Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
	//    4    8:new             #86  <Class Intent>
	//    5   11:dup             
	//    6   12:ldc1            #130 <String "com.google.analytics.RADIO_POWERED">
	//    7   14:invokespecial   #184 <Method void Intent(String)>
	//    8   17:astore_2        
		intent.addCategory(context.getPackageName());
	//    9   18:aload_2         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #177 <Method String Context.getPackageName()>
	//   12   23:invokevirtual   #187 <Method Intent Intent.addCategory(String)>
	//   13   26:pop             
		intent.putExtra(zzabi, true);
	//   14   27:aload_2         
	//   15   28:getstatic       #132 <Field String zzabi>
	//   16   31:iconst_1        
	//   17   32:invokevirtual   #191 <Method Intent Intent.putExtra(String, boolean)>
	//   18   35:pop             
		context.sendOrderedBroadcast(intent, ((String) (null)));
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:aconst_null     
	//   22   39:invokevirtual   #195 <Method void Context.sendOrderedBroadcast(Intent, String)>
	//   23   42:return          
	}

	private static final String zzabi = "com.google.android.gms.internal.measurement.zzcq";
	private boolean zzabj;
	private boolean zzabk;
	private final zzaw zzvy;

	static 
	{
	//    0    0:return          
	}
}
