// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
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
		//    3    5:getfield        #23  <Field String jsonString>
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field boolean isImplicit>
		//    6   12:aconst_null     
		//    7   13:aconst_null     
		//    8   14:invokespecial   #29  <Method void AppEvent(String, boolean, String, AppEvent$1)>
		//    9   17:areturn         
		}

		private static final long serialVersionUID = 0x317ab613L;
		private final boolean isImplicit;
		private final String jsonString;
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
	//    1    1:invokespecial   #46  <Method void Object()>
		jsonObject = getJSONObjectForAppEvent(s, s1, double1, bundle, flag, uuid);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:iload           5
	//    8   12:aload           6
	//    9   14:invokestatic    #50  <Method JSONObject getJSONObjectForAppEvent(String, String, Double, Bundle, boolean, UUID)>
	//   10   17:putfield        #52  <Field JSONObject jsonObject>
		isImplicit = flag;
	//   11   20:aload_0         
	//   12   21:iload           5
	//   13   23:putfield        #54  <Field boolean isImplicit>
		name = s1;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #56  <Field String name>
		checksum = calculateChecksum();
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:invokespecial   #60  <Method String calculateChecksum()>
	//   20   36:putfield        #62  <Field String checksum>
	//   21   39:return          
	}

	private AppEvent(String s, boolean flag, String s1)
		throws JSONException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		jsonObject = JSONObjectInstrumentation.init(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #71  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    5    9:putfield        #52  <Field JSONObject jsonObject>
		isImplicit = flag;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:putfield        #54  <Field boolean isImplicit>
		name = jsonObject.optString("_eventName");
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #52  <Field JSONObject jsonObject>
	//   12   22:ldc1            #73  <String "_eventName">
	//   13   24:invokevirtual   #79  <Method String JSONObject.optString(String)>
	//   14   27:putfield        #56  <Field String name>
		checksum = s1;
	//   15   30:aload_0         
	//   16   31:aload_3         
	//   17   32:putfield        #62  <Field String checksum>
	//   18   35:return          
	}


	private static String bytesToHex(byte abyte0[])
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #86  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuffer()>
	//    3    7:astore_3        
		int j = abyte0.length;
	//    4    8:aload_0         
	//    5    9:arraylength     
	//    6   10:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          48
			stringbuffer.append(String.format("%02x", new Object[] {
				Byte.valueOf(abyte0[i])
			}));
	//   12   18:aload_3         
	//   13   19:ldc1            #89  <String "%02x">
	//   14   21:iconst_1        
	//   15   22:anewarray       Object[]
	//   16   25:dup             
	//   17   26:iconst_0        
	//   18   27:aload_0         
	//   19   28:iload_1         
	//   20   29:baload          
	//   21   30:invokestatic    #95  <Method Byte Byte.valueOf(byte)>
	//   22   33:aastore         
	//   23   34:invokestatic    #101 <Method String String.format(String, Object[])>
	//   24   37:invokevirtual   #105 <Method StringBuffer StringBuffer.append(String)>
	//   25   40:pop             

	//   26   41:iload_1         
	//   27   42:iconst_1        
	//   28   43:iadd            
	//   29   44:istore_1        
	//*  30   45:goto            13
		return stringbuffer.toString();
	//   31   48:aload_3         
	//   32   49:invokevirtual   #108 <Method String StringBuffer.toString()>
	//   33   52:areturn         
	}

	private String calculateChecksum()
	{
		if(android.os.Build.VERSION.SDK_INT > 19)
	//*   0    0:getstatic       #114 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmple          41
		{
			Object obj = ((Object) (jsonObject));
	//    3    8:aload_0         
	//    4    9:getfield        #52  <Field JSONObject jsonObject>
	//    5   12:astore_1        
			if(!(obj instanceof JSONObject))
	//*   6   13:aload_1         
	//*   7   14:instanceof      #75  <Class JSONObject>
	//*   8   17:ifne            28
				obj = ((Object) (((JSONObject) (obj)).toString()));
	//    9   20:aload_1         
	//   10   21:invokevirtual   #115 <Method String JSONObject.toString()>
	//   11   24:astore_1        
			else
	//*  12   25:goto            36
				obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
	//   13   28:aload_1         
	//   14   29:checkcast       #75  <Class JSONObject>
	//   15   32:invokestatic    #118 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   16   35:astore_1        
			return md5Checksum(((String) (obj)));
	//   17   36:aload_1         
	//   18   37:invokestatic    #121 <Method String md5Checksum(String)>
	//   19   40:areturn         
		}
		Object obj1 = ((Object) (new ArrayList()));
	//   20   41:new             #123 <Class ArrayList>
	//   21   44:dup             
	//   22   45:invokespecial   #124 <Method void ArrayList()>
	//   23   48:astore_2        
		for(Iterator iterator = jsonObject.keys(); iterator.hasNext(); ((ArrayList) (obj1)).add(iterator.next()));
	//   24   49:aload_0         
	//   25   50:getfield        #52  <Field JSONObject jsonObject>
	//   26   53:invokevirtual   #128 <Method Iterator JSONObject.keys()>
	//   27   56:astore_1        
	//   28   57:aload_1         
	//   29   58:invokeinterface #134 <Method boolean Iterator.hasNext()>
	//   30   63:ifeq            80
	//   31   66:aload_2         
	//   32   67:aload_1         
	//   33   68:invokeinterface #138 <Method Object Iterator.next()>
	//   34   73:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   35   76:pop             
	//*  36   77:goto            57
		Collections.sort(((java.util.List) (obj1)));
	//   37   80:aload_2         
	//   38   81:invokestatic    #148 <Method void Collections.sort(java.util.List)>
		StringBuilder stringbuilder = new StringBuilder();
	//   39   84:new             #150 <Class StringBuilder>
	//   40   87:dup             
	//   41   88:invokespecial   #151 <Method void StringBuilder()>
	//   42   91:astore_1        
		for(obj1 = ((Object) (((ArrayList) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); stringbuilder.append('\n'))
	//*  43   92:aload_2         
	//*  44   93:invokevirtual   #154 <Method Iterator ArrayList.iterator()>
	//*  45   96:astore_2        
	//*  46   97:aload_2         
	//*  47   98:invokeinterface #134 <Method boolean Iterator.hasNext()>
	//*  48  103:ifeq            152
		{
			String s = (String)((Iterator) (obj1)).next();
	//   49  106:aload_2         
	//   50  107:invokeinterface #138 <Method Object Iterator.next()>
	//   51  112:checkcast       #97  <Class String>
	//   52  115:astore_3        
			stringbuilder.append(s);
	//   53  116:aload_1         
	//   54  117:aload_3         
	//   55  118:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   56  121:pop             
			stringbuilder.append(" = ");
	//   57  122:aload_1         
	//   58  123:ldc1            #159 <String " = ">
	//   59  125:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   60  128:pop             
			stringbuilder.append(jsonObject.optString(s));
	//   61  129:aload_1         
	//   62  130:aload_0         
	//   63  131:getfield        #52  <Field JSONObject jsonObject>
	//   64  134:aload_3         
	//   65  135:invokevirtual   #79  <Method String JSONObject.optString(String)>
	//   66  138:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   67  141:pop             
		}

	//   68  142:aload_1         
	//   69  143:bipush          10
	//   70  145:invokevirtual   #162 <Method StringBuilder StringBuilder.append(char)>
	//   71  148:pop             
	//*  72  149:goto            97
		return md5Checksum(stringbuilder.toString());
	//   73  152:aload_1         
	//   74  153:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   75  156:invokestatic    #121 <Method String md5Checksum(String)>
	//   76  159:areturn         
	}

	private static JSONObject getJSONObjectForAppEvent(String s, String s1, Double double1, Bundle bundle, boolean flag, UUID uuid)
		throws FacebookException, JSONException
	{
		validateIdentifier(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #167 <Method void validateIdentifier(String)>
		JSONObject jsonobject = new JSONObject();
	//    2    4:new             #75  <Class JSONObject>
	//    3    7:dup             
	//    4    8:invokespecial   #168 <Method void JSONObject()>
	//    5   11:astore          6
		jsonobject.put("_eventName", ((Object) (s1)));
	//    6   13:aload           6
	//    7   15:ldc1            #73  <String "_eventName">
	//    8   17:aload_1         
	//    9   18:invokevirtual   #172 <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
		jsonobject.put("_eventName_md5", ((Object) (md5Checksum(s1))));
	//   11   22:aload           6
	//   12   24:ldc1            #174 <String "_eventName_md5">
	//   13   26:aload_1         
	//   14   27:invokestatic    #121 <Method String md5Checksum(String)>
	//   15   30:invokevirtual   #172 <Method JSONObject JSONObject.put(String, Object)>
	//   16   33:pop             
		jsonobject.put("_logTime", System.currentTimeMillis() / 1000L);
	//   17   34:aload           6
	//   18   36:ldc1            #176 <String "_logTime">
	//   19   38:invokestatic    #182 <Method long System.currentTimeMillis()>
	//   20   41:ldc2w           #183 <Long 1000L>
	//   21   44:ldiv            
	//   22   45:invokevirtual   #187 <Method JSONObject JSONObject.put(String, long)>
	//   23   48:pop             
		jsonobject.put("_ui", ((Object) (s)));
	//   24   49:aload           6
	//   25   51:ldc1            #189 <String "_ui">
	//   26   53:aload_0         
	//   27   54:invokevirtual   #172 <Method JSONObject JSONObject.put(String, Object)>
	//   28   57:pop             
		if(uuid != null)
	//*  29   58:aload           5
	//*  30   60:ifnull          73
			jsonobject.put("_session_id", ((Object) (uuid)));
	//   31   63:aload           6
	//   32   65:ldc1            #191 <String "_session_id">
	//   33   67:aload           5
	//   34   69:invokevirtual   #172 <Method JSONObject JSONObject.put(String, Object)>
	//   35   72:pop             
		if(double1 != null)
	//*  36   73:aload_2         
	//*  37   74:ifnull          89
			jsonobject.put("_valueToSum", double1.doubleValue());
	//   38   77:aload           6
	//   39   79:ldc1            #193 <String "_valueToSum">
	//   40   81:aload_2         
	//   41   82:invokevirtual   #199 <Method double Double.doubleValue()>
	//   42   85:invokevirtual   #202 <Method JSONObject JSONObject.put(String, double)>
	//   43   88:pop             
		if(flag)
	//*  44   89:iload           4
	//*  45   91:ifeq            104
			jsonobject.put("_implicitlyLogged", "1");
	//   46   94:aload           6
	//   47   96:ldc1            #204 <String "_implicitlyLogged">
	//   48   98:ldc1            #206 <String "1">
	//   49  100:invokevirtual   #172 <Method JSONObject JSONObject.put(String, Object)>
	//   50  103:pop             
		if(bundle != null)
	//*  51  104:aload_3         
	//*  52  105:ifnull          203
			for(s = ((String) (bundle.keySet().iterator())); ((Iterator) (s)).hasNext(); jsonobject.put(s1, ((Object) (((Object) (double1)).toString()))))
	//*  53  108:aload_3         
	//*  54  109:invokevirtual   #212 <Method Set Bundle.keySet()>
	//*  55  112:invokeinterface #215 <Method Iterator Set.iterator()>
	//*  56  117:astore_0        
	//*  57  118:aload_0         
	//*  58  119:invokeinterface #134 <Method boolean Iterator.hasNext()>
	//*  59  124:ifeq            203
			{
				s1 = (String)((Iterator) (s)).next();
	//   60  127:aload_0         
	//   61  128:invokeinterface #138 <Method Object Iterator.next()>
	//   62  133:checkcast       #97  <Class String>
	//   63  136:astore_1        
				validateIdentifier(s1);
	//   64  137:aload_1         
	//   65  138:invokestatic    #167 <Method void validateIdentifier(String)>
				double1 = ((Double) (bundle.get(s1)));
	//   66  141:aload_3         
	//   67  142:aload_1         
	//   68  143:invokevirtual   #219 <Method Object Bundle.get(String)>
	//   69  146:astore_2        
				if(!(double1 instanceof String) && !(double1 instanceof Number))
	//*  70  147:aload_2         
	//*  71  148:instanceof      #97  <Class String>
	//*  72  151:ifne            189
	//*  73  154:aload_2         
	//*  74  155:instanceof      #221 <Class Number>
	//*  75  158:ifeq            164
	//*  76  161:goto            189
					throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] {
						double1, s1
					}));
	//   77  164:new             #44  <Class FacebookException>
	//   78  167:dup             
	//   79  168:ldc1            #223 <String "Parameter value '%s' for key '%s' should be a string or a numeric type.">
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
	//   90  182:invokestatic    #101 <Method String String.format(String, Object[])>
	//   91  185:invokespecial   #225 <Method void FacebookException(String)>
	//   92  188:athrow          
			}

	//   93  189:aload           6
	//   94  191:aload_1         
	//   95  192:aload_2         
	//   96  193:invokevirtual   #226 <Method String Object.toString()>
	//   97  196:invokevirtual   #172 <Method JSONObject JSONObject.put(String, Object)>
	//   98  199:pop             
	//*  99  200:goto            118
		if(!flag)
	//* 100  203:iload           4
	//* 101  205:ifne            254
		{
			s1 = ((String) (LoggingBehavior.APP_EVENTS));
	//  102  208:getstatic       #232 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//  103  211:astore_1        
			if(!(jsonobject instanceof JSONObject))
	//* 104  212:aload           6
	//* 105  214:instanceof      #75  <Class JSONObject>
	//* 106  217:ifne            229
				s = jsonobject.toString();
	//  107  220:aload           6
	//  108  222:invokevirtual   #115 <Method String JSONObject.toString()>
	//  109  225:astore_0        
			else
	//* 110  226:goto            238
				s = JSONObjectInstrumentation.toString((JSONObject)jsonobject);
	//  111  229:aload           6
	//  112  231:checkcast       #75  <Class JSONObject>
	//  113  234:invokestatic    #118 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//  114  237:astore_0        
			Logger.log(((LoggingBehavior) (s1)), "AppEvents", "Created app event '%s'", new Object[] {
				s
			});
	//  115  238:aload_1         
	//  116  239:ldc1            #234 <String "AppEvents">
	//  117  241:ldc1            #236 <String "Created app event '%s'">
	//  118  243:iconst_1        
	//  119  244:anewarray       Object[]
	//  120  247:dup             
	//  121  248:iconst_0        
	//  122  249:aload_0         
	//  123  250:aastore         
	//  124  251:invokestatic    #242 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		}
		return jsonobject;
	//  125  254:aload           6
	//  126  256:areturn         
	}

	private static String md5Checksum(String s)
	{
		try
		{
			MessageDigest messagedigest = MessageDigest.getInstance("MD5");
	//    0    0:ldc1            #248 <String "MD5">
	//    1    2:invokestatic    #254 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore_1        
			s = ((String) (s.getBytes("UTF-8")));
	//    3    6:aload_0         
	//    4    7:ldc2            #256 <String "UTF-8">
	//    5   10:invokevirtual   #260 <Method byte[] String.getBytes(String)>
	//    6   13:astore_0        
			messagedigest.update(((byte []) (s)), 0, s.length);
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:aload_0         
	//   11   18:arraylength     
	//   12   19:invokevirtual   #264 <Method void MessageDigest.update(byte[], int, int)>
			s = bytesToHex(messagedigest.digest());
	//   13   22:aload_1         
	//   14   23:invokevirtual   #268 <Method byte[] MessageDigest.digest()>
	//   15   26:invokestatic    #270 <Method String bytesToHex(byte[])>
	//   16   29:astore_0        
		}
	//*  17   30:aload_0         
	//*  18   31:areturn         
	//*  19   32:astore_0        
	//*  20   33:ldc2            #272 <String "Failed to generate checksum: ">
	//*  21   36:aload_0         
	//*  22   37:invokestatic    #278 <Method void Utility.logd(String, Exception)>
	//*  23   40:ldc1            #206 <String "1">
	//*  24   42:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   43:astore_0        
		{
			Utility.logd("Failed to generate checksum: ", ((Exception) (s)));
	//   26   44:ldc2            #272 <String "Failed to generate checksum: ">
	//   27   47:aload_0         
	//   28   48:invokestatic    #278 <Method void Utility.logd(String, Exception)>
			return "0";
	//   29   51:ldc2            #280 <String "0">
	//   30   54:areturn         
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
	//*   3    5:invokevirtual   #284 <Method int String.length()>
	//*   4    8:ifeq            103
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #284 <Method int String.length()>
	//*   7   15:bipush          40
	//*   8   17:icmple          23
	//*   9   20:goto            103
		{
			boolean flag;
			synchronized(validatedIdentifiers)
	//*  10   23:getstatic       #38  <Field HashSet validatedIdentifiers>
	//*  11   26:astore_2        
	//*  12   27:aload_2         
	//*  13   28:monitorenter    
			{
				flag = validatedIdentifiers.contains(((Object) (s)));
	//   14   29:getstatic       #38  <Field HashSet validatedIdentifiers>
	//   15   32:aload_0         
	//   16   33:invokevirtual   #287 <Method boolean HashSet.contains(Object)>
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
	//*  23   44:ldc2            #289 <String "^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$">
	//*  24   47:invokevirtual   #293 <Method boolean String.matches(String)>
	//*  25   50:ifeq            75
				{
					synchronized(validatedIdentifiers)
	//*  26   53:getstatic       #38  <Field HashSet validatedIdentifiers>
	//*  27   56:astore_2        
	//*  28   57:aload_2         
	//*  29   58:monitorenter    
					{
						validatedIdentifiers.add(((Object) (s)));
	//   30   59:getstatic       #38  <Field HashSet validatedIdentifiers>
	//   31   62:aload_0         
	//   32   63:invokevirtual   #294 <Method boolean HashSet.add(Object)>
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
	//   42   75:new             #44  <Class FacebookException>
	//   43   78:dup             
	//   44   79:ldc2            #296 <String "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.">
	//   45   82:iconst_1        
	//   46   83:anewarray       Object[]
	//   47   86:dup             
	//   48   87:iconst_0        
	//   49   88:aload_0         
	//   50   89:aastore         
	//   51   90:invokestatic    #101 <Method String String.format(String, Object[])>
	//   52   93:invokespecial   #225 <Method void FacebookException(String)>
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
	//   64  109:ldc2            #298 <String "<None Provided>">
	//   65  112:astore_2        
		throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] {
			s1, Integer.valueOf(40)
		}));
	//   66  113:new             #44  <Class FacebookException>
	//   67  116:dup             
	//   68  117:getstatic       #304 <Field Locale Locale.ROOT>
	//   69  120:ldc2            #306 <String "Identifier '%s' must be less than %d characters">
	//   70  123:iconst_2        
	//   71  124:anewarray       Object[]
	//   72  127:dup             
	//   73  128:iconst_0        
	//   74  129:aload_2         
	//   75  130:aastore         
	//   76  131:dup             
	//   77  132:iconst_1        
	//   78  133:bipush          40
	//   79  135:invokestatic    #311 <Method Integer Integer.valueOf(int)>
	//   80  138:aastore         
	//   81  139:invokestatic    #314 <Method String String.format(Locale, String, Object[])>
	//   82  142:invokespecial   #225 <Method void FacebookException(String)>
	//   83  145:athrow          
	}

	private Object writeReplace()
	{
		Object obj = ((Object) (jsonObject));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field JSONObject jsonObject>
	//    2    4:astore_1        
		if(!(obj instanceof JSONObject))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #75  <Class JSONObject>
	//*   5    9:ifne            20
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #115 <Method String JSONObject.toString()>
	//    8   16:astore_1        
		else
	//*   9   17:goto            28
			obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
	//   10   20:aload_1         
	//   11   21:checkcast       #75  <Class JSONObject>
	//   12   24:invokestatic    #118 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   13   27:astore_1        
		return ((Object) (new SerializationProxyV2(((String) (obj)), isImplicit, checksum)));
	//   14   28:new             #13  <Class AppEvent$SerializationProxyV2>
	//   15   31:dup             
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #54  <Field boolean isImplicit>
	//   19   37:aload_0         
	//   20   38:getfield        #62  <Field String checksum>
	//   21   41:aconst_null     
	//   22   42:invokespecial   #317 <Method void AppEvent$SerializationProxyV2(String, boolean, String, AppEvent$1)>
	//   23   45:areturn         
	}

	public boolean getIsImplicit()
	{
		return isImplicit;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean isImplicit>
	//    2    4:ireturn         
	}

	public JSONObject getJSONObject()
	{
		return jsonObject;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field JSONObject jsonObject>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String name>
	//    2    4:areturn         
	}

	public boolean isChecksumValid()
	{
		if(checksum == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field String checksum>
	//*   2    4:ifnonnull       9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		else
			return calculateChecksum().equals(((Object) (checksum)));
	//    5    9:aload_0         
	//    6   10:invokespecial   #60  <Method String calculateChecksum()>
	//    7   13:aload_0         
	//    8   14:getfield        #62  <Field String checksum>
	//    9   17:invokevirtual   #325 <Method boolean String.equals(Object)>
	//   10   20:ireturn         
	}

	public String toString()
	{
		String s = jsonObject.optString("_eventName");
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field JSONObject jsonObject>
	//    2    4:ldc1            #73  <String "_eventName">
	//    3    6:invokevirtual   #79  <Method String JSONObject.optString(String)>
	//    4    9:astore_3        
		boolean flag = isImplicit;
	//    5   10:aload_0         
	//    6   11:getfield        #54  <Field boolean isImplicit>
	//    7   14:istore_1        
		Object obj = ((Object) (jsonObject));
	//    8   15:aload_0         
	//    9   16:getfield        #52  <Field JSONObject jsonObject>
	//   10   19:astore_2        
		if(!(obj instanceof JSONObject))
	//*  11   20:aload_2         
	//*  12   21:instanceof      #75  <Class JSONObject>
	//*  13   24:ifne            35
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//   14   27:aload_2         
	//   15   28:invokevirtual   #115 <Method String JSONObject.toString()>
	//   16   31:astore_2        
		else
	//*  17   32:goto            43
			obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
	//   18   35:aload_2         
	//   19   36:checkcast       #75  <Class JSONObject>
	//   20   39:invokestatic    #118 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   21   42:astore_2        
		return String.format("\"%s\", implicit: %b, json: %s", new Object[] {
			s, Boolean.valueOf(flag), obj
		});
	//   22   43:ldc2            #327 <String "\"%s\", implicit: %b, json: %s">
	//   23   46:iconst_3        
	//   24   47:anewarray       Object[]
	//   25   50:dup             
	//   26   51:iconst_0        
	//   27   52:aload_3         
	//   28   53:aastore         
	//   29   54:dup             
	//   30   55:iconst_1        
	//   31   56:iload_1         
	//   32   57:invokestatic    #332 <Method Boolean Boolean.valueOf(boolean)>
	//   33   60:aastore         
	//   34   61:dup             
	//   35   62:iconst_2        
	//   36   63:aload_2         
	//   37   64:aastore         
	//   38   65:invokestatic    #101 <Method String String.format(String, Object[])>
	//   39   68:areturn         
	}

	private static final long serialVersionUID = 1L;
	private static final HashSet validatedIdentifiers = new HashSet();
	private final String checksum;
	private final boolean isImplicit;
	private final JSONObject jsonObject;
	private final String name;

	static 
	{
	//    0    0:new             #33  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void HashSet()>
	//    3    7:putstatic       #38  <Field HashSet validatedIdentifiers>
	//*   4   10:return          
	}
}
