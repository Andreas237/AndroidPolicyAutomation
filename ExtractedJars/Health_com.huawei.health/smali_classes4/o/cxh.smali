.class public Lo/cxh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:D

.field private static b:D

.field private static c:D

.field private static d:D

.field private static e:D

.field private static f:D

.field private static g:Ljava/lang/String;

.field private static h:D

.field private static i:D

.field private static k:Ljava/lang/String;

.field private static l:I

.field private static p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 35
    const-wide v0, 0x400451eb851eb852L    # 2.54

    sput-wide v0, Lo/cxh;->d:D

    .line 38
    const-wide v0, 0x3fd381d7dbf487fdL    # 0.3048

    sput-wide v0, Lo/cxh;->b:D

    .line 41
    const-wide v0, 0x3fed42c3c9eecbfbL    # 0.9144

    sput-wide v0, Lo/cxh;->c:D

    .line 44
    const-wide v0, 0x3ff9bfdf7e8038a0L    # 1.609344

    sput-wide v0, Lo/cxh;->e:D

    .line 59
    const-wide v0, 0x3fd932617c1bda51L    # 0.3937

    sput-wide v0, Lo/cxh;->a:D

    .line 62
    const-wide v0, 0x400a3f141205bc02L    # 3.2808

    sput-wide v0, Lo/cxh;->h:D

    .line 65
    const-wide v0, 0x3ff17f62b6ae7d56L    # 1.0936

    sput-wide v0, Lo/cxh;->f:D

    .line 68
    const-wide v0, 0x3fe3e245dad5a40cL    # 0.6213712

    sput-wide v0, Lo/cxh;->i:D

    .line 113
    const-string v0, ""

    sput-object v0, Lo/cxh;->k:Ljava/lang/String;

    .line 118
    const-string v0, "show_imperial_unit_key"

    sput-object v0, Lo/cxh;->g:Ljava/lang/String;

    .line 120
    const/4 v0, 0x0

    sput-object v0, Lo/cxh;->p:Ljava/lang/String;

    .line 125
    const/4 v0, -0x1

    sput v0, Lo/cxh;->l:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(D)D
    .locals 2

    .line 241
    const-wide v0, 0x3fdd07c84b5dcc64L    # 0.4536

    mul-double/2addr v0, p0

    return-wide v0
.end method

