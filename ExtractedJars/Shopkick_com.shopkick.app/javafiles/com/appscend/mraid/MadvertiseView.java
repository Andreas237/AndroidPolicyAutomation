// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.*;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.animation.*;
import android.widget.FrameLayout;
import java.io.*;
import java.net.URI;
import java.util.*;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseUtil, MadvertiseAd, MadvertiseImageView, MadvertiseMraidView, 
//			MadvertiseTextView

public class MadvertiseView extends FrameLayout
{
	public static interface AnimationEndListener
	{

		public abstract void onAnimationEnd();
	}

	public static interface MadvertiseViewCallbackListener
	{

		public abstract void onAdClicked();

		public abstract void onApplicationPause();

		public abstract void onApplicationResume();

		public abstract void onError(Exception exception);

		public abstract void onIllegalHttpStatusCode(int i, String s);

		public abstract void onLoaded(boolean flag, MadvertiseView madvertiseview);
	}


	public MadvertiseView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #92  <Method void MadvertiseView(Context, AttributeSet)>
	//    4    6:return          
	}

	public MadvertiseView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #93  <Method void FrameLayout(Context, AttributeSet)>
		GRADIENT_TOP_ALPHA = 127;
	//    4    6:aload_0         
	//    5    7:bipush          127
	//    6    9:putfield        #95  <Field int GRADIENT_TOP_ALPHA>
		GRADIENT_STOP = 0.73750000000000004D;
	//    7   12:aload_0         
	//    8   13:ldc2w           #96  <Double 0.73750000000000004D>
	//    9   16:putfield        #99  <Field double GRADIENT_STOP>
		mTextColor = -1;
	//   10   19:aload_0         
	//   11   20:iconst_m1       
	//   12   21:putfield        #101 <Field int mTextColor>
		mBackgroundColor = 0;
	//   13   24:aload_0         
	//   14   25:iconst_0        
	//   15   26:putfield        #103 <Field int mBackgroundColor>
		mSecondsToRefreshAd = 45;
	//   16   29:aload_0         
	//   17   30:bipush          45
	//   18   32:putfield        #105 <Field int mSecondsToRefreshAd>
		mTestMode = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #107 <Field boolean mTestMode>
		mBannerType = "mma";
	//   22   40:aload_0         
	//   23   41:ldc1            #109 <String "mma">
	//   24   43:putfield        #111 <Field String mBannerType>
		mAnimationType = "fade";
	//   25   46:aload_0         
	//   26   47:ldc1            #113 <String "fade">
	//   27   49:putfield        #115 <Field String mAnimationType>
		mDeliverOnlyText = false;
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:putfield        #117 <Field boolean mDeliverOnlyText>
		mTextSize = 18;
	//   31   57:aload_0         
	//   32   58:bipush          18
	//   33   60:putfield        #119 <Field int mTextSize>
		mBannerHeight = 53;
	//   34   63:aload_0         
	//   35   64:bipush          53
	//   36   66:putfield        #121 <Field int mBannerHeight>
		mBannerWidth = 320;
	//   37   69:aload_0         
	//   38   70:sipush          320
	//   39   73:putfield        #123 <Field int mBannerWidth>
		mBannerHeightDp = 53;
	//   40   76:aload_0         
	//   41   77:bipush          53
	//   42   79:putfield        #125 <Field int mBannerHeightDp>
		mBannerWidthDp = 320;
	//   43   82:aload_0         
	//   44   83:sipush          320
	//   45   86:putfield        #127 <Field int mBannerWidthDp>
		mParentWidth = 0;
	//   46   89:aload_0         
	//   47   90:iconst_0        
	//   48   91:putfield        #129 <Field int mParentWidth>
		mParentHeight = 0;
	//   49   94:aload_0         
	//   50   95:iconst_0        
	//   51   96:putfield        #131 <Field int mParentHeight>
		mCallbackListener = null;
	//   52   99:aload_0         
	//   53  100:aconst_null     
	//   54  101:putfield        #133 <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
		mAdTimer = null;
	//   55  104:aload_0         
	//   56  105:aconst_null     
	//   57  106:putfield        #135 <Field Timer mAdTimer>
		mHandler = ((Handler) (new Handler() {

			public void handleMessage(Message message)
			{
				int i = message.what;
			//    0    0:aload_1         
			//    1    1:getfield        #24  <Field int Message.what>
			//    2    4:istore_2        
				if(i != 0)
			//*   3    5:iload_2         
			//*   4    6:ifeq            23
				{
					if(i != 2)
			//*   5    9:iload_2         
			//*   6   10:iconst_2        
			//*   7   11:icmpeq          15
					{
						return;
			//    8   14:return          
					} else
					{
						removeOldViews();
			//    9   15:aload_0         
			//   10   16:getfield        #12  <Field MadvertiseView this$0>
			//   11   19:invokestatic    #27  <Method void MadvertiseView.access$000(MadvertiseView)>
						return;
			//   12   22:return          
					}
				} else
				{
					setVisibility(0);
			//   13   23:aload_0         
			//   14   24:getfield        #12  <Field MadvertiseView this$0>
			//   15   27:iconst_0        
			//   16   28:invokevirtual   #31  <Method void MadvertiseView.setVisibility(int)>
					return;
			//   17   31:return          
				}
			}

			final MadvertiseView this$0;

			
			{
				this$0 = MadvertiseView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MadvertiseView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Handler()>
			//    5    9:return          
			}
		}
));
	//   58  109:aload_0         
	//   59  110:new             #6   <Class MadvertiseView$1>
	//   60  113:dup             
	//   61  114:aload_0         
	//   62  115:invokespecial   #138 <Method void MadvertiseView$1(MadvertiseView)>
	//   63  118:putfield        #140 <Field Handler mHandler>
		mInitialBackground = null;
	//   64  121:aload_0         
	//   65  122:aconst_null     
	//   66  123:putfield        #142 <Field Drawable mInitialBackground>
		mOldViews = ((List) (new ArrayList()));
	//   67  126:aload_0         
	//   68  127:new             #144 <Class ArrayList>
	//   69  130:dup             
	//   70  131:invokespecial   #146 <Method void ArrayList()>
	//   71  134:putfield        #148 <Field List mOldViews>
		mAnimationListener = new AnimationEndListener() {

			public void onAnimationEnd()
			{
				mHandler.sendEmptyMessage(2);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field MadvertiseView this$0>
			//    2    4:invokestatic    #23  <Method Handler MadvertiseView.access$100(MadvertiseView)>
			//    3    7:iconst_2        
			//    4    8:invokevirtual   #29  <Method boolean Handler.sendEmptyMessage(int)>
			//    5   11:pop             
			//    6   12:return          
			}

			final MadvertiseView this$0;

			
			{
				this$0 = MadvertiseView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MadvertiseView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   72  137:aload_0         
	//   73  138:new             #8   <Class MadvertiseView$2>
	//   74  141:dup             
	//   75  142:aload_0         
	//   76  143:invokespecial   #149 <Method void MadvertiseView$2(MadvertiseView)>
	//   77  146:putfield        #151 <Field MadvertiseView$AnimationEndListener mAnimationListener>
		mFetchAdsEnabled = true;
	//   78  149:aload_0         
	//   79  150:iconst_1        
	//   80  151:putfield        #153 <Field boolean mFetchAdsEnabled>
		mPlacementType = 0;
	//   81  154:aload_0         
	//   82  155:iconst_0        
	//   83  156:putfield        #155 <Field int mPlacementType>
		mUpdateResults = new Runnable() {

			public void run()
			{
				refreshView();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field MadvertiseView this$0>
			//    2    4:invokestatic    #22  <Method void MadvertiseView.access$1400(MadvertiseView)>
			//    3    7:return          
			}

			final MadvertiseView this$0;

			
			{
				this$0 = MadvertiseView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MadvertiseView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   84  159:aload_0         
	//   85  160:new             #12  <Class MadvertiseView$4>
	//   86  163:dup             
	//   87  164:aload_0         
	//   88  165:invokespecial   #156 <Method void MadvertiseView$4(MadvertiseView)>
	//   89  168:putfield        #158 <Field Runnable mUpdateResults>
		MadvertiseUtil.logMessage(((String) (null)), 3, "** Constructor for mad view called **");
	//   90  171:aconst_null     
	//   91  172:iconst_3        
	//   92  173:ldc1            #160 <String "** Constructor for mad view called **">
	//   93  175:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		setVisibility(8);
	//   94  178:aload_0         
	//   95  179:bipush          8
	//   96  181:invokevirtual   #170 <Method void setVisibility(int)>
		if(MadvertiseUtil.checkPermissionGranted("android.permission.INTERNET", context))
	//*  97  184:ldc1            #172 <String "android.permission.INTERNET">
	//*  98  186:aload_1         
	//*  99  187:invokestatic    #176 <Method boolean MadvertiseUtil.checkPermissionGranted(String, Context)>
	//* 100  190:ifeq            421
		{
			if(MadvertiseUtil.checkForBrowserDeclaration(getContext()))
	//* 101  193:aload_0         
	//* 102  194:invokevirtual   #180 <Method Context getContext()>
	//* 103  197:invokestatic    #184 <Method boolean MadvertiseUtil.checkForBrowserDeclaration(Context)>
	//* 104  200:ifeq            386
			{
				initParameters(attributeset);
	//  105  203:aload_0         
	//  106  204:aload_2         
	//  107  205:invokespecial   #188 <Method void initParameters(AttributeSet)>
				context = ((Context) (context.getApplicationContext().getResources().getDisplayMetrics()));
	//  108  208:aload_1         
	//  109  209:invokevirtual   #193 <Method Context Context.getApplicationContext()>
	//  110  212:invokevirtual   #197 <Method Resources Context.getResources()>
	//  111  215:invokevirtual   #203 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  112  218:astore_1        
				attributeset = ((AttributeSet) (new StringBuilder()));
	//  113  219:new             #205 <Class StringBuilder>
	//  114  222:dup             
	//  115  223:invokespecial   #206 <Method void StringBuilder()>
	//  116  226:astore_2        
				((StringBuilder) (attributeset)).append("Display values: Width = ");
	//  117  227:aload_2         
	//  118  228:ldc1            #208 <String "Display values: Width = ">
	//  119  230:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  120  233:pop             
				((StringBuilder) (attributeset)).append(((DisplayMetrics) (context)).widthPixels);
	//  121  234:aload_2         
	//  122  235:aload_1         
	//  123  236:getfield        #217 <Field int DisplayMetrics.widthPixels>
	//  124  239:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  125  242:pop             
				((StringBuilder) (attributeset)).append(" ; Height = ");
	//  126  243:aload_2         
	//  127  244:ldc1            #222 <String " ; Height = ">
	//  128  246:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  129  249:pop             
				((StringBuilder) (attributeset)).append(((DisplayMetrics) (context)).heightPixels);
	//  130  250:aload_2         
	//  131  251:aload_1         
	//  132  252:getfield        #225 <Field int DisplayMetrics.heightPixels>
	//  133  255:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  134  258:pop             
				MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  135  259:aconst_null     
	//  136  260:iconst_3        
	//  137  261:aload_2         
	//  138  262:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  139  265:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
				mInitialBackground = getBackground();
	//  140  268:aload_0         
	//  141  269:aload_0         
	//  142  270:invokevirtual   #233 <Method Drawable getBackground()>
	//  143  273:putfield        #142 <Field Drawable mInitialBackground>
				if(sTextBannerBackground == null)
	//* 144  276:getstatic       #235 <Field BitmapDrawable sTextBannerBackground>
	//* 145  279:ifnonnull       309
					sTextBannerBackground = generateBackgroundDrawable(new Rect(0, 0, 1, ((DisplayMetrics) (context)).heightPixels), mBackgroundColor, 0xffffff);
	//  146  282:aload_0         
	//  147  283:new             #237 <Class Rect>
	//  148  286:dup             
	//  149  287:iconst_0        
	//  150  288:iconst_0        
	//  151  289:iconst_1        
	//  152  290:aload_1         
	//  153  291:getfield        #225 <Field int DisplayMetrics.heightPixels>
	//  154  294:invokespecial   #240 <Method void Rect(int, int, int, int)>
	//  155  297:aload_0         
	//  156  298:getfield        #103 <Field int mBackgroundColor>
	//  157  301:ldc1            #241 <Int 0xffffff>
	//  158  303:invokespecial   #245 <Method BitmapDrawable generateBackgroundDrawable(Rect, int, int)>
	//  159  306:putstatic       #235 <Field BitmapDrawable sTextBannerBackground>
				setClickable(true);
	//  160  309:aload_0         
	//  161  310:iconst_1        
	//  162  311:invokevirtual   #249 <Method void setClickable(boolean)>
				setFocusable(true);
	//  163  314:aload_0         
	//  164  315:iconst_1        
	//  165  316:invokevirtual   #252 <Method void setFocusable(boolean)>
				setDescendantFocusability(0x20000);
	//  166  319:aload_0         
	//  167  320:ldc1            #253 <Int 0x20000>
	//  168  322:invokevirtual   #256 <Method void setDescendantFocusability(int)>
				context = ((Context) (mRequestThread));
	//  169  325:aload_0         
	//  170  326:getfield        #258 <Field Thread mRequestThread>
	//  171  329:astore_1        
				if(context == null || !((Thread) (context)).isAlive())
	//* 172  330:aload_1         
	//* 173  331:ifnull          341
	//* 174  334:aload_1         
	//* 175  335:invokevirtual   #264 <Method boolean Thread.isAlive()>
	//* 176  338:ifne            346
					requestNewAd(false);
	//  177  341:aload_0         
	//  178  342:iconst_0        
	//  179  343:invokespecial   #267 <Method void requestNewAd(boolean)>
				if(mBannerType.contains("rich_media") || mBannerType.contains("rm"))
	//* 180  346:aload_0         
	//* 181  347:getfield        #111 <Field String mBannerType>
	//* 182  350:ldc2            #269 <String "rich_media">
	//* 183  353:invokevirtual   #275 <Method boolean String.contains(CharSequence)>
	//* 184  356:ifne            372
	//* 185  359:aload_0         
	//* 186  360:getfield        #111 <Field String mBannerType>
	//* 187  363:ldc2            #277 <String "rm">
	//* 188  366:invokevirtual   #275 <Method boolean String.contains(CharSequence)>
	//* 189  369:ifeq            385
				{
					setFetchingAdsEnabled(false);
	//  190  372:aload_0         
	//  191  373:iconst_0        
	//  192  374:invokevirtual   #280 <Method void setFetchingAdsEnabled(boolean)>
					MadvertiseUtil.logMessage(((String) (null)), 3, "No ad reloading, since banner_type=[rich_media|rm] was requested");
	//  193  377:aconst_null     
	//  194  378:iconst_3        
	//  195  379:ldc2            #282 <String "No ad reloading, since banner_type=[rich_media|rm] was requested">
	//  196  382:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
				}
				return;
	//  197  385:return          
			} else
			{
				MadvertiseUtil.logMessage(((String) (null)), 3, " *** ----------------------------- *** ");
	//  198  386:aconst_null     
	//  199  387:iconst_3        
	//  200  388:ldc2            #284 <String " *** ----------------------------- *** ">
	//  201  391:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
				MadvertiseUtil.logMessage(((String) (null)), 3, " *** You must declare the activity de.madvertise.android.sdk.MadvertiseActivity in your manifest! *** ");
	//  202  394:aconst_null     
	//  203  395:iconst_3        
	//  204  396:ldc2            #286 <String " *** You must declare the activity de.madvertise.android.sdk.MadvertiseActivity in your manifest! *** ">
	//  205  399:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
				MadvertiseUtil.logMessage(((String) (null)), 3, " *** ----------------------------- *** ");
	//  206  402:aconst_null     
	//  207  403:iconst_3        
	//  208  404:ldc2            #284 <String " *** ----------------------------- *** ">
	//  209  407:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
				throw new IllegalArgumentException("Missing Activity declaration!");
	//  210  410:new             #288 <Class IllegalArgumentException>
	//  211  413:dup             
	//  212  414:ldc2            #290 <String "Missing Activity declaration!">
	//  213  417:invokespecial   #293 <Method void IllegalArgumentException(String)>
	//  214  420:athrow          
			}
		} else
		{
			MadvertiseUtil.logMessage(((String) (null)), 3, " *** ----------------------------- *** ");
	//  215  421:aconst_null     
	//  216  422:iconst_3        
	//  217  423:ldc2            #284 <String " *** ----------------------------- *** ">
	//  218  426:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
			MadvertiseUtil.logMessage(((String) (null)), 3, " *** Missing internet permissions! *** ");
	//  219  429:aconst_null     
	//  220  430:iconst_3        
	//  221  431:ldc2            #295 <String " *** Missing internet permissions! *** ">
	//  222  434:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
			MadvertiseUtil.logMessage(((String) (null)), 3, " *** ----------------------------- *** ");
	//  223  437:aconst_null     
	//  224  438:iconst_3        
	//  225  439:ldc2            #284 <String " *** ----------------------------- *** ">
	//  226  442:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
			throw new IllegalArgumentException("Missing internet permission!");
	//  227  445:new             #288 <Class IllegalArgumentException>
	//  228  448:dup             
	//  229  449:ldc2            #297 <String "Missing internet permission!">
	//  230  452:invokespecial   #293 <Method void IllegalArgumentException(String)>
	//  231  455:athrow          
		}
	}

	private void animateOldViews()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #346 <Method int getChildCount()>
	//    2    4:istore_2        
		if(j > 0)
	//*   3    5:iload_2         
	//*   4    6:ifle            65
		{
			Animation animation = createAnimation(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokespecial   #350 <Method Animation createAnimation(boolean)>
	//    8   14:astore_3        
			for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          65
				if(animation != null && getChildAt(i) != null)
	//*  14   22:aload_3         
	//*  15   23:ifnull          58
	//*  16   26:aload_0         
	//*  17   27:iload_1         
	//*  18   28:invokevirtual   #354 <Method View getChildAt(int)>
	//*  19   31:ifnull          58
				{
					getChildAt(i).setAnimation(animation);
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:invokevirtual   #354 <Method View getChildAt(int)>
	//   23   39:aload_3         
	//   24   40:invokevirtual   #360 <Method void View.setAnimation(Animation)>
					mOldViews.add(((Object) (getChildAt(i))));
	//   25   43:aload_0         
	//   26   44:getfield        #148 <Field List mOldViews>
	//   27   47:aload_0         
	//   28   48:iload_1         
	//   29   49:invokevirtual   #354 <Method View getChildAt(int)>
	//   30   52:invokeinterface #366 <Method boolean List.add(Object)>
	//   31   57:pop             
				}

	//   32   58:iload_1         
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:istore_1        
		}
	//*  36   62:goto            17
	//   37   65:return          
	}

	private void calculateBannerDimensions()
	{
		Object obj = ((Object) (mCurrentAd));
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//    2    4:astore          9
		if(obj != null)
	//*   3    6:aload           9
	//*   4    8:ifnull          854
		{
			if(((MadvertiseAd) (obj)).getBannerType() == null)
	//*   5   11:aload           9
	//*   6   13:invokevirtual   #371 <Method String MadvertiseAd.getBannerType()>
	//*   7   16:ifnonnull       20
				return;
	//    8   19:return          
			obj = ((Object) (mCurrentAd.getBannerType()));
	//    9   20:aload_0         
	//   10   21:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//   11   24:invokevirtual   #371 <Method String MadvertiseAd.getBannerType()>
	//   12   27:astore          9
			if(((String) (obj)).equals("medium_rectangle"))
	//*  13   29:aload           9
	//*  14   31:ldc2            #373 <String "medium_rectangle">
	//*  15   34:invokevirtual   #376 <Method boolean String.equals(Object)>
	//*  16   37:ifeq            90
			{
				float f = mDp;
	//   17   40:aload_0         
	//   18   41:getfield        #378 <Field float mDp>
	//   19   44:fstore_1        
				mBannerHeight = (int)(250F * f + 0.5F);
	//   20   45:aload_0         
	//   21   46:ldc2            #379 <Float 250F>
	//   22   49:fload_1         
	//   23   50:fmul            
	//   24   51:ldc2            #380 <Float 0.5F>
	//   25   54:fadd            
	//   26   55:f2i             
	//   27   56:putfield        #121 <Field int mBannerHeight>
				mBannerWidth = (int)(f * 300F + 0.5F);
	//   28   59:aload_0         
	//   29   60:fload_1         
	//   30   61:ldc2            #381 <Float 300F>
	//   31   64:fmul            
	//   32   65:ldc2            #380 <Float 0.5F>
	//   33   68:fadd            
	//   34   69:f2i             
	//   35   70:putfield        #123 <Field int mBannerWidth>
				mBannerHeightDp = 250;
	//   36   73:aload_0         
	//   37   74:sipush          250
	//   38   77:putfield        #125 <Field int mBannerHeightDp>
				mBannerWidthDp = 300;
	//   39   80:aload_0         
	//   40   81:sipush          300
	//   41   84:putfield        #127 <Field int mBannerWidthDp>
			} else
	//*  42   87:goto            562
			if(((String) (obj)).equals("mma"))
	//*  43   90:aload           9
	//*  44   92:ldc1            #109 <String "mma">
	//*  45   94:invokevirtual   #376 <Method boolean String.equals(Object)>
	//*  46   97:ifeq            149
			{
				float f1 = mDp;
	//   47  100:aload_0         
	//   48  101:getfield        #378 <Field float mDp>
	//   49  104:fstore_1        
				mBannerHeight = (int)(53F * f1 + 0.5F);
	//   50  105:aload_0         
	//   51  106:ldc2            #382 <Float 53F>
	//   52  109:fload_1         
	//   53  110:fmul            
	//   54  111:ldc2            #380 <Float 0.5F>
	//   55  114:fadd            
	//   56  115:f2i             
	//   57  116:putfield        #121 <Field int mBannerHeight>
				mBannerWidth = (int)(f1 * 320F + 0.5F);
	//   58  119:aload_0         
	//   59  120:fload_1         
	//   60  121:ldc2            #383 <Float 320F>
	//   61  124:fmul            
	//   62  125:ldc2            #380 <Float 0.5F>
	//   63  128:fadd            
	//   64  129:f2i             
	//   65  130:putfield        #123 <Field int mBannerWidth>
				mBannerHeightDp = 53;
	//   66  133:aload_0         
	//   67  134:bipush          53
	//   68  136:putfield        #125 <Field int mBannerHeightDp>
				mBannerWidthDp = 320;
	//   69  139:aload_0         
	//   70  140:sipush          320
	//   71  143:putfield        #127 <Field int mBannerWidthDp>
			} else
	//*  72  146:goto            562
			if(((String) (obj)).equals("fullscreen"))
	//*  73  149:aload           9
	//*  74  151:ldc2            #385 <String "fullscreen">
	//*  75  154:invokevirtual   #376 <Method boolean String.equals(Object)>
	//*  76  157:ifeq            210
			{
				float f2 = mDp;
	//   77  160:aload_0         
	//   78  161:getfield        #378 <Field float mDp>
	//   79  164:fstore_1        
				mBannerHeight = (int)(f2 * 768F + 0.5F);
	//   80  165:aload_0         
	//   81  166:fload_1         
	//   82  167:ldc2            #386 <Float 768F>
	//   83  170:fmul            
	//   84  171:ldc2            #380 <Float 0.5F>
	//   85  174:fadd            
	//   86  175:f2i             
	//   87  176:putfield        #121 <Field int mBannerHeight>
				mBannerWidth = (int)(f2 * 768F + 0.5F);
	//   88  179:aload_0         
	//   89  180:fload_1         
	//   90  181:ldc2            #386 <Float 768F>
	//   91  184:fmul            
	//   92  185:ldc2            #380 <Float 0.5F>
	//   93  188:fadd            
	//   94  189:f2i             
	//   95  190:putfield        #123 <Field int mBannerWidth>
				mBannerHeightDp = 768;
	//   96  193:aload_0         
	//   97  194:sipush          768
	//   98  197:putfield        #125 <Field int mBannerHeightDp>
				mBannerWidthDp = 768;
	//   99  200:aload_0         
	//  100  201:sipush          768
	//  101  204:putfield        #127 <Field int mBannerWidthDp>
			} else
	//* 102  207:goto            562
			if(((String) (obj)).equals("landscape"))
	//* 103  210:aload           9
	//* 104  212:ldc2            #388 <String "landscape">
	//* 105  215:invokevirtual   #376 <Method boolean String.equals(Object)>
	//* 106  218:ifeq            270
			{
				float f3 = mDp;
	//  107  221:aload_0         
	//  108  222:getfield        #378 <Field float mDp>
	//  109  225:fstore_1        
				mBannerHeight = (int)(66F * f3 + 0.5F);
	//  110  226:aload_0         
	//  111  227:ldc2            #389 <Float 66F>
	//  112  230:fload_1         
	//  113  231:fmul            
	//  114  232:ldc2            #380 <Float 0.5F>
	//  115  235:fadd            
	//  116  236:f2i             
	//  117  237:putfield        #121 <Field int mBannerHeight>
				mBannerWidth = (int)(f3 * 1024F + 0.5F);
	//  118  240:aload_0         
	//  119  241:fload_1         
	//  120  242:ldc2            #390 <Float 1024F>
	//  121  245:fmul            
	//  122  246:ldc2            #380 <Float 0.5F>
	//  123  249:fadd            
	//  124  250:f2i             
	//  125  251:putfield        #123 <Field int mBannerWidth>
				mBannerHeightDp = 66;
	//  126  254:aload_0         
	//  127  255:bipush          66
	//  128  257:putfield        #125 <Field int mBannerHeightDp>
				mBannerWidthDp = 1024;
	//  129  260:aload_0         
	//  130  261:sipush          1024
	//  131  264:putfield        #127 <Field int mBannerWidthDp>
			} else
	//* 132  267:goto            562
			if(((String) (obj)).equals("leaderboard"))
	//* 133  270:aload           9
	//* 134  272:ldc2            #392 <String "leaderboard">
	//* 135  275:invokevirtual   #376 <Method boolean String.equals(Object)>
	//* 136  278:ifeq            330
			{
				float f4 = mDp;
	//  137  281:aload_0         
	//  138  282:getfield        #378 <Field float mDp>
	//  139  285:fstore_1        
				mBannerHeight = (int)(90F * f4 + 0.5F);
	//  140  286:aload_0         
	//  141  287:ldc2            #393 <Float 90F>
	//  142  290:fload_1         
	//  143  291:fmul            
	//  144  292:ldc2            #380 <Float 0.5F>
	//  145  295:fadd            
	//  146  296:f2i             
	//  147  297:putfield        #121 <Field int mBannerHeight>
				mBannerWidth = (int)(f4 * 728F + 0.5F);
	//  148  300:aload_0         
	//  149  301:fload_1         
	//  150  302:ldc2            #394 <Float 728F>
	//  151  305:fmul            
	//  152  306:ldc2            #380 <Float 0.5F>
	//  153  309:fadd            
	//  154  310:f2i             
	//  155  311:putfield        #123 <Field int mBannerWidth>
				mBannerHeightDp = 90;
	//  156  314:aload_0         
	//  157  315:bipush          90
	//  158  317:putfield        #125 <Field int mBannerHeightDp>
				mBannerWidthDp = 728;
	//  159  320:aload_0         
	//  160  321:sipush          728
	//  161  324:putfield        #127 <Field int mBannerWidthDp>
			} else
	//* 162  327:goto            562
			if(((String) (obj)).equals("portrait"))
	//* 163  330:aload           9
	//* 164  332:ldc2            #396 <String "portrait">
	//* 165  335:invokevirtual   #376 <Method boolean String.equals(Object)>
	//* 166  338:ifeq            390
			{
				float f5 = mDp;
	//  167  341:aload_0         
	//  168  342:getfield        #378 <Field float mDp>
	//  169  345:fstore_1        
				mBannerHeight = (int)(66F * f5 + 0.5F);
	//  170  346:aload_0         
	//  171  347:ldc2            #389 <Float 66F>
	//  172  350:fload_1         
	//  173  351:fmul            
	//  174  352:ldc2            #380 <Float 0.5F>
	//  175  355:fadd            
	//  176  356:f2i             
	//  177  357:putfield        #121 <Field int mBannerHeight>
				mBannerWidth = (int)(f5 * 766F + 0.5F);
	//  178  360:aload_0         
	//  179  361:fload_1         
	//  180  362:ldc2            #397 <Float 766F>
	//  181  365:fmul            
	//  182  366:ldc2            #380 <Float 0.5F>
	//  183  369:fadd            
	//  184  370:f2i             
	//  185  371:putfield        #123 <Field int mBannerWidth>
				mBannerHeightDp = 66;
	//  186  374:aload_0         
	//  187  375:bipush          66
	//  188  377:putfield        #125 <Field int mBannerHeightDp>
				mBannerWidthDp = 766;
	//  189  380:aload_0         
	//  190  381:sipush          766
	//  191  384:putfield        #127 <Field int mBannerWidthDp>
			} else
	//* 192  387:goto            562
			if(((String) (obj)).equals("rich_media") && mCurrentAd.isMraid())
	//* 193  390:aload           9
	//* 194  392:ldc2            #269 <String "rich_media">
	//* 195  395:invokevirtual   #376 <Method boolean String.equals(Object)>
	//* 196  398:ifeq            473
	//* 197  401:aload_0         
	//* 198  402:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//* 199  405:invokevirtual   #400 <Method boolean MadvertiseAd.isMraid()>
	//* 200  408:ifeq            473
			{
				mBannerHeightDp = mCurrentAd.getBannerHeight();
	//  201  411:aload_0         
	//  202  412:aload_0         
	//  203  413:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//  204  416:invokevirtual   #403 <Method int MadvertiseAd.getBannerHeight()>
	//  205  419:putfield        #125 <Field int mBannerHeightDp>
				mBannerWidthDp = mCurrentAd.getBannerWidth();
	//  206  422:aload_0         
	//  207  423:aload_0         
	//  208  424:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//  209  427:invokevirtual   #406 <Method int MadvertiseAd.getBannerWidth()>
	//  210  430:putfield        #127 <Field int mBannerWidthDp>
				float f6 = mDp;
	//  211  433:aload_0         
	//  212  434:getfield        #378 <Field float mDp>
	//  213  437:fstore_1        
				mBannerHeight = (int)((float)mBannerHeightDp * f6 + 0.5F);
	//  214  438:aload_0         
	//  215  439:aload_0         
	//  216  440:getfield        #125 <Field int mBannerHeightDp>
	//  217  443:i2f             
	//  218  444:fload_1         
	//  219  445:fmul            
	//  220  446:ldc2            #380 <Float 0.5F>
	//  221  449:fadd            
	//  222  450:f2i             
	//  223  451:putfield        #121 <Field int mBannerHeight>
				mBannerWidth = (int)(f6 * (float)mBannerWidthDp + 0.5F);
	//  224  454:aload_0         
	//  225  455:fload_1         
	//  226  456:aload_0         
	//  227  457:getfield        #127 <Field int mBannerWidthDp>
	//  228  460:i2f             
	//  229  461:fmul            
	//  230  462:ldc2            #380 <Float 0.5F>
	//  231  465:fadd            
	//  232  466:f2i             
	//  233  467:putfield        #123 <Field int mBannerWidth>
			} else
	//* 234  470:goto            562
			if(((String) (obj)).equals("rich_media"))
	//* 235  473:aload           9
	//* 236  475:ldc2            #269 <String "rich_media">
	//* 237  478:invokevirtual   #376 <Method boolean String.equals(Object)>
	//* 238  481:ifeq            562
			{
				MadvertiseAd madvertisead = mCurrentAd;
	//  239  484:aload_0         
	//  240  485:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//  241  488:astore          10
				if(madvertisead != null && !madvertisead.isMraid())
	//* 242  490:aload           10
	//* 243  492:ifnull          562
	//* 244  495:aload           10
	//* 245  497:invokevirtual   #400 <Method boolean MadvertiseAd.isMraid()>
	//* 246  500:ifne            562
				{
					mBannerHeightDp = mCurrentAd.getBannerHeight();
	//  247  503:aload_0         
	//  248  504:aload_0         
	//  249  505:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//  250  508:invokevirtual   #403 <Method int MadvertiseAd.getBannerHeight()>
	//  251  511:putfield        #125 <Field int mBannerHeightDp>
					mBannerWidthDp = mCurrentAd.getBannerWidth();
	//  252  514:aload_0         
	//  253  515:aload_0         
	//  254  516:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//  255  519:invokevirtual   #406 <Method int MadvertiseAd.getBannerWidth()>
	//  256  522:putfield        #127 <Field int mBannerWidthDp>
					float f7 = mDp;
	//  257  525:aload_0         
	//  258  526:getfield        #378 <Field float mDp>
	//  259  529:fstore_1        
					mBannerHeight = (int)((float)mBannerHeightDp * f7 + 0.5F);
	//  260  530:aload_0         
	//  261  531:aload_0         
	//  262  532:getfield        #125 <Field int mBannerHeightDp>
	//  263  535:i2f             
	//  264  536:fload_1         
	//  265  537:fmul            
	//  266  538:ldc2            #380 <Float 0.5F>
	//  267  541:fadd            
	//  268  542:f2i             
	//  269  543:putfield        #121 <Field int mBannerHeight>
					mBannerWidth = (int)(f7 * (float)mBannerWidthDp + 0.5F);
	//  270  546:aload_0         
	//  271  547:fload_1         
	//  272  548:aload_0         
	//  273  549:getfield        #127 <Field int mBannerWidthDp>
	//  274  552:i2f             
	//  275  553:fmul            
	//  276  554:ldc2            #380 <Float 0.5F>
	//  277  557:fadd            
	//  278  558:f2i             
	//  279  559:putfield        #123 <Field int mBannerWidth>
				}
			}
			DisplayMetrics displaymetrics = getContext().getApplicationContext().getResources().getDisplayMetrics();
	//  280  562:aload_0         
	//  281  563:invokevirtual   #180 <Method Context getContext()>
	//  282  566:invokevirtual   #193 <Method Context Context.getApplicationContext()>
	//  283  569:invokevirtual   #197 <Method Resources Context.getResources()>
	//  284  572:invokevirtual   #203 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  285  575:astore          10
			int i = mBannerHeight;
	//  286  577:aload_0         
	//  287  578:getfield        #121 <Field int mBannerHeight>
	//  288  581:istore          5
			int j = mBannerWidth;
	//  289  583:aload_0         
	//  290  584:getfield        #123 <Field int mBannerWidth>
	//  291  587:istore          6
			if(displaymetrics.heightPixels < mBannerHeight)
	//* 292  589:aload           10
	//* 293  591:getfield        #225 <Field int DisplayMetrics.heightPixels>
	//* 294  594:aload_0         
	//* 295  595:getfield        #121 <Field int mBannerHeight>
	//* 296  598:icmpge          608
				i = displaymetrics.heightPixels;
	//  297  601:aload           10
	//  298  603:getfield        #225 <Field int DisplayMetrics.heightPixels>
	//  299  606:istore          5
			if(displaymetrics.widthPixels < mBannerWidth)
	//* 300  608:aload           10
	//* 301  610:getfield        #217 <Field int DisplayMetrics.widthPixels>
	//* 302  613:aload_0         
	//* 303  614:getfield        #123 <Field int mBannerWidth>
	//* 304  617:icmpge          627
				j = displaymetrics.widthPixels;
	//  305  620:aload           10
	//  306  622:getfield        #217 <Field int DisplayMetrics.widthPixels>
	//  307  625:istore          6
			if(((String) (obj)).equals("fullscreen"))
	//* 308  627:aload           9
	//* 309  629:ldc2            #385 <String "fullscreen">
	//* 310  632:invokevirtual   #376 <Method boolean String.equals(Object)>
	//* 311  635:ifeq            721
				if(i < j)
	//* 312  638:iload           5
	//* 313  640:iload           6
	//* 314  642:icmpge          683
				{
					mBannerWidth = i;
	//  315  645:aload_0         
	//  316  646:iload           5
	//  317  648:putfield        #123 <Field int mBannerWidth>
					mBannerHeight = i;
	//  318  651:aload_0         
	//  319  652:iload           5
	//  320  654:putfield        #121 <Field int mBannerHeight>
					float f8 = i;
	//  321  657:iload           5
	//  322  659:i2f             
	//  323  660:fstore_1        
					float f12 = mDp;
	//  324  661:aload_0         
	//  325  662:getfield        #378 <Field float mDp>
	//  326  665:fstore_2        
					mBannerWidthDp = (int)(f8 / f12);
	//  327  666:aload_0         
	//  328  667:fload_1         
	//  329  668:fload_2         
	//  330  669:fdiv            
	//  331  670:f2i             
	//  332  671:putfield        #127 <Field int mBannerWidthDp>
					mBannerHeightDp = (int)(f8 / f12);
	//  333  674:aload_0         
	//  334  675:fload_1         
	//  335  676:fload_2         
	//  336  677:fdiv            
	//  337  678:f2i             
	//  338  679:putfield        #125 <Field int mBannerHeightDp>
					return;
	//  339  682:return          
				} else
				{
					mBannerWidth = j;
	//  340  683:aload_0         
	//  341  684:iload           6
	//  342  686:putfield        #123 <Field int mBannerWidth>
					mBannerHeight = j;
	//  343  689:aload_0         
	//  344  690:iload           6
	//  345  692:putfield        #121 <Field int mBannerHeight>
					float f9 = j;
	//  346  695:iload           6
	//  347  697:i2f             
	//  348  698:fstore_1        
					float f13 = mDp;
	//  349  699:aload_0         
	//  350  700:getfield        #378 <Field float mDp>
	//  351  703:fstore_2        
					mBannerWidthDp = (int)(f9 / f13);
	//  352  704:aload_0         
	//  353  705:fload_1         
	//  354  706:fload_2         
	//  355  707:fdiv            
	//  356  708:f2i             
	//  357  709:putfield        #127 <Field int mBannerWidthDp>
					mBannerHeightDp = (int)(f9 / f13);
	//  358  712:aload_0         
	//  359  713:fload_1         
	//  360  714:fload_2         
	//  361  715:fdiv            
	//  362  716:f2i             
	//  363  717:putfield        #125 <Field int mBannerHeightDp>
					return;
	//  364  720:return          
				}
			int k = mBannerHeight;
	//  365  721:aload_0         
	//  366  722:getfield        #121 <Field int mBannerHeight>
	//  367  725:istore          7
			float f14 = k;
	//  368  727:iload           7
	//  369  729:i2f             
	//  370  730:fstore_2        
			float f10 = i;
	//  371  731:iload           5
	//  372  733:i2f             
	//  373  734:fstore_1        
			float f15 = f14 / f10;
	//  374  735:fload_2         
	//  375  736:fload_1         
	//  376  737:fdiv            
	//  377  738:fstore_3        
			int l = mBannerWidth;
	//  378  739:aload_0         
	//  379  740:getfield        #123 <Field int mBannerWidth>
	//  380  743:istore          8
			float f16 = l;
	//  381  745:iload           8
	//  382  747:i2f             
	//  383  748:fstore          4
			f14 = j;
	//  384  750:iload           6
	//  385  752:i2f             
	//  386  753:fstore_2        
			f16 /= f14;
	//  387  754:fload           4
	//  388  756:fload_2         
	//  389  757:fdiv            
	//  390  758:fstore          4
			if(f15 > f16)
	//* 391  760:fload_3         
	//* 392  761:fload           4
	//* 393  763:fcmpl           
	//* 394  764:ifle            811
			{
				mBannerWidth = (int)((float)l / f15);
	//  395  767:aload_0         
	//  396  768:iload           8
	//  397  770:i2f             
	//  398  771:fload_3         
	//  399  772:fdiv            
	//  400  773:f2i             
	//  401  774:putfield        #123 <Field int mBannerWidth>
				mBannerHeight = i;
	//  402  777:aload_0         
	//  403  778:iload           5
	//  404  780:putfield        #121 <Field int mBannerHeight>
				f14 = mBannerWidth;
	//  405  783:aload_0         
	//  406  784:getfield        #123 <Field int mBannerWidth>
	//  407  787:i2f             
	//  408  788:fstore_2        
				f15 = mDp;
	//  409  789:aload_0         
	//  410  790:getfield        #378 <Field float mDp>
	//  411  793:fstore_3        
				mBannerWidthDp = (int)(f14 / f15);
	//  412  794:aload_0         
	//  413  795:fload_2         
	//  414  796:fload_3         
	//  415  797:fdiv            
	//  416  798:f2i             
	//  417  799:putfield        #127 <Field int mBannerWidthDp>
				mBannerHeightDp = (int)(f10 / f15);
	//  418  802:aload_0         
	//  419  803:fload_1         
	//  420  804:fload_3         
	//  421  805:fdiv            
	//  422  806:f2i             
	//  423  807:putfield        #125 <Field int mBannerHeightDp>
				return;
	//  424  810:return          
			} else
			{
				mBannerWidth = j;
	//  425  811:aload_0         
	//  426  812:iload           6
	//  427  814:putfield        #123 <Field int mBannerWidth>
				mBannerHeight = (int)((float)k / f16);
	//  428  817:aload_0         
	//  429  818:iload           7
	//  430  820:i2f             
	//  431  821:fload           4
	//  432  823:fdiv            
	//  433  824:f2i             
	//  434  825:putfield        #121 <Field int mBannerHeight>
				float f11 = mDp;
	//  435  828:aload_0         
	//  436  829:getfield        #378 <Field float mDp>
	//  437  832:fstore_1        
				mBannerWidthDp = (int)(f14 / f11);
	//  438  833:aload_0         
	//  439  834:fload_2         
	//  440  835:fload_1         
	//  441  836:fdiv            
	//  442  837:f2i             
	//  443  838:putfield        #127 <Field int mBannerWidthDp>
				mBannerHeightDp = (int)((float)mBannerHeight / f11);
	//  444  841:aload_0         
	//  445  842:aload_0         
	//  446  843:getfield        #121 <Field int mBannerHeight>
	//  447  846:i2f             
	//  448  847:fload_1         
	//  449  848:fdiv            
	//  450  849:f2i             
	//  451  850:putfield        #125 <Field int mBannerHeightDp>
				return;
	//  452  853:return          
			}
		} else
		{
			return;
	//  453  854:return          
		}
	}

	private Animation createAnimation(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            151
		{
			Object obj = ((Object) (mAnimationType));
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field String mAnimationType>
	//    4    8:astore_2        
			if(obj != null && ((String) (obj)).equals("fade"))
	//*   5    9:aload_2         
	//*   6   10:ifnull          41
	//*   7   13:aload_2         
	//*   8   14:ldc1            #113 <String "fade">
	//*   9   16:invokevirtual   #376 <Method boolean String.equals(Object)>
	//*  10   19:ifeq            41
			{
				obj = ((Object) (new AlphaAnimation(1.0F, 0.0F)));
	//   11   22:new             #408 <Class AlphaAnimation>
	//   12   25:dup             
	//   13   26:fconst_1        
	//   14   27:fconst_0        
	//   15   28:invokespecial   #411 <Method void AlphaAnimation(float, float)>
	//   16   31:astore_2        
				((Animation) (obj)).setDuration(700L);
	//   17   32:aload_2         
	//   18   33:ldc2w           #412 <Long 700L>
	//   19   36:invokevirtual   #419 <Method void Animation.setDuration(long)>
				return ((Animation) (obj));
	//   20   39:aload_2         
	//   21   40:areturn         
			}
			obj = ((Object) (mAnimationType));
	//   22   41:aload_0         
	//   23   42:getfield        #115 <Field String mAnimationType>
	//   24   45:astore_2        
			if(obj != null && ((String) (obj)).equals("left_to_right"))
	//*  25   46:aload_2         
	//*  26   47:ifnull          96
	//*  27   50:aload_2         
	//*  28   51:ldc2            #421 <String "left_to_right">
	//*  29   54:invokevirtual   #376 <Method boolean String.equals(Object)>
	//*  30   57:ifeq            96
			{
				obj = ((Object) (new TranslateAnimation(2, 0.0F, 2, 1.0F, 2, 0.0F, 2, 0.0F)));
	//   31   60:new             #423 <Class TranslateAnimation>
	//   32   63:dup             
	//   33   64:iconst_2        
	//   34   65:fconst_0        
	//   35   66:iconst_2        
	//   36   67:fconst_1        
	//   37   68:iconst_2        
	//   38   69:fconst_0        
	//   39   70:iconst_2        
	//   40   71:fconst_0        
	//   41   72:invokespecial   #426 <Method void TranslateAnimation(int, float, int, float, int, float, int, float)>
	//   42   75:astore_2        
				((Animation) (obj)).setDuration(900L);
	//   43   76:aload_2         
	//   44   77:ldc2w           #427 <Long 900L>
	//   45   80:invokevirtual   #419 <Method void Animation.setDuration(long)>
				((Animation) (obj)).setInterpolator(((android.view.animation.Interpolator) (new AccelerateInterpolator())));
	//   46   83:aload_2         
	//   47   84:new             #430 <Class AccelerateInterpolator>
	//   48   87:dup             
	//   49   88:invokespecial   #431 <Method void AccelerateInterpolator()>
	//   50   91:invokevirtual   #435 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
				return ((Animation) (obj));
	//   51   94:aload_2         
	//   52   95:areturn         
			}
			obj = ((Object) (mAnimationType));
	//   53   96:aload_0         
	//   54   97:getfield        #115 <Field String mAnimationType>
	//   55  100:astore_2        
			if(obj != null && ((String) (obj)).equals("top_down"))
	//*  56  101:aload_2         
	//*  57  102:ifnull          302
	//*  58  105:aload_2         
	//*  59  106:ldc2            #437 <String "top_down">
	//*  60  109:invokevirtual   #376 <Method boolean String.equals(Object)>
	//*  61  112:ifeq            302
			{
				TranslateAnimation translateanimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, 1.0F);
	//   62  115:new             #423 <Class TranslateAnimation>
	//   63  118:dup             
	//   64  119:iconst_2        
	//   65  120:fconst_0        
	//   66  121:iconst_2        
	//   67  122:fconst_0        
	//   68  123:iconst_2        
	//   69  124:fconst_0        
	//   70  125:iconst_2        
	//   71  126:fconst_1        
	//   72  127:invokespecial   #426 <Method void TranslateAnimation(int, float, int, float, int, float, int, float)>
	//   73  130:astore_2        
				((Animation) (translateanimation)).setDuration(900L);
	//   74  131:aload_2         
	//   75  132:ldc2w           #427 <Long 900L>
	//   76  135:invokevirtual   #419 <Method void Animation.setDuration(long)>
				((Animation) (translateanimation)).setInterpolator(((android.view.animation.Interpolator) (new AccelerateInterpolator())));
	//   77  138:aload_2         
	//   78  139:new             #430 <Class AccelerateInterpolator>
	//   79  142:dup             
	//   80  143:invokespecial   #431 <Method void AccelerateInterpolator()>
	//   81  146:invokevirtual   #435 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
				return ((Animation) (translateanimation));
	//   82  149:aload_2         
	//   83  150:areturn         
			}
		} else
		{
			Object obj1 = ((Object) (mAnimationType));
	//   84  151:aload_0         
	//   85  152:getfield        #115 <Field String mAnimationType>
	//   86  155:astore_2        
			if(obj1 != null && ((String) (obj1)).equals("fade"))
	//*  87  156:aload_2         
	//*  88  157:ifnull          188
	//*  89  160:aload_2         
	//*  90  161:ldc1            #113 <String "fade">
	//*  91  163:invokevirtual   #376 <Method boolean String.equals(Object)>
	//*  92  166:ifeq            188
			{
				obj1 = ((Object) (new AlphaAnimation(0.0F, 1.0F)));
	//   93  169:new             #408 <Class AlphaAnimation>
	//   94  172:dup             
	//   95  173:fconst_0        
	//   96  174:fconst_1        
	//   97  175:invokespecial   #411 <Method void AlphaAnimation(float, float)>
	//   98  178:astore_2        
				((Animation) (obj1)).setDuration(1200L);
	//   99  179:aload_2         
	//  100  180:ldc2w           #438 <Long 1200L>
	//  101  183:invokevirtual   #419 <Method void Animation.setDuration(long)>
				return ((Animation) (obj1));
	//  102  186:aload_2         
	//  103  187:areturn         
			}
			obj1 = ((Object) (mAnimationType));
	//  104  188:aload_0         
	//  105  189:getfield        #115 <Field String mAnimationType>
	//  106  192:astore_2        
			if(obj1 != null && ((String) (obj1)).equals("left_to_right"))
	//* 107  193:aload_2         
	//* 108  194:ifnull          245
	//* 109  197:aload_2         
	//* 110  198:ldc2            #421 <String "left_to_right">
	//* 111  201:invokevirtual   #376 <Method boolean String.equals(Object)>
	//* 112  204:ifeq            245
			{
				obj1 = ((Object) (new TranslateAnimation(2, -1F, 2, 0.0F, 2, 0.0F, 2, 0.0F)));
	//  113  207:new             #423 <Class TranslateAnimation>
	//  114  210:dup             
	//  115  211:iconst_2        
	//  116  212:ldc2            #440 <Float -1F>
	//  117  215:iconst_2        
	//  118  216:fconst_0        
	//  119  217:iconst_2        
	//  120  218:fconst_0        
	//  121  219:iconst_2        
	//  122  220:fconst_0        
	//  123  221:invokespecial   #426 <Method void TranslateAnimation(int, float, int, float, int, float, int, float)>
	//  124  224:astore_2        
				((Animation) (obj1)).setDuration(900L);
	//  125  225:aload_2         
	//  126  226:ldc2w           #427 <Long 900L>
	//  127  229:invokevirtual   #419 <Method void Animation.setDuration(long)>
				((Animation) (obj1)).setInterpolator(((android.view.animation.Interpolator) (new AccelerateInterpolator())));
	//  128  232:aload_2         
	//  129  233:new             #430 <Class AccelerateInterpolator>
	//  130  236:dup             
	//  131  237:invokespecial   #431 <Method void AccelerateInterpolator()>
	//  132  240:invokevirtual   #435 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
				return ((Animation) (obj1));
	//  133  243:aload_2         
	//  134  244:areturn         
			}
			obj1 = ((Object) (mAnimationType));
	//  135  245:aload_0         
	//  136  246:getfield        #115 <Field String mAnimationType>
	//  137  249:astore_2        
			if(obj1 != null && ((String) (obj1)).equals("top_down"))
	//* 138  250:aload_2         
	//* 139  251:ifnull          302
	//* 140  254:aload_2         
	//* 141  255:ldc2            #437 <String "top_down">
	//* 142  258:invokevirtual   #376 <Method boolean String.equals(Object)>
	//* 143  261:ifeq            302
			{
				TranslateAnimation translateanimation1 = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, -1F, 2, 0.0F);
	//  144  264:new             #423 <Class TranslateAnimation>
	//  145  267:dup             
	//  146  268:iconst_2        
	//  147  269:fconst_0        
	//  148  270:iconst_2        
	//  149  271:fconst_0        
	//  150  272:iconst_2        
	//  151  273:ldc2            #440 <Float -1F>
	//  152  276:iconst_2        
	//  153  277:fconst_0        
	//  154  278:invokespecial   #426 <Method void TranslateAnimation(int, float, int, float, int, float, int, float)>
	//  155  281:astore_2        
				((Animation) (translateanimation1)).setDuration(900L);
	//  156  282:aload_2         
	//  157  283:ldc2w           #427 <Long 900L>
	//  158  286:invokevirtual   #419 <Method void Animation.setDuration(long)>
				((Animation) (translateanimation1)).setInterpolator(((android.view.animation.Interpolator) (new AccelerateInterpolator())));
	//  159  289:aload_2         
	//  160  290:new             #430 <Class AccelerateInterpolator>
	//  161  293:dup             
	//  162  294:invokespecial   #431 <Method void AccelerateInterpolator()>
	//  163  297:invokevirtual   #435 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
				return ((Animation) (translateanimation1));
	//  164  300:aload_2         
	//  165  301:areturn         
			}
		}
		return null;
	//  166  302:aconst_null     
	//  167  303:areturn         
	}

	private void drawTextBannerBackground(Canvas canvas, Rect rect, int i, int j)
	{
		Object obj = ((Object) (new Paint()));
	//    0    0:new             #444 <Class Paint>
	//    1    3:dup             
	//    2    4:invokespecial   #445 <Method void Paint()>
	//    3    7:astore          5
		((Paint) (obj)).setColor(i);
	//    4    9:aload           5
	//    5   11:iload_3         
	//    6   12:invokevirtual   #448 <Method void Paint.setColor(int)>
		((Paint) (obj)).setAntiAlias(true);
	//    7   15:aload           5
	//    8   17:iconst_1        
	//    9   18:invokevirtual   #451 <Method void Paint.setAntiAlias(boolean)>
		canvas.drawRect(rect, ((Paint) (obj)));
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:aload           5
	//   13   25:invokevirtual   #457 <Method void Canvas.drawRect(Rect, Paint)>
		i = Color.argb(127, Color.red(j), Color.green(j), Color.blue(j));
	//   14   28:bipush          127
	//   15   30:iload           4
	//   16   32:invokestatic    #463 <Method int Color.red(int)>
	//   17   35:iload           4
	//   18   37:invokestatic    #466 <Method int Color.green(int)>
	//   19   40:iload           4
	//   20   42:invokestatic    #469 <Method int Color.blue(int)>
	//   21   45:invokestatic    #473 <Method int Color.argb(int, int, int, int)>
	//   22   48:istore_3        
		obj = ((Object) (new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
			i, j
		})));
	//   23   49:new             #475 <Class GradientDrawable>
	//   24   52:dup             
	//   25   53:getstatic       #481 <Field android.graphics.drawable.GradientDrawable$Orientation android.graphics.drawable.GradientDrawable$Orientation.TOP_BOTTOM>
	//   26   56:iconst_2        
	//   27   57:newarray        int[]
	//   28   59:dup             
	//   29   60:iconst_0        
	//   30   61:iload_3         
	//   31   62:iastore         
	//   32   63:dup             
	//   33   64:iconst_1        
	//   34   65:iload           4
	//   35   67:iastore         
	//   36   68:invokespecial   #484 <Method void GradientDrawable(android.graphics.drawable.GradientDrawable$Orientation, int[])>
	//   37   71:astore          5
		i = (int)((double)rect.height() * 0.73750000000000004D) + rect.top;
	//   38   73:aload_2         
	//   39   74:invokevirtual   #487 <Method int Rect.height()>
	//   40   77:i2d             
	//   41   78:ldc2w           #96  <Double 0.73750000000000004D>
	//   42   81:dmul            
	//   43   82:d2i             
	//   44   83:aload_2         
	//   45   84:getfield        #490 <Field int Rect.top>
	//   46   87:iadd            
	//   47   88:istore_3        
		((GradientDrawable) (obj)).setBounds(rect.left, rect.top, rect.right, i);
	//   48   89:aload           5
	//   49   91:aload_2         
	//   50   92:getfield        #493 <Field int Rect.left>
	//   51   95:aload_2         
	//   52   96:getfield        #490 <Field int Rect.top>
	//   53   99:aload_2         
	//   54  100:getfield        #496 <Field int Rect.right>
	//   55  103:iload_3         
	//   56  104:invokevirtual   #499 <Method void GradientDrawable.setBounds(int, int, int, int)>
		((GradientDrawable) (obj)).draw(canvas);
	//   57  107:aload           5
	//   58  109:aload_1         
	//   59  110:invokevirtual   #503 <Method void GradientDrawable.draw(Canvas)>
		rect = new Rect(rect.left, i, rect.right, rect.bottom);
	//   60  113:new             #237 <Class Rect>
	//   61  116:dup             
	//   62  117:aload_2         
	//   63  118:getfield        #493 <Field int Rect.left>
	//   64  121:iload_3         
	//   65  122:aload_2         
	//   66  123:getfield        #496 <Field int Rect.right>
	//   67  126:aload_2         
	//   68  127:getfield        #506 <Field int Rect.bottom>
	//   69  130:invokespecial   #240 <Method void Rect(int, int, int, int)>
	//   70  133:astore_2        
		obj = ((Object) (new Paint()));
	//   71  134:new             #444 <Class Paint>
	//   72  137:dup             
	//   73  138:invokespecial   #445 <Method void Paint()>
	//   74  141:astore          5
		((Paint) (obj)).setColor(j);
	//   75  143:aload           5
	//   76  145:iload           4
	//   77  147:invokevirtual   #448 <Method void Paint.setColor(int)>
		canvas.drawRect(rect, ((Paint) (obj)));
	//   78  150:aload_1         
	//   79  151:aload_2         
	//   80  152:aload           5
	//   81  154:invokevirtual   #457 <Method void Canvas.drawRect(Rect, Paint)>
	//   82  157:return          
	}

	private BitmapDrawable generateBackgroundDrawable(Rect rect, int i, int j)
	{
		try
		{
			Bitmap bitmap = Bitmap.createBitmap(rect.width(), rect.height(), android.graphics.Bitmap.Config.ARGB_8888);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #511 <Method int Rect.width()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #487 <Method int Rect.height()>
	//    4    8:getstatic       #517 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    5   11:invokestatic    #523 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//    6   14:astore          4
			drawTextBannerBackground(new Canvas(bitmap), rect, i, j);
	//    7   16:aload_0         
	//    8   17:new             #453 <Class Canvas>
	//    9   20:dup             
	//   10   21:aload           4
	//   11   23:invokespecial   #526 <Method void Canvas(Bitmap)>
	//   12   26:aload_1         
	//   13   27:iload_2         
	//   14   28:iload_3         
	//   15   29:invokespecial   #528 <Method void drawTextBannerBackground(Canvas, Rect, int, int)>
			rect = ((Rect) (new BitmapDrawable(bitmap)));
	//   16   32:new             #530 <Class BitmapDrawable>
	//   17   35:dup             
	//   18   36:aload           4
	//   19   38:invokespecial   #531 <Method void BitmapDrawable(Bitmap)>
	//   20   41:astore_1        
		}
	//*  21   42:aload_1         
	//*  22   43:areturn         
	//*  23   44:aconst_null     
	//*  24   45:areturn         
		// Misplaced declaration of an exception variable
		catch(Rect rect)
		{
			return null;
		}
		return ((BitmapDrawable) (rect));
	//*  25   46:astore_1        
	//*  26   47:goto            44
	}

	private void initParameters(AttributeSet attributeset)
	{
		mDp = getContext().getApplicationContext().getResources().getDisplayMetrics().density;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #180 <Method Context getContext()>
	//    3    5:invokevirtual   #193 <Method Context Context.getApplicationContext()>
	//    4    8:invokevirtual   #197 <Method Resources Context.getResources()>
	//    5   11:invokevirtual   #203 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    6   14:getfield        #534 <Field float DisplayMetrics.density>
	//    7   17:putfield        #378 <Field float mDp>
		if(attributeset != null)
	//*   8   20:aload_1         
	//*   9   21:ifnull          395
		{
			Object obj = ((Object) (new StringBuilder()));
	//   10   24:new             #205 <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #206 <Method void StringBuilder()>
	//   13   31:astore_3        
			((StringBuilder) (obj)).append("http://schemas.android.com/apk/res/");
	//   14   32:aload_3         
	//   15   33:ldc2            #536 <String "http://schemas.android.com/apk/res/">
	//   16   36:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
			((StringBuilder) (obj)).append(getContext().getApplicationContext().getPackageName());
	//   18   40:aload_3         
	//   19   41:aload_0         
	//   20   42:invokevirtual   #180 <Method Context getContext()>
	//   21   45:invokevirtual   #193 <Method Context Context.getApplicationContext()>
	//   22   48:invokevirtual   #539 <Method String Context.getPackageName()>
	//   23   51:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   25   55:aload_3         
	//   26   56:invokevirtual   #229 <Method String StringBuilder.toString()>
	//   27   59:astore_3        
			if(obj != null)
	//*  28   60:aload_3         
	//*  29   61:ifnull          99
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   30   64:new             #205 <Class StringBuilder>
	//   31   67:dup             
	//   32   68:invokespecial   #206 <Method void StringBuilder()>
	//   33   71:astore          4
				stringbuilder.append("namespace = ");
	//   34   73:aload           4
	//   35   75:ldc2            #541 <String "namespace = ">
	//   36   78:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   37   81:pop             
				stringbuilder.append(((String) (obj)));
	//   38   82:aload           4
	//   39   84:aload_3         
	//   40   85:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   41   88:pop             
				MadvertiseUtil.logMessage(((String) (null)), 3, stringbuilder.toString());
	//   42   89:aconst_null     
	//   43   90:iconst_3        
	//   44   91:aload           4
	//   45   93:invokevirtual   #229 <Method String StringBuilder.toString()>
	//   46   96:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
			}
			mTestMode = attributeset.getAttributeBooleanValue(((String) (obj)), "isTestMode", false);
	//   47   99:aload_0         
	//   48  100:aload_1         
	//   49  101:aload_3         
	//   50  102:ldc2            #543 <String "isTestMode">
	//   51  105:iconst_0        
	//   52  106:invokeinterface #549 <Method boolean AttributeSet.getAttributeBooleanValue(String, String, boolean)>
	//   53  111:putfield        #107 <Field boolean mTestMode>
			mTextColor = attributeset.getAttributeIntValue(((String) (obj)), "textColor", -1);
	//   54  114:aload_0         
	//   55  115:aload_1         
	//   56  116:aload_3         
	//   57  117:ldc2            #551 <String "textColor">
	//   58  120:iconst_m1       
	//   59  121:invokeinterface #555 <Method int AttributeSet.getAttributeIntValue(String, String, int)>
	//   60  126:putfield        #101 <Field int mTextColor>
			mBackgroundColor = attributeset.getAttributeIntValue(((String) (obj)), "backgroundColor", 0);
	//   61  129:aload_0         
	//   62  130:aload_1         
	//   63  131:aload_3         
	//   64  132:ldc2            #557 <String "backgroundColor">
	//   65  135:iconst_0        
	//   66  136:invokeinterface #555 <Method int AttributeSet.getAttributeIntValue(String, String, int)>
	//   67  141:putfield        #103 <Field int mBackgroundColor>
			mSecondsToRefreshAd = attributeset.getAttributeIntValue(((String) (obj)), "secondsToRefresh", 45);
	//   68  144:aload_0         
	//   69  145:aload_1         
	//   70  146:aload_3         
	//   71  147:ldc2            #559 <String "secondsToRefresh">
	//   72  150:bipush          45
	//   73  152:invokeinterface #555 <Method int AttributeSet.getAttributeIntValue(String, String, int)>
	//   74  157:putfield        #105 <Field int mSecondsToRefreshAd>
			if(attributeset.getAttributeValue(((String) (obj)), "bannerType") != null)
	//*  75  160:aload_1         
	//*  76  161:aload_3         
	//*  77  162:ldc2            #561 <String "bannerType">
	//*  78  165:invokeinterface #565 <Method String AttributeSet.getAttributeValue(String, String)>
	//*  79  170:ifnull          187
				mBannerType = attributeset.getAttributeValue(((String) (obj)), "bannerType");
	//   80  173:aload_0         
	//   81  174:aload_1         
	//   82  175:aload_3         
	//   83  176:ldc2            #561 <String "bannerType">
	//   84  179:invokeinterface #565 <Method String AttributeSet.getAttributeValue(String, String)>
	//   85  184:putfield        #111 <Field String mBannerType>
			if(attributeset.getAttributeValue(((String) (obj)), "animation") != null)
	//*  86  187:aload_1         
	//*  87  188:aload_3         
	//*  88  189:ldc2            #567 <String "animation">
	//*  89  192:invokeinterface #565 <Method String AttributeSet.getAttributeValue(String, String)>
	//*  90  197:ifnull          214
				mAnimationType = attributeset.getAttributeValue(((String) (obj)), "animation");
	//   91  200:aload_0         
	//   92  201:aload_1         
	//   93  202:aload_3         
	//   94  203:ldc2            #567 <String "animation">
	//   95  206:invokeinterface #565 <Method String AttributeSet.getAttributeValue(String, String)>
	//   96  211:putfield        #115 <Field String mAnimationType>
			mDeliverOnlyText = attributeset.getAttributeBooleanValue(((String) (obj)), "deliverOnlyText", false);
	//   97  214:aload_0         
	//   98  215:aload_1         
	//   99  216:aload_3         
	//  100  217:ldc2            #569 <String "deliverOnlyText">
	//  101  220:iconst_0        
	//  102  221:invokeinterface #549 <Method boolean AttributeSet.getAttributeBooleanValue(String, String, boolean)>
	//  103  226:putfield        #117 <Field boolean mDeliverOnlyText>
			if(!mBannerType.equals("mma") && mDeliverOnlyText)
	//* 104  229:aload_0         
	//* 105  230:getfield        #111 <Field String mBannerType>
	//* 106  233:ldc1            #109 <String "mma">
	//* 107  235:invokevirtual   #376 <Method boolean String.equals(Object)>
	//* 108  238:ifne            261
	//* 109  241:aload_0         
	//* 110  242:getfield        #117 <Field boolean mDeliverOnlyText>
	//* 111  245:ifeq            261
			{
				MadvertiseUtil.logMessage(((String) (null)), 3, "Only banners in mma-format can show text. Setting deliferOnlyText to false.");
	//  112  248:aconst_null     
	//  113  249:iconst_3        
	//  114  250:ldc2            #571 <String "Only banners in mma-format can show text. Setting deliferOnlyText to false.">
	//  115  253:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
				mDeliverOnlyText = false;
	//  116  256:aload_0         
	//  117  257:iconst_0        
	//  118  258:putfield        #117 <Field boolean mDeliverOnlyText>
			}
			mTextSize = attributeset.getAttributeIntValue(((String) (obj)), "textSize", 18);
	//  119  261:aload_0         
	//  120  262:aload_1         
	//  121  263:aload_3         
	//  122  264:ldc2            #573 <String "textSize">
	//  123  267:bipush          18
	//  124  269:invokeinterface #555 <Method int AttributeSet.getAttributeIntValue(String, String, int)>
	//  125  274:putfield        #119 <Field int mTextSize>
			int i = mTextSize;
	//  126  277:aload_0         
	//  127  278:getfield        #119 <Field int mTextSize>
	//  128  281:istore_2        
			if(i > 20)
	//* 129  282:iload_2         
	//* 130  283:bipush          20
	//* 131  285:icmple          305
			{
				MadvertiseUtil.logMessage(((String) (null)), 3, "The text size must be set to 20 at maximum.");
	//  132  288:aconst_null     
	//  133  289:iconst_3        
	//  134  290:ldc2            #575 <String "The text size must be set to 20 at maximum.">
	//  135  293:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
				mTextSize = 20;
	//  136  296:aload_0         
	//  137  297:bipush          20
	//  138  299:putfield        #119 <Field int mTextSize>
			} else
	//* 139  302:goto            325
			if(i < 10)
	//* 140  305:iload_2         
	//* 141  306:bipush          10
	//* 142  308:icmpge          325
			{
				MadvertiseUtil.logMessage(((String) (null)), 3, "The text size must be set to 10 at minimum.");
	//  143  311:aconst_null     
	//  144  312:iconst_3        
	//  145  313:ldc2            #577 <String "The text size must be set to 10 at minimum.">
	//  146  316:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
				mTextSize = 10;
	//  147  319:aload_0         
	//  148  320:bipush          10
	//  149  322:putfield        #119 <Field int mTextSize>
			}
			mIsMraid = attributeset.getAttributeBooleanValue(((String) (obj)), "mraid", true);
	//  150  325:aload_0         
	//  151  326:aload_1         
	//  152  327:aload_3         
	//  153  328:ldc2            #579 <String "mraid">
	//  154  331:iconst_1        
	//  155  332:invokeinterface #549 <Method boolean AttributeSet.getAttributeBooleanValue(String, String, boolean)>
	//  156  337:putfield        #336 <Field boolean mIsMraid>
			attributeset = ((AttributeSet) (attributeset.getAttributeValue(((String) (obj)), "placement_type")));
	//  157  340:aload_1         
	//  158  341:aload_3         
	//  159  342:ldc2            #581 <String "placement_type">
	//  160  345:invokeinterface #565 <Method String AttributeSet.getAttributeValue(String, String)>
	//  161  350:astore_1        
			if(attributeset != null && ((String) (attributeset)).equalsIgnoreCase("inline"))
	//* 162  351:aload_1         
	//* 163  352:ifnull          373
	//* 164  355:aload_1         
	//* 165  356:ldc2            #583 <String "inline">
	//* 166  359:invokevirtual   #587 <Method boolean String.equalsIgnoreCase(String)>
	//* 167  362:ifeq            373
				mPlacementType = 0;
	//  168  365:aload_0         
	//  169  366:iconst_0        
	//  170  367:putfield        #155 <Field int mPlacementType>
			else
	//* 171  370:goto            403
			if(attributeset != null && ((String) (attributeset)).equalsIgnoreCase("interstitial"))
	//* 172  373:aload_1         
	//* 173  374:ifnull          403
	//* 174  377:aload_1         
	//* 175  378:ldc2            #589 <String "interstitial">
	//* 176  381:invokevirtual   #587 <Method boolean String.equalsIgnoreCase(String)>
	//* 177  384:ifeq            403
				mPlacementType = 1;
	//  178  387:aload_0         
	//  179  388:iconst_1        
	//  180  389:putfield        #155 <Field int mPlacementType>
		} else
	//* 181  392:goto            403
		{
			MadvertiseUtil.logMessage(((String) (null)), 3, "AttributeSet is null. Using default parameters");
	//  182  395:aconst_null     
	//  183  396:iconst_3        
	//  184  397:ldc2            #591 <String "AttributeSet is null. Using default parameters">
	//  185  400:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		}
		int j = mSecondsToRefreshAd;
	//  186  403:aload_0         
	//  187  404:getfield        #105 <Field int mSecondsToRefreshAd>
	//  188  407:istore_2        
		if(j != 0 && j < 30)
	//* 189  408:iload_2         
	//* 190  409:ifeq            432
	//* 191  412:iload_2         
	//* 192  413:bipush          30
	//* 193  415:icmpge          432
		{
			mSecondsToRefreshAd = 45;
	//  194  418:aload_0         
	//  195  419:bipush          45
	//  196  421:putfield        #105 <Field int mSecondsToRefreshAd>
			MadvertiseUtil.logMessage(((String) (null)), 3, "Refresh intervall must be higher than 60");
	//  197  424:aconst_null     
	//  198  425:iconst_3        
	//  199  426:ldc2            #593 <String "Refresh intervall must be higher than 60">
	//  200  429:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		}
		calculateBannerDimensions();
	//  201  432:aload_0         
	//  202  433:invokespecial   #315 <Method void calculateBannerDimensions()>
		MadvertiseUtil.logMessage(((String) (null)), 3, "Using following attributes values:");
	//  203  436:aconst_null     
	//  204  437:iconst_3        
	//  205  438:ldc2            #595 <String "Using following attributes values:">
	//  206  441:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  207  444:new             #205 <Class StringBuilder>
	//  208  447:dup             
	//  209  448:invokespecial   #206 <Method void StringBuilder()>
	//  210  451:astore_1        
		((StringBuilder) (attributeset)).append(" testMode = ");
	//  211  452:aload_1         
	//  212  453:ldc2            #597 <String " testMode = ">
	//  213  456:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  214  459:pop             
		((StringBuilder) (attributeset)).append(mTestMode);
	//  215  460:aload_1         
	//  216  461:aload_0         
	//  217  462:getfield        #107 <Field boolean mTestMode>
	//  218  465:invokevirtual   #600 <Method StringBuilder StringBuilder.append(boolean)>
	//  219  468:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  220  469:aconst_null     
	//  221  470:iconst_3        
	//  222  471:aload_1         
	//  223  472:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  224  475:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  225  478:new             #205 <Class StringBuilder>
	//  226  481:dup             
	//  227  482:invokespecial   #206 <Method void StringBuilder()>
	//  228  485:astore_1        
		((StringBuilder) (attributeset)).append(" textColor = ");
	//  229  486:aload_1         
	//  230  487:ldc2            #602 <String " textColor = ">
	//  231  490:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  232  493:pop             
		((StringBuilder) (attributeset)).append(mTextColor);
	//  233  494:aload_1         
	//  234  495:aload_0         
	//  235  496:getfield        #101 <Field int mTextColor>
	//  236  499:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  237  502:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  238  503:aconst_null     
	//  239  504:iconst_3        
	//  240  505:aload_1         
	//  241  506:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  242  509:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  243  512:new             #205 <Class StringBuilder>
	//  244  515:dup             
	//  245  516:invokespecial   #206 <Method void StringBuilder()>
	//  246  519:astore_1        
		((StringBuilder) (attributeset)).append(" backgroundColor = ");
	//  247  520:aload_1         
	//  248  521:ldc2            #604 <String " backgroundColor = ">
	//  249  524:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  250  527:pop             
		((StringBuilder) (attributeset)).append(mBackgroundColor);
	//  251  528:aload_1         
	//  252  529:aload_0         
	//  253  530:getfield        #103 <Field int mBackgroundColor>
	//  254  533:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  255  536:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  256  537:aconst_null     
	//  257  538:iconst_3        
	//  258  539:aload_1         
	//  259  540:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  260  543:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  261  546:new             #205 <Class StringBuilder>
	//  262  549:dup             
	//  263  550:invokespecial   #206 <Method void StringBuilder()>
	//  264  553:astore_1        
		((StringBuilder) (attributeset)).append(" secondsToRefreshAd = ");
	//  265  554:aload_1         
	//  266  555:ldc2            #606 <String " secondsToRefreshAd = ">
	//  267  558:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  268  561:pop             
		((StringBuilder) (attributeset)).append(mSecondsToRefreshAd);
	//  269  562:aload_1         
	//  270  563:aload_0         
	//  271  564:getfield        #105 <Field int mSecondsToRefreshAd>
	//  272  567:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  273  570:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  274  571:aconst_null     
	//  275  572:iconst_3        
	//  276  573:aload_1         
	//  277  574:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  278  577:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  279  580:new             #205 <Class StringBuilder>
	//  280  583:dup             
	//  281  584:invokespecial   #206 <Method void StringBuilder()>
	//  282  587:astore_1        
		((StringBuilder) (attributeset)).append(" bannerType = ");
	//  283  588:aload_1         
	//  284  589:ldc2            #608 <String " bannerType = ">
	//  285  592:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  286  595:pop             
		((StringBuilder) (attributeset)).append(mBannerType);
	//  287  596:aload_1         
	//  288  597:aload_0         
	//  289  598:getfield        #111 <Field String mBannerType>
	//  290  601:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  291  604:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  292  605:aconst_null     
	//  293  606:iconst_3        
	//  294  607:aload_1         
	//  295  608:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  296  611:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  297  614:new             #205 <Class StringBuilder>
	//  298  617:dup             
	//  299  618:invokespecial   #206 <Method void StringBuilder()>
	//  300  621:astore_1        
		((StringBuilder) (attributeset)).append(" animationType = ");
	//  301  622:aload_1         
	//  302  623:ldc2            #610 <String " animationType = ">
	//  303  626:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  304  629:pop             
		((StringBuilder) (attributeset)).append(mAnimationType);
	//  305  630:aload_1         
	//  306  631:aload_0         
	//  307  632:getfield        #115 <Field String mAnimationType>
	//  308  635:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  309  638:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  310  639:aconst_null     
	//  311  640:iconst_3        
	//  312  641:aload_1         
	//  313  642:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  314  645:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  315  648:new             #205 <Class StringBuilder>
	//  316  651:dup             
	//  317  652:invokespecial   #206 <Method void StringBuilder()>
	//  318  655:astore_1        
		((StringBuilder) (attributeset)).append(" deliverOnlyText = ");
	//  319  656:aload_1         
	//  320  657:ldc2            #612 <String " deliverOnlyText = ">
	//  321  660:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  322  663:pop             
		((StringBuilder) (attributeset)).append(mDeliverOnlyText);
	//  323  664:aload_1         
	//  324  665:aload_0         
	//  325  666:getfield        #117 <Field boolean mDeliverOnlyText>
	//  326  669:invokevirtual   #600 <Method StringBuilder StringBuilder.append(boolean)>
	//  327  672:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  328  673:aconst_null     
	//  329  674:iconst_3        
	//  330  675:aload_1         
	//  331  676:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  332  679:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  333  682:new             #205 <Class StringBuilder>
	//  334  685:dup             
	//  335  686:invokespecial   #206 <Method void StringBuilder()>
	//  336  689:astore_1        
		((StringBuilder) (attributeset)).append(" textSize = ");
	//  337  690:aload_1         
	//  338  691:ldc2            #614 <String " textSize = ">
	//  339  694:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  340  697:pop             
		((StringBuilder) (attributeset)).append(mTextSize);
	//  341  698:aload_1         
	//  342  699:aload_0         
	//  343  700:getfield        #119 <Field int mTextSize>
	//  344  703:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  345  706:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  346  707:aconst_null     
	//  347  708:iconst_3        
	//  348  709:aload_1         
	//  349  710:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  350  713:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  351  716:new             #205 <Class StringBuilder>
	//  352  719:dup             
	//  353  720:invokespecial   #206 <Method void StringBuilder()>
	//  354  723:astore_1        
		((StringBuilder) (attributeset)).append(" isMraid = ");
	//  355  724:aload_1         
	//  356  725:ldc2            #616 <String " isMraid = ">
	//  357  728:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  358  731:pop             
		((StringBuilder) (attributeset)).append(mIsMraid);
	//  359  732:aload_1         
	//  360  733:aload_0         
	//  361  734:getfield        #336 <Field boolean mIsMraid>
	//  362  737:invokevirtual   #600 <Method StringBuilder StringBuilder.append(boolean)>
	//  363  740:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  364  741:aconst_null     
	//  365  742:iconst_3        
	//  366  743:aload_1         
	//  367  744:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  368  747:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  369  750:new             #205 <Class StringBuilder>
	//  370  753:dup             
	//  371  754:invokespecial   #206 <Method void StringBuilder()>
	//  372  757:astore_1        
		((StringBuilder) (attributeset)).append(" placementType = ");
	//  373  758:aload_1         
	//  374  759:ldc2            #618 <String " placementType = ">
	//  375  762:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  376  765:pop             
		((StringBuilder) (attributeset)).append(mPlacementType);
	//  377  766:aload_1         
	//  378  767:aload_0         
	//  379  768:getfield        #155 <Field int mPlacementType>
	//  380  771:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  381  774:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  382  775:aconst_null     
	//  383  776:iconst_3        
	//  384  777:aload_1         
	//  385  778:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  386  781:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  387  784:new             #205 <Class StringBuilder>
	//  388  787:dup             
	//  389  788:invokespecial   #206 <Method void StringBuilder()>
	//  390  791:astore_1        
		((StringBuilder) (attributeset)).append(" bannerWidth = ");
	//  391  792:aload_1         
	//  392  793:ldc2            #620 <String " bannerWidth = ">
	//  393  796:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  394  799:pop             
		((StringBuilder) (attributeset)).append(mBannerWidth);
	//  395  800:aload_1         
	//  396  801:aload_0         
	//  397  802:getfield        #123 <Field int mBannerWidth>
	//  398  805:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  399  808:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  400  809:aconst_null     
	//  401  810:iconst_3        
	//  402  811:aload_1         
	//  403  812:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  404  815:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  405  818:new             #205 <Class StringBuilder>
	//  406  821:dup             
	//  407  822:invokespecial   #206 <Method void StringBuilder()>
	//  408  825:astore_1        
		((StringBuilder) (attributeset)).append(" bannerHeight = ");
	//  409  826:aload_1         
	//  410  827:ldc2            #622 <String " bannerHeight = ">
	//  411  830:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  412  833:pop             
		((StringBuilder) (attributeset)).append(mBannerHeight);
	//  413  834:aload_1         
	//  414  835:aload_0         
	//  415  836:getfield        #121 <Field int mBannerHeight>
	//  416  839:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  417  842:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  418  843:aconst_null     
	//  419  844:iconst_3        
	//  420  845:aload_1         
	//  421  846:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  422  849:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  423  852:new             #205 <Class StringBuilder>
	//  424  855:dup             
	//  425  856:invokespecial   #206 <Method void StringBuilder()>
	//  426  859:astore_1        
		((StringBuilder) (attributeset)).append(" bannerWidthDp = ");
	//  427  860:aload_1         
	//  428  861:ldc2            #624 <String " bannerWidthDp = ">
	//  429  864:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  430  867:pop             
		((StringBuilder) (attributeset)).append(mBannerWidthDp);
	//  431  868:aload_1         
	//  432  869:aload_0         
	//  433  870:getfield        #127 <Field int mBannerWidthDp>
	//  434  873:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  435  876:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  436  877:aconst_null     
	//  437  878:iconst_3        
	//  438  879:aload_1         
	//  439  880:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  440  883:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  441  886:new             #205 <Class StringBuilder>
	//  442  889:dup             
	//  443  890:invokespecial   #206 <Method void StringBuilder()>
	//  444  893:astore_1        
		((StringBuilder) (attributeset)).append(" bannerHeightDp = ");
	//  445  894:aload_1         
	//  446  895:ldc2            #626 <String " bannerHeightDp = ">
	//  447  898:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  448  901:pop             
		((StringBuilder) (attributeset)).append(mBannerHeightDp);
	//  449  902:aload_1         
	//  450  903:aload_0         
	//  451  904:getfield        #125 <Field int mBannerHeightDp>
	//  452  907:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//  453  910:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (attributeset)).toString());
	//  454  911:aconst_null     
	//  455  912:iconst_3        
	//  456  913:aload_1         
	//  457  914:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  458  917:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
	//  459  920:return          
	}

	private void notifyListener(boolean flag)
	{
		MadvertiseViewCallbackListener madvertiseviewcallbacklistener = mCallbackListener;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//    2    4:astore_2        
		if(madvertiseviewcallbacklistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
		{
			madvertiseviewcallbacklistener.onLoaded(flag, this);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:aload_0         
	//    8   12:invokeinterface #631 <Method void MadvertiseView$MadvertiseViewCallbackListener.onLoaded(boolean, MadvertiseView)>
			return;
	//    9   17:return          
		} else
		{
			MadvertiseUtil.logMessage(((String) (null)), 3, "Callback Listener not set");
	//   10   18:aconst_null     
	//   11   19:iconst_3        
	//   12   20:ldc2            #633 <String "Callback Listener not set">
	//   13   23:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
			return;
	//   14   26:return          
		}
	}

	private void onViewCallback(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!flag)
			break MISSING_BLOCK_LABEL_60;
	//    2    2:iload_1         
	//    3    3:ifeq            60
		if(mAdTimer == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #135 <Field Timer mAdTimer>
	//*   6   10:ifnonnull       91
		{
			mAdTimer = new Timer();
	//    7   13:aload_0         
	//    8   14:new             #636 <Class Timer>
	//    9   17:dup             
	//   10   18:invokespecial   #637 <Method void Timer()>
	//   11   21:putfield        #135 <Field Timer mAdTimer>
			mAdTimer.schedule(((TimerTask) (new TimerTask() {

				public void run()
				{
					MadvertiseUtil.logMessage(((String) (null)), 3, "Refreshing ad ...");
				//    0    0:aconst_null     
				//    1    1:iconst_3        
				//    2    2:ldc1            #22  <String "Refreshing ad ...">
				//    3    4:invokestatic    #28  <Method void MadvertiseUtil.logMessage(String, int, String)>
					requestNewAd(true);
				//    4    7:aload_0         
				//    5    8:getfield        #15  <Field MadvertiseView this$0>
				//    6   11:iconst_1        
				//    7   12:invokestatic    #32  <Method void MadvertiseView.access$1500(MadvertiseView, boolean)>
				//    8   15:return          
				}

				final MadvertiseView this$0;

			
			{
				this$0 = MadvertiseView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MadvertiseView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void TimerTask()>
			//    5    9:return          
			}
			}
)), (long)mSecondsToRefreshAd * 1000L, 1000L * (long)mSecondsToRefreshAd);
	//   12   24:aload_0         
	//   13   25:getfield        #135 <Field Timer mAdTimer>
	//   14   28:new             #14  <Class MadvertiseView$5>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #638 <Method void MadvertiseView$5(MadvertiseView)>
	//   18   36:aload_0         
	//   19   37:getfield        #105 <Field int mSecondsToRefreshAd>
	//   20   40:i2l             
	//   21   41:ldc2w           #639 <Long 1000L>
	//   22   44:lmul            
	//   23   45:ldc2w           #639 <Long 1000L>
	//   24   48:aload_0         
	//   25   49:getfield        #105 <Field int mSecondsToRefreshAd>
	//   26   52:i2l             
	//   27   53:lmul            
	//   28   54:invokevirtual   #644 <Method void Timer.schedule(TimerTask, long, long)>
		}
		break MISSING_BLOCK_LABEL_91;
	//   29   57:goto            91
		if(mAdTimer != null)
	//*  30   60:aload_0         
	//*  31   61:getfield        #135 <Field Timer mAdTimer>
	//*  32   64:ifnull          91
		{
			MadvertiseUtil.logMessage(((String) (null)), 3, "Stopping veeplay_refresh timer ...");
	//   33   67:aconst_null     
	//   34   68:iconst_3        
	//   35   69:ldc2            #646 <String "Stopping veeplay_refresh timer ...">
	//   36   72:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
			mAdTimer.cancel();
	//   37   75:aload_0         
	//   38   76:getfield        #135 <Field Timer mAdTimer>
	//   39   79:invokevirtual   #649 <Method void Timer.cancel()>
			mAdTimer = null;
	//   40   82:aload_0         
	//   41   83:aconst_null     
	//   42   84:putfield        #135 <Field Timer mAdTimer>
			stopRequestThread();
	//   43   87:aload_0         
	//   44   88:invokevirtual   #652 <Method void stopRequestThread()>
		}
		this;
	//   45   91:aload_0         
		JVM INSTR monitorexit ;
	//   46   92:monitorexit     
		return;
	//   47   93:return          
		Exception exception;
		exception;
	//   48   94:astore_2        
		this;
	//   49   95:aload_0         
		JVM INSTR monitorexit ;
	//   50   96:monitorexit     
		throw exception;
	//   51   97:aload_2         
	//   52   98:athrow          
	}

	private void refreshView()
	{
		setBackgroundDrawable(mInitialBackground);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #142 <Field Drawable mInitialBackground>
	//    3    5:invokevirtual   #656 <Method void setBackgroundDrawable(Drawable)>
		MadvertiseAd madvertisead = mCurrentAd;
	//    4    8:aload_0         
	//    5    9:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//    6   12:astore_1        
		if(madvertisead != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          70
		{
			if(madvertisead.hasBanner() && !mDeliverOnlyText)
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #659 <Method boolean MadvertiseAd.hasBanner()>
	//*  11   21:ifeq            55
	//*  12   24:aload_0         
	//*  13   25:getfield        #117 <Field boolean mDeliverOnlyText>
	//*  14   28:ifne            55
			{
				if(mCurrentAd.isMraid())
	//*  15   31:aload_0         
	//*  16   32:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//*  17   35:invokevirtual   #400 <Method boolean MadvertiseAd.isMraid()>
	//*  18   38:ifeq            48
					showMraidView();
	//   19   41:aload_0         
	//   20   42:invokespecial   #662 <Method void showMraidView()>
				else
	//*  21   45:goto            64
					showImageView();
	//   22   48:aload_0         
	//   23   49:invokespecial   #665 <Method void showImageView()>
			} else
	//*  24   52:goto            64
			{
				showTextView();
	//   25   55:aload_0         
	//   26   56:invokespecial   #668 <Method void showTextView()>
				setVisibility(0);
	//   27   59:aload_0         
	//   28   60:iconst_0        
	//   29   61:invokevirtual   #170 <Method void setVisibility(int)>
			}
			notifyListener(true);
	//   30   64:aload_0         
	//   31   65:iconst_1        
	//   32   66:invokespecial   #670 <Method void notifyListener(boolean)>
			return;
	//   33   69:return          
		} else
		{
			removeAllViews();
	//   34   70:aload_0         
	//   35   71:invokevirtual   #673 <Method void removeAllViews()>
			notifyListener(false);
	//   36   74:aload_0         
	//   37   75:iconst_0        
	//   38   76:invokespecial   #670 <Method void notifyListener(boolean)>
			setVisibility(8);
	//   39   79:aload_0         
	//   40   80:bipush          8
	//   41   82:invokevirtual   #170 <Method void setVisibility(int)>
			return;
	//   42   85:return          
		}
	}

	private void removeOldViews()
	{
		for(Iterator iterator = mOldViews.iterator(); iterator.hasNext(); removeView((View)iterator.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field List mOldViews>
	//    2    4:invokeinterface #677 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #682 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            35
	//    7   19:aload_0         
	//    8   20:aload_1         
	//    9   21:invokeinterface #686 <Method Object Iterator.next()>
	//   10   26:checkcast       #356 <Class View>
	//   11   29:invokevirtual   #690 <Method void removeView(View)>
	//*  12   32:goto            10
	//   13   35:return          
	}

	private void requestNewAd(boolean flag)
	{
		if(!mFetchAdsEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field boolean mFetchAdsEnabled>
	//*   2    4:ifne            16
		{
			MadvertiseUtil.logMessage(((String) (null)), 3, "Fetching ads is disabled");
	//    3    7:aconst_null     
	//    4    8:iconst_3        
	//    5    9:ldc2            #692 <String "Fetching ads is disabled">
	//    6   12:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
			return;
	//    7   15:return          
		} else
		{
			MadvertiseUtil.logMessage(((String) (null)), 3, "Trying to fetch a new ad");
	//    8   16:aconst_null     
	//    9   17:iconst_3        
	//   10   18:ldc2            #694 <String "Trying to fetch a new ad">
	//   11   21:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
			mRequestThread = new Thread(new Runnable() {

				public void run()
				{
					Object obj = ((Object) (MadvertiseUtil.getToken(getContext().getApplicationContext(), mCallbackListener)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MadvertiseView this$0>
				//    2    4:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//    3    7:invokevirtual   #41  <Method Context Context.getApplicationContext()>
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field MadvertiseView this$0>
				//    6   14:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//    7   17:invokestatic    #51  <Method String MadvertiseUtil.getToken(Context, MadvertiseView$MadvertiseViewCallbackListener)>
				//    8   20:astore_2        
					Object obj1 = null;
				//    9   21:aconst_null     
				//   10   22:astore_3        
					if(obj == null)
				//*  11   23:aload_2         
				//*  12   24:ifnonnull       40
					{
						obj = "";
				//   13   27:ldc1            #53  <String "">
				//   14   29:astore_2        
						MadvertiseUtil.logMessage(((String) (null)), 3, "Cannot show ads, since the appID ist null");
				//   15   30:aconst_null     
				//   16   31:iconst_3        
				//   17   32:ldc1            #55  <String "Cannot show ads, since the appID ist null">
				//   18   34:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
					} else
				//*  19   37:goto            74
					{
						StringBuilder stringbuilder = new StringBuilder();
				//   20   40:new             #61  <Class StringBuilder>
				//   21   43:dup             
				//   22   44:invokespecial   #62  <Method void StringBuilder()>
				//   23   47:astore          4
						stringbuilder.append("appID = ");
				//   24   49:aload           4
				//   25   51:ldc1            #64  <String "appID = ">
				//   26   53:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//   27   56:pop             
						stringbuilder.append(((String) (obj)));
				//   28   57:aload           4
				//   29   59:aload_2         
				//   30   60:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//   31   63:pop             
						MadvertiseUtil.logMessage(((String) (null)), 3, stringbuilder.toString());
				//   32   64:aconst_null     
				//   33   65:iconst_3        
				//   34   66:aload           4
				//   35   68:invokevirtual   #72  <Method String StringBuilder.toString()>
				//   36   71:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
					}
					Object obj2 = ((Object) (new StringBuilder()));
				//   37   74:new             #61  <Class StringBuilder>
				//   38   77:dup             
				//   39   78:invokespecial   #62  <Method void StringBuilder()>
				//   40   81:astore          4
					((StringBuilder) (obj2)).append("http://ad.madvertise.de/site/");
				//   41   83:aload           4
				//   42   85:ldc1            #74  <String "http://ad.madvertise.de/site/">
				//   43   87:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//   44   90:pop             
					((StringBuilder) (obj2)).append(((String) (obj)));
				//   45   91:aload           4
				//   46   93:aload_2         
				//   47   94:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//   48   97:pop             
					obj2 = ((Object) (new HttpPost(((StringBuilder) (obj2)).toString())));
				//   49   98:new             #76  <Class HttpPost>
				//   50  101:dup             
				//   51  102:aload           4
				//   52  104:invokevirtual   #72  <Method String StringBuilder.toString()>
				//   53  107:invokespecial   #79  <Method void HttpPost(String)>
				//   54  110:astore          4
					((HttpPost) (obj2)).setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
				//   55  112:aload           4
				//   56  114:ldc1            #81  <String "Content-Type">
				//   57  116:ldc1            #83  <String "application/x-www-form-urlencoded; charset=utf-8">
				//   58  118:invokevirtual   #87  <Method void HttpPost.setHeader(String, String)>
					((HttpPost) (obj2)).addHeader("Accept", "application/vnd.madad+json; version=3");
				//   59  121:aload           4
				//   60  123:ldc1            #89  <String "Accept">
				//   61  125:ldc1            #91  <String "application/vnd.madad+json; version=3">
				//   62  127:invokevirtual   #94  <Method void HttpPost.addHeader(String, String)>
					Object obj4 = ((Object) (new ArrayList()));
				//   63  130:new             #96  <Class ArrayList>
				//   64  133:dup             
				//   65  134:invokespecial   #97  <Method void ArrayList()>
				//   66  137:astore          5
					((List) (obj4)).add(((Object) (new BasicNameValuePair("ua", MadvertiseUtil.getUA()))));
				//   67  139:aload           5
				//   68  141:new             #99  <Class BasicNameValuePair>
				//   69  144:dup             
				//   70  145:ldc1            #101 <String "ua">
				//   71  147:invokestatic    #104 <Method String MadvertiseUtil.getUA()>
				//   72  150:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//   73  153:invokeinterface #112 <Method boolean List.add(Object)>
				//   74  158:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("app", "true"))));
				//   75  159:aload           5
				//   76  161:new             #99  <Class BasicNameValuePair>
				//   77  164:dup             
				//   78  165:ldc1            #114 <String "app">
				//   79  167:ldc1            #116 <String "true">
				//   80  169:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//   81  172:invokeinterface #112 <Method boolean List.add(Object)>
				//   82  177:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("debug", Boolean.toString(mTestMode)))));
				//   83  178:aload           5
				//   84  180:new             #99  <Class BasicNameValuePair>
				//   85  183:dup             
				//   86  184:ldc1            #118 <String "debug">
				//   87  186:aload_0         
				//   88  187:getfield        #17  <Field MadvertiseView this$0>
				//   89  190:invokestatic    #122 <Method boolean MadvertiseView.access$300(MadvertiseView)>
				//   90  193:invokestatic    #127 <Method String Boolean.toString(boolean)>
				//   91  196:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//   92  199:invokeinterface #112 <Method boolean List.add(Object)>
				//   93  204:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("ip", MadvertiseUtil.getLocalIpAddress(mCallbackListener)))));
				//   94  205:aload           5
				//   95  207:new             #99  <Class BasicNameValuePair>
				//   96  210:dup             
				//   97  211:ldc1            #129 <String "ip">
				//   98  213:aload_0         
				//   99  214:getfield        #17  <Field MadvertiseView this$0>
				//  100  217:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//  101  220:invokestatic    #133 <Method String MadvertiseUtil.getLocalIpAddress(MadvertiseView$MadvertiseViewCallbackListener)>
				//  102  223:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  103  226:invokeinterface #112 <Method boolean List.add(Object)>
				//  104  231:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("format", "json"))));
				//  105  232:aload           5
				//  106  234:new             #99  <Class BasicNameValuePair>
				//  107  237:dup             
				//  108  238:ldc1            #135 <String "format">
				//  109  240:ldc1            #137 <String "json">
				//  110  242:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  111  245:invokeinterface #112 <Method boolean List.add(Object)>
				//  112  250:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("requester", "android_sdk"))));
				//  113  251:aload           5
				//  114  253:new             #99  <Class BasicNameValuePair>
				//  115  256:dup             
				//  116  257:ldc1            #139 <String "requester">
				//  117  259:ldc1            #141 <String "android_sdk">
				//  118  261:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  119  264:invokeinterface #112 <Method boolean List.add(Object)>
				//  120  269:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("version", "3.1.3"))));
				//  121  270:aload           5
				//  122  272:new             #99  <Class BasicNameValuePair>
				//  123  275:dup             
				//  124  276:ldc1            #143 <String "version">
				//  125  278:ldc1            #145 <String "3.1.3">
				//  126  280:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  127  283:invokeinterface #112 <Method boolean List.add(Object)>
				//  128  288:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("banner_type", mBannerType))));
				//  129  289:aload           5
				//  130  291:new             #99  <Class BasicNameValuePair>
				//  131  294:dup             
				//  132  295:ldc1            #147 <String "banner_type">
				//  133  297:aload_0         
				//  134  298:getfield        #17  <Field MadvertiseView this$0>
				//  135  301:invokestatic    #151 <Method String MadvertiseView.access$400(MadvertiseView)>
				//  136  304:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  137  307:invokeinterface #112 <Method boolean List.add(Object)>
				//  138  312:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("deliver_only_text", Boolean.toString(mDeliverOnlyText)))));
				//  139  313:aload           5
				//  140  315:new             #99  <Class BasicNameValuePair>
				//  141  318:dup             
				//  142  319:ldc1            #153 <String "deliver_only_text">
				//  143  321:aload_0         
				//  144  322:getfield        #17  <Field MadvertiseView this$0>
				//  145  325:invokestatic    #156 <Method boolean MadvertiseView.access$500(MadvertiseView)>
				//  146  328:invokestatic    #127 <Method String Boolean.toString(boolean)>
				//  147  331:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  148  334:invokeinterface #112 <Method boolean List.add(Object)>
				//  149  339:pop             
					if(MadvertiseView.sAge != null && !MadvertiseView.sAge.equals(""))
				//* 150  340:invokestatic    #159 <Method String MadvertiseView.access$600()>
				//* 151  343:ifnull          377
				//* 152  346:invokestatic    #159 <Method String MadvertiseView.access$600()>
				//* 153  349:ldc1            #53  <String "">
				//* 154  351:invokevirtual   #164 <Method boolean String.equals(Object)>
				//* 155  354:ifne            377
						((List) (obj4)).add(((Object) (new BasicNameValuePair("age", MadvertiseView.sAge))));
				//  156  357:aload           5
				//  157  359:new             #99  <Class BasicNameValuePair>
				//  158  362:dup             
				//  159  363:ldc1            #166 <String "age">
				//  160  365:invokestatic    #159 <Method String MadvertiseView.access$600()>
				//  161  368:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  162  371:invokeinterface #112 <Method boolean List.add(Object)>
				//  163  376:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("mraid", Boolean.toString(mIsMraid)))));
				//  164  377:aload           5
				//  165  379:new             #99  <Class BasicNameValuePair>
				//  166  382:dup             
				//  167  383:ldc1            #168 <String "mraid">
				//  168  385:aload_0         
				//  169  386:getfield        #17  <Field MadvertiseView this$0>
				//  170  389:invokestatic    #171 <Method boolean MadvertiseView.access$700(MadvertiseView)>
				//  171  392:invokestatic    #127 <Method String Boolean.toString(boolean)>
				//  172  395:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  173  398:invokeinterface #112 <Method boolean List.add(Object)>
				//  174  403:pop             
					if(MadvertiseView.sGender != null && !MadvertiseView.sGender.equals(""))
				//* 175  404:invokestatic    #174 <Method String MadvertiseView.access$800()>
				//* 176  407:ifnull          441
				//* 177  410:invokestatic    #174 <Method String MadvertiseView.access$800()>
				//* 178  413:ldc1            #53  <String "">
				//* 179  415:invokevirtual   #164 <Method boolean String.equals(Object)>
				//* 180  418:ifne            441
						((List) (obj4)).add(((Object) (new BasicNameValuePair("gender", MadvertiseView.sGender))));
				//  181  421:aload           5
				//  182  423:new             #99  <Class BasicNameValuePair>
				//  183  426:dup             
				//  184  427:ldc1            #176 <String "gender">
				//  185  429:invokestatic    #174 <Method String MadvertiseView.access$800()>
				//  186  432:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  187  435:invokeinterface #112 <Method boolean List.add(Object)>
				//  188  440:pop             
					Display display = ((WindowManager)getContext().getApplicationContext().getSystemService("window")).getDefaultDisplay();
				//  189  441:aload_0         
				//  190  442:getfield        #17  <Field MadvertiseView this$0>
				//  191  445:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//  192  448:invokevirtual   #41  <Method Context Context.getApplicationContext()>
				//  193  451:ldc1            #178 <String "window">
				//  194  453:invokevirtual   #182 <Method Object Context.getSystemService(String)>
				//  195  456:checkcast       #184 <Class WindowManager>
				//  196  459:invokeinterface #188 <Method Display WindowManager.getDefaultDisplay()>
				//  197  464:astore          6
					if(display.getWidth() > display.getHeight())
				//* 198  466:aload           6
				//* 199  468:invokevirtual   #194 <Method int Display.getWidth()>
				//* 200  471:aload           6
				//* 201  473:invokevirtual   #197 <Method int Display.getHeight()>
				//* 202  476:icmple          485
						obj = "landscape";
				//  203  479:ldc1            #199 <String "landscape">
				//  204  481:astore_2        
					else
				//* 205  482:goto            488
						obj = "portrait";
				//  206  485:ldc1            #201 <String "portrait">
				//  207  487:astore_2        
					((List) (obj4)).add(((Object) (new BasicNameValuePair("device_height", Integer.toString(display.getHeight())))));
				//  208  488:aload           5
				//  209  490:new             #99  <Class BasicNameValuePair>
				//  210  493:dup             
				//  211  494:ldc1            #203 <String "device_height">
				//  212  496:aload           6
				//  213  498:invokevirtual   #197 <Method int Display.getHeight()>
				//  214  501:invokestatic    #208 <Method String Integer.toString(int)>
				//  215  504:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  216  507:invokeinterface #112 <Method boolean List.add(Object)>
				//  217  512:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("device_width", Integer.toString(display.getWidth())))));
				//  218  513:aload           5
				//  219  515:new             #99  <Class BasicNameValuePair>
				//  220  518:dup             
				//  221  519:ldc1            #210 <String "device_width">
				//  222  521:aload           6
				//  223  523:invokevirtual   #194 <Method int Display.getWidth()>
				//  224  526:invokestatic    #208 <Method String Integer.toString(int)>
				//  225  529:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  226  532:invokeinterface #112 <Method boolean List.add(Object)>
				//  227  537:pop             
					if(mParentWidth == 0 && mParentHeight == 0)
				//* 228  538:aload_0         
				//* 229  539:getfield        #17  <Field MadvertiseView this$0>
				//* 230  542:invokestatic    #214 <Method int MadvertiseView.access$900(MadvertiseView)>
				//* 231  545:ifne            584
				//* 232  548:aload_0         
				//* 233  549:getfield        #17  <Field MadvertiseView this$0>
				//* 234  552:invokestatic    #217 <Method int MadvertiseView.access$1000(MadvertiseView)>
				//* 235  555:ifne            584
					{
						mParentWidth = display.getWidth();
				//  236  558:aload_0         
				//  237  559:getfield        #17  <Field MadvertiseView this$0>
				//  238  562:aload           6
				//  239  564:invokevirtual   #194 <Method int Display.getWidth()>
				//  240  567:invokestatic    #221 <Method int MadvertiseView.access$902(MadvertiseView, int)>
				//  241  570:pop             
						mParentHeight = display.getHeight();
				//  242  571:aload_0         
				//  243  572:getfield        #17  <Field MadvertiseView this$0>
				//  244  575:aload           6
				//  245  577:invokevirtual   #197 <Method int Display.getHeight()>
				//  246  580:invokestatic    #224 <Method int MadvertiseView.access$1002(MadvertiseView, int)>
				//  247  583:pop             
					}
					((List) (obj4)).add(((Object) (new BasicNameValuePair("parent_height", Integer.toString(mParentHeight)))));
				//  248  584:aload           5
				//  249  586:new             #99  <Class BasicNameValuePair>
				//  250  589:dup             
				//  251  590:ldc1            #226 <String "parent_height">
				//  252  592:aload_0         
				//  253  593:getfield        #17  <Field MadvertiseView this$0>
				//  254  596:invokestatic    #217 <Method int MadvertiseView.access$1000(MadvertiseView)>
				//  255  599:invokestatic    #208 <Method String Integer.toString(int)>
				//  256  602:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  257  605:invokeinterface #112 <Method boolean List.add(Object)>
				//  258  610:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("parent_width", Integer.toString(mParentWidth)))));
				//  259  611:aload           5
				//  260  613:new             #99  <Class BasicNameValuePair>
				//  261  616:dup             
				//  262  617:ldc1            #228 <String "parent_width">
				//  263  619:aload_0         
				//  264  620:getfield        #17  <Field MadvertiseView this$0>
				//  265  623:invokestatic    #214 <Method int MadvertiseView.access$900(MadvertiseView)>
				//  266  626:invokestatic    #208 <Method String Integer.toString(int)>
				//  267  629:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  268  632:invokeinterface #112 <Method boolean List.add(Object)>
				//  269  637:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("device_orientation", ((String) (obj))))));
				//  270  638:aload           5
				//  271  640:new             #99  <Class BasicNameValuePair>
				//  272  643:dup             
				//  273  644:ldc1            #230 <String "device_orientation">
				//  274  646:aload_2         
				//  275  647:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  276  650:invokeinterface #112 <Method boolean List.add(Object)>
				//  277  655:pop             
					MadvertiseUtil.refreshCoordinates(getContext().getApplicationContext());
				//  278  656:aload_0         
				//  279  657:getfield        #17  <Field MadvertiseView this$0>
				//  280  660:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//  281  663:invokevirtual   #41  <Method Context Context.getApplicationContext()>
				//  282  666:invokestatic    #234 <Method void MadvertiseUtil.refreshCoordinates(Context)>
					if(MadvertiseUtil.getLocation() != null)
				//* 283  669:invokestatic    #238 <Method Location MadvertiseUtil.getLocation()>
				//* 284  672:ifnull          727
					{
						((List) (obj4)).add(((Object) (new BasicNameValuePair("lat", Double.toString(MadvertiseUtil.getLocation().getLatitude())))));
				//  285  675:aload           5
				//  286  677:new             #99  <Class BasicNameValuePair>
				//  287  680:dup             
				//  288  681:ldc1            #240 <String "lat">
				//  289  683:invokestatic    #238 <Method Location MadvertiseUtil.getLocation()>
				//  290  686:invokevirtual   #246 <Method double Location.getLatitude()>
				//  291  689:invokestatic    #251 <Method String Double.toString(double)>
				//  292  692:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  293  695:invokeinterface #112 <Method boolean List.add(Object)>
				//  294  700:pop             
						((List) (obj4)).add(((Object) (new BasicNameValuePair("lng", Double.toString(MadvertiseUtil.getLocation().getLongitude())))));
				//  295  701:aload           5
				//  296  703:new             #99  <Class BasicNameValuePair>
				//  297  706:dup             
				//  298  707:ldc1            #253 <String "lng">
				//  299  709:invokestatic    #238 <Method Location MadvertiseUtil.getLocation()>
				//  300  712:invokevirtual   #256 <Method double Location.getLongitude()>
				//  301  715:invokestatic    #251 <Method String Double.toString(double)>
				//  302  718:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  303  721:invokeinterface #112 <Method boolean List.add(Object)>
				//  304  726:pop             
					}
					((List) (obj4)).add(((Object) (new BasicNameValuePair("app_name", MadvertiseUtil.getApplicationName(getContext().getApplicationContext())))));
				//  305  727:aload           5
				//  306  729:new             #99  <Class BasicNameValuePair>
				//  307  732:dup             
				//  308  733:ldc2            #258 <String "app_name">
				//  309  736:aload_0         
				//  310  737:getfield        #17  <Field MadvertiseView this$0>
				//  311  740:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//  312  743:invokevirtual   #41  <Method Context Context.getApplicationContext()>
				//  313  746:invokestatic    #262 <Method String MadvertiseUtil.getApplicationName(Context)>
				//  314  749:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  315  752:invokeinterface #112 <Method boolean List.add(Object)>
				//  316  757:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("app_version", MadvertiseUtil.getApplicationVersion(getContext().getApplicationContext())))));
				//  317  758:aload           5
				//  318  760:new             #99  <Class BasicNameValuePair>
				//  319  763:dup             
				//  320  764:ldc2            #264 <String "app_version">
				//  321  767:aload_0         
				//  322  768:getfield        #17  <Field MadvertiseView this$0>
				//  323  771:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//  324  774:invokevirtual   #41  <Method Context Context.getApplicationContext()>
				//  325  777:invokestatic    #267 <Method String MadvertiseUtil.getApplicationVersion(Context)>
				//  326  780:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  327  783:invokeinterface #112 <Method boolean List.add(Object)>
				//  328  788:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("udid_md5", MadvertiseUtil.getHashedAndroidID(getContext(), MadvertiseUtil.HashType.MD5)))));
				//  329  789:aload           5
				//  330  791:new             #99  <Class BasicNameValuePair>
				//  331  794:dup             
				//  332  795:ldc2            #269 <String "udid_md5">
				//  333  798:aload_0         
				//  334  799:getfield        #17  <Field MadvertiseView this$0>
				//  335  802:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//  336  805:getstatic       #275 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.MD5>
				//  337  808:invokestatic    #279 <Method String MadvertiseUtil.getHashedAndroidID(Context, MadvertiseUtil$HashType)>
				//  338  811:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  339  814:invokeinterface #112 <Method boolean List.add(Object)>
				//  340  819:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("udid_sha1", MadvertiseUtil.getHashedAndroidID(getContext(), MadvertiseUtil.HashType.SHA1)))));
				//  341  820:aload           5
				//  342  822:new             #99  <Class BasicNameValuePair>
				//  343  825:dup             
				//  344  826:ldc2            #281 <String "udid_sha1">
				//  345  829:aload_0         
				//  346  830:getfield        #17  <Field MadvertiseView this$0>
				//  347  833:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//  348  836:getstatic       #284 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.SHA1>
				//  349  839:invokestatic    #279 <Method String MadvertiseUtil.getHashedAndroidID(Context, MadvertiseUtil$HashType)>
				//  350  842:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  351  845:invokeinterface #112 <Method boolean List.add(Object)>
				//  352  850:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("mac_md5", MadvertiseUtil.getHashedMacAddress(getContext(), MadvertiseUtil.HashType.MD5)))));
				//  353  851:aload           5
				//  354  853:new             #99  <Class BasicNameValuePair>
				//  355  856:dup             
				//  356  857:ldc2            #286 <String "mac_md5">
				//  357  860:aload_0         
				//  358  861:getfield        #17  <Field MadvertiseView this$0>
				//  359  864:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//  360  867:getstatic       #275 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.MD5>
				//  361  870:invokestatic    #289 <Method String MadvertiseUtil.getHashedMacAddress(Context, MadvertiseUtil$HashType)>
				//  362  873:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  363  876:invokeinterface #112 <Method boolean List.add(Object)>
				//  364  881:pop             
					((List) (obj4)).add(((Object) (new BasicNameValuePair("mac_sha1", MadvertiseUtil.getHashedMacAddress(getContext(), MadvertiseUtil.HashType.SHA1)))));
				//  365  882:aload           5
				//  366  884:new             #99  <Class BasicNameValuePair>
				//  367  887:dup             
				//  368  888:ldc2            #291 <String "mac_sha1">
				//  369  891:aload_0         
				//  370  892:getfield        #17  <Field MadvertiseView this$0>
				//  371  895:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//  372  898:getstatic       #284 <Field MadvertiseUtil$HashType MadvertiseUtil$HashType.SHA1>
				//  373  901:invokestatic    #289 <Method String MadvertiseUtil.getHashedMacAddress(Context, MadvertiseUtil$HashType)>
				//  374  904:invokespecial   #106 <Method void BasicNameValuePair(String, String)>
				//  375  907:invokeinterface #112 <Method boolean List.add(Object)>
				//  376  912:pop             
					int i;
					Exception exception;
					IOException ioexception;
					Object obj3;
					try
					{
						obj = ((Object) (new UrlEncodedFormEntity(((List) (obj4)))));
				//  377  913:new             #293 <Class UrlEncodedFormEntity>
				//  378  916:dup             
				//  379  917:aload           5
				//  380  919:invokespecial   #296 <Method void UrlEncodedFormEntity(List)>
				//  381  922:astore_2        
					}
				//* 382  923:aload           4
				//* 383  925:aload_2         
				//* 384  926:invokevirtual   #300 <Method void HttpPost.setEntity(HttpEntity)>
				//* 385  929:aconst_null     
				//* 386  930:iconst_3        
				//* 387  931:ldc2            #302 <String "Post request created">
				//* 388  934:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
				//* 389  937:new             #61  <Class StringBuilder>
				//* 390  940:dup             
				//* 391  941:invokespecial   #62  <Method void StringBuilder()>
				//* 392  944:astore_2        
				//* 393  945:aload_2         
				//* 394  946:ldc2            #304 <String "Uri : ">
				//* 395  949:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 396  952:pop             
				//* 397  953:aload_2         
				//* 398  954:aload           4
				//* 399  956:invokevirtual   #308 <Method URI HttpPost.getURI()>
				//* 400  959:invokevirtual   #313 <Method String URI.toASCIIString()>
				//* 401  962:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 402  965:pop             
				//* 403  966:aconst_null     
				//* 404  967:iconst_3        
				//* 405  968:aload_2         
				//* 406  969:invokevirtual   #72  <Method String StringBuilder.toString()>
				//* 407  972:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
				//* 408  975:new             #61  <Class StringBuilder>
				//* 409  978:dup             
				//* 410  979:invokespecial   #62  <Method void StringBuilder()>
				//* 411  982:astore_2        
				//* 412  983:aload_2         
				//* 413  984:ldc2            #315 <String "All headers : ">
				//* 414  987:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 415  990:pop             
				//* 416  991:aload_2         
				//* 417  992:aload           4
				//* 418  994:invokevirtual   #319 <Method org.apache.http.Header[] HttpPost.getAllHeaders()>
				//* 419  997:invokestatic    #323 <Method String MadvertiseUtil.getAllHeadersAsString(org.apache.http.Header[])>
				//* 420 1000:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 421 1003:pop             
				//* 422 1004:aconst_null     
				//* 423 1005:iconst_3        
				//* 424 1006:aload_2         
				//* 425 1007:invokevirtual   #72  <Method String StringBuilder.toString()>
				//* 426 1010:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
				//* 427 1013:new             #61  <Class StringBuilder>
				//* 428 1016:dup             
				//* 429 1017:invokespecial   #62  <Method void StringBuilder()>
				//* 430 1020:astore_2        
				//* 431 1021:aload_2         
				//* 432 1022:ldc2            #325 <String "All request parameters :">
				//* 433 1025:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 434 1028:pop             
				//* 435 1029:aload_2         
				//* 436 1030:aload           5
				//* 437 1032:invokestatic    #329 <Method String MadvertiseUtil.printRequestParameters(List)>
				//* 438 1035:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 439 1038:pop             
				//* 440 1039:aconst_null     
				//* 441 1040:iconst_3        
				//* 442 1041:aload_2         
				//* 443 1042:invokevirtual   #72  <Method String StringBuilder.toString()>
				//* 444 1045:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
				//* 445 1048:aload_0         
				//* 446 1049:monitorenter    
				//* 447 1050:new             #331 <Class DefaultHttpClient>
				//* 448 1053:dup             
				//* 449 1054:invokespecial   #332 <Method void DefaultHttpClient()>
				//* 450 1057:astore_2        
				//* 451 1058:aload_2         
				//* 452 1059:invokeinterface #338 <Method org.apache.http.params.HttpParams HttpClient.getParams()>
				//* 453 1064:astore          5
				//* 454 1066:aload           5
				//* 455 1068:sipush          5000
				//* 456 1071:invokestatic    #344 <Method void HttpConnectionParams.setConnectionTimeout(org.apache.http.params.HttpParams, int)>
				//* 457 1074:aload           5
				//* 458 1076:sipush          5000
				//* 459 1079:invokestatic    #347 <Method void HttpConnectionParams.setSoTimeout(org.apache.http.params.HttpParams, int)>
				//* 460 1082:aconst_null     
				//* 461 1083:iconst_3        
				//* 462 1084:ldc2            #349 <String "Sending request">
				//* 463 1087:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
				//* 464 1090:aload_2         
				//* 465 1091:aload           4
				//* 466 1093:invokeinterface #353 <Method HttpResponse HttpClient.execute(org.apache.http.client.methods.HttpUriRequest)>
				//* 467 1098:astore          4
				//* 468 1100:new             #61  <Class StringBuilder>
				//* 469 1103:dup             
				//* 470 1104:invokespecial   #62  <Method void StringBuilder()>
				//* 471 1107:astore_2        
				//* 472 1108:aload_2         
				//* 473 1109:ldc2            #355 <String "Response Code => ">
				//* 474 1112:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 475 1115:pop             
				//* 476 1116:aload_2         
				//* 477 1117:aload           4
				//* 478 1119:invokeinterface #361 <Method StatusLine HttpResponse.getStatusLine()>
				//* 479 1124:invokeinterface #366 <Method int StatusLine.getStatusCode()>
				//* 480 1129:invokevirtual   #369 <Method StringBuilder StringBuilder.append(int)>
				//* 481 1132:pop             
				//* 482 1133:aconst_null     
				//* 483 1134:iconst_3        
				//* 484 1135:aload_2         
				//* 485 1136:invokevirtual   #72  <Method String StringBuilder.toString()>
				//* 486 1139:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
				//* 487 1142:ldc1            #53  <String "">
				//* 488 1144:astore_2        
				//* 489 1145:aload           4
				//* 490 1147:ldc2            #371 <String "X-Madvertise-Debug">
				//* 491 1150:invokeinterface #375 <Method org.apache.http.Header HttpResponse.getLastHeader(String)>
				//* 492 1155:ifnull          1172
				//* 493 1158:aload           4
				//* 494 1160:ldc2            #371 <String "X-Madvertise-Debug">
				//* 495 1163:invokeinterface #375 <Method org.apache.http.Header HttpResponse.getLastHeader(String)>
				//* 496 1168:invokevirtual   #376 <Method String Object.toString()>
				//* 497 1171:astore_2        
				//* 498 1172:aload_0         
				//* 499 1173:getfield        #17  <Field MadvertiseView this$0>
				//* 500 1176:invokestatic    #122 <Method boolean MadvertiseView.access$300(MadvertiseView)>
				//* 501 1179:ifeq            1217
				//* 502 1182:new             #61  <Class StringBuilder>
				//* 503 1185:dup             
				//* 504 1186:invokespecial   #62  <Method void StringBuilder()>
				//* 505 1189:astore          5
				//* 506 1191:aload           5
				//* 507 1193:ldc2            #378 <String "Madvertise Debug Response: ">
				//* 508 1196:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 509 1199:pop             
				//* 510 1200:aload           5
				//* 511 1202:aload_2         
				//* 512 1203:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 513 1206:pop             
				//* 514 1207:aconst_null     
				//* 515 1208:iconst_3        
				//* 516 1209:aload           5
				//* 517 1211:invokevirtual   #72  <Method String StringBuilder.toString()>
				//* 518 1214:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
				//* 519 1217:aload           4
				//* 520 1219:invokeinterface #361 <Method StatusLine HttpResponse.getStatusLine()>
				//* 521 1224:invokeinterface #366 <Method int StatusLine.getStatusCode()>
				//* 522 1229:istore_1        
				//* 523 1230:aload           4
				//* 524 1232:invokeinterface #382 <Method HttpEntity HttpResponse.getEntity()>
				//* 525 1237:astore          4
				//* 526 1239:iload_1         
				//* 527 1240:sipush          200
				//* 528 1243:icmpne          1407
				//* 529 1246:aload           4
				//* 530 1248:ifnull          1407
				//* 531 1251:aload           4
				//* 532 1253:invokeinterface #388 <Method InputStream HttpEntity.getContent()>
				//* 533 1258:astore_2        
				//* 534 1259:aload_2         
				//* 535 1260:invokestatic    #392 <Method String MadvertiseUtil.convertStreamToString(InputStream)>
				//* 536 1263:astore_3        
				//* 537 1264:new             #61  <Class StringBuilder>
				//* 538 1267:dup             
				//* 539 1268:invokespecial   #62  <Method void StringBuilder()>
				//* 540 1271:astore          4
				//* 541 1273:aload           4
				//* 542 1275:ldc2            #394 <String "Response => ">
				//* 543 1278:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 544 1281:pop             
				//* 545 1282:aload           4
				//* 546 1284:aload_3         
				//* 547 1285:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//* 548 1288:pop             
				//* 549 1289:aconst_null     
				//* 550 1290:iconst_3        
				//* 551 1291:aload           4
				//* 552 1293:invokevirtual   #72  <Method String StringBuilder.toString()>
				//* 553 1296:invokestatic    #59  <Method void MadvertiseUtil.logMessage(String, int, String)>
				//* 554 1299:new             #396 <Class JSONObject>
				//* 555 1302:dup             
				//* 556 1303:aload_3         
				//* 557 1304:invokespecial   #397 <Method void JSONObject(String)>
				//* 558 1307:astore_3        
				//* 559 1308:aload_0         
				//* 560 1309:getfield        #17  <Field MadvertiseView this$0>
				//* 561 1312:new             #399 <Class MadvertiseAd>
				//* 562 1315:dup             
				//* 563 1316:aload_0         
				//* 564 1317:getfield        #17  <Field MadvertiseView this$0>
				//* 565 1320:invokevirtual   #36  <Method Context MadvertiseView.getContext()>
				//* 566 1323:invokevirtual   #41  <Method Context Context.getApplicationContext()>
				//* 567 1326:aload_3         
				//* 568 1327:aload_0         
				//* 569 1328:getfield        #17  <Field MadvertiseView this$0>
				//* 570 1331:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 571 1334:invokespecial   #402 <Method void MadvertiseAd(Context, JSONObject, MadvertiseView$MadvertiseViewCallbackListener)>
				//* 572 1337:invokestatic    #406 <Method MadvertiseAd MadvertiseView.access$1102(MadvertiseView, MadvertiseAd)>
				//* 573 1340:pop             
				//* 574 1341:aload_0         
				//* 575 1342:getfield        #17  <Field MadvertiseView this$0>
				//* 576 1345:invokestatic    #409 <Method void MadvertiseView.access$1200(MadvertiseView)>
				//* 577 1348:aload_0         
				//* 578 1349:getfield        #17  <Field MadvertiseView this$0>
				//* 579 1352:invokestatic    #413 <Method Handler MadvertiseView.access$100(MadvertiseView)>
				//* 580 1355:aload_0         
				//* 581 1356:getfield        #17  <Field MadvertiseView this$0>
				//* 582 1359:invokestatic    #417 <Method Runnable MadvertiseView.access$1300(MadvertiseView)>
				//* 583 1362:invokevirtual   #423 <Method boolean Handler.post(Runnable)>
				//* 584 1365:pop             
				//* 585 1366:goto            1433
				//* 586 1369:astore          4
				//* 587 1371:aload_2         
				//* 588 1372:astore_3        
				//* 589 1373:aload           4
				//* 590 1375:astore_2        
				//* 591 1376:goto            1795
				//* 592 1379:astore          4
				//* 593 1381:aload_2         
				//* 594 1382:astore_3        
				//* 595 1383:goto            1481
				//* 596 1386:astore          4
				//* 597 1388:aload_2         
				//* 598 1389:astore_3        
				//* 599 1390:goto            1558
				//* 600 1393:astore          4
				//* 601 1395:aload_2         
				//* 602 1396:astore_3        
				//* 603 1397:goto            1635
				//* 604 1400:astore          4
				//* 605 1402:aload_2         
				//* 606 1403:astore_3        
				//* 607 1404:goto            1712
				//* 608 1407:aload_0         
				//* 609 1408:getfield        #17  <Field MadvertiseView this$0>
				//* 610 1411:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 611 1414:ifnull          1431
				//* 612 1417:aload_0         
				//* 613 1418:getfield        #17  <Field MadvertiseView this$0>
				//* 614 1421:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 615 1424:iload_1         
				//* 616 1425:aload_2         
				//* 617 1426:invokeinterface #429 <Method void MadvertiseView$MadvertiseViewCallbackListener.onIllegalHttpStatusCode(int, String)>
				//* 618 1431:aconst_null     
				//* 619 1432:astore_2        
				//* 620 1433:aload_2         
				//* 621 1434:ifnull          1785
				//* 622 1437:aload_2         
				//* 623 1438:invokevirtual   #434 <Method void InputStream.close()>
				//* 624 1441:goto            1785
				//* 625 1444:astore_2        
				//* 626 1445:aload_0         
				//* 627 1446:getfield        #17  <Field MadvertiseView this$0>
				//* 628 1449:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 629 1452:ifnull          1785
				//* 630 1455:aload_0         
				//* 631 1456:getfield        #17  <Field MadvertiseView this$0>
				//* 632 1459:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 633 1462:astore_3        
				//* 634 1463:aload_3         
				//* 635 1464:aload_2         
				//* 636 1465:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
				//* 637 1470:goto            1785
				//* 638 1473:astore_2        
				//* 639 1474:goto            1795
				//* 640 1477:astore          4
				//* 641 1479:aconst_null     
				//* 642 1480:astore_3        
				//* 643 1481:aload_3         
				//* 644 1482:astore_2        
				//* 645 1483:aconst_null     
				//* 646 1484:iconst_3        
				//* 647 1485:ldc2            #440 <String "Could not receive a http response on an ad request">
				//* 648 1488:aload           4
				//* 649 1490:invokestatic    #443 <Method void MadvertiseUtil.logMessage(String, int, String, Throwable)>
				//* 650 1493:aload_3         
				//* 651 1494:astore_2        
				//* 652 1495:aload_0         
				//* 653 1496:getfield        #17  <Field MadvertiseView this$0>
				//* 654 1499:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 655 1502:ifnull          1521
				//* 656 1505:aload_3         
				//* 657 1506:astore_2        
				//* 658 1507:aload_0         
				//* 659 1508:getfield        #17  <Field MadvertiseView this$0>
				//* 660 1511:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 661 1514:aload           4
				//* 662 1516:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
				//* 663 1521:aload_3         
				//* 664 1522:ifnull          1785
				//* 665 1525:aload_3         
				//* 666 1526:invokevirtual   #434 <Method void InputStream.close()>
				//* 667 1529:goto            1785
				//* 668 1532:astore_2        
				//* 669 1533:aload_0         
				//* 670 1534:getfield        #17  <Field MadvertiseView this$0>
				//* 671 1537:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 672 1540:ifnull          1785
				//* 673 1543:aload_0         
				//* 674 1544:getfield        #17  <Field MadvertiseView this$0>
				//* 675 1547:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 676 1550:astore_3        
				//* 677 1551:goto            1463
				//* 678 1554:astore          4
				//* 679 1556:aconst_null     
				//* 680 1557:astore_3        
				//* 681 1558:aload_3         
				//* 682 1559:astore_2        
				//* 683 1560:aconst_null     
				//* 684 1561:iconst_3        
				//* 685 1562:ldc2            #445 <String "Could not parse json object">
				//* 686 1565:aload           4
				//* 687 1567:invokestatic    #443 <Method void MadvertiseUtil.logMessage(String, int, String, Throwable)>
				//* 688 1570:aload_3         
				//* 689 1571:astore_2        
				//* 690 1572:aload_0         
				//* 691 1573:getfield        #17  <Field MadvertiseView this$0>
				//* 692 1576:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 693 1579:ifnull          1598
				//* 694 1582:aload_3         
				//* 695 1583:astore_2        
				//* 696 1584:aload_0         
				//* 697 1585:getfield        #17  <Field MadvertiseView this$0>
				//* 698 1588:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 699 1591:aload           4
				//* 700 1593:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
				//* 701 1598:aload_3         
				//* 702 1599:ifnull          1785
				//* 703 1602:aload_3         
				//* 704 1603:invokevirtual   #434 <Method void InputStream.close()>
				//* 705 1606:goto            1785
				//* 706 1609:astore_2        
				//* 707 1610:aload_0         
				//* 708 1611:getfield        #17  <Field MadvertiseView this$0>
				//* 709 1614:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 710 1617:ifnull          1785
				//* 711 1620:aload_0         
				//* 712 1621:getfield        #17  <Field MadvertiseView this$0>
				//* 713 1624:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 714 1627:astore_3        
				//* 715 1628:goto            1463
				//* 716 1631:astore          4
				//* 717 1633:aconst_null     
				//* 718 1634:astore_3        
				//* 719 1635:aload_3         
				//* 720 1636:astore_2        
				//* 721 1637:aconst_null     
				//* 722 1638:iconst_3        
				//* 723 1639:ldc2            #440 <String "Could not receive a http response on an ad request">
				//* 724 1642:aload           4
				//* 725 1644:invokestatic    #443 <Method void MadvertiseUtil.logMessage(String, int, String, Throwable)>
				//* 726 1647:aload_3         
				//* 727 1648:astore_2        
				//* 728 1649:aload_0         
				//* 729 1650:getfield        #17  <Field MadvertiseView this$0>
				//* 730 1653:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 731 1656:ifnull          1675
				//* 732 1659:aload_3         
				//* 733 1660:astore_2        
				//* 734 1661:aload_0         
				//* 735 1662:getfield        #17  <Field MadvertiseView this$0>
				//* 736 1665:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 737 1668:aload           4
				//* 738 1670:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
				//* 739 1675:aload_3         
				//* 740 1676:ifnull          1785
				//* 741 1679:aload_3         
				//* 742 1680:invokevirtual   #434 <Method void InputStream.close()>
				//* 743 1683:goto            1785
				//* 744 1686:astore_2        
				//* 745 1687:aload_0         
				//* 746 1688:getfield        #17  <Field MadvertiseView this$0>
				//* 747 1691:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 748 1694:ifnull          1785
				//* 749 1697:aload_0         
				//* 750 1698:getfield        #17  <Field MadvertiseView this$0>
				//* 751 1701:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 752 1704:astore_3        
				//* 753 1705:goto            1463
				//* 754 1708:astore          4
				//* 755 1710:aconst_null     
				//* 756 1711:astore_3        
				//* 757 1712:aload_3         
				//* 758 1713:astore_2        
				//* 759 1714:aconst_null     
				//* 760 1715:iconst_3        
				//* 761 1716:ldc2            #447 <String "Error in HTTP request / protocol">
				//* 762 1719:aload           4
				//* 763 1721:invokestatic    #443 <Method void MadvertiseUtil.logMessage(String, int, String, Throwable)>
				//* 764 1724:aload_3         
				//* 765 1725:astore_2        
				//* 766 1726:aload_0         
				//* 767 1727:getfield        #17  <Field MadvertiseView this$0>
				//* 768 1730:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 769 1733:ifnull          1752
				//* 770 1736:aload_3         
				//* 771 1737:astore_2        
				//* 772 1738:aload_0         
				//* 773 1739:getfield        #17  <Field MadvertiseView this$0>
				//* 774 1742:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 775 1745:aload           4
				//* 776 1747:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
				//* 777 1752:aload_3         
				//* 778 1753:ifnull          1785
				//* 779 1756:aload_3         
				//* 780 1757:invokevirtual   #434 <Method void InputStream.close()>
				//* 781 1760:goto            1785
				//* 782 1763:astore_2        
				//* 783 1764:aload_0         
				//* 784 1765:getfield        #17  <Field MadvertiseView this$0>
				//* 785 1768:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 786 1771:ifnull          1785
				//* 787 1774:aload_0         
				//* 788 1775:getfield        #17  <Field MadvertiseView this$0>
				//* 789 1778:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 790 1781:astore_3        
				//* 791 1782:goto            1463
				//* 792 1785:aload_0         
				//* 793 1786:monitorexit     
				//* 794 1787:return          
				//* 795 1788:astore          4
				//* 796 1790:aload_2         
				//* 797 1791:astore_3        
				//* 798 1792:aload           4
				//* 799 1794:astore_2        
				//* 800 1795:aload_3         
				//* 801 1796:ifnull          1830
				//* 802 1799:aload_3         
				//* 803 1800:invokevirtual   #434 <Method void InputStream.close()>
				//* 804 1803:goto            1830
				//* 805 1806:astore_3        
				//* 806 1807:aload_0         
				//* 807 1808:getfield        #17  <Field MadvertiseView this$0>
				//* 808 1811:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 809 1814:ifnull          1830
				//* 810 1817:aload_0         
				//* 811 1818:getfield        #17  <Field MadvertiseView this$0>
				//* 812 1821:invokestatic    #45  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseView.access$200(MadvertiseView)>
				//* 813 1824:aload_3         
				//* 814 1825:invokeinterface #438 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
				//* 815 1830:aload_2         
				//* 816 1831:athrow          
				//* 817 1832:astore_2        
				//* 818 1833:aload_0         
				//* 819 1834:monitorexit     
				//* 820 1835:aload_2         
				//* 821 1836:athrow          
					catch(UnsupportedEncodingException unsupportedencodingexception)
				//* 822 1837:astore_2        
					{
						throw new RuntimeException(((Throwable) (unsupportedencodingexception)));
				//  823 1838:new             #449 <Class RuntimeException>
				//  824 1841:dup             
				//  825 1842:aload_2         
				//  826 1843:invokespecial   #452 <Method void RuntimeException(Throwable)>
				//  827 1846:athrow          
					}
					((HttpPost) (obj2)).setEntity(((HttpEntity) (obj)));
					MadvertiseUtil.logMessage(((String) (null)), 3, "Post request created");
					obj = ((Object) (new StringBuilder()));
					((StringBuilder) (obj)).append("Uri : ");
					((StringBuilder) (obj)).append(((HttpPost) (obj2)).getURI().toASCIIString());
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
					obj = ((Object) (new StringBuilder()));
					((StringBuilder) (obj)).append("All headers : ");
					((StringBuilder) (obj)).append(MadvertiseUtil.getAllHeadersAsString(((HttpPost) (obj2)).getAllHeaders()));
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
					obj = ((Object) (new StringBuilder()));
					((StringBuilder) (obj)).append("All request parameters :");
					((StringBuilder) (obj)).append(MadvertiseUtil.printRequestParameters(((List) (obj4))));
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
					this;
					JVM INSTR monitorenter ;
					obj = ((Object) (new DefaultHttpClient()));
					obj4 = ((Object) (((HttpClient) (obj)).getParams()));
					HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj4)), 5000);
					HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj4)), 5000);
					MadvertiseUtil.logMessage(((String) (null)), 3, "Sending request");
					obj2 = ((Object) (((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj2)))));
					obj = ((Object) (new StringBuilder()));
					((StringBuilder) (obj)).append("Response Code => ");
					((StringBuilder) (obj)).append(((HttpResponse) (obj2)).getStatusLine().getStatusCode());
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj)).toString());
					obj = "";
					if(((HttpResponse) (obj2)).getLastHeader("X-Madvertise-Debug") != null)
						obj = ((Object) (((Object) (((HttpResponse) (obj2)).getLastHeader("X-Madvertise-Debug"))).toString()));
					if(mTestMode)
					{
						obj4 = ((Object) (new StringBuilder()));
						((StringBuilder) (obj4)).append("Madvertise Debug Response: ");
						((StringBuilder) (obj4)).append(((String) (obj)));
						MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj4)).toString());
					}
					i = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
					obj2 = ((Object) (((HttpResponse) (obj2)).getEntity()));
					if(i != 200 || obj2 == null) goto _L2; else goto _L1
