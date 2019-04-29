.class Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;
.super Ljava/lang/Object;
.source "LivePlayerWrapper.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/BandwidthMeter;
.implements Lio/streamroot/dna/core/BandwidthListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/LivePlayerWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ExoPlayerBandwidthMeter"
.end annotation


# instance fields
.field private estimatedBandwidth:Ljava/util/concurrent/atomic/AtomicLong;

.field final synthetic this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;


# direct methods
.method private constructor <init>(Lcom/rt/mobile/english/data/LivePlayerWrapper;)V
    .locals 2

    .line 367
    iput-object p1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 368
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;->estimatedBandwidth:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method synthetic constructor <init>(Lcom/rt/mobile/english/data/LivePlayerWrapper;Lcom/rt/mobile/english/data/LivePlayerWrapper$1;)V
    .locals 0

    .line 367
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;-><init>(Lcom/rt/mobile/english/data/LivePlayerWrapper;)V

    return-void
.end method


# virtual methods
.method public getBitrateEstimate()J
    .locals 2

    .line 372
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;->estimatedBandwidth:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public onBandwidthChange(J)V
    .locals 1

    .line 377
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;->estimatedBandwidth:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method
