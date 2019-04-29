.class public abstract Lio/streamroot/dna/core/QosModule;
.super Ljava/lang/Object;
.source "QosModule.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/QosModule$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQosModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QosModule.kt\nio/streamroot/dna/core/QosModule\n*L\n1#1,229:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001a\u001a\u00020\nJ\r\u0010\u001b\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\u0008\u001dJ\r\u0010\u001e\u001a\u00020\u001fH\u0000\u00a2\u0006\u0002\u0008 J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\nH\u0002J\u0006\u0010$\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0006J\u0018\u0010\'\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lio/streamroot/dna/core/QosModule;",
        "",
        "()V",
        "bufferingCount",
        "",
        "currentPlaybackState",
        "Lio/streamroot/dna/core/PlaybackState;",
        "dropFrameCount",
        "dropFrameEventCount",
        "lastAnalytics",
        "",
        "playbackErrorCount",
        "playbackTime",
        "summaryTimeBuffering",
        "summaryTimePlaying",
        "timeBuffering",
        "timeDropFraming",
        "timeEnding",
        "timePausing",
        "timePlaying",
        "timeSeeking",
        "totalPlaybackErrorCount",
        "trackSwitchCount",
        "droppedFrameOccurred",
        "",
        "count",
        "elapsedMs",
        "getDetails",
        "Lio/streamroot/dna/core/QosDetails;",
        "getDetails$dna_core_release",
        "getSummary",
        "Lio/streamroot/dna/core/QosSummary;",
        "getSummary$dna_core_release",
        "millisToSeconds",
        "",
        "millis",
        "playbackErrorOccurred",
        "playbackStateChange",
        "playbackState",
        "toCountPerMinute",
        "delta",
        "Ljava/math/BigDecimal;",
        "trackSwitchOccurred",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final COUNT_PER_MINUTE_ROUNDING:Ljava/math/MathContext;

.field public static final Companion:Lio/streamroot/dna/core/QosModule$Companion;

.field private static final MILLIS_IN_ONE_MINUTE:Ljava/math/BigDecimal;

.field private static final MILLIS_IN_ONE_SECOND:Ljava/math/BigDecimal;

.field private static final MILLIS_TO_SECOND_ROUNDING:Ljava/math/MathContext;


# instance fields
.field private volatile bufferingCount:I

.field private volatile currentPlaybackState:Lio/streamroot/dna/core/PlaybackState;

.field private volatile dropFrameCount:I

.field private volatile dropFrameEventCount:I

.field private volatile lastAnalytics:J

.field private volatile playbackErrorCount:I

.field private volatile playbackTime:J

.field private volatile summaryTimeBuffering:J

.field private volatile summaryTimePlaying:J

.field private volatile timeBuffering:J

.field private volatile timeDropFraming:J

.field private volatile timeEnding:J

.field private volatile timePausing:J

.field private volatile timePlaying:J

.field private volatile timeSeeking:J

.field private volatile totalPlaybackErrorCount:I

.field private volatile trackSwitchCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/streamroot/dna/core/QosModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/QosModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/QosModule;->Companion:Lio/streamroot/dna/core/QosModule$Companion;

    .line 217
    new-instance v0, Ljava/math/BigDecimal;

    const v1, 0xea60

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(I)V

    sput-object v0, Lio/streamroot/dna/core/QosModule;->MILLIS_IN_ONE_MINUTE:Ljava/math/BigDecimal;

    .line 220
    new-instance v0, Ljava/math/BigDecimal;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(I)V

    sput-object v0, Lio/streamroot/dna/core/QosModule;->MILLIS_IN_ONE_SECOND:Ljava/math/BigDecimal;

    .line 223
    new-instance v0, Ljava/math/MathContext;

    sget-object v1, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Ljava/math/MathContext;-><init>(ILjava/math/RoundingMode;)V

    sput-object v0, Lio/streamroot/dna/core/QosModule;->MILLIS_TO_SECOND_ROUNDING:Ljava/math/MathContext;

    .line 226
    new-instance v0, Ljava/math/MathContext;

    sget-object v1, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x6

    invoke-direct {v0, v2, v1}, Ljava/math/MathContext;-><init>(ILjava/math/RoundingMode;)V

    sput-object v0, Lio/streamroot/dna/core/QosModule;->COUNT_PER_MINUTE_ROUNDING:Ljava/math/MathContext;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    sget-object v0, Lio/streamroot/dna/core/PlaybackState;->IDLE:Lio/streamroot/dna/core/PlaybackState;

    iput-object v0, p0, Lio/streamroot/dna/core/QosModule;->currentPlaybackState:Lio/streamroot/dna/core/PlaybackState;

    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/streamroot/dna/core/QosModule;->lastAnalytics:J

    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/streamroot/dna/core/QosModule;->playbackTime:J

    return-void
