.class final Lo/uh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/un;

.field private b:Lo/uj;

.field private final d:Lo/qr;

.field private e:Z


# direct methods
.method constructor <init>(Lo/qr;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Lo/qr;->h()I

    move-result v2

    .line 38
    const/16 v0, 0x15

    if-lt v2, v0, :cond_0

    and-int/lit8 v0, v2, 0x3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 39
    :cond_0
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 41
    :cond_1
    iput-object p1, p0, Lo/uh;->d:Lo/qr;

    .line 42
    return-void
.end method

.method private b(III)I
    .locals 3

    .line 141
    iget-boolean v0, p0, Lo/uh;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0, p2, p1}, Lo/qr;->e(II)Z

    move-result v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0, p1, p2}, Lo/qr;->e(II)Z

    move-result v2

    .line 142
    :goto_0
    if-eqz v2, :cond_1

    shl-int/lit8 v0, p3, 0x1

    or-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    shl-int/lit8 v0, p3, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method a()Lo/un;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lo/uh;->a:Lo/un;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lo/uh;->a:Lo/un;

    return-object v0

    .line 102
    :cond_0
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v2

    .line 104
    add-int/lit8 v0, v2, -0x11

    div-int/lit8 v3, v0, 0x4

    .line 105
    const/4 v0, 0x6

    if-gt v3, v0, :cond_1

    .line 106
    invoke-static {v3}, Lo/un;->e(I)Lo/un;

    move-result-object v0

    return-object v0

    .line 110
    :cond_1
    const/4 v4, 0x0

    .line 111
    add-int/lit8 v5, v2, -0xb

    .line 112
    const/4 v6, 0x5

    :goto_0
    if-ltz v6, :cond_3

    .line 113
    add-int/lit8 v7, v2, -0x9

    :goto_1
    if-lt v7, v5, :cond_2

    .line 114
    invoke-direct {p0, v7, v6, v4}, Lo/uh;->b(III)I

    move-result v4

    .line 113
    add-int/lit8 v7, v7, -0x1

    goto :goto_1

    .line 112
    :cond_2
    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    .line 118
    :cond_3
    invoke-static {v4}, Lo/un;->b(I)Lo/un;

    move-result-object v6

    .line 119
    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lo/un;->d()I

    move-result v0

    if-ne v0, v2, :cond_4

    .line 120
    iput-object v6, p0, Lo/uh;->a:Lo/un;

    .line 121
    return-object v6

    .line 125
    :cond_4
    const/4 v4, 0x0

    .line 126
    const/4 v7, 0x5

    :goto_2
    if-ltz v7, :cond_6

    .line 127
    add-int/lit8 v8, v2, -0x9

    :goto_3
    if-lt v8, v5, :cond_5

    .line 128
    invoke-direct {p0, v7, v8, v4}, Lo/uh;->b(III)I

    move-result v4

    .line 127
    add-int/lit8 v8, v8, -0x1

    goto :goto_3

    .line 126
    :cond_5
    add-int/lit8 v7, v7, -0x1

    goto :goto_2

    .line 132
    :cond_6
    invoke-static {v4}, Lo/un;->b(I)Lo/un;

    move-result-object v6

    .line 133
    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lo/un;->d()I

    move-result v0

    if-ne v0, v2, :cond_7

    .line 134
    iput-object v6, p0, Lo/uh;->a:Lo/un;

    .line 135
    return-object v6

    .line 137
    :cond_7
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0
.end method

.method b()Lo/uj;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lo/uh;->b:Lo/uj;

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lo/uh;->b:Lo/uj;

    return-object v0

    .line 58
    :cond_0
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x6

    if-ge v3, v0, :cond_1

    .line 60
    const/16 v0, 0x8

    invoke-direct {p0, v3, v0, v2}, Lo/uh;->b(III)I

    move-result v2

    .line 59
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 63
    :cond_1
    const/4 v0, 0x7

    const/16 v1, 0x8

    invoke-direct {p0, v0, v1, v2}, Lo/uh;->b(III)I

    move-result v2

    .line 64
    const/16 v0, 0x8

    const/16 v1, 0x8

    invoke-direct {p0, v0, v1, v2}, Lo/uh;->b(III)I

    move-result v2

    .line 65
    const/16 v0, 0x8

    const/4 v1, 0x7

    invoke-direct {p0, v0, v1, v2}, Lo/uh;->b(III)I

    move-result v2

    .line 67
    const/4 v3, 0x5

    :goto_1
    if-ltz v3, :cond_2

    .line 68
    const/16 v0, 0x8

    invoke-direct {p0, v0, v3, v2}, Lo/uh;->b(III)I

    move-result v2

    .line 67
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 72
    :cond_2
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v3

    .line 73
    const/4 v4, 0x0

    .line 74
    add-int/lit8 v5, v3, -0x7

    .line 75
    add-int/lit8 v6, v3, -0x1

    :goto_2
    if-lt v6, v5, :cond_3

    .line 76
    const/16 v0, 0x8

    invoke-direct {p0, v0, v6, v4}, Lo/uh;->b(III)I

    move-result v4

    .line 75
    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    .line 78
    :cond_3
    add-int/lit8 v6, v3, -0x8

    :goto_3
    if-ge v6, v3, :cond_4

    .line 79
    const/16 v0, 0x8

    invoke-direct {p0, v6, v0, v4}, Lo/uh;->b(III)I

    move-result v4

    .line 78
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 82
    :cond_4
    invoke-static {v2, v4}, Lo/uj;->e(II)Lo/uj;

    move-result-object v0

    iput-object v0, p0, Lo/uh;->b:Lo/uj;

    .line 83
    iget-object v0, p0, Lo/uh;->b:Lo/uj;

    if-eqz v0, :cond_5

    .line 84
    iget-object v0, p0, Lo/uh;->b:Lo/uj;

    return-object v0

    .line 86
    :cond_5
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0
.end method

