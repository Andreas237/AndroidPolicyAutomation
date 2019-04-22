// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.beta:
//			CheckForUpdatesResponse

class CheckForUpdatesResponseTransform
{

	CheckForUpdatesResponseTransform()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public CheckForUpdatesResponse fromJson(JSONObject jsonobject)
		throws IOException
	{
		if(jsonobject == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			String s = jsonobject.optString("url", ((String) (null)));
	//    4    6:aload_1         
	//    5    7:ldc1            #15  <String "url">
	//    6    9:aconst_null     
	//    7   10:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//    8   13:astore_2        
			String s1 = jsonobject.optString("version_string", ((String) (null)));
	//    9   14:aload_1         
	//   10   15:ldc1            #23  <String "version_string">
	//   11   17:aconst_null     
	//   12   18:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//   13   21:astore_3        
			String s2 = jsonobject.optString("build_version", ((String) (null)));
	//   14   22:aload_1         
	//   15   23:ldc1            #25  <String "build_version">
	//   16   25:aconst_null     
	//   17   26:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//   18   29:astore          4
			return new CheckForUpdatesResponse(s, s1, jsonobject.optString("display_version", ((String) (null))), s2, jsonobject.optString("identifier", ((String) (null))), jsonobject.optString("instance_identifier", ((String) (null))));
	//   19   31:new             #27  <Class CheckForUpdatesResponse>
	//   20   34:dup             
	//   21   35:aload_2         
	//   22   36:aload_3         
	//   23   37:aload_1         
	//   24   38:ldc1            #29  <String "display_version">
	//   25   40:aconst_null     
	//   26   41:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//   27   44:aload           4
	//   28   46:aload_1         
	//   29   47:ldc1            #31  <String "identifier">
	//   30   49:aconst_null     
	//   31   50:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//   32   53:aload_1         
	//   33   54:ldc1            #33  <String "instance_identifier">
	//   34   56:aconst_null     
	//   35   57:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//   36   60:invokespecial   #36  <Method void CheckForUpdatesResponse(String, String, String, String, String, String)>
	//   37   63:areturn         
		}
	}
}
