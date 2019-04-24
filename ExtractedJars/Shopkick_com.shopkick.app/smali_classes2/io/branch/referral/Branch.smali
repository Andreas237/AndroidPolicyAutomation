.class public Lio/branch/referral/Branch;
.super Ljava/lang/Object;
.source "Branch.java"

# interfaces
.implements Lio/branch/referral/BranchViewHandler$IBranchViewEvents;
.implements Lio/branch/referral/SystemObserver$GAdsParamsFetchEvents;
.implements Lio/branch/referral/InstallListener$IInstallReferrerEvents;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/Branch$IBranchViewControl;,
        Lio/branch/referral/Branch$ShareLinkBuilder;,
        Lio/branch/referral/Branch$BranchPostTask;,
        Lio/branch/referral/Branch$getShortLinkTask;,
        Lio/branch/referral/Branch$CreditHistoryOrder;,
        Lio/branch/referral/Branch$LogoutStatusListener;,
        Lio/branch/referral/Branch$BranchListResponseListener;,
        Lio/branch/referral/Branch$IChannelProperties;,
        Lio/branch/referral/Branch$ExtendedBranchLinkShareListener;,
        Lio/branch/referral/Branch$BranchLinkShareListener;,
        Lio/branch/referral/Branch$BranchLinkCreateListener;,
        Lio/branch/referral/Branch$BranchReferralStateChangedListener;,
        Lio/branch/referral/Branch$BranchUniversalReferralInitListener;,
        Lio/branch/referral/Branch$BranchReferralInitListener;,
        Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;,
        Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;,
        Lio/branch/referral/Branch$INTENT_STATE;,
        Lio/branch/referral/Branch$SESSION_STATE;
    }
.end annotation


# static fields
.field public static final ALWAYS_DEEPLINK:Ljava/lang/String; = "$always_deeplink"

.field private static final AUTO_DEEP_LINKED:Ljava/lang/String; = "io.branch.sdk.auto_linked"

.field private static final AUTO_DEEP_LINK_DISABLE:Ljava/lang/String; = "io.branch.sdk.auto_link_disable"

.field private static final AUTO_DEEP_LINK_KEY:Ljava/lang/String; = "io.branch.sdk.auto_link_keys"

.field private static final AUTO_DEEP_LINK_PATH:Ljava/lang/String; = "io.branch.sdk.auto_link_path"

.field private static final AUTO_DEEP_LINK_REQ_CODE:Ljava/lang/String; = "io.branch.sdk.auto_link_request_code"

.field public static final DEEPLINK_PATH:Ljava/lang/String; = "$deeplink_path"

.field private static final DEF_AUTO_DEEP_LINK_REQ_CODE:I = 0x5dd

