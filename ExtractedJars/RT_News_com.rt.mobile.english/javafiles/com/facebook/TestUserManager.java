// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.Utility;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook:
//			FacebookException, GraphRequest, HttpMethod, GraphResponse, 
//			AccessToken, AccessTokenSource

public class TestUserManager
{
	private static final class Mode extends Enum
	{

		public static Mode valueOf(String s)
		{
			return (Mode)Enum.valueOf(com/facebook/TestUserManager$Mode, s);
		//    0    0:ldc1            #2   <Class TestUserManager$Mode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class TestUserManager$Mode>
		//    4    9:areturn         
		}

		public static Mode[] values()
		{
			return (Mode[])((Mode []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field TestUserManager$Mode[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.TestUserManager$Mode_3B_.clone()>
		//    2    6:checkcast       #38  <Class TestUserManager$Mode[]>
		//    3    9:areturn         
		}

		private static final Mode $VALUES[];
		public static final Mode PRIVATE;
		public static final Mode SHARED;

		static 
		{
			PRIVATE = new Mode("PRIVATE", 0);
		//    0    0:new             #2   <Class TestUserManager$Mode>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "PRIVATE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void TestUserManager$Mode(String, int)>
		//    5   10:putstatic       #22  <Field TestUserManager$Mode PRIVATE>
			SHARED = new Mode("SHARED", 1);
		//    6   13:new             #2   <Class TestUserManager$Mode>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "SHARED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void TestUserManager$Mode(String, int)>
		//   11   23:putstatic       #25  <Field TestUserManager$Mode SHARED>
			$VALUES = (new Mode[] {
				PRIVATE, SHARED
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Mode[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field TestUserManager$Mode PRIVATE>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field TestUserManager$Mode SHARED>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field TestUserManager$Mode[] $VALUES>
		//*  23   45:return          
		}

		private Mode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public TestUserManager(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		if(!Utility.isNullOrEmpty(s1) && !Utility.isNullOrEmpty(s))
	//*   2    4:aload_2         
	//*   3    5:invokestatic    #32  <Method boolean Utility.isNullOrEmpty(String)>
	//*   4    8:ifne            32
	//*   5   11:aload_1         
	//*   6   12:invokestatic    #32  <Method boolean Utility.isNullOrEmpty(String)>
	//*   7   15:ifeq            21
	//*   8   18:goto            32
		{
			testApplicationSecret = s;
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:putfield        #34  <Field String testApplicationSecret>
			testApplicationId = s1;
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:putfield        #36  <Field String testApplicationId>
			return;
	//   15   31:return          
		} else
		{
			throw new FacebookException("Must provide app ID and secret");
	//   16   32:new             #38  <Class FacebookException>
	//   17   35:dup             
	//   18   36:ldc1            #40  <String "Must provide app ID and secret">
	//   19   38:invokespecial   #43  <Method void FacebookException(String)>
	//   20   41:athrow          
		}
	}

	private JSONObject createTestAccount(List list, Mode mode, String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #49  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void Bundle()>
	//    3    7:astore          4
		bundle.putString("installed", "true");
	//    4    9:aload           4
	//    5   11:ldc1            #52  <String "installed">
	//    6   13:ldc1            #54  <String "true">
	//    7   15:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		bundle.putString("permissions", getPermissionsString(list));
	//    8   18:aload           4
	//    9   20:ldc1            #59  <String "permissions">
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #63  <Method String getPermissionsString(List)>
	//   13   27:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		bundle.putString("access_token", getAppAccessToken());
	//   14   30:aload           4
	//   15   32:ldc1            #65  <String "access_token">
	//   16   34:aload_0         
	//   17   35:invokevirtual   #69  <Method String getAppAccessToken()>
	//   18   38:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		if(mode == Mode.SHARED)
	//*  19   41:aload_2         
	//*  20   42:getstatic       #73  <Field TestUserManager$Mode TestUserManager$Mode.SHARED>
	//*  21   45:if_acmpne       73
			bundle.putString("name", String.format("Shared %s Testuser", new Object[] {
				getSharedTestAccountIdentifier(list, s)
			}));
	//   22   48:aload           4
	//   23   50:ldc1            #75  <String "name">
	//   24   52:ldc1            #77  <String "Shared %s Testuser">
	//   25   54:iconst_1        
	//   26   55:anewarray       Object[]
	//   27   58:dup             
	//   28   59:iconst_0        
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:aload_3         
	//   32   63:invokespecial   #81  <Method String getSharedTestAccountIdentifier(List, String)>
	//   33   66:aastore         
	//   34   67:invokestatic    #87  <Method String String.format(String, Object[])>
	//   35   70:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		s = ((String) ((new GraphRequest(((AccessToken) (null)), String.format("%s/accounts/test-users", new Object[] {
			testApplicationId
		}), bundle, HttpMethod.POST)).executeAndWait()));
	//   36   73:new             #89  <Class GraphRequest>
	//   37   76:dup             
	//   38   77:aconst_null     
	//   39   78:ldc1            #91  <String "%s/accounts/test-users">
	//   40   80:iconst_1        
	//   41   81:anewarray       Object[]
	//   42   84:dup             
	//   43   85:iconst_0        
	//   44   86:aload_0         
	//   45   87:getfield        #36  <Field String testApplicationId>
	//   46   90:aastore         
	//   47   91:invokestatic    #87  <Method String String.format(String, Object[])>
	//   48   94:aload           4
	//   49   96:getstatic       #97  <Field HttpMethod HttpMethod.POST>
	//   50   99:invokespecial   #100 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   51  102:invokevirtual   #104 <Method GraphResponse GraphRequest.executeAndWait()>
	//   52  105:astore_3        
		list = ((List) (((GraphResponse) (s)).getError()));
	//   53  106:aload_3         
	//   54  107:invokevirtual   #110 <Method FacebookRequestError GraphResponse.getError()>
	//   55  110:astore_1        
		s = ((String) (((GraphResponse) (s)).getJSONObject()));
	//   56  111:aload_3         
	//   57  112:invokevirtual   #114 <Method JSONObject GraphResponse.getJSONObject()>
	//   58  115:astore_3        
		if(list != null)
	//*  59  116:aload_1         
	//*  60  117:ifnull          122
			return null;
	//   61  120:aconst_null     
	//   62  121:areturn         
		if(mode == Mode.SHARED)
	//*  63  122:aload_2         
	//*  64  123:getstatic       #73  <Field TestUserManager$Mode TestUserManager$Mode.SHARED>
	//*  65  126:if_acmpne       161
		{
			try
			{
				((JSONObject) (s)).put("name", ((Object) (bundle.getString("name"))));
	//   66  129:aload_3         
	//   67  130:ldc1            #75  <String "name">
	//   68  132:aload           4
	//   69  134:ldc1            #75  <String "name">
	//   70  136:invokevirtual   #118 <Method String Bundle.getString(String)>
	//   71  139:invokevirtual   #124 <Method JSONObject JSONObject.put(String, Object)>
	//   72  142:pop             
			}
	//*  73  143:goto            156
			// Misplaced declaration of an exception variable
			catch(List list)
	//*  74  146:astore_1        
			{
				Log.e("TestUserManager", "Could not set name", ((Throwable) (list)));
	//   75  147:ldc1            #14  <String "TestUserManager">
	//   76  149:ldc1            #126 <String "Could not set name">
	//   77  151:aload_1         
	//   78  152:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
	//   79  155:pop             
			}
			storeTestAccount(((JSONObject) (s)));
	//   80  156:aload_0         
	//   81  157:aload_3         
	//   82  158:invokespecial   #136 <Method void storeTestAccount(JSONObject)>
		}
		return ((JSONObject) (s));
	//   83  161:aload_3         
	//   84  162:areturn         
	}

