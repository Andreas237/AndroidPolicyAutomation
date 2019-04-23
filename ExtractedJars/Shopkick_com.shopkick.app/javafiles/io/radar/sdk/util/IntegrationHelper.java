// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.util;

import java.lang.reflect.Method;

public final class IntegrationHelper
{

	public IntegrationHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	private final String getFacebookClientToken()
	{
label0:
		{
			Object obj;
			try
			{
				Object obj1 = ((Object) (Class.forName("com.facebook.FacebookSdk")));
	//    0    0:ldc1            #41  <String "com.facebook.FacebookSdk">
	//    1    2:invokestatic    #47  <Method Class Class.forName(String)>
	//    2    5:astore_2        
				obj = ((Object) (((Class) (obj1)).getMethod("getClientToken", new Class[0])));
	//    3    6:aload_2         
	//    4    7:ldc1            #49  <String "getClientToken">
	//    5    9:iconst_0        
	//    6   10:anewarray       Class[]
	//    7   13:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//    8   16:astore_1        
				Object obj2 = ((Object) (((Class) (obj1)).getMethod("getApplicationId", new Class[0])));
	//    9   17:aload_2         
	//   10   18:ldc1            #55  <String "getApplicationId">
	//   11   20:iconst_0        
	//   12   21:anewarray       Class[]
	//   13   24:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//   14   27:astore_3        
				obj = ((Method) (obj)).invoke(obj1, new Object[0]);
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:iconst_0        
	//   18   31:anewarray       Object[]
	//   19   34:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   20   37:astore_1        
				obj1 = ((Method) (obj2)).invoke(obj1, new Object[0]);
	//   21   38:aload_3         
	//   22   39:aload_2         
	//   23   40:iconst_0        
	//   24   41:anewarray       Object[]
	//   25   44:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   26   47:astore_2        
				if(!(obj instanceof String) || !(obj1 instanceof String))
					break label0;
	//   27   48:aload_1         
	//   28   49:instanceof      #63  <Class String>
	//   29   52:ifeq            96
	//   30   55:aload_2         
	//   31   56:instanceof      #63  <Class String>
	//   32   59:ifeq            96
				obj2 = ((Object) (new StringBuilder()));
	//   33   62:new             #65  <Class StringBuilder>
	//   34   65:dup             
	//   35   66:invokespecial   #66  <Method void StringBuilder()>
	//   36   69:astore_3        
				((StringBuilder) (obj2)).append(obj1);
	//   37   70:aload_3         
	//   38   71:aload_2         
	//   39   72:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   40   75:pop             
				((StringBuilder) (obj2)).append('|');
	//   41   76:aload_3         
	//   42   77:bipush          124
	//   43   79:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   44   82:pop             
				((StringBuilder) (obj2)).append(obj);
	//   45   83:aload_3         
	//   46   84:aload_1         
	//   47   85:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   48   88:pop             
				obj = ((Object) (((StringBuilder) (obj2)).toString()));
	//   49   89:aload_3         
	//   50   90:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   51   93:astore_1        
			}
	//*  52   94:aload_1         
	//*  53   95:areturn         
	//*  54   96:aconst_null     
	//*  55   97:areturn         
			catch(Exception exception)
	//*  56   98:astore_1        
			{
				return null;
	//   57   99:aconst_null     
	//   58  100:areturn         
			}
			return ((String) (obj));
		}
		return null;
	}

	public final String getFacebookAccessToken()
	{
		Object obj;
		try
		{
			obj = ((Object) (Class.forName("com.facebook.AccessToken")));
	//    0    0:ldc1            #79  <String "com.facebook.AccessToken">
	//    1    2:invokestatic    #47  <Method Class Class.forName(String)>
	//    2    5:astore_1        
			Object obj1 = ((Class) (obj)).getMethod("getCurrentAccessToken", new Class[0]).invoke(obj, new Object[0]);
	//    3    6:aload_1         
	//    4    7:ldc1            #81  <String "getCurrentAccessToken">
	//    5    9:iconst_0        
	//    6   10:anewarray       Class[]
	//    7   13:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:anewarray       Object[]
	//   11   21:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   12   24:astore_2        
			obj = ((Class) (obj)).getMethod("getToken", new Class[0]).invoke(obj1, new Object[0]);
	//   13   25:aload_1         
	//   14   26:ldc1            #83  <String "getToken">
	//   15   28:iconst_0        
	//   16   29:anewarray       Class[]
	//   17   32:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//   18   35:aload_2         
	//   19   36:iconst_0        
	//   20   37:anewarray       Object[]
	//   21   40:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   22   43:astore_1        
		}
	//*  23   44:aload_1         
	//*  24   45:ifnull          62
	//*  25   48:aload_1         
	//*  26   49:instanceof      #63  <Class String>
	//*  27   52:ifeq            62
	//*  28   55:aload_1         
	//*  29   56:checkcast       #63  <Class String>
	//*  30   59:astore_1        
	//*  31   60:aload_1         
	//*  32   61:areturn         
	//*  33   62:aload_0         
	//*  34   63:invokespecial   #85  <Method String getFacebookClientToken()>
	//*  35   66:areturn         
	//*  36   67:aload_0         
	//*  37   68:invokespecial   #85  <Method String getFacebookClientToken()>
	//*  38   71:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return getFacebookClientToken();
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_62;
		if(!(obj instanceof String))
			break MISSING_BLOCK_LABEL_62;
		obj = ((Object) ((String)obj));
		return ((String) (obj));
		Exception exception;
		return getFacebookClientToken();
	//*  39   72:astore_1        
	//*  40   73:goto            67
	}

