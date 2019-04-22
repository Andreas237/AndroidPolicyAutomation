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
	//    1    1:getfield        #17  <Field CircularBorderDrawable this$0>
	//    2    4:areturn         
	}

	final CircularBorderDrawable this$0;
}
