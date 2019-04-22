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
import com.appboy.ui.inappmessage.IInAppMessageView;
import com.appboy.ui.support.ViewUtils;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

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
	//    3    3:invokespecial   #11  <Method void RelativeLayout(Context, AttributeSet)>
		setLayerType(1, ((android.graphics.Paint) (null)));
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #15  <Method void setLayerType(int, android.graphics.Paint)>
	//    8   12:return          
	}

	public String getAppropriateImageUrl(IInAppMessage iinappmessage)
	{
		if(!StringUtils.isNullOrBlank(iinappmessage.getLocalImageUrl()))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #24  <Method String IInAppMessage.getLocalImageUrl()>
	//*   2    6:invokestatic    #30  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    9:ifne            19
			return iinappmessage.getLocalImageUrl();
	//    4   12:aload_1         
	//    5   13:invokeinterface #24  <Method String IInAppMessage.getLocalImageUrl()>
	//    6   18:areturn         
		else
			return iinappmessage.getRemoteImageUrl();
	//    7   19:aload_1         
	//    8   20:invokeinterface #33  <Method String IInAppMessage.getRemoteImageUrl()>
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

	public abstract TextView getMessageTextView();

	View getProperViewFromInflatedStub(int i)
	{
		ViewStub viewstub = (ViewStub)findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #47  <Method View findViewById(int)>
	//    3    5:checkcast       #49  <Class ViewStub>
	//    4    8:astore_2        
		if(!(viewstub instanceof ViewStub))
	//*   5    9:aload_2         
	//*   6   10:instanceof      #49  <Class ViewStub>
	//*   7   13:ifne            24
			viewstub.inflate();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #52  <Method View ViewStub.inflate()>
	//   10   20:pop             
		else
	//*  11   21:goto            32
			ViewInstrumentation.inflate((ViewStub)viewstub);
	//   12   24:aload_2         
	//   13   25:checkcast       #49  <Class ViewStub>
	//   14   28:invokestatic    #57  <Method View ViewInstrumentation.inflate(ViewStub)>
	//   15   31:pop             
		return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_image_view);
	//   16   32:aload_0         
	//   17   33:getstatic       #63  <Field int com.appboy.ui.R$id.com_appboy_stubbed_inappmessage_image_view>
	//   18   36:invokevirtual   #47  <Method View findViewById(int)>
	//   19   39:areturn         
	}

	public void resetMessageMargins(boolean flag)
	{
		RelativeLayout relativelayout = (RelativeLayout)findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_image_view_parent);
	//    0    0:aload_0         
	//    1    1:getstatic       #68  <Field int com.appboy.ui.R$id.com_appboy_stubbed_inappmessage_image_view_parent>
	//    2    4:invokevirtual   #47  <Method View findViewById(int)>
	//    3    7:checkcast       #4   <Class RelativeLayout>
	//    4   10:astore_2        
		ImageView imageview = getMessageImageView();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #70  <Method ImageView getMessageImageView()>
	//    7   15:astore_3        
		if(imageview != null)
	//*   8   16:aload_3         
	//*   9   17:ifnull          46
			if(!flag)
	//*  10   20:iload_1         
	//*  11   21:ifne            39
			{
				ViewUtils.removeViewFromParent(((View) (imageview)));
	//   12   24:aload_3         
	//   13   25:invokestatic    #76  <Method void ViewUtils.removeViewFromParent(View)>
				if(relativelayout != null)
	//*  14   28:aload_2         
	//*  15   29:ifnull          46
					ViewUtils.removeViewFromParent(((View) (relativelayout)));
	//   16   32:aload_2         
	//   17   33:invokestatic    #76  <Method void ViewUtils.removeViewFromParent(View)>
			} else
	//*  18   36:goto            46
			{
				ViewUtils.removeViewFromParent(((View) (getMessageIconView())));
	//   19   39:aload_0         
	//   20   40:invokevirtual   #78  <Method TextView getMessageIconView()>
	//   21   43:invokestatic    #76  <Method void ViewUtils.removeViewFromParent(View)>
			}
		if(getMessageIconView() != null && StringUtils.isNullOrBlank((String)getMessageIconView().getText()))
	//*  22   46:aload_0         
	//*  23   47:invokevirtual   #78  <Method TextView getMessageIconView()>
	//*  24   50:ifnull          76
	//*  25   53:aload_0         
	//*  26   54:invokevirtual   #78  <Method TextView getMessageIconView()>
	//*  27   57:invokevirtual   #84  <Method CharSequence TextView.getText()>
	//*  28   60:checkcast       #86  <Class String>
	//*  29   63:invokestatic    #30  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  30   66:ifeq            76
			ViewUtils.removeViewFromParent(((View) (getMessageIconView())));
	//   31   69:aload_0         
	//   32   70:invokevirtual   #78  <Method TextView getMessageIconView()>
	//   33   73:invokestatic    #76  <Method void ViewUtils.removeViewFromParent(View)>
	//   34   76:return          
	}

	public void setMessage(String s)
	{
		getMessageTextView().setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method TextView getMessageTextView()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	public void setMessageBackgroundColor(int i)
	{
		InAppMessageViewUtils.setViewBackgroundColor((View)getMessageBackgroundObject(), i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method Object getMessageBackgroundObject()>
	//    2    4:checkcast       #100 <Class View>
	//    3    7:iload_1         
	//    4    8:invokestatic    #106 <Method void InAppMessageViewUtils.setViewBackgroundColor(View, int)>
	//    5   11:return          
	}

	public void setMessageIcon(String s, int i, int j)
	{
		if(getMessageIconView() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method TextView getMessageIconView()>
	//*   2    4:ifnull          21
			InAppMessageViewUtils.setIcon(getContext(), s, i, j, getMessageIconView());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #112 <Method Context getContext()>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #78  <Method TextView getMessageIconView()>
	//   10   18:invokestatic    #116 <Method void InAppMessageViewUtils.setIcon(Context, String, int, int, TextView)>
	//   11   21:return          
	}

	public void setMessageImageView(Bitmap bitmap)
	{
		InAppMessageViewUtils.setImage(bitmap, getMessageImageView());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #70  <Method ImageView getMessageImageView()>
	//    3    5:invokestatic    #122 <Method void InAppMessageViewUtils.setImage(Bitmap, ImageView)>
	//    4    8:return          
	}

	public void setMessageTextAlign(TextAlign textalign)
	{
		InAppMessageViewUtils.setTextAlignment(getMessageTextView(), textalign);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method TextView getMessageTextView()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #128 <Method void InAppMessageViewUtils.setTextAlignment(TextView, TextAlign)>
	//    4    8:return          
	}

	public void setMessageTextColor(int i)
	{
		InAppMessageViewUtils.setTextViewColor(getMessageTextView(), i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method TextView getMessageTextView()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #133 <Method void InAppMessageViewUtils.setTextViewColor(TextView, int)>
	//    4    8:return          
	}
}
