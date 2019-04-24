.class public Lo/cdm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/cgn;Lo/cgn;)F
    .locals 20

    .line 25
    invoke-virtual/range {p0 .. p0}, Lo/cgn;->e()D

    move-result-wide v0

    invoke-virtual/range {p1 .. p1}, Lo/cgn;->e()D

    move-result-wide v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3e112e0be826d695L    # 1.0E-9

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 26
    invoke-virtual/range {p0 .. p0}, Lo/cgn;->b()D

    move-result-wide v0

    invoke-virtual/range {p1 .. p1}, Lo/cgn;->b()D

    move-result-wide v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3e112e0be826d695L    # 1.0E-9

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 27
    const/4 v0, 0x0

    return v0

    .line 30
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lo/cgn;->e()D

    move-result-wide v0

    const-wide v2, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double v6, v2, v0

    .line 31
    invoke-virtual/range {p1 .. p1}, Lo/cgn;->e()D

    move-result-wide v0

    const-wide v2, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double v8, v2, v0

    .line 32
    invoke-virtual/range {p0 .. p0}, Lo/cgn;->b()D

    move-result-wide v0

    const-wide v2, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double v10, v2, v0

    .line 33
    invoke-virtual/range {p1 .. p1}, Lo/cgn;->b()D

    move-result-wide v0

    const-wide v2, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double v12, v2, v0

    .line 35
    const-wide v14, 0x40b8e30000000000L    # 6371.0

    .line 36
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    sub-double v4, v12, v10

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double v16, v0, v2

    .line 37
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v16, v0

    if-lez v0, :cond_1

    .line 38
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    goto :goto_0

    .line 39
    :cond_1
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    cmpg-double v0, v16, v0

    if-gez v0, :cond_2

    .line 40
    const-wide/high16 v16, -0x4010000000000000L    # -1.0

    .line 42
    :cond_2
    :goto_0
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->acos(D)D

    move-result-wide v0

    mul-double v18, v0, v14

    .line 44
    move-wide/from16 v0, v18

    double-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    return v0
.end method

.method public static b(Lo/cgn;Lo/cgn;)F
    .locals 8

    .line 48
    invoke-static {p0, p1}, Lo/cdm;->a(Lo/cgn;Lo/cgn;)F

    move-result v4

    .line 49
    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v0

    invoke-virtual {p0}, Lo/cgn;->c()J

    move-result-wide v2

    sub-long v5, v0, v2

    .line 50
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_0

    .line 51
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_0
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v4

    long-to-float v1, v5

    div-float v7, v0, v1

    .line 54
    return v7
.end method

.method public static b(Ljava/util/LinkedList;)V
    .locals 4

    .line 15
    invoke-virtual {p0}, Ljava/util/LinkedList;->size()I

    move-result v1

    .line 18
    add-int/lit8 v2, v1, -0xf

    .line 19
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 20
    invoke-virtual {p0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 19
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public static d(Lo/cgn;Lo/cgn;)F
    .locals 9

    .line 58
    invoke-static {p0, p1}, Lo/cdm;->a(Lo/cgn;Lo/cgn;)F

    move-result v6

    .line 59
    invoke-virtual {p0}, Lo/cgn;->l()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/cgn;->l()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 60
    :cond_0
    return v6

    .line 62
    :cond_1
    invoke-virtual {p0}, Lo/cgn;->l()F

    move-result v0

    invoke-virtual {p1}, Lo/cgn;->l()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v7

    .line 63
    float-to-double v0, v6

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    float-to-double v2, v7

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v8, v0

    .line 64
    return v8
.end method
