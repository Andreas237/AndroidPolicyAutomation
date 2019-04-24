// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.net.Uri;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			Profile, FacebookException

static final class Profile$1
	implements com.facebook.internal.aphMeRequestWithCacheCallback
{

	public void onFailure(FacebookException facebookexception)
	{
	//    0    0:return          
	}

	public void onSuccess(JSONObject jsonobject)
	{
		String s = jsonobject.optString("id");
	//    0    0:aload_1         
	//    1    1:ldc1            #21  <String "id">
	//    2    3:invokevirtual   #27  <Method String JSONObject.optString(String)>
	//    3    6:astore_2        
		if(s == null)
	//*   4    7:aload_2         
	//*   5    8:ifnonnull       12
			return;
	//    6   11:return          
		String s5 = jsonobject.optString("link");
	//    7   12:aload_1         
	//    8   13:ldc1            #29  <String "link">
	//    9   15:invokevirtual   #27  <Method String JSONObject.optString(String)>
	//   10   18:astore          7
		String s1 = jsonobject.optString("first_name");
	//   11   20:aload_1         
	//   12   21:ldc1            #31  <String "first_name">
	//   13   23:invokevirtual   #27  <Method String JSONObject.optString(String)>
	//   14   26:astore_3        
		String s2 = jsonobject.optString("middle_name");
	//   15   27:aload_1         
	//   16   28:ldc1            #33  <String "middle_name">
	//   17   30:invokevirtual   #27  <Method String JSONObject.optString(String)>
	//   18   33:astore          4
		String s3 = jsonobject.optString("last_name");
	//   19   35:aload_1         
	//   20   36:ldc1            #35  <String "last_name">
	//   21   38:invokevirtual   #27  <Method String JSONObject.optString(String)>
	//   22   41:astore          5
		String s4 = jsonobject.optString("name");
	//   23   43:aload_1         
	//   24   44:ldc1            #37  <String "name">
	//   25   46:invokevirtual   #27  <Method String JSONObject.optString(String)>
	//   26   49:astore          6
		if(s5 != null)
	//*  27   51:aload           7
	//*  28   53:ifnull          65
			jsonobject = ((JSONObject) (Uri.parse(s5)));
	//   29   56:aload           7
	//   30   58:invokestatic    #43  <Method Uri Uri.parse(String)>
	//   31   61:astore_1        
		else
	//*  32   62:goto            70
			jsonobject = null;
	//   33   65:aconst_null     
	//   34   66:astore_1        
	//*  35   67:goto            62
		Profile.setCurrentProfile(new Profile(s, s1, s2, s3, s4, ((Uri) (jsonobject))));
	//   36   70:new             #8   <Class Profile>
	//   37   73:dup             
	//   38   74:aload_2         
	//   39   75:aload_3         
	//   40   76:aload           4
	//   41   78:aload           5
	//   42   80:aload           6
	//   43   82:aload_1         
	//   44   83:invokespecial   #46  <Method void Profile(String, String, String, String, String, Uri)>
	//   45   86:invokestatic    #50  <Method void Profile.setCurrentProfile(Profile)>
	//   46   89:return          
	}

	Profile$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
