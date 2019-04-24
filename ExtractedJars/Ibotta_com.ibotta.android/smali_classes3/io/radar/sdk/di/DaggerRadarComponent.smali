.class public final Lio/radar/sdk/di/DaggerRadarComponent;
.super Ljava/lang/Object;
.source "DaggerRadarComponent.java"

# interfaces
.implements Lio/radar/sdk/di/RadarComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/di/DaggerRadarComponent$Builder;
    }
.end annotation


# instance fields
.field private apiClientProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/api/ApiClient;",
            ">;"
        }
    .end annotation
.end field

.field private apiClientRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/api/ApiClientRepository;",
            ">;"
        }
    .end annotation
.end field

.field private apiServiceProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/api/ApiService;",
            ">;"
        }
    .end annotation
.end field

.field private configRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/config/ConfigRepository;",
            ">;"
        }
    .end annotation
.end field

.field private contextProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private deviceHelperProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/DeviceHelper;",
            ">;"
        }
    .end annotation
.end field

.field private geofencingClientProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/GeofencingClient;",
            ">;"
        }
    .end annotation
.end field

.field private identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/IdentityRepository;",
            ">;"
        }
    .end annotation
.end field

.field private integrationHelperProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/IntegrationHelper;",
            ">;"
        }
    .end annotation
.end field

.field private locationClientProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/google/android/gms/location/FusedLocationProviderClient;",
            ">;"
        }
    .end annotation
.end field

.field private locationManagerProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/location/LocationManager;",
            ">;"
        }
    .end annotation
.end field

.field private locationManagerRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/location/LocationManagerRepository;",
            ">;"
        }
    .end annotation
.end field

.field private optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private requestQueueProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/android/volley/RequestQueue;",
            ">;"
        }
    .end annotation
.end field

.field private stateManagerProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/state/StateManager;",
            ">;"
        }
    .end annotation
.end field

