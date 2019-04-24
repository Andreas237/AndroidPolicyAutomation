.class public Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;
.super Ljava/lang/Object;
.source "V1TrackingClient.java"

# interfaces
.implements Lcom/ibotta/android/tracking/TrackingClient;


# instance fields
.field private final eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

.field private final eventPropertyKeysToFilter:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation
.end field

.field private final isFakeEventsSupplier:Lcom/ibotta/android/tracking/proprietary/IsFakeEventsSupplier;

.field private final isTrackingEnabledSupplier:Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;Lcom/ibotta/android/tracking/proprietary/IsFakeEventsSupplier;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            "Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;",
            "Lcom/ibotta/android/tracking/proprietary/IsFakeEventsSupplier;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->isTrackingEnabledSupplier:Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;

    .line 34
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->isFakeEventsSupplier:Lcom/ibotta/android/tracking/proprietary/IsFakeEventsSupplier;

    .line 35
    iput-object p5, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->eventPropertyKeysToFilter:Ljava/util/List;

    return-void
.end method

.method private extractTimeFromProperties(Ljava/util/Map;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)J"
        }
    .end annotation

    const-string v0, "event_at"

    .line 80
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic lambda$massagePartnerAppData$0(Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    .line 70
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private massagePartnerAppData(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "app_names"

    .line 62
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 67
    check-cast v0, Ljava/util/List;

    .line 69
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/-$$Lambda$V1TrackingClient$KDN-fvhvz3mmc_6ceYGhdHgU2M4;->INSTANCE:Lcom/ibotta/android/tracking/proprietary/-$$Lambda$V1TrackingClient$KDN-fvhvz3mmc_6ceYGhdHgU2M4;

    .line 70
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 71
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const-string v1, "app_names"

    .line 73
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public isEnabled()Z
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->isTrackingEnabledSupplier:Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public logEvent(Ljava/lang/String;JILjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0, p5}, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->extractTimeFromProperties(Ljava/util/Map;)J

    move-result-wide v2

    .line 47
    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->eventPropertyKeysToFilter:Ljava/util/List;

    invoke-static {p2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p2

    invoke-static {p5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Lcom/ibotta/android/tracking/proprietary/-$$Lambda$3_ndJnXFdOqYEBuIrz2LvQ6GyZ8;

    invoke-direct {p3, p5}, Lcom/ibotta/android/tracking/proprietary/-$$Lambda$3_ndJnXFdOqYEBuIrz2LvQ6GyZ8;-><init>(Ljava/util/Map;)V

    invoke-interface {p2, p3}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    .line 49
    invoke-direct {p0, p5}, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->massagePartnerAppData(Ljava/util/Map;)V

    .line 51
    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    iget-object p3, p0, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->isFakeEventsSupplier:Lcom/ibotta/android/tracking/proprietary/IsFakeEventsSupplier;

    invoke-interface {p3}, Lcom/ibotta/android/tracking/proprietary/IsFakeEventsSupplier;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v1, p1

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;->createEventBody(Ljava/lang/String;JZLjava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;->addEntry(Ljava/lang/Object;)V

    return-void
.end method
