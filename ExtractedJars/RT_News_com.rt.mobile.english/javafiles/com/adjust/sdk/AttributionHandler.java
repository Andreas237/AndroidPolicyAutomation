// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.net.Uri;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//			IAttributionHandler, AdjustFactory, TimerOnce, ILogger, 
//			AdjustAttribution, IActivityHandler, ActivityPackage, Util

public class AttributionHandler
	implements IAttributionHandler
{

	public AttributionHandler(IActivityHandler iactivityhandler, ActivityPackage activitypackage, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		scheduler = Executors.newSingleThreadScheduledExecutor();
	//    2    4:aload_0         
	//    3    5:invokestatic    #34  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor()>
	//    4    8:putfield        #36  <Field ScheduledExecutorService scheduler>
		logger = AdjustFactory.getLogger();
	//    5   11:aload_0         
	//    6   12:invokestatic    #42  <Method ILogger AdjustFactory.getLogger()>
	//    7   15:putfield        #44  <Field ILogger logger>
		if(scheduler != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #36  <Field ScheduledExecutorService scheduler>
	//*  10   22:ifnull          51
			timer = new TimerOnce(scheduler, new Runnable() {

				public void run()
				{
					getAttributionInternal();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AttributionHandler this$0>
				//    2    4:invokestatic    #24  <Method void AttributionHandler.access$000(AttributionHandler)>
				//    3    7:return          
				}

				final AttributionHandler this$0;

			
			{
				this$0 = AttributionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AttributionHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   11   25:aload_0         
	//   12   26:new             #46  <Class TimerOnce>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #36  <Field ScheduledExecutorService scheduler>
	//   16   34:new             #8   <Class AttributionHandler$1>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #49  <Method void AttributionHandler$1(AttributionHandler)>
	//   20   42:invokespecial   #52  <Method void TimerOnce(ScheduledExecutorService, Runnable)>
	//   21   45:putfield        #54  <Field TimerOnce timer>
		else
	//*  22   48:goto            66
			logger.error("Timer not initialized, attribution handler is disabled", new Object[0]);
	//   23   51:aload_0         
	//   24   52:getfield        #44  <Field ILogger logger>
	//   25   55:ldc1            #56  <String "Timer not initialized, attribution handler is disabled">
	//   26   57:iconst_0        
	//   27   58:anewarray       Object[]
	//   28   61:invokeinterface #62  <Method void ILogger.error(String, Object[])>
		init(iactivityhandler, activitypackage, flag, flag1);
	//   29   66:aload_0         
	//   30   67:aload_1         
	//   31   68:aload_2         
	//   32   69:iload_3         
	//   33   70:iload           4
	//   34   72:invokevirtual   #65  <Method void init(IActivityHandler, ActivityPackage, boolean, boolean)>
	//   35   75:return          
	}

	private Uri buildUri(String s, Map map)
	{
		android.net.Uri.Builder builder = new android.net.Uri.Builder();
	//    0    0:new             #80  <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void android.net.Uri$Builder()>
	//    3    7:astore_3        
		builder.scheme("https");
	//    4    8:aload_3         
	//    5    9:ldc1            #83  <String "https">
	//    6   11:invokevirtual   #87  <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    7   14:pop             
		builder.authority("app.adjust.com");
	//    8   15:aload_3         
	//    9   16:ldc1            #89  <String "app.adjust.com">
	//   10   18:invokevirtual   #92  <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   11   21:pop             
		builder.appendPath(s);
	//   12   22:aload_3         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #95  <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   15   27:pop             
		for(s = ((String) (map.entrySet().iterator())); ((Iterator) (s)).hasNext(); builder.appendQueryParameter((String)((java.util.Map.Entry) (map)).getKey(), (String)((java.util.Map.Entry) (map)).getValue()))
	//*  16   28:aload_2         
	//*  17   29:invokeinterface #101 <Method Set Map.entrySet()>
	//*  18   34:invokeinterface #107 <Method Iterator Set.iterator()>
	//*  19   39:astore_1        
	//*  20   40:aload_1         
	//*  21   41:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//*  22   46:ifeq            85
			map = ((Map) ((java.util.Map.Entry)((Iterator) (s)).next()));
	//   23   49:aload_1         
	//   24   50:invokeinterface #117 <Method Object Iterator.next()>
	//   25   55:checkcast       #119 <Class java.util.Map$Entry>
	//   26   58:astore_2        

	//   27   59:aload_3         
	//   28   60:aload_2         
	//   29   61:invokeinterface #122 <Method Object java.util.Map$Entry.getKey()>
	//   30   66:checkcast       #124 <Class String>
	//   31   69:aload_2         
	//   32   70:invokeinterface #127 <Method Object java.util.Map$Entry.getValue()>
	//   33   75:checkcast       #124 <Class String>
	//   34   78:invokevirtual   #131 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   35   81:pop             
	//*  36   82:goto            40
		return builder.build();
	//   37   85:aload_3         
	//   38   86:invokevirtual   #135 <Method Uri android.net.Uri$Builder.build()>
	//   39   89:areturn         
	}

	private void checkAttributionInternal(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		AdjustAttribution adjustattribution = AdjustAttribution.fromJson(jsonobject.optJSONObject("attribution"));
	//    3    5:aload_1         
	//    4    6:ldc1            #139 <String "attribution">
	//    5    8:invokevirtual   #145 <Method JSONObject JSONObject.optJSONObject(String)>
	//    6   11:invokestatic    #151 <Method AdjustAttribution AdjustAttribution.fromJson(JSONObject)>
	//    7   14:astore          4
		long l = jsonobject.optLong("ask_in", -1L);
	//    8   16:aload_1         
	//    9   17:ldc1            #153 <String "ask_in">
	//   10   19:ldc2w           #154 <Long -1L>
	//   11   22:invokevirtual   #159 <Method long JSONObject.optLong(String, long)>
	//   12   25:lstore_2        
		if(l < 0L)
	//*  13   26:lload_2         
	//*  14   27:lconst_0        
	//*  15   28:lcmp            
	//*  16   29:ifge            55
		{
			activityHandler.tryUpdateAttribution(adjustattribution);
	//   17   32:aload_0         
	//   18   33:getfield        #161 <Field IActivityHandler activityHandler>
	//   19   36:aload           4
	//   20   38:invokeinterface #167 <Method boolean IActivityHandler.tryUpdateAttribution(AdjustAttribution)>
	//   21   43:pop             
			activityHandler.setAskingAttribution(false);
	//   22   44:aload_0         
	//   23   45:getfield        #161 <Field IActivityHandler activityHandler>
	//   24   48:iconst_0        
	//   25   49:invokeinterface #171 <Method void IActivityHandler.setAskingAttribution(boolean)>
			return;
	//   26   54:return          
		} else
		{
			activityHandler.setAskingAttribution(true);
	//   27   55:aload_0         
	//   28   56:getfield        #161 <Field IActivityHandler activityHandler>
	//   29   59:iconst_1        
	//   30   60:invokeinterface #171 <Method void IActivityHandler.setAskingAttribution(boolean)>
			getAttribution(l);
	//   31   65:aload_0         
	//   32   66:lload_2         
	//   33   67:invokespecial   #175 <Method void getAttribution(long)>
			return;
	//   34   70:return          
		}
	}

	private void getAttribution(long l)
	{
		if(timer.getFireIn() > l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field TimerOnce timer>
	//*   2    4:invokevirtual   #179 <Method long TimerOnce.getFireIn()>
	//*   3    7:lload_1         
	//*   4    8:lcmp            
	//*   5    9:ifle            13
			return;
	//    6   12:return          
		if(l != 0L)
	//*   7   13:lload_1         
	//*   8   14:lconst_0        
	//*   9   15:lcmp            
	//*  10   16:ifeq            41
			logger.debug("Waiting to query attribution in %d milliseconds", new Object[] {
				Long.valueOf(l)
			});
	//   11   19:aload_0         
	//   12   20:getfield        #44  <Field ILogger logger>
	//   13   23:ldc1            #181 <String "Waiting to query attribution in %d milliseconds">
	//   14   25:iconst_1        
	//   15   26:anewarray       Object[]
	//   16   29:dup             
	//   17   30:iconst_0        
	//   18   31:lload_1         
	//   19   32:invokestatic    #187 <Method Long Long.valueOf(long)>
	//   20   35:aastore         
	//   21   36:invokeinterface #190 <Method void ILogger.debug(String, Object[])>
		timer.startIn(l);
	//   22   41:aload_0         
	//   23   42:getfield        #54  <Field TimerOnce timer>
	//   24   45:lload_1         
	//   25   46:invokevirtual   #193 <Method void TimerOnce.startIn(long)>
	//   26   49:return          
	}

	private void getAttributionInternal()
	{
		if(!hasListener)
	//*   0    0:aload_0         
	//*   1    1:getfield        #197 <Field boolean hasListener>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(paused)
	//*   4    8:aload_0         
	//*   5    9:getfield        #199 <Field boolean paused>
	//*   6   12:ifeq            31
		{
			logger.debug("Attribution handler is paused", new Object[0]);
	//    7   15:aload_0         
	//    8   16:getfield        #44  <Field ILogger logger>
	//    9   19:ldc1            #201 <String "Attribution handler is paused">
	//   10   21:iconst_0        
	//   11   22:anewarray       Object[]
	//   12   25:invokeinterface #190 <Method void ILogger.debug(String, Object[])>
			return;
	//   13   30:return          
		}
		logger.verbose("%s", new Object[] {
			attributionPackage.getExtendedString()
		});
	//   14   31:aload_0         
	//   15   32:getfield        #44  <Field ILogger logger>
	//   16   35:ldc1            #203 <String "%s">
	//   17   37:iconst_1        
	//   18   38:anewarray       Object[]
	//   19   41:dup             
	//   20   42:iconst_0        
	//   21   43:aload_0         
	//   22   44:getfield        #205 <Field ActivityPackage attributionPackage>
	//   23   47:invokevirtual   #211 <Method String ActivityPackage.getExtendedString()>
	//   24   50:aastore         
	//   25   51:invokeinterface #214 <Method void ILogger.verbose(String, Object[])>
		JSONObject jsonobject;
		try
		{
			jsonobject = Util.readHttpResponse(Util.createGETHttpsURLConnection(buildUri(attributionPackage.getPath(), attributionPackage.getParameters()).toString(), attributionPackage.getClientSdk()));
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:getfield        #205 <Field ActivityPackage attributionPackage>
	//   29   61:invokevirtual   #217 <Method String ActivityPackage.getPath()>
	//   30   64:aload_0         
	//   31   65:getfield        #205 <Field ActivityPackage attributionPackage>
	//   32   68:invokevirtual   #221 <Method Map ActivityPackage.getParameters()>
	//   33   71:invokespecial   #223 <Method Uri buildUri(String, Map)>
	//   34   74:invokevirtual   #228 <Method String Uri.toString()>
	//   35   77:aload_0         
	//   36   78:getfield        #205 <Field ActivityPackage attributionPackage>
	//   37   81:invokevirtual   #231 <Method String ActivityPackage.getClientSdk()>
	//   38   84:invokestatic    #237 <Method javax.net.ssl.HttpsURLConnection Util.createGETHttpsURLConnection(String, String)>
	//   39   87:invokestatic    #241 <Method JSONObject Util.readHttpResponse(javax.net.ssl.HttpsURLConnection)>
	//   40   90:astore_1        
		}
	//*  41   91:aload_0         
	//*  42   92:aload_1         
	//*  43   93:invokespecial   #76  <Method void checkAttributionInternal(JSONObject)>
	//*  44   96:return          
		catch(Exception exception)
	//*  45   97:astore_1        
		{
			logger.error("Failed to get attribution (%s)", new Object[] {
				exception.getMessage()
			});
	//   46   98:aload_0         
	//   47   99:getfield        #44  <Field ILogger logger>
	//   48  102:ldc1            #243 <String "Failed to get attribution (%s)">
	//   49  104:iconst_1        
	//   50  105:anewarray       Object[]
	//   51  108:dup             
	//   52  109:iconst_0        
	//   53  110:aload_1         
	//   54  111:invokevirtual   #246 <Method String Exception.getMessage()>
	//   55  114:aastore         
	//   56  115:invokeinterface #62  <Method void ILogger.error(String, Object[])>
			return;
	//   57  120:return          
		}
		checkAttributionInternal(jsonobject);
	}

	public void checkAttribution(final JSONObject jsonResponse)
	{
		scheduler.submit(new Runnable() {

			public void run()
			{
				checkAttributionInternal(jsonResponse);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AttributionHandler this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field JSONObject val$jsonResponse>
			//    4    8:invokestatic    #29  <Method void AttributionHandler.access$100(AttributionHandler, JSONObject)>
			//    5   11:return          
			}

			final AttributionHandler this$0;
			final JSONObject val$jsonResponse;

			
			{
				this$0 = AttributionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AttributionHandler this$0>
				jsonResponse = jsonobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field JSONObject val$jsonResponse>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ScheduledExecutorService scheduler>
	//    2    4:new             #10  <Class AttributionHandler$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #249 <Method void AttributionHandler$2(AttributionHandler, JSONObject)>
	//    7   13:invokeinterface #255 <Method java.util.concurrent.Future ScheduledExecutorService.submit(Runnable)>
	//    8   18:pop             
	//    9   19:return          
	}

	public void getAttribution()
	{
		getAttribution(0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokespecial   #175 <Method void getAttribution(long)>
	//    3    5:return          
	}

	public void init(IActivityHandler iactivityhandler, ActivityPackage activitypackage, boolean flag, boolean flag1)
	{
		activityHandler = iactivityhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #161 <Field IActivityHandler activityHandler>
		attributionPackage = activitypackage;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #205 <Field ActivityPackage attributionPackage>
		paused = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #199 <Field boolean paused>
		hasListener = flag1;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #197 <Field boolean hasListener>
	//   12   21:return          
	}

	public void pauseSending()
	{
		paused = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #199 <Field boolean paused>
	//    3    5:return          
	}

	public void resumeSending()
	{
		paused = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #199 <Field boolean paused>
	//    3    5:return          
	}

	private IActivityHandler activityHandler;
	private ActivityPackage attributionPackage;
	private boolean hasListener;
	private ILogger logger;
	private boolean paused;
	private ScheduledExecutorService scheduler;
	private TimerOnce timer;


/*
	static void access$000(AttributionHandler attributionhandler)
	{
		attributionhandler.getAttributionInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void getAttributionInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$100(AttributionHandler attributionhandler, JSONObject jsonobject)
	{
		attributionhandler.checkAttributionInternal(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void checkAttributionInternal(JSONObject)>
		return;
	//    3    5:return          
	}

*/
}
