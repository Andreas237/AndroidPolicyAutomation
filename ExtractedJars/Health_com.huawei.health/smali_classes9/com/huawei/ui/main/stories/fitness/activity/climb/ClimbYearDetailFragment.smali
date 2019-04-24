.class public Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;
    }
.end annotation


# instance fields
.field private A:Ljava/util/Date;

.field private B:Lo/fad;

.field private C:D

.field private D:Ljava/util/Date;

.field private E:Landroid/view/View$OnClickListener;

.field private F:Landroid/view/View$OnClickListener;

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

    .line 42
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;-><init>()V

    .line 49
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->B:Lo/fad;

    .line 54
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->H:Landroid/os/Handler;

    .line 105
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->E:Landroid/view/View$OnClickListener;

    .line 133
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->F:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->H:Landroid/os/Handler;

    return-object v0
.end method

.method private a(Ljava/util/Date;)V
    .locals 6

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->s:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->d:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;I)V

    const/4 v4, 0x4

    invoke-virtual/range {v0 .. v5}, Lo/exq;->b(JLo/exn$d;ILo/egg;)V

    .line 206
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->h()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)Lo/fad;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->B:Lo/fad;

    return-object v0
.end method

.method private d(Ljava/util/Date;)V
    .locals 6

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->s:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->q:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;I)V

    const/4 v4, 0x4

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 218
    return-void
.end method

.method private e(Ljava/util/Date;)V
    .locals 4

    .line 114
    const-string v0, "SCUI_ClimbYearDetailFragment"

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

    .line 115
    const/16 v0, -0xb

    invoke-static {p1, v0}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->t(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    .line 116
    invoke-static {p1}, Lo/dbu;->r(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->A:Ljava/util/Date;

    .line 118
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->i()V

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    const/16 v3, 0xc

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 126
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->k()V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 130
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->b()V

    .line 131
    return-void
.end method

.method private h()V
    .locals 7

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->x:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 264
    invoke-static {}, Lo/dbu;->d()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->A:Ljava/util/Date;

    invoke-static {v1}, Lo/dbu;->b(Ljava/util/Date;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 267
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 270
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->j:Z

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->s:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 276
    const-string v0, "SCUI_ClimbYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Climb Year updateBarChartUI():null == barData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->d(D)V

    .line 278
    return-void

    .line 282
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v4

    .line 283
    invoke-virtual {p0, v4, v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->d(D)V

    .line 285
    const-string v0, "SCUI_ClimbYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClimbYearDetailFragment updateBarChartUI()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->e(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->C:D

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->C:D

    invoke-virtual {v0, v1, v2, v4, v5}, Lo/eyf;->c(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->C:D

    .line 289
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->C:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->C:D

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->C:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 292
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 293
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->C:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 295
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    invoke-virtual {v0, v6}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    const/16 v3, 0xc

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 298
    return-void
.end method

.method private i()V
    .locals 5

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->d:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->A:Ljava/util/Date;

    .line 187
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 186
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 78
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->r(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->A:Ljava/util/Date;

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->A:Ljava/util/Date;

    const/16 v1, -0xb

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->t(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    .line 82
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->i()V

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 84
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_dark_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    .line 87
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_light_color_2:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 86
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_climb_dark_color_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    const/16 v1, 0x3ec

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 91
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 92
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 93
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "00"

    invoke-virtual {v0, v4, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v5

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x41c80000    # 25.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v5, v1}, Lo/eyf;->setPadding(FF)V

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->z:Ljava/util/List;

    const/16 v3, 0xc

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->i:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->y:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 99
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->k()V

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->f:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->E:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->k:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->F:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    return-void
.end method

.method public b()V
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a(Ljava/util/Date;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->d(Ljava/util/Date;)V

    .line 195
    return-void
.end method

.method public c()V
    .locals 7

    .line 142
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->j:Z

    if-nez v0, :cond_0

    .line 143
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->j:Z

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v5

    .line 145
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->e(Ljava/util/Date;)V

    .line 147
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 148
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    const-string v0, "barSize"

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->A:Ljava/util/Date;

    .line 152
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 154
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 156
    return-void
.end method

.method public d()V
    .locals 7

    .line 159
    invoke-static {}, Lo/dbu;->d()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    invoke-static {v1}, Lo/dbu;->b(Ljava/util/Date;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 160
    return-void

    .line 162
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->j:Z

    if-nez v0, :cond_1

    .line 163
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->j:Z

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->A:Ljava/util/Date;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v5

    .line 165
    const/16 v0, 0xb

    invoke-static {v5, v0}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->e(Ljava/util/Date;)V

    .line 167
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 168
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 171
    const-string v0, "barSize"

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->D:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->A:Ljava/util/Date;

    .line 174
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 173
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 176
    return-void
.end method
