// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf

protected final class zzf$zzj extends zzf$zza
{

	protected void zzm(ConnectionResult connectionresult)
	{
		if(zzf.zzd(zzaFu) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field zzf zzaFu>
	//*   2    4:invokestatic    #30  <Method zzf$zzc zzf.zzd(zzf)>
	//*   3    7:ifnull          23
			zzf.zzd(zzaFu).onConnectionFailed(connectionresult);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field zzf zzaFu>
	//    6   14:invokestatic    #30  <Method zzf$zzc zzf.zzd(zzf)>
	//    7   17:aload_1         
	//    8   18:invokeinterface #35  <Method void zzf$zzc.onConnectionFailed(ConnectionResult)>
		zzaFu.onConnectionFailed(connectionresult);
	//    9   23:aload_0         
	//   10   24:getfield        #17  <Field zzf zzaFu>
	//   11   27:aload_1         
	//   12   28:invokevirtual   #36  <Method void zzf.onConnectionFailed(ConnectionResult)>
	//   13   31:return          
	}

	protected boolean zzxG()
	{
		RemoteException remoteexception;
		Object obj;
		try
		{
			obj = ((Object) (zzaFy.getInterfaceDescriptor()));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field IBinder zzaFy>
	//    2    4:invokeinterface #46  <Method String IBinder.getInterfaceDescriptor()>
	//    3    9:astore_2        
		}
	//*   4   10:goto            23
	//*   5   13:ldc1            #48  <String "GmsClient">
	//*   6   15:ldc1            #50  <String "service probably died">
	//*   7   17:invokestatic    #56  <Method int Log.w(String, String)>
	//*   8   20:pop             
	//*   9   21:iconst_0        
	//*  10   22:ireturn         
	//*  11   23:aload_0         
	//*  12   24:getfield        #17  <Field zzf zzaFu>
	//*  13   27:invokevirtual   #59  <Method String zzf.zzeA()>
	//*  14   30:aload_2         
	//*  15   31:invokevirtual   #65  <Method boolean String.equals(Object)>
	//*  16   34:ifne            104
	//*  17   37:aload_0         
	//*  18   38:getfield        #17  <Field zzf zzaFu>
	//*  19   41:invokevirtual   #59  <Method String zzf.zzeA()>
	//*  20   44:invokestatic    #69  <Method String String.valueOf(Object)>
	//*  21   47:astore_3        
	//*  22   48:aload_3         
	//*  23   49:invokestatic    #69  <Method String String.valueOf(Object)>
	//*  24   52:invokevirtual   #73  <Method int String.length()>
	//*  25   55:istore_1        
	//*  26   56:ldc1            #48  <String "GmsClient">
	//*  27   58:new             #75  <Class StringBuilder>
	//*  28   61:dup             
	//*  29   62:aload_2         
	//*  30   63:invokestatic    #69  <Method String String.valueOf(Object)>
	//*  31   66:invokevirtual   #73  <Method int String.length()>
	//*  32   69:iload_1         
	//*  33   70:bipush          34
	//*  34   72:iadd            
	//*  35   73:iadd            
	//*  36   74:invokespecial   #78  <Method void StringBuilder(int)>
	//*  37   77:ldc1            #80  <String "service descriptor mismatch: ">
	//*  38   79:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//*  39   82:aload_3         
	//*  40   83:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//*  41   86:ldc1            #86  <String " vs. ">
	//*  42   88:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//*  43   91:aload_2         
	//*  44   92:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//*  45   95:invokevirtual   #89  <Method String StringBuilder.toString()>
	//*  46   98:invokestatic    #92  <Method int Log.e(String, String)>
	//*  47  101:pop             
	//*  48  102:iconst_0        
	//*  49  103:ireturn         
	//*  50  104:aload_0         
	//*  51  105:getfield        #17  <Field zzf zzaFu>
	//*  52  108:aload_0         
	//*  53  109:getfield        #22  <Field IBinder zzaFy>
	//*  54  112:invokevirtual   #96  <Method android.os.IInterface zzf.zzh(IBinder)>
	//*  55  115:astore_2        
	//*  56  116:aload_2         
	//*  57  117:ifnull          166
	//*  58  120:aload_0         
	//*  59  121:getfield        #17  <Field zzf zzaFu>
	//*  60  124:iconst_2        
	//*  61  125:iconst_3        
	//*  62  126:aload_2         
	//*  63  127:invokestatic    #100 <Method boolean zzf.zza(zzf, int, int, android.os.IInterface)>
	//*  64  130:ifeq            166
	//*  65  133:aload_0         
	//*  66  134:getfield        #17  <Field zzf zzaFu>
	//*  67  137:invokevirtual   #104 <Method Bundle zzf.zzuC()>
	//*  68  140:astore_2        
	//*  69  141:aload_0         
	//*  70  142:getfield        #17  <Field zzf zzaFu>
	//*  71  145:invokestatic    #108 <Method zzf$zzb zzf.zzb(zzf)>
	//*  72  148:ifnull          164
	//*  73  151:aload_0         
	//*  74  152:getfield        #17  <Field zzf zzaFu>
	//*  75  155:invokestatic    #108 <Method zzf$zzb zzf.zzb(zzf)>
	//*  76  158:aload_2         
	//*  77  159:invokeinterface #114 <Method void zzf$zzb.onConnected(Bundle)>
	//*  78  164:iconst_1        
	//*  79  165:ireturn         
	//*  80  166:iconst_0        
	//*  81  167:ireturn         
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			Log.w("GmsClient", "service probably died");
			return false;
		}
		if(!zzaFu.zzeA().equals(obj))
		{
			String s = String.valueOf(((Object) (zzaFu.zzeA())));
			int i = String.valueOf(((Object) (s))).length();
			Log.e("GmsClient", (new StringBuilder(String.valueOf(obj).length() + (i + 34))).append("service descriptor mismatch: ").append(s).append(" vs. ").append(((String) (obj))).toString());
			return false;
		}
		obj = ((Object) (zzaFu.zzh(zzaFy)));
		if(obj != null && zzf.zza(zzaFu, 2, 3, ((android.os.IInterface) (obj))))
		{
			Bundle bundle = zzaFu.zzuC();
			if(zzf.zzb(zzaFu) != null)
				zzf.zzb(zzaFu).onConnected(bundle);
			return true;
		} else
		{
			return false;
		}
	//*  82  168:astore_2        
	//*  83  169:goto            13
	}

	final zzf zzaFu;
	public final IBinder zzaFy;

	public zzf$zzj(zzf zzf1, int i, IBinder ibinder, Bundle bundle)
	{
		zzaFu = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzf zzaFu>
		super(zzf1, i, bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload           4
	//    7   10:invokespecial   #20  <Method void zzf$zza(zzf, int, Bundle)>
		zzaFy = ibinder;
	//    8   13:aload_0         
	//    9   14:aload_3         
	//   10   15:putfield        #22  <Field IBinder zzaFy>
	//   11   18:return          
	}
}