	public final String getUrbanAirshipChannelId()
	{
label0:
		{
			Object obj;
			try
			{
				obj = ((Object) (Class.forName("com.urbanairship.UAirship")));
	//    0    0:ldc1            #88  <String "com.urbanairship.UAirship">
	//    1    2:invokestatic    #47  <Method Class Class.forName(String)>
	//    2    5:astore_1        
				Object obj1 = ((Class) (obj)).getMethod("shared", new Class[0]).invoke(obj, new Object[0]);
	//    3    6:aload_1         
	//    4    7:ldc1            #90  <String "shared">
	//    5    9:iconst_0        
	//    6   10:anewarray       Class[]
	//    7   13:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:anewarray       Object[]
	//   11   21:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   12   24:astore_2        
				obj = ((Class) (obj)).getMethod("getPushManager", new Class[0]).invoke(obj1, new Object[0]);
	//   13   25:aload_1         
	//   14   26:ldc1            #92  <String "getPushManager">
	//   15   28:iconst_0        
	//   16   29:anewarray       Class[]
	//   17   32:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//   18   35:aload_2         
	//   19   36:iconst_0        
	//   20   37:anewarray       Object[]
	//   21   40:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   22   43:astore_1        
				obj = Class.forName("com.urbanairship.push.PushManager").getMethod("getChannelId", new Class[0]).invoke(obj, new Object[0]);
	//   23   44:ldc1            #94  <String "com.urbanairship.push.PushManager">
	//   24   46:invokestatic    #47  <Method Class Class.forName(String)>
	//   25   49:ldc1            #96  <String "getChannelId">
	//   26   51:iconst_0        
	//   27   52:anewarray       Class[]
	//   28   55:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//   29   58:aload_1         
	//   30   59:iconst_0        
	//   31   60:anewarray       Object[]
	//   32   63:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   33   66:astore_1        
				if(!(obj instanceof String))
					break label0;
	//   34   67:aload_1         
	//   35   68:instanceof      #63  <Class String>
	//   36   71:ifeq            81
				obj = ((Object) ((String)obj));
	//   37   74:aload_1         
	//   38   75:checkcast       #63  <Class String>
	//   39   78:astore_1        
			}
	//*  40   79:aload_1         
	//*  41   80:areturn         
	//*  42   81:aconst_null     
	//*  43   82:areturn         
			catch(Exception exception)
	//*  44   83:astore_1        
			{
				return null;
	//   45   84:aconst_null     
	//   46   85:areturn         
			}
			return ((String) (obj));
		}
		return null;
	}

