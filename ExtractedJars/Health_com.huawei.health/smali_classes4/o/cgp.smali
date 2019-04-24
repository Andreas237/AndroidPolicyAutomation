.class public Lo/cgp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

.field private b:Lo/cex;

.field private c:Landroid/content/res/Resources;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;

.field private f:I

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/chj$b;>;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/String;

.field private k:Z


# direct methods
.method public constructor <init>(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;Landroid/content/Context;I)V
    .locals 4

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgp;->b:Lo/cex;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgp;->e:Landroid/content/Context;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    .line 47
    const-string v0, "--"

    iput-object v0, p0, Lo/cgp;->i:Ljava/lang/String;

    .line 50
    const-string v0, "#ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/cgp;->f:I

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgp;->k:Z

    .line 64
    if-eqz p1, :cond_0

    if-nez p3, :cond_1

    .line 65
    :cond_0
    const-string v0, "Track_TrackDetailItemDrawer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simplify or context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    return-void

    .line 69
    :cond_1
    iput-object p1, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 70
    iput-object p2, p0, Lo/cgp;->b:Lo/cex;

    .line 71
    iput-object p3, p0, Lo/cgp;->e:Landroid/content/Context;

    .line 72
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    .line 74
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    .line 76
    const/16 v0, 0x65

    if-ne p4, v0, :cond_2

    .line 77
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$color;->color_normal_titlebar_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/cgp;->f:I

    goto :goto_0

    .line 80
    :cond_2
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$color;->home_track_show_text_black_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/cgp;->f:I

    .line 83
    :goto_0
    return-void
.end method

.method private C()Lo/chj$b;
    .locals 8

    .line 749
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "achieve_percent"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 751
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_goal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_goal:I

    .line 752
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    int-to-double v3, v7

    const/4 v5, 0x2

    const/4 v6, 0x1

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    return-object v0
.end method

.method private a(D)Lo/chj$b;
    .locals 6

    .line 693
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 694
    new-instance v5, Lo/chj$b;

    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_pool_length:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_pool_length:I

    .line 695
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->i:Ljava/lang/String;

    invoke-direct {v5, v0, v1, v2, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 698
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 699
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 701
    :cond_0
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 704
    :goto_0
    iput-object v4, v5, Lo/chj$b;->d:Ljava/lang/String;

    .line 706
    invoke-static {p1, p2}, Lo/cgl;->b(D)D

    move-result-wide p1

    .line 708
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lo/chj$b;->c:Ljava/lang/String;

    .line 710
    return-object v5
.end method

.method private a(F)Lo/chj$b;
    .locals 6

    .line 484
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_paces:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 485
    invoke-static {p1}, Lo/cgl;->f(F)Ljava/lang/String;

    move-result-object v4

    .line 486
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 487
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_paces_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 491
    :cond_0
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_step_stride:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_pace:I

    .line 492
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, v4, v5}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    return-object v0
.end method

.method private a()V
    .locals 0

    .line 277
    invoke-direct {p0}, Lo/cgp;->f()V

    .line 278
    invoke-direct {p0}, Lo/cgp;->m()V

    .line 279
    invoke-direct {p0}, Lo/cgp;->s()V

    .line 280
    invoke-direct {p0}, Lo/cgp;->y()V

    .line 281
    invoke-direct {p0}, Lo/cgp;->j()V

    .line 282
    return-void
.end method

.method private a(I)Z
    .locals 1

    .line 165
    rem-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b(F)Lo/chj$b;
    .locals 8

    .line 598
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 599
    float-to-double v0, p1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v6

    .line 600
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_ft_string:I

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    .line 601
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v6, v7, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 602
    goto :goto_0

    .line 603
    :cond_0
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 604
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 609
    :goto_0
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_descent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_total_descent:I

    .line 610
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, v5, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 609
    return-object v0
.end method