_L1:
					obj = ((Object) (((HttpEntity) (obj2)).getContent()));
					obj1 = ((Object) (MadvertiseUtil.convertStreamToString(((InputStream) (obj)))));
					obj2 = ((Object) (new StringBuilder()));
					((StringBuilder) (obj2)).append("Response => ");
					((StringBuilder) (obj2)).append(((String) (obj1)));
					MadvertiseUtil.logMessage(((String) (null)), 3, ((StringBuilder) (obj2)).toString());
					obj1 = ((Object) (new JSONObject(((String) (obj1)))));
					mCurrentAd = new MadvertiseAd(getContext().getApplicationContext(), ((JSONObject) (obj1)), mCallbackListener);
					calculateBannerDimensions();
					mHandler.post(mUpdateResults);
					  goto _L3
					obj3;
					obj1 = obj;
					obj = obj3;
					break MISSING_BLOCK_LABEL_1795;
					obj3;
					obj1 = obj;
					  goto _L4
					obj3;
					obj1 = obj;
					  goto _L5
					obj3;
					obj1 = obj;
					  goto _L6
					obj3;
					obj1 = obj;
					  goto _L7
_L2:
					if(mCallbackListener != null)
						mCallbackListener.onIllegalHttpStatusCode(i, ((String) (obj)));
					obj = null;
