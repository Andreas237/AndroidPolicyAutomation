// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzei, zzdi, zzba, zzcz

public final class zzec extends zzei
{

	public zzec(zzcz zzcz, String s, String s1, zzba zzba1, int i, int j, zzdi zzdi1)
	{
		super(zzcz, s, s1, zzba1, i, 53);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          53
	//    7   10:invokespecial   #13  <Method void zzei(zzcz, String, String, zzba, int, int)>
		zzqx = zzdi1;
	//    8   13:aload_0         
	//    9   14:aload           7
	//   10   16:putfield        #15  <Field zzdi zzqx>
		if(zzdi1 != null)
	//*  11   19:aload           7
	//*  12   21:ifnull          33
			zzti = zzdi1.zzap();
	//   13   24:aload_0         
	//   14   25:aload           7
	//   15   27:invokevirtual   #21  <Method long zzdi.zzap()>
	//   16   30:putfield        #23  <Field long zzti>
	//   17   33:return          
	}

	protected final void zzar()
		throws IllegalAccessException, InvocationTargetException
	{
		if(zzqx != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field zzdi zzqx>
	//*   2    4:ifnull          39
			zztq.zzep = (Long)zztz.invoke(((Object) (null)), new Object[] {
				Long.valueOf(zzti)
			});
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field zzba zztq>
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field Method zztz>
	//    7   15:aconst_null     
	//    8   16:iconst_1        
	//    9   17:anewarray       Object[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field long zzti>
	//   14   26:invokestatic    #46  <Method Long Long.valueOf(long)>
	//   15   29:aastore         
	//   16   30:invokevirtual   #52  <Method Object Method.invoke(Object, Object[])>
	//   17   33:checkcast       #42  <Class Long>
	//   18   36:putfield        #58  <Field Long zzba.zzep>
	//   19   39:return          
	}

	private final zzdi zzqx;
	private long zzti;
}
