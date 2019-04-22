// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			fr, er

public class au
{

	public au(fr fr, er er)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = fr;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field fr a>
		b = er;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field er b>
	//    8   14:return          
	}

	public fr a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field fr a>
	//    2    4:areturn         
	}

	public er b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field er b>
	//    2    4:areturn         
	}

	private final fr a;
	private final er b;
}
