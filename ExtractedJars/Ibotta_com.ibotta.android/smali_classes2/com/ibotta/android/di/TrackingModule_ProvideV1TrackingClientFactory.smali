.class public final Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;
.super Ljava/lang/Object;
.source "TrackingModule_ProvideV1TrackingClientFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;",
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

.field private final eventBodyFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaTrackingQueueProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
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
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ">;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->ibottaTrackingQueueProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p3, p0, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->eventBodyFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ">;)",
            "Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;"
        }
    .end annotation

    .line 52
    new-instance v0, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;"
        }
    .end annotation

    .line 45
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    .line 44
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->proxyProvideV1TrackingClient(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;)Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideV1TrackingClient(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;)Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            ")",
            "Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;"
        }
    .end annotation

    .line 61
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/TrackingModule;->provideV1TrackingClient(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;)Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 60
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;
    .locals 3

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->ibottaTrackingQueueProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->eventBodyFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideV1TrackingClientFactory;->get()Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    move-result-object v0

    return-object v0
.end method
