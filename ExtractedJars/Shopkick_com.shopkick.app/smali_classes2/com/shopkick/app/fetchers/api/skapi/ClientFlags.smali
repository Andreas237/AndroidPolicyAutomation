.class public Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ClientFlags.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public aboutShopkickUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ageValidationBirthdateCacheTimeSeconds:Ljava/lang/Integer;

.field public allow2XImageFetching:Ljava/lang/Boolean;

.field public allowBluetoothAlertOnStoresTab:Ljava/lang/Boolean;

.field public allowLookbookExpandInFeed:Ljava/lang/Boolean;

.field public alwaysInStoreFeed:Ljava/lang/Boolean;

.field public alwaysUseHttps:Ljava/lang/Boolean;

.field public androidReceiptScanImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

.field public androidReceiptScanJpegCompression:Ljava/lang/Double;

.field public apiMemoryCacheSize:Ljava/lang/Integer;

.field public bbyAvailableScansLeft:Ljava/lang/Integer;

.field public bbyBarcodeFlowRequiresRegistration:Ljava/lang/Boolean;

.field public bbyBarcodeFlowShouldShowTwoBarcodes:Ljava/lang/Boolean;

.field public bbyScanCountdownRiderText:Ljava/lang/String;

.field public bbyScanLimitReachedRiderText:Ljava/lang/String;

.field public blockedDuplicateCodeRetryDelayMs:Ljava/lang/Integer;

.field public brandedLookbookSavingEnabled:Ljava/lang/Boolean;

.field public btleBlanketDisable:Ljava/lang/Boolean;

.field public btleClearStateOnBackground:Ljava/lang/Boolean;

.field public btleEnableMessagingBackground:Ljava/lang/Boolean;

.field public btleEnableMessagingForeground:Ljava/lang/Boolean;

.field public btleEnableMonitorSignificantLocationChange:Ljava/lang/Boolean;

.field public btleForceOfflineMode:Ljava/lang/Boolean;

.field public btleLoggingLevel:Ljava/lang/Integer;

.field public btleManuallyUpdateLocationIfUnavailable:Ljava/lang/Integer;

.field public btleMaxMessagesPerDay:Ljava/lang/Integer;

.field public btleMaxSignalStrengthGap:Ljava/lang/Integer;

.field public btleMinDetectionStrength:Ljava/lang/Integer;

.field public btleMinGapBetweenMessagesForSameBeaconMs:Ljava/lang/Integer;

.field public btleMinGapBetweenMessagesMs:Ljava/lang/Integer;

.field public btleMinimumLocationFreshness:Ljava/lang/Integer;

.field public btlePermissionRequest:Ljava/lang/Boolean;

.field public btlePreventSameStoreMessagePerDay:Ljava/lang/Boolean;

.field public btleRefreshStateIntervalMs:Ljava/lang/Integer;

.field public btleScanReportInterval:Ljava/lang/Double;

.field public btleScanReportIntervalBackground:Ljava/lang/Double;

.field public btleScanningInAndroid:Ljava/lang/Boolean;

.field public buildUpFirstLevelWarning:Ljava/lang/Integer;

.field public buildUpSecondLevelWarning:Ljava/lang/Integer;

.field public buyAndCollectEnabled:Ljava/lang/Boolean;

.field public certificateTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            ">;"
        }
    .end annotation
.end field

.field public clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

.field public clientKillSwitchForInvites:Ljava/lang/Boolean;

.field public clientLogBatchSize:Ljava/lang/Integer;

.field public combinedTosPpUrl:Ljava/lang/String;

.field public compStrings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public contactPickerSizeLimitBeforeStoppingRecommendation:Ljava/lang/Integer;

.field public contactSyncBatchSize:Ljava/lang/Integer;

.field public daysBetweenAddressBookRefresh:Ljava/lang/Integer;

.field public daysBetweenContactsSynch:Ljava/lang/Integer;

.field public daysBetweenFacebookContactsRefresh:Ljava/lang/Integer;

.field public dealDetailsV2Enabled:Ljava/lang/Boolean;

.field public dealsWithProductsEnabled:Ljava/lang/Boolean;

.field public defaultEarnTabToggleOption:Ljava/lang/Integer;

.field public defaultEnableProximityNotifications:Ljava/lang/Boolean;

.field public defaultFacebookPostWalkinValue:Ljava/lang/Boolean;

.field public delayStoreListForGps:Ljava/lang/Boolean;

.field public delayWalkinForGps:Ljava/lang/Boolean;

.field public deprecateShoppingLists:Ljava/lang/Boolean;

.field public desiredCallbackAccuracy:Ljava/lang/Double;

.field public disableBeaconNotMatchedToZoneFallback:Ljava/lang/Boolean;

.field public disableContactSyncing:Ljava/lang/Boolean;

.field public disableGeofencingNotificationWhenUserDriving:Ljava/lang/Boolean;

.field public disableGeofencingWhenWifiIsDisabled:Ljava/lang/Boolean;

.field public disableKicksForClick:Ljava/lang/Boolean;

.field public disableKicksForRetailerReceipts:Ljava/lang/Boolean;

.field public disableLocationAccuracyPrompting:Ljava/lang/Boolean;

.field public disableLocationPermissionBanner:Ljava/lang/Boolean;

.field public disableNewBarcodeScannerWithTips:Ljava/lang/Boolean;

.field public disableNewDiscoverTab:Ljava/lang/Boolean;

.field public disableNewGpsWalkinAlgorithm:Ljava/lang/Boolean;

.field public disableNewOnlineKicksUnit:Ljava/lang/Boolean;

.field public disableNewProductSelectorScreen:Ljava/lang/Boolean;

.field public disableNewRussellButton:Ljava/lang/Boolean;

.field public disableOcrProcessing:Ljava/lang/Boolean;

.field public disableOffersDetailScreen:Ljava/lang/Boolean;

.field public disableOnlineOffersV2TileCells:Ljava/lang/Boolean;

.field public disableReportWalkinIssue:Ljava/lang/Boolean;

.field public diskCacheMaxBytes:Ljava/lang/Integer;

.field public diskCacheMaxNumItems:Ljava/lang/Integer;

.field public diskCacheSize:Ljava/lang/Integer;

.field public displayInStoreTabbedUi:Ljava/lang/Boolean;

.field public doNotUseStoreV4TileType:Ljava/lang/Boolean;

.field public dontDisplayBarcodeDigitsForBestBuy:Ljava/lang/Boolean;

.field public dontDisplayEmailBarcodeForBestBuy:Ljava/lang/Boolean;

.field public dontIncreaseBrightnessForBestBuy:Ljava/lang/Boolean;

.field public dontShowOnlyLiveReceiptKicks:Ljava/lang/Boolean;

.field public dontShowTappableKicksActivityDetails:Ljava/lang/Boolean;

.field public dontUseNewReceiptScanFlow:Ljava/lang/Boolean;

.field public dontUseNewTilesAndCopyForKicksTutorialScreen:Ljava/lang/Boolean;

.field public dontUseReceiptScanInstructionFlow:Ljava/lang/Boolean;

.field public dontUseWalkinButton:Ljava/lang/Boolean;

.field public enableCameraControllerV3:Ljava/lang/Boolean;

.field public enableDealSharing:Ljava/lang/Boolean;

.field public enableDevLogging:Ljava/lang/Boolean;

.field public enableFtueDiscoverTabLesson:Ljava/lang/Boolean;

.field public enableFtueTutorial:Ljava/lang/Boolean;

.field public enableGpsCheckins:Ljava/lang/Boolean;

.field public enableImageRecognitionScans:Ljava/lang/Boolean;

.field public enableImageResponseTimeLogging:Ljava/lang/Boolean;

.field public enableIndividualCardManagement:Ljava/lang/Boolean;

.field public enableInlineProgrammaticVideo:Ljava/lang/Boolean;

.field public enableKicksForPurchasesV2:Ljava/lang/Boolean;

.field public enableMarketingPromoCodes:Ljava/lang/Boolean;

.field public enableMoatTracking:Ljava/lang/Boolean;

.field public enableMultiSignalWalkins:Ljava/lang/Boolean;

.field public enableNetworkRequestTimeoutLogging:Ljava/lang/Boolean;

.field public enableNewKicksActivityScreen:Ljava/lang/Boolean;

.field public enableNotificationCenter:Ljava/lang/Boolean;

.field public enableOcrTest:Ljava/lang/Boolean;

.field public enableOfflineFramework:Ljava/lang/Boolean;

.field public enableOfflineScan:Ljava/lang/Boolean;

.field public enableOnlineOfferTileStartButtonTransaction:Ljava/lang/Boolean;

.field public enableOnlineStoreDetailsScreenCategoryKicks:Ljava/lang/Boolean;

.field public enablePerformanceLogging:Ljava/lang/Boolean;

.field public enablePinchToZoomOnScanV3:Ljava/lang/Boolean;

.field public enablePresenceDetectionLogging:Ljava/lang/Boolean;

.field public enableProductSelectorForceItems:Ljava/lang/Boolean;

.field public enableProgrammaticSurvey:Ljava/lang/Boolean;

.field public enableQuickKicksWidget:Ljava/lang/Boolean;

.field public enableRadarSdkIntegration:Ljava/lang/Boolean;

.field public enableReceiptScan:Ljava/lang/Boolean;

.field public enableScanMissionOdp:Ljava/lang/Boolean;

.field public enableScanditCameraStandby:Ljava/lang/Boolean;

.field public enableSearchButton:Ljava/lang/Boolean;

.field public enableTrackingUrls:Ljava/lang/Boolean;

.field public enableWifiScanningInBackground:Ljava/lang/Boolean;

.field public enableWifiScanningInForeground:Ljava/lang/Boolean;

.field public enableWifiScanningWithoutGeofencing:Ljava/lang/Boolean;

.field public enabledBuyAndCollectProgramIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public enforceFullFlowForReceiptScanInstruction:Ljava/lang/Boolean;

.field public enforceHorizontalLookbooks:Ljava/lang/Boolean;

.field public facebookPermissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public facebookPostWalkinFeatureEnabled:Ljava/lang/Boolean;

.field public facebookProfilePicUrlTemplate:Ljava/lang/String;

.field public facebookReadPermissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public facebookTimelineUsageDescription:Ljava/lang/String;

.field public facebookWritePermissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public feedPrefetchBackward:Ljava/lang/Integer;

.field public feedPrefetchForward:Ljava/lang/Integer;

.field public filterStaleLocationFixes:Ljava/lang/Boolean;

.field public firstLoiterReadingTimeout:Ljava/lang/Double;

.field public force1XImages:Ljava/lang/Boolean;

.field public geofenceBackgroundDailyLimitMin:Ljava/lang/Integer;

.field public geofenceBackgroundMinBatteryPercentage:Ljava/lang/Integer;

.field public geofenceBackgroundModeUpdateLocationFactor:Ljava/lang/Double;

.field public geofenceBackgroundServiceEndHour:Ljava/lang/Integer;

.field public geofenceBackgroundServiceStartHour:Ljava/lang/Integer;

.field public geofenceBackgroundTotalLimitMin:Ljava/lang/Integer;

.field public geofenceDistantStoresUpdateLocationFactor:Ljava/lang/Double;

.field public geofenceInTheBackground:Ljava/lang/Boolean;

.field public geofenceInTheForeground:Ljava/lang/Boolean;

.field public geofenceNearbyStoresDailyLimit:Ljava/lang/Integer;

.field public geofenceNearbyStoresMotionThreshold:Ljava/lang/Integer;

.field public geofenceNearbyStoresPnsDailyLimit:Ljava/lang/Integer;

.field public geofenceNearbyStoresQuietTimeMin:Ljava/lang/Integer;

.field public geofenceNearbyStoresQuietZoneMeters:Ljava/lang/Integer;

.field public geofenceNearbyStoresRadiusMeters:Ljava/lang/Integer;

.field public geofenceNearbyStoresRecordingDailyLimitMin:Ljava/lang/Integer;

.field public geofenceNearbyStoresRecordingDurationMin:Ljava/lang/Integer;

.field public geofenceNearbyStoresRecordingQuietTimeMin:Ljava/lang/Integer;

.field public geofenceNearbyStoresRecordingRadiusMeters:Ljava/lang/Integer;

.field public geofenceNearbyStoresResultSetCap:Ljava/lang/Integer;

.field public geofenceNearbyStoresSampleProbability:Ljava/lang/Double;

.field public geofenceNearbyStoresUpdateLocationFactor:Ljava/lang/Double;

.field public geofenceNearbyStoresWalkinAgeMs:Ljava/lang/Integer;

.field public geofencePnsBackgroundWalkinMessage:Ljava/lang/String;

.field public geofencePnsBackgroundWalkinSummary:Ljava/lang/String;

.field public geofencePnsBackgroundWalkinTitle:Ljava/lang/String;

.field public geofencePnsNearbyStoreAwardsMessage:Ljava/lang/String;

.field public geofencePnsNearbyStoreAwardsSummary:Ljava/lang/String;

.field public geofencePnsNearbyStoreAwardsTitle:Ljava/lang/String;

.field public geofenceUploadLogsPeriodMin:Ljava/lang/Integer;

.field public geofencingDisableSignificantLocationUpdate:Ljava/lang/Boolean;

.field public geofencingDynamicUpdateLocationChangeSignficanceMetric:Ljava/lang/Double;

.field public geofencingDynamicUpdateMinimumAttemptIntervalMinutes:Ljava/lang/Double;

.field public geofencingDynamicUpdateMinimumLocationAccuracy:Ljava/lang/Integer;

.field public geofencingEnableGpsLargeRadius:Ljava/lang/Boolean;

.field public geofencingEnableGpsSmallRadius:Ljava/lang/Boolean;

.field public geofencingEnableLocalAlerts:Ljava/lang/Boolean;

.field public geofencingEnableMessagingWhenBackgroundedWithinRegion:Ljava/lang/Boolean;

.field public geofencingEnableNetworkLargeRadius:Ljava/lang/Boolean;

.field public geofencingEnableNetworkSmallRadius:Ljava/lang/Boolean;

.field public geofencingEnablePassiveLargeRadius:Ljava/lang/Boolean;

.field public geofencingEnablePassiveSmallRadius:Ljava/lang/Boolean;

.field public geofencingEnablePnsMessages:Ljava/lang/Boolean;

.field public geofencingEnableSpeedBasedFiltering:Ljava/lang/Boolean;

.field public geofencingEnableVerboseMode:Ljava/lang/Boolean;

.field public geofencingFastUpdateIntervalMs:Ljava/lang/Integer;

.field public geofencingHeartbeatIntervalMs:Ljava/lang/Integer;

.field public geofencingIosRegionRadius:Ljava/lang/Integer;

.field public geofencingIosSignificantLocationRadius:Ljava/lang/Integer;

.field public geofencingIosUseVisitsMonitoring:Ljava/lang/Boolean;

.field public geofencingLogServerReqRespOnClient:Ljava/lang/Boolean;

.field public geofencingMaxFastUpdates:Ljava/lang/Integer;

.field public geofencingMaxMonitoringRegions:Ljava/lang/Integer;

.field public geofencingMaxUniqueNotificationAlarmIds:Ljava/lang/Integer;

.field public geofencingMeasureVelocity:Ljava/lang/Boolean;

.field public geofencingMinimumLocationAccuracy:Ljava/lang/Integer;

.field public geofencingMinimumLocationFreshness:Ljava/lang/Integer;

.field public geofencingNearbyStoresMinimumBackgroundTimeBeforePnsMs:Ljava/lang/Integer;

.field public geofencingNearbyStoresQuietTimeMs:Ljava/lang/Integer;

.field public geofencingNotificationExpiryTimeMs:Ljava/lang/Integer;

.field public geofencingNumberConsecutiveGpsFetches:Ljava/lang/Integer;

.field public geofencingPreventSameStoreMessagesPerDay:Ljava/lang/Boolean;

.field public geofencingRadiusLarge:Ljava/lang/Integer;

.field public geofencingRadiusSmall:Ljava/lang/Integer;

