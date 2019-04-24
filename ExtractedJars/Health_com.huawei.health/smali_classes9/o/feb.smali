.class public Lo/feb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(D)D
    .locals 4

    .line 399
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    .line 400
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fe570a3e0000000L    # 0.6700000166893005

    add-double/2addr v0, v2

    return-wide v0

    .line 401
    :cond_0
    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 402
    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    add-double/2addr v0, v2

    return-wide v0

    .line 404
    :cond_1
    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    div-double v0, p0, v0

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static a(DBI)D
    .locals 10

    .line 419
    const-wide/16 v8, 0x0

    .line 420
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 421
    const/16 v0, 0xa0

    if-ge p3, v0, :cond_0

    .line 422
    const/high16 v6, 0x421a0000    # 38.5f

    .line 423
    const/high16 v7, 0x423a0000    # 46.5f

    goto :goto_0

    .line 424
    :cond_0
    const/16 v0, 0xaa

    if-ge p3, v0, :cond_1

    .line 425
    const/high16 v6, 0x42300000    # 44.0f

    .line 426
    const v7, 0x4251999a    # 52.4f

    goto :goto_0

    .line 428
    :cond_1
    const v6, 0x4245999a    # 49.4f

    .line 429
    const v7, 0x426d999a    # 59.4f

    goto :goto_0

    .line 432
    :cond_2
    const/16 v0, 0x96

    if-ge p3, v0, :cond_3

    .line 433
    const v6, 0x41af3333    # 21.9f

    .line 434
    const v7, 0x420acccd    # 34.7f

    goto :goto_0

    .line 435
    :cond_3
    const/16 v0, 0xa0

    if-ge p3, v0, :cond_4

    .line 436
    const v6, 0x4203999a    # 32.9f

    .line 437
    const/high16 v7, 0x42160000    # 37.5f

    goto :goto_0

    .line 439
    :cond_4
    const/high16 v6, 0x42120000    # 36.5f

    .line 440
    const/high16 v7, 0x422a0000    # 42.5f

    .line 443
    :goto_0
    move-wide v0, p0

    move v2, v7

    move v3, v6

    move-wide v4, v8

    const-wide/16 v4, 0x0

    invoke-static/range {v0 .. v5}, Lo/feb;->e(DFFD)D

    move-result-wide v8

    .line 445
    return-wide v8
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 641
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v3

    .line 642
    invoke-virtual {v3}, Ljava/math/BigDecimal;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a()[Ljava/lang/String;
    .locals 3

    .line 40
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "18.5"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "25.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "30.0"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static a(IB)[Ljava/lang/String;
    .locals 3

    .line 51
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 52
    const/16 v0, 0x27

    if-gt p0, v0, :cond_0

    .line 53
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "10.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "21.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "26.0"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0

    .line 54
    :cond_0
    const/16 v0, 0x3b

    if-gt p0, v0, :cond_1

    .line 55
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "11.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "22.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "27.0"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0

    .line 57
    :cond_1
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "13.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "24.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "29.0"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0

    .line 60
    :cond_2
    const/16 v0, 0x27

    if-gt p0, v0, :cond_3

    .line 61
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "20.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "34.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "39.0"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0

    .line 62
    :cond_3
    const/16 v0, 0x3b

    if-gt p0, v0, :cond_4

    .line 63
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "21.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "35.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "40.0"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0

    .line 65
    :cond_4
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "22.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "36.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "41.0"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static b(D)D
    .locals 4

    .line 499
    const-wide v0, 0x4053c00000000000L    # 79.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    .line 500
    const-wide v0, 0x4058c00000000000L    # 99.0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 501
    const-wide v0, 0x4053c00000000000L    # 79.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0

    .line 502
    :cond_0
    const-wide v0, 0x404d800000000000L    # 59.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    .line 503
    const-wide v0, 0x404d800000000000L    # 59.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 504
    :cond_1
    const-wide/high16 v0, 0x403d000000000000L    # 29.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_2

    .line 505
    const-wide/high16 v0, 0x403d000000000000L    # 29.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 507
    :cond_2
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    div-double v0, p0, v0

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static b(DBI)D
    .locals 2

    .line 171
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 172
    invoke-static {p3, p0, p1}, Lo/feb;->c(ID)D

    move-result-wide v0

    return-wide v0

    .line 174
    :cond_0
    invoke-static {p3, p0, p1}, Lo/feb;->e(ID)D

    move-result-wide v0

    return-wide v0
.end method

.method public static b(DFB)I
    .locals 3

    .line 750
    invoke-static {p0, p1, p3, p2}, Lo/feb;->c(DBF)D

    move-result-wide v1

    .line 751
    invoke-static {v1, v2}, Lo/feb;->t(D)I

    move-result v0

    return v0
.end method

.method public static b(DIB)I
    .locals 3

    .line 715
    invoke-static {p0, p1, p2, p3}, Lo/feb;->d(DIB)D

    move-result-wide v1

    .line 716
    invoke-static {v1, v2}, Lo/feb;->t(D)I

    move-result v0

    return v0
.end method

.method public static b()[Ljava/lang/String;
    .locals 3

    .line 449
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "4.5"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "9.5"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "14.5"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static c(D)D
    .locals 4

    .line 381
    const-wide/high16 v0, 0x402d000000000000L    # 14.5

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    .line 382
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 383
    const-wide/high16 v0, 0x402d000000000000L    # 14.5

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4016000000000000L    # 5.5

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0

    .line 384
    :cond_0
    const-wide/high16 v0, 0x4023000000000000L    # 9.5

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    .line 385
    const-wide/high16 v0, 0x4023000000000000L    # 9.5

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 386
    :cond_1
    const-wide/high16 v0, 0x4012000000000000L    # 4.5

    cmpl-double v0, p0, v0

    if-lez v0, :cond_2

    .line 387
    const-wide/high16 v0, 0x4012000000000000L    # 4.5

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 389
    :cond_2
    const-wide/high16 v0, 0x4012000000000000L    # 4.5

    div-double v0, p0, v0

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static c(DBF)D
    .locals 9

    .line 558
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 559
    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p3, v0

    if-gez v0, :cond_0

    .line 560
    const/high16 v6, 0x40200000    # 2.5f

    goto :goto_0

    .line 561
    :cond_0
    const/high16 v0, 0x42960000    # 75.0f

    cmpg-float v0, p3, v0

    if-gez v0, :cond_1

    .line 562
    const v6, 0x4039999a    # 2.9f

    goto :goto_0

    .line 564
    :cond_1
    const v6, 0x404ccccd    # 3.2f

    goto :goto_0

    .line 567
    :cond_2
    const/high16 v0, 0x42340000    # 45.0f

    cmpg-float v0, p3, v0

    if-gez v0, :cond_3

    .line 568
    const v6, 0x3fe66666    # 1.8f

    goto :goto_0

    .line 569
    :cond_3
    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p3, v0

    if-gez v0, :cond_4

    .line 570
    const v6, 0x400ccccd    # 2.2f

    goto :goto_0

    .line 572
    :cond_4
    const/high16 v6, 0x40200000    # 2.5f

    .line 575
    :goto_0
    const v0, 0x3f933333    # 1.15f

    mul-float v4, v6, v0

    .line 576
    const v0, 0x3f59999a    # 0.85f

    mul-float v5, v6, v0

    .line 578
    float-to-double v0, v5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_5

    .line 579
    const-wide/16 v0, 0x0

    sub-double v0, p0, v0

    float-to-double v2, v5

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    return-wide v0

    .line 580
    :cond_5
    float-to-double v0, v5

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_6

    float-to-double v0, v4

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_6

    .line 581
    float-to-double v0, v5

    sub-double v0, p0, v0

    sub-float v2, v4, v5

    float-to-double v2, v2

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    add-double/2addr v0, v2

    return-wide v0

    .line 582
    :cond_6
    float-to-double v0, v4

    cmpl-double v0, p0, v0

    if-lez v0, :cond_7

    .line 583
    float-to-double v0, v4

    sub-double v0, p0, v0

    sub-float v2, v4, v5

    float-to-double v2, v2

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fe570a3e0000000L    # 0.6700000166893005

    add-double v7, v0, v2

    .line 584
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0

    .line 586
    :cond_7
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method private static c(ID)D
    .locals 2

    .line 182
    const/16 v0, 0x27

    if-gt p0, v0, :cond_0

    .line 183
    invoke-static {p1, p2}, Lo/feb;->o(D)D

    move-result-wide v0

    return-wide v0

    .line 184
    :cond_0
    const/16 v0, 0x3b

    if-gt p0, v0, :cond_1

    .line 185
    invoke-static {p1, p2}, Lo/feb;->l(D)D

    move-result-wide v0

    return-wide v0

    .line 187
    :cond_1
    invoke-static {p1, p2}, Lo/feb;->n(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static c(DB)I
    .locals 3

    .line 706
    invoke-static {p0, p1, p2}, Lo/feb;->e(DB)D

    move-result-wide v1

    .line 707
    invoke-static {v1, v2}, Lo/feb;->t(D)I

    move-result v0

    return v0
.end method

.method public static c(DBI)I
    .locals 3

    .line 681
    invoke-static {p0, p1, p2, p3}, Lo/feb;->b(DBI)D

    move-result-wide v1

    .line 682
    invoke-static {v1, v2}, Lo/feb;->q(D)I

    move-result v0

    return v0
.end method

.method public static c()[Ljava/lang/String;
    .locals 3

    .line 31
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "18.5"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "24.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "28.0"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static c(BI)[Ljava/lang/String;
    .locals 3

    .line 595
    const/4 v0, 0x1

    if-ne p0, v0, :cond_2

    .line 596
    const/16 v0, 0xa0

    if-ge p1, v0, :cond_0

    .line 597
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "38.5"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "46.5"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 598
    :cond_0
    const/16 v0, 0xaa

    if-ge p1, v0, :cond_1

    .line 599
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "44.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "52.4"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 601
    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "49.4"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "59.4"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 604
    :cond_2
    const/16 v0, 0x96

    if-ge p1, v0, :cond_3

    .line 605
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "21.9"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "34.7"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 606
    :cond_3
    const/16 v0, 0xa0

    if-ge p1, v0, :cond_4

    .line 607
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "32.9"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "37.5"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 609
    :cond_4
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "36.5"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "42.5"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static d(D)D
    .locals 4

    .line 149
    const-wide/high16 v0, 0x4040000000000000L    # 32.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 153
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 154
    const-wide/16 v0, 0x0

    sub-double v0, p0, v0

    const-wide v2, 0x4032800000000000L    # 18.5

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0

    .line 155
    :cond_0
    const-wide/high16 v0, 0x4039000000000000L    # 25.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    .line 156
    const-wide v0, 0x4032800000000000L    # 18.5

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x401a000000000000L    # 6.5

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 157
    :cond_1
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_2

    .line 158
    const-wide/high16 v0, 0x4039000000000000L    # 25.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 160
    :cond_2
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public static d(DIB)D
    .locals 11

    .line 323
    const/16 v0, 0x12

    if-ge p2, v0, :cond_0

    .line 324
    const/16 p2, 0x12

    goto :goto_0

    .line 325
    :cond_0
    const/16 v0, 0x50

    if-le p2, v0, :cond_1

    .line 326
    const/16 p2, 0x50

    .line 329
    :cond_1
    :goto_0
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 330
    const/4 v0, 0x1

    if-ne p3, v0, :cond_5

    .line 331
    const/16 v0, 0x1d

    if-gt p2, v0, :cond_2

    .line 332
    const v8, 0x44c1c000    # 1550.0f

    goto :goto_1

    .line 333
    :cond_2
    const/16 v0, 0x31

    if-gt p2, v0, :cond_3

    .line 334
    const v8, 0x44bb8000    # 1500.0f

    goto :goto_1

    .line 335
    :cond_3
    const/16 v0, 0x45

    if-gt p2, v0, :cond_4

    .line 336
    const v8, 0x44a8c000    # 1350.0f

    goto :goto_1

    .line 338
    :cond_4
    const v8, 0x44988000    # 1220.0f

    goto :goto_1

    .line 341
    :cond_5
    const/16 v0, 0x1d

    if-gt p2, v0, :cond_6

    .line 342
    const v8, 0x44974000    # 1210.0f

    goto :goto_1

    .line 343
    :cond_6
    const/16 v0, 0x31

    if-gt p2, v0, :cond_7

    .line 344
    const v8, 0x44924000    # 1170.0f

    goto :goto_1

    .line 345
    :cond_7
    const/16 v0, 0x45

    if-gt p2, v0, :cond_8

    .line 346
    const v8, 0x448ac000    # 1110.0f

    goto :goto_1

    .line 348
    :cond_8
    const v8, 0x447c8000    # 1010.0f

    .line 351
    :goto_1
    const v0, 0x3f8ccccd    # 1.1f

    mul-float v6, v8, v0

    .line 352
    const v0, 0x3f666666    # 0.9f

    mul-float v7, v8, v0

    .line 354
    const-wide/16 v9, 0x0

    .line 356
    move-wide v0, p0

    move v2, v6

    move v3, v7

    move-wide v4, v9

    const-wide/16 v4, 0x0

    invoke-static/range {v0 .. v5}, Lo/feb;->e(DFFD)D

    move-result-wide v9

    .line 357
    return-wide v9
.end method

.method public static d(DBI)I
    .locals 3

    .line 734
    invoke-static {p0, p1, p2, p3}, Lo/feb;->a(DBI)D

    move-result-wide v1

    .line 735
    invoke-static {v1, v2}, Lo/feb;->t(D)I

    move-result v0

    return v0
.end method

.method public static d()[Ljava/lang/String;
    .locals 3

    .line 512
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "30"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "60"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "80"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static d(B)[Ljava/lang/String;
    .locals 3

    .line 76
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 77
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "50.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "65.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 79
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "45.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "60.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static d(BF)[Ljava/lang/String;
    .locals 6

    .line 523
    const/4 v5, 0x0

    .line 525
    const/4 v0, 0x1

    if-ne p0, v0, :cond_2

    .line 526
    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 527
    const/high16 v5, 0x40200000    # 2.5f

    goto :goto_0

    .line 528
    :cond_0
    const/high16 v0, 0x42960000    # 75.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 529
    const v5, 0x4039999a    # 2.9f

    goto :goto_0

    .line 531
    :cond_1
    const v5, 0x404ccccd    # 3.2f

    goto :goto_0

    .line 534
    :cond_2
    const/high16 v0, 0x42340000    # 45.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_3

    .line 535
    const v5, 0x3fe66666    # 1.8f

    goto :goto_0

    .line 536
    :cond_3
    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_4

    .line 537
    const v5, 0x400ccccd    # 2.2f

    goto :goto_0

    .line 539
    :cond_4
    const/high16 v5, 0x40200000    # 2.5f

    .line 542
    :goto_0
    const v0, 0x3f933333    # 1.15f

    mul-float v3, v5, v0

    .line 543
    const v0, 0x3f59999a    # 0.85f

    mul-float v4, v5, v0

    .line 544
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v3, v0, v1

    .line 545
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v4, v0, v1

    .line 546
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static e(D)D
    .locals 4

    .line 127
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 131
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 132
    const-wide/16 v0, 0x0

    sub-double v0, p0, v0

    const-wide v2, 0x4032800000000000L    # 18.5

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0

    .line 133
    :cond_0
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    .line 134
    const-wide v0, 0x4032800000000000L    # 18.5

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4016000000000000L    # 5.5

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 135
    :cond_1
    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_2

    .line 136
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 138
    :cond_2
    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public static e(DB)D
    .locals 6

    .line 292
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 293
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 294
    const-wide v0, 0x4041800000000000L    # 35.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double v4, v0, v2

    goto/16 :goto_0

    .line 295
    :cond_0
    const-wide v0, 0x4050400000000000L    # 65.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_1

    .line 296
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    add-double v4, v0, v2

    goto :goto_0

    .line 298
    :cond_1
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 299
    const-wide v0, 0x4050400000000000L    # 65.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fe570a3e0000000L    # 0.6700000166893005

    add-double v4, v0, v2

    goto :goto_0

    .line 302
    :cond_2
    const-wide v0, 0x4046800000000000L    # 45.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_3

    .line 303
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    .line 304
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double v4, v0, v2

    goto :goto_0

    .line 305
    :cond_3
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_4

    .line 306
    const-wide v0, 0x4046800000000000L    # 45.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    add-double v4, v0, v2

    goto :goto_0

    .line 308
    :cond_4
    const-wide v0, 0x4052c00000000000L    # 75.0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 309
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fe570a3e0000000L    # 0.6700000166893005

    add-double v4, v0, v2

    .line 312
    :goto_0
    return-wide v4
.end method

.method public static e(DBI)D
    .locals 10

    .line 462
    const-wide/16 v8, 0x0

    .line 463
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 464
    const/16 v0, 0xa0

    if-ge p3, v0, :cond_0

    .line 465
    const v6, 0x41a9999a    # 21.2f

    .line 466
    const v7, 0x41d4cccd    # 26.6f

    goto :goto_0

    .line 467
    :cond_0
    const/16 v0, 0xaa

    if-ge p3, v0, :cond_1

    .line 468
    const v6, 0x41c66666    # 24.8f

    .line 469
    const v7, 0x420a6666    # 34.6f

    goto :goto_0

    .line 471
    :cond_1
    const v6, 0x41eccccd    # 29.6f

    .line 472
    const v7, 0x422ccccd    # 43.2f

    goto :goto_0

    .line 475
    :cond_2
    const/16 v0, 0x96

    if-ge p3, v0, :cond_3

    .line 476
    const/high16 v6, 0x41800000    # 16.0f

    .line 477
    const v7, 0x41a4cccd    # 20.6f

    goto :goto_0

    .line 478
    :cond_3
    const/16 v0, 0xa0

    if-ge p3, v0, :cond_4

    .line 479
    const v6, 0x41973333    # 18.9f

    .line 480
    const v7, 0x41bd999a    # 23.7f

    goto :goto_0

    .line 482
    :cond_4
    const v6, 0x41b0cccd    # 22.1f

    .line 483
    const v7, 0x41f26666    # 30.3f

    .line 486
    :goto_0
    move-wide v0, p0

    move v2, v7

    move v3, v6

    move-wide v4, v8

    const-wide/16 v4, 0x0

    invoke-static/range {v0 .. v5}, Lo/feb;->e(DFFD)D

    move-result-wide v8

    .line 487
    return-wide v8
.end method

.method private static e(DFFD)D
    .locals 4

    .line 361
    float-to-double v0, p3

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 362
    const-wide/16 v0, 0x0

    sub-double v0, p0, v0

    float-to-double v2, p3

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double p4, v0, v2

    goto :goto_0

    .line 363
    :cond_0
    float-to-double v0, p3

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    float-to-double v0, p2

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_1

    .line 364
    float-to-double v0, p3

    sub-double v0, p0, v0

    sub-float v2, p2, p3

    float-to-double v2, v2

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    add-double p4, v0, v2

    goto :goto_0

    .line 365
    :cond_1
    float-to-double v0, p2

    cmpl-double v0, p0, v0

    if-lez v0, :cond_2

    .line 366
    float-to-double v0, p2

    sub-double v0, p0, v0

    sub-float v2, p2, p3

    float-to-double v2, v2

    div-double/2addr v0, v2

    const-wide v2, 0x3fd51eb860000000L    # 0.33000001311302185

    mul-double/2addr v0, v2

    const-wide v2, 0x3fe570a3e0000000L    # 0.6700000166893005

    add-double p4, v0, v2

    .line 367
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {p4, p5, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p4

    .line 369
    :cond_2
    :goto_0
    return-wide p4
.end method

.method private static e(ID)D
    .locals 2

    .line 235
    const/16 v0, 0x27

    if-gt p0, v0, :cond_0

    .line 236
    invoke-static {p1, p2}, Lo/feb;->r(D)D

    move-result-wide v0

    return-wide v0

    .line 237
    :cond_0
    const/16 v0, 0x3b

    if-gt p0, v0, :cond_1

    .line 238
    invoke-static {p1, p2}, Lo/feb;->m(D)D

    move-result-wide v0

    return-wide v0

    .line 240
    :cond_1
    invoke-static {p1, p2}, Lo/feb;->p(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)I
    .locals 13

    .line 647
    const-string v0, "MeasureStandUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getBondedProducts "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    const/4 v8, 0x0

    .line 649
    const/4 v9, 0x0

    .line 650
    const/4 v10, 0x0

    .line 652
    const-string v0, "device.db"

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, v0, v1, v2}, Landroid/content/Context;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v9, v0

    .line 653
    move-object v0, v9

    const-string v1, "device"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "productId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "kind = \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 655
    const-string v0, "MeasureStandUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getBondedProducts cur "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 657
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 664
    :cond_0
    if-eqz v10, :cond_1

    .line 665
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 667
    :cond_1
    if-eqz v9, :cond_6

    .line 668
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto/16 :goto_1

    .line 659
    :catch_0
    move-exception v11

    .line 660
    const-string v0, "MeasureStandUtils"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBondedProducts SQLException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Landroid/database/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 664
    if-eqz v10, :cond_2

    .line 665
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 667
    :cond_2
    if-eqz v9, :cond_6

    .line 668
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 661
    :catch_1
    move-exception v11

    .line 662
    const-string v0, "MeasureStandUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBondedProducts Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 664
    if-eqz v10, :cond_3

    .line 665
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 667
    :cond_3
    if-eqz v9, :cond_6

    .line 668
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 664
    :catchall_0
    move-exception v12

    if-eqz v10, :cond_4

    .line 665
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 667
    :cond_4
    if-eqz v9, :cond_5

    .line 668
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 670
    :cond_5
    throw v12

    .line 671
    :cond_6
    :goto_1
    const-string v0, "MeasureStandUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getBondedProducts end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    return v8
.end method

.method public static e()[Ljava/lang/String;
    .locals 3

    .line 394
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "16.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "20.0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static e(BI)[Ljava/lang/String;
    .locals 3

    .line 620
    const/4 v0, 0x1

    if-ne p0, v0, :cond_2

    .line 621
    const/16 v0, 0xa0

    if-ge p1, v0, :cond_0

    .line 622
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "21.2"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "26.6"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 623
    :cond_0
    const/16 v0, 0xaa

    if-ge p1, v0, :cond_1

    .line 624
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "24.8"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "34.6"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 626
    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "29.6"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "43.2"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 629
    :cond_2
    const/16 v0, 0x96

    if-ge p1, v0, :cond_3

    .line 630
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "16.0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "20.6"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 631
    :cond_3
    const/16 v0, 0xa0

    if-ge p1, v0, :cond_4

    .line 632
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "18.9"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "23.7"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0

    .line 634
    :cond_4
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "22.1"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "30.3"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static e(IB)[Ljava/lang/String;
    .locals 6

    .line 90
    const/4 v3, 0x0

    .line 91
    const/4 v4, 0x0

    .line 93
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 94
    const/16 v0, 0x1d

    if-gt p0, v0, :cond_0

    .line 95
    const v5, 0x44c1c000    # 1550.0f

    goto :goto_0

    .line 96
    :cond_0
    const/16 v0, 0x31

    if-gt p0, v0, :cond_1

    .line 97
    const v5, 0x44bb8000    # 1500.0f

    goto :goto_0

    .line 98
    :cond_1
    const/16 v0, 0x45

    if-gt p0, v0, :cond_2

    .line 99
    const v5, 0x44a8c000    # 1350.0f

    goto :goto_0

    .line 101
    :cond_2
    const v5, 0x44988000    # 1220.0f

    goto :goto_0

    .line 104
    :cond_3
    const/16 v0, 0x1d

    if-gt p0, v0, :cond_4

    .line 105
    const v5, 0x44974000    # 1210.0f

    goto :goto_0

    .line 106
    :cond_4
    const/16 v0, 0x31

    if-gt p0, v0, :cond_5

    .line 107
    const v5, 0x44924000    # 1170.0f

    goto :goto_0

    .line 108
    :cond_5
    const/16 v0, 0x45

    if-gt p0, v0, :cond_6

    .line 109
    const v5, 0x448ac000    # 1110.0f

    goto :goto_0

    .line 111
    :cond_6
    const v5, 0x447c8000    # 1010.0f

    .line 114
    :goto_0
    const v0, 0x3f8ccccd    # 1.1f

    mul-float v3, v5, v0

    .line 115
    const v0, 0x3f666666    # 0.9f

    mul-float v4, v5, v0

    .line 117
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/feb;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/feb;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static f(D)I
    .locals 3

    .line 758
    invoke-static {p0, p1}, Lo/feb;->a(D)D

    move-result-wide v1

    .line 759
    invoke-static {v1, v2}, Lo/feb;->t(D)I

    move-result v0

    return v0
.end method

.method public static g(D)I
    .locals 3

    .line 768
    invoke-static {p0, p1}, Lo/feb;->b(D)D

    move-result-wide v1

    .line 769
    invoke-static {v1, v2}, Lo/feb;->q(D)I

    move-result v0

    return v0
.end method

.method public static g(DBI)I
    .locals 3

    .line 742
    invoke-static {p0, p1, p2, p3}, Lo/feb;->e(DBI)D

    move-result-wide v1

    .line 743
    invoke-static {v1, v2}, Lo/feb;->t(D)I

    move-result v0

    return v0
.end method

.method public static h(D)I
    .locals 3

    .line 697
    invoke-static {p0, p1}, Lo/feb;->d(D)D

    move-result-wide v1

    .line 698
    invoke-static {v1, v2}, Lo/feb;->q(D)I

    move-result v0

    return v0
.end method

.method public static i(D)I
    .locals 3

    .line 689
    invoke-static {p0, p1}, Lo/feb;->e(D)D

    move-result-wide v1

    .line 690
    invoke-static {v1, v2}, Lo/feb;->q(D)I

    move-result v0

    return v0
.end method

.method public static k(D)I
    .locals 3

    .line 726
    invoke-static {p0, p1}, Lo/feb;->c(D)D

    move-result-wide v1

    .line 727
    invoke-static {v1, v2}, Lo/feb;->q(D)I

    move-result v0

    return v0
.end method

.method private static l(D)D
    .locals 4

    .line 206
    const-wide/high16 v0, 0x403b000000000000L    # 27.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 207
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 208
    const-wide/high16 v0, 0x403b000000000000L    # 27.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4037000000000000L    # 23.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0

    .line 209
    :cond_0
    const-wide/high16 v0, 0x4036000000000000L    # 22.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 210
    const-wide/high16 v0, 0x4036000000000000L    # 22.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 211
    :cond_1
    const-wide/high16 v0, 0x4026000000000000L    # 11.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 212
    const-wide/high16 v0, 0x4026000000000000L    # 11.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4026000000000000L    # 11.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 214
    :cond_2
    const-wide/high16 v0, 0x4026000000000000L    # 11.0

    div-double v0, p0, v0

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method private static m(D)D
    .locals 4

    .line 258
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 259
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 260
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0

    .line 261
    :cond_0
    const-wide v0, 0x4041800000000000L    # 35.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 262
    const-wide v0, 0x4041800000000000L    # 35.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 263
    :cond_1
    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 264
    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x402c000000000000L    # 14.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 266
    :cond_2
    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    div-double v0, p0, v0

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method private static n(D)D
    .locals 4

    .line 193
    const-wide/high16 v0, 0x403d000000000000L    # 29.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 194
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 195
    const-wide/high16 v0, 0x403d000000000000L    # 29.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4035000000000000L    # 21.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0

    .line 196
    :cond_0
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 197
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 198
    :cond_1
    const-wide/high16 v0, 0x402a000000000000L    # 13.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 199
    const-wide/high16 v0, 0x402a000000000000L    # 13.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4026000000000000L    # 11.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 201
    :cond_2
    const-wide/high16 v0, 0x402a000000000000L    # 13.0

    div-double v0, p0, v0

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method private static o(D)D
    .locals 4

    .line 219
    const-wide/high16 v0, 0x403a000000000000L    # 26.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 220
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 221
    const-wide/high16 v0, 0x403a000000000000L    # 26.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4038000000000000L    # 24.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0

    .line 222
    :cond_0
    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 223
    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 224
    :cond_1
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 225
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4026000000000000L    # 11.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 227
    :cond_2
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    div-double v0, p0, v0

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method private static p(D)D
    .locals 4

    .line 245
    const-wide v0, 0x4044800000000000L    # 41.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 246
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 247
    const-wide v0, 0x4044800000000000L    # 41.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4022000000000000L    # 9.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0

    .line 248
    :cond_0
    const-wide/high16 v0, 0x4042000000000000L    # 36.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 249
    const-wide/high16 v0, 0x4042000000000000L    # 36.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 250
    :cond_1
    const-wide/high16 v0, 0x4036000000000000L    # 22.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 251
    const-wide/high16 v0, 0x4036000000000000L    # 22.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x402c000000000000L    # 14.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 253
    :cond_2
    const-wide/high16 v0, 0x4036000000000000L    # 22.0

    div-double v0, p0, v0

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method private static q(D)I
    .locals 2

    .line 778
    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    mul-double/2addr p0, v0

    .line 779
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    .line 780
    const/4 v0, 0x4

    return v0

    .line 781
    :cond_0
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    .line 782
    const/4 v0, 0x3

    return v0

    .line 783
    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_2

    .line 784
    const/4 v0, 0x2

    return v0

    .line 786
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private static r(D)D
    .locals 4

    .line 271
    const-wide v0, 0x4043800000000000L    # 39.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 272
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    .line 273
    const-wide v0, 0x4043800000000000L    # 39.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4026000000000000L    # 11.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    add-double/2addr v0, v2

    return-wide v0

    .line 274
    :cond_0
    const-wide/high16 v0, 0x4041000000000000L    # 34.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 275
    const-wide/high16 v0, 0x4041000000000000L    # 34.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    return-wide v0

    .line 276
    :cond_1
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 277
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    sub-double v0, p0, v0

    const-wide/high16 v2, 0x402c000000000000L    # 14.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    add-double/2addr v0, v2

    return-wide v0

    .line 279
    :cond_2
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    div-double v0, p0, v0

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method private static t(D)I
    .locals 2

    .line 796
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    mul-double/2addr p0, v0

    .line 797
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    .line 798
    const/4 v0, 0x3

    return v0

    .line 799
    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    .line 800
    const/4 v0, 0x2

    return v0

    .line 802
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
