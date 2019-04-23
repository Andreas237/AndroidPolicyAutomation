// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


public final class dk
{

	public static Object a(Object obj, Class class1)
	{
		if(class1.isAssignableFrom(obj.getClass()))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #10  <Method Class Object.getClass()>
	//*   3    5:invokevirtual   #16  <Method boolean Class.isAssignableFrom(Class)>
	//*   4    8:ifeq            17
			return class1.cast(obj);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #20  <Method Object Class.cast(Object)>
	//    8   16:areturn         
		else
			return ((Object) (null));
	//    9   17:aconst_null     
	//   10   18:areturn         
	}
}
