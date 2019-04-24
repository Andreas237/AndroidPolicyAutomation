.class public Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;
.super Ljava/lang/Object;
.source "NewRelicAppTimingTracker.java"

# interfaces
.implements Lcom/ibotta/android/tracking/timing/AppTimingTracker;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private buildCachedObjectAttributes(Ljava/lang/String;J)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 78
    invoke-direct {p0, p2, p3}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p2

    const-string p3, "cached_object_name"

    .line 79
    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method private buildGalleryAttributes(JI)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 85
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p1

    const-string p2, "retailer_id"

    .line 86
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method private buildTimeAttributes(J)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 71
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "time"

    .line 72
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Tracking timing event: eventType=%1$s, eventName=%2$s, attributes=%3$s"

    const/4 v1, 0x3

    .line 61
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-static {p1, p2, p3}, Lcom/newrelic/agent/android/NewRelic;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z

    return-void
.end method


# virtual methods
.method public trackTimeToLoadFeaturedData(J)V
    .locals 2

    const-string v0, "timing"

    const-string v1, "time_to_load_featured_data"

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public trackTimeToLoadGallery(JI)V
    .locals 2

    const-string v0, "timing"

    const-string v1, "time_to_load_gallery"

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildGalleryAttributes(JI)Ljava/util/Map;

    move-result-object p1

    .line 24
    invoke-direct {p0, v0, v1, p1}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public trackTimeToLogin(J)V
    .locals 2

    const-string v0, "timing"

    const-string v1, "time_to_login"

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public trackTimeToProcessReceiptImage(J)V
    .locals 2

    const-string v0, "timing"

    const-string v1, "time_to_process_receipt_image"

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public trackTimeToReadDiskCache(Ljava/lang/String;J)V
    .locals 2

    const-string v0, "timing"

    const-string v1, "time_to_read_disk_cache"

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildCachedObjectAttributes(Ljava/lang/String;J)Ljava/util/Map;

    move-result-object p1

    .line 40
    invoke-direct {p0, v0, v1, p1}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public trackTimeToUnlock(J)V
    .locals 2

    const-string v0, "timing"

    const-string v1, "time_to_unlock"

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public trackTimeToUploadReceipt(J)V
    .locals 2

    const-string v0, "timing"

    const-string v1, "time_to_upload_receipt"

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public trackTimeToWriteDiskCache(Ljava/lang/String;J)V
    .locals 2

    const-string v0, "timing"

    const-string v1, "time_to_write_disk_cache"

    .line 47
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->buildCachedObjectAttributes(Ljava/lang/String;J)Ljava/util/Map;

    move-result-object p1

    .line 46
    invoke-direct {p0, v0, v1, p1}, Lcom/ibotta/android/tracking/timing/NewRelicAppTimingTracker;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
