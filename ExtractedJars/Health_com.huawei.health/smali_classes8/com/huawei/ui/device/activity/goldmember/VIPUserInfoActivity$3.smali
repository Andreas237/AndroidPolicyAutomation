.class Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 185
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 187
    :pswitch_0
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_MEMBER_VALIDITY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    .line 190
    goto :goto_0

    .line 193
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->e(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    .line 194
    goto :goto_0

    .line 197
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    .line 198
    goto :goto_0

    .line 201
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    .line 202
    goto :goto_0

    .line 205
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V

    .line 206
    goto :goto_0

    .line 209
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$3;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_activation_no_get_my_user_infor_failure:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 210
    .line 214
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 215
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
