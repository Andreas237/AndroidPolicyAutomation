// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AnalyticsEvent extends Enum
{

	private AnalyticsEvent(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #1182 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AnalyticsEvent valueOf(String s)
	{
		return (AnalyticsEvent)Enum.valueOf(com/irobot/core/AnalyticsEvent, s);
	//    0    0:ldc1            #2   <Class AnalyticsEvent>
	//    1    2:aload_0         
	//    2    3:invokestatic    #1188 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AnalyticsEvent>
	//    4    9:areturn         
	}

	public static AnalyticsEvent[] values()
	{
		return (AnalyticsEvent[])((AnalyticsEvent []) ($VALUES)).clone();
	//    0    0:getstatic       #1180 <Field AnalyticsEvent[] $VALUES>
	//    1    3:invokevirtual   #1195 <Method Object _5B_Lcom.irobot.core.AnalyticsEvent_3B_.clone()>
	//    2    6:checkcast       #1191 <Class AnalyticsEvent[]>
	//    3    9:areturn         
	}

	private static final AnalyticsEvent $VALUES[];
	public static final AnalyticsEvent AboutRobotViewed;
	public static final AnalyticsEvent AboutThisAppEulaViewed;
	public static final AnalyticsEvent AboutThisAppFollowButtonPressed;
	public static final AnalyticsEvent AboutThisAppViewed;
	public static final AnalyticsEvent AccountAndPrivacyViewed;
	public static final AnalyticsEvent AccountError;
	public static final AnalyticsEvent AccountInfoRequestResult;
	public static final AnalyticsEvent AccountInfoRequestSummary;
	public static final AnalyticsEvent AccountOptionsViewed;
	public static final AnalyticsEvent AccountProfileUpdated;
	public static final AnalyticsEvent AccountServiceUnavailableDialogViewed;
	public static final AnalyticsEvent AccountUpdatePasswordViewed;
	public static final AnalyticsEvent AdditionalHelpContactButtonPressed;
	public static final AnalyticsEvent AdditionalHelpViewed;
	public static final AnalyticsEvent AnyCommonQuestionsOpened;
	public static final AnalyticsEvent AppBackgrounded;
	public static final AnalyticsEvent AppFeedbackResponseCancelled;
	public static final AnalyticsEvent AppFeedbackResponseGiven;
	public static final AnalyticsEvent AppForegrounded;
	public static final AnalyticsEvent AppLaunched;
	public static final AnalyticsEvent AppLaunchedAfterAppInstall;
	public static final AnalyticsEvent AppLaunchedAfterAppUpgrade;
	public static final AnalyticsEvent AppServiceDiscoveryResult;
	public static final AnalyticsEvent AppServiceDiscoverySummary;
	public static final AnalyticsEvent AppWelcomeViewed;
	public static final AnalyticsEvent AssetRegistrationWithCloudFinished;
	public static final AnalyticsEvent AssetServiceDiscoverySummary;
	public static final AnalyticsEvent BadgedAppOpened;
	public static final AnalyticsEvent BetaProgramFeedbackSubmitted;
	public static final AnalyticsEvent BetaProgramIWantInButtonPressed;
	public static final AnalyticsEvent BetaProgramIntroductionPageViewed;
	public static final AnalyticsEvent BetaProgramPageViewed;
	public static final AnalyticsEvent BetaProgramThreeDotsButtonPressed;
	public static final AnalyticsEvent BraavaCleanMissionStarted;
	public static final AnalyticsEvent BraavaPadOptionsChanged;
	public static final AnalyticsEvent BraavaPadOptionsViewed;
	public static final AnalyticsEvent BraavaSpotCleanPressed;
	public static final AnalyticsEvent BraavaSpotCleanViewed;
	public static final AnalyticsEvent BraavaStoreButtonPressed;
	public static final AnalyticsEvent CareBinViewed;
	public static final AnalyticsEvent CareCoreRobotViewed;
	public static final AnalyticsEvent CareDebrisExtractorsViewed;
	public static final AnalyticsEvent CareResetStatusButtonPressed;
	public static final AnalyticsEvent CareStepByStepGuideViewed;
	public static final AnalyticsEvent CareViewed;
	public static final AnalyticsEvent CarpetBoostSettingChanged;
	public static final AnalyticsEvent CarpetBoostSettingsView;
	public static final AnalyticsEvent CleanMapEnabledSettingChanged;
	public static final AnalyticsEvent CleanMapInteraction;
	public static final AnalyticsEvent CleanScheduleTwoAddPressed;
	public static final AnalyticsEvent CleanScheduleTwoCleaningPresetViewed;
	public static final AnalyticsEvent CleanScheduleTwoCreateScreenViewed;
	public static final AnalyticsEvent CleanScheduleTwoExistingScheduleDeleted;
	public static final AnalyticsEvent CleanScheduleTwoExistingScheduleEdited;
	public static final AnalyticsEvent CleanScheduleTwoExistingScheduleToggled;
	public static final AnalyticsEvent CleanScheduleTwoExistingScheduleViewed;
	public static final AnalyticsEvent CleanScheduleTwoNewScheduleCreated;
	public static final AnalyticsEvent CleanScheduleTwoPMAPSChangeLayoutPromptViewed;
	public static final AnalyticsEvent CleanScheduleTwoPopularPressed;
	public static final AnalyticsEvent CleanScheduleTwoScheduleLimitViewed;
	public static final AnalyticsEvent CleanScheduleTwoSchedulesDeletedFromPMAPSChange;
	public static final AnalyticsEvent CleanScheduleTwoTimeoutError;
	public static final AnalyticsEvent CleanScheduleTwoUpdateFinished;
	public static final AnalyticsEvent CleanScheduleTwoWelcomeViewed;
	public static final AnalyticsEvent CleanScreenErrorIndicatorPressed;
	public static final AnalyticsEvent CleaningPassSettingChanged;
	public static final AnalyticsEvent CleaningPassSettingsView;
	public static final AnalyticsEvent CleaningPreferencesDefaultsRestored;
	public static final AnalyticsEvent CleaningPreferencesView;
	public static final AnalyticsEvent CleaningPresetSettingChanged;
	public static final AnalyticsEvent CloudButtonPressed;
	public static final AnalyticsEvent CommandTimedOut;
	public static final AnalyticsEvent CommonQuestionsViewed;
	public static final AnalyticsEvent ConnectedHomeViewed;
	public static final AnalyticsEvent CountryPickerViewed;
	public static final AnalyticsEvent CreateAccountFromSideMenuViewed;
	public static final AnalyticsEvent CreateAccountLaterButtonPressed;
	public static final AnalyticsEvent CreateAccountViewed;
	public static final AnalyticsEvent EdgeCleanSettingChanged;
	public static final AnalyticsEvent EnjoyingAppPromptResponseGiven;
	public static final AnalyticsEvent EvacuationDockAboutDockViewed;
	public static final AnalyticsEvent EvacuationDockBagMissingHelpContentViewed;
	public static final AnalyticsEvent EvacuationDockEmptyBinButtonPressed;
	public static final AnalyticsEvent EvacuationDockErrorHelpContentViewed;
	public static final AnalyticsEvent ExpeditedOtaRequested;
	public static final AnalyticsEvent ExpeditedOtaViewed;
	public static final AnalyticsEvent FinishWhenBinFullSettingChanged;
	public static final AnalyticsEvent HeartBeatMissed;
	public static final AnalyticsEvent HelpDocumentViewed;
	public static final AnalyticsEvent HelpVideoWatched;
	public static final AnalyticsEvent HelpViewed;
	public static final AnalyticsEvent HistoryDetailErrorIndicatorPressed;
	public static final AnalyticsEvent HistoryDetailView;
	public static final AnalyticsEvent HistoryMissionMapRated;
	public static final AnalyticsEvent HistoryProvideFeedbackButtonPressed;
	public static final AnalyticsEvent HistorySummaryTabChanged;
	public static final AnalyticsEvent HistorySummaryView;
	public static final AnalyticsEvent LeaveBetaProgramConfirmationButtonPressed;
	public static final AnalyticsEvent LifetimeHistoryInfoButtonPressed;
	public static final AnalyticsEvent LocalOtaFirmwareUpdateFinished;
	public static final AnalyticsEvent LocateRoombaButtonPressed;
	public static final AnalyticsEvent LoginViewed;
	public static final AnalyticsEvent ManageAccountViewed;
	public static final AnalyticsEvent MissionHistoryDetailBottomSheetView;
	public static final AnalyticsEvent MoreViewed;
	public static final AnalyticsEvent NewAppVersionAvailableSkipClicked;
	public static final AnalyticsEvent NewAppVersionAvailableUpdateClicked;
	public static final AnalyticsEvent NewAppVersionAvailableViewed;
	public static final AnalyticsEvent NotificationBackSelected;
	public static final AnalyticsEvent NotificationBackSmartScheduleSelected;
	public static final AnalyticsEvent NotificationCenterBellIconPressed;
	public static final AnalyticsEvent NotificationCenterSmartScheduleAccepted;
	public static final AnalyticsEvent NotificationCenterSmartScheduleDeclined;
	public static final AnalyticsEvent NotificationCenterSmartScheduleMessageClicked;
	public static final AnalyticsEvent NotificationCenterVideoViewed;
	public static final AnalyticsEvent NotificationCenterViewed;
	public static final AnalyticsEvent NotificationFeedback;
	public static final AnalyticsEvent NotificationSelected;
	public static final AnalyticsEvent NotificationSettingsChanged;
	public static final AnalyticsEvent NotificationSettingsViewed;
	public static final AnalyticsEvent OnDemandOtaAvailableHelpButtonPressed;
	public static final AnalyticsEvent OnDemandOtaAvailableViewed;
	public static final AnalyticsEvent OnDemandOtaFailedHelpButtonPressed;
	public static final AnalyticsEvent OnDemandOtaFailedTryAgainButtonPressed;
	public static final AnalyticsEvent OnDemandOtaFailedUpdateLaterButtonPressed;
	public static final AnalyticsEvent OnDemandOtaFailedViewed;
	public static final AnalyticsEvent OnDemandOtaFirmwareUpdateAvailableFinished;
	public static final AnalyticsEvent OnDemandOtaFirmwareUpdateError;
	public static final AnalyticsEvent OnDemandOtaFirmwareUpdateInstallingFinished;
	public static final AnalyticsEvent OnDemandOtaFirmwareUpdateLoadingFinished;
	public static final AnalyticsEvent OnDemandOtaFirmwareUpdateReadyFinished;
	public static final AnalyticsEvent OnDemandOtaFirmwareUpdateSuccessFinished;
	public static final AnalyticsEvent OnDemandOtaInProgressHelpButtonPressed;
	public static final AnalyticsEvent OnDemandOtaInProgressViewed;
	public static final AnalyticsEvent OnDemandOtaSetupCompleteViewed;
	public static final AnalyticsEvent OnDemandOtaSucceededViewed;
	public static final AnalyticsEvent OnDemandOtaUpdateLaterButtonPressed;
	public static final AnalyticsEvent OnDemandOtaUpdateNowButtonPressed;
	public static final AnalyticsEvent OnboardingBegan;
	public static final AnalyticsEvent PMapCustomizeIntroViewed;
	public static final AnalyticsEvent PMapTroubleshootingIncompleteCleanButtonPressed;
	public static final AnalyticsEvent PMapTroubleshootingIncompleteTrainButtonPressed;
	public static final AnalyticsEvent PMapTroubleshootingIncompleteViewed;
	public static final AnalyticsEvent PMapTroubleshootingListViewed;
	public static final AnalyticsEvent PMapTroubleshootingUnderstandingViewed;
	public static final AnalyticsEvent PMapTroubleshootingWrongDeleteButtonPressed;
	public static final AnalyticsEvent PMapTroubleshootingWrongViewed;
	public static final AnalyticsEvent PMapsChooseRoomsButtonPressed;
	public static final AnalyticsEvent PMapsChooseRoomsViewed;
	public static final AnalyticsEvent PMapsCleanButtonIntro1CancelButtonPressed;
	public static final AnalyticsEvent PMapsCleanButtonIntro1NextButtonPressed;
	public static final AnalyticsEvent PMapsCleanButtonIntro1Viewed;
	public static final AnalyticsEvent PMapsCleanButtonIntro2CancelButtonPressed;
	public static final AnalyticsEvent PMapsCleanButtonIntro2CompleteButtonPressed;
	public static final AnalyticsEvent PMapsCleanButtonIntro2Viewed;
	public static final AnalyticsEvent PMapsCustomizeCompleteCleanButtonPressed;
	public static final AnalyticsEvent PMapsCustomizeCompleteScheduleButtonPressed;
	public static final AnalyticsEvent PMapsCustomizeCompleteViewed;
	public static final AnalyticsEvent PMapsCustomizeLabelRoomsCancelButtonPressed;
	public static final AnalyticsEvent PMapsCustomizeLabelRoomsDoneButtonPressed;
	public static final AnalyticsEvent PMapsCustomizeLabelRoomsViewed;
	public static final AnalyticsEvent PMapsCustomizeNameMapCancelButtonPressed;
	public static final AnalyticsEvent PMapsCustomizeNameMapNextButtonPressed;
	public static final AnalyticsEvent PMapsCustomizeNameMapViewed;
	public static final AnalyticsEvent PMapsCustomizeSettingUpInstructionsViewed;
	public static final AnalyticsEvent PMapsCustomizeSetupRoomsCancelButtonPressed;
	public static final AnalyticsEvent PMapsCustomizeSetupRoomsNextButtonPressed;
	public static final AnalyticsEvent PMapsCustomizeSetupRoomsViewed;
	public static final AnalyticsEvent PMapsDirectedRoomCleanStarted;
	public static final AnalyticsEvent PMapsErrorEmptyMap;
	public static final AnalyticsEvent PMapsErrorRegionDuplicatePoints;
	public static final AnalyticsEvent PMapsErrorRoomTooSmall;
	public static final AnalyticsEvent PMapsErrorSaveFloorNameTimedOut;
	public static final AnalyticsEvent PMapsErrorSaveTimedOut;
	public static final AnalyticsEvent PMapsErrorSegmentationTransferFailed;
	public static final AnalyticsEvent PMapsErrorSplitInvalidMap;
	public static final AnalyticsEvent PMapsSectionIntro1CancelButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro1NextButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro1Viewed;
	public static final AnalyticsEvent PMapsSectionIntro2CancelButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro2NextButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro2Viewed;
	public static final AnalyticsEvent PMapsSectionIntro3ActivateButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro3CancelButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro3Viewed;
	public static final AnalyticsEvent PMapsSectionIntro4AddTrainingRunButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro4CancelButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro4MaybeLaterButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro4Viewed;
	public static final AnalyticsEvent PMapsSectionIntro5CancelButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro5StartTrainingRunButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntro5Viewed;
	public static final AnalyticsEvent PMapsSectionIntroCompleteCancelButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntroCompleteTipsButtonPressed;
	public static final AnalyticsEvent PMapsSectionIntroCompleteViewed;
	public static final AnalyticsEvent PMapsSectionMapListCleanButtonPressed;
	public static final AnalyticsEvent PMapsSectionMapListTrainButtonPressed;
	public static final AnalyticsEvent PMapsSectionMapListViewed;
	public static final AnalyticsEvent PMapsSectionMapPreviewNotRightButtonPressed;
	public static final AnalyticsEvent PMapsSectionMapPreviewViewed;
	public static final AnalyticsEvent PMapsSectionMapReadyCustomizeButtonPressed;
	public static final AnalyticsEvent PMapsSectionMapReadyNotRightButtonPressed;
	public static final AnalyticsEvent PMapsSectionMapReadyViewed;
	public static final AnalyticsEvent PMapsSectionNoMapViewed;
	public static final AnalyticsEvent PMapsSmartMapsButtonPressed;
	public static final AnalyticsEvent PMapsTips1CancelButtonPressed;
	public static final AnalyticsEvent PMapsTips1NextButtonPressed;
	public static final AnalyticsEvent PMapsTips1Viewed;
	public static final AnalyticsEvent PMapsTips2CancelButtonPressed;
	public static final AnalyticsEvent PMapsTips2NextButtonPressed;
	public static final AnalyticsEvent PMapsTips2Viewed;
	public static final AnalyticsEvent PMapsTips3CancelButtonPressed;
	public static final AnalyticsEvent PMapsTips3CompleteButtonPressed;
	public static final AnalyticsEvent PMapsTips3Viewed;
	public static final AnalyticsEvent PMapsTrainingRunPreparationViewed;
	public static final AnalyticsEvent PMapsTrainingRunStarted;
	public static final AnalyticsEvent PrivacyViewed;
	public static final AnalyticsEvent ProvActivateRoombaConfirmation;
	public static final AnalyticsEvent ProvActivateRoombaContinueButtonPressed;
	public static final AnalyticsEvent ProvActivateRoombaViewed;
	public static final AnalyticsEvent ProvAddRobotSelected;
	public static final AnalyticsEvent ProvAddRobotViewed;
	public static final AnalyticsEvent ProvAdvancedWifiSettingsViewed;
	public static final AnalyticsEvent ProvBleDiscoveryResult;
	public static final AnalyticsEvent ProvBleDiscoveryViewed;
	public static final AnalyticsEvent ProvCancelButtonPressed;
	public static final AnalyticsEvent ProvConnectToRoombaViewed;
	public static final AnalyticsEvent ProvCurrentNetworkChangeButtonPressed;
	public static final AnalyticsEvent ProvCurrentNetworkViewed;
	public static final AnalyticsEvent ProvEnableBluetoothErrorViewed;
	public static final AnalyticsEvent ProvError;
	public static final AnalyticsEvent ProvErrorViewed;
	public static final AnalyticsEvent ProvFinished;
	public static final AnalyticsEvent ProvHomeBasePlacementViewed;
	public static final AnalyticsEvent ProvInfoButtonPressed;
	public static final AnalyticsEvent ProvRobotNameDone;
	public static final AnalyticsEvent ProvRobotNameViewed;
	public static final AnalyticsEvent ProvSetupChecklistViewed;
	public static final AnalyticsEvent ProvStarted;
	public static final AnalyticsEvent ProvStatus;
	public static final AnalyticsEvent ProvStatusActivatingWifi;
	public static final AnalyticsEvent ProvStatusCheckingConfig;
	public static final AnalyticsEvent ProvStatusConnected;
	public static final AnalyticsEvent ProvStatusSendingConfig;
	public static final AnalyticsEvent ProvStatusVerifyingConnection;
	public static final AnalyticsEvent ProvViewed;
	public static final AnalyticsEvent ProvWifiPasswordDone;
	public static final AnalyticsEvent ProvWifiPasswordViewed;
	public static final AnalyticsEvent ReActivateAppOverviewPressed;
	public static final AnalyticsEvent ReAddRobotPressedAfterBlidHealing;
	public static final AnalyticsEvent ReducedPowerStandbyModeViewed;
	public static final AnalyticsEvent RemoveRobotViewed;
	public static final AnalyticsEvent ResetRobotViewed;
	public static final AnalyticsEvent RobotAdded;
	public static final AnalyticsEvent RobotHealedMessageViewed;
	public static final AnalyticsEvent RobotRemoved;
	public static final AnalyticsEvent RoombaCleanMissionStarted;
	public static final AnalyticsEvent RoombaProvisioningFinished;
	public static final AnalyticsEvent RoombaSetupActivateRoombaViewed;
	public static final AnalyticsEvent RoombaSetupAdvancedWifiInfoViewed;
	public static final AnalyticsEvent RoombaSetupChecklistViewed;
	public static final AnalyticsEvent RoombaSetupConnectToRoombaViewed;
	public static final AnalyticsEvent RoombaSetupCustomerRegistrationViewed;
	public static final AnalyticsEvent RoombaSetupDockPlacementViewed;
	public static final AnalyticsEvent RoombaSetupFinished;
	public static final AnalyticsEvent RoombaSetupProvisioningErrorViewed;
	public static final AnalyticsEvent RoombaSetupProvisioningViewed;
	public static final AnalyticsEvent RoombaSetupWifiInfoViewed;
	public static final AnalyticsEvent RoombaV1ProvisioningError;
	public static final AnalyticsEvent RoombaV2ProvisioningError;
	public static final AnalyticsEvent RoombaV2ProvisioningPart1;
	public static final AnalyticsEvent RoombaV2ProvisioningPart2;
	public static final AnalyticsEvent RoombaV2ProvisioningPart3;
	public static final AnalyticsEvent RoombaV2ProvisioningPart4;
	public static final AnalyticsEvent RoombaV2ProvisioningPart5;
	public static final AnalyticsEvent RoombaWelcomeVideoViewed;
	public static final AnalyticsEvent ScheduleChanged;
	public static final AnalyticsEvent ScheduleViewed;
	public static final AnalyticsEvent SettingsViewed;
	public static final AnalyticsEvent SideMenuViewed;
	public static final AnalyticsEvent StoreViewed;
	public static final AnalyticsEvent UpdateProfileViewed;
	public static final AnalyticsEvent UserLoggedIn;
	public static final AnalyticsEvent UserLoggedOut;
	public static final AnalyticsEvent UserTermsLinkPressed;
	public static final AnalyticsEvent WiFiSettingsViewed;
	public static final AnalyticsEvent WifiCoverageMapScreenViewed;
	public static final AnalyticsEvent WifiCoverageToggled;
	public static final AnalyticsEvent WifiMapBottomSheetViewed;
	public static final AnalyticsEvent WifiMapFeedbackResponseGiven;
	public static final AnalyticsEvent WifiMapTabViewed;

	static 
	{
		RobotHealedMessageViewed = new AnalyticsEvent("RobotHealedMessageViewed", 0);
	//    0    0:new             #2   <Class AnalyticsEvent>
	//    1    3:dup             
	//    2    4:ldc2            #302 <String "RobotHealedMessageViewed">
	//    3    7:iconst_0        
	//    4    8:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//    5   11:putstatic       #308 <Field AnalyticsEvent RobotHealedMessageViewed>
		ReAddRobotPressedAfterBlidHealing = new AnalyticsEvent("ReAddRobotPressedAfterBlidHealing", 1);
	//    6   14:new             #2   <Class AnalyticsEvent>
	//    7   17:dup             
	//    8   18:ldc2            #309 <String "ReAddRobotPressedAfterBlidHealing">
	//    9   21:iconst_1        
	//   10   22:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   11   25:putstatic       #311 <Field AnalyticsEvent ReAddRobotPressedAfterBlidHealing>
		RoombaCleanMissionStarted = new AnalyticsEvent("RoombaCleanMissionStarted", 2);
	//   12   28:new             #2   <Class AnalyticsEvent>
	//   13   31:dup             
	//   14   32:ldc2            #312 <String "RoombaCleanMissionStarted">
	//   15   35:iconst_2        
	//   16   36:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   17   39:putstatic       #314 <Field AnalyticsEvent RoombaCleanMissionStarted>
		BraavaCleanMissionStarted = new AnalyticsEvent("BraavaCleanMissionStarted", 3);
	//   18   42:new             #2   <Class AnalyticsEvent>
	//   19   45:dup             
	//   20   46:ldc2            #315 <String "BraavaCleanMissionStarted">
	//   21   49:iconst_3        
	//   22   50:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   23   53:putstatic       #317 <Field AnalyticsEvent BraavaCleanMissionStarted>
		HistorySummaryView = new AnalyticsEvent("HistorySummaryView", 4);
	//   24   56:new             #2   <Class AnalyticsEvent>
	//   25   59:dup             
	//   26   60:ldc2            #318 <String "HistorySummaryView">
	//   27   63:iconst_4        
	//   28   64:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   29   67:putstatic       #320 <Field AnalyticsEvent HistorySummaryView>
		HistoryDetailView = new AnalyticsEvent("HistoryDetailView", 5);
	//   30   70:new             #2   <Class AnalyticsEvent>
	//   31   73:dup             
	//   32   74:ldc2            #321 <String "HistoryDetailView">
	//   33   77:iconst_5        
	//   34   78:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   35   81:putstatic       #323 <Field AnalyticsEvent HistoryDetailView>
		AppLaunched = new AnalyticsEvent("AppLaunched", 6);
	//   36   84:new             #2   <Class AnalyticsEvent>
	//   37   87:dup             
	//   38   88:ldc2            #324 <String "AppLaunched">
	//   39   91:bipush          6
	//   40   93:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   41   96:putstatic       #326 <Field AnalyticsEvent AppLaunched>
		AppLaunchedAfterAppInstall = new AnalyticsEvent("AppLaunchedAfterAppInstall", 7);
	//   42   99:new             #2   <Class AnalyticsEvent>
	//   43  102:dup             
	//   44  103:ldc2            #327 <String "AppLaunchedAfterAppInstall">
	//   45  106:bipush          7
	//   46  108:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   47  111:putstatic       #329 <Field AnalyticsEvent AppLaunchedAfterAppInstall>
		AppLaunchedAfterAppUpgrade = new AnalyticsEvent("AppLaunchedAfterAppUpgrade", 8);
	//   48  114:new             #2   <Class AnalyticsEvent>
	//   49  117:dup             
	//   50  118:ldc2            #330 <String "AppLaunchedAfterAppUpgrade">
	//   51  121:bipush          8
	//   52  123:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   53  126:putstatic       #332 <Field AnalyticsEvent AppLaunchedAfterAppUpgrade>
		AppForegrounded = new AnalyticsEvent("AppForegrounded", 9);
	//   54  129:new             #2   <Class AnalyticsEvent>
	//   55  132:dup             
	//   56  133:ldc2            #333 <String "AppForegrounded">
	//   57  136:bipush          9
	//   58  138:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   59  141:putstatic       #335 <Field AnalyticsEvent AppForegrounded>
		AppBackgrounded = new AnalyticsEvent("AppBackgrounded", 10);
	//   60  144:new             #2   <Class AnalyticsEvent>
	//   61  147:dup             
	//   62  148:ldc2            #336 <String "AppBackgrounded">
	//   63  151:bipush          10
	//   64  153:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   65  156:putstatic       #338 <Field AnalyticsEvent AppBackgrounded>
		BadgedAppOpened = new AnalyticsEvent("BadgedAppOpened", 11);
	//   66  159:new             #2   <Class AnalyticsEvent>
	//   67  162:dup             
	//   68  163:ldc2            #339 <String "BadgedAppOpened">
	//   69  166:bipush          11
	//   70  168:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   71  171:putstatic       #341 <Field AnalyticsEvent BadgedAppOpened>
		RobotAdded = new AnalyticsEvent("RobotAdded", 12);
	//   72  174:new             #2   <Class AnalyticsEvent>
	//   73  177:dup             
	//   74  178:ldc2            #342 <String "RobotAdded">
	//   75  181:bipush          12
	//   76  183:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   77  186:putstatic       #344 <Field AnalyticsEvent RobotAdded>
		RobotRemoved = new AnalyticsEvent("RobotRemoved", 13);
	//   78  189:new             #2   <Class AnalyticsEvent>
	//   79  192:dup             
	//   80  193:ldc2            #345 <String "RobotRemoved">
	//   81  196:bipush          13
	//   82  198:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   83  201:putstatic       #347 <Field AnalyticsEvent RobotRemoved>
		ScheduleViewed = new AnalyticsEvent("ScheduleViewed", 14);
	//   84  204:new             #2   <Class AnalyticsEvent>
	//   85  207:dup             
	//   86  208:ldc2            #348 <String "ScheduleViewed">
	//   87  211:bipush          14
	//   88  213:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   89  216:putstatic       #350 <Field AnalyticsEvent ScheduleViewed>
		ScheduleChanged = new AnalyticsEvent("ScheduleChanged", 15);
	//   90  219:new             #2   <Class AnalyticsEvent>
	//   91  222:dup             
	//   92  223:ldc2            #351 <String "ScheduleChanged">
	//   93  226:bipush          15
	//   94  228:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//   95  231:putstatic       #353 <Field AnalyticsEvent ScheduleChanged>
		CleaningPreferencesView = new AnalyticsEvent("CleaningPreferencesView", 16);
	//   96  234:new             #2   <Class AnalyticsEvent>
	//   97  237:dup             
	//   98  238:ldc2            #354 <String "CleaningPreferencesView">
	//   99  241:bipush          16
	//  100  243:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  101  246:putstatic       #356 <Field AnalyticsEvent CleaningPreferencesView>
		FinishWhenBinFullSettingChanged = new AnalyticsEvent("FinishWhenBinFullSettingChanged", 17);
	//  102  249:new             #2   <Class AnalyticsEvent>
	//  103  252:dup             
	//  104  253:ldc2            #357 <String "FinishWhenBinFullSettingChanged">
	//  105  256:bipush          17
	//  106  258:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  107  261:putstatic       #359 <Field AnalyticsEvent FinishWhenBinFullSettingChanged>
		EdgeCleanSettingChanged = new AnalyticsEvent("EdgeCleanSettingChanged", 18);
	//  108  264:new             #2   <Class AnalyticsEvent>
	//  109  267:dup             
	//  110  268:ldc2            #360 <String "EdgeCleanSettingChanged">
	//  111  271:bipush          18
	//  112  273:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  113  276:putstatic       #362 <Field AnalyticsEvent EdgeCleanSettingChanged>
		CarpetBoostSettingsView = new AnalyticsEvent("CarpetBoostSettingsView", 19);
	//  114  279:new             #2   <Class AnalyticsEvent>
	//  115  282:dup             
	//  116  283:ldc2            #363 <String "CarpetBoostSettingsView">
	//  117  286:bipush          19
	//  118  288:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  119  291:putstatic       #365 <Field AnalyticsEvent CarpetBoostSettingsView>
		CarpetBoostSettingChanged = new AnalyticsEvent("CarpetBoostSettingChanged", 20);
	//  120  294:new             #2   <Class AnalyticsEvent>
	//  121  297:dup             
	//  122  298:ldc2            #366 <String "CarpetBoostSettingChanged">
	//  123  301:bipush          20
	//  124  303:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  125  306:putstatic       #368 <Field AnalyticsEvent CarpetBoostSettingChanged>
		CleaningPassSettingsView = new AnalyticsEvent("CleaningPassSettingsView", 21);
	//  126  309:new             #2   <Class AnalyticsEvent>
	//  127  312:dup             
	//  128  313:ldc2            #369 <String "CleaningPassSettingsView">
	//  129  316:bipush          21
	//  130  318:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  131  321:putstatic       #371 <Field AnalyticsEvent CleaningPassSettingsView>
		CleaningPassSettingChanged = new AnalyticsEvent("CleaningPassSettingChanged", 22);
	//  132  324:new             #2   <Class AnalyticsEvent>
	//  133  327:dup             
	//  134  328:ldc2            #372 <String "CleaningPassSettingChanged">
	//  135  331:bipush          22
	//  136  333:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  137  336:putstatic       #374 <Field AnalyticsEvent CleaningPassSettingChanged>
		CleaningPresetSettingChanged = new AnalyticsEvent("CleaningPresetSettingChanged", 23);
	//  138  339:new             #2   <Class AnalyticsEvent>
	//  139  342:dup             
	//  140  343:ldc2            #375 <String "CleaningPresetSettingChanged">
	//  141  346:bipush          23
	//  142  348:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  143  351:putstatic       #377 <Field AnalyticsEvent CleaningPresetSettingChanged>
		CleaningPreferencesDefaultsRestored = new AnalyticsEvent("CleaningPreferencesDefaultsRestored", 24);
	//  144  354:new             #2   <Class AnalyticsEvent>
	//  145  357:dup             
	//  146  358:ldc2            #378 <String "CleaningPreferencesDefaultsRestored">
	//  147  361:bipush          24
	//  148  363:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  149  366:putstatic       #380 <Field AnalyticsEvent CleaningPreferencesDefaultsRestored>
		MoreViewed = new AnalyticsEvent("MoreViewed", 25);
	//  150  369:new             #2   <Class AnalyticsEvent>
	//  151  372:dup             
	//  152  373:ldc2            #381 <String "MoreViewed">
	//  153  376:bipush          25
	//  154  378:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  155  381:putstatic       #383 <Field AnalyticsEvent MoreViewed>
		CareViewed = new AnalyticsEvent("CareViewed", 26);
	//  156  384:new             #2   <Class AnalyticsEvent>
	//  157  387:dup             
	//  158  388:ldc2            #384 <String "CareViewed">
	//  159  391:bipush          26
	//  160  393:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  161  396:putstatic       #386 <Field AnalyticsEvent CareViewed>
		HelpViewed = new AnalyticsEvent("HelpViewed", 27);
	//  162  399:new             #2   <Class AnalyticsEvent>
	//  163  402:dup             
	//  164  403:ldc2            #387 <String "HelpViewed">
	//  165  406:bipush          27
	//  166  408:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  167  411:putstatic       #389 <Field AnalyticsEvent HelpViewed>
		SettingsViewed = new AnalyticsEvent("SettingsViewed", 28);
	//  168  414:new             #2   <Class AnalyticsEvent>
	//  169  417:dup             
	//  170  418:ldc2            #390 <String "SettingsViewed">
	//  171  421:bipush          28
	//  172  423:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  173  426:putstatic       #392 <Field AnalyticsEvent SettingsViewed>
		LocateRoombaButtonPressed = new AnalyticsEvent("LocateRoombaButtonPressed", 29);
	//  174  429:new             #2   <Class AnalyticsEvent>
	//  175  432:dup             
	//  176  433:ldc2            #393 <String "LocateRoombaButtonPressed">
	//  177  436:bipush          29
	//  178  438:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  179  441:putstatic       #395 <Field AnalyticsEvent LocateRoombaButtonPressed>
		SideMenuViewed = new AnalyticsEvent("SideMenuViewed", 30);
	//  180  444:new             #2   <Class AnalyticsEvent>
	//  181  447:dup             
	//  182  448:ldc2            #396 <String "SideMenuViewed">
	//  183  451:bipush          30
	//  184  453:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  185  456:putstatic       #398 <Field AnalyticsEvent SideMenuViewed>
		StoreViewed = new AnalyticsEvent("StoreViewed", 31);
	//  186  459:new             #2   <Class AnalyticsEvent>
	//  187  462:dup             
	//  188  463:ldc2            #399 <String "StoreViewed">
	//  189  466:bipush          31
	//  190  468:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  191  471:putstatic       #401 <Field AnalyticsEvent StoreViewed>
		CloudButtonPressed = new AnalyticsEvent("CloudButtonPressed", 32);
	//  192  474:new             #2   <Class AnalyticsEvent>
	//  193  477:dup             
	//  194  478:ldc2            #402 <String "CloudButtonPressed">
	//  195  481:bipush          32
	//  196  483:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  197  486:putstatic       #404 <Field AnalyticsEvent CloudButtonPressed>
		CareResetStatusButtonPressed = new AnalyticsEvent("CareResetStatusButtonPressed", 33);
	//  198  489:new             #2   <Class AnalyticsEvent>
	//  199  492:dup             
	//  200  493:ldc2            #405 <String "CareResetStatusButtonPressed">
	//  201  496:bipush          33
	//  202  498:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  203  501:putstatic       #407 <Field AnalyticsEvent CareResetStatusButtonPressed>
		CareStepByStepGuideViewed = new AnalyticsEvent("CareStepByStepGuideViewed", 34);
	//  204  504:new             #2   <Class AnalyticsEvent>
	//  205  507:dup             
	//  206  508:ldc2            #408 <String "CareStepByStepGuideViewed">
	//  207  511:bipush          34
	//  208  513:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  209  516:putstatic       #410 <Field AnalyticsEvent CareStepByStepGuideViewed>
		HistorySummaryTabChanged = new AnalyticsEvent("HistorySummaryTabChanged", 35);
	//  210  519:new             #2   <Class AnalyticsEvent>
	//  211  522:dup             
	//  212  523:ldc2            #411 <String "HistorySummaryTabChanged">
	//  213  526:bipush          35
	//  214  528:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  215  531:putstatic       #413 <Field AnalyticsEvent HistorySummaryTabChanged>
		CleanScreenErrorIndicatorPressed = new AnalyticsEvent("CleanScreenErrorIndicatorPressed", 36);
	//  216  534:new             #2   <Class AnalyticsEvent>
	//  217  537:dup             
	//  218  538:ldc2            #414 <String "CleanScreenErrorIndicatorPressed">
	//  219  541:bipush          36
	//  220  543:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  221  546:putstatic       #416 <Field AnalyticsEvent CleanScreenErrorIndicatorPressed>
		MissionHistoryDetailBottomSheetView = new AnalyticsEvent("MissionHistoryDetailBottomSheetView", 37);
	//  222  549:new             #2   <Class AnalyticsEvent>
	//  223  552:dup             
	//  224  553:ldc2            #417 <String "MissionHistoryDetailBottomSheetView">
	//  225  556:bipush          37
	//  226  558:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  227  561:putstatic       #419 <Field AnalyticsEvent MissionHistoryDetailBottomSheetView>
		LifetimeHistoryInfoButtonPressed = new AnalyticsEvent("LifetimeHistoryInfoButtonPressed", 38);
	//  228  564:new             #2   <Class AnalyticsEvent>
	//  229  567:dup             
	//  230  568:ldc2            #420 <String "LifetimeHistoryInfoButtonPressed">
	//  231  571:bipush          38
	//  232  573:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  233  576:putstatic       #422 <Field AnalyticsEvent LifetimeHistoryInfoButtonPressed>
		HistoryMissionMapRated = new AnalyticsEvent("HistoryMissionMapRated", 39);
	//  234  579:new             #2   <Class AnalyticsEvent>
	//  235  582:dup             
	//  236  583:ldc2            #423 <String "HistoryMissionMapRated">
	//  237  586:bipush          39
	//  238  588:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  239  591:putstatic       #425 <Field AnalyticsEvent HistoryMissionMapRated>
		HistoryDetailErrorIndicatorPressed = new AnalyticsEvent("HistoryDetailErrorIndicatorPressed", 40);
	//  240  594:new             #2   <Class AnalyticsEvent>
	//  241  597:dup             
	//  242  598:ldc2            #426 <String "HistoryDetailErrorIndicatorPressed">
	//  243  601:bipush          40
	//  244  603:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  245  606:putstatic       #428 <Field AnalyticsEvent HistoryDetailErrorIndicatorPressed>
		CleanMapEnabledSettingChanged = new AnalyticsEvent("CleanMapEnabledSettingChanged", 41);
	//  246  609:new             #2   <Class AnalyticsEvent>
	//  247  612:dup             
	//  248  613:ldc2            #429 <String "CleanMapEnabledSettingChanged">
	//  249  616:bipush          41
	//  250  618:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  251  621:putstatic       #431 <Field AnalyticsEvent CleanMapEnabledSettingChanged>
		OnboardingBegan = new AnalyticsEvent("OnboardingBegan", 42);
	//  252  624:new             #2   <Class AnalyticsEvent>
	//  253  627:dup             
	//  254  628:ldc2            #432 <String "OnboardingBegan">
	//  255  631:bipush          42
	//  256  633:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  257  636:putstatic       #434 <Field AnalyticsEvent OnboardingBegan>
		AppWelcomeViewed = new AnalyticsEvent("AppWelcomeViewed", 43);
	//  258  639:new             #2   <Class AnalyticsEvent>
	//  259  642:dup             
	//  260  643:ldc2            #435 <String "AppWelcomeViewed">
	//  261  646:bipush          43
	//  262  648:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  263  651:putstatic       #437 <Field AnalyticsEvent AppWelcomeViewed>
		AccountOptionsViewed = new AnalyticsEvent("AccountOptionsViewed", 44);
	//  264  654:new             #2   <Class AnalyticsEvent>
	//  265  657:dup             
	//  266  658:ldc2            #438 <String "AccountOptionsViewed">
	//  267  661:bipush          44
	//  268  663:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  269  666:putstatic       #440 <Field AnalyticsEvent AccountOptionsViewed>
		CountryPickerViewed = new AnalyticsEvent("CountryPickerViewed", 45);
	//  270  669:new             #2   <Class AnalyticsEvent>
	//  271  672:dup             
	//  272  673:ldc2            #441 <String "CountryPickerViewed">
	//  273  676:bipush          45
	//  274  678:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  275  681:putstatic       #443 <Field AnalyticsEvent CountryPickerViewed>
		LoginViewed = new AnalyticsEvent("LoginViewed", 46);
	//  276  684:new             #2   <Class AnalyticsEvent>
	//  277  687:dup             
	//  278  688:ldc2            #444 <String "LoginViewed">
	//  279  691:bipush          46
	//  280  693:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  281  696:putstatic       #446 <Field AnalyticsEvent LoginViewed>
		CreateAccountViewed = new AnalyticsEvent("CreateAccountViewed", 47);
	//  282  699:new             #2   <Class AnalyticsEvent>
	//  283  702:dup             
	//  284  703:ldc2            #447 <String "CreateAccountViewed">
	//  285  706:bipush          47
	//  286  708:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  287  711:putstatic       #449 <Field AnalyticsEvent CreateAccountViewed>
		UserLoggedIn = new AnalyticsEvent("UserLoggedIn", 48);
	//  288  714:new             #2   <Class AnalyticsEvent>
	//  289  717:dup             
	//  290  718:ldc2            #450 <String "UserLoggedIn">
	//  291  721:bipush          48
	//  292  723:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  293  726:putstatic       #452 <Field AnalyticsEvent UserLoggedIn>
		UserLoggedOut = new AnalyticsEvent("UserLoggedOut", 49);
	//  294  729:new             #2   <Class AnalyticsEvent>
	//  295  732:dup             
	//  296  733:ldc2            #453 <String "UserLoggedOut">
	//  297  736:bipush          49
	//  298  738:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  299  741:putstatic       #455 <Field AnalyticsEvent UserLoggedOut>
		CreateAccountLaterButtonPressed = new AnalyticsEvent("CreateAccountLaterButtonPressed", 50);
	//  300  744:new             #2   <Class AnalyticsEvent>
	//  301  747:dup             
	//  302  748:ldc2            #456 <String "CreateAccountLaterButtonPressed">
	//  303  751:bipush          50
	//  304  753:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  305  756:putstatic       #458 <Field AnalyticsEvent CreateAccountLaterButtonPressed>
		CreateAccountFromSideMenuViewed = new AnalyticsEvent("CreateAccountFromSideMenuViewed", 51);
	//  306  759:new             #2   <Class AnalyticsEvent>
	//  307  762:dup             
	//  308  763:ldc2            #459 <String "CreateAccountFromSideMenuViewed">
	//  309  766:bipush          51
	//  310  768:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  311  771:putstatic       #461 <Field AnalyticsEvent CreateAccountFromSideMenuViewed>
		UserTermsLinkPressed = new AnalyticsEvent("UserTermsLinkPressed", 52);
	//  312  774:new             #2   <Class AnalyticsEvent>
	//  313  777:dup             
	//  314  778:ldc2            #462 <String "UserTermsLinkPressed">
	//  315  781:bipush          52
	//  316  783:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  317  786:putstatic       #464 <Field AnalyticsEvent UserTermsLinkPressed>
		CareBinViewed = new AnalyticsEvent("CareBinViewed", 53);
	//  318  789:new             #2   <Class AnalyticsEvent>
	//  319  792:dup             
	//  320  793:ldc2            #465 <String "CareBinViewed">
	//  321  796:bipush          53
	//  322  798:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  323  801:putstatic       #467 <Field AnalyticsEvent CareBinViewed>
		CareCoreRobotViewed = new AnalyticsEvent("CareCoreRobotViewed", 54);
	//  324  804:new             #2   <Class AnalyticsEvent>
	//  325  807:dup             
	//  326  808:ldc2            #468 <String "CareCoreRobotViewed">
	//  327  811:bipush          54
	//  328  813:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  329  816:putstatic       #470 <Field AnalyticsEvent CareCoreRobotViewed>
		CareDebrisExtractorsViewed = new AnalyticsEvent("CareDebrisExtractorsViewed", 55);
	//  330  819:new             #2   <Class AnalyticsEvent>
	//  331  822:dup             
	//  332  823:ldc2            #471 <String "CareDebrisExtractorsViewed">
	//  333  826:bipush          55
	//  334  828:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  335  831:putstatic       #473 <Field AnalyticsEvent CareDebrisExtractorsViewed>
		AdditionalHelpViewed = new AnalyticsEvent("AdditionalHelpViewed", 56);
	//  336  834:new             #2   <Class AnalyticsEvent>
	//  337  837:dup             
	//  338  838:ldc2            #474 <String "AdditionalHelpViewed">
	//  339  841:bipush          56
	//  340  843:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  341  846:putstatic       #476 <Field AnalyticsEvent AdditionalHelpViewed>
		AdditionalHelpContactButtonPressed = new AnalyticsEvent("AdditionalHelpContactButtonPressed", 57);
	//  342  849:new             #2   <Class AnalyticsEvent>
	//  343  852:dup             
	//  344  853:ldc2            #477 <String "AdditionalHelpContactButtonPressed">
	//  345  856:bipush          57
	//  346  858:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  347  861:putstatic       #479 <Field AnalyticsEvent AdditionalHelpContactButtonPressed>
		AboutThisAppViewed = new AnalyticsEvent("AboutThisAppViewed", 58);
	//  348  864:new             #2   <Class AnalyticsEvent>
	//  349  867:dup             
	//  350  868:ldc2            #480 <String "AboutThisAppViewed">
	//  351  871:bipush          58
	//  352  873:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  353  876:putstatic       #482 <Field AnalyticsEvent AboutThisAppViewed>
		AboutThisAppEulaViewed = new AnalyticsEvent("AboutThisAppEulaViewed", 59);
	//  354  879:new             #2   <Class AnalyticsEvent>
	//  355  882:dup             
	//  356  883:ldc2            #483 <String "AboutThisAppEulaViewed">
	//  357  886:bipush          59
	//  358  888:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  359  891:putstatic       #485 <Field AnalyticsEvent AboutThisAppEulaViewed>
		AboutThisAppFollowButtonPressed = new AnalyticsEvent("AboutThisAppFollowButtonPressed", 60);
	//  360  894:new             #2   <Class AnalyticsEvent>
	//  361  897:dup             
	//  362  898:ldc2            #486 <String "AboutThisAppFollowButtonPressed">
	//  363  901:bipush          60
	//  364  903:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  365  906:putstatic       #488 <Field AnalyticsEvent AboutThisAppFollowButtonPressed>
		CommonQuestionsViewed = new AnalyticsEvent("CommonQuestionsViewed", 61);
	//  366  909:new             #2   <Class AnalyticsEvent>
	//  367  912:dup             
	//  368  913:ldc2            #489 <String "CommonQuestionsViewed">
	//  369  916:bipush          61
	//  370  918:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  371  921:putstatic       #491 <Field AnalyticsEvent CommonQuestionsViewed>
		AnyCommonQuestionsOpened = new AnalyticsEvent("AnyCommonQuestionsOpened", 62);
	//  372  924:new             #2   <Class AnalyticsEvent>
	//  373  927:dup             
	//  374  928:ldc2            #492 <String "AnyCommonQuestionsOpened">
	//  375  931:bipush          62
	//  376  933:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  377  936:putstatic       #494 <Field AnalyticsEvent AnyCommonQuestionsOpened>
		HelpVideoWatched = new AnalyticsEvent("HelpVideoWatched", 63);
	//  378  939:new             #2   <Class AnalyticsEvent>
	//  379  942:dup             
	//  380  943:ldc2            #495 <String "HelpVideoWatched">
	//  381  946:bipush          63
	//  382  948:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  383  951:putstatic       #497 <Field AnalyticsEvent HelpVideoWatched>
		HelpDocumentViewed = new AnalyticsEvent("HelpDocumentViewed", 64);
	//  384  954:new             #2   <Class AnalyticsEvent>
	//  385  957:dup             
	//  386  958:ldc2            #498 <String "HelpDocumentViewed">
	//  387  961:bipush          64
	//  388  963:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  389  966:putstatic       #500 <Field AnalyticsEvent HelpDocumentViewed>
		ReActivateAppOverviewPressed = new AnalyticsEvent("ReActivateAppOverviewPressed", 65);
	//  390  969:new             #2   <Class AnalyticsEvent>
	//  391  972:dup             
	//  392  973:ldc2            #501 <String "ReActivateAppOverviewPressed">
	//  393  976:bipush          65
	//  394  978:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  395  981:putstatic       #503 <Field AnalyticsEvent ReActivateAppOverviewPressed>
		WiFiSettingsViewed = new AnalyticsEvent("WiFiSettingsViewed", 66);
	//  396  984:new             #2   <Class AnalyticsEvent>
	//  397  987:dup             
	//  398  988:ldc2            #504 <String "WiFiSettingsViewed">
	//  399  991:bipush          66
	//  400  993:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  401  996:putstatic       #506 <Field AnalyticsEvent WiFiSettingsViewed>
		ReducedPowerStandbyModeViewed = new AnalyticsEvent("ReducedPowerStandbyModeViewed", 67);
	//  402  999:new             #2   <Class AnalyticsEvent>
	//  403 1002:dup             
	//  404 1003:ldc2            #507 <String "ReducedPowerStandbyModeViewed">
	//  405 1006:bipush          67
	//  406 1008:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  407 1011:putstatic       #509 <Field AnalyticsEvent ReducedPowerStandbyModeViewed>
		AboutRobotViewed = new AnalyticsEvent("AboutRobotViewed", 68);
	//  408 1014:new             #2   <Class AnalyticsEvent>
	//  409 1017:dup             
	//  410 1018:ldc2            #510 <String "AboutRobotViewed">
	//  411 1021:bipush          68
	//  412 1023:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  413 1026:putstatic       #512 <Field AnalyticsEvent AboutRobotViewed>
		RemoveRobotViewed = new AnalyticsEvent("RemoveRobotViewed", 69);
	//  414 1029:new             #2   <Class AnalyticsEvent>
	//  415 1032:dup             
	//  416 1033:ldc2            #513 <String "RemoveRobotViewed">
	//  417 1036:bipush          69
	//  418 1038:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  419 1041:putstatic       #515 <Field AnalyticsEvent RemoveRobotViewed>
		ResetRobotViewed = new AnalyticsEvent("ResetRobotViewed", 70);
	//  420 1044:new             #2   <Class AnalyticsEvent>
	//  421 1047:dup             
	//  422 1048:ldc2            #516 <String "ResetRobotViewed">
	//  423 1051:bipush          70
	//  424 1053:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  425 1056:putstatic       #518 <Field AnalyticsEvent ResetRobotViewed>
		CleanMapInteraction = new AnalyticsEvent("CleanMapInteraction", 71);
	//  426 1059:new             #2   <Class AnalyticsEvent>
	//  427 1062:dup             
	//  428 1063:ldc2            #519 <String "CleanMapInteraction">
	//  429 1066:bipush          71
	//  430 1068:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  431 1071:putstatic       #521 <Field AnalyticsEvent CleanMapInteraction>
		ConnectedHomeViewed = new AnalyticsEvent("ConnectedHomeViewed", 72);
	//  432 1074:new             #2   <Class AnalyticsEvent>
	//  433 1077:dup             
	//  434 1078:ldc2            #522 <String "ConnectedHomeViewed">
	//  435 1081:bipush          72
	//  436 1083:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  437 1086:putstatic       #524 <Field AnalyticsEvent ConnectedHomeViewed>
		CommandTimedOut = new AnalyticsEvent("CommandTimedOut", 73);
	//  438 1089:new             #2   <Class AnalyticsEvent>
	//  439 1092:dup             
	//  440 1093:ldc2            #525 <String "CommandTimedOut">
	//  441 1096:bipush          73
	//  442 1098:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  443 1101:putstatic       #527 <Field AnalyticsEvent CommandTimedOut>
		HeartBeatMissed = new AnalyticsEvent("HeartBeatMissed", 74);
	//  444 1104:new             #2   <Class AnalyticsEvent>
	//  445 1107:dup             
	//  446 1108:ldc2            #528 <String "HeartBeatMissed">
	//  447 1111:bipush          74
	//  448 1113:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  449 1116:putstatic       #530 <Field AnalyticsEvent HeartBeatMissed>
		AccountError = new AnalyticsEvent("AccountError", 75);
	//  450 1119:new             #2   <Class AnalyticsEvent>
	//  451 1122:dup             
	//  452 1123:ldc2            #531 <String "AccountError">
	//  453 1126:bipush          75
	//  454 1128:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  455 1131:putstatic       #533 <Field AnalyticsEvent AccountError>
		BraavaSpotCleanViewed = new AnalyticsEvent("BraavaSpotCleanViewed", 76);
	//  456 1134:new             #2   <Class AnalyticsEvent>
	//  457 1137:dup             
	//  458 1138:ldc2            #534 <String "BraavaSpotCleanViewed">
	//  459 1141:bipush          76
	//  460 1143:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  461 1146:putstatic       #536 <Field AnalyticsEvent BraavaSpotCleanViewed>
		BraavaSpotCleanPressed = new AnalyticsEvent("BraavaSpotCleanPressed", 77);
	//  462 1149:new             #2   <Class AnalyticsEvent>
	//  463 1152:dup             
	//  464 1153:ldc2            #537 <String "BraavaSpotCleanPressed">
	//  465 1156:bipush          77
	//  466 1158:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  467 1161:putstatic       #539 <Field AnalyticsEvent BraavaSpotCleanPressed>
		BraavaPadOptionsViewed = new AnalyticsEvent("BraavaPadOptionsViewed", 78);
	//  468 1164:new             #2   <Class AnalyticsEvent>
	//  469 1167:dup             
	//  470 1168:ldc2            #540 <String "BraavaPadOptionsViewed">
	//  471 1171:bipush          78
	//  472 1173:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  473 1176:putstatic       #542 <Field AnalyticsEvent BraavaPadOptionsViewed>
		BraavaPadOptionsChanged = new AnalyticsEvent("BraavaPadOptionsChanged", 79);
	//  474 1179:new             #2   <Class AnalyticsEvent>
	//  475 1182:dup             
	//  476 1183:ldc2            #543 <String "BraavaPadOptionsChanged">
	//  477 1186:bipush          79
	//  478 1188:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  479 1191:putstatic       #545 <Field AnalyticsEvent BraavaPadOptionsChanged>
		BraavaStoreButtonPressed = new AnalyticsEvent("BraavaStoreButtonPressed", 80);
	//  480 1194:new             #2   <Class AnalyticsEvent>
	//  481 1197:dup             
	//  482 1198:ldc2            #546 <String "BraavaStoreButtonPressed">
	//  483 1201:bipush          80
	//  484 1203:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  485 1206:putstatic       #548 <Field AnalyticsEvent BraavaStoreButtonPressed>
		AppServiceDiscoveryResult = new AnalyticsEvent("AppServiceDiscoveryResult", 81);
	//  486 1209:new             #2   <Class AnalyticsEvent>
	//  487 1212:dup             
	//  488 1213:ldc2            #549 <String "AppServiceDiscoveryResult">
	//  489 1216:bipush          81
	//  490 1218:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  491 1221:putstatic       #551 <Field AnalyticsEvent AppServiceDiscoveryResult>
		AppServiceDiscoverySummary = new AnalyticsEvent("AppServiceDiscoverySummary", 82);
	//  492 1224:new             #2   <Class AnalyticsEvent>
	//  493 1227:dup             
	//  494 1228:ldc2            #552 <String "AppServiceDiscoverySummary">
	//  495 1231:bipush          82
	//  496 1233:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  497 1236:putstatic       #554 <Field AnalyticsEvent AppServiceDiscoverySummary>
		AssetServiceDiscoverySummary = new AnalyticsEvent("AssetServiceDiscoverySummary", 83);
	//  498 1239:new             #2   <Class AnalyticsEvent>
	//  499 1242:dup             
	//  500 1243:ldc2            #555 <String "AssetServiceDiscoverySummary">
	//  501 1246:bipush          83
	//  502 1248:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  503 1251:putstatic       #557 <Field AnalyticsEvent AssetServiceDiscoverySummary>
		AccountInfoRequestResult = new AnalyticsEvent("AccountInfoRequestResult", 84);
	//  504 1254:new             #2   <Class AnalyticsEvent>
	//  505 1257:dup             
	//  506 1258:ldc2            #558 <String "AccountInfoRequestResult">
	//  507 1261:bipush          84
	//  508 1263:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  509 1266:putstatic       #560 <Field AnalyticsEvent AccountInfoRequestResult>
		AccountInfoRequestSummary = new AnalyticsEvent("AccountInfoRequestSummary", 85);
	//  510 1269:new             #2   <Class AnalyticsEvent>
	//  511 1272:dup             
	//  512 1273:ldc2            #561 <String "AccountInfoRequestSummary">
	//  513 1276:bipush          85
	//  514 1278:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  515 1281:putstatic       #563 <Field AnalyticsEvent AccountInfoRequestSummary>
		ExpeditedOtaViewed = new AnalyticsEvent("ExpeditedOtaViewed", 86);
	//  516 1284:new             #2   <Class AnalyticsEvent>
	//  517 1287:dup             
	//  518 1288:ldc2            #564 <String "ExpeditedOtaViewed">
	//  519 1291:bipush          86
	//  520 1293:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  521 1296:putstatic       #566 <Field AnalyticsEvent ExpeditedOtaViewed>
		ExpeditedOtaRequested = new AnalyticsEvent("ExpeditedOtaRequested", 87);
	//  522 1299:new             #2   <Class AnalyticsEvent>
	//  523 1302:dup             
	//  524 1303:ldc2            #567 <String "ExpeditedOtaRequested">
	//  525 1306:bipush          87
	//  526 1308:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  527 1311:putstatic       #569 <Field AnalyticsEvent ExpeditedOtaRequested>
		NewAppVersionAvailableViewed = new AnalyticsEvent("NewAppVersionAvailableViewed", 88);
	//  528 1314:new             #2   <Class AnalyticsEvent>
	//  529 1317:dup             
	//  530 1318:ldc2            #570 <String "NewAppVersionAvailableViewed">
	//  531 1321:bipush          88
	//  532 1323:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  533 1326:putstatic       #572 <Field AnalyticsEvent NewAppVersionAvailableViewed>
		NewAppVersionAvailableUpdateClicked = new AnalyticsEvent("NewAppVersionAvailableUpdateClicked", 89);
	//  534 1329:new             #2   <Class AnalyticsEvent>
	//  535 1332:dup             
	//  536 1333:ldc2            #573 <String "NewAppVersionAvailableUpdateClicked">
	//  537 1336:bipush          89
	//  538 1338:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  539 1341:putstatic       #575 <Field AnalyticsEvent NewAppVersionAvailableUpdateClicked>
		NewAppVersionAvailableSkipClicked = new AnalyticsEvent("NewAppVersionAvailableSkipClicked", 90);
	//  540 1344:new             #2   <Class AnalyticsEvent>
	//  541 1347:dup             
	//  542 1348:ldc2            #576 <String "NewAppVersionAvailableSkipClicked">
	//  543 1351:bipush          90
	//  544 1353:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  545 1356:putstatic       #578 <Field AnalyticsEvent NewAppVersionAvailableSkipClicked>
		AccountServiceUnavailableDialogViewed = new AnalyticsEvent("AccountServiceUnavailableDialogViewed", 91);
	//  546 1359:new             #2   <Class AnalyticsEvent>
	//  547 1362:dup             
	//  548 1363:ldc2            #579 <String "AccountServiceUnavailableDialogViewed">
	//  549 1366:bipush          91
	//  550 1368:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  551 1371:putstatic       #581 <Field AnalyticsEvent AccountServiceUnavailableDialogViewed>
		AccountAndPrivacyViewed = new AnalyticsEvent("AccountAndPrivacyViewed", 92);
	//  552 1374:new             #2   <Class AnalyticsEvent>
	//  553 1377:dup             
	//  554 1378:ldc2            #582 <String "AccountAndPrivacyViewed">
	//  555 1381:bipush          92
	//  556 1383:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  557 1386:putstatic       #584 <Field AnalyticsEvent AccountAndPrivacyViewed>
		ManageAccountViewed = new AnalyticsEvent("ManageAccountViewed", 93);
	//  558 1389:new             #2   <Class AnalyticsEvent>
	//  559 1392:dup             
	//  560 1393:ldc2            #585 <String "ManageAccountViewed">
	//  561 1396:bipush          93
	//  562 1398:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  563 1401:putstatic       #587 <Field AnalyticsEvent ManageAccountViewed>
		UpdateProfileViewed = new AnalyticsEvent("UpdateProfileViewed", 94);
	//  564 1404:new             #2   <Class AnalyticsEvent>
	//  565 1407:dup             
	//  566 1408:ldc2            #588 <String "UpdateProfileViewed">
	//  567 1411:bipush          94
	//  568 1413:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  569 1416:putstatic       #590 <Field AnalyticsEvent UpdateProfileViewed>
		AccountProfileUpdated = new AnalyticsEvent("AccountProfileUpdated", 95);
	//  570 1419:new             #2   <Class AnalyticsEvent>
	//  571 1422:dup             
	//  572 1423:ldc2            #591 <String "AccountProfileUpdated">
	//  573 1426:bipush          95
	//  574 1428:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  575 1431:putstatic       #593 <Field AnalyticsEvent AccountProfileUpdated>
		AccountUpdatePasswordViewed = new AnalyticsEvent("AccountUpdatePasswordViewed", 96);
	//  576 1434:new             #2   <Class AnalyticsEvent>
	//  577 1437:dup             
	//  578 1438:ldc2            #594 <String "AccountUpdatePasswordViewed">
	//  579 1441:bipush          96
	//  580 1443:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  581 1446:putstatic       #596 <Field AnalyticsEvent AccountUpdatePasswordViewed>
		NotificationSettingsViewed = new AnalyticsEvent("NotificationSettingsViewed", 97);
	//  582 1449:new             #2   <Class AnalyticsEvent>
	//  583 1452:dup             
	//  584 1453:ldc2            #597 <String "NotificationSettingsViewed">
	//  585 1456:bipush          97
	//  586 1458:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  587 1461:putstatic       #599 <Field AnalyticsEvent NotificationSettingsViewed>
		NotificationSettingsChanged = new AnalyticsEvent("NotificationSettingsChanged", 98);
	//  588 1464:new             #2   <Class AnalyticsEvent>
	//  589 1467:dup             
	//  590 1468:ldc2            #600 <String "NotificationSettingsChanged">
	//  591 1471:bipush          98
	//  592 1473:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  593 1476:putstatic       #602 <Field AnalyticsEvent NotificationSettingsChanged>
		PrivacyViewed = new AnalyticsEvent("PrivacyViewed", 99);
	//  594 1479:new             #2   <Class AnalyticsEvent>
	//  595 1482:dup             
	//  596 1483:ldc2            #603 <String "PrivacyViewed">
	//  597 1486:bipush          99
	//  598 1488:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  599 1491:putstatic       #605 <Field AnalyticsEvent PrivacyViewed>
		RoombaSetupChecklistViewed = new AnalyticsEvent("RoombaSetupChecklistViewed", 100);
	//  600 1494:new             #2   <Class AnalyticsEvent>
	//  601 1497:dup             
	//  602 1498:ldc2            #606 <String "RoombaSetupChecklistViewed">
	//  603 1501:bipush          100
	//  604 1503:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  605 1506:putstatic       #608 <Field AnalyticsEvent RoombaSetupChecklistViewed>
		RoombaSetupDockPlacementViewed = new AnalyticsEvent("RoombaSetupDockPlacementViewed", 101);
	//  606 1509:new             #2   <Class AnalyticsEvent>
	//  607 1512:dup             
	//  608 1513:ldc2            #609 <String "RoombaSetupDockPlacementViewed">
	//  609 1516:bipush          101
	//  610 1518:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  611 1521:putstatic       #611 <Field AnalyticsEvent RoombaSetupDockPlacementViewed>
		RoombaSetupWifiInfoViewed = new AnalyticsEvent("RoombaSetupWifiInfoViewed", 102);
	//  612 1524:new             #2   <Class AnalyticsEvent>
	//  613 1527:dup             
	//  614 1528:ldc2            #612 <String "RoombaSetupWifiInfoViewed">
	//  615 1531:bipush          102
	//  616 1533:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  617 1536:putstatic       #614 <Field AnalyticsEvent RoombaSetupWifiInfoViewed>
		RoombaSetupAdvancedWifiInfoViewed = new AnalyticsEvent("RoombaSetupAdvancedWifiInfoViewed", 103);
	//  618 1539:new             #2   <Class AnalyticsEvent>
	//  619 1542:dup             
	//  620 1543:ldc2            #615 <String "RoombaSetupAdvancedWifiInfoViewed">
	//  621 1546:bipush          103
	//  622 1548:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  623 1551:putstatic       #617 <Field AnalyticsEvent RoombaSetupAdvancedWifiInfoViewed>
		RoombaSetupActivateRoombaViewed = new AnalyticsEvent("RoombaSetupActivateRoombaViewed", 104);
	//  624 1554:new             #2   <Class AnalyticsEvent>
	//  625 1557:dup             
	//  626 1558:ldc2            #618 <String "RoombaSetupActivateRoombaViewed">
	//  627 1561:bipush          104
	//  628 1563:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  629 1566:putstatic       #620 <Field AnalyticsEvent RoombaSetupActivateRoombaViewed>
		RoombaSetupConnectToRoombaViewed = new AnalyticsEvent("RoombaSetupConnectToRoombaViewed", 105);
	//  630 1569:new             #2   <Class AnalyticsEvent>
	//  631 1572:dup             
	//  632 1573:ldc2            #621 <String "RoombaSetupConnectToRoombaViewed">
	//  633 1576:bipush          105
	//  634 1578:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  635 1581:putstatic       #623 <Field AnalyticsEvent RoombaSetupConnectToRoombaViewed>
		RoombaSetupProvisioningViewed = new AnalyticsEvent("RoombaSetupProvisioningViewed", 106);
	//  636 1584:new             #2   <Class AnalyticsEvent>
	//  637 1587:dup             
	//  638 1588:ldc2            #624 <String "RoombaSetupProvisioningViewed">
	//  639 1591:bipush          106
	//  640 1593:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  641 1596:putstatic       #626 <Field AnalyticsEvent RoombaSetupProvisioningViewed>
		RoombaSetupProvisioningErrorViewed = new AnalyticsEvent("RoombaSetupProvisioningErrorViewed", 107);
	//  642 1599:new             #2   <Class AnalyticsEvent>
	//  643 1602:dup             
	//  644 1603:ldc2            #627 <String "RoombaSetupProvisioningErrorViewed">
	//  645 1606:bipush          107
	//  646 1608:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  647 1611:putstatic       #629 <Field AnalyticsEvent RoombaSetupProvisioningErrorViewed>
		RoombaProvisioningFinished = new AnalyticsEvent("RoombaProvisioningFinished", 108);
	//  648 1614:new             #2   <Class AnalyticsEvent>
	//  649 1617:dup             
	//  650 1618:ldc2            #630 <String "RoombaProvisioningFinished">
	//  651 1621:bipush          108
	//  652 1623:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  653 1626:putstatic       #632 <Field AnalyticsEvent RoombaProvisioningFinished>
		RoombaV2ProvisioningPart1 = new AnalyticsEvent("RoombaV2ProvisioningPart1", 109);
	//  654 1629:new             #2   <Class AnalyticsEvent>
	//  655 1632:dup             
	//  656 1633:ldc2            #633 <String "RoombaV2ProvisioningPart1">
	//  657 1636:bipush          109
	//  658 1638:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  659 1641:putstatic       #635 <Field AnalyticsEvent RoombaV2ProvisioningPart1>
		RoombaV2ProvisioningPart2 = new AnalyticsEvent("RoombaV2ProvisioningPart2", 110);
	//  660 1644:new             #2   <Class AnalyticsEvent>
	//  661 1647:dup             
	//  662 1648:ldc2            #636 <String "RoombaV2ProvisioningPart2">
	//  663 1651:bipush          110
	//  664 1653:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  665 1656:putstatic       #638 <Field AnalyticsEvent RoombaV2ProvisioningPart2>
		RoombaV2ProvisioningPart3 = new AnalyticsEvent("RoombaV2ProvisioningPart3", 111);
	//  666 1659:new             #2   <Class AnalyticsEvent>
	//  667 1662:dup             
	//  668 1663:ldc2            #639 <String "RoombaV2ProvisioningPart3">
	//  669 1666:bipush          111
	//  670 1668:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  671 1671:putstatic       #641 <Field AnalyticsEvent RoombaV2ProvisioningPart3>
		RoombaV2ProvisioningPart4 = new AnalyticsEvent("RoombaV2ProvisioningPart4", 112);
	//  672 1674:new             #2   <Class AnalyticsEvent>
	//  673 1677:dup             
	//  674 1678:ldc2            #642 <String "RoombaV2ProvisioningPart4">
	//  675 1681:bipush          112
	//  676 1683:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  677 1686:putstatic       #644 <Field AnalyticsEvent RoombaV2ProvisioningPart4>
		RoombaV2ProvisioningPart5 = new AnalyticsEvent("RoombaV2ProvisioningPart5", 113);
	//  678 1689:new             #2   <Class AnalyticsEvent>
	//  679 1692:dup             
	//  680 1693:ldc2            #645 <String "RoombaV2ProvisioningPart5">
	//  681 1696:bipush          113
	//  682 1698:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  683 1701:putstatic       #647 <Field AnalyticsEvent RoombaV2ProvisioningPart5>
		RoombaV2ProvisioningError = new AnalyticsEvent("RoombaV2ProvisioningError", 114);
	//  684 1704:new             #2   <Class AnalyticsEvent>
	//  685 1707:dup             
	//  686 1708:ldc2            #648 <String "RoombaV2ProvisioningError">
	//  687 1711:bipush          114
	//  688 1713:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  689 1716:putstatic       #650 <Field AnalyticsEvent RoombaV2ProvisioningError>
		RoombaV1ProvisioningError = new AnalyticsEvent("RoombaV1ProvisioningError", 115);
	//  690 1719:new             #2   <Class AnalyticsEvent>
	//  691 1722:dup             
	//  692 1723:ldc2            #651 <String "RoombaV1ProvisioningError">
	//  693 1726:bipush          115
	//  694 1728:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  695 1731:putstatic       #653 <Field AnalyticsEvent RoombaV1ProvisioningError>
		RoombaSetupCustomerRegistrationViewed = new AnalyticsEvent("RoombaSetupCustomerRegistrationViewed", 116);
	//  696 1734:new             #2   <Class AnalyticsEvent>
	//  697 1737:dup             
	//  698 1738:ldc2            #654 <String "RoombaSetupCustomerRegistrationViewed">
	//  699 1741:bipush          116
	//  700 1743:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  701 1746:putstatic       #656 <Field AnalyticsEvent RoombaSetupCustomerRegistrationViewed>
		RoombaSetupFinished = new AnalyticsEvent("RoombaSetupFinished", 117);
	//  702 1749:new             #2   <Class AnalyticsEvent>
	//  703 1752:dup             
	//  704 1753:ldc2            #657 <String "RoombaSetupFinished">
	//  705 1756:bipush          117
	//  706 1758:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  707 1761:putstatic       #659 <Field AnalyticsEvent RoombaSetupFinished>
		RoombaWelcomeVideoViewed = new AnalyticsEvent("RoombaWelcomeVideoViewed", 118);
	//  708 1764:new             #2   <Class AnalyticsEvent>
	//  709 1767:dup             
	//  710 1768:ldc2            #660 <String "RoombaWelcomeVideoViewed">
	//  711 1771:bipush          118
	//  712 1773:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  713 1776:putstatic       #662 <Field AnalyticsEvent RoombaWelcomeVideoViewed>
		EnjoyingAppPromptResponseGiven = new AnalyticsEvent("EnjoyingAppPromptResponseGiven", 119);
	//  714 1779:new             #2   <Class AnalyticsEvent>
	//  715 1782:dup             
	//  716 1783:ldc2            #663 <String "EnjoyingAppPromptResponseGiven">
	//  717 1786:bipush          119
	//  718 1788:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  719 1791:putstatic       #665 <Field AnalyticsEvent EnjoyingAppPromptResponseGiven>
		AppFeedbackResponseGiven = new AnalyticsEvent("AppFeedbackResponseGiven", 120);
	//  720 1794:new             #2   <Class AnalyticsEvent>
	//  721 1797:dup             
	//  722 1798:ldc2            #666 <String "AppFeedbackResponseGiven">
	//  723 1801:bipush          120
	//  724 1803:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  725 1806:putstatic       #668 <Field AnalyticsEvent AppFeedbackResponseGiven>
		AppFeedbackResponseCancelled = new AnalyticsEvent("AppFeedbackResponseCancelled", 121);
	//  726 1809:new             #2   <Class AnalyticsEvent>
	//  727 1812:dup             
	//  728 1813:ldc2            #669 <String "AppFeedbackResponseCancelled">
	//  729 1816:bipush          121
	//  730 1818:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  731 1821:putstatic       #671 <Field AnalyticsEvent AppFeedbackResponseCancelled>
		WifiMapFeedbackResponseGiven = new AnalyticsEvent("WifiMapFeedbackResponseGiven", 122);
	//  732 1824:new             #2   <Class AnalyticsEvent>
	//  733 1827:dup             
	//  734 1828:ldc2            #672 <String "WifiMapFeedbackResponseGiven">
	//  735 1831:bipush          122
	//  736 1833:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  737 1836:putstatic       #674 <Field AnalyticsEvent WifiMapFeedbackResponseGiven>
		BetaProgramFeedbackSubmitted = new AnalyticsEvent("BetaProgramFeedbackSubmitted", 123);
	//  738 1839:new             #2   <Class AnalyticsEvent>
	//  739 1842:dup             
	//  740 1843:ldc2            #675 <String "BetaProgramFeedbackSubmitted">
	//  741 1846:bipush          123
	//  742 1848:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  743 1851:putstatic       #677 <Field AnalyticsEvent BetaProgramFeedbackSubmitted>
		BetaProgramIntroductionPageViewed = new AnalyticsEvent("BetaProgramIntroductionPageViewed", 124);
	//  744 1854:new             #2   <Class AnalyticsEvent>
	//  745 1857:dup             
	//  746 1858:ldc2            #678 <String "BetaProgramIntroductionPageViewed">
	//  747 1861:bipush          124
	//  748 1863:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  749 1866:putstatic       #680 <Field AnalyticsEvent BetaProgramIntroductionPageViewed>
		BetaProgramIWantInButtonPressed = new AnalyticsEvent("BetaProgramIWantInButtonPressed", 125);
	//  750 1869:new             #2   <Class AnalyticsEvent>
	//  751 1872:dup             
	//  752 1873:ldc2            #681 <String "BetaProgramIWantInButtonPressed">
	//  753 1876:bipush          125
	//  754 1878:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  755 1881:putstatic       #683 <Field AnalyticsEvent BetaProgramIWantInButtonPressed>
		BetaProgramPageViewed = new AnalyticsEvent("BetaProgramPageViewed", 126);
	//  756 1884:new             #2   <Class AnalyticsEvent>
	//  757 1887:dup             
	//  758 1888:ldc2            #684 <String "BetaProgramPageViewed">
	//  759 1891:bipush          126
	//  760 1893:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  761 1896:putstatic       #686 <Field AnalyticsEvent BetaProgramPageViewed>
		WifiCoverageToggled = new AnalyticsEvent("WifiCoverageToggled", 127);
	//  762 1899:new             #2   <Class AnalyticsEvent>
	//  763 1902:dup             
	//  764 1903:ldc2            #687 <String "WifiCoverageToggled">
	//  765 1906:bipush          127
	//  766 1908:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  767 1911:putstatic       #689 <Field AnalyticsEvent WifiCoverageToggled>
		WifiCoverageMapScreenViewed = new AnalyticsEvent("WifiCoverageMapScreenViewed", 128);
	//  768 1914:new             #2   <Class AnalyticsEvent>
	//  769 1917:dup             
	//  770 1918:ldc2            #690 <String "WifiCoverageMapScreenViewed">
	//  771 1921:sipush          128
	//  772 1924:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  773 1927:putstatic       #692 <Field AnalyticsEvent WifiCoverageMapScreenViewed>
		BetaProgramThreeDotsButtonPressed = new AnalyticsEvent("BetaProgramThreeDotsButtonPressed", 129);
	//  774 1930:new             #2   <Class AnalyticsEvent>
	//  775 1933:dup             
	//  776 1934:ldc2            #693 <String "BetaProgramThreeDotsButtonPressed">
	//  777 1937:sipush          129
	//  778 1940:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  779 1943:putstatic       #695 <Field AnalyticsEvent BetaProgramThreeDotsButtonPressed>
		LeaveBetaProgramConfirmationButtonPressed = new AnalyticsEvent("LeaveBetaProgramConfirmationButtonPressed", 130);
	//  780 1946:new             #2   <Class AnalyticsEvent>
	//  781 1949:dup             
	//  782 1950:ldc2            #696 <String "LeaveBetaProgramConfirmationButtonPressed">
	//  783 1953:sipush          130
	//  784 1956:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  785 1959:putstatic       #698 <Field AnalyticsEvent LeaveBetaProgramConfirmationButtonPressed>
		WifiMapTabViewed = new AnalyticsEvent("WifiMapTabViewed", 131);
	//  786 1962:new             #2   <Class AnalyticsEvent>
	//  787 1965:dup             
	//  788 1966:ldc2            #699 <String "WifiMapTabViewed">
	//  789 1969:sipush          131
	//  790 1972:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  791 1975:putstatic       #701 <Field AnalyticsEvent WifiMapTabViewed>
		WifiMapBottomSheetViewed = new AnalyticsEvent("WifiMapBottomSheetViewed", 132);
	//  792 1978:new             #2   <Class AnalyticsEvent>
	//  793 1981:dup             
	//  794 1982:ldc2            #702 <String "WifiMapBottomSheetViewed">
	//  795 1985:sipush          132
	//  796 1988:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  797 1991:putstatic       #704 <Field AnalyticsEvent WifiMapBottomSheetViewed>
		HistoryProvideFeedbackButtonPressed = new AnalyticsEvent("HistoryProvideFeedbackButtonPressed", 133);
	//  798 1994:new             #2   <Class AnalyticsEvent>
	//  799 1997:dup             
	//  800 1998:ldc2            #705 <String "HistoryProvideFeedbackButtonPressed">
	//  801 2001:sipush          133
	//  802 2004:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  803 2007:putstatic       #707 <Field AnalyticsEvent HistoryProvideFeedbackButtonPressed>
		AssetRegistrationWithCloudFinished = new AnalyticsEvent("AssetRegistrationWithCloudFinished", 134);
	//  804 2010:new             #2   <Class AnalyticsEvent>
	//  805 2013:dup             
	//  806 2014:ldc2            #708 <String "AssetRegistrationWithCloudFinished">
	//  807 2017:sipush          134
	//  808 2020:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  809 2023:putstatic       #710 <Field AnalyticsEvent AssetRegistrationWithCloudFinished>
		LocalOtaFirmwareUpdateFinished = new AnalyticsEvent("LocalOtaFirmwareUpdateFinished", 135);
	//  810 2026:new             #2   <Class AnalyticsEvent>
	//  811 2029:dup             
	//  812 2030:ldc2            #711 <String "LocalOtaFirmwareUpdateFinished">
	//  813 2033:sipush          135
	//  814 2036:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  815 2039:putstatic       #713 <Field AnalyticsEvent LocalOtaFirmwareUpdateFinished>
		OnDemandOtaFirmwareUpdateAvailableFinished = new AnalyticsEvent("OnDemandOtaFirmwareUpdateAvailableFinished", 136);
	//  816 2042:new             #2   <Class AnalyticsEvent>
	//  817 2045:dup             
	//  818 2046:ldc2            #714 <String "OnDemandOtaFirmwareUpdateAvailableFinished">
	//  819 2049:sipush          136
	//  820 2052:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  821 2055:putstatic       #716 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateAvailableFinished>
		OnDemandOtaFirmwareUpdateReadyFinished = new AnalyticsEvent("OnDemandOtaFirmwareUpdateReadyFinished", 137);
	//  822 2058:new             #2   <Class AnalyticsEvent>
	//  823 2061:dup             
	//  824 2062:ldc2            #717 <String "OnDemandOtaFirmwareUpdateReadyFinished">
	//  825 2065:sipush          137
	//  826 2068:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  827 2071:putstatic       #719 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateReadyFinished>
		OnDemandOtaFirmwareUpdateLoadingFinished = new AnalyticsEvent("OnDemandOtaFirmwareUpdateLoadingFinished", 138);
	//  828 2074:new             #2   <Class AnalyticsEvent>
	//  829 2077:dup             
	//  830 2078:ldc2            #720 <String "OnDemandOtaFirmwareUpdateLoadingFinished">
	//  831 2081:sipush          138
	//  832 2084:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  833 2087:putstatic       #722 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateLoadingFinished>
		OnDemandOtaFirmwareUpdateInstallingFinished = new AnalyticsEvent("OnDemandOtaFirmwareUpdateInstallingFinished", 139);
	//  834 2090:new             #2   <Class AnalyticsEvent>
	//  835 2093:dup             
	//  836 2094:ldc2            #723 <String "OnDemandOtaFirmwareUpdateInstallingFinished">
	//  837 2097:sipush          139
	//  838 2100:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  839 2103:putstatic       #725 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateInstallingFinished>
		OnDemandOtaFirmwareUpdateSuccessFinished = new AnalyticsEvent("OnDemandOtaFirmwareUpdateSuccessFinished", 140);
	//  840 2106:new             #2   <Class AnalyticsEvent>
	//  841 2109:dup             
	//  842 2110:ldc2            #726 <String "OnDemandOtaFirmwareUpdateSuccessFinished">
	//  843 2113:sipush          140
	//  844 2116:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  845 2119:putstatic       #728 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateSuccessFinished>
		OnDemandOtaFirmwareUpdateError = new AnalyticsEvent("OnDemandOtaFirmwareUpdateError", 141);
	//  846 2122:new             #2   <Class AnalyticsEvent>
	//  847 2125:dup             
	//  848 2126:ldc2            #729 <String "OnDemandOtaFirmwareUpdateError">
	//  849 2129:sipush          141
	//  850 2132:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  851 2135:putstatic       #731 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateError>
		CleanScheduleTwoWelcomeViewed = new AnalyticsEvent("CleanScheduleTwoWelcomeViewed", 142);
	//  852 2138:new             #2   <Class AnalyticsEvent>
	//  853 2141:dup             
	//  854 2142:ldc2            #732 <String "CleanScheduleTwoWelcomeViewed">
	//  855 2145:sipush          142
	//  856 2148:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  857 2151:putstatic       #734 <Field AnalyticsEvent CleanScheduleTwoWelcomeViewed>
		CleanScheduleTwoPopularPressed = new AnalyticsEvent("CleanScheduleTwoPopularPressed", 143);
	//  858 2154:new             #2   <Class AnalyticsEvent>
	//  859 2157:dup             
	//  860 2158:ldc2            #735 <String "CleanScheduleTwoPopularPressed">
	//  861 2161:sipush          143
	//  862 2164:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  863 2167:putstatic       #737 <Field AnalyticsEvent CleanScheduleTwoPopularPressed>
		CleanScheduleTwoAddPressed = new AnalyticsEvent("CleanScheduleTwoAddPressed", 144);
	//  864 2170:new             #2   <Class AnalyticsEvent>
	//  865 2173:dup             
	//  866 2174:ldc2            #738 <String "CleanScheduleTwoAddPressed">
	//  867 2177:sipush          144
	//  868 2180:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  869 2183:putstatic       #740 <Field AnalyticsEvent CleanScheduleTwoAddPressed>
		CleanScheduleTwoCreateScreenViewed = new AnalyticsEvent("CleanScheduleTwoCreateScreenViewed", 145);
	//  870 2186:new             #2   <Class AnalyticsEvent>
	//  871 2189:dup             
	//  872 2190:ldc2            #741 <String "CleanScheduleTwoCreateScreenViewed">
	//  873 2193:sipush          145
	//  874 2196:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  875 2199:putstatic       #743 <Field AnalyticsEvent CleanScheduleTwoCreateScreenViewed>
		CleanScheduleTwoCleaningPresetViewed = new AnalyticsEvent("CleanScheduleTwoCleaningPresetViewed", 146);
	//  876 2202:new             #2   <Class AnalyticsEvent>
	//  877 2205:dup             
	//  878 2206:ldc2            #744 <String "CleanScheduleTwoCleaningPresetViewed">
	//  879 2209:sipush          146
	//  880 2212:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  881 2215:putstatic       #746 <Field AnalyticsEvent CleanScheduleTwoCleaningPresetViewed>
		CleanScheduleTwoNewScheduleCreated = new AnalyticsEvent("CleanScheduleTwoNewScheduleCreated", 147);
	//  882 2218:new             #2   <Class AnalyticsEvent>
	//  883 2221:dup             
	//  884 2222:ldc2            #747 <String "CleanScheduleTwoNewScheduleCreated">
	//  885 2225:sipush          147
	//  886 2228:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  887 2231:putstatic       #749 <Field AnalyticsEvent CleanScheduleTwoNewScheduleCreated>
		CleanScheduleTwoExistingScheduleEdited = new AnalyticsEvent("CleanScheduleTwoExistingScheduleEdited", 148);
	//  888 2234:new             #2   <Class AnalyticsEvent>
	//  889 2237:dup             
	//  890 2238:ldc2            #750 <String "CleanScheduleTwoExistingScheduleEdited">
	//  891 2241:sipush          148
	//  892 2244:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  893 2247:putstatic       #752 <Field AnalyticsEvent CleanScheduleTwoExistingScheduleEdited>
		CleanScheduleTwoExistingScheduleToggled = new AnalyticsEvent("CleanScheduleTwoExistingScheduleToggled", 149);
	//  894 2250:new             #2   <Class AnalyticsEvent>
	//  895 2253:dup             
	//  896 2254:ldc2            #753 <String "CleanScheduleTwoExistingScheduleToggled">
	//  897 2257:sipush          149
	//  898 2260:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  899 2263:putstatic       #755 <Field AnalyticsEvent CleanScheduleTwoExistingScheduleToggled>
		CleanScheduleTwoExistingScheduleDeleted = new AnalyticsEvent("CleanScheduleTwoExistingScheduleDeleted", 150);
	//  900 2266:new             #2   <Class AnalyticsEvent>
	//  901 2269:dup             
	//  902 2270:ldc2            #756 <String "CleanScheduleTwoExistingScheduleDeleted">
	//  903 2273:sipush          150
	//  904 2276:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  905 2279:putstatic       #758 <Field AnalyticsEvent CleanScheduleTwoExistingScheduleDeleted>
		CleanScheduleTwoExistingScheduleViewed = new AnalyticsEvent("CleanScheduleTwoExistingScheduleViewed", 151);
	//  906 2282:new             #2   <Class AnalyticsEvent>
	//  907 2285:dup             
	//  908 2286:ldc2            #759 <String "CleanScheduleTwoExistingScheduleViewed">
	//  909 2289:sipush          151
	//  910 2292:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  911 2295:putstatic       #761 <Field AnalyticsEvent CleanScheduleTwoExistingScheduleViewed>
		CleanScheduleTwoTimeoutError = new AnalyticsEvent("CleanScheduleTwoTimeoutError", 152);
	//  912 2298:new             #2   <Class AnalyticsEvent>
	//  913 2301:dup             
	//  914 2302:ldc2            #762 <String "CleanScheduleTwoTimeoutError">
	//  915 2305:sipush          152
	//  916 2308:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  917 2311:putstatic       #764 <Field AnalyticsEvent CleanScheduleTwoTimeoutError>
		CleanScheduleTwoPMAPSChangeLayoutPromptViewed = new AnalyticsEvent("CleanScheduleTwoPMAPSChangeLayoutPromptViewed", 153);
	//  918 2314:new             #2   <Class AnalyticsEvent>
	//  919 2317:dup             
	//  920 2318:ldc2            #765 <String "CleanScheduleTwoPMAPSChangeLayoutPromptViewed">
	//  921 2321:sipush          153
	//  922 2324:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  923 2327:putstatic       #767 <Field AnalyticsEvent CleanScheduleTwoPMAPSChangeLayoutPromptViewed>
		CleanScheduleTwoSchedulesDeletedFromPMAPSChange = new AnalyticsEvent("CleanScheduleTwoSchedulesDeletedFromPMAPSChange", 154);
	//  924 2330:new             #2   <Class AnalyticsEvent>
	//  925 2333:dup             
	//  926 2334:ldc2            #768 <String "CleanScheduleTwoSchedulesDeletedFromPMAPSChange">
	//  927 2337:sipush          154
	//  928 2340:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  929 2343:putstatic       #770 <Field AnalyticsEvent CleanScheduleTwoSchedulesDeletedFromPMAPSChange>
		CleanScheduleTwoScheduleLimitViewed = new AnalyticsEvent("CleanScheduleTwoScheduleLimitViewed", 155);
	//  930 2346:new             #2   <Class AnalyticsEvent>
	//  931 2349:dup             
	//  932 2350:ldc2            #771 <String "CleanScheduleTwoScheduleLimitViewed">
	//  933 2353:sipush          155
	//  934 2356:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  935 2359:putstatic       #773 <Field AnalyticsEvent CleanScheduleTwoScheduleLimitViewed>
		CleanScheduleTwoUpdateFinished = new AnalyticsEvent("CleanScheduleTwoUpdateFinished", 156);
	//  936 2362:new             #2   <Class AnalyticsEvent>
	//  937 2365:dup             
	//  938 2366:ldc2            #774 <String "CleanScheduleTwoUpdateFinished">
	//  939 2369:sipush          156
	//  940 2372:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  941 2375:putstatic       #776 <Field AnalyticsEvent CleanScheduleTwoUpdateFinished>
		EvacuationDockEmptyBinButtonPressed = new AnalyticsEvent("EvacuationDockEmptyBinButtonPressed", 157);
	//  942 2378:new             #2   <Class AnalyticsEvent>
	//  943 2381:dup             
	//  944 2382:ldc2            #777 <String "EvacuationDockEmptyBinButtonPressed">
	//  945 2385:sipush          157
	//  946 2388:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  947 2391:putstatic       #779 <Field AnalyticsEvent EvacuationDockEmptyBinButtonPressed>
		EvacuationDockErrorHelpContentViewed = new AnalyticsEvent("EvacuationDockErrorHelpContentViewed", 158);
	//  948 2394:new             #2   <Class AnalyticsEvent>
	//  949 2397:dup             
	//  950 2398:ldc2            #780 <String "EvacuationDockErrorHelpContentViewed">
	//  951 2401:sipush          158
	//  952 2404:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  953 2407:putstatic       #782 <Field AnalyticsEvent EvacuationDockErrorHelpContentViewed>
		EvacuationDockBagMissingHelpContentViewed = new AnalyticsEvent("EvacuationDockBagMissingHelpContentViewed", 159);
	//  954 2410:new             #2   <Class AnalyticsEvent>
	//  955 2413:dup             
	//  956 2414:ldc2            #783 <String "EvacuationDockBagMissingHelpContentViewed">
	//  957 2417:sipush          159
	//  958 2420:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  959 2423:putstatic       #785 <Field AnalyticsEvent EvacuationDockBagMissingHelpContentViewed>
		EvacuationDockAboutDockViewed = new AnalyticsEvent("EvacuationDockAboutDockViewed", 160);
	//  960 2426:new             #2   <Class AnalyticsEvent>
	//  961 2429:dup             
	//  962 2430:ldc2            #786 <String "EvacuationDockAboutDockViewed">
	//  963 2433:sipush          160
	//  964 2436:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  965 2439:putstatic       #788 <Field AnalyticsEvent EvacuationDockAboutDockViewed>
		PMapsChooseRoomsButtonPressed = new AnalyticsEvent("PMapsChooseRoomsButtonPressed", 161);
	//  966 2442:new             #2   <Class AnalyticsEvent>
	//  967 2445:dup             
	//  968 2446:ldc2            #789 <String "PMapsChooseRoomsButtonPressed">
	//  969 2449:sipush          161
	//  970 2452:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  971 2455:putstatic       #791 <Field AnalyticsEvent PMapsChooseRoomsButtonPressed>
		PMapsSmartMapsButtonPressed = new AnalyticsEvent("PMapsSmartMapsButtonPressed", 162);
	//  972 2458:new             #2   <Class AnalyticsEvent>
	//  973 2461:dup             
	//  974 2462:ldc2            #792 <String "PMapsSmartMapsButtonPressed">
	//  975 2465:sipush          162
	//  976 2468:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  977 2471:putstatic       #794 <Field AnalyticsEvent PMapsSmartMapsButtonPressed>
		PMapsDirectedRoomCleanStarted = new AnalyticsEvent("PMapsDirectedRoomCleanStarted", 163);
	//  978 2474:new             #2   <Class AnalyticsEvent>
	//  979 2477:dup             
	//  980 2478:ldc2            #795 <String "PMapsDirectedRoomCleanStarted">
	//  981 2481:sipush          163
	//  982 2484:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  983 2487:putstatic       #797 <Field AnalyticsEvent PMapsDirectedRoomCleanStarted>
		PMapsTrainingRunStarted = new AnalyticsEvent("PMapsTrainingRunStarted", 164);
	//  984 2490:new             #2   <Class AnalyticsEvent>
	//  985 2493:dup             
	//  986 2494:ldc2            #798 <String "PMapsTrainingRunStarted">
	//  987 2497:sipush          164
	//  988 2500:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  989 2503:putstatic       #800 <Field AnalyticsEvent PMapsTrainingRunStarted>
		PMapsCleanButtonIntro1Viewed = new AnalyticsEvent("PMapsCleanButtonIntro1Viewed", 165);
	//  990 2506:new             #2   <Class AnalyticsEvent>
	//  991 2509:dup             
	//  992 2510:ldc2            #801 <String "PMapsCleanButtonIntro1Viewed">
	//  993 2513:sipush          165
	//  994 2516:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	//  995 2519:putstatic       #803 <Field AnalyticsEvent PMapsCleanButtonIntro1Viewed>
		PMapsCleanButtonIntro1CancelButtonPressed = new AnalyticsEvent("PMapsCleanButtonIntro1CancelButtonPressed", 166);
	//  996 2522:new             #2   <Class AnalyticsEvent>
	//  997 2525:dup             
	//  998 2526:ldc2            #804 <String "PMapsCleanButtonIntro1CancelButtonPressed">
	//  999 2529:sipush          166
	// 1000 2532:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1001 2535:putstatic       #806 <Field AnalyticsEvent PMapsCleanButtonIntro1CancelButtonPressed>
		PMapsCleanButtonIntro1NextButtonPressed = new AnalyticsEvent("PMapsCleanButtonIntro1NextButtonPressed", 167);
	// 1002 2538:new             #2   <Class AnalyticsEvent>
	// 1003 2541:dup             
	// 1004 2542:ldc2            #807 <String "PMapsCleanButtonIntro1NextButtonPressed">
	// 1005 2545:sipush          167
	// 1006 2548:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1007 2551:putstatic       #809 <Field AnalyticsEvent PMapsCleanButtonIntro1NextButtonPressed>
		PMapsCleanButtonIntro2Viewed = new AnalyticsEvent("PMapsCleanButtonIntro2Viewed", 168);
	// 1008 2554:new             #2   <Class AnalyticsEvent>
	// 1009 2557:dup             
	// 1010 2558:ldc2            #810 <String "PMapsCleanButtonIntro2Viewed">
	// 1011 2561:sipush          168
	// 1012 2564:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1013 2567:putstatic       #812 <Field AnalyticsEvent PMapsCleanButtonIntro2Viewed>
		PMapsCleanButtonIntro2CancelButtonPressed = new AnalyticsEvent("PMapsCleanButtonIntro2CancelButtonPressed", 169);
	// 1014 2570:new             #2   <Class AnalyticsEvent>
	// 1015 2573:dup             
	// 1016 2574:ldc2            #813 <String "PMapsCleanButtonIntro2CancelButtonPressed">
	// 1017 2577:sipush          169
	// 1018 2580:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1019 2583:putstatic       #815 <Field AnalyticsEvent PMapsCleanButtonIntro2CancelButtonPressed>
		PMapsCleanButtonIntro2CompleteButtonPressed = new AnalyticsEvent("PMapsCleanButtonIntro2CompleteButtonPressed", 170);
	// 1020 2586:new             #2   <Class AnalyticsEvent>
	// 1021 2589:dup             
	// 1022 2590:ldc2            #816 <String "PMapsCleanButtonIntro2CompleteButtonPressed">
	// 1023 2593:sipush          170
	// 1024 2596:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1025 2599:putstatic       #818 <Field AnalyticsEvent PMapsCleanButtonIntro2CompleteButtonPressed>
		PMapsSectionIntro1Viewed = new AnalyticsEvent("PMapsSectionIntro1Viewed", 171);
	// 1026 2602:new             #2   <Class AnalyticsEvent>
	// 1027 2605:dup             
	// 1028 2606:ldc2            #819 <String "PMapsSectionIntro1Viewed">
	// 1029 2609:sipush          171
	// 1030 2612:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1031 2615:putstatic       #821 <Field AnalyticsEvent PMapsSectionIntro1Viewed>
		PMapsSectionIntro1CancelButtonPressed = new AnalyticsEvent("PMapsSectionIntro1CancelButtonPressed", 172);
	// 1032 2618:new             #2   <Class AnalyticsEvent>
	// 1033 2621:dup             
	// 1034 2622:ldc2            #822 <String "PMapsSectionIntro1CancelButtonPressed">
	// 1035 2625:sipush          172
	// 1036 2628:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1037 2631:putstatic       #824 <Field AnalyticsEvent PMapsSectionIntro1CancelButtonPressed>
		PMapsSectionIntro1NextButtonPressed = new AnalyticsEvent("PMapsSectionIntro1NextButtonPressed", 173);
	// 1038 2634:new             #2   <Class AnalyticsEvent>
	// 1039 2637:dup             
	// 1040 2638:ldc2            #825 <String "PMapsSectionIntro1NextButtonPressed">
	// 1041 2641:sipush          173
	// 1042 2644:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1043 2647:putstatic       #827 <Field AnalyticsEvent PMapsSectionIntro1NextButtonPressed>
		PMapsSectionIntro2Viewed = new AnalyticsEvent("PMapsSectionIntro2Viewed", 174);
	// 1044 2650:new             #2   <Class AnalyticsEvent>
	// 1045 2653:dup             
	// 1046 2654:ldc2            #828 <String "PMapsSectionIntro2Viewed">
	// 1047 2657:sipush          174
	// 1048 2660:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1049 2663:putstatic       #830 <Field AnalyticsEvent PMapsSectionIntro2Viewed>
		PMapsSectionIntro2CancelButtonPressed = new AnalyticsEvent("PMapsSectionIntro2CancelButtonPressed", 175);
	// 1050 2666:new             #2   <Class AnalyticsEvent>
	// 1051 2669:dup             
	// 1052 2670:ldc2            #831 <String "PMapsSectionIntro2CancelButtonPressed">
	// 1053 2673:sipush          175
	// 1054 2676:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1055 2679:putstatic       #833 <Field AnalyticsEvent PMapsSectionIntro2CancelButtonPressed>
		PMapsSectionIntro2NextButtonPressed = new AnalyticsEvent("PMapsSectionIntro2NextButtonPressed", 176);
	// 1056 2682:new             #2   <Class AnalyticsEvent>
	// 1057 2685:dup             
	// 1058 2686:ldc2            #834 <String "PMapsSectionIntro2NextButtonPressed">
	// 1059 2689:sipush          176
	// 1060 2692:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1061 2695:putstatic       #836 <Field AnalyticsEvent PMapsSectionIntro2NextButtonPressed>
		PMapsSectionIntro3Viewed = new AnalyticsEvent("PMapsSectionIntro3Viewed", 177);
	// 1062 2698:new             #2   <Class AnalyticsEvent>
	// 1063 2701:dup             
	// 1064 2702:ldc2            #837 <String "PMapsSectionIntro3Viewed">
	// 1065 2705:sipush          177
	// 1066 2708:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1067 2711:putstatic       #839 <Field AnalyticsEvent PMapsSectionIntro3Viewed>
		PMapsSectionIntro3CancelButtonPressed = new AnalyticsEvent("PMapsSectionIntro3CancelButtonPressed", 178);
	// 1068 2714:new             #2   <Class AnalyticsEvent>
	// 1069 2717:dup             
	// 1070 2718:ldc2            #840 <String "PMapsSectionIntro3CancelButtonPressed">
	// 1071 2721:sipush          178
	// 1072 2724:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1073 2727:putstatic       #842 <Field AnalyticsEvent PMapsSectionIntro3CancelButtonPressed>
		PMapsSectionIntro3ActivateButtonPressed = new AnalyticsEvent("PMapsSectionIntro3ActivateButtonPressed", 179);
	// 1074 2730:new             #2   <Class AnalyticsEvent>
	// 1075 2733:dup             
	// 1076 2734:ldc2            #843 <String "PMapsSectionIntro3ActivateButtonPressed">
	// 1077 2737:sipush          179
	// 1078 2740:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1079 2743:putstatic       #845 <Field AnalyticsEvent PMapsSectionIntro3ActivateButtonPressed>
		PMapsSectionIntro4Viewed = new AnalyticsEvent("PMapsSectionIntro4Viewed", 180);
	// 1080 2746:new             #2   <Class AnalyticsEvent>
	// 1081 2749:dup             
	// 1082 2750:ldc2            #846 <String "PMapsSectionIntro4Viewed">
	// 1083 2753:sipush          180
	// 1084 2756:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1085 2759:putstatic       #848 <Field AnalyticsEvent PMapsSectionIntro4Viewed>
		PMapsSectionIntro4CancelButtonPressed = new AnalyticsEvent("PMapsSectionIntro4CancelButtonPressed", 181);
	// 1086 2762:new             #2   <Class AnalyticsEvent>
	// 1087 2765:dup             
	// 1088 2766:ldc2            #849 <String "PMapsSectionIntro4CancelButtonPressed">
	// 1089 2769:sipush          181
	// 1090 2772:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1091 2775:putstatic       #851 <Field AnalyticsEvent PMapsSectionIntro4CancelButtonPressed>
		PMapsSectionIntro4MaybeLaterButtonPressed = new AnalyticsEvent("PMapsSectionIntro4MaybeLaterButtonPressed", 182);
	// 1092 2778:new             #2   <Class AnalyticsEvent>
	// 1093 2781:dup             
	// 1094 2782:ldc2            #852 <String "PMapsSectionIntro4MaybeLaterButtonPressed">
	// 1095 2785:sipush          182
	// 1096 2788:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1097 2791:putstatic       #854 <Field AnalyticsEvent PMapsSectionIntro4MaybeLaterButtonPressed>
		PMapsSectionIntro4AddTrainingRunButtonPressed = new AnalyticsEvent("PMapsSectionIntro4AddTrainingRunButtonPressed", 183);
	// 1098 2794:new             #2   <Class AnalyticsEvent>
	// 1099 2797:dup             
	// 1100 2798:ldc2            #855 <String "PMapsSectionIntro4AddTrainingRunButtonPressed">
	// 1101 2801:sipush          183
	// 1102 2804:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1103 2807:putstatic       #857 <Field AnalyticsEvent PMapsSectionIntro4AddTrainingRunButtonPressed>
		PMapsSectionIntro5Viewed = new AnalyticsEvent("PMapsSectionIntro5Viewed", 184);
	// 1104 2810:new             #2   <Class AnalyticsEvent>
	// 1105 2813:dup             
	// 1106 2814:ldc2            #858 <String "PMapsSectionIntro5Viewed">
	// 1107 2817:sipush          184
	// 1108 2820:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1109 2823:putstatic       #860 <Field AnalyticsEvent PMapsSectionIntro5Viewed>
		PMapsSectionIntro5CancelButtonPressed = new AnalyticsEvent("PMapsSectionIntro5CancelButtonPressed", 185);
	// 1110 2826:new             #2   <Class AnalyticsEvent>
	// 1111 2829:dup             
	// 1112 2830:ldc2            #861 <String "PMapsSectionIntro5CancelButtonPressed">
	// 1113 2833:sipush          185
	// 1114 2836:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1115 2839:putstatic       #863 <Field AnalyticsEvent PMapsSectionIntro5CancelButtonPressed>
		PMapsSectionIntro5StartTrainingRunButtonPressed = new AnalyticsEvent("PMapsSectionIntro5StartTrainingRunButtonPressed", 186);
	// 1116 2842:new             #2   <Class AnalyticsEvent>
	// 1117 2845:dup             
	// 1118 2846:ldc2            #864 <String "PMapsSectionIntro5StartTrainingRunButtonPressed">
	// 1119 2849:sipush          186
	// 1120 2852:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1121 2855:putstatic       #866 <Field AnalyticsEvent PMapsSectionIntro5StartTrainingRunButtonPressed>
		PMapsSectionIntroCompleteViewed = new AnalyticsEvent("PMapsSectionIntroCompleteViewed", 187);
	// 1122 2858:new             #2   <Class AnalyticsEvent>
	// 1123 2861:dup             
	// 1124 2862:ldc2            #867 <String "PMapsSectionIntroCompleteViewed">
	// 1125 2865:sipush          187
	// 1126 2868:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1127 2871:putstatic       #869 <Field AnalyticsEvent PMapsSectionIntroCompleteViewed>
		PMapsSectionIntroCompleteCancelButtonPressed = new AnalyticsEvent("PMapsSectionIntroCompleteCancelButtonPressed", 188);
	// 1128 2874:new             #2   <Class AnalyticsEvent>
	// 1129 2877:dup             
	// 1130 2878:ldc2            #870 <String "PMapsSectionIntroCompleteCancelButtonPressed">
	// 1131 2881:sipush          188
	// 1132 2884:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1133 2887:putstatic       #872 <Field AnalyticsEvent PMapsSectionIntroCompleteCancelButtonPressed>
		PMapsSectionIntroCompleteTipsButtonPressed = new AnalyticsEvent("PMapsSectionIntroCompleteTipsButtonPressed", 189);
	// 1134 2890:new             #2   <Class AnalyticsEvent>
	// 1135 2893:dup             
	// 1136 2894:ldc2            #873 <String "PMapsSectionIntroCompleteTipsButtonPressed">
	// 1137 2897:sipush          189
	// 1138 2900:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1139 2903:putstatic       #875 <Field AnalyticsEvent PMapsSectionIntroCompleteTipsButtonPressed>
		PMapsTips1Viewed = new AnalyticsEvent("PMapsTips1Viewed", 190);
	// 1140 2906:new             #2   <Class AnalyticsEvent>
	// 1141 2909:dup             
	// 1142 2910:ldc2            #876 <String "PMapsTips1Viewed">
	// 1143 2913:sipush          190
	// 1144 2916:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1145 2919:putstatic       #878 <Field AnalyticsEvent PMapsTips1Viewed>
		PMapsTips1CancelButtonPressed = new AnalyticsEvent("PMapsTips1CancelButtonPressed", 191);
	// 1146 2922:new             #2   <Class AnalyticsEvent>
	// 1147 2925:dup             
	// 1148 2926:ldc2            #879 <String "PMapsTips1CancelButtonPressed">
	// 1149 2929:sipush          191
	// 1150 2932:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1151 2935:putstatic       #881 <Field AnalyticsEvent PMapsTips1CancelButtonPressed>
		PMapsTips1NextButtonPressed = new AnalyticsEvent("PMapsTips1NextButtonPressed", 192);
	// 1152 2938:new             #2   <Class AnalyticsEvent>
	// 1153 2941:dup             
	// 1154 2942:ldc2            #882 <String "PMapsTips1NextButtonPressed">
	// 1155 2945:sipush          192
	// 1156 2948:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1157 2951:putstatic       #884 <Field AnalyticsEvent PMapsTips1NextButtonPressed>
		PMapsTips2Viewed = new AnalyticsEvent("PMapsTips2Viewed", 193);
	// 1158 2954:new             #2   <Class AnalyticsEvent>
	// 1159 2957:dup             
	// 1160 2958:ldc2            #885 <String "PMapsTips2Viewed">
	// 1161 2961:sipush          193
	// 1162 2964:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1163 2967:putstatic       #887 <Field AnalyticsEvent PMapsTips2Viewed>
		PMapsTips2CancelButtonPressed = new AnalyticsEvent("PMapsTips2CancelButtonPressed", 194);
	// 1164 2970:new             #2   <Class AnalyticsEvent>
	// 1165 2973:dup             
	// 1166 2974:ldc2            #888 <String "PMapsTips2CancelButtonPressed">
	// 1167 2977:sipush          194
	// 1168 2980:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1169 2983:putstatic       #890 <Field AnalyticsEvent PMapsTips2CancelButtonPressed>
		PMapsTips2NextButtonPressed = new AnalyticsEvent("PMapsTips2NextButtonPressed", 195);
	// 1170 2986:new             #2   <Class AnalyticsEvent>
	// 1171 2989:dup             
	// 1172 2990:ldc2            #891 <String "PMapsTips2NextButtonPressed">
	// 1173 2993:sipush          195
	// 1174 2996:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1175 2999:putstatic       #893 <Field AnalyticsEvent PMapsTips2NextButtonPressed>
		PMapsTips3Viewed = new AnalyticsEvent("PMapsTips3Viewed", 196);
	// 1176 3002:new             #2   <Class AnalyticsEvent>
	// 1177 3005:dup             
	// 1178 3006:ldc2            #894 <String "PMapsTips3Viewed">
	// 1179 3009:sipush          196
	// 1180 3012:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1181 3015:putstatic       #896 <Field AnalyticsEvent PMapsTips3Viewed>
		PMapsTips3CancelButtonPressed = new AnalyticsEvent("PMapsTips3CancelButtonPressed", 197);
	// 1182 3018:new             #2   <Class AnalyticsEvent>
	// 1183 3021:dup             
	// 1184 3022:ldc2            #897 <String "PMapsTips3CancelButtonPressed">
	// 1185 3025:sipush          197
	// 1186 3028:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1187 3031:putstatic       #899 <Field AnalyticsEvent PMapsTips3CancelButtonPressed>
		PMapsTips3CompleteButtonPressed = new AnalyticsEvent("PMapsTips3CompleteButtonPressed", 198);
	// 1188 3034:new             #2   <Class AnalyticsEvent>
	// 1189 3037:dup             
	// 1190 3038:ldc2            #900 <String "PMapsTips3CompleteButtonPressed">
	// 1191 3041:sipush          198
	// 1192 3044:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1193 3047:putstatic       #902 <Field AnalyticsEvent PMapsTips3CompleteButtonPressed>
		PMapsTrainingRunPreparationViewed = new AnalyticsEvent("PMapsTrainingRunPreparationViewed", 199);
	// 1194 3050:new             #2   <Class AnalyticsEvent>
	// 1195 3053:dup             
	// 1196 3054:ldc2            #903 <String "PMapsTrainingRunPreparationViewed">
	// 1197 3057:sipush          199
	// 1198 3060:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1199 3063:putstatic       #905 <Field AnalyticsEvent PMapsTrainingRunPreparationViewed>
		PMapsSectionNoMapViewed = new AnalyticsEvent("PMapsSectionNoMapViewed", 200);
	// 1200 3066:new             #2   <Class AnalyticsEvent>
	// 1201 3069:dup             
	// 1202 3070:ldc2            #906 <String "PMapsSectionNoMapViewed">
	// 1203 3073:sipush          200
	// 1204 3076:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1205 3079:putstatic       #908 <Field AnalyticsEvent PMapsSectionNoMapViewed>
		PMapsSectionMapListViewed = new AnalyticsEvent("PMapsSectionMapListViewed", 201);
	// 1206 3082:new             #2   <Class AnalyticsEvent>
	// 1207 3085:dup             
	// 1208 3086:ldc2            #909 <String "PMapsSectionMapListViewed">
	// 1209 3089:sipush          201
	// 1210 3092:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1211 3095:putstatic       #911 <Field AnalyticsEvent PMapsSectionMapListViewed>
		PMapsSectionMapListCleanButtonPressed = new AnalyticsEvent("PMapsSectionMapListCleanButtonPressed", 202);
	// 1212 3098:new             #2   <Class AnalyticsEvent>
	// 1213 3101:dup             
	// 1214 3102:ldc2            #912 <String "PMapsSectionMapListCleanButtonPressed">
	// 1215 3105:sipush          202
	// 1216 3108:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1217 3111:putstatic       #914 <Field AnalyticsEvent PMapsSectionMapListCleanButtonPressed>
		PMapsSectionMapListTrainButtonPressed = new AnalyticsEvent("PMapsSectionMapListTrainButtonPressed", 203);
	// 1218 3114:new             #2   <Class AnalyticsEvent>
	// 1219 3117:dup             
	// 1220 3118:ldc2            #915 <String "PMapsSectionMapListTrainButtonPressed">
	// 1221 3121:sipush          203
	// 1222 3124:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1223 3127:putstatic       #917 <Field AnalyticsEvent PMapsSectionMapListTrainButtonPressed>
		PMapsSectionMapPreviewViewed = new AnalyticsEvent("PMapsSectionMapPreviewViewed", 204);
	// 1224 3130:new             #2   <Class AnalyticsEvent>
	// 1225 3133:dup             
	// 1226 3134:ldc2            #918 <String "PMapsSectionMapPreviewViewed">
	// 1227 3137:sipush          204
	// 1228 3140:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1229 3143:putstatic       #920 <Field AnalyticsEvent PMapsSectionMapPreviewViewed>
		PMapsSectionMapPreviewNotRightButtonPressed = new AnalyticsEvent("PMapsSectionMapPreviewNotRightButtonPressed", 205);
	// 1230 3146:new             #2   <Class AnalyticsEvent>
	// 1231 3149:dup             
	// 1232 3150:ldc2            #921 <String "PMapsSectionMapPreviewNotRightButtonPressed">
	// 1233 3153:sipush          205
	// 1234 3156:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1235 3159:putstatic       #923 <Field AnalyticsEvent PMapsSectionMapPreviewNotRightButtonPressed>
		PMapsSectionMapReadyViewed = new AnalyticsEvent("PMapsSectionMapReadyViewed", 206);
	// 1236 3162:new             #2   <Class AnalyticsEvent>
	// 1237 3165:dup             
	// 1238 3166:ldc2            #924 <String "PMapsSectionMapReadyViewed">
	// 1239 3169:sipush          206
	// 1240 3172:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1241 3175:putstatic       #926 <Field AnalyticsEvent PMapsSectionMapReadyViewed>
		PMapsSectionMapReadyCustomizeButtonPressed = new AnalyticsEvent("PMapsSectionMapReadyCustomizeButtonPressed", 207);
	// 1242 3178:new             #2   <Class AnalyticsEvent>
	// 1243 3181:dup             
	// 1244 3182:ldc2            #927 <String "PMapsSectionMapReadyCustomizeButtonPressed">
	// 1245 3185:sipush          207
	// 1246 3188:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1247 3191:putstatic       #929 <Field AnalyticsEvent PMapsSectionMapReadyCustomizeButtonPressed>
		PMapsSectionMapReadyNotRightButtonPressed = new AnalyticsEvent("PMapsSectionMapReadyNotRightButtonPressed", 208);
	// 1248 3194:new             #2   <Class AnalyticsEvent>
	// 1249 3197:dup             
	// 1250 3198:ldc2            #930 <String "PMapsSectionMapReadyNotRightButtonPressed">
	// 1251 3201:sipush          208
	// 1252 3204:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1253 3207:putstatic       #932 <Field AnalyticsEvent PMapsSectionMapReadyNotRightButtonPressed>
		PMapTroubleshootingListViewed = new AnalyticsEvent("PMapTroubleshootingListViewed", 209);
	// 1254 3210:new             #2   <Class AnalyticsEvent>
	// 1255 3213:dup             
	// 1256 3214:ldc2            #933 <String "PMapTroubleshootingListViewed">
	// 1257 3217:sipush          209
	// 1258 3220:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1259 3223:putstatic       #935 <Field AnalyticsEvent PMapTroubleshootingListViewed>
		PMapTroubleshootingUnderstandingViewed = new AnalyticsEvent("PMapTroubleshootingUnderstandingViewed", 210);
	// 1260 3226:new             #2   <Class AnalyticsEvent>
	// 1261 3229:dup             
	// 1262 3230:ldc2            #936 <String "PMapTroubleshootingUnderstandingViewed">
	// 1263 3233:sipush          210
	// 1264 3236:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1265 3239:putstatic       #938 <Field AnalyticsEvent PMapTroubleshootingUnderstandingViewed>
		PMapTroubleshootingIncompleteViewed = new AnalyticsEvent("PMapTroubleshootingIncompleteViewed", 211);
	// 1266 3242:new             #2   <Class AnalyticsEvent>
	// 1267 3245:dup             
	// 1268 3246:ldc2            #939 <String "PMapTroubleshootingIncompleteViewed">
	// 1269 3249:sipush          211
	// 1270 3252:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1271 3255:putstatic       #941 <Field AnalyticsEvent PMapTroubleshootingIncompleteViewed>
		PMapTroubleshootingIncompleteCleanButtonPressed = new AnalyticsEvent("PMapTroubleshootingIncompleteCleanButtonPressed", 212);
	// 1272 3258:new             #2   <Class AnalyticsEvent>
	// 1273 3261:dup             
	// 1274 3262:ldc2            #942 <String "PMapTroubleshootingIncompleteCleanButtonPressed">
	// 1275 3265:sipush          212
	// 1276 3268:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1277 3271:putstatic       #944 <Field AnalyticsEvent PMapTroubleshootingIncompleteCleanButtonPressed>
		PMapTroubleshootingIncompleteTrainButtonPressed = new AnalyticsEvent("PMapTroubleshootingIncompleteTrainButtonPressed", 213);
	// 1278 3274:new             #2   <Class AnalyticsEvent>
	// 1279 3277:dup             
	// 1280 3278:ldc2            #945 <String "PMapTroubleshootingIncompleteTrainButtonPressed">
	// 1281 3281:sipush          213
	// 1282 3284:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1283 3287:putstatic       #947 <Field AnalyticsEvent PMapTroubleshootingIncompleteTrainButtonPressed>
		PMapTroubleshootingWrongViewed = new AnalyticsEvent("PMapTroubleshootingWrongViewed", 214);
	// 1284 3290:new             #2   <Class AnalyticsEvent>
	// 1285 3293:dup             
	// 1286 3294:ldc2            #948 <String "PMapTroubleshootingWrongViewed">
	// 1287 3297:sipush          214
	// 1288 3300:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1289 3303:putstatic       #950 <Field AnalyticsEvent PMapTroubleshootingWrongViewed>
		PMapTroubleshootingWrongDeleteButtonPressed = new AnalyticsEvent("PMapTroubleshootingWrongDeleteButtonPressed", 215);
	// 1290 3306:new             #2   <Class AnalyticsEvent>
	// 1291 3309:dup             
	// 1292 3310:ldc2            #951 <String "PMapTroubleshootingWrongDeleteButtonPressed">
	// 1293 3313:sipush          215
	// 1294 3316:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1295 3319:putstatic       #953 <Field AnalyticsEvent PMapTroubleshootingWrongDeleteButtonPressed>
		PMapCustomizeIntroViewed = new AnalyticsEvent("PMapCustomizeIntroViewed", 216);
	// 1296 3322:new             #2   <Class AnalyticsEvent>
	// 1297 3325:dup             
	// 1298 3326:ldc2            #954 <String "PMapCustomizeIntroViewed">
	// 1299 3329:sipush          216
	// 1300 3332:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1301 3335:putstatic       #956 <Field AnalyticsEvent PMapCustomizeIntroViewed>
		PMapsCustomizeNameMapViewed = new AnalyticsEvent("PMapsCustomizeNameMapViewed", 217);
	// 1302 3338:new             #2   <Class AnalyticsEvent>
	// 1303 3341:dup             
	// 1304 3342:ldc2            #957 <String "PMapsCustomizeNameMapViewed">
	// 1305 3345:sipush          217
	// 1306 3348:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1307 3351:putstatic       #959 <Field AnalyticsEvent PMapsCustomizeNameMapViewed>
		PMapsCustomizeNameMapNextButtonPressed = new AnalyticsEvent("PMapsCustomizeNameMapNextButtonPressed", 218);
	// 1308 3354:new             #2   <Class AnalyticsEvent>
	// 1309 3357:dup             
	// 1310 3358:ldc2            #960 <String "PMapsCustomizeNameMapNextButtonPressed">
	// 1311 3361:sipush          218
	// 1312 3364:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1313 3367:putstatic       #962 <Field AnalyticsEvent PMapsCustomizeNameMapNextButtonPressed>
		PMapsCustomizeNameMapCancelButtonPressed = new AnalyticsEvent("PMapsCustomizeNameMapCancelButtonPressed", 219);
	// 1314 3370:new             #2   <Class AnalyticsEvent>
	// 1315 3373:dup             
	// 1316 3374:ldc2            #963 <String "PMapsCustomizeNameMapCancelButtonPressed">
	// 1317 3377:sipush          219
	// 1318 3380:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1319 3383:putstatic       #965 <Field AnalyticsEvent PMapsCustomizeNameMapCancelButtonPressed>
		PMapsCustomizeSettingUpInstructionsViewed = new AnalyticsEvent("PMapsCustomizeSettingUpInstructionsViewed", 220);
	// 1320 3386:new             #2   <Class AnalyticsEvent>
	// 1321 3389:dup             
	// 1322 3390:ldc2            #966 <String "PMapsCustomizeSettingUpInstructionsViewed">
	// 1323 3393:sipush          220
	// 1324 3396:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1325 3399:putstatic       #968 <Field AnalyticsEvent PMapsCustomizeSettingUpInstructionsViewed>
		PMapsCustomizeSetupRoomsViewed = new AnalyticsEvent("PMapsCustomizeSetupRoomsViewed", 221);
	// 1326 3402:new             #2   <Class AnalyticsEvent>
	// 1327 3405:dup             
	// 1328 3406:ldc2            #969 <String "PMapsCustomizeSetupRoomsViewed">
	// 1329 3409:sipush          221
	// 1330 3412:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1331 3415:putstatic       #971 <Field AnalyticsEvent PMapsCustomizeSetupRoomsViewed>
		PMapsCustomizeSetupRoomsNextButtonPressed = new AnalyticsEvent("PMapsCustomizeSetupRoomsNextButtonPressed", 222);
	// 1332 3418:new             #2   <Class AnalyticsEvent>
	// 1333 3421:dup             
	// 1334 3422:ldc2            #972 <String "PMapsCustomizeSetupRoomsNextButtonPressed">
	// 1335 3425:sipush          222
	// 1336 3428:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1337 3431:putstatic       #974 <Field AnalyticsEvent PMapsCustomizeSetupRoomsNextButtonPressed>
		PMapsCustomizeSetupRoomsCancelButtonPressed = new AnalyticsEvent("PMapsCustomizeSetupRoomsCancelButtonPressed", 223);
	// 1338 3434:new             #2   <Class AnalyticsEvent>
	// 1339 3437:dup             
	// 1340 3438:ldc2            #975 <String "PMapsCustomizeSetupRoomsCancelButtonPressed">
	// 1341 3441:sipush          223
	// 1342 3444:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1343 3447:putstatic       #977 <Field AnalyticsEvent PMapsCustomizeSetupRoomsCancelButtonPressed>
		PMapsCustomizeLabelRoomsViewed = new AnalyticsEvent("PMapsCustomizeLabelRoomsViewed", 224);
	// 1344 3450:new             #2   <Class AnalyticsEvent>
	// 1345 3453:dup             
	// 1346 3454:ldc2            #978 <String "PMapsCustomizeLabelRoomsViewed">
	// 1347 3457:sipush          224
	// 1348 3460:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1349 3463:putstatic       #980 <Field AnalyticsEvent PMapsCustomizeLabelRoomsViewed>
		PMapsCustomizeLabelRoomsDoneButtonPressed = new AnalyticsEvent("PMapsCustomizeLabelRoomsDoneButtonPressed", 225);
	// 1350 3466:new             #2   <Class AnalyticsEvent>
	// 1351 3469:dup             
	// 1352 3470:ldc2            #981 <String "PMapsCustomizeLabelRoomsDoneButtonPressed">
	// 1353 3473:sipush          225
	// 1354 3476:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1355 3479:putstatic       #983 <Field AnalyticsEvent PMapsCustomizeLabelRoomsDoneButtonPressed>
		PMapsCustomizeLabelRoomsCancelButtonPressed = new AnalyticsEvent("PMapsCustomizeLabelRoomsCancelButtonPressed", 226);
	// 1356 3482:new             #2   <Class AnalyticsEvent>
	// 1357 3485:dup             
	// 1358 3486:ldc2            #984 <String "PMapsCustomizeLabelRoomsCancelButtonPressed">
	// 1359 3489:sipush          226
	// 1360 3492:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1361 3495:putstatic       #986 <Field AnalyticsEvent PMapsCustomizeLabelRoomsCancelButtonPressed>
		PMapsCustomizeCompleteViewed = new AnalyticsEvent("PMapsCustomizeCompleteViewed", 227);
	// 1362 3498:new             #2   <Class AnalyticsEvent>
	// 1363 3501:dup             
	// 1364 3502:ldc2            #987 <String "PMapsCustomizeCompleteViewed">
	// 1365 3505:sipush          227
	// 1366 3508:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1367 3511:putstatic       #989 <Field AnalyticsEvent PMapsCustomizeCompleteViewed>
		PMapsCustomizeCompleteCleanButtonPressed = new AnalyticsEvent("PMapsCustomizeCompleteCleanButtonPressed", 228);
	// 1368 3514:new             #2   <Class AnalyticsEvent>
	// 1369 3517:dup             
	// 1370 3518:ldc2            #990 <String "PMapsCustomizeCompleteCleanButtonPressed">
	// 1371 3521:sipush          228
	// 1372 3524:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1373 3527:putstatic       #992 <Field AnalyticsEvent PMapsCustomizeCompleteCleanButtonPressed>
		PMapsCustomizeCompleteScheduleButtonPressed = new AnalyticsEvent("PMapsCustomizeCompleteScheduleButtonPressed", 229);
	// 1374 3530:new             #2   <Class AnalyticsEvent>
	// 1375 3533:dup             
	// 1376 3534:ldc2            #993 <String "PMapsCustomizeCompleteScheduleButtonPressed">
	// 1377 3537:sipush          229
	// 1378 3540:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1379 3543:putstatic       #995 <Field AnalyticsEvent PMapsCustomizeCompleteScheduleButtonPressed>
		PMapsChooseRoomsViewed = new AnalyticsEvent("PMapsChooseRoomsViewed", 230);
	// 1380 3546:new             #2   <Class AnalyticsEvent>
	// 1381 3549:dup             
	// 1382 3550:ldc2            #996 <String "PMapsChooseRoomsViewed">
	// 1383 3553:sipush          230
	// 1384 3556:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1385 3559:putstatic       #998 <Field AnalyticsEvent PMapsChooseRoomsViewed>
		PMapsErrorRoomTooSmall = new AnalyticsEvent("PMapsErrorRoomTooSmall", 231);
	// 1386 3562:new             #2   <Class AnalyticsEvent>
	// 1387 3565:dup             
	// 1388 3566:ldc2            #999 <String "PMapsErrorRoomTooSmall">
	// 1389 3569:sipush          231
	// 1390 3572:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1391 3575:putstatic       #1001 <Field AnalyticsEvent PMapsErrorRoomTooSmall>
		PMapsErrorSaveTimedOut = new AnalyticsEvent("PMapsErrorSaveTimedOut", 232);
	// 1392 3578:new             #2   <Class AnalyticsEvent>
	// 1393 3581:dup             
	// 1394 3582:ldc2            #1002 <String "PMapsErrorSaveTimedOut">
	// 1395 3585:sipush          232
	// 1396 3588:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1397 3591:putstatic       #1004 <Field AnalyticsEvent PMapsErrorSaveTimedOut>
		PMapsErrorSaveFloorNameTimedOut = new AnalyticsEvent("PMapsErrorSaveFloorNameTimedOut", 233);
	// 1398 3594:new             #2   <Class AnalyticsEvent>
	// 1399 3597:dup             
	// 1400 3598:ldc2            #1005 <String "PMapsErrorSaveFloorNameTimedOut">
	// 1401 3601:sipush          233
	// 1402 3604:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1403 3607:putstatic       #1007 <Field AnalyticsEvent PMapsErrorSaveFloorNameTimedOut>
		PMapsErrorSegmentationTransferFailed = new AnalyticsEvent("PMapsErrorSegmentationTransferFailed", 234);
	// 1404 3610:new             #2   <Class AnalyticsEvent>
	// 1405 3613:dup             
	// 1406 3614:ldc2            #1008 <String "PMapsErrorSegmentationTransferFailed">
	// 1407 3617:sipush          234
	// 1408 3620:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1409 3623:putstatic       #1010 <Field AnalyticsEvent PMapsErrorSegmentationTransferFailed>
		PMapsErrorEmptyMap = new AnalyticsEvent("PMapsErrorEmptyMap", 235);
	// 1410 3626:new             #2   <Class AnalyticsEvent>
	// 1411 3629:dup             
	// 1412 3630:ldc2            #1011 <String "PMapsErrorEmptyMap">
	// 1413 3633:sipush          235
	// 1414 3636:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1415 3639:putstatic       #1013 <Field AnalyticsEvent PMapsErrorEmptyMap>
		PMapsErrorSplitInvalidMap = new AnalyticsEvent("PMapsErrorSplitInvalidMap", 236);
	// 1416 3642:new             #2   <Class AnalyticsEvent>
	// 1417 3645:dup             
	// 1418 3646:ldc2            #1014 <String "PMapsErrorSplitInvalidMap">
	// 1419 3649:sipush          236
	// 1420 3652:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1421 3655:putstatic       #1016 <Field AnalyticsEvent PMapsErrorSplitInvalidMap>
		PMapsErrorRegionDuplicatePoints = new AnalyticsEvent("PMapsErrorRegionDuplicatePoints", 237);
	// 1422 3658:new             #2   <Class AnalyticsEvent>
	// 1423 3661:dup             
	// 1424 3662:ldc2            #1017 <String "PMapsErrorRegionDuplicatePoints">
	// 1425 3665:sipush          237
	// 1426 3668:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1427 3671:putstatic       #1019 <Field AnalyticsEvent PMapsErrorRegionDuplicatePoints>
		OnDemandOtaAvailableViewed = new AnalyticsEvent("OnDemandOtaAvailableViewed", 238);
	// 1428 3674:new             #2   <Class AnalyticsEvent>
	// 1429 3677:dup             
	// 1430 3678:ldc2            #1020 <String "OnDemandOtaAvailableViewed">
	// 1431 3681:sipush          238
	// 1432 3684:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1433 3687:putstatic       #1022 <Field AnalyticsEvent OnDemandOtaAvailableViewed>
		OnDemandOtaAvailableHelpButtonPressed = new AnalyticsEvent("OnDemandOtaAvailableHelpButtonPressed", 239);
	// 1434 3690:new             #2   <Class AnalyticsEvent>
	// 1435 3693:dup             
	// 1436 3694:ldc2            #1023 <String "OnDemandOtaAvailableHelpButtonPressed">
	// 1437 3697:sipush          239
	// 1438 3700:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1439 3703:putstatic       #1025 <Field AnalyticsEvent OnDemandOtaAvailableHelpButtonPressed>
		OnDemandOtaUpdateNowButtonPressed = new AnalyticsEvent("OnDemandOtaUpdateNowButtonPressed", 240);
	// 1440 3706:new             #2   <Class AnalyticsEvent>
	// 1441 3709:dup             
	// 1442 3710:ldc2            #1026 <String "OnDemandOtaUpdateNowButtonPressed">
	// 1443 3713:sipush          240
	// 1444 3716:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1445 3719:putstatic       #1028 <Field AnalyticsEvent OnDemandOtaUpdateNowButtonPressed>
		OnDemandOtaUpdateLaterButtonPressed = new AnalyticsEvent("OnDemandOtaUpdateLaterButtonPressed", 241);
	// 1446 3722:new             #2   <Class AnalyticsEvent>
	// 1447 3725:dup             
	// 1448 3726:ldc2            #1029 <String "OnDemandOtaUpdateLaterButtonPressed">
	// 1449 3729:sipush          241
	// 1450 3732:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1451 3735:putstatic       #1031 <Field AnalyticsEvent OnDemandOtaUpdateLaterButtonPressed>
		OnDemandOtaInProgressViewed = new AnalyticsEvent("OnDemandOtaInProgressViewed", 242);
	// 1452 3738:new             #2   <Class AnalyticsEvent>
	// 1453 3741:dup             
	// 1454 3742:ldc2            #1032 <String "OnDemandOtaInProgressViewed">
	// 1455 3745:sipush          242
	// 1456 3748:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1457 3751:putstatic       #1034 <Field AnalyticsEvent OnDemandOtaInProgressViewed>
		OnDemandOtaInProgressHelpButtonPressed = new AnalyticsEvent("OnDemandOtaInProgressHelpButtonPressed", 243);
	// 1458 3754:new             #2   <Class AnalyticsEvent>
	// 1459 3757:dup             
	// 1460 3758:ldc2            #1035 <String "OnDemandOtaInProgressHelpButtonPressed">
	// 1461 3761:sipush          243
	// 1462 3764:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1463 3767:putstatic       #1037 <Field AnalyticsEvent OnDemandOtaInProgressHelpButtonPressed>
		OnDemandOtaSetupCompleteViewed = new AnalyticsEvent("OnDemandOtaSetupCompleteViewed", 244);
	// 1464 3770:new             #2   <Class AnalyticsEvent>
	// 1465 3773:dup             
	// 1466 3774:ldc2            #1038 <String "OnDemandOtaSetupCompleteViewed">
	// 1467 3777:sipush          244
	// 1468 3780:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1469 3783:putstatic       #1040 <Field AnalyticsEvent OnDemandOtaSetupCompleteViewed>
		OnDemandOtaFailedViewed = new AnalyticsEvent("OnDemandOtaFailedViewed", 245);
	// 1470 3786:new             #2   <Class AnalyticsEvent>
	// 1471 3789:dup             
	// 1472 3790:ldc2            #1041 <String "OnDemandOtaFailedViewed">
	// 1473 3793:sipush          245
	// 1474 3796:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1475 3799:putstatic       #1043 <Field AnalyticsEvent OnDemandOtaFailedViewed>
		OnDemandOtaFailedHelpButtonPressed = new AnalyticsEvent("OnDemandOtaFailedHelpButtonPressed", 246);
	// 1476 3802:new             #2   <Class AnalyticsEvent>
	// 1477 3805:dup             
	// 1478 3806:ldc2            #1044 <String "OnDemandOtaFailedHelpButtonPressed">
	// 1479 3809:sipush          246
	// 1480 3812:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1481 3815:putstatic       #1046 <Field AnalyticsEvent OnDemandOtaFailedHelpButtonPressed>
		OnDemandOtaFailedTryAgainButtonPressed = new AnalyticsEvent("OnDemandOtaFailedTryAgainButtonPressed", 247);
	// 1482 3818:new             #2   <Class AnalyticsEvent>
	// 1483 3821:dup             
	// 1484 3822:ldc2            #1047 <String "OnDemandOtaFailedTryAgainButtonPressed">
	// 1485 3825:sipush          247
	// 1486 3828:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1487 3831:putstatic       #1049 <Field AnalyticsEvent OnDemandOtaFailedTryAgainButtonPressed>
		OnDemandOtaFailedUpdateLaterButtonPressed = new AnalyticsEvent("OnDemandOtaFailedUpdateLaterButtonPressed", 248);
	// 1488 3834:new             #2   <Class AnalyticsEvent>
	// 1489 3837:dup             
	// 1490 3838:ldc2            #1050 <String "OnDemandOtaFailedUpdateLaterButtonPressed">
	// 1491 3841:sipush          248
	// 1492 3844:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1493 3847:putstatic       #1052 <Field AnalyticsEvent OnDemandOtaFailedUpdateLaterButtonPressed>
		OnDemandOtaSucceededViewed = new AnalyticsEvent("OnDemandOtaSucceededViewed", 249);
	// 1494 3850:new             #2   <Class AnalyticsEvent>
	// 1495 3853:dup             
	// 1496 3854:ldc2            #1053 <String "OnDemandOtaSucceededViewed">
	// 1497 3857:sipush          249
	// 1498 3860:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1499 3863:putstatic       #1055 <Field AnalyticsEvent OnDemandOtaSucceededViewed>
		NotificationCenterBellIconPressed = new AnalyticsEvent("NotificationCenterBellIconPressed", 250);
	// 1500 3866:new             #2   <Class AnalyticsEvent>
	// 1501 3869:dup             
	// 1502 3870:ldc2            #1056 <String "NotificationCenterBellIconPressed">
	// 1503 3873:sipush          250
	// 1504 3876:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1505 3879:putstatic       #1058 <Field AnalyticsEvent NotificationCenterBellIconPressed>
		NotificationCenterViewed = new AnalyticsEvent("NotificationCenterViewed", 251);
	// 1506 3882:new             #2   <Class AnalyticsEvent>
	// 1507 3885:dup             
	// 1508 3886:ldc2            #1059 <String "NotificationCenterViewed">
	// 1509 3889:sipush          251
	// 1510 3892:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1511 3895:putstatic       #1061 <Field AnalyticsEvent NotificationCenterViewed>
		NotificationSelected = new AnalyticsEvent("NotificationSelected", 252);
	// 1512 3898:new             #2   <Class AnalyticsEvent>
	// 1513 3901:dup             
	// 1514 3902:ldc2            #1062 <String "NotificationSelected">
	// 1515 3905:sipush          252
	// 1516 3908:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1517 3911:putstatic       #1064 <Field AnalyticsEvent NotificationSelected>
		NotificationCenterVideoViewed = new AnalyticsEvent("NotificationCenterVideoViewed", 253);
	// 1518 3914:new             #2   <Class AnalyticsEvent>
	// 1519 3917:dup             
	// 1520 3918:ldc2            #1065 <String "NotificationCenterVideoViewed">
	// 1521 3921:sipush          253
	// 1522 3924:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1523 3927:putstatic       #1067 <Field AnalyticsEvent NotificationCenterVideoViewed>
		NotificationBackSelected = new AnalyticsEvent("NotificationBackSelected", 254);
	// 1524 3930:new             #2   <Class AnalyticsEvent>
	// 1525 3933:dup             
	// 1526 3934:ldc2            #1068 <String "NotificationBackSelected">
	// 1527 3937:sipush          254
	// 1528 3940:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1529 3943:putstatic       #1070 <Field AnalyticsEvent NotificationBackSelected>
		NotificationFeedback = new AnalyticsEvent("NotificationFeedback", 255);
	// 1530 3946:new             #2   <Class AnalyticsEvent>
	// 1531 3949:dup             
	// 1532 3950:ldc2            #1071 <String "NotificationFeedback">
	// 1533 3953:sipush          255
	// 1534 3956:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1535 3959:putstatic       #1073 <Field AnalyticsEvent NotificationFeedback>
		NotificationBackSmartScheduleSelected = new AnalyticsEvent("NotificationBackSmartScheduleSelected", 256);
	// 1536 3962:new             #2   <Class AnalyticsEvent>
	// 1537 3965:dup             
	// 1538 3966:ldc2            #1074 <String "NotificationBackSmartScheduleSelected">
	// 1539 3969:sipush          256
	// 1540 3972:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1541 3975:putstatic       #1076 <Field AnalyticsEvent NotificationBackSmartScheduleSelected>
		NotificationCenterSmartScheduleMessageClicked = new AnalyticsEvent("NotificationCenterSmartScheduleMessageClicked", 257);
	// 1542 3978:new             #2   <Class AnalyticsEvent>
	// 1543 3981:dup             
	// 1544 3982:ldc2            #1077 <String "NotificationCenterSmartScheduleMessageClicked">
	// 1545 3985:sipush          257
	// 1546 3988:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1547 3991:putstatic       #1079 <Field AnalyticsEvent NotificationCenterSmartScheduleMessageClicked>
		NotificationCenterSmartScheduleAccepted = new AnalyticsEvent("NotificationCenterSmartScheduleAccepted", 258);
	// 1548 3994:new             #2   <Class AnalyticsEvent>
	// 1549 3997:dup             
	// 1550 3998:ldc2            #1080 <String "NotificationCenterSmartScheduleAccepted">
	// 1551 4001:sipush          258
	// 1552 4004:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1553 4007:putstatic       #1082 <Field AnalyticsEvent NotificationCenterSmartScheduleAccepted>
		NotificationCenterSmartScheduleDeclined = new AnalyticsEvent("NotificationCenterSmartScheduleDeclined", 259);
	// 1554 4010:new             #2   <Class AnalyticsEvent>
	// 1555 4013:dup             
	// 1556 4014:ldc2            #1083 <String "NotificationCenterSmartScheduleDeclined">
	// 1557 4017:sipush          259
	// 1558 4020:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1559 4023:putstatic       #1085 <Field AnalyticsEvent NotificationCenterSmartScheduleDeclined>
		ProvAddRobotViewed = new AnalyticsEvent("ProvAddRobotViewed", 260);
	// 1560 4026:new             #2   <Class AnalyticsEvent>
	// 1561 4029:dup             
	// 1562 4030:ldc2            #1086 <String "ProvAddRobotViewed">
	// 1563 4033:sipush          260
	// 1564 4036:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1565 4039:putstatic       #1088 <Field AnalyticsEvent ProvAddRobotViewed>
		ProvAddRobotSelected = new AnalyticsEvent("ProvAddRobotSelected", 261);
	// 1566 4042:new             #2   <Class AnalyticsEvent>
	// 1567 4045:dup             
	// 1568 4046:ldc2            #1089 <String "ProvAddRobotSelected">
	// 1569 4049:sipush          261
	// 1570 4052:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1571 4055:putstatic       #1091 <Field AnalyticsEvent ProvAddRobotSelected>
		ProvSetupChecklistViewed = new AnalyticsEvent("ProvSetupChecklistViewed", 262);
	// 1572 4058:new             #2   <Class AnalyticsEvent>
	// 1573 4061:dup             
	// 1574 4062:ldc2            #1092 <String "ProvSetupChecklistViewed">
	// 1575 4065:sipush          262
	// 1576 4068:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1577 4071:putstatic       #1094 <Field AnalyticsEvent ProvSetupChecklistViewed>
		ProvEnableBluetoothErrorViewed = new AnalyticsEvent("ProvEnableBluetoothErrorViewed", 263);
	// 1578 4074:new             #2   <Class AnalyticsEvent>
	// 1579 4077:dup             
	// 1580 4078:ldc2            #1095 <String "ProvEnableBluetoothErrorViewed">
	// 1581 4081:sipush          263
	// 1582 4084:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1583 4087:putstatic       #1097 <Field AnalyticsEvent ProvEnableBluetoothErrorViewed>
		ProvHomeBasePlacementViewed = new AnalyticsEvent("ProvHomeBasePlacementViewed", 264);
	// 1584 4090:new             #2   <Class AnalyticsEvent>
	// 1585 4093:dup             
	// 1586 4094:ldc2            #1098 <String "ProvHomeBasePlacementViewed">
	// 1587 4097:sipush          264
	// 1588 4100:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1589 4103:putstatic       #1100 <Field AnalyticsEvent ProvHomeBasePlacementViewed>
		ProvRobotNameViewed = new AnalyticsEvent("ProvRobotNameViewed", 265);
	// 1590 4106:new             #2   <Class AnalyticsEvent>
	// 1591 4109:dup             
	// 1592 4110:ldc2            #1101 <String "ProvRobotNameViewed">
	// 1593 4113:sipush          265
	// 1594 4116:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1595 4119:putstatic       #1103 <Field AnalyticsEvent ProvRobotNameViewed>
		ProvRobotNameDone = new AnalyticsEvent("ProvRobotNameDone", 266);
	// 1596 4122:new             #2   <Class AnalyticsEvent>
	// 1597 4125:dup             
	// 1598 4126:ldc2            #1104 <String "ProvRobotNameDone">
	// 1599 4129:sipush          266
	// 1600 4132:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1601 4135:putstatic       #1106 <Field AnalyticsEvent ProvRobotNameDone>
		ProvCurrentNetworkViewed = new AnalyticsEvent("ProvCurrentNetworkViewed", 267);
	// 1602 4138:new             #2   <Class AnalyticsEvent>
	// 1603 4141:dup             
	// 1604 4142:ldc2            #1107 <String "ProvCurrentNetworkViewed">
	// 1605 4145:sipush          267
	// 1606 4148:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1607 4151:putstatic       #1109 <Field AnalyticsEvent ProvCurrentNetworkViewed>
		ProvCurrentNetworkChangeButtonPressed = new AnalyticsEvent("ProvCurrentNetworkChangeButtonPressed", 268);
	// 1608 4154:new             #2   <Class AnalyticsEvent>
	// 1609 4157:dup             
	// 1610 4158:ldc2            #1110 <String "ProvCurrentNetworkChangeButtonPressed">
	// 1611 4161:sipush          268
	// 1612 4164:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1613 4167:putstatic       #1112 <Field AnalyticsEvent ProvCurrentNetworkChangeButtonPressed>
		ProvAdvancedWifiSettingsViewed = new AnalyticsEvent("ProvAdvancedWifiSettingsViewed", 269);
	// 1614 4170:new             #2   <Class AnalyticsEvent>
	// 1615 4173:dup             
	// 1616 4174:ldc2            #1113 <String "ProvAdvancedWifiSettingsViewed">
	// 1617 4177:sipush          269
	// 1618 4180:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1619 4183:putstatic       #1115 <Field AnalyticsEvent ProvAdvancedWifiSettingsViewed>
		ProvWifiPasswordViewed = new AnalyticsEvent("ProvWifiPasswordViewed", 270);
	// 1620 4186:new             #2   <Class AnalyticsEvent>
	// 1621 4189:dup             
	// 1622 4190:ldc2            #1116 <String "ProvWifiPasswordViewed">
	// 1623 4193:sipush          270
	// 1624 4196:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1625 4199:putstatic       #1118 <Field AnalyticsEvent ProvWifiPasswordViewed>
		ProvWifiPasswordDone = new AnalyticsEvent("ProvWifiPasswordDone", 271);
	// 1626 4202:new             #2   <Class AnalyticsEvent>
	// 1627 4205:dup             
	// 1628 4206:ldc2            #1119 <String "ProvWifiPasswordDone">
	// 1629 4209:sipush          271
	// 1630 4212:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1631 4215:putstatic       #1121 <Field AnalyticsEvent ProvWifiPasswordDone>
		ProvActivateRoombaViewed = new AnalyticsEvent("ProvActivateRoombaViewed", 272);
	// 1632 4218:new             #2   <Class AnalyticsEvent>
	// 1633 4221:dup             
	// 1634 4222:ldc2            #1122 <String "ProvActivateRoombaViewed">
	// 1635 4225:sipush          272
	// 1636 4228:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1637 4231:putstatic       #1124 <Field AnalyticsEvent ProvActivateRoombaViewed>
		ProvActivateRoombaConfirmation = new AnalyticsEvent("ProvActivateRoombaConfirmation", 273);
	// 1638 4234:new             #2   <Class AnalyticsEvent>
	// 1639 4237:dup             
	// 1640 4238:ldc2            #1125 <String "ProvActivateRoombaConfirmation">
	// 1641 4241:sipush          273
	// 1642 4244:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1643 4247:putstatic       #1127 <Field AnalyticsEvent ProvActivateRoombaConfirmation>
		ProvActivateRoombaContinueButtonPressed = new AnalyticsEvent("ProvActivateRoombaContinueButtonPressed", 274);
	// 1644 4250:new             #2   <Class AnalyticsEvent>
	// 1645 4253:dup             
	// 1646 4254:ldc2            #1128 <String "ProvActivateRoombaContinueButtonPressed">
	// 1647 4257:sipush          274
	// 1648 4260:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1649 4263:putstatic       #1130 <Field AnalyticsEvent ProvActivateRoombaContinueButtonPressed>
		ProvBleDiscoveryViewed = new AnalyticsEvent("ProvBleDiscoveryViewed", 275);
	// 1650 4266:new             #2   <Class AnalyticsEvent>
	// 1651 4269:dup             
	// 1652 4270:ldc2            #1131 <String "ProvBleDiscoveryViewed">
	// 1653 4273:sipush          275
	// 1654 4276:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1655 4279:putstatic       #1133 <Field AnalyticsEvent ProvBleDiscoveryViewed>
		ProvBleDiscoveryResult = new AnalyticsEvent("ProvBleDiscoveryResult", 276);
	// 1656 4282:new             #2   <Class AnalyticsEvent>
	// 1657 4285:dup             
	// 1658 4286:ldc2            #1134 <String "ProvBleDiscoveryResult">
	// 1659 4289:sipush          276
	// 1660 4292:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1661 4295:putstatic       #1136 <Field AnalyticsEvent ProvBleDiscoveryResult>
		ProvConnectToRoombaViewed = new AnalyticsEvent("ProvConnectToRoombaViewed", 277);
	// 1662 4298:new             #2   <Class AnalyticsEvent>
	// 1663 4301:dup             
	// 1664 4302:ldc2            #1137 <String "ProvConnectToRoombaViewed">
	// 1665 4305:sipush          277
	// 1666 4308:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1667 4311:putstatic       #1139 <Field AnalyticsEvent ProvConnectToRoombaViewed>
		ProvInfoButtonPressed = new AnalyticsEvent("ProvInfoButtonPressed", 278);
	// 1668 4314:new             #2   <Class AnalyticsEvent>
	// 1669 4317:dup             
	// 1670 4318:ldc2            #1140 <String "ProvInfoButtonPressed">
	// 1671 4321:sipush          278
	// 1672 4324:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1673 4327:putstatic       #1142 <Field AnalyticsEvent ProvInfoButtonPressed>
		ProvCancelButtonPressed = new AnalyticsEvent("ProvCancelButtonPressed", 279);
	// 1674 4330:new             #2   <Class AnalyticsEvent>
	// 1675 4333:dup             
	// 1676 4334:ldc2            #1143 <String "ProvCancelButtonPressed">
	// 1677 4337:sipush          279
	// 1678 4340:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1679 4343:putstatic       #1145 <Field AnalyticsEvent ProvCancelButtonPressed>
		ProvViewed = new AnalyticsEvent("ProvViewed", 280);
	// 1680 4346:new             #2   <Class AnalyticsEvent>
	// 1681 4349:dup             
	// 1682 4350:ldc2            #1146 <String "ProvViewed">
	// 1683 4353:sipush          280
	// 1684 4356:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1685 4359:putstatic       #1148 <Field AnalyticsEvent ProvViewed>
		ProvErrorViewed = new AnalyticsEvent("ProvErrorViewed", 281);
	// 1686 4362:new             #2   <Class AnalyticsEvent>
	// 1687 4365:dup             
	// 1688 4366:ldc2            #1149 <String "ProvErrorViewed">
	// 1689 4369:sipush          281
	// 1690 4372:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1691 4375:putstatic       #1151 <Field AnalyticsEvent ProvErrorViewed>
		ProvStarted = new AnalyticsEvent("ProvStarted", 282);
	// 1692 4378:new             #2   <Class AnalyticsEvent>
	// 1693 4381:dup             
	// 1694 4382:ldc2            #1152 <String "ProvStarted">
	// 1695 4385:sipush          282
	// 1696 4388:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1697 4391:putstatic       #1154 <Field AnalyticsEvent ProvStarted>
		ProvStatus = new AnalyticsEvent("ProvStatus", 283);
	// 1698 4394:new             #2   <Class AnalyticsEvent>
	// 1699 4397:dup             
	// 1700 4398:ldc2            #1155 <String "ProvStatus">
	// 1701 4401:sipush          283
	// 1702 4404:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1703 4407:putstatic       #1157 <Field AnalyticsEvent ProvStatus>
		ProvStatusConnected = new AnalyticsEvent("ProvStatusConnected", 284);
	// 1704 4410:new             #2   <Class AnalyticsEvent>
	// 1705 4413:dup             
	// 1706 4414:ldc2            #1158 <String "ProvStatusConnected">
	// 1707 4417:sipush          284
	// 1708 4420:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1709 4423:putstatic       #1160 <Field AnalyticsEvent ProvStatusConnected>
		ProvStatusSendingConfig = new AnalyticsEvent("ProvStatusSendingConfig", 285);
	// 1710 4426:new             #2   <Class AnalyticsEvent>
	// 1711 4429:dup             
	// 1712 4430:ldc2            #1161 <String "ProvStatusSendingConfig">
	// 1713 4433:sipush          285
	// 1714 4436:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1715 4439:putstatic       #1163 <Field AnalyticsEvent ProvStatusSendingConfig>
		ProvStatusCheckingConfig = new AnalyticsEvent("ProvStatusCheckingConfig", 286);
	// 1716 4442:new             #2   <Class AnalyticsEvent>
	// 1717 4445:dup             
	// 1718 4446:ldc2            #1164 <String "ProvStatusCheckingConfig">
	// 1719 4449:sipush          286
	// 1720 4452:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1721 4455:putstatic       #1166 <Field AnalyticsEvent ProvStatusCheckingConfig>
		ProvStatusActivatingWifi = new AnalyticsEvent("ProvStatusActivatingWifi", 287);
	// 1722 4458:new             #2   <Class AnalyticsEvent>
	// 1723 4461:dup             
	// 1724 4462:ldc2            #1167 <String "ProvStatusActivatingWifi">
	// 1725 4465:sipush          287
	// 1726 4468:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1727 4471:putstatic       #1169 <Field AnalyticsEvent ProvStatusActivatingWifi>
		ProvStatusVerifyingConnection = new AnalyticsEvent("ProvStatusVerifyingConnection", 288);
	// 1728 4474:new             #2   <Class AnalyticsEvent>
	// 1729 4477:dup             
	// 1730 4478:ldc2            #1170 <String "ProvStatusVerifyingConnection">
	// 1731 4481:sipush          288
	// 1732 4484:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1733 4487:putstatic       #1172 <Field AnalyticsEvent ProvStatusVerifyingConnection>
		ProvError = new AnalyticsEvent("ProvError", 289);
	// 1734 4490:new             #2   <Class AnalyticsEvent>
	// 1735 4493:dup             
	// 1736 4494:ldc2            #1173 <String "ProvError">
	// 1737 4497:sipush          289
	// 1738 4500:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1739 4503:putstatic       #1175 <Field AnalyticsEvent ProvError>
		ProvFinished = new AnalyticsEvent("ProvFinished", 290);
	// 1740 4506:new             #2   <Class AnalyticsEvent>
	// 1741 4509:dup             
	// 1742 4510:ldc2            #1176 <String "ProvFinished">
	// 1743 4513:sipush          290
	// 1744 4516:invokespecial   #306 <Method void AnalyticsEvent(String, int)>
	// 1745 4519:putstatic       #1178 <Field AnalyticsEvent ProvFinished>
		$VALUES = (new AnalyticsEvent[] {
			RobotHealedMessageViewed, ReAddRobotPressedAfterBlidHealing, RoombaCleanMissionStarted, BraavaCleanMissionStarted, HistorySummaryView, HistoryDetailView, AppLaunched, AppLaunchedAfterAppInstall, AppLaunchedAfterAppUpgrade, AppForegrounded, 
			AppBackgrounded, BadgedAppOpened, RobotAdded, RobotRemoved, ScheduleViewed, ScheduleChanged, CleaningPreferencesView, FinishWhenBinFullSettingChanged, EdgeCleanSettingChanged, CarpetBoostSettingsView, 
			CarpetBoostSettingChanged, CleaningPassSettingsView, CleaningPassSettingChanged, CleaningPresetSettingChanged, CleaningPreferencesDefaultsRestored, MoreViewed, CareViewed, HelpViewed, SettingsViewed, LocateRoombaButtonPressed, 
			SideMenuViewed, StoreViewed, CloudButtonPressed, CareResetStatusButtonPressed, CareStepByStepGuideViewed, HistorySummaryTabChanged, CleanScreenErrorIndicatorPressed, MissionHistoryDetailBottomSheetView, LifetimeHistoryInfoButtonPressed, HistoryMissionMapRated, 
			HistoryDetailErrorIndicatorPressed, CleanMapEnabledSettingChanged, OnboardingBegan, AppWelcomeViewed, AccountOptionsViewed, CountryPickerViewed, LoginViewed, CreateAccountViewed, UserLoggedIn, UserLoggedOut, 
			CreateAccountLaterButtonPressed, CreateAccountFromSideMenuViewed, UserTermsLinkPressed, CareBinViewed, CareCoreRobotViewed, CareDebrisExtractorsViewed, AdditionalHelpViewed, AdditionalHelpContactButtonPressed, AboutThisAppViewed, AboutThisAppEulaViewed, 
			AboutThisAppFollowButtonPressed, CommonQuestionsViewed, AnyCommonQuestionsOpened, HelpVideoWatched, HelpDocumentViewed, ReActivateAppOverviewPressed, WiFiSettingsViewed, ReducedPowerStandbyModeViewed, AboutRobotViewed, RemoveRobotViewed, 
			ResetRobotViewed, CleanMapInteraction, ConnectedHomeViewed, CommandTimedOut, HeartBeatMissed, AccountError, BraavaSpotCleanViewed, BraavaSpotCleanPressed, BraavaPadOptionsViewed, BraavaPadOptionsChanged, 
			BraavaStoreButtonPressed, AppServiceDiscoveryResult, AppServiceDiscoverySummary, AssetServiceDiscoverySummary, AccountInfoRequestResult, AccountInfoRequestSummary, ExpeditedOtaViewed, ExpeditedOtaRequested, NewAppVersionAvailableViewed, NewAppVersionAvailableUpdateClicked, 
			NewAppVersionAvailableSkipClicked, AccountServiceUnavailableDialogViewed, AccountAndPrivacyViewed, ManageAccountViewed, UpdateProfileViewed, AccountProfileUpdated, AccountUpdatePasswordViewed, NotificationSettingsViewed, NotificationSettingsChanged, PrivacyViewed, 
			RoombaSetupChecklistViewed, RoombaSetupDockPlacementViewed, RoombaSetupWifiInfoViewed, RoombaSetupAdvancedWifiInfoViewed, RoombaSetupActivateRoombaViewed, RoombaSetupConnectToRoombaViewed, RoombaSetupProvisioningViewed, RoombaSetupProvisioningErrorViewed, RoombaProvisioningFinished, RoombaV2ProvisioningPart1, 
			RoombaV2ProvisioningPart2, RoombaV2ProvisioningPart3, RoombaV2ProvisioningPart4, RoombaV2ProvisioningPart5, RoombaV2ProvisioningError, RoombaV1ProvisioningError, RoombaSetupCustomerRegistrationViewed, RoombaSetupFinished, RoombaWelcomeVideoViewed, EnjoyingAppPromptResponseGiven, 
			AppFeedbackResponseGiven, AppFeedbackResponseCancelled, WifiMapFeedbackResponseGiven, BetaProgramFeedbackSubmitted, BetaProgramIntroductionPageViewed, BetaProgramIWantInButtonPressed, BetaProgramPageViewed, WifiCoverageToggled, WifiCoverageMapScreenViewed, BetaProgramThreeDotsButtonPressed, 
			LeaveBetaProgramConfirmationButtonPressed, WifiMapTabViewed, WifiMapBottomSheetViewed, HistoryProvideFeedbackButtonPressed, AssetRegistrationWithCloudFinished, LocalOtaFirmwareUpdateFinished, OnDemandOtaFirmwareUpdateAvailableFinished, OnDemandOtaFirmwareUpdateReadyFinished, OnDemandOtaFirmwareUpdateLoadingFinished, OnDemandOtaFirmwareUpdateInstallingFinished, 
			OnDemandOtaFirmwareUpdateSuccessFinished, OnDemandOtaFirmwareUpdateError, CleanScheduleTwoWelcomeViewed, CleanScheduleTwoPopularPressed, CleanScheduleTwoAddPressed, CleanScheduleTwoCreateScreenViewed, CleanScheduleTwoCleaningPresetViewed, CleanScheduleTwoNewScheduleCreated, CleanScheduleTwoExistingScheduleEdited, CleanScheduleTwoExistingScheduleToggled, 
			CleanScheduleTwoExistingScheduleDeleted, CleanScheduleTwoExistingScheduleViewed, CleanScheduleTwoTimeoutError, CleanScheduleTwoPMAPSChangeLayoutPromptViewed, CleanScheduleTwoSchedulesDeletedFromPMAPSChange, CleanScheduleTwoScheduleLimitViewed, CleanScheduleTwoUpdateFinished, EvacuationDockEmptyBinButtonPressed, EvacuationDockErrorHelpContentViewed, EvacuationDockBagMissingHelpContentViewed, 
			EvacuationDockAboutDockViewed, PMapsChooseRoomsButtonPressed, PMapsSmartMapsButtonPressed, PMapsDirectedRoomCleanStarted, PMapsTrainingRunStarted, PMapsCleanButtonIntro1Viewed, PMapsCleanButtonIntro1CancelButtonPressed, PMapsCleanButtonIntro1NextButtonPressed, PMapsCleanButtonIntro2Viewed, PMapsCleanButtonIntro2CancelButtonPressed, 
			PMapsCleanButtonIntro2CompleteButtonPressed, PMapsSectionIntro1Viewed, PMapsSectionIntro1CancelButtonPressed, PMapsSectionIntro1NextButtonPressed, PMapsSectionIntro2Viewed, PMapsSectionIntro2CancelButtonPressed, PMapsSectionIntro2NextButtonPressed, PMapsSectionIntro3Viewed, PMapsSectionIntro3CancelButtonPressed, PMapsSectionIntro3ActivateButtonPressed, 
			PMapsSectionIntro4Viewed, PMapsSectionIntro4CancelButtonPressed, PMapsSectionIntro4MaybeLaterButtonPressed, PMapsSectionIntro4AddTrainingRunButtonPressed, PMapsSectionIntro5Viewed, PMapsSectionIntro5CancelButtonPressed, PMapsSectionIntro5StartTrainingRunButtonPressed, PMapsSectionIntroCompleteViewed, PMapsSectionIntroCompleteCancelButtonPressed, PMapsSectionIntroCompleteTipsButtonPressed, 
			PMapsTips1Viewed, PMapsTips1CancelButtonPressed, PMapsTips1NextButtonPressed, PMapsTips2Viewed, PMapsTips2CancelButtonPressed, PMapsTips2NextButtonPressed, PMapsTips3Viewed, PMapsTips3CancelButtonPressed, PMapsTips3CompleteButtonPressed, PMapsTrainingRunPreparationViewed, 
			PMapsSectionNoMapViewed, PMapsSectionMapListViewed, PMapsSectionMapListCleanButtonPressed, PMapsSectionMapListTrainButtonPressed, PMapsSectionMapPreviewViewed, PMapsSectionMapPreviewNotRightButtonPressed, PMapsSectionMapReadyViewed, PMapsSectionMapReadyCustomizeButtonPressed, PMapsSectionMapReadyNotRightButtonPressed, PMapTroubleshootingListViewed, 
			PMapTroubleshootingUnderstandingViewed, PMapTroubleshootingIncompleteViewed, PMapTroubleshootingIncompleteCleanButtonPressed, PMapTroubleshootingIncompleteTrainButtonPressed, PMapTroubleshootingWrongViewed, PMapTroubleshootingWrongDeleteButtonPressed, PMapCustomizeIntroViewed, PMapsCustomizeNameMapViewed, PMapsCustomizeNameMapNextButtonPressed, PMapsCustomizeNameMapCancelButtonPressed, 
			PMapsCustomizeSettingUpInstructionsViewed, PMapsCustomizeSetupRoomsViewed, PMapsCustomizeSetupRoomsNextButtonPressed, PMapsCustomizeSetupRoomsCancelButtonPressed, PMapsCustomizeLabelRoomsViewed, PMapsCustomizeLabelRoomsDoneButtonPressed, PMapsCustomizeLabelRoomsCancelButtonPressed, PMapsCustomizeCompleteViewed, PMapsCustomizeCompleteCleanButtonPressed, PMapsCustomizeCompleteScheduleButtonPressed, 
			PMapsChooseRoomsViewed, PMapsErrorRoomTooSmall, PMapsErrorSaveTimedOut, PMapsErrorSaveFloorNameTimedOut, PMapsErrorSegmentationTransferFailed, PMapsErrorEmptyMap, PMapsErrorSplitInvalidMap, PMapsErrorRegionDuplicatePoints, OnDemandOtaAvailableViewed, OnDemandOtaAvailableHelpButtonPressed, 
			OnDemandOtaUpdateNowButtonPressed, OnDemandOtaUpdateLaterButtonPressed, OnDemandOtaInProgressViewed, OnDemandOtaInProgressHelpButtonPressed, OnDemandOtaSetupCompleteViewed, OnDemandOtaFailedViewed, OnDemandOtaFailedHelpButtonPressed, OnDemandOtaFailedTryAgainButtonPressed, OnDemandOtaFailedUpdateLaterButtonPressed, OnDemandOtaSucceededViewed, 
			NotificationCenterBellIconPressed, NotificationCenterViewed, NotificationSelected, NotificationCenterVideoViewed, NotificationBackSelected, NotificationFeedback, NotificationBackSmartScheduleSelected, NotificationCenterSmartScheduleMessageClicked, NotificationCenterSmartScheduleAccepted, NotificationCenterSmartScheduleDeclined, 
			ProvAddRobotViewed, ProvAddRobotSelected, ProvSetupChecklistViewed, ProvEnableBluetoothErrorViewed, ProvHomeBasePlacementViewed, ProvRobotNameViewed, ProvRobotNameDone, ProvCurrentNetworkViewed, ProvCurrentNetworkChangeButtonPressed, ProvAdvancedWifiSettingsViewed, 
			ProvWifiPasswordViewed, ProvWifiPasswordDone, ProvActivateRoombaViewed, ProvActivateRoombaConfirmation, ProvActivateRoombaContinueButtonPressed, ProvBleDiscoveryViewed, ProvBleDiscoveryResult, ProvConnectToRoombaViewed, ProvInfoButtonPressed, ProvCancelButtonPressed, 
			ProvViewed, ProvErrorViewed, ProvStarted, ProvStatus, ProvStatusConnected, ProvStatusSendingConfig, ProvStatusCheckingConfig, ProvStatusActivatingWifi, ProvStatusVerifyingConnection, ProvError, 
			ProvFinished
		});
	// 1746 4522:sipush          291
	// 1747 4525:anewarray       AnalyticsEvent[]
	// 1748 4528:dup             
	// 1749 4529:iconst_0        
	// 1750 4530:getstatic       #308 <Field AnalyticsEvent RobotHealedMessageViewed>
	// 1751 4533:aastore         
	// 1752 4534:dup             
	// 1753 4535:iconst_1        
	// 1754 4536:getstatic       #311 <Field AnalyticsEvent ReAddRobotPressedAfterBlidHealing>
	// 1755 4539:aastore         
	// 1756 4540:dup             
	// 1757 4541:iconst_2        
	// 1758 4542:getstatic       #314 <Field AnalyticsEvent RoombaCleanMissionStarted>
	// 1759 4545:aastore         
	// 1760 4546:dup             
	// 1761 4547:iconst_3        
	// 1762 4548:getstatic       #317 <Field AnalyticsEvent BraavaCleanMissionStarted>
	// 1763 4551:aastore         
	// 1764 4552:dup             
	// 1765 4553:iconst_4        
	// 1766 4554:getstatic       #320 <Field AnalyticsEvent HistorySummaryView>
	// 1767 4557:aastore         
	// 1768 4558:dup             
	// 1769 4559:iconst_5        
	// 1770 4560:getstatic       #323 <Field AnalyticsEvent HistoryDetailView>
	// 1771 4563:aastore         
	// 1772 4564:dup             
	// 1773 4565:bipush          6
	// 1774 4567:getstatic       #326 <Field AnalyticsEvent AppLaunched>
	// 1775 4570:aastore         
	// 1776 4571:dup             
	// 1777 4572:bipush          7
	// 1778 4574:getstatic       #329 <Field AnalyticsEvent AppLaunchedAfterAppInstall>
	// 1779 4577:aastore         
	// 1780 4578:dup             
	// 1781 4579:bipush          8
	// 1782 4581:getstatic       #332 <Field AnalyticsEvent AppLaunchedAfterAppUpgrade>
	// 1783 4584:aastore         
	// 1784 4585:dup             
	// 1785 4586:bipush          9
	// 1786 4588:getstatic       #335 <Field AnalyticsEvent AppForegrounded>
	// 1787 4591:aastore         
	// 1788 4592:dup             
	// 1789 4593:bipush          10
	// 1790 4595:getstatic       #338 <Field AnalyticsEvent AppBackgrounded>
	// 1791 4598:aastore         
	// 1792 4599:dup             
	// 1793 4600:bipush          11
	// 1794 4602:getstatic       #341 <Field AnalyticsEvent BadgedAppOpened>
	// 1795 4605:aastore         
	// 1796 4606:dup             
	// 1797 4607:bipush          12
	// 1798 4609:getstatic       #344 <Field AnalyticsEvent RobotAdded>
	// 1799 4612:aastore         
	// 1800 4613:dup             
	// 1801 4614:bipush          13
	// 1802 4616:getstatic       #347 <Field AnalyticsEvent RobotRemoved>
	// 1803 4619:aastore         
	// 1804 4620:dup             
	// 1805 4621:bipush          14
	// 1806 4623:getstatic       #350 <Field AnalyticsEvent ScheduleViewed>
	// 1807 4626:aastore         
	// 1808 4627:dup             
	// 1809 4628:bipush          15
	// 1810 4630:getstatic       #353 <Field AnalyticsEvent ScheduleChanged>
	// 1811 4633:aastore         
	// 1812 4634:dup             
	// 1813 4635:bipush          16
	// 1814 4637:getstatic       #356 <Field AnalyticsEvent CleaningPreferencesView>
	// 1815 4640:aastore         
	// 1816 4641:dup             
	// 1817 4642:bipush          17
	// 1818 4644:getstatic       #359 <Field AnalyticsEvent FinishWhenBinFullSettingChanged>
	// 1819 4647:aastore         
	// 1820 4648:dup             
	// 1821 4649:bipush          18
	// 1822 4651:getstatic       #362 <Field AnalyticsEvent EdgeCleanSettingChanged>
	// 1823 4654:aastore         
	// 1824 4655:dup             
	// 1825 4656:bipush          19
	// 1826 4658:getstatic       #365 <Field AnalyticsEvent CarpetBoostSettingsView>
	// 1827 4661:aastore         
	// 1828 4662:dup             
	// 1829 4663:bipush          20
	// 1830 4665:getstatic       #368 <Field AnalyticsEvent CarpetBoostSettingChanged>
	// 1831 4668:aastore         
	// 1832 4669:dup             
	// 1833 4670:bipush          21
	// 1834 4672:getstatic       #371 <Field AnalyticsEvent CleaningPassSettingsView>
	// 1835 4675:aastore         
	// 1836 4676:dup             
	// 1837 4677:bipush          22
	// 1838 4679:getstatic       #374 <Field AnalyticsEvent CleaningPassSettingChanged>
	// 1839 4682:aastore         
	// 1840 4683:dup             
	// 1841 4684:bipush          23
	// 1842 4686:getstatic       #377 <Field AnalyticsEvent CleaningPresetSettingChanged>
	// 1843 4689:aastore         
	// 1844 4690:dup             
	// 1845 4691:bipush          24
	// 1846 4693:getstatic       #380 <Field AnalyticsEvent CleaningPreferencesDefaultsRestored>
	// 1847 4696:aastore         
	// 1848 4697:dup             
	// 1849 4698:bipush          25
	// 1850 4700:getstatic       #383 <Field AnalyticsEvent MoreViewed>
	// 1851 4703:aastore         
	// 1852 4704:dup             
	// 1853 4705:bipush          26
	// 1854 4707:getstatic       #386 <Field AnalyticsEvent CareViewed>
	// 1855 4710:aastore         
	// 1856 4711:dup             
	// 1857 4712:bipush          27
	// 1858 4714:getstatic       #389 <Field AnalyticsEvent HelpViewed>
	// 1859 4717:aastore         
	// 1860 4718:dup             
	// 1861 4719:bipush          28
	// 1862 4721:getstatic       #392 <Field AnalyticsEvent SettingsViewed>
	// 1863 4724:aastore         
	// 1864 4725:dup             
	// 1865 4726:bipush          29
	// 1866 4728:getstatic       #395 <Field AnalyticsEvent LocateRoombaButtonPressed>
	// 1867 4731:aastore         
	// 1868 4732:dup             
	// 1869 4733:bipush          30
	// 1870 4735:getstatic       #398 <Field AnalyticsEvent SideMenuViewed>
	// 1871 4738:aastore         
	// 1872 4739:dup             
	// 1873 4740:bipush          31
	// 1874 4742:getstatic       #401 <Field AnalyticsEvent StoreViewed>
	// 1875 4745:aastore         
	// 1876 4746:dup             
	// 1877 4747:bipush          32
	// 1878 4749:getstatic       #404 <Field AnalyticsEvent CloudButtonPressed>
	// 1879 4752:aastore         
	// 1880 4753:dup             
	// 1881 4754:bipush          33
	// 1882 4756:getstatic       #407 <Field AnalyticsEvent CareResetStatusButtonPressed>
	// 1883 4759:aastore         
	// 1884 4760:dup             
	// 1885 4761:bipush          34
	// 1886 4763:getstatic       #410 <Field AnalyticsEvent CareStepByStepGuideViewed>
	// 1887 4766:aastore         
	// 1888 4767:dup             
	// 1889 4768:bipush          35
	// 1890 4770:getstatic       #413 <Field AnalyticsEvent HistorySummaryTabChanged>
	// 1891 4773:aastore         
	// 1892 4774:dup             
	// 1893 4775:bipush          36
	// 1894 4777:getstatic       #416 <Field AnalyticsEvent CleanScreenErrorIndicatorPressed>
	// 1895 4780:aastore         
	// 1896 4781:dup             
	// 1897 4782:bipush          37
	// 1898 4784:getstatic       #419 <Field AnalyticsEvent MissionHistoryDetailBottomSheetView>
	// 1899 4787:aastore         
	// 1900 4788:dup             
	// 1901 4789:bipush          38
	// 1902 4791:getstatic       #422 <Field AnalyticsEvent LifetimeHistoryInfoButtonPressed>
	// 1903 4794:aastore         
	// 1904 4795:dup             
	// 1905 4796:bipush          39
	// 1906 4798:getstatic       #425 <Field AnalyticsEvent HistoryMissionMapRated>
	// 1907 4801:aastore         
	// 1908 4802:dup             
	// 1909 4803:bipush          40
	// 1910 4805:getstatic       #428 <Field AnalyticsEvent HistoryDetailErrorIndicatorPressed>
	// 1911 4808:aastore         
	// 1912 4809:dup             
	// 1913 4810:bipush          41
	// 1914 4812:getstatic       #431 <Field AnalyticsEvent CleanMapEnabledSettingChanged>
	// 1915 4815:aastore         
	// 1916 4816:dup             
	// 1917 4817:bipush          42
	// 1918 4819:getstatic       #434 <Field AnalyticsEvent OnboardingBegan>
	// 1919 4822:aastore         
	// 1920 4823:dup             
	// 1921 4824:bipush          43
	// 1922 4826:getstatic       #437 <Field AnalyticsEvent AppWelcomeViewed>
	// 1923 4829:aastore         
	// 1924 4830:dup             
	// 1925 4831:bipush          44
	// 1926 4833:getstatic       #440 <Field AnalyticsEvent AccountOptionsViewed>
	// 1927 4836:aastore         
	// 1928 4837:dup             
	// 1929 4838:bipush          45
	// 1930 4840:getstatic       #443 <Field AnalyticsEvent CountryPickerViewed>
	// 1931 4843:aastore         
	// 1932 4844:dup             
	// 1933 4845:bipush          46
	// 1934 4847:getstatic       #446 <Field AnalyticsEvent LoginViewed>
	// 1935 4850:aastore         
	// 1936 4851:dup             
	// 1937 4852:bipush          47
	// 1938 4854:getstatic       #449 <Field AnalyticsEvent CreateAccountViewed>
	// 1939 4857:aastore         
	// 1940 4858:dup             
	// 1941 4859:bipush          48
	// 1942 4861:getstatic       #452 <Field AnalyticsEvent UserLoggedIn>
	// 1943 4864:aastore         
	// 1944 4865:dup             
	// 1945 4866:bipush          49
	// 1946 4868:getstatic       #455 <Field AnalyticsEvent UserLoggedOut>
	// 1947 4871:aastore         
	// 1948 4872:dup             
	// 1949 4873:bipush          50
	// 1950 4875:getstatic       #458 <Field AnalyticsEvent CreateAccountLaterButtonPressed>
	// 1951 4878:aastore         
	// 1952 4879:dup             
	// 1953 4880:bipush          51
	// 1954 4882:getstatic       #461 <Field AnalyticsEvent CreateAccountFromSideMenuViewed>
	// 1955 4885:aastore         
	// 1956 4886:dup             
	// 1957 4887:bipush          52
	// 1958 4889:getstatic       #464 <Field AnalyticsEvent UserTermsLinkPressed>
	// 1959 4892:aastore         
	// 1960 4893:dup             
	// 1961 4894:bipush          53
	// 1962 4896:getstatic       #467 <Field AnalyticsEvent CareBinViewed>
	// 1963 4899:aastore         
	// 1964 4900:dup             
	// 1965 4901:bipush          54
	// 1966 4903:getstatic       #470 <Field AnalyticsEvent CareCoreRobotViewed>
	// 1967 4906:aastore         
	// 1968 4907:dup             
	// 1969 4908:bipush          55
	// 1970 4910:getstatic       #473 <Field AnalyticsEvent CareDebrisExtractorsViewed>
	// 1971 4913:aastore         
	// 1972 4914:dup             
	// 1973 4915:bipush          56
	// 1974 4917:getstatic       #476 <Field AnalyticsEvent AdditionalHelpViewed>
	// 1975 4920:aastore         
	// 1976 4921:dup             
	// 1977 4922:bipush          57
	// 1978 4924:getstatic       #479 <Field AnalyticsEvent AdditionalHelpContactButtonPressed>
	// 1979 4927:aastore         
	// 1980 4928:dup             
	// 1981 4929:bipush          58
	// 1982 4931:getstatic       #482 <Field AnalyticsEvent AboutThisAppViewed>
	// 1983 4934:aastore         
	// 1984 4935:dup             
	// 1985 4936:bipush          59
	// 1986 4938:getstatic       #485 <Field AnalyticsEvent AboutThisAppEulaViewed>
	// 1987 4941:aastore         
	// 1988 4942:dup             
	// 1989 4943:bipush          60
	// 1990 4945:getstatic       #488 <Field AnalyticsEvent AboutThisAppFollowButtonPressed>
	// 1991 4948:aastore         
	// 1992 4949:dup             
	// 1993 4950:bipush          61
	// 1994 4952:getstatic       #491 <Field AnalyticsEvent CommonQuestionsViewed>
	// 1995 4955:aastore         
	// 1996 4956:dup             
	// 1997 4957:bipush          62
	// 1998 4959:getstatic       #494 <Field AnalyticsEvent AnyCommonQuestionsOpened>
	// 1999 4962:aastore         
	// 2000 4963:dup             
	// 2001 4964:bipush          63
	// 2002 4966:getstatic       #497 <Field AnalyticsEvent HelpVideoWatched>
	// 2003 4969:aastore         
	// 2004 4970:dup             
	// 2005 4971:bipush          64
	// 2006 4973:getstatic       #500 <Field AnalyticsEvent HelpDocumentViewed>
	// 2007 4976:aastore         
	// 2008 4977:dup             
	// 2009 4978:bipush          65
	// 2010 4980:getstatic       #503 <Field AnalyticsEvent ReActivateAppOverviewPressed>
	// 2011 4983:aastore         
	// 2012 4984:dup             
	// 2013 4985:bipush          66
	// 2014 4987:getstatic       #506 <Field AnalyticsEvent WiFiSettingsViewed>
	// 2015 4990:aastore         
	// 2016 4991:dup             
	// 2017 4992:bipush          67
	// 2018 4994:getstatic       #509 <Field AnalyticsEvent ReducedPowerStandbyModeViewed>
	// 2019 4997:aastore         
	// 2020 4998:dup             
	// 2021 4999:bipush          68
	// 2022 5001:getstatic       #512 <Field AnalyticsEvent AboutRobotViewed>
	// 2023 5004:aastore         
	// 2024 5005:dup             
	// 2025 5006:bipush          69
	// 2026 5008:getstatic       #515 <Field AnalyticsEvent RemoveRobotViewed>
	// 2027 5011:aastore         
	// 2028 5012:dup             
	// 2029 5013:bipush          70
	// 2030 5015:getstatic       #518 <Field AnalyticsEvent ResetRobotViewed>
	// 2031 5018:aastore         
	// 2032 5019:dup             
	// 2033 5020:bipush          71
	// 2034 5022:getstatic       #521 <Field AnalyticsEvent CleanMapInteraction>
	// 2035 5025:aastore         
	// 2036 5026:dup             
	// 2037 5027:bipush          72
	// 2038 5029:getstatic       #524 <Field AnalyticsEvent ConnectedHomeViewed>
	// 2039 5032:aastore         
	// 2040 5033:dup             
	// 2041 5034:bipush          73
	// 2042 5036:getstatic       #527 <Field AnalyticsEvent CommandTimedOut>
	// 2043 5039:aastore         
	// 2044 5040:dup             
	// 2045 5041:bipush          74
	// 2046 5043:getstatic       #530 <Field AnalyticsEvent HeartBeatMissed>
	// 2047 5046:aastore         
	// 2048 5047:dup             
	// 2049 5048:bipush          75
	// 2050 5050:getstatic       #533 <Field AnalyticsEvent AccountError>
	// 2051 5053:aastore         
	// 2052 5054:dup             
	// 2053 5055:bipush          76
	// 2054 5057:getstatic       #536 <Field AnalyticsEvent BraavaSpotCleanViewed>
	// 2055 5060:aastore         
	// 2056 5061:dup             
	// 2057 5062:bipush          77
	// 2058 5064:getstatic       #539 <Field AnalyticsEvent BraavaSpotCleanPressed>
	// 2059 5067:aastore         
	// 2060 5068:dup             
	// 2061 5069:bipush          78
	// 2062 5071:getstatic       #542 <Field AnalyticsEvent BraavaPadOptionsViewed>
	// 2063 5074:aastore         
	// 2064 5075:dup             
	// 2065 5076:bipush          79
	// 2066 5078:getstatic       #545 <Field AnalyticsEvent BraavaPadOptionsChanged>
	// 2067 5081:aastore         
	// 2068 5082:dup             
	// 2069 5083:bipush          80
	// 2070 5085:getstatic       #548 <Field AnalyticsEvent BraavaStoreButtonPressed>
	// 2071 5088:aastore         
	// 2072 5089:dup             
	// 2073 5090:bipush          81
	// 2074 5092:getstatic       #551 <Field AnalyticsEvent AppServiceDiscoveryResult>
	// 2075 5095:aastore         
	// 2076 5096:dup             
	// 2077 5097:bipush          82
	// 2078 5099:getstatic       #554 <Field AnalyticsEvent AppServiceDiscoverySummary>
	// 2079 5102:aastore         
	// 2080 5103:dup             
	// 2081 5104:bipush          83
	// 2082 5106:getstatic       #557 <Field AnalyticsEvent AssetServiceDiscoverySummary>
	// 2083 5109:aastore         
	// 2084 5110:dup             
	// 2085 5111:bipush          84
	// 2086 5113:getstatic       #560 <Field AnalyticsEvent AccountInfoRequestResult>
	// 2087 5116:aastore         
	// 2088 5117:dup             
	// 2089 5118:bipush          85
	// 2090 5120:getstatic       #563 <Field AnalyticsEvent AccountInfoRequestSummary>
	// 2091 5123:aastore         
	// 2092 5124:dup             
	// 2093 5125:bipush          86
	// 2094 5127:getstatic       #566 <Field AnalyticsEvent ExpeditedOtaViewed>
	// 2095 5130:aastore         
	// 2096 5131:dup             
	// 2097 5132:bipush          87
	// 2098 5134:getstatic       #569 <Field AnalyticsEvent ExpeditedOtaRequested>
	// 2099 5137:aastore         
	// 2100 5138:dup             
	// 2101 5139:bipush          88
	// 2102 5141:getstatic       #572 <Field AnalyticsEvent NewAppVersionAvailableViewed>
	// 2103 5144:aastore         
	// 2104 5145:dup             
	// 2105 5146:bipush          89
	// 2106 5148:getstatic       #575 <Field AnalyticsEvent NewAppVersionAvailableUpdateClicked>
	// 2107 5151:aastore         
	// 2108 5152:dup             
	// 2109 5153:bipush          90
	// 2110 5155:getstatic       #578 <Field AnalyticsEvent NewAppVersionAvailableSkipClicked>
	// 2111 5158:aastore         
	// 2112 5159:dup             
	// 2113 5160:bipush          91
	// 2114 5162:getstatic       #581 <Field AnalyticsEvent AccountServiceUnavailableDialogViewed>
	// 2115 5165:aastore         
	// 2116 5166:dup             
	// 2117 5167:bipush          92
	// 2118 5169:getstatic       #584 <Field AnalyticsEvent AccountAndPrivacyViewed>
	// 2119 5172:aastore         
	// 2120 5173:dup             
	// 2121 5174:bipush          93
	// 2122 5176:getstatic       #587 <Field AnalyticsEvent ManageAccountViewed>
	// 2123 5179:aastore         
	// 2124 5180:dup             
	// 2125 5181:bipush          94
	// 2126 5183:getstatic       #590 <Field AnalyticsEvent UpdateProfileViewed>
	// 2127 5186:aastore         
	// 2128 5187:dup             
	// 2129 5188:bipush          95
	// 2130 5190:getstatic       #593 <Field AnalyticsEvent AccountProfileUpdated>
	// 2131 5193:aastore         
	// 2132 5194:dup             
	// 2133 5195:bipush          96
	// 2134 5197:getstatic       #596 <Field AnalyticsEvent AccountUpdatePasswordViewed>
	// 2135 5200:aastore         
	// 2136 5201:dup             
	// 2137 5202:bipush          97
	// 2138 5204:getstatic       #599 <Field AnalyticsEvent NotificationSettingsViewed>
	// 2139 5207:aastore         
	// 2140 5208:dup             
	// 2141 5209:bipush          98
	// 2142 5211:getstatic       #602 <Field AnalyticsEvent NotificationSettingsChanged>
	// 2143 5214:aastore         
	// 2144 5215:dup             
	// 2145 5216:bipush          99
	// 2146 5218:getstatic       #605 <Field AnalyticsEvent PrivacyViewed>
	// 2147 5221:aastore         
	// 2148 5222:dup             
	// 2149 5223:bipush          100
	// 2150 5225:getstatic       #608 <Field AnalyticsEvent RoombaSetupChecklistViewed>
	// 2151 5228:aastore         
	// 2152 5229:dup             
	// 2153 5230:bipush          101
	// 2154 5232:getstatic       #611 <Field AnalyticsEvent RoombaSetupDockPlacementViewed>
	// 2155 5235:aastore         
	// 2156 5236:dup             
	// 2157 5237:bipush          102
	// 2158 5239:getstatic       #614 <Field AnalyticsEvent RoombaSetupWifiInfoViewed>
	// 2159 5242:aastore         
	// 2160 5243:dup             
	// 2161 5244:bipush          103
	// 2162 5246:getstatic       #617 <Field AnalyticsEvent RoombaSetupAdvancedWifiInfoViewed>
	// 2163 5249:aastore         
	// 2164 5250:dup             
	// 2165 5251:bipush          104
	// 2166 5253:getstatic       #620 <Field AnalyticsEvent RoombaSetupActivateRoombaViewed>
	// 2167 5256:aastore         
	// 2168 5257:dup             
	// 2169 5258:bipush          105
	// 2170 5260:getstatic       #623 <Field AnalyticsEvent RoombaSetupConnectToRoombaViewed>
	// 2171 5263:aastore         
	// 2172 5264:dup             
	// 2173 5265:bipush          106
	// 2174 5267:getstatic       #626 <Field AnalyticsEvent RoombaSetupProvisioningViewed>
	// 2175 5270:aastore         
	// 2176 5271:dup             
	// 2177 5272:bipush          107
	// 2178 5274:getstatic       #629 <Field AnalyticsEvent RoombaSetupProvisioningErrorViewed>
	// 2179 5277:aastore         
	// 2180 5278:dup             
	// 2181 5279:bipush          108
	// 2182 5281:getstatic       #632 <Field AnalyticsEvent RoombaProvisioningFinished>
	// 2183 5284:aastore         
	// 2184 5285:dup             
	// 2185 5286:bipush          109
	// 2186 5288:getstatic       #635 <Field AnalyticsEvent RoombaV2ProvisioningPart1>
	// 2187 5291:aastore         
	// 2188 5292:dup             
	// 2189 5293:bipush          110
	// 2190 5295:getstatic       #638 <Field AnalyticsEvent RoombaV2ProvisioningPart2>
	// 2191 5298:aastore         
	// 2192 5299:dup             
	// 2193 5300:bipush          111
	// 2194 5302:getstatic       #641 <Field AnalyticsEvent RoombaV2ProvisioningPart3>
	// 2195 5305:aastore         
	// 2196 5306:dup             
	// 2197 5307:bipush          112
	// 2198 5309:getstatic       #644 <Field AnalyticsEvent RoombaV2ProvisioningPart4>
	// 2199 5312:aastore         
	// 2200 5313:dup             
	// 2201 5314:bipush          113
	// 2202 5316:getstatic       #647 <Field AnalyticsEvent RoombaV2ProvisioningPart5>
	// 2203 5319:aastore         
	// 2204 5320:dup             
	// 2205 5321:bipush          114
	// 2206 5323:getstatic       #650 <Field AnalyticsEvent RoombaV2ProvisioningError>
	// 2207 5326:aastore         
	// 2208 5327:dup             
	// 2209 5328:bipush          115
	// 2210 5330:getstatic       #653 <Field AnalyticsEvent RoombaV1ProvisioningError>
	// 2211 5333:aastore         
	// 2212 5334:dup             
	// 2213 5335:bipush          116
	// 2214 5337:getstatic       #656 <Field AnalyticsEvent RoombaSetupCustomerRegistrationViewed>
	// 2215 5340:aastore         
	// 2216 5341:dup             
	// 2217 5342:bipush          117
	// 2218 5344:getstatic       #659 <Field AnalyticsEvent RoombaSetupFinished>
	// 2219 5347:aastore         
	// 2220 5348:dup             
	// 2221 5349:bipush          118
	// 2222 5351:getstatic       #662 <Field AnalyticsEvent RoombaWelcomeVideoViewed>
	// 2223 5354:aastore         
	// 2224 5355:dup             
	// 2225 5356:bipush          119
	// 2226 5358:getstatic       #665 <Field AnalyticsEvent EnjoyingAppPromptResponseGiven>
	// 2227 5361:aastore         
	// 2228 5362:dup             
	// 2229 5363:bipush          120
	// 2230 5365:getstatic       #668 <Field AnalyticsEvent AppFeedbackResponseGiven>
	// 2231 5368:aastore         
	// 2232 5369:dup             
	// 2233 5370:bipush          121
	// 2234 5372:getstatic       #671 <Field AnalyticsEvent AppFeedbackResponseCancelled>
	// 2235 5375:aastore         
	// 2236 5376:dup             
	// 2237 5377:bipush          122
	// 2238 5379:getstatic       #674 <Field AnalyticsEvent WifiMapFeedbackResponseGiven>
	// 2239 5382:aastore         
	// 2240 5383:dup             
	// 2241 5384:bipush          123
	// 2242 5386:getstatic       #677 <Field AnalyticsEvent BetaProgramFeedbackSubmitted>
	// 2243 5389:aastore         
	// 2244 5390:dup             
	// 2245 5391:bipush          124
	// 2246 5393:getstatic       #680 <Field AnalyticsEvent BetaProgramIntroductionPageViewed>
	// 2247 5396:aastore         
	// 2248 5397:dup             
	// 2249 5398:bipush          125
	// 2250 5400:getstatic       #683 <Field AnalyticsEvent BetaProgramIWantInButtonPressed>
	// 2251 5403:aastore         
	// 2252 5404:dup             
	// 2253 5405:bipush          126
	// 2254 5407:getstatic       #686 <Field AnalyticsEvent BetaProgramPageViewed>
	// 2255 5410:aastore         
	// 2256 5411:dup             
	// 2257 5412:bipush          127
	// 2258 5414:getstatic       #689 <Field AnalyticsEvent WifiCoverageToggled>
	// 2259 5417:aastore         
	// 2260 5418:dup             
	// 2261 5419:sipush          128
	// 2262 5422:getstatic       #692 <Field AnalyticsEvent WifiCoverageMapScreenViewed>
	// 2263 5425:aastore         
	// 2264 5426:dup             
	// 2265 5427:sipush          129
	// 2266 5430:getstatic       #695 <Field AnalyticsEvent BetaProgramThreeDotsButtonPressed>
	// 2267 5433:aastore         
	// 2268 5434:dup             
	// 2269 5435:sipush          130
	// 2270 5438:getstatic       #698 <Field AnalyticsEvent LeaveBetaProgramConfirmationButtonPressed>
	// 2271 5441:aastore         
	// 2272 5442:dup             
	// 2273 5443:sipush          131
	// 2274 5446:getstatic       #701 <Field AnalyticsEvent WifiMapTabViewed>
	// 2275 5449:aastore         
	// 2276 5450:dup             
	// 2277 5451:sipush          132
	// 2278 5454:getstatic       #704 <Field AnalyticsEvent WifiMapBottomSheetViewed>
	// 2279 5457:aastore         
	// 2280 5458:dup             
	// 2281 5459:sipush          133
	// 2282 5462:getstatic       #707 <Field AnalyticsEvent HistoryProvideFeedbackButtonPressed>
	// 2283 5465:aastore         
	// 2284 5466:dup             
	// 2285 5467:sipush          134
	// 2286 5470:getstatic       #710 <Field AnalyticsEvent AssetRegistrationWithCloudFinished>
	// 2287 5473:aastore         
	// 2288 5474:dup             
	// 2289 5475:sipush          135
	// 2290 5478:getstatic       #713 <Field AnalyticsEvent LocalOtaFirmwareUpdateFinished>
	// 2291 5481:aastore         
	// 2292 5482:dup             
	// 2293 5483:sipush          136
	// 2294 5486:getstatic       #716 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateAvailableFinished>
	// 2295 5489:aastore         
	// 2296 5490:dup             
	// 2297 5491:sipush          137
	// 2298 5494:getstatic       #719 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateReadyFinished>
	// 2299 5497:aastore         
	// 2300 5498:dup             
	// 2301 5499:sipush          138
	// 2302 5502:getstatic       #722 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateLoadingFinished>
	// 2303 5505:aastore         
	// 2304 5506:dup             
	// 2305 5507:sipush          139
	// 2306 5510:getstatic       #725 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateInstallingFinished>
	// 2307 5513:aastore         
	// 2308 5514:dup             
	// 2309 5515:sipush          140
	// 2310 5518:getstatic       #728 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateSuccessFinished>
	// 2311 5521:aastore         
	// 2312 5522:dup             
	// 2313 5523:sipush          141
	// 2314 5526:getstatic       #731 <Field AnalyticsEvent OnDemandOtaFirmwareUpdateError>
	// 2315 5529:aastore         
	// 2316 5530:dup             
	// 2317 5531:sipush          142
	// 2318 5534:getstatic       #734 <Field AnalyticsEvent CleanScheduleTwoWelcomeViewed>
	// 2319 5537:aastore         
	// 2320 5538:dup             
	// 2321 5539:sipush          143
	// 2322 5542:getstatic       #737 <Field AnalyticsEvent CleanScheduleTwoPopularPressed>
	// 2323 5545:aastore         
	// 2324 5546:dup             
	// 2325 5547:sipush          144
	// 2326 5550:getstatic       #740 <Field AnalyticsEvent CleanScheduleTwoAddPressed>
	// 2327 5553:aastore         
	// 2328 5554:dup             
	// 2329 5555:sipush          145
	// 2330 5558:getstatic       #743 <Field AnalyticsEvent CleanScheduleTwoCreateScreenViewed>
	// 2331 5561:aastore         
	// 2332 5562:dup             
	// 2333 5563:sipush          146
	// 2334 5566:getstatic       #746 <Field AnalyticsEvent CleanScheduleTwoCleaningPresetViewed>
	// 2335 5569:aastore         
	// 2336 5570:dup             
	// 2337 5571:sipush          147
	// 2338 5574:getstatic       #749 <Field AnalyticsEvent CleanScheduleTwoNewScheduleCreated>
	// 2339 5577:aastore         
	// 2340 5578:dup             
	// 2341 5579:sipush          148
	// 2342 5582:getstatic       #752 <Field AnalyticsEvent CleanScheduleTwoExistingScheduleEdited>
	// 2343 5585:aastore         
	// 2344 5586:dup             
	// 2345 5587:sipush          149
	// 2346 5590:getstatic       #755 <Field AnalyticsEvent CleanScheduleTwoExistingScheduleToggled>
	// 2347 5593:aastore         
	// 2348 5594:dup             
	// 2349 5595:sipush          150
	// 2350 5598:getstatic       #758 <Field AnalyticsEvent CleanScheduleTwoExistingScheduleDeleted>
	// 2351 5601:aastore         
	// 2352 5602:dup             
	// 2353 5603:sipush          151
	// 2354 5606:getstatic       #761 <Field AnalyticsEvent CleanScheduleTwoExistingScheduleViewed>
	// 2355 5609:aastore         
	// 2356 5610:dup             
	// 2357 5611:sipush          152
	// 2358 5614:getstatic       #764 <Field AnalyticsEvent CleanScheduleTwoTimeoutError>
	// 2359 5617:aastore         
	// 2360 5618:dup             
	// 2361 5619:sipush          153
	// 2362 5622:getstatic       #767 <Field AnalyticsEvent CleanScheduleTwoPMAPSChangeLayoutPromptViewed>
	// 2363 5625:aastore         
	// 2364 5626:dup             
	// 2365 5627:sipush          154
	// 2366 5630:getstatic       #770 <Field AnalyticsEvent CleanScheduleTwoSchedulesDeletedFromPMAPSChange>
	// 2367 5633:aastore         
	// 2368 5634:dup             
	// 2369 5635:sipush          155
	// 2370 5638:getstatic       #773 <Field AnalyticsEvent CleanScheduleTwoScheduleLimitViewed>
	// 2371 5641:aastore         
	// 2372 5642:dup             
	// 2373 5643:sipush          156
	// 2374 5646:getstatic       #776 <Field AnalyticsEvent CleanScheduleTwoUpdateFinished>
	// 2375 5649:aastore         
	// 2376 5650:dup             
	// 2377 5651:sipush          157
	// 2378 5654:getstatic       #779 <Field AnalyticsEvent EvacuationDockEmptyBinButtonPressed>
	// 2379 5657:aastore         
	// 2380 5658:dup             
	// 2381 5659:sipush          158
	// 2382 5662:getstatic       #782 <Field AnalyticsEvent EvacuationDockErrorHelpContentViewed>
	// 2383 5665:aastore         
	// 2384 5666:dup             
	// 2385 5667:sipush          159
	// 2386 5670:getstatic       #785 <Field AnalyticsEvent EvacuationDockBagMissingHelpContentViewed>
	// 2387 5673:aastore         
	// 2388 5674:dup             
	// 2389 5675:sipush          160
	// 2390 5678:getstatic       #788 <Field AnalyticsEvent EvacuationDockAboutDockViewed>
	// 2391 5681:aastore         
	// 2392 5682:dup             
	// 2393 5683:sipush          161
	// 2394 5686:getstatic       #791 <Field AnalyticsEvent PMapsChooseRoomsButtonPressed>
	// 2395 5689:aastore         
	// 2396 5690:dup             
	// 2397 5691:sipush          162
	// 2398 5694:getstatic       #794 <Field AnalyticsEvent PMapsSmartMapsButtonPressed>
	// 2399 5697:aastore         
	// 2400 5698:dup             
	// 2401 5699:sipush          163
	// 2402 5702:getstatic       #797 <Field AnalyticsEvent PMapsDirectedRoomCleanStarted>
	// 2403 5705:aastore         
	// 2404 5706:dup             
	// 2405 5707:sipush          164
	// 2406 5710:getstatic       #800 <Field AnalyticsEvent PMapsTrainingRunStarted>
	// 2407 5713:aastore         
	// 2408 5714:dup             
	// 2409 5715:sipush          165
	// 2410 5718:getstatic       #803 <Field AnalyticsEvent PMapsCleanButtonIntro1Viewed>
	// 2411 5721:aastore         
	// 2412 5722:dup             
	// 2413 5723:sipush          166
	// 2414 5726:getstatic       #806 <Field AnalyticsEvent PMapsCleanButtonIntro1CancelButtonPressed>
	// 2415 5729:aastore         
	// 2416 5730:dup             
	// 2417 5731:sipush          167
	// 2418 5734:getstatic       #809 <Field AnalyticsEvent PMapsCleanButtonIntro1NextButtonPressed>
	// 2419 5737:aastore         
	// 2420 5738:dup             
	// 2421 5739:sipush          168
	// 2422 5742:getstatic       #812 <Field AnalyticsEvent PMapsCleanButtonIntro2Viewed>
	// 2423 5745:aastore         
	// 2424 5746:dup             
	// 2425 5747:sipush          169
	// 2426 5750:getstatic       #815 <Field AnalyticsEvent PMapsCleanButtonIntro2CancelButtonPressed>
	// 2427 5753:aastore         
	// 2428 5754:dup             
	// 2429 5755:sipush          170
	// 2430 5758:getstatic       #818 <Field AnalyticsEvent PMapsCleanButtonIntro2CompleteButtonPressed>
	// 2431 5761:aastore         
	// 2432 5762:dup             
	// 2433 5763:sipush          171
	// 2434 5766:getstatic       #821 <Field AnalyticsEvent PMapsSectionIntro1Viewed>
	// 2435 5769:aastore         
	// 2436 5770:dup             
	// 2437 5771:sipush          172
	// 2438 5774:getstatic       #824 <Field AnalyticsEvent PMapsSectionIntro1CancelButtonPressed>
	// 2439 5777:aastore         
	// 2440 5778:dup             
	// 2441 5779:sipush          173
	// 2442 5782:getstatic       #827 <Field AnalyticsEvent PMapsSectionIntro1NextButtonPressed>
	// 2443 5785:aastore         
	// 2444 5786:dup             
	// 2445 5787:sipush          174
	// 2446 5790:getstatic       #830 <Field AnalyticsEvent PMapsSectionIntro2Viewed>
	// 2447 5793:aastore         
	// 2448 5794:dup             
	// 2449 5795:sipush          175
	// 2450 5798:getstatic       #833 <Field AnalyticsEvent PMapsSectionIntro2CancelButtonPressed>
	// 2451 5801:aastore         
	// 2452 5802:dup             
	// 2453 5803:sipush          176
	// 2454 5806:getstatic       #836 <Field AnalyticsEvent PMapsSectionIntro2NextButtonPressed>
	// 2455 5809:aastore         
	// 2456 5810:dup             
	// 2457 5811:sipush          177
	// 2458 5814:getstatic       #839 <Field AnalyticsEvent PMapsSectionIntro3Viewed>
	// 2459 5817:aastore         
	// 2460 5818:dup             
	// 2461 5819:sipush          178
	// 2462 5822:getstatic       #842 <Field AnalyticsEvent PMapsSectionIntro3CancelButtonPressed>
	// 2463 5825:aastore         
	// 2464 5826:dup             
	// 2465 5827:sipush          179
	// 2466 5830:getstatic       #845 <Field AnalyticsEvent PMapsSectionIntro3ActivateButtonPressed>
	// 2467 5833:aastore         
	// 2468 5834:dup             
	// 2469 5835:sipush          180
	// 2470 5838:getstatic       #848 <Field AnalyticsEvent PMapsSectionIntro4Viewed>
	// 2471 5841:aastore         
	// 2472 5842:dup             
	// 2473 5843:sipush          181
	// 2474 5846:getstatic       #851 <Field AnalyticsEvent PMapsSectionIntro4CancelButtonPressed>
	// 2475 5849:aastore         
	// 2476 5850:dup             
	// 2477 5851:sipush          182
	// 2478 5854:getstatic       #854 <Field AnalyticsEvent PMapsSectionIntro4MaybeLaterButtonPressed>
	// 2479 5857:aastore         
	// 2480 5858:dup             
	// 2481 5859:sipush          183
	// 2482 5862:getstatic       #857 <Field AnalyticsEvent PMapsSectionIntro4AddTrainingRunButtonPressed>
	// 2483 5865:aastore         
	// 2484 5866:dup             
	// 2485 5867:sipush          184
	// 2486 5870:getstatic       #860 <Field AnalyticsEvent PMapsSectionIntro5Viewed>
	// 2487 5873:aastore         
	// 2488 5874:dup             
	// 2489 5875:sipush          185
	// 2490 5878:getstatic       #863 <Field AnalyticsEvent PMapsSectionIntro5CancelButtonPressed>
	// 2491 5881:aastore         
	// 2492 5882:dup             
	// 2493 5883:sipush          186
	// 2494 5886:getstatic       #866 <Field AnalyticsEvent PMapsSectionIntro5StartTrainingRunButtonPressed>
	// 2495 5889:aastore         
	// 2496 5890:dup             
	// 2497 5891:sipush          187
	// 2498 5894:getstatic       #869 <Field AnalyticsEvent PMapsSectionIntroCompleteViewed>
	// 2499 5897:aastore         
	// 2500 5898:dup             
	// 2501 5899:sipush          188
	// 2502 5902:getstatic       #872 <Field AnalyticsEvent PMapsSectionIntroCompleteCancelButtonPressed>
	// 2503 5905:aastore         
	// 2504 5906:dup             
	// 2505 5907:sipush          189
	// 2506 5910:getstatic       #875 <Field AnalyticsEvent PMapsSectionIntroCompleteTipsButtonPressed>
	// 2507 5913:aastore         
	// 2508 5914:dup             
	// 2509 5915:sipush          190
	// 2510 5918:getstatic       #878 <Field AnalyticsEvent PMapsTips1Viewed>
	// 2511 5921:aastore         
	// 2512 5922:dup             
	// 2513 5923:sipush          191
	// 2514 5926:getstatic       #881 <Field AnalyticsEvent PMapsTips1CancelButtonPressed>
	// 2515 5929:aastore         
	// 2516 5930:dup             
	// 2517 5931:sipush          192
	// 2518 5934:getstatic       #884 <Field AnalyticsEvent PMapsTips1NextButtonPressed>
	// 2519 5937:aastore         
	// 2520 5938:dup             
	// 2521 5939:sipush          193
	// 2522 5942:getstatic       #887 <Field AnalyticsEvent PMapsTips2Viewed>
	// 2523 5945:aastore         
	// 2524 5946:dup             
	// 2525 5947:sipush          194
	// 2526 5950:getstatic       #890 <Field AnalyticsEvent PMapsTips2CancelButtonPressed>
	// 2527 5953:aastore         
	// 2528 5954:dup             
	// 2529 5955:sipush          195
	// 2530 5958:getstatic       #893 <Field AnalyticsEvent PMapsTips2NextButtonPressed>
	// 2531 5961:aastore         
	// 2532 5962:dup             
	// 2533 5963:sipush          196
	// 2534 5966:getstatic       #896 <Field AnalyticsEvent PMapsTips3Viewed>
	// 2535 5969:aastore         
	// 2536 5970:dup             
	// 2537 5971:sipush          197
	// 2538 5974:getstatic       #899 <Field AnalyticsEvent PMapsTips3CancelButtonPressed>
	// 2539 5977:aastore         
	// 2540 5978:dup             
	// 2541 5979:sipush          198
	// 2542 5982:getstatic       #902 <Field AnalyticsEvent PMapsTips3CompleteButtonPressed>
	// 2543 5985:aastore         
	// 2544 5986:dup             
	// 2545 5987:sipush          199
	// 2546 5990:getstatic       #905 <Field AnalyticsEvent PMapsTrainingRunPreparationViewed>
	// 2547 5993:aastore         
	// 2548 5994:dup             
	// 2549 5995:sipush          200
	// 2550 5998:getstatic       #908 <Field AnalyticsEvent PMapsSectionNoMapViewed>
	// 2551 6001:aastore         
	// 2552 6002:dup             
	// 2553 6003:sipush          201
	// 2554 6006:getstatic       #911 <Field AnalyticsEvent PMapsSectionMapListViewed>
	// 2555 6009:aastore         
	// 2556 6010:dup             
	// 2557 6011:sipush          202
	// 2558 6014:getstatic       #914 <Field AnalyticsEvent PMapsSectionMapListCleanButtonPressed>
	// 2559 6017:aastore         
	// 2560 6018:dup             
	// 2561 6019:sipush          203
	// 2562 6022:getstatic       #917 <Field AnalyticsEvent PMapsSectionMapListTrainButtonPressed>
	// 2563 6025:aastore         
	// 2564 6026:dup             
	// 2565 6027:sipush          204
	// 2566 6030:getstatic       #920 <Field AnalyticsEvent PMapsSectionMapPreviewViewed>
	// 2567 6033:aastore         
	// 2568 6034:dup             
	// 2569 6035:sipush          205
	// 2570 6038:getstatic       #923 <Field AnalyticsEvent PMapsSectionMapPreviewNotRightButtonPressed>
	// 2571 6041:aastore         
	// 2572 6042:dup             
	// 2573 6043:sipush          206
	// 2574 6046:getstatic       #926 <Field AnalyticsEvent PMapsSectionMapReadyViewed>
	// 2575 6049:aastore         
	// 2576 6050:dup             
	// 2577 6051:sipush          207
	// 2578 6054:getstatic       #929 <Field AnalyticsEvent PMapsSectionMapReadyCustomizeButtonPressed>
	// 2579 6057:aastore         
	// 2580 6058:dup             
	// 2581 6059:sipush          208
	// 2582 6062:getstatic       #932 <Field AnalyticsEvent PMapsSectionMapReadyNotRightButtonPressed>
	// 2583 6065:aastore         
	// 2584 6066:dup             
	// 2585 6067:sipush          209
	// 2586 6070:getstatic       #935 <Field AnalyticsEvent PMapTroubleshootingListViewed>
	// 2587 6073:aastore         
	// 2588 6074:dup             
	// 2589 6075:sipush          210
	// 2590 6078:getstatic       #938 <Field AnalyticsEvent PMapTroubleshootingUnderstandingViewed>
	// 2591 6081:aastore         
	// 2592 6082:dup             
	// 2593 6083:sipush          211
	// 2594 6086:getstatic       #941 <Field AnalyticsEvent PMapTroubleshootingIncompleteViewed>
	// 2595 6089:aastore         
	// 2596 6090:dup             
	// 2597 6091:sipush          212
	// 2598 6094:getstatic       #944 <Field AnalyticsEvent PMapTroubleshootingIncompleteCleanButtonPressed>
	// 2599 6097:aastore         
	// 2600 6098:dup             
	// 2601 6099:sipush          213
	// 2602 6102:getstatic       #947 <Field AnalyticsEvent PMapTroubleshootingIncompleteTrainButtonPressed>
	// 2603 6105:aastore         
	// 2604 6106:dup             
	// 2605 6107:sipush          214
	// 2606 6110:getstatic       #950 <Field AnalyticsEvent PMapTroubleshootingWrongViewed>
	// 2607 6113:aastore         
	// 2608 6114:dup             
	// 2609 6115:sipush          215
	// 2610 6118:getstatic       #953 <Field AnalyticsEvent PMapTroubleshootingWrongDeleteButtonPressed>
	// 2611 6121:aastore         
	// 2612 6122:dup             
	// 2613 6123:sipush          216
	// 2614 6126:getstatic       #956 <Field AnalyticsEvent PMapCustomizeIntroViewed>
	// 2615 6129:aastore         
	// 2616 6130:dup             
	// 2617 6131:sipush          217
	// 2618 6134:getstatic       #959 <Field AnalyticsEvent PMapsCustomizeNameMapViewed>
	// 2619 6137:aastore         
	// 2620 6138:dup             
	// 2621 6139:sipush          218
	// 2622 6142:getstatic       #962 <Field AnalyticsEvent PMapsCustomizeNameMapNextButtonPressed>
	// 2623 6145:aastore         
	// 2624 6146:dup             
	// 2625 6147:sipush          219
	// 2626 6150:getstatic       #965 <Field AnalyticsEvent PMapsCustomizeNameMapCancelButtonPressed>
	// 2627 6153:aastore         
	// 2628 6154:dup             
	// 2629 6155:sipush          220
	// 2630 6158:getstatic       #968 <Field AnalyticsEvent PMapsCustomizeSettingUpInstructionsViewed>
	// 2631 6161:aastore         
	// 2632 6162:dup             
	// 2633 6163:sipush          221
	// 2634 6166:getstatic       #971 <Field AnalyticsEvent PMapsCustomizeSetupRoomsViewed>
	// 2635 6169:aastore         
	// 2636 6170:dup             
	// 2637 6171:sipush          222
	// 2638 6174:getstatic       #974 <Field AnalyticsEvent PMapsCustomizeSetupRoomsNextButtonPressed>
	// 2639 6177:aastore         
	// 2640 6178:dup             
	// 2641 6179:sipush          223
	// 2642 6182:getstatic       #977 <Field AnalyticsEvent PMapsCustomizeSetupRoomsCancelButtonPressed>
	// 2643 6185:aastore         
	// 2644 6186:dup             
	// 2645 6187:sipush          224
	// 2646 6190:getstatic       #980 <Field AnalyticsEvent PMapsCustomizeLabelRoomsViewed>
	// 2647 6193:aastore         
	// 2648 6194:dup             
	// 2649 6195:sipush          225
	// 2650 6198:getstatic       #983 <Field AnalyticsEvent PMapsCustomizeLabelRoomsDoneButtonPressed>
	// 2651 6201:aastore         
	// 2652 6202:dup             
	// 2653 6203:sipush          226
	// 2654 6206:getstatic       #986 <Field AnalyticsEvent PMapsCustomizeLabelRoomsCancelButtonPressed>
	// 2655 6209:aastore         
	// 2656 6210:dup             
	// 2657 6211:sipush          227
	// 2658 6214:getstatic       #989 <Field AnalyticsEvent PMapsCustomizeCompleteViewed>
	// 2659 6217:aastore         
	// 2660 6218:dup             
	// 2661 6219:sipush          228
	// 2662 6222:getstatic       #992 <Field AnalyticsEvent PMapsCustomizeCompleteCleanButtonPressed>
	// 2663 6225:aastore         
	// 2664 6226:dup             
	// 2665 6227:sipush          229
	// 2666 6230:getstatic       #995 <Field AnalyticsEvent PMapsCustomizeCompleteScheduleButtonPressed>
	// 2667 6233:aastore         
	// 2668 6234:dup             
	// 2669 6235:sipush          230
	// 2670 6238:getstatic       #998 <Field AnalyticsEvent PMapsChooseRoomsViewed>
	// 2671 6241:aastore         
	// 2672 6242:dup             
	// 2673 6243:sipush          231
	// 2674 6246:getstatic       #1001 <Field AnalyticsEvent PMapsErrorRoomTooSmall>
	// 2675 6249:aastore         
	// 2676 6250:dup             
	// 2677 6251:sipush          232
	// 2678 6254:getstatic       #1004 <Field AnalyticsEvent PMapsErrorSaveTimedOut>
	// 2679 6257:aastore         
	// 2680 6258:dup             
	// 2681 6259:sipush          233
	// 2682 6262:getstatic       #1007 <Field AnalyticsEvent PMapsErrorSaveFloorNameTimedOut>
	// 2683 6265:aastore         
	// 2684 6266:dup             
	// 2685 6267:sipush          234
	// 2686 6270:getstatic       #1010 <Field AnalyticsEvent PMapsErrorSegmentationTransferFailed>
	// 2687 6273:aastore         
	// 2688 6274:dup             
	// 2689 6275:sipush          235
	// 2690 6278:getstatic       #1013 <Field AnalyticsEvent PMapsErrorEmptyMap>
	// 2691 6281:aastore         
	// 2692 6282:dup             
	// 2693 6283:sipush          236
	// 2694 6286:getstatic       #1016 <Field AnalyticsEvent PMapsErrorSplitInvalidMap>
	// 2695 6289:aastore         
	// 2696 6290:dup             
	// 2697 6291:sipush          237
	// 2698 6294:getstatic       #1019 <Field AnalyticsEvent PMapsErrorRegionDuplicatePoints>
	// 2699 6297:aastore         
	// 2700 6298:dup             
	// 2701 6299:sipush          238
	// 2702 6302:getstatic       #1022 <Field AnalyticsEvent OnDemandOtaAvailableViewed>
	// 2703 6305:aastore         
	// 2704 6306:dup             
	// 2705 6307:sipush          239
	// 2706 6310:getstatic       #1025 <Field AnalyticsEvent OnDemandOtaAvailableHelpButtonPressed>
	// 2707 6313:aastore         
	// 2708 6314:dup             
	// 2709 6315:sipush          240
	// 2710 6318:getstatic       #1028 <Field AnalyticsEvent OnDemandOtaUpdateNowButtonPressed>
	// 2711 6321:aastore         
	// 2712 6322:dup             
	// 2713 6323:sipush          241
	// 2714 6326:getstatic       #1031 <Field AnalyticsEvent OnDemandOtaUpdateLaterButtonPressed>
	// 2715 6329:aastore         
	// 2716 6330:dup             
	// 2717 6331:sipush          242
	// 2718 6334:getstatic       #1034 <Field AnalyticsEvent OnDemandOtaInProgressViewed>
	// 2719 6337:aastore         
	// 2720 6338:dup             
	// 2721 6339:sipush          243
	// 2722 6342:getstatic       #1037 <Field AnalyticsEvent OnDemandOtaInProgressHelpButtonPressed>
	// 2723 6345:aastore         
	// 2724 6346:dup             
	// 2725 6347:sipush          244
	// 2726 6350:getstatic       #1040 <Field AnalyticsEvent OnDemandOtaSetupCompleteViewed>
	// 2727 6353:aastore         
	// 2728 6354:dup             
	// 2729 6355:sipush          245
	// 2730 6358:getstatic       #1043 <Field AnalyticsEvent OnDemandOtaFailedViewed>
	// 2731 6361:aastore         
	// 2732 6362:dup             
	// 2733 6363:sipush          246
	// 2734 6366:getstatic       #1046 <Field AnalyticsEvent OnDemandOtaFailedHelpButtonPressed>
	// 2735 6369:aastore         
	// 2736 6370:dup             
	// 2737 6371:sipush          247
	// 2738 6374:getstatic       #1049 <Field AnalyticsEvent OnDemandOtaFailedTryAgainButtonPressed>
	// 2739 6377:aastore         
	// 2740 6378:dup             
	// 2741 6379:sipush          248
	// 2742 6382:getstatic       #1052 <Field AnalyticsEvent OnDemandOtaFailedUpdateLaterButtonPressed>
	// 2743 6385:aastore         
	// 2744 6386:dup             
	// 2745 6387:sipush          249
	// 2746 6390:getstatic       #1055 <Field AnalyticsEvent OnDemandOtaSucceededViewed>
	// 2747 6393:aastore         
	// 2748 6394:dup             
	// 2749 6395:sipush          250
	// 2750 6398:getstatic       #1058 <Field AnalyticsEvent NotificationCenterBellIconPressed>
	// 2751 6401:aastore         
	// 2752 6402:dup             
	// 2753 6403:sipush          251
	// 2754 6406:getstatic       #1061 <Field AnalyticsEvent NotificationCenterViewed>
	// 2755 6409:aastore         
	// 2756 6410:dup             
	// 2757 6411:sipush          252
	// 2758 6414:getstatic       #1064 <Field AnalyticsEvent NotificationSelected>
	// 2759 6417:aastore         
	// 2760 6418:dup             
	// 2761 6419:sipush          253
	// 2762 6422:getstatic       #1067 <Field AnalyticsEvent NotificationCenterVideoViewed>
	// 2763 6425:aastore         
	// 2764 6426:dup             
	// 2765 6427:sipush          254
	// 2766 6430:getstatic       #1070 <Field AnalyticsEvent NotificationBackSelected>
	// 2767 6433:aastore         
	// 2768 6434:dup             
	// 2769 6435:sipush          255
	// 2770 6438:getstatic       #1073 <Field AnalyticsEvent NotificationFeedback>
	// 2771 6441:aastore         
	// 2772 6442:dup             
	// 2773 6443:sipush          256
	// 2774 6446:getstatic       #1076 <Field AnalyticsEvent NotificationBackSmartScheduleSelected>
	// 2775 6449:aastore         
	// 2776 6450:dup             
	// 2777 6451:sipush          257
	// 2778 6454:getstatic       #1079 <Field AnalyticsEvent NotificationCenterSmartScheduleMessageClicked>
	// 2779 6457:aastore         
	// 2780 6458:dup             
	// 2781 6459:sipush          258
	// 2782 6462:getstatic       #1082 <Field AnalyticsEvent NotificationCenterSmartScheduleAccepted>
	// 2783 6465:aastore         
	// 2784 6466:dup             
	// 2785 6467:sipush          259
	// 2786 6470:getstatic       #1085 <Field AnalyticsEvent NotificationCenterSmartScheduleDeclined>
	// 2787 6473:aastore         
	// 2788 6474:dup             
	// 2789 6475:sipush          260
	// 2790 6478:getstatic       #1088 <Field AnalyticsEvent ProvAddRobotViewed>
	// 2791 6481:aastore         
	// 2792 6482:dup             
	// 2793 6483:sipush          261
	// 2794 6486:getstatic       #1091 <Field AnalyticsEvent ProvAddRobotSelected>
	// 2795 6489:aastore         
	// 2796 6490:dup             
	// 2797 6491:sipush          262
	// 2798 6494:getstatic       #1094 <Field AnalyticsEvent ProvSetupChecklistViewed>
	// 2799 6497:aastore         
	// 2800 6498:dup             
	// 2801 6499:sipush          263
	// 2802 6502:getstatic       #1097 <Field AnalyticsEvent ProvEnableBluetoothErrorViewed>
	// 2803 6505:aastore         
	// 2804 6506:dup             
	// 2805 6507:sipush          264
	// 2806 6510:getstatic       #1100 <Field AnalyticsEvent ProvHomeBasePlacementViewed>
	// 2807 6513:aastore         
	// 2808 6514:dup             
	// 2809 6515:sipush          265
	// 2810 6518:getstatic       #1103 <Field AnalyticsEvent ProvRobotNameViewed>
	// 2811 6521:aastore         
	// 2812 6522:dup             
	// 2813 6523:sipush          266
	// 2814 6526:getstatic       #1106 <Field AnalyticsEvent ProvRobotNameDone>
	// 2815 6529:aastore         
	// 2816 6530:dup             
	// 2817 6531:sipush          267
	// 2818 6534:getstatic       #1109 <Field AnalyticsEvent ProvCurrentNetworkViewed>
	// 2819 6537:aastore         
	// 2820 6538:dup             
	// 2821 6539:sipush          268
	// 2822 6542:getstatic       #1112 <Field AnalyticsEvent ProvCurrentNetworkChangeButtonPressed>
	// 2823 6545:aastore         
	// 2824 6546:dup             
	// 2825 6547:sipush          269
	// 2826 6550:getstatic       #1115 <Field AnalyticsEvent ProvAdvancedWifiSettingsViewed>
	// 2827 6553:aastore         
	// 2828 6554:dup             
	// 2829 6555:sipush          270
	// 2830 6558:getstatic       #1118 <Field AnalyticsEvent ProvWifiPasswordViewed>
	// 2831 6561:aastore         
	// 2832 6562:dup             
	// 2833 6563:sipush          271
	// 2834 6566:getstatic       #1121 <Field AnalyticsEvent ProvWifiPasswordDone>
	// 2835 6569:aastore         
	// 2836 6570:dup             
	// 2837 6571:sipush          272
	// 2838 6574:getstatic       #1124 <Field AnalyticsEvent ProvActivateRoombaViewed>
	// 2839 6577:aastore         
	// 2840 6578:dup             
	// 2841 6579:sipush          273
	// 2842 6582:getstatic       #1127 <Field AnalyticsEvent ProvActivateRoombaConfirmation>
	// 2843 6585:aastore         
	// 2844 6586:dup             
	// 2845 6587:sipush          274
	// 2846 6590:getstatic       #1130 <Field AnalyticsEvent ProvActivateRoombaContinueButtonPressed>
	// 2847 6593:aastore         
	// 2848 6594:dup             
	// 2849 6595:sipush          275
	// 2850 6598:getstatic       #1133 <Field AnalyticsEvent ProvBleDiscoveryViewed>
	// 2851 6601:aastore         
	// 2852 6602:dup             
	// 2853 6603:sipush          276
	// 2854 6606:getstatic       #1136 <Field AnalyticsEvent ProvBleDiscoveryResult>
	// 2855 6609:aastore         
	// 2856 6610:dup             
	// 2857 6611:sipush          277
	// 2858 6614:getstatic       #1139 <Field AnalyticsEvent ProvConnectToRoombaViewed>
	// 2859 6617:aastore         
	// 2860 6618:dup             
	// 2861 6619:sipush          278
	// 2862 6622:getstatic       #1142 <Field AnalyticsEvent ProvInfoButtonPressed>
	// 2863 6625:aastore         
	// 2864 6626:dup             
	// 2865 6627:sipush          279
	// 2866 6630:getstatic       #1145 <Field AnalyticsEvent ProvCancelButtonPressed>
	// 2867 6633:aastore         
	// 2868 6634:dup             
	// 2869 6635:sipush          280
	// 2870 6638:getstatic       #1148 <Field AnalyticsEvent ProvViewed>
	// 2871 6641:aastore         
	// 2872 6642:dup             
	// 2873 6643:sipush          281
	// 2874 6646:getstatic       #1151 <Field AnalyticsEvent ProvErrorViewed>
	// 2875 6649:aastore         
	// 2876 6650:dup             
	// 2877 6651:sipush          282
	// 2878 6654:getstatic       #1154 <Field AnalyticsEvent ProvStarted>
	// 2879 6657:aastore         
	// 2880 6658:dup             
	// 2881 6659:sipush          283
	// 2882 6662:getstatic       #1157 <Field AnalyticsEvent ProvStatus>
	// 2883 6665:aastore         
	// 2884 6666:dup             
	// 2885 6667:sipush          284
	// 2886 6670:getstatic       #1160 <Field AnalyticsEvent ProvStatusConnected>
	// 2887 6673:aastore         
	// 2888 6674:dup             
	// 2889 6675:sipush          285
	// 2890 6678:getstatic       #1163 <Field AnalyticsEvent ProvStatusSendingConfig>
	// 2891 6681:aastore         
	// 2892 6682:dup             
	// 2893 6683:sipush          286
	// 2894 6686:getstatic       #1166 <Field AnalyticsEvent ProvStatusCheckingConfig>
	// 2895 6689:aastore         
	// 2896 6690:dup             
	// 2897 6691:sipush          287
	// 2898 6694:getstatic       #1169 <Field AnalyticsEvent ProvStatusActivatingWifi>
	// 2899 6697:aastore         
	// 2900 6698:dup             
	// 2901 6699:sipush          288
	// 2902 6702:getstatic       #1172 <Field AnalyticsEvent ProvStatusVerifyingConnection>
	// 2903 6705:aastore         
	// 2904 6706:dup             
	// 2905 6707:sipush          289
	// 2906 6710:getstatic       #1175 <Field AnalyticsEvent ProvError>
	// 2907 6713:aastore         
	// 2908 6714:dup             
	// 2909 6715:sipush          290
	// 2910 6718:getstatic       #1178 <Field AnalyticsEvent ProvFinished>
	// 2911 6721:aastore         
	// 2912 6722:putstatic       #1180 <Field AnalyticsEvent[] $VALUES>
	//*2913 6725:return          
	}
}
