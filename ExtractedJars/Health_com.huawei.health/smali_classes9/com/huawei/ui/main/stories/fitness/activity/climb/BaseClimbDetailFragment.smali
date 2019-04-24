.class public abstract Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Lo/fab;

.field protected c:Landroid/view/View;

.field protected d:Landroid/widget/TextView;

.field protected e:Lo/fac;

.field protected f:Landroid/widget/LinearLayout;

.field protected g:Landroid/widget/LinearLayout;

.field protected h:Landroid/widget/TextView;

.field protected i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field protected k:Landroid/widget/LinearLayout;

.field protected l:Landroid/widget/TextView;

.field protected m:Landroid/widget/TextView;

.field protected n:Landroid/widget/TextView;

.field protected o:Landroid/widget/TextView;

.field protected p:Landroid/widget/TextView;

.field protected q:Landroid/widget/TextView;

.field protected r:Landroid/widget/ImageView;

.field protected s:Lo/exq;

.field protected t:Landroid/widget/TextView;

.field protected u:Landroid/os/Handler;

.field protected v:J

.field protected w:F

.field protected x:Landroid/graphics/drawable/AnimationDrawable;

.field private y:Landroid/widget/ImageView;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 49
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->i:Ljava/util/ArrayList;

    .line 91
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->u:Landroid/os/Handler;

    .line 97
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->w:F

    .line 98
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->v:J

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .line 195
    sget v0, Lcom/huawei/ui/main/R$id;->calorie_day_detail_viewpager:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fac;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->e:Lo/fac;

    .line 197
    new-instance v0, Lo/fab;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->i:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lo/fab;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->b:Lo/fab;

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->e:Lo/fac;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->b:Lo/fab;

    invoke-virtual {v0, v1}, Lo/fac;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 200
    sget v0, Lcom/huawei/ui/main/R$id;->loading_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->r:Landroid/widget/ImageView;

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->r:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->sleep_loading_animation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->r:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 206
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->e()V

    .line 207
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method protected a(Lo/fad;)V
    .locals 0

    .line 385
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->d(Lo/fad;)V

    .line 386
    return-void
.end method

.method public abstract b()V
.end method

.method protected c(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eux;>;)Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation

    .line 410
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 411
    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 413
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 414
    const-string v0, "SCUI_BaseClimbDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseToBarChartData fitness.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 416
    const-string v0, "SCUI_BaseClimbDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseToBarChartData BaseDetailFragment parseToBarChartData Histogram i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   HistogramHeight = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 417
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/eux;

    invoke-virtual {v3}, Lo/eux;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 416
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eux;

    invoke-virtual {v0}, Lo/eux;->b()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 420
    :cond_0
    return-object v5
.end method

.method public c()V
    .locals 0

    .line 140
    return-void
.end method

.method protected c(Lo/fad;)V
    .locals 1

    .line 424
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->s:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/fad;->b(I)V

    .line 425
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->s:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->e()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/fad;->c(I)V

    .line 426
    return-void
.end method

.method public d()V
    .locals 0

    .line 136
    return-void
.end method

.method protected d(D)V
    .locals 8

    .line 324
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 328
    invoke-static {}, Lo/czz;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->o:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 332
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->o:Landroid/widget/TextView;

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 338
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 340
    :cond_1
    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-lez v0, :cond_3

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->o:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 344
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 345
    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->o:Landroid/widget/TextView;

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 350
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 352
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_nodata_symbol:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 354
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->o:Landroid/widget/TextView;

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 358
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->m:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 362
    :goto_0
    const-string v6, ""

    .line 363
    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-lez v0, :cond_5

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_5

    .line 364
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_details_sport_data_climb_floor_unit:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 367
    :cond_5
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    div-double v0, p1, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v7, v0

    .line 368
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2248"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_details_sport_data_climb_floor_unit:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v7, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 371
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 373
    :cond_6
    return-void
.end method

