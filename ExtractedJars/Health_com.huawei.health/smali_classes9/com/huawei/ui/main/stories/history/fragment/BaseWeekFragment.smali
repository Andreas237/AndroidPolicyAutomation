.class public abstract Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;
.super Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;-><init>()V

    return-void
.end method

.method private r()V
    .locals 7

    .line 109
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->K:J

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->L:I

    neg-int v2, v2

    invoke-static {v0, v1, v2}, Lo/ffk;->e(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->a(J)J

    move-result-wide v3

    .line 110
    const/4 v0, -0x6

    invoke-static {v3, v4, v0}, Lo/ffk;->c(JI)J

    move-result-wide v5

    .line 111
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v3, v4}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->F:Ljava/util/Date;

    .line 112
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->G:Ljava/util/Date;

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    .line 115
    invoke-static {v2, v5, v6}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    invoke-static {v2, v5, v6}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    .line 118
    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    :goto_0
    return-void
.end method

.method private s()V
    .locals 5

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->F:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->G:Ljava/util/Date;

    .line 44
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->G:Ljava/util/Date;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->F:Ljava/util/Date;

    .line 47
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->c()V

    .line 50
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Z)V

    .line 22
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->invalidate()V

    .line 23
    return-void
.end method

.method protected a(Z)V
    .locals 14

    .line 62
    if-eqz p1, :cond_0

    .line 63
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->K:J

    invoke-static {v1, v2}, Lo/ffk;->a(J)J

    move-result-wide v5

    move-object v1, p0

    const/4 v2, 0x4

    const/4 v3, 0x1

    const/16 v4, 0x46

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;IZIJ)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 64
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->K:J

    .line 65
    const/16 v3, -0x45

    invoke-static {v1, v2, v3}, Lo/ffk;->e(JI)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/ffk;->c(JI)J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->K:J

    invoke-static {v3, v4}, Lo/ffk;->a(J)J

    move-result-wide v3

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 64
    const/4 v5, 0x4

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 68
    :cond_0
    const/16 v8, 0x23

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const v1, 0xea5d

    sub-int v9, v1, v0

    .line 70
    if-ge v9, v8, :cond_1

    .line 71
    move v8, v9

    .line 73
    :cond_1
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->K:J

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    neg-int v2, v2

    invoke-static {v0, v1, v2}, Lo/ffk;->e(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->a(J)J

    move-result-wide v10

    .line 74
    neg-int v0, v8

    add-int/lit8 v0, v0, 0x1

    invoke-static {v10, v11, v0}, Lo/ffk;->c(JI)J

    move-result-wide v12

    .line 75
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    move-object v1, p0

    const/4 v2, 0x4

    const/4 v3, 0x0

    move v4, v8

    move-wide v5, v10

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;IZIJ)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 76
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, v12

    move-wide v3, v10

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    const/4 v5, 0x4

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 79
    :goto_0
    return-void
.end method

.method protected b()V
    .locals 2

    .line 27
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 28
    :cond_0
    return-void

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)V

    .line 31
    return-void
.end method

.method public c()V
    .locals 8

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->p:Z

    .line 55
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->G:Ljava/util/Date;

    .line 56
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/ffk;->c(JI)J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->F:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Lo/ffk;->a(J)J

    move-result-wide v3

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->Q:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    .line 55
    const/4 v5, 0x4

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 58
    return-void
.end method

.method protected c(I)V
    .locals 7

    .line 137
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->L:I

    if-eq v0, p1, :cond_0

    .line 138
    iput p1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->L:I

    .line 139
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->L:I

    const v1, 0xea56

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->a(II)V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Z)V

    .line 141
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->K:J

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->L:I

    neg-int v2, v2

    invoke-static {v0, v1, v2}, Lo/ffk;->e(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ffk;->a(J)J

    move-result-wide v3

    .line 142
    const/4 v0, -0x6

    invoke-static {v3, v4, v0}, Lo/ffk;->c(JI)J

    move-result-wide v5

    .line 143
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v3, v4}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->F:Ljava/util/Date;

    .line 144
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->G:Ljava/util/Date;

    .line 145
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->s()V

    .line 147
    :cond_0
    return-void
.end method

.method protected e()V
    .locals 2

    .line 35
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 36
    :cond_0
    return-void

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)V

    .line 39
    return-void
.end method

.method public g()V
    .locals 4

    .line 83
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->l()V

    .line 84
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 85
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->R:J

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 86
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->ac:I

    const/4 v1, 0x7

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    sub-int v3, v0, v1

    .line 87
    if-gez v3, :cond_0

    .line 88
    add-int/lit8 v3, v3, 0x7

    .line 90
    :cond_0
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->R:J

    invoke-static {v0, v1, v3}, Lo/ffk;->e(JI)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->K:J

    .line 91
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->L:I

    .line 92
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->m()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->O:I

    .line 93
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->Q:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->i:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->r()V

    .line 97
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->p()V

    .line 98
    return-void
.end method

.method protected h()I
    .locals 1

    .line 124
    const/4 v0, 0x0

    return v0
.end method

.method protected i()D
    .locals 2

    .line 165
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    return-wide v0
.end method

.method protected k()V
    .locals 2

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const v1, 0xea5d

    if-ge v0, v1, :cond_0

    .line 130
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->a(Z)V

    .line 132
    :cond_0
    return-void
.end method

.method protected l()V
    .locals 1

    .line 101
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->C:Z

    if-eqz v0, :cond_0

    .line 102
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->ac:I

    goto :goto_0

    .line 104
    :cond_0
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseWeekFragment;->ac:I

    .line 106
    :goto_0
    return-void
.end method
