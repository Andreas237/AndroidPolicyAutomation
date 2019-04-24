// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.content.Context;

// Referenced classes of package com.adjust.sdk:
//			LogLevel, AdjustFactory, ILogger, Util, 
//			OnAttributionChangedListener

public class AdjustConfig
{

	public AdjustConfig(Context context1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		if(!isValid(context1, s, s1))
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:aload_2         
	//*   5    7:aload_3         
	//*   6    8:invokespecial   #39  <Method boolean isValid(Context, String, String)>
	//*   7   11:ifne            15
		{
			return;
	//    8   14:return          
		} else
		{
			context = context1.getApplicationContext();
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #45  <Method Context Context.getApplicationContext()>
	//   12   20:putfield        #47  <Field Context context>
			appToken = s;
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #49  <Field String appToken>
			environment = s1;
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:putfield        #51  <Field String environment>
			logLevel = LogLevel.INFO;
	//   19   33:aload_0         
	//   20   34:getstatic       #56  <Field LogLevel LogLevel.INFO>
	//   21   37:putfield        #58  <Field LogLevel logLevel>
			eventBufferingEnabled = Boolean.valueOf(false);
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:invokestatic    #64  <Method Boolean Boolean.valueOf(boolean)>
	//   25   45:putfield        #66  <Field Boolean eventBufferingEnabled>
			return;
	//   26   48:return          
		}
	}

