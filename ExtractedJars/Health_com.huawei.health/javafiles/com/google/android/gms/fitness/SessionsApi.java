// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.*;
import android.content.pm.*;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;

public interface SessionsApi
{
	public static class ViewIntentBuilder
	{

		private Intent zzk(Intent intent)
		{
			if(zzaSk == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field String zzaSk>
		//*   2    4:ifnonnull       9
				return intent;
		//    3    7:aload_1         
		//    4    8:areturn         
			Intent intent1 = (new Intent(intent)).setPackage(zzaSk);
		//    5    9:new             #31  <Class Intent>
		//    6   12:dup             
		//    7   13:aload_1         
		//    8   14:invokespecial   #34  <Method void Intent(Intent)>
		//    9   17:aload_0         
		//   10   18:getfield        #29  <Field String zzaSk>
		//   11   21:invokevirtual   #38  <Method Intent Intent.setPackage(String)>
		//   12   24:astore_2        
			ResolveInfo resolveinfo = mContext.getPackageManager().resolveActivity(intent1, 0);
		//   13   25:aload_0         
		//   14   26:getfield        #24  <Field Context mContext>
		//   15   29:invokevirtual   #44  <Method PackageManager Context.getPackageManager()>
		//   16   32:aload_2         
		//   17   33:iconst_0        
		//   18   34:invokevirtual   #50  <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
		//   19   37:astore_3        
			if(resolveinfo != null)
		//*  20   38:aload_3         
		//*  21   39:ifnull          69
			{
				intent = ((Intent) (resolveinfo.activityInfo.name));
		//   22   42:aload_3         
		//   23   43:getfield        #56  <Field ActivityInfo ResolveInfo.activityInfo>
		//   24   46:getfield        #61  <Field String ActivityInfo.name>
		//   25   49:astore_1        
				intent1.setComponent(new ComponentName(zzaSk, ((String) (intent))));
		//   26   50:aload_2         
		//   27   51:new             #63  <Class ComponentName>
		//   28   54:dup             
		//   29   55:aload_0         
		//   30   56:getfield        #29  <Field String zzaSk>
		//   31   59:aload_1         
		//   32   60:invokespecial   #66  <Method void ComponentName(String, String)>
		//   33   63:invokevirtual   #70  <Method Intent Intent.setComponent(ComponentName)>
		//   34   66:pop             
				return intent1;
		//   35   67:aload_2         
		//   36   68:areturn         
			} else
			{
				return intent;
		//   37   69:aload_1         
		//   38   70:areturn         
			}
		}

		public Intent build()
		{
			boolean flag;
			if(zzaSj != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field Session zzaSj>
		//*   2    4:ifnull          12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_1        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_1        
			zzac.zza(flag, "Session must be set");
		//    8   14:iload_1         
		//    9   15:ldc1            #76  <String "Session must be set">
		//   10   17:invokestatic    #82  <Method void zzac.zza(boolean, Object)>
			Intent intent = new Intent("vnd.google.fitness.VIEW");
		//   11   20:new             #31  <Class Intent>
		//   12   23:dup             
		//   13   24:ldc1            #84  <String "vnd.google.fitness.VIEW">
		//   14   26:invokespecial   #87  <Method void Intent(String)>
		//   15   29:astore_2        
			intent.setType(Session.getMimeType(zzaSj.getActivity()));
		//   16   30:aload_2         
		//   17   31:aload_0         
		//   18   32:getfield        #74  <Field Session zzaSj>
		//   19   35:invokevirtual   #93  <Method String Session.getActivity()>
		//   20   38:invokestatic    #97  <Method String Session.getMimeType(String)>
		//   21   41:invokevirtual   #100 <Method Intent Intent.setType(String)>
		//   22   44:pop             
			zzd.zza(((com.google.android.gms.common.internal.safeparcel.SafeParcelable) (zzaSj)), intent, "vnd.google.fitness.session");
		//   23   45:aload_0         
		//   24   46:getfield        #74  <Field Session zzaSj>
		//   25   49:aload_2         
		//   26   50:ldc1            #102 <String "vnd.google.fitness.session">
		//   27   52:invokestatic    #107 <Method void zzd.zza(com.google.android.gms.common.internal.safeparcel.SafeParcelable, Intent, String)>
			if(!zzaSl)
		//*  28   55:aload_0         
		//*  29   56:getfield        #22  <Field boolean zzaSl>
		//*  30   59:ifne            73
				zzaSk = zzaSj.getAppPackageName();
		//   31   62:aload_0         
		//   32   63:aload_0         
		//   33   64:getfield        #74  <Field Session zzaSj>
		//   34   67:invokevirtual   #110 <Method String Session.getAppPackageName()>
		//   35   70:putfield        #29  <Field String zzaSk>
			return zzk(intent);
		//   36   73:aload_0         
		//   37   74:aload_2         
		//   38   75:invokespecial   #112 <Method Intent zzk(Intent)>
		//   39   78:areturn         
		}

		public ViewIntentBuilder setPreferredApplication(String s)
		{
			zzaSk = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field String zzaSk>
			zzaSl = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #22  <Field boolean zzaSl>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public ViewIntentBuilder setSession(Session session)
		{
			zzaSj = session;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #74  <Field Session zzaSj>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private final Context mContext;
		private Session zzaSj;
		private String zzaSk;
		private boolean zzaSl;

		public ViewIntentBuilder(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			zzaSl = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #22  <Field boolean zzaSl>
			mContext = context;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #24  <Field Context mContext>
		//    8   14:return          
		}
	}


	public abstract PendingResult insertSession(GoogleApiClient googleapiclient, SessionInsertRequest sessioninsertrequest);

	public abstract PendingResult readSession(GoogleApiClient googleapiclient, SessionReadRequest sessionreadrequest);

	public abstract PendingResult registerForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent);

	public abstract PendingResult startSession(GoogleApiClient googleapiclient, Session session);

	public abstract PendingResult stopSession(GoogleApiClient googleapiclient, String s);

	public abstract PendingResult unregisterForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent);
}