_L3:
					if(obj == null)
						break MISSING_BLOCK_LABEL_1785;
					try
					{
						((InputStream) (obj)).close();
						break MISSING_BLOCK_LABEL_1785;
					}
					// Misplaced declaration of an exception variable
					catch(Object obj) { }
					if(mCallbackListener == null)
						break MISSING_BLOCK_LABEL_1785;
					obj1 = ((Object) (mCallbackListener));
_L8:
					((MadvertiseViewCallbackListener) (obj1)).onError(((Exception) (obj)));
					break MISSING_BLOCK_LABEL_1785;
					obj;
					break MISSING_BLOCK_LABEL_1795;
					obj3;
					obj1 = null;
_L4:
					obj = obj1;
					MadvertiseUtil.logMessage(((String) (null)), 3, "Could not receive a http response on an ad request", ((Throwable) (obj3)));
					obj = obj1;
					if(mCallbackListener == null)
						break MISSING_BLOCK_LABEL_1521;
					obj = obj1;
					mCallbackListener.onError(((Exception) (obj3)));
					if(obj1 == null)
						break MISSING_BLOCK_LABEL_1785;
					try
					{
						((InputStream) (obj1)).close();
						break MISSING_BLOCK_LABEL_1785;
					}
					// Misplaced declaration of an exception variable
					catch(Object obj) { }
					if(mCallbackListener == null)
						break MISSING_BLOCK_LABEL_1785;
					obj1 = ((Object) (mCallbackListener));
					  goto _L8
					obj3;
					obj1 = null;
