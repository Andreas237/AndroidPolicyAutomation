// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;


// Referenced classes of package com.irobot.home.model:
//			IRobotModel, a

private class IRobotModel$b
{

	public IRobotModel$a a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field IRobotModel$a b>
	//    2    4:areturn         
	}

	public void a(IRobotModel$a irobotmodel$a)
	{
		b = irobotmodel$a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field IRobotModel$a b>
	//    3    5:return          
	}

	public void a(a a1)
	{
		c = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field a c>
	//    3    5:return          
	}

	public a b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a c>
	//    2    4:areturn         
	}

	final IRobotModel a;
	private IRobotModel$a b;
	private a c;

	public IRobotModel$b(IRobotModel irobotmodel, a a1, IRobotModel$a irobotmodel$a)
	{
		a = irobotmodel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field IRobotModel a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		c = a1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field a c>
		b = irobotmodel$a;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field IRobotModel$a b>
	//   11   19:return          
	}
}
