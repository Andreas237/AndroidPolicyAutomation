.class public Lcom/ibotta/android/tracking/IbottaTrackingClient;
.super Ljava/lang/Object;
.source "IbottaTrackingClient.java"

# interfaces
.implements Lcom/ibotta/android/tracking/TrackingClient;


# instance fields
.field private final eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

.field private final ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation
.end field

.field private final isTrackingEnabledSupplier:Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
            "Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;",
            ")V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/tracking/IbottaTrackingClient;->ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/tracking/IbottaTrackingClient;->eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    .line 25
    iput-object p3, p0, Lcom/ibotta/android/tracking/IbottaTrackingClient;->isTrackingEnabledSupplier:Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;

    return-void
.end method


# virtual methods
.method public isEnabled()Z
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/tracking/IbottaTrackingClient;->isTrackingEnabledSupplier:Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public logEvent(Ljava/lang/String;JILjava/util/Map;)V
    .locals 1
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

    :try_start_0
    const-string p2, "Tracked event: eventType=%1$s, properties=%2$s"

    const/4 p3, 0x2

    .line 31
    new-array p3, p3, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p1, p3, p4

    const/4 p4, 0x1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p5}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    aput-object v0, p3, p4

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    :catch_0
    iget-object p2, p0, Lcom/ibotta/android/tracking/IbottaTrackingClient;->ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    iget-object p3, p0, Lcom/ibotta/android/tracking/IbottaTrackingClient;->eventBodyFactory:Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    invoke-interface {p3, p1, p5}, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;->createEventBody(Ljava/lang/String;Ljava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;->addEntry(Ljava/lang/Object;)V

    return-void
.end method
