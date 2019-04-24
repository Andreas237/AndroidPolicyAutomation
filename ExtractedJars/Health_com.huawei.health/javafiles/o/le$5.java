// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			le, oa

class le$5
	implements Runnable
{

	public void run()
	{
		a.O.a(e, c, d, b);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field le a>
	//    2    4:getfield        #39  <Field oa le.O>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field float e>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field float c>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field float d>
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field float b>
	//   11   23:invokevirtual   #43  <Method void oa.a(float, float, float, float)>
		a.g();
	//   12   26:aload_0         
	//   13   27:getfield        #22  <Field le a>
	//   14   30:invokevirtual   #46  <Method void le.g()>
		a.i();
	//   15   33:aload_0         
	//   16   34:getfield        #22  <Field le a>
	//   17   37:invokevirtual   #49  <Method void le.i()>
	//   18   40:return          
	}

	final le a;
	final float b;
	final float c;
	final float d;
	final float e;

	le$5(le le1, float f, float f1, float f2, float f3)
	{
		a = le1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field le a>
		e = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #24  <Field float e>
		c = f1;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #26  <Field float c>
		d = f2;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #28  <Field float d>
		b = f3;
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:putfield        #30  <Field float b>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #33  <Method void Object()>
	//   17   31:return          
	}
}
