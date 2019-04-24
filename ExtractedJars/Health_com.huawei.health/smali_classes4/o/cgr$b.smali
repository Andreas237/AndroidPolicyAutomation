.class Lo/cgr$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/widget/TextView;

.field private c:Z

.field private d:Landroid/view/View;

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Z

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/view/View;I)V
    .locals 1

    .line 417
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 405
    const/4 v0, 0x0

    iput v0, p0, Lo/cgr$b;->a:I

    .line 406
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    .line 407
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgr$b;->e:Landroid/content/Context;

    .line 408
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgr$b;->c:Z

    .line 418
    iput p3, p0, Lo/cgr$b;->a:I

    .line 419
    iput-object p2, p0, Lo/cgr$b;->d:Landroid/view/View;

    .line 420
    iput-object p1, p0, Lo/cgr$b;->e:Landroid/content/Context;

    .line 421
    iget-object v0, p0, Lo/cgr$b;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/cgr$b;->c:Z

    .line 422
    invoke-direct {p0}, Lo/cgr$b;->d()V

    .line 423
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Landroid/view/View;ILo/cgr$2;)V
    .locals 0

    .line 404
    invoke-direct {p0, p1, p2, p3}, Lo/cgr$b;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    return-void
.end method

.method static synthetic a(Lo/cgr$b;IFZ)V
    .locals 0

    .line 404
    invoke-direct {p0, p1, p2, p3}, Lo/cgr$b;->d(IFZ)V

    return-void
.end method

.method static synthetic a(Lo/cgr$b;ILjava/lang/String;Ljava/lang/String;F)V
    .locals 0

    .line 404
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cgr$b;->c(ILjava/lang/String;Ljava/lang/String;F)V

    return-void
.end method

.method static synthetic a(Lo/cgr$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 404
    invoke-direct {p0, p1, p2}, Lo/cgr$b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 527
    iget-object v0, p0, Lo/cgr$b;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 528
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 529
    return-void
.end method

.method static synthetic c(Lo/cgr$b;)I
    .locals 1

    .line 404
    iget v0, p0, Lo/cgr$b;->a:I

    return v0
.end method

.method private c(ILjava/lang/String;Ljava/lang/String;F)V
    .locals 6

    .line 492
    iget-object v0, p0, Lo/cgr$b;->e:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 493
    const-string v0, "Track_PaceMapRecyclerViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    return-void

    .line 496
    :cond_0
    iget-object v0, p0, Lo/cgr$b;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 497
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->fontScale:F

    const/high16 v2, 0x41500000    # 13.0f

    div-float v1, v2, v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 499
    iget-object v0, p0, Lo/cgr$b;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 500
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 501
    invoke-direct {p0, v4, p1}, Lo/cgr$b;->e(Landroid/content/res/Resources;I)V

    .line 503
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 504
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p4, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, v5, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 505
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 506
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;ZDD)V
    .locals 4

    .line 462
    iget-object v0, p0, Lo/cgr$b;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 463
    iget-object v0, p0, Lo/cgr$b;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 464
    if-eqz p3, :cond_1

    const-wide/16 v0, 0x0

    cmpl-double v0, p4, v0

    if-lez v0, :cond_1

    .line 465
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_marathon_rl:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 466
    const-wide/16 v0, 0x0

    cmpl-double v0, p6, v0

    if-lez v0, :cond_0

    .line 467
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_half_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 468
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_marathon_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 469
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_half:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 470
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_marathon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 471
    invoke-static {p4, p5}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 472
    invoke-static {p6, p7}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 473
    goto :goto_0

    .line 474
    :cond_0
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_half2_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 475
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_half2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 476
    invoke-static {p4, p5}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 480
    :cond_1
    :goto_0
    return-void
.end method

.method private d()V
    .locals 3

    .line 430
    iget v0, p0, Lo/cgr$b;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 431
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->b:Landroid/widget/TextView;

    .line 432
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->g:Landroid/widget/TextView;

    goto/16 :goto_0

    .line 433
    :cond_0
    iget v0, p0, Lo/cgr$b;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 435
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_pace_mid_layout_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 436
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 437
    iget-object v0, p0, Lo/cgr$b;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_speed_pace_mi:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 439
    :cond_1
    goto/16 :goto_0

    :cond_2
    iget v0, p0, Lo/cgr$b;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 440
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_id:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->k:Landroid/widget/TextView;

    .line 441
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    .line 442
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->i:Landroid/widget/TextView;

    goto :goto_0

    .line 443
    :cond_3
    iget v0, p0, Lo/cgr$b;->a:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 444
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_id:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->k:Landroid/widget/TextView;

    .line 445
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_use_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    .line 446
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->i:Landroid/widget/TextView;

    goto :goto_0

    .line 447
    :cond_4
    iget v0, p0, Lo/cgr$b;->a:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_5

    .line 448
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_use_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    .line 449
    iget-object v0, p0, Lo/cgr$b;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgr$b;->i:Landroid/widget/TextView;

    .line 451
    :cond_5
    :goto_0
    return-void
.end method

.method private d(IFZ)V
    .locals 8

    .line 454
    iget-object v0, p0, Lo/cgr$b;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 455
    if-eqz p3, :cond_0

    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_sport_pace_last_time_mi:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_sport_pace_last_time_km:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 456
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_sport_pace_last_use_time:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Lo/cgl;->d(F)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 457
    iget-object v0, p0, Lo/cgr$b;->k:Landroid/widget/TextView;

    int-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 458
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 459
    return-void
.end method

.method static synthetic d(Lo/cgr$b;Z)V
    .locals 0

    .line 404
    invoke-direct {p0, p1}, Lo/cgr$b;->e(Z)V

    return-void
.end method

.method private e(Landroid/content/res/Resources;)V
    .locals 2

    .line 483
    iget-object v0, p0, Lo/cgr$b;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/cgr$b;->h:Z

    if-eqz v0, :cond_1

    .line 484
    :cond_0
    return-void

    .line 486
    :cond_1
    iget-boolean v0, p0, Lo/cgr$b;->c:Z

    if-eqz v0, :cond_2

    .line 487
    iget-object v0, p0, Lo/cgr$b;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_rtl:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 489
    :cond_2
    return-void
.end method

.method private e(Landroid/content/res/Resources;I)V
    .locals 2

    .line 510
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 511
    iget-boolean v0, p0, Lo/cgr$b;->c:Z

    if-eqz v0, :cond_0

    .line 512
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_short_pace_progress_rtl:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 514
    :cond_0
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_short_pace_progress:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 517
    :cond_1
    iget-boolean v0, p0, Lo/cgr$b;->c:Z

    if-eqz v0, :cond_2

    .line 518
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_hor_progress_rtl:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 520
    :cond_2
    iget-object v0, p0, Lo/cgr$b;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_hor_progress:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 524
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/cgr$b;Landroid/content/res/Resources;)V
    .locals 0

    .line 404
    invoke-direct {p0, p1}, Lo/cgr$b;->e(Landroid/content/res/Resources;)V

    return-void
.end method

.method static synthetic e(Lo/cgr$b;Ljava/lang/String;Ljava/lang/String;ZDD)V
    .locals 0

    .line 404
    invoke-direct/range {p0 .. p7}, Lo/cgr$b;->c(Ljava/lang/String;Ljava/lang/String;ZDD)V

    return-void
.end method

.method private e(Z)V
    .locals 0

    .line 426
    iput-boolean p1, p0, Lo/cgr$b;->h:Z

    .line 427
    return-void
.end method