.field public geofencingRefreshStateIntervalMs:Ljava/lang/Integer;

.field public geofencingServerSideMessageCreation:Ljava/lang/Integer;

.field public geofencingUseAccuracyAsRadiusExtender:Ljava/lang/Boolean;

.field public geofencingUseExperimentalGeofencingAlgorithm:Ljava/lang/Boolean;

.field public geofencingVisitsMaxDelay:Ljava/lang/Integer;

.field public goodLocationFixTargetAccuracy:Ljava/lang/Double;

.field public goodLocationFixTimoutTime:Ljava/lang/Double;

.field public googlePlusServerClientId:Ljava/lang/String;

.field public gpsFailbackBucketSizeInMeters:Ljava/lang/Integer;

.field public gpsSampleProbability:Ljava/lang/Double;

.field public gpsStalenessIfNoTime:Ljava/lang/Double;

.field public handleRegexMatchForBarcodes:Ljava/lang/Boolean;

.field public hideEmailFieldOnPhoneZipScreen:Ljava/lang/Boolean;

.field public hideKicksJumpAnimation:Ljava/lang/Boolean;

.field public hideProfilePrivacyCheckbox:Ljava/lang/Boolean;

.field public hideQuantityInReceiptDetails:Ljava/lang/Boolean;

.field public hideRewardponsTab:Ljava/lang/Boolean;

.field public hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

.field public hideZipCodeFieldOnPhoneZipScreen:Ljava/lang/Boolean;

.field public homeFeedForegroundRefreshInterval:Ljava/lang/Integer;

.field public homeScreenFeedTilesPageSize:Ljava/lang/Integer;

.field public homeScreenFeedTilesRemainingBeforeNextFetch:Ljava/lang/Integer;

.field public homeScreenKickCountEnabled:Ljava/lang/Boolean;

.field public howItWorksUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public imageCacheMaxCountIos:Ljava/lang/Integer;

.field public imageCacheSize:Ljava/lang/Integer;

.field public imageResponseTimeLoggingSamplePercentage:Ljava/lang/Integer;

.field public invitePromoCodeCtaButtonText:Ljava/lang/String;

.field public inviteShareButtonType:Ljava/lang/Integer;

.field public iosGpsAlgorithmVersion:Ljava/lang/Integer;

.field public iosGpsRefreshInterval:Ljava/lang/Integer;

.field public iosReceiptScanImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

.field public iosReceiptScanJpegCompression:Ljava/lang/Double;

.field public keepAllPromoUnitOnTop:Ljava/lang/Boolean;

.field public kickstarterBonusExpiryTimestamp:Ljava/lang/Long;

.field public largeImageThreshold:Ljava/lang/Integer;

.field public launchScreenSkLink:Ljava/lang/String;

.field public levelUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public limitBbyScans:Ljava/lang/Boolean;

.field public limitLargeImages:Ljava/lang/Boolean;

.field public locatingYouDismissTimeout:Ljava/lang/Integer;

.field public locatingYouGpsTimeout:Ljava/lang/Integer;

.field public locatingYouMaxNumStores:Ljava/lang/Integer;

.field public locatingYouMessageEnabled:Ljava/lang/Boolean;

.field public locatingYouRadius:Ljava/lang/Integer;

.field public loiterRadiusMultiplierForTracking:Ljava/lang/Double;

.field public loiterTimeBeforeDisplay:Ljava/lang/Double;

.field public lookbookHistoryTrimmedLength:Ljava/lang/Integer;

.field public mastercardCertificateChain:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public maxAcceptableAccuracy:Ljava/lang/Double;

.field public maxAcceptableStaleness:Ljava/lang/Double;

.field public maxConcurrentTrackingUrlRequests:Ljava/lang/Integer;

.field public maxFavesPerUser:Ljava/lang/Integer;

.field public maxGpsRefineTime:Ljava/lang/Double;

.field public maxGpsSearchTime:Ljava/lang/Double;

.field public maxLinkedCardsMastercard:Ljava/lang/Integer;

.field public maxLinkedCardsVisa:Ljava/lang/Integer;

.field public maxLocationStaleness:Ljava/lang/Double;

.field public maxLookbookHistoryLength:Ljava/lang/Integer;

.field public maxOfflineUnusedRewards:Ljava/lang/Integer;

.field public maxOutOfBoundsReadingsAllowed:Ljava/lang/Integer;

.field public maxPendingShoppingListCreationAndModifications:Ljava/lang/Integer;

.field public maxReceiptScanPages:Ljava/lang/Integer;

.field public maxScanZoomScaleFactor:Ljava/lang/Double;

.field public maxStoreListGpsAccuracy:Ljava/lang/Double;

.field public maxStoreListGpsStaleness:Ljava/lang/Double;

.field public maxTimeForVideoRenderingIntervalSeconds:Ljava/lang/Integer;

.field public maxTimesToDisplayPassbookHookViewPerStoryGroup:Ljava/lang/Integer;

.field public maxWalkinGpsAccuracy:Ljava/lang/Double;

.field public maxWalkinGpsStaleness:Ljava/lang/Double;

.field public maxWalkinRequestAgeMs:Ljava/lang/Integer;

.field public messageDisclaimerUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public micPermissionPromoUrl:Ljava/lang/String;

.field public minDistanceToUpdateLocation:Ljava/lang/Double;

.field public minGpsAccuracyForLoiterReading:Ljava/lang/Integer;

.field public minGpsReadingsDuringLoiter:Ljava/lang/Integer;

.field public minTimeToUpdateLocation:Ljava/lang/Double;

.field public missingItemClickHistoryMaxAgeSeconds:Ljava/lang/Integer;

.field public moatPartnerCode:Ljava/lang/String;

.field public navBarRightButtons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public nearbyLocationsBucketSizeInMeters:Ljava/lang/Integer;

.field public newBarcodeScannerTipsInitiallyHidden:Ljava/lang/Boolean;

.field public notifiactionTurnedOffPollingInterval:Ljava/lang/Double;

.field public notificationCenterEnabled:Ljava/lang/Boolean;

.field public notificationSuppressionDrivingSpeed:Ljava/lang/Double;

.field public notificationTurnedOffPollingDuration:Ljava/lang/Double;

.field public numRetriesAllowedForContactSync:Ljava/lang/Integer;

.field public numTimesToRepeatSwipeCoachMark:Ljava/lang/Integer;

.field public numTimesToRepeatTapCoachMark:Ljava/lang/Integer;

.field public oaMapRefreshDistanceTrigger:Ljava/lang/Integer;

.field public oaMapRefreshStalenessTrigger:Ljava/lang/Integer;

.field public ocrImageSize:Ljava/lang/Integer;

.field public offerCardDeckFetchSize:Ljava/lang/Integer;

.field public offerCardDeckOffersRemainingBeforeNextFetch:Ljava/lang/Integer;

.field public offersDataSourceOfferProxyCacheSize:Ljava/lang/Integer;

.field public offlineDataStoreBtleBucketDecimalPrecision:Ljava/lang/Integer;

.field public offlineDataStoreBtleBucketSizeMeters:Ljava/lang/Integer;

.field public offlineDataStoreBtleSyncOnSessionStart:Ljava/lang/Integer;

.field public offlineDataStoreKeyPrefixesByCategory:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public offlineDataStoreMemoryCacheMaxBytes:Ljava/lang/Integer;

.field public offlineDataStoreMemoryCacheSize:Ljava/lang/Integer;

.field public offlineDataStoreMinSecondsBetweenResyncs:Ljava/lang/Double;

.field public offlineDataStoreRetryIntervalSeconds:Ljava/lang/Double;

.field public offlineDataStoreRetryLimit:Ljava/lang/Integer;

.field public offlineDataStoreSearchNeighboringBuckets:Ljava/lang/Integer;

.field public offlineGracePeriodMins:Ljava/lang/Integer;

.field public offlineMaxBatchSize:Ljava/lang/Integer;

.field public offlineMaxQueuedRemindersToShow:Ljava/lang/Integer;

.field public offlineMaxRequestAgeMins:Ljava/lang/Integer;

.field public offlineMaxRetries:Ljava/lang/Integer;

.field public offlineMinsLeftToTriggerAlarm1:Ljava/lang/Integer;

.field public offlineMinsLeftToTriggerAlarm2:Ljava/lang/Integer;

.field public offlineRetryIntervalSeconds:Ljava/lang/Integer;

.field public offlineScanFailureStatusDataMaxAgeInSeconds:Ljava/lang/Integer;

.field public offlineScanFlowRequestTimeoutInSeconds:Ljava/lang/Integer;

.field public offlineShowReminderIntervalSeconds:Ljava/lang/Integer;

.field public offlineTimeoutIntervalSeconds:Ljava/lang/Integer;

.field public onboardingVersion:Ljava/lang/Integer;

.field public pdCrcCheckDisabled:Ljava/lang/Boolean;

.field public pdDeptCoderMinAbsolutePower:Ljava/lang/Double;

.field public pdDeptCodesEnabled:Ljava/lang/Boolean;

.field public pdDopplerCorrectionEnabled:Ljava/lang/Boolean;

.field public pdEventLogLevel:Ljava/lang/Integer;

.field public pdExportFftData:Ljava/lang/Boolean;

.field public pdFftDataReturnRateForFailures:Ljava/lang/Double;

.field public pdFreqCodingBitDetectThreshold:Ljava/lang/Double;

.field public pdFreqCodingCarrierThreshold:Ljava/lang/Double;

.field public pdFreqCodingDetectThreshold:Ljava/lang/Double;

.field public pdFreqCodingFrFactors:Ljava/lang/String;

.field public pdFreqCodingGapInSamplesBetweenLowFreqAndCalibration:Ljava/lang/Integer;

.field public pdFreqCodingMaxFreqOfAvgForOne:Ljava/lang/Double;

.field public pdFreqCodingMaxIntermediate:Ljava/lang/Integer;

.field public pdFreqCodingMinCarriers:Ljava/lang/Integer;

.field public pdFreqCodingNoiseThreshold:Ljava/lang/Double;

.field public pdFreqCodingNumSamplesToCalibrateWith:Ljava/lang/Integer;

.field public pdFreqCodingPresenceDetectMinBits:Ljava/lang/Integer;

.field public pdFreqCodingPresenceNarrowBandDetectThreshold:Ljava/lang/Double;

.field public pdFreqCodingPresenceStrengthRatioThreshold:Ljava/lang/Double;

.field public pdFreqCodingPresenceWideBandDetectThreshold:Ljava/lang/Double;

.field public pdFreqCodingUseErrorCorrection:Ljava/lang/Boolean;

.field public pdFreqCodingUseLocalSd:Ljava/lang/Boolean;

.field public pdFreqCodingUseLocalSdSector:Ljava/lang/Boolean;

.field public pdHighPassFilterEnabled:Ljava/lang/Boolean;

.field public pdHighPassFilterType:Ljava/lang/Integer;

.field public pdLocAccuracyThresholdForErrorCorrectionMeters:Ljava/lang/Integer;

.field public pdLocBingErrorRadiusMeters:Ljava/lang/Integer;

.field public pdLocBitsToIgnore:Ljava/lang/Integer;

.field public pdLocDistanceRecalcThresholdMeters:Ljava/lang/Integer;

.field public pdLocPresenceDetectCheckinRadiusMeters:Ljava/lang/Integer;

.field public pdLocShouldTryErrorCorrection:Ljava/lang/Boolean;

.field public pdLocUseThresholdForAccuracy:Ljava/lang/Boolean;

.field public pdMaxDopplerHz:Ljava/lang/Double;

.field public pdMaxOldFfts:Ljava/lang/Integer;

.field public pdPrefixBitsRequired:Ljava/lang/Integer;

.field public pdPresenceDetectorRandomDataReturnRate:Ljava/lang/Double;

.field public pdRefreshGpsIfTooFar:Ljava/lang/Boolean;

.field public pdRefreshGpsTimeoutSeconds:Ljava/lang/Integer;

.field public pdServerHighestReturnFrequency:Ljava/lang/Double;

.field public pdServerLowestReturnFrequency:Ljava/lang/Double;

.field public pdSmoothingSamplesUntilExpires:Ljava/lang/Integer;

.field public pdUseAutoEqualizerIfNoFr:Ljava/lang/Boolean;

.field public pdUseScoringForLocationFinder:Ljava/lang/Boolean;

.field public pdUseWindowing:Ljava/lang/Boolean;

.field public pdWaitTimeUntilServerRequest:Ljava/lang/Double;

.field public pdWideBandDetectEnabled:Ljava/lang/Boolean;

.field public pendingAwardsInstructionText:Ljava/lang/String;

.field public pixelUrlAdvertisingIdStrings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public pixelUrlRandomNumberStrings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public postScanNotificationEnabled:Ljava/lang/Boolean;

.field public postScanNotificationInHours:Ljava/lang/Integer;

.field public postScanNotificationTonightHours:Ljava/lang/Integer;

.field public presenceHelpText:Ljava/lang/String;

.field public privacyPolicyUrl:Ljava/lang/String;

.field public promoCarouselAutoAdvanceInitialInterval:Ljava/lang/Double;

.field public promoCarouselAutoAdvanceInterval:Ljava/lang/Double;

.field public promptAppRaterAfterRewardRedemption:Ljava/lang/Boolean;

.field public pullDownFaveCoachMarkShowCount:Ljava/lang/Integer;

.field public rapidGpsMaxSeconds:Ljava/lang/Integer;

.field public rapidGpsStartupEnable:Ljava/lang/Boolean;

.field public receiptScanReminderNotificationDelay:Ljava/lang/Integer;

.field public recipeSavingEnabled:Ljava/lang/Boolean;

.field public regexBarcodeMatchList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public reorderingOnlineOfflineStores:Ljava/lang/Boolean;

.field public rewardDetailsCtaButtonType:Ljava/lang/Integer;

.field public rewardRedemptionMaxPolls:Ljava/lang/Integer;

.field public rewardRedemptionPollingInterval:Ljava/lang/Integer;

.field public rewardRedemptionPollingIntervalMultiplier:Ljava/lang/Integer;

.field public rewardsPickerMinimumDenominationValue:Ljava/lang/Integer;

.field public savedBooksPageSize:Ljava/lang/Integer;

.field public savedOffersPageSize:Ljava/lang/Integer;

.field public savedOffersV3ApiEnabled:Ljava/lang/Boolean;

.field public savedUserBookTilesPageSize:Ljava/lang/Integer;

.field public savingVideoUrl:Ljava/lang/String;

.field public scanImageCompression:Ljava/lang/Double;

.field public scanInfoSkLink:Ljava/lang/String;

.field public scanningMinimumIntervalSec:Ljava/lang/Integer;

.field public seeMoreProductsOverlaysToShow:Ljava/lang/Integer;

.field public sendLocationHeaderAndroid:Ljava/lang/Boolean;

.field public sendLocationHeaderIos:Ljava/lang/Boolean;

.field public sendScanImage:Ljava/lang/Boolean;

.field public shareOverlayDelayOverride:Ljava/lang/Double;

.field public shopkickVideoUrl:Ljava/lang/String;

.field public shoppingListSuggestionsRequestDelayMs:Ljava/lang/Long;

.field public shoppingListsTempIdPrefix:Ljava/lang/String;

.field public shouldDisplayRewardWidget:Ljava/lang/Boolean;

.field public shouldShowFbInviteModal:Ljava/lang/Boolean;

.field public shouldShowFbMessenger:Ljava/lang/Boolean;

.field public shouldShowGpsPermissionUi:Ljava/lang/Boolean;

.field public shouldShowInviteAsTab:Ljava/lang/Boolean;

.field public shouldUseKickDetailsOverlayForScans:Ljava/lang/Boolean;

.field public shouldUsePromoCodeFlow:Ljava/lang/Boolean;

.field public showBluetoothAlertMaxTimes:Ljava/lang/Integer;

.field public showBluetoothAlertRadiusInMeters:Ljava/lang/Integer;

.field public showChallengesInTodayTab:Ljava/lang/Boolean;

.field public showExperimentalLikeButton:Ljava/lang/Boolean;

