.class public abstract Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;
.super Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;-><init>()V

    return-void
.end method

.method private l()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->t()V

    .line 43
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->c()V

    .line 44
    return-void
.end method

.method private s()V
    .locals 7

    .line 84
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->K:J

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->L:I

    neg-int v2, v2

    invoke-static {v0, v1, v2}, Lo/ffk;->e(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->a(J)J

    move-result-wide v3

    .line 86
    invoke-static {v3, v4}, Lo/ffk;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    const/4 v0, 0x0

    invoke-static {v3, v4, v0}, Lo/ffk;->b(JI)J

    move-result-wide v5

    goto :goto_0

    .line 89
    :cond_0
    const/16 v0, -0x1e

    invoke-static {v3, v4, v0}, Lo/ffk;->c(JI)J

    move-result-wide v5

    .line 91
    :goto_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v3, v4}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->F:Ljava/util/Date;

    .line 92
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->G:Ljava/util/Date;

    .line 93
    return-void
.end method

.method private t()V
    .locals 5

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->F:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->q:Landroid/widget/TextView;

    const-string v1, "yyyy/M"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->F:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->F:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->G:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 78
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->G:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->F:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    :goto_0
    return-void
.end method

.method private u()V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->s()V

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->t()V

    .line 69
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Z)V

    .line 22
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->invalidate()V

    .line 23
    return-void
.end method

.method protected a(Z)V
    .locals 14

    .line 107
    if-eqz p1, :cond_0

    .line 108
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->K:J

    invoke-static {v1, v2}, Lo/ffk;->a(J)J

    move-result-wide v5

    move-object v1, p0

    const/4 v2, 0x5

    const/4 v3, 0x1

    const/16 v4, 0x136

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;IZIJ)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 109
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->K:J

    .line 110
    const/16 v3, -0x135

    invoke-static {v1, v2, v3}, Lo/ffk;->e(JI)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/ffk;->c(JI)J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->K:J

    invoke-static {v3, v4}, Lo/ffk;->a(J)J

    move-result-wide v3

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 109
    const/4 v5, 0x5

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 113
    :cond_0
    const/16 v8, 0x9b

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const v1, 0xe2c2

    sub-int v9, v1, v0

    .line 115
    if-ge v9, v8, :cond_1

    .line 116
    move v8, v9

    .line 118
    :cond_1
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->K:J

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    neg-int v2, v2

    invoke-static {v0, v1, v2}, Lo/ffk;->e(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->a(J)J

    move-result-wide v10

    .line 119
    neg-int v0, v8

    add-int/lit8 v0, v0, 0x1

    invoke-static {v10, v11, v0}, Lo/ffk;->c(JI)J

    move-result-wide v12

    .line 120
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    move-object v1, p0

    const/4 v2, 0x5

    const/4 v3, 0x0

    move v4, v8

    move-wide v5, v10

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;IZIJ)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 121
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, v12

    move-wide v3, v10

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    const/4 v5, 0x5

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 124
    :goto_0
    return-void
.end method

.method protected b()V
    .locals 2

    .line 27
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 28
    :cond_0
    return-void

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)V

    .line 31
    return-void
.end method

.method public c()V
    .locals 8

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->p:Z

    .line 49
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->G:Ljava/util/Date;

    .line 50
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/ffk;->c(JI)J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->F:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Lo/ffk;->a(J)J

    move-result-wide v3

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->Q:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    .line 49
    const/4 v5, 0x5

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 52
    return-void
.end method

.method protected c(I)V
    .locals 2

    .line 128
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->L:I

    if-eq v0, p1, :cond_0

    .line 129
    iput p1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->L:I

    .line 130
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->L:I

    const v1, 0xe2a3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->a(II)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Z)V

    .line 132
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->s()V

    .line 133
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->l()V

    .line 135
    :cond_0
    return-void
.end method

.method protected e()V
    .locals 2

    .line 35
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 36
    :cond_0
    return-void

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)V

    .line 39
    return-void
.end method

.method protected f()Z
    .locals 1

    .line 97
    const/4 v0, 0x1

    return v0
.end method

.method public g()V
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->R:J

    invoke-static {v0, v1}, Lo/ffk;->c(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->K:J

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->L:I

    .line 58
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->m()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->O:I

    .line 59
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->Q:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->i:Landroid/view/View;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->L:I

    if-nez v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->u()V

    .line 63
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->p()V

    .line 64
    return-void
.end method

.method protected h()I
    .locals 1

    .line 102
    const/4 v0, 0x1

    return v0
.end method

.method protected i()D
    .locals 2

    .line 160
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    return-wide v0
.end method

.method protected k()V
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const v1, 0xe2c2

    if-ge v0, v1, :cond_0

    .line 140
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseMonthFragment;->a(Z)V

    .line 142
    :cond_0
    return-void
.end method
