// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.hardware.display.VirtualDisplay;
import android.view.Display;
import com.google.android.gms.cast.CastRemoteDisplayApi;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdg, zzdr, zzds, zzdt, 
//			zzeg

public final class zzdq
	implements CastRemoteDisplayApi
{

	public zzdq(Api api)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #34  <Class zzdr>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #37  <Method void zzdr(zzdq)>
	//    7   13:putfield        #39  <Field zzeg zzxt>
		zzxs = api;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #41  <Field Api zzxs>
	//   11   21:return          
	}

	private final void a_()
	{
		if(zzbe != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field VirtualDisplay zzbe>
	//*   2    4:ifnull          79
		{
			if(zzbe.getDisplay() != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field VirtualDisplay zzbe>
	//*   5   11:invokevirtual   #53  <Method Display VirtualDisplay.getDisplay()>
	//*   6   14:ifnull          67
			{
				zzdg zzdg1 = zzbd;
	//    7   17:getstatic       #28  <Field zzdg zzbd>
	//    8   20:astore_2        
				int i = zzbe.getDisplay().getDisplayId();
	//    9   21:aload_0         
	//   10   22:getfield        #47  <Field VirtualDisplay zzbe>
	//   11   25:invokevirtual   #53  <Method Display VirtualDisplay.getDisplay()>
	//   12   28:invokevirtual   #59  <Method int Display.getDisplayId()>
	//   13   31:istore_1        
				StringBuilder stringbuilder = new StringBuilder(38);
	//   14   32:new             #61  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:bipush          38
	//   17   38:invokespecial   #64  <Method void StringBuilder(int)>
	//   18   41:astore_3        
				stringbuilder.append("releasing virtual display: ");
	//   19   42:aload_3         
	//   20   43:ldc1            #66  <String "releasing virtual display: ">
	//   21   45:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(i);
	//   23   49:aload_3         
	//   24   50:iload_1         
	//   25   51:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   26   54:pop             
				zzdg1.d(stringbuilder.toString(), new Object[0]);
	//   27   55:aload_2         
	//   28   56:aload_3         
	//   29   57:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   30   60:iconst_0        
	//   31   61:anewarray       Object[]
	//   32   64:invokevirtual   #81  <Method void zzdg.d(String, Object[])>
			}
			zzbe.release();
	//   33   67:aload_0         
	//   34   68:getfield        #47  <Field VirtualDisplay zzbe>
	//   35   71:invokevirtual   #84  <Method void VirtualDisplay.release()>
			zzbe = null;
	//   36   74:aload_0         
	//   37   75:aconst_null     
	//   38   76:putfield        #47  <Field VirtualDisplay zzbe>
		}
	//   39   79:return          
	}

	static VirtualDisplay zza(zzdq zzdq1, VirtualDisplay virtualdisplay)
	{
		zzdq1.zzbe = virtualdisplay;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field VirtualDisplay zzbe>
		return virtualdisplay;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void zza(zzdq zzdq1)
	{
		zzdq1.a_();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void a_()>
	//    2    4:return          
	}

	static zzeg zzb(zzdq zzdq1)
	{
		return zzdq1.zzxt;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzeg zzxt>
	//    2    4:areturn         
	}

	static Api zzc(zzdq zzdq1)
	{
		return zzdq1.zzxs;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Api zzxs>
	//    2    4:areturn         
	}

	static VirtualDisplay zzd(zzdq zzdq1)
	{
		return zzdq1.zzbe;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field VirtualDisplay zzbe>
	//    2    4:areturn         
	}

	static zzdg zzdd()
	{
		return zzbd;
	//    0    0:getstatic       #28  <Field zzdg zzbd>
	//    1    3:areturn         
	}

	public final PendingResult startRemoteDisplay(GoogleApiClient googleapiclient, String s)
	{
		zzbd.d("startRemoteDisplay", new Object[0]);
	//    0    0:getstatic       #28  <Field zzdg zzbd>
	//    1    3:ldc1            #100 <String "startRemoteDisplay">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #81  <Method void zzdg.d(String, Object[])>
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzds(this, googleapiclient, s))))));
	//    5   12:aload_1         
	//    6   13:new             #102 <Class zzds>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokespecial   #105 <Method void zzds(zzdq, GoogleApiClient, String)>
	//   12   23:invokevirtual   #111 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   13   26:areturn         
	}

	public final PendingResult stopRemoteDisplay(GoogleApiClient googleapiclient)
	{
		zzbd.d("stopRemoteDisplay", new Object[0]);
	//    0    0:getstatic       #28  <Field zzdg zzbd>
	//    1    3:ldc1            #116 <String "stopRemoteDisplay">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #81  <Method void zzdg.d(String, Object[])>
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzdt(this, googleapiclient))))));
	//    5   12:aload_1         
	//    6   13:new             #118 <Class zzdt>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #121 <Method void zzdt(zzdq, GoogleApiClient)>
	//   11   22:invokevirtual   #111 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   12   25:areturn         
	}

	private static final zzdg zzbd = new zzdg("CastRemoteDisplayApiImpl");
	private VirtualDisplay zzbe;
	private Api zzxs;
	private final zzeg zzxt = new zzdr(this);

	static 
	{
	//    0    0:new             #20  <Class zzdg>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "CastRemoteDisplayApiImpl">
	//    3    6:invokespecial   #26  <Method void zzdg(String)>
	//    4    9:putstatic       #28  <Field zzdg zzbd>
	//*   5   12:return          
	}
}
