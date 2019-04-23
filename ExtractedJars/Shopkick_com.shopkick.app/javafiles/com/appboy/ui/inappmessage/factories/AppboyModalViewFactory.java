// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.factories;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.Appboy;
import com.appboy.IAppboyImageLoader;
import com.appboy.enums.AppboyViewBounds;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageModal;
import com.appboy.support.StringUtils;
import com.appboy.ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageModalView;
import com.appboy.ui.support.FrescoLibraryUtils;

public class AppboyModalViewFactory
	implements IInAppMessageViewFactory
{

	public AppboyModalViewFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public volatile View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		return ((View) (createInAppMessageView(activity, iinappmessage)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #16  <Method AppboyInAppMessageModalView createInAppMessageView(Activity, IInAppMessage)>
	//    4    6:areturn         
	}

	public AppboyInAppMessageModalView createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		android.content.Context context = activity.getApplicationContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method android.content.Context Activity.getApplicationContext()>
	//    2    4:astore          4
		InAppMessageModal inappmessagemodal = (InAppMessageModal)iinappmessage;
	//    3    6:aload_2         
	//    4    7:checkcast       #24  <Class InAppMessageModal>
	//    5   10:astore          5
		boolean flag = inappmessagemodal.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC)));
	//    6   12:aload           5
	//    7   14:invokevirtual   #28  <Method ImageStyle InAppMessageModal.getImageStyle()>
	//    8   17:getstatic       #34  <Field ImageStyle ImageStyle.GRAPHIC>
	//    9   20:invokevirtual   #38  <Method boolean ImageStyle.equals(Object)>
	//   10   23:istore_3        
		AppboyInAppMessageModalView appboyinappmessagemodalview = getAppropriateModalView(activity, flag);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iload_3         
	//   14   27:invokevirtual   #42  <Method AppboyInAppMessageModalView getAppropriateModalView(Activity, boolean)>
	//   15   30:astore          6
		appboyinappmessagemodalview.inflateStubViews(activity, ((com.appboy.models.IInAppMessageImmersive) (inappmessagemodal)));
	//   16   32:aload           6
	//   17   34:aload_1         
	//   18   35:aload           5
	//   19   37:invokevirtual   #48  <Method void AppboyInAppMessageModalView.inflateStubViews(Activity, com.appboy.models.IInAppMessageImmersive)>
		if(FrescoLibraryUtils.canUseFresco(context))
	//*  20   40:aload           4
	//*  21   42:invokestatic    #54  <Method boolean FrescoLibraryUtils.canUseFresco(android.content.Context)>
	//*  22   45:ifeq            59
		{
			appboyinappmessagemodalview.setMessageSimpleDrawee(((com.appboy.models.IInAppMessageImmersive) (inappmessagemodal)), activity);
	//   23   48:aload           6
	//   24   50:aload           5
	//   25   52:aload_1         
	//   26   53:invokevirtual   #58  <Method void AppboyInAppMessageModalView.setMessageSimpleDrawee(com.appboy.models.IInAppMessageImmersive, Activity)>
		} else
	//*  27   56:goto            97
		{
			activity = ((Activity) (appboyinappmessagemodalview.getAppropriateImageUrl(iinappmessage)));
	//   28   59:aload           6
	//   29   61:aload_2         
	//   30   62:invokevirtual   #62  <Method String AppboyInAppMessageModalView.getAppropriateImageUrl(IInAppMessage)>
	//   31   65:astore_1        
			if(!StringUtils.isNullOrEmpty(((String) (activity))))
	//*  32   66:aload_1         
	//*  33   67:invokestatic    #68  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  34   70:ifne            97
				Appboy.getInstance(context).getAppboyImageLoader().renderUrlIntoView(context, ((String) (activity)), appboyinappmessagemodalview.getMessageImageView(), AppboyViewBounds.IN_APP_MESSAGE_MODAL);
	//   35   73:aload           4
	//   36   75:invokestatic    #74  <Method Appboy Appboy.getInstance(android.content.Context)>
	//   37   78:invokevirtual   #78  <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   38   81:aload           4
	//   39   83:aload_1         
	//   40   84:aload           6
	//   41   86:invokevirtual   #82  <Method android.widget.ImageView AppboyInAppMessageModalView.getMessageImageView()>
	//   42   89:getstatic       #88  <Field AppboyViewBounds AppboyViewBounds.IN_APP_MESSAGE_MODAL>
	//   43   92:invokeinterface #94  <Method void IAppboyImageLoader.renderUrlIntoView(android.content.Context, String, android.widget.ImageView, AppboyViewBounds)>
		}
		appboyinappmessagemodalview.getFrameView().setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   44   97:aload           6
	//   45   99:invokevirtual   #98  <Method View AppboyInAppMessageModalView.getFrameView()>
	//   46  102:aconst_null     
	//   47  103:invokevirtual   #104 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		appboyinappmessagemodalview.setMessageBackgroundColor(iinappmessage.getBackgroundColor());
	//   48  106:aload           6
	//   49  108:aload_2         
	//   50  109:invokeinterface #110 <Method int IInAppMessage.getBackgroundColor()>
	//   51  114:invokevirtual   #114 <Method void AppboyInAppMessageModalView.setMessageBackgroundColor(int)>
		appboyinappmessagemodalview.setFrameColor(inappmessagemodal.getFrameColor());
	//   52  117:aload           6
	//   53  119:aload           5
	//   54  121:invokevirtual   #118 <Method Integer InAppMessageModal.getFrameColor()>
	//   55  124:invokevirtual   #122 <Method void AppboyInAppMessageModalView.setFrameColor(Integer)>
		appboyinappmessagemodalview.setMessageButtons(inappmessagemodal.getMessageButtons());
	//   56  127:aload           6
	//   57  129:aload           5
	//   58  131:invokevirtual   #126 <Method java.util.List InAppMessageModal.getMessageButtons()>
	//   59  134:invokevirtual   #130 <Method void AppboyInAppMessageModalView.setMessageButtons(java.util.List)>
		appboyinappmessagemodalview.setMessageCloseButtonColor(inappmessagemodal.getCloseButtonColor());
	//   60  137:aload           6
	//   61  139:aload           5
	//   62  141:invokevirtual   #133 <Method int InAppMessageModal.getCloseButtonColor()>
	//   63  144:invokevirtual   #136 <Method void AppboyInAppMessageModalView.setMessageCloseButtonColor(int)>
		if(!flag)
	//*  64  147:iload_3         
	//*  65  148:ifne            247
		{
			appboyinappmessagemodalview.setMessage(iinappmessage.getMessage());
	//   66  151:aload           6
	//   67  153:aload_2         
	//   68  154:invokeinterface #140 <Method String IInAppMessage.getMessage()>
	//   69  159:invokevirtual   #144 <Method void AppboyInAppMessageModalView.setMessage(String)>
			appboyinappmessagemodalview.setMessageTextColor(iinappmessage.getMessageTextColor());
	//   70  162:aload           6
	//   71  164:aload_2         
	//   72  165:invokeinterface #147 <Method int IInAppMessage.getMessageTextColor()>
	//   73  170:invokevirtual   #150 <Method void AppboyInAppMessageModalView.setMessageTextColor(int)>
			appboyinappmessagemodalview.setMessageHeaderText(inappmessagemodal.getHeader());
	//   74  173:aload           6
	//   75  175:aload           5
	//   76  177:invokevirtual   #153 <Method String InAppMessageModal.getHeader()>
	//   77  180:invokevirtual   #156 <Method void AppboyInAppMessageModalView.setMessageHeaderText(String)>
			appboyinappmessagemodalview.setMessageHeaderTextColor(inappmessagemodal.getHeaderTextColor());
	//   78  183:aload           6
	//   79  185:aload           5
	//   80  187:invokevirtual   #159 <Method int InAppMessageModal.getHeaderTextColor()>
	//   81  190:invokevirtual   #162 <Method void AppboyInAppMessageModalView.setMessageHeaderTextColor(int)>
			appboyinappmessagemodalview.setMessageIcon(iinappmessage.getIcon(), iinappmessage.getIconColor(), iinappmessage.getIconBackgroundColor());
	//   82  193:aload           6
	//   83  195:aload_2         
	//   84  196:invokeinterface #165 <Method String IInAppMessage.getIcon()>
	//   85  201:aload_2         
	//   86  202:invokeinterface #168 <Method int IInAppMessage.getIconColor()>
	//   87  207:aload_2         
	//   88  208:invokeinterface #171 <Method int IInAppMessage.getIconBackgroundColor()>
	//   89  213:invokevirtual   #175 <Method void AppboyInAppMessageModalView.setMessageIcon(String, int, int)>
			appboyinappmessagemodalview.setMessageHeaderTextAlignment(inappmessagemodal.getHeaderTextAlign());
	//   90  216:aload           6
	//   91  218:aload           5
	//   92  220:invokevirtual   #179 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageModal.getHeaderTextAlign()>
	//   93  223:invokevirtual   #183 <Method void AppboyInAppMessageModalView.setMessageHeaderTextAlignment(com.appboy.enums.inappmessage.TextAlign)>
			appboyinappmessagemodalview.setMessageTextAlign(inappmessagemodal.getMessageTextAlign());
	//   94  226:aload           6
	//   95  228:aload           5
	//   96  230:invokevirtual   #186 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageModal.getMessageTextAlign()>
	//   97  233:invokevirtual   #189 <Method void AppboyInAppMessageModalView.setMessageTextAlign(com.appboy.enums.inappmessage.TextAlign)>
			appboyinappmessagemodalview.resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
	//   98  236:aload           6
	//   99  238:aload_2         
	//  100  239:invokeinterface #193 <Method boolean IInAppMessage.getImageDownloadSuccessful()>
	//  101  244:invokevirtual   #197 <Method void AppboyInAppMessageModalView.resetMessageMargins(boolean)>
		}
		return appboyinappmessagemodalview;
	//  102  247:aload           6
	//  103  249:areturn         
	}

	AppboyInAppMessageModalView getAppropriateModalView(Activity activity, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            19
			return (AppboyInAppMessageModalView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_modal_graphic, ((android.view.ViewGroup) (null)));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #204 <Method LayoutInflater Activity.getLayoutInflater()>
	//    4    8:getstatic       #210 <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_modal_graphic>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #216 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    7   15:checkcast       #44  <Class AppboyInAppMessageModalView>
	//    8   18:areturn         
		else
			return (AppboyInAppMessageModalView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_modal, ((android.view.ViewGroup) (null)));
	//    9   19:aload_1         
	//   10   20:invokevirtual   #204 <Method LayoutInflater Activity.getLayoutInflater()>
	//   11   23:getstatic       #219 <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_modal>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #216 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   14   30:checkcast       #44  <Class AppboyInAppMessageModalView>
	//   15   33:areturn         
	}
}
