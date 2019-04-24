.class public Lo/eil;
.super Lo/eiq;
.source "SourceFile"


# instance fields
.field private p:I

.field private s:Lo/eix;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/ln;Lo/nv;)V
    .locals 1

    .line 32
    invoke-direct/range {p0 .. p5}, Lo/eiq;-><init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/ln;Lo/nv;)V

    .line 28
    const v0, -0x7fffffff

    iput v0, p0, Lo/eil;->p:I

    .line 35
    sget-object v0, Lo/eix;->a:Lo/eix;

    iput-object v0, p0, Lo/eil;->s:Lo/eix;

    .line 33
    return-void
.end method

.method private a(FF)V
    .locals 10

    .line 232
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 234
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 235
    float-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 236
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 237
    float-to-long v0, p2

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 239
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 240
    float-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 241
    const/4 v0, 0x2

    const/4 v1, 0x5

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 242
    const/4 v0, 0x5

    const/16 v1, 0x1e

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 244
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 245
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long v8, v0, v2

    .line 246
    long-to-float v0, v8

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 248
    goto :goto_0

    .line 249
    :cond_0
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    iput v1, v0, Lo/lh;->d:I

    .line 250
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v1, p0, Lo/eil;->c:Lo/lh;

    iget v1, v1, Lo/lh;->d:I

    new-array v1, v1, [F

    iput-object v1, v0, Lo/lh;->a:[F

    .line 253
    const/4 v8, 0x0

    :goto_1
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget v0, v0, Lo/lh;->d:I

    if-ge v8, v0, :cond_1

    .line 254
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    aput v1, v0, v8

    .line 253
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 256
    :cond_1
    return-void
.end method

.method private b(FF)V
    .locals 11

    .line 190
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 192
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 193
    float-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 194
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 195
    float-to-long v0, p2

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 197
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 198
    float-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 200
    const/4 v0, 0x5

    const/16 v1, 0xf

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 201
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 202
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 203
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 204
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 209
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 210
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 211
    :cond_0
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long v8, v0, v2

    .line 212
    long-to-float v0, v8

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->add(II)V

    goto :goto_0

    .line 216
    :cond_1
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long v8, v0, v2

    .line 217
    long-to-float v0, v8

    cmpg-float v0, v0, p2

    if-gtz v0, :cond_2

    .line 218
    long-to-float v0, v8

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    :cond_2
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    iput v1, v0, Lo/lh;->d:I

    .line 222
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v1, p0, Lo/eil;->c:Lo/lh;

    iget v1, v1, Lo/lh;->d:I

    new-array v1, v1, [F

    iput-object v1, v0, Lo/lh;->a:[F

    .line 225
    const/4 v10, 0x0

    :goto_1
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget v0, v0, Lo/lh;->d:I

    if-ge v10, v0, :cond_3

    .line 226
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    aput v1, v0, v10

    .line 225
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 228
    :cond_3
    return-void
.end method

.method private e(FF)V
    .locals 7

    .line 146
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 147
    float-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 148
    const/16 v0, 0xb

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 149
    const/16 v0, 0x17

    if-ne v6, v0, :cond_0

    .line 151
    const/16 v0, 0xc

    const/4 v1, 0x5

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 154
    :cond_0
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 155
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 156
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 157
    const/16 v0, 0xb

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 158
    if-eqz v6, :cond_1

    .line 159
    return-void

    .line 164
    :cond_1
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    const/4 v1, 0x0

    iput v1, v0, Lo/lh;->e:I

    .line 170
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    const/4 v1, 0x5

    iput v1, v0, Lo/lh;->d:I

    .line 171
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v1, p0, Lo/eil;->c:Lo/lh;

    iget v1, v1, Lo/lh;->d:I

    new-array v1, v1, [F

    iput-object v1, v0, Lo/lh;->a:[F

    .line 173
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 174
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xea60

    div-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 175
    const/16 v0, 0xb

    const/4 v1, 0x6

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 176
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xea60

    div-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 177
    const/16 v0, 0xb

    const/16 v1, 0xc

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 178
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xea60

    div-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 179
    const/16 v0, 0xb

    const/16 v1, 0x12

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 180
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xea60

    div-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 182
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 183
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 185
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xea60

    div-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    const/4 v2, 0x4

    aput v1, v0, v2

    .line 186
    return-void
.end method


# virtual methods
.method public a(Lo/eix;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lo/eil;->s:Lo/eix;

    .line 39
    return-void
.end method

.method protected d(FF)V
    .locals 19

    .line 62
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->s:Lo/eix;

    sget-object v1, Lo/eix;->e:Lo/eix;

    if-ne v0, v1, :cond_0

    .line 63
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lo/eil;->b(FF)V

    .line 65
    invoke-virtual/range {p0 .. p0}, Lo/eil;->d()V

    .line 66
    return-void

    .line 67
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->s:Lo/eix;

    sget-object v1, Lo/eix;->c:Lo/eix;

    if-ne v0, v1, :cond_1

    .line 68
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lo/eil;->e(FF)V

    .line 70
    invoke-virtual/range {p0 .. p0}, Lo/eil;->d()V

    .line 71
    return-void

    .line 72
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->s:Lo/eix;

    sget-object v1, Lo/eix;->f:Lo/eix;

    if-ne v0, v1, :cond_2

    .line 73
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lo/eil;->a(FF)V

    .line 74
    invoke-virtual/range {p0 .. p0}, Lo/eil;->d()V

    .line 75
    return-void

    .line 81
    :cond_2
    const/high16 v4, 0x44b40000    # 1440.0f

    .line 82
    const/high16 v5, 0x44340000    # 720.0f

    .line 83
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v6

    .line 84
    invoke-virtual {v6}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    const v1, 0x36ee80

    div-int v7, v0, v1

    .line 85
    mul-int/lit8 v8, v7, 0x3c

    .line 90
    int-to-float v0, v8

    add-float v0, v0, p1

    sub-float/2addr v0, v5

    div-float v9, v0, v4

    .line 91
    int-to-float v0, v8

    add-float v0, v0, p2

    sub-float/2addr v0, v5

    div-float v10, v0, v4

    .line 94
    float-to-double v0, v9

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v11, v0

    .line 96
    float-to-double v0, v10

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v12, v0

    .line 98
    sub-int v0, v12, v11

    add-int/lit8 v13, v0, 0x1

    .line 101
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->s:Lo/eix;

    sget-object v1, Lo/eix;->a:Lo/eix;

    if-ne v0, v1, :cond_4

    .line 102
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->c:Lo/lh;

    sub-int v1, v12, v11

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lo/lh;->d:I

    .line 103
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->c:Lo/lh;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eil;->c:Lo/lh;

    iget v1, v1, Lo/lh;->d:I

    new-array v1, v1, [F

    iput-object v1, v0, Lo/lh;->a:[F

    .line 105
    const/4 v14, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->c:Lo/lh;

    iget v0, v0, Lo/lh;->d:I

    if-ge v14, v0, :cond_3

    .line 107
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    add-int v1, v11, v14

    int-to-float v1, v1

    mul-float/2addr v1, v4

    int-to-float v2, v8

    sub-float/2addr v1, v2

    add-float/2addr v1, v5

    aput v1, v0, v14

    .line 105
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_3
    goto/16 :goto_3

    .line 109
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->s:Lo/eix;

    sget-object v1, Lo/eix;->d:Lo/eix;

    if-ne v0, v1, :cond_7

    .line 111
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 112
    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_6

    .line 115
    add-int v0, v11, v15

    int-to-float v0, v0

    mul-float/2addr v0, v4

    int-to-float v1, v8

    sub-float/2addr v0, v1

    add-float v16, v0, v5

    .line 116
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v17

    .line 117
    move/from16 v0, v16

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 118
    move-object/from16 v0, v17

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v18

    .line 119
    invoke-static {}, Lo/eke;->c()I

    move-result v0

    move/from16 v1, v18

    if-ne v1, v0, :cond_5

    .line 120
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    :cond_5
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 124
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->c:Lo/lh;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v1

    iput v1, v0, Lo/lh;->d:I

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->c:Lo/lh;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eil;->c:Lo/lh;

    iget v1, v1, Lo/lh;->d:I

    new-array v1, v1, [F

    iput-object v1, v0, Lo/lh;->a:[F

    .line 128
    const/4 v15, 0x0

    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->c:Lo/lh;

    iget v0, v0, Lo/lh;->d:I

    if-ge v15, v0, :cond_7

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eil;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    aput v1, v0, v15

    .line 128
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    .line 134
    :cond_7
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lo/eil;->d()V

    .line 135
    return-void
.end method

.method protected d(Landroid/graphics/Canvas;FLo/nz;)V
    .locals 1

    .line 262
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    instance-of v0, v0, Lo/eio;

    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    check-cast v0, Lo/eio;

    invoke-virtual {v0}, Lo/eio;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    return-void

    .line 268
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lo/eil;->a(Landroid/graphics/Canvas;FLo/nz;)V

    .line 269
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 49
    iput p1, p0, Lo/eil;->p:I

    .line 50
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget v1, p0, Lo/eil;->p:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/lh;->b(F)V

    .line 53
    iget-object v0, p0, Lo/eil;->c:Lo/lh;

    iget v1, p0, Lo/eil;->p:I

    add-int/2addr v1, p2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/lh;->a(F)V

    .line 54
    return-void
.end method
