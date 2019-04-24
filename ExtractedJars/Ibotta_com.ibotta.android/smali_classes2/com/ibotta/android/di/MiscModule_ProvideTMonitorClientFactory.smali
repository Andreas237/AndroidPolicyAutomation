.class public final Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;
.super Ljava/lang/Object;
.source "MiscModule_ProvideTMonitorClientFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
        ">;"
    }
.end annotation


# instance fields
.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final debugStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;->debugStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;)",
            "Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;)",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;"
        }
    .end annotation

    .line 33
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;->proxyProvideTMonitorClient(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideTMonitorClient(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;
    .locals 0

    .line 44
    invoke-static {p0, p1}, Lcom/ibotta/android/di/MiscModule;->provideTMonitorClient(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 43
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;->debugStateProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/MiscModule_ProvideTMonitorClientFactory;->get()Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    move-result-object v0

    return-object v0
.end method
