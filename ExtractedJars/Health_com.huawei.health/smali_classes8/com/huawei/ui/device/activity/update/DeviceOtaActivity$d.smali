.class Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V
    .locals 1

    .line 206
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 207
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->b:Ljava/lang/ref/WeakReference;

    .line 208
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 212
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    .line 214
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 215
    return-void

    .line 217
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 219
    :pswitch_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MSG_UPGRADE_PROGRESS msg.arg1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v4, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;I)V

    .line 221
    goto/16 :goto_2

    .line 223
    :pswitch_1
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 224
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is already failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    return-void

    .line 227
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V

    .line 228
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_UPGRADE_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    goto/16 :goto_2

    .line 231
    :pswitch_2
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MSG_UPGRADE_FAILED msg.arg1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    iget v0, p1, Landroid/os/Message;->arg1:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 235
    :sswitch_0
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 236
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_band_upgrade_timeout:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_scan_device:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_1

    .line 238
    :cond_2
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_band_upgrade_timeout:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 240
    goto/16 :goto_1

    .line 242
    :sswitch_1
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_file_not_exist:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 243
    goto/16 :goto_1

    .line 246
    :sswitch_2
    invoke-static {}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 247
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "battery : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 249
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_low_battery:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_scan_device:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 251
    :cond_3
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_low_battery:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 253
    goto :goto_1

    .line 255
    :sswitch_3
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_crc_check_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 256
    goto :goto_1

    .line 258
    :sswitch_4
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 259
    goto :goto_1

    .line 261
    :goto_0
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_talk_band_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 264
    :goto_1
    invoke-static {v4, v5}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;Ljava/lang/String;)V

    .line 265
    .line 270
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x3ea -> :sswitch_3
        0x19642 -> :sswitch_2
        0x19643 -> :sswitch_1
        0x19647 -> :sswitch_4
        0x1a9ca -> :sswitch_2
    .end sparse-switch
.end method
