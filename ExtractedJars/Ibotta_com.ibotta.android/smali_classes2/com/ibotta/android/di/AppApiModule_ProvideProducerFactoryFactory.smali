.class public final Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;
.super Ljava/lang/Object;
.source "AppApiModule_ProvideProducerFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/service/api/ProducerFactory;",
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

.field private final prodConLockProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;"
        }
    .end annotation
.end field

.field private final produceConditionProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
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
            ">;)V"
        }
    .end annotation

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->prodConLockProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->consumeConditionProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p3, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->produceConditionProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p4, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->execServiceMgrProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p5, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->asyncGroupMgrProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p6, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;
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
            ">;)",
            "Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;"
        }
    .end annotation

    .line 80
    new-instance v7, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/api/ProducerFactory;
    .locals 6
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
            ">;)",
            "Lcom/ibotta/android/service/api/ProducerFactory;"
        }
    .end annotation

    .line 65
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/util/concurrent/locks/Lock;

    .line 66
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ljava/util/concurrent/locks/Condition;

    .line 67
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Ljava/util/concurrent/locks/Condition;

    .line 68
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/service/api/ExecServiceManager;

    .line 69
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/service/api/AsyncGroupManager;

    .line 70
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/profile/BuildProfile;

    .line 64
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->proxyProvideProducerFactory(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/service/api/ProducerFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideProducerFactory(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/service/api/ProducerFactory;
    .locals 0

    .line 97
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/AppApiModule;->provideProducerFactory(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/service/api/ProducerFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 96
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/api/ProducerFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/service/api/ProducerFactory;
    .locals 6

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->prodConLockProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->consumeConditionProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->produceConditionProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->execServiceMgrProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->asyncGroupMgrProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/api/ProducerFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppApiModule_ProvideProducerFactoryFactory;->get()Lcom/ibotta/android/service/api/ProducerFactory;

    move-result-object v0

    return-object v0
.end method
