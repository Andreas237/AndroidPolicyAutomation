// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.content.*;
import android.content.pm.*;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import io.radar.sdk.RadarReceiver;
import io.radar.sdk.internal.*;
import io.radar.sdk.internal.repository.IdentityRepository;
import io.radar.sdk.internal.repository.OptionsRepository;
import io.radar.sdk.model.*;
import java.util.*;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.api:
//			ApiClientRepository, ApiService, LocationWorker, RadarResponse, 
//			Success, Error

public final class ApiClient
{

	public ApiClient(Context context1, IdentityRepository identityrepository, OptionsRepository optionsrepository, ApiClientRepository apiclientrepository, ApiService apiservice)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context1)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #101 <String "context">
	//    2    3:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (identityrepository)), "identityRepository");
	//    3    6:aload_2         
	//    4    7:ldc1            #108 <String "identityRepository">
	//    5    9:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (optionsrepository)), "optionsRepository");
	//    6   12:aload_3         
	//    7   13:ldc1            #109 <String "optionsRepository">
	//    8   15:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (apiclientrepository)), "repository");
	//    9   18:aload           4
	//   10   20:ldc1            #110 <String "repository">
	//   11   22:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (apiservice)), "apiService");
	//   12   25:aload           5
	//   13   27:ldc1            #111 <String "apiService">
	//   14   29:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//   15   32:aload_0         
	//   16   33:invokespecial   #114 <Method void Object()>
		context = context1;
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:putfield        #116 <Field Context context>
		identityRepository = identityrepository;
	//   20   41:aload_0         
	//   21   42:aload_2         
	//   22   43:putfield        #118 <Field IdentityRepository identityRepository>
		optionsRepository = optionsrepository;
	//   23   46:aload_0         
	//   24   47:aload_3         
	//   25   48:putfield        #120 <Field OptionsRepository optionsRepository>
		repository = apiclientrepository;
	//   26   51:aload_0         
	//   27   52:aload           4
	//   28   54:putfield        #122 <Field ApiClientRepository repository>
		apiService = apiservice;
	//   29   57:aload_0         
	//   30   58:aload           5
	//   31   60:putfield        #124 <Field ApiService apiService>
	//   32   63:aload_0         
	//   33   64:new             #126 <Class ArrayList>
	//   34   67:dup             
	//   35   68:invokespecial   #127 <Method void ArrayList()>
	//   36   71:putfield        #129 <Field ArrayList callbacks>
	//   37   74:aload_0         
	//   38   75:new             #131 <Class Handler>
	//   39   78:dup             
	//   40   79:invokestatic    #137 <Method Looper Looper.getMainLooper()>
	//   41   82:invokespecial   #140 <Method void Handler(Looper)>
	//   42   85:putfield        #142 <Field Handler handler>
		repository.loadAdId$sdk_release();
	//   43   88:aload_0         
	//   44   89:getfield        #122 <Field ApiClientRepository repository>
	//   45   92:invokevirtual   #147 <Method void ApiClientRepository.loadAdId$sdk_release()>
	//   46   95:return          
	}

	private final void broadcastIntent(Intent intent)
	{
		LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Context context>
	//    2    4:invokestatic    #168 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #172 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//    5   11:pop             
		Object obj = ((Object) (context.getPackageManager().queryBroadcastReceivers(intent, 0)));
	//    6   12:aload_0         
	//    7   13:getfield        #116 <Field Context context>
	//    8   16:invokevirtual   #178 <Method PackageManager Context.getPackageManager()>
	//    9   19:aload_1         
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #184 <Method java.util.List PackageManager.queryBroadcastReceivers(Intent, int)>
	//   12   24:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(obj, "matches");
	//   13   25:aload_2         
	//   14   26:ldc1            #186 <String "matches">
	//   15   28:invokestatic    #189 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		obj = ((Object) (((Iterable)obj).iterator()));
	//   16   31:aload_2         
	//   17   32:checkcast       #191 <Class Iterable>
	//   18   35:invokeinterface #195 <Method Iterator Iterable.iterator()>
	//   19   40:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   41:aload_2         
	//   21   42:invokeinterface #200 <Method boolean Iterator.hasNext()>
	//   22   47:ifeq            132
			ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
	//   23   50:aload_2         
	//   24   51:invokeinterface #204 <Method Object Iterator.next()>
	//   25   56:checkcast       #206 <Class ResolveInfo>
	//   26   59:astore_3        
			Intent intent1 = new Intent(intent);
	//   27   60:new             #208 <Class Intent>
	//   28   63:dup             
	//   29   64:aload_1         
	//   30   65:invokespecial   #210 <Method void Intent(Intent)>
	//   31   68:astore          4
			if(Intrinsics.areEqual(((Object) (context.getPackageName())), ((Object) (resolveinfo.activityInfo.packageName))))
	//*  32   70:aload_0         
	//*  33   71:getfield        #116 <Field Context context>
	//*  34   74:invokevirtual   #214 <Method String Context.getPackageName()>
	//*  35   77:aload_3         
	//*  36   78:getfield        #218 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  37   81:getfield        #224 <Field String ActivityInfo.packageName>
	//*  38   84:invokestatic    #228 <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  39   87:ifeq            41
			{
				intent1.setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
	//   40   90:aload           4
	//   41   92:new             #230 <Class ComponentName>
	//   42   95:dup             
	//   43   96:aload_3         
	//   44   97:getfield        #218 <Field ActivityInfo ResolveInfo.activityInfo>
	//   45  100:getfield        #234 <Field ApplicationInfo ActivityInfo.applicationInfo>
	//   46  103:getfield        #237 <Field String ApplicationInfo.packageName>
	//   47  106:aload_3         
	//   48  107:getfield        #218 <Field ActivityInfo ResolveInfo.activityInfo>
	//   49  110:getfield        #240 <Field String ActivityInfo.name>
	//   50  113:invokespecial   #243 <Method void ComponentName(String, String)>
	//   51  116:invokevirtual   #247 <Method Intent Intent.setComponent(ComponentName)>
	//   52  119:pop             
				context.sendBroadcast(intent1);
	//   53  120:aload_0         
	//   54  121:getfield        #116 <Field Context context>
	//   55  124:aload           4
	//   56  126:invokevirtual   #249 <Method void Context.sendBroadcast(Intent)>
			}
		} while(true);
	//   57  129:goto            41
	//   58  132:return          
	}

	public static void deliverResult$sdk_release$default(ApiClient apiclient, io.radar.sdk.Radar.RadarStatus radarstatus, Location location, RadarEvent aradarevent[], RadarUser radaruser, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload           5
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            12
			location = (Location)null;
	//    4    7:aconst_null     
	//    5    8:checkcast       #254 <Class Location>
	//    6   11:astore_2        
		if((i & 4) != 0)
	//*   7   12:iload           5
	//*   8   14:iconst_4        
	//*   9   15:iand            
	//*  10   16:ifeq            24
			aradarevent = (RadarEvent[])null;
	//   11   19:aconst_null     
	//   12   20:checkcast       #256 <Class RadarEvent[]>
	//   13   23:astore_3        
		if((i & 8) != 0)
	//*  14   24:iload           5
	//*  15   26:bipush          8
	//*  16   28:iand            
	//*  17   29:ifeq            38
			radaruser = (RadarUser)null;
	//   18   32:aconst_null     
	//   19   33:checkcast       #258 <Class RadarUser>
	//   20   36:astore          4
		apiclient.deliverResult$sdk_release(radarstatus, location, aradarevent, radaruser);
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:aload_2         
	//   24   41:aload_3         
	//   25   42:aload           4
	//   26   44:invokevirtual   #260 <Method void deliverResult$sdk_release(io.radar.sdk.Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
	//   27   47:return          
	}

	public static void retryFailedStop$sdk_release$default(ApiClient apiclient, Function0 function0, int i, Object obj)
	{
		static final class retryFailedStop._cls1 extends Lambda
			implements Function0
		{

			public volatile Object invoke()
			{
				invoke();
			//    0    0:aload_0         
			//    1    1:invokevirtual   #42  <Method void invoke()>
				return ((Object) (Unit.INSTANCE));
			//    2    4:getstatic       #47  <Field Unit Unit.INSTANCE>
			//    3    7:areturn         
			}

			public final void invoke()
			{
			//    0    0:return          
			}

			public static final retryFailedStop._cls1 INSTANCE = new retryFailedStop._cls1();

			static 
			{
			//    0    0:new             #2   <Class ApiClient$retryFailedStop$1>
			//    1    3:dup             
			//    2    4:invokespecial   #33  <Method void ApiClient$retryFailedStop$1()>
			//    3    7:putstatic       #35  <Field ApiClient$retryFailedStop$1 INSTANCE>
			//*   4   10:return          
			}

		}

		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            13
			function0 = (Function0)retryFailedStop._cls1.INSTANCE;
	//    4    6:getstatic       #266 <Field ApiClient$retryFailedStop$1 ApiClient$retryFailedStop$1.INSTANCE>
	//    5    9:checkcast       #268 <Class Function0>
	//    6   12:astore_1        
		apiclient.retryFailedStop$sdk_release(function0);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #271 <Method void retryFailedStop$sdk_release(Function0)>
	//   10   18:return          
	}

	private final void updateLocation(Location location, boolean flag, boolean flag1, boolean flag2, boolean flag3, Function0 function0)
	{
		String s;
		handler.removeCallbacksAndMessages(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field Handler handler>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #276 <Method void Handler.removeCallbacksAndMessages(Object)>
		s = identityRepository.getPublishableKey$sdk_release();
	//    4    8:aload_0         
	//    5    9:getfield        #118 <Field IdentityRepository identityRepository>
	//    6   12:invokevirtual   #281 <Method String IdentityRepository.getPublishableKey$sdk_release()>
	//    7   15:astore          7
		if(s == null)
	//*   8   17:aload           7
	//*   9   19:ifnonnull       48
		{
			broadcastError$sdk_release(io.radar.sdk.Radar.RadarStatus.ERROR_PUBLISHABLE_KEY);
	//   10   22:aload_0         
	//   11   23:getstatic       #286 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_PUBLISHABLE_KEY>
	//   12   26:invokevirtual   #289 <Method void broadcastError$sdk_release(io.radar.sdk.Radar$RadarStatus)>
			deliverResult$sdk_release(io.radar.sdk.Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)));
	//   13   29:aload_0         
	//   14   30:getstatic       #286 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_PUBLISHABLE_KEY>
	//   15   33:aconst_null     
	//   16   34:aconst_null     
	//   17   35:aconst_null     
	//   18   36:invokevirtual   #260 <Method void deliverResult$sdk_release(io.radar.sdk.Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
			function0.invoke();
	//   19   39:aload           6
	//   20   41:invokeinterface #292 <Method Object Function0.invoke()>
	//   21   46:pop             
			return;
	//   22   47:return          
		}
		this;
	//   23   48:aload_0         
		JVM INSTR monitorenter ;
	//   24   49:monitorenter    
		Object obj;
		Date date;
		obj = ((Object) (new Date()));
	//   25   50:new             #294 <Class Date>
	//   26   53:dup             
	//   27   54:invokespecial   #295 <Method void Date()>
	//   28   57:astore          8
		date = repository.getLastSentAt$sdk_release();
	//   29   59:aload_0         
	//   30   60:getfield        #122 <Field ApiClientRepository repository>
	//   31   63:invokevirtual   #299 <Method Date ApiClientRepository.getLastSentAt$sdk_release()>
	//   32   66:astore          9
		if(date == null || flag || flag1)
			break MISSING_BLOCK_LABEL_122;
	//   33   68:aload           9
	//   34   70:ifnull          122
	//   35   73:iload_2         
	//   36   74:ifne            122
	//   37   77:iload_3         
	//   38   78:ifne            122
		if(((Date) (obj)).getTime() - date.getTime() >= 60000L)
			break MISSING_BLOCK_LABEL_122;
	//   39   81:aload           8
	//   40   83:invokevirtual   #303 <Method long Date.getTime()>
	//   41   86:aload           9
	//   42   88:invokevirtual   #303 <Method long Date.getTime()>
	//   43   91:lsub            
	//   44   92:ldc2w           #304 <Long 60000L>
	//   45   95:lcmp            
	//   46   96:ifge            122
		RadarLogger.d$default(RadarLogger.INSTANCE, "Client rate limit hit (1 req/min). Skipping request", ((Throwable) (null)), 2, ((Object) (null)));
	//   47   99:getstatic       #310 <Field RadarLogger RadarLogger.INSTANCE>
	//   48  102:ldc2            #312 <String "Client rate limit hit (1 req/min). Skipping request">
	//   49  105:aconst_null     
	//   50  106:iconst_2        
	//   51  107:aconst_null     
	//   52  108:invokestatic    #316 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
		function0.invoke();
	//   53  111:aload           6
	//   54  113:invokeinterface #292 <Method Object Function0.invoke()>
	//   55  118:pop             
		this;
	//   56  119:aload_0         
		JVM INSTR monitorexit ;
	//   57  120:monitorexit     
		return;
	//   58  121:return          
		repository.setLastSentAt$sdk_release(((Date) (obj)));
	//   59  122:aload_0         
	//   60  123:getfield        #122 <Field ApiClientRepository repository>
	//   61  126:aload           8
	//   62  128:invokevirtual   #320 <Method void ApiClientRepository.setLastSentAt$sdk_release(Date)>
		obj = ((Object) (Unit.INSTANCE));
	//   63  131:getstatic       #325 <Field Unit Unit.INSTANCE>
	//   64  134:astore          8
		this;
	//   65  136:aload_0         
		JVM INSTR monitorexit ;
	//   66  137:monitorexit     
		function0 = ((Function0) ((Function1)new Function1(this, flag, flag1, location, flag3, function0) {

			public volatile Object invoke(Object obj1)
			{
				invoke((RadarResponse)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #59  <Class RadarResponse>
			//    3    5:invokevirtual   #62  <Method void invoke(RadarResponse)>
				return ((Object) (Unit.INSTANCE));
			//    4    8:getstatic       #68  <Field Unit Unit.INSTANCE>
			//    5   11:areturn         
			}

			public final void invoke(RadarResponse radarresponse)
			{
label0:
				{
label1:
					{
						boolean flag4;
						boolean flag5;
						boolean flag6;
						boolean flag8;
						Success success;
label2:
						{
							Intrinsics.checkParameterIsNotNull(((Object) (radarresponse)), "response");
			//    0    0:aload_1         
			//    1    1:ldc1            #70  <String "response">
			//    2    3:invokestatic    #76  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
							if(!(radarresponse instanceof Success))
								break label1;
			//    3    6:aload_1         
			//    4    7:instanceof      #78  <Class Success>
			//    5   10:ifeq            242
							LocationWorker.Companion.cancelWork$sdk_release();
			//    6   13:getstatic       #84  <Field LocationWorker$Companion LocationWorker.Companion>
			//    7   16:invokevirtual   #90  <Method void LocationWorker$Companion.cancelWork$sdk_release()>
							repository.setLastFailedStop$sdk_release((Location)null);
			//    8   19:aload_0         
			//    9   20:getfield        #42  <Field ApiClient this$0>
			//   10   23:invokestatic    #94  <Method ApiClientRepository ApiClient.access$getRepository$p(ApiClient)>
			//   11   26:aconst_null     
			//   12   27:checkcast       #96  <Class Location>
			//   13   30:invokevirtual   #102 <Method void ApiClientRepository.setLastFailedStop$sdk_release(Location)>
							success = (Success)radarresponse;
			//   14   33:aload_1         
			//   15   34:checkcast       #78  <Class Success>
			//   16   37:astore          7
							RadarUser radaruser = success.getUser();
			//   17   39:aload           7
			//   18   41:invokevirtual   #106 <Method RadarUser Success.getUser()>
			//   19   44:astore          8
							radarresponse = ((RadarResponse) (radaruser.getPlace()));
			//   20   46:aload           8
			//   21   48:invokevirtual   #112 <Method io.radar.sdk.model.RadarPlace RadarUser.getPlace()>
			//   22   51:astore_1        
							flag8 = true;
			//   23   52:iconst_1        
			//   24   53:istore          6
							if(radarresponse != null)
			//*  25   55:aload_1         
			//*  26   56:ifnull          65
								flag6 = true;
			//   27   59:iconst_1        
			//   28   60:istore          4
							else
			//*  29   62:goto            68
								flag6 = false;
			//   30   65:iconst_0        
			//   31   66:istore          4
							radarresponse = ((RadarResponse) (radaruser.getGeofences()));
			//   32   68:aload           8
			//   33   70:invokevirtual   #116 <Method RadarGeofence[] RadarUser.getGeofences()>
			//   34   73:astore_1        
							if(radarresponse == null)
			//*  35   74:aload_1         
			//*  36   75:ifnull          81
			//*  37   78:goto            86
								radarresponse = ((RadarResponse) (new RadarGeofence[0]));
			//   38   81:iconst_0        
			//   39   82:anewarray       RadarGeofence[]
			//   40   85:astore_1        
							if(radarresponse.length == 0)
			//*  41   86:aload_1         
			//*  42   87:arraylength     
			//*  43   88:ifne            96
								flag4 = true;
			//   44   91:iconst_1        
			//   45   92:istore_2        
							else
			//*  46   93:goto            98
								flag4 = false;
			//   47   96:iconst_0        
			//   48   97:istore_2        
							radarresponse = ((RadarResponse) (radaruser.getInsights()));
			//   49   98:aload           8
			//   50  100:invokevirtual   #122 <Method RadarUserInsights RadarUser.getInsights()>
			//   51  103:astore_1        
							if(radarresponse != null)
			//*  52  104:aload_1         
			//*  53  105:ifnull          136
							{
								radarresponse = ((RadarResponse) (((RadarUserInsights) (radarresponse)).getState()));
			//   54  108:aload_1         
			//   55  109:invokevirtual   #128 <Method RadarUserInsightsState RadarUserInsights.getState()>
			//   56  112:astore_1        
								if(radarresponse != null && (((RadarUserInsightsState) (radarresponse)).getHome() || ((RadarUserInsightsState) (radarresponse)).getOffice()))
			//*  57  113:aload_1         
			//*  58  114:ifnull          136
			//*  59  117:aload_1         
			//*  60  118:invokevirtual   #134 <Method boolean RadarUserInsightsState.getHome()>
			//*  61  121:ifne            131
			//*  62  124:aload_1         
			//*  63  125:invokevirtual   #137 <Method boolean RadarUserInsightsState.getOffice()>
			//*  64  128:ifeq            136
								{
									flag5 = true;
			//   65  131:iconst_1        
			//   66  132:istore_3        
									break label2;
			//   67  133:goto            138
								}
							}
							flag5 = false;
			//   68  136:iconst_0        
			//   69  137:istore_3        
						}
						repository.setAtPlace$sdk_release(flag6);
			//   70  138:aload_0         
			//   71  139:getfield        #42  <Field ApiClient this$0>
			//   72  142:invokestatic    #94  <Method ApiClientRepository ApiClient.access$getRepository$p(ApiClient)>
			//   73  145:iload           4
			//   74  147:invokevirtual   #141 <Method void ApiClientRepository.setAtPlace$sdk_release(boolean)>
						radarresponse = ((RadarResponse) (repository));
			//   75  150:aload_0         
			//   76  151:getfield        #42  <Field ApiClient this$0>
			//   77  154:invokestatic    #94  <Method ApiClientRepository ApiClient.access$getRepository$p(ApiClient)>
			//   78  157:astore_1        
						boolean flag7 = flag8;
			//   79  158:iload           6
			//   80  160:istore          5
						if(!flag6)
			//*  81  162:iload           4
			//*  82  164:ifne            191
						{
							flag7 = flag8;
			//   83  167:iload           6
			//   84  169:istore          5
							if(!(flag4 ^ true))
			//*  85  171:iload_2         
			//*  86  172:iconst_1        
			//*  87  173:ixor            
			//*  88  174:ifne            191
								if(flag5)
			//*  89  177:iload_3         
			//*  90  178:ifeq            188
									flag7 = flag8;
			//   91  181:iload           6
			//   92  183:istore          5
								else
			//*  93  185:goto            191
									flag7 = false;
			//   94  188:iconst_0        
			//   95  189:istore          5
						}
						((ApiClientRepository) (radarresponse)).setCanExit$sdk_release(flag7);
			//   96  191:aload_1         
			//   97  192:iload           5
			//   98  194:invokevirtual   #144 <Method void ApiClientRepository.setCanExit$sdk_release(boolean)>
						deliverResult$sdk_release(io.radar.sdk.Radar.RadarStatus.SUCCESS, success.getLocation(), success.getEvents(), success.getUser());
			//   99  197:aload_0         
			//  100  198:getfield        #42  <Field ApiClient this$0>
			//  101  201:getstatic       #150 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.SUCCESS>
			//  102  204:aload           7
			//  103  206:invokevirtual   #154 <Method Location Success.getLocation()>
			//  104  209:aload           7
			//  105  211:invokevirtual   #158 <Method RadarEvent[] Success.getEvents()>
			//  106  214:aload           7
			//  107  216:invokevirtual   #106 <Method RadarUser Success.getUser()>
			//  108  219:invokevirtual   #162 <Method void ApiClient.deliverResult$sdk_release(io.radar.sdk.Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
						broadcastSuccess$sdk_release(success.getPayload(), success.getLocation());
			//  109  222:aload_0         
			//  110  223:getfield        #42  <Field ApiClient this$0>
			//  111  226:aload           7
			//  112  228:invokevirtual   #166 <Method JSONObject Success.getPayload()>
			//  113  231:aload           7
			//  114  233:invokevirtual   #154 <Method Location Success.getLocation()>
			//  115  236:invokevirtual   #170 <Method void ApiClient.broadcastSuccess$sdk_release(JSONObject, Location)>
						break label0;
			//  116  239:goto            386
					}
					if(radarresponse instanceof Error)
			//* 117  242:aload_1         
			//* 118  243:instanceof      #172 <Class Error>
			//* 119  246:ifeq            386
					{
						if(optionsRepository.getOfflineMode$sdk_release() == io.radar.sdk.Radar.RadarTrackingOffline.REPLAY_STOPPED && $stopped && !$foreground && ((Error)radarresponse).getStatus() == io.radar.sdk.Radar.RadarStatus.ERROR_NETWORK)
			//* 120  249:aload_0         
			//* 121  250:getfield        #42  <Field ApiClient this$0>
			//* 122  253:invokestatic    #176 <Method OptionsRepository ApiClient.access$getOptionsRepository$p(ApiClient)>
			//* 123  256:invokevirtual   #182 <Method io.radar.sdk.Radar$RadarTrackingOffline OptionsRepository.getOfflineMode$sdk_release()>
			//* 124  259:getstatic       #188 <Field io.radar.sdk.Radar$RadarTrackingOffline io.radar.sdk.Radar$RadarTrackingOffline.REPLAY_STOPPED>
			//* 125  262:if_acmpne       312
			//* 126  265:aload_0         
			//* 127  266:getfield        #44  <Field boolean $stopped>
			//* 128  269:ifeq            312
			//* 129  272:aload_0         
			//* 130  273:getfield        #46  <Field boolean $foreground>
			//* 131  276:ifne            312
			//* 132  279:aload_1         
			//* 133  280:checkcast       #172 <Class Error>
			//* 134  283:invokevirtual   #192 <Method io.radar.sdk.Radar$RadarStatus Error.getStatus()>
			//* 135  286:getstatic       #195 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_NETWORK>
			//* 136  289:if_acmpne       312
						{
							repository.setLastFailedStop$sdk_release($location);
			//  137  292:aload_0         
			//  138  293:getfield        #42  <Field ApiClient this$0>
			//  139  296:invokestatic    #94  <Method ApiClientRepository ApiClient.access$getRepository$p(ApiClient)>
			//  140  299:aload_0         
			//  141  300:getfield        #48  <Field Location $location>
			//  142  303:invokevirtual   #102 <Method void ApiClientRepository.setLastFailedStop$sdk_release(Location)>
							LocationWorker.Companion.scheduleWork$sdk_release();
			//  143  306:getstatic       #84  <Field LocationWorker$Companion LocationWorker.Companion>
			//  144  309:invokevirtual   #198 <Method void LocationWorker$Companion.scheduleWork$sdk_release()>
						}
						if($replayed && ((Error)radarresponse).getStatus() == io.radar.sdk.Radar.RadarStatus.ERROR_LOCATION)
			//* 145  312:aload_0         
			//* 146  313:getfield        #50  <Field boolean $replayed>
			//* 147  316:ifeq            352
			//* 148  319:aload_1         
			//* 149  320:checkcast       #172 <Class Error>
			//* 150  323:invokevirtual   #192 <Method io.radar.sdk.Radar$RadarStatus Error.getStatus()>
			//* 151  326:getstatic       #201 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_LOCATION>
			//* 152  329:if_acmpne       352
						{
							repository.setLastFailedStop$sdk_release((Location)null);
			//  153  332:aload_0         
			//  154  333:getfield        #42  <Field ApiClient this$0>
			//  155  336:invokestatic    #94  <Method ApiClientRepository ApiClient.access$getRepository$p(ApiClient)>
			//  156  339:aconst_null     
			//  157  340:checkcast       #96  <Class Location>
			//  158  343:invokevirtual   #102 <Method void ApiClientRepository.setLastFailedStop$sdk_release(Location)>
							LocationWorker.Companion.cancelWork$sdk_release();
			//  159  346:getstatic       #84  <Field LocationWorker$Companion LocationWorker.Companion>
			//  160  349:invokevirtual   #90  <Method void LocationWorker$Companion.cancelWork$sdk_release()>
						}
						ApiClient apiclient = ApiClient.this;
			//  161  352:aload_0         
			//  162  353:getfield        #42  <Field ApiClient this$0>
			//  163  356:astore          7
						radarresponse = ((RadarResponse) ((Error)radarresponse));
			//  164  358:aload_1         
			//  165  359:checkcast       #172 <Class Error>
			//  166  362:astore_1        
						apiclient.deliverResult$sdk_release(((Error) (radarresponse)).getStatus(), ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)));
			//  167  363:aload           7
			//  168  365:aload_1         
			//  169  366:invokevirtual   #192 <Method io.radar.sdk.Radar$RadarStatus Error.getStatus()>
			//  170  369:aconst_null     
			//  171  370:aconst_null     
			//  172  371:aconst_null     
			//  173  372:invokevirtual   #162 <Method void ApiClient.deliverResult$sdk_release(io.radar.sdk.Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
						broadcastError$sdk_release(((Error) (radarresponse)).getStatus());
			//  174  375:aload_0         
			//  175  376:getfield        #42  <Field ApiClient this$0>
			//  176  379:aload_1         
			//  177  380:invokevirtual   #192 <Method io.radar.sdk.Radar$RadarStatus Error.getStatus()>
			//  178  383:invokevirtual   #205 <Method void ApiClient.broadcastError$sdk_release(io.radar.sdk.Radar$RadarStatus)>
					}
				}
				$completionCallback.invoke();
			//  179  386:aload_0         
			//  180  387:getfield        #52  <Field Function0 $completionCallback>
			//  181  390:invokeinterface #210 <Method Object Function0.invoke()>
			//  182  395:pop             
			//  183  396:return          
			}

			final Function0 $completionCallback;
			final boolean $foreground;
			final Location $location;
			final boolean $replayed;
			final boolean $stopped;
			final ApiClient this$0;

			
			{
				this$0 = apiclient;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #42  <Field ApiClient this$0>
				$stopped = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #44  <Field boolean $stopped>
				$foreground = flag1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #46  <Field boolean $foreground>
				$location = location;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #48  <Field Location $location>
				$replayed = flag2;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #50  <Field boolean $replayed>
				$completionCallback = function0;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #52  <Field Function0 $completionCallback>
				super(1);
			//   18   33:aload_0         
			//   19   34:iconst_1        
			//   20   35:invokespecial   #55  <Method void Lambda(int)>
			//   21   38:return          
			}
		}
));
	//   67  138:new             #16  <Class ApiClient$updateLocation$callback$1>
	//   68  141:dup             
	//   69  142:aload_0         
	//   70  143:iload_2         
	//   71  144:iload_3         
	//   72  145:aload_1         
	//   73  146:iload           5
	//   74  148:aload           6
	//   75  150:invokespecial   #328 <Method void ApiClient$updateLocation$callback$1(ApiClient, boolean, boolean, Location, boolean, Function0)>
	//   76  153:checkcast       #330 <Class Function1>
	//   77  156:astore          6
		if(flag2)
	//*  78  158:iload           4
	//*  79  160:ifeq            192
		{
			apiService.fetchPlaces(location, (Function1)new Function1(this, s, location, flag, flag1, flag3, ((Function1) (function0))) {

				public volatile Object invoke(Object obj1)
				{
					invoke((String)obj1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #62  <Class String>
				//    3    5:invokevirtual   #65  <Method void invoke(String)>
					return ((Object) (Unit.INSTANCE));
				//    4    8:getstatic       #71  <Field Unit Unit.INSTANCE>
				//    5   11:areturn         
				}

				public final void invoke(String s1)
				{
					apiService.userUpsert($publishableKey, $location, $stopped, $foreground, $replayed, s1, $callback);
				//    0    0:aload_0         
				//    1    1:getfield        #43  <Field ApiClient this$0>
				//    2    4:invokestatic    #76  <Method ApiService ApiClient.access$getApiService$p(ApiClient)>
				//    3    7:aload_0         
				//    4    8:getfield        #45  <Field String $publishableKey>
				//    5   11:aload_0         
				//    6   12:getfield        #47  <Field Location $location>
				//    7   15:aload_0         
				//    8   16:getfield        #49  <Field boolean $stopped>
				//    9   19:aload_0         
				//   10   20:getfield        #51  <Field boolean $foreground>
				//   11   23:aload_0         
				//   12   24:getfield        #53  <Field boolean $replayed>
				//   13   27:aload_1         
				//   14   28:aload_0         
				//   15   29:getfield        #55  <Field Function1 $callback>
				//   16   32:invokevirtual   #82  <Method void ApiService.userUpsert(String, Location, boolean, boolean, boolean, String, Function1)>
				//   17   35:return          
				}

				final Function1 $callback;
				final boolean $foreground;
				final Location $location;
				final String $publishableKey;
				final boolean $replayed;
				final boolean $stopped;
				final ApiClient this$0;

			
			{
				this$0 = apiclient;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #43  <Field ApiClient this$0>
				$publishableKey = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #45  <Field String $publishableKey>
				$location = location;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #47  <Field Location $location>
				$stopped = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #49  <Field boolean $stopped>
				$foreground = flag1;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #51  <Field boolean $foreground>
				$replayed = flag2;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #53  <Field boolean $replayed>
				$callback = function1;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #55  <Field Function1 $callback>
				super(1);
			//   21   39:aload_0         
			//   22   40:iconst_1        
			//   23   41:invokespecial   #58  <Method void Lambda(int)>
			//   24   44:return          
			}
			}
);
	//   80  163:aload_0         
	//   81  164:getfield        #124 <Field ApiService apiService>
	//   82  167:aload_1         
	//   83  168:new             #14  <Class ApiClient$updateLocation$3>
	//   84  171:dup             
	//   85  172:aload_0         
	//   86  173:aload           7
	//   87  175:aload_1         
	//   88  176:iload_2         
	//   89  177:iload_3         
	//   90  178:iload           5
	//   91  180:aload           6
	//   92  182:invokespecial   #333 <Method void ApiClient$updateLocation$3(ApiClient, String, Location, boolean, boolean, boolean, Function1)>
	//   93  185:checkcast       #330 <Class Function1>
	//   94  188:invokevirtual   #339 <Method void ApiService.fetchPlaces(Location, Function1)>
			return;
	//   95  191:return          
		} else
		{
			apiService.userUpsert(s, location, flag, flag1, flag3, ((String) (null)), ((Function1) (function0)));
	//   96  192:aload_0         
	//   97  193:getfield        #124 <Field ApiService apiService>
	//   98  196:aload           7
	//   99  198:aload_1         
	//  100  199:iload_2         
	//  101  200:iload_3         
	//  102  201:iload           5
	//  103  203:aconst_null     
	//  104  204:aload           6
	//  105  206:invokevirtual   #343 <Method void ApiService.userUpsert(String, Location, boolean, boolean, boolean, String, Function1)>
			return;
	//  106  209:return          
		}
		location;
	//  107  210:astore_1        
	//* 108  211:aload_0         
		throw location;
	//  109  212:monitorexit     
	//  110  213:aload_1         
	//  111  214:athrow          
	}

	static void updateLocation$default(ApiClient apiclient, Location location, boolean flag, boolean flag1, boolean flag2, boolean flag3, Function0 function0, int i, 
			Object obj)
	{
		if((i & 0x10) != 0)
	//*   0    0:iload           7
	//*   1    2:bipush          16
	//*   2    4:iand            
	//*   3    5:ifeq            14
			flag3 = false;
	//    4    8:iconst_0        
	//    5    9:istore          5
	//*   6   11:goto            14
		static final class updateLocation._cls1 extends Lambda
			implements Function0
		{

			public volatile Object invoke()
			{
				invoke();
			//    0    0:aload_0         
			//    1    1:invokevirtual   #42  <Method void invoke()>
				return ((Object) (Unit.INSTANCE));
			//    2    4:getstatic       #47  <Field Unit Unit.INSTANCE>
			//    3    7:areturn         
			}

			public final void invoke()
			{
			//    0    0:return          
			}

			public static final updateLocation._cls1 INSTANCE = new updateLocation._cls1();

			static 
			{
			//    0    0:new             #2   <Class ApiClient$updateLocation$1>
			//    1    3:dup             
			//    2    4:invokespecial   #33  <Method void ApiClient$updateLocation$1()>
			//    3    7:putstatic       #35  <Field ApiClient$updateLocation$1 INSTANCE>
			//*   4   10:return          
			}

		}

		if((i & 0x20) != 0)
	//*   7   14:iload           7
	//*   8   16:bipush          32
	//*   9   18:iand            
	//*  10   19:ifeq            33
			function0 = (Function0)updateLocation._cls1.INSTANCE;
	//   11   22:getstatic       #350 <Field ApiClient$updateLocation$1 ApiClient$updateLocation$1.INSTANCE>
	//   12   25:checkcast       #268 <Class Function0>
	//   13   28:astore          6
	//*  14   30:goto            33
		apiclient.updateLocation(location, flag, flag1, flag2, flag3, function0);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:iload_2         
	//   18   36:iload_3         
	//   19   37:iload           4
	//   20   39:iload           5
	//   21   41:aload           6
	//   22   43:invokespecial   #352 <Method void updateLocation(Location, boolean, boolean, boolean, boolean, Function0)>
	//   23   46:return          
	}

	public static void verifyEvent$sdk_release$default(ApiClient apiclient, String s, io.radar.sdk.model.RadarEvent.RadarEventVerification radareventverification, String s1, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            12
			s1 = (String)null;
	//    4    7:aconst_null     
	//    5    8:checkcast       #356 <Class String>
	//    6   11:astore_3        
		apiclient.verifyEvent$sdk_release(s, radareventverification, s1);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:aload_2         
	//   10   15:aload_3         
	//   11   16:invokevirtual   #359 <Method void verifyEvent$sdk_release(String, io.radar.sdk.model.RadarEvent$RadarEventVerification, String)>
	//   12   19:return          
	}

	public final void addCallback$sdk_release(io.radar.sdk.Radar.RadarCallback radarcallback)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarcallback)), "callback");
	//    0    0:aload_1         
	//    1    1:ldc2            #361 <String "callback">
	//    2    4:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		callbacks.add(((Object) (radarcallback)));
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field ArrayList callbacks>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #365 <Method boolean ArrayList.add(Object)>
	//    7   15:pop             
		radarcallback = ((io.radar.sdk.Radar.RadarCallback) ((Runnable)new Runnable(this, radarcallback) {

			public final void run()
			{
				ApiClient apiclient = ApiClient.this;
			//    0    0:aload_0         
			//    1    1:getfield        #33  <Field ApiClient this$0>
			//    2    4:astore_1        
				apiclient;
			//    3    5:aload_1         
				JVM INSTR monitorenter ;
			//    4    6:monitorenter    
				io.radar.sdk.Radar.RadarCallback.DefaultImpls.onComplete$default($callback, io.radar.sdk.Radar.RadarStatus.ERROR_LOCATION, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)), 14, ((Object) (null)));
			//    5    7:aload_0         
			//    6    8:getfield        #35  <Field io.radar.sdk.Radar$RadarCallback $callback>
			//    7   11:getstatic       #45  <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_LOCATION>
			//    8   14:aconst_null     
			//    9   15:aconst_null     
			//   10   16:aconst_null     
			//   11   17:bipush          14
			//   12   19:aconst_null     
			//   13   20:invokestatic    #51  <Method void io.radar.sdk.Radar$RadarCallback$DefaultImpls.onComplete$default(io.radar.sdk.Radar$RadarCallback, io.radar.sdk.Radar$RadarStatus, Location, RadarEvent[], RadarUser, int, Object)>
				callbacks.remove(((Object) ($callback)));
			//   14   23:aload_0         
			//   15   24:getfield        #33  <Field ApiClient this$0>
			//   16   27:invokestatic    #55  <Method ArrayList ApiClient.access$getCallbacks$p(ApiClient)>
			//   17   30:aload_0         
			//   18   31:getfield        #35  <Field io.radar.sdk.Radar$RadarCallback $callback>
			//   19   34:invokevirtual   #61  <Method boolean ArrayList.remove(Object)>
			//   20   37:pop             
				apiclient;
			//   21   38:aload_1         
				JVM INSTR monitorexit ;
			//   22   39:monitorexit     
				return;
			//   23   40:return          
				Exception exception;
				exception;
			//   24   41:astore_2        
			//*  25   42:aload_1         
				throw exception;
			//   26   43:monitorexit     
			//   27   44:aload_2         
			//   28   45:athrow          
			}

			final io.radar.sdk.Radar.RadarCallback $callback;
			final ApiClient this$0;

			
			{
				this$0 = apiclient;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #33  <Field ApiClient this$0>
				$callback = radarcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #35  <Field io.radar.sdk.Radar$RadarCallback $callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #38  <Method void Object()>
			//    8   14:return          
			}
		}
));
	//    8   16:new             #6   <Class ApiClient$addCallback$timeoutRunnable$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #368 <Method void ApiClient$addCallback$timeoutRunnable$1(ApiClient, io.radar.sdk.Radar$RadarCallback)>
	//   13   25:checkcast       #370 <Class Runnable>
	//   14   28:astore_1        
		handler.postDelayed(((Runnable) (radarcallback)), 20000L);
	//   15   29:aload_0         
	//   16   30:getfield        #142 <Field Handler handler>
	//   17   33:aload_1         
	//   18   34:ldc2w           #371 <Long 20000L>
	//   19   37:invokevirtual   #376 <Method boolean Handler.postDelayed(Runnable, long)>
	//   20   40:pop             
	//   21   41:return          
	}

	public final void broadcastError$sdk_release(io.radar.sdk.Radar.RadarStatus radarstatus)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarstatus)), "status");
	//    0    0:aload_1         
	//    1    1:ldc2            #377 <String "status">
	//    2    4:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		broadcastIntent(RadarReceiver.Companion.createErrorIntent$sdk_release(radarstatus));
	//    3    7:aload_0         
	//    4    8:getstatic       #383 <Field io.radar.sdk.RadarReceiver$Companion RadarReceiver.Companion>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #389 <Method Intent io.radar.sdk.RadarReceiver$Companion.createErrorIntent$sdk_release(io.radar.sdk.Radar$RadarStatus)>
	//    7   15:invokespecial   #391 <Method void broadcastIntent(Intent)>
	//    8   18:return          
	}

	public final void broadcastSuccess$sdk_release(JSONObject jsonobject, Location location)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "response");
	//    0    0:aload_1         
	//    1    1:ldc2            #393 <String "response">
	//    2    4:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    3    7:aload_2         
	//    4    8:ldc2            #394 <String "location">
	//    5   11:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		broadcastIntent(RadarReceiver.Companion.createIntent$sdk_release(jsonobject, location));
	//    6   14:aload_0         
	//    7   15:getstatic       #383 <Field io.radar.sdk.RadarReceiver$Companion RadarReceiver.Companion>
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokevirtual   #398 <Method Intent io.radar.sdk.RadarReceiver$Companion.createIntent$sdk_release(JSONObject, Location)>
	//   11   23:invokespecial   #391 <Method void broadcastIntent(Intent)>
	//   12   26:return          
	}

	public final void deliverResult$sdk_release(io.radar.sdk.Radar.RadarStatus radarstatus, Location location, RadarEvent aradarevent[], RadarUser radaruser)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarstatus)), "status");
	//    0    0:aload_1         
	//    1    1:ldc2            #377 <String "status">
	//    2    4:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		handler.post((Runnable)new Runnable(this, radarstatus, location, aradarevent, radaruser) {

			public final void run()
			{
				ApiClient apiclient = ApiClient.this;
			//    0    0:aload_0         
			//    1    1:getfield        #39  <Field ApiClient this$0>
			//    2    4:astore_1        
				apiclient;
			//    3    5:aload_1         
				JVM INSTR monitorenter ;
			//    4    6:monitorenter    
				handler.removeCallbacksAndMessages(((Object) (null)));
			//    5    7:aload_0         
			//    6    8:getfield        #39  <Field ApiClient this$0>
			//    7   11:invokestatic    #55  <Method Handler ApiClient.access$getHandler$p(ApiClient)>
			//    8   14:aconst_null     
			//    9   15:invokevirtual   #61  <Method void Handler.removeCallbacksAndMessages(Object)>
				for(Iterator iterator = ((Iterable)callbacks).iterator(); iterator.hasNext(); ((io.radar.sdk.Radar.RadarCallback)iterator.next()).onComplete($status, $location, $events, $user));
			//   10   18:aload_0         
			//   11   19:getfield        #39  <Field ApiClient this$0>
			//   12   22:invokestatic    #65  <Method ArrayList ApiClient.access$getCallbacks$p(ApiClient)>
			//   13   25:checkcast       #67  <Class Iterable>
			//   14   28:invokeinterface #71  <Method Iterator Iterable.iterator()>
			//   15   33:astore_2        
			//   16   34:aload_2         
			//   17   35:invokeinterface #77  <Method boolean Iterator.hasNext()>
			//   18   40:ifeq            76
			//   19   43:aload_2         
			//   20   44:invokeinterface #81  <Method Object Iterator.next()>
			//   21   49:checkcast       #83  <Class io.radar.sdk.Radar$RadarCallback>
			//   22   52:aload_0         
			//   23   53:getfield        #41  <Field io.radar.sdk.Radar$RadarStatus $status>
			//   24   56:aload_0         
			//   25   57:getfield        #43  <Field Location $location>
			//   26   60:aload_0         
			//   27   61:getfield        #45  <Field RadarEvent[] $events>
			//   28   64:aload_0         
			//   29   65:getfield        #47  <Field RadarUser $user>
			//   30   68:invokeinterface #86  <Method void io.radar.sdk.Radar$RadarCallback.onComplete(io.radar.sdk.Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
			//*  31   73:goto            34
				callbacks.clear();
			//   32   76:aload_0         
			//   33   77:getfield        #39  <Field ApiClient this$0>
			//   34   80:invokestatic    #65  <Method ArrayList ApiClient.access$getCallbacks$p(ApiClient)>
			//   35   83:invokevirtual   #91  <Method void ArrayList.clear()>
				Unit unit = Unit.INSTANCE;
			//   36   86:getstatic       #97  <Field Unit Unit.INSTANCE>
			//   37   89:astore_2        
				apiclient;
			//   38   90:aload_1         
				JVM INSTR monitorexit ;
			//   39   91:monitorexit     
				return;
			//   40   92:return          
				Exception exception;
				exception;
			//   41   93:astore_2        
			//*  42   94:aload_1         
				throw exception;
			//   43   95:monitorexit     
			//   44   96:aload_2         
			//   45   97:athrow          
			}

			final RadarEvent $events[];
			final Location $location;
			final io.radar.sdk.Radar.RadarStatus $status;
			final RadarUser $user;
			final ApiClient this$0;

			
			{
				this$0 = apiclient;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #39  <Field ApiClient this$0>
				$status = radarstatus;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #41  <Field io.radar.sdk.Radar$RadarStatus $status>
				$location = location;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #43  <Field Location $location>
				$events = aradarevent;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #45  <Field RadarEvent[] $events>
				$user = radaruser;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #47  <Field RadarUser $user>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #50  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    3    7:aload_0         
	//    4    8:getfield        #142 <Field Handler handler>
	//    5   11:new             #8   <Class ApiClient$deliverResult$1>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:aload           4
	//   12   21:invokespecial   #402 <Method void ApiClient$deliverResult$1(ApiClient, io.radar.sdk.Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
	//   13   24:checkcast       #370 <Class Runnable>
	//   14   27:invokevirtual   #406 <Method boolean Handler.post(Runnable)>
	//   15   30:pop             
	//   16   31:return          
	}

	public final boolean getSendNextState$sdk_release()
	{
		return sendNextState;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field boolean sendNextState>
	//    2    4:ireturn         
	}

	public final void handleState$sdk_release(RadarState radarstate)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarstate)), "state");
	//    0    0:aload_1         
	//    1    1:ldc2            #410 <String "state">
	//    2    4:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(sendNextState || (radarstate instanceof Stopped) && ((Stopped)radarstate).getJustStopped())
	//*   3    7:aload_0         
	//*   4    8:getfield        #408 <Field boolean sendNextState>
	//*   5   11:ifne            31
	//*   6   14:aload_1         
	//*   7   15:instanceof      #412 <Class Stopped>
	//*   8   18:ifeq            48
	//*   9   21:aload_1         
	//*  10   22:checkcast       #412 <Class Stopped>
	//*  11   25:invokevirtual   #415 <Method boolean Stopped.getJustStopped()>
	//*  12   28:ifeq            48
		{
			LocationWorker.Companion.cancelWork$sdk_release();
	//   13   31:getstatic       #420 <Field LocationWorker$Companion LocationWorker.Companion>
	//   14   34:invokevirtual   #425 <Method void LocationWorker$Companion.cancelWork$sdk_release()>
			repository.setLastFailedStop$sdk_release((Location)null);
	//   15   37:aload_0         
	//   16   38:getfield        #122 <Field ApiClientRepository repository>
	//   17   41:aconst_null     
	//   18   42:checkcast       #254 <Class Location>
	//   19   45:invokevirtual   #429 <Method void ApiClientRepository.setLastFailedStop$sdk_release(Location)>
		}
		if(optionsRepository.getOfflineMode$sdk_release() == io.radar.sdk.Radar.RadarTrackingOffline.REPLAY_STOPPED && repository.getLastFailedStop$sdk_release() != null)
	//*  20   48:aload_0         
	//*  21   49:getfield        #120 <Field OptionsRepository optionsRepository>
	//*  22   52:invokevirtual   #435 <Method io.radar.sdk.Radar$RadarTrackingOffline OptionsRepository.getOfflineMode$sdk_release()>
	//*  23   55:getstatic       #441 <Field io.radar.sdk.Radar$RadarTrackingOffline io.radar.sdk.Radar$RadarTrackingOffline.REPLAY_STOPPED>
	//*  24   58:if_acmpne       79
	//*  25   61:aload_0         
	//*  26   62:getfield        #122 <Field ApiClientRepository repository>
	//*  27   65:invokevirtual   #445 <Method Location ApiClientRepository.getLastFailedStop$sdk_release()>
	//*  28   68:ifnull          79
		{
			retryFailedStop$sdk_release$default(this, ((Function0) (null)), 1, ((Object) (null)));
	//   29   71:aload_0         
	//   30   72:aconst_null     
	//   31   73:iconst_1        
	//   32   74:aconst_null     
	//   33   75:invokestatic    #447 <Method void retryFailedStop$sdk_release$default(ApiClient, Function0, int, Object)>
			return;
	//   34   78:return          
		}
		if(sendNextState)
	//*  35   79:aload_0         
	//*  36   80:getfield        #408 <Field boolean sendNextState>
	//*  37   83:ifeq            111
		{
			updateLocation$default(this, radarstate.getLocation(), radarstate instanceof Stopped, true, true, false, ((Function0) (null)), 48, ((Object) (null)));
	//   38   86:aload_0         
	//   39   87:aload_1         
	//   40   88:invokevirtual   #452 <Method Location RadarState.getLocation()>
	//   41   91:aload_1         
	//   42   92:instanceof      #412 <Class Stopped>
	//   43   95:iconst_1        
	//   44   96:iconst_1        
	//   45   97:iconst_0        
	//   46   98:aconst_null     
	//   47   99:bipush          48
	//   48  101:aconst_null     
	//   49  102:invokestatic    #454 <Method void updateLocation$default(ApiClient, Location, boolean, boolean, boolean, boolean, Function0, int, Object)>
			sendNextState = false;
	//   50  105:aload_0         
	//   51  106:iconst_0        
	//   52  107:putfield        #408 <Field boolean sendNextState>
			return;
	//   53  110:return          
		}
		if((radarstate instanceof Moving) || (radarstate instanceof Stopped) && ((Stopped)radarstate).getJustStopped())
	//*  54  111:aload_1         
	//*  55  112:instanceof      #456 <Class Moving>
	//*  56  115:ifne            135
	//*  57  118:aload_1         
	//*  58  119:instanceof      #412 <Class Stopped>
	//*  59  122:ifeq            232
	//*  60  125:aload_1         
	//*  61  126:checkcast       #412 <Class Stopped>
	//*  62  129:invokevirtual   #415 <Method boolean Stopped.getJustStopped()>
	//*  63  132:ifeq            232
		{
			boolean flag2 = radarstate instanceof Stopped;
	//   64  135:aload_1         
	//   65  136:instanceof      #412 <Class Stopped>
	//   66  139:istore          4
			boolean flag;
			if(optionsRepository.getSyncMode$sdk_release() == io.radar.sdk.Radar.RadarTrackingSync.POSSIBLE_STATE_CHANGES)
	//*  67  141:aload_0         
	//*  68  142:getfield        #120 <Field OptionsRepository optionsRepository>
	//*  69  145:invokevirtual   #460 <Method io.radar.sdk.Radar$RadarTrackingSync OptionsRepository.getSyncMode$sdk_release()>
	//*  70  148:getstatic       #466 <Field io.radar.sdk.Radar$RadarTrackingSync io.radar.sdk.Radar$RadarTrackingSync.POSSIBLE_STATE_CHANGES>
	//*  71  151:if_acmpne       182
			{
				if(!flag2 && !repository.getCanExit$sdk_release())
	//*  72  154:iload           4
	//*  73  156:ifne            177
	//*  74  159:aload_0         
	//*  75  160:getfield        #122 <Field ApiClientRepository repository>
	//*  76  163:invokevirtual   #469 <Method boolean ApiClientRepository.getCanExit$sdk_release()>
	//*  77  166:ifeq            172
	//*  78  169:goto            177
					flag = false;
	//   79  172:iconst_0        
	//   80  173:istore_2        
				else
	//*  81  174:goto            184
					flag = true;
	//   82  177:iconst_1        
	//   83  178:istore_2        
			} else
	//*  84  179:goto            184
			{
				flag = true;
	//   85  182:iconst_1        
	//   86  183:istore_2        
			}
			if(flag)
	//*  87  184:iload_2         
	//*  88  185:ifeq            232
			{
				radarstate = ((RadarState) (radarstate.getLocation()));
	//   89  188:aload_1         
	//   90  189:invokevirtual   #452 <Method Location RadarState.getLocation()>
	//   91  192:astore_1        
				boolean flag1;
				if(!flag2 && !repository.getAtPlace$sdk_release())
	//*  92  193:iload           4
	//*  93  195:ifne            216
	//*  94  198:aload_0         
	//*  95  199:getfield        #122 <Field ApiClientRepository repository>
	//*  96  202:invokevirtual   #472 <Method boolean ApiClientRepository.getAtPlace$sdk_release()>
	//*  97  205:ifeq            211
	//*  98  208:goto            216
					flag1 = false;
	//   99  211:iconst_0        
	//  100  212:istore_3        
				else
	//* 101  213:goto            218
					flag1 = true;
	//  102  216:iconst_1        
	//  103  217:istore_3        
				updateLocation$default(this, ((Location) (radarstate)), flag2, false, flag1, false, ((Function0) (null)), 48, ((Object) (null)));
	//  104  218:aload_0         
	//  105  219:aload_1         
	//  106  220:iload           4
	//  107  222:iconst_0        
	//  108  223:iload_3         
	//  109  224:iconst_0        
	//  110  225:aconst_null     
	//  111  226:bipush          48
	//  112  228:aconst_null     
	//  113  229:invokestatic    #454 <Method void updateLocation$default(ApiClient, Location, boolean, boolean, boolean, boolean, Function0, int, Object)>
			}
		}
	//  114  232:return          
	}

	public final void retryFailedStop$sdk_release(Function0 function0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function0)), "completionCallback");
	//    0    0:aload_1         
	//    1    1:ldc2            #473 <String "completionCallback">
	//    2    4:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Location location = repository.getLastFailedStop$sdk_release();
	//    3    7:aload_0         
	//    4    8:getfield        #122 <Field ApiClientRepository repository>
	//    5   11:invokevirtual   #445 <Method Location ApiClientRepository.getLastFailedStop$sdk_release()>
	//    6   14:astore_2        
		if(location != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          41
		{
			RadarLogger.d$default(RadarLogger.INSTANCE, "Retrying last failed stop", ((Throwable) (null)), 2, ((Object) (null)));
	//    9   19:getstatic       #310 <Field RadarLogger RadarLogger.INSTANCE>
	//   10   22:ldc2            #475 <String "Retrying last failed stop">
	//   11   25:aconst_null     
	//   12   26:iconst_2        
	//   13   27:aconst_null     
	//   14   28:invokestatic    #316 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
			updateLocation(location, true, false, false, true, function0);
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:iconst_1        
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:iconst_1        
	//   21   37:aload_1         
	//   22   38:invokespecial   #352 <Method void updateLocation(Location, boolean, boolean, boolean, boolean, Function0)>
		}
	//   23   41:return          
	}

	public final void setSendNextState$sdk_release(boolean flag)
	{
		sendNextState = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #408 <Field boolean sendNextState>
	//    3    5:return          
	}

	public final void verifyEvent$sdk_release(String s, io.radar.sdk.model.RadarEvent.RadarEventVerification radareventverification, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "eventId");
	//    0    0:aload_1         
	//    1    1:ldc2            #477 <String "eventId">
	//    2    4:invokestatic    #107 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		String s2 = identityRepository.getPublishableKey$sdk_release();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field IdentityRepository identityRepository>
	//    5   11:invokevirtual   #281 <Method String IdentityRepository.getPublishableKey$sdk_release()>
	//    6   14:astore          4
		if(s2 == null)
	//*   7   16:aload           4
	//*   8   18:ifnonnull       39
		{
			broadcastError$sdk_release(io.radar.sdk.Radar.RadarStatus.ERROR_PUBLISHABLE_KEY);
	//    9   21:aload_0         
	//   10   22:getstatic       #286 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_PUBLISHABLE_KEY>
	//   11   25:invokevirtual   #289 <Method void broadcastError$sdk_release(io.radar.sdk.Radar$RadarStatus)>
			deliverResult$sdk_release(io.radar.sdk.Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)));
	//   12   28:aload_0         
	//   13   29:getstatic       #286 <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_PUBLISHABLE_KEY>
	//   14   32:aconst_null     
	//   15   33:aconst_null     
	//   16   34:aconst_null     
	//   17   35:invokevirtual   #260 <Method void deliverResult$sdk_release(io.radar.sdk.Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
			return;
	//   18   38:return          
		} else
		{
			apiService.verifyEvent(s2, s, radareventverification, s1);
	//   19   39:aload_0         
	//   20   40:getfield        #124 <Field ApiService apiService>
	//   21   43:aload           4
	//   22   45:aload_1         
	//   23   46:aload_2         
	//   24   47:aload_3         
	//   25   48:invokevirtual   #480 <Method void ApiService.verifyEvent(String, String, io.radar.sdk.model.RadarEvent$RadarEventVerification, String)>
			return;
	//   26   51:return          
		}
	}

	private final ApiService apiService;
	private final ArrayList callbacks = new ArrayList();
	private final Context context;
	private final Handler handler = new Handler(Looper.getMainLooper());
	private final IdentityRepository identityRepository;
	private final OptionsRepository optionsRepository;
	private final ApiClientRepository repository;
	private boolean sendNextState;


/*
	public static final ApiService access$getApiService$p(ApiClient apiclient)
	{
		return apiclient.apiService;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field ApiService apiService>
	//    2    4:areturn         
	}

*/


/*
	public static final ArrayList access$getCallbacks$p(ApiClient apiclient)
	{
		return apiclient.callbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field ArrayList callbacks>
	//    2    4:areturn         
	}

*/


/*
	public static final Handler access$getHandler$p(ApiClient apiclient)
	{
		return apiclient.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field Handler handler>
	//    2    4:areturn         
	}

*/


/*
	public static final OptionsRepository access$getOptionsRepository$p(ApiClient apiclient)
	{
		return apiclient.optionsRepository;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field OptionsRepository optionsRepository>
	//    2    4:areturn         
	}

*/


/*
	public static final ApiClientRepository access$getRepository$p(ApiClient apiclient)
	{
		return apiclient.repository;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ApiClientRepository repository>
	//    2    4:areturn         
	}

*/
}
