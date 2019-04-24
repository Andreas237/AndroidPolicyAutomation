.class public Lo/bkw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lo/bkx;

.field private e:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/bkx;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lo/bkw;->e:Landroid/content/Context;

    .line 59
    iput-object p2, p0, Lo/bkw;->b:Lo/bkx;

    .line 60
    return-void
.end method

.method private static a(Lcom/huawei/health/sns/model/user/UserNotify;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/user/UserNotify;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 241
    new-instance v0, Lo/bkw$4;

    invoke-direct {v0, p0}, Lo/bkw$4;-><init>(Lcom/huawei/health/sns/model/user/UserNotify;)V

    return-object v0
.end method

.method static synthetic a(Landroid/content/Context;J)V
    .locals 0

    .line 44
    invoke-static {p0, p1, p2}, Lo/bkw;->e(Landroid/content/Context;J)V

    return-void
.end method

.method private static b(Landroid/content/Context;J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 145
    new-instance v0, Lo/bkw$2;

    invoke-direct {v0, p1, p2, p0}, Lo/bkw$2;-><init>(JLandroid/content/Context;)V

    return-object v0
.end method

.method private c(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 2

    .line 195
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bkw$3;

    invoke-direct {v1, p0, p1}, Lo/bkw$3;-><init>(Lo/bkw;Lcom/huawei/health/sns/model/user/UserNotify;)V

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 227
    return-void
.end method

.method static synthetic e(Lo/bkw;)Landroid/content/Context;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/bkw;->e:Landroid/content/Context;

    return-object v0
.end method

.method private static e(Landroid/content/Context;J)V
    .locals 4

    .line 129
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 130
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 131
    const-string v0, "bundleKeyUserId"

    invoke-virtual {v3, v0, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 132
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 133
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->d:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 134
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 135
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    goto :goto_0

    .line 137
    :catch_0
    move-exception v2

    .line 139
    const-string v0, "UserNotifyEvent"

    const-string v1, "toDetailPage startActivity meet a exception."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    :goto_0
    return-void
.end method


# virtual methods
.method a(Landroid/view/View;Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 2

    .line 81
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    sget v1, Lcom/huawei/android/sns/R$color;->sns_new_friend_background_color_emui5:I

    goto :goto_0

    .line 87
    :cond_0
    sget v1, Lcom/huawei/android/sns/R$color;->sns_new_friend_background_color:I

    .line 90
    :goto_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->isReaded()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    move v1, v0

    .line 91
    if-eqz p1, :cond_2

    .line 93
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 95
    :cond_2
    return-void
.end method

.method b(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 2

    .line 236
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/bkw;->a(Lcom/huawei/health/sns/model/user/UserNotify;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 237
    return-void
.end method

.method c(IJLcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 1

    .line 176
    if-eqz p1, :cond_0

    const/4 v0, 0x5

    if-ne p1, v0, :cond_1

    .line 179
    :cond_0
    invoke-virtual {p0, p2, p3}, Lo/bkw;->d(J)V

    .line 180
    invoke-direct {p0, p4}, Lo/bkw;->c(Lcom/huawei/health/sns/model/user/UserNotify;)V

    goto :goto_0

    .line 183
    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 186
    invoke-virtual {p0, p4}, Lo/bkw;->b(Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 188
    :cond_2
    :goto_0
    return-void
.end method

.method d(J)V
    .locals 2

    .line 116
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/bkw;->e:Landroid/content/Context;

    invoke-static {v1, p1, p2}, Lo/bkw;->b(Landroid/content/Context;J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 117
    return-void
.end method

.method d(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 3

    .line 104
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->b:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 106
    iget-object v0, p0, Lo/bkw;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/bkw;->b:Lo/bkx;

    const-string v2, ""

    invoke-static {v0, p1, v1, v2}, Lo/awx;->e(Landroid/content/Context;Lo/bfh;Lo/awx$c;Ljava/lang/String;)V

    .line 107
    return-void
.end method

.method e(Lcom/huawei/health/sns/model/user/UserNotify;Landroid/widget/ImageView;)V
    .locals 6

    .line 69
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    move-object v2, p2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 70
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUrlDownload()Ljava/lang/String;

    move-result-object v5

    .line 69
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    return-void
.end method
