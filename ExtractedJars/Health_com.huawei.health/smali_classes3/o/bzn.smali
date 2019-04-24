.class public Lo/bzn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bzo;


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    const-string v0, ""

    iput-object v0, p0, Lo/bzn;->c:Ljava/lang/String;

    .line 215
    iput-object p1, p0, Lo/bzn;->d:Ljava/lang/String;

    .line 216
    iput-object p2, p0, Lo/bzn;->c:Ljava/lang/String;

    .line 217
    iput-object p3, p0, Lo/bzn;->e:Ljava/lang/String;

    .line 218
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 400
    invoke-static {p0}, Lo/bsm;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 409
    invoke-static {p1, p2, p3, p4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 343
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    :cond_0
    const-string v0, "FitRunVoiceBaseContentConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getChangeAction null == nameUrl || \"\".equals(nameUrl)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const/4 v0, 0x0

    return-object v0

    .line 347
    :cond_1
    const-string v0, "FitRunVoiceBaseContentConstructor"

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

    .line 349
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 350
    invoke-static {p1}, Lo/bzn;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 352
    :cond_2
    invoke-direct {p0, p1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 353
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 354
    const-string v0, "FitRunVoiceBaseContentConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getChangeAction !new File(audiosFilePath).exists() = true , audiosFilePath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/4 v0, 0x0

    return-object v0

    .line 359
    :cond_3
    :goto_0
    const/4 v5, 0x0

    .line 360
    const/4 v0, 0x1

    if-ne p3, v0, :cond_6

    .line 361
    div-int/lit8 v6, p2, 0x3c

    .line 362
    const/4 v7, 0x0

    .line 363
    if-lez v6, :cond_4

    const/16 v0, 0xa

    if-ge v6, v0, :cond_4

    .line 364
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

    .line 365
    :cond_4
    const/16 v0, 0xa

    if-lt v6, v0, :cond_5

    const/16 v0, 0x3c

    if-gt v6, v0, :cond_5

    .line 366
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

    .line 368
    :cond_5
    const-string v0, "FitRunVoiceBaseContentConstructor"

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

    .line 369
    const/4 v0, 0x0

    return-object v0

    .line 371
    :goto_1
    const/4 v0, 0x4

    new-array v5, v0, [Ljava/lang/String;

    invoke-direct {p0, p4}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x1

    aput-object v4, v5, v0

    invoke-direct {p0, v7}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "I007"

    invoke-direct {p0, v0}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    .line 372
    goto/16 :goto_3

    :cond_6
    if-nez p3, :cond_a

    .line 373
    const/4 v6, 0x0

    .line 374
    const/16 v0, 0x64

    if-ge v0, p2, :cond_7

    const/16 v0, 0x3e8

    if-ge p2, v0, :cond_7

    .line 375
    div-int/lit8 v7, p2, 0x64

    .line 376
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "H00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 377
    const/4 v0, 0x4

    new-array v5, v0, [Ljava/lang/String;

    invoke-direct {p0, p4}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x1

    aput-object v4, v5, v0

    invoke-direct {p0, v6}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "I002"

    invoke-direct {p0, v0}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    .line 378
    goto/16 :goto_3

    :cond_7
    const/16 v0, 0x3e8

    if-gt v0, p2, :cond_9

    const/16 v0, 0x2710

    if-ge p2, v0, :cond_9

    .line 379
    div-int/lit16 v7, p2, 0x3e8

    .line 380
    rem-int/lit16 v0, p2, 0x3e8

    div-int/lit8 v8, v0, 0x64

    .line 381
    const/4 v0, 0x0

    if-ne v0, v8, :cond_8

    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "H00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 383
    const/4 v0, 0x4

    new-array v5, v0, [Ljava/lang/String;

    invoke-direct {p0, p4}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x1

    aput-object v4, v5, v0

    invoke-direct {p0, v6}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "I003"

    invoke-direct {p0, v0}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    goto :goto_2

    .line 385
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

    .line 386
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "H00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 387
    const/4 v0, 0x6

    new-array v5, v0, [Ljava/lang/String;

    invoke-direct {p0, p4}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x1

    aput-object v4, v5, v0

    invoke-direct {p0, v6}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "I005"

    invoke-direct {p0, v0}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    invoke-direct {p0, v9}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v5, v1

    const-string v0, "I002"

    invoke-direct {p0, v0}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v5, v1

    .line 389
    :goto_2
    goto :goto_3

    .line 391
    :cond_9
    const-string v0, "FitRunVoiceBaseContentConstructor"

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

    .line 392
    const/4 v0, 0x0

    return-object v0

    .line 396
    :cond_a
    :goto_3
    return-object v5
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 405
    iget-object v0, p0, Lo/bzn;->d:Ljava/lang/String;

    iget-object v1, p0, Lo/bzn;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/bzn;->e:Ljava/lang/String;

    invoke-direct {p0, p1, v0, v1, v2}, Lo/bzn;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2

    .line 231
    const-string v1, "K012"

    .line 232
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;II)Ljava/lang/Object;
    .locals 2

    .line 287
    const-string v1, "K003"

    .line 288
    invoke-direct {p0, p1, p2, p3, v1}, Lo/bzn;->c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 2

    .line 238
    const-string v1, "K015"

    .line 239
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;II)Ljava/lang/Object;
    .locals 2

    .line 279
    const-string v1, "K002"

    .line 280
    invoke-direct {p0, p1, p2, p3, v1}, Lo/bzn;->c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 2

    .line 245
    const-string v1, "K014"

    .line 246
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;II)Ljava/lang/Object;
    .locals 2

    .line 295
    const-string v1, "K001"

    .line 296
    invoke-direct {p0, p1, p2, p3, v1}, Lo/bzn;->c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 2

    .line 224
    const-string v1, "K013"

    .line 225
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/Object;
    .locals 2

    .line 253
    const-string v1, "K015"

    .line 254
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    .line 272
    const-string v0, "K017"

    invoke-direct {p0, v0}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 2

    .line 309
    const-string v1, "K014"

    .line 310
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/Object;
    .locals 1

    .line 267
    const-string v0, "K016"

    invoke-direct {p0, v0}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/Object;
    .locals 2

    .line 261
    const-string v1, "K014"

    .line 262
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/Object;
    .locals 2

    .line 302
    const-string v1, "K015"

    .line 303
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/lang/Object;
    .locals 2

    .line 330
    const-string v1, "K015"

    .line 331
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/Object;
    .locals 2

    .line 323
    const-string v1, "K014"

    .line 324
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljava/lang/Object;
    .locals 2

    .line 337
    const-string v1, "K014"

    .line 338
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p()Ljava/lang/Object;
    .locals 2

    .line 316
    const-string v1, "K015"

    .line 317
    invoke-direct {p0, v1}, Lo/bzn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
