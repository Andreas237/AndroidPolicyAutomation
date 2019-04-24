// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.g;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adListeners.b;
import com.startapp.android.publish.adsCommon.adinformation.c;
import com.startapp.android.publish.cache.ACMConfig;
import com.startapp.android.publish.cache.d;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import java.io.Serializable;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			l, a

public abstract class Ad
	implements Serializable
{
	public static final class AdState extends Enum
	{

		public static AdState valueOf(String s)
		{
			return (AdState)Enum.valueOf(com/startapp/android/publish/adsCommon/Ad$AdState, s);
		//    0    0:ldc1            #2   <Class Ad$AdState>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Ad$AdState>
		//    4    9:areturn         
		}

		public static AdState[] values()
		{
			return (AdState[])((AdState []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field Ad$AdState[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.Ad$AdState_3B_.clone()>
		//    2    6:checkcast       #42  <Class Ad$AdState[]>
		//    3    9:areturn         
		}

		private static final AdState $VALUES[];
		public static final AdState PROCESSING;
		public static final AdState READY;
		public static final AdState UN_INITIALIZED;

		static 
		{
			UN_INITIALIZED = new AdState("UN_INITIALIZED", 0);
		//    0    0:new             #2   <Class Ad$AdState>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "UN_INITIALIZED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void Ad$AdState(String, int)>
		//    5   10:putstatic       #23  <Field Ad$AdState UN_INITIALIZED>
			PROCESSING = new AdState("PROCESSING", 1);
		//    6   13:new             #2   <Class Ad$AdState>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "PROCESSING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void Ad$AdState(String, int)>
		//   11   23:putstatic       #26  <Field Ad$AdState PROCESSING>
			READY = new AdState("READY", 2);
		//   12   26:new             #2   <Class Ad$AdState>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "READY">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void Ad$AdState(String, int)>
		//   17   36:putstatic       #29  <Field Ad$AdState READY>
			$VALUES = (new AdState[] {
				UN_INITIALIZED, PROCESSING, READY
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       AdState[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field Ad$AdState UN_INITIALIZED>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field Ad$AdState PROCESSING>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field Ad$AdState READY>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field Ad$AdState[] $VALUES>
		//*  33   64:return          
		}

		private AdState(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class AdType extends Enum
	{

		public static AdType valueOf(String s)
		{
			return (AdType)Enum.valueOf(com/startapp/android/publish/adsCommon/Ad$AdType, s);
		//    0    0:ldc1            #2   <Class Ad$AdType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Ad$AdType>
		//    4    9:areturn         
		}

		public static AdType[] values()
		{
			return (AdType[])((AdType []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field Ad$AdType[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.Ad$AdType_3B_.clone()>
		//    2    6:checkcast       #54  <Class Ad$AdType[]>
		//    3    9:areturn         
		}

		private static final AdType $VALUES[];
		public static final AdType INTERSTITIAL;
		public static final AdType NON_VIDEO;
		public static final AdType REWARDED_VIDEO;
		public static final AdType RICH_TEXT;
		public static final AdType VIDEO;
		public static final AdType VIDEO_NO_VAST;

		static 
		{
			INTERSTITIAL = new AdType("INTERSTITIAL", 0);
		//    0    0:new             #2   <Class Ad$AdType>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "INTERSTITIAL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void Ad$AdType(String, int)>
		//    5   10:putstatic       #26  <Field Ad$AdType INTERSTITIAL>
			RICH_TEXT = new AdType("RICH_TEXT", 1);
		//    6   13:new             #2   <Class Ad$AdType>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "RICH_TEXT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void Ad$AdType(String, int)>
		//   11   23:putstatic       #29  <Field Ad$AdType RICH_TEXT>
			VIDEO = new AdType("VIDEO", 2);
		//   12   26:new             #2   <Class Ad$AdType>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "VIDEO">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void Ad$AdType(String, int)>
		//   17   36:putstatic       #32  <Field Ad$AdType VIDEO>
			REWARDED_VIDEO = new AdType("REWARDED_VIDEO", 3);
		//   18   39:new             #2   <Class Ad$AdType>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "REWARDED_VIDEO">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void Ad$AdType(String, int)>
		//   23   49:putstatic       #35  <Field Ad$AdType REWARDED_VIDEO>
			NON_VIDEO = new AdType("NON_VIDEO", 4);
		//   24   52:new             #2   <Class Ad$AdType>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "NON_VIDEO">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void Ad$AdType(String, int)>
		//   29   62:putstatic       #38  <Field Ad$AdType NON_VIDEO>
			VIDEO_NO_VAST = new AdType("VIDEO_NO_VAST", 5);
		//   30   65:new             #2   <Class Ad$AdType>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "VIDEO_NO_VAST">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void Ad$AdType(String, int)>
		//   35   75:putstatic       #41  <Field Ad$AdType VIDEO_NO_VAST>
			$VALUES = (new AdType[] {
				INTERSTITIAL, RICH_TEXT, VIDEO, REWARDED_VIDEO, NON_VIDEO, VIDEO_NO_VAST
			});
		//   36   78:bipush          6
		//   37   80:anewarray       AdType[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field Ad$AdType INTERSTITIAL>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field Ad$AdType RICH_TEXT>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field Ad$AdType VIDEO>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field Ad$AdType REWARDED_VIDEO>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field Ad$AdType NON_VIDEO>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field Ad$AdType VIDEO_NO_VAST>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field Ad$AdType[] $VALUES>
		//*  63  122:return          
		}

		private AdType(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Ad(Context context1, com.startapp.android.publish.common.model.AdPreferences.Placement placement1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		extraData = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #57  <Field Serializable extraData>
		errorMessage = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #59  <Field String errorMessage>
		adCacheTtl = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #61  <Field Long adCacheTtl>
		state = AdState.UN_INITIALIZED;
	//   11   19:aload_0         
	//   12   20:getstatic       #64  <Field Ad$AdState Ad$AdState.UN_INITIALIZED>
	//   13   23:putfield        #66  <Field Ad$AdState state>
		lastLoadTime = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #68  <Field Long lastLoadTime>
		belowMinCPM = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #70  <Field boolean belowMinCPM>
		context = context1;
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:putfield        #72  <Field Context context>
		placement = placement1;
	//   23   41:aload_0         
	//   24   42:aload_2         
	//   25   43:putfield        #74  <Field com.startapp.android.publish.common.model.AdPreferences$Placement placement>
		if(i.e())
	//*  26   46:invokestatic    #80  <Method boolean i.e()>
	//*  27   49:ifeq            59
			adInfoOverride = c.a();
	//   28   52:aload_0         
	//   29   53:invokestatic    #86  <Method c c.a()>
	//   30   56:putfield        #88  <Field c adInfoOverride>
	//   31   59:return          
	}

	private void setLastLoadTime(Long long1)
	{
		lastLoadTime = long1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field Long lastLoadTime>
	//    3    5:return          
	}

	private void setType(AdType adtype)
	{
		type = adtype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field Ad$AdType type>
	//    3    5:return          
	}

	protected boolean canShowAd()
	{
		return MetaData.getInstance().canShowAd();
	//    0    0:invokestatic    #105 <Method MetaData MetaData.getInstance()>
	//    1    3:invokevirtual   #107 <Method boolean MetaData.canShowAd()>
	//    2    6:ireturn         
	}

	protected Long getAdCacheTtl()
	{
		long l1 = getFallbackAdCacheTtl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method long getFallbackAdCacheTtl()>
	//    2    4:lstore_1        
		if(adCacheTtl != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #61  <Field Long adCacheTtl>
	//*   5    9:ifnonnull       17
	//*   6   12:lload_1         
	//*   7   13:invokestatic    #119 <Method Long Long.valueOf(long)>
	//*   8   16:areturn         
			l1 = Math.min(adCacheTtl.longValue(), l1);
	//    9   17:aload_0         
	//   10   18:getfield        #61  <Field Long adCacheTtl>
	//   11   21:invokevirtual   #122 <Method long Long.longValue()>
	//   12   24:lload_1         
	//   13   25:invokestatic    #128 <Method long Math.min(long, long)>
	//   14   28:lstore_1        
		return Long.valueOf(l1);
	//*  15   29:goto            12
	}

	public c getAdInfoOverride()
	{
		return adInfoOverride;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field c adInfoOverride>
	//    2    4:areturn         
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Context context>
	//    2    4:areturn         
	}

	public String getErrorMessage()
	{
		return errorMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String errorMessage>
	//    2    4:areturn         
	}

	public Serializable getExtraData()
	{
		return extraData;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Serializable extraData>
	//    2    4:areturn         
	}

	protected long getFallbackAdCacheTtl()
	{
		return d.a().b().getAdCacheTtl();
	//    0    0:invokestatic    #140 <Method d d.a()>
	//    1    3:invokevirtual   #144 <Method ACMConfig d.b()>
	//    2    6:invokevirtual   #148 <Method long ACMConfig.getAdCacheTtl()>
	//    3    9:lreturn         
	}

	protected Long getLastLoadTime()
	{
		return lastLoadTime;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Long lastLoadTime>
	//    2    4:areturn         
	}

	public com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason getNotDisplayedReason()
	{
		return notDisplayedReason;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason notDisplayedReason>
	//    2    4:areturn         
	}

	protected com.startapp.android.publish.common.model.AdPreferences.Placement getPlacement()
	{
		return placement;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field com.startapp.android.publish.common.model.AdPreferences$Placement placement>
	//    2    4:areturn         
	}

	public AdState getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Ad$AdState state>
	//    2    4:areturn         
	}

	public AdType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Ad$AdType type>
	//    2    4:areturn         
	}

	protected boolean getVideoCancelCallBack()
	{
		return videoCancelCallBack;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field boolean videoCancelCallBack>
	//    2    4:ireturn         
	}

	protected boolean hasAdCacheTtlPassed()
	{
		while(lastLoadTime == null || System.currentTimeMillis() - lastLoadTime.longValue() <= getAdCacheTtl().longValue()) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field Long lastLoadTime>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:invokestatic    #168 <Method long System.currentTimeMillis()>
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field Long lastLoadTime>
	//    8   16:invokevirtual   #122 <Method long Long.longValue()>
	//    9   19:lsub            
	//   10   20:aload_0         
	//   11   21:invokevirtual   #170 <Method Long getAdCacheTtl()>
	//   12   24:invokevirtual   #122 <Method long Long.longValue()>
	//   13   27:lcmp            
	//   14   28:ifle            7
		return true;
	//   15   31:iconst_1        
	//   16   32:ireturn         
	}

	public boolean isBelowMinCPM()
	{
		return belowMinCPM;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean belowMinCPM>
	//    2    4:ireturn         
	}

	public boolean isReady()
	{
		return state == AdState.READY && !hasAdCacheTtlPassed();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Ad$AdState state>
	//    2    4:getstatic       #175 <Field Ad$AdState Ad$AdState.READY>
	//    3    7:if_acmpne       19
	//    4   10:aload_0         
	//    5   11:invokevirtual   #177 <Method boolean hasAdCacheTtlPassed()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean load()
	{
		return load(new AdPreferences(), ((AdEventListener) (null)));
	//    0    0:aload_0         
	//    1    1:new             #181 <Class AdPreferences>
	//    2    4:dup             
	//    3    5:invokespecial   #182 <Method void AdPreferences()>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #185 <Method boolean load(AdPreferences, AdEventListener)>
	//    6   12:ireturn         
	}

	public boolean load(AdEventListener adeventlistener)
	{
		return load(new AdPreferences(), adeventlistener);
	//    0    0:aload_0         
	//    1    1:new             #181 <Class AdPreferences>
	//    2    4:dup             
	//    3    5:invokespecial   #182 <Method void AdPreferences()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #185 <Method boolean load(AdPreferences, AdEventListener)>
	//    6   12:ireturn         
	}

	public boolean load(AdPreferences adpreferences)
	{
		return load(adpreferences, ((AdEventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #185 <Method boolean load(AdPreferences, AdEventListener)>
	//    4    6:ireturn         
	}

	public boolean load(AdPreferences adpreferences, AdEventListener adeventlistener)
	{
		return load(adpreferences, adeventlistener, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #191 <Method boolean load(AdPreferences, AdEventListener, boolean)>
	//    5    7:ireturn         
	}

	protected boolean load(AdPreferences adpreferences, AdEventListener adeventlistener, boolean flag)
	{
		AdEventListener adeventlistener1 = new AdEventListener(((AdEventListener) (new b(adeventlistener)))) {

			public void onFailedToReceiveAd(Ad ad)
			{
				a.onFailedToReceiveAd(ad);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AdEventListener a>
			//    2    4:aload_1         
			//    3    5:invokeinterface #29  <Method void AdEventListener.onFailedToReceiveAd(Ad)>
			//    4   10:return          
			}

			public void onReceiveAd(Ad ad)
			{
				b.setLastLoadTime(Long.valueOf(System.currentTimeMillis()));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Ad b>
			//    2    4:invokestatic    #36  <Method long System.currentTimeMillis()>
			//    3    7:invokestatic    #42  <Method Long Long.valueOf(long)>
			//    4   10:invokestatic    #46  <Method void Ad.access$000(Ad, Long)>
				a.onReceiveAd(ad);
			//    5   13:aload_0         
			//    6   14:getfield        #21  <Field AdEventListener a>
			//    7   17:aload_1         
			//    8   18:invokeinterface #48  <Method void AdEventListener.onReceiveAd(Ad)>
			//    9   23:return          
			}

			final AdEventListener a;
			final Ad b;

			
			{
				b = Ad.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Ad b>
				a = adeventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AdEventListener a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #8   <Class Ad$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #193 <Class b>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #196 <Method void b(AdEventListener)>
	//    7   13:invokespecial   #199 <Method void Ad$1(Ad, AdEventListener)>
	//    8   16:astore          5
		if(!init)
	//*   9   18:getstatic       #50  <Field boolean init>
	//*  10   21:ifne            35
		{
			com.startapp.android.publish.adsCommon.l.c(context);
	//   11   24:aload_0         
	//   12   25:getfield        #72  <Field Context context>
	//   13   28:invokestatic    #205 <Method void com.startapp.android.publish.adsCommon.l.c(Context)>
			init = true;
	//   14   31:iconst_1        
	//   15   32:putstatic       #50  <Field boolean init>
		}
		i.a(context, adpreferences);
	//   16   35:aload_0         
	//   17   36:getfield        #72  <Field Context context>
	//   18   39:aload_1         
	//   19   40:invokestatic    #208 <Method void i.a(Context, AdPreferences)>
		adeventlistener = "";
	//   20   43:ldc1            #210 <String "">
	//   21   45:astore_2        
		boolean flag1;
		if(adpreferences.getProductId() == null || "".equals(((Object) (adpreferences.getProductId()))))
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #213 <Method String AdPreferences.getProductId()>
	//*  24   50:ifnull          65
	//*  25   53:ldc1            #210 <String "">
	//*  26   55:aload_1         
	//*  27   56:invokevirtual   #213 <Method String AdPreferences.getProductId()>
	//*  28   59:invokevirtual   #219 <Method boolean String.equals(Object)>
	//*  29   62:ifeq            209
		{
			adeventlistener = "app ID was not set.";
	//   30   65:ldc1            #221 <String "app ID was not set.">
	//   31   67:astore_2        
			flag1 = true;
	//   32   68:iconst_1        
	//   33   69:istore          4
		} else
	//*  34   71:aload_0         
	//*  35   72:getfield        #66  <Field Ad$AdState state>
	//*  36   75:getstatic       #64  <Field Ad$AdState Ad$AdState.UN_INITIALIZED>
	//*  37   78:if_acmpeq       87
	//*  38   81:ldc1            #223 <String "load() was already called.">
	//*  39   83:astore_2        
	//*  40   84:iconst_1        
	//*  41   85:istore          4
	//*  42   87:aload_0         
	//*  43   88:getfield        #72  <Field Context context>
	//*  44   91:invokestatic    #226 <Method boolean i.a(Context)>
	//*  45   94:ifne            103
	//*  46   97:ldc1            #228 <String "network not available.">
	//*  47   99:astore_2        
	//*  48  100:iconst_1        
	//*  49  101:istore          4
	//*  50  103:aload_0         
	//*  51  104:invokevirtual   #229 <Method boolean canShowAd()>
	//*  52  107:ifne            116
	//*  53  110:ldc1            #231 <String "serving ads disabled">
	//*  54  112:astore_2        
	//*  55  113:iconst_1        
	//*  56  114:istore          4
	//*  57  116:iload           4
	//*  58  118:ifeq            154
	//*  59  121:aload_0         
	//*  60  122:new             #233 <Class StringBuilder>
	//*  61  125:dup             
	//*  62  126:invokespecial   #234 <Method void StringBuilder()>
	//*  63  129:ldc1            #236 <String "Ad wasn't loaded: ">
	//*  64  131:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//*  65  134:aload_2         
	//*  66  135:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//*  67  138:invokevirtual   #243 <Method String StringBuilder.toString()>
	//*  68  141:invokevirtual   #247 <Method void setErrorMessage(String)>
	//*  69  144:aload           5
	//*  70  146:aload_0         
	//*  71  147:invokeinterface #253 <Method void AdEventListener.onFailedToReceiveAd(Ad)>
	//*  72  152:iconst_0        
	//*  73  153:ireturn         
	//*  74  154:aload_0         
	//*  75  155:getstatic       #256 <Field Ad$AdState Ad$AdState.PROCESSING>
	//*  76  158:invokevirtual   #260 <Method void setState(Ad$AdState)>
	//*  77  161:new             #10  <Class Ad$2>
	//*  78  164:dup             
	//*  79  165:aload_0         
	//*  80  166:aload_1         
	//*  81  167:aload           5
	//*  82  169:invokespecial   #263 <Method void Ad$2(Ad, AdPreferences, AdEventListener)>
	//*  83  172:astore_2        
	//*  84  173:aload_1         
	//*  85  174:invokevirtual   #265 <Method Ad$AdType AdPreferences.getType()>
	//*  86  177:ifnull          188
	//*  87  180:aload_0         
	//*  88  181:aload_1         
	//*  89  182:invokevirtual   #265 <Method Ad$AdType AdPreferences.getType()>
	//*  90  185:invokespecial   #267 <Method void setType(Ad$AdType)>
	//*  91  188:invokestatic    #105 <Method MetaData MetaData.getInstance()>
	//*  92  191:aload_0         
	//*  93  192:getfield        #72  <Field Context context>
	//*  94  195:aload_1         
	//*  95  196:invokestatic    #273 <Method g g.d()>
	//*  96  199:invokevirtual   #276 <Method com.startapp.android.publish.common.metaData.MetaDataRequest$a g.c()>
	//*  97  202:iload_3         
	//*  98  203:aload_2         
	//*  99  204:invokevirtual   #280 <Method void MetaData.loadFromServer(Context, AdPreferences, com.startapp.android.publish.common.metaData.MetaDataRequest$a, boolean, com.startapp.android.publish.common.metaData.d)>
	//* 100  207:iconst_1        
	//* 101  208:ireturn         
		{
			flag1 = false;
	//  102  209:iconst_0        
	//  103  210:istore          4
		}
		if(state != AdState.UN_INITIALIZED)
		{
			adeventlistener = "load() was already called.";
			flag1 = true;
		}
		if(!i.a(context))
		{
			adeventlistener = "network not available.";
			flag1 = true;
		}
		if(!canShowAd())
		{
			adeventlistener = "serving ads disabled";
			flag1 = true;
		}
		if(flag1)
		{
			setErrorMessage((new StringBuilder()).append("Ad wasn't loaded: ").append(((String) (adeventlistener))).toString());
			adeventlistener1.onFailedToReceiveAd(this);
			return false;
		}
		setState(AdState.PROCESSING);
		adeventlistener = ((AdEventListener) (new com.startapp.android.publish.common.metaData.d(adpreferences, adeventlistener1) {

			public void a()
			{
				MetaData.getInstance().removeMetaDataListener(((com.startapp.android.publish.common.metaData.d) (this)));
			//    0    0:invokestatic    #35  <Method MetaData MetaData.getInstance()>
			//    1    3:aload_0         
			//    2    4:invokevirtual   #39  <Method void MetaData.removeMetaDataListener(com.startapp.android.publish.common.metaData.d)>
				c.loadAds(a, b);
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field Ad c>
			//    5   11:aload_0         
			//    6   12:getfield        #23  <Field AdPreferences a>
			//    7   15:aload_0         
			//    8   16:getfield        #25  <Field AdEventListener b>
			//    9   19:invokevirtual   #43  <Method void Ad.loadAds(AdPreferences, AdEventListener)>
			//   10   22:return          
			}

			public void b()
			{
				MetaData.getInstance().removeMetaDataListener(((com.startapp.android.publish.common.metaData.d) (this)));
			//    0    0:invokestatic    #35  <Method MetaData MetaData.getInstance()>
			//    1    3:aload_0         
			//    2    4:invokevirtual   #39  <Method void MetaData.removeMetaDataListener(com.startapp.android.publish.common.metaData.d)>
				c.loadAds(a, b);
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field Ad c>
			//    5   11:aload_0         
			//    6   12:getfield        #23  <Field AdPreferences a>
			//    7   15:aload_0         
			//    8   16:getfield        #25  <Field AdEventListener b>
			//    9   19:invokevirtual   #43  <Method void Ad.loadAds(AdPreferences, AdEventListener)>
			//   10   22:return          
			}

			final AdPreferences a;
			final AdEventListener b;
			final Ad c;

			
			{
				c = Ad.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Ad c>
				a = adpreferences;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AdPreferences a>
				b = adeventlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field AdEventListener b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
));
		if(adpreferences.getType() != null)
			setType(adpreferences.getType());
		MetaData.getInstance().loadFromServer(context, adpreferences, g.d().c(), flag, ((com.startapp.android.publish.common.metaData.d) (adeventlistener)));
		return true;
	//* 104  212:goto            71
	}

	protected abstract void loadAds(AdPreferences adpreferences, AdEventListener adeventlistener);

	public void setActivityExtra(a a)
	{
		activityExtra = a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #286 <Field a activityExtra>
	//    3    5:return          
	}

	public void setAdInfoOverride(c c1)
	{
		adInfoOverride = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field c adInfoOverride>
	//    3    5:return          
	}

	public void setContext(Context context1)
	{
		context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field Context context>
	//    3    5:return          
	}

	public void setErrorMessage(String s)
	{
		errorMessage = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field String errorMessage>
	//    3    5:return          
	}

	public void setExtraData(Serializable serializable)
	{
		extraData = serializable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field Serializable extraData>
	//    3    5:return          
	}

	protected void setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason notdisplayedreason)
	{
		notDisplayedReason = notdisplayedreason;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason notDisplayedReason>
	//    3    5:return          
	}

	protected void setPlacement(com.startapp.android.publish.common.model.AdPreferences.Placement placement1)
	{
		placement = placement1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field com.startapp.android.publish.common.model.AdPreferences$Placement placement>
	//    3    5:return          
	}

	public void setState(AdState adstate)
	{
		state = adstate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field Ad$AdState state>
	//    3    5:return          
	}

	protected void setVideoCancelCallBack(boolean flag)
	{
		videoCancelCallBack = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #162 <Field boolean videoCancelCallBack>
	//    3    5:return          
	}

	public boolean show()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static boolean init = false;
	private static final long serialVersionUID = 1L;
	protected a activityExtra;
	protected Long adCacheTtl;
	private c adInfoOverride;
	protected boolean belowMinCPM;
	protected transient Context context;
	protected String errorMessage;
	protected Serializable extraData;
	private Long lastLoadTime;
	private com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason notDisplayedReason;
	protected com.startapp.android.publish.common.model.AdPreferences.Placement placement;
	private AdState state;
	private AdType type;
	private boolean videoCancelCallBack;

	static 
	{
		init = false;
	//    0    0:iconst_0        
	//    1    1:putstatic       #50  <Field boolean init>
	//*   2    4:return          
	}


/*
	static void access$000(Ad ad, Long long1)
	{
		ad.setLastLoadTime(long1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method void setLastLoadTime(Long)>
		return;
	//    3    5:return          
	}

*/
}
