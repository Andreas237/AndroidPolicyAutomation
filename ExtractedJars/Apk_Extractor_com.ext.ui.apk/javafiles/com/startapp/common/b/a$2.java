// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.common.b;

import com.startapp.common.b.a.b;

// Referenced classes of package com.startapp.common.b:
//			a, b

static final class a$2
	implements Runnable
{

	public void run()
	{
		a.a(b(com.startapp.common.b.a.a()), b, c.b(), new com.startapp.common.b.a.b.b() {

			public void a(com.startapp.common.b.a.b.a a1)
			{
				com.startapp.common.b.a.a(3, "RunnerManager", (new StringBuilder()).append("job.execute ").append(a.c.a()).append(" ").append(((Object) (a1))).toString());
			//    0    0:iconst_3        
			//    1    1:ldc1            #23  <String "RunnerManager">
			//    2    3:new             #25  <Class StringBuilder>
			//    3    6:dup             
			//    4    7:invokespecial   #26  <Method void StringBuilder()>
			//    5   10:ldc1            #28  <String "job.execute ">
			//    6   12:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
			//    7   15:aload_0         
			//    8   16:getfield        #17  <Field a$2 a>
			//    9   19:getfield        #36  <Field com.startapp.common.b.b a$2.c>
			//   10   22:invokevirtual   #41  <Method int b.a()>
			//   11   25:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
			//   12   28:ldc1            #46  <String " ">
			//   13   30:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
			//   14   33:aload_1         
			//   15   34:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
			//   16   37:invokevirtual   #53  <Method String StringBuilder.toString()>
			//   17   40:invokestatic    #58  <Method void a.a(int, String, String)>
				if(a1 == com.startapp.common.b.a.b.a.c && !a.c.e())
			//*  18   43:aload_1         
			//*  19   44:getstatic       #63  <Field com.startapp.common.b.a.b$a com.startapp.common.b.a.b$a.c>
			//*  20   47:if_acmpne       74
			//*  21   50:aload_0         
			//*  22   51:getfield        #17  <Field a$2 a>
			//*  23   54:getfield        #36  <Field com.startapp.common.b.b a$2.c>
			//*  24   57:invokevirtual   #67  <Method boolean b.e()>
			//*  25   60:ifne            74
					com.startapp.common.b.a.a(a.c);
			//   26   63:aload_0         
			//   27   64:getfield        #17  <Field a$2 a>
			//   28   67:getfield        #36  <Field com.startapp.common.b.b a$2.c>
			//   29   70:invokestatic    #70  <Method boolean a.a(com.startapp.common.b.b)>
			//   30   73:pop             
				a.d.a(a1);
			//   31   74:aload_0         
			//   32   75:getfield        #17  <Field a$2 a>
			//   33   78:getfield        #74  <Field com.startapp.common.b.a.b$b a$2.d>
			//   34   81:aload_1         
			//   35   82:invokeinterface #76  <Method void com.startapp.common.b.a.b$b.a(com.startapp.common.b.a.b$a)>
			//   36   87:return          
			}

			final a._cls2 a;

			
			{
				a = a._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field a$2 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field b a>
	//    2    4:invokestatic    #38  <Method a a.a()>
	//    3    7:invokestatic    #41  <Method android.content.Context b(a)>
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field int b>
	//    6   14:aload_0         
	//    7   15:getfield        #28  <Field com.startapp.common.b.b c>
	//    8   18:invokevirtual   #46  <Method java.util.Map com.startapp.common.b.b.b()>
	//    9   21:new             #13  <Class a$2$1>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:invokespecial   #49  <Method void a$2$1(a$2)>
	//   13   29:invokeinterface #54  <Method void b.a(android.content.Context, int, java.util.Map, com.startapp.common.b.a.b$b)>
	//   14   34:return          
	}

	final b a;
	final int b;
	final com.startapp.common.b.b c;
	final com.startapp.common.b.a.b$b d;

	a$2(b b1, int i, com.startapp.common.b.b b2, com.startapp.common.b.a.b$b b$b)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field b a>
		b = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #26  <Field int b>
		c = b2;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field com.startapp.common.b.b c>
		d = b$b;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field com.startapp.common.b.a.b$b d>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
