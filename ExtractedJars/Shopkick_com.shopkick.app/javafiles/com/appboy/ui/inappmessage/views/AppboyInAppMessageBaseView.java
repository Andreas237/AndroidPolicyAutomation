// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.*;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.models.IInAppMessage;
import com.appboy.support.StringUtils;
import com.appboy.ui.inappmessage.AppboyInAppMessageSimpleDraweeView;
import com.appboy.ui.inappmessage.IInAppMessageView;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.ViewUtils;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			InAppMessageViewUtils

public abstract class AppboyInAppMessageBaseView extends RelativeLayout
	implements IInAppMessageView
{

	public AppboyInAppMessageBaseView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void RelativeLayout(Context, AttributeSet)>
		mCanUseFresco = FrescoLibraryUtils.canUseFresco(context);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokestatic    #18  <Method boolean FrescoLibraryUtils.canUseFresco(Context)>
	//    7   11:putfield        #20  <Field boolean mCanUseFresco>
		setLayerType(1, ((android.graphics.Paint) (null)));
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #24  <Method void setLayerType(int, android.graphics.Paint)>
	//   12   20:return          
	}

	public String getAppropriateImageUrl(IInAppMessage iinappmessage)
	{
		if(!StringUtils.isNullOrBlank(iinappmessage.getLocalImageUrl()))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #33  <Method String IInAppMessage.getLocalImageUrl()>
	//*   2    6:invokestatic    #39  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    9:ifne            19
			return iinappmessage.getLocalImageUrl();
	//    4   12:aload_1         
	//    5   13:invokeinterface #33  <Method String IInAppMessage.getLocalImageUrl()>
	//    6   18:areturn         
		else
			return iinappmessage.getRemoteImageUrl();
	//    7   19:aload_1         
	//    8   20:invokeinterface #42  <Method String IInAppMessage.getRemoteImageUrl()>
	//    9   25:areturn         
	}

	public abstract Object getMessageBackgroundObject();

	public View getMessageClickableView()
	{
		return ((View) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public abstract TextView getMessageIconView();

	public abstract ImageView getMessageImageView();

	public abstract View getMessageSimpleDraweeView();

	public abstract TextView getMessageTextView();

	View getProperViewFromInflatedStub(int i)
	{
		((ViewStub)findViewById(i)).inflate();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #57  <Method View findViewById(int)>
	//    3    5:checkcast       #59  <Class ViewStub>
	//    4    8:invokevirtual   #62  <Method View ViewStub.inflate()>
	//    5   11:pop             
		if(mCanUseFresco)
	//*   6   12:aload_0         
	//*   7   13:getfield        #20  <Field boolean mCanUseFresco>
	//*   8   16:ifeq            27
			return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_drawee_view);
	//    9   19:aload_0         
	//   10   20:getstatic       #68  <Field int com.appboy.ui.R$id.com_appboy_stubbed_inappmessage_drawee_view>
	//   11   23:invokevirtual   #57  <Method View findViewById(int)>
	//   12   26:areturn         
		else
			return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_image_view);
	//   13   27:aload_0         
	//   14   28:getstatic       #71  <Field int com.appboy.ui.R$id.com_appboy_stubbed_inappmessage_image_view>
	//   15   31:invokevirtual   #57  <Method View findViewById(int)>
	//   16   34:areturn         
	}

	public void resetMessageMargins(boolean flag)
	{
		Object obj;
		RelativeLayout relativelayout;
		if(mCanUseFresco)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean mCanUseFresco>
	//*   2    4:ifeq            26
		{
			obj = ((Object) (getMessageSimpleDraweeView()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #75  <Method View getMessageSimpleDraweeView()>
	//    5   11:astore_2        
			relativelayout = (RelativeLayout)findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_drawee_view_parent);
	//    6   12:aload_0         
	//    7   13:getstatic       #78  <Field int com.appboy.ui.R$id.com_appboy_stubbed_inappmessage_drawee_view_parent>
	//    8   16:invokevirtual   #57  <Method View findViewById(int)>
	//    9   19:checkcast       #4   <Class RelativeLayout>
	//   10   22:astore_3        
		} else
	//*  11   23:goto            42
		{
			obj = ((Object) (getMessageImageView()));
	//   12   26:aload_0         
	//   13   27:invokevirtual   #80  <Method ImageView getMessageImageView()>
	//   14   30:astore_2        
			relativelayout = (RelativeLayout)findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_image_view_parent);
	//   15   31:aload_0         
	//   16   32:getstatic       #83  <Field int com.appboy.ui.R$id.com_appboy_stubbed_inappmessage_image_view_parent>
	//   17   35:invokevirtual   #57  <Method View findViewById(int)>
	//   18   38:checkcast       #4   <Class RelativeLayout>
	//   19   41:astore_3        
		}
		if(obj != null)
	//*  20   42:aload_2         
	//*  21   43:ifnull          72
			if(!flag)
	//*  22   46:iload_1         
	//*  23   47:ifne            65
			{
				ViewUtils.removeViewFromParent(((View) (obj)));
	//   24   50:aload_2         
	//   25   51:invokestatic    #89  <Method void ViewUtils.removeViewFromParent(View)>
				if(relativelayout != null)
	//*  26   54:aload_3         
	//*  27   55:ifnull          72
					ViewUtils.removeViewFromParent(((View) (relativelayout)));
	//   28   58:aload_3         
	//   29   59:invokestatic    #89  <Method void ViewUtils.removeViewFromParent(View)>
			} else
	//*  30   62:goto            72
			{
				ViewUtils.removeViewFromParent(((View) (getMessageIconView())));
	//   31   65:aload_0         
	//   32   66:invokevirtual   #91  <Method TextView getMessageIconView()>
	//   33   69:invokestatic    #89  <Method void ViewUtils.removeViewFromParent(View)>
			}
		if(getMessageIconView() != null && StringUtils.isNullOrBlank((String)getMessageIconView().getText()))
	//*  34   72:aload_0         
	//*  35   73:invokevirtual   #91  <Method TextView getMessageIconView()>
	//*  36   76:ifnull          102
	//*  37   79:aload_0         
	//*  38   80:invokevirtual   #91  <Method TextView getMessageIconView()>
	//*  39   83:invokevirtual   #97  <Method CharSequence TextView.getText()>
	//*  40   86:checkcast       #99  <Class String>
	//*  41   89:invokestatic    #39  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  42   92:ifeq            102
			ViewUtils.removeViewFromParent(((View) (getMessageIconView())));
	//   43   95:aload_0         
	//   44   96:invokevirtual   #91  <Method TextView getMessageIconView()>
	//   45   99:invokestatic    #89  <Method void ViewUtils.removeViewFromParent(View)>
	//   46  102:return          
	}

	public void setMessage(String s)
	{
		getMessageTextView().setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method TextView getMessageTextView()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #107 <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	public void setMessageBackgroundColor(int i)
	{
		InAppMessageViewUtils.setViewBackgroundColor((View)getMessageBackgroundObject(), i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method Object getMessageBackgroundObject()>
	//    2    4:checkcast       #113 <Class View>
	//    3    7:iload_1         
	//    4    8:invokestatic    #119 <Method void InAppMessageViewUtils.setViewBackgroundColor(View, int)>
	//    5   11:return          
	}

	public void setMessageIcon(String s, int i, int j)
	{
		if(getMessageIconView() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #91  <Method TextView getMessageIconView()>
	//*   2    4:ifnull          21
			InAppMessageViewUtils.setIcon(getContext(), s, i, j, getMessageIconView());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #125 <Method Context getContext()>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #91  <Method TextView getMessageIconView()>
	//   10   18:invokestatic    #129 <Method void InAppMessageViewUtils.setIcon(Context, String, int, int, TextView)>
	//   11   21:return          
	}

	public void setMessageImageView(Bitmap bitmap)
	{
		InAppMessageViewUtils.setImage(bitmap, getMessageImageView());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #80  <Method ImageView getMessageImageView()>
	//    3    5:invokestatic    #135 <Method void InAppMessageViewUtils.setImage(Bitmap, ImageView)>
	//    4    8:return          
	}

	public void setMessageSimpleDrawee(IInAppMessage iinappmessage)
	{
		FrescoLibraryUtils.setDraweeControllerHelper(((com.facebook.drawee.view.SimpleDraweeView) ((AppboyInAppMessageSimpleDraweeView)getMessageSimpleDraweeView())), getAppropriateImageUrl(iinappmessage), 0.0F, false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method View getMessageSimpleDraweeView()>
	//    2    4:checkcast       #139 <Class AppboyInAppMessageSimpleDraweeView>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #141 <Method String getAppropriateImageUrl(IInAppMessage)>
	//    6   12:fconst_0        
	//    7   13:iconst_0        
	//    8   14:invokestatic    #145 <Method void FrescoLibraryUtils.setDraweeControllerHelper(com.facebook.drawee.view.SimpleDraweeView, String, float, boolean)>
	//    9   17:return          
	}

	public void setMessageTextAlign(TextAlign textalign)
	{
		InAppMessageViewUtils.setTextAlignment(getMessageTextView(), textalign);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method TextView getMessageTextView()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #151 <Method void InAppMessageViewUtils.setTextAlignment(TextView, TextAlign)>
	//    4    8:return          
	}

	public void setMessageTextColor(int i)
	{
		InAppMessageViewUtils.setTextViewColor(getMessageTextView(), i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method TextView getMessageTextView()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #156 <Method void InAppMessageViewUtils.setTextViewColor(TextView, int)>
	//    4    8:return          
	}

	final boolean mCanUseFresco;
}
