.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$a;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 0

    .line 653
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 654
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Landroid/os/Message;)V
    .locals 2

    .line 658
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 661
    :pswitch_0
    iget v0, p2, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_1

    .line 662
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 663
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->setResult(I)V

    .line 664
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->finish()V

    goto :goto_0

    .line 668
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->j(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 669
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    goto :goto_0

    .line 671
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->D(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    .line 673
    goto :goto_0

    .line 675
    :pswitch_2
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;D)V

    .line 676
    .line 680
    :cond_1
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 651
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$a;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Landroid/os/Message;)V

    return-void
.end method
