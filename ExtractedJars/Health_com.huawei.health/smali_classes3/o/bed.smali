.class public Lo/bed;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected b:Lcom/huawei/health/sns/model/user/User;

.field private c:Landroid/os/Handler;

.field private d:Landroid/app/AlertDialog;

.field private e:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lo/bed;->e:Landroid/app/Activity;

    .line 68
    iput-object p2, p0, Lo/bed;->c:Landroid/os/Handler;

    .line 69
    return-void
.end method

.method static synthetic b(Lo/bed;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lo/bed;->c()V

    return-void
.end method

.method private c()V
    .locals 3

    .line 146
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bed$5;

    invoke-direct {v1, p0}, Lo/bed$5;-><init>(Lo/bed;)V

    new-instance v2, Lo/bed$3;

    invoke-direct {v2, p0}, Lo/bed$3;-><init>(Lo/bed;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 183
    return-void
.end method

.method static synthetic d(Lo/bed;)Landroid/os/Handler;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/bed;->c:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 135
    iget-object v0, p0, Lo/bed;->d:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bed;->d:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lo/bed;->d:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 139
    :cond_0
    return-void
.end method

.method public b(Lo/bfp$c;)V
    .locals 8

    .line 87
    sget-object v0, Lo/bfp$c;->x:Lo/bfp$c;

    if-ne p1, v0, :cond_0

    .line 89
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lo/bed;->e:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 90
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 91
    const-string v0, "user"

    iget-object v1, p0, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 92
    invoke-virtual {v6, v7}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 93
    iget-object v0, p0, Lo/bed;->e:Landroid/app/Activity;

    invoke-virtual {v0, v6}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 94
    goto/16 :goto_0

    .line 95
    :cond_0
    sget-object v0, Lo/bfp$c;->y:Lo/bfp$c;

    if-ne p1, v0, :cond_1

    .line 97
    iget-object v0, p0, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    iget-object v1, p0, Lo/bed;->e:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 98
    iget-object v0, p0, Lo/bed;->e:Landroid/app/Activity;

    const-string v1, ""

    iget-object v2, p0, Lo/bed;->e:Landroid/app/Activity;

    .line 99
    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_sure_delete_record:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_clear:I

    new-instance v5, Lo/bed$1;

    invoke-direct {v5, p0}, Lo/bed$1;-><init>(Lo/bed;)V

    .line 98
    invoke-static/range {v0 .. v5}, Lo/boj;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lo/bed;->d:Landroid/app/AlertDialog;

    .line 114
    goto :goto_0

    .line 115
    :cond_1
    sget-object v0, Lo/bfp$c;->j:Lo/bfp$c;

    if-ne p1, v0, :cond_3

    .line 117
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lo/bed;->e:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 118
    const-string v0, "complain_category_type"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 119
    const-string v0, "complain_id"

    iget-object v1, p0, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 120
    iget-object v0, p0, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v7

    .line 121
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 123
    iget-object v0, p0, Lo/bed;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 125
    :cond_2
    const-string v0, "complain_info"

    invoke-virtual {v6, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    iget-object v0, p0, Lo/bed;->e:Landroid/app/Activity;

    invoke-virtual {v0, v6}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 128
    :cond_3
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    .line 78
    return-void
.end method
