.class public final Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;
.super Ljava/lang/Object;
.source "AppApiModule_ProvideProdConProduceConditionFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/concurrent/locks/Condition;",
        ">;"
    }
.end annotation


# instance fields
.field private final prodConLockProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;->prodConLockProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;)",
            "Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;"
        }
    .end annotation

    .line 33
    new-instance v0, Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Ljava/util/concurrent/locks/Condition;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;)",
            "Ljava/util/concurrent/locks/Condition;"
        }
    .end annotation

    .line 28
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/locks/Lock;

    invoke-static {p0}, Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;->proxyProvideProdConProduceCondition(Ljava/util/concurrent/locks/Lock;)Ljava/util/concurrent/locks/Condition;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideProdConProduceCondition(Ljava/util/concurrent/locks/Lock;)Ljava/util/concurrent/locks/Condition;
    .locals 1

    .line 38
    invoke-static {p0}, Lcom/ibotta/android/di/AppApiModule;->provideProdConProduceCondition(Ljava/util/concurrent/locks/Lock;)Ljava/util/concurrent/locks/Condition;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 37
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/locks/Condition;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;->get()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/concurrent/locks/Condition;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;->prodConLockProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/AppApiModule_ProvideProdConProduceConditionFactory;->provideInstance(Ljavax/inject/Provider;)Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    return-object v0
.end method
