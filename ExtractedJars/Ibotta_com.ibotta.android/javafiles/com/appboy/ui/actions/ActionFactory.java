// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.actions;

import android.net.Uri;
import android.os.Bundle;
import com.appboy.enums.Channel;
import com.appboy.support.StringUtils;

// Referenced classes of package com.appboy.ui.actions:
//			UriAction

public class ActionFactory
{

	public ActionFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean flag, Channel channel)
	{
		if(uri != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          16
			return new UriAction(uri, bundle, flag, channel);
	//    2    4:new             #13  <Class UriAction>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #16  <Method void UriAction(Uri, Bundle, boolean, Channel)>
	//    9   15:areturn         
		else
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
	}

	public static UriAction createUriActionFromUrlString(String s, Bundle bundle, boolean flag, Channel channel)
	{
		if(!StringUtils.isNullOrBlank(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #24  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifne            18
			return createUriActionFromUri(Uri.parse(s), bundle, flag, channel);
	//    3    7:aload_0         
	//    4    8:invokestatic    #30  <Method Uri Uri.parse(String)>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:aload_3         
	//    8   14:invokestatic    #32  <Method UriAction createUriActionFromUri(Uri, Bundle, boolean, Channel)>
	//    9   17:areturn         
		else
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
	}
}
