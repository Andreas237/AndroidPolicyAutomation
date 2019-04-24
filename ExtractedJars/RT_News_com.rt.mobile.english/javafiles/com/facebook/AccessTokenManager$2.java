// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.util.Log;
import com.facebook.internal.Utility;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			AccessTokenManager, GraphResponse

class AccessTokenManager$2
	implements 
{

	public void onCompleted(GraphResponse graphresponse)
	{
		graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:astore_1        
		if(graphresponse == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		graphresponse = ((GraphResponse) (((JSONObject) (graphresponse)).optJSONArray("data")));
	//    6   10:aload_1         
	//    7   11:ldc1            #41  <String "data">
	//    8   13:invokevirtual   #47  <Method JSONArray JSONObject.optJSONArray(String)>
	//    9   16:astore_1        
		if(graphresponse == null)
	//*  10   17:aload_1         
	//*  11   18:ifnonnull       22
			return;
	//   12   21:return          
		val$permissionsCallSucceeded.set(true);
	//   13   22:aload_0         
	//   14   23:getfield        #24  <Field AtomicBoolean val$permissionsCallSucceeded>
	//   15   26:iconst_1        
	//   16   27:invokevirtual   #53  <Method void AtomicBoolean.set(boolean)>
		for(int i = 0; i < ((JSONArray) (graphresponse)).length(); i++)
	//*  17   30:iconst_0        
	//*  18   31:istore_2        
	//*  19   32:iload_2         
	//*  20   33:aload_1         
	//*  21   34:invokevirtual   #59  <Method int JSONArray.length()>
	//*  22   37:icmpge          184
		{
			Object obj = ((Object) (((JSONArray) (graphresponse)).optJSONObject(i)));
	//   23   40:aload_1         
	//   24   41:iload_2         
	//   25   42:invokevirtual   #63  <Method JSONObject JSONArray.optJSONObject(int)>
	//   26   45:astore          4
			if(obj == null)
	//*  27   47:aload           4
	//*  28   49:ifnonnull       55
				continue;
	//   29   52:goto            177
			String s = ((JSONObject) (obj)).optString("permission");
	//   30   55:aload           4
	//   31   57:ldc1            #65  <String "permission">
	//   32   59:invokevirtual   #69  <Method String JSONObject.optString(String)>
	//   33   62:astore_3        
			obj = ((Object) (((JSONObject) (obj)).optString("status")));
	//   34   63:aload           4
	//   35   65:ldc1            #71  <String "status">
	//   36   67:invokevirtual   #69  <Method String JSONObject.optString(String)>
	//   37   70:astore          4
			if(Utility.isNullOrEmpty(s) || Utility.isNullOrEmpty(((String) (obj))))
				continue;
	//   38   72:aload_3         
	//   39   73:invokestatic    #77  <Method boolean Utility.isNullOrEmpty(String)>
	//   40   76:ifne            177
	//   41   79:aload           4
	//   42   81:invokestatic    #77  <Method boolean Utility.isNullOrEmpty(String)>
	//   43   84:ifne            177
			obj = ((Object) (((String) (obj)).toLowerCase(Locale.US)));
	//   44   87:aload           4
	//   45   89:getstatic       #83  <Field Locale Locale.US>
	//   46   92:invokevirtual   #89  <Method String String.toLowerCase(Locale)>
	//   47   95:astore          4
			if(((String) (obj)).equals("granted"))
	//*  48   97:aload           4
	//*  49   99:ldc1            #91  <String "granted">
	//*  50  101:invokevirtual   #95  <Method boolean String.equals(Object)>
	//*  51  104:ifeq            121
			{
				val$permissions.add(((Object) (s)));
	//   52  107:aload_0         
	//   53  108:getfield        #26  <Field Set val$permissions>
	//   54  111:aload_3         
	//   55  112:invokeinterface #100 <Method boolean Set.add(Object)>
	//   56  117:pop             
				continue;
	//   57  118:goto            177
			}
			if(((String) (obj)).equals("declined"))
	//*  58  121:aload           4
	//*  59  123:ldc1            #102 <String "declined">
	//*  60  125:invokevirtual   #95  <Method boolean String.equals(Object)>
	//*  61  128:ifeq            145
			{
				val$declinedPermissions.add(((Object) (s)));
	//   62  131:aload_0         
	//   63  132:getfield        #28  <Field Set val$declinedPermissions>
	//   64  135:aload_3         
	//   65  136:invokeinterface #100 <Method boolean Set.add(Object)>
	//   66  141:pop             
			} else
	//*  67  142:goto            177
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   68  145:new             #104 <Class StringBuilder>
	//   69  148:dup             
	//   70  149:invokespecial   #105 <Method void StringBuilder()>
	//   71  152:astore_3        
				stringbuilder.append("Unexpected status: ");
	//   72  153:aload_3         
	//   73  154:ldc1            #107 <String "Unexpected status: ">
	//   74  156:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   75  159:pop             
				stringbuilder.append(((String) (obj)));
	//   76  160:aload_3         
	//   77  161:aload           4
	//   78  163:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   79  166:pop             
				Log.w("AccessTokenManager", stringbuilder.toString());
	//   80  167:ldc1            #113 <String "AccessTokenManager">
	//   81  169:aload_3         
	//   82  170:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   83  173:invokestatic    #123 <Method int Log.w(String, String)>
	//   84  176:pop             
			}
		}

	//   85  177:iload_2         
	//   86  178:iconst_1        
	//   87  179:iadd            
	//   88  180:istore_2        
	//*  89  181:goto            32
	//   90  184:return          
	}

	final AccessTokenManager this$0;
	final Set val$declinedPermissions;
	final Set val$permissions;
	final AtomicBoolean val$permissionsCallSucceeded;

	AccessTokenManager$2()
	{
		this$0 = final_accesstokenmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AccessTokenManager this$0>
		val$permissionsCallSucceeded = atomicboolean;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field AtomicBoolean val$permissionsCallSucceeded>
		val$permissions = set;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field Set val$permissions>
		val$declinedPermissions = Set.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field Set val$declinedPermissions>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
