// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.support.StringUtils;
import com.appboy.ui.inappmessage.IInAppMessageImmersiveView;
import com.appboy.ui.support.ViewUtils;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			AppboyInAppMessageBaseView, InAppMessageViewUtils

public abstract class AppboyInAppMessageImmersiveBaseView extends AppboyInAppMessageBaseView
	implements IInAppMessageImmersiveView
{

	public AppboyInAppMessageImmersiveBaseView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #10  <Method void AppboyInAppMessageBaseView(Context, AttributeSet)>
	//    4    6:return          
	}

	public abstract View getFrameView();

	public abstract List getMessageButtonViews();

	public abstract View getMessageButtonsView();

	public abstract TextView getMessageHeaderTextView();

	public abstract TextView getMessageTextView();

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          10
		{
			InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
	//    3    5:invokestatic    #27  <Method void InAppMessageViewUtils.closeInAppMessageOnKeycodeBack()>
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		} else
		{
			return super.onKeyDown(i, keyevent);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #29  <Method boolean AppboyInAppMessageBaseView.onKeyDown(int, KeyEvent)>
	//   10   16:ireturn         
		}
	}

	public void resetMessageMargins()
	{
		boolean flag;
		if(getMessageImageView() != null && getMessageImageView().getDrawable() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #34  <Method ImageView getMessageImageView()>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #34  <Method ImageView getMessageImageView()>
	//*   5   11:invokevirtual   #40  <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//*   6   14:ifnull          22
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_1        
		else
	//*   9   19:goto            24
			flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_1        
		resetMessageMargins(flag);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokevirtual   #43  <Method void resetMessageMargins(boolean)>
	//   15   29:return          
	}

	public void resetMessageMargins(boolean flag)
	{
		super.resetMessageMargins(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #44  <Method void AppboyInAppMessageBaseView.resetMessageMargins(boolean)>
		if(StringUtils.isNullOrBlank(getMessageTextView().getText().toString()))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #46  <Method TextView getMessageTextView()>
	//*   5    9:invokevirtual   #52  <Method CharSequence TextView.getText()>
	//*   6   12:invokeinterface #58  <Method String CharSequence.toString()>
	//*   7   17:invokestatic    #64  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   20:ifeq            30
			ViewUtils.removeViewFromParent(((View) (getMessageTextView())));
	//    9   23:aload_0         
	//   10   24:invokevirtual   #46  <Method TextView getMessageTextView()>
	//   11   27:invokestatic    #70  <Method void ViewUtils.removeViewFromParent(View)>
		if(StringUtils.isNullOrBlank(getMessageHeaderTextView().getText().toString()))
	//*  12   30:aload_0         
	//*  13   31:invokevirtual   #72  <Method TextView getMessageHeaderTextView()>
	//*  14   34:invokevirtual   #52  <Method CharSequence TextView.getText()>
	//*  15   37:invokeinterface #58  <Method String CharSequence.toString()>
	//*  16   42:invokestatic    #64  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  17   45:ifeq            55
			ViewUtils.removeViewFromParent(((View) (getMessageHeaderTextView())));
	//   18   48:aload_0         
	//   19   49:invokevirtual   #72  <Method TextView getMessageHeaderTextView()>
	//   20   52:invokestatic    #70  <Method void ViewUtils.removeViewFromParent(View)>
		InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
	//   21   55:aload_0         
	//   22   56:invokevirtual   #46  <Method TextView getMessageTextView()>
	//   23   59:aload_0         
	//   24   60:invokevirtual   #72  <Method TextView getMessageHeaderTextView()>
	//   25   63:invokestatic    #76  <Method void InAppMessageViewUtils.resetMessageMarginsIfNecessary(TextView, TextView)>
	//   26   66:return          
	}

	public void setFrameColor(Integer integer)
	{
		InAppMessageViewUtils.setFrameColor(getFrameView(), integer);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method View getFrameView()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #83  <Method void InAppMessageViewUtils.setFrameColor(View, Integer)>
	//    4    8:return          
	}

	public void setMessageButtons(List list)
	{
		View view = getMessageButtonsView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method View getMessageButtonsView()>
	//    2    4:astore_3        
		int i = getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_button_bg_light);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #91  <Method Context getContext()>
	//    5    9:invokevirtual   #97  <Method Resources Context.getResources()>
	//    6   12:getstatic       #103 <Field int com.appboy.ui.R$color.com_appboy_inappmessage_button_bg_light>
	//    7   15:invokevirtual   #109 <Method int Resources.getColor(int)>
	//    8   18:istore_2        
		InAppMessageViewUtils.setButtons(getMessageButtonViews(), view, i, list);
	//    9   19:aload_0         
	//   10   20:invokevirtual   #111 <Method List getMessageButtonViews()>
	//   11   23:aload_3         
	//   12   24:iload_2         
	//   13   25:aload_1         
	//   14   26:invokestatic    #115 <Method void InAppMessageViewUtils.setButtons(List, View, int, List)>
		InAppMessageViewUtils.resetButtonSizesIfNecessary(getMessageButtonViews(), list);
	//   15   29:aload_0         
	//   16   30:invokevirtual   #111 <Method List getMessageButtonViews()>
	//   17   33:aload_1         
	//   18   34:invokestatic    #119 <Method void InAppMessageViewUtils.resetButtonSizesIfNecessary(List, List)>
	//   19   37:return          
	}

	public void setMessageCloseButtonColor(int i)
	{
		InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageCloseButtonView(), i, getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_button_close_light));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method View getMessageCloseButtonView()>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #91  <Method Context getContext()>
	//    5    9:invokevirtual   #97  <Method Resources Context.getResources()>
	//    6   12:getstatic       #129 <Field int com.appboy.ui.R$color.com_appboy_inappmessage_button_close_light>
	//    7   15:invokevirtual   #109 <Method int Resources.getColor(int)>
	//    8   18:invokestatic    #133 <Method void InAppMessageViewUtils.setViewBackgroundColorFilter(View, int, int)>
	//    9   21:return          
	}

	public void setMessageHeaderText(String s)
	{
		getMessageHeaderTextView().setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method TextView getMessageHeaderTextView()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #139 <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	public void setMessageHeaderTextAlignment(TextAlign textalign)
	{
		InAppMessageViewUtils.setTextAlignment(getMessageHeaderTextView(), textalign);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method TextView getMessageHeaderTextView()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #145 <Method void InAppMessageViewUtils.setTextAlignment(TextView, TextAlign)>
	//    4    8:return          
	}

	public void setMessageHeaderTextColor(int i)
	{
		InAppMessageViewUtils.setTextViewColor(getMessageHeaderTextView(), i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method TextView getMessageHeaderTextView()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #150 <Method void InAppMessageViewUtils.setTextViewColor(TextView, int)>
	//    4    8:return          
	}
}
