.class public Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String;


# instance fields
.field private T:Lo/fad;

.field private V:Ljava/util/Date;

.field private Y:Ljava/util/Date;

.field private Z:Landroid/os/Handler;

.field private aa:Ljava/lang/String;

.field private b:Lo/eyf;

.field private c:D

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field protected e:Lo/exq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const-string v0, "SCUI_DistanceWeekDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 50
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->T:Lo/fad;

    .line 58
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Z:Landroid/os/Handler;

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;)Lo/fad;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->T:Lo/fad;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/util/Date;)V
    .locals 6

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->e:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->u:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;I)V

    const/4 v4, 0x3

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 341
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Z:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->aa:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;Z)Z
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->H:Z

    return p1
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 44
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->n()V

    return-void
.end method

.method private e(Ljava/util/Date;)V
    .locals 6

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->e:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->e:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;I)V

    const/4 v4, 0x3

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 286
    return-void
.end method

.method private f()V
    .locals 5

    .line 255
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    const/4 v1, -0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    .line 259
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    .line 265
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 264
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mStartDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mEndDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    return-void
.end method

.method private g()V
    .locals 6

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    .line 233
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 232
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 243
    :cond_0
    new-instance v5, Lo/fad;

    invoke-direct {v5}, Lo/fad;-><init>()V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->aa:Ljava/lang/String;

    invoke-virtual {p0, v5, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 247
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b()V

    .line 249
    return-void
.end method

.method private h()V
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    return-void
.end method

.method private n()V
    .locals 9

    .line 347
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->e:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 355
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI:data not Valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 357
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->aa:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    return-void

    .line 360
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    if-nez v0, :cond_1

    .line 363
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI disWeekBarData = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->aa:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    return-void

    .line 367
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI disWeekBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v5

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c:D

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c:D

    invoke-virtual {v0, v1, v2, v5, v6}, Lo/eyf;->c(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c:D

    .line 371
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c:D

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 373
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 374
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 375
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v5, v6, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->aa:Ljava/lang/String;

    invoke-virtual {p0, v8, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    invoke-virtual {v0, v7}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 384
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI avgValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "               maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "               avgContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    return-void
.end method


# virtual methods
.method public a()V
    .locals 11

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->H:Z

    .line 87
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->e:Lo/exq;

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->aa:Ljava/lang/String;

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->aa:Ljava/lang/String;

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 100
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b(Ljava/lang/String;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_distance_data_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 106
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 107
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 109
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 110
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 106
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b(IIIII)V

    .line 112
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DistanceWeekDetailFragment setColors"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->z:Lo/eyi;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 114
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 115
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 116
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 117
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 113
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 119
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->f()V

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 121
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_light_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    .line 127
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_dark_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 126
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_dark_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->aa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 131
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 132
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    const/16 v1, 0x18

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v8

    .line 134
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v8, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v9

    .line 136
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v10

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    invoke-virtual {v0, v9, v10}, Lo/eyf;->setPadding(FF)V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d:Ljava/util/List;

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 144
    :cond_1
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->aa:Ljava/lang/String;

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    .line 146
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->h()V

    .line 147
    return-void
.end method

.method public b()V
    .locals 1

    .line 272
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->H:Z

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->e(Ljava/util/Date;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->b(Ljava/util/Date;)V

    .line 275
    return-void
.end method

.method public c()V
    .locals 7

    .line 198
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 199
    return-void

    .line 202
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    .line 203
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    const/16 v1, 0x217b

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a(II)V

    .line 204
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    if-gez v0, :cond_1

    .line 206
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    .line 207
    return-void

    .line 211
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    .line 214
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g()V

    .line 216
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 217
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    const-string v0, "barSize"

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    .line 221
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 220
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 224
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 225
    return-void
.end method

.method public d()V
    .locals 7

    .line 168
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 169
    return-void

    .line 172
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    .line 173
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    const/16 v1, 0x217b

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a(II)V

    .line 174
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    const/16 v1, 0x217b

    if-le v0, v1, :cond_1

    .line 176
    const/16 v0, 0x217b

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->I:I

    .line 177
    return-void

    .line 181
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    const/4 v1, -0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

    .line 184
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g()V

    .line 186
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 187
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    const-string v0, "barSize"

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->Y:Ljava/util/Date;

    .line 192
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 191
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 194
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 195
    return-void
.end method
