// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;


// Referenced classes of package com.irobot.a:
//			g, j, i, d

class g$21
	implements j.a
{

	public void a(j.b b1)
	{
		b.d("sendRobotCommand completed");
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field g b>
	//    2    4:ldc1            #27  <String "sendRobotCommand completed">
	//    3    6:invokevirtual   #31  <Method void g.d(String)>
		byte abyte0[] = b.y.a();
	//    4    9:aload_0         
	//    5   10:getfield        #18  <Field g b>
	//    6   13:getfield        #35  <Field j g.y>
	//    7   16:invokeinterface #40  <Method byte[] j.a()>
	//    8   21:astore_2        
		g.a a1 = ((i)b.y).b();
	//    9   22:aload_0         
	//   10   23:getfield        #18  <Field g b>
	//   11   26:getfield        #35  <Field j g.y>
	//   12   29:checkcast       #42  <Class i>
	//   13   32:invokevirtual   #45  <Method g$a i.b()>
	//   14   35:astore_3        
		b.y = null;
	//   15   36:aload_0         
	//   16   37:getfield        #18  <Field g b>
	//   17   40:aconst_null     
	//   18   41:putfield        #35  <Field j g.y>
		if(b1 != j.b.XFER_OK)
	//*  19   44:aload_1         
	//*  20   45:getstatic       #51  <Field j$b j$b.XFER_OK>
	//*  21   48:if_acmpeq       132
		{
			abyte0 = ((byte []) (b));
	//   22   51:aload_0         
	//   23   52:getfield        #18  <Field g b>
	//   24   55:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   25   56:new             #53  <Class StringBuilder>
	//   26   59:dup             
	//   27   60:invokespecial   #54  <Method void StringBuilder()>
	//   28   63:astore          4
			stringbuilder.append("sendRobotCommand completed with error ");
	//   29   65:aload           4
	//   30   67:ldc1            #56  <String "sendRobotCommand completed with error ">
	//   31   69:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   32   72:pop             
			stringbuilder.append(((Object) (b1)));
	//   33   73:aload           4
	//   34   75:aload_1         
	//   35   76:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   36   79:pop             
			((g) (abyte0)).d(stringbuilder.toString());
	//   37   80:aload_2         
	//   38   81:aload           4
	//   39   83:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   40   86:invokevirtual   #31  <Method void g.d(String)>
			if(b1 == j.b.CANCELLED)
	//*  41   89:aload_1         
	//*  42   90:getstatic       #70  <Field j$b j$b.CANCELLED>
	//*  43   93:if_acmpne       103
				abyte0 = ((byte []) (d.a.ALOperationCancelledError));
	//   44   96:getstatic       #76  <Field d$a d$a.ALOperationCancelledError>
	//   45   99:astore_2        
			else
	//*  46  100:goto            107
				abyte0 = ((byte []) (d.a.ALOperationFailedError));
	//   47  103:getstatic       #79  <Field d$a d$a.ALOperationFailedError>
	//   48  106:astore_2        
			abyte0 = ((byte []) (new d(((d.a) (abyte0)), "")));
	//   49  107:new             #81  <Class d>
	//   50  110:dup             
	//   51  111:aload_2         
	//   52  112:ldc1            #83  <String "">
	//   53  114:invokespecial   #86  <Method void d(d$a, String)>
	//   54  117:astore_2        
			a.a(((byte []) (null)), ((d) (abyte0)));
	//   55  118:aload_0         
	//   56  119:getfield        #20  <Field g$h a>
	//   57  122:aconst_null     
	//   58  123:aload_2         
	//   59  124:invokeinterface #91  <Method void g$h.a(byte[], d)>
		} else
	//*  60  129:goto            143
		{
			a.a(abyte0, ((d) (null)));
	//   61  132:aload_0         
	//   62  133:getfield        #20  <Field g$h a>
	//   63  136:aload_2         
	//   64  137:aconst_null     
	//   65  138:invokeinterface #91  <Method void g$h.a(byte[], d)>
		}
		if(b1 == j.b.CANCELLED && a1 != null)
	//*  66  143:aload_1         
	//*  67  144:getstatic       #70  <Field j$b j$b.CANCELLED>
	//*  68  147:if_acmpne       160
	//*  69  150:aload_3         
	//*  70  151:ifnull          160
			a1.a();
	//   71  154:aload_3         
	//   72  155:invokeinterface #95  <Method void g$a.a()>
	//   73  160:return          
	}

	final g.h a;
	final g b;

	g$21(g g1, g.h h)
	{
		b = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field g b>
		a = h;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field g$h a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
