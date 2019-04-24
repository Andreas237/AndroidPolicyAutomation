.class final Lo/rg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo/qr;

.field private final b:Lo/qr;

.field private final e:Lo/rk;


# direct methods
.method constructor <init>(Lo/qr;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Lo/qr;->h()I

    move-result v3

    .line 37
    const/16 v0, 0x8

    if-lt v3, v0, :cond_0

    const/16 v0, 0x90

    if-gt v3, v0, :cond_0

    and-int/lit8 v0, v3, 0x1

    if-eqz v0, :cond_1

    .line 38
    :cond_0
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 41
    :cond_1
    invoke-static {p1}, Lo/rg;->e(Lo/qr;)Lo/rk;

    move-result-object v0

    iput-object v0, p0, Lo/rg;->e:Lo/rk;

    .line 42
    invoke-virtual {p0, p1}, Lo/rg;->d(Lo/qr;)Lo/qr;

    move-result-object v0

    iput-object v0, p0, Lo/rg;->a:Lo/qr;

    .line 43
    new-instance v0, Lo/qr;

    iget-object v1, p0, Lo/rg;->a:Lo/qr;

    invoke-virtual {v1}, Lo/qr;->a()I

    move-result v1

    iget-object v2, p0, Lo/rg;->a:Lo/qr;

    invoke-virtual {v2}, Lo/qr;->h()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/qr;-><init>(II)V

    iput-object v0, p0, Lo/rg;->b:Lo/qr;

    .line 44
    return-void
.end method

.method private static e(Lo/qr;)Lo/rk;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 62
    invoke-virtual {p0}, Lo/qr;->h()I

    move-result v1

    .line 63
    invoke-virtual {p0}, Lo/qr;->a()I

    move-result v2

    .line 64
    invoke-static {v1, v2}, Lo/rk;->b(II)Lo/rk;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a(IIII)Z
    .locals 2

    .line 156
    if-gez p1, :cond_0

    .line 157
    add-int/2addr p1, p3

    .line 158
    add-int/lit8 v0, p3, 0x4

    and-int/lit8 v0, v0, 0x7

    rsub-int/lit8 v0, v0, 0x4

    add-int/2addr p2, v0

    .line 160
    :cond_0
    if-gez p2, :cond_1

    .line 161
    add-int/2addr p2, p4

    .line 162
    add-int/lit8 v0, p4, 0x4

    and-int/lit8 v0, v0, 0x7

    rsub-int/lit8 v0, v0, 0x4

    add-int/2addr p1, v0

    .line 164
    :cond_1
    iget-object v0, p0, Lo/rg;->b:Lo/qr;

    invoke-virtual {v0, p2, p1}, Lo/qr;->a(II)V

    .line 165
    iget-object v0, p0, Lo/rg;->a:Lo/qr;

    invoke-virtual {v0, p2, p1}, Lo/qr;->e(II)Z

    move-result v0

    return v0
.end method

.method b(II)I
    .locals 3

    .line 225
    const/4 v2, 0x0

    .line 226
    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    const/4 v2, 0x1

    .line 229
    :cond_0
    shl-int/lit8 v2, v2, 0x1

    .line 230
    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    or-int/lit8 v2, v2, 0x1

    .line 233
    :cond_1
    shl-int/lit8 v2, v2, 0x1

    .line 234
    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 235
    or-int/lit8 v2, v2, 0x1

    .line 237
    :cond_2
    shl-int/lit8 v2, v2, 0x1

    .line 238
    add-int/lit8 v0, p2, -0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 239
    or-int/lit8 v2, v2, 0x1

    .line 241
    :cond_3
    shl-int/lit8 v2, v2, 0x1

    .line 242
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 243
    or-int/lit8 v2, v2, 0x1

    .line 245
    :cond_4
    shl-int/lit8 v2, v2, 0x1

    .line 246
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 247
    or-int/lit8 v2, v2, 0x1

    .line 249
    :cond_5
    shl-int/lit8 v2, v2, 0x1

    .line 250
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 251
    or-int/lit8 v2, v2, 0x1

    .line 253
    :cond_6
    shl-int/lit8 v2, v2, 0x1

    .line 254
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 255
    or-int/lit8 v2, v2, 0x1

    .line 257
    :cond_7
    return v2
.end method

.method b(IIII)I
    .locals 3

    .line 180
    const/4 v2, 0x0

    .line 181
    add-int/lit8 v0, p1, -0x2

    add-int/lit8 v1, p2, -0x2

    invoke-virtual {p0, v0, v1, p3, p4}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    const/4 v2, 0x1

    .line 184
    :cond_0
    shl-int/lit8 v2, v2, 0x1

    .line 185
    add-int/lit8 v0, p1, -0x2

    add-int/lit8 v1, p2, -0x1

    invoke-virtual {p0, v0, v1, p3, p4}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    or-int/lit8 v2, v2, 0x1

    .line 188
    :cond_1
    shl-int/lit8 v2, v2, 0x1

    .line 189
    add-int/lit8 v0, p1, -0x1

    add-int/lit8 v1, p2, -0x2

    invoke-virtual {p0, v0, v1, p3, p4}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 190
    or-int/lit8 v2, v2, 0x1

    .line 192
    :cond_2
    shl-int/lit8 v2, v2, 0x1

    .line 193
    add-int/lit8 v0, p1, -0x1

    add-int/lit8 v1, p2, -0x1

    invoke-virtual {p0, v0, v1, p3, p4}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 194
    or-int/lit8 v2, v2, 0x1

    .line 196
    :cond_3
    shl-int/lit8 v2, v2, 0x1

    .line 197
    add-int/lit8 v0, p1, -0x1

    invoke-virtual {p0, v0, p2, p3, p4}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 198
    or-int/lit8 v2, v2, 0x1

    .line 200
    :cond_4
    shl-int/lit8 v2, v2, 0x1

    .line 201
    add-int/lit8 v0, p2, -0x2

    invoke-virtual {p0, p1, v0, p3, p4}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 202
    or-int/lit8 v2, v2, 0x1

    .line 204
    :cond_5
    shl-int/lit8 v2, v2, 0x1

    .line 205
    add-int/lit8 v0, p2, -0x1

    invoke-virtual {p0, p1, v0, p3, p4}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 206
    or-int/lit8 v2, v2, 0x1

    .line 208
    :cond_6
    shl-int/lit8 v2, v2, 0x1

    .line 209
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 210
    or-int/lit8 v2, v2, 0x1

    .line 212
    :cond_7
    return v2
.end method

.method c(II)I
    .locals 3

    .line 315
    const/4 v2, 0x0

    .line 316
    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    const/4 v2, 0x1

    .line 319
    :cond_0
    shl-int/lit8 v2, v2, 0x1

    .line 320
    add-int/lit8 v0, p1, -0x1

    add-int/lit8 v1, p2, -0x1

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    or-int/lit8 v2, v2, 0x1

    .line 323
    :cond_1
    shl-int/lit8 v2, v2, 0x1

    .line 324
    add-int/lit8 v0, p2, -0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 325
    or-int/lit8 v2, v2, 0x1

    .line 327
    :cond_2
    shl-int/lit8 v2, v2, 0x1

    .line 328
    add-int/lit8 v0, p2, -0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 329
    or-int/lit8 v2, v2, 0x1

    .line 331
    :cond_3
    shl-int/lit8 v2, v2, 0x1

    .line 332
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 333
    or-int/lit8 v2, v2, 0x1

    .line 335
    :cond_4
    shl-int/lit8 v2, v2, 0x1

    .line 336
    add-int/lit8 v0, p2, -0x3

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 337
    or-int/lit8 v2, v2, 0x1

    .line 339
    :cond_5
    shl-int/lit8 v2, v2, 0x1

    .line 340
    add-int/lit8 v0, p2, -0x2

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 341
    or-int/lit8 v2, v2, 0x1

    .line 343
    :cond_6
    shl-int/lit8 v2, v2, 0x1

    .line 344
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 345
    or-int/lit8 v2, v2, 0x1

    .line 347
    :cond_7
    return v2
.end method

.method c()[B
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lo/rg;->e:Lo/rk;

    invoke-virtual {v0}, Lo/rk;->g()I

    move-result v0

    new-array v2, v0, [B

    .line 78
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x4

    .line 81
    const/4 v5, 0x0

    .line 83
    iget-object v0, p0, Lo/rg;->a:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v6

    .line 84
    iget-object v0, p0, Lo/rg;->a:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v7

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    const/4 v10, 0x0

    .line 89
    const/4 v11, 0x0

    .line 94
    :cond_0
    if-ne v4, v6, :cond_1

    if-nez v5, :cond_1

    if-nez v8, :cond_1

    .line 95
    move v0, v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v6, v7}, Lo/rg;->b(II)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    .line 96
    add-int/lit8 v4, v4, -0x2

    .line 97
    add-int/lit8 v5, v5, 0x2

    .line 98
    const/4 v8, 0x1

    goto/16 :goto_0

    .line 99
    :cond_1
    add-int/lit8 v0, v6, -0x2

    if-ne v4, v0, :cond_2

    if-nez v5, :cond_2

    and-int/lit8 v0, v7, 0x3

    if-eqz v0, :cond_2

    if-nez v9, :cond_2

    .line 100
    move v0, v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v6, v7}, Lo/rg;->e(II)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    .line 101
    add-int/lit8 v4, v4, -0x2

    .line 102
    add-int/lit8 v5, v5, 0x2

    .line 103
    const/4 v9, 0x1

    goto/16 :goto_0

    .line 104
    :cond_2
    add-int/lit8 v0, v6, 0x4

    if-ne v4, v0, :cond_3

    const/4 v0, 0x2

    if-ne v5, v0, :cond_3

    and-int/lit8 v0, v7, 0x7

    if-nez v0, :cond_3

    if-nez v10, :cond_3

    .line 105
    move v0, v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v6, v7}, Lo/rg;->c(II)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    .line 106
    add-int/lit8 v4, v4, -0x2

    .line 107
    add-int/lit8 v5, v5, 0x2

    .line 108
    const/4 v10, 0x1

    goto/16 :goto_0

    .line 109
    :cond_3
    add-int/lit8 v0, v6, -0x2

    if-ne v4, v0, :cond_4

    if-nez v5, :cond_4

    and-int/lit8 v0, v7, 0x7

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    if-nez v11, :cond_4

    .line 110
    move v0, v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v6, v7}, Lo/rg;->d(II)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    .line 111
    add-int/lit8 v4, v4, -0x2

    .line 112
    add-int/lit8 v5, v5, 0x2

    .line 113
    const/4 v11, 0x1

    goto/16 :goto_0

    .line 117
    :cond_4
    if-ge v4, v6, :cond_5

    if-ltz v5, :cond_5

    iget-object v0, p0, Lo/rg;->b:Lo/qr;

    invoke-virtual {v0, v5, v4}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_5

    .line 118
    move v0, v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v4, v5, v6, v7}, Lo/rg;->b(IIII)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    .line 120
    :cond_5
    add-int/lit8 v4, v4, -0x2

    .line 121
    add-int/lit8 v5, v5, 0x2

    .line 122
    if-ltz v4, :cond_6

    if-lt v5, v7, :cond_4

    .line 123
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 124
    add-int/lit8 v5, v5, 0x3

    .line 128
    :cond_7
    if-ltz v4, :cond_8

    if-ge v5, v7, :cond_8

    iget-object v0, p0, Lo/rg;->b:Lo/qr;

    invoke-virtual {v0, v5, v4}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_8

    .line 129
    move v0, v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v4, v5, v6, v7}, Lo/rg;->b(IIII)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    .line 131
    :cond_8
    add-int/lit8 v4, v4, 0x2

    .line 132
    add-int/lit8 v5, v5, -0x2

    .line 133
    if-ge v4, v6, :cond_9

    if-gez v5, :cond_7

    .line 134
    :cond_9
    add-int/lit8 v4, v4, 0x3

    .line 135
    add-int/lit8 v5, v5, 0x1

    .line 137
    :goto_0
    if-lt v4, v6, :cond_0

    if-lt v5, v7, :cond_0

    .line 139
    iget-object v0, p0, Lo/rg;->e:Lo/rk;

    invoke-virtual {v0}, Lo/rk;->g()I

    move-result v0

    if-eq v3, v0, :cond_a

    .line 140
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 142
    :cond_a
    return-object v2
