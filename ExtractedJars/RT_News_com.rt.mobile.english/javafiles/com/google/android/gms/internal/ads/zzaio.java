// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaiu, zzaej, zzaii, zzaiv, 
//			zzang, zzait

public final class zzaio
	implements zzaiu
{

	public zzaio(zzaiv zzaiv)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzcnc = zzaiv;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field zzaiv zzcnc>
	//    5    9:return          
	}

	public final zzait zza(Context context, zzang zzang, zzaej zzaej1)
	{
		if(zzaej1.zzcfk == null)
	//*   0    0:aload_3         
	//*   1    1:getfield        #25  <Field zzaiq zzaej.zzcfk>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return ((zzait) (new zzaii(context, zzang, zzaej1.zzcfk, zzaej1.zzbyq, zzcnc)));
	//    5    9:new             #27  <Class zzaii>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:getfield        #25  <Field zzaiq zzaej.zzcfk>
	//   11   19:aload_3         
	//   12   20:getfield        #31  <Field String zzaej.zzbyq>
	//   13   23:aload_0         
	//   14   24:getfield        #16  <Field zzaiv zzcnc>
	//   15   27:invokespecial   #34  <Method void zzaii(Context, zzang, zzaiq, String, zzaiv)>
	//   16   30:areturn         
	}

	private zzaiv zzcnc;
}
