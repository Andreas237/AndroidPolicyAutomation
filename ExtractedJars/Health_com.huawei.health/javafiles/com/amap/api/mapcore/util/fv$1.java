// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.View;
import com.amap.api.maps.offlinemap.OfflineMapCity;

// Referenced classes of package com.amap.api.mapcore.util:
//			fv, gc

class fv$1
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		fv.a(b).a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field fv b>
	//    2    4:invokestatic    #30  <Method gc fv.a(fv)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field OfflineMapCity a>
	//    5   11:invokevirtual   #35  <Method void gc.a(OfflineMapCity)>
	//    6   14:return          
	}

	final OfflineMapCity a;
	final fv b;

	fv$1(fv fv1, OfflineMapCity offlinemapcity)
	{
		b = fv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field fv b>
		a = offlinemapcity;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field OfflineMapCity a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
