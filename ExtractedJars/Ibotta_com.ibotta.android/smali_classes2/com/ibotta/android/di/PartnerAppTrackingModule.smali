.class abstract Lcom/ibotta/android/di/PartnerAppTrackingModule;
.super Ljava/lang/Object;
.source "PartnerAppTrackingModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$providePartnerAppChecker$0(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 1

    .line 69
    invoke-interface {p1}, Lcom/ibotta/android/state/app/config/AppConfig;->getPartnerAppTrackingConfig()Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/ibotta/android/di/-$$Lambda$hu9Y5t-6CvYpB71O8xY33Vz4wBE;

    invoke-direct {v0, p1}, Lcom/ibotta/android/di/-$$Lambda$hu9Y5t-6CvYpB71O8xY33Vz4wBE;-><init>(Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;)V

    invoke-interface {p0, v0}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;->checkPartnerApps(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppNameAndIdMap;)V

    return-void
.end method

.method static providePartnerAppChecker(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;Landroid/content/SharedPreferences;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;
    .locals 10
    .param p4    # Landroid/content/SharedPreferences;
        .annotation runtime Ljavax/inject/Named;
            value = "SharedPrefsAppStateRetained"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 62
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v9

    .line 64
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;

    sget-object v4, Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lcom/ibotta/android/di/-$$Lambda$qWNk_GIfDvbRDOIFPzEnbDiInS0;

    invoke-direct {v5, p1}, Lcom/ibotta/android/di/-$$Lambda$qWNk_GIfDvbRDOIFPzEnbDiInS0;-><init>(Lcom/ibotta/android/state/user/auth/AuthManager;)V

    move-object v3, v0

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v3 .. v9}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppCheckerImpl;-><init>(Lcom/ibotta/android/abstractions/CurrentTimeSupplier;Lcom/ibotta/android/tracking/proprietary/pat/IsAuthenticatedUserSupplier;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;)V

    .line 68
    new-instance p1, Lcom/ibotta/android/di/-$$Lambda$PartnerAppTrackingModule$kgaCrTEh5M8_EHl3uG11xzkjxqI;

    invoke-direct {p1, v0, p0}, Lcom/ibotta/android/di/-$$Lambda$PartnerAppTrackingModule$kgaCrTEh5M8_EHl3uG11xzkjxqI;-><init>(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/state/app/config/AppConfig;)V

    invoke-interface {p0, p1}, Lcom/ibotta/android/state/app/config/AppConfig;->addAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V

    return-object v0
.end method

.method static providePartnerAppDetector(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 36
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetectorImpl;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/di/-$$Lambda$FLJgeG1i6RG9GqFmULWAaVGJJ9c;

    invoke-direct {v1, p0}, Lcom/ibotta/android/di/-$$Lambda$FLJgeG1i6RG9GqFmULWAaVGJJ9c;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    invoke-direct {v0, v1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetectorImpl;-><init>(Lcom/ibotta/android/tracking/proprietary/pat/AppIsInstalledFunction;)V

    return-object v0
.end method

.method static providePartnerAppEventFactory()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 42
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    .line 43
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactoryImpl;

    sget-object v2, Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;

    invoke-direct {v1, v0, v2}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactoryImpl;-><init>(Lcom/ibotta/android/json/IbottaJson;Lcom/ibotta/android/abstractions/CurrentTimeSupplier;)V

    return-object v1
.end method

.method static providePartnerAppTracker(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackerImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackerImpl;-><init>(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;)V

    return-object v0
.end method
