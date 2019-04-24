.class public abstract Lcom/ibotta/android/di/TrackingModule;
.super Ljava/lang/Object;
.source "TrackingModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final LAST_TRACKING_KEY_PREFS_NAME:Ljava/lang/String; = "tracking_last_key"

.field private static final MAX_TOTAL_TRACKING_ENTRIES:I = 0x3e8

.field private static final TOTAL_ENTRY_THRESHOLD_FOR_AUTO_FLUSH:I = 0xc8


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getLocationEntry(Lcom/ibotta/android/state/user/UserState;)Ljava/util/Map$Entry;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/user/UserState;",
            ")",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 140
    invoke-interface {p0}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 142
    new-instance v0, Ljava/util/AbstractMap$SimpleEntry;

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    double-to-float p0, v2

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 143
    :cond_0
    new-instance v0, Ljava/util/AbstractMap$SimpleEntry;

    const/4 p0, 0x0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method static synthetic lambda$provideAccountEventContextProvider$5(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 243
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->ACCOUNT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    return-void
.end method

.method static synthetic lambda$provideAddFavoritesEventContextProvider$6(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 248
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->ADD_FAVORITES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    return-void
.end method

.method static synthetic lambda$provideBonusesEventContextProvider$12(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 278
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->BONUSES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    return-void
.end method

.method static synthetic lambda$provideCategoryEventContextProvider$7(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 253
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    return-void
.end method

.method static synthetic lambda$provideEventBodyFactory$0(Lcom/ibotta/android/state/user/UserState;)Ljava/lang/String;
    .locals 0

    .line 127
    invoke-interface {p0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$provideEventBodyFactory$1(Lcom/ibotta/android/state/user/UserState;)Ljava/util/Map$Entry;
    .locals 0

    .line 129
    invoke-static {p0}, Lcom/ibotta/android/di/TrackingModule;->getLocationEntry(Lcom/ibotta/android/state/user/UserState;)Ljava/util/Map$Entry;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$provideFeaturedEventContextProvider$8(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 258
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FEATURED:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    return-void
.end method

.method static synthetic lambda$provideFindRebatesEventContextProvider$9(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 263
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FIND_REBATES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    return-void
.end method

.method static synthetic lambda$provideGalleryEventContextProvider$10(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 268
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->GALLERY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    return-void
.end method

.method static synthetic lambda$provideIbottaTrackingClient$2(Lcom/ibotta/android/state/app/config/AppConfig;)Ljava/lang/Boolean;
    .locals 0

    .line 209
    invoke-interface {p0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingClientsConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->isIbottaTrackingEnabled()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$provideMyRebatesEventContextProvider$11(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 273
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->MY_REBATES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    return-void
.end method

.method static synthetic lambda$provideSeasonalEventContextProvider$13(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 283
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->SEASONAL:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    return-void
.end method

.method static synthetic lambda$provideV1TrackingClient$3(Lcom/ibotta/android/state/app/config/AppConfig;)Ljava/lang/Boolean;
    .locals 0

    .line 218
    invoke-interface {p0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingClientsConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->isIbottaV1TrackingEnabled()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$provideV1TrackingClient$4(Lcom/ibotta/android/state/app/config/AppConfig;)Ljava/lang/Boolean;
    .locals 0

    .line 219
    invoke-interface {p0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingClientsConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->isIbottaV1TrackingFakeEvents()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static provideAccountEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "AccountEventContextProvider"
    .end annotation

    .line 243
    sget-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$h3qss_fXRNjS-J4QIECJn0WNAXM;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$h3qss_fXRNjS-J4QIECJn0WNAXM;

    return-object v0
.end method

.method static provideAddFavoritesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "AddFavoritesEventContextProvider"
    .end annotation

    .line 248
    sget-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$M4Xv6BwZPBlzUTE-fyp3xBZ_hV8;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$M4Xv6BwZPBlzUTE-fyp3xBZ_hV8;

    return-object v0
.end method

.method static provideAdviceTrackingClient(Lcom/ibotta/android/tracking/IbottaTrackingClient;)Lcom/ibotta/android/tracking/TrackingClient;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "AdviceTrackingClient"
    .end annotation

    return-object p0
.end method

.method static provideAtomicBoundedInteger(Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;)Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "TrackingQueueBoundedInt"
    .end annotation

    .line 185
    invoke-interface {p0}, Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;->read()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    .line 187
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;

    new-instance v1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    invoke-direct {v0, p0, v2, v3, v1}, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;-><init>(IIILjava/util/concurrent/locks/Lock;)V

    .line 190
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->getAndIncrement()I

    return-object v0
.end method

.method static provideBonusesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "BonusesEventContextProvider"
    .end annotation

    .line 278
    sget-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$xCecxwPZ-ous4jGCsJtrTvaN4n4;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$xCecxwPZ-ous4jGCsJtrTvaN4n4;

    return-object v0
.end method

.method public static provideBrazeTracking(Lcom/appboy/Appboy;)Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 233
    new-instance v0, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;-><init>(Lcom/appboy/Appboy;)V

    return-object v0
.end method

.method public static provideBrazeTrackingUtil(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/collection/BonusBucketedComparator;)Lcom/ibotta/android/braze/BrazeTrackingDataFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 227
    new-instance v0, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/collection/BonusBucketedComparator;)V

    return-object v0
.end method

.method static provideCategoryEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CategoryEventContextProvider"
    .end annotation

    .line 253
    sget-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$rYafmZtzBJrOaIUY70JVUkutERE;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$rYafmZtzBJrOaIUY70JVUkutERE;

    return-object v0
.end method

.method static provideDefaultApi(Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;)Lcom/ibotta/tracking/generated/api/DefaultApi;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 103
    new-instance v0, Lcom/ibotta/tracking/generated/api/DefaultApi;

    invoke-direct {v0}, Lcom/ibotta/tracking/generated/api/DefaultApi;-><init>()V

    .line 105
    invoke-virtual {v0}, Lcom/ibotta/tracking/generated/api/DefaultApi;->getApiClient()Lcom/ibotta/tracking/generated/invoker/ApiClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->getHttpClient()Lcom/squareup/okhttp/OkHttpClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/OkHttpClient;->interceptors()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method static provideDefaultApiInterceptor()Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;
    .locals 5
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 85
    new-instance v0, Lcom/ibotta/api/HttpHeaders;

    sget-object v1, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-direct {v0, v1}, Lcom/ibotta/api/HttpHeaders;-><init>(Lcom/ibotta/api/ApiContext;)V

    .line 87
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    const-string v2, "X-App-Token"

    .line 90
    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getAppToken()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/ibotta/api/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Failed to get App Token for tracking header"

    const/4 v4, 0x0

    .line 92
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const-string v2, "X-App-Version"

    .line 95
    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    new-instance v0, Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;

    invoke-direct {v0, v1}, Lcom/ibotta/android/tracking/network/TrackingHeaderInterceptor;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method static provideEventBodyFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/google/GoogleState;Landroid/telephony/TelephonyManager;Ljava/util/concurrent/atomic/AtomicInteger;)Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;
    .locals 12
    .param p7    # Ljava/util/concurrent/atomic/AtomicInteger;
        .annotation runtime Ljavax/inject/Named;
            value = "EventIdCounter"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    move-object v0, p0

    .line 126
    new-instance v11, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;

    new-instance v1, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$WqjXDlabNsRldIVYVGMS9hwfYxs;

    invoke-direct {v1, p0}, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$WqjXDlabNsRldIVYVGMS9hwfYxs;-><init>(Lcom/ibotta/android/state/user/UserState;)V

    sget-object v2, Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;

    new-instance v3, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$nIg9CmWfMzhbt0byg7U_Ub1h-dE;

    invoke-direct {v3, p0}, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$nIg9CmWfMzhbt0byg7U_Ub1h-dE;-><init>(Lcom/ibotta/android/state/user/UserState;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lcom/ibotta/android/di/-$$Lambda$Hye9Gsw_vyrz0CSfSWopNUq6uC8;

    move-object v0, p1

    invoke-direct {v4, p1}, Lcom/ibotta/android/di/-$$Lambda$Hye9Gsw_vyrz0CSfSWopNUq6uC8;-><init>(Lcom/ibotta/android/state/session/SessionState;)V

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lcom/ibotta/android/di/-$$Lambda$7TytVVTku3yeS3B2NaRshvbsG_g;

    move-object v0, p2

    invoke-direct {v5, p2}, Lcom/ibotta/android/di/-$$Lambda$7TytVVTku3yeS3B2NaRshvbsG_g;-><init>(Lcom/ibotta/android/security/DeviceSecurity;)V

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lcom/ibotta/android/di/-$$Lambda$V5VEp8BAMCWcqseKItBAl-cLPVs;

    move-object v0, p3

    invoke-direct {v6, p3}, Lcom/ibotta/android/di/-$$Lambda$V5VEp8BAMCWcqseKItBAl-cLPVs;-><init>(Lcom/ibotta/android/hardware/Hardware;)V

    invoke-static/range {p4 .. p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lcom/ibotta/android/di/-$$Lambda$ii5LWN482Kg1bReNvmViQwwNDS0;

    move-object/from16 v0, p4

    invoke-direct {v7, v0}, Lcom/ibotta/android/di/-$$Lambda$ii5LWN482Kg1bReNvmViQwwNDS0;-><init>(Lcom/ibotta/android/profile/BuildProfile;)V

    invoke-static/range {p5 .. p5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lcom/ibotta/android/di/-$$Lambda$pExVevcjUO3U1NZK7Z5ctYYI-ug;

    move-object/from16 v0, p5

    invoke-direct {v8, v0}, Lcom/ibotta/android/di/-$$Lambda$pExVevcjUO3U1NZK7Z5ctYYI-ug;-><init>(Lcom/ibotta/android/state/app/google/GoogleState;)V

    move-object v0, v11

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;-><init>(Lcom/ibotta/android/abstractions/CustomerIdSupplier;Lcom/ibotta/android/abstractions/CurrentTimeSupplier;Lcom/ibotta/android/abstractions/UserLastLocationSupplier;Lcom/ibotta/android/abstractions/SessionIdSupplier;Lcom/ibotta/android/abstractions/UniqueDeviceIdSupplier;Lcom/ibotta/android/abstractions/IpAddressSupplier;Lcom/ibotta/android/abstractions/AppVersionSupplier;Lcom/ibotta/android/abstractions/GoogleAidSupplier;Landroid/telephony/TelephonyManager;Ljava/util/concurrent/atomic/AtomicInteger;)V

    return-object v11
.end method

.method static provideEventIdCounterAtomicInteger()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "EventIdCounter"
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 148
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    return-object v0
.end method

.method static provideFeaturedEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "FeaturedEventContextProvider"
    .end annotation

    .line 258
    sget-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$NT3AkFIQzP6HD0Mwc-KqtOMf1ds;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$NT3AkFIQzP6HD0Mwc-KqtOMf1ds;

    return-object v0
.end method

.method static provideFindRebatesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "FindRebatesEventContextProvider"
    .end annotation

    .line 263
    sget-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$ugU5t3CRLAAc5v_VdE1jNupdCU0;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$ugU5t3CRLAAc5v_VdE1jNupdCU0;

    return-object v0
.end method

.method static provideGalleryEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "GalleryEventContextProvider"
    .end annotation

    .line 268
    sget-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$auOF2JUxNpZ6A1ugkT5KxPibn3g;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$auOF2JUxNpZ6A1ugkT5KxPibn3g;

    return-object v0
.end method

.method static provideIbottaTrackingClient(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;)Lcom/ibotta/android/tracking/IbottaTrackingClient;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ")",
            "Lcom/ibotta/android/tracking/IbottaTrackingClient;"
        }
    .end annotation

    .line 208
    new-instance v0, Lcom/ibotta/android/tracking/IbottaTrackingClient;

    new-instance v1, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$KiHWkwQ2z2jdBBsP7VB5mNeU_sQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$KiHWkwQ2z2jdBBsP7VB5mNeU_sQ;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    invoke-direct {v0, p1, p2, v1}, Lcom/ibotta/android/tracking/IbottaTrackingClient;-><init>(Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;)V

    return-object v0
.end method

.method static provideIbottaTrackingQueue(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;)Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;
    .locals 2
    .param p0    # Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;
        .annotation runtime Ljavax/inject/Named;
            value = "RoomTrackingPersistence"
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;
        .annotation runtime Ljavax/inject/Named;
            value = "TrackingQueueBoundedInt"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;",
            ")",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 200
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    .line 201
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;

    .line 202
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-direct {v1, v0, p0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;-><init>(Ljava/util/concurrent/ExecutorService;Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;)V

    return-object v1
.end method

.method static provideMyRebatesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "MyRebatesEventContextProvider"
    .end annotation

    .line 273
    sget-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$vwyUt5kn-_ho8uH6Lu6-3Ejp408;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$vwyUt5kn-_ho8uH6Lu6-3Ejp408;

    return-object v0
.end method

.method static provideRoomKeyValuePersistence(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;)Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;",
            ")",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "RoomTrackingPersistence"
    .end annotation

    .line 180
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/RoomTrackingPersistence;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;)V

    return-object v0
.end method

.method static provideRoomTrackingFlushScheduler(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;Landroidx/work/WorkManager;)Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 161
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;

    .line 162
    invoke-interface {p0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;->getSizeAsLiveData()Landroid/arch/lifecycle/LiveData;

    move-result-object p0

    const-class v1, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;

    const/16 v2, 0xc8

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;-><init>(Landroid/arch/lifecycle/LiveData;Landroidx/work/WorkManager;Ljava/lang/Class;I)V

    return-object v0
.end method

.method static provideSeasonalEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "SeasonalEventContextProvider"
    .end annotation

    .line 283
    sget-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$Di30Kb3kTBuARyK46lFKH3WwsPk;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$Di30Kb3kTBuARyK46lFKH3WwsPk;

    return-object v0
.end method

.method static provideSharedPrefsLastKeyPersistence(Lcom/ibotta/android/App;)Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/App;",
            ")",
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 153
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/persistence/sharedprefs/SharedPrefsLastKeyPersistence;

    const-string v1, "tracking_last_key"

    const/4 v2, 0x0

    .line 154
    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/proprietary/persistence/sharedprefs/SharedPrefsLastKeyPersistence;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method static provideTrackingApiClient(Lcom/ibotta/tracking/generated/api/DefaultApi;)Lcom/ibotta/android/tracking/network/TrackingApiClient;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/tracking/generated/api/DefaultApi;",
            ")",
            "Lcom/ibotta/android/tracking/network/TrackingApiClient<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation

    .line 113
    new-instance v0, Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient;-><init>(Lcom/ibotta/tracking/generated/api/DefaultApi;)V

    return-object v0
.end method

.method static provideTrackingEventDao(Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;)Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 175
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;->getTrackingDao()Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;

    move-result-object p0

    return-object p0
.end method

.method static provideTrackingEventDatabase(Landroid/content/Context;)Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 170
    const-class v0, Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;

    const-string v1, "ibotta-tracking-events.db"

    invoke-static {p0, v0, v1}, Landroid/arch/persistence/room/Room;->databaseBuilder(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroid/arch/persistence/room/RoomDatabase$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/arch/persistence/room/RoomDatabase$Builder;->build()Landroid/arch/persistence/room/RoomDatabase;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;

    return-object p0
.end method

.method static provideV1TrackingClient(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;)Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;
    .locals 7
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ")",
            "Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;"
        }
    .end annotation

    .line 215
    new-instance v6, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    new-instance v3, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$hjaxWWcqBQvLNzQjqM3_tnWH9Nc;

    invoke-direct {v3, p0}, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$hjaxWWcqBQvLNzQjqM3_tnWH9Nc;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    new-instance v4, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$gsEPz8u_21n8uYsq3Xw_G_zx7Zo;

    invoke-direct {v4, p0}, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$gsEPz8u_21n8uYsq3Xw_G_zx7Zo;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    const-string p0, "context"

    const-string v0, "event_at"

    .line 220
    invoke-static {p0, v0}, Ljava9/util/Lists;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;-><init>(Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;Lcom/ibotta/android/tracking/proprietary/IsFakeEventsSupplier;Ljava/util/List;)V

    return-object v6
.end method
