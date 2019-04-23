// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.am;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			bt, bv, ee, el, 
//			et, ez

class ec extends bt
	implements bv
{

	ec(ee ee1)
	{
		super(ee1.p());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #16  <Method ax ee.p()>
	//    3    5:invokespecial   #19  <Method void bt(ax)>
		am.a(((Object) (ee1)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #24  <Method Object am.a(Object)>
	//    6   12:pop             
		a = ee1;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #26  <Field ee a>
	//   10   18:return          
	}

	public el g()
	{
		return a.g();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ee a>
	//    2    4:invokevirtual   #31  <Method el ee.g()>
	//    3    7:areturn         
	}

	public et h()
	{
		return a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ee a>
	//    2    4:invokevirtual   #36  <Method et ee.e()>
	//    3    7:areturn         
	}

	public ez i()
	{
		return a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ee a>
	//    2    4:invokevirtual   #41  <Method ez ee.d()>
	//    3    7:areturn         
	}

	protected final ee a;
}
