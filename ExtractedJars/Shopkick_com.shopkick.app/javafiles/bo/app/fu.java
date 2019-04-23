// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


public class fu
{

	public fu(String s, Object obj, Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String a>
		b = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field Object b>
		c = obj1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #20  <Field Object c>
	//   11   19:return          
	}

	private final String a;
	private final Object b;
	private final Object c;
}
