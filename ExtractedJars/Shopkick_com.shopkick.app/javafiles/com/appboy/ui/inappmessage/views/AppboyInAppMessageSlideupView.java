// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.models.IInAppMessage;
import com.appboy.ui.inappmessage.AppboyInAppMessageImageView;
import com.appboy.ui.inappmessage.AppboyInAppMessageSimpleDraweeView;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			AppboyInAppMessageBaseView, InAppMessageViewUtils

public class AppboyInAppMessageSlideupView extends AppboyInAppMessageBaseView
{

	public AppboyInAppMessageSlideupView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void AppboyInAppMessageBaseView(Context, AttributeSet)>
	//    4    6:return          
	}

	public View getMessageBackgroundObject()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_slideup);
	//    0    0:aload_0         
	//    1    1:getstatic       #23  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_slideup>
	//    2    4:invokevirtual   #27  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public volatile Object getMessageBackgroundObject()
	{
		return ((Object) (getMessageBackgroundObject()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method View getMessageBackgroundObject()>
	//    2    4:areturn         
	}

	public View getMessageChevronView()
	{
		return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_chevron);
	//    0    0:aload_0         
	//    1    1:getstatic       #34  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_slideup_chevron>
	//    2    4:invokevirtual   #27  <Method View findViewById(int)>
	//    3    7:areturn         
	}

	public TextView getMessageIconView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_icon);
	//    0    0:aload_0         
	//    1    1:getstatic       #39  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_slideup_icon>
	//    2    4:invokevirtual   #27  <Method View findViewById(int)>
	//    3    7:checkcast       #41  <Class TextView>
	//    4   10:areturn         
	}

	public ImageView getMessageImageView()
	{
		return ((ImageView) (mAppboyInAppMessageImageView));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
	//    2    4:areturn         
	}

	public View getMessageSimpleDraweeView()
	{
		return mSimpleDraweeView;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field View mSimpleDraweeView>
	//    2    4:areturn         
	}

	public TextView getMessageTextView()
	{
		return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_message);
	//    0    0:aload_0         
	//    1    1:getstatic       #52  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_slideup_message>
	//    2    4:invokevirtual   #27  <Method View findViewById(int)>
	//    3    7:checkcast       #41  <Class TextView>
	//    4   10:areturn         
	}

	public void inflateStubViews(IInAppMessage iinappmessage)
	{
		if(mCanUseFresco)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field boolean mCanUseFresco>
	//*   2    4:ifeq            35
		{
			mSimpleDraweeView = getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_drawee_stub);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getstatic       #61  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_slideup_drawee_stub>
	//    6   12:invokevirtual   #64  <Method View getProperViewFromInflatedStub(int)>
	//    7   15:putfield        #48  <Field View mSimpleDraweeView>
			((AppboyInAppMessageSimpleDraweeView)mSimpleDraweeView).setInAppMessageImageCropType(iinappmessage.getCropType());
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field View mSimpleDraweeView>
	//   10   22:checkcast       #66  <Class AppboyInAppMessageSimpleDraweeView>
	//   11   25:aload_1         
	//   12   26:invokeinterface #72  <Method com.appboy.enums.inappmessage.CropType IInAppMessage.getCropType()>
	//   13   31:invokevirtual   #76  <Method void AppboyInAppMessageSimpleDraweeView.setInAppMessageImageCropType(com.appboy.enums.inappmessage.CropType)>
			return;
	//   14   34:return          
		} else
		{
			mAppboyInAppMessageImageView = (AppboyInAppMessageImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_imageview_stub);
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:getstatic       #79  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_slideup_imageview_stub>
	//   18   40:invokevirtual   #64  <Method View getProperViewFromInflatedStub(int)>
	//   19   43:checkcast       #81  <Class AppboyInAppMessageImageView>
	//   20   46:putfield        #45  <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
			mAppboyInAppMessageImageView.setInAppMessageImageCropType(iinappmessage.getCropType());
	//   21   49:aload_0         
	//   22   50:getfield        #45  <Field AppboyInAppMessageImageView mAppboyInAppMessageImageView>
	//   23   53:aload_1         
	//   24   54:invokeinterface #72  <Method com.appboy.enums.inappmessage.CropType IInAppMessage.getCropType()>
	//   25   59:invokevirtual   #82  <Method void AppboyInAppMessageImageView.setInAppMessageImageCropType(com.appboy.enums.inappmessage.CropType)>
			return;
	//   26   62:return          
		}
	}

	public void setMessageChevron(int i, ClickAction clickaction)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$appboy$enums$inappmessage$ClickAction[];

			static 
			{
				$SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[ClickAction.values().length];
			//    0    0:invokestatic    #18  <Method ClickAction[] ClickAction.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
				try
				{
					$SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NONE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
			//    5   12:getstatic       #24  <Field ClickAction ClickAction.NONE>
			//    6   15:invokevirtual   #28  <Method int ClickAction.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
			//    9   20:return          
				}
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   21:astore_0        
			//*  11   22:return          
			}
		}

		if(_cls1..SwitchMap.com.appboy.enums.inappmessage.ClickAction[clickaction.ordinal()] != 1)
	//*   0    0:getstatic       #88  <Field int[] AppboyInAppMessageSlideupView$1.$SwitchMap$com$appboy$enums$inappmessage$ClickAction>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #94  <Method int ClickAction.ordinal()>
	//*   3    7:iaload          
	//*   4    8:iconst_1        
	//*   5    9:icmpeq          34
		{
			InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageChevronView(), i, getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_chevron));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #96  <Method View getMessageChevronView()>
	//    8   16:iload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #100 <Method Context getContext()>
	//   11   21:invokevirtual   #106 <Method Resources Context.getResources()>
	//   12   24:getstatic       #111 <Field int com.appboy.ui.R$color.com_appboy_inappmessage_chevron>
	//   13   27:invokevirtual   #117 <Method int Resources.getColor(int)>
	//   14   30:invokestatic    #123 <Method void InAppMessageViewUtils.setViewBackgroundColorFilter(View, int, int)>
			return;
	//   15   33:return          
		} else
		{
			getMessageChevronView().setVisibility(8);
	//   16   34:aload_0         
	//   17   35:invokevirtual   #96  <Method View getMessageChevronView()>
	//   18   38:bipush          8
	//   19   40:invokevirtual   #129 <Method void View.setVisibility(int)>
			return;
	//   20   43:return          
		}
	}

	private AppboyInAppMessageImageView mAppboyInAppMessageImageView;
	private View mSimpleDraweeView;
}
