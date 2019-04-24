.class public Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;
.super Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;
.source "IbottaLifecycleTracker.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final ACCEPTED:Ljava/lang/String; = "Accepted"

.field private static final DENIED:Ljava/lang/String; = "Denied"

.field private static final PERMANENTLY_DENIED:Ljava/lang/String; = "Permanently Denied"


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final appCacheState:Lcom/ibotta/android/state/app/cache/AppCacheState;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

.field private final ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation
.end field

.field private final partnerAppTracker:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

.field private final permissionStrategyManager:Lcom/ibotta/android/permissions/PermissionStrategyManager;

.field private final permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

.field private final sessionState:Lcom/ibotta/android/state/session/SessionState;

.field private final trackingFlushScheduler:Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/permissions/PermissionStrategyManager;Lcom/ibotta/android/state/app/cache/AppCacheState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/permissions/PermissionStrategyManager;",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;",
            "Lcom/ibotta/android/appcache/AppCache;",
            "Lcom/ibotta/android/state/user/UserState;",
            "Lcom/ibotta/android/state/session/SessionState;",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ")V"
        }
    .end annotation

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;-><init>()V

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->permissionStrategyManager:Lcom/ibotta/android/permissions/PermissionStrategyManager;

    .line 65
    iput-object p2, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->appCacheState:Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 66
    iput-object p3, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 67
    iput-object p4, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 68
    iput-object p5, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->sessionState:Lcom/ibotta/android/state/session/SessionState;

    .line 69
    iput-object p6, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->partnerAppTracker:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    .line 70
    iput-object p7, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 71
    iput-object p8, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 72
    iput-object p9, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    .line 73
    iput-object p10, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    .line 74
    iput-object p11, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->trackingFlushScheduler:Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;

    .line 75
    iput-object p12, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    return-void
.end method

.method private getLocationPermissionStatus(Landroid/support/v4/app/FragmentActivity;)Ljava/lang/String;
    .locals 4

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->createLocationPermissionsHelper(Landroid/support/v4/app/FragmentActivity;Lcom/ibotta/android/permissions/PermissionsListener;)Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object v0

    .line 131
    sget-object v1, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-interface {v0, v1}, Lcom/ibotta/android/permissions/PermissionsHelper;->isPermanentlyDenied(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v1

    .line 133
    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v2}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava9/util/J8Arrays;->stream([Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object v2

    new-instance v3, Lcom/ibotta/android/tracking/sdk/-$$Lambda$IbottaLifecycleTracker$_HMVI7GvrXv2cHeZTEqTuPf1Ygk;

    invoke-direct {v3, v0, p1}, Lcom/ibotta/android/tracking/sdk/-$$Lambda$IbottaLifecycleTracker$_HMVI7GvrXv2cHeZTEqTuPf1Ygk;-><init>(Lcom/ibotta/android/permissions/PermissionsHelper;Landroid/support/v4/app/FragmentActivity;)V

    .line 134
    invoke-interface {v2, v3}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 135
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    const-string v0, ""

    .line 136
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 137
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz v1, :cond_0

    const-string p1, "Permanently Denied"

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    const-string p1, "Accepted"

    return-object p1

    :cond_1
    const-string p1, "Denied"

    return-object p1
.end method

.method private getPushPermissionStatus(Landroid/app/Activity;)Ljava/lang/String;
    .locals 0

    .line 149
    invoke-static {p1}, Landroid/support/v4/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Accepted"

    goto :goto_0

    :cond_0
    const-string p1, "Permanently Denied"

    :goto_0
    return-object p1
.end method

.method static synthetic lambda$getLocationPermissionStatus$0(Lcom/ibotta/android/permissions/PermissionsHelper;Landroid/support/v4/app/FragmentActivity;Ljava/lang/String;)Z
    .locals 0

    .line 134
    invoke-interface {p0, p1, p2}, Lcom/ibotta/android/permissions/PermissionsHelper;->hasPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V
    .locals 3

    .line 85
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V

    const-string v0, "trackAppBecameForeground"

    const/4 v1, 0x0

    .line 87
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->sessionState:Lcom/ibotta/android/state/session/SessionState;

    invoke-interface {v0}, Lcom/ibotta/android/state/session/SessionState;->generateSessionId()V

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v1, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v2, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->invalidate(Lcom/ibotta/api/CacheableApiCall;)V

    .line 95
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->getLocationPermissionStatus(Landroid/support/v4/app/FragmentActivity;)Ljava/lang/String;

    move-result-object v0

    .line 96
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->getPushPermissionStatus(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    .line 99
    iget-object v1, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {v1, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->trackAppActive(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    const-string v1, "session_start"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;->createEventBody(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;->addEntry(Ljava/lang/Object;)V

    .line 104
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->permissionStrategyManager:Lcom/ibotta/android/permissions/PermissionStrategyManager;

    invoke-interface {p1}, Lcom/ibotta/android/permissions/PermissionStrategyManager;->trackNewSession()V

    .line 107
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->partnerAppTracker:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getPartnerAppTrackingConfig()Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/tracking/sdk/-$$Lambda$hu9Y5t-6CvYpB71O8xY33Vz4wBE;

    invoke-direct {v1, v0}, Lcom/ibotta/android/tracking/sdk/-$$Lambda$hu9Y5t-6CvYpB71O8xY33Vz4wBE;-><init>(Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;)V

    invoke-interface {p1, v1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;->checkPartnerApps(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppNameAndIdMap;)V

    return-void
.end method

.method public trackAppWentBackground(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 112
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppWentBackground(Landroid/support/v4/app/FragmentActivity;)V

    const-string v0, "trackAppWentBackground"

    const/4 v1, 0x0

    .line 114
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->getLocationPermissionStatus(Landroid/support/v4/app/FragmentActivity;)Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->getPushPermissionStatus(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    .line 119
    iget-object v1, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {v1, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;->trackAppInactive(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    const-string v1, "session_end"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;->createEventBody(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;->addEntry(Ljava/lang/Object;)V

    .line 123
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->appCacheState:Lcom/ibotta/android/state/app/cache/AppCacheState;

    invoke-interface {p1}, Lcom/ibotta/android/state/app/cache/AppCacheState;->invalidateGraphQLSalt()V

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;->trackingFlushScheduler:Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;

    invoke-interface {p1}, Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;->requestImmediateFlush()V

    return-void
.end method
