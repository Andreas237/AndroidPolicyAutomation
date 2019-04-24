.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 1674
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 1675
    return-void
.end method


# virtual methods
.method protected d(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/os/Message;)V
    .locals 6

    .line 1680
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1682
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->t(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 1683
    goto/16 :goto_0

    .line 1685
    :sswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->q(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 1686
    goto/16 :goto_0

    .line 1688
    :sswitch_2
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->x(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1689
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->z(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 1691
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->z(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1693
    goto/16 :goto_0

    .line 1695
    :sswitch_3
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1697
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, ""

    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1698
    :cond_1
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage MESSAGE_ID_GETQRCODETICKET get unvalid userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1699
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->y(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 1700
    return-void

    .line 1702
    :cond_2
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1703
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MESSAGE_ID_GETQRCODETICKET userid is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1704
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e$4;

    invoke-direct {v1, p0, v4, p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;Ljava/lang/String;Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/dgu;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1729
    goto :goto_0

    .line 1731
    :sswitch_4
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->y(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 1732
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_confirm_network_whether_connected:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1733
    goto :goto_0

    .line 1735
    :sswitch_5
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->y(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 1736
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_update_server_bussy:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1737
    goto :goto_0

    .line 1739
    :sswitch_6
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1740
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->y(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/fit;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/fit;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 1741
    .line 1745
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x66 -> :sswitch_0
        0x67 -> :sswitch_2
        0x68 -> :sswitch_1
        0xc9 -> :sswitch_3
        0xca -> :sswitch_4
        0xcb -> :sswitch_5
        0xcd -> :sswitch_6
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 1672
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;->d(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/os/Message;)V

    return-void
.end method
