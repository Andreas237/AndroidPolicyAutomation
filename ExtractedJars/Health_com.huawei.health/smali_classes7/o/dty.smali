.class public Lo/dty;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[D

.field private static final b:[D

.field private static final c:[D

.field private static final d:[I

.field private static final e:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 56
    const/16 v0, 0xe

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/dty;->e:[I

    .line 57
    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/dty;->d:[I

    .line 60
    const/16 v0, 0xb

    new-array v0, v0, [D

    fill-array-data v0, :array_2

    sput-object v0, Lo/dty;->a:[D

    .line 61
    const/16 v0, 0xf

    new-array v0, v0, [D

    fill-array-data v0, :array_3

    sput-object v0, Lo/dty;->b:[D

    .line 62
    const/16 v0, 0xf

    new-array v0, v0, [D

    fill-array-data v0, :array_4

    sput-object v0, Lo/dty;->c:[D

    return-void

    :array_0
    .array-data 4
        0x2
        0x4
        0x6
        0x8
        0xa
        0xf
        0x14
        0x19
        0x1e
        0x23
        0x28
        0x3c
        0x50
        0x64
    .end array-data

    :array_1
    .array-data 4
        0x7d0
        0xfa0
        0x1770
        0x1f40
        0x2710
        0x2ee0
        0x36b0
        0x3e80
        0x4650
        0x4e20
    .end array-data

    :array_2
    .array-data 8
        0x4018a3d70a3d70a4L    # 6.16
        0x402519999999999aL    # 10.55
        0x4030f5c28f5c28f6L    # 16.96
        0x4033828f5c28f5c3L    # 19.51
        0x4030e3d70a3d70a4L    # 16.89
        0x40283d70a3d70a3dL    # 12.12
        0x401e70a3d70a3d71L    # 7.61
        0x4011c28f5c28f5c3L    # 4.44
        0x4004147ae147ae14L    # 2.51
        0x3ff6666666666666L    # 1.4
        0x3ffd70a3d70a3d71L    # 1.84
    .end array-data

    :array_3
    .array-data 8
        0x403cab851eb851ecL    # 28.67
        0x4030b33333333333L    # 16.7
        0x4029d70a3d70a3d7L    # 12.92
        0x401fcccccccccccdL    # 7.95
        0x401599999999999aL    # 5.4
        0x4023f5c28f5c28f6L    # 9.98
        0x40165c28f5c28f5cL    # 5.59
        0x400f99999999999aL    # 3.95
        0x40035c28f5c28f5cL    # 2.42
        0x3ffc51eb851eb852L    # 1.77
        0x3ff3333333333333L    # 1.2
        0x40028f5c28f5c28fL    # 2.32
        0x3fe8000000000000L    # 0.75
        0x3fd3333333333333L    # 0.3
        0x3fb47ae147ae147bL    # 0.08
    .end array-data

    :array_4
    .array-data 8
        0x403c51eb851eb852L    # 28.32
        0x402ef5c28f5c28f6L    # 15.48
        0x4024eb851eb851ecL    # 10.46
        0x401ab851eb851eb8L    # 6.68
        0x401351eb851eb852L    # 4.83
        0x4020c28f5c28f5c3L    # 8.38
        0x4015333333333333L    # 5.3
        0x400e000000000000L    # 3.75
        0x400651eb851eb852L    # 2.79
        0x4001851eb851eb85L    # 2.19
        0x3ffbd70a3d70a3d7L    # 1.74
        0x401228f5c28f5c29L    # 4.54
        0x4003c28f5c28f5c3L    # 2.47
        0x3ff828f5c28f5c29L    # 1.51
        0x3ff8f5c28f5c28f6L    # 1.56
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(DI)D
    .locals 3

    .line 516
    invoke-static {p0, p1}, Lo/dty;->c(D)I

    move-result v2

    .line 517
    if-nez p2, :cond_0

    .line 518
    const/4 v0, 0x0

    invoke-static {v2, p0, p1, v0}, Lo/dty;->a(IDI)D

    move-result-wide v0

    return-wide v0

    .line 520
    :cond_0
    const/4 v0, 0x1

    invoke-static {v2, p0, p1, v0}, Lo/dty;->a(IDI)D

    move-result-wide v0

    return-wide v0
.end method

.method public static a(IDI)D
    .locals 13

    .line 563
    const/16 v0, 0xd

    if-le p0, v0, :cond_0

    .line 564
    const-wide v0, 0x4058f9999999999aL    # 99.9

    return-wide v0

    .line 566
    :cond_0
    const-wide/16 v4, 0x0

    .line 568
    const/4 v8, 0x0

    :goto_0
    if-ge v8, p0, :cond_2

    .line 569
    if-nez p3, :cond_1

    .line 570
    sget-object v0, Lo/dty;->b:[D

    aget-wide v0, v0, v8

    add-double/2addr v4, v0

    goto :goto_1

    .line 572
    :cond_1
    sget-object v0, Lo/dty;->c:[D

    aget-wide v0, v0, v8

    add-double/2addr v4, v0

    .line 568
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 576
    :cond_2
    if-nez p3, :cond_3

    .line 577
    sget-object v0, Lo/dty;->b:[D

    aget-wide v6, v0, p0

    goto :goto_2

    .line 579
    :cond_3
    sget-object v0, Lo/dty;->c:[D

    aget-wide v6, v0, p0

    .line 582
    :goto_2
    const/4 v0, 0x1

    if-ge p0, v0, :cond_4

    .line 583
    move-wide v8, p1

    .line 584
    sget-object v0, Lo/dty;->e:[I

    aget v0, v0, p0

    int-to-double v0, v0

    div-double v0, v8, v0

    mul-double/2addr v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v10

    goto :goto_3

    .line 586
    :cond_4
    sget-object v0, Lo/dty;->e:[I

    add-int/lit8 v1, p0, -0x1

    aget v0, v0, v1

    int-to-double v0, v0

    sub-double v8, p1, v0

    .line 587
    sget-object v0, Lo/dty;->e:[I

    aget v0, v0, p0

    sget-object v1, Lo/dty;->e:[I

    add-int/lit8 v2, p0, -0x1

    aget v1, v1, v2

    sub-int/2addr v0, v1

    int-to-double v0, v0

    div-double v0, v8, v0

    mul-double/2addr v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v10

    .line 590
    :goto_3
    :try_start_0
    invoke-static {v10}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v11

    .line 591
    add-double v0, v4, v11

    move-wide v4, v0

    .line 594
    goto :goto_4

    .line 592
    :catch_0
    move-exception v11

    .line 593
    const-string v0, "PLGACHIEVE_AchieveParserUtil"

    const-string v1, "getPercentBySection Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 595
    :goto_4
    return-wide v4
.end method

.method public static a(Ljava/lang/String;Lorg/json/JSONObject;)D
    .locals 5

    .line 429
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 430
    const-wide/16 v2, 0x0

    .line 432
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 435
    goto :goto_0

    .line 433
    :catch_0
    move-exception v4

    .line 434
    const-string v0, "PLGACHIEVE_AchieveParserUtil"

    const-string v1, "judgeValidKeyDouble Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    :goto_0
    return-wide v2

    .line 438
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static a(Lorg/json/JSONObject;)Lo/dvs;
    .locals 4

    .line 368
    new-instance v1, Lo/dvs;

    invoke-direct {v1}, Lo/dvs;-><init>()V

    .line 369
    const-string v0, "actionType"

    invoke-static {v0, p0}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v2

    .line 370
    const-string v0, "endTime"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 371
    invoke-static {v2}, Lo/dty;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v3}, Lo/dty;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 372
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/dvs;->a(I)V

    .line 373
    const-string v0, "NOT_UPLOAD"

    invoke-virtual {v1, v0}, Lo/dvs;->h(Ljava/lang/String;)V

    .line 374
    const-string v0, "APP_OPENED"

    invoke-virtual {v1, v0}, Lo/dvs;->a(Ljava/lang/String;)V

    .line 375
    const-string v0, "complex"

    invoke-virtual {v1, v0}, Lo/dvs;->e(Ljava/lang/String;)V

    .line 376
    invoke-static {}, Lo/dty;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvs;->b(Ljava/lang/String;)V

    .line 377
    const-string v0, "startTime"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvs;->k(Ljava/lang/String;)V

    .line 378
    invoke-virtual {v1, v3}, Lo/dvs;->i(Ljava/lang/String;)V

    .line 379
    return-object v1

    .line 381
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static a(II)Z
    .locals 1

    .line 138
    add-int/lit8 v0, p1, 0x1

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 1

    .line 287
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, "A"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "B"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "C"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 288
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 290
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static b(Ljava/lang/String;Lorg/json/JSONObject;DI)D
    .locals 5

    .line 476
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 477
    const-wide/16 v2, 0x0

    .line 479
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 482
    goto :goto_0

    .line 480
    :catch_0
    move-exception v4

    .line 481
    const-string v0, "PLGACHIEVE_AchieveParserUtil"

    const-string v1, "judgeValidKeyDouble Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    :goto_0
    return-wide v2

    .line 485
    :cond_0
    invoke-static {p2, p3, p4}, Lo/dty;->a(DI)D

    move-result-wide v0

    return-wide v0
.end method

.method public static c(D)I
    .locals 3

    .line 466
    const/4 v2, 0x0

    :goto_0
    const/16 v0, 0xe

    if-ge v2, v0, :cond_1

    .line 467
    sget-object v0, Lo/dty;->e:[I

    aget v0, v0, v2

    int-to-double v0, v0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 468
    return v2

    .line 466
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 471
    :cond_1
    const/16 v0, 0xe

    return v0
.end method

.method public static c(Ljava/lang/String;Lorg/json/JSONObject;)J
    .locals 5

    .line 401
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    const-wide/16 v2, 0x0

    .line 404
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 407
    goto :goto_0

    .line 405
    :catch_0
    move-exception v4

    .line 406
    const-string v0, "PLGACHIEVE_AchieveParserUtil"

    const-string v1, "judgeValidKeyLong Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    :goto_0
    return-wide v2

    .line 410
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static c(Lorg/json/JSONArray;)Ljava/lang/String;
    .locals 9

    .line 110
    const/4 v1, 0x1

    .line 111
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 113
    if-nez p0, :cond_0

    .line 114
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 116
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v4

    .line 117
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_4

    .line 118
    invoke-virtual {p0, v5}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v6

    .line 119
    instance-of v0, v6, Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    .line 120
    move-object v7, v6

    check-cast v7, Lorg/json/JSONObject;

    .line 121
    const-string v0, "medalId"

    invoke-static {v0, v7}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    .line 122
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 123
    const/4 v1, 0x1

    .line 124
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 127
    :cond_1
    const/4 v1, 0x0

    .line 130
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    invoke-static {v4, v5}, Lo/dty;->a(II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 131
    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 134
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(II)I
    .locals 2

    .line 501
    const/4 v1, 0x0

    :goto_0
    const/16 v0, 0xa

    if-ge v1, v0, :cond_1

    .line 502
    sget-object v0, Lo/dty;->d:[I

    aget v0, v0, v1

    mul-int/2addr v0, p1

    if-ge p0, v0, :cond_0

    .line 503
    return v1

    .line 501
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 506
    :cond_1
    const/16 v0, 0xa

    return v0
.end method

.method public static d(Ljava/lang/String;Lorg/json/JSONObject;)I
    .locals 4

    .line 415
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    const/4 v2, 0x0

    .line 418
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 421
    goto :goto_0

    .line 419
    :catch_0
    move-exception v3

    .line 420
    const-string v0, "PLGACHIEVE_AchieveParserUtil"

    const-string v1, "judgeValidKeyInt Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    :goto_0
    return v2

    .line 424
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 294
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 442
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 443
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 445
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 446
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 448
    :cond_2
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 449
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 450
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    :goto_0
    return-object p0
.end method

.method public static d(I)Z
    .locals 1

    .line 322
    const/4 v0, 0x6

    if-ne v0, p0, :cond_0

    .line 323
    const/4 v0, 0x1

    return v0

    .line 325
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 72
    const-string v0, "0"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static e(II)D
    .locals 3

    .line 496
    invoke-static {p0, p1}, Lo/dty;->d(II)I

    move-result v2

    .line 497
    invoke-static {v2, p0, p1}, Lo/dty;->e(III)D

    move-result-wide v0

    return-wide v0
.end method

.method public static e(III)D
    .locals 12

    .line 526
    const/16 v0, 0x9

    if-le p0, v0, :cond_0

    .line 527
    const-wide v0, 0x4058f9999999999aL    # 99.9

    return-wide v0

    .line 529
    :cond_0
    const-wide/16 v4, 0x0

    .line 531
    const/4 v8, 0x0

    :goto_0
    if-ge v8, p0, :cond_1

    .line 532
    sget-object v0, Lo/dty;->a:[D

    aget-wide v0, v0, v8

    add-double/2addr v4, v0

    .line 531
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 535
    :cond_1
    sget-object v0, Lo/dty;->a:[D

    aget-wide v6, v0, p0

    .line 538
    const/4 v0, 0x1

    if-ge p0, v0, :cond_2

    .line 539
    move v8, p1

    .line 540
    int-to-float v0, v8

    sget-object v1, Lo/dty;->d:[I

    aget v1, v1, p0

    mul-int/2addr v1, p2

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    float-to-double v0, v0

    mul-double/2addr v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    .line 542
    :cond_2
    sget-object v0, Lo/dty;->d:[I

    add-int/lit8 v1, p0, -0x1

    aget v0, v0, v1

    mul-int/2addr v0, p2

    sub-int v8, p1, v0

    .line 543
    int-to-float v0, v8

    sget-object v1, Lo/dty;->d:[I

    aget v1, v1, p0

    sget-object v2, Lo/dty;->d:[I

    add-int/lit8 v3, p0, -0x1

    aget v2, v2, v3

    sub-int/2addr v1, v2

    mul-int/2addr v1, p2

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    float-to-double v0, v0

    mul-double/2addr v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v9

    .line 546
    :goto_1
    :try_start_0
    invoke-static {v9}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v10

    .line 547
    add-double v0, v4, v10

    move-wide v4, v0

    .line 550
    goto :goto_2

    .line 548
    :catch_0
    move-exception v10

    .line 549
    const-string v0, "PLGACHIEVE_AchieveParserUtil"

    const-string v1, "getPercentBySection Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 551
    :goto_2
    return-wide v4
.end method

.method public static e()Ljava/lang/String;
    .locals 5

    .line 350
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 352
    const-string v0, "eventOccur"

    const-string v1, "false"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    const-string v0, "eventContent"

    const-string v1, "-1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    const-string v0, "duration"

    const-string v1, "0"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    const-string v0, "steps"

    const-string v1, "0"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    const-string v0, "distance"

    const-string v1, "0"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    const-string v0, "calorie"

    const-string v1, "0"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 361
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    .line 362
    return-object v4
.end method

.method public static e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    .line 387
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 388
    const-string v2, ""

    .line 390
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 393
    goto :goto_0

    .line 391
    :catch_0
    move-exception v3

    .line 392
    const-string v0, "PLGACHIEVE_AchieveParserUtil"

    const-string v1, "judgeValidKey Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    :goto_0
    return-object v2

    .line 396
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static e(Lorg/json/JSONArray;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    if-nez p0, :cond_0

    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 88
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 89
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    .line 90
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v4

    .line 91
    instance-of v0, v4, Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    .line 92
    move-object v5, v4

    check-cast v5, Lorg/json/JSONObject;

    .line 93
    const-string v0, "medalType"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 94
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    invoke-static {v6}, Lo/dty;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    const-string v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    :cond_1
    const-string v0, "medalLevel"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    :cond_2
    invoke-static {v2, v3}, Lo/dty;->a(II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 101
    const-string v0, ","

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 104
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 6

    .line 331
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 332
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 334
    :cond_1
    const-wide/16 v2, 0x0

    .line 336
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 339
    goto :goto_0

    .line 337
    :catch_0
    move-exception v4

    .line 338
    const-string v0, "PLGACHIEVE_AchieveParserUtil"

    const-string v1, "judgeValidEvent Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 341
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    cmp-long v0, v2, v4

    if-gtz v0, :cond_2

    .line 342
    const/4 v0, 0x1

    return v0

    .line 344
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
