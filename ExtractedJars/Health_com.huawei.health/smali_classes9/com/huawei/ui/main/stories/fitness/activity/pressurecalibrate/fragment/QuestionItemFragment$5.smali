.class Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.huawei.ui.pressure.question.next"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;Landroid/content/Intent;)Landroid/content/Intent;

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 96
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getQuestionId ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewk;

    move-result-object v3

    invoke-virtual {v3}, Lo/ewk;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewk;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewk;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, p4, v0

    if-gez v0, :cond_0

    .line 98
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "id name  ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewk;

    move-result-object v3

    invoke-virtual {v3}, Lo/ewk;->d()Ljava/util/List;

    move-result-object v3

    long-to-int v4, p4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ewi;

    invoke-virtual {v3}, Lo/ewi;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewk;

    move-result-object v1

    invoke-virtual {v1}, Lo/ewk;->a()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    .line 100
    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewk;

    move-result-object v2

    invoke-virtual {v2}, Lo/ewk;->d()Ljava/util/List;

    move-result-object v2

    long-to-int v3, p4

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ewi;

    invoke-virtual {v2}, Lo/ewi;->b()Ljava/lang/String;

    move-result-object v2

    .line 99
    invoke-virtual {v0, v1, v2}, Lo/ewn;->b(ILjava/lang/String;)V

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewk;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewk;->a()I

    move-result v0

    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v1

    iget-object v1, v1, Lo/ewn;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;Z)Z

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 105
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->n()Ljava/lang/String;

    move-result-object v5

    .line 106
    const-string v0, "wifi_device"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_pressure_calibrate_question_prompt:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "10"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->i(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->i(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 110
    goto :goto_0

    .line 111
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->i(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 114
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewl;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewl;->notifyDataSetChanged()V

    .line 115
    return-void
.end method
