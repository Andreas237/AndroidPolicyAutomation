.class public Lo/fmh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmm;


# instance fields
.field private final a:J

.field private final b:I

.field private final c:[J

.field private d:I

.field private final e:I


# direct methods
.method public constructor <init>(ILo/fmw;)V
    .locals 3

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v1, "EXCHANGE_LIFETIME"

    invoke-virtual {p2, v1}, Lo/fmw;->c(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/fmh;->a:J

    .line 88
    const-string v0, "MID_TRACKER_GROUPS"

    invoke-virtual {p2, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/fmh;->e:I

    .line 89
    iput p1, p0, Lo/fmh;->d:I

    .line 90
    iget v0, p0, Lo/fmh;->e:I

    const/high16 v1, 0x10000

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, Lo/fmh;->e:I

    div-int/2addr v0, v1

    iput v0, p0, Lo/fmh;->b:I

    .line 91
    iget v0, p0, Lo/fmh;->e:I

    new-array v0, v0, [J

    iput-object v0, p0, Lo/fmh;->c:[J

    .line 92
    return-void
.end method


# virtual methods
.method public d()I
    .locals 10

    .line 101
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    .line 102
    move-object v5, p0

    monitor-enter v5

    .line 104
    :try_start_0
    iget v0, p0, Lo/fmh;->d:I

    const v1, 0xffff

    and-int v6, v0, v1

    .line 105
    iget v0, p0, Lo/fmh;->b:I

    div-int v7, v6, v0

    .line 106
    add-int/lit8 v0, v7, 0x1

    iget v1, p0, Lo/fmh;->e:I

    rem-int v8, v0, v1

    .line 107
    iget-object v0, p0, Lo/fmh;->c:[J

    aget-wide v0, v0, v8

    cmp-long v0, v0, v3

    if-gez v0, :cond_0

    .line 108
    iget-object v0, p0, Lo/fmh;->c:[J

    iget-wide v1, p0, Lo/fmh;->a:J

    add-long/2addr v1, v3

    aput-wide v1, v0, v7

    .line 109
    iget v0, p0, Lo/fmh;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fmh;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    monitor-exit v5

    return v6

    .line 112
    :cond_0
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v5

    throw v9

    .line 113
    :goto_0
    const/4 v0, -0x1

    return v0
.end method
