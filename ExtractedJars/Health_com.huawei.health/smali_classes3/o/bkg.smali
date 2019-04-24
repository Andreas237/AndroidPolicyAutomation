.class public Lo/bkg;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static d(Landroid/app/Activity;)V
    .locals 0

    .line 127
    return-void
.end method


# virtual methods
.method public b(Lo/bfl;Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 50
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 51
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v4

    .line 53
    invoke-virtual {v4}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->c:Lo/bfp$c;

    if-ne v0, v1, :cond_0

    .line 55
    invoke-static {v3}, Lo/bkg;->d(Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 58
    :cond_0
    invoke-virtual {v4}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->h:Lo/bfp$c;

    if-ne v0, v1, :cond_1

    .line 60
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;

    invoke-direct {v5, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 61
    const-string v0, "keyOpenContactMatchFromWhere"

    const-string v1, "openContactMatchFromAddFriend"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    invoke-virtual {v3, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 64
    goto/16 :goto_0

    .line 66
    :cond_1
    invoke-virtual {v4}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->d:Lo/bfp$c;

    if-ne v0, v1, :cond_2

    instance-of v0, v4, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-eqz v0, :cond_2

    .line 68
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v5, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 69
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 70
    const-string v0, "bundleKeyUserId"

    move-object v1, v4

    check-cast v1, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 71
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x6

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 72
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->e:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 75
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 76
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 78
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 79
    invoke-virtual {v3, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 80
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {v4}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->E:Lo/bfp$c;

    if-ne v0, v1, :cond_3

    .line 84
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/AssistantSearchActivity;

    invoke-direct {v5, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 85
    invoke-virtual {v3, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 87
    :cond_3
    :goto_0
    return-void
.end method
