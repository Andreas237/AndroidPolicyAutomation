.class public Lo/bkl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Landroid/app/Activity;Lo/axd;Lcom/huawei/health/sns/model/user/User;)Lo/boj$e;
    .locals 1

    .line 131
    new-instance v0, Lo/bkl$5;

    invoke-direct {v0, p1, p0, p2}, Lo/bkl$5;-><init>(Lo/axd;Landroid/app/Activity;Lcom/huawei/health/sns/model/user/User;)V

    return-object v0
.end method


# virtual methods
.method public d(Lo/bfl;Landroid/app/Activity;)V
    .locals 6

    .line 40
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->b:Lo/bfp$c;

    if-ne v0, v1, :cond_0

    .line 43
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 44
    invoke-virtual {p2, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 45
    goto/16 :goto_0

    .line 46
    :cond_0
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->e:Lo/bfp$c;

    if-ne v0, v1, :cond_1

    .line 48
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 49
    invoke-virtual {p2, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 50
    goto/16 :goto_0

    .line 51
    :cond_1
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->f:Lo/bfp$c;

    if-ne v0, v1, :cond_2

    .line 53
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/GroupListActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 54
    invoke-virtual {p2, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 55
    goto/16 :goto_0

    .line 56
    :cond_2
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->p:Lo/bfp$c;

    if-ne v0, v1, :cond_3

    .line 58
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/GroupListActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 59
    const-string v0, "bundleKeyIsGrpChat"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 60
    invoke-virtual {p2, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->d:Lo/bfp$c;

    if-ne v0, v1, :cond_4

    instance-of v0, v3, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_4

    .line 64
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 65
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 66
    const-string v0, "bundleKeyUserId"

    move-object v1, v3

    check-cast v1, Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 67
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 68
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->d:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 69
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 70
    invoke-virtual {p2, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->C:Lo/bfp$c;

    if-ne v0, v1, :cond_5

    .line 74
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 75
    invoke-virtual {p2, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 77
    :cond_5
    :goto_0
    return-void
.end method

.method public d(Lo/bfl;Landroid/app/Activity;Lo/axd;)V
    .locals 6

    .line 88
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v3

    .line 89
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->b:Lo/bfp$c;

    if-ne v0, v1, :cond_0

    .line 91
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    invoke-virtual {p2, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 93
    goto :goto_1

    .line 94
    :cond_0
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->e:Lo/bfp$c;

    if-ne v0, v1, :cond_1

    .line 96
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserNotifyActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 97
    invoke-virtual {p2, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->d:Lo/bfp$c;

    if-ne v0, v1, :cond_4

    instance-of v0, v3, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_4

    .line 101
    move-object v4, v3

    check-cast v4, Lcom/huawei/health/sns/model/user/User;

    .line 103
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v5

    .line 104
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 108
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 112
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v5

    .line 115
    :cond_3
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_set_remark_name:I

    invoke-virtual {p2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 116
    invoke-static {p2, p3, v4}, Lo/bkl;->b(Landroid/app/Activity;Lo/axd;Lcom/huawei/health/sns/model/user/User;)Lo/boj$e;

    move-result-object v1

    .line 115
    const/4 v2, 0x1

    invoke-static {p2, v0, v5, v1, v2}, Lo/boj;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;

    .line 118
    :cond_4
    :goto_1
    return-void
.end method
