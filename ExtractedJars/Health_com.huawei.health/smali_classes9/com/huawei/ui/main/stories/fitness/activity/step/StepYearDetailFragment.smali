.class public Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private T:Lo/fad;

.field private V:Ljava/util/Date;

.field private Y:Ljava/util/Date;

.field protected a:Lo/exq;

.field private aa:Landroid/view/View$OnClickListener;

.field private ab:Landroid/os/Handler;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private c:Lo/eys;

.field private e:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    const-string v0, "SCUI_StepYearDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 55
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->T:Lo/fad;

    .line 63
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->ab:Landroid/os/Handler;

    .line 173
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->aa:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Lo/fad;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->T:Lo/fad;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->n()V

    return-void
.end method

.method private b(Ljava/util/Date;)V
    .locals 6

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->d:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;I)V

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 353
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->E:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 49
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/util/Date;)V
    .locals 6

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a:Lo/exq;

    invoke-static {p1}, Lo/dbu;->t(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->q:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;I)V

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 407
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/content/Context;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->H:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->H:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method private f()V
    .locals 5

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    .line 294
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 293
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 296
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    .line 297
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 296
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 300
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 306
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->ab:Landroid/os/Handler;

    const/16 v1, 0x1773

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 308
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b()V

    .line 309
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g()Ljava/lang/String;
    .locals 1

    .line 49
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->U:Landroid/widget/TextView;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->X:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->ab:Landroid/os/Handler;

    return-object v0
.end method

.method private n()V
    .locals 8

    .line 413
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==step_year==Enter updateBarChartUI "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 420
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI: null == stepYearBarData or not valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 422
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    return-void

    .line 425
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 427
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    if-nez v0, :cond_1

    .line 428
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI stepYearBarData = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    return-void

    .line 432
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI stepYearBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->k()I

    move-result v6

    .line 435
    move v7, v6

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->e:D

    .line 437
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->e:D

    int-to-double v2, v6

    const-wide v4, 0x3fe9c18fa0000000L    # 0.8048780560493469

    mul-double/2addr v2, v4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 438
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI stepYearBarData maxData < goalValue * BarChartView.BAR_HEIGHT_IN_VIEW"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    const/4 v7, 0x0

    .line 444
    :cond_2
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI stepYearBarData 1 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->e:D

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

    .line 446
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI stepYearBarData 2 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->e:D

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

    .line 447
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->e:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->e:D

    .line 448
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 3 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->e:D

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

    .line 453
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    return-void
.end method

.method private o()V
    .locals 5

    .line 315
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->r(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    const/16 v1, -0xb

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->t(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    .line 318
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    .line 325
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 324
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 327
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    .line 328
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 327
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mStartDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mEndDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 98
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->H:Z

    .line 99
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a:Lo/exq;

    .line 102
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b(Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_step_data_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 107
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 109
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_four:I

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 107
    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b(IIIII)V

    .line 112
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->o()V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->c:Lo/eys;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 114
    new-instance v0, Lo/eys;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eys;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->c:Lo/eys;

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->c:Lo/eys;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/eys;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 135
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 136
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->c:Lo/eys;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 144
    :cond_0
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d(Lo/fad;Ljava/lang/String;)V

    .line 146
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->h()V

    .line 148
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Q:Z

    if-nez v0, :cond_1

    .line 150
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepYearDetailFragment setColors"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->z:Lo/eyi;

    .line 152
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 153
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_three:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 154
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_four:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 151
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->G:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->aa:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->G:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->N:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->aa:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->L:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->aa:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->L:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 166
    :cond_1
    return-void
.end method

.method public b()V
    .locals 2

    .line 335
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->H:Z

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a:Lo/exq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a:Lo/exq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/exq;->e(Lo/egg;)V

    .line 339
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b(Ljava/util/Date;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->c(Ljava/util/Date;)V

    .line 341
    return-void
.end method

.method public c()V
    .locals 7

    .line 257
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 258
    return-void

    .line 261
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    .line 262
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a(II)V

    .line 263
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    if-gez v0, :cond_1

    .line 265
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    .line 266
    return-void

    .line 270
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->t(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->r(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    .line 273
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->f()V

    .line 275
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 276
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    const-string v0, "barSize"

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    .line 281
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 280
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 283
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 284
    return-void
.end method

.method public c_()Z
    .locals 1

    .line 170
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

    .line 227
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 228
    return-void

    .line 231
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    .line 232
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a(II)V

    .line 233
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->I:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_1

    .line 235
    return-void

    .line 239
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->r(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    const/16 v1, -0xb

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->t(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    .line 242
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->f()V

    .line 244
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 245
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    const-string v0, "barSize"

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    .line 250
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 249
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 252
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 253
    return-void
.end method

.method public i()V
    .locals 10

    .line 181
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 182
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    sget-object v0, Lo/dae;->gF:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 184
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 186
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    .line 187
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 188
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity isn\'t exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    return-void

    .line 191
    :cond_0
    new-instance v7, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-direct {v7, v6, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 192
    const-string v0, "index"

    const/4 v1, 0x3

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 193
    const-string v0, "goalValue"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->a:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->k()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 194
    const-string v0, "mStartDay"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->V:Ljava/util/Date;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 195
    const-string v0, "mEndDay"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 196
    const-string v0, "mTotalSteps"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->T:Lo/fad;

    invoke-virtual {v1}, Lo/fad;->c()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 197
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 199
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 203
    :cond_1
    const-string v0, "barData"

    invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 204
    invoke-virtual {v6, v7}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 205
    return-void
.end method
