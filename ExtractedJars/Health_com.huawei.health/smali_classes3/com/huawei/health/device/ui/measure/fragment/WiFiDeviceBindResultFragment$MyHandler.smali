.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 0

    .line 154
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 155
    return-void
.end method


# virtual methods
.method public handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Landroid/os/Message;)V
    .locals 7

    .line 159
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBind MyHandler what:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 160
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 161
    iget v4, p2, Landroid/os/Message;->arg1:I

    .line 162
    invoke-static {p1, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$102(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;I)I

    .line 163
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBind MyHandler what:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",configMode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 166
    :pswitch_0
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg DEVICE_WORK_STATUS_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/akj;

    move-result-object v0

    invoke-virtual {v0}, Lo/akj;->d()V

    .line 168
    const/16 v0, 0xe

    invoke-static {p1, v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;II)V

    .line 169
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/ajd;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->startConfigNetWork(Ljava/lang/String;Ljava/lang/String;Lo/ajd;)V

    .line 170
    goto/16 :goto_0

    .line 173
    :pswitch_1
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->removeMessages(I)V

    .line 174
    iget v5, p2, Landroid/os/Message;->arg2:I

    .line 175
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MSG_DEVICE_WORK_STATUS_FAIL,errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 176
    const/4 v0, 0x5

    invoke-static {p1, v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;II)V

    .line 177
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/akg;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 178
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/akg;

    move-result-object v0

    invoke-virtual {v0}, Lo/akg;->e()V

    .line 179
    :cond_0
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/akj;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 180
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/akj;

    move-result-object v0

    invoke-virtual {v0}, Lo/akj;->d()V

    goto :goto_0

    .line 183
    :pswitch_2
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->removeMessages(I)V

    .line 184
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    .line 185
    const/4 v0, 0x6

    invoke-static {p1, v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;II)V

    .line 186
    goto :goto_0

    .line 188
    :pswitch_3
    iget v6, p2, Landroid/os/Message;->arg2:I

    .line 189
    const/16 v0, 0x8a4

    if-ne v6, v0, :cond_1

    .line 190
    const/4 v4, 0x3

    .line 192
    :cond_1
    const/4 v0, 0x7

    invoke-static {p1, v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;II)V

    .line 193
    goto :goto_0

    .line 195
    :pswitch_4
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/ahu;->e(Landroid/content/Context;)V

    .line 196
    goto :goto_0

    .line 199
    :pswitch_5
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v1, 0xd

    invoke-static {p1, v4, v1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;IILjava/lang/Object;)V

    .line 200
    goto :goto_0

    .line 202
    :pswitch_6
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    .line 203
    .line 208
    :cond_2
    :goto_0
    :pswitch_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public bridge synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 152
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Landroid/os/Message;)V

    return-void
.end method