.method private b(I)Lo/chj$b;
    .locals 6

    .line 455
    if-lez p1, :cond_0

    .line 456
    invoke-static {p1}, Lo/cgl;->d(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 458
    :cond_0
    iget-object v5, p0, Lo/cgp;->i:Ljava/lang/String;

    .line 462
    :goto_0
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_avg_step_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_averagestemps:I

    .line 463
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_stempsmin:I

    .line 464
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v5, v3}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    return-object v0
.end method

.method private b()V
    .locals 0

    .line 266
    invoke-direct {p0}, Lo/cgp;->f()V

    .line 267
    invoke-direct {p0}, Lo/cgp;->m()V

    .line 268
    invoke-direct {p0}, Lo/cgp;->s()V

    .line 269
    invoke-direct {p0}, Lo/cgp;->y()V

    .line 270
    invoke-direct {p0}, Lo/cgp;->x()V

    .line 271
    invoke-direct {p0}, Lo/cgp;->z()V

    .line 272
    invoke-direct {p0}, Lo/cgp;->j()V

    .line 274
    return-void
.end method

.method private b(Lo/chj;Ljava/lang/String;)V
    .locals 2

    .line 177
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 178
    :cond_0
    return-void

    .line 181
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 182
    return-void

    .line 185
    :cond_2
    iget-object v0, p0, Lo/cgp;->i:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "[0-9]+"

    invoke-virtual {p2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 186
    :cond_3
    return-void

    .line 189
    :cond_4
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_font_size_18sp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p1, v0}, Lo/chj;->setValueTextSize(F)V

    .line 191
    return-void
.end method

.method private c(D)Lo/chj$b;
    .locals 6

    .line 430
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 432
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 433
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 435
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 438
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_avg_speed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    .line 439
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, v4, v5}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    return-object v0
.end method

.method private c()V
    .locals 1

    .line 200
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 202
    :sswitch_0
    invoke-direct {p0}, Lo/cgp;->b()V

    .line 203
    goto :goto_1

    .line 205
    :sswitch_1
    invoke-direct {p0}, Lo/cgp;->a()V

    .line 206
    goto :goto_1

    .line 208
    :sswitch_2
    invoke-direct {p0}, Lo/cgp;->h()V

    .line 209
    goto :goto_1

    .line 212
    :sswitch_3
    invoke-direct {p0}, Lo/cgp;->g()V

    .line 213
    goto :goto_1

    .line 216
    :goto_0
    invoke-direct {p0}, Lo/cgp;->e()V

    .line 219
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x103 -> :sswitch_2
        0x106 -> :sswitch_0
        0x109 -> :sswitch_3
        0x10a -> :sswitch_1
        0x117 -> :sswitch_3
    .end sparse-switch
.end method

.method private c(I)V
    .locals 1

    .line 222
    invoke-static {p1}, Lo/cgl;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    invoke-direct {p0}, Lo/cgp;->k()V

    goto :goto_0

    .line 225
    :cond_0
    invoke-direct {p0}, Lo/cgp;->i()V

    .line 227
    :goto_0
    return-void
.end method

.method private c(F)Z
    .locals 1

    .line 550
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 551
    const/4 v0, 0x1

    return v0

    .line 553
    :cond_0
    iget-object v0, p0, Lo/cgp;->b:Lo/cex;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cgp;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    .line 554
    const/4 v0, 0x1

    return v0

    .line 556
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private d(F)Lo/chj$b;
    .locals 6

    .line 392
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 393
    invoke-static {p1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 395
    :cond_0
    iget-object v4, p0, Lo/cgp;->i:Ljava/lang/String;

    .line 398
    :goto_0
    const-string v5, "/"

    .line 399
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 400
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 402
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 406
    :goto_1
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_avg_pace:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_avragepace:I

    .line 407
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, v4, v5}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    return-object v0
.end method

.method private d(I)Lo/chj$b;
    .locals 6

    .line 359
    if-lez p1, :cond_0

    .line 360
    invoke-static {p1}, Lo/cgl;->b(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 362
    :cond_0
    iget-object v4, p0, Lo/cgp;->i:Ljava/lang/String;

    .line 364
    :goto_0
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 367
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_calories:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_calories:I

    .line 368
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, v4, v5}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    return-object v0
.end method

