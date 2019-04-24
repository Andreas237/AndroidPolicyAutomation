.class public final Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;
.super Ljava/lang/Object;
.source "ManagerModule_ProvidePixelTrackingManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
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

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final googleStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/google/GoogleState;",
            ">;"
        }
    .end annotation
.end field

.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;"
        }
    .end annotation
.end field

.field private final trackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
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
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/google/GoogleState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p3, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->contextProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p4, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->googleStateProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p5, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->hardwareProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p6, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->trackerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/google/GoogleState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)",
            "Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;"
        }
    .end annotation

    .line 82
    new-instance v7, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/google/GoogleState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;"
        }
    .end annotation

    .line 67
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 68
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/profile/BuildProfile;

    .line 69
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    .line 70
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/state/app/google/GoogleState;

    .line 71
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/hardware/Hardware;

    .line 72
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/tracking/Tracker;

    .line 66
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->proxyProvidePixelTrackingManager(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Landroid/content/Context;Lcom/ibotta/android/state/app/google/GoogleState;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePixelTrackingManager(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Landroid/content/Context;Lcom/ibotta/android/state/app/google/GoogleState;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .locals 0

    .line 99
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/ManagerModule;->providePixelTrackingManager(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Landroid/content/Context;Lcom/ibotta/android/state/app/google/GoogleState;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 98
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .locals 6

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->googleStateProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->hardwareProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->trackerProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/di/ManagerModule_ProvidePixelTrackingManagerFactory;->get()Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    move-result-object v0

    return-object v0
.end method
