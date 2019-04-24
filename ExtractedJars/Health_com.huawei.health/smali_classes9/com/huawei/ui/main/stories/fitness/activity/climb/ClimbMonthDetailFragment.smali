.class public Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;
    }
.end annotation


# instance fields
.field private A:Ljava/util/Date;

.field private B:Lo/fad;

.field private C:Z

.field private D:D

.field private E:Landroid/os/Handler;

.field private F:Landroid/view/View$OnClickListener;

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

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->B:Lo/fad;

    .line 55
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->E:Landroid/os/Handler;

    .line 105
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->F:Landroid/view/View$OnClickListener;

    .line 113
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->I:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->E:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    return-object p1
.end method

.method private a(Ljava/util/Date;)V
    .locals 6

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->s:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->r:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;I)V

    const/4 v4, 0x4

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 219
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->h()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)Lo/fad;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->B:Lo/fad;

    return-object v0
.end method

.method private d(Ljava/util/Date;)V
    .locals 6

    .line 201
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestBarChartDatas Month  = "

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

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->s:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->b:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;I)V

    const/4 v4, 0x4

    invoke-virtual/range {v0 .. v5}, Lo/exq;->b(JLo/exn$d;ILo/egg;)V

    .line 207
    return-void
.end method

.method private e(Ljava/util/Date;)V
    .locals 4

    .line 123
    const-string v0, "SCUI_ClimbMonthDetailFragment"

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

    .line 124
    const/16 v0, -0x1d

    invoke-static {p1, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

    .line 125
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->j:Ljava/util/Date;

    .line 127
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->f()V

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    invoke-static {}, Lo/ezz;->a()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 135
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->k()V

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 140
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->b()V

    .line 141
    return-void
.end method

.method private f()V
    .locals 5

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->d:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->j:Ljava/util/Date;

    .line 188
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 187
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    return-void
.end method

.method private h()V
    .locals 7

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->j:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->l(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 274
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==isToday=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 277
    :cond_0
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==is not Today=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 281
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->C:Z

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 284
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI():null == barData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->d(D)V

    .line 286
    return-void

    .line 288
    :cond_1
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v4

    .line 292
    invoke-virtual {p0, v4, v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->d(D)V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->e(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->D:D

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->D:D

    invoke-virtual {v0, v1, v2, v4, v5}, Lo/eyf;->c(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->D:D

    .line 296
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->D:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->D:D

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->D:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 299
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 300
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->D:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    invoke-virtual {v0, v6}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 305
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 79
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->j:Ljava/util/Date;

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->j:Ljava/util/Date;

    const/16 v1, -0x1d

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

    .line 83
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->f()V

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 85
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_dark_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    .line 88
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_light_color_2:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 87
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_dark_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    const/16 v1, 0x3ec

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 92
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 93
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 94
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "00"

    invoke-virtual {v0, v4, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v5

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x41c80000    # 25.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v5, v1}, Lo/eyf;->setPadding(FF)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->y:Ljava/util/List;

    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->i:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->z:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->f:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->F:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->k:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->I:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->k()V

    .line 104
    return-void
.end method

.method public b()V
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->d(Ljava/util/Date;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a(Ljava/util/Date;)V

    .line 195
    return-void
.end method

.method public c()V
    .locals 7

    .line 144
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->C:Z

    if-nez v0, :cond_0

    .line 145
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->C:Z

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v5

    .line 147
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->e(Ljava/util/Date;)V

    .line 149
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 150
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->j:Ljava/util/Date;

    .line 154
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 153
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 156
    const-string v0, "barSize"

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 158
    return-void
.end method

.method public d()V
    .locals 7

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->j:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->l(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    return-void

    .line 164
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->C:Z

    if-nez v0, :cond_1

    .line 165
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->C:Z

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->j:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->h(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v5

    .line 167
    const/16 v0, 0x1d

    invoke-static {v5, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->e(Ljava/util/Date;)V

    .line 169
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 170
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v0, "barSize"

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->A:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->j:Ljava/util/Date;

    .line 175
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 174
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 177
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 178
    return-void
.end method
