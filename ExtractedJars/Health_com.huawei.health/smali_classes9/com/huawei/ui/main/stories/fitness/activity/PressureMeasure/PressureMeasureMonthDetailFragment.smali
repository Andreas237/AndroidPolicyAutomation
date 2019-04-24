.class public Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;
.source "SourceFile"


# instance fields
.field protected A:Lo/fbx;

.field private B:Ljava/util/Date;

.field private C:Ljava/util/Date;

.field private D:I

.field private E:Lo/evt;

.field private F:Ljava/util/Date;

.field private G:I

.field private H:I

.field private I:Lo/exv;

.field private J:J

.field private K:Landroid/os/Handler;

.field private L:Ljava/util/Date;

.field private M:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

.field private N:J

.field private S:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;-><init>()V

    .line 66
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->D:I

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->C:Ljava/util/Date;

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->H:I

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->F:Ljava/util/Date;

    .line 76
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->G:I

    .line 78
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->N:J

    .line 79
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->J:J

    .line 82
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->K:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;J)J
    .locals 0

    .line 64
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->N:J

    return-wide p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Ljava/util/Date;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->L:Ljava/util/Date;

    return-object v0
.end method

.method private a(I)V
    .locals 10

    .line 162
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "M/d"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->L:Ljava/util/Date;

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_pressure_month_analysis:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    invoke-virtual {v0}, Lo/exv;->e()Ljava/lang/String;

    move-result-object v8

    .line 167
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

    .line 168
    const-string v0, "PressureMeasureMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateUi,errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isNature = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->S:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->S:Z

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->x:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 171
    const-string v0, "MonthDetailFragment update"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    invoke-virtual {v2}, Lo/exv;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 175
    const-string v0, "MonthDetailFragment update"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is not nature Month"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :goto_0
    const v0, 0x186a1

    if-ne p1, v0, :cond_1

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 180
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Ljava/util/Date;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->L:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->c(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/List;Z)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->c(Ljava/util/List;Z)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Ljava/util/Date;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->F:Ljava/util/Date;

    return-object v0
.end method

.method private c(I)V
    .locals 9

    .line 183
    mul-int/lit8 v0, p1, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v4, v0, v2

    .line 184
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 185
    const-string v0, "PressureMeasureMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentClickMonth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dbu;->c(J)J

    move-result-wide v7

    .line 187
    cmp-long v0, v7, v4

    if-nez v0, :cond_0

    .line 188
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->S:Z

    .line 189
    return-void

    .line 191
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->S:Z

    .line 192
    const-string v0, "PressureMeasureMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "judgeNatureMonth,isNature = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->S:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/Date;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->e(Ljava/util/Date;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/List;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(Ljava/util/List;)V

    return-void
.end method

.method private c(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;)V"
        }
    .end annotation

    .line 414
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 415
    const/4 v3, 0x0

    .line 416
    const/4 v4, 0x0

    .line 417
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 418
    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v0

    add-int/2addr v3, v0

    .line 419
    goto :goto_0

    .line 420
    :cond_0
    if-lez v2, :cond_1

    .line 421
    div-int v4, v3, v2

    .line 423
    :cond_1
    if-lez v4, :cond_2

    .line 424
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->f:Landroid/widget/TextView;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 425
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->n:Landroid/widget/TextView;

    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 426
    :cond_2
    if-nez v4, :cond_3

    .line 427
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->f:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->n:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 430
    :cond_3
    :goto_1
    return-void
.end method