.method private d(J)Lo/chj$b;
    .locals 5

    .line 339
    invoke-static {p1, p2}, Lo/cgl;->d(J)Ljava/lang/String;

    move-result-object v4

    .line 340
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_sport_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_sporttime:I

    .line 341
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-direct {v0, v1, v2, v4, v3}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    return-object v0
.end method

.method private d()V
    .locals 1

    .line 285
    invoke-direct {p0}, Lo/cgp;->f()V

    .line 286
    iget-boolean v0, p0, Lo/cgp;->k:Z

    if-nez v0, :cond_0

    .line 287
    invoke-direct {p0}, Lo/cgp;->m()V

    .line 289
    :cond_0
    return-void
.end method

.method private e(F)Lo/chj$b;
    .locals 8

    .line 570
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 571
    float-to-double v0, p1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v6

    .line 572
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_ft_string:I

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    .line 573
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v6, v7, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 574
    goto :goto_0

    .line 575
    :cond_0
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 576
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 581
    :goto_0
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_creeping:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_total_climbed:I

    .line 582
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, v5, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 581
    return-object v0
.end method

.method private e(I)Lo/chj$b;
    .locals 6

    .line 508
    if-lez p1, :cond_0

    .line 509
    invoke-static {p1}, Lo/cgl;->d(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 511
    :cond_0
    iget-object v5, p0, Lo/cgp;->i:Ljava/lang/String;

    .line 515
    :goto_0
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_total_steps:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_stemps:I

    .line 516
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_settings_steps_unit:I

    .line 517
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v5, v3}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    return-object v0
.end method

.method private e()V
    .locals 0

    .line 250
    invoke-direct {p0}, Lo/cgp;->f()V

    .line 251
    invoke-direct {p0}, Lo/cgp;->m()V

    .line 252
    invoke-direct {p0}, Lo/cgp;->p()V

    .line 253
    invoke-direct {p0}, Lo/cgp;->o()V

    .line 254
    invoke-direct {p0}, Lo/cgp;->n()V

    .line 255
    invoke-direct {p0}, Lo/cgp;->l()V

    .line 256
    invoke-direct {p0}, Lo/cgp;->q()V

    .line 257
    invoke-direct {p0}, Lo/cgp;->t()V

    .line 258
    invoke-direct {p0}, Lo/cgp;->u()V

    .line 259
    invoke-direct {p0}, Lo/cgp;->r()V

    .line 260
    invoke-direct {p0}, Lo/cgp;->j()V

    .line 262
    return-void
.end method

