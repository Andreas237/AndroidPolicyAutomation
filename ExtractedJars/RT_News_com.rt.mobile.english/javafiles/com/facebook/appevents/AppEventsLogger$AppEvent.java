// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import java.io.Serializable;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static class AppEventsLogger$AppEvent
	implements Serializable
{
	private static class SerializationProxyV1
		implements Serializable
	{

		private Object readResolve()
			throws JSONException
		{
			return ((Object) (new AppEventsLogger.AppEvent(jsonString, isImplicit, ((AppEventsLogger._cls1) (null)))));
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

		private SerializationProxyV1(String s, boolean flag)
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

		SerializationProxyV1(String s, boolean flag, AppEventsLogger._cls1 _pcls1)
		{
			this(s, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void AppEventsLogger$AppEvent$SerializationProxyV1(String, boolean)>
		//    4    6:return          
		}
	}


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
		return ((Object) (new SerializationProxyV1(jsonObject.toString(), isImplicit, ((AppEventsLogger._cls1) (null)))));
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

	public AppEventsLogger$AppEvent(String s, String s1, Double double1, Bundle bundle, boolean flag)
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

	private AppEventsLogger$AppEvent(String s, boolean flag)
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

	AppEventsLogger$AppEvent(String s, boolean flag, AppEventsLogger._cls1 _pcls1)
		throws JSONException
	{
		this(s, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #161 <Method void AppEventsLogger$AppEvent(String, boolean)>
	//    4    6:return          
	}
}
