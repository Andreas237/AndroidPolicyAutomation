.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 820
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 821
    return-void
.end method


# virtual methods
.method protected e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Landroid/os/Message;)V
    .locals 3

    .line 825
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 827
    :pswitch_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->F(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    .line 828
    goto :goto_0

    .line 832
    :pswitch_1
    goto :goto_0

    .line 834
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->H(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 835
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->E(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    .line 836
    iget v0, p2, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_0

    .line 837
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 838
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->I(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$d;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fjb;->b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 840
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_music_management_operation_failed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 841
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 843
    goto :goto_0

    .line 845
    :pswitch_3
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->G(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 846
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->M(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    goto :goto_0

    .line 848
    :cond_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->E(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    .line 850
    .line 854
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 818
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Landroid/os/Message;)V

    return-void
.end method
