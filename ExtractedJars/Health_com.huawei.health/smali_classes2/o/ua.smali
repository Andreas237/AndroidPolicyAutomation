.class public Lo/ua;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/op;


# static fields
.field private static final c:[Lo/ou;


# instance fields
.field private final a:Lo/ug;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const/4 v0, 0x0

    new-array v0, v0, [Lo/ou;

    sput-object v0, Lo/ua;->c:[Lo/ou;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Lo/ug;

    invoke-direct {v0}, Lo/ug;-><init>()V

    iput-object v0, p0, Lo/ua;->a:Lo/ug;

    return-void
.end method

.method private static c(Lo/qr;)Lo/qr;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 120
    invoke-virtual/range {p0 .. p0}, Lo/qr;->d()[I

    move-result-object v3

    .line 121
    invoke-virtual/range {p0 .. p0}, Lo/qr;->c()[I

    move-result-object v4

    .line 122
    if-eqz v3, :cond_0

    if-nez v4, :cond_1

    .line 123
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 126
    :cond_1
    move-object/from16 v0, p0

    invoke-static {v3, v0}, Lo/ua;->d([ILo/qr;)F

    move-result v5

    .line 128
    const/4 v0, 0x1

    aget v6, v3, v0

    .line 129
    const/4 v0, 0x1

    aget v7, v4, v0

    .line 130
    const/4 v0, 0x0

    aget v8, v3, v0

    .line 131
    const/4 v0, 0x0

    aget v9, v4, v0

    .line 134
    if-ge v8, v9, :cond_2

    if-lt v6, v7, :cond_3

    .line 135
    :cond_2
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 138
    :cond_3
    sub-int v0, v7, v6

    sub-int v1, v9, v8

    if-eq v0, v1, :cond_4

    .line 141
    sub-int v0, v7, v6

    add-int v9, v8, v0

    .line 144
    :cond_4
    sub-int v0, v9, v8

    add-int/lit8 v0, v0, 0x1

    int-to-float v0, v0

    div-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v10

    .line 145
    sub-int v0, v7, v6

    add-int/lit8 v0, v0, 0x1

    int-to-float v0, v0

    div-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v11

    .line 146
    if-lez v10, :cond_5

    if-gtz v11, :cond_6

    .line 147
    :cond_5
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 149
    :cond_6
    if-eq v11, v10, :cond_7

    .line 151
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 157
    :cond_7
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v5, v0

    float-to-int v12, v0

    .line 158
    add-int/2addr v6, v12

    .line 159
    add-int/2addr v8, v12

    .line 164
    add-int/lit8 v0, v10, -0x1

    int-to-float v0, v0

    mul-float/2addr v0, v5

    float-to-int v0, v0

    add-int/2addr v0, v8

    sub-int v13, v0, v9

    .line 165
    if-lez v13, :cond_9

    .line 166
    if-le v13, v12, :cond_8

    .line 168
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 170
    :cond_8
    sub-int/2addr v8, v13

    .line 173
    :cond_9
    add-int/lit8 v0, v11, -0x1

    int-to-float v0, v0

    mul-float/2addr v0, v5

    float-to-int v0, v0

    add-int/2addr v0, v6

    sub-int v14, v0, v7

    .line 174
    if-lez v14, :cond_b

    .line 175
    if-le v14, v12, :cond_a

    .line 177
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 179
    :cond_a
    sub-int/2addr v6, v14

    .line 183
    :cond_b
    new-instance v0, Lo/qr;

    move v1, v10

    move v2, v11

    invoke-direct {v0, v1, v2}, Lo/qr;-><init>(II)V

    move-object v15, v0

    .line 184
    const/16 v16, 0x0

    :goto_0
    move/from16 v0, v16

    if-ge v0, v11, :cond_e

    .line 185
    move/from16 v0, v16

    int-to-float v0, v0

    mul-float/2addr v0, v5

    float-to-int v0, v0

    add-int v17, v6, v0

    .line 186
    const/16 v18, 0x0

    :goto_1
    move/from16 v0, v18

    if-ge v0, v10, :cond_d

    .line 187
    move/from16 v0, v18

    int-to-float v0, v0

    mul-float/2addr v0, v5

    float-to-int v0, v0

    add-int/2addr v0, v8

    move-object/from16 v1, p0

    move/from16 v2, v17

    invoke-virtual {v1, v0, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 188
    move/from16 v0, v18

    move/from16 v1, v16

    invoke-virtual {v15, v0, v1}, Lo/qr;->a(II)V

    .line 186
    :cond_c
    add-int/lit8 v18, v18, 0x1

    goto :goto_1

    .line 184
    :cond_d
    add-int/lit8 v16, v16, 0x1

    goto :goto_0

    .line 192
    :cond_e
    return-object v15
.end method

.method private static d([ILo/qr;)F
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 196
    invoke-virtual {p1}, Lo/qr;->h()I

    move-result v2

    .line 197
    invoke-virtual {p1}, Lo/qr;->a()I

    move-result v3

    .line 198
    const/4 v0, 0x0

    aget v4, p0, v0

    .line 199
    const/4 v0, 0x1

    aget v5, p0, v0

    .line 200
    const/4 v6, 0x1

    .line 201
    const/4 v7, 0x0

    .line 202
    :goto_0
    if-ge v4, v3, :cond_3

    if-ge v5, v2, :cond_3

    .line 203
    invoke-virtual {p1, v4, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-eq v6, v0, :cond_2

    .line 204
    add-int/lit8 v7, v7, 0x1

    const/4 v0, 0x5

    if-ne v7, v0, :cond_0

    .line 205
    goto :goto_2

    .line 207
    :cond_0
    if-nez v6, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 209
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 210
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 212
    :cond_3
    :goto_2
    if-eq v4, v3, :cond_4

    if-ne v5, v2, :cond_5

    .line 213
    :cond_4
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 215
    :cond_5
    const/4 v0, 0x0

    aget v0, p0, v0

    sub-int v0, v4, v0

    int-to-float v0, v0

    const/high16 v1, 0x40e00000    # 7.0f

    div-float/2addr v0, v1

    return v0
.end method


# virtual methods
.method public c()V
    .locals 0

    .line 108
    return-void
.end method

.method public final e(Lo/oj;Ljava/util/Map;)Lo/or;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/oh;,
            Lo/of;
        }
    .end annotation

    .line 72
    if-eqz p2, :cond_0

    sget-object v0, Lo/og;->a:Lo/og;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {p1}, Lo/oj;->d()Lo/qr;

    move-result-object v0

    invoke-static {v0}, Lo/ua;->c(Lo/qr;)Lo/qr;

    move-result-object v5

    .line 74
    iget-object v0, p0, Lo/ua;->a:Lo/ug;

    invoke-virtual {v0, v5, p2}, Lo/ug;->e(Lo/qr;Ljava/util/Map;)Lo/qn;

    move-result-object v3

    .line 75
    sget-object v4, Lo/ua;->c:[Lo/ou;

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    new-instance v0, Lo/uq;

    invoke-virtual {p1}, Lo/oj;->d()Lo/qr;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/uq;-><init>(Lo/qr;)V

    invoke-virtual {v0, p2}, Lo/uq;->d(Ljava/util/Map;)Lo/qw;

    move-result-object v5

    .line 78
    iget-object v0, p0, Lo/ua;->a:Lo/ug;

    invoke-virtual {v5}, Lo/qw;->d()Lo/qr;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lo/ug;->e(Lo/qr;Ljava/util/Map;)Lo/qn;

    move-result-object v3

    .line 79
    invoke-virtual {v5}, Lo/qw;->c()[Lo/ou;

    move-result-object v4

    .line 83
    :goto_0
    invoke-virtual {v3}, Lo/qn;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/um;

    if-eqz v0, :cond_1

    .line 84
    invoke-virtual {v3}, Lo/qn;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/um;

    invoke-virtual {v0, v4}, Lo/um;->d([Lo/ou;)V

    .line 87
    :cond_1
    new-instance v5, Lo/or;

    invoke-virtual {v3}, Lo/qn;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lo/qn;->d()[B

    move-result-object v1

    sget-object v2, Lo/od;->p:Lo/od;

    invoke-direct {v5, v0, v1, v4, v2}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    .line 88
    invoke-virtual {v3}, Lo/qn;->e()Ljava/util/List;

    move-result-object v6

    .line 89
    if-eqz v6, :cond_2

    .line 90
    sget-object v0, Lo/oq;->c:Lo/oq;

    invoke-virtual {v5, v0, v6}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 92
    :cond_2
    invoke-virtual {v3}, Lo/qn;->a()Ljava/lang/String;

    move-result-object v7

    .line 93
    if-eqz v7, :cond_3

    .line 94
    sget-object v0, Lo/oq;->e:Lo/oq;

    invoke-virtual {v5, v0, v7}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 96
    :cond_3
    invoke-virtual {v3}, Lo/qn;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 97
    sget-object v0, Lo/oq;->f:Lo/oq;

    .line 98
    invoke-virtual {v3}, Lo/qn;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 97
    invoke-virtual {v5, v0, v1}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 99
    sget-object v0, Lo/oq;->m:Lo/oq;

    .line 100
    invoke-virtual {v3}, Lo/qn;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 99
    invoke-virtual {v5, v0, v1}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 102
    :cond_4
    return-object v5
.end method
