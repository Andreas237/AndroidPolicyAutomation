.class Lo/cgs$a;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:Landroid/widget/TextView;

.field private d:Landroid/view/View;

.field private e:I

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Z

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/view/View;I)V
    .locals 1

    .line 331
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 319
    const/4 v0, 0x0

    iput v0, p0, Lo/cgs$a;->e:I

    .line 320
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    .line 321
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgs$a;->a:Landroid/content/Context;

    .line 322
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgs$a;->b:Z

    .line 332
    iput p3, p0, Lo/cgs$a;->e:I

    .line 333
    iput-object p2, p0, Lo/cgs$a;->d:Landroid/view/View;

    .line 334
    iput-object p1, p0, Lo/cgs$a;->a:Landroid/content/Context;

    .line 335
    iget-object v0, p0, Lo/cgs$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/cgs$a;->b:Z

    .line 336
    invoke-direct {p0}, Lo/cgs$a;->d()V

    .line 337
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Landroid/view/View;ILo/cgs$4;)V
    .locals 0

    .line 318
    invoke-direct {p0, p1, p2, p3}, Lo/cgs$a;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    return-void
.end method

.method private a(IFD)V
    .locals 8

    .line 368
    iget-object v0, p0, Lo/cgs$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 369
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

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

    .line 370
    :goto_0
    const-wide v0, 0x40ac200000000000L    # 3600.0

    mul-double/2addr v0, p3

    float-to-double v2, p2

    div-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 371
    iget-object v0, p0, Lo/cgs$a;->f:Landroid/widget/TextView;

    int-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 372
    iget-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

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

    .line 373
    return-void
.end method

.method private b(ILjava/lang/String;Ljava/lang/String;F)V
    .locals 6

    .line 391
    iget-object v0, p0, Lo/cgs$a;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 392
    const-string v0, "Track_SpeedMapRecyclerViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    return-void

    .line 395
    :cond_0
    iget-object v0, p0, Lo/cgs$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 396
    iget-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->fontScale:F

    const/high16 v2, 0x41500000    # 13.0f

    div-float v1, v2, v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 398
    iget-object v0, p0, Lo/cgs$a;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 399
    iget-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    invoke-direct {p0, v4, p1}, Lo/cgs$a;->d(Landroid/content/res/Resources;I)V

    .line 403
    iget-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 404
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p4, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, v5, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 405
    iget-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 406
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 376
    iget-object v0, p0, Lo/cgs$a;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 377
    iget-object v0, p0, Lo/cgs$a;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 379
    return-void
.end method

.method private b(Z)V
    .locals 0

    .line 340
    iput-boolean p1, p0, Lo/cgs$a;->h:Z

    .line 341
    return-void
.end method

.method private d()V
    .locals 3

    .line 344
    iget v0, p0, Lo/cgs$a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 345
    iget-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgs$a;->c:Landroid/widget/TextView;

    .line 346
    iget-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgs$a;->g:Landroid/widget/TextView;

    .line 348
    :cond_0
    iget v0, p0, Lo/cgs$a;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 350
    iget-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_pace_mid_layout_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 351
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 352
    iget-object v0, p0, Lo/cgs$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_speed_pace_mi:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 355
    :cond_1
    iget v0, p0, Lo/cgs$a;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 356
    iget-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_id:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgs$a;->f:Landroid/widget/TextView;

    .line 357
    iget-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    .line 358
    iget-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgs$a;->i:Landroid/widget/TextView;

    .line 360
    :cond_2
    iget v0, p0, Lo/cgs$a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 361
    iget-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_id:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgs$a;->f:Landroid/widget/TextView;

    .line 362
    iget-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_use_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    .line 363
    iget-object v0, p0, Lo/cgs$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cgs$a;->i:Landroid/widget/TextView;

    .line 365
    :cond_3
    return-void
.end method

.method private d(Landroid/content/res/Resources;)V
    .locals 2

    .line 382
    iget-object v0, p0, Lo/cgs$a;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/cgs$a;->h:Z

    if-eqz v0, :cond_1

    .line 383
    :cond_0
    return-void

    .line 385
    :cond_1
    iget-boolean v0, p0, Lo/cgs$a;->b:Z

    if-eqz v0, :cond_2

    .line 386
    iget-object v0, p0, Lo/cgs$a;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_rtl:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 388
    :cond_2
    return-void
.end method

.method private d(Landroid/content/res/Resources;I)V
    .locals 2

    .line 410
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 411
    iget-boolean v0, p0, Lo/cgs$a;->b:Z

    if-eqz v0, :cond_0

    .line 412
    iget-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_short_pace_progress_rtl:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 414
    :cond_0
    iget-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_short_pace_progress:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 417
    :cond_1
    iget-boolean v0, p0, Lo/cgs$a;->b:Z

    if-eqz v0, :cond_2

    .line 418
    iget-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_hor_progress_rtl:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 420
    :cond_2
    iget-object v0, p0, Lo/cgs$a;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_hor_progress:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 424
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/cgs$a;ILjava/lang/String;Ljava/lang/String;F)V
    .locals 0

    .line 318
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cgs$a;->b(ILjava/lang/String;Ljava/lang/String;F)V

    return-void
.end method

.method static synthetic d(Lo/cgs$a;Landroid/content/res/Resources;)V
    .locals 0

    .line 318
    invoke-direct {p0, p1}, Lo/cgs$a;->d(Landroid/content/res/Resources;)V

    return-void
.end method

.method static synthetic d(Lo/cgs$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 318
    invoke-direct {p0, p1, p2}, Lo/cgs$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/cgs$a;Z)V
    .locals 0

    .line 318
    invoke-direct {p0, p1}, Lo/cgs$a;->b(Z)V

    return-void
.end method

.method static synthetic e(Lo/cgs$a;)I
    .locals 1

    .line 318
    iget v0, p0, Lo/cgs$a;->e:I

    return v0
.end method

.method static synthetic e(Lo/cgs$a;IFD)V
    .locals 0

    .line 318
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cgs$a;->a(IFD)V

    return-void
.end method
