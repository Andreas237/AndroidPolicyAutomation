.class public final Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;
.super Ljava/lang/Object;
.source "ButtonSdkModule_ProvideButtonSdkManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiWorkSubmitterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;"
        }
    .end annotation
.end field

.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private final brazeTrackingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;"
        }
    .end annotation
.end field

.field private final buttonSdkCacheRemoverProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;",
            ">;"
        }
    .end annotation
.end field

.field private final buttonSdkStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final globalEventManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field

.field private final variantFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
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
            "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;)V"
        }
    .end annotation

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->buttonSdkStorageProvider:Ljavax/inject/Provider;

    .line 57
    iput-object p2, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->buttonSdkCacheRemoverProvider:Ljavax/inject/Provider;

    .line 58
    iput-object p3, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 59
    iput-object p4, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 60
    iput-object p5, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 61
    iput-object p6, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    .line 62
    iput-object p7, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 63
    iput-object p8, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->handlerProvider:Ljavax/inject/Provider;

    .line 64
    iput-object p9, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->variantFactoryProvider:Ljavax/inject/Provider;

    .line 65
    iput-object p10, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;)",
            "Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;"
        }
    .end annotation

    .line 118
    new-instance v11, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;

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

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v11
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/buttonsdk/ButtonSdkManager;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;)",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkManager;"
        }
    .end annotation

    .line 95
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    .line 96
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    .line 97
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/state/GlobalEventManager;

    .line 98
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 99
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 100
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 101
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/state/user/UserState;

    .line 102
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/os/Handler;

    .line 103
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 104
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/tracking/braze/BrazeTracking;

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

    .line 94
    invoke-static/range {p0 .. p9}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->proxyProvideButtonSdkManager(Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Landroid/os/Handler;Lcom/ibotta/android/features/factory/VariantFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;)Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideButtonSdkManager(Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Landroid/os/Handler;Lcom/ibotta/android/features/factory/VariantFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;)Lcom/ibotta/android/buttonsdk/ButtonSdkManager;
    .locals 0

    .line 143
    invoke-static/range {p0 .. p9}, Lcom/ibotta/android/di/ButtonSdkModule;->provideButtonSdkManager(Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Landroid/os/Handler;Lcom/ibotta/android/features/factory/VariantFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;)Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 142
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;
    .locals 10

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->buttonSdkStorageProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->buttonSdkCacheRemoverProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->handlerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->variantFactoryProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v9}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkManagerFactory;->get()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    return-object v0
.end method
