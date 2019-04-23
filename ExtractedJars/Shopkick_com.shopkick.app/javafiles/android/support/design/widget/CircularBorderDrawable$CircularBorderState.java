// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.design.widget:
//			CircularBorderDrawable

private class CircularBorderDrawable$CircularBorderState extends android.graphics.drawable.Drawable.ConstantState
{

	public int getChangingConfigurations()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Drawable newDrawable()
	{
		return ((Drawable) (CircularBorderDrawable.this));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CircularBorderDrawable this$0>
	//    2    4:areturn         
	}

	final CircularBorderDrawable this$0;

	private CircularBorderDrawable$CircularBorderState()
	{
		this$0 = CircularBorderDrawable.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field CircularBorderDrawable this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.graphics.drawable.Drawable$ConstantState()>
	//    5    9:return          
	}

	CircularBorderDrawable$CircularBorderState(CircularBorderDrawable._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void CircularBorderDrawable$CircularBorderState(CircularBorderDrawable)>
	//    3    5:return          
	}
}