.field public showInternalFeedbackButton:Ljava/lang/Boolean;

.field public showLeftNavRedesign:Ljava/lang/Boolean;

.field public showMicPermissionReminder:Ljava/lang/Boolean;

.field public showMicrophonePermissionInFeed:Ljava/lang/Boolean;

.field public showNextLookbookToast:Ljava/lang/Boolean;

.field public showOfferTileType:Ljava/lang/Integer;

.field public showOldCopyForBestBuyRulesScreen:Ljava/lang/Boolean;

.field public showReceiptTipsOnCameraScreen:Ljava/lang/Boolean;

.field public showRewardDetailsV2Screen:Ljava/lang/Boolean;

.field public showScanTileReceiptKicksInBlue:Ljava/lang/Boolean;

.field public showSeeMoreProductsOverlay:Ljava/lang/Boolean;

.field public showStorePickerInFirstUse:Ljava/lang/Boolean;

.field public skipProductSelectorScreen:Ljava/lang/Boolean;

.field public skloggerDevloggingDisabled:Ljava/lang/Boolean;

.field public skloggerOnlyDevloggingDisabled:Ljava/lang/Boolean;

.field public skuLevelReceiptScanRulesEnabled:Ljava/lang/Boolean;

.field public storeDetailsGroceryOffersWidgetEnabled:Ljava/lang/Boolean;

.field public supportOptionsToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

.field public supportUrl:Ljava/lang/String;

.field public taxonomyKeywordRelatedOffersBucketSizeMeters:Ljava/lang/Integer;

.field public termsOfServiceUrl:Ljava/lang/String;

.field public topItemsPageSize:Ljava/lang/Integer;

.field public trackingRadiusRefreshInterval:Ljava/lang/Double;

.field public updateLocationsInClient:Ljava/lang/Boolean;

.field public useAndroidGoogleBarcodeSdk:Ljava/lang/Boolean;

.field public useGpsFailback:Ljava/lang/Boolean;

.field public useLargerK4pLayoutForBestBuy:Ljava/lang/Boolean;

.field public useLocationsInClient:Ljava/lang/Boolean;

.field public useNearbyLocationsForPresence:Ljava/lang/Boolean;

.field public useNetworkCacheForIosImageCaching:Ljava/lang/Boolean;

.field public useNewAuthSystem:Ljava/lang/Boolean;

.field public useNewCollectionsScreenApi:Ljava/lang/Boolean;

.field public useNewSavingAndStoryCards:Ljava/lang/Boolean;

.field public useNonReceiptScanningStrings:Ljava/lang/Boolean;

.field public useNormalJpgSize:Ljava/lang/Boolean;

.field public useOldBcPostEnrollmentView:Ljava/lang/Boolean;

.field public useOldIosBtleWalkinDetection:Ljava/lang/Boolean;

.field public useOldK4rLandingPage:Ljava/lang/Boolean;

.field public useOldNonActivityBncFlow:Ljava/lang/Boolean;

.field public useOnlyAccuracyForBestLocation:Ljava/lang/Boolean;

.field public useProductDetailsScreen:Ljava/lang/Boolean;

.field public useScansForLocationV2:Ljava/lang/Boolean;

.field public useSdCardForDiskCache:Ljava/lang/Boolean;

.field public useShortWalkinTextAnimation:Ljava/lang/Boolean;

.field public useShorterRequestTimeoutForOfflineScanFlow:Ljava/lang/Boolean;

.field public useStereoAudio:Ljava/lang/Boolean;

.field public useStoreDetailsScreen:Ljava/lang/Boolean;

.field public userListTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/UserListTag;",
            ">;"
        }
    .end annotation
.end field

.field public userListTagsTitle:Ljava/lang/String;

.field public userListTilesPageSize:Ljava/lang/Integer;

.field public userRegistrationType:Ljava/lang/Integer;

.field public visitMonitoringLoggingEnabled:Ljava/lang/Boolean;

.field public walkinButtonDisableAutomaticWalkins:Ljava/lang/Boolean;

.field public walkinButtonDistanceMultiplier:Ljava/lang/Double;

.field public walkinButtonSuccessDelayMs:Ljava/lang/Integer;

.field public walkinVideoUrl:Ljava/lang/String;

.field public watchCwEnabled:Ljava/lang/Boolean;

.field public watchTvConfidenceThreshold:Ljava/lang/Integer;

.field public watchTvLogDataInClientId:Ljava/lang/Boolean;

.field public watchTvMufinTimeout:Ljava/lang/Integer;

.field public watchTvRecStartDuration1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public watchTvRecStartDuration2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public watchTvRecordDuration:Ljava/lang/Integer;

.field public watchTvRmsCeiling:Ljava/lang/Double;

.field public watchTvRmsChunkSize:Ljava/lang/Integer;

.field public watchTvRmsFloor:Ljava/lang/Double;

.field public watchTvRmsNorm:Ljava/lang/Double;

.field public welcomeForegroundRefreshInterval:Ljava/lang/Integer;

