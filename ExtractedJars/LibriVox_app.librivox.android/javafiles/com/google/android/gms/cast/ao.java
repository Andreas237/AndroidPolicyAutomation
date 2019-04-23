// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.w;
import com.google.android.gms.internal.cast.*;

// Referenced classes of package com.google.android.gms.cast:
//			d

final class ao extends al
{

	ao(d d, w w, String s, String s1)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #11  <Field String a>
		b = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #13  <Field String b>
		super(w);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #16  <Method void al(w)>
	//    9   16:return          
	}

	public final void a(c c)
	{
		((al)this).a((ac)c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class ac>
	//    3    5:invokevirtual   #23  <Method void al.a(ac)>
	//    4    8:return          
	}

	public final void a(ac ac1)
	{
		try
		{
			ac1.a(a, b, ((com.google.android.gms.common.api.internal.f) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #11  <Field String a>
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field String b>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #30  <Method void ac.a(String, String, com.google.android.gms.common.api.internal.f)>
			return;
	//    7   13:return          
		}
	//*   8   14:aload_0         
	//*   9   15:sipush          2001
	//*  10   18:invokevirtual   #35  <Method void v.a(int)>
	//*  11   21:return          
		// Misplaced declaration of an exception variable
		catch(ac ac1)
		{
			((v)this).a(2001);
		}
	//*  12   22:astore_1        
	//*  13   23:goto            14
	}

	private final String a;
	private final String b;
}
