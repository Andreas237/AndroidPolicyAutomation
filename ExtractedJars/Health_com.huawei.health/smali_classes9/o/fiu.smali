.class public Lo/fiu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 1

    .line 129
    if-ltz p0, :cond_0

    const/16 v0, 0x14

    if-ge p0, v0, :cond_0

    .line 130
    const/16 v0, 0x48

    return v0

    .line 131
    :cond_0
    const/16 v0, 0x3c

    if-le p0, v0, :cond_1

    .line 132
    const/16 v0, 0x47

    return v0

    .line 134
    :cond_1
    const/16 v0, 0x49

    return v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 5

    .line 482
    sget v0, Lcom/huawei/ui/main/R$layout;->resting_heart_rate_details_dialog:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 483
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_resting_heart_rate_string:I

    .line 484
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 485
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    .line 486
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fiu$3;

    invoke-direct {v2}, Lo/fiu$3;-><init>()V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 491
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v4

    .line 492
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egw;->setCancelable(Z)V

    .line 493
    invoke-virtual {v4}, Lo/egw;->show()V

    .line 494
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V
    .locals 4

    .line 497
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 498
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 500
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 501
    const/high16 v0, 0x41600000    # 14.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 502
    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 503
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 504
    const/4 v0, 0x1

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-virtual {p2, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 505
    return-void
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    .line 392
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 393
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p0, v2, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 395
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;Landroid/content/Context;)V
    .locals 5

    .line 376
    if-eqz p1, :cond_0

    .line 377
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 378
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 379
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "SLEEPDETAIL"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 380
    const-string v0, "EXTRA_BI_NAME"

    const-string v1, "sleep_service"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 381
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 383
    invoke-static {p0, p2}, Lo/fiu;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 384
    invoke-virtual {p2, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 385
    goto :goto_0

    .line 386
    :cond_0
    const-string v0, "FitnessSleepUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " should show tips"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    :goto_0
    return-void
.end method

.method public static b(I)I
    .locals 1

    .line 182
    if-ltz p0, :cond_0

    const/16 v0, 0xa

    if-ge p0, v0, :cond_0

    .line 183
    const/16 v0, 0x48

    return v0

    .line 184
    :cond_0
    const/16 v0, 0x1e

    if-le p0, v0, :cond_1

    .line 185
    const/16 v0, 0x47

    return v0

    .line 187
    :cond_1
    const/16 v0, 0x49

    return v0
.end method

.method public static c(I)I
    .locals 1

    .line 98
    if-ltz p0, :cond_0

    const/4 v0, 0x6

    if-ge p0, v0, :cond_0

    .line 99
    const/16 v0, 0x48

    return v0

    .line 100
    :cond_0
    const/16 v0, 0xa

    if-lt p0, v0, :cond_1

    .line 101
    const/16 v0, 0x47

    return v0

    .line 103
    :cond_1
    const/16 v0, 0x49

    return v0
.end method

.method public static d(I)I
    .locals 1

    .line 156
    if-ltz p0, :cond_0

    const/16 v0, 0x37

    if-ge p0, v0, :cond_0

    .line 157
    const/16 v0, 0x49

    return v0

    .line 160
    :cond_0
    const/16 v0, 0x47

    return v0
.end method

.method public static d(Landroid/widget/TextView;)V
    .locals 3

    .line 434
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 435
    invoke-static {}, Lo/fiu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    const/16 v0, 0x10

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    goto :goto_0

    .line 438
    :cond_0
    const/16 v0, 0x50

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 440
    :goto_0
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 441
    return-void
.end method

.method public static d(Ljava/lang/String;Landroid/widget/LinearLayout;)V
    .locals 1

    .line 464
    const-string v0, "--"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    goto :goto_0

    .line 467
    :cond_0
    invoke-static {}, Lo/fiu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 468
    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    goto :goto_0

    .line 470
    :cond_1
    const/16 v0, 0x50

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 474
    :goto_0
    return-void
.end method

.method public static e(F)F
    .locals 2

    .line 513
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    .line 514
    mul-float v0, p0, v1

    return v0
.end method

.method public static e(I)I
    .locals 1

    .line 214
    if-lez p0, :cond_0

    const/16 v0, 0x14

    if-ge p0, v0, :cond_0

    .line 215
    const/4 v0, -0x1

    return v0

    .line 216
    :cond_0
    const/16 v0, 0x14

    if-lt p0, v0, :cond_1

    const/16 v0, 0x46

    if-lt p0, v0, :cond_2

    :cond_1
    if-nez p0, :cond_3

    .line 217
    :cond_2
    const/16 v0, 0x52

    return v0

    .line 218
    :cond_3
    const/16 v0, 0x64

    if-le p0, v0, :cond_4

    .line 219
    const/16 v0, 0x51

    return v0

    .line 221
    :cond_4
    const/16 v0, 0x53

    return v0
.end method

.method public static e()Z
    .locals 5

    .line 447
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    .line 448
    const-string v0, "ar"

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 449
    const-string v0, "FitnessSleepUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is Arab language"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    const/4 v0, 0x1

    return v0

    .line 452
    :cond_0
    const-string v0, "FitnessSleepUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is not Arab language"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    const/4 v0, 0x0

    return v0
.end method

.method public static f(I)I
    .locals 1

    .line 320
    if-ltz p0, :cond_0

    const/16 v0, 0x168

    if-ge p0, v0, :cond_0

    .line 321
    const/16 v0, 0x51

    return v0

    .line 323
    :cond_0
    const/16 v0, 0x53

    return v0
.end method

.method public static g(I)I
    .locals 1

    .line 363
    if-ltz p0, :cond_0

    const/16 v0, 0x168

    if-ge p0, v0, :cond_0

    .line 364
    const/16 v0, 0x52

    return v0

    .line 366
    :cond_0
    const/16 v0, 0x53

    return v0
.end method

.method public static h(I)I
    .locals 1

    .line 265
    if-ltz p0, :cond_0

    const/16 v0, 0x46

    if-ge p0, v0, :cond_0

    .line 266
    const/16 v0, 0x48

    return v0

    .line 268
    :cond_0
    const/16 v0, 0x49

    return v0
.end method

.method public static i(I)I
    .locals 1

    .line 298
    if-ltz p0, :cond_0

    const/16 v0, 0x46

    if-ge p0, v0, :cond_0

    .line 299
    const/16 v0, 0x52

    return v0

    .line 301
    :cond_0
    const/16 v0, 0x53

    return v0
.end method

.method public static k(I)I
    .locals 1

    .line 342
    if-ltz p0, :cond_0

    const/16 v0, 0x46

    if-ge p0, v0, :cond_0

    .line 343
    const/16 v0, 0x52

    return v0

    .line 345
    :cond_0
    const/16 v0, 0x53

    return v0
.end method
