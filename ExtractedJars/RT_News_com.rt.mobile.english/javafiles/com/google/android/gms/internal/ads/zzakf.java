// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakg, zzakd, zzakh

final class zzakf extends zzakg
{

	zzakf(zzakd zzakd1, Bundle bundle)
	{
		zzcrh = zzakd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzakd zzcrh>
		zzcri = bundle;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field Bundle zzcri>
		super(((zzake) (null)));
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #17  <Method void zzakg(zzake)>
	//    9   15:return          
	}

	public final void zzdn()
	{
		for(Iterator iterator = zzakd.zzr(zzcrh).iterator(); iterator.hasNext(); ((zzakh)iterator.next()).zzd(zzcri));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzakd zzcrh>
	//    2    4:invokestatic    #26  <Method CopyOnWriteArraySet zzakd.zzr(zzakd)>
	//    3    7:invokevirtual   #32  <Method Iterator CopyOnWriteArraySet.iterator()>
	//    4   10:astore_1        
	//    5   11:aload_1         
	//    6   12:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            41
	//    8   20:aload_1         
	//    9   21:invokeinterface #42  <Method Object Iterator.next()>
	//   10   26:checkcast       #44  <Class zzakh>
	//   11   29:aload_0         
	//   12   30:getfield        #14  <Field Bundle zzcri>
	//   13   33:invokeinterface #48  <Method void zzakh.zzd(Bundle)>
	//*  14   38:goto            11
	//   15   41:return          
	}

	private final zzakd zzcrh;
	private final Bundle zzcri;
}
