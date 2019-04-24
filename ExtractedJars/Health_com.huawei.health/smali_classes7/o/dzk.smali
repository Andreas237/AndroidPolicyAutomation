.class public Lo/dzk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const-string v0, "#FF7FBEFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/dzk;->b:I

    .line 35
    const-string v0, "#FF007DFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/dzk;->e:I

    .line 36
    const-string v0, "#FFA3E5A3"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/dzk;->c:I

    .line 37
    const-string v0, "#FF47CC47"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/dzk;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;IIIJ)Ljava/lang/String;
    .locals 9

    .line 400
    const-string v7, ""

    .line 401
    const/4 v8, 0x0

    .line 402
    if-eqz p2, :cond_0

    .line 403
    sub-int v0, p1, p2

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    int-to-float v1, p2

    div-float v8, v0, v1

    .line 406
    :cond_0
    if-nez p3, :cond_8

    .line 407
    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, v8, v0

    if-ltz v0, :cond_2

    .line 408
    const-string v0, "ai-achievereport-001"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x11170

    if-le p1, v0, :cond_1

    .line 409
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-001"

    const-string v2, "steps_up_10_percent"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_up:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    float-to-double v3, v8

    .line 410
    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 412
    :cond_1
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_walk_up_compare:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    float-to-double v2, v8

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 415
    :cond_2
    :goto_0
    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-nez v0, :cond_3

    .line 416
    const-string v7, ""

    .line 418
    :cond_3
    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-lez v0, :cond_5

    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_5

    .line 419
    const-string v0, "ai-achievereport-001"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 420
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-001"

    const-string v2, "steps_steady"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_up:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    float-to-double v3, v8

    .line 421
    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 423
    :cond_4
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_walk_up_compare:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    float-to-double v2, v8

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 426
    :cond_5
    :goto_1
    const/4 v0, 0x0

    cmpg-float v0, v8, v0

    if-gez v0, :cond_7

    const/high16 v0, -0x3ee00000    # -10.0f

    cmpl-float v0, v8, v0

    if-lez v0, :cond_7

    .line 427
    const-string v0, "ai-achievereport-001"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 428
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-001"

    const-string v2, "steps_steady"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_down:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    neg-float v3, v8

    float-to-double v3, v3

    .line 429
    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    .line 431
    :cond_6
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_walk_down_compare:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    neg-float v2, v8

    float-to-double v2, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 434
    :cond_7
    :goto_2
    const/high16 v0, -0x3ee00000    # -10.0f

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_10

    .line 435
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_walk_down_compare:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    neg-float v2, v8

    float-to-double v2, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_6

    .line 438
    :cond_8
    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, v8, v0

    if-ltz v0, :cond_a

    .line 439
    const-string v0, "ai-achievereport-002"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const v0, 0x493e0

    if-le p1, v0, :cond_9

    .line 440
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-002"

    const-string v2, "steps_up_10_percent"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_up:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 441
    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    float-to-double v3, v8

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    .line 443
    :cond_9
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_walk_up_compare:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    float-to-double v2, v8

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 446
    :cond_a
    :goto_3
    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-nez v0, :cond_b

    .line 447
    const-string v7, ""

    .line 449
    :cond_b
    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-lez v0, :cond_d

    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_d

    .line 450
    const-string v0, "ai-achievereport-002"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 451
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-002"

    const-string v2, "steps_steady"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_up:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 452
    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    float-to-double v3, v8

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    .line 454
    :cond_c
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_walk_up_compare:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    float-to-double v2, v8

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 457
    :cond_d
    :goto_4
    const/4 v0, 0x0

    cmpg-float v0, v8, v0

    if-gez v0, :cond_f

    const/high16 v0, -0x3ee00000    # -10.0f

    cmpl-float v0, v8, v0

    if-lez v0, :cond_f

    .line 458
    const-string v0, "ai-achievereport-002"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 459
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-002"

    const-string v2, "steps_steady"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_down:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 460
    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    neg-float v3, v8

    float-to-double v3, v3

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_5

    .line 462
    :cond_e
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_walk_down_compare:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    neg-float v2, v8

    float-to-double v2, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 465
    :cond_f
    :goto_5
    const/high16 v0, -0x3ee00000    # -10.0f

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_10

    .line 466
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_walk_down_compare:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    neg-float v2, v8

    float-to-double v2, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 469
    :cond_10
    :goto_6
    return-object v7
.end method

