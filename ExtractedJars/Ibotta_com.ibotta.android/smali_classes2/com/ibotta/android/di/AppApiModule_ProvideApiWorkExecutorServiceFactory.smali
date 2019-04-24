.class public final Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;
.super Ljava/lang/Object;
.source "AppApiModule_ProvideApiWorkExecutorServiceFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/concurrent/ExecutorService;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;->INSTANCE:Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;->INSTANCE:Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;

    return-object v0
.end method

.method public static provideInstance()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;->proxyProvideApiWorkExecutorService()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideApiWorkExecutorService()Ljava/util/concurrent/ExecutorService;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule;->provideApiWorkExecutorService()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;->get()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkExecutorServiceFactory;->provideInstance()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method
