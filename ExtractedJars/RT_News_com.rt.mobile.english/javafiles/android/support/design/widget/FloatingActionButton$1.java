// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//			FloatingActionButton

class FloatingActionButton$1
	implements l.InternalVisibilityChangedListener
{

	public void onHidden()
	{
		val$listener.onHidden(FloatingActionButton.this);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field FloatingActionButton$OnVisibilityChangedListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field FloatingActionButton this$0>
	//    4    8:invokevirtual   #31  <Method void FloatingActionButton$OnVisibilityChangedListener.onHidden(FloatingActionButton)>
	//    5   11:return          
	}

	public void onShown()
	{
		val$listener.onShown(FloatingActionButton.this);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field FloatingActionButton$OnVisibilityChangedListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field FloatingActionButton this$0>
	//    4    8:invokevirtual   #34  <Method void FloatingActionButton$OnVisibilityChangedListener.onShown(FloatingActionButton)>
	//    5   11:return          
	}

	final FloatingActionButton this$0;
	final VisibilityChangedListener val$listener;

	FloatingActionButton$1()
	{
		this$0 = final_floatingactionbutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FloatingActionButton this$0>
		val$listener = VisibilityChangedListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FloatingActionButton$OnVisibilityChangedListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