.field private stateManagerRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/state/StateManagerRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lio/radar/sdk/di/DaggerRadarComponent$Builder;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    invoke-direct {p0, p1}, Lio/radar/sdk/di/DaggerRadarComponent;->initialize(Lio/radar/sdk/di/DaggerRadarComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lio/radar/sdk/di/DaggerRadarComponent$Builder;Lio/radar/sdk/di/DaggerRadarComponent$1;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lio/radar/sdk/di/DaggerRadarComponent;-><init>(Lio/radar/sdk/di/DaggerRadarComponent$Builder;)V

    return-void
.end method

.method public static builder()Lio/radar/sdk/di/DaggerRadarComponent$Builder;
    .locals 2

    .line 75
    new-instance v0, Lio/radar/sdk/di/DaggerRadarComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/di/DaggerRadarComponent$Builder;-><init>(Lio/radar/sdk/di/DaggerRadarComponent$1;)V

    return-object v0
.end method

.method private initialize(Lio/radar/sdk/di/DaggerRadarComponent$Builder;)V
    .locals 8

    .line 81
    invoke-static {p1}, Lio/radar/sdk/di/DaggerRadarComponent$Builder;->access$100(Lio/radar/sdk/di/DaggerRadarComponent$Builder;)Lio/radar/sdk/di/CoreModule;

    move-result-object v0

    invoke-static {v0}, Lio/radar/sdk/di/CoreModule_ContextFactory;->create(Lio/radar/sdk/di/CoreModule;)Lio/radar/sdk/di/CoreModule_ContextFactory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 82
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 83
    invoke-static {v0}, Lio/radar/sdk/internal/repository/OptionsRepository_Factory;->create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/internal/repository/OptionsRepository_Factory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 84
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 85
    invoke-static {v0}, Lio/radar/sdk/internal/repository/IdentityRepository_Factory;->create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/internal/repository/IdentityRepository_Factory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 86
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 87
    invoke-static {v0}, Lio/radar/sdk/state/StateManagerRepository_Factory;->create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/state/StateManagerRepository_Factory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->stateManagerRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 88
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->stateManagerRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 90
    invoke-static {v0, v1}, Lio/radar/sdk/state/StateManager_Factory;->create(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/state/StateManager_Factory;

    move-result-object v0

    .line 89
    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->stateManagerProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 91
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 92
    invoke-static {v0}, Lio/radar/sdk/location/LocationManagerRepository_Factory;->create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/location/LocationManagerRepository_Factory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->locationManagerRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 93
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 94
    invoke-static {v0}, Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;->create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/di/LocationModule_GeofencingClientFactory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->geofencingClientProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 95
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 96
    invoke-static {v0}, Lio/radar/sdk/di/LocationModule_LocationClientFactory;->create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/di/LocationModule_LocationClientFactory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->locationClientProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 97
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v2, p0, Lio/radar/sdk/di/DaggerRadarComponent;->locationManagerRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v3, p0, Lio/radar/sdk/di/DaggerRadarComponent;->geofencingClientProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v4, p0, Lio/radar/sdk/di/DaggerRadarComponent;->locationClientProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 99
    invoke-static {v0, v1, v2, v3, v4}, Lio/radar/sdk/location/LocationManager_Factory;->create(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/location/LocationManager_Factory;

    move-result-object v0

    .line 98
    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->locationManagerProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 105
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 106
    invoke-static {v0}, Lio/radar/sdk/api/ApiClientRepository_Factory;->create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/api/ApiClientRepository_Factory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->apiClientRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 107
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 108
    invoke-static {v0}, Lio/radar/sdk/config/ConfigRepository_Factory;->create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/config/ConfigRepository_Factory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->configRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 109
    invoke-static {}, Lio/radar/sdk/util/IntegrationHelper_Factory;->create()Lio/radar/sdk/util/IntegrationHelper_Factory;

    move-result-object v0

    invoke-static {v0}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->integrationHelperProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 111
    invoke-static {p1}, Lio/radar/sdk/di/DaggerRadarComponent$Builder;->access$100(Lio/radar/sdk/di/DaggerRadarComponent$Builder;)Lio/radar/sdk/di/CoreModule;

    move-result-object p1

    invoke-static {p1}, Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;->create(Lio/radar/sdk/di/CoreModule;)Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;

    move-result-object p1

    invoke-static {p1}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->deviceHelperProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 112
    iget-object p1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 113
    invoke-static {p1}, Lio/radar/sdk/di/ApiModule_RequestQueueFactory;->create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/di/ApiModule_RequestQueueFactory;

    move-result-object p1

    invoke-static {p1}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->requestQueueProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 114
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v2, p0, Lio/radar/sdk/di/DaggerRadarComponent;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v3, p0, Lio/radar/sdk/di/DaggerRadarComponent;->apiClientRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v4, p0, Lio/radar/sdk/di/DaggerRadarComponent;->configRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v5, p0, Lio/radar/sdk/di/DaggerRadarComponent;->integrationHelperProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v6, p0, Lio/radar/sdk/di/DaggerRadarComponent;->deviceHelperProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v7, p0, Lio/radar/sdk/di/DaggerRadarComponent;->requestQueueProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 116
    invoke-static/range {v0 .. v7}, Lio/radar/sdk/api/ApiService_Factory;->create(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/api/ApiService_Factory;

    move-result-object p1

    .line 115
    invoke-static {p1}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->apiServiceProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 125
    iget-object p1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v2, p0, Lio/radar/sdk/di/DaggerRadarComponent;->apiClientRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v3, p0, Lio/radar/sdk/di/DaggerRadarComponent;->apiServiceProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 127
    invoke-static {p1, v0, v1, v2, v3}, Lio/radar/sdk/api/ApiClient_Factory;->create(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/api/ApiClient_Factory;

    move-result-object p1

    .line 126
    invoke-static {p1}, Lio/radar/shadow/dagger/internal/DoubleCheck;->provider(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/shadow/javax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lio/radar/sdk/di/DaggerRadarComponent;->apiClientProvider:Lio/radar/shadow/javax/inject/Provider;

    return-void
.end method

.method private injectRadar(Lio/radar/sdk/Radar;)Lio/radar/sdk/Radar;
    .locals 8

    .line 141
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 143
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 144
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lio/radar/sdk/internal/repository/OptionsRepository;

    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 145
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lio/radar/sdk/internal/repository/IdentityRepository;

    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->stateManagerProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 146
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lio/radar/sdk/state/StateManager;

    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->locationManagerProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 147
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lio/radar/sdk/location/LocationManager;

    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent;->apiClientProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 148
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lio/radar/sdk/api/ApiClient;

    move-object v1, p1

    .line 141
    invoke-static/range {v1 .. v7}, Lio/radar/sdk/Radar_MembersInjector;->injectInit$sdk_release(Lio/radar/sdk/Radar;Landroid/content/Context;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/state/StateManager;Lio/radar/sdk/location/LocationManager;Lio/radar/sdk/api/ApiClient;)V

    return-object p1
.end method


# virtual methods
.method public inject(Lio/radar/sdk/Radar;)V
    .locals 0

    .line 137
    invoke-direct {p0, p1}, Lio/radar/sdk/di/DaggerRadarComponent;->injectRadar(Lio/radar/sdk/Radar;)Lio/radar/sdk/Radar;

    return-void
.end method
