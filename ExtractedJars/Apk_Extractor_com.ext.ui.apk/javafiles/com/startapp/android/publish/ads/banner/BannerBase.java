// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.a.a;
import com.startapp.android.publish.adsCommon.a.b;
import com.startapp.android.publish.adsCommon.a.e;
import com.startapp.android.publish.adsCommon.a.f;
import com.startapp.android.publish.adsCommon.o;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.c;
import com.startapp.common.a.g;
import com.startapp.common.a.i;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.startapp.android.publish.ads.banner:
//			b, c, BannerOptions

public abstract class BannerBase extends RelativeLayout
{
	class a extends TimerTask
	{

		public void run()
		{
			a.post(new Runnable(this) {

				public void run()
				{
					if(a.a.isShown() || a.a.adRulesResult != null && !a.a.adRulesResult.a())
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field BannerBase$a a>
				//*   2    4:getfield        #25  <Field BannerBase com.startapp.android.publish.ads.banner.BannerBase$a.a>
				//*   3    7:invokevirtual   #29  <Method boolean BannerBase.isShown()>
				//*   4   10:ifne            42
				//*   5   13:aload_0         
				//*   6   14:getfield        #19  <Field BannerBase$a a>
				//*   7   17:getfield        #25  <Field BannerBase com.startapp.android.publish.ads.banner.BannerBase$a.a>
				//*   8   20:getfield        #33  <Field f BannerBase.adRulesResult>
				//*   9   23:ifnull          60
				//*  10   26:aload_0         
				//*  11   27:getfield        #19  <Field BannerBase$a a>
				//*  12   30:getfield        #25  <Field BannerBase com.startapp.android.publish.ads.banner.BannerBase$a.a>
				//*  13   33:getfield        #33  <Field f BannerBase.adRulesResult>
				//*  14   36:invokevirtual   #37  <Method boolean f.a()>
				//*  15   39:ifne            60
					{
						g.a("BannerLayout", 3, "REFRESH");
				//   16   42:ldc1            #39  <String "BannerLayout">
				//   17   44:iconst_3        
				//   18   45:ldc1            #41  <String "REFRESH">
				//   19   47:invokestatic    #46  <Method void g.a(String, int, String)>
						a.a.load();
				//   20   50:aload_0         
				//   21   51:getfield        #19  <Field BannerBase$a a>
				//   22   54:getfield        #25  <Field BannerBase com.startapp.android.publish.ads.banner.BannerBase$a.a>
				//   23   57:invokevirtual   #49  <Method void BannerBase.load()>
					}
				//   24   60:return          
				}

				final a a;

			
			{
				a = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BannerBase$a a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field BannerBase a>
		//    2    4:new             #9   <Class BannerBase$a$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:invokespecial   #22  <Method void BannerBase$a$1(BannerBase$a)>
		//    6   12:invokevirtual   #26  <Method boolean BannerBase.post(Runnable)>
		//    7   15:pop             
		//    8   16:return          
		}

		final BannerBase a;

		a()
		{
			a = BannerBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field BannerBase a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void TimerTask()>
		//    5    9:return          
		}
	}


	public BannerBase(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void RelativeLayout(Context)>
		attachedToWindow = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #45  <Field boolean attachedToWindow>
		offset = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #47  <Field int offset>
		firstLoad = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #49  <Field boolean firstLoad>
		drawn = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #51  <Field boolean drawn>
		innerBanner3dId = 0x9876543 + (new Random()).nextInt(0x186a0);
	//   15   25:aload_0         
	//   16   26:ldc1            #52  <Int 0x9876543>
	//   17   28:new             #54  <Class Random>
	//   18   31:dup             
	//   19   32:invokespecial   #57  <Method void Random()>
	//   20   35:ldc1            #58  <Int 0x186a0>
	//   21   37:invokevirtual   #62  <Method int Random.nextInt(int)>
	//   22   40:iadd            
	//   23   41:putfield        #64  <Field int innerBanner3dId>
		innerBannerStandardId = innerBanner3dId + 1;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #64  <Field int innerBanner3dId>
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:putfield        #66  <Field int innerBannerStandardId>
		adTag = null;
	//   30   54:aload_0         
	//   31   55:aconst_null     
	//   32   56:putfield        #68  <Field String adTag>
		visibilityHandler = new Handler();
	//   33   59:aload_0         
	//   34   60:new             #70  <Class Handler>
	//   35   63:dup             
	//   36   64:invokespecial   #71  <Method void Handler()>
	//   37   67:putfield        #73  <Field Handler visibilityHandler>
		viewabilityChecker = new o();
	//   38   70:aload_0         
	//   39   71:new             #75  <Class o>
	//   40   74:dup             
	//   41   75:invokespecial   #76  <Method void o()>
	//   42   78:putfield        #78  <Field o viewabilityChecker>
		clicked = false;
	//   43   81:aload_0         
	//   44   82:iconst_0        
	//   45   83:putfield        #80  <Field boolean clicked>
		shouldReloadBanner = false;
	//   46   86:aload_0         
	//   47   87:iconst_0        
	//   48   88:putfield        #82  <Field boolean shouldReloadBanner>
		timer = new Timer();
	//   49   91:aload_0         
	//   50   92:new             #84  <Class Timer>
	//   51   95:dup             
	//   52   96:invokespecial   #85  <Method void Timer()>
	//   53   99:putfield        #87  <Field Timer timer>
		task = new a();
	//   54  102:aload_0         
	//   55  103:new             #8   <Class BannerBase$a>
	//   56  106:dup             
	//   57  107:aload_0         
	//   58  108:invokespecial   #90  <Method void BannerBase$a(BannerBase)>
	//   59  111:putfield        #92  <Field BannerBase$a task>
	//   60  114:return          
	}

	public BannerBase(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #97  <Method void BannerBase(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BannerBase(Context context, AttributeSet attributeset, int j)
	{
		super(context, attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #98  <Method void RelativeLayout(Context, AttributeSet, int)>
		attachedToWindow = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #45  <Field boolean attachedToWindow>
		offset = 0;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #47  <Field int offset>
		firstLoad = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #49  <Field boolean firstLoad>
		drawn = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #51  <Field boolean drawn>
		innerBanner3dId = 0x9876543 + (new Random()).nextInt(0x186a0);
	//   17   27:aload_0         
	//   18   28:ldc1            #52  <Int 0x9876543>
	//   19   30:new             #54  <Class Random>
	//   20   33:dup             
	//   21   34:invokespecial   #57  <Method void Random()>
	//   22   37:ldc1            #58  <Int 0x186a0>
	//   23   39:invokevirtual   #62  <Method int Random.nextInt(int)>
	//   24   42:iadd            
	//   25   43:putfield        #64  <Field int innerBanner3dId>
		innerBannerStandardId = innerBanner3dId + 1;
	//   26   46:aload_0         
	//   27   47:aload_0         
	//   28   48:getfield        #64  <Field int innerBanner3dId>
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:putfield        #66  <Field int innerBannerStandardId>
		adTag = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #68  <Field String adTag>
		visibilityHandler = new Handler();
	//   35   61:aload_0         
	//   36   62:new             #70  <Class Handler>
	//   37   65:dup             
	//   38   66:invokespecial   #71  <Method void Handler()>
	//   39   69:putfield        #73  <Field Handler visibilityHandler>
		viewabilityChecker = new o();
	//   40   72:aload_0         
	//   41   73:new             #75  <Class o>
	//   42   76:dup             
	//   43   77:invokespecial   #76  <Method void o()>
	//   44   80:putfield        #78  <Field o viewabilityChecker>
		clicked = false;
	//   45   83:aload_0         
	//   46   84:iconst_0        
	//   47   85:putfield        #80  <Field boolean clicked>
		shouldReloadBanner = false;
	//   48   88:aload_0         
	//   49   89:iconst_0        
	//   50   90:putfield        #82  <Field boolean shouldReloadBanner>
		timer = new Timer();
	//   51   93:aload_0         
	//   52   94:new             #84  <Class Timer>
	//   53   97:dup             
	//   54   98:invokespecial   #85  <Method void Timer()>
	//   55  101:putfield        #87  <Field Timer timer>
		task = new a();
	//   56  104:aload_0         
	//   57  105:new             #8   <Class BannerBase$a>
	//   58  108:dup             
	//   59  109:aload_0         
	//   60  110:invokespecial   #90  <Method void BannerBase$a(BannerBase)>
	//   61  113:putfield        #92  <Field BannerBase$a task>
		setBannerAttrs(context, attributeset);
	//   62  116:aload_0         
	//   63  117:aload_1         
	//   64  118:aload_2         
	//   65  119:invokespecial   #101 <Method void setBannerAttrs(Context, AttributeSet)>
	//   66  122:return          
	}

	private void cancelReloadTask()
	{
		if(!isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #112 <Method boolean isInEditMode()>
	//*   2    4:ifne            46
		{
			if(task != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #92  <Field BannerBase$a task>
	//*   5   11:ifnull          22
				task.cancel();
	//    6   14:aload_0         
	//    7   15:getfield        #92  <Field BannerBase$a task>
	//    8   18:invokevirtual   #115 <Method boolean BannerBase$a.cancel()>
	//    9   21:pop             
			if(timer != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #87  <Field Timer timer>
	//*  12   26:ifnull          36
				timer.cancel();
	//   13   29:aload_0         
	//   14   30:getfield        #87  <Field Timer timer>
	//   15   33:invokevirtual   #117 <Method void Timer.cancel()>
			task = null;
	//   16   36:aload_0         
	//   17   37:aconst_null     
	//   18   38:putfield        #92  <Field BannerBase$a task>
			timer = null;
	//   19   41:aload_0         
	//   20   42:aconst_null     
	//   21   43:putfield        #87  <Field Timer timer>
		}
	//   22   46:return          
	}

	private void clearVisibilityHandler()
	{
		try
		{
			visibilityHandler.removeCallbacksAndMessages(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Handler visibilityHandler>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #123 <Method void Handler.removeCallbacksAndMessages(Object)>
			return;
	//    4    8:return          
		}
		catch(Exception exception)
	//*   5    9:astore_1        
		{
			g.a("BannerLayout", 6, (new StringBuilder()).append("BannerBase.reload - removeCallbacksAndMessages failed ").append(exception.getMessage()).toString());
	//    6   10:ldc1            #15  <String "BannerLayout">
	//    7   12:bipush          6
	//    8   14:new             #125 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #126 <Method void StringBuilder()>
	//   11   21:ldc1            #128 <String "BannerBase.reload - removeCallbacksAndMessages failed ">
	//   12   23:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #136 <Method String Exception.getMessage()>
	//   15   30:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   17   36:invokestatic    #144 <Method void g.a(String, int, String)>
		}
	//   18   39:return          
	}

	private void initDebug()
	{
		setMinimumWidth(h.a(getContext(), getWidthInDp()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #149 <Method Context getContext()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #153 <Method int getWidthInDp()>
	//    5    9:invokestatic    #158 <Method int h.a(Context, int)>
	//    6   12:invokevirtual   #162 <Method void setMinimumWidth(int)>
		setMinimumHeight(h.a(getContext(), getHeightInDp()));
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #149 <Method Context getContext()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #165 <Method int getHeightInDp()>
	//   12   24:invokestatic    #158 <Method int h.a(Context, int)>
	//   13   27:invokevirtual   #168 <Method void setMinimumHeight(int)>
		setBackgroundColor(Color.rgb(169, 169, 169));
	//   14   30:aload_0         
	//   15   31:sipush          169
	//   16   34:sipush          169
	//   17   37:sipush          169
	//   18   40:invokestatic    #174 <Method int Color.rgb(int, int, int)>
	//   19   43:invokevirtual   #177 <Method void setBackgroundColor(int)>
		TextView textview = new TextView(getContext());
	//   20   46:new             #179 <Class TextView>
	//   21   49:dup             
	//   22   50:aload_0         
	//   23   51:invokevirtual   #149 <Method Context getContext()>
	//   24   54:invokespecial   #180 <Method void TextView(Context)>
	//   25   57:astore_1        
		textview.setText(((CharSequence) (getBannerName())));
	//   26   58:aload_1         
	//   27   59:aload_0         
	//   28   60:invokevirtual   #183 <Method String getBannerName()>
	//   29   63:invokevirtual   #187 <Method void TextView.setText(CharSequence)>
		textview.setTextColor(0xff000000);
	//   30   66:aload_1         
	//   31   67:ldc1            #188 <Int 0xff000000>
	//   32   69:invokevirtual   #191 <Method void TextView.setTextColor(int)>
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
	//   33   72:new             #193 <Class android.widget.RelativeLayout$LayoutParams>
	//   34   75:dup             
	//   35   76:bipush          -2
	//   36   78:bipush          -2
	//   37   80:invokespecial   #196 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   38   83:astore_2        
		layoutparams.addRule(13);
	//   39   84:aload_2         
	//   40   85:bipush          13
	//   41   87:invokevirtual   #199 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		addView(((android.view.View) (textview)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   42   90:aload_0         
	//   43   91:aload_1         
	//   44   92:aload_2         
	//   45   93:invokevirtual   #203 <Method void addView(android.view.View, android.view.ViewGroup$LayoutParams)>
	//   46   96:return          
	}

	private void scheduleReloadTask()
	{
		if(!attachedToWindow || isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean attachedToWindow>
	//*   2    4:ifeq            14
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #112 <Method boolean isInEditMode()>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(task != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #92  <Field BannerBase$a task>
	//*   9   19:ifnull          30
			task.cancel();
	//   10   22:aload_0         
	//   11   23:getfield        #92  <Field BannerBase$a task>
	//   12   26:invokevirtual   #115 <Method boolean BannerBase$a.cancel()>
	//   13   29:pop             
		if(timer != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #87  <Field Timer timer>
	//*  16   34:ifnull          44
			timer.cancel();
	//   17   37:aload_0         
	//   18   38:getfield        #87  <Field Timer timer>
	//   19   41:invokevirtual   #117 <Method void Timer.cancel()>
		task = new a();
	//   20   44:aload_0         
	//   21   45:new             #8   <Class BannerBase$a>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokespecial   #90  <Method void BannerBase$a(BannerBase)>
	//   25   53:putfield        #92  <Field BannerBase$a task>
		timer = new Timer();
	//   26   56:aload_0         
	//   27   57:new             #84  <Class Timer>
	//   28   60:dup             
	//   29   61:invokespecial   #85  <Method void Timer()>
	//   30   64:putfield        #87  <Field Timer timer>
		timer.scheduleAtFixedRate(((TimerTask) (task)), getRefreshRate(), getRefreshRate());
	//   31   67:aload_0         
	//   32   68:getfield        #87  <Field Timer timer>
	//   33   71:aload_0         
	//   34   72:getfield        #92  <Field BannerBase$a task>
	//   35   75:aload_0         
	//   36   76:invokevirtual   #207 <Method int getRefreshRate()>
	//   37   79:i2l             
	//   38   80:aload_0         
	//   39   81:invokevirtual   #207 <Method int getRefreshRate()>
	//   40   84:i2l             
	//   41   85:invokevirtual   #211 <Method void Timer.scheduleAtFixedRate(TimerTask, long, long)>
	//   42   88:return          
	}

	private void setBannerAttrs(Context context, AttributeSet attributeset)
	{
		setAdTag((new com.startapp.android.publish.ads.banner.b(context, attributeset)).a());
	//    0    0:aload_0         
	//    1    1:new             #213 <Class com.startapp.android.publish.ads.banner.b>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #215 <Method void com.startapp.android.publish.ads.banner.b(Context, AttributeSet)>
	//    6   10:invokevirtual   #217 <Method String com.startapp.android.publish.ads.banner.b.a()>
	//    7   13:invokevirtual   #221 <Method void setAdTag(String)>
	//    8   16:return          
	}

	protected void addDisplayEventOnLoad()
	{
		if(isFirstLoad() || com.startapp.android.publish.adsCommon.a.g.a().b().a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #225 <Method boolean isFirstLoad()>
	//*   2    4:ifne            19
	//*   3    7:invokestatic    #230 <Method com.startapp.android.publish.adsCommon.a.g com.startapp.android.publish.adsCommon.a.g.a()>
	//*   4   10:invokevirtual   #234 <Method e com.startapp.android.publish.adsCommon.a.g.b()>
	//*   5   13:invokevirtual   #238 <Method boolean e.a()>
	//*   6   16:ifeq            44
		{
			setFirstLoad(false);
	//    7   19:aload_0         
	//    8   20:iconst_0        
	//    9   21:invokevirtual   #242 <Method void setFirstLoad(boolean)>
			b.a().a(new com.startapp.android.publish.adsCommon.a.a(com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_BANNER, getAdTag()));
	//   10   24:invokestatic    #247 <Method b b.a()>
	//   11   27:new             #249 <Class a>
	//   12   30:dup             
	//   13   31:getstatic       #255 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_BANNER>
	//   14   34:aload_0         
	//   15   35:invokevirtual   #258 <Method String getAdTag()>
	//   16   38:invokespecial   #261 <Method void a(com.startapp.android.publish.common.model.AdPreferences$Placement, String)>
	//   17   41:invokevirtual   #264 <Method void b.a(a)>
		}
	//   18   44:return          
	}

	protected String getAdTag()
	{
		return adTag;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String adTag>
	//    2    4:areturn         
	}

	protected abstract int getBannerId();

	protected abstract String getBannerName();

	public String getErrorMessage()
	{
		return error;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field String error>
	//    2    4:areturn         
	}

	protected abstract int getHeightInDp();

	protected int getMinViewabilityPercentage()
	{
		return com.startapp.android.publish.ads.banner.c.a().b().q();
	//    0    0:invokestatic    #274 <Method com.startapp.android.publish.ads.banner.c com.startapp.android.publish.ads.banner.c.a()>
	//    1    3:invokevirtual   #277 <Method BannerOptions com.startapp.android.publish.ads.banner.c.b()>
	//    2    6:invokevirtual   #282 <Method int BannerOptions.q()>
	//    3    9:ireturn         
	}

	protected abstract int getOffset();

	protected abstract int getRefreshRate();

	protected abstract int getWidthInDp();

	protected void init()
	{
		if(!isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #112 <Method boolean isInEditMode()>
	//*   2    4:ifne            12
		{
			initRuntime();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #287 <Method void initRuntime()>
			return;
	//    5   11:return          
		} else
		{
			initDebug();
	//    6   12:aload_0         
	//    7   13:invokespecial   #289 <Method void initDebug()>
			return;
	//    8   16:return          
		}
	}

	protected abstract void initRuntime();

	public boolean isClicked()
	{
		return clicked;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field boolean clicked>
	//    2    4:ireturn         
	}

	public boolean isFirstLoad()
	{
		return firstLoad;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean firstLoad>
	//    2    4:ireturn         
	}

	protected boolean isVisible()
	{
		return viewabilityChecker.a(((android.view.View) (this)), getMinViewabilityPercentage());
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field o viewabilityChecker>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #293 <Method int getMinViewabilityPercentage()>
	//    5    9:invokevirtual   #296 <Method boolean o.a(android.view.View, int)>
	//    6   12:ireturn         
	}

	protected void load()
	{
		clearVisibilityHandler();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void clearVisibilityHandler()>
		if(adRulesResult != null && !com.startapp.android.publish.adsCommon.a.g.a().b().a()) goto _L2; else goto _L1
	//    2    4:aload_0         
	//    3    5:getfield        #299 <Field f adRulesResult>
	//    4    8:ifnull          23
	//    5   11:invokestatic    #230 <Method com.startapp.android.publish.adsCommon.a.g com.startapp.android.publish.adsCommon.a.g.a()>
	//    6   14:invokevirtual   #234 <Method e com.startapp.android.publish.adsCommon.a.g.b()>
	//    7   17:invokevirtual   #238 <Method boolean e.a()>
	//    8   20:ifeq            90
_L1:
		adRulesResult = com.startapp.android.publish.adsCommon.a.g.a().b().a(com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_BANNER, getAdTag());
	//    9   23:aload_0         
	//   10   24:invokestatic    #230 <Method com.startapp.android.publish.adsCommon.a.g com.startapp.android.publish.adsCommon.a.g.a()>
	//   11   27:invokevirtual   #234 <Method e com.startapp.android.publish.adsCommon.a.g.b()>
	//   12   30:getstatic       #255 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_BANNER>
	//   13   33:aload_0         
	//   14   34:invokevirtual   #258 <Method String getAdTag()>
	//   15   37:invokevirtual   #302 <Method f e.a(com.startapp.android.publish.common.model.AdPreferences$Placement, String)>
	//   16   40:putfield        #299 <Field f adRulesResult>
		if(!adRulesResult.a()) goto _L4; else goto _L3
	//   17   43:aload_0         
	//   18   44:getfield        #299 <Field f adRulesResult>
	//   19   47:invokevirtual   #305 <Method boolean f.a()>
	//   20   50:ifeq            58
_L3:
		reload();
	//   21   53:aload_0         
	//   22   54:invokevirtual   #308 <Method void reload()>
_L6:
		return;
	//   23   57:return          
_L4:
		setVisibility(4);
	//   24   58:aload_0         
	//   25   59:iconst_4        
	//   26   60:invokevirtual   #311 <Method void setVisibility(int)>
		if(Constants.a().booleanValue())
	//*  27   63:invokestatic    #316 <Method Boolean Constants.a()>
	//*  28   66:invokevirtual   #321 <Method boolean Boolean.booleanValue()>
	//*  29   69:ifeq            57
		{
			i.a().a(getContext(), adRulesResult.b());
	//   30   72:invokestatic    #326 <Method i i.a()>
	//   31   75:aload_0         
	//   32   76:invokevirtual   #149 <Method Context getContext()>
	//   33   79:aload_0         
	//   34   80:getfield        #299 <Field f adRulesResult>
	//   35   83:invokevirtual   #328 <Method String f.b()>
	//   36   86:invokevirtual   #331 <Method void i.a(Context, String)>
			return;
	//   37   89:return          
		}
		continue; /* Loop/switch isn't completed */
_L2:
		if(adRulesResult.a())
	//*  38   90:aload_0         
	//*  39   91:getfield        #299 <Field f adRulesResult>
	//*  40   94:invokevirtual   #305 <Method boolean f.a()>
	//*  41   97:ifeq            57
		{
			reload();
	//   42  100:aload_0         
	//   43  101:invokevirtual   #308 <Method void reload()>
			return;
	//   44  104:return          
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	protected void loadBanner()
	{
		scheduleReloadTask();
	//    0    0:aload_0         
	//    1    1:invokespecial   #334 <Method void scheduleReloadTask()>
		load();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #336 <Method void load()>
	//    4    8:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #339 <Method void RelativeLayout.onAttachedToWindow()>
		g.a("BannerLayout", 3, "onAttachedToWindow");
	//    2    4:ldc1            #15  <String "BannerLayout">
	//    3    6:iconst_3        
	//    4    7:ldc2            #340 <String "onAttachedToWindow">
	//    5   10:invokestatic    #144 <Method void g.a(String, int, String)>
		attachedToWindow = true;
	//    6   13:aload_0         
	//    7   14:iconst_1        
	//    8   15:putfield        #45  <Field boolean attachedToWindow>
		scheduleReloadTask();
	//    9   18:aload_0         
	//   10   19:invokespecial   #334 <Method void scheduleReloadTask()>
	//   11   22:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #343 <Method void RelativeLayout.onDetachedFromWindow()>
		g.a("BannerLayout", 3, "onDetachedFromWindow");
	//    2    4:ldc1            #15  <String "BannerLayout">
	//    3    6:iconst_3        
	//    4    7:ldc2            #344 <String "onDetachedFromWindow">
	//    5   10:invokestatic    #144 <Method void g.a(String, int, String)>
		attachedToWindow = false;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #45  <Field boolean attachedToWindow>
		cancelReloadTask();
	//    9   18:aload_0         
	//   10   19:invokespecial   #346 <Method void cancelReloadTask()>
		clearVisibilityHandler();
	//   11   22:aload_0         
	//   12   23:invokespecial   #107 <Method void clearVisibilityHandler()>
	//   13   26:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof Bundle))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #350 <Class Bundle>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #352 <Method void RelativeLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #350 <Class Bundle>
	//    9   17:astore_1        
			setBannerId(((Bundle) (parcelable)).getInt("bannerId"));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc2            #354 <String "bannerId">
	//   13   23:invokevirtual   #358 <Method int Bundle.getInt(String)>
	//   14   26:invokevirtual   #361 <Method void setBannerId(int)>
			adRulesResult = (f)((Bundle) (parcelable)).getSerializable("adRulesResult");
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:ldc2            #362 <String "adRulesResult">
	//   18   34:invokevirtual   #366 <Method java.io.Serializable Bundle.getSerializable(String)>
	//   19   37:checkcast       #304 <Class f>
	//   20   40:putfield        #299 <Field f adRulesResult>
			adPreferences = (AdPreferences)((Bundle) (parcelable)).getSerializable("adPreferences");
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:ldc2            #367 <String "adPreferences">
	//   24   48:invokevirtual   #366 <Method java.io.Serializable Bundle.getSerializable(String)>
	//   25   51:checkcast       #369 <Class AdPreferences>
	//   26   54:putfield        #371 <Field AdPreferences adPreferences>
			offset = ((Bundle) (parcelable)).getInt("offset");
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:ldc2            #372 <String "offset">
	//   30   62:invokevirtual   #358 <Method int Bundle.getInt(String)>
	//   31   65:putfield        #47  <Field int offset>
			firstLoad = ((Bundle) (parcelable)).getBoolean("firstLoad");
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:ldc2            #373 <String "firstLoad">
	//   35   73:invokevirtual   #377 <Method boolean Bundle.getBoolean(String)>
	//   36   76:putfield        #49  <Field boolean firstLoad>
			shouldReloadBanner = ((Bundle) (parcelable)).getBoolean("shouldReloadBanner");
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:ldc2            #378 <String "shouldReloadBanner">
	//   40   84:invokevirtual   #377 <Method boolean Bundle.getBoolean(String)>
	//   41   87:putfield        #82  <Field boolean shouldReloadBanner>
			super.onRestoreInstanceState(((Bundle) (parcelable)).getParcelable("upperState"));
	//   42   90:aload_0         
	//   43   91:aload_1         
	//   44   92:ldc2            #380 <String "upperState">
	//   45   95:invokevirtual   #384 <Method Parcelable Bundle.getParcelable(String)>
	//   46   98:invokespecial   #352 <Method void RelativeLayout.onRestoreInstanceState(Parcelable)>
			return;
	//   47  101:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		if(isClicked())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #388 <Method boolean isClicked()>
	//*   2    4:ifeq            17
		{
			setClicked(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #391 <Method void setClicked(boolean)>
			shouldReloadBanner = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #82  <Field boolean shouldReloadBanner>
		}
		Parcelable parcelable = super.onSaveInstanceState();
	//    9   17:aload_0         
	//   10   18:invokespecial   #393 <Method Parcelable RelativeLayout.onSaveInstanceState()>
	//   11   21:astore_1        
		Bundle bundle = new Bundle();
	//   12   22:new             #350 <Class Bundle>
	//   13   25:dup             
	//   14   26:invokespecial   #394 <Method void Bundle()>
	//   15   29:astore_2        
		bundle.putInt("bannerId", getBannerId());
	//   16   30:aload_2         
	//   17   31:ldc2            #354 <String "bannerId">
	//   18   34:aload_0         
	//   19   35:invokevirtual   #396 <Method int getBannerId()>
	//   20   38:invokevirtual   #400 <Method void Bundle.putInt(String, int)>
		bundle.putParcelable("upperState", parcelable);
	//   21   41:aload_2         
	//   22   42:ldc2            #380 <String "upperState">
	//   23   45:aload_1         
	//   24   46:invokevirtual   #404 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putSerializable("adRulesResult", ((java.io.Serializable) (adRulesResult)));
	//   25   49:aload_2         
	//   26   50:ldc2            #362 <String "adRulesResult">
	//   27   53:aload_0         
	//   28   54:getfield        #299 <Field f adRulesResult>
	//   29   57:invokevirtual   #408 <Method void Bundle.putSerializable(String, java.io.Serializable)>
		bundle.putSerializable("adPreferences", ((java.io.Serializable) (adPreferences)));
	//   30   60:aload_2         
	//   31   61:ldc2            #367 <String "adPreferences">
	//   32   64:aload_0         
	//   33   65:getfield        #371 <Field AdPreferences adPreferences>
	//   34   68:invokevirtual   #408 <Method void Bundle.putSerializable(String, java.io.Serializable)>
		bundle.putInt("offset", offset);
	//   35   71:aload_2         
	//   36   72:ldc2            #372 <String "offset">
	//   37   75:aload_0         
	//   38   76:getfield        #47  <Field int offset>
	//   39   79:invokevirtual   #400 <Method void Bundle.putInt(String, int)>
		bundle.putBoolean("firstLoad", firstLoad);
	//   40   82:aload_2         
	//   41   83:ldc2            #373 <String "firstLoad">
	//   42   86:aload_0         
	//   43   87:getfield        #49  <Field boolean firstLoad>
	//   44   90:invokevirtual   #412 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("shouldReloadBanner", shouldReloadBanner);
	//   45   93:aload_2         
	//   46   94:ldc2            #378 <String "shouldReloadBanner">
	//   47   97:aload_0         
	//   48   98:getfield        #82  <Field boolean shouldReloadBanner>
	//   49  101:invokevirtual   #412 <Method void Bundle.putBoolean(String, boolean)>
		return ((Parcelable) (bundle));
	//   50  104:aload_2         
	//   51  105:areturn         
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #415 <Method void RelativeLayout.onWindowFocusChanged(boolean)>
		g.a("BannerLayout", 3, "onWindowFocusChanged");
	//    3    5:ldc1            #15  <String "BannerLayout">
	//    4    7:iconst_3        
	//    5    8:ldc2            #416 <String "onWindowFocusChanged">
	//    6   11:invokestatic    #144 <Method void g.a(String, int, String)>
		if(flag)
	//*   7   14:iload_1         
	//*   8   15:ifeq            44
		{
			if(shouldReloadBanner)
	//*   9   18:aload_0         
	//*  10   19:getfield        #82  <Field boolean shouldReloadBanner>
	//*  11   22:ifeq            34
			{
				shouldReloadBanner = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #82  <Field boolean shouldReloadBanner>
				load();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #336 <Method void load()>
			}
			attachedToWindow = true;
	//   17   34:aload_0         
	//   18   35:iconst_1        
	//   19   36:putfield        #45  <Field boolean attachedToWindow>
			scheduleReloadTask();
	//   20   39:aload_0         
	//   21   40:invokespecial   #334 <Method void scheduleReloadTask()>
			return;
	//   22   43:return          
		} else
		{
			attachedToWindow = false;
	//   23   44:aload_0         
	//   24   45:iconst_0        
	//   25   46:putfield        #45  <Field boolean attachedToWindow>
			cancelReloadTask();
	//   26   49:aload_0         
	//   27   50:invokespecial   #346 <Method void cancelReloadTask()>
			return;
	//   28   53:return          
		}
	}

	protected abstract void reload();

	public abstract void setAdTag(String s);

	protected abstract void setBannerId(int j);

	public void setClicked(boolean flag)
	{
		clicked = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean clicked>
	//    3    5:return          
	}

	public void setErrorMessage(String s)
	{
		error = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #268 <Field String error>
	//    3    5:return          
	}

	public void setFirstLoad(boolean flag)
	{
		firstLoad = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean firstLoad>
	//    3    5:return          
	}

	protected void setHardwareAcceleration(AdPreferences adpreferences)
	{
		com.startapp.android.publish.adsCommon.Utils.i.a(adpreferences, "hardwareAccelerated", c.a(((android.view.View) (this)), attachedToWindow));
	//    0    0:aload_1         
	//    1    1:ldc2            #421 <String "hardwareAccelerated">
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field boolean attachedToWindow>
	//    5    9:invokestatic    #426 <Method boolean c.a(android.view.View, boolean)>
	//    6   12:invokestatic    #431 <Method void com.startapp.android.publish.adsCommon.Utils.i.a(AdPreferences, String, boolean)>
	//    7   15:return          
	}

	protected boolean shouldSendImpression(com.startapp.android.publish.adsCommon.i j)
	{
		return j != null && !j.c();
	//    0    0:aload_1         
	//    1    1:ifnull          13
	//    2    4:aload_1         
	//    3    5:invokevirtual   #438 <Method boolean com.startapp.android.publish.adsCommon.i.c()>
	//    4    8:ifne            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	protected void startVisibilityRunnable(com.startapp.android.publish.adsCommon.i j)
	{
		if(!shouldSendImpression(j))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #442 <Method boolean shouldSendImpression(com.startapp.android.publish.adsCommon.i)>
	//*   3    5:ifne            9
		{
			return;
	//    4    8:return          
		} else
		{
			g.a("BannerLayout", 3, "BannerBase.startVisibilityRunnable - run visibility check");
	//    5    9:ldc1            #15  <String "BannerLayout">
	//    6   11:iconst_3        
	//    7   12:ldc2            #444 <String "BannerBase.startVisibilityRunnable - run visibility check">
	//    8   15:invokestatic    #144 <Method void g.a(String, int, String)>
			((_cls1) (new Runnable(j) {

				public void run()
				{
					boolean flag;
					try
					{
						if(!b.shouldSendImpression(a))
							break MISSING_BLOCK_LABEL_125;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field BannerBase b>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field com.startapp.android.publish.adsCommon.i a>
				//    4    8:invokevirtual   #36  <Method boolean BannerBase.shouldSendImpression(com.startapp.android.publish.adsCommon.i)>
				//    5   11:ifeq            125
						flag = b.isVisible();
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field BannerBase b>
				//    8   18:invokevirtual   #40  <Method boolean BannerBase.isVisible()>
				//    9   21:istore_1        
					}
				//*  10   22:iload_1         
				//*  11   23:ifeq            61
				//*  12   26:aload_0         
				//*  13   27:getfield        #28  <Field boolean c>
				//*  14   30:ifeq            61
				//*  15   33:aload_0         
				//*  16   34:iconst_0        
				//*  17   35:putfield        #28  <Field boolean c>
				//*  18   38:aload_0         
				//*  19   39:getfield        #23  <Field com.startapp.android.publish.adsCommon.i a>
				//*  20   42:invokevirtual   #44  <Method void com.startapp.android.publish.adsCommon.i.a()>
				//*  21   45:aload_0         
				//*  22   46:getfield        #21  <Field BannerBase b>
				//*  23   49:invokestatic    #48  <Method Handler BannerBase.access$000(BannerBase)>
				//*  24   52:aload_0         
				//*  25   53:ldc2w           #49  <Long 100L>
				//*  26   56:invokevirtual   #56  <Method boolean Handler.postDelayed(Runnable, long)>
				//*  27   59:pop             
				//*  28   60:return          
				//*  29   61:iload_1         
				//*  30   62:ifne            45
				//*  31   65:aload_0         
				//*  32   66:getfield        #28  <Field boolean c>
				//*  33   69:ifne            45
				//*  34   72:aload_0         
				//*  35   73:iconst_1        
				//*  36   74:putfield        #28  <Field boolean c>
				//*  37   77:aload_0         
				//*  38   78:getfield        #23  <Field com.startapp.android.publish.adsCommon.i a>
				//*  39   81:invokevirtual   #58  <Method void com.startapp.android.publish.adsCommon.i.b()>
				//*  40   84:goto            45
					catch(Exception exception)
				//*  41   87:astore_2        
					{
						g.a("BannerLayout", 6, (new StringBuilder()).append("BannerBase.startVisibilityRunnable.run - runnable error ").append(exception.getMessage()).toString());
				//   42   88:ldc1            #60  <String "BannerLayout">
				//   43   90:bipush          6
				//   44   92:new             #62  <Class StringBuilder>
				//   45   95:dup             
				//   46   96:invokespecial   #63  <Method void StringBuilder()>
				//   47   99:ldc1            #65  <String "BannerBase.startVisibilityRunnable.run - runnable error ">
				//   48  101:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//   49  104:aload_2         
				//   50  105:invokevirtual   #73  <Method String Exception.getMessage()>
				//   51  108:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//   52  111:invokevirtual   #76  <Method String StringBuilder.toString()>
				//   53  114:invokestatic    #81  <Method void g.a(String, int, String)>
						b.clearVisibilityHandler();
				//   54  117:aload_0         
				//   55  118:getfield        #21  <Field BannerBase b>
				//   56  121:invokestatic    #85  <Method void BannerBase.access$100(BannerBase)>
						return;
				//   57  124:return          
					}
					if(!flag) goto _L2; else goto _L1
_L1:
					if(!c) goto _L2; else goto _L3
_L3:
					c = false;
					a.a();
_L5:
					b.visibilityHandler.postDelayed(((Runnable) (this)), 100L);
					return;
_L2:
					if(flag) goto _L5; else goto _L4
_L4:
					if(c) goto _L5; else goto _L6
_L6:
					c = true;
					a.b();
					  goto _L5
					b.clearVisibilityHandler();
				//   58  125:aload_0         
				//   59  126:getfield        #21  <Field BannerBase b>
				//   60  129:invokestatic    #85  <Method void BannerBase.access$100(BannerBase)>
					return;
				//   61  132:return          
				}

				final com.startapp.android.publish.adsCommon.i a;
				final BannerBase b;
				private boolean c;

			
			{
				b = BannerBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field BannerBase b>
				a = j;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.startapp.android.publish.adsCommon.i a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
				c = true;
			//    8   14:aload_0         
			//    9   15:iconst_1        
			//   10   16:putfield        #28  <Field boolean c>
			//   11   19:return          
			}
			}
)).run();
	//    9   18:new             #6   <Class BannerBase$1>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokespecial   #447 <Method void BannerBase$1(BannerBase, com.startapp.android.publish.adsCommon.i)>
	//   14   27:invokevirtual   #450 <Method void BannerBase$1.run()>
			return;
	//   15   30:return          
		}
	}

	private static final String TAG = "BannerLayout";
	protected AdPreferences adPreferences;
	protected f adRulesResult;
	protected String adTag;
	private boolean attachedToWindow;
	private boolean clicked;
	protected boolean drawn;
	private String error;
	private boolean firstLoad;
	protected int innerBanner3dId;
	protected int innerBannerStandardId;
	protected int offset;
	private boolean shouldReloadBanner;
	private a task;
	private Timer timer;
	private o viewabilityChecker;
	private Handler visibilityHandler;


/*
	static Handler access$000(BannerBase bannerbase)
	{
		return bannerbase.visibilityHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Handler visibilityHandler>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(BannerBase bannerbase)
	{
		bannerbase.clearVisibilityHandler();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void clearVisibilityHandler()>
		return;
	//    2    4:return          
	}

*/
}
