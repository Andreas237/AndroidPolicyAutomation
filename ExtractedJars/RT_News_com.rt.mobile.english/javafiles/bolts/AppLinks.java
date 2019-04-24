// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package bolts:
//			MeasurementEvent

public final class AppLinks
{

	public AppLinks()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static Bundle getAppLinkData(Intent intent)
	{
		return intent.getBundleExtra("al_applink_data");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "al_applink_data">
	//    2    3:invokevirtual   #27  <Method Bundle Intent.getBundleExtra(String)>
	//    3    6:areturn         
	}

	public static Bundle getAppLinkExtras(Intent intent)
	{
		intent = ((Intent) (getAppLinkData(intent)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #30  <Method Bundle getAppLinkData(Intent)>
	//    2    4:astore_0        
		if(intent == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ((Bundle) (intent)).getBundle("extras");
	//    7   11:aload_0         
	//    8   12:ldc1            #11  <String "extras">
	//    9   14:invokevirtual   #35  <Method Bundle Bundle.getBundle(String)>
	//   10   17:areturn         
	}

	public static Uri getTargetUrl(Intent intent)
	{
		Object obj = ((Object) (getAppLinkData(intent)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #30  <Method Bundle getAppLinkData(Intent)>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
		{
			obj = ((Object) (((Bundle) (obj)).getString("target_url")));
	//    5    9:aload_1         
	//    6   10:ldc1            #14  <String "target_url">
	//    7   12:invokevirtual   #41  <Method String Bundle.getString(String)>
	//    8   15:astore_1        
			if(obj != null)
	//*   9   16:aload_1         
	//*  10   17:ifnull          25
				return Uri.parse(((String) (obj)));
	//   11   20:aload_1         
	//   12   21:invokestatic    #47  <Method Uri Uri.parse(String)>
	//   13   24:areturn         
		}
		return intent.getData();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #51  <Method Uri Intent.getData()>
	//   16   29:areturn         
	}

	public static Uri getTargetUrlFromInboundIntent(Context context, Intent intent)
	{
		Object obj = ((Object) (getAppLinkData(intent)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method Bundle getAppLinkData(Intent)>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          33
		{
			obj = ((Object) (((Bundle) (obj)).getString("target_url")));
	//    5    9:aload_2         
	//    6   10:ldc1            #14  <String "target_url">
	//    7   12:invokevirtual   #41  <Method String Bundle.getString(String)>
	//    8   15:astore_2        
			if(obj != null)
	//*   9   16:aload_2         
	//*  10   17:ifnull          33
			{
				MeasurementEvent.sendBroadcastEvent(context, "al_nav_in", intent, ((java.util.Map) (null)));
	//   11   20:aload_0         
	//   12   21:ldc1            #55  <String "al_nav_in">
	//   13   23:aload_1         
	//   14   24:aconst_null     
	//   15   25:invokestatic    #61  <Method void MeasurementEvent.sendBroadcastEvent(Context, String, Intent, java.util.Map)>
				return Uri.parse(((String) (obj)));
	//   16   28:aload_2         
	//   17   29:invokestatic    #47  <Method Uri Uri.parse(String)>
	//   18   32:areturn         
			}
		}
		return null;
	//   19   33:aconst_null     
	//   20   34:areturn         
	}

	static final String KEY_NAME_APPLINK_DATA = "al_applink_data";
	static final String KEY_NAME_EXTRAS = "extras";
	static final String KEY_NAME_TARGET = "target_url";
}