.end method

.method d(II)I
    .locals 3

    .line 360
    const/4 v2, 0x0

    .line 361
    add-int/lit8 v0, p1, -0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 362
    const/4 v2, 0x1

    .line 364
    :cond_0
    shl-int/lit8 v2, v2, 0x1

    .line 365
    add-int/lit8 v0, p1, -0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    or-int/lit8 v2, v2, 0x1

    .line 368
    :cond_1
    shl-int/lit8 v2, v2, 0x1

    .line 369
    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 370
    or-int/lit8 v2, v2, 0x1

    .line 372
    :cond_2
    shl-int/lit8 v2, v2, 0x1

    .line 373
    add-int/lit8 v0, p2, -0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 374
    or-int/lit8 v2, v2, 0x1

    .line 376
    :cond_3
    shl-int/lit8 v2, v2, 0x1

    .line 377
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 378
    or-int/lit8 v2, v2, 0x1

    .line 380
    :cond_4
    shl-int/lit8 v2, v2, 0x1

    .line 381
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 382
    or-int/lit8 v2, v2, 0x1

    .line 384
    :cond_5
    shl-int/lit8 v2, v2, 0x1

    .line 385
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 386
    or-int/lit8 v2, v2, 0x1

    .line 388
    :cond_6
    shl-int/lit8 v2, v2, 0x1

    .line 389
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 390
    or-int/lit8 v2, v2, 0x1

    .line 392
    :cond_7
    return v2