	private JSONObject findOrCreateSharedTestAccount(List list, Mode mode, String s)
	{
		JSONObject jsonobject = findTestAccountMatchingIdentifier(getSharedTestAccountIdentifier(list, s));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_3         
	//    4    4:invokespecial   #81  <Method String getSharedTestAccountIdentifier(List, String)>
	//    5    7:invokespecial   #143 <Method JSONObject findTestAccountMatchingIdentifier(String)>
	//    6   10:astore          4
		if(jsonobject != null)
	//*   7   12:aload           4
	//*   8   14:ifnull          20
			return jsonobject;
	//    9   17:aload           4
	//   10   19:areturn         
		else
			return createTestAccount(list, mode, s);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:aload_2         
	//   14   23:aload_3         
	//   15   24:invokespecial   #145 <Method JSONObject createTestAccount(List, TestUserManager$Mode, String)>
	//   16   27:areturn         
	}

	private JSONObject findTestAccountMatchingIdentifier(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Iterator iterator = appTestAccounts.values().iterator();
	//    2    2:aload_0         
	//    3    3:getfield        #147 <Field Map appTestAccounts>
	//    4    6:invokeinterface #153 <Method Collection Map.values()>
	//    5   11:invokeinterface #159 <Method Iterator Collection.iterator()>
	//    6   16:astore_3        
		boolean flag;
		JSONObject jsonobject;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_58;
	//    7   17:aload_3         
	//    8   18:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            58
			jsonobject = (JSONObject)iterator.next();
	//   10   26:aload_3         
	//   11   27:invokeinterface #169 <Method Object Iterator.next()>
	//   12   32:checkcast       #120 <Class JSONObject>
	//   13   35:astore          4
			flag = jsonobject.optString("name").contains(((CharSequence) (s)));
	//   14   37:aload           4
	//   15   39:ldc1            #75  <String "name">
	//   16   41:invokevirtual   #172 <Method String JSONObject.optString(String)>
	//   17   44:aload_1         
	//   18   45:invokevirtual   #176 <Method boolean String.contains(CharSequence)>
	//   19   48:istore_2        
		} while(!flag);
	//   20   49:iload_2         
	//   21   50:ifeq            17
		this;
	//   22   53:aload_0         
		JVM INSTR monitorexit ;
	//   23   54:monitorexit     
		return jsonobject;
	//   24   55:aload           4
	//   25   57:areturn         
		this;
	//   26   58:aload_0         
		JVM INSTR monitorexit ;
	//   27   59:monitorexit     
		return null;
	//   28   60:aconst_null     
	//   29   61:areturn         
		s;
	//   30   62:astore_1        
	//*  31   63:aload_0         
		throw s;
	//   32   64:monitorexit     
	//   33   65:aload_1         
	//   34   66:athrow          
	}

