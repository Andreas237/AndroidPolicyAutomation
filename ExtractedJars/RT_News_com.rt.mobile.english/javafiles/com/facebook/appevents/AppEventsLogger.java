// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import bolts.AppLinks;
import com.facebook.*;
import com.facebook.internal.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.*;
import org.json.*;

// Referenced classes of package com.facebook.appevents:
//			FacebookTimeSpentData

public class AppEventsLogger
{
	private static class AccessTokenAppIdPair
		implements Serializable
	{

		private Object writeReplace()
		{
			return ((Object) (new SerializationProxyV1(accessTokenString, applicationId)));
		//    0    0:new             #11  <Class AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #47  <Field String accessTokenString>
		//    4    8:aload_0         
		//    5    9:getfield        #49  <Field String applicationId>
		//    6   12:aconst_null     
		//    7   13:invokespecial   #54  <Method void AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1(String, String, AppEventsLogger$1)>
		//    8   16:areturn         
		}

		public boolean equals(Object obj)
		{
			boolean flag = obj instanceof AccessTokenAppIdPair;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class AppEventsLogger$AccessTokenAppIdPair>
		//    2    4:istore_2        
			boolean flag1 = false;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			if(!flag)
		//*   5    7:iload_2         
		//*   6    8:ifne            13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			obj = ((Object) ((AccessTokenAppIdPair)obj));
		//    9   13:aload_1         
		//   10   14:checkcast       #2   <Class AppEventsLogger$AccessTokenAppIdPair>
		//   11   17:astore_1        
			flag = flag1;
		//   12   18:iload_3         
		//   13   19:istore_2        
			if(Utility.areObjectsEqual(((Object) (((AccessTokenAppIdPair) (obj)).accessTokenString)), ((Object) (accessTokenString))))
		//*  14   20:aload_1         
		//*  15   21:getfield        #47  <Field String accessTokenString>
		//*  16   24:aload_0         
		//*  17   25:getfield        #47  <Field String accessTokenString>
		//*  18   28:invokestatic    #60  <Method boolean Utility.areObjectsEqual(Object, Object)>
		//*  19   31:ifeq            52
			{
				flag = flag1;
		//   20   34:iload_3         
		//   21   35:istore_2        
				if(Utility.areObjectsEqual(((Object) (((AccessTokenAppIdPair) (obj)).applicationId)), ((Object) (applicationId))))
		//*  22   36:aload_1         
		//*  23   37:getfield        #49  <Field String applicationId>
		//*  24   40:aload_0         
		//*  25   41:getfield        #49  <Field String applicationId>
		//*  26   44:invokestatic    #60  <Method boolean Utility.areObjectsEqual(Object, Object)>
		//*  27   47:ifeq            52
					flag = true;
		//   28   50:iconst_1        
		//   29   51:istore_2        
			}
			return flag;
		//   30   52:iload_2         
		//   31   53:ireturn         
		}

		String getAccessTokenString()
		{
			return accessTokenString;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field String accessTokenString>
		//    2    4:areturn         
		}

		String getApplicationId()
		{
			return applicationId;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field String applicationId>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			String s = accessTokenString;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field String accessTokenString>
		//    2    4:astore_3        
			int j = 0;
		//    3    5:iconst_0        
		//    4    6:istore_2        
			int i;
			if(s == null)
		//*   5    7:aload_3         
		//*   6    8:ifnonnull       16
				i = 0;
		//    7   11:iconst_0        
		//    8   12:istore_1        
			else
		//*   9   13:goto            24
				i = accessTokenString.hashCode();
		//   10   16:aload_0         
		//   11   17:getfield        #47  <Field String accessTokenString>
		//   12   20:invokevirtual   #67  <Method int String.hashCode()>
		//   13   23:istore_1        
			if(applicationId != null)
		//*  14   24:aload_0         
		//*  15   25:getfield        #49  <Field String applicationId>
		//*  16   28:ifnonnull       34
		//*  17   31:goto            42
				j = applicationId.hashCode();
		//   18   34:aload_0         
		//   19   35:getfield        #49  <Field String applicationId>
		//   20   38:invokevirtual   #67  <Method int String.hashCode()>
		//   21   41:istore_2        
			return i ^ j;
		//   22   42:iload_1         
		//   23   43:iload_2         
		//   24   44:ixor            
		//   25   45:ireturn         
		}

		private static final long serialVersionUID = 1L;
		private final String accessTokenString;
		private final String applicationId;

		AccessTokenAppIdPair(AccessToken accesstoken)
		{
			this(accesstoken.getToken(), FacebookSdk.getApplicationId());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #27  <Method String AccessToken.getToken()>
		//    3    5:invokestatic    #32  <Method String FacebookSdk.getApplicationId()>
		//    4    8:invokespecial   #35  <Method void AppEventsLogger$AccessTokenAppIdPair(String, String)>
		//    5   11:return          
		}

		AccessTokenAppIdPair(String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
			String s2 = s;
		//    2    4:aload_1         
		//    3    5:astore_3        
			if(Utility.isNullOrEmpty(s))
		//*   4    6:aload_1         
		//*   5    7:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
		//*   6   10:ifeq            15
				s2 = null;
		//    7   13:aconst_null     
		//    8   14:astore_3        
			accessTokenString = s2;
		//    9   15:aload_0         
		//   10   16:aload_3         
		//   11   17:putfield        #47  <Field String accessTokenString>
			applicationId = s1;
		//   12   20:aload_0         
		//   13   21:aload_2         
		//   14   22:putfield        #49  <Field String applicationId>
		//   15   25:return          
		}
	}

	private static class AccessTokenAppIdPair.SerializationProxyV1
		implements Serializable
	{

		private Object readResolve()
		{
			return ((Object) (new AccessTokenAppIdPair(accessTokenString, appId)));
		//    0    0:new             #8   <Class AppEventsLogger$AccessTokenAppIdPair>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field String accessTokenString>
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field String appId>
		//    6   12:invokespecial   #35  <Method void AppEventsLogger$AccessTokenAppIdPair(String, String)>
		//    7   15:areturn         
		}

		private static final long serialVersionUID = 0x317ab613L;
		private final String accessTokenString;
		private final String appId;

		private AccessTokenAppIdPair.SerializationProxyV1(String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			accessTokenString = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field String accessTokenString>
			appId = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field String appId>
		//    8   14:return          
		}

	}

