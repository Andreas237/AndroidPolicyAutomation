// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

class CoordinatorLayout$d
	implements android.view.reDrawListener
{

	public boolean onPreDraw()
	{
		a.a(0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CoordinatorLayout a>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #24  <Method void CoordinatorLayout.a(int)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	final CoordinatorLayout a;

	CoordinatorLayout$d(CoordinatorLayout coordinatorlayout)
	{
		a = coordinatorlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CoordinatorLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