.end method

.method d(Lo/qr;)Lo/qr;
    .locals 22

    .line 403
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/rg;->e:Lo/rk;

    invoke-virtual {v0}, Lo/rk;->d()I

    move-result v3

    .line 404
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/rg;->e:Lo/rk;

    invoke-virtual {v0}, Lo/rk;->e()I

    move-result v4

    .line 406
    invoke-virtual/range {p1 .. p1}, Lo/qr;->h()I

    move-result v0

    if-eq v0, v3, :cond_0

    .line 407
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Dimension of bitMarix must match the version size"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 410
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/rg;->e:Lo/rk;

    invoke-virtual {v0}, Lo/rk;->a()I

    move-result v5

    .line 411
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/rg;->e:Lo/rk;

    invoke-virtual {v0}, Lo/rk;->c()I

    move-result v6

    .line 413
    div-int v7, v3, v5

    .line 414
    div-int v8, v4, v6

    .line 416
    mul-int v9, v7, v5

    .line 417
    mul-int v10, v8, v6

    .line 419
    new-instance v11, Lo/qr;

    invoke-direct {v11, v10, v9}, Lo/qr;-><init>(II)V

    .line 420
    const/4 v12, 0x0

    :goto_0
    if-ge v12, v7, :cond_5

    .line 421
    mul-int v13, v12, v5

    .line 422
    const/4 v14, 0x0

    :goto_1
    if-ge v14, v8, :cond_4

    .line 423
    mul-int v15, v14, v6

    .line 424
    const/16 v16, 0x0

    :goto_2
    move/from16 v0, v16

    if-ge v0, v5, :cond_3

    .line 425
    add-int/lit8 v0, v5, 0x2

    mul-int/2addr v0, v12

    add-int/lit8 v0, v0, 0x1

    add-int v17, v0, v16

    .line 426
    add-int v18, v13, v16

    .line 427
    const/16 v19, 0x0

    :goto_3
    move/from16 v0, v19

    if-ge v0, v6, :cond_2

    .line 428
    add-int/lit8 v0, v6, 0x2

    mul-int/2addr v0, v14

    add-int/lit8 v0, v0, 0x1

    add-int v20, v0, v19

    .line 429
    move-object/from16 v0, p1

    move/from16 v1, v20

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 430
    add-int v21, v15, v19

    .line 431
    move/from16 v0, v21

    move/from16 v1, v18

    invoke-virtual {v11, v0, v1}, Lo/qr;->a(II)V

    .line 427
    :cond_1
    add-int/lit8 v19, v19, 0x1

    goto :goto_3

    .line 424
    :cond_2
    add-int/lit8 v16, v16, 0x1

    goto :goto_2

    .line 422
    :cond_3
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 420
    :cond_4
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 437
    :cond_5
    return-object v11