.method c()[B
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 155
    invoke-virtual/range {p0 .. p0}, Lo/uh;->b()Lo/uj;

    move-result-object v2

    .line 156
    invoke-virtual/range {p0 .. p0}, Lo/uh;->a()Lo/un;

    move-result-object v3

    .line 160
    invoke-virtual {v2}, Lo/uj;->c()B

    move-result v0

    invoke-static {v0}, Lo/uf;->e(I)Lo/uf;

    move-result-object v4

    .line 161
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v5

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v4, v0, v5}, Lo/uf;->b(Lo/qr;I)V

    .line 164
    invoke-virtual {v3}, Lo/un;->b()Lo/qr;

    move-result-object v6

    .line 166
    const/4 v7, 0x1

    .line 167
    invoke-virtual {v3}, Lo/un;->c()I

    move-result v0

    new-array v8, v0, [B

    .line 168
    const/4 v9, 0x0

    .line 169
    const/4 v10, 0x0

    .line 170
    const/4 v11, 0x0

    .line 172
    add-int/lit8 v12, v5, -0x1

    :goto_0
    if-lez v12, :cond_6

    .line 173
    const/4 v0, 0x6

    if-ne v12, v0, :cond_0

    .line 176
    add-int/lit8 v12, v12, -0x1

    .line 179
    :cond_0
    const/4 v13, 0x0

    :goto_1
    if-ge v13, v5, :cond_5

    .line 180
    if-eqz v7, :cond_1

    add-int/lit8 v0, v5, -0x1

    sub-int v14, v0, v13

    goto :goto_2

    :cond_1
    move v14, v13

    .line 181
    :goto_2
    const/4 v15, 0x0

    :goto_3
    const/4 v0, 0x2

    if-ge v15, v0, :cond_4

    .line 183
    sub-int v0, v12, v15

    invoke-virtual {v6, v0, v14}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 185
    add-int/lit8 v11, v11, 0x1

    .line 186
    shl-int/lit8 v10, v10, 0x1

    .line 187
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/uh;->d:Lo/qr;

    sub-int v1, v12, v15

    invoke-virtual {v0, v1, v14}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 188
    or-int/lit8 v10, v10, 0x1

    .line 191
    :cond_2
    const/16 v0, 0x8

    if-ne v11, v0, :cond_3

    .line 192
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    int-to-byte v1, v10

    aput-byte v1, v8, v0

    .line 193
    const/4 v11, 0x0

    .line 194
    const/4 v10, 0x0

    .line 181
    :cond_3
    add-int/lit8 v15, v15, 0x1

    goto :goto_3

    .line 179
    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 199
    :cond_5
    xor-int/lit8 v7, v7, 0x1

    .line 172
    add-int/lit8 v12, v12, -0x2

    goto/16 :goto_0

    .line 201
    :cond_6
    invoke-virtual {v3}, Lo/un;->c()I

    move-result v0

    if-eq v9, v0, :cond_7

    .line 202
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 204
    :cond_7
    return-object v8
.end method

.method d()V
    .locals 4

    .line 235
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 236
    add-int/lit8 v3, v2, 0x1

    :goto_1
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 237
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0, v2, v3}, Lo/qr;->e(II)Z

    move-result v0

    iget-object v1, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v1, v3, v2}, Lo/qr;->e(II)Z

    move-result v1

    if-eq v0, v1, :cond_0

    .line 238
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0, v3, v2}, Lo/qr;->d(II)V

    .line 239
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0, v2, v3}, Lo/qr;->d(II)V

    .line 236
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 235
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 243
    :cond_2
    return-void
.end method

.method e()V
    .locals 3

    .line 211
    iget-object v0, p0, Lo/uh;->b:Lo/uj;

    if-nez v0, :cond_0

    .line 212
    return-void

    .line 214
    :cond_0
    iget-object v0, p0, Lo/uh;->b:Lo/uj;

    invoke-virtual {v0}, Lo/uj;->c()B

    move-result v0

    invoke-static {v0}, Lo/uf;->e(I)Lo/uf;

    move-result-object v1

    .line 215
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v2

    .line 216
    iget-object v0, p0, Lo/uh;->d:Lo/qr;

    invoke-virtual {v1, v0, v2}, Lo/uf;->b(Lo/qr;I)V

    .line 217
    return-void
.end method

.method e(Z)V
    .locals 1

    .line 228
    const/4 v0, 0x0

    iput-object v0, p0, Lo/uh;->a:Lo/un;

    .line 229
    const/4 v0, 0x0

    iput-object v0, p0, Lo/uh;->b:Lo/uj;

    .line 230
    iput-boolean p1, p0, Lo/uh;->e:Z

    .line 231
    return-void
.end method
