// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package me.pushy.sdk;

import android.content.Context;
import android.util.Log;
import me.pushy.sdk.lib.jackson.databind.ObjectMapper;
import me.pushy.sdk.model.PushyDeviceCredentials;
import me.pushy.sdk.model.api.PushyRegistrationRequest;
import me.pushy.sdk.model.api.PushyRegistrationResponse;
import me.pushy.sdk.util.PushyAuthentication;
import me.pushy.sdk.util.PushyEndpoints;
import me.pushy.sdk.util.PushyHTTP;
import me.pushy.sdk.util.PushyPermissionVerification;
import me.pushy.sdk.util.PushyPreferences;
import me.pushy.sdk.util.PushyPubSub;
import me.pushy.sdk.util.PushyServiceManager;
import me.pushy.sdk.util.PushySingleton;
import me.pushy.sdk.util.PushyStringUtils;
import me.pushy.sdk.util.exceptions.PushyException;
import me.pushy.sdk.util.exceptions.PushyFatalException;
import me.pushy.sdk.util.exceptions.PushyJsonParseException;
import me.pushy.sdk.util.exceptions.PushyRegistrationException;

public class Pushy
{

	public Pushy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static PushyDeviceCredentials getDeviceCredentials(Context context)
	{
		return PushyAuthentication.getDeviceCredentials(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method PushyDeviceCredentials PushyAuthentication.getDeviceCredentials(Context)>
	//    2    4:areturn         
	}

	public static boolean isRegistered(Context context)
	{
		return PushyAuthentication.getDeviceCredentials(context) != null;
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method PushyDeviceCredentials PushyAuthentication.getDeviceCredentials(Context)>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static void listen(Context context)
	{
		PushyServiceManager.startSocketService(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #24  <Method void PushyServiceManager.startSocketService(Context)>
	//    2    4:return          
	}

	public static String register(Context context)
	{
		PushyPermissionVerification.verifyManifestPermissions(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method void PushyPermissionVerification.verifyManifestPermissions(Context)>
		Object obj = ((Object) (PushyAuthentication.getDeviceCredentials(context)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #15  <Method PushyDeviceCredentials PushyAuthentication.getDeviceCredentials(Context)>
	//    4    8:astore_1        
		if(obj != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          92
		{
			StringBuilder stringbuilder;
			if(PushyStringUtils.stringIsNullOrEmpty(((PushyDeviceCredentials) (obj)).authKey))
	//*   7   13:aload_1         
	//*   8   14:getfield        #41  <Field String PushyDeviceCredentials.authKey>
	//*   9   17:invokestatic    #47  <Method boolean PushyStringUtils.stringIsNullOrEmpty(String)>
	//*  10   20:ifeq            75
				try
				{
					obj.authKey = PushyAuthentication.obtainDeviceAuthKey(((PushyDeviceCredentials) (obj)).token, context);
	//   11   23:aload_1         
	//   12   24:aload_1         
	//   13   25:getfield        #50  <Field String PushyDeviceCredentials.token>
	//   14   28:aload_0         
	//   15   29:invokestatic    #54  <Method String PushyAuthentication.obtainDeviceAuthKey(String, Context)>
	//   16   32:putfield        #41  <Field String PushyDeviceCredentials.authKey>
				}
	//*  17   35:goto            75
	//*  18   38:astore_0        
	//*  19   39:new             #56  <Class StringBuilder>
	//*  20   42:dup             
	//*  21   43:invokespecial   #57  <Method void StringBuilder()>
	//*  22   46:astore_1        
	//*  23   47:aload_1         
	//*  24   48:ldc1            #59  <String "Registration failed: ">
	//*  25   50:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  26   53:pop             
	//*  27   54:aload_1         
	//*  28   55:aload_0         
	//*  29   56:invokevirtual   #67  <Method String Exception.getMessage()>
	//*  30   59:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  31   62:pop             
	//*  32   63:new             #69  <Class PushyRegistrationException>
	//*  33   66:dup             
	//*  34   67:aload_1         
	//*  35   68:invokevirtual   #72  <Method String StringBuilder.toString()>
	//*  36   71:invokespecial   #75  <Method void PushyRegistrationException(String)>
	//*  37   74:athrow          
	//*  38   75:aload_1         
	//*  39   76:aload_0         
	//*  40   77:invokestatic    #79  <Method boolean PushyAuthentication.validateCredentials(PushyDeviceCredentials, Context)>
	//*  41   80:ifeq            92
	//*  42   83:aload_0         
	//*  43   84:invokestatic    #81  <Method void listen(Context)>
	//*  44   87:aload_1         
	//*  45   88:getfield        #50  <Field String PushyDeviceCredentials.token>
	//*  46   91:areturn         
	//*  47   92:new             #83  <Class PushyRegistrationRequest>
	//*  48   95:dup             
	//*  49   96:invokespecial   #84  <Method void PushyRegistrationRequest()>
	//*  50   99:astore_1        
	//*  51  100:aload_1         
	//*  52  101:aload_0         
	//*  53  102:invokevirtual   #89  <Method String Context.getPackageName()>
	//*  54  105:putfield        #92  <Field String PushyRegistrationRequest.app>
	//*  55  108:invokestatic    #98  <Method ObjectMapper PushySingleton.getJackson()>
	//*  56  111:aload_1         
	//*  57  112:invokevirtual   #104 <Method String ObjectMapper.writeValueAsString(Object)>
	//*  58  115:astore_1        
	//*  59  116:new             #56  <Class StringBuilder>
	//*  60  119:dup             
	//*  61  120:invokespecial   #57  <Method void StringBuilder()>
	//*  62  123:astore_2        
	//*  63  124:aload_2         
	//*  64  125:aload_0         
	//*  65  126:invokestatic    #109 <Method String PushyEndpoints.getAPIEndpoint(Context)>
	//*  66  129:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  67  132:pop             
	//*  68  133:aload_2         
	//*  69  134:ldc1            #111 <String "/register">
	//*  70  136:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  71  139:pop             
	//*  72  140:aload_2         
	//*  73  141:invokevirtual   #72  <Method String StringBuilder.toString()>
	//*  74  144:aload_1         
	//*  75  145:invokestatic    #117 <Method String PushyHTTP.post(String, String)>
	//*  76  148:astore_1        
	//*  77  149:invokestatic    #98  <Method ObjectMapper PushySingleton.getJackson()>
	//*  78  152:aload_1         
	//*  79  153:ldc1            #119 <Class PushyRegistrationResponse>
	//*  80  155:invokevirtual   #123 <Method Object ObjectMapper.readValue(String, Class)>
	//*  81  158:checkcast       #119 <Class PushyRegistrationResponse>
	//*  82  161:astore_1        
	//*  83  162:aload_1         
	//*  84  163:getfield        #126 <Field String PushyRegistrationResponse.error>
	//*  85  166:invokestatic    #47  <Method boolean PushyStringUtils.stringIsNullOrEmpty(String)>
	//*  86  169:ifne            208
	//*  87  172:new             #56  <Class StringBuilder>
	//*  88  175:dup             
	//*  89  176:invokespecial   #57  <Method void StringBuilder()>
	//*  90  179:astore_0        
	//*  91  180:aload_0         
	//*  92  181:ldc1            #59  <String "Registration failed: ">
	//*  93  183:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  94  186:pop             
	//*  95  187:aload_0         
	//*  96  188:aload_1         
	//*  97  189:getfield        #126 <Field String PushyRegistrationResponse.error>
	//*  98  192:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  99  195:pop             
	//* 100  196:new             #69  <Class PushyRegistrationException>
	//* 101  199:dup             
	//* 102  200:aload_0         
	//* 103  201:invokevirtual   #72  <Method String StringBuilder.toString()>
	//* 104  204:invokespecial   #75  <Method void PushyRegistrationException(String)>
	//* 105  207:athrow          
	//* 106  208:aload_1         
	//* 107  209:getfield        #127 <Field String PushyRegistrationResponse.token>
	//* 108  212:ifnull          253
	//* 109  215:aload_1         
	//* 110  216:getfield        #130 <Field String PushyRegistrationResponse.auth>
	//* 111  219:ifnonnull       225
	//* 112  222:goto            253
	//* 113  225:new             #37  <Class PushyDeviceCredentials>
	//* 114  228:dup             
	//* 115  229:aload_1         
	//* 116  230:getfield        #127 <Field String PushyRegistrationResponse.token>
	//* 117  233:aload_1         
	//* 118  234:getfield        #130 <Field String PushyRegistrationResponse.auth>
	//* 119  237:invokespecial   #133 <Method void PushyDeviceCredentials(String, String)>
	//* 120  240:aload_0         
	//* 121  241:invokestatic    #137 <Method void PushyAuthentication.saveDeviceCredentials(PushyDeviceCredentials, Context)>
	//* 122  244:aload_0         
	//* 123  245:invokestatic    #81  <Method void listen(Context)>
	//* 124  248:aload_1         
	//* 125  249:getfield        #127 <Field String PushyRegistrationResponse.token>
	//* 126  252:areturn         
	//* 127  253:new             #69  <Class PushyRegistrationException>
	//* 128  256:dup             
	//* 129  257:ldc1            #139 <String "Registration failed, please try again later.">
	//* 130  259:invokespecial   #75  <Method void PushyRegistrationException(String)>
	//* 131  262:athrow          
	//* 132  263:astore_0        
	//* 133  264:new             #141 <Class PushyJsonParseException>
	//* 134  267:dup             
	//* 135  268:aload_0         
	//* 136  269:invokevirtual   #67  <Method String Exception.getMessage()>
	//* 137  272:invokespecial   #142 <Method void PushyJsonParseException(String)>
	//* 138  275:athrow          
	//* 139  276:astore_0        
	//* 140  277:new             #141 <Class PushyJsonParseException>
	//* 141  280:dup             
	//* 142  281:aload_0         
	//* 143  282:invokevirtual   #67  <Method String Exception.getMessage()>
	//* 144  285:invokespecial   #142 <Method void PushyJsonParseException(String)>
	//* 145  288:athrow          
				catch(PushyFatalException pushyfatalexception) { }
	//  146  289:astore_2        
				// Misplaced declaration of an exception variable
				catch(Context context)
				{
					obj = ((Object) (new StringBuilder()));
					((StringBuilder) (obj)).append("Registration failed: ");
					((StringBuilder) (obj)).append(((Exception) (context)).getMessage());
					throw new PushyRegistrationException(((StringBuilder) (obj)).toString());
				}
			if(PushyAuthentication.validateCredentials(((PushyDeviceCredentials) (obj)), context))
			{
				listen(context);
				return ((PushyDeviceCredentials) (obj)).token;
			}
		}
		try
		{
			obj = ((Object) (new PushyRegistrationRequest()));
			obj.app = context.getPackageName();
			obj = ((Object) (PushySingleton.getJackson().writeValueAsString(obj)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new PushyJsonParseException(((Exception) (context)).getMessage());
		}
		stringbuilder = new StringBuilder();
		stringbuilder.append(PushyEndpoints.getAPIEndpoint(context));
		stringbuilder.append("/register");
		obj = ((Object) (PushyHTTP.post(stringbuilder.toString(), ((String) (obj)))));
		try
		{
			obj = ((Object) ((PushyRegistrationResponse)PushySingleton.getJackson().readValue(((String) (obj)), me/pushy/sdk/model/api/PushyRegistrationResponse)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new PushyJsonParseException(((Exception) (context)).getMessage());
		}
		if(!PushyStringUtils.stringIsNullOrEmpty(((PushyRegistrationResponse) (obj)).error))
		{
			context = ((Context) (new StringBuilder()));
			((StringBuilder) (context)).append("Registration failed: ");
			((StringBuilder) (context)).append(((PushyRegistrationResponse) (obj)).error);
			throw new PushyRegistrationException(((StringBuilder) (context)).toString());
		}
		if(((PushyRegistrationResponse) (obj)).token != null && ((PushyRegistrationResponse) (obj)).auth != null)
		{
			PushyAuthentication.saveDeviceCredentials(new PushyDeviceCredentials(((PushyRegistrationResponse) (obj)).token, ((PushyRegistrationResponse) (obj)).auth), context);
			listen(context);
			return ((PushyRegistrationResponse) (obj)).token;
		} else
		{
			throw new PushyRegistrationException("Registration failed, please try again later.");
		}
	//* 147  290:goto            75
	}

	public static void setDeviceCredentials(PushyDeviceCredentials pushydevicecredentials, Context context)
	{
		if(!PushyStringUtils.stringIsNullOrEmpty(pushydevicecredentials.token) && !PushyStringUtils.stringIsNullOrEmpty(pushydevicecredentials.authKey))
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field String PushyDeviceCredentials.token>
	//*   2    4:invokestatic    #47  <Method boolean PushyStringUtils.stringIsNullOrEmpty(String)>
	//*   3    7:ifne            51
	//*   4   10:aload_0         
	//*   5   11:getfield        #41  <Field String PushyDeviceCredentials.authKey>
	//*   6   14:invokestatic    #47  <Method boolean PushyStringUtils.stringIsNullOrEmpty(String)>
	//*   7   17:ifeq            23
	//*   8   20:goto            51
		{
			if(!PushyAuthentication.validateCredentials(pushydevicecredentials, context))
	//*   9   23:aload_0         
	//*  10   24:aload_1         
	//*  11   25:invokestatic    #79  <Method boolean PushyAuthentication.validateCredentials(PushyDeviceCredentials, Context)>
	//*  12   28:ifne            41
			{
				throw new PushyException("Authentication failed, please double-check the provided credentials.");
	//   13   31:new             #145 <Class PushyException>
	//   14   34:dup             
	//   15   35:ldc1            #147 <String "Authentication failed, please double-check the provided credentials.">
	//   16   37:invokespecial   #148 <Method void PushyException(String)>
	//   17   40:athrow          
			} else
			{
				PushyAuthentication.saveDeviceCredentials(pushydevicecredentials, context);
	//   18   41:aload_0         
	//   19   42:aload_1         
	//   20   43:invokestatic    #137 <Method void PushyAuthentication.saveDeviceCredentials(PushyDeviceCredentials, Context)>
				listen(context);
	//   21   46:aload_1         
	//   22   47:invokestatic    #81  <Method void listen(Context)>
				return;
	//   23   50:return          
			}
		} else
		{
			throw new PushyException("Please provide both the device token and auth key.");
	//   24   51:new             #145 <Class PushyException>
	//   25   54:dup             
	//   26   55:ldc1            #150 <String "Please provide both the device token and auth key.">
	//   27   57:invokespecial   #148 <Method void PushyException(String)>
	//   28   60:athrow          
		}
	}

	public static void setEnterpriseConfig(String s, String s1, Context context)
	{
		String s2 = s;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(s != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          29
		{
			s2 = s;
	//    4    6:aload_0         
	//    5    7:astore_3        
			if(s.endsWith("/"))
	//*   6    8:aload_0         
	//*   7    9:ldc1            #154 <String "/">
	//*   8   11:invokevirtual   #159 <Method boolean String.endsWith(String)>
	//*   9   14:ifeq            29
				s2 = s.substring(0, s.length() - 1);
	//   10   17:aload_0         
	//   11   18:iconst_0        
	//   12   19:aload_0         
	//   13   20:invokevirtual   #163 <Method int String.length()>
	//   14   23:iconst_1        
	//   15   24:isub            
	//   16   25:invokevirtual   #167 <Method String String.substring(int, int)>
	//   17   28:astore_3        
		}
		s = s1;
	//   18   29:aload_1         
	//   19   30:astore_0        
		if(s1 != null)
	//*  20   31:aload_1         
	//*  21   32:ifnull          58
		{
			s = s1;
	//   22   35:aload_1         
	//   23   36:astore_0        
			if(s1.endsWith("/"))
	//*  24   37:aload_1         
	//*  25   38:ldc1            #154 <String "/">
	//*  26   40:invokevirtual   #159 <Method boolean String.endsWith(String)>
	//*  27   43:ifeq            58
				s = s1.substring(0, s1.length() - 1);
	//   28   46:aload_1         
	//   29   47:iconst_0        
	//   30   48:aload_1         
	//   31   49:invokevirtual   #163 <Method int String.length()>
	//   32   52:iconst_1        
	//   33   53:isub            
	//   34   54:invokevirtual   #167 <Method String String.substring(int, int)>
	//   35   57:astore_0        
		}
		if(!PushyStringUtils.equals(PushyPreferences.getString("pushyEnterpriseMQTTEndpoint", ((String) (null)), context), s))
	//*  36   58:ldc1            #169 <String "pushyEnterpriseMQTTEndpoint">
	//*  37   60:aconst_null     
	//*  38   61:aload_2         
	//*  39   62:invokestatic    #175 <Method String PushyPreferences.getString(String, String, Context)>
	//*  40   65:aload_0         
	//*  41   66:invokestatic    #179 <Method boolean PushyStringUtils.equals(String, String)>
	//*  42   69:ifne            84
		{
			Log.d("Pushy", "New enterprise MQTT endpoint, stopping socket service");
	//   43   72:ldc1            #181 <String "Pushy">
	//   44   74:ldc1            #183 <String "New enterprise MQTT endpoint, stopping socket service">
	//   45   76:invokestatic    #189 <Method int Log.d(String, String)>
	//   46   79:pop             
			PushyServiceManager.stopSocketService(context);
	//   47   80:aload_2         
	//   48   81:invokestatic    #192 <Method void PushyServiceManager.stopSocketService(Context)>
		}
		PushyPreferences.saveString("pushyEnterpriseAPIEndpoint", s2, context);
	//   49   84:ldc1            #194 <String "pushyEnterpriseAPIEndpoint">
	//   50   86:aload_3         
	//   51   87:aload_2         
	//   52   88:invokestatic    #197 <Method void PushyPreferences.saveString(String, String, Context)>
		PushyPreferences.saveString("pushyEnterpriseMQTTEndpoint", s, context);
	//   53   91:ldc1            #169 <String "pushyEnterpriseMQTTEndpoint">
	//   54   93:aload_0         
	//   55   94:aload_2         
	//   56   95:invokestatic    #197 <Method void PushyPreferences.saveString(String, String, Context)>
	//   57   98:return          
	}

	public static void setHeartbeatInterval(int i, Context context)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_2        
		if(i < 60)
	//*   2    2:iload_0         
	//*   3    3:bipush          60
	//*   4    5:icmpge          19
		{
			Log.e("Pushy", "The minimum heartbeat interval is 60 seconds.");
	//    5    8:ldc1            #181 <String "Pushy">
	//    6   10:ldc1            #201 <String "The minimum heartbeat interval is 60 seconds.">
	//    7   12:invokestatic    #204 <Method int Log.e(String, String)>
	//    8   15:pop             
			j = 60;
	//    9   16:bipush          60
	//   10   18:istore_2        
		}
		PushyPreferences.saveInt("pushyKeepAliveInterval", j, context);
	//   11   19:ldc1            #206 <String "pushyKeepAliveInterval">
	//   12   21:iload_2         
	//   13   22:aload_1         
	//   14   23:invokestatic    #210 <Method void PushyPreferences.saveInt(String, int, Context)>
	//   15   26:return          
	}

	public static void subscribe(String s, Context context)
	{
		subscribe(new String[] {
			s
		}, context);
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:aload_1         
	//    7    9:invokestatic    #215 <Method void subscribe(String[], Context)>
	//    8   12:return          
	}

	public static void subscribe(String as[], Context context)
	{
		PushyPubSub.subscribe(as, context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #218 <Method void PushyPubSub.subscribe(String[], Context)>
	//    3    5:return          
	}

	public static void toggleDirectConnectivity(boolean flag, Context context)
	{
		PushyPreferences.saveBoolean("pushyDirectConnectivity", flag, context);
	//    0    0:ldc1            #222 <String "pushyDirectConnectivity">
	//    1    2:iload_0         
	//    2    3:aload_1         
	//    3    4:invokestatic    #226 <Method void PushyPreferences.saveBoolean(String, boolean, Context)>
	//    4    7:return          
	}

	public static void toggleNotifications(boolean flag, Context context)
	{
		PushyPreferences.saveBoolean("pushyNotificationsEnabled", flag, context);
	//    0    0:ldc1            #229 <String "pushyNotificationsEnabled">
	//    1    2:iload_0         
	//    2    3:aload_1         
	//    3    4:invokestatic    #226 <Method void PushyPreferences.saveBoolean(String, boolean, Context)>
		if(flag)
	//*   4    7:iload_0         
	//*   5    8:ifeq            16
		{
			PushyServiceManager.startSocketService(context);
	//    6   11:aload_1         
	//    7   12:invokestatic    #24  <Method void PushyServiceManager.startSocketService(Context)>
			return;
	//    8   15:return          
		} else
		{
			PushyServiceManager.stopSocketService(context);
	//    9   16:aload_1         
	//   10   17:invokestatic    #192 <Method void PushyServiceManager.stopSocketService(Context)>
			return;
	//   11   20:return          
		}
	}

	public static void togglePermissionVerification(boolean flag, Context context)
	{
		PushyPreferences.saveBoolean("pushyPermissionVerification", flag, context);
	//    0    0:ldc1            #232 <String "pushyPermissionVerification">
	//    1    2:iload_0         
	//    2    3:aload_1         
	//    3    4:invokestatic    #226 <Method void PushyPreferences.saveBoolean(String, boolean, Context)>
	//    4    7:return          
	}

	public static void toggleWifiPolicyCompliance(boolean flag, Context context)
	{
		PushyPreferences.saveBoolean("pushyWifiPolicyCompliance", flag, context);
	//    0    0:ldc1            #235 <String "pushyWifiPolicyCompliance">
	//    1    2:iload_0         
	//    2    3:aload_1         
	//    3    4:invokestatic    #226 <Method void PushyPreferences.saveBoolean(String, boolean, Context)>
	//    4    7:return          
	}

	public static void unsubscribe(String s, Context context)
	{
		unsubscribe(new String[] {
			s
		}, context);
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:aload_1         
	//    7    9:invokestatic    #238 <Method void unsubscribe(String[], Context)>
	//    8   12:return          
	}

	public static void unsubscribe(String as[], Context context)
	{
		PushyPubSub.unsubscribe(as, context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #239 <Method void PushyPubSub.unsubscribe(String[], Context)>
	//    3    5:return          
	}
}
