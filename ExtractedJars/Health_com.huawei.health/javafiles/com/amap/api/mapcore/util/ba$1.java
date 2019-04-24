// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			ba, ay

class ba$1
	implements Runnable
{

	public void run()
	{
		if(a.b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field ay a>
	//*   2    4:invokevirtual   #33  <Method boolean ay.b()>
	//*   3    7:ifeq            11
		{
			return;
	//    4   10:return          
		} else
		{
			a.a();
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field ay a>
	//    7   15:invokevirtual   #35  <Method void ay.a()>
			ba.a(c).remove(((Object) (b)));
	//    8   18:aload_0         
	//    9   19:getfield        #20  <Field ba c>
	//   10   22:invokestatic    #38  <Method List ba.a(ba)>
	//   11   25:aload_0         
	//   12   26:getfield        #24  <Field String b>
	//   13   29:invokeinterface #44  <Method boolean List.remove(Object)>
	//   14   34:pop             
			return;
	//   15   35:return          
		}
	}

	final ay a;
	final String b;
	final ba c;

	ba$1(ba ba1, ay ay1, String s)
	{
		c = ba1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ba c>
		a = ay1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ay a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
