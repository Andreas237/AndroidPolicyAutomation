.class Lo/cwi$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwi;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cwi;


# direct methods
.method constructor <init>(Lo/cwi;Landroid/os/Looper;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 130
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 131
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 133
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 136
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->c(Lo/cwi;)Lo/bru;

    move-result-object v0

    iget-object v1, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->d(Lo/cwi;)Landroid/view/View$OnClickListener;

    move-result-object v1

    iget-object v2, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v2}, Lo/cwi;->a(Lo/cwi;)Landroid/view/View$OnClickListener;

    move-result-object v2

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    const/4 v4, 0x1

    invoke-interface {v0, v4, v1, v2, v3}, Lo/bru;->b(ILandroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/content/Context;)V

    .line 138
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 139
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    iget-object v1, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->e(Lo/cwi;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v2}, Lo/cwi;->b(Lo/cwi;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v2

    iget-object v3, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v3}, Lo/cwi;->c(Lo/cwi;)Lo/bru;

    move-result-object v3

    iget-object v4, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    invoke-static {v0, v1, v2, v3, v4}, Lo/cwi;->b(Lo/cwi;Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V

    .line 141
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 142
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->i(Lo/cwi;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 143
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->f(Lo/cwi;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 144
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->g(Lo/cwi;)Lcom/huawei/health/suggestion/model/Summary;

    move-result-object v0

    iget-object v1, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->f(Lo/cwi;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_maxMET()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setMaxMet(I)V

    .line 145
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->g(Lo/cwi;)Lcom/huawei/health/suggestion/model/Summary;

    move-result-object v0

    iget-object v1, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->f(Lo/cwi;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_achieve_percent()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setFinishRate(I)V

    .line 146
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->g(Lo/cwi;)Lcom/huawei/health/suggestion/model/Summary;

    move-result-object v0

    iget-object v1, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->f(Lo/cwi;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_load_peak()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setTrainingLoadPeak(I)V

    .line 149
    :cond_3
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->c(Lo/cwi;)Lo/bru;

    move-result-object v0

    iget-object v1, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->g(Lo/cwi;)Lcom/huawei/health/suggestion/model/Summary;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bru;->a(Lcom/huawei/health/suggestion/model/Summary;)V

    .line 152
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_5

    .line 153
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroid/os/Bundle;

    .line 154
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0, v5}, Lo/cwi;->a(Lo/cwi;Landroid/os/Bundle;)V

    .line 156
    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_6

    .line 157
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 158
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->k(Lo/cwi;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 159
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "FitnessBanner"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 160
    const-string v0, "type"

    const-string v1, "FITNESS_SUGGESTION"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 161
    const-string v0, "url"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 162
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 163
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->k(Lo/cwi;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 165
    :cond_6
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_7

    .line 166
    iget-object v0, p0, Lo/cwi$5;->d:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->h(Lo/cwi;)V

    .line 168
    :cond_7
    return-void
.end method
