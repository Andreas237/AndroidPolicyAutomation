// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.ads.splash.SplashHideListener;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.a.e;
import com.startapp.android.publish.adsCommon.activities.AppWallActivity;
import com.startapp.android.publish.adsCommon.activities.OverlayActivity;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.cache.a;
import com.startapp.android.publish.cache.c;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.g;
import com.startapp.common.b;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			Ad, f, m, StartAppSDK, 
//			b, n, g, c, 
//			e, k, VideoListener, AutoInterstitialPreferences

public class StartAppAd extends Ad
{
	public static final class AdMode extends Enum
	{

		public static AdMode valueOf(String s)
		{
			return (AdMode)Enum.valueOf(com/startapp/android/publish/adsCommon/StartAppAd$AdMode, s);
		//    0    0:ldc1            #2   <Class StartAppAd$AdMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class StartAppAd$AdMode>
		//    4    9:areturn         
		}

		public static AdMode[] values()
		{
			return (AdMode[])((AdMode []) ($VALUES)).clone();
		//    0    0:getstatic       #44  <Field StartAppAd$AdMode[] $VALUES>
		//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.StartAppAd$AdMode_3B_.clone()>
		//    2    6:checkcast       #55  <Class StartAppAd$AdMode[]>
		//    3    9:areturn         
		}

		private static final AdMode $VALUES[];
		public static final AdMode AUTOMATIC;
		public static final AdMode FULLPAGE;
		public static final AdMode OFFERWALL;
		public static final AdMode OVERLAY;
		public static final AdMode REWARDED_VIDEO;
		public static final AdMode VIDEO;

		static 
		{
			AUTOMATIC = new AdMode("AUTOMATIC", 0);
		//    0    0:new             #2   <Class StartAppAd$AdMode>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "AUTOMATIC">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
		//    5   10:putstatic       #27  <Field StartAppAd$AdMode AUTOMATIC>
			FULLPAGE = new AdMode("FULLPAGE", 1);
		//    6   13:new             #2   <Class StartAppAd$AdMode>
		//    7   16:dup             
		//    8   17:ldc1            #28  <String "FULLPAGE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
		//   11   23:putstatic       #30  <Field StartAppAd$AdMode FULLPAGE>
			OFFERWALL = new AdMode("OFFERWALL", 2);
		//   12   26:new             #2   <Class StartAppAd$AdMode>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "OFFERWALL">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
		//   17   36:putstatic       #33  <Field StartAppAd$AdMode OFFERWALL>
			REWARDED_VIDEO = new AdMode("REWARDED_VIDEO", 3);
		//   18   39:new             #2   <Class StartAppAd$AdMode>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "REWARDED_VIDEO">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
		//   23   49:putstatic       #36  <Field StartAppAd$AdMode REWARDED_VIDEO>
			VIDEO = new AdMode("VIDEO", 4);
		//   24   52:new             #2   <Class StartAppAd$AdMode>
		//   25   55:dup             
		//   26   56:ldc1            #37  <String "VIDEO">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
		//   29   62:putstatic       #39  <Field StartAppAd$AdMode VIDEO>
			OVERLAY = new AdMode("OVERLAY", 5);
		//   30   65:new             #2   <Class StartAppAd$AdMode>
		//   31   68:dup             
		//   32   69:ldc1            #40  <String "OVERLAY">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
		//   35   75:putstatic       #42  <Field StartAppAd$AdMode OVERLAY>
			$VALUES = (new AdMode[] {
				AUTOMATIC, FULLPAGE, OFFERWALL, REWARDED_VIDEO, VIDEO, OVERLAY
			});
		//   36   78:bipush          6
		//   37   80:anewarray       AdMode[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #27  <Field StartAppAd$AdMode AUTOMATIC>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #30  <Field StartAppAd$AdMode FULLPAGE>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #33  <Field StartAppAd$AdMode OFFERWALL>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #36  <Field StartAppAd$AdMode REWARDED_VIDEO>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #39  <Field StartAppAd$AdMode VIDEO>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #42  <Field StartAppAd$AdMode OVERLAY>
		//   61  118:aastore         
		//   62  119:putstatic       #44  <Field StartAppAd$AdMode[] $VALUES>
		//*  63  122:return          
		}