.method private e(Lo/che;I)V
    .locals 15
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 109
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 110
    :cond_0
    const-string v0, "Track_TrackDetailItemDrawer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillDetailContainer dataList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    return-void

    .line 114
    :cond_1
    if-nez p1, :cond_2

    .line 115
    const-string v0, "Track_TrackDetailItemDrawer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillDetailContainer container is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void

    .line 119
    :cond_2
    iget-object v0, p0, Lo/cgp;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 120
    iget-object v0, p0, Lo/cgp;->e:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 121
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_70dp:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 122
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, p2, 0x2

    sub-int v7, v0, v1

    .line 124
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    .line 126
    if-nez v8, :cond_3

    .line 127
    return-void

    .line 131
    :cond_3
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_6

    .line 133
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/chj$b;

    .line 135
    move v12, v7

    .line 136
    iget-boolean v0, p0, Lo/cgp;->k:Z

    if-eqz v0, :cond_4

    .line 137
    sub-int v12, v7, p2

    .line 140
    :cond_4
    new-instance v11, Lo/chj;

    iget-object v0, p0, Lo/cgp;->e:Landroid/content/Context;

    invoke-direct {v11, v0}, Lo/chj;-><init>(Landroid/content/Context;)V

    .line 141
    div-int/lit8 v0, v12, 0x2

    invoke-virtual {v11, v0, v6}, Lo/chj;->setGroupSize(II)V

    .line 142
    invoke-virtual {v11, v10}, Lo/chj;->setItemView(Lo/chj$b;)V

    .line 143
    iget v0, p0, Lo/cgp;->f:I

    invoke-virtual {v11, v0}, Lo/chj;->setTextColor(I)V

    .line 144
    iget-object v0, v10, Lo/chj$b;->c:Ljava/lang/String;

    invoke-direct {p0, v11, v0}, Lo/cgp;->b(Lo/chj;Ljava/lang/String;)V

    .line 145
    move-object/from16 v0, p1

    invoke-virtual {v0, v11}, Lo/che;->addView(Landroid/view/View;)V

    .line 147
    invoke-direct {p0, v9}, Lo/cgp;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 148
    new-instance v13, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lo/cgp;->e:Landroid/content/Context;

    invoke-direct {v13, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 149
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lo/cgp;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    move-object v14, v0

    .line 150
    iget v0, p0, Lo/cgp;->f:I

    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 151
    const v0, 0x3dcccccd    # 0.1f

    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 152
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v1

    iget-object v2, p0, Lo/cgp;->e:Landroid/content/Context;

    .line 153
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$dimen;->sport_data_cut_line_height:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 152
    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 154
    invoke-virtual {v13, v14}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 156
    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Lo/che;->addView(Landroid/view/View;)V

    .line 131
    :cond_5
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 162
    :cond_6
    return-void
.end method

.method private f(I)Lo/chj$b;
    .locals 6

    .line 669
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    .line 670
    new-instance v5, Lo/chj$b;

    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_stroke_times:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_pull_times:I

    .line 671
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->i:Ljava/lang/String;

    invoke-direct {v5, v0, v1, v2, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 673
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lo/chj$b;->d:Ljava/lang/String;

    .line 674
    int-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lo/chj$b;->c:Ljava/lang/String;

    .line 675
    return-object v5
.end method

.method private f()V
    .locals 4

    .line 330
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v2

    .line 331
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 332
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v2, v3}, Lo/cgp;->d(J)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    :cond_0
    return-void
.end method

.method private g()V
    .locals 0

    .line 323
    invoke-direct {p0}, Lo/cgp;->f()V

    .line 324
    invoke-direct {p0}, Lo/cgp;->t()V

    .line 325
    invoke-direct {p0}, Lo/cgp;->j()V

    .line 326
    return-void
.end method

.method private h()V
    .locals 0

    .line 311
    invoke-direct {p0}, Lo/cgp;->f()V

    .line 312
    invoke-direct {p0}, Lo/cgp;->m()V

    .line 313
    invoke-direct {p0}, Lo/cgp;->p()V

    .line 314
    invoke-direct {p0}, Lo/cgp;->o()V

    .line 315
    invoke-direct {p0}, Lo/cgp;->t()V

    .line 316
    invoke-direct {p0}, Lo/cgp;->u()V

    .line 317
    invoke-direct {p0}, Lo/cgp;->r()V

    .line 318
    invoke-direct {p0}, Lo/cgp;->j()V

    .line 319
    return-void
.end method

.method private i(I)Lo/chj$b;
    .locals 6

    .line 534
    if-eqz p1, :cond_0

    .line 535
    int-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 537
    :cond_0
    iget-object v5, p0, Lo/cgp;->i:Ljava/lang/String;

    .line 541
    :goto_0
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_heart_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_avrageheartrate:I

    .line 542
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_unit_string:I

    .line 543
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v5, v3}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    return-object v0
.end method

.method private i()V
    .locals 0

    .line 295
    invoke-direct {p0}, Lo/cgp;->f()V

    .line 296
    invoke-direct {p0}, Lo/cgp;->m()V

    .line 297
    invoke-direct {p0}, Lo/cgp;->p()V

    .line 298
    invoke-direct {p0}, Lo/cgp;->o()V

    .line 299
    return-void
.end method

.method private j()V
    .locals 3

    .line 739
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 740
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "achieve_percent"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "achieve_percent"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 741
    :goto_0
    if-eqz v2, :cond_1

    .line 742
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0}, Lo/cgp;->C()Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 745
    :cond_1
    return-void
