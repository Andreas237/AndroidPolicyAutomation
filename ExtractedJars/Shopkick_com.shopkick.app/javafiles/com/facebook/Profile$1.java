// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.net.Uri;
import android.util.Log;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			Profile, FacebookException

static final class Profile$1
	implements com.facebook.internal.aphMeRequestWithCacheCallback
{

	public void onFailure(FacebookException facebookexception)
	{
		String s = Profile.access$000();
	//    0    0:invokestatic    #21  <Method String Profile.access$000()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #23  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #24  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Got unexpected exception: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #26  <String "Got unexpected exception: ">
	//    8   15:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (facebookexception)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		Log.e(s, stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #42  <Method int Log.e(String, String)>
	//   18   33:pop             
	//   19   34:return          
	}

	public void onSuccess(JSONObject jsonobject)
	{
		String s = jsonobject.optString("id");
	//    0    0:aload_1         
	//    1    1:ldc1            #46  <String "id">
	//    2    3:invokevirtual   #52  <Method String JSONObject.optString(String)>
	//    3    6:astore_2        
		if(s == null)
	//*   4    7:aload_2         
	//*   5    8:ifnonnull       12
			return;
	//    6   11:return          
		String s5 = jsonobject.optString("link");
	//    7   12:aload_1         
	//    8   13:ldc1            #54  <String "link">
	//    9   15:invokevirtual   #52  <Method String JSONObject.optString(String)>
	//   10   18:astore          7
		String s1 = jsonobject.optString("first_name");
	//   11   20:aload_1         
	//   12   21:ldc1            #56  <String "first_name">
	//   13   23:invokevirtual   #52  <Method String JSONObject.optString(String)>
	//   14   26:astore_3        
		String s2 = jsonobject.optString("middle_name");
	//   15   27:aload_1         
	//   16   28:ldc1            #58  <String "middle_name">
	//   17   30:invokevirtual   #52  <Method String JSONObject.optString(String)>
	//   18   33:astore          4
		String s3 = jsonobject.optString("last_name");
	//   19   35:aload_1         
	//   20   36:ldc1            #60  <String "last_name">
	//   21   38:invokevirtual   #52  <Method String JSONObject.optString(String)>
	//   22   41:astore          5
		String s4 = jsonobject.optString("name");
	//   23   43:aload_1         
	//   24   44:ldc1            #62  <String "name">
	//   25   46:invokevirtual   #52  <Method String JSONObject.optString(String)>
	//   26   49:astore          6
		if(s5 != null)
	//*  27   51:aload           7
	//*  28   53:ifnull          65
			jsonobject = ((JSONObject) (Uri.parse(s5)));
	//   29   56:aload           7
	//   30   58:invokestatic    #68  <Method Uri Uri.parse(String)>
	//   31   61:astore_1        
		else
	//*  32   62:goto            67
			jsonobject = null;
	//   33   65:aconst_null     
	//   34   66:astore_1        
		Profile.setCurrentProfile(new Profile(s, s1, s2, s3, s4, ((Uri) (jsonobject))));
	//   35   67:new             #8   <Class Profile>
	//   36   70:dup             
	//   37   71:aload_2         
	//   38   72:aload_3         
	//   39   73:aload           4
	//   40   75:aload           5
	//   41   77:aload           6
	//   42   79:aload_1         
	//   43   80:invokespecial   #71  <Method void Profile(String, String, String, String, String, Uri)>
	//   44   83:invokestatic    #75  <Method void Profile.setCurrentProfile(Profile)>
	//   45   86:return          
	}

	Profile$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
