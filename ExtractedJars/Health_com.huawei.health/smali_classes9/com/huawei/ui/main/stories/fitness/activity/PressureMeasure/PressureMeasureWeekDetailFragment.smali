.class public Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:Ljava/util/Date;

.field private C:Ljava/util/Date;

.field protected D:Landroid/os/Handler;

.field private E:Lo/exv;

.field private F:Lo/fbx;

.field private G:Ljava/util/Date;

.field private H:Lo/evt;

.field private I:I

.field private J:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

.field private K:I

.field private L:J

.field private M:J

.field private N:J

.field private O:Ljava/util/Date;

.field private R:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;-><init>()V

    .line 62
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->A:I

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->B:Ljava/util/Date;

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->I:I

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->G:Ljava/util/Date;

    .line 72
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->K:I

    .line 74
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->M:J

    .line 75
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->N:J

    .line 76
    const-wide/32 v0, 0x5265c00

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->L:J

    .line 77
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->D:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)Lo/fbx;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/Date;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->c(Ljava/util/Date;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/List;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->e(Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/List;Z)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->e(Ljava/util/List;Z)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;J)J
    .locals 0

    .line 60
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->N:J

    return-wide p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->O:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)Lo/evt;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->H:Lo/evt;

    return-object v0
.end method

.method private b(JJ)V
    .locals 11

    .line 436
    const-wide/16 v0, 0x3c

    mul-long v7, p1, v0

    .line 437
    const-wide/16 v0, 0x3c

    mul-long v9, p3, v0

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->E:Lo/exv;

    move-wide v1, v7

    move-wide v3, v9

    new-instance v6, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$6;

    invoke-direct {v6, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$6;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)V

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v6}, Lo/exv;->e(JJILo/egg;)V

    .line 446
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->e(I)V

    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;)V"
        }
    .end annotation

    .line 449
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 450
    const/4 v3, 0x0

    .line 451
    const/4 v4, 0x0

    .line 452
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_0

    .line 453
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v0

    add-int/2addr v3, v0

    .line 452
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 455
    :cond_0
    if-lez v2, :cond_1

    .line 456
    div-int v4, v3, v2

    .line 458
    :cond_1
    if-lez v4, :cond_2

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->f:Landroid/widget/TextView;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->n:Landroid/widget/TextView;

    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 461
    :cond_2
    if-nez v4, :cond_3

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->f:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->n:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 465
    :cond_3
    :goto_1
    return-void
.end method

.method private c(I)V
    .locals 10

    .line 171
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "M/d"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->O:Ljava/util/Date;

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_pressure_week_analysis:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->E:Lo/exv;

    invoke-virtual {v0}, Lo/exv;->e()Ljava/lang/String;

    move-result-object v8

    .line 176
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v5, v0, v1

    const/4 v1, 0x1

    aput-object v6, v0, v1

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 177
    const v0, 0x186a1

    if-ne p1, v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 181
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->R:Z

    if-eqz v0, :cond_1

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->x:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 185
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 186
    const-string v0, "MonthDetailFragment update"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is not nature week"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;JJ)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(JJ)V

    return-void
.end method

.method private c(Ljava/util/Date;)V
    .locals 3

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->E:Lo/exv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 274
    return-void

    .line 276
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->E:Lo/exv;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)V

    const/16 v2, 0xd

    invoke-virtual {v0, p1, v2, v1}, Lo/exv;->a(Ljava/util/Date;ILo/egg;)V

    .line 287
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;J)J
    .locals 0

    .line 60
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->M:J

    return-wide p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)Ljava/util/Date;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->O:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->G:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    return-object p1
.end method