_L5:
					obj = obj1;
					MadvertiseUtil.logMessage(((String) (null)), 3, "Could not parse json object", ((Throwable) (obj3)));
					obj = obj1;
					if(mCallbackListener == null)
						break MISSING_BLOCK_LABEL_1598;
					obj = obj1;
					mCallbackListener.onError(((Exception) (obj3)));
					if(obj1 == null)
						break MISSING_BLOCK_LABEL_1785;
					try
					{
						((InputStream) (obj1)).close();
						break MISSING_BLOCK_LABEL_1785;
					}
					// Misplaced declaration of an exception variable
					catch(Object obj) { }
					if(mCallbackListener == null)
						break MISSING_BLOCK_LABEL_1785;
					obj1 = ((Object) (mCallbackListener));
					  goto _L8
					obj3;
					obj1 = null;
_L6:
					obj = obj1;
					MadvertiseUtil.logMessage(((String) (null)), 3, "Could not receive a http response on an ad request", ((Throwable) (obj3)));
					obj = obj1;
					if(mCallbackListener == null)
						break MISSING_BLOCK_LABEL_1675;
					obj = obj1;
					mCallbackListener.onError(((Exception) (obj3)));
					if(obj1 == null)
						break MISSING_BLOCK_LABEL_1785;
					try
					{
						((InputStream) (obj1)).close();
						break MISSING_BLOCK_LABEL_1785;
					}
					// Misplaced declaration of an exception variable
					catch(Object obj) { }
					if(mCallbackListener == null)
						break MISSING_BLOCK_LABEL_1785;
					obj1 = ((Object) (mCallbackListener));
					  goto _L8
					obj3;
					obj1 = null;
