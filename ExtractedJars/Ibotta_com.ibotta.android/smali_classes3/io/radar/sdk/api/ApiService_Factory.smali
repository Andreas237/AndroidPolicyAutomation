.class public final Lio/radar/sdk/api/ApiService_Factory;
.super Ljava/lang/Object;
.source "ApiService_Factory.java"

# interfaces
.implements Lio/radar/shadow/dagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/internal/Factory<",
        "Lio/radar/sdk/api/ApiService;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/api/ApiClientRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final configRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/config/ConfigRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceHelperProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/DeviceHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/IdentityRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final integrationHelperProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/IntegrationHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final queueProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/android/volley/RequestQueue;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/IdentityRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/api/ApiClientRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/config/ConfigRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/IntegrationHelper;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/DeviceHelper;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/android/volley/RequestQueue;",
            ">;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lio/radar/sdk/api/ApiService_Factory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 41
    iput-object p2, p0, Lio/radar/sdk/api/ApiService_Factory;->identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 42
    iput-object p3, p0, Lio/radar/sdk/api/ApiService_Factory;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 43
    iput-object p4, p0, Lio/radar/sdk/api/ApiService_Factory;->apiRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 44
    iput-object p5, p0, Lio/radar/sdk/api/ApiService_Factory;->configRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 45
    iput-object p6, p0, Lio/radar/sdk/api/ApiService_Factory;->integrationHelperProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 46
    iput-object p7, p0, Lio/radar/sdk/api/ApiService_Factory;->deviceHelperProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 47
    iput-object p8, p0, Lio/radar/sdk/api/ApiService_Factory;->queueProvider:Lio/radar/shadow/javax/inject/Provider;

    return-void
.end method

.method public static create(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/api/ApiService_Factory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/IdentityRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/api/ApiClientRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/config/ConfigRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/IntegrationHelper;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/DeviceHelper;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/android/volley/RequestQueue;",
            ">;)",
            "Lio/radar/sdk/api/ApiService_Factory;"
        }
    .end annotation

    .line 92
    new-instance v9, Lio/radar/sdk/api/ApiService_Factory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lio/radar/sdk/api/ApiService_Factory;-><init>(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)V

    return-object v9
.end method

.method public static provideInstance(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/api/ApiService;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/IdentityRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/api/ApiClientRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/config/ConfigRepository;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/IntegrationHelper;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/util/DeviceHelper;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lcom/android/volley/RequestQueue;",
            ">;)",
            "Lio/radar/sdk/api/ApiService;"
        }
    .end annotation

    .line 72
    new-instance v9, Lio/radar/sdk/api/ApiService;

    .line 73
    invoke-interface {p0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    .line 74
    invoke-interface {p1}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/radar/sdk/internal/repository/IdentityRepository;

    .line 75
    invoke-interface {p2}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lio/radar/sdk/internal/repository/OptionsRepository;

    .line 76
    invoke-interface {p3}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lio/radar/sdk/api/ApiClientRepository;

    .line 77
    invoke-interface {p4}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lio/radar/sdk/config/ConfigRepository;

    .line 78
    invoke-interface {p5}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lio/radar/sdk/util/IntegrationHelper;

    .line 79
    invoke-interface/range {p6 .. p6}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lio/radar/sdk/util/DeviceHelper;

    .line 80
    invoke-interface/range {p7 .. p7}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/android/volley/RequestQueue;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lio/radar/sdk/api/ApiService;-><init>(Landroid/content/Context;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/api/ApiClientRepository;Lio/radar/sdk/config/ConfigRepository;Lio/radar/sdk/util/IntegrationHelper;Lio/radar/sdk/util/DeviceHelper;Lcom/android/volley/RequestQueue;)V

    return-object v9
.end method


# virtual methods
.method public get()Lio/radar/sdk/api/ApiService;
    .locals 8

    .line 52
    iget-object v0, p0, Lio/radar/sdk/api/ApiService_Factory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v1, p0, Lio/radar/sdk/api/ApiService_Factory;->identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v2, p0, Lio/radar/sdk/api/ApiService_Factory;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v3, p0, Lio/radar/sdk/api/ApiService_Factory;->apiRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v4, p0, Lio/radar/sdk/api/ApiService_Factory;->configRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v5, p0, Lio/radar/sdk/api/ApiService_Factory;->integrationHelperProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v6, p0, Lio/radar/sdk/api/ApiService_Factory;->deviceHelperProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v7, p0, Lio/radar/sdk/api/ApiService_Factory;->queueProvider:Lio/radar/shadow/javax/inject/Provider;

    invoke-static/range {v0 .. v7}, Lio/radar/sdk/api/ApiService_Factory;->provideInstance(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/api/ApiService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiService_Factory;->get()Lio/radar/sdk/api/ApiService;

    move-result-object v0

    return-object v0
.end method