	private AccessToken getAccessTokenForUser(List list, Mode mode, String s)
	{
		retrieveTestAccountsForAppIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method void retrieveTestAccountsForAppIfNeeded()>
		List list1 = list;
	//    2    4:aload_1         
	//    3    5:astore          4
		if(Utility.isNullOrEmpty(((Collection) (list))))
	//*   4    7:aload_1         
	//*   5    8:invokestatic    #184 <Method boolean Utility.isNullOrEmpty(Collection)>
	//*   6   11:ifeq            33
			list1 = Arrays.asList(((Object []) (new String[] {
				"email", "publish_actions"
			})));
	//    7   14:iconst_2        
	//    8   15:anewarray       String[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:ldc1            #186 <String "email">
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_1        
	//   15   25:ldc1            #188 <String "publish_actions">
	//   16   27:aastore         
	//   17   28:invokestatic    #194 <Method List Arrays.asList(Object[])>
	//   18   31:astore          4
		if(mode == Mode.PRIVATE)
	//*  19   33:aload_2         
	//*  20   34:getstatic       #197 <Field TestUserManager$Mode TestUserManager$Mode.PRIVATE>
	//*  21   37:if_acmpne       52
			list = ((List) (createTestAccount(list1, mode, s)));
	//   22   40:aload_0         
	//   23   41:aload           4
	//   24   43:aload_2         
	//   25   44:aload_3         
	//   26   45:invokespecial   #145 <Method JSONObject createTestAccount(List, TestUserManager$Mode, String)>
	//   27   48:astore_1        
		else
	//*  28   49:goto            61
			list = ((List) (findOrCreateSharedTestAccount(list1, mode, s)));
	//   29   52:aload_0         
	//   30   53:aload           4
	//   31   55:aload_2         
	//   32   56:aload_3         
	//   33   57:invokespecial   #199 <Method JSONObject findOrCreateSharedTestAccount(List, TestUserManager$Mode, String)>
	//   34   60:astore_1        
		return new AccessToken(((JSONObject) (list)).optString("access_token"), testApplicationId, ((JSONObject) (list)).optString("id"), ((Collection) (list1)), ((Collection) (null)), AccessTokenSource.TEST_USER, ((java.util.Date) (null)), ((java.util.Date) (null)));
	//   35   61:new             #201 <Class AccessToken>
	//   36   64:dup             
	//   37   65:aload_1         
	//   38   66:ldc1            #65  <String "access_token">
	//   39   68:invokevirtual   #172 <Method String JSONObject.optString(String)>
	//   40   71:aload_0         
	//   41   72:getfield        #36  <Field String testApplicationId>
	//   42   75:aload_1         
	//   43   76:ldc1            #203 <String "id">
	//   44   78:invokevirtual   #172 <Method String JSONObject.optString(String)>
	//   45   81:aload           4
	//   46   83:aconst_null     
	//   47   84:getstatic       #209 <Field AccessTokenSource AccessTokenSource.TEST_USER>
	//   48   87:aconst_null     
	//   49   88:aconst_null     
	//   50   89:invokespecial   #212 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, java.util.Date, java.util.Date)>
	//   51   92:areturn         
	}

