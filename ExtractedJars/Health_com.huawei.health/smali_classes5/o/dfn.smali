.class public Lo/dfn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(IIILo/dfl;)V
    .locals 0

    .line 107
    invoke-virtual {p3, p2}, Lo/dfl;->b(I)V

    .line 108
    invoke-virtual {p3, p0}, Lo/dfl;->e(I)V

    .line 109
    invoke-virtual {p3, p1}, Lo/dfl;->d(I)V

    .line 110
    return-void
.end method

.method private static a(Ljava/util/List;Ljava/util/List;IIIIII)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dfl;>;Ljava/util/List<Lo/dfo;>;IIIIII)V"
        }
    .end annotation

    .line 149
    const/16 v0, 0xb

    if-eq v0, p4, :cond_0

    const/16 v0, 0xa

    if-eq v0, p4, :cond_0

    .line 151
    new-instance v2, Lo/dfl;

    invoke-direct {v2}, Lo/dfl;-><init>()V

    .line 154
    add-int/lit8 v0, p3, -0x1

    mul-int/lit8 v0, v0, 0x3c

    add-int v3, p2, v0

    .line 155
    int-to-long v0, v3

    invoke-virtual {v2, v0, v1}, Lo/dfl;->c(J)V

    .line 156
    invoke-static {p4}, Lo/dfn;->e(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dfl;->c(I)V

    .line 158
    invoke-static {p5, p6, p7, v2}, Lo/dfn;->a(IIILo/dfl;)V

    .line 159
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    goto :goto_0

    .line 162
    :cond_0
    new-instance v2, Lo/dfo;

    invoke-direct {v2}, Lo/dfo;-><init>()V

    .line 163
    invoke-static {p4}, Lo/dfn;->e(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dfo;->c(I)V

    .line 164
    add-int/lit8 v0, p3, -0x1

    mul-int/lit8 v0, v0, 0x3c

    add-int v3, p2, v0

    .line 165
    int-to-long v0, v3

    invoke-virtual {v2, v0, v1}, Lo/dfo;->d(J)V

    .line 167
    invoke-static {p5, p6, p7, v2}, Lo/dfn;->d(IIILo/dfo;)V

    .line 168
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    :goto_0
    return-void
.end method

.method private static b([B)I
    .locals 2

    .line 89
    const/4 v0, 0x2

    aget-byte v0, p0, v0

    invoke-static {v0}, Lo/dbi;->d(B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v1

    .line 90
    return v1
.end method

.method public static b(Lo/dba;)Lo/dfm;
    .locals 31

    .line 309
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 310
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 311
    new-instance v10, Lo/dfm;

    invoke-direct {v10}, Lo/dfm;-><init>()V

    .line 312
    const-string v11, ""

    .line 313
    move-object/from16 v0, p0

    iget-object v12, v0, Lo/dba;->b:Ljava/util/List;

    .line 314
    const/4 v13, 0x0

    :goto_0
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_1

    .line 315
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v14, v0, Lo/dba;->e:Ljava/util/List;

    .line 316
    const/4 v15, 0x0

    :goto_1
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-ge v15, v0, :cond_0

    .line 317
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 319
    :sswitch_0
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v11

    .line 316
    .line 320
    :goto_2
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 314
    :cond_0
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 327
    :cond_1
    invoke-static {v11}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v13

    .line 328
    array-length v0, v13

    const/16 v1, 0x10

    if-ge v0, v1, :cond_2

    .line 329
    return-object v10

    .line 333
    :cond_2
    invoke-static {v13}, Lo/dbi;->a([B)I

    move-result v14

    .line 334
    invoke-virtual {v10, v14}, Lo/dfm;->b(I)V

    .line 335
    const-string v0, "FitnessUnpackFrame"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetFrameData(),time="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " date="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    int-to-long v4, v14

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    invoke-static {v13}, Lo/dfn;->b([B)I

    move-result v15

    .line 339
    const/4 v0, 0x0

    if-ne v0, v15, :cond_3

    .line 340
    return-object v10

    .line 343
    :cond_3
    array-length v0, v13

    add-int/lit8 v16, v0, -0x10

    .line 345
    div-int/lit8 v17, v16, 0x10

    .line 348
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v18, v0

    .line 349
    const/16 v19, 0x10

    :goto_3
    array-length v0, v13

    move/from16 v1, v19

    if-ge v1, v0, :cond_4

    .line 350
    aget-byte v0, v13, v19

    invoke-static {v0}, Lo/dbi;->d(B)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    add-int/lit8 v19, v19, 0x1

    goto :goto_3

    .line 354
    :cond_4
    const/16 v19, 0x0

    .line 356
    const/16 v20, 0x0

    .line 358
    const/16 v21, 0x0

    .line 359
    const/16 v22, 0x0

    .line 360
    const/16 v23, 0x0

    .line 361
    const/16 v24, 0x0

    .line 363
    const/16 v25, 0x0

    .line 365
    const/16 v26, 0x0

    .line 366
    const/16 v27, 0x0

    .line 367
    const/16 v28, 0x0

    .line 368
    const/16 v29, 0x0

    .line 370
    const/16 v30, 0x0

    :goto_4
    move/from16 v0, v30

    move/from16 v1, v17

    if-ge v0, v1, :cond_6

    .line 371
    mul-int/lit8 v0, v30, 0x10

    mul-int/lit8 v19, v0, 0x8

    .line 373
    add-int/lit8 v0, v19, 0x0

    add-int/lit8 v1, v19, 0x7

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v20

    .line 375
    add-int/lit8 v0, v19, 0x8

    add-int/lit8 v1, v19, 0xf

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v21

    .line 377
    add-int/lit8 v0, v19, 0xf

    add-int/lit8 v1, v19, 0x20

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v22

    .line 378
    add-int/lit8 v0, v19, 0x20

    add-int/lit8 v1, v19, 0x38

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v23

    .line 379
    add-int/lit8 v0, v19, 0x38

    add-int/lit8 v1, v19, 0x4b

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v24

    .line 381
    add-int/lit8 v0, v19, 0x4b

    add-int/lit8 v1, v19, 0x52

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v25

    .line 383
    add-int/lit8 v0, v19, 0x53

    add-int/lit8 v1, v19, 0x5a

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v26

    .line 385
    add-int/lit8 v0, v19, 0x5a

    add-int/lit8 v1, v19, 0x65

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v27

    .line 386
    add-int/lit8 v0, v19, 0x65

    add-int/lit8 v1, v19, 0x74

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v28

    .line 387
    add-int/lit8 v0, v19, 0x74

    move/from16 v1, v19

    add-int/lit16 v1, v1, 0x80

    .line 388
    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 387
    invoke-static {v0}, Lo/dbi;->b(Ljava/lang/String;)I

    move-result v29

    .line 390
    move-object v0, v8

    move-object v1, v9

    move v2, v14

    move/from16 v3, v20

    move/from16 v4, v21

    move/from16 v5, v23

    move/from16 v6, v22

    move/from16 v7, v24

    invoke-static/range {v0 .. v7}, Lo/dfn;->a(Ljava/util/List;Ljava/util/List;IIIIII)V

    .line 391
    const/4 v0, 0x0

    move/from16 v1, v25

    if-eq v0, v1, :cond_5

    .line 393
    move-object v0, v8

    move-object v1, v9

    move v2, v14

    move/from16 v3, v25

    move/from16 v4, v26

    move/from16 v5, v28

    move/from16 v6, v27

    move/from16 v7, v29

    invoke-static/range {v0 .. v7}, Lo/dfn;->e(Ljava/util/List;Ljava/util/List;IIIIII)V

    .line 370
    :cond_5
    add-int/lit8 v30, v30, 0x1

    goto/16 :goto_4

    .line 398
    :cond_6
    invoke-virtual {v10, v8}, Lo/dfm;->b(Ljava/util/List;)V

    .line 399
    invoke-virtual {v10, v9}, Lo/dfm;->a(Ljava/util/List;)V

    .line 400
    return-object v10

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method private static b(Ljava/util/List;IIILo/dfo;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dfo;>;IIILo/dfo;)V"
        }
    .end annotation

    .line 234
    .line 235
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/dfo;

    .line 236
    invoke-virtual {v2}, Lo/dfo;->a()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p4, v0}, Lo/dfo;->a(I)V

    .line 238
    return-void
.end method

.method private static c(Ljava/util/List;J)Z
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dfl;>;J)Z"
        }
    .end annotation

    .line 182
    .line 183
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dfl;

    .line 184
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 185
    const/4 v0, 0x0

    return v0

    .line 188
    :cond_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "dd"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 190
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 191
    new-instance v0, Ljava/util/Date;

    .line 192
    invoke-virtual {v5}, Lo/dfl;->c()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 191
    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 194
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 196
    const/4 v0, 0x1

    return v0

    .line 199
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static d(IIILo/dfo;)V
    .locals 0

    .line 123
    invoke-virtual {p3, p0}, Lo/dfo;->a(I)V

    .line 124
    return-void
.end method

.method private static d(Ljava/util/List;IIILo/dfl;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dfl;>;IIILo/dfl;)V"
        }
    .end annotation

    .line 216
    .line 217
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dfl;

    .line 218
    invoke-virtual {v3}, Lo/dfl;->a()I

    move-result v0

    add-int/2addr v0, p1

    .line 219
    invoke-virtual {v3}, Lo/dfl;->e()I

    move-result v1

    add-int/2addr v1, p2

    .line 220
    invoke-virtual {v3}, Lo/dfl;->d()I

    move-result v2

    add-int/2addr v2, p3

    .line 218
    invoke-static {v0, v1, v2, p4}, Lo/dfn;->a(IIILo/dfl;)V

    .line 221
    return-void
.end method

.method private static e(I)I
    .locals 2

    .line 41
    const/16 v1, 0xff

    .line 42
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 44
    :pswitch_0
    const/4 v1, 0x1

    .line 45
    goto :goto_0

    .line 47
    :pswitch_1
    const/4 v1, 0x1

    .line 48
    goto :goto_0

    .line 50
    :pswitch_2
    const/4 v1, 0x2

    .line 51
    goto :goto_0

    .line 53
    :pswitch_3
    const/4 v1, 0x2

    .line 54
    goto :goto_0

    .line 56
    :pswitch_4
    const/4 v1, 0x3

    .line 57
    goto :goto_0

    .line 59
    :pswitch_5
    const/4 v1, 0x4

    .line 60
    goto :goto_0

    .line 62
    :pswitch_6
    const/4 v1, 0x6

    .line 63
    goto :goto_0

    .line 65
    :pswitch_7
    const/4 v1, 0x7

    .line 66
    goto :goto_0

    .line 68
    :pswitch_8
    const/4 v1, 0x0

    .line 69
    goto :goto_0

    .line 71
    :pswitch_9
    const/4 v1, 0x0

    .line 72
    goto :goto_0

    .line 74
    :pswitch_a
    const/4 v1, 0x0

    .line 75
    .line 80
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private static e(Ljava/util/List;Ljava/util/List;IIIIII)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dfl;>;Ljava/util/List<Lo/dfo;>;IIIIII)V"
        }
    .end annotation

    .line 264
    const/16 v0, 0xb

    if-eq v0, p4, :cond_2

    const/16 v0, 0xa

    if-eq v0, p4, :cond_2

    .line 266
    new-instance v4, Lo/dfl;

    invoke-direct {v4}, Lo/dfl;-><init>()V

    .line 268
    add-int/lit8 v0, p3, -0x1

    mul-int/lit8 v0, v0, 0x3c

    add-int v5, p2, v0

    .line 269
    int-to-long v0, v5

    invoke-virtual {v4, v0, v1}, Lo/dfl;->c(J)V

    .line 270
    invoke-static {p4}, Lo/dfn;->e(I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/dfl;->c(I)V

    .line 272
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 275
    :cond_0
    int-to-long v0, v5

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {p0, v0, v1}, Lo/dfn;->c(Ljava/util/List;J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 276
    invoke-static {p5, p6, p7, v4}, Lo/dfn;->a(IIILo/dfl;)V

    goto :goto_0

    .line 279
    :cond_1
    invoke-static {p0, p5, p6, p7, v4}, Lo/dfn;->d(Ljava/util/List;IIILo/dfl;)V

    .line 282
    :goto_0
    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    goto :goto_2

    .line 286
    :cond_2
    new-instance v4, Lo/dfo;

    invoke-direct {v4}, Lo/dfo;-><init>()V

    .line 287
    invoke-static {p4}, Lo/dfn;->e(I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/dfo;->c(I)V

    .line 288
    add-int/lit8 v0, p3, -0x1

    mul-int/lit8 v0, v0, 0x3c

    add-int v5, p2, v0

    .line 289
    int-to-long v0, v5

    invoke-virtual {v4, v0, v1}, Lo/dfo;->d(J)V

    .line 292
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_3

    goto :goto_1

    .line 295
    :cond_3
    invoke-static {p1, p5, p6, p7, v4}, Lo/dfn;->b(Ljava/util/List;IIILo/dfo;)V

    .line 297
    :goto_1
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 300
    :goto_2
    return-void
.end method
