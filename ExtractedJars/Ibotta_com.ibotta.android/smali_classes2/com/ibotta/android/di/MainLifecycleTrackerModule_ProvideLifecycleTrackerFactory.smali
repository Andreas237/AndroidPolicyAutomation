.class public final Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final appProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field

.field private final appboyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;"
        }
    .end annotation
.end field

.field private final appsFlyerStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
            ">;"
        }
    .end annotation
.end field

.field private final breadcrumbLifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final criticalDependencyLifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaLifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final newRelicLifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
            ">;)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appProvider:Ljavax/inject/Provider;

    .line 58
    iput-object p2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 59
    iput-object p3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appboyProvider:Ljavax/inject/Provider;

    .line 60
    iput-object p4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 61
    iput-object p5, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 62
    iput-object p6, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->ibottaLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 63
    iput-object p7, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->criticalDependencyLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 64
    iput-object p8, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->breadcrumbLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 65
    iput-object p9, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->newRelicLifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 66
    iput-object p10, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appsFlyerStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
            ">;)",
            "Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;"
        }
    .end annotation

    .line 119
    new-instance v11, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v11
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/sdk/LifecycleTracker;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
            ">;)",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;"
        }
    .end annotation

    .line 96
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/App;

    .line 97
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 98
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/appboy/Appboy;

    .line 99
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/profile/BuildProfile;

    .line 100
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/util/AppHelper;

    .line 101
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;

    .line 102
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;

    .line 103
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;

    .line 104
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;

    .line 105
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    move-object p0, v0

    move-object p1, v1

    move-object p2, v2

    move-object p3, v3

    move-object p4, v4

    move-object p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    .line 95
    invoke-static/range {p0 .. p9}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->proxyProvideLifecycleTracker(Lcom/ibotta/android/App;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/appboy/Appboy;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;)Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideLifecycleTracker(Lcom/ibotta/android/App;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/appboy/Appboy;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;)Lcom/ibotta/android/tracking/sdk/LifecycleTracker;
    .locals 0

    .line 144
    invoke-static/range {p0 .. p9}, Lcom/ibotta/android/di/MainLifecycleTrackerModule;->provideLifecycleTracker(Lcom/ibotta/android/App;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/appboy/Appboy;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/sdk/IbottaLifecycleTracker;Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;Lcom/ibotta/android/state/app/pojo/AppsFlyerState;)Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 143
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/sdk/LifecycleTracker;
    .locals 10

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appboyProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->ibottaLifecycleTrackerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->criticalDependencyLifecycleTrackerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->breadcrumbLifecycleTrackerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->newRelicLifecycleTrackerProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->appsFlyerStateProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v9}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideLifecycleTrackerFactory;->get()Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    move-result-object v0

    return-object v0
.end method
