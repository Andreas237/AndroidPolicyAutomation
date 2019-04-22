// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.ui.inappmessage.IInAppMessageImageView;
import com.appboy.ui.inappmessage.config.AppboyInAppMessageParams;
import com.appboy.ui.support.ViewUtils;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			AppboyInAppMessageImmersiveBaseView, InAppMessageViewUtils

public class AppboyInAppMessageModalView extends AppboyInAppMessageImmersiveBaseView
{

	public AppboyInAppMessageModalView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void AppboyInAppMessageImmersiveBaseView(Context, AttributeSet)>
	//    4    6:return          
	}

	private void resizeGraphicFrameIfAppropriate(Activity activity, IInAppMessageImmersive iinappmessageimmersive, double d)
	{
		if(!iinappmessageimmersive.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC))))
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #36  <Method ImageStyle IInAppMessageImmersive.getImageStyle()>
	//*   2    6:getstatic       #42  <Field ImageStyle ImageStyle.GRAPHIC>
	//*   3    9:invokevirtual   #46  <Method boolean ImageStyle.equals(Object)>
	//*   4   12:ifne            16
			return;
	//    5   15:return          
		double d1 = AppboyInAppMessageParams.getGraphicModalMaxWidthDp();
	//    6   16:invokestatic    #52  <Method double AppboyInAppMessageParams.getGraphicModalMaxWidthDp()>
	//    7   19:dstore          5
		double d2 = AppboyInAppMessageParams.getGraphicModalMaxHeightDp();
	//    8   21:invokestatic    #55  <Method double AppboyInAppMessageParams.getGraphicModalMaxHeightDp()>
	//    9   24:dstore          7
		double d3 = d1 / d2;
	//   10   26:dload           5
	//   11   28:dload           7
	//   12   30:ddiv            
	//   13   31:dstore          9
		iinappmessageimmersive = ((IInAppMessageImmersive) ((android.widget.RelativeLayout.LayoutParams)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_graphic_bound).getLayoutParams()));
	//   14   33:aload_0         
	//   15   34:getstatic       #61  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_graphic_bound>
	//   16   37:invokevirtual   #65  <Method View findViewById(int)>
	//   17   40:invokevirtual   #71  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   43:checkcast       #73  <Class android.widget.RelativeLayout$LayoutParams>
	//   19   46:astore_2        
		if(d >= d3)
	//*  20   47:dload_3         
	//*  21   48:dload           9
	//*  22   50:dcmpl           
	//*  23   51:iflt            81
		{
			iinappmessageimmersive.width = (int)ViewUtils.convertDpToPixels(activity, d1);
	//   24   54:aload_2         
	//   25   55:aload_1         
	//   26   56:dload           5
	//   27   58:invokestatic    #79  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//   28   61:d2i             
	//   29   62:putfield        #82  <Field int android.widget.RelativeLayout$LayoutParams.width>
			iinappmessageimmersive.height = (int)(ViewUtils.convertDpToPixels(activity, d1) / d);
	//   30   65:aload_2         
	//   31   66:aload_1         
	//   32   67:dload           5
	//   33   69:invokestatic    #79  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//   34   72:dload_3         
	//   35   73:ddiv            
	//   36   74:d2i             
	//   37   75:putfield        #85  <Field int android.widget.RelativeLayout$LayoutParams.height>
		} else
	//*  38   78:goto            105
		{
			iinappmessageimmersive.width = (int)(ViewUtils.convertDpToPixels(activity, d2) * d);
	//   39   81:aload_2         
	//   40   82:aload_1         
	//   41   83:dload           7
	//   42   85:invokestatic    #79  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//   43   88:dload_3         
	//   44   89:dmul            
	//   45   90:d2i             
	//   46   91:putfield        #82  <Field int android.widget.RelativeLayout$LayoutParams.width>
			iinappmessageimmersive.height = (int)ViewUtils.convertDpToPixels(activity, d2);
	//   47   94:aload_2         
	//   48   95:aload_1         
	//   49   96:dload           7
	//   50   98:invokestatic    #79  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//   51  101:d2i             
	//   52  102:putfield        #85  <Field int android.widget.RelativeLayout$LayoutParams.height>
		}
		findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_graphic_bound).setLayoutParams(((android.view.ViewGroup.LayoutParams) (iinappmessageimmersive)));
	//   53  105:aload_0         
	//   54  106:getstatic       #61  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_graphic_bound>
	//   55  109:invokevirtual   #65  <Method View findViewById(int)>
	//   56  112:aload_2         
	//   57  113:invokevirtual   #89  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   58  116:return          
	}

	private void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive iinappmessageimmersive, IInAppMessageImageView iinappmessageimageview)
	{
		float f = (float)ViewUtils.convertDpToPixels(activity, AppboyInAppMessageParams.getModalizedImageRadiusDp());
	//    0    0:aload_1         
	//    1    1:invokestatic    #94  <Method double AppboyInAppMessageParams.getModalizedImageRadiusDp()>
	//    2    4:invokestatic    #79  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//    3    7:d2f             
	//    4    8:fstore          4
		if(iinappmessageimmersive.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC))))
	//*   5   10:aload_2         
	//*   6   11:invokeinterface #36  <Method ImageStyle IInAppMessageImmersive.getImageStyle()>
	//*   7   16:getstatic       #42  <Field ImageStyle ImageStyle.GRAPHIC>
	//*   8   19:invokevirtual   #46  <Method boolean ImageStyle.equals(Object)>
	//*   9   22:ifeq            36
			iinappmessageimageview.setCornersRadiusPx(f);
	//   10   25:aload_3         
	//   11   26:fload           4
	//   12   28:invokeinterface #100 <Method void IInAppMessageImageView.setCornersRadiusPx(float)>
		else
	//*  13   33:goto            48
			iinappmessageimageview.setCornersRadiiPx(f, f, 0.0F, 0.0F);
	//   14   36:aload_3         
	//   15   37:fload           4
	//   16   39:fload           4
	//   17   41:fconst_0        
	//   18   42:fconst_0        
	//   19   43:invokeinterface #104 <Method void IInAppMessageImageView.setCornersRadiiPx(float, float, float, float)>
		iinappmessageimageview.setInAppMessageImageCropType(iinappmessageimmersive.getCropType());
	//   20   48:aload_3         
	//   21   49:aload_2         
	//   22   50:invokeinterface #108 <Method com.appboy.enums.inappmessage.CropType IInAppMessageImmersive.getCropType()>
	//   23   55:invokeinterface #112 <Method void IInAppMessageImageView.setInAppMessageImageCropType(com.appboy.enums.inappmessage.CropType)>
	//   24   60:return          
	}

	public View getFrameView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_frame);
	//    0    0:aload_0         
	//    1    1:getstatic       #117 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_frame>
	//    2    4:invokevirtual   #65  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public Drawable getMessageBackgroundObject()
	{
		return getMessageClickableView().getBackground();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method View getMessageClickableView()>
	//    2    4:invokevirtual   #125 <Method Drawable View.getBackground()>
	//    3    7:areturn         
	}

	public volatile Object getMessageBackgroundObject()
	{
		return ((Object) (getMessageBackgroundObject()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method Drawable getMessageBackgroundObject()>
	//    2    4:areturn         
	}

	public List getMessageButtonViews()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #132 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void ArrayList()>
	//    3    7:astore_1        
		if(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_one) != null)
	//*   4    8:aload_0         
	//*   5    9:getstatic       #137 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_one>
	//*   6   12:invokevirtual   #65  <Method View findViewById(int)>
	//*   7   15:ifnull          32
			((List) (arraylist)).add(((Object) (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_one))));
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getstatic       #137 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_one>
	//   11   23:invokevirtual   #65  <Method View findViewById(int)>
	//   12   26:invokeinterface #142 <Method boolean List.add(Object)>
	//   13   31:pop             
		if(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_two) != null)
	//*  14   32:aload_0         
	//*  15   33:getstatic       #145 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_two>
	//*  16   36:invokevirtual   #65  <Method View findViewById(int)>
	//*  17   39:ifnull          56
			((List) (arraylist)).add(((Object) (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_two))));
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:getstatic       #145 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_two>
	//   21   47:invokevirtual   #65  <Method View findViewById(int)>
	//   22   50:invokeinterface #142 <Method boolean List.add(Object)>
	//   23   55:pop             
		return ((List) (arraylist));
	//   24   56:aload_1         
	//   25   57:areturn         
	}

	public View getMessageButtonsView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_layout);
	//    0    0:aload_0         
	//    1    1:getstatic       #151 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_layout>
	//    2    4:invokevirtual   #65  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public View getMessageClickableView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal);
	//    0    0:aload_0         
	//    1    1:getstatic       #154 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal>
	//    2    4:invokevirtual   #65  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public View getMessageCloseButtonView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_close_button);
	//    0    0:aload_0         
	//    1    1:getstatic       #158 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_close_button>
	//    2    4:invokevirtual   #65  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public TextView getMessageHeaderTextView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_header_text);
	//    0    0:aload_0         
	//    1    1:getstatic       #163 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_header_text>
	//    2    4:invokevirtual   #65  <Method View findViewById(int)>
	//    3    7:checkcast       #165 <Class TextView>
	//    4   10:areturn         
	}

	public TextView getMessageIconView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_icon);
	//    0    0:aload_0         
	//    1    1:getstatic       #169 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_icon>
	//    2    4:invokevirtual   #65  <Method View findViewById(int)>
	//    3    7:checkcast       #165 <Class TextView>
	//    4   10:areturn         
	}

	public ImageView getMessageImageView()
	{
		return ((ImageView) (mAppboyInAppMessageImageView));
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
	//    2    4:areturn         
	}

	public TextView getMessageTextView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_message);
	//    0    0:aload_0         
	//    1    1:getstatic       #177 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_message>
	//    2    4:invokevirtual   #65  <Method View findViewById(int)>
	//    3    7:checkcast       #165 <Class TextView>
	//    4   10:areturn         
	}

	public void inflateStubViews(Activity activity, IInAppMessageImmersive iinappmessageimmersive)
	{
		mAppboyInAppMessageImageView = (AppboyInAppMessageImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_modal_imageview_stub);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getstatic       #182 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_imageview_stub>
	//    3    5:invokevirtual   #185 <Method View getProperViewFromInflatedStub(int)>
	//    4    8:checkcast       #187 <Class AppboyInAppMessageImageView>
	//    5   11:putfield        #173 <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
		setInAppMessageImageViewAttributes(activity, iinappmessageimmersive, ((IInAppMessageImageView) (mAppboyInAppMessageImageView)));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #173 <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
	//   11   21:invokespecial   #189 <Method void setInAppMessageImageViewAttributes(Activity, IInAppMessageImmersive, IInAppMessageImageView)>
		if(iinappmessageimmersive.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC))) && iinappmessageimmersive.getBitmap() != null)
	//*  12   24:aload_2         
	//*  13   25:invokeinterface #36  <Method ImageStyle IInAppMessageImmersive.getImageStyle()>
	//*  14   30:getstatic       #42  <Field ImageStyle ImageStyle.GRAPHIC>
	//*  15   33:invokevirtual   #46  <Method boolean ImageStyle.equals(Object)>
	//*  16   36:ifeq            75
	//*  17   39:aload_2         
	//*  18   40:invokeinterface #193 <Method Bitmap IInAppMessageImmersive.getBitmap()>
	//*  19   45:ifnull          75
			resizeGraphicFrameIfAppropriate(activity, iinappmessageimmersive, (double)iinappmessageimmersive.getBitmap().getWidth() / (double)iinappmessageimmersive.getBitmap().getHeight());
	//   20   48:aload_0         
	//   21   49:aload_1         
	//   22   50:aload_2         
	//   23   51:aload_2         
	//   24   52:invokeinterface #193 <Method Bitmap IInAppMessageImmersive.getBitmap()>
	//   25   57:invokevirtual   #199 <Method int Bitmap.getWidth()>
	//   26   60:i2d             
	//   27   61:aload_2         
	//   28   62:invokeinterface #193 <Method Bitmap IInAppMessageImmersive.getBitmap()>
	//   29   67:invokevirtual   #202 <Method int Bitmap.getHeight()>
	//   30   70:i2d             
	//   31   71:ddiv            
	//   32   72:invokespecial   #204 <Method void resizeGraphicFrameIfAppropriate(Activity, IInAppMessageImmersive, double)>
	//   33   75:return          
	}

	public void resetMessageMargins(boolean flag)
	{
		super.resetMessageMargins(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #208 <Method void AppboyInAppMessageImmersiveBaseView.resetMessageMargins(boolean)>
		Object obj = ((Object) ((RelativeLayout)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_image_layout)));
	//    3    5:aload_0         
	//    4    6:getstatic       #211 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_image_layout>
	//    5    9:invokevirtual   #65  <Method View findViewById(int)>
	//    6   12:checkcast       #213 <Class RelativeLayout>
	//    7   15:astore_2        
		if((flag || getMessageIconView() != null) && obj != null)
	//*   8   16:iload_1         
	//*   9   17:ifne            27
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #215 <Method TextView getMessageIconView()>
	//*  12   24:ifnull          55
	//*  13   27:aload_2         
	//*  14   28:ifnull          55
		{
			android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
	//   15   31:new             #73  <Class android.widget.RelativeLayout$LayoutParams>
	//   16   34:dup             
	//   17   35:iconst_m1       
	//   18   36:bipush          -2
	//   19   38:invokespecial   #218 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   20   41:astore_3        
			layoutparams.setMargins(0, 0, 0, 0);
	//   21   42:aload_3         
	//   22   43:iconst_0        
	//   23   44:iconst_0        
	//   24   45:iconst_0        
	//   25   46:iconst_0        
	//   26   47:invokevirtual   #222 <Method void android.widget.RelativeLayout$LayoutParams.setMargins(int, int, int, int)>
			((RelativeLayout) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   27   50:aload_2         
	//   28   51:aload_3         
	//   29   52:invokevirtual   #223 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
		obj = ((Object) (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_text_layout)));
	//   30   55:aload_0         
	//   31   56:getstatic       #226 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_text_layout>
	//   32   59:invokevirtual   #65  <Method View findViewById(int)>
	//   33   62:astore_2        
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				AppboyLogger.d(AppboyInAppMessageModalView.TAG, "Passing scrollView click event to message clickable view.");
			//    0    0:invokestatic    #27  <Method String AppboyInAppMessageModalView.access$000()>
			//    1    3:ldc1            #29  <String "Passing scrollView click event to message clickable view.">
			//    2    5:invokestatic    #35  <Method int AppboyLogger.d(String, String)>
			//    3    8:pop             
				getMessageClickableView().performClick();
			//    4    9:aload_0         
			//    5   10:getfield        #17  <Field AppboyInAppMessageModalView this$0>
			//    6   13:invokevirtual   #39  <Method View AppboyInAppMessageModalView.getMessageClickableView()>
			//    7   16:invokevirtual   #45  <Method boolean View.performClick()>
			//    8   19:pop             
			//    9   20:return          
			}

			final AppboyInAppMessageModalView this$0;

			
			{
				this$0 = AppboyInAppMessageModalView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyInAppMessageModalView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   34   63:new             #6   <Class AppboyInAppMessageModalView$1>
	//   35   66:dup             
	//   36   67:aload_0         
	//   37   68:invokespecial   #229 <Method void AppboyInAppMessageModalView$1(AppboyInAppMessageModalView)>
	//   38   71:astore_3        
		if(!(obj instanceof View))
	//*  39   72:aload_2         
	//*  40   73:instanceof      #67  <Class View>
	//*  41   76:ifne            85
		{
			((View) (obj)).setOnClickListener(onclicklistener);
	//   42   79:aload_2         
	//   43   80:aload_3         
	//   44   81:invokevirtual   #233 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   45   84:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)obj, onclicklistener);
	//   46   85:aload_2         
	//   47   86:checkcast       #67  <Class View>
	//   48   89:aload_3         
	//   49   90:invokestatic    #238 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   50   93:return          
		}
	}

	public void setMessageBackgroundColor(int i)
	{
		InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal), i, getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_background_light));
	//    0    0:aload_0         
	//    1    1:getstatic       #154 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal>
	//    2    4:invokevirtual   #65  <Method View findViewById(int)>
	//    3    7:iload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #244 <Method Context getContext()>
	//    6   12:invokevirtual   #250 <Method Resources Context.getResources()>
	//    7   15:getstatic       #255 <Field int com.appboy.ui.R$color.com_appboy_inappmessage_background_light>
	//    8   18:invokevirtual   #261 <Method int Resources.getColor(int)>
	//    9   21:invokestatic    #267 <Method void InAppMessageViewUtils.setViewBackgroundColorFilter(View, int, int)>
	//   10   24:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/views/AppboyInAppMessageModalView);
	private AppboyInAppMessageImageView mAppboyInAppMessageImageView;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageModalView>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #21  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
