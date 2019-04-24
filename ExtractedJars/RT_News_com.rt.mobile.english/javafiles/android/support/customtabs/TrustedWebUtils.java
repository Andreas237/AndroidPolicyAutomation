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
		if(BundleCompat.getBinder(customtabsintent.intent.getExtras(), "android.support.customtabs.extra.SESSION") == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field Intent CustomTabsIntent.intent>
	//*   2    4:invokevirtual   #28  <Method android.os.Bundle Intent.getExtras()>
	//*   3    7:ldc1            #30  <String "android.support.customtabs.extra.SESSION">
	//*   4    9:invokestatic    #36  <Method android.os.IBinder BundleCompat.getBinder(android.os.Bundle, String)>
	//*   5   12:ifnonnull       25
		{
			throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
	//    6   15:new             #38  <Class IllegalArgumentException>
	//    7   18:dup             
	//    8   19:ldc1            #40  <String "Given CustomTabsIntent should be associated with a valid CustomTabsSession">
	//    9   21:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   10   24:athrow          
		} else
		{
			customtabsintent.intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
	//   11   25:aload_1         
	//   12   26:getfield        #22  <Field Intent CustomTabsIntent.intent>
	//   13   29:ldc1            #8   <String "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY">
	//   14   31:iconst_1        
	//   15   32:invokevirtual   #47  <Method Intent Intent.putExtra(String, boolean)>
	//   16   35:pop             
			customtabsintent.launchUrl(context, uri);
	//   17   36:aload_1         
	//   18   37:aload_0         
	//   19   38:aload_2         
	//   20   39:invokevirtual   #51  <Method void CustomTabsIntent.launchUrl(Context, Uri)>
			return;
	//   21   42:return          
		}
	}

	public static final String EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
}
