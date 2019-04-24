// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.Map;

// Referenced classes of package o:
//			dd, ed

class eb
	implements Runnable
{

	eb(ed ed1, Map map, ed.d d)
	{
		c = ed1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ed c>
		b = map;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Map b>
		a = d;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field ed$d a>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public void run()
	{
		(new dd(ed.b(c))).a(b);
	//    0    0:new             #27  <Class dd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ed c>
	//    4    8:invokestatic    #32  <Method android.content.Context ed.b(ed)>
	//    5   11:invokespecial   #35  <Method void dd(android.content.Context)>
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field Map b>
	//    8   18:invokevirtual   #38  <Method int dd.a(Map)>
	//    9   21:pop             
		if(a != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #20  <Field ed$d a>
	//*  12   26:ifnull          45
			a.a(c.b());
	//   13   29:aload_0         
	//   14   30:getfield        #20  <Field ed$d a>
	//   15   33:aload_0         
	//   16   34:getfield        #16  <Field ed c>
	//   17   37:invokevirtual   #41  <Method ed$a ed.b()>
	//   18   40:invokeinterface #46  <Method void ed$d.a(ed$a)>
	//   19   45:return          
	}

	final ed.d a;
	final Map b;
	final ed c;
}
