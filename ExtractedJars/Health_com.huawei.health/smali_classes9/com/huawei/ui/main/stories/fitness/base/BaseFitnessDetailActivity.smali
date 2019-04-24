.class public abstract Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field public f:Lo/emr;

.field protected g:Landroid/content/Intent;

.field protected h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field

.field public i:Lo/enb;

.field protected k:Lo/emq;

.field protected m:Lo/ejf;

.field public n:J

.field public o:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->i:Lo/enb;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->h:Ljava/util/ArrayList;

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->m:Lo/ejf;

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 77
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_sub_tab_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->k:Lo/emq;

    .line 78
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->f:Lo/emr;

    .line 80
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->b()V

    .line 81
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->d()V

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->i:Lo/enb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->i:Lo/enb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->i:Lo/enb;

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lo/enb;->setScrollHeightArea(I)V

    .line 87
    :cond_0
    return-void
.end method

.method protected abstract b()V
.end method

.method protected abstract d()V
.end method

.method protected f()I
    .locals 1

    .line 67
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_fitness_detail:I

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 58
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 59
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->setContentView(I)V

    .line 60
    iput-object p0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->o:Landroid/content/Context;

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->n:J

    .line 63
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->a()V

    .line 64
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 98
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 99
    return-void
.end method
