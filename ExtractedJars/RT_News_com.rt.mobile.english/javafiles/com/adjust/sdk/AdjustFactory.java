// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.content.Context;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.adjust.sdk:
//			ActivityHandler, IActivityHandler, AttributionHandler, IAttributionHandler, 
//			Logger, PackageHandler, IPackageHandler, RequestHandler, 
//			IRequestHandler, ILogger, AdjustConfig, ActivityPackage

public class AdjustFactory
{

	public AdjustFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public static IActivityHandler getActivityHandler(AdjustConfig adjustconfig)
	{
		if(activityHandler == null)
	//*   0    0:getstatic       #33  <Field IActivityHandler activityHandler>
	//*   1    3:ifnonnull       11
		{
			return ((IActivityHandler) (ActivityHandler.getInstance(adjustconfig)));
	//    2    6:aload_0         
	//    3    7:invokestatic    #39  <Method ActivityHandler ActivityHandler.getInstance(AdjustConfig)>
	//    4   10:areturn         
		} else
		{
			activityHandler.init(adjustconfig);
	//    5   11:getstatic       #33  <Field IActivityHandler activityHandler>
	//    6   14:aload_0         
	//    7   15:invokeinterface #45  <Method void IActivityHandler.init(AdjustConfig)>
			return activityHandler;
	//    8   20:getstatic       #33  <Field IActivityHandler activityHandler>
	//    9   23:areturn         
		}
	}

	public static IAttributionHandler getAttributionHandler(IActivityHandler iactivityhandler, ActivityPackage activitypackage, boolean flag, boolean flag1)
	{
		if(attributionHandler == null)
	//*   0    0:getstatic       #49  <Field IAttributionHandler attributionHandler>
	//*   1    3:ifnonnull       18
		{
			return ((IAttributionHandler) (new AttributionHandler(iactivityhandler, activitypackage, flag, flag1)));
	//    2    6:new             #51  <Class AttributionHandler>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokespecial   #54  <Method void AttributionHandler(IActivityHandler, ActivityPackage, boolean, boolean)>
	//    9   17:areturn         
		} else
		{
			attributionHandler.init(iactivityhandler, activitypackage, flag, flag1);
	//   10   18:getstatic       #49  <Field IAttributionHandler attributionHandler>
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:iload_3         
	//   15   25:invokeinterface #58  <Method void IAttributionHandler.init(IActivityHandler, ActivityPackage, boolean, boolean)>
			return attributionHandler;
	//   16   30:getstatic       #49  <Field IAttributionHandler attributionHandler>
	//   17   33:areturn         
		}
	}

	public static HttpsURLConnection getHttpsURLConnection(URL url)
		throws IOException
	{
		if(mockHttpsURLConnection == null)
	//*   0    0:getstatic       #64  <Field HttpsURLConnection mockHttpsURLConnection>
	//*   1    3:ifnonnull       14
			return (HttpsURLConnection)url.openConnection();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #70  <Method java.net.URLConnection URL.openConnection()>
	//    4   10:checkcast       #72  <Class HttpsURLConnection>
	//    5   13:areturn         
		else
			return mockHttpsURLConnection;
	//    6   14:getstatic       #64  <Field HttpsURLConnection mockHttpsURLConnection>
	//    7   17:areturn         
	}

	public static ILogger getLogger()
	{
		if(logger == null)
	//*   0    0:getstatic       #77  <Field ILogger logger>
	//*   1    3:ifnonnull       16
			logger = ((ILogger) (new Logger()));
	//    2    6:new             #79  <Class Logger>
	//    3    9:dup             
	//    4   10:invokespecial   #80  <Method void Logger()>
	//    5   13:putstatic       #77  <Field ILogger logger>
		return logger;
	//    6   16:getstatic       #77  <Field ILogger logger>
	//    7   19:areturn         
	}

	public static IPackageHandler getPackageHandler(ActivityHandler activityhandler, Context context, boolean flag)
	{
		if(packageHandler == null)
	//*   0    0:getstatic       #84  <Field IPackageHandler packageHandler>
	//*   1    3:ifnonnull       17
		{
			return ((IPackageHandler) (new PackageHandler(((IActivityHandler) (activityhandler)), context, flag)));
	//    2    6:new             #86  <Class PackageHandler>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokespecial   #89  <Method void PackageHandler(IActivityHandler, Context, boolean)>
	//    8   16:areturn         
		} else
		{
			packageHandler.init(((IActivityHandler) (activityhandler)), context, flag);
	//    9   17:getstatic       #84  <Field IPackageHandler packageHandler>
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:invokeinterface #93  <Method void IPackageHandler.init(IActivityHandler, Context, boolean)>
			return packageHandler;
	//   14   28:getstatic       #84  <Field IPackageHandler packageHandler>
	//   15   31:areturn         
		}
	}

	public static IRequestHandler getRequestHandler(IPackageHandler ipackagehandler)
	{
		if(requestHandler == null)
	//*   0    0:getstatic       #97  <Field IRequestHandler requestHandler>
	//*   1    3:ifnonnull       15
		{
			return ((IRequestHandler) (new RequestHandler(ipackagehandler)));
	//    2    6:new             #99  <Class RequestHandler>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #102 <Method void RequestHandler(IPackageHandler)>
	//    6   14:areturn         
		} else
		{
			requestHandler.init(ipackagehandler);
	//    7   15:getstatic       #97  <Field IRequestHandler requestHandler>
	//    8   18:aload_0         
	//    9   19:invokeinterface #106 <Method void IRequestHandler.init(IPackageHandler)>
			return requestHandler;
	//   10   24:getstatic       #97  <Field IRequestHandler requestHandler>
	//   11   27:areturn         
		}
	}