		private AdMode(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #46  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public StartAppAd(Context context)
	{
		super(context, ((com.startapp.android.publish.common.model.AdPreferences.Placement) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #49  <Method void Ad(Context, com.startapp.android.publish.common.model.AdPreferences$Placement)>
		adKey = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #51  <Field c adKey>
		ad = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
		adMode = AdMode.AUTOMATIC;
	//   10   16:aload_0         
	//   11   17:getstatic       #56  <Field StartAppAd$AdMode StartAppAd$AdMode.AUTOMATIC>
	//   12   20:putfield        #58  <Field StartAppAd$AdMode adMode>
		adPreferences = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #60  <Field AdPreferences adPreferences>
		videoListener = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #62  <Field VideoListener videoListener>
		callback = null;
	//   19   33:aload_0         
	//   20   34:aconst_null     
	//   21   35:putfield        #64  <Field AdDisplayListener callback>
		callbackBroadcastReceiver = ((BroadcastReceiver) (new BroadcastReceiver() {

			private void a(Context context1)
			{
				b.a(context1).a(((BroadcastReceiver) (this)));
			//    0    0:aload_1         
			//    1    1:invokestatic    #24  <Method b b.a(Context)>
			//    2    4:aload_0         
			//    3    5:invokevirtual   #27  <Method void b.a(BroadcastReceiver)>
			//    4    8:return          
			}

			public void onReceive(Context context1, Intent intent)
			{
				if(!intent.getAction().equals("com.startapp.android.ShowFailedDisplayBroadcastListener")) goto _L2; else goto _L1
			//    0    0:aload_2         
			//    1    1:invokevirtual   #35  <Method String Intent.getAction()>
			//    2    4:ldc1            #37  <String "com.startapp.android.ShowFailedDisplayBroadcastListener">
			//    3    6:invokevirtual   #43  <Method boolean String.equals(Object)>
			//    4    9:ifeq            83
_L1:
				if(intent.getExtras().containsKey("showFailedReason"))
			//*   5   12:aload_2         
			//*   6   13:invokevirtual   #47  <Method Bundle Intent.getExtras()>
			//*   7   16:ldc1            #49  <String "showFailedReason">
			//*   8   18:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
			//*   9   21:ifeq            43
					a.setNotDisplayedReason((com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason)intent.getExtras().getSerializable("showFailedReason"));
			//   10   24:aload_0         
			//   11   25:getfield        #14  <Field StartAppAd a>
			//   12   28:aload_2         
			//   13   29:invokevirtual   #47  <Method Bundle Intent.getExtras()>
			//   14   32:ldc1            #49  <String "showFailedReason">
			//   15   34:invokevirtual   #59  <Method java.io.Serializable Bundle.getSerializable(String)>
			//   16   37:checkcast       #61  <Class com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason>
			//   17   40:invokevirtual   #65  <Method void StartAppAd.setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
				if(a.callback != null)
			//*  18   43:aload_0         
			//*  19   44:getfield        #14  <Field StartAppAd a>
			//*  20   47:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
			//*  21   50:ifnull          69
					a.callback.adNotDisplayed(((Ad) (a)));
			//   22   53:aload_0         
			//   23   54:getfield        #14  <Field StartAppAd a>
			//   24   57:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
			//   25   60:aload_0         
			//   26   61:getfield        #14  <Field StartAppAd a>
			//   27   64:invokeinterface #75  <Method void AdDisplayListener.adNotDisplayed(Ad)>
				a(context1);
			//   28   69:aload_0         
			//   29   70:aload_1         
			//   30   71:invokespecial   #77  <Method void a(Context)>
_L4:
				a.ad = null;
			//   31   74:aload_0         
			//   32   75:getfield        #14  <Field StartAppAd a>
			//   33   78:aconst_null     
			//   34   79:putfield        #81  <Field com.startapp.android.publish.adsCommon.g StartAppAd.ad>
				return;
			//   35   82:return          
_L2:
				if(intent.getAction().equals("com.startapp.android.ShowDisplayBroadcastListener"))
			//*  36   83:aload_2         
			//*  37   84:invokevirtual   #35  <Method String Intent.getAction()>
			//*  38   87:ldc1            #83  <String "com.startapp.android.ShowDisplayBroadcastListener">
			//*  39   89:invokevirtual   #43  <Method boolean String.equals(Object)>
			//*  40   92:ifeq            124
				{
					if(a.callback != null)
			//*  41   95:aload_0         
			//*  42   96:getfield        #14  <Field StartAppAd a>
			//*  43   99:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
			//*  44  102:ifnull          74
						a.callback.adDisplayed(((Ad) (a)));
			//   45  105:aload_0         
			//   46  106:getfield        #14  <Field StartAppAd a>
			//   47  109:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
			//   48  112:aload_0         
			//   49  113:getfield        #14  <Field StartAppAd a>
			//   50  116:invokeinterface #86  <Method void AdDisplayListener.adDisplayed(Ad)>
				} else
			//*  51  121:goto            74
				if(intent.getAction().equals("com.startapp.android.OnClickCallback"))
			//*  52  124:aload_2         
			//*  53  125:invokevirtual   #35  <Method String Intent.getAction()>
			//*  54  128:ldc1            #88  <String "com.startapp.android.OnClickCallback">
			//*  55  130:invokevirtual   #43  <Method boolean String.equals(Object)>
			//*  56  133:ifeq            165
				{
					if(a.callback != null)
			//*  57  136:aload_0         
			//*  58  137:getfield        #14  <Field StartAppAd a>
			//*  59  140:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
			//*  60  143:ifnull          74
						a.callback.adClicked(((Ad) (a)));
			//   61  146:aload_0         
			//   62  147:getfield        #14  <Field StartAppAd a>
			//   63  150:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
			//   64  153:aload_0         
			//   65  154:getfield        #14  <Field StartAppAd a>
			//   66  157:invokeinterface #91  <Method void AdDisplayListener.adClicked(Ad)>
				} else
			//*  67  162:goto            74
				if(intent.getAction().equals("com.startapp.android.OnVideoCompleted"))
			//*  68  165:aload_2         
			//*  69  166:invokevirtual   #35  <Method String Intent.getAction()>
			//*  70  169:ldc1            #93  <String "com.startapp.android.OnVideoCompleted">
			//*  71  171:invokevirtual   #43  <Method boolean String.equals(Object)>
			//*  72  174:ifeq            212
				{
					if(a.videoListener != null)
			//*  73  177:aload_0         
			//*  74  178:getfield        #14  <Field StartAppAd a>
			//*  75  181:getfield        #97  <Field VideoListener StartAppAd.videoListener>
			//*  76  184:ifnull          74
						(new Handler(Looper.getMainLooper())).post(new Runnable(this) {

							public void run()
							{
								a.a.videoListener.onVideoCompleted();
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field StartAppAd$1 a>
							//    2    4:getfield        #25  <Field StartAppAd com.startapp.android.publish.adsCommon.StartAppAd$1.a>
							//    3    7:getfield        #31  <Field VideoListener StartAppAd.videoListener>
							//    4   10:invokeinterface #36  <Method void VideoListener.onVideoCompleted()>
							//    5   15:return          
							}

							final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field StartAppAd$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
						}
);
			//   77  187:new             #99  <Class Handler>
			//   78  190:dup             
			//   79  191:invokestatic    #105 <Method Looper Looper.getMainLooper()>
			//   80  194:invokespecial   #108 <Method void Handler(Looper)>
			//   81  197:new             #8   <Class StartAppAd$1$1>
			//   82  200:dup             
			//   83  201:aload_0         
			//   84  202:invokespecial   #111 <Method void StartAppAd$1$1(StartAppAd$1)>
			//   85  205:invokevirtual   #115 <Method boolean Handler.post(Runnable)>
			//   86  208:pop             
				} else
			//*  87  209:goto            74
				{
					if(a.callback != null)
			//*  88  212:aload_0         
			//*  89  213:getfield        #14  <Field StartAppAd a>
			//*  90  216:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
			//*  91  219:ifnull          238
						a.callback.adHidden(((Ad) (a)));
			//   92  222:aload_0         
			//   93  223:getfield        #14  <Field StartAppAd a>
			//   94  226:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
			//   95  229:aload_0         
			//   96  230:getfield        #14  <Field StartAppAd a>
			//   97  233:invokeinterface #118 <Method void AdDisplayListener.adHidden(Ad)>
					a(context1);
			//   98  238:aload_0         
			//   99  239:aload_1         
			//  100  240:invokespecial   #77  <Method void a(Context)>
				}
				if(true) goto _L4; else goto _L3
			//  101  243:goto            74
_L3:
			}

			final StartAppAd a;

			
			{
				a = StartAppAd.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field StartAppAd a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   22   38:aload_0         
	//   23   39:new             #6   <Class StartAppAd$1>
	//   24   42:dup             
	//   25   43:aload_0         
	//   26   44:invokespecial   #67  <Method void StartAppAd$1(StartAppAd)>
	//   27   47:putfield        #69  <Field BroadcastReceiver callbackBroadcastReceiver>
	//   28   50:return          
	}

	public static void disableAutoInterstitial()
	{
		com.startapp.android.publish.adsCommon.f.a().c();
	//    0    0:invokestatic    #76  <Method com.startapp.android.publish.adsCommon.f com.startapp.android.publish.adsCommon.f.a()>
	//    1    3:invokevirtual   #79  <Method void com.startapp.android.publish.adsCommon.f.c()>
	//    2    6:return          
	}

	public static void disableSplash()
	{
		com.startapp.android.publish.adsCommon.m.a().j();
	//    0    0:invokestatic    #85  <Method m com.startapp.android.publish.adsCommon.m.a()>
	//    1    3:invokevirtual   #88  <Method void m.j()>
	//    2    6:return          
	}

	public static void enableAutoInterstitial()
	{
		com.startapp.android.publish.adsCommon.f.a().b();
	//    0    0:invokestatic    #76  <Method com.startapp.android.publish.adsCommon.f com.startapp.android.publish.adsCommon.f.a()>
	//    1    3:invokevirtual   #92  <Method void com.startapp.android.publish.adsCommon.f.b()>
	//    2    6:return          
	}

	public static void init(Context context, String s, String s1)
	{
		StartAppSDK.init(context, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #98  <Method void StartAppSDK.init(Context, String, String)>
	//    4    6:return          
	}

	private boolean isAppOnForeground()
	{
label0:
		{
label1:
			{
				boolean flag;
				try
				{
					if(!com.startapp.android.publish.adsCommon.b.a().M())
						break label1;
	//    0    0:invokestatic    #107 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//    1    3:invokevirtual   #110 <Method boolean b.M()>
	//    2    6:ifeq            21
					flag = i.e(context);
	//    3    9:aload_0         
	//    4   10:getfield        #114 <Field Context context>
	//    5   13:invokestatic    #120 <Method boolean i.e(Context)>
	//    6   16:istore_1        
				}
	//*   7   17:iload_1         
	//*   8   18:ifeq            23
	//*   9   21:iconst_1        
	//*  10   22:ireturn         
	//*  11   23:iconst_0        
	//*  12   24:ireturn         
				catch(Exception exception)
	//*  13   25:astore_2        
				{
					return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
				}
				if(!flag)
					break label0;
			}
			return true;
		}
		return false;
	}

	public static void onBackPressed(Context context)
	{
		(new StartAppAd(context)).onBackPressed();
	//    0    0:new             #2   <Class StartAppAd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #123 <Method void StartAppAd(Context)>
	//    4    8:invokevirtual   #125 <Method void onBackPressed()>
	//    5   11:return          
	}

	private void registerBroadcastReceiver(String s)
	{
		b.a(context).a(callbackBroadcastReceiver, new IntentFilter(s));
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Context context>
	//    2    4:invokestatic    #132 <Method b b.a(Context)>
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field BroadcastReceiver callbackBroadcastReceiver>
	//    5   11:new             #134 <Class IntentFilter>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #136 <Method void IntentFilter(String)>
	//    9   19:invokevirtual   #139 <Method void b.a(BroadcastReceiver, IntentFilter)>
	//   10   22:return          
	}

	private void setAdMode(AdMode admode)
	{
		adMode = admode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field StartAppAd$AdMode adMode>
	//    3    5:return          
	}

	private void setAdPrefs(AdPreferences adpreferences)
	{
		adPreferences = adpreferences;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field AdPreferences adPreferences>
	//    3    5:return          
	}

	public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autointerstitialpreferences)
	{
		com.startapp.android.publish.adsCommon.f.a().a(autointerstitialpreferences);
	//    0    0:invokestatic    #76  <Method com.startapp.android.publish.adsCommon.f com.startapp.android.publish.adsCommon.f.a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #147 <Method void com.startapp.android.publish.adsCommon.f.a(AutoInterstitialPreferences)>
	//    3    7:return          
	}

	public static boolean showAd(Context context)
	{
		boolean flag;
		try
		{
			flag = (new StartAppAd(context)).showAd();
	//    0    0:new             #2   <Class StartAppAd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #123 <Method void StartAppAd(Context)>
	//    4    8:invokevirtual   #150 <Method boolean showAd()>
	//    5   11:istore_1        
		}
	//*   6   12:iload_1         
	//*   7   13:ireturn         
		catch(Exception exception)
	//*   8   14:astore_2        
		{
			f.a(context, d.b, "StartAppAd.showAd(one line integration) - unexpected Error occurd", exception.getMessage(), "");
	//    9   15:aload_0         
	//   10   16:getstatic       #155 <Field d d.b>
	//   11   19:ldc1            #157 <String "StartAppAd.showAd(one line integration) - unexpected Error occurd">
	//   12   21:aload_2         
	//   13   22:invokevirtual   #161 <Method String Exception.getMessage()>
	//   14   25:ldc1            #163 <String "">
	//   15   27:invokestatic    #168 <Method void f.a(Context, d, String, String, String)>
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		}
		return flag;
	}

	private boolean showPreparedVideoFallbackAd(String s)
	{
		if(!canShowAd() || !com.startapp.android.publish.adsCommon.b.a().G().h())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #173 <Method boolean canShowAd()>
	//*   2    4:ifeq            19
	//*   3    7:invokestatic    #107 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//*   4   10:invokevirtual   #177 <Method n b.G()>
	//*   5   13:invokevirtual   #182 <Method boolean n.h()>
	//*   6   16:ifne            21
			return false;
	//    7   19:iconst_0        
	//    8   20:ireturn         
		Object obj;
		com.startapp.android.publish.common.model.AdPreferences.Placement placement;
		if(adPreferences == null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #60  <Field AdPreferences adPreferences>
	//*  11   25:ifnonnull       125
			obj = ((Object) (new AdPreferences()));
	//   12   28:new             #184 <Class AdPreferences>
	//   13   31:dup             
	//   14   32:invokespecial   #186 <Method void AdPreferences()>
	//   15   35:astore_2        
		else
	//*  16   36:aload_2         
	//*  17   37:getstatic       #192 <Field Ad$AdType Ad$AdType.NON_VIDEO>
	//*  18   40:invokevirtual   #196 <Method void AdPreferences.setType(Ad$AdType)>
	//*  19   43:aload_0         
	//*  20   44:invokevirtual   #200 <Method com.startapp.android.publish.common.model.AdPreferences$Placement getPlacement()>
	//*  21   47:astore_3        
	//*  22   48:invokestatic    #205 <Method a a.a()>
	//*  23   51:new             #207 <Class c>
	//*  24   54:dup             
	//*  25   55:aload_3         
	//*  26   56:aload_2         
	//*  27   57:invokespecial   #210 <Method void c(com.startapp.android.publish.common.model.AdPreferences$Placement, AdPreferences)>
	//*  28   60:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//*  29   63:astore_2        
	//*  30   64:aload_2         
	//*  31   65:ifnull          133
	//*  32   68:aload_2         
	//*  33   69:invokeinterface #218 <Method boolean g.isReady()>
	//*  34   74:ifeq            133
	//*  35   77:aload_0         
	//*  36   78:aload_1         
	//*  37   79:aload_3         
	//*  38   80:invokevirtual   #222 <Method com.startapp.android.publish.adsCommon.a.f shouldDisplayAd(String, com.startapp.android.publish.common.model.AdPreferences$Placement)>
	//*  39   83:invokevirtual   #226 <Method boolean com.startapp.android.publish.adsCommon.a.f.a()>
	//*  40   86:ifeq            133
	//*  41   89:aload_2         
	//*  42   90:iconst_1        
	//*  43   91:invokeinterface #230 <Method void g.setVideoCancelCallBack(boolean)>
	//*  44   96:invokestatic    #235 <Method Boolean Constants.a()>
	//*  45   99:invokevirtual   #240 <Method boolean Boolean.booleanValue()>
	//*  46  102:ifeq            117
	//*  47  105:invokestatic    #245 <Method com.startapp.common.a.i com.startapp.common.a.i.a()>
	//*  48  108:aload_0         
	//*  49  109:getfield        #114 <Field Context context>
	//*  50  112:ldc1            #247 <String "display Video fallback">
	//*  51  114:invokevirtual   #250 <Method void com.startapp.common.a.i.a(Context, String)>
	//*  52  117:aload_2         
	//*  53  118:aload_1         
	//*  54  119:invokeinterface #252 <Method boolean com.startapp.android.publish.adsCommon.g.a(String)>
	//*  55  124:ireturn         
			obj = ((Object) (adPreferences));
	//   56  125:aload_0         
	//   57  126:getfield        #60  <Field AdPreferences adPreferences>
	//   58  129:astore_2        
		((AdPreferences) (obj)).setType(Ad.AdType.NON_VIDEO);
		placement = getPlacement();
		obj = ((Object) (a.a().b(new c(placement, ((AdPreferences) (obj))))));
		if(obj != null && ((com.startapp.android.publish.adsCommon.g) (obj)).isReady() && shouldDisplayAd(s, placement).a())
		{
			((com.startapp.android.publish.adsCommon.g) (obj)).setVideoCancelCallBack(true);
			if(Constants.a().booleanValue())
				com.startapp.common.a.i.a().a(context, "display Video fallback");
			return ((com.startapp.android.publish.adsCommon.g) (obj)).a(s);
		} else
	//*  59  130:goto            36
		{
			return false;
	//   60  133:iconst_0        
	//   61  134:ireturn         
		}
	}

	public static void showSplash(Activity activity, Bundle bundle)
	{
		showSplash(activity, bundle, new SplashConfig());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #256 <Class SplashConfig>
	//    3    5:dup             
	//    4    6:invokespecial   #257 <Method void SplashConfig()>
	//    5    9:invokestatic    #260 <Method void showSplash(Activity, Bundle, SplashConfig)>
	//    6   12:return          
	}

	public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashconfig)
	{
		showSplash(activity, bundle, splashconfig, new AdPreferences());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #184 <Class AdPreferences>
	//    4    6:dup             
	//    5    7:invokespecial   #186 <Method void AdPreferences()>
	//    6   10:invokestatic    #263 <Method void showSplash(Activity, Bundle, SplashConfig, AdPreferences)>
	//    7   13:return          
	}

	public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashconfig, AdPreferences adpreferences)
	{
		showSplash(activity, bundle, splashconfig, adpreferences, ((SplashHideListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokestatic    #266 <Method void showSplash(Activity, Bundle, SplashConfig, AdPreferences, SplashHideListener)>
	//    6    8:return          
	}

	public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashconfig, AdPreferences adpreferences, SplashHideListener splashhidelistener)
	{
		showSplash(activity, bundle, splashconfig, adpreferences, splashhidelistener, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iconst_1        
	//    6    7:invokestatic    #269 <Method void showSplash(Activity, Bundle, SplashConfig, AdPreferences, SplashHideListener, boolean)>
	//    7   10:return          
	}

	static void showSplash(Activity activity, Bundle bundle, SplashConfig splashconfig, AdPreferences adpreferences, SplashHideListener splashhidelistener, boolean flag)
	{
		if(bundle != null || !MetaData.getInstance().canShowAd())
			break MISSING_BLOCK_LABEL_177;
	//    0    0:aload_1         
	//    1    1:ifnonnull       177
	//    2    4:invokestatic    #275 <Method MetaData MetaData.getInstance()>
	//    3    7:invokevirtual   #276 <Method boolean MetaData.canShowAd()>
	//    4   10:ifeq            177
		com.startapp.android.publish.adsCommon.m.a().c(flag);
	//    5   13:invokestatic    #85  <Method m com.startapp.android.publish.adsCommon.m.a()>
	//    6   16:iload           5
	//    7   18:invokevirtual   #278 <Method void com.startapp.android.publish.adsCommon.m.c(boolean)>
		bundle = ((Bundle) (adpreferences));
	//    8   21:aload_3         
	//    9   22:astore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_51;
	//   10   23:iload           5
	//   11   25:ifne            51
		bundle = ((Bundle) (adpreferences));
	//   12   28:aload_3         
	//   13   29:astore_1        
		if(adpreferences != null)
			break MISSING_BLOCK_LABEL_42;
	//   14   30:aload_3         
	//   15   31:ifnonnull       42
		bundle = ((Bundle) (new AdPreferences()));
	//   16   34:new             #184 <Class AdPreferences>
	//   17   37:dup             
	//   18   38:invokespecial   #186 <Method void AdPreferences()>
	//   19   41:astore_1        
		((AdPreferences) (bundle)).setAs(Boolean.valueOf(true));
	//   20   42:aload_1         
	//   21   43:iconst_1        
	//   22   44:invokestatic    #282 <Method Boolean Boolean.valueOf(boolean)>
	//   23   47:invokevirtual   #286 <Method AdPreferences AdPreferences.setAs(Boolean)>
	//   24   50:pop             
		splashconfig.setDefaults(((Context) (activity)));
	//   25   51:aload_2         
	//   26   52:aload_0         
	//   27   53:invokevirtual   #289 <Method void SplashConfig.setDefaults(Context)>
		i.a(activity, true);
	//   28   56:aload_0         
	//   29   57:iconst_1        
	//   30   58:invokestatic    #292 <Method void i.a(Activity, boolean)>
		adpreferences = ((AdPreferences) (new Intent(((Context) (activity)), i.a(((Context) (activity)), com/startapp/android/publish/adsCommon/activities/OverlayActivity, com/startapp/android/publish/adsCommon/activities/AppWallActivity))));
	//   31   61:new             #294 <Class Intent>
	//   32   64:dup             
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:ldc2            #296 <Class OverlayActivity>
	//   36   70:ldc2            #298 <Class AppWallActivity>
	//   37   73:invokestatic    #301 <Method Class i.a(Context, Class, Class)>
	//   38   76:invokespecial   #304 <Method void Intent(Context, Class)>
	//   39   79:astore_3        
		((Intent) (adpreferences)).putExtra("SplashConfig", ((java.io.Serializable) (splashconfig)));
	//   40   80:aload_3         
	//   41   81:ldc2            #306 <String "SplashConfig">
	//   42   84:aload_2         
	//   43   85:invokevirtual   #310 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   44   88:pop             
		((Intent) (adpreferences)).putExtra("AdPreference", ((java.io.Serializable) (bundle)));
	//   45   89:aload_3         
	//   46   90:ldc2            #312 <String "AdPreference">
	//   47   93:aload_1         
	//   48   94:invokevirtual   #310 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   49   97:pop             
		((Intent) (adpreferences)).putExtra("testMode", testMode);
	//   50   98:aload_3         
	//   51   99:ldc2            #313 <String "testMode">
	//   52  102:getstatic       #43  <Field boolean testMode>
	//   53  105:invokevirtual   #316 <Method Intent Intent.putExtra(String, boolean)>
	//   54  108:pop             
		((Intent) (adpreferences)).putExtra("fullscreen", com.startapp.android.publish.adsCommon.c.a(activity));
	//   55  109:aload_3         
	//   56  110:ldc2            #318 <String "fullscreen">
	//   57  113:aload_0         
	//   58  114:invokestatic    #323 <Method boolean com.startapp.android.publish.adsCommon.c.a(Activity)>
	//   59  117:invokevirtual   #316 <Method Intent Intent.putExtra(String, boolean)>
	//   60  120:pop             
		((Intent) (adpreferences)).putExtra("placement", com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_SPLASH.getIndex());
	//   61  121:aload_3         
	//   62  122:ldc2            #325 <String "placement">
	//   63  125:getstatic       #331 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_SPLASH>
	//   64  128:invokevirtual   #335 <Method int com.startapp.android.publish.common.model.AdPreferences$Placement.getIndex()>
	//   65  131:invokevirtual   #338 <Method Intent Intent.putExtra(String, int)>
	//   66  134:pop             
		((Intent) (adpreferences)).addFlags(0x44008000);
	//   67  135:aload_3         
	//   68  136:ldc2            #339 <Int 0x44008000>
	//   69  139:invokevirtual   #343 <Method Intent Intent.addFlags(int)>
	//   70  142:pop             
		activity.startActivity(((Intent) (adpreferences)));
	//   71  143:aload_0         
	//   72  144:aload_3         
	//   73  145:invokevirtual   #349 <Method void Activity.startActivity(Intent)>
		bundle = ((Bundle) (new BroadcastReceiver(activity, splashhidelistener) {

			public void onReceive(Context context, Intent intent)
			{
				i.a(a, false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field Activity a>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #30  <Method void i.a(Activity, boolean)>
				if(b != null)
			//*   4    8:aload_0         
			//*   5    9:getfield        #19  <Field SplashHideListener b>
			//*   6   12:ifnull          24
					b.splashHidden();
			//    7   15:aload_0         
			//    8   16:getfield        #19  <Field SplashHideListener b>
			//    9   19:invokeinterface #35  <Method void SplashHideListener.splashHidden()>
				com.startapp.common.b.a(((Context) (a))).a(((BroadcastReceiver) (this)));
			//   10   24:aload_0         
			//   11   25:getfield        #17  <Field Activity a>
			//   12   28:invokestatic    #40  <Method b b.a(Context)>
			//   13   31:aload_0         
			//   14   32:invokevirtual   #43  <Method void b.a(BroadcastReceiver)>
			//   15   35:return          
			}

			final Activity a;
			final SplashHideListener b;

			
			{
				a = activity;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Activity a>
				b = splashhidelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field SplashHideListener b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void BroadcastReceiver()>
			//    8   14:return          
			}
		}
));
	//   74  148:new             #10  <Class StartAppAd$2>
	//   75  151:dup             
	//   76  152:aload_0         
	//   77  153:aload           4
	//   78  155:invokespecial   #352 <Method void StartAppAd$2(Activity, SplashHideListener)>
	//   79  158:astore_1        
		b.a(((Context) (activity))).a(((BroadcastReceiver) (bundle)), new IntentFilter("com.startapp.android.splashHidden"));
	//   80  159:aload_0         
	//   81  160:invokestatic    #132 <Method b b.a(Context)>
	//   82  163:aload_1         
	//   83  164:new             #134 <Class IntentFilter>
	//   84  167:dup             
	//   85  168:ldc2            #354 <String "com.startapp.android.splashHidden">
	//   86  171:invokespecial   #136 <Method void IntentFilter(String)>
	//   87  174:invokevirtual   #139 <Method void b.a(BroadcastReceiver, IntentFilter)>
_L1:
		return;
	//   88  177:return          
		bundle;
	//   89  178:astore_1        
		if(splashhidelistener != null)
	//*  90  179:aload           4
	//*  91  181:ifnull          177
		{
			splashhidelistener.splashHidden();
	//   92  184:aload           4
	//   93  186:invokeinterface #359 <Method void SplashHideListener.splashHidden()>
			f.a(((Context) (activity)), d.b, "StartAppAd.showSplash - unexpected Error occurd", ((Exception) (bundle)).getMessage(), "");
	//   94  191:aload_0         
	//   95  192:getstatic       #155 <Field d d.b>
	//   96  195:ldc2            #361 <String "StartAppAd.showSplash - unexpected Error occurd">
	//   97  198:aload_1         
	//   98  199:invokevirtual   #161 <Method String Exception.getMessage()>
	//   99  202:ldc1            #163 <String "">
	//  100  204:invokestatic    #168 <Method void f.a(Context, d, String, String, String)>
			return;
	//  101  207:return          
		}
		  goto _L1
	}

	public static void showSplash(Activity activity, Bundle bundle, AdPreferences adpreferences)
	{
		showSplash(activity, bundle, new SplashConfig(), adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #256 <Class SplashConfig>
	//    3    5:dup             
	//    4    6:invokespecial   #257 <Method void SplashConfig()>
	//    5    9:aload_2         
	//    6   10:invokestatic    #263 <Method void showSplash(Activity, Bundle, SplashConfig, AdPreferences)>
	//    7   13:return          
	}

	public void close()
	{
		if(callbackBroadcastReceiver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field BroadcastReceiver callbackBroadcastReceiver>
	//*   2    4:ifnull          21
			b.a(context).a(callbackBroadcastReceiver);
	//    3    7:aload_0         
	//    4    8:getfield        #114 <Field Context context>
	//    5   11:invokestatic    #132 <Method b b.a(Context)>
	//    6   14:aload_0         
	//    7   15:getfield        #69  <Field BroadcastReceiver callbackBroadcastReceiver>
	//    8   18:invokevirtual   #366 <Method void b.a(BroadcastReceiver)>
		Intent intent = new Intent("com.startapp.android.CloseAdActivity");
	//    9   21:new             #294 <Class Intent>
	//   10   24:dup             
	//   11   25:ldc2            #368 <String "com.startapp.android.CloseAdActivity">
	//   12   28:invokespecial   #369 <Method void Intent(String)>
	//   13   31:astore_1        
		b.a(context).a(intent);
	//   14   32:aload_0         
	//   15   33:getfield        #114 <Field Context context>
	//   16   36:invokestatic    #132 <Method b b.a(Context)>
	//   17   39:aload_1         
	//   18   40:invokevirtual   #372 <Method boolean b.a(Intent)>
	//   19   43:pop             
	//   20   44:return          
	}

	protected String getAdHtml()
	{
		com.startapp.android.publish.adsCommon.g g1 = a.a().b(adKey);
	//    0    0:invokestatic    #205 <Method a a.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #51  <Field c adKey>
	//    3    7:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//    4   10:astore_1        
		if(g1 != null && (g1 instanceof com.startapp.android.publish.adsCommon.e))
	//*   5   11:aload_1         
	//*   6   12:ifnull          30
	//*   7   15:aload_1         
	//*   8   16:instanceof      #375 <Class com.startapp.android.publish.adsCommon.e>
	//*   9   19:ifeq            30
			return ((com.startapp.android.publish.adsCommon.e)g1).();
	//   10   22:aload_1         
	//   11   23:checkcast       #375 <Class com.startapp.android.publish.adsCommon.e>
	//   12   26:invokevirtual   #378 <Method String f()>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	protected String getLauncherName()
	{
		com.startapp.android.publish.adsCommon.g g1 = a.a().b(adKey);
	//    0    0:invokestatic    #205 <Method a a.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #51  <Field c adKey>
	//    3    7:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//    4   10:astore_1        
		if(g1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			return g1.a_();
	//    7   15:aload_1         
	//    8   16:invokeinterface #382 <Method String g.a_()>
	//    9   21:areturn         
		else
			return i.c(getContext());
	//   10   22:aload_0         
	//   11   23:invokevirtual   #386 <Method Context getContext()>
	//   12   26:invokestatic    #389 <Method String i.c(Context)>
	//   13   29:areturn         
	}

	protected com.startapp.android.publish.common.model.AdPreferences.Placement getPlacement()
	{
		com.startapp.android.publish.common.model.AdPreferences.Placement placement1 = super.getPlacement();
	//    0    0:aload_0         
	//    1    1:invokespecial   #390 <Method com.startapp.android.publish.common.model.AdPreferences$Placement Ad.getPlacement()>
	//    2    4:astore_2        
		com.startapp.android.publish.common.model.AdPreferences.Placement placement = placement1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(placement1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       52
		{
			placement = placement1;
	//    7   11:aload_2         
	//    8   12:astore_1        
			if(adKey != null)
	//*   9   13:aload_0         
	//*  10   14:getfield        #51  <Field c adKey>
	//*  11   17:ifnull          52
			{
				placement = placement1;
	//   12   20:aload_2         
	//   13   21:astore_1        
				if(a.a().b(adKey) != null)
	//*  14   22:invokestatic    #205 <Method a a.a()>
	//*  15   25:aload_0         
	//*  16   26:getfield        #51  <Field c adKey>
	//*  17   29:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//*  18   32:ifnull          52
					placement = ((Ad)a.a().b(adKey)).getPlacement();
	//   19   35:invokestatic    #205 <Method a a.a()>
	//   20   38:aload_0         
	//   21   39:getfield        #51  <Field c adKey>
	//   22   42:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//   23   45:checkcast       #4   <Class Ad>
	//   24   48:invokevirtual   #390 <Method com.startapp.android.publish.common.model.AdPreferences$Placement Ad.getPlacement()>
	//   25   51:astore_1        
			}
		}
		return placement;
	//   26   52:aload_1         
	//   27   53:areturn         
	}

	public Ad.AdState getState()
	{
		com.startapp.android.publish.adsCommon.g g1 = a.a().b(adKey);
	//    0    0:invokestatic    #205 <Method a a.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #51  <Field c adKey>
	//    3    7:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//    4   10:astore_1        
		if(g1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			return g1.getState();
	//    7   15:aload_1         
	//    8   16:invokeinterface #394 <Method Ad$AdState g.getState()>
	//    9   21:areturn         
		else
			return Ad.AdState.UN_INITIALIZED;
	//   10   22:getstatic       #400 <Field Ad$AdState Ad$AdState.UN_INITIALIZED>
	//   11   25:areturn         
	}

	public boolean isBelowMinCPM()
	{
		com.startapp.android.publish.adsCommon.g g1 = a.a().b(adKey);
	//    0    0:invokestatic    #205 <Method a a.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #51  <Field c adKey>
	//    3    7:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//    4   10:astore_1        
		if(g1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			return g1.isBelowMinCPM();
	//    7   15:aload_1         
	//    8   16:invokeinterface #403 <Method boolean g.isBelowMinCPM()>
	//    9   21:ireturn         
		else
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public boolean isNetworkAvailable()
	{
		return i.a(context);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Context context>
	//    2    4:invokestatic    #406 <Method boolean i.a(Context)>
	//    3    7:ireturn         
	}

	public boolean isReady()
	{
		com.startapp.android.publish.adsCommon.g g1 = a.a().b(adKey);
	//    0    0:invokestatic    #205 <Method a a.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #51  <Field c adKey>
	//    3    7:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//    4   10:astore_2        
		boolean flag = false;
	//    5   11:iconst_0        
	//    6   12:istore_1        
		if(g1 != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          24
			flag = g1.isReady();
	//    9   17:aload_2         
	//   10   18:invokeinterface #218 <Method boolean g.isReady()>
	//   11   23:istore_1        
		return flag;
	//   12   24:iload_1         
	//   13   25:ireturn         
	}

	public boolean load(AdPreferences adpreferences, AdEventListener adeventlistener)
	{
		if(!canShowAd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #173 <Method boolean canShowAd()>
	//*   2    4:ifne            27
		{
			if(adeventlistener != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          25
			{
				setErrorMessage("serving ads disabled");
	//    5   11:aload_0         
	//    6   12:ldc2            #411 <String "serving ads disabled">
	//    7   15:invokevirtual   #414 <Method void setErrorMessage(String)>
				adeventlistener.onFailedToReceiveAd(((Ad) (this)));
	//    8   18:aload_2         
	//    9   19:aload_0         
	//   10   20:invokeinterface #420 <Method void AdEventListener.onFailedToReceiveAd(Ad)>
			}
			return false;
	//   11   25:iconst_0        
	//   12   26:ireturn         
		}
		adKey = a.a().a(context, this, adMode, adpreferences, adeventlistener);
	//   13   27:aload_0         
	//   14   28:invokestatic    #205 <Method a a.a()>
	//   15   31:aload_0         
	//   16   32:getfield        #114 <Field Context context>
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #58  <Field StartAppAd$AdMode adMode>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokevirtual   #423 <Method c a.a(Context, StartAppAd, StartAppAd$AdMode, AdPreferences, AdEventListener)>
	//   23   45:putfield        #51  <Field c adKey>
		boolean flag;
		if(adKey != null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #51  <Field c adKey>
	//*  26   52:ifnull          59
			flag = true;
	//   27   55:iconst_1        
	//   28   56:istore_3        
		else
	//*  29   57:iload_3         
	//*  30   58:ireturn         
			flag = false;
	//   31   59:iconst_0        
	//   32   60:istore_3        
		return flag;
	//*  33   61:goto            57
	}

	public void loadAd()
	{
		loadAd(AdMode.AUTOMATIC, new AdPreferences(), ((AdEventListener) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #56  <Field StartAppAd$AdMode StartAppAd$AdMode.AUTOMATIC>
	//    2    4:new             #184 <Class AdPreferences>
	//    3    7:dup             
	//    4    8:invokespecial   #186 <Method void AdPreferences()>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #428 <Method void loadAd(StartAppAd$AdMode, AdPreferences, AdEventListener)>
	//    7   15:return          
	}

	public void loadAd(AdMode admode)
	{
		loadAd(admode, new AdPreferences(), ((AdEventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #184 <Class AdPreferences>
	//    3    5:dup             
	//    4    6:invokespecial   #186 <Method void AdPreferences()>
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #428 <Method void loadAd(StartAppAd$AdMode, AdPreferences, AdEventListener)>
	//    7   13:return          
	}

	public void loadAd(AdMode admode, AdEventListener adeventlistener)
	{
		loadAd(admode, new AdPreferences(), adeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #184 <Class AdPreferences>
	//    3    5:dup             
	//    4    6:invokespecial   #186 <Method void AdPreferences()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #428 <Method void loadAd(StartAppAd$AdMode, AdPreferences, AdEventListener)>
	//    7   13:return          
	}

	public void loadAd(AdMode admode, AdPreferences adpreferences)
	{
		loadAd(admode, adpreferences, ((AdEventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #428 <Method void loadAd(StartAppAd$AdMode, AdPreferences, AdEventListener)>
	//    5    7:return          
	}

	public void loadAd(AdMode admode, AdPreferences adpreferences, AdEventListener adeventlistener)
	{
		setAdMode(admode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #432 <Method void setAdMode(StartAppAd$AdMode)>
		setAdPrefs(adpreferences);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #434 <Method void setAdPrefs(AdPreferences)>
		load(adpreferences, adeventlistener);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #436 <Method boolean load(AdPreferences, AdEventListener)>
	//   10   16:pop             
_L1:
		return;
	//   11   17:return          
		admode;
	//   12   18:astore_1        
		f.a(context, d.b, "StartAppAd.loadAd - unexpected Error occurd", ((Exception) (admode)).getMessage(), "");
	//   13   19:aload_0         
	//   14   20:getfield        #114 <Field Context context>
	//   15   23:getstatic       #155 <Field d d.b>
	//   16   26:ldc2            #438 <String "StartAppAd.loadAd - unexpected Error occurd">
	//   17   29:aload_1         
	//   18   30:invokevirtual   #161 <Method String Exception.getMessage()>
	//   19   33:ldc1            #163 <String "">
	//   20   35:invokestatic    #168 <Method void f.a(Context, d, String, String, String)>
		if(adeventlistener != null)
	//*  21   38:aload_3         
	//*  22   39:ifnull          17
		{
			adeventlistener.onFailedToReceiveAd(((Ad) (this)));
	//   23   42:aload_3         
	//   24   43:aload_0         
	//   25   44:invokeinterface #420 <Method void AdEventListener.onFailedToReceiveAd(Ad)>
			return;
	//   26   49:return          
		}
		  goto _L1
	}

	public void loadAd(AdEventListener adeventlistener)
	{
		loadAd(AdMode.AUTOMATIC, new AdPreferences(), adeventlistener);
	//    0    0:aload_0         
	//    1    1:getstatic       #56  <Field StartAppAd$AdMode StartAppAd$AdMode.AUTOMATIC>
	//    2    4:new             #184 <Class AdPreferences>
	//    3    7:dup             
	//    4    8:invokespecial   #186 <Method void AdPreferences()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #428 <Method void loadAd(StartAppAd$AdMode, AdPreferences, AdEventListener)>
	//    7   15:return          
	}

	public void loadAd(AdPreferences adpreferences)
	{
		loadAd(AdMode.AUTOMATIC, adpreferences, ((AdEventListener) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #56  <Field StartAppAd$AdMode StartAppAd$AdMode.AUTOMATIC>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #428 <Method void loadAd(StartAppAd$AdMode, AdPreferences, AdEventListener)>
	//    5    9:return          
	}

	public void loadAd(AdPreferences adpreferences, AdEventListener adeventlistener)
	{
		loadAd(AdMode.AUTOMATIC, adpreferences, adeventlistener);
	//    0    0:aload_0         
	//    1    1:getstatic       #56  <Field StartAppAd$AdMode StartAppAd$AdMode.AUTOMATIC>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #428 <Method void loadAd(StartAppAd$AdMode, AdPreferences, AdEventListener)>
	//    5    9:return          
	}

	protected void loadAds(AdPreferences adpreferences, AdEventListener adeventlistener)
	{
	//    0    0:return          
	}

	public c loadSplash(AdPreferences adpreferences, AdEventListener adeventlistener)
	{
		adKey = a.a().a(context, this, adpreferences, adeventlistener);
	//    0    0:aload_0         
	//    1    1:invokestatic    #205 <Method a a.a()>
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field Context context>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #446 <Method c a.a(Context, StartAppAd, AdPreferences, AdEventListener)>
	//    8   14:putfield        #51  <Field c adKey>
		return adKey;
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field c adKey>
	//   11   21:areturn         
	}

	public void onBackPressed()
	{
		if(!showAd("exit_ad"))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #448 <String "exit_ad">
	//*   2    4:invokevirtual   #450 <Method boolean showAd(String)>
	//*   3    7:ifne            19
			g.a("StartAppAd", 3, "Could not display StartAppAd onBackPressed");
	//    4   10:ldc1            #19  <String "StartAppAd">
	//    5   12:iconst_3        
	//    6   13:ldc2            #452 <String "Could not display StartAppAd onBackPressed">
	//    7   16:invokestatic    #457 <Method void g.a(String, int, String)>
		com.startapp.android.publish.adsCommon.m.a().m();
	//    8   19:invokestatic    #85  <Method m com.startapp.android.publish.adsCommon.m.a()>
	//    9   22:invokevirtual   #460 <Method void m.m()>
	//   10   25:return          
	}

	public void onPause()
	{
	//    0    0:return          
	}

	public void onRestoreInstanceState(Bundle bundle)
	{
		int j;
		j = bundle.getInt("AdMode");
	//    0    0:aload_1         
	//    1    1:ldc2            #464 <String "AdMode">
	//    2    4:invokevirtual   #470 <Method int Bundle.getInt(String)>
	//    3    7:istore_2        
		adMode = AdMode.AUTOMATIC;
	//    4    8:aload_0         
	//    5    9:getstatic       #56  <Field StartAppAd$AdMode StartAppAd$AdMode.AUTOMATIC>
	//    6   12:putfield        #58  <Field StartAppAd$AdMode adMode>
		if(j != 1) goto _L2; else goto _L1
	//    7   15:iload_2         
	//    8   16:iconst_1        
	//    9   17:icmpne          48
_L1:
		adMode = AdMode.FULLPAGE;
	//   10   20:aload_0         
	//   11   21:getstatic       #473 <Field StartAppAd$AdMode StartAppAd$AdMode.FULLPAGE>
	//   12   24:putfield        #58  <Field StartAppAd$AdMode adMode>
_L4:
		bundle = ((Bundle) (bundle.getSerializable("AdPrefs")));
	//   13   27:aload_1         
	//   14   28:ldc2            #475 <String "AdPrefs">
	//   15   31:invokevirtual   #479 <Method java.io.Serializable Bundle.getSerializable(String)>
	//   16   34:astore_1        
		if(bundle != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          47
			adPreferences = (AdPreferences)bundle;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:checkcast       #184 <Class AdPreferences>
	//   22   44:putfield        #60  <Field AdPreferences adPreferences>
		return;
	//   23   47:return          
_L2:
		if(j == 2)
	//*  24   48:iload_2         
	//*  25   49:iconst_2        
	//*  26   50:icmpne          63
			adMode = AdMode.OFFERWALL;
	//   27   53:aload_0         
	//   28   54:getstatic       #482 <Field StartAppAd$AdMode StartAppAd$AdMode.OFFERWALL>
	//   29   57:putfield        #58  <Field StartAppAd$AdMode adMode>
		else
	//*  30   60:goto            27
		if(j == 3)
	//*  31   63:iload_2         
	//*  32   64:iconst_3        
	//*  33   65:icmpne          78
			adMode = AdMode.OVERLAY;
	//   34   68:aload_0         
	//   35   69:getstatic       #485 <Field StartAppAd$AdMode StartAppAd$AdMode.OVERLAY>
	//   36   72:putfield        #58  <Field StartAppAd$AdMode adMode>
		else
	//*  37   75:goto            27
		if(j == 4)
	//*  38   78:iload_2         
	//*  39   79:iconst_4        
	//*  40   80:icmpne          93
			adMode = AdMode.REWARDED_VIDEO;
	//   41   83:aload_0         
	//   42   84:getstatic       #488 <Field StartAppAd$AdMode StartAppAd$AdMode.REWARDED_VIDEO>
	//   43   87:putfield        #58  <Field StartAppAd$AdMode adMode>
		else
	//*  44   90:goto            27
		if(j == 5)
	//*  45   93:iload_2         
	//*  46   94:iconst_5        
	//*  47   95:icmpne          27
			adMode = AdMode.VIDEO;
	//   48   98:aload_0         
	//   49   99:getstatic       #491 <Field StartAppAd$AdMode StartAppAd$AdMode.VIDEO>
	//   50  102:putfield        #58  <Field StartAppAd$AdMode adMode>
		if(true) goto _L4; else goto _L3
	//   51  105:goto            27
_L3:
	}

	public void onResume()
	{
		if(!isReady())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #493 <Method boolean isReady()>
	//*   2    4:ifne            11
			loadAd();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #495 <Method void loadAd()>
	//    5   11:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		static class _cls3
		{

			static final int a[];

			static 
			{
				a = new int[AdMode.values().length];
			//    0    0:invokestatic    #18  <Method StartAppAd$AdMode[] StartAppAd$AdMode.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[AdMode.FULLPAGE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field StartAppAd$AdMode StartAppAd$AdMode.FULLPAGE>
			//    6   15:invokevirtual   #28  <Method int StartAppAd$AdMode.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field StartAppAd$AdMode StartAppAd$AdMode.OFFERWALL>
			//*  11   26:invokevirtual   #28  <Method int StartAppAd$AdMode.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field StartAppAd$AdMode StartAppAd$AdMode.OVERLAY>
			//*  16   37:invokevirtual   #28  <Method int StartAppAd$AdMode.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] a>
			//*  20   45:getstatic       #37  <Field StartAppAd$AdMode StartAppAd$AdMode.REWARDED_VIDEO>
			//*  21   48:invokevirtual   #28  <Method int StartAppAd$AdMode.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
			//*  25   54:astore_0        
			//*  26   55:return          
			//*  27   56:astore_0        
			//*  28   57:goto            42
			//*  29   60:astore_0        
			//*  30   61:goto            31
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   64:astore_0        
				try
				{
					a[AdMode.OFFERWALL.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					a[AdMode.OVERLAY.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					a[AdMode.REWARDED_VIDEO.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  32   65:goto            20
			}
		}

		com.startapp.android.publish.adsCommon._cls3.a[adMode.ordinal()];
	//    2    2:getstatic       #499 <Field int[] com.startapp.android.publish.adsCommon.StartAppAd$3.a>
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field StartAppAd$AdMode adMode>
	//    5    9:invokevirtual   #502 <Method int StartAppAd$AdMode.ordinal()>
	//    6   12:iaload          
		JVM INSTR tableswitch 1 4: default 44
	//	               1 71
	//	               2 76
	//	               3 81
	//	               4 86;
	//    7   13:tableswitch     1 4: default 44
	//	               1 71
	//	               2 76
	//	               3 81
	//	               4 86
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		if(adPreferences != null)
	//*   8   44:aload_0         
	//*   9   45:getfield        #60  <Field AdPreferences adPreferences>
	//*  10   48:ifnull          62
			bundle.putSerializable("AdPrefs", ((java.io.Serializable) (adPreferences)));
	//   11   51:aload_1         
	//   12   52:ldc2            #475 <String "AdPrefs">
	//   13   55:aload_0         
	//   14   56:getfield        #60  <Field AdPreferences adPreferences>
	//   15   59:invokevirtual   #506 <Method void Bundle.putSerializable(String, java.io.Serializable)>
		bundle.putInt("AdMode", j);
	//   16   62:aload_1         
	//   17   63:ldc2            #464 <String "AdMode">
	//   18   66:iload_2         
	//   19   67:invokevirtual   #510 <Method void Bundle.putInt(String, int)>
		return;
	//   20   70:return          
_L2:
		j = 1;
	//   21   71:iconst_1        
	//   22   72:istore_2        
		continue; /* Loop/switch isn't completed */
	//   23   73:goto            44
_L3:
		j = 2;
	//   24   76:iconst_2        
	//   25   77:istore_2        
		continue; /* Loop/switch isn't completed */
	//   26   78:goto            44
_L4:
		j = 3;
	//   27   81:iconst_3        
	//   28   82:istore_2        
		continue; /* Loop/switch isn't completed */
	//   29   83:goto            44
_L5:
		j = 4;
	//   30   86:iconst_4        
	//   31   87:istore_2        
		if(true) goto _L1; else goto _L6
	//   32   88:goto            44
_L6:
	}

	public void setVideoListener(VideoListener videolistener)
	{
		videoListener = videolistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field VideoListener videoListener>
	//    3    5:return          
	}

	protected com.startapp.android.publish.adsCommon.a.f shouldDisplayAd(String s, com.startapp.android.publish.common.model.AdPreferences.Placement placement)
	{
		return com.startapp.android.publish.adsCommon.b.a().E().a(placement, s);
	//    0    0:invokestatic    #107 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//    1    3:invokevirtual   #516 <Method e b.E()>
	//    2    6:aload_2         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #521 <Method com.startapp.android.publish.adsCommon.a.f e.a(com.startapp.android.publish.common.model.AdPreferences$Placement, String)>
	//    5   11:areturn         
	}

	public boolean show()
	{
		return show(((String) (null)), ((AdDisplayListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #525 <Method boolean show(String, AdDisplayListener)>
	//    4    6:ireturn         
	}

	public boolean show(String s, AdDisplayListener addisplaylistener)
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		flag1 = true;
	//    2    2:iconst_1        
	//    3    3:istore          4
		flag2 = false;
	//    4    5:iconst_0        
	//    5    6:istore          5
		flag3 = false;
	//    6    8:iconst_0        
	//    7    9:istore          6
		setNotDisplayedReason(((com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason) (null)));
	//    8   11:aload_0         
	//    9   12:aconst_null     
	//   10   13:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
		callback = ((AdDisplayListener) (new com.startapp.android.publish.adsCommon.adListeners.a(addisplaylistener)));
	//   11   16:aload_0         
	//   12   17:new             #531 <Class com.startapp.android.publish.adsCommon.adListeners.a>
	//   13   20:dup             
	//   14   21:aload_2         
	//   15   22:invokespecial   #534 <Method void com.startapp.android.publish.adsCommon.adListeners.a(AdDisplayListener)>
	//   16   25:putfield        #64  <Field AdDisplayListener callback>
		if(canShowAd()) goto _L2; else goto _L1
	//   17   28:aload_0         
	//   18   29:invokevirtual   #173 <Method boolean canShowAd()>
	//   19   32:ifne            55
_L1:
		setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.SERVING_ADS_DISABLED);
	//   20   35:aload_0         
	//   21   36:getstatic       #540 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.SERVING_ADS_DISABLED>
	//   22   39:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
		callback.adNotDisplayed(((Ad) (this)));
	//   23   42:aload_0         
	//   24   43:getfield        #64  <Field AdDisplayListener callback>
	//   25   46:aload_0         
	//   26   47:invokeinterface #545 <Method void AdDisplayListener.adNotDisplayed(Ad)>
_L13:
		return flag3;
	//   27   52:iload           6
	//   28   54:ireturn         
_L2:
		if(adKey == null)
	//*  29   55:aload_0         
	//*  30   56:getfield        #51  <Field c adKey>
	//*  31   59:ifnonnull       66
			loadAd();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #495 <Method void loadAd()>
		if(!isAppOnForeground())
			break MISSING_BLOCK_LABEL_674;
	//   34   66:aload_0         
	//   35   67:invokespecial   #547 <Method boolean isAppOnForeground()>
	//   36   70:ifeq            674
		if(!isNetworkAvailable()) goto _L4; else goto _L3
	//   37   73:aload_0         
	//   38   74:invokevirtual   #549 <Method boolean isNetworkAvailable()>
	//   39   77:ifeq            660
_L3:
		if(!isReady()) goto _L6; else goto _L5
	//   40   80:aload_0         
	//   41   81:invokevirtual   #493 <Method boolean isReady()>
	//   42   84:ifeq            611
_L5:
		Object obj;
		obj = ((Object) (getPlacement()));
	//   43   87:aload_0         
	//   44   88:invokevirtual   #200 <Method com.startapp.android.publish.common.model.AdPreferences$Placement getPlacement()>
	//   45   91:astore          7
		addisplaylistener = ((AdDisplayListener) (shouldDisplayAd(s, ((com.startapp.android.publish.common.model.AdPreferences.Placement) (obj)))));
	//   46   93:aload_0         
	//   47   94:aload_1         
	//   48   95:aload           7
	//   49   97:invokevirtual   #222 <Method com.startapp.android.publish.adsCommon.a.f shouldDisplayAd(String, com.startapp.android.publish.common.model.AdPreferences$Placement)>
	//   50  100:astore_2        
		if(!((com.startapp.android.publish.adsCommon.a.f) (addisplaylistener)).a()) goto _L8; else goto _L7
	//   51  101:aload_2         
	//   52  102:invokevirtual   #226 <Method boolean com.startapp.android.publish.adsCommon.a.f.a()>
	//   53  105:ifeq            575
_L7:
		ad = a.a().a(adKey);
	//   54  108:aload_0         
	//   55  109:invokestatic    #205 <Method a a.a()>
	//   56  112:aload_0         
	//   57  113:getfield        #51  <Field c adKey>
	//   58  116:invokevirtual   #551 <Method com.startapp.android.publish.adsCommon.g a.a(c)>
	//   59  119:putfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
		if(ad == null) goto _L10; else goto _L9
	//   60  122:aload_0         
	//   61  123:getfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
	//   62  126:ifnull          605
_L9:
		if(placement != com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_SPLASH || !com.startapp.android.publish.adsCommon.m.a().n()) goto _L12; else goto _L11
	//   63  129:aload_0         
	//   64  130:getfield        #553 <Field com.startapp.android.publish.common.model.AdPreferences$Placement placement>
	//   65  133:getstatic       #331 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_SPLASH>
	//   66  136:if_acmpne       338
	//   67  139:invokestatic    #85  <Method m com.startapp.android.publish.adsCommon.m.a()>
	//   68  142:invokevirtual   #556 <Method boolean m.n()>
	//   69  145:ifeq            338
_L11:
		g.a("StartAppAd", 3, "App in background, can't display splash");
	//   70  148:ldc1            #19  <String "StartAppAd">
	//   71  150:iconst_3        
	//   72  151:ldc2            #558 <String "App in background, can't display splash">
	//   73  154:invokestatic    #457 <Method void g.a(String, int, String)>
		setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.APP_IN_BACKGROUND);
	//   74  157:aload_0         
	//   75  158:getstatic       #561 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.APP_IN_BACKGROUND>
	//   76  161:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
		flag2 = false;
	//   77  164:iconst_0        
	//   78  165:istore          5
_L19:
		flag = false;
	//   79  167:iconst_0        
	//   80  168:istore_3        
_L21:
		if(flag2 || flag)
	//*  81  169:iload           5
	//*  82  171:ifne            178
	//*  83  174:iload_3         
	//*  84  175:ifeq            213
		{
			registerBroadcastReceiver("com.startapp.android.HideDisplayBroadcastListener");
	//   85  178:aload_0         
	//   86  179:ldc2            #563 <String "com.startapp.android.HideDisplayBroadcastListener">
	//   87  182:invokespecial   #565 <Method void registerBroadcastReceiver(String)>
			registerBroadcastReceiver("com.startapp.android.ShowDisplayBroadcastListener");
	//   88  185:aload_0         
	//   89  186:ldc2            #567 <String "com.startapp.android.ShowDisplayBroadcastListener">
	//   90  189:invokespecial   #565 <Method void registerBroadcastReceiver(String)>
			registerBroadcastReceiver("com.startapp.android.ShowFailedDisplayBroadcastListener");
	//   91  192:aload_0         
	//   92  193:ldc2            #569 <String "com.startapp.android.ShowFailedDisplayBroadcastListener">
	//   93  196:invokespecial   #565 <Method void registerBroadcastReceiver(String)>
			registerBroadcastReceiver("com.startapp.android.OnClickCallback");
	//   94  199:aload_0         
	//   95  200:ldc2            #571 <String "com.startapp.android.OnClickCallback">
	//   96  203:invokespecial   #565 <Method void registerBroadcastReceiver(String)>
			registerBroadcastReceiver("com.startapp.android.OnVideoCompleted");
	//   97  206:aload_0         
	//   98  207:ldc2            #573 <String "com.startapp.android.OnVideoCompleted">
	//   99  210:invokespecial   #565 <Method void registerBroadcastReceiver(String)>
		}
		flag3 = flag2;
	//  100  213:iload           5
	//  101  215:istore          6
		if(!flag2)
	//* 102  217:iload           5
	//* 103  219:ifne            52
		{
			if(getNotDisplayedReason() == null)
	//* 104  222:aload_0         
	//* 105  223:invokevirtual   #577 <Method com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason getNotDisplayedReason()>
	//* 106  226:ifnonnull       236
				setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.INTERNAL_ERROR);
	//  107  229:aload_0         
	//  108  230:getstatic       #580 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.INTERNAL_ERROR>
	//  109  233:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
			if(getNotDisplayedReason() != com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.NETWORK_PROBLEM)
	//* 110  236:aload_0         
	//* 111  237:invokevirtual   #577 <Method com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason getNotDisplayedReason()>
	//* 112  240:getstatic       #583 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.NETWORK_PROBLEM>
	//* 113  243:if_acmpeq       301
				if(getNotDisplayedReason() != null && getNotDisplayedReason() != com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.AD_RULES)
	//* 114  246:aload_0         
	//* 115  247:invokevirtual   #577 <Method com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason getNotDisplayedReason()>
	//* 116  250:ifnull          754
	//* 117  253:aload_0         
	//* 118  254:invokevirtual   #577 <Method com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason getNotDisplayedReason()>
	//* 119  257:getstatic       #586 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.AD_RULES>
	//* 120  260:if_acmpeq       754
				{
					if(flag)
	//* 121  263:iload_3         
	//* 122  264:ifeq            702
					{
						obj = ((Object) (this.context));
	//  123  267:aload_0         
	//  124  268:getfield        #114 <Field Context context>
	//  125  271:astore          7
						String s1;
						if(ad != null)
	//* 126  273:aload_0         
	//* 127  274:getfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
	//* 128  277:ifnull          688
							addisplaylistener = ((AdDisplayListener) (ad));
	//  129  280:aload_0         
	//  130  281:getfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
	//  131  284:astore_2        
						else
	//* 132  285:aload           7
	//* 133  287:aload_2         
	//* 134  288:invokestatic    #589 <Method String[] com.startapp.android.publish.adsCommon.c.a(com.startapp.android.publish.adsCommon.g)>
	//* 135  291:aload_1         
	//* 136  292:getstatic       #592 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK>
	//* 137  295:invokevirtual   #595 <Method String com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.toString()>
	//* 138  298:invokestatic    #598 <Method void com.startapp.android.publish.adsCommon.c.a(Context, String[], String, String)>
	//* 139  301:aload_0         
	//* 140  302:aconst_null     
	//* 141  303:putfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
	//* 142  306:iload           5
	//* 143  308:istore          6
	//* 144  310:iload_3         
	//* 145  311:ifne            52
	//* 146  314:iload           5
	//* 147  316:istore          6
	//* 148  318:aload_0         
	//* 149  319:getfield        #64  <Field AdDisplayListener callback>
	//* 150  322:ifnull          52
	//* 151  325:aload_0         
	//* 152  326:getfield        #64  <Field AdDisplayListener callback>
	//* 153  329:aload_0         
	//* 154  330:invokeinterface #545 <Method void AdDisplayListener.adNotDisplayed(Ad)>
	//* 155  335:iload           5
	//* 156  337:ireturn         
	//* 157  338:aload_0         
	//* 158  339:getfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
	//* 159  342:aload_1         
	//* 160  343:invokeinterface #252 <Method boolean com.startapp.android.publish.adsCommon.g.a(String)>
	//* 161  348:istore          5
	//* 162  350:iload           5
	//* 163  352:ifeq            548
	//* 164  355:invokestatic    #603 <Method com.startapp.android.publish.adsCommon.a.b com.startapp.android.publish.adsCommon.a.b.a()>
	//* 165  358:new             #605 <Class com.startapp.android.publish.adsCommon.a.a>
	//* 166  361:dup             
	//* 167  362:aload           7
	//* 168  364:aload_1         
	//* 169  365:invokespecial   #608 <Method void com.startapp.android.publish.adsCommon.a.a(com.startapp.android.publish.common.model.AdPreferences$Placement, String)>
	//* 170  368:invokevirtual   #611 <Method void com.startapp.android.publish.adsCommon.a.b.a(com.startapp.android.publish.adsCommon.a.a)>
	//* 171  371:aload_0         
	//* 172  372:getfield        #58  <Field StartAppAd$AdMode adMode>
	//* 173  375:ifnull          543
	//* 174  378:aload_0         
	//* 175  379:getfield        #553 <Field com.startapp.android.publish.common.model.AdPreferences$Placement placement>
	//* 176  382:getstatic       #331 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_SPLASH>
	//* 177  385:if_acmpeq       543
	//* 178  388:iload           4
	//* 179  390:istore_3        
	//* 180  391:aload_0         
	//* 181  392:getfield        #60  <Field AdPreferences adPreferences>
	//* 182  395:ifnull          418
	//* 183  398:aload_0         
	//* 184  399:getfield        #60  <Field AdPreferences adPreferences>
	//* 185  402:new             #184 <Class AdPreferences>
	//* 186  405:dup             
	//* 187  406:invokespecial   #186 <Method void AdPreferences()>
	//* 188  409:invokevirtual   #615 <Method boolean AdPreferences.equals(Object)>
	//* 189  412:ifeq            543
	//* 190  415:iload           4
	//* 191  417:istore_3        
	//* 192  418:iload_3         
	//* 193  419:ifeq            527
	//* 194  422:invokestatic    #205 <Method a a.a()>
	//* 195  425:astore          7
	//* 196  427:aload           7
	//* 197  429:aload_0         
	//* 198  430:getfield        #58  <Field StartAppAd$AdMode adMode>
	//* 199  433:invokevirtual   #618 <Method String a.a(StartAppAd$AdMode)>
	//* 200  436:astore          8
	//* 201  438:ldc2            #620 <String "preCache">
	//* 202  441:iconst_3        
	//* 203  442:new             #622 <Class StringBuilder>
	//* 204  445:dup             
	//* 205  446:invokespecial   #623 <Method void StringBuilder()>
	//* 206  449:ldc2            #625 <String "reset autoLoad after show ">
	//* 207  452:invokevirtual   #629 <Method StringBuilder StringBuilder.append(String)>
	//* 208  455:aload           8
	//* 209  457:invokevirtual   #629 <Method StringBuilder StringBuilder.append(String)>
	//* 210  460:invokevirtual   #630 <Method String StringBuilder.toString()>
	//* 211  463:invokestatic    #457 <Method void g.a(String, int, String)>
	//* 212  466:aload_0         
	//* 213  467:getfield        #114 <Field Context context>
	//* 214  470:aload           8
	//* 215  472:iconst_0        
	//* 216  473:invokestatic    #635 <Method Integer Integer.valueOf(int)>
	//* 217  476:invokestatic    #640 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Integer)>
	//* 218  479:aload_0         
	//* 219  480:getfield        #58  <Field StartAppAd$AdMode adMode>
	//* 220  483:getstatic       #56  <Field StartAppAd$AdMode StartAppAd$AdMode.AUTOMATIC>
	//* 221  486:if_acmpne       527
	//* 222  489:aload_0         
	//* 223  490:getfield        #114 <Field Context context>
	//* 224  493:aload           7
	//* 225  495:getstatic       #473 <Field StartAppAd$AdMode StartAppAd$AdMode.FULLPAGE>
	//* 226  498:invokevirtual   #618 <Method String a.a(StartAppAd$AdMode)>
	//* 227  501:iconst_0        
	//* 228  502:invokestatic    #635 <Method Integer Integer.valueOf(int)>
	//* 229  505:invokestatic    #640 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Integer)>
	//* 230  508:aload_0         
	//* 231  509:getfield        #114 <Field Context context>
	//* 232  512:aload           7
	//* 233  514:getstatic       #482 <Field StartAppAd$AdMode StartAppAd$AdMode.OFFERWALL>
	//* 234  517:invokevirtual   #618 <Method String a.a(StartAppAd$AdMode)>
	//* 235  520:iconst_0        
	//* 236  521:invokestatic    #635 <Method Integer Integer.valueOf(int)>
	//* 237  524:invokestatic    #640 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Integer)>
	//* 238  527:aload_0         
	//* 239  528:aload_0         
	//* 240  529:getfield        #58  <Field StartAppAd$AdMode adMode>
	//* 241  532:aload_0         
	//* 242  533:getfield        #60  <Field AdPreferences adPreferences>
	//* 243  536:aconst_null     
	//* 244  537:invokevirtual   #428 <Method void loadAd(StartAppAd$AdMode, AdPreferences, AdEventListener)>
	//* 245  540:goto            167
	//* 246  543:iconst_0        
	//* 247  544:istore_3        
	//* 248  545:goto            418
	//* 249  548:aload_0         
	//* 250  549:getfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
	//* 251  552:instanceof      #4   <Class Ad>
	//* 252  555:ifeq            527
	//* 253  558:aload_0         
	//* 254  559:aload_0         
	//* 255  560:getfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
	//* 256  563:checkcast       #4   <Class Ad>
	//* 257  566:invokevirtual   #641 <Method com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason Ad.getNotDisplayedReason()>
	//* 258  569:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
	//* 259  572:goto            527
	//* 260  575:aload_0         
	//* 261  576:getstatic       #586 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.AD_RULES>
	//* 262  579:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
	//* 263  582:invokestatic    #235 <Method Boolean Constants.a()>
	//* 264  585:invokevirtual   #240 <Method boolean Boolean.booleanValue()>
	//* 265  588:ifeq            605
	//* 266  591:invokestatic    #245 <Method com.startapp.common.a.i com.startapp.common.a.i.a()>
	//* 267  594:aload_0         
	//* 268  595:getfield        #114 <Field Context context>
	//* 269  598:aload_2         
	//* 270  599:invokevirtual   #643 <Method String com.startapp.android.publish.adsCommon.a.f.b()>
	//* 271  602:invokevirtual   #250 <Method void com.startapp.common.a.i.a(Context, String)>
	//* 272  605:iconst_0        
	//* 273  606:istore          5
	//* 274  608:goto            167
	//* 275  611:aload_0         
	//* 276  612:getfield        #58  <Field StartAppAd$AdMode adMode>
	//* 277  615:getstatic       #488 <Field StartAppAd$AdMode StartAppAd$AdMode.REWARDED_VIDEO>
	//* 278  618:if_acmpeq       655
	//* 279  621:aload_0         
	//* 280  622:getfield        #58  <Field StartAppAd$AdMode adMode>
	//* 281  625:getstatic       #491 <Field StartAppAd$AdMode StartAppAd$AdMode.VIDEO>
	//* 282  628:if_acmpeq       655
	//* 283  631:aload_0         
	//* 284  632:aload_1         
	//* 285  633:invokespecial   #645 <Method boolean showPreparedVideoFallbackAd(String)>
	//* 286  636:ifeq            655
	//* 287  639:iload_3         
	//* 288  640:ifne            786
	//* 289  643:aload_0         
	//* 290  644:getstatic       #648 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.AD_NOT_READY>
	//* 291  647:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
	//* 292  650:aconst_null     
	//* 293  651:astore_2        
	//* 294  652:goto            169
	//* 295  655:iconst_0        
	//* 296  656:istore_3        
	//* 297  657:goto            639
	//* 298  660:aload_0         
	//* 299  661:getstatic       #583 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.NETWORK_PROBLEM>
	//* 300  664:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
	//* 301  667:aconst_null     
	//* 302  668:astore_2        
	//* 303  669:iconst_0        
	//* 304  670:istore_3        
	//* 305  671:goto            169
	//* 306  674:aload_0         
	//* 307  675:getstatic       #561 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.APP_IN_BACKGROUND>
	//* 308  678:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
	//* 309  681:aconst_null     
	//* 310  682:astore_2        
	//* 311  683:iconst_0        
	//* 312  684:istore_3        
	//* 313  685:goto            169
							addisplaylistener = ((AdDisplayListener) (a.a().b(adKey)));
	//  314  688:invokestatic    #205 <Method a a.a()>
	//  315  691:aload_0         
	//  316  692:getfield        #51  <Field c adKey>
	//  317  695:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//  318  698:astore_2        
						com.startapp.android.publish.adsCommon.c.a(((Context) (obj)), com.startapp.android.publish.adsCommon.c.a(((com.startapp.android.publish.adsCommon.g) (addisplaylistener))), s, com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK.toString());
					} else
	//* 319  699:goto            285
					{
						Context context = this.context;
	//  320  702:aload_0         
	//  321  703:getfield        #114 <Field Context context>
	//  322  706:astore          7
						if(ad != null)
	//* 323  708:aload_0         
	//* 324  709:getfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
	//* 325  712:ifnull          740
							addisplaylistener = ((AdDisplayListener) (ad));
	//  326  715:aload_0         
	//  327  716:getfield        #53  <Field com.startapp.android.publish.adsCommon.g ad>
	//  328  719:astore_2        
						else
	//* 329  720:aload           7
	//* 330  722:aload_2         
	//* 331  723:invokestatic    #589 <Method String[] com.startapp.android.publish.adsCommon.c.a(com.startapp.android.publish.adsCommon.g)>
	//* 332  726:aload_1         
	//* 333  727:aload_0         
	//* 334  728:invokevirtual   #577 <Method com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason getNotDisplayedReason()>
	//* 335  731:invokevirtual   #595 <Method String com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.toString()>
	//* 336  734:invokestatic    #598 <Method void com.startapp.android.publish.adsCommon.c.a(Context, String[], String, String)>
	//* 337  737:goto            301
							addisplaylistener = ((AdDisplayListener) (a.a().b(adKey)));
	//  338  740:invokestatic    #205 <Method a a.a()>
	//  339  743:aload_0         
	//  340  744:getfield        #51  <Field c adKey>
	//  341  747:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//  342  750:astore_2        
						com.startapp.android.publish.adsCommon.c.a(context, com.startapp.android.publish.adsCommon.c.a(((com.startapp.android.publish.adsCommon.g) (addisplaylistener))), s, getNotDisplayedReason().toString());
					}
				} else
	//* 343  751:goto            720
				if(addisplaylistener != null)
	//* 344  754:aload_2         
	//* 345  755:ifnull          301
					com.startapp.android.publish.adsCommon.c.a(this.context, com.startapp.android.publish.adsCommon.c.a(a.a().b(adKey)), s, ((com.startapp.android.publish.adsCommon.a.f) (addisplaylistener)).c());
	//  346  758:aload_0         
	//  347  759:getfield        #114 <Field Context context>
	//  348  762:invokestatic    #205 <Method a a.a()>
	//  349  765:aload_0         
	//  350  766:getfield        #51  <Field c adKey>
	//  351  769:invokevirtual   #213 <Method com.startapp.android.publish.adsCommon.g a.b(c)>
	//  352  772:invokestatic    #589 <Method String[] com.startapp.android.publish.adsCommon.c.a(com.startapp.android.publish.adsCommon.g)>
	//  353  775:aload_1         
	//  354  776:aload_2         
	//  355  777:invokevirtual   #650 <Method String com.startapp.android.publish.adsCommon.a.f.c()>
	//  356  780:invokestatic    #598 <Method void com.startapp.android.publish.adsCommon.c.a(Context, String[], String, String)>
			ad = null;
			flag3 = flag2;
			if(!flag)
			{
				flag3 = flag2;
				if(callback != null)
				{
					callback.adNotDisplayed(((Ad) (this)));
					return flag2;
				}
			}
		}
		  goto _L13
_L12:
		flag2 = ad.a(s);
		if(!flag2)
			break MISSING_BLOCK_LABEL_548;
		com.startapp.android.publish.adsCommon.a.b.a().a(new com.startapp.android.publish.adsCommon.a.a(((com.startapp.android.publish.common.model.AdPreferences.Placement) (obj)), s));
		if(adMode == null || placement == com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_SPLASH) goto _L15; else goto _L14
_L14:
		flag = flag1;
		if(adPreferences == null) goto _L17; else goto _L16
_L16:
		if(!adPreferences.equals(((Object) (new AdPreferences())))) goto _L15; else goto _L18
_L18:
		flag = flag1;
_L17:
		if(flag)
		{
			obj = ((Object) (a.a()));
			s1 = ((a) (obj)).a(adMode);
			g.a("preCache", 3, (new StringBuilder()).append("reset autoLoad after show ").append(s1).toString());
			com.startapp.android.publish.adsCommon.k.b(this.context, s1, Integer.valueOf(0));
			if(adMode == AdMode.AUTOMATIC)
			{
				com.startapp.android.publish.adsCommon.k.b(this.context, ((a) (obj)).a(AdMode.FULLPAGE), Integer.valueOf(0));
				com.startapp.android.publish.adsCommon.k.b(this.context, ((a) (obj)).a(AdMode.OFFERWALL), Integer.valueOf(0));
			}
		}
_L20:
		loadAd(adMode, adPreferences, ((AdEventListener) (null)));
		  goto _L19
_L15:
		flag = false;
		  goto _L17
		if(ad instanceof Ad)
			setNotDisplayedReason(((Ad)ad).getNotDisplayedReason());
		  goto _L20
_L8:
		setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.AD_RULES);
		if(Constants.a().booleanValue())
			com.startapp.common.a.i.a().a(this.context, ((com.startapp.android.publish.adsCommon.a.f) (addisplaylistener)).b());
_L10:
		flag2 = false;
		  goto _L19
_L6:
		if(adMode == AdMode.REWARDED_VIDEO || adMode == AdMode.VIDEO || !showPreparedVideoFallbackAd(s))
			flag = false;
		if(!flag)
		{
			setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.AD_NOT_READY);
			addisplaylistener = null;
		} else
	//* 357  783:goto            301
		{
			addisplaylistener = null;
	//  358  786:aconst_null     
	//  359  787:astore_2        
		}
		  goto _L21
_L4:
		setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.NETWORK_PROBLEM);
		addisplaylistener = null;
		flag = false;
		  goto _L21
		setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.APP_IN_BACKGROUND);
		addisplaylistener = null;
		flag = false;
		  goto _L21
	//* 360  788:goto            169
	}

	public boolean showAd()
	{
		return showAd(((String) (null)), ((AdDisplayListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #652 <Method boolean showAd(String, AdDisplayListener)>
	//    4    6:ireturn         
	}

	public boolean showAd(AdDisplayListener addisplaylistener)
	{
		return showAd(((String) (null)), addisplaylistener);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #652 <Method boolean showAd(String, AdDisplayListener)>
	//    4    6:ireturn         
	}

	public boolean showAd(String s)
	{
		return showAd(s, ((AdDisplayListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #652 <Method boolean showAd(String, AdDisplayListener)>
	//    4    6:ireturn         
	}

	public boolean showAd(String s, AdDisplayListener addisplaylistener)
	{
		boolean flag;
		try
		{
			flag = show(s, addisplaylistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #525 <Method boolean show(String, AdDisplayListener)>
	//    4    6:istore_3        
		}
	//*   5    7:iload_3         
	//*   6    8:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7    9:astore_1        
		{
			f.a(context, d.b, "StartAppAd.showAd - unexpected Error occurd", ((Exception) (s)).getMessage(), "");
	//    8   10:aload_0         
	//    9   11:getfield        #114 <Field Context context>
	//   10   14:getstatic       #155 <Field d d.b>
	//   11   17:ldc2            #655 <String "StartAppAd.showAd - unexpected Error occurd">
	//   12   20:aload_1         
	//   13   21:invokevirtual   #161 <Method String Exception.getMessage()>
	//   14   24:ldc1            #163 <String "">
	//   15   26:invokestatic    #168 <Method void f.a(Context, d, String, String, String)>
			setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.INTERNAL_ERROR);
	//   16   29:aload_0         
	//   17   30:getstatic       #580 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason.INTERNAL_ERROR>
	//   18   33:invokevirtual   #529 <Method void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
			if(addisplaylistener != null)
	//*  19   36:aload_2         
	//*  20   37:ifnull          47
				addisplaylistener.adNotDisplayed(((Ad) (null)));
	//   21   40:aload_2         
	//   22   41:aconst_null     
	//   23   42:invokeinterface #545 <Method void AdDisplayListener.adNotDisplayed(Ad)>
			return false;
	//   24   47:iconst_0        
	//   25   48:ireturn         
		}
		return flag;
	}

	private static final String TAG = "StartAppAd";
	private static final long serialVersionUID = 1L;
	private static boolean testMode = false;
	com.startapp.android.publish.adsCommon.g ad;
	private c adKey;
	private AdMode adMode;
	private AdPreferences adPreferences;
	AdDisplayListener callback;
	private BroadcastReceiver callbackBroadcastReceiver;
	VideoListener videoListener;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #43  <Field boolean testMode>
	//*   2    4:return          
	}
}
