.class public Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$d;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private T:Lo/fad;

.field private V:Ljava/util/Date;

.field private a:D

.field private ab:Ljava/lang/String;

.field private ac:Landroid/os/Handler;

.field protected b:Lo/exq;

.field private c:Lo/eyf;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const-string v0, "SCUI_DistanceDayDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 49
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->T:Lo/fad;

    .line 57
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->ac:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;)Lo/fad;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->T:Lo/fad;

    return-object v0
.end method

.method private a(Ljava/util/Date;)V
    .locals 6

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->b:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->l:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$d;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$d;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;I)V

    const/4 v4, 0x3

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 305
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->ab:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->ac:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Ljava/util/Date;)V
    .locals 6

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->b:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->i:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$d;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$d;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;I)V

    const/4 v4, 0x3

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 250
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;Z)Z
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->H:Z

    return p1
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 43
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->p()V

    return-void
.end method

.method private f()V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    return-void
.end method

.method private g()V
    .locals 5

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->h:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    invoke-static {}, Lo/ezz;->a()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    const/16 v3, 0x18

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 213
    :cond_0
    new-instance v4, Lo/fad;

    invoke-direct {v4}, Lo/fad;-><init>()V

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->ab:Ljava/lang/String;

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 217
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->b()V

    .line 219
    return-void
.end method

.method private h()V
    .locals 4

    .line 226
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->h:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mCurrentDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    .line 232
    return-void
.end method

.method private p()V
    .locals 7

    .line 311
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->b:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->b(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 319
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI:data not Valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 321
    return-void

    .line 323
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    if-nez v0, :cond_1

    .line 326
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI disDayBarData = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    return-void

    .line 329
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI disDayBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v4

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a:D

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a:D

    invoke-virtual {v0, v1, v2, v4, v5}, Lo/eyf;->c(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a:D

    .line 334
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a:D

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 336
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 337
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    invoke-virtual {v0, v6}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    invoke-static {}, Lo/ezz;->a()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    const/16 v3, 0x18

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 343
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->ab:Ljava/lang/String;

    .line 87
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->ab:Ljava/lang/String;

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->H:Z

    .line 92
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->b:Lo/exq;

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 97
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->b(Ljava/lang/String;)V

    .line 99
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 100
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 101
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 102
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 103
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 99
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->b(IIIII)V

    .line 105
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DistanceDayDetailFragment setColors"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->z:Lo/eyi;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 107
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 109
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 110
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 106
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 112
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->h()V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 114
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_light_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    .line 118
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_dark_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 117
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_distance_dark_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->ab:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 123
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 124
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 125
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v8

    .line 126
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "00:"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v9

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    invoke-virtual {v0, v9, v8}, Lo/eyf;->setPadding(FF)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    invoke-static {}, Lo/ezz;->a()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->e:Ljava/util/List;

    const/16 v3, 0x18

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 132
    :cond_1
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->ab:Ljava/lang/String;

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c(Lo/fad;Ljava/lang/String;)V

    .line 134
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->f()V

    .line 135
    return-void
.end method

.method public b()V
    .locals 1

    .line 236
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->H:Z

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->c(Ljava/util/Date;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a(Ljava/util/Date;)V

    .line 239
    return-void
.end method

.method public c()V
    .locals 6

    .line 178
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    .line 179
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    const v1, 0xea60

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a(II)V

    .line 180
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    if-ltz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->H:Z

    if-eqz v0, :cond_1

    .line 182
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    .line 183
    return-void

    .line 186
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->h(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    .line 188
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g()V

    .line 190
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 191
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    const-string v0, "barSize"

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    const-string v0, "time"

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 197
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 198
    return-void
.end method

.method public d()V
    .locals 6

    .line 156
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    .line 157
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    const v1, 0xea60

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->a(II)V

    .line 158
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->I:I

    const v1, 0xea60

    if-gt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->H:Z

    if-eqz v0, :cond_1

    .line 160
    :cond_0
    return-void

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    .line 165
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g()V

    .line 167
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 168
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    const-string v0, "barSize"

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v0, "time"

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->V:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 174
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceDayDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 175
    return-void
.end method
