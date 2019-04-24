.class public Lo/bgm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/bfl;Landroid/app/Activity;)V
    .locals 7

    .line 31
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 33
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v3

    .line 34
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v4

    .line 35
    sget-object v0, Lo/bfp$c;->m:Lo/bfp$c;

    if-ne v4, v0, :cond_0

    instance-of v0, v3, Lcom/huawei/health/sns/model/group/GroupNotify;

    if-eqz v0, :cond_0

    .line 37
    move-object v5, v3

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 38
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 39
    const-string v0, "groupNotify"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 40
    const-class v0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;

    invoke-virtual {v6, p2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 41
    invoke-virtual {p2, v6}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object v0, Lo/bfp$c;->o:Lo/bfp$c;

    if-ne v4, v0, :cond_2

    instance-of v0, v3, Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_2

    .line 45
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 46
    move-object v6, v3

    check-cast v6, Lcom/huawei/health/sns/model/group/Group;

    .line 47
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 49
    const-class v0, Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-virtual {v5, p2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 50
    const-string v0, "groupId"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 51
    invoke-virtual {p2, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 55
    :cond_1
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v5, p2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 56
    const-string v0, "groupId"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 57
    invoke-virtual {p2, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 61
    :cond_2
    :goto_0
    return-void
.end method