_L7:
					obj = obj1;
					MadvertiseUtil.logMessage(((String) (null)), 3, "Error in HTTP request / protocol", ((Throwable) (obj3)));
					obj = obj1;
					if(mCallbackListener == null)
						break MISSING_BLOCK_LABEL_1752;
					obj = obj1;
					mCallbackListener.onError(((Exception) (obj3)));
					if(obj1 == null)
						break MISSING_BLOCK_LABEL_1785;
					try
					{
						((InputStream) (obj1)).close();
						break MISSING_BLOCK_LABEL_1785;
					}
					// Misplaced declaration of an exception variable
					catch(Object obj) { }
					if(mCallbackListener == null)
						break MISSING_BLOCK_LABEL_1785;
					obj1 = ((Object) (mCallbackListener));
					  goto _L8
					this;
					JVM INSTR monitorexit ;
					return;
					obj3;
					obj1 = obj;
					obj = obj3;
					if(obj1 == null)
						break MISSING_BLOCK_LABEL_1830;
					((InputStream) (obj1)).close();
					break MISSING_BLOCK_LABEL_1830;
					ioexception;
					if(mCallbackListener != null)
						mCallbackListener.onError(((Exception) (ioexception)));
					throw obj;
					exception;
					this;
					JVM INSTR monitorexit ;
					throw exception;
				}

				final MadvertiseView this$0;

			
			{
				this$0 = MadvertiseView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MadvertiseView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
, "MadvertiseRequestThread");
	//   12   24:aload_0         
	//   13   25:new             #260 <Class Thread>
	//   14   28:dup             
	//   15   29:new             #10  <Class MadvertiseView$3>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #695 <Method void MadvertiseView$3(MadvertiseView)>
	//   19   37:ldc2            #697 <String "MadvertiseRequestThread">
	//   20   40:invokespecial   #700 <Method void Thread(Runnable, String)>
	//   21   43:putfield        #258 <Field Thread mRequestThread>
			mRequestThread.start();
	//   22   46:aload_0         
	//   23   47:getfield        #258 <Field Thread mRequestThread>
	//   24   50:invokevirtual   #703 <Method void Thread.start()>
			return;
	//   25   53:return          
		}
	}

	public static void setAge(String s)
	{
		sAge = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #333 <Field String sAge>
	//    2    4:return          
	}

	public static void setGender(String s)
	{
		if(!s.equals("F") && !s.equals("M"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #27  <String "F">
	//*   2    3:invokevirtual   #376 <Method boolean String.equals(Object)>
	//*   3    6:ifne            27
	//*   4    9:aload_0         
	//*   5   10:ldc1            #30  <String "M">
	//*   6   12:invokevirtual   #376 <Method boolean String.equals(Object)>
	//*   7   15:ifeq            21
	//*   8   18:goto            27
		{
			sGender = "";
	//    9   21:ldc1            #39  <String "">
	//   10   23:putstatic       #339 <Field String sGender>
			return;
	//   11   26:return          
		} else
		{
			sGender = s;
	//   12   27:aload_0         
	//   13   28:putstatic       #339 <Field String sGender>
			return;
	//   14   31:return          
		}
	}

	private void showImageView()
	{
		MadvertiseUtil.logMessage(((String) (null)), 3, "Add image banner");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc2            #707 <String "Add image banner">
	//    3    5:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		MadvertiseImageView madvertiseimageview = new MadvertiseImageView(getContext().getApplicationContext(), mBannerWidthDp, mBannerHeightDp, mCurrentAd, mHandler, mAnimationListener);
	//    4    8:new             #709 <Class MadvertiseImageView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #180 <Method Context getContext()>
	//    8   16:invokevirtual   #193 <Method Context Context.getApplicationContext()>
	//    9   19:aload_0         
	//   10   20:getfield        #127 <Field int mBannerWidthDp>
	//   11   23:aload_0         
	//   12   24:getfield        #125 <Field int mBannerHeightDp>
	//   13   27:aload_0         
	//   14   28:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//   15   31:aload_0         
	//   16   32:getfield        #140 <Field Handler mHandler>
	//   17   35:aload_0         
	//   18   36:getfield        #151 <Field MadvertiseView$AnimationEndListener mAnimationListener>
	//   19   39:invokespecial   #712 <Method void MadvertiseImageView(Context, int, int, MadvertiseAd, Handler, MadvertiseView$AnimationEndListener)>
	//   20   42:astore_1        
		animateOldViews();
	//   21   43:aload_0         
	//   22   44:invokespecial   #714 <Method void animateOldViews()>
		addView(((View) (madvertiseimageview)));
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #717 <Method void addView(View)>
		Animation animation = createAnimation(false);
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:invokespecial   #350 <Method Animation createAnimation(boolean)>
	//   29   57:astore_2        
		if(animation != null)
	//*  30   58:aload_2         
	//*  31   59:ifnull          67
			madvertiseimageview.startAnimation(animation);
	//   32   62:aload_1         
	//   33   63:aload_2         
	//   34   64:invokevirtual   #720 <Method void MadvertiseImageView.startAnimation(Animation)>
	//   35   67:return          
	}

	private void showMraidView()
	{
		MadvertiseUtil.logMessage(((String) (null)), 3, "Add rich media banner");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc2            #722 <String "Add rich media banner">
	//    3    5:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		mMraidView = new MadvertiseMraidView(getContext().getApplicationContext(), mCallbackListener, mAnimationListener, mHandler, this);
	//    4    8:aload_0         
	//    5    9:new             #724 <Class MadvertiseMraidView>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokevirtual   #180 <Method Context getContext()>
	//    9   17:invokevirtual   #193 <Method Context Context.getApplicationContext()>
	//   10   20:aload_0         
	//   11   21:getfield        #133 <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//   12   24:aload_0         
	//   13   25:getfield        #151 <Field MadvertiseView$AnimationEndListener mAnimationListener>
	//   14   28:aload_0         
	//   15   29:getfield        #140 <Field Handler mHandler>
	//   16   32:aload_0         
	//   17   33:invokespecial   #727 <Method void MadvertiseMraidView(Context, MadvertiseView$MadvertiseViewCallbackListener, MadvertiseView$AnimationEndListener, Handler, MadvertiseView)>
	//   18   36:putfield        #729 <Field MadvertiseMraidView mMraidView>
		mMraidView.setPlacementType(mPlacementType);
	//   19   39:aload_0         
	//   20   40:getfield        #729 <Field MadvertiseMraidView mMraidView>
	//   21   43:aload_0         
	//   22   44:getfield        #155 <Field int mPlacementType>
	//   23   47:invokevirtual   #732 <Method void MadvertiseMraidView.setPlacementType(int)>
		mMraidView.loadAd(mCurrentAd);
	//   24   50:aload_0         
	//   25   51:getfield        #729 <Field MadvertiseMraidView mMraidView>
	//   26   54:aload_0         
	//   27   55:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//   28   58:invokevirtual   #736 <Method void MadvertiseMraidView.loadAd(MadvertiseAd)>
		animateOldViews();
	//   29   61:aload_0         
	//   30   62:invokespecial   #714 <Method void animateOldViews()>
		addView(((View) (mMraidView)));
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:getfield        #729 <Field MadvertiseMraidView mMraidView>
	//   34   70:invokevirtual   #717 <Method void addView(View)>
		Animation animation = createAnimation(false);
	//   35   73:aload_0         
	//   36   74:iconst_0        
	//   37   75:invokespecial   #350 <Method Animation createAnimation(boolean)>
	//   38   78:astore_1        
		if(animation != null)
	//*  39   79:aload_1         
	//*  40   80:ifnull          91
			mMraidView.startAnimation(animation);
	//   41   83:aload_0         
	//   42   84:getfield        #729 <Field MadvertiseMraidView mMraidView>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #737 <Method void MadvertiseMraidView.startAnimation(Animation)>
	//   45   91:return          
	}

	private void showTextView()
	{
		MadvertiseUtil.logMessage(((String) (null)), 3, "Add text banner");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc2            #739 <String "Add text banner">
	//    3    5:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		setBackgroundDrawable(((Drawable) (sTextBannerBackground)));
	//    4    8:aload_0         
	//    5    9:getstatic       #235 <Field BitmapDrawable sTextBannerBackground>
	//    6   12:invokevirtual   #656 <Method void setBackgroundDrawable(Drawable)>
		MadvertiseTextView madvertisetextview = new MadvertiseTextView(getContext().getApplicationContext(), mCurrentAd.getText(), mTextSize, mTextColor, mAnimationListener);
	//    7   15:new             #741 <Class MadvertiseTextView>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokevirtual   #180 <Method Context getContext()>
	//   11   23:invokevirtual   #193 <Method Context Context.getApplicationContext()>
	//   12   26:aload_0         
	//   13   27:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//   14   30:invokevirtual   #744 <Method String MadvertiseAd.getText()>
	//   15   33:aload_0         
	//   16   34:getfield        #119 <Field int mTextSize>
	//   17   37:aload_0         
	//   18   38:getfield        #101 <Field int mTextColor>
	//   19   41:aload_0         
	//   20   42:getfield        #151 <Field MadvertiseView$AnimationEndListener mAnimationListener>
	//   21   45:invokespecial   #747 <Method void MadvertiseTextView(Context, String, int, int, MadvertiseView$AnimationEndListener)>
	//   22   48:astore_1        
		animateOldViews();
	//   23   49:aload_0         
	//   24   50:invokespecial   #714 <Method void animateOldViews()>
		addView(((View) (madvertisetextview)));
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokevirtual   #717 <Method void addView(View)>
		Animation animation = createAnimation(false);
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:invokespecial   #350 <Method Animation createAnimation(boolean)>
	//   31   63:astore_2        
		if(animation != null)
	//*  32   64:aload_2         
	//*  33   65:ifnull          73
			madvertisetextview.startAnimation(animation);
	//   34   68:aload_1         
	//   35   69:aload_2         
	//   36   70:invokevirtual   #748 <Method void MadvertiseTextView.startAnimation(Animation)>
	//   37   73:return          
	}

	public String getBannerType()
	{
		return mBannerType;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field String mBannerType>
	//    2    4:areturn         
	}

	MadvertiseViewCallbackListener getCallbackListener()
	{
		return mCallbackListener;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//    2    4:areturn         
	}

	protected void onAttachedToWindow()
	{
		MadvertiseUtil.logMessage(((String) (null)), 3, "#### onAttachedToWindow fired ####");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc2            #753 <String "#### onAttachedToWindow fired ####">
	//    3    5:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		onViewCallback(true);
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:invokespecial   #755 <Method void onViewCallback(boolean)>
		super.onAttachedToWindow();
	//    7   13:aload_0         
	//    8   14:invokespecial   #757 <Method void FrameLayout.onAttachedToWindow()>
	//    9   17:return          
	}

	protected void onDetachedFromWindow()
	{
		MadvertiseUtil.logMessage(((String) (null)), 3, "#### onDetachedFromWindow fired ####");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc2            #760 <String "#### onDetachedFromWindow fired ####">
	//    3    5:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		onViewCallback(false);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokespecial   #755 <Method void onViewCallback(boolean)>
		super.onDetachedFromWindow();
	//    7   13:aload_0         
	//    8   14:invokespecial   #762 <Method void FrameLayout.onDetachedFromWindow()>
	//    9   17:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #766 <Method void FrameLayout.onMeasure(int, int)>
		mParentWidth = android.view.View.MeasureSpec.getSize(i);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokestatic    #771 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    7   11:putfield        #129 <Field int mParentWidth>
		mParentHeight = android.view.View.MeasureSpec.getSize(j);
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:invokestatic    #771 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   19:putfield        #131 <Field int mParentHeight>
		setMeasuredDimension(mBannerWidth, mBannerHeight);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #123 <Field int mBannerWidth>
	//   15   27:aload_0         
	//   16   28:getfield        #121 <Field int mBannerHeight>
	//   17   31:invokevirtual   #774 <Method void setMeasuredDimension(int, int)>
	//   18   34:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		MadvertiseUtil.logMessage(((String) (null)), 3, "onTouchEvent(MotionEvent event) fired");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc2            #778 <String "onTouchEvent(MotionEvent event) fired">
	//    3    5:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		motionevent = ((MotionEvent) (mCurrentAd));
	//    4    8:aload_0         
	//    5    9:getfield        #311 <Field MadvertiseAd mCurrentAd>
	//    6   12:astore_1        
		if(motionevent != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          21
			((MadvertiseAd) (motionevent)).handleClick();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #781 <Method void MadvertiseAd.handleClick()>
		return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public void onWindowFocusChanged(boolean flag)
	{
		MadvertiseUtil.logMessage(((String) (null)), 3, "#### onWindowFocusChanged fired ####");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc2            #784 <String "#### onWindowFocusChanged fired ####">
	//    3    5:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		onViewCallback(flag);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #755 <Method void onViewCallback(boolean)>
		super.onWindowFocusChanged(flag);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #786 <Method void FrameLayout.onWindowFocusChanged(boolean)>
		getParent();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #790 <Method android.view.ViewParent getParent()>
	//   12   22:pop             
	//   13   23:return          
	}

	public void removeMadViewCallbackListener()
	{
		mCallbackListener = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #133 <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//    3    5:return          
	}

	public void setBannerType(String s)
	{
		mBannerType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field String mBannerType>
	//    3    5:return          
	}

	public void setFetchingAdsEnabled(boolean flag)
	{
		mFetchAdsEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #153 <Field boolean mFetchAdsEnabled>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #205 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #206 <Method void StringBuilder()>
	//    6   12:astore_2        
		stringbuilder.append("Set Fetching Ads to ");
	//    7   13:aload_2         
	//    8   14:ldc2            #794 <String "Set Fetching Ads to ">
	//    9   17:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(flag);
	//   11   21:aload_2         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #600 <Method StringBuilder StringBuilder.append(boolean)>
	//   14   26:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, stringbuilder.toString());
	//   15   27:aconst_null     
	//   16   28:iconst_3        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #229 <Method String StringBuilder.toString()>
	//   19   33:invokestatic    #166 <Method void MadvertiseUtil.logMessage(String, int, String)>
		if(!flag)
	//*  20   36:iload_1         
	//*  21   37:ifne            63
		{
			stopRequestThread();
	//   22   40:aload_0         
	//   23   41:invokevirtual   #652 <Method void stopRequestThread()>
			Timer timer = mAdTimer;
	//   24   44:aload_0         
	//   25   45:getfield        #135 <Field Timer mAdTimer>
	//   26   48:astore_2        
			if(timer != null)
	//*  27   49:aload_2         
	//*  28   50:ifnull          68
			{
				timer.cancel();
	//   29   53:aload_2         
	//   30   54:invokevirtual   #649 <Method void Timer.cancel()>
				mAdTimer = null;
	//   31   57:aload_0         
	//   32   58:aconst_null     
	//   33   59:putfield        #135 <Field Timer mAdTimer>
				return;
	//   34   62:return          
			}
		} else
		{
			onViewCallback(true);
	//   35   63:aload_0         
	//   36   64:iconst_1        
	//   37   65:invokespecial   #755 <Method void onViewCallback(boolean)>
		}
	//   38   68:return          
	}

	public void setMadvertiseViewCallbackListener(MadvertiseViewCallbackListener madvertiseviewcallbacklistener)
	{
		mCallbackListener = madvertiseviewcallbacklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #133 <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//    3    5:return          
	}

	public void setPlacementType(int i)
	{
		MadvertiseMraidView madvertisemraidview = mMraidView;
	//    0    0:aload_0         
	//    1    1:getfield        #729 <Field MadvertiseMraidView mMraidView>
	//    2    4:astore_2        
		if(madvertisemraidview != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			madvertisemraidview.setPlacementType(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #732 <Method void MadvertiseMraidView.setPlacementType(int)>
	//    8   14:return          
	}

	public void setVisibility(int i)
	{
		if(super.getVisibility() == i)
			break MISSING_BLOCK_LABEL_53;
	//    0    0:aload_0         
	//    1    1:invokespecial   #799 <Method int FrameLayout.getVisibility()>
	//    2    4:iload_1         
	//    3    5:icmpeq          53
		this;
	//    4    8:aload_0         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		int k = getChildCount();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #346 <Method int getChildCount()>
	//    8   14:istore_3        
		int j = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
_L2:
		if(j >= k)
			break; /* Loop/switch isn't completed */
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:icmpge          38
		getChildAt(j).setVisibility(i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:invokevirtual   #354 <Method View getChildAt(int)>
	//   17   27:iload_1         
	//   18   28:invokevirtual   #800 <Method void View.setVisibility(int)>
		j++;
	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_2        
		if(true) goto _L2; else goto _L1
	//   23   35:goto            17
_L1:
		super.setVisibility(i);
	//   24   38:aload_0         
	//   25   39:iload_1         
	//   26   40:invokespecial   #801 <Method void FrameLayout.setVisibility(int)>
		this;
	//   27   43:aload_0         
		JVM INSTR monitorexit ;
	//   28   44:monitorexit     
		return;
	//   29   45:return          
		Exception exception;
		exception;
	//   30   46:astore          4
		this;
	//   31   48:aload_0         
		JVM INSTR monitorexit ;
	//   32   49:monitorexit     
		throw exception;
	//   33   50:aload           4
	//   34   52:athrow          
	//   35   53:return          
	}

	public void stopRequestThread()
	{
		Thread thread = mRequestThread;
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field Thread mRequestThread>
	//    2    4:astore_1        
		if(thread != null && thread.isAlive())
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #264 <Method boolean Thread.isAlive()>
	//*   7   13:ifeq            23
			mRequestThread.interrupt();
	//    8   16:aload_0         
	//    9   17:getfield        #258 <Field Thread mRequestThread>
	//   10   20:invokevirtual   #804 <Method void Thread.interrupt()>
	//   11   23:return          
	}

	private static final int ANIMATION_COMPLETE = 2;
	public static final String GENDER_FEMALE = "F";
	public static final String GENDER_MALE = "M";
	private static final boolean IS_TESTMODE_DEFAULT = false;
	public static final int MAKE_VISIBLE = 0;
	private static boolean reportLauch = true;
	private static String sAge = "";
	private static String sGender = "";
	private static BitmapDrawable sTextBannerBackground;
	private final double GRADIENT_STOP;
	private final int GRADIENT_TOP_ALPHA;
	private Timer mAdTimer;
	private final AnimationEndListener mAnimationListener;
	private String mAnimationType;
	private int mBackgroundColor;
	private int mBannerHeight;
	private int mBannerHeightDp;
	private String mBannerType;
	private int mBannerWidth;
	private int mBannerWidthDp;
	private MadvertiseViewCallbackListener mCallbackListener;
	private MadvertiseAd mCurrentAd;
	private boolean mDeliverOnlyText;
	private float mDp;
	private boolean mFetchAdsEnabled;
	private final Handler mHandler;
	private Drawable mInitialBackground;
	private boolean mIsMraid;
	private MadvertiseMraidView mMraidView;
	private List mOldViews;
	private int mParentHeight;
	private int mParentWidth;
	private int mPlacementType;
	private Thread mRequestThread;
	private int mSecondsToRefreshAd;
	private boolean mTestMode;
	private int mTextColor;
	private int mTextSize;
	private final Runnable mUpdateResults;

	static 
	{
	//    0    0:return          
	}


/*
	static void access$000(MadvertiseView madvertiseview)
	{
		madvertiseview.removeOldViews();
	//    0    0:aload_0         
	//    1    1:invokespecial   #301 <Method void removeOldViews()>
		return;
	//    2    4:return          
	}

*/


/*
	static Handler access$100(MadvertiseView madvertiseview)
	{
		return madvertiseview.mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field Handler mHandler>
	//    2    4:areturn         
	}

*/


/*
	static int access$1000(MadvertiseView madvertiseview)
	{
		return madvertiseview.mParentHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field int mParentHeight>
	//    2    4:ireturn         
	}

*/


/*
	static int access$1002(MadvertiseView madvertiseview, int i)
	{
		madvertiseview.mParentHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #131 <Field int mParentHeight>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static MadvertiseAd access$1102(MadvertiseView madvertiseview, MadvertiseAd madvertisead)
	{
		madvertiseview.mCurrentAd = madvertisead;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #311 <Field MadvertiseAd mCurrentAd>
		return madvertisead;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$1200(MadvertiseView madvertiseview)
	{
		madvertiseview.calculateBannerDimensions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #315 <Method void calculateBannerDimensions()>
		return;
	//    2    4:return          
	}

*/


/*
	static Runnable access$1300(MadvertiseView madvertiseview)
	{
		return madvertiseview.mUpdateResults;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field Runnable mUpdateResults>
	//    2    4:areturn         
	}

*/


/*
	static void access$1400(MadvertiseView madvertiseview)
	{
		madvertiseview.refreshView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #321 <Method void refreshView()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1500(MadvertiseView madvertiseview, boolean flag)
	{
		madvertiseview.requestNewAd(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #267 <Method void requestNewAd(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static MadvertiseViewCallbackListener access$200(MadvertiseView madvertiseview)
	{
		return madvertiseview.mCallbackListener;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field MadvertiseView$MadvertiseViewCallbackListener mCallbackListener>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$300(MadvertiseView madvertiseview)
	{
		return madvertiseview.mTestMode;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean mTestMode>
	//    2    4:ireturn         
	}

*/


/*
	static String access$400(MadvertiseView madvertiseview)
	{
		return madvertiseview.mBannerType;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field String mBannerType>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$500(MadvertiseView madvertiseview)
	{
		return madvertiseview.mDeliverOnlyText;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field boolean mDeliverOnlyText>
	//    2    4:ireturn         
	}

*/


/*
	static String access$600()
	{
		return sAge;
	//    0    0:getstatic       #333 <Field String sAge>
	//    1    3:areturn         
	}

*/


/*
	static boolean access$700(MadvertiseView madvertiseview)
	{
		return madvertiseview.mIsMraid;
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field boolean mIsMraid>
	//    2    4:ireturn         
	}

*/


/*
	static String access$800()
	{
		return sGender;
	//    0    0:getstatic       #339 <Field String sGender>
	//    1    3:areturn         
	}

*/


/*
	static int access$900(MadvertiseView madvertiseview)
	{
		return madvertiseview.mParentWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mParentWidth>
	//    2    4:ireturn         
	}

*/


/*
	static int access$902(MadvertiseView madvertiseview, int i)
	{
		madvertiseview.mParentWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #129 <Field int mParentWidth>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
