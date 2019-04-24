.class public Lcom/shopkick/app/application/ScreenGlobals;
.super Ljava/lang/Object;
.source "ScreenGlobals.java"


# instance fields
.field public alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

.field public apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

.field public apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

.field public apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

.field public apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

.field public appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field public appInfo:Lcom/shopkick/app/application/AppInfo;

.field public appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

.field public appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field public authenticator:Lcom/shopkick/app/account/Authenticator;

.field public awardsManager:Lcom/shopkick/app/awards/AwardsManager;

.field public badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

.field public bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

.field public bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

.field public buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

.field public certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

.field public chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

.field public clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field public credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

.field public debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

.field public developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

.field public deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field public dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field public dispatcherCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

.field public displayMetrics:Landroid/util/DisplayMetrics;

.field public fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

.field public firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field public gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

.field public geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

.field public googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

.field public instantBonusAwarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

.field public localNotificationCenter:Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;

.field public locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field public locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field public logger:Lcom/shopkick/app/application/SKLogger;

.field public mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

.field public nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

.field public notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field public offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

.field public overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

.field public phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

.field public postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

.field public presenceController:Lcom/shopkick/app/presence/PresenceController;

.field public productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

.field public profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field public profilePictureHelperFactory:Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

.field public profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field public redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field public rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field public scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field public scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

.field public screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

.field public screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

.field public shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field public skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

.field public skInternalFeedbackButtonHelper:Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

.field public skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

.field public soundManager:Lcom/shopkick/app/sounds/SoundManager;

.field public splitInstallManager:Lcom/google/android/play/core/splitinstall/SplitInstallManager;

.field public storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

.field public storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

.field public taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

.field public telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

.field public textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

.field public trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

.field public transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

.field public urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

.field public userAccount:Lcom/shopkick/app/account/UserAccount;

.field public userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

.field public userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

.field public videoController:Lcom/shopkick/app/video/VideoController;

.field public viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

.field public walkinController:Lcom/shopkick/app/presence/WalkinController;

.field public widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