	private String getPermissionsString(List list)
	{
		return TextUtils.join(",", ((Iterable) (list)));
	//    0    0:ldc1            #215 <String ",">
	//    1    2:aload_1         
	//    2    3:invokestatic    #221 <Method String TextUtils.join(CharSequence, Iterable)>
	//    3    6:areturn         
	}

	private String getSharedTestAccountIdentifier(List list, String s)
	{
		long l1 = getPermissionsString(list).hashCode();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method String getPermissionsString(List)>
	//    3    5:invokevirtual   #226 <Method int String.hashCode()>
	//    4    8:i2l             
	//    5    9:lstore          5
		long l;
		if(s != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          28
			l = (long)s.hashCode() & 0xffffffffL;
	//    8   15:aload_2         
	//    9   16:invokevirtual   #226 <Method int String.hashCode()>
	//   10   19:i2l             
	//   11   20:ldc2w           #227 <Long 0xffffffffL>
	//   12   23:land            
	//   13   24:lstore_3        
		else
	//*  14   25:goto            30
			l = 0L;
	//   15   28:lconst_0        
	//   16   29:lstore_3        
		return validNameStringFromInteger(l1 & 0xffffffffL ^ l);
	//   17   30:aload_0         
	//   18   31:lload           5
	//   19   33:ldc2w           #227 <Long 0xffffffffL>
	//   20   36:land            
	//   21   37:lload_3         
	//   22   38:lxor            
	//   23   39:invokespecial   #232 <Method String validNameStringFromInteger(long)>
	//   24   42:areturn         
	}

	private void populateTestAccounts(JSONArray jsonarray, JSONObject jsonobject)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
_L2:
		JSONObject jsonobject1;
		JSONObject jsonobject2;
		if(i >= jsonarray.length())
			break; /* Loop/switch isn't completed */
	//    4    4:iload_3         
	//    5    5:aload_1         
	//    6    6:invokevirtual   #240 <Method int JSONArray.length()>
	//    7    9:icmpge          75
		jsonobject1 = jsonarray.optJSONObject(i);
	//    8   12:aload_1         
	//    9   13:iload_3         
	//   10   14:invokevirtual   #244 <Method JSONObject JSONArray.optJSONObject(int)>
	//   11   17:astore          4
		jsonobject2 = jsonobject.optJSONObject(jsonobject1.optString("id"));
	//   12   19:aload_2         
	//   13   20:aload           4
	//   14   22:ldc1            #203 <String "id">
	//   15   24:invokevirtual   #172 <Method String JSONObject.optString(String)>
	//   16   27:invokevirtual   #246 <Method JSONObject JSONObject.optJSONObject(String)>
	//   17   30:astore          5
		jsonobject1.put("name", ((Object) (jsonobject2.optString("name"))));
	//   18   32:aload           4
	//   19   34:ldc1            #75  <String "name">
	//   20   36:aload           5
	//   21   38:ldc1            #75  <String "name">
	//   22   40:invokevirtual   #172 <Method String JSONObject.optString(String)>
	//   23   43:invokevirtual   #124 <Method JSONObject JSONObject.put(String, Object)>
	//   24   46:pop             
		break MISSING_BLOCK_LABEL_62;
	//   25   47:goto            62
		JSONException jsonexception;
		jsonexception;
	//   26   50:astore          5
		Log.e("TestUserManager", "Could not set name", ((Throwable) (jsonexception)));
	//   27   52:ldc1            #14  <String "TestUserManager">
	//   28   54:ldc1            #126 <String "Could not set name">
	//   29   56:aload           5
	//   30   58:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
	//   31   61:pop             
		storeTestAccount(jsonobject1);
	//   32   62:aload_0         
	//   33   63:aload           4
	//   34   65:invokespecial   #136 <Method void storeTestAccount(JSONObject)>
		i++;
	//   35   68:iload_3         
	//   36   69:iconst_1        
	//   37   70:iadd            
	//   38   71:istore_3        
		if(true) goto _L2; else goto _L1
	//   39   72:goto            4
	//*  40   75:aload_0         
_L1:
		return;
	//   41   76:monitorexit     
	//   42   77:return          
		jsonarray;
	//   43   78:astore_1        
	//*  44   79:aload_0         
		throw jsonarray;
	//   45   80:monitorexit     
	//   46   81:aload_1         
	//   47   82:athrow          
	}