.field private static final EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST:[Ljava/lang/String;

.field private static final FABRIC_BRANCH_API_KEY:Ljava/lang/String; = "io.branch.apiKey"

.field public static final FEATURE_TAG_DEAL:Ljava/lang/String; = "deal"

.field public static final FEATURE_TAG_GIFT:Ljava/lang/String; = "gift"

.field public static final FEATURE_TAG_INVITE:Ljava/lang/String; = "invite"

.field public static final FEATURE_TAG_REFERRAL:Ljava/lang/String; = "referral"

.field public static final FEATURE_TAG_SHARE:Ljava/lang/String; = "share"

.field private static LATCH_WAIT_UNTIL:I = 0x0

.field public static final LINK_TYPE_ONE_TIME_USE:I = 0x1

.field public static final LINK_TYPE_UNLIMITED_USE:I = 0x0

.field public static final NO_PLAY_STORE_REFERRER_WAIT:J = 0x0L

.field public static final OG_APP_ID:Ljava/lang/String; = "$og_app_id"

.field public static final OG_DESC:Ljava/lang/String; = "$og_description"

.field public static final OG_IMAGE_URL:Ljava/lang/String; = "$og_image_url"

.field public static final OG_TITLE:Ljava/lang/String; = "$og_title"

.field public static final OG_URL:Ljava/lang/String; = "$og_url"

.field public static final OG_VIDEO:Ljava/lang/String; = "$og_video"

.field private static final PREVENT_CLOSE_TIMEOUT:I = 0x1f4

.field public static final REDEEM_CODE:Ljava/lang/String; = "$redeem_code"

.field public static final REDIRECT_ANDROID_URL:Ljava/lang/String; = "$android_url"

.field public static final REDIRECT_BLACKBERRY_URL:Ljava/lang/String; = "$blackberry_url"

.field public static final REDIRECT_DESKTOP_URL:Ljava/lang/String; = "$desktop_url"

.field public static final REDIRECT_FIRE_URL:Ljava/lang/String; = "$fire_url"

.field public static final REDIRECT_IOS_URL:Ljava/lang/String; = "$ios_url"

.field public static final REDIRECT_IPAD_URL:Ljava/lang/String; = "$ipad_url"

.field public static final REDIRECT_WINDOWS_PHONE_URL:Ljava/lang/String; = "$windows_phone_url"

.field public static final REFERRAL_BUCKET_DEFAULT:Ljava/lang/String; = "default"

.field public static final REFERRAL_CODE:Ljava/lang/String; = "referral_code"

.field public static final REFERRAL_CODE_AWARD_UNIQUE:I = 0x0

.field public static final REFERRAL_CODE_AWARD_UNLIMITED:I = 0x1

.field public static final REFERRAL_CODE_LOCATION_BOTH:I = 0x3

.field public static final REFERRAL_CODE_LOCATION_REFERREE:I = 0x0

.field public static final REFERRAL_CODE_LOCATION_REFERRING_USER:I = 0x2

.field public static final REFERRAL_CODE_TYPE:Ljava/lang/String; = "credit"

.field public static final REFERRAL_CREATION_SOURCE_SDK:I = 0x2

.field private static final SESSION_KEEPALIVE:I = 0x7d0

.field private static final TAG:Ljava/lang/String; = "BranchSDK"

.field private static branchReferral_:Lio/branch/referral/Branch; = null

.field static checkInstallReferrer_:Z = true

.field private static cookieBasedMatchDomain_:Ljava/lang/String; = null

.field private static customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS; = null

.field private static disableDeviceIDFetch_:Z = false

.field private static disableInstantDeepLinking:Z = false

.field private static isActivityLifeCycleCallbackRegistered_:Z = false

.field private static isAutoSessionMode_:Z = false

.field static isForcedSession_:Z = false

.field static isLogging_:Ljava/lang/Boolean; = null

.field static isSimulatingInstalls_:Z = false

.field private static playStoreReferrerFetchTime:J = 0x5dcL


# instance fields
.field private branchRemoteInterface_:Lio/branch/referral/network/BranchRemoteInterface;

.field private context_:Landroid/content/Context;

.field currentActivityReference_:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private deeplinkDebugParams_:Lorg/json/JSONObject;

.field private enableFacebookAppLinkCheck_:Z

.field private getFirstReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

.field private getLatestReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

.field private handleDelayedNewIntents_:Z

.field private hasNetwork_:Z

.field private initState_:Lio/branch/referral/Branch$SESSION_STATE;

.field private final instrumentationExtraData_:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private intentState_:Lio/branch/referral/Branch$INTENT_STATE;

.field private isActivityCreatedAndLaunched:Z

.field private isGAParamsFetchInProgress_:Z

.field isInitReportedThroughCallBack:Z

.field isInstantDeepLinkPossible:Z

.field private linkCache_:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lio/branch/referral/BranchLinkData;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final lock:Ljava/lang/Object;

.field private networkCount_:I

.field private performCookieBasedStrongMatchingOnGAIDAvailable:Z

.field private prefHelper_:Lio/branch/referral/PrefHelper;

.field private final requestQueue_:Lio/branch/referral/ServerRequestQueue;

.field private serverSema_:Ljava/util/concurrent/Semaphore;

.field sessionReferredLink_:Ljava/lang/String;

.field private shareLinkManager_:Lio/branch/referral/ShareLinkManager;

.field private final systemObserver_:Lio/branch/referral/SystemObserver;

.field private final trackingController:Lio/branch/referral/TrackingController;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 360
    sget-object v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sput-object v0, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const-string v0, "app.link"

    .line 392
    sput-object v0, Lio/branch/referral/Branch;->cookieBasedMatchDomain_:Ljava/lang/String;

    const/16 v0, 0x9c4

    .line 394
    sput v0, Lio/branch/referral/Branch;->LATCH_WAIT_UNTIL:I

    const-string v0, "extra_launch_uri"

    const-string v1, "branch_intent"

    .line 397
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/branch/referral/Branch;->EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST:[Ljava/lang/String;

    const/4 v0, 0x1

    .line 412
    sput-boolean v0, Lio/branch/referral/Branch;->disableInstantDeepLinking:Z

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 422
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 288
    iput-boolean v0, p0, Lio/branch/referral/Branch;->enableFacebookAppLinkCheck_:Z

    .line 342
    sget-object v1, Lio/branch/referral/Branch$INTENT_STATE;->PENDING:Lio/branch/referral/Branch$INTENT_STATE;

    iput-object v1, p0, Lio/branch/referral/Branch;->intentState_:Lio/branch/referral/Branch$INTENT_STATE;

    .line 343
    iput-boolean v0, p0, Lio/branch/referral/Branch;->handleDelayedNewIntents_:Z

    .line 346
    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    iput-object v1, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    .line 381
    iput-boolean v0, p0, Lio/branch/referral/Branch;->isInitReportedThroughCallBack:Z

    .line 388
    iput-boolean v0, p0, Lio/branch/referral/Branch;->isGAParamsFetchInProgress_:Z

    const/4 v1, 0x0

    .line 402
    iput-object v1, p0, Lio/branch/referral/Branch;->getFirstReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    .line 403
    iput-object v1, p0, Lio/branch/referral/Branch;->getLatestReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    .line 406
    iput-boolean v0, p0, Lio/branch/referral/Branch;->performCookieBasedStrongMatchingOnGAIDAvailable:Z

    .line 408
    iput-boolean v0, p0, Lio/branch/referral/Branch;->isInstantDeepLinkPossible:Z

    .line 410
    iput-boolean v0, p0, Lio/branch/referral/Branch;->isActivityCreatedAndLaunched:Z

    .line 423
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object v1

    iput-object v1, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    .line 424
    new-instance v1, Lio/branch/referral/TrackingController;

    invoke-direct {v1, p1}, Lio/branch/referral/TrackingController;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lio/branch/referral/Branch;->trackingController:Lio/branch/referral/TrackingController;

    .line 425
    invoke-static {p1}, Lio/branch/referral/network/BranchRemoteInterface;->getDefaultBranchRemoteInterface(Landroid/content/Context;)Lio/branch/referral/network/BranchRemoteInterface;

    move-result-object v1

    iput-object v1, p0, Lio/branch/referral/Branch;->branchRemoteInterface_:Lio/branch/referral/network/BranchRemoteInterface;

    .line 426
    new-instance v1, Lio/branch/referral/SystemObserver;

    invoke-direct {v1, p1}, Lio/branch/referral/SystemObserver;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lio/branch/referral/Branch;->systemObserver_:Lio/branch/referral/SystemObserver;

    .line 427
    invoke-static {p1}, Lio/branch/referral/ServerRequestQueue;->getInstance(Landroid/content/Context;)Lio/branch/referral/ServerRequestQueue;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    .line 428
    new-instance p1, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object p1, p0, Lio/branch/referral/Branch;->serverSema_:Ljava/util/concurrent/Semaphore;

    .line 429
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/branch/referral/Branch;->lock:Ljava/lang/Object;

    .line 430
    iput v0, p0, Lio/branch/referral/Branch;->networkCount_:I

    .line 431
    iput-boolean v1, p0, Lio/branch/referral/Branch;->hasNetwork_:Z

    .line 432
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/branch/referral/Branch;->linkCache_:Ljava/util/Map;

    .line 433
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/branch/referral/Branch;->instrumentationExtraData_:Ljava/util/concurrent/ConcurrentHashMap;

    .line 434
    iget-object p1, p0, Lio/branch/referral/Branch;->trackingController:Lio/branch/referral/TrackingController;

    invoke-virtual {p1}, Lio/branch/referral/TrackingController;->isTrackingDisabled()Z

    move-result p1

    if-nez p1, :cond_0

    .line 435
    iget-object p1, p0, Lio/branch/referral/Branch;->systemObserver_:Lio/branch/referral/SystemObserver;

    invoke-virtual {p1, p0}, Lio/branch/referral/SystemObserver;->prefetchGAdsParams(Lio/branch/referral/SystemObserver$GAdsParamsFetchEvents;)Z

    move-result p1

    iput-boolean p1, p0, Lio/branch/referral/Branch;->isGAParamsFetchInProgress_:Z

    .line 439
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xf

    if-lt p1, v2, :cond_1

    .line 440
    iput-boolean v1, p0, Lio/branch/referral/Branch;->handleDelayedNewIntents_:Z

    .line 441
    sget-object p1, Lio/branch/referral/Branch$INTENT_STATE;->PENDING:Lio/branch/referral/Branch$INTENT_STATE;

    iput-object p1, p0, Lio/branch/referral/Branch;->intentState_:Lio/branch/referral/Branch$INTENT_STATE;

    goto :goto_0

    .line 443
    :cond_1
    iput-boolean v0, p0, Lio/branch/referral/Branch;->handleDelayedNewIntents_:Z

    .line 444
    sget-object p1, Lio/branch/referral/Branch$INTENT_STATE;->READY:Lio/branch/referral/Branch$INTENT_STATE;

    iput-object p1, p0, Lio/branch/referral/Branch;->intentState_:Lio/branch/referral/Branch$INTENT_STATE;

    :goto_0
    return-void
.end method

.method static synthetic access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    return-object p0
.end method

.method static synthetic access$1000(Lio/branch/referral/Branch;Landroid/app/Activity;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->startSession(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$1100(Lio/branch/referral/Branch;Landroid/content/Intent;)Z
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->checkIntentForSessionRestart(Landroid/content/Intent;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1200(Lio/branch/referral/Branch;Landroid/app/Activity;Z)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2}, Lio/branch/referral/Branch;->onIntentReady(Landroid/app/Activity;Z)V

    return-void
.end method

.method static synthetic access$1300(Lio/branch/referral/Branch;)Lio/branch/referral/ShareLinkManager;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->shareLinkManager_:Lio/branch/referral/ShareLinkManager;

    return-object p0
.end method

.method static synthetic access$1400(Lio/branch/referral/Branch;)Lio/branch/referral/network/BranchRemoteInterface;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->branchRemoteInterface_:Lio/branch/referral/network/BranchRemoteInterface;

    return-object p0
.end method

.method static synthetic access$1500(Lio/branch/referral/Branch;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->instrumentationExtraData_:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method static synthetic access$1600(Lio/branch/referral/Branch;)Z
    .locals 0

    .line 72
    iget-boolean p0, p0, Lio/branch/referral/Branch;->hasNetwork_:Z

    return p0
.end method

.method static synthetic access$1602(Lio/branch/referral/Branch;Z)Z
    .locals 0

    .line 72
    iput-boolean p1, p0, Lio/branch/referral/Branch;->hasNetwork_:Z

    return p1
.end method

.method static synthetic access$1700(Lio/branch/referral/Branch;II)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2}, Lio/branch/referral/Branch;->handleFailure(II)V

    return-void
.end method

.method static synthetic access$1802(Lio/branch/referral/Branch;I)I
    .locals 0

    .line 72
    iput p1, p0, Lio/branch/referral/Branch;->networkCount_:I

    return p1
.end method

.method static synthetic access$1900(Lio/branch/referral/Branch;)Ljava/util/Map;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->linkCache_:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$200(Lio/branch/referral/Branch;)Lio/branch/referral/ServerRequestQueue;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    return-object p0
.end method

.method static synthetic access$2000(Lio/branch/referral/Branch;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lio/branch/referral/Branch;->updateAllRequestsInQueue()V

    return-void
.end method

.method static synthetic access$2100()Lio/branch/referral/Branch;
    .locals 1

    .line 72
    sget-object v0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    return-object v0
.end method

.method static synthetic access$2200(Lio/branch/referral/Branch;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lio/branch/referral/Branch;->checkForAutoDeepLinkConfiguration()V

    return-void
.end method

.method static synthetic access$2300(Lio/branch/referral/Branch;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->getLatestReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method static synthetic access$2400(Lio/branch/referral/Branch;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->getFirstReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method static synthetic access$2500(Lio/branch/referral/Branch;Lio/branch/referral/Branch$ShareLinkBuilder;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->shareLink(Lio/branch/referral/Branch$ShareLinkBuilder;)V

    return-void
.end method

.method static synthetic access$300(Lio/branch/referral/Branch;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lio/branch/referral/Branch;->processNextQueueItem()V

    return-void
.end method

.method static synthetic access$502(Lio/branch/referral/Branch;Lio/branch/referral/Branch$INTENT_STATE;)Lio/branch/referral/Branch$INTENT_STATE;
    .locals 0

    .line 72
    iput-object p1, p0, Lio/branch/referral/Branch;->intentState_:Lio/branch/referral/Branch$INTENT_STATE;

    return-object p1
.end method

.method static synthetic access$600(Lio/branch/referral/Branch;)Z
    .locals 0

    .line 72
    iget-boolean p0, p0, Lio/branch/referral/Branch;->handleDelayedNewIntents_:Z

    return p0
.end method

.method static synthetic access$702(Lio/branch/referral/Branch;Z)Z
    .locals 0

    .line 72
    iput-boolean p1, p0, Lio/branch/referral/Branch;->isActivityCreatedAndLaunched:Z

    return p1
.end method

.method static synthetic access$800(Lio/branch/referral/Branch;)Lio/branch/referral/Branch$SESSION_STATE;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    return-object p0
.end method

.method static synthetic access$802(Lio/branch/referral/Branch;Lio/branch/referral/Branch$SESSION_STATE;)Lio/branch/referral/Branch$SESSION_STATE;
    .locals 0

    .line 72
    iput-object p1, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    return-object p1
.end method

.method static synthetic access$900(Lio/branch/referral/Branch;)Landroid/content/Context;
    .locals 0

    .line 72
    iget-object p0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    return-object p0
.end method

.method private appendDebugParams(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 3

    if-eqz p1, :cond_1

    .line 2061
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/Branch;->deeplinkDebugParams_:Lorg/json/JSONObject;

    if-eqz v0, :cond_1

    .line 2062
    iget-object v0, p0, Lio/branch/referral/Branch;->deeplinkDebugParams_:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "BranchSDK"

    const-string v1, "You\'re currently in deep link debug mode. Please comment out \'setDeepLinkDebugMode\' to receive the deep link parameters from a real Branch link"

    .line 2063
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2065
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch;->deeplinkDebugParams_:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 2066
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2067
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2068
    iget-object v2, p0, Lio/branch/referral/Branch;->deeplinkDebugParams_:Lorg/json/JSONObject;

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    return-object p1
.end method

.method private checkForAutoDeepLinkConfiguration()V
    .locals 9

    .line 3033
    invoke-virtual {p0}, Lio/branch/referral/Branch;->getLatestReferringParams()Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    .line 3038
    :try_start_0
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->Clicked_Branch_Link:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->Clicked_Branch_Link:Lio/branch/referral/Defines$Jsonkey;

    .line 3039
    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    .line 3042
    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_9

    .line 3044
    iget-object v2, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x80

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 3045
    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "io.branch.sdk.auto_link_disable"

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    .line 3048
    :cond_1
    iget-object v2, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x81

    invoke-virtual {v2, v3, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 3049
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    const/16 v3, 0x5dd

    if-eqz v2, :cond_5

    .line 3053
    array-length v5, v2

    :goto_0
    if-ge v4, v5, :cond_5

    aget-object v6, v2, v4

    if-eqz v6, :cond_4

    .line 3054
    iget-object v7, v6, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    if-eqz v7, :cond_4

    iget-object v7, v6, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string v8, "io.branch.sdk.auto_link_keys"

    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    iget-object v7, v6, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string v8, "io.branch.sdk.auto_link_path"

    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 3055
    :cond_2
    invoke-direct {p0, v0, v6}, Lio/branch/referral/Branch;->checkForAutoDeepLinkKeys(Lorg/json/JSONObject;Landroid/content/pm/ActivityInfo;)Z

    move-result v7

    if-nez v7, :cond_3

    invoke-direct {p0, v0, v6}, Lio/branch/referral/Branch;->checkForAutoDeepLinkPath(Lorg/json/JSONObject;Landroid/content/pm/ActivityInfo;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 3056
    :cond_3
    iget-object v1, v6, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 3057
    iget-object v2, v6, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string v4, "io.branch.sdk.auto_link_request_code"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    goto :goto_1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    if-eqz v1, :cond_9

    .line 3063
    iget-object v2, p0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_9

    .line 3064
    iget-object v2, p0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    if-eqz v2, :cond_7

    .line 3066
    new-instance v4, Landroid/content/Intent;

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    invoke-direct {v4, v2, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v5, "io.branch.sdk.auto_linked"

    const-string/jumbo v6, "true"

    .line 3067
    invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3070
    sget-object v5, Lio/branch/referral/Defines$Jsonkey;->ReferringData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v5}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3073
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    .line 3074
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 3075
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 3076
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2

    .line 3078
    :cond_6
    invoke-virtual {v2, v4, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_4

    :cond_7
    const-string v0, "BranchSDK"

    const-string v2, "No activity reference to launch deep linked activity"

    .line 3081
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_4

    :cond_8
    :goto_3
    return-void

    :catch_0
    const-string v0, "BranchSDK"

    .line 3088
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Branch Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :catch_1
    const-string v0, "BranchSDK"

    const-string v1, "Branch Warning: Please make sure Activity names set for auto deep link are correct!"

    .line 3086
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :catch_2
    :cond_9
    :goto_4
    return-void
.end method

.method private checkForAutoDeepLinkKeys(Lorg/json/JSONObject;Landroid/content/pm/ActivityInfo;)Z
    .locals 4

    .line 3095
    iget-object v0, p2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "io.branch.sdk.auto_link_keys"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3096
    iget-object p2, p2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "io.branch.sdk.auto_link_keys"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, ","

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 3097
    array-length v0, p2

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p2, v2

    .line 3098
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private checkForAutoDeepLinkPath(Lorg/json/JSONObject;Landroid/content/pm/ActivityInfo;)Z
    .locals 4

    const/4 v0, 0x0

    .line 3109
    :try_start_0
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AndroidDeepLinkPath:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3110
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AndroidDeepLinkPath:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    move-object v0, p1

    goto :goto_0

    .line 3111
    :cond_0
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->DeepLinkPath:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3112
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->DeepLinkPath:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    .line 3116
    :catch_0
    :cond_1
    :goto_0
    iget-object p1, p2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "io.branch.sdk.auto_link_path"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    if-eqz v0, :cond_3

    .line 3117
    iget-object p1, p2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string p2, "io.branch.sdk.auto_link_path"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, ","

    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 3118
    array-length p2, p1

    move v2, v1

    :goto_1
    if-ge v2, p2, :cond_3

    aget-object v3, p1, v2

    .line 3119
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, v0}, Lio/branch/referral/Branch;->pathMatch(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return v1
.end method

.method private checkIntentForSessionRestart(Landroid/content/Intent;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 2644
    :try_start_0
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ForceNewBranchSession:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move v1, v0

    :goto_0
    if-eqz v1, :cond_0

    .line 2648
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->ForceNewBranchSession:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_0
    move v0, v1

    :cond_1
    return v0
.end method

.method private convertDate(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "yyyy-MM-dd"

    .line 2144
    invoke-static {v0, p1}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;Ljava/util/Date;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private convertParamsStringToDictionary(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    const-string v0, "bnc_no_value"

    .line 2184
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2185
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    return-object p1

    .line 2188
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 2190
    :catch_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lio/branch/referral/Base64;->decode([BI)[B

    move-result-object p1

    .line 2192
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception p1

    .line 2194
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 2195
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    return-object p1
.end method

.method public static disableDeviceIDFetch(Ljava/lang/Boolean;)V
    .locals 0

    .line 824
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    sput-boolean p0, Lio/branch/referral/Branch;->disableDeviceIDFetch_:Z

    return-void
.end method

.method public static disableForcedSession()V
    .locals 1

    const/4 v0, 0x0

    .line 3166
    sput-boolean v0, Lio/branch/referral/Branch;->isForcedSession_:Z

    return-void
.end method

.method public static disableInstantDeepLinking(Z)V
    .locals 0

    .line 528
    sput-boolean p0, Lio/branch/referral/Branch;->disableInstantDeepLinking:Z

    return-void
.end method

.method public static disableLogging()V
    .locals 1

    const/4 v0, 0x0

    .line 3158
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lio/branch/referral/Branch;->isLogging_:Ljava/lang/Boolean;

    return-void
.end method

.method public static disableSimulateInstalls()V
    .locals 1

    const/4 v0, 0x0

    .line 3150
    sput-boolean v0, Lio/branch/referral/Branch;->isSimulatingInstalls_:Z

    return-void
.end method

.method public static disableTestMode()V
    .locals 1

    const/4 v0, 0x0

    .line 475
    sput-boolean v0, Lio/branch/referral/BranchUtil;->isCustomDebugEnabled_:Z

    return-void
.end method

.method public static enableCookieBasedMatching(Ljava/lang/String;)V
    .locals 0

    .line 1373
    sput-object p0, Lio/branch/referral/Branch;->cookieBasedMatchDomain_:Ljava/lang/String;

    return-void
.end method

.method public static enableCookieBasedMatching(Ljava/lang/String;I)V
    .locals 0

    .line 1386
    sput-object p0, Lio/branch/referral/Branch;->cookieBasedMatchDomain_:Ljava/lang/String;

    .line 1387
    invoke-static {}, Lio/branch/referral/BranchStrongMatchHelper;->getInstance()Lio/branch/referral/BranchStrongMatchHelper;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/branch/referral/BranchStrongMatchHelper;->setStrongMatchUrlHitDelay(I)V

    return-void
.end method

.method public static enableForcedSession()V
    .locals 1

    const/4 v0, 0x1

    .line 3162
    sput-boolean v0, Lio/branch/referral/Branch;->isForcedSession_:Z

    return-void
.end method

.method public static enableLogging()V
    .locals 1

    const/4 v0, 0x1

    .line 3154
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lio/branch/referral/Branch;->isLogging_:Ljava/lang/Boolean;

    return-void
.end method

.method public static enablePlayStoreReferrer(J)V
    .locals 0

    .line 503
    invoke-static {p0, p1}, Lio/branch/referral/Branch;->setPlayStoreReferrerCheckTimeout(J)V

    return-void
.end method

.method public static enableSimulateInstalls()V
    .locals 1

    const/4 v0, 0x1

    .line 3146
    sput-boolean v0, Lio/branch/referral/Branch;->isSimulatingInstalls_:Z

    return-void
.end method

.method public static enableTestMode()V
    .locals 1

    const/4 v0, 0x1

    .line 471
    sput-boolean v0, Lio/branch/referral/BranchUtil;->isCustomDebugEnabled_:Z

    return-void
.end method

.method private executeClose()V
    .locals 2

    .line 1395
    iget-object v0, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    if-eq v0, v1, :cond_4

    .line 1396
    iget-boolean v0, p0, Lio/branch/referral/Branch;->hasNetwork_:Z

    if-nez v0, :cond_2

    .line 1398
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->peek()Lio/branch/referral/ServerRequest;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1399
    instance-of v1, v0, Lio/branch/referral/ServerRequestRegisterInstall;

    if-nez v1, :cond_1

    :cond_0
    instance-of v0, v0, Lio/branch/referral/ServerRequestRegisterOpen;

    if-eqz v0, :cond_3

    .line 1400
    :cond_1
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->dequeue()Lio/branch/referral/ServerRequest;

    goto :goto_0

    .line 1403
    :cond_2
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->containsClose()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1404
    new-instance v0, Lio/branch/referral/ServerRequestRegisterClose;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-direct {v0, v1}, Lio/branch/referral/ServerRequestRegisterClose;-><init>(Landroid/content/Context;)V

    .line 1405
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    .line 1408
    :cond_3
    :goto_0
    sget-object v0, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    iput-object v0, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    :cond_4
    return-void
.end method

.method private generateShortLinkAsync(Lio/branch/referral/ServerRequest;)V
    .locals 0

    .line 2180
    invoke-virtual {p0, p1}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    return-void
.end method

.method private generateShortLinkSync(Lio/branch/referral/ServerRequestCreateUrl;)Ljava/lang/String;
    .locals 5

    .line 2148
    iget-object v0, p0, Lio/branch/referral/Branch;->trackingController:Lio/branch/referral/TrackingController;

    invoke-virtual {v0}, Lio/branch/referral/TrackingController;->isTrackingDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2149
    invoke-virtual {p1}, Lio/branch/referral/ServerRequestCreateUrl;->getLongUrl()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 2151
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    .line 2154
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getTimeout()I

    move-result v0

    add-int/lit16 v0, v0, 0x7d0

    .line 2155
    new-instance v1, Lio/branch/referral/Branch$getShortLinkTask;

    invoke-direct {v1, p0, v2}, Lio/branch/referral/Branch$getShortLinkTask;-><init>(Lio/branch/referral/Branch;Lio/branch/referral/Branch$1;)V

    const/4 v3, 0x1

    new-array v3, v3, [Lio/branch/referral/ServerRequest;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v3}, Lio/branch/referral/Branch$getShortLinkTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v1

    int-to-long v3, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v3, v4, v0}, Landroid/os/AsyncTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/branch/referral/ServerResponse;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v2

    .line 2159
    :goto_0
    invoke-virtual {p1}, Lio/branch/referral/ServerRequestCreateUrl;->isDefaultToLongUrl()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2160
    invoke-virtual {p1}, Lio/branch/referral/ServerRequestCreateUrl;->getLongUrl()Ljava/lang/String;

    move-result-object v2

    :cond_1
    if-eqz v0, :cond_2

    .line 2162
    invoke-virtual {v0}, Lio/branch/referral/ServerResponse;->getStatusCode()I

    move-result v1

    const/16 v3, 0xc8

    if-ne v1, v3, :cond_2

    .line 2164
    :try_start_1
    invoke-virtual {v0}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    const-string/jumbo v1, "url"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2165
    invoke-virtual {p1}, Lio/branch/referral/ServerRequestCreateUrl;->getLinkPost()Lio/branch/referral/BranchLinkData;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2166
    iget-object v0, p0, Lio/branch/referral/Branch;->linkCache_:Ljava/util/Map;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequestCreateUrl;->getLinkPost()Lio/branch/referral/BranchLinkData;

    move-result-object p1

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 2169
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_2
    :goto_1
    return-object v2

    :cond_3
    const-string p1, "BranchSDK"

    const-string v0, "Branch Warning: User session has not been initialized"

    .line 2174
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2
.end method

.method public static getAutoInstance(Landroid/content/Context;)Lio/branch/referral/Branch;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    const/4 v0, 0x1

    .line 663
    sput-boolean v0, Lio/branch/referral/Branch;->isAutoSessionMode_:Z

    .line 664
    sget-object v1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sput-object v1, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    .line 665
    invoke-static {p0}, Lio/branch/referral/BranchUtil;->isTestModeEnabled(Landroid/content/Context;)Z

    move-result v1

    xor-int/2addr v0, v1

    const/4 v1, 0x0

    .line 666
    invoke-static {p0, v0, v1}, Lio/branch/referral/Branch;->getBranchInstance(Landroid/content/Context;ZLjava/lang/String;)Lio/branch/referral/Branch;

    .line 667
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    return-object p0
.end method

.method public static getAutoInstance(Landroid/content/Context;Ljava/lang/String;)Lio/branch/referral/Branch;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    const/4 v0, 0x1

    .line 705
    sput-boolean v0, Lio/branch/referral/Branch;->isAutoSessionMode_:Z

    .line 706
    sget-object v1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sput-object v1, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    .line 707
    invoke-static {p0}, Lio/branch/referral/BranchUtil;->isTestModeEnabled(Landroid/content/Context;)Z

    move-result v1

    xor-int/2addr v0, v1

    .line 708
    invoke-static {p0, v0, p1}, Lio/branch/referral/Branch;->getBranchInstance(Landroid/content/Context;ZLjava/lang/String;)Lio/branch/referral/Branch;

    const-string p0, "key_"

    .line 710
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 711
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p0, p1}, Lio/branch/referral/PrefHelper;->setBranchKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 714
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p0, p0, Lio/branch/referral/Branch;->linkCache_:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 715
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {p0}, Lio/branch/referral/ServerRequestQueue;->clear()V

    goto :goto_0

    :cond_0
    const-string p0, "BranchSDK"

    const-string p1, "Branch Key is invalid.Please check your BranchKey"

    .line 718
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 720
    :cond_1
    :goto_0
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    return-object p0
.end method

.method public static getAutoInstance(Landroid/content/Context;Z)Lio/branch/referral/Branch;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    const/4 v0, 0x1

    .line 685
    sput-boolean v0, Lio/branch/referral/Branch;->isAutoSessionMode_:Z

    if-eqz p1, :cond_0

    .line 686
    sget-object p1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    goto :goto_0

    :cond_0
    sget-object p1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->NON_REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    :goto_0
    sput-object p1, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    .line 687
    invoke-static {p0}, Lio/branch/referral/BranchUtil;->isTestModeEnabled(Landroid/content/Context;)Z

    move-result p1

    xor-int/2addr p1, v0

    const/4 v0, 0x0

    .line 688
    invoke-static {p0, p1, v0}, Lio/branch/referral/Branch;->getBranchInstance(Landroid/content/Context;ZLjava/lang/String;)Lio/branch/referral/Branch;

    .line 689
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    return-object p0
.end method

.method public static getAutoTestInstance(Landroid/content/Context;)Lio/branch/referral/Branch;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    const/4 v0, 0x1

    .line 733
    sput-boolean v0, Lio/branch/referral/Branch;->isAutoSessionMode_:Z

    .line 734
    sget-object v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sput-object v0, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 735
    invoke-static {p0, v0, v1}, Lio/branch/referral/Branch;->getBranchInstance(Landroid/content/Context;ZLjava/lang/String;)Lio/branch/referral/Branch;

    .line 736
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    return-object p0
.end method

.method public static getAutoTestInstance(Landroid/content/Context;Z)Lio/branch/referral/Branch;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    const/4 v0, 0x1

    .line 752
    sput-boolean v0, Lio/branch/referral/Branch;->isAutoSessionMode_:Z

    if-eqz p1, :cond_0

    .line 753
    sget-object p1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    goto :goto_0

    :cond_0
    sget-object p1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->NON_REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    :goto_0
    sput-object p1, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 754
    invoke-static {p0, p1, v0}, Lio/branch/referral/Branch;->getBranchInstance(Landroid/content/Context;ZLjava/lang/String;)Lio/branch/referral/Branch;

    .line 755
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    return-object p0
.end method

.method private static getBranchInstance(Landroid/content/Context;ZLjava/lang/String;)Lio/branch/referral/Branch;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 584
    sget-object v0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    if-nez v0, :cond_5

    .line 585
    invoke-static {p0}, Lio/branch/referral/Branch;->initInstance(Landroid/content/Context;)Lio/branch/referral/Branch;

    move-result-object v0

    sput-object v0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    .line 588
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 589
    sget-object p2, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p2, p2, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p2, p1}, Lio/branch/referral/PrefHelper;->readBranchKey(Z)Ljava/lang/String;

    move-result-object p2

    :cond_0
    if-eqz p2, :cond_2

    const-string p1, "bnc_no_value"

    .line 592
    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 607
    :cond_1
    sget-object p1, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p1, p1, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1, p2}, Lio/branch/referral/PrefHelper;->setBranchKey(Ljava/lang/String;)Z

    move-result p1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 596
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const-string v0, "io.branch.apiKey"

    const-string/jumbo v1, "string"

    .line 597
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 600
    :catch_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 601
    sget-object p2, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p2, p2, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p2, p1}, Lio/branch/referral/PrefHelper;->setBranchKey(Ljava/lang/String;)Z

    move-result p1

    goto :goto_1

    :cond_3
    const-string p1, "BranchSDK"

    const-string p2, "Branch Warning: Please enter your branch_key in your project\'s Manifest file!"

    .line 603
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 604
    sget-object p1, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p1, p1, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string p2, "bnc_no_value"

    invoke-virtual {p1, p2}, Lio/branch/referral/PrefHelper;->setBranchKey(Ljava/lang/String;)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_4

    .line 611
    sget-object p1, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p1, p1, Lio/branch/referral/Branch;->linkCache_:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 612
    sget-object p1, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p1, p1, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequestQueue;->clear()V

    .line 615
    :cond_4
    sget-object p1, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p1, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    .line 617
    instance-of p1, p0, Landroid/app/Application;

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    .line 618
    sput-boolean p1, Lio/branch/referral/Branch;->isAutoSessionMode_:Z

    .line 619
    sget-object p1, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    check-cast p0, Landroid/app/Application;

    invoke-direct {p1, p0}, Lio/branch/referral/Branch;->setActivityLifeCycleObserver(Landroid/app/Application;)V

    .line 622
    :cond_5
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    return-object p0
.end method

.method private getInstallOrOpenRequest(Lio/branch/referral/Branch$BranchReferralInitListener;)Lio/branch/referral/ServerRequest;
    .locals 4

    .line 2403
    invoke-direct {p0}, Lio/branch/referral/Branch;->hasUser()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2405
    new-instance v0, Lio/branch/referral/ServerRequestRegisterOpen;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    iget-object v2, p0, Lio/branch/referral/Branch;->systemObserver_:Lio/branch/referral/SystemObserver;

    invoke-direct {v0, v1, p1, v2}, Lio/branch/referral/ServerRequestRegisterOpen;-><init>(Landroid/content/Context;Lio/branch/referral/Branch$BranchReferralInitListener;Lio/branch/referral/SystemObserver;)V

    goto :goto_0

    .line 2408
    :cond_0
    new-instance v0, Lio/branch/referral/ServerRequestRegisterInstall;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    iget-object v2, p0, Lio/branch/referral/Branch;->systemObserver_:Lio/branch/referral/SystemObserver;

    invoke-static {}, Lio/branch/referral/InstallListener;->getInstallationID()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, p1, v2, v3}, Lio/branch/referral/ServerRequestRegisterInstall;-><init>(Landroid/content/Context;Lio/branch/referral/Branch$BranchReferralInitListener;Lio/branch/referral/SystemObserver;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public static getInstance()Lio/branch/referral/Branch;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 541
    sget-object v0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    if-nez v0, :cond_0

    const-string v0, "BranchSDK"

    const-string v1, "Branch instance is not created yet. Make sure you have initialised Branch. [Consider Calling getInstance(Context ctx) if you still have issue.]"

    .line 542
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 543
    :cond_0
    sget-boolean v0, Lio/branch/referral/Branch;->isAutoSessionMode_:Z

    if-eqz v0, :cond_1

    .line 545
    sget-boolean v0, Lio/branch/referral/Branch;->isActivityLifeCycleCallbackRegistered_:Z

    if-nez v0, :cond_1

    const-string v0, "BranchSDK"

    const-string v1, "Branch instance is not properly initialised. Make sure your Application class is extending BranchApp class. If you are not extending BranchApp class make sure you are initialising Branch in your Applications onCreate()"

    .line 546
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 550
    :cond_1
    :goto_0
    sget-object v0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lio/branch/referral/Branch;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 637
    invoke-static {p0, v0, v1}, Lio/branch/referral/Branch;->getBranchInstance(Landroid/content/Context;ZLjava/lang/String;)Lio/branch/referral/Branch;

    move-result-object p0

    return-object p0
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Lio/branch/referral/Branch;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 566
    sget-object v0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    if-nez v0, :cond_0

    .line 567
    invoke-static {p0}, Lio/branch/referral/Branch;->initInstance(Landroid/content/Context;)Lio/branch/referral/Branch;

    move-result-object v0

    sput-object v0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    .line 569
    :cond_0
    sget-object v0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    iput-object p0, v0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    const-string p0, "key_"

    .line 570
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 571
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p0, p1}, Lio/branch/referral/PrefHelper;->setBranchKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 574
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p0, p0, Lio/branch/referral/Branch;->linkCache_:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 575
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    iget-object p0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {p0}, Lio/branch/referral/ServerRequestQueue;->clear()V

    goto :goto_0

    :cond_1
    const-string p0, "BranchSDK"

    const-string p1, "Branch Key is invalid.Please check your BranchKey"

    .line 578
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 580
    :cond_2
    :goto_0
    sget-object p0, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    return-object p0
.end method

.method public static getTestInstance(Landroid/content/Context;)Lio/branch/referral/Branch;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 648
    invoke-static {p0, v0, v1}, Lio/branch/referral/Branch;->getBranchInstance(Landroid/content/Context;ZLjava/lang/String;)Lio/branch/referral/Branch;

    move-result-object p0

    return-object p0
.end method

.method private handleFailure(II)V
    .locals 1

    .line 2241
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->getSize()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 2242
    iget-object p1, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequestQueue;->getSize()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lio/branch/referral/ServerRequestQueue;->peekAt(I)Lio/branch/referral/ServerRequest;

    move-result-object p1

    goto :goto_0

    .line 2244
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequestQueue;->peekAt(I)Lio/branch/referral/ServerRequest;

    move-result-object p1

    .line 2246
    :goto_0
    invoke-direct {p0, p1, p2}, Lio/branch/referral/Branch;->handleFailure(Lio/branch/referral/ServerRequest;I)V

    return-void
.end method

.method private handleFailure(Lio/branch/referral/ServerRequest;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, ""

    .line 2252
    invoke-virtual {p1, p2, v0}, Lio/branch/referral/ServerRequest;->handleFailure(ILjava/lang/String;)V

    return-void
.end method

.method private hasDeviceFingerPrint()Z
    .locals 2

    .line 2284
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private hasSession()Z
    .locals 2

    .line 2280
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getSessionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private hasUser()Z
    .locals 2

    .line 2288
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static initInstance(Landroid/content/Context;)Lio/branch/referral/Branch;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 765
    new-instance v0, Lio/branch/referral/Branch;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/branch/referral/Branch;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private initUserSessionInternal(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;Z)V
    .locals 2

    if-eqz p2, :cond_0

    .line 1272
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    .line 1275
    :cond_0
    invoke-direct {p0}, Lio/branch/referral/Branch;->hasUser()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lio/branch/referral/Branch;->hasSession()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    if-ne p2, v1, :cond_1

    .line 1276
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->reportInitSession(Lio/branch/referral/Branch$BranchReferralInitListener;)Z

    .line 1277
    iput-boolean v0, p0, Lio/branch/referral/Branch;->isInstantDeepLinkPossible:Z

    goto :goto_1

    .line 1282
    :cond_1
    iget-boolean p2, p0, Lio/branch/referral/Branch;->isInstantDeepLinkPossible:Z

    if-eqz p2, :cond_2

    .line 1283
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->reportInitSession(Lio/branch/referral/Branch$BranchReferralInitListener;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 1284
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->InstantDeepLinkSession:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    const-string/jumbo v1, "true"

    invoke-virtual {p0, p2, v1}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    .line 1285
    iput-boolean v0, p0, Lio/branch/referral/Branch;->isInstantDeepLinkPossible:Z

    .line 1286
    invoke-direct {p0}, Lio/branch/referral/Branch;->checkForAutoDeepLinkConfiguration()V

    :cond_2
    if-eqz p3, :cond_3

    .line 1292
    iget-object p2, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p2}, Lio/branch/referral/PrefHelper;->setIsReferrable()V

    goto :goto_0

    .line 1294
    :cond_3
    iget-object p2, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p2}, Lio/branch/referral/PrefHelper;->clearIsReferrable()V

    .line 1298
    :goto_0
    iget-object p2, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    sget-object p3, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISING:Lio/branch/referral/Branch$SESSION_STATE;

    if-ne p2, p3, :cond_4

    if-eqz p1, :cond_5

    .line 1300
    iget-object p2, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {p2, p1}, Lio/branch/referral/ServerRequestQueue;->setInstallOrOpenCallback(Lio/branch/referral/Branch$BranchReferralInitListener;)V

    goto :goto_1

    .line 1305
    :cond_4
    sget-object p2, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISING:Lio/branch/referral/Branch$SESSION_STATE;

    iput-object p2, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    .line 1306
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->initializeSession(Lio/branch/referral/Branch$BranchReferralInitListener;)V

    :cond_5
    :goto_1
    return-void
.end method

.method private initUserSessionInternal(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/app/Activity;Z)V
    .locals 1

    .line 1266
    new-instance v0, Lio/branch/referral/BranchUniversalReferralInitWrapper;

    invoke-direct {v0, p1}, Lio/branch/referral/BranchUniversalReferralInitWrapper;-><init>(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;)V

    .line 1267
    invoke-direct {p0, v0, p2, p3}, Lio/branch/referral/Branch;->initUserSessionInternal(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;Z)V

    return-void
.end method

.method private initializeSession(Lio/branch/referral/Branch$BranchReferralInitListener;)V
    .locals 4

    .line 2319
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object v0

    const-string v2, "bnc_no_value"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 2327
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object v0

    const-string v2, "key_test_"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "BranchSDK"

    const-string v2, "Branch Warning: You are using your test app\'s Branch Key. Remember to change it to live Branch Key during deployment."

    .line 2328
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2331
    :cond_1
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getExternalIntentUri()Ljava/lang/String;

    move-result-object v0

    const-string v2, "bnc_no_value"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lio/branch/referral/Branch;->enableFacebookAppLinkCheck_:Z

    if-nez v0, :cond_2

    goto :goto_0

    .line 2336
    :cond_2
    iget-object v0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    new-instance v2, Lio/branch/referral/Branch$1;

    invoke-direct {v2, p0}, Lio/branch/referral/Branch$1;-><init>(Lio/branch/referral/Branch;)V

    invoke-static {v0, v2}, Lio/branch/referral/DeferredAppLinkDataHandler;->fetchDeferredAppLinkData(Landroid/content/Context;Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2352
    sget-object v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->FB_APP_LINK_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-direct {p0, p1, v0}, Lio/branch/referral/Branch;->registerAppInit(Lio/branch/referral/Branch$BranchReferralInitListener;Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    goto :goto_1

    .line 2354
    :cond_3
    invoke-direct {p0, p1, v1}, Lio/branch/referral/Branch;->registerAppInit(Lio/branch/referral/Branch$BranchReferralInitListener;Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    goto :goto_1

    .line 2332
    :cond_4
    :goto_0
    invoke-direct {p0, p1, v1}, Lio/branch/referral/Branch;->registerAppInit(Lio/branch/referral/Branch$BranchReferralInitListener;Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    :goto_1
    return-void

    .line 2320
    :cond_5
    :goto_2
    sget-object v0, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    iput-object v0, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    if-eqz p1, :cond_6

    .line 2323
    new-instance v0, Lio/branch/referral/BranchError;

    const-string v2, "Trouble initializing Branch."

    const/16 v3, -0x72

    invoke-direct {v0, v2, v3}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v1, v0}, Lio/branch/referral/Branch$BranchReferralInitListener;->onInitFinished(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V

    :cond_6
    const-string p1, "BranchSDK"

    const-string v0, "Branch Warning: Please enter your branch_key in your project\'s res/values/strings.xml!"

    .line 2325
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private insertRequestAtFront(Lio/branch/referral/ServerRequest;)V
    .locals 2

    .line 2292
    iget v0, p0, Lio/branch/referral/Branch;->networkCount_:I

    if-nez v0, :cond_0

    .line 2293
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lio/branch/referral/ServerRequestQueue;->insert(Lio/branch/referral/ServerRequest;I)V

    goto :goto_0

    .line 2295
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lio/branch/referral/ServerRequestQueue;->insert(Lio/branch/referral/ServerRequest;I)V

    :goto_0
    return-void
.end method

.method private isActivityLaunchedFromHistory(Landroid/app/Activity;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 1573
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    move-result p1

    const/high16 v0, 0x100000

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static isAutoDeepLinkLaunch(Landroid/app/Activity;)Z
    .locals 1

    .line 3029
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v0, "io.branch.sdk.auto_linked"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isDeviceIDFetchDisabled()Z
    .locals 1

    .line 833
    sget-boolean v0, Lio/branch/referral/Branch;->disableDeviceIDFetch_:Z

    return v0
.end method

.method public static isForceSessionEnabled()Z
    .locals 1

    .line 3175
    sget-boolean v0, Lio/branch/referral/Branch;->isForcedSession_:Z

    return v0
.end method

.method public static isInstantApp(Landroid/content/Context;)Z
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 3836
    invoke-static {p0}, Lio/branch/referral/InstantAppUtil;->isInstantApp(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method private isIntentParamsAlreadyConsumed(Landroid/app/Activity;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1569
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->BranchLinkUsed:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private onIntentReady(Landroid/app/Activity;Z)V
    .locals 2

    .line 2414
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    sget-object v1, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->INTENT_PENDING_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {v0, v1}, Lio/branch/referral/ServerRequestQueue;->unlockProcessWait(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    if-eqz p2, :cond_2

    .line 2417
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    .line 2418
    invoke-direct {p0, p2, p1}, Lio/branch/referral/Branch;->readAndStripParam(Landroid/net/Uri;Landroid/app/Activity;)Z

    .line 2420
    invoke-virtual {p0}, Lio/branch/referral/Branch;->isTrackingDisabled()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lio/branch/referral/Branch;->cookieBasedMatchDomain_:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object p1

    const-string p2, "bnc_no_value"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 2421
    iget-boolean p1, p0, Lio/branch/referral/Branch;->isGAParamsFetchInProgress_:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 2423
    iput-boolean p1, p0, Lio/branch/referral/Branch;->performCookieBasedStrongMatchingOnGAIDAvailable:Z

    goto :goto_0

    .line 2425
    :cond_0
    invoke-direct {p0}, Lio/branch/referral/Branch;->performCookieBasedStrongMatch()V

    goto :goto_0

    .line 2428
    :cond_1
    invoke-direct {p0}, Lio/branch/referral/Branch;->processNextQueueItem()V

    goto :goto_0

    .line 2431
    :cond_2
    invoke-direct {p0}, Lio/branch/referral/Branch;->processNextQueueItem()V

    :goto_0
    return-void
.end method

.method private pathMatch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    const-string v0, "\\?"

    .line 3129
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const-string v1, "\\?"

    .line 3130
    invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    aget-object p2, p2, v0

    const-string v1, "/"

    invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 3131
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_0

    return v0

    :cond_0
    move v1, v0

    .line 3134
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    array-length v2, p2

    if-ge v1, v2, :cond_2

    .line 3135
    aget-object v2, p1, v1

    .line 3136
    aget-object v3, p2, v1

    .line 3137
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "*"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private performCookieBasedStrongMatch()V
    .locals 10

    .line 2436
    iget-object v0, p0, Lio/branch/referral/Branch;->trackingController:Lio/branch/referral/TrackingController;

    invoke-virtual {v0}, Lio/branch/referral/TrackingController;->isTrackingDisabled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2437
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getExternDebug()Z

    move-result v0

    iget-object v1, p0, Lio/branch/referral/Branch;->systemObserver_:Lio/branch/referral/SystemObserver;

    sget-boolean v2, Lio/branch/referral/Branch;->disableDeviceIDFetch_:Z

    invoke-static {v0, v1, v2}, Lio/branch/referral/DeviceInfo;->getInstance(ZLio/branch/referral/SystemObserver;Z)Lio/branch/referral/DeviceInfo;

    move-result-object v6

    .line 2439
    iget-object v0, p0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2440
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 2442
    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz v4, :cond_2

    .line 2444
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->setStrongMatchWaitLock()V

    .line 2445
    invoke-static {}, Lio/branch/referral/BranchStrongMatchHelper;->getInstance()Lio/branch/referral/BranchStrongMatchHelper;

    move-result-object v3

    sget-object v5, Lio/branch/referral/Branch;->cookieBasedMatchDomain_:Ljava/lang/String;

    iget-object v7, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v8, p0, Lio/branch/referral/Branch;->systemObserver_:Lio/branch/referral/SystemObserver;

    new-instance v9, Lio/branch/referral/Branch$2;

    invoke-direct {v9, p0}, Lio/branch/referral/Branch$2;-><init>(Lio/branch/referral/Branch;)V

    invoke-virtual/range {v3 .. v9}, Lio/branch/referral/BranchStrongMatchHelper;->checkForStrongMatch(Landroid/content/Context;Ljava/lang/String;Lio/branch/referral/DeviceInfo;Lio/branch/referral/PrefHelper;Lio/branch/referral/SystemObserver;Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;)V

    :cond_2
    return-void
.end method

.method private processNextQueueItem()V
    .locals 5

    .line 2203
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/Branch;->serverSema_:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 2204
    iget v0, p0, Lio/branch/referral/Branch;->networkCount_:I

    if-nez v0, :cond_5

    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->getSize()I

    move-result v0

    if-lez v0, :cond_5

    const/4 v0, 0x1

    .line 2205
    iput v0, p0, Lio/branch/referral/Branch;->networkCount_:I

    .line 2206
    iget-object v1, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v1}, Lio/branch/referral/ServerRequestQueue;->peek()Lio/branch/referral/ServerRequest;

    move-result-object v1

    .line 2208
    iget-object v2, p0, Lio/branch/referral/Branch;->serverSema_:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    if-eqz v1, :cond_4

    .line 2210
    invoke-virtual {v1}, Lio/branch/referral/ServerRequest;->isWaitingOnProcessToFinish()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_3

    .line 2212
    instance-of v2, v1, Lio/branch/referral/ServerRequestRegisterInstall;

    const/16 v4, -0x65

    if-nez v2, :cond_0

    invoke-direct {p0}, Lio/branch/referral/Branch;->hasUser()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v1, "BranchSDK"

    const-string v2, "Branch Error: User session has not been initialized!"

    .line 2213
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2214
    iput v3, p0, Lio/branch/referral/Branch;->networkCount_:I

    .line 2215
    iget-object v1, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v1}, Lio/branch/referral/ServerRequestQueue;->getSize()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-direct {p0, v1, v4}, Lio/branch/referral/Branch;->handleFailure(II)V

    goto :goto_0

    .line 2218
    :cond_0
    instance-of v2, v1, Lio/branch/referral/ServerRequestInitSession;

    if-nez v2, :cond_2

    invoke-direct {p0}, Lio/branch/referral/Branch;->hasSession()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0}, Lio/branch/referral/Branch;->hasDeviceFingerPrint()Z

    move-result v2

    if-nez v2, :cond_2

    .line 2219
    :cond_1
    iput v3, p0, Lio/branch/referral/Branch;->networkCount_:I

    .line 2220
    iget-object v1, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v1}, Lio/branch/referral/ServerRequestQueue;->getSize()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-direct {p0, v1, v4}, Lio/branch/referral/Branch;->handleFailure(II)V

    goto :goto_0

    .line 2222
    :cond_2
    new-instance v0, Lio/branch/referral/Branch$BranchPostTask;

    invoke-direct {v0, p0, v1}, Lio/branch/referral/Branch$BranchPostTask;-><init>(Lio/branch/referral/Branch;Lio/branch/referral/ServerRequest;)V

    .line 2223
    new-array v1, v3, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lio/branch/referral/Branch$BranchPostTask;->executeTask([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 2226
    :cond_3
    iput v3, p0, Lio/branch/referral/Branch;->networkCount_:I

    goto :goto_0

    .line 2229
    :cond_4
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/branch/referral/ServerRequestQueue;->remove(Lio/branch/referral/ServerRequest;)Z

    goto :goto_0

    .line 2232
    :cond_5
    iget-object v0, p0, Lio/branch/referral/Branch;->serverSema_:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2235
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private readAndStripParam(Landroid/net/Uri;Landroid/app/Activity;)Z
    .locals 10

    .line 1416
    sget-boolean v0, Lio/branch/referral/Branch;->disableInstantDeepLinking:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_5

    .line 1417
    iget-object v0, p0, Lio/branch/referral/Branch;->intentState_:Lio/branch/referral/Branch$INTENT_STATE;

    sget-object v3, Lio/branch/referral/Branch$INTENT_STATE;->READY:Lio/branch/referral/Branch$INTENT_STATE;

    if-eq v0, v3, :cond_0

    iget-boolean v0, p0, Lio/branch/referral/Branch;->isActivityCreatedAndLaunched:Z

    if-eqz v0, :cond_5

    :cond_0
    if-eqz p2, :cond_5

    .line 1419
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    sget-object v3, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    if-eq v0, v3, :cond_5

    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->checkIntentForSessionRestart(Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1420
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 1422
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_4

    iget-boolean v3, p0, Lio/branch/referral/Branch;->isActivityCreatedAndLaunched:Z

    if-nez v3, :cond_1

    invoke-direct {p0, p2}, Lio/branch/referral/Branch;->isIntentParamsAlreadyConsumed(Landroid/app/Activity;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_2

    .line 1438
    :cond_1
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->BranchData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1440
    :try_start_0
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->BranchData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1442
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1443
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->Clicked_Branch_Link:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1444
    iget-object v3, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/branch/referral/PrefHelper;->setSessionParams(Ljava/lang/String;)V

    .line 1445
    iput-boolean v2, p0, Lio/branch/referral/Branch;->isInstantDeepLinkPossible:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    .line 1447
    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    .line 1450
    :goto_0
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->BranchData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 1451
    invoke-virtual {p2, v0}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    goto/16 :goto_3

    .line 1454
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Instant:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1456
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1457
    invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1458
    invoke-virtual {p1, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 1460
    :cond_3
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->Clicked_Branch_Link:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1461
    iget-object v3, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lio/branch/referral/PrefHelper;->setSessionParams(Ljava/lang/String;)V

    .line 1462
    iput-boolean v2, p0, Lio/branch/referral/Branch;->isInstantDeepLinkPossible:Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    .line 1464
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_3

    .line 1425
    :cond_4
    :goto_2
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getInstallParams()Ljava/lang/String;

    move-result-object v0

    const-string v3, "bnc_no_value"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1426
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1428
    :try_start_2
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->Clicked_Branch_Link:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1429
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->IsFirstSession:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1430
    iget-object v3, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lio/branch/referral/PrefHelper;->setSessionParams(Ljava/lang/String;)V

    .line 1431
    iput-boolean v2, p0, Lio/branch/referral/Branch;->isInstantDeepLinkPossible:Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    .line 1433
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 1470
    :cond_5
    :goto_3
    iget-object v0, p0, Lio/branch/referral/Branch;->intentState_:Lio/branch/referral/Branch$INTENT_STATE;

    sget-object v3, Lio/branch/referral/Branch$INTENT_STATE;->READY:Lio/branch/referral/Branch$INTENT_STATE;

    if-ne v0, v3, :cond_11

    if-eqz p1, :cond_8

    .line 1473
    :try_start_3
    invoke-direct {p0, p2}, Lio/branch/referral/Branch;->isIntentParamsAlreadyConsumed(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 1474
    iget-object v0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-static {v0}, Lio/branch/referral/UniversalResourceAnalyser;->getInstance(Landroid/content/Context;)Lio/branch/referral/UniversalResourceAnalyser;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/branch/referral/UniversalResourceAnalyser;->getStrippedURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1475
    iput-object v0, p0, Lio/branch/referral/Branch;->sessionReferredLink_:Ljava/lang/String;

    .line 1476
    iget-object v3, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v3, v0}, Lio/branch/referral/PrefHelper;->setExternalIntentUri(Ljava/lang/String;)V

    if-eqz v0, :cond_8

    .line 1478
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz p2, :cond_8

    .line 1479
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 1480
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 1481
    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v3

    .line 1483
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-lez v4, :cond_8

    .line 1484
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1485
    sget-object v5, Lio/branch/referral/Branch;->EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST:[Ljava/lang/String;

    array-length v6, v5

    move v7, v1

    :goto_4
    if-ge v7, v6, :cond_7

    aget-object v8, v5, v7

    .line 1486
    invoke-interface {v3, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 1487
    invoke-virtual {v0, v8}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v4, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 1490
    :cond_7
    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_8

    .line 1491
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/branch/referral/PrefHelper;->setExternalIntentExtra(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_8
    if-eqz p2, :cond_9

    .line 1502
    :try_start_4
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 1503
    invoke-direct {p0, p2}, Lio/branch/referral/Branch;->isIntentParamsAlreadyConsumed(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1504
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->AndroidPushNotificationKey:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 1505
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_9

    .line 1506
    iget-object v3, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v3, v0}, Lio/branch/referral/PrefHelper;->setPushIdentifier(Ljava/lang/String;)V

    .line 1507
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 1508
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->BranchLinkUsed:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1509
    invoke-virtual {p2, v0}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    return v1

    :catch_4
    :cond_9
    if-eqz p1, :cond_11

    .line 1520
    invoke-virtual {p1}, Landroid/net/Uri;->isHierarchical()Z

    move-result v0

    if-eqz v0, :cond_11

    if-eqz p2, :cond_11

    invoke-direct {p0, p2}, Lio/branch/referral/Branch;->isActivityLaunchedFromHistory(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 1522
    :try_start_5
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 1523
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/branch/referral/PrefHelper;->setLinkClickIdentifier(Ljava/lang/String;)V

    .line 1524
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "link_click_id="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    .line 1526
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    if-eqz v4, :cond_a

    .line 1527
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v3

    .line 1529
    :cond_a
    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ne p1, v4, :cond_b

    .line 1530
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\\?"

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_b
    if-eqz v3, :cond_c

    .line 1531
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr p1, v4

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-ne p1, v4, :cond_c

    .line 1532
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "&"

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    .line 1534
    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_5
    if-eqz v3, :cond_d

    const-string v0, ""

    .line 1537
    invoke-virtual {v3, p1, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 1538
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1539
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->BranchLinkUsed:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_6

    :cond_d
    const-string p1, "BranchSDK"

    const-string p2, "Branch Warning. URI for the launcher activity is null. Please make sure that intent data is not set to null before calling Branch#InitSession "

    .line 1541
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_6
    return v2

    .line 1546
    :cond_e
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 1547
    invoke-virtual {p2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    if-eqz v0, :cond_11

    if-eqz v3, :cond_11

    const-string v4, "http"

    .line 1549
    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "https"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1550
    :cond_f
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_11

    invoke-direct {p0, p2}, Lio/branch/referral/Branch;->isIntentParamsAlreadyConsumed(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 1551
    iget-object v0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-static {v0}, Lio/branch/referral/UniversalResourceAnalyser;->getInstance(Landroid/content/Context;)Lio/branch/referral/UniversalResourceAnalyser;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/branch/referral/UniversalResourceAnalyser;->getStrippedURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1552
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1553
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/branch/referral/PrefHelper;->setAppLink(Ljava/lang/String;)V

    .line 1555
    :cond_10
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchLinkUsed:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1556
    invoke-virtual {p2, v3}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    return v1

    :catch_5
    :cond_11
    return v1
.end method

.method private registerAppInit(Lio/branch/referral/Branch$BranchReferralInitListener;Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V
    .locals 3

    .line 2364
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->getInstallOrOpenRequest(Lio/branch/referral/Branch$BranchReferralInitListener;)Lio/branch/referral/ServerRequest;

    move-result-object v0

    .line 2365
    invoke-virtual {v0, p2}, Lio/branch/referral/ServerRequest;->addProcessWaitLock(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    .line 2366
    iget-boolean p2, p0, Lio/branch/referral/Branch;->isGAParamsFetchInProgress_:Z

    if-eqz p2, :cond_0

    .line 2367
    sget-object p2, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->GAID_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {v0, p2}, Lio/branch/referral/ServerRequest;->addProcessWaitLock(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    .line 2371
    :cond_0
    iget-object p2, p0, Lio/branch/referral/Branch;->intentState_:Lio/branch/referral/Branch$INTENT_STATE;

    sget-object v1, Lio/branch/referral/Branch$INTENT_STATE;->READY:Lio/branch/referral/Branch$INTENT_STATE;

    if-eq p2, v1, :cond_1

    invoke-static {}, Lio/branch/referral/Branch;->isForceSessionEnabled()Z

    move-result p2

    if-nez p2, :cond_1

    .line 2372
    sget-object p2, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->INTENT_PENDING_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {v0, p2}, Lio/branch/referral/ServerRequest;->addProcessWaitLock(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    .line 2374
    :cond_1
    sget-boolean p2, Lio/branch/referral/Branch;->checkInstallReferrer_:Z

    if-eqz p2, :cond_2

    instance-of p2, v0, Lio/branch/referral/ServerRequestRegisterInstall;

    if-eqz p2, :cond_2

    sget-boolean p2, Lio/branch/referral/InstallListener;->unReportedReferrerAvailable:Z

    if-nez p2, :cond_2

    .line 2375
    sget-object p2, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->INSTALL_REFERRER_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {v0, p2}, Lio/branch/referral/ServerRequest;->addProcessWaitLock(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    .line 2376
    iget-object p2, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    sget-wide v1, Lio/branch/referral/Branch;->playStoreReferrerFetchTime:J

    invoke-static {p2, v1, v2, p0}, Lio/branch/referral/InstallListener;->captureInstallReferrer(Landroid/content/Context;JLio/branch/referral/InstallListener$IInstallReferrerEvents;)V

    .line 2379
    :cond_2
    invoke-direct {p0, v0, p1}, Lio/branch/referral/Branch;->registerInstallOrOpen(Lio/branch/referral/ServerRequest;Lio/branch/referral/Branch$BranchReferralInitListener;)V

    return-void
.end method

.method private registerInstallOrOpen(Lio/branch/referral/ServerRequest;Lio/branch/referral/Branch$BranchReferralInitListener;)V
    .locals 2

    .line 2301
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->containsInstallOrOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2302
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->insertRequestAtFront(Lio/branch/referral/ServerRequest;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 2310
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0, p2}, Lio/branch/referral/ServerRequestQueue;->setInstallOrOpenCallback(Lio/branch/referral/Branch$BranchReferralInitListener;)V

    .line 2312
    :cond_1
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    iget v1, p0, Lio/branch/referral/Branch;->networkCount_:I

    invoke-virtual {v0, p1, v1, p2}, Lio/branch/referral/ServerRequestQueue;->moveInstallOrOpenToFront(Lio/branch/referral/ServerRequest;ILio/branch/referral/Branch$BranchReferralInitListener;)V

    .line 2315
    :goto_0
    invoke-direct {p0}, Lio/branch/referral/Branch;->processNextQueueItem()V

    return-void
.end method

.method private reportInitSession(Lio/branch/referral/Branch$BranchReferralInitListener;)Z
    .locals 2

    if-eqz p1, :cond_2

    .line 1313
    sget-boolean v0, Lio/branch/referral/Branch;->isAutoSessionMode_:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 1316
    iget-boolean v0, p0, Lio/branch/referral/Branch;->isInitReportedThroughCallBack:Z

    if-nez v0, :cond_0

    .line 1317
    invoke-virtual {p0}, Lio/branch/referral/Branch;->getLatestReferringParams()Lorg/json/JSONObject;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Lio/branch/referral/Branch$BranchReferralInitListener;->onInitFinished(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V

    const/4 p1, 0x1

    .line 1318
    iput-boolean p1, p0, Lio/branch/referral/Branch;->isInitReportedThroughCallBack:Z

    goto :goto_0

    .line 1320
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p1, v0, v1}, Lio/branch/referral/Branch$BranchReferralInitListener;->onInitFinished(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V

    goto :goto_0

    .line 1324
    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p1, v0, v1}, Lio/branch/referral/Branch$BranchReferralInitListener;->onInitFinished(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V

    .line 1327
    :cond_2
    :goto_0
    iget-boolean p1, p0, Lio/branch/referral/Branch;->isInitReportedThroughCallBack:Z

    return p1
.end method

.method private setActivityLifeCycleObserver(Landroid/app/Application;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 2512
    :try_start_0
    new-instance v0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;-><init>(Lio/branch/referral/Branch;Lio/branch/referral/Branch$1;)V

    .line 2514
    invoke-virtual {p1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 2515
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const/4 p1, 0x1

    .line 2516
    sput-boolean p1, Lio/branch/referral/Branch;->isActivityLifeCycleCallbackRegistered_:Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    .line 2519
    sput-boolean p1, Lio/branch/referral/Branch;->isActivityLifeCycleCallbackRegistered_:Z

    .line 2520
    sput-boolean p1, Lio/branch/referral/Branch;->isAutoSessionMode_:Z

    const-string p1, "BranchSDK"

    .line 2522
    new-instance v0, Lio/branch/referral/BranchError;

    const-string v1, ""

    const/16 v2, -0x6c

    invoke-direct {v0, v1, v2}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Lio/branch/referral/BranchError;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static setPlayStoreReferrerCheckTimeout(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 516
    :goto_0
    sput-boolean v0, Lio/branch/referral/Branch;->checkInstallReferrer_:Z

    .line 517
    sput-wide p0, Lio/branch/referral/Branch;->playStoreReferrerFetchTime:J

    return-void
.end method

.method private shareLink(Lio/branch/referral/Branch$ShareLinkBuilder;)V
    .locals 2

    .line 2120
    iget-object v0, p0, Lio/branch/referral/Branch;->shareLinkManager_:Lio/branch/referral/ShareLinkManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 2121
    invoke-virtual {v0, v1}, Lio/branch/referral/ShareLinkManager;->cancelShareLinkDialog(Z)V

    .line 2123
    :cond_0
    new-instance v0, Lio/branch/referral/ShareLinkManager;

    invoke-direct {v0}, Lio/branch/referral/ShareLinkManager;-><init>()V

    iput-object v0, p0, Lio/branch/referral/Branch;->shareLinkManager_:Lio/branch/referral/ShareLinkManager;

    .line 2124
    iget-object v0, p0, Lio/branch/referral/Branch;->shareLinkManager_:Lio/branch/referral/ShareLinkManager;

    invoke-virtual {v0, p1}, Lio/branch/referral/ShareLinkManager;->shareLink(Lio/branch/referral/Branch$ShareLinkBuilder;)Landroid/app/Dialog;

    return-void
.end method

.method public static showInstallPrompt(Landroid/app/Activity;I)Z
    .locals 4
    .param p0    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, ""

    .line 3849
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3850
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v1

    invoke-virtual {v1}, Lio/branch/referral/Branch;->getLatestReferringParams()Lorg/json/JSONObject;

    move-result-object v1

    .line 3851
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "~"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->ReferringLink:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    .line 3852
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, ""

    .line 3855
    :try_start_0
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "UTF-8"

    .line 3857
    invoke-static {v3, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 3859
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    move-object v1, v3

    .line 3861
    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 3862
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->IsFullAppConv:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "=true&"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->ReferringLink:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3866
    :cond_0
    invoke-static {p0, p1, v0}, Lio/branch/referral/InstantAppUtil;->doShowInstallPrompt(Landroid/app/Activity;ILjava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static showInstallPrompt(Landroid/app/Activity;ILio/branch/indexing/BranchUniversalObject;)Z
    .locals 2
    .param p0    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/indexing/BranchUniversalObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p2, :cond_1

    .line 3897
    new-instance v0, Lio/branch/referral/util/LinkProperties;

    invoke-direct {v0}, Lio/branch/referral/util/LinkProperties;-><init>()V

    invoke-virtual {p2, p0, v0}, Lio/branch/indexing/BranchUniversalObject;->getShortUrl(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Ljava/lang/String;

    move-result-object p2

    .line 3898
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ReferringLink:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 3899
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3900
    invoke-static {p0, p1, p2}, Lio/branch/referral/Branch;->showInstallPrompt(Landroid/app/Activity;ILjava/lang/String;)Z

    move-result p0

    return p0

    :cond_0
    const-string p2, ""

    .line 3902
    invoke-static {p0, p1, p2}, Lio/branch/referral/Branch;->showInstallPrompt(Landroid/app/Activity;ILjava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static showInstallPrompt(Landroid/app/Activity;ILjava/lang/String;)Z
    .locals 2
    .param p0    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 3879
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->IsFullAppConv:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "=true&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 3880
    invoke-static {p0, p1, p2}, Lio/branch/referral/InstantAppUtil;->doShowInstallPrompt(Landroid/app/Activity;ILjava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private startSession(Landroid/app/Activity;)V
    .locals 2

    .line 2623
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2624
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    .line 2626
    iput-boolean v1, p0, Lio/branch/referral/Branch;->isInitReportedThroughCallBack:Z

    .line 2627
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/Branch;->initSessionWithData(Landroid/net/Uri;Landroid/app/Activity;)Z

    return-void
.end method

.method private updateAllRequestsInQueue()V
    .locals 6

    const/4 v0, 0x0

    .line 2257
    :goto_0
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v1}, Lio/branch/referral/ServerRequestQueue;->getSize()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 2258
    iget-object v1, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v1, v0}, Lio/branch/referral/ServerRequestQueue;->peekAt(I)Lio/branch/referral/ServerRequest;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 2260
    invoke-virtual {v1}, Lio/branch/referral/ServerRequest;->getPost()Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 2262
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 2263
    invoke-virtual {v1}, Lio/branch/referral/ServerRequest;->getPost()Lorg/json/JSONObject;

    move-result-object v3

    sget-object v4, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v4}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v5}, Lio/branch/referral/PrefHelper;->getSessionID()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2265
    :cond_0
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2266
    invoke-virtual {v1}, Lio/branch/referral/ServerRequest;->getPost()Lorg/json/JSONObject;

    move-result-object v3

    sget-object v4, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v4}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v5}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2268
    :cond_1
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2269
    invoke-virtual {v1}, Lio/branch/referral/ServerRequest;->getPost()Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v3}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2275
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_3
    return-void
.end method


# virtual methods
.method public addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3779
    iget-object v0, p0, Lio/branch/referral/Branch;->instrumentationExtraData_:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public addExtraInstrumentationData(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3769
    iget-object v0, p0, Lio/branch/referral/Branch;->instrumentationExtraData_:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public addInstallMetadata(Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/Branch;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 886
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0, p1, p2}, Lio/branch/referral/PrefHelper;->addInstallMetadata(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public addUriHostsToSkip(Ljava/lang/String;)Lio/branch/referral/Branch;
    .locals 1

    .line 1638
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1639
    iget-object v0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-static {v0}, Lio/branch/referral/UniversalResourceAnalyser;->getInstance(Landroid/content/Context;)Lio/branch/referral/UniversalResourceAnalyser;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/branch/referral/UniversalResourceAnalyser;->addToSkipURLFormats(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public addWhiteListedScheme(Ljava/lang/String;)Lio/branch/referral/Branch;
    .locals 1

    if-eqz p1, :cond_0

    .line 1606
    iget-object v0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-static {v0}, Lio/branch/referral/UniversalResourceAnalyser;->getInstance(Landroid/content/Context;)Lio/branch/referral/UniversalResourceAnalyser;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/branch/referral/UniversalResourceAnalyser;->addToAcceptURLFormats(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public cancelShareLinkDialog(Z)V
    .locals 1

    .line 2136
    iget-object v0, p0, Lio/branch/referral/Branch;->shareLinkManager_:Lio/branch/referral/ShareLinkManager;

    if-eqz v0, :cond_0

    .line 2137
    invoke-virtual {v0, p1}, Lio/branch/referral/ShareLinkManager;->cancelShareLinkDialog(Z)V

    :cond_0
    return-void
.end method

.method clearPendingRequests()V
    .locals 1

    .line 1362
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->clear()V

    return-void
.end method

.method public closeSession()V
    .locals 2

    const-string v0, "BranchSDK"

    const-string v1, "closeSession() method is deprecated from SDK v1.14.6.Session is  automatically handled by Branch.In case you need to handle sessions manually inorder to support minimum sdk version less than 14 please consider using  SDK version 1.14.5"

    .line 1343
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method closeSessionInternal()V
    .locals 2

    .line 1353
    invoke-direct {p0}, Lio/branch/referral/Branch;->executeClose()V

    const/4 v0, 0x0

    .line 1354
    iput-object v0, p0, Lio/branch/referral/Branch;->sessionReferredLink_:Ljava/lang/String;

    .line 1355
    iget-object v0, p0, Lio/branch/referral/Branch;->trackingController:Lio/branch/referral/TrackingController;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lio/branch/referral/TrackingController;->updateTrackingState(Landroid/content/Context;)V

    return-void
.end method

.method public disableAppList()V
    .locals 0

    return-void
.end method

.method public disableTracking(Z)V
    .locals 2

    .line 486
    iget-object v0, p0, Lio/branch/referral/Branch;->trackingController:Lio/branch/referral/TrackingController;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lio/branch/referral/TrackingController;->disableTracking(Landroid/content/Context;Z)V

    return-void
.end method

.method public enableFacebookAppLinkCheck()V
    .locals 1

    const/4 v0, 0x1

    .line 859
    iput-boolean v0, p0, Lio/branch/referral/Branch;->enableFacebookAppLinkCheck_:Z

    return-void
.end method

.method generateShortLinkInternal(Lio/branch/referral/ServerRequestCreateUrl;)Ljava/lang/String;
    .locals 2

    .line 2094
    iget-boolean v0, p1, Lio/branch/referral/ServerRequestCreateUrl;->constructError_:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lio/branch/referral/ServerRequestCreateUrl;->handleErrors(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2095
    iget-object v0, p0, Lio/branch/referral/Branch;->linkCache_:Ljava/util/Map;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequestCreateUrl;->getLinkPost()Lio/branch/referral/BranchLinkData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2096
    iget-object v0, p0, Lio/branch/referral/Branch;->linkCache_:Ljava/util/Map;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequestCreateUrl;->getLinkPost()Lio/branch/referral/BranchLinkData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2097
    invoke-virtual {p1, v0}, Lio/branch/referral/ServerRequestCreateUrl;->onUrlAvailable(Ljava/lang/String;)V

    return-object v0

    .line 2100
    :cond_0
    invoke-virtual {p1}, Lio/branch/referral/ServerRequestCreateUrl;->isAsync()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2101
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->generateShortLinkAsync(Lio/branch/referral/ServerRequest;)V

    goto :goto_0

    .line 2103
    :cond_1
    invoke-direct {p0, p1}, Lio/branch/referral/Branch;->generateShortLinkSync(Lio/branch/referral/ServerRequestCreateUrl;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 1

    .line 450
    iget-object v0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    return-object v0
.end method

.method public getCreditHistory(Lio/branch/referral/Branch$BranchListResponseListener;)V
    .locals 6

    .line 1828
    sget-object v4, Lio/branch/referral/Branch$CreditHistoryOrder;->kMostRecentFirst:Lio/branch/referral/Branch$CreditHistoryOrder;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x64

    move-object v0, p0

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lio/branch/referral/Branch;->getCreditHistory(Ljava/lang/String;Ljava/lang/String;ILio/branch/referral/Branch$CreditHistoryOrder;Lio/branch/referral/Branch$BranchListResponseListener;)V

    return-void
.end method

.method public getCreditHistory(Ljava/lang/String;ILio/branch/referral/Branch$CreditHistoryOrder;Lio/branch/referral/Branch$BranchListResponseListener;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lio/branch/referral/Branch$CreditHistoryOrder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1866
    invoke-virtual/range {v0 .. v5}, Lio/branch/referral/Branch;->getCreditHistory(Ljava/lang/String;Ljava/lang/String;ILio/branch/referral/Branch$CreditHistoryOrder;Lio/branch/referral/Branch$BranchListResponseListener;)V

    return-void
.end method

.method public getCreditHistory(Ljava/lang/String;Lio/branch/referral/Branch$BranchListResponseListener;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1842
    sget-object v4, Lio/branch/referral/Branch$CreditHistoryOrder;->kMostRecentFirst:Lio/branch/referral/Branch$CreditHistoryOrder;

    const/4 v2, 0x0

    const/16 v3, 0x64

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lio/branch/referral/Branch;->getCreditHistory(Ljava/lang/String;Ljava/lang/String;ILio/branch/referral/Branch$CreditHistoryOrder;Lio/branch/referral/Branch$BranchListResponseListener;)V

    return-void
.end method

.method public getCreditHistory(Ljava/lang/String;Ljava/lang/String;ILio/branch/referral/Branch$CreditHistoryOrder;Lio/branch/referral/Branch$BranchListResponseListener;)V
    .locals 8
    .param p4    # Lio/branch/referral/Branch$CreditHistoryOrder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1892
    new-instance v7, Lio/branch/referral/ServerRequestGetRewardHistory;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    move-object v0, v7

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lio/branch/referral/ServerRequestGetRewardHistory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILio/branch/referral/Branch$CreditHistoryOrder;Lio/branch/referral/Branch$BranchListResponseListener;)V

    .line 1893
    iget-boolean p1, v7, Lio/branch/referral/ServerRequest;->constructError_:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v7, p1}, Lio/branch/referral/ServerRequest;->handleErrors(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1894
    invoke-virtual {p0, v7}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    :cond_0
    return-void
.end method

.method public getCredits()I
    .locals 1

    .line 1743
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getCreditCount()I

    move-result v0

    return v0
.end method

.method public getCreditsForBucket(Ljava/lang/String;)I
    .locals 1

    .line 1755
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0, p1}, Lio/branch/referral/PrefHelper;->getCreditCount(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getDeeplinkDebugParams()Lorg/json/JSONObject;
    .locals 2

    .line 2077
    iget-object v0, p0, Lio/branch/referral/Branch;->deeplinkDebugParams_:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "BranchSDK"

    const-string v1, "You\'re currently in deep link debug mode. Please comment out \'setDeepLinkDebugMode\' to receive the deep link parameters from a real Branch link"

    .line 2078
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2080
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch;->deeplinkDebugParams_:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getFirstReferringParams()Lorg/json/JSONObject;
    .locals 1

    .line 1976
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getInstallParams()Ljava/lang/String;

    move-result-object v0

    .line 1977
    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->convertParamsStringToDictionary(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 1978
    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->appendDebugParams(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public getFirstReferringParamsSync()Lorg/json/JSONObject;
    .locals 4

    .line 1995
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lio/branch/referral/Branch;->getFirstReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    .line 1996
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getInstallParams()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1998
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/Branch;->getFirstReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    sget v1, Lio/branch/referral/Branch;->LATCH_WAIT_UNTIL:I

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2002
    :catch_0
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getInstallParams()Ljava/lang/String;

    move-result-object v0

    .line 2003
    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->convertParamsStringToDictionary(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 2004
    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->appendDebugParams(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    .line 2005
    iput-object v1, p0, Lio/branch/referral/Branch;->getFirstReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method

.method public getLatestReferringParams()Lorg/json/JSONObject;
    .locals 1

    .line 2020
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getSessionParams()Ljava/lang/String;

    move-result-object v0

    .line 2021
    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->convertParamsStringToDictionary(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 2022
    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->appendDebugParams(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public getLatestReferringParamsSync()Lorg/json/JSONObject;
    .locals 4

    .line 2039
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lio/branch/referral/Branch;->getLatestReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    .line 2041
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    if-eq v0, v1, :cond_0

    .line 2042
    iget-object v0, p0, Lio/branch/referral/Branch;->getLatestReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    sget v1, Lio/branch/referral/Branch;->LATCH_WAIT_UNTIL:I

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2046
    :catch_0
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getSessionParams()Ljava/lang/String;

    move-result-object v0

    .line 2047
    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->convertParamsStringToDictionary(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 2048
    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->appendDebugParams(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    .line 2049
    iput-object v1, p0, Lio/branch/referral/Branch;->getLatestReferringParamsLatch:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method

.method public handleNewRequest(Lio/branch/referral/ServerRequest;)V
    .locals 5

    .line 2465
    iget-object v0, p0, Lio/branch/referral/Branch;->trackingController:Lio/branch/referral/TrackingController;

    invoke-virtual {v0}, Lio/branch/referral/TrackingController;->isTrackingDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2466
    invoke-virtual {p1}, Lio/branch/referral/ServerRequest;->reportTrackingDisabledError()V

    return-void

    .line 2470
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    if-eq v0, v1, :cond_6

    instance-of v0, p1, Lio/branch/referral/ServerRequestInitSession;

    if-nez v0, :cond_6

    .line 2472
    instance-of v0, p1, Lio/branch/referral/ServerRequestLogout;

    if-eqz v0, :cond_1

    const/16 v0, -0x65

    const-string v1, ""

    .line 2473
    invoke-virtual {p1, v0, v1}, Lio/branch/referral/ServerRequest;->handleFailure(ILjava/lang/String;)V

    const-string p1, "BranchSDK"

    const-string v0, "Branch is not initialized, cannot logout"

    .line 2474
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 2477
    :cond_1
    instance-of v0, p1, Lio/branch/referral/ServerRequestRegisterClose;

    if-eqz v0, :cond_2

    const-string p1, "BranchSDK"

    const-string v0, "Branch is not initialized, cannot close session"

    .line 2478
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 2482
    :cond_2
    iget-object v0, p0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2483
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_3
    move-object v0, v1

    .line 2485
    :goto_0
    sget-object v2, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sget-object v3, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_4

    .line 2486
    check-cast v1, Lio/branch/referral/Branch$BranchReferralInitListener;

    invoke-direct {p0, v1, v0, v4}, Lio/branch/referral/Branch;->initUserSessionInternal(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;Z)V

    goto :goto_2

    .line 2488
    :cond_4
    sget-object v2, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sget-object v3, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    if-ne v2, v3, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    .line 2489
    :goto_1
    check-cast v1, Lio/branch/referral/Branch$BranchReferralInitListener;

    invoke-direct {p0, v1, v0, v4}, Lio/branch/referral/Branch;->initUserSessionInternal(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;Z)V

    .line 2494
    :cond_6
    :goto_2
    instance-of v0, p1, Lio/branch/referral/ServerRequestPing;

    if-nez v0, :cond_7

    .line 2495
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequestQueue;->enqueue(Lio/branch/referral/ServerRequest;)V

    .line 2496
    invoke-virtual {p1}, Lio/branch/referral/ServerRequest;->onRequestQueued()V

    .line 2498
    :cond_7
    invoke-direct {p0}, Lio/branch/referral/Branch;->processNextQueueItem()V

    return-void
.end method

.method public initSession()Z
    .locals 1

    const/4 v0, 0x0

    .line 1033
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->initSession(Landroid/app/Activity;)Z

    move-result v0

    return v0
.end method

.method public initSession(Landroid/app/Activity;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1043
    check-cast v0, Lio/branch/referral/Branch$BranchReferralInitListener;

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchReferralInitListener;)Z
    .locals 1

    const/4 v0, 0x0

    .line 913
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, p1, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;)Z
    .locals 3

    .line 949
    sget-object v0, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sget-object v1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 950
    invoke-direct {p0, p1, p2, v2}, Lio/branch/referral/Branch;->initUserSessionInternal(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;Z)V

    goto :goto_1

    .line 952
    :cond_0
    sget-object v0, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sget-object v1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    if-ne v0, v1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 953
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Lio/branch/referral/Branch;->initUserSessionInternal(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;Z)V

    :goto_1
    return v2
.end method

.method public initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/net/Uri;)Z
    .locals 1

    const/4 v0, 0x0

    .line 987
    invoke-virtual {p0, p1, p2, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/net/Uri;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/net/Uri;Landroid/app/Activity;)Z
    .locals 0

    .line 1023
    invoke-direct {p0, p2, p3}, Lio/branch/referral/Branch;->readAndStripParam(Landroid/net/Uri;Landroid/app/Activity;)Z

    .line 1024
    invoke-virtual {p0, p1, p3}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Z)Z
    .locals 1

    const/4 v0, 0x0

    .line 1225
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, p1, p2, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;ZLandroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchReferralInitListener;ZLandroid/app/Activity;)Z
    .locals 0

    .line 1260
    invoke-direct {p0, p1, p3, p2}, Lio/branch/referral/Branch;->initUserSessionInternal(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchReferralInitListener;ZLandroid/net/Uri;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1153
    invoke-virtual {p0, p1, p2, p3, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;ZLandroid/net/Uri;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchReferralInitListener;ZLandroid/net/Uri;Landroid/app/Activity;)Z
    .locals 0

    .line 1192
    invoke-direct {p0, p3, p4}, Lio/branch/referral/Branch;->readAndStripParam(Landroid/net/Uri;Landroid/app/Activity;)Z

    .line 1193
    invoke-virtual {p0, p1, p2, p4}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;ZLandroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;)Z
    .locals 1

    const/4 v0, 0x0

    .line 900
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, p1, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/app/Activity;)Z
    .locals 3

    .line 928
    sget-object v0, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sget-object v1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 929
    invoke-direct {p0, p1, p2, v2}, Lio/branch/referral/Branch;->initUserSessionInternal(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/app/Activity;Z)V

    goto :goto_1

    .line 931
    :cond_0
    sget-object v0, Lio/branch/referral/Branch;->customReferrableSettings_:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sget-object v1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    if-ne v0, v1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 932
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Lio/branch/referral/Branch;->initUserSessionInternal(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/app/Activity;Z)V

    :goto_1
    return v2
.end method

.method public initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/net/Uri;)Z
    .locals 1

    const/4 v0, 0x0

    .line 971
    invoke-virtual {p0, p1, p2, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/net/Uri;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/net/Uri;Landroid/app/Activity;)Z
    .locals 0

    .line 1004
    invoke-direct {p0, p2, p3}, Lio/branch/referral/Branch;->readAndStripParam(Landroid/net/Uri;Landroid/app/Activity;)Z

    .line 1005
    invoke-virtual {p0, p1, p3}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/app/Activity;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Z)Z
    .locals 1

    const/4 v0, 0x0

    .line 1209
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, p1, p2, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;ZLandroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;ZLandroid/app/Activity;)Z
    .locals 0

    .line 1242
    invoke-direct {p0, p1, p3, p2}, Lio/branch/referral/Branch;->initUserSessionInternal(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;Landroid/app/Activity;Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;ZLandroid/net/Uri;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1135
    invoke-virtual {p0, p1, p2, p3, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;ZLandroid/net/Uri;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;ZLandroid/net/Uri;Landroid/app/Activity;)Z
    .locals 0

    .line 1172
    invoke-direct {p0, p3, p4}, Lio/branch/referral/Branch;->readAndStripParam(Landroid/net/Uri;Landroid/app/Activity;)Z

    .line 1173
    invoke-virtual {p0, p1, p2, p4}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchUniversalReferralInitListener;ZLandroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(Z)Z
    .locals 2

    const/4 v0, 0x0

    .line 1102
    move-object v1, v0

    check-cast v1, Lio/branch/referral/Branch$BranchReferralInitListener;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v1, p1, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;ZLandroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSession(ZLandroid/app/Activity;)Z
    .locals 1
    .param p2    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1117
    check-cast v0, Lio/branch/referral/Branch$BranchReferralInitListener;

    invoke-virtual {p0, v0, p1, p2}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;ZLandroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSessionForced(Lio/branch/referral/Branch$BranchReferralInitListener;)Z
    .locals 1

    .line 1056
    invoke-static {}, Lio/branch/referral/Branch;->enableForcedSession()V

    const/4 v0, 0x0

    .line 1057
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, p1, v0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1058
    invoke-direct {p0}, Lio/branch/referral/Branch;->processNextQueueItem()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public initSessionWithData(Landroid/net/Uri;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1074
    invoke-virtual {p0, p1, v0}, Lio/branch/referral/Branch;->initSessionWithData(Landroid/net/Uri;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public initSessionWithData(Landroid/net/Uri;Landroid/app/Activity;)Z
    .locals 0

    .line 1087
    invoke-direct {p0, p1, p2}, Lio/branch/referral/Branch;->readAndStripParam(Landroid/net/Uri;Landroid/app/Activity;)Z

    const/4 p1, 0x0

    .line 1088
    check-cast p1, Lio/branch/referral/Branch$BranchReferralInitListener;

    invoke-virtual {p0, p1, p2}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public isTrackingDisabled()Z
    .locals 1

    .line 495
    iget-object v0, p0, Lio/branch/referral/Branch;->trackingController:Lio/branch/referral/TrackingController;

    invoke-virtual {v0}, Lio/branch/referral/TrackingController;->isTrackingDisabled()Z

    move-result v0

    return v0
.end method

.method public isUserIdentified()Z
    .locals 2

    .line 1689
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getIdentity()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public loadRewards()V
    .locals 1

    const/4 v0, 0x0

    .line 1719
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->loadRewards(Lio/branch/referral/Branch$BranchReferralStateChangedListener;)V

    return-void
.end method

.method public loadRewards(Lio/branch/referral/Branch$BranchReferralStateChangedListener;)V
    .locals 2

    .line 1731
    new-instance v0, Lio/branch/referral/ServerRequestGetRewards;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lio/branch/referral/ServerRequestGetRewards;-><init>(Landroid/content/Context;Lio/branch/referral/Branch$BranchReferralStateChangedListener;)V

    .line 1732
    iget-boolean p1, v0, Lio/branch/referral/ServerRequest;->constructError_:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequest;->handleErrors(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1733
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    :cond_0
    return-void
.end method

.method public logout()V
    .locals 1

    const/4 v0, 0x0

    .line 1698
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->logout(Lio/branch/referral/Branch$LogoutStatusListener;)V

    return-void
.end method

.method public logout(Lio/branch/referral/Branch$LogoutStatusListener;)V
    .locals 2

    .line 1709
    new-instance v0, Lio/branch/referral/ServerRequestLogout;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lio/branch/referral/ServerRequestLogout;-><init>(Landroid/content/Context;Lio/branch/referral/Branch$LogoutStatusListener;)V

    .line 1710
    iget-boolean p1, v0, Lio/branch/referral/ServerRequest;->constructError_:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequest;->handleErrors(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1711
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    :cond_0
    return-void
.end method

.method public notifyNetworkAvailable()V
    .locals 2

    .line 2505
    new-instance v0, Lio/branch/referral/ServerRequestPing;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-direct {v0, v1}, Lio/branch/referral/ServerRequestPing;-><init>(Landroid/content/Context;)V

    .line 2506
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    return-void
.end method

.method public onBranchViewAccepted(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3793
    invoke-static {p1}, Lio/branch/referral/ServerRequestInitSession;->isInitSessionAction(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3794
    invoke-direct {p0}, Lio/branch/referral/Branch;->checkForAutoDeepLinkConfiguration()V

    :cond_0
    return-void
.end method

.method public onBranchViewCancelled(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3800
    invoke-static {p1}, Lio/branch/referral/ServerRequestInitSession;->isInitSessionAction(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3801
    invoke-direct {p0}, Lio/branch/referral/Branch;->checkForAutoDeepLinkConfiguration()V

    :cond_0
    return-void
.end method

.method public onBranchViewError(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3807
    invoke-static {p3}, Lio/branch/referral/ServerRequestInitSession;->isInitSessionAction(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3808
    invoke-direct {p0}, Lio/branch/referral/Branch;->checkForAutoDeepLinkConfiguration()V

    :cond_0
    return-void
.end method

.method public onBranchViewVisible(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onGAdsFetchFinished()V
    .locals 3

    const/4 v0, 0x0

    .line 1578
    iput-boolean v0, p0, Lio/branch/referral/Branch;->isGAParamsFetchInProgress_:Z

    .line 1579
    iget-object v1, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    sget-object v2, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->GAID_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {v1, v2}, Lio/branch/referral/ServerRequestQueue;->unlockProcessWait(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    .line 1580
    iget-boolean v1, p0, Lio/branch/referral/Branch;->performCookieBasedStrongMatchingOnGAIDAvailable:Z

    if-eqz v1, :cond_0

    .line 1581
    invoke-direct {p0}, Lio/branch/referral/Branch;->performCookieBasedStrongMatch()V

    .line 1582
    iput-boolean v0, p0, Lio/branch/referral/Branch;->performCookieBasedStrongMatchingOnGAIDAvailable:Z

    goto :goto_0

    .line 1584
    :cond_0
    invoke-direct {p0}, Lio/branch/referral/Branch;->processNextQueueItem()V

    :goto_0
    return-void
.end method

.method public onInstallReferrerEventsFinished()V
    .locals 2

    .line 1590
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    sget-object v1, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->INSTALL_REFERRER_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {v0, v1}, Lio/branch/referral/ServerRequestQueue;->unlockProcessWait(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    .line 1591
    invoke-direct {p0}, Lio/branch/referral/Branch;->processNextQueueItem()V

    return-void
.end method

.method public redeemRewards(I)V
    .locals 2

    .line 1768
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->DefaultBucket:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lio/branch/referral/Branch;->redeemRewards(Ljava/lang/String;ILio/branch/referral/Branch$BranchReferralStateChangedListener;)V

    return-void
.end method

.method public redeemRewards(ILio/branch/referral/Branch$BranchReferralStateChangedListener;)V
    .locals 1

    .line 1782
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->DefaultBucket:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lio/branch/referral/Branch;->redeemRewards(Ljava/lang/String;ILio/branch/referral/Branch$BranchReferralStateChangedListener;)V

    return-void
.end method

.method public redeemRewards(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1796
    invoke-virtual {p0, p1, p2, v0}, Lio/branch/referral/Branch;->redeemRewards(Ljava/lang/String;ILio/branch/referral/Branch$BranchReferralStateChangedListener;)V

    return-void
.end method

.method public redeemRewards(Ljava/lang/String;ILio/branch/referral/Branch$BranchReferralStateChangedListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1814
    new-instance v0, Lio/branch/referral/ServerRequestRedeemRewards;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-direct {v0, v1, p1, p2, p3}, Lio/branch/referral/ServerRequestRedeemRewards;-><init>(Landroid/content/Context;Ljava/lang/String;ILio/branch/referral/Branch$BranchReferralStateChangedListener;)V

    .line 1815
    iget-boolean p1, v0, Lio/branch/referral/ServerRequestRedeemRewards;->constructError_:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequestRedeemRewards;->handleErrors(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1816
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    :cond_0
    return-void
.end method

.method registerAppReInit()V
    .locals 3

    .line 2387
    iget-object v0, p0, Lio/branch/referral/Branch;->trackingController:Lio/branch/referral/TrackingController;

    invoke-virtual {v0}, Lio/branch/referral/TrackingController;->isTrackingDisabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2388
    iget-object v0, p0, Lio/branch/referral/Branch;->systemObserver_:Lio/branch/referral/SystemObserver;

    invoke-virtual {v0, p0}, Lio/branch/referral/SystemObserver;->prefetchGAdsParams(Lio/branch/referral/SystemObserver$GAdsParamsFetchEvents;)Z

    move-result v0

    iput-boolean v0, p0, Lio/branch/referral/Branch;->isGAParamsFetchInProgress_:Z

    .line 2390
    :cond_0
    iget v0, p0, Lio/branch/referral/Branch;->networkCount_:I

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 2391
    iput v0, p0, Lio/branch/referral/Branch;->networkCount_:I

    .line 2392
    iget-object v0, p0, Lio/branch/referral/Branch;->requestQueue_:Lio/branch/referral/ServerRequestQueue;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->clear()V

    :cond_1
    const/4 v0, 0x0

    .line 2394
    invoke-direct {p0, v0}, Lio/branch/referral/Branch;->getInstallOrOpenRequest(Lio/branch/referral/Branch$BranchReferralInitListener;)Lio/branch/referral/ServerRequest;

    move-result-object v1

    .line 2395
    iget-boolean v2, p0, Lio/branch/referral/Branch;->isGAParamsFetchInProgress_:Z

    if-eqz v2, :cond_2

    .line 2396
    sget-object v2, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->GAID_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {v1, v2}, Lio/branch/referral/ServerRequest;->addProcessWaitLock(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    .line 2398
    :cond_2
    invoke-direct {p0, v1, v0}, Lio/branch/referral/Branch;->registerInstallOrOpen(Lio/branch/referral/ServerRequest;Lio/branch/referral/Branch$BranchReferralInitListener;)V

    return-void
.end method

.method public registerView(Lio/branch/indexing/BranchUniversalObject;Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;)V
    .locals 2

    .line 3754
    iget-object p2, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    if-eqz p2, :cond_0

    .line 3755
    new-instance p2, Lio/branch/referral/util/BranchEvent;

    sget-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->VIEW_ITEM:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    invoke-direct {p2, v0}, Lio/branch/referral/util/BranchEvent;-><init>(Lio/branch/referral/util/BRANCH_STANDARD_EVENT;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lio/branch/indexing/BranchUniversalObject;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 3756
    invoke-virtual {p2, v0}, Lio/branch/referral/util/BranchEvent;->addContentItems([Lio/branch/indexing/BranchUniversalObject;)Lio/branch/referral/util/BranchEvent;

    move-result-object p1

    iget-object p2, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    .line 3757
    invoke-virtual {p1, p2}, Lio/branch/referral/util/BranchEvent;->logEvent(Landroid/content/Context;)Z

    :cond_0
    return-void
.end method

.method public resetUserSession()V
    .locals 1

    .line 773
    sget-object v0, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    iput-object v0, p0, Lio/branch/referral/Branch;->initState_:Lio/branch/referral/Branch$SESSION_STATE;

    return-void
.end method

.method public sendCommerceEvent(Lio/branch/referral/util/CommerceEvent;)V
    .locals 1
    .param p1    # Lio/branch/referral/util/CommerceEvent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1962
    invoke-virtual {p0, p1, v0, v0}, Lio/branch/referral/Branch;->sendCommerceEvent(Lio/branch/referral/util/CommerceEvent;Lorg/json/JSONObject;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V

    return-void
.end method

.method public sendCommerceEvent(Lio/branch/referral/util/CommerceEvent;Lorg/json/JSONObject;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V
    .locals 2
    .param p1    # Lio/branch/referral/util/CommerceEvent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1955
    new-instance v0, Lio/branch/referral/ServerRequestRActionCompleted;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-direct {v0, v1, p1, p2, p3}, Lio/branch/referral/ServerRequestRActionCompleted;-><init>(Landroid/content/Context;Lio/branch/referral/util/CommerceEvent;Lorg/json/JSONObject;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V

    .line 1956
    iget-boolean p1, v0, Lio/branch/referral/ServerRequest;->constructError_:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequest;->handleErrors(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1957
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    :cond_0
    return-void
.end method

.method public setBranchRemoteInterface(Lio/branch/referral/network/BranchRemoteInterface;)V
    .locals 0

    .line 460
    iput-object p1, p0, Lio/branch/referral/Branch;->branchRemoteInterface_:Lio/branch/referral/network/BranchRemoteInterface;

    return-void
.end method

.method public setDebug()V
    .locals 0

    .line 479
    invoke-static {}, Lio/branch/referral/Branch;->enableTestMode()V

    return-void
.end method

.method public setDeepLinkDebugMode(Lorg/json/JSONObject;)V
    .locals 0

    .line 843
    iput-object p1, p0, Lio/branch/referral/Branch;->deeplinkDebugParams_:Lorg/json/JSONObject;

    return-void
.end method

.method public setIdentity(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1657
    invoke-virtual {p0, p1, v0}, Lio/branch/referral/Branch;->setIdentity(Ljava/lang/String;Lio/branch/referral/Branch$BranchReferralInitListener;)V

    return-void
.end method

.method public setIdentity(Ljava/lang/String;Lio/branch/referral/Branch$BranchReferralInitListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/referral/Branch$BranchReferralInitListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 1671
    new-instance v0, Lio/branch/referral/ServerRequestIdentifyUserRequest;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-direct {v0, v1, p2, p1}, Lio/branch/referral/ServerRequestIdentifyUserRequest;-><init>(Landroid/content/Context;Lio/branch/referral/Branch$BranchReferralInitListener;Ljava/lang/String;)V

    .line 1672
    iget-boolean p1, v0, Lio/branch/referral/ServerRequest;->constructError_:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequest;->handleErrors(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1673
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    goto :goto_0

    .line 1675
    :cond_0
    check-cast v0, Lio/branch/referral/ServerRequestIdentifyUserRequest;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestIdentifyUserRequest;->isExistingID()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1676
    sget-object p1, Lio/branch/referral/Branch;->branchReferral_:Lio/branch/referral/Branch;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequestIdentifyUserRequest;->handleUserExist(Lio/branch/referral/Branch;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setLimitFacebookTracking(Z)V
    .locals 1

    .line 868
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0, p1}, Lio/branch/referral/PrefHelper;->setLimitFacebookTracking(Z)V

    return-void
.end method

.method public setNetworkTimeout(I)V
    .locals 1

    .line 812
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    if-eqz v0, :cond_0

    if-lez p1, :cond_0

    .line 813
    invoke-virtual {v0, p1}, Lio/branch/referral/PrefHelper;->setTimeout(I)V

    :cond_0
    return-void
.end method

.method public setRequestMetadata(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 875
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0, p1, p2}, Lio/branch/referral/PrefHelper;->setRequestMetadata(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setRetryCount(I)V
    .locals 1

    .line 784
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    .line 785
    invoke-virtual {v0, p1}, Lio/branch/referral/PrefHelper;->setRetryCount(I)V

    :cond_0
    return-void
.end method

.method public setRetryInterval(I)V
    .locals 1

    .line 797
    iget-object v0, p0, Lio/branch/referral/Branch;->prefHelper_:Lio/branch/referral/PrefHelper;

    if-eqz v0, :cond_0

    if-lez p1, :cond_0

    .line 798
    invoke-virtual {v0, p1}, Lio/branch/referral/PrefHelper;->setRetryInterval(I)V

    :cond_0
    return-void
.end method

.method public setWhiteListedSchemes(Ljava/util/List;)Lio/branch/referral/Branch;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/branch/referral/Branch;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1623
    iget-object v0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-static {v0}, Lio/branch/referral/UniversalResourceAnalyser;->getInstance(Landroid/content/Context;)Lio/branch/referral/UniversalResourceAnalyser;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/branch/referral/UniversalResourceAnalyser;->addToAcceptURLFormats(Ljava/util/List;)V

    :cond_0
    return-object p0
.end method

.method updateSkipURLFormats()V
    .locals 2

    .line 1647
    iget-object v0, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-static {v0}, Lio/branch/referral/UniversalResourceAnalyser;->getInstance(Landroid/content/Context;)Lio/branch/referral/UniversalResourceAnalyser;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lio/branch/referral/UniversalResourceAnalyser;->checkAndUpdateSkipURLFormats(Landroid/content/Context;)V

    return-void
.end method

.method public userCompletedAction(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1919
    invoke-virtual {p0, p1, v0, v0}, Lio/branch/referral/Branch;->userCompletedAction(Ljava/lang/String;Lorg/json/JSONObject;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V

    return-void
.end method

.method public userCompletedAction(Ljava/lang/String;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V
    .locals 1

    const/4 v0, 0x0

    .line 1932
    invoke-virtual {p0, p1, v0, p2}, Lio/branch/referral/Branch;->userCompletedAction(Ljava/lang/String;Lorg/json/JSONObject;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V

    return-void
.end method

.method public userCompletedAction(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1908
    invoke-virtual {p0, p1, p2, v0}, Lio/branch/referral/Branch;->userCompletedAction(Ljava/lang/String;Lorg/json/JSONObject;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V

    return-void
.end method

.method public userCompletedAction(Ljava/lang/String;Lorg/json/JSONObject;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1947
    new-instance v0, Lio/branch/referral/ServerRequestActionCompleted;

    iget-object v1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-direct {v0, v1, p1, p2, p3}, Lio/branch/referral/ServerRequestActionCompleted;-><init>(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V

    .line 1948
    iget-boolean p1, v0, Lio/branch/referral/ServerRequest;->constructError_:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/branch/referral/Branch;->context_:Landroid/content/Context;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequest;->handleErrors(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1949
    invoke-virtual {p0, v0}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    :cond_0
    return-void
.end method
