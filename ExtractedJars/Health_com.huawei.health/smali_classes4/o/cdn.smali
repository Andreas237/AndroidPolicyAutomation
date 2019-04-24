.class public Lo/cdn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static c(Ljava/util/List;J)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cdx;>;J)I"
        }
    .end annotation

    .line 20
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 21
    const-string v0, "Track_DataIntervalParser"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " return interval 5"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    const/4 v0, 0x5

    return v0

    .line 24
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 25
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cdx;

    invoke-interface {v0}, Lo/cdx;->e()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v4, v0

    .line 26
    const-string v0, "Track_DataIntervalParser"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " interval:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " acquireTime:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cdx;

    invoke-interface {v2}, Lo/cdx;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " startTime:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    rsub-int/lit8 v0, v4, 0x3c

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v5

    .line 28
    add-int/lit8 v0, v4, -0x5

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v6

    .line 29
    if-gt v6, v5, :cond_1

    const/4 v7, 0x5

    goto :goto_0

    :cond_1
    const/16 v7, 0x3c

    .line 30
    :goto_0
    const-string v0, "Track_DataIntervalParser"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " interval:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " return interval "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    return v7

    .line 33
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 34
    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cdx;

    invoke-interface {v0}, Lo/cdx;->e()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cdx;

    invoke-interface {v2}, Lo/cdx;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v4, v0

    .line 35
    if-gtz v4, :cond_3

    .line 36
    const/4 v0, 0x5

    return v0

    .line 38
    :cond_3
    rsub-int/lit8 v0, v4, 0x3c

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v5

    .line 39
    add-int/lit8 v0, v4, -0x5

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v6

    .line 40
    if-gt v6, v5, :cond_4

    const/4 v7, 0x5

    goto :goto_1

    :cond_4
    const/16 v7, 0x3c

    .line 41
    :goto_1
    const-string v0, "Track_DataIntervalParser"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " return interval "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    return v7

    .line 45
    :cond_5
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    :goto_2
    add-int/lit8 v0, v6, 0x1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_8

    add-int/lit8 v0, v6, 0x1

    const/4 v1, 0x6

    if-ge v0, v1, :cond_8

    .line 47
    add-int/lit8 v0, v6, 0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cdx;

    invoke-interface {v0}, Lo/cdx;->e()J

    move-result-wide v0

    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cdx;

    invoke-interface {v2}, Lo/cdx;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v7, v0

    .line 48
    if-gtz v7, :cond_6

    .line 49
    goto :goto_3

    .line 51
    :cond_6
    rsub-int/lit8 v0, v7, 0x3c

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v8

    .line 52
    add-int/lit8 v0, v7, -0x5

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 53
    if-gt v9, v8, :cond_7

    .line 54
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 56
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 46
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 59
    :cond_8
    if-lt v5, v4, :cond_9

    .line 60
    const-string v0, "Track_DataIntervalParser"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " return interval 5"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    const/4 v0, 0x5

    return v0

    .line 63
    :cond_9
    const-string v0, "Track_DataIntervalParser"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " return interval 60"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const/16 v0, 0x3c

    return v0
.end method

.method public static e(Ljava/util/List;J)I
    .locals 1

    .line 92
    invoke-static {p0, p1, p2}, Lo/cdn;->c(Ljava/util/List;J)I

    move-result v0

    return v0
.end method
