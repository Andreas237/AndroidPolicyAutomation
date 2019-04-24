.class public final Lo/qv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F

.field private final g:F

.field private final h:F

.field private final k:F


# direct methods
.method private constructor <init>(FFFFFFFFF)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput p1, p0, Lo/qv;->c:F

    .line 42
    iput p4, p0, Lo/qv;->b:F

    .line 43
    iput p7, p0, Lo/qv;->e:F

    .line 44
    iput p2, p0, Lo/qv;->d:F

    .line 45
    iput p5, p0, Lo/qv;->a:F

    .line 46
    iput p8, p0, Lo/qv;->f:F

    .line 47
    iput p3, p0, Lo/qv;->k:F

    .line 48
    iput p6, p0, Lo/qv;->g:F

    .line 49
    iput p9, p0, Lo/qv;->h:F

    .line 50
    return-void
.end method

.method public static b(FFFFFFFF)Lo/qv;
    .locals 1

    .line 127
    invoke-static/range {p0 .. p7}, Lo/qv;->e(FFFFFFFF)Lo/qv;

    move-result-object v0

    invoke-virtual {v0}, Lo/qv;->c()Lo/qv;

    move-result-object v0

    return-object v0
.end method

.method public static d(FFFFFFFFFFFFFFFF)Lo/qv;
    .locals 3

    .line 61
    invoke-static/range {p0 .. p7}, Lo/qv;->b(FFFFFFFF)Lo/qv;

    move-result-object v1

    .line 62
    invoke-static/range {p8 .. p15}, Lo/qv;->e(FFFFFFFF)Lo/qv;

    move-result-object v2

    .line 63
    invoke-virtual {v2, v1}, Lo/qv;->a(Lo/qv;)Lo/qv;

    move-result-object v0

    return-object v0
.end method

.method public static e(FFFFFFFF)Lo/qv;
    .locals 19

    .line 101
    sub-float v0, p0, p2

    add-float v0, v0, p4

    sub-float v10, v0, p6

    .line 102
    sub-float v0, p1, p3

    add-float v0, v0, p5

    sub-float v11, v0, p7

    .line 103
    const/4 v0, 0x0

    cmpl-float v0, v10, v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-nez v0, :cond_0

    .line 105
    new-instance v0, Lo/qv;

    sub-float v1, p2, p0

    sub-float v2, p4, p2

    sub-float v4, p3, p1

    sub-float v5, p5, p3

    move/from16 v3, p0

    move/from16 v6, p1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v9}, Lo/qv;-><init>(FFFFFFFFF)V

    return-object v0

    .line 109
    :cond_0
    sub-float v12, p2, p4

    .line 110
    sub-float v13, p6, p4

    .line 111
    sub-float v14, p3, p5

    .line 112
    sub-float v15, p7, p5

    .line 113
    mul-float v0, v12, v15

    mul-float v1, v13, v14

    sub-float v16, v0, v1

    .line 114
    mul-float v0, v10, v15

    mul-float v1, v13, v11

    sub-float/2addr v0, v1

    div-float v17, v0, v16

    .line 115
    mul-float v0, v12, v11

    mul-float v1, v10, v14

    sub-float/2addr v0, v1

    div-float v18, v0, v16

    .line 116
    new-instance v0, Lo/qv;

    sub-float v1, p2, p0

    mul-float v2, v17, p2

    add-float/2addr v1, v2

    sub-float v2, p6, p0

    mul-float v3, v18, p6

    add-float/2addr v2, v3

    sub-float v3, p3, p1

    mul-float v4, v17, p3

    add-float/2addr v4, v3

    sub-float v3, p7, p1

    mul-float v5, v18, p7

    add-float/2addr v5, v3

    move/from16 v3, p0

    move/from16 v6, p1

    move/from16 v7, v17

    move/from16 v8, v18

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v9}, Lo/qv;-><init>(FFFFFFFFF)V

    return-object v0
.end method


