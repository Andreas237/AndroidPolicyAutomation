.class public Lo/bep;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e(Landroid/os/Bundle;I)V
    .locals 3

    .line 77
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 79
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 80
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    .line 82
    :cond_0
    if-nez p2, :cond_1

    .line 84
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 85
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 87
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public d(Landroid/app/Activity;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 6

    .line 33
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v3, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 34
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 35
    const-string v0, "bundleKeyUserId"

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 36
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 38
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 39
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 41
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 42
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 47
    const-string v0, "bundleKeyIsNeedGobackToHomeActivity"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 50
    :cond_1
    :goto_0
    instance-of v0, p1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    if-eqz v0, :cond_2

    .line 52
    move-object v5, p1

    check-cast v5, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    .line 54
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e()I

    move-result v0

    invoke-direct {p0, v4, v0}, Lo/bep;->e(Landroid/os/Bundle;I)V

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    instance-of v0, p1, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    if-eqz v0, :cond_3

    .line 58
    move-object v5, p1

    check-cast v5, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    .line 59
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 62
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->b()I

    move-result v0

    invoke-direct {p0, v4, v0}, Lo/bep;->e(Landroid/os/Bundle;I)V

    .line 65
    :cond_3
    :goto_1
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 66
    invoke-virtual {p1, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 67
    return-void
.end method
