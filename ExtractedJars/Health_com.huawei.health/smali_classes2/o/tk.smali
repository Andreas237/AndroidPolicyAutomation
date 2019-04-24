.class public final Lo/tk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/op;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lo/oj;Ljava/util/Map;Z)[Lo/or;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;Z)[Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;,
            Lo/oh;
        }
    .end annotation

    .line 84
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 85
    move/from16 v0, p2

    invoke-static {p0, p1, v0}, Lo/tz;->c(Lo/oj;Ljava/util/Map;Z)Lo/ub;

    move-result-object v8

    .line 86
    invoke-virtual {v8}, Lo/ub;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, [Lo/ou;

    .line 87
    invoke-virtual {v8}, Lo/ub;->b()Lo/qr;

    move-result-object v0

    const/4 v1, 0x4

    aget-object v1, v10, v1

    const/4 v2, 0x5

    aget-object v2, v10, v2

    const/4 v3, 0x6

    aget-object v3, v10, v3

    const/4 v4, 0x7

    aget-object v4, v10, v4

    .line 88
    invoke-static {v10}, Lo/tk;->e([Lo/ou;)I

    move-result v5

    invoke-static {v10}, Lo/tk;->d([Lo/ou;)I

    move-result v6

    .line 87
    invoke-static/range {v0 .. v6}, Lo/tu;->e(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;II)Lo/qn;

    move-result-object v11

    .line 89
    new-instance v12, Lo/or;

    invoke-virtual {v11}, Lo/qn;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11}, Lo/qn;->d()[B

    move-result-object v1

    sget-object v2, Lo/od;->n:Lo/od;

    invoke-direct {v12, v0, v1, v10, v2}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    .line 90
    sget-object v0, Lo/oq;->e:Lo/oq;

    invoke-virtual {v11}, Lo/qn;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 91
    invoke-virtual {v11}, Lo/qn;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/tl;

    .line 92
    if-eqz v13, :cond_0

    .line 93
    sget-object v0, Lo/oq;->k:Lo/oq;

    invoke-virtual {v12, v0, v13}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 95
    :cond_0
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    goto/16 :goto_0

    .line 97
    :cond_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lo/or;

    invoke-interface {v7, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/or;

    return-object v0
.end method

.method private static b(Lo/ou;Lo/ou;)I
    .locals 2

    .line 101
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 102
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 104
    :cond_1
    invoke-virtual {p0}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method private static d([Lo/ou;)I
    .locals 4

    .line 115
    const/4 v0, 0x0

    aget-object v0, p0, v0

    const/4 v1, 0x4

    aget-object v1, p0, v1

    .line 116
    invoke-static {v0, v1}, Lo/tk;->b(Lo/ou;Lo/ou;)I

    move-result v0

    const/4 v1, 0x6

    aget-object v1, p0, v1

    const/4 v2, 0x2

    aget-object v2, p0, v2

    invoke-static {v1, v2}, Lo/tk;->b(Lo/ou;Lo/ou;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x11

    div-int/lit8 v1, v1, 0x12

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x1

    aget-object v1, p0, v1

    const/4 v2, 0x5

    aget-object v2, p0, v2

    .line 118
    invoke-static {v1, v2}, Lo/tk;->b(Lo/ou;Lo/ou;)I

    move-result v1

    const/4 v2, 0x7

    aget-object v2, p0, v2

    const/4 v3, 0x3

    aget-object v3, p0, v3

    invoke-static {v2, v3}, Lo/tk;->b(Lo/ou;Lo/ou;)I

    move-result v2

    mul-int/lit8 v2, v2, 0x11

    div-int/lit8 v2, v2, 0x12

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 115
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method private static e(Lo/ou;Lo/ou;)I
    .locals 2

    .line 108
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 109
    :cond_0
    const v0, 0x7fffffff

    return v0

    .line 111
    :cond_1
    invoke-virtual {p0}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method private static e([Lo/ou;)I
    .locals 4

    .line 123
    const/4 v0, 0x0

    aget-object v0, p0, v0

    const/4 v1, 0x4

    aget-object v1, p0, v1

    .line 124
    invoke-static {v0, v1}, Lo/tk;->e(Lo/ou;Lo/ou;)I

    move-result v0

    const/4 v1, 0x6

    aget-object v1, p0, v1

    const/4 v2, 0x2

    aget-object v2, p0, v2

    invoke-static {v1, v2}, Lo/tk;->e(Lo/ou;Lo/ou;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x11

    div-int/lit8 v1, v1, 0x12

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x1

    aget-object v1, p0, v1

    const/4 v2, 0x5

    aget-object v2, p0, v2

    .line 126
    invoke-static {v1, v2}, Lo/tk;->e(Lo/ou;Lo/ou;)I

    move-result v1

    const/4 v2, 0x7

    aget-object v2, p0, v2

    const/4 v3, 0x3

    aget-object v3, p0, v3

    invoke-static {v2, v3}, Lo/tk;->e(Lo/ou;Lo/ou;)I

    move-result v2

    mul-int/lit8 v2, v2, 0x11

    div-int/lit8 v2, v2, 0x12

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 123
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method


# virtual methods
.method public c()V
    .locals 0

    .line 133
    return-void
.end method

.method public e(Lo/oj;Ljava/util/Map;)Lo/or;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;,
            Lo/oh;
        }
    .end annotation

    .line 61
    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lo/tk;->a(Lo/oj;Ljava/util/Map;Z)[Lo/or;

    move-result-object v1

    .line 62
    if-eqz v1, :cond_0

    array-length v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    aget-object v0, v1, v0

    if-nez v0, :cond_1

    .line 63
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 65
    :cond_1
    const/4 v0, 0x0

    aget-object v0, v1, v0

    return-object v0
.end method
