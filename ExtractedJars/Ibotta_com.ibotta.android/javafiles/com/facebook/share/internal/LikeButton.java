// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.res.Resources;
import com.facebook.FacebookButtonBase;

public class LikeButton extends FacebookButtonBase
{

	private void updateForLikeStatus()
	{
		if(isSelected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #11  <Method boolean isSelected()>
	//*   2    4:ifeq            32
		{
			setCompoundDrawablesWithIntrinsicBounds(com.facebook.common.R.drawable.com_facebook_button_like_icon_selected, 0, 0, 0);
	//    3    7:aload_0         
	//    4    8:getstatic       #17  <Field int com.facebook.common.R$drawable.com_facebook_button_like_icon_selected>
	//    5   11:iconst_0        
	//    6   12:iconst_0        
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #21  <Method void setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
			setText(((CharSequence) (getResources().getString(com.facebook.common.R.string.com_facebook_like_button_liked))));
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #25  <Method Resources getResources()>
	//   12   22:getstatic       #30  <Field int com.facebook.common.R$string.com_facebook_like_button_liked>
	//   13   25:invokevirtual   #36  <Method String Resources.getString(int)>
	//   14   28:invokevirtual   #40  <Method void setText(CharSequence)>
			return;
	//   15   31:return          
		} else
		{
			setCompoundDrawablesWithIntrinsicBounds(com.facebook.common.R.drawable.com_facebook_button_icon, 0, 0, 0);
	//   16   32:aload_0         
	//   17   33:getstatic       #43  <Field int com.facebook.common.R$drawable.com_facebook_button_icon>
	//   18   36:iconst_0        
	//   19   37:iconst_0        
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #21  <Method void setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
			setText(((CharSequence) (getResources().getString(com.facebook.common.R.string.com_facebook_like_button_not_liked))));
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #25  <Method Resources getResources()>
	//   25   47:getstatic       #46  <Field int com.facebook.common.R$string.com_facebook_like_button_not_liked>
	//   26   50:invokevirtual   #36  <Method String Resources.getString(int)>
	//   27   53:invokevirtual   #40  <Method void setText(CharSequence)>
			return;
	//   28   56:return          
		}
	}

	protected int getDefaultRequestCode()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected int getDefaultStyleResource()
	{
		return com.facebook.common.R.style.com_facebook_button_like;
	//    0    0:getstatic       #55  <Field int com.facebook.common.R$style.com_facebook_button_like>
	//    1    3:ireturn         
	}

	public void setSelected(boolean flag)
	{
		super.setSelected(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #59  <Method void FacebookButtonBase.setSelected(boolean)>
		updateForLikeStatus();
	//    3    5:aload_0         
	//    4    6:invokespecial   #61  <Method void updateForLikeStatus()>
	//    5    9:return          
	}
}
