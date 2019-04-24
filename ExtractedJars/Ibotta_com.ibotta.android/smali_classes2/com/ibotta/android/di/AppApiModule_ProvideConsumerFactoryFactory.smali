.class public final Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;
.super Ljava/lang/Object;
.source "AppApiModule_ProvideConsumerFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/service/api/ConsumerFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final asyncGroupMgrProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/AsyncGroupManager;",
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

.field private final consumeConditionProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;"
        }
    .end annotation
.end field

.field private final execServiceMgrProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ExecServiceManager;",
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

.field private final logOutManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/LogOutManager;",
            ">;"
        }
    .end annotation
.end field

.field private final prodConLockProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;"
        }
    .end annotation
.end field

.field private final serverUpgradeStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ExecServiceManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/AsyncGroupManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/LogOutManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;",
            ">;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->prodConLockProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->consumeConditionProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p3, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->execServiceMgrProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p4, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->asyncGroupMgrProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p5, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p6, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->logOutManagerProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p7, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p8, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->serverUpgradeStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ExecServiceManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/AsyncGroupManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/LogOutManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;",
            ">;)",
            "Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;"
        }
    .end annotation

    .line 99
    new-instance v9, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v9
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/api/ConsumerFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ExecServiceManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/AsyncGroupManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/LogOutManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;",
            ">;)",
            "Lcom/ibotta/android/service/api/ConsumerFactory;"
        }
    .end annotation

    .line 80
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/util/concurrent/locks/Lock;

    .line 81
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ljava/util/concurrent/locks/Condition;

    .line 82
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/service/api/ExecServiceManager;

    .line 83
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/service/api/AsyncGroupManager;

    .line 84
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/profile/BuildProfile;

    .line 85
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/state/user/LogOutManager;

    .line 86
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/ibotta/android/state/GlobalEventManager;

    .line 87
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    .line 79
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->proxyProvideConsumerFactory(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;)Lcom/ibotta/android/service/api/ConsumerFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideConsumerFactory(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;)Lcom/ibotta/android/service/api/ConsumerFactory;
    .locals 0

    .line 120
    invoke-static/range {p0 .. p7}, Lcom/ibotta/android/di/AppApiModule;->provideConsumerFactory(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;)Lcom/ibotta/android/service/api/ConsumerFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 119
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/api/ConsumerFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/service/api/ConsumerFactory;
    .locals 8

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->prodConLockProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->consumeConditionProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->execServiceMgrProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->asyncGroupMgrProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->logOutManagerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->serverUpgradeStateProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/api/ConsumerFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppApiModule_ProvideConsumerFactoryFactory;->get()Lcom/ibotta/android/service/api/ConsumerFactory;

    move-result-object v0

    return-object v0
.end method
