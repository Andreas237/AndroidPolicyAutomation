// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;


// Referenced classes of package com.irobot.a:
//			g, h, d

class g$15
	implements g.h
{

	public void a(byte abyte0[], d d)
	{
		if(d != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          26
		{
			((g.e)a.a).c(a, (byte)0, d);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field g a>
	//    4    8:getfield        #24  <Field g$f g.a>
	//    5   11:checkcast       #26  <Class g$e>
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field g a>
	//    8   18:iconst_0        
	//    9   19:aload_2         
	//   10   20:invokeinterface #30  <Method void g$e.c(g, byte, d)>
			return;
	//   11   25:return          
		}
		if(abyte0 != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          85
		{
			Object obj = ((Object) (new h()));
	//   14   30:new             #32  <Class h>
	//   15   33:dup             
	//   16   34:invokespecial   #33  <Method void h()>
	//   17   37:astore_3        
			obj.getClass();
	//   18   38:aload_3         
	//   19   39:invokevirtual   #37  <Method Class Object.getClass()>
	//   20   42:pop             
			obj = ((Object) (new h.g(((h) (obj)))));
	//   21   43:new             #39  <Class h$g>
	//   22   46:dup             
	//   23   47:aload_3         
	//   24   48:invokespecial   #42  <Method void h$g(h)>
	//   25   51:astore_3        
			((h.g) (obj)).a(abyte0);
	//   26   52:aload_3         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #45  <Method void h$g.a(byte[])>
			((h.g) (obj)).b();
	//   29   57:aload_3         
	//   30   58:invokevirtual   #48  <Method void h$g.b()>
			((g.e)a.a).c(a, ((h.g) (obj)).a, d);
	//   31   61:aload_0         
	//   32   62:getfield        #17  <Field g a>
	//   33   65:getfield        #24  <Field g$f g.a>
	//   34   68:checkcast       #26  <Class g$e>
	//   35   71:aload_0         
	//   36   72:getfield        #17  <Field g a>
	//   37   75:aload_3         
	//   38   76:getfield        #51  <Field byte h$g.a>
	//   39   79:aload_2         
	//   40   80:invokeinterface #30  <Method void g$e.c(g, byte, d)>
		}
	//   41   85:return          
	}

	final g a;

	g$15(g g1)
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
