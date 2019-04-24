// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaid, zzahu, zzaia, zzaht, 
//			zzahw, zzaig

public final class zzahv extends zzaid
{

	public zzahv(zzahu zzahu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzaid()>
		zzcmb = zzahu1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field zzahu zzcmb>
	//    5    9:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper, zzaig zzaig)
	{
		if(zzcmb != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field zzahu zzcmb>
	//*   2    4:ifnull          17
			zzcmb.zzc(zzaig);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field zzahu zzcmb>
	//    5   11:aload_2         
	//    6   12:invokeinterface #29  <Method void zzahu.zzc(zzaig)>
	//    7   17:return          
	}

	public final void zza(zzaht zzaht1)
	{
		zzcma = zzaht1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field zzaht zzcma>
	//    3    5:return          
	}

	public final void zza(zzahw zzahw1)
	{
		zzclm = zzahw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field zzahw zzclm>
	//    3    5:return          
	}

	public final void zza(zzaia zzaia1)
	{
		zzcmc = zzaia1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field zzaia zzcmc>
	//    3    5:return          
	}

	public final void zzc(Bundle bundle)
	{
		if(zzcmc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field zzaia zzcmc>
	//*   2    4:ifnull          17
			zzcmc.zzc(bundle);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field zzaia zzcmc>
	//    5   11:aload_1         
	//    6   12:invokeinterface #43  <Method void zzaia.zzc(Bundle)>
	//    7   17:return          
	}

	public final void zzc(IObjectWrapper iobjectwrapper, int i)
	{
		if(zzcma != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field zzaht zzcma>
	//*   2    4:ifnull          17
			zzcma.zzac(i);
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field zzaht zzcma>
	//    5   11:iload_2         
	//    6   12:invokeinterface #50  <Method void zzaht.zzac(int)>
	//    7   17:return          
	}

	public final void zzd(IObjectWrapper iobjectwrapper, int i)
	{
		if(zzclm != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field zzahw zzclm>
	//*   2    4:ifnull          27
			zzclm.zza(ObjectWrapper.unwrap(iobjectwrapper).getClass().getName(), i);
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field zzahw zzclm>
	//    5   11:aload_1         
	//    6   12:invokestatic    #57  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    7   15:invokevirtual   #63  <Method Class Object.getClass()>
	//    8   18:invokevirtual   #69  <Method String Class.getName()>
	//    9   21:iload_2         
	//   10   22:invokeinterface #74  <Method void zzahw.zza(String, int)>
	//   11   27:return          
	}

	public final void zzq(IObjectWrapper iobjectwrapper)
	{
		if(zzcma != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field zzaht zzcma>
	//*   2    4:ifnull          16
			zzcma.zzpc();
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field zzaht zzcma>
	//    5   11:invokeinterface #79  <Method void zzaht.zzpc()>
	//    6   16:return          
	}

	public final void zzr(IObjectWrapper iobjectwrapper)
	{
		if(zzclm != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field zzahw zzclm>
	//*   2    4:ifnull          26
			zzclm.zzcb(ObjectWrapper.unwrap(iobjectwrapper).getClass().getName());
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field zzahw zzclm>
	//    5   11:aload_1         
	//    6   12:invokestatic    #57  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    7   15:invokevirtual   #63  <Method Class Object.getClass()>
	//    8   18:invokevirtual   #69  <Method String Class.getName()>
	//    9   21:invokeinterface #84  <Method void zzahw.zzcb(String)>
	//   10   26:return          
	}

	public final void zzs(IObjectWrapper iobjectwrapper)
	{
		if(zzcmb != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field zzahu zzcmb>
	//*   2    4:ifnull          16
			zzcmb.onRewardedVideoAdOpened();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field zzahu zzcmb>
	//    5   11:invokeinterface #88  <Method void zzahu.onRewardedVideoAdOpened()>
	//    6   16:return          
	}

	public final void zzt(IObjectWrapper iobjectwrapper)
	{
		if(zzcmb != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field zzahu zzcmb>
	//*   2    4:ifnull          16
			zzcmb.onRewardedVideoStarted();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field zzahu zzcmb>
	//    5   11:invokeinterface #92  <Method void zzahu.onRewardedVideoStarted()>
	//    6   16:return          
	}

	public final void zzu(IObjectWrapper iobjectwrapper)
	{
		if(zzcmb != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field zzahu zzcmb>
	//*   2    4:ifnull          16
			zzcmb.onRewardedVideoAdClosed();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field zzahu zzcmb>
	//    5   11:invokeinterface #96  <Method void zzahu.onRewardedVideoAdClosed()>
	//    6   16:return          
	}

	public final void zzv(IObjectWrapper iobjectwrapper)
	{
		if(zzcmb != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field zzahu zzcmb>
	//*   2    4:ifnull          16
			zzcmb.zzdm();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field zzahu zzcmb>
	//    5   11:invokeinterface #100 <Method void zzahu.zzdm()>
	//    6   16:return          
	}

	public final void zzw(IObjectWrapper iobjectwrapper)
	{
		if(zzcmb != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field zzahu zzcmb>
	//*   2    4:ifnull          16
			zzcmb.onRewardedVideoAdLeftApplication();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field zzahu zzcmb>
	//    5   11:invokeinterface #104 <Method void zzahu.onRewardedVideoAdLeftApplication()>
	//    6   16:return          
	}

	public final void zzx(IObjectWrapper iobjectwrapper)
	{
		if(zzcmb != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field zzahu zzcmb>
	//*   2    4:ifnull          16
			zzcmb.onRewardedVideoCompleted();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field zzahu zzcmb>
	//    5   11:invokeinterface #108 <Method void zzahu.onRewardedVideoCompleted()>
	//    6   16:return          
	}

	private volatile zzahw zzclm;
	private volatile zzaht zzcma;
	private volatile zzahu zzcmb;
	private volatile zzaia zzcmc;
}
