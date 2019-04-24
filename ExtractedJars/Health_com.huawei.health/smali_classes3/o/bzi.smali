.class public Lo/bzi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bzo;


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 398
    invoke-static {p0}, Lo/bsm;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 341
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 342
    :cond_0
    const-string v0, "ChineseFitRunVoiceContentConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getChangeAction null == nameUrl || \"\".equals(nameUrl)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    const/4 v0, 0x0

    return-object v0

    .line 345
    :cond_1
    const-string v0, "ChineseFitRunVoiceContentConstructor"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "value = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "nameUrl = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    const-string v2, "measurementType = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "fistAudio = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object p4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 348
    invoke-static {p1}, Lo/bzi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 350
    :cond_2
    invoke-direct {p0, p1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 351
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 352
    const-string v0, "ChineseFitRunVoiceContentConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getChangeAction !new File(audiosFilePath).exists() = true , audiosFilePath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    const/4 v0, 0x0

    return-object v0

    .line 357
    :cond_3
    :goto_0
    const/4 v5, 0x0

    .line 358
    const/4 v0, 0x1

    if-ne p3, v0, :cond_6

    .line 359
    div-int/lit8 v6, p2, 0x3c

    .line 360
    const/4 v7, 0x0

    .line 361
    if-lez v6, :cond_4

    const/16 v0, 0xa

    if-ge v6, v0, :cond_4

    .line 362
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "H00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 363
    :cond_4
    const/16 v0, 0xa

    if-lt v6, v0, :cond_5

    const/16 v0, 0x3c

    if-gt v6, v0, :cond_5

    .line 364
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "H0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 366
    :cond_5
    const-string v0, "ChineseFitRunVoiceContentConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MEASUREMENTTYPE_TIME value = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    const/4 v0, 0x0

    return-object v0

    .line 369
    :goto_1
    const/4 v0, 0x4

    new-array v5, v0, [Ljava/lang/String;

    invoke-direct {p0, p4}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x1

    aput-object v4, v5, v0

    invoke-direct {p0, v7}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "I007"

    invoke-direct {p0, v0}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    .line 370
    goto/16 :goto_3

    :cond_6
    if-nez p3, :cond_a

    .line 371
    const/4 v6, 0x0

    .line 372
    const/16 v0, 0x64

    if-ge v0, p2, :cond_7

    const/16 v0, 0x3e8

    if-ge p2, v0, :cond_7

    .line 373
    div-int/lit8 v7, p2, 0x64

    .line 374
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "H00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 375
    const/4 v0, 0x4

    new-array v5, v0, [Ljava/lang/String;

    invoke-direct {p0, p4}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x1

    aput-object v4, v5, v0

    invoke-direct {p0, v6}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "I002"

    invoke-direct {p0, v0}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    .line 376
    goto/16 :goto_3

    :cond_7
    const/16 v0, 0x3e8

    if-gt v0, p2, :cond_9

    const/16 v0, 0x2710

    if-ge p2, v0, :cond_9

    .line 377
    div-int/lit16 v7, p2, 0x3e8

    .line 378
    rem-int/lit16 v0, p2, 0x3e8

    div-int/lit8 v8, v0, 0x64

    .line 379
    const/4 v0, 0x0

    if-ne v0, v8, :cond_8

    .line 380
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "H00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 381
    const/4 v0, 0x4

    new-array v5, v0, [Ljava/lang/String;

    invoke-direct {p0, p4}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x1

    aput-object v4, v5, v0

    invoke-direct {p0, v6}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "I003"

    invoke-direct {p0, v0}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    goto :goto_2

    .line 383
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "H00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 384
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "H00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 385
    const/4 v0, 0x6

    new-array v5, v0, [Ljava/lang/String;

    invoke-direct {p0, p4}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x1

    aput-object v4, v5, v0

    invoke-direct {p0, v6}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "I005"

    invoke-direct {p0, v0}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    invoke-direct {p0, v9}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v5, v1

    const-string v0, "I002"

    invoke-direct {p0, v0}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v5, v1

    .line 387
    :goto_2
    goto :goto_3

    .line 389
    :cond_9
    const-string v0, "ChineseFitRunVoiceContentConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MEASUREMENTTYPE_DISTANCE value = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    const/4 v0, 0x0

    return-object v0

    .line 394
    :cond_a
    :goto_3
    return-object v5
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 403
    iget-object v0, p0, Lo/bzi;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/bzi;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/bzi;->a:Ljava/lang/String;

    invoke-direct {p0, p1, v0, v1, v2}, Lo/bzi;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 407
    invoke-static {p1, p2, p3, p4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2

    .line 229
    const-string v1, "K012"

    .line 230
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;II)Ljava/lang/Object;
    .locals 2

    .line 285
    const-string v1, "K003"

    .line 286
    invoke-direct {p0, p1, p2, p3, v1}, Lo/bzi;->c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 2

    .line 236
    const-string v1, "K015"

    .line 237
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;II)Ljava/lang/Object;
    .locals 2

    .line 277
    const-string v1, "K002"

    .line 278
    invoke-direct {p0, p1, p2, p3, v1}, Lo/bzi;->c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 2

    .line 243
    const-string v1, "K014"

    .line 244
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;II)Ljava/lang/Object;
    .locals 2

    .line 293
    const-string v1, "K001"

    .line 294
    invoke-direct {p0, p1, p2, p3, v1}, Lo/bzi;->c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 2

    .line 222
    const-string v1, "K013"

    .line 223
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/Object;
    .locals 2

    .line 251
    const-string v1, "K015"

    .line 252
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    .line 270
    const-string v0, "K017"

    invoke-direct {p0, v0}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 2

    .line 307
    const-string v1, "K014"

    .line 308
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/Object;
    .locals 1

    .line 265
    const-string v0, "K016"

    invoke-direct {p0, v0}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/Object;
    .locals 2

    .line 259
    const-string v1, "K014"

    .line 260
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/Object;
    .locals 2

    .line 300
    const-string v1, "K015"

    .line 301
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/lang/Object;
    .locals 2

    .line 328
    const-string v1, "K015"

    .line 329
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/Object;
    .locals 2

    .line 321
    const-string v1, "K014"

    .line 322
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljava/lang/Object;
    .locals 2

    .line 335
    const-string v1, "K014"

    .line 336
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p()Ljava/lang/Object;
    .locals 2

    .line 314
    const-string v1, "K015"

    .line 315
    invoke-direct {p0, v1}, Lo/bzi;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