.end method

.method e(II)I
    .locals 3

    .line 270
    const/4 v2, 0x0

    .line 271
    add-int/lit8 v0, p1, -0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    const/4 v2, 0x1

    .line 274
    :cond_0
    shl-int/lit8 v2, v2, 0x1

    .line 275
    add-int/lit8 v0, p1, -0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 276
    or-int/lit8 v2, v2, 0x1

    .line 278
    :cond_1
    shl-int/lit8 v2, v2, 0x1

    .line 279
    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 280
    or-int/lit8 v2, v2, 0x1

    .line 282
    :cond_2
    shl-int/lit8 v2, v2, 0x1

    .line 283
    add-int/lit8 v0, p2, -0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 284
    or-int/lit8 v2, v2, 0x1

    .line 286
    :cond_3
    shl-int/lit8 v2, v2, 0x1

    .line 287
    add-int/lit8 v0, p2, -0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 288
    or-int/lit8 v2, v2, 0x1

    .line 290
    :cond_4
    shl-int/lit8 v2, v2, 0x1

    .line 291
    add-int/lit8 v0, p2, -0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 292
    or-int/lit8 v2, v2, 0x1

    .line 294
    :cond_5
    shl-int/lit8 v2, v2, 0x1

    .line 295
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 296
    or-int/lit8 v2, v2, 0x1

    .line 298
    :cond_6
    shl-int/lit8 v2, v2, 0x1

    .line 299
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, p1, p2}, Lo/rg;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 300
    or-int/lit8 v2, v2, 0x1

    .line 302
    :cond_7
    return v2
.end method

.method e()Lo/rk;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/rg;->e:Lo/rk;

    return-object v0
.end method
