.class public final Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;
.super Ljava/lang/Object;
.source "ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
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

.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;"
        }
    .end annotation
.end field

.field private final scheduledWorkManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p3, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->contextProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p4, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->hardwareProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p5, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->scheduledWorkManagerProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p6, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->tMonitorClientProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;)",
            "Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;"
        }
    .end annotation

    .line 82
    new-instance v7, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;)",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;"
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

    check-cast v1, Lcom/ibotta/android/util/AppHelper;

    .line 69
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    .line 70
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/hardware/Hardware;

    .line 71
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    .line 72
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    .line 66
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->proxyProvideTrackingFlushWorker(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideTrackingFlushWorker(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;
    .locals 0

    .line 99
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/ScheduledWorkerModule;->provideTrackingFlushWorker(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 98
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;
    .locals 6

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->hardwareProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->scheduledWorkManagerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->tMonitorClientProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideTrackingFlushWorkerFactory;->get()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    return-object v0
.end method
