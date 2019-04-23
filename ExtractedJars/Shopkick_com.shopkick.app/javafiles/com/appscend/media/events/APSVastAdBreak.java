// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Parcel;
import com.appscend.media.*;
import com.appscend.utilities.GetImageAsync;
import com.appscend.utilities.VPUtilities;
import com.appscend.vast.*;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

// Referenced classes of package com.appscend.media.events:
//			APSMediaEvent, APSMediaUnit, APSMediaOverlay

public class APSVastAdBreak extends APSMediaEvent
{
	public static final class APSVASTConfigurationOptions extends Enum
	{

		public static APSVASTConfigurationOptions valueOf(String s)
		{
			return (APSVASTConfigurationOptions)Enum.valueOf(com/appscend/media/events/APSVastAdBreak$APSVASTConfigurationOptions, s);
		//    0    0:ldc1            #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
		//    4    9:areturn         
		}

		public static APSVASTConfigurationOptions[] values()
		{
			return (APSVASTConfigurationOptions[])((APSVASTConfigurationOptions []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field APSVastAdBreak$APSVASTConfigurationOptions[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions_3B_.clone()>
		//    2    6:checkcast       #46  <Class APSVastAdBreak$APSVASTConfigurationOptions[]>
		//    3    9:areturn         
		}

		private static final APSVASTConfigurationOptions $VALUES[];
		public static final APSVASTConfigurationOptions APSVASTMidContent;
		public static final APSVASTConfigurationOptions APSVASTNonLinear;
		public static final APSVASTConfigurationOptions APSVASTPostContent;
		public static final APSVASTConfigurationOptions APSVASTPreContent;

		static 
		{
			APSVASTPreContent = new APSVASTConfigurationOptions("APSVASTPreContent", 0);
		//    0    0:new             #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "APSVASTPreContent">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void APSVastAdBreak$APSVASTConfigurationOptions(String, int)>
		//    5   10:putstatic       #24  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTPreContent>
			APSVASTPostContent = new APSVASTConfigurationOptions("APSVASTPostContent", 1);
		//    6   13:new             #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "APSVASTPostContent">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void APSVastAdBreak$APSVASTConfigurationOptions(String, int)>
		//   11   23:putstatic       #27  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTPostContent>
			APSVASTMidContent = new APSVASTConfigurationOptions("APSVASTMidContent", 2);
		//   12   26:new             #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "APSVASTMidContent">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void APSVastAdBreak$APSVASTConfigurationOptions(String, int)>
		//   17   36:putstatic       #30  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTMidContent>
			APSVASTNonLinear = new APSVASTConfigurationOptions("APSVASTNonLinear", 3);
		//   18   39:new             #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "APSVASTNonLinear">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void APSVastAdBreak$APSVASTConfigurationOptions(String, int)>
		//   23   49:putstatic       #33  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTNonLinear>
			$VALUES = (new APSVASTConfigurationOptions[] {
				APSVASTPreContent, APSVASTPostContent, APSVASTMidContent, APSVASTNonLinear
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       APSVASTConfigurationOptions[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTPreContent>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTPostContent>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTMidContent>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTNonLinear>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field APSVastAdBreak$APSVASTConfigurationOptions[] $VALUES>
		//*  43   83:return          
		}

		private APSVASTConfigurationOptions(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public APSVastAdBreak()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void APSMediaEvent()>
		sources = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #137 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #138 <Method void ArrayList()>
	//    6   12:putfield        #140 <Field ArrayList sources>
		ads = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #142 <Field ArrayList ads>
		buffet = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #144 <Field ArrayList buffet>
		afterVideoAdTapped = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//   13   25:aload_0         
	//   14   26:getstatic       #149 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//   15   29:putfield        #151 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterVideoAdTapped>
		afterBannerTapped = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//   16   32:aload_0         
	//   17   33:getstatic       #149 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//   18   36:putfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
		prefferedVideoMimeTypes = new ArrayList(((Collection) (Arrays.asList(((Object []) (new String[] {
			"video/mp4", "mobile/mp4", "mobile/m3u8", "application/x-mpegURL", "application/vnd.apple.mpegURL", "vnd.apple.mpegURL", "video/mpeg", "video/mp4", "video/m3u8"
		}))))));
	//   19   39:aload_0         
	//   20   40:new             #137 <Class ArrayList>
	//   21   43:dup             
	//   22   44:bipush          9
	//   23   46:anewarray       String[]
	//   24   49:dup             
	//   25   50:iconst_0        
	//   26   51:ldc1            #157 <String "video/mp4">
	//   27   53:aastore         
	//   28   54:dup             
	//   29   55:iconst_1        
	//   30   56:ldc1            #159 <String "mobile/mp4">
	//   31   58:aastore         
	//   32   59:dup             
	//   33   60:iconst_2        
	//   34   61:ldc1            #161 <String "mobile/m3u8">
	//   35   63:aastore         
	//   36   64:dup             
	//   37   65:iconst_3        
	//   38   66:ldc1            #163 <String "application/x-mpegURL">
	//   39   68:aastore         
	//   40   69:dup             
	//   41   70:iconst_4        
	//   42   71:ldc1            #165 <String "application/vnd.apple.mpegURL">
	//   43   73:aastore         
	//   44   74:dup             
	//   45   75:iconst_5        
	//   46   76:ldc1            #167 <String "vnd.apple.mpegURL">
	//   47   78:aastore         
	//   48   79:dup             
	//   49   80:bipush          6
	//   50   82:ldc1            #169 <String "video/mpeg">
	//   51   84:aastore         
	//   52   85:dup             
	//   53   86:bipush          7
	//   54   88:ldc1            #157 <String "video/mp4">
	//   55   90:aastore         
	//   56   91:dup             
	//   57   92:bipush          8
	//   58   94:ldc1            #171 <String "video/m3u8">
	//   59   96:aastore         
	//   60   97:invokestatic    #177 <Method List Arrays.asList(Object[])>
	//   61  100:invokespecial   #180 <Method void ArrayList(Collection)>
	//   62  103:putfield        #182 <Field ArrayList prefferedVideoMimeTypes>
		skipButtonBorderRadius = -1;
	//   63  106:aload_0         
	//   64  107:iconst_m1       
	//   65  108:putfield        #184 <Field int skipButtonBorderRadius>
		userAgent = null;
	//   66  111:aload_0         
	//   67  112:aconst_null     
	//   68  113:putfield        #186 <Field String userAgent>
		controlsDisplayForAds = APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayNone;
	//   69  116:aload_0         
	//   70  117:getstatic       #191 <Field APSMediaUnit$APSMediaControlsDisplay APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayNone>
	//   71  120:putfield        #193 <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplayForAds>
		defaultIconHeightPercentage = 10F;
	//   72  123:aload_0         
	//   73  124:ldc1            #194 <Float 10F>
	//   74  126:putfield        #196 <Field float defaultIconHeightPercentage>
		showCountdown = true;
	//   75  129:aload_0         
	//   76  130:iconst_1        
	//   77  131:putfield        #198 <Field boolean showCountdown>
		countdownPosition = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft;
	//   78  134:aload_0         
	//   79  135:getstatic       #203 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft>
	//   80  138:putfield        #205 <Field APSMediaOverlay$APSMediaOverlayPosition countdownPosition>
		iconFadeInDuration = 0.5F;
	//   81  141:aload_0         
	//   82  142:ldc1            #206 <Float 0.5F>
	//   83  144:putfield        #208 <Field float iconFadeInDuration>
		bannerFadeInDuration = 0.5F;
	//   84  147:aload_0         
	//   85  148:ldc1            #206 <Float 0.5F>
	//   86  150:putfield        #210 <Field float bannerFadeInDuration>
		skipButtonPosition = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight;
	//   87  153:aload_0         
	//   88  154:getstatic       #213 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight>
	//   89  157:putfield        #215 <Field APSMediaOverlay$APSMediaOverlayPosition skipButtonPosition>
		defaultSkipOffset = -1;
	//   90  160:aload_0         
	//   91  161:iconst_m1       
	//   92  162:putfield        #217 <Field int defaultSkipOffset>
		skipButtonProgressPosition = com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController.APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionRight;
	//   93  165:aload_0         
	//   94  166:getstatic       #222 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionRight>
	//   95  169:putfield        #224 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition skipButtonProgressPosition>
		skipButtonPadding = 5;
	//   96  172:aload_0         
	//   97  173:iconst_5        
	//   98  174:putfield        #226 <Field int skipButtonPadding>
		skipButtonBorderRadius = 10;
	//   99  177:aload_0         
	//  100  178:bipush          10
	//  101  180:putfield        #184 <Field int skipButtonBorderRadius>
		skipButtonWidth = "75";
	//  102  183:aload_0         
	//  103  184:ldc1            #228 <String "75">
	//  104  186:putfield        #230 <Field String skipButtonWidth>
		skipButtonHeight = "30";
	//  105  189:aload_0         
	//  106  190:ldc1            #232 <String "30">
	//  107  192:putfield        #234 <Field String skipButtonHeight>
		countdownWidth = "64%";
	//  108  195:aload_0         
	//  109  196:ldc1            #236 <String "64%">
	//  110  198:putfield        #238 <Field String countdownWidth>
		countdownHeight = "30";
	//  111  201:aload_0         
	//  112  202:ldc1            #232 <String "30">
	//  113  204:putfield        #240 <Field String countdownHeight>
		defaultBannerAdBreakDuration = 10;
	//  114  207:aload_0         
	//  115  208:bipush          10
	//  116  210:putfield        #242 <Field int defaultBannerAdBreakDuration>
		bannerMaxSizeWidth = 320;
	//  117  213:aload_0         
	//  118  214:sipush          320
	//  119  217:putfield        #244 <Field int bannerMaxSizeWidth>
		bannerMaxSizeHeight = 50;
	//  120  220:aload_0         
	//  121  221:bipush          50
	//  122  223:putfield        #246 <Field int bannerMaxSizeHeight>
		stretchBannersToMaxSize = false;
	//  123  226:aload_0         
	//  124  227:iconst_0        
	//  125  228:putfield        #248 <Field boolean stretchBannersToMaxSize>
		multipleAdsConflictsPolicy = com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingFirst;
	//  126  231:aload_0         
	//  127  232:getstatic       #253 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingFirst>
	//  128  235:putfield        #255 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy multipleAdsConflictsPolicy>
		adPodFallbackStrategy = com.appscend.vast.APSVASTRootNode.APSAdPodFallback.APSAdPodFallbackSelectAll;
	//  129  238:aload_0         
	//  130  239:getstatic       #260 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback com.appscend.vast.APSVASTRootNode$APSAdPodFallback.APSAdPodFallbackSelectAll>
	//  131  242:putfield        #262 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback adPodFallbackStrategy>
		bannerSkipOffset = 3;
	//  132  245:aload_0         
	//  133  246:iconst_3        
	//  134  247:putfield        #264 <Field int bannerSkipOffset>
		bannerPosition = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom;
	//  135  250:aload_0         
	//  136  251:getstatic       #267 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom>
	//  137  254:putfield        #269 <Field APSMediaOverlay$APSMediaOverlayPosition bannerPosition>
		showBannerCloseButton = true;
	//  138  257:aload_0         
	//  139  258:iconst_1        
	//  140  259:putfield        #271 <Field boolean showBannerCloseButton>
		bannerCloseButtonInitialAlpha = 0.5F;
	//  141  262:aload_0         
	//  142  263:ldc1            #206 <Float 0.5F>
	//  143  265:putfield        #273 <Field float bannerCloseButtonInitialAlpha>
		bannerCloseButtonFinalAlpha = 0.7F;
	//  144  268:aload_0         
	//  145  269:ldc2            #274 <Float 0.7F>
	//  146  272:putfield        #276 <Field float bannerCloseButtonFinalAlpha>
		bannerCloseButtonSize = 20;
	//  147  275:aload_0         
	//  148  276:bipush          20
	//  149  278:putfield        #278 <Field int bannerCloseButtonSize>
		bannerCloseButtonOffsetX = 0;
	//  150  281:aload_0         
	//  151  282:iconst_0        
	//  152  283:putfield        #280 <Field int bannerCloseButtonOffsetX>
		bannerCloseButtonOffsetY = 0;
	//  153  286:aload_0         
	//  154  287:iconst_0        
	//  155  288:putfield        #282 <Field int bannerCloseButtonOffsetY>
		followWrappers = true;
	//  156  291:aload_0         
	//  157  292:iconst_1        
	//  158  293:putfield        #284 <Field boolean followWrappers>
	//  159  296:return          
	}

	protected APSVastAdBreak(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #287 <Method void APSMediaEvent(Parcel)>
		sources = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #137 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #138 <Method void ArrayList()>
	//    7   13:putfield        #140 <Field ArrayList sources>
		Object obj1 = null;
	//    8   16:aconst_null     
	//    9   17:astore          6
		ads = null;
	//   10   19:aload_0         
	//   11   20:aconst_null     
	//   12   21:putfield        #142 <Field ArrayList ads>
		buffet = null;
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:putfield        #144 <Field ArrayList buffet>
		afterVideoAdTapped = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//   16   29:aload_0         
	//   17   30:getstatic       #149 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//   18   33:putfield        #151 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterVideoAdTapped>
		afterBannerTapped = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//   19   36:aload_0         
	//   20   37:getstatic       #149 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//   21   40:putfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
		prefferedVideoMimeTypes = new ArrayList(((Collection) (Arrays.asList(((Object []) (new String[] {
			"video/mp4", "mobile/mp4", "mobile/m3u8", "application/x-mpegURL", "application/vnd.apple.mpegURL", "vnd.apple.mpegURL", "video/mpeg", "video/mp4", "video/m3u8"
		}))))));
	//   22   43:aload_0         
	//   23   44:new             #137 <Class ArrayList>
	//   24   47:dup             
	//   25   48:bipush          9
	//   26   50:anewarray       String[]
	//   27   53:dup             
	//   28   54:iconst_0        
	//   29   55:ldc1            #157 <String "video/mp4">
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_1        
	//   33   60:ldc1            #159 <String "mobile/mp4">
	//   34   62:aastore         
	//   35   63:dup             
	//   36   64:iconst_2        
	//   37   65:ldc1            #161 <String "mobile/m3u8">
	//   38   67:aastore         
	//   39   68:dup             
	//   40   69:iconst_3        
	//   41   70:ldc1            #163 <String "application/x-mpegURL">
	//   42   72:aastore         
	//   43   73:dup             
	//   44   74:iconst_4        
	//   45   75:ldc1            #165 <String "application/vnd.apple.mpegURL">
	//   46   77:aastore         
	//   47   78:dup             
	//   48   79:iconst_5        
	//   49   80:ldc1            #167 <String "vnd.apple.mpegURL">
	//   50   82:aastore         
	//   51   83:dup             
	//   52   84:bipush          6
	//   53   86:ldc1            #169 <String "video/mpeg">
	//   54   88:aastore         
	//   55   89:dup             
	//   56   90:bipush          7
	//   57   92:ldc1            #157 <String "video/mp4">
	//   58   94:aastore         
	//   59   95:dup             
	//   60   96:bipush          8
	//   61   98:ldc1            #171 <String "video/m3u8">
	//   62  100:aastore         
	//   63  101:invokestatic    #177 <Method List Arrays.asList(Object[])>
	//   64  104:invokespecial   #180 <Method void ArrayList(Collection)>
	//   65  107:putfield        #182 <Field ArrayList prefferedVideoMimeTypes>
		skipButtonBorderRadius = -1;
	//   66  110:aload_0         
	//   67  111:iconst_m1       
	//   68  112:putfield        #184 <Field int skipButtonBorderRadius>
		userAgent = null;
	//   69  115:aload_0         
	//   70  116:aconst_null     
	//   71  117:putfield        #186 <Field String userAgent>
		ads = new ArrayList();
	//   72  120:aload_0         
	//   73  121:new             #137 <Class ArrayList>
	//   74  124:dup             
	//   75  125:invokespecial   #138 <Method void ArrayList()>
	//   76  128:putfield        #142 <Field ArrayList ads>
		parcel.readList(((List) (ads)), ((Class) (com/appscend/vast/APSVASTInLineNode)).getClassLoader());
	//   77  131:aload_1         
	//   78  132:aload_0         
	//   79  133:getfield        #142 <Field ArrayList ads>
	//   80  136:ldc2            #289 <Class APSVASTInLineNode>
	//   81  139:invokevirtual   #295 <Method ClassLoader Class.getClassLoader()>
	//   82  142:invokevirtual   #301 <Method void Parcel.readList(List, ClassLoader)>
		buffet = new ArrayList();
	//   83  145:aload_0         
	//   84  146:new             #137 <Class ArrayList>
	//   85  149:dup             
	//   86  150:invokespecial   #138 <Method void ArrayList()>
	//   87  153:putfield        #144 <Field ArrayList buffet>
		parcel.readList(((List) (buffet)), ((Class) (com/appscend/vast/APSVASTInLineNode)).getClassLoader());
	//   88  156:aload_1         
	//   89  157:aload_0         
	//   90  158:getfield        #144 <Field ArrayList buffet>
	//   91  161:ldc2            #289 <Class APSVASTInLineNode>
	//   92  164:invokevirtual   #295 <Method ClassLoader Class.getClassLoader()>
	//   93  167:invokevirtual   #301 <Method void Parcel.readList(List, ClassLoader)>
		generatedUnits = parcel.createTypedArrayList(APSMediaUnit.CREATOR);
	//   94  170:aload_0         
	//   95  171:aload_1         
	//   96  172:getstatic       #304 <Field android.os.Parcelable$Creator APSMediaUnit.CREATOR>
	//   97  175:invokevirtual   #308 <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   98  178:putfield        #310 <Field ArrayList generatedUnits>
		int i = parcel.readInt();
	//   99  181:aload_1         
	//  100  182:invokevirtual   #314 <Method int Parcel.readInt()>
	//  101  185:istore_2        
		Object obj;
		if(i == -1)
	//* 102  186:iload_2         
	//* 103  187:iconst_m1       
	//* 104  188:icmpne          197
			obj = null;
	//  105  191:aconst_null     
	//  106  192:astore          5
		else
	//* 107  194:goto            204
			obj = ((Object) (APSVASTConfigurationOptions.values()[i]));
	//  108  197:invokestatic    #318 <Method APSVastAdBreak$APSVASTConfigurationOptions[] APSVastAdBreak$APSVASTConfigurationOptions.values()>
	//  109  200:iload_2         
	//  110  201:aaload          
	//  111  202:astore          5
		type = ((APSVASTConfigurationOptions) (obj));
	//  112  204:aload_0         
	//  113  205:aload           5
	//  114  207:putfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
		adOffset = parcel.readString();
	//  115  210:aload_0         
	//  116  211:aload_1         
	//  117  212:invokevirtual   #324 <Method String Parcel.readString()>
	//  118  215:putfield        #326 <Field String adOffset>
		metadata = (HashMap)parcel.readSerializable();
	//  119  218:aload_0         
	//  120  219:aload_1         
	//  121  220:invokevirtual   #330 <Method java.io.Serializable Parcel.readSerializable()>
	//  122  223:checkcast       #332 <Class HashMap>
	//  123  226:putfield        #334 <Field HashMap metadata>
		i = parcel.readInt();
	//  124  229:aload_1         
	//  125  230:invokevirtual   #314 <Method int Parcel.readInt()>
	//  126  233:istore_2        
		if(i == -1)
	//* 127  234:iload_2         
	//* 128  235:iconst_m1       
	//* 129  236:icmpne          245
			obj = null;
	//  130  239:aconst_null     
	//  131  240:astore          5
		else
	//* 132  242:goto            252
			obj = ((Object) (com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.values()[i]));
	//  133  245:invokestatic    #337 <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction[] com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.values()>
	//  134  248:iload_2         
	//  135  249:aaload          
	//  136  250:astore          5
		afterVideoAdTapped = ((com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction) (obj));
	//  137  252:aload_0         
	//  138  253:aload           5
	//  139  255:putfield        #151 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterVideoAdTapped>
		i = parcel.readInt();
	//  140  258:aload_1         
	//  141  259:invokevirtual   #314 <Method int Parcel.readInt()>
	//  142  262:istore_2        
		if(i == -1)
	//* 143  263:iload_2         
	//* 144  264:iconst_m1       
	//* 145  265:icmpne          274
			obj = null;
	//  146  268:aconst_null     
	//  147  269:astore          5
		else
	//* 148  271:goto            281
			obj = ((Object) (com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.values()[i]));
	//  149  274:invokestatic    #337 <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction[] com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.values()>
	//  150  277:iload_2         
	//  151  278:aaload          
	//  152  279:astore          5
		afterBannerTapped = ((com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction) (obj));
	//  153  281:aload_0         
	//  154  282:aload           5
	//  155  284:putfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
		prefferedVideoMimeTypes = parcel.createStringArrayList();
	//  156  287:aload_0         
	//  157  288:aload_1         
	//  158  289:invokevirtual   #341 <Method ArrayList Parcel.createStringArrayList()>
	//  159  292:putfield        #182 <Field ArrayList prefferedVideoMimeTypes>
		i = parcel.readInt();
	//  160  295:aload_1         
	//  161  296:invokevirtual   #314 <Method int Parcel.readInt()>
	//  162  299:istore_2        
		if(i == -1)
	//* 163  300:iload_2         
	//* 164  301:iconst_m1       
	//* 165  302:icmpne          311
			obj = null;
	//  166  305:aconst_null     
	//  167  306:astore          5
		else
	//* 168  308:goto            318
			obj = ((Object) (APSMediaUnit.APSMediaControlsDisplay.values()[i]));
	//  169  311:invokestatic    #344 <Method APSMediaUnit$APSMediaControlsDisplay[] APSMediaUnit$APSMediaControlsDisplay.values()>
	//  170  314:iload_2         
	//  171  315:aaload          
	//  172  316:astore          5
		controlsDisplayForAds = ((APSMediaUnit.APSMediaControlsDisplay) (obj));
	//  173  318:aload_0         
	//  174  319:aload           5
	//  175  321:putfield        #193 <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplayForAds>
		controlsParametersForAds = (HashMap)parcel.readSerializable();
	//  176  324:aload_0         
	//  177  325:aload_1         
	//  178  326:invokevirtual   #330 <Method java.io.Serializable Parcel.readSerializable()>
	//  179  329:checkcast       #332 <Class HashMap>
	//  180  332:putfield        #346 <Field HashMap controlsParametersForAds>
		i = parcel.readInt();
	//  181  335:aload_1         
	//  182  336:invokevirtual   #314 <Method int Parcel.readInt()>
	//  183  339:istore_2        
		if(i == -1)
	//* 184  340:iload_2         
	//* 185  341:iconst_m1       
	//* 186  342:icmpne          351
			obj = null;
	//  187  345:aconst_null     
	//  188  346:astore          5
		else
	//* 189  348:goto            358
			obj = ((Object) (com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy.values()[i]));
	//  190  351:invokestatic    #349 <Method com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy[] com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.values()>
	//  191  354:iload_2         
	//  192  355:aaload          
	//  193  356:astore          5
		multipleAdsConflictsPolicy = ((com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy) (obj));
	//  194  358:aload_0         
	//  195  359:aload           5
	//  196  361:putfield        #255 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy multipleAdsConflictsPolicy>
		i = parcel.readInt();
	//  197  364:aload_1         
	//  198  365:invokevirtual   #314 <Method int Parcel.readInt()>
	//  199  368:istore_2        
		if(i == -1)
	//* 200  369:iload_2         
	//* 201  370:iconst_m1       
	//* 202  371:icmpne          380
			obj = null;
	//  203  374:aconst_null     
	//  204  375:astore          5
		else
	//* 205  377:goto            387
			obj = ((Object) (APSMediaOverlay.APSMediaOverlayPosition.values()[i]));
	//  206  380:invokestatic    #352 <Method APSMediaOverlay$APSMediaOverlayPosition[] APSMediaOverlay$APSMediaOverlayPosition.values()>
	//  207  383:iload_2         
	//  208  384:aaload          
	//  209  385:astore          5
		countdownPosition = ((APSMediaOverlay.APSMediaOverlayPosition) (obj));
	//  210  387:aload_0         
	//  211  388:aload           5
	//  212  390:putfield        #205 <Field APSMediaOverlay$APSMediaOverlayPosition countdownPosition>
		i = parcel.readInt();
	//  213  393:aload_1         
	//  214  394:invokevirtual   #314 <Method int Parcel.readInt()>
	//  215  397:istore_2        
		if(i == -1)
	//* 216  398:iload_2         
	//* 217  399:iconst_m1       
	//* 218  400:icmpne          409
			obj = null;
	//  219  403:aconst_null     
	//  220  404:astore          5
		else
	//* 221  406:goto            416
			obj = ((Object) (APSMediaOverlay.APSMediaOverlayPosition.values()[i]));
	//  222  409:invokestatic    #352 <Method APSMediaOverlay$APSMediaOverlayPosition[] APSMediaOverlay$APSMediaOverlayPosition.values()>
	//  223  412:iload_2         
	//  224  413:aaload          
	//  225  414:astore          5
		skipButtonPosition = ((APSMediaOverlay.APSMediaOverlayPosition) (obj));
	//  226  416:aload_0         
	//  227  417:aload           5
	//  228  419:putfield        #215 <Field APSMediaOverlay$APSMediaOverlayPosition skipButtonPosition>
		i = parcel.readInt();
	//  229  422:aload_1         
	//  230  423:invokevirtual   #314 <Method int Parcel.readInt()>
	//  231  426:istore_2        
		if(i == -1)
	//* 232  427:iload_2         
	//* 233  428:iconst_m1       
	//* 234  429:icmpne          438
			obj = null;
	//  235  432:aconst_null     
	//  236  433:astore          5
		else
	//* 237  435:goto            445
			obj = ((Object) (APSMediaOverlay.APSMediaOverlayPosition.values()[i]));
	//  238  438:invokestatic    #352 <Method APSMediaOverlay$APSMediaOverlayPosition[] APSMediaOverlay$APSMediaOverlayPosition.values()>
	//  239  441:iload_2         
	//  240  442:aaload          
	//  241  443:astore          5
		nextMediaCountdownPosition = ((APSMediaOverlay.APSMediaOverlayPosition) (obj));
	//  242  445:aload_0         
	//  243  446:aload           5
	//  244  448:putfield        #354 <Field APSMediaOverlay$APSMediaOverlayPosition nextMediaCountdownPosition>
		countdownWidth = parcel.readString();
	//  245  451:aload_0         
	//  246  452:aload_1         
	//  247  453:invokevirtual   #324 <Method String Parcel.readString()>
	//  248  456:putfield        #238 <Field String countdownWidth>
		countdownHeight = parcel.readString();
	//  249  459:aload_0         
	//  250  460:aload_1         
	//  251  461:invokevirtual   #324 <Method String Parcel.readString()>
	//  252  464:putfield        #240 <Field String countdownHeight>
		countdownText = parcel.readString();
	//  253  467:aload_0         
	//  254  468:aload_1         
	//  255  469:invokevirtual   #324 <Method String Parcel.readString()>
	//  256  472:putfield        #356 <Field String countdownText>
		countdownFont = parcel.readString();
	//  257  475:aload_0         
	//  258  476:aload_1         
	//  259  477:invokevirtual   #324 <Method String Parcel.readString()>
	//  260  480:putfield        #358 <Field String countdownFont>
		countdownSize = parcel.readString();
	//  261  483:aload_0         
	//  262  484:aload_1         
	//  263  485:invokevirtual   #324 <Method String Parcel.readString()>
	//  264  488:putfield        #360 <Field String countdownSize>
		countdownColor = parcel.readString();
	//  265  491:aload_0         
	//  266  492:aload_1         
	//  267  493:invokevirtual   #324 <Method String Parcel.readString()>
	//  268  496:putfield        #362 <Field String countdownColor>
		defaultSkipOffset = parcel.readInt();
	//  269  499:aload_0         
	//  270  500:aload_1         
	//  271  501:invokevirtual   #314 <Method int Parcel.readInt()>
	//  272  504:putfield        #217 <Field int defaultSkipOffset>
		skipButtonBorderRadius = parcel.readInt();
	//  273  507:aload_0         
	//  274  508:aload_1         
	//  275  509:invokevirtual   #314 <Method int Parcel.readInt()>
	//  276  512:putfield        #184 <Field int skipButtonBorderRadius>
		skipButtonText = parcel.readString();
	//  277  515:aload_0         
	//  278  516:aload_1         
	//  279  517:invokevirtual   #324 <Method String Parcel.readString()>
	//  280  520:putfield        #364 <Field String skipButtonText>
		skipButtonTextColor = parcel.readString();
	//  281  523:aload_0         
	//  282  524:aload_1         
	//  283  525:invokevirtual   #324 <Method String Parcel.readString()>
	//  284  528:putfield        #366 <Field String skipButtonTextColor>
		skipButtonBorderColor = parcel.readString();
	//  285  531:aload_0         
	//  286  532:aload_1         
	//  287  533:invokevirtual   #324 <Method String Parcel.readString()>
	//  288  536:putfield        #368 <Field String skipButtonBorderColor>
		skipButtonBackgroundColor = parcel.readString();
	//  289  539:aload_0         
	//  290  540:aload_1         
	//  291  541:invokevirtual   #324 <Method String Parcel.readString()>
	//  292  544:putfield        #370 <Field String skipButtonBackgroundColor>
		skipButtonWidth = parcel.readString();
	//  293  547:aload_0         
	//  294  548:aload_1         
	//  295  549:invokevirtual   #324 <Method String Parcel.readString()>
	//  296  552:putfield        #230 <Field String skipButtonWidth>
		skipButtonHeight = parcel.readString();
	//  297  555:aload_0         
	//  298  556:aload_1         
	//  299  557:invokevirtual   #324 <Method String Parcel.readString()>
	//  300  560:putfield        #234 <Field String skipButtonHeight>
		skipButtonProgressCircleColor = parcel.readString();
	//  301  563:aload_0         
	//  302  564:aload_1         
	//  303  565:invokevirtual   #324 <Method String Parcel.readString()>
	//  304  568:putfield        #372 <Field String skipButtonProgressCircleColor>
		skipButtonProgressCircleTextColor = parcel.readString();
	//  305  571:aload_0         
	//  306  572:aload_1         
	//  307  573:invokevirtual   #324 <Method String Parcel.readString()>
	//  308  576:putfield        #374 <Field String skipButtonProgressCircleTextColor>
		skipButtonProgressCircleTrackColor = parcel.readString();
	//  309  579:aload_0         
	//  310  580:aload_1         
	//  311  581:invokevirtual   #324 <Method String Parcel.readString()>
	//  312  584:putfield        #376 <Field String skipButtonProgressCircleTrackColor>
		i = parcel.readInt();
	//  313  587:aload_1         
	//  314  588:invokevirtual   #314 <Method int Parcel.readInt()>
	//  315  591:istore_2        
		if(i == -1)
	//* 316  592:iload_2         
	//* 317  593:iconst_m1       
	//* 318  594:icmpne          603
			obj = null;
	//  319  597:aconst_null     
	//  320  598:astore          5
		else
	//* 321  600:goto            610
			obj = ((Object) (com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController.APSSkipOverlayProgressPosition.values()[i]));
	//  322  603:invokestatic    #379 <Method com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[] com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition.values()>
	//  323  606:iload_2         
	//  324  607:aaload          
	//  325  608:astore          5
		skipButtonProgressPosition = ((com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController.APSSkipOverlayProgressPosition) (obj));
	//  326  610:aload_0         
	//  327  611:aload           5
	//  328  613:putfield        #224 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition skipButtonProgressPosition>
		i = parcel.readInt();
	//  329  616:aload_1         
	//  330  617:invokevirtual   #314 <Method int Parcel.readInt()>
	//  331  620:istore_2        
		if(i == -1)
	//* 332  621:iload_2         
	//* 333  622:iconst_m1       
	//* 334  623:icmpne          632
			obj = null;
	//  335  626:aconst_null     
	//  336  627:astore          5
		else
	//* 337  629:goto            639
			obj = ((Object) (com.appscend.vast.APSVASTRootNode.APSAdPodFallback.values()[i]));
	//  338  632:invokestatic    #382 <Method com.appscend.vast.APSVASTRootNode$APSAdPodFallback[] com.appscend.vast.APSVASTRootNode$APSAdPodFallback.values()>
	//  339  635:iload_2         
	//  340  636:aaload          
	//  341  637:astore          5
		adPodFallbackStrategy = ((com.appscend.vast.APSVASTRootNode.APSAdPodFallback) (obj));
	//  342  639:aload_0         
	//  343  640:aload           5
	//  344  642:putfield        #262 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback adPodFallbackStrategy>
		defaultAdBreakPositions = parcel.createStringArrayList();
	//  345  645:aload_0         
	//  346  646:aload_1         
	//  347  647:invokevirtual   #341 <Method ArrayList Parcel.createStringArrayList()>
	//  348  650:putfield        #384 <Field ArrayList defaultAdBreakPositions>
		defaultBannerAdBreakDuration = parcel.readInt();
	//  349  653:aload_0         
	//  350  654:aload_1         
	//  351  655:invokevirtual   #314 <Method int Parcel.readInt()>
	//  352  658:putfield        #242 <Field int defaultBannerAdBreakDuration>
		bannerMaxSizeWidth = parcel.readInt();
	//  353  661:aload_0         
	//  354  662:aload_1         
	//  355  663:invokevirtual   #314 <Method int Parcel.readInt()>
	//  356  666:putfield        #244 <Field int bannerMaxSizeWidth>
		bannerMaxSizeHeight = parcel.readInt();
	//  357  669:aload_0         
	//  358  670:aload_1         
	//  359  671:invokevirtual   #314 <Method int Parcel.readInt()>
	//  360  674:putfield        #246 <Field int bannerMaxSizeHeight>
		defaultIconHeightPercentage = parcel.readFloat();
	//  361  677:aload_0         
	//  362  678:aload_1         
	//  363  679:invokevirtual   #388 <Method float Parcel.readFloat()>
	//  364  682:putfield        #196 <Field float defaultIconHeightPercentage>
		iconFadeInDuration = parcel.readFloat();
	//  365  685:aload_0         
	//  366  686:aload_1         
	//  367  687:invokevirtual   #388 <Method float Parcel.readFloat()>
	//  368  690:putfield        #208 <Field float iconFadeInDuration>
		bannerFadeInDuration = parcel.readFloat();
	//  369  693:aload_0         
	//  370  694:aload_1         
	//  371  695:invokevirtual   #388 <Method float Parcel.readFloat()>
	//  372  698:putfield        #210 <Field float bannerFadeInDuration>
		i = ((int) (parcel.readByte()));
	//  373  701:aload_1         
	//  374  702:invokevirtual   #392 <Method byte Parcel.readByte()>
	//  375  705:istore_2        
		boolean flag1 = true;
	//  376  706:iconst_1        
	//  377  707:istore          4
		boolean flag;
		if(i != 0)
	//* 378  709:iload_2         
	//* 379  710:ifeq            718
			flag = true;
	//  380  713:iconst_1        
	//  381  714:istore_3        
		else
	//* 382  715:goto            720
			flag = false;
	//  383  718:iconst_0        
	//  384  719:istore_3        
		showCountdown = flag;
	//  385  720:aload_0         
	//  386  721:iload_3         
	//  387  722:putfield        #198 <Field boolean showCountdown>
		if(parcel.readByte() != 0)
	//* 388  725:aload_1         
	//* 389  726:invokevirtual   #392 <Method byte Parcel.readByte()>
	//* 390  729:ifeq            737
			flag = true;
	//  391  732:iconst_1        
	//  392  733:istore_3        
		else
	//* 393  734:goto            739
			flag = false;
	//  394  737:iconst_0        
	//  395  738:istore_3        
		stretchBannersToMaxSize = flag;
	//  396  739:aload_0         
	//  397  740:iload_3         
	//  398  741:putfield        #248 <Field boolean stretchBannersToMaxSize>
		bannerSkipOffset = parcel.readInt();
	//  399  744:aload_0         
	//  400  745:aload_1         
	//  401  746:invokevirtual   #314 <Method int Parcel.readInt()>
	//  402  749:putfield        #264 <Field int bannerSkipOffset>
		skipButtonPadding = parcel.readInt();
	//  403  752:aload_0         
	//  404  753:aload_1         
	//  405  754:invokevirtual   #314 <Method int Parcel.readInt()>
	//  406  757:putfield        #226 <Field int skipButtonPadding>
		i = parcel.readInt();
	//  407  760:aload_1         
	//  408  761:invokevirtual   #314 <Method int Parcel.readInt()>
	//  409  764:istore_2        
		if(i == -1)
	//* 410  765:iload_2         
	//* 411  766:iconst_m1       
	//* 412  767:icmpne          777
			obj = ((Object) (obj1));
	//  413  770:aload           6
	//  414  772:astore          5
		else
	//* 415  774:goto            784
			obj = ((Object) (APSMediaOverlay.APSMediaOverlayPosition.values()[i]));
	//  416  777:invokestatic    #352 <Method APSMediaOverlay$APSMediaOverlayPosition[] APSMediaOverlay$APSMediaOverlayPosition.values()>
	//  417  780:iload_2         
	//  418  781:aaload          
	//  419  782:astore          5
		bannerPosition = ((APSMediaOverlay.APSMediaOverlayPosition) (obj));
	//  420  784:aload_0         
	//  421  785:aload           5
	//  422  787:putfield        #269 <Field APSMediaOverlay$APSMediaOverlayPosition bannerPosition>
		if(parcel.readByte() != 0)
	//* 423  790:aload_1         
	//* 424  791:invokevirtual   #392 <Method byte Parcel.readByte()>
	//* 425  794:ifeq            802
			flag = true;
	//  426  797:iconst_1        
	//  427  798:istore_3        
		else
	//* 428  799:goto            804
			flag = false;
	//  429  802:iconst_0        
	//  430  803:istore_3        
		showBannerCloseButton = flag;
	//  431  804:aload_0         
	//  432  805:iload_3         
	//  433  806:putfield        #271 <Field boolean showBannerCloseButton>
		bannerCloseButtonImage = (Bitmap)parcel.readParcelable(((Class) (android/graphics/Bitmap)).getClassLoader());
	//  434  809:aload_0         
	//  435  810:aload_1         
	//  436  811:ldc2            #394 <Class Bitmap>
	//  437  814:invokevirtual   #295 <Method ClassLoader Class.getClassLoader()>
	//  438  817:invokevirtual   #398 <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//  439  820:checkcast       #394 <Class Bitmap>
	//  440  823:putfield        #400 <Field Bitmap bannerCloseButtonImage>
		bannerCloseButtonBackgroundColor = parcel.readString();
	//  441  826:aload_0         
	//  442  827:aload_1         
	//  443  828:invokevirtual   #324 <Method String Parcel.readString()>
	//  444  831:putfield        #402 <Field String bannerCloseButtonBackgroundColor>
		bannerCloseButtonXColor = parcel.readString();
	//  445  834:aload_0         
	//  446  835:aload_1         
	//  447  836:invokevirtual   #324 <Method String Parcel.readString()>
	//  448  839:putfield        #404 <Field String bannerCloseButtonXColor>
		bannerCloseButtonInitialAlpha = parcel.readFloat();
	//  449  842:aload_0         
	//  450  843:aload_1         
	//  451  844:invokevirtual   #388 <Method float Parcel.readFloat()>
	//  452  847:putfield        #273 <Field float bannerCloseButtonInitialAlpha>
		bannerCloseButtonFinalAlpha = parcel.readFloat();
	//  453  850:aload_0         
	//  454  851:aload_1         
	//  455  852:invokevirtual   #388 <Method float Parcel.readFloat()>
	//  456  855:putfield        #276 <Field float bannerCloseButtonFinalAlpha>
		bannerCloseButtonSize = parcel.readInt();
	//  457  858:aload_0         
	//  458  859:aload_1         
	//  459  860:invokevirtual   #314 <Method int Parcel.readInt()>
	//  460  863:putfield        #278 <Field int bannerCloseButtonSize>
		bannerCloseButtonOffsetX = parcel.readInt();
	//  461  866:aload_0         
	//  462  867:aload_1         
	//  463  868:invokevirtual   #314 <Method int Parcel.readInt()>
	//  464  871:putfield        #280 <Field int bannerCloseButtonOffsetX>
		bannerCloseButtonOffsetY = parcel.readInt();
	//  465  874:aload_0         
	//  466  875:aload_1         
	//  467  876:invokevirtual   #314 <Method int Parcel.readInt()>
	//  468  879:putfield        #282 <Field int bannerCloseButtonOffsetY>
		bannerCloseButtonProgressColor = parcel.readString();
	//  469  882:aload_0         
	//  470  883:aload_1         
	//  471  884:invokevirtual   #324 <Method String Parcel.readString()>
	//  472  887:putfield        #406 <Field String bannerCloseButtonProgressColor>
		bannerCloseButtonTrackColor = parcel.readString();
	//  473  890:aload_0         
	//  474  891:aload_1         
	//  475  892:invokevirtual   #324 <Method String Parcel.readString()>
	//  476  895:putfield        #408 <Field String bannerCloseButtonTrackColor>
		if(parcel.readByte() != 0)
	//* 477  898:aload_1         
	//* 478  899:invokevirtual   #392 <Method byte Parcel.readByte()>
	//* 479  902:ifeq            910
			flag = true;
	//  480  905:iconst_1        
	//  481  906:istore_3        
		else
	//* 482  907:goto            912
			flag = false;
	//  483  910:iconst_0        
	//  484  911:istore_3        
		allowMultipleAds = flag;
	//  485  912:aload_0         
	//  486  913:iload_3         
	//  487  914:putfield        #410 <Field boolean allowMultipleAds>
		if(parcel.readByte() != 0)
	//* 488  917:aload_1         
	//* 489  918:invokevirtual   #392 <Method byte Parcel.readByte()>
	//* 490  921:ifeq            929
			flag = true;
	//  491  924:iconst_1        
	//  492  925:istore_3        
		else
	//* 493  926:goto            931
			flag = false;
	//  494  929:iconst_0        
	//  495  930:istore_3        
		followWrappers = flag;
	//  496  931:aload_0         
	//  497  932:iload_3         
	//  498  933:putfield        #284 <Field boolean followWrappers>
		userAgent = parcel.readString();
	//  499  936:aload_0         
	//  500  937:aload_1         
	//  501  938:invokevirtual   #324 <Method String Parcel.readString()>
	//  502  941:putfield        #186 <Field String userAgent>
		if(parcel.readByte() != 0)
	//* 503  944:aload_1         
	//* 504  945:invokevirtual   #392 <Method byte Parcel.readByte()>
	//* 505  948:ifeq            956
			flag = true;
	//  506  951:iconst_1        
	//  507  952:istore_3        
		else
	//* 508  953:goto            958
			flag = false;
	//  509  956:iconst_0        
	//  510  957:istore_3        
		debugMode = flag;
	//  511  958:aload_0         
	//  512  959:iload_3         
	//  513  960:putfield        #412 <Field boolean debugMode>
		if(parcel.readByte() != 0)
	//* 514  963:aload_1         
	//* 515  964:invokevirtual   #392 <Method byte Parcel.readByte()>
	//* 516  967:ifeq            976
			flag = flag1;
	//  517  970:iload           4
	//  518  972:istore_3        
		else
	//* 519  973:goto            978
			flag = false;
	//  520  976:iconst_0        
	//  521  977:istore_3        
		isDynamicAdBreak = flag;
	//  522  978:aload_0         
	//  523  979:iload_3         
	//  524  980:putfield        #414 <Field boolean isDynamicAdBreak>
	//  525  983:return          
	}

	public static APSVastAdBreak copyAdBreak(APSVastAdBreak apsvastadbreak)
	{
		APSVastAdBreak apsvastadbreak1 = new APSVastAdBreak();
	//    0    0:new             #2   <Class APSVastAdBreak>
	//    1    3:dup             
	//    2    4:invokespecial   #417 <Method void APSVastAdBreak()>
	//    3    7:astore_1        
		apsvastadbreak1.sources = new ArrayList();
	//    4    8:aload_1         
	//    5    9:new             #137 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #138 <Method void ArrayList()>
	//    8   16:putfield        #140 <Field ArrayList sources>
		apsvastadbreak1.sources.addAll(((Collection) (apsvastadbreak.sources)));
	//    9   19:aload_1         
	//   10   20:getfield        #140 <Field ArrayList sources>
	//   11   23:aload_0         
	//   12   24:getfield        #140 <Field ArrayList sources>
	//   13   27:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//   14   30:pop             
		apsvastadbreak1.type = apsvastadbreak.type;
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
	//   18   36:putfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
		apsvastadbreak1.adOffset = apsvastadbreak.adOffset;
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:getfield        #326 <Field String adOffset>
	//   22   44:putfield        #326 <Field String adOffset>
		apsvastadbreak1.afterVideoAdTapped = apsvastadbreak.afterVideoAdTapped;
	//   23   47:aload_1         
	//   24   48:aload_0         
	//   25   49:getfield        #151 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterVideoAdTapped>
	//   26   52:putfield        #151 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterVideoAdTapped>
		apsvastadbreak1.afterBannerTapped = apsvastadbreak.afterBannerTapped;
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
	//   30   60:putfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
		apsvastadbreak1.prefferedVideoMimeTypes = new ArrayList();
	//   31   63:aload_1         
	//   32   64:new             #137 <Class ArrayList>
	//   33   67:dup             
	//   34   68:invokespecial   #138 <Method void ArrayList()>
	//   35   71:putfield        #182 <Field ArrayList prefferedVideoMimeTypes>
		ArrayList arraylist = apsvastadbreak.prefferedVideoMimeTypes;
	//   36   74:aload_0         
	//   37   75:getfield        #182 <Field ArrayList prefferedVideoMimeTypes>
	//   38   78:astore_2        
		if(arraylist != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          92
			apsvastadbreak1.prefferedVideoMimeTypes.addAll(((Collection) (arraylist)));
	//   41   83:aload_1         
	//   42   84:getfield        #182 <Field ArrayList prefferedVideoMimeTypes>
	//   43   87:aload_2         
	//   44   88:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//   45   91:pop             
		apsvastadbreak1.controlsDisplayForAds = apsvastadbreak.controlsDisplayForAds;
	//   46   92:aload_1         
	//   47   93:aload_0         
	//   48   94:getfield        #193 <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplayForAds>
	//   49   97:putfield        #193 <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplayForAds>
		apsvastadbreak1.controlsParametersForAds = apsvastadbreak.controlsParametersForAds;
	//   50  100:aload_1         
	//   51  101:aload_0         
	//   52  102:getfield        #346 <Field HashMap controlsParametersForAds>
	//   53  105:putfield        #346 <Field HashMap controlsParametersForAds>
		apsvastadbreak1.multipleAdsConflictsPolicy = apsvastadbreak.multipleAdsConflictsPolicy;
	//   54  108:aload_1         
	//   55  109:aload_0         
	//   56  110:getfield        #255 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy multipleAdsConflictsPolicy>
	//   57  113:putfield        #255 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy multipleAdsConflictsPolicy>
		apsvastadbreak1.countdownPosition = apsvastadbreak.countdownPosition;
	//   58  116:aload_1         
	//   59  117:aload_0         
	//   60  118:getfield        #205 <Field APSMediaOverlay$APSMediaOverlayPosition countdownPosition>
	//   61  121:putfield        #205 <Field APSMediaOverlay$APSMediaOverlayPosition countdownPosition>
		apsvastadbreak1.skipButtonPosition = apsvastadbreak.skipButtonPosition;
	//   62  124:aload_1         
	//   63  125:aload_0         
	//   64  126:getfield        #215 <Field APSMediaOverlay$APSMediaOverlayPosition skipButtonPosition>
	//   65  129:putfield        #215 <Field APSMediaOverlay$APSMediaOverlayPosition skipButtonPosition>
		apsvastadbreak1.nextMediaCountdownPosition = apsvastadbreak.nextMediaCountdownPosition;
	//   66  132:aload_1         
	//   67  133:aload_0         
	//   68  134:getfield        #354 <Field APSMediaOverlay$APSMediaOverlayPosition nextMediaCountdownPosition>
	//   69  137:putfield        #354 <Field APSMediaOverlay$APSMediaOverlayPosition nextMediaCountdownPosition>
		apsvastadbreak1.countdownWidth = apsvastadbreak.countdownWidth;
	//   70  140:aload_1         
	//   71  141:aload_0         
	//   72  142:getfield        #238 <Field String countdownWidth>
	//   73  145:putfield        #238 <Field String countdownWidth>
		apsvastadbreak1.countdownHeight = apsvastadbreak.countdownHeight;
	//   74  148:aload_1         
	//   75  149:aload_0         
	//   76  150:getfield        #240 <Field String countdownHeight>
	//   77  153:putfield        #240 <Field String countdownHeight>
		apsvastadbreak1.countdownText = apsvastadbreak.countdownText;
	//   78  156:aload_1         
	//   79  157:aload_0         
	//   80  158:getfield        #356 <Field String countdownText>
	//   81  161:putfield        #356 <Field String countdownText>
		apsvastadbreak1.countdownFont = apsvastadbreak.countdownFont;
	//   82  164:aload_1         
	//   83  165:aload_0         
	//   84  166:getfield        #358 <Field String countdownFont>
	//   85  169:putfield        #358 <Field String countdownFont>
		apsvastadbreak1.countdownSize = apsvastadbreak.countdownSize;
	//   86  172:aload_1         
	//   87  173:aload_0         
	//   88  174:getfield        #360 <Field String countdownSize>
	//   89  177:putfield        #360 <Field String countdownSize>
		apsvastadbreak1.countdownColor = apsvastadbreak.countdownColor;
	//   90  180:aload_1         
	//   91  181:aload_0         
	//   92  182:getfield        #362 <Field String countdownColor>
	//   93  185:putfield        #362 <Field String countdownColor>
		apsvastadbreak1.defaultSkipOffset = apsvastadbreak.defaultSkipOffset;
	//   94  188:aload_1         
	//   95  189:aload_0         
	//   96  190:getfield        #217 <Field int defaultSkipOffset>
	//   97  193:putfield        #217 <Field int defaultSkipOffset>
		apsvastadbreak1.skipButtonBorderRadius = apsvastadbreak.skipButtonBorderRadius;
	//   98  196:aload_1         
	//   99  197:aload_0         
	//  100  198:getfield        #184 <Field int skipButtonBorderRadius>
	//  101  201:putfield        #184 <Field int skipButtonBorderRadius>
		apsvastadbreak1.skipButtonText = apsvastadbreak.skipButtonText;
	//  102  204:aload_1         
	//  103  205:aload_0         
	//  104  206:getfield        #364 <Field String skipButtonText>
	//  105  209:putfield        #364 <Field String skipButtonText>
		apsvastadbreak1.skipButtonTextColor = apsvastadbreak.skipButtonTextColor;
	//  106  212:aload_1         
	//  107  213:aload_0         
	//  108  214:getfield        #366 <Field String skipButtonTextColor>
	//  109  217:putfield        #366 <Field String skipButtonTextColor>
		apsvastadbreak1.skipButtonBorderColor = apsvastadbreak.skipButtonBorderColor;
	//  110  220:aload_1         
	//  111  221:aload_0         
	//  112  222:getfield        #368 <Field String skipButtonBorderColor>
	//  113  225:putfield        #368 <Field String skipButtonBorderColor>
		apsvastadbreak1.skipButtonBackgroundColor = apsvastadbreak.skipButtonBackgroundColor;
	//  114  228:aload_1         
	//  115  229:aload_0         
	//  116  230:getfield        #370 <Field String skipButtonBackgroundColor>
	//  117  233:putfield        #370 <Field String skipButtonBackgroundColor>
		apsvastadbreak1.skipButtonWidth = apsvastadbreak.skipButtonWidth;
	//  118  236:aload_1         
	//  119  237:aload_0         
	//  120  238:getfield        #230 <Field String skipButtonWidth>
	//  121  241:putfield        #230 <Field String skipButtonWidth>
		apsvastadbreak1.skipButtonHeight = apsvastadbreak.skipButtonHeight;
	//  122  244:aload_1         
	//  123  245:aload_0         
	//  124  246:getfield        #234 <Field String skipButtonHeight>
	//  125  249:putfield        #234 <Field String skipButtonHeight>
		apsvastadbreak1.skipButtonProgressCircleColor = apsvastadbreak.skipButtonProgressCircleColor;
	//  126  252:aload_1         
	//  127  253:aload_0         
	//  128  254:getfield        #372 <Field String skipButtonProgressCircleColor>
	//  129  257:putfield        #372 <Field String skipButtonProgressCircleColor>
		apsvastadbreak1.skipButtonProgressCircleTextColor = apsvastadbreak.skipButtonProgressCircleTextColor;
	//  130  260:aload_1         
	//  131  261:aload_0         
	//  132  262:getfield        #374 <Field String skipButtonProgressCircleTextColor>
	//  133  265:putfield        #374 <Field String skipButtonProgressCircleTextColor>
		apsvastadbreak1.skipButtonProgressCircleTrackColor = apsvastadbreak.skipButtonProgressCircleTrackColor;
	//  134  268:aload_1         
	//  135  269:aload_0         
	//  136  270:getfield        #376 <Field String skipButtonProgressCircleTrackColor>
	//  137  273:putfield        #376 <Field String skipButtonProgressCircleTrackColor>
		apsvastadbreak1.skipButtonProgressPosition = apsvastadbreak.skipButtonProgressPosition;
	//  138  276:aload_1         
	//  139  277:aload_0         
	//  140  278:getfield        #224 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition skipButtonProgressPosition>
	//  141  281:putfield        #224 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition skipButtonProgressPosition>
		apsvastadbreak1.adPodFallbackStrategy = apsvastadbreak.adPodFallbackStrategy;
	//  142  284:aload_1         
	//  143  285:aload_0         
	//  144  286:getfield        #262 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback adPodFallbackStrategy>
	//  145  289:putfield        #262 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback adPodFallbackStrategy>
		apsvastadbreak1.defaultAdBreakPositions = new ArrayList();
	//  146  292:aload_1         
	//  147  293:new             #137 <Class ArrayList>
	//  148  296:dup             
	//  149  297:invokespecial   #138 <Method void ArrayList()>
	//  150  300:putfield        #384 <Field ArrayList defaultAdBreakPositions>
		arraylist = apsvastadbreak.defaultAdBreakPositions;
	//  151  303:aload_0         
	//  152  304:getfield        #384 <Field ArrayList defaultAdBreakPositions>
	//  153  307:astore_2        
		if(arraylist != null)
	//* 154  308:aload_2         
	//* 155  309:ifnull          321
			apsvastadbreak1.defaultAdBreakPositions.addAll(((Collection) (arraylist)));
	//  156  312:aload_1         
	//  157  313:getfield        #384 <Field ArrayList defaultAdBreakPositions>
	//  158  316:aload_2         
	//  159  317:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  160  320:pop             
		apsvastadbreak1.defaultBannerAdBreakDuration = apsvastadbreak.defaultBannerAdBreakDuration;
	//  161  321:aload_1         
	//  162  322:aload_0         
	//  163  323:getfield        #242 <Field int defaultBannerAdBreakDuration>
	//  164  326:putfield        #242 <Field int defaultBannerAdBreakDuration>
		apsvastadbreak1.bannerMaxSizeWidth = apsvastadbreak.bannerMaxSizeWidth;
	//  165  329:aload_1         
	//  166  330:aload_0         
	//  167  331:getfield        #244 <Field int bannerMaxSizeWidth>
	//  168  334:putfield        #244 <Field int bannerMaxSizeWidth>
		apsvastadbreak1.bannerMaxSizeHeight = apsvastadbreak.bannerMaxSizeHeight;
	//  169  337:aload_1         
	//  170  338:aload_0         
	//  171  339:getfield        #246 <Field int bannerMaxSizeHeight>
	//  172  342:putfield        #246 <Field int bannerMaxSizeHeight>
		apsvastadbreak1.defaultIconHeightPercentage = apsvastadbreak.defaultIconHeightPercentage;
	//  173  345:aload_1         
	//  174  346:aload_0         
	//  175  347:getfield        #196 <Field float defaultIconHeightPercentage>
	//  176  350:putfield        #196 <Field float defaultIconHeightPercentage>
		apsvastadbreak1.iconFadeInDuration = apsvastadbreak.iconFadeInDuration;
	//  177  353:aload_1         
	//  178  354:aload_0         
	//  179  355:getfield        #208 <Field float iconFadeInDuration>
	//  180  358:putfield        #208 <Field float iconFadeInDuration>
		apsvastadbreak1.bannerFadeInDuration = apsvastadbreak.bannerFadeInDuration;
	//  181  361:aload_1         
	//  182  362:aload_0         
	//  183  363:getfield        #210 <Field float bannerFadeInDuration>
	//  184  366:putfield        #210 <Field float bannerFadeInDuration>
		apsvastadbreak1.showCountdown = apsvastadbreak.showCountdown;
	//  185  369:aload_1         
	//  186  370:aload_0         
	//  187  371:getfield        #198 <Field boolean showCountdown>
	//  188  374:putfield        #198 <Field boolean showCountdown>
		apsvastadbreak1.stretchBannersToMaxSize = apsvastadbreak.stretchBannersToMaxSize;
	//  189  377:aload_1         
	//  190  378:aload_0         
	//  191  379:getfield        #248 <Field boolean stretchBannersToMaxSize>
	//  192  382:putfield        #248 <Field boolean stretchBannersToMaxSize>
		apsvastadbreak1.bannerSkipOffset = apsvastadbreak.bannerSkipOffset;
	//  193  385:aload_1         
	//  194  386:aload_0         
	//  195  387:getfield        #264 <Field int bannerSkipOffset>
	//  196  390:putfield        #264 <Field int bannerSkipOffset>
		apsvastadbreak1.skipButtonPadding = apsvastadbreak.skipButtonPadding;
	//  197  393:aload_1         
	//  198  394:aload_0         
	//  199  395:getfield        #226 <Field int skipButtonPadding>
	//  200  398:putfield        #226 <Field int skipButtonPadding>
		apsvastadbreak1.bannerPosition = apsvastadbreak.bannerPosition;
	//  201  401:aload_1         
	//  202  402:aload_0         
	//  203  403:getfield        #269 <Field APSMediaOverlay$APSMediaOverlayPosition bannerPosition>
	//  204  406:putfield        #269 <Field APSMediaOverlay$APSMediaOverlayPosition bannerPosition>
		apsvastadbreak1.showBannerCloseButton = apsvastadbreak.showBannerCloseButton;
	//  205  409:aload_1         
	//  206  410:aload_0         
	//  207  411:getfield        #271 <Field boolean showBannerCloseButton>
	//  208  414:putfield        #271 <Field boolean showBannerCloseButton>
		apsvastadbreak1.bannerCloseButtonImage = apsvastadbreak.bannerCloseButtonImage;
	//  209  417:aload_1         
	//  210  418:aload_0         
	//  211  419:getfield        #400 <Field Bitmap bannerCloseButtonImage>
	//  212  422:putfield        #400 <Field Bitmap bannerCloseButtonImage>
		apsvastadbreak1.bannerCloseButtonBackgroundColor = apsvastadbreak.bannerCloseButtonBackgroundColor;
	//  213  425:aload_1         
	//  214  426:aload_0         
	//  215  427:getfield        #402 <Field String bannerCloseButtonBackgroundColor>
	//  216  430:putfield        #402 <Field String bannerCloseButtonBackgroundColor>
		apsvastadbreak1.bannerCloseButtonXColor = apsvastadbreak.bannerCloseButtonXColor;
	//  217  433:aload_1         
	//  218  434:aload_0         
	//  219  435:getfield        #404 <Field String bannerCloseButtonXColor>
	//  220  438:putfield        #404 <Field String bannerCloseButtonXColor>
		apsvastadbreak1.bannerCloseButtonInitialAlpha = apsvastadbreak.bannerCloseButtonInitialAlpha;
	//  221  441:aload_1         
	//  222  442:aload_0         
	//  223  443:getfield        #273 <Field float bannerCloseButtonInitialAlpha>
	//  224  446:putfield        #273 <Field float bannerCloseButtonInitialAlpha>
		apsvastadbreak1.bannerCloseButtonFinalAlpha = apsvastadbreak.bannerCloseButtonFinalAlpha;
	//  225  449:aload_1         
	//  226  450:aload_0         
	//  227  451:getfield        #276 <Field float bannerCloseButtonFinalAlpha>
	//  228  454:putfield        #276 <Field float bannerCloseButtonFinalAlpha>
		apsvastadbreak1.bannerCloseButtonSize = apsvastadbreak.bannerCloseButtonSize;
	//  229  457:aload_1         
	//  230  458:aload_0         
	//  231  459:getfield        #278 <Field int bannerCloseButtonSize>
	//  232  462:putfield        #278 <Field int bannerCloseButtonSize>
		apsvastadbreak1.bannerCloseButtonOffsetX = apsvastadbreak.bannerCloseButtonOffsetX;
	//  233  465:aload_1         
	//  234  466:aload_0         
	//  235  467:getfield        #280 <Field int bannerCloseButtonOffsetX>
	//  236  470:putfield        #280 <Field int bannerCloseButtonOffsetX>
		apsvastadbreak1.bannerCloseButtonOffsetY = apsvastadbreak.bannerCloseButtonOffsetY;
	//  237  473:aload_1         
	//  238  474:aload_0         
	//  239  475:getfield        #282 <Field int bannerCloseButtonOffsetY>
	//  240  478:putfield        #282 <Field int bannerCloseButtonOffsetY>
		apsvastadbreak1.bannerCloseButtonProgressColor = apsvastadbreak.bannerCloseButtonProgressColor;
	//  241  481:aload_1         
	//  242  482:aload_0         
	//  243  483:getfield        #406 <Field String bannerCloseButtonProgressColor>
	//  244  486:putfield        #406 <Field String bannerCloseButtonProgressColor>
		apsvastadbreak1.bannerCloseButtonTrackColor = apsvastadbreak.bannerCloseButtonTrackColor;
	//  245  489:aload_1         
	//  246  490:aload_0         
	//  247  491:getfield        #408 <Field String bannerCloseButtonTrackColor>
	//  248  494:putfield        #408 <Field String bannerCloseButtonTrackColor>
		apsvastadbreak1.followWrappers = apsvastadbreak.followWrappers;
	//  249  497:aload_1         
	//  250  498:aload_0         
	//  251  499:getfield        #284 <Field boolean followWrappers>
	//  252  502:putfield        #284 <Field boolean followWrappers>
		apsvastadbreak1.allowMultipleAds = apsvastadbreak.allowMultipleAds;
	//  253  505:aload_1         
	//  254  506:aload_0         
	//  255  507:getfield        #410 <Field boolean allowMultipleAds>
	//  256  510:putfield        #410 <Field boolean allowMultipleAds>
		apsvastadbreak1.userAgent = apsvastadbreak.userAgent;
	//  257  513:aload_1         
	//  258  514:aload_0         
	//  259  515:getfield        #186 <Field String userAgent>
	//  260  518:putfield        #186 <Field String userAgent>
		apsvastadbreak1.debugMode = apsvastadbreak.debugMode;
	//  261  521:aload_1         
	//  262  522:aload_0         
	//  263  523:getfield        #412 <Field boolean debugMode>
	//  264  526:putfield        #412 <Field boolean debugMode>
		return apsvastadbreak1;
	//  265  529:aload_1         
	//  266  530:areturn         
	}

	public static ArrayList generateAdBreaks(ArrayList arraylist, APSVASTConfigurationOptions apsvastconfigurationoptions, APSVastAdBreak apsvastadbreak)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #137 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void ArrayList()>
	//    3    7:astore          4
		APSVastAdBreak apsvastadbreak1;
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext(); arraylist1.add(((Object) (apsvastadbreak1))))
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//*   6   13:astore_0        
	//*   7   14:aload_0         
	//*   8   15:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//*   9   20:ifeq            187
		{
			Object obj = ((Iterator) (arraylist)).next();
	//   10   23:aload_0         
	//   11   24:invokeinterface #437 <Method Object Iterator.next()>
	//   12   29:astore          6
			apsvastadbreak1 = copyAdBreak(apsvastadbreak);
	//   13   31:aload_2         
	//   14   32:invokestatic    #439 <Method APSVastAdBreak copyAdBreak(APSVastAdBreak)>
	//   15   35:astore          5
			obj = ((Object) ((LinkedTreeMap)obj));
	//   16   37:aload           6
	//   17   39:checkcast       #441 <Class LinkedTreeMap>
	//   18   42:astore          6
			if(((LinkedTreeMap) (obj)).get("metadata") != null)
	//*  19   44:aload           6
	//*  20   46:ldc2            #442 <String "metadata">
	//*  21   49:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//*  22   52:ifnull          78
				apsvastadbreak1.metadata = new HashMap(((Map) ((LinkedTreeMap)((LinkedTreeMap) (obj)).get("metadata"))));
	//   23   55:aload           5
	//   24   57:new             #332 <Class HashMap>
	//   25   60:dup             
	//   26   61:aload           6
	//   27   63:ldc2            #442 <String "metadata">
	//   28   66:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//   29   69:checkcast       #441 <Class LinkedTreeMap>
	//   30   72:invokespecial   #449 <Method void HashMap(Map)>
	//   31   75:putfield        #334 <Field HashMap metadata>
			apsvastadbreak1.sources.addAll(((Collection) ((ArrayList)((LinkedTreeMap) (obj)).get("urls"))));
	//   32   78:aload           5
	//   33   80:getfield        #140 <Field ArrayList sources>
	//   34   83:aload           6
	//   35   85:ldc2            #451 <String "urls">
	//   36   88:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//   37   91:checkcast       #137 <Class ArrayList>
	//   38   94:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//   39   97:pop             
			apsvastadbreak1.type = apsvastconfigurationoptions;
	//   40   98:aload           5
	//   41  100:aload_1         
	//   42  101:putfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
			if(apsvastconfigurationoptions != APSVASTConfigurationOptions.APSVASTPreContent && apsvastconfigurationoptions != APSVASTConfigurationOptions.APSVASTPostContent)
	//*  43  104:aload_1         
	//*  44  105:getstatic       #454 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
	//*  45  108:if_acmpeq       156
	//*  46  111:aload_1         
	//*  47  112:getstatic       #457 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPostContent>
	//*  48  115:if_acmpeq       156
			{
				String s = (String)((LinkedTreeMap) (obj)).get("offset");
	//   49  118:aload           6
	//   50  120:ldc2            #459 <String "offset">
	//   51  123:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//   52  126:checkcast       #155 <Class String>
	//   53  129:astore          7
				boolean flag;
				if(s == null)
	//*  54  131:aload           7
	//*  55  133:ifnonnull       141
					flag = true;
	//   56  136:iconst_1        
	//   57  137:istore_3        
				else
	//*  58  138:goto            143
					flag = false;
	//   59  141:iconst_0        
	//   60  142:istore_3        
				apsvastadbreak1.isDynamicAdBreak = flag;
	//   61  143:aload           5
	//   62  145:iload_3         
	//   63  146:putfield        #414 <Field boolean isDynamicAdBreak>
				apsvastadbreak1.adOffset = s;
	//   64  149:aload           5
	//   65  151:aload           7
	//   66  153:putfield        #326 <Field String adOffset>
			}
			apsvastadbreak1.allowMultipleAds = true;
	//   67  156:aload           5
	//   68  158:iconst_1        
	//   69  159:putfield        #410 <Field boolean allowMultipleAds>
			apsvastadbreak1.followWrappers = true;
	//   70  162:aload           5
	//   71  164:iconst_1        
	//   72  165:putfield        #284 <Field boolean followWrappers>
			apsvastadbreak1.configureFromDictionary(((Map) (obj)));
	//   73  168:aload           5
	//   74  170:aload           6
	//   75  172:invokevirtual   #463 <Method boolean configureFromDictionary(Map)>
	//   76  175:pop             
		}

	//   77  176:aload           4
	//   78  178:aload           5
	//   79  180:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//   80  183:pop             
	//*  81  184:goto            14
		return arraylist1;
	//   82  187:aload           4
	//   83  189:areturn         
	}

	public static ArrayList parseAdBreaksDictionary(LinkedTreeMap linkedtreemap, APSVastAdBreak apsvastadbreak)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #137 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void ArrayList()>
	//    3    7:astore          4
		linkedtreemap = ((LinkedTreeMap) (linkedtreemap.entrySet().iterator()));
	//    4    9:aload_0         
	//    5   10:invokevirtual   #475 <Method Set LinkedTreeMap.entrySet()>
	//    6   13:invokeinterface #478 <Method Iterator Set.iterator()>
	//    7   18:astore_0        
		do
			if(((Iterator) (linkedtreemap)).hasNext())
	//*   8   19:aload_0         
	//*   9   20:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//*  10   25:ifeq            287
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (linkedtreemap)).next();
	//   11   28:aload_0         
	//   12   29:invokeinterface #437 <Method Object Iterator.next()>
	//   13   34:checkcast       #480 <Class java.util.Map$Entry>
	//   14   37:astore          5
				String s = (String)entry.getKey();
	//   15   39:aload           5
	//   16   41:invokeinterface #483 <Method Object java.util.Map$Entry.getKey()>
	//   17   46:checkcast       #155 <Class String>
	//   18   49:astore          6
				byte byte0 = -1;
	//   19   51:iconst_m1       
	//   20   52:istore_2        
				int i = s.hashCode();
	//   21   53:aload           6
	//   22   55:invokevirtual   #486 <Method int String.hashCode()>
	//   23   58:istore_3        
				if(i != 0x33c0511)
	//*  24   59:iload_3         
	//*  25   60:ldc2            #487 <Int 0x33c0511>
	//*  26   63:icmpeq          135
				{
					if(i != 0x51bff261)
	//*  27   66:iload_3         
	//*  28   67:ldc2            #488 <Int 0x51bff261>
	//*  29   70:icmpeq          120
					{
						if(i != 0x589c3fb9)
	//*  30   73:iload_3         
	//*  31   74:ldc2            #489 <Int 0x589c3fb9>
	//*  32   77:icmpeq          105
						{
							if(i == 0x7e616c56 && s.equals("preContent"))
	//*  33   80:iload_3         
	//*  34   81:ldc2            #490 <Int 0x7e616c56>
	//*  35   84:icmpeq          90
	//*  36   87:goto            147
	//*  37   90:aload           6
	//*  38   92:ldc1            #36  <String "preContent">
	//*  39   94:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  40   97:ifeq            147
								byte0 = 0;
	//   41  100:iconst_0        
	//   42  101:istore_2        
						} else
	//*  43  102:goto            147
						if(s.equals("postContent"))
	//*  44  105:aload           6
	//*  45  107:ldc1            #33  <String "postContent">
	//*  46  109:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  47  112:ifeq            147
							byte0 = 2;
	//   48  115:iconst_2        
	//   49  116:istore_2        
					} else
	//*  50  117:goto            147
					if(s.equals("nonLinears"))
	//*  51  120:aload           6
	//*  52  122:ldc1            #30  <String "nonLinears">
	//*  53  124:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  54  127:ifeq            147
						byte0 = 3;
	//   55  130:iconst_3        
	//   56  131:istore_2        
				} else
	//*  57  132:goto            147
				if(s.equals("midContent"))
	//*  58  135:aload           6
	//*  59  137:ldc1            #27  <String "midContent">
	//*  60  139:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  61  142:ifeq            147
					byte0 = 1;
	//   62  145:iconst_1        
	//   63  146:istore_2        
				switch(byte0)
	//*  64  147:iload_2         
				{
	//*  65  148:tableswitch     0 3: default 180
	//	               0 261
	//	               1 235
	//	               2 209
	//	               3 183
	//*  66  180:goto            19
				case 3: // '\003'
					arraylist.addAll(((Collection) (generateAdBreaks((ArrayList)entry.getValue(), APSVASTConfigurationOptions.APSVASTNonLinear, apsvastadbreak))));
	//   67  183:aload           4
	//   68  185:aload           5
	//   69  187:invokeinterface #496 <Method Object java.util.Map$Entry.getValue()>
	//   70  192:checkcast       #137 <Class ArrayList>
	//   71  195:getstatic       #499 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTNonLinear>
	//   72  198:aload_1         
	//   73  199:invokestatic    #501 <Method ArrayList generateAdBreaks(ArrayList, APSVastAdBreak$APSVASTConfigurationOptions, APSVastAdBreak)>
	//   74  202:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//   75  205:pop             
					break;

	//*  76  206:goto            19
				case 2: // '\002'
					arraylist.addAll(((Collection) (generateAdBreaks((ArrayList)entry.getValue(), APSVASTConfigurationOptions.APSVASTPostContent, apsvastadbreak))));
	//   77  209:aload           4
	//   78  211:aload           5
	//   79  213:invokeinterface #496 <Method Object java.util.Map$Entry.getValue()>
	//   80  218:checkcast       #137 <Class ArrayList>
	//   81  221:getstatic       #457 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPostContent>
	//   82  224:aload_1         
	//   83  225:invokestatic    #501 <Method ArrayList generateAdBreaks(ArrayList, APSVastAdBreak$APSVASTConfigurationOptions, APSVastAdBreak)>
	//   84  228:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//   85  231:pop             
					break;

	//*  86  232:goto            19
				case 1: // '\001'
					arraylist.addAll(((Collection) (generateAdBreaks((ArrayList)entry.getValue(), APSVASTConfigurationOptions.APSVASTMidContent, apsvastadbreak))));
	//   87  235:aload           4
	//   88  237:aload           5
	//   89  239:invokeinterface #496 <Method Object java.util.Map$Entry.getValue()>
	//   90  244:checkcast       #137 <Class ArrayList>
	//   91  247:getstatic       #504 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTMidContent>
	//   92  250:aload_1         
	//   93  251:invokestatic    #501 <Method ArrayList generateAdBreaks(ArrayList, APSVastAdBreak$APSVASTConfigurationOptions, APSVastAdBreak)>
	//   94  254:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//   95  257:pop             
					break;

	//*  96  258:goto            19
				case 0: // '\0'
					arraylist.addAll(((Collection) (generateAdBreaks((ArrayList)entry.getValue(), APSVASTConfigurationOptions.APSVASTPreContent, apsvastadbreak))));
	//   97  261:aload           4
	//   98  263:aload           5
	//   99  265:invokeinterface #496 <Method Object java.util.Map$Entry.getValue()>
	//  100  270:checkcast       #137 <Class ArrayList>
	//  101  273:getstatic       #454 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
	//  102  276:aload_1         
	//  103  277:invokestatic    #501 <Method ArrayList generateAdBreaks(ArrayList, APSVastAdBreak$APSVASTConfigurationOptions, APSVastAdBreak)>
	//  104  280:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  105  283:pop             
					break;
				}
			} else
	//* 106  284:goto            19
			{
				return arraylist;
	//  107  287:aload           4
	//  108  289:areturn         
			}
		while(true);
	}

	public void adBreakTrackErrorWithCodeEvent(APSVASTXMLNode apsvastxmlnode, int i, String s)
	{
		if(apsvastxmlnode.firstChildNamed("TrackingEvents") != null)
	//*   0    0:aload_1         
	//*   1    1:ldc2            #509 <String "TrackingEvents">
	//*   2    4:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//*   3    7:ifnull          123
		{
			apsvastxmlnode = ((APSVASTXMLNode) (apsvastxmlnode.firstChildNamed("TrackingEvents").childrenNamed("Tracking").iterator()));
	//    4   10:aload_1         
	//    5   11:ldc2            #509 <String "TrackingEvents">
	//    6   14:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//    7   17:ldc2            #517 <String "Tracking">
	//    8   20:invokevirtual   #521 <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//    9   23:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//   10   26:astore_1        
			do
			{
				if(!((Iterator) (apsvastxmlnode)).hasNext())
					break;
	//   11   27:aload_1         
	//   12   28:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            123
				APSVASTXMLNode apsvastxmlnode1 = (APSVASTXMLNode)((Iterator) (apsvastxmlnode)).next();
	//   14   36:aload_1         
	//   15   37:invokeinterface #437 <Method Object Iterator.next()>
	//   16   42:checkcast       #511 <Class APSVASTXMLNode>
	//   17   45:astore          4
				if(apsvastxmlnode1.attributes.get("event") != null && ((String)apsvastxmlnode1.attributes.get("event")).equals("error"))
	//*  18   47:aload           4
	//*  19   49:getfield        #524 <Field HashMap APSVASTXMLNode.attributes>
	//*  20   52:ldc2            #526 <String "event">
	//*  21   55:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//*  22   58:ifnull          27
	//*  23   61:aload           4
	//*  24   63:getfield        #524 <Field HashMap APSVASTXMLNode.attributes>
	//*  25   66:ldc2            #526 <String "event">
	//*  26   69:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//*  27   72:checkcast       #155 <Class String>
	//*  28   75:ldc2            #529 <String "error">
	//*  29   78:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  30   81:ifeq            27
					APSMediaPlayer.getInstance().trackforEvent(new ArrayList(((Collection) (Collections.singletonList(((Object) (apsvastxmlnode1.value.replace("[ERROR_CODE]", ((CharSequence) (String.valueOf(i)))))))))), s, com.appscend.media.APSMediaTrackingEvents.MediaEventType.ERROR, ((APSMediaEvent) (this)));
	//   31   84:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   32   87:new             #137 <Class ArrayList>
	//   33   90:dup             
	//   34   91:aload           4
	//   35   93:getfield        #538 <Field String APSVASTXMLNode.value>
	//   36   96:ldc2            #540 <String "[ERROR_CODE]">
	//   37   99:iload_2         
	//   38  100:invokestatic    #544 <Method String String.valueOf(int)>
	//   39  103:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//   40  106:invokestatic    #554 <Method List Collections.singletonList(Object)>
	//   41  109:invokespecial   #180 <Method void ArrayList(Collection)>
	//   42  112:aload_3         
	//   43  113:getstatic       #560 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.ERROR>
	//   44  116:aload_0         
	//   45  117:invokevirtual   #564 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			} while(true);
	//   46  120:goto            27
		}
	//   47  123:return          
	}

	public void addSource(APSVASTXMLNode apsvastxmlnode)
	{
		sources.add(((Object) (apsvastxmlnode)));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList sources>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addSource(String s)
	{
		sources.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList sources>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public HashMap adsForDatawithWrappers(String s, ArrayList arraylist, int i, String s1)
	{
		try
		{
			s = ((String) ((new SAXBuilder()).build(((java.io.Reader) (new StringReader(s))))));
	//    0    0:new             #575 <Class SAXBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #576 <Method void SAXBuilder()>
	//    3    7:new             #578 <Class StringReader>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #580 <Method void StringReader(String)>
	//    7   15:invokevirtual   #584 <Method Document SAXBuilder.build(java.io.Reader)>
	//    8   18:astore_1        
		}
	//*   9   19:goto            24
	//*  10   22:aconst_null     
	//*  11   23:astore_1        
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       36
	//*  14   28:new             #332 <Class HashMap>
	//*  15   31:dup             
	//*  16   32:invokespecial   #585 <Method void HashMap()>
	//*  17   35:areturn         
	//*  18   36:aload_1         
	//*  19   37:invokevirtual   #591 <Method org.jdom2.Element Document.getRootElement()>
	//*  20   40:astore_1        
	//*  21   41:aload_1         
	//*  22   42:ifnonnull       53
	//*  23   45:new             #332 <Class HashMap>
	//*  24   48:dup             
	//*  25   49:invokespecial   #585 <Method void HashMap()>
	//*  26   52:areturn         
	//*  27   53:new             #593 <Class APSVASTRootNode>
	//*  28   56:dup             
	//*  29   57:invokespecial   #594 <Method void APSVASTRootNode()>
	//*  30   60:astore          5
	//*  31   62:aload           5
	//*  32   64:aload_1         
	//*  33   65:invokevirtual   #598 <Method void APSVASTRootNode.initWithTBXMLElement(org.jdom2.Element)>
	//*  34   68:aload           5
	//*  35   70:invokevirtual   #601 <Method ArrayList APSVASTRootNode.childrenNames()>
	//*  36   73:invokevirtual   #604 <Method int ArrayList.size()>
	//*  37   76:ifeq            103
	//*  38   79:aload           5
	//*  39   81:ldc2            #606 <String "head">
	//*  40   84:invokevirtual   #607 <Method APSVASTXMLNode APSVASTRootNode.firstChildNamed(String)>
	//*  41   87:ifnull          92
	//*  42   90:aconst_null     
	//*  43   91:areturn         
	//*  44   92:aload_0         
	//*  45   93:aload           5
	//*  46   95:aload_2         
	//*  47   96:iload_3         
	//*  48   97:aload           4
	//*  49   99:invokevirtual   #611 <Method HashMap adsForRootWithWrappers(APSVASTRootNode, ArrayList, int, String)>
	//*  50  102:areturn         
	//*  51  103:aconst_null     
	//*  52  104:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			s = null;
		}
		if(s == null)
			return new HashMap();
		s = ((String) (((Document) (s)).getRootElement()));
		if(s == null)
			return new HashMap();
		APSVASTRootNode apsvastrootnode = new APSVASTRootNode();
		apsvastrootnode.initWithTBXMLElement(((org.jdom2.Element) (s)));
		if(apsvastrootnode.childrenNames().size() != 0)
		{
			if(apsvastrootnode.firstChildNamed("head") != null)
				return null;
			else
				return adsForRootWithWrappers(apsvastrootnode, arraylist, i, s1);
		} else
		{
			return null;
		}
	//*  53  105:astore_1        
	//*  54  106:goto            22
	}

	public HashMap adsForRootWithWrappers(APSVASTRootNode apsvastrootnode, ArrayList arraylist, int i, String s)
	{
		Object obj = ((Object) (apsvastrootnode.allAds()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #615 <Method ArrayList APSVASTRootNode.allAds()>
	//    2    4:astore          7
		ArrayList arraylist1 = apsvastrootnode.getAdsWithFallback(adPodFallbackStrategy);
	//    3    6:aload_1         
	//    4    7:aload_0         
	//    5    8:getfield        #262 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback adPodFallbackStrategy>
	//    6   11:invokevirtual   #619 <Method ArrayList APSVASTRootNode.getAdsWithFallback(com.appscend.vast.APSVASTRootNode$APSAdPodFallback)>
	//    7   14:astore          5
		(new ArrayList(((Collection) (obj)))).removeAll(((Collection) (arraylist1)));
	//    8   16:new             #137 <Class ArrayList>
	//    9   19:dup             
	//   10   20:aload           7
	//   11   22:invokespecial   #180 <Method void ArrayList(Collection)>
	//   12   25:aload           5
	//   13   27:invokevirtual   #622 <Method boolean ArrayList.removeAll(Collection)>
	//   14   30:pop             
		HashMap hashmap = new HashMap();
	//   15   31:new             #332 <Class HashMap>
	//   16   34:dup             
	//   17   35:invokespecial   #585 <Method void HashMap()>
	//   18   38:astore          6
		if(arraylist1.size() == 0)
	//*  19   40:aload           5
	//*  20   42:invokevirtual   #604 <Method int ArrayList.size()>
	//*  21   45:ifne            71
		{
			hashmap.put("pod", ((Object) (null)));
	//   22   48:aload           6
	//   23   50:ldc2            #624 <String "pod">
	//   24   53:aconst_null     
	//   25   54:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//   26   57:pop             
			hashmap.put("buffet", ((Object) (null)));
	//   27   58:aload           6
	//   28   60:ldc2            #629 <String "buffet">
	//   29   63:aconst_null     
	//   30   64:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//   31   67:pop             
			return hashmap;
	//   32   68:aload           6
	//   33   70:areturn         
		}
		hashmap.put("pod", ((Object) (new ArrayList())));
	//   34   71:aload           6
	//   35   73:ldc2            #624 <String "pod">
	//   36   76:new             #137 <Class ArrayList>
	//   37   79:dup             
	//   38   80:invokespecial   #138 <Method void ArrayList()>
	//   39   83:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//   40   86:pop             
		hashmap.put("buffet", ((Object) (new ArrayList())));
	//   41   87:aload           6
	//   42   89:ldc2            #629 <String "buffet">
	//   43   92:new             #137 <Class ArrayList>
	//   44   95:dup             
	//   45   96:invokespecial   #138 <Method void ArrayList()>
	//   46   99:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//   47  102:pop             
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   48  103:aload           7
	//   49  105:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//   50  108:astore          7
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   51  110:aload           7
	//   52  112:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//   53  117:ifeq            449
			Object obj1 = ((Object) ((APSVASTAdNode)((Iterator) (obj)).next()));
	//   54  120:aload           7
	//   55  122:invokeinterface #437 <Method Object Iterator.next()>
	//   56  127:checkcast       #631 <Class APSVASTAdNode>
	//   57  130:astore          8
			if(((APSVASTAdNode) (obj1)).getInline() != null)
	//*  58  132:aload           8
	//*  59  134:invokevirtual   #635 <Method APSVASTInLineNode APSVASTAdNode.getInline()>
	//*  60  137:ifnull          283
			{
				APSVASTInLineNode apsvastinlinenode = ((APSVASTAdNode) (obj1)).getInline();
	//   61  140:aload           8
	//   62  142:invokevirtual   #635 <Method APSVASTInLineNode APSVASTAdNode.getInline()>
	//   63  145:astore          9
				apsvastinlinenode.sourceIndex = i;
	//   64  147:aload           9
	//   65  149:iload_3         
	//   66  150:putfield        #638 <Field int APSVASTInLineNode.sourceIndex>
				apsvastinlinenode.sourceUrl = s;
	//   67  153:aload           9
	//   68  155:aload           4
	//   69  157:putfield        #641 <Field String APSVASTInLineNode.sourceUrl>
				apsvastinlinenode.adId = (String)((APSVASTAdNode) (obj1)).attributes.get("id");
	//   70  160:aload           9
	//   71  162:aload           8
	//   72  164:getfield        #642 <Field HashMap APSVASTAdNode.attributes>
	//   73  167:ldc2            #644 <String "id">
	//   74  170:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//   75  173:checkcast       #155 <Class String>
	//   76  176:putfield        #647 <Field String APSVASTInLineNode.adId>
				if(apsvastinlinenode.adId == null)
	//*  77  179:aload           9
	//*  78  181:getfield        #647 <Field String APSVASTInLineNode.adId>
	//*  79  184:ifnonnull       195
					apsvastinlinenode.adId = "";
	//   80  187:aload           9
	//   81  189:ldc2            #649 <String "">
	//   82  192:putfield        #647 <Field String APSVASTInLineNode.adId>
				if(arraylist != null)
	//*  83  195:aload_2         
	//*  84  196:ifnull          233
				{
					for(Iterator iterator = arraylist.iterator(); iterator.hasNext(); apsvastinlinenode.aggregateWithWrapper((APSVASTWrapperNode)iterator.next()));
	//   85  199:aload_2         
	//   86  200:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//   87  203:astore          10
	//   88  205:aload           10
	//   89  207:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//   90  212:ifeq            233
	//   91  215:aload           9
	//   92  217:aload           10
	//   93  219:invokeinterface #437 <Method Object Iterator.next()>
	//   94  224:checkcast       #651 <Class APSVASTWrapperNode>
	//   95  227:invokevirtual   #655 <Method void APSVASTInLineNode.aggregateWithWrapper(APSVASTWrapperNode)>
				}
	//*  96  230:goto            205
				if(arraylist1.contains(obj1))
	//*  97  233:aload           5
	//*  98  235:aload           8
	//*  99  237:invokevirtual   #658 <Method boolean ArrayList.contains(Object)>
	//* 100  240:ifeq            263
					((ArrayList)hashmap.get("pod")).add(((Object) (apsvastinlinenode)));
	//  101  243:aload           6
	//  102  245:ldc2            #624 <String "pod">
	//  103  248:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  104  251:checkcast       #137 <Class ArrayList>
	//  105  254:aload           9
	//  106  256:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//  107  259:pop             
				else
	//* 108  260:goto            110
					((ArrayList)hashmap.get("buffet")).add(((Object) (apsvastinlinenode)));
	//  109  263:aload           6
	//  110  265:ldc2            #629 <String "buffet">
	//  111  268:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  112  271:checkcast       #137 <Class ArrayList>
	//  113  274:aload           9
	//  114  276:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//  115  279:pop             
			} else
	//* 116  280:goto            110
			if(((APSVASTAdNode) (obj1)).getWrapper() != null && arraylist != null)
	//* 117  283:aload           8
	//* 118  285:invokevirtual   #662 <Method APSVASTWrapperNode APSVASTAdNode.getWrapper()>
	//* 119  288:ifnull          415
	//* 120  291:aload_2         
	//* 121  292:ifnull          415
			{
				ArrayList arraylist2 = new ArrayList(((Collection) (arraylist)));
	//  122  295:new             #137 <Class ArrayList>
	//  123  298:dup             
	//  124  299:aload_2         
	//  125  300:invokespecial   #180 <Method void ArrayList(Collection)>
	//  126  303:astore          9
				arraylist2.add(((Object) (((APSVASTAdNode) (obj1)).getWrapper())));
	//  127  305:aload           9
	//  128  307:aload           8
	//  129  309:invokevirtual   #662 <Method APSVASTWrapperNode APSVASTAdNode.getWrapper()>
	//  130  312:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//  131  315:pop             
				obj1 = ((Object) (adsForURLWithWrappers(((APSVASTAdNode) (obj1)).getWrapper().nextURL(), arraylist2, i)));
	//  132  316:aload_0         
	//  133  317:aload           8
	//  134  319:invokevirtual   #662 <Method APSVASTWrapperNode APSVASTAdNode.getWrapper()>
	//  135  322:invokevirtual   #665 <Method String APSVASTWrapperNode.nextURL()>
	//  136  325:aload           9
	//  137  327:iload_3         
	//  138  328:invokevirtual   #669 <Method HashMap adsForURLWithWrappers(String, ArrayList, int)>
	//  139  331:astore          8
				if(obj1 != null)
	//* 140  333:aload           8
	//* 141  335:ifnull          110
				{
					if(((HashMap) (obj1)).get("pod") != null)
	//* 142  338:aload           8
	//* 143  340:ldc2            #624 <String "pod">
	//* 144  343:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 145  346:ifnull          375
						((ArrayList)hashmap.get("pod")).addAll((Collection)((HashMap) (obj1)).get("pod"));
	//  146  349:aload           6
	//  147  351:ldc2            #624 <String "pod">
	//  148  354:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  149  357:checkcast       #137 <Class ArrayList>
	//  150  360:aload           8
	//  151  362:ldc2            #624 <String "pod">
	//  152  365:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  153  368:checkcast       #671 <Class Collection>
	//  154  371:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  155  374:pop             
					if(((HashMap) (obj1)).get("buffet") != null)
	//* 156  375:aload           8
	//* 157  377:ldc2            #629 <String "buffet">
	//* 158  380:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 159  383:ifnull          110
						((ArrayList)hashmap.get("buffet")).addAll((Collection)((HashMap) (obj1)).get("buffet"));
	//  160  386:aload           6
	//  161  388:ldc2            #629 <String "buffet">
	//  162  391:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  163  394:checkcast       #137 <Class ArrayList>
	//  164  397:aload           8
	//  165  399:ldc2            #629 <String "buffet">
	//  166  402:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  167  405:checkcast       #671 <Class Collection>
	//  168  408:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  169  411:pop             
				}
			} else
	//* 170  412:goto            110
			if(apsvastrootnode.firstChildNamed("Error") != null)
	//* 171  415:aload_1         
	//* 172  416:ldc2            #673 <String "Error">
	//* 173  419:invokevirtual   #607 <Method APSVASTXMLNode APSVASTRootNode.firstChildNamed(String)>
	//* 174  422:ifnull          110
				APSMediaPlayer.getInstance().trackforEvent(((APSVASTAdNode) (obj1)).urlsForChildrenNamed("Error"), "No ad available", com.appscend.media.APSMediaTrackingEvents.MediaEventType.ERROR, ((APSMediaEvent) (this)));
	//  175  425:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  176  428:aload           8
	//  177  430:ldc2            #673 <String "Error">
	//  178  433:invokevirtual   #676 <Method ArrayList APSVASTAdNode.urlsForChildrenNamed(String)>
	//  179  436:ldc2            #678 <String "No ad available">
	//  180  439:getstatic       #560 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.ERROR>
	//  181  442:aload_0         
	//  182  443:invokevirtual   #564 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
		} while(true);
	//  183  446:goto            110
		return hashmap;
	//  184  449:aload           6
	//  185  451:areturn         
	}

	public HashMap adsForSourceFollowWrappersAllowMultipleAds(APSVASTXMLNode apsvastxmlnode, boolean flag, boolean flag1, int i)
	{
		HashMap hashmap1 = new HashMap();
	//    0    0:new             #332 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #585 <Method void HashMap()>
	//    3    7:astore          9
		if(apsvastxmlnode != null)
	//*   4    9:aload_1         
	//*   5   10:ifnull          574
		{
			Object obj;
			if(flag)
	//*   6   13:iload_2         
	//*   7   14:ifeq            29
				obj = ((Object) (new ArrayList()));
	//    8   17:new             #137 <Class ArrayList>
	//    9   20:dup             
	//   10   21:invokespecial   #138 <Method void ArrayList()>
	//   11   24:astore          5
			else
	//*  12   26:goto            32
				obj = null;
	//   13   29:aconst_null     
	//   14   30:astore          5
			Object obj1;
			if(apsvastxmlnode.firstChildNamed("VASTData") != null)
	//*  15   32:aload_1         
	//*  16   33:ldc2            #683 <String "VASTData">
	//*  17   36:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//*  18   39:ifnull          141
			{
				APSVASTRootNode apsvastrootnode = new APSVASTRootNode();
	//   19   42:new             #593 <Class APSVASTRootNode>
	//   20   45:dup             
	//   21   46:invokespecial   #594 <Method void APSVASTRootNode()>
	//   22   49:astore          8
				APSVASTXMLNode apsvastxmlnode1 = apsvastxmlnode.firstChildNamed("VASTData").firstChildNamed("VAST");
	//   23   51:aload_1         
	//   24   52:ldc2            #683 <String "VASTData">
	//   25   55:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//   26   58:ldc2            #685 <String "VAST">
	//   27   61:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//   28   64:astore          7
				obj1 = ((Object) (apsvastxmlnode1));
	//   29   66:aload           7
	//   30   68:astore          6
				if(apsvastxmlnode1 == null)
	//*  31   70:aload           7
	//*  32   72:ifnonnull       90
					obj1 = ((Object) (apsvastxmlnode.firstChildNamed("VASTData").firstChildNamed("VideoAdServingTemplate")));
	//   33   75:aload_1         
	//   34   76:ldc2            #683 <String "VASTData">
	//   35   79:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//   36   82:ldc2            #687 <String "VideoAdServingTemplate">
	//   37   85:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//   38   88:astore          6
				apsvastrootnode.initWithNode(((APSVASTXMLNode) (obj1)));
	//   39   90:aload           8
	//   40   92:aload           6
	//   41   94:invokevirtual   #690 <Method void APSVASTRootNode.initWithNode(APSVASTXMLNode)>
				obj = ((Object) (adsForRootWithWrappers(apsvastrootnode, ((ArrayList) (obj)), i, ((String) (null)))));
	//   42   97:aload_0         
	//   43   98:aload           8
	//   44  100:aload           5
	//   45  102:iload           4
	//   46  104:aconst_null     
	//   47  105:invokevirtual   #611 <Method HashMap adsForRootWithWrappers(APSVASTRootNode, ArrayList, int, String)>
	//   48  108:astore          5
				apsvastxmlnode = ((APSVASTXMLNode) ((ArrayList)((HashMap) (obj)).get("pod")));
	//   49  110:aload           5
	//   50  112:ldc2            #624 <String "pod">
	//   51  115:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//   52  118:checkcast       #137 <Class ArrayList>
	//   53  121:astore_1        
				obj = ((Object) ((ArrayList)((HashMap) (obj)).get("buffet")));
	//   54  122:aload           5
	//   55  124:ldc2            #629 <String "buffet">
	//   56  127:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//   57  130:checkcast       #137 <Class ArrayList>
	//   58  133:astore          5
				obj1 = null;
	//   59  135:aconst_null     
	//   60  136:astore          6
			} else
	//*  61  138:goto            297
			if(apsvastxmlnode.firstChildNamed("AdTagURI") != null)
	//*  62  141:aload_1         
	//*  63  142:ldc2            #692 <String "AdTagURI">
	//*  64  145:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//*  65  148:ifnull          287
			{
				ArrayList arraylist1 = new ArrayList();
	//   66  151:new             #137 <Class ArrayList>
	//   67  154:dup             
	//   68  155:invokespecial   #138 <Method void ArrayList()>
	//   69  158:astore          7
				obj1 = ((Object) (new ArrayList()));
	//   70  160:new             #137 <Class ArrayList>
	//   71  163:dup             
	//   72  164:invokespecial   #138 <Method void ArrayList()>
	//   73  167:astore          6
				apsvastxmlnode = ((APSVASTXMLNode) (apsvastxmlnode.childrenNamed("AdTagURI").iterator()));
	//   74  169:aload_1         
	//   75  170:ldc2            #692 <String "AdTagURI">
	//   76  173:invokevirtual   #521 <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//   77  176:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//   78  179:astore_1        
				do
				{
					if(!((Iterator) (apsvastxmlnode)).hasNext())
						break;
	//   79  180:aload_1         
	//   80  181:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//   81  186:ifeq            270
					HashMap hashmap = adsForURLWithWrappers(((APSVASTXMLNode)((Iterator) (apsvastxmlnode)).next()).value, ((ArrayList) (obj)), i);
	//   82  189:aload_0         
	//   83  190:aload_1         
	//   84  191:invokeinterface #437 <Method Object Iterator.next()>
	//   85  196:checkcast       #511 <Class APSVASTXMLNode>
	//   86  199:getfield        #538 <Field String APSVASTXMLNode.value>
	//   87  202:aload           5
	//   88  204:iload           4
	//   89  206:invokevirtual   #669 <Method HashMap adsForURLWithWrappers(String, ArrayList, int)>
	//   90  209:astore          8
					if(hashmap.get("pod") != null)
	//*  91  211:aload           8
	//*  92  213:ldc2            #624 <String "pod">
	//*  93  216:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//*  94  219:ifnull          239
						arraylist1.addAll((Collection)hashmap.get("pod"));
	//   95  222:aload           7
	//   96  224:aload           8
	//   97  226:ldc2            #624 <String "pod">
	//   98  229:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//   99  232:checkcast       #671 <Class Collection>
	//  100  235:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  101  238:pop             
					if(hashmap.get("buffet") != null)
	//* 102  239:aload           8
	//* 103  241:ldc2            #629 <String "buffet">
	//* 104  244:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 105  247:ifnull          180
						((ArrayList) (obj1)).addAll((Collection)hashmap.get("buffet"));
	//  106  250:aload           6
	//  107  252:aload           8
	//  108  254:ldc2            #629 <String "buffet">
	//  109  257:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  110  260:checkcast       #671 <Class Collection>
	//  111  263:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  112  266:pop             
				} while(true);
	//  113  267:goto            180
				Object obj2 = null;
	//  114  270:aconst_null     
	//  115  271:astore          8
				apsvastxmlnode = ((APSVASTXMLNode) (arraylist1));
	//  116  273:aload           7
	//  117  275:astore_1        
				obj = obj1;
	//  118  276:aload           6
	//  119  278:astore          5
				obj1 = ((Object) (obj2));
	//  120  280:aload           8
	//  121  282:astore          6
			} else
	//* 122  284:goto            297
			{
				obj1 = "1000";
	//  123  287:ldc2            #694 <String "1000">
	//  124  290:astore          6
				apsvastxmlnode = null;
	//  125  292:aconst_null     
	//  126  293:astore_1        
				obj = ((Object) (apsvastxmlnode));
	//  127  294:aload_1         
	//  128  295:astore          5
			}
			if(obj1 != null)
	//* 129  297:aload           6
	//* 130  299:ifnull          346
			{
				ArrayList arraylist2 = new ArrayList();
	//  131  302:new             #137 <Class ArrayList>
	//  132  305:dup             
	//  133  306:invokespecial   #138 <Method void ArrayList()>
	//  134  309:astore          7
				APSVASTInLineNode apsvastinlinenode = new APSVASTInLineNode();
	//  135  311:new             #289 <Class APSVASTInLineNode>
	//  136  314:dup             
	//  137  315:invokespecial   #695 <Method void APSVASTInLineNode()>
	//  138  318:astore          8
				apsvastinlinenode.value = ((String) (obj1));
	//  139  320:aload           8
	//  140  322:aload           6
	//  141  324:putfield        #696 <Field String APSVASTInLineNode.value>
				arraylist2.add(((Object) (apsvastinlinenode)));
	//  142  327:aload           7
	//  143  329:aload           8
	//  144  331:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//  145  334:pop             
				hashmap1.put("error", ((Object) (arraylist2)));
	//  146  335:aload           9
	//  147  337:ldc2            #529 <String "error">
	//  148  340:aload           7
	//  149  342:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  150  345:pop             
			}
			if(apsvastxmlnode != null)
	//* 151  346:aload_1         
	//* 152  347:ifnull          574
			{
				static class _cls2
				{

					static final int $SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy[];

					static 
					{
						$SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy = new int[com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy.values().length];
					//    0    0:invokestatic    #18  <Method com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy[] com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
						try
						{
							$SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy[com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsByDropping.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
					//    5   12:getstatic       #24  <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsByDropping>
					//    6   15:invokevirtual   #28  <Method int com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
					//*  10   23:getstatic       #31  <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingFirst>
					//*  11   26:invokevirtual   #28  <Method int com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
					//*  15   34:getstatic       #34  <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingRandom>
					//*  16   37:invokevirtual   #28  <Method int com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   20   43:astore_0        
						try
						{
							$SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy[com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingFirst.ordinal()] = 2;
						}
					//*  21   44:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   22   47:astore_0        
						try
						{
							$SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy[com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingRandom.ordinal()] = 3;
						}
					//*  23   48:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   24   51:astore_0        
					//*  25   52:return          
					}
				}

				if(!flag1 && ((ArrayList) (apsvastxmlnode)).size() > 1)
	//* 153  350:iload_3         
	//* 154  351:ifne            457
	//* 155  354:aload_1         
	//* 156  355:invokevirtual   #604 <Method int ArrayList.size()>
	//* 157  358:iconst_1        
	//* 158  359:icmple          457
					switch(_cls2..SwitchMap.com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy[multipleAdsConflictsPolicy.ordinal()])
	//* 159  362:getstatic       #700 <Field int[] APSVastAdBreak$2.$SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
	//* 160  365:aload_0         
	//* 161  366:getfield        #255 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy multipleAdsConflictsPolicy>
	//* 162  369:invokevirtual   #703 <Method int com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.ordinal()>
	//* 163  372:iaload          
					{
	//* 164  373:tableswitch     1 3: default 400
	//	               1 455
	//	               2 436
	//	               3 403
	//* 165  400:goto            457
					case 3: // '\003'
						apsvastxmlnode = ((APSVASTXMLNode) (new ArrayList(((Collection) (Collections.singletonList(((ArrayList) (apsvastxmlnode)).get((new Random()).nextInt() % ((ArrayList) (apsvastxmlnode)).size())))))));
	//  166  403:new             #137 <Class ArrayList>
	//  167  406:dup             
	//  168  407:aload_1         
	//  169  408:new             #705 <Class Random>
	//  170  411:dup             
	//  171  412:invokespecial   #706 <Method void Random()>
	//  172  415:invokevirtual   #709 <Method int Random.nextInt()>
	//  173  418:aload_1         
	//  174  419:invokevirtual   #604 <Method int ArrayList.size()>
	//  175  422:irem            
	//  176  423:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//  177  426:invokestatic    #554 <Method List Collections.singletonList(Object)>
	//  178  429:invokespecial   #180 <Method void ArrayList(Collection)>
	//  179  432:astore_1        
						break;

	//* 180  433:goto            457
					case 2: // '\002'
						apsvastxmlnode = ((APSVASTXMLNode) (new ArrayList(((Collection) (Collections.singletonList(((ArrayList) (apsvastxmlnode)).get(0)))))));
	//  181  436:new             #137 <Class ArrayList>
	//  182  439:dup             
	//  183  440:aload_1         
	//  184  441:iconst_0        
	//  185  442:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//  186  445:invokestatic    #554 <Method List Collections.singletonList(Object)>
	//  187  448:invokespecial   #180 <Method void ArrayList(Collection)>
	//  188  451:astore_1        
						break;

	//* 189  452:goto            457
					case 1: // '\001'
						return null;
	//  190  455:aconst_null     
	//  191  456:areturn         
					}
				ArrayList arraylist3 = unitsForLinearsInInlineNodesWithBuffet(((ArrayList) (apsvastxmlnode)), unitsForLinearsInInlineNodesWithBuffet(((ArrayList) (obj)), ((ArrayList) (null))));
	//  192  457:aload_0         
	//  193  458:aload_1         
	//  194  459:aload_0         
	//  195  460:aload           5
	//  196  462:aconst_null     
	//  197  463:invokevirtual   #716 <Method ArrayList unitsForLinearsInInlineNodesWithBuffet(ArrayList, ArrayList)>
	//  198  466:invokevirtual   #716 <Method ArrayList unitsForLinearsInInlineNodesWithBuffet(ArrayList, ArrayList)>
	//  199  469:astore          7
				ArrayList arraylist = (ArrayList)hashmap1.get("linears");
	//  200  471:aload           9
	//  201  473:ldc2            #718 <String "linears">
	//  202  476:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  203  479:checkcast       #137 <Class ArrayList>
	//  204  482:astore          6
				obj = ((Object) (arraylist));
	//  205  484:aload           6
	//  206  486:astore          5
				if(arraylist == null)
	//* 207  488:aload           6
	//* 208  490:ifnonnull       502
					obj = ((Object) (new ArrayList()));
	//  209  493:new             #137 <Class ArrayList>
	//  210  496:dup             
	//  211  497:invokespecial   #138 <Method void ArrayList()>
	//  212  500:astore          5
				((ArrayList) (obj)).addAll(((Collection) (arraylist3)));
	//  213  502:aload           5
	//  214  504:aload           7
	//  215  506:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  216  509:pop             
				hashmap1.put("linears", obj);
	//  217  510:aload           9
	//  218  512:ldc2            #718 <String "linears">
	//  219  515:aload           5
	//  220  517:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  221  520:pop             
				arraylist = overlaysForNonlinearsInInlineNodes(((ArrayList) (apsvastxmlnode)));
	//  222  521:aload_0         
	//  223  522:aload_1         
	//  224  523:invokevirtual   #722 <Method ArrayList overlaysForNonlinearsInInlineNodes(ArrayList)>
	//  225  526:astore          6
				obj = ((Object) ((ArrayList)hashmap1.get("overlays")));
	//  226  528:aload           9
	//  227  530:ldc2            #724 <String "overlays">
	//  228  533:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  229  536:checkcast       #137 <Class ArrayList>
	//  230  539:astore          5
				apsvastxmlnode = ((APSVASTXMLNode) (obj));
	//  231  541:aload           5
	//  232  543:astore_1        
				if(obj == null)
	//* 233  544:aload           5
	//* 234  546:ifnonnull       557
					apsvastxmlnode = ((APSVASTXMLNode) (new ArrayList()));
	//  235  549:new             #137 <Class ArrayList>
	//  236  552:dup             
	//  237  553:invokespecial   #138 <Method void ArrayList()>
	//  238  556:astore_1        
				((ArrayList) (apsvastxmlnode)).addAll(((Collection) (arraylist)));
	//  239  557:aload_1         
	//  240  558:aload           6
	//  241  560:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  242  563:pop             
				hashmap1.put("overlays", ((Object) (apsvastxmlnode)));
	//  243  564:aload           9
	//  244  566:ldc2            #724 <String "overlays">
	//  245  569:aload_1         
	//  246  570:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  247  573:pop             
			}
		}
		return hashmap1;
	//  248  574:aload           9
	//  249  576:areturn         
	}

	public HashMap adsForURLWithWrappers(String s, ArrayList arraylist, int i)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			return new HashMap();
	//    2    4:new             #332 <Class HashMap>
	//    3    7:dup             
	//    4    8:invokespecial   #585 <Method void HashMap()>
	//    5   11:areturn         
		Object obj = ((Object) (userAgent));
	//    6   12:aload_0         
	//    7   13:getfield        #186 <Field String userAgent>
	//    8   16:astore          4
		if(obj != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          32
			System.setProperty("http.agent", ((String) (obj)));
	//   11   23:ldc2            #733 <String "http.agent">
	//   12   26:aload           4
	//   13   28:invokestatic    #739 <Method String System.setProperty(String, String)>
	//   14   31:pop             
		Object obj1 = ((Object) (s.replace("[CACHEBUSTING]", ((CharSequence) (String.valueOf((new Random()).nextInt() % 0x5f5e100)))).replace("[CACHEBUSTER]", ((CharSequence) (String.valueOf((new Random()).nextInt() % 0x5f5e100)))).replace("%RANDOM%", ((CharSequence) (String.valueOf(System.currentTimeMillis() / 1000L)))).replace("[timestamp]", ((CharSequence) (String.valueOf(System.currentTimeMillis() / 1000L))))));
	//   15   32:aload_1         
	//   16   33:ldc2            #741 <String "[CACHEBUSTING]">
	//   17   36:new             #705 <Class Random>
	//   18   39:dup             
	//   19   40:invokespecial   #706 <Method void Random()>
	//   20   43:invokevirtual   #709 <Method int Random.nextInt()>
	//   21   46:ldc2            #742 <Int 0x5f5e100>
	//   22   49:irem            
	//   23   50:invokestatic    #544 <Method String String.valueOf(int)>
	//   24   53:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//   25   56:ldc2            #744 <String "[CACHEBUSTER]">
	//   26   59:new             #705 <Class Random>
	//   27   62:dup             
	//   28   63:invokespecial   #706 <Method void Random()>
	//   29   66:invokevirtual   #709 <Method int Random.nextInt()>
	//   30   69:ldc2            #742 <Int 0x5f5e100>
	//   31   72:irem            
	//   32   73:invokestatic    #544 <Method String String.valueOf(int)>
	//   33   76:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//   34   79:ldc2            #746 <String "%RANDOM%">
	//   35   82:invokestatic    #750 <Method long System.currentTimeMillis()>
	//   36   85:ldc2w           #751 <Long 1000L>
	//   37   88:ldiv            
	//   38   89:invokestatic    #755 <Method String String.valueOf(long)>
	//   39   92:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//   40   95:ldc2            #757 <String "[timestamp]">
	//   41   98:invokestatic    #750 <Method long System.currentTimeMillis()>
	//   42  101:ldc2w           #751 <Long 1000L>
	//   43  104:ldiv            
	//   44  105:invokestatic    #755 <Method String String.valueOf(long)>
	//   45  108:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//   46  111:astore          5
		obj = ((Object) (APSMediaPlayer.getInstance().advertisingIdentifier));
	//   47  113:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   48  116:getfield        #760 <Field String APSMediaPlayer.advertisingIdentifier>
	//   49  119:astore          4
		s = ((String) (obj));
	//   50  121:aload           4
	//   51  123:astore_1        
		if(obj == null)
	//*  52  124:aload           4
	//*  53  126:ifnonnull       140
			s = String.valueOf(System.currentTimeMillis() / 1000L);
	//   54  129:invokestatic    #750 <Method long System.currentTimeMillis()>
	//   55  132:ldc2w           #751 <Long 1000L>
	//   56  135:ldiv            
	//   57  136:invokestatic    #755 <Method String String.valueOf(long)>
	//   58  139:astore_1        
		s = ((String) (obj1)).replace("%PPID%", ((CharSequence) (s))).replace("^", "%5E");
	//   59  140:aload           5
	//   60  142:ldc2            #762 <String "%PPID%">
	//   61  145:aload_1         
	//   62  146:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//   63  149:ldc2            #764 <String "^">
	//   64  152:ldc2            #766 <String "%5E">
	//   65  155:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//   66  158:astore_1        
		obj = ((Object) (APSMediaPlayer.getInstance()));
	//   67  159:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   68  162:astore          4
		obj1 = ((Object) (new StringBuilder()));
	//   69  164:new             #768 <Class StringBuilder>
	//   70  167:dup             
	//   71  168:invokespecial   #769 <Method void StringBuilder()>
	//   72  171:astore          5
		((StringBuilder) (obj1)).append("Replaced VAST url placeholders with: ");
	//   73  173:aload           5
	//   74  175:ldc2            #771 <String "Replaced VAST url placeholders with: ">
	//   75  178:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//   76  181:pop             
		((StringBuilder) (obj1)).append(s);
	//   77  182:aload           5
	//   78  184:aload_1         
	//   79  185:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//   80  188:pop             
		((APSMediaPlayer) (obj)).log(((StringBuilder) (obj1)).toString());
	//   81  189:aload           4
	//   82  191:aload           5
	//   83  193:invokevirtual   #778 <Method String StringBuilder.toString()>
	//   84  196:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
		try
		{
			obj = ((Object) (new URL(s)));
	//   85  199:new             #783 <Class URL>
	//   86  202:dup             
	//   87  203:aload_1         
	//   88  204:invokespecial   #784 <Method void URL(String)>
	//   89  207:astore          4
		}
	//*  90  209:new             #786 <Class com.appscend.media.APSMediaBuilder$getDataAsync>
	//*  91  212:dup             
	//*  92  213:invokespecial   #787 <Method void com.appscend.media.APSMediaBuilder$getDataAsync()>
	//*  93  216:iconst_1        
	//*  94  217:anewarray       URL[]
	//*  95  220:dup             
	//*  96  221:iconst_0        
	//*  97  222:aload           4
	//*  98  224:aastore         
	//*  99  225:invokevirtual   #791 <Method AsyncTask com.appscend.media.APSMediaBuilder$getDataAsync.execute(Object[])>
	//* 100  228:invokevirtual   #795 <Method Object AsyncTask.get()>
	//* 101  231:checkcast       #155 <Class String>
	//* 102  234:astore          4
	//* 103  236:aload_0         
	//* 104  237:aload           4
	//* 105  239:aload_2         
	//* 106  240:iload_3         
	//* 107  241:aload_1         
	//* 108  242:invokevirtual   #797 <Method HashMap adsForDatawithWrappers(String, ArrayList, int, String)>
	//* 109  245:areturn         
	//* 110  246:new             #332 <Class HashMap>
	//* 111  249:dup             
	//* 112  250:invokespecial   #585 <Method void HashMap()>
	//* 113  253:areturn         
	//* 114  254:new             #332 <Class HashMap>
	//* 115  257:dup             
	//* 116  258:invokespecial   #585 <Method void HashMap()>
	//* 117  261:areturn         
	//* 118  262:new             #332 <Class HashMap>
	//* 119  265:dup             
	//* 120  266:invokespecial   #585 <Method void HashMap()>
	//* 121  269:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return new HashMap();
		}
		try
		{
			obj = ((Object) ((String)(new com.appscend.media.APSMediaBuilder.getDataAsync()).execute(((Object []) (new URL[] {
				obj
			}))).get()));
		}
	//* 122  270:astore_1        
	//* 123  271:goto            262
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return new HashMap();
		}
	//* 124  274:astore_1        
	//* 125  275:goto            254
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return new HashMap();
		}
		return adsForDatawithWrappers(((String) (obj)), arraylist, i, s);
	//* 126  278:astore_1        
	//* 127  279:goto            246
	}

	public boolean configureFromDictionary(Map map)
	{
		byte byte0;
label0:
		{
			int i;
label1:
			{
				Object obj = map.get("afterBannerTapped");
	//    0    0:aload_1         
	//    1    1:ldc2            #801 <String "afterBannerTapped">
	//    2    4:invokeinterface #804 <Method Object Map.get(Object)>
	//    3    9:astore          4
				byte0 = -1;
	//    4   11:iconst_m1       
	//    5   12:istore_3        
				if(obj == null)
					break label0;
	//    6   13:aload           4
	//    7   15:ifnull          170
				obj = ((Object) ((String)map.get("afterBannerTapped")));
	//    8   18:aload_1         
	//    9   19:ldc2            #801 <String "afterBannerTapped">
	//   10   22:invokeinterface #804 <Method Object Map.get(Object)>
	//   11   27:checkcast       #155 <Class String>
	//   12   30:astore          4
				i = ((String) (obj)).hashCode();
	//   13   32:aload           4
	//   14   34:invokevirtual   #486 <Method int String.hashCode()>
	//   15   37:istore_2        
				if(i != 0xd78150c2)
	//*  16   38:iload_2         
	//*  17   39:ldc2            #805 <Int 0xd78150c2>
	//*  18   42:icmpeq          94
				{
					if(i != 0x6ec7d738)
	//*  19   45:iload_2         
	//*  20   46:ldc2            #806 <Int 0x6ec7d738>
	//*  21   49:icmpeq          78
					{
						if(i == 0x7fe15ba3 && ((String) (obj)).equals("skipUnit"))
	//*  22   52:iload_2         
	//*  23   53:ldc2            #807 <Int 0x7fe15ba3>
	//*  24   56:icmpeq          62
	//*  25   59:goto            110
	//*  26   62:aload           4
	//*  27   64:ldc2            #809 <String "skipUnit">
	//*  28   67:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  29   70:ifeq            110
						{
							i = 2;
	//   30   73:iconst_2        
	//   31   74:istore_2        
							break label1;
	//   32   75:goto            112
						}
					} else
					if(((String) (obj)).equals("closeOverlay"))
	//*  33   78:aload           4
	//*  34   80:ldc2            #811 <String "closeOverlay">
	//*  35   83:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  36   86:ifeq            110
					{
						i = 1;
	//   37   89:iconst_1        
	//   38   90:istore_2        
						break label1;
	//   39   91:goto            112
					}
				} else
				if(((String) (obj)).equals("doNothing"))
	//*  40   94:aload           4
	//*  41   96:ldc2            #813 <String "doNothing">
	//*  42   99:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  43  102:ifeq            110
				{
					i = 0;
	//   44  105:iconst_0        
	//   45  106:istore_2        
					break label1;
	//   46  107:goto            112
				}
				i = -1;
	//   47  110:iconst_m1       
	//   48  111:istore_2        
			}
			switch(i)
	//*  49  112:iload_2         
			{
	//*  50  113:tableswitch     0 2: default 140
	//	               0 163
	//	               1 153
	//	               2 143
	//*  51  140:goto            170
			case 2: // '\002'
				afterBannerTapped = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss;
	//   52  143:aload_0         
	//   53  144:getstatic       #816 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss>
	//   54  147:putfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
				break;

	//*  55  150:goto            170
			case 1: // '\001'
				afterBannerTapped = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss;
	//   56  153:aload_0         
	//   57  154:getstatic       #819 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
	//   58  157:putfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
				break;

	//*  59  160:goto            170
			case 0: // '\0'
				afterBannerTapped = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//   60  163:aload_0         
	//   61  164:getstatic       #149 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//   62  167:putfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
				break;
			}
		}
		if(map.get("afterVideoAdTapped") != null)
	//*  63  170:aload_1         
	//*  64  171:ldc2            #820 <String "afterVideoAdTapped">
	//*  65  174:invokeinterface #804 <Method Object Map.get(Object)>
	//*  66  179:ifnull          235
		{
			String s = (String)map.get("afterVideoAdTapped");
	//   67  182:aload_1         
	//   68  183:ldc2            #820 <String "afterVideoAdTapped">
	//   69  186:invokeinterface #804 <Method Object Map.get(Object)>
	//   70  191:checkcast       #155 <Class String>
	//   71  194:astore          4
			if(s.equals("doNothing"))
	//*  72  196:aload           4
	//*  73  198:ldc2            #813 <String "doNothing">
	//*  74  201:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  75  204:ifeq            217
				afterVideoAdTapped = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//   76  207:aload_0         
	//   77  208:getstatic       #149 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//   78  211:putfield        #151 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterVideoAdTapped>
			else
	//*  79  214:goto            235
			if(s.equals("skipUnit"))
	//*  80  217:aload           4
	//*  81  219:ldc2            #809 <String "skipUnit">
	//*  82  222:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  83  225:ifeq            235
				afterVideoAdTapped = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss;
	//   84  228:aload_0         
	//   85  229:getstatic       #816 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss>
	//   86  232:putfield        #151 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterVideoAdTapped>
		}
		if(map.get("videoMimeTypes") != null)
	//*  87  235:aload_1         
	//*  88  236:ldc2            #822 <String "videoMimeTypes">
	//*  89  239:invokeinterface #804 <Method Object Map.get(Object)>
	//*  90  244:ifnull          263
			prefferedVideoMimeTypes = (ArrayList)map.get("videoMimeTypes");
	//   91  247:aload_0         
	//   92  248:aload_1         
	//   93  249:ldc2            #822 <String "videoMimeTypes">
	//   94  252:invokeinterface #804 <Method Object Map.get(Object)>
	//   95  257:checkcast       #137 <Class ArrayList>
	//   96  260:putfield        #182 <Field ArrayList prefferedVideoMimeTypes>
		Object obj1 = ((Object) ((LinkedTreeMap)map.get("controls")));
	//   97  263:aload_1         
	//   98  264:ldc2            #824 <String "controls">
	//   99  267:invokeinterface #804 <Method Object Map.get(Object)>
	//  100  272:checkcast       #441 <Class LinkedTreeMap>
	//  101  275:astore          4
		if(obj1 != null)
	//* 102  277:aload           4
	//* 103  279:ifnull          426
		{
			String s1 = (String)((LinkedTreeMap) (obj1)).get("position");
	//  104  282:aload           4
	//  105  284:ldc2            #826 <String "position">
	//  106  287:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  107  290:checkcast       #155 <Class String>
	//  108  293:astore          5
			if(s1 != null)
	//* 109  295:aload           5
	//* 110  297:ifnull          407
			{
				int j = s1.hashCode();
	//  111  300:aload           5
	//  112  302:invokevirtual   #486 <Method int String.hashCode()>
	//  113  305:istore_2        
				if(j != 0xad8d9a2b)
	//* 114  306:iload_2         
	//* 115  307:ldc2            #827 <Int 0xad8d9a2b>
	//* 116  310:icmpeq          343
				{
					if(j != 0x1c155)
	//* 117  313:iload_2         
	//* 118  314:ldc2            #828 <Int 0x1c155>
	//* 119  317:icmpeq          325
					{
						j = ((int) (byte0));
	//  120  320:iload_3         
	//  121  321:istore_2        
					} else
	//* 122  322:goto            358
					{
						j = ((int) (byte0));
	//  123  325:iload_3         
	//  124  326:istore_2        
						if(s1.equals("top"))
	//* 125  327:aload           5
	//* 126  329:ldc2            #830 <String "top">
	//* 127  332:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 128  335:ifeq            358
							j = 0;
	//  129  338:iconst_0        
	//  130  339:istore_2        
					}
				} else
	//* 131  340:goto            358
				{
					j = ((int) (byte0));
	//  132  343:iload_3         
	//  133  344:istore_2        
					if(s1.equals("bottom"))
	//* 134  345:aload           5
	//* 135  347:ldc2            #832 <String "bottom">
	//* 136  350:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 137  353:ifeq            358
						j = 1;
	//  138  356:iconst_1        
	//  139  357:istore_2        
				}
				switch(j)
	//* 140  358:iload_2         
				{
	//* 141  359:tableswitch     0 1: default 380
	//	               0 400
	//	               1 390
				default:
					controlsDisplayForAds = APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayNone;
	//  142  380:aload_0         
	//  143  381:getstatic       #191 <Field APSMediaUnit$APSMediaControlsDisplay APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayNone>
	//  144  384:putfield        #193 <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplayForAds>
					break;

	//* 145  387:goto            407
				case 1: // '\001'
					controlsDisplayForAds = APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayBottom;
	//  146  390:aload_0         
	//  147  391:getstatic       #835 <Field APSMediaUnit$APSMediaControlsDisplay APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayBottom>
	//  148  394:putfield        #193 <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplayForAds>
					break;

	//* 149  397:goto            407
				case 0: // '\0'
					controlsDisplayForAds = APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayTop;
	//  150  400:aload_0         
	//  151  401:getstatic       #838 <Field APSMediaUnit$APSMediaControlsDisplay APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayTop>
	//  152  404:putfield        #193 <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplayForAds>
					break;
				}
			}
			controlsParametersForAds = APSMediaBuilder.controlsParametersFromDictionary(new HashMap(((Map) (obj1))));
	//  153  407:aload_0         
	//  154  408:new             #332 <Class HashMap>
	//  155  411:dup             
	//  156  412:aload           4
	//  157  414:invokespecial   #449 <Method void HashMap(Map)>
	//  158  417:invokestatic    #844 <Method HashMap APSMediaBuilder.controlsParametersFromDictionary(HashMap)>
	//  159  420:putfield        #346 <Field HashMap controlsParametersForAds>
		} else
	//* 160  423:goto            440
		{
			controlsParametersForAds = APSMediaBuilder.controlsParametersFromDictionary(new HashMap());
	//  161  426:aload_0         
	//  162  427:new             #332 <Class HashMap>
	//  163  430:dup             
	//  164  431:invokespecial   #585 <Method void HashMap()>
	//  165  434:invokestatic    #844 <Method HashMap APSMediaBuilder.controlsParametersFromDictionary(HashMap)>
	//  166  437:putfield        #346 <Field HashMap controlsParametersForAds>
		}
		if(map.get("defaultAdBreakPositions") != null)
	//* 167  440:aload_1         
	//* 168  441:ldc2            #845 <String "defaultAdBreakPositions">
	//* 169  444:invokeinterface #804 <Method Object Map.get(Object)>
	//* 170  449:ifnull          468
			defaultAdBreakPositions = (ArrayList)map.get("defaultAdBreakPositions");
	//  171  452:aload_0         
	//  172  453:aload_1         
	//  173  454:ldc2            #845 <String "defaultAdBreakPositions">
	//  174  457:invokeinterface #804 <Method Object Map.get(Object)>
	//  175  462:checkcast       #137 <Class ArrayList>
	//  176  465:putfield        #384 <Field ArrayList defaultAdBreakPositions>
		obj1 = ((Object) ((String)map.get("adPodFallback")));
	//  177  468:aload_1         
	//  178  469:ldc2            #847 <String "adPodFallback">
	//  179  472:invokeinterface #804 <Method Object Map.get(Object)>
	//  180  477:checkcast       #155 <Class String>
	//  181  480:astore          4
		if(obj1 != null)
	//* 182  482:aload           4
	//* 183  484:ifnull          536
		{
			if(((String) (obj1)).equals("all"))
	//* 184  487:aload           4
	//* 185  489:ldc2            #849 <String "all">
	//* 186  492:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 187  495:ifeq            506
				obj1 = ((Object) (com.appscend.vast.APSVASTRootNode.APSAdPodFallback.APSAdPodFallbackSelectAll));
	//  188  498:getstatic       #260 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback com.appscend.vast.APSVASTRootNode$APSAdPodFallback.APSAdPodFallbackSelectAll>
	//  189  501:astore          4
			else
	//* 190  503:goto            530
			if(((String) (obj1)).equals("first"))
	//* 191  506:aload           4
	//* 192  508:ldc2            #851 <String "first">
	//* 193  511:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 194  514:ifeq            525
				obj1 = ((Object) (com.appscend.vast.APSVASTRootNode.APSAdPodFallback.APSAdPodFallbackSelectFirst));
	//  195  517:getstatic       #854 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback com.appscend.vast.APSVASTRootNode$APSAdPodFallback.APSAdPodFallbackSelectFirst>
	//  196  520:astore          4
			else
	//* 197  522:goto            530
				obj1 = ((Object) (com.appscend.vast.APSVASTRootNode.APSAdPodFallback.APSAdPodFallbackDrop));
	//  198  525:getstatic       #857 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback com.appscend.vast.APSVASTRootNode$APSAdPodFallback.APSAdPodFallbackDrop>
	//  199  528:astore          4
			adPodFallbackStrategy = ((com.appscend.vast.APSVASTRootNode.APSAdPodFallback) (obj1));
	//  200  530:aload_0         
	//  201  531:aload           4
	//  202  533:putfield        #262 <Field com.appscend.vast.APSVASTRootNode$APSAdPodFallback adPodFallbackStrategy>
		}
		obj1 = ((Object) ((String)map.get("multiAdConflictPolicy")));
	//  203  536:aload_1         
	//  204  537:ldc2            #859 <String "multiAdConflictPolicy">
	//  205  540:invokeinterface #804 <Method Object Map.get(Object)>
	//  206  545:checkcast       #155 <Class String>
	//  207  548:astore          4
		if(obj1 != null)
	//* 208  550:aload           4
	//* 209  552:ifnull          604
		{
			if(((String) (obj1)).equals("first"))
	//* 210  555:aload           4
	//* 211  557:ldc2            #851 <String "first">
	//* 212  560:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 213  563:ifeq            574
				obj1 = ((Object) (com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingFirst));
	//  214  566:getstatic       #253 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingFirst>
	//  215  569:astore          4
			else
	//* 216  571:goto            598
			if(((String) (obj1)).equals("random"))
	//* 217  574:aload           4
	//* 218  576:ldc2            #861 <String "random">
	//* 219  579:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 220  582:ifeq            593
				obj1 = ((Object) (com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingRandom));
	//  221  585:getstatic       #864 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsBySelectingRandom>
	//  222  588:astore          4
			else
	//* 223  590:goto            598
				obj1 = ((Object) (com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsByDropping));
	//  224  593:getstatic       #867 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.APSResolvMultipleAdsConflictsByDropping>
	//  225  596:astore          4
			multipleAdsConflictsPolicy = ((com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy) (obj1));
	//  226  598:aload_0         
	//  227  599:aload           4
	//  228  601:putfield        #255 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy multipleAdsConflictsPolicy>
		}
		if(map.get("requestUserAgent") != null)
	//* 229  604:aload_1         
	//* 230  605:ldc2            #869 <String "requestUserAgent">
	//* 231  608:invokeinterface #804 <Method Object Map.get(Object)>
	//* 232  613:ifnull          632
			userAgent = (String)map.get("requestUserAgent");
	//  233  616:aload_0         
	//  234  617:aload_1         
	//  235  618:ldc2            #869 <String "requestUserAgent">
	//  236  621:invokeinterface #804 <Method Object Map.get(Object)>
	//  237  626:checkcast       #155 <Class String>
	//  238  629:putfield        #186 <Field String userAgent>
		obj1 = ((Object) ((LinkedTreeMap)map.get("icons")));
	//  239  632:aload_1         
	//  240  633:ldc2            #871 <String "icons">
	//  241  636:invokeinterface #804 <Method Object Map.get(Object)>
	//  242  641:checkcast       #441 <Class LinkedTreeMap>
	//  243  644:astore          4
		if(obj1 != null)
	//* 244  646:aload           4
	//* 245  648:ifnull          710
		{
			if(((LinkedTreeMap) (obj1)).get("height") != null)
	//* 246  651:aload           4
	//* 247  653:ldc2            #873 <String "height">
	//* 248  656:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 249  659:ifnull          681
				defaultIconHeightPercentage = ((Integer)((LinkedTreeMap) (obj1)).get("height")).intValue();
	//  250  662:aload_0         
	//  251  663:aload           4
	//  252  665:ldc2            #873 <String "height">
	//  253  668:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  254  671:checkcast       #875 <Class Integer>
	//  255  674:invokevirtual   #878 <Method int Integer.intValue()>
	//  256  677:i2f             
	//  257  678:putfield        #196 <Field float defaultIconHeightPercentage>
			if(((LinkedTreeMap) (obj1)).get("fadeIn") != null)
	//* 258  681:aload           4
	//* 259  683:ldc2            #880 <String "fadeIn">
	//* 260  686:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 261  689:ifnull          710
				iconFadeInDuration = ((Double)((LinkedTreeMap) (obj1)).get("fadeIn")).floatValue();
	//  262  692:aload_0         
	//  263  693:aload           4
	//  264  695:ldc2            #880 <String "fadeIn">
	//  265  698:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  266  701:checkcast       #882 <Class Double>
	//  267  704:invokevirtual   #885 <Method float Double.floatValue()>
	//  268  707:putfield        #208 <Field float iconFadeInDuration>
		}
		obj1 = ((Object) ((LinkedTreeMap)map.get("skipButton")));
	//  269  710:aload_1         
	//  270  711:ldc2            #887 <String "skipButton">
	//  271  714:invokeinterface #804 <Method Object Map.get(Object)>
	//  272  719:checkcast       #441 <Class LinkedTreeMap>
	//  273  722:astore          4
		if(obj1 != null)
	//* 274  724:aload           4
	//* 275  726:ifnull          1283
		{
			if(((LinkedTreeMap) (obj1)).get("position") != null)
	//* 276  729:aload           4
	//* 277  731:ldc2            #826 <String "position">
	//* 278  734:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 279  737:ifnull          758
				skipButtonPosition = APSMediaBuilder.positionFromString((String)((LinkedTreeMap) (obj1)).get("position"));
	//  280  740:aload_0         
	//  281  741:aload           4
	//  282  743:ldc2            #826 <String "position">
	//  283  746:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  284  749:checkcast       #155 <Class String>
	//  285  752:invokestatic    #891 <Method APSMediaOverlay$APSMediaOverlayPosition APSMediaBuilder.positionFromString(String)>
	//  286  755:putfield        #215 <Field APSMediaOverlay$APSMediaOverlayPosition skipButtonPosition>
			if(((LinkedTreeMap) (obj1)).get("defaultOffset") != null)
	//* 287  758:aload           4
	//* 288  760:ldc2            #893 <String "defaultOffset">
	//* 289  763:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 290  766:ifnull          790
				defaultSkipOffset = Integer.valueOf((String)((LinkedTreeMap) (obj1)).get("defaultOffset")).intValue();
	//  291  769:aload_0         
	//  292  770:aload           4
	//  293  772:ldc2            #893 <String "defaultOffset">
	//  294  775:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  295  778:checkcast       #155 <Class String>
	//  296  781:invokestatic    #896 <Method Integer Integer.valueOf(String)>
	//  297  784:invokevirtual   #878 <Method int Integer.intValue()>
	//  298  787:putfield        #217 <Field int defaultSkipOffset>
			if(((LinkedTreeMap) (obj1)).get("text") != null)
	//* 299  790:aload           4
	//* 300  792:ldc2            #898 <String "text">
	//* 301  795:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 302  798:ifnull          816
				skipButtonText = (String)((LinkedTreeMap) (obj1)).get("text");
	//  303  801:aload_0         
	//  304  802:aload           4
	//  305  804:ldc2            #898 <String "text">
	//  306  807:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  307  810:checkcast       #155 <Class String>
	//  308  813:putfield        #364 <Field String skipButtonText>
			if(((LinkedTreeMap) (obj1)).get("textColor") != null)
	//* 309  816:aload           4
	//* 310  818:ldc2            #900 <String "textColor">
	//* 311  821:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 312  824:ifnull          842
				skipButtonTextColor = (String)((LinkedTreeMap) (obj1)).get("textColor");
	//  313  827:aload_0         
	//  314  828:aload           4
	//  315  830:ldc2            #900 <String "textColor">
	//  316  833:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  317  836:checkcast       #155 <Class String>
	//  318  839:putfield        #366 <Field String skipButtonTextColor>
			if(((LinkedTreeMap) (obj1)).get("padding") != null)
	//* 319  842:aload           4
	//* 320  844:ldc2            #902 <String "padding">
	//* 321  847:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 322  850:ifnull          920
				if(((LinkedTreeMap) (obj1)).get("padding") instanceof String)
	//* 323  853:aload           4
	//* 324  855:ldc2            #902 <String "padding">
	//* 325  858:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 326  861:instanceof      #155 <Class String>
	//* 327  864:ifeq            888
					skipButtonPadding = Integer.parseInt((String)((LinkedTreeMap) (obj1)).get("padding"));
	//  328  867:aload_0         
	//  329  868:aload           4
	//  330  870:ldc2            #902 <String "padding">
	//  331  873:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  332  876:checkcast       #155 <Class String>
	//  333  879:invokestatic    #906 <Method int Integer.parseInt(String)>
	//  334  882:putfield        #226 <Field int skipButtonPadding>
				else
	//* 335  885:goto            920
				if(((LinkedTreeMap) (obj1)).get("padding") instanceof Double)
	//* 336  888:aload           4
	//* 337  890:ldc2            #902 <String "padding">
	//* 338  893:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 339  896:instanceof      #882 <Class Double>
	//* 340  899:ifeq            920
					skipButtonPadding = ((Double)((LinkedTreeMap) (obj1)).get("padding")).intValue();
	//  341  902:aload_0         
	//  342  903:aload           4
	//  343  905:ldc2            #902 <String "padding">
	//  344  908:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  345  911:checkcast       #882 <Class Double>
	//  346  914:invokevirtual   #907 <Method int Double.intValue()>
	//  347  917:putfield        #226 <Field int skipButtonPadding>
			if(((LinkedTreeMap) (obj1)).get("width") != null)
	//* 348  920:aload           4
	//* 349  922:ldc2            #909 <String "width">
	//* 350  925:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 351  928:ifnull          946
				skipButtonWidth = (String)((LinkedTreeMap) (obj1)).get("width");
	//  352  931:aload_0         
	//  353  932:aload           4
	//  354  934:ldc2            #909 <String "width">
	//  355  937:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  356  940:checkcast       #155 <Class String>
	//  357  943:putfield        #230 <Field String skipButtonWidth>
			if(((LinkedTreeMap) (obj1)).get("height") != null)
	//* 358  946:aload           4
	//* 359  948:ldc2            #873 <String "height">
	//* 360  951:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 361  954:ifnull          972
				skipButtonHeight = (String)((LinkedTreeMap) (obj1)).get("height");
	//  362  957:aload_0         
	//  363  958:aload           4
	//  364  960:ldc2            #873 <String "height">
	//  365  963:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  366  966:checkcast       #155 <Class String>
	//  367  969:putfield        #234 <Field String skipButtonHeight>
			if(((LinkedTreeMap) (obj1)).get("backgroundColor") != null)
	//* 368  972:aload           4
	//* 369  974:ldc2            #911 <String "backgroundColor">
	//* 370  977:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 371  980:ifnull          998
				skipButtonBackgroundColor = (String)((LinkedTreeMap) (obj1)).get("backgroundColor");
	//  372  983:aload_0         
	//  373  984:aload           4
	//  374  986:ldc2            #911 <String "backgroundColor">
	//  375  989:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  376  992:checkcast       #155 <Class String>
	//  377  995:putfield        #370 <Field String skipButtonBackgroundColor>
			LinkedTreeMap linkedtreemap = (LinkedTreeMap)((LinkedTreeMap) (obj1)).get("border");
	//  378  998:aload           4
	//  379 1000:ldc2            #913 <String "border">
	//  380 1003:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  381 1006:checkcast       #441 <Class LinkedTreeMap>
	//  382 1009:astore          5
			if(linkedtreemap != null)
	//* 383 1011:aload           5
	//* 384 1013:ifnull          1120
			{
				if(linkedtreemap.get("color") != null)
	//* 385 1016:aload           5
	//* 386 1018:ldc2            #915 <String "color">
	//* 387 1021:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 388 1024:ifnull          1042
					skipButtonBorderColor = (String)linkedtreemap.get("color");
	//  389 1027:aload_0         
	//  390 1028:aload           5
	//  391 1030:ldc2            #915 <String "color">
	//  392 1033:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  393 1036:checkcast       #155 <Class String>
	//  394 1039:putfield        #368 <Field String skipButtonBorderColor>
				if(linkedtreemap.get("radius") != null)
	//* 395 1042:aload           5
	//* 396 1044:ldc2            #917 <String "radius">
	//* 397 1047:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 398 1050:ifnull          1120
					if(linkedtreemap.get("radius") instanceof String)
	//* 399 1053:aload           5
	//* 400 1055:ldc2            #917 <String "radius">
	//* 401 1058:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 402 1061:instanceof      #155 <Class String>
	//* 403 1064:ifeq            1088
						skipButtonBorderRadius = Integer.parseInt((String)linkedtreemap.get("radius"));
	//  404 1067:aload_0         
	//  405 1068:aload           5
	//  406 1070:ldc2            #917 <String "radius">
	//  407 1073:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  408 1076:checkcast       #155 <Class String>
	//  409 1079:invokestatic    #906 <Method int Integer.parseInt(String)>
	//  410 1082:putfield        #184 <Field int skipButtonBorderRadius>
					else
	//* 411 1085:goto            1120
					if(linkedtreemap.get("radius") instanceof Double)
	//* 412 1088:aload           5
	//* 413 1090:ldc2            #917 <String "radius">
	//* 414 1093:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 415 1096:instanceof      #882 <Class Double>
	//* 416 1099:ifeq            1120
						skipButtonBorderRadius = ((Double)linkedtreemap.get("radius")).intValue();
	//  417 1102:aload_0         
	//  418 1103:aload           5
	//  419 1105:ldc2            #917 <String "radius">
	//  420 1108:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  421 1111:checkcast       #882 <Class Double>
	//  422 1114:invokevirtual   #907 <Method int Double.intValue()>
	//  423 1117:putfield        #184 <Field int skipButtonBorderRadius>
			}
			linkedtreemap = (LinkedTreeMap)((LinkedTreeMap) (obj1)).get("progress");
	//  424 1120:aload           4
	//  425 1122:ldc2            #919 <String "progress">
	//  426 1125:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  427 1128:checkcast       #441 <Class LinkedTreeMap>
	//  428 1131:astore          5
			if(linkedtreemap != null)
	//* 429 1133:aload           5
	//* 430 1135:ifnull          1283
			{
				obj1 = ((Object) ((String)linkedtreemap.get("position")));
	//  431 1138:aload           5
	//  432 1140:ldc2            #826 <String "position">
	//  433 1143:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  434 1146:checkcast       #155 <Class String>
	//  435 1149:astore          4
				if(obj1 != null)
	//* 436 1151:aload           4
	//* 437 1153:ifnull          1205
				{
					if(((String) (obj1)).equals("left"))
	//* 438 1156:aload           4
	//* 439 1158:ldc2            #921 <String "left">
	//* 440 1161:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 441 1164:ifeq            1175
						obj1 = ((Object) (com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController.APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionLeft));
	//  442 1167:getstatic       #924 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionLeft>
	//  443 1170:astore          4
					else
	//* 444 1172:goto            1199
					if(((String) (obj1)).equals("right"))
	//* 445 1175:aload           4
	//* 446 1177:ldc2            #926 <String "right">
	//* 447 1180:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 448 1183:ifeq            1194
						obj1 = ((Object) (com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController.APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionRight));
	//  449 1186:getstatic       #222 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionRight>
	//  450 1189:astore          4
					else
	//* 451 1191:goto            1199
						obj1 = ((Object) (com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController.APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionHidden));
	//  452 1194:getstatic       #929 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionHidden>
	//  453 1197:astore          4
					skipButtonProgressPosition = ((com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController.APSSkipOverlayProgressPosition) (obj1));
	//  454 1199:aload_0         
	//  455 1200:aload           4
	//  456 1202:putfield        #224 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition skipButtonProgressPosition>
				}
				if(linkedtreemap.get("circleColor") != null)
	//* 457 1205:aload           5
	//* 458 1207:ldc2            #931 <String "circleColor">
	//* 459 1210:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 460 1213:ifnull          1231
					skipButtonProgressCircleColor = (String)linkedtreemap.get("circleColor");
	//  461 1216:aload_0         
	//  462 1217:aload           5
	//  463 1219:ldc2            #931 <String "circleColor">
	//  464 1222:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  465 1225:checkcast       #155 <Class String>
	//  466 1228:putfield        #372 <Field String skipButtonProgressCircleColor>
				if(linkedtreemap.get("trackColor") != null)
	//* 467 1231:aload           5
	//* 468 1233:ldc2            #933 <String "trackColor">
	//* 469 1236:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 470 1239:ifnull          1257
					skipButtonProgressCircleTrackColor = (String)linkedtreemap.get("trackColor");
	//  471 1242:aload_0         
	//  472 1243:aload           5
	//  473 1245:ldc2            #933 <String "trackColor">
	//  474 1248:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  475 1251:checkcast       #155 <Class String>
	//  476 1254:putfield        #376 <Field String skipButtonProgressCircleTrackColor>
				if(linkedtreemap.get("textColor") != null)
	//* 477 1257:aload           5
	//* 478 1259:ldc2            #900 <String "textColor">
	//* 479 1262:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 480 1265:ifnull          1283
					skipButtonProgressCircleTextColor = (String)linkedtreemap.get("textColor");
	//  481 1268:aload_0         
	//  482 1269:aload           5
	//  483 1271:ldc2            #900 <String "textColor">
	//  484 1274:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  485 1277:checkcast       #155 <Class String>
	//  486 1280:putfield        #374 <Field String skipButtonProgressCircleTextColor>
			}
		}
		obj1 = ((Object) ((LinkedTreeMap)map.get("countdown")));
	//  487 1283:aload_1         
	//  488 1284:ldc2            #935 <String "countdown">
	//  489 1287:invokeinterface #804 <Method Object Map.get(Object)>
	//  490 1292:checkcast       #441 <Class LinkedTreeMap>
	//  491 1295:astore          4
		if(obj1 != null)
	//* 492 1297:aload           4
	//* 493 1299:ifnull          1516
		{
			if(((LinkedTreeMap) (obj1)).get("show") != null)
	//* 494 1302:aload           4
	//* 495 1304:ldc2            #937 <String "show">
	//* 496 1307:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 497 1310:ifnull          1331
				showCountdown = ((Boolean)((LinkedTreeMap) (obj1)).get("show")).booleanValue();
	//  498 1313:aload_0         
	//  499 1314:aload           4
	//  500 1316:ldc2            #937 <String "show">
	//  501 1319:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  502 1322:checkcast       #939 <Class Boolean>
	//  503 1325:invokevirtual   #942 <Method boolean Boolean.booleanValue()>
	//  504 1328:putfield        #198 <Field boolean showCountdown>
			if(((LinkedTreeMap) (obj1)).get("position") != null)
	//* 505 1331:aload           4
	//* 506 1333:ldc2            #826 <String "position">
	//* 507 1336:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 508 1339:ifnull          1360
				countdownPosition = APSMediaBuilder.positionFromString((String)((LinkedTreeMap) (obj1)).get("position"));
	//  509 1342:aload_0         
	//  510 1343:aload           4
	//  511 1345:ldc2            #826 <String "position">
	//  512 1348:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  513 1351:checkcast       #155 <Class String>
	//  514 1354:invokestatic    #891 <Method APSMediaOverlay$APSMediaOverlayPosition APSMediaBuilder.positionFromString(String)>
	//  515 1357:putfield        #205 <Field APSMediaOverlay$APSMediaOverlayPosition countdownPosition>
			if(((LinkedTreeMap) (obj1)).get("text") != null)
	//* 516 1360:aload           4
	//* 517 1362:ldc2            #898 <String "text">
	//* 518 1365:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 519 1368:ifnull          1386
				countdownText = (String)((LinkedTreeMap) (obj1)).get("text");
	//  520 1371:aload_0         
	//  521 1372:aload           4
	//  522 1374:ldc2            #898 <String "text">
	//  523 1377:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  524 1380:checkcast       #155 <Class String>
	//  525 1383:putfield        #356 <Field String countdownText>
			if(((LinkedTreeMap) (obj1)).get("width") != null)
	//* 526 1386:aload           4
	//* 527 1388:ldc2            #909 <String "width">
	//* 528 1391:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 529 1394:ifnull          1412
				countdownWidth = (String)((LinkedTreeMap) (obj1)).get("width");
	//  530 1397:aload_0         
	//  531 1398:aload           4
	//  532 1400:ldc2            #909 <String "width">
	//  533 1403:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  534 1406:checkcast       #155 <Class String>
	//  535 1409:putfield        #238 <Field String countdownWidth>
			if(((LinkedTreeMap) (obj1)).get("height") != null)
	//* 536 1412:aload           4
	//* 537 1414:ldc2            #873 <String "height">
	//* 538 1417:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 539 1420:ifnull          1438
				countdownHeight = (String)((LinkedTreeMap) (obj1)).get("height");
	//  540 1423:aload_0         
	//  541 1424:aload           4
	//  542 1426:ldc2            #873 <String "height">
	//  543 1429:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  544 1432:checkcast       #155 <Class String>
	//  545 1435:putfield        #240 <Field String countdownHeight>
			if(((LinkedTreeMap) (obj1)).get("font") != null)
	//* 546 1438:aload           4
	//* 547 1440:ldc2            #944 <String "font">
	//* 548 1443:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 549 1446:ifnull          1464
				countdownFont = (String)((LinkedTreeMap) (obj1)).get("font");
	//  550 1449:aload_0         
	//  551 1450:aload           4
	//  552 1452:ldc2            #944 <String "font">
	//  553 1455:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  554 1458:checkcast       #155 <Class String>
	//  555 1461:putfield        #358 <Field String countdownFont>
			if(((LinkedTreeMap) (obj1)).get("size") != null)
	//* 556 1464:aload           4
	//* 557 1466:ldc2            #945 <String "size">
	//* 558 1469:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 559 1472:ifnull          1490
				countdownSize = (String)((LinkedTreeMap) (obj1)).get("size");
	//  560 1475:aload_0         
	//  561 1476:aload           4
	//  562 1478:ldc2            #945 <String "size">
	//  563 1481:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  564 1484:checkcast       #155 <Class String>
	//  565 1487:putfield        #360 <Field String countdownSize>
			if(((LinkedTreeMap) (obj1)).get("color") != null)
	//* 566 1490:aload           4
	//* 567 1492:ldc2            #915 <String "color">
	//* 568 1495:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 569 1498:ifnull          1516
				countdownColor = (String)((LinkedTreeMap) (obj1)).get("color");
	//  570 1501:aload_0         
	//  571 1502:aload           4
	//  572 1504:ldc2            #915 <String "color">
	//  573 1507:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  574 1510:checkcast       #155 <Class String>
	//  575 1513:putfield        #362 <Field String countdownColor>
		}
		map = ((Map) ((LinkedTreeMap)map.get("banners")));
	//  576 1516:aload_1         
	//  577 1517:ldc2            #947 <String "banners">
	//  578 1520:invokeinterface #804 <Method Object Map.get(Object)>
	//  579 1525:checkcast       #441 <Class LinkedTreeMap>
	//  580 1528:astore_1        
		if(map == null)
			break MISSING_BLOCK_LABEL_2078;
	//  581 1529:aload_1         
	//  582 1530:ifnull          2078
		if(((LinkedTreeMap) (map)).get("maxWidth") != null && ((LinkedTreeMap) (map)).get("maxHeight") != null)
	//* 583 1533:aload_1         
	//* 584 1534:ldc2            #949 <String "maxWidth">
	//* 585 1537:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 586 1540:ifnull          1587
	//* 587 1543:aload_1         
	//* 588 1544:ldc2            #951 <String "maxHeight">
	//* 589 1547:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 590 1550:ifnull          1587
		{
			bannerMaxSizeWidth = ((Integer)((LinkedTreeMap) (map)).get("maxWidth")).intValue();
	//  591 1553:aload_0         
	//  592 1554:aload_1         
	//  593 1555:ldc2            #949 <String "maxWidth">
	//  594 1558:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  595 1561:checkcast       #875 <Class Integer>
	//  596 1564:invokevirtual   #878 <Method int Integer.intValue()>
	//  597 1567:putfield        #244 <Field int bannerMaxSizeWidth>
			bannerMaxSizeHeight = ((Integer)((LinkedTreeMap) (map)).get("maxHeight")).intValue();
	//  598 1570:aload_0         
	//  599 1571:aload_1         
	//  600 1572:ldc2            #951 <String "maxHeight">
	//  601 1575:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  602 1578:checkcast       #875 <Class Integer>
	//  603 1581:invokevirtual   #878 <Method int Integer.intValue()>
	//  604 1584:putfield        #246 <Field int bannerMaxSizeHeight>
		}
		if(((LinkedTreeMap) (map)).get("stretchToMax") != null)
	//* 605 1587:aload_1         
	//* 606 1588:ldc2            #953 <String "stretchToMax">
	//* 607 1591:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 608 1594:ifnull          1614
			stretchBannersToMaxSize = ((Boolean)((LinkedTreeMap) (map)).get("stretchToMax")).booleanValue();
	//  609 1597:aload_0         
	//  610 1598:aload_1         
	//  611 1599:ldc2            #953 <String "stretchToMax">
	//  612 1602:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  613 1605:checkcast       #939 <Class Boolean>
	//  614 1608:invokevirtual   #942 <Method boolean Boolean.booleanValue()>
	//  615 1611:putfield        #248 <Field boolean stretchBannersToMaxSize>
		if(((LinkedTreeMap) (map)).get("position") != null)
	//* 616 1614:aload_1         
	//* 617 1615:ldc2            #826 <String "position">
	//* 618 1618:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 619 1621:ifnull          1641
			bannerPosition = APSMediaBuilder.positionFromString((String)((LinkedTreeMap) (map)).get("position"));
	//  620 1624:aload_0         
	//  621 1625:aload_1         
	//  622 1626:ldc2            #826 <String "position">
	//  623 1629:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  624 1632:checkcast       #155 <Class String>
	//  625 1635:invokestatic    #891 <Method APSMediaOverlay$APSMediaOverlayPosition APSMediaBuilder.positionFromString(String)>
	//  626 1638:putfield        #269 <Field APSMediaOverlay$APSMediaOverlayPosition bannerPosition>
		if(((LinkedTreeMap) (map)).get("fadeIn") != null)
	//* 627 1641:aload_1         
	//* 628 1642:ldc2            #880 <String "fadeIn">
	//* 629 1645:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 630 1648:ifnull          1668
			bannerFadeInDuration = ((Double)((LinkedTreeMap) (map)).get("fadeIn")).floatValue();
	//  631 1651:aload_0         
	//  632 1652:aload_1         
	//  633 1653:ldc2            #880 <String "fadeIn">
	//  634 1656:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  635 1659:checkcast       #882 <Class Double>
	//  636 1662:invokevirtual   #885 <Method float Double.floatValue()>
	//  637 1665:putfield        #210 <Field float bannerFadeInDuration>
		if(((LinkedTreeMap) (map)).get("defaultDuration") != null)
	//* 638 1668:aload_1         
	//* 639 1669:ldc2            #955 <String "defaultDuration">
	//* 640 1672:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 641 1675:ifnull          1695
			defaultBannerAdBreakDuration = ((Integer)((LinkedTreeMap) (map)).get("defaultDuration")).intValue();
	//  642 1678:aload_0         
	//  643 1679:aload_1         
	//  644 1680:ldc2            #955 <String "defaultDuration">
	//  645 1683:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  646 1686:checkcast       #875 <Class Integer>
	//  647 1689:invokevirtual   #878 <Method int Integer.intValue()>
	//  648 1692:putfield        #242 <Field int defaultBannerAdBreakDuration>
		if(((LinkedTreeMap) (map)).get("skipOffset") != null)
	//* 649 1695:aload_1         
	//* 650 1696:ldc2            #957 <String "skipOffset">
	//* 651 1699:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 652 1702:ifnull          1722
			bannerSkipOffset = ((Integer)((LinkedTreeMap) (map)).get("skipOffset")).intValue();
	//  653 1705:aload_0         
	//  654 1706:aload_1         
	//  655 1707:ldc2            #957 <String "skipOffset">
	//  656 1710:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  657 1713:checkcast       #875 <Class Integer>
	//  658 1716:invokevirtual   #878 <Method int Integer.intValue()>
	//  659 1719:putfield        #264 <Field int bannerSkipOffset>
		map = ((Map) ((LinkedTreeMap)((LinkedTreeMap) (map)).get("closeButton")));
	//  660 1722:aload_1         
	//  661 1723:ldc2            #959 <String "closeButton">
	//  662 1726:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  663 1729:checkcast       #441 <Class LinkedTreeMap>
	//  664 1732:astore_1        
		if(map == null)
			break MISSING_BLOCK_LABEL_2078;
	//  665 1733:aload_1         
	//  666 1734:ifnull          2078
		if(((LinkedTreeMap) (map)).get("image") == null)
			break MISSING_BLOCK_LABEL_1793;
	//  667 1737:aload_1         
	//  668 1738:ldc2            #961 <String "image">
	//  669 1741:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  670 1744:ifnull          1793
		Bitmap bitmap = (Bitmap)(new GetImageAsync()).execute(((Object []) (new String[] {
			(String)((LinkedTreeMap) (map)).get("image")
		}))).get();
	//  671 1747:new             #963 <Class GetImageAsync>
	//  672 1750:dup             
	//  673 1751:invokespecial   #964 <Method void GetImageAsync()>
	//  674 1754:iconst_1        
	//  675 1755:anewarray       String[]
	//  676 1758:dup             
	//  677 1759:iconst_0        
	//  678 1760:aload_1         
	//  679 1761:ldc2            #961 <String "image">
	//  680 1764:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//  681 1767:checkcast       #155 <Class String>
	//  682 1770:aastore         
	//  683 1771:invokevirtual   #965 <Method AsyncTask GetImageAsync.execute(Object[])>
	//  684 1774:invokevirtual   #795 <Method Object AsyncTask.get()>
	//  685 1777:checkcast       #394 <Class Bitmap>
	//  686 1780:astore          4
		if(bitmap != null)
	//* 687 1782:aload           4
	//* 688 1784:ifnull          1793
			try
			{
				bannerCloseButtonImage = bitmap;
	//  689 1787:aload_0         
	//  690 1788:aload           4
	//  691 1790:putfield        #400 <Field Bitmap bannerCloseButtonImage>
			}
	//* 692 1793:aload_1         
	//* 693 1794:ldc2            #945 <String "size">
	//* 694 1797:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 695 1800:ifnull          1820
	//* 696 1803:aload_0         
	//* 697 1804:aload_1         
	//* 698 1805:ldc2            #945 <String "size">
	//* 699 1808:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 700 1811:checkcast       #875 <Class Integer>
	//* 701 1814:invokevirtual   #878 <Method int Integer.intValue()>
	//* 702 1817:putfield        #278 <Field int bannerCloseButtonSize>
	//* 703 1820:aload_1         
	//* 704 1821:ldc2            #911 <String "backgroundColor">
	//* 705 1824:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 706 1827:ifnull          1844
	//* 707 1830:aload_0         
	//* 708 1831:aload_1         
	//* 709 1832:ldc2            #911 <String "backgroundColor">
	//* 710 1835:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 711 1838:checkcast       #155 <Class String>
	//* 712 1841:putfield        #402 <Field String bannerCloseButtonBackgroundColor>
	//* 713 1844:aload_1         
	//* 714 1845:ldc2            #967 <String "xColor">
	//* 715 1848:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 716 1851:ifnull          1868
	//* 717 1854:aload_0         
	//* 718 1855:aload_1         
	//* 719 1856:ldc2            #967 <String "xColor">
	//* 720 1859:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 721 1862:checkcast       #155 <Class String>
	//* 722 1865:putfield        #404 <Field String bannerCloseButtonXColor>
	//* 723 1868:aload_1         
	//* 724 1869:ldc2            #969 <String "progressColor">
	//* 725 1872:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 726 1875:ifnull          1892
	//* 727 1878:aload_0         
	//* 728 1879:aload_1         
	//* 729 1880:ldc2            #969 <String "progressColor">
	//* 730 1883:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 731 1886:checkcast       #155 <Class String>
	//* 732 1889:putfield        #406 <Field String bannerCloseButtonProgressColor>
	//* 733 1892:aload_1         
	//* 734 1893:ldc2            #933 <String "trackColor">
	//* 735 1896:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 736 1899:ifnull          1916
	//* 737 1902:aload_0         
	//* 738 1903:aload_1         
	//* 739 1904:ldc2            #933 <String "trackColor">
	//* 740 1907:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 741 1910:checkcast       #155 <Class String>
	//* 742 1913:putfield        #408 <Field String bannerCloseButtonTrackColor>
	//* 743 1916:aload_1         
	//* 744 1917:ldc2            #971 <String "offsetX">
	//* 745 1920:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 746 1923:ifnull          1970
	//* 747 1926:aload_1         
	//* 748 1927:ldc2            #973 <String "offsetY">
	//* 749 1930:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 750 1933:ifnull          1970
	//* 751 1936:aload_0         
	//* 752 1937:aload_1         
	//* 753 1938:ldc2            #971 <String "offsetX">
	//* 754 1941:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 755 1944:checkcast       #155 <Class String>
	//* 756 1947:invokestatic    #906 <Method int Integer.parseInt(String)>
	//* 757 1950:putfield        #280 <Field int bannerCloseButtonOffsetX>
	//* 758 1953:aload_0         
	//* 759 1954:aload_1         
	//* 760 1955:ldc2            #973 <String "offsetY">
	//* 761 1958:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 762 1961:checkcast       #155 <Class String>
	//* 763 1964:invokestatic    #906 <Method int Integer.parseInt(String)>
	//* 764 1967:putfield        #282 <Field int bannerCloseButtonOffsetY>
	//* 765 1970:aload_1         
	//* 766 1971:ldc2            #975 <String "initialAlpha">
	//* 767 1974:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 768 1977:ifnull          1997
	//* 769 1980:aload_0         
	//* 770 1981:aload_1         
	//* 771 1982:ldc2            #975 <String "initialAlpha">
	//* 772 1985:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 773 1988:checkcast       #882 <Class Double>
	//* 774 1991:invokevirtual   #885 <Method float Double.floatValue()>
	//* 775 1994:putfield        #273 <Field float bannerCloseButtonInitialAlpha>
	//* 776 1997:aload_1         
	//* 777 1998:ldc2            #977 <String "finalAlpha">
	//* 778 2001:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 779 2004:ifnull          2024
	//* 780 2007:aload_0         
	//* 781 2008:aload_1         
	//* 782 2009:ldc2            #977 <String "finalAlpha">
	//* 783 2012:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 784 2015:checkcast       #882 <Class Double>
	//* 785 2018:invokevirtual   #885 <Method float Double.floatValue()>
	//* 786 2021:putfield        #276 <Field float bannerCloseButtonFinalAlpha>
	//* 787 2024:aload_1         
	//* 788 2025:ldc2            #937 <String "show">
	//* 789 2028:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 790 2031:ifnull          2051
	//* 791 2034:aload_0         
	//* 792 2035:aload_1         
	//* 793 2036:ldc2            #937 <String "show">
	//* 794 2039:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 795 2042:checkcast       #939 <Class Boolean>
	//* 796 2045:invokevirtual   #942 <Method boolean Boolean.booleanValue()>
	//* 797 2048:putfield        #271 <Field boolean showBannerCloseButton>
	//* 798 2051:aload_1         
	//* 799 2052:ldc2            #979 <String "activationOffset">
	//* 800 2055:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 801 2058:ifnull          2078
	//* 802 2061:aload_0         
	//* 803 2062:aload_1         
	//* 804 2063:ldc2            #979 <String "activationOffset">
	//* 805 2066:invokevirtual   #446 <Method Object LinkedTreeMap.get(Object)>
	//* 806 2069:checkcast       #875 <Class Integer>
	//* 807 2072:invokevirtual   #878 <Method int Integer.intValue()>
	//* 808 2075:putfield        #264 <Field int bannerSkipOffset>
	//* 809 2078:iconst_1        
	//* 810 2079:ireturn         
			catch(Exception exception) { }
	//  811 2080:astore          4
		if(((LinkedTreeMap) (map)).get("size") != null)
			bannerCloseButtonSize = ((Integer)((LinkedTreeMap) (map)).get("size")).intValue();
		if(((LinkedTreeMap) (map)).get("backgroundColor") != null)
			bannerCloseButtonBackgroundColor = (String)((LinkedTreeMap) (map)).get("backgroundColor");
		if(((LinkedTreeMap) (map)).get("xColor") != null)
			bannerCloseButtonXColor = (String)((LinkedTreeMap) (map)).get("xColor");
		if(((LinkedTreeMap) (map)).get("progressColor") != null)
			bannerCloseButtonProgressColor = (String)((LinkedTreeMap) (map)).get("progressColor");
		if(((LinkedTreeMap) (map)).get("trackColor") != null)
			bannerCloseButtonTrackColor = (String)((LinkedTreeMap) (map)).get("trackColor");
		if(((LinkedTreeMap) (map)).get("offsetX") != null && ((LinkedTreeMap) (map)).get("offsetY") != null)
		{
			bannerCloseButtonOffsetX = Integer.parseInt((String)((LinkedTreeMap) (map)).get("offsetX"));
			bannerCloseButtonOffsetY = Integer.parseInt((String)((LinkedTreeMap) (map)).get("offsetY"));
		}
		if(((LinkedTreeMap) (map)).get("initialAlpha") != null)
			bannerCloseButtonInitialAlpha = ((Double)((LinkedTreeMap) (map)).get("initialAlpha")).floatValue();
		if(((LinkedTreeMap) (map)).get("finalAlpha") != null)
			bannerCloseButtonFinalAlpha = ((Double)((LinkedTreeMap) (map)).get("finalAlpha")).floatValue();
		if(((LinkedTreeMap) (map)).get("show") != null)
			showBannerCloseButton = ((Boolean)((LinkedTreeMap) (map)).get("show")).booleanValue();
		if(((LinkedTreeMap) (map)).get("activationOffset") != null)
			bannerSkipOffset = ((Integer)((LinkedTreeMap) (map)).get("activationOffset")).intValue();
		return true;
	//* 812 2082:goto            1793
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onPreload()
	{
		ArrayList arraylist1;
		ArrayList arraylist2;
		Object obj = ((Object) (ads));
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field ArrayList ads>
	//    2    4:astore_2        
		if(obj != null && buffet != null && (((ArrayList) (obj)).size() > 0 || buffet.size() > 0))
	//*   3    5:aload_2         
	//*   4    6:ifnull          41
	//*   5    9:aload_0         
	//*   6   10:getfield        #144 <Field ArrayList buffet>
	//*   7   13:ifnull          41
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #604 <Method int ArrayList.size()>
	//*  10   20:ifgt            33
	//*  11   23:aload_0         
	//*  12   24:getfield        #144 <Field ArrayList buffet>
	//*  13   27:invokevirtual   #604 <Method int ArrayList.size()>
	//*  14   30:ifle            41
		{
			updateState(APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloaded);
	//   15   33:aload_0         
	//   16   34:getstatic       #988 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloaded>
	//   17   37:invokevirtual   #992 <Method void updateState(APSMediaEvent$APSMediaEventState)>
			return;
	//   18   40:return          
		}
		if(sources == null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #140 <Field ArrayList sources>
	//*  21   45:ifnonnull       65
		{
			APSMediaPlayer.getInstance().log("AdBreak configured with null sources.");
	//   22   48:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   23   51:ldc2            #994 <String "AdBreak configured with null sources.">
	//   24   54:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
			updateState(APSMediaEvent.APSMediaEventState.APSMediaEventStateFailed);
	//   25   57:aload_0         
	//   26   58:getstatic       #997 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateFailed>
	//   27   61:invokevirtual   #992 <Method void updateState(APSMediaEvent$APSMediaEventState)>
			return;
	//   28   64:return          
		}
		arraylist1 = new ArrayList();
	//   29   65:new             #137 <Class ArrayList>
	//   30   68:dup             
	//   31   69:invokespecial   #138 <Method void ArrayList()>
	//   32   72:astore_3        
		arraylist2 = new ArrayList();
	//   33   73:new             #137 <Class ArrayList>
	//   34   76:dup             
	//   35   77:invokespecial   #138 <Method void ArrayList()>
	//   36   80:astore          4
		Object obj1 = ((Object) (sources.iterator()));
	//   37   82:aload_0         
	//   38   83:getfield        #140 <Field ArrayList sources>
	//   39   86:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//   40   89:astore          5
		for(int i = 0; ((Iterator) (obj1)).hasNext(); i++)
	//*  41   91:iconst_0        
	//*  42   92:istore_1        
	//*  43   93:aload           5
	//*  44   95:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//*  45  100:ifeq            330
		{
			Object obj2 = ((Iterator) (obj1)).next();
	//   46  103:aload           5
	//   47  105:invokeinterface #437 <Method Object Iterator.next()>
	//   48  110:astore          6
			if(followWrappers)
	//*  49  112:aload_0         
	//*  50  113:getfield        #284 <Field boolean followWrappers>
	//*  51  116:ifeq            130
				obj = ((Object) (new ArrayList()));
	//   52  119:new             #137 <Class ArrayList>
	//   53  122:dup             
	//   54  123:invokespecial   #138 <Method void ArrayList()>
	//   55  126:astore_2        
			else
	//*  56  127:goto            132
				obj = null;
	//   57  130:aconst_null     
	//   58  131:astore_2        
			if(obj2 instanceof String)
	//*  59  132:aload           6
	//*  60  134:instanceof      #155 <Class String>
	//*  61  137:ifeq            251
			{
				APSMediaPlayer apsmediaplayer1 = APSMediaPlayer.getInstance();
	//   62  140:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   63  143:astore          7
				StringBuilder stringbuilder1 = new StringBuilder();
	//   64  145:new             #768 <Class StringBuilder>
	//   65  148:dup             
	//   66  149:invokespecial   #769 <Method void StringBuilder()>
	//   67  152:astore          8
				stringbuilder1.append("Loading VAST from URL: ");
	//   68  154:aload           8
	//   69  156:ldc2            #999 <String "Loading VAST from URL: ">
	//   70  159:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//   71  162:pop             
				stringbuilder1.append(obj2);
	//   72  163:aload           8
	//   73  165:aload           6
	//   74  167:invokevirtual   #1002 <Method StringBuilder StringBuilder.append(Object)>
	//   75  170:pop             
				apsmediaplayer1.log(stringbuilder1.toString());
	//   76  171:aload           7
	//   77  173:aload           8
	//   78  175:invokevirtual   #778 <Method String StringBuilder.toString()>
	//   79  178:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
				obj = ((Object) (adsForURLWithWrappers((String)obj2, ((ArrayList) (obj)), i)));
	//   80  181:aload_0         
	//   81  182:aload           6
	//   82  184:checkcast       #155 <Class String>
	//   83  187:aload_2         
	//   84  188:iload_1         
	//   85  189:invokevirtual   #669 <Method HashMap adsForURLWithWrappers(String, ArrayList, int)>
	//   86  192:astore_2        
				if(obj == null)
					continue;
	//   87  193:aload_2         
	//   88  194:ifnull          323
				if(((HashMap) (obj)).get("pod") != null)
	//*  89  197:aload_2         
	//*  90  198:ldc2            #624 <String "pod">
	//*  91  201:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//*  92  204:ifnull          222
					arraylist1.addAll((Collection)((HashMap) (obj)).get("pod"));
	//   93  207:aload_3         
	//   94  208:aload_2         
	//   95  209:ldc2            #624 <String "pod">
	//   96  212:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//   97  215:checkcast       #671 <Class Collection>
	//   98  218:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//   99  221:pop             
				if(((HashMap) (obj)).get("buffet") != null)
	//* 100  222:aload_2         
	//* 101  223:ldc2            #629 <String "buffet">
	//* 102  226:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 103  229:ifnull          323
					arraylist2.addAll((Collection)((HashMap) (obj)).get("buffet"));
	//  104  232:aload           4
	//  105  234:aload_2         
	//  106  235:ldc2            #629 <String "buffet">
	//  107  238:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  108  241:checkcast       #671 <Class Collection>
	//  109  244:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  110  247:pop             
				continue;
	//  111  248:goto            323
			}
			if(!(obj2 instanceof APSVASTRootNode))
				continue;
	//  112  251:aload           6
	//  113  253:instanceof      #593 <Class APSVASTRootNode>
	//  114  256:ifeq            323
			obj = ((Object) (adsForRootWithWrappers((APSVASTRootNode)obj2, ((ArrayList) (obj)), i, ((String) (null)))));
	//  115  259:aload_0         
	//  116  260:aload           6
	//  117  262:checkcast       #593 <Class APSVASTRootNode>
	//  118  265:aload_2         
	//  119  266:iload_1         
	//  120  267:aconst_null     
	//  121  268:invokevirtual   #611 <Method HashMap adsForRootWithWrappers(APSVASTRootNode, ArrayList, int, String)>
	//  122  271:astore_2        
			if(((HashMap) (obj)).get("pod") != null)
	//* 123  272:aload_2         
	//* 124  273:ldc2            #624 <String "pod">
	//* 125  276:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 126  279:ifnull          297
				arraylist1.addAll((Collection)((HashMap) (obj)).get("pod"));
	//  127  282:aload_3         
	//  128  283:aload_2         
	//  129  284:ldc2            #624 <String "pod">
	//  130  287:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  131  290:checkcast       #671 <Class Collection>
	//  132  293:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  133  296:pop             
			if(((HashMap) (obj)).get("buffet") != null)
	//* 134  297:aload_2         
	//* 135  298:ldc2            #629 <String "buffet">
	//* 136  301:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 137  304:ifnull          323
				arraylist2.addAll((Collection)((HashMap) (obj)).get("buffet"));
	//  138  307:aload           4
	//  139  309:aload_2         
	//  140  310:ldc2            #629 <String "buffet">
	//  141  313:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  142  316:checkcast       #671 <Class Collection>
	//  143  319:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  144  322:pop             
		}

	//  145  323:iload_1         
	//  146  324:iconst_1        
	//  147  325:iadd            
	//  148  326:istore_1        
	//* 149  327:goto            93
		if(arraylist1.size() <= 0)
			break MISSING_BLOCK_LABEL_592;
	//  150  330:aload_3         
	//  151  331:invokevirtual   #604 <Method int ArrayList.size()>
	//  152  334:ifle            592
		obj = ((Object) (APSMediaPlayer.getInstance()));
	//  153  337:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  154  340:astore_2        
		obj1 = ((Object) (new StringBuilder()));
	//  155  341:new             #768 <Class StringBuilder>
	//  156  344:dup             
	//  157  345:invokespecial   #769 <Method void StringBuilder()>
	//  158  348:astore          5
		((StringBuilder) (obj1)).append("Retrieved ");
	//  159  350:aload           5
	//  160  352:ldc2            #1004 <String "Retrieved ">
	//  161  355:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  162  358:pop             
		((StringBuilder) (obj1)).append(arraylist1.size());
	//  163  359:aload           5
	//  164  361:aload_3         
	//  165  362:invokevirtual   #604 <Method int ArrayList.size()>
	//  166  365:invokevirtual   #1007 <Method StringBuilder StringBuilder.append(int)>
	//  167  368:pop             
		((StringBuilder) (obj1)).append(" ads");
	//  168  369:aload           5
	//  169  371:ldc2            #1009 <String " ads">
	//  170  374:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  171  377:pop             
		((APSMediaPlayer) (obj)).log(((StringBuilder) (obj1)).toString());
	//  172  378:aload_2         
	//  173  379:aload           5
	//  174  381:invokevirtual   #778 <Method String StringBuilder.toString()>
	//  175  384:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
		if(allowMultipleAds || arraylist1.size() <= 1) goto _L2; else goto _L1
	//  176  387:aload_0         
	//  177  388:getfield        #410 <Field boolean allowMultipleAds>
	//  178  391:ifne            506
	//  179  394:aload_3         
	//  180  395:invokevirtual   #604 <Method int ArrayList.size()>
	//  181  398:iconst_1        
	//  182  399:icmple          506
_L1:
		_cls2..SwitchMap.com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy[multipleAdsConflictsPolicy.ordinal()];
	//  183  402:getstatic       #700 <Field int[] APSVastAdBreak$2.$SwitchMap$com$appscend$media$APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
	//  184  405:aload_0         
	//  185  406:getfield        #255 <Field com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy multipleAdsConflictsPolicy>
	//  186  409:invokevirtual   #703 <Method int com.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy.ordinal()>
	//  187  412:iaload          
		JVM INSTR tableswitch 1 3: default 440
	//	               1 495
	//	               2 476
	//	               3 443;
	//  188  413:tableswitch     1 3: default 440
	//	               1 495
	//	               2 476
	//	               3 443
		   goto _L2 _L3 _L4 _L5
	//* 189  440:goto            506
_L5:
		ArrayList arraylist;
		arraylist = new ArrayList(((Collection) (Collections.singletonList(arraylist1.get((new Random()).nextInt() % arraylist1.size())))));
	//  190  443:new             #137 <Class ArrayList>
	//  191  446:dup             
	//  192  447:aload_3         
	//  193  448:new             #705 <Class Random>
	//  194  451:dup             
	//  195  452:invokespecial   #706 <Method void Random()>
	//  196  455:invokevirtual   #709 <Method int Random.nextInt()>
	//  197  458:aload_3         
	//  198  459:invokevirtual   #604 <Method int ArrayList.size()>
	//  199  462:irem            
	//  200  463:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//  201  466:invokestatic    #554 <Method List Collections.singletonList(Object)>
	//  202  469:invokespecial   #180 <Method void ArrayList(Collection)>
	//  203  472:astore_2        
		break; /* Loop/switch isn't completed */
	//  204  473:goto            508
_L4:
		arraylist = new ArrayList(((Collection) (Collections.singletonList(arraylist1.get(0)))));
	//  205  476:new             #137 <Class ArrayList>
	//  206  479:dup             
	//  207  480:aload_3         
	//  208  481:iconst_0        
	//  209  482:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//  210  485:invokestatic    #554 <Method List Collections.singletonList(Object)>
	//  211  488:invokespecial   #180 <Method void ArrayList(Collection)>
	//  212  491:astore_2        
		break; /* Loop/switch isn't completed */
	//  213  492:goto            508
_L3:
		trackErrorWithCode(1003, "adbreak does not allow multiple ads");
	//  214  495:aload_0         
	//  215  496:sipush          1003
	//  216  499:ldc2            #1011 <String "adbreak does not allow multiple ads">
	//  217  502:invokevirtual   #1015 <Method void trackErrorWithCode(int, String)>
		return;
	//  218  505:return          
_L2:
		arraylist = arraylist1;
	//  219  506:aload_3         
	//  220  507:astore_2        
		APSMediaPlayer apsmediaplayer = APSMediaPlayer.getInstance();
	//  221  508:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  222  511:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//  223  512:new             #768 <Class StringBuilder>
	//  224  515:dup             
	//  225  516:invokespecial   #769 <Method void StringBuilder()>
	//  226  519:astore          5
		stringbuilder.append("Ads after applying multiple ads policy: ");
	//  227  521:aload           5
	//  228  523:ldc2            #1017 <String "Ads after applying multiple ads policy: ">
	//  229  526:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  230  529:pop             
		stringbuilder.append(arraylist.size());
	//  231  530:aload           5
	//  232  532:aload_2         
	//  233  533:invokevirtual   #604 <Method int ArrayList.size()>
	//  234  536:invokevirtual   #1007 <Method StringBuilder StringBuilder.append(int)>
	//  235  539:pop             
		apsmediaplayer.log(stringbuilder.toString());
	//  236  540:aload_3         
	//  237  541:aload           5
	//  238  543:invokevirtual   #778 <Method String StringBuilder.toString()>
	//  239  546:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
		ads = arraylist;
	//  240  549:aload_0         
	//  241  550:aload_2         
	//  242  551:putfield        #142 <Field ArrayList ads>
		buffet = arraylist2;
	//  243  554:aload_0         
	//  244  555:aload           4
	//  245  557:putfield        #144 <Field ArrayList buffet>
		if(getState() == APSMediaEvent.APSMediaEventState.APSMediaEventStateUnloaded)
	//* 246  560:aload_0         
	//* 247  561:invokevirtual   #1021 <Method APSMediaEvent$APSMediaEventState getState()>
	//* 248  564:getstatic       #1024 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateUnloaded>
	//* 249  567:if_acmpne       584
		{
			APSMediaPlayer.getInstance().log("AdBreak was unloaded before preloaded finished.");
	//  250  570:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  251  573:ldc2            #1026 <String "AdBreak was unloaded before preloaded finished.">
	//  252  576:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
			onUnload();
	//  253  579:aload_0         
	//  254  580:invokevirtual   #1029 <Method void onUnload()>
			return;
	//  255  583:return          
		} else
		{
			updateState(APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloaded);
	//  256  584:aload_0         
	//  257  585:getstatic       #988 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloaded>
	//  258  588:invokevirtual   #992 <Method void updateState(APSMediaEvent$APSMediaEventState)>
			return;
	//  259  591:return          
		}
		updateState(APSMediaEvent.APSMediaEventState.APSMediaEventStateFailed);
	//  260  592:aload_0         
	//  261  593:getstatic       #997 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateFailed>
	//  262  596:invokevirtual   #992 <Method void updateState(APSMediaEvent$APSMediaEventState)>
		return;
	//  263  599:return          
	}

	public void onTrigger()
	{
		if(type != APSVASTConfigurationOptions.APSVASTPreContent && type != APSVASTConfigurationOptions.APSVASTPostContent && type != APSVASTConfigurationOptions.APSVASTMidContent)
	//*   0    0:aload_0         
	//*   1    1:getfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
	//*   2    4:getstatic       #454 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
	//*   3    7:if_acmpeq       297
	//*   4   10:aload_0         
	//*   5   11:getfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
	//*   6   14:getstatic       #457 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPostContent>
	//*   7   17:if_acmpeq       297
	//*   8   20:aload_0         
	//*   9   21:getfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
	//*  10   24:getstatic       #504 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTMidContent>
	//*  11   27:if_acmpne       33
	//*  12   30:goto            297
		{
			ArrayList arraylist = overlaysForNonlinearsInInlineNodes(ads);
	//   13   33:aload_0         
	//   14   34:aload_0         
	//   15   35:getfield        #142 <Field ArrayList ads>
	//   16   38:invokevirtual   #722 <Method ArrayList overlaysForNonlinearsInInlineNodes(ArrayList)>
	//   17   41:astore_1        
			if(arraylist != null && arraylist.size() > 0)
	//*  18   42:aload_1         
	//*  19   43:ifnull          268
	//*  20   46:aload_1         
	//*  21   47:invokevirtual   #604 <Method int ArrayList.size()>
	//*  22   50:ifle            268
			{
				APSMediaOverlay apsmediaoverlay;
				for(Iterator iterator = arraylist.iterator(); iterator.hasNext(); apsmediaoverlay.setStartPoint(String.valueOf(startPoint())))
	//*  23   53:aload_1         
	//*  24   54:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//*  25   57:astore_2        
	//*  26   58:aload_2         
	//*  27   59:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//*  28   64:ifeq            118
				{
					apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//   29   67:aload_2         
	//   30   68:invokeinterface #437 <Method Object Iterator.next()>
	//   31   73:checkcast       #1032 <Class APSMediaOverlay>
	//   32   76:astore_3        
					if(apsmediaoverlay.position == APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionUnspecified)
	//*  33   77:aload_3         
	//*  34   78:getfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
	//*  35   81:getstatic       #1037 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionUnspecified>
	//*  36   84:if_acmpne       95
						apsmediaoverlay.position = bannerPosition;
	//   37   87:aload_3         
	//   38   88:aload_0         
	//   39   89:getfield        #269 <Field APSMediaOverlay$APSMediaOverlayPosition bannerPosition>
	//   40   92:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
					apsmediaoverlay.repeatAfter = repeatAfter;
	//   41   95:aload_3         
	//   42   96:aload_0         
	//   43   97:getfield        #1041 <Field long repeatAfter>
	//   44  100:l2f             
	//   45  101:putfield        #1043 <Field float APSMediaOverlay.repeatAfter>
				}

	//   46  104:aload_3         
	//   47  105:aload_0         
	//   48  106:invokevirtual   #1046 <Method int startPoint()>
	//   49  109:invokestatic    #544 <Method String String.valueOf(int)>
	//   50  112:invokevirtual   #1049 <Method void APSMediaOverlay.setStartPoint(String)>
	//*  51  115:goto            58
				APSMediaPlayer apsmediaplayer = APSMediaPlayer.getInstance();
	//   52  118:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   53  121:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   54  122:new             #768 <Class StringBuilder>
	//   55  125:dup             
	//   56  126:invokespecial   #769 <Method void StringBuilder()>
	//   57  129:astore_3        
				stringbuilder.append("Inserting ");
	//   58  130:aload_3         
	//   59  131:ldc2            #1051 <String "Inserting ">
	//   60  134:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//   61  137:pop             
				stringbuilder.append(arraylist.size());
	//   62  138:aload_3         
	//   63  139:aload_1         
	//   64  140:invokevirtual   #604 <Method int ArrayList.size()>
	//   65  143:invokevirtual   #1007 <Method StringBuilder StringBuilder.append(int)>
	//   66  146:pop             
				stringbuilder.append(" overlay(s)");
	//   67  147:aload_3         
	//   68  148:ldc2            #1053 <String " overlay(s)">
	//   69  151:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//   70  154:pop             
				apsmediaplayer.log(stringbuilder.toString());
	//   71  155:aload_2         
	//   72  156:aload_3         
	//   73  157:invokevirtual   #778 <Method String StringBuilder.toString()>
	//   74  160:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
				setAdBreakTrackingForArray(arraylist);
	//   75  163:aload_0         
	//   76  164:aload_1         
	//   77  165:invokevirtual   #1057 <Method void setAdBreakTrackingForArray(ArrayList)>
				APSMediaOverlay apsmediaoverlay1;
				for(Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); apsmediaoverlay1.metadata.put("aps_meta_type", "overlays."))
	//*  78  168:aload_1         
	//*  79  169:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//*  80  172:astore_2        
	//*  81  173:aload_2         
	//*  82  174:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//*  83  179:ifeq            258
				{
					apsmediaoverlay1 = (APSMediaOverlay)iterator1.next();
	//   84  182:aload_2         
	//   85  183:invokeinterface #437 <Method Object Iterator.next()>
	//   86  188:checkcast       #1032 <Class APSMediaOverlay>
	//   87  191:astore_3        
					apsmediaoverlay1.metadata.put("aps_vast_adbreak_index", ((Object) (Integer.valueOf(arraylist.indexOf(((Object) (apsmediaoverlay1)))))));
	//   88  192:aload_3         
	//   89  193:getfield        #1058 <Field HashMap APSMediaOverlay.metadata>
	//   90  196:ldc1            #39  <String "aps_vast_adbreak_index">
	//   91  198:aload_1         
	//   92  199:aload_3         
	//   93  200:invokevirtual   #1062 <Method int ArrayList.indexOf(Object)>
	//   94  203:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//   95  206:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//   96  209:pop             
					apsmediaoverlay1.metadata.put("aps_vast_adbreak_total", ((Object) (Integer.valueOf(arraylist.size()))));
	//   97  210:aload_3         
	//   98  211:getfield        #1058 <Field HashMap APSMediaOverlay.metadata>
	//   99  214:ldc1            #45  <String "aps_vast_adbreak_total">
	//  100  216:aload_1         
	//  101  217:invokevirtual   #604 <Method int ArrayList.size()>
	//  102  220:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  103  223:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  104  226:pop             
					apsmediaoverlay1.metadata.put("aps_vast_adbreak_offset", ((Object) (adOffset)));
	//  105  227:aload_3         
	//  106  228:getfield        #1058 <Field HashMap APSMediaOverlay.metadata>
	//  107  231:ldc1            #42  <String "aps_vast_adbreak_offset">
	//  108  233:aload_0         
	//  109  234:getfield        #326 <Field String adOffset>
	//  110  237:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  111  240:pop             
				}

	//  112  241:aload_3         
	//  113  242:getfield        #1058 <Field HashMap APSMediaOverlay.metadata>
	//  114  245:ldc2            #1067 <String "aps_meta_type">
	//  115  248:ldc2            #1069 <String "overlays.">
	//  116  251:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  117  254:pop             
	//* 118  255:goto            173
				APSMediaPlayer.getInstance().addOverlays(arraylist);
	//  119  258:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  120  261:aload_1         
	//  121  262:invokevirtual   #1072 <Method void APSMediaPlayer.addOverlays(ArrayList)>
			} else
	//* 122  265:goto            821
			{
				APSMediaPlayer.getInstance().log("AdBreak does not contain any valid units");
	//  123  268:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  124  271:ldc2            #1074 <String "AdBreak does not contain any valid units">
	//  125  274:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
				trackErrorWithCode(1006, "AdBreak does not contain any valid units");
	//  126  277:aload_0         
	//  127  278:sipush          1006
	//  128  281:ldc2            #1074 <String "AdBreak does not contain any valid units">
	//  129  284:invokevirtual   #1015 <Method void trackErrorWithCode(int, String)>
				updateState(APSMediaEvent.APSMediaEventState.APSMediaEventStateFailed);
	//  130  287:aload_0         
	//  131  288:getstatic       #997 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateFailed>
	//  132  291:invokevirtual   #992 <Method void updateState(APSMediaEvent$APSMediaEventState)>
			}
		} else
	//* 133  294:goto            821
		{
			ArrayList arraylist1 = unitsForLinearsInInlineNodesWithBuffet(ads, unitsForLinearsInInlineNodesWithBuffet(buffet, ((ArrayList) (null))));
	//  134  297:aload_0         
	//  135  298:aload_0         
	//  136  299:getfield        #142 <Field ArrayList ads>
	//  137  302:aload_0         
	//  138  303:aload_0         
	//  139  304:getfield        #144 <Field ArrayList buffet>
	//  140  307:aconst_null     
	//  141  308:invokevirtual   #716 <Method ArrayList unitsForLinearsInInlineNodesWithBuffet(ArrayList, ArrayList)>
	//  142  311:invokevirtual   #716 <Method ArrayList unitsForLinearsInInlineNodesWithBuffet(ArrayList, ArrayList)>
	//  143  314:astore_1        
			if(arraylist1 != null && arraylist1.size() > 0)
	//* 144  315:aload_1         
	//* 145  316:ifnull          795
	//* 146  319:aload_1         
	//* 147  320:invokevirtual   #604 <Method int ArrayList.size()>
	//* 148  323:ifle            795
			{
				setAdBreakTrackingForArray(arraylist1);
	//  149  326:aload_0         
	//  150  327:aload_1         
	//  151  328:invokevirtual   #1057 <Method void setAdBreakTrackingForArray(ArrayList)>
				APSMediaUnit apsmediaunit1;
				for(Iterator iterator2 = arraylist1.iterator(); iterator2.hasNext(); apsmediaunit1.sourceAdBreak = this)
	//* 152  331:aload_1         
	//* 153  332:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//* 154  335:astore_2        
	//* 155  336:aload_2         
	//* 156  337:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//* 157  342:ifeq            542
				{
					apsmediaunit1 = (APSMediaUnit)iterator2.next();
	//  158  345:aload_2         
	//  159  346:invokeinterface #437 <Method Object Iterator.next()>
	//  160  351:checkcast       #303 <Class APSMediaUnit>
	//  161  354:astore_3        
					if(metadata != null)
	//* 162  355:aload_0         
	//* 163  356:getfield        #334 <Field HashMap metadata>
	//* 164  359:ifnull          373
						apsmediaunit1.metadata.putAll(((Map) (metadata)));
	//  165  362:aload_3         
	//  166  363:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  167  366:aload_0         
	//  168  367:getfield        #334 <Field HashMap metadata>
	//  169  370:invokevirtual   #1078 <Method void HashMap.putAll(Map)>
					apsmediaunit1.metadata.put("aps_vast_adbreak_index", ((Object) (Integer.valueOf(arraylist1.indexOf(((Object) (apsmediaunit1))) + 1))));
	//  170  373:aload_3         
	//  171  374:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  172  377:ldc1            #39  <String "aps_vast_adbreak_index">
	//  173  379:aload_1         
	//  174  380:aload_3         
	//  175  381:invokevirtual   #1062 <Method int ArrayList.indexOf(Object)>
	//  176  384:iconst_1        
	//  177  385:iadd            
	//  178  386:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  179  389:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  180  392:pop             
					apsmediaunit1.metadata.put("aps_vast_adbreak_total", ((Object) (Integer.valueOf(arraylist1.size()))));
	//  181  393:aload_3         
	//  182  394:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  183  397:ldc1            #45  <String "aps_vast_adbreak_total">
	//  184  399:aload_1         
	//  185  400:invokevirtual   #604 <Method int ArrayList.size()>
	//  186  403:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  187  406:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  188  409:pop             
					if(type == APSVASTConfigurationOptions.APSVASTPreContent)
	//* 189  410:aload_0         
	//* 190  411:getfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
	//* 191  414:getstatic       #454 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
	//* 192  417:if_acmpne       450
					{
						apsmediaunit1.metadata.put("aps_meta_type", "prerolls.");
	//  193  420:aload_3         
	//  194  421:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  195  424:ldc2            #1067 <String "aps_meta_type">
	//  196  427:ldc1            #21  <String "prerolls.">
	//  197  429:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  198  432:pop             
						apsmediaunit1.metadata.put("aps_vast_adbreak_offset", ((Object) (Integer.valueOf(0))));
	//  199  433:aload_3         
	//  200  434:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  201  437:ldc1            #42  <String "aps_vast_adbreak_offset">
	//  202  439:iconst_0        
	//  203  440:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  204  443:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  205  446:pop             
						continue;
	//  206  447:goto            534
					}
					if(type == APSVASTConfigurationOptions.APSVASTMidContent)
	//* 207  450:aload_0         
	//* 208  451:getfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
	//* 209  454:getstatic       #504 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTMidContent>
	//* 210  457:if_acmpne       495
					{
						apsmediaunit1.metadata.put("aps_meta_type", "midrolls.");
	//  211  460:aload_3         
	//  212  461:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  213  464:ldc2            #1067 <String "aps_meta_type">
	//  214  467:ldc1            #15  <String "midrolls.">
	//  215  469:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  216  472:pop             
						apsmediaunit1.metadata.put("aps_vast_adbreak_offset", ((Object) (Integer.valueOf(APSMediaPlayer.getInstance().currentPlaybackTime()))));
	//  217  473:aload_3         
	//  218  474:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  219  477:ldc1            #42  <String "aps_vast_adbreak_offset">
	//  220  479:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  221  482:invokevirtual   #1081 <Method int APSMediaPlayer.currentPlaybackTime()>
	//  222  485:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  223  488:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  224  491:pop             
						continue;
	//  225  492:goto            534
					}
					if(type == APSVASTConfigurationOptions.APSVASTPostContent)
	//* 226  495:aload_0         
	//* 227  496:getfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
	//* 228  499:getstatic       #457 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPostContent>
	//* 229  502:if_acmpne       534
					{
						apsmediaunit1.metadata.put("aps_meta_type", "postrolls.");
	//  230  505:aload_3         
	//  231  506:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  232  509:ldc2            #1067 <String "aps_meta_type">
	//  233  512:ldc1            #18  <String "postrolls.">
	//  234  514:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  235  517:pop             
						apsmediaunit1.metadata.put("aps_vast_adbreak_offset", ((Object) (Integer.valueOf(0x7fffffff))));
	//  236  518:aload_3         
	//  237  519:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  238  522:ldc1            #42  <String "aps_vast_adbreak_offset">
	//  239  524:ldc2            #1082 <Int 0x7fffffff>
	//  240  527:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  241  530:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  242  533:pop             
					}
				}

	//  243  534:aload_3         
	//  244  535:aload_0         
	//  245  536:putfield        #1086 <Field APSVastAdBreak APSMediaUnit.sourceAdBreak>
	//* 246  539:goto            336
				APSMediaPlayer apsmediaplayer1 = APSMediaPlayer.getInstance();
	//  247  542:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  248  545:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder();
	//  249  546:new             #768 <Class StringBuilder>
	//  250  549:dup             
	//  251  550:invokespecial   #769 <Method void StringBuilder()>
	//  252  553:astore_3        
				stringbuilder1.append("Inserting ");
	//  253  554:aload_3         
	//  254  555:ldc2            #1051 <String "Inserting ">
	//  255  558:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  256  561:pop             
				stringbuilder1.append(arraylist1.size());
	//  257  562:aload_3         
	//  258  563:aload_1         
	//  259  564:invokevirtual   #604 <Method int ArrayList.size()>
	//  260  567:invokevirtual   #1007 <Method StringBuilder StringBuilder.append(int)>
	//  261  570:pop             
				stringbuilder1.append(" units");
	//  262  571:aload_3         
	//  263  572:ldc2            #1088 <String " units">
	//  264  575:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  265  578:pop             
				apsmediaplayer1.log(stringbuilder1.toString());
	//  266  579:aload_2         
	//  267  580:aload_3         
	//  268  581:invokevirtual   #778 <Method String StringBuilder.toString()>
	//  269  584:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
				if(type == APSVASTConfigurationOptions.APSVASTMidContent)
	//* 270  587:aload_0         
	//* 271  588:getfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
	//* 272  591:getstatic       #504 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTMidContent>
	//* 273  594:if_acmpne       785
				{
					APSMediaUnit apsmediaunit = APSMediaPlayer.getInstance().currentUnit();
	//  274  597:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  275  600:invokevirtual   #1092 <Method APSMediaUnit APSMediaPlayer.currentUnit()>
	//  276  603:astore_2        
					if(apsmediaunit == null)
	//* 277  604:aload_2         
	//* 278  605:ifnonnull       616
					{
						updateState(APSMediaEvent.APSMediaEventState.APSMediaEventStateFailed);
	//  279  608:aload_0         
	//  280  609:getstatic       #997 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateFailed>
	//  281  612:invokevirtual   #992 <Method void updateState(APSMediaEvent$APSMediaEventState)>
						return;
	//  282  615:return          
					}
					apsmediaunit.shouldAutoplay = true;
	//  283  616:aload_2         
	//  284  617:iconst_1        
	//  285  618:putfield        #1095 <Field boolean APSMediaUnit.shouldAutoplay>
					if(apsmediaunit._overlays != null)
	//* 286  621:aload_2         
	//* 287  622:getfield        #1098 <Field ArrayList APSMediaUnit._overlays>
	//* 288  625:ifnull          691
					{
						Iterator iterator3 = apsmediaunit._overlays.iterator();
	//  289  628:aload_2         
	//  290  629:getfield        #1098 <Field ArrayList APSMediaUnit._overlays>
	//  291  632:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//  292  635:astore_3        
						do
						{
							if(!iterator3.hasNext())
								break;
	//  293  636:aload_3         
	//  294  637:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//  295  642:ifeq            691
							APSMediaOverlay apsmediaoverlay2 = (APSMediaOverlay)iterator3.next();
	//  296  645:aload_3         
	//  297  646:invokeinterface #437 <Method Object Iterator.next()>
	//  298  651:checkcast       #1032 <Class APSMediaOverlay>
	//  299  654:astore          4
							if(apsmediaoverlay2.startPoint() <= startPoint() && !apsmediaoverlay2.type.equals("media-route-button"))
	//* 300  656:aload           4
	//* 301  658:invokevirtual   #1099 <Method int APSMediaOverlay.startPoint()>
	//* 302  661:aload_0         
	//* 303  662:invokevirtual   #1046 <Method int startPoint()>
	//* 304  665:icmpgt          636
	//* 305  668:aload           4
	//* 306  670:getfield        #1101 <Field String APSMediaOverlay.type>
	//* 307  673:ldc2            #1103 <String "media-route-button">
	//* 308  676:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 309  679:ifne            636
								iterator3.remove();
	//  310  682:aload_3         
	//  311  683:invokeinterface #1106 <Method void Iterator.remove()>
						} while(true);
	//  312  688:goto            636
					}
					if(apsmediaunit._events != null)
	//* 313  691:aload_2         
	//* 314  692:getfield        #1109 <Field ArrayList APSMediaUnit._events>
	//* 315  695:ifnull          743
					{
						Iterator iterator4 = apsmediaunit._events.iterator();
	//  316  698:aload_2         
	//  317  699:getfield        #1109 <Field ArrayList APSMediaUnit._events>
	//  318  702:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//  319  705:astore_3        
						do
						{
							if(!iterator4.hasNext())
								break;
	//  320  706:aload_3         
	//  321  707:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//  322  712:ifeq            743
							if(((APSMediaEvent)iterator4.next()).startPoint() <= startPoint())
	//* 323  715:aload_3         
	//* 324  716:invokeinterface #437 <Method Object Iterator.next()>
	//* 325  721:checkcast       #4   <Class APSMediaEvent>
	//* 326  724:invokevirtual   #1110 <Method int APSMediaEvent.startPoint()>
	//* 327  727:aload_0         
	//* 328  728:invokevirtual   #1046 <Method int startPoint()>
	//* 329  731:icmpgt          706
								iterator4.remove();
	//  330  734:aload_3         
	//  331  735:invokeinterface #1106 <Method void Iterator.remove()>
						} while(true);
	//  332  740:goto            706
					}
					arraylist1 = new ArrayList(((Collection) (arraylist1)));
	//  333  743:new             #137 <Class ArrayList>
	//  334  746:dup             
	//  335  747:aload_1         
	//  336  748:invokespecial   #180 <Method void ArrayList(Collection)>
	//  337  751:astore_1        
					arraylist1.add(((Object) (apsmediaunit)));
	//  338  752:aload_1         
	//  339  753:aload_2         
	//  340  754:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//  341  757:pop             
					if(apsmediaunit.canReplay)
	//* 342  758:aload_2         
	//* 343  759:getfield        #1113 <Field boolean APSMediaUnit.canReplay>
	//* 344  762:ifeq            775
						APSMediaPlayer.getInstance().replaceCurrentUnitWithUnits(arraylist1);
	//  345  765:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  346  768:aload_1         
	//  347  769:invokevirtual   #1116 <Method void APSMediaPlayer.replaceCurrentUnitWithUnits(ArrayList)>
					else
	//* 348  772:goto            821
						APSMediaPlayer.getInstance().insertMediaUnits(arraylist1);
	//  349  775:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  350  778:aload_1         
	//  351  779:invokevirtual   #1119 <Method void APSMediaPlayer.insertMediaUnits(ArrayList)>
				} else
	//* 352  782:goto            821
				{
					APSMediaPlayer.getInstance().insertMediaUnits(arraylist1);
	//  353  785:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  354  788:aload_1         
	//  355  789:invokevirtual   #1119 <Method void APSMediaPlayer.insertMediaUnits(ArrayList)>
				}
			} else
	//* 356  792:goto            821
			{
				APSMediaPlayer.getInstance().log("AdBreak does not contain any valid units");
	//  357  795:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  358  798:ldc2            #1074 <String "AdBreak does not contain any valid units">
	//  359  801:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
				trackErrorWithCode(1006, "AdBreak does not contain any valid units");
	//  360  804:aload_0         
	//  361  805:sipush          1006
	//  362  808:ldc2            #1074 <String "AdBreak does not contain any valid units">
	//  363  811:invokevirtual   #1015 <Method void trackErrorWithCode(int, String)>
				updateState(APSMediaEvent.APSMediaEventState.APSMediaEventStateFailed);
	//  364  814:aload_0         
	//  365  815:getstatic       #997 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateFailed>
	//  366  818:invokevirtual   #992 <Method void updateState(APSMediaEvent$APSMediaEventState)>
			}
		}
		if(getState() == APSMediaEvent.APSMediaEventState.APSMediaEventStateUnloaded)
	//* 367  821:aload_0         
	//* 368  822:invokevirtual   #1021 <Method APSMediaEvent$APSMediaEventState getState()>
	//* 369  825:getstatic       #1024 <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStateUnloaded>
	//* 370  828:if_acmpne       845
		{
			APSMediaPlayer.getInstance().log("AdBreak was unloaded before trigger finished.");
	//  371  831:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  372  834:ldc2            #1121 <String "AdBreak was unloaded before trigger finished.">
	//  373  837:invokevirtual   #781 <Method void APSMediaPlayer.log(String)>
			onUnload();
	//  374  840:aload_0         
	//  375  841:invokevirtual   #1029 <Method void onUnload()>
			return;
	//  376  844:return          
		}
		if(type != APSVASTConfigurationOptions.APSVASTNonLinear)
	//* 377  845:aload_0         
	//* 378  846:getfield        #320 <Field APSVastAdBreak$APSVASTConfigurationOptions type>
	//* 379  849:getstatic       #499 <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTNonLinear>
	//* 380  852:if_acmpeq       861
			APSMediaPlayer.getInstance().step();
	//  381  855:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  382  858:invokevirtual   #1124 <Method void APSMediaPlayer.step()>
	//  383  861:return          
	}

	public void onUnload()
	{
		Object obj = ((Object) (new ArrayList(((Collection) (APSMediaPlayer.getInstance().getPlaylist())))));
	//    0    0:new             #137 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    3    7:invokevirtual   #1128 <Method List APSMediaPlayer.getPlaylist()>
	//    4   10:invokespecial   #180 <Method void ArrayList(Collection)>
	//    5   13:astore_2        
		ArrayList arraylist = new ArrayList();
	//    6   14:new             #137 <Class ArrayList>
	//    7   17:dup             
	//    8   18:invokespecial   #138 <Method void ArrayList()>
	//    9   21:astore_1        
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   10   22:aload_2         
	//   11   23:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//   12   26:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   13   27:aload_2         
	//   14   28:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//   15   33:ifeq            105
			APSMediaEvent apsmediaevent = (APSMediaEvent)((Iterator) (obj)).next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #437 <Method Object Iterator.next()>
	//   18   42:checkcast       #4   <Class APSMediaEvent>
	//   19   45:astore_3        
			if(apsmediaevent instanceof APSMediaUnit)
	//*  20   46:aload_3         
	//*  21   47:instanceof      #303 <Class APSMediaUnit>
	//*  22   50:ifeq            27
			{
				APSMediaUnit apsmediaunit = (APSMediaUnit)apsmediaevent;
	//   23   53:aload_3         
	//   24   54:checkcast       #303 <Class APSMediaUnit>
	//   25   57:astore          4
				if(apsmediaunit.sourceAdBreak == this)
	//*  26   59:aload           4
	//*  27   61:getfield        #1086 <Field APSVastAdBreak APSMediaUnit.sourceAdBreak>
	//*  28   64:aload_0         
	//*  29   65:if_acmpne       27
				{
					if(generatedUnits == null)
	//*  30   68:aload_0         
	//*  31   69:getfield        #310 <Field ArrayList generatedUnits>
	//*  32   72:ifnonnull       86
						generatedUnits = new ArrayList();
	//   33   75:aload_0         
	//   34   76:new             #137 <Class ArrayList>
	//   35   79:dup             
	//   36   80:invokespecial   #138 <Method void ArrayList()>
	//   37   83:putfield        #310 <Field ArrayList generatedUnits>
					generatedUnits.add(((Object) (apsmediaunit)));
	//   38   86:aload_0         
	//   39   87:getfield        #310 <Field ArrayList generatedUnits>
	//   40   90:aload           4
	//   41   92:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//   42   95:pop             
					arraylist.add(((Object) (apsmediaevent)));
	//   43   96:aload_1         
	//   44   97:aload_3         
	//   45   98:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//   46  101:pop             
				}
			}
		} while(true);
	//   47  102:goto            27
		APSMediaPlayer.getInstance().removeMediaUnits(((List) (arraylist)));
	//   48  105:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   49  108:aload_1         
	//   50  109:invokevirtual   #1132 <Method void APSMediaPlayer.removeMediaUnits(List)>
	//   51  112:return          
	}

	public void onUpdate()
	{
	//    0    0:return          
	}

	public ArrayList overlaysForNonlinearsInInlineNodes(ArrayList arraylist)
	{
		Object obj;
		ArrayList arraylist2;
		arraylist2 = new ArrayList();
	//    0    0:new             #137 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void ArrayList()>
	//    3    7:astore          14
		obj = ((Object) (arraylist.iterator()));
	//    4    9:aload_1         
	//    5   10:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//    6   13:astore          10
_L4:
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
	//    7   15:aload           10
	//    8   17:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//    9   22:ifeq            1818
_L1:
		Iterator iterator;
		APSVASTInLineNode apsvastinlinenode;
		apsvastinlinenode = (APSVASTInLineNode)((Iterator) (obj)).next();
	//   10   25:aload           10
	//   11   27:invokeinterface #437 <Method Object Iterator.next()>
	//   12   32:checkcast       #289 <Class APSVASTInLineNode>
	//   13   35:astore          15
		arraylist = ((ArrayList) (apsvastinlinenode.creatives().iterator()));
	//   14   37:aload           15
	//   15   39:invokevirtual   #1136 <Method ArrayList APSVASTInLineNode.creatives()>
	//   16   42:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//   17   45:astore_1        
		iterator = ((Iterator) (obj));
	//   18   46:aload           10
	//   19   48:astore          9
_L6:
		obj = ((Object) (iterator));
	//   20   50:aload           9
	//   21   52:astore          10
		if(!((Iterator) (arraylist)).hasNext()) goto _L4; else goto _L3
	//   22   54:aload_1         
	//   23   55:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//   24   60:ifeq            15
_L3:
		obj = ((Object) (((APSVASTCreativeNode)((Iterator) (arraylist)).next()).getNonlinearAds()));
	//   25   63:aload_1         
	//   26   64:invokeinterface #437 <Method Object Iterator.next()>
	//   27   69:checkcast       #1138 <Class APSVASTCreativeNode>
	//   28   72:invokevirtual   #1142 <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//   29   75:astore          10
		if(obj == null) goto _L6; else goto _L5
	//   30   77:aload           10
	//   31   79:ifnull          1815
_L5:
		Object obj1;
		HashMap hashmap2 = ((APSVASTNonLinearAdsNode) (obj)).nonLinearsByType();
	//   32   82:aload           10
	//   33   84:invokevirtual   #1148 <Method HashMap APSVASTNonLinearAdsNode.nonLinearsByType()>
	//   34   87:astore          16
		ArrayList arraylist3 = new ArrayList(((Collection) (Arrays.asList(((Object []) (new String[] {
			"html", "iframe", "script", "image"
		}))))));
	//   35   89:new             #137 <Class ArrayList>
	//   36   92:dup             
	//   37   93:iconst_4        
	//   38   94:anewarray       String[]
	//   39   97:dup             
	//   40   98:iconst_0        
	//   41   99:ldc2            #1150 <String "html">
	//   42  102:aastore         
	//   43  103:dup             
	//   44  104:iconst_1        
	//   45  105:ldc2            #1152 <String "iframe">
	//   46  108:aastore         
	//   47  109:dup             
	//   48  110:iconst_2        
	//   49  111:ldc2            #1154 <String "script">
	//   50  114:aastore         
	//   51  115:dup             
	//   52  116:iconst_3        
	//   53  117:ldc2            #961 <String "image">
	//   54  120:aastore         
	//   55  121:invokestatic    #177 <Method List Arrays.asList(Object[])>
	//   56  124:invokespecial   #180 <Method void ArrayList(Collection)>
	//   57  127:astore          17
		int k = bannerMaxSizeWidth;
	//   58  129:aload_0         
	//   59  130:getfield        #244 <Field int bannerMaxSizeWidth>
	//   60  133:istore          7
		int i = bannerMaxSizeHeight;
	//   61  135:aload_0         
	//   62  136:getfield        #246 <Field int bannerMaxSizeHeight>
	//   63  139:istore          6
		float f3 = k / i;
	//   64  141:iload           7
	//   65  143:iload           6
	//   66  145:idiv            
	//   67  146:i2f             
	//   68  147:fstore          5
		obj = null;
	//   69  149:aconst_null     
	//   70  150:astore          10
		float f = 2.147484E+09F;
	//   71  152:ldc2            #1155 <Float 2.147484E+09F>
	//   72  155:fstore_2        
		obj1 = null;
	//   73  156:aconst_null     
	//   74  157:astore          11
		int i1 = 0;
	//   75  159:iconst_0        
	//   76  160:istore          8
label0:
		do
		{
label1:
			{
				if(i1 >= arraylist3.size())
					break label0;
	//   77  162:iload           8
	//   78  164:aload           17
	//   79  166:invokevirtual   #604 <Method int ArrayList.size()>
	//   80  169:icmpge          432
				obj1 = ((Object) ((String)arraylist3.get(i1)));
	//   81  172:aload           17
	//   82  174:iload           8
	//   83  176:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//   84  179:checkcast       #155 <Class String>
	//   85  182:astore          11
				ArrayList arraylist1 = (ArrayList)hashmap2.get(obj1);
	//   86  184:aload           16
	//   87  186:aload           11
	//   88  188:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//   89  191:checkcast       #137 <Class ArrayList>
	//   90  194:astore          12
				if(arraylist1 == null)
					break label1;
	//   91  196:aload           12
	//   92  198:ifnull          415
				for(Iterator iterator1 = arraylist1.iterator(); iterator1.hasNext();)
	//*  93  201:aload           12
	//*  94  203:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//*  95  206:astore          18
	//*  96  208:aload           18
	//*  97  210:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//*  98  215:ifeq            412
				{
					float f1;
					APSVASTNonLinearNode apsvastnonlinearnode;
label2:
					{
						APSVASTNonLinearNode apsvastnonlinearnode1 = (APSVASTNonLinearNode)iterator1.next();
	//   99  218:aload           18
	//  100  220:invokeinterface #437 <Method Object Iterator.next()>
	//  101  225:checkcast       #1157 <Class APSVASTNonLinearNode>
	//  102  228:astore          13
						if(apsvastnonlinearnode1.attributes.get("width") != null)
	//* 103  230:aload           13
	//* 104  232:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//* 105  235:ldc2            #909 <String "width">
	//* 106  238:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 107  241:ifnull          263
							k = Integer.parseInt((String)apsvastnonlinearnode1.attributes.get("width"));
	//  108  244:aload           13
	//  109  246:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//  110  249:ldc2            #909 <String "width">
	//  111  252:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  112  255:checkcast       #155 <Class String>
	//  113  258:invokestatic    #906 <Method int Integer.parseInt(String)>
	//  114  261:istore          7
						if(apsvastnonlinearnode1.attributes.get("height") != null)
	//* 115  263:aload           13
	//* 116  265:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//* 117  268:ldc2            #873 <String "height">
	//* 118  271:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 119  274:ifnull          296
							i = Integer.parseInt((String)apsvastnonlinearnode1.attributes.get("height"));
	//  120  277:aload           13
	//  121  279:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//  122  282:ldc2            #873 <String "height">
	//  123  285:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  124  288:checkcast       #155 <Class String>
	//  125  291:invokestatic    #906 <Method int Integer.parseInt(String)>
	//  126  294:istore          6
						if(apsvastnonlinearnode1.attributes.get("scalable") == null || ((String)apsvastnonlinearnode1.attributes.get("scalable")).equals("no"))
	//* 127  296:aload           13
	//* 128  298:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//* 129  301:ldc2            #1160 <String "scalable">
	//* 130  304:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 131  307:ifnull          333
	//* 132  310:aload           13
	//* 133  312:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//* 134  315:ldc2            #1160 <String "scalable">
	//* 135  318:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 136  321:checkcast       #155 <Class String>
	//* 137  324:ldc2            #1162 <String "no">
	//* 138  327:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 139  330:ifeq            363
						{
							apsvastnonlinearnode = ((APSVASTNonLinearNode) (obj));
	//  140  333:aload           10
	//  141  335:astore          12
							f1 = f;
	//  142  337:fload_2         
	//  143  338:fstore_3        
							if(i > bannerMaxSizeHeight)
								break label2;
	//  144  339:iload           6
	//  145  341:aload_0         
	//  146  342:getfield        #246 <Field int bannerMaxSizeHeight>
	//  147  345:icmpgt          403
							apsvastnonlinearnode = ((APSVASTNonLinearNode) (obj));
	//  148  348:aload           10
	//  149  350:astore          12
							f1 = f;
	//  150  352:fload_2         
	//  151  353:fstore_3        
							if(k > bannerMaxSizeWidth)
								break label2;
	//  152  354:iload           7
	//  153  356:aload_0         
	//  154  357:getfield        #244 <Field int bannerMaxSizeWidth>
	//  155  360:icmpgt          403
						}
						float f2 = k / i;
	//  156  363:iload           7
	//  157  365:iload           6
	//  158  367:idiv            
	//  159  368:i2f             
	//  160  369:fstore          4
						apsvastnonlinearnode = ((APSVASTNonLinearNode) (obj));
	//  161  371:aload           10
	//  162  373:astore          12
						f1 = f;
	//  163  375:fload_2         
	//  164  376:fstore_3        
						if(Math.abs(f3 - f2) <= Math.abs(f3 - f))
	//* 165  377:fload           5
	//* 166  379:fload           4
	//* 167  381:fsub            
	//* 168  382:invokestatic    #1168 <Method float Math.abs(float)>
	//* 169  385:fload           5
	//* 170  387:fload_2         
	//* 171  388:fsub            
	//* 172  389:invokestatic    #1168 <Method float Math.abs(float)>
	//* 173  392:fcmpg           
	//* 174  393:ifgt            403
						{
							f1 = f2;
	//  175  396:fload           4
	//  176  398:fstore_3        
							apsvastnonlinearnode = apsvastnonlinearnode1;
	//  177  399:aload           13
	//  178  401:astore          12
						}
					}
					obj = ((Object) (apsvastnonlinearnode));
	//  179  403:aload           12
	//  180  405:astore          10
					f = f1;
	//  181  407:fload_3         
	//  182  408:fstore_2        
				}

			}
	//* 183  409:goto            208
	//* 184  412:goto            415
			if(obj != null)
	//* 185  415:aload           10
	//* 186  417:ifnull          423
				break;
	//  187  420:goto            432
			i1++;
	//  188  423:iload           8
	//  189  425:iconst_1        
	//  190  426:iadd            
	//  191  427:istore          8
		} while(true);
	//  192  429:goto            162
		if(obj == null) goto _L8; else goto _L7
	//  193  432:aload           10
	//  194  434:ifnull          1791
_L7:
		int j;
		int l;
		APSMediaOverlay apsmediaoverlay;
		apsmediaoverlay = new APSMediaOverlay();
	//  195  437:new             #1032 <Class APSMediaOverlay>
	//  196  440:dup             
	//  197  441:invokespecial   #1169 <Method void APSMediaOverlay()>
	//  198  444:astore          16
		apsmediaoverlay.position = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionUnspecified;
	//  199  446:aload           16
	//  200  448:getstatic       #1037 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionUnspecified>
	//  201  451:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
		j = bannerMaxSizeWidth;
	//  202  454:aload_0         
	//  203  455:getfield        #244 <Field int bannerMaxSizeWidth>
	//  204  458:istore          6
		l = bannerMaxSizeHeight;
	//  205  460:aload_0         
	//  206  461:getfield        #246 <Field int bannerMaxSizeHeight>
	//  207  464:istore          7
		if(((APSVASTNonLinearNode) (obj)).attributes.get("width") != null)
	//* 208  466:aload           10
	//* 209  468:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//* 210  471:ldc2            #909 <String "width">
	//* 211  474:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 212  477:ifnull          499
			j = Integer.parseInt((String)((APSVASTNonLinearNode) (obj)).attributes.get("width"));
	//  213  480:aload           10
	//  214  482:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//  215  485:ldc2            #909 <String "width">
	//  216  488:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  217  491:checkcast       #155 <Class String>
	//  218  494:invokestatic    #906 <Method int Integer.parseInt(String)>
	//  219  497:istore          6
		if(((APSVASTNonLinearNode) (obj)).attributes.get("height") != null)
	//* 220  499:aload           10
	//* 221  501:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//* 222  504:ldc2            #873 <String "height">
	//* 223  507:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 224  510:ifnull          532
			l = Integer.parseInt((String)((APSVASTNonLinearNode) (obj)).attributes.get("height"));
	//  225  513:aload           10
	//  226  515:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//  227  518:ldc2            #873 <String "height">
	//  228  521:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  229  524:checkcast       #155 <Class String>
	//  230  527:invokestatic    #906 <Method int Integer.parseInt(String)>
	//  231  530:istore          7
		int j1;
		if(stretchBannersToMaxSize)
	//* 232  532:aload_0         
	//* 233  533:getfield        #248 <Field boolean stretchBannersToMaxSize>
	//* 234  536:ifeq            548
			j1 = bannerMaxSizeWidth;
	//  235  539:aload_0         
	//  236  540:getfield        #244 <Field int bannerMaxSizeWidth>
	//  237  543:istore          8
		else
	//* 238  545:goto            559
			j1 = Math.min(j, bannerMaxSizeWidth);
	//  239  548:iload           6
	//  240  550:aload_0         
	//  241  551:getfield        #244 <Field int bannerMaxSizeWidth>
	//  242  554:invokestatic    #1173 <Method int Math.min(int, int)>
	//  243  557:istore          8
		apsmediaoverlay.width = String.valueOf((int)Math.floor(j1));
	//  244  559:aload           16
	//  245  561:iload           8
	//  246  563:i2d             
	//  247  564:invokestatic    #1177 <Method double Math.floor(double)>
	//  248  567:d2i             
	//  249  568:invokestatic    #544 <Method String String.valueOf(int)>
	//  250  571:putfield        #1179 <Field String APSMediaOverlay.width>
		if(stretchBannersToMaxSize)
	//* 251  574:aload_0         
	//* 252  575:getfield        #248 <Field boolean stretchBannersToMaxSize>
	//* 253  578:ifeq            590
			j1 = bannerMaxSizeHeight;
	//  254  581:aload_0         
	//  255  582:getfield        #246 <Field int bannerMaxSizeHeight>
	//  256  585:istore          8
		else
	//* 257  587:goto            601
			j1 = Math.min(l, bannerMaxSizeHeight);
	//  258  590:iload           7
	//  259  592:aload_0         
	//  260  593:getfield        #246 <Field int bannerMaxSizeHeight>
	//  261  596:invokestatic    #1173 <Method int Math.min(int, int)>
	//  262  599:istore          8
		apsmediaoverlay.height = String.valueOf((int)Math.floor(j1));
	//  263  601:aload           16
	//  264  603:iload           8
	//  265  605:i2d             
	//  266  606:invokestatic    #1177 <Method double Math.floor(double)>
	//  267  609:d2i             
	//  268  610:invokestatic    #544 <Method String String.valueOf(int)>
	//  269  613:putfield        #1181 <Field String APSMediaOverlay.height>
		HashMap hashmap1 = (HashMap)(new Gson()).fromJson(((APSVASTNonLinearNode) (obj)).firstChildNamed("AdParameters").value, java/util/HashMap);
	//  270  616:new             #1183 <Class Gson>
	//  271  619:dup             
	//  272  620:invokespecial   #1184 <Method void Gson()>
	//  273  623:aload           10
	//  274  625:ldc2            #1186 <String "AdParameters">
	//  275  628:invokevirtual   #1187 <Method APSVASTXMLNode APSVASTNonLinearNode.firstChildNamed(String)>
	//  276  631:getfield        #538 <Field String APSVASTXMLNode.value>
	//  277  634:ldc2            #332 <Class HashMap>
	//  278  637:invokevirtual   #1191 <Method Object Gson.fromJson(String, Class)>
	//  279  640:checkcast       #332 <Class HashMap>
	//  280  643:astore          13
		HashMap hashmap = hashmap1;
	//  281  645:aload           13
	//  282  647:astore          12
		if(hashmap1 == null) goto _L10; else goto _L9
	//  283  649:aload           13
	//  284  651:ifnull          758
_L9:
		if(hashmap1.get("xPosition") != null)
	//* 285  654:aload           13
	//* 286  656:ldc2            #1193 <String "xPosition">
	//* 287  659:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 288  662:ifnull          681
			apsmediaoverlay.absoluteOffsetX = (String)hashmap1.get("xPosition");
	//  289  665:aload           16
	//  290  667:aload           13
	//  291  669:ldc2            #1193 <String "xPosition">
	//  292  672:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  293  675:checkcast       #155 <Class String>
	//  294  678:putfield        #1196 <Field String APSMediaOverlay.absoluteOffsetX>
		if(hashmap1.get("yPosition") != null)
	//* 295  681:aload           13
	//* 296  683:ldc2            #1198 <String "yPosition">
	//* 297  686:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 298  689:ifnull          708
			apsmediaoverlay.absoluteOffsetY = (String)hashmap1.get("yPosition");
	//  299  692:aload           16
	//  300  694:aload           13
	//  301  696:ldc2            #1198 <String "yPosition">
	//  302  699:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  303  702:checkcast       #155 <Class String>
	//  304  705:putfield        #1201 <Field String APSMediaOverlay.absoluteOffsetY>
		hashmap = hashmap1;
	//  305  708:aload           13
	//  306  710:astore          12
		if(hashmap1.get("position") == null) goto _L10; else goto _L11
	//  307  712:aload           13
	//  308  714:ldc2            #826 <String "position">
	//  309  717:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  310  720:ifnull          758
_L11:
		apsmediaoverlay.position = APSMediaBuilder.positionFromString((String)hashmap1.get("position"));
	//  311  723:aload           16
	//  312  725:aload           13
	//  313  727:ldc2            #826 <String "position">
	//  314  730:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  315  733:checkcast       #155 <Class String>
	//  316  736:invokestatic    #891 <Method APSMediaOverlay$APSMediaOverlayPosition APSMediaBuilder.positionFromString(String)>
	//  317  739:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
		hashmap = hashmap1;
	//  318  742:aload           13
	//  319  744:astore          12
		  goto _L10
	//* 320  746:goto            758
_L12:
		hashmap = new HashMap();
	//  321  749:new             #332 <Class HashMap>
	//  322  752:dup             
	//  323  753:invokespecial   #585 <Method void HashMap()>
	//  324  756:astore          12
_L10:
label3:
		{
label4:
			{
				Object obj2 = ((Object) (new HashMap()));
	//  325  758:new             #332 <Class HashMap>
	//  326  761:dup             
	//  327  762:invokespecial   #585 <Method void HashMap()>
	//  328  765:astore          13
				Object obj3 = ((Object) (((APSVASTNonLinearNode) (obj)).trackingURLsByType()));
	//  329  767:aload           10
	//  330  769:invokevirtual   #1204 <Method HashMap APSVASTNonLinearNode.trackingURLsByType()>
	//  331  772:astore          17
				if(obj3 != null)
	//* 332  774:aload           17
	//* 333  776:ifnull          786
					((HashMap) (obj2)).putAll(((Map) (obj3)));
	//  334  779:aload           13
	//  335  781:aload           17
	//  336  783:invokevirtual   #1078 <Method void HashMap.putAll(Map)>
				obj3 = ((Object) (apsvastinlinenode.impressionURLs()));
	//  337  786:aload           15
	//  338  788:invokevirtual   #1207 <Method ArrayList APSVASTInLineNode.impressionURLs()>
	//  339  791:astore          17
				if(obj3 != null)
	//* 340  793:aload           17
	//* 341  795:ifnull          809
					((HashMap) (obj2)).put("impression", obj3);
	//  342  798:aload           13
	//  343  800:ldc2            #1209 <String "impression">
	//  344  803:aload           17
	//  345  805:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  346  808:pop             
				apsmediaoverlay.trackingURLs = ((HashMap) (obj2));
	//  347  809:aload           16
	//  348  811:aload           13
	//  349  813:putfield        #1212 <Field HashMap APSMediaOverlay.trackingURLs>
				apsmediaoverlay.parameters = new HashMap();
	//  350  816:aload           16
	//  351  818:new             #332 <Class HashMap>
	//  352  821:dup             
	//  353  822:invokespecial   #585 <Method void HashMap()>
	//  354  825:putfield        #1215 <Field HashMap APSMediaOverlay.parameters>
				obj2 = ((Object) (apsvastinlinenode.errorURLsWithCode(502)));
	//  355  828:aload           15
	//  356  830:sipush          502
	//  357  833:invokevirtual   #1219 <Method ArrayList APSVASTInLineNode.errorURLsWithCode(int)>
	//  358  836:astore          13
				if(obj1 == null)
					break label3;
	//  359  838:aload           11
	//  360  840:ifnull          1380
				if(((String) (obj1)).equals("image"))
	//* 361  843:aload           11
	//* 362  845:ldc2            #961 <String "image">
	//* 363  848:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 364  851:ifeq            967
				{
					apsmediaoverlay.type = "com.appscend.mp.overlays.image";
	//  365  854:aload           16
	//  366  856:ldc2            #1221 <String "com.appscend.mp.overlays.image">
	//  367  859:putfield        #1101 <Field String APSMediaOverlay.type>
					apsmediaoverlay.parameters.put("url", ((Object) (((APSVASTNonLinearNode) (obj)).imageResource())));
	//  368  862:aload           16
	//  369  864:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  370  867:ldc2            #1223 <String "url">
	//  371  870:aload           10
	//  372  872:invokevirtual   #1226 <Method String APSVASTNonLinearNode.imageResource()>
	//  373  875:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  374  878:pop             
					apsmediaoverlay.parameters.put("dismissAction", ((Object) (afterBannerTapped)));
	//  375  879:aload           16
	//  376  881:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  377  884:ldc2            #1228 <String "dismissAction">
	//  378  887:aload_0         
	//  379  888:getfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
	//  380  891:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  381  894:pop             
					if(((APSVASTNonLinearNode) (obj)).clickThrough() != null)
	//* 382  895:aload           10
	//* 383  897:invokevirtual   #1231 <Method String APSVASTNonLinearNode.clickThrough()>
	//* 384  900:ifnull          920
						apsmediaoverlay.parameters.put("clickThrough", ((Object) (((APSVASTNonLinearNode) (obj)).clickThrough())));
	//  385  903:aload           16
	//  386  905:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  387  908:ldc2            #1232 <String "clickThrough">
	//  388  911:aload           10
	//  389  913:invokevirtual   #1231 <Method String APSVASTNonLinearNode.clickThrough()>
	//  390  916:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  391  919:pop             
					if(((APSVASTNonLinearNode) (obj)).clickTrackingURLs() != null)
	//* 392  920:aload           10
	//* 393  922:invokevirtual   #1235 <Method ArrayList APSVASTNonLinearNode.clickTrackingURLs()>
	//* 394  925:ifnull          945
						apsmediaoverlay.parameters.put("clickTracking", ((Object) (((APSVASTNonLinearNode) (obj)).clickTrackingURLs())));
	//  395  928:aload           16
	//  396  930:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  397  933:ldc2            #1237 <String "clickTracking">
	//  398  936:aload           10
	//  399  938:invokevirtual   #1235 <Method ArrayList APSVASTNonLinearNode.clickTrackingURLs()>
	//  400  941:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  401  944:pop             
					if(obj2 != null)
	//* 402  945:aload           13
	//* 403  947:ifnull          1380
						apsmediaoverlay.parameters.put("errorTracking", obj2);
	//  404  950:aload           16
	//  405  952:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  406  955:ldc2            #1239 <String "errorTracking">
	//  407  958:aload           13
	//  408  960:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  409  963:pop             
					break label3;
	//  410  964:goto            1380
				}
				if(!Arrays.asList(((Object []) (new String[] {
	"html", "iframe", "script"
}))).contains(obj1))
					break label3;
	//  411  967:iconst_3        
	//  412  968:anewarray       String[]
	//  413  971:dup             
	//  414  972:iconst_0        
	//  415  973:ldc2            #1150 <String "html">
	//  416  976:aastore         
	//  417  977:dup             
	//  418  978:iconst_1        
	//  419  979:ldc2            #1152 <String "iframe">
	//  420  982:aastore         
	//  421  983:dup             
	//  422  984:iconst_2        
	//  423  985:ldc2            #1154 <String "script">
	//  424  988:aastore         
	//  425  989:invokestatic    #177 <Method List Arrays.asList(Object[])>
	//  426  992:aload           11
	//  427  994:invokeinterface #1242 <Method boolean List.contains(Object)>
	//  428  999:ifeq            1380
				obj3 = ((Object) (((String)((APSVASTNonLinearNode) (obj)).attributes.get("apiFramework")).toUpperCase(Locale.US)));
	//  429 1002:aload           10
	//  430 1004:getfield        #1158 <Field HashMap APSVASTNonLinearNode.attributes>
	//  431 1007:ldc2            #1244 <String "apiFramework">
	//  432 1010:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  433 1013:checkcast       #155 <Class String>
	//  434 1016:getstatic       #1250 <Field Locale Locale.US>
	//  435 1019:invokevirtual   #1254 <Method String String.toUpperCase(Locale)>
	//  436 1022:astore          17
				APSMediaPlayer apsmediaplayer = APSMediaPlayer.getInstance();
	//  437 1024:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  438 1027:astore          18
				StringBuilder stringbuilder = new StringBuilder();
	//  439 1029:new             #768 <Class StringBuilder>
	//  440 1032:dup             
	//  441 1033:invokespecial   #769 <Method void StringBuilder()>
	//  442 1036:astore          19
				stringbuilder.append("com.appscend.mp.extensions.");
	//  443 1038:aload           19
	//  444 1040:ldc2            #1256 <String "com.appscend.mp.extensions.">
	//  445 1043:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  446 1046:pop             
				stringbuilder.append(((String) (obj3)));
	//  447 1047:aload           19
	//  448 1049:aload           17
	//  449 1051:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  450 1054:pop             
				obj3 = apsmediaplayer.adapterForTypeInGroup(stringbuilder.toString(), "com.appscend.mp.frameworkextensions");
	//  451 1055:aload           18
	//  452 1057:aload           19
	//  453 1059:invokevirtual   #778 <Method String StringBuilder.toString()>
	//  454 1062:ldc2            #1258 <String "com.appscend.mp.frameworkextensions">
	//  455 1065:invokevirtual   #1262 <Method Object APSMediaPlayer.adapterForTypeInGroup(String, String)>
	//  456 1068:astore          17
				if(obj3 != null)
	//* 457 1070:aload           17
	//* 458 1072:ifnull          1156
				{
					boolean flag;
					Exception exception1;
					try
					{
						obj3.getClass().getMethod("configureOverlayfromNodeTypeErrorURLsAdParameters", new Class[] {
							com/appscend/media/events/APSMediaOverlay, com/appscend/vast/APSVASTNonLinearNode, java/lang/String, java/util/ArrayList, java/util/HashMap
						}).invoke(obj3, new Object[] {
							apsmediaoverlay, obj, obj1, obj2, hashmap
						});
	//  459 1075:aload           17
	//  460 1077:invokevirtual   #1268 <Method Class Object.getClass()>
	//  461 1080:ldc2            #1270 <String "configureOverlayfromNodeTypeErrorURLsAdParameters">
	//  462 1083:iconst_5        
	//  463 1084:anewarray       Class[]
	//  464 1087:dup             
	//  465 1088:iconst_0        
	//  466 1089:ldc2            #1032 <Class APSMediaOverlay>
	//  467 1092:aastore         
	//  468 1093:dup             
	//  469 1094:iconst_1        
	//  470 1095:ldc2            #1157 <Class APSVASTNonLinearNode>
	//  471 1098:aastore         
	//  472 1099:dup             
	//  473 1100:iconst_2        
	//  474 1101:ldc1            #155 <Class String>
	//  475 1103:aastore         
	//  476 1104:dup             
	//  477 1105:iconst_3        
	//  478 1106:ldc1            #137 <Class ArrayList>
	//  479 1108:aastore         
	//  480 1109:dup             
	//  481 1110:iconst_4        
	//  482 1111:ldc2            #332 <Class HashMap>
	//  483 1114:aastore         
	//  484 1115:invokevirtual   #1274 <Method Method Class.getMethod(String, Class[])>
	//  485 1118:aload           17
	//  486 1120:iconst_5        
	//  487 1121:anewarray       Object[]
	//  488 1124:dup             
	//  489 1125:iconst_0        
	//  490 1126:aload           16
	//  491 1128:aastore         
	//  492 1129:dup             
	//  493 1130:iconst_1        
	//  494 1131:aload           10
	//  495 1133:aastore         
	//  496 1134:dup             
	//  497 1135:iconst_2        
	//  498 1136:aload           11
	//  499 1138:aastore         
	//  500 1139:dup             
	//  501 1140:iconst_3        
	//  502 1141:aload           13
	//  503 1143:aastore         
	//  504 1144:dup             
	//  505 1145:iconst_4        
	//  506 1146:aload           12
	//  507 1148:aastore         
	//  508 1149:invokevirtual   #1280 <Method Object Method.invoke(Object, Object[])>
	//  509 1152:pop             
					}
	//* 510 1153:goto            1380
	//* 511 1156:iconst_0        
	//* 512 1157:istore          8
	//* 513 1159:aload           16
	//* 514 1161:ldc2            #1282 <String "com.appscend.mp.overlays.html">
	//* 515 1164:putfield        #1101 <Field String APSMediaOverlay.type>
	//* 516 1167:aload           16
	//* 517 1169:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 518 1172:ldc2            #1228 <String "dismissAction">
	//* 519 1175:aload_0         
	//* 520 1176:getfield        #153 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterBannerTapped>
	//* 521 1179:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 522 1182:pop             
	//* 523 1183:aload           16
	//* 524 1185:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 525 1188:ldc2            #1284 <String "viewportWidth">
	//* 526 1191:iload           6
	//* 527 1193:invokestatic    #544 <Method String String.valueOf(int)>
	//* 528 1196:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 529 1199:pop             
	//* 530 1200:aload           16
	//* 531 1202:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 532 1205:ldc2            #1286 <String "viewportHeight">
	//* 533 1208:iload           7
	//* 534 1210:invokestatic    #544 <Method String String.valueOf(int)>
	//* 535 1213:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 536 1216:pop             
	//* 537 1217:aload           11
	//* 538 1219:invokevirtual   #486 <Method int String.hashCode()>
	//* 539 1222:istore          6
	//* 540 1224:iload           6
	//* 541 1226:ldc2            #1287 <Int 0xb8ff82a4>
	//* 542 1229:icmpeq          1261
	//* 543 1232:iload           6
	//* 544 1234:ldc2            #1288 <Int 0x3107ab>
	//* 545 1237:icmpeq          1243
	//* 546 1240:goto            1278
	//* 547 1243:aload           11
	//* 548 1245:ldc2            #1150 <String "html">
	//* 549 1248:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 550 1251:ifeq            1278
	//* 551 1254:iload           8
	//* 552 1256:istore          6
	//* 553 1258:goto            1281
	//* 554 1261:aload           11
	//* 555 1263:ldc2            #1152 <String "iframe">
	//* 556 1266:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 557 1269:ifeq            1278
	//* 558 1272:iconst_1        
	//* 559 1273:istore          6
	//* 560 1275:goto            1281
	//* 561 1278:iconst_m1       
	//* 562 1279:istore          6
	//* 563 1281:iload           6
	//* 564 1283:tableswitch     0 1: default 1304
	//	               0 1344
	//	               1 1324
	//* 565 1304:aload           16
	//* 566 1306:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 567 1309:ldc2            #1154 <String "script">
	//* 568 1312:aload           10
	//* 569 1314:invokevirtual   #1291 <Method String APSVASTNonLinearNode.scriptResource()>
	//* 570 1317:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 571 1320:pop             
	//* 572 1321:goto            1361
	//* 573 1324:aload           16
	//* 574 1326:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 575 1329:ldc2            #1152 <String "iframe">
	//* 576 1332:aload           10
	//* 577 1334:invokevirtual   #1294 <Method String APSVASTNonLinearNode.iframeResource()>
	//* 578 1337:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 579 1340:pop             
	//* 580 1341:goto            1361
	//* 581 1344:aload           16
	//* 582 1346:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 583 1349:ldc2            #1296 <String "code">
	//* 584 1352:aload           10
	//* 585 1354:invokevirtual   #1299 <Method String APSVASTNonLinearNode.htmlResource()>
	//* 586 1357:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 587 1360:pop             
	//* 588 1361:aload           13
	//* 589 1363:ifnull          1380
	//* 590 1366:aload           16
	//* 591 1368:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 592 1371:ldc2            #1239 <String "errorTracking">
	//* 593 1374:aload           13
	//* 594 1376:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 595 1379:pop             
	//* 596 1380:aload_0         
	//* 597 1381:getfield        #271 <Field boolean showBannerCloseButton>
	//* 598 1384:ifeq            1687
	//* 599 1387:aload           12
	//* 600 1389:ifnull          1687
	//* 601 1392:aload           12
	//* 602 1394:ldc2            #1301 <String "closable">
	//* 603 1397:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 604 1400:ifnull          1420
	//* 605 1403:aload           12
	//* 606 1405:ldc2            #1301 <String "closable">
	//* 607 1408:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 608 1411:checkcast       #939 <Class Boolean>
	//* 609 1414:invokevirtual   #942 <Method boolean Boolean.booleanValue()>
	//* 610 1417:ifeq            1687
	//* 611 1420:aload           16
	//* 612 1422:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 613 1425:ldc2            #979 <String "activationOffset">
	//* 614 1428:aload_0         
	//* 615 1429:getfield        #264 <Field int bannerSkipOffset>
	//* 616 1432:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//* 617 1435:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 618 1438:pop             
	//* 619 1439:aload           16
	//* 620 1441:getfield        #1212 <Field HashMap APSMediaOverlay.trackingURLs>
	//* 621 1444:ldc2            #1303 <String "close">
	//* 622 1447:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 623 1450:checkcast       #137 <Class ArrayList>
	//* 624 1453:astore          11
	//* 625 1455:aload           11
	//* 626 1457:ifnull          1474
	//* 627 1460:aload           16
	//* 628 1462:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 629 1465:ldc2            #1305 <String "tracking">
	//* 630 1468:aload           11
	//* 631 1470:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 632 1473:pop             
	//* 633 1474:aload_0         
	//* 634 1475:getfield        #400 <Field Bitmap bannerCloseButtonImage>
	//* 635 1478:ifnull          1497
	//* 636 1481:aload           16
	//* 637 1483:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 638 1486:ldc2            #961 <String "image">
	//* 639 1489:aload_0         
	//* 640 1490:getfield        #400 <Field Bitmap bannerCloseButtonImage>
	//* 641 1493:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 642 1496:pop             
	//* 643 1497:aload_0         
	//* 644 1498:getfield        #402 <Field String bannerCloseButtonBackgroundColor>
	//* 645 1501:ifnull          1520
	//* 646 1504:aload           16
	//* 647 1506:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 648 1509:ldc2            #1307 <String "closeBackgroundColor">
	//* 649 1512:aload_0         
	//* 650 1513:getfield        #402 <Field String bannerCloseButtonBackgroundColor>
	//* 651 1516:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 652 1519:pop             
	//* 653 1520:aload_0         
	//* 654 1521:getfield        #404 <Field String bannerCloseButtonXColor>
	//* 655 1524:ifnull          1543
	//* 656 1527:aload           16
	//* 657 1529:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 658 1532:ldc2            #967 <String "xColor">
	//* 659 1535:aload_0         
	//* 660 1536:getfield        #404 <Field String bannerCloseButtonXColor>
	//* 661 1539:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 662 1542:pop             
	//* 663 1543:aload           16
	//* 664 1545:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 665 1548:ldc2            #945 <String "size">
	//* 666 1551:aload_0         
	//* 667 1552:getfield        #278 <Field int bannerCloseButtonSize>
	//* 668 1555:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//* 669 1558:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 670 1561:pop             
	//* 671 1562:aload           16
	//* 672 1564:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 673 1567:ldc2            #975 <String "initialAlpha">
	//* 674 1570:aload_0         
	//* 675 1571:getfield        #273 <Field float bannerCloseButtonInitialAlpha>
	//* 676 1574:invokestatic    #1312 <Method Float Float.valueOf(float)>
	//* 677 1577:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 678 1580:pop             
	//* 679 1581:aload           16
	//* 680 1583:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 681 1586:ldc2            #977 <String "finalAlpha">
	//* 682 1589:aload_0         
	//* 683 1590:getfield        #276 <Field float bannerCloseButtonFinalAlpha>
	//* 684 1593:invokestatic    #1312 <Method Float Float.valueOf(float)>
	//* 685 1596:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 686 1599:pop             
	//* 687 1600:aload_0         
	//* 688 1601:getfield        #406 <Field String bannerCloseButtonProgressColor>
	//* 689 1604:ifnull          1623
	//* 690 1607:aload           16
	//* 691 1609:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 692 1612:ldc2            #969 <String "progressColor">
	//* 693 1615:aload_0         
	//* 694 1616:getfield        #406 <Field String bannerCloseButtonProgressColor>
	//* 695 1619:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 696 1622:pop             
	//* 697 1623:aload_0         
	//* 698 1624:getfield        #408 <Field String bannerCloseButtonTrackColor>
	//* 699 1627:ifnull          1646
	//* 700 1630:aload           16
	//* 701 1632:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 702 1635:ldc2            #933 <String "trackColor">
	//* 703 1638:aload_0         
	//* 704 1639:getfield        #408 <Field String bannerCloseButtonTrackColor>
	//* 705 1642:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 706 1645:pop             
	//* 707 1646:aload           16
	//* 708 1648:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 709 1651:ldc2            #971 <String "offsetX">
	//* 710 1654:aload_0         
	//* 711 1655:getfield        #280 <Field int bannerCloseButtonOffsetX>
	//* 712 1658:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//* 713 1661:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 714 1664:pop             
	//* 715 1665:aload           16
	//* 716 1667:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 717 1670:ldc2            #973 <String "offsetY">
	//* 718 1673:aload_0         
	//* 719 1674:getfield        #282 <Field int bannerCloseButtonOffsetY>
	//* 720 1677:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//* 721 1680:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 722 1683:pop             
	//* 723 1684:goto            1703
	//* 724 1687:aload           16
	//* 725 1689:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//* 726 1692:ldc2            #937 <String "show">
	//* 727 1695:iconst_1        
	//* 728 1696:invokestatic    #1315 <Method Boolean Boolean.valueOf(boolean)>
	//* 729 1699:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//* 730 1702:pop             
	//* 731 1703:aload           16
	//* 732 1705:iconst_1        
	//* 733 1706:putfield        #1318 <Field boolean APSMediaOverlay.shouldBeRemoved>
	//* 734 1709:aload           10
	//* 735 1711:ldc2            #1320 <String "minSuggestedDuration">
	//* 736 1714:invokevirtual   #1323 <Method int APSVASTNonLinearNode.durationFromAttributeNamed(String)>
	//* 737 1717:istore          7
	//* 738 1719:iload           7
	//* 739 1721:istore          6
	//* 740 1723:iload           7
	//* 741 1725:iconst_m1       
	//* 742 1726:icmpne          1735
	//* 743 1729:aload_0         
	//* 744 1730:getfield        #242 <Field int defaultBannerAdBreakDuration>
	//* 745 1733:istore          6
	//* 746 1735:new             #768 <Class StringBuilder>
	//* 747 1738:dup             
	//* 748 1739:invokespecial   #769 <Method void StringBuilder()>
	//* 749 1742:astore          10
	//* 750 1744:aload           10
	//* 751 1746:ldc2            #1325 <String "+">
	//* 752 1749:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//* 753 1752:pop             
	//* 754 1753:aload           10
	//* 755 1755:iload           6
	//* 756 1757:invokevirtual   #1007 <Method StringBuilder StringBuilder.append(int)>
	//* 757 1760:pop             
	//* 758 1761:aload           16
	//* 759 1763:aload           10
	//* 760 1765:invokevirtual   #778 <Method String StringBuilder.toString()>
	//* 761 1768:invokevirtual   #1328 <Method void APSMediaOverlay.setEndPoint(String)>
	//* 762 1771:aload           16
	//* 763 1773:aload_0         
	//* 764 1774:getfield        #210 <Field float bannerFadeInDuration>
	//* 765 1777:putfield        #1331 <Field float APSMediaOverlay.fadeInDuration>
	//* 766 1780:aload           14
	//* 767 1782:aload           16
	//* 768 1784:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//* 769 1787:pop             
	//* 770 1788:goto            1815
	//* 771 1791:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//* 772 1794:aload           15
	//* 773 1796:sipush          503
	//* 774 1799:invokevirtual   #1219 <Method ArrayList APSVASTInLineNode.errorURLsWithCode(int)>
	//* 775 1802:ldc2            #1333 <String "could not select nonlinear">
	//* 776 1805:getstatic       #560 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.ERROR>
	//* 777 1808:aload_0         
	//* 778 1809:invokevirtual   #564 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
	//* 779 1812:goto            1815
	//* 780 1815:goto            50
	//* 781 1818:aload           14
	//* 782 1820:areturn         
	//* 783 1821:astore          12
	//* 784 1823:goto            749
					catch(Exception exception) { }
	//  785 1826:astore          11
					break label3;
	//  786 1828:goto            1380
				}
				flag = false;
				apsmediaoverlay.type = "com.appscend.mp.overlays.html";
				apsmediaoverlay.parameters.put("dismissAction", ((Object) (afterBannerTapped)));
				apsmediaoverlay.parameters.put("viewportWidth", ((Object) (String.valueOf(j))));
				apsmediaoverlay.parameters.put("viewportHeight", ((Object) (String.valueOf(l))));
				j = ((String) (obj1)).hashCode();
				if(j != 0xb8ff82a4)
				{
					if(j == 0x3107ab && ((String) (obj1)).equals("html"))
					{
						j = ((int) (flag));
						break label4;
					}
				} else
				if(((String) (obj1)).equals("iframe"))
				{
					j = 1;
					break label4;
				}
				j = -1;
			}
			switch(j)
			{
			default:
				apsmediaoverlay.parameters.put("script", ((Object) (((APSVASTNonLinearNode) (obj)).scriptResource())));
				break;

			case 1: // '\001'
				apsmediaoverlay.parameters.put("iframe", ((Object) (((APSVASTNonLinearNode) (obj)).iframeResource())));
				break;

			case 0: // '\0'
				apsmediaoverlay.parameters.put("code", ((Object) (((APSVASTNonLinearNode) (obj)).htmlResource())));
				break;
			}
			if(obj2 != null)
				apsmediaoverlay.parameters.put("errorTracking", obj2);
		}
		if(showBannerCloseButton && hashmap != null && (hashmap.get("closable") == null || ((Boolean)hashmap.get("closable")).booleanValue()))
		{
			apsmediaoverlay.parameters.put("activationOffset", ((Object) (Integer.valueOf(bannerSkipOffset))));
			obj1 = ((Object) ((ArrayList)apsmediaoverlay.trackingURLs.get("close")));
			if(obj1 != null)
				apsmediaoverlay.parameters.put("tracking", obj1);
			if(bannerCloseButtonImage != null)
				apsmediaoverlay.parameters.put("image", ((Object) (bannerCloseButtonImage)));
			if(bannerCloseButtonBackgroundColor != null)
				apsmediaoverlay.parameters.put("closeBackgroundColor", ((Object) (bannerCloseButtonBackgroundColor)));
			if(bannerCloseButtonXColor != null)
				apsmediaoverlay.parameters.put("xColor", ((Object) (bannerCloseButtonXColor)));
			apsmediaoverlay.parameters.put("size", ((Object) (Integer.valueOf(bannerCloseButtonSize))));
			apsmediaoverlay.parameters.put("initialAlpha", ((Object) (Float.valueOf(bannerCloseButtonInitialAlpha))));
			apsmediaoverlay.parameters.put("finalAlpha", ((Object) (Float.valueOf(bannerCloseButtonFinalAlpha))));
			if(bannerCloseButtonProgressColor != null)
				apsmediaoverlay.parameters.put("progressColor", ((Object) (bannerCloseButtonProgressColor)));
			if(bannerCloseButtonTrackColor != null)
				apsmediaoverlay.parameters.put("trackColor", ((Object) (bannerCloseButtonTrackColor)));
			apsmediaoverlay.parameters.put("offsetX", ((Object) (Integer.valueOf(bannerCloseButtonOffsetX))));
			apsmediaoverlay.parameters.put("offsetY", ((Object) (Integer.valueOf(bannerCloseButtonOffsetY))));
		} else
		{
			apsmediaoverlay.parameters.put("show", ((Object) (Boolean.valueOf(true))));
		}
		apsmediaoverlay.shouldBeRemoved = true;
		l = ((APSVASTNonLinearNode) (obj)).durationFromAttributeNamed("minSuggestedDuration");
		j = l;
		if(l == -1)
			j = defaultBannerAdBreakDuration;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("+");
		((StringBuilder) (obj)).append(j);
		apsmediaoverlay.setEndPoint(((StringBuilder) (obj)).toString());
		apsmediaoverlay.fadeInDuration = bannerFadeInDuration;
		arraylist2.add(((Object) (apsmediaoverlay)));
		  goto _L6
_L8:
		APSMediaPlayer.getInstance().trackforEvent(apsvastinlinenode.errorURLsWithCode(503), "could not select nonlinear", com.appscend.media.APSMediaTrackingEvents.MediaEventType.ERROR, ((APSMediaEvent) (this)));
		  goto _L6
_L2:
		return arraylist2;
		exception1;
		  goto _L12
	}

	public void removeSource(APSVASTXMLNode apsvastxmlnode)
	{
		sources.remove(((Object) (apsvastxmlnode)));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList sources>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1337 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeSource(String s)
	{
		sources.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList sources>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1337 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setAdBreakTrackingForArray(ArrayList arraylist)
	{
		if(arraylist != null && arraylist.size() > 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          228
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #604 <Method int ArrayList.size()>
	//*   4    8:ifle            228
		{
			if(trackingURLs.get("breakStart") != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #1338 <Field HashMap trackingURLs>
	//*   7   15:ldc2            #1340 <String "breakStart">
	//*   8   18:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//*   9   21:ifnull          115
			{
				Object obj = ((Object) (((APSMediaTrackableObject)arraylist.get(0)).trackingURLs));
	//   10   24:aload_1         
	//   11   25:iconst_0        
	//   12   26:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//   13   29:checkcast       #1342 <Class APSMediaTrackableObject>
	//   14   32:getfield        #1343 <Field HashMap APSMediaTrackableObject.trackingURLs>
	//   15   35:astore_3        
				HashMap hashmap = ((HashMap) (obj));
	//   16   36:aload_3         
	//   17   37:astore_2        
				if(obj == null)
	//*  18   38:aload_3         
	//*  19   39:ifnonnull       62
				{
					hashmap = new HashMap();
	//   20   42:new             #332 <Class HashMap>
	//   21   45:dup             
	//   22   46:invokespecial   #585 <Method void HashMap()>
	//   23   49:astore_2        
					((APSMediaTrackableObject)arraylist.get(0)).trackingURLs = hashmap;
	//   24   50:aload_1         
	//   25   51:iconst_0        
	//   26   52:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//   27   55:checkcast       #1342 <Class APSMediaTrackableObject>
	//   28   58:aload_2         
	//   29   59:putfield        #1343 <Field HashMap APSMediaTrackableObject.trackingURLs>
				}
				obj = ((Object) ((ArrayList)hashmap.get("launch")));
	//   30   62:aload_2         
	//   31   63:ldc2            #1345 <String "launch">
	//   32   66:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//   33   69:checkcast       #137 <Class ArrayList>
	//   34   72:astore_3        
				arraylist = ((ArrayList) (obj));
	//   35   73:aload_3         
	//   36   74:astore_1        
				if(obj == null)
	//*  37   75:aload_3         
	//*  38   76:ifnonnull       87
					arraylist = new ArrayList();
	//   39   79:new             #137 <Class ArrayList>
	//   40   82:dup             
	//   41   83:invokespecial   #138 <Method void ArrayList()>
	//   42   86:astore_1        
				arraylist.addAll((Collection)trackingURLs.get("launch"));
	//   43   87:aload_1         
	//   44   88:aload_0         
	//   45   89:getfield        #1338 <Field HashMap trackingURLs>
	//   46   92:ldc2            #1345 <String "launch">
	//   47   95:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//   48   98:checkcast       #671 <Class Collection>
	//   49  101:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//   50  104:pop             
				hashmap.put("launch", ((Object) (arraylist)));
	//   51  105:aload_2         
	//   52  106:ldc2            #1345 <String "launch">
	//   53  109:aload_1         
	//   54  110:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//   55  113:pop             
				return;
	//   56  114:return          
			}
			if(trackingURLs.get("breakEnd") != null)
	//*  57  115:aload_0         
	//*  58  116:getfield        #1338 <Field HashMap trackingURLs>
	//*  59  119:ldc2            #1347 <String "breakEnd">
	//*  60  122:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//*  61  125:ifnull          228
			{
				Object obj1 = ((Object) (((APSMediaTrackableObject)arraylist.get(arraylist.size() - 1)).trackingURLs));
	//   62  128:aload_1         
	//   63  129:aload_1         
	//   64  130:invokevirtual   #604 <Method int ArrayList.size()>
	//   65  133:iconst_1        
	//   66  134:isub            
	//   67  135:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//   68  138:checkcast       #1342 <Class APSMediaTrackableObject>
	//   69  141:getfield        #1343 <Field HashMap APSMediaTrackableObject.trackingURLs>
	//   70  144:astore_3        
				HashMap hashmap1 = ((HashMap) (obj1));
	//   71  145:aload_3         
	//   72  146:astore_2        
				if(obj1 == null)
	//*  73  147:aload_3         
	//*  74  148:ifnonnull       176
				{
					hashmap1 = new HashMap();
	//   75  151:new             #332 <Class HashMap>
	//   76  154:dup             
	//   77  155:invokespecial   #585 <Method void HashMap()>
	//   78  158:astore_2        
					((APSMediaTrackableObject)arraylist.get(arraylist.size() - 1)).trackingURLs = hashmap1;
	//   79  159:aload_1         
	//   80  160:aload_1         
	//   81  161:invokevirtual   #604 <Method int ArrayList.size()>
	//   82  164:iconst_1        
	//   83  165:isub            
	//   84  166:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//   85  169:checkcast       #1342 <Class APSMediaTrackableObject>
	//   86  172:aload_2         
	//   87  173:putfield        #1343 <Field HashMap APSMediaTrackableObject.trackingURLs>
				}
				obj1 = ((Object) ((ArrayList)hashmap1.get("finish")));
	//   88  176:aload_2         
	//   89  177:ldc2            #1349 <String "finish">
	//   90  180:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//   91  183:checkcast       #137 <Class ArrayList>
	//   92  186:astore_3        
				arraylist = ((ArrayList) (obj1));
	//   93  187:aload_3         
	//   94  188:astore_1        
				if(obj1 == null)
	//*  95  189:aload_3         
	//*  96  190:ifnonnull       201
					arraylist = new ArrayList();
	//   97  193:new             #137 <Class ArrayList>
	//   98  196:dup             
	//   99  197:invokespecial   #138 <Method void ArrayList()>
	//  100  200:astore_1        
				arraylist.addAll((Collection)trackingURLs.get("finish"));
	//  101  201:aload_1         
	//  102  202:aload_0         
	//  103  203:getfield        #1338 <Field HashMap trackingURLs>
	//  104  206:ldc2            #1349 <String "finish">
	//  105  209:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  106  212:checkcast       #671 <Class Collection>
	//  107  215:invokevirtual   #421 <Method boolean ArrayList.addAll(Collection)>
	//  108  218:pop             
				hashmap1.put("finish", ((Object) (arraylist)));
	//  109  219:aload_2         
	//  110  220:ldc2            #1349 <String "finish">
	//  111  223:aload_1         
	//  112  224:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  113  227:pop             
			}
		}
	//  114  228:return          
	}

	public boolean setPointsForOverlayForAdBreak(APSMediaOverlay apsmediaoverlay, APSVASTXMLNode apsvastxmlnode)
	{
		String s = (String)apsvastxmlnode.attributes.get("timeOffset");
	//    0    0:aload_2         
	//    1    1:getfield        #524 <Field HashMap APSVASTXMLNode.attributes>
	//    2    4:ldc2            #1354 <String "timeOffset">
	//    3    7:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #155 <Class String>
	//    5   13:astore          4
		if(apsmediaoverlay.position == APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionUnspecified)
	//*   6   15:aload_1         
	//*   7   16:getfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
	//*   8   19:getstatic       #1037 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionUnspecified>
	//*   9   22:if_acmpne       33
			apsmediaoverlay.position = bannerPosition;
	//   10   25:aload_1         
	//   11   26:aload_0         
	//   12   27:getfield        #269 <Field APSMediaOverlay$APSMediaOverlayPosition bannerPosition>
	//   13   30:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
		apsmediaoverlay.repeatAfter = apsvastxmlnode.durationFromAttributeNamed("repeatAfter");
	//   14   33:aload_1         
	//   15   34:aload_2         
	//   16   35:ldc2            #1355 <String "repeatAfter">
	//   17   38:invokevirtual   #1356 <Method int APSVASTXMLNode.durationFromAttributeNamed(String)>
	//   18   41:i2f             
	//   19   42:putfield        #1043 <Field float APSMediaOverlay.repeatAfter>
		int i = apsvastxmlnode.durationFromAttributeNamed("timeOffset");
	//   20   45:aload_2         
	//   21   46:ldc2            #1354 <String "timeOffset">
	//   22   49:invokevirtual   #1356 <Method int APSVASTXMLNode.durationFromAttributeNamed(String)>
	//   23   52:istore_3        
		if(i != -1)
	//*  24   53:iload_3         
	//*  25   54:iconst_m1       
	//*  26   55:icmpeq          68
		{
			apsmediaoverlay.setStartPoint(String.valueOf(i));
	//   27   58:aload_1         
	//   28   59:iload_3         
	//   29   60:invokestatic    #544 <Method String String.valueOf(int)>
	//   30   63:invokevirtual   #1049 <Method void APSMediaOverlay.setStartPoint(String)>
			return true;
	//   31   66:iconst_1        
	//   32   67:ireturn         
		}
		if(s.contains("%"))
	//*  33   68:aload           4
	//*  34   70:ldc2            #1358 <String "%">
	//*  35   73:invokevirtual   #1361 <Method boolean String.contains(CharSequence)>
	//*  36   76:ifeq            87
		{
			apsmediaoverlay.setStartPoint(s);
	//   37   79:aload_1         
	//   38   80:aload           4
	//   39   82:invokevirtual   #1049 <Method void APSMediaOverlay.setStartPoint(String)>
			return true;
	//   40   85:iconst_1        
	//   41   86:ireturn         
		}
		if(s.contains("#"))
	//*  42   87:aload           4
	//*  43   89:ldc2            #1363 <String "#">
	//*  44   92:invokevirtual   #1361 <Method boolean String.contains(CharSequence)>
	//*  45   95:ifeq            145
		{
			int j = Integer.parseInt(s.replace("#", ""));
	//   46   98:aload           4
	//   47  100:ldc2            #1363 <String "#">
	//   48  103:ldc2            #649 <String "">
	//   49  106:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//   50  109:invokestatic    #906 <Method int Integer.parseInt(String)>
	//   51  112:istore_3        
			if(defaultAdBreakPositions.size() >= j)
	//*  52  113:aload_0         
	//*  53  114:getfield        #384 <Field ArrayList defaultAdBreakPositions>
	//*  54  117:invokevirtual   #604 <Method int ArrayList.size()>
	//*  55  120:iload_3         
	//*  56  121:icmplt          143
			{
				apsmediaoverlay.setStartPoint((String)defaultAdBreakPositions.get(j - 1));
	//   57  124:aload_1         
	//   58  125:aload_0         
	//   59  126:getfield        #384 <Field ArrayList defaultAdBreakPositions>
	//   60  129:iload_3         
	//   61  130:iconst_1        
	//   62  131:isub            
	//   63  132:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//   64  135:checkcast       #155 <Class String>
	//   65  138:invokevirtual   #1049 <Method void APSMediaOverlay.setStartPoint(String)>
				return true;
	//   66  141:iconst_1        
	//   67  142:ireturn         
			} else
			{
				return false;
	//   68  143:iconst_0        
	//   69  144:ireturn         
			}
		}
		if(s.equals("start"))
	//*  70  145:aload           4
	//*  71  147:ldc2            #1365 <String "start">
	//*  72  150:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  73  153:ifeq            192
		{
			if(defaultAdBreakPositions.size() > 0)
	//*  74  156:aload_0         
	//*  75  157:getfield        #384 <Field ArrayList defaultAdBreakPositions>
	//*  76  160:invokevirtual   #604 <Method int ArrayList.size()>
	//*  77  163:ifle            181
				apsvastxmlnode = ((APSVASTXMLNode) ((String)defaultAdBreakPositions.get(0)));
	//   78  166:aload_0         
	//   79  167:getfield        #384 <Field ArrayList defaultAdBreakPositions>
	//   80  170:iconst_0        
	//   81  171:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//   82  174:checkcast       #155 <Class String>
	//   83  177:astore_2        
			else
	//*  84  178:goto            185
				apsvastxmlnode = "0";
	//   85  181:ldc2            #1367 <String "0">
	//   86  184:astore_2        
			apsmediaoverlay.setStartPoint(((String) (apsvastxmlnode)));
	//   87  185:aload_1         
	//   88  186:aload_2         
	//   89  187:invokevirtual   #1049 <Method void APSMediaOverlay.setStartPoint(String)>
			return true;
	//   90  190:iconst_1        
	//   91  191:ireturn         
		} else
		{
			return false;
	//   92  192:iconst_0        
	//   93  193:ireturn         
		}
	}

	public void trackErrorWithCode(int i, String s)
	{
		if(trackingURLs.get("error") != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1338 <Field HashMap trackingURLs>
	//*   2    4:ldc2            #529 <String "error">
	//*   3    7:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//*   4   10:ifnull          85
		{
			ArrayList arraylist = (ArrayList)trackingURLs.get("error");
	//    5   13:aload_0         
	//    6   14:getfield        #1338 <Field HashMap trackingURLs>
	//    7   17:ldc2            #529 <String "error">
	//    8   20:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//    9   23:checkcast       #137 <Class ArrayList>
	//   10   26:astore          4
			for(int j = 0; j < arraylist.size(); j++)
	//*  11   28:iconst_0        
	//*  12   29:istore_3        
	//*  13   30:iload_3         
	//*  14   31:aload           4
	//*  15   33:invokevirtual   #604 <Method int ArrayList.size()>
	//*  16   36:icmpge          72
				arraylist.set(j, ((Object) (((String)arraylist.get(j)).replace("[ERROR_CODE]", ((CharSequence) (String.valueOf(i)))))));
	//   17   39:aload           4
	//   18   41:iload_3         
	//   19   42:aload           4
	//   20   44:iload_3         
	//   21   45:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//   22   48:checkcast       #155 <Class String>
	//   23   51:ldc2            #540 <String "[ERROR_CODE]">
	//   24   54:iload_1         
	//   25   55:invokestatic    #544 <Method String String.valueOf(int)>
	//   26   58:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//   27   61:invokevirtual   #1371 <Method Object ArrayList.set(int, Object)>
	//   28   64:pop             

	//   29   65:iload_3         
	//   30   66:iconst_1        
	//   31   67:iadd            
	//   32   68:istore_3        
	//*  33   69:goto            30
			APSMediaPlayer.getInstance().trackforEvent(arraylist, s, com.appscend.media.APSMediaTrackingEvents.MediaEventType.ERROR, ((APSMediaEvent) (this)));
	//   34   72:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   35   75:aload           4
	//   36   77:aload_2         
	//   37   78:getstatic       #560 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.ERROR>
	//   38   81:aload_0         
	//   39   82:invokevirtual   #564 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
		}
	//   40   85:return          
	}

	public ArrayList unitsForLinearsInInlineNodesWithBuffet(ArrayList arraylist, ArrayList arraylist1)
	{
		ArrayList arraylist4 = new ArrayList();
	//    0    0:new             #137 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void ArrayList()>
	//    3    7:astore          13
		Object obj2;
label0:
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext(); arraylist = ((ArrayList) (obj2)))
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//*   6   13:astore_1        
	//*   7   14:aload_1         
	//*   8   15:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//*   9   20:ifeq            2559
		{
			APSVASTInLineNode apsvastinlinenode = (APSVASTInLineNode)((Iterator) (arraylist)).next();
	//   10   23:aload_1         
	//   11   24:invokeinterface #437 <Method Object Iterator.next()>
	//   12   29:checkcast       #289 <Class APSVASTInLineNode>
	//   13   32:astore          14
			int k = apsvastinlinenode.sourceIndex;
	//   14   34:aload           14
	//   15   36:getfield        #638 <Field int APSVASTInLineNode.sourceIndex>
	//   16   39:istore          6
			Object obj1 = ((Object) (apsvastinlinenode.sourceUrl));
	//   17   41:aload           14
	//   18   43:getfield        #641 <Field String APSVASTInLineNode.sourceUrl>
	//   19   46:astore          10
			String s = apsvastinlinenode.adId;
	//   20   48:aload           14
	//   21   50:getfield        #647 <Field String APSVASTInLineNode.adId>
	//   22   53:astore          9
			Object obj = ((Object) (apsvastinlinenode.firstChildNamed("Extensions")));
	//   23   55:aload           14
	//   24   57:ldc2            #1373 <String "Extensions">
	//   25   60:invokevirtual   #1374 <Method APSVASTXMLNode APSVASTInLineNode.firstChildNamed(String)>
	//   26   63:astore          8
			boolean flag2 = false;
	//   27   65:iconst_0        
	//   28   66:istore          7
			int j;
			if(obj != null)
	//*  29   68:aload           8
	//*  30   70:ifnull          228
			{
				obj = ((Object) (apsvastinlinenode.firstChildNamed("Extensions").childrenNamed("Extension").iterator()));
	//   31   73:aload           14
	//   32   75:ldc2            #1373 <String "Extensions">
	//   33   78:invokevirtual   #1374 <Method APSVASTXMLNode APSVASTInLineNode.firstChildNamed(String)>
	//   34   81:ldc2            #1376 <String "Extension">
	//   35   84:invokevirtual   #521 <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//   36   87:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//   37   90:astore          8
				boolean flag = true;
	//   38   92:iconst_1        
	//   39   93:istore          4
				do
				{
					j = ((int) (flag));
	//   40   95:iload           4
	//   41   97:istore          5
					if(!((Iterator) (obj)).hasNext())
						break;
	//   42   99:aload           8
	//   43  101:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//   44  106:ifeq            231
					APSVASTXMLNode apsvastxmlnode = (APSVASTXMLNode)((Iterator) (obj)).next();
	//   45  109:aload           8
	//   46  111:invokeinterface #437 <Method Object Iterator.next()>
	//   47  116:checkcast       #511 <Class APSVASTXMLNode>
	//   48  119:astore          11
					if(apsvastxmlnode.firstChildNamed("Fallback") != null && apsvastxmlnode.firstChildNamed("Fallback").value.equals("true"))
	//*  49  121:aload           11
	//*  50  123:ldc2            #1378 <String "Fallback">
	//*  51  126:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//*  52  129:ifnull          95
	//*  53  132:aload           11
	//*  54  134:ldc2            #1378 <String "Fallback">
	//*  55  137:invokevirtual   #515 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//*  56  140:getfield        #538 <Field String APSVASTXMLNode.value>
	//*  57  143:ldc2            #1380 <String "true">
	//*  58  146:invokevirtual   #493 <Method boolean String.equals(Object)>
	//*  59  149:ifeq            95
					{
						APSMediaUnit apsmediaunit = new APSMediaUnit();
	//   60  152:new             #303 <Class APSMediaUnit>
	//   61  155:dup             
	//   62  156:invokespecial   #1381 <Method void APSMediaUnit()>
	//   63  159:astore          11
						apsmediaunit.url = null;
	//   64  161:aload           11
	//   65  163:aconst_null     
	//   66  164:putfield        #1383 <Field String APSMediaUnit.url>
						apsmediaunit.trackingURLs = new HashMap();
	//   67  167:aload           11
	//   68  169:new             #332 <Class HashMap>
	//   69  172:dup             
	//   70  173:invokespecial   #585 <Method void HashMap()>
	//   71  176:putfield        #1384 <Field HashMap APSMediaUnit.trackingURLs>
						ArrayList arraylist2 = apsvastinlinenode.impressionURLs();
	//   72  179:aload           14
	//   73  181:invokevirtual   #1207 <Method ArrayList APSVASTInLineNode.impressionURLs()>
	//   74  184:astore          12
						if(arraylist2 != null)
	//*  75  186:aload           12
	//*  76  188:ifnull          205
							apsmediaunit.trackingURLs.put("launch", ((Object) (arraylist2)));
	//   77  191:aload           11
	//   78  193:getfield        #1384 <Field HashMap APSMediaUnit.trackingURLs>
	//   79  196:ldc2            #1345 <String "launch">
	//   80  199:aload           12
	//   81  201:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//   82  204:pop             
						apsmediaunit.debug = debugMode;
	//   83  205:aload           11
	//   84  207:aload_0         
	//   85  208:getfield        #412 <Field boolean debugMode>
	//   86  211:putfield        #1387 <Field boolean APSMediaUnit.debug>
						arraylist4.add(((Object) (apsmediaunit)));
	//   87  214:aload           13
	//   88  216:aload           11
	//   89  218:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//   90  221:pop             
						flag = false;
	//   91  222:iconst_0        
	//   92  223:istore          4
					}
				} while(true);
	//   93  225:goto            95
			} else
			{
				j = 1;
	//   94  228:iconst_1        
	//   95  229:istore          5
			}
			obj2 = ((Object) (arraylist));
	//   96  231:aload_1         
	//   97  232:astore          11
			if(!j)
				continue;
	//   98  234:iload           5
	//   99  236:ifeq            2553
			obj = ((Object) (apsvastinlinenode.creatives().iterator()));
	//  100  239:aload           14
	//  101  241:invokevirtual   #1136 <Method ArrayList APSVASTInLineNode.creatives()>
	//  102  244:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//  103  247:astore          8
			j = ((int) (flag2));
	//  104  249:iload           7
	//  105  251:istore          5
			int i = k;
	//  106  253:iload           6
	//  107  255:istore          4
			do
			{
				int i1;
label1:
				{
label2:
					{
						APSVASTLinearNode apsvastlinearnode;
label3:
						{
							obj2 = ((Object) (arraylist));
	//  108  257:aload_1         
	//  109  258:astore          11
							if(!((Iterator) (obj)).hasNext())
								continue label0;
	//  110  260:aload           8
	//  111  262:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//  112  267:ifeq            2553
							apsvastlinearnode = ((APSVASTCreativeNode)((Iterator) (obj)).next()).getLinear();
	//  113  270:aload           8
	//  114  272:invokeinterface #437 <Method Object Iterator.next()>
	//  115  277:checkcast       #1138 <Class APSVASTCreativeNode>
	//  116  280:invokevirtual   #1391 <Method APSVASTLinearNode APSVASTCreativeNode.getLinear()>
	//  117  283:astore          15
							if(apsvastlinearnode == null)
								break label2;
	//  118  285:aload           15
	//  119  287:ifnull          2518
							HashMap hashmap = new HashMap();
	//  120  290:new             #332 <Class HashMap>
	//  121  293:dup             
	//  122  294:invokespecial   #585 <Method void HashMap()>
	//  123  297:astore          16
							if(apsvastlinearnode.mediaFiles() != null)
	//* 124  299:aload           15
	//* 125  301:invokevirtual   #1396 <Method ArrayList APSVASTLinearNode.mediaFiles()>
	//* 126  304:ifnull          396
							{
								APSVASTMediaFileNode apsvastmediafilenode;
								for(Iterator iterator = apsvastlinearnode.mediaFiles().iterator(); iterator.hasNext(); hashmap.put(((Object) (apsvastmediafilenode.type())), obj2))
	//* 127  307:aload           15
	//* 128  309:invokevirtual   #1396 <Method ArrayList APSVASTLinearNode.mediaFiles()>
	//* 129  312:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//* 130  315:astore          17
	//* 131  317:aload           17
	//* 132  319:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//* 133  324:ifeq            396
								{
									apsvastmediafilenode = (APSVASTMediaFileNode)iterator.next();
	//  134  327:aload           17
	//  135  329:invokeinterface #437 <Method Object Iterator.next()>
	//  136  334:checkcast       #1398 <Class APSVASTMediaFileNode>
	//  137  337:astore          18
									ArrayList arraylist3 = (ArrayList)hashmap.get(((Object) (apsvastmediafilenode.type())));
	//  138  339:aload           16
	//  139  341:aload           18
	//  140  343:invokevirtual   #1400 <Method String APSVASTMediaFileNode.type()>
	//  141  346:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  142  349:checkcast       #137 <Class ArrayList>
	//  143  352:astore          12
									obj2 = ((Object) (arraylist3));
	//  144  354:aload           12
	//  145  356:astore          11
									if(arraylist3 == null)
	//* 146  358:aload           12
	//* 147  360:ifnonnull       372
										obj2 = ((Object) (new ArrayList()));
	//  148  363:new             #137 <Class ArrayList>
	//  149  366:dup             
	//  150  367:invokespecial   #138 <Method void ArrayList()>
	//  151  370:astore          11
									((ArrayList) (obj2)).add(((Object) (apsvastmediafilenode)));
	//  152  372:aload           11
	//  153  374:aload           18
	//  154  376:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	//  155  379:pop             
								}

	//  156  380:aload           16
	//  157  382:aload           18
	//  158  384:invokevirtual   #1400 <Method String APSVASTMediaFileNode.type()>
	//  159  387:aload           11
	//  160  389:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  161  392:pop             
							}
	//* 162  393:goto            317
							for(obj2 = ((Object) (prefferedVideoMimeTypes.iterator())); ((Iterator) (obj2)).hasNext();)
	//* 163  396:aload_0         
	//* 164  397:getfield        #182 <Field ArrayList prefferedVideoMimeTypes>
	//* 165  400:invokevirtual   #427 <Method Iterator ArrayList.iterator()>
	//* 166  403:astore          11
	//* 167  405:aload           11
	//* 168  407:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//* 169  412:ifeq            452
							{
								String s1 = (String)((Iterator) (obj2)).next();
	//  170  415:aload           11
	//  171  417:invokeinterface #437 <Method Object Iterator.next()>
	//  172  422:checkcast       #155 <Class String>
	//  173  425:astore          12
								if(hashmap.get(((Object) (s1))) != null)
	//* 174  427:aload           16
	//* 175  429:aload           12
	//* 176  431:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 177  434:ifnull          405
								{
									obj2 = ((Object) ((ArrayList)hashmap.get(((Object) (s1)))));
	//  178  437:aload           16
	//  179  439:aload           12
	//  180  441:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  181  444:checkcast       #137 <Class ArrayList>
	//  182  447:astore          11
									break label3;
	//  183  449:goto            455
								}
							}

							obj2 = null;
	//  184  452:aconst_null     
	//  185  453:astore          11
						}
label4:
						{
							if(obj2 != null)
	//* 186  455:aload           11
	//* 187  457:ifnull          508
							{
								if(((ArrayList) (obj2)).size() == 1)
	//* 188  460:aload           11
	//* 189  462:invokevirtual   #604 <Method int ArrayList.size()>
	//* 190  465:iconst_1        
	//* 191  466:icmpne          484
								{
									obj2 = ((Object) ((APSVASTMediaFileNode)((ArrayList) (obj2)).get(j)));
	//  192  469:aload           11
	//  193  471:iload           5
	//  194  473:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//  195  476:checkcast       #1398 <Class APSVASTMediaFileNode>
	//  196  479:astore          11
									break label4;
	//  197  481:goto            511
								}
								if(((ArrayList) (obj2)).size() > 1)
	//* 198  484:aload           11
	//* 199  486:invokevirtual   #604 <Method int ArrayList.size()>
	//* 200  489:iconst_1        
	//* 201  490:icmple          508
								{
									obj2 = ((Object) ((APSVASTMediaFileNode)((ArrayList) (obj2)).get(j)));
	//  202  493:aload           11
	//  203  495:iload           5
	//  204  497:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//  205  500:checkcast       #1398 <Class APSVASTMediaFileNode>
	//  206  503:astore          11
									break label4;
	//  207  505:goto            511
								}
							}
							obj2 = null;
	//  208  508:aconst_null     
	//  209  509:astore          11
						}
label5:
						{
							if(obj2 == null)
								break label5;
	//  210  511:aload           11
	//  211  513:ifnull          2478
							APSMediaUnit apsmediaunit1 = new APSMediaUnit();
	//  212  516:new             #303 <Class APSMediaUnit>
	//  213  519:dup             
	//  214  520:invokespecial   #1381 <Method void APSMediaUnit()>
	//  215  523:astore          12
							apsmediaunit1.controlsDisplay = controlsDisplayForAds;
	//  216  525:aload           12
	//  217  527:aload_0         
	//  218  528:getfield        #193 <Field APSMediaUnit$APSMediaControlsDisplay controlsDisplayForAds>
	//  219  531:putfield        #1403 <Field APSMediaUnit$APSMediaControlsDisplay APSMediaUnit.controlsDisplay>
							apsmediaunit1.controlsParameters = controlsParametersForAds;
	//  220  534:aload           12
	//  221  536:aload_0         
	//  222  537:getfield        #346 <Field HashMap controlsParametersForAds>
	//  223  540:putfield        #1406 <Field HashMap APSMediaUnit.controlsParameters>
							apsmediaunit1.url = VPUtilities.sanitizeUnitUrl(((Object) (((APSVASTMediaFileNode) (obj2)).url())));
	//  224  543:aload           12
	//  225  545:aload           11
	//  226  547:invokevirtual   #1408 <Method String APSVASTMediaFileNode.url()>
	//  227  550:invokestatic    #1414 <Method String VPUtilities.sanitizeUnitUrl(Object)>
	//  228  553:putfield        #1383 <Field String APSMediaUnit.url>
							if(apsmediaunit1.url == null)
	//* 229  556:aload           12
	//* 230  558:getfield        #1383 <Field String APSMediaUnit.url>
	//* 231  561:ifnonnull       567
								continue;
	//  232  564:goto            257
							apsmediaunit1.buffet = arraylist1;
	//  233  567:aload           12
	//  234  569:aload_2         
	//  235  570:putfield        #1415 <Field ArrayList APSMediaUnit.buffet>
							if(apsmediaunit1.metadata == null)
	//* 236  573:aload           12
	//* 237  575:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//* 238  578:ifnonnull       593
								apsmediaunit1.metadata = new HashMap();
	//  239  581:aload           12
	//  240  583:new             #332 <Class HashMap>
	//  241  586:dup             
	//  242  587:invokespecial   #585 <Method void HashMap()>
	//  243  590:putfield        #1075 <Field HashMap APSMediaUnit.metadata>
							apsmediaunit1.metadata.put("source_index", ((Object) (Integer.valueOf(i))));
	//  244  593:aload           12
	//  245  595:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  246  598:ldc2            #1417 <String "source_index">
	//  247  601:iload           4
	//  248  603:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  249  606:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  250  609:pop             
							apsmediaunit1.metadata.put("source_url", obj1);
	//  251  610:aload           12
	//  252  612:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  253  615:ldc2            #1419 <String "source_url">
	//  254  618:aload           10
	//  255  620:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  256  623:pop             
							apsmediaunit1.metadata.put("ad_id", ((Object) (s)));
	//  257  624:aload           12
	//  258  626:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  259  629:ldc2            #1421 <String "ad_id">
	//  260  632:aload           9
	//  261  634:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  262  637:pop             
							Object obj3 = ((Object) (apsvastlinearnode.clickThrough()));
	//  263  638:aload           15
	//  264  640:invokevirtual   #1422 <Method String APSVASTLinearNode.clickThrough()>
	//  265  643:astore          16
							if(obj3 != null)
	//* 266  645:aload           16
	//* 267  647:ifnull          802
							{
								obj2 = ((Object) (new APSMediaOverlay()));
	//  268  650:new             #1032 <Class APSMediaOverlay>
	//  269  653:dup             
	//  270  654:invokespecial   #1169 <Method void APSMediaOverlay()>
	//  271  657:astore          11
								obj2.type = "button";
	//  272  659:aload           11
	//  273  661:ldc2            #1424 <String "button">
	//  274  664:putfield        #1101 <Field String APSMediaOverlay.type>
								((APSMediaOverlay) (obj2)).setStartPoint("0");
	//  275  667:aload           11
	//  276  669:ldc2            #1367 <String "0">
	//  277  672:invokevirtual   #1049 <Method void APSMediaOverlay.setStartPoint(String)>
								((APSMediaOverlay) (obj2)).setEndPoint("100%");
	//  278  675:aload           11
	//  279  677:ldc2            #1426 <String "100%">
	//  280  680:invokevirtual   #1328 <Method void APSMediaOverlay.setEndPoint(String)>
								obj2.zIndex = j;
	//  281  683:aload           11
	//  282  685:iload           5
	//  283  687:putfield        #1429 <Field int APSMediaOverlay.zIndex>
								obj2.position = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen;
	//  284  690:aload           11
	//  285  692:getstatic       #1432 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen>
	//  286  695:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
								obj2.parameters = new HashMap();
	//  287  698:aload           11
	//  288  700:new             #332 <Class HashMap>
	//  289  703:dup             
	//  290  704:invokespecial   #585 <Method void HashMap()>
	//  291  707:putfield        #1215 <Field HashMap APSMediaOverlay.parameters>
								((APSMediaOverlay) (obj2)).parameters.put("clickThrough", obj3);
	//  292  710:aload           11
	//  293  712:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  294  715:ldc2            #1232 <String "clickThrough">
	//  295  718:aload           16
	//  296  720:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  297  723:pop             
								((APSMediaOverlay) (obj2)).parameters.put("dismissAction", ((Object) (afterVideoAdTapped)));
	//  298  724:aload           11
	//  299  726:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  300  729:ldc2            #1228 <String "dismissAction">
	//  301  732:aload_0         
	//  302  733:getfield        #151 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction afterVideoAdTapped>
	//  303  736:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  304  739:pop             
								((APSMediaOverlay) (obj2)).metadata.put("skip_tracking", "true");
	//  305  740:aload           11
	//  306  742:getfield        #1058 <Field HashMap APSMediaOverlay.metadata>
	//  307  745:ldc2            #1434 <String "skip_tracking">
	//  308  748:ldc2            #1380 <String "true">
	//  309  751:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  310  754:pop             
								apsmediaunit1.metadata.put("ad_url", obj3);
	//  311  755:aload           12
	//  312  757:getfield        #1075 <Field HashMap APSMediaUnit.metadata>
	//  313  760:ldc2            #1436 <String "ad_url">
	//  314  763:aload           16
	//  315  765:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  316  768:pop             
								obj3 = ((Object) (apsvastlinearnode.clickTrackingURLs()));
	//  317  769:aload           15
	//  318  771:invokevirtual   #1437 <Method ArrayList APSVASTLinearNode.clickTrackingURLs()>
	//  319  774:astore          16
								if(obj3 != null)
	//* 320  776:aload           16
	//* 321  778:ifnull          795
									((APSMediaOverlay) (obj2)).parameters.put("clickTracking", obj3);
	//  322  781:aload           11
	//  323  783:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  324  786:ldc2            #1237 <String "clickTracking">
	//  325  789:aload           16
	//  326  791:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  327  794:pop             
								apsmediaunit1.addOverlay(((APSMediaOverlay) (obj2)));
	//  328  795:aload           12
	//  329  797:aload           11
	//  330  799:invokevirtual   #1441 <Method void APSMediaUnit.addOverlay(APSMediaOverlay)>
							}
							if(showCountdown)
	//* 331  802:aload_0         
	//* 332  803:getfield        #198 <Field boolean showCountdown>
	//* 333  806:ifeq            1001
							{
								obj2 = ((Object) (new APSMediaOverlay()));
	//  334  809:new             #1032 <Class APSMediaOverlay>
	//  335  812:dup             
	//  336  813:invokespecial   #1169 <Method void APSMediaOverlay()>
	//  337  816:astore          11
								obj2.type = "com.appscend.mp.overlays.text";
	//  338  818:aload           11
	//  339  820:ldc2            #1443 <String "com.appscend.mp.overlays.text">
	//  340  823:putfield        #1101 <Field String APSMediaOverlay.type>
								obj2.position = countdownPosition;
	//  341  826:aload           11
	//  342  828:aload_0         
	//  343  829:getfield        #205 <Field APSMediaOverlay$APSMediaOverlayPosition countdownPosition>
	//  344  832:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
								obj2.width = countdownWidth;
	//  345  835:aload           11
	//  346  837:aload_0         
	//  347  838:getfield        #238 <Field String countdownWidth>
	//  348  841:putfield        #1179 <Field String APSMediaOverlay.width>
								obj2.height = countdownHeight;
	//  349  844:aload           11
	//  350  846:aload_0         
	//  351  847:getfield        #240 <Field String countdownHeight>
	//  352  850:putfield        #1181 <Field String APSMediaOverlay.height>
								obj2.zIndex = 1;
	//  353  853:aload           11
	//  354  855:iconst_1        
	//  355  856:putfield        #1429 <Field int APSMediaOverlay.zIndex>
								((APSMediaOverlay) (obj2)).setStartPoint("0");
	//  356  859:aload           11
	//  357  861:ldc2            #1367 <String "0">
	//  358  864:invokevirtual   #1049 <Method void APSMediaOverlay.setStartPoint(String)>
								((APSMediaOverlay) (obj2)).setEndPoint("100%");
	//  359  867:aload           11
	//  360  869:ldc2            #1426 <String "100%">
	//  361  872:invokevirtual   #1328 <Method void APSMediaOverlay.setEndPoint(String)>
								obj2.parameters = new HashMap();
	//  362  875:aload           11
	//  363  877:new             #332 <Class HashMap>
	//  364  880:dup             
	//  365  881:invokespecial   #585 <Method void HashMap()>
	//  366  884:putfield        #1215 <Field HashMap APSMediaOverlay.parameters>
								if(countdownText != null)
	//* 367  887:aload_0         
	//* 368  888:getfield        #356 <Field String countdownText>
	//* 369  891:ifnull          910
									((APSMediaOverlay) (obj2)).parameters.put("text", ((Object) (countdownText)));
	//  370  894:aload           11
	//  371  896:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  372  899:ldc2            #898 <String "text">
	//  373  902:aload_0         
	//  374  903:getfield        #356 <Field String countdownText>
	//  375  906:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  376  909:pop             
								if(countdownFont != null)
	//* 377  910:aload_0         
	//* 378  911:getfield        #358 <Field String countdownFont>
	//* 379  914:ifnull          933
									((APSMediaOverlay) (obj2)).parameters.put("font", ((Object) (countdownFont)));
	//  380  917:aload           11
	//  381  919:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  382  922:ldc2            #944 <String "font">
	//  383  925:aload_0         
	//  384  926:getfield        #358 <Field String countdownFont>
	//  385  929:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  386  932:pop             
								if(countdownSize != null)
	//* 387  933:aload_0         
	//* 388  934:getfield        #360 <Field String countdownSize>
	//* 389  937:ifnull          956
									((APSMediaOverlay) (obj2)).parameters.put("size", ((Object) (countdownSize)));
	//  390  940:aload           11
	//  391  942:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  392  945:ldc2            #945 <String "size">
	//  393  948:aload_0         
	//  394  949:getfield        #360 <Field String countdownSize>
	//  395  952:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  396  955:pop             
								if(countdownColor != null)
	//* 397  956:aload_0         
	//* 398  957:getfield        #362 <Field String countdownColor>
	//* 399  960:ifnull          979
									((APSMediaOverlay) (obj2)).parameters.put("color", ((Object) (countdownColor)));
	//  400  963:aload           11
	//  401  965:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  402  968:ldc2            #915 <String "color">
	//  403  971:aload_0         
	//  404  972:getfield        #362 <Field String countdownColor>
	//  405  975:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  406  978:pop             
								((APSMediaOverlay) (obj2)).metadata.put("skip_tracking", "true");
	//  407  979:aload           11
	//  408  981:getfield        #1058 <Field HashMap APSMediaOverlay.metadata>
	//  409  984:ldc2            #1434 <String "skip_tracking">
	//  410  987:ldc2            #1380 <String "true">
	//  411  990:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  412  993:pop             
								apsmediaunit1.addOverlay(((APSMediaOverlay) (obj2)));
	//  413  994:aload           12
	//  414  996:aload           11
	//  415  998:invokevirtual   #1441 <Method void APSMediaUnit.addOverlay(APSMediaOverlay)>
							}
							obj3 = ((Object) (apsvastlinearnode.icons().keySet().iterator()));
	//  416 1001:aload           15
	//  417 1003:invokevirtual   #1445 <Method HashMap APSVASTLinearNode.icons()>
	//  418 1006:invokevirtual   #1448 <Method Set HashMap.keySet()>
	//  419 1009:invokeinterface #478 <Method Iterator Set.iterator()>
	//  420 1014:astore          16
label6:
							do
							{
								APSVASTIconNode apsvasticonnode;
								APSMediaOverlay apsmediaoverlay;
label7:
								{
									if(!((Iterator) (obj3)).hasNext())
										break label6;
	//  421 1016:aload           16
	//  422 1018:invokeinterface #433 <Method boolean Iterator.hasNext()>
	//  423 1023:ifeq            1864
									obj2 = ((Object) ((String)((Iterator) (obj3)).next()));
	//  424 1026:aload           16
	//  425 1028:invokeinterface #437 <Method Object Iterator.next()>
	//  426 1033:checkcast       #155 <Class String>
	//  427 1036:astore          11
									apsvasticonnode = (APSVASTIconNode)((ArrayList)apsvastlinearnode.icons().get(obj2)).get(0);
	//  428 1038:aload           15
	//  429 1040:invokevirtual   #1445 <Method HashMap APSVASTLinearNode.icons()>
	//  430 1043:aload           11
	//  431 1045:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  432 1048:checkcast       #137 <Class ArrayList>
	//  433 1051:iconst_0        
	//  434 1052:invokevirtual   #712 <Method Object ArrayList.get(int)>
	//  435 1055:checkcast       #1450 <Class APSVASTIconNode>
	//  436 1058:astore          17
									if(apsvasticonnode.staticResource() == null)
										continue;
	//  437 1060:aload           17
	//  438 1062:invokevirtual   #1453 <Method String APSVASTIconNode.staticResource()>
	//  439 1065:ifnull          1861
									apsmediaoverlay = new APSMediaOverlay();
	//  440 1068:new             #1032 <Class APSMediaOverlay>
	//  441 1071:dup             
	//  442 1072:invokespecial   #1169 <Method void APSMediaOverlay()>
	//  443 1075:astore          18
									apsmediaoverlay.type = "com.appscend.mp.overlays.image";
	//  444 1077:aload           18
	//  445 1079:ldc2            #1221 <String "com.appscend.mp.overlays.image">
	//  446 1082:putfield        #1101 <Field String APSMediaOverlay.type>
									apsmediaoverlay.parameters = new HashMap();
	//  447 1085:aload           18
	//  448 1087:new             #332 <Class HashMap>
	//  449 1090:dup             
	//  450 1091:invokespecial   #585 <Method void HashMap()>
	//  451 1094:putfield        #1215 <Field HashMap APSMediaOverlay.parameters>
									apsmediaoverlay.parameters.put("url", ((Object) (apsvasticonnode.staticResource())));
	//  452 1097:aload           18
	//  453 1099:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  454 1102:ldc2            #1223 <String "url">
	//  455 1105:aload           17
	//  456 1107:invokevirtual   #1453 <Method String APSVASTIconNode.staticResource()>
	//  457 1110:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  458 1113:pop             
									apsmediaoverlay.parameters.put("show", ((Object) (Boolean.valueOf(true))));
	//  459 1114:aload           18
	//  460 1116:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  461 1119:ldc2            #937 <String "show">
	//  462 1122:iconst_1        
	//  463 1123:invokestatic    #1315 <Method Boolean Boolean.valueOf(boolean)>
	//  464 1126:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  465 1129:pop             
									if(apsvasticonnode.clickThrough() != null)
	//* 466 1130:aload           17
	//* 467 1132:invokevirtual   #1454 <Method String APSVASTIconNode.clickThrough()>
	//* 468 1135:ifnull          1155
										apsmediaoverlay.parameters.put("clickThrough", ((Object) (apsvasticonnode.clickThrough())));
	//  469 1138:aload           18
	//  470 1140:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  471 1143:ldc2            #1232 <String "clickThrough">
	//  472 1146:aload           17
	//  473 1148:invokevirtual   #1454 <Method String APSVASTIconNode.clickThrough()>
	//  474 1151:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  475 1154:pop             
									if(apsvasticonnode.clickTrackingURLs() != null)
	//* 476 1155:aload           17
	//* 477 1157:invokevirtual   #1455 <Method ArrayList APSVASTIconNode.clickTrackingURLs()>
	//* 478 1160:ifnull          1180
										apsmediaoverlay.parameters.put("clickTracking", ((Object) (apsvasticonnode.clickTrackingURLs())));
	//  479 1163:aload           18
	//  480 1165:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  481 1168:ldc2            #1237 <String "clickTracking">
	//  482 1171:aload           17
	//  483 1173:invokevirtual   #1455 <Method ArrayList APSVASTIconNode.clickTrackingURLs()>
	//  484 1176:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  485 1179:pop             
									if(apsvasticonnode.viewTrackingURLs() != null)
	//* 486 1180:aload           17
	//* 487 1182:invokevirtual   #1458 <Method ArrayList APSVASTIconNode.viewTrackingURLs()>
	//* 488 1185:ifnull          1205
										apsmediaoverlay.parameters.put("viewTracking", ((Object) (apsvasticonnode.viewTrackingURLs())));
	//  489 1188:aload           18
	//  490 1190:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  491 1193:ldc2            #1460 <String "viewTracking">
	//  492 1196:aload           17
	//  493 1198:invokevirtual   #1458 <Method ArrayList APSVASTIconNode.viewTrackingURLs()>
	//  494 1201:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  495 1204:pop             
									float f = (float)Integer.parseInt((String)apsvasticonnode.attributes.get("width")) / (float)Integer.parseInt((String)apsvasticonnode.attributes.get("height"));
	//  496 1205:aload           17
	//  497 1207:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//  498 1210:ldc2            #909 <String "width">
	//  499 1213:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  500 1216:checkcast       #155 <Class String>
	//  501 1219:invokestatic    #906 <Method int Integer.parseInt(String)>
	//  502 1222:i2f             
	//  503 1223:aload           17
	//  504 1225:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//  505 1228:ldc2            #873 <String "height">
	//  506 1231:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  507 1234:checkcast       #155 <Class String>
	//  508 1237:invokestatic    #906 <Method int Integer.parseInt(String)>
	//  509 1240:i2f             
	//  510 1241:fdiv            
	//  511 1242:fstore_3        
									obj2 = ((Object) (new StringBuilder()));
	//  512 1243:new             #768 <Class StringBuilder>
	//  513 1246:dup             
	//  514 1247:invokespecial   #769 <Method void StringBuilder()>
	//  515 1250:astore          11
									((StringBuilder) (obj2)).append(String.format(Locale.ENGLISH, "%.2f", new Object[] {
										Float.valueOf(f)
									}));
	//  516 1252:aload           11
	//  517 1254:getstatic       #1464 <Field Locale Locale.ENGLISH>
	//  518 1257:ldc2            #1466 <String "%.2f">
	//  519 1260:iconst_1        
	//  520 1261:anewarray       Object[]
	//  521 1264:dup             
	//  522 1265:iconst_0        
	//  523 1266:fload_3         
	//  524 1267:invokestatic    #1312 <Method Float Float.valueOf(float)>
	//  525 1270:aastore         
	//  526 1271:invokestatic    #1470 <Method String String.format(Locale, String, Object[])>
	//  527 1274:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  528 1277:pop             
									((StringBuilder) (obj2)).append("h");
	//  529 1278:aload           11
	//  530 1280:ldc2            #1472 <String "h">
	//  531 1283:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  532 1286:pop             
									apsmediaoverlay.width = ((StringBuilder) (obj2)).toString();
	//  533 1287:aload           18
	//  534 1289:aload           11
	//  535 1291:invokevirtual   #778 <Method String StringBuilder.toString()>
	//  536 1294:putfield        #1179 <Field String APSMediaOverlay.width>
									obj2 = ((Object) (new StringBuilder()));
	//  537 1297:new             #768 <Class StringBuilder>
	//  538 1300:dup             
	//  539 1301:invokespecial   #769 <Method void StringBuilder()>
	//  540 1304:astore          11
									((StringBuilder) (obj2)).append(String.format(Locale.ENGLISH, "%.2f", new Object[] {
										Float.valueOf(defaultIconHeightPercentage)
									}));
	//  541 1306:aload           11
	//  542 1308:getstatic       #1464 <Field Locale Locale.ENGLISH>
	//  543 1311:ldc2            #1466 <String "%.2f">
	//  544 1314:iconst_1        
	//  545 1315:anewarray       Object[]
	//  546 1318:dup             
	//  547 1319:iconst_0        
	//  548 1320:aload_0         
	//  549 1321:getfield        #196 <Field float defaultIconHeightPercentage>
	//  550 1324:invokestatic    #1312 <Method Float Float.valueOf(float)>
	//  551 1327:aastore         
	//  552 1328:invokestatic    #1470 <Method String String.format(Locale, String, Object[])>
	//  553 1331:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  554 1334:pop             
									((StringBuilder) (obj2)).append("%");
	//  555 1335:aload           11
	//  556 1337:ldc2            #1358 <String "%">
	//  557 1340:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  558 1343:pop             
									apsmediaoverlay.height = ((StringBuilder) (obj2)).toString();
	//  559 1344:aload           18
	//  560 1346:aload           11
	//  561 1348:invokevirtual   #778 <Method String StringBuilder.toString()>
	//  562 1351:putfield        #1181 <Field String APSMediaOverlay.height>
									apsmediaoverlay.metadata.put("skip_tracking", "true");
	//  563 1354:aload           18
	//  564 1356:getfield        #1058 <Field HashMap APSMediaOverlay.metadata>
	//  565 1359:ldc2            #1434 <String "skip_tracking">
	//  566 1362:ldc2            #1380 <String "true">
	//  567 1365:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  568 1368:pop             
									int l = apsvasticonnode.durationFromAttributeNamed("offset");
	//  569 1369:aload           17
	//  570 1371:ldc2            #459 <String "offset">
	//  571 1374:invokevirtual   #1473 <Method int APSVASTIconNode.durationFromAttributeNamed(String)>
	//  572 1377:istore          6
									j = l;
	//  573 1379:iload           6
	//  574 1381:istore          5
									if(l == -1)
	//* 575 1383:iload           6
	//* 576 1385:iconst_m1       
	//* 577 1386:icmpne          1392
										j = 0;
	//  578 1389:iconst_0        
	//  579 1390:istore          5
									apsmediaoverlay.setStartPoint(String.valueOf(j));
	//  580 1392:aload           18
	//  581 1394:iload           5
	//  582 1396:invokestatic    #544 <Method String String.valueOf(int)>
	//  583 1399:invokevirtual   #1049 <Method void APSMediaOverlay.setStartPoint(String)>
									l = apsvasticonnode.durationFromAttributeNamed("duration");
	//  584 1402:aload           17
	//  585 1404:ldc2            #1475 <String "duration">
	//  586 1407:invokevirtual   #1473 <Method int APSVASTIconNode.durationFromAttributeNamed(String)>
	//  587 1410:istore          6
									if(l == -1)
	//* 588 1412:iload           6
	//* 589 1414:iconst_m1       
	//* 590 1415:icmpne          1426
										obj2 = "100%";
	//  591 1418:ldc2            #1426 <String "100%">
	//  592 1421:astore          11
									else
	//* 593 1423:goto            1436
										obj2 = ((Object) (String.valueOf(j + l)));
	//  594 1426:iload           5
	//  595 1428:iload           6
	//  596 1430:iadd            
	//  597 1431:invokestatic    #544 <Method String String.valueOf(int)>
	//  598 1434:astore          11
									apsmediaoverlay.setEndPoint(((String) (obj2)));
	//  599 1436:aload           18
	//  600 1438:aload           11
	//  601 1440:invokevirtual   #1328 <Method void APSMediaOverlay.setEndPoint(String)>
									if(apsvasticonnode.attributes.get("xPosition") != null)
	//* 602 1443:aload           17
	//* 603 1445:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//* 604 1448:ldc2            #1193 <String "xPosition">
	//* 605 1451:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 606 1454:ifnull          1606
									{
										if(((String)apsvasticonnode.attributes.get("xPosition")).equals("left"))
	//* 607 1457:aload           17
	//* 608 1459:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//* 609 1462:ldc2            #1193 <String "xPosition">
	//* 610 1465:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 611 1468:checkcast       #155 <Class String>
	//* 612 1471:ldc2            #921 <String "left">
	//* 613 1474:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 614 1477:ifeq            1486
										{
											j = 1;
	//  615 1480:iconst_1        
	//  616 1481:istore          5
											break label7;
	//  617 1483:goto            1609
										}
										if(((String)apsvasticonnode.attributes.get("xPosition")).equals("right"))
	//* 618 1486:aload           17
	//* 619 1488:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//* 620 1491:ldc2            #1193 <String "xPosition">
	//* 621 1494:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 622 1497:checkcast       #155 <Class String>
	//* 623 1500:ldc2            #926 <String "right">
	//* 624 1503:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 625 1506:ifeq            1515
										{
											j = 0;
	//  626 1509:iconst_0        
	//  627 1510:istore          5
											break label7;
	//  628 1512:goto            1609
										}
										obj2 = ((Object) (new StringBuilder()));
	//  629 1515:new             #768 <Class StringBuilder>
	//  630 1518:dup             
	//  631 1519:invokespecial   #769 <Method void StringBuilder()>
	//  632 1522:astore          11
										((StringBuilder) (obj2)).append(String.format(Locale.ENGLISH, "%.2f", new Object[] {
											Float.valueOf(Float.parseFloat((String)apsvasticonnode.attributes.get("xPosition")) / Float.parseFloat((String)apsvasticonnode.attributes.get("height")))
										}));
	//  633 1524:aload           11
	//  634 1526:getstatic       #1464 <Field Locale Locale.ENGLISH>
	//  635 1529:ldc2            #1466 <String "%.2f">
	//  636 1532:iconst_1        
	//  637 1533:anewarray       Object[]
	//  638 1536:dup             
	//  639 1537:iconst_0        
	//  640 1538:aload           17
	//  641 1540:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//  642 1543:ldc2            #1193 <String "xPosition">
	//  643 1546:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  644 1549:checkcast       #155 <Class String>
	//  645 1552:invokestatic    #1479 <Method float Float.parseFloat(String)>
	//  646 1555:aload           17
	//  647 1557:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//  648 1560:ldc2            #873 <String "height">
	//  649 1563:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  650 1566:checkcast       #155 <Class String>
	//  651 1569:invokestatic    #1479 <Method float Float.parseFloat(String)>
	//  652 1572:fdiv            
	//  653 1573:invokestatic    #1312 <Method Float Float.valueOf(float)>
	//  654 1576:aastore         
	//  655 1577:invokestatic    #1470 <Method String String.format(Locale, String, Object[])>
	//  656 1580:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  657 1583:pop             
										((StringBuilder) (obj2)).append("h");
	//  658 1584:aload           11
	//  659 1586:ldc2            #1472 <String "h">
	//  660 1589:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  661 1592:pop             
										apsmediaoverlay.absoluteOffsetX = ((StringBuilder) (obj2)).toString();
	//  662 1593:aload           18
	//  663 1595:aload           11
	//  664 1597:invokevirtual   #778 <Method String StringBuilder.toString()>
	//  665 1600:putfield        #1196 <Field String APSMediaOverlay.absoluteOffsetX>
									}
	//* 666 1603:goto            1606
									j = 1;
	//  667 1606:iconst_1        
	//  668 1607:istore          5
								}
								boolean flag1;
label8:
								{
									if(apsvasticonnode.attributes.get("yPosition") != null)
	//* 669 1609:aload           17
	//* 670 1611:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//* 671 1614:ldc2            #1198 <String "yPosition">
	//* 672 1617:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 673 1620:ifnull          1777
									{
										if(((String)apsvasticonnode.attributes.get("yPosition")).equals("top"))
	//* 674 1623:aload           17
	//* 675 1625:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//* 676 1628:ldc2            #1198 <String "yPosition">
	//* 677 1631:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 678 1634:checkcast       #155 <Class String>
	//* 679 1637:ldc2            #830 <String "top">
	//* 680 1640:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 681 1643:ifeq            1652
										{
											flag1 = true;
	//  682 1646:iconst_1        
	//  683 1647:istore          6
											break label8;
	//  684 1649:goto            1780
										}
										if(((String)apsvasticonnode.attributes.get("yPosition")).equals("bottom"))
	//* 685 1652:aload           17
	//* 686 1654:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//* 687 1657:ldc2            #1198 <String "yPosition">
	//* 688 1660:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 689 1663:checkcast       #155 <Class String>
	//* 690 1666:ldc2            #832 <String "bottom">
	//* 691 1669:invokevirtual   #493 <Method boolean String.equals(Object)>
	//* 692 1672:ifeq            1681
										{
											flag1 = false;
	//  693 1675:iconst_0        
	//  694 1676:istore          6
											break label8;
	//  695 1678:goto            1780
										}
										obj2 = ((Object) (new StringBuilder()));
	//  696 1681:new             #768 <Class StringBuilder>
	//  697 1684:dup             
	//  698 1685:invokespecial   #769 <Method void StringBuilder()>
	//  699 1688:astore          11
										((StringBuilder) (obj2)).append(String.format(Locale.ENGLISH, "%.2f", new Object[] {
											Float.valueOf((Float.parseFloat((String)apsvasticonnode.attributes.get("yPosition")) * defaultIconHeightPercentage) / Float.parseFloat((String)apsvasticonnode.attributes.get("height")))
										}));
	//  700 1690:aload           11
	//  701 1692:getstatic       #1464 <Field Locale Locale.ENGLISH>
	//  702 1695:ldc2            #1466 <String "%.2f">
	//  703 1698:iconst_1        
	//  704 1699:anewarray       Object[]
	//  705 1702:dup             
	//  706 1703:iconst_0        
	//  707 1704:aload           17
	//  708 1706:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//  709 1709:ldc2            #1198 <String "yPosition">
	//  710 1712:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  711 1715:checkcast       #155 <Class String>
	//  712 1718:invokestatic    #1479 <Method float Float.parseFloat(String)>
	//  713 1721:aload_0         
	//  714 1722:getfield        #196 <Field float defaultIconHeightPercentage>
	//  715 1725:fmul            
	//  716 1726:aload           17
	//  717 1728:getfield        #1461 <Field HashMap APSVASTIconNode.attributes>
	//  718 1731:ldc2            #873 <String "height">
	//  719 1734:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  720 1737:checkcast       #155 <Class String>
	//  721 1740:invokestatic    #1479 <Method float Float.parseFloat(String)>
	//  722 1743:fdiv            
	//  723 1744:invokestatic    #1312 <Method Float Float.valueOf(float)>
	//  724 1747:aastore         
	//  725 1748:invokestatic    #1470 <Method String String.format(Locale, String, Object[])>
	//  726 1751:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  727 1754:pop             
										((StringBuilder) (obj2)).append("%");
	//  728 1755:aload           11
	//  729 1757:ldc2            #1358 <String "%">
	//  730 1760:invokevirtual   #775 <Method StringBuilder StringBuilder.append(String)>
	//  731 1763:pop             
										apsmediaoverlay.absoluteOffsetY = ((StringBuilder) (obj2)).toString();
	//  732 1764:aload           18
	//  733 1766:aload           11
	//  734 1768:invokevirtual   #778 <Method String StringBuilder.toString()>
	//  735 1771:putfield        #1201 <Field String APSMediaOverlay.absoluteOffsetY>
									}
	//* 736 1774:goto            1777
									flag1 = true;
	//  737 1777:iconst_1        
	//  738 1778:istore          6
								}
								apsmediaoverlay.zIndex = 2;
	//  739 1780:aload           18
	//  740 1782:iconst_2        
	//  741 1783:putfield        #1429 <Field int APSMediaOverlay.zIndex>
								if(j != 0)
	//* 742 1786:iload           5
	//* 743 1788:ifeq            1818
								{
									if(flag1)
	//* 744 1791:iload           6
	//* 745 1793:ifeq            1807
										apsmediaoverlay.position = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft;
	//  746 1796:aload           18
	//  747 1798:getstatic       #1482 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft>
	//  748 1801:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
									else
	//* 749 1804:goto            1842
										apsmediaoverlay.position = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft;
	//  750 1807:aload           18
	//  751 1809:getstatic       #203 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft>
	//  752 1812:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
								} else
	//* 753 1815:goto            1842
								if(flag1)
	//* 754 1818:iload           6
	//* 755 1820:ifeq            1834
									apsmediaoverlay.position = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight;
	//  756 1823:aload           18
	//  757 1825:getstatic       #1485 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight>
	//  758 1828:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
								else
	//* 759 1831:goto            1842
									apsmediaoverlay.position = APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight;
	//  760 1834:aload           18
	//  761 1836:getstatic       #213 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight>
	//  762 1839:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
								apsmediaoverlay.fadeInDuration = iconFadeInDuration;
	//  763 1842:aload           18
	//  764 1844:aload_0         
	//  765 1845:getfield        #208 <Field float iconFadeInDuration>
	//  766 1848:putfield        #1331 <Field float APSMediaOverlay.fadeInDuration>
								apsmediaunit1.addOverlay(apsmediaoverlay);
	//  767 1851:aload           12
	//  768 1853:aload           18
	//  769 1855:invokevirtual   #1441 <Method void APSMediaUnit.addOverlay(APSMediaOverlay)>
							} while(true);
	//  770 1858:goto            1861
	//* 771 1861:goto            1016
label9:
							{
								j = i;
	//  772 1864:iload           4
	//  773 1866:istore          5
								obj2 = obj;
	//  774 1868:aload           8
	//  775 1870:astore          11
								i1 = 0;
	//  776 1872:iconst_0        
	//  777 1873:istore          6
								obj = ((Object) (new HashMap()));
	//  778 1875:new             #332 <Class HashMap>
	//  779 1878:dup             
	//  780 1879:invokespecial   #585 <Method void HashMap()>
	//  781 1882:astore          8
								Object obj4 = ((Object) (apsvastlinearnode.trackingURLsByType()));
	//  782 1884:aload           15
	//  783 1886:invokevirtual   #1486 <Method HashMap APSVASTLinearNode.trackingURLsByType()>
	//  784 1889:astore          16
								if(obj4 != null)
	//* 785 1891:aload           16
	//* 786 1893:ifnull          1903
									((HashMap) (obj)).putAll(((Map) (obj4)));
	//  787 1896:aload           8
	//  788 1898:aload           16
	//  789 1900:invokevirtual   #1078 <Method void HashMap.putAll(Map)>
								obj4 = ((Object) (apsvastinlinenode.impressionURLs()));
	//  790 1903:aload           14
	//  791 1905:invokevirtual   #1207 <Method ArrayList APSVASTInLineNode.impressionURLs()>
	//  792 1908:astore          16
								if(obj4 != null)
	//* 793 1910:aload           16
	//* 794 1912:ifnull          1926
									((HashMap) (obj)).put("impression", obj4);
	//  795 1915:aload           8
	//  796 1917:ldc2            #1209 <String "impression">
	//  797 1920:aload           16
	//  798 1922:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  799 1925:pop             
								obj4 = ((Object) (apsvastinlinenode.errorURLsWithCode(400)));
	//  800 1926:aload           14
	//  801 1928:sipush          400
	//  802 1931:invokevirtual   #1219 <Method ArrayList APSVASTInLineNode.errorURLsWithCode(int)>
	//  803 1934:astore          16
								if(obj4 != null)
	//* 804 1936:aload           16
	//* 805 1938:ifnull          1952
									((HashMap) (obj)).put("error", obj4);
	//  806 1941:aload           8
	//  807 1943:ldc2            #529 <String "error">
	//  808 1946:aload           16
	//  809 1948:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  810 1951:pop             
								apsmediaunit1.trackingURLs = ((HashMap) (obj));
	//  811 1952:aload           12
	//  812 1954:aload           8
	//  813 1956:putfield        #1384 <Field HashMap APSMediaUnit.trackingURLs>
								i = defaultSkipOffset;
	//  814 1959:aload_0         
	//  815 1960:getfield        #217 <Field int defaultSkipOffset>
	//  816 1963:istore          4
								if(apsvastlinearnode.attributes.get("skipoffset") == null)
									break label9;
	//  817 1965:aload           15
	//  818 1967:getfield        #1487 <Field HashMap APSVASTLinearNode.attributes>
	//  819 1970:ldc2            #1489 <String "skipoffset">
	//  820 1973:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  821 1976:ifnull          2106
								int j1 = apsvastlinearnode.durationFromAttributeNamed("skipoffset");
	//  822 1979:aload           15
	//  823 1981:ldc2            #1489 <String "skipoffset">
	//  824 1984:invokevirtual   #1490 <Method int APSVASTLinearNode.durationFromAttributeNamed(String)>
	//  825 1987:istore          7
								if(j1 == -1 && ((String)apsvastlinearnode.attributes.get("skipoffset")).contains("%"))
	//* 826 1989:iload           7
	//* 827 1991:iconst_m1       
	//* 828 1992:icmpne          2099
	//* 829 1995:aload           15
	//* 830 1997:getfield        #1487 <Field HashMap APSVASTLinearNode.attributes>
	//* 831 2000:ldc2            #1489 <String "skipoffset">
	//* 832 2003:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//* 833 2006:checkcast       #155 <Class String>
	//* 834 2009:ldc2            #1358 <String "%">
	//* 835 2012:invokevirtual   #1361 <Method boolean String.contains(CharSequence)>
	//* 836 2015:ifeq            2099
								{
									if(apsvastlinearnode.firstChildNamed("Duration") != null)
	//* 837 2018:aload           15
	//* 838 2020:ldc2            #1492 <String "Duration">
	//* 839 2023:invokevirtual   #1493 <Method APSVASTXMLNode APSVASTLinearNode.firstChildNamed(String)>
	//* 840 2026:ifnull          2045
										i = apsvastlinearnode.firstChildNamed("Duration").duration();
	//  841 2029:aload           15
	//  842 2031:ldc2            #1492 <String "Duration">
	//  843 2034:invokevirtual   #1493 <Method APSVASTXMLNode APSVASTLinearNode.firstChildNamed(String)>
	//  844 2037:invokevirtual   #1495 <Method int APSVASTXMLNode.duration()>
	//  845 2040:istore          4
									else
	//* 846 2042:goto            2048
										i = -1;
	//  847 2045:iconst_m1       
	//  848 2046:istore          4
									if(i != -1)
	//* 849 2048:iload           4
	//* 850 2050:iconst_m1       
	//* 851 2051:icmpeq          2099
									{
										i = (int)Math.floor((float)i * ((float)Integer.parseInt(((String)apsvastlinearnode.attributes.get("skipoffset")).replace("%", "")) / 100F));
	//  852 2054:iload           4
	//  853 2056:i2f             
	//  854 2057:aload           15
	//  855 2059:getfield        #1487 <Field HashMap APSVASTLinearNode.attributes>
	//  856 2062:ldc2            #1489 <String "skipoffset">
	//  857 2065:invokevirtual   #527 <Method Object HashMap.get(Object)>
	//  858 2068:checkcast       #155 <Class String>
	//  859 2071:ldc2            #1358 <String "%">
	//  860 2074:ldc2            #649 <String "">
	//  861 2077:invokevirtual   #548 <Method String String.replace(CharSequence, CharSequence)>
	//  862 2080:invokestatic    #906 <Method int Integer.parseInt(String)>
	//  863 2083:i2f             
	//  864 2084:ldc2            #1496 <Float 100F>
	//  865 2087:fdiv            
	//  866 2088:fmul            
	//  867 2089:f2d             
	//  868 2090:invokestatic    #1177 <Method double Math.floor(double)>
	//  869 2093:d2i             
	//  870 2094:istore          4
										break label9;
	//  871 2096:goto            2106
									}
								}
								i = j1;
	//  872 2099:iload           7
	//  873 2101:istore          4
							}
	//* 874 2103:goto            2106
							if(i != -1)
	//* 875 2106:iload           4
	//* 876 2108:iconst_m1       
	//* 877 2109:icmpeq          2446
							{
								obj = ((Object) (new APSMediaOverlay()));
	//  878 2112:new             #1032 <Class APSMediaOverlay>
	//  879 2115:dup             
	//  880 2116:invokespecial   #1169 <Method void APSMediaOverlay()>
	//  881 2119:astore          8
								obj.type = "com.appscend.mp.overlays.skip";
	//  882 2121:aload           8
	//  883 2123:ldc2            #1498 <String "com.appscend.mp.overlays.skip">
	//  884 2126:putfield        #1101 <Field String APSMediaOverlay.type>
								obj.position = skipButtonPosition;
	//  885 2129:aload           8
	//  886 2131:aload_0         
	//  887 2132:getfield        #215 <Field APSMediaOverlay$APSMediaOverlayPosition skipButtonPosition>
	//  888 2135:putfield        #1034 <Field APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
								obj.width = skipButtonWidth;
	//  889 2138:aload           8
	//  890 2140:aload_0         
	//  891 2141:getfield        #230 <Field String skipButtonWidth>
	//  892 2144:putfield        #1179 <Field String APSMediaOverlay.width>
								obj.height = skipButtonHeight;
	//  893 2147:aload           8
	//  894 2149:aload_0         
	//  895 2150:getfield        #234 <Field String skipButtonHeight>
	//  896 2153:putfield        #1181 <Field String APSMediaOverlay.height>
								((APSMediaOverlay) (obj)).setStartPoint("0");
	//  897 2156:aload           8
	//  898 2158:ldc2            #1367 <String "0">
	//  899 2161:invokevirtual   #1049 <Method void APSMediaOverlay.setStartPoint(String)>
								((APSMediaOverlay) (obj)).setEndPoint("100%");
	//  900 2164:aload           8
	//  901 2166:ldc2            #1426 <String "100%">
	//  902 2169:invokevirtual   #1328 <Method void APSMediaOverlay.setEndPoint(String)>
								obj.parameters = new HashMap();
	//  903 2172:aload           8
	//  904 2174:new             #332 <Class HashMap>
	//  905 2177:dup             
	//  906 2178:invokespecial   #585 <Method void HashMap()>
	//  907 2181:putfield        #1215 <Field HashMap APSMediaOverlay.parameters>
								((APSMediaOverlay) (obj)).parameters.put("defaultOffset", ((Object) (Integer.valueOf(i))));
	//  908 2184:aload           8
	//  909 2186:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  910 2189:ldc2            #893 <String "defaultOffset">
	//  911 2192:iload           4
	//  912 2194:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  913 2197:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  914 2200:pop             
								((APSMediaOverlay) (obj)).parameters.put("position", ((Object) (skipButtonProgressPosition)));
	//  915 2201:aload           8
	//  916 2203:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  917 2206:ldc2            #826 <String "position">
	//  918 2209:aload_0         
	//  919 2210:getfield        #224 <Field com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition skipButtonProgressPosition>
	//  920 2213:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  921 2216:pop             
								((APSMediaOverlay) (obj)).parameters.put("radius", ((Object) (Integer.valueOf(skipButtonBorderRadius))));
	//  922 2217:aload           8
	//  923 2219:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  924 2222:ldc2            #917 <String "radius">
	//  925 2225:aload_0         
	//  926 2226:getfield        #184 <Field int skipButtonBorderRadius>
	//  927 2229:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  928 2232:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  929 2235:pop             
								((APSMediaOverlay) (obj)).parameters.put("padding", ((Object) (Integer.valueOf(skipButtonPadding))));
	//  930 2236:aload           8
	//  931 2238:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  932 2241:ldc2            #902 <String "padding">
	//  933 2244:aload_0         
	//  934 2245:getfield        #226 <Field int skipButtonPadding>
	//  935 2248:invokestatic    #1065 <Method Integer Integer.valueOf(int)>
	//  936 2251:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  937 2254:pop             
								if(skipButtonText != null)
	//* 938 2255:aload_0         
	//* 939 2256:getfield        #364 <Field String skipButtonText>
	//* 940 2259:ifnull          2278
									((APSMediaOverlay) (obj)).parameters.put("text", ((Object) (skipButtonText)));
	//  941 2262:aload           8
	//  942 2264:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  943 2267:ldc2            #898 <String "text">
	//  944 2270:aload_0         
	//  945 2271:getfield        #364 <Field String skipButtonText>
	//  946 2274:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  947 2277:pop             
								if(skipButtonTextColor != null)
	//* 948 2278:aload_0         
	//* 949 2279:getfield        #366 <Field String skipButtonTextColor>
	//* 950 2282:ifnull          2301
									((APSMediaOverlay) (obj)).parameters.put("textColor", ((Object) (skipButtonTextColor)));
	//  951 2285:aload           8
	//  952 2287:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  953 2290:ldc2            #900 <String "textColor">
	//  954 2293:aload_0         
	//  955 2294:getfield        #366 <Field String skipButtonTextColor>
	//  956 2297:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  957 2300:pop             
								if(skipButtonProgressCircleColor != null)
	//* 958 2301:aload_0         
	//* 959 2302:getfield        #372 <Field String skipButtonProgressCircleColor>
	//* 960 2305:ifnull          2324
									((APSMediaOverlay) (obj)).parameters.put("circleColor", ((Object) (skipButtonProgressCircleColor)));
	//  961 2308:aload           8
	//  962 2310:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  963 2313:ldc2            #931 <String "circleColor">
	//  964 2316:aload_0         
	//  965 2317:getfield        #372 <Field String skipButtonProgressCircleColor>
	//  966 2320:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  967 2323:pop             
								if(skipButtonProgressCircleTextColor != null)
	//* 968 2324:aload_0         
	//* 969 2325:getfield        #374 <Field String skipButtonProgressCircleTextColor>
	//* 970 2328:ifnull          2347
									((APSMediaOverlay) (obj)).parameters.put("textColor", ((Object) (skipButtonProgressCircleTextColor)));
	//  971 2331:aload           8
	//  972 2333:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  973 2336:ldc2            #900 <String "textColor">
	//  974 2339:aload_0         
	//  975 2340:getfield        #374 <Field String skipButtonProgressCircleTextColor>
	//  976 2343:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  977 2346:pop             
								if(skipButtonProgressCircleTrackColor != null)
	//* 978 2347:aload_0         
	//* 979 2348:getfield        #376 <Field String skipButtonProgressCircleTrackColor>
	//* 980 2351:ifnull          2370
									((APSMediaOverlay) (obj)).parameters.put("trackColor", ((Object) (skipButtonProgressCircleTrackColor)));
	//  981 2354:aload           8
	//  982 2356:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  983 2359:ldc2            #933 <String "trackColor">
	//  984 2362:aload_0         
	//  985 2363:getfield        #376 <Field String skipButtonProgressCircleTrackColor>
	//  986 2366:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  987 2369:pop             
								if(skipButtonBorderColor != null)
	//* 988 2370:aload_0         
	//* 989 2371:getfield        #368 <Field String skipButtonBorderColor>
	//* 990 2374:ifnull          2393
									((APSMediaOverlay) (obj)).parameters.put("borderColor", ((Object) (skipButtonBorderColor)));
	//  991 2377:aload           8
	//  992 2379:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	//  993 2382:ldc2            #1500 <String "borderColor">
	//  994 2385:aload_0         
	//  995 2386:getfield        #368 <Field String skipButtonBorderColor>
	//  996 2389:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	//  997 2392:pop             
								if(skipButtonBackgroundColor != null)
	//* 998 2393:aload_0         
	//* 999 2394:getfield        #370 <Field String skipButtonBackgroundColor>
	//*1000 2397:ifnull          2416
									((APSMediaOverlay) (obj)).parameters.put("color", ((Object) (skipButtonBackgroundColor)));
	// 1001 2400:aload           8
	// 1002 2402:getfield        #1215 <Field HashMap APSMediaOverlay.parameters>
	// 1003 2405:ldc2            #915 <String "color">
	// 1004 2408:aload_0         
	// 1005 2409:getfield        #370 <Field String skipButtonBackgroundColor>
	// 1006 2412:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	// 1007 2415:pop             
								((APSMediaOverlay) (obj)).metadata.put("skip_tracking", "true");
	// 1008 2416:aload           8
	// 1009 2418:getfield        #1058 <Field HashMap APSMediaOverlay.metadata>
	// 1010 2421:ldc2            #1434 <String "skip_tracking">
	// 1011 2424:ldc2            #1380 <String "true">
	// 1012 2427:invokevirtual   #628 <Method Object HashMap.put(Object, Object)>
	// 1013 2430:pop             
								obj.zIndex = 9000;
	// 1014 2431:aload           8
	// 1015 2433:sipush          9000
	// 1016 2436:putfield        #1429 <Field int APSMediaOverlay.zIndex>
								apsmediaunit1.addOverlay(((APSMediaOverlay) (obj)));
	// 1017 2439:aload           12
	// 1018 2441:aload           8
	// 1019 2443:invokevirtual   #1441 <Method void APSMediaUnit.addOverlay(APSMediaOverlay)>
							}
							apsmediaunit1.debug = debugMode;
	// 1020 2446:aload           12
	// 1021 2448:aload_0         
	// 1022 2449:getfield        #412 <Field boolean debugMode>
	// 1023 2452:putfield        #1387 <Field boolean APSMediaUnit.debug>
							arraylist4.add(((Object) (apsmediaunit1)));
	// 1024 2455:aload           13
	// 1025 2457:aload           12
	// 1026 2459:invokevirtual   #467 <Method boolean ArrayList.add(Object)>
	// 1027 2462:pop             
							i = j;
	// 1028 2463:iload           5
	// 1029 2465:istore          4
							obj = obj1;
	// 1030 2467:aload           10
	// 1031 2469:astore          8
							obj1 = obj2;
	// 1032 2471:aload           11
	// 1033 2473:astore          10
							break label1;
	// 1034 2475:goto            2534
						}
						obj2 = obj;
	// 1035 2478:aload           8
	// 1036 2480:astore          11
						APSMediaPlayer.getInstance().trackforEvent(apsvastinlinenode.errorURLsWithCode(403), "Couldn't pick media file", com.appscend.media.APSMediaTrackingEvents.MediaEventType.ERROR, ((APSMediaEvent) (this)));
	// 1037 2482:invokestatic    #535 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	// 1038 2485:aload           14
	// 1039 2487:sipush          403
	// 1040 2490:invokevirtual   #1219 <Method ArrayList APSVASTInLineNode.errorURLsWithCode(int)>
	// 1041 2493:ldc2            #1502 <String "Couldn't pick media file">
	// 1042 2496:getstatic       #560 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.ERROR>
	// 1043 2499:aload_0         
	// 1044 2500:invokevirtual   #564 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
						i1 = j;
	// 1045 2503:iload           5
	// 1046 2505:istore          6
						obj = obj1;
	// 1047 2507:aload           10
	// 1048 2509:astore          8
						obj1 = obj2;
	// 1049 2511:aload           11
	// 1050 2513:astore          10
						break label1;
	// 1051 2515:goto            2534
					}
					obj2 = obj1;
	// 1052 2518:aload           10
	// 1053 2520:astore          11
					obj1 = obj;
	// 1054 2522:aload           8
	// 1055 2524:astore          10
					obj = obj2;
	// 1056 2526:aload           11
	// 1057 2528:astore          8
					i1 = j;
	// 1058 2530:iload           5
	// 1059 2532:istore          6
				}
				obj2 = obj1;
	// 1060 2534:aload           10
	// 1061 2536:astore          11
				obj1 = obj;
	// 1062 2538:aload           8
	// 1063 2540:astore          10
				obj = obj2;
	// 1064 2542:aload           11
	// 1065 2544:astore          8
				j = i1;
	// 1066 2546:iload           6
	// 1067 2548:istore          5
			} while(true);
	// 1068 2550:goto            257
		}

	// 1069 2553:aload           11
	// 1070 2555:astore_1        
	//*1071 2556:goto            14
		return arraylist4;
	// 1072 2559:aload           13
	// 1073 2561:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #1507 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1509 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1512 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public static final String APSVastMidrollUnit = "midrolls.";
	public static final String APSVastPostrollUnit = "postrolls.";
	public static final String APSVastPrerollUnit = "prerolls.";
	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public APSVastAdBreak createFromParcel(Parcel parcel)
		{
			return new APSVastAdBreak(parcel);
		//    0    0:new             #9   <Class APSVastAdBreak>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void APSVastAdBreak(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method APSVastAdBreak createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public APSVastAdBreak[] newArray(int i)
		{
			return new APSVastAdBreak[i];
		//    0    0:iload_1         
		//    1    1:anewarray       APSVastAdBreak[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method APSVastAdBreak[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static final String MIDCONTENT = "midContent";
	private static final String NONLINEARS = "nonLinears";
	private static final String POSTCONTENT = "postContent";
	private static final String PRECONTENT = "preContent";
	public static final String kAPSMetadataCurrentAdBreakIndex = "aps_vast_adbreak_index";
	public static final String kAPSMetadataCurrentAdBreakOffset = "aps_vast_adbreak_offset";
	public static final String kAPSMetadataTotalAdBreakAds = "aps_vast_adbreak_total";
	public String adOffset;
	public com.appscend.vast.APSVASTRootNode.APSAdPodFallback adPodFallbackStrategy;
	private ArrayList ads;
	public com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction afterBannerTapped;
	public com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction afterVideoAdTapped;
	public boolean allowMultipleAds;
	public String bannerCloseButtonBackgroundColor;
	public float bannerCloseButtonFinalAlpha;
	public Bitmap bannerCloseButtonImage;
	public float bannerCloseButtonInitialAlpha;
	public int bannerCloseButtonOffsetX;
	public int bannerCloseButtonOffsetY;
	public String bannerCloseButtonProgressColor;
	public int bannerCloseButtonSize;
	public String bannerCloseButtonTrackColor;
	public String bannerCloseButtonXColor;
	public float bannerFadeInDuration;
	public int bannerMaxSizeHeight;
	public int bannerMaxSizeWidth;
	public APSMediaOverlay.APSMediaOverlayPosition bannerPosition;
	public int bannerSkipOffset;
	private ArrayList buffet;
	public APSMediaUnit.APSMediaControlsDisplay controlsDisplayForAds;
	public HashMap controlsParametersForAds;
	public String countdownColor;
	public String countdownFont;
	public String countdownHeight;
	public APSMediaOverlay.APSMediaOverlayPosition countdownPosition;
	public String countdownSize;
	public String countdownText;
	public String countdownWidth;
	public boolean debugMode;
	public ArrayList defaultAdBreakPositions;
	public int defaultBannerAdBreakDuration;
	public float defaultIconHeightPercentage;
	public int defaultSkipOffset;
	public boolean followWrappers;
	private ArrayList generatedUnits;
	public float iconFadeInDuration;
	public boolean isDynamicAdBreak;
	public HashMap metadata;
	public com.appscend.media.APSMediaBuilder.APSResolvMultipleAdsConflictsBy multipleAdsConflictsPolicy;
	public APSMediaOverlay.APSMediaOverlayPosition nextMediaCountdownPosition;
	public ArrayList prefferedVideoMimeTypes;
	public boolean showBannerCloseButton;
	public boolean showCountdown;
	public String skipButtonBackgroundColor;
	public String skipButtonBorderColor;
	public int skipButtonBorderRadius;
	public String skipButtonHeight;
	public int skipButtonPadding;
	public APSMediaOverlay.APSMediaOverlayPosition skipButtonPosition;
	public String skipButtonProgressCircleColor;
	public String skipButtonProgressCircleTextColor;
	public String skipButtonProgressCircleTrackColor;
	public com.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController.APSSkipOverlayProgressPosition skipButtonProgressPosition;
	public String skipButtonText;
	public String skipButtonTextColor;
	public String skipButtonWidth;
	protected ArrayList sources;
	public boolean stretchBannersToMaxSize;
	public APSVASTConfigurationOptions type;
	public String userAgent;

	static 
	{
	//    0    0:new             #6   <Class APSVastAdBreak$1>
	//    1    3:dup             
	//    2    4:invokespecial   #131 <Method void APSVastAdBreak$1()>
	//    3    7:putstatic       #133 <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
