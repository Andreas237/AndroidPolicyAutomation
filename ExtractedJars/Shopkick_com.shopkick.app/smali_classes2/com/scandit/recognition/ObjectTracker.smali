.class public Lcom/scandit/recognition/ObjectTracker;
.super Lcom/scandit/recognition/NativeHandle;
.source "ObjectTracker.java"


# static fields
.field private static callback:Lcom/scandit/recognition/NativeObjectTrackerCallback;

.field private static didSeeNewTrack:Z

.field private static mRecognizedBarcodes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation
.end field

.field private static mRecognizedState:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static mTrackedBarcodes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/scandit/recognition/TrackedBarcode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/scandit/recognition/ObjectTracker;->mTrackedBarcodes:Ljava/util/Map;

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/scandit/recognition/ObjectTracker;->mRecognizedBarcodes:Ljava/util/Map;

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/scandit/recognition/ObjectTracker;->mRecognizedState:Ljava/util/Map;

    const/4 v0, 0x0

    .line 21
    sput-boolean v0, Lcom/scandit/recognition/ObjectTracker;->didSeeNewTrack:Z

    .line 23
    new-instance v0, Lcom/scandit/recognition/ObjectTracker$1;

    invoke-direct {v0}, Lcom/scandit/recognition/ObjectTracker$1;-><init>()V

    sput-object v0, Lcom/scandit/recognition/ObjectTracker;->callback:Lcom/scandit/recognition/NativeObjectTrackerCallback;

    return-void
.end method

.method public constructor <init>(Lcom/scandit/recognition/RecognitionContext;)V
    .locals 2

    .line 98
    invoke-virtual {p1}, Lcom/scandit/recognition/RecognitionContext;->getHandle()J

    move-result-wide v0

    sget-object p1, Lcom/scandit/recognition/ObjectTracker;->callback:Lcom/scandit/recognition/NativeObjectTrackerCallback;

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_object_tracker_new(JLcom/scandit/recognition/NativeObjectTrackerCallback;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    return-void
.end method

.method static synthetic access$000()Ljava/util/Map;
    .locals 1

    .line 15
    sget-object v0, Lcom/scandit/recognition/ObjectTracker;->mRecognizedBarcodes:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$102(Z)Z
    .locals 0

    .line 15
    sput-boolean p0, Lcom/scandit/recognition/ObjectTracker;->didSeeNewTrack:Z

    return p0
.end method

.method static synthetic access$200()Ljava/util/Map;
    .locals 1

    .line 15
    sget-object v0, Lcom/scandit/recognition/ObjectTracker;->mRecognizedState:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$300()Ljava/util/Map;
    .locals 1

    .line 15
    sget-object v0, Lcom/scandit/recognition/ObjectTracker;->mTrackedBarcodes:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 124
    sget-object v0, Lcom/scandit/recognition/ObjectTracker;->mTrackedBarcodes:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 125
    sget-object v0, Lcom/scandit/recognition/ObjectTracker;->mRecognizedBarcodes:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    .line 126
    sput-boolean v0, Lcom/scandit/recognition/ObjectTracker;->didSeeNewTrack:Z

    return-void
.end method

.method public didSeeNewTrackThenReset()Z
    .locals 2

    .line 106
    sget-boolean v0, Lcom/scandit/recognition/ObjectTracker;->didSeeNewTrack:Z

    const/4 v1, 0x0

    .line 107
    sput-boolean v1, Lcom/scandit/recognition/ObjectTracker;->didSeeNewTrack:Z

    return v0
.end method

.method public declared-synchronized getTrackedBarcodes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/scandit/recognition/TrackedBarcode;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 102
    :try_start_0
    sget-object v0, Lcom/scandit/recognition/ObjectTracker;->mTrackedBarcodes:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isEnabled()Z
    .locals 2

    .line 112
    iget-wide v0, p0, Lcom/scandit/recognition/ObjectTracker;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_object_tracker_is_enabled(J)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method protected release(J)V
    .locals 0

    .line 131
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_object_tracker_release(J)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 117
    iget-wide v0, p0, Lcom/scandit/recognition/ObjectTracker;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_object_tracker_is_enabled(J)I

    move-result v0

    if-eq p1, v0, :cond_0

    .line 118
    sget-object v0, Lcom/scandit/recognition/ObjectTracker;->mTrackedBarcodes:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 120
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/ObjectTracker;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_object_tracker_set_enabled(JI)V

    return-void
.end method