	public final String getUrbanAirshipNamedUserId()
	{
		Object obj;
		try
		{
			Class class1 = Class.forName("com.urbanairship.UAirship");
	//    0    0:ldc1            #88  <String "com.urbanairship.UAirship">
	//    1    2:invokestatic    #47  <Method Class Class.forName(String)>
	//    2    5:astore_2        
			obj = class1.getMethod("shared", new Class[0]).invoke(((Object) (class1)), new Object[0]);
	//    3    6:aload_2         
	//    4    7:ldc1            #90  <String "shared">
	//    5    9:iconst_0        
	//    6   10:anewarray       Class[]
	//    7   13:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//    8   16:aload_2         
	//    9   17:iconst_0        
	//   10   18:anewarray       Object[]
	//   11   21:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   12   24:astore_1        
			Method method = class1.getMethod("getNamedUser", new Class[0]);
	//   13   25:aload_2         
	//   14   26:ldc1            #98  <String "getNamedUser">
	//   15   28:iconst_0        
	//   16   29:anewarray       Class[]
	//   17   32:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//   18   35:astore_3        
			class1 = Class.forName("com.urbanairship.push.NamedUser");
	//   19   36:ldc1            #100 <String "com.urbanairship.push.NamedUser">
	//   20   38:invokestatic    #47  <Method Class Class.forName(String)>
	//   21   41:astore_2        
			obj = method.invoke(obj, new Object[0]);
	//   22   42:aload_3         
	//   23   43:aload_1         
	//   24   44:iconst_0        
	//   25   45:anewarray       Object[]
	//   26   48:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   27   51:astore_1        
			obj = class1.getMethod("getId", new Class[0]).invoke(obj, new Object[0]);
	//   28   52:aload_2         
	//   29   53:ldc1            #102 <String "getId">
	//   30   55:iconst_0        
	//   31   56:anewarray       Class[]
	//   32   59:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//   33   62:aload_1         
	//   34   63:iconst_0        
	//   35   64:anewarray       Object[]
	//   36   67:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   37   70:astore_1        
		}
	//*  38   71:aload_1         
	//*  39   72:ifnull          89
	//*  40   75:aload_1         
	//*  41   76:instanceof      #63  <Class String>
	//*  42   79:ifeq            89
	//*  43   82:aload_1         
	//*  44   83:checkcast       #63  <Class String>
	//*  45   86:astore_1        
	//*  46   87:aload_1         
	//*  47   88:areturn         
	//*  48   89:aconst_null     
	//*  49   90:areturn         
		catch(Exception exception)
	//*  50   91:astore_1        
		{
			return null;
	//   51   92:aconst_null     
	//   52   93:areturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_89;
		if(!(obj instanceof String))
			break MISSING_BLOCK_LABEL_89;
		obj = ((Object) ((String)obj));
		return ((String) (obj));
		return null;
	}

	public final String getUrbanAirshipSessionId()
	{
		Object obj;
		try
		{
			Class class1 = Class.forName("com.urbanairship.UAirship");
	//    0    0:ldc1            #88  <String "com.urbanairship.UAirship">
	//    1    2:invokestatic    #47  <Method Class Class.forName(String)>
	//    2    5:astore_2        
			obj = class1.getMethod("shared", new Class[0]).invoke(((Object) (class1)), new Object[0]);
	//    3    6:aload_2         
	//    4    7:ldc1            #90  <String "shared">
	//    5    9:iconst_0        
	//    6   10:anewarray       Class[]
	//    7   13:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//    8   16:aload_2         
	//    9   17:iconst_0        
	//   10   18:anewarray       Object[]
	//   11   21:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   12   24:astore_1        
			Method method = class1.getMethod("getAnalytics", new Class[0]);
	//   13   25:aload_2         
	//   14   26:ldc1            #104 <String "getAnalytics">
	//   15   28:iconst_0        
	//   16   29:anewarray       Class[]
	//   17   32:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//   18   35:astore_3        
			class1 = Class.forName("com.urbanairship.analytics.Analytics");
	//   19   36:ldc1            #106 <String "com.urbanairship.analytics.Analytics">
	//   20   38:invokestatic    #47  <Method Class Class.forName(String)>
	//   21   41:astore_2        
			obj = method.invoke(obj, new Object[0]);
	//   22   42:aload_3         
	//   23   43:aload_1         
	//   24   44:iconst_0        
	//   25   45:anewarray       Object[]
	//   26   48:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   27   51:astore_1        
			obj = class1.getMethod("getSessionId", new Class[0]).invoke(obj, new Object[0]);
	//   28   52:aload_2         
	//   29   53:ldc1            #108 <String "getSessionId">
	//   30   55:iconst_0        
	//   31   56:anewarray       Class[]
	//   32   59:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//   33   62:aload_1         
	//   34   63:iconst_0        
	//   35   64:anewarray       Object[]
	//   36   67:invokevirtual   #61  <Method Object Method.invoke(Object, Object[])>
	//   37   70:astore_1        
		}
	//*  38   71:aload_1         
	//*  39   72:ifnull          89
	//*  40   75:aload_1         
	//*  41   76:instanceof      #63  <Class String>
	//*  42   79:ifeq            89
	//*  43   82:aload_1         
	//*  44   83:checkcast       #63  <Class String>
	//*  45   86:astore_1        
	//*  46   87:aload_1         
	//*  47   88:areturn         
	//*  48   89:aconst_null     
	//*  49   90:areturn         
		catch(Exception exception)
	//*  50   91:astore_1        
		{
			return null;
	//   51   92:aconst_null     
	//   52   93:areturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_89;
		if(!(obj instanceof String))
			break MISSING_BLOCK_LABEL_89;
		obj = ((Object) ((String)obj));
		return ((String) (obj));
		return null;
	}
}
