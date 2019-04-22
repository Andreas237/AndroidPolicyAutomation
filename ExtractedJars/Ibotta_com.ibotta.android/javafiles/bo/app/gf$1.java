// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			gf, er, fr

class gf$1
	implements Runnable
{

	public void run()
	{
		a.a(gf.a(d), gf.b(d), b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field er a>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field gf d>
	//    4    8:invokestatic    #36  <Method android.content.Context gf.a(gf)>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field gf d>
	//    7   15:invokestatic    #39  <Method ad gf.b(gf)>
	//    8   18:aload_0         
	//    9   19:getfield        #26  <Field fr b>
	//   10   22:aload_0         
	//   11   23:getfield        #28  <Field long c>
	//   12   26:invokeinterface #44  <Method void er.a(android.content.Context, ad, fr, long)>
	//   13   31:return          
	}

	final er a;
	final fr b;
	final long c;
	final gf d;

	gf$1(gf gf1, er er1, fr fr, long l)
	{
		d = gf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field gf d>
		a = er1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field er a>
		b = fr;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field fr b>
		c = l;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #28  <Field long c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
