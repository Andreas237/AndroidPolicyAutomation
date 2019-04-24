.class public Lo/bkq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/app/Activity;

.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lo/bkq;->b:Landroid/app/Activity;

    .line 60
    iput-object p2, p0, Lo/bkq;->c:Landroid/os/Handler;

    .line 61
    return-void
.end method

.method private static b(Lcom/huawei/health/sns/model/user/UserNotify;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/user/UserNotify;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 174
    new-instance v0, Lo/bkq$1;

    invoke-direct {v0, p0}, Lo/bkq$1;-><init>(Lcom/huawei/health/sns/model/user/UserNotify;)V

    return-object v0
.end method

.method static synthetic c(Lo/bkq;Lo/bfh;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/bkq;->d(Lo/bfh;)V

    return-void
.end method

.method static synthetic d(Lo/bkq;)Landroid/os/Handler;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/bkq;->c:Landroid/os/Handler;

    return-object v0
.end method

.method private d(Lo/bfh;)V
    .locals 4

    .line 156
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_0

    .line 158
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 159
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {v3}, Lo/bkq;->b(Lcom/huawei/health/sns/model/user/UserNotify;)Lo/brd;

    move-result-object v1

    new-instance v2, Lo/bkq$2;

    invoke-direct {v2, p0}, Lo/bkq$2;-><init>(Lo/bkq;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 170
    :cond_0
    return-void
.end method

.method private e(Landroid/app/Activity;Lo/bfl;)V
    .locals 6

    .line 192
    invoke-virtual {p2}, Lo/bfl;->d()Lo/bfh;

    move-result-object v3

    .line 194
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v4, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 195
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 196
    instance-of v0, v3, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-eqz v0, :cond_0

    .line 198
    const-string v0, "bundleKeyUserId"

    move-object v1, v3

    check-cast v1, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 200
    :cond_0
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x6

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 201
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->e:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 204
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 205
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 207
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 208
    invoke-virtual {p1, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 209
    return-void
.end method


# virtual methods
.method public a(Lo/bfl;)V
    .locals 4

    .line 121
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v2

    .line 122
    invoke-virtual {v2}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->d:Lo/bfp$c;

    if-ne v0, v1, :cond_1

    .line 124
    instance-of v0, v2, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_0

    .line 126
    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lo/bkq;->b:Landroid/app/Activity;

    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 127
    sget v0, Lcom/huawei/android/sns/R$array;->delete:I

    new-instance v1, Lo/bkq$3;

    invoke-direct {v1, p0, v2}, Lo/bkq$3;-><init>(Lo/bkq;Lo/bfh;)V

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setItems(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 133
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 134
    goto :goto_0

    .line 137
    :cond_0
    iget-object v0, p0, Lo/bkq;->b:Landroid/app/Activity;

    invoke-direct {p0, v0, p1}, Lo/bkq;->e(Landroid/app/Activity;Lo/bfl;)V

    goto :goto_0

    .line 140
    :cond_1
    invoke-virtual {v2}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->h:Lo/bfp$c;

    if-ne v0, v1, :cond_2

    .line 142
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/bkq;->b:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 143
    const-string v0, "keyOpenContactMatchFromWhere"

    const-string v1, "openContactMatchFromUserNotify"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    iget-object v0, p0, Lo/bkq;->b:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 147
    :cond_2
    :goto_0
    return-void
.end method

.method public b(Lo/bfl;)V
    .locals 8

    .line 71
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v3

    .line 72
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->d:Lo/bfp$c;

    if-ne v0, v1, :cond_2

    .line 74
    instance-of v0, v3, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_1

    .line 76
    move-object v4, v3

    check-cast v4, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 77
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/bkq;->b:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 78
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 79
    const-string v0, "bundleKeyUserId"

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 80
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 81
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 84
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/UserNotify;->isReaded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 86
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 87
    new-instance v7, Landroid/content/Intent;

    const-string v0, "com.huawei.health.sns.local_action_read_notify"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 88
    const-string v0, "readNotifyUserId"

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 89
    invoke-static {v7}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 93
    :cond_0
    invoke-static {v4}, Lcom/huawei/health/sns/server/user/Origin;->matchUserNotifyType(Lcom/huawei/health/sns/model/user/UserNotify;)[Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v7

    .line 94
    const-string v0, "sns_frd_origin"

    const/4 v1, 0x0

    aget-object v1, v7, v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 95
    const-string v0, "sns_my_origin"

    const/4 v1, 0x1

    aget-object v1, v7, v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 97
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 98
    iget-object v0, p0, Lo/bkq;->b:Landroid/app/Activity;

    invoke-virtual {v0, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 99
    goto :goto_0

    .line 102
    :cond_1
    iget-object v0, p0, Lo/bkq;->b:Landroid/app/Activity;

    invoke-direct {p0, v0, p1}, Lo/bkq;->e(Landroid/app/Activity;Lo/bfl;)V

    goto :goto_0

    .line 105
    :cond_2
    invoke-virtual {v3}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->h:Lo/bfp$c;

    if-ne v0, v1, :cond_3

    .line 107
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/bkq;->b:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 108
    const-string v0, "keyOpenContactMatchFromWhere"

    const-string v1, "openContactMatchFromUserNotify"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    iget-object v0, p0, Lo/bkq;->b:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 112
    :cond_3
    :goto_0
    return-void
.end method
