// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.common.util.Predicate;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzvd

final class zzuy
	implements Predicate
{

	zzuy(zzv zzv1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzbps = zzv1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzv zzbps>
	//    5    9:return          
	}

	public final boolean apply(Object obj)
	{
		zzv zzv1 = zzbps;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzv zzbps>
	//    2    4:astore_2        
		obj = ((Object) ((zzv)obj));
	//    3    5:aload_1         
	//    4    6:checkcast       #20  <Class zzv>
	//    5    9:astore_1        
		return (obj instanceof zzvd) && ((Object) (zzvd.zza((zzvd)obj))).equals(((Object) (zzv1)));
	//    6   10:aload_1         
	//    7   11:instanceof      #22  <Class zzvd>
	//    8   14:ifeq            33
	//    9   17:aload_1         
	//   10   18:checkcast       #22  <Class zzvd>
	//   11   21:invokestatic    #26  <Method zzv zzvd.zza(zzvd)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #29  <Method boolean Object.equals(Object)>
	//   14   28:ifeq            33
	//   15   31:iconst_1        
	//   16   32:ireturn         
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	private final zzv zzbps;
}
