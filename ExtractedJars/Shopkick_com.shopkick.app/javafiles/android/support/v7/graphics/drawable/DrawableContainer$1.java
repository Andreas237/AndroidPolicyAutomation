// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;


// Referenced classes of package android.support.v7.graphics.drawable:
//			DrawableContainer

class DrawableContainer$1
	implements Runnable
{

	public void run()
	{
		animate(true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DrawableContainer this$0>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #26  <Method void DrawableContainer.animate(boolean)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field DrawableContainer this$0>
	//    6   12:invokevirtual   #29  <Method void DrawableContainer.invalidateSelf()>
	//    7   15:return          
	}

	final DrawableContainer this$0;

	DrawableContainer$1()
	{
		this$0 = DrawableContainer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DrawableContainer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
