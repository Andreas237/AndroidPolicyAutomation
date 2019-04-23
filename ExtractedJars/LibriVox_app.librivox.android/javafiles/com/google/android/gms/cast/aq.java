// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.w;
import com.google.android.gms.internal.cast.ac;
import com.google.android.gms.internal.cast.v;

// Referenced classes of package com.google.android.gms.cast:
//			i, zzag, d

final class aq extends i
{

	aq(d d1, w w, String s, String s1, zzag zzag)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #13  <Field String a>
		b = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #15  <Field String b>
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #17  <Field zzag d>
		super(w);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #20  <Method void i(w)>
	//   12   21:return          
	}

	public final void a(c c)
	{
		((i)this).a((ac)c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class ac>
	//    3    5:invokevirtual   #27  <Method void i.a(ac)>
	//    4    8:return          
	}

	public final void a(ac ac1)
	{
		try
		{
			ac1.a(a, b, d, ((com.google.android.gms.common.api.internal.f) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field String a>
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field String b>
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field zzag d>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #32  <Method void ac.a(String, String, zzag, com.google.android.gms.common.api.internal.f)>
			return;
	//    9   17:return          
		}
	//*  10   18:aload_0         
	//*  11   19:sipush          2001
	//*  12   22:invokevirtual   #37  <Method void v.a(int)>
	//*  13   25:return          
		// Misplaced declaration of an exception variable
		catch(ac ac1)
		{
			((v)this).a(2001);
		}
	//*  14   26:astore_1        
	//*  15   27:goto            18
	}

	private final String a;
	private final String b;
	private final zzag d = null;
}
