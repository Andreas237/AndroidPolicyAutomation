.class final Lo/th;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo/ta;

.field private final b:Ljava/lang/StringBuilder;

.field private final e:Lo/qm;


# direct methods
.method constructor <init>(Lo/qm;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Lo/ta;

    invoke-direct {v0}, Lo/ta;-><init>()V

    iput-object v0, p0, Lo/th;->a:Lo/ta;

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    .line 44
    iput-object p1, p0, Lo/th;->e:Lo/qm;

    .line 45
    return-void
.end method

.method private a()Lo/tb;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 191
    :goto_0
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->a(I)Lo/te;

    move-result-object v2

    .line 193
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v2}, Lo/te;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ta;->e(I)V

    .line 195
    invoke-virtual {v2}, Lo/te;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    new-instance v3, Lo/tj;

    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    iget-object v1, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lo/tj;-><init>(ILjava/lang/String;)V

    .line 197
    new-instance v0, Lo/tb;

    const/4 v1, 0x1

    invoke-direct {v0, v3, v1}, Lo/tb;-><init>(Lo/tj;Z)V

    return-object v0

    .line 199
    :cond_0
    iget-object v0, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lo/te;->b()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 200
    goto :goto_0

    .line 202
    :cond_1
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->h(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/ta;->c(I)V

    .line 204
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->b()V

    goto :goto_2

    .line 205
    :cond_2
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->g(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 206
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 207
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/ta;->c(I)V

    goto :goto_1

    .line 209
    :cond_3
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ta;->e(I)V

    .line 212
    :goto_1
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->d()V

    .line 214
    :cond_4
    :goto_2
    new-instance v0, Lo/tb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/tb;-><init>(Z)V

    return-object v0
.end method

.method private a(I)Lo/te;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 274
    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v4

    .line 275
    const/16 v0, 0xf

    if-ne v4, v0, :cond_0

    .line 276
    new-instance v0, Lo/te;

    add-int/lit8 v1, p1, 0x5

    const/16 v2, 0x24

    invoke-direct {v0, v1, v2}, Lo/te;-><init>(IC)V

    return-object v0

    .line 279
    :cond_0
    const/4 v0, 0x5

    if-lt v4, v0, :cond_1

    const/16 v0, 0xf

    if-ge v4, v0, :cond_1

    .line 280
    new-instance v0, Lo/te;

    add-int/lit8 v1, p1, 0x5

    add-int/lit8 v2, v4, 0x30

    add-int/lit8 v2, v2, -0x5

    int-to-char v2, v2

    invoke-direct {v0, v1, v2}, Lo/te;-><init>(IC)V

    return-object v0

    .line 283
    :cond_1
    const/4 v0, 0x7

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v5

    .line 285
    const/16 v0, 0x40

    if-lt v5, v0, :cond_2

    const/16 v0, 0x5a

    if-ge v5, v0, :cond_2

    .line 286
    new-instance v0, Lo/te;

    add-int/lit8 v1, p1, 0x7

    add-int/lit8 v2, v5, 0x1

    int-to-char v2, v2

    invoke-direct {v0, v1, v2}, Lo/te;-><init>(IC)V

    return-object v0

    .line 289
    :cond_2
    const/16 v0, 0x5a

    if-lt v5, v0, :cond_3

    const/16 v0, 0x74

    if-ge v5, v0, :cond_3

    .line 290
    new-instance v0, Lo/te;

    add-int/lit8 v1, p1, 0x7

    add-int/lit8 v2, v5, 0x7

    int-to-char v2, v2

    invoke-direct {v0, v1, v2}, Lo/te;-><init>(IC)V

    return-object v0

    .line 293
    :cond_3
    const/16 v0, 0x8

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v6

    .line 295
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_0

    .line 297
    :pswitch_0
    const/16 v7, 0x21

    .line 298
    goto/16 :goto_1

    .line 300
    :pswitch_1
    const/16 v7, 0x22

    .line 301
    goto/16 :goto_1

    .line 303
    :pswitch_2
    const/16 v7, 0x25

    .line 304
    goto/16 :goto_1

    .line 306
    :pswitch_3
    const/16 v7, 0x26

    .line 307
    goto :goto_1

    .line 309
    :pswitch_4
    const/16 v7, 0x27

    .line 310
    goto :goto_1

    .line 312
    :pswitch_5
    const/16 v7, 0x28

    .line 313
    goto :goto_1

    .line 315
    :pswitch_6
    const/16 v7, 0x29

    .line 316
    goto :goto_1

    .line 318
    :pswitch_7
    const/16 v7, 0x2a

    .line 319
    goto :goto_1

    .line 321
    :pswitch_8
    const/16 v7, 0x2b

    .line 322
    goto :goto_1

    .line 324
    :pswitch_9
    const/16 v7, 0x2c

    .line 325
    goto :goto_1

    .line 327
    :pswitch_a
    const/16 v7, 0x2d

    .line 328
    goto :goto_1

    .line 330
    :pswitch_b
    const/16 v7, 0x2e

    .line 331
    goto :goto_1

    .line 333
    :pswitch_c
    const/16 v7, 0x2f

    .line 334
    goto :goto_1

    .line 336
    :pswitch_d
    const/16 v7, 0x3a

    .line 337
    goto :goto_1

    .line 339
    :pswitch_e
    const/16 v7, 0x3b

    .line 340
    goto :goto_1

    .line 342
    :pswitch_f
    const/16 v7, 0x3c

    .line 343
    goto :goto_1

    .line 345
    :pswitch_10
    const/16 v7, 0x3d

    .line 346
    goto :goto_1

    .line 348
    :pswitch_11
    const/16 v7, 0x3e

    .line 349
    goto :goto_1

    .line 351
    :pswitch_12
    const/16 v7, 0x3f

    .line 352
    goto :goto_1

    .line 354
    :pswitch_13
    const/16 v7, 0x5f

    .line 355
    goto :goto_1

    .line 357
    :pswitch_14
    const/16 v7, 0x20

    .line 358
    goto :goto_1

    .line 360
    :goto_0
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 362
    :goto_1
    new-instance v0, Lo/te;

    add-int/lit8 v1, p1, 0x8

    invoke-direct {v0, v1, v7}, Lo/te;-><init>(IC)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0xe8
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
    .end packed-switch
.end method

.method private b()Lo/tb;
    .locals 4

    .line 218
    :goto_0
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->k(I)Lo/te;

    move-result-object v2

    .line 220
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v2}, Lo/te;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ta;->e(I)V

    .line 222
    invoke-virtual {v2}, Lo/te;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    new-instance v3, Lo/tj;

    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    iget-object v1, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lo/tj;-><init>(ILjava/lang/String;)V

    .line 224
    new-instance v0, Lo/tb;

    const/4 v1, 0x1

    invoke-direct {v0, v3, v1}, Lo/tb;-><init>(Lo/tj;Z)V

    return-object v0

    .line 227
    :cond_0
    iget-object v0, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lo/te;->b()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 228
    goto :goto_0

    .line 230
    :cond_1
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->h(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 231
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/ta;->c(I)V

    .line 232
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->b()V

    goto :goto_2

    .line 233
    :cond_2
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->g(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 234
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 235
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/ta;->c(I)V

    goto :goto_1

    .line 237
    :cond_3
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ta;->e(I)V

    .line 240
    :goto_1
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->i()V

    .line 242
    :cond_4
    :goto_2
    new-instance v0, Lo/tb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/tb;-><init>(Z)V

    return-object v0
.end method

.method private b(I)Z
    .locals 5

    .line 246
    add-int/lit8 v0, p1, 0x5

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 247
    const/4 v0, 0x0

    return v0

    .line 250
    :cond_0
    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v2

    .line 251
    const/4 v0, 0x5

    if-lt v2, v0, :cond_1

    const/16 v0, 0x10

    if-ge v2, v0, :cond_1

    .line 252
    const/4 v0, 0x1

    return v0

    .line 255
    :cond_1
    add-int/lit8 v0, p1, 0x7

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_2

    .line 256
    const/4 v0, 0x0

    return v0

    .line 259
    :cond_2
    const/4 v0, 0x7

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v3

    .line 260
    const/16 v0, 0x40

    if-lt v3, v0, :cond_3

    const/16 v0, 0x74

    if-ge v3, v0, :cond_3

    .line 261
    const/4 v0, 0x1

    return v0

    .line 264
    :cond_3
    add-int/lit8 v0, p1, 0x8

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_4

    .line 265
    const/4 v0, 0x0

    return v0

    .line 268
    :cond_4
    const/16 v0, 0x8

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v4

    .line 269
    const/16 v0, 0xe8

    if-lt v4, v0, :cond_5

    const/16 v0, 0xfd

    if-ge v4, v0, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static c(Lo/qm;II)I
    .locals 4

    .line 108
    const/4 v2, 0x0

    .line 109
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p2, :cond_1

    .line 110
    add-int v0, p1, v3

    invoke-virtual {p0, v0}, Lo/qm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    sub-int v0, p2, v3

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    shl-int v0, v1, v0

    or-int/2addr v2, v0

    .line 109
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 115
    :cond_1
    return v2
.end method

.method private c()Lo/tj;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 138
    :cond_0
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v3

    .line 140
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 141
    invoke-direct {p0}, Lo/th;->b()Lo/tb;

    move-result-object v2

    .line 142
    invoke-virtual {v2}, Lo/tb;->c()Z

    move-result v1

    goto :goto_0

    .line 143
    :cond_1
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 144
    invoke-direct {p0}, Lo/th;->a()Lo/tb;

    move-result-object v2

    .line 145
    invoke-virtual {v2}, Lo/tb;->c()Z

    move-result v1

    goto :goto_0

    .line 147
    :cond_2
    invoke-direct {p0}, Lo/th;->d()Lo/tb;

    move-result-object v2

    .line 148
    invoke-virtual {v2}, Lo/tb;->c()Z

    move-result v1

    .line 151
    :goto_0
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    if-eq v3, v0, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 152
    :goto_1
    if-nez v4, :cond_4

    if-nez v1, :cond_4

    .line 153
    goto :goto_2

    .line 155
    :cond_4
    if-eqz v1, :cond_0

    .line 157
    :goto_2
    invoke-virtual {v2}, Lo/tb;->b()Lo/tj;

    move-result-object v0

    return-object v0
.end method

.method private c(I)Z
    .locals 4

    .line 366
    add-int/lit8 v0, p1, 0x5

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 367
    const/4 v0, 0x0

    return v0

    .line 371
    :cond_0
    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v2

    .line 372
    const/4 v0, 0x5

    if-lt v2, v0, :cond_1

    const/16 v0, 0x10

    if-ge v2, v0, :cond_1

    .line 373
    const/4 v0, 0x1

    return v0

    .line 376
    :cond_1
    add-int/lit8 v0, p1, 0x6

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_2

    .line 377
    const/4 v0, 0x0

    return v0

    .line 380
    :cond_2
    const/4 v0, 0x6

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v3

    .line 381
    const/16 v0, 0x10

    if-lt v3, v0, :cond_3

    const/16 v0, 0x3f

    if-ge v3, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d()Lo/tb;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 161
    :goto_0
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->d(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 162
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->e(I)Lo/ti;

    move-result-object v3

    .line 163
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v3}, Lo/ti;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ta;->e(I)V

    .line 165
    invoke-virtual {v3}, Lo/ti;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    invoke-virtual {v3}, Lo/ti;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    new-instance v4, Lo/tj;

    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    iget-object v1, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lo/tj;-><init>(ILjava/lang/String;)V

    goto :goto_1

    .line 170
    :cond_0
    new-instance v4, Lo/tj;

    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    iget-object v1, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lo/ti;->c()I

    move-result v2

    invoke-direct {v4, v0, v1, v2}, Lo/tj;-><init>(ILjava/lang/String;I)V

    .line 172
    :goto_1
    new-instance v0, Lo/tb;

    const/4 v1, 0x1

    invoke-direct {v0, v4, v1}, Lo/tb;-><init>(Lo/tj;Z)V

    return-object v0

    .line 174
    :cond_1
    iget-object v0, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lo/ti;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    invoke-virtual {v3}, Lo/ti;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    new-instance v4, Lo/tj;

    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    iget-object v1, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lo/tj;-><init>(ILjava/lang/String;)V

    .line 178
    new-instance v0, Lo/tb;

    const/4 v1, 0x1

    invoke-direct {v0, v4, v1}, Lo/tb;-><init>(Lo/tj;Z)V

    return-object v0

    .line 180
    :cond_2
    iget-object v0, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lo/ti;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    goto/16 :goto_0

    .line 183
    :cond_3
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/th;->f(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 184
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0}, Lo/ta;->d()V

    .line 185
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/ta;->c(I)V

    .line 187
    :cond_4
    new-instance v0, Lo/tb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/tb;-><init>(Z)V

    return-object v0
.end method

.method private d(I)Z
    .locals 3

    .line 74
    add-int/lit8 v0, p1, 0x7

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 75
    add-int/lit8 v0, p1, 0x4

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 78
    :cond_1
    move v2, p1

    :goto_1
    add-int/lit8 v0, p1, 0x3

    if-ge v2, v0, :cond_3

    .line 79
    iget-object v0, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v0, v2}, Lo/qm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 80
    const/4 v0, 0x1

    return v0

    .line 78
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 84
    :cond_3
    iget-object v0, p0, Lo/th;->e:Lo/qm;

    add-int/lit8 v1, p1, 0x3

    invoke-virtual {v0, v1}, Lo/qm;->d(I)Z

    move-result v0

    return v0
.end method

.method private e(I)Lo/ti;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 88
    add-int/lit8 v0, p1, 0x7

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 89
    const/4 v0, 0x4

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v4

    .line 90
    if-nez v4, :cond_0

    .line 91
    new-instance v0, Lo/ti;

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    const/16 v2, 0xa

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lo/ti;-><init>(III)V

    return-object v0

    .line 93
    :cond_0
    new-instance v0, Lo/ti;

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    add-int/lit8 v2, v4, -0x1

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lo/ti;-><init>(III)V

    return-object v0

    .line 95
    :cond_1
    const/4 v0, 0x7

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v4

    .line 97
    add-int/lit8 v0, v4, -0x8

    div-int/lit8 v5, v0, 0xb

    .line 98
    add-int/lit8 v0, v4, -0x8

    rem-int/lit8 v6, v0, 0xb

    .line 100
    new-instance v0, Lo/ti;

    add-int/lit8 v1, p1, 0x7

    invoke-direct {v0, v1, v5, v6}, Lo/ti;-><init>(III)V

    return-object v0
.end method

.method private f(I)Z
    .locals 3

    .line 458
    add-int/lit8 v0, p1, 0x1

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 459
    const/4 v0, 0x0

    return v0

    .line 462
    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge v2, v0, :cond_2

    add-int v0, v2, p1

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 463
    iget-object v0, p0, Lo/th;->e:Lo/qm;

    add-int v1, p1, v2

    invoke-virtual {v0, v1}, Lo/qm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 464
    const/4 v0, 0x0

    return v0

    .line 462
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 467
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private g(I)Z
    .locals 3

    .line 424
    add-int/lit8 v0, p1, 0x1

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 425
    const/4 v0, 0x0

    return v0

    .line 428
    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v0, 0x5

    if-ge v2, v0, :cond_3

    add-int v0, v2, p1

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 429
    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 430
    iget-object v0, p0, Lo/th;->e:Lo/qm;

    add-int/lit8 v1, p1, 0x2

    invoke-virtual {v0, v1}, Lo/qm;->d(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 431
    const/4 v0, 0x0

    return v0

    .line 433
    :cond_1
    iget-object v0, p0, Lo/th;->e:Lo/qm;

    add-int v1, p1, v2

    invoke-virtual {v0, v1}, Lo/qm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 434
    const/4 v0, 0x0

    return v0

    .line 428
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 438
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private h(I)Z
    .locals 3

    .line 443
    add-int/lit8 v0, p1, 0x3

    iget-object v1, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v1}, Lo/qm;->d()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 444
    const/4 v0, 0x0

    return v0

    .line 447
    :cond_0
    move v2, p1

    :goto_0
    add-int/lit8 v0, p1, 0x3

    if-ge v2, v0, :cond_2

    .line 448
    iget-object v0, p0, Lo/th;->e:Lo/qm;

    invoke-virtual {v0, v2}, Lo/qm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 449
    const/4 v0, 0x0

    return v0

    .line 447
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 452
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private k(I)Lo/te;
    .locals 7

    .line 385
    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v4

    .line 386
    const/16 v0, 0xf

    if-ne v4, v0, :cond_0

    .line 387
    new-instance v0, Lo/te;

    add-int/lit8 v1, p1, 0x5

    const/16 v2, 0x24

    invoke-direct {v0, v1, v2}, Lo/te;-><init>(IC)V

    return-object v0

    .line 390
    :cond_0
    const/4 v0, 0x5

    if-lt v4, v0, :cond_1

    const/16 v0, 0xf

    if-ge v4, v0, :cond_1

    .line 391
    new-instance v0, Lo/te;

    add-int/lit8 v1, p1, 0x5

    add-int/lit8 v2, v4, 0x30

    add-int/lit8 v2, v2, -0x5

    int-to-char v2, v2

    invoke-direct {v0, v1, v2}, Lo/te;-><init>(IC)V

    return-object v0

    .line 394
    :cond_1
    const/4 v0, 0x6

    invoke-virtual {p0, p1, v0}, Lo/th;->d(II)I

    move-result v5

    .line 396
    const/16 v0, 0x20

    if-lt v5, v0, :cond_2

    const/16 v0, 0x3a

    if-ge v5, v0, :cond_2

    .line 397
    new-instance v0, Lo/te;

    add-int/lit8 v1, p1, 0x6

    add-int/lit8 v2, v5, 0x21

    int-to-char v2, v2

    invoke-direct {v0, v1, v2}, Lo/te;-><init>(IC)V

    return-object v0

    .line 401
    :cond_2
    packed-switch v5, :pswitch_data_0

    goto :goto_0

    .line 403
    :pswitch_0
    const/16 v6, 0x2a

    .line 404
    goto :goto_1

    .line 406
    :pswitch_1
    const/16 v6, 0x2c

    .line 407
    goto :goto_1

    .line 409
    :pswitch_2
    const/16 v6, 0x2d

    .line 410
    goto :goto_1

    .line 412
    :pswitch_3
    const/16 v6, 0x2e

    .line 413
    goto :goto_1

    .line 415
    :pswitch_4
    const/16 v6, 0x2f

    .line 416
    goto :goto_1

    .line 418
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Decoding invalid alphanumeric value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 420
    :goto_1
    new-instance v0, Lo/te;

    add-int/lit8 v1, p1, 0x6

    invoke-direct {v0, v1, v6}, Lo/te;-><init>(IC)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3a
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method c(Ljava/lang/StringBuilder;I)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 48
    move v1, p2

    .line 49
    const/4 v2, 0x0

    .line 51
    :goto_0
    invoke-virtual {p0, v1, v2}, Lo/th;->d(ILjava/lang/String;)Lo/tj;

    move-result-object v3

    .line 52
    invoke-virtual {v3}, Lo/tj;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/tf;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    :cond_0
    invoke-virtual {v3}, Lo/tj;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    invoke-virtual {v3}, Lo/tj;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 59
    :cond_1
    const/4 v2, 0x0

    .line 62
    :goto_1
    invoke-virtual {v3}, Lo/tj;->g()I

    move-result v0

    if-ne v1, v0, :cond_2

    .line 63
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v3}, Lo/tj;->g()I

    move-result v1

    .line 66
    goto :goto_0

    .line 68
    :goto_2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method d(II)I
    .locals 1

    .line 104
    iget-object v0, p0, Lo/th;->e:Lo/qm;

    invoke-static {v0, p1, p2}, Lo/th;->c(Lo/qm;II)I

    move-result v0

    return v0
.end method

.method d(ILjava/lang/String;)Lo/tj;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 121
    if-eqz p2, :cond_0

    .line 122
    iget-object v0, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    :cond_0
    iget-object v0, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v0, p1}, Lo/ta;->e(I)V

    .line 127
    invoke-direct {p0}, Lo/th;->c()Lo/tj;

    move-result-object v4

    .line 128
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lo/tj;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    new-instance v0, Lo/tj;

    iget-object v1, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v1}, Lo/ta;->c()I

    move-result v1

    iget-object v2, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lo/tj;->e()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/tj;-><init>(ILjava/lang/String;I)V

    return-object v0

    .line 131
    :cond_1
    new-instance v0, Lo/tj;

    iget-object v1, p0, Lo/th;->a:Lo/ta;

    invoke-virtual {v1}, Lo/ta;->c()I

    move-result v1

    iget-object v2, p0, Lo/th;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/tj;-><init>(ILjava/lang/String;)V

    return-object v0
.end method
