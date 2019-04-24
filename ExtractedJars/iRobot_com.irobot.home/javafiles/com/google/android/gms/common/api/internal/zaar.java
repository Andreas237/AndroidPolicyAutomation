// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaak, zaas, zabe

final class zaar extends zac
{

	zaar(zaak zaak1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zac()>
		zagj = new WeakReference(((Object) (zaak1)));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #17  <Method void WeakReference(Object)>
	//    7   13:putfield        #19  <Field WeakReference zagj>
	//    8   16:return          
	}

	public final void zab(zaj zaj)
	{
		zaak zaak1 = (zaak)zagj.get();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field WeakReference zagj>
	//    2    4:invokevirtual   #26  <Method Object WeakReference.get()>
	//    3    7:checkcast       #28  <Class zaak>
	//    4   10:astore_2        
		if(zaak1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zaak.zad(zaak1).zaa(((zabf) (new zaas(this, ((zabd) (zaak1)), zaak1, zaj))));
	//    8   16:aload_2         
	//    9   17:invokestatic    #32  <Method zabe zaak.zad(zaak)>
	//   10   20:new             #34  <Class zaas>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokespecial   #37  <Method void zaas(zaar, zabd, zaak, zaj)>
	//   17   31:invokevirtual   #43  <Method void zabe.zaa(zabf)>
			return;
	//   18   34:return          
		}
	}

	private final WeakReference zagj;
}
