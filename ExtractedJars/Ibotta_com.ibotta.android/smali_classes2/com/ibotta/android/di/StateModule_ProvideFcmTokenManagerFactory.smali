.class public final Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvideFcmTokenManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/async/device/FcmTokenManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final asyncHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
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

.field private final firebaseInstanceIdProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/google/firebase/iid/FirebaseInstanceId;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/google/firebase/iid/FirebaseInstanceId;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->contextProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->firebaseInstanceIdProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->asyncHandlerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/google/firebase/iid/FirebaseInstanceId;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/async/device/FcmTokenManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/google/firebase/iid/FirebaseInstanceId;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/async/device/FcmTokenManager;"
        }
    .end annotation

    .line 42
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    .line 41
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->proxyProvideFcmTokenManager(Landroid/content/Context;Lcom/google/firebase/iid/FirebaseInstanceId;Landroid/os/Handler;)Lcom/ibotta/android/async/device/FcmTokenManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFcmTokenManager(Landroid/content/Context;Lcom/google/firebase/iid/FirebaseInstanceId;Landroid/os/Handler;)Lcom/ibotta/android/async/device/FcmTokenManager;
    .locals 0

    .line 56
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/StateModule;->provideFcmTokenManager(Landroid/content/Context;Lcom/google/firebase/iid/FirebaseInstanceId;Landroid/os/Handler;)Lcom/ibotta/android/async/device/FcmTokenManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 55
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/async/device/FcmTokenManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/async/device/FcmTokenManager;
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->firebaseInstanceIdProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->asyncHandlerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/async/device/FcmTokenManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvideFcmTokenManagerFactory;->get()Lcom/ibotta/android/async/device/FcmTokenManager;

    move-result-object v0

    return-object v0
.end method
