// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.config;

import android.content.Context;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.w;

// Referenced classes of package com.google.android.gms.internal.config:
//			am, bd, g

abstract class ay extends e
{

	public ay(w w)
	{
		super(am.a, w);
	//    0    0:aload_0         
	//    1    1:getstatic       #12  <Field com.google.android.gms.common.api.a am.a>
	//    2    4:aload_1         
	//    3    5:invokespecial   #15  <Method void e(com.google.android.gms.common.api.a, w)>
	//    4    8:return          
	}

	protected abstract void a(Context context, g g1);

	protected void a(c c)
	{
		c = ((c) ((bd)c));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class bd>
	//    2    4:astore_1        
		a(((bd) (c)).r(), (g)((bd) (c)).x());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #24  <Method Context bd.r()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #28  <Method android.os.IInterface bd.x()>
	//    8   14:checkcast       #30  <Class g>
	//    9   17:invokevirtual   #32  <Method void a(Context, g)>
	//   10   20:return          
	}
}
