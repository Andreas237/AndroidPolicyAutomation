// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.*;
import com.appboy.ui.inappmessage.config.AppboyInAppMessageParams;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.ViewUtils;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
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
	//    3    3:invokespecial   #31  <Method void AppboyInAppMessageImmersiveBaseView(Context, AttributeSet)>
	//    4    6:return          
	}

	private void resizeGraphicFrameIfAppropriate(Activity activity, IInAppMessageImmersive iinappmessageimmersive, double d)
	{
		if(!iinappmessageimmersive.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC))))
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #49  <Method ImageStyle IInAppMessageImmersive.getImageStyle()>
	//*   2    6:getstatic       #55  <Field ImageStyle ImageStyle.GRAPHIC>
	//*   3    9:invokevirtual   #59  <Method boolean ImageStyle.equals(Object)>
	//*   4   12:ifne            16
			return;
	//    5   15:return          
		double d1 = AppboyInAppMessageParams.getGraphicModalMaxWidthDp();
	//    6   16:invokestatic    #65  <Method double AppboyInAppMessageParams.getGraphicModalMaxWidthDp()>
	//    7   19:dstore          5
		double d2 = AppboyInAppMessageParams.getGraphicModalMaxHeightDp();
	//    8   21:invokestatic    #68  <Method double AppboyInAppMessageParams.getGraphicModalMaxHeightDp()>
	//    9   24:dstore          7
		double d3 = d1 / d2;
	//   10   26:dload           5
	//   11   28:dload           7
	//   12   30:ddiv            
	//   13   31:dstore          9
		iinappmessageimmersive = ((IInAppMessageImmersive) ((android.widget.RelativeLayout.LayoutParams)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_graphic_bound).getLayoutParams()));
	//   14   33:aload_0         
	//   15   34:getstatic       #74  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_graphic_bound>
	//   16   37:invokevirtual   #78  <Method View findViewById(int)>
	//   17   40:invokevirtual   #84  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   43:checkcast       #86  <Class android.widget.RelativeLayout$LayoutParams>
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
	//   27   58:invokestatic    #92  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//   28   61:d2i             
	//   29   62:putfield        #95  <Field int android.widget.RelativeLayout$LayoutParams.width>
			iinappmessageimmersive.height = (int)(ViewUtils.convertDpToPixels(activity, d1) / d);
	//   30   65:aload_2         
	//   31   66:aload_1         
	//   32   67:dload           5
	//   33   69:invokestatic    #92  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//   34   72:dload_3         
	//   35   73:ddiv            
	//   36   74:d2i             
	//   37   75:putfield        #98  <Field int android.widget.RelativeLayout$LayoutParams.height>
		} else
	//*  38   78:goto            105
		{
			iinappmessageimmersive.width = (int)(ViewUtils.convertDpToPixels(activity, d2) * d);
	//   39   81:aload_2         
	//   40   82:aload_1         
	//   41   83:dload           7
	//   42   85:invokestatic    #92  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//   43   88:dload_3         
	//   44   89:dmul            
	//   45   90:d2i             
	//   46   91:putfield        #95  <Field int android.widget.RelativeLayout$LayoutParams.width>
			iinappmessageimmersive.height = (int)ViewUtils.convertDpToPixels(activity, d2);
	//   47   94:aload_2         
	//   48   95:aload_1         
	//   49   96:dload           7
	//   50   98:invokestatic    #92  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//   51  101:d2i             
	//   52  102:putfield        #98  <Field int android.widget.RelativeLayout$LayoutParams.height>
		}
		findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_graphic_bound).setLayoutParams(((android.view.ViewGroup.LayoutParams) (iinappmessageimmersive)));
	//   53  105:aload_0         
	//   54  106:getstatic       #74  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_graphic_bound>
	//   55  109:invokevirtual   #78  <Method View findViewById(int)>
	//   56  112:aload_2         
	//   57  113:invokevirtual   #102 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   58  116:return          
	}

	private void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive iinappmessageimmersive, IInAppMessageImageView iinappmessageimageview)
	{
		float f = (float)ViewUtils.convertDpToPixels(activity, AppboyInAppMessageParams.getModalizedImageRadiusDp());
	//    0    0:aload_1         
	//    1    1:invokestatic    #107 <Method double AppboyInAppMessageParams.getModalizedImageRadiusDp()>
	//    2    4:invokestatic    #92  <Method double ViewUtils.convertDpToPixels(Activity, double)>
	//    3    7:d2f             
	//    4    8:fstore          4
		if(iinappmessageimmersive.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC))))
	//*   5   10:aload_2         
	//*   6   11:invokeinterface #49  <Method ImageStyle IInAppMessageImmersive.getImageStyle()>
	//*   7   16:getstatic       #55  <Field ImageStyle ImageStyle.GRAPHIC>
	//*   8   19:invokevirtual   #59  <Method boolean ImageStyle.equals(Object)>
	//*   9   22:ifeq            36
			iinappmessageimageview.setCornersRadiusPx(f);
	//   10   25:aload_3         
	//   11   26:fload           4
	//   12   28:invokeinterface #113 <Method void IInAppMessageImageView.setCornersRadiusPx(float)>
		else
	//*  13   33:goto            48
			iinappmessageimageview.setCornersRadiiPx(f, f, 0.0F, 0.0F);
	//   14   36:aload_3         
	//   15   37:fload           4
	//   16   39:fload           4
	//   17   41:fconst_0        
	//   18   42:fconst_0        
	//   19   43:invokeinterface #117 <Method void IInAppMessageImageView.setCornersRadiiPx(float, float, float, float)>
		iinappmessageimageview.setInAppMessageImageCropType(iinappmessageimmersive.getCropType());
	//   20   48:aload_3         
	//   21   49:aload_2         
	//   22   50:invokeinterface #121 <Method com.appboy.enums.inappmessage.CropType IInAppMessageImmersive.getCropType()>
	//   23   55:invokeinterface #125 <Method void IInAppMessageImageView.setInAppMessageImageCropType(com.appboy.enums.inappmessage.CropType)>
	//   24   60:return          
	}

	public View getFrameView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_frame);
	//    0    0:aload_0         
	//    1    1:getstatic       #130 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_frame>
	//    2    4:invokevirtual   #78  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public Drawable getMessageBackgroundObject()
	{
		return getMessageClickableView().getBackground();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method View getMessageClickableView()>
	//    2    4:invokevirtual   #138 <Method Drawable View.getBackground()>
	//    3    7:areturn         
	}

	public volatile Object getMessageBackgroundObject()
	{
		return ((Object) (getMessageBackgroundObject()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method Drawable getMessageBackgroundObject()>
	//    2    4:areturn         
	}

	public List getMessageButtonViews()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #145 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #147 <Method void ArrayList()>
	//    3    7:astore_1        
		if(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_one) != null)
	//*   4    8:aload_0         
	//*   5    9:getstatic       #150 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_one>
	//*   6   12:invokevirtual   #78  <Method View findViewById(int)>
	//*   7   15:ifnull          32
			((List) (arraylist)).add(((Object) (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_one))));
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getstatic       #150 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_one>
	//   11   23:invokevirtual   #78  <Method View findViewById(int)>
	//   12   26:invokeinterface #155 <Method boolean List.add(Object)>
	//   13   31:pop             
		if(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_two) != null)
	//*  14   32:aload_0         
	//*  15   33:getstatic       #158 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_two>
	//*  16   36:invokevirtual   #78  <Method View findViewById(int)>
	//*  17   39:ifnull          56
			((List) (arraylist)).add(((Object) (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_two))));
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:getstatic       #158 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_two>
	//   21   47:invokevirtual   #78  <Method View findViewById(int)>
	//   22   50:invokeinterface #155 <Method boolean List.add(Object)>
	//   23   55:pop             
		return ((List) (arraylist));
	//   24   56:aload_1         
	//   25   57:areturn         
	}

	public View getMessageButtonsView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_layout);
	//    0    0:aload_0         
	//    1    1:getstatic       #164 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_button_layout>
	//    2    4:invokevirtual   #78  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public View getMessageClickableView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal);
	//    0    0:aload_0         
	//    1    1:getstatic       #167 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal>
	//    2    4:invokevirtual   #78  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public View getMessageCloseButtonView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_close_button);
	//    0    0:aload_0         
	//    1    1:getstatic       #171 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_close_button>
	//    2    4:invokevirtual   #78  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public TextView getMessageHeaderTextView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_header_text);
	//    0    0:aload_0         
	//    1    1:getstatic       #176 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_header_text>
	//    2    4:invokevirtual   #78  <Method View findViewById(int)>
	//    3    7:checkcast       #178 <Class TextView>
	//    4   10:areturn         
	}

	public TextView getMessageIconView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_icon);
	//    0    0:aload_0         
	//    1    1:getstatic       #182 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_icon>
	//    2    4:invokevirtual   #78  <Method View findViewById(int)>
	//    3    7:checkcast       #178 <Class TextView>
	//    4   10:areturn         
	}

	public ImageView getMessageImageView()
	{
		return ((ImageView) (mAppboyInAppMessageImageView));
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
	//    2    4:areturn         
	}

	public View getMessageSimpleDraweeView()
	{
		return mSimpleDraweeView;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field View mSimpleDraweeView>
	//    2    4:areturn         
	}

	public TextView getMessageTextView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_message);
	//    0    0:aload_0         
	//    1    1:getstatic       #191 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_message>
	//    2    4:invokevirtual   #78  <Method View findViewById(int)>
	//    3    7:checkcast       #178 <Class TextView>
	//    4   10:areturn         
	}

	public void inflateStubViews(Activity activity, IInAppMessageImmersive iinappmessageimmersive)
	{
		if(mCanUseFresco)
	//*   0    0:aload_0         
	//*   1    1:getfield        #197 <Field boolean mCanUseFresco>
	//*   2    4:ifeq            32
		{
			mSimpleDraweeView = getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_modal_drawee_stub);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getstatic       #200 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_drawee_stub>
	//    6   12:invokevirtual   #203 <Method View getProperViewFromInflatedStub(int)>
	//    7   15:putfield        #43  <Field View mSimpleDraweeView>
			setInAppMessageImageViewAttributes(activity, iinappmessageimmersive, ((IInAppMessageImageView) ((AppboyInAppMessageSimpleDraweeView)mSimpleDraweeView)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field View mSimpleDraweeView>
	//   13   25:checkcast       #205 <Class AppboyInAppMessageSimpleDraweeView>
	//   14   28:invokespecial   #207 <Method void setInAppMessageImageViewAttributes(Activity, IInAppMessageImmersive, IInAppMessageImageView)>
			return;
	//   15   31:return          
		}
		mAppboyInAppMessageImageView = (AppboyInAppMessageImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_modal_imageview_stub);
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getstatic       #210 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_imageview_stub>
	//   19   37:invokevirtual   #203 <Method View getProperViewFromInflatedStub(int)>
	//   20   40:checkcast       #212 <Class AppboyInAppMessageImageView>
	//   21   43:putfield        #186 <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
		setInAppMessageImageViewAttributes(activity, iinappmessageimmersive, ((IInAppMessageImageView) (mAppboyInAppMessageImageView)));
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:aload_0         
	//   26   50:getfield        #186 <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
	//   27   53:invokespecial   #207 <Method void setInAppMessageImageViewAttributes(Activity, IInAppMessageImmersive, IInAppMessageImageView)>
		if(iinappmessageimmersive.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC))) && iinappmessageimmersive.getBitmap() != null)
	//*  28   56:aload_2         
	//*  29   57:invokeinterface #49  <Method ImageStyle IInAppMessageImmersive.getImageStyle()>
	//*  30   62:getstatic       #55  <Field ImageStyle ImageStyle.GRAPHIC>
	//*  31   65:invokevirtual   #59  <Method boolean ImageStyle.equals(Object)>
	//*  32   68:ifeq            107
	//*  33   71:aload_2         
	//*  34   72:invokeinterface #216 <Method Bitmap IInAppMessageImmersive.getBitmap()>
	//*  35   77:ifnull          107
			resizeGraphicFrameIfAppropriate(activity, iinappmessageimmersive, (double)iinappmessageimmersive.getBitmap().getWidth() / (double)iinappmessageimmersive.getBitmap().getHeight());
	//   36   80:aload_0         
	//   37   81:aload_1         
	//   38   82:aload_2         
	//   39   83:aload_2         
	//   40   84:invokeinterface #216 <Method Bitmap IInAppMessageImmersive.getBitmap()>
	//   41   89:invokevirtual   #222 <Method int Bitmap.getWidth()>
	//   42   92:i2d             
	//   43   93:aload_2         
	//   44   94:invokeinterface #216 <Method Bitmap IInAppMessageImmersive.getBitmap()>
	//   45   99:invokevirtual   #225 <Method int Bitmap.getHeight()>
	//   46  102:i2d             
	//   47  103:ddiv            
	//   48  104:invokespecial   #39  <Method void resizeGraphicFrameIfAppropriate(Activity, IInAppMessageImmersive, double)>
	//   49  107:return          
	}

	public void resetMessageMargins(boolean flag)
	{
		super.resetMessageMargins(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #229 <Method void AppboyInAppMessageImmersiveBaseView.resetMessageMargins(boolean)>
		RelativeLayout relativelayout = (RelativeLayout)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_image_layout);
	//    3    5:aload_0         
	//    4    6:getstatic       #232 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_image_layout>
	//    5    9:invokevirtual   #78  <Method View findViewById(int)>
	//    6   12:checkcast       #234 <Class RelativeLayout>
	//    7   15:astore_2        
		if((flag || getMessageIconView() != null) && relativelayout != null)
	//*   8   16:iload_1         
	//*   9   17:ifne            27
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #236 <Method TextView getMessageIconView()>
	//*  12   24:ifnull          55
	//*  13   27:aload_2         
	//*  14   28:ifnull          55
		{
			android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
	//   15   31:new             #86  <Class android.widget.RelativeLayout$LayoutParams>
	//   16   34:dup             
	//   17   35:iconst_m1       
	//   18   36:bipush          -2
	//   19   38:invokespecial   #239 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   20   41:astore_3        
			layoutparams.setMargins(0, 0, 0, 0);
	//   21   42:aload_3         
	//   22   43:iconst_0        
	//   23   44:iconst_0        
	//   24   45:iconst_0        
	//   25   46:iconst_0        
	//   26   47:invokevirtual   #243 <Method void android.widget.RelativeLayout$LayoutParams.setMargins(int, int, int, int)>
			relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   27   50:aload_2         
	//   28   51:aload_3         
	//   29   52:invokevirtual   #244 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
		findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_text_layout).setOnClickListener(new android.view.View.OnClickListener() {

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
);
	//   30   55:aload_0         
	//   31   56:getstatic       #247 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal_text_layout>
	//   32   59:invokevirtual   #78  <Method View findViewById(int)>
	//   33   62:new             #6   <Class AppboyInAppMessageModalView$1>
	//   34   65:dup             
	//   35   66:aload_0         
	//   36   67:invokespecial   #250 <Method void AppboyInAppMessageModalView$1(AppboyInAppMessageModalView)>
	//   37   70:invokevirtual   #254 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   38   73:return          
	}

	public void setMessageBackgroundColor(int i)
	{
		InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal), i, getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_background_light));
	//    0    0:aload_0         
	//    1    1:getstatic       #167 <Field int com.appboy.ui.R$id.com_appboy_inappmessage_modal>
	//    2    4:invokevirtual   #78  <Method View findViewById(int)>
	//    3    7:iload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #260 <Method Context getContext()>
	//    6   12:invokevirtual   #266 <Method Resources Context.getResources()>
	//    7   15:getstatic       #271 <Field int com.appboy.ui.R$color.com_appboy_inappmessage_background_light>
	//    8   18:invokevirtual   #277 <Method int Resources.getColor(int)>
	//    9   21:invokestatic    #283 <Method void InAppMessageViewUtils.setViewBackgroundColorFilter(View, int, int)>
	//   10   24:return          
	}

	public void setMessageSimpleDrawee(final IInAppMessageImmersive inAppMessage, final Activity activity)
	{
		if(inAppMessage.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #49  <Method ImageStyle IInAppMessageImmersive.getImageStyle()>
	//*   2    6:getstatic       #55  <Field ImageStyle ImageStyle.GRAPHIC>
	//*   3    9:invokevirtual   #59  <Method boolean ImageStyle.equals(Object)>
	//*   4   12:ifeq            45
		{
			activity = ((Activity) (new BaseControllerListener() {

				public void onFinalImageSet(String s, ImageInfo imageinfo, Animatable animatable)
				{
					if(imageinfo == null)
				//*   0    0:aload_2         
				//*   1    1:ifnonnull       5
					{
						return;
				//    2    4:return          
					} else
					{
						double d = (double)imageinfo.getWidth() / (double)imageinfo.getHeight();
				//    3    5:aload_2         
				//    4    6:invokeinterface #38  <Method int ImageInfo.getWidth()>
				//    5   11:i2d             
				//    6   12:aload_2         
				//    7   13:invokeinterface #41  <Method int ImageInfo.getHeight()>
				//    8   18:i2d             
				//    9   19:ddiv            
				//   10   20:dstore          4
						mSimpleDraweeView.post(((_cls1) (d)). new Runnable() {

							public void run()
							{
								resizeGraphicFrameIfAppropriate(activity, inAppMessage, imageAspectRatio);
							//    0    0:aload_0         
							//    1    1:getfield        #19  <Field AppboyInAppMessageModalView$2 this$1>
							//    2    4:getfield        #30  <Field AppboyInAppMessageModalView AppboyInAppMessageModalView$2.this$0>
							//    3    7:aload_0         
							//    4    8:getfield        #19  <Field AppboyInAppMessageModalView$2 this$1>
							//    5   11:getfield        #34  <Field Activity AppboyInAppMessageModalView$2.val$activity>
							//    6   14:aload_0         
							//    7   15:getfield        #19  <Field AppboyInAppMessageModalView$2 this$1>
							//    8   18:getfield        #38  <Field IInAppMessageImmersive AppboyInAppMessageModalView$2.val$inAppMessage>
							//    9   21:aload_0         
							//   10   22:getfield        #21  <Field double val$imageAspectRatio>
							//   11   25:invokestatic    #44  <Method void AppboyInAppMessageModalView.access$100(AppboyInAppMessageModalView, Activity, IInAppMessageImmersive, double)>
							//   12   28:return          
							}

							final _cls2 this$1;
							final double val$imageAspectRatio;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppboyInAppMessageModalView$2 this$1>
				imageAspectRatio = D.this;
			//    3    5:aload_0         
			//    4    6:dload_2         
			//    5    7:putfield        #21  <Field double val$imageAspectRatio>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
						}
);
				//   11   22:aload_0         
				//   12   23:getfield        #22  <Field AppboyInAppMessageModalView this$0>
				//   13   26:invokestatic    #45  <Method View AppboyInAppMessageModalView.access$200(AppboyInAppMessageModalView)>
				//   14   29:new             #12  <Class AppboyInAppMessageModalView$2$1>
				//   15   32:dup             
				//   16   33:aload_0         
				//   17   34:dload           4
				//   18   36:invokespecial   #48  <Method void AppboyInAppMessageModalView$2$1(AppboyInAppMessageModalView$2, double)>
				//   19   39:invokevirtual   #54  <Method boolean View.post(Runnable)>
				//   20   42:pop             
						return;
				//   21   43:return          
					}
				}

				public volatile void onFinalImageSet(String s, Object obj, Animatable animatable)
				{
					onFinalImageSet(s, (ImageInfo)obj, animatable);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #34  <Class ImageInfo>
				//    4    6:aload_3         
				//    5    7:invokevirtual   #57  <Method void onFinalImageSet(String, ImageInfo, Animatable)>
				//    6   10:return          
				}

				final AppboyInAppMessageModalView this$0;
				final Activity val$activity;
				final IInAppMessageImmersive val$inAppMessage;

			
			{
				this$0 = AppboyInAppMessageModalView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AppboyInAppMessageModalView this$0>
				activity = activity1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Activity val$activity>
				inAppMessage = iinappmessageimmersive;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field IInAppMessageImmersive val$inAppMessage>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void BaseControllerListener()>
			//   11   19:return          
			}
			}
));
	//    5   15:new             #8   <Class AppboyInAppMessageModalView$2>
	//    6   18:dup             
	//    7   19:aload_0         
	//    8   20:aload_2         
	//    9   21:aload_1         
	//   10   22:invokespecial   #288 <Method void AppboyInAppMessageModalView$2(AppboyInAppMessageModalView, Activity, IInAppMessageImmersive)>
	//   11   25:astore_2        
			FrescoLibraryUtils.setDraweeControllerHelper(((com.facebook.drawee.view.SimpleDraweeView) ((AppboyInAppMessageSimpleDraweeView)getMessageSimpleDraweeView())), getAppropriateImageUrl(((com.appboy.models.IInAppMessage) (inAppMessage))), 0.0F, false, ((com.facebook.drawee.controller.ControllerListener) (activity)));
	//   12   26:aload_0         
	//   13   27:invokevirtual   #290 <Method View getMessageSimpleDraweeView()>
	//   14   30:checkcast       #205 <Class AppboyInAppMessageSimpleDraweeView>
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #294 <Method String getAppropriateImageUrl(com.appboy.models.IInAppMessage)>
	//   18   38:fconst_0        
	//   19   39:iconst_0        
	//   20   40:aload_2         
	//   21   41:invokestatic    #300 <Method void FrescoLibraryUtils.setDraweeControllerHelper(com.facebook.drawee.view.SimpleDraweeView, String, float, boolean, com.facebook.drawee.controller.ControllerListener)>
			return;
	//   22   44:return          
		} else
		{
			setMessageSimpleDrawee(((com.appboy.models.IInAppMessage) (inAppMessage)));
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #303 <Method void setMessageSimpleDrawee(com.appboy.models.IInAppMessage)>
			return;
	//   26   50:return          
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/views/AppboyInAppMessageModalView);
	private AppboyInAppMessageImageView mAppboyInAppMessageImageView;
	private View mSimpleDraweeView;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageModalView>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #26  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static void access$100(AppboyInAppMessageModalView appboyinappmessagemodalview, Activity activity, IInAppMessageImmersive iinappmessageimmersive, double d)
	{
		appboyinappmessagemodalview.resizeGraphicFrameIfAppropriate(activity, iinappmessageimmersive, d);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:dload_3         
	//    4    4:invokespecial   #39  <Method void resizeGraphicFrameIfAppropriate(Activity, IInAppMessageImmersive, double)>
		return;
	//    5    7:return          
	}

*/


/*
	static View access$200(AppboyInAppMessageModalView appboyinappmessagemodalview)
	{
		return appboyinappmessagemodalview.mSimpleDraweeView;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field View mSimpleDraweeView>
	//    2    4:areturn         
	}

*/
}
