// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.os.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.SocketTimeoutException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//			IRequestHandler, AdjustFactory, ActivityPackage, ILogger, 
//			IPackageHandler, Util

public class RequestHandler extends HandlerThread
	implements IRequestHandler
{
	private static final class InternalHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			super.handleMessage(message);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void Handler.handleMessage(Message)>
			RequestHandler requesthandler = (RequestHandler)requestHandlerReference.get();
		//    3    5:aload_0         
		//    4    6:getfield        #25  <Field WeakReference requestHandlerReference>
		//    5    9:invokevirtual   #34  <Method Object WeakReference.get()>
		//    6   12:checkcast       #6   <Class RequestHandler>
		//    7   15:astore_2        
			if(requesthandler == null)
		//*   8   16:aload_2         
		//*   9   17:ifnonnull       21
				return;
		//   10   20:return          
			if(message.arg1 != 0x11ad0)
		//*  11   21:aload_1         
		//*  12   22:getfield        #39  <Field int Message.arg1>
		//*  13   25:ldc1            #10  <Int 0x11ad0>
		//*  14   27:icmpeq          31
			{
				return;
		//   15   30:return          
			} else
			{
				requesthandler.sendInternal((ActivityPackage)message.obj);
		//   16   31:aload_2         
		//   17   32:aload_1         
		//   18   33:getfield        #43  <Field Object Message.obj>
		//   19   36:checkcast       #45  <Class ActivityPackage>
		//   20   39:invokestatic    #49  <Method void RequestHandler.access$000(RequestHandler, ActivityPackage)>
				return;
		//   21   42:return          
			}
		}

		private static final int SEND = 0x11ad0;
		private final WeakReference requestHandlerReference;

		protected InternalHandler(Looper looper, RequestHandler requesthandler)
		{
			super(looper);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #18  <Method void Handler(Looper)>
			requestHandlerReference = new WeakReference(((Object) (requesthandler)));
		//    3    5:aload_0         
		//    4    6:new             #20  <Class WeakReference>
		//    5    9:dup             
		//    6   10:aload_2         
		//    7   11:invokespecial   #23  <Method void WeakReference(Object)>
		//    8   14:putfield        #25  <Field WeakReference requestHandlerReference>
		//    9   17:return          
		}
	}


	public RequestHandler(IPackageHandler ipackagehandler)
	{
		super("Adjust", 1);
	//    0    0:aload_0         
	//    1    1:ldc1            #19  <String "Adjust">
	//    2    3:iconst_1        
	//    3    4:invokespecial   #22  <Method void HandlerThread(String, int)>
		setDaemon(true);
	//    4    7:aload_0         
	//    5    8:iconst_1        
	//    6    9:invokevirtual   #26  <Method void setDaemon(boolean)>
		start();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #30  <Method void start()>
		logger = AdjustFactory.getLogger();
	//    9   16:aload_0         
	//   10   17:invokestatic    #36  <Method ILogger AdjustFactory.getLogger()>
	//   11   20:putfield        #38  <Field ILogger logger>
		internalHandler = new InternalHandler(getLooper(), this);
	//   12   23:aload_0         
	//   13   24:new             #8   <Class RequestHandler$InternalHandler>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:invokevirtual   #42  <Method Looper getLooper()>
	//   17   32:aload_0         
	//   18   33:invokespecial   #45  <Method void RequestHandler$InternalHandler(Looper, RequestHandler)>
	//   19   36:putfield        #47  <Field RequestHandler$InternalHandler internalHandler>
		init(ipackagehandler);
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #50  <Method void init(IPackageHandler)>
	//   23   44:return          
	}

	private void closePackage(ActivityPackage activitypackage, String s, Throwable throwable)
	{
		activitypackage = ((ActivityPackage) (activitypackage.getFailureMessage()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method String ActivityPackage.getFailureMessage()>
	//    2    4:astore_1        
		s = getReasonString(s, throwable);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #69  <Method String getReasonString(String, Throwable)>
	//    7   11:astore_2        
		logger.error("%s. (%s) Will retry later", new Object[] {
			activitypackage, s
		});
	//    8   12:aload_0         
	//    9   13:getfield        #38  <Field ILogger logger>
	//   10   16:ldc1            #71  <String "%s. (%s) Will retry later">
	//   11   18:iconst_2        
	//   12   19:anewarray       Object[]
	//   13   22:dup             
	//   14   23:iconst_0        
	//   15   24:aload_1         
	//   16   25:aastore         
	//   17   26:dup             
	//   18   27:iconst_1        
	//   19   28:aload_2         
	//   20   29:aastore         
	//   21   30:invokeinterface #79  <Method void ILogger.error(String, Object[])>
		packageHandler.closeFirstPackage();
	//   22   35:aload_0         
	//   23   36:getfield        #81  <Field IPackageHandler packageHandler>
	//   24   39:invokeinterface #86  <Method void IPackageHandler.closeFirstPackage()>
	//   25   44:return          
	}

	private String getReasonString(String s, Throwable throwable)
	{
		if(throwable != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          25
			return String.format(Locale.US, "%s: %s", new Object[] {
				s, throwable
			});
	//    2    4:getstatic       #92  <Field Locale Locale.US>
	//    3    7:ldc1            #94  <String "%s: %s">
	//    4    9:iconst_2        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:aload_1         
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:aload_2         
	//   13   20:aastore         
	//   14   21:invokestatic    #100 <Method String String.format(Locale, String, Object[])>
	//   15   24:areturn         
		else
			return String.format(Locale.US, "%s", new Object[] {
				s
			});
	//   16   25:getstatic       #92  <Field Locale Locale.US>
	//   17   28:ldc1            #102 <String "%s">
	//   18   30:iconst_1        
	//   19   31:anewarray       Object[]
	//   20   34:dup             
	//   21   35:iconst_0        
	//   22   36:aload_1         
	//   23   37:aastore         
	//   24   38:invokestatic    #100 <Method String String.format(Locale, String, Object[])>
	//   25   41:areturn         
	}

	private void requestFinished(JSONObject jsonobject)
		throws JSONException
	{
		if(jsonobject == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			packageHandler.closeFirstPackage();
	//    2    4:aload_0         
	//    3    5:getfield        #81  <Field IPackageHandler packageHandler>
	//    4    8:invokeinterface #86  <Method void IPackageHandler.closeFirstPackage()>
			return;
	//    5   13:return          
		} else
		{
			packageHandler.finishedTrackingActivity(jsonobject);
	//    6   14:aload_0         
	//    7   15:getfield        #81  <Field IPackageHandler packageHandler>
	//    8   18:aload_1         
	//    9   19:invokeinterface #109 <Method void IPackageHandler.finishedTrackingActivity(JSONObject)>
			packageHandler.sendNextPackage();
	//   10   24:aload_0         
	//   11   25:getfield        #81  <Field IPackageHandler packageHandler>
	//   12   28:invokeinterface #112 <Method void IPackageHandler.sendNextPackage()>
			return;
	//   13   33:return          
		}
	}

	private void sendInternal(ActivityPackage activitypackage)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("https://app.adjust.com");
	//    4    8:aload_2         
	//    5    9:ldc1            #127 <String "https://app.adjust.com">
	//    6   11:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(activitypackage.getPath());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #134 <Method String ActivityPackage.getPath()>
	//   11   20:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   13   24:aload_2         
	//   14   25:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   15   28:astore_2        
		try
		{
			requestFinished(Util.readHttpResponse(Util.createPOSTHttpsURLConnection(((String) (obj)), activitypackage.getClientSdk(), activitypackage.getParameters())));
	//   16   29:aload_0         
	//   17   30:aload_2         
	//   18   31:aload_1         
	//   19   32:invokevirtual   #140 <Method String ActivityPackage.getClientSdk()>
	//   20   35:aload_1         
	//   21   36:invokevirtual   #144 <Method java.util.Map ActivityPackage.getParameters()>
	//   22   39:invokestatic    #150 <Method javax.net.ssl.HttpsURLConnection Util.createPOSTHttpsURLConnection(String, String, java.util.Map)>
	//   23   42:invokestatic    #154 <Method JSONObject Util.readHttpResponse(javax.net.ssl.HttpsURLConnection)>
	//   24   45:invokespecial   #156 <Method void requestFinished(JSONObject)>
			return;
	//   25   48:return          
		}
	//*  26   49:astore_2        
	//*  27   50:aload_0         
	//*  28   51:aload_1         
	//*  29   52:ldc1            #158 <String "Runtime exception">
	//*  30   54:aload_2         
	//*  31   55:invokespecial   #160 <Method void sendNextPackage(ActivityPackage, String, Throwable)>
	//*  32   58:return          
	//*  33   59:astore_2        
	//*  34   60:aload_0         
	//*  35   61:aload_1         
	//*  36   62:ldc1            #162 <String "Request failed">
	//*  37   64:aload_2         
	//*  38   65:invokespecial   #164 <Method void closePackage(ActivityPackage, String, Throwable)>
	//*  39   68:return          
	//*  40   69:astore_2        
	//*  41   70:aload_0         
	//*  42   71:aload_1         
	//*  43   72:ldc1            #166 <String "Request timed out">
	//*  44   74:aload_2         
	//*  45   75:invokespecial   #164 <Method void closePackage(ActivityPackage, String, Throwable)>
	//*  46   78:return          
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  47   79:astore_2        
		{
			sendNextPackage(activitypackage, "Failed to encode parameters", ((Throwable) (unsupportedencodingexception)));
	//   48   80:aload_0         
	//   49   81:aload_1         
	//   50   82:ldc1            #168 <String "Failed to encode parameters">
	//   51   84:aload_2         
	//   52   85:invokespecial   #160 <Method void sendNextPackage(ActivityPackage, String, Throwable)>
		}
		catch(SocketTimeoutException sockettimeoutexception)
		{
			closePackage(activitypackage, "Request timed out", ((Throwable) (sockettimeoutexception)));
			return;
		}
		catch(IOException ioexception)
		{
			closePackage(activitypackage, "Request failed", ((Throwable) (ioexception)));
			return;
		}
		catch(Throwable throwable)
		{
			sendNextPackage(activitypackage, "Runtime exception", throwable);
			return;
		}
	//   53   88:return          
	}

	private void sendNextPackage(ActivityPackage activitypackage, String s, Throwable throwable)
	{
		activitypackage = ((ActivityPackage) (activitypackage.getFailureMessage()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method String ActivityPackage.getFailureMessage()>
	//    2    4:astore_1        
		s = getReasonString(s, throwable);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #69  <Method String getReasonString(String, Throwable)>
	//    7   11:astore_2        
		logger.error("%s. (%s)", new Object[] {
			activitypackage, s
		});
	//    8   12:aload_0         
	//    9   13:getfield        #38  <Field ILogger logger>
	//   10   16:ldc1            #170 <String "%s. (%s)">
	//   11   18:iconst_2        
	//   12   19:anewarray       Object[]
	//   13   22:dup             
	//   14   23:iconst_0        
	//   15   24:aload_1         
	//   16   25:aastore         
	//   17   26:dup             
	//   18   27:iconst_1        
	//   19   28:aload_2         
	//   20   29:aastore         
	//   21   30:invokeinterface #79  <Method void ILogger.error(String, Object[])>
		packageHandler.sendNextPackage();
	//   22   35:aload_0         
	//   23   36:getfield        #81  <Field IPackageHandler packageHandler>
	//   24   39:invokeinterface #112 <Method void IPackageHandler.sendNextPackage()>
	//   25   44:return          
	}

	public void init(IPackageHandler ipackagehandler)
	{
		packageHandler = ipackagehandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field IPackageHandler packageHandler>
	//    3    5:return          
	}

	public void sendPackage(ActivityPackage activitypackage)
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #177 <Method Message Message.obtain()>
	//    1    3:astore_2        
		message.arg1 = 0x11ad0;
	//    2    4:aload_2         
	//    3    5:ldc1            #178 <Int 0x11ad0>
	//    4    7:putfield        #182 <Field int Message.arg1>
		message.obj = ((Object) (activitypackage));
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:putfield        #186 <Field Object Message.obj>
		internalHandler.sendMessage(message);
	//    8   15:aload_0         
	//    9   16:getfield        #47  <Field RequestHandler$InternalHandler internalHandler>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #190 <Method boolean RequestHandler$InternalHandler.sendMessage(Message)>
	//   12   23:pop             
	//   13   24:return          
	}

	private InternalHandler internalHandler;
	private ILogger logger;
	private IPackageHandler packageHandler;


/*
	static void access$000(RequestHandler requesthandler, ActivityPackage activitypackage)
	{
		requesthandler.sendInternal(activitypackage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void sendInternal(ActivityPackage)>
		return;
	//    3    5:return          
	}

*/
}
