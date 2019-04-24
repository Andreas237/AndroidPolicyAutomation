.class final Lo/bam;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bam;->b:Ljava/util/Map;

    .line 24
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 4

    .line 64
    iget-object v0, p0, Lo/bam;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    return-void
.end method

.method public d(I)Z
    .locals 9

    .line 34
    iget-object v0, p0, Lo/bam;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Long;

    .line 35
    if-eqz v4, :cond_2

    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 38
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v0, v5, v0

    const-wide/16 v2, 0x3e8

    div-long v7, v0, v2

    .line 39
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x15180

    cmp-long v0, v7, v0

    if-lez v0, :cond_1

    .line 42
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 47
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_2
    const/4 v0, 0x1

    return v0
.end method
