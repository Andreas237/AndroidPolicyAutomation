.class Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 1110
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 1113
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver(): intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1114
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 1115
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1117
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    .line 1118
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1119
    return-void

    .line 1123
    :cond_0
    instance-of v0, v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    if-nez v0, :cond_1

    .line 1124
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "! parcelableExtra instanceof DeviceInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1125
    return-void

    .line 1128
    :cond_1
    move-object v5, v4

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1132
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v6

    .line 1133
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver(): state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",deviceInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1134
    packed-switch v6, :pswitch_data_0

    goto :goto_0

    .line 1136
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Z)Z

    .line 1137
    goto :goto_0

    .line 1139
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->l(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 1140
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Ljava/lang/String;)V

    .line 1141
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Z)Z

    .line 1142
    goto :goto_0

    .line 1144
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->l(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 1145
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_switch_device_connect_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Ljava/lang/String;)V

    .line 1146
    .line 1152
    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