.method private e(I)V
    .locals 9

    .line 353
    mul-int/lit8 v0, p1, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v4, v0, v2

    .line 354
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 355
    invoke-static {v6}, Lo/dbu;->u(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->L:J

    add-long v7, v0, v2

    .line 356
    const-string v0, "PressureMeasureWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " weekClickTimeLong ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    cmp-long v0, v7, v4

    if-nez v0, :cond_0

    .line 358
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->R:Z

    .line 359
    return-void

    .line 361
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->R:Z

    .line 362
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->c(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;)V"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->E:Lo/exv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->E:Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2, p1}, Lo/exv;->d(Ljava/util/Date;ILjava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 117
    invoke-static {v3}, Lo/fja;->a(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    const/4 v0, 0x0

    const/16 v1, 0x2712

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d(ZI)V

    goto :goto_0

    .line 120
    :cond_0
    const/4 v0, 0x1

    const/16 v1, 0x2712

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d(ZI)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d:Lo/fca;

    const/16 v1, 0x2712

    invoke-virtual {v0, v3, v1}, Lo/fca;->a(Ljava/util/List;I)V

    .line 122
    const/16 v0, 0x2712

    invoke-virtual {p0, v3, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(Ljava/util/List;I)V

    .line 126
    :cond_1
    :goto_0
    return-void
.end method

.method private e(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;Z)V"
        }
    .end annotation

    .line 129
    const-string v0, "PressureMeasureWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "upToGradePieChart haveData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->E:Lo/exv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 131
    if-eqz p2, :cond_1

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->E:Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2, p1}, Lo/exv;->d(Ljava/util/Date;ILjava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 133
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 134
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fix;

    invoke-virtual {v0}, Lo/fix;->d()I

    move-result v0

    if-lez v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d:Lo/fca;

    const/16 v1, 0x2712

    invoke-virtual {v0, v4, v1}, Lo/fca;->a(Ljava/util/List;I)V

    .line 136
    const/16 v0, 0x2712

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(Ljava/util/List;I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->D:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->D:Landroid/os/Handler;

    const/16 v1, 0x3ee

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 133
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 143
    :cond_1
    const/16 v0, 0x2712

    invoke-virtual {p0, p2, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d(ZI)V

    .line 144
    return-void
.end method

.method private g()V
    .locals 5

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fbx;->setWillNotDraw(Z)V

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->aa()Lo/eih$h;

    move-result-object v4

    .line 420
    invoke-interface {v4}, Lo/eih$h;->e()I

    move-result v0

    or-int/lit8 v0, v0, 0x1

    invoke-interface {v4, v0}, Lo/eih$h;->b(I)V

    .line 421
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->c()V

    .line 423
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->M:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->N:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 424
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->M:J

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->N:J

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(JJ)V

    .line 427
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->G:Ljava/util/Date;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->G:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->c(Ljava/util/Date;)V

    .line 430
    :cond_1
    const-string v0, "PressureMeasureWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "week refresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    return-void
.end method


# virtual methods
.method public a(Ljava/util/Date;)Ljava/util/Date;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 233
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 234
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 235
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 236
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 237
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 238
    invoke-virtual {v3, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 239
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 240
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 241
    invoke-virtual {v4, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 242
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 243
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 244
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 246
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 247
    const/4 v0, 0x3

    invoke-virtual {v3, v0, v5}, Ljava/util/Calendar;->set(II)V

    .line 248
    const/4 v0, 0x7

    const/4 v1, 0x2

    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 249
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method protected a()V
    .locals 6

    .line 194
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->a()V

    .line 195
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v3

    .line 196
    invoke-static {v3}, Lo/dbu;->z(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->B:Ljava/util/Date;

    .line 198
    :try_start_0
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->e(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->B:Ljava/util/Date;

    .line 199
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->a(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    goto :goto_0

    .line 200
    :catch_0
    move-exception v4

    .line 201
    invoke-virtual {v4}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v5

    .line 202
    const-string v0, "PressureMeasureWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->B:Ljava/util/Date;

    const/16 v2, 0x2712

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->a(Ljava/util/Date;Ljava/util/Date;I)V

    .line 205
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->I:I

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->A:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(II)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->w:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 229
    return-void
.end method

.method protected c()V
    .locals 3

    .line 292
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->c()V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 294
    new-instance v0, Lo/fbx;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->i:Landroid/content/Context;

    sget-object v2, Lo/eic;->P:Lo/eic;

    invoke-direct {v0, v1, v2}, Lo/fbx;-><init>(Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fbx;->setLayerType(ILandroid/graphics/Paint;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->a(Lo/fbx;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->t:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->H:Lo/evt;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    sget-object v2, Lo/eic;->P:Lo/eic;

    invoke-virtual {v0, v1, v2}, Lo/evt;->a(Lo/eih;Lo/eic;)Lo/eii;

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->o:Lo/fab;

    invoke-virtual {v0}, Lo/fab;->notifyDataSetChanged()V

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fbx;->d(Lo/eih$m;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fbx;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 344
    return-void
.end method

.method public e(Ljava/util/Date;)Ljava/util/Date;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 253
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 254
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 255
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 256
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 257
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 258
    invoke-virtual {v3, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 259
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 260
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 261
    invoke-virtual {v4, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 262
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 263
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 264
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 266
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 267
    const/4 v0, 0x3

    invoke-virtual {v4, v0, v5}, Ljava/util/Calendar;->set(II)V

    .line 268
    const/4 v0, 0x7

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 269
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method protected e()V
    .locals 7

    .line 148
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->e()V

    .line 149
    new-instance v0, Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->i:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->E:Lo/exv;

    .line 150
    new-instance v0, Lo/evt;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/eic;->P:Lo/eic;

    invoke-direct {v0, v1, v2}, Lo/evt;-><init>(Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->H:Lo/evt;

    .line 152
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 153
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->i:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 154
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_measure_week_detail:I

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 155
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 156
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 158
    new-instance v0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->J:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    .line 159
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 160
    const-string v0, "PAGE_TYPE"

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->K:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->J:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->setArguments(Landroid/os/Bundle;)V

    .line 163
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v5

    .line 164
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v6

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_measure_week_detail:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->J:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v6, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 166
    invoke-virtual {v6}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 168
    :cond_0
    return-void
.end method

.method protected f()V
    .locals 9

    .line 388
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->f()V

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->ah()Z

    move-result v4

    .line 390
    const-string v0, "PressureMeasureWeekDetailFragment"

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

    .line 391
    if-nez v4, :cond_0

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    const/4 v1, -0x7

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v5

    .line 393
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->B:Ljava/util/Date;

    const/4 v1, -0x7

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v7

    .line 395
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->B:Ljava/util/Date;

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$10;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$10;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Lo/fbx;)V

    invoke-virtual {v0, v1}, Lo/fbx;->a(Lo/eih$k;)V

    .line 402
    :cond_0
    return-void
.end method

.method protected i()V
    .locals 9

    .line 369
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->i()V

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->ah()Z

    move-result v4

    .line 372
    const-string v0, "PressureMeasureWeekDetailFragment"

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

    .line 373
    if-nez v4, :cond_0

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    const/4 v1, -0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v5

    .line 375
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->C:Ljava/util/Date;

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->B:Ljava/util/Date;

    const/4 v1, -0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v7

    .line 377
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->B:Ljava/util/Date;

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$2;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->F:Lo/fbx;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Lo/fbx;)V

    invoke-virtual {v0, v1}, Lo/fbx;->b(Lo/eih$k;)V

    .line 384
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 410
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->onResume()V

    .line 411
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "week onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->g()V

    .line 413
    return-void
.end method
