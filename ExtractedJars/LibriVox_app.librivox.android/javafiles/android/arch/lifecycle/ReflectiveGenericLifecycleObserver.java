// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			GenericLifecycleObserver, a, b, j, 
//			g

class ReflectiveGenericLifecycleObserver
	implements GenericLifecycleObserver
{

	ReflectiveGenericLifecycleObserver(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Object a>
		b = a.a.b(a.getClass());
	//    5    9:aload_0         
	//    6   10:getstatic       #22  <Field a a.a>
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field Object a>
	//    9   17:invokevirtual   #26  <Method Class Object.getClass()>
	//   10   20:invokevirtual   #29  <Method b a.b(Class)>
	//   11   23:putfield        #31  <Field b b>
	//   12   26:return          
	}

	public void a(j j, g g)
	{
		b.a(j, g, a);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field b b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #17  <Field Object a>
	//    6   10:invokevirtual   #38  <Method void b.a(j, g, Object)>
	//    7   13:return          
	}

	private final Object a;
	private final b b;
}
