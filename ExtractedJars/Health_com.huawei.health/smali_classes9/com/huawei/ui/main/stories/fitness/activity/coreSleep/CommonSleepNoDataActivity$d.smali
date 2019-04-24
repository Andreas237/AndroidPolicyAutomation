.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)V
    .locals 0

    .line 301
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 302
    return-void
.end method


# virtual methods
.method protected e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;Landroid/os/Message;)V
    .locals 9

    .line 305
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 307
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_btn_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 308
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$d$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$d$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$d;Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)V

    .line 321
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)Landroid/widget/RelativeLayout;

    move-result-object v2

    move-object v3, v8

    const-string v4, "core_sleep_btn_tips_do_not_remind_again"

    const-string v5, "core_sleep_btn_tips_intervals"

    const-string v6, "core_sleep_btn_tips_cnt"

    const-string v7, "core_sleep_btn_tips_if_show"

    .line 308
    invoke-static/range {v0 .. v7}, Lo/egp;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 326
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 299
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$d;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;Landroid/os/Message;)V

    return-void
.end method