.end method

.method public static synthetic droppedFrameOccurred$default(Lio/streamroot/dna/core/QosModule;IJILjava/lang/Object;)V
    .locals 0

    if-eqz p5, :cond_0

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: droppedFrameOccurred"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_1

    const/4 p1, 0x1

    :cond_1
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_2

    const-wide/16 p2, 0x0

    .line 146
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/streamroot/dna/core/QosModule;->droppedFrameOccurred(IJ)V

    return-void
.end method

.method private final millisToSeconds(J)F
    .locals 1

    .line 213
    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p1

    const-string p2, "BigDecimal.valueOf(this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lio/streamroot/dna/core/QosModule;->MILLIS_IN_ONE_SECOND:Ljava/math/BigDecimal;

    sget-object v0, Lio/streamroot/dna/core/QosModule;->MILLIS_TO_SECOND_ROUNDING:Ljava/math/MathContext;

    invoke-virtual {p1, p2, v0}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigDecimal;->floatValue()F

    move-result p1

    return p1
.end method

.method private final toCountPerMinute(ILjava/math/BigDecimal;)F
    .locals 2

    int-to-long v0, p1

    .line 209
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p1

    const-string v0, "BigDecimal.valueOf(this.toLong())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    sget-object v0, Lio/streamroot/dna/core/QosModule;->COUNT_PER_MINUTE_ROUNDING:Ljava/math/MathContext;

    invoke-virtual {p1, p2, v0}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object p1

    .line 211
    invoke-virtual {p1}, Ljava/math/BigDecimal;->floatValue()F

    move-result p1

    return p1
.end method


