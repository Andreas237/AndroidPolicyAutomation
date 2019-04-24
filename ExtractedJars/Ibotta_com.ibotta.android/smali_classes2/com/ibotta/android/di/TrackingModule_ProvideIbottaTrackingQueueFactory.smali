.class public final Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;
.super Ljava/lang/Object;
.source "TrackingModule_ProvideIbottaTrackingQueueFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
        "Lcom/ibotta/tracking/generated/model/Body;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final boundedAtomicIntegerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;",
            ">;"
        }
    .end annotation
.end field

.field private final lastKeyPersistenceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private final trackingPersistenceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;"
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
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;",
            ">;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->trackingPersistenceProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->lastKeyPersistenceProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p3, p0, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->boundedAtomicIntegerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;",
            ">;)",
            "Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;"
        }
    .end annotation

    .line 54
    new-instance v0, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation

    .line 45
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    .line 46
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;

    .line 47
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;

    .line 44
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->proxyProvideIbottaTrackingQueue(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;)Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideIbottaTrackingQueue(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;)Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;",
            ")",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation

    .line 63
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/TrackingModule;->provideIbottaTrackingQueue(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;)Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 62
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->trackingPersistenceProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->lastKeyPersistenceProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->boundedAtomicIntegerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideIbottaTrackingQueueFactory;->get()Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    move-result-object v0

    return-object v0
.end method
