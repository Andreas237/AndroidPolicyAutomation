.class public final Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;
.super Ljava/lang/Object;
.source "AppApiModule_ProvideApiWorkServiceProdConLockFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/concurrent/locks/Lock;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;->INSTANCE:Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;->INSTANCE:Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;

    return-object v0
.end method

.method public static provideInstance()Ljava/util/concurrent/locks/Lock;
    .locals 1

    .line 22
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;->proxyProvideApiWorkServiceProdConLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideApiWorkServiceProdConLock()Ljava/util/concurrent/locks/Lock;
    .locals 2

    .line 31
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule;->provideApiWorkServiceProdConLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 30
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;->get()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/concurrent/locks/Lock;
    .locals 1

    .line 18
    invoke-static {}, Lcom/ibotta/android/di/AppApiModule_ProvideApiWorkServiceProdConLockFactory;->provideInstance()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    return-object v0
.end method
