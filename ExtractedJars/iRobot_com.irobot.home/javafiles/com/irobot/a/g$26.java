// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;


// Referenced classes of package com.irobot.a:
//			g, h, d

class g$26
	implements g.h
{

	public void a(byte abyte0[], d d)
	{
		if(d != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          29
		{
			((g.e)a.a).a(a, (byte)0, (byte)0, (byte)0, (byte)0, d);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field g a>
	//    4    8:getfield        #24  <Field g$f g.a>
	//    5   11:checkcast       #26  <Class g$e>
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field g a>
	//    8   18:iconst_0        
	//    9   19:iconst_0        
	//   10   20:iconst_0        
	//   11   21:iconst_0        
	//   12   22:aload_2         
	//   13   23:invokeinterface #29  <Method void g$e.a(g, byte, byte, byte, byte, d)>
			return;
	//   14   28:return          
		}
		if(abyte0 != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          100
		{
			Object obj = ((Object) (new h()));
	//   17   33:new             #31  <Class h>
	//   18   36:dup             
	//   19   37:invokespecial   #32  <Method void h()>
	//   20   40:astore_3        
			obj.getClass();
	//   21   41:aload_3         
	//   22   42:invokevirtual   #36  <Method Class Object.getClass()>
	//   23   45:pop             
			obj = ((Object) (new h.q(((h) (obj)))));
	//   24   46:new             #38  <Class h$q>
	//   25   49:dup             
	//   26   50:aload_3         
	//   27   51:invokespecial   #41  <Method void h$q(h)>
	//   28   54:astore_3        
			((h.q) (obj)).a(abyte0);
	//   29   55:aload_3         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #44  <Method void h$q.a(byte[])>
			((h.q) (obj)).b();
	//   32   60:aload_3         
	//   33   61:invokevirtual   #47  <Method void h$q.b()>
			((g.e)a.a).a(a, ((h.q) (obj)).a, ((h.q) (obj)).b, ((h.q) (obj)).c, ((h.q) (obj)).d, d);
	//   34   64:aload_0         
	//   35   65:getfield        #17  <Field g a>
	//   36   68:getfield        #24  <Field g$f g.a>
	//   37   71:checkcast       #26  <Class g$e>
	//   38   74:aload_0         
	//   39   75:getfield        #17  <Field g a>
	//   40   78:aload_3         
	//   41   79:getfield        #50  <Field byte h$q.a>
	//   42   82:aload_3         
	//   43   83:getfield        #52  <Field byte h$q.b>
	//   44   86:aload_3         
	//   45   87:getfield        #55  <Field byte h$q.c>
	//   46   90:aload_3         
	//   47   91:getfield        #58  <Field byte h$q.d>
	//   48   94:aload_2         
	//   49   95:invokeinterface #29  <Method void g$e.a(g, byte, byte, byte, byte, d)>
		}
	//   50  100:return          
	}

	final g a;

	g$26(g g1)
	{
		a = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field g a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
