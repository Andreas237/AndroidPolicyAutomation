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

	protected void zzn(ConnectionResult connectionresult)
	{
		if(zzf.zzd(zzaDV) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field zzf zzaDV>
	//*   2    4:invokestatic    #30  <Method zzf$zzc zzf.zzd(zzf)>
	//*   3    7:ifnull          23
			zzf.zzd(zzaDV).onConnectionFailed(connectionresult);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field zzf zzaDV>
	//    6   14:invokestatic    #30  <Method zzf$zzc zzf.zzd(zzf)>
	//    7   17:aload_1         
	//    8   18:invokeinterface #35  <Method void zzf$zzc.onConnectionFailed(ConnectionResult)>
		zzaDV.onConnectionFailed(connectionresult);
	//    9   23:aload_0         
	//   10   24:getfield        #17  <Field zzf zzaDV>
	//   11   27:aload_1         
	//   12   28:invokevirtual   #36  <Method void zzf.onConnectionFailed(ConnectionResult)>
	//   13   31:return          
	}

	protected boolean zzwZ()
	{
		String s;
		try
		{
			s = zzaDZ.getInterfaceDescriptor();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field IBinder zzaDZ>
	//    2    4:invokeinterface #46  <Method String IBinder.getInterfaceDescriptor()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field zzf zzaDV>
	//*   6   14:invokevirtual   #49  <Method String zzf.zzev()>
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*   9   21:ifne            100
	//*  10   24:aload_0         
	//*  11   25:getfield        #17  <Field zzf zzaDV>
	//*  12   28:invokevirtual   #49  <Method String zzf.zzev()>
	//*  13   31:invokestatic    #59  <Method String String.valueOf(Object)>
	//*  14   34:astore_2        
	//*  15   35:ldc1            #61  <String "GmsClient">
	//*  16   37:new             #63  <Class StringBuilder>
	//*  17   40:dup             
	//*  18   41:aload_2         
	//*  19   42:invokestatic    #59  <Method String String.valueOf(Object)>
	//*  20   45:invokevirtual   #67  <Method int String.length()>
	//*  21   48:bipush          34
	//*  22   50:iadd            
	//*  23   51:aload_1         
	//*  24   52:invokestatic    #59  <Method String String.valueOf(Object)>
	//*  25   55:invokevirtual   #67  <Method int String.length()>
	//*  26   58:iadd            
	//*  27   59:invokespecial   #70  <Method void StringBuilder(int)>
	//*  28   62:ldc1            #72  <String "service descriptor mismatch: ">
	//*  29   64:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  30   67:aload_2         
	//*  31   68:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  32   71:ldc1            #78  <String " vs. ">
	//*  33   73:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  34   76:aload_1         
	//*  35   77:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  36   80:invokevirtual   #81  <Method String StringBuilder.toString()>
	//*  37   83:invokestatic    #87  <Method int Log.e(String, String)>
	//*  38   86:pop             
	//*  39   87:iconst_0        
	//*  40   88:ireturn         
		catch(RemoteException remoteexception)
	//*  41   89:astore_1        
		{
			Log.w("GmsClient", "service probably died");
	//   42   90:ldc1            #61  <String "GmsClient">
	//   43   92:ldc1            #89  <String "service probably died">
	//   44   94:invokestatic    #92  <Method int Log.w(String, String)>
	//   45   97:pop             
			return false;
	//   46   98:iconst_0        
	//   47   99:ireturn         
		}
		if(!zzaDV.zzev().equals(((Object) (s))))
		{
			String s1 = String.valueOf(((Object) (zzaDV.zzev())));
			Log.e("GmsClient", (new StringBuilder(String.valueOf(((Object) (s1))).length() + 34 + String.valueOf(((Object) (s))).length())).append("service descriptor mismatch: ").append(s1).append(" vs. ").append(s).toString());
		} else
		{
			android.os.IInterface iinterface = zzaDV.zzh(zzaDZ);
	//   48  100:aload_0         
	//   49  101:getfield        #17  <Field zzf zzaDV>
	//   50  104:aload_0         
	//   51  105:getfield        #22  <Field IBinder zzaDZ>
	//   52  108:invokevirtual   #96  <Method android.os.IInterface zzf.zzh(IBinder)>
	//   53  111:astore_1        
			if(iinterface != null && zzf.zza(zzaDV, 2, 3, iinterface))
	//*  54  112:aload_1         
	//*  55  113:ifnull          87
	//*  56  116:aload_0         
	//*  57  117:getfield        #17  <Field zzf zzaDV>
	//*  58  120:iconst_2        
	//*  59  121:iconst_3        
	//*  60  122:aload_1         
	//*  61  123:invokestatic    #100 <Method boolean zzf.zza(zzf, int, int, android.os.IInterface)>
	//*  62  126:ifeq            87
			{
				Bundle bundle = zzaDV.zzud();
	//   63  129:aload_0         
	//   64  130:getfield        #17  <Field zzf zzaDV>
	//   65  133:invokevirtual   #104 <Method Bundle zzf.zzud()>
	//   66  136:astore_1        
				if(zzf.zzb(zzaDV) != null)
	//*  67  137:aload_0         
	//*  68  138:getfield        #17  <Field zzf zzaDV>
	//*  69  141:invokestatic    #108 <Method zzf$zzb zzf.zzb(zzf)>
	//*  70  144:ifnull          160
					zzf.zzb(zzaDV).onConnected(bundle);
	//   71  147:aload_0         
	//   72  148:getfield        #17  <Field zzf zzaDV>
	//   73  151:invokestatic    #108 <Method zzf$zzb zzf.zzb(zzf)>
	//   74  154:aload_1         
	//   75  155:invokeinterface #114 <Method void zzf$zzb.onConnected(Bundle)>
				return true;
	//   76  160:iconst_1        
	//   77  161:ireturn         
			}
		}
		return false;
	}

	final zzf zzaDV;
	public final IBinder zzaDZ;

	public zzf$zzj(zzf zzf1, int i, IBinder ibinder, Bundle bundle)
	{
		zzaDV = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzf zzaDV>
		super(zzf1, i, bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload           4
	//    7   10:invokespecial   #20  <Method void zzf$zza(zzf, int, Bundle)>
		zzaDZ = ibinder;
	//    8   13:aload_0         
	//    9   14:aload_3         
	//   10   15:putfield        #22  <Field IBinder zzaDZ>
	//   11   18:return          
	}
}
