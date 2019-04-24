.class public abstract Lcom/ibotta/android/di/AsyncModule;
.super Ljava/lang/Object;
.source "AsyncModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideApiWorkServiceExecutor(Lcom/ibotta/android/service/api/ConsumerFactory;Lcom/ibotta/android/service/api/ProducerFactory;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;)Lcom/ibotta/android/service/api/ApiWorkExecutor;
    .locals 8
    .param p2    # Ljava/util/concurrent/locks/Lock;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkServiceLock"
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/locks/Condition;
        .annotation runtime Ljavax/inject/Named;
            value = "WorkCondition"
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/service/api/ExecServiceManager;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkExecServiceManager"
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/service/api/AsyncGroupManager;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkAsyncGroupManager"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 61
    new-instance v7, Lcom/ibotta/android/service/api/ApiWorkExecutor;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/service/api/ApiWorkExecutor;-><init>(Lcom/ibotta/android/service/api/ConsumerFactory;Lcom/ibotta/android/service/api/ProducerFactory;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;)V

    return-object v7
.end method

.method public static provideApiWorkSubmitter(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/AsyncGroupManager;Ljava/util/concurrent/ExecutorService;Lcom/ibotta/android/service/api/ExecServiceManager;)Lcom/ibotta/android/service/api/ApiWorkSubmitter;
    .locals 11
    .param p1    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/locks/Lock;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkServiceLock"
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/locks/Lock;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkServiceProdConLock"
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/locks/Condition;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkProduceCondition"
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/service/api/AsyncGroupManager;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkAsyncGroupManager"
        .end annotation
    .end param
    .param p7    # Ljava/util/concurrent/ExecutorService;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkExecutorService"
        .end annotation
    .end param
    .param p8    # Lcom/ibotta/android/service/api/ExecServiceManager;
        .annotation runtime Ljavax/inject/Named;
            value = "ApiWorkExecServiceManager"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 41
    new-instance v10, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;

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

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/AsyncGroupManager;Ljava/util/concurrent/ExecutorService;Lcom/ibotta/android/service/api/ExecServiceManager;)V

    return-object v10
.end method
