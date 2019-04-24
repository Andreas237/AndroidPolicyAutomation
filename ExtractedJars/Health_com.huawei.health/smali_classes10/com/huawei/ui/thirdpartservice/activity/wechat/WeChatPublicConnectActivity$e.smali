.class Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)V
    .locals 0

    .line 96
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 97
    return-void
.end method


# virtual methods
.method protected d(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;Landroid/os/Message;)V
    .locals 6

    .line 100
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 102
    :pswitch_0
    invoke-virtual {p1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    invoke-static {}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    invoke-static {}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    :cond_0
    const-string v0, "Main_WeChatPublicConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage MESSAGE_ID_GETQRCODETICKET get unvalid userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-static {p1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 107
    return-void

    .line 109
    :cond_1
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 110
    const-string v0, "Main_WeChatPublicConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid get:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e$4;

    invoke-direct {v1, p0, v4, p1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e$4;-><init>(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;Ljava/lang/String;Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)V

    invoke-virtual {v0, v1}, Lo/dgu;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 136
    goto :goto_0

    .line 138
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 139
    invoke-virtual {p1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_confirm_network_whether_connected:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 140
    goto :goto_0

    .line 142
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 143
    invoke-virtual {p1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_update_server_bussy:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 144
    goto :goto_0

    .line 146
    :pswitch_3
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 147
    invoke-static {p1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0, p1, v5}, Lo/fit;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 148
    .line 152
    :goto_0
    :pswitch_4
    return-void

    :pswitch_data_0
    .packed-switch 0xc9
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 94
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;->d(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;Landroid/os/Message;)V

    return-void
.end method
