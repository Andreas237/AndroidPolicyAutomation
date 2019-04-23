// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			GenericLifecycleObserver, e, j, g

public class SingleGeneratedAdapterObserver
	implements GenericLifecycleObserver
{

	SingleGeneratedAdapterObserver(e e1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = e1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field e a>
	//    5    9:return          
	}

	public void a(j j, g g)
	{
		a.a(j, g, false, ((r) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field e a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:aconst_null     
	//    6    8:invokeinterface #22  <Method void e.a(j, g, boolean, r)>
		a.a(j, g, true, ((r) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field e a>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:iconst_1        
	//   12   20:aconst_null     
	//   13   21:invokeinterface #22  <Method void e.a(j, g, boolean, r)>
	//   14   26:return          
	}

	private final e a;
}
