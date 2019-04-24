.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 213
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 214
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 216
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)V

    .line 217
    goto/16 :goto_0

    .line 219
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    const-string v0, "UIHLH_CoreSleepMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Science sleep exits"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)V

    goto/16 :goto_0

    .line 225
    :cond_0
    const-string v0, "UIHLH_CoreSleepMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Normal sleep exits"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->h(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)V

    .line 230
    goto/16 :goto_0

    .line 232
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->g(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->i(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 234
    goto/16 :goto_0

    .line 236
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 237
    goto :goto_0

    .line 239
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)I

    move-result v1

    int-to-long v1, v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->f(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;JJ)V

    .line 240
    goto :goto_0

    .line 242
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 243
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 247
    :cond_1
    const-string v0, "UIHLH_CoreSleepMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivity() is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    .line 254
    :cond_2
    :goto_0
    :pswitch_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1771
        :pswitch_0
        :pswitch_1
        :pswitch_6
        :pswitch_6
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
