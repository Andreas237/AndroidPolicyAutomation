.class public final Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;
.super Ljava/lang/Object;
.source "ScheduledWorkerModule_ProvideScheduledWorkersFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/Set<",
        "Lcom/ibotta/android/service/work/ScheduledWorker;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;"
        }
    .end annotation
.end field

.field private final trackingFlushWorkerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
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
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;->favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
            ">;)",
            "Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;"
        }
    .end annotation

    .line 46
    new-instance v0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
            ">;)",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;"
        }
    .end annotation

    .line 40
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 39
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;->proxyProvideScheduledWorkers(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideScheduledWorkers(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;",
            "Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;",
            ")",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;"
        }
    .end annotation

    .line 54
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ScheduledWorkerModule;->provideScheduledWorkers(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)Ljava/util/Set;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 53
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;->get()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;->favoriteRetailerSettingsFlushWorkerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;->trackingFlushWorkerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkersFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
