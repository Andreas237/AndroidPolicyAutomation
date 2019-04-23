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
import com.appboy.enums.inappmessage.Orientation;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageFull;
import com.appboy.support.StringUtils;
import com.appboy.ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageFullView;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.ViewUtils;

public class AppboyFullViewFactory
	implements IInAppMessageViewFactory
{

	public AppboyFullViewFactory()
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
	//    3    3:invokevirtual   #16  <Method AppboyInAppMessageFullView createInAppMessageView(Activity, IInAppMessage)>
	//    4    6:areturn         
	}

	public AppboyInAppMessageFullView createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		android.content.Context context = activity.getApplicationContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method android.content.Context Activity.getApplicationContext()>
	//    2    4:astore          4
		InAppMessageFull inappmessagefull = (InAppMessageFull)iinappmessage;
	//    3    6:aload_2         
	//    4    7:checkcast       #24  <Class InAppMessageFull>
	//    5   10:astore          5
		boolean flag = inappmessagefull.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC)));
	//    6   12:aload           5
	//    7   14:invokevirtual   #28  <Method ImageStyle InAppMessageFull.getImageStyle()>
	//    8   17:getstatic       #34  <Field ImageStyle ImageStyle.GRAPHIC>
	//    9   20:invokevirtual   #38  <Method boolean ImageStyle.equals(Object)>
	//   10   23:istore_3        
		AppboyInAppMessageFullView appboyinappmessagefullview = getAppropriateFullView(activity, flag);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iload_3         
	//   14   27:invokevirtual   #42  <Method AppboyInAppMessageFullView getAppropriateFullView(Activity, boolean)>
	//   15   30:astore          6
		appboyinappmessagefullview.inflateStubViews(activity, ((com.appboy.models.IInAppMessageImmersive) (inappmessagefull)));
	//   16   32:aload           6
	//   17   34:aload_1         
	//   18   35:aload           5
	//   19   37:invokevirtual   #48  <Method void AppboyInAppMessageFullView.inflateStubViews(Activity, com.appboy.models.IInAppMessageImmersive)>
		if(FrescoLibraryUtils.canUseFresco(context))
	//*  20   40:aload           4
	//*  21   42:invokestatic    #54  <Method boolean FrescoLibraryUtils.canUseFresco(android.content.Context)>
	//*  22   45:ifeq            58
		{
			appboyinappmessagefullview.setMessageSimpleDrawee(((IInAppMessage) (inappmessagefull)));
	//   23   48:aload           6
	//   24   50:aload           5
	//   25   52:invokevirtual   #58  <Method void AppboyInAppMessageFullView.setMessageSimpleDrawee(IInAppMessage)>
		} else
	//*  26   55:goto            96
		{
			iinappmessage = ((IInAppMessage) (appboyinappmessagefullview.getAppropriateImageUrl(iinappmessage)));
	//   27   58:aload           6
	//   28   60:aload_2         
	//   29   61:invokevirtual   #62  <Method String AppboyInAppMessageFullView.getAppropriateImageUrl(IInAppMessage)>
	//   30   64:astore_2        
			if(!StringUtils.isNullOrEmpty(((String) (iinappmessage))))
	//*  31   65:aload_2         
	//*  32   66:invokestatic    #68  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  33   69:ifne            96
				Appboy.getInstance(context).getAppboyImageLoader().renderUrlIntoView(context, ((String) (iinappmessage)), appboyinappmessagefullview.getMessageImageView(), AppboyViewBounds.NO_BOUNDS);
	//   34   72:aload           4
	//   35   74:invokestatic    #74  <Method Appboy Appboy.getInstance(android.content.Context)>
	//   36   77:invokevirtual   #78  <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   37   80:aload           4
	//   38   82:aload_2         
	//   39   83:aload           6
	//   40   85:invokevirtual   #82  <Method android.widget.ImageView AppboyInAppMessageFullView.getMessageImageView()>
	//   41   88:getstatic       #88  <Field AppboyViewBounds AppboyViewBounds.NO_BOUNDS>
	//   42   91:invokeinterface #94  <Method void IAppboyImageLoader.renderUrlIntoView(android.content.Context, String, android.widget.ImageView, AppboyViewBounds)>
		}
		appboyinappmessagefullview.getFrameView().setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   43   96:aload           6
	//   44   98:invokevirtual   #98  <Method View AppboyInAppMessageFullView.getFrameView()>
	//   45  101:aconst_null     
	//   46  102:invokevirtual   #104 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		appboyinappmessagefullview.setMessageBackgroundColor(inappmessagefull.getBackgroundColor());
	//   47  105:aload           6
	//   48  107:aload           5
	//   49  109:invokevirtual   #108 <Method int InAppMessageFull.getBackgroundColor()>
	//   50  112:invokevirtual   #112 <Method void AppboyInAppMessageFullView.setMessageBackgroundColor(int)>
		appboyinappmessagefullview.setFrameColor(inappmessagefull.getFrameColor());
	//   51  115:aload           6
	//   52  117:aload           5
	//   53  119:invokevirtual   #116 <Method Integer InAppMessageFull.getFrameColor()>
	//   54  122:invokevirtual   #120 <Method void AppboyInAppMessageFullView.setFrameColor(Integer)>
		appboyinappmessagefullview.setMessageButtons(inappmessagefull.getMessageButtons());
	//   55  125:aload           6
	//   56  127:aload           5
	//   57  129:invokevirtual   #124 <Method java.util.List InAppMessageFull.getMessageButtons()>
	//   58  132:invokevirtual   #128 <Method void AppboyInAppMessageFullView.setMessageButtons(java.util.List)>
		appboyinappmessagefullview.setMessageCloseButtonColor(inappmessagefull.getCloseButtonColor());
	//   59  135:aload           6
	//   60  137:aload           5
	//   61  139:invokevirtual   #131 <Method int InAppMessageFull.getCloseButtonColor()>
	//   62  142:invokevirtual   #134 <Method void AppboyInAppMessageFullView.setMessageCloseButtonColor(int)>
		if(!flag)
	//*  63  145:iload_3         
	//*  64  146:ifne            219
		{
			appboyinappmessagefullview.setMessage(inappmessagefull.getMessage());
	//   65  149:aload           6
	//   66  151:aload           5
	//   67  153:invokevirtual   #138 <Method String InAppMessageFull.getMessage()>
	//   68  156:invokevirtual   #142 <Method void AppboyInAppMessageFullView.setMessage(String)>
			appboyinappmessagefullview.setMessageTextColor(inappmessagefull.getMessageTextColor());
	//   69  159:aload           6
	//   70  161:aload           5
	//   71  163:invokevirtual   #145 <Method int InAppMessageFull.getMessageTextColor()>
	//   72  166:invokevirtual   #148 <Method void AppboyInAppMessageFullView.setMessageTextColor(int)>
			appboyinappmessagefullview.setMessageHeaderText(inappmessagefull.getHeader());
	//   73  169:aload           6
	//   74  171:aload           5
	//   75  173:invokevirtual   #151 <Method String InAppMessageFull.getHeader()>
	//   76  176:invokevirtual   #154 <Method void AppboyInAppMessageFullView.setMessageHeaderText(String)>
			appboyinappmessagefullview.setMessageHeaderTextColor(inappmessagefull.getHeaderTextColor());
	//   77  179:aload           6
	//   78  181:aload           5
	//   79  183:invokevirtual   #157 <Method int InAppMessageFull.getHeaderTextColor()>
	//   80  186:invokevirtual   #160 <Method void AppboyInAppMessageFullView.setMessageHeaderTextColor(int)>
			appboyinappmessagefullview.setMessageHeaderTextAlignment(inappmessagefull.getHeaderTextAlign());
	//   81  189:aload           6
	//   82  191:aload           5
	//   83  193:invokevirtual   #164 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageFull.getHeaderTextAlign()>
	//   84  196:invokevirtual   #168 <Method void AppboyInAppMessageFullView.setMessageHeaderTextAlignment(com.appboy.enums.inappmessage.TextAlign)>
			appboyinappmessagefullview.setMessageTextAlign(inappmessagefull.getMessageTextAlign());
	//   85  199:aload           6
	//   86  201:aload           5
	//   87  203:invokevirtual   #171 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageFull.getMessageTextAlign()>
	//   88  206:invokevirtual   #174 <Method void AppboyInAppMessageFullView.setMessageTextAlign(com.appboy.enums.inappmessage.TextAlign)>
			appboyinappmessagefullview.resetMessageMargins(inappmessagefull.getImageDownloadSuccessful());
	//   89  209:aload           6
	//   90  211:aload           5
	//   91  213:invokevirtual   #178 <Method boolean InAppMessageFull.getImageDownloadSuccessful()>
	//   92  216:invokevirtual   #182 <Method void AppboyInAppMessageFullView.resetMessageMargins(boolean)>
		}
		resetLayoutParamsIfAppropriate(activity, ((IInAppMessage) (inappmessagefull)), appboyinappmessagefullview);
	//   93  219:aload_0         
	//   94  220:aload_1         
	//   95  221:aload           5
	//   96  223:aload           6
	//   97  225:invokevirtual   #186 <Method boolean resetLayoutParamsIfAppropriate(Activity, IInAppMessage, AppboyInAppMessageFullView)>
	//   98  228:pop             
		return appboyinappmessagefullview;
	//   99  229:aload           6
	//  100  231:areturn         
	}

	AppboyInAppMessageFullView getAppropriateFullView(Activity activity, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            19
			return (AppboyInAppMessageFullView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_full_graphic, ((android.view.ViewGroup) (null)));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #193 <Method LayoutInflater Activity.getLayoutInflater()>
	//    4    8:getstatic       #199 <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_full_graphic>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #205 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    7   15:checkcast       #44  <Class AppboyInAppMessageFullView>
	//    8   18:areturn         
		else
			return (AppboyInAppMessageFullView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_full, ((android.view.ViewGroup) (null)));
	//    9   19:aload_1         
	//   10   20:invokevirtual   #193 <Method LayoutInflater Activity.getLayoutInflater()>
	//   11   23:getstatic       #208 <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_full>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #205 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   14   30:checkcast       #44  <Class AppboyInAppMessageFullView>
	//   15   33:areturn         
	}

	boolean resetLayoutParamsIfAppropriate(Activity activity, IInAppMessage iinappmessage, AppboyInAppMessageFullView appboyinappmessagefullview)
	{
		if(!ViewUtils.isRunningOnTablet(activity))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #215 <Method boolean ViewUtils.isRunningOnTablet(Activity)>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(iinappmessage.getOrientation() != null)
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #221 <Method Orientation IInAppMessage.getOrientation()>
	//*   7   15:ifnull          112
		{
			if(iinappmessage.getOrientation() == Orientation.ANY)
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #221 <Method Orientation IInAppMessage.getOrientation()>
	//*  10   24:getstatic       #227 <Field Orientation Orientation.ANY>
	//*  11   27:if_acmpne       32
				return false;
	//   12   30:iconst_0        
	//   13   31:ireturn         
			int i = appboyinappmessagefullview.getLongEdge();
	//   14   32:aload_3         
	//   15   33:invokevirtual   #230 <Method int AppboyInAppMessageFullView.getLongEdge()>
	//   16   36:istore          4
			int j = appboyinappmessagefullview.getShortEdge();
	//   17   38:aload_3         
	//   18   39:invokevirtual   #233 <Method int AppboyInAppMessageFullView.getShortEdge()>
	//   19   42:istore          5
			if(i > 0 && j > 0)
	//*  20   44:iload           4
	//*  21   46:ifle            110
	//*  22   49:iload           5
	//*  23   51:ifle            110
			{
				if(iinappmessage.getOrientation() == Orientation.LANDSCAPE)
	//*  24   54:aload_2         
	//*  25   55:invokeinterface #221 <Method Orientation IInAppMessage.getOrientation()>
	//*  26   60:getstatic       #236 <Field Orientation Orientation.LANDSCAPE>
	//*  27   63:if_acmpne       81
					activity = ((Activity) (new android.widget.RelativeLayout.LayoutParams(i, j)));
	//   28   66:new             #238 <Class android.widget.RelativeLayout$LayoutParams>
	//   29   69:dup             
	//   30   70:iload           4
	//   31   72:iload           5
	//   32   74:invokespecial   #241 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   33   77:astore_1        
				else
	//*  34   78:goto            93
					activity = ((Activity) (new android.widget.RelativeLayout.LayoutParams(j, i)));
	//   35   81:new             #238 <Class android.widget.RelativeLayout$LayoutParams>
	//   36   84:dup             
	//   37   85:iload           5
	//   38   87:iload           4
	//   39   89:invokespecial   #241 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   40   92:astore_1        
				((android.widget.RelativeLayout.LayoutParams) (activity)).addRule(13, -1);
	//   41   93:aload_1         
	//   42   94:bipush          13
	//   43   96:iconst_m1       
	//   44   97:invokevirtual   #244 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
				appboyinappmessagefullview.getMessageBackgroundObject().setLayoutParams(((android.view.ViewGroup.LayoutParams) (activity)));
	//   45  100:aload_3         
	//   46  101:invokevirtual   #247 <Method View AppboyInAppMessageFullView.getMessageBackgroundObject()>
	//   47  104:aload_1         
	//   48  105:invokevirtual   #251 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				return true;
	//   49  108:iconst_1        
	//   50  109:ireturn         
			} else
			{
				return false;
	//   51  110:iconst_0        
	//   52  111:ireturn         
			}
		} else
		{
			return false;
	//   53  112:iconst_0        
	//   54  113:ireturn         
		}
	}
}
