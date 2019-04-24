// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.*;
import java.lang.ref.WeakReference;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//			IActivityHandler, AdjustFactory, AdjustAttribution, ILogger, 
//			PackageBuilder, ActivityState, IAttributionHandler, AdjustEvent, 
//			IPackageHandler, AdjustConfig, DeviceInfo, LogLevel, 
//			Util, TimerCycle, ActivityPackage, OnAttributionChangedListener

public class ActivityHandler extends HandlerThread
	implements IActivityHandler
{
	private class ReferrerClickTime
	{

		long clickTime;
		String referrer;
		final ActivityHandler this$0;

		ReferrerClickTime(String s, long l)
		{
			this$0 = ActivityHandler.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ActivityHandler this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			referrer = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String referrer>
			clickTime = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #24  <Field long clickTime>
		//   11   19:return          
		}
	}

	private static final class SessionHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			super.handleMessage(message);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #48  <Method void Handler.handleMessage(Message)>
			ActivityHandler activityhandler = (ActivityHandler)sessionHandlerReference.get();
		//    3    5:aload_0         
		//    4    6:getfield        #43  <Field WeakReference sessionHandlerReference>
		//    5    9:invokevirtual   #52  <Method Object WeakReference.get()>
		//    6   12:checkcast       #6   <Class ActivityHandler>
		//    7   15:astore_2        
			if(activityhandler == null)
		//*   8   16:aload_2         
		//*   9   17:ifnonnull       21
				return;
		//   10   20:return          
			switch(message.arg1)
		//*  11   21:aload_1         
		//*  12   22:getfield        #57  <Field int Message.arg1>
			{
		//*  13   25:tableswitch     72631 72639: default 76
		//		               72631 163
		//		               72632 158
		//		               72633 153
		//		               72634 141
		//		               72635 129
		//		               72636 108
		//		               72637 87
		//		               72638 82
		//		               72639 77
			default:
				return;
		//   14   76:return          

			case 72639: 
				activityhandler.timerFiredInternal();
		//   15   77:aload_2         
		//   16   78:invokestatic    #61  <Method void ActivityHandler.access$1000(ActivityHandler)>
				return;
		//   17   81:return          

			case 72638: 
				activityhandler.updateHandlersStatusInternal();
		//   18   82:aload_2         
		//   19   83:invokestatic    #64  <Method void ActivityHandler.access$900(ActivityHandler)>
				return;
		//   20   86:return          

			case 72637: 
				message = ((Message) ((ReferrerClickTime)message.obj));
		//   21   87:aload_1         
		//   22   88:getfield        #68  <Field Object Message.obj>
		//   23   91:checkcast       #70  <Class ActivityHandler$ReferrerClickTime>
		//   24   94:astore_1        
				activityhandler.sendReferrerInternal(((ReferrerClickTime) (message)).referrer, ((ReferrerClickTime) (message)).clickTime);
		//   25   95:aload_2         
		//   26   96:aload_1         
		//   27   97:getfield        #74  <Field String ActivityHandler$ReferrerClickTime.referrer>
		//   28  100:aload_1         
		//   29  101:getfield        #78  <Field long ActivityHandler$ReferrerClickTime.clickTime>
		//   30  104:invokestatic    #82  <Method void ActivityHandler.access$800(ActivityHandler, String, long)>
				return;
		//   31  107:return          

			case 72636: 
				message = ((Message) ((UrlClickTime)message.obj));
		//   32  108:aload_1         
		//   33  109:getfield        #68  <Field Object Message.obj>
		//   34  112:checkcast       #84  <Class ActivityHandler$UrlClickTime>
		//   35  115:astore_1        
				activityhandler.readOpenUrlInternal(((UrlClickTime) (message)).url, ((UrlClickTime) (message)).clickTime);
		//   36  116:aload_2         
		//   37  117:aload_1         
		//   38  118:getfield        #88  <Field Uri ActivityHandler$UrlClickTime.url>
		//   39  121:aload_1         
		//   40  122:getfield        #89  <Field long ActivityHandler$UrlClickTime.clickTime>
		//   41  125:invokestatic    #93  <Method void ActivityHandler.access$700(ActivityHandler, Uri, long)>
				return;
		//   42  128:return          

			case 72635: 
				activityhandler.finishedTrackingActivityInternal((JSONObject)message.obj);
		//   43  129:aload_2         
		//   44  130:aload_1         
		//   45  131:getfield        #68  <Field Object Message.obj>
		//   46  134:checkcast       #95  <Class JSONObject>
		//   47  137:invokestatic    #99  <Method void ActivityHandler.access$600(ActivityHandler, JSONObject)>
				return;
		//   48  140:return          

			case 72634: 
				activityhandler.trackEventInternal((AdjustEvent)message.obj);
		//   49  141:aload_2         
		//   50  142:aload_1         
		//   51  143:getfield        #68  <Field Object Message.obj>
		//   52  146:checkcast       #101 <Class AdjustEvent>
		//   53  149:invokestatic    #105 <Method void ActivityHandler.access$500(ActivityHandler, AdjustEvent)>
				return;
		//   54  152:return          

			case 72633: 
				activityhandler.endInternal();
		//   55  153:aload_2         
		//   56  154:invokestatic    #108 <Method void ActivityHandler.access$400(ActivityHandler)>
				return;
		//   57  157:return          

			case 72632: 
				activityhandler.startInternal();
		//   58  158:aload_2         
		//   59  159:invokestatic    #111 <Method void ActivityHandler.access$300(ActivityHandler)>
				return;
		//   60  162:return          

			case 72631: 
				activityhandler.initInternal();
		//   61  163:aload_2         
		//   62  164:invokestatic    #114 <Method void ActivityHandler.access$200(ActivityHandler)>
				return;
		//   63  167:return          
			}
		}

		private static final int BASE_ADDRESS = 0x11bb6;
		private static final int DEEP_LINK = 0x11bbc;
		private static final int END = 0x11bb9;
		private static final int EVENT = 0x11bba;
		private static final int FINISH_TRACKING = 0x11bbb;
		private static final int INIT = 0x11bb7;
		private static final int SEND_REFERRER = 0x11bbd;
		private static final int START = 0x11bb8;
		private static final int TIMER_FIRED = 0x11bbf;
		private static final int UPDATE_HANDLERS_STATUS = 0x11bbe;
		private final WeakReference sessionHandlerReference;

		protected SessionHandler(Looper looper, ActivityHandler activityhandler)
		{
			super(looper);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void Handler(Looper)>
			sessionHandlerReference = new WeakReference(((Object) (activityhandler)));
		//    3    5:aload_0         
		//    4    6:new             #38  <Class WeakReference>
		//    5    9:dup             
		//    6   10:aload_2         
		//    7   11:invokespecial   #41  <Method void WeakReference(Object)>
		//    8   14:putfield        #43  <Field WeakReference sessionHandlerReference>
		//    9   17:return          
		}
	}

	private class UrlClickTime
	{

		long clickTime;
		final ActivityHandler this$0;
		Uri url;

		UrlClickTime(Uri uri, long l)
		{
			this$0 = ActivityHandler.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ActivityHandler this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			url = uri;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Uri url>
			clickTime = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #24  <Field long clickTime>
		//   11   19:return          
		}
	}


	private ActivityHandler(AdjustConfig adjustconfig)
	{
		super("Adjust", 1);
	//    0    0:aload_0         
	//    1    1:ldc1            #64  <String "Adjust">
	//    2    3:iconst_1        
	//    3    4:invokespecial   #67  <Method void HandlerThread(String, int)>
		setDaemon(true);
	//    4    7:aload_0         
	//    5    8:iconst_1        
	//    6    9:invokevirtual   #71  <Method void setDaemon(boolean)>
		start();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #75  <Method void start()>
		logger = AdjustFactory.getLogger();
	//    9   16:aload_0         
	//   10   17:invokestatic    #81  <Method ILogger AdjustFactory.getLogger()>
	//   11   20:putfield        #83  <Field ILogger logger>
		sessionHandler = new SessionHandler(getLooper(), this);
	//   12   23:aload_0         
	//   13   24:new             #15  <Class ActivityHandler$SessionHandler>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:invokevirtual   #87  <Method Looper getLooper()>
	//   17   32:aload_0         
	//   18   33:invokespecial   #90  <Method void ActivityHandler$SessionHandler(Looper, ActivityHandler)>
	//   19   36:putfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
		enabled = true;
	//   20   39:aload_0         
	//   21   40:iconst_1        
	//   22   41:putfield        #94  <Field boolean enabled>
		init(adjustconfig);
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:invokevirtual   #97  <Method void init(AdjustConfig)>
		adjustconfig = ((AdjustConfig) (Message.obtain()));
	//   26   49:invokestatic    #103 <Method Message Message.obtain()>
	//   27   52:astore_1        
		adjustconfig.arg1 = 0x11bb7;
	//   28   53:aload_1         
	//   29   54:ldc1            #104 <Int 0x11bb7>
	//   30   56:putfield        #108 <Field int Message.arg1>
		sessionHandler.sendMessage(((Message) (adjustconfig)));
	//   31   59:aload_0         
	//   32   60:getfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
	//   33   63:aload_1         
	//   34   64:invokevirtual   #112 <Method boolean ActivityHandler$SessionHandler.sendMessage(Message)>
	//   35   67:pop             
	//   36   68:return          
	}

	private ActivityPackage buildQueryStringClickPackage(String s, String s1, long l)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    4    6:new             #174 <Class LinkedHashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #176 <Method void LinkedHashMap()>
	//    7   13:astore          10
		AdjustAttribution adjustattribution = new AdjustAttribution();
	//    8   15:new             #178 <Class AdjustAttribution>
	//    9   18:dup             
	//   10   19:invokespecial   #179 <Method void AdjustAttribution()>
	//   11   22:astore          11
		Object obj = ((Object) (logger));
	//   12   24:aload_0         
	//   13   25:getfield        #83  <Field ILogger logger>
	//   14   28:astore          12
		int i = 0;
	//   15   30:iconst_0        
	//   16   31:istore          5
		((ILogger) (obj)).verbose("Reading query string (%s) from %s", new Object[] {
			s, s1
		});
	//   17   33:aload           12
	//   18   35:ldc1            #181 <String "Reading query string (%s) from %s">
	//   19   37:iconst_2        
	//   20   38:anewarray       Object[]
	//   21   41:dup             
	//   22   42:iconst_0        
	//   23   43:aload_1         
	//   24   44:aastore         
	//   25   45:dup             
	//   26   46:iconst_1        
	//   27   47:aload_2         
	//   28   48:aastore         
	//   29   49:invokeinterface #189 <Method void ILogger.verbose(String, Object[])>
		String as[] = s.split("&");
	//   30   54:aload_1         
	//   31   55:ldc1            #191 <String "&">
	//   32   57:invokevirtual   #197 <Method String[] String.split(String)>
	//   33   60:astore          12
		int j = as.length;
	//   34   62:aload           12
	//   35   64:arraylength     
	//   36   65:istore          7
		boolean flag = false;
	//   37   67:iconst_0        
	//   38   68:istore          6
		for(; i < j; i++)
	//*  39   70:iload           5
	//*  40   72:iload           7
	//*  41   74:icmpge          105
			if(readQueryString(as[i], ((Map) (linkedhashmap)), adjustattribution))
	//*  42   77:aload_0         
	//*  43   78:aload           12
	//*  44   80:iload           5
	//*  45   82:aaload          
	//*  46   83:aload           10
	//*  47   85:aload           11
	//*  48   87:invokespecial   #201 <Method boolean readQueryString(String, Map, AdjustAttribution)>
	//*  49   90:ifeq            96
				flag = true;
	//   50   93:iconst_1        
	//   51   94:istore          6

	//   52   96:iload           5
	//   53   98:iconst_1        
	//   54   99:iadd            
	//   55  100:istore          5
	//*  56  102:goto            70
		if(!flag)
	//*  57  105:iload           6
	//*  58  107:ifne            112
			return null;
	//   59  110:aconst_null     
	//   60  111:areturn         
		as = ((String []) ((String)((Map) (linkedhashmap)).remove("reftag")));
	//   61  112:aload           10
	//   62  114:ldc1            #203 <String "reftag">
	//   63  116:invokeinterface #209 <Method Object Map.remove(Object)>
	//   64  121:checkcast       #193 <Class String>
	//   65  124:astore          12
		long l1 = System.currentTimeMillis();
	//   66  126:invokestatic    #215 <Method long System.currentTimeMillis()>
	//   67  129:lstore          8
		PackageBuilder packagebuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, l1);
	//   68  131:new             #217 <Class PackageBuilder>
	//   69  134:dup             
	//   70  135:aload_0         
	//   71  136:getfield        #121 <Field AdjustConfig adjustConfig>
	//   72  139:aload_0         
	//   73  140:getfield        #219 <Field DeviceInfo deviceInfo>
	//   74  143:aload_0         
	//   75  144:getfield        #221 <Field ActivityState activityState>
	//   76  147:lload           8
	//   77  149:invokespecial   #224 <Method void PackageBuilder(AdjustConfig, DeviceInfo, ActivityState, long)>
	//   78  152:astore          13
		packagebuilder.extraParameters = ((Map) (linkedhashmap));
	//   79  154:aload           13
	//   80  156:aload           10
	//   81  158:putfield        #228 <Field Map PackageBuilder.extraParameters>
		packagebuilder.attribution = adjustattribution;
	//   82  161:aload           13
	//   83  163:aload           11
	//   84  165:putfield        #229 <Field AdjustAttribution PackageBuilder.attribution>
		packagebuilder.reftag = ((String) (as));
	//   85  168:aload           13
	//   86  170:aload           12
	//   87  172:putfield        #231 <Field String PackageBuilder.reftag>
		if(s1 == "reftag")
	//*  88  175:aload_2         
	//*  89  176:ldc1            #203 <String "reftag">
	//*  90  178:if_acmpne       187
			packagebuilder.referrer = s;
	//   91  181:aload           13
	//   92  183:aload_1         
	//   93  184:putfield        #234 <Field String PackageBuilder.referrer>
		return packagebuilder.buildClickPackage(s1, l);
	//   94  187:aload           13
	//   95  189:aload_2         
	//   96  190:lload_3         
	//   97  191:invokevirtual   #238 <Method ActivityPackage PackageBuilder.buildClickPackage(String, long)>
	//   98  194:areturn         
	}

	private boolean checkActivityState(ActivityState activitystate)
	{
		if(activitystate == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       21
		{
			logger.error("Missing activity state.", new Object[0]);
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field ILogger logger>
	//    4    8:ldc1            #242 <String "Missing activity state.">
	//    5   10:iconst_0        
	//    6   11:anewarray       Object[]
	//    7   14:invokeinterface #245 <Method void ILogger.error(String, Object[])>
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
		} else
		{
			return true;
	//   10   21:iconst_1        
	//   11   22:ireturn         
		}
	}

	private void checkAttributionState()
	{
		if(!checkActivityState(activityState))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #221 <Field ActivityState activityState>
	//*   3    5:invokespecial   #248 <Method boolean checkActivityState(ActivityState)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		if(activityState.subsessionCount <= 1)
	//*   6   12:aload_0         
	//*   7   13:getfield        #221 <Field ActivityState activityState>
	//*   8   16:getfield        #253 <Field int ActivityState.subsessionCount>
	//*   9   19:iconst_1        
	//*  10   20:icmpgt          24
			return;
	//   11   23:return          
		if(attribution != null && !activityState.askingAttribution)
	//*  12   24:aload_0         
	//*  13   25:getfield        #117 <Field AdjustAttribution attribution>
	//*  14   28:ifnull          42
	//*  15   31:aload_0         
	//*  16   32:getfield        #221 <Field ActivityState activityState>
	//*  17   35:getfield        #256 <Field boolean ActivityState.askingAttribution>
	//*  18   38:ifne            42
		{
			return;
	//   19   41:return          
		} else
		{
			attributionHandler.getAttribution();
	//   20   42:aload_0         
	//   21   43:getfield        #258 <Field IAttributionHandler attributionHandler>
	//   22   46:invokeinterface #263 <Method void IAttributionHandler.getAttribution()>
			return;
	//   23   51:return          
		}
	}

	private boolean checkEvent(AdjustEvent adjustevent)
	{
		if(adjustevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       22
		{
			logger.error("Event missing", new Object[0]);
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field ILogger logger>
	//    4    8:ldc2            #267 <String "Event missing">
	//    5   11:iconst_0        
	//    6   12:anewarray       Object[]
	//    7   15:invokeinterface #245 <Method void ILogger.error(String, Object[])>
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		}
		if(!adjustevent.isValid())
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #273 <Method boolean AdjustEvent.isValid()>
	//*  12   26:ifne            47
		{
			logger.error("Event not initialized correctly", new Object[0]);
	//   13   29:aload_0         
	//   14   30:getfield        #83  <Field ILogger logger>
	//   15   33:ldc2            #275 <String "Event not initialized correctly">
	//   16   36:iconst_0        
	//   17   37:anewarray       Object[]
	//   18   40:invokeinterface #245 <Method void ILogger.error(String, Object[])>
			return false;
	//   19   45:iconst_0        
	//   20   46:ireturn         
		} else
		{
			return true;
	//   21   47:iconst_1        
	//   22   48:ireturn         
		}
	}

	public static boolean deleteActivityState(Context context)
	{
		return context.deleteFile("AdjustIoActivityState");
	//    0    0:aload_0         
	//    1    1:ldc2            #279 <String "AdjustIoActivityState">
	//    2    4:invokevirtual   #285 <Method boolean Context.deleteFile(String)>
	//    3    7:ireturn         
	}

	public static boolean deleteAttribution(Context context)
	{
		return context.deleteFile("AdjustAttribution");
	//    0    0:aload_0         
	//    1    1:ldc2            #288 <String "AdjustAttribution">
	//    2    4:invokevirtual   #285 <Method boolean Context.deleteFile(String)>
	//    3    7:ireturn         
	}

	private void endInternal()
	{
		packageHandler.pauseSending();
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field IPackageHandler packageHandler>
	//    2    4:invokeinterface #295 <Method void IPackageHandler.pauseSending()>
		attributionHandler.pauseSending();
	//    3    9:aload_0         
	//    4   10:getfield        #258 <Field IAttributionHandler attributionHandler>
	//    5   13:invokeinterface #296 <Method void IAttributionHandler.pauseSending()>
		stopTimer();
	//    6   18:aload_0         
	//    7   19:invokespecial   #299 <Method void stopTimer()>
		if(updateActivityState(System.currentTimeMillis()))
	//*   8   22:aload_0         
	//*   9   23:invokestatic    #215 <Method long System.currentTimeMillis()>
	//*  10   26:invokespecial   #303 <Method boolean updateActivityState(long)>
	//*  11   29:ifeq            36
			writeActivityState();
	//   12   32:aload_0         
	//   13   33:invokespecial   #306 <Method void writeActivityState()>
	//   14   36:return          
	}

	private void finishedTrackingActivityInternal(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			launchDeeplinkMain(jsonobject.optString("deeplink", ((String) (null))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc2            #308 <String "deeplink">
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #314 <Method String JSONObject.optString(String, String)>
	//    8   14:invokespecial   #318 <Method void launchDeeplinkMain(String)>
			attributionHandler.checkAttribution(jsonobject);
	//    9   17:aload_0         
	//   10   18:getfield        #258 <Field IAttributionHandler attributionHandler>
	//   11   21:aload_1         
	//   12   22:invokeinterface #321 <Method void IAttributionHandler.checkAttribution(JSONObject)>
			return;
	//   13   27:return          
		}
	}

	public static ActivityHandler getInstance(AdjustConfig adjustconfig)
	{
label0:
		{
			if(adjustconfig == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       21
			{
				AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
	//    2    4:invokestatic    #81  <Method ILogger AdjustFactory.getLogger()>
	//    3    7:ldc2            #325 <String "AdjustConfig missing">
	//    4   10:iconst_0        
	//    5   11:anewarray       Object[]
	//    6   14:invokeinterface #245 <Method void ILogger.error(String, Object[])>
				return null;
	//    7   19:aconst_null     
	//    8   20:areturn         
			}
			if(!adjustconfig.isValid())
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #328 <Method boolean AdjustConfig.isValid()>
	//*  11   25:ifne            45
			{
				AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
	//   12   28:invokestatic    #81  <Method ILogger AdjustFactory.getLogger()>
	//   13   31:ldc2            #330 <String "AdjustConfig not initialized correctly">
	//   14   34:iconst_0        
	//   15   35:anewarray       Object[]
	//   16   38:invokeinterface #245 <Method void ILogger.error(String, Object[])>
				return null;
	//   17   43:aconst_null     
	//   18   44:areturn         
			}
			if(adjustconfig.processName == null)
				break label0;
	//   19   45:aload_0         
	//   20   46:getfield        #333 <Field String AdjustConfig.processName>
	//   21   49:ifnull          151
			int i = Process.myPid();
	//   22   52:invokestatic    #339 <Method int Process.myPid()>
	//   23   55:istore_1        
			Object obj = ((Object) ((ActivityManager)adjustconfig.context.getSystemService("activity")));
	//   24   56:aload_0         
	//   25   57:getfield        #343 <Field Context AdjustConfig.context>
	//   26   60:ldc2            #345 <String "activity">
	//   27   63:invokevirtual   #349 <Method Object Context.getSystemService(String)>
	//   28   66:checkcast       #351 <Class ActivityManager>
	//   29   69:astore_2        
			if(obj == null)
	//*  30   70:aload_2         
	//*  31   71:ifnonnull       76
				return null;
	//   32   74:aconst_null     
	//   33   75:areturn         
			obj = ((Object) (((ActivityManager) (obj)).getRunningAppProcesses().iterator()));
	//   34   76:aload_2         
	//   35   77:invokevirtual   #355 <Method List ActivityManager.getRunningAppProcesses()>
	//   36   80:invokeinterface #361 <Method Iterator List.iterator()>
	//   37   85:astore_2        
			android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   38   86:aload_2         
	//   39   87:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//   40   92:ifeq            151
				runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
	//   41   95:aload_2         
	//   42   96:invokeinterface #370 <Method Object Iterator.next()>
	//   43  101:checkcast       #372 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//   44  104:astore_3        
			} while(runningappprocessinfo.pid != i);
	//   45  105:aload_3         
	//   46  106:getfield        #375 <Field int android.app.ActivityManager$RunningAppProcessInfo.pid>
	//   47  109:iload_1         
	//   48  110:icmpne          86
			if(!runningappprocessinfo.processName.equalsIgnoreCase(adjustconfig.processName))
	//*  49  113:aload_3         
	//*  50  114:getfield        #376 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//*  51  117:aload_0         
	//*  52  118:getfield        #333 <Field String AdjustConfig.processName>
	//*  53  121:invokevirtual   #379 <Method boolean String.equalsIgnoreCase(String)>
	//*  54  124:ifne            151
			{
				AdjustFactory.getLogger().info("Skipping initialization in background process (%s)", new Object[] {
					runningappprocessinfo.processName
				});
	//   55  127:invokestatic    #81  <Method ILogger AdjustFactory.getLogger()>
	//   56  130:ldc2            #381 <String "Skipping initialization in background process (%s)">
	//   57  133:iconst_1        
	//   58  134:anewarray       Object[]
	//   59  137:dup             
	//   60  138:iconst_0        
	//   61  139:aload_3         
	//   62  140:getfield        #376 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//   63  143:aastore         
	//   64  144:invokeinterface #384 <Method void ILogger.info(String, Object[])>
				return null;
	//   65  149:aconst_null     
	//   66  150:areturn         
			}
		}
		return new ActivityHandler(adjustconfig);
	//   67  151:new             #2   <Class ActivityHandler>
	//   68  154:dup             
	//   69  155:aload_0         
	//   70  156:invokespecial   #386 <Method void ActivityHandler(AdjustConfig)>
	//   71  159:areturn         
	}

	private boolean hasChangedState(boolean flag, boolean flag1, String s, String s1)
	{
		if(flag != flag1)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpeq          7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(flag)
	//*   5    7:iload_1         
	//*   6    8:ifeq            27
		{
			logger.debug(s, new Object[0]);
	//    7   11:aload_0         
	//    8   12:getfield        #83  <Field ILogger logger>
	//    9   15:aload_3         
	//   10   16:iconst_0        
	//   11   17:anewarray       Object[]
	//   12   20:invokeinterface #391 <Method void ILogger.debug(String, Object[])>
			return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
		} else
		{
			logger.debug(s1, new Object[0]);
	//   15   27:aload_0         
	//   16   28:getfield        #83  <Field ILogger logger>
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:anewarray       Object[]
	//   20   37:invokeinterface #391 <Method void ILogger.debug(String, Object[])>
			return false;
	//   21   42:iconst_0        
	//   22   43:ireturn         
		}
	}

	private void initInternal()
	{
		TIMER_INTERVAL = AdjustFactory.getTimerInterval();
	//    0    0:invokestatic    #394 <Method long AdjustFactory.getTimerInterval()>
	//    1    3:putstatic       #396 <Field long TIMER_INTERVAL>
		TIMER_START = AdjustFactory.getTimerStart();
	//    2    6:invokestatic    #399 <Method long AdjustFactory.getTimerStart()>
	//    3    9:putstatic       #401 <Field long TIMER_START>
		SESSION_INTERVAL = AdjustFactory.getSessionInterval();
	//    4   12:invokestatic    #404 <Method long AdjustFactory.getSessionInterval()>
	//    5   15:putstatic       #406 <Field long SESSION_INTERVAL>
		SUBSESSION_INTERVAL = AdjustFactory.getSubsessionInterval();
	//    6   18:invokestatic    #409 <Method long AdjustFactory.getSubsessionInterval()>
	//    7   21:putstatic       #411 <Field long SUBSESSION_INTERVAL>
		deviceInfo = new DeviceInfo(adjustConfig.context, adjustConfig.sdkPrefix);
	//    8   24:aload_0         
	//    9   25:new             #413 <Class DeviceInfo>
	//   10   28:dup             
	//   11   29:aload_0         
	//   12   30:getfield        #121 <Field AdjustConfig adjustConfig>
	//   13   33:getfield        #343 <Field Context AdjustConfig.context>
	//   14   36:aload_0         
	//   15   37:getfield        #121 <Field AdjustConfig adjustConfig>
	//   16   40:getfield        #416 <Field String AdjustConfig.sdkPrefix>
	//   17   43:invokespecial   #419 <Method void DeviceInfo(Context, String)>
	//   18   46:putfield        #219 <Field DeviceInfo deviceInfo>
		if("production".equals(((Object) (adjustConfig.environment))))
	//*  19   49:ldc2            #421 <String "production">
	//*  20   52:aload_0         
	//*  21   53:getfield        #121 <Field AdjustConfig adjustConfig>
	//*  22   56:getfield        #424 <Field String AdjustConfig.environment>
	//*  23   59:invokevirtual   #428 <Method boolean String.equals(Object)>
	//*  24   62:ifeq            80
			logger.setLogLevel(LogLevel.ASSERT);
	//   25   65:aload_0         
	//   26   66:getfield        #83  <Field ILogger logger>
	//   27   69:getstatic       #434 <Field LogLevel LogLevel.ASSERT>
	//   28   72:invokeinterface #438 <Method void ILogger.setLogLevel(LogLevel)>
		else
	//*  29   77:goto            96
			logger.setLogLevel(adjustConfig.logLevel);
	//   30   80:aload_0         
	//   31   81:getfield        #83  <Field ILogger logger>
	//   32   84:aload_0         
	//   33   85:getfield        #121 <Field AdjustConfig adjustConfig>
	//   34   88:getfield        #441 <Field LogLevel AdjustConfig.logLevel>
	//   35   91:invokeinterface #438 <Method void ILogger.setLogLevel(LogLevel)>
		if(adjustConfig.eventBufferingEnabled.booleanValue())
	//*  36   96:aload_0         
	//*  37   97:getfield        #121 <Field AdjustConfig adjustConfig>
	//*  38  100:getfield        #445 <Field Boolean AdjustConfig.eventBufferingEnabled>
	//*  39  103:invokevirtual   #450 <Method boolean Boolean.booleanValue()>
	//*  40  106:ifeq            125
			logger.info("Event buffering is enabled", new Object[0]);
	//   41  109:aload_0         
	//   42  110:getfield        #83  <Field ILogger logger>
	//   43  113:ldc2            #452 <String "Event buffering is enabled">
	//   44  116:iconst_0        
	//   45  117:anewarray       Object[]
	//   46  120:invokeinterface #384 <Method void ILogger.info(String, Object[])>
		if(Util.getPlayAdId(adjustConfig.context) == null)
	//*  47  125:aload_0         
	//*  48  126:getfield        #121 <Field AdjustConfig adjustConfig>
	//*  49  129:getfield        #343 <Field Context AdjustConfig.context>
	//*  50  132:invokestatic    #458 <Method String Util.getPlayAdId(Context)>
	//*  51  135:ifnonnull       154
			logger.info("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
	//   52  138:aload_0         
	//   53  139:getfield        #83  <Field ILogger logger>
	//   54  142:ldc2            #460 <String "Unable to get Google Play Services Advertising ID at start time">
	//   55  145:iconst_0        
	//   56  146:anewarray       Object[]
	//   57  149:invokeinterface #384 <Method void ILogger.info(String, Object[])>
		if(adjustConfig.defaultTracker != null)
	//*  58  154:aload_0         
	//*  59  155:getfield        #121 <Field AdjustConfig adjustConfig>
	//*  60  158:getfield        #463 <Field String AdjustConfig.defaultTracker>
	//*  61  161:ifnull          190
			logger.info("Default tracker: '%s'", new Object[] {
				adjustConfig.defaultTracker
			});
	//   62  164:aload_0         
	//   63  165:getfield        #83  <Field ILogger logger>
	//   64  168:ldc2            #465 <String "Default tracker: '%s'">
	//   65  171:iconst_1        
	//   66  172:anewarray       Object[]
	//   67  175:dup             
	//   68  176:iconst_0        
	//   69  177:aload_0         
	//   70  178:getfield        #121 <Field AdjustConfig adjustConfig>
	//   71  181:getfield        #463 <Field String AdjustConfig.defaultTracker>
	//   72  184:aastore         
	//   73  185:invokeinterface #384 <Method void ILogger.info(String, Object[])>
		if(adjustConfig.referrer != null)
	//*  74  190:aload_0         
	//*  75  191:getfield        #121 <Field AdjustConfig adjustConfig>
	//*  76  194:getfield        #466 <Field String AdjustConfig.referrer>
	//*  77  197:ifnull          218
			sendReferrer(adjustConfig.referrer, adjustConfig.referrerClickTime);
	//   78  200:aload_0         
	//   79  201:aload_0         
	//   80  202:getfield        #121 <Field AdjustConfig adjustConfig>
	//   81  205:getfield        #466 <Field String AdjustConfig.referrer>
	//   82  208:aload_0         
	//   83  209:getfield        #121 <Field AdjustConfig adjustConfig>
	//   84  212:getfield        #469 <Field long AdjustConfig.referrerClickTime>
	//   85  215:invokevirtual   #472 <Method void sendReferrer(String, long)>
		readAttribution();
	//   86  218:aload_0         
	//   87  219:invokespecial   #475 <Method void readAttribution()>
		readActivityState();
	//   88  222:aload_0         
	//   89  223:invokespecial   #478 <Method void readActivityState()>
		packageHandler = AdjustFactory.getPackageHandler(this, adjustConfig.context, paused());
	//   90  226:aload_0         
	//   91  227:aload_0         
	//   92  228:aload_0         
	//   93  229:getfield        #121 <Field AdjustConfig adjustConfig>
	//   94  232:getfield        #343 <Field Context AdjustConfig.context>
	//   95  235:aload_0         
	//   96  236:invokespecial   #481 <Method boolean paused()>
	//   97  239:invokestatic    #485 <Method IPackageHandler AdjustFactory.getPackageHandler(ActivityHandler, Context, boolean)>
	//   98  242:putfield        #290 <Field IPackageHandler packageHandler>
		attributionHandler = AdjustFactory.getAttributionHandler(((IActivityHandler) (this)), getAttributionPackage(), paused(), adjustConfig.hasListener());
	//   99  245:aload_0         
	//  100  246:aload_0         
	//  101  247:aload_0         
	//  102  248:invokevirtual   #489 <Method ActivityPackage getAttributionPackage()>
	//  103  251:aload_0         
	//  104  252:invokespecial   #481 <Method boolean paused()>
	//  105  255:aload_0         
	//  106  256:getfield        #121 <Field AdjustConfig adjustConfig>
	//  107  259:invokevirtual   #492 <Method boolean AdjustConfig.hasListener()>
	//  108  262:invokestatic    #496 <Method IAttributionHandler AdjustFactory.getAttributionHandler(IActivityHandler, ActivityPackage, boolean, boolean)>
	//  109  265:putfield        #258 <Field IAttributionHandler attributionHandler>
		timer = new TimerCycle(new Runnable() {

			public void run()
			{
				timerFired();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ActivityHandler this$0>
			//    2    4:invokestatic    #24  <Method void ActivityHandler.access$1100(ActivityHandler)>
			//    3    7:return          
			}

			final ActivityHandler this$0;

			
			{
				this$0 = ActivityHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ActivityHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, TIMER_START, TIMER_INTERVAL);
	//  110  268:aload_0         
	//  111  269:new             #498 <Class TimerCycle>
	//  112  272:dup             
	//  113  273:new             #10  <Class ActivityHandler$2>
	//  114  276:dup             
	//  115  277:aload_0         
	//  116  278:invokespecial   #500 <Method void ActivityHandler$2(ActivityHandler)>
	//  117  281:getstatic       #401 <Field long TIMER_START>
	//  118  284:getstatic       #396 <Field long TIMER_INTERVAL>
	//  119  287:invokespecial   #503 <Method void TimerCycle(Runnable, long, long)>
	//  120  290:putfield        #505 <Field TimerCycle timer>
	//  121  293:return          
	}

	private void launchAttributionListener()
	{
		if(adjustConfig.onAttributionChangedListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field AdjustConfig adjustConfig>
	//*   2    4:getfield        #510 <Field OnAttributionChangedListener AdjustConfig.onAttributionChangedListener>
	//*   3    7:ifnonnull       11
		{
			return;
	//    4   10:return          
		} else
		{
			(new Handler(adjustConfig.context.getMainLooper())).post(new Runnable() {

				public void run()
				{
					adjustConfig.onAttributionChangedListener.onAttributionChanged(attribution);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ActivityHandler this$0>
				//    2    4:invokestatic    #25  <Method AdjustConfig ActivityHandler.access$100(ActivityHandler)>
				//    3    7:getfield        #31  <Field OnAttributionChangedListener AdjustConfig.onAttributionChangedListener>
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field ActivityHandler this$0>
				//    6   14:invokestatic    #35  <Method AdjustAttribution ActivityHandler.access$000(ActivityHandler)>
				//    7   17:invokeinterface #41  <Method void OnAttributionChangedListener.onAttributionChanged(AdjustAttribution)>
				//    8   22:return          
				}

				final ActivityHandler this$0;

			
			{
				this$0 = ActivityHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ActivityHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    5   11:new             #512 <Class Handler>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #121 <Field AdjustConfig adjustConfig>
	//    9   19:getfield        #343 <Field Context AdjustConfig.context>
	//   10   22:invokevirtual   #515 <Method Looper Context.getMainLooper()>
	//   11   25:invokespecial   #518 <Method void Handler(Looper)>
	//   12   28:new             #8   <Class ActivityHandler$1>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:invokespecial   #519 <Method void ActivityHandler$1(ActivityHandler)>
	//   16   36:invokevirtual   #523 <Method boolean Handler.post(Runnable)>
	//   17   39:pop             
			return;
	//   18   40:return          
		}
	}

	private void launchDeeplinkMain(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Object obj = ((Object) (Uri.parse(s)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #529 <Method Uri Uri.parse(String)>
	//    5    9:astore_3        
		if(adjustConfig.deepLinkComponent == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #121 <Field AdjustConfig adjustConfig>
	//*   8   14:getfield        #533 <Field Class AdjustConfig.deepLinkComponent>
	//*   9   17:ifnonnull       35
			obj = ((Object) (new Intent("android.intent.action.VIEW", ((Uri) (obj)))));
	//   10   20:new             #535 <Class Intent>
	//   11   23:dup             
	//   12   24:ldc2            #537 <String "android.intent.action.VIEW">
	//   13   27:aload_3         
	//   14   28:invokespecial   #540 <Method void Intent(String, Uri)>
	//   15   31:astore_3        
		else
	//*  16   32:goto            61
			obj = ((Object) (new Intent("android.intent.action.VIEW", ((Uri) (obj)), adjustConfig.context, adjustConfig.deepLinkComponent)));
	//   17   35:new             #535 <Class Intent>
	//   18   38:dup             
	//   19   39:ldc2            #537 <String "android.intent.action.VIEW">
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:getfield        #121 <Field AdjustConfig adjustConfig>
	//   23   47:getfield        #343 <Field Context AdjustConfig.context>
	//   24   50:aload_0         
	//   25   51:getfield        #121 <Field AdjustConfig adjustConfig>
	//   26   54:getfield        #533 <Field Class AdjustConfig.deepLinkComponent>
	//   27   57:invokespecial   #543 <Method void Intent(String, Uri, Context, Class)>
	//   28   60:astore_3        
		((Intent) (obj)).setFlags(0x10000000);
	//   29   61:aload_3         
	//   30   62:ldc2            #544 <Int 0x10000000>
	//   31   65:invokevirtual   #548 <Method Intent Intent.setFlags(int)>
	//   32   68:pop             
		((Intent) (obj)).setPackage(adjustConfig.context.getPackageName());
	//   33   69:aload_3         
	//   34   70:aload_0         
	//   35   71:getfield        #121 <Field AdjustConfig adjustConfig>
	//   36   74:getfield        #343 <Field Context AdjustConfig.context>
	//   37   77:invokevirtual   #552 <Method String Context.getPackageName()>
	//   38   80:invokevirtual   #556 <Method Intent Intent.setPackage(String)>
	//   39   83:pop             
		boolean flag;
		if(adjustConfig.context.getPackageManager().queryIntentActivities(((Intent) (obj)), 0).size() > 0)
	//*  40   84:aload_0         
	//*  41   85:getfield        #121 <Field AdjustConfig adjustConfig>
	//*  42   88:getfield        #343 <Field Context AdjustConfig.context>
	//*  43   91:invokevirtual   #560 <Method PackageManager Context.getPackageManager()>
	//*  44   94:aload_3         
	//*  45   95:iconst_0        
	//*  46   96:invokevirtual   #566 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//*  47   99:invokeinterface #569 <Method int List.size()>
	//*  48  104:ifle            112
			flag = true;
	//   49  107:iconst_1        
	//   50  108:istore_2        
		else
	//*  51  109:goto            114
			flag = false;
	//   52  112:iconst_0        
	//   53  113:istore_2        
		if(!flag)
	//*  54  114:iload_2         
	//*  55  115:ifne            139
		{
			logger.error("Unable to open deep link (%s)", new Object[] {
				s
			});
	//   56  118:aload_0         
	//   57  119:getfield        #83  <Field ILogger logger>
	//   58  122:ldc2            #571 <String "Unable to open deep link (%s)">
	//   59  125:iconst_1        
	//   60  126:anewarray       Object[]
	//   61  129:dup             
	//   62  130:iconst_0        
	//   63  131:aload_1         
	//   64  132:aastore         
	//   65  133:invokeinterface #245 <Method void ILogger.error(String, Object[])>
			return;
	//   66  138:return          
		} else
		{
			logger.info("Open deep link (%s)", new Object[] {
				s
			});
	//   67  139:aload_0         
	//   68  140:getfield        #83  <Field ILogger logger>
	//   69  143:ldc2            #573 <String "Open deep link (%s)">
	//   70  146:iconst_1        
	//   71  147:anewarray       Object[]
	//   72  150:dup             
	//   73  151:iconst_0        
	//   74  152:aload_1         
	//   75  153:aastore         
	//   76  154:invokeinterface #384 <Method void ILogger.info(String, Object[])>
			adjustConfig.context.startActivity(((Intent) (obj)));
	//   77  159:aload_0         
	//   78  160:getfield        #121 <Field AdjustConfig adjustConfig>
	//   79  163:getfield        #343 <Field Context AdjustConfig.context>
	//   80  166:aload_3         
	//   81  167:invokevirtual   #577 <Method void Context.startActivity(Intent)>
			return;
	//   82  170:return          
		}
	}

	private boolean paused()
	{
		return offline || !isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #579 <Field boolean offline>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #582 <Method boolean isEnabled()>
	//    5   11:ifne            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private void processSession()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #215 <Method long System.currentTimeMillis()>
	//    1    3:lstore_1        
		if(activityState == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #221 <Field ActivityState activityState>
	//*   4    8:ifnonnull       59
		{
			activityState = new ActivityState();
	//    5   11:aload_0         
	//    6   12:new             #250 <Class ActivityState>
	//    7   15:dup             
	//    8   16:invokespecial   #584 <Method void ActivityState()>
	//    9   19:putfield        #221 <Field ActivityState activityState>
			activityState.sessionCount = 1;
	//   10   22:aload_0         
	//   11   23:getfield        #221 <Field ActivityState activityState>
	//   12   26:iconst_1        
	//   13   27:putfield        #587 <Field int ActivityState.sessionCount>
			transferSessionPackage(l);
	//   14   30:aload_0         
	//   15   31:lload_1         
	//   16   32:invokespecial   #591 <Method void transferSessionPackage(long)>
			activityState.resetSessionAttributes(l);
	//   17   35:aload_0         
	//   18   36:getfield        #221 <Field ActivityState activityState>
	//   19   39:lload_1         
	//   20   40:invokevirtual   #594 <Method void ActivityState.resetSessionAttributes(long)>
			activityState.enabled = enabled;
	//   21   43:aload_0         
	//   22   44:getfield        #221 <Field ActivityState activityState>
	//   23   47:aload_0         
	//   24   48:getfield        #94  <Field boolean enabled>
	//   25   51:putfield        #595 <Field boolean ActivityState.enabled>
			writeActivityState();
	//   26   54:aload_0         
	//   27   55:invokespecial   #306 <Method void writeActivityState()>
			return;
	//   28   58:return          
		}
		long l1 = l - activityState.lastActivity;
	//   29   59:lload_1         
	//   30   60:aload_0         
	//   31   61:getfield        #221 <Field ActivityState activityState>
	//   32   64:getfield        #598 <Field long ActivityState.lastActivity>
	//   33   67:lsub            
	//   34   68:lstore_3        
		if(l1 < 0L)
	//*  35   69:lload_3         
	//*  36   70:lconst_0        
	//*  37   71:lcmp            
	//*  38   72:ifge            103
		{
			logger.error("Time travel!", new Object[0]);
	//   39   75:aload_0         
	//   40   76:getfield        #83  <Field ILogger logger>
	//   41   79:ldc1            #39  <String "Time travel!">
	//   42   81:iconst_0        
	//   43   82:anewarray       Object[]
	//   44   85:invokeinterface #245 <Method void ILogger.error(String, Object[])>
			activityState.lastActivity = l;
	//   45   90:aload_0         
	//   46   91:getfield        #221 <Field ActivityState activityState>
	//   47   94:lload_1         
	//   48   95:putfield        #598 <Field long ActivityState.lastActivity>
			writeActivityState();
	//   49   98:aload_0         
	//   50   99:invokespecial   #306 <Method void writeActivityState()>
			return;
	//   51  102:return          
		}
		if(l1 > SESSION_INTERVAL)
	//*  52  103:lload_3         
	//*  53  104:getstatic       #406 <Field long SESSION_INTERVAL>
	//*  54  107:lcmp            
	//*  55  108:ifle            155
		{
			ActivityState activitystate = activityState;
	//   56  111:aload_0         
	//   57  112:getfield        #221 <Field ActivityState activityState>
	//   58  115:astore          5
			activitystate.sessionCount = activitystate.sessionCount + 1;
	//   59  117:aload           5
	//   60  119:aload           5
	//   61  121:getfield        #587 <Field int ActivityState.sessionCount>
	//   62  124:iconst_1        
	//   63  125:iadd            
	//   64  126:putfield        #587 <Field int ActivityState.sessionCount>
			activityState.lastInterval = l1;
	//   65  129:aload_0         
	//   66  130:getfield        #221 <Field ActivityState activityState>
	//   67  133:lload_3         
	//   68  134:putfield        #601 <Field long ActivityState.lastInterval>
			transferSessionPackage(l);
	//   69  137:aload_0         
	//   70  138:lload_1         
	//   71  139:invokespecial   #591 <Method void transferSessionPackage(long)>
			activityState.resetSessionAttributes(l);
	//   72  142:aload_0         
	//   73  143:getfield        #221 <Field ActivityState activityState>
	//   74  146:lload_1         
	//   75  147:invokevirtual   #594 <Method void ActivityState.resetSessionAttributes(long)>
			writeActivityState();
	//   76  150:aload_0         
	//   77  151:invokespecial   #306 <Method void writeActivityState()>
			return;
	//   78  154:return          
		}
		if(l1 > SUBSESSION_INTERVAL)
	//*  79  155:lload_3         
	//*  80  156:getstatic       #411 <Field long SUBSESSION_INTERVAL>
	//*  81  159:lcmp            
	//*  82  160:ifle            253
		{
			ActivityState activitystate1 = activityState;
	//   83  163:aload_0         
	//   84  164:getfield        #221 <Field ActivityState activityState>
	//   85  167:astore          5
			activitystate1.subsessionCount = activitystate1.subsessionCount + 1;
	//   86  169:aload           5
	//   87  171:aload           5
	//   88  173:getfield        #253 <Field int ActivityState.subsessionCount>
	//   89  176:iconst_1        
	//   90  177:iadd            
	//   91  178:putfield        #253 <Field int ActivityState.subsessionCount>
			activitystate1 = activityState;
	//   92  181:aload_0         
	//   93  182:getfield        #221 <Field ActivityState activityState>
	//   94  185:astore          5
			activitystate1.sessionLength = activitystate1.sessionLength + l1;
	//   95  187:aload           5
	//   96  189:aload           5
	//   97  191:getfield        #604 <Field long ActivityState.sessionLength>
	//   98  194:lload_3         
	//   99  195:ladd            
	//  100  196:putfield        #604 <Field long ActivityState.sessionLength>
			activityState.lastActivity = l;
	//  101  199:aload_0         
	//  102  200:getfield        #221 <Field ActivityState activityState>
	//  103  203:lload_1         
	//  104  204:putfield        #598 <Field long ActivityState.lastActivity>
			writeActivityState();
	//  105  207:aload_0         
	//  106  208:invokespecial   #306 <Method void writeActivityState()>
			logger.info("Started subsession %d of session %d", new Object[] {
				Integer.valueOf(activityState.subsessionCount), Integer.valueOf(activityState.sessionCount)
			});
	//  107  211:aload_0         
	//  108  212:getfield        #83  <Field ILogger logger>
	//  109  215:ldc2            #606 <String "Started subsession %d of session %d">
	//  110  218:iconst_2        
	//  111  219:anewarray       Object[]
	//  112  222:dup             
	//  113  223:iconst_0        
	//  114  224:aload_0         
	//  115  225:getfield        #221 <Field ActivityState activityState>
	//  116  228:getfield        #253 <Field int ActivityState.subsessionCount>
	//  117  231:invokestatic    #612 <Method Integer Integer.valueOf(int)>
	//  118  234:aastore         
	//  119  235:dup             
	//  120  236:iconst_1        
	//  121  237:aload_0         
	//  122  238:getfield        #221 <Field ActivityState activityState>
	//  123  241:getfield        #587 <Field int ActivityState.sessionCount>
	//  124  244:invokestatic    #612 <Method Integer Integer.valueOf(int)>
	//  125  247:aastore         
	//  126  248:invokeinterface #384 <Method void ILogger.info(String, Object[])>
		}
	//  127  253:return          
	}

	private void readActivityState()
	{
		try
		{
			activityState = (ActivityState)Util.readObject(adjustConfig.context, "AdjustIoActivityState", "Activity state", com/adjust/sdk/ActivityState);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #121 <Field AdjustConfig adjustConfig>
	//    3    5:getfield        #343 <Field Context AdjustConfig.context>
	//    4    8:ldc2            #279 <String "AdjustIoActivityState">
	//    5   11:ldc1            #23  <String "Activity state">
	//    6   13:ldc1            #250 <Class ActivityState>
	//    7   15:invokestatic    #618 <Method Object Util.readObject(Context, String, String, Class)>
	//    8   18:checkcast       #250 <Class ActivityState>
	//    9   21:putfield        #221 <Field ActivityState activityState>
			return;
	//   10   24:return          
		}
		catch(Exception exception)
	//*  11   25:astore_1        
		{
			logger.error("Failed to read %s file (%s)", new Object[] {
				"Activity state", exception.getMessage()
			});
	//   12   26:aload_0         
	//   13   27:getfield        #83  <Field ILogger logger>
	//   14   30:ldc2            #620 <String "Failed to read %s file (%s)">
	//   15   33:iconst_2        
	//   16   34:anewarray       Object[]
	//   17   37:dup             
	//   18   38:iconst_0        
	//   19   39:ldc1            #23  <String "Activity state">
	//   20   41:aastore         
	//   21   42:dup             
	//   22   43:iconst_1        
	//   23   44:aload_1         
	//   24   45:invokevirtual   #623 <Method String Exception.getMessage()>
	//   25   48:aastore         
	//   26   49:invokeinterface #245 <Method void ILogger.error(String, Object[])>
		}
		activityState = null;
	//   27   54:aload_0         
	//   28   55:aconst_null     
	//   29   56:putfield        #221 <Field ActivityState activityState>
	//   30   59:return          
	}

	private void readAttribution()
	{
		try
		{
			attribution = (AdjustAttribution)Util.readObject(adjustConfig.context, "AdjustAttribution", "Attribution", com/adjust/sdk/AdjustAttribution);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #121 <Field AdjustConfig adjustConfig>
	//    3    5:getfield        #343 <Field Context AdjustConfig.context>
	//    4    8:ldc2            #288 <String "AdjustAttribution">
	//    5   11:ldc1            #29  <String "Attribution">
	//    6   13:ldc1            #178 <Class AdjustAttribution>
	//    7   15:invokestatic    #618 <Method Object Util.readObject(Context, String, String, Class)>
	//    8   18:checkcast       #178 <Class AdjustAttribution>
	//    9   21:putfield        #117 <Field AdjustAttribution attribution>
			return;
	//   10   24:return          
		}
		catch(Exception exception)
	//*  11   25:astore_1        
		{
			logger.error("Failed to read %s file (%s)", new Object[] {
				"Attribution", exception.getMessage()
			});
	//   12   26:aload_0         
	//   13   27:getfield        #83  <Field ILogger logger>
	//   14   30:ldc2            #620 <String "Failed to read %s file (%s)">
	//   15   33:iconst_2        
	//   16   34:anewarray       Object[]
	//   17   37:dup             
	//   18   38:iconst_0        
	//   19   39:ldc1            #29  <String "Attribution">
	//   20   41:aastore         
	//   21   42:dup             
	//   22   43:iconst_1        
	//   23   44:aload_1         
	//   24   45:invokevirtual   #623 <Method String Exception.getMessage()>
	//   25   48:aastore         
	//   26   49:invokeinterface #245 <Method void ILogger.error(String, Object[])>
		}
		attribution = null;
	//   27   54:aload_0         
	//   28   55:aconst_null     
	//   29   56:putfield        #117 <Field AdjustAttribution attribution>
	//   30   59:return          
	}

	private void readOpenUrlInternal(Uri uri, long l)
	{
		if(uri == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		uri = ((Uri) (buildQueryStringClickPackage(uri.getQuery(), "deeplink", l)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #626 <Method String Uri.getQuery()>
	//    6   10:ldc2            #308 <String "deeplink">
	//    7   13:lload_2         
	//    8   14:invokespecial   #628 <Method ActivityPackage buildQueryStringClickPackage(String, String, long)>
	//    9   17:astore_1        
		if(uri == null)
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       23
		{
			return;
	//   12   22:return          
		} else
		{
			packageHandler.addPackage(((ActivityPackage) (uri)));
	//   13   23:aload_0         
	//   14   24:getfield        #290 <Field IPackageHandler packageHandler>
	//   15   27:aload_1         
	//   16   28:invokeinterface #632 <Method void IPackageHandler.addPackage(ActivityPackage)>
			return;
	//   17   33:return          
		}
	}

	private boolean readQueryString(String s, Map map, AdjustAttribution adjustattribution)
	{
		String as[] = s.split("=");
	//    0    0:aload_1         
	//    1    1:ldc2            #634 <String "=">
	//    2    4:invokevirtual   #197 <Method String[] String.split(String)>
	//    3    7:astore          4
		if(as.length != 2)
	//*   4    9:aload           4
	//*   5   11:arraylength     
	//*   6   12:iconst_2        
	//*   7   13:icmpeq          18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		s = as[0];
	//   10   18:aload           4
	//   11   20:iconst_0        
	//   12   21:aaload          
	//   13   22:astore_1        
		if(!s.startsWith("adjust_"))
	//*  14   23:aload_1         
	//*  15   24:ldc1            #26  <String "adjust_">
	//*  16   26:invokevirtual   #637 <Method boolean String.startsWith(String)>
	//*  17   29:ifne            34
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		String s1 = as[1];
	//   20   34:aload           4
	//   21   36:iconst_1        
	//   22   37:aaload          
	//   23   38:astore          4
		if(s1.length() == 0)
	//*  24   40:aload           4
	//*  25   42:invokevirtual   #640 <Method int String.length()>
	//*  26   45:ifne            50
			return false;
	//   27   48:iconst_0        
	//   28   49:ireturn         
		s = s.substring("adjust_".length());
	//   29   50:aload_1         
	//   30   51:ldc1            #26  <String "adjust_">
	//   31   53:invokevirtual   #640 <Method int String.length()>
	//   32   56:invokevirtual   #644 <Method String String.substring(int)>
	//   33   59:astore_1        
		if(s.length() == 0)
	//*  34   60:aload_1         
	//*  35   61:invokevirtual   #640 <Method int String.length()>
	//*  36   64:ifne            69
			return false;
	//   37   67:iconst_0        
	//   38   68:ireturn         
		if(!trySetAttribution(adjustattribution, s, s1))
	//*  39   69:aload_0         
	//*  40   70:aload_3         
	//*  41   71:aload_1         
	//*  42   72:aload           4
	//*  43   74:invokespecial   #648 <Method boolean trySetAttribution(AdjustAttribution, String, String)>
	//*  44   77:ifne            90
			map.put(((Object) (s)), ((Object) (s1)));
	//   45   80:aload_2         
	//   46   81:aload_1         
	//   47   82:aload           4
	//   48   84:invokeinterface #652 <Method Object Map.put(Object, Object)>
	//   49   89:pop             
		return true;
	//   50   90:iconst_1        
	//   51   91:ireturn         
	}

	private void saveAttribution(AdjustAttribution adjustattribution)
	{
		attribution = adjustattribution;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field AdjustAttribution attribution>
		writeAttribution();
	//    3    5:aload_0         
	//    4    6:invokespecial   #659 <Method void writeAttribution()>
	//    5    9:return          
	}

	private void sendReferrerInternal(String s, long l)
	{
		s = ((String) (buildQueryStringClickPackage(s, "reftag", l)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #203 <String "reftag">
	//    3    4:lload_2         
	//    4    5:invokespecial   #628 <Method ActivityPackage buildQueryStringClickPackage(String, String, long)>
	//    5    8:astore_1        
		if(s == null)
	//*   6    9:aload_1         
	//*   7   10:ifnonnull       14
		{
			return;
	//    8   13:return          
		} else
		{
			packageHandler.addPackage(((ActivityPackage) (s)));
	//    9   14:aload_0         
	//   10   15:getfield        #290 <Field IPackageHandler packageHandler>
	//   11   18:aload_1         
	//   12   19:invokeinterface #632 <Method void IPackageHandler.addPackage(ActivityPackage)>
			return;
	//   13   24:return          
		}
	}

	private void startInternal()
	{
		if(activityState != null && !activityState.enabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field ActivityState activityState>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #221 <Field ActivityState activityState>
	//*   5   11:getfield        #595 <Field boolean ActivityState.enabled>
	//*   6   14:ifne            18
		{
			return;
	//    7   17:return          
		} else
		{
			updateHandlersStatusInternal();
	//    8   18:aload_0         
	//    9   19:invokespecial   #170 <Method void updateHandlersStatusInternal()>
			processSession();
	//   10   22:aload_0         
	//   11   23:invokespecial   #661 <Method void processSession()>
			checkAttributionState();
	//   12   26:aload_0         
	//   13   27:invokespecial   #663 <Method void checkAttributionState()>
			startTimer();
	//   14   30:aload_0         
	//   15   31:invokespecial   #666 <Method void startTimer()>
			return;
	//   16   34:return          
		}
	}

	private void startTimer()
	{
		if(paused())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #481 <Method boolean paused()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			timer.start();
	//    4    8:aload_0         
	//    5    9:getfield        #505 <Field TimerCycle timer>
	//    6   12:invokevirtual   #667 <Method void TimerCycle.start()>
			return;
	//    7   15:return          
		}
	}

	private void stopTimer()
	{
		timer.suspend();
	//    0    0:aload_0         
	//    1    1:getfield        #505 <Field TimerCycle timer>
	//    2    4:invokevirtual   #670 <Method void TimerCycle.suspend()>
	//    3    7:return          
	}

	private void timerFired()
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #103 <Method Message Message.obtain()>
	//    1    3:astore_1        
		message.arg1 = 0x11bbf;
	//    2    4:aload_1         
	//    3    5:ldc2            #671 <Int 0x11bbf>
	//    4    8:putfield        #108 <Field int Message.arg1>
		sessionHandler.sendMessage(message);
	//    5   11:aload_0         
	//    6   12:getfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #112 <Method boolean ActivityHandler$SessionHandler.sendMessage(Message)>
	//    9   19:pop             
	//   10   20:return          
	}

	private void timerFiredInternal()
	{
		if(paused())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #481 <Method boolean paused()>
	//*   2    4:ifeq            12
		{
			stopTimer();
	//    3    7:aload_0         
	//    4    8:invokespecial   #299 <Method void stopTimer()>
			return;
	//    5   11:return          
		}
		logger.debug("Session timer fired", new Object[0]);
	//    6   12:aload_0         
	//    7   13:getfield        #83  <Field ILogger logger>
	//    8   16:ldc2            #673 <String "Session timer fired">
	//    9   19:iconst_0        
	//   10   20:anewarray       Object[]
	//   11   23:invokeinterface #391 <Method void ILogger.debug(String, Object[])>
		packageHandler.sendFirstPackage();
	//   12   28:aload_0         
	//   13   29:getfield        #290 <Field IPackageHandler packageHandler>
	//   14   32:invokeinterface #676 <Method void IPackageHandler.sendFirstPackage()>
		if(updateActivityState(System.currentTimeMillis()))
	//*  15   37:aload_0         
	//*  16   38:invokestatic    #215 <Method long System.currentTimeMillis()>
	//*  17   41:invokespecial   #303 <Method boolean updateActivityState(long)>
	//*  18   44:ifeq            51
			writeActivityState();
	//   19   47:aload_0         
	//   20   48:invokespecial   #306 <Method void writeActivityState()>
	//   21   51:return          
	}

	private void trackEventInternal(AdjustEvent adjustevent)
	{
		if(!checkActivityState(activityState))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #221 <Field ActivityState activityState>
	//*   3    5:invokespecial   #248 <Method boolean checkActivityState(ActivityState)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		if(!isEnabled())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #582 <Method boolean isEnabled()>
	//*   8   16:ifne            20
			return;
	//    9   19:return          
		if(!checkEvent(adjustevent))
	//*  10   20:aload_0         
	//*  11   21:aload_1         
	//*  12   22:invokespecial   #678 <Method boolean checkEvent(AdjustEvent)>
	//*  13   25:ifne            29
			return;
	//   14   28:return          
		long l = System.currentTimeMillis();
	//   15   29:invokestatic    #215 <Method long System.currentTimeMillis()>
	//   16   32:lstore_2        
		ActivityState activitystate = activityState;
	//   17   33:aload_0         
	//   18   34:getfield        #221 <Field ActivityState activityState>
	//   19   37:astore          4
		activitystate.eventCount = activitystate.eventCount + 1;
	//   20   39:aload           4
	//   21   41:aload           4
	//   22   43:getfield        #681 <Field int ActivityState.eventCount>
	//   23   46:iconst_1        
	//   24   47:iadd            
	//   25   48:putfield        #681 <Field int ActivityState.eventCount>
		updateActivityState(l);
	//   26   51:aload_0         
	//   27   52:lload_2         
	//   28   53:invokespecial   #303 <Method boolean updateActivityState(long)>
	//   29   56:pop             
		adjustevent = ((AdjustEvent) ((new PackageBuilder(adjustConfig, deviceInfo, activityState, l)).buildEventPackage(adjustevent)));
	//   30   57:new             #217 <Class PackageBuilder>
	//   31   60:dup             
	//   32   61:aload_0         
	//   33   62:getfield        #121 <Field AdjustConfig adjustConfig>
	//   34   65:aload_0         
	//   35   66:getfield        #219 <Field DeviceInfo deviceInfo>
	//   36   69:aload_0         
	//   37   70:getfield        #221 <Field ActivityState activityState>
	//   38   73:lload_2         
	//   39   74:invokespecial   #224 <Method void PackageBuilder(AdjustConfig, DeviceInfo, ActivityState, long)>
	//   40   77:aload_1         
	//   41   78:invokevirtual   #685 <Method ActivityPackage PackageBuilder.buildEventPackage(AdjustEvent)>
	//   42   81:astore_1        
		packageHandler.addPackage(((ActivityPackage) (adjustevent)));
	//   43   82:aload_0         
	//   44   83:getfield        #290 <Field IPackageHandler packageHandler>
	//   45   86:aload_1         
	//   46   87:invokeinterface #632 <Method void IPackageHandler.addPackage(ActivityPackage)>
		if(adjustConfig.eventBufferingEnabled.booleanValue())
	//*  47   92:aload_0         
	//*  48   93:getfield        #121 <Field AdjustConfig adjustConfig>
	//*  49   96:getfield        #445 <Field Boolean AdjustConfig.eventBufferingEnabled>
	//*  50   99:invokevirtual   #450 <Method boolean Boolean.booleanValue()>
	//*  51  102:ifeq            131
			logger.info("Buffered event %s", new Object[] {
				((ActivityPackage) (adjustevent)).getSuffix()
			});
	//   52  105:aload_0         
	//   53  106:getfield        #83  <Field ILogger logger>
	//   54  109:ldc2            #687 <String "Buffered event %s">
	//   55  112:iconst_1        
	//   56  113:anewarray       Object[]
	//   57  116:dup             
	//   58  117:iconst_0        
	//   59  118:aload_1         
	//   60  119:invokevirtual   #692 <Method String ActivityPackage.getSuffix()>
	//   61  122:aastore         
	//   62  123:invokeinterface #384 <Method void ILogger.info(String, Object[])>
		else
	//*  63  128:goto            140
			packageHandler.sendFirstPackage();
	//   64  131:aload_0         
	//   65  132:getfield        #290 <Field IPackageHandler packageHandler>
	//   66  135:invokeinterface #676 <Method void IPackageHandler.sendFirstPackage()>
		writeActivityState();
	//   67  140:aload_0         
	//   68  141:invokespecial   #306 <Method void writeActivityState()>
	//   69  144:return          
	}

	private void transferSessionPackage(long l)
	{
		ActivityPackage activitypackage = (new PackageBuilder(adjustConfig, deviceInfo, activityState, l)).buildSessionPackage();
	//    0    0:new             #217 <Class PackageBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field AdjustConfig adjustConfig>
	//    4    8:aload_0         
	//    5    9:getfield        #219 <Field DeviceInfo deviceInfo>
	//    6   12:aload_0         
	//    7   13:getfield        #221 <Field ActivityState activityState>
	//    8   16:lload_1         
	//    9   17:invokespecial   #224 <Method void PackageBuilder(AdjustConfig, DeviceInfo, ActivityState, long)>
	//   10   20:invokevirtual   #695 <Method ActivityPackage PackageBuilder.buildSessionPackage()>
	//   11   23:astore_3        
		packageHandler.addPackage(activitypackage);
	//   12   24:aload_0         
	//   13   25:getfield        #290 <Field IPackageHandler packageHandler>
	//   14   28:aload_3         
	//   15   29:invokeinterface #632 <Method void IPackageHandler.addPackage(ActivityPackage)>
		packageHandler.sendFirstPackage();
	//   16   34:aload_0         
	//   17   35:getfield        #290 <Field IPackageHandler packageHandler>
	//   18   38:invokeinterface #676 <Method void IPackageHandler.sendFirstPackage()>
	//   19   43:return          
	}

	private boolean trySetAttribution(AdjustAttribution adjustattribution, String s, String s1)
	{
		if(s.equals("tracker"))
	//*   0    0:aload_2         
	//*   1    1:ldc2            #697 <String "tracker">
	//*   2    4:invokevirtual   #428 <Method boolean String.equals(Object)>
	//*   3    7:ifeq            17
		{
			adjustattribution.trackerName = s1;
	//    4   10:aload_1         
	//    5   11:aload_3         
	//    6   12:putfield        #700 <Field String AdjustAttribution.trackerName>
			return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
		}
		if(s.equals("campaign"))
	//*   9   17:aload_2         
	//*  10   18:ldc2            #702 <String "campaign">
	//*  11   21:invokevirtual   #428 <Method boolean String.equals(Object)>
	//*  12   24:ifeq            34
		{
			adjustattribution.campaign = s1;
	//   13   27:aload_1         
	//   14   28:aload_3         
	//   15   29:putfield        #704 <Field String AdjustAttribution.campaign>
			return true;
	//   16   32:iconst_1        
	//   17   33:ireturn         
		}
		if(s.equals("adgroup"))
	//*  18   34:aload_2         
	//*  19   35:ldc2            #706 <String "adgroup">
	//*  20   38:invokevirtual   #428 <Method boolean String.equals(Object)>
	//*  21   41:ifeq            51
		{
			adjustattribution.adgroup = s1;
	//   22   44:aload_1         
	//   23   45:aload_3         
	//   24   46:putfield        #708 <Field String AdjustAttribution.adgroup>
			return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
		}
		if(s.equals("creative"))
	//*  27   51:aload_2         
	//*  28   52:ldc2            #710 <String "creative">
	//*  29   55:invokevirtual   #428 <Method boolean String.equals(Object)>
	//*  30   58:ifeq            68
		{
			adjustattribution.creative = s1;
	//   31   61:aload_1         
	//   32   62:aload_3         
	//   33   63:putfield        #712 <Field String AdjustAttribution.creative>
			return true;
	//   34   66:iconst_1        
	//   35   67:ireturn         
		} else
		{
			return false;
	//   36   68:iconst_0        
	//   37   69:ireturn         
		}
	}

	private boolean updateActivityState(long l)
	{
		if(!checkActivityState(activityState))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #221 <Field ActivityState activityState>
	//*   3    5:invokespecial   #248 <Method boolean checkActivityState(ActivityState)>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		long l1 = l - activityState.lastActivity;
	//    7   13:lload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #221 <Field ActivityState activityState>
	//   10   18:getfield        #598 <Field long ActivityState.lastActivity>
	//   11   21:lsub            
	//   12   22:lstore_3        
		if(l1 > SESSION_INTERVAL)
	//*  13   23:lload_3         
	//*  14   24:getstatic       #406 <Field long SESSION_INTERVAL>
	//*  15   27:lcmp            
	//*  16   28:ifle            33
			return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		activityState.lastActivity = l;
	//   19   33:aload_0         
	//   20   34:getfield        #221 <Field ActivityState activityState>
	//   21   37:lload_1         
	//   22   38:putfield        #598 <Field long ActivityState.lastActivity>
		if(l1 < 0L)
	//*  23   41:lload_3         
	//*  24   42:lconst_0        
	//*  25   43:lcmp            
	//*  26   44:ifge            65
		{
			logger.error("Time travel!", new Object[0]);
	//   27   47:aload_0         
	//   28   48:getfield        #83  <Field ILogger logger>
	//   29   51:ldc1            #39  <String "Time travel!">
	//   30   53:iconst_0        
	//   31   54:anewarray       Object[]
	//   32   57:invokeinterface #245 <Method void ILogger.error(String, Object[])>
		} else
	//*  33   62:goto            101
		{
			ActivityState activitystate = activityState;
	//   34   65:aload_0         
	//   35   66:getfield        #221 <Field ActivityState activityState>
	//   36   69:astore          5
			activitystate.sessionLength = activitystate.sessionLength + l1;
	//   37   71:aload           5
	//   38   73:aload           5
	//   39   75:getfield        #604 <Field long ActivityState.sessionLength>
	//   40   78:lload_3         
	//   41   79:ladd            
	//   42   80:putfield        #604 <Field long ActivityState.sessionLength>
			activitystate = activityState;
	//   43   83:aload_0         
	//   44   84:getfield        #221 <Field ActivityState activityState>
	//   45   87:astore          5
			activitystate.timeSpent = activitystate.timeSpent + l1;
	//   46   89:aload           5
	//   47   91:aload           5
	//   48   93:getfield        #715 <Field long ActivityState.timeSpent>
	//   49   96:lload_3         
	//   50   97:ladd            
	//   51   98:putfield        #715 <Field long ActivityState.timeSpent>
		}
		return true;
	//   52  101:iconst_1        
	//   53  102:ireturn         
	}

	private void updateAttributionHandlerStatus()
	{
		if(paused())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #481 <Method boolean paused()>
	//*   2    4:ifeq            17
		{
			attributionHandler.pauseSending();
	//    3    7:aload_0         
	//    4    8:getfield        #258 <Field IAttributionHandler attributionHandler>
	//    5   11:invokeinterface #296 <Method void IAttributionHandler.pauseSending()>
			return;
	//    6   16:return          
		} else
		{
			attributionHandler.resumeSending();
	//    7   17:aload_0         
	//    8   18:getfield        #258 <Field IAttributionHandler attributionHandler>
	//    9   21:invokeinterface #719 <Method void IAttributionHandler.resumeSending()>
			return;
	//   10   26:return          
		}
	}

	private void updateHandlersStatus()
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #103 <Method Message Message.obtain()>
	//    1    3:astore_1        
		message.arg1 = 0x11bbe;
	//    2    4:aload_1         
	//    3    5:ldc2            #721 <Int 0x11bbe>
	//    4    8:putfield        #108 <Field int Message.arg1>
		sessionHandler.sendMessage(message);
	//    5   11:aload_0         
	//    6   12:getfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #112 <Method boolean ActivityHandler$SessionHandler.sendMessage(Message)>
	//    9   19:pop             
	//   10   20:return          
	}

	private void updateHandlersStatusInternal()
	{
		updateAttributionHandlerStatus();
	//    0    0:aload_0         
	//    1    1:invokespecial   #723 <Method void updateAttributionHandlerStatus()>
		updatePackageHandlerStatus();
	//    2    4:aload_0         
	//    3    5:invokespecial   #726 <Method void updatePackageHandlerStatus()>
	//    4    8:return          
	}

	private void updatePackageHandlerStatus()
	{
		if(paused())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #481 <Method boolean paused()>
	//*   2    4:ifeq            17
		{
			packageHandler.pauseSending();
	//    3    7:aload_0         
	//    4    8:getfield        #290 <Field IPackageHandler packageHandler>
	//    5   11:invokeinterface #295 <Method void IPackageHandler.pauseSending()>
			return;
	//    6   16:return          
		} else
		{
			packageHandler.resumeSending();
	//    7   17:aload_0         
	//    8   18:getfield        #290 <Field IPackageHandler packageHandler>
	//    9   21:invokeinterface #727 <Method void IPackageHandler.resumeSending()>
			return;
	//   10   26:return          
		}
	}

	private void updateStatus(boolean flag, String s, String s1, String s2)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
		{
			logger.info(s, new Object[0]);
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field ILogger logger>
	//    4    8:aload_2         
	//    5    9:iconst_0        
	//    6   10:anewarray       Object[]
	//    7   13:invokeinterface #384 <Method void ILogger.info(String, Object[])>
			trackSubsessionEnd();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #732 <Method void trackSubsessionEnd()>
			return;
	//   10   22:return          
		}
		if(paused())
	//*  11   23:aload_0         
	//*  12   24:invokespecial   #481 <Method boolean paused()>
	//*  13   27:ifeq            45
		{
			logger.info(s1, new Object[0]);
	//   14   30:aload_0         
	//   15   31:getfield        #83  <Field ILogger logger>
	//   16   34:aload_3         
	//   17   35:iconst_0        
	//   18   36:anewarray       Object[]
	//   19   39:invokeinterface #384 <Method void ILogger.info(String, Object[])>
			return;
	//   20   44:return          
		} else
		{
			logger.info(s2, new Object[0]);
	//   21   45:aload_0         
	//   22   46:getfield        #83  <Field ILogger logger>
	//   23   49:aload           4
	//   24   51:iconst_0        
	//   25   52:anewarray       Object[]
	//   26   55:invokeinterface #384 <Method void ILogger.info(String, Object[])>
			trackSubsessionStart();
	//   27   60:aload_0         
	//   28   61:invokevirtual   #735 <Method void trackSubsessionStart()>
			return;
	//   29   64:return          
		}
	}

	private void writeActivityState()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Util.writeObject(((Object) (activityState)), adjustConfig.context, "AdjustIoActivityState", "Activity state");
	//    2    2:aload_0         
	//    3    3:getfield        #221 <Field ActivityState activityState>
	//    4    6:aload_0         
	//    5    7:getfield        #121 <Field AdjustConfig adjustConfig>
	//    6   10:getfield        #343 <Field Context AdjustConfig.context>
	//    7   13:ldc2            #279 <String "AdjustIoActivityState">
	//    8   16:ldc1            #23  <String "Activity state">
	//    9   18:invokestatic    #739 <Method void Util.writeObject(Object, Context, String, String)>
		this;
	//   10   21:aload_0         
		JVM INSTR monitorexit ;
	//   11   22:monitorexit     
		return;
	//   12   23:return          
		Exception exception;
		exception;
	//   13   24:astore_1        
	//*  14   25:aload_0         
		throw exception;
	//   15   26:monitorexit     
	//   16   27:aload_1         
	//   17   28:athrow          
	}

	private void writeAttribution()
	{
		Util.writeObject(((Object) (attribution)), adjustConfig.context, "AdjustAttribution", "Attribution");
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field AdjustAttribution attribution>
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field AdjustConfig adjustConfig>
	//    4    8:getfield        #343 <Field Context AdjustConfig.context>
	//    5   11:ldc2            #288 <String "AdjustAttribution">
	//    6   14:ldc1            #29  <String "Attribution">
	//    7   16:invokestatic    #739 <Method void Util.writeObject(Object, Context, String, String)>
	//    8   19:return          
	}

	public void finishedTrackingActivity(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			Message message = Message.obtain();
	//    3    5:invokestatic    #103 <Method Message Message.obtain()>
	//    4    8:astore_2        
			message.arg1 = 0x11bbb;
	//    5    9:aload_2         
	//    6   10:ldc2            #741 <Int 0x11bbb>
	//    7   13:putfield        #108 <Field int Message.arg1>
			message.obj = ((Object) (jsonobject));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:putfield        #745 <Field Object Message.obj>
			sessionHandler.sendMessage(message);
	//   11   21:aload_0         
	//   12   22:getfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
	//   13   25:aload_2         
	//   14   26:invokevirtual   #112 <Method boolean ActivityHandler$SessionHandler.sendMessage(Message)>
	//   15   29:pop             
			return;
	//   16   30:return          
		}
	}

	public ActivityPackage getAttributionPackage()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #215 <Method long System.currentTimeMillis()>
	//    1    3:lstore_1        
		return (new PackageBuilder(adjustConfig, deviceInfo, activityState, l)).buildAttributionPackage();
	//    2    4:new             #217 <Class PackageBuilder>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #121 <Field AdjustConfig adjustConfig>
	//    6   12:aload_0         
	//    7   13:getfield        #219 <Field DeviceInfo deviceInfo>
	//    8   16:aload_0         
	//    9   17:getfield        #221 <Field ActivityState activityState>
	//   10   20:lload_1         
	//   11   21:invokespecial   #224 <Method void PackageBuilder(AdjustConfig, DeviceInfo, ActivityState, long)>
	//   12   24:invokevirtual   #748 <Method ActivityPackage PackageBuilder.buildAttributionPackage()>
	//   13   27:areturn         
	}

	public void init(AdjustConfig adjustconfig)
	{
		adjustConfig = adjustconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field AdjustConfig adjustConfig>
	//    3    5:return          
	}

	public boolean isEnabled()
	{
		if(activityState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field ActivityState activityState>
	//*   2    4:ifnull          15
			return activityState.enabled;
	//    3    7:aload_0         
	//    4    8:getfield        #221 <Field ActivityState activityState>
	//    5   11:getfield        #595 <Field boolean ActivityState.enabled>
	//    6   14:ireturn         
		else
			return enabled;
	//    7   15:aload_0         
	//    8   16:getfield        #94  <Field boolean enabled>
	//    9   19:ireturn         
	}

	public void readOpenUrl(Uri uri, long l)
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #103 <Method Message Message.obtain()>
	//    1    3:astore          4
		message.arg1 = 0x11bbc;
	//    2    5:aload           4
	//    3    7:ldc2            #750 <Int 0x11bbc>
	//    4   10:putfield        #108 <Field int Message.arg1>
		message.obj = ((Object) (new UrlClickTime(uri, l)));
	//    5   13:aload           4
	//    6   15:new             #18  <Class ActivityHandler$UrlClickTime>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:lload_2         
	//   11   22:invokespecial   #752 <Method void ActivityHandler$UrlClickTime(ActivityHandler, Uri, long)>
	//   12   25:putfield        #745 <Field Object Message.obj>
		sessionHandler.sendMessage(message);
	//   13   28:aload_0         
	//   14   29:getfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
	//   15   32:aload           4
	//   16   34:invokevirtual   #112 <Method boolean ActivityHandler$SessionHandler.sendMessage(Message)>
	//   17   37:pop             
	//   18   38:return          
	}

	public void sendReferrer(String s, long l)
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #103 <Method Message Message.obtain()>
	//    1    3:astore          4
		message.arg1 = 0x11bbd;
	//    2    5:aload           4
	//    3    7:ldc2            #753 <Int 0x11bbd>
	//    4   10:putfield        #108 <Field int Message.arg1>
		message.obj = ((Object) (new ReferrerClickTime(s, l)));
	//    5   13:aload           4
	//    6   15:new             #12  <Class ActivityHandler$ReferrerClickTime>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:lload_2         
	//   11   22:invokespecial   #755 <Method void ActivityHandler$ReferrerClickTime(ActivityHandler, String, long)>
	//   12   25:putfield        #745 <Field Object Message.obj>
		sessionHandler.sendMessage(message);
	//   13   28:aload_0         
	//   14   29:getfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
	//   15   32:aload           4
	//   16   34:invokevirtual   #112 <Method boolean ActivityHandler$SessionHandler.sendMessage(Message)>
	//   17   37:pop             
	//   18   38:return          
	}

	public void setAskingAttribution(boolean flag)
	{
		activityState.askingAttribution = flag;
	//    0    0:aload_0         
	//    1    1:getfield        #221 <Field ActivityState activityState>
	//    2    4:iload_1         
	//    3    5:putfield        #256 <Field boolean ActivityState.askingAttribution>
		writeActivityState();
	//    4    8:aload_0         
	//    5    9:invokespecial   #306 <Method void writeActivityState()>
	//    6   12:return          
	}

	public void setEnabled(boolean flag)
	{
		if(!hasChangedState(isEnabled(), flag, "Adjust already enabled", "Adjust already disabled"))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #582 <Method boolean isEnabled()>
	//*   3    5:iload_1         
	//*   4    6:ldc2            #759 <String "Adjust already enabled">
	//*   5    9:ldc2            #761 <String "Adjust already disabled">
	//*   6   12:invokespecial   #763 <Method boolean hasChangedState(boolean, boolean, String, String)>
	//*   7   15:ifne            19
			return;
	//    8   18:return          
		enabled = flag;
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:putfield        #94  <Field boolean enabled>
		if(activityState == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #221 <Field ActivityState activityState>
	//*  14   28:ifnonnull       38
		{
			trackSubsessionStart();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #735 <Method void trackSubsessionStart()>
		} else
	//*  17   35:goto            50
		{
			activityState.enabled = flag;
	//   18   38:aload_0         
	//   19   39:getfield        #221 <Field ActivityState activityState>
	//   20   42:iload_1         
	//   21   43:putfield        #595 <Field boolean ActivityState.enabled>
			writeActivityState();
	//   22   46:aload_0         
	//   23   47:invokespecial   #306 <Method void writeActivityState()>
		}
		updateStatus(flag ^ true, "Pausing package handler and attribution handler to disable the SDK", "Package and attribution handler remain paused due to the SDK is offline", "Resuming package handler and attribution handler to enabled the SDK");
	//   24   50:aload_0         
	//   25   51:iload_1         
	//   26   52:iconst_1        
	//   27   53:ixor            
	//   28   54:ldc2            #765 <String "Pausing package handler and attribution handler to disable the SDK">
	//   29   57:ldc2            #767 <String "Package and attribution handler remain paused due to the SDK is offline">
	//   30   60:ldc2            #769 <String "Resuming package handler and attribution handler to enabled the SDK">
	//   31   63:invokespecial   #771 <Method void updateStatus(boolean, String, String, String)>
	//   32   66:return          
	}

	public void setOfflineMode(boolean flag)
	{
		if(!hasChangedState(offline, flag, "Adjust already in offline mode", "Adjust already in online mode"))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #579 <Field boolean offline>
	//*   3    5:iload_1         
	//*   4    6:ldc2            #774 <String "Adjust already in offline mode">
	//*   5    9:ldc2            #776 <String "Adjust already in online mode">
	//*   6   12:invokespecial   #763 <Method boolean hasChangedState(boolean, boolean, String, String)>
	//*   7   15:ifne            19
			return;
	//    8   18:return          
		offline = flag;
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:putfield        #579 <Field boolean offline>
		if(activityState == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #221 <Field ActivityState activityState>
	//*  14   28:ifnonnull       35
			trackSubsessionStart();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #735 <Method void trackSubsessionStart()>
		updateStatus(flag, "Pausing package and attribution handler to put in offline mode", "Package and attribution handler remain paused because the SDK is disabled", "Resuming package handler and attribution handler to put in online mode");
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:ldc2            #778 <String "Pausing package and attribution handler to put in offline mode">
	//   20   40:ldc2            #780 <String "Package and attribution handler remain paused because the SDK is disabled">
	//   21   43:ldc2            #782 <String "Resuming package handler and attribution handler to put in online mode">
	//   22   46:invokespecial   #771 <Method void updateStatus(boolean, String, String, String)>
	//   23   49:return          
	}

	public void trackEvent(AdjustEvent adjustevent)
	{
		if(activityState == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field ActivityState activityState>
	//*   2    4:ifnonnull       11
			trackSubsessionStart();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #735 <Method void trackSubsessionStart()>
		Message message = Message.obtain();
	//    5   11:invokestatic    #103 <Method Message Message.obtain()>
	//    6   14:astore_2        
		message.arg1 = 0x11bba;
	//    7   15:aload_2         
	//    8   16:ldc2            #784 <Int 0x11bba>
	//    9   19:putfield        #108 <Field int Message.arg1>
		message.obj = ((Object) (adjustevent));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:putfield        #745 <Field Object Message.obj>
		sessionHandler.sendMessage(message);
	//   13   27:aload_0         
	//   14   28:getfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #112 <Method boolean ActivityHandler$SessionHandler.sendMessage(Message)>
	//   17   35:pop             
	//   18   36:return          
	}

	public void trackSubsessionEnd()
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #103 <Method Message Message.obtain()>
	//    1    3:astore_1        
		message.arg1 = 0x11bb9;
	//    2    4:aload_1         
	//    3    5:ldc2            #785 <Int 0x11bb9>
	//    4    8:putfield        #108 <Field int Message.arg1>
		sessionHandler.sendMessage(message);
	//    5   11:aload_0         
	//    6   12:getfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #112 <Method boolean ActivityHandler$SessionHandler.sendMessage(Message)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void trackSubsessionStart()
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #103 <Method Message Message.obtain()>
	//    1    3:astore_1        
		message.arg1 = 0x11bb8;
	//    2    4:aload_1         
	//    3    5:ldc2            #786 <Int 0x11bb8>
	//    4    8:putfield        #108 <Field int Message.arg1>
		sessionHandler.sendMessage(message);
	//    5   11:aload_0         
	//    6   12:getfield        #92  <Field ActivityHandler$SessionHandler sessionHandler>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #112 <Method boolean ActivityHandler$SessionHandler.sendMessage(Message)>
	//    9   19:pop             
	//   10   20:return          
	}

	public boolean tryUpdateAttribution(AdjustAttribution adjustattribution)
	{
		if(adjustattribution == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(adjustattribution.equals(((Object) (attribution))))
	//*   4    6:aload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #117 <Field AdjustAttribution attribution>
	//*   7   11:invokevirtual   #789 <Method boolean AdjustAttribution.equals(Object)>
	//*   8   14:ifeq            19
		{
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		} else
		{
			saveAttribution(adjustattribution);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #791 <Method void saveAttribution(AdjustAttribution)>
			launchAttributionListener();
	//   14   24:aload_0         
	//   15   25:invokespecial   #793 <Method void launchAttributionListener()>
			return true;
	//   16   28:iconst_1        
	//   17   29:ireturn         
		}
	}

	private static final String ACTIVITY_STATE_NAME = "Activity state";
	private static final String ADJUST_PREFIX = "adjust_";
	private static final String ATTRIBUTION_NAME = "Attribution";
	private static long SESSION_INTERVAL = 0L;
	private static long SUBSESSION_INTERVAL = 0L;
	private static long TIMER_INTERVAL = 0L;
	private static long TIMER_START = 0L;
	private static final String TIME_TRAVEL = "Time travel!";
	private ActivityState activityState;
	private AdjustConfig adjustConfig;
	private AdjustAttribution attribution;
	private IAttributionHandler attributionHandler;
	private DeviceInfo deviceInfo;
	private boolean enabled;
	private ILogger logger;
	private boolean offline;
	private IPackageHandler packageHandler;
	private SessionHandler sessionHandler;
	private TimerCycle timer;


/*
	static AdjustAttribution access$000(ActivityHandler activityhandler)
	{
		return activityhandler.attribution;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field AdjustAttribution attribution>
	//    2    4:areturn         
	}

*/


/*
	static AdjustConfig access$100(ActivityHandler activityhandler)
	{
		return activityhandler.adjustConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field AdjustConfig adjustConfig>
	//    2    4:areturn         
	}

*/


/*
	static void access$1000(ActivityHandler activityhandler)
	{
		activityhandler.timerFiredInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method void timerFiredInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1100(ActivityHandler activityhandler)
	{
		activityhandler.timerFired();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void timerFired()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$200(ActivityHandler activityhandler)
	{
		activityhandler.initInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void initInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$300(ActivityHandler activityhandler)
	{
		activityhandler.startInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void startInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$400(ActivityHandler activityhandler)
	{
		activityhandler.endInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method void endInternal()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$500(ActivityHandler activityhandler, AdjustEvent adjustevent)
	{
		activityhandler.trackEventInternal(adjustevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void trackEventInternal(AdjustEvent)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$600(ActivityHandler activityhandler, JSONObject jsonobject)
	{
		activityhandler.finishedTrackingActivityInternal(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #154 <Method void finishedTrackingActivityInternal(JSONObject)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$700(ActivityHandler activityhandler, Uri uri, long l)
	{
		activityhandler.readOpenUrlInternal(uri, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #160 <Method void readOpenUrlInternal(Uri, long)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$800(ActivityHandler activityhandler, String s, long l)
	{
		activityhandler.sendReferrerInternal(s, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #166 <Method void sendReferrerInternal(String, long)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$900(ActivityHandler activityhandler)
	{
		activityhandler.updateHandlersStatusInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #170 <Method void updateHandlersStatusInternal()>
		return;
	//    2    4:return          
	}

*/
}
