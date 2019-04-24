.class Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 150
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 151
    return-void
.end method


# virtual methods
.method public handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Landroid/os/Message;)V
    .locals 4

    .line 155
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    return-void

    .line 158
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 159
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 160
    return-void

    .line 162
    :cond_1
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler what:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p2, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 165
    :pswitch_0
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    .line 166
    goto :goto_1

    .line 168
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    .line 169
    goto :goto_1

    .line 171
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->k(Landroid/content/Context;)Z

    .line 172
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_2

    .line 173
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    move-result-object v0

    const/16 v1, 0x3ea

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    .line 177
    :pswitch_3
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    .line 178
    goto :goto_1

    .line 180
    :pswitch_4
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 181
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 182
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_confirm_prompt_msg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    .line 184
    goto :goto_1

    .line 186
    :pswitch_5
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    .line 187
    goto :goto_1

    .line 189
    :goto_0
    const-string v0, "MyHandler what is other"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :cond_2
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_3
    .end packed-switch
.end method

.method public bridge synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 147
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Landroid/os/Message;)V

    return-void
.end method
