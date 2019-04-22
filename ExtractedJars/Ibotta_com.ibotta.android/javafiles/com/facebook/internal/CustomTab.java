// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import com.facebook.FacebookSdk;

// Referenced classes of package com.facebook.internal:
//			ServerProtocol, Utility

public class CustomTab
{

	public CustomTab(String s, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		Bundle bundle1 = bundle;
	//    2    4:aload_2         
	//    3    5:astore_3        
		if(bundle == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       18
			bundle1 = new Bundle();
	//    6   10:new             #13  <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #14  <Method void Bundle()>
	//    9   17:astore_3        
		bundle = ((Bundle) (ServerProtocol.getDialogAuthority()));
	//   10   18:invokestatic    #20  <Method String ServerProtocol.getDialogAuthority()>
	//   11   21:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #22  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #23  <Method void StringBuilder()>
	//   15   29:astore          4
		stringbuilder.append(FacebookSdk.getGraphApiVersion());
	//   16   31:aload           4
	//   17   33:invokestatic    #28  <Method String FacebookSdk.getGraphApiVersion()>
	//   18   36:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append("/");
	//   20   40:aload           4
	//   21   42:ldc1            #34  <String "/">
	//   22   44:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append("dialog/");
	//   24   48:aload           4
	//   25   50:ldc1            #36  <String "dialog/">
	//   26   52:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
		stringbuilder.append(s);
	//   28   56:aload           4
	//   29   58:aload_1         
	//   30   59:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		uri = Utility.buildUri(((String) (bundle)), stringbuilder.toString(), bundle1);
	//   32   63:aload_0         
	//   33   64:aload_2         
	//   34   65:aload           4
	//   35   67:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   36   70:aload_3         
	//   37   71:invokestatic    #45  <Method Uri Utility.buildUri(String, String, Bundle)>
	//   38   74:putfield        #47  <Field Uri uri>
	//   39   77:return          
	}

	public void openCustomTab(Activity activity, String s)
	{
		CustomTabsIntent customtabsintent = (new android.support.customtabs.CustomTabsIntent.Builder()).build();
	//    0    0:new             #52  <Class android.support.customtabs.CustomTabsIntent$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void android.support.customtabs.CustomTabsIntent$Builder()>
	//    3    7:invokevirtual   #57  <Method CustomTabsIntent android.support.customtabs.CustomTabsIntent$Builder.build()>
	//    4   10:astore_3        
		customtabsintent.intent.setPackage(s);
	//    5   11:aload_3         
	//    6   12:getfield        #63  <Field Intent CustomTabsIntent.intent>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #69  <Method Intent Intent.setPackage(String)>
	//    9   19:pop             
		customtabsintent.intent.addFlags(0x40000000);
	//   10   20:aload_3         
	//   11   21:getfield        #63  <Field Intent CustomTabsIntent.intent>
	//   12   24:ldc1            #70  <Int 0x40000000>
	//   13   26:invokevirtual   #74  <Method Intent Intent.addFlags(int)>
	//   14   29:pop             
		customtabsintent.launchUrl(((android.content.Context) (activity)), uri);
	//   15   30:aload_3         
	//   16   31:aload_1         
	//   17   32:aload_0         
	//   18   33:getfield        #47  <Field Uri uri>
	//   19   36:invokevirtual   #78  <Method void CustomTabsIntent.launchUrl(android.content.Context, Uri)>
	//   20   39:return          
	}

	private Uri uri;
}