.method public static a(Landroid/content/Context;J)Ljava/lang/String;
    .locals 5

    .line 375
    const/16 v3, 0x30

    .line 378
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 379
    invoke-virtual {v4, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 380
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 613
    const/4 v4, 0x0

    .line 614
    const-string v0, "30004"

    invoke-static {p0, v0, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 615
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 617
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 618
    const-string v0, "enable"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v7

    .line 619
    if-eqz v7, :cond_0

    .line 620
    const-string v0, "params"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 621
    invoke-virtual {v8, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 625
    :cond_0
    goto :goto_0

    .line 623
    :catch_0
    move-exception v6

    .line 624
    const-string v0, "AchieveReportUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRuleOpen JSONException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    :cond_1
    :goto_0
    return-object v4
.end method

.method public static a(JJ)Z
    .locals 4

    .line 125
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 126
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 127
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 128
    invoke-virtual {v3, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 129
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(J)I
    .locals 2

    .line 330
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 331
    invoke-virtual {v1, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 332
    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v0

    return v0
.end method

.method public static b(IIJZ)J
    .locals 3

    .line 291
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 292
    if-eqz p4, :cond_0

    .line 293
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    goto :goto_0

    .line 295
    :cond_0
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 298
    :goto_0
    invoke-virtual {v2, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 299
    mul-int/lit8 v0, p1, -0x7

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 300
    const/4 v0, 0x1

    if-ne p0, v0, :cond_2

    .line 301
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 302
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 303
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 304
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 305
    if-eqz p4, :cond_1

    .line 306
    const/4 v0, 0x7

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_1

    .line 308
    :cond_1
    const/4 v0, 0x7

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_1

    .line 311
    :cond_2
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 312
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 313
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 314
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 315
    if-eqz p4, :cond_3

    .line 316
    const/4 v0, 0x7

    const/4 v1, 0x7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_1

    .line 318
    :cond_3
    const/4 v0, 0x7

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 321
    :goto_1
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static b(Landroid/content/Context;IIIJ)Ljava/lang/String;
    .locals 10

    .line 494
    const-string v7, ""

    .line 495
    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    .line 496
    if-eqz p2, :cond_0

    .line 497
    sub-int v0, p1, p2

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    int-to-float v1, p2

    div-float/2addr v0, v1

    float-to-double v8, v0

    .line 499
    :cond_0
    if-nez p3, :cond_9

    .line 500
    const-wide/16 v0, 0x0

    cmpl-double v0, v8, v0

    if-nez v0, :cond_1

    .line 501
    const-string v7, ""

    .line 503
    :cond_1
    const-wide/16 v0, 0x0

    cmpl-double v0, v8, v0

    if-lez v0, :cond_3

    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpg-double v0, v8, v0

    if-gez v0, :cond_3

    .line 504
    const-string v0, "ai-achievereport-001"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 505
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-001"

    const-string v2, "run_steady"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_up:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 506
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v8, v9, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 508
    :cond_2
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_run_up_compare:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v8, v9, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 511
    :cond_3
    :goto_0
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpl-double v0, v8, v0

    if-ltz v0, :cond_5

    .line 512
    const-string v0, "ai-achievereport-001"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 513
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-001"

    const-string v2, "run_up_20_percent"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_up:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 514
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v8, v9, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 516
    :cond_4
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_run_up_compare:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v8, v9, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 519
    :cond_5
    :goto_1
    const-wide/16 v0, 0x0

    cmpg-double v0, v8, v0

    if-gez v0, :cond_7

    const-wide/high16 v0, -0x3fcc000000000000L    # -20.0

    cmpl-double v0, v8, v0

    if-lez v0, :cond_7

    .line 520
    const-string v0, "ai-achievereport-001"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 521
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-001"

    const-string v2, "run_steady"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_down:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    neg-double v3, v8

    .line 522
    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    .line 524
    :cond_6
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_run_down_compare:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    neg-double v2, v8

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 527
    :cond_7
    :goto_2
    const-wide/high16 v0, -0x3fcc000000000000L    # -20.0

    cmpg-double v0, v8, v0

    if-gtz v0, :cond_12

    .line 528
    const-string v0, "ai-achievereport-001"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 529
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-001"

    const-string v2, "run_down_20_percent"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_down:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    neg-double v3, v8

    .line 530
    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_6

    .line 532
    :cond_8
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_run_down_compare:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    neg-double v2, v8

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_6

    .line 536
    :cond_9
    const-wide/16 v0, 0x0

    cmpl-double v0, v8, v0

    if-nez v0, :cond_a

    .line 537
    const-string v7, ""

    .line 539
    :cond_a
    const-wide/16 v0, 0x0

    cmpl-double v0, v8, v0

    if-lez v0, :cond_c

    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpg-double v0, v8, v0

    if-gez v0, :cond_c

    .line 540
    const-string v0, "ai-achievereport-002"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 541
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-002"

    const-string v2, "run_steady"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_up:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 542
    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v8, v9, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    .line 544
    :cond_b
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_run_up_compare:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v8, v9, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 547
    :cond_c
    :goto_3
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpl-double v0, v8, v0

    if-ltz v0, :cond_e

    .line 548
    const-string v0, "ai-achievereport-002"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 549
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-002"

    const-string v2, "run_up_20_percent"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_up:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 550
    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v8, v9, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    .line 552
    :cond_d
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_run_up_compare:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v8, v9, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 555
    :cond_e
    :goto_4
    const-wide/16 v0, 0x0

    cmpg-double v0, v8, v0

    if-gez v0, :cond_10

    const-wide/high16 v0, -0x3fcc000000000000L    # -20.0

    cmpl-double v0, v8, v0

    if-lez v0, :cond_10

    .line 556
    const-string v0, "ai-achievereport-002"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 557
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-002"

    const-string v2, "run_steady"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_down:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 558
    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    neg-double v3, v8

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_5

    .line 560
    :cond_f
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_run_down_compare:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    neg-double v2, v8

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 563
    :cond_10
    :goto_5
    const-wide/high16 v0, -0x3fcc000000000000L    # -20.0

    cmpg-double v0, v8, v0

    if-gtz v0, :cond_12

    .line 564
    const-string v0, "ai-achievereport-002"

    invoke-static {p0, v0}, Lo/dzk;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 565
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ai-achievereport-002"

    const-string v2, "run_down_20_percent"

    invoke-static {p0, v1, v2}, Lo/dzk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_down:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 566
    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    neg-double v3, v8

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_6

    .line 568
    :cond_11
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_month_run_down_compare:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p4, p5}, Lo/dzk;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    neg-double v2, v8

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 572
    :cond_12
    :goto_6
    return-object v7
.end method

.method public static b(JJ)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 133
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 134
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 135
    invoke-virtual {v5, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 136
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    invoke-static {p0, p1, p2, p3}, Lo/dzk;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    const/4 v6, 0x1

    :goto_0
    const/4 v0, 0x7

    if-ge v6, v0, :cond_0

    .line 139
    int-to-long v0, v6

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    add-long/2addr v0, p0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 140
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getDate()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    goto :goto_3

    .line 143
    :cond_1
    const/4 v6, 0x1

    :goto_1
    const/4 v0, 0x7

    if-ge v6, v0, :cond_3

    .line 144
    int-to-long v0, v6

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    add-long/2addr v0, p0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 145
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getDate()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 146
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 148
    :cond_2
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getDate()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 152
    :cond_3
    :goto_3
    return-object v4
.end method

.method public static c(IIZ)J
    .locals 3

    .line 257
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 258
    if-eqz p2, :cond_0

    .line 259
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    goto :goto_0

    .line 261
    :cond_0
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 264
    :goto_0
    mul-int/lit8 v0, p1, -0x7

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 265
    const/4 v0, 0x1

    if-ne p0, v0, :cond_2

    .line 266
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 267
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 268
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 269
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 270
    if-eqz p2, :cond_1

    .line 271
    const/4 v0, 0x7

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_1

    .line 273
    :cond_1
    const/4 v0, 0x7

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_1

    .line 276
    :cond_2
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 277
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 278
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 279
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 280
    if-eqz p2, :cond_3

    .line 281
    const/4 v0, 0x7

    const/4 v1, 0x7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_1

    .line 283
    :cond_3
    const/4 v0, 0x7

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 286
    :goto_1
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c(IJI)J
    .locals 3

    .line 236
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 237
    invoke-virtual {v2, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 238
    const/4 v0, 0x2

    invoke-virtual {v2, v0, p0}, Ljava/util/Calendar;->add(II)V

    .line 239
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 240
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->getActualMinimum(I)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 241
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 242
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 243
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 244
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 246
    :cond_0
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 247
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 248
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 249
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 250
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 252
    :goto_0
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c(J)Ljava/lang/String;
    .locals 3

    .line 367
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 368
    invoke-virtual {v1, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 369
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/MM/dd"

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 370
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(JIZ)J
    .locals 3

    .line 190
    if-eqz p3, :cond_0

    .line 191
    invoke-static {p0, p1, p2}, Lo/dzk;->e(JI)J

    move-result-wide v0

    return-wide v0

    .line 194
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 195
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 196
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 197
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 198
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 199
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 200
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 201
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 202
    const/4 v0, 0x7

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 203
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0

    .line 205
    :cond_1
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 206
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 207
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 208
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 209
    const/4 v0, 0x7

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 210
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(JJ)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 156
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 157
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 158
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 159
    invoke-virtual {v5, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 160
    invoke-virtual {v6, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 161
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getDate()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v7, v0, :cond_0

    .line 162
    int-to-long v0, v7

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    add-long/2addr v0, p0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 163
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getDate()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 170
    :sswitch_0
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    goto :goto_2

    .line 173
    :goto_1
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 178
    :cond_0
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x6 -> :sswitch_0
        0xb -> :sswitch_0
        0x10 -> :sswitch_0
        0x15 -> :sswitch_0
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    .line 596
    const/4 v4, 0x0

    .line 597
    invoke-static {p0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 598
    const/4 v0, 0x0

    return v0

    .line 600
    :cond_0
    const-string v0, "30004"

    invoke-static {p0, v0, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 601
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 603
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 604
    const-string v0, "enable"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 607
    goto :goto_0

    .line 605
    :catch_0
    move-exception v6

    .line 606
    const-string v0, "AchieveReportUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRuleOpen JSONException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    :cond_1
    :goto_0
    return v4
.end method

.method public static e(JI)J
    .locals 3

    .line 215
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 216
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 217
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 218
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 219
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 220
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 221
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 222
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 223
    const/4 v0, 0x7

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 224
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0

    .line 226
    :cond_0
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 227
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 228
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 229
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 230
    const/4 v0, 0x7

    const/4 v1, 0x7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 231
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method
