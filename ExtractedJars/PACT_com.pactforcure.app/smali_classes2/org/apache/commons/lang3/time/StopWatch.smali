.class public Lorg/apache/commons/lang3/time/StopWatch;
.super Ljava/lang/Object;
.source "StopWatch.java"


# static fields
.field private static final NANO_2_MILLIS:J = 0xf4240L

.field private static final STATE_RUNNING:I = 0x1

.field private static final STATE_SPLIT:I = 0xb

.field private static final STATE_STOPPED:I = 0x2

.field private static final STATE_SUSPENDED:I = 0x3

.field private static final STATE_UNSPLIT:I = 0xa

.field private static final STATE_UNSTARTED:I


# instance fields
.field private runningState:I

.field private splitState:I

.field private startTime:J

.field private startTimeMillis:J

.field private stopTime:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    .line 84
    const/16 v0, 0xa

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->splitState:I

    .line 110
    return-void
.end method


# virtual methods
.method public getNanoTime()J
    .locals 4

    .prologue
    .line 284
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 285
    :cond_0
    iget-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->stopTime:J

    iget-wide v2, p0, Lorg/apache/commons/lang3/time/StopWatch;->startTime:J

    sub-long/2addr v0, v2

    .line 289
    :goto_0
    return-wide v0

    .line 286
    :cond_1
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    if-nez v0, :cond_2

    .line 287
    const-wide/16 v0, 0x0

    goto :goto_0

    .line 288
    :cond_2
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 289
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Lorg/apache/commons/lang3/time/StopWatch;->startTime:J

    sub-long/2addr v0, v2

    goto :goto_0

    .line 291
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Illegal running state has occured. "

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getSplitNanoTime()J
    .locals 4

    .prologue
    .line 328
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->splitState:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_0

    .line 329
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stopwatch must be split to get the split time. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 331
    :cond_0
    iget-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->stopTime:J

    iget-wide v2, p0, Lorg/apache/commons/lang3/time/StopWatch;->startTime:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public getSplitTime()J
    .locals 4

    .prologue
    .line 310
    invoke-virtual {p0}, Lorg/apache/commons/lang3/time/StopWatch;->getSplitNanoTime()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public getStartTime()J
    .locals 2

    .prologue
    .line 343
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    if-nez v0, :cond_0

    .line 344
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stopwatch has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 347
    :cond_0
    iget-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->startTimeMillis:J

    return-wide v0
.end method

.method public getTime()J
    .locals 4

    .prologue
    .line 268
    invoke-virtual {p0}, Lorg/apache/commons/lang3/time/StopWatch;->getNanoTime()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 168
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    .line 169
    const/16 v0, 0xa

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->splitState:I

    .line 170
    return-void
.end method

.method public resume()V
    .locals 6

    .prologue
    .line 248
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 249
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stopwatch must be suspended to resume. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 251
    :cond_0
    iget-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->startTime:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iget-wide v4, p0, Lorg/apache/commons/lang3/time/StopWatch;->stopTime:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->startTime:J

    .line 252
    const/4 v0, 0x1

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    .line 253
    return-void
.end method

.method public split()V
    .locals 2

    .prologue
    .line 186
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 187
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stopwatch is not running. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 189
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->stopTime:J

    .line 190
    const/16 v0, 0xb

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->splitState:I

    .line 191
    return-void
.end method

.method public start()V
    .locals 2

    .prologue
    .line 125
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 126
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stopwatch must be reset before being restarted. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_0
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    if-eqz v0, :cond_1

    .line 129
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stopwatch already started. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->startTime:J

    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->startTimeMillis:J

    .line 133
    const/4 v0, 0x1

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    .line 134
    return-void
.end method

.method public stop()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 149
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    if-eq v0, v2, :cond_0

    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 150
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stopwatch is not running. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 152
    :cond_0
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    if-ne v0, v2, :cond_1

    .line 153
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->stopTime:J

    .line 155
    :cond_1
    const/4 v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    .line 156
    return-void
.end method

.method public suspend()V
    .locals 2

    .prologue
    .line 227
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 228
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stopwatch must be running to suspend. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 230
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->stopTime:J

    .line 231
    const/4 v0, 0x3

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->runningState:I

    .line 232
    return-void
.end method

.method public toSplitString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 379
    invoke-virtual {p0}, Lorg/apache/commons/lang3/time/StopWatch;->getSplitTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->formatDurationHMS(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 363
    invoke-virtual {p0}, Lorg/apache/commons/lang3/time/StopWatch;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->formatDurationHMS(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public unsplit()V
    .locals 2

    .prologue
    .line 207
    iget v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->splitState:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_0

    .line 208
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stopwatch has not been split. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_0
    const/16 v0, 0xa

    iput v0, p0, Lorg/apache/commons/lang3/time/StopWatch;->splitState:I

    .line 211
    return-void
.end method
