// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzjd;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//			AdOverlayInfoParcel, zzn, zza

public final class zzs extends zzaaq
{

	public zzs(Activity activity, AdOverlayInfoParcel adoverlayinfoparcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzaaq()>
		zzbzb = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field boolean zzbzb>
		zzbzc = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field boolean zzbzc>
		zzbza = adoverlayinfoparcel;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #23  <Field AdOverlayInfoParcel zzbza>
		zztk = activity;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #25  <Field Activity zztk>
	//   14   24:return          
	}

	private final void zznr()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzbzc)
	//*   2    2:aload_0         
	//*   3    3:getfield        #21  <Field boolean zzbzc>
	//*   4    6:ifne            36
		{
			if(zzbza.zzbyn != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//*   7   13:getfield        #33  <Field zzn AdOverlayInfoParcel.zzbyn>
	//*   8   16:ifnull          31
				zzbza.zzbyn.zzcb();
	//    9   19:aload_0         
	//   10   20:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//   11   23:getfield        #33  <Field zzn AdOverlayInfoParcel.zzbyn>
	//   12   26:invokeinterface #38  <Method void zzn.zzcb()>
			zzbzc = true;
	//   13   31:aload_0         
	//   14   32:iconst_1        
	//   15   33:putfield        #21  <Field boolean zzbzc>
		}
		this;
	//   16   36:aload_0         
		JVM INSTR monitorexit ;
	//   17   37:monitorexit     
		return;
	//   18   38:return          
		Exception exception;
		exception;
	//   19   39:astore_1        
	//*  20   40:aload_0         
		throw exception;
	//   21   41:monitorexit     
	//   22   42:aload_1         
	//   23   43:athrow          
	}

	public final void onActivityResult(int i, int j, Intent intent)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void onBackPressed()
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void onCreate(Bundle bundle)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(bundle != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          14
			flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
	//    4    6:aload_1         
	//    5    7:ldc1            #48  <String "com.google.android.gms.ads.internal.overlay.hasResumed">
	//    6    9:iconst_0        
	//    7   10:invokevirtual   #54  <Method boolean Bundle.getBoolean(String, boolean)>
	//    8   13:istore_2        
		AdOverlayInfoParcel adoverlayinfoparcel;
		for(adoverlayinfoparcel = zzbza; adoverlayinfoparcel == null || flag;)
	//*   9   14:aload_0         
	//*  10   15:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//*  11   18:astore_3        
	//*  12   19:aload_3         
	//*  13   20:ifnonnull       31
		{
			zztk.finish();
	//   14   23:aload_0         
	//   15   24:getfield        #25  <Field Activity zztk>
	//   16   27:invokevirtual   #59  <Method void Activity.finish()>
			return;
	//   17   30:return          
		}

	//   18   31:iload_2         
	//   19   32:ifeq            38
	//*  20   35:goto            23
		if(bundle == null)
	//*  21   38:aload_1         
	//*  22   39:ifnonnull       109
		{
			if(adoverlayinfoparcel.zzbym != null)
	//*  23   42:aload_3         
	//*  24   43:getfield        #63  <Field zzjd AdOverlayInfoParcel.zzbym>
	//*  25   46:ifnull          61
				zzbza.zzbym.onAdClicked();
	//   26   49:aload_0         
	//   27   50:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//   28   53:getfield        #63  <Field zzjd AdOverlayInfoParcel.zzbym>
	//   29   56:invokeinterface #68  <Method void zzjd.onAdClicked()>
			if(zztk.getIntent() != null && zztk.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && zzbza.zzbyn != null)
	//*  30   61:aload_0         
	//*  31   62:getfield        #25  <Field Activity zztk>
	//*  32   65:invokevirtual   #72  <Method Intent Activity.getIntent()>
	//*  33   68:ifnull          109
	//*  34   71:aload_0         
	//*  35   72:getfield        #25  <Field Activity zztk>
	//*  36   75:invokevirtual   #72  <Method Intent Activity.getIntent()>
	//*  37   78:ldc1            #74  <String "shouldCallOnOverlayOpened">
	//*  38   80:iconst_1        
	//*  39   81:invokevirtual   #79  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  40   84:ifeq            109
	//*  41   87:aload_0         
	//*  42   88:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//*  43   91:getfield        #33  <Field zzn AdOverlayInfoParcel.zzbyn>
	//*  44   94:ifnull          109
				zzbza.zzbyn.zzcc();
	//   45   97:aload_0         
	//   46   98:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//   47  101:getfield        #33  <Field zzn AdOverlayInfoParcel.zzbyn>
	//   48  104:invokeinterface #82  <Method void zzn.zzcc()>
		}
		zzbv.zzeh();
	//   49  109:invokestatic    #88  <Method zza zzbv.zzeh()>
	//   50  112:pop             
		if(!zza.zza(((android.content.Context) (zztk)), zzbza.zzbyl, zzbza.zzbyt))
	//*  51  113:aload_0         
	//*  52  114:getfield        #25  <Field Activity zztk>
	//*  53  117:aload_0         
	//*  54  118:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//*  55  121:getfield        #92  <Field zzc AdOverlayInfoParcel.zzbyl>
	//*  56  124:aload_0         
	//*  57  125:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//*  58  128:getfield        #96  <Field zzt AdOverlayInfoParcel.zzbyt>
	//*  59  131:invokestatic    #102 <Method boolean zza.zza(android.content.Context, zzc, zzt)>
	//*  60  134:ifne            144
			zztk.finish();
	//   61  137:aload_0         
	//   62  138:getfield        #25  <Field Activity zztk>
	//   63  141:invokevirtual   #59  <Method void Activity.finish()>
	//   64  144:return          
	}

	public final void onDestroy()
		throws RemoteException
	{
		if(zztk.isFinishing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Activity zztk>
	//*   2    4:invokevirtual   #107 <Method boolean Activity.isFinishing()>
	//*   3    7:ifeq            14
			zznr();
	//    4   10:aload_0         
	//    5   11:invokespecial   #109 <Method void zznr()>
	//    6   14:return          
	}

	public final void onPause()
		throws RemoteException
	{
		if(zzbza.zzbyn != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//*   2    4:getfield        #33  <Field zzn AdOverlayInfoParcel.zzbyn>
	//*   3    7:ifnull          22
			zzbza.zzbyn.onPause();
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//    6   14:getfield        #33  <Field zzn AdOverlayInfoParcel.zzbyn>
	//    7   17:invokeinterface #112 <Method void zzn.onPause()>
		if(zztk.isFinishing())
	//*   8   22:aload_0         
	//*   9   23:getfield        #25  <Field Activity zztk>
	//*  10   26:invokevirtual   #107 <Method boolean Activity.isFinishing()>
	//*  11   29:ifeq            36
			zznr();
	//   12   32:aload_0         
	//   13   33:invokespecial   #109 <Method void zznr()>
	//   14   36:return          
	}

	public final void onRestart()
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void onResume()
		throws RemoteException
	{
		if(zzbzb)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean zzbzb>
	//*   2    4:ifeq            15
		{
			zztk.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field Activity zztk>
	//    5   11:invokevirtual   #59  <Method void Activity.finish()>
			return;
	//    6   14:return          
		}
		zzbzb = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #19  <Field boolean zzbzb>
		if(zzbza.zzbyn != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//*  12   24:getfield        #33  <Field zzn AdOverlayInfoParcel.zzbyn>
	//*  13   27:ifnull          42
			zzbza.zzbyn.onResume();
	//   14   30:aload_0         
	//   15   31:getfield        #23  <Field AdOverlayInfoParcel zzbza>
	//   16   34:getfield        #33  <Field zzn AdOverlayInfoParcel.zzbyn>
	//   17   37:invokeinterface #116 <Method void zzn.onResume()>
	//   18   42:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
		throws RemoteException
	{
		bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", zzbzb);
	//    0    0:aload_1         
	//    1    1:ldc1            #48  <String "com.google.android.gms.ads.internal.overlay.hasResumed">
	//    2    3:aload_0         
	//    3    4:getfield        #19  <Field boolean zzbzb>
	//    4    7:invokevirtual   #121 <Method void Bundle.putBoolean(String, boolean)>
	//    5   10:return          
	}

	public final void onStart()
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void onStop()
		throws RemoteException
	{
		if(zztk.isFinishing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Activity zztk>
	//*   2    4:invokevirtual   #107 <Method boolean Activity.isFinishing()>
	//*   3    7:ifeq            14
			zznr();
	//    4   10:aload_0         
	//    5   11:invokespecial   #109 <Method void zznr()>
	//    6   14:return          
	}

	public final void zzax()
		throws RemoteException
	{
	//    0    0:return          
	}

	public final boolean zznj()
		throws RemoteException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void zzo(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
	//    0    0:return          
	}

	private AdOverlayInfoParcel zzbza;
	private boolean zzbzb;
	private boolean zzbzc;
	private Activity zztk;
}
