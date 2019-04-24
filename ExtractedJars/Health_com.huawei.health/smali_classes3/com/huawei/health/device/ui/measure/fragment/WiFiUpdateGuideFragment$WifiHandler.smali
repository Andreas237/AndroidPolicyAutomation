.class Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "WifiHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 153
    return-void
.end method


# virtual methods
.method public handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;Landroid/os/Message;)V
    .locals 7

    .line 157
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    return-void

    .line 160
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 161
    const-string v0, "WiFiUpdateGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WifiHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 162
    return-void

    .line 164
    :cond_1
    const-string v0, "WiFiUpdateGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WifiHandler what: "

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

    .line 165
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 167
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egd;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 168
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 169
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;-><init>()V

    .line 170
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 171
    const-string v0, "productId"

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    const-string v0, "version"

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v0, "cer_version"

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const-string v0, "update_nodes"

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->setArguments(Landroid/os/Bundle;)V

    .line 176
    invoke-static {p1, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 177
    goto :goto_0

    .line 179
    :sswitch_1
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egd;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 180
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 182
    new-instance v6, Lo/egy$b;

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v6, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 183
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_ota_activation_prompt_msg:I

    invoke-virtual {v6, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 184
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_common_notification_know_tips:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)V

    invoke-virtual {v6, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 192
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$1102(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;Lo/egy;)Lo/egy;

    .line 193
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 194
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 195
    .line 199
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public bridge synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 149
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;Landroid/os/Message;)V

    return-void
.end method
