// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.service;

import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.zzt;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.*;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.service:
//			FitnessSensorServiceRequest

public abstract class FitnessSensorService extends Service
{
	static class zza extends com.google.android.gms.internal.zzapz.zza
	{

		public void zza(FitnessSensorServiceRequest fitnesssensorservicerequest, zzapf zzapf1)
			throws RemoteException
		{
			zzaXh.zzDB();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field FitnessSensorService zzaXh>
		//    2    4:invokevirtual   #26  <Method void FitnessSensorService.zzDB()>
			if(zzaXh.onRegister(fitnesssensorservicerequest))
		//*   3    7:aload_0         
		//*   4    8:getfield        #16  <Field FitnessSensorService zzaXh>
		//*   5   11:aload_1         
		//*   6   12:invokevirtual   #30  <Method boolean FitnessSensorService.onRegister(FitnessSensorServiceRequest)>
		//*   7   15:ifeq            28
			{
				zzapf1.zzp(Status.zzazx);
		//    8   18:aload_2         
		//    9   19:getstatic       #36  <Field Status Status.zzazx>
		//   10   22:invokeinterface #42  <Method void zzapf.zzp(Status)>
				return;
		//   11   27:return          
			} else
			{
				zzapf1.zzp(new Status(13));
		//   12   28:aload_2         
		//   13   29:new             #32  <Class Status>
		//   14   32:dup             
		//   15   33:bipush          13
		//   16   35:invokespecial   #45  <Method void Status(int)>
		//   17   38:invokeinterface #42  <Method void zzapf.zzp(Status)>
				return;
		//   18   43:return          
			}
		}

		public void zza(zzapv zzapv1, zzaon zzaon1)
			throws RemoteException
		{
			zzaXh.zzDB();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field FitnessSensorService zzaXh>
		//    2    4:invokevirtual   #26  <Method void FitnessSensorService.zzDB()>
			zzaon1.zza(new DataSourcesResult(zzaXh.onFindDataSources(zzapv1.getDataTypes()), Status.zzazx));
		//    3    7:aload_2         
		//    4    8:new             #49  <Class DataSourcesResult>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #16  <Field FitnessSensorService zzaXh>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #55  <Method List zzapv.getDataTypes()>
		//   10   20:invokevirtual   #59  <Method List FitnessSensorService.onFindDataSources(List)>
		//   11   23:getstatic       #36  <Field Status Status.zzazx>
		//   12   26:invokespecial   #62  <Method void DataSourcesResult(List, Status)>
		//   13   29:invokeinterface #67  <Method void zzaon.zza(DataSourcesResult)>
		//   14   34:return          
		}

		public void zza(zzapx zzapx1, zzapf zzapf1)
			throws RemoteException
		{
			zzaXh.zzDB();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field FitnessSensorService zzaXh>
		//    2    4:invokevirtual   #26  <Method void FitnessSensorService.zzDB()>
			if(zzaXh.onUnregister(zzapx1.getDataSource()))
		//*   3    7:aload_0         
		//*   4    8:getfield        #16  <Field FitnessSensorService zzaXh>
		//*   5   11:aload_1         
		//*   6   12:invokevirtual   #74  <Method DataSource zzapx.getDataSource()>
		//*   7   15:invokevirtual   #78  <Method boolean FitnessSensorService.onUnregister(DataSource)>
		//*   8   18:ifeq            31
			{
				zzapf1.zzp(Status.zzazx);
		//    9   21:aload_2         
		//   10   22:getstatic       #36  <Field Status Status.zzazx>
		//   11   25:invokeinterface #42  <Method void zzapf.zzp(Status)>
				return;
		//   12   30:return          
			} else
			{
				zzapf1.zzp(new Status(13));
		//   13   31:aload_2         
		//   14   32:new             #32  <Class Status>
		//   15   35:dup             
		//   16   36:bipush          13
		//   17   38:invokespecial   #45  <Method void Status(int)>
		//   18   41:invokeinterface #42  <Method void zzapf.zzp(Status)>
				return;
		//   19   46:return          
			}
		}

		private final FitnessSensorService zzaXh;