	static class AppEvent
		implements Serializable
	{

		private void validateIdentifier(String s)
			throws FacebookException
		{
			if(s != null && s.length() != 0 && s.length() <= 40)
		//*   0    0:aload_1         
		//*   1    1:ifnull          101
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #165 <Method int String.length()>
		//*   4    8:ifeq            101
		//*   5   11:aload_1         
		//*   6   12:invokevirtual   #165 <Method int String.length()>
		//*   7   15:bipush          40
		//*   8   17:icmple          23
		//*   9   20:goto            101
			{
				boolean flag;
				synchronized(validatedIdentifiers)
		//*  10   23:getstatic       #34  <Field HashSet validatedIdentifiers>
		//*  11   26:astore_3        
		//*  12   27:aload_3         
		//*  13   28:monitorenter    
				{
					flag = validatedIdentifiers.contains(((Object) (s)));
		//   14   29:getstatic       #34  <Field HashSet validatedIdentifiers>
		//   15   32:aload_1         
		//   16   33:invokevirtual   #169 <Method boolean HashSet.contains(Object)>
		//   17   36:istore_2        
				}
		//   18   37:aload_3         
		//   19   38:monitorexit     
				if(!flag)
		//*  20   39:iload_2         
		//*  21   40:ifne            95
				{
					if(s.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$"))
		//*  22   43:aload_1         
		//*  23   44:ldc1            #171 <String "^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$">
		//*  24   46:invokevirtual   #175 <Method boolean String.matches(String)>
		//*  25   49:ifeq            74
					{
						synchronized(validatedIdentifiers)
		//*  26   52:getstatic       #34  <Field HashSet validatedIdentifiers>
		//*  27   55:astore_3        
		//*  28   56:aload_3         
		//*  29   57:monitorenter    
						{
							validatedIdentifiers.add(((Object) (s)));
		//   30   58:getstatic       #34  <Field HashSet validatedIdentifiers>
		//   31   61:aload_1         
		//   32   62:invokevirtual   #178 <Method boolean HashSet.add(Object)>
		//   33   65:pop             
						}
		//   34   66:aload_3         
		//   35   67:monitorexit     
						return;
		//   36   68:return          
					} else
		//*  37   69:astore_1        
		//*  38   70:aload_3         
		//*  39   71:monitorexit     
		//*  40   72:aload_1         
		//*  41   73:athrow          
					{
						throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[] {
							s
						}));
		//   42   74:new             #40  <Class FacebookException>
		//   43   77:dup             
		//   44   78:ldc1            #180 <String "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.">
		//   45   80:iconst_1        
		//   46   81:anewarray       Object[]
		//   47   84:dup             
		//   48   85:iconst_0        
		//   49   86:aload_1         
		//   50   87:aastore         
		//   51   88:invokestatic    #126 <Method String String.format(String, Object[])>
		//   52   91:invokespecial   #128 <Method void FacebookException(String)>
		//   53   94:athrow          
					}
				} else
				{
					return;
		//   54   95:return          
				}
			}
			break MISSING_BLOCK_LABEL_101;
			s;
			hashset;
			JVM INSTR monitorexit ;
			throw s;
			s;
		//   55   96:astore_1        
			hashset;
		//   56   97:aload_3         
			JVM INSTR monitorexit ;
		//   57   98:monitorexit     
			throw s;
		//   58   99:aload_1         
		//   59  100:athrow          
			String s1 = s;
		//   60  101:aload_1         
		//   61  102:astore_3        
			if(s == null)
		//*  62  103:aload_1         
		//*  63  104:ifnonnull       110
				s1 = "<None Provided>";
		//   64  107:ldc1            #182 <String "<None Provided>">
		//   65  109:astore_3        
			throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] {
				s1, Integer.valueOf(40)
			}));
		//   66  110:new             #40  <Class FacebookException>
		//   67  113:dup             
		//   68  114:getstatic       #188 <Field Locale Locale.ROOT>
		//   69  117:ldc1            #190 <String "Identifier '%s' must be less than %d characters">
		//   70  119:iconst_2        
		//   71  120:anewarray       Object[]
		//   72  123:dup             
		//   73  124:iconst_0        
		//   74  125:aload_3         
		//   75  126:aastore         
		//   76  127:dup             
		//   77  128:iconst_1        
		//   78  129:bipush          40
		//   79  131:invokestatic    #196 <Method Integer Integer.valueOf(int)>
		//   80  134:aastore         
		//   81  135:invokestatic    #199 <Method String String.format(Locale, String, Object[])>
		//   82  138:invokespecial   #128 <Method void FacebookException(String)>
		//   83  141:athrow          
		}

		private Object writeReplace()
		{
			return ((Object) (new SerializationProxyV1(jsonObject.toString(), isImplicit)));
		//    0    0:new             #11  <Class AppEventsLogger$AppEvent$SerializationProxyV1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #54  <Field JSONObject jsonObject>
		//    4    8:invokevirtual   #143 <Method String JSONObject.toString()>
		//    5   11:aload_0         
		//    6   12:getfield        #49  <Field boolean isImplicit>
		//    7   15:aconst_null     
		//    8   16:invokespecial   #202 <Method void AppEventsLogger$AppEvent$SerializationProxyV1(String, boolean, AppEventsLogger$1)>
		//    9   19:areturn         
		}

		public boolean getIsImplicit()
		{
			return isImplicit;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field boolean isImplicit>
		//    2    4:ireturn         
		}

		public JSONObject getJSONObject()
		{
			return jsonObject;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field JSONObject jsonObject>
		//    2    4:areturn         
		}

		public String getName()
		{
			return name;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field String name>
		//    2    4:areturn         
		}

		public String toString()
		{
			return String.format("\"%s\", implicit: %b, json: %s", new Object[] {
				jsonObject.optString("_eventName"), Boolean.valueOf(isImplicit), jsonObject.toString()
			});
		//    0    0:ldc1            #208 <String "\"%s\", implicit: %b, json: %s">
		//    1    2:iconst_3        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:getfield        #54  <Field JSONObject jsonObject>
		//    7   12:ldc1            #56  <String "_eventName">
		//    8   14:invokevirtual   #212 <Method String JSONObject.optString(String)>
		//    9   17:aastore         
		//   10   18:dup             
		//   11   19:iconst_1        
		//   12   20:aload_0         
		//   13   21:getfield        #49  <Field boolean isImplicit>
		//   14   24:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
		//   15   27:aastore         
		//   16   28:dup             
		//   17   29:iconst_2        
		//   18   30:aload_0         
		//   19   31:getfield        #54  <Field JSONObject jsonObject>
		//   20   34:invokevirtual   #143 <Method String JSONObject.toString()>
		//   21   37:aastore         
		//   22   38:invokestatic    #126 <Method String String.format(String, Object[])>
		//   23   41:areturn         
		}

		private static final long serialVersionUID = 1L;
		private static final HashSet validatedIdentifiers = new HashSet();
		private boolean isImplicit;
		private JSONObject jsonObject;
		private String name;

		static 
		{
		//    0    0:new             #29  <Class HashSet>
		//    1    3:dup             
		//    2    4:invokespecial   #32  <Method void HashSet()>
		//    3    7:putstatic       #34  <Field HashSet validatedIdentifiers>
		//*   4   10:return          
		}

		public AppEvent(String s, String s1, Double double1, Bundle bundle, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void Object()>
			validateIdentifier(s1);
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:invokespecial   #45  <Method void validateIdentifier(String)>
			name = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #47  <Field String name>
			isImplicit = flag;
		//    8   14:aload_0         
		//    9   15:iload           5
		//   10   17:putfield        #49  <Field boolean isImplicit>
			jsonObject = new JSONObject();
		//   11   20:aload_0         
		//   12   21:new             #51  <Class JSONObject>
		//   13   24:dup             
		//   14   25:invokespecial   #52  <Method void JSONObject()>
		//   15   28:putfield        #54  <Field JSONObject jsonObject>
			jsonObject.put("_eventName", ((Object) (s1)));
		//   16   31:aload_0         
		//   17   32:getfield        #54  <Field JSONObject jsonObject>
		//   18   35:ldc1            #56  <String "_eventName">
		//   19   37:aload_2         
		//   20   38:invokevirtual   #60  <Method JSONObject JSONObject.put(String, Object)>
		//   21   41:pop             
			jsonObject.put("_logTime", System.currentTimeMillis() / 1000L);
		//   22   42:aload_0         
		//   23   43:getfield        #54  <Field JSONObject jsonObject>
		//   24   46:ldc1            #62  <String "_logTime">
		//   25   48:invokestatic    #68  <Method long System.currentTimeMillis()>
		//   26   51:ldc2w           #69  <Long 1000L>
		//   27   54:ldiv            
		//   28   55:invokevirtual   #73  <Method JSONObject JSONObject.put(String, long)>
		//   29   58:pop             
			jsonObject.put("_ui", ((Object) (s)));
		//   30   59:aload_0         
		//   31   60:getfield        #54  <Field JSONObject jsonObject>
		//   32   63:ldc1            #75  <String "_ui">
		//   33   65:aload_1         
		//   34   66:invokevirtual   #60  <Method JSONObject JSONObject.put(String, Object)>
		//   35   69:pop             
			if(double1 == null)
				break MISSING_BLOCK_LABEL_88;
		//   36   70:aload_3         
		//   37   71:ifnull          88
			jsonObject.put("_valueToSum", double1.doubleValue());
		//   38   74:aload_0         
		//   39   75:getfield        #54  <Field JSONObject jsonObject>
		//   40   78:ldc1            #77  <String "_valueToSum">
		//   41   80:aload_3         
		//   42   81:invokevirtual   #83  <Method double Double.doubleValue()>
		//   43   84:invokevirtual   #86  <Method JSONObject JSONObject.put(String, double)>
		//   44   87:pop             
			if(isImplicit)
		//*  45   88:aload_0         
		//*  46   89:getfield        #49  <Field boolean isImplicit>
		//*  47   92:ifeq            107
				jsonObject.put("_implicitlyLogged", "1");
		//   48   95:aload_0         
		//   49   96:getfield        #54  <Field JSONObject jsonObject>
		//   50   99:ldc1            #88  <String "_implicitlyLogged">
		//   51  101:ldc1            #90  <String "1">
		//   52  103:invokevirtual   #60  <Method JSONObject JSONObject.put(String, Object)>
		//   53  106:pop             
			if(bundle == null)
				break MISSING_BLOCK_LABEL_209;
		//   54  107:aload           4
		//   55  109:ifnull          209
			for(s = ((String) (bundle.keySet().iterator())); ((Iterator) (s)).hasNext(); jsonObject.put(s1, ((Object) (((Object) (double1)).toString()))))
		//*  56  112:aload           4
		//*  57  114:invokevirtual   #96  <Method Set Bundle.keySet()>
		//*  58  117:invokeinterface #102 <Method Iterator Set.iterator()>
		//*  59  122:astore_1        
		//*  60  123:aload_1         
		//*  61  124:invokeinterface #108 <Method boolean Iterator.hasNext()>
		//*  62  129:ifeq            209
			{
				s1 = (String)((Iterator) (s)).next();
		//   63  132:aload_1         
		//   64  133:invokeinterface #112 <Method Object Iterator.next()>
		//   65  138:checkcast       #114 <Class String>
		//   66  141:astore_2        
				validateIdentifier(s1);
		//   67  142:aload_0         
		//   68  143:aload_2         
		//   69  144:invokespecial   #45  <Method void validateIdentifier(String)>
				double1 = ((Double) (bundle.get(s1)));
		//   70  147:aload           4
		//   71  149:aload_2         
		//   72  150:invokevirtual   #118 <Method Object Bundle.get(String)>
		//   73  153:astore_3        
				if(!(double1 instanceof String) && !(double1 instanceof Number))
		//*  74  154:aload_3         
		//*  75  155:instanceof      #114 <Class String>
		//*  76  158:ifne            193
		//*  77  161:aload_3         
		//*  78  162:instanceof      #120 <Class Number>
		//*  79  165:ifne            193
					throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] {
						double1, s1
					}));
		//   80  168:new             #40  <Class FacebookException>
		//   81  171:dup             
		//   82  172:ldc1            #122 <String "Parameter value '%s' for key '%s' should be a string or a numeric type.">
		//   83  174:iconst_2        
		//   84  175:anewarray       Object[]
		//   85  178:dup             
		//   86  179:iconst_0        
		//   87  180:aload_3         
		//   88  181:aastore         
		//   89  182:dup             
		//   90  183:iconst_1        
		//   91  184:aload_2         
		//   92  185:aastore         
		//   93  186:invokestatic    #126 <Method String String.format(String, Object[])>
		//   94  189:invokespecial   #128 <Method void FacebookException(String)>
		//   95  192:athrow          
			}

		//   96  193:aload_0         
		//   97  194:getfield        #54  <Field JSONObject jsonObject>
		//   98  197:aload_2         
		//   99  198:aload_3         
		//  100  199:invokevirtual   #132 <Method String Object.toString()>
		//  101  202:invokevirtual   #60  <Method JSONObject JSONObject.put(String, Object)>
		//  102  205:pop             
		//* 103  206:goto            123
			try
			{
				if(!isImplicit)
		//* 104  209:aload_0         
		//* 105  210:getfield        #49  <Field boolean isImplicit>
		//* 106  213:ifne            296
				{
					Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", new Object[] {
						jsonObject.toString()
					});
		//  107  216:getstatic       #138 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
		//  108  219:ldc1            #140 <String "AppEvents">
		//  109  221:ldc1            #142 <String "Created app event '%s'">
		//  110  223:iconst_1        
		//  111  224:anewarray       Object[]
		//  112  227:dup             
		//  113  228:iconst_0        
		//  114  229:aload_0         
		//  115  230:getfield        #54  <Field JSONObject jsonObject>
		//  116  233:invokevirtual   #143 <Method String JSONObject.toString()>
		//  117  236:aastore         
		//  118  237:invokestatic    #149 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
					return;
		//  119  240:return          
				}
			}
		//* 120  241:astore_1        
		//* 121  242:getstatic       #138 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
		//* 122  245:ldc1            #140 <String "AppEvents">
		//* 123  247:ldc1            #151 <String "Invalid app event name or parameter:">
		//* 124  249:iconst_1        
		//* 125  250:anewarray       Object[]
		//* 126  253:dup             
		//* 127  254:iconst_0        
		//* 128  255:aload_1         
		//* 129  256:invokevirtual   #152 <Method String FacebookException.toString()>
		//* 130  259:aastore         
		//* 131  260:invokestatic    #149 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		//* 132  263:aload_0         
		//* 133  264:aconst_null     
		//* 134  265:putfield        #54  <Field JSONObject jsonObject>
		//* 135  268:return          
			// Misplaced declaration of an exception variable
			catch(String s)
		//* 136  269:astore_1        
			{
				Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] {
					((JSONException) (s)).toString()
				});
		//  137  270:getstatic       #138 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
		//  138  273:ldc1            #140 <String "AppEvents">
		//  139  275:ldc1            #154 <String "JSON encoding for app event failed: '%s'">
		//  140  277:iconst_1        
		//  141  278:anewarray       Object[]
		//  142  281:dup             
		//  143  282:iconst_0        
		//  144  283:aload_1         
		//  145  284:invokevirtual   #155 <Method String JSONException.toString()>
		//  146  287:aastore         
		//  147  288:invokestatic    #149 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
				jsonObject = null;
		//  148  291:aload_0         
		//  149  292:aconst_null     
		//  150  293:putfield        #54  <Field JSONObject jsonObject>
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event name or parameter:", new Object[] {
					((FacebookException) (s)).toString()
				});
				jsonObject = null;
				return;
			}
			return;
		//  151  296:return          
		}

		private AppEvent(String s, boolean flag)
			throws JSONException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void Object()>
			jsonObject = new JSONObject(s);
		//    2    4:aload_0         
		//    3    5:new             #51  <Class JSONObject>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #157 <Method void JSONObject(String)>
		//    7   13:putfield        #54  <Field JSONObject jsonObject>
			isImplicit = flag;
		//    8   16:aload_0         
		//    9   17:iload_2         
		//   10   18:putfield        #49  <Field boolean isImplicit>
		//   11   21:return          
		}

	}

	private static class AppEvent.SerializationProxyV1
		implements Serializable
	{

		private Object readResolve()
			throws JSONException
		{
			return ((Object) (new AppEvent(jsonString, isImplicit)));
		//    0    0:new             #8   <Class AppEventsLogger$AppEvent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #27  <Field String jsonString>
		//    4    8:aload_0         
		//    5    9:getfield        #29  <Field boolean isImplicit>
		//    6   12:aconst_null     
		//    7   13:invokespecial   #39  <Method void AppEventsLogger$AppEvent(String, boolean, AppEventsLogger$1)>
		//    8   16:areturn         
		}

		private static final long serialVersionUID = 0x317ab613L;
		private final boolean isImplicit;
		private final String jsonString;

		private AppEvent.SerializationProxyV1(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			jsonString = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field String jsonString>
			isImplicit = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #29  <Field boolean isImplicit>
		//    8   14:return          
		}

	}

	public static final class FlushBehavior extends Enum
	{

		public static FlushBehavior valueOf(String s)
		{
			return (FlushBehavior)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushBehavior, s);
		//    0    0:ldc1            #2   <Class AppEventsLogger$FlushBehavior>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppEventsLogger$FlushBehavior>
		//    4    9:areturn         
		}

		public static FlushBehavior[] values()
		{
			return (FlushBehavior[])((FlushBehavior []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field AppEventsLogger$FlushBehavior[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$FlushBehavior_3B_.clone()>
		//    2    6:checkcast       #38  <Class AppEventsLogger$FlushBehavior[]>
		//    3    9:areturn         
		}

		private static final FlushBehavior $VALUES[];
		public static final FlushBehavior AUTO;
		public static final FlushBehavior EXPLICIT_ONLY;

		static 
		{
			AUTO = new FlushBehavior("AUTO", 0);
		//    0    0:new             #2   <Class AppEventsLogger$FlushBehavior>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "AUTO">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void AppEventsLogger$FlushBehavior(String, int)>
		//    5   10:putstatic       #22  <Field AppEventsLogger$FlushBehavior AUTO>
			EXPLICIT_ONLY = new FlushBehavior("EXPLICIT_ONLY", 1);
		//    6   13:new             #2   <Class AppEventsLogger$FlushBehavior>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "EXPLICIT_ONLY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void AppEventsLogger$FlushBehavior(String, int)>
		//   11   23:putstatic       #25  <Field AppEventsLogger$FlushBehavior EXPLICIT_ONLY>
			$VALUES = (new FlushBehavior[] {
				AUTO, EXPLICIT_ONLY
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       FlushBehavior[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field AppEventsLogger$FlushBehavior AUTO>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field AppEventsLogger$FlushBehavior EXPLICIT_ONLY>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field AppEventsLogger$FlushBehavior[] $VALUES>
		//*  23   45:return          
		}

		private FlushBehavior(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static final class FlushReason extends Enum
	{

		public static FlushReason valueOf(String s)
		{
			return (FlushReason)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushReason, s);
		//    0    0:ldc1            #2   <Class AppEventsLogger$FlushReason>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppEventsLogger$FlushReason>
		//    4    9:areturn         
		}

		public static FlushReason[] values()
		{
			return (FlushReason[])((FlushReason []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field AppEventsLogger$FlushReason[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$FlushReason_3B_.clone()>
		//    2    6:checkcast       #54  <Class AppEventsLogger$FlushReason[]>
		//    3    9:areturn         
		}

		private static final FlushReason $VALUES[];
		public static final FlushReason EAGER_FLUSHING_EVENT;
		public static final FlushReason EVENT_THRESHOLD;
		public static final FlushReason EXPLICIT;
		public static final FlushReason PERSISTED_EVENTS;
		public static final FlushReason SESSION_CHANGE;
		public static final FlushReason TIMER;

		static 
		{
			EXPLICIT = new FlushReason("EXPLICIT", 0);
		//    0    0:new             #2   <Class AppEventsLogger$FlushReason>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "EXPLICIT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
		//    5   10:putstatic       #26  <Field AppEventsLogger$FlushReason EXPLICIT>
			TIMER = new FlushReason("TIMER", 1);
		//    6   13:new             #2   <Class AppEventsLogger$FlushReason>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "TIMER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
		//   11   23:putstatic       #29  <Field AppEventsLogger$FlushReason TIMER>
			SESSION_CHANGE = new FlushReason("SESSION_CHANGE", 2);
		//   12   26:new             #2   <Class AppEventsLogger$FlushReason>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "SESSION_CHANGE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
		//   17   36:putstatic       #32  <Field AppEventsLogger$FlushReason SESSION_CHANGE>
			PERSISTED_EVENTS = new FlushReason("PERSISTED_EVENTS", 3);
		//   18   39:new             #2   <Class AppEventsLogger$FlushReason>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "PERSISTED_EVENTS">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
		//   23   49:putstatic       #35  <Field AppEventsLogger$FlushReason PERSISTED_EVENTS>
			EVENT_THRESHOLD = new FlushReason("EVENT_THRESHOLD", 4);
		//   24   52:new             #2   <Class AppEventsLogger$FlushReason>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "EVENT_THRESHOLD">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
		//   29   62:putstatic       #38  <Field AppEventsLogger$FlushReason EVENT_THRESHOLD>
			EAGER_FLUSHING_EVENT = new FlushReason("EAGER_FLUSHING_EVENT", 5);
		//   30   65:new             #2   <Class AppEventsLogger$FlushReason>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "EAGER_FLUSHING_EVENT">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
		//   35   75:putstatic       #41  <Field AppEventsLogger$FlushReason EAGER_FLUSHING_EVENT>
			$VALUES = (new FlushReason[] {
				EXPLICIT, TIMER, SESSION_CHANGE, PERSISTED_EVENTS, EVENT_THRESHOLD, EAGER_FLUSHING_EVENT
			});
		//   36   78:bipush          6
		//   37   80:anewarray       FlushReason[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field AppEventsLogger$FlushReason EXPLICIT>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field AppEventsLogger$FlushReason TIMER>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field AppEventsLogger$FlushReason SESSION_CHANGE>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field AppEventsLogger$FlushReason PERSISTED_EVENTS>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field AppEventsLogger$FlushReason EVENT_THRESHOLD>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field AppEventsLogger$FlushReason EAGER_FLUSHING_EVENT>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field AppEventsLogger$FlushReason[] $VALUES>
		//*  63  122:return          
		}

		private FlushReason(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static final class FlushResult extends Enum
	{

		public static FlushResult valueOf(String s)
		{
			return (FlushResult)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushResult, s);
		//    0    0:ldc1            #2   <Class AppEventsLogger$FlushResult>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppEventsLogger$FlushResult>
		//    4    9:areturn         
		}

		public static FlushResult[] values()
		{
			return (FlushResult[])((FlushResult []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field AppEventsLogger$FlushResult[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$FlushResult_3B_.clone()>
		//    2    6:checkcast       #46  <Class AppEventsLogger$FlushResult[]>
		//    3    9:areturn         
		}

		private static final FlushResult $VALUES[];
		public static final FlushResult NO_CONNECTIVITY;
		public static final FlushResult SERVER_ERROR;
		public static final FlushResult SUCCESS;
		public static final FlushResult UNKNOWN_ERROR;

		static 
		{
			SUCCESS = new FlushResult("SUCCESS", 0);
		//    0    0:new             #2   <Class AppEventsLogger$FlushResult>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "SUCCESS">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void AppEventsLogger$FlushResult(String, int)>
		//    5   10:putstatic       #24  <Field AppEventsLogger$FlushResult SUCCESS>
			SERVER_ERROR = new FlushResult("SERVER_ERROR", 1);
		//    6   13:new             #2   <Class AppEventsLogger$FlushResult>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "SERVER_ERROR">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void AppEventsLogger$FlushResult(String, int)>
		//   11   23:putstatic       #27  <Field AppEventsLogger$FlushResult SERVER_ERROR>
			NO_CONNECTIVITY = new FlushResult("NO_CONNECTIVITY", 2);
		//   12   26:new             #2   <Class AppEventsLogger$FlushResult>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "NO_CONNECTIVITY">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void AppEventsLogger$FlushResult(String, int)>
		//   17   36:putstatic       #30  <Field AppEventsLogger$FlushResult NO_CONNECTIVITY>
			UNKNOWN_ERROR = new FlushResult("UNKNOWN_ERROR", 3);
		//   18   39:new             #2   <Class AppEventsLogger$FlushResult>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "UNKNOWN_ERROR">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void AppEventsLogger$FlushResult(String, int)>
		//   23   49:putstatic       #33  <Field AppEventsLogger$FlushResult UNKNOWN_ERROR>
			$VALUES = (new FlushResult[] {
				SUCCESS, SERVER_ERROR, NO_CONNECTIVITY, UNKNOWN_ERROR
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       FlushResult[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field AppEventsLogger$FlushResult SUCCESS>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field AppEventsLogger$FlushResult SERVER_ERROR>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field AppEventsLogger$FlushResult NO_CONNECTIVITY>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field AppEventsLogger$FlushResult UNKNOWN_ERROR>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field AppEventsLogger$FlushResult[] $VALUES>
		//*  43   83:return          
		}

		private FlushResult(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static class FlushStatistics
	{

		public int numEvents;
		public FlushResult result;

		private FlushStatistics()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			numEvents = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #17  <Field int numEvents>
			result = FlushResult.SUCCESS;
		//    5    9:aload_0         
		//    6   10:getstatic       #22  <Field AppEventsLogger$FlushResult AppEventsLogger$FlushResult.SUCCESS>
		//    7   13:putfield        #24  <Field AppEventsLogger$FlushResult result>
		//    8   16:return          
		}

	}

	static class PersistedAppSessionInfo
	{

		private static FacebookTimeSpentData getTimeSpentData(Context context, AccessTokenAppIdPair accesstokenappidpair)
		{
			restoreAppSessionInformation(context);
		//    0    0:aload_0         
		//    1    1:invokestatic    #41  <Method void restoreAppSessionInformation(Context)>
			FacebookTimeSpentData facebooktimespentdata = (FacebookTimeSpentData)appSessionInfoMap.get(((Object) (accesstokenappidpair)));
		//    2    4:getstatic       #43  <Field Map appSessionInfoMap>
		//    3    7:aload_1         
		//    4    8:invokeinterface #49  <Method Object Map.get(Object)>
		//    5   13:checkcast       #51  <Class FacebookTimeSpentData>
		//    6   16:astore_2        
			context = ((Context) (facebooktimespentdata));
		//    7   17:aload_2         
		//    8   18:astore_0        
			if(facebooktimespentdata == null)
		//*   9   19:aload_2         
		//*  10   20:ifnonnull       42
			{
				context = ((Context) (new FacebookTimeSpentData()));
		//   11   23:new             #51  <Class FacebookTimeSpentData>
		//   12   26:dup             
		//   13   27:invokespecial   #52  <Method void FacebookTimeSpentData()>
		//   14   30:astore_0        
				appSessionInfoMap.put(((Object) (accesstokenappidpair)), ((Object) (context)));
		//   15   31:getstatic       #43  <Field Map appSessionInfoMap>
		//   16   34:aload_1         
		//   17   35:aload_0         
		//   18   36:invokeinterface #56  <Method Object Map.put(Object, Object)>
		//   19   41:pop             
			}
			return ((FacebookTimeSpentData) (context));
		//   20   42:aload_0         
		//   21   43:areturn         
		}

		static void onResume(Context context, AccessTokenAppIdPair accesstokenappidpair, AppEventsLogger appeventslogger, long l, String s)
		{
			synchronized(staticLock)
		//*   0    0:getstatic       #31  <Field Object staticLock>
		//*   1    3:astore          6
		//*   2    5:aload           6
		//*   3    7:monitorenter    
			{
				getTimeSpentData(context, accesstokenappidpair).onResume(appeventslogger, l, s);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokestatic    #60  <Method FacebookTimeSpentData getTimeSpentData(Context, AppEventsLogger$AccessTokenAppIdPair)>
		//    7   13:aload_2         
		//    8   14:lload_3         
		//    9   15:aload           5
		//   10   17:invokevirtual   #63  <Method void FacebookTimeSpentData.onResume(AppEventsLogger, long, String)>
				onTimeSpentDataUpdate();
		//   11   20:invokestatic    #66  <Method void onTimeSpentDataUpdate()>
			}
		//   12   23:aload           6
		//   13   25:monitorexit     
			return;
		//   14   26:return          
			context;
		//   15   27:astore_0        
			obj;
		//   16   28:aload           6
			JVM INSTR monitorexit ;
		//   17   30:monitorexit     
			throw context;
		//   18   31:aload_0         
		//   19   32:athrow          
		}

		static void onSuspend(Context context, AccessTokenAppIdPair accesstokenappidpair, AppEventsLogger appeventslogger, long l)
		{
			synchronized(staticLock)
		//*   0    0:getstatic       #31  <Field Object staticLock>
		//*   1    3:astore          5
		//*   2    5:aload           5
		//*   3    7:monitorenter    
			{
				getTimeSpentData(context, accesstokenappidpair).onSuspend(appeventslogger, l);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokestatic    #60  <Method FacebookTimeSpentData getTimeSpentData(Context, AppEventsLogger$AccessTokenAppIdPair)>
		//    7   13:aload_2         
		//    8   14:lload_3         
		//    9   15:invokevirtual   #71  <Method void FacebookTimeSpentData.onSuspend(AppEventsLogger, long)>
				onTimeSpentDataUpdate();
		//   10   18:invokestatic    #66  <Method void onTimeSpentDataUpdate()>
			}
		//   11   21:aload           5
		//   12   23:monitorexit     
			return;
		//   13   24:return          
			context;
		//   14   25:astore_0        
			obj;
		//   15   26:aload           5
			JVM INSTR monitorexit ;
		//   16   28:monitorexit     
			throw context;
		//   17   29:aload_0         
		//   18   30:athrow          
		}

		private static void onTimeSpentDataUpdate()
		{
			if(!hasChanges)
		//*   0    0:getstatic       #73  <Field boolean hasChanges>
		//*   1    3:ifne            26
			{
				hasChanges = true;
		//    2    6:iconst_1        
		//    3    7:putstatic       #73  <Field boolean hasChanges>
				AppEventsLogger.backgroundExecutor.schedule(appSessionInfoFlushRunnable, 30L, TimeUnit.SECONDS);
		//    4   10:invokestatic    #77  <Method ScheduledThreadPoolExecutor AppEventsLogger.access$1400()>
		//    5   13:getstatic       #34  <Field Runnable appSessionInfoFlushRunnable>
		//    6   16:ldc2w           #78  <Long 30L>
		//    7   19:getstatic       #85  <Field TimeUnit TimeUnit.SECONDS>
		//    8   22:invokevirtual   #91  <Method java.util.concurrent.ScheduledFuture ScheduledThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
		//    9   25:pop             
			}
		//   10   26:return          
		}

		private static void restoreAppSessionInformation(Context context)
		{
			Object obj2 = staticLock;
		//    0    0:getstatic       #31  <Field Object staticLock>
		//    1    3:astore          5
			obj2;
		//    2    5:aload           5
			JVM INSTR monitorenter ;
		//    3    7:monitorenter    
			boolean flag = isLoaded;
		//    4    8:getstatic       #97  <Field boolean isLoaded>
		//    5   11:istore_1        
			if(flag) goto _L2; else goto _L1
		//    6   12:iload_1         
		//    7   13:ifne            266
_L1:
			Object obj1 = ((Object) (new ObjectInputStream(((java.io.InputStream) (context.openFileInput("AppEventsLogger.persistedsessioninfo"))))));
		//    8   16:new             #99  <Class ObjectInputStream>
		//    9   19:dup             
		//   10   20:aload_0         
		//   11   21:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
		//   12   23:invokevirtual   #105 <Method java.io.FileInputStream Context.openFileInput(String)>
		//   13   26:invokespecial   #108 <Method void ObjectInputStream(java.io.InputStream)>
		//   14   29:astore_3        
			Object obj = obj1;
		//   15   30:aload_3         
		//   16   31:astore_2        
			appSessionInfoMap = ((Map) ((HashMap)((ObjectInputStream) (obj1)).readObject()));
		//   17   32:aload_3         
		//   18   33:invokevirtual   #112 <Method Object ObjectInputStream.readObject()>
		//   19   36:checkcast       #114 <Class HashMap>
		//   20   39:putstatic       #43  <Field Map appSessionInfoMap>
			obj = obj1;
		//   21   42:aload_3         
		//   22   43:astore_2        
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "App session info loaded");
		//   23   44:getstatic       #120 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
		//   24   47:ldc1            #122 <String "AppEvents">
		//   25   49:ldc1            #124 <String "App session info loaded">
		//   26   51:invokestatic    #130 <Method void Logger.log(LoggingBehavior, String, String)>
			Utility.closeQuietly(((java.io.Closeable) (obj1)));
		//   27   54:aload_3         
		//   28   55:invokestatic    #136 <Method void Utility.closeQuietly(java.io.Closeable)>
			context.deleteFile("AppEventsLogger.persistedsessioninfo");
		//   29   58:aload_0         
		//   30   59:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
		//   31   61:invokevirtual   #140 <Method boolean Context.deleteFile(String)>
		//   32   64:pop             
			if(appSessionInfoMap == null)
		//*  33   65:getstatic       #43  <Field Map appSessionInfoMap>
		//*  34   68:ifnonnull       81
				appSessionInfoMap = ((Map) (new HashMap()));
		//   35   71:new             #114 <Class HashMap>
		//   36   74:dup             
		//   37   75:invokespecial   #141 <Method void HashMap()>
		//   38   78:putstatic       #43  <Field Map appSessionInfoMap>
			isLoaded = true;
		//   39   81:iconst_1        
		//   40   82:putstatic       #97  <Field boolean isLoaded>
_L3:
			hasChanges = false;
		//   41   85:iconst_0        
		//   42   86:putstatic       #73  <Field boolean hasChanges>
			  goto _L2
		//*  43   89:goto            266
			Exception exception;
			exception;
		//   44   92:astore          4
			break MISSING_BLOCK_LABEL_107;
		//   45   94:goto            107
			obj1;
		//   46   97:astore_3        
			obj = null;
		//   47   98:aconst_null     
		//   48   99:astore_2        
			break MISSING_BLOCK_LABEL_195;
		//   49  100:goto            195
			exception;
		//   50  103:astore          4
			obj1 = null;
		//   51  105:aconst_null     
		//   52  106:astore_3        
			obj = obj1;
		//   53  107:aload_3         
		//   54  108:astore_2        
			String s = AppEventsLogger.TAG;
		//   55  109:invokestatic    #145 <Method String AppEventsLogger.access$1300()>
		//   56  112:astore          6
			obj = obj1;
		//   57  114:aload_3         
		//   58  115:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
		//   59  116:new             #147 <Class StringBuilder>
		//   60  119:dup             
		//   61  120:invokespecial   #148 <Method void StringBuilder()>
		//   62  123:astore          7
			obj = obj1;
		//   63  125:aload_3         
		//   64  126:astore_2        
			stringbuilder.append("Got unexpected exception: ");
		//   65  127:aload           7
		//   66  129:ldc1            #150 <String "Got unexpected exception: ">
		//   67  131:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
		//   68  134:pop             
			obj = obj1;
		//   69  135:aload_3         
		//   70  136:astore_2        
			stringbuilder.append(exception.toString());
		//   71  137:aload           7
		//   72  139:aload           4
		//   73  141:invokevirtual   #157 <Method String Exception.toString()>
		//   74  144:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
		//   75  147:pop             
			obj = obj1;
		//   76  148:aload_3         
		//   77  149:astore_2        
			Log.d(s, stringbuilder.toString());
		//   78  150:aload           6
		//   79  152:aload           7
		//   80  154:invokevirtual   #158 <Method String StringBuilder.toString()>
		//   81  157:invokestatic    #164 <Method int Log.d(String, String)>
		//   82  160:pop             
			Utility.closeQuietly(((java.io.Closeable) (obj1)));
		//   83  161:aload_3         
		//   84  162:invokestatic    #136 <Method void Utility.closeQuietly(java.io.Closeable)>
			context.deleteFile("AppEventsLogger.persistedsessioninfo");
		//   85  165:aload_0         
		//   86  166:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
		//   87  168:invokevirtual   #140 <Method boolean Context.deleteFile(String)>
		//   88  171:pop             
			if(appSessionInfoMap == null)
		//*  89  172:getstatic       #43  <Field Map appSessionInfoMap>
		//*  90  175:ifnonnull       188
				appSessionInfoMap = ((Map) (new HashMap()));
		//   91  178:new             #114 <Class HashMap>
		//   92  181:dup             
		//   93  182:invokespecial   #141 <Method void HashMap()>
		//   94  185:putstatic       #43  <Field Map appSessionInfoMap>
			isLoaded = true;
		//   95  188:iconst_1        
		//   96  189:putstatic       #97  <Field boolean isLoaded>
			  goto _L3
		//*  97  192:goto            85
_L5:
			Utility.closeQuietly(((java.io.Closeable) (obj)));
		//   98  195:aload_2         
		//   99  196:invokestatic    #136 <Method void Utility.closeQuietly(java.io.Closeable)>
			context.deleteFile("AppEventsLogger.persistedsessioninfo");
		//  100  199:aload_0         
		//  101  200:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
		//  102  202:invokevirtual   #140 <Method boolean Context.deleteFile(String)>
		//  103  205:pop             
			if(appSessionInfoMap == null)
		//* 104  206:getstatic       #43  <Field Map appSessionInfoMap>
		//* 105  209:ifnonnull       222
				appSessionInfoMap = ((Map) (new HashMap()));
		//  106  212:new             #114 <Class HashMap>
		//  107  215:dup             
		//  108  216:invokespecial   #141 <Method void HashMap()>
		//  109  219:putstatic       #43  <Field Map appSessionInfoMap>
			isLoaded = true;
		//  110  222:iconst_1        
		//  111  223:putstatic       #97  <Field boolean isLoaded>
			hasChanges = false;
		//  112  226:iconst_0        
		//  113  227:putstatic       #73  <Field boolean hasChanges>
			throw obj1;
		//  114  230:aload_3         
		//  115  231:athrow          
_L4:
			Utility.closeQuietly(((java.io.Closeable) (obj1)));
		//  116  232:aload_3         
		//  117  233:invokestatic    #136 <Method void Utility.closeQuietly(java.io.Closeable)>
			context.deleteFile("AppEventsLogger.persistedsessioninfo");
		//  118  236:aload_0         
		//  119  237:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
		//  120  239:invokevirtual   #140 <Method boolean Context.deleteFile(String)>
		//  121  242:pop             
			if(appSessionInfoMap == null)
		//* 122  243:getstatic       #43  <Field Map appSessionInfoMap>
		//* 123  246:ifnonnull       259
				appSessionInfoMap = ((Map) (new HashMap()));
		//  124  249:new             #114 <Class HashMap>
		//  125  252:dup             
		//  126  253:invokespecial   #141 <Method void HashMap()>
		//  127  256:putstatic       #43  <Field Map appSessionInfoMap>
			isLoaded = true;
		//  128  259:iconst_1        
		//  129  260:putstatic       #97  <Field boolean isLoaded>
			  goto _L3
		//* 130  263:goto            85
_L2:
			obj2;
		//  131  266:aload           5
			JVM INSTR monitorexit ;
		//  132  268:monitorexit     
			return;
		//  133  269:return          
			context;
		//  134  270:astore_0        
			obj2;
		//  135  271:aload           5
			JVM INSTR monitorexit ;
		//  136  273:monitorexit     
			throw context;
		//  137  274:aload_0         
		//  138  275:athrow          
			FileNotFoundException filenotfoundexception;
			filenotfoundexception;
		//  139  276:astore_2        
			break MISSING_BLOCK_LABEL_288;
		//  140  277:goto            288
			filenotfoundexception;
		//  141  280:astore_2        
			  goto _L4
		//* 142  281:goto            232
			obj1;
		//  143  284:astore_3        
			  goto _L5
		//* 144  285:goto            195
			obj1 = null;
		//  145  288:aconst_null     
		//  146  289:astore_3        
			  goto _L4
		//* 147  290:goto            232
		}

		static void saveAppSessionInformation(Context context)
		{
			Object obj1 = staticLock;
		//    0    0:getstatic       #31  <Field Object staticLock>
		//    1    3:astore          5
			obj1;
		//    2    5:aload           5
			JVM INSTR monitorenter ;
		//    3    7:monitorenter    
			boolean flag = hasChanges;
		//    4    8:getstatic       #73  <Field boolean hasChanges>
		//    5   11:istore_1        
			Context context1;
			String s;
			if(!flag)
				break MISSING_BLOCK_LABEL_157;
		//    6   12:iload_1         
		//    7   13:ifeq            157
			s = null;
		//    8   16:aconst_null     
		//    9   17:astore          4
			context1 = null;
		//   10   19:aconst_null     
		//   11   20:astore_2        
			context = ((Context) (new ObjectOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (context.openFileOutput("AppEventsLogger.persistedsessioninfo", 0)))))))));
		//   12   21:new             #167 <Class ObjectOutputStream>
		//   13   24:dup             
		//   14   25:new             #169 <Class BufferedOutputStream>
		//   15   28:dup             
		//   16   29:aload_0         
		//   17   30:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
		//   18   32:iconst_0        
		//   19   33:invokevirtual   #173 <Method java.io.FileOutputStream Context.openFileOutput(String, int)>
		//   20   36:invokespecial   #176 <Method void BufferedOutputStream(java.io.OutputStream)>
		//   21   39:invokespecial   #177 <Method void ObjectOutputStream(java.io.OutputStream)>
		//   22   42:astore_0        
			((ObjectOutputStream) (context)).writeObject(((Object) (appSessionInfoMap)));
		//   23   43:aload_0         
		//   24   44:getstatic       #43  <Field Map appSessionInfoMap>
		//   25   47:invokevirtual   #181 <Method void ObjectOutputStream.writeObject(Object)>
			hasChanges = false;
		//   26   50:iconst_0        
		//   27   51:putstatic       #73  <Field boolean hasChanges>
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "App session info saved");
		//   28   54:getstatic       #120 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
		//   29   57:ldc1            #122 <String "AppEvents">
		//   30   59:ldc1            #183 <String "App session info saved">
		//   31   61:invokestatic    #130 <Method void Logger.log(LoggingBehavior, String, String)>
			Utility.closeQuietly(((java.io.Closeable) (context)));
		//   32   64:aload_0         
		//   33   65:invokestatic    #136 <Method void Utility.closeQuietly(java.io.Closeable)>
			break MISSING_BLOCK_LABEL_157;
		//   34   68:goto            157
			Object obj;
			obj;
		//   35   71:astore_3        
			context1 = context;
		//   36   72:aload_0         
		//   37   73:astore_2        
			context = ((Context) (obj));
		//   38   74:aload_3         
		//   39   75:astore_0        
			break MISSING_BLOCK_LABEL_151;
		//   40   76:goto            151
			obj;
		//   41   79:astore_3        
			break MISSING_BLOCK_LABEL_91;
		//   42   80:goto            91
			context;
		//   43   83:astore_0        
			break MISSING_BLOCK_LABEL_151;
		//   44   84:goto            151
			obj;
		//   45   87:astore_3        
			context = ((Context) (s));
		//   46   88:aload           4
		//   47   90:astore_0        
			context1 = context;
		//   48   91:aload_0         
		//   49   92:astore_2        
			s = AppEventsLogger.TAG;
		//   50   93:invokestatic    #145 <Method String AppEventsLogger.access$1300()>
		//   51   96:astore          4
			context1 = context;
		//   52   98:aload_0         
		//   53   99:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
		//   54  100:new             #147 <Class StringBuilder>
		//   55  103:dup             
		//   56  104:invokespecial   #148 <Method void StringBuilder()>
		//   57  107:astore          6
			context1 = context;
		//   58  109:aload_0         
		//   59  110:astore_2        
			stringbuilder.append("Got unexpected exception: ");
		//   60  111:aload           6
		//   61  113:ldc1            #150 <String "Got unexpected exception: ">
		//   62  115:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
		//   63  118:pop             
			context1 = context;
		//   64  119:aload_0         
		//   65  120:astore_2        
			stringbuilder.append(((Exception) (obj)).toString());
		//   66  121:aload           6
		//   67  123:aload_3         
		//   68  124:invokevirtual   #157 <Method String Exception.toString()>
		//   69  127:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
		//   70  130:pop             
			context1 = context;
		//   71  131:aload_0         
		//   72  132:astore_2        
			Log.d(s, stringbuilder.toString());
		//   73  133:aload           4
		//   74  135:aload           6
		//   75  137:invokevirtual   #158 <Method String StringBuilder.toString()>
		//   76  140:invokestatic    #164 <Method int Log.d(String, String)>
		//   77  143:pop             
			Utility.closeQuietly(((java.io.Closeable) (context)));
		//   78  144:aload_0         
		//   79  145:invokestatic    #136 <Method void Utility.closeQuietly(java.io.Closeable)>
			break MISSING_BLOCK_LABEL_157;
		//   80  148:goto            157
			Utility.closeQuietly(((java.io.Closeable) (context1)));
		//   81  151:aload_2         
		//   82  152:invokestatic    #136 <Method void Utility.closeQuietly(java.io.Closeable)>
			throw context;
		//   83  155:aload_0         
		//   84  156:athrow          
			obj1;
		//   85  157:aload           5
			JVM INSTR monitorexit ;
		//   86  159:monitorexit     
			return;
		//   87  160:return          
			context;
		//   88  161:astore_0        
			obj1;
		//   89  162:aload           5
			JVM INSTR monitorexit ;
		//   90  164:monitorexit     
			throw context;
		//   91  165:aload_0         
		//   92  166:athrow          
		}

		private static final String PERSISTED_SESSION_INFO_FILENAME = "AppEventsLogger.persistedsessioninfo";
		private static final Runnable appSessionInfoFlushRunnable = new Runnable() {

			public void run()
			{
				PersistedAppSessionInfo.saveAppSessionInformation(AppEventsLogger.applicationContext);
			//    0    0:invokestatic    #21  <Method Context AppEventsLogger.access$1000()>
			//    1    3:invokestatic    #25  <Method void AppEventsLogger$PersistedAppSessionInfo.saveAppSessionInformation(Context)>
			//    2    6:return          
			}

		}
;
		private static Map appSessionInfoMap;
		private static boolean hasChanges = false;
		private static boolean isLoaded = false;
		private static final Object staticLock = new Object();

		static 
		{
		//    0    0:new             #4   <Class Object>
		//    1    3:dup             
		//    2    4:invokespecial   #29  <Method void Object()>
		//    3    7:putstatic       #31  <Field Object staticLock>
		//    4   10:new             #9   <Class AppEventsLogger$PersistedAppSessionInfo$1>
		//    5   13:dup             
		//    6   14:invokespecial   #32  <Method void AppEventsLogger$PersistedAppSessionInfo$1()>
		//    7   17:putstatic       #34  <Field Runnable appSessionInfoFlushRunnable>
		//*   8   20:return          
		}

		PersistedAppSessionInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
		//    2    4:return          
		}
	}

	static class PersistedEvents
	{

		public static void persistEvents(Context context1, AccessTokenAppIdPair accesstokenappidpair, SessionEventsState sessioneventsstate)
		{
			HashMap hashmap = new HashMap();
		//    0    0:new             #29  <Class HashMap>
		//    1    3:dup             
		//    2    4:invokespecial   #30  <Method void HashMap()>
		//    3    7:astore_3        
			((Map) (hashmap)).put(((Object) (accesstokenappidpair)), ((Object) (sessioneventsstate)));
		//    4    8:aload_3         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #42  <Method Object Map.put(Object, Object)>
		//    8   16:pop             
			persistEvents(context1, ((Map) (hashmap)));
		//    9   17:aload_0         
		//   10   18:aload_3         
		//   11   19:invokestatic    #45  <Method void persistEvents(Context, Map)>
		//   12   22:return          
		}

		public static void persistEvents(Context context1, Map map)
		{
			Object obj = staticLock;
		//    0    0:getstatic       #25  <Field Object staticLock>
		//    1    3:astore_2        
			obj;
		//    2    4:aload_2         
			JVM INSTR monitorenter ;
		//    3    5:monitorenter    
			context1 = ((Context) (readAndClearStore(context1)));
		//    4    6:aload_0         
		//    5    7:invokestatic    #49  <Method AppEventsLogger$PersistedEvents readAndClearStore(Context)>
		//    6   10:astore_0        
			map = ((Map) (map.entrySet().iterator()));
		//    7   11:aload_1         
		//    8   12:invokeinterface #53  <Method Set Map.entrySet()>
		//    9   17:invokeinterface #59  <Method Iterator Set.iterator()>
		//   10   22:astore_1        
_L1:
			java.util.Map.Entry entry;
			List list;
			do
			{
				if(!((Iterator) (map)).hasNext())
					break MISSING_BLOCK_LABEL_87;
		//   11   23:aload_1         
		//   12   24:invokeinterface #65  <Method boolean Iterator.hasNext()>
		//   13   29:ifeq            87
				entry = (java.util.Map.Entry)((Iterator) (map)).next();
		//   14   32:aload_1         
		//   15   33:invokeinterface #69  <Method Object Iterator.next()>
		//   16   38:checkcast       #71  <Class java.util.Map$Entry>
		//   17   41:astore_3        
				list = ((SessionEventsState)entry.getValue()).getEventsToPersist();
		//   18   42:aload_3         
		//   19   43:invokeinterface #74  <Method Object java.util.Map$Entry.getValue()>
		//   20   48:checkcast       #76  <Class AppEventsLogger$SessionEventsState>
		//   21   51:invokevirtual   #80  <Method List AppEventsLogger$SessionEventsState.getEventsToPersist()>
		//   22   54:astore          4
			} while(list.size() == 0);
		//   23   56:aload           4
		//   24   58:invokeinterface #86  <Method int List.size()>
		//   25   63:ifne            69
		//*  26   66:goto            23
			((PersistedEvents) (context1)).addEvents((AccessTokenAppIdPair)entry.getKey(), list);
		//   27   69:aload_0         
		//   28   70:aload_3         
		//   29   71:invokeinterface #89  <Method Object java.util.Map$Entry.getKey()>
		//   30   76:checkcast       #91  <Class AppEventsLogger$AccessTokenAppIdPair>
		//   31   79:aload           4
		//   32   81:invokevirtual   #95  <Method void addEvents(AppEventsLogger$AccessTokenAppIdPair, List)>
			  goto _L1
		//*  33   84:goto            23
			((PersistedEvents) (context1)).write();
		//   34   87:aload_0         
		//   35   88:invokespecial   #98  <Method void write()>
			obj;
		//   36   91:aload_2         
			JVM INSTR monitorexit ;
		//   37   92:monitorexit     
			return;
		//   38   93:return          
			context1;
		//   39   94:astore_0        
			obj;
		//   40   95:aload_2         
			JVM INSTR monitorexit ;
		//   41   96:monitorexit     
			throw context1;
		//   42   97:aload_0         
		//   43   98:athrow          
		}

		public static PersistedEvents readAndClearStore(Context context1)
		{
			synchronized(staticLock)
		//*   0    0:getstatic       #25  <Field Object staticLock>
		//*   1    3:astore_1        
		//*   2    4:aload_1         
		//*   3    5:monitorenter    
			{
				context1 = ((Context) (new PersistedEvents(context1)));
		//    4    6:new             #2   <Class AppEventsLogger$PersistedEvents>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:invokespecial   #102 <Method void AppEventsLogger$PersistedEvents(Context)>
		//    8   14:astore_0        
				((PersistedEvents) (context1)).readAndClearStore();
		//    9   15:aload_0         
		//   10   16:invokespecial   #104 <Method void readAndClearStore()>
			}
		//   11   19:aload_1         
		//   12   20:monitorexit     
			return ((PersistedEvents) (context1));
		//   13   21:aload_0         
		//   14   22:areturn         
			context1;
		//   15   23:astore_0        
			obj;
		//   16   24:aload_1         
			JVM INSTR monitorexit ;
		//   17   25:monitorexit     
			throw context1;
		//   18   26:aload_0         
		//   19   27:athrow          
		}

		private void readAndClearStore()
		{
			Object obj1 = null;
		//    0    0:aconst_null     
		//    1    1:astore_2        
			Object obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (new BufferedInputStream(((java.io.InputStream) (context.openFileInput("AppEventsLogger.persistedevents")))))))));
		//    2    2:new             #110 <Class ObjectInputStream>
		//    3    5:dup             
		//    4    6:new             #112 <Class BufferedInputStream>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:getfield        #34  <Field Context context>
		//    8   14:ldc1            #11  <String "AppEventsLogger.persistedevents">
		//    9   16:invokevirtual   #118 <Method java.io.FileInputStream Context.openFileInput(String)>
		//   10   19:invokespecial   #121 <Method void BufferedInputStream(java.io.InputStream)>
		//   11   22:invokespecial   #122 <Method void ObjectInputStream(java.io.InputStream)>
		//   12   25:astore_1        
			obj1 = obj;
		//   13   26:aload_1         
		//   14   27:astore_2        
			HashMap hashmap = (HashMap)((ObjectInputStream) (obj)).readObject();
		//   15   28:aload_1         
		//   16   29:invokevirtual   #125 <Method Object ObjectInputStream.readObject()>
		//   17   32:checkcast       #29  <Class HashMap>
		//   18   35:astore_3        
			obj1 = obj;
		//   19   36:aload_1         
		//   20   37:astore_2        
			context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
		//   21   38:aload_0         
		//   22   39:getfield        #34  <Field Context context>
		//   23   42:ldc1            #11  <String "AppEventsLogger.persistedevents">
		//   24   44:invokevirtual   #129 <Method File Context.getFileStreamPath(String)>
		//   25   47:invokevirtual   #134 <Method boolean File.delete()>
		//   26   50:pop             
			obj1 = obj;
		//   27   51:aload_1         
		//   28   52:astore_2        
			persistedEvents = hashmap;
		//   29   53:aload_0         
		//   30   54:aload_3         
		//   31   55:putfield        #32  <Field HashMap persistedEvents>
			break MISSING_BLOCK_LABEL_130;
		//   32   58:goto            130
			Exception exception;
			exception;
		//   33   61:astore_3        
			break MISSING_BLOCK_LABEL_77;
		//   34   62:goto            77
		//*  35   65:goto            142
			obj;
		//   36   68:astore_1        
			obj1 = null;
		//   37   69:aconst_null     
		//   38   70:astore_2        
			break MISSING_BLOCK_LABEL_136;
		//   39   71:goto            136
			exception;
		//   40   74:astore_3        
			obj = null;
		//   41   75:aconst_null     
		//   42   76:astore_1        
			obj1 = obj;
		//   43   77:aload_1         
		//   44   78:astore_2        
			String s = AppEventsLogger.TAG;
		//   45   79:invokestatic    #138 <Method String AppEventsLogger.access$1300()>
		//   46   82:astore          4
			obj1 = obj;
		//   47   84:aload_1         
		//   48   85:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
		//   49   86:new             #140 <Class StringBuilder>
		//   50   89:dup             
		//   51   90:invokespecial   #141 <Method void StringBuilder()>
		//   52   93:astore          5
			obj1 = obj;
		//   53   95:aload_1         
		//   54   96:astore_2        
			stringbuilder.append("Got unexpected exception: ");
		//   55   97:aload           5
		//   56   99:ldc1            #143 <String "Got unexpected exception: ">
		//   57  101:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
		//   58  104:pop             
			obj1 = obj;
		//   59  105:aload_1         
		//   60  106:astore_2        
			stringbuilder.append(exception.toString());
		//   61  107:aload           5
		//   62  109:aload_3         
		//   63  110:invokevirtual   #150 <Method String Exception.toString()>
		//   64  113:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
		//   65  116:pop             
			obj1 = obj;
		//   66  117:aload_1         
		//   67  118:astore_2        
			Log.d(s, stringbuilder.toString());
		//   68  119:aload           4
		//   69  121:aload           5
		//   70  123:invokevirtual   #151 <Method String StringBuilder.toString()>
		//   71  126:invokestatic    #157 <Method int Log.d(String, String)>
		//   72  129:pop             
			Utility.closeQuietly(((java.io.Closeable) (obj)));
		//   73  130:aload_1         
		//   74  131:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
			return;
		//   75  134:return          
			obj;
		//   76  135:astore_1        
			Utility.closeQuietly(((java.io.Closeable) (obj1)));
		//   77  136:aload_2         
		//   78  137:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
			throw obj;
		//   79  140:aload_1         
		//   80  141:athrow          
_L2:
			Utility.closeQuietly(((java.io.Closeable) (obj)));
		//   81  142:aload_1         
		//   82  143:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
			return;
		//   83  146:return          
			FileNotFoundException filenotfoundexception;
			filenotfoundexception;
		//   84  147:astore_1        
			filenotfoundexception = ((FileNotFoundException) (obj1));
		//   85  148:aload_2         
		//   86  149:astore_1        
			continue; /* Loop/switch isn't completed */
		//   87  150:goto            142
			FileNotFoundException filenotfoundexception1;
			filenotfoundexception1;
		//   88  153:astore_2        
			if(true) goto _L2; else goto _L1
_L1:
		//*  89  154:goto            65
		}

		private void write()
		{
			Object obj;
			String s;
			s = null;
		//    0    0:aconst_null     
		//    1    1:astore          4
			obj = null;
		//    2    3:aconst_null     
		//    3    4:astore_1        
			Object obj1 = ((Object) (new ObjectOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (context.openFileOutput("AppEventsLogger.persistedevents", 0)))))))));
		//    4    5:new             #165 <Class ObjectOutputStream>
		//    5    8:dup             
		//    6    9:new             #167 <Class BufferedOutputStream>
		//    7   12:dup             
		//    8   13:aload_0         
		//    9   14:getfield        #34  <Field Context context>
		//   10   17:ldc1            #11  <String "AppEventsLogger.persistedevents">
		//   11   19:iconst_0        
		//   12   20:invokevirtual   #171 <Method java.io.FileOutputStream Context.openFileOutput(String, int)>
		//   13   23:invokespecial   #174 <Method void BufferedOutputStream(java.io.OutputStream)>
		//   14   26:invokespecial   #175 <Method void ObjectOutputStream(java.io.OutputStream)>
		//   15   29:astore_2        
			((ObjectOutputStream) (obj1)).writeObject(((Object) (persistedEvents)));
		//   16   30:aload_2         
		//   17   31:aload_0         
		//   18   32:getfield        #32  <Field HashMap persistedEvents>
		//   19   35:invokevirtual   #179 <Method void ObjectOutputStream.writeObject(Object)>
			Utility.closeQuietly(((java.io.Closeable) (obj1)));
		//   20   38:aload_2         
		//   21   39:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
			return;
		//   22   42:return          
			obj;
		//   23   43:astore_1        
			break MISSING_BLOCK_LABEL_121;
		//   24   44:goto            121
			Object obj2;
			obj2;
		//   25   47:astore_3        
			break MISSING_BLOCK_LABEL_63;
		//   26   48:goto            63
			obj2;
		//   27   51:astore_3        
			obj1 = obj;
		//   28   52:aload_1         
		//   29   53:astore_2        
			obj = obj2;
		//   30   54:aload_3         
		//   31   55:astore_1        
			break MISSING_BLOCK_LABEL_121;
		//   32   56:goto            121
			obj2;
		//   33   59:astore_3        
			obj1 = ((Object) (s));
		//   34   60:aload           4
		//   35   62:astore_2        
			obj = obj1;
		//   36   63:aload_2         
		//   37   64:astore_1        
			s = AppEventsLogger.TAG;
		//   38   65:invokestatic    #138 <Method String AppEventsLogger.access$1300()>
		//   39   68:astore          4
			obj = obj1;
		//   40   70:aload_2         
		//   41   71:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
		//   42   72:new             #140 <Class StringBuilder>
		//   43   75:dup             
		//   44   76:invokespecial   #141 <Method void StringBuilder()>
		//   45   79:astore          5
			obj = obj1;
		//   46   81:aload_2         
		//   47   82:astore_1        
			stringbuilder.append("Got unexpected exception: ");
		//   48   83:aload           5
		//   49   85:ldc1            #143 <String "Got unexpected exception: ">
		//   50   87:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
		//   51   90:pop             
			obj = obj1;
		//   52   91:aload_2         
		//   53   92:astore_1        
			stringbuilder.append(((Exception) (obj2)).toString());
		//   54   93:aload           5
		//   55   95:aload_3         
		//   56   96:invokevirtual   #150 <Method String Exception.toString()>
		//   57   99:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
		//   58  102:pop             
			obj = obj1;
		//   59  103:aload_2         
		//   60  104:astore_1        
			Log.d(s, stringbuilder.toString());
		//   61  105:aload           4
		//   62  107:aload           5
		//   63  109:invokevirtual   #151 <Method String StringBuilder.toString()>
		//   64  112:invokestatic    #157 <Method int Log.d(String, String)>
		//   65  115:pop             
			Utility.closeQuietly(((java.io.Closeable) (obj1)));
		//   66  116:aload_2         
		//   67  117:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
			return;
		//   68  120:return          
			Utility.closeQuietly(((java.io.Closeable) (obj1)));
		//   69  121:aload_2         
		//   70  122:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
			throw obj;
		//   71  125:aload_1         
		//   72  126:athrow          
		}

		public void addEvents(AccessTokenAppIdPair accesstokenappidpair, List list)
		{
			if(!persistedEvents.containsKey(((Object) (accesstokenappidpair))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field HashMap persistedEvents>
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #183 <Method boolean HashMap.containsKey(Object)>
		//*   4    8:ifne            27
				persistedEvents.put(((Object) (accesstokenappidpair)), ((Object) (new ArrayList())));
		//    5   11:aload_0         
		//    6   12:getfield        #32  <Field HashMap persistedEvents>
		//    7   15:aload_1         
		//    8   16:new             #185 <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #186 <Method void ArrayList()>
		//   11   23:invokevirtual   #187 <Method Object HashMap.put(Object, Object)>
		//   12   26:pop             
			((List)persistedEvents.get(((Object) (accesstokenappidpair)))).addAll(((Collection) (list)));
		//   13   27:aload_0         
		//   14   28:getfield        #32  <Field HashMap persistedEvents>
		//   15   31:aload_1         
		//   16   32:invokevirtual   #191 <Method Object HashMap.get(Object)>
		//   17   35:checkcast       #82  <Class List>
		//   18   38:aload_2         
		//   19   39:invokeinterface #195 <Method boolean List.addAll(Collection)>
		//   20   44:pop             
		//   21   45:return          
		}

		public List getEvents(AccessTokenAppIdPair accesstokenappidpair)
		{
			return (List)persistedEvents.get(((Object) (accesstokenappidpair)));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field HashMap persistedEvents>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #191 <Method Object HashMap.get(Object)>
		//    4    8:checkcast       #82  <Class List>
		//    5   11:areturn         
		}

		public Set keySet()
		{
			return persistedEvents.keySet();
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field HashMap persistedEvents>
		//    2    4:invokevirtual   #202 <Method Set HashMap.keySet()>
		//    3    7:areturn         
		}

		static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
		private static Object staticLock = new Object();
		private Context context;
		private HashMap persistedEvents;

		static 
		{
		//    0    0:new             #4   <Class Object>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void Object()>
		//    3    7:putstatic       #25  <Field Object staticLock>
		//*   4   10:return          
		}

		private PersistedEvents(Context context1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			persistedEvents = new HashMap();
		//    2    4:aload_0         
		//    3    5:new             #29  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #30  <Method void HashMap()>
		//    6   12:putfield        #32  <Field HashMap persistedEvents>
			context = context1;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #34  <Field Context context>
		//   10   20:return          
		}
	}

	static class SessionEventsState
	{

		private byte[] getStringAsByteArray(String s)
		{
			try
			{
				s = ((String) (s.getBytes("UTF-8")));
		//    0    0:aload_1         
		//    1    1:ldc1            #55  <String "UTF-8">
		//    2    3:invokevirtual   #60  <Method byte[] String.getBytes(String)>
		//    3    6:astore_1        
			}
		//*   4    7:aload_1         
		//*   5    8:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6    9:astore_1        
			{
				Utility.logd("Encoding exception: ", ((Exception) (s)));
		//    7   10:ldc1            #62  <String "Encoding exception: ">
		//    8   12:aload_1         
		//    9   13:invokestatic    #68  <Method void Utility.logd(String, Exception)>
				return null;
		//   10   16:aconst_null     
		//   11   17:areturn         
			}
			return ((byte []) (s));
		}

		private void populateRequest(GraphRequest graphrequest, int i, JSONArray jsonarray, boolean flag)
		{
			JSONObject jsonobject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, attributionIdentifiers, anonymousAppDeviceGUID, flag, AppEventsLogger.applicationContext);
		//    0    0:getstatic       #78  <Field com.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType com.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType.CUSTOM_APP_EVENTS>
		//    1    3:aload_0         
		//    2    4:getfield        #44  <Field AttributionIdentifiers attributionIdentifiers>
		//    3    7:aload_0         
		//    4    8:getfield        #48  <Field String anonymousAppDeviceGUID>
		//    5   11:iload           4
		//    6   13:invokestatic    #82  <Method Context AppEventsLogger.access$1000()>
		//    7   16:invokestatic    #88  <Method JSONObject AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType, AttributionIdentifiers, String, boolean, Context)>
		//    8   19:astore          6
			Object obj = ((Object) (jsonobject));
		//    9   21:aload           6
		//   10   23:astore          5
			if(numSkippedEventsDueToFullBuffer <= 0) goto _L2; else goto _L1
		//   11   25:aload_0         
		//   12   26:getfield        #90  <Field int numSkippedEventsDueToFullBuffer>
		//   13   29:ifle            57
_L1:
			jsonobject.put("num_skipped_events", i);
		//   14   32:aload           6
		//   15   34:ldc1            #92  <String "num_skipped_events">
		//   16   36:iload_2         
		//   17   37:invokevirtual   #98  <Method JSONObject JSONObject.put(String, int)>
		//   18   40:pop             
			obj = ((Object) (jsonobject));
		//   19   41:aload           6
		//   20   43:astore          5
			  goto _L2
		//*  21   45:goto            57
_L4:
			obj = ((Object) (new JSONObject()));
		//   22   48:new             #94  <Class JSONObject>
		//   23   51:dup             
		//   24   52:invokespecial   #99  <Method void JSONObject()>
		//   25   55:astore          5
_L2:
			graphrequest.setGraphObject(((JSONObject) (obj)));
		//   26   57:aload_1         
		//   27   58:aload           5
		//   28   60:invokevirtual   #105 <Method void GraphRequest.setGraphObject(JSONObject)>
			Bundle bundle = graphrequest.getParameters();
		//   29   63:aload_1         
		//   30   64:invokevirtual   #109 <Method Bundle GraphRequest.getParameters()>
		//   31   67:astore          6
			obj = ((Object) (bundle));
		//   32   69:aload           6
		//   33   71:astore          5
			if(bundle == null)
		//*  34   73:aload           6
		//*  35   75:ifnonnull       87
				obj = ((Object) (new Bundle()));
		//   36   78:new             #111 <Class Bundle>
		//   37   81:dup             
		//   38   82:invokespecial   #112 <Method void Bundle()>
		//   39   85:astore          5
			jsonarray = ((JSONArray) (jsonarray.toString()));
		//   40   87:aload_3         
		//   41   88:invokevirtual   #118 <Method String JSONArray.toString()>
		//   42   91:astore_3        
			if(jsonarray != null)
		//*  43   92:aload_3         
		//*  44   93:ifnull          113
			{
				((Bundle) (obj)).putByteArray("custom_events_file", getStringAsByteArray(((String) (jsonarray))));
		//   45   96:aload           5
		//   46   98:ldc1            #120 <String "custom_events_file">
		//   47  100:aload_0         
		//   48  101:aload_3         
		//   49  102:invokespecial   #122 <Method byte[] getStringAsByteArray(String)>
		//   50  105:invokevirtual   #126 <Method void Bundle.putByteArray(String, byte[])>
				graphrequest.setTag(((Object) (jsonarray)));
		//   51  108:aload_1         
		//   52  109:aload_3         
		//   53  110:invokevirtual   #130 <Method void GraphRequest.setTag(Object)>
			}
			graphrequest.setParameters(((Bundle) (obj)));
		//   54  113:aload_1         
		//   55  114:aload           5
		//   56  116:invokevirtual   #134 <Method void GraphRequest.setParameters(Bundle)>
			return;
		//   57  119:return          
			JSONException jsonexception;
			jsonexception;
		//   58  120:astore          5
			if(true) goto _L4; else goto _L3
		//   59  122:goto            48
_L3:
		}

		public void accumulatePersistedEvents(List list)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			accumulatedEvents.addAll(((Collection) (list)));
		//    2    2:aload_0         
		//    3    3:getfield        #38  <Field List accumulatedEvents>
		//    4    6:aload_1         
		//    5    7:invokeinterface #142 <Method boolean List.addAll(Collection)>
		//    6   12:pop             
			this;
		//    7   13:aload_0         
			JVM INSTR monitorexit ;
		//    8   14:monitorexit     
			return;
		//    9   15:return          
			list;
		//   10   16:astore_1        
		//*  11   17:aload_0         
			throw list;
		//   12   18:monitorexit     
		//   13   19:aload_1         
		//   14   20:athrow          
		}

		public void addEvent(AppEvent appevent)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(accumulatedEvents.size() + inFlightEvents.size() >= 1000)
		//*   2    2:aload_0         
		//*   3    3:getfield        #38  <Field List accumulatedEvents>
		//*   4    6:invokeinterface #150 <Method int List.size()>
		//*   5   11:aload_0         
		//*   6   12:getfield        #40  <Field List inFlightEvents>
		//*   7   15:invokeinterface #150 <Method int List.size()>
		//*   8   20:iadd            
		//*   9   21:sipush          1000
		//*  10   24:icmplt          40
			{
				numSkippedEventsDueToFullBuffer = numSkippedEventsDueToFullBuffer + 1;
		//   11   27:aload_0         
		//   12   28:aload_0         
		//   13   29:getfield        #90  <Field int numSkippedEventsDueToFullBuffer>
		//   14   32:iconst_1        
		//   15   33:iadd            
		//   16   34:putfield        #90  <Field int numSkippedEventsDueToFullBuffer>
				break MISSING_BLOCK_LABEL_51;
		//   17   37:goto            51
			}
			accumulatedEvents.add(((Object) (appevent)));
		//   18   40:aload_0         
		//   19   41:getfield        #38  <Field List accumulatedEvents>
		//   20   44:aload_1         
		//   21   45:invokeinterface #154 <Method boolean List.add(Object)>
		//   22   50:pop             
			this;
		//   23   51:aload_0         
			JVM INSTR monitorexit ;
		//   24   52:monitorexit     
			return;
		//   25   53:return          
			appevent;
		//   26   54:astore_1        
		//*  27   55:aload_0         
			throw appevent;
		//   28   56:monitorexit     
		//   29   57:aload_1         
		//   30   58:athrow          
		}

		public void clearInFlightAndStats(boolean flag)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(!flag)
				break MISSING_BLOCK_LABEL_23;
		//    2    2:iload_1         
		//    3    3:ifeq            23
			accumulatedEvents.addAll(((Collection) (inFlightEvents)));
		//    4    6:aload_0         
		//    5    7:getfield        #38  <Field List accumulatedEvents>
		//    6   10:aload_0         
		//    7   11:getfield        #40  <Field List inFlightEvents>
		//    8   14:invokeinterface #142 <Method boolean List.addAll(Collection)>
		//    9   19:pop             
		//*  10   20:goto            23
			inFlightEvents.clear();
		//   11   23:aload_0         
		//   12   24:getfield        #40  <Field List inFlightEvents>
		//   13   27:invokeinterface #159 <Method void List.clear()>
			numSkippedEventsDueToFullBuffer = 0;
		//   14   32:aload_0         
		//   15   33:iconst_0        
		//   16   34:putfield        #90  <Field int numSkippedEventsDueToFullBuffer>
			this;
		//   17   37:aload_0         
			JVM INSTR monitorexit ;
		//   18   38:monitorexit     
			return;
		//   19   39:return          
		//*  20   40:aload_0         
