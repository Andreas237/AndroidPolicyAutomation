// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			vp, zzasm, ve, vq, 
//			zzbbi, vo

public final class vk
	implements vp
{

	public vk(vq vq)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = vq;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field vq a>
	//    5    9:return          
	}

	public final vo a(Context context, zzbbi zzbbi, zzasm zzasm1)
	{
		if(zzasm1.K == null)
	//*   0    0:aload_3         
	//*   1    1:getfield        #24  <Field zzawo zzasm.K>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return ((vo) (new ve(context, zzbbi, zzasm1.K, zzasm1.a, a)));
	//    5    9:new             #26  <Class ve>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:getfield        #24  <Field zzawo zzasm.K>
	//   11   19:aload_3         
	//   12   20:getfield        #29  <Field String zzasm.a>
	//   13   23:aload_0         
	//   14   24:getfield        #16  <Field vq a>
	//   15   27:invokespecial   #32  <Method void ve(Context, zzbbi, zzawo, String, vq)>
	//   16   30:areturn         
	}

	private vq a;
}