		private zza(FitnessSensorService fitnesssensorservice)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void com.google.android.gms.internal.zzapz$zza()>
			zzaXh = fitnesssensorservice;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field FitnessSensorService zzaXh>
		//    5    9:return          
		}

	}


	public FitnessSensorService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Service()>
	//    2    4:return          
	}

	public IBinder onBind(Intent intent)
	{
		if("com.google.android.gms.fitness.service.FitnessSensorService".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #13  <String "com.google.android.gms.fitness.service.FitnessSensorService">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #29  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #35  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            99
		{
			if(Log.isLoggable("FitnessSensorService", 3))
	//*   5   12:ldc1            #37  <String "FitnessSensorService">
	//*   6   14:iconst_3        
	//*   7   15:invokestatic    #43  <Method boolean Log.isLoggable(String, int)>
	//*   8   18:ifeq            91
			{
				intent = ((Intent) (String.valueOf(((Object) (intent)))));
	//    9   21:aload_1         
	//   10   22:invokestatic    #47  <Method String String.valueOf(Object)>
	//   11   25:astore_1        
				String s = String.valueOf(((Object) (((Object)this).getClass().getName())));
	//   12   26:aload_0         
	//   13   27:invokevirtual   #53  <Method Class Object.getClass()>
	//   14   30:invokevirtual   #58  <Method String Class.getName()>
	//   15   33:invokestatic    #47  <Method String String.valueOf(Object)>
	//   16   36:astore_3        
				int i = String.valueOf(((Object) (intent))).length();
	//   17   37:aload_1         
	//   18   38:invokestatic    #47  <Method String String.valueOf(Object)>
	//   19   41:invokevirtual   #62  <Method int String.length()>
	//   20   44:istore_2        
				Log.d("FitnessSensorService", (new StringBuilder(String.valueOf(((Object) (s))).length() + (i + 20))).append("Intent ").append(((String) (intent))).append(" received by ").append(s).toString());
	//   21   45:ldc1            #37  <String "FitnessSensorService">
	//   22   47:new             #64  <Class StringBuilder>
	//   23   50:dup             
	//   24   51:aload_3         
	//   25   52:invokestatic    #47  <Method String String.valueOf(Object)>
	//   26   55:invokevirtual   #62  <Method int String.length()>
	//   27   58:iload_2         
	//   28   59:bipush          20
	//   29   61:iadd            
	//   30   62:iadd            
	//   31   63:invokespecial   #67  <Method void StringBuilder(int)>
	//   32   66:ldc1            #69  <String "Intent ">
	//   33   68:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   34   71:aload_1         
	//   35   72:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:ldc1            #75  <String " received by ">
	//   37   77:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   38   80:aload_3         
	//   39   81:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   40   84:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   41   87:invokestatic    #82  <Method int Log.d(String, String)>
	//   42   90:pop             
			}
			return zzaXg.asBinder();
	//   43   91:aload_0         
	//   44   92:getfield        #84  <Field FitnessSensorService$zza zzaXg>
	//   45   95:invokevirtual   #88  <Method IBinder FitnessSensorService$zza.asBinder()>
	//   46   98:areturn         
		} else
		{
			return null;
	//   47   99:aconst_null     
	//   48  100:areturn         
		}
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void Service.onCreate()>
		zzaXg = new zza(this);
	//    2    4:aload_0         
	//    3    5:new             #8   <Class FitnessSensorService$zza>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #95  <Method void FitnessSensorService$zza(FitnessSensorService, FitnessSensorService$1)>
	//    8   14:putfield        #84  <Field FitnessSensorService$zza zzaXg>
	//    9   17:return          
	}

	public abstract List onFindDataSources(List list);

	public abstract boolean onRegister(FitnessSensorServiceRequest fitnesssensorservicerequest);

	public abstract boolean onUnregister(DataSource datasource);

	protected void zzDB()
		throws SecurityException
	{
		int i = Binder.getCallingUid();
	//    0    0:invokestatic    #112 <Method int Binder.getCallingUid()>
	//    1    3:istore_1        
		if(zzt.zzzl())
	//*   2    4:invokestatic    #118 <Method boolean zzt.zzzl()>
	//*   3    7:ifeq            26
		{
			((AppOpsManager)getSystemService("appops")).checkPackage(i, "com.google.android.gms");
	//    4   10:aload_0         
	//    5   11:ldc1            #120 <String "appops">
	//    6   13:invokevirtual   #124 <Method Object getSystemService(String)>
	//    7   16:checkcast       #126 <Class AppOpsManager>
	//    8   19:iload_1         
	//    9   20:ldc1            #128 <String "com.google.android.gms">
	//   10   22:invokevirtual   #132 <Method void AppOpsManager.checkPackage(int, String)>
			return;
	//   11   25:return          
		}
		String as[] = getPackageManager().getPackagesForUid(i);
	//   12   26:aload_0         
	//   13   27:invokevirtual   #136 <Method PackageManager getPackageManager()>
	//   14   30:iload_1         
	//   15   31:invokevirtual   #142 <Method String[] PackageManager.getPackagesForUid(int)>
	//   16   34:astore_3        
		if(as != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          68
		{
			int k = as.length;
	//   19   39:aload_3         
	//   20   40:arraylength     
	//   21   41:istore_2        
			for(int j = 0; j < k; j++)
	//*  22   42:iconst_0        
	//*  23   43:istore_1        
	//*  24   44:iload_1         
	//*  25   45:iload_2         
	//*  26   46:icmpge          68
				if(as[j].equals("com.google.android.gms"))
	//*  27   49:aload_3         
	//*  28   50:iload_1         
	//*  29   51:aaload          
	//*  30   52:ldc1            #128 <String "com.google.android.gms">
	//*  31   54:invokevirtual   #35  <Method boolean String.equals(Object)>
	//*  32   57:ifeq            61
					return;
	//   33   60:return          

	//   34   61:iload_1         
	//   35   62:iconst_1        
	//   36   63:iadd            
	//   37   64:istore_1        
		}
	//*  38   65:goto            44
		throw new SecurityException("Unauthorized caller");
	//   39   68:new             #104 <Class SecurityException>
	//   40   71:dup             
	//   41   72:ldc1            #144 <String "Unauthorized caller">
	//   42   74:invokespecial   #147 <Method void SecurityException(String)>
	//   43   77:athrow          
	}

	public static final String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
	private zza zzaXg;
}
