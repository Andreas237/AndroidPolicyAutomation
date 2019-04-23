// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.paypal.android.sdk:
//			o, cu, cv

public class ct extends o
{

	public ct()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void o()>
	//    2    4:return          
	}

	public final Intent a(String s, cu cu1, cv cv1, String s1)
	{
		Intent intent = a("com.paypal.android.p2pmobile.Sdk", "com.paypal.android.lib.authenticator.activity.SdkActivity");
	//    0    0:ldc1            #17  <String "com.paypal.android.p2pmobile.Sdk">
	//    1    2:ldc1            #19  <String "com.paypal.android.lib.authenticator.activity.SdkActivity">
	//    2    4:invokestatic    #22  <Method Intent a(String, String)>
	//    3    7:astore          5
		Bundle bundle = new Bundle();
	//    4    9:new             #24  <Class Bundle>
	//    5   12:dup             
	//    6   13:invokespecial   #25  <Method void Bundle()>
	//    7   16:astore          6
		bundle.putString("target_client_id", s);
	//    8   18:aload           6
	//    9   20:ldc1            #27  <String "target_client_id">
	//   10   22:aload_1         
	//   11   23:invokevirtual   #31  <Method void Bundle.putString(String, String)>
		if(cu1 != null)
	//*  12   26:aload_2         
	//*  13   27:ifnull          41
			bundle.putString("token_request_type", cu1.toString());
	//   14   30:aload           6
	//   15   32:ldc1            #33  <String "token_request_type">
	//   16   34:aload_2         
	//   17   35:invokevirtual   #39  <Method String cu.toString()>
	//   18   38:invokevirtual   #31  <Method void Bundle.putString(String, String)>
		if(cv1 != null)
	//*  19   41:aload_3         
	//*  20   42:ifnull          56
			bundle.putString("response_type", cv1.toString());
	//   21   45:aload           6
	//   22   47:ldc1            #41  <String "response_type">
	//   23   49:aload_3         
	//   24   50:invokevirtual   #44  <Method String cv.toString()>
	//   25   53:invokevirtual   #31  <Method void Bundle.putString(String, String)>
		bundle.putString("app_guid", s1);
	//   26   56:aload           6
	//   27   58:ldc1            #46  <String "app_guid">
	//   28   60:aload           4
	//   29   62:invokevirtual   #31  <Method void Bundle.putString(String, String)>
		(new StringBuilder("launching authenticator with bundle:")).append(((Object) (bundle)));
	//   30   65:new             #48  <Class StringBuilder>
	//   31   68:dup             
	//   32   69:ldc1            #50  <String "launching authenticator with bundle:">
	//   33   71:invokespecial   #53  <Method void StringBuilder(String)>
	//   34   74:aload           6
	//   35   76:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   36   79:pop             
		intent.putExtras(bundle);
	//   37   80:aload           5
	//   38   82:aload           6
	//   39   84:invokevirtual   #63  <Method Intent Intent.putExtras(Bundle)>
	//   40   87:pop             
		return intent;
	//   41   88:aload           5
	//   42   90:areturn         
	}

	private static final String a = "ct";

	static 
	{
	//    0    0:return          
	}
}
