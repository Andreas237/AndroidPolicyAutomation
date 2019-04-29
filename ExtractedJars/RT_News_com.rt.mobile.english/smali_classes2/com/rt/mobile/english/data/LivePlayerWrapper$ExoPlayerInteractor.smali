.class Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;
.super Ljava/lang/Object;
.source "LivePlayerWrapper.java"

# interfaces
.implements Lio/streamroot/dna/core/PlayerInteractor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/LivePlayerWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ExoPlayerInteractor"
.end annotation


# instance fields
.field private player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

.field final synthetic this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/data/LivePlayerWrapper;Lcom/google/android/exoplayer2/SimpleExoPlayer;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 316
    iput-object p2, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    return-void
.end method

.method private getCurrentWindowShift()Ljava/lang/Long;
    .locals 4

    .line 354
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentTimeline()Lcom/google/android/exoplayer2/Timeline;

    move-result-object v0

    .line 355
    new-instance v1, Lcom/google/android/exoplayer2/Timeline$Window;

    invoke-direct {v1}, Lcom/google/android/exoplayer2/Timeline$Window;-><init>()V

    const-wide/16 v2, 0x0

    .line 356
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 358
    iget-object v3, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v3}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentWindowIndex()I

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->getWindowCount()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 359
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentTimeline()Lcom/google/android/exoplayer2/Timeline;

    move-result-object v0

    iget-object v2, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentWindowIndex()I

    move-result v2

    invoke-virtual {v0, v2, v1}, Lcom/google/android/exoplayer2/Timeline;->getWindow(ILcom/google/android/exoplayer2/Timeline$Window;)Lcom/google/android/exoplayer2/Timeline$Window;

    .line 360
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/Timeline$Window;->getPositionInFirstPeriodMs()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :cond_0
    return-object v2
.end method


# virtual methods
.method public loadedTimeRanges()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/streamroot/dna/core/TimeRange;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 324
    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->getCurrentWindowShift()Ljava/lang/Long;

    move-result-object v0

    .line 325
    iget-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getBufferedPosition()J

    move-result-wide v1

    iget-object v3, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v3}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentPosition()J

    move-result-wide v3

    sub-long v5, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 326
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 328
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-lez v7, :cond_0

    .line 329
    new-instance v3, Lio/streamroot/dna/core/TimeRange;

    .line 331
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentPosition()J

    move-result-wide v6

    add-long v8, v4, v6

    .line 332
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {v3, v8, v9, v0, v1}, Lio/streamroot/dna/core/TimeRange;-><init>(JJ)V

    .line 329
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v2
.end method

.method public looper()Landroid/os/Looper;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 343
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlaybackLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public playbackTime()J
    .locals 6

    .line 348
    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->getCurrentWindowShift()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentPosition()J

    move-result-wide v2

    add-long v4, v0, v2

    return-wide v4
.end method
