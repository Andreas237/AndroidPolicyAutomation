// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

class VisibilityAwareImageButton extends ImageButton
{

	public VisibilityAwareImageButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #11  <Method void VisibilityAwareImageButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public VisibilityAwareImageButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #15  <Method void VisibilityAwareImageButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public VisibilityAwareImageButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #16  <Method void ImageButton(Context, AttributeSet, int)>
		mUserSetVisibility = getVisibility();
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #20  <Method int getVisibility()>
	//    8   12:putfield        #22  <Field int mUserSetVisibility>
	//    9   15:return          
	}

	final int getUserSetVisibility()
	{
		return mUserSetVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int mUserSetVisibility>
	//    2    4:ireturn         
	}

	final void internalSetVisibility(int i, boolean flag)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #29  <Method void ImageButton.setVisibility(int)>
		if(flag)
	//*   3    5:iload_2         
	//*   4    6:ifeq            14
			mUserSetVisibility = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #22  <Field int mUserSetVisibility>
	//    8   14:return          
	}

	public void setVisibility(int i)
	{
		internalSetVisibility(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #31  <Method void internalSetVisibility(int, boolean)>
	//    4    6:return          
	}

	private int mUserSetVisibility;
}
