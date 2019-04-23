// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.BundleCompat;

// Referenced classes of package android.support.customtabs:
//			CustomTabsIntent

public class TrustedWebUtils
{

	private TrustedWebUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static void launchAsTrustedWebActivity(Context context, CustomTabsIntent customtabsintent, Uri uri)
	{
		if(BundleCompat.getBinder(customtabsintent.intent.getExtras(), "android.support.customtabs.extra.SESSION") != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field Intent CustomTabsIntent.intent>
	//*   2    4:invokevirtual   #28  <Method android.os.Bundle Intent.getExtras()>
	//*   3    7:ldc1            #30  <String "android.support.customtabs.extra.SESSION">
	//*   4    9:invokestatic    #36  <Method android.os.IBinder BundleCompat.getBinder(android.os.Bundle, String)>
	//*   5   12:ifnull          33
		{
			customtabsintent.intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
	//    6   15:aload_1         
	//    7   16:getfield        #22  <Field Intent CustomTabsIntent.intent>
	//    8   19:ldc1            #8   <String "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY">
	//    9   21:iconst_1        
	//   10   22:invokevirtual   #40  <Method Intent Intent.putExtra(String, boolean)>
	//   11   25:pop             
			customtabsintent.launchUrl(context, uri);
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #44  <Method void CustomTabsIntent.launchUrl(Context, Uri)>
			return;
	//   16   32:return          
		} else
		{
			throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
	//   17   33:new             #46  <Class IllegalArgumentException>
	//   18   36:dup             
	//   19   37:ldc1            #48  <String "Given CustomTabsIntent should be associated with a valid CustomTabsSession">
	//   20   39:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   21   42:athrow          
		}
	}

	public static final String EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
}
