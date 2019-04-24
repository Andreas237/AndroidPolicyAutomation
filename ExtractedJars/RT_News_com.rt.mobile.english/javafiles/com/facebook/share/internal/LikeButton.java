// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.facebook.FacebookButtonBase;

public class LikeButton extends FacebookButtonBase
{

	public LikeButton(Context context, boolean flag)
	{
		super(context, ((AttributeSet) (null)), 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:ldc1            #8   <String "fb_like_button_create">
	//    6    7:ldc1            #10  <String "fb_like_button_did_tap">
	//    7    9:invokespecial   #13  <Method void FacebookButtonBase(Context, AttributeSet, int, int, String, String)>
		setSelected(flag);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #17  <Method void setSelected(boolean)>
	//   11   17:return          
	}

	private void updateForLikeStatus()
	{
		if(isSelected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #24  <Method boolean isSelected()>
	//*   2    4:ifeq            32
		{
			setCompoundDrawablesWithIntrinsicBounds(com.facebook.R.drawable.com_facebook_button_like_icon_selected, 0, 0, 0);
	//    3    7:aload_0         
	//    4    8:getstatic       #30  <Field int com.facebook.R$drawable.com_facebook_button_like_icon_selected>
	//    5   11:iconst_0        
	//    6   12:iconst_0        
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #34  <Method void setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
			setText(((CharSequence) (getResources().getString(com.facebook.R.string.com_facebook_like_button_liked))));
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #38  <Method Resources getResources()>
	//   12   22:getstatic       #43  <Field int com.facebook.R$string.com_facebook_like_button_liked>
	//   13   25:invokevirtual   #49  <Method String Resources.getString(int)>
	//   14   28:invokevirtual   #53  <Method void setText(CharSequence)>
			return;
	//   15   31:return          
		} else
		{
			setCompoundDrawablesWithIntrinsicBounds(com.facebook.R.drawable.com_facebook_button_icon, 0, 0, 0);
	//   16   32:aload_0         
	//   17   33:getstatic       #56  <Field int com.facebook.R$drawable.com_facebook_button_icon>
	//   18   36:iconst_0        
	//   19   37:iconst_0        
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #34  <Method void setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
			setText(((CharSequence) (getResources().getString(com.facebook.R.string.com_facebook_like_button_not_liked))));
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #38  <Method Resources getResources()>
	//   25   47:getstatic       #59  <Field int com.facebook.R$string.com_facebook_like_button_not_liked>
	//   26   50:invokevirtual   #49  <Method String Resources.getString(int)>
	//   27   53:invokevirtual   #53  <Method void setText(CharSequence)>
			return;
	//   28   56:return          
		}
	}

	protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
	{
		super.configureButton(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #63  <Method void FacebookButtonBase.configureButton(Context, AttributeSet, int, int)>
		updateForLikeStatus();
	//    6    9:aload_0         
	//    7   10:invokespecial   #65  <Method void updateForLikeStatus()>
	//    8   13:return          
	}

	protected int getDefaultRequestCode()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected int getDefaultStyleResource()
	{
		return com.facebook.R.style.com_facebook_button_like;
	//    0    0:getstatic       #73  <Field int com.facebook.R$style.com_facebook_button_like>
	//    1    3:ireturn         
	}

	public void setSelected(boolean flag)
	{
		super.setSelected(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #74  <Method void FacebookButtonBase.setSelected(boolean)>
		updateForLikeStatus();
	//    3    5:aload_0         
	//    4    6:invokespecial   #65  <Method void updateForLikeStatus()>
	//    5    9:return          
	}
}
