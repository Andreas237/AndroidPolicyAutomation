// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.common.b;

import java.util.Map;

// Referenced classes of package com.startapp.common.b:
//			a, b

static final class a$1
	implements Runnable
{

	public void run()
	{
		Integer integer = (Integer)com.startapp.common.b.a.a(com.startapp.common.b.a.a()).get(((Object) (Integer.valueOf(a))));
	//    0    0:invokestatic    #33  <Method a a.a()>
	//    1    3:invokestatic    #36  <Method Map a.a(a)>
	//    2    6:aload_0         
	//    3    7:getfield        #21  <Field int a>
	//    4   10:invokestatic    #42  <Method Integer Integer.valueOf(int)>
	//    5   13:invokeinterface #48  <Method Object Map.get(Object)>
	//    6   18:checkcast       #38  <Class Integer>
	//    7   21:astore_1        
		if(integer != null && integer.intValue() == b)
	//*   8   22:aload_1         
	//*   9   23:ifnull          82
	//*  10   26:aload_1         
	//*  11   27:invokevirtual   #52  <Method int Integer.intValue()>
	//*  12   30:aload_0         
	//*  13   31:getfield        #23  <Field int b>
	//*  14   34:icmpne          82
		{
			if(!c.e())
	//*  15   37:aload_0         
	//*  16   38:getfield        #25  <Field b c>
	//*  17   41:invokevirtual   #58  <Method boolean b.e()>
	//*  18   44:ifne            66
				com.startapp.common.b.a.a(com.startapp.common.b.a.a()).remove(((Object) (Integer.valueOf(a))));
	//   19   47:invokestatic    #33  <Method a a.a()>
	//   20   50:invokestatic    #36  <Method Map a.a(a)>
	//   21   53:aload_0         
	//   22   54:getfield        #21  <Field int a>
	//   23   57:invokestatic    #42  <Method Integer Integer.valueOf(int)>
	//   24   60:invokeinterface #61  <Method Object Map.remove(Object)>
	//   25   65:pop             
			com.startapp.common.b.a.a(c, new com.startapp.common.b.a.b.b() {

				public void a(com.startapp.common.b.a.b.a a1)
				{
				//    0    0:return          
				}

				final a._cls1 a;

			
			{
				a = a._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field a$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   26   66:aload_0         
	//   27   67:getfield        #25  <Field b c>
	//   28   70:new             #13  <Class a$1$1>
	//   29   73:dup             
	//   30   74:aload_0         
	//   31   75:invokespecial   #64  <Method void a$1$1(a$1)>
	//   32   78:invokestatic    #67  <Method boolean a.a(b, com.startapp.common.b.a.b$b)>
	//   33   81:pop             
		}
	//   34   82:return          
	}

	final int a;
	final int b;
	final b c;

	a$1(int i, int j, b b1)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int a>
		b = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field int b>
		c = b1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field b c>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