# virtual methods
.method a(Lo/qv;)Lo/qv;
    .locals 12

    .line 144
    new-instance v0, Lo/qv;

    iget v1, p0, Lo/qv;->c:F

    iget v2, p1, Lo/qv;->c:F

    mul-float/2addr v1, v2

    iget v2, p0, Lo/qv;->d:F

    iget v3, p1, Lo/qv;->b:F

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/qv;->k:F

    iget v3, p1, Lo/qv;->e:F

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget v2, p0, Lo/qv;->c:F

    iget v3, p1, Lo/qv;->d:F

    mul-float/2addr v2, v3

    iget v3, p0, Lo/qv;->d:F

    iget v4, p1, Lo/qv;->a:F

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget v3, p0, Lo/qv;->k:F

    iget v4, p1, Lo/qv;->f:F

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget v3, p0, Lo/qv;->c:F

    iget v4, p1, Lo/qv;->k:F

    mul-float/2addr v3, v4

    iget v4, p0, Lo/qv;->d:F

    iget v5, p1, Lo/qv;->g:F

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/qv;->k:F

    iget v5, p1, Lo/qv;->h:F

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lo/qv;->b:F

    iget v5, p1, Lo/qv;->c:F

    mul-float/2addr v4, v5

    iget v5, p0, Lo/qv;->a:F

    iget v6, p1, Lo/qv;->b:F

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget v5, p0, Lo/qv;->g:F

    iget v6, p1, Lo/qv;->e:F

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget v5, p0, Lo/qv;->b:F

    iget v6, p1, Lo/qv;->d:F

    mul-float/2addr v5, v6

    iget v6, p0, Lo/qv;->a:F

    iget v7, p1, Lo/qv;->a:F

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget v6, p0, Lo/qv;->g:F

    iget v7, p1, Lo/qv;->f:F

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget v6, p0, Lo/qv;->b:F

    iget v7, p1, Lo/qv;->k:F

    mul-float/2addr v6, v7

    iget v7, p0, Lo/qv;->a:F

    iget v8, p1, Lo/qv;->g:F

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget v7, p0, Lo/qv;->g:F

    iget v8, p1, Lo/qv;->h:F

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget v7, p0, Lo/qv;->e:F

    iget v8, p1, Lo/qv;->c:F

    mul-float/2addr v7, v8

    iget v8, p0, Lo/qv;->f:F

    iget v9, p1, Lo/qv;->b:F

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    iget v8, p0, Lo/qv;->h:F

    iget v9, p1, Lo/qv;->e:F

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    iget v8, p0, Lo/qv;->e:F

    iget v9, p1, Lo/qv;->d:F

    mul-float/2addr v8, v9

    iget v9, p0, Lo/qv;->f:F

    iget v10, p1, Lo/qv;->a:F

    mul-float/2addr v9, v10

    add-float/2addr v8, v9

    iget v9, p0, Lo/qv;->h:F

    iget v10, p1, Lo/qv;->f:F

    mul-float/2addr v9, v10

    add-float/2addr v8, v9

    iget v9, p0, Lo/qv;->e:F

    iget v10, p1, Lo/qv;->k:F

    mul-float/2addr v9, v10

    iget v10, p0, Lo/qv;->f:F

    iget v11, p1, Lo/qv;->g:F

    mul-float/2addr v10, v11

    add-float/2addr v9, v10

    iget v10, p0, Lo/qv;->h:F

    iget v11, p1, Lo/qv;->h:F

    mul-float/2addr v10, v11

    add-float/2addr v9, v10

    invoke-direct/range {v0 .. v9}, Lo/qv;-><init>(FFFFFFFFF)V

    return-object v0
.end method