.end method

.method private k()V
    .locals 0

    .line 305
    invoke-direct {p0}, Lo/cgp;->f()V

    .line 306
    invoke-direct {p0}, Lo/cgp;->m()V

    .line 307
    return-void
.end method

.method private l()V
    .locals 5

    .line 470
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalSteps()I

    move-result v2

    .line 471
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v3

    .line 472
    if-lez v2, :cond_0

    if-lez v3, :cond_0

    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 473
    int-to-float v0, v3

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v2

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v4, v0, v1

    .line 474
    const/high16 v0, 0x43480000    # 200.0f

    cmpg-float v0, v4, v0

    if-gtz v0, :cond_0

    .line 475
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v4}, Lo/cgp;->a(F)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 478
    :cond_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 347
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 348
    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 349
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v2

    .line 350
    if-lez v2, :cond_0

    .line 351
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v2}, Lo/cgp;->d(I)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 354
    :cond_0
    return-void
.end method

.method private n()V
    .locals 3

    .line 445
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgStepRate()I

    move-result v2

    .line 446
    if-lez v2, :cond_0

    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 447
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v2}, Lo/cgp;->b(I)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 449
    :cond_0
    return-void
.end method

.method private o()V
    .locals 9

    .line 412
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v4, v0, v2

    .line 413
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v6

    .line 414
    int-to-double v0, v6

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v0, v2

    long-to-double v2, v4

    div-double v7, v0, v2

    .line 415
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    const/4 v0, 0x3

    invoke-static {v7, v8, v0}, Lo/cxh;->a(DI)D

    move-result-wide v7

    .line 418
    :cond_0
    const-wide v0, 0x408f400000000000L    # 1000.0

    cmpl-double v0, v7, v0

    if-gez v0, :cond_1

    const-wide v0, 0x3f847ae147ae147bL    # 0.01

    cmpg-double v0, v7, v0

    if-ltz v0, :cond_1

    long-to-float v0, v4

    const/high16 v1, 0x45610000    # 3600.0f

    div-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    .line 420
    :cond_1
    return-void

    .line 423
    :cond_2
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v7, v8}, Lo/cgp;->c(D)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 425
    return-void
.end method

.method private p()V
    .locals 5

    .line 375
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v4

    .line 376
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 377
    float-to-double v0, v4

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v4, v0

    .line 379
    :cond_0
    float-to-double v0, v4

    const-wide v2, 0x4115f90000000000L    # 360000.0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_1

    float-to-double v0, v4

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    cmpg-double v0, v0, v2

    if-lez v0, :cond_1

    const/4 v0, 0x0

    cmpg-float v0, v4, v0

    if-gtz v0, :cond_2

    .line 381
    :cond_1
    return-void

    .line 384
    :cond_2
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v4}, Lo/cgp;->d(F)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    return-void
.end method

.method private q()V
    .locals 3

    .line 498
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalSteps()I

    move-result v2

    .line 499
    if-lez v2, :cond_0

    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v2}, Lo/cgp;->e(I)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 502
    :cond_0
    return-void
.end method

.method private r()V
    .locals 3

    .line 588
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDescent()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v2, v0, v1

    .line 590
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_0

    invoke-direct {p0, v2}, Lo/cgp;->c(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 591
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v2}, Lo/cgp;->b(F)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 593
    :cond_0
    return-void
.end method

.method private s()V
    .locals 2

    .line 616
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "swim_stroke"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 617
    :cond_0
    return-void

    .line 619
    :cond_1
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0}, Lo/cgp;->w()Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 620
    return-void
.end method

.method private t()V
    .locals 5

    .line 523
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHeartRate()I

    move-result v4

    .line 524
    if-lez v4, :cond_0

    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 525
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v4}, Lo/cgp;->i(I)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 527
    :cond_0
    const-string v0, "Track_TrackDetailItemDrawer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no buildHeartRateData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    :goto_0
    return-void
.end method