	public static long getSessionInterval()
	{
		if(sessionInterval == -1L)
	//*   0    0:getstatic       #110 <Field long sessionInterval>
	//*   1    3:ldc2w           #19  <Long -1L>
	//*   2    6:lcmp            
	//*   3    7:ifne            14
			return 0x1b7740L;
	//    4   10:ldc2w           #111 <Long 0x1b7740L>
	//    5   13:lreturn         
		else
			return sessionInterval;
	//    6   14:getstatic       #110 <Field long sessionInterval>
	//    7   17:lreturn         
	}

	public static long getSubsessionInterval()
	{
		if(subsessionInterval == -1L)
	//*   0    0:getstatic       #115 <Field long subsessionInterval>
	//*   1    3:ldc2w           #19  <Long -1L>
	//*   2    6:lcmp            
	//*   3    7:ifne            14
			return 1000L;
	//    4   10:ldc2w           #116 <Long 1000L>
	//    5   13:lreturn         
		else
			return subsessionInterval;
	//    6   14:getstatic       #115 <Field long subsessionInterval>
	//    7   17:lreturn         
	}

	public static long getTimerInterval()
	{
		if(timerInterval == -1L)
	//*   0    0:getstatic       #120 <Field long timerInterval>
	//*   1    3:ldc2w           #19  <Long -1L>
	//*   2    6:lcmp            
	//*   3    7:ifne            14
			return 60000L;
	//    4   10:ldc2w           #121 <Long 60000L>
	//    5   13:lreturn         
		else
			return timerInterval;
	//    6   14:getstatic       #120 <Field long timerInterval>
	//    7   17:lreturn         
	}

	public static long getTimerStart()
	{
		if(timerStart == -1L)
	//*   0    0:getstatic       #125 <Field long timerStart>
	//*   1    3:ldc2w           #19  <Long -1L>
	//*   2    6:lcmp            
	//*   3    7:ifne            12
			return 0L;
	//    4   10:lconst_0        
	//    5   11:lreturn         
		else
			return timerStart;
	//    6   12:getstatic       #125 <Field long timerStart>
	//    7   15:lreturn         
	}

	public static void setActivityHandler(IActivityHandler iactivityhandler)
	{
		activityHandler = iactivityhandler;
	//    0    0:aload_0         
	//    1    1:putstatic       #33  <Field IActivityHandler activityHandler>
	//    2    4:return          
	}

	public static void setAttributionHandler(IAttributionHandler iattributionhandler)
	{
		attributionHandler = iattributionhandler;
	//    0    0:aload_0         
	//    1    1:putstatic       #49  <Field IAttributionHandler attributionHandler>
	//    2    4:return          
	}

	public static void setLogger(ILogger ilogger)
	{
		logger = ilogger;
	//    0    0:aload_0         
	//    1    1:putstatic       #77  <Field ILogger logger>
	//    2    4:return          
	}

	public static void setMockHttpsURLConnection(HttpsURLConnection httpsurlconnection)
	{
		mockHttpsURLConnection = httpsurlconnection;
	//    0    0:aload_0         
	//    1    1:putstatic       #64  <Field HttpsURLConnection mockHttpsURLConnection>
	//    2    4:return          
	}

	public static void setPackageHandler(IPackageHandler ipackagehandler)
	{
		packageHandler = ipackagehandler;
	//    0    0:aload_0         
	//    1    1:putstatic       #84  <Field IPackageHandler packageHandler>
	//    2    4:return          
	}

	public static void setRequestHandler(IRequestHandler irequesthandler)
	{
		requestHandler = irequesthandler;
	//    0    0:aload_0         
	//    1    1:putstatic       #97  <Field IRequestHandler requestHandler>
	//    2    4:return          
	}

	public static void setSessionInterval(long l)
	{
		sessionInterval = l;
	//    0    0:lload_0         
	//    1    1:putstatic       #110 <Field long sessionInterval>
	//    2    4:return          
	}

	public static void setSubsessionInterval(long l)
	{
		subsessionInterval = l;
	//    0    0:lload_0         
	//    1    1:putstatic       #115 <Field long subsessionInterval>
	//    2    4:return          
	}

	public static void setTimerInterval(long l)
	{
		timerInterval = l;
	//    0    0:lload_0         
	//    1    1:putstatic       #120 <Field long timerInterval>
	//    2    4:return          
	}

	public static void setTimerStart(long l)
	{
		timerStart = l;
	//    0    0:lload_0         
	//    1    1:putstatic       #125 <Field long timerStart>
	//    2    4:return          
	}

	private static IActivityHandler activityHandler;
	private static IAttributionHandler attributionHandler;
	private static ILogger logger;
	private static HttpsURLConnection mockHttpsURLConnection;
	private static IPackageHandler packageHandler;
	private static IRequestHandler requestHandler;
	private static long sessionInterval = -1L;
	private static long subsessionInterval = -1L;
	private static long timerInterval = -1L;
	private static long timerStart = -1L;

	static 
	{
	//    0    0:return          
	}
}
