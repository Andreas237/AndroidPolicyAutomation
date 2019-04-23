// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

class AppEvent
	implements Serializable
{
	static class SerializationProxyV1
		implements Serializable
	{

		private Object readResolve()
			throws JSONException
		{
			return ((Object) (new AppEvent(jsonString, isImplicit, ((String) (null)))));
		//    0    0:new             #8   <Class AppEvent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field String jsonString>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field boolean isImplicit>
		//    6   12:aconst_null     
		//    7   13:aconst_null     
		//    8   14:invokespecial   #34  <Method void AppEvent(String, boolean, String, AppEvent$1)>
		//    9   17:areturn         
		}

		private static final long serialVersionUID = 0x317ab613L;
		private final boolean isImplicit;
		private final String jsonString;

		private SerializationProxyV1(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			jsonString = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field String jsonString>
			isImplicit = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field boolean isImplicit>
		//    8   14:return          
		}
	}

	static class SerializationProxyV2
		implements Serializable
	{

		private Object readResolve()
			throws JSONException
		{
			return ((Object) (new AppEvent(jsonString, isImplicit, checksum)));
		//    0    0:new             #8   <Class AppEvent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field String jsonString>
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field boolean isImplicit>
		//    6   12:aload_0         
		//    7   13:getfield        #29  <Field String checksum>
		//    8   16:aconst_null     
		//    9   17:invokespecial   #39  <Method void AppEvent(String, boolean, String, AppEvent$1)>
		//   10   20:areturn         
		}

		private static final long serialVersionUID = 0xb1ad70b9L;
		private final String checksum;
		private final boolean isImplicit;
		private final String jsonString;

		private SerializationProxyV2(String s, boolean flag, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			jsonString = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field String jsonString>
			isImplicit = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #27  <Field boolean isImplicit>
			checksum = s1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #29  <Field String checksum>
		//   11   19:return          
		}

	}


	public AppEvent(String s, String s1, Double double1, Bundle bundle, boolean flag, UUID uuid)
		throws JSONException, FacebookException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		jsonObject = getJSONObjectForAppEvent(s, s1, double1, bundle, flag, uuid);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:iload           5
	//    8   12:aload           6
	//    9   14:invokestatic    #49  <Method JSONObject getJSONObjectForAppEvent(String, String, Double, Bundle, boolean, UUID)>
	//   10   17:putfield        #51  <Field JSONObject jsonObject>
		isImplicit = flag;
	//   11   20:aload_0         
	//   12   21:iload           5
	//   13   23:putfield        #53  <Field boolean isImplicit>
		name = s1;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #55  <Field String name>
		checksum = calculateChecksum();
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:invokespecial   #59  <Method String calculateChecksum()>
	//   20   36:putfield        #61  <Field String checksum>
	//   21   39:return          
	}

	private AppEvent(String s, boolean flag, String s1)
		throws JSONException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		jsonObject = new JSONObject(s);
	//    2    4:aload_0         
	//    3    5:new             #66  <Class JSONObject>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #69  <Method void JSONObject(String)>
	//    7   13:putfield        #51  <Field JSONObject jsonObject>
		isImplicit = flag;
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:putfield        #53  <Field boolean isImplicit>
		name = jsonObject.optString("_eventName");
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #51  <Field JSONObject jsonObject>
	//   14   26:ldc1            #71  <String "_eventName">
	//   15   28:invokevirtual   #75  <Method String JSONObject.optString(String)>
	//   16   31:putfield        #55  <Field String name>
		checksum = s1;
	//   17   34:aload_0         
	//   18   35:aload_3         
	//   19   36:putfield        #61  <Field String checksum>
	//   20   39:return          
	}


	private String calculateChecksum()
	{
		if(android.os.Build.VERSION.SDK_INT > 19)
	//*   0    0:getstatic       #84  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmple          19
			return md5Checksum(jsonObject.toString());
	//    3    8:aload_0         
	//    4    9:getfield        #51  <Field JSONObject jsonObject>
	//    5   12:invokevirtual   #87  <Method String JSONObject.toString()>
	//    6   15:invokestatic    #90  <Method String md5Checksum(String)>
	//    7   18:areturn         
		Object obj = ((Object) (new ArrayList()));
	//    8   19:new             #92  <Class ArrayList>
	//    9   22:dup             
	//   10   23:invokespecial   #93  <Method void ArrayList()>
	//   11   26:astore_2        
		for(Iterator iterator = jsonObject.keys(); iterator.hasNext(); ((ArrayList) (obj)).add(iterator.next()));
	//   12   27:aload_0         
	//   13   28:getfield        #51  <Field JSONObject jsonObject>
	//   14   31:invokevirtual   #97  <Method Iterator JSONObject.keys()>
	//   15   34:astore_1        
	//   16   35:aload_1         
	//   17   36:invokeinterface #103 <Method boolean Iterator.hasNext()>
	//   18   41:ifeq            58
	//   19   44:aload_2         
	//   20   45:aload_1         
	//   21   46:invokeinterface #107 <Method Object Iterator.next()>
	//   22   51:invokevirtual   #111 <Method boolean ArrayList.add(Object)>
	//   23   54:pop             
	//*  24   55:goto            35
		Collections.sort(((java.util.List) (obj)));
	//   25   58:aload_2         
	//   26   59:invokestatic    #117 <Method void Collections.sort(java.util.List)>
		StringBuilder stringbuilder = new StringBuilder();
	//   27   62:new             #119 <Class StringBuilder>
	//   28   65:dup             
	//   29   66:invokespecial   #120 <Method void StringBuilder()>
	//   30   69:astore_1        
		for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); stringbuilder.append('\n'))
	//*  31   70:aload_2         
	//*  32   71:invokevirtual   #123 <Method Iterator ArrayList.iterator()>
	//*  33   74:astore_2        
	//*  34   75:aload_2         
	//*  35   76:invokeinterface #103 <Method boolean Iterator.hasNext()>
	//*  36   81:ifeq            130
		{
			String s = (String)((Iterator) (obj)).next();
	//   37   84:aload_2         
	//   38   85:invokeinterface #107 <Method Object Iterator.next()>
	//   39   90:checkcast       #125 <Class String>
	//   40   93:astore_3        
			stringbuilder.append(s);
	//   41   94:aload_1         
	//   42   95:aload_3         
	//   43   96:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   44   99:pop             
			stringbuilder.append(" = ");
	//   45  100:aload_1         
	//   46  101:ldc1            #131 <String " = ">
	//   47  103:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   48  106:pop             
			stringbuilder.append(jsonObject.optString(s));
	//   49  107:aload_1         
	//   50  108:aload_0         
	//   51  109:getfield        #51  <Field JSONObject jsonObject>
	//   52  112:aload_3         
	//   53  113:invokevirtual   #75  <Method String JSONObject.optString(String)>
	//   54  116:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   55  119:pop             
		}

	//   56  120:aload_1         
	//   57  121:bipush          10
	//   58  123:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   59  126:pop             
	//*  60  127:goto            75
		return md5Checksum(stringbuilder.toString());
	//   61  130:aload_1         
	//   62  131:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   63  134:invokestatic    #90  <Method String md5Checksum(String)>
	//   64  137:areturn         
	}

	private static JSONObject getJSONObjectForAppEvent(String s, String s1, Double double1, Bundle bundle, boolean flag, UUID uuid)
		throws FacebookException, JSONException
	{
		validateIdentifier(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #138 <Method void validateIdentifier(String)>
		JSONObject jsonobject = new JSONObject();
	//    2    4:new             #66  <Class JSONObject>
	//    3    7:dup             
	//    4    8:invokespecial   #139 <Method void JSONObject()>
	//    5   11:astore          6
		jsonobject.put("_eventName", ((Object) (s1)));
	//    6   13:aload           6
	//    7   15:ldc1            #71  <String "_eventName">
	//    8   17:aload_1         
	//    9   18:invokevirtual   #143 <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
		jsonobject.put("_eventName_md5", ((Object) (md5Checksum(s1))));
	//   11   22:aload           6
	//   12   24:ldc1            #145 <String "_eventName_md5">
	//   13   26:aload_1         
	//   14   27:invokestatic    #90  <Method String md5Checksum(String)>
	//   15   30:invokevirtual   #143 <Method JSONObject JSONObject.put(String, Object)>
	//   16   33:pop             
		jsonobject.put("_logTime", System.currentTimeMillis() / 1000L);
	//   17   34:aload           6
	//   18   36:ldc1            #147 <String "_logTime">
	//   19   38:invokestatic    #153 <Method long System.currentTimeMillis()>
	//   20   41:ldc2w           #154 <Long 1000L>
	//   21   44:ldiv            
	//   22   45:invokevirtual   #158 <Method JSONObject JSONObject.put(String, long)>
	//   23   48:pop             
		jsonobject.put("_ui", ((Object) (s)));
	//   24   49:aload           6
	//   25   51:ldc1            #160 <String "_ui">
	//   26   53:aload_0         
	//   27   54:invokevirtual   #143 <Method JSONObject JSONObject.put(String, Object)>
	//   28   57:pop             
		if(uuid != null)
	//*  29   58:aload           5
	//*  30   60:ifnull          73
			jsonobject.put("_session_id", ((Object) (uuid)));
	//   31   63:aload           6
	//   32   65:ldc1            #162 <String "_session_id">
	//   33   67:aload           5
	//   34   69:invokevirtual   #143 <Method JSONObject JSONObject.put(String, Object)>
	//   35   72:pop             
		if(double1 != null)
	//*  36   73:aload_2         
	//*  37   74:ifnull          89
			jsonobject.put("_valueToSum", double1.doubleValue());
	//   38   77:aload           6
	//   39   79:ldc1            #164 <String "_valueToSum">
	//   40   81:aload_2         
	//   41   82:invokevirtual   #170 <Method double Double.doubleValue()>
	//   42   85:invokevirtual   #173 <Method JSONObject JSONObject.put(String, double)>
	//   43   88:pop             
		if(flag)
	//*  44   89:iload           4
	//*  45   91:ifeq            104
			jsonobject.put("_implicitlyLogged", "1");
	//   46   94:aload           6
	//   47   96:ldc1            #175 <String "_implicitlyLogged">
	//   48   98:ldc1            #177 <String "1">
	//   49  100:invokevirtual   #143 <Method JSONObject JSONObject.put(String, Object)>
	//   50  103:pop             
		if(bundle != null)
	//*  51  104:aload_3         
	//*  52  105:ifnull          203
			for(s = ((String) (bundle.keySet().iterator())); ((Iterator) (s)).hasNext(); jsonobject.put(s1, ((Object) (((Object) (double1)).toString()))))
	//*  53  108:aload_3         
	//*  54  109:invokevirtual   #183 <Method Set Bundle.keySet()>
	//*  55  112:invokeinterface #186 <Method Iterator Set.iterator()>
	//*  56  117:astore_0        
	//*  57  118:aload_0         
	//*  58  119:invokeinterface #103 <Method boolean Iterator.hasNext()>
	//*  59  124:ifeq            203
			{
				s1 = (String)((Iterator) (s)).next();
	//   60  127:aload_0         
	//   61  128:invokeinterface #107 <Method Object Iterator.next()>
	//   62  133:checkcast       #125 <Class String>
	//   63  136:astore_1        
				validateIdentifier(s1);
	//   64  137:aload_1         
	//   65  138:invokestatic    #138 <Method void validateIdentifier(String)>
				double1 = ((Double) (bundle.get(s1)));
	//   66  141:aload_3         
	//   67  142:aload_1         
	//   68  143:invokevirtual   #190 <Method Object Bundle.get(String)>
	//   69  146:astore_2        
				if(!(double1 instanceof String) && !(double1 instanceof Number))
	//*  70  147:aload_2         
	//*  71  148:instanceof      #125 <Class String>
	//*  72  151:ifne            189
	//*  73  154:aload_2         
	//*  74  155:instanceof      #192 <Class Number>
	//*  75  158:ifeq            164
	//*  76  161:goto            189
					throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] {
						double1, s1
					}));
	//   77  164:new             #43  <Class FacebookException>
	//   78  167:dup             
	//   79  168:ldc1            #194 <String "Parameter value '%s' for key '%s' should be a string or a numeric type.">
	//   80  170:iconst_2        
	//   81  171:anewarray       Object[]
	//   82  174:dup             
	//   83  175:iconst_0        
	//   84  176:aload_2         
	//   85  177:aastore         
	//   86  178:dup             
	//   87  179:iconst_1        
	//   88  180:aload_1         
	//   89  181:aastore         
	//   90  182:invokestatic    #198 <Method String String.format(String, Object[])>
	//   91  185:invokespecial   #199 <Method void FacebookException(String)>
	//   92  188:athrow          
			}

	//   93  189:aload           6
	//   94  191:aload_1         
	//   95  192:aload_2         
	//   96  193:invokevirtual   #200 <Method String Object.toString()>
	//   97  196:invokevirtual   #143 <Method JSONObject JSONObject.put(String, Object)>
	//   98  199:pop             
	//*  99  200:goto            118
		if(!flag)
	//* 100  203:iload           4
	//* 101  205:ifne            230
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", new Object[] {
				jsonobject.toString()
			});
	//  102  208:getstatic       #206 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//  103  211:ldc1            #208 <String "AppEvents">
	//  104  213:ldc1            #210 <String "Created app event '%s'">
	//  105  215:iconst_1        
	//  106  216:anewarray       Object[]
	//  107  219:dup             
	//  108  220:iconst_0        
	//  109  221:aload           6
	//  110  223:invokevirtual   #87  <Method String JSONObject.toString()>
	//  111  226:aastore         
	//  112  227:invokestatic    #216 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		return jsonobject;
	//  113  230:aload           6
	//  114  232:areturn         
	}

	private static String md5Checksum(String s)
	{
		try
		{
			MessageDigest messagedigest = MessageDigest.getInstance("MD5");
	//    0    0:ldc1            #222 <String "MD5">
	//    1    2:invokestatic    #228 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore_1        
			s = ((String) (s.getBytes("UTF-8")));
	//    3    6:aload_0         
	//    4    7:ldc1            #230 <String "UTF-8">
	//    5    9:invokevirtual   #234 <Method byte[] String.getBytes(String)>
	//    6   12:astore_0        
			messagedigest.update(((byte []) (s)), 0, s.length);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:aload_0         
	//   11   17:arraylength     
	//   12   18:invokevirtual   #238 <Method void MessageDigest.update(byte[], int, int)>
			s = AppEventUtility.bytesToHex(messagedigest.digest());
	//   13   21:aload_1         
	//   14   22:invokevirtual   #242 <Method byte[] MessageDigest.digest()>
	//   15   25:invokestatic    #248 <Method String AppEventUtility.bytesToHex(byte[])>
	//   16   28:astore_0        
		}
	//*  17   29:aload_0         
	//*  18   30:areturn         
	//*  19   31:astore_0        
	//*  20   32:ldc1            #250 <String "Failed to generate checksum: ">
	//*  21   34:aload_0         
	//*  22   35:invokestatic    #256 <Method void Utility.logd(String, Exception)>
	//*  23   38:ldc1            #177 <String "1">
	//*  24   40:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   41:astore_0        
		{
			Utility.logd("Failed to generate checksum: ", ((Exception) (s)));
	//   26   42:ldc1            #250 <String "Failed to generate checksum: ">
	//   27   44:aload_0         
	//   28   45:invokestatic    #256 <Method void Utility.logd(String, Exception)>
			return "0";
	//   29   48:ldc2            #258 <String "0">
	//   30   51:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			Utility.logd("Failed to generate checksum: ", ((Exception) (s)));
			return "1";
		}
		return s;
	}

	private static void validateIdentifier(String s)
		throws FacebookException
	{
		if(s != null && s.length() != 0 && s.length() <= 40)
	//*   0    0:aload_0         
	//*   1    1:ifnull          103
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #262 <Method int String.length()>
	//*   4    8:ifeq            103
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #262 <Method int String.length()>
	//*   7   15:bipush          40
	//*   8   17:icmple          23
	//*   9   20:goto            103
		{
			boolean flag;
			synchronized(validatedIdentifiers)
	//*  10   23:getstatic       #37  <Field HashSet validatedIdentifiers>
	//*  11   26:astore_2        
	//*  12   27:aload_2         
	//*  13   28:monitorenter    
			{
				flag = validatedIdentifiers.contains(((Object) (s)));
	//   14   29:getstatic       #37  <Field HashSet validatedIdentifiers>
	//   15   32:aload_0         
	//   16   33:invokevirtual   #265 <Method boolean HashSet.contains(Object)>
	//   17   36:istore_1        
			}
	//   18   37:aload_2         
	//   19   38:monitorexit     
			if(!flag)
	//*  20   39:iload_1         
	//*  21   40:ifne            97
			{
				if(s.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$"))
	//*  22   43:aload_0         
	//*  23   44:ldc2            #267 <String "^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$">
	//*  24   47:invokevirtual   #271 <Method boolean String.matches(String)>
	//*  25   50:ifeq            75
				{
					synchronized(validatedIdentifiers)
	//*  26   53:getstatic       #37  <Field HashSet validatedIdentifiers>
	//*  27   56:astore_2        
	//*  28   57:aload_2         
	//*  29   58:monitorenter    
					{
						validatedIdentifiers.add(((Object) (s)));
	//   30   59:getstatic       #37  <Field HashSet validatedIdentifiers>
	//   31   62:aload_0         
	//   32   63:invokevirtual   #272 <Method boolean HashSet.add(Object)>
	//   33   66:pop             
					}
	//   34   67:aload_2         
	//   35   68:monitorexit     
					return;
	//   36   69:return          
				} else
	//*  37   70:astore_0        
	//*  38   71:aload_2         
	//*  39   72:monitorexit     
	//*  40   73:aload_0         
	//*  41   74:athrow          
				{
					throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[] {
						s
					}));
	//   42   75:new             #43  <Class FacebookException>
	//   43   78:dup             
	//   44   79:ldc2            #274 <String "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.">
	//   45   82:iconst_1        
	//   46   83:anewarray       Object[]
	//   47   86:dup             
	//   48   87:iconst_0        
	//   49   88:aload_0         
	//   50   89:aastore         
	//   51   90:invokestatic    #198 <Method String String.format(String, Object[])>
	//   52   93:invokespecial   #199 <Method void FacebookException(String)>
	//   53   96:athrow          
				}
			} else
			{
				return;
	//   54   97:return          
			}
		}
		break MISSING_BLOCK_LABEL_103;
		s;
		hashset;
		JVM INSTR monitorexit ;
		throw s;
		s;
	//   55   98:astore_0        
		hashset;
	//   56   99:aload_2         
		JVM INSTR monitorexit ;
	//   57  100:monitorexit     
		throw s;
	//   58  101:aload_0         
	//   59  102:athrow          
		String s1 = s;
	//   60  103:aload_0         
	//   61  104:astore_2        
		if(s == null)
	//*  62  105:aload_0         
	//*  63  106:ifnonnull       113
			s1 = "<None Provided>";
	//   64  109:ldc2            #276 <String "<None Provided>">
	//   65  112:astore_2        
		throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] {
			s1, Integer.valueOf(40)
		}));
	//   66  113:new             #43  <Class FacebookException>
	//   67  116:dup             
	//   68  117:getstatic       #282 <Field Locale Locale.ROOT>
	//   69  120:ldc2            #284 <String "Identifier '%s' must be less than %d characters">
	//   70  123:iconst_2        
	//   71  124:anewarray       Object[]
	//   72  127:dup             
	//   73  128:iconst_0        
	//   74  129:aload_2         
	//   75  130:aastore         
	//   76  131:dup             
	//   77  132:iconst_1        
	//   78  133:bipush          40
	//   79  135:invokestatic    #290 <Method Integer Integer.valueOf(int)>
	//   80  138:aastore         
	//   81  139:invokestatic    #293 <Method String String.format(Locale, String, Object[])>
	//   82  142:invokespecial   #199 <Method void FacebookException(String)>
	//   83  145:athrow          
	}

	private Object writeReplace()
	{
		return ((Object) (new SerializationProxyV2(jsonObject.toString(), isImplicit, checksum)));
	//    0    0:new             #13  <Class AppEvent$SerializationProxyV2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field JSONObject jsonObject>
	//    4    8:invokevirtual   #87  <Method String JSONObject.toString()>
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field boolean isImplicit>
	//    7   15:aload_0         
	//    8   16:getfield        #61  <Field String checksum>
	//    9   19:aconst_null     
	//   10   20:invokespecial   #296 <Method void AppEvent$SerializationProxyV2(String, boolean, String, AppEvent$1)>
	//   11   23:areturn         
	}

	public boolean getIsImplicit()
	{
		return isImplicit;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean isImplicit>
	//    2    4:ireturn         
	}

	public JSONObject getJSONObject()
	{
		return jsonObject;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field JSONObject jsonObject>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String name>
	//    2    4:areturn         
	}

	public boolean isChecksumValid()
	{
		if(checksum == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field String checksum>
	//*   2    4:ifnonnull       9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		else
			return calculateChecksum().equals(((Object) (checksum)));
	//    5    9:aload_0         
	//    6   10:invokespecial   #59  <Method String calculateChecksum()>
	//    7   13:aload_0         
	//    8   14:getfield        #61  <Field String checksum>
	//    9   17:invokevirtual   #304 <Method boolean String.equals(Object)>
	//   10   20:ireturn         
	}

	public String toString()
	{
		return String.format("\"%s\", implicit: %b, json: %s", new Object[] {
			jsonObject.optString("_eventName"), Boolean.valueOf(isImplicit), jsonObject.toString()
		});
	//    0    0:ldc2            #306 <String "\"%s\", implicit: %b, json: %s">
	//    1    3:iconst_3        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field JSONObject jsonObject>
	//    7   13:ldc1            #71  <String "_eventName">
	//    8   15:invokevirtual   #75  <Method String JSONObject.optString(String)>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #53  <Field boolean isImplicit>
	//   14   25:invokestatic    #311 <Method Boolean Boolean.valueOf(boolean)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_2        
	//   18   31:aload_0         
	//   19   32:getfield        #51  <Field JSONObject jsonObject>
	//   20   35:invokevirtual   #87  <Method String JSONObject.toString()>
	//   21   38:aastore         
	//   22   39:invokestatic    #198 <Method String String.format(String, Object[])>
	//   23   42:areturn         
	}

	private static final long serialVersionUID = 1L;
	private static final HashSet validatedIdentifiers = new HashSet();
	private final String checksum;
	private final boolean isImplicit;
	private final JSONObject jsonObject;
	private final String name;

	static 
	{
	//    0    0:new             #32  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void HashSet()>
	//    3    7:putstatic       #37  <Field HashSet validatedIdentifiers>
	//*   4   10:return          
	}
}
