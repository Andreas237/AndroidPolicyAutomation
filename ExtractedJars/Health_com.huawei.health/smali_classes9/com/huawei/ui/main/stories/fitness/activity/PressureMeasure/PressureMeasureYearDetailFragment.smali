.class public Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;
.source "SourceFile"


# instance fields
.field private A:Ljava/util/Date;

.field private B:I

.field private C:Ljava/util/Date;

.field private D:Ljava/util/Date;

.field private E:I

.field private F:Lo/evt;

.field private G:Lo/exv;

.field private H:Lo/fbx;

.field private I:I

.field private J:J

.field private K:Landroid/os/Handler;

.field private L:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

.field private M:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 58
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;-><init>()V

    .line 60
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->B:I

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->A:Ljava/util/Date;

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->E:I

    .line 69
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->I:I

    .line 71
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->M:J

    .line 72
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->J:J

    .line 75
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->K:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;J)J
    .locals 0

    .line 58
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->M:J

    return-wide p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)Ljava/util/Date;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    return-object p1
.end method

.method private a(JJ)V
    .locals 11

    .line 338
    const-wide/16 v0, 0x3c

    mul-long v7, p1, v0

    .line 339
    const-wide/16 v0, 0x3c

    mul-long v9, p3, v0

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->G:Lo/exv;

    move-wide v1, v7

    move-wide v3, v9

    new-instance v6, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$6;

    invoke-direct {v6, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$6;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)V

    const/4 v5, 0x4

    invoke-virtual/range {v0 .. v6}, Lo/exv;->e(JJILo/egg;)V

    .line 349
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->K:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 1

    .line 58
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->c(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fix;>;)V"
        }
    .end annotation

    .line 352
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 353
    const/4 v3, 0x0

    .line 354
    const/4 v4, 0x0

    .line 355
    const/4 v5, 0x0

    .line 356
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_1

    .line 357
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fix;

    invoke-virtual {v0}, Lo/fix;->d()I

    move-result v0

    if-lez v0, :cond_0

    .line 358
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fix;

    invoke-virtual {v0}, Lo/fix;->d()I

    move-result v0

    add-int/2addr v3, v0

    .line 359
    add-int/lit8 v5, v5, 0x1

    .line 356
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 362
    :cond_1
    if-lez v5, :cond_2

    .line 363
    div-int v4, v3, v5

    .line 365
    :cond_2
    if-lez v4, :cond_3

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->f:Landroid/widget/TextView;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->n:Landroid/widget/TextView;

    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 368
    :cond_3
    if-nez v4, :cond_4

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->f:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->n:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 372
    :cond_4
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    return-object p1
.end method

