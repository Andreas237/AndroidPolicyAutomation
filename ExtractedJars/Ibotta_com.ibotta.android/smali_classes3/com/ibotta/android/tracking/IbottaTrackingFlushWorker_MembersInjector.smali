.class public final Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;
.super Ljava/lang/Object;
.source "IbottaTrackingFlushWorker_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;",
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

.field private final trackingApiClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/network/TrackingApiClient<",
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
            "Lcom/ibotta/android/tracking/network/TrackingApiClient<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;->ibottaTrackingQueueProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;->trackingApiClientProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
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
            "Lcom/ibotta/android/tracking/network/TrackingApiClient<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;>;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;",
            ">;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectInit(Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/network/TrackingApiClient;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/network/TrackingApiClient<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;)V"
        }
    .end annotation

    .line 54
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;->init(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/network/TrackingApiClient;)V

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;)V
    .locals 3

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    .line 44
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v1, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;->ibottaTrackingQueueProvider:Ljavax/inject/Provider;

    .line 45
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    iget-object v2, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;->trackingApiClientProvider:Ljavax/inject/Provider;

    .line 46
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/tracking/network/TrackingApiClient;

    .line 42
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;->injectInit(Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/network/TrackingApiClient;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker_MembersInjector;->injectMembers(Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;)V

    return-void
.end method
