// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner;

import com.startapp.android.publish.adsCommon.a.f;
import com.startapp.common.a.g;
import java.util.TimerTask;

// Referenced classes of package com.startapp.android.publish.ads.banner:
//			BannerBase

class BannerBase$a extends TimerTask
{

	public void run()
	{
		a.post(new Runnable() {

			public void run()
			{
				if(a.a.isShown() || a.a.adRulesResult != null && !a.a.adRulesResult.a())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field BannerBase$a a>
			//*   2    4:getfield        #25  <Field BannerBase BannerBase$a.a>
			//*   3    7:invokevirtual   #29  <Method boolean BannerBase.isShown()>
			//*   4   10:ifne            42
			//*   5   13:aload_0         
			//*   6   14:getfield        #19  <Field BannerBase$a a>
			//*   7   17:getfield        #25  <Field BannerBase BannerBase$a.a>
			//*   8   20:getfield        #33  <Field f BannerBase.adRulesResult>
			//*   9   23:ifnull          60
			//*  10   26:aload_0         
			//*  11   27:getfield        #19  <Field BannerBase$a a>
			//*  12   30:getfield        #25  <Field BannerBase BannerBase$a.a>
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
			//   22   54:getfield        #25  <Field BannerBase BannerBase$a.a>
			//   23   57:invokevirtual   #49  <Method void BannerBase.load()>
				}
			//   24   60:return          
			}

			final BannerBase.a a;

			
			{
				a = BannerBase.a.this;
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

	BannerBase$a(BannerBase bannerbase)
	{
		a = bannerbase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BannerBase a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void TimerTask()>
	//    5    9:return          
	}
}