# virtual methods
.method public final declared-synchronized droppedFrameOccurred(IJ)V
    .locals 4

    monitor-enter p0

    .line 147
    :try_start_0
    iget v0, p0, Lio/streamroot/dna/core/QosModule;->dropFrameEventCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lio/streamroot/dna/core/QosModule;->dropFrameEventCount:I

    .line 148
    iget v0, p0, Lio/streamroot/dna/core/QosModule;->dropFrameCount:I

    add-int/2addr v0, p1

    iput v0, p0, Lio/streamroot/dna/core/QosModule;->dropFrameCount:I

    .line 149
    iget-wide v0, p0, Lio/streamroot/dna/core/QosModule;->timeDropFraming:J

    add-long v2, v0, p2

    iput-wide v2, p0, Lio/streamroot/dna/core/QosModule;->timeDropFraming:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 146
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized getDetails$dna_core_release()Lio/streamroot/dna/core/QosDetails;
    .locals 21
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v1, p0

    monitor-enter p0

    .line 165
    :try_start_0
    iget-object v2, v1, Lio/streamroot/dna/core/QosModule;->currentPlaybackState:Lio/streamroot/dna/core/PlaybackState;

    invoke-virtual {v1, v2}, Lio/streamroot/dna/core/QosModule;->playbackStateChange(Lio/streamroot/dna/core/PlaybackState;)V

    .line 167
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 168
    new-instance v4, Ljava/math/BigDecimal;

    iget-wide v5, v1, Lio/streamroot/dna/core/QosModule;->lastAnalytics:J

    sub-long v7, v2, v5

    invoke-direct {v4, v7, v8}, Ljava/math/BigDecimal;-><init>(J)V

    .line 169
    sget-object v5, Lio/streamroot/dna/core/QosModule;->MILLIS_IN_ONE_MINUTE:Ljava/math/BigDecimal;

    sget-object v6, Lio/streamroot/dna/core/QosModule;->MILLIS_TO_SECOND_ROUNDING:Ljava/math/MathContext;

    invoke-virtual {v4, v5, v6}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v4

    .line 171
    iget v5, v1, Lio/streamroot/dna/core/QosModule;->bufferingCount:I

    const-string v6, "delta"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lio/streamroot/dna/core/QosModule;->toCountPerMinute(ILjava/math/BigDecimal;)F

    move-result v16

    .line 173
    iget v5, v1, Lio/streamroot/dna/core/QosModule;->trackSwitchCount:I

    invoke-direct {v1, v5, v4}, Lio/streamroot/dna/core/QosModule;->toCountPerMinute(ILjava/math/BigDecimal;)F

    move-result v15

    .line 175
    iget v5, v1, Lio/streamroot/dna/core/QosModule;->dropFrameCount:I

    invoke-direct {v1, v5, v4}, Lio/streamroot/dna/core/QosModule;->toCountPerMinute(ILjava/math/BigDecimal;)F

    move-result v18

    .line 177
    iget v5, v1, Lio/streamroot/dna/core/QosModule;->dropFrameEventCount:I

    invoke-direct {v1, v5, v4}, Lio/streamroot/dna/core/QosModule;->toCountPerMinute(ILjava/math/BigDecimal;)F

    move-result v17

    .line 179
    new-instance v4, Lio/streamroot/dna/core/QosDetails;

    .line 180
    iget-wide v5, v1, Lio/streamroot/dna/core/QosModule;->timePlaying:J

    invoke-direct {v1, v5, v6}, Lio/streamroot/dna/core/QosModule;->millisToSeconds(J)F

    move-result v8

    .line 181
    iget-wide v5, v1, Lio/streamroot/dna/core/QosModule;->timeSeeking:J

    invoke-direct {v1, v5, v6}, Lio/streamroot/dna/core/QosModule;->millisToSeconds(J)F

    move-result v9

    .line 182
    iget-wide v5, v1, Lio/streamroot/dna/core/QosModule;->timeBuffering:J

    invoke-direct {v1, v5, v6}, Lio/streamroot/dna/core/QosModule;->millisToSeconds(J)F

    move-result v10

    .line 183
    iget-wide v5, v1, Lio/streamroot/dna/core/QosModule;->timePausing:J

    invoke-direct {v1, v5, v6}, Lio/streamroot/dna/core/QosModule;->millisToSeconds(J)F

    move-result v11

    .line 184
    iget-wide v5, v1, Lio/streamroot/dna/core/QosModule;->timeEnding:J

    invoke-direct {v1, v5, v6}, Lio/streamroot/dna/core/QosModule;->millisToSeconds(J)F

    move-result v12

    .line 185
    iget v13, v1, Lio/streamroot/dna/core/QosModule;->totalPlaybackErrorCount:I

    .line 186
    iget v14, v1, Lio/streamroot/dna/core/QosModule;->playbackErrorCount:I

    .line 191
    iget-wide v5, v1, Lio/streamroot/dna/core/QosModule;->timeDropFraming:J

    move-object v7, v4

    move-wide/from16 v19, v5

    .line 179
    invoke-direct/range {v7 .. v20}, Lio/streamroot/dna/core/QosDetails;-><init>(FFFFFIIFFFFJ)V

    .line 193
    iput-wide v2, v1, Lio/streamroot/dna/core/QosModule;->lastAnalytics:J

    const-wide/16 v2, 0x0

    .line 194
    iput-wide v2, v1, Lio/streamroot/dna/core/QosModule;->timePlaying:J

    .line 195
    iput-wide v2, v1, Lio/streamroot/dna/core/QosModule;->timeSeeking:J

    .line 196
    iput-wide v2, v1, Lio/streamroot/dna/core/QosModule;->timeBuffering:J

    .line 197
    iput-wide v2, v1, Lio/streamroot/dna/core/QosModule;->timePausing:J

    .line 198
    iput-wide v2, v1, Lio/streamroot/dna/core/QosModule;->timeEnding:J

    const/4 v5, 0x0

    .line 199
    iput v5, v1, Lio/streamroot/dna/core/QosModule;->trackSwitchCount:I

    .line 200
    iput v5, v1, Lio/streamroot/dna/core/QosModule;->playbackErrorCount:I

    .line 201
    iput v5, v1, Lio/streamroot/dna/core/QosModule;->bufferingCount:I

    .line 202
    iput v5, v1, Lio/streamroot/dna/core/QosModule;->dropFrameEventCount:I

    .line 203
    iput v5, v1, Lio/streamroot/dna/core/QosModule;->dropFrameCount:I

    .line 204
    iput-wide v2, v1, Lio/streamroot/dna/core/QosModule;->timeDropFraming:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 164
    monitor-exit p0

    throw v2
.end method

