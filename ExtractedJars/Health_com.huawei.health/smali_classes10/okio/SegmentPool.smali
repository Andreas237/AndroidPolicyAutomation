.class final Lokio/SegmentPool;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final MAX_SIZE:J = 0x10000L

.field static byteCount:J = 0x0L

.field static next:Lokio/Segment; = null


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method static recycle(Lokio/Segment;)V
    .locals 6

    .line 50
    iget-object v0, p0, Lokio/Segment;->next:Lokio/Segment;

    if-nez v0, :cond_0

    iget-object v0, p0, Lokio/Segment;->prev:Lokio/Segment;

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 51
    :cond_1
    iget-boolean v0, p0, Lokio/Segment;->shared:Z

    if-eqz v0, :cond_2

    return-void

    .line 52
    :cond_2
    const-class v4, Lokio/SegmentPool;

    monitor-enter v4

    .line 53
    :try_start_0
    sget-wide v0, Lokio/SegmentPool;->byteCount:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v2, 0x800

    add-long/2addr v0, v2

    const-wide/32 v2, 0x10000

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    monitor-exit v4

    return-void

    .line 54
    :cond_3
    :try_start_1
    sget-wide v0, Lokio/SegmentPool;->byteCount:J

    const-wide/16 v2, 0x800

    add-long/2addr v0, v2

    sput-wide v0, Lokio/SegmentPool;->byteCount:J

    .line 55
    sget-object v0, Lokio/SegmentPool;->next:Lokio/Segment;

    iput-object v0, p0, Lokio/Segment;->next:Lokio/Segment;

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lokio/Segment;->limit:I

    const/4 v0, 0x0

    iput v0, p0, Lokio/Segment;->pos:I

    .line 57
    sput-object p0, Lokio/SegmentPool;->next:Lokio/Segment;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 59
    :goto_0
    return-void
.end method

.method static take()Lokio/Segment;
    .locals 7

    .line 37
    const-class v4, Lokio/SegmentPool;

    monitor-enter v4

    .line 38
    :try_start_0
    sget-object v0, Lokio/SegmentPool;->next:Lokio/Segment;

    if-eqz v0, :cond_0

    .line 39
    sget-object v5, Lokio/SegmentPool;->next:Lokio/Segment;

    .line 40
    iget-object v0, v5, Lokio/Segment;->next:Lokio/Segment;

    sput-object v0, Lokio/SegmentPool;->next:Lokio/Segment;

    .line 41
    const/4 v0, 0x0

    iput-object v0, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 42
    sget-wide v0, Lokio/SegmentPool;->byteCount:J

    const-wide/16 v2, 0x800

    sub-long/2addr v0, v2

    sput-wide v0, Lokio/SegmentPool;->byteCount:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit v4

    return-object v5

    .line 45
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 46
    :goto_0
    new-instance v0, Lokio/Segment;

    invoke-direct {v0}, Lokio/Segment;-><init>()V

    return-object v0
.end method
