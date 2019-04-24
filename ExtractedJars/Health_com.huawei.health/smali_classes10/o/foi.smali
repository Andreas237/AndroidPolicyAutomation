.class public Lo/foi;
.super Lo/fnv;
.source "SourceFile"


# instance fields
.field private a:[D

.field private b:[I


# direct methods
.method public constructor <init>(Lo/fmw;)V
    .locals 1

    .line 48
    invoke-direct {p0, p1}, Lo/fnv;-><init>(Lo/fmw;)V

    .line 36
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/foi;->b:[I

    .line 37
    const/4 v0, 0x2

    new-array v0, v0, [D

    fill-array-data v0, :array_1

    iput-object v0, p0, Lo/foi;->a:[D

    .line 49
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/foi;->b(Z)V

    .line 50
    return-void

    :array_0
    .array-data 4
        0x4
        0x1
    .end array-data

    :array_1
    .array-data 8
        0x3fe0000000000000L    # 0.5
        0x3fd0000000000000L    # 0.25
    .end array-data
.end method


# virtual methods
.method public a(J)D
    .locals 2

    .line 123
    const-wide/16 v0, 0xbb8

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 124
    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    return-wide v0

    .line 126
    :cond_0
    const-wide/16 v0, 0x3e8

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    .line 127
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    return-wide v0

    .line 129
    :cond_1
    iget-object v0, p0, Lo/foi;->c:Lo/fmw;

    const-string v1, "ACK_TIMEOUT_SCALE"

    invoke-virtual {v0, v1}, Lo/fmw;->a(Ljava/lang/String;)F

    move-result v0

    float-to-double v0, v0

    return-wide v0
.end method

.method public a(JILo/fmu;)V
    .locals 16

    .line 57
    move-wide/from16 v8, p1

    .line 58
    const-wide/16 v0, 0x2

    div-long v10, p1, v0

    .line 59
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/foi;->b:[I

    add-int/lit8 v1, p3, -0x1

    aget v0, v0, v1

    int-to-long v0, v0

    mul-long/2addr v0, v10

    add-long v12, v8, v0

    .line 60
    long-to-double v0, v12

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/foi;->a:[D

    add-int/lit8 v3, p3, -0x1

    aget-wide v2, v2, v3

    mul-double/2addr v0, v2

    invoke-virtual/range {p4 .. p4}, Lo/fmu;->i()J

    move-result-wide v2

    long-to-double v2, v2

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/foi;->a:[D

    add-int/lit8 v5, p3, -0x1

    aget-wide v4, v4, v5

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sub-double v4, v6, v4

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-double v2, v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    .line 61
    move-object/from16 v0, p4

    move-wide v1, v12

    move-wide v3, v8

    move-wide v5, v10

    move/from16 v7, p3

    invoke-virtual/range {v0 .. v7}, Lo/fmu;->a(JJJI)V

    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-object/from16 v2, p4

    move/from16 v3, p3

    invoke-virtual {v2, v0, v1, v3}, Lo/fmu;->c(JI)V

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-object/from16 v2, p4

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v1, v3}, Lo/fmu;->c(JI)V

    .line 69
    move-object/from16 v0, p4

    invoke-virtual {v0, v14, v15}, Lo/fmu;->e(J)V

    .line 70
    return-void
.end method

.method public b(JLo/fmb;I)V
    .locals 3

    .line 91
    invoke-virtual {p0, p3}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v1

    .line 92
    invoke-virtual {v1, p3}, Lo/fmu;->c(Lo/fmb;)I

    move-result v2

    .line 94
    const/4 v0, 0x3

    if-ne v2, v0, :cond_0

    .line 95
    return-void

    .line 97
    :cond_0
    invoke-virtual {v1}, Lo/fmu;->g()V

    .line 102
    invoke-virtual {v1}, Lo/fmu;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 104
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/fmu;->c(Z)V

    .line 105
    const/4 v0, 0x2

    invoke-virtual {p0, p1, p2, v0, v1}, Lo/foi;->a(JILo/fmu;)V

    goto :goto_0

    .line 106
    :cond_1
    invoke-virtual {v1}, Lo/fmu;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    .line 108
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/fmu;->b(Z)V

    .line 109
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0, v1}, Lo/foi;->a(JILo/fmu;)V

    goto :goto_0

    .line 112
    :cond_2
    invoke-virtual {p0, p1, p2, v2, v1}, Lo/foi;->d(JILo/fmu;)V

    .line 114
    :goto_0
    return-void
.end method

.method protected d(JILo/fmu;)V
    .locals 16

    .line 75
    move-object/from16 v0, p4

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Lo/fmu;->e(I)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x3fec000000000000L    # 0.875

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    move-object/from16 v2, p4

    move/from16 v3, p3

    invoke-virtual {v2, v3}, Lo/fmu;->b(I)J

    move-result-wide v2

    sub-long v2, v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3fc0000000000000L    # 0.125

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    add-long v8, v0, v2

    .line 76
    move-object/from16 v0, p4

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Lo/fmu;->b(I)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    move-wide/from16 v2, p1

    long-to-double v2, v2

    const-wide/high16 v4, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    add-long v10, v0, v2

    .line 77
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/foi;->b:[I

    add-int/lit8 v1, p3, -0x1

    aget v0, v0, v1

    int-to-long v0, v0

    mul-long/2addr v0, v8

    add-long v12, v10, v0

    .line 78
    long-to-double v0, v12

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/foi;->a:[D

    add-int/lit8 v3, p3, -0x1

    aget-wide v2, v2, v3

    mul-double/2addr v0, v2

    invoke-virtual/range {p4 .. p4}, Lo/fmu;->i()J

    move-result-wide v2

    long-to-double v2, v2

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/foi;->a:[D

    add-int/lit8 v5, p3, -0x1

    aget-wide v4, v4, v5

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sub-double v4, v6, v4

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-double v2, v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    .line 79
    move-object/from16 v0, p4

    move-wide v1, v12

    move-wide v3, v10

    move-wide v5, v8

    move/from16 v7, p3

    invoke-virtual/range {v0 .. v7}, Lo/fmu;->a(JJJI)V

    .line 80
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-object/from16 v2, p4

    move/from16 v3, p3

    invoke-virtual {v2, v0, v1, v3}, Lo/fmu;->c(JI)V

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-object/from16 v2, p4

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v1, v3}, Lo/fmu;->c(JI)V

    .line 85
    move-object/from16 v0, p4

    invoke-virtual {v0, v14, v15}, Lo/fmu;->e(J)V

    .line 86
    return-void
.end method

.method public d(Lo/fmb;)V
    .locals 6

    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lo/fmu;->a(I)J

    move-result-wide v2

    sub-long v4, v0, v2

    .line 143
    :goto_0
    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    mul-long/2addr v0, v2

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 145
    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    mul-long/2addr v0, v2

    sub-long/2addr v4, v0

    .line 146
    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->p()V

    .line 147
    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/fmu;->c(JI)V

    goto :goto_0

    .line 155
    :cond_0
    :goto_1
    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    mul-long/2addr v0, v2

    cmp-long v0, v4, v0

    if-lez v0, :cond_1

    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->i()J

    move-result-wide v0

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 157
    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    mul-long/2addr v0, v2

    sub-long/2addr v4, v0

    .line 158
    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->o()V

    .line 159
    invoke-virtual {p0, p1}, Lo/foi;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/fmu;->c(JI)V

    goto :goto_1

    .line 195
    :cond_1
    return-void
.end method
