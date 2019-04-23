// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//			FloatingActionButtonImpl

class FloatingActionButtonImpl$3
	implements android.view.istener
{

	public boolean onPreDraw()
	{
		FloatingActionButtonImpl.this.onPreDraw();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FloatingActionButtonImpl this$0>
	//    2    4:invokevirtual   #24  <Method void FloatingActionButtonImpl.onPreDraw()>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}

	final FloatingActionButtonImpl this$0;

	FloatingActionButtonImpl$3()
	{
		this$0 = FloatingActionButtonImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FloatingActionButtonImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
