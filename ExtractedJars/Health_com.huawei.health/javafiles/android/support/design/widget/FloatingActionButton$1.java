// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//			FloatingActionButton

class FloatingActionButton$1
	implements o.u.b
{

	public void a()
	{
		e.onHidden(c);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field FloatingActionButton$OnVisibilityChangedListener e>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field FloatingActionButton c>
	//    4    8:invokevirtual   #32  <Method void FloatingActionButton$OnVisibilityChangedListener.onHidden(FloatingActionButton)>
	//    5   11:return          
	}

	public void d()
	{
		e.onShown(c);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field FloatingActionButton$OnVisibilityChangedListener e>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field FloatingActionButton c>
	//    4    8:invokevirtual   #36  <Method void FloatingActionButton$OnVisibilityChangedListener.onShown(FloatingActionButton)>
	//    5   11:return          
	}

	final FloatingActionButton c;
	final VisibilityChangedListener e;

	FloatingActionButton$1(FloatingActionButton floatingactionbutton, VisibilityChangedListener visibilitychangedlistener)
	{
		c = floatingactionbutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FloatingActionButton c>
		e = visibilitychangedlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FloatingActionButton$OnVisibilityChangedListener e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