.field public writeCropImageToFile:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;
    .locals 2

    .line 523
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz p1, :cond_0

    .line 524
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 527
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;
    .locals 1

    .line 518
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 23

    move-object/from16 v0, p0

    .line 534
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLocationStaleness:Ljava/lang/Double;

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    if-nez v1, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLocationStaleness:Ljava/lang/Double;

    .line 535
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxGpsSearchTime:Ljava/lang/Double;

    if-nez v1, :cond_1

    const-wide/high16 v4, 0x402e000000000000L    # 15.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxGpsSearchTime:Ljava/lang/Double;

    .line 536
    :cond_1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxGpsRefineTime:Ljava/lang/Double;

    if-nez v1, :cond_2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxGpsRefineTime:Ljava/lang/Double;

    .line 537
    :cond_2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->desiredCallbackAccuracy:Ljava/lang/Double;

    if-nez v1, :cond_3

    const-wide v4, 0x407f400000000000L    # 500.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->desiredCallbackAccuracy:Ljava/lang/Double;

    .line 538
    :cond_3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxAcceptableAccuracy:Ljava/lang/Double;

    if-nez v1, :cond_4

    const-wide v4, 0x40a3880000000000L    # 2500.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxAcceptableAccuracy:Ljava/lang/Double;

    .line 541
    :cond_4
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdWideBandDetectEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_5

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdWideBandDetectEnabled:Ljava/lang/Boolean;

    .line 542
    :cond_5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdDopplerCorrectionEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_6

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdDopplerCorrectionEnabled:Ljava/lang/Boolean;

    .line 543
    :cond_6
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdWaitTimeUntilServerRequest:Ljava/lang/Double;

    if-nez v1, :cond_7

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdWaitTimeUntilServerRequest:Ljava/lang/Double;

    .line 545
    :cond_7
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdServerHighestReturnFrequency:Ljava/lang/Double;

    if-nez v1, :cond_8

    const-wide v4, 0x40d5888000000000L    # 22050.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdServerHighestReturnFrequency:Ljava/lang/Double;

    .line 546
    :cond_8
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdServerLowestReturnFrequency:Ljava/lang/Double;

    if-nez v1, :cond_9

    const-wide v4, 0x40d1940000000000L    # 18000.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdServerLowestReturnFrequency:Ljava/lang/Double;

    .line 547
    :cond_9
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdMaxOldFfts:Ljava/lang/Integer;

    if-nez v1, :cond_a

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdMaxOldFfts:Ljava/lang/Integer;

    .line 548
    :cond_a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceNarrowBandDetectThreshold:Ljava/lang/Double;

    if-nez v1, :cond_b

    const-wide/high16 v4, 0x4018000000000000L    # 6.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceNarrowBandDetectThreshold:Ljava/lang/Double;

    .line 549
    :cond_b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceWideBandDetectThreshold:Ljava/lang/Double;

    if-nez v1, :cond_c

    const-wide v4, 0x4097700000000000L    # 1500.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceWideBandDetectThreshold:Ljava/lang/Double;

    .line 550
    :cond_c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingBitDetectThreshold:Ljava/lang/Double;

    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    if-nez v1, :cond_d

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingBitDetectThreshold:Ljava/lang/Double;

    .line 551
    :cond_d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingMaxFreqOfAvgForOne:Ljava/lang/Double;

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    if-nez v1, :cond_e

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingMaxFreqOfAvgForOne:Ljava/lang/Double;

    .line 552
    :cond_e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingNumSamplesToCalibrateWith:Ljava/lang/Integer;

    if-nez v1, :cond_f

    const/16 v1, 0x96

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingNumSamplesToCalibrateWith:Ljava/lang/Integer;

    .line 553
    :cond_f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingGapInSamplesBetweenLowFreqAndCalibration:Ljava/lang/Integer;

    if-nez v1, :cond_10

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingGapInSamplesBetweenLowFreqAndCalibration:Ljava/lang/Integer;

    .line 554
    :cond_10
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdPresenceDetectorRandomDataReturnRate:Ljava/lang/Double;

    if-nez v1, :cond_11

    const-wide v8, 0x3f847ae147ae147bL    # 0.01

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdPresenceDetectorRandomDataReturnRate:Ljava/lang/Double;

    .line 555
    :cond_11
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceDetectMinBits:Ljava/lang/Integer;

    const/4 v8, 0x5

    if-nez v1, :cond_12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceDetectMinBits:Ljava/lang/Integer;

    .line 556
    :cond_12
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceStrengthRatioThreshold:Ljava/lang/Double;

    if-nez v1, :cond_13

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceStrengthRatioThreshold:Ljava/lang/Double;

    .line 557
    :cond_13
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendScanImage:Ljava/lang/Boolean;

    if-nez v1, :cond_14

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendScanImage:Ljava/lang/Boolean;

    .line 558
    :cond_14
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->scanImageCompression:Ljava/lang/Double;

    if-nez v1, :cond_15

    const-wide/16 v9, 0x0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->scanImageCompression:Ljava/lang/Double;

    .line 559
    :cond_15
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideRewardponsTab:Ljava/lang/Boolean;

    if-nez v1, :cond_16

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideRewardponsTab:Ljava/lang/Boolean;

    .line 560
    :cond_16
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdDeptCoderMinAbsolutePower:Ljava/lang/Double;

    if-nez v1, :cond_17

    const-wide/high16 v9, 0x4049000000000000L    # 50.0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdDeptCoderMinAbsolutePower:Ljava/lang/Double;

    .line 561
    :cond_17
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxAcceptableStaleness:Ljava/lang/Double;

    if-nez v1, :cond_18

    const-wide v9, 0x4066800000000000L    # 180.0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxAcceptableStaleness:Ljava/lang/Double;

    .line 562
    :cond_18
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->minTimeToUpdateLocation:Ljava/lang/Double;

    if-nez v1, :cond_19

    const-wide/high16 v9, 0x403e000000000000L    # 30.0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->minTimeToUpdateLocation:Ljava/lang/Double;

    .line 563
    :cond_19
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->minDistanceToUpdateLocation:Ljava/lang/Double;

    if-nez v1, :cond_1a

    const-wide/high16 v9, 0x403e000000000000L    # 30.0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->minDistanceToUpdateLocation:Ljava/lang/Double;

    .line 564
    :cond_1a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdDeptCodesEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_1b

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdDeptCodesEnabled:Ljava/lang/Boolean;

    .line 565
    :cond_1b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdSmoothingSamplesUntilExpires:Ljava/lang/Integer;

    if-nez v1, :cond_1c

    const/16 v1, 0xc0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdSmoothingSamplesUntilExpires:Ljava/lang/Integer;

    .line 566
    :cond_1c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->force1XImages:Ljava/lang/Boolean;

    if-nez v1, :cond_1d

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->force1XImages:Ljava/lang/Boolean;

    .line 567
    :cond_1d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitLargeImages:Ljava/lang/Boolean;

    if-nez v1, :cond_1e

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitLargeImages:Ljava/lang/Boolean;

    .line 568
    :cond_1e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->largeImageThreshold:Ljava/lang/Integer;

    if-nez v1, :cond_1f

    const v1, 0x3e800

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->largeImageThreshold:Ljava/lang/Integer;

    .line 569
    :cond_1f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->imageCacheSize:Ljava/lang/Integer;

    if-nez v1, :cond_20

    const/high16 v1, 0x100000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->imageCacheSize:Ljava/lang/Integer;

    .line 571
    :cond_20
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->delayWalkinForGps:Ljava/lang/Boolean;

    if-nez v1, :cond_21

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->delayWalkinForGps:Ljava/lang/Boolean;

    .line 572
    :cond_21
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxWalkinGpsAccuracy:Ljava/lang/Double;

    if-nez v1, :cond_22

    const-wide/high16 v9, 0x4099000000000000L    # 1600.0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxWalkinGpsAccuracy:Ljava/lang/Double;

    .line 573
    :cond_22
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxWalkinGpsStaleness:Ljava/lang/Double;

    if-nez v1, :cond_23

    const-wide v9, 0x4082c00000000000L    # 600.0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxWalkinGpsStaleness:Ljava/lang/Double;

    .line 574
    :cond_23
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxStoreListGpsStaleness:Ljava/lang/Double;

    if-nez v1, :cond_24

    const-wide v9, 0x408c200000000000L    # 900.0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxStoreListGpsStaleness:Ljava/lang/Double;

    .line 575
    :cond_24
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->delayStoreListForGps:Ljava/lang/Boolean;

    if-nez v1, :cond_25

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->delayStoreListForGps:Ljava/lang/Boolean;

    .line 576
    :cond_25
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->writeCropImageToFile:Ljava/lang/Boolean;

    if-nez v1, :cond_26

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->writeCropImageToFile:Ljava/lang/Boolean;

    .line 577
    :cond_26
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingUseLocalSd:Ljava/lang/Boolean;

    if-nez v1, :cond_27

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingUseLocalSd:Ljava/lang/Boolean;

    .line 578
    :cond_27
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxFavesPerUser:Ljava/lang/Integer;

    if-nez v1, :cond_28

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxFavesPerUser:Ljava/lang/Integer;

    .line 579
    :cond_28
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showStorePickerInFirstUse:Ljava/lang/Boolean;

    if-nez v1, :cond_29

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showStorePickerInFirstUse:Ljava/lang/Boolean;

    .line 580
    :cond_29
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingUseLocalSdSector:Ljava/lang/Boolean;

    if-nez v1, :cond_2a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingUseLocalSdSector:Ljava/lang/Boolean;

    .line 581
    :cond_2a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingUseErrorCorrection:Ljava/lang/Boolean;

    if-nez v1, :cond_2b

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingUseErrorCorrection:Ljava/lang/Boolean;

    .line 582
    :cond_2b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->gpsSampleProbability:Ljava/lang/Double;

    if-nez v1, :cond_2c

    const-wide/16 v9, 0x0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->gpsSampleProbability:Ljava/lang/Double;

    .line 583
    :cond_2c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->buyAndCollectEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_2d

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->buyAndCollectEnabled:Ljava/lang/Boolean;

    .line 584
    :cond_2d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdCrcCheckDisabled:Ljava/lang/Boolean;

    if-nez v1, :cond_2e

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdCrcCheckDisabled:Ljava/lang/Boolean;

    .line 585
    :cond_2e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdPrefixBitsRequired:Ljava/lang/Integer;

    const/4 v9, 0x0

    if-nez v1, :cond_2f

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdPrefixBitsRequired:Ljava/lang/Integer;

    .line 587
    :cond_2f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingMinCarriers:Ljava/lang/Integer;

    const/4 v10, 0x2

    if-nez v1, :cond_30

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingMinCarriers:Ljava/lang/Integer;

    .line 588
    :cond_30
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingMaxIntermediate:Ljava/lang/Integer;

    const/4 v11, 0x3

    if-nez v1, :cond_31

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingMaxIntermediate:Ljava/lang/Integer;

    .line 589
    :cond_31
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingCarrierThreshold:Ljava/lang/Double;

    if-nez v1, :cond_32

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingCarrierThreshold:Ljava/lang/Double;

    .line 590
    :cond_32
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingDetectThreshold:Ljava/lang/Double;

    if-nez v1, :cond_33

    const-wide/high16 v12, 0x401c000000000000L    # 7.0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingDetectThreshold:Ljava/lang/Double;

    .line 591
    :cond_33
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingNoiseThreshold:Ljava/lang/Double;

    if-nez v1, :cond_34

    const-wide/high16 v12, 0x400c000000000000L    # 3.5

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingNoiseThreshold:Ljava/lang/Double;

    .line 592
    :cond_34
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchCwEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_35

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchCwEnabled:Ljava/lang/Boolean;

    .line 593
    :cond_35
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdHighPassFilterEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_36

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdHighPassFilterEnabled:Ljava/lang/Boolean;

    .line 594
    :cond_36
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdHighPassFilterType:Ljava/lang/Integer;

    if-nez v1, :cond_37

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdHighPassFilterType:Ljava/lang/Integer;

    .line 595
    :cond_37
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseAutoEqualizerIfNoFr:Ljava/lang/Boolean;

    if-nez v1, :cond_38

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseAutoEqualizerIfNoFr:Ljava/lang/Boolean;

    .line 596
    :cond_38
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvConfidenceThreshold:Ljava/lang/Integer;

    const/16 v12, 0x3c

    if-nez v1, :cond_39

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvConfidenceThreshold:Ljava/lang/Integer;

    .line 597
    :cond_39
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseWindowing:Ljava/lang/Boolean;

    if-nez v1, :cond_3a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseWindowing:Ljava/lang/Boolean;

    .line 598
    :cond_3a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRecordDuration:Ljava/lang/Integer;

    if-nez v1, :cond_3b

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRecordDuration:Ljava/lang/Integer;

    .line 599
    :cond_3b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRmsFloor:Ljava/lang/Double;

    if-nez v1, :cond_3c

    const-wide/16 v13, 0x0

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRmsFloor:Ljava/lang/Double;

    .line 600
    :cond_3c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRmsCeiling:Ljava/lang/Double;

    if-nez v1, :cond_3d

    const-wide v13, 0x40c3880000000000L    # 10000.0

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRmsCeiling:Ljava/lang/Double;

    .line 601
    :cond_3d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRmsNorm:Ljava/lang/Double;

    if-nez v1, :cond_3e

    const-wide v13, 0x40a3880000000000L    # 2500.0

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRmsNorm:Ljava/lang/Double;

    .line 602
    :cond_3e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRmsChunkSize:Ljava/lang/Integer;

    if-nez v1, :cond_3f

    const/16 v1, 0x12c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvRmsChunkSize:Ljava/lang/Integer;

    .line 603
    :cond_3f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvLogDataInClientId:Ljava/lang/Boolean;

    if-nez v1, :cond_40

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvLogDataInClientId:Ljava/lang/Boolean;

    .line 604
    :cond_40
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvMufinTimeout:Ljava/lang/Integer;

    if-nez v1, :cond_41

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->watchTvMufinTimeout:Ljava/lang/Integer;

    .line 607
    :cond_41
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useLocationsInClient:Ljava/lang/Boolean;

    if-nez v1, :cond_42

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useLocationsInClient:Ljava/lang/Boolean;

    .line 608
    :cond_42
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->contactSyncBatchSize:Ljava/lang/Integer;

    const/16 v13, 0x3e8

    if-nez v1, :cond_43

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->contactSyncBatchSize:Ljava/lang/Integer;

    .line 609
    :cond_43
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useStereoAudio:Ljava/lang/Boolean;

    if-nez v1, :cond_44

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useStereoAudio:Ljava/lang/Boolean;

    .line 610
    :cond_44
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->daysBetweenContactsSynch:Ljava/lang/Integer;

    if-nez v1, :cond_45

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->daysBetweenContactsSynch:Ljava/lang/Integer;

    .line 611
    :cond_45
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdMaxDopplerHz:Ljava/lang/Double;

    if-nez v1, :cond_46

    const-wide/high16 v14, 0x404b000000000000L    # 54.0

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdMaxDopplerHz:Ljava/lang/Double;

    .line 612
    :cond_46
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocDistanceRecalcThresholdMeters:Ljava/lang/Integer;

    const/16 v14, 0x64

    if-nez v1, :cond_47

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocDistanceRecalcThresholdMeters:Ljava/lang/Integer;

    .line 613
    :cond_47
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocPresenceDetectCheckinRadiusMeters:Ljava/lang/Integer;

    const/16 v15, 0x1388

    if-nez v1, :cond_48

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocPresenceDetectCheckinRadiusMeters:Ljava/lang/Integer;

    .line 614
    :cond_48
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocBingErrorRadiusMeters:Ljava/lang/Integer;

    if-nez v1, :cond_49

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocBingErrorRadiusMeters:Ljava/lang/Integer;

    .line 615
    :cond_49
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocBitsToIgnore:Ljava/lang/Integer;

    if-nez v1, :cond_4a

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocBitsToIgnore:Ljava/lang/Integer;

    .line 616
    :cond_4a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocAccuracyThresholdForErrorCorrectionMeters:Ljava/lang/Integer;

    if-nez v1, :cond_4b

    const/16 v1, 0x5dc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocAccuracyThresholdForErrorCorrectionMeters:Ljava/lang/Integer;

    .line 617
    :cond_4b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocShouldTryErrorCorrection:Ljava/lang/Boolean;

    if-nez v1, :cond_4c

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocShouldTryErrorCorrection:Ljava/lang/Boolean;

    .line 618
    :cond_4c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->numRetriesAllowedForContactSync:Ljava/lang/Integer;

    if-nez v1, :cond_4d

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->numRetriesAllowedForContactSync:Ljava/lang/Integer;

    .line 619
    :cond_4d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableContactSyncing:Ljava/lang/Boolean;

    if-nez v1, :cond_4e

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableContactSyncing:Ljava/lang/Boolean;

    .line 620
    :cond_4e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxRequestAgeMins:Ljava/lang/Integer;

    if-nez v1, :cond_4f

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxRequestAgeMins:Ljava/lang/Integer;

    .line 621
    :cond_4f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMinsLeftToTriggerAlarm1:Ljava/lang/Integer;

    const/16 v16, 0x1e

    if-nez v1, :cond_50

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMinsLeftToTriggerAlarm1:Ljava/lang/Integer;

    .line 622
    :cond_50
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMinsLeftToTriggerAlarm2:Ljava/lang/Integer;

    if-nez v1, :cond_51

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMinsLeftToTriggerAlarm2:Ljava/lang/Integer;

    .line 623
    :cond_51
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineGracePeriodMins:Ljava/lang/Integer;

    if-nez v1, :cond_52

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineGracePeriodMins:Ljava/lang/Integer;

    .line 624
    :cond_52
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseScoringForLocationFinder:Ljava/lang/Boolean;

    if-nez v1, :cond_53

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseScoringForLocationFinder:Ljava/lang/Boolean;

    .line 625
    :cond_53
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineRetryIntervalSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_54

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineRetryIntervalSeconds:Ljava/lang/Integer;

    .line 626
    :cond_54
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineTimeoutIntervalSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_55

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineTimeoutIntervalSeconds:Ljava/lang/Integer;

    .line 627
    :cond_55
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxQueuedRemindersToShow:Ljava/lang/Integer;

    if-nez v1, :cond_56

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxQueuedRemindersToShow:Ljava/lang/Integer;

    .line 628
    :cond_56
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxRetries:Ljava/lang/Integer;

    const/16 v17, 0xa

    if-nez v1, :cond_57

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxRetries:Ljava/lang/Integer;

    .line 629
    :cond_57
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->updateLocationsInClient:Ljava/lang/Boolean;

    if-nez v1, :cond_58

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->updateLocationsInClient:Ljava/lang/Boolean;

    .line 630
    :cond_58
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxBatchSize:Ljava/lang/Integer;

    if-nez v1, :cond_59

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxBatchSize:Ljava/lang/Integer;

    .line 632
    :cond_59
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdEventLogLevel:Ljava/lang/Integer;

    if-nez v1, :cond_5a

    const/16 v1, 0x28

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdEventLogLevel:Ljava/lang/Integer;

    .line 633
    :cond_5a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceInTheForeground:Ljava/lang/Boolean;

    if-nez v1, :cond_5b

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceInTheForeground:Ljava/lang/Boolean;

    .line 634
    :cond_5b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceInTheBackground:Ljava/lang/Boolean;

    if-nez v1, :cond_5c

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceInTheBackground:Ljava/lang/Boolean;

    .line 635
    :cond_5c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresSampleProbability:Ljava/lang/Double;

    if-nez v1, :cond_5d

    const-wide/high16 v18, 0x4059000000000000L    # 100.0

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresSampleProbability:Ljava/lang/Double;

    .line 636
    :cond_5d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundServiceStartHour:Ljava/lang/Integer;

    if-nez v1, :cond_5e

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundServiceStartHour:Ljava/lang/Integer;

    .line 637
    :cond_5e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundServiceEndHour:Ljava/lang/Integer;

    if-nez v1, :cond_5f

    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundServiceEndHour:Ljava/lang/Integer;

    .line 638
    :cond_5f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRadiusMeters:Ljava/lang/Integer;

    if-nez v1, :cond_60

    const/16 v1, 0x640

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRadiusMeters:Ljava/lang/Integer;

    .line 639
    :cond_60
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceUploadLogsPeriodMin:Ljava/lang/Integer;

    if-nez v1, :cond_61

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceUploadLogsPeriodMin:Ljava/lang/Integer;

    .line 640
    :cond_61
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresUpdateLocationFactor:Ljava/lang/Double;

    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    if-nez v1, :cond_62

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresUpdateLocationFactor:Ljava/lang/Double;

    .line 641
    :cond_62
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceDistantStoresUpdateLocationFactor:Ljava/lang/Double;

    if-nez v1, :cond_63

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceDistantStoresUpdateLocationFactor:Ljava/lang/Double;

    .line 642
    :cond_63
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundModeUpdateLocationFactor:Ljava/lang/Double;

    if-nez v1, :cond_64

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundModeUpdateLocationFactor:Ljava/lang/Double;

    .line 643
    :cond_64
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundMinBatteryPercentage:Ljava/lang/Integer;

    if-nez v1, :cond_65

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundMinBatteryPercentage:Ljava/lang/Integer;

    .line 644
    :cond_65
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresMotionThreshold:Ljava/lang/Integer;

    if-nez v1, :cond_66

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresMotionThreshold:Ljava/lang/Integer;

    .line 645
    :cond_66
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresQuietZoneMeters:Ljava/lang/Integer;

    if-nez v1, :cond_67

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresQuietZoneMeters:Ljava/lang/Integer;

    .line 646
    :cond_67
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresQuietTimeMin:Ljava/lang/Integer;

    if-nez v1, :cond_68

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresQuietTimeMin:Ljava/lang/Integer;

    .line 647
    :cond_68
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresDailyLimit:Ljava/lang/Integer;

    if-nez v1, :cond_69

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresDailyLimit:Ljava/lang/Integer;

    .line 648
    :cond_69
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresPnsDailyLimit:Ljava/lang/Integer;

    if-nez v1, :cond_6a

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresPnsDailyLimit:Ljava/lang/Integer;

    .line 649
    :cond_6a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRecordingRadiusMeters:Ljava/lang/Integer;

    if-nez v1, :cond_6b

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRecordingRadiusMeters:Ljava/lang/Integer;

    .line 650
    :cond_6b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRecordingDurationMin:Ljava/lang/Integer;

    if-nez v1, :cond_6c

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRecordingDurationMin:Ljava/lang/Integer;

    .line 651
    :cond_6c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRecordingQuietTimeMin:Ljava/lang/Integer;

    if-nez v1, :cond_6d

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRecordingQuietTimeMin:Ljava/lang/Integer;

    .line 652
    :cond_6d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRecordingDailyLimitMin:Ljava/lang/Integer;

    if-nez v1, :cond_6e

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresRecordingDailyLimitMin:Ljava/lang/Integer;

    .line 653
    :cond_6e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresWalkinAgeMs:Ljava/lang/Integer;

    if-nez v1, :cond_6f

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresWalkinAgeMs:Ljava/lang/Integer;

    .line 654
    :cond_6f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOnlyAccuracyForBestLocation:Ljava/lang/Boolean;

    if-nez v1, :cond_70

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOnlyAccuracyForBestLocation:Ljava/lang/Boolean;

    .line 655
    :cond_70
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocUseThresholdForAccuracy:Ljava/lang/Boolean;

    if-nez v1, :cond_71

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocUseThresholdForAccuracy:Ljava/lang/Boolean;

    .line 656
    :cond_71
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundTotalLimitMin:Ljava/lang/Integer;

    if-nez v1, :cond_72

    const/16 v1, 0x12c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundTotalLimitMin:Ljava/lang/Integer;

    .line 657
    :cond_72
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundDailyLimitMin:Ljava/lang/Integer;

    if-nez v1, :cond_73

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceBackgroundDailyLimitMin:Ljava/lang/Integer;

    .line 658
    :cond_73
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresResultSetCap:Ljava/lang/Integer;

    if-nez v1, :cond_74

    const/16 v1, 0x1f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresResultSetCap:Ljava/lang/Integer;

    .line 659
    :cond_74
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouGpsTimeout:Ljava/lang/Integer;

    if-nez v1, :cond_75

    const/16 v1, 0xfa0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouGpsTimeout:Ljava/lang/Integer;

    .line 660
    :cond_75
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouRadius:Ljava/lang/Integer;

    if-nez v1, :cond_76

    const/16 v1, 0x1f72

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouRadius:Ljava/lang/Integer;

    .line 661
    :cond_76
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouMaxNumStores:Ljava/lang/Integer;

    if-nez v1, :cond_77

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouMaxNumStores:Ljava/lang/Integer;

    .line 662
    :cond_77
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouDismissTimeout:Ljava/lang/Integer;

    if-nez v1, :cond_78

    const/16 v1, 0x9c4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouDismissTimeout:Ljava/lang/Integer;

    .line 663
    :cond_78
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shopkickVideoUrl:Ljava/lang/String;

    if-nez v1, :cond_79

    const-string v1, "http://34c6ae20831ead1c75ce-0e1e8f0f8f01a9cc58424ad809a1b072.r78.cf1.rackcdn.com/4-0video.mp4"

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shopkickVideoUrl:Ljava/lang/String;

    .line 664
    :cond_79
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->iosGpsAlgorithmVersion:Ljava/lang/Integer;

    const/16 v20, 0x1

    if-nez v1, :cond_7a

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->iosGpsAlgorithmVersion:Ljava/lang/Integer;

    .line 665
    :cond_7a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->iosGpsRefreshInterval:Ljava/lang/Integer;

    if-nez v1, :cond_7b

    const/16 v1, 0xb4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->iosGpsRefreshInterval:Ljava/lang/Integer;

    .line 666
    :cond_7b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardsPickerMinimumDenominationValue:Ljava/lang/Integer;

    if-nez v1, :cond_7c

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardsPickerMinimumDenominationValue:Ljava/lang/Integer;

    .line 668
    :cond_7c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->welcomeForegroundRefreshInterval:Ljava/lang/Integer;

    if-nez v1, :cond_7d

    const/16 v1, 0x384

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->welcomeForegroundRefreshInterval:Ljava/lang/Integer;

    .line 669
    :cond_7d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->oaMapRefreshDistanceTrigger:Ljava/lang/Integer;

    if-nez v1, :cond_7e

    const/16 v1, 0x640

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->oaMapRefreshDistanceTrigger:Ljava/lang/Integer;

    .line 670
    :cond_7e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->oaMapRefreshStalenessTrigger:Ljava/lang/Integer;

    if-nez v1, :cond_7f

    const/16 v1, 0x384

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->oaMapRefreshStalenessTrigger:Ljava/lang/Integer;

    .line 671
    :cond_7f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdRefreshGpsIfTooFar:Ljava/lang/Boolean;

    if-nez v1, :cond_80

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdRefreshGpsIfTooFar:Ljava/lang/Boolean;

    .line 672
    :cond_80
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdRefreshGpsTimeoutSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_81

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdRefreshGpsTimeoutSeconds:Ljava/lang/Integer;

    .line 673
    :cond_81
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdExportFftData:Ljava/lang/Boolean;

    if-nez v1, :cond_82

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdExportFftData:Ljava/lang/Boolean;

    .line 674
    :cond_82
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFftDataReturnRateForFailures:Ljava/lang/Double;

    if-nez v1, :cond_83

    const-wide v21, 0x3f847ae147ae147bL    # 0.01

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFftDataReturnRateForFailures:Ljava/lang/Double;

    .line 675
    :cond_83
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->imageCacheMaxCountIos:Ljava/lang/Integer;

    if-nez v1, :cond_84

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->imageCacheMaxCountIos:Ljava/lang/Integer;

    .line 676
    :cond_84
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouMessageEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_85

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->locatingYouMessageEnabled:Ljava/lang/Boolean;

    .line 677
    :cond_85
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->numTimesToRepeatTapCoachMark:Ljava/lang/Integer;

    if-nez v1, :cond_86

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->numTimesToRepeatTapCoachMark:Ljava/lang/Integer;

    .line 678
    :cond_86
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->numTimesToRepeatSwipeCoachMark:Ljava/lang/Integer;

    if-nez v1, :cond_87

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->numTimesToRepeatSwipeCoachMark:Ljava/lang/Integer;

    .line 679
    :cond_87
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxTimesToDisplayPassbookHookViewPerStoryGroup:Ljava/lang/Integer;

    if-nez v1, :cond_88

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxTimesToDisplayPassbookHookViewPerStoryGroup:Ljava/lang/Integer;

    .line 680
    :cond_88
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinVideoUrl:Ljava/lang/String;

    if-nez v1, :cond_89

    const-string v1, "http://34c6ae20831ead1c75ce-0e1e8f0f8f01a9cc58424ad809a1b072.r78.cf1.rackcdn.com/walkin2.mp4"

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinVideoUrl:Ljava/lang/String;

    .line 682
    :cond_89
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->certificateTokens:Ljava/util/List;

    if-eqz v1, :cond_8a

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_8a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-virtual/range {v21 .. v21}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->postProcess()V

    goto :goto_0

    .line 684
    :cond_8a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->buildUpFirstLevelWarning:Ljava/lang/Integer;

    if-nez v1, :cond_8b

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->buildUpFirstLevelWarning:Ljava/lang/Integer;

    .line 685
    :cond_8b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->buildUpSecondLevelWarning:Ljava/lang/Integer;

    if-nez v1, :cond_8c

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->buildUpSecondLevelWarning:Ljava/lang/Integer;

    .line 686
    :cond_8c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingRadiusLarge:Ljava/lang/Integer;

    if-nez v1, :cond_8d

    const/16 v1, 0x1f4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingRadiusLarge:Ljava/lang/Integer;

    .line 687
    :cond_8d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingRadiusSmall:Ljava/lang/Integer;

    if-nez v1, :cond_8e

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingRadiusSmall:Ljava/lang/Integer;

    .line 688
    :cond_8e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingServerSideMessageCreation:Ljava/lang/Integer;

    if-nez v1, :cond_8f

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingServerSideMessageCreation:Ljava/lang/Integer;

    .line 689
    :cond_8f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingNearbyStoresMinimumBackgroundTimeBeforePnsMs:Ljava/lang/Integer;

    if-nez v1, :cond_90

    const v1, 0x927c0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingNearbyStoresMinimumBackgroundTimeBeforePnsMs:Ljava/lang/Integer;

    .line 690
    :cond_90
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingNearbyStoresQuietTimeMs:Ljava/lang/Integer;

    if-nez v1, :cond_91

    const v1, 0x927c0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingNearbyStoresQuietTimeMs:Ljava/lang/Integer;

    .line 691
    :cond_91
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingPreventSameStoreMessagesPerDay:Ljava/lang/Boolean;

    if-nez v1, :cond_92

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingPreventSameStoreMessagesPerDay:Ljava/lang/Boolean;

    .line 692
    :cond_92
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingNumberConsecutiveGpsFetches:Ljava/lang/Integer;

    if-nez v1, :cond_93

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingNumberConsecutiveGpsFetches:Ljava/lang/Integer;

    .line 693
    :cond_93
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMinimumLocationAccuracy:Ljava/lang/Integer;

    if-nez v1, :cond_94

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMinimumLocationAccuracy:Ljava/lang/Integer;

    .line 694
    :cond_94
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMinimumLocationFreshness:Ljava/lang/Integer;

    if-nez v1, :cond_95

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMinimumLocationFreshness:Ljava/lang/Integer;

    .line 695
    :cond_95
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableSpeedBasedFiltering:Ljava/lang/Boolean;

    if-nez v1, :cond_96

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableSpeedBasedFiltering:Ljava/lang/Boolean;

    .line 696
    :cond_96
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableVerboseMode:Ljava/lang/Boolean;

    if-nez v1, :cond_97

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableVerboseMode:Ljava/lang/Boolean;

    .line 697
    :cond_97
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingFastUpdateIntervalMs:Ljava/lang/Integer;

    if-nez v1, :cond_98

    const v1, 0xea60

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingFastUpdateIntervalMs:Ljava/lang/Integer;

    .line 698
    :cond_98
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMaxFastUpdates:Ljava/lang/Integer;

    if-nez v1, :cond_99

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMaxFastUpdates:Ljava/lang/Integer;

    .line 699
    :cond_99
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableGpsLargeRadius:Ljava/lang/Boolean;

    if-nez v1, :cond_9a

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableGpsLargeRadius:Ljava/lang/Boolean;

    .line 700
    :cond_9a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableNetworkLargeRadius:Ljava/lang/Boolean;

    if-nez v1, :cond_9b

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableNetworkLargeRadius:Ljava/lang/Boolean;

    .line 701
    :cond_9b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnablePassiveLargeRadius:Ljava/lang/Boolean;

    if-nez v1, :cond_9c

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnablePassiveLargeRadius:Ljava/lang/Boolean;

    .line 702
    :cond_9c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableGpsSmallRadius:Ljava/lang/Boolean;

    if-nez v1, :cond_9d

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableGpsSmallRadius:Ljava/lang/Boolean;

    .line 703
    :cond_9d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableNetworkSmallRadius:Ljava/lang/Boolean;

    if-nez v1, :cond_9e

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableNetworkSmallRadius:Ljava/lang/Boolean;

    .line 704
    :cond_9e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnablePassiveSmallRadius:Ljava/lang/Boolean;

    if-nez v1, :cond_9f

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnablePassiveSmallRadius:Ljava/lang/Boolean;

    .line 705
    :cond_9f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnablePnsMessages:Ljava/lang/Boolean;

    if-nez v1, :cond_a0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnablePnsMessages:Ljava/lang/Boolean;

    .line 706
    :cond_a0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableLocalAlerts:Ljava/lang/Boolean;

    if-nez v1, :cond_a1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableLocalAlerts:Ljava/lang/Boolean;

    .line 707
    :cond_a1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rapidGpsStartupEnable:Ljava/lang/Boolean;

    if-nez v1, :cond_a2

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rapidGpsStartupEnable:Ljava/lang/Boolean;

    .line 708
    :cond_a2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rapidGpsMaxSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_a3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rapidGpsMaxSeconds:Ljava/lang/Integer;

    .line 709
    :cond_a3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableReportWalkinIssue:Ljava/lang/Boolean;

    if-nez v1, :cond_a4

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableReportWalkinIssue:Ljava/lang/Boolean;

    .line 710
    :cond_a4
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMaxUniqueNotificationAlarmIds:Ljava/lang/Integer;

    if-nez v1, :cond_a5

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMaxUniqueNotificationAlarmIds:Ljava/lang/Integer;

    .line 711
    :cond_a5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingLogServerReqRespOnClient:Ljava/lang/Boolean;

    if-nez v1, :cond_a6

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingLogServerReqRespOnClient:Ljava/lang/Boolean;

    .line 712
    :cond_a6
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingRefreshStateIntervalMs:Ljava/lang/Integer;

    if-nez v1, :cond_a7

    const v1, 0x5265c00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingRefreshStateIntervalMs:Ljava/lang/Integer;

    .line 713
    :cond_a7
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingUseAccuracyAsRadiusExtender:Ljava/lang/Boolean;

    if-nez v1, :cond_a8

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingUseAccuracyAsRadiusExtender:Ljava/lang/Boolean;

    .line 714
    :cond_a8
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savedOffersPageSize:Ljava/lang/Integer;

    if-nez v1, :cond_a9

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savedOffersPageSize:Ljava/lang/Integer;

    .line 715
    :cond_a9
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingIosRegionRadius:Ljava/lang/Integer;

    if-nez v1, :cond_aa

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingIosRegionRadius:Ljava/lang/Integer;

    .line 716
    :cond_aa
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingIosSignificantLocationRadius:Ljava/lang/Integer;

    if-nez v1, :cond_ab

    const/16 v1, 0x1f72

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingIosSignificantLocationRadius:Ljava/lang/Integer;

    .line 717
    :cond_ab
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingNotificationExpiryTimeMs:Ljava/lang/Integer;

    if-nez v1, :cond_ac

    const v1, 0x1b7740

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingNotificationExpiryTimeMs:Ljava/lang/Integer;

    .line 718
    :cond_ac
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pullDownFaveCoachMarkShowCount:Ljava/lang/Integer;

    if-nez v1, :cond_ad

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pullDownFaveCoachMarkShowCount:Ljava/lang/Integer;

    .line 719
    :cond_ad
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->gpsStalenessIfNoTime:Ljava/lang/Double;

    if-nez v1, :cond_ae

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->gpsStalenessIfNoTime:Ljava/lang/Double;

    .line 720
    :cond_ae
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savingVideoUrl:Ljava/lang/String;

    if-nez v1, :cond_af

    const-string v1, "http://34c6ae20831ead1c75ce-0e1e8f0f8f01a9cc58424ad809a1b072.r78.cf1.rackcdn.com/saving_v3_5.mp4"

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savingVideoUrl:Ljava/lang/String;

    .line 721
    :cond_af
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showNextLookbookToast:Ljava/lang/Boolean;

    if-nez v1, :cond_b0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showNextLookbookToast:Ljava/lang/Boolean;

    .line 722
    :cond_b0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingDisableSignificantLocationUpdate:Ljava/lang/Boolean;

    if-nez v1, :cond_b1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingDisableSignificantLocationUpdate:Ljava/lang/Boolean;

    .line 723
    :cond_b1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableMessagingWhenBackgroundedWithinRegion:Ljava/lang/Boolean;

    if-nez v1, :cond_b2

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingEnableMessagingWhenBackgroundedWithinRegion:Ljava/lang/Boolean;

    .line 724
    :cond_b2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMaxMonitoringRegions:Ljava/lang/Integer;

    if-nez v1, :cond_b3

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMaxMonitoringRegions:Ljava/lang/Integer;

    .line 725
    :cond_b3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheMaxNumItems:Ljava/lang/Integer;

    if-nez v1, :cond_b4

    const/16 v1, 0x5dc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheMaxNumItems:Ljava/lang/Integer;

    .line 726
    :cond_b4
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheMaxBytes:Ljava/lang/Integer;

    if-nez v1, :cond_b5

    const/high16 v1, 0x4000000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheMaxBytes:Ljava/lang/Integer;

    .line 727
    :cond_b5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingHeartbeatIntervalMs:Ljava/lang/Integer;

    if-nez v1, :cond_b6

    const v1, 0x927c0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingHeartbeatIntervalMs:Ljava/lang/Integer;

    .line 728
    :cond_b6
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->filterStaleLocationFixes:Ljava/lang/Boolean;

    if-nez v1, :cond_b7

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->filterStaleLocationFixes:Ljava/lang/Boolean;

    .line 729
    :cond_b7
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->supportOptionsToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v1, :cond_b8

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->postProcess()V

    .line 730
    :cond_b8
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->topItemsPageSize:Ljava/lang/Integer;

    if-nez v1, :cond_b9

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->topItemsPageSize:Ljava/lang/Integer;

    .line 732
    :cond_b9
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->userListTagsTitle:Ljava/lang/String;

    if-nez v1, :cond_ba

    const-string v1, "Tag your collections for better recommendations."

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->userListTagsTitle:Ljava/lang/String;

    .line 733
    :cond_ba
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->userListTilesPageSize:Ljava/lang/Integer;

    if-nez v1, :cond_bb

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->userListTilesPageSize:Ljava/lang/Integer;

    .line 734
    :cond_bb
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savedUserBookTilesPageSize:Ljava/lang/Integer;

    if-nez v1, :cond_bc

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savedUserBookTilesPageSize:Ljava/lang/Integer;

    .line 735
    :cond_bc
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savedBooksPageSize:Ljava/lang/Integer;

    if-nez v1, :cond_bd

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savedBooksPageSize:Ljava/lang/Integer;

    .line 736
    :cond_bd
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showExperimentalLikeButton:Ljava/lang/Boolean;

    if-nez v1, :cond_be

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showExperimentalLikeButton:Ljava/lang/Boolean;

    .line 739
    :cond_be
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->facebookPostWalkinFeatureEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_bf

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->facebookPostWalkinFeatureEnabled:Ljava/lang/Boolean;

    .line 740
    :cond_bf
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->defaultFacebookPostWalkinValue:Ljava/lang/Boolean;

    if-nez v1, :cond_c0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->defaultFacebookPostWalkinValue:Ljava/lang/Boolean;

    .line 741
    :cond_c0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientLogBatchSize:Ljava/lang/Integer;

    if-nez v1, :cond_c1

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientLogBatchSize:Ljava/lang/Integer;

    .line 742
    :cond_c1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offerCardDeckFetchSize:Ljava/lang/Integer;

    if-nez v1, :cond_c2

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offerCardDeckFetchSize:Ljava/lang/Integer;

    .line 743
    :cond_c2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offerCardDeckOffersRemainingBeforeNextFetch:Ljava/lang/Integer;

    if-nez v1, :cond_c3

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offerCardDeckOffersRemainingBeforeNextFetch:Ljava/lang/Integer;

    .line 744
    :cond_c3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offersDataSourceOfferProxyCacheSize:Ljava/lang/Integer;

    if-nez v1, :cond_c4

    const/16 v1, 0x190

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offersDataSourceOfferProxyCacheSize:Ljava/lang/Integer;

    .line 745
    :cond_c4
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->apiMemoryCacheSize:Ljava/lang/Integer;

    if-nez v1, :cond_c5

    const/16 v1, 0x12c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->apiMemoryCacheSize:Ljava/lang/Integer;

    .line 746
    :cond_c5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenFeedTilesRemainingBeforeNextFetch:Ljava/lang/Integer;

    if-nez v1, :cond_c6

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenFeedTilesRemainingBeforeNextFetch:Ljava/lang/Integer;

    .line 747
    :cond_c6
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenFeedTilesPageSize:Ljava/lang/Integer;

    if-nez v1, :cond_c7

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenFeedTilesPageSize:Ljava/lang/Integer;

    .line 748
    :cond_c7
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineShowReminderIntervalSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_c8

    const/16 v1, 0x258

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineShowReminderIntervalSeconds:Ljava/lang/Integer;

    .line 749
    :cond_c8
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showMicrophonePermissionInFeed:Ljava/lang/Boolean;

    if-nez v1, :cond_c9

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showMicrophonePermissionInFeed:Ljava/lang/Boolean;

    .line 750
    :cond_c9
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->supportUrl:Ljava/lang/String;

    if-nez v1, :cond_ca

    const-string v1, "https://app.shopkick.com/shopkick/v1/support/support_url"

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->supportUrl:Ljava/lang/String;

    .line 751
    :cond_ca
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showMicPermissionReminder:Ljava/lang/Boolean;

    if-nez v1, :cond_cb

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showMicPermissionReminder:Ljava/lang/Boolean;

    .line 752
    :cond_cb
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->feedPrefetchForward:Ljava/lang/Integer;

    if-nez v1, :cond_cc

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->feedPrefetchForward:Ljava/lang/Integer;

    .line 753
    :cond_cc
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->feedPrefetchBackward:Ljava/lang/Integer;

    if-nez v1, :cond_cd

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->feedPrefetchBackward:Ljava/lang/Integer;

    .line 754
    :cond_cd
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->contactPickerSizeLimitBeforeStoppingRecommendation:Ljava/lang/Integer;

    if-nez v1, :cond_ce

    const/16 v1, 0x4e20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->contactPickerSizeLimitBeforeStoppingRecommendation:Ljava/lang/Integer;

    .line 755
    :cond_ce
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheSize:Ljava/lang/Integer;

    if-nez v1, :cond_cf

    const/high16 v1, 0x400000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheSize:Ljava/lang/Integer;

    .line 756
    :cond_cf
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMaxSignalStrengthGap:Ljava/lang/Integer;

    if-nez v1, :cond_d0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMaxSignalStrengthGap:Ljava/lang/Integer;

    .line 757
    :cond_d0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleScanReportInterval:Ljava/lang/Double;

    if-nez v1, :cond_d1

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleScanReportInterval:Ljava/lang/Double;

    .line 758
    :cond_d1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMinDetectionStrength:Ljava/lang/Integer;

    if-nez v1, :cond_d2

    const/16 v1, -0x50

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMinDetectionStrength:Ljava/lang/Integer;

    .line 759
    :cond_d2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleEnableMessagingForeground:Ljava/lang/Boolean;

    if-nez v1, :cond_d3

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleEnableMessagingForeground:Ljava/lang/Boolean;

    .line 760
    :cond_d3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleEnableMessagingBackground:Ljava/lang/Boolean;

    if-nez v1, :cond_d4

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleEnableMessagingBackground:Ljava/lang/Boolean;

    .line 761
    :cond_d4
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleLoggingLevel:Ljava/lang/Integer;

    if-nez v1, :cond_d5

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleLoggingLevel:Ljava/lang/Integer;

    .line 762
    :cond_d5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btlePermissionRequest:Ljava/lang/Boolean;

    if-nez v1, :cond_d6

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btlePermissionRequest:Ljava/lang/Boolean;

    .line 763
    :cond_d6
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMaxMessagesPerDay:Ljava/lang/Integer;

    if-nez v1, :cond_d7

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMaxMessagesPerDay:Ljava/lang/Integer;

    .line 764
    :cond_d7
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleRefreshStateIntervalMs:Ljava/lang/Integer;

    if-nez v1, :cond_d8

    const v1, 0x5265c00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleRefreshStateIntervalMs:Ljava/lang/Integer;

    .line 765
    :cond_d8
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleClearStateOnBackground:Ljava/lang/Boolean;

    if-nez v1, :cond_d9

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleClearStateOnBackground:Ljava/lang/Boolean;

    .line 766
    :cond_d9
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMinGapBetweenMessagesMs:Ljava/lang/Integer;

    if-nez v1, :cond_da

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMinGapBetweenMessagesMs:Ljava/lang/Integer;

    .line 767
    :cond_da
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btlePreventSameStoreMessagePerDay:Ljava/lang/Boolean;

    if-nez v1, :cond_db

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btlePreventSameStoreMessagePerDay:Ljava/lang/Boolean;

    .line 768
    :cond_db
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleBlanketDisable:Ljava/lang/Boolean;

    if-nez v1, :cond_dc

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleBlanketDisable:Ljava/lang/Boolean;

    .line 769
    :cond_dc
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeFeedForegroundRefreshInterval:Ljava/lang/Integer;

    if-nez v1, :cond_dd

    const/16 v1, 0x5460

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeFeedForegroundRefreshInterval:Ljava/lang/Integer;

    .line 770
    :cond_dd
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMinGapBetweenMessagesForSameBeaconMs:Ljava/lang/Integer;

    if-nez v1, :cond_de

    const v1, 0xea60

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMinGapBetweenMessagesForSameBeaconMs:Ljava/lang/Integer;

    .line 771
    :cond_de
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleForceOfflineMode:Ljava/lang/Boolean;

    if-nez v1, :cond_df

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleForceOfflineMode:Ljava/lang/Boolean;

    .line 772
    :cond_df
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingDynamicUpdateLocationChangeSignficanceMetric:Ljava/lang/Double;

    if-nez v1, :cond_e0

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingDynamicUpdateLocationChangeSignficanceMetric:Ljava/lang/Double;

    .line 773
    :cond_e0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingDynamicUpdateMinimumAttemptIntervalMinutes:Ljava/lang/Double;

    if-nez v1, :cond_e1

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingDynamicUpdateMinimumAttemptIntervalMinutes:Ljava/lang/Double;

    .line 774
    :cond_e1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingDynamicUpdateMinimumLocationAccuracy:Ljava/lang/Integer;

    if-nez v1, :cond_e2

    const/16 v1, 0xbb8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingDynamicUpdateMinimumLocationAccuracy:Ljava/lang/Integer;

    .line 775
    :cond_e2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showSeeMoreProductsOverlay:Ljava/lang/Boolean;

    if-nez v1, :cond_e3

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showSeeMoreProductsOverlay:Ljava/lang/Boolean;

    .line 776
    :cond_e3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->seeMoreProductsOverlaysToShow:Ljava/lang/Integer;

    if-nez v1, :cond_e4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->seeMoreProductsOverlaysToShow:Ljava/lang/Integer;

    .line 777
    :cond_e4
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLookbookHistoryLength:Ljava/lang/Integer;

    if-nez v1, :cond_e5

    const/16 v1, 0x12c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLookbookHistoryLength:Ljava/lang/Integer;

    .line 778
    :cond_e5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->lookbookHistoryTrimmedLength:Ljava/lang/Integer;

    if-nez v1, :cond_e6

    const/16 v1, 0xfa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->lookbookHistoryTrimmedLength:Ljava/lang/Integer;

    .line 779
    :cond_e6
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useSdCardForDiskCache:Ljava/lang/Boolean;

    if-nez v1, :cond_e7

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useSdCardForDiskCache:Ljava/lang/Boolean;

    .line 780
    :cond_e7
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->allowLookbookExpandInFeed:Ljava/lang/Boolean;

    if-nez v1, :cond_e8

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->allowLookbookExpandInFeed:Ljava/lang/Boolean;

    .line 781
    :cond_e8
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->minGpsAccuracyForLoiterReading:Ljava/lang/Integer;

    if-nez v1, :cond_e9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->minGpsAccuracyForLoiterReading:Ljava/lang/Integer;

    .line 782
    :cond_e9
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->loiterRadiusMultiplierForTracking:Ljava/lang/Double;

    if-nez v1, :cond_ea

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->loiterRadiusMultiplierForTracking:Ljava/lang/Double;

    .line 783
    :cond_ea
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->trackingRadiusRefreshInterval:Ljava/lang/Double;

    if-nez v1, :cond_eb

    const-wide/high16 v21, 0x403e000000000000L    # 30.0

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->trackingRadiusRefreshInterval:Ljava/lang/Double;

    .line 784
    :cond_eb
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->loiterTimeBeforeDisplay:Ljava/lang/Double;

    if-nez v1, :cond_ec

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->loiterTimeBeforeDisplay:Ljava/lang/Double;

    .line 785
    :cond_ec
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->firstLoiterReadingTimeout:Ljava/lang/Double;

    if-nez v1, :cond_ed

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->firstLoiterReadingTimeout:Ljava/lang/Double;

    .line 786
    :cond_ed
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->minGpsReadingsDuringLoiter:Ljava/lang/Integer;

    if-nez v1, :cond_ee

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->minGpsReadingsDuringLoiter:Ljava/lang/Integer;

    .line 787
    :cond_ee
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableGpsCheckins:Ljava/lang/Boolean;

    if-nez v1, :cond_ef

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableGpsCheckins:Ljava/lang/Boolean;

    .line 788
    :cond_ef
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxOutOfBoundsReadingsAllowed:Ljava/lang/Integer;

    if-nez v1, :cond_f0

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxOutOfBoundsReadingsAllowed:Ljava/lang/Integer;

    .line 789
    :cond_f0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleScanReportIntervalBackground:Ljava/lang/Double;

    if-nez v1, :cond_f1

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleScanReportIntervalBackground:Ljava/lang/Double;

    .line 790
    :cond_f1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleEnableMonitorSignificantLocationChange:Ljava/lang/Boolean;

    if-nez v1, :cond_f2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleEnableMonitorSignificantLocationChange:Ljava/lang/Boolean;

    .line 791
    :cond_f2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMinimumLocationFreshness:Ljava/lang/Integer;

    if-nez v1, :cond_f3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleMinimumLocationFreshness:Ljava/lang/Integer;

    .line 792
    :cond_f3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenKickCountEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_f4

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenKickCountEnabled:Ljava/lang/Boolean;

    .line 793
    :cond_f4
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->displayInStoreTabbedUi:Ljava/lang/Boolean;

    if-nez v1, :cond_f5

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->displayInStoreTabbedUi:Ljava/lang/Boolean;

    .line 794
    :cond_f5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->alwaysInStoreFeed:Ljava/lang/Boolean;

    if-nez v1, :cond_f6

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->alwaysInStoreFeed:Ljava/lang/Boolean;

    .line 795
    :cond_f6
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreMemoryCacheMaxBytes:Ljava/lang/Integer;

    if-nez v1, :cond_f7

    const/high16 v1, 0x40000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreMemoryCacheMaxBytes:Ljava/lang/Integer;

    .line 796
    :cond_f7
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreRetryLimit:Ljava/lang/Integer;

    if-nez v1, :cond_f8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreRetryLimit:Ljava/lang/Integer;

    .line 797
    :cond_f8
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreRetryIntervalSeconds:Ljava/lang/Double;

    if-nez v1, :cond_f9

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreRetryIntervalSeconds:Ljava/lang/Double;

    .line 798
    :cond_f9
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->daysBetweenAddressBookRefresh:Ljava/lang/Integer;

    if-nez v1, :cond_fa

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->daysBetweenAddressBookRefresh:Ljava/lang/Integer;

    .line 799
    :cond_fa
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreMemoryCacheSize:Ljava/lang/Integer;

    if-nez v1, :cond_fb

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreMemoryCacheSize:Ljava/lang/Integer;

    .line 800
    :cond_fb
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreSearchNeighboringBuckets:Ljava/lang/Integer;

    if-nez v1, :cond_fc

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreSearchNeighboringBuckets:Ljava/lang/Integer;

    .line 801
    :cond_fc
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreBtleBucketSizeMeters:Ljava/lang/Integer;

    if-nez v1, :cond_fd

    const v1, 0xc350

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreBtleBucketSizeMeters:Ljava/lang/Integer;

    .line 802
    :cond_fd
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreBtleBucketDecimalPrecision:Ljava/lang/Integer;

    if-nez v1, :cond_fe

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreBtleBucketDecimalPrecision:Ljava/lang/Integer;

    .line 803
    :cond_fe
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->daysBetweenFacebookContactsRefresh:Ljava/lang/Integer;

    if-nez v1, :cond_ff

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->daysBetweenFacebookContactsRefresh:Ljava/lang/Integer;

    .line 805
    :cond_ff
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreBtleSyncOnSessionStart:Ljava/lang/Integer;

    if-nez v1, :cond_100

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreBtleSyncOnSessionStart:Ljava/lang/Integer;

    .line 806
    :cond_100
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardRedemptionMaxPolls:Ljava/lang/Integer;

    if-nez v1, :cond_101

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardRedemptionMaxPolls:Ljava/lang/Integer;

    .line 807
    :cond_101
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardRedemptionPollingInterval:Ljava/lang/Integer;

    if-nez v1, :cond_102

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardRedemptionPollingInterval:Ljava/lang/Integer;

    .line 808
    :cond_102
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardRedemptionPollingIntervalMultiplier:Ljava/lang/Integer;

    if-nez v1, :cond_103

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardRedemptionPollingIntervalMultiplier:Ljava/lang/Integer;

    .line 809
    :cond_103
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreMinSecondsBetweenResyncs:Ljava/lang/Double;

    if-nez v1, :cond_104

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreMinSecondsBetweenResyncs:Ljava/lang/Double;

    .line 810
    :cond_104
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldShowGpsPermissionUi:Ljava/lang/Boolean;

    if-nez v1, :cond_105

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldShowGpsPermissionUi:Ljava/lang/Boolean;

    .line 811
    :cond_105
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->onboardingVersion:Ljava/lang/Integer;

    if-nez v1, :cond_106

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->onboardingVersion:Ljava/lang/Integer;

    .line 812
    :cond_106
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->promptAppRaterAfterRewardRedemption:Ljava/lang/Boolean;

    if-nez v1, :cond_107

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->promptAppRaterAfterRewardRedemption:Ljava/lang/Boolean;

    .line 813
    :cond_107
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shareOverlayDelayOverride:Ljava/lang/Double;

    if-nez v1, :cond_108

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shareOverlayDelayOverride:Ljava/lang/Double;

    .line 814
    :cond_108
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientKillSwitchForInvites:Ljava/lang/Boolean;

    if-nez v1, :cond_109

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientKillSwitchForInvites:Ljava/lang/Boolean;

    .line 815
    :cond_109
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleManuallyUpdateLocationIfUnavailable:Ljava/lang/Integer;

    if-nez v1, :cond_10a

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleManuallyUpdateLocationIfUnavailable:Ljava/lang/Integer;

    .line 816
    :cond_10a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enforceHorizontalLookbooks:Ljava/lang/Boolean;

    if-nez v1, :cond_10b

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enforceHorizontalLookbooks:Ljava/lang/Boolean;

    .line 817
    :cond_10b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxOfflineUnusedRewards:Ljava/lang/Integer;

    if-nez v1, :cond_10c

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxOfflineUnusedRewards:Ljava/lang/Integer;

    .line 818
    :cond_10c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    if-eqz v1, :cond_10d

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->postProcess()V

    .line 819
    :cond_10d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->promoCarouselAutoAdvanceInitialInterval:Ljava/lang/Double;

    if-nez v1, :cond_10e

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->promoCarouselAutoAdvanceInitialInterval:Ljava/lang/Double;

    .line 820
    :cond_10e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->promoCarouselAutoAdvanceInterval:Ljava/lang/Double;

    if-nez v1, :cond_10f

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->promoCarouselAutoAdvanceInterval:Ljava/lang/Double;

    .line 821
    :cond_10f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useStoreDetailsScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_110

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useStoreDetailsScreen:Ljava/lang/Boolean;

    .line 822
    :cond_110
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLinkedCardsVisa:Ljava/lang/Integer;

    if-nez v1, :cond_111

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLinkedCardsVisa:Ljava/lang/Integer;

    .line 823
    :cond_111
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLinkedCardsMastercard:Ljava/lang/Integer;

    if-nez v1, :cond_112

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLinkedCardsMastercard:Ljava/lang/Integer;

    .line 824
    :cond_112
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableGeofencingWhenWifiIsDisabled:Ljava/lang/Boolean;

    if-nez v1, :cond_113

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableGeofencingWhenWifiIsDisabled:Ljava/lang/Boolean;

    .line 825
    :cond_113
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingUseExperimentalGeofencingAlgorithm:Ljava/lang/Boolean;

    if-nez v1, :cond_114

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingUseExperimentalGeofencingAlgorithm:Ljava/lang/Boolean;

    .line 826
    :cond_114
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dealDetailsV2Enabled:Ljava/lang/Boolean;

    if-nez v1, :cond_115

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dealDetailsV2Enabled:Ljava/lang/Boolean;

    .line 827
    :cond_115
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableScanditCameraStandby:Ljava/lang/Boolean;

    if-nez v1, :cond_116

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableScanditCameraStandby:Ljava/lang/Boolean;

    .line 828
    :cond_116
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savedOffersV3ApiEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_117

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->savedOffersV3ApiEnabled:Ljava/lang/Boolean;

    .line 829
    :cond_117
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMeasureVelocity:Ljava/lang/Boolean;

    if-nez v1, :cond_118

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMeasureVelocity:Ljava/lang/Boolean;

    .line 830
    :cond_118
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->visitMonitoringLoggingEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_119

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->visitMonitoringLoggingEnabled:Ljava/lang/Boolean;

    .line 831
    :cond_119
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideProfilePrivacyCheckbox:Ljava/lang/Boolean;

    if-nez v1, :cond_11a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideProfilePrivacyCheckbox:Ljava/lang/Boolean;

    .line 832
    :cond_11a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideEmailFieldOnPhoneZipScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_11b

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideEmailFieldOnPhoneZipScreen:Ljava/lang/Boolean;

    .line 833
    :cond_11b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideZipCodeFieldOnPhoneZipScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_11c

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideZipCodeFieldOnPhoneZipScreen:Ljava/lang/Boolean;

    .line 834
    :cond_11c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxConcurrentTrackingUrlRequests:Ljava/lang/Integer;

    if-nez v1, :cond_11d

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxConcurrentTrackingUrlRequests:Ljava/lang/Integer;

    .line 835
    :cond_11d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePerformanceLogging:Ljava/lang/Boolean;

    if-nez v1, :cond_11e

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePerformanceLogging:Ljava/lang/Boolean;

    .line 836
    :cond_11e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableTrackingUrls:Ljava/lang/Boolean;

    if-nez v1, :cond_11f

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableTrackingUrls:Ljava/lang/Boolean;

    .line 837
    :cond_11f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useScansForLocationV2:Ljava/lang/Boolean;

    if-nez v1, :cond_120

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useScansForLocationV2:Ljava/lang/Boolean;

    .line 838
    :cond_120
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->defaultEnableProximityNotifications:Ljava/lang/Boolean;

    if-nez v1, :cond_121

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->defaultEnableProximityNotifications:Ljava/lang/Boolean;

    .line 839
    :cond_121
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->alwaysUseHttps:Ljava/lang/Boolean;

    if-nez v1, :cond_122

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->alwaysUseHttps:Ljava/lang/Boolean;

    .line 840
    :cond_122
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->allow2XImageFetching:Ljava/lang/Boolean;

    if-nez v1, :cond_123

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->allow2XImageFetching:Ljava/lang/Boolean;

    .line 841
    :cond_123
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useProductDetailsScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_124

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useProductDetailsScreen:Ljava/lang/Boolean;

    .line 842
    :cond_124
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingIosUseVisitsMonitoring:Ljava/lang/Boolean;

    if-nez v1, :cond_125

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingIosUseVisitsMonitoring:Ljava/lang/Boolean;

    .line 843
    :cond_125
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingVisitsMaxDelay:Ljava/lang/Integer;

    if-nez v1, :cond_126

    const/16 v1, 0x258

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingVisitsMaxDelay:Ljava/lang/Integer;

    .line 844
    :cond_126
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableNetworkRequestTimeoutLogging:Ljava/lang/Boolean;

    if-nez v1, :cond_127

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableNetworkRequestTimeoutLogging:Ljava/lang/Boolean;

    .line 845
    :cond_127
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageResponseTimeLogging:Ljava/lang/Boolean;

    if-nez v1, :cond_128

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageResponseTimeLogging:Ljava/lang/Boolean;

    .line 846
    :cond_128
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->imageResponseTimeLoggingSamplePercentage:Ljava/lang/Integer;

    if-nez v1, :cond_129

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->imageResponseTimeLoggingSamplePercentage:Ljava/lang/Integer;

    .line 847
    :cond_129
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideKicksJumpAnimation:Ljava/lang/Boolean;

    if-nez v1, :cond_12a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideKicksJumpAnimation:Ljava/lang/Boolean;

    .line 848
    :cond_12a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableKicksForPurchasesV2:Ljava/lang/Boolean;

    if-nez v1, :cond_12b

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableKicksForPurchasesV2:Ljava/lang/Boolean;

    .line 849
    :cond_12b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->iosReceiptScanImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    if-eqz v1, :cond_12c

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->postProcess()V

    .line 850
    :cond_12c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->androidReceiptScanImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    if-eqz v1, :cond_12d

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->postProcess()V

    .line 851
    :cond_12d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableReceiptScan:Ljava/lang/Boolean;

    if-nez v1, :cond_12e

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableReceiptScan:Ljava/lang/Boolean;

    .line 852
    :cond_12e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    if-nez v1, :cond_12f

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    .line 853
    :cond_12f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNearbyLocationsForPresence:Ljava/lang/Boolean;

    if-nez v1, :cond_130

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNearbyLocationsForPresence:Ljava/lang/Boolean;

    .line 854
    :cond_130
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableIndividualCardManagement:Ljava/lang/Boolean;

    if-nez v1, :cond_131

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableIndividualCardManagement:Ljava/lang/Boolean;

    .line 855
    :cond_131
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showOldCopyForBestBuyRulesScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_132

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showOldCopyForBestBuyRulesScreen:Ljava/lang/Boolean;

    .line 856
    :cond_132
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showRewardDetailsV2Screen:Ljava/lang/Boolean;

    if-nez v1, :cond_133

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showRewardDetailsV2Screen:Ljava/lang/Boolean;

    .line 857
    :cond_133
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableNewKicksActivityScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_134

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableNewKicksActivityScreen:Ljava/lang/Boolean;

    .line 858
    :cond_134
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOldBcPostEnrollmentView:Ljava/lang/Boolean;

    if-nez v1, :cond_135

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOldBcPostEnrollmentView:Ljava/lang/Boolean;

    .line 859
    :cond_135
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useLargerK4pLayoutForBestBuy:Ljava/lang/Boolean;

    if-nez v1, :cond_136

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useLargerK4pLayoutForBestBuy:Ljava/lang/Boolean;

    .line 860
    :cond_136
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleScanningInAndroid:Ljava/lang/Boolean;

    if-nez v1, :cond_137

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->btleScanningInAndroid:Ljava/lang/Boolean;

    .line 861
    :cond_137
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNewSavingAndStoryCards:Ljava/lang/Boolean;

    if-nez v1, :cond_138

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNewSavingAndStoryCards:Ljava/lang/Boolean;

    .line 862
    :cond_138
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNewCollectionsScreenApi:Ljava/lang/Boolean;

    if-nez v1, :cond_139

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNewCollectionsScreenApi:Ljava/lang/Boolean;

    .line 863
    :cond_139
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldShowFbInviteModal:Ljava/lang/Boolean;

    if-nez v1, :cond_13a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldShowFbInviteModal:Ljava/lang/Boolean;

    .line 864
    :cond_13a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldShowFbMessenger:Ljava/lang/Boolean;

    if-nez v1, :cond_13b

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldShowFbMessenger:Ljava/lang/Boolean;

    .line 865
    :cond_13b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableDevLogging:Ljava/lang/Boolean;

    if-nez v1, :cond_13c

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableDevLogging:Ljava/lang/Boolean;

    .line 866
    :cond_13c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableDealSharing:Ljava/lang/Boolean;

    if-nez v1, :cond_13d

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableDealSharing:Ljava/lang/Boolean;

    .line 867
    :cond_13d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skuLevelReceiptScanRulesEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_13e

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skuLevelReceiptScanRulesEnabled:Ljava/lang/Boolean;

    .line 868
    :cond_13e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableMultiSignalWalkins:Ljava/lang/Boolean;

    if-nez v1, :cond_13f

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableMultiSignalWalkins:Ljava/lang/Boolean;

    .line 869
    :cond_13f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->bbyBarcodeFlowRequiresRegistration:Ljava/lang/Boolean;

    if-nez v1, :cond_140

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->bbyBarcodeFlowRequiresRegistration:Ljava/lang/Boolean;

    .line 870
    :cond_140
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->bbyBarcodeFlowShouldShowTwoBarcodes:Ljava/lang/Boolean;

    if-nez v1, :cond_141

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->bbyBarcodeFlowShouldShowTwoBarcodes:Ljava/lang/Boolean;

    .line 871
    :cond_141
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOfflineFramework:Ljava/lang/Boolean;

    if-nez v1, :cond_142

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOfflineFramework:Ljava/lang/Boolean;

    .line 872
    :cond_142
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePinchToZoomOnScanV3:Ljava/lang/Boolean;

    if-nez v1, :cond_143

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePinchToZoomOnScanV3:Ljava/lang/Boolean;

    .line 873
    :cond_143
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxScanZoomScaleFactor:Ljava/lang/Double;

    if-nez v1, :cond_144

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxScanZoomScaleFactor:Ljava/lang/Double;

    .line 874
    :cond_144
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOldNonActivityBncFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_145

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOldNonActivityBncFlow:Ljava/lang/Boolean;

    .line 875
    :cond_145
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showScanTileReceiptKicksInBlue:Ljava/lang/Boolean;

    if-nez v1, :cond_146

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showScanTileReceiptKicksInBlue:Ljava/lang/Boolean;

    .line 876
    :cond_146
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dealsWithProductsEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_147

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dealsWithProductsEnabled:Ljava/lang/Boolean;

    .line 877
    :cond_147
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useShortWalkinTextAnimation:Ljava/lang/Boolean;

    if-nez v1, :cond_148

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useShortWalkinTextAnimation:Ljava/lang/Boolean;

    .line 878
    :cond_148
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->blockedDuplicateCodeRetryDelayMs:Ljava/lang/Integer;

    if-nez v1, :cond_149

    const/16 v1, 0xbb8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->blockedDuplicateCodeRetryDelayMs:Ljava/lang/Integer;

    .line 879
    :cond_149
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableKicksForRetailerReceipts:Ljava/lang/Boolean;

    if-nez v1, :cond_14a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableKicksForRetailerReceipts:Ljava/lang/Boolean;

    .line 880
    :cond_14a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNetworkCacheForIosImageCaching:Ljava/lang/Boolean;

    if-nez v1, :cond_14b

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNetworkCacheForIosImageCaching:Ljava/lang/Boolean;

    .line 881
    :cond_14b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useGpsFailback:Ljava/lang/Boolean;

    if-nez v1, :cond_14c

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useGpsFailback:Ljava/lang/Boolean;

    .line 882
    :cond_14c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNonReceiptScanningStrings:Ljava/lang/Boolean;

    if-nez v1, :cond_14d

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNonReceiptScanningStrings:Ljava/lang/Boolean;

    .line 883
    :cond_14d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

    if-nez v1, :cond_14e

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

    .line 884
    :cond_14e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOfflineScan:Ljava/lang/Boolean;

    if-nez v1, :cond_14f

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOfflineScan:Ljava/lang/Boolean;

    .line 885
    :cond_14f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skipProductSelectorScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_150

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skipProductSelectorScreen:Ljava/lang/Boolean;

    .line 886
    :cond_150
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->scanningMinimumIntervalSec:Ljava/lang/Integer;

    if-nez v1, :cond_151

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->scanningMinimumIntervalSec:Ljava/lang/Integer;

    .line 887
    :cond_151
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->doNotUseStoreV4TileType:Ljava/lang/Boolean;

    if-nez v1, :cond_152

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->doNotUseStoreV4TileType:Ljava/lang/Boolean;

    .line 888
    :cond_152
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOldK4rLandingPage:Ljava/lang/Boolean;

    if-nez v1, :cond_153

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOldK4rLandingPage:Ljava/lang/Boolean;

    .line 889
    :cond_153
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->ageValidationBirthdateCacheTimeSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_154

    const v1, 0x49d400

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->ageValidationBirthdateCacheTimeSeconds:Ljava/lang/Integer;

    .line 890
    :cond_154
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNewAuthSystem:Ljava/lang/Boolean;

    if-nez v1, :cond_155

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNewAuthSystem:Ljava/lang/Boolean;

    .line 891
    :cond_155
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontIncreaseBrightnessForBestBuy:Ljava/lang/Boolean;

    if-nez v1, :cond_156

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontIncreaseBrightnessForBestBuy:Ljava/lang/Boolean;

    .line 892
    :cond_156
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontDisplayEmailBarcodeForBestBuy:Ljava/lang/Boolean;

    if-nez v1, :cond_157

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontDisplayEmailBarcodeForBestBuy:Ljava/lang/Boolean;

    .line 893
    :cond_157
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontDisplayBarcodeDigitsForBestBuy:Ljava/lang/Boolean;

    if-nez v1, :cond_158

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontDisplayBarcodeDigitsForBestBuy:Ljava/lang/Boolean;

    .line 894
    :cond_158
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldUseKickDetailsOverlayForScans:Ljava/lang/Boolean;

    if-nez v1, :cond_159

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldUseKickDetailsOverlayForScans:Ljava/lang/Boolean;

    .line 897
    :cond_159
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontShowTappableKicksActivityDetails:Ljava/lang/Boolean;

    if-nez v1, :cond_15a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontShowTappableKicksActivityDetails:Ljava/lang/Boolean;

    .line 898
    :cond_15a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseNewTilesAndCopyForKicksTutorialScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_15b

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseNewTilesAndCopyForKicksTutorialScreen:Ljava/lang/Boolean;

    .line 899
    :cond_15b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableMoatTracking:Ljava/lang/Boolean;

    if-nez v1, :cond_15c

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableMoatTracking:Ljava/lang/Boolean;

    .line 900
    :cond_15c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shoppingListSuggestionsRequestDelayMs:Ljava/lang/Long;

    if-nez v1, :cond_15d

    const-wide/16 v1, 0xfa

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shoppingListSuggestionsRequestDelayMs:Ljava/lang/Long;

    .line 901
    :cond_15d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shoppingListsTempIdPrefix:Ljava/lang/String;

    if-nez v1, :cond_15e

    const-string v1, "TEMP"

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shoppingListsTempIdPrefix:Ljava/lang/String;

    .line 902
    :cond_15e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxPendingShoppingListCreationAndModifications:Ljava/lang/Integer;

    if-nez v1, :cond_15f

    const/16 v1, 0x1f4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxPendingShoppingListCreationAndModifications:Ljava/lang/Integer;

    .line 903
    :cond_15f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->taxonomyKeywordRelatedOffersBucketSizeMeters:Ljava/lang/Integer;

    if-nez v1, :cond_160

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->taxonomyKeywordRelatedOffersBucketSizeMeters:Ljava/lang/Integer;

    .line 904
    :cond_160
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->nearbyLocationsBucketSizeInMeters:Ljava/lang/Integer;

    if-nez v1, :cond_161

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->nearbyLocationsBucketSizeInMeters:Ljava/lang/Integer;

    .line 905
    :cond_161
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->brandedLookbookSavingEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_162

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->brandedLookbookSavingEnabled:Ljava/lang/Boolean;

    .line 906
    :cond_162
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNormalJpgSize:Ljava/lang/Boolean;

    if-nez v1, :cond_163

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNormalJpgSize:Ljava/lang/Boolean;

    .line 907
    :cond_163
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseNewReceiptScanFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_164

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseNewReceiptScanFlow:Ljava/lang/Boolean;

    .line 908
    :cond_164
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->allowBluetoothAlertOnStoresTab:Ljava/lang/Boolean;

    if-nez v1, :cond_165

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->allowBluetoothAlertOnStoresTab:Ljava/lang/Boolean;

    .line 909
    :cond_165
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showBluetoothAlertRadiusInMeters:Ljava/lang/Integer;

    if-nez v1, :cond_166

    const/16 v1, 0x96

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showBluetoothAlertRadiusInMeters:Ljava/lang/Integer;

    .line 910
    :cond_166
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showBluetoothAlertMaxTimes:Ljava/lang/Integer;

    if-nez v1, :cond_167

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showBluetoothAlertMaxTimes:Ljava/lang/Integer;

    .line 911
    :cond_167
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->missingItemClickHistoryMaxAgeSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_168

    const v1, 0x93a80

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->missingItemClickHistoryMaxAgeSeconds:Ljava/lang/Integer;

    .line 912
    :cond_168
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineScanFlowRequestTimeoutInSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_169

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineScanFlowRequestTimeoutInSeconds:Ljava/lang/Integer;

    .line 913
    :cond_169
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useShorterRequestTimeoutForOfflineScanFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_16a

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useShorterRequestTimeoutForOfflineScanFlow:Ljava/lang/Boolean;

    .line 914
    :cond_16a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineScanFailureStatusDataMaxAgeInSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_16b

    const v1, 0x15180

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineScanFailureStatusDataMaxAgeInSeconds:Ljava/lang/Integer;

    .line 915
    :cond_16b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useAndroidGoogleBarcodeSdk:Ljava/lang/Boolean;

    if-nez v1, :cond_16c

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useAndroidGoogleBarcodeSdk:Ljava/lang/Boolean;

    .line 916
    :cond_16c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseReceiptScanInstructionFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_16d

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseReceiptScanInstructionFlow:Ljava/lang/Boolean;

    .line 917
    :cond_16d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enforceFullFlowForReceiptScanInstruction:Ljava/lang/Boolean;

    if-nez v1, :cond_16e

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enforceFullFlowForReceiptScanInstruction:Ljava/lang/Boolean;

    .line 918
    :cond_16e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOldIosBtleWalkinDetection:Ljava/lang/Boolean;

    if-nez v1, :cond_16f

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useOldIosBtleWalkinDetection:Ljava/lang/Boolean;

    .line 919
    :cond_16f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->notificationTurnedOffPollingDuration:Ljava/lang/Double;

    if-nez v1, :cond_170

    const-wide v1, 0x40ac200000000000L    # 3600.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->notificationTurnedOffPollingDuration:Ljava/lang/Double;

    .line 920
    :cond_170
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->notifiactionTurnedOffPollingInterval:Ljava/lang/Double;

    if-nez v1, :cond_171

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->notifiactionTurnedOffPollingInterval:Ljava/lang/Double;

    .line 921
    :cond_171
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->notificationSuppressionDrivingSpeed:Ljava/lang/Double;

    if-nez v1, :cond_172

    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->notificationSuppressionDrivingSpeed:Ljava/lang/Double;

    .line 922
    :cond_172
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->goodLocationFixTimoutTime:Ljava/lang/Double;

    if-nez v1, :cond_173

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->goodLocationFixTimoutTime:Ljava/lang/Double;

    .line 923
    :cond_173
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->goodLocationFixTargetAccuracy:Ljava/lang/Double;

    if-nez v1, :cond_174

    const-wide/high16 v1, 0x4039000000000000L    # 25.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->goodLocationFixTargetAccuracy:Ljava/lang/Double;

    .line 924
    :cond_174
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableGeofencingNotificationWhenUserDriving:Ljava/lang/Boolean;

    if-nez v1, :cond_175

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableGeofencingNotificationWhenUserDriving:Ljava/lang/Boolean;

    .line 925
    :cond_175
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->notificationCenterEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_176

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->notificationCenterEnabled:Ljava/lang/Boolean;

    .line 927
    :cond_176
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontShowOnlyLiveReceiptKicks:Ljava/lang/Boolean;

    if-nez v1, :cond_177

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontShowOnlyLiveReceiptKicks:Ljava/lang/Boolean;

    .line 928
    :cond_177
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableWifiScanningInForeground:Ljava/lang/Boolean;

    if-nez v1, :cond_178

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableWifiScanningInForeground:Ljava/lang/Boolean;

    .line 929
    :cond_178
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableWifiScanningInBackground:Ljava/lang/Boolean;

    if-nez v1, :cond_179

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableWifiScanningInBackground:Ljava/lang/Boolean;

    .line 930
    :cond_179
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableWifiScanningWithoutGeofencing:Ljava/lang/Boolean;

    if-nez v1, :cond_17a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableWifiScanningWithoutGeofencing:Ljava/lang/Boolean;

    .line 931
    :cond_17a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skloggerDevloggingDisabled:Ljava/lang/Boolean;

    if-nez v1, :cond_17b

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skloggerDevloggingDisabled:Ljava/lang/Boolean;

    .line 932
    :cond_17b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skloggerOnlyDevloggingDisabled:Ljava/lang/Boolean;

    if-nez v1, :cond_17c

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->skloggerOnlyDevloggingDisabled:Ljava/lang/Boolean;

    .line 933
    :cond_17c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseWalkinButton:Ljava/lang/Boolean;

    if-nez v1, :cond_17d

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseWalkinButton:Ljava/lang/Boolean;

    .line 934
    :cond_17d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOcrTest:Ljava/lang/Boolean;

    if-nez v1, :cond_17e

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOcrTest:Ljava/lang/Boolean;

    .line 935
    :cond_17e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewRussellButton:Ljava/lang/Boolean;

    if-nez v1, :cond_17f

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewRussellButton:Ljava/lang/Boolean;

    .line 936
    :cond_17f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOcrProcessing:Ljava/lang/Boolean;

    if-nez v1, :cond_180

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOcrProcessing:Ljava/lang/Boolean;

    .line 937
    :cond_180
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->ocrImageSize:Ljava/lang/Integer;

    if-nez v1, :cond_181

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->ocrImageSize:Ljava/lang/Integer;

    .line 938
    :cond_181
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewGpsWalkinAlgorithm:Ljava/lang/Boolean;

    if-nez v1, :cond_182

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewGpsWalkinAlgorithm:Ljava/lang/Boolean;

    .line 939
    :cond_182
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->recipeSavingEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_183

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->recipeSavingEnabled:Ljava/lang/Boolean;

    .line 940
    :cond_183
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinButtonDistanceMultiplier:Ljava/lang/Double;

    if-nez v1, :cond_184

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinButtonDistanceMultiplier:Ljava/lang/Double;

    .line 941
    :cond_184
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinButtonSuccessDelayMs:Ljava/lang/Integer;

    if-nez v1, :cond_185

    const/16 v1, 0x7530

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinButtonSuccessDelayMs:Ljava/lang/Integer;

    .line 942
    :cond_185
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showInternalFeedbackButton:Ljava/lang/Boolean;

    if-nez v1, :cond_186

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showInternalFeedbackButton:Ljava/lang/Boolean;

    .line 943
    :cond_186
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableBeaconNotMatchedToZoneFallback:Ljava/lang/Boolean;

    if-nez v1, :cond_187

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableBeaconNotMatchedToZoneFallback:Ljava/lang/Boolean;

    .line 944
    :cond_187
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinButtonDisableAutomaticWalkins:Ljava/lang/Boolean;

    if-nez v1, :cond_188

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinButtonDisableAutomaticWalkins:Ljava/lang/Boolean;

    .line 945
    :cond_188
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableLocationAccuracyPrompting:Ljava/lang/Boolean;

    if-nez v1, :cond_189

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableLocationAccuracyPrompting:Ljava/lang/Boolean;

    .line 946
    :cond_189
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->storeDetailsGroceryOffersWidgetEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_18a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->storeDetailsGroceryOffersWidgetEnabled:Ljava/lang/Boolean;

    .line 947
    :cond_18a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewBarcodeScannerWithTips:Ljava/lang/Boolean;

    if-nez v1, :cond_18b

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewBarcodeScannerWithTips:Ljava/lang/Boolean;

    .line 948
    :cond_18b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->newBarcodeScannerTipsInitiallyHidden:Ljava/lang/Boolean;

    if-nez v1, :cond_18c

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->newBarcodeScannerTipsInitiallyHidden:Ljava/lang/Boolean;

    .line 949
    :cond_18c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showChallengesInTodayTab:Ljava/lang/Boolean;

    if-nez v1, :cond_18d

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showChallengesInTodayTab:Ljava/lang/Boolean;

    .line 950
    :cond_18d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableKicksForClick:Ljava/lang/Boolean;

    if-nez v1, :cond_18e

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableKicksForClick:Ljava/lang/Boolean;

    .line 951
    :cond_18e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->keepAllPromoUnitOnTop:Ljava/lang/Boolean;

    if-nez v1, :cond_18f

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->keepAllPromoUnitOnTop:Ljava/lang/Boolean;

    .line 952
    :cond_18f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldUsePromoCodeFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_190

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldUsePromoCodeFlow:Ljava/lang/Boolean;

    .line 953
    :cond_190
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOnlineOffersV2TileCells:Ljava/lang/Boolean;

    if-nez v1, :cond_191

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOnlineOffersV2TileCells:Ljava/lang/Boolean;

    .line 954
    :cond_191
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldDisplayRewardWidget:Ljava/lang/Boolean;

    if-nez v1, :cond_192

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldDisplayRewardWidget:Ljava/lang/Boolean;

    .line 955
    :cond_192
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldShowInviteAsTab:Ljava/lang/Boolean;

    if-nez v1, :cond_193

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shouldShowInviteAsTab:Ljava/lang/Boolean;

    .line 956
    :cond_193
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewProductSelectorScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_194

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewProductSelectorScreen:Ljava/lang/Boolean;

    .line 957
    :cond_194
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOffersDetailScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_195

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOffersDetailScreen:Ljava/lang/Boolean;

    .line 958
    :cond_195
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendLocationHeaderAndroid:Ljava/lang/Boolean;

    if-nez v1, :cond_196

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendLocationHeaderAndroid:Ljava/lang/Boolean;

    .line 959
    :cond_196
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendLocationHeaderIos:Ljava/lang/Boolean;

    if-nez v1, :cond_197

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendLocationHeaderIos:Ljava/lang/Boolean;

    .line 960
    :cond_197
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->reorderingOnlineOfflineStores:Ljava/lang/Boolean;

    if-nez v1, :cond_198

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->reorderingOnlineOfflineStores:Ljava/lang/Boolean;

    .line 961
    :cond_198
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxWalkinRequestAgeMs:Ljava/lang/Integer;

    if-nez v1, :cond_199

    const v1, 0x36ee80

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxWalkinRequestAgeMs:Ljava/lang/Integer;

    .line 962
    :cond_199
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideQuantityInReceiptDetails:Ljava/lang/Boolean;

    if-nez v1, :cond_19a

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideQuantityInReceiptDetails:Ljava/lang/Boolean;

    .line 963
    :cond_19a
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->handleRegexMatchForBarcodes:Ljava/lang/Boolean;

    if-nez v1, :cond_19b

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->handleRegexMatchForBarcodes:Ljava/lang/Boolean;

    .line 965
    :cond_19b
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableLocationPermissionBanner:Ljava/lang/Boolean;

    if-nez v1, :cond_19c

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableLocationPermissionBanner:Ljava/lang/Boolean;

    .line 966
    :cond_19c
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    if-nez v1, :cond_19d

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    .line 967
    :cond_19d
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_19e

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationEnabled:Ljava/lang/Boolean;

    .line 968
    :cond_19e
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationTonightHours:Ljava/lang/Integer;

    if-nez v1, :cond_19f

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationTonightHours:Ljava/lang/Integer;

    .line 969
    :cond_19f
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationInHours:Ljava/lang/Integer;

    if-nez v1, :cond_1a0

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationInHours:Ljava/lang/Integer;

    .line 970
    :cond_1a0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableScanMissionOdp:Ljava/lang/Boolean;

    if-nez v1, :cond_1a1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableScanMissionOdp:Ljava/lang/Boolean;

    .line 971
    :cond_1a1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->defaultEarnTabToggleOption:Ljava/lang/Integer;

    if-nez v1, :cond_1a2

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->defaultEarnTabToggleOption:Ljava/lang/Integer;

    .line 972
    :cond_1a2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewDiscoverTab:Ljava/lang/Boolean;

    if-nez v1, :cond_1a3

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewDiscoverTab:Ljava/lang/Boolean;

    .line 973
    :cond_1a3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showReceiptTipsOnCameraScreen:Ljava/lang/Boolean;

    if-nez v1, :cond_1a4

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showReceiptTipsOnCameraScreen:Ljava/lang/Boolean;

    .line 974
    :cond_1a4
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableProductSelectorForceItems:Ljava/lang/Boolean;

    if-nez v1, :cond_1a5

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableProductSelectorForceItems:Ljava/lang/Boolean;

    .line 975
    :cond_1a5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOnlineOfferTileStartButtonTransaction:Ljava/lang/Boolean;

    if-nez v1, :cond_1a6

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOnlineOfferTileStartButtonTransaction:Ljava/lang/Boolean;

    .line 976
    :cond_1a6
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableQuickKicksWidget:Ljava/lang/Boolean;

    if-nez v1, :cond_1a7

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableQuickKicksWidget:Ljava/lang/Boolean;

    .line 977
    :cond_1a7
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOnlineStoreDetailsScreenCategoryKicks:Ljava/lang/Boolean;

    if-nez v1, :cond_1a8

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOnlineStoreDetailsScreenCategoryKicks:Ljava/lang/Boolean;

    .line 978
    :cond_1a8
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxTimeForVideoRenderingIntervalSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_1a9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxTimeForVideoRenderingIntervalSeconds:Ljava/lang/Integer;

    .line 979
    :cond_1a9
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewOnlineKicksUnit:Ljava/lang/Boolean;

    if-nez v1, :cond_1aa

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewOnlineKicksUnit:Ljava/lang/Boolean;

    .line 980
    :cond_1aa
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableInlineProgrammaticVideo:Ljava/lang/Boolean;

    if-nez v1, :cond_1ab

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableInlineProgrammaticVideo:Ljava/lang/Boolean;

    .line 981
    :cond_1ab
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageRecognitionScans:Ljava/lang/Boolean;

    if-nez v1, :cond_1ac

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageRecognitionScans:Ljava/lang/Boolean;

    .line 982
    :cond_1ac
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableRadarSdkIntegration:Ljava/lang/Boolean;

    if-nez v1, :cond_1ad

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableRadarSdkIntegration:Ljava/lang/Boolean;

    .line 983
    :cond_1ad
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableProgrammaticSurvey:Ljava/lang/Boolean;

    if-nez v1, :cond_1ae

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableProgrammaticSurvey:Ljava/lang/Boolean;

    .line 984
    :cond_1ae
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableMarketingPromoCodes:Ljava/lang/Boolean;

    if-nez v1, :cond_1af

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableMarketingPromoCodes:Ljava/lang/Boolean;

    .line 985
    :cond_1af
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showLeftNavRedesign:Ljava/lang/Boolean;

    if-nez v1, :cond_1b0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->showLeftNavRedesign:Ljava/lang/Boolean;

    .line 986
    :cond_1b0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableFtueTutorial:Ljava/lang/Boolean;

    if-nez v1, :cond_1b1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableFtueTutorial:Ljava/lang/Boolean;

    .line 987
    :cond_1b1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableFtueDiscoverTabLesson:Ljava/lang/Boolean;

    if-nez v1, :cond_1b2

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableFtueDiscoverTabLesson:Ljava/lang/Boolean;

    .line 988
    :cond_1b2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableNotificationCenter:Ljava/lang/Boolean;

    if-nez v1, :cond_1b3

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableNotificationCenter:Ljava/lang/Boolean;

    .line 989
    :cond_1b3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableSearchButton:Ljava/lang/Boolean;

    if-nez v1, :cond_1b4

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableSearchButton:Ljava/lang/Boolean;

    .line 990
    :cond_1b4
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->deprecateShoppingLists:Ljava/lang/Boolean;

    if-nez v1, :cond_1b5

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->deprecateShoppingLists:Ljava/lang/Boolean;

    .line 991
    :cond_1b5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableCameraControllerV3:Ljava/lang/Boolean;

    if-nez v1, :cond_1b6

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableCameraControllerV3:Ljava/lang/Boolean;

    :cond_1b6
    return-void
.end method
