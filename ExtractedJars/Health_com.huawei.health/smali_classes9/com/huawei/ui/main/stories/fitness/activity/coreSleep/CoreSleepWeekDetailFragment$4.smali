.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 214
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 215
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 217
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    .line 218
    goto/16 :goto_0

    .line 220
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Lo/exp;

    move-result-object v0

    invoke-virtual {v0}, Lo/exp;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Science sleep exits"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    goto/16 :goto_0

    .line 226
    :cond_0
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Normal sleep exits"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->g(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    .line 231
    goto/16 :goto_0

    .line 233
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->i(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 235
    goto/16 :goto_0

    .line 237
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

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

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    goto :goto_0

    .line 240
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)I

    move-result v1

    int-to-long v1, v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;JJ)V

    .line 241
    goto :goto_0

    .line 243
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 244
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 248
    :cond_1
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivity() is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    .line 255
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