_L2:
			Exception exception;
			throw exception;
		//   21   41:monitorexit     
		//   22   42:aload_2         
		//   23   43:athrow          
			exception;
		//   24   44:astore_2        
			if(true) goto _L2; else goto _L1
_L1:
		//*  25   45:goto            40
		}

		public int getAccumulatedEventCount()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			int i = accumulatedEvents.size();
		//    2    2:aload_0         
		//    3    3:getfield        #38  <Field List accumulatedEvents>
		//    4    6:invokeinterface #150 <Method int List.size()>
		//    5   11:istore_1        
			this;
		//    6   12:aload_0         
			JVM INSTR monitorexit ;
		//    7   13:monitorexit     
			return i;
		//    8   14:iload_1         
		//    9   15:ireturn         
			Exception exception;
			exception;
		//   10   16:astore_2        
		//*  11   17:aload_0         
			throw exception;
		//   12   18:monitorexit     
		//   13   19:aload_2         
		//   14   20:athrow          
		}

		public List getEventsToPersist()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			List list;
			list = accumulatedEvents;
		//    2    2:aload_0         
		//    3    3:getfield        #38  <Field List accumulatedEvents>
		//    4    6:astore_1        
			accumulatedEvents = ((List) (new ArrayList()));
		//    5    7:aload_0         
		//    6    8:new             #35  <Class ArrayList>
		//    7   11:dup             
		//    8   12:invokespecial   #36  <Method void ArrayList()>
		//    9   15:putfield        #38  <Field List accumulatedEvents>
			this;
		//   10   18:aload_0         
			JVM INSTR monitorexit ;
		//   11   19:monitorexit     
			return list;
		//   12   20:aload_1         
		//   13   21:areturn         
			Exception exception;
			exception;
		//   14   22:astore_1        
		//*  15   23:aload_0         
			throw exception;
		//   16   24:monitorexit     
		//   17   25:aload_1         
		//   18   26:athrow          
		}

		public int populateRequest(GraphRequest graphrequest, boolean flag, boolean flag1)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			int i;
			JSONArray jsonarray;
			Iterator iterator;
			i = numSkippedEventsDueToFullBuffer;
		//    2    2:aload_0         
		//    3    3:getfield        #90  <Field int numSkippedEventsDueToFullBuffer>
		//    4    6:istore          4
			inFlightEvents.addAll(((Collection) (accumulatedEvents)));
		//    5    8:aload_0         
		//    6    9:getfield        #40  <Field List inFlightEvents>
		//    7   12:aload_0         
		//    8   13:getfield        #38  <Field List accumulatedEvents>
		//    9   16:invokeinterface #142 <Method boolean List.addAll(Collection)>
		//   10   21:pop             
			accumulatedEvents.clear();
		//   11   22:aload_0         
		//   12   23:getfield        #38  <Field List accumulatedEvents>
		//   13   26:invokeinterface #159 <Method void List.clear()>
			jsonarray = new JSONArray();
		//   14   31:new             #114 <Class JSONArray>
		//   15   34:dup             
		//   16   35:invokespecial   #165 <Method void JSONArray()>
		//   17   38:astore          5
			iterator = inFlightEvents.iterator();
		//   18   40:aload_0         
		//   19   41:getfield        #40  <Field List inFlightEvents>
		//   20   44:invokeinterface #169 <Method Iterator List.iterator()>
		//   21   49:astore          6
