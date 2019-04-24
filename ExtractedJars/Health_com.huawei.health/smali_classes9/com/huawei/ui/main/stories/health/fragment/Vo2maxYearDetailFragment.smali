.class public Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;
.super Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$e;
    }
.end annotation


# instance fields
.field private T:Ljava/util/Date;

.field private X:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;-><init>()V

    return-void
.end method

.method private g()V
    .locals 9

    .line 206
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v5

    .line 207
    const/16 v0, -0xb

    invoke-static {v5, v0}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v6

    .line 208
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v6

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    .line 209
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v8

    .line 210
    const/4 v0, -0x1

    invoke-static {v8, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v8

    .line 211
    invoke-static {v8}, Lo/dbu;->p(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

    .line 213
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

    .line 219
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 218
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    .line 222
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 221
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    :cond_0
    return-void
.end method

.method private h()Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/fce;>;"
        }
    .end annotation

    .line 47
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 48
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v5, v0, v2

    .line 49
    const/4 v7, 0x0

    :goto_0
    const/16 v0, 0xc

    if-ge v7, v0, :cond_1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->K:Ljava/util/HashMap;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->K:Ljava/util/HashMap;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 52
    new-instance v0, Lo/fce;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->R:[Ljava/lang/Integer;

    invoke-static {v2, v3}, Lo/feg;->a(I[Ljava/lang/Integer;)I

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/fce;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    new-instance v0, Lo/fce;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fce;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    :goto_1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v5, v0, v2

    .line 49
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 59
    :cond_1
    return-object v4
.end method

.method private i()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/fce;>;"
        }
    .end annotation

    .line 176
    const-string v0, "Track_Vo2maxYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getInitData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 178
    const/4 v5, 0x0

    :goto_0
    const/16 v0, 0xc

    if-ge v5, v0, :cond_0

    .line 179
    new-instance v0, Lo/fce;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fce;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 195
    :cond_0
    return-object v4
.end method

.method private o()V
    .locals 2

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->F:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->H:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->K:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->Q:Lo/fcf;

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->Q:Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->h()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fcf;->c(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->L:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 44
    return-void
.end method

.method protected a(II)V
    .locals 0

    .line 300
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->a(II)V

    .line 301
    return-void
.end method

.method public b()V
    .locals 9

    .line 114
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->a(II)V

    .line 116
    const-string v0, "Track_Vo2maxYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    if-ltz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->J:Z

    if-eqz v0, :cond_1

    .line 118
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    .line 119
    return-void

    .line 124
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v5

    .line 125
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v7

    .line 127
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

    .line 133
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 132
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    .line 136
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 135
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    :cond_2
    const-string v0, "Track_Vo2maxYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->Q:Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->i()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fcf;->c(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->L:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 152
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->k()V

    .line 153
    return-void
.end method

.method protected d()V
    .locals 0

    .line 157
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d()V

    .line 158
    return-void
.end method

.method public e()V
    .locals 9

    .line 70
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    .line 71
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->a(II)V

    .line 72
    const-string v0, "Track_Vo2maxYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    const/16 v1, 0x64

    if-gt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->J:Z

    if-eqz v0, :cond_1

    .line 75
    :cond_0
    return-void

    .line 80
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    const/16 v1, -0xc

    invoke-static {v0, v1}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v5

    .line 81
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

    const/16 v1, -0xc

    invoke-static {v0, v1}, Lo/dbu;->c(Ljava/util/Date;I)J

    move-result-wide v7

    .line 83
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

    .line 89
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    .line 92
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    :cond_2
    const-string v0, "Track_Vo2maxYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->Q:Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->i()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fcf;->c(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->L:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->k()V

    .line 109
    return-void
.end method

.method public f()V
    .locals 3

    .line 163
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->g()V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->Q:Lo/fcf;

    if-nez v0, :cond_0

    .line 165
    new-instance v0, Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fcf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->Q:Lo/fcf;

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->Q:Lo/fcf;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/fcf;->setType(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->Q:Lo/fcf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->i()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fcf;->c(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->G:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->Q:Lo/fcf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 172
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->o()V

    .line 173
    return-void
.end method

.method public k()V
    .locals 10

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->T:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v6, v0, v2

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->X:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->r(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v8, v0, v2

    .line 253
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->J:Z

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->P:Lo/dgu;

    move-wide v1, v6

    move-wide v3, v8

    new-instance v5, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$e;

    invoke-direct {v5, p0}, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$e;-><init>(Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 256
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 64
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