.method private c(Ljava/util/List;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;Z)V"
        }
    .end annotation

    .line 135
    const/4 v5, 0x0

    .line 136
    const-string v0, "PressureMeasureMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "upToGradePieChart,isNature= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->S:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " haveData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->S:Z

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->F(Ljava/util/Date;)I

    move-result v5

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->F(Ljava/util/Date;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    invoke-static {v1}, Lo/dbu;->c(Ljava/util/Date;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->L:Ljava/util/Date;

    invoke-static {v1}, Lo/dbu;->c(Ljava/util/Date;)I

    move-result v1

    add-int v5, v0, v1

    .line 145
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 146
    if-eqz p2, :cond_2

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    invoke-virtual {v0, v1, v5, p1}, Lo/exv;->d(Ljava/util/Date;ILjava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 148
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 149
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fix;

    invoke-virtual {v0}, Lo/fix;->d()I

    move-result v0

    if-lez v0, :cond_1

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d:Lo/fca;

    const/16 v1, 0x2713

    invoke-virtual {v0, v4, v1}, Lo/fca;->a(Ljava/util/List;I)V

    .line 151
    const/16 v0, 0x2713

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(Ljava/util/List;I)V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->K:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->K:Landroid/os/Handler;

    const/16 v1, 0x3ee

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 148
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 158
    :cond_2
    const/16 v0, 0x2713

    invoke-virtual {p0, p2, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(ZI)V

    .line 159
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Lo/evt;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->E:Lo/evt;

    return-object v0
.end method

.method private d(JJ)V
    .locals 11

    .line 401
    const-wide/16 v0, 0x3c

    mul-long v7, p1, v0

    .line 402
    const-wide/16 v0, 0x3c

    mul-long v9, p3, v0

    .line 403
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    move-wide v1, v7

    move-wide v3, v9

    new-instance v6, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$8;

    invoke-direct {v6, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$8;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)V

    const/4 v5, 0x3

    invoke-virtual/range {v0 .. v6}, Lo/exv;->e(JJILo/egg;)V

    .line 412
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->a(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;JJ)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(JJ)V

    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;)V"
        }
    .end annotation

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->F(Ljava/util/Date;)I

    move-result v3

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    invoke-virtual {v0, v1, v3, p1}, Lo/exv;->d(Ljava/util/Date;ILjava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 124
    invoke-static {v2}, Lo/fja;->a(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    const/4 v0, 0x0

    const/16 v1, 0x2713

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(ZI)V

    goto :goto_0

    .line 127
    :cond_0
    const/4 v0, 0x1

    const/16 v1, 0x2713

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(ZI)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d:Lo/fca;

    const/16 v1, 0x2713

    invoke-virtual {v0, v2, v1}, Lo/fca;->a(Ljava/util/List;I)V

    .line 129
    const/16 v0, 0x2713

    invoke-virtual {p0, v2, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(Ljava/util/List;I)V

    .line 132
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;J)J
    .locals 0

    .line 64
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->J:J

    return-wide p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->K:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->F:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->c(I)V

    return-void
.end method

.method private e(Ljava/util/Date;)V
    .locals 4

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 256
    return-void

    .line 258
    :cond_0
    const-string v0, "PressureMeasureMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "date = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)V

    const/16 v2, 0x3b

    invoke-virtual {v0, p1, v2, v1}, Lo/exv;->a(Ljava/util/Date;ILo/egg;)V

    .line 271
    return-void
.end method

.method private g()V
    .locals 5

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fbx;->setWillNotDraw(Z)V

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->aa()Lo/eih$h;

    move-result-object v4

    .line 385
    invoke-interface {v4}, Lo/eih$h;->e()I

    move-result v0

    or-int/lit8 v0, v0, 0x1

    invoke-interface {v4, v0}, Lo/eih$h;->b(I)V

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->c()V

    .line 388
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->N:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->J:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 389
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->N:J

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->J:J

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(JJ)V

    .line 392
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->L:Ljava/util/Date;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->L:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->e(Ljava/util/Date;)V

    .line 395
    :cond_1
    const-string v0, "PressureMeasureMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "month refresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .line 219
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->a()V

    .line 220
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v3

    .line 221
    invoke-static {v3}, Lo/dbu;->y(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    .line 222
    invoke-static {v3}, Lo/dbu;->B(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->C:Ljava/util/Date;

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->C:Ljava/util/Date;

    const/16 v2, 0x2713

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->a(Ljava/util/Date;Ljava/util/Date;I)V

    .line 224
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->H:I

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->D:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(II)V

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->w:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 250
    return-void
.end method

.method protected c()V
    .locals 4

    .line 276
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->c()V

    .line 277
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Month initDataDiagram"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 279
    new-instance v0, Lo/fbx;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->i:Landroid/content/Context;

    sget-object v2, Lo/eic;->Q:Lo/eic;

    invoke-direct {v0, v1, v2}, Lo/fbx;-><init>(Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fbx;->setLayerType(ILandroid/graphics/Paint;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->a(Lo/fbx;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->t:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->E:Lo/evt;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    sget-object v2, Lo/eic;->Q:Lo/eic;

    invoke-virtual {v0, v1, v2}, Lo/evt;->a(Lo/eih;Lo/eic;)Lo/eii;

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->o:Lo/fab;

    invoke-virtual {v0}, Lo/fab;->notifyDataSetChanged()V

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fbx;->d(Lo/eih$m;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fbx;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 329
    return-void
.end method

.method protected e()V
    .locals 7

    .line 196
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->e()V

    .line 197
    new-instance v0, Lo/exv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->i:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->I:Lo/exv;

    .line 198
    new-instance v0, Lo/evt;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/eic;->Q:Lo/eic;

    invoke-direct {v0, v1, v2}, Lo/evt;-><init>(Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->E:Lo/evt;

    .line 199
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 200
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->i:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 201
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_measure_month_detail:I

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 202
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 203
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 205
    new-instance v0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->M:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    .line 206
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 207
    const-string v0, "PAGE_TYPE"

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->G:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->M:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->setArguments(Landroid/os/Bundle;)V

    .line 210
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v5

    .line 211
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v6

    .line 212
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_measure_month_detail:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->M:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v6, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 213
    invoke-virtual {v6}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 215
    :cond_0
    return-void
.end method

.method protected f()V
    .locals 5

    .line 352
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->f()V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->ah()Z

    move-result v4

    .line 354
    const-string v0, "PressureMeasureMonthDetailFragment"

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

    .line 355
    if-nez v4, :cond_0

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->w(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->C:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->x(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->C:Ljava/util/Date;

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$6;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$6;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Lo/fbx;)V

    invoke-virtual {v0, v1}, Lo/fbx;->a(Lo/eih$k;)V

    .line 364
    :cond_0
    return-void
.end method

.method protected i()V
    .locals 5

    .line 334
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->i()V

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    invoke-virtual {v0}, Lo/fbx;->ah()Z

    move-result v4

    .line 337
    const-string v0, "PressureMeasureMonthDetailFragment"

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

    .line 338
    if-nez v4, :cond_0

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->v(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->B:Ljava/util/Date;

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->C:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->A(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->C:Ljava/util/Date;

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$4;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Lo/fbx;)V

    invoke-virtual {v0, v1}, Lo/fbx;->b(Lo/eih$k;)V

    .line 347
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 375
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->onResume()V

    .line 376
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "month onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->g()V

    .line 379
    return-void
.end method
