.class public abstract Lcom/ibotta/android/di/MiscModule;
.super Ljava/lang/Object;
.source "MiscModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$provideTrackingQueue$0(Lcom/ibotta/android/state/app/config/AppConfig;)Ljava/lang/Boolean;
    .locals 0

    .line 150
    invoke-interface {p0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingClientsConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->isIbottaV1TrackingFakeEvents()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$provideTrackingQueue$1(Lcom/ibotta/android/state/app/config/AppConfig;)Ljava/lang/Long;
    .locals 2

    .line 151
    invoke-interface {p0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingAppConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->getMaxRowAge()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$provideTrackingQueue$2(Lcom/ibotta/android/state/app/config/AppConfig;)Ljava/lang/Integer;
    .locals 0

    .line 152
    invoke-interface {p0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingAppConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->getMaxAttempts()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$provideTrackingQueue$3(Lcom/ibotta/android/state/app/config/AppConfig;)Ljava/lang/Integer;
    .locals 0

    .line 153
    invoke-interface {p0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingAppConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->getMaxRowsPerTable()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static provideAppHelper(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;)Lcom/ibotta/android/util/AppHelper;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 112
    new-instance v0, Lcom/ibotta/android/util/AppHelperImpl;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/util/AppHelperImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;)V

    return-object v0
.end method

.method static provideAppSemver(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/SemverFactory;)Lcom/ibotta/android/util/AppSemver;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 193
    new-instance v0, Lcom/ibotta/android/util/AppSemverImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/util/AppSemverImpl;-><init>(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/SemverFactory;)V

    return-object v0
.end method

.method public static provideAppTimingTracker()Lcom/ibotta/android/tracking/timing/AppTimingTracker;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 82
    new-instance v0, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;-><init>()V

    return-object v0
.end method

.method public static provideBonusBucketedComparator(Lcom/ibotta/api/helper/bonus/BonusHelper;)Lcom/ibotta/android/collection/BonusBucketedComparator;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 223
    new-instance v0, Lcom/ibotta/android/collection/BonusBucketedComparator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/collection/BonusBucketedComparator;-><init>(Lcom/ibotta/api/helper/bonus/BonusHelper;)V

    return-object v0
.end method

.method public static provideContentHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;)Lcom/ibotta/android/util/content/ContentHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 122
    new-instance v0, Lcom/ibotta/android/util/content/ContentHelperImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/util/content/ContentHelperImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-object v0
.end method

.method public static provideExpirationDateFormatSupplier(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/util/ExpirationRulesSupplier;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 93
    new-instance v0, Lcom/ibotta/android/di/ExpirationRulesSupplierImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ExpirationRulesSupplierImpl;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object v0
.end method

.method public static provideFavoriteRetailerNotifier()Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 127
    new-instance v0, Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;

    invoke-direct {v0}, Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;-><init>()V

    return-object v0
.end method

.method public static provideFileProviderHelper()Lcom/ibotta/android/share/FileProviderHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 132
    new-instance v0, Lcom/ibotta/android/share/FileProviderHelper;

    invoke-direct {v0}, Lcom/ibotta/android/share/FileProviderHelper;-><init>()V

    return-object v0
.end method

.method public static provideFormatting(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/android/util/Formatting;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 88
    new-instance v0, Lcom/ibotta/android/util/FormattingImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/util/FormattingImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V

    return-object v0
.end method

.method public static provideGalleryOrganizer(Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 237
    new-instance v0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;-><init>(Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)V

    return-object v0
.end method

.method public static provideGameQuestionDriverFactory(Lcom/ibotta/api/helper/offer/OptionHelper;)Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 218
    new-instance v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;-><init>(Lcom/ibotta/api/helper/offer/OptionHelper;)V

    return-object v0
.end method

.method public static provideIbottaListViewTrackingHelper()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 198
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewTrackingHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewTrackingHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideLocationUpdateManager(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Landroid/os/Looper;)Lcom/ibotta/android/service/location/LocationUpdateManager;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 229
    new-instance v0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Landroid/os/Looper;)V

    return-object v0
.end method

.method public static provideMCommEscortStrategyFactory(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;
    .locals 10
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 166
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object v9
.end method

.method public static provideMvpPresenterActions(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)Lcom/ibotta/android/mvp/base/MvpPresenterActions;
    .locals 7
    .param p2    # Lcom/ibotta/android/api/critical/CriticalDependency;
        .annotation runtime Ljavax/inject/Named;
            value = "CriticalDependencyAggregate"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 208
    new-instance v6, Lcom/ibotta/android/mvp/base/MvpPresenterActionsImpl;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/base/MvpPresenterActionsImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    return-object v6
.end method

.method public static provideRetailerParcelHelper(Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 117
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelperImpl;

    invoke-static {}, Lcom/ibotta/android/App;->getPlatform()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelperImpl;-><init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;Ljava/lang/String;)V

    return-object v0
.end method

.method public static provideSemverFactory()Lcom/ibotta/android/util/SemverFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 188
    new-instance v0, Lcom/ibotta/android/util/SemverFactory;

    invoke-direct {v0}, Lcom/ibotta/android/util/SemverFactory;-><init>()V

    return-object v0
.end method

.method public static provideStorageSiloState(Landroid/content/Context;)Lcom/ibotta/android/state/xprocess/StorageSiloState;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 103
    new-instance v0, Lcom/ibotta/android/state/xprocess/StorageSiloState;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static provideTMonitorClient(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 179
    new-instance v0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;

    new-instance v1, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;

    invoke-direct {v1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClientImpl;-><init>()V

    new-instance v2, Lcom/ibotta/android/tracking/tmonitor/NoOpTMonitorClientImpl;

    invoke-direct {v2}, Lcom/ibotta/android/tracking/tmonitor/NoOpTMonitorClientImpl;-><init>()V

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/ibotta/android/di/-$$Lambda$0SbalN_EF24n9z3ajp1iyvnW2Yk;

    invoke-direct {v3, p0}, Lcom/ibotta/android/di/-$$Lambda$0SbalN_EF24n9z3ajp1iyvnW2Yk;-><init>(Lcom/ibotta/android/profile/BuildProfile;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lcom/ibotta/android/di/-$$Lambda$Pbd_E-YbJFMekWznVlaZv_Gne9c;

    invoke-direct {p0, p1}, Lcom/ibotta/android/di/-$$Lambda$Pbd_E-YbJFMekWznVlaZv_Gne9c;-><init>(Lcom/ibotta/android/state/app/debug/DebugState;)V

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;-><init>(Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/DebugTrackingSupplier;Lcom/ibotta/android/tracking/DebugTrackingSupplier;)V

    return-object v0
.end method

.method public static provideTracker(Landroid/content/Context;)Lcom/ibotta/android/tracking/Tracker;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 77
    new-instance v0, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/GoogleAnalyticsTracker;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static provideTrackingQueue(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;)Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .locals 11
    .param p2    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    move-object v0, p4

    .line 144
    new-instance v10, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/di/-$$Lambda$VEtAMiRMkseAXLuQuruyS2LtI2o;

    move-object v2, p0

    invoke-direct {v1, p0}, Lcom/ibotta/android/di/-$$Lambda$VEtAMiRMkseAXLuQuruyS2LtI2o;-><init>(Lcom/ibotta/android/profile/BuildProfile;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/di/-$$Lambda$Pbd_E-YbJFMekWznVlaZv_Gne9c;

    move-object v3, p1

    invoke-direct {v2, p1}, Lcom/ibotta/android/di/-$$Lambda$Pbd_E-YbJFMekWznVlaZv_Gne9c;-><init>(Lcom/ibotta/android/state/app/debug/DebugState;)V

    new-instance v6, Lcom/ibotta/android/di/-$$Lambda$MiscModule$fE-pSA99U9ihkiEIbXeqlLpkDwQ;

    invoke-direct {v6, p4}, Lcom/ibotta/android/di/-$$Lambda$MiscModule$fE-pSA99U9ihkiEIbXeqlLpkDwQ;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    new-instance v7, Lcom/ibotta/android/di/-$$Lambda$MiscModule$rBIzwWFoq1JVWFWxTkfa9IXQlA8;

    invoke-direct {v7, p4}, Lcom/ibotta/android/di/-$$Lambda$MiscModule$rBIzwWFoq1JVWFWxTkfa9IXQlA8;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    new-instance v8, Lcom/ibotta/android/di/-$$Lambda$MiscModule$Y3FlubaeeqDV2n9Z-cqUpVjlrm4;

    invoke-direct {v8, p4}, Lcom/ibotta/android/di/-$$Lambda$MiscModule$Y3FlubaeeqDV2n9Z-cqUpVjlrm4;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    new-instance v9, Lcom/ibotta/android/di/-$$Lambda$MiscModule$jne8NyTSCAdC2geVIE4Kph7mLF8;

    invoke-direct {v9, p4}, Lcom/ibotta/android/di/-$$Lambda$MiscModule$jne8NyTSCAdC2geVIE4Kph7mLF8;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;)V

    move-object v0, v10

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;-><init>(Lcom/ibotta/android/tracking/DebugTrackingSupplier;Lcom/ibotta/android/tracking/DebugTrackingSupplier;Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;)V

    return-object v10
.end method

.method public static provideValidation(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/util/Validation;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 98
    new-instance v0, Lcom/ibotta/android/util/ValidationImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/util/ValidationImpl;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method
