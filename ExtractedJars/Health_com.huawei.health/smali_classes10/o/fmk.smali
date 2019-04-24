.class public Lo/fmk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmm;


# instance fields
.field private final c:J

.field private d:I

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILo/fmw;)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v1, "EXCHANGE_LIFETIME"

    invoke-virtual {p2, v1}, Lo/fmw;->c(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/fmk;->c:J

    .line 64
    iput p1, p0, Lo/fmk;->d:I

    .line 65
    new-instance v0, Ljava/util/HashMap;

    const/high16 v1, 0x10000

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lo/fmk;->e:Ljava/util/Map;

    .line 66
    return-void
.end method


# virtual methods
.method public d()I
    .locals 13

    .line 75
    const/4 v4, -0x1

    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    .line 78
    iget-object v8, p0, Lo/fmk;->e:Ljava/util/Map;

    monitor-enter v8

    .line 80
    :try_start_0
    iget v0, p0, Lo/fmk;->d:I

    const v1, 0xffff

    and-int v9, v0, v1

    .line 81
    :goto_0
    if-gez v4, :cond_3

    if-nez v5, :cond_3

    .line 83
    iget v0, p0, Lo/fmk;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/fmk;->d:I

    const v1, 0xffff

    and-int v10, v0, v1

    .line 84
    iget-object v0, p0, Lo/fmk;->e:Ljava/util/Map;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Long;

    .line 85
    if-eqz v11, :cond_0

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v6, v0

    if-ltz v0, :cond_1

    .line 87
    :cond_0
    move v4, v10

    .line 88
    iget-object v0, p0, Lo/fmk;->e:Ljava/util/Map;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-wide v2, p0, Lo/fmk;->c:J

    add-long/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    :cond_1
    iget v0, p0, Lo/fmk;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v1, 0xffff

    and-int/2addr v0, v1

    if-ne v0, v9, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 91
    :goto_1
    goto :goto_0

    .line 92
    :cond_3
    monitor-exit v8

    goto :goto_2

    :catchall_0
    move-exception v12

    monitor-exit v8

    throw v12

    .line 93
    :goto_2
    return v4
.end method
