// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.amap.mapcore.animation.GLAnimation;

// Referenced classes of package com.amap.api.mapcore.util:
//			do

class do$1
	implements com.amap.api.maps.model.animation.tion.AnimationListener
{

	public void onAnimationEnd()
	{
		if(com.amap.api.mapcore.util.do.a(b) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field do b>
	//*   2    4:invokestatic    #29  <Method GLAnimation do.a(do)>
	//*   3    7:ifnull          40
		{
			com.amap.api.mapcore.util.do.a(b, true);
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field do b>
	//    6   14:iconst_1        
	//    7   15:invokestatic    #32  <Method boolean do.a(do, boolean)>
	//    8   18:pop             
			com.amap.api.mapcore.util.do.a(b).startNow();
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field do b>
	//   11   23:invokestatic    #29  <Method GLAnimation do.a(do)>
	//   12   26:invokevirtual   #37  <Method void GLAnimation.startNow()>
			com.amap.api.mapcore.util.do.b(b, a);
	//   13   29:aload_0         
	//   14   30:getfield        #19  <Field do b>
	//   15   33:aload_0         
	//   16   34:getfield        #21  <Field boolean a>
	//   17   37:invokestatic    #39  <Method void do.b(do, boolean)>
		}
	//   18   40:return          
	}

	public void onAnimationStart()
	{
	//    0    0:return          
	}

	final boolean a;
	final do b;

	do$1(do do1, boolean flag)
	{
		b = do1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field do b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
