.class public Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackerImpl;
.super Ljava/lang/Object;
.source "PartnerAppTrackerImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;


# instance fields
.field private final partnerAppEventFactory:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackerImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackerImpl;->partnerAppEventFactory:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;

    return-void
.end method


# virtual methods
.method public trackPartnerApps(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 38
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackerImpl;->partnerAppEventFactory:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;->createEvent(Ljava/util/List;)Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    move-result-object p1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackerImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to convert PartnerApp obects to JSON"

    const/4 v1, 0x0

    .line 41
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
