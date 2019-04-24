// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.i.a;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			m, j, AdsConstants

class m$2
	implements Runnable
{

	public void run()
	{
		try
		{
			j j1 = new j();
	//    0    0:new             #30  <Class j>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void j()>
	//    3    7:astore_1        
			AdPreferences adpreferences = new AdPreferences();
	//    4    8:new             #33  <Class AdPreferences>
	//    5   11:dup             
	//    6   12:invokespecial   #34  <Method void AdPreferences()>
	//    7   15:astore_2        
			i.a(a, adpreferences);
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field Context a>
	//   10   20:aload_2         
	//   11   21:invokestatic    #39  <Method void i.a(Context, AdPreferences)>
			j1.fillApplicationDetails(a, adpreferences);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field Context a>
	//   15   29:aload_2         
	//   16   30:invokevirtual   #42  <Method void j.fillApplicationDetails(Context, AdPreferences)>
			com.startapp.android.publish.adsCommon.i.a.a(a, com.startapp.android.publish.adsCommon.AdsConstants.a(onstants.ApiType.DOWNLOAD), ((BaseRequest) (j1)), ((java.util.Map) (null)));
	//   17   33:aload_0         
	//   18   34:getfield        #21  <Field Context a>
	//   19   37:getstatic       #48  <Field AdsConstants$ApiType AdsConstants$ApiType.DOWNLOAD>
	//   20   40:invokestatic    #53  <Method String com.startapp.android.publish.adsCommon.AdsConstants.a(AdsConstants$ApiType)>
	//   21   43:aload_1         
	//   22   44:aconst_null     
	//   23   45:invokestatic    #58  <Method com.startapp.common.a.h$a a.a(Context, String, BaseRequest, java.util.Map)>
	//   24   48:pop             
			return;
	//   25   49:return          
		}
		catch(Exception exception)
	//*  26   50:astore_1        
		{
			g.a(6, "Error occured while sending download event", ((Throwable) (exception)));
	//   27   51:bipush          6
	//   28   53:ldc1            #60  <String "Error occured while sending download event">
	//   29   55:aload_1         
	//   30   56:invokestatic    #65  <Method void g.a(int, String, Throwable)>
			f.a(a, d.b, "StartAppSDKInternal.sendDownloadEvent", exception.getMessage(), "");
	//   31   59:aload_0         
	//   32   60:getfield        #21  <Field Context a>
	//   33   63:getstatic       #70  <Field d d.b>
	//   34   66:ldc1            #72  <String "StartAppSDKInternal.sendDownloadEvent">
	//   35   68:aload_1         
	//   36   69:invokevirtual   #76  <Method String Exception.getMessage()>
	//   37   72:ldc1            #78  <String "">
	//   38   74:invokestatic    #83  <Method void f.a(Context, d, String, String, String)>
			return;
	//   39   77:return          
		}
	}

	final Context a;
	final m b;

	m$2(m m1, Context context)
	{
		b = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field m b>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Context a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
