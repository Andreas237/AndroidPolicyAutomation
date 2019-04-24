// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.*;

// Referenced classes of package com.google.android.gms.fitness.service:
//			FitnessSensorService, FitnessSensorServiceRequest

static class FitnessSensorService$zza extends com.google.android.gms.internal.zzapz.zza
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
	//    9   17:invokevirtual   #55  <Method java.util.List zzapv.getDataTypes()>
	//   10   20:invokevirtual   #59  <Method java.util.List FitnessSensorService.onFindDataSources(java.util.List)>
	//   11   23:getstatic       #36  <Field Status Status.zzazx>
	//   12   26:invokespecial   #62  <Method void DataSourcesResult(java.util.List, Status)>
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
	//*   6   12:invokevirtual   #74  <Method com.google.android.gms.fitness.data.DataSource zzapx.getDataSource()>
	//*   7   15:invokevirtual   #78  <Method boolean FitnessSensorService.onUnregister(com.google.android.gms.fitness.data.DataSource)>
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

	private FitnessSensorService$zza(FitnessSensorService fitnesssensorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void com.google.android.gms.internal.zzapz$zza()>
		zzaXh = fitnesssensorservice;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field FitnessSensorService zzaXh>
	//    5    9:return          
	}

	FitnessSensorService$zza(FitnessSensorService fitnesssensorservice, FitnessSensorService._cls1 _pcls1)
	{
		this(fitnesssensorservice);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void FitnessSensorService$zza(FitnessSensorService)>
	//    3    5:return          
	}
}
