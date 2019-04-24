.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$i;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 366
    invoke-direct {p0, p1, p2}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 367
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Landroid/os/Message;)V
    .locals 4

    .line 371
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 373
    :sswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 374
    const-string v0, "getbinddevice from timmeout"

    const/4 v1, -0x1

    invoke-interface {v2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 375
    goto :goto_0

    .line 377
    :sswitch_1
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 378
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 379
    .line 383
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x65 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 364
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$i;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Landroid/os/Message;)V

    return-void
.end method
