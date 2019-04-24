// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.d;
import com.startapp.common.a.g;
import com.truenet.android.TrueNetSDK;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			m, k

class m$1
	implements d
{

	public void a()
	{
		if(MetaData.getInstance().isUserAgentEnabled())
	//*   0    0:invokestatic    #31  <Method MetaData MetaData.getInstance()>
	//*   1    3:invokevirtual   #35  <Method boolean MetaData.isUserAgentEnabled()>
	//*   2    6:ifeq            34
		{
			long l = TimeUnit.SECONDS.toMillis(MetaData.getInstance().getUserAgentDelayInSeconds());
	//    3    9:getstatic       #41  <Field TimeUnit TimeUnit.SECONDS>
	//    4   12:invokestatic    #31  <Method MetaData MetaData.getInstance()>
	//    5   15:invokevirtual   #45  <Method long MetaData.getUserAgentDelayInSeconds()>
	//    6   18:invokevirtual   #49  <Method long TimeUnit.toMillis(long)>
	//    7   21:lstore_1        
			m.a(b, a, l);
	//    8   22:aload_0         
	//    9   23:getfield        #19  <Field m b>
	//   10   26:aload_0         
	//   11   27:getfield        #21  <Field Context a>
	//   12   30:lload_1         
	//   13   31:invokestatic    #52  <Method void m.a(m, Context, long)>
		}
		com.startapp.android.publish.adsCommon.Utils.b.c(a);
	//   14   34:aload_0         
	//   15   35:getfield        #21  <Field Context a>
	//   16   38:invokestatic    #57  <Method void b.c(Context)>
		com.startapp.android.publish.adsCommon.Utils.b.d(a);
	//   17   41:aload_0         
	//   18   42:getfield        #21  <Field Context a>
	//   19   45:invokestatic    #60  <Method void b.d(Context)>
		b.e(a);
	//   20   48:aload_0         
	//   21   49:getfield        #19  <Field m b>
	//   22   52:aload_0         
	//   23   53:getfield        #21  <Field Context a>
	//   24   56:invokevirtual   #63  <Method void m.e(Context)>
		if(android.os.d.VERSION.SDK_INT > 8)
	//*  25   59:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   62:bipush          8
	//*  27   64:icmple          120
			if(MetaData.getInstance().getTrueNetEnabled())
	//*  28   67:invokestatic    #31  <Method MetaData MetaData.getInstance()>
	//*  29   70:invokevirtual   #72  <Method boolean MetaData.getTrueNetEnabled()>
	//*  30   73:ifeq            121
			{
				if(!m.a(b))
	//*  31   76:aload_0         
	//*  32   77:getfield        #19  <Field m b>
	//*  33   80:invokestatic    #75  <Method boolean m.a(m)>
	//*  34   83:ifne            112
				{
					m.a(b, true);
	//   35   86:aload_0         
	//   36   87:getfield        #19  <Field m b>
	//   37   90:iconst_1        
	//   38   91:invokestatic    #78  <Method boolean m.a(m, boolean)>
	//   39   94:pop             
					TrueNetSDK.with(a, k.a(a, "shared_prefs_appId", ((String) (null))));
	//   40   95:aload_0         
	//   41   96:getfield        #21  <Field Context a>
	//   42   99:aload_0         
	//   43  100:getfield        #21  <Field Context a>
	//   44  103:ldc1            #80  <String "shared_prefs_appId">
	//   45  105:aconst_null     
	//   46  106:invokestatic    #85  <Method String k.a(Context, String, String)>
	//   47  109:invokestatic    #91  <Method void TrueNetSDK.with(Context, String)>
				}
				TrueNetSDK.enable(a, true);
	//   48  112:aload_0         
	//   49  113:getfield        #21  <Field Context a>
	//   50  116:iconst_1        
	//   51  117:invokestatic    #95  <Method void TrueNetSDK.enable(Context, boolean)>
			} else
	//*  52  120:return          
			if(m.a(b))
	//*  53  121:aload_0         
	//*  54  122:getfield        #19  <Field m b>
	//*  55  125:invokestatic    #75  <Method boolean m.a(m)>
	//*  56  128:ifeq            120
			{
				TrueNetSDK.enable(a, false);
	//   57  131:aload_0         
	//   58  132:getfield        #21  <Field Context a>
	//   59  135:iconst_0        
	//   60  136:invokestatic    #95  <Method void TrueNetSDK.enable(Context, boolean)>
				return;
	//   61  139:return          
			}
	}

	public void b()
	{
		g.a("StartAppSDKInternal", 3, "setPeriodicAlarms: onFailedLoadingMeta");
	//    0    0:ldc1            #97  <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:ldc1            #99  <String "setPeriodicAlarms: onFailedLoadingMeta">
	//    3    5:invokestatic    #104 <Method void g.a(String, int, String)>
		if(MetaData.getInstance().isUserAgentEnabled())
	//*   4    8:invokestatic    #31  <Method MetaData MetaData.getInstance()>
	//*   5   11:invokevirtual   #35  <Method boolean MetaData.isUserAgentEnabled()>
	//*   6   14:ifeq            39
		{
			long l = TimeUnit.SECONDS.toMillis(10L);
	//    7   17:getstatic       #41  <Field TimeUnit TimeUnit.SECONDS>
	//    8   20:ldc2w           #105 <Long 10L>
	//    9   23:invokevirtual   #49  <Method long TimeUnit.toMillis(long)>
	//   10   26:lstore_1        
			m.a(b, a, l);
	//   11   27:aload_0         
	//   12   28:getfield        #19  <Field m b>
	//   13   31:aload_0         
	//   14   32:getfield        #21  <Field Context a>
	//   15   35:lload_1         
	//   16   36:invokestatic    #52  <Method void m.a(m, Context, long)>
		}
	//   17   39:return          
	}

	final Context a;
	final m b;

	m$1(m m1, Context context)
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