	private void retrieveTestAccountsForAppIfNeeded()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj = ((Object) (appTestAccounts));
	//    2    2:aload_0         
	//    3    3:getfield        #147 <Field Map appTestAccounts>
	//    4    6:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:aload_1         
	//    6    8:ifnull          14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		appTestAccounts = ((Map) (new HashMap()));
	//   10   14:aload_0         
	//   11   15:new             #248 <Class HashMap>
	//   12   18:dup             
	//   13   19:invokespecial   #249 <Method void HashMap()>
	//   14   22:putfield        #147 <Field Map appTestAccounts>
		GraphRequest.setDefaultBatchApplicationId(testApplicationId);
	//   15   25:aload_0         
	//   16   26:getfield        #36  <Field String testApplicationId>
	//   17   29:invokestatic    #252 <Method void GraphRequest.setDefaultBatchApplicationId(String)>
		obj = ((Object) (new Bundle()));
	//   18   32:new             #49  <Class Bundle>
	//   19   35:dup             
	//   20   36:invokespecial   #50  <Method void Bundle()>
	//   21   39:astore_1        
		((Bundle) (obj)).putString("access_token", getAppAccessToken());
	//   22   40:aload_1         
	//   23   41:ldc1            #65  <String "access_token">
	//   24   43:aload_0         
	//   25   44:invokevirtual   #69  <Method String getAppAccessToken()>
	//   26   47:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		obj = ((Object) (new GraphRequest(((AccessToken) (null)), "app/accounts/test-users", ((Bundle) (obj)), ((HttpMethod) (null)))));
	//   27   50:new             #89  <Class GraphRequest>
	//   28   53:dup             
	//   29   54:aconst_null     
	//   30   55:ldc1            #254 <String "app/accounts/test-users">
	//   31   57:aload_1         
	//   32   58:aconst_null     
	//   33   59:invokespecial   #100 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   34   62:astore_1        
		((GraphRequest) (obj)).setBatchEntryName("testUsers");
	//   35   63:aload_1         
	//   36   64:ldc2            #256 <String "testUsers">
	//   37   67:invokevirtual   #259 <Method void GraphRequest.setBatchEntryName(String)>
		((GraphRequest) (obj)).setBatchEntryOmitResultOnSuccess(false);
	//   38   70:aload_1         
	//   39   71:iconst_0        
	//   40   72:invokevirtual   #263 <Method void GraphRequest.setBatchEntryOmitResultOnSuccess(boolean)>
		Object obj1 = ((Object) (new Bundle()));
	//   41   75:new             #49  <Class Bundle>
	//   42   78:dup             
	//   43   79:invokespecial   #50  <Method void Bundle()>
	//   44   82:astore_2        
		((Bundle) (obj1)).putString("access_token", getAppAccessToken());
	//   45   83:aload_2         
	//   46   84:ldc1            #65  <String "access_token">
	//   47   86:aload_0         
	//   48   87:invokevirtual   #69  <Method String getAppAccessToken()>
	//   49   90:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		((Bundle) (obj1)).putString("ids", "{result=testUsers:$.data.*.id}");
	//   50   93:aload_2         
	//   51   94:ldc2            #265 <String "ids">
	//   52   97:ldc2            #267 <String "{result=testUsers:$.data.*.id}">
	//   53  100:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		((Bundle) (obj1)).putString("fields", "name");
	//   54  103:aload_2         
	//   55  104:ldc2            #269 <String "fields">
	//   56  107:ldc1            #75  <String "name">
	//   57  109:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		obj1 = ((Object) (new GraphRequest(((AccessToken) (null)), "", ((Bundle) (obj1)), ((HttpMethod) (null)))));
	//   58  112:new             #89  <Class GraphRequest>
	//   59  115:dup             
	//   60  116:aconst_null     
	//   61  117:ldc2            #271 <String "">
	//   62  120:aload_2         
	//   63  121:aconst_null     
	//   64  122:invokespecial   #100 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   65  125:astore_2        
		((GraphRequest) (obj1)).setBatchEntryDependsOn("testUsers");
	//   66  126:aload_2         
	//   67  127:ldc2            #256 <String "testUsers">
	//   68  130:invokevirtual   #274 <Method void GraphRequest.setBatchEntryDependsOn(String)>
		obj = ((Object) (GraphRequest.executeBatchAndWait(new GraphRequest[] {
			obj, obj1
		})));
	//   69  133:iconst_2        
	//   70  134:anewarray       GraphRequest[]
	//   71  137:dup             
	//   72  138:iconst_0        
	//   73  139:aload_1         
	//   74  140:aastore         
	//   75  141:dup             
	//   76  142:iconst_1        
	//   77  143:aload_2         
	//   78  144:aastore         
	//   79  145:invokestatic    #278 <Method List GraphRequest.executeBatchAndWait(GraphRequest[])>
	//   80  148:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_205;
	//   81  149:aload_1         
	//   82  150:ifnull          205
		if(((List) (obj)).size() != 2)
	//*  83  153:aload_1         
	//*  84  154:invokeinterface #283 <Method int List.size()>
	//*  85  159:iconst_2        
	//*  86  160:icmpeq          166
			break MISSING_BLOCK_LABEL_205;
	//   87  163:goto            205
		populateTestAccounts(((GraphResponse)((List) (obj)).get(0)).getJSONObject().optJSONArray("data"), ((GraphResponse)((List) (obj)).get(1)).getJSONObject());
	//   88  166:aload_0         
	//   89  167:aload_1         
	//   90  168:iconst_0        
	//   91  169:invokeinterface #287 <Method Object List.get(int)>
	//   92  174:checkcast       #106 <Class GraphResponse>
	//   93  177:invokevirtual   #114 <Method JSONObject GraphResponse.getJSONObject()>
	//   94  180:ldc2            #289 <String "data">
	//   95  183:invokevirtual   #293 <Method JSONArray JSONObject.optJSONArray(String)>
	//   96  186:aload_1         
	//   97  187:iconst_1        
	//   98  188:invokeinterface #287 <Method Object List.get(int)>
	//   99  193:checkcast       #106 <Class GraphResponse>
	//  100  196:invokevirtual   #114 <Method JSONObject GraphResponse.getJSONObject()>
	//  101  199:invokespecial   #295 <Method void populateTestAccounts(JSONArray, JSONObject)>
		this;
	//  102  202:aload_0         
		JVM INSTR monitorexit ;
	//  103  203:monitorexit     
		return;
	//  104  204:return          
		throw new FacebookException("Unexpected number of results from TestUsers batch query");
	//  105  205:new             #38  <Class FacebookException>
	//  106  208:dup             
	//  107  209:ldc2            #297 <String "Unexpected number of results from TestUsers batch query">
	//  108  212:invokespecial   #43  <Method void FacebookException(String)>
	//  109  215:athrow          
		Exception exception;
		exception;
	//  110  216:astore_1        
		this;
	//  111  217:aload_0         
		JVM INSTR monitorexit ;
	//  112  218:monitorexit     
		throw exception;
	//  113  219:aload_1         
	//  114  220:athrow          
	}

	private void storeTestAccount(JSONObject jsonobject)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		appTestAccounts.put(((Object) (jsonobject.optString("id"))), ((Object) (jsonobject)));
	//    2    2:aload_0         
	//    3    3:getfield        #147 <Field Map appTestAccounts>
	//    4    6:aload_1         
	//    5    7:ldc1            #203 <String "id">
	//    6    9:invokevirtual   #172 <Method String JSONObject.optString(String)>
	//    7   12:aload_1         
	//    8   13:invokeinterface #300 <Method Object Map.put(Object, Object)>
	//    9   18:pop             
		this;
	//   10   19:aload_0         
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		jsonobject;
	//   13   22:astore_1        
	//*  14   23:aload_0         
		throw jsonobject;
	//   15   24:monitorexit     
	//   16   25:aload_1         
	//   17   26:athrow          
	}

	private String validNameStringFromInteger(long l)
	{
		String s = Long.toString(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #305 <Method String Long.toString(long)>
	//    2    4:astore          8
		StringBuilder stringbuilder = new StringBuilder("Perm");
	//    3    6:new             #307 <Class StringBuilder>
	//    4    9:dup             
	//    5   10:ldc2            #309 <String "Perm">
	//    6   13:invokespecial   #310 <Method void StringBuilder(String)>
	//    7   16:astore          7
		char ac[] = s.toCharArray();
	//    8   18:aload           8
	//    9   20:invokevirtual   #314 <Method char[] String.toCharArray()>
	//   10   23:astore          8
		int i = 0;
	//   11   25:iconst_0        
	//   12   26:istore          4
		int j = ac.length;
	//   13   28:aload           8
	//   14   30:arraylength     
	//   15   31:istore          6
		char c = '\0';
	//   16   33:iconst_0        
	//   17   34:istore_3        
		for(; i < j; i++)
	//*  18   35:iload           4
	//*  19   37:iload           6
	//*  20   39:icmpge          91
		{
			char c1 = ac[i];
	//   21   42:aload           8
	//   22   44:iload           4
	//   23   46:caload          
	//   24   47:istore          5
			if(c1 == c)
	//*  25   49:iload           5
	//*  26   51:iload_3         
	//*  27   52:icmpne          65
				c = (char)(c1 + 10);
	//   28   55:iload           5
	//   29   57:bipush          10
	//   30   59:iadd            
	//   31   60:int2char        
	//   32   61:istore_3        
			else
	//*  33   62:goto            68
				c = c1;
	//   34   65:iload           5
	//   35   67:istore_3        
			stringbuilder.append((char)((c + 97) - 48));
	//   36   68:aload           7
	//   37   70:iload_3         
	//   38   71:bipush          97
	//   39   73:iadd            
	//   40   74:bipush          48
	//   41   76:isub            
	//   42   77:int2char        
	//   43   78:invokevirtual   #318 <Method StringBuilder StringBuilder.append(char)>
	//   44   81:pop             
		}

	//   45   82:iload           4
	//   46   84:iconst_1        
	//   47   85:iadd            
	//   48   86:istore          4
	//*  49   88:goto            35
		return stringbuilder.toString();
	//   50   91:aload           7
	//   51   93:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   52   96:areturn         
	}

	public AccessToken getAccessTokenForPrivateUser(List list)
	{
		return getAccessTokenForUser(list, Mode.PRIVATE, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #197 <Field TestUserManager$Mode TestUserManager$Mode.PRIVATE>
	//    3    5:aconst_null     
	//    4    6:invokespecial   #324 <Method AccessToken getAccessTokenForUser(List, TestUserManager$Mode, String)>
	//    5    9:areturn         
	}

	public AccessToken getAccessTokenForSharedUser(List list)
	{
		return getAccessTokenForSharedUser(list, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #329 <Method AccessToken getAccessTokenForSharedUser(List, String)>
	//    4    6:areturn         
	}

	public AccessToken getAccessTokenForSharedUser(List list, String s)
	{
		return getAccessTokenForUser(list, Mode.SHARED, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #73  <Field TestUserManager$Mode TestUserManager$Mode.SHARED>
	//    3    5:aload_2         
	//    4    6:invokespecial   #324 <Method AccessToken getAccessTokenForUser(List, TestUserManager$Mode, String)>
	//    5    9:areturn         
	}

	final String getAppAccessToken()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #307 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #331 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(testApplicationId);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field String testApplicationId>
	//    7   13:invokevirtual   #334 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("|");
	//    9   17:aload_1         
	//   10   18:ldc2            #336 <String "|">
	//   11   21:invokevirtual   #334 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(testApplicationSecret);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #34  <Field String testApplicationSecret>
	//   16   30:invokevirtual   #334 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	public String getTestApplicationId()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s = testApplicationId;
	//    2    2:aload_0         
	//    3    3:getfield        #36  <Field String testApplicationId>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return s;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public String getTestApplicationSecret()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s = testApplicationSecret;
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field String testApplicationSecret>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return s;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	static final boolean $assertionsDisabled = false;
	private static final String LOG_TAG = "TestUserManager";
	private Map appTestAccounts;
	private String testApplicationId;
	private String testApplicationSecret;

	static 
	{
	//    0    0:return          
	}
}
