// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AnalyticsSubsystem, AnalyticsType, BaseAnalyticsHandler, AnalyticsEvent, 
//			AccountError, ContactType, AssetInfo, RobotPadCategory, 
//			RobotCareType, CarpetBoostMode, ScheduleMultipleMappingType, ScheduleLocationType, 
//			MultiPassMode, CleanPresetType, CommandType, EnjoyingAppPromptResponse, 
//			HelpDocumentType, HelpVideoType, RobotMissionHistoryCompletionStatus, SatisfactionRating, 
//			PushNotificationSetting, OnDemandOtaPath, AddRobotSelection, BleDiscoveryResult, 
//			ProvisioningStep, ProvisioningType, WifiProvisioningStatus, V1ProvisioningError, 
//			ViewId

private static final class AnalyticsSubsystem$CppProxy extends AnalyticsSubsystem
{

	private native void nativeDestroy(long l);

	private native void native_addAnalyticsHandler(long l, AnalyticsType analyticstype, BaseAnalyticsHandler baseanalyticshandler);

	private native void native_addDeviceTokenData(long l, byte abyte0[]);

	private native void native_flushMessages(long l);

	private native String native_nameForAnalyticsEvent(long l, AnalyticsEvent analyticsevent);

	private native void native_trackAboutThisAppFollowButtonPressed(long l);

	private native void native_trackAccountError(long l, int i, String s, String s1, boolean flag);

	private native void native_trackAccountInfoRequestFinished(long l, int i, int j);

	private native int native_trackAccountInfoRequestStarted(long l);

	private native void native_trackAccountProfileUpdated(long l);

	private native void native_trackAccountServiceUnavailableDialogViewed(long l, AccountError accounterror);

	private native void native_trackAdditionalHelpContactButtonPressed(long l, ContactType contacttype);

	private native void native_trackAnyCommonQuestionsOpened(long l, AssetInfo assetinfo);

	private native void native_trackAppBackgrounded(long l);

	private native void native_trackAppFeedbackResponseCancelled(long l);

	private native void native_trackAppFeedbackResponseGiven(long l, String s);

	private native void native_trackAppForegrounded(long l);

	private native void native_trackAppLanguageCode(long l, String s);

	private native void native_trackAppLaunched(long l, boolean flag, ArrayList arraylist);

	private native void native_trackAppLaunchedAfterAppInstall(long l);

	private native void native_trackAppLaunchedAfterAppUpgrade(long l);

	private native void native_trackAppServiceDiscoveryFinished(long l, int i, int j);

	private native int native_trackAppServiceDiscoveryStarted(long l);

	private native void native_trackAssetRegistrationWithCloudFinished(long l, AssetInfo assetinfo);

	private native void native_trackAssetRegistrationWithCloudStarted(long l);

	private native void native_trackAssetServiceDiscoveryFinished(long l, int i, boolean flag);

	private native int native_trackAssetServiceDiscoveryStarted(long l);

	private native void native_trackBadgedAppOpened(long l);

	private native void native_trackBetaProgramFeedbackSubmitted(long l, String s, String s1);

	private native void native_trackBetaProgramIWantInButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackBetaProgramThreeDotsButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackBraavaPadOptionsChanged(long l, AssetInfo assetinfo, RobotPadCategory robotpadcategory, int i);

	private native void native_trackBraavaSpotCleanPressed(long l, AssetInfo assetinfo);

	private native void native_trackBraavaStoreButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackCareResetStatusButtonPressed(long l, AssetInfo assetinfo, RobotCareType robotcaretype);

	private native void native_trackCareStepByStepGuideViewed(long l, AssetInfo assetinfo, RobotCareType robotcaretype);

	private native void native_trackCarpetBoostSettingChanged(long l, AssetInfo assetinfo, CarpetBoostMode carpetboostmode);

	private native void native_trackChooseRoomsButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackCleanButtonIntro1CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackCleanButtonIntro1NextButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackCleanButtonIntro2CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackCleanButtonIntro2CompleteButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackCleanMapEnabledSettingChanged(long l, AssetInfo assetinfo, boolean flag);

	private native void native_trackCleanMapInteractionFinished(long l, AssetInfo assetinfo, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
			boolean flag4);

	private native void native_trackCleanMapInteractionStarted(long l);

	private native void native_trackCleanScheduleTwoAddPressed(long l, AssetInfo assetinfo);

	private native void native_trackCleanScheduleTwoExistingScheduleDeleted(long l, AssetInfo assetinfo);

	private native void native_trackCleanScheduleTwoExistingScheduleEdited(long l, AssetInfo assetinfo, ScheduleMultipleMappingType schedulemultiplemappingtype, int i, int j, ArrayList arraylist, 
			ScheduleLocationType schedulelocationtype, HashMap hashmap);

	private native void native_trackCleanScheduleTwoExistingScheduleToggled(long l, AssetInfo assetinfo, boolean flag);

	private native void native_trackCleanScheduleTwoNewScheduleCreated(long l, AssetInfo assetinfo, ScheduleMultipleMappingType schedulemultiplemappingtype, int i, int j, ArrayList arraylist, 
			ScheduleLocationType schedulelocationtype, HashMap hashmap);

	private native void native_trackCleanScheduleTwoPopularPressed(long l, AssetInfo assetinfo);

	private native void native_trackCleanScheduleTwoSchedulesDeletedFromPMAPSChange(long l, AssetInfo assetinfo, int i);

	private native void native_trackCleanScheduleTwoTimeoutError(long l, AssetInfo assetinfo, String s);

	private native void native_trackCleanScheduleTwoUpdateFinished(long l, AssetInfo assetinfo, String s);

	private native void native_trackCleanScheduleTwoUpdateStarted(long l);

	private native void native_trackCleanScreenErrorIndicatorPressed(long l, AssetInfo assetinfo);

	private native void native_trackCleaningPassesSettingChanged(long l, AssetInfo assetinfo, MultiPassMode multipassmode);

	private native void native_trackCleaningPreferencesDefaultsRestored(long l, AssetInfo assetinfo);

	private native void native_trackCleaningPreferencesView(long l, AssetInfo assetinfo);

	private native void native_trackCleaningPresetSettingChanged(long l, AssetInfo assetinfo, CleanPresetType cleanpresettype);

	private native void native_trackCloudButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackCommandTimedOut(long l, AssetInfo assetinfo, CommandType commandtype);

	private native void native_trackCountryPickerSelection(long l, String s);

	private native void native_trackDirectedRoomCleaningStarted(long l, AssetInfo assetinfo);

	private native void native_trackEdgeCleanSettingChanged(long l, AssetInfo assetinfo, boolean flag);

	private native void native_trackEnjoyingAppPromptResponseGiven(long l, EnjoyingAppPromptResponse enjoyingapppromptresponse);

	private native void native_trackEvacuationDockEmptyBinButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackEvacuationDockErrorHelpContentViewed(long l, AssetInfo assetinfo, String s);

	private native void native_trackExpeditedOtaRequested(long l, AssetInfo assetinfo);

	private native void native_trackFinishWhenBinFullSettingChanged(long l, AssetInfo assetinfo, boolean flag);

	private native void native_trackHeartBeatMissed(long l, AssetInfo assetinfo);

	private native void native_trackHelpDocumentViewed(long l, AssetInfo assetinfo, HelpDocumentType helpdocumenttype);

	private native void native_trackHelpVideoWatched(long l, AssetInfo assetinfo, HelpVideoType helpvideotype);

	private native void native_trackHistoryDetailErrorIndicatorPressed(long l, AssetInfo assetinfo);

	private native void native_trackHistoryDetailView(long l, AssetInfo assetinfo, RobotMissionHistoryCompletionStatus robotmissionhistorycompletionstatus, boolean flag, int i, int j);

	private native void native_trackHistoryMissionMapRated(long l, AssetInfo assetinfo, int i, String s, SatisfactionRating satisfactionrating);

	private native void native_trackHistoryProvideFeedbackButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackHistorySummaryTabChanged(long l);

	private native void native_trackHistorySummaryView(long l, AssetInfo assetinfo, int i);

	private native void native_trackIsLegacyUser(long l, boolean flag);

	private native void native_trackLeaveBetaProgramConfirmationButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackLifetimeHistoryInfoButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackLocalOtaFirmwareUpdateFinished(long l, AssetInfo assetinfo, int i);

	private native void native_trackLocalOtaFirmwareUpdateStarted(long l);

	private native void native_trackLocateRoombaButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackManualCleanMissionStarted(long l, AssetInfo assetinfo);

	private native void native_trackNetworkingStatistics(long l);

	private native void native_trackNewAppVersionAvailableSkipClicked(long l, String s);

	private native void native_trackNewAppVersionAvailableUpdateClicked(long l, String s);

	private native void native_trackNewAppVersionAvailableViewed(long l, String s);

	private native void native_trackNotificationBackSelected(long l, AssetInfo assetinfo, String s, int i, int j);

	private native void native_trackNotificationCenterBellIconPressed(long l, AssetInfo assetinfo, boolean flag);

	private native void native_trackNotificationCenterVideoViewed(long l, AssetInfo assetinfo, String s, int i, int j);

	private native void native_trackNotificationCenterViewed(long l, AssetInfo assetinfo, int i);

	private native void native_trackNotificationFeedback(long l, AssetInfo assetinfo, boolean flag, String s, int i, int j);

	private native void native_trackNotificationSelected(long l, AssetInfo assetinfo, String s, int i, int j);

	private native void native_trackNotificationSettingChanged(long l, PushNotificationSetting pushnotificationsetting);

	private native void native_trackNotificationSmartScheduleAccepted(long l, AssetInfo assetinfo, String s, int i, String s1);

	private native void native_trackNotificationSmartScheduleBackSelected(long l, AssetInfo assetinfo, String s, int i, String s1);

	private native void native_trackNotificationSmartScheduleDeclined(long l, AssetInfo assetinfo, String s, int i, String s1);

	private native void native_trackNotificationSmartScheduleMessageSelected(long l, AssetInfo assetinfo, String s, int i, String s1);

	private native void native_trackOnDemandOtaAvailableHelpButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaAvailableViewed(long l, AssetInfo assetinfo, OnDemandOtaPath ondemandotapath);