.method public static a(DI)D
    .locals 4

    .line 166
    const-wide/16 v2, 0x0

    .line 167
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 169
    :pswitch_0
    sget-wide v0, Lo/cxh;->a:D

    mul-double v2, p0, v0

    .line 170
    goto :goto_0

    .line 172
    :pswitch_1
    sget-wide v0, Lo/cxh;->h:D

    mul-double v2, p0, v0

    .line 173
    goto :goto_0

    .line 175
    :pswitch_2
    sget-wide v0, Lo/cxh;->f:D

    mul-double v2, p0, v0

    .line 176
    goto :goto_0

    .line 178
    :pswitch_3
    sget-wide v0, Lo/cxh;->i:D

    mul-double v2, p0, v0

    .line 179
    .line 183
    :goto_0
    return-wide v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static a(DII)Ljava/lang/String;
    .locals 8

    .line 445
    const-string v4, ""

    .line 447
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_2

    .line 449
    :sswitch_0
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v5

    .line 451
    :try_start_0
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {v5, v0}, Ljava/text/NumberFormat;->setRoundingMode(Ljava/math/RoundingMode;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 454
    goto :goto_0

    .line 452
    :catch_0
    move-exception v6

    .line 453
    const-string v0, "UnitUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    :goto_0
    const/4 v0, 0x0

    if-gt v0, p3, :cond_0

    .line 456
    invoke-virtual {v5, p3}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 457
    invoke-virtual {v5, p3}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 460
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 461
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 463
    :cond_1
    invoke-virtual {v5, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    .line 464
    goto :goto_2

    .line 466
    :sswitch_1
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v6

    .line 468
    :try_start_1
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {v6, v0}, Ljava/text/NumberFormat;->setRoundingMode(Ljava/math/RoundingMode;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 471
    goto :goto_1

    .line 469
    :catch_1
    move-exception v7

    .line 470
    const-string v0, "UnitUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    :goto_1
    const/4 v0, 0x0

    if-gt v0, p3, :cond_2

    .line 473
    invoke-virtual {v6, p3}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 474
    invoke-virtual {v6, p3}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 476
    :cond_2
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double/2addr p0, v0

    .line 477
    invoke-virtual {v6, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    .line 478
    .line 482
    :goto_2
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a()Z
    .locals 3

    .line 267
    const-string v0, "false"

    sget-object v1, Lo/cxh;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    const/4 v0, 0x0

    return v0

    .line 269
    :cond_0
    const-string v0, "true"

    sget-object v1, Lo/cxh;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 270
    const/4 v0, 0x1

    return v0

    .line 272
    :cond_1
    sget-object v0, Lo/cxh;->g:Ljava/lang/String;

    invoke-static {v0}, Lo/dck;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 273
    sput-object v2, Lo/cxh;->k:Ljava/lang/String;

    .line 274
    const-string v0, "true"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 275
    const/4 v0, 0x1

    return v0

    .line 277
    :cond_2
    const-string v0, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/cxh;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 278
    sget-object v0, Lo/cxh;->g:Ljava/lang/String;

    const-string v1, "true"

    invoke-static {v0, v1}, Lo/dck;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const-string v0, "true"

    sput-object v0, Lo/cxh;->k:Ljava/lang/String;

    .line 280
    const/4 v0, 0x1

    return v0

    .line 282
    :cond_3
    sget-object v0, Lo/cxh;->g:Ljava/lang/String;

    const-string v1, "false"

    invoke-static {v0, v1}, Lo/dck;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    const-string v0, "false"

    sput-object v0, Lo/cxh;->k:Ljava/lang/String;

    .line 284
    const/4 v0, 0x0

    return v0
.end method

.method public static b(I)Ljava/lang/String;
    .locals 8

    .line 399
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 400
    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 401
    new-instance v6, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v6, v5, v0}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 403
    const/16 v0, 0xe10

    if-le v0, p0, :cond_0

    .line 404
    const-string v0, "%02d:%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    int-to-long v2, p0

    invoke-static {v4, v2, v3}, Landroid/text/format/DateUtils;->formatElapsedTime(Ljava/lang/StringBuilder;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v7

    .line 405
    const-string v0, ":"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 406
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ":"

    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    .line 408
    :cond_0
    const v0, 0x8ca0

    if-le v0, p0, :cond_2

    .line 409
    const-wide/16 v0, 0xe10

    invoke-static {v0, v1}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const-wide/32 v1, 0x8ca0

    invoke-static {v1, v2}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 410
    int-to-long v0, p0

    invoke-static {v4, v0, v1}, Landroid/text/format/DateUtils;->formatElapsedTime(Ljava/lang/StringBuilder;J)Ljava/lang/String;

    move-result-object v7

    .line 411
    const-string v0, ":"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 412
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ":"

    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    .line 415
    :cond_1
    const-string v0, "%d%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    int-to-long v2, p0

    invoke-static {v4, v2, v3}, Landroid/text/format/DateUtils;->formatElapsedTime(Ljava/lang/StringBuilder;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v7

    .line 416
    const-string v0, ":"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 417
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ":"

    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 422
    :cond_2
    int-to-long v0, p0

    invoke-static {v4, v0, v1}, Landroid/text/format/DateUtils;->formatElapsedTime(Ljava/lang/StringBuilder;J)Ljava/lang/String;

    move-result-object v7

    .line 423
    const-string v0, ":"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 424
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ":"

    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 429
    :cond_3
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 430
    const/16 v0, 0x2e

    const/16 v1, 0x3a

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    .line 433
    :cond_4
    return-object v7
.end method

.method public static b(J)Z
    .locals 8

    .line 577
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 578
    new-instance v5, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 579
    invoke-virtual {v4, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 580
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 581
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 582
    invoke-virtual {v6, v7}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 583
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 584
    const-string v0, "UnitUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v6, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    const/4 v0, 0x1

    return v0

    .line 587
    :cond_0
    const-string v0, "UnitUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v6, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;
    .locals 10

    .line 546
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 547
    invoke-virtual {v4}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v5

    .line 548
    new-instance v0, Landroid/text/style/TextAppearanceSpan;

    invoke-direct {v0, p0, p4}, Landroid/text/style/TextAppearanceSpan;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v4, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 551
    const/4 v0, 0x2

    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v6

    .line 552
    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    .line 553
    :goto_0
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 554
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->start()I

    move-result v8

    .line 555
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->end()I

    move-result v9

    .line 556
    new-instance v0, Landroid/text/style/TextAppearanceSpan;

    invoke-direct {v0, p0, p3}, Landroid/text/style/TextAppearanceSpan;-><init>(Landroid/content/Context;I)V

    const/16 v1, 0x21

    invoke-virtual {v4, v0, v8, v9, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 557
    goto :goto_0

    .line 558
    :cond_0
    return-object v4
.end method

.method public static c(Ljava/lang/String;)V
    .locals 4

    .line 245
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 246
    const-string v0, "UnitUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setCloudVersion cloudVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    sput-object p0, Lo/cxh;->p:Ljava/lang/String;

    .line 249
    :cond_0
    return-void
.end method

.method public static c()Z
    .locals 2

    .line 290
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 291
    const/4 v0, 0x0

    return v0

    .line 293
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 294
    const-string v0, "US"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static d(DI)D
    .locals 4

    .line 139
    const-wide/16 v2, 0x0

    .line 140
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 142
    :pswitch_0
    sget-wide v0, Lo/cxh;->d:D

    mul-double v2, p0, v0

    .line 143
    goto :goto_0

    .line 145
    :pswitch_1
    sget-wide v0, Lo/cxh;->b:D

    mul-double v2, p0, v0

    .line 146
    goto :goto_0

    .line 148
    :pswitch_2
    sget-wide v0, Lo/cxh;->c:D

    mul-double v2, p0, v0

    .line 149
    goto :goto_0

    .line 151
    :pswitch_3
    sget-wide v0, Lo/cxh;->e:D

    mul-double v2, p0, v0

    .line 152
    .line 156
    :goto_0
    return-wide v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static d(I)Ljava/lang/String;
    .locals 8

    .line 371
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 372
    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 373
    new-instance v6, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v6, v5, v0}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 375
    const/16 v0, 0xe10

    if-le v0, p0, :cond_0

    .line 376
    const-string v0, "%02d:%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    int-to-long v2, p0

    invoke-static {v4, v2, v3}, Landroid/text/format/DateUtils;->formatElapsedTime(Ljava/lang/StringBuilder;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 377
    :cond_0
    const v0, 0x8ca0

    if-le v0, p0, :cond_2

    .line 378
    const-wide/16 v0, 0xe10

    invoke-static {v0, v1}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const-wide/32 v1, 0x8ca0

    invoke-static {v1, v2}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 379
    int-to-long v0, p0

    invoke-static {v4, v0, v1}, Landroid/text/format/DateUtils;->formatElapsedTime(Ljava/lang/StringBuilder;J)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 381
    :cond_1
    const-string v0, "%d%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    int-to-long v2, p0

    invoke-static {v4, v2, v3}, Landroid/text/format/DateUtils;->formatElapsedTime(Ljava/lang/StringBuilder;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 384
    :cond_2
    int-to-long v0, p0

    invoke-static {v4, v0, v1}, Landroid/text/format/DateUtils;->formatElapsedTime(Ljava/lang/StringBuilder;J)Ljava/lang/String;

    move-result-object v7

    .line 387
    :goto_0
    if-eqz v7, :cond_3

    .line 388
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 389
    const/16 v0, 0x2e

    const/16 v1, 0x3a

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 392
    :cond_3
    const-string v7, ""

    .line 395
    :cond_4
    :goto_1
    return-object v7
.end method

.method public static d(Ljava/lang/String;J)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 357
    const-string v1, ""

    .line 358
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 359
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0, p0}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 360
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 362
    :cond_0
    return-object v1
.end method

.method public static d(Ljava/util/Date;I)Ljava/lang/String;
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x3
    .end annotation

    .line 339
    const-string v4, ""

    .line 340
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 341
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 343
    :cond_0
    const-string v0, "UnitUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "formatDateAndTime error, date is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    :goto_0
    const-string v0, "UnitUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "formatDateAndTime myDateStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    return-object v4
.end method

.method public static d(Z)V
    .locals 2

    .line 303
    const-string v0, ""

    sput-object v0, Lo/cxh;->k:Ljava/lang/String;

    .line 304
    if-eqz p0, :cond_0

    .line 305
    sget-object v0, Lo/cxh;->g:Ljava/lang/String;

    const-string v1, "true"

    invoke-static {v0, v1}, Lo/dck;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 307
    :cond_0
    sget-object v0, Lo/cxh;->g:Ljava/lang/String;

    const-string v1, "false"

    invoke-static {v0, v1}, Lo/dck;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    :goto_0
    return-void
.end method

.method public static d(D)[I
    .locals 5

    .line 192
    const/4 v4, 0x2

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 193
    sget-wide v0, Lo/cxh;->h:D

    mul-double/2addr v0, p0

    double-to-int v0, v0

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 194
    sget-wide v0, Lo/cxh;->h:D

    mul-double/2addr v0, p0

    const/4 v2, 0x0

    aget v2, v4, v2

    int-to-double v2, v2

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4028000000000000L    # 12.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 195
    const/4 v0, 0x1

    aget v0, v4, v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_0

    .line 196
    const/4 v0, 0x0

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 197
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 199
    :cond_0
    return-object v4

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public static e(D)D
    .locals 2

    .line 232
    const-wide v0, 0x4001a305532617c2L    # 2.2046

    mul-double/2addr v0, p0

    return-wide v0
.end method

.method public static e(J)D
    .locals 2

    .line 568
    long-to-float v0, p0

    const v1, 0x476a6000    # 60000.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    return-wide v0
.end method

.method public static e(DIIZ)Ljava/lang/String;
    .locals 3

    .line 491
    const-string v1, ""

    .line 492
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 494
    :sswitch_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v2

    .line 495
    invoke-virtual {v2, p4}, Ljava/text/NumberFormat;->setGroupingUsed(Z)V

    .line 496
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {v2, v0}, Ljava/text/NumberFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 497
    const/4 v0, 0x0

    if-gt v0, p3, :cond_0

    .line 498
    invoke-virtual {v2, p3}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 499
    invoke-virtual {v2, p3}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 502
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 503
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 505
    :cond_1
    invoke-virtual {v2, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    .line 506
    goto :goto_0

    .line 508
    :sswitch_1
    invoke-static {p0, p1, p2, p3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    .line 509
    .line 513
    :goto_0
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public static e()Z
    .locals 1

    .line 256
    invoke-static {}, Lo/cxh;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    const/4 v0, 0x1

    return v0

    .line 259
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
