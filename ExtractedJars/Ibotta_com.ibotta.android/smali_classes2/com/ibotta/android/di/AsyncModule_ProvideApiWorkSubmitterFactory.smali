.class public final Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;
.super Ljava/lang/Object;
.source "AsyncModule_ProvideApiWorkSubmitterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final asyncGroupManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/AsyncGroupManager;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final execServiceManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ExecServiceManager;",
            ">;"
        }
    .end annotation
.end field

.field private final executorServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/ExecutorService;",
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

.field private final serviceLockProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/AsyncGroupManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ExecServiceManager;",
            ">;)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p2, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->contextProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p3, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->handlerProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p4, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->serviceLockProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p5, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->prodConLockProvider:Ljavax/inject/Provider;

    .line 55
    iput-object p6, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->produceConditionProvider:Ljavax/inject/Provider;

    .line 56
    iput-object p7, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->asyncGroupManagerProvider:Ljavax/inject/Provider;

    .line 57
    iput-object p8, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->executorServiceProvider:Ljavax/inject/Provider;

    .line 58
    iput-object p9, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->execServiceManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/AsyncGroupManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ExecServiceManager;",
            ">;)",
            "Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;"
        }
    .end annotation

    .line 107
    new-instance v10, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v10
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/api/ApiWorkSubmitter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Condition;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/AsyncGroupManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ExecServiceManager;",
            ">;)",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;"
        }
    .end annotation

    .line 86
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 87
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    .line 88
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Handler;

    .line 89
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/locks/Lock;

    .line 90
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/locks/Lock;

    .line 91
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/locks/Condition;

    .line 92
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/service/api/AsyncGroupManager;

    .line 93
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/concurrent/ExecutorService;

    .line 94
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/service/api/ExecServiceManager;

    move-object p0, v0

    move-object p1, v1

    move-object p2, v2

    move-object p3, v3

    move-object p4, v4

    move-object p5, v5

    move-object p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    .line 85
    invoke-static/range {p0 .. p8}, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->proxyProvideApiWorkSubmitter(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/AsyncGroupManager;Ljava/util/concurrent/ExecutorService;Lcom/ibotta/android/service/api/ExecServiceManager;)Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideApiWorkSubmitter(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/AsyncGroupManager;Ljava/util/concurrent/ExecutorService;Lcom/ibotta/android/service/api/ExecServiceManager;)Lcom/ibotta/android/service/api/ApiWorkSubmitter;
    .locals 0

    .line 130
    invoke-static/range {p0 .. p8}, Lcom/ibotta/android/di/AsyncModule;->provideApiWorkSubmitter(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/AsyncGroupManager;Ljava/util/concurrent/ExecutorService;Lcom/ibotta/android/service/api/ExecServiceManager;)Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 129
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/service/api/ApiWorkSubmitter;
    .locals 9

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->handlerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->serviceLockProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->prodConLockProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->produceConditionProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->asyncGroupManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->executorServiceProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->execServiceManagerProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v8}, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/di/AsyncModule_ProvideApiWorkSubmitterFactory;->get()Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    move-result-object v0

    return-object v0
.end method