	private static boolean checkAppToken(String s)
	{
		ILogger ilogger = AdjustFactory.getLogger();
	//    0    0:invokestatic    #75  <Method ILogger AdjustFactory.getLogger()>
	//    1    3:astore_1        
		if(s == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       22
		{
			ilogger.error("Missing App Token", new Object[0]);
	//    4    8:aload_1         
	//    5    9:ldc1            #77  <String "Missing App Token">
	//    6   11:iconst_0        
	//    7   12:anewarray       Object[]
	//    8   15:invokeinterface #83  <Method void ILogger.error(String, Object[])>
			return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
		}
		if(s.length() != 12)
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #89  <Method int String.length()>
	//*  13   26:bipush          12
	//*  14   28:icmpeq          49
		{
			ilogger.error("Malformed App Token '%s'", new Object[] {
				s
			});
	//   15   31:aload_1         
	//   16   32:ldc1            #91  <String "Malformed App Token '%s'">
	//   17   34:iconst_1        
	//   18   35:anewarray       Object[]
	//   19   38:dup             
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:aastore         
	//   23   42:invokeinterface #83  <Method void ILogger.error(String, Object[])>
			return false;
	//   24   47:iconst_0        
	//   25   48:ireturn         
		} else
		{
			return true;
	//   26   49:iconst_1        
	//   27   50:ireturn         
		}
	}

	private static boolean checkContext(Context context1)
	{
		ILogger ilogger = AdjustFactory.getLogger();
	//    0    0:invokestatic    #75  <Method ILogger AdjustFactory.getLogger()>
	//    1    3:astore_1        
		if(context1 == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       22
		{
			ilogger.error("Missing context", new Object[0]);
	//    4    8:aload_1         
	//    5    9:ldc1            #95  <String "Missing context">
	//    6   11:iconst_0        
	//    7   12:anewarray       Object[]
	//    8   15:invokeinterface #83  <Method void ILogger.error(String, Object[])>
			return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
		}
		if(!Util.checkPermission(context1, "android.permission.INTERNET"))
	//*  11   22:aload_0         
	//*  12   23:ldc1            #97  <String "android.permission.INTERNET">
	//*  13   25:invokestatic    #103 <Method boolean Util.checkPermission(Context, String)>
	//*  14   28:ifne            45
		{
			ilogger.error("Missing permission: INTERNET", new Object[0]);
	//   15   31:aload_1         
	//   16   32:ldc1            #105 <String "Missing permission: INTERNET">
	//   17   34:iconst_0        
	//   18   35:anewarray       Object[]
	//   19   38:invokeinterface #83  <Method void ILogger.error(String, Object[])>
			return false;
	//   20   43:iconst_0        
	//   21   44:ireturn         
		} else
		{
			return true;
	//   22   45:iconst_1        
	//   23   46:ireturn         
		}
	}

	private static boolean checkEnvironment(String s)
	{
		ILogger ilogger = AdjustFactory.getLogger();
	//    0    0:invokestatic    #75  <Method ILogger AdjustFactory.getLogger()>
	//    1    3:astore_1        
		if(s == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       22
		{
			ilogger.error("Missing environment", new Object[0]);
	//    4    8:aload_1         
	//    5    9:ldc1            #108 <String "Missing environment">
	//    6   11:iconst_0        
	//    7   12:anewarray       Object[]
	//    8   15:invokeinterface #83  <Method void ILogger.error(String, Object[])>
			return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
		}
		if(s.equals("sandbox"))
	//*  11   22:aload_0         
	//*  12   23:ldc1            #11  <String "sandbox">
	//*  13   25:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  14   28:ifeq            45
		{
			ilogger.Assert("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
	//   15   31:aload_1         
	//   16   32:ldc1            #114 <String "SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!">
	//   17   34:iconst_0        
	//   18   35:anewarray       Object[]
	//   19   38:invokeinterface #117 <Method void ILogger.Assert(String, Object[])>
			return true;
	//   20   43:iconst_1        
	//   21   44:ireturn         
		}
		if(s.equals("production"))
	//*  22   45:aload_0         
	//*  23   46:ldc1            #8   <String "production">
	//*  24   48:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  25   51:ifeq            68
		{
			ilogger.Assert("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
	//   26   54:aload_1         
	//   27   55:ldc1            #119 <String "PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!">
	//   28   57:iconst_0        
	//   29   58:anewarray       Object[]
	//   30   61:invokeinterface #117 <Method void ILogger.Assert(String, Object[])>
			return true;
	//   31   66:iconst_1        
	//   32   67:ireturn         
		} else
		{
			ilogger.error("Unknown environment '%s'", new Object[] {
				s
			});
	//   33   68:aload_1         
	//   34   69:ldc1            #121 <String "Unknown environment '%s'">
	//   35   71:iconst_1        
	//   36   72:anewarray       Object[]
	//   37   75:dup             
	//   38   76:iconst_0        
	//   39   77:aload_0         
	//   40   78:aastore         
	//   41   79:invokeinterface #83  <Method void ILogger.error(String, Object[])>
			return false;
	//   42   84:iconst_0        
	//   43   85:ireturn         
		}
	}

	private boolean isValid(Context context1, String s, String s1)
	{
		if(!checkAppToken(s))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #123 <Method boolean checkAppToken(String)>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(!checkEnvironment(s1))
	//*   5    9:aload_3         
	//*   6   10:invokestatic    #125 <Method boolean checkEnvironment(String)>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		return checkContext(context1);
	//   10   18:aload_1         
	//   11   19:invokestatic    #127 <Method boolean checkContext(Context)>
	//   12   22:ifne            27
	//   13   25:iconst_0        
	//   14   26:ireturn         
	//   15   27:iconst_1        
	//   16   28:ireturn         
	}

	public boolean hasListener()
	{
		return onAttributionChangedListener != null;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field OnAttributionChangedListener onAttributionChangedListener>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isValid()
	{
		return appToken != null;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String appToken>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void setDeepLinkComponent(Class class1)
	{
		deepLinkComponent = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #135 <Field Class deepLinkComponent>
	//    3    5:return          
	}

	public void setDefaultTracker(String s)
	{
		defaultTracker = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #139 <Field String defaultTracker>
	//    3    5:return          
	}

	public void setDeviceKnown(boolean flag)
	{
		deviceKnown = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #64  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #143 <Field Boolean deviceKnown>
	//    4    8:return          
	}

	public void setEventBufferingEnabled(Boolean boolean1)
	{
		eventBufferingEnabled = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field Boolean eventBufferingEnabled>
	//    3    5:return          
	}

	public void setLogLevel(LogLevel loglevel)
	{
		logLevel = loglevel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field LogLevel logLevel>
	//    3    5:return          
	}

	public void setOnAttributionChangedListener(OnAttributionChangedListener onattributionchangedlistener)
	{
		onAttributionChangedListener = onattributionchangedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field OnAttributionChangedListener onAttributionChangedListener>
	//    3    5:return          
	}

	public void setProcessName(String s)
	{
		processName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field String processName>
	//    3    5:return          
	}

	public void setSdkPrefix(String s)
	{
		sdkPrefix = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field String sdkPrefix>
	//    3    5:return          
	}

	public static final String ENVIRONMENT_PRODUCTION = "production";
	public static final String ENVIRONMENT_SANDBOX = "sandbox";
	String appToken;
	Context context;
	Class deepLinkComponent;
	String defaultTracker;
	Boolean deviceKnown;
	String environment;
	Boolean eventBufferingEnabled;
	LogLevel logLevel;
	OnAttributionChangedListener onAttributionChangedListener;
	String processName;
	String referrer;
	long referrerClickTime;
	String sdkPrefix;
}
