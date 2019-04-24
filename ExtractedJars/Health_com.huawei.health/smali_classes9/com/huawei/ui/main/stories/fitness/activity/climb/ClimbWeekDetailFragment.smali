.class public Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;
    }
.end annotation


# instance fields
.field private A:Lo/fad;

.field private B:Ljava/util/Date;

.field private C:Ljava/util/Date;

.field private D:D

.field private E:Landroid/view/View$OnClickListener;

.field private G:Landroid/view/View$OnClickListener;

.field private H:Landroid/os/Handler;

.field private j:Z

.field private y:Lo/eyf;

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;-><init>()V

    .line 51
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->A:Lo/fad;

    .line 56
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->H:Landroid/os/Handler;

    .line 109
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->G:Landroid/view/View$OnClickListener;

    .line 117
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->E:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->i()V

    return-void
.end method

.method private a(Ljava/util/Date;)V
    .locals 4

    .line 127
    const-string v0, "SCUI_ClimbWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=======processArrowTip===data:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, -0x6

    invoke-static {p1, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    .line 129
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->B:Ljava/util/Date;

    .line 131
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->k()V

    .line 132
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->f()V

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    invoke-static {}, Lo/ezz;->a()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 143
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->b()V

    .line 144
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->H:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Ljava/util/Date;)V
    .locals 6

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->s:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->u:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;I)V

    const/4 v4, 0x4

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 221
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    return-object p1
.end method

.method private d(Ljava/util/Date;)V
    .locals 6

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->s:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->e:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;I)V

    const/4 v4, 0x4

    invoke-virtual/range {v0 .. v5}, Lo/exq;->b(JLo/exn$d;ILo/egg;)V

    .line 209
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;)Lo/fad;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->A:Lo/fad;

    return-object v0
.end method

.method private f()V
    .locals 5

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->d:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->B:Ljava/util/Date;

    .line 191
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 190
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    return-void
.end method

.method private i()V
    .locals 7

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->B:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->l(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    const-string v0, "SCUI_ClimbWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI ==isToday=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 280
    :cond_0
    const-string v0, "SCUI_ClimbWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI==is not Today=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 284
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->j:Z

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 286
    const-string v0, "SCUI_ClimbWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI() but null == barData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->d(D)V

    .line 288
    return-void

    .line 290
    :cond_1
    const-string v0, "SCUI_ClimbWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v4

    .line 294
    invoke-virtual {p0, v4, v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->d(D)V

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->e(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->D:D

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->D:D

    invoke-virtual {v0, v1, v2, v4, v5}, Lo/eyf;->c(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->D:D

    .line 298
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->D:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->D:D

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->D:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 302
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 303
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->D:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    invoke-virtual {v0, v6}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 308
    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 80
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->B:Ljava/util/Date;

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->B:Ljava/util/Date;

    const/4 v1, -0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    .line 83
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->f()V

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 85
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_dark_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    .line 87
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_light_color_2:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 86
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_dark_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    const/16 v1, 0x3ec

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 92
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 93
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    const/16 v1, 0x18

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v5

    .line 96
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v5, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v6

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x41c80000    # 25.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v6, v1}, Lo/eyf;->setPadding(FF)V

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->z:Ljava/util/List;

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->i:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->y:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 103
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->k()V

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->f:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->E:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->k:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->G:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    return-void
.end method

.method public b()V
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->d(Ljava/util/Date;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->c(Ljava/util/Date;)V

    .line 198
    return-void
.end method

.method public c()V
    .locals 7

    .line 147
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->j:Z

    if-nez v0, :cond_0

    .line 148
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->j:Z

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v5

    .line 150
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a(Ljava/util/Date;)V

    .line 152
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 153
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    const-string v0, "barSize"

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 158
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->B:Ljava/util/Date;

    .line 159
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 158
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 161
    return-void
.end method

.method public d()V
    .locals 7

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->B:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->l(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    return-void

    .line 167
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->j:Z

    if-nez v0, :cond_1

    .line 168
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->j:Z

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->B:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->h(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v5

    .line 170
    const/4 v0, 0x6

    invoke-static {v5, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a(Ljava/util/Date;)V

    .line 172
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 173
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    const-string v0, "barSize"

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->C:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->B:Ljava/util/Date;

    .line 176
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 175
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 180
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 181
    return-void
.end method
