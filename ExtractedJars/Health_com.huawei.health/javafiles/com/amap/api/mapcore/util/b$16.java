// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b, fm

class b$16
	implements Runnable
{

	public void run()
	{
		if(com.amap.api.mapcore.util.b.r(b))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field b b>
	//*   2    4:invokestatic    #31  <Method boolean b.r(b)>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		try
		{
			if(b.d != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #19  <Field b b>
	//*   7   15:getfield        #35  <Field au b.d>
	//*   8   18:ifnull          35
				b.setIndoorBuildingInfo(((com.amap.api.maps.model.IndoorBuildingInfo) (b.d)));
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field b b>
	//   11   25:aload_0         
	//   12   26:getfield        #19  <Field b b>
	//   13   29:getfield        #35  <Field au b.d>
	//   14   32:invokevirtual   #39  <Method void b.setIndoorBuildingInfo(com.amap.api.maps.model.IndoorBuildingInfo)>
		}
	//*  15   35:goto            43
		catch(Throwable throwable)
	//*  16   38:astore_1        
		{
			throwable.printStackTrace();
	//   17   39:aload_1         
	//   18   40:invokevirtual   #42  <Method void Throwable.printStackTrace()>
		}
		a.a(false);
	//   19   43:aload_0         
	//   20   44:getfield        #21  <Field fm a>
	//   21   47:iconst_0        
	//   22   48:invokevirtual   #47  <Method void fm.a(boolean)>
	//   23   51:return          
	}

	final fm a;
	final b b;

	b$16(b b1, fm fm1)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field b b>
		a = fm1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field fm a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
