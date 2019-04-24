.class public Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;
.super Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$d;
    }
.end annotation


# instance fields
.field private T:Ljava/util/Date;

.field private U:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;-><init>()V

    return-void
.end method

.method private h()V
    .locals 8

    .line 190
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v5

    .line 191
    invoke-static {v5}, Lo/dbu;->p(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

    .line 192
    const/16 v0, -0x1d

    invoke-static {v5, v0}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v6

    .line 193
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v6

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    .line 195
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

    .line 202
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 201
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    .line 205
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 204
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    :cond_0
    return-void
.end method

.method private i()V
    .locals 2

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->F:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->H:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    return-void
.end method

.method private n()Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/fce;>;"
        }
    .end annotation

    .line 262
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v5, v0, v2

    .line 264
    const/4 v7, 0x0

    :goto_0
    const/16 v0, 0x1e

    if-ge v7, v0, :cond_1

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->K:Ljava/util/HashMap;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->K:Ljava/util/HashMap;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 267
    new-instance v0, Lo/fce;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->R:[Ljava/lang/Integer;

    invoke-static {v2, v3}, Lo/feg;->a(I[Ljava/lang/Integer;)I

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/fce;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    goto :goto_1

    .line 269
    :cond_0
    new-instance v0, Lo/fce;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fce;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    invoke-static {v0, v7}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v5, v0, v2

    goto :goto_0

    .line 274
    :cond_1
    return-object v4
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->K:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->Q:Lo/fcf;

    if-eqz v0, :cond_0

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->Q:Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->n()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fcf;->c(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->L:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 45
    return-void
.end method

.method protected a(II)V
    .locals 0

    .line 331
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->a(II)V

    .line 332
    return-void
.end method

.method public b()V
    .locals 9

    .line 101
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    .line 102
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    const/16 v1, 0x78f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->a(II)V

    .line 103
    const-string v0, "Track_Vo2maxMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    if-ltz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->J:Z

    if-eqz v0, :cond_1

    .line 105
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    .line 106
    return-void

    .line 114
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    const/16 v1, 0x1e

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v5

    .line 115
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

    const/16 v1, 0x1e

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v7

    .line 117
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

    .line 123
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 122
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    .line 126
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 125
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    :cond_2
    const-string v0, "Track_Vo2maxMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->Q:Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->g()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fcf;->c(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->L:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 141
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->k()V

    .line 142
    return-void
.end method

.method protected d()V
    .locals 0

    .line 146
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d()V

    .line 147
    return-void
.end method

.method public e()V
    .locals 9

    .line 55
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    .line 56
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    const/16 v1, 0x78f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->a(II)V

    .line 57
    const-string v0, "Track_Vo2maxMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    const/16 v1, 0x78f

    if-gt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->J:Z

    if-eqz v0, :cond_1

    .line 59
    :cond_0
    return-void

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    const/16 v1, -0x1e

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v5

    .line 68
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

    const/16 v1, -0x1e

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v7

    .line 70
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

    .line 84
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    .line 87
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    :cond_2
    const-string v0, "Track_Vo2maxMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->Q:Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->g()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fcf;->c(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->L:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 95
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->k()V

    .line 96
    return-void
.end method

.method public f()V
    .locals 3

    .line 152
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->h()V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->Q:Lo/fcf;

    if-nez v0, :cond_0

    .line 154
    new-instance v0, Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fcf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->Q:Lo/fcf;

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->Q:Lo/fcf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fcf;->setType(I)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->Q:Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->g()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fcf;->c(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->G:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->Q:Lo/fcf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 159
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->i()V

    .line 160
    return-void
.end method

.method public g()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/fce;>;"
        }
    .end annotation

    .line 279
    const-string v0, "Track_Vo2maxMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getInitData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 281
    const/4 v5, 0x0

    :goto_0
    const/16 v0, 0x1e

    if-ge v5, v0, :cond_0

    .line 282
    new-instance v0, Lo/fce;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fce;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 325
    :cond_0
    const-string v0, "Track_Vo2maxMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getInitData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    return-object v4
.end method

.method public k()V
    .locals 10

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->U:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v6, v0, v2

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->T:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v8, v0, v2

    .line 220
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->J:Z

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->P:Lo/dgu;

    move-wide v1, v6

    move-wide v3, v8

    new-instance v5, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$d;

    invoke-direct {v5, p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$d;-><init>(Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 222
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 49
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
