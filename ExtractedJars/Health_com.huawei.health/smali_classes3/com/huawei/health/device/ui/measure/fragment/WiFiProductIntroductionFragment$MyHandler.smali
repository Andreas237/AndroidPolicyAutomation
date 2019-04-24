.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 148
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 149
    return-void
.end method


# virtual methods
.method public handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Landroid/os/Message;)V
    .locals 7

    .line 153
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    return-void

    .line 156
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 157
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 158
    return-void

    .line 160
    :cond_1
    const-string v0, "WiFiProductIntroductionFragment"

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

    .line 161
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 163
    :pswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 164
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v5

    .line 165
    if-eqz v5, :cond_2

    .line 166
    invoke-static {p1, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Lo/afj;)V

    .line 168
    :cond_2
    goto/16 :goto_1

    .line 171
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z

    move-result v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z

    move-result v1

    if-eq v0, v1, :cond_4

    .line 172
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z

    move-result v0

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$202(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Z)Z

    .line 173
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    goto/16 :goto_1

    .line 177
    :pswitch_2
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$502(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Z)Z

    .line 178
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    .line 179
    goto/16 :goto_1

    .line 181
    :pswitch_3
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {v0}, Lo/ahw;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 182
    if-lez v5, :cond_3

    .line 183
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 184
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 185
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->wifi_device_menu_text_right_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 186
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$plurals;->IDS_wifi_device_claim_data_num_text:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 187
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    goto :goto_1

    .line 189
    :cond_3
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 190
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 191
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->wifi_device_menu_text_left_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 194
    goto :goto_1

    .line 196
    :pswitch_4
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_update_server_bussy:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 197
    goto :goto_1

    .line 199
    :goto_0
    const-string v0, "MyHandler what is other"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :cond_4
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public bridge synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 145
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Landroid/os/Message;)V

    return-void
.end method
