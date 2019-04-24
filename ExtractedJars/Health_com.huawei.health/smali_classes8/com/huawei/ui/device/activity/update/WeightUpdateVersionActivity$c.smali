.class public Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V
    .locals 0

    .line 492
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 493
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Landroid/os/Message;)V
    .locals 3

    .line 497
    if-nez p1, :cond_0

    .line 498
    return-void

    .line 500
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 502
    :pswitch_0
    invoke-static {p1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Ljava/lang/String;)V

    .line 503
    goto :goto_0

    .line 505
    :pswitch_1
    goto :goto_0

    .line 507
    :pswitch_2
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 508
    invoke-static {p1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 509
    goto :goto_0

    .line 511
    :pswitch_3
    invoke-static {p1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    .line 512
    .line 517
    :goto_0
    return-void

    nop

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

    .line 489
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;->b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Landroid/os/Message;)V

    return-void
.end method
