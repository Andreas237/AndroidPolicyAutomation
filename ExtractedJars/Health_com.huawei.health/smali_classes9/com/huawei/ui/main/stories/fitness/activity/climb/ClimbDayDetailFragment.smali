.class public Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$b;
    }
.end annotation


# instance fields
.field private A:D

.field private B:Lo/fad;

.field private C:Landroid/os/Handler;

.field private D:Z

.field private E:Landroid/view/View$OnClickListener;

.field private I:Landroid/view/View$OnClickListener;

.field private j:Ljava/util/Date;

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private z:Lo/eyf;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;-><init>()V

    .line 50
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->B:Lo/fad;

    .line 55
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->C:Landroid/os/Handler;

    .line 103
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->I:Landroid/view/View$OnClickListener;

    .line 111
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->E:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->C:Landroid/os/Handler;

    return-object v0
.end method

.method private b(Ljava/util/Date;)V
    .locals 6

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->s:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->l:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$b;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;I)V

    const/4 v4, 0x4

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 207
    return-void
.end method

.method private c(Ljava/util/Date;)V
    .locals 4

    .line 120
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->g()V

    .line 123
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->k()V

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    invoke-static {}, Lo/ezz;->a()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    const/16 v3, 0x18

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 131
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 133
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->b()V

    .line 134
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)Lo/fad;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->B:Lo/fad;

    return-object v0
.end method

.method private d(Ljava/util/Date;)V
    .locals 6

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->s:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->i:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$b;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;I)V

    const/4 v4, 0x4

    invoke-virtual/range {v0 .. v5}, Lo/exq;->b(JLo/exn$d;ILo/egg;)V

    .line 195
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->i()V

    return-void
.end method

.method private g()V
    .locals 4

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->d:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    return-void
.end method

.method private i()V
    .locals 7

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->l(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    const-string v0, "SCUI_ClimbDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==isToday=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 257
    :cond_0
    const-string v0, "SCUI_ClimbDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==is not Today=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 260
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->D:Z

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->s:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 265
    const-string v0, "SCUI_ClimbDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI():null == barData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    return-void

    .line 269
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v4

    .line 271
    const-string v0, "SCUI_ClimbDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->e(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->A:D

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->A:D

    invoke-virtual {v0, v1, v2, v4, v5}, Lo/eyf;->c(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->A:D

    .line 275
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->A:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->A:D

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->A:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 278
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 279
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->A:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    invoke-virtual {v0, v6}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    invoke-static {}, Lo/ezz;->a()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    const/16 v3, 0x18

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 284
    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 76
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->g()V

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 80
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_dark_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a:Landroid/content/Context;

    .line 82
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_light_color_2:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 81
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    const/16 v1, 0x3ec

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_dark_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 87
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 88
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 89
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v5

    .line 90
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v1

    const-string v2, "00"

    invoke-virtual {v1, v4, v2}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v1

    add-float v6, v0, v1

    .line 91
    move v7, v6

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    invoke-virtual {v0, v6, v7}, Lo/eyf;->setPadding(FF)V

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    invoke-static {}, Lo/ezz;->a()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->y:Ljava/util/List;

    const/16 v3, 0x18

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->i:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->z:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->k()V

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->k:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->E:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->f:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->I:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    return-void
.end method

.method public b()V
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->d(Ljava/util/Date;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->b(Ljava/util/Date;)V

    .line 186
    return-void
.end method

.method public c()V
    .locals 6

    .line 137
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->D:Z

    if-nez v0, :cond_0

    .line 138
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->D:Z

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v4

    .line 140
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->c(Ljava/util/Date;)V

    .line 142
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 143
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    const-string v0, "barSize"

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    const-string v0, "time"

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 149
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 150
    return-void
.end method

.method public d()V
    .locals 6

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->l(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    return-void

    .line 156
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->D:Z

    if-nez v0, :cond_1

    .line 157
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->D:Z

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->h(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v4

    .line 159
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->c(Ljava/util/Date;)V

    .line 161
    :cond_1
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 162
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 165
    const-string v0, "barSize"

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const-string v0, "time"

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->j:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 169
    return-void
.end method
