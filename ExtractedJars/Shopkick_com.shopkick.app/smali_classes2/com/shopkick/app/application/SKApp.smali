.class public Lcom/shopkick/app/application/SKApp;
.super Landroid/support/multidex/MultiDexApplication;
.source "SKApp.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;,
        Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;
    }
.end annotation


# static fields
.field private static final ALPHA_AUTHORITY:Ljava/lang/String; = "alpha.shopkick.com"

.field private static final ALPHA_ENV:Ljava/lang/String; = "alpha"

.field private static final APPBOY_PROD_KEY:Ljava/lang/String; = "d4cf8bc5-e430-470a-8f38-33a2bf2d3820"

.field private static final APPBOY_TEST_KEY:Ljava/lang/String; = "9221fefb-875f-45c2-b6fd-7fefc56146f2"

.field private static final BRANCH_TEST_KEY:Ljava/lang/String; = "key_test_ogk399HPob5vw5MVgGEkJidnxxk4p0dV"

.field private static final BUTTON_APP_ID:Ljava/lang/String; = "app-29db5f25f8264e26"

.field private static final CONTENT_PREVIEW_AUTHORITY:Ljava/lang/String; = "contentpreview.shopkick.com"

.field private static final CONTENT_PREVIEW_ENV:Ljava/lang/String; = "contentpreview"

.field public static final ENV_AUTH_KEY:Ljava/lang/String; = "env_authority"

.field public static final ENV_KEY:Ljava/lang/String; = "change_environment"

.field private static final FACEBOOK_APP_ID:Ljava/lang/String; = "121151187906606"

.field private static final FACEBOOK_CLIENT_TOKEN:Ljava/lang/String; = "860cbb3ece412195740337f276c300d5"

.field private static final GAMMA_AUTHORITY:Ljava/lang/String; = "gamma.shopkick.com"

.field private static final GAMMA_ENV:Ljava/lang/String; = "gamma"

.field private static final HOGTOWN_AUTHORITY:Ljava/lang/String; = "hogtown.shopkick.com"

.field private static final HOGTOWN_ENV:Ljava/lang/String; = "hogtown"

.field private static final LOCAL_ENV:Ljava/lang/String; = "localhost"

.field private static final MOAT_PARTNER_CODE_DISPLAY_PRODUCTION:Ljava/lang/String; = "shopkicknativesdkdisplay911335009750"

.field private static final MOAT_PARTNER_CODE_DISPLAY_STAGING:Ljava/lang/String; = "shopkicknativestagingdisplay948209515893"

.field private static final MOAT_PARTNER_CODE_VIDEO_PRODUCTION:Ljava/lang/String; = "shopkicknativesdkvideo228675605652"

.field private static final MOAT_PARTNER_CODE_VIDEO_STAGING:Ljava/lang/String; = "shopkicknativestagingvideo95667786757"

.field private static final PARTNERTEST_AUTHORITY:Ljava/lang/String; = "partnertestapp.shopkick.com"

.field private static final PARTNER_TEST_ENV:Ljava/lang/String; = "partnertest"

.field private static final POD_O_GOLD_AUTHORITY:Ljava/lang/String; = "treatyourself.shopkick.com"

.field private static final POD_O_GOLD_ENV:Ljava/lang/String; = "pod o gold"

.field private static final PROD_AUTHORITY:Ljava/lang/String; = "app.shopkick.com"

.field private static final PROD_AUTH_DOMAIN:Ljava/lang/String; = "sdk.shopkick.com"

.field private static final PROD_BUNDLE_CACHE_AUTHORITY:Ljava/lang/String; = "app2.shopkick.com"

.field private static final PROD_ENV:Ljava/lang/String; = "production"

.field private static final PSEUDO_LOC_AUTHORITY:Ljava/lang/String; = "pseudoloc.shopkick.com"

.field private static final PSEUDO_LOC_ENV:Ljava/lang/String; = "pseudoloc"

.field private static final QA_AUTHORITY:Ljava/lang/String; = "beta.shopkick.com"

.field private static final QA_ENV:Ljava/lang/String; = "qa"

.field public static final RESET_ENVIRONMENT:Ljava/lang/String; = "reset_environment"

.field private static final SHOPKICK_APP_ID:Ljava/lang/String; = "34e25cc8-61e9-405d-8b71-66a3260ddd6b"

.field private static final SHOPPORTUNITY_AUTHORITY:Ljava/lang/String; = "shopportunity.shopkick.com"

.field private static final SHOPPORTUNITY_ENV:Ljava/lang/String; = "shopportunity"

.field private static final SIMBA_AUTHORITY:Ljava/lang/String; = "simba.shopkick.com"

.field private static final SIMBA_ENV:Ljava/lang/String; = "simba"

.field private static final SKDiskCacheName:Ljava/lang/String; = "skcache"

.field private static authDomain:Ljava/lang/String; = null

.field private static authority:Ljava/lang/String; = null

.field private static bundleCacheAuthority:Ljava/lang/String; = null

.field public static debugFileName:Ljava/lang/String; = null

.field public static debugPresenceDetection:Z = false

.field private static disableHTTPS:Z = false

.field private static env:Ljava/lang/String; = null

.field public static filesDir:Ljava/io/File; = null

.field public static gitRevision:Ljava/lang/String; = "c68146c34f34403cc35630ae6b59ac6eefaa0919"

.field private static instance:Lcom/shopkick/app/application/SKApp; = null

.field private static localAuthority:Ljava/lang/String; = null

.field private static printClientLogs:Z = false

.field private static showUrls:Z = false


# instance fields
.field private actionSheetHandler:Lcom/shopkick/app/urlhandlers/ActionSheetHandler;

.field public alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

.field public alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field public apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

.field public apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

.field private apiCallHandler:Lcom/shopkick/app/urlhandlers/APICallHandler;

.field public volatile apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

.field private final apiManagerV2Lock:Ljava/lang/Object;

.field public apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

.field public appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field public appInfo:Lcom/shopkick/app/application/AppInfo;

.field public appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

.field public appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field public appScreenActivityCount:I

.field public audioFactory:Lcom/shopkick/app/presence/AudioRecordFactory;

.field public audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

.field private authCodeLoginHandler:Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;

.field private authenticator:Lcom/shopkick/app/account/Authenticator;

.field public awardsManager:Lcom/shopkick/app/awards/AwardsManager;

.field public badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

.field private batteryStates:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private bcEnrollmentHandler:Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;

.field public bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

.field public volatile bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

.field private final bleCampaignControllerLock:Ljava/lang/Object;

.field public bundleFiles:Lcom/shopkick/app/application/BundleFiles;

.field public buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

.field public certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

.field public chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

.field public clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field public clock:Lcom/shopkick/app/util/Clock;

.field private closeHandler:Lcom/shopkick/app/urlhandlers/CloseHandler;

.field public credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

.field private customActionSheetHandler:Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;

.field public debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

.field public developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

.field public deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field public displayMetrics:Landroid/util/DisplayMetrics;

.field private emailHandler:Lcom/shopkick/app/urlhandlers/EmailHandler;

.field private emailVerificationHandler:Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;

.field private externalDeeplinkHandler:Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;

.field public fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

.field public firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field private firstUseNextHandler:Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;

.field public gcmDataSource:Lcom/shopkick/app/gcm/GCMDataSource;

.field public gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

.field public geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

.field public googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

.field public inFirstUseMode:Z

.field private inviteHandler:Lcom/shopkick/app/urlhandlers/InviteHandler;

.field private inviteTrackingController:Lcom/shopkick/app/invite/InviteTrackingController;

.field private isNewUserFuture:Ljava/util/concurrent/Future;

.field private isSDKClientAccessorInitialized:Z

.field private kickstarterBonusReminderController:Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;

.field public localNotificationCenter:Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;

.field public locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field public locationListManager:Lcom/shopkick/app/fetchers/LocationListManager;

.field public locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private logHandler:Lcom/shopkick/app/urlhandlers/LogHandler;

.field public logger:Lcom/shopkick/app/application/SKLogger;

.field public mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

.field private mFirebaseAnalytics:Lcom/google/firebase/analytics/FirebaseAnalytics;

.field public mediaScannerClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

.field public mediaScannerConnection:Landroid/media/MediaScannerConnection;

.field private modalWebViewHandler:Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;

.field public nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

.field private final networkManagerLocationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

.field public networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

.field public notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private offerWebViewHandler:Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;

.field public offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

.field public oldNetworkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

.field private overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

.field public phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

.field public phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

.field private phoneVerificationHandler:Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;

.field private pointsController:Lcom/shopkick/app/points/PointsController;

.field public postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

.field private preloadExecutorService:Ljava/util/concurrent/ExecutorService;

.field public presenceController:Lcom/shopkick/app/presence/PresenceController;

.field public profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field public profilePictureHelperFactory:Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

.field public profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private receiptScanAvailableHandler:Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;

.field public redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field private refWatcher:Lcom/squareup/leakcanary/RefWatcher;

.field private registerHandler:Lcom/shopkick/app/urlhandlers/RegisterHandler;

.field private resetPasswordHandler:Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;

.field private rewardHandler:Lcom/shopkick/app/urlhandlers/RewardUsedHandler;

.field public rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field private saveStoryHandler:Lcom/shopkick/app/urlhandlers/SaveStoryHandler;

.field public scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field public scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

.field public screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

.field public screenHandler:Lcom/shopkick/app/urlhandlers/ScreenHandler;

.field public screenInfo:Lcom/shopkick/app/screens/ScreenInfo;

.field private sessionStartTime:J

.field private shareFacebookHandler:Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;

.field public shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field public skActivityRecognitionManager:Lcom/shopkick/app/location/SKActivityRecognitionManager;

.field private skClientLoggingConfigurationProvider:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

.field public skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

.field public skDiskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

.field private skInternalFeedbackButtonHelper:Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

.field public skLocMan:Lcom/shopkick/app/location/SKLocationManager;

.field public skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

.field private smsHandler:Lcom/shopkick/app/urlhandlers/SMSHandler;

.field public soundManager:Lcom/shopkick/app/sounds/SoundManager;

.field private startingBatteryPercentage:D

.field public storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

.field public storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

.field public taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

.field public telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

.field public textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

.field public transmitterDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

.field private uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

.field public userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

.field public userAcct:Lcom/shopkick/app/account/UserAccount;

.field public userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoHandler:Lcom/shopkick/app/urlhandlers/VideoHandler;

.field public viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

.field private walkinController:Lcom/shopkick/app/presence/WalkinController;

.field public walkinHistory:Lcom/shopkick/app/persistence/PersistentMap;

