// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

// Referenced classes of package com.facebook.login.widget:
//			ToolTipPopup

private class ToolTipPopup$PopupContentView extends FrameLayout
{

	private void init()
	{
		LayoutInflater.from(getContext()).inflate(com.facebook.login.R.layout.com_facebook_tooltip_bubble, ((android.view.ViewGroup) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method Context getContext()>
	//    2    4:invokestatic    #51  <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:getstatic       #57  <Field int com.facebook.login.R$layout.com_facebook_tooltip_bubble>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #61  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    6   14:pop             
		topArrow = (ImageView)findViewById(com.facebook.login.R.id.com_facebook_tooltip_bubble_view_top_pointer);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getstatic       #66  <Field int com.facebook.login.R$id.com_facebook_tooltip_bubble_view_top_pointer>
	//   10   20:invokevirtual   #70  <Method View findViewById(int)>
	//   11   23:checkcast       #72  <Class ImageView>
	//   12   26:putfield        #38  <Field ImageView topArrow>
		bottomArrow = (ImageView)findViewById(com.facebook.login.R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getstatic       #75  <Field int com.facebook.login.R$id.com_facebook_tooltip_bubble_view_bottom_pointer>
	//   16   34:invokevirtual   #70  <Method View findViewById(int)>
	//   17   37:checkcast       #72  <Class ImageView>
	//   18   40:putfield        #35  <Field ImageView bottomArrow>
		bodyFrame = findViewById(com.facebook.login.R.id.com_facebook_body_frame);
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getstatic       #78  <Field int com.facebook.login.R$id.com_facebook_body_frame>
	//   22   48:invokevirtual   #70  <Method View findViewById(int)>
	//   23   51:putfield        #31  <Field View bodyFrame>
		xOut = (ImageView)findViewById(com.facebook.login.R.id.com_facebook_button_xout);
	//   24   54:aload_0         
	//   25   55:aload_0         
	//   26   56:getstatic       #81  <Field int com.facebook.login.R$id.com_facebook_button_xout>
	//   27   59:invokevirtual   #70  <Method View findViewById(int)>
	//   28   62:checkcast       #72  <Class ImageView>
	//   29   65:putfield        #41  <Field ImageView xOut>
	//   30   68:return          
	}

	public void showBottomArrow()
	{
		topArrow.setVisibility(4);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ImageView topArrow>
	//    2    4:iconst_4        
	//    3    5:invokevirtual   #86  <Method void ImageView.setVisibility(int)>
		bottomArrow.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field ImageView bottomArrow>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #86  <Method void ImageView.setVisibility(int)>
	//    8   16:return          
	}

	public void showTopArrow()
	{
		topArrow.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ImageView topArrow>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #86  <Method void ImageView.setVisibility(int)>
		bottomArrow.setVisibility(4);
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field ImageView bottomArrow>
	//    6   12:iconst_4        
	//    7   13:invokevirtual   #86  <Method void ImageView.setVisibility(int)>
	//    8   16:return          
	}

	private View bodyFrame;
	private ImageView bottomArrow;
	final ToolTipPopup this$0;
	private ImageView topArrow;
	private ImageView xOut;


/*
	static View access$300(ToolTipPopup$PopupContentView tooltippopup$popupcontentview)
	{
		return tooltippopup$popupcontentview.bodyFrame;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field View bodyFrame>
	//    2    4:areturn         
	}

*/


/*
	static ImageView access$400(ToolTipPopup$PopupContentView tooltippopup$popupcontentview)
	{
		return tooltippopup$popupcontentview.bottomArrow;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ImageView bottomArrow>
	//    2    4:areturn         
	}

*/


/*
	static ImageView access$500(ToolTipPopup$PopupContentView tooltippopup$popupcontentview)
	{
		return tooltippopup$popupcontentview.topArrow;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ImageView topArrow>
	//    2    4:areturn         
	}

*/


/*
	static ImageView access$600(ToolTipPopup$PopupContentView tooltippopup$popupcontentview)
	{
		return tooltippopup$popupcontentview.xOut;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ImageView xOut>
	//    2    4:areturn         
	}

*/

	public ToolTipPopup$PopupContentView(Context context)
	{
		this$0 = ToolTipPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ToolTipPopup this$0>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #22  <Method void FrameLayout(Context)>
		init();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void init()>
	//    8   14:return          
	}
}
