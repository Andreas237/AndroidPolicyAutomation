.class public final Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;
.super Ljava/lang/Object;
.source "MiscModule_ProvideLocationUpdateManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/service/location/LocationUpdateManager;",
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

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final looperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Looper;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Looper;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->contextProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->looperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Looper;",
            ">;)",
            "Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/location/LocationUpdateManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Looper;",
            ">;)",
            "Lcom/ibotta/android/service/location/LocationUpdateManager;"
        }
    .end annotation

    .line 49
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    .line 50
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/AppHelper;

    .line 51
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/user/UserState;

    .line 52
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/os/Looper;

    .line 48
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->proxyProvideLocationUpdateManager(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Landroid/os/Looper;)Lcom/ibotta/android/service/location/LocationUpdateManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideLocationUpdateManager(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Landroid/os/Looper;)Lcom/ibotta/android/service/location/LocationUpdateManager;
    .locals 0

    .line 67
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/MiscModule;->provideLocationUpdateManager(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Landroid/os/Looper;)Lcom/ibotta/android/service/location/LocationUpdateManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 66
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/location/LocationUpdateManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/service/location/LocationUpdateManager;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->looperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/location/LocationUpdateManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/MiscModule_ProvideLocationUpdateManagerFactory;->get()Lcom/ibotta/android/service/location/LocationUpdateManager;

    move-result-object v0

    return-object v0
.end method
