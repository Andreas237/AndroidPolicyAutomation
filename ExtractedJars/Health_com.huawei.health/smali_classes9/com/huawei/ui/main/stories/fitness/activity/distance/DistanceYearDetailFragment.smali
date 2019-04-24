.class public Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$b;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private T:Ljava/util/Date;

.field private V:Lo/fad;

.field private Z:Ljava/util/Date;

.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private aa:Landroid/os/Handler;

.field private ab:Ljava/lang/String;

.field protected b:Lo/exq;

.field private c:D

.field private e:Lo/eyf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const-string v0, "SCUI_DistanceYearDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 49
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->V:Lo/fad;

    .line 57
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->aa:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;)Lo/fad;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->V:Lo/fad;

    return-object v0
.end method

.method private a(Ljava/util/Date;)V
    .locals 6

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->b:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->d:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$b;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;I)V

    const/4 v4, 0x3

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 280
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->aa:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/util/Date;)V
    .locals 6

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->b:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->q:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$b;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;I)V

    const/4 v4, 0x3

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 335
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->ab:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 43
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->n()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;Z)Z
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->H:Z

    return p1
.end method

.method private f()V
    .locals 5

    .line 250
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->r(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    const/16 v1, -0xb

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->t(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    .line 254
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    .line 260
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 259
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mStartDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mEndDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    return-void
.end method

.method private g()V
    .locals 6

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    .line 231
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 230
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    const/16 v3, 0xc

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 239
    :cond_0
    new-instance v5, Lo/fad;

    invoke-direct {v5}, Lo/fad;-><init>()V

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->ab:Ljava/lang/String;

    invoke-virtual {p0, v5, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 243
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->b()V

    .line 245
    return-void
.end method

.method private h()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    return-void
.end method

.method private n()V
    .locals 9

    .line 341
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->b:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->b(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 349
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI:data not Valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 351
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->ab:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    return-void

    .line 354
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    if-nez v0, :cond_1

    .line 357
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI disYearBarData = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->ab:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    return-void

    .line 361
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI disYearBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v5

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c:D

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c:D

    invoke-virtual {v0, v1, v2, v5, v6}, Lo/eyf;->c(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c:D

    .line 366
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c:D

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 368
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 369
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v5, v6, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->ab:Ljava/lang/String;

    invoke-virtual {p0, v8, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    invoke-virtual {v0, v7}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    const/16 v3, 0xc

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 379
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

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

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c:D

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

    .line 383
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->H:Z

    .line 86
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->b:Lo/exq;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->ab:Ljava/lang/String;

    .line 89
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->ab:Ljava/lang/String;

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 98
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->b(Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_distance_data_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 104
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 105
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 106
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 107
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 104
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->b(IIIII)V

    .line 110
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DistanceYearDetailFragment setColors"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->z:Lo/eyi;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 112
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 113
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 114
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 115
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 111
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 117
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->f()V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 119
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_light_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    .line 125
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_dark_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 124
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_dark_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 127
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 128
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 129
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v8

    .line 130
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "00"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v9

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    invoke-virtual {v0, v9, v8}, Lo/eyf;->setPadding(FF)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->ab:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a:Ljava/util/List;

    const/16 v3, 0xc

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->e:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 139
    :cond_1
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->ab:Ljava/lang/String;

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    .line 141
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->h()V

    .line 142
    return-void
.end method

.method public b()V
    .locals 1

    .line 266
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->H:Z

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a(Ljava/util/Date;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->c(Ljava/util/Date;)V

    .line 269
    return-void
.end method

.method public c()V
    .locals 7

    .line 194
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 195
    return-void

    .line 198
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    .line 199
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a(II)V

    .line 200
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    if-gez v0, :cond_1

    .line 202
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    .line 203
    return-void

    .line 207
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->t(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->r(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    .line 210
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g()V

    .line 212
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 213
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    .line 215
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 214
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    const-string v0, "barSize"

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 220
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 221
    return-void
.end method

.method public d()V
    .locals 7

    .line 163
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 164
    return-void

    .line 167
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    .line 168
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->a(II)V

    .line 169
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_1

    .line 172
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->I:I

    .line 173
    return-void

    .line 177
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->r(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    const/16 v1, -0xb

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->t(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

    .line 180
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g()V

    .line 182
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 183
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    const-string v0, "barSize"

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 188
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->Z:Ljava/util/Date;

    .line 189
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 188
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceYearDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 191
    return-void
.end method