.method private u()V
    .locals 3

    .line 561
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v2, v0, v1

    .line 562
    invoke-direct {p0, v2}, Lo/cgp;->c(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v2}, Lo/cgp;->e(F)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 565
    :cond_0
    return-void
.end method

.method private v()Lo/chj$b;
    .locals 6

    .line 726
    new-instance v4, Lo/chj$b;

    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_laps:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_laps:I

    .line 727
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->i:Ljava/lang/String;

    const-string v3, ""

    invoke-direct {v4, v0, v1, v2, v3}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "swim_laps"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 731
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lo/chj$b;->c:Ljava/lang/String;

    .line 733
    return-object v4
.end method

.method private w()Lo/chj$b;
    .locals 7

    .line 624
    new-instance v4, Lo/chj$b;

    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_stroke_type:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_main_style:I

    .line 625
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cgp;->i:Ljava/lang/String;

    const-string v3, ""

    invoke-direct {v4, v0, v1, v2, v3}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "swim_stroke"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 629
    packed-switch v5, :pswitch_data_0

    goto :goto_0

    .line 631
    :pswitch_0
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_backstroke:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 632
    goto :goto_1

    .line 634
    :pswitch_1
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_breaststroke:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 635
    goto :goto_1

    .line 637
    :pswitch_2
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_butterfly_stroke:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 638
    goto :goto_1

    .line 640
    :pswitch_3
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_freestyle:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 641
    goto :goto_1

    .line 643
    :pswitch_4
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_medley:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 644
    goto :goto_1

    .line 646
    :goto_0
    iget-object v0, p0, Lo/cgp;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_freestyle:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 650
    :goto_1
    iput-object v6, v4, Lo/chj$b;->c:Ljava/lang/String;

    .line 651
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method private x()V
    .locals 4

    .line 680
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "swim_pool_length"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 681
    :cond_0
    return-void

    .line 683
    :cond_1
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "swim_pool_length"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v2, v0

    .line 684
    const-wide/16 v0, 0x0

    cmpl-double v0, v2, v0

    if-ltz v0, :cond_2

    .line 685
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v2, v3}, Lo/cgp;->a(D)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 688
    :cond_2
    return-void
.end method

.method private y()V
    .locals 3

    .line 655
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "swim_pull_times"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 656
    :cond_0
    return-void

    .line 658
    :cond_1
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "swim_pull_times"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 660
    if-ltz v2, :cond_2

    .line 661
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0, v2}, Lo/cgp;->f(I)Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 663
    :cond_2
    return-void
.end method

.method private z()V
    .locals 3

    .line 714
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "swim_laps"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 715
    :cond_0
    return-void

    .line 717
    :cond_1
    iget-object v0, p0, Lo/cgp;->d:Ljava/util/Map;

    const-string v1, "swim_laps"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 719
    if-ltz v2, :cond_2

    .line 720
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-direct {p0}, Lo/cgp;->v()Lo/chj$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 722
    :cond_2
    return-void
.end method


# virtual methods
.method public d(Lo/che;ZI)V
    .locals 5

    .line 86
    iput-boolean p2, p0, Lo/cgp;->k:Z

    .line 87
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-nez v0, :cond_0

    .line 88
    const-string v0, "Track_TrackDetailItemDrawer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawDetailTable() mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-void

    .line 91
    :cond_0
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    if-nez v0, :cond_1

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    goto :goto_0

    .line 94
    :cond_1
    iget-object v0, p0, Lo/cgp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 96
    :goto_0
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v4

    .line 97
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportDataSource()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 98
    invoke-direct {p0, v4}, Lo/cgp;->c(I)V

    goto :goto_1

    .line 99
    :cond_2
    iget-object v0, p0, Lo/cgp;->a:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-static {v0}, Lo/cds;->b(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 100
    invoke-direct {p0}, Lo/cgp;->d()V

    goto :goto_1

    .line 102
    :cond_3
    invoke-direct {p0}, Lo/cgp;->c()V

    .line 104
    :goto_1
    invoke-direct {p0, p1, p3}, Lo/cgp;->e(Lo/che;I)V

    .line 105
    return-void
.end method
