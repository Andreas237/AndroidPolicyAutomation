.class public Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;
.source "SourceFile"


# instance fields
.field private A:Ljava/lang/String;

.field private D:Lo/fax;

.field private E:Landroid/view/View$OnClickListener;

.field private F:Landroid/os/Handler;

.field private G:Ljava/util/Date;

.field private I:Landroid/view/View$OnClickListener;

.field private j:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;-><init>()V

    .line 38
    const-string v0, "HeartRateWeekDetailFragment"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    .line 44
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->F:Landroid/os/Handler;

    .line 83
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->I:Landroid/view/View$OnClickListener;

    .line 89
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->E:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->n()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->F:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->r:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->E:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->t:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->I:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    return-void
.end method

.method private k()V
    .locals 8

    .line 192
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v5

    .line 193
    invoke-static {v5}, Lo/dbu;->p(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

    .line 194
    const/4 v0, -0x6

    invoke-static {v5, v0}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v6

    .line 195
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v6

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    .line 197
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

    .line 203
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 202
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    .line 206
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 205
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    :cond_0
    return-void
.end method

.method private n()V
    .locals 8

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/exr;->c(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/exr;->c(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 249
    const-string v4, "--"

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->f:Landroid/widget/LinearLayout;

    invoke-static {v4, v0}, Lo/fiu;->d(Ljava/lang/String;Landroid/widget/LinearLayout;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/exr;->b(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/exr;->b(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 256
    const-string v5, "--"

    .line 258
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->h:Landroid/widget/LinearLayout;

    invoke-static {v5, v0}, Lo/fiu;->d(Ljava/lang/String;Landroid/widget/LinearLayout;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/exr;->e(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/exr;->e(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 263
    const-string v6, "--"

    .line 265
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->g:Landroid/widget/LinearLayout;

    invoke-static {v6, v0}, Lo/fiu;->d(Ljava/lang/String;Landroid/widget/LinearLayout;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/exr;->d(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fax;->setIsShowMax(Z)V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->g()Lo/ext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fax;->setHeartRateZone(Lo/ext;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->i()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fax;->d(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 278
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->y:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 66
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->k()V

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 68
    new-instance v0, Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fax;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->g()Lo/ext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fax;->setHeartRateZone(Lo/ext;)V

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->h()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fax;->d(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 74
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->f()V

    .line 75
    return-void
.end method

.method public b()V
    .locals 9

    .line 138
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    .line 139
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    const/16 v1, 0x217b

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->d(II)V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    if-ltz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->v:Z

    if-eqz v0, :cond_1

    .line 142
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    .line 143
    return-void

    .line 150
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v5

    .line 151
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v7

    .line 153
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

    .line 159
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    .line 162
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 161
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->h()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fax;->d(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 178
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->c()V

    .line 179
    return-void
.end method

.method public c()V
    .locals 6

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter requestDatas"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->v:Z

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v4

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;)V

    const/4 v2, 0x2

    invoke-virtual {v0, v4, v5, v2, v1}, Lo/exr;->d(JILo/egg;)V

    .line 240
    :cond_0
    return-void
.end method

.method public e()V
    .locals 9

    .line 96
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    .line 97
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    const/16 v1, 0x217b

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->d(II)V

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    const/16 v1, 0x217b

    if-gt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->v:Z

    if-eqz v0, :cond_1

    .line 100
    :cond_0
    return-void

    .line 106
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    const/4 v1, -0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v5

    .line 107
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

    const/4 v1, -0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v7

    .line 109
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

    .line 115
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->G:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    .line 118
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->D:Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->j:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->h()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fax;->d(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 134
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->c()V

    .line 135
    return-void
.end method

.method public g()Lo/ext;
    .locals 5

    .line 328
    const/4 v4, 0x0

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    invoke-virtual {v0}, Lo/exr;->d()Lo/ext;

    move-result-object v4

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartRateZone hrZoneConf = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    return-object v4
.end method

.method public h()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/faz;>;"
        }
    .end annotation

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getInitData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 287
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 288
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x7

    if-ge v5, v0, :cond_0

    .line 289
    new-instance v0, Lo/faz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/faz;-><init>(FF)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getInitData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    return-object v4
.end method

.method public i()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/faz;>;"
        }
    .end annotation

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getData ..........."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 309
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->z:Lo/exr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/exr;->a(I)Ljava/util/List;

    move-result-object v5

    .line 311
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 312
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/eux;

    .line 313
    invoke-virtual {v7}, Lo/eux;->a()I

    move-result v8

    .line 314
    invoke-virtual {v7}, Lo/eux;->c()I

    move-result v9

    .line 315
    new-instance v0, Lo/faz;

    int-to-float v1, v8

    int-to-float v2, v9

    invoke-direct {v0, v1, v2}, Lo/faz;-><init>(FF)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    goto :goto_0

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateWeekDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getData ..........."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    return-object v4
.end method
