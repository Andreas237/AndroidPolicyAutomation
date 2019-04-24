.class Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V
    .locals 1

    .line 134
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 135
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->a:Ljava/lang/ref/WeakReference;

    .line 136
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 140
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    .line 142
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 143
    return-void

    .line 145
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 147
    :sswitch_0
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

    .line 148
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v4, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V

    .line 149
    goto/16 :goto_2

    .line 151
    :sswitch_1
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is already failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    return-void

    .line 155
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    move-result-object v0

    invoke-virtual {v0}, Lo/eof;->n()V

    .line 156
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V

    .line 158
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_UPGRADE_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    goto/16 :goto_2

    .line 162
    :sswitch_2
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

    .line 164
    iget v0, p1, Landroid/os/Message;->arg1:I

    sparse-switch v0, :sswitch_data_1

    goto/16 :goto_0

    .line 166
    :sswitch_3
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_band_upgrade_timeout:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/eof;->a()Lo/eof;

    move-result-object v2

    invoke-virtual {v2}, Lo/eof;->p()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 167
    goto/16 :goto_1

    .line 169
    :sswitch_4
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_file_not_exist:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 170
    goto/16 :goto_1

    .line 172
    :sswitch_5
    invoke-static {}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 173
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

    .line 175
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_low_battery:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/eof;->a()Lo/eof;

    move-result-object v2

    invoke-virtual {v2}, Lo/eof;->p()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 176
    goto :goto_1

    .line 178
    :sswitch_6
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_crc_check_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 179
    goto :goto_1

    .line 181
    :sswitch_7
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 182
    goto :goto_1

    .line 184
    :sswitch_8
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_wifi_ota_activation_prompt_msg:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 185
    goto :goto_1

    .line 187
    :goto_0
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_talk_band_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 190
    :goto_1
    invoke-static {v4, v5}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Ljava/lang/String;)V

    .line 191
    goto :goto_2

    .line 193
    :sswitch_9
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Ljava/lang/String;)V

    .line 194
    .line 199
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x5 -> :sswitch_1
        0x6 -> :sswitch_2
        0x3ef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x1 -> :sswitch_3
        0x4 -> :sswitch_5
        0x5 -> :sswitch_4
        0x3ea -> :sswitch_6
        0x19647 -> :sswitch_7
        0x19648 -> :sswitch_8
    .end sparse-switch
.end method
