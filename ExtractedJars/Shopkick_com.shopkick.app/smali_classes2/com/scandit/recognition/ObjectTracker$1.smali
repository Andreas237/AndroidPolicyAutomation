.class final Lcom/scandit/recognition/ObjectTracker$1;
.super Lcom/scandit/recognition/NativeObjectTrackerCallback;
.source "ObjectTracker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/recognition/ObjectTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/scandit/recognition/NativeObjectTrackerCallback;-><init>()V

    return-void
.end method

.method private setTrackedObject(J)V
    .locals 5

    .line 35
    new-instance v0, Lcom/scandit/recognition/TrackedObject;

    invoke-direct {v0, p1, p2}, Lcom/scandit/recognition/TrackedObject;-><init>(J)V

    .line 36
    invoke-virtual {v0}, Lcom/scandit/recognition/TrackedObject;->getType()I

    move-result p1

    sget p2, Lcom/scandit/recognition/TrackedObject;->TRACKED_OBJECT_TYPE_BARCODE:I

    if-ne p1, p2, :cond_4

    .line 37
    new-instance p1, Lcom/scandit/recognition/TrackedBarcode;

    invoke-direct {p1, v0}, Lcom/scandit/recognition/TrackedBarcode;-><init>(Lcom/scandit/recognition/TrackedObject;)V

    .line 39
    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedBarcode;->isRecognized()Z

    move-result p2

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    .line 42
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$000()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedBarcode;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 43
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$000()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedBarcode;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-static {v1}, Lcom/scandit/recognition/ObjectTracker;->access$102(Z)Z

    goto :goto_0

    .line 48
    :cond_0
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$000()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedBarcode;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/scandit/recognition/Barcode;

    if-eqz v2, :cond_1

    .line 52
    new-instance p1, Lcom/scandit/recognition/TrackedBarcode;

    invoke-direct {p1, v0, v2}, Lcom/scandit/recognition/TrackedBarcode;-><init>(Lcom/scandit/recognition/TrackedObject;Lcom/scandit/recognition/Barcode;)V

    .line 57
    :cond_1
    :goto_0
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$200()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedBarcode;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v1, 0x0

    .line 59
    invoke-virtual {p1, v1}, Lcom/scandit/recognition/TrackedBarcode;->setShouldAnimateFromPreviousToNextState(Z)V

    .line 60
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$200()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedBarcode;->getId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 62
    :cond_2
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$200()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedBarcode;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    xor-int/lit8 v1, p2, 0x1

    .line 65
    invoke-virtual {p1, v1}, Lcom/scandit/recognition/TrackedBarcode;->setShouldAnimateFromPreviousToNextState(Z)V

    .line 66
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$200()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedBarcode;->getId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 69
    :cond_3
    invoke-virtual {p1, v1}, Lcom/scandit/recognition/TrackedBarcode;->setShouldAnimateFromPreviousToNextState(Z)V

    .line 74
    :goto_1
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$300()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0}, Lcom/scandit/recognition/TrackedObject;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method


# virtual methods
.method public declared-synchronized onObjectAppeared(J)V
    .locals 0

    monitor-enter p0

    .line 26
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/ObjectTracker$1;->setTrackedObject(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized onObjectLost(II)V
    .locals 2

    monitor-enter p0

    .line 89
    :try_start_0
    sget v0, Lcom/scandit/recognition/TrackedObject;->TRACKED_OBJECT_TYPE_BARCODE:I

    if-ne p1, v0, :cond_0

    .line 90
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$300()Ljava/util/Map;

    move-result-object p1

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$200()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized onObjectPredicted(IJF)V
    .locals 3

    monitor-enter p0

    .line 80
    :try_start_0
    invoke-static {}, Lcom/scandit/recognition/ObjectTracker;->access$300()Ljava/util/Map;

    move-result-object v0

    int-to-long v1, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/scandit/recognition/TrackedBarcode;

    if-eqz p1, :cond_0

    .line 82
    new-instance v0, Lcom/scandit/recognition/Quadrilateral;

    invoke-direct {v0, p2, p3}, Lcom/scandit/recognition/Quadrilateral;-><init>(J)V

    invoke-virtual {p1, v0}, Lcom/scandit/recognition/TrackedBarcode;->setPredictedLocation(Lcom/scandit/recognition/Quadrilateral;)V

    .line 83
    invoke-virtual {p1, p4}, Lcom/scandit/recognition/TrackedBarcode;->setDeltaTime(F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized onObjectUpdated(J)V
    .locals 0

    monitor-enter p0

    .line 31
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/ObjectTracker$1;->setTrackedObject(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
