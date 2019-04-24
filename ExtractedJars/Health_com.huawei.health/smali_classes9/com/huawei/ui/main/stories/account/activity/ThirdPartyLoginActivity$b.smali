.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V
    .locals 0

    .line 221
    invoke-direct {p0, p1, p2}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 222
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Landroid/os/Message;)V
    .locals 4

    .line 226
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 228
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/eul;->b(Landroid/app/Activity;)V

    .line 229
    goto/16 :goto_0

    .line 231
    :sswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/eul;->c(Landroid/app/Activity;)V

    .line 232
    goto/16 :goto_0

    .line 234
    :sswitch_2
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: MSG_SHOW_DATA_MIGRATE_DIALOG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/eui;

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V

    goto :goto_0

    .line 240
    :sswitch_3
    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/eul;->e(Landroid/app/Activity;)V

    .line 241
    goto :goto_0

    .line 243
    :sswitch_4
    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_other_account_migrate_failed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 244
    goto :goto_0

    .line 246
    :sswitch_5
    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/eul;->a(Landroid/app/Activity;)V

    .line 247
    goto :goto_0

    .line 249
    :sswitch_6
    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/eul;->d(Landroid/app/Activity;)V

    .line 250
    goto :goto_0

    .line 252
    :sswitch_7
    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_other_account_login_failed:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 253
    goto :goto_0

    .line 255
    :sswitch_8
    invoke-static {p1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/eul;->f(Landroid/app/Activity;)V

    .line 256
    .line 260
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0xb -> :sswitch_1
        0xc -> :sswitch_2
        0xe -> :sswitch_3
        0xf -> :sswitch_8
        0xfa9 -> :sswitch_5
        0xfab -> :sswitch_6
        0xfac -> :sswitch_7
        0x9c9b -> :sswitch_4
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 219
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$b;->a(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Landroid/os/Message;)V

    return-void
.end method
