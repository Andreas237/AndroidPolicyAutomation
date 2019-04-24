.class public Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$c;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private T:Ljava/util/Date;

.field private V:Lo/fad;

.field private Y:Ljava/util/Date;

.field protected a:Lo/exq;

.field private aa:Landroid/os/Handler;

.field private ab:Landroid/view/View$OnClickListener;

.field private b:D

.field private c:Lo/eys;

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

    .line 53
    const-string v0, "SCUI_StepWeekDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 58
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->V:Lo/fad;

    .line 66
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->aa:Landroid/os/Handler;

    .line 180
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->ab:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/Date;)V
    .locals 6

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->u:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$c;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;I)V

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 421
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->H:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->p()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->E:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Lo/fad;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->V:Lo/fad;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;Z)Z
    .locals 0

    .line 52
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->H:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Landroid/content/Context;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    return-object v0
.end method

.method private e(Ljava/util/Date;)V
    .locals 6

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->e:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$c;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;I)V

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 365
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->U:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f()Ljava/lang/String;
    .locals 1

    .line 52
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method private g()V
    .locals 2

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method private h()V
    .locals 5

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    .line 301
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 300
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 303
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    .line 304
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 303
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 316
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->aa:Landroid/os/Handler;

    const/16 v1, 0x1773

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 318
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b()V

    .line 321
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->X:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->aa:Landroid/os/Handler;

    return-object v0
.end method

.method private n()V
    .locals 5

    .line 327
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    const/4 v1, -0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    .line 330
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    .line 337
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 336
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 339
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    .line 340
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 339
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mStartDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mEndDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    return-void
.end method

.method private p()V
    .locals 8

    .line 427
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 431
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 434
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI: null == stepWeekBarData or not valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 436
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    return-void

    .line 439
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    if-nez v0, :cond_1

    .line 442
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI stepWeekBarData = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    return-void

    .line 446
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI stepWeekBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->k()I

    move-result v6

    .line 449
    move v7, v6

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b:D

    .line 451
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 1 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  goalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b:D

    int-to-double v2, v6

    const-wide v4, 0x3fe9c18fa0000000L    # 0.8048780560493469

    mul-double/2addr v2, v4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 453
    const/4 v7, 0x0

    .line 458
    :cond_2
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 2 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  goalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  targetValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b:D

    .line 460
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 3 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  goalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  targetValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->H:Z

    .line 101
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a:Lo/exq;

    .line 104
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b(Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_step_data_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 110
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 111
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 112
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 113
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_four:I

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 110
    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->b(IIIII)V

    .line 116
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->n()V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->c:Lo/eys;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 118
    new-instance v0, Lo/eys;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eys;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->c:Lo/eys;

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->c:Lo/eys;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/eys;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 139
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 140
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->c:Lo/eys;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 149
    :cond_0
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d(Lo/fad;Ljava/lang/String;)V

    .line 151
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g()V

    .line 153
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Q:Z

    if-nez v0, :cond_1

    .line 155
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepWeekDetailFragment setColors"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->z:Lo/eyi;

    .line 157
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 158
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 159
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 160
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_three:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 161
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_four:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 156
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->G:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->ab:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->G:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->N:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->ab:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->L:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->ab:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->L:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    :cond_1
    return-void
.end method

.method public b()V
    .locals 2

    .line 348
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->H:Z

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a:Lo/exq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a:Lo/exq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/exq;->e(Lo/egg;)V

    .line 352
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e(Ljava/util/Date;)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a(Ljava/util/Date;)V

    .line 354
    return-void
.end method

.method public c()V
    .locals 7

    .line 264
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 265
    return-void

    .line 268
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    .line 269
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    const/16 v1, 0x217b

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a(II)V

    .line 270
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    if-gez v0, :cond_1

    .line 272
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    .line 273
    return-void

    .line 277
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    .line 280
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->h()V

    .line 282
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 283
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    const-string v0, "barSize"

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    .line 288
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 287
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 290
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 291
    return-void
.end method

.method public c_()Z
    .locals 1

    .line 177
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 7

    .line 233
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 234
    return-void

    .line 237
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    .line 238
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    const/16 v1, 0x217b

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a(II)V

    .line 239
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    const/16 v1, 0x217b

    if-le v0, v1, :cond_1

    .line 241
    const/16 v0, 0x217b

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->I:I

    .line 242
    return-void

    .line 246
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    const/4 v1, -0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    .line 249
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->h()V

    .line 251
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 252
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    const-string v0, "barSize"

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

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
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 259
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 260
    return-void
.end method

.method public i()V
    .locals 10

    .line 188
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 189
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    sget-object v0, Lo/dae;->gI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 191
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 193
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    .line 194
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 195
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity isn\'t exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    return-void

    .line 198
    :cond_0
    new-instance v7, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-direct {v7, v6, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 199
    const-string v0, "index"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 200
    const-string v0, "goalValue"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->a:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->k()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 201
    const-string v0, "mStartDay"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->T:Ljava/util/Date;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 202
    const-string v0, "mEndDay"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 203
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 205
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepWeekDetailFragment;->e:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 209
    :cond_1
    const-string v0, "barData"

    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 210
    invoke-virtual {v6, v7}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 211
    return-void
.end method
