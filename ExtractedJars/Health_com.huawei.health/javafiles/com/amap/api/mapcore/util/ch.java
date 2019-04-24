// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			cl, cb, bd

public abstract class ch
	implements cl
{

	public ch(int i, bd bd)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int a>
		b = bd;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field bd b>
	//    8   14:return          
	}

	public void a()
	{
		cb.a((new StringBuilder()).append("Wrong call delete()  State: ").append(b()).append("  ").append(((Object) (((Object)this).getClass()))).toString());
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:ldc1            #25  <String "Wrong call delete()  State: ">
	//    4    9:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #32  <Method int b()>
	//    7   16:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #37  <String "  ">
	//    9   21:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #41  <Method Class Object.getClass()>
	//   12   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #53  <Method void cb.a(String)>
	//   15   37:return          
	}

	public void a(int i)
	{
		cb.a((new StringBuilder()).append("Wrong call fail()  State: ").append(b()).append("  ").append(((Object) (((Object)this).getClass()))).toString());
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:ldc1            #56  <String "Wrong call fail()  State: ">
	//    4    9:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #32  <Method int b()>
	//    7   16:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #37  <String "  ">
	//    9   21:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #41  <Method Class Object.getClass()>
	//   12   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #53  <Method void cb.a(String)>
	//   15   37:return          
	}

	public boolean a(ch ch1)
	{
		return ch1.b() == b();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method int b()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #32  <Method int b()>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public int b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int a>
	//    2    4:ireturn         
	}

	public void b(ch ch1)
	{
		cb.a((new StringBuilder()).append(b()).append(" ==> ").append(ch1.b()).append("   ").append(((Object) (((Object)this).getClass()))).append("==>").append(((Object) (((Object) (ch1)).getClass()))).toString());
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #32  <Method int b()>
	//    5   11:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//    6   14:ldc1            #60  <String " ==> ">
	//    7   16:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_1         
	//    9   20:invokevirtual   #32  <Method int b()>
	//   10   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   11   26:ldc1            #62  <String "   ">
	//   12   28:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:aload_0         
	//   14   32:invokevirtual   #41  <Method Class Object.getClass()>
	//   15   35:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   16   38:ldc1            #64  <String "==>">
	//   17   40:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #41  <Method Class Object.getClass()>
	//   20   47:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   21   50:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   22   53:invokestatic    #53  <Method void cb.a(String)>
	//   23   56:return          
	}

	public void c()
	{
		cb.a((new StringBuilder()).append("Wrong call start()  State: ").append(b()).append("  ").append(((Object) (((Object)this).getClass()))).toString());
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:ldc1            #67  <String "Wrong call start()  State: ">
	//    4    9:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #32  <Method int b()>
	//    7   16:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #37  <String "  ">
	//    9   21:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #41  <Method Class Object.getClass()>
	//   12   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #53  <Method void cb.a(String)>
	//   15   37:return          
	}

	public void d()
	{
		cb.a((new StringBuilder()).append("Wrong call continueDownload()  State: ").append(b()).append("  ").append(((Object) (((Object)this).getClass()))).toString());
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:ldc1            #70  <String "Wrong call continueDownload()  State: ">
	//    4    9:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #32  <Method int b()>
	//    7   16:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #37  <String "  ">
	//    9   21:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #41  <Method Class Object.getClass()>
	//   12   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #53  <Method void cb.a(String)>
	//   15   37:return          
	}

	public void e()
	{
		cb.a((new StringBuilder()).append("Wrong call pause()  State: ").append(b()).append("  ").append(((Object) (((Object)this).getClass()))).toString());
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:ldc1            #73  <String "Wrong call pause()  State: ">
	//    4    9:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #32  <Method int b()>
	//    7   16:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #37  <String "  ">
	//    9   21:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #41  <Method Class Object.getClass()>
	//   12   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #53  <Method void cb.a(String)>
	//   15   37:return          
	}

	public void f()
	{
		cb.a((new StringBuilder()).append("Wrong call hasNew()  State: ").append(b()).append("  ").append(((Object) (((Object)this).getClass()))).toString());
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:ldc1            #76  <String "Wrong call hasNew()  State: ">
	//    4    9:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #32  <Method int b()>
	//    7   16:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #37  <String "  ">
	//    9   21:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #41  <Method Class Object.getClass()>
	//   12   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #53  <Method void cb.a(String)>
	//   15   37:return          
	}

	public void g()
	{
		cb.a((new StringBuilder()).append("Wrong call complete()  State: ").append(b()).append("  ").append(((Object) (((Object)this).getClass()))).toString());
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:ldc1            #79  <String "Wrong call complete()  State: ">
	//    4    9:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #32  <Method int b()>
	//    7   16:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #37  <String "  ">
	//    9   21:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #41  <Method Class Object.getClass()>
	//   12   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #53  <Method void cb.a(String)>
	//   15   37:return          
	}

	protected int a;
	protected bd b;
}