.method c()Lo/qv;
    .locals 12

    .line 132
    new-instance v0, Lo/qv;

    iget v1, p0, Lo/qv;->a:F

    iget v2, p0, Lo/qv;->h:F

    mul-float/2addr v1, v2

    iget v2, p0, Lo/qv;->f:F

    iget v3, p0, Lo/qv;->g:F

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget v2, p0, Lo/qv;->f:F

    iget v3, p0, Lo/qv;->k:F

    mul-float/2addr v2, v3

    iget v3, p0, Lo/qv;->d:F

    iget v4, p0, Lo/qv;->h:F

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lo/qv;->d:F

    iget v4, p0, Lo/qv;->g:F

    mul-float/2addr v3, v4

    iget v4, p0, Lo/qv;->a:F

    iget v5, p0, Lo/qv;->k:F

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget v4, p0, Lo/qv;->e:F

    iget v5, p0, Lo/qv;->g:F

    mul-float/2addr v4, v5

    iget v5, p0, Lo/qv;->b:F

    iget v6, p0, Lo/qv;->h:F

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    iget v5, p0, Lo/qv;->c:F

    iget v6, p0, Lo/qv;->h:F

    mul-float/2addr v5, v6

    iget v6, p0, Lo/qv;->e:F

    iget v7, p0, Lo/qv;->k:F

    mul-float/2addr v6, v7

    sub-float/2addr v5, v6

    iget v6, p0, Lo/qv;->b:F

    iget v7, p0, Lo/qv;->k:F

    mul-float/2addr v6, v7

    iget v7, p0, Lo/qv;->c:F

    iget v8, p0, Lo/qv;->g:F

    mul-float/2addr v7, v8

    sub-float/2addr v6, v7

    iget v7, p0, Lo/qv;->b:F

    iget v8, p0, Lo/qv;->f:F

    mul-float/2addr v7, v8

    iget v8, p0, Lo/qv;->e:F

    iget v9, p0, Lo/qv;->a:F

    mul-float/2addr v8, v9

    sub-float/2addr v7, v8

    iget v8, p0, Lo/qv;->e:F

    iget v9, p0, Lo/qv;->d:F

    mul-float/2addr v8, v9

    iget v9, p0, Lo/qv;->c:F

    iget v10, p0, Lo/qv;->f:F

    mul-float/2addr v9, v10

    sub-float/2addr v8, v9

    iget v9, p0, Lo/qv;->c:F

    iget v10, p0, Lo/qv;->a:F

    mul-float/2addr v9, v10

    iget v10, p0, Lo/qv;->b:F

    iget v11, p0, Lo/qv;->d:F

    mul-float/2addr v10, v11

    sub-float/2addr v9, v10

    invoke-direct/range {v0 .. v9}, Lo/qv;-><init>(FFFFFFFFF)V

    return-object v0
.end method

.method public d([F)V
    .locals 17

    .line 67
    move-object/from16 v0, p1

    array-length v3, v0

    .line 68
    move-object/from16 v0, p0

    iget v4, v0, Lo/qv;->c:F

    .line 69
    move-object/from16 v0, p0

    iget v5, v0, Lo/qv;->b:F

    .line 70
    move-object/from16 v0, p0

    iget v6, v0, Lo/qv;->e:F

    .line 71
    move-object/from16 v0, p0

    iget v7, v0, Lo/qv;->d:F

    .line 72
    move-object/from16 v0, p0

    iget v8, v0, Lo/qv;->a:F

    .line 73
    move-object/from16 v0, p0

    iget v9, v0, Lo/qv;->f:F

    .line 74
    move-object/from16 v0, p0

    iget v10, v0, Lo/qv;->k:F

    .line 75
    move-object/from16 v0, p0

    iget v11, v0, Lo/qv;->g:F

    .line 76
    move-object/from16 v0, p0

    iget v12, v0, Lo/qv;->h:F

    .line 77
    const/4 v13, 0x0

    :goto_0
    if-ge v13, v3, :cond_0

    .line 78
    aget v14, p1, v13

    .line 79
    add-int/lit8 v0, v13, 0x1

    aget v15, p1, v0

    .line 80
    mul-float v0, v6, v14

    mul-float v1, v9, v15

    add-float/2addr v0, v1

    add-float v16, v0, v12

    .line 81
    mul-float v0, v4, v14

    mul-float v1, v7, v15

    add-float/2addr v0, v1

    add-float/2addr v0, v10

    div-float v0, v0, v16

    aput v0, p1, v13

    .line 82
    add-int/lit8 v0, v13, 0x1

    mul-float v1, v5, v14

    mul-float v2, v8, v15

    add-float/2addr v1, v2

    add-float/2addr v1, v11

    div-float v1, v1, v16

    aput v1, p1, v0

    .line 77
    add-int/lit8 v13, v13, 0x2

    goto :goto_0

    .line 84
    :cond_0
    return-void
.end method