.method protected d(Lo/fad;)V
    .locals 11

    .line 254
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 255
    invoke-virtual {p1}, Lo/fad;->d()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double v6, v0, v2

    .line 258
    invoke-static {}, Lo/czz;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->h:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v6, v7, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 262
    const/4 v0, 0x1

    invoke-static {v6, v7, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->h:Landroid/widget/TextView;

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 269
    :cond_1
    const-wide/16 v0, 0x0

    cmpl-double v0, v6, v0

    if-lez v0, :cond_3

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->h:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v6, v7, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 272
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 273
    const/4 v0, 0x1

    invoke-static {v6, v7, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->h:Landroid/widget/TextView;

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 280
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_nodata_symbol:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->h:Landroid/widget/TextView;

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 286
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->n:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 290
    :goto_0
    const-string v8, ""

    .line 291
    const-wide/16 v0, 0x0

    cmpg-double v0, v6, v0

    if-gtz v0, :cond_5

    invoke-static {}, Lo/czz;->d()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 292
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    div-double v0, v6, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v9, v0

    .line 293
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2248"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_details_sport_data_climb_floor_unit:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v9, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 294
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_climb_isnot_support_floor_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 296
    goto/16 :goto_2

    :cond_5
    const-wide/16 v0, 0x0

    cmpg-double v0, v6, v0

    if-gtz v0, :cond_6

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_6

    .line 297
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_no_detail_data_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    goto/16 :goto_2

    .line 300
    :cond_6
    const-wide/16 v0, 0x0

    cmpl-double v0, v6, v0

    if-lez v0, :cond_7

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    cmpg-double v0, v6, v0

    if-gez v0, :cond_7

    .line 301
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_details_sport_data_climb_floor_unit:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    .line 305
    :cond_7
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    div-double v0, v6, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v9, v0

    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2248"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_details_sport_data_climb_floor_unit:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v9, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 308
    :goto_1
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 309
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_climb_is_support_floor_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    goto :goto_2

    .line 312
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->q:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 317
    :cond_9
    return-void
.end method

.method protected e(Ljava/util/List;)D
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Double;>;)D"
        }
    .end annotation

    .line 394
    const-wide/16 v4, 0x0

    .line 395
    const/4 v6, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 396
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    cmpl-double v0, v0, v4

    if-lez v0, :cond_0

    .line 397
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    .line 395
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 400
    :cond_1
    const-string v0, "testwang"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    return-wide v4
.end method

.method protected e()V
    .locals 2

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->e:Lo/fac;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fac;->setOnViewPagerTouchEventListener(Lo/fac$c;)V

    .line 188
    return-void
.end method

.method protected e(Landroid/view/View;)V
    .locals 6

    .line 215
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_time_date_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->d:Landroid/widget/TextView;

    .line 217
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_data_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->h:Landroid/widget/TextView;

    .line 218
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_data_tv_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->l:Landroid/widget/TextView;

    .line 220
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_data_amount_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->n:Landroid/widget/TextView;

    .line 221
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_avg_data_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->o:Landroid/widget/TextView;

    .line 222
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_avg_data_tv_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->p:Landroid/widget/TextView;

    .line 224
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_avg_data_amount_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->m:Landroid/widget/TextView;

    .line 225
    sget v0, Lcom/huawei/ui/main/R$id;->avg_climb_data_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->g:Landroid/widget/LinearLayout;

    .line 227
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_climb_floor_tips_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->q:Landroid/widget/TextView;

    .line 229
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_climb_floor_height_tips:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->t:Landroid/widget/TextView;

    .line 230
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_one_story_equal_to_three_meters_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 231
    const-string v0, "3"

    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 232
    const-string v0, "10"

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 233
    const-string v0, "16"

    const-wide/high16 v1, 0x4030000000000000L    # 16.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    sget v0, Lcom/huawei/ui/main/R$id;->ll_left_arrow_tip:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->f:Landroid/widget/LinearLayout;

    .line 237
    sget v0, Lcom/huawei/ui/main/R$id;->ll_right_arrow_tip:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->k:Landroid/widget/LinearLayout;

    .line 238
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_left:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->y:Landroid/widget/ImageView;

    .line 239
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_right:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->z:Landroid/widget/ImageView;

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->z:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->z:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 247
    :goto_0
    return-void
.end method

.method protected k()V
    .locals 3

    .line 376
    new-instance v2, Lo/fad;

    invoke-direct {v2}, Lo/fad;-><init>()V

    .line 377
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->d(Lo/fad;)V

    .line 378
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->d(D)V

    .line 380
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 104
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 105
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->c:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 111
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_fitness_detail_climb:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->c:Landroid/view/View;

    .line 113
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    .line 114
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->s:Lo/exq;

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->c:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->e(Landroid/view/View;)V

    .line 116
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a()V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->c:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->a(Landroid/view/View;)V

    .line 118
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->w:F

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->u:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->c:Landroid/view/View;

    return-object v0
.end method
