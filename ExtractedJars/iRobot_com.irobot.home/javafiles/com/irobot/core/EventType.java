// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class EventType extends Enum
{

	private EventType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #622 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static EventType valueOf(String s)
	{
		return (EventType)Enum.valueOf(com/irobot/core/EventType, s);
	//    0    0:ldc1            #2   <Class EventType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #628 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EventType>
	//    4    9:areturn         
	}

	public static EventType[] values()
	{
		return (EventType[])((EventType []) ($VALUES)).clone();
	//    0    0:getstatic       #620 <Field EventType[] $VALUES>
	//    1    3:invokevirtual   #635 <Method Object _5B_Lcom.irobot.core.EventType_3B_.clone()>
	//    2    6:checkcast       #631 <Class EventType[]>
	//    3    9:areturn         
	}

	private static final EventType $VALUES[];
	public static final EventType AccountAddRobotEvent;
	public static final EventType AccountConsentDateUpdateFailedEvent;
	public static final EventType AccountConsentDateUpdatedEvent;
	public static final EventType AccountErrorEvent;
	public static final EventType AccountFeatureUpdateFailedEvent;
	public static final EventType AccountFeatureUpdatedEvent;
	public static final EventType AccountFlagUpdateFailedEvent;
	public static final EventType AccountFlagUpdatedEvent;
	public static final EventType AccountInfoUpdatedEvent;
	public static final EventType AccountLoggedInEvent;
	public static final EventType AccountLoggedOutEvent;
	public static final EventType AccountLogoutFailedEvent;
	public static final EventType AlexaAuthTokenEvent;
	public static final EventType AlexaAuthTokenFailureEvent;
	public static final EventType AppInfoEvent;
	public static final EventType AssetAccumulatedHistoryEvent;
	public static final EventType AssetAddedEvent;
	public static final EventType AssetAudioVersionEvent;
	public static final EventType AssetBatteryTypeEvent;
	public static final EventType AssetBehaviorLogEvent;
	public static final EventType AssetCapabilitiesChangedEvent;
	public static final EventType AssetCapabilitiesEvent;
	public static final EventType AssetCarpetBoostEvent;
	public static final EventType AssetCarpetBoostModesAvailableEvent;
	public static final EventType AssetCloudConfigEvent;
	public static final EventType AssetCommandTimeoutEvent;
	public static final EventType AssetDiscoveryDataEvent;
	public static final EventType AssetEdgeCleanEvent;
	public static final EventType AssetEvent;
	public static final EventType AssetGenericEvent;
	public static final EventType AssetHistoryEventTypesEvent;
	public static final EventType AssetLocationCountryEvent;
	public static final EventType AssetLocationPostalCodeEvent;
	public static final EventType AssetLogUploadEvent;
	public static final EventType AssetMacAddressEvent;
	public static final EventType AssetMissingEvent;
	public static final EventType AssetMultiPassEvent;
	public static final EventType AssetMultiPassModesAvailableEvent;
	public static final EventType AssetNetworkSettingsEvent;
	public static final EventType AssetNetworkStatusEvent;
	public static final EventType AssetOtaDeploymentIdEvent;
	public static final EventType AssetOtaUpdateStatusEvent;
	public static final EventType AssetPauseOnBinFullEvent;
	public static final EventType AssetPreventativeMaintenanceStatusEvent;
	public static final EventType AssetRegisteredEvent;
	public static final EventType AssetRegistrationDateEvent;
	public static final EventType AssetSerialNumberEvent;
	public static final EventType AssetServiceDeploymentIdEvent;
	public static final EventType AssetSkuEvent;
	public static final EventType AssetSkuFailureEvent;
	public static final EventType AssetSoftwareLastUpdatedEvent;
	public static final EventType AssetSoftwareVersionEvent;
	public static final EventType AssetTimeEvent;
	public static final EventType AssetTimeoutEvent;
	public static final EventType AssetTotalAreaCoveredEvent;
	public static final EventType AssetTotalEvacuationCountEvent;
	public static final EventType AssetTotalRuntimeEvent;
	public static final EventType AssetUmiVersionEvent;
	public static final EventType AssetUpdateAvailabilityEvent;
	public static final EventType AssetUpdateProgressEvent;
	public static final EventType AssetVolumeEvent;
	public static final EventType AssetWetnessLevelEvent;
	public static final EventType AssetWifiLogEvent;
	public static final EventType AssetWifiLogFinishedEvent;
	public static final EventType AssetWifiSignalStrengthEvent;
	public static final EventType AvailableSettingsEvent;
	public static final EventType AwsCloudEnvironmentEvent;
	public static final EventType BadAssetPasswordEvent;
	public static final EventType BlackBoxAssetEvacuationCountEvent;
	public static final EventType BraavaMissionStatusEvent;
	public static final EventType BugReportEvent;
	public static final EventType CertificateErrorEvent;
	public static final EventType CheckSsidReportEvent;
	public static final EventType ConnectFailureEvent;
	public static final EventType ConnectionStateEvent;
	public static final EventType CurrentConnectionStateEvent;
	public static final EventType DataDeserializationErrorEvent;
	public static final EventType DiscoveredAssetsUpdatedEvent;
	public static final EventType DiscoveryStatusEvent;
	public static final EventType DockEvacuationHistoryEvent;
	public static final EventType DuplicateAssetStatusChangedEvent;
	public static final EventType EchoEvent;
	public static final EventType Event;
	public static final EventType ExpeditedOtaStatusEvent;
	public static final EventType FloorListEvent;
	public static final EventType ForcefulDisconnectEvent;
	public static final EventType GenericEvent;
	public static final EventType LatestAppVersionEvent;
	public static final EventType LocalOtaStatusEvent;
	public static final EventType MapUploadAllowedEvent;
	public static final EventType MissionMapEvent;
	public static final EventType MissionRuntimeEChartEvent;
	public static final EventType MissionsAreaCleanedEChartEvent;
	public static final EventType MqttConnectionAcknowledgementEvent;
	public static final EventType NetworkAddressEvent;
	public static final EventType NetworkDiagnosticEvent;
	public static final EventType NetworkErrorEvent;
	public static final EventType NotificationCenterEvent;
	public static final EventType NtpTimeEvent;
	public static final EventType OnDemandOTAAvailabilityEvent;
	public static final EventType PMapLearningAllowedEvent;
	public static final EventType PasswordRequestErrorEvent;
	public static final EventType PersistentMapEvent;
	public static final EventType PersistentMapInfoTableEvent;
	public static final EventType PersistentMapSettingsEvent;
	public static final EventType PersistentMapVersionInfoEvent;
	public static final EventType PushNotificationGetSettingsFailedEvent;
	public static final EventType PushNotificationSettingFailedEvent;
	public static final EventType PushNotificationSettingsEvent;
	public static final EventType PushRegistrationStatusEvent;
	public static final EventType RawRobotNameEvent;
	public static final EventType RemoveRobotEvent;
	public static final EventType RequestOtaStatusEvent;
	public static final EventType ResetAssetPartEvent;
	public static final EventType ResetRobotEvent;
	public static final EventType ResolvedMissionStatusEvent;
	public static final EventType RobotAttachedPadWetnessEvent;
	public static final EventType RobotAudioPlayingEvent;
	public static final EventType RobotBatteryLevelEvent;
	public static final EventType RobotBinFullEvent;
	public static final EventType RobotBinRemovalEvent;
	public static final EventType RobotDockEvent;
	public static final EventType RobotErrorEvent;
	public static final EventType RobotLanguageEvent;
	public static final EventType RobotLanguagesAvailableEvent;
	public static final EventType RobotMissionAreaCoveredEvent;
	public static final EventType RobotMissionHistoryEvent;
	public static final EventType RobotMissionHistoryScreenshotEvent;
	public static final EventType RobotMissionStatusEvent;
	public static final EventType RobotMultiScheduleEvent;
	public static final EventType RobotNameEvent;
	public static final EventType RobotPadCategoryEvent;
	public static final EventType RobotPadWetnessEvent;
	public static final EventType RobotPasswordEvent;
	public static final EventType RobotPoseEvent;
	public static final EventType RobotPreferencesEvent;
	public static final EventType RobotRankOverlapEvent;
	public static final EventType RobotReadinessEvent;
	public static final EventType RobotRoomConfinementEvent;
	public static final EventType RobotScheduleEvent;
	public static final EventType RobotTankLevelEvent;
	public static final EventType RobotTimeZoneEvent;
	public static final EventType ScheduleTypeSupportedEvent;
	public static final EventType SoftApStatusEvent;
	public static final EventType SubProtocolConnectionStateEvent;
	public static final EventType TimeoutEvent;
	public static final EventType UmfDataMissingEvent;
	public static final EventType UmfParsingErrorEvent;
	public static final EventType UnauthenticatedConnectionStateEvent;
	public static final EventType WifiConfigEvent;
	public static final EventType WifiProvisioningErrorEvent;

	static 
	{
		AssetPreventativeMaintenanceStatusEvent = new EventType("AssetPreventativeMaintenanceStatusEvent", 0);
	//    0    0:new             #2   <Class EventType>
	//    1    3:dup             
	//    2    4:ldc1            #162 <String "AssetPreventativeMaintenanceStatusEvent">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #166 <Method void EventType(String, int)>
	//    5   10:putstatic       #168 <Field EventType AssetPreventativeMaintenanceStatusEvent>
		AssetTotalAreaCoveredEvent = new EventType("AssetTotalAreaCoveredEvent", 1);
	//    6   13:new             #2   <Class EventType>
	//    7   16:dup             
	//    8   17:ldc1            #169 <String "AssetTotalAreaCoveredEvent">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #166 <Method void EventType(String, int)>
	//   11   23:putstatic       #171 <Field EventType AssetTotalAreaCoveredEvent>
		AssetTotalRuntimeEvent = new EventType("AssetTotalRuntimeEvent", 2);
	//   12   26:new             #2   <Class EventType>
	//   13   29:dup             
	//   14   30:ldc1            #172 <String "AssetTotalRuntimeEvent">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #166 <Method void EventType(String, int)>
	//   17   36:putstatic       #174 <Field EventType AssetTotalRuntimeEvent>
		Event = new EventType("Event", 3);
	//   18   39:new             #2   <Class EventType>
	//   19   42:dup             
	//   20   43:ldc1            #175 <String "Event">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #166 <Method void EventType(String, int)>
	//   23   49:putstatic       #177 <Field EventType Event>
		AccountAddRobotEvent = new EventType("AccountAddRobotEvent", 4);
	//   24   52:new             #2   <Class EventType>
	//   25   55:dup             
	//   26   56:ldc1            #178 <String "AccountAddRobotEvent">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #166 <Method void EventType(String, int)>
	//   29   62:putstatic       #180 <Field EventType AccountAddRobotEvent>
		AccountErrorEvent = new EventType("AccountErrorEvent", 5);
	//   30   65:new             #2   <Class EventType>
	//   31   68:dup             
	//   32   69:ldc1            #181 <String "AccountErrorEvent">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #166 <Method void EventType(String, int)>
	//   35   75:putstatic       #183 <Field EventType AccountErrorEvent>
		AccountInfoUpdatedEvent = new EventType("AccountInfoUpdatedEvent", 6);
	//   36   78:new             #2   <Class EventType>
	//   37   81:dup             
	//   38   82:ldc1            #184 <String "AccountInfoUpdatedEvent">
	//   39   84:bipush          6
	//   40   86:invokespecial   #166 <Method void EventType(String, int)>
	//   41   89:putstatic       #186 <Field EventType AccountInfoUpdatedEvent>
		AccountFeatureUpdatedEvent = new EventType("AccountFeatureUpdatedEvent", 7);
	//   42   92:new             #2   <Class EventType>
	//   43   95:dup             
	//   44   96:ldc1            #187 <String "AccountFeatureUpdatedEvent">
	//   45   98:bipush          7
	//   46  100:invokespecial   #166 <Method void EventType(String, int)>
	//   47  103:putstatic       #189 <Field EventType AccountFeatureUpdatedEvent>
		AccountFeatureUpdateFailedEvent = new EventType("AccountFeatureUpdateFailedEvent", 8);
	//   48  106:new             #2   <Class EventType>
	//   49  109:dup             
	//   50  110:ldc1            #190 <String "AccountFeatureUpdateFailedEvent">
	//   51  112:bipush          8
	//   52  114:invokespecial   #166 <Method void EventType(String, int)>
	//   53  117:putstatic       #192 <Field EventType AccountFeatureUpdateFailedEvent>
		AccountFlagUpdatedEvent = new EventType("AccountFlagUpdatedEvent", 9);
	//   54  120:new             #2   <Class EventType>
	//   55  123:dup             
	//   56  124:ldc1            #193 <String "AccountFlagUpdatedEvent">
	//   57  126:bipush          9
	//   58  128:invokespecial   #166 <Method void EventType(String, int)>
	//   59  131:putstatic       #195 <Field EventType AccountFlagUpdatedEvent>
		AccountFlagUpdateFailedEvent = new EventType("AccountFlagUpdateFailedEvent", 10);
	//   60  134:new             #2   <Class EventType>
	//   61  137:dup             
	//   62  138:ldc1            #196 <String "AccountFlagUpdateFailedEvent">
	//   63  140:bipush          10
	//   64  142:invokespecial   #166 <Method void EventType(String, int)>
	//   65  145:putstatic       #198 <Field EventType AccountFlagUpdateFailedEvent>
		AccountLoggedInEvent = new EventType("AccountLoggedInEvent", 11);
	//   66  148:new             #2   <Class EventType>
	//   67  151:dup             
	//   68  152:ldc1            #199 <String "AccountLoggedInEvent">
	//   69  154:bipush          11
	//   70  156:invokespecial   #166 <Method void EventType(String, int)>
	//   71  159:putstatic       #201 <Field EventType AccountLoggedInEvent>
		AccountLoggedOutEvent = new EventType("AccountLoggedOutEvent", 12);
	//   72  162:new             #2   <Class EventType>
	//   73  165:dup             
	//   74  166:ldc1            #202 <String "AccountLoggedOutEvent">
	//   75  168:bipush          12
	//   76  170:invokespecial   #166 <Method void EventType(String, int)>
	//   77  173:putstatic       #204 <Field EventType AccountLoggedOutEvent>
		AccountLogoutFailedEvent = new EventType("AccountLogoutFailedEvent", 13);
	//   78  176:new             #2   <Class EventType>
	//   79  179:dup             
	//   80  180:ldc1            #205 <String "AccountLogoutFailedEvent">
	//   81  182:bipush          13
	//   82  184:invokespecial   #166 <Method void EventType(String, int)>
	//   83  187:putstatic       #207 <Field EventType AccountLogoutFailedEvent>
		AlexaAuthTokenEvent = new EventType("AlexaAuthTokenEvent", 14);
	//   84  190:new             #2   <Class EventType>
	//   85  193:dup             
	//   86  194:ldc1            #208 <String "AlexaAuthTokenEvent">
	//   87  196:bipush          14
	//   88  198:invokespecial   #166 <Method void EventType(String, int)>
	//   89  201:putstatic       #210 <Field EventType AlexaAuthTokenEvent>
		AlexaAuthTokenFailureEvent = new EventType("AlexaAuthTokenFailureEvent", 15);
	//   90  204:new             #2   <Class EventType>
	//   91  207:dup             
	//   92  208:ldc1            #211 <String "AlexaAuthTokenFailureEvent">
	//   93  210:bipush          15
	//   94  212:invokespecial   #166 <Method void EventType(String, int)>
	//   95  215:putstatic       #213 <Field EventType AlexaAuthTokenFailureEvent>
		AppInfoEvent = new EventType("AppInfoEvent", 16);
	//   96  218:new             #2   <Class EventType>
	//   97  221:dup             
	//   98  222:ldc1            #214 <String "AppInfoEvent">
	//   99  224:bipush          16
	//  100  226:invokespecial   #166 <Method void EventType(String, int)>
	//  101  229:putstatic       #216 <Field EventType AppInfoEvent>
		AssetAccumulatedHistoryEvent = new EventType("AssetAccumulatedHistoryEvent", 17);
	//  102  232:new             #2   <Class EventType>
	//  103  235:dup             
	//  104  236:ldc1            #217 <String "AssetAccumulatedHistoryEvent">
	//  105  238:bipush          17
	//  106  240:invokespecial   #166 <Method void EventType(String, int)>
	//  107  243:putstatic       #219 <Field EventType AssetAccumulatedHistoryEvent>
		AssetAddedEvent = new EventType("AssetAddedEvent", 18);
	//  108  246:new             #2   <Class EventType>
	//  109  249:dup             
	//  110  250:ldc1            #220 <String "AssetAddedEvent">
	//  111  252:bipush          18
	//  112  254:invokespecial   #166 <Method void EventType(String, int)>
	//  113  257:putstatic       #222 <Field EventType AssetAddedEvent>
		AssetAudioVersionEvent = new EventType("AssetAudioVersionEvent", 19);
	//  114  260:new             #2   <Class EventType>
	//  115  263:dup             
	//  116  264:ldc1            #223 <String "AssetAudioVersionEvent">
	//  117  266:bipush          19
	//  118  268:invokespecial   #166 <Method void EventType(String, int)>
	//  119  271:putstatic       #225 <Field EventType AssetAudioVersionEvent>
		AssetBatteryTypeEvent = new EventType("AssetBatteryTypeEvent", 20);
	//  120  274:new             #2   <Class EventType>
	//  121  277:dup             
	//  122  278:ldc1            #226 <String "AssetBatteryTypeEvent">
	//  123  280:bipush          20
	//  124  282:invokespecial   #166 <Method void EventType(String, int)>
	//  125  285:putstatic       #228 <Field EventType AssetBatteryTypeEvent>
		AssetBehaviorLogEvent = new EventType("AssetBehaviorLogEvent", 21);
	//  126  288:new             #2   <Class EventType>
	//  127  291:dup             
	//  128  292:ldc1            #229 <String "AssetBehaviorLogEvent">
	//  129  294:bipush          21
	//  130  296:invokespecial   #166 <Method void EventType(String, int)>
	//  131  299:putstatic       #231 <Field EventType AssetBehaviorLogEvent>
		AssetCapabilitiesEvent = new EventType("AssetCapabilitiesEvent", 22);
	//  132  302:new             #2   <Class EventType>
	//  133  305:dup             
	//  134  306:ldc1            #232 <String "AssetCapabilitiesEvent">
	//  135  308:bipush          22
	//  136  310:invokespecial   #166 <Method void EventType(String, int)>
	//  137  313:putstatic       #234 <Field EventType AssetCapabilitiesEvent>
		AssetCapabilitiesChangedEvent = new EventType("AssetCapabilitiesChangedEvent", 23);
	//  138  316:new             #2   <Class EventType>
	//  139  319:dup             
	//  140  320:ldc1            #235 <String "AssetCapabilitiesChangedEvent">
	//  141  322:bipush          23
	//  142  324:invokespecial   #166 <Method void EventType(String, int)>
	//  143  327:putstatic       #237 <Field EventType AssetCapabilitiesChangedEvent>
		AssetCarpetBoostEvent = new EventType("AssetCarpetBoostEvent", 24);
	//  144  330:new             #2   <Class EventType>
	//  145  333:dup             
	//  146  334:ldc1            #238 <String "AssetCarpetBoostEvent">
	//  147  336:bipush          24
	//  148  338:invokespecial   #166 <Method void EventType(String, int)>
	//  149  341:putstatic       #240 <Field EventType AssetCarpetBoostEvent>
		AssetCarpetBoostModesAvailableEvent = new EventType("AssetCarpetBoostModesAvailableEvent", 25);
	//  150  344:new             #2   <Class EventType>
	//  151  347:dup             
	//  152  348:ldc1            #241 <String "AssetCarpetBoostModesAvailableEvent">
	//  153  350:bipush          25
	//  154  352:invokespecial   #166 <Method void EventType(String, int)>
	//  155  355:putstatic       #243 <Field EventType AssetCarpetBoostModesAvailableEvent>
		AssetCloudConfigEvent = new EventType("AssetCloudConfigEvent", 26);
	//  156  358:new             #2   <Class EventType>
	//  157  361:dup             
	//  158  362:ldc1            #244 <String "AssetCloudConfigEvent">
	//  159  364:bipush          26
	//  160  366:invokespecial   #166 <Method void EventType(String, int)>
	//  161  369:putstatic       #246 <Field EventType AssetCloudConfigEvent>
		AssetCommandTimeoutEvent = new EventType("AssetCommandTimeoutEvent", 27);
	//  162  372:new             #2   <Class EventType>
	//  163  375:dup             
	//  164  376:ldc1            #247 <String "AssetCommandTimeoutEvent">
	//  165  378:bipush          27
	//  166  380:invokespecial   #166 <Method void EventType(String, int)>
	//  167  383:putstatic       #249 <Field EventType AssetCommandTimeoutEvent>
		AssetDiscoveryDataEvent = new EventType("AssetDiscoveryDataEvent", 28);
	//  168  386:new             #2   <Class EventType>
	//  169  389:dup             
	//  170  390:ldc1            #250 <String "AssetDiscoveryDataEvent">
	//  171  392:bipush          28
	//  172  394:invokespecial   #166 <Method void EventType(String, int)>
	//  173  397:putstatic       #252 <Field EventType AssetDiscoveryDataEvent>
		AssetEdgeCleanEvent = new EventType("AssetEdgeCleanEvent", 29);
	//  174  400:new             #2   <Class EventType>
	//  175  403:dup             
	//  176  404:ldc1            #253 <String "AssetEdgeCleanEvent">
	//  177  406:bipush          29
	//  178  408:invokespecial   #166 <Method void EventType(String, int)>
	//  179  411:putstatic       #255 <Field EventType AssetEdgeCleanEvent>
		AssetEvent = new EventType("AssetEvent", 30);
	//  180  414:new             #2   <Class EventType>
	//  181  417:dup             
	//  182  418:ldc2            #256 <String "AssetEvent">
	//  183  421:bipush          30
	//  184  423:invokespecial   #166 <Method void EventType(String, int)>
	//  185  426:putstatic       #258 <Field EventType AssetEvent>
		AssetGenericEvent = new EventType("AssetGenericEvent", 31);
	//  186  429:new             #2   <Class EventType>
	//  187  432:dup             
	//  188  433:ldc2            #259 <String "AssetGenericEvent">
	//  189  436:bipush          31
	//  190  438:invokespecial   #166 <Method void EventType(String, int)>
	//  191  441:putstatic       #261 <Field EventType AssetGenericEvent>
		AssetHistoryEventTypesEvent = new EventType("AssetHistoryEventTypesEvent", 32);
	//  192  444:new             #2   <Class EventType>
	//  193  447:dup             
	//  194  448:ldc2            #262 <String "AssetHistoryEventTypesEvent">
	//  195  451:bipush          32
	//  196  453:invokespecial   #166 <Method void EventType(String, int)>
	//  197  456:putstatic       #264 <Field EventType AssetHistoryEventTypesEvent>
		AssetLocationCountryEvent = new EventType("AssetLocationCountryEvent", 33);
	//  198  459:new             #2   <Class EventType>
	//  199  462:dup             
	//  200  463:ldc2            #265 <String "AssetLocationCountryEvent">
	//  201  466:bipush          33
	//  202  468:invokespecial   #166 <Method void EventType(String, int)>
	//  203  471:putstatic       #267 <Field EventType AssetLocationCountryEvent>
		AssetLocationPostalCodeEvent = new EventType("AssetLocationPostalCodeEvent", 34);
	//  204  474:new             #2   <Class EventType>
	//  205  477:dup             
	//  206  478:ldc2            #268 <String "AssetLocationPostalCodeEvent">
	//  207  481:bipush          34
	//  208  483:invokespecial   #166 <Method void EventType(String, int)>
	//  209  486:putstatic       #270 <Field EventType AssetLocationPostalCodeEvent>
		AssetLogUploadEvent = new EventType("AssetLogUploadEvent", 35);
	//  210  489:new             #2   <Class EventType>
	//  211  492:dup             
	//  212  493:ldc2            #271 <String "AssetLogUploadEvent">
	//  213  496:bipush          35
	//  214  498:invokespecial   #166 <Method void EventType(String, int)>
	//  215  501:putstatic       #273 <Field EventType AssetLogUploadEvent>
		AssetMacAddressEvent = new EventType("AssetMacAddressEvent", 36);
	//  216  504:new             #2   <Class EventType>
	//  217  507:dup             
	//  218  508:ldc2            #274 <String "AssetMacAddressEvent">
	//  219  511:bipush          36
	//  220  513:invokespecial   #166 <Method void EventType(String, int)>
	//  221  516:putstatic       #276 <Field EventType AssetMacAddressEvent>
		AssetMissingEvent = new EventType("AssetMissingEvent", 37);
	//  222  519:new             #2   <Class EventType>
	//  223  522:dup             
	//  224  523:ldc2            #277 <String "AssetMissingEvent">
	//  225  526:bipush          37
	//  226  528:invokespecial   #166 <Method void EventType(String, int)>
	//  227  531:putstatic       #279 <Field EventType AssetMissingEvent>
		AssetMultiPassEvent = new EventType("AssetMultiPassEvent", 38);
	//  228  534:new             #2   <Class EventType>
	//  229  537:dup             
	//  230  538:ldc2            #280 <String "AssetMultiPassEvent">
	//  231  541:bipush          38
	//  232  543:invokespecial   #166 <Method void EventType(String, int)>
	//  233  546:putstatic       #282 <Field EventType AssetMultiPassEvent>
		AssetMultiPassModesAvailableEvent = new EventType("AssetMultiPassModesAvailableEvent", 39);
	//  234  549:new             #2   <Class EventType>
	//  235  552:dup             
	//  236  553:ldc2            #283 <String "AssetMultiPassModesAvailableEvent">
	//  237  556:bipush          39
	//  238  558:invokespecial   #166 <Method void EventType(String, int)>
	//  239  561:putstatic       #285 <Field EventType AssetMultiPassModesAvailableEvent>
		AssetNetworkSettingsEvent = new EventType("AssetNetworkSettingsEvent", 40);
	//  240  564:new             #2   <Class EventType>
	//  241  567:dup             
	//  242  568:ldc2            #286 <String "AssetNetworkSettingsEvent">
	//  243  571:bipush          40
	//  244  573:invokespecial   #166 <Method void EventType(String, int)>
	//  245  576:putstatic       #288 <Field EventType AssetNetworkSettingsEvent>
		AssetNetworkStatusEvent = new EventType("AssetNetworkStatusEvent", 41);
	//  246  579:new             #2   <Class EventType>
	//  247  582:dup             
	//  248  583:ldc2            #289 <String "AssetNetworkStatusEvent">
	//  249  586:bipush          41
	//  250  588:invokespecial   #166 <Method void EventType(String, int)>
	//  251  591:putstatic       #291 <Field EventType AssetNetworkStatusEvent>
		AssetOtaDeploymentIdEvent = new EventType("AssetOtaDeploymentIdEvent", 42);
	//  252  594:new             #2   <Class EventType>
	//  253  597:dup             
	//  254  598:ldc2            #292 <String "AssetOtaDeploymentIdEvent">
	//  255  601:bipush          42
	//  256  603:invokespecial   #166 <Method void EventType(String, int)>
	//  257  606:putstatic       #294 <Field EventType AssetOtaDeploymentIdEvent>
		AssetOtaUpdateStatusEvent = new EventType("AssetOtaUpdateStatusEvent", 43);
	//  258  609:new             #2   <Class EventType>
	//  259  612:dup             
	//  260  613:ldc2            #295 <String "AssetOtaUpdateStatusEvent">
	//  261  616:bipush          43
	//  262  618:invokespecial   #166 <Method void EventType(String, int)>
	//  263  621:putstatic       #297 <Field EventType AssetOtaUpdateStatusEvent>
		AssetPauseOnBinFullEvent = new EventType("AssetPauseOnBinFullEvent", 44);
	//  264  624:new             #2   <Class EventType>
	//  265  627:dup             
	//  266  628:ldc2            #298 <String "AssetPauseOnBinFullEvent">
	//  267  631:bipush          44
	//  268  633:invokespecial   #166 <Method void EventType(String, int)>
	//  269  636:putstatic       #300 <Field EventType AssetPauseOnBinFullEvent>
		AssetRegisteredEvent = new EventType("AssetRegisteredEvent", 45);
	//  270  639:new             #2   <Class EventType>
	//  271  642:dup             
	//  272  643:ldc2            #301 <String "AssetRegisteredEvent">
	//  273  646:bipush          45
	//  274  648:invokespecial   #166 <Method void EventType(String, int)>
	//  275  651:putstatic       #303 <Field EventType AssetRegisteredEvent>
		AssetRegistrationDateEvent = new EventType("AssetRegistrationDateEvent", 46);
	//  276  654:new             #2   <Class EventType>
	//  277  657:dup             
	//  278  658:ldc2            #304 <String "AssetRegistrationDateEvent">
	//  279  661:bipush          46
	//  280  663:invokespecial   #166 <Method void EventType(String, int)>
	//  281  666:putstatic       #306 <Field EventType AssetRegistrationDateEvent>
		AssetSerialNumberEvent = new EventType("AssetSerialNumberEvent", 47);
	//  282  669:new             #2   <Class EventType>
	//  283  672:dup             
	//  284  673:ldc2            #307 <String "AssetSerialNumberEvent">
	//  285  676:bipush          47
	//  286  678:invokespecial   #166 <Method void EventType(String, int)>
	//  287  681:putstatic       #309 <Field EventType AssetSerialNumberEvent>
		AssetServiceDeploymentIdEvent = new EventType("AssetServiceDeploymentIdEvent", 48);
	//  288  684:new             #2   <Class EventType>
	//  289  687:dup             
	//  290  688:ldc2            #310 <String "AssetServiceDeploymentIdEvent">
	//  291  691:bipush          48
	//  292  693:invokespecial   #166 <Method void EventType(String, int)>
	//  293  696:putstatic       #312 <Field EventType AssetServiceDeploymentIdEvent>
		AssetSkuEvent = new EventType("AssetSkuEvent", 49);
	//  294  699:new             #2   <Class EventType>
	//  295  702:dup             
	//  296  703:ldc2            #313 <String "AssetSkuEvent">
	//  297  706:bipush          49
	//  298  708:invokespecial   #166 <Method void EventType(String, int)>
	//  299  711:putstatic       #315 <Field EventType AssetSkuEvent>
		AssetSkuFailureEvent = new EventType("AssetSkuFailureEvent", 50);
	//  300  714:new             #2   <Class EventType>
	//  301  717:dup             
	//  302  718:ldc2            #316 <String "AssetSkuFailureEvent">
	//  303  721:bipush          50
	//  304  723:invokespecial   #166 <Method void EventType(String, int)>
	//  305  726:putstatic       #318 <Field EventType AssetSkuFailureEvent>
		AssetSoftwareLastUpdatedEvent = new EventType("AssetSoftwareLastUpdatedEvent", 51);
	//  306  729:new             #2   <Class EventType>
	//  307  732:dup             
	//  308  733:ldc2            #319 <String "AssetSoftwareLastUpdatedEvent">
	//  309  736:bipush          51
	//  310  738:invokespecial   #166 <Method void EventType(String, int)>
	//  311  741:putstatic       #321 <Field EventType AssetSoftwareLastUpdatedEvent>
		AssetSoftwareVersionEvent = new EventType("AssetSoftwareVersionEvent", 52);
	//  312  744:new             #2   <Class EventType>
	//  313  747:dup             
	//  314  748:ldc2            #322 <String "AssetSoftwareVersionEvent">
	//  315  751:bipush          52
	//  316  753:invokespecial   #166 <Method void EventType(String, int)>
	//  317  756:putstatic       #324 <Field EventType AssetSoftwareVersionEvent>
		AssetTimeEvent = new EventType("AssetTimeEvent", 53);
	//  318  759:new             #2   <Class EventType>
	//  319  762:dup             
	//  320  763:ldc2            #325 <String "AssetTimeEvent">
	//  321  766:bipush          53
	//  322  768:invokespecial   #166 <Method void EventType(String, int)>
	//  323  771:putstatic       #327 <Field EventType AssetTimeEvent>
		AssetTimeoutEvent = new EventType("AssetTimeoutEvent", 54);
	//  324  774:new             #2   <Class EventType>
	//  325  777:dup             
	//  326  778:ldc2            #328 <String "AssetTimeoutEvent">
	//  327  781:bipush          54
	//  328  783:invokespecial   #166 <Method void EventType(String, int)>
	//  329  786:putstatic       #330 <Field EventType AssetTimeoutEvent>
		AssetTotalEvacuationCountEvent = new EventType("AssetTotalEvacuationCountEvent", 55);
	//  330  789:new             #2   <Class EventType>
	//  331  792:dup             
	//  332  793:ldc2            #331 <String "AssetTotalEvacuationCountEvent">
	//  333  796:bipush          55
	//  334  798:invokespecial   #166 <Method void EventType(String, int)>
	//  335  801:putstatic       #333 <Field EventType AssetTotalEvacuationCountEvent>
		AssetUmiVersionEvent = new EventType("AssetUmiVersionEvent", 56);
	//  336  804:new             #2   <Class EventType>
	//  337  807:dup             
	//  338  808:ldc2            #334 <String "AssetUmiVersionEvent">
	//  339  811:bipush          56
	//  340  813:invokespecial   #166 <Method void EventType(String, int)>
	//  341  816:putstatic       #336 <Field EventType AssetUmiVersionEvent>
		AssetUpdateAvailabilityEvent = new EventType("AssetUpdateAvailabilityEvent", 57);
	//  342  819:new             #2   <Class EventType>
	//  343  822:dup             
	//  344  823:ldc2            #337 <String "AssetUpdateAvailabilityEvent">
	//  345  826:bipush          57
	//  346  828:invokespecial   #166 <Method void EventType(String, int)>
	//  347  831:putstatic       #339 <Field EventType AssetUpdateAvailabilityEvent>
		AssetUpdateProgressEvent = new EventType("AssetUpdateProgressEvent", 58);
	//  348  834:new             #2   <Class EventType>
	//  349  837:dup             
	//  350  838:ldc2            #340 <String "AssetUpdateProgressEvent">
	//  351  841:bipush          58
	//  352  843:invokespecial   #166 <Method void EventType(String, int)>
	//  353  846:putstatic       #342 <Field EventType AssetUpdateProgressEvent>
		AssetVolumeEvent = new EventType("AssetVolumeEvent", 59);
	//  354  849:new             #2   <Class EventType>
	//  355  852:dup             
	//  356  853:ldc2            #343 <String "AssetVolumeEvent">
	//  357  856:bipush          59
	//  358  858:invokespecial   #166 <Method void EventType(String, int)>
	//  359  861:putstatic       #345 <Field EventType AssetVolumeEvent>
		AssetWetnessLevelEvent = new EventType("AssetWetnessLevelEvent", 60);
	//  360  864:new             #2   <Class EventType>
	//  361  867:dup             
	//  362  868:ldc2            #346 <String "AssetWetnessLevelEvent">
	//  363  871:bipush          60
	//  364  873:invokespecial   #166 <Method void EventType(String, int)>
	//  365  876:putstatic       #348 <Field EventType AssetWetnessLevelEvent>
		AssetWifiLogFinishedEvent = new EventType("AssetWifiLogFinishedEvent", 61);
	//  366  879:new             #2   <Class EventType>
	//  367  882:dup             
	//  368  883:ldc2            #349 <String "AssetWifiLogFinishedEvent">
	//  369  886:bipush          61
	//  370  888:invokespecial   #166 <Method void EventType(String, int)>
	//  371  891:putstatic       #351 <Field EventType AssetWifiLogFinishedEvent>
		AssetWifiLogEvent = new EventType("AssetWifiLogEvent", 62);
	//  372  894:new             #2   <Class EventType>
	//  373  897:dup             
	//  374  898:ldc2            #352 <String "AssetWifiLogEvent">
	//  375  901:bipush          62
	//  376  903:invokespecial   #166 <Method void EventType(String, int)>
	//  377  906:putstatic       #354 <Field EventType AssetWifiLogEvent>
		AssetWifiSignalStrengthEvent = new EventType("AssetWifiSignalStrengthEvent", 63);
	//  378  909:new             #2   <Class EventType>
	//  379  912:dup             
	//  380  913:ldc2            #355 <String "AssetWifiSignalStrengthEvent">
	//  381  916:bipush          63
	//  382  918:invokespecial   #166 <Method void EventType(String, int)>
	//  383  921:putstatic       #357 <Field EventType AssetWifiSignalStrengthEvent>
		AvailableSettingsEvent = new EventType("AvailableSettingsEvent", 64);
	//  384  924:new             #2   <Class EventType>
	//  385  927:dup             
	//  386  928:ldc2            #358 <String "AvailableSettingsEvent">
	//  387  931:bipush          64
	//  388  933:invokespecial   #166 <Method void EventType(String, int)>
	//  389  936:putstatic       #360 <Field EventType AvailableSettingsEvent>
		AwsCloudEnvironmentEvent = new EventType("AwsCloudEnvironmentEvent", 65);
	//  390  939:new             #2   <Class EventType>
	//  391  942:dup             
	//  392  943:ldc2            #361 <String "AwsCloudEnvironmentEvent">
	//  393  946:bipush          65
	//  394  948:invokespecial   #166 <Method void EventType(String, int)>
	//  395  951:putstatic       #363 <Field EventType AwsCloudEnvironmentEvent>
		BadAssetPasswordEvent = new EventType("BadAssetPasswordEvent", 66);
	//  396  954:new             #2   <Class EventType>
	//  397  957:dup             
	//  398  958:ldc2            #364 <String "BadAssetPasswordEvent">
	//  399  961:bipush          66
	//  400  963:invokespecial   #166 <Method void EventType(String, int)>
	//  401  966:putstatic       #366 <Field EventType BadAssetPasswordEvent>
		BlackBoxAssetEvacuationCountEvent = new EventType("BlackBoxAssetEvacuationCountEvent", 67);
	//  402  969:new             #2   <Class EventType>
	//  403  972:dup             
	//  404  973:ldc2            #367 <String "BlackBoxAssetEvacuationCountEvent">
	//  405  976:bipush          67
	//  406  978:invokespecial   #166 <Method void EventType(String, int)>
	//  407  981:putstatic       #369 <Field EventType BlackBoxAssetEvacuationCountEvent>
		BraavaMissionStatusEvent = new EventType("BraavaMissionStatusEvent", 68);
	//  408  984:new             #2   <Class EventType>
	//  409  987:dup             
	//  410  988:ldc2            #370 <String "BraavaMissionStatusEvent">
	//  411  991:bipush          68
	//  412  993:invokespecial   #166 <Method void EventType(String, int)>
	//  413  996:putstatic       #372 <Field EventType BraavaMissionStatusEvent>
		BugReportEvent = new EventType("BugReportEvent", 69);
	//  414  999:new             #2   <Class EventType>
	//  415 1002:dup             
	//  416 1003:ldc2            #373 <String "BugReportEvent">
	//  417 1006:bipush          69
	//  418 1008:invokespecial   #166 <Method void EventType(String, int)>
	//  419 1011:putstatic       #375 <Field EventType BugReportEvent>
		CertificateErrorEvent = new EventType("CertificateErrorEvent", 70);
	//  420 1014:new             #2   <Class EventType>
	//  421 1017:dup             
	//  422 1018:ldc2            #376 <String "CertificateErrorEvent">
	//  423 1021:bipush          70
	//  424 1023:invokespecial   #166 <Method void EventType(String, int)>
	//  425 1026:putstatic       #378 <Field EventType CertificateErrorEvent>
		CheckSsidReportEvent = new EventType("CheckSsidReportEvent", 71);
	//  426 1029:new             #2   <Class EventType>
	//  427 1032:dup             
	//  428 1033:ldc2            #379 <String "CheckSsidReportEvent">
	//  429 1036:bipush          71
	//  430 1038:invokespecial   #166 <Method void EventType(String, int)>
	//  431 1041:putstatic       #381 <Field EventType CheckSsidReportEvent>
		ConnectFailureEvent = new EventType("ConnectFailureEvent", 72);
	//  432 1044:new             #2   <Class EventType>
	//  433 1047:dup             
	//  434 1048:ldc2            #382 <String "ConnectFailureEvent">
	//  435 1051:bipush          72
	//  436 1053:invokespecial   #166 <Method void EventType(String, int)>
	//  437 1056:putstatic       #384 <Field EventType ConnectFailureEvent>
		ConnectionStateEvent = new EventType("ConnectionStateEvent", 73);
	//  438 1059:new             #2   <Class EventType>
	//  439 1062:dup             
	//  440 1063:ldc2            #385 <String "ConnectionStateEvent">
	//  441 1066:bipush          73
	//  442 1068:invokespecial   #166 <Method void EventType(String, int)>
	//  443 1071:putstatic       #387 <Field EventType ConnectionStateEvent>
		CurrentConnectionStateEvent = new EventType("CurrentConnectionStateEvent", 74);
	//  444 1074:new             #2   <Class EventType>
	//  445 1077:dup             
	//  446 1078:ldc2            #388 <String "CurrentConnectionStateEvent">
	//  447 1081:bipush          74
	//  448 1083:invokespecial   #166 <Method void EventType(String, int)>
	//  449 1086:putstatic       #390 <Field EventType CurrentConnectionStateEvent>
		DataDeserializationErrorEvent = new EventType("DataDeserializationErrorEvent", 75);
	//  450 1089:new             #2   <Class EventType>
	//  451 1092:dup             
	//  452 1093:ldc2            #391 <String "DataDeserializationErrorEvent">
	//  453 1096:bipush          75
	//  454 1098:invokespecial   #166 <Method void EventType(String, int)>
	//  455 1101:putstatic       #393 <Field EventType DataDeserializationErrorEvent>
		DiscoveredAssetsUpdatedEvent = new EventType("DiscoveredAssetsUpdatedEvent", 76);
	//  456 1104:new             #2   <Class EventType>
	//  457 1107:dup             
	//  458 1108:ldc2            #394 <String "DiscoveredAssetsUpdatedEvent">
	//  459 1111:bipush          76
	//  460 1113:invokespecial   #166 <Method void EventType(String, int)>
	//  461 1116:putstatic       #396 <Field EventType DiscoveredAssetsUpdatedEvent>
		DiscoveryStatusEvent = new EventType("DiscoveryStatusEvent", 77);
	//  462 1119:new             #2   <Class EventType>
	//  463 1122:dup             
	//  464 1123:ldc2            #397 <String "DiscoveryStatusEvent">
	//  465 1126:bipush          77
	//  466 1128:invokespecial   #166 <Method void EventType(String, int)>
	//  467 1131:putstatic       #399 <Field EventType DiscoveryStatusEvent>
		DockEvacuationHistoryEvent = new EventType("DockEvacuationHistoryEvent", 78);
	//  468 1134:new             #2   <Class EventType>
	//  469 1137:dup             
	//  470 1138:ldc2            #400 <String "DockEvacuationHistoryEvent">
	//  471 1141:bipush          78
	//  472 1143:invokespecial   #166 <Method void EventType(String, int)>
	//  473 1146:putstatic       #402 <Field EventType DockEvacuationHistoryEvent>
		EchoEvent = new EventType("EchoEvent", 79);
	//  474 1149:new             #2   <Class EventType>
	//  475 1152:dup             
	//  476 1153:ldc2            #403 <String "EchoEvent">
	//  477 1156:bipush          79
	//  478 1158:invokespecial   #166 <Method void EventType(String, int)>
	//  479 1161:putstatic       #405 <Field EventType EchoEvent>
		ExpeditedOtaStatusEvent = new EventType("ExpeditedOtaStatusEvent", 80);
	//  480 1164:new             #2   <Class EventType>
	//  481 1167:dup             
	//  482 1168:ldc2            #406 <String "ExpeditedOtaStatusEvent">
	//  483 1171:bipush          80
	//  484 1173:invokespecial   #166 <Method void EventType(String, int)>
	//  485 1176:putstatic       #408 <Field EventType ExpeditedOtaStatusEvent>
		ForcefulDisconnectEvent = new EventType("ForcefulDisconnectEvent", 81);
	//  486 1179:new             #2   <Class EventType>
	//  487 1182:dup             
	//  488 1183:ldc2            #409 <String "ForcefulDisconnectEvent">
	//  489 1186:bipush          81
	//  490 1188:invokespecial   #166 <Method void EventType(String, int)>
	//  491 1191:putstatic       #411 <Field EventType ForcefulDisconnectEvent>
		FloorListEvent = new EventType("FloorListEvent", 82);
	//  492 1194:new             #2   <Class EventType>
	//  493 1197:dup             
	//  494 1198:ldc2            #412 <String "FloorListEvent">
	//  495 1201:bipush          82
	//  496 1203:invokespecial   #166 <Method void EventType(String, int)>
	//  497 1206:putstatic       #414 <Field EventType FloorListEvent>
		GenericEvent = new EventType("GenericEvent", 83);
	//  498 1209:new             #2   <Class EventType>
	//  499 1212:dup             
	//  500 1213:ldc2            #415 <String "GenericEvent">
	//  501 1216:bipush          83
	//  502 1218:invokespecial   #166 <Method void EventType(String, int)>
	//  503 1221:putstatic       #417 <Field EventType GenericEvent>
		LatestAppVersionEvent = new EventType("LatestAppVersionEvent", 84);
	//  504 1224:new             #2   <Class EventType>
	//  505 1227:dup             
	//  506 1228:ldc2            #418 <String "LatestAppVersionEvent">
	//  507 1231:bipush          84
	//  508 1233:invokespecial   #166 <Method void EventType(String, int)>
	//  509 1236:putstatic       #420 <Field EventType LatestAppVersionEvent>
		LocalOtaStatusEvent = new EventType("LocalOtaStatusEvent", 85);
	//  510 1239:new             #2   <Class EventType>
	//  511 1242:dup             
	//  512 1243:ldc2            #421 <String "LocalOtaStatusEvent">
	//  513 1246:bipush          85
	//  514 1248:invokespecial   #166 <Method void EventType(String, int)>
	//  515 1251:putstatic       #423 <Field EventType LocalOtaStatusEvent>
		MapUploadAllowedEvent = new EventType("MapUploadAllowedEvent", 86);
	//  516 1254:new             #2   <Class EventType>
	//  517 1257:dup             
	//  518 1258:ldc2            #424 <String "MapUploadAllowedEvent">
	//  519 1261:bipush          86
	//  520 1263:invokespecial   #166 <Method void EventType(String, int)>
	//  521 1266:putstatic       #426 <Field EventType MapUploadAllowedEvent>
		MissionMapEvent = new EventType("MissionMapEvent", 87);
	//  522 1269:new             #2   <Class EventType>
	//  523 1272:dup             
	//  524 1273:ldc2            #427 <String "MissionMapEvent">
	//  525 1276:bipush          87
	//  526 1278:invokespecial   #166 <Method void EventType(String, int)>
	//  527 1281:putstatic       #429 <Field EventType MissionMapEvent>
		MissionRuntimeEChartEvent = new EventType("MissionRuntimeEChartEvent", 88);
	//  528 1284:new             #2   <Class EventType>
	//  529 1287:dup             
	//  530 1288:ldc2            #430 <String "MissionRuntimeEChartEvent">
	//  531 1291:bipush          88
	//  532 1293:invokespecial   #166 <Method void EventType(String, int)>
	//  533 1296:putstatic       #432 <Field EventType MissionRuntimeEChartEvent>
		MissionsAreaCleanedEChartEvent = new EventType("MissionsAreaCleanedEChartEvent", 89);
	//  534 1299:new             #2   <Class EventType>
	//  535 1302:dup             
	//  536 1303:ldc2            #433 <String "MissionsAreaCleanedEChartEvent">
	//  537 1306:bipush          89
	//  538 1308:invokespecial   #166 <Method void EventType(String, int)>
	//  539 1311:putstatic       #435 <Field EventType MissionsAreaCleanedEChartEvent>
		MqttConnectionAcknowledgementEvent = new EventType("MqttConnectionAcknowledgementEvent", 90);
	//  540 1314:new             #2   <Class EventType>
	//  541 1317:dup             
	//  542 1318:ldc2            #436 <String "MqttConnectionAcknowledgementEvent">
	//  543 1321:bipush          90
	//  544 1323:invokespecial   #166 <Method void EventType(String, int)>
	//  545 1326:putstatic       #438 <Field EventType MqttConnectionAcknowledgementEvent>
		NetworkAddressEvent = new EventType("NetworkAddressEvent", 91);
	//  546 1329:new             #2   <Class EventType>
	//  547 1332:dup             
	//  548 1333:ldc2            #439 <String "NetworkAddressEvent">
	//  549 1336:bipush          91
	//  550 1338:invokespecial   #166 <Method void EventType(String, int)>
	//  551 1341:putstatic       #441 <Field EventType NetworkAddressEvent>
		NetworkDiagnosticEvent = new EventType("NetworkDiagnosticEvent", 92);
	//  552 1344:new             #2   <Class EventType>
	//  553 1347:dup             
	//  554 1348:ldc2            #442 <String "NetworkDiagnosticEvent">
	//  555 1351:bipush          92
	//  556 1353:invokespecial   #166 <Method void EventType(String, int)>
	//  557 1356:putstatic       #444 <Field EventType NetworkDiagnosticEvent>
		NetworkErrorEvent = new EventType("NetworkErrorEvent", 93);
	//  558 1359:new             #2   <Class EventType>
	//  559 1362:dup             
	//  560 1363:ldc2            #445 <String "NetworkErrorEvent">
	//  561 1366:bipush          93
	//  562 1368:invokespecial   #166 <Method void EventType(String, int)>
	//  563 1371:putstatic       #447 <Field EventType NetworkErrorEvent>
		NotificationCenterEvent = new EventType("NotificationCenterEvent", 94);
	//  564 1374:new             #2   <Class EventType>
	//  565 1377:dup             
	//  566 1378:ldc2            #448 <String "NotificationCenterEvent">
	//  567 1381:bipush          94
	//  568 1383:invokespecial   #166 <Method void EventType(String, int)>
	//  569 1386:putstatic       #450 <Field EventType NotificationCenterEvent>
		NtpTimeEvent = new EventType("NtpTimeEvent", 95);
	//  570 1389:new             #2   <Class EventType>
	//  571 1392:dup             
	//  572 1393:ldc2            #451 <String "NtpTimeEvent">
	//  573 1396:bipush          95
	//  574 1398:invokespecial   #166 <Method void EventType(String, int)>
	//  575 1401:putstatic       #453 <Field EventType NtpTimeEvent>
		OnDemandOTAAvailabilityEvent = new EventType("OnDemandOTAAvailabilityEvent", 96);
	//  576 1404:new             #2   <Class EventType>
	//  577 1407:dup             
	//  578 1408:ldc2            #454 <String "OnDemandOTAAvailabilityEvent">
	//  579 1411:bipush          96
	//  580 1413:invokespecial   #166 <Method void EventType(String, int)>
	//  581 1416:putstatic       #456 <Field EventType OnDemandOTAAvailabilityEvent>
		PasswordRequestErrorEvent = new EventType("PasswordRequestErrorEvent", 97);
	//  582 1419:new             #2   <Class EventType>
	//  583 1422:dup             
	//  584 1423:ldc2            #457 <String "PasswordRequestErrorEvent">
	//  585 1426:bipush          97
	//  586 1428:invokespecial   #166 <Method void EventType(String, int)>
	//  587 1431:putstatic       #459 <Field EventType PasswordRequestErrorEvent>
		PersistentMapEvent = new EventType("PersistentMapEvent", 98);
	//  588 1434:new             #2   <Class EventType>
	//  589 1437:dup             
	//  590 1438:ldc2            #460 <String "PersistentMapEvent">
	//  591 1441:bipush          98
	//  592 1443:invokespecial   #166 <Method void EventType(String, int)>
	//  593 1446:putstatic       #462 <Field EventType PersistentMapEvent>
		PersistentMapInfoTableEvent = new EventType("PersistentMapInfoTableEvent", 99);
	//  594 1449:new             #2   <Class EventType>
	//  595 1452:dup             
	//  596 1453:ldc2            #463 <String "PersistentMapInfoTableEvent">
	//  597 1456:bipush          99
	//  598 1458:invokespecial   #166 <Method void EventType(String, int)>
	//  599 1461:putstatic       #465 <Field EventType PersistentMapInfoTableEvent>
		PersistentMapSettingsEvent = new EventType("PersistentMapSettingsEvent", 100);
	//  600 1464:new             #2   <Class EventType>
	//  601 1467:dup             
	//  602 1468:ldc2            #466 <String "PersistentMapSettingsEvent">
	//  603 1471:bipush          100
	//  604 1473:invokespecial   #166 <Method void EventType(String, int)>
	//  605 1476:putstatic       #468 <Field EventType PersistentMapSettingsEvent>
		PersistentMapVersionInfoEvent = new EventType("PersistentMapVersionInfoEvent", 101);
	//  606 1479:new             #2   <Class EventType>
	//  607 1482:dup             
	//  608 1483:ldc2            #469 <String "PersistentMapVersionInfoEvent">
	//  609 1486:bipush          101
	//  610 1488:invokespecial   #166 <Method void EventType(String, int)>
	//  611 1491:putstatic       #471 <Field EventType PersistentMapVersionInfoEvent>
		PushNotificationGetSettingsFailedEvent = new EventType("PushNotificationGetSettingsFailedEvent", 102);
	//  612 1494:new             #2   <Class EventType>
	//  613 1497:dup             
	//  614 1498:ldc2            #472 <String "PushNotificationGetSettingsFailedEvent">
	//  615 1501:bipush          102
	//  616 1503:invokespecial   #166 <Method void EventType(String, int)>
	//  617 1506:putstatic       #474 <Field EventType PushNotificationGetSettingsFailedEvent>
		PushNotificationSettingFailedEvent = new EventType("PushNotificationSettingFailedEvent", 103);
	//  618 1509:new             #2   <Class EventType>
	//  619 1512:dup             
	//  620 1513:ldc2            #475 <String "PushNotificationSettingFailedEvent">
	//  621 1516:bipush          103
	//  622 1518:invokespecial   #166 <Method void EventType(String, int)>
	//  623 1521:putstatic       #477 <Field EventType PushNotificationSettingFailedEvent>
		PushNotificationSettingsEvent = new EventType("PushNotificationSettingsEvent", 104);
	//  624 1524:new             #2   <Class EventType>
	//  625 1527:dup             
	//  626 1528:ldc2            #478 <String "PushNotificationSettingsEvent">
	//  627 1531:bipush          104
	//  628 1533:invokespecial   #166 <Method void EventType(String, int)>
	//  629 1536:putstatic       #480 <Field EventType PushNotificationSettingsEvent>
		PushRegistrationStatusEvent = new EventType("PushRegistrationStatusEvent", 105);
	//  630 1539:new             #2   <Class EventType>
	//  631 1542:dup             
	//  632 1543:ldc2            #481 <String "PushRegistrationStatusEvent">
	//  633 1546:bipush          105
	//  634 1548:invokespecial   #166 <Method void EventType(String, int)>
	//  635 1551:putstatic       #483 <Field EventType PushRegistrationStatusEvent>
		RawRobotNameEvent = new EventType("RawRobotNameEvent", 106);
	//  636 1554:new             #2   <Class EventType>
	//  637 1557:dup             
	//  638 1558:ldc2            #484 <String "RawRobotNameEvent">
	//  639 1561:bipush          106
	//  640 1563:invokespecial   #166 <Method void EventType(String, int)>
	//  641 1566:putstatic       #486 <Field EventType RawRobotNameEvent>
		RemoveRobotEvent = new EventType("RemoveRobotEvent", 107);
	//  642 1569:new             #2   <Class EventType>
	//  643 1572:dup             
	//  644 1573:ldc2            #487 <String "RemoveRobotEvent">
	//  645 1576:bipush          107
	//  646 1578:invokespecial   #166 <Method void EventType(String, int)>
	//  647 1581:putstatic       #489 <Field EventType RemoveRobotEvent>
		RequestOtaStatusEvent = new EventType("RequestOtaStatusEvent", 108);
	//  648 1584:new             #2   <Class EventType>
	//  649 1587:dup             
	//  650 1588:ldc2            #490 <String "RequestOtaStatusEvent">
	//  651 1591:bipush          108
	//  652 1593:invokespecial   #166 <Method void EventType(String, int)>
	//  653 1596:putstatic       #492 <Field EventType RequestOtaStatusEvent>
		ResetAssetPartEvent = new EventType("ResetAssetPartEvent", 109);
	//  654 1599:new             #2   <Class EventType>
	//  655 1602:dup             
	//  656 1603:ldc2            #493 <String "ResetAssetPartEvent">
	//  657 1606:bipush          109
	//  658 1608:invokespecial   #166 <Method void EventType(String, int)>
	//  659 1611:putstatic       #495 <Field EventType ResetAssetPartEvent>
		ResetRobotEvent = new EventType("ResetRobotEvent", 110);
	//  660 1614:new             #2   <Class EventType>
	//  661 1617:dup             
	//  662 1618:ldc2            #496 <String "ResetRobotEvent">
	//  663 1621:bipush          110
	//  664 1623:invokespecial   #166 <Method void EventType(String, int)>
	//  665 1626:putstatic       #498 <Field EventType ResetRobotEvent>
		ResolvedMissionStatusEvent = new EventType("ResolvedMissionStatusEvent", 111);
	//  666 1629:new             #2   <Class EventType>
	//  667 1632:dup             
	//  668 1633:ldc2            #499 <String "ResolvedMissionStatusEvent">
	//  669 1636:bipush          111
	//  670 1638:invokespecial   #166 <Method void EventType(String, int)>
	//  671 1641:putstatic       #501 <Field EventType ResolvedMissionStatusEvent>
		RobotAudioPlayingEvent = new EventType("RobotAudioPlayingEvent", 112);
	//  672 1644:new             #2   <Class EventType>
	//  673 1647:dup             
	//  674 1648:ldc2            #502 <String "RobotAudioPlayingEvent">
	//  675 1651:bipush          112
	//  676 1653:invokespecial   #166 <Method void EventType(String, int)>
	//  677 1656:putstatic       #504 <Field EventType RobotAudioPlayingEvent>
		RobotBatteryLevelEvent = new EventType("RobotBatteryLevelEvent", 113);
	//  678 1659:new             #2   <Class EventType>
	//  679 1662:dup             
	//  680 1663:ldc2            #505 <String "RobotBatteryLevelEvent">
	//  681 1666:bipush          113
	//  682 1668:invokespecial   #166 <Method void EventType(String, int)>
	//  683 1671:putstatic       #507 <Field EventType RobotBatteryLevelEvent>
		RobotBinFullEvent = new EventType("RobotBinFullEvent", 114);
	//  684 1674:new             #2   <Class EventType>
	//  685 1677:dup             
	//  686 1678:ldc2            #508 <String "RobotBinFullEvent">
	//  687 1681:bipush          114
	//  688 1683:invokespecial   #166 <Method void EventType(String, int)>
	//  689 1686:putstatic       #510 <Field EventType RobotBinFullEvent>
		RobotBinRemovalEvent = new EventType("RobotBinRemovalEvent", 115);
	//  690 1689:new             #2   <Class EventType>
	//  691 1692:dup             
	//  692 1693:ldc2            #511 <String "RobotBinRemovalEvent">
	//  693 1696:bipush          115
	//  694 1698:invokespecial   #166 <Method void EventType(String, int)>
	//  695 1701:putstatic       #513 <Field EventType RobotBinRemovalEvent>
		RobotDockEvent = new EventType("RobotDockEvent", 116);
	//  696 1704:new             #2   <Class EventType>
	//  697 1707:dup             
	//  698 1708:ldc2            #514 <String "RobotDockEvent">
	//  699 1711:bipush          116
	//  700 1713:invokespecial   #166 <Method void EventType(String, int)>
	//  701 1716:putstatic       #516 <Field EventType RobotDockEvent>
		RobotErrorEvent = new EventType("RobotErrorEvent", 117);
	//  702 1719:new             #2   <Class EventType>
	//  703 1722:dup             
	//  704 1723:ldc2            #517 <String "RobotErrorEvent">
	//  705 1726:bipush          117
	//  706 1728:invokespecial   #166 <Method void EventType(String, int)>
	//  707 1731:putstatic       #519 <Field EventType RobotErrorEvent>
		RobotLanguageEvent = new EventType("RobotLanguageEvent", 118);
	//  708 1734:new             #2   <Class EventType>
	//  709 1737:dup             
	//  710 1738:ldc2            #520 <String "RobotLanguageEvent">
	//  711 1741:bipush          118
	//  712 1743:invokespecial   #166 <Method void EventType(String, int)>
	//  713 1746:putstatic       #522 <Field EventType RobotLanguageEvent>
		RobotLanguagesAvailableEvent = new EventType("RobotLanguagesAvailableEvent", 119);
	//  714 1749:new             #2   <Class EventType>
	//  715 1752:dup             
	//  716 1753:ldc2            #523 <String "RobotLanguagesAvailableEvent">
	//  717 1756:bipush          119
	//  718 1758:invokespecial   #166 <Method void EventType(String, int)>
	//  719 1761:putstatic       #525 <Field EventType RobotLanguagesAvailableEvent>
		RobotMissionAreaCoveredEvent = new EventType("RobotMissionAreaCoveredEvent", 120);
	//  720 1764:new             #2   <Class EventType>
	//  721 1767:dup             
	//  722 1768:ldc2            #526 <String "RobotMissionAreaCoveredEvent">
	//  723 1771:bipush          120
	//  724 1773:invokespecial   #166 <Method void EventType(String, int)>
	//  725 1776:putstatic       #528 <Field EventType RobotMissionAreaCoveredEvent>
		RobotMissionHistoryEvent = new EventType("RobotMissionHistoryEvent", 121);
	//  726 1779:new             #2   <Class EventType>
	//  727 1782:dup             
	//  728 1783:ldc2            #529 <String "RobotMissionHistoryEvent">
	//  729 1786:bipush          121
	//  730 1788:invokespecial   #166 <Method void EventType(String, int)>
	//  731 1791:putstatic       #531 <Field EventType RobotMissionHistoryEvent>
		RobotMissionHistoryScreenshotEvent = new EventType("RobotMissionHistoryScreenshotEvent", 122);
	//  732 1794:new             #2   <Class EventType>
	//  733 1797:dup             
	//  734 1798:ldc2            #532 <String "RobotMissionHistoryScreenshotEvent">
	//  735 1801:bipush          122
	//  736 1803:invokespecial   #166 <Method void EventType(String, int)>
	//  737 1806:putstatic       #534 <Field EventType RobotMissionHistoryScreenshotEvent>
		RobotMissionStatusEvent = new EventType("RobotMissionStatusEvent", 123);
	//  738 1809:new             #2   <Class EventType>
	//  739 1812:dup             
	//  740 1813:ldc2            #535 <String "RobotMissionStatusEvent">
	//  741 1816:bipush          123
	//  742 1818:invokespecial   #166 <Method void EventType(String, int)>
	//  743 1821:putstatic       #537 <Field EventType RobotMissionStatusEvent>
		RobotMultiScheduleEvent = new EventType("RobotMultiScheduleEvent", 124);
	//  744 1824:new             #2   <Class EventType>
	//  745 1827:dup             
	//  746 1828:ldc2            #538 <String "RobotMultiScheduleEvent">
	//  747 1831:bipush          124
	//  748 1833:invokespecial   #166 <Method void EventType(String, int)>
	//  749 1836:putstatic       #540 <Field EventType RobotMultiScheduleEvent>
		RobotNameEvent = new EventType("RobotNameEvent", 125);
	//  750 1839:new             #2   <Class EventType>
	//  751 1842:dup             
	//  752 1843:ldc2            #541 <String "RobotNameEvent">
	//  753 1846:bipush          125
	//  754 1848:invokespecial   #166 <Method void EventType(String, int)>
	//  755 1851:putstatic       #543 <Field EventType RobotNameEvent>
		RobotPadCategoryEvent = new EventType("RobotPadCategoryEvent", 126);
	//  756 1854:new             #2   <Class EventType>
	//  757 1857:dup             
	//  758 1858:ldc2            #544 <String "RobotPadCategoryEvent">
	//  759 1861:bipush          126
	//  760 1863:invokespecial   #166 <Method void EventType(String, int)>
	//  761 1866:putstatic       #546 <Field EventType RobotPadCategoryEvent>
		RobotPasswordEvent = new EventType("RobotPasswordEvent", 127);
	//  762 1869:new             #2   <Class EventType>
	//  763 1872:dup             
	//  764 1873:ldc2            #547 <String "RobotPasswordEvent">
	//  765 1876:bipush          127
	//  766 1878:invokespecial   #166 <Method void EventType(String, int)>
	//  767 1881:putstatic       #549 <Field EventType RobotPasswordEvent>
		RobotPoseEvent = new EventType("RobotPoseEvent", 128);
	//  768 1884:new             #2   <Class EventType>
	//  769 1887:dup             
	//  770 1888:ldc2            #550 <String "RobotPoseEvent">
	//  771 1891:sipush          128
	//  772 1894:invokespecial   #166 <Method void EventType(String, int)>
	//  773 1897:putstatic       #552 <Field EventType RobotPoseEvent>
		RobotPreferencesEvent = new EventType("RobotPreferencesEvent", 129);
	//  774 1900:new             #2   <Class EventType>
	//  775 1903:dup             
	//  776 1904:ldc2            #553 <String "RobotPreferencesEvent">
	//  777 1907:sipush          129
	//  778 1910:invokespecial   #166 <Method void EventType(String, int)>
	//  779 1913:putstatic       #555 <Field EventType RobotPreferencesEvent>
		RobotReadinessEvent = new EventType("RobotReadinessEvent", 130);
	//  780 1916:new             #2   <Class EventType>
	//  781 1919:dup             
	//  782 1920:ldc2            #556 <String "RobotReadinessEvent">
	//  783 1923:sipush          130
	//  784 1926:invokespecial   #166 <Method void EventType(String, int)>
	//  785 1929:putstatic       #558 <Field EventType RobotReadinessEvent>
		RobotRoomConfinementEvent = new EventType("RobotRoomConfinementEvent", 131);
	//  786 1932:new             #2   <Class EventType>
	//  787 1935:dup             
	//  788 1936:ldc2            #559 <String "RobotRoomConfinementEvent">
	//  789 1939:sipush          131
	//  790 1942:invokespecial   #166 <Method void EventType(String, int)>
	//  791 1945:putstatic       #561 <Field EventType RobotRoomConfinementEvent>
		RobotScheduleEvent = new EventType("RobotScheduleEvent", 132);
	//  792 1948:new             #2   <Class EventType>
	//  793 1951:dup             
	//  794 1952:ldc2            #562 <String "RobotScheduleEvent">
	//  795 1955:sipush          132
	//  796 1958:invokespecial   #166 <Method void EventType(String, int)>
	//  797 1961:putstatic       #564 <Field EventType RobotScheduleEvent>
		RobotTimeZoneEvent = new EventType("RobotTimeZoneEvent", 133);
	//  798 1964:new             #2   <Class EventType>
	//  799 1967:dup             
	//  800 1968:ldc2            #565 <String "RobotTimeZoneEvent">
	//  801 1971:sipush          133
	//  802 1974:invokespecial   #166 <Method void EventType(String, int)>
	//  803 1977:putstatic       #567 <Field EventType RobotTimeZoneEvent>
		RobotAttachedPadWetnessEvent = new EventType("RobotAttachedPadWetnessEvent", 134);
	//  804 1980:new             #2   <Class EventType>
	//  805 1983:dup             
	//  806 1984:ldc2            #568 <String "RobotAttachedPadWetnessEvent">
	//  807 1987:sipush          134
	//  808 1990:invokespecial   #166 <Method void EventType(String, int)>
	//  809 1993:putstatic       #570 <Field EventType RobotAttachedPadWetnessEvent>
		RobotPadWetnessEvent = new EventType("RobotPadWetnessEvent", 135);
	//  810 1996:new             #2   <Class EventType>
	//  811 1999:dup             
	//  812 2000:ldc2            #571 <String "RobotPadWetnessEvent">
	//  813 2003:sipush          135
	//  814 2006:invokespecial   #166 <Method void EventType(String, int)>
	//  815 2009:putstatic       #573 <Field EventType RobotPadWetnessEvent>
		RobotRankOverlapEvent = new EventType("RobotRankOverlapEvent", 136);
	//  816 2012:new             #2   <Class EventType>
	//  817 2015:dup             
	//  818 2016:ldc2            #574 <String "RobotRankOverlapEvent">
	//  819 2019:sipush          136
	//  820 2022:invokespecial   #166 <Method void EventType(String, int)>
	//  821 2025:putstatic       #576 <Field EventType RobotRankOverlapEvent>
		RobotTankLevelEvent = new EventType("RobotTankLevelEvent", 137);
	//  822 2028:new             #2   <Class EventType>
	//  823 2031:dup             
	//  824 2032:ldc2            #577 <String "RobotTankLevelEvent">
	//  825 2035:sipush          137
	//  826 2038:invokespecial   #166 <Method void EventType(String, int)>
	//  827 2041:putstatic       #579 <Field EventType RobotTankLevelEvent>
		ScheduleTypeSupportedEvent = new EventType("ScheduleTypeSupportedEvent", 138);
	//  828 2044:new             #2   <Class EventType>
	//  829 2047:dup             
	//  830 2048:ldc2            #580 <String "ScheduleTypeSupportedEvent">
	//  831 2051:sipush          138
	//  832 2054:invokespecial   #166 <Method void EventType(String, int)>
	//  833 2057:putstatic       #582 <Field EventType ScheduleTypeSupportedEvent>
		SoftApStatusEvent = new EventType("SoftApStatusEvent", 139);
	//  834 2060:new             #2   <Class EventType>
	//  835 2063:dup             
	//  836 2064:ldc2            #583 <String "SoftApStatusEvent">
	//  837 2067:sipush          139
	//  838 2070:invokespecial   #166 <Method void EventType(String, int)>
	//  839 2073:putstatic       #585 <Field EventType SoftApStatusEvent>
		SubProtocolConnectionStateEvent = new EventType("SubProtocolConnectionStateEvent", 140);
	//  840 2076:new             #2   <Class EventType>
	//  841 2079:dup             
	//  842 2080:ldc2            #586 <String "SubProtocolConnectionStateEvent">
	//  843 2083:sipush          140
	//  844 2086:invokespecial   #166 <Method void EventType(String, int)>
	//  845 2089:putstatic       #588 <Field EventType SubProtocolConnectionStateEvent>
		TimeoutEvent = new EventType("TimeoutEvent", 141);
	//  846 2092:new             #2   <Class EventType>
	//  847 2095:dup             
	//  848 2096:ldc2            #589 <String "TimeoutEvent">
	//  849 2099:sipush          141
	//  850 2102:invokespecial   #166 <Method void EventType(String, int)>
	//  851 2105:putstatic       #591 <Field EventType TimeoutEvent>
		UmfDataMissingEvent = new EventType("UmfDataMissingEvent", 142);
	//  852 2108:new             #2   <Class EventType>
	//  853 2111:dup             
	//  854 2112:ldc2            #592 <String "UmfDataMissingEvent">
	//  855 2115:sipush          142
	//  856 2118:invokespecial   #166 <Method void EventType(String, int)>
	//  857 2121:putstatic       #594 <Field EventType UmfDataMissingEvent>
		UmfParsingErrorEvent = new EventType("UmfParsingErrorEvent", 143);
	//  858 2124:new             #2   <Class EventType>
	//  859 2127:dup             
	//  860 2128:ldc2            #595 <String "UmfParsingErrorEvent">
	//  861 2131:sipush          143
	//  862 2134:invokespecial   #166 <Method void EventType(String, int)>
	//  863 2137:putstatic       #597 <Field EventType UmfParsingErrorEvent>
		UnauthenticatedConnectionStateEvent = new EventType("UnauthenticatedConnectionStateEvent", 144);
	//  864 2140:new             #2   <Class EventType>
	//  865 2143:dup             
	//  866 2144:ldc2            #598 <String "UnauthenticatedConnectionStateEvent">
	//  867 2147:sipush          144
	//  868 2150:invokespecial   #166 <Method void EventType(String, int)>
	//  869 2153:putstatic       #600 <Field EventType UnauthenticatedConnectionStateEvent>
		WifiConfigEvent = new EventType("WifiConfigEvent", 145);
	//  870 2156:new             #2   <Class EventType>
	//  871 2159:dup             
	//  872 2160:ldc2            #601 <String "WifiConfigEvent">
	//  873 2163:sipush          145
	//  874 2166:invokespecial   #166 <Method void EventType(String, int)>
	//  875 2169:putstatic       #603 <Field EventType WifiConfigEvent>
		WifiProvisioningErrorEvent = new EventType("WifiProvisioningErrorEvent", 146);
	//  876 2172:new             #2   <Class EventType>
	//  877 2175:dup             
	//  878 2176:ldc2            #604 <String "WifiProvisioningErrorEvent">
	//  879 2179:sipush          146
	//  880 2182:invokespecial   #166 <Method void EventType(String, int)>
	//  881 2185:putstatic       #606 <Field EventType WifiProvisioningErrorEvent>
		AccountConsentDateUpdateFailedEvent = new EventType("AccountConsentDateUpdateFailedEvent", 147);
	//  882 2188:new             #2   <Class EventType>
	//  883 2191:dup             
	//  884 2192:ldc2            #607 <String "AccountConsentDateUpdateFailedEvent">
	//  885 2195:sipush          147
	//  886 2198:invokespecial   #166 <Method void EventType(String, int)>
	//  887 2201:putstatic       #609 <Field EventType AccountConsentDateUpdateFailedEvent>
		AccountConsentDateUpdatedEvent = new EventType("AccountConsentDateUpdatedEvent", 148);
	//  888 2204:new             #2   <Class EventType>
	//  889 2207:dup             
	//  890 2208:ldc2            #610 <String "AccountConsentDateUpdatedEvent">
	//  891 2211:sipush          148
	//  892 2214:invokespecial   #166 <Method void EventType(String, int)>
	//  893 2217:putstatic       #612 <Field EventType AccountConsentDateUpdatedEvent>
		PMapLearningAllowedEvent = new EventType("PMapLearningAllowedEvent", 149);
	//  894 2220:new             #2   <Class EventType>
	//  895 2223:dup             
	//  896 2224:ldc2            #613 <String "PMapLearningAllowedEvent">
	//  897 2227:sipush          149
	//  898 2230:invokespecial   #166 <Method void EventType(String, int)>
	//  899 2233:putstatic       #615 <Field EventType PMapLearningAllowedEvent>
		DuplicateAssetStatusChangedEvent = new EventType("DuplicateAssetStatusChangedEvent", 150);
	//  900 2236:new             #2   <Class EventType>
	//  901 2239:dup             
	//  902 2240:ldc2            #616 <String "DuplicateAssetStatusChangedEvent">
	//  903 2243:sipush          150
	//  904 2246:invokespecial   #166 <Method void EventType(String, int)>
	//  905 2249:putstatic       #618 <Field EventType DuplicateAssetStatusChangedEvent>
		$VALUES = (new EventType[] {
			AssetPreventativeMaintenanceStatusEvent, AssetTotalAreaCoveredEvent, AssetTotalRuntimeEvent, Event, AccountAddRobotEvent, AccountErrorEvent, AccountInfoUpdatedEvent, AccountFeatureUpdatedEvent, AccountFeatureUpdateFailedEvent, AccountFlagUpdatedEvent, 
			AccountFlagUpdateFailedEvent, AccountLoggedInEvent, AccountLoggedOutEvent, AccountLogoutFailedEvent, AlexaAuthTokenEvent, AlexaAuthTokenFailureEvent, AppInfoEvent, AssetAccumulatedHistoryEvent, AssetAddedEvent, AssetAudioVersionEvent, 
			AssetBatteryTypeEvent, AssetBehaviorLogEvent, AssetCapabilitiesEvent, AssetCapabilitiesChangedEvent, AssetCarpetBoostEvent, AssetCarpetBoostModesAvailableEvent, AssetCloudConfigEvent, AssetCommandTimeoutEvent, AssetDiscoveryDataEvent, AssetEdgeCleanEvent, 
			AssetEvent, AssetGenericEvent, AssetHistoryEventTypesEvent, AssetLocationCountryEvent, AssetLocationPostalCodeEvent, AssetLogUploadEvent, AssetMacAddressEvent, AssetMissingEvent, AssetMultiPassEvent, AssetMultiPassModesAvailableEvent, 
			AssetNetworkSettingsEvent, AssetNetworkStatusEvent, AssetOtaDeploymentIdEvent, AssetOtaUpdateStatusEvent, AssetPauseOnBinFullEvent, AssetRegisteredEvent, AssetRegistrationDateEvent, AssetSerialNumberEvent, AssetServiceDeploymentIdEvent, AssetSkuEvent, 
			AssetSkuFailureEvent, AssetSoftwareLastUpdatedEvent, AssetSoftwareVersionEvent, AssetTimeEvent, AssetTimeoutEvent, AssetTotalEvacuationCountEvent, AssetUmiVersionEvent, AssetUpdateAvailabilityEvent, AssetUpdateProgressEvent, AssetVolumeEvent, 
			AssetWetnessLevelEvent, AssetWifiLogFinishedEvent, AssetWifiLogEvent, AssetWifiSignalStrengthEvent, AvailableSettingsEvent, AwsCloudEnvironmentEvent, BadAssetPasswordEvent, BlackBoxAssetEvacuationCountEvent, BraavaMissionStatusEvent, BugReportEvent, 
			CertificateErrorEvent, CheckSsidReportEvent, ConnectFailureEvent, ConnectionStateEvent, CurrentConnectionStateEvent, DataDeserializationErrorEvent, DiscoveredAssetsUpdatedEvent, DiscoveryStatusEvent, DockEvacuationHistoryEvent, EchoEvent, 
			ExpeditedOtaStatusEvent, ForcefulDisconnectEvent, FloorListEvent, GenericEvent, LatestAppVersionEvent, LocalOtaStatusEvent, MapUploadAllowedEvent, MissionMapEvent, MissionRuntimeEChartEvent, MissionsAreaCleanedEChartEvent, 
			MqttConnectionAcknowledgementEvent, NetworkAddressEvent, NetworkDiagnosticEvent, NetworkErrorEvent, NotificationCenterEvent, NtpTimeEvent, OnDemandOTAAvailabilityEvent, PasswordRequestErrorEvent, PersistentMapEvent, PersistentMapInfoTableEvent, 
			PersistentMapSettingsEvent, PersistentMapVersionInfoEvent, PushNotificationGetSettingsFailedEvent, PushNotificationSettingFailedEvent, PushNotificationSettingsEvent, PushRegistrationStatusEvent, RawRobotNameEvent, RemoveRobotEvent, RequestOtaStatusEvent, ResetAssetPartEvent, 
			ResetRobotEvent, ResolvedMissionStatusEvent, RobotAudioPlayingEvent, RobotBatteryLevelEvent, RobotBinFullEvent, RobotBinRemovalEvent, RobotDockEvent, RobotErrorEvent, RobotLanguageEvent, RobotLanguagesAvailableEvent, 
			RobotMissionAreaCoveredEvent, RobotMissionHistoryEvent, RobotMissionHistoryScreenshotEvent, RobotMissionStatusEvent, RobotMultiScheduleEvent, RobotNameEvent, RobotPadCategoryEvent, RobotPasswordEvent, RobotPoseEvent, RobotPreferencesEvent, 
			RobotReadinessEvent, RobotRoomConfinementEvent, RobotScheduleEvent, RobotTimeZoneEvent, RobotAttachedPadWetnessEvent, RobotPadWetnessEvent, RobotRankOverlapEvent, RobotTankLevelEvent, ScheduleTypeSupportedEvent, SoftApStatusEvent, 
			SubProtocolConnectionStateEvent, TimeoutEvent, UmfDataMissingEvent, UmfParsingErrorEvent, UnauthenticatedConnectionStateEvent, WifiConfigEvent, WifiProvisioningErrorEvent, AccountConsentDateUpdateFailedEvent, AccountConsentDateUpdatedEvent, PMapLearningAllowedEvent, 
			DuplicateAssetStatusChangedEvent
		});
	//  906 2252:sipush          151
	//  907 2255:anewarray       EventType[]
	//  908 2258:dup             
	//  909 2259:iconst_0        
	//  910 2260:getstatic       #168 <Field EventType AssetPreventativeMaintenanceStatusEvent>
	//  911 2263:aastore         
	//  912 2264:dup             
	//  913 2265:iconst_1        
	//  914 2266:getstatic       #171 <Field EventType AssetTotalAreaCoveredEvent>
	//  915 2269:aastore         
	//  916 2270:dup             
	//  917 2271:iconst_2        
	//  918 2272:getstatic       #174 <Field EventType AssetTotalRuntimeEvent>
	//  919 2275:aastore         
	//  920 2276:dup             
	//  921 2277:iconst_3        
	//  922 2278:getstatic       #177 <Field EventType Event>
	//  923 2281:aastore         
	//  924 2282:dup             
	//  925 2283:iconst_4        
	//  926 2284:getstatic       #180 <Field EventType AccountAddRobotEvent>
	//  927 2287:aastore         
	//  928 2288:dup             
	//  929 2289:iconst_5        
	//  930 2290:getstatic       #183 <Field EventType AccountErrorEvent>
	//  931 2293:aastore         
	//  932 2294:dup             
	//  933 2295:bipush          6
	//  934 2297:getstatic       #186 <Field EventType AccountInfoUpdatedEvent>
	//  935 2300:aastore         
	//  936 2301:dup             
	//  937 2302:bipush          7
	//  938 2304:getstatic       #189 <Field EventType AccountFeatureUpdatedEvent>
	//  939 2307:aastore         
	//  940 2308:dup             
	//  941 2309:bipush          8
	//  942 2311:getstatic       #192 <Field EventType AccountFeatureUpdateFailedEvent>
	//  943 2314:aastore         
	//  944 2315:dup             
	//  945 2316:bipush          9
	//  946 2318:getstatic       #195 <Field EventType AccountFlagUpdatedEvent>
	//  947 2321:aastore         
	//  948 2322:dup             
	//  949 2323:bipush          10
	//  950 2325:getstatic       #198 <Field EventType AccountFlagUpdateFailedEvent>
	//  951 2328:aastore         
	//  952 2329:dup             
	//  953 2330:bipush          11
	//  954 2332:getstatic       #201 <Field EventType AccountLoggedInEvent>
	//  955 2335:aastore         
	//  956 2336:dup             
	//  957 2337:bipush          12
	//  958 2339:getstatic       #204 <Field EventType AccountLoggedOutEvent>
	//  959 2342:aastore         
	//  960 2343:dup             
	//  961 2344:bipush          13
	//  962 2346:getstatic       #207 <Field EventType AccountLogoutFailedEvent>
	//  963 2349:aastore         
	//  964 2350:dup             
	//  965 2351:bipush          14
	//  966 2353:getstatic       #210 <Field EventType AlexaAuthTokenEvent>
	//  967 2356:aastore         
	//  968 2357:dup             
	//  969 2358:bipush          15
	//  970 2360:getstatic       #213 <Field EventType AlexaAuthTokenFailureEvent>
	//  971 2363:aastore         
	//  972 2364:dup             
	//  973 2365:bipush          16
	//  974 2367:getstatic       #216 <Field EventType AppInfoEvent>
	//  975 2370:aastore         
	//  976 2371:dup             
	//  977 2372:bipush          17
	//  978 2374:getstatic       #219 <Field EventType AssetAccumulatedHistoryEvent>
	//  979 2377:aastore         
	//  980 2378:dup             
	//  981 2379:bipush          18
	//  982 2381:getstatic       #222 <Field EventType AssetAddedEvent>
	//  983 2384:aastore         
	//  984 2385:dup             
	//  985 2386:bipush          19
	//  986 2388:getstatic       #225 <Field EventType AssetAudioVersionEvent>
	//  987 2391:aastore         
	//  988 2392:dup             
	//  989 2393:bipush          20
	//  990 2395:getstatic       #228 <Field EventType AssetBatteryTypeEvent>
	//  991 2398:aastore         
	//  992 2399:dup             
	//  993 2400:bipush          21
	//  994 2402:getstatic       #231 <Field EventType AssetBehaviorLogEvent>
	//  995 2405:aastore         
	//  996 2406:dup             
	//  997 2407:bipush          22
	//  998 2409:getstatic       #234 <Field EventType AssetCapabilitiesEvent>
	//  999 2412:aastore         
	// 1000 2413:dup             
	// 1001 2414:bipush          23
	// 1002 2416:getstatic       #237 <Field EventType AssetCapabilitiesChangedEvent>
	// 1003 2419:aastore         
	// 1004 2420:dup             
	// 1005 2421:bipush          24
	// 1006 2423:getstatic       #240 <Field EventType AssetCarpetBoostEvent>
	// 1007 2426:aastore         
	// 1008 2427:dup             
	// 1009 2428:bipush          25
	// 1010 2430:getstatic       #243 <Field EventType AssetCarpetBoostModesAvailableEvent>
	// 1011 2433:aastore         
	// 1012 2434:dup             
	// 1013 2435:bipush          26
	// 1014 2437:getstatic       #246 <Field EventType AssetCloudConfigEvent>
	// 1015 2440:aastore         
	// 1016 2441:dup             
	// 1017 2442:bipush          27
	// 1018 2444:getstatic       #249 <Field EventType AssetCommandTimeoutEvent>
	// 1019 2447:aastore         
	// 1020 2448:dup             
	// 1021 2449:bipush          28
	// 1022 2451:getstatic       #252 <Field EventType AssetDiscoveryDataEvent>
	// 1023 2454:aastore         
	// 1024 2455:dup             
	// 1025 2456:bipush          29
	// 1026 2458:getstatic       #255 <Field EventType AssetEdgeCleanEvent>
	// 1027 2461:aastore         
	// 1028 2462:dup             
	// 1029 2463:bipush          30
	// 1030 2465:getstatic       #258 <Field EventType AssetEvent>
	// 1031 2468:aastore         
	// 1032 2469:dup             
	// 1033 2470:bipush          31
	// 1034 2472:getstatic       #261 <Field EventType AssetGenericEvent>
	// 1035 2475:aastore         
	// 1036 2476:dup             
	// 1037 2477:bipush          32
	// 1038 2479:getstatic       #264 <Field EventType AssetHistoryEventTypesEvent>
	// 1039 2482:aastore         
	// 1040 2483:dup             
	// 1041 2484:bipush          33
	// 1042 2486:getstatic       #267 <Field EventType AssetLocationCountryEvent>
	// 1043 2489:aastore         
	// 1044 2490:dup             
	// 1045 2491:bipush          34
	// 1046 2493:getstatic       #270 <Field EventType AssetLocationPostalCodeEvent>
	// 1047 2496:aastore         
	// 1048 2497:dup             
	// 1049 2498:bipush          35
	// 1050 2500:getstatic       #273 <Field EventType AssetLogUploadEvent>
	// 1051 2503:aastore         
	// 1052 2504:dup             
	// 1053 2505:bipush          36
	// 1054 2507:getstatic       #276 <Field EventType AssetMacAddressEvent>
	// 1055 2510:aastore         
	// 1056 2511:dup             
	// 1057 2512:bipush          37
	// 1058 2514:getstatic       #279 <Field EventType AssetMissingEvent>
	// 1059 2517:aastore         
	// 1060 2518:dup             
	// 1061 2519:bipush          38
	// 1062 2521:getstatic       #282 <Field EventType AssetMultiPassEvent>
	// 1063 2524:aastore         
	// 1064 2525:dup             
	// 1065 2526:bipush          39
	// 1066 2528:getstatic       #285 <Field EventType AssetMultiPassModesAvailableEvent>
	// 1067 2531:aastore         
	// 1068 2532:dup             
	// 1069 2533:bipush          40
	// 1070 2535:getstatic       #288 <Field EventType AssetNetworkSettingsEvent>
	// 1071 2538:aastore         
	// 1072 2539:dup             
	// 1073 2540:bipush          41
	// 1074 2542:getstatic       #291 <Field EventType AssetNetworkStatusEvent>
	// 1075 2545:aastore         
	// 1076 2546:dup             
	// 1077 2547:bipush          42
	// 1078 2549:getstatic       #294 <Field EventType AssetOtaDeploymentIdEvent>
	// 1079 2552:aastore         
	// 1080 2553:dup             
	// 1081 2554:bipush          43
	// 1082 2556:getstatic       #297 <Field EventType AssetOtaUpdateStatusEvent>
	// 1083 2559:aastore         
	// 1084 2560:dup             
	// 1085 2561:bipush          44
	// 1086 2563:getstatic       #300 <Field EventType AssetPauseOnBinFullEvent>
	// 1087 2566:aastore         
	// 1088 2567:dup             
	// 1089 2568:bipush          45
	// 1090 2570:getstatic       #303 <Field EventType AssetRegisteredEvent>
	// 1091 2573:aastore         
	// 1092 2574:dup             
	// 1093 2575:bipush          46
	// 1094 2577:getstatic       #306 <Field EventType AssetRegistrationDateEvent>
	// 1095 2580:aastore         
	// 1096 2581:dup             
	// 1097 2582:bipush          47
	// 1098 2584:getstatic       #309 <Field EventType AssetSerialNumberEvent>
	// 1099 2587:aastore         
	// 1100 2588:dup             
	// 1101 2589:bipush          48
	// 1102 2591:getstatic       #312 <Field EventType AssetServiceDeploymentIdEvent>
	// 1103 2594:aastore         
	// 1104 2595:dup             
	// 1105 2596:bipush          49
	// 1106 2598:getstatic       #315 <Field EventType AssetSkuEvent>
	// 1107 2601:aastore         
	// 1108 2602:dup             
	// 1109 2603:bipush          50
	// 1110 2605:getstatic       #318 <Field EventType AssetSkuFailureEvent>
	// 1111 2608:aastore         
	// 1112 2609:dup             
	// 1113 2610:bipush          51
	// 1114 2612:getstatic       #321 <Field EventType AssetSoftwareLastUpdatedEvent>
	// 1115 2615:aastore         
	// 1116 2616:dup             
	// 1117 2617:bipush          52
	// 1118 2619:getstatic       #324 <Field EventType AssetSoftwareVersionEvent>
	// 1119 2622:aastore         
	// 1120 2623:dup             
	// 1121 2624:bipush          53
	// 1122 2626:getstatic       #327 <Field EventType AssetTimeEvent>
	// 1123 2629:aastore         
	// 1124 2630:dup             
	// 1125 2631:bipush          54
	// 1126 2633:getstatic       #330 <Field EventType AssetTimeoutEvent>
	// 1127 2636:aastore         
	// 1128 2637:dup             
	// 1129 2638:bipush          55
	// 1130 2640:getstatic       #333 <Field EventType AssetTotalEvacuationCountEvent>
	// 1131 2643:aastore         
	// 1132 2644:dup             
	// 1133 2645:bipush          56
	// 1134 2647:getstatic       #336 <Field EventType AssetUmiVersionEvent>
	// 1135 2650:aastore         
	// 1136 2651:dup             
	// 1137 2652:bipush          57
	// 1138 2654:getstatic       #339 <Field EventType AssetUpdateAvailabilityEvent>
	// 1139 2657:aastore         
	// 1140 2658:dup             
	// 1141 2659:bipush          58
	// 1142 2661:getstatic       #342 <Field EventType AssetUpdateProgressEvent>
	// 1143 2664:aastore         
	// 1144 2665:dup             
	// 1145 2666:bipush          59
	// 1146 2668:getstatic       #345 <Field EventType AssetVolumeEvent>
	// 1147 2671:aastore         
	// 1148 2672:dup             
	// 1149 2673:bipush          60
	// 1150 2675:getstatic       #348 <Field EventType AssetWetnessLevelEvent>
	// 1151 2678:aastore         
	// 1152 2679:dup             
	// 1153 2680:bipush          61
	// 1154 2682:getstatic       #351 <Field EventType AssetWifiLogFinishedEvent>
	// 1155 2685:aastore         
	// 1156 2686:dup             
	// 1157 2687:bipush          62
	// 1158 2689:getstatic       #354 <Field EventType AssetWifiLogEvent>
	// 1159 2692:aastore         
	// 1160 2693:dup             
	// 1161 2694:bipush          63
	// 1162 2696:getstatic       #357 <Field EventType AssetWifiSignalStrengthEvent>
	// 1163 2699:aastore         
	// 1164 2700:dup             
	// 1165 2701:bipush          64
	// 1166 2703:getstatic       #360 <Field EventType AvailableSettingsEvent>
	// 1167 2706:aastore         
	// 1168 2707:dup             
	// 1169 2708:bipush          65
	// 1170 2710:getstatic       #363 <Field EventType AwsCloudEnvironmentEvent>
	// 1171 2713:aastore         
	// 1172 2714:dup             
	// 1173 2715:bipush          66
	// 1174 2717:getstatic       #366 <Field EventType BadAssetPasswordEvent>
	// 1175 2720:aastore         
	// 1176 2721:dup             
	// 1177 2722:bipush          67
	// 1178 2724:getstatic       #369 <Field EventType BlackBoxAssetEvacuationCountEvent>
	// 1179 2727:aastore         
	// 1180 2728:dup             
	// 1181 2729:bipush          68
	// 1182 2731:getstatic       #372 <Field EventType BraavaMissionStatusEvent>
	// 1183 2734:aastore         
	// 1184 2735:dup             
	// 1185 2736:bipush          69
	// 1186 2738:getstatic       #375 <Field EventType BugReportEvent>
	// 1187 2741:aastore         
	// 1188 2742:dup             
	// 1189 2743:bipush          70
	// 1190 2745:getstatic       #378 <Field EventType CertificateErrorEvent>
	// 1191 2748:aastore         
	// 1192 2749:dup             
	// 1193 2750:bipush          71
	// 1194 2752:getstatic       #381 <Field EventType CheckSsidReportEvent>
	// 1195 2755:aastore         
	// 1196 2756:dup             
	// 1197 2757:bipush          72
	// 1198 2759:getstatic       #384 <Field EventType ConnectFailureEvent>
	// 1199 2762:aastore         
	// 1200 2763:dup             
	// 1201 2764:bipush          73
	// 1202 2766:getstatic       #387 <Field EventType ConnectionStateEvent>
	// 1203 2769:aastore         
	// 1204 2770:dup             
	// 1205 2771:bipush          74
	// 1206 2773:getstatic       #390 <Field EventType CurrentConnectionStateEvent>
	// 1207 2776:aastore         
	// 1208 2777:dup             
	// 1209 2778:bipush          75
	// 1210 2780:getstatic       #393 <Field EventType DataDeserializationErrorEvent>
	// 1211 2783:aastore         
	// 1212 2784:dup             
	// 1213 2785:bipush          76
	// 1214 2787:getstatic       #396 <Field EventType DiscoveredAssetsUpdatedEvent>
	// 1215 2790:aastore         
	// 1216 2791:dup             
	// 1217 2792:bipush          77
	// 1218 2794:getstatic       #399 <Field EventType DiscoveryStatusEvent>
	// 1219 2797:aastore         
	// 1220 2798:dup             
	// 1221 2799:bipush          78
	// 1222 2801:getstatic       #402 <Field EventType DockEvacuationHistoryEvent>
	// 1223 2804:aastore         
	// 1224 2805:dup             
	// 1225 2806:bipush          79
	// 1226 2808:getstatic       #405 <Field EventType EchoEvent>
	// 1227 2811:aastore         
	// 1228 2812:dup             
	// 1229 2813:bipush          80
	// 1230 2815:getstatic       #408 <Field EventType ExpeditedOtaStatusEvent>
	// 1231 2818:aastore         
	// 1232 2819:dup             
	// 1233 2820:bipush          81
	// 1234 2822:getstatic       #411 <Field EventType ForcefulDisconnectEvent>
	// 1235 2825:aastore         
	// 1236 2826:dup             
	// 1237 2827:bipush          82
	// 1238 2829:getstatic       #414 <Field EventType FloorListEvent>
	// 1239 2832:aastore         
	// 1240 2833:dup             
	// 1241 2834:bipush          83
	// 1242 2836:getstatic       #417 <Field EventType GenericEvent>
	// 1243 2839:aastore         
	// 1244 2840:dup             
	// 1245 2841:bipush          84
	// 1246 2843:getstatic       #420 <Field EventType LatestAppVersionEvent>
	// 1247 2846:aastore         
	// 1248 2847:dup             
	// 1249 2848:bipush          85
	// 1250 2850:getstatic       #423 <Field EventType LocalOtaStatusEvent>
	// 1251 2853:aastore         
	// 1252 2854:dup             
	// 1253 2855:bipush          86
	// 1254 2857:getstatic       #426 <Field EventType MapUploadAllowedEvent>
	// 1255 2860:aastore         
	// 1256 2861:dup             
	// 1257 2862:bipush          87
	// 1258 2864:getstatic       #429 <Field EventType MissionMapEvent>
	// 1259 2867:aastore         
	// 1260 2868:dup             
	// 1261 2869:bipush          88
	// 1262 2871:getstatic       #432 <Field EventType MissionRuntimeEChartEvent>
	// 1263 2874:aastore         
	// 1264 2875:dup             
	// 1265 2876:bipush          89
	// 1266 2878:getstatic       #435 <Field EventType MissionsAreaCleanedEChartEvent>
	// 1267 2881:aastore         
	// 1268 2882:dup             
	// 1269 2883:bipush          90
	// 1270 2885:getstatic       #438 <Field EventType MqttConnectionAcknowledgementEvent>
	// 1271 2888:aastore         
	// 1272 2889:dup             
	// 1273 2890:bipush          91
	// 1274 2892:getstatic       #441 <Field EventType NetworkAddressEvent>
	// 1275 2895:aastore         
	// 1276 2896:dup             
	// 1277 2897:bipush          92
	// 1278 2899:getstatic       #444 <Field EventType NetworkDiagnosticEvent>
	// 1279 2902:aastore         
	// 1280 2903:dup             
	// 1281 2904:bipush          93
	// 1282 2906:getstatic       #447 <Field EventType NetworkErrorEvent>
	// 1283 2909:aastore         
	// 1284 2910:dup             
	// 1285 2911:bipush          94
	// 1286 2913:getstatic       #450 <Field EventType NotificationCenterEvent>
	// 1287 2916:aastore         
	// 1288 2917:dup             
	// 1289 2918:bipush          95
	// 1290 2920:getstatic       #453 <Field EventType NtpTimeEvent>
	// 1291 2923:aastore         
	// 1292 2924:dup             
	// 1293 2925:bipush          96
	// 1294 2927:getstatic       #456 <Field EventType OnDemandOTAAvailabilityEvent>
	// 1295 2930:aastore         
	// 1296 2931:dup             
	// 1297 2932:bipush          97
	// 1298 2934:getstatic       #459 <Field EventType PasswordRequestErrorEvent>
	// 1299 2937:aastore         
	// 1300 2938:dup             
	// 1301 2939:bipush          98
	// 1302 2941:getstatic       #462 <Field EventType PersistentMapEvent>
	// 1303 2944:aastore         
	// 1304 2945:dup             
	// 1305 2946:bipush          99
	// 1306 2948:getstatic       #465 <Field EventType PersistentMapInfoTableEvent>
	// 1307 2951:aastore         
	// 1308 2952:dup             
	// 1309 2953:bipush          100
	// 1310 2955:getstatic       #468 <Field EventType PersistentMapSettingsEvent>
	// 1311 2958:aastore         
	// 1312 2959:dup             
	// 1313 2960:bipush          101
	// 1314 2962:getstatic       #471 <Field EventType PersistentMapVersionInfoEvent>
	// 1315 2965:aastore         
	// 1316 2966:dup             
	// 1317 2967:bipush          102
	// 1318 2969:getstatic       #474 <Field EventType PushNotificationGetSettingsFailedEvent>
	// 1319 2972:aastore         
	// 1320 2973:dup             
	// 1321 2974:bipush          103
	// 1322 2976:getstatic       #477 <Field EventType PushNotificationSettingFailedEvent>
	// 1323 2979:aastore         
	// 1324 2980:dup             
	// 1325 2981:bipush          104
	// 1326 2983:getstatic       #480 <Field EventType PushNotificationSettingsEvent>
	// 1327 2986:aastore         
	// 1328 2987:dup             
	// 1329 2988:bipush          105
	// 1330 2990:getstatic       #483 <Field EventType PushRegistrationStatusEvent>
	// 1331 2993:aastore         
	// 1332 2994:dup             
	// 1333 2995:bipush          106
	// 1334 2997:getstatic       #486 <Field EventType RawRobotNameEvent>
	// 1335 3000:aastore         
	// 1336 3001:dup             
	// 1337 3002:bipush          107
	// 1338 3004:getstatic       #489 <Field EventType RemoveRobotEvent>
	// 1339 3007:aastore         
	// 1340 3008:dup             
	// 1341 3009:bipush          108
	// 1342 3011:getstatic       #492 <Field EventType RequestOtaStatusEvent>
	// 1343 3014:aastore         
	// 1344 3015:dup             
	// 1345 3016:bipush          109
	// 1346 3018:getstatic       #495 <Field EventType ResetAssetPartEvent>
	// 1347 3021:aastore         
	// 1348 3022:dup             
	// 1349 3023:bipush          110
	// 1350 3025:getstatic       #498 <Field EventType ResetRobotEvent>
	// 1351 3028:aastore         
	// 1352 3029:dup             
	// 1353 3030:bipush          111
	// 1354 3032:getstatic       #501 <Field EventType ResolvedMissionStatusEvent>
	// 1355 3035:aastore         
	// 1356 3036:dup             
	// 1357 3037:bipush          112
	// 1358 3039:getstatic       #504 <Field EventType RobotAudioPlayingEvent>
	// 1359 3042:aastore         
	// 1360 3043:dup             
	// 1361 3044:bipush          113
	// 1362 3046:getstatic       #507 <Field EventType RobotBatteryLevelEvent>
	// 1363 3049:aastore         
	// 1364 3050:dup             
	// 1365 3051:bipush          114
	// 1366 3053:getstatic       #510 <Field EventType RobotBinFullEvent>
	// 1367 3056:aastore         
	// 1368 3057:dup             
	// 1369 3058:bipush          115
	// 1370 3060:getstatic       #513 <Field EventType RobotBinRemovalEvent>
	// 1371 3063:aastore         
	// 1372 3064:dup             
	// 1373 3065:bipush          116
	// 1374 3067:getstatic       #516 <Field EventType RobotDockEvent>
	// 1375 3070:aastore         
	// 1376 3071:dup             
	// 1377 3072:bipush          117
	// 1378 3074:getstatic       #519 <Field EventType RobotErrorEvent>
	// 1379 3077:aastore         
	// 1380 3078:dup             
	// 1381 3079:bipush          118
	// 1382 3081:getstatic       #522 <Field EventType RobotLanguageEvent>
	// 1383 3084:aastore         
	// 1384 3085:dup             
	// 1385 3086:bipush          119
	// 1386 3088:getstatic       #525 <Field EventType RobotLanguagesAvailableEvent>
	// 1387 3091:aastore         
	// 1388 3092:dup             
	// 1389 3093:bipush          120
	// 1390 3095:getstatic       #528 <Field EventType RobotMissionAreaCoveredEvent>
	// 1391 3098:aastore         
	// 1392 3099:dup             
	// 1393 3100:bipush          121
	// 1394 3102:getstatic       #531 <Field EventType RobotMissionHistoryEvent>
	// 1395 3105:aastore         
	// 1396 3106:dup             
	// 1397 3107:bipush          122
	// 1398 3109:getstatic       #534 <Field EventType RobotMissionHistoryScreenshotEvent>
	// 1399 3112:aastore         
	// 1400 3113:dup             
	// 1401 3114:bipush          123
	// 1402 3116:getstatic       #537 <Field EventType RobotMissionStatusEvent>
	// 1403 3119:aastore         
	// 1404 3120:dup             
	// 1405 3121:bipush          124
	// 1406 3123:getstatic       #540 <Field EventType RobotMultiScheduleEvent>
	// 1407 3126:aastore         
	// 1408 3127:dup             
	// 1409 3128:bipush          125
	// 1410 3130:getstatic       #543 <Field EventType RobotNameEvent>
	// 1411 3133:aastore         
	// 1412 3134:dup             
	// 1413 3135:bipush          126
	// 1414 3137:getstatic       #546 <Field EventType RobotPadCategoryEvent>
	// 1415 3140:aastore         
	// 1416 3141:dup             
	// 1417 3142:bipush          127
	// 1418 3144:getstatic       #549 <Field EventType RobotPasswordEvent>
	// 1419 3147:aastore         
	// 1420 3148:dup             
	// 1421 3149:sipush          128
	// 1422 3152:getstatic       #552 <Field EventType RobotPoseEvent>
	// 1423 3155:aastore         
	// 1424 3156:dup             
	// 1425 3157:sipush          129
	// 1426 3160:getstatic       #555 <Field EventType RobotPreferencesEvent>
	// 1427 3163:aastore         
	// 1428 3164:dup             
	// 1429 3165:sipush          130
	// 1430 3168:getstatic       #558 <Field EventType RobotReadinessEvent>
	// 1431 3171:aastore         
	// 1432 3172:dup             
	// 1433 3173:sipush          131
	// 1434 3176:getstatic       #561 <Field EventType RobotRoomConfinementEvent>
	// 1435 3179:aastore         
	// 1436 3180:dup             
	// 1437 3181:sipush          132
	// 1438 3184:getstatic       #564 <Field EventType RobotScheduleEvent>
	// 1439 3187:aastore         
	// 1440 3188:dup             
	// 1441 3189:sipush          133
	// 1442 3192:getstatic       #567 <Field EventType RobotTimeZoneEvent>
	// 1443 3195:aastore         
	// 1444 3196:dup             
	// 1445 3197:sipush          134
	// 1446 3200:getstatic       #570 <Field EventType RobotAttachedPadWetnessEvent>
	// 1447 3203:aastore         
	// 1448 3204:dup             
	// 1449 3205:sipush          135
	// 1450 3208:getstatic       #573 <Field EventType RobotPadWetnessEvent>
	// 1451 3211:aastore         
	// 1452 3212:dup             
	// 1453 3213:sipush          136
	// 1454 3216:getstatic       #576 <Field EventType RobotRankOverlapEvent>
	// 1455 3219:aastore         
	// 1456 3220:dup             
	// 1457 3221:sipush          137
	// 1458 3224:getstatic       #579 <Field EventType RobotTankLevelEvent>
	// 1459 3227:aastore         
	// 1460 3228:dup             
	// 1461 3229:sipush          138
	// 1462 3232:getstatic       #582 <Field EventType ScheduleTypeSupportedEvent>
	// 1463 3235:aastore         
	// 1464 3236:dup             
	// 1465 3237:sipush          139
	// 1466 3240:getstatic       #585 <Field EventType SoftApStatusEvent>
	// 1467 3243:aastore         
	// 1468 3244:dup             
	// 1469 3245:sipush          140
	// 1470 3248:getstatic       #588 <Field EventType SubProtocolConnectionStateEvent>
	// 1471 3251:aastore         
	// 1472 3252:dup             
	// 1473 3253:sipush          141
	// 1474 3256:getstatic       #591 <Field EventType TimeoutEvent>
	// 1475 3259:aastore         
	// 1476 3260:dup             
	// 1477 3261:sipush          142
	// 1478 3264:getstatic       #594 <Field EventType UmfDataMissingEvent>
	// 1479 3267:aastore         
	// 1480 3268:dup             
	// 1481 3269:sipush          143
	// 1482 3272:getstatic       #597 <Field EventType UmfParsingErrorEvent>
	// 1483 3275:aastore         
	// 1484 3276:dup             
	// 1485 3277:sipush          144
	// 1486 3280:getstatic       #600 <Field EventType UnauthenticatedConnectionStateEvent>
	// 1487 3283:aastore         
	// 1488 3284:dup             
	// 1489 3285:sipush          145
	// 1490 3288:getstatic       #603 <Field EventType WifiConfigEvent>
	// 1491 3291:aastore         
	// 1492 3292:dup             
	// 1493 3293:sipush          146
	// 1494 3296:getstatic       #606 <Field EventType WifiProvisioningErrorEvent>
	// 1495 3299:aastore         
	// 1496 3300:dup             
	// 1497 3301:sipush          147
	// 1498 3304:getstatic       #609 <Field EventType AccountConsentDateUpdateFailedEvent>
	// 1499 3307:aastore         
	// 1500 3308:dup             
	// 1501 3309:sipush          148
	// 1502 3312:getstatic       #612 <Field EventType AccountConsentDateUpdatedEvent>
	// 1503 3315:aastore         
	// 1504 3316:dup             
	// 1505 3317:sipush          149
	// 1506 3320:getstatic       #615 <Field EventType PMapLearningAllowedEvent>
	// 1507 3323:aastore         
	// 1508 3324:dup             
	// 1509 3325:sipush          150
	// 1510 3328:getstatic       #618 <Field EventType DuplicateAssetStatusChangedEvent>
	// 1511 3331:aastore         
	// 1512 3332:putstatic       #620 <Field EventType[] $VALUES>
	//*1513 3335:return          
	}
}
