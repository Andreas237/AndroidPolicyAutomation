// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b, au

class b$35
	implements Runnable
{

	public void run()
	{
		if(a.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field b a>
	//*   2    4:getfield        #26  <Field GLMapEngine b.f>
	//*   3    7:ifnull          51
			a.f.setIndoorBuildingToBeActive(1, a.d.activeFloorName, a.d.activeFloorIndex, a.d.poiid);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field b a>
	//    6   14:getfield        #26  <Field GLMapEngine b.f>
	//    7   17:iconst_1        
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field b a>
	//   10   22:getfield        #30  <Field au b.d>
	//   11   25:getfield        #36  <Field String au.activeFloorName>
	//   12   28:aload_0         
	//   13   29:getfield        #17  <Field b a>
	//   14   32:getfield        #30  <Field au b.d>
	//   15   35:getfield        #40  <Field int au.activeFloorIndex>
	//   16   38:aload_0         
	//   17   39:getfield        #17  <Field b a>
	//   18   42:getfield        #30  <Field au b.d>
	//   19   45:getfield        #43  <Field String au.poiid>
	//   20   48:invokevirtual   #49  <Method void GLMapEngine.setIndoorBuildingToBeActive(int, String, int, String)>
	//   21   51:return          
	}

	final b a;

	b$35(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
