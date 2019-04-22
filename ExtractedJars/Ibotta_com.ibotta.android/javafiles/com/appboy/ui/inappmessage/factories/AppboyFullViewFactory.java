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
import com.appboy.ui.support.ViewUtils;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

public class AppboyFullViewFactory
	implements IInAppMessageViewFactory
{

	public AppboyFullViewFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public volatile View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		return ((View) (createInAppMessageView(activity, iinappmessage)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #17  <Method AppboyInAppMessageFullView createInAppMessageView(Activity, IInAppMessage)>
	//    4    6:areturn         
	}

	public AppboyInAppMessageFullView createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		android.content.Context context = activity.getApplicationContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method android.content.Context Activity.getApplicationContext()>
	//    2    4:astore          6
		InAppMessageFull inappmessagefull = (InAppMessageFull)iinappmessage;
	//    3    6:aload_2         
	//    4    7:checkcast       #25  <Class InAppMessageFull>
	//    5   10:astore          4
		boolean flag = inappmessagefull.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC)));
	//    6   12:aload           4
	//    7   14:invokevirtual   #29  <Method ImageStyle InAppMessageFull.getImageStyle()>
	//    8   17:getstatic       #35  <Field ImageStyle ImageStyle.GRAPHIC>
	//    9   20:invokevirtual   #39  <Method boolean ImageStyle.equals(Object)>
	//   10   23:istore_3        
		AppboyInAppMessageFullView appboyinappmessagefullview = getAppropriateFullView(activity, flag);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iload_3         
	//   14   27:invokevirtual   #43  <Method AppboyInAppMessageFullView getAppropriateFullView(Activity, boolean)>
	//   15   30:astore          5
		appboyinappmessagefullview.inflateStubViews(activity, ((com.appboy.models.IInAppMessageImmersive) (inappmessagefull)));
	//   16   32:aload           5
	//   17   34:aload_1         
	//   18   35:aload           4
	//   19   37:invokevirtual   #49  <Method void AppboyInAppMessageFullView.inflateStubViews(Activity, com.appboy.models.IInAppMessageImmersive)>
		iinappmessage = ((IInAppMessage) (appboyinappmessagefullview.getAppropriateImageUrl(iinappmessage)));
	//   20   40:aload           5
	//   21   42:aload_2         
	//   22   43:invokevirtual   #53  <Method String AppboyInAppMessageFullView.getAppropriateImageUrl(IInAppMessage)>
	//   23   46:astore_2        
		if(!StringUtils.isNullOrEmpty(((String) (iinappmessage))))
	//*  24   47:aload_2         
	//*  25   48:invokestatic    #59  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  26   51:ifne            78
			Appboy.getInstance(context).getAppboyImageLoader().renderUrlIntoView(context, ((String) (iinappmessage)), appboyinappmessagefullview.getMessageImageView(), AppboyViewBounds.NO_BOUNDS);
	//   27   54:aload           6
	//   28   56:invokestatic    #65  <Method Appboy Appboy.getInstance(android.content.Context)>
	//   29   59:invokevirtual   #69  <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   30   62:aload           6
	//   31   64:aload_2         
	//   32   65:aload           5
	//   33   67:invokevirtual   #73  <Method android.widget.ImageView AppboyInAppMessageFullView.getMessageImageView()>
	//   34   70:getstatic       #79  <Field AppboyViewBounds AppboyViewBounds.NO_BOUNDS>
	//   35   73:invokeinterface #85  <Method void IAppboyImageLoader.renderUrlIntoView(android.content.Context, String, android.widget.ImageView, AppboyViewBounds)>
		iinappmessage = ((IInAppMessage) (appboyinappmessagefullview.getFrameView()));
	//   36   78:aload           5
	//   37   80:invokevirtual   #89  <Method View AppboyInAppMessageFullView.getFrameView()>
	//   38   83:astore_2        
		if(!(iinappmessage instanceof View))
	//*  39   84:aload_2         
	//*  40   85:instanceof      #91  <Class View>
	//*  41   88:ifne            99
			((View) (iinappmessage)).setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   42   91:aload_2         
	//   43   92:aconst_null     
	//   44   93:invokevirtual   #95  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  45   96:goto            107
			ViewInstrumentation.setOnClickListener((View)iinappmessage, ((android.view.View.OnClickListener) (null)));
	//   46   99:aload_2         
	//   47  100:checkcast       #91  <Class View>
	//   48  103:aconst_null     
	//   49  104:invokestatic    #100 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		appboyinappmessagefullview.setMessageBackgroundColor(inappmessagefull.getBackgroundColor());
	//   50  107:aload           5
	//   51  109:aload           4
	//   52  111:invokevirtual   #104 <Method int InAppMessageFull.getBackgroundColor()>
	//   53  114:invokevirtual   #108 <Method void AppboyInAppMessageFullView.setMessageBackgroundColor(int)>
		appboyinappmessagefullview.setFrameColor(inappmessagefull.getFrameColor());
	//   54  117:aload           5
	//   55  119:aload           4
	//   56  121:invokevirtual   #112 <Method Integer InAppMessageFull.getFrameColor()>
	//   57  124:invokevirtual   #116 <Method void AppboyInAppMessageFullView.setFrameColor(Integer)>
		appboyinappmessagefullview.setMessageButtons(inappmessagefull.getMessageButtons());
	//   58  127:aload           5
	//   59  129:aload           4
	//   60  131:invokevirtual   #120 <Method java.util.List InAppMessageFull.getMessageButtons()>
	//   61  134:invokevirtual   #124 <Method void AppboyInAppMessageFullView.setMessageButtons(java.util.List)>
		appboyinappmessagefullview.setMessageCloseButtonColor(inappmessagefull.getCloseButtonColor());
	//   62  137:aload           5
	//   63  139:aload           4
	//   64  141:invokevirtual   #127 <Method int InAppMessageFull.getCloseButtonColor()>
	//   65  144:invokevirtual   #130 <Method void AppboyInAppMessageFullView.setMessageCloseButtonColor(int)>
		if(!flag)
	//*  66  147:iload_3         
	//*  67  148:ifne            221
		{
			appboyinappmessagefullview.setMessage(inappmessagefull.getMessage());
	//   68  151:aload           5
	//   69  153:aload           4
	//   70  155:invokevirtual   #134 <Method String InAppMessageFull.getMessage()>
	//   71  158:invokevirtual   #138 <Method void AppboyInAppMessageFullView.setMessage(String)>
			appboyinappmessagefullview.setMessageTextColor(inappmessagefull.getMessageTextColor());
	//   72  161:aload           5
	//   73  163:aload           4
	//   74  165:invokevirtual   #141 <Method int InAppMessageFull.getMessageTextColor()>
	//   75  168:invokevirtual   #144 <Method void AppboyInAppMessageFullView.setMessageTextColor(int)>
			appboyinappmessagefullview.setMessageHeaderText(inappmessagefull.getHeader());
	//   76  171:aload           5
	//   77  173:aload           4
	//   78  175:invokevirtual   #147 <Method String InAppMessageFull.getHeader()>
	//   79  178:invokevirtual   #150 <Method void AppboyInAppMessageFullView.setMessageHeaderText(String)>
			appboyinappmessagefullview.setMessageHeaderTextColor(inappmessagefull.getHeaderTextColor());
	//   80  181:aload           5
	//   81  183:aload           4
	//   82  185:invokevirtual   #153 <Method int InAppMessageFull.getHeaderTextColor()>
	//   83  188:invokevirtual   #156 <Method void AppboyInAppMessageFullView.setMessageHeaderTextColor(int)>
			appboyinappmessagefullview.setMessageHeaderTextAlignment(inappmessagefull.getHeaderTextAlign());
	//   84  191:aload           5
	//   85  193:aload           4
	//   86  195:invokevirtual   #160 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageFull.getHeaderTextAlign()>
	//   87  198:invokevirtual   #164 <Method void AppboyInAppMessageFullView.setMessageHeaderTextAlignment(com.appboy.enums.inappmessage.TextAlign)>
			appboyinappmessagefullview.setMessageTextAlign(inappmessagefull.getMessageTextAlign());
	//   88  201:aload           5
	//   89  203:aload           4
	//   90  205:invokevirtual   #167 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageFull.getMessageTextAlign()>
	//   91  208:invokevirtual   #170 <Method void AppboyInAppMessageFullView.setMessageTextAlign(com.appboy.enums.inappmessage.TextAlign)>
			appboyinappmessagefullview.resetMessageMargins(inappmessagefull.getImageDownloadSuccessful());
	//   92  211:aload           5
	//   93  213:aload           4
	//   94  215:invokevirtual   #174 <Method boolean InAppMessageFull.getImageDownloadSuccessful()>
	//   95  218:invokevirtual   #178 <Method void AppboyInAppMessageFullView.resetMessageMargins(boolean)>
		}
		resetLayoutParamsIfAppropriate(activity, ((IInAppMessage) (inappmessagefull)), appboyinappmessagefullview);
	//   96  221:aload_0         
	//   97  222:aload_1         
	//   98  223:aload           4
	//   99  225:aload           5
	//  100  227:invokevirtual   #182 <Method boolean resetLayoutParamsIfAppropriate(Activity, IInAppMessage, AppboyInAppMessageFullView)>
	//  101  230:pop             
		return appboyinappmessagefullview;
	//  102  231:aload           5
	//  103  233:areturn         
	}

	AppboyInAppMessageFullView getAppropriateFullView(Activity activity, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            19
			return (AppboyInAppMessageFullView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_full_graphic, ((android.view.ViewGroup) (null)));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #189 <Method LayoutInflater Activity.getLayoutInflater()>
	//    4    8:getstatic       #195 <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_full_graphic>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #201 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    7   15:checkcast       #45  <Class AppboyInAppMessageFullView>
	//    8   18:areturn         
		else
			return (AppboyInAppMessageFullView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_full, ((android.view.ViewGroup) (null)));
	//    9   19:aload_1         
	//   10   20:invokevirtual   #189 <Method LayoutInflater Activity.getLayoutInflater()>
	//   11   23:getstatic       #204 <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_full>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #201 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   14   30:checkcast       #45  <Class AppboyInAppMessageFullView>
	//   15   33:areturn         
	}

	boolean resetLayoutParamsIfAppropriate(Activity activity, IInAppMessage iinappmessage, AppboyInAppMessageFullView appboyinappmessagefullview)
	{
		if(!ViewUtils.isRunningOnTablet(activity))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #211 <Method boolean ViewUtils.isRunningOnTablet(Activity)>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(iinappmessage.getOrientation() != null)
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #217 <Method Orientation IInAppMessage.getOrientation()>
	//*   7   15:ifnull          112
		{
			if(iinappmessage.getOrientation() == Orientation.ANY)
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #217 <Method Orientation IInAppMessage.getOrientation()>
	//*  10   24:getstatic       #223 <Field Orientation Orientation.ANY>
	//*  11   27:if_acmpne       32
				return false;
	//   12   30:iconst_0        
	//   13   31:ireturn         
			int i = appboyinappmessagefullview.getLongEdge();
	//   14   32:aload_3         
	//   15   33:invokevirtual   #226 <Method int AppboyInAppMessageFullView.getLongEdge()>
	//   16   36:istore          4
			int j = appboyinappmessagefullview.getShortEdge();
	//   17   38:aload_3         
	//   18   39:invokevirtual   #229 <Method int AppboyInAppMessageFullView.getShortEdge()>
	//   19   42:istore          5
			if(i > 0 && j > 0)
	//*  20   44:iload           4
	//*  21   46:ifle            110
	//*  22   49:iload           5
	//*  23   51:ifle            110
			{
				if(iinappmessage.getOrientation() == Orientation.LANDSCAPE)
	//*  24   54:aload_2         
	//*  25   55:invokeinterface #217 <Method Orientation IInAppMessage.getOrientation()>
	//*  26   60:getstatic       #232 <Field Orientation Orientation.LANDSCAPE>
	//*  27   63:if_acmpne       81
					activity = ((Activity) (new android.widget.RelativeLayout.LayoutParams(i, j)));
	//   28   66:new             #234 <Class android.widget.RelativeLayout$LayoutParams>
	//   29   69:dup             
	//   30   70:iload           4
	//   31   72:iload           5
	//   32   74:invokespecial   #237 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   33   77:astore_1        
				else
	//*  34   78:goto            93
					activity = ((Activity) (new android.widget.RelativeLayout.LayoutParams(j, i)));
	//   35   81:new             #234 <Class android.widget.RelativeLayout$LayoutParams>
	//   36   84:dup             
	//   37   85:iload           5
	//   38   87:iload           4
	//   39   89:invokespecial   #237 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   40   92:astore_1        
				((android.widget.RelativeLayout.LayoutParams) (activity)).addRule(13, -1);
	//   41   93:aload_1         
	//   42   94:bipush          13
	//   43   96:iconst_m1       
	//   44   97:invokevirtual   #240 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
				appboyinappmessagefullview.getMessageBackgroundObject().setLayoutParams(((android.view.ViewGroup.LayoutParams) (activity)));
	//   45  100:aload_3         
	//   46  101:invokevirtual   #243 <Method View AppboyInAppMessageFullView.getMessageBackgroundObject()>
	//   47  104:aload_1         
	//   48  105:invokevirtual   #247 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
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
