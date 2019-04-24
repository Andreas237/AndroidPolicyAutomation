.class public Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;
.source "SourceFile"


# instance fields
.field private A:Ljava/lang/String;

.field private D:Lo/fax;

.field private G:Landroid/os/Handler;

.field private H:Ljava/util/Date;

.field private j:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;-><init>()V

    .line 38
    const-string v0, "HeartRateYearDetailFragment"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    .line 43
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->G:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->o()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->G:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    return-object v0
.end method

.method private i()V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->r:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->t:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    return-void
.end method

.method private k()V
    .locals 9

    .line 176
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v5

    .line 177
    const/16 v0, -0xb

    invoke-static {v5, v0}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v6

    .line 178
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v6

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    .line 179
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v8

    .line 180
    const/4 v0, -0x1

    invoke-static {v8, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v8

    .line 181
    invoke-static {v8}, Lo/dbu;->p(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

    .line 182
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

    .line 188
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 187
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    .line 191
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 190
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    :cond_0
    return-void
.end method

.method private o()V
    .locals 4

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter updateYearBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fax;->setIsShowMax(Z)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->g()Lo/ext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fax;->setHeartRateZone(Lo/ext;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fax;->d(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->y:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateYearBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 65
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->k()V

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 67
    new-instance v0, Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fax;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->g()Lo/ext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fax;->setHeartRateZone(Lo/ext;)V

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->h()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fax;->d(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 74
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->i()V

    .line 75
    return-void
.end method

.method public b()V
    .locals 9

    .line 134
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    .line 135
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->d(II)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    if-ltz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->v:Z

    if-eqz v0, :cond_1

    .line 138
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    .line 139
    return-void

    .line 144
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v5

    .line 145
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v7

    .line 147
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

    .line 153
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 152
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    .line 156
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->h()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fax;->d(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 165
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->c()V

    .line 166
    return-void
.end method

.method public c()V
    .locals 6

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter requestDatas"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->v:Z

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v4

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v4, v5, v2, v1}, Lo/exr;->d(JILo/egg;)V

    .line 225
    :cond_0
    return-void
.end method

.method public e()V
    .locals 9

    .line 96
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    .line 97
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->d(II)V

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    const/16 v1, 0x64

    if-gt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->v:Z

    if-eqz v0, :cond_1

    .line 100
    :cond_0
    return-void

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    const/16 v1, -0xc

    invoke-static {v0, v1}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v5

    .line 106
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

    const/16 v1, -0xc

    invoke-static {v0, v1}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v7

    .line 109
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

    .line 114
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 113
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->H:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    .line 117
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 116
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->D:Lo/fax;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->j:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->h()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fax;->d(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 130
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->c()V

    .line 131
    return-void
.end method

.method public f()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/faz;>;"
        }
    .end annotation

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getData ............."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 277
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/exr;->a(I)Ljava/util/List;

    move-result-object v5

    .line 279
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 280
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

    .line 281
    invoke-virtual {v7}, Lo/eux;->a()I

    move-result v8

    .line 282
    invoke-virtual {v7}, Lo/eux;->c()I

    move-result v9

    .line 283
    new-instance v0, Lo/faz;

    int-to-float v1, v8

    int-to-float v2, v9

    invoke-direct {v0, v1, v2}, Lo/faz;-><init>(FF)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    goto :goto_0

    .line 287
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/exr;->c(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/exr;->c(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 289
    const-string v6, "--"

    .line 291
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->f:Landroid/widget/LinearLayout;

    invoke-static {v6, v0}, Lo/fiu;->d(Ljava/lang/String;Landroid/widget/LinearLayout;)V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/exr;->b(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/exr;->b(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 296
    const-string v7, "--"

    .line 298
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->h:Landroid/widget/LinearLayout;

    invoke-static {v7, v0}, Lo/fiu;->d(Ljava/lang/String;Landroid/widget/LinearLayout;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/exr;->e(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/exr;->e(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 303
    const-string v8, "--"

    .line 305
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->g:Landroid/widget/LinearLayout;

    invoke-static {v8, v0}, Lo/fiu;->d(Ljava/lang/String;Landroid/widget/LinearLayout;)V

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/exr;->d(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getData ............."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    return-object v4
.end method

.method public g()Lo/ext;
    .locals 5

    .line 319
    const/4 v4, 0x0

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->z:Lo/exr;

    invoke-virtual {v0}, Lo/exr;->d()Lo/ext;

    move-result-object v4

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

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

    .line 328
    return-object v4
.end method

.method public h()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/faz;>;"
        }
    .end annotation

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getInitData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 249
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 250
    const/4 v5, 0x0

    :goto_0
    const/16 v0, 0xc

    if-ge v5, v0, :cond_0

    .line 251
    new-instance v0, Lo/faz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/faz;-><init>(FF)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getInitData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    return-object v4
.end method
