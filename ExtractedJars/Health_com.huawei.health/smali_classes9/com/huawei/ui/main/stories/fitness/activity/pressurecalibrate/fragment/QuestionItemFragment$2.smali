.class Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    .line 117
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->g(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 121
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->m()F

    move-result v0

    float-to-int v4, v0

    .line 122
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ewn;->d(I)V

    .line 123
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Answer question score = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/ewn;->a(J)V

    .line 125
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-wide v0, v0, Lo/ewn;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 126
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lo/ewn;->c:J

    .line 128
    :cond_0
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-wide v0, v0, Lo/ewn;->c:J

    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v2

    iget-wide v2, v2, Lo/ewn;->b:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 129
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewn;->b(Z)V

    .line 130
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->p()Z

    move-result v5

    .line 131
    if-nez v5, :cond_2

    .line 132
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ewd;->c(IZ)Z

    move-result v6

    .line 133
    if-eqz v6, :cond_1

    .line 134
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lo/ewd;->f(I)[F

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ewd;->c([F)V

    goto :goto_0

    .line 136
    :cond_1
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewd;->c([F)V

    .line 139
    :cond_2
    :goto_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start so in question"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :cond_3
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->e(Z)V

    .line 142
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewn;->e(Z)V

    .line 143
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->n()Ljava/lang/String;

    move-result-object v5

    .line 144
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->p()Ljava/lang/String;

    move-result-object v6

    .line 145
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->o()Ljava/lang/String;

    move-result-object v7

    .line 146
    const-string v0, "wifi_device"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;Landroid/content/Intent;)Landroid/content/Intent;

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "wifi_device_calibrate_score"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "health_wifi_device_userId"

    invoke-virtual {v0, v1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "health_wifi_device_productId"

    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_1

    .line 162
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;Landroid/content/Intent;)Landroid/content/Intent;

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pressure_is_have_datas"

    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v2

    invoke-virtual {v2}, Lo/ewn;->d()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "press_auto_monitor"

    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v2

    invoke-virtual {v2}, Lo/ewn;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 169
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewl;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewl;->notifyDataSetChanged()V

    .line 170
    return-void
.end method