.method private c(Ljava/util/Date;)Ljava/util/Date;
    .locals 3

    .line 375
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 376
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 377
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 378
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)Lo/fbx;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/List;Z)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->e(Ljava/util/List;Z)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;)V"
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->G:Lo/exv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->G:Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    invoke-virtual {v0, v1, p1}, Lo/exv;->a(Ljava/util/Date;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 103
    invoke-static {v2}, Lo/fja;->a(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    const/4 v0, 0x0

    const/16 v1, 0x2714

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->d(ZI)V

    goto :goto_0

    .line 106
    :cond_0
    const/4 v0, 0x1

    const/16 v1, 0x2714

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->d(ZI)V

    .line 107
    const/16 v0, 0x2714

    invoke-virtual {p0, v2, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b(Ljava/util/List;I)V

    .line 111
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;J)J
    .locals 0

    .line 58
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->J:J

    return-wide p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;JJ)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->a(JJ)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/List;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->c(Ljava/util/List;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->A:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)Lo/evt;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->F:Lo/evt;

    return-object v0
.end method

.method private e(Ljava/util/List;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;Z)V"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->G:Lo/exv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 116
    if-eqz p2, :cond_2

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->G:Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->A:Ljava/util/Date;

    invoke-virtual {v0, v1, p1}, Lo/exv;->a(Ljava/util/Date;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 118
    const/16 v0, 0x2714

    invoke-virtual {p0, v2, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b(Ljava/util/List;I)V

    .line 119
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 120
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fix;

    invoke-virtual {v0}, Lo/fix;->d()I

    move-result v0

    if-lez v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->d:Lo/fca;

    const/16 v1, 0x2714

    invoke-virtual {v0, v2, v1}, Lo/fca;->a(Ljava/util/List;I)V

    .line 119
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 124
    :cond_1
    move-object v0, v2

    check-cast v0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b(Ljava/util/ArrayList;)V

    .line 126
    :cond_2
    const/16 v0, 0x2714

    invoke-virtual {p0, p2, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->d(ZI)V

    .line 128
    :cond_3
    return-void
.end method

.method private g()V
    .locals 5

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fbx;->setWillNotDraw(Z)V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->aa()Lo/eih$h;

    move-result-object v4

    .line 326
    invoke-interface {v4}, Lo/eih$h;->e()I

    move-result v0

    or-int/lit8 v0, v0, 0x1

    invoke-interface {v4, v0}, Lo/eih$h;->b(I)V

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->c()V

    .line 329
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->M:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->J:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 330
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->M:J

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->J:J

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->a(JJ)V

    .line 332
    :cond_0
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "year refresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 5

    .line 157
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->a()V

    .line 158
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v4

    .line 159
    invoke-static {v4}, Lo/dbu;->s(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    .line 160
    invoke-static {v4}, Lo/dbu;->q(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    .line 161
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PressureMeasureYearDetailFragment mEndDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    invoke-static {v3}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    const/16 v2, 0x2714

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->a(Ljava/util/Date;Ljava/util/Date;I)V

    .line 163
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->E:I

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->B:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b(II)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->w:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 178
    return-void
.end method

.method protected b()V
    .locals 4

    .line 256
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->b()V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->G:Lo/exv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 258
    return-void

    .line 260
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->G:Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    new-instance v2, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)V

    const/4 v3, 0x4

    invoke-virtual {v0, v1, v3, v2}, Lo/exv;->e(Ljava/util/Date;ILo/egg;)V

    .line 271
    return-void
.end method

.method protected c()V
    .locals 5

    .line 184
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->c()V

    .line 185
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Year initDataDiagram"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 187
    const/16 v0, 0x2714

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b(Ljava/util/List;I)V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 189
    new-instance v0, Lo/fbx;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->i:Landroid/content/Context;

    sget-object v2, Lo/eic;->R:Lo/eic;

    invoke-direct {v0, v1, v2}, Lo/fbx;-><init>(Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fbx;->setLayerType(ILandroid/graphics/Paint;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->a(Lo/fbx;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->t:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->F:Lo/evt;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    sget-object v2, Lo/eic;->R:Lo/eic;

    invoke-virtual {v0, v1, v2}, Lo/evt;->a(Lo/eih;Lo/eic;)Lo/eii;

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->o:Lo/fab;

    invoke-virtual {v0}, Lo/fab;->notifyDataSetChanged()V

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fbx;->d(Lo/eih$m;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fbx;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 251
    return-void
.end method

.method protected e()V
    .locals 7

    .line 133
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->e()V

    .line 134
    new-instance v0, Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->i:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->G:Lo/exv;

    .line 135
    new-instance v0, Lo/evt;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/eic;->R:Lo/eic;

    invoke-direct {v0, v1, v2}, Lo/evt;-><init>(Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->F:Lo/evt;

    .line 137
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->i:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 139
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_measure_year_detail:I

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 140
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 143
    new-instance v0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->L:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    .line 144
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 145
    const-string v0, "PAGE_TYPE"

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->I:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->L:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->setArguments(Landroid/os/Bundle;)V

    .line 148
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v5

    .line 149
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v6

    .line 150
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_measure_year_detail:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->L:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v6, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 151
    invoke-virtual {v6}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 153
    :cond_0
    return-void
.end method

.method protected f()V
    .locals 5

    .line 293
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->f()V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->ah()Z

    move-result v4

    .line 295
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mChart.isAnimating:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    if-nez v4, :cond_0

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->D(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->C(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    .line 299
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b()V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$8;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$8;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Lo/fbx;)V

    invoke-virtual {v0, v1}, Lo/fbx;->a(Lo/eih$k;)V

    .line 306
    :cond_0
    return-void
.end method

.method protected i()V
    .locals 5

    .line 275
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->i()V

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->ah()Z

    move-result v4

    .line 277
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mChart.isAnimating:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    if-nez v4, :cond_0

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->j(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->I(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->C:Ljava/util/Date;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->D:Ljava/util/Date;

    const/16 v2, 0x2714

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->a(Ljava/util/Date;Ljava/util/Date;I)V

    .line 282
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b()V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$5;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->H:Lo/fbx;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Lo/fbx;)V

    invoke-virtual {v0, v1}, Lo/fbx;->b(Lo/eih$k;)V

    .line 289
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 317
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->onResume()V

    .line 318
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "year onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->g()V

    .line 320
    return-void
.end method
