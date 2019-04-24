.class public Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$d;
    }
.end annotation


# static fields
.field private static e:Ljava/lang/String;


# instance fields
.field private T:Ljava/util/Date;

.field private V:Lo/fad;

.field private Y:Ljava/util/Date;

.field private Z:Ljava/lang/String;

.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private aa:Landroid/os/Handler;

.field protected b:Lo/exq;

.field private c:Lo/eyf;

.field private d:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const-string v0, "SCUI_DistanceMonthDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 49
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->V:Lo/fad;

    .line 57
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->aa:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Z:Ljava/lang/String;

    return-object v0
.end method

.method private a(Ljava/util/Date;)V
    .locals 6

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->b:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->b:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$d;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$d;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;I)V

    const/4 v4, 0x3

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 277
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->aa:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;)Lo/fad;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->V:Lo/fad;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 43
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->m()V

    return-void
.end method

.method private e(Ljava/util/Date;)V
    .locals 6

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->b:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->r:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$d;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$d;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;I)V

    const/4 v4, 0x3

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 331
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;Z)Z
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->H:Z

    return p1
.end method

.method private f()V
    .locals 5

    .line 247
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    const/16 v1, -0x1d

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    .line 250
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    .line 256
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 255
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mStartDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mEndDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    return-void
.end method

.method private g()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 159
    return-void
.end method

.method private h()V
    .locals 6

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    .line 228
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 227
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 236
    :cond_0
    new-instance v5, Lo/fad;

    invoke-direct {v5}, Lo/fad;-><init>()V

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Z:Ljava/lang/String;

    invoke-virtual {p0, v5, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 240
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->b()V

    .line 241
    return-void
.end method

.method private m()V
    .locals 9

    .line 337
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->b:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->b(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 345
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI:data not Valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 347
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Z:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    return-void

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    if-nez v0, :cond_1

    .line 353
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI disMonthBarData = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Z:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    return-void

    .line 357
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI disMonthBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v5

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->d:D

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->d:D

    invoke-virtual {v0, v1, v2, v5, v6}, Lo/eyf;->c(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->d:D

    .line 362
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->d:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->d:D

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->d:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 364
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 365
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->d:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v5, v6, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Z:Ljava/lang/String;

    invoke-virtual {p0, v8, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    invoke-virtual {v0, v7}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 375
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

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

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->d:D

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

    .line 379
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->H:Z

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->b:Lo/exq;

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Z:Ljava/lang/String;

    .line 90
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Z:Ljava/lang/String;

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 98
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->b(Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_distance_data_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->z:Lo/eyi;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 105
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 106
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 107
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 104
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 109
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DistanceMonthDetailFragment initTextViewsColor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 112
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 113
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 114
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 115
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 111
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->b(IIIII)V

    .line 117
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->f()V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 119
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_light_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    .line 123
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_dark_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 122
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_dark_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 128
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 129
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 130
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "00"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v8

    .line 131
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v9

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    invoke-virtual {v0, v8, v9}, Lo/eyf;->setPadding(FF)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a:Ljava/util/List;

    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 139
    :cond_1
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Z:Ljava/lang/String;

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    .line 141
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g()V

    .line 142
    return-void
.end method

.method public b()V
    .locals 1

    .line 263
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->H:Z

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a(Ljava/util/Date;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e(Ljava/util/Date;)V

    .line 266
    return-void
.end method

.method public c()V
    .locals 7

    .line 192
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 193
    return-void

    .line 196
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    .line 197
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    const/16 v1, 0x78f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a(II)V

    .line 198
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    if-gez v0, :cond_1

    .line 200
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    .line 201
    return-void

    .line 205
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    const/16 v1, 0x1d

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    .line 208
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->h()V

    .line 210
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 211
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 212
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    const-string v0, "barSize"

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    .line 216
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 215
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 219
    return-void
.end method

.method public d()V
    .locals 7

    .line 162
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 163
    return-void

    .line 166
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    .line 167
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    const/16 v1, 0x78f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->a(II)V

    .line 168
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    const/16 v1, 0x78f

    if-le v0, v1, :cond_1

    .line 170
    const/16 v0, 0x78f

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->I:I

    .line 171
    return-void

    .line 175
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

    const/16 v1, -0x1d

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

    .line 178
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->h()V

    .line 180
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 181
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 182
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    const-string v0, "barSize"

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->Y:Ljava/util/Date;

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
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 189
    return-void
.end method
