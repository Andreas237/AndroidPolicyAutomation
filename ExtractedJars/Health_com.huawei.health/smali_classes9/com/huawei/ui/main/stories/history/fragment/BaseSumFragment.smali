.class public abstract Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;
.super Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;
.source "SourceFile"


# instance fields
.field private Y:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 6

    .line 23
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->p:Z

    .line 24
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->m:Z

    .line 25
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->invalidate()V

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Z)V

    .line 27
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x8

    if-le v0, v1, :cond_0

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->Y:Z

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(F)V

    .line 32
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 33
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->R:J

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 34
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->H:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 35
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->q:Landroid/widget/TextView;

    const-string v1, "yyyy"

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->R:J

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 36
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->H:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 37
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->H:I

    neg-int v0, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v5, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy"

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->R:J

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy"

    .line 40
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 42
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy"

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy"

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->R:J

    .line 43
    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    :cond_3
    :goto_0
    return-void
.end method

.method protected a(Z)V
    .locals 8

    .line 94
    if-eqz p1, :cond_0

    .line 95
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->K:J

    invoke-static {v1, v2}, Lo/ffk;->b(J)J

    move-result-wide v5

    move-object v1, p0

    const/4 v2, 0x7

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;IZIJ)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 96
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->K:J

    .line 97
    invoke-static {v1, v2}, Lo/ffk;->b(J)J

    move-result-wide v3

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

    .line 96
    const-wide/16 v1, 0x0

    const/4 v5, 0x7

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 100
    :cond_0
    return-void
.end method

.method protected b()V
    .locals 0

    .line 51
    return-void
.end method

.method public c()V
    .locals 8

    .line 60
    new-instance v0, Ljava/util/Date;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->R:J

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->F:Ljava/util/Date;

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->p:Z

    .line 62
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->R:J

    .line 63
    invoke-static {v1, v2}, Lo/ffk;->b(J)J

    move-result-wide v3

    iget v6, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->O:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->Q:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    .line 62
    const-wide/16 v1, 0x0

    const/4 v5, 0x7

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 65
    return-void
.end method

.method protected c(I)V
    .locals 0

    .line 105
    return-void
.end method

.method protected e()V
    .locals 0

    .line 56
    return-void
.end method

.method protected f()Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->Y:Z

    return v0
.end method

.method public g()V
    .locals 3

    .line 69
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->R:J

    invoke-static {v0, v1}, Lo/ffk;->b(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->K:J

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->L:I

    .line 71
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->m()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->O:I

    .line 72
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->Q:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->i:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->c:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->q:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->p()V

    .line 78
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 79
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;->R:J

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 80
    return-void
.end method

.method protected h()I
    .locals 1

    .line 89
    const/4 v0, 0x3

    return v0
.end method

.method protected i()D
    .locals 2

    .line 121
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    return-wide v0
.end method

.method protected k()V
    .locals 0

    .line 110
    return-void
.end method
