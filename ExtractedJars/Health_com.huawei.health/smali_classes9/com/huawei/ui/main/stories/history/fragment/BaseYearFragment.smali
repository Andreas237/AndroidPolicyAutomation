.class public abstract Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;
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
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->t()V

    .line 43
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->c()V

    .line 44
    return-void
.end method

.method private t()V
    .locals 5

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->F:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->k(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->q:Landroid/widget/TextView;

    const-string v1, "yyyy"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->F:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->F:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->G:Ljava/util/Date;

    .line 80
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 82
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->G:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->F:Ljava/util/Date;

    .line 83
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    :goto_0
    return-void
.end method

.method private u()V
    .locals 7

    .line 67
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->K:J

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->L:I

    neg-int v2, v2

    invoke-static {v0, v1, v2}, Lo/ffk;->d(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->c(J)J

    move-result-wide v3

    .line 68
    const/16 v0, -0xb

    invoke-static {v3, v4, v0}, Lo/ffk;->b(JI)J

    move-result-wide v5

    .line 69
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v3, v4}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->F:Ljava/util/Date;

    .line 70
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->G:Ljava/util/Date;

    .line 71
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->t()V

    .line 72
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Z)V

    .line 22
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->invalidate()V

    .line 23
    return-void
.end method

.method protected a(Z)V
    .locals 14

    .line 95
    if-eqz p1, :cond_0

    .line 96
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->K:J

    invoke-static {v1, v2}, Lo/ffk;->c(J)J

    move-result-wide v5

    move-object v1, p0

    const/4 v2, 0x6

    const/4 v3, 0x1

    const/16 v4, 0x78

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;IZIJ)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 97
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->K:J

    .line 98
    const/16 v3, -0x77

    invoke-static {v1, v2, v3}, Lo/ffk;->d(JI)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/ffk;->b(JI)J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->K:J

    invoke-static {v3, v4}, Lo/ffk;->c(J)J

    move-result-wide v3

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 97
    const/4 v5, 0x6

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 101
    :cond_0
    const/16 v8, 0x3c

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    rsub-int v9, v0, 0x4b0

    .line 103
    if-ge v9, v8, :cond_1

    .line 104
    move v8, v9

    .line 106
    :cond_1
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->K:J

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    neg-int v2, v2

    invoke-static {v0, v1, v2}, Lo/ffk;->d(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->c(J)J

    move-result-wide v10

    .line 107
    neg-int v0, v8

    add-int/lit8 v0, v0, 0x1

    invoke-static {v10, v11, v0}, Lo/ffk;->b(JI)J

    move-result-wide v12

    .line 108
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    move-object v1, p0

    const/4 v2, 0x6

    const/4 v3, 0x0

    move v4, v8

    move-wide v5, v10

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;IZIJ)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 109
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, v12

    move-wide v3, v10

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    const/4 v5, 0x6

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 112
    :goto_0
    return-void
.end method

.method protected b()V
    .locals 2

    .line 27
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 28
    :cond_0
    return-void

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)V

    .line 31
    return-void
.end method

.method public c()V
    .locals 8

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->p:Z

    .line 49
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->G:Ljava/util/Date;

    .line 50
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/ffk;->c(JI)J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->F:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Lo/ffk;->a(J)J

    move-result-wide v3

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->Q:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    .line 49
    const/4 v5, 0x6

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 52
    return-void
.end method

.method protected c(I)V
    .locals 7

    .line 116
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->L:I

    if-eq v0, p1, :cond_0

    .line 117
    iput p1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->L:I

    .line 118
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->L:I

    const/16 v1, 0x4a4

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->a(II)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Z)V

    .line 120
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->K:J

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->L:I

    neg-int v2, v2

    invoke-static {v0, v1, v2}, Lo/ffk;->d(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->c(J)J

    move-result-wide v3

    .line 121
    const/16 v0, -0xb

    invoke-static {v3, v4, v0}, Lo/ffk;->b(JI)J

    move-result-wide v5

    .line 122
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v3, v4}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->F:Ljava/util/Date;

    .line 123
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->G:Ljava/util/Date;

    .line 124
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->l()V

    .line 126
    :cond_0
    return-void
.end method

.method protected e()V
    .locals 2

    .line 35
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 36
    :cond_0
    return-void

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)V

    .line 39
    return-void
.end method

.method public g()V
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->R:J

    invoke-static {v0, v1}, Lo/ffk;->b(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->K:J

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->L:I

    .line 58
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->m()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->O:I

    .line 59
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->Q:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->i:Landroid/view/View;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->L:I

    if-nez v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->u()V

    .line 63
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->p()V

    .line 64
    return-void
.end method

.method protected h()I
    .locals 1

    .line 90
    const/4 v0, 0x2

    return v0
.end method

.method protected i()D
    .locals 2

    .line 151
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    return-wide v0
.end method

.method protected k()V
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x4b0

    if-ge v0, v1, :cond_0

    .line 131
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseYearFragment;->a(Z)V

    .line 133
    :cond_0
    return-void
.end method