.field private widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 199
    invoke-direct {p0}, Landroid/support/multidex/MultiDexApplication;-><init>()V

    .line 201
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2Lock:Ljava/lang/Object;

    .line 250
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->bleCampaignControllerLock:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 283
    iput-boolean v0, p0, Lcom/shopkick/app/application/SKApp;->inFirstUseMode:Z

    const/4 v0, 0x0

    .line 393
    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    .line 398
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->batteryStates:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 402
    iput-boolean v0, p0, Lcom/shopkick/app/application/SKApp;->isSDKClientAccessorInitialized:Z

    .line 1946
    new-instance v0, Lcom/shopkick/app/application/SKApp$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/application/SKApp$3;-><init>(Lcom/shopkick/app/application/SKApp;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->networkManagerLocationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    return-void
.end method

.method private deleteOldImageCacheIfExists()V
    .locals 3

    .line 1965
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getDeletedOldImageCache()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1970
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getCacheDir()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1971
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1972
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "sk_disk_cache"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1973
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1974
    invoke-static {v1}, Lcom/shopkick/app/util/FileUtils;->deleteRecursive(Ljava/io/File;)V

    .line 1978
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1979
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1980
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "sk_disk_cache"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1981
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1982
    invoke-static {v1}, Lcom/shopkick/app/util/FileUtils;->deleteRecursive(Ljava/io/File;)V

    .line 1986
    :cond_1
    sget-object v0, Lcom/shopkick/app/application/SKApp;->filesDir:Ljava/io/File;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1987
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/shopkick/app/application/SKApp;->filesDir:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "pinned_images"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1988
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1989
    invoke-static {v0}, Lcom/shopkick/app/util/FileUtils;->deleteRecursive(Ljava/io/File;)V

    .line 1993
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setDeletedOldImageCache(Z)V

    :cond_3
    return-void
.end method

.method private destroyAll()V
    .locals 1

    .line 1352
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->destroy()V

    .line 1353
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 1354
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->destroy()V

    .line 1355
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->pointsController:Lcom/shopkick/app/points/PointsController;

    invoke-virtual {v0}, Lcom/shopkick/app/points/PointsController;->destroy()V

    .line 1357
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    invoke-virtual {v0}, Lcom/shopkick/app/gcm/GCMLifeCycle;->destroy()V

    .line 1358
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserAcquisitionReporter;->destroy()V

    .line 1363
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->stopPresenceListening()V

    .line 1364
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ClientFlagsManager;->reset()V

    .line 1365
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->destroy()V

    .line 1366
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/awards/AwardsManager;->destroy()V

    .line 1367
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->destroy()V

    .line 1368
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

    if-eqz v0, :cond_0

    .line 1369
    invoke-virtual {v0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->destroy()V

    .line 1371
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->skActivityRecognitionManager:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    invoke-virtual {v0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->destroy()V

    .line 1372
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-virtual {v0}, Lcom/shopkick/app/store/MCommerceManager;->destroy()V

    return-void
.end method

.method private doClientFlagsLoadedWork()V
    .locals 2

    .line 1440
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->initializeCommFrameworkFeatures()V

    .line 1445
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/RadarSDKUtils;->updateRadarTracking(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-void
.end method

.method private doClientFlagsReceivedWork(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1434
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableNetworkRequestTimeoutLogging:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/shopkick/fetchers/api/APIManager;->setEnableNetworkRequestTimeoutLogging(Z)V

    .line 1435
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1, v0}, Lcom/shopkick/app/util/RadarSDKUtils;->updateRadarTracking(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-void

    .line 1431
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'clientFlags\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private generateAppInfo()[B
    .locals 18

    const-string v0, "gY3nR4CD93pphVocrEBdrjCuxNFYWVP04wri4WibOl8MX/ef0d5kKjtoHE3Ah4vsNoYe1/fw8mVMyrq7cGHxTA=="

    const/4 v1, 0x0

    .line 1907
    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 1910
    array-length v2, v0

    .line 1911
    new-array v3, v2, [B

    const-wide/32 v4, 0x1a464569

    :goto_0
    if-ge v1, v2, :cond_0

    const-wide/32 v6, 0x41c64e6d

    mul-long/2addr v4, v6

    const-wide/16 v8, 0x3039

    add-long/2addr v4, v8

    const-wide v10, 0x100000000L

    .line 1913
    rem-long/2addr v4, v10

    .line 1914
    aget-byte v12, v0, v1

    int-to-long v12, v12

    const-wide/16 v14, 0x100

    rem-long v16, v4, v14

    add-long v12, v12, v16

    rem-long/2addr v12, v14

    long-to-int v12, v12

    int-to-byte v12, v12

    aput-byte v12, v3, v1

    mul-long/2addr v4, v6

    add-long/2addr v4, v8

    .line 1915
    rem-long/2addr v4, v10

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v3
.end method

.method private getBackgroundServiceIntent()Landroid/content/Intent;
    .locals 2

    .line 1938
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/shopkick/app/activities/BackgroundService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method private getBatteryLevel()D
    .locals 4

    .line 1703
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/application/SKApp;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "level"

    const/4 v2, -0x1

    .line 1704
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "scale"

    .line 1705
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 1706
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/SKApp;->processBatteryState(Landroid/content/Intent;)V

    int-to-double v0, v1

    int-to-double v2, v2

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static getInstance()Lcom/shopkick/app/application/SKApp;
    .locals 1

    .line 405
    sget-object v0, Lcom/shopkick/app/application/SKApp;->instance:Lcom/shopkick/app/application/SKApp;

    return-object v0
.end method

.method public static getRefWatcher(Landroid/content/Context;)Lcom/squareup/leakcanary/RefWatcher;
    .locals 0

    .line 1105
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/application/SKApp;

    .line 1106
    iget-object p0, p0, Lcom/shopkick/app/application/SKApp;->refWatcher:Lcom/squareup/leakcanary/RefWatcher;

    return-object p0
.end method

.method private initializeBleCampaignController()V
    .locals 15

    .line 1541
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 1543
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

    const/4 v12, 0x0

    if-nez v0, :cond_1

    .line 1544
    iget-object v13, p0, Lcom/shopkick/app/application/SKApp;->bleCampaignControllerLock:Ljava/lang/Object;

    monitor-enter v13

    .line 1545
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

    if-nez v0, :cond_0

    .line 1547
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 1548
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 1549
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "SKApp: Initializing BLECampaignController"

    new-array v5, v12, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 1550
    new-instance v14, Lcom/shopkick/app/campaigns/BLECampaignController;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->clock:Lcom/shopkick/app/util/Clock;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v5, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v6, p0, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v7, p0, Lcom/shopkick/app/application/SKApp;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    iget-object v8, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v9, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v10, p0, Lcom/shopkick/app/application/SKApp;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iget-object v11, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    move-object v0, v14

    invoke-direct/range {v0 .. v11}, Lcom/shopkick/app/campaigns/BLECampaignController;-><init>(Landroid/content/Context;Lcom/shopkick/app/util/Clock;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/presence/WalkinController;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/launch/FirstUseControllerV2;Lcom/shopkick/app/application/SKLogger;)V

    iput-object v14, p0, Lcom/shopkick/app/application/SKApp;->bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

    .line 1561
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

    .line 1563
    :cond_0
    monitor-exit v13

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1566
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/application/SKApp;->inFirstUseMode:Z

    if-nez v0, :cond_2

    .line 1567
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 1568
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 1569
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "SKApp: BLECampaignController starting"

    new-array v4, v12, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 1570
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-virtual {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->updatedLocation()V

    :cond_2
    return-void
.end method

.method private initializeCommFramework()V
    .locals 23

    move-object/from16 v1, p0

    .line 1477
    iget-object v0, v1, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    if-nez v0, :cond_2

    .line 1478
    iget-object v2, v1, Lcom/shopkick/app/application/SKApp;->apiManagerV2Lock:Ljava/lang/Object;

    monitor-enter v2

    .line 1479
    :try_start_0
    iget-object v0, v1, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    if-nez v0, :cond_1

    .line 1481
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 1482
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 1483
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "SKApp: Initializing CommFramework"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 1489
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    .line 1492
    iget-object v8, v1, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v9, v1, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v10, v1, Lcom/shopkick/app/application/SKApp;->appInfo:Lcom/shopkick/app/application/AppInfo;

    iget-object v11, v1, Lcom/shopkick/app/application/SKApp;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    iget-object v12, v1, Lcom/shopkick/app/application/SKApp;->networkManagerLocationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    .line 1499
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->debugMode()Z

    move-result v13

    .line 1493
    invoke-static/range {v7 .. v13}, Lcom/shopkick/fetchers/network/NetworkManager;->createDefaultNetworkManager(Landroid/content/Context;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;Z)Lcom/shopkick/fetchers/network/NetworkManager;

    move-result-object v14

    .line 1501
    iget-object v15, v1, Lcom/shopkick/app/application/SKApp;->appInfo:Lcom/shopkick/app/application/AppInfo;

    iget-object v0, v1, Lcom/shopkick/app/application/SKApp;->developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

    iget-object v3, v1, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    sget-boolean v18, Lcom/shopkick/app/application/SKApp;->disableHTTPS:Z

    .line 1506
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v19

    iget-object v4, v1, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v5, v1, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v6, v1, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    move-object/from16 v16, v0

    move-object/from16 v17, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    .line 1501
    invoke-static/range {v14 .. v22}, Lcom/shopkick/fetchers/api/APIManager;->initialize(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/DeveloperInfo;Lcom/shopkick/app/application/Account;ZLandroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/application/SKLogger;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1516
    sget-object v0, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v3, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    sget-object v4, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    invoke-static {v0, v3, v4}, Lcom/shopkick/fetchers/api/APIManager;->addApis(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/Map;)V

    .line 1530
    sget-object v0, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v3, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    const v4, 0x7f100009

    .line 1532
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 1530
    invoke-static {v0, v3, v4}, Lcom/shopkick/fetchers/api/APIManager;->addApis(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/List;)V

    .line 1534
    invoke-static {}, Lcom/shopkick/fetchers/api/APIManager;->getInstance()Lcom/shopkick/fetchers/api/APIManager;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    goto :goto_0

    .line 1511
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "The shopkick app must be the entity that initializes the APIManager"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1536
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_1
    return-void
.end method

.method private initializeCommFrameworkFeatures()V
    .locals 9

    .line 1454
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    .line 1455
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->setApiManagerV2(Lcom/shopkick/fetchers/api/APIManager;)V

    .line 1456
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->setApiManagerV2(Lcom/shopkick/fetchers/api/APIManager;)V

    .line 1457
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/location/NearbyLocationsDataSource;->setApiManagerV2(Lcom/shopkick/fetchers/api/APIManager;)V

    .line 1458
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->skClientLoggingConfigurationProvider:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->setApiManagerV2(Lcom/shopkick/fetchers/api/APIManager;)V

    .line 1459
    new-instance v0, Lcom/shopkick/app/widget/WidgetDataSource;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/widget/WidgetDataSource;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    .line 1460
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    .line 1461
    new-instance v0, Lcom/shopkick/app/store/MCommerceManager;

    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v5, p0, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v6, p0, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v7, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v8, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/store/MCommerceManager;-><init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    .line 1467
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    .line 1468
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    return-void
.end method

.method private initializeGPSCheckins()V
    .locals 7

    .line 1630
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

    if-nez v0, :cond_0

    .line 1631
    new-instance v0, Lcom/shopkick/app/location/StoreNearbyNotifier;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v5, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v6, p0, Lcom/shopkick/app/application/SKApp;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/location/StoreNearbyNotifier;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/presence/WalkinController;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

    :cond_0
    return-void
.end method

.method public static synthetic lambda$setupApp$18(Lcom/shopkick/app/application/SKApp;Ljava/lang/Throwable;)V
    .locals 1

    .line 836
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/user/User;->setIdentifier(Ljava/lang/String;)V

    .line 838
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/user/User;->setAutofillEnabled(Z)V

    return-void
.end method

.method private onApplicationBackgrounded()V
    .locals 2

    .line 1643
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->debugMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1645
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->getPdEvents()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1646
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 1647
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/presence/PresenceController;->logPdEvents(Ljava/lang/String;)V

    .line 1649
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->resetPdEvents()V

    .line 1654
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->stopPresenceListening()V

    .line 1656
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    invoke-virtual {v0}, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->stop()V

    .line 1659
    new-instance v0, Landroid/webkit/WebView;

    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 1660
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 1662
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/activities/BackgroundJobService;->stopWork(Landroid/content/Context;)V

    .line 1664
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceInTheBackground:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->hasQueuedObjects()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1665
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/shopkick/app/activities/BackgroundJobService;->startWork(Landroid/content/Context;I)V

    .line 1668
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    if-eqz v0, :cond_3

    .line 1669
    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsDataController;->cancel()V

    :cond_3
    return-void
.end method

.method private onApplicationForegrounded()V
    .locals 2

    .line 1766
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->reloadCachedInfo()V

    .line 1767
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->sessionStarted()V

    .line 1769
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    invoke-virtual {v0}, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->start()V

    .line 1771
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->checkAndStartRecording()V

    .line 1774
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ClientFlagsManager;->refresh()V

    .line 1777
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->pointsController:Lcom/shopkick/app/points/PointsController;

    invoke-virtual {v0}, Lcom/shopkick/app/points/PointsController;->update()V

    .line 1780
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/dialog/DialogsManager;->reset()V

    .line 1783
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1784
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->localNotificationCenter:Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;

    invoke-virtual {v0}, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->reloadPullNotifications()V

    .line 1786
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/awards/AwardsManager;->registerListeners()V

    .line 1787
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/awards/AwardsManager;->showPendingAwards()V

    .line 1788
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/activities/BackgroundJobService;->stopWork(Landroid/content/Context;)V

    .line 1790
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->hasQueuedObjects()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1791
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/awards/AwardsManager;->showGrantedAwards()V

    .line 1793
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/awards/AwardsManager;->clearNotification()V

    .line 1795
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/appevents/AppEventsLogger;->activateApp(Landroid/content/Context;)V

    .line 1797
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsDataController;->tryFetchRewardsMallData()V

    .line 1798
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setShownSlideAnimation(Z)V

    .line 1800
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->syncUnusedRewards(Ljava/lang/Integer;)V

    .line 1801
    invoke-static {}, Lcom/shopkick/app/application/LocationKicker;->kickLocationServices()V

    return-void
.end method

.method private onSessionEnded()V
    .locals 5

    .line 1676
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x386

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 1677
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    const-string v2, "request_count"

    invoke-virtual {v1, v2}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->getCount(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAttemptCount(Ljava/lang/Integer;)V

    .line 1678
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    const-string v2, "response_count"

    invoke-virtual {v1, v2}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->getCount(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCompleteCount(Ljava/lang/Integer;)V

    .line 1679
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    const-string/jumbo v2, "success_count"

    invoke-virtual {v1, v2}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->getCount(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSuccessCount(Ljava/lang/Integer;)V

    .line 1680
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    const-string v2, "no_network_error_count"

    invoke-virtual {v1, v2}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->getCount(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setErrNoNetworkCount(Ljava/lang/Integer;)V

    .line 1681
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 1682
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->resetNetworkStats()V

    .line 1684
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->getBatteryLevel()D

    move-result-wide v0

    .line 1686
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0x385

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 1687
    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v3}, Lcom/shopkick/app/queue/SKPersistentQueue;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPendingRequestCount(Ljava/lang/Integer;)V

    .line 1688
    iget-wide v3, p0, Lcom/shopkick/app/application/SKApp;->startingBatteryPercentage:D

    sub-double/2addr v3, v0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPercentBatteryDepleted(Ljava/lang/Double;)V

    .line 1689
    iget-wide v3, p0, Lcom/shopkick/app/application/SKApp;->startingBatteryPercentage:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setInitialBatteryLevel(Ljava/lang/Double;)V

    .line 1690
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFinalBatteryLevel(Ljava/lang/Double;)V

    .line 1691
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->batteryStates:Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBatteryStates(Ljava/util/ArrayList;)V

    .line 1692
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v3, p0, Lcom/shopkick/app/application/SKApp;->sessionStartTime:J

    sub-long/2addr v0, v3

    long-to-double v0, v0

    const-wide v3, 0x412e848000000000L    # 1000000.0

    div-double/2addr v0, v3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSessionLength(Ljava/lang/Double;)V

    .line 1694
    sget v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->sessionScanCount:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanCount(Ljava/lang/Integer;)V

    .line 1695
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 1697
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {v0}, Lcom/shopkick/app/application/SKLogger;->endSession()V

    .line 1698
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchController;->reset()V

    return-void
.end method

.method private registerCommonHandlers()V
    .locals 2

    .line 1331
    new-instance v0, Lcom/shopkick/app/tracking/TrackingUrlHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/tracking/TrackingUrlHandler;-><init>(Lcom/shopkick/app/tracking/TrackingUrlManager;)V

    .line 1332
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0}, Lcom/shopkick/fetchers/api/APIManager;->registerHandler(Lcom/shopkick/app/fetchers/api/IAPICommonHandler;)V

    .line 1334
    new-instance v0, Lcom/shopkick/app/overlays/other/OverlaysResponseHandler;

    invoke-direct {v0}, Lcom/shopkick/app/overlays/other/OverlaysResponseHandler;-><init>()V

    .line 1335
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0}, Lcom/shopkick/fetchers/api/APIManager;->registerHandler(Lcom/shopkick/app/fetchers/api/IAPICommonHandler;)V

    .line 1337
    new-instance v0, Lcom/shopkick/app/points/PointsHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-direct {v0, v1}, Lcom/shopkick/app/points/PointsHandler;-><init>(Lcom/shopkick/app/points/ProfilePoints;)V

    .line 1338
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0}, Lcom/shopkick/fetchers/api/APIManager;->registerHandler(Lcom/shopkick/app/fetchers/api/IAPICommonHandler;)V

    return-void
.end method

.method private setAppboyConfig()V
    .locals 3

    const-string v0, "production"

    .line 510
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "d4cf8bc5-e430-470a-8f38-33a2bf2d3820"

    goto :goto_0

    :cond_0
    const-string v0, "9221fefb-875f-45c2-b6fd-7fefc56146f2"

    .line 511
    :goto_0
    new-instance v1, Lcom/appboy/configuration/AppboyConfig$Builder;

    invoke-direct {v1}, Lcom/appboy/configuration/AppboyConfig$Builder;-><init>()V

    invoke-virtual {v1, v0}, Lcom/appboy/configuration/AppboyConfig$Builder;->setApiKey(Ljava/lang/String;)Lcom/appboy/configuration/AppboyConfig$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 512
    invoke-virtual {v0, v1}, Lcom/appboy/configuration/AppboyConfig$Builder;->setGcmMessagingRegistrationEnabled(Z)Lcom/appboy/configuration/AppboyConfig$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 513
    invoke-virtual {v0, v1}, Lcom/appboy/configuration/AppboyConfig$Builder;->setIsFirebaseCloudMessagingRegistrationEnabled(Z)Lcom/appboy/configuration/AppboyConfig$Builder;

    move-result-object v0

    const-string v1, "31007554452"

    .line 514
    invoke-virtual {v0, v1}, Lcom/appboy/configuration/AppboyConfig$Builder;->setFirebaseCloudMessagingSenderIdKey(Ljava/lang/String;)Lcom/appboy/configuration/AppboyConfig$Builder;

    move-result-object v0

    .line 515
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0801af

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/appboy/configuration/AppboyConfig$Builder;->setSmallNotificationIcon(Ljava/lang/String;)Lcom/appboy/configuration/AppboyConfig$Builder;

    move-result-object v0

    .line 518
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f060120

    .line 517
    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/appboy/configuration/AppboyConfig$Builder;->setDefaultNotificationAccentColor(I)Lcom/appboy/configuration/AppboyConfig$Builder;

    move-result-object v0

    .line 520
    invoke-virtual {v0}, Lcom/appboy/configuration/AppboyConfig$Builder;->build()Lcom/appboy/configuration/AppboyConfig;

    move-result-object v0

    .line 521
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/appboy/Appboy;->configure(Landroid/content/Context;Lcom/appboy/configuration/AppboyConfig;)Z

    .line 522
    new-instance v0, Lcom/appboy/AppboyLifecycleCallbackListener;

    invoke-direct {v0}, Lcom/appboy/AppboyLifecycleCallbackListener;-><init>()V

    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/SKApp;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method private setConfig()V
    .locals 3

    .line 484
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->debugMode()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 485
    sput-boolean v2, Lcom/shopkick/app/application/SKApp;->debugPresenceDetection:Z

    .line 486
    sput-object v1, Lcom/shopkick/app/application/SKApp;->debugFileName:Ljava/lang/String;

    const/4 v0, 0x6

    .line 487
    invoke-static {v0}, Lcom/appboy/support/AppboyLogger;->setLogLevel(I)V

    .line 490
    invoke-static {p0}, Lio/branch/referral/Branch;->getAutoInstance(Landroid/content/Context;)Lio/branch/referral/Branch;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/Branch;->enableFacebookAppLinkCheck()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 492
    sput-boolean v0, Lcom/shopkick/app/application/SKApp;->showUrls:Z

    .line 493
    sput-boolean v0, Lcom/shopkick/app/application/SKApp;->printClientLogs:Z

    .line 494
    sput-boolean v2, Lcom/shopkick/app/application/SKApp;->debugPresenceDetection:Z

    .line 495
    sput-object v1, Lcom/shopkick/app/application/SKApp;->debugFileName:Ljava/lang/String;

    const-string v0, "production"

    .line 496
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 498
    invoke-static {p0}, Lio/branch/referral/Branch;->getAutoInstance(Landroid/content/Context;)Lio/branch/referral/Branch;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/Branch;->enableFacebookAppLinkCheck()V

    goto :goto_0

    .line 501
    :cond_1
    invoke-static {}, Lio/branch/referral/Branch;->enableTestMode()V

    const-string v0, "key_test_ogk399HPob5vw5MVgGEkJidnxxk4p0dV"

    .line 502
    invoke-static {p0, v0}, Lio/branch/referral/Branch;->getAutoInstance(Landroid/content/Context;Ljava/lang/String;)Lio/branch/referral/Branch;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/Branch;->enableFacebookAppLinkCheck()V

    .line 506
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->setAppboyConfig()V

    return-void
.end method

.method private static setEnv()V
    .locals 3

    const-string v0, "production"

    .line 413
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "app.shopkick.com"

    .line 414
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string v0, "app2.shopkick.com"

    .line 415
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string v0, "sdk.shopkick.com"

    .line 416
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto/16 :goto_0

    :cond_0
    const-string v0, "qa"

    .line 417
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "beta.shopkick.com"

    .line 418
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string v0, "beta.shopkick.com"

    .line 419
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string v0, "beta.shopkick.com"

    .line 420
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto/16 :goto_0

    :cond_1
    const-string v0, "alpha"

    .line 421
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "alpha.shopkick.com"

    .line 422
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string v0, "alpha.shopkick.com"

    .line 423
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string v0, "alpha.shopkick.com"

    .line 424
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto/16 :goto_0

    :cond_2
    const-string v0, "contentpreview"

    .line 425
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "contentpreview.shopkick.com"

    .line 426
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string v0, "contentpreview.shopkick.com"

    .line 427
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string v0, "contentpreview.shopkick.com"

    .line 428
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto/16 :goto_0

    :cond_3
    const-string v0, "gamma"

    .line 429
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "gamma.shopkick.com"

    .line 430
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string v0, "gamma.shopkick.com"

    .line 431
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string v0, "gamma.shopkick.com"

    .line 432
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto/16 :goto_0

    :cond_4
    const-string v0, "hogtown"

    .line 433
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "hogtown.shopkick.com"

    .line 434
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string v0, "hogtown.shopkick.com"

    .line 435
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string v0, "hogtown.shopkick.com"

    .line 436
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto/16 :goto_0

    :cond_5
    const-string v0, "partnertest"

    .line 437
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "partnertestapp.shopkick.com"

    .line 438
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string v0, "partnertestapp.shopkick.com"

    .line 439
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string v0, "partnertestapp.shopkick.com"

    .line 440
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string v0, "partnertestapp.shopkick.com"

    .line 441
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto :goto_0

    :cond_6
    const-string v0, "pod o gold"

    .line 442
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string/jumbo v0, "treatyourself.shopkick.com"

    .line 443
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string/jumbo v0, "treatyourself.shopkick.com"

    .line 444
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string/jumbo v0, "treatyourself.shopkick.com"

    .line 445
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto :goto_0

    :cond_7
    const-string v0, "pseudoloc"

    .line 446
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "pseudoloc.shopkick.com"

    .line 447
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string v0, "pseudoloc.shopkick.com"

    .line 448
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string v0, "pseudoloc.shopkick.com"

    .line 449
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto :goto_0

    :cond_8
    const-string/jumbo v0, "shopportunity"

    .line 450
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string/jumbo v0, "shopportunity.shopkick.com"

    .line 451
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string/jumbo v0, "shopportunity.shopkick.com"

    .line 452
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string/jumbo v0, "shopportunity.shopkick.com"

    .line 453
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto :goto_0

    :cond_9
    const-string/jumbo v0, "simba"

    .line 454
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string/jumbo v0, "simba.shopkick.com"

    .line 455
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    const-string/jumbo v0, "simba.shopkick.com"

    .line 456
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const-string/jumbo v0, "simba.shopkick.com"

    .line 457
    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    goto :goto_0

    .line 459
    :cond_a
    sget-object v0, Lcom/shopkick/app/application/SKApp;->localAuthority:Ljava/lang/String;

    sput-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    .line 460
    sput-object v0, Lcom/shopkick/app/application/SKApp;->bundleCacheAuthority:Ljava/lang/String;

    const/4 v1, 0x1

    .line 461
    sput-boolean v1, Lcom/shopkick/app/application/SKApp;->disableHTTPS:Z

    const-string v1, ":5000"

    const-string v2, ":21000"

    .line 462
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/application/SKApp;->authDomain:Ljava/lang/String;

    .line 464
    :goto_0
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 465
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/application/SKApp;->gitRevision:Ljava/lang/String;

    sget-object v2, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->setGitRevisionAndAuthority(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    return-void
.end method

.method private setUncaughtExceptionHandler(Landroid/content/Context;Lcom/shopkick/app/application/SKLogger;)V
    .locals 1

    .line 1835
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-nez v0, :cond_0

    .line 1837
    new-instance v0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;-><init>(Lcom/shopkick/app/application/SKApp;Landroid/content/Context;Lcom/shopkick/app/application/SKLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 1840
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p1

    .line 1841
    iget-object p2, p0, Lcom/shopkick/app/application/SKApp;->uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eq p1, p2, :cond_1

    .line 1843
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/application/SKApp;->uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {p1, p2}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    :cond_1
    return-void
.end method

.method private setupApp()V
    .locals 31

    move-object/from16 v6, p0

    .line 550
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 554
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->preloadExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 555
    new-instance v0, Lcom/shopkick/app/application/AppPreferences;

    invoke-direct {v0, v5}, Lcom/shopkick/app/application/AppPreferences;-><init>(Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 556
    new-instance v0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->debugMode()Z

    move-result v2

    invoke-direct {v0, v1, v5, v2}, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;-><init>(Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;Z)V

    .line 557
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->preloadExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->isNewUserFuture:Ljava/util/concurrent/Future;

    .line 559
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getFilesDir()Ljava/io/File;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/application/SKApp;->filesDir:Ljava/io/File;

    .line 561
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->deleteOldImageCacheIfExists()V

    .line 563
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    float-to-double v3, v0

    const-string v0, "121151187906606"

    .line 565
    invoke-static {v0}, Lcom/facebook/FacebookSdk;->setApplicationId(Ljava/lang/String;)V

    const-string v0, "860cbb3ece412195740337f276c300d5"

    .line 566
    invoke-static {v0}, Lcom/facebook/FacebookSdk;->setClientToken(Ljava/lang/String;)V

    .line 567
    invoke-static {v5}, Lcom/facebook/FacebookSdk;->sdkInitialize(Landroid/content/Context;)V

    .line 569
    new-instance v0, Lcom/shopkick/app/application/AppInfo;

    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->generateAppInfo()[B

    move-result-object v8

    .line 570
    invoke-static {v5}, Lcom/shopkick/app/util/AppUtils;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    .line 571
    invoke-static {v5}, Lcom/shopkick/app/util/AppUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "0e8450ff-351e-406d-a365-03f735f87d9f"

    const-string v12, "34e25cc8-61e9-405d-8b71-66a3260ddd6b"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/app/application/AppInfo;-><init>([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->appInfo:Lcom/shopkick/app/application/AppInfo;

    .line 574
    new-instance v0, Lcom/shopkick/app/application/DeveloperInfo;

    const-string v1, "b45db75a53fc2d9c5972c4377030cd1a71240efa"

    invoke-static {v1}, Lcom/shopkick/sdk/scanner/Utils;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v1

    const-string v2, "0e8450ff-351e-406d-a365-03f735f87d9f"

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/application/DeveloperInfo;-><init>([BLjava/lang/String;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

    .line 577
    new-instance v0, Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0}, Lcom/shopkick/app/util/NotificationCenter;-><init>()V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 579
    new-instance v0, Lcom/shopkick/app/account/UserAccount;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appInfo:Lcom/shopkick/app/application/AppInfo;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2, v7}, Lcom/shopkick/app/account/UserAccount;-><init>(Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 581
    new-instance v0, Lcom/shopkick/app/util/Clock;

    invoke-direct {v0}, Lcom/shopkick/app/util/Clock;-><init>()V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->clock:Lcom/shopkick/app/util/Clock;

    const-string v0, "phone"

    .line 583
    invoke-virtual {v6, v0}, Lcom/shopkick/app/application/SKApp;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/telephony/TelephonyManager;

    const-string v0, "account"

    .line 584
    invoke-virtual {v6, v0}, Lcom/shopkick/app/application/SKApp;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/accounts/AccountManager;

    const-string v0, "activity"

    .line 585
    invoke-virtual {v6, v0}, Lcom/shopkick/app/application/SKApp;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/app/ActivityManager;

    .line 586
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 587
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->displayMetrics:Landroid/util/DisplayMetrics;

    const-string/jumbo v1, "wifi"

    .line 589
    invoke-virtual {v5, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Landroid/net/wifi/WifiManager;

    .line 591
    new-instance v1, Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    .line 592
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    .line 596
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    .line 597
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v14

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v15, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    move-object v7, v1

    move-object/from16 v19, v15

    move-object v15, v0

    move-object/from16 v16, v2

    move-object/from16 v18, v5

    invoke-direct/range {v7 .. v19}, Lcom/shopkick/app/application/DeviceInfo;-><init>(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;Landroid/app/ActivityManager;Landroid/accounts/AccountManager;Landroid/telephony/TelephonyManager;Landroid/content/pm/PackageManager;Landroid/content/ContentResolver;Landroid/content/res/Resources;Lcom/shopkick/app/application/LibPreferences;Landroid/net/wifi/WifiManager;Landroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 603
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->fetchAdvertisingId()V

    .line 605
    new-instance v1, Lcom/shopkick/app/controllers/NetworkStatsCounter;

    invoke-direct {v1}, Lcom/shopkick/app/controllers/NetworkStatsCounter;-><init>()V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    .line 606
    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->appInfo:Lcom/shopkick/app/application/AppInfo;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->networkStatsCounter:Lcom/shopkick/app/controllers/NetworkStatsCounter;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->networkManagerLocationProvider:Lcom/shopkick/comm/GeoLocation$LocationProvider;

    sget-boolean v13, Lcom/shopkick/app/application/SKApp;->showUrls:Z

    .line 613
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->debugMode()Z

    move-result v14

    move-object v7, v5

    .line 606
    invoke-static/range {v7 .. v14}, Lcom/shopkick/app/fetchers/network/NetworkManager;->createDefaultNetworkManager(Landroid/content/Context;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/controllers/NetworkStatsCounter;Lcom/shopkick/comm/GeoLocation$LocationProvider;ZZ)Lcom/shopkick/app/fetchers/network/NetworkManager;

    move-result-object v1

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->oldNetworkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

    .line 615
    new-instance v1, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v1, v6, v2}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;-><init>(Landroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->skClientLoggingConfigurationProvider:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    .line 617
    new-instance v1, Lcom/shopkick/app/application/SKLogger;

    sget-boolean v9, Lcom/shopkick/app/application/SKApp;->printClientLogs:Z

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->oldNetworkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->appInfo:Lcom/shopkick/app/application/AppInfo;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    sget-object v13, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    iget-object v14, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    sget-boolean v15, Lcom/shopkick/app/application/SKApp;->disableHTTPS:Z

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->skClientLoggingConfigurationProvider:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    move-object v7, v1

    move-object/from16 v17, v8

    move-object v8, v5

    move-object/from16 v16, v2

    invoke-direct/range {v7 .. v17}, Lcom/shopkick/app/application/SKLogger;-><init>(Landroid/content/Context;ZLcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/LibPreferences;Ljava/lang/String;Lcom/shopkick/app/application/Account;ZLcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/logging/ConfigurationProvider;)V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 627
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-direct {v6, v5, v1}, Lcom/shopkick/app/application/SKApp;->setUncaughtExceptionHandler(Landroid/content/Context;Lcom/shopkick/app/application/SKLogger;)V

    .line 628
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-static {v1}, Lcom/shopkick/app/application/SIP;->initialize(Lcom/shopkick/app/application/SKLogger;)V

    .line 629
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/account/UserAccount;->setLogger(Lcom/shopkick/app/application/SKLogger;)V

    .line 632
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->skClientLoggingConfigurationProvider:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v5, v2}, Lcom/shopkick/logging/LoggerManager;->initialize(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    .line 633
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    const-string v2, "SKApp: Logger initialized"

    const/4 v15, 0x0

    new-array v9, v15, [Ljava/lang/Object;

    invoke-virtual {v1, v7, v8, v2, v9}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 635
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->initializeCommFramework()V

    .line 637
    new-instance v1, Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v9, v9, Lcom/shopkick/app/application/SKLogger;->skDiskLogger:Lcom/shopkick/app/application/SKDiskLogger;

    invoke-direct {v1, v2, v7, v8, v9}, Lcom/shopkick/app/application/ClientFlagsManager;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKDiskLogger;)V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 638
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/ClientFlagsManager;->load()V

    .line 639
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->skClientLoggingConfigurationProvider:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->setClientFlagsManager(Lcom/shopkick/app/application/ClientFlagsManager;)V

    .line 641
    new-instance v1, Lcom/shopkick/app/debug/DebugLogManager;

    invoke-direct {v1}, Lcom/shopkick/app/debug/DebugLogManager;-><init>()V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    .line 643
    new-instance v1, Lcom/shopkick/app/fetchers/image/SKDiskCache;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheSize:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v7, v2

    invoke-direct {v1, v5, v7, v8}, Lcom/shopkick/app/fetchers/image/SKDiskCache;-><init>(Landroid/content/Context;J)V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->skDiskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    .line 644
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    new-instance v2, Lcom/shopkick/app/application/SKApp$1;

    invoke-direct {v2, v6}, Lcom/shopkick/app/application/SKApp$1;-><init>(Lcom/shopkick/app/application/SKApp;)V

    const-string v7, "ClientFlagsUpdated"

    invoke-virtual {v1, v2, v7}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 657
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->skDiskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->open()V

    .line 659
    new-instance v1, Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v1, v2}, Lcom/shopkick/app/application/AppActivityManager;-><init>(Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 660
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AppActivityManagerAppForegroundedEvent"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 661
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AppActivityManagerAppBackgroundedEvent"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 662
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AppActivityManagerSessionEndEvent"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 663
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AppActivityManagerSessionStartEvent"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 664
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "firstUseCompletedByUser"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 665
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "reset_environment"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 666
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "ClientFlagsUpdated"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 667
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "ClientFlagsLoaded"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 668
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "CreateGuestRequestSuccess"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 669
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "LogoutRequestSuccess"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 670
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "DeleteAccountRequestSuccess"

    invoke-virtual {v1, v6, v2, v15}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 671
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "CREDENTIAL_CHECK_SUCCESS"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 672
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "INVITE_TRACKING_DONE"

    invoke-virtual {v1, v6, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 674
    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-static {v1, v2}, Lcom/shopkick/app/util/ShopkickAppStateProvider;->initialize(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;)V

    .line 676
    new-instance v1, Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v1, v2, v0}, Lcom/shopkick/app/application/dialog/DialogsManager;-><init>(Lcom/shopkick/app/application/AppActivityManager;Landroid/content/res/Resources;)V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 678
    new-instance v0, Lcom/shopkick/app/location/SKLocationManager;

    const-string v1, "location"

    .line 679
    invoke-virtual {v6, v1}, Lcom/shopkick/app/application/SKApp;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-direct {v0, v5, v1, v2, v7}, Lcom/shopkick/app/location/SKLocationManager;-><init>(Landroid/content/Context;Landroid/location/LocationManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->skLocMan:Lcom/shopkick/app/location/SKLocationManager;

    .line 682
    new-instance v0, Lcom/shopkick/app/location/SKActivityRecognitionManager;

    invoke-direct {v0, v5}, Lcom/shopkick/app/location/SKActivityRecognitionManager;-><init>(Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->skActivityRecognitionManager:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    .line 683
    new-instance v0, Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/cpg/LocationDataSource;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 684
    new-instance v0, Lcom/shopkick/app/location/LocationNotifier;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->skLocMan:Lcom/shopkick/app/location/SKLocationManager;

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/location/LocationNotifier;-><init>(Lcom/shopkick/app/location/SKLocationManager;Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 686
    new-instance v0, Lcom/shopkick/app/sounds/SoundManager;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-direct {v0, v1}, Lcom/shopkick/app/sounds/SoundManager;-><init>(Lcom/shopkick/app/application/AppPreferences;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 688
    new-instance v0, Lcom/shopkick/app/points/ProfilePoints;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/points/ProfilePoints;-><init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 689
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->load()V

    .line 691
    new-instance v0, Lcom/shopkick/app/application/ProfileInfo;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->skDiskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v7, v0

    move-wide v13, v3

    move v2, v15

    move-object v15, v1

    invoke-direct/range {v7 .. v15}, Lcom/shopkick/app/application/ProfileInfo;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/fetchers/image/SKDiskCache;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/dialog/DialogsManager;DLcom/shopkick/app/application/AppPreferences;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 699
    new-instance v0, Lcom/shopkick/app/telephony/SKTelephonyManager;

    const-string v1, "phone"

    invoke-virtual {v6, v1}, Lcom/shopkick/app/application/SKApp;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-direct {v0, v1, v7}, Lcom/shopkick/app/telephony/SKTelephonyManager;-><init>(Landroid/telephony/TelephonyManager;Lcom/shopkick/app/application/dialog/DialogsManager;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

    .line 701
    new-instance v0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;-><init>(Lcom/shopkick/app/telephony/SKTelephonyManager;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    .line 703
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v0, "reward_info"

    const-string v1, "barcode_image_url"

    const-string v8, "gift_card_image_url"

    const-string v9, "gift_card_tile_image_url"

    .line 704
    filled-new-array {v1, v8, v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "chain_info"

    const-string v1, "chain_white_logo_image_url"

    const-string v8, "chain_logo_image_url"

    .line 706
    filled-new-array {v1, v8}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "scan_info"

    const-string/jumbo v1, "small_image_url"

    .line 708
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    new-instance v8, Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    move-object v0, v8

    move-object v1, v5

    move v15, v2

    move-object v2, v9

    move-wide/from16 v19, v3

    move-object v3, v10

    move-object v4, v7

    move-object v14, v5

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/offline/OfflineDataStore;-><init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Ljava/util/HashMap;Lcom/shopkick/app/application/SKLogger;)V

    iput-object v8, v6, Lcom/shopkick/app/application/SKApp;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    .line 715
    new-instance v0, Lcom/shopkick/app/controllers/FBConnectController;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/controllers/FBConnectController;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    .line 716
    new-instance v0, Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-direct {v0, v14}, Lcom/shopkick/app/registration/GoogleSignInController;-><init>(Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    .line 718
    new-instance v0, Lcom/shopkick/app/account/CredentialStorageController;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-direct {v0, v14, v1, v2, v3}, Lcom/shopkick/app/account/CredentialStorageController;-><init>(Landroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/AppPreferences;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    .line 720
    new-instance v0, Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v5, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    move-object/from16 v21, v0

    move-object/from16 v22, v1

    move-object/from16 v23, v2

    move-object/from16 v24, v3

    move-object/from16 v25, v4

    move-object/from16 v26, v5

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    move-object/from16 v29, v9

    move-object/from16 v30, v10

    invoke-direct/range {v21 .. v30}, Lcom/shopkick/app/account/UserAccountDataSource;-><init>(Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/registration/GoogleSignInController;Lcom/shopkick/app/application/SKLogger;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 730
    new-instance v0, Lcom/shopkick/app/account/Authenticator;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    iget-object v13, v6, Lcom/shopkick/app/application/SKApp;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    move-object v7, v0

    move-object v5, v14

    move-object v14, v1

    move v4, v15

    move-object v15, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v5

    invoke-direct/range {v7 .. v17}, Lcom/shopkick/app/account/Authenticator;-><init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/controllers/FBConnectController;Lcom/shopkick/app/registration/GoogleSignInController;Lcom/shopkick/app/account/CredentialStorageController;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/dialog/DialogsManager;Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->authenticator:Lcom/shopkick/app/account/Authenticator;

    .line 743
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-static {v0, v1, v5}, Lcom/shopkick/app/application/CrashlyticsWrapper;->init(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;)V

    .line 744
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/application/SKApp;->gitRevision:Ljava/lang/String;

    sget-object v2, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->setGitRevisionAndAuthority(Ljava/lang/String;Ljava/lang/String;)V

    .line 745
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-static {v0, v1, v5}, Lcom/shopkick/app/application/CrashlyticsAppender;->initialize(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;)V

    .line 746
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsAppender;->getInstance()Lcom/shopkick/app/application/CrashlyticsAppender;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/application/SKApp;->gitRevision:Ljava/lang/String;

    sget-object v2, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsAppender;->setGitRevisionAndAuthority(Ljava/lang/String;Ljava/lang/String;)V

    .line 747
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsAppender;->getInstance()Lcom/shopkick/app/application/CrashlyticsAppender;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->registerAppender(Lcom/shopkick/logging/Appender;)V

    .line 748
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/logging/AppboyAppender;

    invoke-direct {v1, v6}, Lcom/shopkick/app/logging/AppboyAppender;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/logging/EventLogger;->registerAppender(Lcom/shopkick/logging/Appender;)V

    .line 749
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/logging/BranchAppender;

    invoke-direct {v1}, Lcom/shopkick/app/logging/BranchAppender;-><init>()V

    invoke-virtual {v0, v1}, Lcom/shopkick/logging/EventLogger;->registerAppender(Lcom/shopkick/logging/Appender;)V

    .line 751
    new-instance v0, Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

    invoke-direct {v0}, Lcom/shopkick/app/util/SKMediaScannerConnectionClient;-><init>()V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->mediaScannerClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

    .line 752
    new-instance v0, Landroid/media/MediaScannerConnection;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->mediaScannerClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

    invoke-direct {v0, v5, v1}, Landroid/media/MediaScannerConnection;-><init>(Landroid/content/Context;Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->mediaScannerConnection:Landroid/media/MediaScannerConnection;

    .line 754
    new-instance v0, Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/graphics/ButtonDrawableFactory;-><init>(Landroid/content/res/Resources;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    .line 756
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v0

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->screenInfo:Lcom/shopkick/app/screens/ScreenInfo;

    .line 758
    new-instance v0, Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-direct {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;-><init>()V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 760
    new-instance v9, Lcom/shopkick/app/gcm/PushEventDispatcher;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {v9, v5, v0}, Lcom/shopkick/app/gcm/PushEventDispatcher;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 761
    new-instance v0, Lcom/shopkick/app/gcm/AppUrlDispatchHandler;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-direct {v0, v1}, Lcom/shopkick/app/gcm/AppUrlDispatchHandler;-><init>(Lcom/shopkick/app/url/URLDispatcherFactory;)V

    invoke-virtual {v9, v0}, Lcom/shopkick/app/gcm/PushEventDispatcher;->registerHandler(Lcom/shopkick/app/gcm/PushEventHandler;)V

    .line 763
    new-instance v0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;

    invoke-direct {v0, v6}, Lcom/shopkick/app/util/badge/BadgeProviderFactory;-><init>(Landroid/content/Context;)V

    .line 764
    invoke-virtual {v0}, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->getBadgeProvider()Lcom/shopkick/app/util/badge/IBadgeProvider;

    move-result-object v15

    .line 766
    new-instance v0, Lcom/shopkick/app/gcm/GCMDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/gcm/GCMDataSource;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->gcmDataSource:Lcom/shopkick/app/gcm/GCMDataSource;

    .line 768
    new-instance v7, Lcom/shopkick/app/gcm/GCMLifeCycle;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->gcmDataSource:Lcom/shopkick/app/gcm/GCMDataSource;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    move-object v0, v7

    move-object v1, v5

    move v14, v4

    move-object v4, v8

    move-object v13, v5

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/gcm/GCMLifeCycle;-><init>(Landroid/content/Context;Lcom/shopkick/app/gcm/GCMDataSource;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;)V

    iput-object v7, v6, Lcom/shopkick/app/application/SKApp;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    .line 769
    new-instance v0, Lcom/shopkick/app/controllers/BadgeManager;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2, v15, v13}, Lcom/shopkick/app/controllers/BadgeManager;-><init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/util/badge/IBadgeProvider;Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

    .line 770
    new-instance v0, Lcom/shopkick/app/application/AppLaunchController;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->appInfo:Lcom/shopkick/app/application/AppInfo;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

    move-object v7, v0

    move-object v5, v13

    move-object v13, v1

    move v1, v14

    move-object v14, v2

    move-object v2, v15

    move-object v15, v3

    move-object/from16 v16, v2

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    invoke-direct/range {v7 .. v18}, Lcom/shopkick/app/application/AppLaunchController;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/gcm/PushEventDispatcher;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/gcm/GCMLifeCycle;Lcom/shopkick/app/util/badge/IBadgeProvider;Lcom/shopkick/app/controllers/BadgeManager;Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    .line 781
    new-instance v7, Lcom/shopkick/app/logging/UserAcquisitionReporter;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v0, v7

    move v15, v1

    move-object/from16 v1, p0

    move-object v14, v5

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/logging/UserAcquisitionReporter;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;)V

    iput-object v7, v6, Lcom/shopkick/app/application/SKApp;->userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

    .line 790
    new-instance v0, Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v13, v6, Lcom/shopkick/app/application/SKApp;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    move-object v7, v0

    move-object v5, v14

    move v4, v15

    move-wide/from16 v15, v19

    invoke-direct/range {v7 .. v16}, Lcom/shopkick/app/rewards/RewardsDataController;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/points/ProfilePoints;Landroid/content/Context;D)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 802
    new-instance v0, Lcom/shopkick/app/video/VideoController;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v13, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v14, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v15, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    sget-object v17, Lcom/shopkick/app/application/SKApp;->MOAT_PARTNER_CODE_VIDEO_PRODUCTION:Ljava/lang/String;

    move-object v7, v0

    move-object v8, v5

    move-object/from16 v16, v1

    invoke-direct/range {v7 .. v17}, Lcom/shopkick/app/video/VideoController;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/ProfileInfo;Ljava/lang/String;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 816
    new-instance v0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v0, v5, v1, v2, v3}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;-><init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 818
    new-instance v0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v13, v6, Lcom/shopkick/app/application/SKApp;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v14, v6, Lcom/shopkick/app/application/SKApp;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v15, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    move-object v7, v0

    invoke-direct/range {v7 .. v15}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Lcom/shopkick/app/account/UserAccount;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const-string v0, "app-29db5f25f8264e26"

    .line 834
    new-instance v1, Lcom/shopkick/app/application/-$$Lambda$SKApp$tfkHN5SRIBQOgz4sP9v6wF9o_DQ;

    invoke-direct {v1, v6}, Lcom/shopkick/app/application/-$$Lambda$SKApp$tfkHN5SRIBQOgz4sP9v6wF9o_DQ;-><init>(Lcom/shopkick/app/application/SKApp;)V

    invoke-static {v6, v0, v1}, Lcom/usebutton/sdk/Button;->configure(Landroid/content/Context;Ljava/lang/String;Lcom/usebutton/sdk/Button$OnConfigureListener;)V

    .line 845
    new-instance v0, Lcom/shopkick/app/util/TextStyleConfigurator;

    invoke-direct {v0}, Lcom/shopkick/app/util/TextStyleConfigurator;-><init>()V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    .line 846
    new-instance v0, Lcom/shopkick/app/util/ViewBuilder;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    invoke-direct {v0, v1}, Lcom/shopkick/app/util/ViewBuilder;-><init>(Lcom/shopkick/app/util/TextStyleConfigurator;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 848
    new-instance v0, Lcom/shopkick/app/util/AlarmScheduler;

    invoke-direct {v0, v5}, Lcom/shopkick/app/util/AlarmScheduler;-><init>(Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    .line 849
    new-instance v0, Lcom/shopkick/app/queue/SKPersistentQueue;

    const-string v1, "queued_requests_file.dat"

    sget-object v2, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    invoke-direct {v0, v5, v1, v2}, Lcom/shopkick/app/queue/SKPersistentQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 852
    new-instance v0, Lcom/shopkick/app/queue/SKPersistentQueue;

    const-string v1, "queued_responses_file.dat"

    sget-object v2, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    invoke-direct {v0, v5, v1, v2}, Lcom/shopkick/app/queue/SKPersistentQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 856
    new-instance v0, Lcom/shopkick/app/awards/AwardsManager;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    iget-object v13, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v14, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v15, v6, Lcom/shopkick/app/application/SKApp;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    move-object v7, v0

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    invoke-direct/range {v7 .. v18}, Lcom/shopkick/app/awards/AwardsManager;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/queue/SKPersistentQueue;Lcom/shopkick/app/queue/SKPersistentQueue;Lcom/shopkick/app/points/ProfilePoints;Lcom/shopkick/app/account/UserAccount;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    .line 868
    new-instance v0, Lcom/shopkick/app/points/PointsController;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-direct {v0, v1, v2, v3, v7}, Lcom/shopkick/app/points/PointsController;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/points/ProfilePoints;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->pointsController:Lcom/shopkick/app/points/PointsController;

    .line 874
    new-instance v0, Lcom/shopkick/app/application/BundleFiles;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/application/BundleFiles;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->bundleFiles:Lcom/shopkick/app/application/BundleFiles;

    .line 875
    new-instance v12, Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->bundleFiles:Lcom/shopkick/app/application/BundleFiles;

    .line 876
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->debugMode()Z

    move-result v1

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v12, v0, v1, v2}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;-><init>(Lcom/shopkick/app/application/BundleFiles;ZLcom/shopkick/app/application/AppActivityManager;)V

    .line 878
    new-instance v0, Lcom/shopkick/app/presence/AudioRecordFactory;

    const v1, 0xac44

    const/16 v2, 0x10

    const/4 v3, 0x2

    const/16 v7, 0x2000

    invoke-direct {v0, v1, v2, v3, v7}, Lcom/shopkick/app/presence/AudioRecordFactory;-><init>(IIII)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->audioFactory:Lcom/shopkick/app/presence/AudioRecordFactory;

    .line 882
    new-instance v7, Lcom/shopkick/app/presence/AudioThreadController;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->audioFactory:Lcom/shopkick/app/presence/AudioRecordFactory;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v0, v7

    move-object v1, v5

    move-object v2, v12

    move v15, v4

    move-object v4, v8

    move-object v14, v5

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/presence/AudioThreadController;-><init>(Landroid/content/Context;Lcom/shopkick/app/presence/NativePresencePipelineInterop;Lcom/shopkick/app/telephony/PhoneCallStateNotifier;Lcom/shopkick/app/presence/AudioRecordFactory;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v7, v6, Lcom/shopkick/app/application/SKApp;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    .line 887
    new-instance v0, Lcom/shopkick/app/chains/ChainDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/chains/ChainDataSource;-><init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    .line 888
    new-instance v0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;-><init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->transmitterDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    .line 891
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/shopkick/app/application/SKApp;->filesDir:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Walkins"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "history_v1.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 892
    new-instance v1, Lcom/shopkick/app/persistence/PersistentMap;

    invoke-direct {v1, v0}, Lcom/shopkick/app/persistence/PersistentMap;-><init>(Ljava/lang/String;)V

    iput-object v1, v6, Lcom/shopkick/app/application/SKApp;->walkinHistory:Lcom/shopkick/app/persistence/PersistentMap;

    .line 893
    new-instance v0, Lcom/shopkick/app/presence/WalkinController;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->clock:Lcom/shopkick/app/util/Clock;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->walkinHistory:Lcom/shopkick/app/persistence/PersistentMap;

    iget-object v5, v6, Lcom/shopkick/app/application/SKApp;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 903
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v27

    move-object/from16 v16, v0

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v7

    move-object/from16 v23, v8

    move-object/from16 v24, v9

    move-object/from16 v25, v10

    move-object/from16 v26, v11

    invoke-direct/range {v16 .. v27}, Lcom/shopkick/app/presence/WalkinController;-><init>(Lcom/shopkick/app/util/Clock;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/awards/AwardsManager;Ljava/util/Map;Lcom/shopkick/app/chains/ChainDataSource;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/logging/UserAcquisitionReporter;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/AppActivityManager;Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    .line 904
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 905
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 906
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "SKApp: WalkinController created"

    new-array v4, v15, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 908
    new-instance v0, Lcom/shopkick/app/presence/PresenceController;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v13, v6, Lcom/shopkick/app/application/SKApp;->transmitterDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->clock:Lcom/shopkick/app/util/Clock;

    sget-object v16, Lcom/shopkick/app/application/SKApp;->debugFileName:Ljava/lang/String;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v5, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    move-object v7, v0

    move-object/from16 v20, v8

    move-object v8, v14

    move-object/from16 v22, v14

    move-object v14, v1

    move v1, v15

    move-object v15, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-direct/range {v7 .. v20}, Lcom/shopkick/app/presence/PresenceController;-><init>(Landroid/content/Context;Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/presence/NativePresencePipelineInterop;Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/util/Clock;Ljava/lang/String;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/presence/WalkinController;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    .line 921
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 922
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 923
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "SKApp: PresenceController created"

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 925
    new-instance v7, Lcom/shopkick/app/fetchers/LocationListManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->oldNetworkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    iget-object v5, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v0, v7

    move v15, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/fetchers/LocationListManager;-><init>(Landroid/app/Application;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/presence/PresenceController;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v7, v6, Lcom/shopkick/app/application/SKApp;->locationListManager:Lcom/shopkick/app/fetchers/LocationListManager;

    .line 930
    new-instance v0, Lcom/shopkick/app/geofencing/GeofenceManager;

    .line 931
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->debugMode()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v13, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v14, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->skActivityRecognitionManager:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->skLocMan:Lcom/shopkick/app/location/SKLocationManager;

    iget-object v5, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    move-object/from16 v21, v7

    move-object v7, v0

    move-object/from16 v20, v8

    move-object/from16 v8, v22

    move-object v15, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-direct/range {v7 .. v21}, Lcom/shopkick/app/geofencing/GeofenceManager;-><init>(Landroid/content/Context;Ljava/lang/Boolean;Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/debug/DebugLogManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/location/SKActivityRecognitionManager;Lcom/shopkick/app/location/SKLocationManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/presence/WalkinController;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    .line 945
    new-instance v0, Lcom/shopkick/app/widget/SKSignalViewFactory;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, v6, Lcom/shopkick/app/application/SKApp;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    move-object/from16 v23, v0

    move-object/from16 v24, v1

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v27, v4

    move-object/from16 v28, v5

    invoke-direct/range {v23 .. v28}, Lcom/shopkick/app/widget/SKSignalViewFactory;-><init>(Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/graphics/ButtonDrawableFactory;Lcom/shopkick/app/presence/PresenceController;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/presence/AudioThreadController;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

    .line 951
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFirstUseCompleted()Z

    move-result v0

    const/4 v15, 0x1

    xor-int/2addr v0, v15

    iput-boolean v0, v6, Lcom/shopkick/app/application/SKApp;->inFirstUseMode:Z

    .line 957
    new-instance v7, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 959
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->mediaScannerConnection:Landroid/media/MediaScannerConnection;

    iget-object v5, v6, Lcom/shopkick/app/application/SKApp;->mediaScannerClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

    move-object v0, v7

    move-object/from16 v1, v22

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/AppActivityManager;Landroid/content/ContentResolver;Landroid/media/MediaScannerConnection;Lcom/shopkick/app/util/SKMediaScannerConnectionClient;)V

    iput-object v7, v6, Lcom/shopkick/app/application/SKApp;->profilePictureHelperFactory:Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

    .line 963
    new-instance v0, Lcom/shopkick/app/SKPersistentCache/APICache;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->skDiskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/SKPersistentCache/APICache;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/image/SKDiskCache;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    .line 965
    new-instance v0, Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v13, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v7, v0

    move-object/from16 v11, v22

    invoke-direct/range {v7 .. v13}, Lcom/shopkick/app/stories/StoriesDataSource;-><init>(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    .line 972
    new-instance v0, Lcom/shopkick/app/graphics/BitmapHelpers;

    move-object/from16 v14, v22

    invoke-direct {v0, v14}, Lcom/shopkick/app/graphics/BitmapHelpers;-><init>(Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    .line 974
    new-instance v7, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    move-object v0, v7

    move-object v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;-><init>(Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/fetchers/api/APIManager;Landroid/content/Context;)V

    iput-object v7, v6, Lcom/shopkick/app/application/SKApp;->localNotificationCenter:Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;

    .line 980
    new-instance v0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;-><init>(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

    .line 982
    new-instance v0, Lcom/shopkick/app/location/NearbyLocationsDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/location/NearbyLocationsDataSource;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

    .line 986
    new-instance v0, Lcom/shopkick/app/launch/FirstUseControllerV2;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/app/launch/FirstUseControllerV2;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 993
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->checkUserAlreadyRegisteredAndShouldSkipFirstUse()Z

    move-result v0

    xor-int/2addr v0, v15

    iput-boolean v0, v6, Lcom/shopkick/app/application/SKApp;->inFirstUseMode:Z

    .line 995
    new-instance v0, Lcom/shopkick/app/invite/InviteTrackingController;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/invite/InviteTrackingController;-><init>(Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/SKLogger;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->inviteTrackingController:Lcom/shopkick/app/invite/InviteTrackingController;

    .line 1000
    new-instance v0, Lcom/shopkick/app/controllers/PhoneVerificationController;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/controllers/PhoneVerificationController;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    .line 1005
    new-instance v0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcherFactory;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/controllers/PhoneVerificationController;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    .line 1010
    new-instance v0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->appInfo:Lcom/shopkick/app/application/AppInfo;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/app/controllers/SKDeskIntegrationController;-><init>(Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppActivityManager;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    .line 1016
    new-instance v0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    move-object v7, v0

    move-object v13, v14

    invoke-direct/range {v7 .. v13}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;-><init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/SKLogger;Landroid/content/Context;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    .line 1023
    new-instance v0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v9, v6, Lcom/shopkick/app/application/SKApp;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v10, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v11, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v12, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v13, v6, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v7, v0

    move-object v8, v14

    move-object v5, v14

    move-object v14, v1

    move v1, v15

    move-object v15, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    invoke-direct/range {v7 .. v17}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;-><init>(Landroid/content/Context;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/awards/AwardsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/AppPreferences;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 1034
    new-instance v0, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    .line 1035
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v16

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v8, v6, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    move-object v15, v0

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    invoke-direct/range {v15 .. v21}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;-><init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/awards/AwardsManager;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    .line 1043
    new-instance v0, Lcom/shopkick/app/products/PostScanNotificationController;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v5, v2, v3}, Lcom/shopkick/app/products/PostScanNotificationController;-><init>(Landroid/content/Context;Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    .line 1048
    new-instance v0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    invoke-direct {v0, v5, v2, v3}, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/AlarmScheduler;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->receiptScanAvailableHandler:Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;

    .line 1051
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->receiptScanAvailableHandler:Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;

    const-string v3, "ScanBCSucceeded"

    invoke-virtual {v0, v2, v3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 1052
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->receiptScanAvailableHandler:Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;

    const-string v3, "WalkinControllerWalkinSucceededEvent"

    invoke-virtual {v0, v2, v3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 1054
    new-instance v0, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v4, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v0, v5, v2, v3, v4}, Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;-><init>(Landroid/content/Context;Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->kickstarterBonusReminderController:Lcom/shopkick/app/localNotificationCenter/KickstarterBonusReminderController;

    .line 1059
    new-instance v0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v2

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 1061
    invoke-static {v5}, Lcom/shopkick/app/util/AppUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    iget-object v7, v6, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-direct {v0, v2, v3, v4, v7}, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/DeviceInfo;Ljava/lang/String;Lcom/shopkick/app/account/UserAccount;)V

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->skInternalFeedbackButtonHelper:Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

    .line 1064
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->initScreenGlobals()V

    .line 1065
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->authenticator:Lcom/shopkick/app/account/Authenticator;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/account/Authenticator;->setProfileInfo(Lcom/shopkick/app/application/ProfileInfo;)V

    .line 1068
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->initializeCommFrameworkFeatures()V

    .line 1070
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-static {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->init(Lcom/shopkick/app/application/ScreenGlobals;)V

    .line 1072
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->setupHandlers()V

    .line 1073
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->registerCommonHandlers()V

    .line 1081
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v3, v6, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0, v5, v2, v3}, Lcom/shopkick/app/application/ThirdPartyManager;->init(Lcom/shopkick/app/util/NotificationCenter;Landroid/content/Context;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)Lcom/shopkick/app/application/ThirdPartyManager;

    .line 1084
    new-instance v0, Lcom/moat/analytics/mobile/spck/MoatOptions;

    invoke-direct {v0}, Lcom/moat/analytics/mobile/spck/MoatOptions;-><init>()V

    .line 1085
    iput-boolean v1, v0, Lcom/moat/analytics/mobile/spck/MoatOptions;->disableAdIdCollection:Z

    .line 1086
    iput-boolean v1, v0, Lcom/moat/analytics/mobile/spck/MoatOptions;->disableLocationServices:Z

    const/4 v1, 0x0

    .line 1087
    iput-boolean v1, v0, Lcom/moat/analytics/mobile/spck/MoatOptions;->loggingEnabled:Z

    .line 1088
    invoke-static {}, Lcom/moat/analytics/mobile/spck/MoatAnalytics;->getInstance()Lcom/moat/analytics/mobile/spck/MoatAnalytics;

    move-result-object v1

    invoke-virtual {v1, v0, v6}, Lcom/moat/analytics/mobile/spck/MoatAnalytics;->start(Lcom/moat/analytics/mobile/spck/MoatOptions;Landroid/app/Application;)V

    .line 1089
    invoke-static {}, Lcom/moat/analytics/mobile/spck/MoatAnalytics;->getInstance()Lcom/moat/analytics/mobile/spck/MoatAnalytics;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/application/SKApp;->MOAT_PARTNER_CODE_DISPLAY_PRODUCTION:Ljava/lang/String;

    .line 1090
    invoke-virtual {v0, v1}, Lcom/moat/analytics/mobile/spck/MoatAnalytics;->prepareNativeDisplayTracking(Ljava/lang/String;)V

    .line 1093
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->BOOT_UP_PERMISSIONS:[Ljava/lang/String;

    invoke-static {v0, v6}, Lcom/shopkick/app/permissions/PermissionUtils;->arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1094
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/application/SKApp;->initializeSDKClientAccessor()V

    .line 1098
    :cond_1
    iget-object v0, v6, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, v6, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/RadarSDKUtils;->updateRadarTracking(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)V

    .line 1100
    invoke-static/range {p0 .. p0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    iput-object v0, v6, Lcom/shopkick/app/application/SKApp;->mFirebaseAnalytics:Lcom/google/firebase/analytics/FirebaseAnalytics;

    return-void
.end method

.method private setupHandlers()V
    .locals 12

    .line 1228
    new-instance v0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->actionSheetHandler:Lcom/shopkick/app/urlhandlers/ActionSheetHandler;

    .line 1229
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "actionsheet"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->actionSheetHandler:Lcom/shopkick/app/urlhandlers/ActionSheetHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1231
    new-instance v0, Lcom/shopkick/app/urlhandlers/APICallHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/APICallHandler;-><init>(Lcom/shopkick/fetchers/api/APIManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->apiCallHandler:Lcom/shopkick/app/urlhandlers/APICallHandler;

    .line 1232
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "apicall"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->apiCallHandler:Lcom/shopkick/app/urlhandlers/APICallHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1234
    new-instance v0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->bcEnrollmentHandler:Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;

    .line 1235
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "launch_buy_and_collect"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->bcEnrollmentHandler:Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1237
    new-instance v0, Lcom/shopkick/app/urlhandlers/CloseHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/CloseHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->closeHandler:Lcom/shopkick/app/urlhandlers/CloseHandler;

    .line 1238
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "close"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->closeHandler:Lcom/shopkick/app/urlhandlers/CloseHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1240
    new-instance v0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->customActionSheetHandler:Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;

    .line 1241
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "custom_action_sheet"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->customActionSheetHandler:Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1243
    new-instance v0, Lcom/shopkick/app/urlhandlers/EmailHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/EmailHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->emailHandler:Lcom/shopkick/app/urlhandlers/EmailHandler;

    .line 1244
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "email"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->emailHandler:Lcom/shopkick/app/urlhandlers/EmailHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1246
    new-instance v0, Lcom/shopkick/app/urlhandlers/LogHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/LogHandler;-><init>(Lcom/shopkick/app/application/SKLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->logHandler:Lcom/shopkick/app/urlhandlers/LogHandler;

    .line 1247
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "log"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->logHandler:Lcom/shopkick/app/urlhandlers/LogHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1249
    new-instance v0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/url/URLDispatcherFactory;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->modalWebViewHandler:Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;

    .line 1250
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "modalwebview"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->modalWebViewHandler:Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1252
    new-instance v0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->rewardHandler:Lcom/shopkick/app/urlhandlers/RewardUsedHandler;

    .line 1253
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string/jumbo v1, "update_reward_used"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->rewardHandler:Lcom/shopkick/app/urlhandlers/RewardUsedHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1255
    new-instance v0, Lcom/shopkick/app/urlhandlers/RegisterHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/RegisterHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccount;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->registerHandler:Lcom/shopkick/app/urlhandlers/RegisterHandler;

    .line 1256
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "register"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->registerHandler:Lcom/shopkick/app/urlhandlers/RegisterHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1258
    new-instance v0, Lcom/shopkick/app/urlhandlers/ScreenHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/ScreenHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenHandler:Lcom/shopkick/app/urlhandlers/ScreenHandler;

    .line 1259
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "screen"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->screenHandler:Lcom/shopkick/app/urlhandlers/ScreenHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1261
    new-instance v0, Lcom/shopkick/app/urlhandlers/SMSHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/SMSHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->smsHandler:Lcom/shopkick/app/urlhandlers/SMSHandler;

    .line 1262
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string/jumbo v1, "sms"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->smsHandler:Lcom/shopkick/app/urlhandlers/SMSHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1264
    new-instance v0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/controllers/PhoneVerificationController;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->phoneVerificationHandler:Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;

    .line 1268
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string/jumbo v1, "verify"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->phoneVerificationHandler:Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1270
    new-instance v0, Lcom/shopkick/app/urlhandlers/VideoHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/VideoHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->videoHandler:Lcom/shopkick/app/urlhandlers/VideoHandler;

    .line 1271
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string/jumbo v1, "video"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->videoHandler:Lcom/shopkick/app/urlhandlers/VideoHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1273
    new-instance v0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->saveStoryHandler:Lcom/shopkick/app/urlhandlers/SaveStoryHandler;

    .line 1274
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "save_story"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->saveStoryHandler:Lcom/shopkick/app/urlhandlers/SaveStoryHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1276
    new-instance v0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;-><init>(Lcom/shopkick/app/launch/FirstUseControllerV2;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->firstUseNextHandler:Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;

    .line 1277
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "first_use_next"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->firstUseNextHandler:Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1278
    new-instance v0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/SKLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->shareFacebookHandler:Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;

    .line 1279
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string/jumbo v1, "share_facebook"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->shareFacebookHandler:Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1281
    new-instance v0, Lcom/shopkick/app/urlhandlers/InviteHandler;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v5, p0, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v6, p0, Lcom/shopkick/app/application/SKApp;->authenticator:Lcom/shopkick/app/account/Authenticator;

    iget-object v7, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v8, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/urlhandlers/InviteHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/account/Authenticator;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->inviteHandler:Lcom/shopkick/app/urlhandlers/InviteHandler;

    .line 1286
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "invite"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->inviteHandler:Lcom/shopkick/app/urlhandlers/InviteHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1288
    new-instance v0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v5, p0, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 1290
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v6

    iget-object v7, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v8, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v9, p0, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v10, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v11, v1, Lcom/shopkick/app/application/ScreenGlobals;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/tracking/TrackingUrlManager;)V

    .line 1296
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v2, "redeem_promo_code"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1298
    new-instance v0, Lcom/shopkick/app/urlhandlers/MarketingPromoCodeRedeemHandler;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v5, p0, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 1300
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v6

    iget-object v7, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v8, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v9, p0, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v10, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v11, v1, Lcom/shopkick/app/application/ScreenGlobals;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, Lcom/shopkick/app/urlhandlers/MarketingPromoCodeRedeemHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/tracking/TrackingUrlManager;)V

    .line 1306
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v2, "redeem_marketing_promo_code"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1308
    new-instance v0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->offerWebViewHandler:Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;

    .line 1311
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "offer"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->offerWebViewHandler:Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1313
    new-instance v0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->externalDeeplinkHandler:Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;

    .line 1314
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "deeplink"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->externalDeeplinkHandler:Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1316
    new-instance v0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->resetPasswordHandler:Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;

    .line 1317
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "reset_password"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->resetPasswordHandler:Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1319
    new-instance v0, Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/fetchers/api/APIManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->emailVerificationHandler:Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;

    .line 1320
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "email_verify"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->emailVerificationHandler:Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1322
    new-instance v0, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->authCodeLoginHandler:Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;

    .line 1323
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v1, "auth_code_login"

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->authCodeLoginHandler:Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    .line 1325
    new-instance v0, Lcom/shopkick/app/urlhandlers/DataOptOutHandler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/DataOptOutHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/fetchers/api/APIManager;)V

    .line 1326
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string v2, "marketing_data_opt_out"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V

    return-void
.end method

.method private trackLaunch()V
    .locals 2

    .line 1808
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->isNewUserFuture:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1812
    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 1810
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 1814
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->preloadExecutorService:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 1815
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_0
    const/4 v0, 0x0

    .line 1817
    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->preloadExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 1818
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserAcquisitionReporter;->reportEvent(I)V

    return-void
.end method


# virtual methods
.method public checkAndStartRecording()V
    .locals 1

    const-string v0, "android.permission.RECORD_AUDIO"

    .line 1823
    invoke-static {v0, p0}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1824
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableUltrasonicWalkins:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-boolean v0, v0, Lcom/shopkick/app/application/AppActivityManager;->mIsBackgrounded:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/shopkick/app/application/SKApp;->debugPresenceDetection:Z

    if-nez v0, :cond_0

    .line 1826
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->startPresenceListening()V

    .line 1829
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->locationListManager:Lcom/shopkick/app/fetchers/LocationListManager;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/LocationListManager;->installServerUpdates()V

    :cond_0
    return-void
.end method

.method public debugMode()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAuthority()Ljava/lang/String;
    .locals 1

    .line 470
    sget-object v0, Lcom/shopkick/app/application/SKApp;->authority:Ljava/lang/String;

    return-object v0
.end method

.method public initScreenGlobals()V
    .locals 9

    .line 1146
    new-instance v0, Lcom/shopkick/app/application/ScreenGlobals;

    invoke-direct {v0}, Lcom/shopkick/app/application/ScreenGlobals;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 1147
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    .line 1148
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 1149
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 1150
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    .line 1151
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    .line 1152
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 1153
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 1154
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appInfo:Lcom/shopkick/app/application/AppInfo;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->appInfo:Lcom/shopkick/app/application/AppInfo;

    .line 1155
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

    .line 1156
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    .line 1157
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 1158
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    .line 1159
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

    .line 1160
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    .line 1161
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    .line 1162
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->profilePictureHelperFactory:Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->profilePictureHelperFactory:Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

    .line 1163
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    .line 1164
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

    .line 1165
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 1166
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    .line 1167
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    .line 1168
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 1169
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->displayMetrics:Landroid/util/DisplayMetrics;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->displayMetrics:Landroid/util/DisplayMetrics;

    .line 1170
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    .line 1171
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 1172
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    .line 1173
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    .line 1174
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    .line 1175
    new-instance v1, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->instantBonusAwarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

    .line 1176
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->localNotificationCenter:Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->localNotificationCenter:Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;

    .line 1177
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 1178
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 1179
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 1180
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

    .line 1181
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 1182
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    .line 1183
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    .line 1184
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    .line 1185
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    .line 1186
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    .line 1187
    new-instance v1, Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/products/ProductsDataSource;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    .line 1188
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 1189
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 1190
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    .line 1191
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 1192
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 1193
    new-instance v1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v1, v2, v3, v4}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;-><init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    .line 1196
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    new-instance v1, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v1, v2, v3, v4}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;-><init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    .line 1199
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 1200
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    .line 1201
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

    .line 1202
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 1203
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    .line 1204
    new-instance v1, Lcom/shopkick/app/storycards/StoryCardDataSource;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/storycards/StoryCardDataSource;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    .line 1205
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 1206
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

    .line 1207
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    .line 1208
    new-instance v1, Lcom/shopkick/app/tracking/TrackingUrlManager;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    new-instance v6, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    const-string v2, "connectivity"

    .line 1211
    invoke-virtual {p0, v2}, Lcom/shopkick/app/application/SKApp;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    invoke-direct {v6, v2}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;-><init>(Landroid/net/ConnectivityManager;)V

    .line 1212
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    iget-object v8, p0, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/tracking/TrackingUrlManager;-><init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/fetchers/network/SKConnectivityManager;Landroid/content/Context;Lcom/shopkick/app/application/DeviceInfo;)V

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    .line 1214
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->transmitterDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    .line 1215
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 1216
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 1217
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 1218
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->userAcquisitionReporter:Lcom/shopkick/app/logging/UserAcquisitionReporter;

    .line 1219
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 1220
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->authenticator:Lcom/shopkick/app/account/Authenticator;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->authenticator:Lcom/shopkick/app/account/Authenticator;

    .line 1221
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    .line 1222
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->videoController:Lcom/shopkick/app/video/VideoController;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 1223
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->skInternalFeedbackButtonHelper:Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

    iput-object v1, v0, Lcom/shopkick/app/application/ScreenGlobals;->skInternalFeedbackButtonHelper:Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;

    .line 1224
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v3, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/shopkick/app/invite/InviteDataManager;->initialize(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V

    return-void
.end method

.method public initializeSDKClientAccessor()V
    .locals 4

    .line 1575
    iget-boolean v0, p0, Lcom/shopkick/app/application/SKApp;->isSDKClientAccessorInitialized:Z

    if-eqz v0, :cond_0

    return-void

    .line 1577
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 1578
    invoke-static {}, Lcom/shopkick/app/util/ShopkickAppStateProvider;->getInstance()Lcom/shopkick/app/util/ShopkickAppStateProvider;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    new-instance v3, Lcom/shopkick/app/application/SKApp$2;

    invoke-direct {v3, p0}, Lcom/shopkick/app/application/SKApp$2;-><init>(Lcom/shopkick/app/application/SKApp;)V

    .line 1577
    invoke-static {v0, v1, v2, v3}, Lcom/shopkick/app/sdk/SDKClientAccessor;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 1622
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->setupLocationManager()V

    .line 1623
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->setupGeoFenceSensor()V

    .line 1624
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/WalkinController;->setupGeoFenceSensor()V

    const/4 v0, 0x1

    .line 1626
    iput-boolean v0, p0, Lcom/shopkick/app/application/SKApp;->isSDKClientAccessorInitialized:Z

    return-void
.end method

.method public isProdEnv()Z
    .locals 2

    const-string v0, "production"

    .line 409
    sget-object v1, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public onCreate()V
    .locals 3

    .line 527
    invoke-super {p0}, Landroid/support/multidex/MultiDexApplication;->onCreate()V

    .line 528
    sput-object p0, Lcom/shopkick/app/application/SKApp;->instance:Lcom/shopkick/app/application/SKApp;

    .line 529
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/high16 v2, 0x7f110000

    .line 531
    invoke-virtual {p0, v2}, Lcom/shopkick/app/application/SKApp;->getString(I)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/shopkick/app/application/SKApp;->localAuthority:Ljava/lang/String;

    const v2, 0x7f1102b3

    .line 532
    invoke-virtual {p0, v2}, Lcom/shopkick/app/application/SKApp;->getString(I)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/shopkick/app/application/SKApp;->env:Ljava/lang/String;

    .line 541
    invoke-static {}, Lcom/shopkick/app/application/SKApp;->setEnv()V

    .line 543
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->setConfig()V

    .line 545
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->setupApp()V

    .line 546
    iget-object v2, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    invoke-virtual {v2, v0, v1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->recordAppLaunch(J)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "AppActivityManagerAppBackgroundedEvent"

    if-ne v0, p1, :cond_0

    .line 1378
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->onApplicationBackgrounded()V

    goto/16 :goto_1

    :cond_0
    const-string v0, "AppActivityManagerSessionEndEvent"

    .line 1379
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1380
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->onSessionEnded()V

    goto/16 :goto_1

    :cond_1
    const-string v0, "AppActivityManagerSessionStartEvent"

    .line 1381
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1382
    iget-boolean p1, p0, Lcom/shopkick/app/application/SKApp;->inFirstUseMode:Z

    if-nez p1, :cond_e

    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 1383
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->onSessionStarted()V

    goto/16 :goto_1

    :cond_2
    const-string v0, "AppActivityManagerAppForegroundedEvent"

    if-ne v0, p1, :cond_4

    .line 1389
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result p1

    if-nez p1, :cond_3

    .line 1390
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "AUTH_FROM_SPLASH_COMPLETED_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1391
    :cond_3
    iget-boolean p1, p0, Lcom/shopkick/app/application/SKApp;->inFirstUseMode:Z

    if-nez p1, :cond_e

    .line 1392
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->onApplicationForegrounded()V

    goto/16 :goto_1

    :cond_4
    const-string v0, "firstUseCompletedByUser"

    .line 1394
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 1395
    iget-boolean p1, p0, Lcom/shopkick/app/application/SKApp;->inFirstUseMode:Z

    if-eqz p1, :cond_e

    .line 1396
    iput-boolean v1, p0, Lcom/shopkick/app/application/SKApp;->inFirstUseMode:Z

    .line 1397
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->onSessionStarted()V

    .line 1398
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->onApplicationForegrounded()V

    goto/16 :goto_1

    :cond_5
    const-string v0, "AUTH_FROM_SPLASH_COMPLETED_SUCCESS"

    .line 1400
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1401
    invoke-virtual {p0}, Lcom/shopkick/app/application/SKApp;->onSessionStarted()V

    .line 1402
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->onApplicationForegrounded()V

    goto/16 :goto_1

    :cond_6
    const-string v0, "reset_environment"

    if-ne v0, p1, :cond_7

    const-string p1, "change_environment"

    .line 1404
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "env_authority"

    .line 1405
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 1406
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/application/SKApp;->resetAppState(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    const-string p2, "ClientFlagsUpdated"

    if-ne p2, p1, :cond_8

    .line 1408
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz p1, :cond_e

    .line 1409
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    invoke-direct {p0, p1}, Lcom/shopkick/app/application/SKApp;->doClientFlagsReceivedWork(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)V

    goto :goto_1

    :cond_8
    const-string p2, "ClientFlagsLoaded"

    if-ne p2, p1, :cond_9

    .line 1412
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz p1, :cond_e

    .line 1413
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->doClientFlagsLoadedWork()V

    goto :goto_1

    :cond_9
    const-string p2, "CreateGuestRequestSuccess"

    .line 1415
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    .line 1416
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->trackLaunch()V

    goto :goto_1

    :cond_a
    const-string p2, "LogoutRequestSuccess"

    .line 1417
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_d

    const-string p2, "DeleteAccountRequestSuccess"

    .line 1418
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_b

    goto :goto_0

    :cond_b
    const-string p2, "CREDENTIAL_CHECK_SUCCESS"

    .line 1420
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_c

    .line 1421
    iput-boolean v1, p0, Lcom/shopkick/app/application/SKApp;->inFirstUseMode:Z

    goto :goto_1

    :cond_c
    const-string p2, "INVITE_TRACKING_DONE"

    .line 1422
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    const/4 p1, 0x0

    .line 1423
    iput-object p1, p0, Lcom/shopkick/app/application/SKApp;->inviteTrackingController:Lcom/shopkick/app/invite/InviteTrackingController;

    goto :goto_1

    .line 1419
    :cond_d
    :goto_0
    invoke-static {}, Lcom/shopkick/comm/FetchersCommManagerAccessor;->getInstance()Lnet/toddm/comm/CommManager;

    move-result-object p1

    invoke-virtual {p1}, Lnet/toddm/comm/CommManager;->purgeCache()V

    :cond_e
    :goto_1
    return-void
.end method

.method public onSessionStarted()V
    .locals 2

    .line 1738
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchController;->startAppSession()V

    .line 1740
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->refresh()V

    .line 1743
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->refreshAccountInfo()V

    .line 1744
    invoke-static {}, Lcom/shopkick/app/application/ThirdPartyManager;->getInstance()Lcom/shopkick/app/application/ThirdPartyManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/application/ThirdPartyManager;->onUserIDRefresh()Z

    .line 1746
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    invoke-virtual {v0}, Lcom/shopkick/app/SKPersistentCache/APICache;->clearLruCache()V

    const/4 v0, 0x0

    .line 1748
    sput v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->sessionScanCount:I

    .line 1749
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->batteryStates:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 1750
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->getBatteryLevel()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/application/SKApp;->startingBatteryPercentage:D

    .line 1751
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/application/SKApp;->sessionStartTime:J

    .line 1753
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->skClientLoggingConfigurationProvider:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->loadConfigsOnline()V

    .line 1756
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->allowNetworkActivity()V

    .line 1758
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->initializeBleCampaignController()V

    .line 1759
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->initializeGPSCheckins()V

    .line 1762
    invoke-static {}, Lcom/shopkick/app/application/LocationKicker;->kickLocationServices()V

    return-void
.end method

.method public onTerminate()V
    .locals 0

    .line 1343
    invoke-super {p0}, Landroid/support/multidex/MultiDexApplication;->onTerminate()V

    .line 1348
    invoke-direct {p0}, Lcom/shopkick/app/application/SKApp;->destroyAll()V

    return-void
.end method

.method public processBatteryState(Landroid/content/Intent;)V
    .locals 2

    const-string/jumbo v0, "status"

    const/4 v1, -0x1

    .line 1711
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1717
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->batteryStates:Ljava/util/HashSet;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1720
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->batteryStates:Ljava/util/HashSet;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1714
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->batteryStates:Ljava/util/HashSet;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1723
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->batteryStates:Ljava/util/HashSet;

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public resetAppState(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1926
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "DEBUG_ENV"

    .line 1927
    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/flags/SKFlags;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "DEBUG_LOCAL_AUTHORITY"

    .line 1928
    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/flags/SKFlags;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1931
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->clearAppPrefs()V

    .line 1932
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp;->userAcct:Lcom/shopkick/app/account/UserAccount;

    const/4 p2, 0x0

    const/16 v0, 0xb

    invoke-virtual {p1, p2, p2, v0}, Lcom/shopkick/app/account/UserAccount;->resetUserIdAndSessionKeyWithReason(Ljava/lang/String;Ljava/lang/String;I)V

    .line 1934
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "CRASH TO RESTART APP WOOT"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
