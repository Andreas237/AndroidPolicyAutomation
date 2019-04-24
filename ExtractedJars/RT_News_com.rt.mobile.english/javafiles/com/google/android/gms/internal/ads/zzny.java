// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzaf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzob

public final class zzny extends zzob
{

	public zzny(zzaf zzaf1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzob()>
		zzbgs = zzaf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzaf zzbgs>
		zzbgt = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String zzbgt>
		zzbgu = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field String zzbgu>
	//   11   19:return          
	}

	public final String getContent()
	{
		return zzbgu;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String zzbgu>
	//    2    4:areturn         
	}

	public final void recordClick()
	{
		zzbgs.zzcn();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzaf zzbgs>
	//    2    4:invokeinterface #33  <Method void zzaf.zzcn()>
	//    3    9:return          
	}

	public final void recordImpression()
	{
		zzbgs.zzco();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzaf zzbgs>
	//    2    4:invokeinterface #37  <Method void zzaf.zzco()>
	//    3    9:return          
	}

	public final void zzg(IObjectWrapper iobjectwrapper)
	{
		if(iobjectwrapper == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			zzbgs.zzh((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field zzaf zzbgs>
	//    5    9:aload_1         
	//    6   10:invokestatic    #45  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    7   13:checkcast       #47  <Class View>
	//    8   16:invokeinterface #51  <Method void zzaf.zzh(View)>
			return;
	//    9   21:return          
		}
	}

	public final String zzjn()
	{
		return zzbgt;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String zzbgt>
	//    2    4:areturn         
	}

	private final zzaf zzbgs;
	private final String zzbgt;
	private final String zzbgu;
}
