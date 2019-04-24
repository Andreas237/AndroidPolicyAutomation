.class public Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$e;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private T:Lo/fad;

.field private V:Ljava/util/Date;

.field private Y:Landroid/os/Handler;

.field private a:D

.field private ac:Ljava/util/Date;

.field protected b:Lo/exq;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private e:Lo/eyf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const-string v0, "SCUI_CalorieMonthDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 50
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->T:Lo/fad;

    .line 57
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->Y:Landroid/os/Handler;

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;)Landroid/content/Context;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    return-object v0
.end method

.method private b(Ljava/util/Date;)V
    .locals 6

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->r:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$e;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$e;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;I)V

    const/4 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 331
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->Y:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;Z)Z
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->H:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;)Lo/fad;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->T:Lo/fad;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 44
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->p()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/util/Date;)V
    .locals 6

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->b:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$e;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$e;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;I)V

    const/4 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 278
    return-void
.end method

.method private f()V
    .locals 5

    .line 244
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    const/16 v1, -0x1d

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    .line 247
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    .line 254
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 253
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    .line 257
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 256
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mStartDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mEndDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    return-void
.end method

.method private g()V
    .locals 5

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    .line 222
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 221
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 224
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    .line 225
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 224
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 234
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 236
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b()V

    .line 238
    return-void
.end method

.method private h()V
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    return-void
.end method

.method private p()V
    .locals 16

    .line 337
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateBarChartUI!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 340
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 341
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    .line 342
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 344
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 345
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI: null == calMonthBarData or not valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 347
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    return-void

    .line 350
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 353
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 354
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "all calores is less than 1 kcal don\'t show barview"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    return-void

    .line 359
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI calMonthBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   tepcalMonthBarDatabuff = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 360
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 359
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    invoke-virtual {v0, v5}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v6

    .line 363
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v8, v6, v0

    .line 364
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v10, v0

    .line 365
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    .line 366
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    invoke-virtual {v0, v1, v2, v8, v9}, Lo/eyf;->c(DD)D

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    .line 367
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    .line 370
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v11, v0

    .line 371
    int-to-double v0, v10

    cmpl-double v0, v11, v0

    if-nez v0, :cond_2

    .line 372
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    .line 374
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 375
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v13, v0

    .line 377
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 378
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    int-to-double v0, v13

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 381
    int-to-double v0, v13

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v15

    .line 382
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v15, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    invoke-virtual {v0, v14}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 385
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 386
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 388
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI avgValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "       avgKcalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "       avgKcal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "       maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->H:Z

    .line 86
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b:Lo/exq;

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_calorie_data_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 94
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_calorie_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b(Ljava/lang/String;)V

    .line 96
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 97
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 98
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 99
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 100
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 96
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b(IIIII)V

    .line 101
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CalorieMonthDetailFragment setColors"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->z:Lo/eyi;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 104
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 105
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 106
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 107
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 103
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 109
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->f()V

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 111
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_light_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    .line 117
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_dark_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 116
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_light_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 120
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 121
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 122
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "00"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v8

    .line 123
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v9

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    invoke-virtual {v0, v8, v9}, Lo/eyf;->setPadding(FF)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->c:Ljava/util/List;

    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 131
    :cond_0
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a(Lo/fad;Ljava/lang/String;)V

    .line 133
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->h()V

    .line 134
    return-void
.end method

.method public b()V
    .locals 1

    .line 264
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->H:Z

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->e(Ljava/util/Date;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->b(Ljava/util/Date;)V

    .line 267
    return-void
.end method

.method public c()V
    .locals 7

    .line 185
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 186
    return-void

    .line 189
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    .line 190
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    const/16 v1, 0x78f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a(II)V

    .line 191
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CalorieMonthDetailFragment processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    if-gez v0, :cond_1

    .line 193
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    .line 194
    return-void

    .line 198
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    const/16 v1, 0x1d

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    .line 201
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g()V

    .line 203
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 204
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    const-string v0, "barSize"

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 209
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    .line 210
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 209
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 212
    return-void
.end method

.method public d()V
    .locals 7

    .line 155
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 156
    return-void

    .line 159
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    .line 160
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    const/16 v1, 0x78f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->a(II)V

    .line 161
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CalorieMonthDetailFragment processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    const/16 v1, 0x78f

    if-le v0, v1, :cond_1

    .line 163
    const/16 v0, 0x78f

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->I:I

    .line 164
    return-void

    .line 168
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    const/16 v1, -0x1d

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

    .line 171
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g()V

    .line 173
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 174
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const-string v0, "barSize"

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->ac:Ljava/util/Date;

    .line 179
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 178
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 181
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieMonthDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 182
    return-void
.end method
