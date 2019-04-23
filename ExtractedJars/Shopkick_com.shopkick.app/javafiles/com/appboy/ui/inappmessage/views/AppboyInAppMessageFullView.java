// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.*;
import com.appboy.ui.inappmessage.config.AppboyInAppMessageParams;
import com.appboy.ui.support.ViewUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			AppboyInAppMessageImmersiveBaseView, InAppMessageViewUtils

public class AppboyInAppMessageFullView extends AppboyInAppMessageImmersiveBaseView
{

	public AppboyInAppMessageFullView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void AppboyInAppMessageImmersiveBaseView(Context, AttributeSet)>
	//    4    6:return          
	}

	private void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive iinappmessageimmersive, IInAppMessageImageView iinappmessageimageview)
	{
		iinappmessageimageview.setInAppMessageImageCropType(iinappmessageimmersive.getCropType());
	//    0    0:aload_3         
	//    1    1:aload_2         
	//    2    2:invokeinterface #37  <Method com.appboy.enums.inappmessage.CropType IInAppMessageImmersive.getCropType()>
	//    3    7:invokeinterface #43  <Method void IInAppMessageImageView.setInAppMessageImageCropType(com.appboy.enums.inappmessage.CropType)>
		if(ViewUtils.isRunningOnTablet(activity))
	//*   4   12:aload_1         
	//*   5   13:invokestatic    #49  <Method boolean ViewUtils.isRunningOnTablet(Activity)>
	//*   6   16:ifeq            66
		{
			float f = (float)ViewUtils.convertDpToPixels(activity, AppboyInAppMessageParams.getModalizedImageRadiusDp());
	//    7   19:aload_1         
	//    8   20:invokestatic    #55  <Method double AppboyInAppMessageParams.getModalizedImageRadiusDp()>
	//    9   23:invokestatic    #59  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//   10   26:d2f             
	//   11   27:fstore          4
			if(iinappmessageimmersive.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC))))
	//*  12   29:aload_2         
	//*  13   30:invokeinterface #63  <Method ImageStyle IInAppMessageImmersive.getImageStyle()>
	//*  14   35:getstatic       #69  <Field ImageStyle ImageStyle.GRAPHIC>
	//*  15   38:invokevirtual   #73  <Method boolean ImageStyle.equals(Object)>
	//*  16   41:ifeq            53
			{
				iinappmessageimageview.setCornersRadiusPx(f);
	//   17   44:aload_3         
	//   18   45:fload           4
	//   19   47:invokeinterface #77  <Method void IInAppMessageImageView.setCornersRadiusPx(float)>
				return;
	//   20   52:return          
			} else
			{
				iinappmessageimageview.setCornersRadiiPx(f, f, 0.0F, 0.0F);
	//   21   53:aload_3         
	//   22   54:fload           4
	//   23   56:fload           4
	//   24   58:fconst_0        
	//   25   59:fconst_0        
	//   26   60:invokeinterface #81  <Method void IInAppMessageImageView.setCornersRadiiPx(float, float, float, float)>
				return;
	//   27   65:return          
			}
		} else
		{
			iinappmessageimageview.setCornersRadiusPx(0.0F);
	//   28   66:aload_3         
	//   29   67:fconst_0        
	//   30   68:invokeinterface #77  <Method void IInAppMessageImageView.setCornersRadiusPx(float)>
			return;
	//   31   73:return          
		}
	}

	public View getFrameView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_frame);
	//    0    0:aload_0         
	//    1    1:getstatic       #89  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_frame>
	//    2    4:invokevirtual   #93  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public int getLongEdge()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full).getLayoutParams().height;
	//    0    0:aload_0         
	//    1    1:getstatic       #98  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full>
	//    2    4:invokevirtual   #93  <Method View findViewById(int)>
	//    3    7:invokevirtual   #104 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4   10:getfield        #109 <Field int android.view.ViewGroup$LayoutParams.height>
	//    5   13:ireturn         
	}

	public View getMessageBackgroundObject()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full);
	//    0    0:aload_0         
	//    1    1:getstatic       #98  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full>
	//    2    4:invokevirtual   #93  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public volatile Object getMessageBackgroundObject()
	{
		return ((Object) (getMessageBackgroundObject()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method View getMessageBackgroundObject()>
	//    2    4:areturn         
	}

	public List getMessageButtonViews()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #117 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void ArrayList()>
	//    3    7:astore_1        
		if(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_one) != null)
	//*   4    8:aload_0         
	//*   5    9:getstatic       #122 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_button_one>
	//*   6   12:invokevirtual   #93  <Method View findViewById(int)>
	//*   7   15:ifnull          32
			((List) (arraylist)).add(((Object) (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_one))));
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getstatic       #122 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_button_one>
	//   11   23:invokevirtual   #93  <Method View findViewById(int)>
	//   12   26:invokeinterface #127 <Method boolean List.add(Object)>
	//   13   31:pop             
		if(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_two) != null)
	//*  14   32:aload_0         
	//*  15   33:getstatic       #130 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_button_two>
	//*  16   36:invokevirtual   #93  <Method View findViewById(int)>
	//*  17   39:ifnull          56
			((List) (arraylist)).add(((Object) (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_two))));
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:getstatic       #130 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_button_two>
	//   21   47:invokevirtual   #93  <Method View findViewById(int)>
	//   22   50:invokeinterface #127 <Method boolean List.add(Object)>
	//   23   55:pop             
		return ((List) (arraylist));
	//   24   56:aload_1         
	//   25   57:areturn         
	}

	public View getMessageButtonsView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_layout);
	//    0    0:aload_0         
	//    1    1:getstatic       #136 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_button_layout>
	//    2    4:invokevirtual   #93  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public View getMessageClickableView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full);
	//    0    0:aload_0         
	//    1    1:getstatic       #98  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full>
	//    2    4:invokevirtual   #93  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public View getMessageCloseButtonView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_close_button);
	//    0    0:aload_0         
	//    1    1:getstatic       #141 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_close_button>
	//    2    4:invokevirtual   #93  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public TextView getMessageHeaderTextView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_header_text);
	//    0    0:aload_0         
	//    1    1:getstatic       #146 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_header_text>
	//    2    4:invokevirtual   #93  <Method View findViewById(int)>
	//    3    7:checkcast       #148 <Class TextView>
	//    4   10:areturn         
	}

	public TextView getMessageIconView()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ImageView getMessageImageView()
	{
		return ((ImageView) (mAppboyInAppMessageImageView));
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
	//    2    4:areturn         
	}

	public View getMessageSimpleDraweeView()
	{
		return mSimpleDraweeView;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field View mSimpleDraweeView>
	//    2    4:areturn         
	}

	public TextView getMessageTextView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_message);
	//    0    0:aload_0         
	//    1    1:getstatic       #160 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_message>
	//    2    4:invokevirtual   #93  <Method View findViewById(int)>
	//    3    7:checkcast       #148 <Class TextView>
	//    4   10:areturn         
	}

	public int getShortEdge()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full).getLayoutParams().width;
	//    0    0:aload_0         
	//    1    1:getstatic       #98  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full>
	//    2    4:invokevirtual   #93  <Method View findViewById(int)>
	//    3    7:invokevirtual   #104 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4   10:getfield        #164 <Field int android.view.ViewGroup$LayoutParams.width>
	//    5   13:ireturn         
	}

	public void inflateStubViews(Activity activity, IInAppMessageImmersive iinappmessageimmersive)
	{
		if(mCanUseFresco)
	//*   0    0:aload_0         
	//*   1    1:getfield        #170 <Field boolean mCanUseFresco>
	//*   2    4:ifeq            32
		{
			mSimpleDraweeView = getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_full_drawee_stub);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getstatic       #173 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_drawee_stub>
	//    6   12:invokevirtual   #176 <Method View getProperViewFromInflatedStub(int)>
	//    7   15:putfield        #156 <Field View mSimpleDraweeView>
			setInAppMessageImageViewAttributes(activity, iinappmessageimmersive, ((IInAppMessageImageView) ((AppboyInAppMessageSimpleDraweeView)mSimpleDraweeView)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #156 <Field View mSimpleDraweeView>
	//   13   25:checkcast       #178 <Class AppboyInAppMessageSimpleDraweeView>
	//   14   28:invokespecial   #180 <Method void setInAppMessageImageViewAttributes(Activity, IInAppMessageImmersive, IInAppMessageImageView)>
			return;
	//   15   31:return          
		} else
		{
			mAppboyInAppMessageImageView = (AppboyInAppMessageImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_full_imageview_stub);
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getstatic       #183 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_imageview_stub>
	//   19   37:invokevirtual   #176 <Method View getProperViewFromInflatedStub(int)>
	//   20   40:checkcast       #185 <Class AppboyInAppMessageImageView>
	//   21   43:putfield        #153 <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
			setInAppMessageImageViewAttributes(activity, iinappmessageimmersive, ((IInAppMessageImageView) (mAppboyInAppMessageImageView)));
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:aload_0         
	//   26   50:getfield        #153 <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
	//   27   53:invokespecial   #180 <Method void setInAppMessageImageViewAttributes(Activity, IInAppMessageImmersive, IInAppMessageImageView)>
			return;
	//   28   56:return          
		}
	}

	public void resetMessageMargins(boolean flag)
	{
		super.resetMessageMargins(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #189 <Method void AppboyInAppMessageImmersiveBaseView.resetMessageMargins(boolean)>
		findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_text_layout).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				AppboyLogger.d(AppboyInAppMessageFullView.TAG, "Passing scrollView click event to message clickable view.");
			//    0    0:invokestatic    #27  <Method String AppboyInAppMessageFullView.access$000()>
			//    1    3:ldc1            #29  <String "Passing scrollView click event to message clickable view.">
			//    2    5:invokestatic    #35  <Method int AppboyLogger.d(String, String)>
			//    3    8:pop             
				getMessageClickableView().performClick();
			//    4    9:aload_0         
			//    5   10:getfield        #17  <Field AppboyInAppMessageFullView this$0>
			//    6   13:invokevirtual   #39  <Method View AppboyInAppMessageFullView.getMessageClickableView()>
			//    7   16:invokevirtual   #45  <Method boolean View.performClick()>
			//    8   19:pop             
			//    9   20:return          
			}

			final AppboyInAppMessageFullView this$0;

			
			{
				this$0 = AppboyInAppMessageFullView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyInAppMessageFullView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    5:aload_0         
	//    4    6:getstatic       #192 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full_text_layout>
	//    5    9:invokevirtual   #93  <Method View findViewById(int)>
	//    6   12:new             #6   <Class AppboyInAppMessageFullView$1>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #195 <Method void AppboyInAppMessageFullView$1(AppboyInAppMessageFullView)>
	//   10   20:invokevirtual   #199 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   11   23:return          
	}

	public void setMessageBackgroundColor(int i)
	{
		if(getMessageBackgroundObject().getBackground() instanceof GradientDrawable)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #113 <Method View getMessageBackgroundObject()>
	//*   2    4:invokevirtual   #205 <Method android.graphics.drawable.Drawable View.getBackground()>
	//*   3    7:instanceof      #207 <Class GradientDrawable>
	//*   4   10:ifeq            38
		{
			InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full), i, getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_background_light));
	//    5   13:aload_0         
	//    6   14:getstatic       #98  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_full>
	//    7   17:invokevirtual   #93  <Method View findViewById(int)>
	//    8   20:iload_1         
	//    9   21:aload_0         
	//   10   22:invokevirtual   #211 <Method Context getContext()>
	//   11   25:invokevirtual   #217 <Method Resources Context.getResources()>
	//   12   28:getstatic       #222 <Field int com.appboy.ui.R$color.com_appboy_inappmessage_background_light>
	//   13   31:invokevirtual   #228 <Method int Resources.getColor(int)>
	//   14   34:invokestatic    #234 <Method void InAppMessageViewUtils.setViewBackgroundColorFilter(View, int, int)>
			return;
	//   15   37:return          
		} else
		{
			super.setMessageBackgroundColor(i);
	//   16   38:aload_0         
	//   17   39:iload_1         
	//   18   40:invokespecial   #236 <Method void AppboyInAppMessageImmersiveBaseView.setMessageBackgroundColor(int)>
			return;
	//   19   43:return          
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/views/AppboyInAppMessageFullView);
	private AppboyInAppMessageImageView mAppboyInAppMessageImageView;
	private View mSimpleDraweeView;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageFullView>
	//    1    2:invokestatic    #20  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #22  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #22  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
