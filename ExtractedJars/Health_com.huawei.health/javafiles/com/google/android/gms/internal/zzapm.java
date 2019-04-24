// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//			zzaog, zzapr, zzaov

public class zzapm
	implements HistoryApi
{
	static class zza extends zzaom.zza
	{

		public void zza(DataReadResult datareadresult)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(Log.isLoggable("Fitness", 2))
		//*   2    2:ldc1            #34  <String "Fitness">
		//*   3    4:iconst_2        
		//*   4    5:invokestatic    #40  <Method boolean Log.isLoggable(String, int)>
		//*   5    8:ifeq            43
			{
				int i = zzaUV;
		//    6   11:aload_0         
		//    7   12:getfield        #21  <Field int zzaUV>
		//    8   15:istore_2        
				Log.v("Fitness", (new StringBuilder(33)).append("Received batch result ").append(i).toString());
		//    9   16:ldc1            #34  <String "Fitness">
		//   10   18:new             #42  <Class StringBuilder>
		//   11   21:dup             
		//   12   22:bipush          33
		//   13   24:invokespecial   #45  <Method void StringBuilder(int)>
		//   14   27:ldc1            #47  <String "Received batch result ">
		//   15   29:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   16   32:iload_2         
		//   17   33:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
		//   18   36:invokevirtual   #58  <Method String StringBuilder.toString()>
		//   19   39:invokestatic    #62  <Method int Log.v(String, String)>
		//   20   42:pop             
			}
			if(zzaUW == null)
		//*  21   43:aload_0         
		//*  22   44:getfield        #23  <Field DataReadResult zzaUW>
		//*  23   47:ifnonnull       58
			{
				zzaUW = datareadresult;
		//   24   50:aload_0         
		//   25   51:aload_1         
		//   26   52:putfield        #23  <Field DataReadResult zzaUW>
				break MISSING_BLOCK_LABEL_66;
		//   27   55:goto            66
			}
			zzaUW.zzb(datareadresult);
		//   28   58:aload_0         
		//   29   59:getfield        #23  <Field DataReadResult zzaUW>
		//   30   62:aload_1         
		//   31   63:invokevirtual   #67  <Method void DataReadResult.zzb(DataReadResult)>
			zzaUV = zzaUV + 1;
		//   32   66:aload_0         
		//   33   67:aload_0         
		//   34   68:getfield        #21  <Field int zzaUV>
		//   35   71:iconst_1        
		//   36   72:iadd            
		//   37   73:putfield        #21  <Field int zzaUV>
			if(zzaUV == zzaUW.zzDq())
		//*  38   76:aload_0         
		//*  39   77:getfield        #21  <Field int zzaUV>
		//*  40   80:aload_0         
		//*  41   81:getfield        #23  <Field DataReadResult zzaUW>
		//*  42   84:invokevirtual   #71  <Method int DataReadResult.zzDq()>
		//*  43   87:icmpne          103
				zzaGN.setResult(((Object) (zzaUW)));
		//   44   90:aload_0         
		//   45   91:getfield        #25  <Field zzaad$zzb zzaGN>
		//   46   94:aload_0         
		//   47   95:getfield        #23  <Field DataReadResult zzaUW>
		//   48   98:invokeinterface #77  <Method void zzaad$zzb.setResult(Object)>
			this;
		//   49  103:aload_0         
			JVM INSTR monitorexit ;
		//   50  104:monitorexit     
			return;
		//   51  105:return          
			datareadresult;
		//   52  106:astore_1        
		//*  53  107:aload_0         
			throw datareadresult;
		//   54  108:monitorexit     
		//   55  109:aload_1         
		//   56  110:athrow          
		}

		private final zzaad.zzb zzaGN;
		private int zzaUV;
		private DataReadResult zzaUW;

		private zza(zzaad.zzb zzb)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void zzaom$zza()>
			zzaUV = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #21  <Field int zzaUV>
			zzaUW = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #23  <Field DataReadResult zzaUW>
			zzaGN = zzb;
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:putfield        #25  <Field zzaad$zzb zzaGN>
		//   11   19:return          
		}

	}


	public zzapm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	private PendingResult zza(GoogleApiClient googleapiclient, DataSet dataset, boolean flag)
	{
		zzac.zzb(((Object) (dataset)), "Must set the data set");
	//    0    0:aload_2         
	//    1    1:ldc1            #33  <String "Must set the data set">
	//    2    3:invokestatic    #39  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		boolean flag1;
		if(!dataset.getDataPoints().isEmpty())
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #45  <Method List DataSet.getDataPoints()>
	//*   6   11:invokeinterface #51  <Method boolean List.isEmpty()>
	//*   7   16:ifne            25
			flag1 = true;
	//    8   19:iconst_1        
	//    9   20:istore          4
		else
	//*  10   22:goto            28
			flag1 = false;
	//   11   25:iconst_0        
	//   12   26:istore          4
		zzac.zza(flag1, "Cannot use an empty data set");
	//   13   28:iload           4
	//   14   30:ldc1            #53  <String "Cannot use an empty data set">
	//   15   32:invokestatic    #56  <Method void zzac.zza(boolean, Object)>
		zzac.zzb(((Object) (dataset.getDataSource().zzCi())), "Must set the app package name for the data source");
	//   16   35:aload_2         
	//   17   36:invokevirtual   #60  <Method DataSource DataSet.getDataSource()>
	//   18   39:invokevirtual   #66  <Method com.google.android.gms.fitness.data.zzb DataSource.zzCi()>
	//   19   42:ldc1            #68  <String "Must set the app package name for the data source">
	//   20   44:invokestatic    #39  <Method Object zzac.zzb(Object, Object)>
	//   21   47:pop             
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaog.zzc(googleapiclient, dataset, flag) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaog)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #28  <Class zzaog>
			//    3    5:invokevirtual   #31  <Method void zza(zzaog)>
			//    4    8:return          
			}

			protected void zza(zzaog zzaog1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #34  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #37  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaov)zzaog1.zzxD()).zza(new zzg(zzaUL, ((zzapf) (zzapr1)), zzaUM));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #41  <Method android.os.IInterface zzaog.zzxD()>
			//    7   13:checkcast       #43  <Class zzaov>
			//    8   16:new             #45  <Class zzg>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #17  <Field DataSet zzaUL>
			//   12   24:aload_2         
			//   13   25:aload_0         
			//   14   26:getfield        #19  <Field boolean zzaUM>
			//   15   29:invokespecial   #48  <Method void zzg(DataSet, zzapf, boolean)>
			//   16   32:invokeinterface #51  <Method void zzaov.zza(zzg)>
			//   17   37:return          
			}

			final DataSet zzaUL;
			final boolean zzaUM;

			
			{
				zzaUL = dataset;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #17  <Field DataSet zzaUL>
				zzaUM = flag;
			//    3    5:aload_0         
			//    4    6:iload           4
			//    5    8:putfield        #19  <Field boolean zzaUM>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #22  <Method void zzaog$zzc(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//   22   48:aload_1         
	//   23   49:new             #8   <Class zzapm$1>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:iload_3         
	//   29   57:invokespecial   #71  <Method void zzapm$1(zzapm, GoogleApiClient, DataSet, boolean)>
	//   30   60:invokevirtual   #76  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//   31   63:areturn         
	}

	private PendingResult zza(GoogleApiClient googleapiclient, DataType datatype, boolean flag)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaog.zza(googleapiclient, datatype, flag) {

			protected DailyTotalResult zzY(Status status)
			{
				return DailyTotalResult.zza(status, zzaUS);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #20  <Field DataType zzaUS>
			//    3    5:invokestatic    #33  <Method DailyTotalResult DailyTotalResult.zza(Status, DataType)>
			//    4    8:areturn         
			}

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaog)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #38  <Class zzaog>
			//    3    5:invokevirtual   #41  <Method void zza(zzaog)>
			//    4    8:return          
			}

			protected void zza(zzaog zzaog1)
				throws RemoteException
			{
				zzd zzd1 = new zzd(((zzaol) (new zzaol.zza(this) {

					public void zza(DailyTotalResult dailytotalresult)
						throws RemoteException
					{
						zzaUU.zzb(((Result) (dailytotalresult)));
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field zzapm$7 zzaUU>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #26  <Method void zzapm$7.zzb(Result)>
					//    4    8:return          
					}

					final _cls7 zzaUU;

			
			{
				zzaUU = _pcls7;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field zzapm$7 zzaUU>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void zzaol$zza()>
			//    5    9:return          
			}
				}
)), zzaUS, zzaUT);
			//    0    0:new             #44  <Class zzd>
			//    1    3:dup             
			//    2    4:new             #12  <Class zzapm$7$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:invokespecial   #47  <Method void zzapm$7$1(zzapm$7)>
			//    6   12:aload_0         
			//    7   13:getfield        #20  <Field DataType zzaUS>
			//    8   16:aload_0         
			//    9   17:getfield        #22  <Field boolean zzaUT>
			//   10   20:invokespecial   #50  <Method void zzd(zzaol, DataType, boolean)>
			//   11   23:astore_2        
				((zzaov)zzaog1.zzxD()).zza(zzd1);
			//   12   24:aload_1         
			//   13   25:invokevirtual   #54  <Method android.os.IInterface zzaog.zzxD()>
			//   14   28:checkcast       #56  <Class zzaov>
			//   15   31:aload_2         
			//   16   32:invokeinterface #59  <Method void zzaov.zza(zzd)>
			//   17   37:return          
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzY(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #63  <Method DailyTotalResult zzY(Status)>
			//    3    5:areturn         
			}

			final DataType zzaUS;
			final boolean zzaUT;

			
			{
				zzaUS = datatype;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #20  <Field DataType zzaUS>
				zzaUT = flag;
			//    3    5:aload_0         
			//    4    6:iload           4
			//    5    8:putfield        #22  <Field boolean zzaUT>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #25  <Method void zzaog$zza(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #20  <Class zzapm$7>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:invokespecial   #82  <Method void zzapm$7(zzapm, GoogleApiClient, DataType, boolean)>
	//    8   12:invokevirtual   #76  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    9   15:areturn         
	}

	public PendingResult deleteData(GoogleApiClient googleapiclient, DataDeleteRequest datadeleterequest)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaog.zzc(googleapiclient, datadeleterequest) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaog)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaog>
			//    3    5:invokevirtual   #28  <Method void zza(zzaog)>
			//    4    8:return          
			}

			protected void zza(zzaog zzaog1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaov)zzaog1.zzxD()).zza(new DataDeleteRequest(zzaUN, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaog.zzxD()>
			//    7   13:checkcast       #40  <Class zzaov>
			//    8   16:new             #42  <Class DataDeleteRequest>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field DataDeleteRequest zzaUN>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void DataDeleteRequest(DataDeleteRequest, zzapf)>
			//   14   28:invokeinterface #48  <Method void zzaov.zza(DataDeleteRequest)>
			//   15   33:return          
			}

			final DataDeleteRequest zzaUN;

			
			{
				zzaUN = datadeleterequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field DataDeleteRequest zzaUN>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaog$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzapm$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #88  <Method void zzapm$2(zzapm, GoogleApiClient, DataDeleteRequest)>
	//    7   11:invokevirtual   #76  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult insertData(GoogleApiClient googleapiclient, DataSet dataset)
	{
		return zza(googleapiclient, dataset, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #93  <Method PendingResult zza(GoogleApiClient, DataSet, boolean)>
	//    5    7:areturn         
	}

	public PendingResult readDailyTotal(GoogleApiClient googleapiclient, DataType datatype)
	{
		return zza(googleapiclient, datatype, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #98  <Method PendingResult zza(GoogleApiClient, DataType, boolean)>
	//    5    7:areturn         
	}

	public PendingResult readDailyTotalFromLocalDevice(GoogleApiClient googleapiclient, DataType datatype)
	{
		return zza(googleapiclient, datatype, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #98  <Method PendingResult zza(GoogleApiClient, DataType, boolean)>
	//    5    7:areturn         
	}

	public PendingResult readData(GoogleApiClient googleapiclient, DataReadRequest datareadrequest)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaog.zza(googleapiclient, datareadrequest) {

			protected DataReadResult zzX(Status status)
			{
				return DataReadResult.zza(status, zzaUR.getDataTypes(), zzaUR.getDataSources());
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #16  <Field DataReadRequest zzaUR>
			//    3    5:invokevirtual   #28  <Method List DataReadRequest.getDataTypes()>
			//    4    8:aload_0         
			//    5    9:getfield        #16  <Field DataReadRequest zzaUR>
			//    6   12:invokevirtual   #31  <Method List DataReadRequest.getDataSources()>
			//    7   15:invokestatic    #37  <Method DataReadResult DataReadResult.zza(Status, List, List)>
			//    8   18:areturn         
			}

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaog)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #42  <Class zzaog>
			//    3    5:invokevirtual   #45  <Method void zza(zzaog)>
			//    4    8:return          
			}

			protected void zza(zzaog zzaog1)
				throws RemoteException
			{
				zza zza1 = new zza(((zzaad.zzb) (this)));
			//    0    0:new             #48  <Class zzapm$zza>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #51  <Method void zzapm$zza(zzaad$zzb, zzapm$1)>
			//    5    9:astore_2        
				((zzaov)zzaog1.zzxD()).zza(new DataReadRequest(zzaUR, ((zzaom) (zza1))));
			//    6   10:aload_1         
			//    7   11:invokevirtual   #55  <Method android.os.IInterface zzaog.zzxD()>
			//    8   14:checkcast       #57  <Class zzaov>
			//    9   17:new             #24  <Class DataReadRequest>
			//   10   20:dup             
			//   11   21:aload_0         
			//   12   22:getfield        #16  <Field DataReadRequest zzaUR>
			//   13   25:aload_2         
			//   14   26:invokespecial   #60  <Method void DataReadRequest(DataReadRequest, zzaom)>
			//   15   29:invokeinterface #63  <Method void zzaov.zza(DataReadRequest)>
			//   16   34:return          
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzX(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #67  <Method DataReadResult zzX(Status)>
			//    3    5:areturn         
			}

			final DataReadRequest zzaUR;

			
			{
				zzaUR = datareadrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field DataReadRequest zzaUR>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzaog$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #18  <Class zzapm$6>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #105 <Method void zzapm$6(zzapm, GoogleApiClient, DataReadRequest)>
	//    7   11:invokevirtual   #76  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult registerDataUpdateListener(GoogleApiClient googleapiclient, DataUpdateListenerRegistrationRequest dataupdatelistenerregistrationrequest)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaog.zzc(googleapiclient, dataupdatelistenerregistrationrequest) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaog)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaog>
			//    3    5:invokevirtual   #28  <Method void zza(zzaog)>
			//    4    8:return          
			}

			protected void zza(zzaog zzaog1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaov)zzaog1.zzxD()).zza(new DataUpdateListenerRegistrationRequest(zzaUP, ((android.os.IBinder) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaog.zzxD()>
			//    7   13:checkcast       #40  <Class zzaov>
			//    8   16:new             #42  <Class DataUpdateListenerRegistrationRequest>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field DataUpdateListenerRegistrationRequest zzaUP>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void DataUpdateListenerRegistrationRequest(DataUpdateListenerRegistrationRequest, android.os.IBinder)>
			//   14   28:invokeinterface #48  <Method void zzaov.zza(DataUpdateListenerRegistrationRequest)>
			//   15   33:return          
			}

			final DataUpdateListenerRegistrationRequest zzaUP;

			
			{
				zzaUP = dataupdatelistenerregistrationrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field DataUpdateListenerRegistrationRequest zzaUP>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaog$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class zzapm$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #111 <Method void zzapm$4(zzapm, GoogleApiClient, DataUpdateListenerRegistrationRequest)>
	//    7   11:invokevirtual   #76  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult unregisterDataUpdateListener(GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaog.zzc(googleapiclient, pendingintent) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaog)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaog>
			//    3    5:invokevirtual   #28  <Method void zza(zzaog)>
			//    4    8:return          
			}

			protected void zza(zzaog zzaog1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaov)zzaog1.zzxD()).zza(new zzq(zzaUQ, ((android.os.IBinder) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaog.zzxD()>
			//    7   13:checkcast       #40  <Class zzaov>
			//    8   16:new             #42  <Class zzq>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field PendingIntent zzaUQ>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void zzq(PendingIntent, android.os.IBinder)>
			//   14   28:invokeinterface #48  <Method void zzaov.zza(zzq)>
			//   15   33:return          
			}

			final PendingIntent zzaUQ;

			
			{
				zzaUQ = pendingintent;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field PendingIntent zzaUQ>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaog$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #16  <Class zzapm$5>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #117 <Method void zzapm$5(zzapm, GoogleApiClient, PendingIntent)>
	//    7   11:invokevirtual   #119 <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult updateData(GoogleApiClient googleapiclient, DataUpdateRequest dataupdaterequest)
	{
		zzac.zzb(((Object) (dataupdaterequest.getDataSet())), "Must set the data set");
	//    0    0:aload_2         
	//    1    1:invokevirtual   #128 <Method DataSet DataUpdateRequest.getDataSet()>
	//    2    4:ldc1            #33  <String "Must set the data set">
	//    3    6:invokestatic    #39  <Method Object zzac.zzb(Object, Object)>
	//    4    9:pop             
		zzac.zza(dataupdaterequest.zzqn(), "Must set a non-zero value for startTimeMillis/startTime");
	//    5   10:aload_2         
	//    6   11:invokevirtual   #132 <Method long DataUpdateRequest.zzqn()>
	//    7   14:ldc1            #134 <String "Must set a non-zero value for startTimeMillis/startTime">
	//    8   16:invokestatic    #137 <Method long zzac.zza(long, Object)>
	//    9   19:pop2            
		zzac.zza(dataupdaterequest.zzAm(), "Must set a non-zero value for endTimeMillis/endTime");
	//   10   20:aload_2         
	//   11   21:invokevirtual   #140 <Method long DataUpdateRequest.zzAm()>
	//   12   24:ldc1            #142 <String "Must set a non-zero value for endTimeMillis/endTime">
	//   13   26:invokestatic    #137 <Method long zzac.zza(long, Object)>
	//   14   29:pop2            
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaog.zzc(googleapiclient, dataupdaterequest) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaog)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaog>
			//    3    5:invokevirtual   #28  <Method void zza(zzaog)>
			//    4    8:return          
			}

			protected void zza(zzaog zzaog1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaov)zzaog1.zzxD()).zza(new DataUpdateRequest(zzaUO, ((android.os.IBinder) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaog.zzxD()>
			//    7   13:checkcast       #40  <Class zzaov>
			//    8   16:new             #42  <Class DataUpdateRequest>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field DataUpdateRequest zzaUO>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void DataUpdateRequest(DataUpdateRequest, android.os.IBinder)>
			//   14   28:invokeinterface #48  <Method void zzaov.zza(DataUpdateRequest)>
			//   15   33:return          
			}

			final DataUpdateRequest zzaUO;

			
			{
				zzaUO = dataupdaterequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field DataUpdateRequest zzaUO>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaog$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//   15   30:aload_1         
	//   16   31:new             #12  <Class zzapm$3>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:invokespecial   #145 <Method void zzapm$3(zzapm, GoogleApiClient, DataUpdateRequest)>
	//   22   41:invokevirtual   #76  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//   23   44:areturn         
	}
}
