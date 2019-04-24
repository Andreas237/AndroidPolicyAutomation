// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.os.Bundle;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			m, f

static final class m$3
	implements android.app.ication.ActivityLifecycleCallbacks
{

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityCreated [").append(((Object) (activity)).getClass().getName()).append(", ").append(((Object) (bundle))).append("]").toString());
	//    0    0:ldc1            #20  <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:new             #22  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #23  <Method void StringBuilder()>
	//    5   10:ldc1            #25  <String "onActivityCreated [">
	//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
	//    9   19:invokevirtual   #39  <Method String Class.getName()>
	//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #41  <String ", ">
	//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_2         
	//   14   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   15   34:ldc1            #46  <String "]">
	//   16   36:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   18   42:invokestatic    #54  <Method void g.a(String, int, String)>
		m.a().a(activity, bundle);
	//   19   45:invokestatic    #57  <Method m m.a()>
	//   20   48:aload_1         
	//   21   49:aload_2         
	//   22   50:invokevirtual   #59  <Method void m.a(Activity, Bundle)>
		if(i.a(2L))
	//*  23   53:ldc2w           #60  <Long 2L>
	//*  24   56:invokestatic    #66  <Method boolean i.a(long)>
	//*  25   59:ifeq            70
			f.a().a(activity, bundle);
	//   26   62:invokestatic    #71  <Method f f.a()>
	//   27   65:aload_1         
	//   28   66:aload_2         
	//   29   67:invokevirtual   #72  <Method void f.a(Activity, Bundle)>
	//   30   70:return          
	}

	public void onActivityDestroyed(Activity activity)
	{
		g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityDestroyed [").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//    0    0:ldc1            #20  <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:new             #22  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #23  <Method void StringBuilder()>
	//    5   10:ldc1            #76  <String "onActivityDestroyed [">
	//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
	//    9   19:invokevirtual   #39  <Method String Class.getName()>
	//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #46  <String "]">
	//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
		m.a().e(activity);
	//   15   36:invokestatic    #57  <Method m m.a()>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #79  <Method void m.e(Activity)>
	//   18   43:return          
	}

	public void onActivityPaused(Activity activity)
	{
		g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityPaused [").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//    0    0:ldc1            #20  <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:new             #22  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #23  <Method void StringBuilder()>
	//    5   10:ldc1            #82  <String "onActivityPaused [">
	//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
	//    9   19:invokevirtual   #39  <Method String Class.getName()>
	//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #46  <String "]">
	//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
		m.a().c(activity);
	//   15   36:invokestatic    #57  <Method m m.a()>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #85  <Method void m.c(Activity)>
	//   18   43:return          
	}

	public void onActivityResumed(Activity activity)
	{
		g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityResumed [").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//    0    0:ldc1            #20  <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:new             #22  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #23  <Method void StringBuilder()>
	//    5   10:ldc1            #88  <String "onActivityResumed [">
	//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
	//    9   19:invokevirtual   #39  <Method String Class.getName()>
	//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #46  <String "]">
	//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
		m.a().b(activity);
	//   15   36:invokestatic    #57  <Method m m.a()>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #91  <Method void m.b(Activity)>
	//   18   43:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivitySaveInstanceState [").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//    0    0:ldc1            #20  <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:new             #22  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #23  <Method void StringBuilder()>
	//    5   10:ldc1            #94  <String "onActivitySaveInstanceState [">
	//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
	//    9   19:invokevirtual   #39  <Method String Class.getName()>
	//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #46  <String "]">
	//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
		m.a().b(activity, bundle);
	//   15   36:invokestatic    #57  <Method m m.a()>
	//   16   39:aload_1         
	//   17   40:aload_2         
	//   18   41:invokevirtual   #96  <Method void m.b(Activity, Bundle)>
	//   19   44:return          
	}

	public void onActivityStarted(Activity activity)
	{
		g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityStarted [").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//    0    0:ldc1            #20  <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:new             #22  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #23  <Method void StringBuilder()>
	//    5   10:ldc1            #99  <String "onActivityStarted [">
	//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
	//    9   19:invokevirtual   #39  <Method String Class.getName()>
	//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #46  <String "]">
	//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
		m.a().a(activity);
	//   15   36:invokestatic    #57  <Method m m.a()>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #101 <Method void m.a(Activity)>
	//   18   43:return          
	}

	public void onActivityStopped(Activity activity)
	{
		g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityStopped [").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//    0    0:ldc1            #20  <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:new             #22  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #23  <Method void StringBuilder()>
	//    5   10:ldc1            #104 <String "onActivityStopped [">
	//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
	//    9   19:invokevirtual   #39  <Method String Class.getName()>
	//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #46  <String "]">
	//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
		m.a().d(activity);
	//   15   36:invokestatic    #57  <Method m m.a()>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #107 <Method void m.d(Activity)>
	//   18   43:return          
	}

	m$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
