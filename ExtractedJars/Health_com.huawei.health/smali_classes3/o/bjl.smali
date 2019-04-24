.class public final Lo/bjl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/support/v4/app/Fragment;JI)V
    .locals 7

    .line 124
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 125
    const-string v0, "is_share_msg"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->e()Ljava/util/ArrayList;

    move-result-object v4

    .line 129
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    .line 131
    iget-wide v0, v6, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->f:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    .line 133
    move-object v3, v6

    .line 134
    goto :goto_1

    .line 136
    :cond_0
    goto :goto_0

    .line 137
    :cond_1
    :goto_1
    if-eqz v3, :cond_2

    .line 139
    const-string v0, "TransmitListFragmentHelper"

    const-string v1, "start the exist chatActivity"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/bis;->c(Landroid/app/Activity;)V

    .line 141
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/bis;->d(Landroid/app/Activity;)V

    goto :goto_2

    .line 145
    :cond_2
    invoke-static {p0, p1, p2, p3, v2}, Lo/bjl;->c(Landroid/support/v4/app/Fragment;JILandroid/os/Bundle;)V

    .line 147
    :goto_2
    return-void
.end method

.method public static c(Landroid/support/v4/app/Fragment;JILandroid/os/Bundle;)V
    .locals 3

    .line 103
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 105
    const-string v0, "userId"

    invoke-virtual {p4, v0, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 106
    const-class v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, p4, v1, v2}, Lo/bjl;->e(Landroid/support/v4/app/Fragment;Ljava/lang/Class;Landroid/os/Bundle;ZI)V

    goto :goto_0

    .line 110
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {p4, v0, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 111
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, p4, v1, v2}, Lo/bjl;->e(Landroid/support/v4/app/Fragment;Ljava/lang/Class;Landroid/os/Bundle;ZI)V

    .line 113
    :goto_0
    return-void
.end method

.method public static d(Landroid/os/Bundle;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;
    .locals 6

    .line 33
    new-instance v2, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;-><init>()V

    .line 34
    const-string v0, "title"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkTitle(Ljava/lang/String;)V

    .line 35
    const-string v0, "description"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkBrief(Ljava/lang/String;)V

    .line 36
    const-string v0, "url"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkUrl(Ljava/lang/String;)V

    .line 37
    const-string v0, "appName"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkAppName(Ljava/lang/String;)V

    .line 40
    const-string v0, "linkIconData"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v3

    .line 41
    invoke-static {v3}, Lo/bae;->a([B)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->addBlobItem(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V

    .line 43
    const-string v0, "checkApp"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 44
    if-eqz v4, :cond_0

    .line 46
    const-string v0, "appId"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkAppID(Ljava/lang/String;)V

    .line 47
    const-string v0, "appPackage"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkAppPackage(Ljava/lang/String;)V

    .line 48
    const-string v0, "versionCode"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkReqVerCode(Ljava/lang/String;)V

    .line 51
    :cond_0
    const-string v0, "sns_sdk_package_name"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bnx;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 52
    const-string v0, "TransmitListFragmentHelper"

    const-string v1, "get SNSLinkMessage :appIcon:"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    invoke-static {v5}, Lo/bae;->b(Landroid/graphics/Bitmap;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->addBlobItem(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V

    .line 54
    return-object v2
.end method

.method public static e(Landroid/support/v4/app/Fragment;Ljava/lang/Class;Landroid/os/Bundle;ZI)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/support/v4/app/Fragment;Ljava/lang/Class<*>;Landroid/os/Bundle;ZI)V"
        }
    .end annotation

    .line 67
    if-nez p1, :cond_0

    .line 69
    return-void

    .line 72
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 73
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 75
    if-eqz p2, :cond_1

    .line 77
    invoke-virtual {v2, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 80
    :cond_1
    if-eqz p3, :cond_2

    .line 82
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v2, p4}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 88
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    goto :goto_0

    .line 90
    :catch_0
    move-exception v3

    .line 92
    const-string v0, "TransmitListFragmentHelper"

    const-string v1, "jumpToPage ActivityNotFoundException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    :goto_0
    return-void
.end method
