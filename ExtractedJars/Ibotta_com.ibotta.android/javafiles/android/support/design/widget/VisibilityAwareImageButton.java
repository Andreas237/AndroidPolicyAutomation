// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.widget.ImageButton;

public class VisibilityAwareImageButton extends ImageButton
{

	public final int getUserSetVisibility()
	{
		return userSetVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int userSetVisibility>
	//    2    4:ireturn         
	}

	public final void internalSetVisibility(int i, boolean flag)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #21  <Method void ImageButton.setVisibility(int)>
		if(flag)
	//*   3    5:iload_2         
	//*   4    6:ifeq            14
			userSetVisibility = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #14  <Field int userSetVisibility>
	//    8   14:return          
	}

	public void setVisibility(int i)
	{
		internalSetVisibility(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #23  <Method void internalSetVisibility(int, boolean)>
	//    4    6:return          
	}

	private int userSetVisibility;
}
