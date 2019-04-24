// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


// Referenced classes of package com.irobot.core:
//			AssetAccumulatedHistoryEvent, AssetAudioVersionEvent, AssetBatteryTypeEvent, AssetCloudConfigEvent, 
//			AssetGenericEvent, AssetLocationCountryEvent, AssetLocationPostalCodeEvent, AssetMissingEvent, 
//			AssetNetworkSettingsEvent, AssetNetworkStatusEvent, AssetOtaUpdateStatusEvent, AssetRegistrationDateEvent, 
//			AssetSkuEvent, AssetSkuFailureEvent, AssetSoftwareLastUpdatedEvent, AssetSoftwareVersionEvent, 
//			AssetTimeEvent, AssetUmiVersionEvent, AssetWifiSignalStrengthEvent, BadAssetPasswordEvent, 
//			CertificateErrorEvent, ConnectFailureEvent, ConnectionStateEvent, RobotAudioPlayingEvent, 
//			RobotBatteryLevelEvent, RobotBinFullEvent, RobotBinRemovalEvent, RobotDockEvent, 
//			RobotErrorEvent, RobotLanguageEvent, RobotLanguagesAvailableEvent, RobotMissionAreaCoveredEvent, 
//			RobotMissionHistoryEvent, RobotMissionStatusEvent, RobotNameEvent, RobotPasswordEvent, 
//			RobotPoseEvent, RobotPreferencesEvent, RobotReadinessEvent, RobotScheduleEvent, 
//			RobotTimeZoneEvent, WifiConfigEvent

public abstract class EventReceiver
{

	public EventReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void onAssetAccumulatedHistoryEvent(AssetAccumulatedHistoryEvent assetaccumulatedhistoryevent);

	public abstract void onAssetAudioVersionEvent(AssetAudioVersionEvent assetaudioversionevent);

	public abstract void onAssetBatteryTypeEvent(AssetBatteryTypeEvent assetbatterytypeevent);

	public abstract void onAssetCloudConfigEvent(AssetCloudConfigEvent assetcloudconfigevent);

	public abstract void onAssetGenericEvent(AssetGenericEvent assetgenericevent);

	public abstract void onAssetLocationCountryEvent(AssetLocationCountryEvent assetlocationcountryevent);

	public abstract void onAssetLocationPostalCodeEvent(AssetLocationPostalCodeEvent assetlocationpostalcodeevent);

	public abstract void onAssetMissingEvent(AssetMissingEvent assetmissingevent);

	public abstract void onAssetNetworkSettingsEvent(AssetNetworkSettingsEvent assetnetworksettingsevent);

	public abstract void onAssetNetworkStatusEvent(AssetNetworkStatusEvent assetnetworkstatusevent);

	public abstract void onAssetOtaUpdateStatusEvent(AssetOtaUpdateStatusEvent assetotaupdatestatusevent);

	public abstract void onAssetRegistrationDateEvent(AssetRegistrationDateEvent assetregistrationdateevent);

	public abstract void onAssetSkuEvent(AssetSkuEvent assetskuevent);

	public abstract void onAssetSkuFailureEvent(AssetSkuFailureEvent assetskufailureevent);

	public abstract void onAssetSoftwareLastUpdatedEvent(AssetSoftwareLastUpdatedEvent assetsoftwarelastupdatedevent);

	public abstract void onAssetSoftwareVersionEvent(AssetSoftwareVersionEvent assetsoftwareversionevent);

	public abstract void onAssetTimeEvent(AssetTimeEvent assettimeevent);

	public abstract void onAssetUmiVersionEvent(AssetUmiVersionEvent assetumiversionevent);

	public abstract void onAssetWifiSignalStrengthEvent(AssetWifiSignalStrengthEvent assetwifisignalstrengthevent);

	public abstract void onBadAssetPasswordEvent(BadAssetPasswordEvent badassetpasswordevent);

	public abstract void onCertificateErrorEvent(CertificateErrorEvent certificateerrorevent);

	public abstract void onConnectFailureEvent(ConnectFailureEvent connectfailureevent);

	public abstract void onConnectionStateEvent(ConnectionStateEvent connectionstateevent);

	public abstract void onRobotAudioPlayingEvent(RobotAudioPlayingEvent robotaudioplayingevent);

	public abstract void onRobotBatteryLevelEvent(RobotBatteryLevelEvent robotbatterylevelevent);

	public abstract void onRobotBinFullEvent(RobotBinFullEvent robotbinfullevent);

	public abstract void onRobotBinRemovalEvent(RobotBinRemovalEvent robotbinremovalevent);

	public abstract void onRobotDockEvent(RobotDockEvent robotdockevent);

	public abstract void onRobotErrorEvent(RobotErrorEvent roboterrorevent);

	public abstract void onRobotLanguageEvent(RobotLanguageEvent robotlanguageevent);

	public abstract void onRobotLanguagesAvailableEvent(RobotLanguagesAvailableEvent robotlanguagesavailableevent);

	public abstract void onRobotMissionAreaCoveredEvent(RobotMissionAreaCoveredEvent robotmissionareacoveredevent);

	public abstract void onRobotMissionHistoryEvent(RobotMissionHistoryEvent robotmissionhistoryevent);

	public abstract void onRobotMissionStatusEvent(RobotMissionStatusEvent robotmissionstatusevent);

	public abstract void onRobotNameEvent(RobotNameEvent robotnameevent);

	public abstract void onRobotPasswordEvent(RobotPasswordEvent robotpasswordevent);

	public abstract void onRobotPoseEvent(RobotPoseEvent robotposeevent);

	public abstract void onRobotPreferencesEvent(RobotPreferencesEvent robotpreferencesevent);

	public abstract void onRobotReadinessEvent(RobotReadinessEvent robotreadinessevent);

	public abstract void onRobotScheduleEvent(RobotScheduleEvent robotscheduleevent);

	public abstract void onRobotTimeZoneEvent(RobotTimeZoneEvent robottimezoneevent);

	public abstract void onWifiConfigEvent(WifiConfigEvent wificonfigevent);
}
