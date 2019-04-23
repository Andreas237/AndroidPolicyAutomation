// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.location.Location;
import io.radar.sdk.internal.repository.OptionsRepository;
import io.radar.sdk.model.*;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

// Referenced classes of package io.radar.sdk.api:
//			ApiClient, RadarResponse, Success, LocationWorker, 
//			ApiClientRepository, Error

static final class ApiClient$updateLocation$callback$1 extends Lambda
	implements Function1
{

	public volatile Object invoke(Object obj)
	{
		invoke((RadarResponse)obj);
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
				boolean flag;
				boolean flag1;
				boolean flag2;
				boolean flag4;
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
					ApiClient.access$getRepository$p(ApiClient.this).setLastFailedStop$sdk_release((Location)null);
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
					flag4 = true;
	//   23   52:iconst_1        
	//   24   53:istore          6
					if(radarresponse != null)
	//*  25   55:aload_1         
	//*  26   56:ifnull          65
						flag2 = true;
	//   27   59:iconst_1        
	//   28   60:istore          4
					else
	//*  29   62:goto            68
						flag2 = false;
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
						flag = true;
	//   44   91:iconst_1        
	//   45   92:istore_2        
					else
	//*  46   93:goto            98
						flag = false;
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
							flag1 = true;
	//   65  131:iconst_1        
	//   66  132:istore_3        
							break label2;
	//   67  133:goto            138
						}
					}
					flag1 = false;
	//   68  136:iconst_0        
	//   69  137:istore_3        
				}
				ApiClient.access$getRepository$p(ApiClient.this).setAtPlace$sdk_release(flag2);
	//   70  138:aload_0         
	//   71  139:getfield        #42  <Field ApiClient this$0>
	//   72  142:invokestatic    #94  <Method ApiClientRepository ApiClient.access$getRepository$p(ApiClient)>
	//   73  145:iload           4
	//   74  147:invokevirtual   #141 <Method void ApiClientRepository.setAtPlace$sdk_release(boolean)>
				radarresponse = ((RadarResponse) (ApiClient.access$getRepository$p(ApiClient.this)));
	//   75  150:aload_0         
	//   76  151:getfield        #42  <Field ApiClient this$0>
	//   77  154:invokestatic    #94  <Method ApiClientRepository ApiClient.access$getRepository$p(ApiClient)>
	//   78  157:astore_1        
				boolean flag3 = flag4;
	//   79  158:iload           6
	//   80  160:istore          5
				if(!flag2)
	//*  81  162:iload           4
	//*  82  164:ifne            191
				{
					flag3 = flag4;
	//   83  167:iload           6
	//   84  169:istore          5
					if(!(flag ^ true))
	//*  85  171:iload_2         
	//*  86  172:iconst_1        
	//*  87  173:ixor            
	//*  88  174:ifne            191
						if(flag1)
	//*  89  177:iload_3         
	//*  90  178:ifeq            188
							flag3 = flag4;
	//   91  181:iload           6
	//   92  183:istore          5
						else
	//*  93  185:goto            191
							flag3 = false;
	//   94  188:iconst_0        
	//   95  189:istore          5
				}
				((ApiClientRepository) (radarresponse)).setCanExit$sdk_release(flag3);
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
	//  105  211:invokevirtual   #158 <Method io.radar.sdk.model.RadarEvent[] Success.getEvents()>
	//  106  214:aload           7
	//  107  216:invokevirtual   #106 <Method RadarUser Success.getUser()>
	//  108  219:invokevirtual   #162 <Method void ApiClient.deliverResult$sdk_release(io.radar.sdk.Radar$RadarStatus, Location, io.radar.sdk.model.RadarEvent[], RadarUser)>
				broadcastSuccess$sdk_release(success.getPayload(), success.getLocation());
	//  109  222:aload_0         
	//  110  223:getfield        #42  <Field ApiClient this$0>
	//  111  226:aload           7
	//  112  228:invokevirtual   #166 <Method org.json.JSONObject Success.getPayload()>
	//  113  231:aload           7
	//  114  233:invokevirtual   #154 <Method Location Success.getLocation()>
	//  115  236:invokevirtual   #170 <Method void ApiClient.broadcastSuccess$sdk_release(org.json.JSONObject, Location)>
				break label0;
	//  116  239:goto            386
			}
			if(radarresponse instanceof Error)
	//* 117  242:aload_1         
	//* 118  243:instanceof      #172 <Class Error>
	//* 119  246:ifeq            386
			{
				if(ApiClient.access$getOptionsRepository$p(ApiClient.this).getOfflineMode$sdk_release() == io.radar.sdk.Radar.RadarTrackingOffline.REPLAY_STOPPED && $stopped && !$foreground && ((Error)radarresponse).getStatus() == io.radar.sdk.Radar.RadarStatus.ERROR_NETWORK)
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
					ApiClient.access$getRepository$p(ApiClient.this).setLastFailedStop$sdk_release($location);
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
					ApiClient.access$getRepository$p(ApiClient.this).setLastFailedStop$sdk_release((Location)null);
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
				apiclient.deliverResult$sdk_release(((Error) (radarresponse)).getStatus(), ((Location) (null)), ((io.radar.sdk.model.RadarEvent []) (null)), ((RadarUser) (null)));
	//  167  363:aload           7
	//  168  365:aload_1         
	//  169  366:invokevirtual   #192 <Method io.radar.sdk.Radar$RadarStatus Error.getStatus()>
	//  170  369:aconst_null     
	//  171  370:aconst_null     
	//  172  371:aconst_null     
	//  173  372:invokevirtual   #162 <Method void ApiClient.deliverResult$sdk_release(io.radar.sdk.Radar$RadarStatus, Location, io.radar.sdk.model.RadarEvent[], RadarUser)>
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

	ApiClient$updateLocation$callback$1(ApiClient apiclient, boolean flag, boolean flag1, Location location, boolean flag2, Function0 function0)
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