_L3:
			AppEvent appevent;
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_99;
		//   22   51:aload           6
		//   23   53:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//   24   58:ifeq            99
			appevent = (AppEvent)iterator.next();
		//   25   61:aload           6
		//   26   63:invokeinterface #179 <Method Object Iterator.next()>
		//   27   68:checkcast       #181 <Class AppEventsLogger$AppEvent>
		//   28   71:astore          7
			if(flag) goto _L2; else goto _L1
		//   29   73:iload_2         
		//   30   74:ifne            85
_L1:
			if(appevent.getIsImplicit()) goto _L3; else goto _L2
		//   31   77:aload           7
		//   32   79:invokevirtual   #184 <Method boolean AppEventsLogger$AppEvent.getIsImplicit()>
		//   33   82:ifne            51
_L2:
			jsonarray.put(((Object) (appevent.getJSONObject())));
		//   34   85:aload           5
		//   35   87:aload           7
		//   36   89:invokevirtual   #188 <Method JSONObject AppEventsLogger$AppEvent.getJSONObject()>
		//   37   92:invokevirtual   #191 <Method JSONArray JSONArray.put(Object)>
		//   38   95:pop             
			  goto _L3
		//*  39   96:goto            51
			if(jsonarray.length() != 0)
				break MISSING_BLOCK_LABEL_111;
		//   40   99:aload           5
		//   41  101:invokevirtual   #194 <Method int JSONArray.length()>
		//   42  104:ifne            111
			this;
		//   43  107:aload_0         
			JVM INSTR monitorexit ;
		//   44  108:monitorexit     
			return 0;
		//   45  109:iconst_0        
		//   46  110:ireturn         
			this;
		//   47  111:aload_0         
			JVM INSTR monitorexit ;
		//   48  112:monitorexit     
			populateRequest(graphrequest, i, jsonarray, flag1);
		//   49  113:aload_0         
		//   50  114:aload_1         
		//   51  115:iload           4
		//   52  117:aload           5
		//   53  119:iload_3         
		//   54  120:invokespecial   #196 <Method void populateRequest(GraphRequest, int, JSONArray, boolean)>
			return jsonarray.length();
		//   55  123:aload           5
		//   56  125:invokevirtual   #194 <Method int JSONArray.length()>
		//   57  128:ireturn         
			graphrequest;
		//   58  129:astore_1        
			this;
		//   59  130:aload_0         
			JVM INSTR monitorexit ;
		//   60  131:monitorexit     
			throw graphrequest;
		//   61  132:aload_1         
		//   62  133:athrow          
		}

		public static final String ENCODED_EVENTS_KEY = "encoded_events";
		public static final String EVENT_COUNT_KEY = "event_count";
		public static final String NUM_SKIPPED_KEY = "num_skipped";
		private final int MAX_ACCUMULATED_LOG_EVENTS = 1000;
		private List accumulatedEvents;
		private String anonymousAppDeviceGUID;
		private AttributionIdentifiers attributionIdentifiers;
		private List inFlightEvents;
		private int numSkippedEventsDueToFullBuffer;
		private String packageName;

		public SessionEventsState(AttributionIdentifiers attributionidentifiers, String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			accumulatedEvents = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #35  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #36  <Method void ArrayList()>
		//    6   12:putfield        #38  <Field List accumulatedEvents>
			inFlightEvents = ((List) (new ArrayList()));
		//    7   15:aload_0         
		//    8   16:new             #35  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #36  <Method void ArrayList()>
		//   11   23:putfield        #40  <Field List inFlightEvents>
		//   12   26:aload_0         
		//   13   27:sipush          1000
		//   14   30:putfield        #42  <Field int MAX_ACCUMULATED_LOG_EVENTS>
			attributionIdentifiers = attributionidentifiers;
		//   15   33:aload_0         
		//   16   34:aload_1         
		//   17   35:putfield        #44  <Field AttributionIdentifiers attributionIdentifiers>
			packageName = s;
		//   18   38:aload_0         
		//   19   39:aload_2         
		//   20   40:putfield        #46  <Field String packageName>
			anonymousAppDeviceGUID = s1;
		//   21   43:aload_0         
		//   22   44:aload_3         
		//   23   45:putfield        #48  <Field String anonymousAppDeviceGUID>
		//   24   48:return          
		}
	}


	private AppEventsLogger(Context context, String s, AccessToken accesstoken)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method void Object()>
		Validate.notNull(((Object) (context)), "context");
	//    2    4:aload_1         
	//    3    5:ldc1            #126 <String "context">
	//    4    7:invokestatic    #132 <Method void Validate.notNull(Object, String)>
		contextName = Utility.getActivityName(context);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokestatic    #138 <Method String Utility.getActivityName(Context)>
	//    8   15:putfield        #140 <Field String contextName>
		AccessToken accesstoken1 = accesstoken;
	//    9   18:aload_3         
	//   10   19:astore          4
		if(accesstoken == null)
	//*  11   21:aload_3         
	//*  12   22:ifnonnull       30
			accesstoken1 = AccessToken.getCurrentAccessToken();
	//   13   25:invokestatic    #146 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   14   28:astore          4
		if(accesstoken1 != null && (s == null || s.equals(((Object) (accesstoken1.getApplicationId())))))
	//*  15   30:aload           4
	//*  16   32:ifnull          67
	//*  17   35:aload_2         
	//*  18   36:ifnull          51
	//*  19   39:aload_2         
	//*  20   40:aload           4
	//*  21   42:invokevirtual   #149 <Method String AccessToken.getApplicationId()>
	//*  22   45:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*  23   48:ifeq            67
		{
			accessTokenAppId = new AccessTokenAppIdPair(accesstoken1);
	//   24   51:aload_0         
	//   25   52:new             #20  <Class AppEventsLogger$AccessTokenAppIdPair>
	//   26   55:dup             
	//   27   56:aload           4
	//   28   58:invokespecial   #158 <Method void AppEventsLogger$AccessTokenAppIdPair(AccessToken)>
	//   29   61:putfield        #160 <Field AppEventsLogger$AccessTokenAppIdPair accessTokenAppId>
		} else
	//*  30   64:goto            91
		{
			accesstoken = ((AccessToken) (s));
	//   31   67:aload_2         
	//   32   68:astore_3        
			if(s == null)
	//*  33   69:aload_2         
	//*  34   70:ifnonnull       78
				accesstoken = ((AccessToken) (Utility.getMetadataApplicationId(context)));
	//   35   73:aload_1         
	//   36   74:invokestatic    #163 <Method String Utility.getMetadataApplicationId(Context)>
	//   37   77:astore_3        
			accessTokenAppId = new AccessTokenAppIdPair(((String) (null)), ((String) (accesstoken)));
	//   38   78:aload_0         
	//   39   79:new             #20  <Class AppEventsLogger$AccessTokenAppIdPair>
	//   40   82:dup             
	//   41   83:aconst_null     
	//   42   84:aload_3         
	//   43   85:invokespecial   #166 <Method void AppEventsLogger$AccessTokenAppIdPair(String, String)>
	//   44   88:putfield        #160 <Field AppEventsLogger$AccessTokenAppIdPair accessTokenAppId>
		}
		synchronized(staticLock)
	//*  45   91:getstatic       #122 <Field Object staticLock>
	//*  46   94:astore_2        
	//*  47   95:aload_2         
	//*  48   96:monitorenter    
		{
			if(applicationContext == null)
	//*  49   97:getstatic       #168 <Field Context applicationContext>
	//*  50  100:ifnonnull       110
				applicationContext = context.getApplicationContext();
	//   51  103:aload_1         
	//   52  104:invokevirtual   #174 <Method Context Context.getApplicationContext()>
	//   53  107:putstatic       #168 <Field Context applicationContext>
		}
	//   54  110:aload_2         
	//   55  111:monitorexit     
		initializeTimersIfNeeded();
	//   56  112:invokestatic    #177 <Method void initializeTimersIfNeeded()>
		return;
	//   57  115:return          
		context;
	//   58  116:astore_1        
		s;
	//   59  117:aload_2         
		JVM INSTR monitorexit ;
	//   60  118:monitorexit     
		throw context;
	//   61  119:aload_1         
	//   62  120:athrow          
	}

	private static int accumulatePersistedEvents()
	{
		PersistedEvents persistedevents = PersistedEvents.readAndClearStore(applicationContext);
	//    0    0:getstatic       #168 <Field Context applicationContext>
	//    1    3:invokestatic    #224 <Method AppEventsLogger$PersistedEvents AppEventsLogger$PersistedEvents.readAndClearStore(Context)>
	//    2    6:astore_1        
		Iterator iterator = persistedevents.keySet().iterator();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #228 <Method Set AppEventsLogger$PersistedEvents.keySet()>
	//    5   11:invokeinterface #234 <Method Iterator Set.iterator()>
	//    6   16:astore_2        
		int i;
		Object obj;
		for(i = 0; iterator.hasNext(); i += ((List) (obj)).size())
	//*   7   17:iconst_0        
	//*   8   18:istore_0        
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #240 <Method boolean Iterator.hasNext()>
	//*  11   25:ifeq            75
		{
			obj = ((Object) ((AccessTokenAppIdPair)iterator.next()));
	//   12   28:aload_2         
	//   13   29:invokeinterface #243 <Method Object Iterator.next()>
	//   14   34:checkcast       #20  <Class AppEventsLogger$AccessTokenAppIdPair>
	//   15   37:astore          4
			SessionEventsState sessioneventsstate = getSessionEventsState(applicationContext, ((AccessTokenAppIdPair) (obj)));
	//   16   39:getstatic       #168 <Field Context applicationContext>
	//   17   42:aload           4
	//   18   44:invokestatic    #209 <Method AppEventsLogger$SessionEventsState getSessionEventsState(Context, AppEventsLogger$AccessTokenAppIdPair)>
	//   19   47:astore_3        
			obj = ((Object) (persistedevents.getEvents(((AccessTokenAppIdPair) (obj)))));
	//   20   48:aload_1         
	//   21   49:aload           4
	//   22   51:invokevirtual   #247 <Method List AppEventsLogger$PersistedEvents.getEvents(AppEventsLogger$AccessTokenAppIdPair)>
	//   23   54:astore          4
			sessioneventsstate.accumulatePersistedEvents(((List) (obj)));
	//   24   56:aload_3         
	//   25   57:aload           4
	//   26   59:invokevirtual   #250 <Method void AppEventsLogger$SessionEventsState.accumulatePersistedEvents(List)>
		}

	//   27   62:iload_0         
	//   28   63:aload           4
	//   29   65:invokeinterface #255 <Method int List.size()>
	//   30   70:iadd            
	//   31   71:istore_0        
	//*  32   72:goto            19
		return i;
	//   33   75:iload_0         
	//   34   76:ireturn         
	}

	public static void activateApp(Context context)
	{
		FacebookSdk.sdkInitialize(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #262 <Method void FacebookSdk.sdkInitialize(Context)>
		activateApp(context, Utility.getMetadataApplicationId(context));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #163 <Method String Utility.getMetadataApplicationId(Context)>
	//    5    9:invokestatic    #265 <Method void activateApp(Context, String)>
	//    6   12:return          
	}

	public static void activateApp(Context context, String s)
	{
		if(context != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          84
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            84
		{
			if(context instanceof Activity)
	//*   5   11:aload_0         
	//*   6   12:instanceof      #267 <Class Activity>
	//*   7   15:ifeq            28
			{
				setSourceApplication((Activity)context);
	//    8   18:aload_0         
	//    9   19:checkcast       #267 <Class Activity>
	//   10   22:invokestatic    #271 <Method void setSourceApplication(Activity)>
			} else
	//*  11   25:goto            43
			{
				resetSourceApplication();
	//   12   28:invokestatic    #274 <Method void resetSourceApplication()>
				Log.d(((Class) (com/facebook/appevents/AppEventsLogger)).getName(), "To set source application the context of activateApp must be an instance of Activity");
	//   13   31:ldc1            #2   <Class AppEventsLogger>
	//   14   33:invokevirtual   #277 <Method String Class.getName()>
	//   15   36:ldc2            #279 <String "To set source application the context of activateApp must be an instance of Activity">
	//   16   39:invokestatic    #285 <Method int Log.d(String, String)>
	//   17   42:pop             
			}
			FacebookSdk.publishInstallAsync(context, s);
	//   18   43:aload_0         
	//   19   44:aload_1         
	//   20   45:invokestatic    #288 <Method void FacebookSdk.publishInstallAsync(Context, String)>
			context = ((Context) (new AppEventsLogger(context, s, ((AccessToken) (null)))));
	//   21   48:new             #2   <Class AppEventsLogger>
	//   22   51:dup             
	//   23   52:aload_0         
	//   24   53:aload_1         
	//   25   54:aconst_null     
	//   26   55:invokespecial   #290 <Method void AppEventsLogger(Context, String, AccessToken)>
	//   27   58:astore_0        
			long l = System.currentTimeMillis();
	//   28   59:invokestatic    #296 <Method long System.currentTimeMillis()>
	//   29   62:lstore_2        
			s = getSourceApplication();
	//   30   63:invokestatic    #299 <Method String getSourceApplication()>
	//   31   66:astore_1        
			backgroundExecutor.execute(new Runnable(((AppEventsLogger) (context)), l, s) {

				public void run()
				{
					logger.logAppSessionResumeEvent(eventTime, sourceApplicationInfo);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field AppEventsLogger val$logger>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field long val$eventTime>
				//    4    8:aload_0         
				//    5    9:getfield        #25  <Field String val$sourceApplicationInfo>
				//    6   12:invokestatic    #33  <Method void AppEventsLogger.access$100(AppEventsLogger, long, String)>
				//    7   15:return          
				}

				final long val$eventTime;
				final AppEventsLogger val$logger;
				final String val$sourceApplicationInfo;

			
			{
				logger = appeventslogger;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AppEventsLogger val$logger>
				eventTime = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #23  <Field long val$eventTime>
				sourceApplicationInfo = s;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #25  <Field String val$sourceApplicationInfo>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #28  <Method void Object()>
			//   11   20:return          
			}
			}
);
	//   32   67:getstatic       #189 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   33   70:new             #6   <Class AppEventsLogger$1>
	//   34   73:dup             
	//   35   74:aload_0         
	//   36   75:lload_2         
	//   37   76:aload_1         
	//   38   77:invokespecial   #301 <Method void AppEventsLogger$1(AppEventsLogger, long, String)>
	//   39   80:invokevirtual   #307 <Method void ScheduledThreadPoolExecutor.execute(Runnable)>
			return;
	//   40   83:return          
		} else
		{
			throw new IllegalArgumentException("Both context and applicationId must be non-null");
	//   41   84:new             #309 <Class IllegalArgumentException>
	//   42   87:dup             
	//   43   88:ldc2            #311 <String "Both context and applicationId must be non-null">
	//   44   91:invokespecial   #314 <Method void IllegalArgumentException(String)>
	//   45   94:athrow          
		}
	}

	private static FlushStatistics buildAndExecuteRequests(FlushReason flushreason, Set set)
	{
		FlushStatistics flushstatistics = new FlushStatistics();
	//    0    0:new             #40  <Class AppEventsLogger$FlushStatistics>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #319 <Method void AppEventsLogger$FlushStatistics(AppEventsLogger$1)>
	//    4    8:astore_3        
		boolean flag = FacebookSdk.getLimitEventAndDataUsage(applicationContext);
	//    5    9:getstatic       #168 <Field Context applicationContext>
	//    6   12:invokestatic    #323 <Method boolean FacebookSdk.getLimitEventAndDataUsage(Context)>
	//    7   15:istore_2        
		ArrayList arraylist = new ArrayList();
	//    8   16:new             #325 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #326 <Method void ArrayList()>
	//   11   23:astore          4
		set = ((Set) (set.iterator()));
	//   12   25:aload_1         
	//   13   26:invokeinterface #234 <Method Iterator Set.iterator()>
	//   14   31:astore_1        
		do
		{
			if(!((Iterator) (set)).hasNext())
				break;
	//   15   32:aload_1         
	//   16   33:invokeinterface #240 <Method boolean Iterator.hasNext()>
	//   17   38:ifeq            96
			Object obj = ((Object) ((AccessTokenAppIdPair)((Iterator) (set)).next()));
	//   18   41:aload_1         
	//   19   42:invokeinterface #243 <Method Object Iterator.next()>
	//   20   47:checkcast       #20  <Class AppEventsLogger$AccessTokenAppIdPair>
	//   21   50:astore          5
			SessionEventsState sessioneventsstate = getSessionEventsState(((AccessTokenAppIdPair) (obj)));
	//   22   52:aload           5
	//   23   54:invokestatic    #329 <Method AppEventsLogger$SessionEventsState getSessionEventsState(AppEventsLogger$AccessTokenAppIdPair)>
	//   24   57:astore          6
			if(sessioneventsstate != null)
	//*  25   59:aload           6
	//*  26   61:ifnonnull       67
	//*  27   64:goto            32
			{
				obj = ((Object) (buildRequestForSession(((AccessTokenAppIdPair) (obj)), sessioneventsstate, flag, flushstatistics)));
	//   28   67:aload           5
	//   29   69:aload           6
	//   30   71:iload_2         
	//   31   72:aload_3         
	//   32   73:invokestatic    #333 <Method GraphRequest buildRequestForSession(AppEventsLogger$AccessTokenAppIdPair, AppEventsLogger$SessionEventsState, boolean, AppEventsLogger$FlushStatistics)>
	//   33   76:astore          5
				if(obj != null)
	//*  34   78:aload           5
	//*  35   80:ifnull          32
					((List) (arraylist)).add(obj);
	//   36   83:aload           4
	//   37   85:aload           5
	//   38   87:invokeinterface #336 <Method boolean List.add(Object)>
	//   39   92:pop             
			}
		} while(true);
	//   40   93:goto            32
		if(((List) (arraylist)).size() > 0)
	//*  41   96:aload           4
	//*  42   98:invokeinterface #255 <Method int List.size()>
	//*  43  103:ifle            174
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Flushing %d events due to %s.", new Object[] {
				Integer.valueOf(flushstatistics.numEvents), flushreason.toString()
			});
	//   44  106:getstatic       #342 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   45  109:getstatic       #107 <Field String TAG>
	//   46  112:ldc2            #344 <String "Flushing %d events due to %s.">
	//   47  115:iconst_2        
	//   48  116:anewarray       Object[]
	//   49  119:dup             
	//   50  120:iconst_0        
	//   51  121:aload_3         
	//   52  122:getfield        #347 <Field int AppEventsLogger$FlushStatistics.numEvents>
	//   53  125:invokestatic    #353 <Method Integer Integer.valueOf(int)>
	//   54  128:aastore         
	//   55  129:dup             
	//   56  130:iconst_1        
	//   57  131:aload_0         
	//   58  132:invokevirtual   #356 <Method String AppEventsLogger$FlushReason.toString()>
	//   59  135:aastore         
	//   60  136:invokestatic    #362 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
			for(flushreason = ((FlushReason) (((List) (arraylist)).iterator())); ((Iterator) (flushreason)).hasNext(); ((GraphRequest)((Iterator) (flushreason)).next()).executeAndWait());
	//   61  139:aload           4
	//   62  141:invokeinterface #363 <Method Iterator List.iterator()>
	//   63  146:astore_0        
	//   64  147:aload_0         
	//   65  148:invokeinterface #240 <Method boolean Iterator.hasNext()>
	//   66  153:ifeq            172
	//   67  156:aload_0         
	//   68  157:invokeinterface #243 <Method Object Iterator.next()>
	//   69  162:checkcast       #365 <Class GraphRequest>
	//   70  165:invokevirtual   #369 <Method GraphResponse GraphRequest.executeAndWait()>
	//   71  168:pop             
	//*  72  169:goto            147
			return flushstatistics;
	//   73  172:aload_3         
	//   74  173:areturn         
		} else
		{
			return null;
	//   75  174:aconst_null     
	//   76  175:areturn         
		}
	}

	private static GraphRequest buildRequestForSession(AccessTokenAppIdPair accesstokenappidpair, SessionEventsState sessioneventsstate, boolean flag, FlushStatistics flushstatistics)
	{
		Object obj = ((Object) (accesstokenappidpair.getApplicationId()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #372 <Method String AppEventsLogger$AccessTokenAppIdPair.getApplicationId()>
	//    2    4:astore          5
		com.facebook.internal.Utility.FetchedAppSettings fetchedappsettings = Utility.queryAppSettings(((String) (obj)), false);
	//    3    6:aload           5
	//    4    8:iconst_0        
	//    5    9:invokestatic    #376 <Method com.facebook.internal.Utility$FetchedAppSettings Utility.queryAppSettings(String, boolean)>
	//    6   12:astore          7
		GraphRequest graphrequest = GraphRequest.newPostRequest(((AccessToken) (null)), String.format("%s/activities", new Object[] {
			obj
		}), ((JSONObject) (null)), ((com.facebook.GraphRequest.Callback) (null)));
	//    7   14:aconst_null     
	//    8   15:ldc2            #378 <String "%s/activities">
	//    9   18:iconst_1        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload           5
	//   14   26:aastore         
	//   15   27:invokestatic    #382 <Method String String.format(String, Object[])>
	//   16   30:aconst_null     
	//   17   31:aconst_null     
	//   18   32:invokestatic    #386 <Method GraphRequest GraphRequest.newPostRequest(AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
	//   19   35:astore          8
		Bundle bundle = graphrequest.getParameters();
	//   20   37:aload           8
	//   21   39:invokevirtual   #390 <Method Bundle GraphRequest.getParameters()>
	//   22   42:astore          6
		obj = ((Object) (bundle));
	//   23   44:aload           6
	//   24   46:astore          5
		if(bundle == null)
	//*  25   48:aload           6
	//*  26   50:ifnonnull       62
			obj = ((Object) (new Bundle()));
	//   27   53:new             #392 <Class Bundle>
	//   28   56:dup             
	//   29   57:invokespecial   #393 <Method void Bundle()>
	//   30   60:astore          5
		((Bundle) (obj)).putString("access_token", accesstokenappidpair.getAccessTokenString());
	//   31   62:aload           5
	//   32   64:ldc2            #395 <String "access_token">
	//   33   67:aload_0         
	//   34   68:invokevirtual   #398 <Method String AppEventsLogger$AccessTokenAppIdPair.getAccessTokenString()>
	//   35   71:invokevirtual   #401 <Method void Bundle.putString(String, String)>
		graphrequest.setParameters(((Bundle) (obj)));
	//   36   74:aload           8
	//   37   76:aload           5
	//   38   78:invokevirtual   #405 <Method void GraphRequest.setParameters(Bundle)>
		if(fetchedappsettings == null)
	//*  39   81:aload           7
	//*  40   83:ifnonnull       88
			return null;
	//   41   86:aconst_null     
	//   42   87:areturn         
		int i = sessioneventsstate.populateRequest(graphrequest, fetchedappsettings.supportsImplicitLogging(), flag);
	//   43   88:aload_1         
	//   44   89:aload           8
	//   45   91:aload           7
	//   46   93:invokevirtual   #410 <Method boolean com.facebook.internal.Utility$FetchedAppSettings.supportsImplicitLogging()>
	//   47   96:iload_2         
	//   48   97:invokevirtual   #414 <Method int AppEventsLogger$SessionEventsState.populateRequest(GraphRequest, boolean, boolean)>
	//   49  100:istore          4
		if(i == 0)
	//*  50  102:iload           4
	//*  51  104:ifne            109
		{
			return null;
	//   52  107:aconst_null     
	//   53  108:areturn         
		} else
		{
			flushstatistics.numEvents = flushstatistics.numEvents + i;
	//   54  109:aload_3         
	//   55  110:aload_3         
	//   56  111:getfield        #347 <Field int AppEventsLogger$FlushStatistics.numEvents>
	//   57  114:iload           4
	//   58  116:iadd            
	//   59  117:putfield        #347 <Field int AppEventsLogger$FlushStatistics.numEvents>
			graphrequest.setCallback(new com.facebook.GraphRequest.Callback(accesstokenappidpair, graphrequest, sessioneventsstate, flushstatistics) {

				public void onCompleted(GraphResponse graphresponse)
				{
					AppEventsLogger.handleResponse(accessTokenAppId, postRequest, graphresponse, sessionEventsState, flushState);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field AppEventsLogger$AccessTokenAppIdPair val$accessTokenAppId>
				//    2    4:aload_0         
				//    3    5:getfield        #25  <Field GraphRequest val$postRequest>
				//    4    8:aload_1         
				//    5    9:aload_0         
				//    6   10:getfield        #27  <Field AppEventsLogger$SessionEventsState val$sessionEventsState>
				//    7   13:aload_0         
				//    8   14:getfield        #29  <Field AppEventsLogger$FlushStatistics val$flushState>
				//    9   17:invokestatic    #39  <Method void AppEventsLogger.access$900(AppEventsLogger$AccessTokenAppIdPair, GraphRequest, GraphResponse, AppEventsLogger$SessionEventsState, AppEventsLogger$FlushStatistics)>
				//   10   20:return          
				}

				final AccessTokenAppIdPair val$accessTokenAppId;
				final FlushStatistics val$flushState;
				final GraphRequest val$postRequest;
				final SessionEventsState val$sessionEventsState;

			
			{
				accessTokenAppId = accesstokenappidpair;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AppEventsLogger$AccessTokenAppIdPair val$accessTokenAppId>
				postRequest = graphrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field GraphRequest val$postRequest>
				sessionEventsState = sessioneventsstate;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field AppEventsLogger$SessionEventsState val$sessionEventsState>
				flushState = flushstatistics;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field AppEventsLogger$FlushStatistics val$flushState>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   60  120:aload           8
	//   61  122:new             #18  <Class AppEventsLogger$7>
	//   62  125:dup             
	//   63  126:aload_0         
	//   64  127:aload           8
	//   65  129:aload_1         
	//   66  130:aload_3         
	//   67  131:invokespecial   #417 <Method void AppEventsLogger$7(AppEventsLogger$AccessTokenAppIdPair, GraphRequest, AppEventsLogger$SessionEventsState, AppEventsLogger$FlushStatistics)>
	//   68  134:invokevirtual   #421 <Method void GraphRequest.setCallback(com.facebook.GraphRequest$Callback)>
			return graphrequest;
	//   69  137:aload           8
	//   70  139:areturn         
		}
	}

	public static void deactivateApp(Context context)
	{
		deactivateApp(context, Utility.getMetadataApplicationId(context));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #163 <Method String Utility.getMetadataApplicationId(Context)>
	//    3    5:invokestatic    #424 <Method void deactivateApp(Context, String)>
	//    4    8:return          
	}

	public static void deactivateApp(Context context, String s)
	{
		if(context != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          45
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            45
		{
			resetSourceApplication();
	//    5   11:invokestatic    #274 <Method void resetSourceApplication()>
			context = ((Context) (new AppEventsLogger(context, s, ((AccessToken) (null)))));
	//    6   14:new             #2   <Class AppEventsLogger>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aconst_null     
	//   11   21:invokespecial   #290 <Method void AppEventsLogger(Context, String, AccessToken)>
	//   12   24:astore_0        
			long l = System.currentTimeMillis();
	//   13   25:invokestatic    #296 <Method long System.currentTimeMillis()>
	//   14   28:lstore_2        
			backgroundExecutor.execute(new Runnable(((AppEventsLogger) (context)), l) {

				public void run()
				{
					logger.logAppSessionSuspendEvent(eventTime);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AppEventsLogger val$logger>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field long val$eventTime>
				//    4    8:invokestatic    #29  <Method void AppEventsLogger.access$200(AppEventsLogger, long)>
				//    5   11:return          
				}

				final long val$eventTime;
				final AppEventsLogger val$logger;

			
			{
				logger = appeventslogger;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppEventsLogger val$logger>
				eventTime = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #21  <Field long val$eventTime>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   15   29:getstatic       #189 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   16   32:new             #8   <Class AppEventsLogger$2>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:lload_2         
	//   20   38:invokespecial   #426 <Method void AppEventsLogger$2(AppEventsLogger, long)>
	//   21   41:invokevirtual   #307 <Method void ScheduledThreadPoolExecutor.execute(Runnable)>
			return;
	//   22   44:return          
		} else
		{
			throw new IllegalArgumentException("Both context and applicationId must be non-null");
	//   23   45:new             #309 <Class IllegalArgumentException>
	//   24   48:dup             
	//   25   49:ldc2            #311 <String "Both context and applicationId must be non-null">
	//   26   52:invokespecial   #314 <Method void IllegalArgumentException(String)>
	//   27   55:athrow          
		}
	}

	static void eagerFlush()
	{
		if(getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY)
	//*   0    0:invokestatic    #431 <Method AppEventsLogger$FlushBehavior getFlushBehavior()>
	//*   1    3:getstatic       #434 <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*   2    6:if_acmpeq       15
			flush(FlushReason.EAGER_FLUSHING_EVENT);
	//    3    9:getstatic       #438 <Field AppEventsLogger$FlushReason AppEventsLogger$FlushReason.EAGER_FLUSHING_EVENT>
	//    4   12:invokestatic    #441 <Method void flush(AppEventsLogger$FlushReason)>
	//    5   15:return          
	}

	private static void flush(FlushReason flushreason)
	{
		FacebookSdk.getExecutor().execute(new Runnable(flushreason) {

			public void run()
			{
				AppEventsLogger.flushAndWait(reason);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field AppEventsLogger$FlushReason val$reason>
			//    2    4:invokestatic    #24  <Method void AppEventsLogger.access$300(AppEventsLogger$FlushReason)>
			//    3    7:return          
			}

			final FlushReason val$reason;

			
			{
				reason = flushreason;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppEventsLogger$FlushReason val$reason>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:invokestatic    #445 <Method Executor FacebookSdk.getExecutor()>
	//    1    3:new             #16  <Class AppEventsLogger$6>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #447 <Method void AppEventsLogger$6(AppEventsLogger$FlushReason)>
	//    5   11:invokeinterface #450 <Method void Executor.execute(Runnable)>
	//    6   16:return          
	}

	private static void flushAndWait(FlushReason flushreason)
	{
label0:
		{
			synchronized(staticLock)
	//*   0    0:getstatic       #122 <Field Object staticLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
			{
				if(!requestInFlight)
					break label0;
	//    4    6:getstatic       #454 <Field boolean requestInFlight>
	//    5    9:ifeq            15
			}
	//    6   12:aload_1         
	//    7   13:monitorexit     
			return;
	//    8   14:return          
		}
		HashSet hashset;
		requestInFlight = true;
	//    9   15:iconst_1        
	//   10   16:putstatic       #454 <Field boolean requestInFlight>
		hashset = new HashSet(((Collection) (stateMap.keySet())));
	//   11   19:new             #456 <Class HashSet>
	//   12   22:dup             
	//   13   23:getstatic       #114 <Field Map stateMap>
	//   14   26:invokeinterface #459 <Method Set Map.keySet()>
	//   15   31:invokespecial   #462 <Method void HashSet(Collection)>
	//   16   34:astore_2        
		obj;
	//   17   35:aload_1         
		JVM INSTR monitorexit ;
	//   18   36:monitorexit     
		accumulatePersistedEvents();
	//   19   37:invokestatic    #464 <Method int accumulatePersistedEvents()>
	//   20   40:pop             
		try
		{
			flushreason = ((FlushReason) (buildAndExecuteRequests(flushreason, ((Set) (hashset)))));
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokestatic    #466 <Method AppEventsLogger$FlushStatistics buildAndExecuteRequests(AppEventsLogger$FlushReason, Set)>
	//   24   46:astore_0        
		}
	//*  25   47:goto            63
		// Misplaced declaration of an exception variable
		catch(FlushReason flushreason)
	//*  26   50:astore_0        
		{
			Utility.logd(TAG, "Caught unexpected exception while flushing: ", ((Throwable) (flushreason)));
	//   27   51:getstatic       #107 <Field String TAG>
	//   28   54:ldc2            #468 <String "Caught unexpected exception while flushing: ">
	//   29   57:aload_0         
	//   30   58:invokestatic    #472 <Method void Utility.logd(String, String, Throwable)>
			flushreason = null;
	//   31   61:aconst_null     
	//   32   62:astore_0        
		}
		synchronized(staticLock)
	//*  33   63:getstatic       #122 <Field Object staticLock>
	//*  34   66:astore_1        
	//*  35   67:aload_1         
	//*  36   68:monitorenter    
		{
			requestInFlight = false;
	//   37   69:iconst_0        
	//   38   70:putstatic       #454 <Field boolean requestInFlight>
		}
	//   39   73:aload_1         
	//   40   74:monitorexit     
		if(flushreason != null)
	//*  41   75:aload_0         
	//*  42   76:ifnull          122
		{
			obj = ((Object) (new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED")));
	//   43   79:new             #474 <Class Intent>
	//   44   82:dup             
	//   45   83:ldc1            #56  <String "com.facebook.sdk.APP_EVENTS_FLUSHED">
	//   46   85:invokespecial   #475 <Method void Intent(String)>
	//   47   88:astore_1        
			((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", ((FlushStatistics) (flushreason)).numEvents);
	//   48   89:aload_1         
	//   49   90:ldc1            #62  <String "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED">
	//   50   92:aload_0         
	//   51   93:getfield        #347 <Field int AppEventsLogger$FlushStatistics.numEvents>
	//   52   96:invokevirtual   #479 <Method Intent Intent.putExtra(String, int)>
	//   53   99:pop             
			((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ((Serializable) (((FlushStatistics) (flushreason)).result)));
	//   54  100:aload_1         
	//   55  101:ldc1            #59  <String "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT">
	//   56  103:aload_0         
	//   57  104:getfield        #483 <Field AppEventsLogger$FlushResult AppEventsLogger$FlushStatistics.result>
	//   58  107:invokevirtual   #486 <Method Intent Intent.putExtra(String, Serializable)>
	//   59  110:pop             
			LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(((Intent) (obj)));
	//   60  111:getstatic       #168 <Field Context applicationContext>
	//   61  114:invokestatic    #492 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   62  117:aload_1         
	//   63  118:invokevirtual   #496 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   64  121:pop             
		}
		return;
	//   65  122:return          
		flushreason;
	//   66  123:astore_0        
		obj;
	//   67  124:aload_1         
		JVM INSTR monitorexit ;
	//   68  125:monitorexit     
		throw flushreason;
	//   69  126:aload_0         
	//   70  127:athrow          
		flushreason;
	//   71  128:astore_0        
		obj;
	//   72  129:aload_1         
		JVM INSTR monitorexit ;
	//   73  130:monitorexit     
		throw flushreason;
	//   74  131:aload_0         
	//   75  132:athrow          
	}

	private static void flushIfNecessary()
	{
		synchronized(staticLock)
	//*   0    0:getstatic       #122 <Field Object staticLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY && getAccumulatedEventCount() > 100)
	//*   4    6:invokestatic    #431 <Method AppEventsLogger$FlushBehavior getFlushBehavior()>
	//*   5    9:getstatic       #434 <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*   6   12:if_acmpeq       29
	//*   7   15:invokestatic    #499 <Method int getAccumulatedEventCount()>
	//*   8   18:bipush          100
	//*   9   20:icmple          29
				flush(FlushReason.EVENT_THRESHOLD);
	//   10   23:getstatic       #502 <Field AppEventsLogger$FlushReason AppEventsLogger$FlushReason.EVENT_THRESHOLD>
	//   11   26:invokestatic    #441 <Method void flush(AppEventsLogger$FlushReason)>
		}
	//   12   29:aload_0         
	//   13   30:monitorexit     
		return;
	//   14   31:return          
		exception;
	//   15   32:astore_1        
		obj;
	//   16   33:aload_0         
		JVM INSTR monitorexit ;
	//   17   34:monitorexit     
		throw exception;
	//   18   35:aload_1         
	//   19   36:athrow          
	}

	private static int getAccumulatedEventCount()
	{
		Object obj = staticLock;
	//    0    0:getstatic       #122 <Field Object staticLock>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		int i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_0        
		for(Iterator iterator = stateMap.values().iterator(); iterator.hasNext();)
	//*   6    8:getstatic       #114 <Field Map stateMap>
	//*   7   11:invokeinterface #506 <Method Collection Map.values()>
	//*   8   16:invokeinterface #509 <Method Iterator Collection.iterator()>
	//*   9   21:astore_2        
	//*  10   22:aload_2         
	//*  11   23:invokeinterface #240 <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            49
			i += ((SessionEventsState)iterator.next()).getAccumulatedEventCount();
	//   13   31:iload_0         
	//   14   32:aload_2         
	//   15   33:invokeinterface #243 <Method Object Iterator.next()>
	//   16   38:checkcast       #51  <Class AppEventsLogger$SessionEventsState>
	//   17   41:invokevirtual   #510 <Method int AppEventsLogger$SessionEventsState.getAccumulatedEventCount()>
	//   18   44:iadd            
	//   19   45:istore_0        

	//*  20   46:goto            22
		obj;
	//   21   49:aload_1         
		JVM INSTR monitorexit ;
	//   22   50:monitorexit     
		return i;
	//   23   51:iload_0         
	//   24   52:ireturn         
		Exception exception;
		exception;
	//   25   53:astore_2        
		obj;
	//   26   54:aload_1         
		JVM INSTR monitorexit ;
	//   27   55:monitorexit     
		throw exception;
	//   28   56:aload_2         
	//   29   57:athrow          
	}

	public static String getAnonymousAppDeviceGUID(Context context)
	{
		if(anonymousAppDeviceGUID == null)
	//*   0    0:getstatic       #513 <Field String anonymousAppDeviceGUID>
	//*   1    3:ifnonnull       115
			synchronized(staticLock)
	//*   2    6:getstatic       #122 <Field Object staticLock>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:monitorenter    
			{
				if(anonymousAppDeviceGUID == null)
	//*   6   12:getstatic       #513 <Field String anonymousAppDeviceGUID>
	//*   7   15:ifnonnull       105
				{
					anonymousAppDeviceGUID = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", ((String) (null)));
	//    8   18:aload_0         
	//    9   19:ldc1            #65  <String "com.facebook.sdk.appEventPreferences">
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #517 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   25:ldc2            #518 <String "anonymousAppDeviceGUID">
	//   13   28:aconst_null     
	//   14   29:invokeinterface #524 <Method String SharedPreferences.getString(String, String)>
	//   15   34:putstatic       #513 <Field String anonymousAppDeviceGUID>
					if(anonymousAppDeviceGUID == null)
	//*  16   37:getstatic       #513 <Field String anonymousAppDeviceGUID>
	//*  17   40:ifnonnull       105
					{
						StringBuilder stringbuilder = new StringBuilder();
	//   18   43:new             #526 <Class StringBuilder>
	//   19   46:dup             
	//   20   47:invokespecial   #527 <Method void StringBuilder()>
	//   21   50:astore_2        
						stringbuilder.append("XZ");
	//   22   51:aload_2         
	//   23   52:ldc2            #529 <String "XZ">
	//   24   55:invokevirtual   #533 <Method StringBuilder StringBuilder.append(String)>
	//   25   58:pop             
						stringbuilder.append(UUID.randomUUID().toString());
	//   26   59:aload_2         
	//   27   60:invokestatic    #539 <Method UUID UUID.randomUUID()>
	//   28   63:invokevirtual   #540 <Method String UUID.toString()>
	//   29   66:invokevirtual   #533 <Method StringBuilder StringBuilder.append(String)>
	//   30   69:pop             
						anonymousAppDeviceGUID = stringbuilder.toString();
	//   31   70:aload_2         
	//   32   71:invokevirtual   #541 <Method String StringBuilder.toString()>
	//   33   74:putstatic       #513 <Field String anonymousAppDeviceGUID>
						context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", anonymousAppDeviceGUID).apply();
	//   34   77:aload_0         
	//   35   78:ldc1            #65  <String "com.facebook.sdk.appEventPreferences">
	//   36   80:iconst_0        
	//   37   81:invokevirtual   #517 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   38   84:invokeinterface #545 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   39   89:ldc2            #518 <String "anonymousAppDeviceGUID">
	//   40   92:getstatic       #513 <Field String anonymousAppDeviceGUID>
	//   41   95:invokeinterface #550 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   42  100:invokeinterface #553 <Method void android.content.SharedPreferences$Editor.apply()>
					}
				}
			}
	//   43  105:aload_1         
	//   44  106:monitorexit     
		break MISSING_BLOCK_LABEL_115;
	//   45  107:goto            115
		context;
	//   46  110:astore_0        
		obj;
	//   47  111:aload_1         
		JVM INSTR monitorexit ;
	//   48  112:monitorexit     
		throw context;
	//   49  113:aload_0         
	//   50  114:athrow          
		return anonymousAppDeviceGUID;
	//   51  115:getstatic       #513 <Field String anonymousAppDeviceGUID>
	//   52  118:areturn         
	}

	public static FlushBehavior getFlushBehavior()
	{
		FlushBehavior flushbehavior;
		synchronized(staticLock)
	//*   0    0:getstatic       #122 <Field Object staticLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			flushbehavior = flushBehavior;
	//    4    6:getstatic       #119 <Field AppEventsLogger$FlushBehavior flushBehavior>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return flushbehavior;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	private static SessionEventsState getSessionEventsState(Context context, AccessTokenAppIdPair accesstokenappidpair)
	{
		AttributionIdentifiers attributionidentifiers;
		if((SessionEventsState)stateMap.get(((Object) (accesstokenappidpair))) == null)
	//*   0    0:getstatic       #114 <Field Map stateMap>
	//*   1    3:aload_1         
	//*   2    4:invokeinterface #557 <Method Object Map.get(Object)>
	//*   3    9:checkcast       #51  <Class AppEventsLogger$SessionEventsState>
	//*   4   12:ifnonnull       23
			attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
	//    5   15:aload_0         
	//    6   16:invokestatic    #563 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//    7   19:astore_2        
		else
	//*   8   20:goto            25
			attributionidentifiers = null;
	//    9   23:aconst_null     
	//   10   24:astore_2        
		Object obj = staticLock;
	//   11   25:getstatic       #122 <Field Object staticLock>
	//   12   28:astore          5
		obj;
	//   13   30:aload           5
		JVM INSTR monitorenter ;
	//   14   32:monitorenter    
		SessionEventsState sessioneventsstate1 = (SessionEventsState)stateMap.get(((Object) (accesstokenappidpair)));
	//   15   33:getstatic       #114 <Field Map stateMap>
	//   16   36:aload_1         
	//   17   37:invokeinterface #557 <Method Object Map.get(Object)>
	//   18   42:checkcast       #51  <Class AppEventsLogger$SessionEventsState>
	//   19   45:astore          4
		SessionEventsState sessioneventsstate;
		sessioneventsstate = sessioneventsstate1;
	//   20   47:aload           4
	//   21   49:astore_3        
		if(sessioneventsstate1 != null)
			break MISSING_BLOCK_LABEL_83;
	//   22   50:aload           4
	//   23   52:ifnonnull       83
		sessioneventsstate = new SessionEventsState(attributionidentifiers, context.getPackageName(), getAnonymousAppDeviceGUID(context));
	//   24   55:new             #51  <Class AppEventsLogger$SessionEventsState>
	//   25   58:dup             
	//   26   59:aload_2         
	//   27   60:aload_0         
	//   28   61:invokevirtual   #566 <Method String Context.getPackageName()>
	//   29   64:aload_0         
	//   30   65:invokestatic    #568 <Method String getAnonymousAppDeviceGUID(Context)>
	//   31   68:invokespecial   #571 <Method void AppEventsLogger$SessionEventsState(AttributionIdentifiers, String, String)>
	//   32   71:astore_3        
		stateMap.put(((Object) (accesstokenappidpair)), ((Object) (sessioneventsstate)));
	//   33   72:getstatic       #114 <Field Map stateMap>
	//   34   75:aload_1         
	//   35   76:aload_3         
	//   36   77:invokeinterface #575 <Method Object Map.put(Object, Object)>
	//   37   82:pop             
		obj;
	//   38   83:aload           5
		JVM INSTR monitorexit ;
	//   39   85:monitorexit     
		return sessioneventsstate;
	//   40   86:aload_3         
	//   41   87:areturn         
		context;
	//   42   88:astore_0        
		obj;
	//   43   89:aload           5
		JVM INSTR monitorexit ;
	//   44   91:monitorexit     
		throw context;
	//   45   92:aload_0         
	//   46   93:athrow          
	}

	private static SessionEventsState getSessionEventsState(AccessTokenAppIdPair accesstokenappidpair)
	{
		synchronized(staticLock)
	//*   0    0:getstatic       #122 <Field Object staticLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			accesstokenappidpair = ((AccessTokenAppIdPair) ((SessionEventsState)stateMap.get(((Object) (accesstokenappidpair)))));
	//    4    6:getstatic       #114 <Field Map stateMap>
	//    5    9:aload_0         
	//    6   10:invokeinterface #557 <Method Object Map.get(Object)>
	//    7   15:checkcast       #51  <Class AppEventsLogger$SessionEventsState>
	//    8   18:astore_0        
		}
	//    9   19:aload_1         
	//   10   20:monitorexit     
		return ((SessionEventsState) (accesstokenappidpair));
	//   11   21:aload_0         
	//   12   22:areturn         
		accesstokenappidpair;
	//   13   23:astore_0        
		obj;
	//   14   24:aload_1         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		throw accesstokenappidpair;
	//   16   26:aload_0         
	//   17   27:athrow          
	}

	static String getSourceApplication()
	{
		String s = "Unclassified";
	//    0    0:ldc2            #577 <String "Unclassified">
	//    1    3:astore_0        
		if(isOpenedByApplink)
	//*   2    4:getstatic       #579 <Field boolean isOpenedByApplink>
	//*   3    7:ifeq            14
			s = "Applink";
	//    4   10:ldc2            #581 <String "Applink">
	//    5   13:astore_0        
		if(sourceApplication != null)
	//*   6   14:getstatic       #583 <Field String sourceApplication>
	//*   7   17:ifnull          63
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   20:new             #526 <Class StringBuilder>
	//    9   23:dup             
	//   10   24:invokespecial   #527 <Method void StringBuilder()>
	//   11   27:astore_1        
			stringbuilder.append(s);
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:invokevirtual   #533 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append("(");
	//   16   34:aload_1         
	//   17   35:ldc2            #585 <String "(">
	//   18   38:invokevirtual   #533 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			stringbuilder.append(sourceApplication);
	//   20   42:aload_1         
	//   21   43:getstatic       #583 <Field String sourceApplication>
	//   22   46:invokevirtual   #533 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			stringbuilder.append(")");
	//   24   50:aload_1         
	//   25   51:ldc2            #587 <String ")">
	//   26   54:invokevirtual   #533 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			return stringbuilder.toString();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #541 <Method String StringBuilder.toString()>
	//   30   62:areturn         
		} else
		{
			return s;
	//   31   63:aload_0         
	//   32   64:areturn         
		}
	}

	private static void handleResponse(AccessTokenAppIdPair accesstokenappidpair, GraphRequest graphrequest, GraphResponse graphresponse, SessionEventsState sessioneventsstate, FlushStatistics flushstatistics)
	{
		FacebookRequestError facebookrequesterror = graphresponse.getError();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #595 <Method FacebookRequestError GraphResponse.getError()>
	//    2    4:astore          8
		String s = "Success";
	//    3    6:ldc2            #597 <String "Success">
	//    4    9:astore          6
		FlushResult flushresult = FlushResult.SUCCESS;
	//    5   11:getstatic       #600 <Field AppEventsLogger$FlushResult AppEventsLogger$FlushResult.SUCCESS>
	//    6   14:astore          7
		boolean flag = true;
	//    7   16:iconst_1        
	//    8   17:istore          5
		if(facebookrequesterror != null)
	//*   9   19:aload           8
	//*  10   21:ifnull          78
			if(facebookrequesterror.getErrorCode() == -1)
	//*  11   24:aload           8
	//*  12   26:invokevirtual   #605 <Method int FacebookRequestError.getErrorCode()>
	//*  13   29:iconst_m1       
	//*  14   30:icmpne          46
			{
				s = "Failed: No Connectivity";
	//   15   33:ldc2            #607 <String "Failed: No Connectivity">
	//   16   36:astore          6
				flushresult = FlushResult.NO_CONNECTIVITY;
	//   17   38:getstatic       #610 <Field AppEventsLogger$FlushResult AppEventsLogger$FlushResult.NO_CONNECTIVITY>
	//   18   41:astore          7
			} else
	//*  19   43:goto            78
			{
				s = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] {
					graphresponse.toString(), facebookrequesterror.toString()
				});
	//   20   46:ldc2            #612 <String "Failed:\n  Response: %s\n  Error %s">
	//   21   49:iconst_2        
	//   22   50:anewarray       Object[]
	//   23   53:dup             
	//   24   54:iconst_0        
	//   25   55:aload_2         
	//   26   56:invokevirtual   #613 <Method String GraphResponse.toString()>
	//   27   59:aastore         
	//   28   60:dup             
	//   29   61:iconst_1        
	//   30   62:aload           8
	//   31   64:invokevirtual   #614 <Method String FacebookRequestError.toString()>
	//   32   67:aastore         
	//   33   68:invokestatic    #382 <Method String String.format(String, Object[])>
	//   34   71:astore          6
				flushresult = FlushResult.SERVER_ERROR;
	//   35   73:getstatic       #617 <Field AppEventsLogger$FlushResult AppEventsLogger$FlushResult.SERVER_ERROR>
	//   36   76:astore          7
			}
		if(FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.APP_EVENTS))
	//*  37   78:getstatic       #342 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//*  38   81:invokestatic    #621 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*  39   84:ifeq            150
		{
			graphresponse = ((GraphResponse) ((String)graphrequest.getTag()));
	//   40   87:aload_1         
	//   41   88:invokevirtual   #624 <Method Object GraphRequest.getTag()>
	//   42   91:checkcast       #151 <Class String>
	//   43   94:astore_2        
			try
			{
				graphresponse = ((GraphResponse) ((new JSONArray(((String) (graphresponse)))).toString(2)));
	//   44   95:new             #626 <Class JSONArray>
	//   45   98:dup             
	//   46   99:aload_2         
	//   47  100:invokespecial   #627 <Method void JSONArray(String)>
	//   48  103:iconst_2        
	//   49  104:invokevirtual   #630 <Method String JSONArray.toString(int)>
	//   50  107:astore_2        
			}
	//*  51  108:goto            115
	//*  52  111:ldc2            #632 <String "<Can't encode events for debug logging>">
	//*  53  114:astore_2        
	//*  54  115:getstatic       #342 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//*  55  118:getstatic       #107 <Field String TAG>
	//*  56  121:ldc2            #634 <String "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s">
	//*  57  124:iconst_3        
	//*  58  125:anewarray       Object[]
	//*  59  128:dup             
	//*  60  129:iconst_0        
	//*  61  130:aload_1         
	//*  62  131:invokevirtual   #638 <Method JSONObject GraphRequest.getGraphObject()>
	//*  63  134:invokevirtual   #641 <Method String JSONObject.toString()>
	//*  64  137:aastore         
	//*  65  138:dup             
	//*  66  139:iconst_1        
	//*  67  140:aload           6
	//*  68  142:aastore         
	//*  69  143:dup             
	//*  70  144:iconst_2        
	//*  71  145:aload_2         
	//*  72  146:aastore         
	//*  73  147:invokestatic    #362 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
	//*  74  150:aload           8
	//*  75  152:ifnull          158
	//*  76  155:goto            161
	//*  77  158:iconst_0        
	//*  78  159:istore          5
	//*  79  161:aload_3         
	//*  80  162:iload           5
	//*  81  164:invokevirtual   #645 <Method void AppEventsLogger$SessionEventsState.clearInFlightAndStats(boolean)>
	//*  82  167:aload           7
	//*  83  169:getstatic       #610 <Field AppEventsLogger$FlushResult AppEventsLogger$FlushResult.NO_CONNECTIVITY>
	//*  84  172:if_acmpne       183
	//*  85  175:getstatic       #168 <Field Context applicationContext>
	//*  86  178:aload_0         
	//*  87  179:aload_3         
	//*  88  180:invokestatic    #649 <Method void AppEventsLogger$PersistedEvents.persistEvents(Context, AppEventsLogger$AccessTokenAppIdPair, AppEventsLogger$SessionEventsState)>
	//*  89  183:aload           7
	//*  90  185:getstatic       #600 <Field AppEventsLogger$FlushResult AppEventsLogger$FlushResult.SUCCESS>
	//*  91  188:if_acmpeq       209
	//*  92  191:aload           4
	//*  93  193:getfield        #483 <Field AppEventsLogger$FlushResult AppEventsLogger$FlushStatistics.result>
	//*  94  196:getstatic       #610 <Field AppEventsLogger$FlushResult AppEventsLogger$FlushResult.NO_CONNECTIVITY>
	//*  95  199:if_acmpeq       209
	//*  96  202:aload           4
	//*  97  204:aload           7
	//*  98  206:putfield        #483 <Field AppEventsLogger$FlushResult AppEventsLogger$FlushStatistics.result>
	//*  99  209:return          
			// Misplaced declaration of an exception variable
			catch(GraphResponse graphresponse)
			{
				graphresponse = "<Can't encode events for debug logging>";
			}
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] {
				graphrequest.getGraphObject().toString(), s, graphresponse
			});
		}
		if(facebookrequesterror == null)
			flag = false;
		sessioneventsstate.clearInFlightAndStats(flag);
		if(flushresult == FlushResult.NO_CONNECTIVITY)
			PersistedEvents.persistEvents(applicationContext, accesstokenappidpair, sessioneventsstate);
		if(flushresult != FlushResult.SUCCESS && flushstatistics.result != FlushResult.NO_CONNECTIVITY)
			flushstatistics.result = flushresult;
	//* 100  210:astore_2        
	//* 101  211:goto            111
	}

	private static void initializeTimersIfNeeded()
	{
label0:
		{
			synchronized(staticLock)
	//*   0    0:getstatic       #122 <Field Object staticLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
			{
				if(backgroundExecutor == null)
					break label0;
	//    4    6:getstatic       #189 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//    5    9:ifnull          15
			}
	//    6   12:aload_0         
	//    7   13:monitorexit     
			return;
	//    8   14:return          
		}
		backgroundExecutor = new ScheduledThreadPoolExecutor(1);
	//    9   15:new             #303 <Class ScheduledThreadPoolExecutor>
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:invokespecial   #652 <Method void ScheduledThreadPoolExecutor(int)>
	//   13   23:putstatic       #189 <Field ScheduledThreadPoolExecutor backgroundExecutor>
		obj;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		obj = ((Object) (new Runnable() {

			public void run()
			{
				if(AppEventsLogger.getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY)
			//*   0    0:invokestatic    #20  <Method AppEventsLogger$FlushBehavior AppEventsLogger.getFlushBehavior()>
			//*   1    3:getstatic       #26  <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
			//*   2    6:if_acmpeq       15
					AppEventsLogger.flushAndWait(FlushReason.TIMER);
			//    3    9:getstatic       #32  <Field AppEventsLogger$FlushReason AppEventsLogger$FlushReason.TIMER>
			//    4   12:invokestatic    #36  <Method void AppEventsLogger.access$300(AppEventsLogger$FlushReason)>
			//    5   15:return          
			}

		}
));
	//   16   28:new             #10  <Class AppEventsLogger$3>
	//   17   31:dup             
	//   18   32:invokespecial   #653 <Method void AppEventsLogger$3()>
	//   19   35:astore_0        
		backgroundExecutor.scheduleAtFixedRate(((Runnable) (obj)), 0L, 15L, TimeUnit.SECONDS);
	//   20   36:getstatic       #189 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   21   39:aload_0         
	//   22   40:lconst_0        
	//   23   41:ldc2w           #654 <Long 15L>
	//   24   44:getstatic       #661 <Field TimeUnit TimeUnit.SECONDS>
	//   25   47:invokevirtual   #665 <Method java.util.concurrent.ScheduledFuture ScheduledThreadPoolExecutor.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//   26   50:pop             
		obj = ((Object) (new Runnable() {

			public void run()
			{
				HashSet hashset = new HashSet();
			//    0    0:new             #18  <Class HashSet>
			//    1    3:dup             
			//    2    4:invokespecial   #19  <Method void HashSet()>
			//    3    7:astore_2        
				Object obj1 = AppEventsLogger.staticLock;
			//    4    8:invokestatic    #23  <Method Object AppEventsLogger.access$400()>
			//    5   11:astore_1        
				obj1;
			//    6   12:aload_1         
				JVM INSTR monitorenter ;
			//    7   13:monitorenter    
				for(Iterator iterator = AppEventsLogger.stateMap.keySet().iterator(); iterator.hasNext(); ((Set) (hashset)).add(((Object) (((AccessTokenAppIdPair)iterator.next()).getApplicationId()))));
			//    8   14:invokestatic    #27  <Method Map AppEventsLogger.access$500()>
			//    9   17:invokeinterface #33  <Method Set Map.keySet()>
			//   10   22:invokeinterface #39  <Method Iterator Set.iterator()>
			//   11   27:astore_3        
			//   12   28:aload_3         
			//   13   29:invokeinterface #45  <Method boolean Iterator.hasNext()>
			//   14   34:ifeq            59
			//   15   37:aload_2         
			//   16   38:aload_3         
			//   17   39:invokeinterface #48  <Method Object Iterator.next()>
			//   18   44:checkcast       #50  <Class AppEventsLogger$AccessTokenAppIdPair>
			//   19   47:invokevirtual   #54  <Method String AppEventsLogger$AccessTokenAppIdPair.getApplicationId()>
			//   20   50:invokeinterface #58  <Method boolean Set.add(Object)>
			//   21   55:pop             
			//*  22   56:goto            28
				obj1;
			//   23   59:aload_1         
				JVM INSTR monitorexit ;
			//   24   60:monitorexit     
				for(obj1 = ((Object) (((Set) (hashset)).iterator())); ((Iterator) (obj1)).hasNext(); Utility.queryAppSettings((String)((Iterator) (obj1)).next(), true));
			//   25   61:aload_2         
			//   26   62:invokeinterface #39  <Method Iterator Set.iterator()>
			//   27   67:astore_1        
			//   28   68:aload_1         
			//   29   69:invokeinterface #45  <Method boolean Iterator.hasNext()>
			//   30   74:ifeq            94
			//   31   77:aload_1         
			//   32   78:invokeinterface #48  <Method Object Iterator.next()>
			//   33   83:checkcast       #60  <Class String>
			//   34   86:iconst_1        
			//   35   87:invokestatic    #66  <Method com.facebook.internal.Utility$FetchedAppSettings Utility.queryAppSettings(String, boolean)>
			//   36   90:pop             
			//*  37   91:goto            68
				return;
			//   38   94:return          
				Exception exception1;
				exception1;
			//   39   95:astore_2        
				obj1;
			//   40   96:aload_1         
				JVM INSTR monitorexit ;
			//   41   97:monitorexit     
				throw exception1;
			//   42   98:aload_2         
			//   43   99:athrow          
			}

		}
));
	//   27   51:new             #12  <Class AppEventsLogger$4>
	//   28   54:dup             
	//   29   55:invokespecial   #666 <Method void AppEventsLogger$4()>
	//   30   58:astore_0        
		backgroundExecutor.scheduleAtFixedRate(((Runnable) (obj)), 0L, 0x15180L, TimeUnit.SECONDS);
	//   31   59:getstatic       #189 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   32   62:aload_0         
	//   33   63:lconst_0        
	//   34   64:ldc2w           #667 <Long 0x15180L>
	//   35   67:getstatic       #661 <Field TimeUnit TimeUnit.SECONDS>
	//   36   70:invokevirtual   #665 <Method java.util.concurrent.ScheduledFuture ScheduledThreadPoolExecutor.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//   37   73:pop             
		return;
	//   38   74:return          
		exception;
	//   39   75:astore_1        
		obj;
	//   40   76:aload_0         
		JVM INSTR monitorexit ;
	//   41   77:monitorexit     
		throw exception;
	//   42   78:aload_1         
	//   43   79:athrow          
	}

	private void logAppSessionResumeEvent(long l, String s)
	{
		PersistedAppSessionInfo.onResume(applicationContext, accessTokenAppId, this, l, s);
	//    0    0:getstatic       #168 <Field Context applicationContext>
	//    1    3:aload_0         
	//    2    4:getfield        #160 <Field AppEventsLogger$AccessTokenAppIdPair accessTokenAppId>
	//    3    7:aload_0         
	//    4    8:lload_1         
	//    5    9:aload_3         
	//    6   10:invokestatic    #672 <Method void AppEventsLogger$PersistedAppSessionInfo.onResume(Context, AppEventsLogger$AccessTokenAppIdPair, AppEventsLogger, long, String)>
	//    7   13:return          
	}

	private void logAppSessionSuspendEvent(long l)
	{
		PersistedAppSessionInfo.onSuspend(applicationContext, accessTokenAppId, this, l);
	//    0    0:getstatic       #168 <Field Context applicationContext>
	//    1    3:aload_0         
	//    2    4:getfield        #160 <Field AppEventsLogger$AccessTokenAppIdPair accessTokenAppId>
	//    3    7:aload_0         
	//    4    8:lload_1         
	//    5    9:invokestatic    #676 <Method void AppEventsLogger$PersistedAppSessionInfo.onSuspend(Context, AppEventsLogger$AccessTokenAppIdPair, AppEventsLogger, long)>
	//    6   12:return          
	}

	private static void logEvent(Context context, AppEvent appevent, AccessTokenAppIdPair accesstokenappidpair)
	{
		FacebookSdk.getExecutor().execute(new Runnable(context, accesstokenappidpair, appevent) {

			public void run()
			{
				AppEventsLogger.getSessionEventsState(context, accessTokenAppId).addEvent(event);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field Context val$context>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field AppEventsLogger$AccessTokenAppIdPair val$accessTokenAppId>
			//    4    8:invokestatic    #34  <Method AppEventsLogger$SessionEventsState AppEventsLogger.access$600(Context, AppEventsLogger$AccessTokenAppIdPair)>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field AppEventsLogger$AppEvent val$event>
			//    7   15:invokevirtual   #40  <Method void AppEventsLogger$SessionEventsState.addEvent(AppEventsLogger$AppEvent)>
				AppEventsLogger.flushIfNecessary();
			//    8   18:invokestatic    #43  <Method void AppEventsLogger.access$700()>
			//    9   21:return          
			}

			final AccessTokenAppIdPair val$accessTokenAppId;
			final Context val$context;
			final AppEvent val$event;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Context val$context>
				accessTokenAppId = accesstokenappidpair;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AppEventsLogger$AccessTokenAppIdPair val$accessTokenAppId>
				event = appevent;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field AppEventsLogger$AppEvent val$event>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:invokestatic    #445 <Method Executor FacebookSdk.getExecutor()>
	//    1    3:new             #14  <Class AppEventsLogger$5>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokespecial   #681 <Method void AppEventsLogger$5(Context, AppEventsLogger$AccessTokenAppIdPair, AppEventsLogger$AppEvent)>
	//    7   13:invokeinterface #450 <Method void Executor.execute(Runnable)>
	//    8   18:return          
	}

	private void logEvent(String s, Double double1, Bundle bundle, boolean flag)
	{
		s = ((String) (new AppEvent(contextName, s, double1, bundle, flag)));
	//    0    0:new             #26  <Class AppEventsLogger$AppEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #140 <Field String contextName>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iload           4
	//    8   13:invokespecial   #685 <Method void AppEventsLogger$AppEvent(String, String, Double, Bundle, boolean)>
	//    9   16:astore_1        
		logEvent(applicationContext, ((AppEvent) (s)), accessTokenAppId);
	//   10   17:getstatic       #168 <Field Context applicationContext>
	//   11   20:aload_1         
	//   12   21:aload_0         
	//   13   22:getfield        #160 <Field AppEventsLogger$AccessTokenAppIdPair accessTokenAppId>
	//   14   25:invokestatic    #687 <Method void logEvent(Context, AppEventsLogger$AppEvent, AppEventsLogger$AccessTokenAppIdPair)>
	//   15   28:return          
	}

	public static AppEventsLogger newLogger(Context context)
	{
		return new AppEventsLogger(context, ((String) (null)), ((AccessToken) (null)));
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #290 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	public static AppEventsLogger newLogger(Context context, AccessToken accesstoken)
	{
		return new AppEventsLogger(context, ((String) (null)), accesstoken);
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:invokespecial   #290 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	public static AppEventsLogger newLogger(Context context, String s)
	{
		return new AppEventsLogger(context, s, ((AccessToken) (null)));
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #290 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	public static AppEventsLogger newLogger(Context context, String s, AccessToken accesstoken)
	{
		return new AppEventsLogger(context, s, accesstoken);
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #290 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	private static void notifyDeveloperError(String s)
	{
		Logger.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", s);
	//    0    0:getstatic       #696 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//    1    3:ldc2            #698 <String "AppEvents">
	//    2    6:aload_0         
	//    3    7:invokestatic    #701 <Method void Logger.log(LoggingBehavior, String, String)>
	//    4   10:return          
	}

	public static void onContextStop()
	{
		PersistedEvents.persistEvents(applicationContext, stateMap);
	//    0    0:getstatic       #168 <Field Context applicationContext>
	//    1    3:getstatic       #114 <Field Map stateMap>
	//    2    6:invokestatic    #705 <Method void AppEventsLogger$PersistedEvents.persistEvents(Context, Map)>
	//    3    9:return          
	}

	static void resetSourceApplication()
	{
		sourceApplication = null;
	//    0    0:aconst_null     
	//    1    1:putstatic       #583 <Field String sourceApplication>
		isOpenedByApplink = false;
	//    2    4:iconst_0        
	//    3    5:putstatic       #579 <Field boolean isOpenedByApplink>
	//    4    8:return          
	}

	public static void setFlushBehavior(FlushBehavior flushbehavior)
	{
		synchronized(staticLock)
	//*   0    0:getstatic       #122 <Field Object staticLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			flushBehavior = flushbehavior;
	//    4    6:aload_0         
	//    5    7:putstatic       #119 <Field AppEventsLogger$FlushBehavior flushBehavior>
		}
	//    6   10:aload_1         
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		flushbehavior;
	//    9   13:astore_0        
		obj;
	//   10   14:aload_1         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		throw flushbehavior;
	//   12   16:aload_0         
	//   13   17:athrow          
	}

	private static void setSourceApplication(Activity activity)
	{
		Object obj = ((Object) (activity.getCallingActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #711 <Method ComponentName Activity.getCallingActivity()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          33
		{
			obj = ((Object) (((ComponentName) (obj)).getPackageName()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #714 <Method String ComponentName.getPackageName()>
	//    7   13:astore_1        
			if(((String) (obj)).equals(((Object) (activity.getPackageName()))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #715 <Method String Activity.getPackageName()>
	//*  11   19:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*  12   22:ifeq            29
			{
				resetSourceApplication();
	//   13   25:invokestatic    #274 <Method void resetSourceApplication()>
				return;
	//   14   28:return          
			}
			sourceApplication = ((String) (obj));
	//   15   29:aload_1         
	//   16   30:putstatic       #583 <Field String sourceApplication>
		}
		activity = ((Activity) (activity.getIntent()));
	//   17   33:aload_0         
	//   18   34:invokevirtual   #719 <Method Intent Activity.getIntent()>
	//   19   37:astore_0        
		if(activity != null && !((Intent) (activity)).getBooleanExtra("_fbSourceApplicationHasBeenSet", false))
	//*  20   38:aload_0         
	//*  21   39:ifnull          108
	//*  22   42:aload_0         
	//*  23   43:ldc1            #77  <String "_fbSourceApplicationHasBeenSet">
	//*  24   45:iconst_0        
	//*  25   46:invokevirtual   #723 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  26   49:ifeq            55
	//*  27   52:goto            108
		{
			Bundle bundle = AppLinks.getAppLinkData(((Intent) (activity)));
	//   28   55:aload_0         
	//   29   56:invokestatic    #729 <Method Bundle AppLinks.getAppLinkData(Intent)>
	//   30   59:astore_1        
			if(bundle == null)
	//*  31   60:aload_1         
	//*  32   61:ifnonnull       68
			{
				resetSourceApplication();
	//   33   64:invokestatic    #274 <Method void resetSourceApplication()>
				return;
	//   34   67:return          
			}
			isOpenedByApplink = true;
	//   35   68:iconst_1        
	//   36   69:putstatic       #579 <Field boolean isOpenedByApplink>
			bundle = bundle.getBundle("referer_app_link");
	//   37   72:aload_1         
	//   38   73:ldc2            #731 <String "referer_app_link">
	//   39   76:invokevirtual   #735 <Method Bundle Bundle.getBundle(String)>
	//   40   79:astore_1        
			if(bundle == null)
	//*  41   80:aload_1         
	//*  42   81:ifnonnull       89
			{
				sourceApplication = null;
	//   43   84:aconst_null     
	//   44   85:putstatic       #583 <Field String sourceApplication>
				return;
	//   45   88:return          
			} else
			{
				sourceApplication = bundle.getString("package");
	//   46   89:aload_1         
	//   47   90:ldc2            #737 <String "package">
	//   48   93:invokevirtual   #740 <Method String Bundle.getString(String)>
	//   49   96:putstatic       #583 <Field String sourceApplication>
				((Intent) (activity)).putExtra("_fbSourceApplicationHasBeenSet", true);
	//   50   99:aload_0         
	//   51  100:ldc1            #77  <String "_fbSourceApplicationHasBeenSet">
	//   52  102:iconst_1        
	//   53  103:invokevirtual   #743 <Method Intent Intent.putExtra(String, boolean)>
	//   54  106:pop             
				return;
	//   55  107:return          
			}
		} else
		{
			resetSourceApplication();
	//   56  108:invokestatic    #274 <Method void resetSourceApplication()>
			return;
	//   57  111:return          
		}
	}

	static void setSourceApplication(String s, boolean flag)
	{
		sourceApplication = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #583 <Field String sourceApplication>
		isOpenedByApplink = flag;
	//    2    4:iload_1         
	//    3    5:putstatic       #579 <Field boolean isOpenedByApplink>
	//    4    8:return          
	}

	public void flush()
	{
		flush(FlushReason.EXPLICIT);
	//    0    0:getstatic       #747 <Field AppEventsLogger$FlushReason AppEventsLogger$FlushReason.EXPLICIT>
	//    1    3:invokestatic    #441 <Method void flush(AppEventsLogger$FlushReason)>
	//    2    6:return          
	}

	public String getApplicationId()
	{
		return accessTokenAppId.getApplicationId();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field AppEventsLogger$AccessTokenAppIdPair accessTokenAppId>
	//    2    4:invokevirtual   #372 <Method String AppEventsLogger$AccessTokenAppIdPair.getApplicationId()>
	//    3    7:areturn         
	}

	public boolean isValidForAccessToken(AccessToken accesstoken)
	{
		accesstoken = ((AccessToken) (new AccessTokenAppIdPair(accesstoken)));
	//    0    0:new             #20  <Class AppEventsLogger$AccessTokenAppIdPair>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #158 <Method void AppEventsLogger$AccessTokenAppIdPair(AccessToken)>
	//    4    8:astore_1        
		return accessTokenAppId.equals(((Object) (accesstoken)));
	//    5    9:aload_0         
	//    6   10:getfield        #160 <Field AppEventsLogger$AccessTokenAppIdPair accessTokenAppId>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #750 <Method boolean AppEventsLogger$AccessTokenAppIdPair.equals(Object)>
	//    9   17:ireturn         
	}

	public void logEvent(String s)
	{
		logEvent(s, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #753 <Method void logEvent(String, Bundle)>
	//    4    6:return          
	}

	public void logEvent(String s, double d)
	{
		logEvent(s, d, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #757 <Method void logEvent(String, double, Bundle)>
	//    5    7:return          
	}

	public void logEvent(String s, double d, Bundle bundle)
	{
		logEvent(s, Double.valueOf(d), bundle, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #762 <Method Double Double.valueOf(double)>
	//    4    6:aload           4
	//    5    8:iconst_0        
	//    6    9:invokespecial   #764 <Method void logEvent(String, Double, Bundle, boolean)>
	//    7   12:return          
	}

	public void logEvent(String s, Bundle bundle)
	{
		logEvent(s, ((Double) (null)), bundle, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #764 <Method void logEvent(String, Double, Bundle, boolean)>
	//    6    8:return          
	}

	public void logPurchase(BigDecimal bigdecimal, Currency currency)
	{
		logPurchase(bigdecimal, currency, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #769 <Method void logPurchase(BigDecimal, Currency, Bundle)>
	//    5    7:return          
	}

	public void logPurchase(BigDecimal bigdecimal, Currency currency, Bundle bundle)
	{
		if(bigdecimal == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			notifyDeveloperError("purchaseAmount cannot be null");
	//    2    4:ldc2            #771 <String "purchaseAmount cannot be null">
	//    3    7:invokestatic    #773 <Method void notifyDeveloperError(String)>
			return;
	//    4   10:return          
		}
		if(currency == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       22
		{
			notifyDeveloperError("currency cannot be null");
	//    7   15:ldc2            #775 <String "currency cannot be null">
	//    8   18:invokestatic    #773 <Method void notifyDeveloperError(String)>
			return;
	//    9   21:return          
		}
		Bundle bundle1 = bundle;
	//   10   22:aload_3         
	//   11   23:astore          4
		if(bundle == null)
	//*  12   25:aload_3         
	//*  13   26:ifnonnull       38
			bundle1 = new Bundle();
	//   14   29:new             #392 <Class Bundle>
	//   15   32:dup             
	//   16   33:invokespecial   #393 <Method void Bundle()>
	//   17   36:astore          4
		bundle1.putString("fb_currency", currency.getCurrencyCode());
	//   18   38:aload           4
	//   19   40:ldc2            #777 <String "fb_currency">
	//   20   43:aload_2         
	//   21   44:invokevirtual   #782 <Method String Currency.getCurrencyCode()>
	//   22   47:invokevirtual   #401 <Method void Bundle.putString(String, String)>
		logEvent("fb_mobile_purchase", bigdecimal.doubleValue(), bundle1);
	//   23   50:aload_0         
	//   24   51:ldc2            #784 <String "fb_mobile_purchase">
	//   25   54:aload_1         
	//   26   55:invokevirtual   #790 <Method double BigDecimal.doubleValue()>
	//   27   58:aload           4
	//   28   60:invokevirtual   #757 <Method void logEvent(String, double, Bundle)>
		eagerFlush();
	//   29   63:invokestatic    #792 <Method void eagerFlush()>
	//   30   66:return          
	}

	public void logSdkEvent(String s, Double double1, Bundle bundle)
	{
		logEvent(s, double1, bundle, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #764 <Method void logEvent(String, Double, Bundle, boolean)>
	//    6    8:return          
	}

	public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
	public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
	public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
	public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
	private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 0x15180;
	private static final int FLUSH_APP_SESSION_INFO_IN_SECONDS = 30;
	private static final int FLUSH_PERIOD_IN_SECONDS = 15;
	private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
	private static final String SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT = "_fbSourceApplicationHasBeenSet";
	private static final String TAG = ((Class) (com/facebook/appevents/AppEventsLogger)).getCanonicalName();
	private static String anonymousAppDeviceGUID;
	private static Context applicationContext;
	private static ScheduledThreadPoolExecutor backgroundExecutor;
	private static FlushBehavior flushBehavior;
	private static boolean isOpenedByApplink;
	private static boolean requestInFlight;
	private static String sourceApplication;
	private static Map stateMap = new ConcurrentHashMap();
	private static Object staticLock = new Object();
	private final AccessTokenAppIdPair accessTokenAppId;
	private final String contextName;

	static 
	{
	//    0    0:ldc1            #2   <Class AppEventsLogger>
	//    1    2:invokevirtual   #105 <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #107 <Field String TAG>
	//    3    8:new             #109 <Class ConcurrentHashMap>
	//    4   11:dup             
	//    5   12:invokespecial   #112 <Method void ConcurrentHashMap()>
	//    6   15:putstatic       #114 <Field Map stateMap>
		flushBehavior = FlushBehavior.AUTO;
	//    7   18:getstatic       #117 <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.AUTO>
	//    8   21:putstatic       #119 <Field AppEventsLogger$FlushBehavior flushBehavior>
	//    9   24:new             #4   <Class Object>
	//   10   27:dup             
	//   11   28:invokespecial   #120 <Method void Object()>
	//   12   31:putstatic       #122 <Field Object staticLock>
	//*  13   34:return          
	}


/*
	static void access$100(AppEventsLogger appeventslogger, long l, String s)
	{
		appeventslogger.logAppSessionResumeEvent(l, s);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #183 <Method void logAppSessionResumeEvent(long, String)>
		return;
	//    4    6:return          
	}

*/


/*
	static Context access$1000()
	{
		return applicationContext;
	//    0    0:getstatic       #168 <Field Context applicationContext>
	//    1    3:areturn         
	}

*/


/*
	static String access$1300()
	{
		return TAG;
	//    0    0:getstatic       #107 <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static ScheduledThreadPoolExecutor access$1400()
	{
		return backgroundExecutor;
	//    0    0:getstatic       #189 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//    1    3:areturn         
	}

*/


/*
	static void access$200(AppEventsLogger appeventslogger, long l)
	{
		appeventslogger.logAppSessionSuspendEvent(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #195 <Method void logAppSessionSuspendEvent(long)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$300(FlushReason flushreason)
	{
		flushAndWait(flushreason);
	//    0    0:aload_0         
	//    1    1:invokestatic    #200 <Method void flushAndWait(AppEventsLogger$FlushReason)>
		return;
	//    2    4:return          
	}

*/


/*
	static Object access$400()
	{
		return staticLock;
	//    0    0:getstatic       #122 <Field Object staticLock>
	//    1    3:areturn         
	}

*/


/*
	static Map access$500()
	{
		return stateMap;
	//    0    0:getstatic       #114 <Field Map stateMap>
	//    1    3:areturn         
	}

*/


/*
	static SessionEventsState access$600(Context context, AccessTokenAppIdPair accesstokenappidpair)
	{
		return getSessionEventsState(context, accesstokenappidpair);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #209 <Method AppEventsLogger$SessionEventsState getSessionEventsState(Context, AppEventsLogger$AccessTokenAppIdPair)>
	//    3    5:areturn         
	}

*/


/*
	static void access$700()
	{
		flushIfNecessary();
	//    0    0:invokestatic    #213 <Method void flushIfNecessary()>
		return;
	//    1    3:return          
	}

*/


/*
	static void access$900(AccessTokenAppIdPair accesstokenappidpair, GraphRequest graphrequest, GraphResponse graphresponse, SessionEventsState sessioneventsstate, FlushStatistics flushstatistics)
	{
		handleResponse(accesstokenappidpair, graphrequest, graphresponse, sessioneventsstate, flushstatistics);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #218 <Method void handleResponse(AppEventsLogger$AccessTokenAppIdPair, GraphRequest, GraphResponse, AppEventsLogger$SessionEventsState, AppEventsLogger$FlushStatistics)>
		return;
	//    6    9:return          
	}

*/
}