.method public final declared-synchronized getSummary$dna_core_release()Lio/streamroot/dna/core/QosSummary;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    monitor-enter p0

    .line 154
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/QosModule;->currentPlaybackState:Lio/streamroot/dna/core/PlaybackState;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/QosModule;->playbackStateChange(Lio/streamroot/dna/core/PlaybackState;)V

    .line 155
    new-instance v0, Lio/streamroot/dna/core/QosSummary;

    iget-wide v1, p0, Lio/streamroot/dna/core/QosModule;->summaryTimeBuffering:J

    iget-wide v3, p0, Lio/streamroot/dna/core/QosModule;->summaryTimePlaying:J

    invoke-direct {v0, v1, v2, v3, v4}, Lio/streamroot/dna/core/QosSummary;-><init>(JJ)V

    const-wide/16 v1, 0x0

    .line 157
    iput-wide v1, p0, Lio/streamroot/dna/core/QosModule;->summaryTimePlaying:J

    .line 158
    iput-wide v1, p0, Lio/streamroot/dna/core/QosModule;->summaryTimeBuffering:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 153
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized playbackErrorOccurred()V
    .locals 1

    monitor-enter p0

    .line 141
    :try_start_0
    iget v0, p0, Lio/streamroot/dna/core/QosModule;->totalPlaybackErrorCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lio/streamroot/dna/core/QosModule;->totalPlaybackErrorCount:I

    .line 142
    iget v0, p0, Lio/streamroot/dna/core/QosModule;->playbackErrorCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lio/streamroot/dna/core/QosModule;->playbackErrorCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 140
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized playbackStateChange(Lio/streamroot/dna/core/PlaybackState;)V
    .locals 8
    .param p1    # Lio/streamroot/dna/core/PlaybackState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "playbackState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    iget-object v0, p0, Lio/streamroot/dna/core/QosModule;->currentPlaybackState:Lio/streamroot/dna/core/PlaybackState;

    sget-object v1, Lio/streamroot/dna/core/PlaybackState;->SEEKING:Lio/streamroot/dna/core/PlaybackState;

    if-ne v0, v1, :cond_0

    sget-object v0, Lio/streamroot/dna/core/PlaybackState;->BUFFERING:Lio/streamroot/dna/core/PlaybackState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v0, :cond_0

    monitor-exit p0

    return-void

    .line 104
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 105
    iget-wide v2, p0, Lio/streamroot/dna/core/QosModule;->playbackTime:J

    sub-long v4, v0, v2

    .line 107
    iget-object v2, p0, Lio/streamroot/dna/core/QosModule;->currentPlaybackState:Lio/streamroot/dna/core/PlaybackState;

    sget-object v3, Lio/streamroot/dna/core/QosModule$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Lio/streamroot/dna/core/PlaybackState;->ordinal()I

    move-result v2

    aget v2, v3, v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 124
    :pswitch_0
    iget-wide v2, p0, Lio/streamroot/dna/core/QosModule;->timeEnding:J

    add-long v6, v2, v4

    iput-wide v6, p0, Lio/streamroot/dna/core/QosModule;->timeEnding:J

    goto :goto_0

    .line 121
    :pswitch_1
    iget-wide v2, p0, Lio/streamroot/dna/core/QosModule;->timeSeeking:J

    add-long v6, v2, v4

    iput-wide v6, p0, Lio/streamroot/dna/core/QosModule;->timeSeeking:J

    goto :goto_0

    .line 116
    :pswitch_2
    iget v2, p0, Lio/streamroot/dna/core/QosModule;->bufferingCount:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lio/streamroot/dna/core/QosModule;->bufferingCount:I

    .line 117
    iget-wide v2, p0, Lio/streamroot/dna/core/QosModule;->summaryTimeBuffering:J

    add-long v6, v2, v4

    iput-wide v6, p0, Lio/streamroot/dna/core/QosModule;->summaryTimeBuffering:J

    .line 118
    iget-wide v2, p0, Lio/streamroot/dna/core/QosModule;->timeBuffering:J

    add-long v6, v2, v4

    iput-wide v6, p0, Lio/streamroot/dna/core/QosModule;->timeBuffering:J

    goto :goto_0

    .line 113
    :pswitch_3
    iget-wide v2, p0, Lio/streamroot/dna/core/QosModule;->timePausing:J

    add-long v6, v2, v4

    iput-wide v6, p0, Lio/streamroot/dna/core/QosModule;->timePausing:J

    goto :goto_0

    .line 109
    :pswitch_4
    iget-wide v2, p0, Lio/streamroot/dna/core/QosModule;->summaryTimePlaying:J

    add-long v6, v2, v4

    iput-wide v6, p0, Lio/streamroot/dna/core/QosModule;->summaryTimePlaying:J

    .line 110
    iget-wide v2, p0, Lio/streamroot/dna/core/QosModule;->timePlaying:J

    add-long v6, v2, v4

    iput-wide v6, p0, Lio/streamroot/dna/core/QosModule;->timePlaying:J

    .line 130
    :goto_0
    iput-wide v0, p0, Lio/streamroot/dna/core/QosModule;->playbackTime:J

    .line 131
    iput-object p1, p0, Lio/streamroot/dna/core/QosModule;->currentPlaybackState:Lio/streamroot/dna/core/PlaybackState;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 101
    monitor-exit p0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final declared-synchronized trackSwitchOccurred()V
    .locals 1

    monitor-enter p0

    .line 136
    :try_start_0
    iget v0, p0, Lio/streamroot/dna/core/QosModule;->trackSwitchCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lio/streamroot/dna/core/QosModule;->trackSwitchCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 135
    monitor-exit p0

    throw v0
.end method