	private native void native_trackOnDemandOtaFailedHelpButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaFailedTryAgainButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaFailedUpdateLaterButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaFirmwareUpdateAvailableFinished(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaFirmwareUpdateAvailableStarted(long l);

	private native void native_trackOnDemandOtaFirmwareUpdateError(long l, AssetInfo assetinfo, int i);

	private native void native_trackOnDemandOtaFirmwareUpdateInstallingFinished(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaFirmwareUpdateInstallingStarted(long l);

	private native void native_trackOnDemandOtaFirmwareUpdateLoadingFinished(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaFirmwareUpdateLoadingStarted(long l);

	private native void native_trackOnDemandOtaFirmwareUpdateReadyFinished(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaFirmwareUpdateReadyStarted(long l);

	private native void native_trackOnDemandOtaFirmwareUpdateSuccessFinished(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaFirmwareUpdateSuccessStarted(long l);

	private native void native_trackOnDemandOtaInProgressHelpButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaInProgressViewed(long l, AssetInfo assetinfo, OnDemandOtaPath ondemandotapath);

	private native void native_trackOnDemandOtaUpdateLaterButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackOnDemandOtaUpdateNowButtonPressed(long l, AssetInfo assetinfo, OnDemandOtaPath ondemandotapath);

	private native void native_trackOnboardingBegan(long l, boolean flag);

	private native void native_trackPMapCustomizeCompleteCleanButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapCustomizeCompleteScheduleButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapCustomizeLabelRoomsCancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapCustomizeLabelRoomsDoneButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapCustomizeNameMapCancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapCustomizeNameMapNextButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapCustomizeSetupRoomsCancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapCustomizeSetupRoomsNextButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapErrorEmptyMap(long l, AssetInfo assetinfo);

	private native void native_trackPMapErrorRoomTooSmall(long l, AssetInfo assetinfo);

	private native void native_trackPMapErrorSaveFloorNameTimedOut(long l, AssetInfo assetinfo);

	private native void native_trackPMapErrorSaveTimedOut(long l, AssetInfo assetinfo);

	private native void native_trackPMapErrorSegmentationTransferFailed(long l, AssetInfo assetinfo);

	private native void native_trackPMapErrorSplitInvalidMap(long l, AssetInfo assetinfo);

	private native void native_trackPMapSectionMapListCleanButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapSectionMapListTrainButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapSectionMapPreviewNotRightButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapSectionMapReadyCustomizeButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapSectionMapReadyNotRightButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapTroubleshootIncompleteCleanButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapTroubleshootIncompleteTrainButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapTroubleshootWrongDeleteButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsErrorRegionDuplicatePoints(long l, AssetInfo assetinfo, String s, String s1);

	private native void native_trackPMapsSectionIntro1CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro1NextButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro2CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro2NextButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro3ActivateButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro3CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro4AddTrainingRunButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro4CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro4MaybeLaterButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro5CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntro5StartTrainingRunButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntroCompleteCancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsSectionIntroCompleteTipsButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsTip1CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsTip1NextButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsTip2CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsTip2NextButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsTip3CancelButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackPMapsTip3CompleteButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackProvAddRobotSelected(long l, AddRobotSelection addrobotselection);

	private native void native_trackProvBleDiscoveryPageResult(long l, BleDiscoveryResult blediscoveryresult);

	private native void native_trackProvCancelButtonPressed(long l, ProvisioningStep provisioningstep);

	private native void native_trackProvError(long l, ProvisioningType provisioningtype, AssetInfo assetinfo, int i);

	private native void native_trackProvFinished(long l, ProvisioningType provisioningtype, AssetInfo assetinfo);

	private native void native_trackProvInfoButtonPressed(long l, ProvisioningStep provisioningstep);

	private native void native_trackProvRobotNameDone(long l, boolean flag);

	private native void native_trackProvStarted(long l, ProvisioningType provisioningtype, AssetInfo assetinfo);

	private native void native_trackProvStatus(long l, ProvisioningType provisioningtype, AssetInfo assetinfo, WifiProvisioningStatus wifiprovisioningstatus);

	private native void native_trackProvStepViewed(long l, ProvisioningStep provisioningstep);

	private native void native_trackProvWifiPasswordDone(long l, boolean flag);

	private native void native_trackReActivateAppOverviewPressed(long l, AssetInfo assetinfo);

	private native void native_trackReAddRobotPressedAfterBlidHealing(long l);

	private native void native_trackRobotAdded(long l, AssetInfo assetinfo);

	private native void native_trackRobotAssetsForUser(long l, ArrayList arraylist);

	private native void native_trackRobotHealedMessageViewed(long l);

	private native void native_trackRobotWelcomeVideoViewFinished(long l, AssetInfo assetinfo);

	private native void native_trackRobotWelcomeVideoViewStarted(long l);

	private native void native_trackRoombaV1ProvisioningError(long l, AssetInfo assetinfo, V1ProvisioningError v1provisioningerror);

	private native void native_trackRoombaV2ProvisioningError(long l, AssetInfo assetinfo, int i);

	private native void native_trackScheduleChanged(long l, AssetInfo assetinfo, HashMap hashmap);

	private native void native_trackSideMenuView(long l);

	private native void native_trackSmartMapsButtonPressed(long l, AssetInfo assetinfo);

	private native void native_trackStoreView(long l);

	private native void native_trackTrainingRunStarted(long l, AssetInfo assetinfo);

	private native void native_trackUserLoggedIn(long l);

	private native void native_trackUserLoggedOut(long l);

	private native void native_trackUserNotificationSettings(long l, ArrayList arraylist);

	private native void native_trackUserTermsLinkPressed(long l);

	private native void native_trackView(long l, ViewId viewid);

	private native void native_trackViewForAsset(long l, ViewId viewid, AssetInfo assetinfo);

	private native void native_trackWifiCoverageToggled(long l, AssetInfo assetinfo, boolean flag);

	private native void native_trackWifiMapFeedbackResponseGiven(long l, float f, float f1, float f2);

	public void addAnalyticsHandler(AnalyticsType analyticstype, BaseAnalyticsHandler baseanalyticshandler)
	{
		native_addAnalyticsHandler(nativeRef, analyticstype, baseanalyticshandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #284 <Method void native_addAnalyticsHandler(long, AnalyticsType, BaseAnalyticsHandler)>
	//    6   10:return          
	}

	public void addDeviceTokenData(byte abyte0[])
	{
		native_addDeviceTokenData(nativeRef, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #288 <Method void native_addDeviceTokenData(long, byte[])>
	//    5    9:return          
	}

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #293 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #295 <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #302 <Method void Object.finalize()>
	//    4    8:return          
	}

	public void flushMessages()
	{
		native_flushMessages(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #305 <Method void native_flushMessages(long)>
	//    4    8:return          
	}

	public String nameForAnalyticsEvent(AnalyticsEvent analyticsevent)
	{
		return native_nameForAnalyticsEvent(nativeRef, analyticsevent);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #309 <Method String native_nameForAnalyticsEvent(long, AnalyticsEvent)>
	//    5    9:areturn         
	}

	public void trackAboutThisAppFollowButtonPressed()
	{
		native_trackAboutThisAppFollowButtonPressed(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #312 <Method void native_trackAboutThisAppFollowButtonPressed(long)>
	//    4    8:return          
	}

	public void trackAccountError(int i, String s, String s1, boolean flag)
	{
		native_trackAccountError(nativeRef, i, s, s1, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #316 <Method void native_trackAccountError(long, int, String, String, boolean)>
	//    8   13:return          
	}

	public void trackAccountInfoRequestFinished(int i, int j)
	{
		native_trackAccountInfoRequestFinished(nativeRef, i, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #320 <Method void native_trackAccountInfoRequestFinished(long, int, int)>
	//    6   10:return          
	}

	public int trackAccountInfoRequestStarted()
	{
		return native_trackAccountInfoRequestStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #324 <Method int native_trackAccountInfoRequestStarted(long)>
	//    4    8:ireturn         
	}

	public void trackAccountProfileUpdated()
	{
		native_trackAccountProfileUpdated(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #327 <Method void native_trackAccountProfileUpdated(long)>
	//    4    8:return          
	}

	public void trackAccountServiceUnavailableDialogViewed(AccountError accounterror)
	{
		native_trackAccountServiceUnavailableDialogViewed(nativeRef, accounterror);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #331 <Method void native_trackAccountServiceUnavailableDialogViewed(long, AccountError)>
	//    5    9:return          
	}

	public void trackAdditionalHelpContactButtonPressed(ContactType contacttype)
	{
		native_trackAdditionalHelpContactButtonPressed(nativeRef, contacttype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #335 <Method void native_trackAdditionalHelpContactButtonPressed(long, ContactType)>
	//    5    9:return          
	}

	public void trackAnyCommonQuestionsOpened(AssetInfo assetinfo)
	{
		native_trackAnyCommonQuestionsOpened(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #339 <Method void native_trackAnyCommonQuestionsOpened(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackAppBackgrounded()
	{
		native_trackAppBackgrounded(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #342 <Method void native_trackAppBackgrounded(long)>
	//    4    8:return          
	}

	public void trackAppFeedbackResponseCancelled()
	{
		native_trackAppFeedbackResponseCancelled(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #345 <Method void native_trackAppFeedbackResponseCancelled(long)>
	//    4    8:return          
	}

	public void trackAppFeedbackResponseGiven(String s)
	{
		native_trackAppFeedbackResponseGiven(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #348 <Method void native_trackAppFeedbackResponseGiven(long, String)>
	//    5    9:return          
	}

	public void trackAppForegrounded()
	{
		native_trackAppForegrounded(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #351 <Method void native_trackAppForegrounded(long)>
	//    4    8:return          
	}

	public void trackAppLanguageCode(String s)
	{
		native_trackAppLanguageCode(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #354 <Method void native_trackAppLanguageCode(long, String)>
	//    5    9:return          
	}

	public void trackAppLaunched(boolean flag, ArrayList arraylist)
	{
		native_trackAppLaunched(nativeRef, flag, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #358 <Method void native_trackAppLaunched(long, boolean, ArrayList)>
	//    6   10:return          
	}

	public void trackAppLaunchedAfterAppInstall()
	{
		native_trackAppLaunchedAfterAppInstall(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #363 <Method void native_trackAppLaunchedAfterAppInstall(long)>
	//    4    8:return          
	}

	public void trackAppLaunchedAfterAppUpgrade()
	{
		native_trackAppLaunchedAfterAppUpgrade(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #366 <Method void native_trackAppLaunchedAfterAppUpgrade(long)>
	//    4    8:return          
	}

	public void trackAppServiceDiscoveryFinished(int i, int j)
	{
		native_trackAppServiceDiscoveryFinished(nativeRef, i, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #369 <Method void native_trackAppServiceDiscoveryFinished(long, int, int)>
	//    6   10:return          
	}

	public int trackAppServiceDiscoveryStarted()
	{
		return native_trackAppServiceDiscoveryStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #372 <Method int native_trackAppServiceDiscoveryStarted(long)>
	//    4    8:ireturn         
	}

	public void trackAssetRegistrationWithCloudFinished(AssetInfo assetinfo)
	{
		native_trackAssetRegistrationWithCloudFinished(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #375 <Method void native_trackAssetRegistrationWithCloudFinished(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackAssetRegistrationWithCloudStarted()
	{
		native_trackAssetRegistrationWithCloudStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #378 <Method void native_trackAssetRegistrationWithCloudStarted(long)>
	//    4    8:return          
	}

	public void trackAssetServiceDiscoveryFinished(int i, boolean flag)
	{
		native_trackAssetServiceDiscoveryFinished(nativeRef, i, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #382 <Method void native_trackAssetServiceDiscoveryFinished(long, int, boolean)>
	//    6   10:return          
	}

	public int trackAssetServiceDiscoveryStarted()
	{
		return native_trackAssetServiceDiscoveryStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #385 <Method int native_trackAssetServiceDiscoveryStarted(long)>
	//    4    8:ireturn         
	}

	public void trackBadgedAppOpened()
	{
		native_trackBadgedAppOpened(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #388 <Method void native_trackBadgedAppOpened(long)>
	//    4    8:return          
	}

	public void trackBetaProgramFeedbackSubmitted(String s, String s1)
	{
		native_trackBetaProgramFeedbackSubmitted(nativeRef, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #392 <Method void native_trackBetaProgramFeedbackSubmitted(long, String, String)>
	//    6   10:return          
	}

	public void trackBetaProgramIWantInButtonPressed(AssetInfo assetinfo)
	{
		native_trackBetaProgramIWantInButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #395 <Method void native_trackBetaProgramIWantInButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackBetaProgramThreeDotsButtonPressed(AssetInfo assetinfo)
	{
		native_trackBetaProgramThreeDotsButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #398 <Method void native_trackBetaProgramThreeDotsButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackBraavaPadOptionsChanged(AssetInfo assetinfo, RobotPadCategory robotpadcategory, int i)
	{
		native_trackBraavaPadOptionsChanged(nativeRef, assetinfo, robotpadcategory, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #402 <Method void native_trackBraavaPadOptionsChanged(long, AssetInfo, RobotPadCategory, int)>
	//    7   11:return          
	}

	public void trackBraavaSpotCleanPressed(AssetInfo assetinfo)
	{
		native_trackBraavaSpotCleanPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #405 <Method void native_trackBraavaSpotCleanPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackBraavaStoreButtonPressed(AssetInfo assetinfo)
	{
		native_trackBraavaStoreButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #408 <Method void native_trackBraavaStoreButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCareResetStatusButtonPressed(AssetInfo assetinfo, RobotCareType robotcaretype)
	{
		native_trackCareResetStatusButtonPressed(nativeRef, assetinfo, robotcaretype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #412 <Method void native_trackCareResetStatusButtonPressed(long, AssetInfo, RobotCareType)>
	//    6   10:return          
	}

	public void trackCareStepByStepGuideViewed(AssetInfo assetinfo, RobotCareType robotcaretype)
	{
		native_trackCareStepByStepGuideViewed(nativeRef, assetinfo, robotcaretype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #415 <Method void native_trackCareStepByStepGuideViewed(long, AssetInfo, RobotCareType)>
	//    6   10:return          
	}

	public void trackCarpetBoostSettingChanged(AssetInfo assetinfo, CarpetBoostMode carpetboostmode)
	{
		native_trackCarpetBoostSettingChanged(nativeRef, assetinfo, carpetboostmode);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #419 <Method void native_trackCarpetBoostSettingChanged(long, AssetInfo, CarpetBoostMode)>
	//    6   10:return          
	}

	public void trackChooseRoomsButtonPressed(AssetInfo assetinfo)
	{
		native_trackChooseRoomsButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #422 <Method void native_trackChooseRoomsButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleanButtonIntro1CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackCleanButtonIntro1CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #425 <Method void native_trackCleanButtonIntro1CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleanButtonIntro1NextButtonPressed(AssetInfo assetinfo)
	{
		native_trackCleanButtonIntro1NextButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #428 <Method void native_trackCleanButtonIntro1NextButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleanButtonIntro2CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackCleanButtonIntro2CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #431 <Method void native_trackCleanButtonIntro2CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleanButtonIntro2CompleteButtonPressed(AssetInfo assetinfo)
	{
		native_trackCleanButtonIntro2CompleteButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #434 <Method void native_trackCleanButtonIntro2CompleteButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleanMapEnabledSettingChanged(AssetInfo assetinfo, boolean flag)
	{
		native_trackCleanMapEnabledSettingChanged(nativeRef, assetinfo, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #438 <Method void native_trackCleanMapEnabledSettingChanged(long, AssetInfo, boolean)>
	//    6   10:return          
	}

	public void trackCleanMapInteractionFinished(AssetInfo assetinfo, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4)
	{
		native_trackCleanMapInteractionFinished(nativeRef, assetinfo, flag, flag1, flag2, flag3, flag4);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:iload           5
	//    8   12:iload           6
	//    9   14:invokespecial   #442 <Method void native_trackCleanMapInteractionFinished(long, AssetInfo, boolean, boolean, boolean, boolean, boolean)>
	//   10   17:return          
	}

	public void trackCleanMapInteractionStarted()
	{
		native_trackCleanMapInteractionStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #445 <Method void native_trackCleanMapInteractionStarted(long)>
	//    4    8:return          
	}

	public void trackCleanScheduleTwoAddPressed(AssetInfo assetinfo)
	{
		native_trackCleanScheduleTwoAddPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #448 <Method void native_trackCleanScheduleTwoAddPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleanScheduleTwoExistingScheduleDeleted(AssetInfo assetinfo)
	{
		native_trackCleanScheduleTwoExistingScheduleDeleted(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #451 <Method void native_trackCleanScheduleTwoExistingScheduleDeleted(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleanScheduleTwoExistingScheduleEdited(AssetInfo assetinfo, ScheduleMultipleMappingType schedulemultiplemappingtype, int i, int j, ArrayList arraylist, ScheduleLocationType schedulelocationtype, HashMap hashmap)
	{
		native_trackCleanScheduleTwoExistingScheduleEdited(nativeRef, assetinfo, schedulemultiplemappingtype, i, j, arraylist, schedulelocationtype, hashmap);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:aload           7
	//   10   16:invokespecial   #455 <Method void native_trackCleanScheduleTwoExistingScheduleEdited(long, AssetInfo, ScheduleMultipleMappingType, int, int, ArrayList, ScheduleLocationType, HashMap)>
	//   11   19:return          
	}

	public void trackCleanScheduleTwoExistingScheduleToggled(AssetInfo assetinfo, boolean flag)
	{
		native_trackCleanScheduleTwoExistingScheduleToggled(nativeRef, assetinfo, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #459 <Method void native_trackCleanScheduleTwoExistingScheduleToggled(long, AssetInfo, boolean)>
	//    6   10:return          
	}

	public void trackCleanScheduleTwoNewScheduleCreated(AssetInfo assetinfo, ScheduleMultipleMappingType schedulemultiplemappingtype, int i, int j, ArrayList arraylist, ScheduleLocationType schedulelocationtype, HashMap hashmap)
	{
		native_trackCleanScheduleTwoNewScheduleCreated(nativeRef, assetinfo, schedulemultiplemappingtype, i, j, arraylist, schedulelocationtype, hashmap);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:aload           7
	//   10   16:invokespecial   #462 <Method void native_trackCleanScheduleTwoNewScheduleCreated(long, AssetInfo, ScheduleMultipleMappingType, int, int, ArrayList, ScheduleLocationType, HashMap)>
	//   11   19:return          
	}

	public void trackCleanScheduleTwoPopularPressed(AssetInfo assetinfo)
	{
		native_trackCleanScheduleTwoPopularPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #465 <Method void native_trackCleanScheduleTwoPopularPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleanScheduleTwoSchedulesDeletedFromPMAPSChange(AssetInfo assetinfo, int i)
	{
		native_trackCleanScheduleTwoSchedulesDeletedFromPMAPSChange(nativeRef, assetinfo, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #469 <Method void native_trackCleanScheduleTwoSchedulesDeletedFromPMAPSChange(long, AssetInfo, int)>
	//    6   10:return          
	}

	public void trackCleanScheduleTwoTimeoutError(AssetInfo assetinfo, String s)
	{
		native_trackCleanScheduleTwoTimeoutError(nativeRef, assetinfo, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #473 <Method void native_trackCleanScheduleTwoTimeoutError(long, AssetInfo, String)>
	//    6   10:return          
	}

	public void trackCleanScheduleTwoUpdateFinished(AssetInfo assetinfo, String s)
	{
		native_trackCleanScheduleTwoUpdateFinished(nativeRef, assetinfo, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #476 <Method void native_trackCleanScheduleTwoUpdateFinished(long, AssetInfo, String)>
	//    6   10:return          
	}

	public void trackCleanScheduleTwoUpdateStarted()
	{
		native_trackCleanScheduleTwoUpdateStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #479 <Method void native_trackCleanScheduleTwoUpdateStarted(long)>
	//    4    8:return          
	}

	public void trackCleanScreenErrorIndicatorPressed(AssetInfo assetinfo)
	{
		native_trackCleanScreenErrorIndicatorPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #482 <Method void native_trackCleanScreenErrorIndicatorPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleaningPassesSettingChanged(AssetInfo assetinfo, MultiPassMode multipassmode)
	{
		native_trackCleaningPassesSettingChanged(nativeRef, assetinfo, multipassmode);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #486 <Method void native_trackCleaningPassesSettingChanged(long, AssetInfo, MultiPassMode)>
	//    6   10:return          
	}

	public void trackCleaningPreferencesDefaultsRestored(AssetInfo assetinfo)
	{
		native_trackCleaningPreferencesDefaultsRestored(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #489 <Method void native_trackCleaningPreferencesDefaultsRestored(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleaningPreferencesView(AssetInfo assetinfo)
	{
		native_trackCleaningPreferencesView(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #492 <Method void native_trackCleaningPreferencesView(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCleaningPresetSettingChanged(AssetInfo assetinfo, CleanPresetType cleanpresettype)
	{
		native_trackCleaningPresetSettingChanged(nativeRef, assetinfo, cleanpresettype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #496 <Method void native_trackCleaningPresetSettingChanged(long, AssetInfo, CleanPresetType)>
	//    6   10:return          
	}

	public void trackCloudButtonPressed(AssetInfo assetinfo)
	{
		native_trackCloudButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #499 <Method void native_trackCloudButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackCommandTimedOut(AssetInfo assetinfo, CommandType commandtype)
	{
		native_trackCommandTimedOut(nativeRef, assetinfo, commandtype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #503 <Method void native_trackCommandTimedOut(long, AssetInfo, CommandType)>
	//    6   10:return          
	}

	public void trackCountryPickerSelection(String s)
	{
		native_trackCountryPickerSelection(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #506 <Method void native_trackCountryPickerSelection(long, String)>
	//    5    9:return          
	}

	public void trackDirectedRoomCleaningStarted(AssetInfo assetinfo)
	{
		native_trackDirectedRoomCleaningStarted(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #509 <Method void native_trackDirectedRoomCleaningStarted(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackEdgeCleanSettingChanged(AssetInfo assetinfo, boolean flag)
	{
		native_trackEdgeCleanSettingChanged(nativeRef, assetinfo, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #512 <Method void native_trackEdgeCleanSettingChanged(long, AssetInfo, boolean)>
	//    6   10:return          
	}

	public void trackEnjoyingAppPromptResponseGiven(EnjoyingAppPromptResponse enjoyingapppromptresponse)
	{
		native_trackEnjoyingAppPromptResponseGiven(nativeRef, enjoyingapppromptresponse);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #516 <Method void native_trackEnjoyingAppPromptResponseGiven(long, EnjoyingAppPromptResponse)>
	//    5    9:return          
	}

	public void trackEvacuationDockEmptyBinButtonPressed(AssetInfo assetinfo)
	{
		native_trackEvacuationDockEmptyBinButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #519 <Method void native_trackEvacuationDockEmptyBinButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackEvacuationDockErrorHelpContentViewed(AssetInfo assetinfo, String s)
	{
		native_trackEvacuationDockErrorHelpContentViewed(nativeRef, assetinfo, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #522 <Method void native_trackEvacuationDockErrorHelpContentViewed(long, AssetInfo, String)>
	//    6   10:return          
	}

	public void trackExpeditedOtaRequested(AssetInfo assetinfo)
	{
		native_trackExpeditedOtaRequested(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #525 <Method void native_trackExpeditedOtaRequested(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackFinishWhenBinFullSettingChanged(AssetInfo assetinfo, boolean flag)
	{
		native_trackFinishWhenBinFullSettingChanged(nativeRef, assetinfo, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #528 <Method void native_trackFinishWhenBinFullSettingChanged(long, AssetInfo, boolean)>
	//    6   10:return          
	}

	public void trackHeartBeatMissed(AssetInfo assetinfo)
	{
		native_trackHeartBeatMissed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #531 <Method void native_trackHeartBeatMissed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackHelpDocumentViewed(AssetInfo assetinfo, HelpDocumentType helpdocumenttype)
	{
		native_trackHelpDocumentViewed(nativeRef, assetinfo, helpdocumenttype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #535 <Method void native_trackHelpDocumentViewed(long, AssetInfo, HelpDocumentType)>
	//    6   10:return          
	}

	public void trackHelpVideoWatched(AssetInfo assetinfo, HelpVideoType helpvideotype)
	{
		native_trackHelpVideoWatched(nativeRef, assetinfo, helpvideotype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #539 <Method void native_trackHelpVideoWatched(long, AssetInfo, HelpVideoType)>
	//    6   10:return          
	}

	public void trackHistoryDetailErrorIndicatorPressed(AssetInfo assetinfo)
	{
		native_trackHistoryDetailErrorIndicatorPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #542 <Method void native_trackHistoryDetailErrorIndicatorPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackHistoryDetailView(AssetInfo assetinfo, RobotMissionHistoryCompletionStatus robotmissionhistorycompletionstatus, boolean flag, int i, int j)
	{
		native_trackHistoryDetailView(nativeRef, assetinfo, robotmissionhistorycompletionstatus, flag, i, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:iload           5
	//    8   12:invokespecial   #546 <Method void native_trackHistoryDetailView(long, AssetInfo, RobotMissionHistoryCompletionStatus, boolean, int, int)>
	//    9   15:return          
	}

	public void trackHistoryMissionMapRated(AssetInfo assetinfo, int i, String s, SatisfactionRating satisfactionrating)
	{
		native_trackHistoryMissionMapRated(nativeRef, assetinfo, i, s, satisfactionrating);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #550 <Method void native_trackHistoryMissionMapRated(long, AssetInfo, int, String, SatisfactionRating)>
	//    8   13:return          
	}

	public void trackHistoryProvideFeedbackButtonPressed(AssetInfo assetinfo)
	{
		native_trackHistoryProvideFeedbackButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #553 <Method void native_trackHistoryProvideFeedbackButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackHistorySummaryTabChanged()
	{
		native_trackHistorySummaryTabChanged(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #556 <Method void native_trackHistorySummaryTabChanged(long)>
	//    4    8:return          
	}

	public void trackHistorySummaryView(AssetInfo assetinfo, int i)
	{
		native_trackHistorySummaryView(nativeRef, assetinfo, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #559 <Method void native_trackHistorySummaryView(long, AssetInfo, int)>
	//    6   10:return          
	}

	public void trackIsLegacyUser(boolean flag)
	{
		native_trackIsLegacyUser(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #562 <Method void native_trackIsLegacyUser(long, boolean)>
	//    5    9:return          
	}

	public void trackLeaveBetaProgramConfirmationButtonPressed(AssetInfo assetinfo)
	{
		native_trackLeaveBetaProgramConfirmationButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #565 <Method void native_trackLeaveBetaProgramConfirmationButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackLifetimeHistoryInfoButtonPressed(AssetInfo assetinfo)
	{
		native_trackLifetimeHistoryInfoButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #568 <Method void native_trackLifetimeHistoryInfoButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackLocalOtaFirmwareUpdateFinished(AssetInfo assetinfo, int i)
	{
		native_trackLocalOtaFirmwareUpdateFinished(nativeRef, assetinfo, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #571 <Method void native_trackLocalOtaFirmwareUpdateFinished(long, AssetInfo, int)>
	//    6   10:return          
	}

	public void trackLocalOtaFirmwareUpdateStarted()
	{
		native_trackLocalOtaFirmwareUpdateStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #574 <Method void native_trackLocalOtaFirmwareUpdateStarted(long)>
	//    4    8:return          
	}

	public void trackLocateRoombaButtonPressed(AssetInfo assetinfo)
	{
		native_trackLocateRoombaButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #577 <Method void native_trackLocateRoombaButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackManualCleanMissionStarted(AssetInfo assetinfo)
	{
		native_trackManualCleanMissionStarted(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #580 <Method void native_trackManualCleanMissionStarted(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackNetworkingStatistics()
	{
		native_trackNetworkingStatistics(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #583 <Method void native_trackNetworkingStatistics(long)>
	//    4    8:return          
	}

	public void trackNewAppVersionAvailableSkipClicked(String s)
	{
		native_trackNewAppVersionAvailableSkipClicked(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #586 <Method void native_trackNewAppVersionAvailableSkipClicked(long, String)>
	//    5    9:return          
	}

	public void trackNewAppVersionAvailableUpdateClicked(String s)
	{
		native_trackNewAppVersionAvailableUpdateClicked(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #589 <Method void native_trackNewAppVersionAvailableUpdateClicked(long, String)>
	//    5    9:return          
	}

	public void trackNewAppVersionAvailableViewed(String s)
	{
		native_trackNewAppVersionAvailableViewed(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #592 <Method void native_trackNewAppVersionAvailableViewed(long, String)>
	//    5    9:return          
	}

	public void trackNotificationBackSelected(AssetInfo assetinfo, String s, int i, int j)
	{
		native_trackNotificationBackSelected(nativeRef, assetinfo, s, i, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #596 <Method void native_trackNotificationBackSelected(long, AssetInfo, String, int, int)>
	//    8   13:return          
	}

	public void trackNotificationCenterBellIconPressed(AssetInfo assetinfo, boolean flag)
	{
		native_trackNotificationCenterBellIconPressed(nativeRef, assetinfo, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #599 <Method void native_trackNotificationCenterBellIconPressed(long, AssetInfo, boolean)>
	//    6   10:return          
	}

	public void trackNotificationCenterVideoViewed(AssetInfo assetinfo, String s, int i, int j)
	{
		native_trackNotificationCenterVideoViewed(nativeRef, assetinfo, s, i, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #602 <Method void native_trackNotificationCenterVideoViewed(long, AssetInfo, String, int, int)>
	//    8   13:return          
	}

	public void trackNotificationCenterViewed(AssetInfo assetinfo, int i)
	{
		native_trackNotificationCenterViewed(nativeRef, assetinfo, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #605 <Method void native_trackNotificationCenterViewed(long, AssetInfo, int)>
	//    6   10:return          
	}

	public void trackNotificationFeedback(AssetInfo assetinfo, boolean flag, String s, int i, int j)
	{
		native_trackNotificationFeedback(nativeRef, assetinfo, flag, s, i, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iload           5
	//    8   12:invokespecial   #609 <Method void native_trackNotificationFeedback(long, AssetInfo, boolean, String, int, int)>
	//    9   15:return          
	}

	public void trackNotificationSelected(AssetInfo assetinfo, String s, int i, int j)
	{
		native_trackNotificationSelected(nativeRef, assetinfo, s, i, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #612 <Method void native_trackNotificationSelected(long, AssetInfo, String, int, int)>
	//    8   13:return          
	}

	public void trackNotificationSettingChanged(PushNotificationSetting pushnotificationsetting)
	{
		native_trackNotificationSettingChanged(nativeRef, pushnotificationsetting);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #616 <Method void native_trackNotificationSettingChanged(long, PushNotificationSetting)>
	//    5    9:return          
	}

	public void trackNotificationSmartScheduleAccepted(AssetInfo assetinfo, String s, int i, String s1)
	{
		native_trackNotificationSmartScheduleAccepted(nativeRef, assetinfo, s, i, s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #620 <Method void native_trackNotificationSmartScheduleAccepted(long, AssetInfo, String, int, String)>
	//    8   13:return          
	}

	public void trackNotificationSmartScheduleBackSelected(AssetInfo assetinfo, String s, int i, String s1)
	{
		native_trackNotificationSmartScheduleBackSelected(nativeRef, assetinfo, s, i, s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #623 <Method void native_trackNotificationSmartScheduleBackSelected(long, AssetInfo, String, int, String)>
	//    8   13:return          
	}

	public void trackNotificationSmartScheduleDeclined(AssetInfo assetinfo, String s, int i, String s1)
	{
		native_trackNotificationSmartScheduleDeclined(nativeRef, assetinfo, s, i, s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #626 <Method void native_trackNotificationSmartScheduleDeclined(long, AssetInfo, String, int, String)>
	//    8   13:return          
	}

	public void trackNotificationSmartScheduleMessageSelected(AssetInfo assetinfo, String s, int i, String s1)
	{
		native_trackNotificationSmartScheduleMessageSelected(nativeRef, assetinfo, s, i, s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #629 <Method void native_trackNotificationSmartScheduleMessageSelected(long, AssetInfo, String, int, String)>
	//    8   13:return          
	}

	public void trackOnDemandOtaAvailableHelpButtonPressed(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaAvailableHelpButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #632 <Method void native_trackOnDemandOtaAvailableHelpButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaAvailableViewed(AssetInfo assetinfo, OnDemandOtaPath ondemandotapath)
	{
		native_trackOnDemandOtaAvailableViewed(nativeRef, assetinfo, ondemandotapath);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #636 <Method void native_trackOnDemandOtaAvailableViewed(long, AssetInfo, OnDemandOtaPath)>
	//    6   10:return          
	}

	public void trackOnDemandOtaFailedHelpButtonPressed(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaFailedHelpButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #639 <Method void native_trackOnDemandOtaFailedHelpButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaFailedTryAgainButtonPressed(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaFailedTryAgainButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #642 <Method void native_trackOnDemandOtaFailedTryAgainButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaFailedUpdateLaterButtonPressed(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaFailedUpdateLaterButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #645 <Method void native_trackOnDemandOtaFailedUpdateLaterButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaFirmwareUpdateAvailableFinished(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaFirmwareUpdateAvailableFinished(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #648 <Method void native_trackOnDemandOtaFirmwareUpdateAvailableFinished(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaFirmwareUpdateAvailableStarted()
	{
		native_trackOnDemandOtaFirmwareUpdateAvailableStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #651 <Method void native_trackOnDemandOtaFirmwareUpdateAvailableStarted(long)>
	//    4    8:return          
	}

	public void trackOnDemandOtaFirmwareUpdateError(AssetInfo assetinfo, int i)
	{
		native_trackOnDemandOtaFirmwareUpdateError(nativeRef, assetinfo, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #654 <Method void native_trackOnDemandOtaFirmwareUpdateError(long, AssetInfo, int)>
	//    6   10:return          
	}

	public void trackOnDemandOtaFirmwareUpdateInstallingFinished(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaFirmwareUpdateInstallingFinished(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #657 <Method void native_trackOnDemandOtaFirmwareUpdateInstallingFinished(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaFirmwareUpdateInstallingStarted()
	{
		native_trackOnDemandOtaFirmwareUpdateInstallingStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #660 <Method void native_trackOnDemandOtaFirmwareUpdateInstallingStarted(long)>
	//    4    8:return          
	}

	public void trackOnDemandOtaFirmwareUpdateLoadingFinished(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaFirmwareUpdateLoadingFinished(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #663 <Method void native_trackOnDemandOtaFirmwareUpdateLoadingFinished(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaFirmwareUpdateLoadingStarted()
	{
		native_trackOnDemandOtaFirmwareUpdateLoadingStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #666 <Method void native_trackOnDemandOtaFirmwareUpdateLoadingStarted(long)>
	//    4    8:return          
	}

	public void trackOnDemandOtaFirmwareUpdateReadyFinished(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaFirmwareUpdateReadyFinished(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #669 <Method void native_trackOnDemandOtaFirmwareUpdateReadyFinished(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaFirmwareUpdateReadyStarted()
	{
		native_trackOnDemandOtaFirmwareUpdateReadyStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #672 <Method void native_trackOnDemandOtaFirmwareUpdateReadyStarted(long)>
	//    4    8:return          
	}

	public void trackOnDemandOtaFirmwareUpdateSuccessFinished(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaFirmwareUpdateSuccessFinished(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #675 <Method void native_trackOnDemandOtaFirmwareUpdateSuccessFinished(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaFirmwareUpdateSuccessStarted()
	{
		native_trackOnDemandOtaFirmwareUpdateSuccessStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #678 <Method void native_trackOnDemandOtaFirmwareUpdateSuccessStarted(long)>
	//    4    8:return          
	}

	public void trackOnDemandOtaInProgressHelpButtonPressed(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaInProgressHelpButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #681 <Method void native_trackOnDemandOtaInProgressHelpButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaInProgressViewed(AssetInfo assetinfo, OnDemandOtaPath ondemandotapath)
	{
		native_trackOnDemandOtaInProgressViewed(nativeRef, assetinfo, ondemandotapath);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #684 <Method void native_trackOnDemandOtaInProgressViewed(long, AssetInfo, OnDemandOtaPath)>
	//    6   10:return          
	}

	public void trackOnDemandOtaUpdateLaterButtonPressed(AssetInfo assetinfo)
	{
		native_trackOnDemandOtaUpdateLaterButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #687 <Method void native_trackOnDemandOtaUpdateLaterButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackOnDemandOtaUpdateNowButtonPressed(AssetInfo assetinfo, OnDemandOtaPath ondemandotapath)
	{
		native_trackOnDemandOtaUpdateNowButtonPressed(nativeRef, assetinfo, ondemandotapath);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #690 <Method void native_trackOnDemandOtaUpdateNowButtonPressed(long, AssetInfo, OnDemandOtaPath)>
	//    6   10:return          
	}

	public void trackOnboardingBegan(boolean flag)
	{
		native_trackOnboardingBegan(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #693 <Method void native_trackOnboardingBegan(long, boolean)>
	//    5    9:return          
	}

	public void trackPMapCustomizeCompleteCleanButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapCustomizeCompleteCleanButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #696 <Method void native_trackPMapCustomizeCompleteCleanButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapCustomizeCompleteScheduleButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapCustomizeCompleteScheduleButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #699 <Method void native_trackPMapCustomizeCompleteScheduleButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapCustomizeLabelRoomsCancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapCustomizeLabelRoomsCancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #702 <Method void native_trackPMapCustomizeLabelRoomsCancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapCustomizeLabelRoomsDoneButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapCustomizeLabelRoomsDoneButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #705 <Method void native_trackPMapCustomizeLabelRoomsDoneButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapCustomizeNameMapCancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapCustomizeNameMapCancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #708 <Method void native_trackPMapCustomizeNameMapCancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapCustomizeNameMapNextButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapCustomizeNameMapNextButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #711 <Method void native_trackPMapCustomizeNameMapNextButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapCustomizeSetupRoomsCancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapCustomizeSetupRoomsCancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #714 <Method void native_trackPMapCustomizeSetupRoomsCancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapCustomizeSetupRoomsNextButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapCustomizeSetupRoomsNextButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #717 <Method void native_trackPMapCustomizeSetupRoomsNextButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapErrorEmptyMap(AssetInfo assetinfo)
	{
		native_trackPMapErrorEmptyMap(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #720 <Method void native_trackPMapErrorEmptyMap(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapErrorRoomTooSmall(AssetInfo assetinfo)
	{
		native_trackPMapErrorRoomTooSmall(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #723 <Method void native_trackPMapErrorRoomTooSmall(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapErrorSaveFloorNameTimedOut(AssetInfo assetinfo)
	{
		native_trackPMapErrorSaveFloorNameTimedOut(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #726 <Method void native_trackPMapErrorSaveFloorNameTimedOut(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapErrorSaveTimedOut(AssetInfo assetinfo)
	{
		native_trackPMapErrorSaveTimedOut(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #729 <Method void native_trackPMapErrorSaveTimedOut(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapErrorSegmentationTransferFailed(AssetInfo assetinfo)
	{
		native_trackPMapErrorSegmentationTransferFailed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #732 <Method void native_trackPMapErrorSegmentationTransferFailed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapErrorSplitInvalidMap(AssetInfo assetinfo)
	{
		native_trackPMapErrorSplitInvalidMap(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #735 <Method void native_trackPMapErrorSplitInvalidMap(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapSectionMapListCleanButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapSectionMapListCleanButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #738 <Method void native_trackPMapSectionMapListCleanButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapSectionMapListTrainButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapSectionMapListTrainButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #741 <Method void native_trackPMapSectionMapListTrainButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapSectionMapPreviewNotRightButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapSectionMapPreviewNotRightButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #744 <Method void native_trackPMapSectionMapPreviewNotRightButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapSectionMapReadyCustomizeButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapSectionMapReadyCustomizeButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #747 <Method void native_trackPMapSectionMapReadyCustomizeButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapSectionMapReadyNotRightButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapSectionMapReadyNotRightButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #750 <Method void native_trackPMapSectionMapReadyNotRightButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapTroubleshootIncompleteCleanButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapTroubleshootIncompleteCleanButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #753 <Method void native_trackPMapTroubleshootIncompleteCleanButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapTroubleshootIncompleteTrainButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapTroubleshootIncompleteTrainButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #756 <Method void native_trackPMapTroubleshootIncompleteTrainButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapTroubleshootWrongDeleteButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapTroubleshootWrongDeleteButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #759 <Method void native_trackPMapTroubleshootWrongDeleteButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsErrorRegionDuplicatePoints(AssetInfo assetinfo, String s, String s1)
	{
		native_trackPMapsErrorRegionDuplicatePoints(nativeRef, assetinfo, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #763 <Method void native_trackPMapsErrorRegionDuplicatePoints(long, AssetInfo, String, String)>
	//    7   11:return          
	}

	public void trackPMapsSectionIntro1CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro1CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #766 <Method void native_trackPMapsSectionIntro1CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro1NextButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro1NextButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #769 <Method void native_trackPMapsSectionIntro1NextButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro2CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro2CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #772 <Method void native_trackPMapsSectionIntro2CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro2NextButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro2NextButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #775 <Method void native_trackPMapsSectionIntro2NextButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro3ActivateButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro3ActivateButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #778 <Method void native_trackPMapsSectionIntro3ActivateButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro3CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro3CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #781 <Method void native_trackPMapsSectionIntro3CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro4AddTrainingRunButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro4AddTrainingRunButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #784 <Method void native_trackPMapsSectionIntro4AddTrainingRunButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro4CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro4CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #787 <Method void native_trackPMapsSectionIntro4CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro4MaybeLaterButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro4MaybeLaterButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #790 <Method void native_trackPMapsSectionIntro4MaybeLaterButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro5CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro5CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #793 <Method void native_trackPMapsSectionIntro5CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntro5StartTrainingRunButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntro5StartTrainingRunButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #796 <Method void native_trackPMapsSectionIntro5StartTrainingRunButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntroCompleteCancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntroCompleteCancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #799 <Method void native_trackPMapsSectionIntroCompleteCancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsSectionIntroCompleteTipsButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsSectionIntroCompleteTipsButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #802 <Method void native_trackPMapsSectionIntroCompleteTipsButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsTip1CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsTip1CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #805 <Method void native_trackPMapsTip1CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsTip1NextButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsTip1NextButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #808 <Method void native_trackPMapsTip1NextButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsTip2CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsTip2CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #811 <Method void native_trackPMapsTip2CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsTip2NextButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsTip2NextButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #814 <Method void native_trackPMapsTip2NextButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsTip3CancelButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsTip3CancelButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #817 <Method void native_trackPMapsTip3CancelButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackPMapsTip3CompleteButtonPressed(AssetInfo assetinfo)
	{
		native_trackPMapsTip3CompleteButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #820 <Method void native_trackPMapsTip3CompleteButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackProvAddRobotSelected(AddRobotSelection addrobotselection)
	{
		native_trackProvAddRobotSelected(nativeRef, addrobotselection);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #824 <Method void native_trackProvAddRobotSelected(long, AddRobotSelection)>
	//    5    9:return          
	}

	public void trackProvBleDiscoveryPageResult(BleDiscoveryResult blediscoveryresult)
	{
		native_trackProvBleDiscoveryPageResult(nativeRef, blediscoveryresult);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #828 <Method void native_trackProvBleDiscoveryPageResult(long, BleDiscoveryResult)>
	//    5    9:return          
	}

	public void trackProvCancelButtonPressed(ProvisioningStep provisioningstep)
	{
		native_trackProvCancelButtonPressed(nativeRef, provisioningstep);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #832 <Method void native_trackProvCancelButtonPressed(long, ProvisioningStep)>
	//    5    9:return          
	}

	public void trackProvError(ProvisioningType provisioningtype, AssetInfo assetinfo, int i)
	{
		native_trackProvError(nativeRef, provisioningtype, assetinfo, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #836 <Method void native_trackProvError(long, ProvisioningType, AssetInfo, int)>
	//    7   11:return          
	}

	public void trackProvFinished(ProvisioningType provisioningtype, AssetInfo assetinfo)
	{
		native_trackProvFinished(nativeRef, provisioningtype, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #840 <Method void native_trackProvFinished(long, ProvisioningType, AssetInfo)>
	//    6   10:return          
	}

	public void trackProvInfoButtonPressed(ProvisioningStep provisioningstep)
	{
		native_trackProvInfoButtonPressed(nativeRef, provisioningstep);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #843 <Method void native_trackProvInfoButtonPressed(long, ProvisioningStep)>
	//    5    9:return          
	}

	public void trackProvRobotNameDone(boolean flag)
	{
		native_trackProvRobotNameDone(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #846 <Method void native_trackProvRobotNameDone(long, boolean)>
	//    5    9:return          
	}

	public void trackProvStarted(ProvisioningType provisioningtype, AssetInfo assetinfo)
	{
		native_trackProvStarted(nativeRef, provisioningtype, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #849 <Method void native_trackProvStarted(long, ProvisioningType, AssetInfo)>
	//    6   10:return          
	}

	public void trackProvStatus(ProvisioningType provisioningtype, AssetInfo assetinfo, WifiProvisioningStatus wifiprovisioningstatus)
	{
		native_trackProvStatus(nativeRef, provisioningtype, assetinfo, wifiprovisioningstatus);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #853 <Method void native_trackProvStatus(long, ProvisioningType, AssetInfo, WifiProvisioningStatus)>
	//    7   11:return          
	}

	public void trackProvStepViewed(ProvisioningStep provisioningstep)
	{
		native_trackProvStepViewed(nativeRef, provisioningstep);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #856 <Method void native_trackProvStepViewed(long, ProvisioningStep)>
	//    5    9:return          
	}

	public void trackProvWifiPasswordDone(boolean flag)
	{
		native_trackProvWifiPasswordDone(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #859 <Method void native_trackProvWifiPasswordDone(long, boolean)>
	//    5    9:return          
	}

	public void trackReActivateAppOverviewPressed(AssetInfo assetinfo)
	{
		native_trackReActivateAppOverviewPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #862 <Method void native_trackReActivateAppOverviewPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackReAddRobotPressedAfterBlidHealing()
	{
		native_trackReAddRobotPressedAfterBlidHealing(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #865 <Method void native_trackReAddRobotPressedAfterBlidHealing(long)>
	//    4    8:return          
	}

	public void trackRobotAdded(AssetInfo assetinfo)
	{
		native_trackRobotAdded(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #868 <Method void native_trackRobotAdded(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackRobotAssetsForUser(ArrayList arraylist)
	{
		native_trackRobotAssetsForUser(nativeRef, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #872 <Method void native_trackRobotAssetsForUser(long, ArrayList)>
	//    5    9:return          
	}

	public void trackRobotHealedMessageViewed()
	{
		native_trackRobotHealedMessageViewed(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #876 <Method void native_trackRobotHealedMessageViewed(long)>
	//    4    8:return          
	}

	public void trackRobotWelcomeVideoViewFinished(AssetInfo assetinfo)
	{
		native_trackRobotWelcomeVideoViewFinished(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #879 <Method void native_trackRobotWelcomeVideoViewFinished(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackRobotWelcomeVideoViewStarted()
	{
		native_trackRobotWelcomeVideoViewStarted(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #882 <Method void native_trackRobotWelcomeVideoViewStarted(long)>
	//    4    8:return          
	}

	public void trackRoombaV1ProvisioningError(AssetInfo assetinfo, V1ProvisioningError v1provisioningerror)
	{
		native_trackRoombaV1ProvisioningError(nativeRef, assetinfo, v1provisioningerror);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #886 <Method void native_trackRoombaV1ProvisioningError(long, AssetInfo, V1ProvisioningError)>
	//    6   10:return          
	}

	public void trackRoombaV2ProvisioningError(AssetInfo assetinfo, int i)
	{
		native_trackRoombaV2ProvisioningError(nativeRef, assetinfo, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #889 <Method void native_trackRoombaV2ProvisioningError(long, AssetInfo, int)>
	//    6   10:return          
	}

	public void trackScheduleChanged(AssetInfo assetinfo, HashMap hashmap)
	{
		native_trackScheduleChanged(nativeRef, assetinfo, hashmap);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #893 <Method void native_trackScheduleChanged(long, AssetInfo, HashMap)>
	//    6   10:return          
	}

	public void trackSideMenuView()
	{
		native_trackSideMenuView(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #897 <Method void native_trackSideMenuView(long)>
	//    4    8:return          
	}

	public void trackSmartMapsButtonPressed(AssetInfo assetinfo)
	{
		native_trackSmartMapsButtonPressed(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #900 <Method void native_trackSmartMapsButtonPressed(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackStoreView()
	{
		native_trackStoreView(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #903 <Method void native_trackStoreView(long)>
	//    4    8:return          
	}

	public void trackTrainingRunStarted(AssetInfo assetinfo)
	{
		native_trackTrainingRunStarted(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #906 <Method void native_trackTrainingRunStarted(long, AssetInfo)>
	//    5    9:return          
	}

	public void trackUserLoggedIn()
	{
		native_trackUserLoggedIn(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #909 <Method void native_trackUserLoggedIn(long)>
	//    4    8:return          
	}

	public void trackUserLoggedOut()
	{
		native_trackUserLoggedOut(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #912 <Method void native_trackUserLoggedOut(long)>
	//    4    8:return          
	}

	public void trackUserNotificationSettings(ArrayList arraylist)
	{
		native_trackUserNotificationSettings(nativeRef, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #915 <Method void native_trackUserNotificationSettings(long, ArrayList)>
	//    5    9:return          
	}

	public void trackUserTermsLinkPressed()
	{
		native_trackUserTermsLinkPressed(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #919 <Method void native_trackUserTermsLinkPressed(long)>
	//    4    8:return          
	}

	public void trackView(ViewId viewid)
	{
		native_trackView(nativeRef, viewid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #923 <Method void native_trackView(long, ViewId)>
	//    5    9:return          
	}

	public void trackViewForAsset(ViewId viewid, AssetInfo assetinfo)
	{
		native_trackViewForAsset(nativeRef, viewid, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #927 <Method void native_trackViewForAsset(long, ViewId, AssetInfo)>
	//    6   10:return          
	}

	public void trackWifiCoverageToggled(AssetInfo assetinfo, boolean flag)
	{
		native_trackWifiCoverageToggled(nativeRef, assetinfo, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #930 <Method void native_trackWifiCoverageToggled(long, AssetInfo, boolean)>
	//    6   10:return          
	}

	public void trackWifiMapFeedbackResponseGiven(float f, float f1, float f2)
	{
		native_trackWifiMapFeedbackResponseGiven(nativeRef, f, f1, f2);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:invokespecial   #934 <Method void native_trackWifiMapFeedbackResponseGiven(long, float, float, float)>
	//    7   11:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private AnalyticsSubsystem$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AnalyticsSubsystem()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
		if(l == 0L)
	//*   8   16:lload_1         
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifne            32
		{
			throw new RuntimeException("nativeRef is zero");
	//   12   22:new             #28  <Class RuntimeException>
	//   13   25:dup             
	//   14   26:ldc1            #30  <String "nativeRef is zero">
	//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
	//   16   31:athrow          
		} else
		{
			nativeRef = l;
	//   17   32:aload_0         
	//   18   33:lload_1         
	//   19   34:putfield        #35  <Field long nativeRef>
			return;
	//   20   37:return          
		}
	}
}
