.class public final Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;
.super Ljava/lang/Object;
.source "MiscModule_ProvideTrackingQueueFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
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

.field private final appContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
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

.field private final debugStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;"
        }
    .end annotation
.end field

.field private final tMonitorClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;"
        }
    .end annotation
.end field

.field private final v1TrackingClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;",
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
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;",
            ">;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p2, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->debugStateProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p3, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->appContextProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p4, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->tMonitorClientProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p5, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p6, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->v1TrackingClientProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;",
            ">;)",
            "Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;"
        }
    .end annotation

    .line 81
    new-instance v7, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;"
        }
    .end annotation

    .line 66
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 67
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 68
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    .line 69
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    .line 70
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 71
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    .line 65
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->proxyProvideTrackingQueue(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;)Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideTrackingQueue(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;)Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .locals 0

    .line 98
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/MiscModule;->provideTrackingQueue(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;)Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 97
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .locals 6

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->debugStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->appContextProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->tMonitorClientProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->v1TrackingClientProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/di/MiscModule_ProvideTrackingQueueFactory;->get()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object v0

    return-object v0
.end method
