.class public Lo/blj;
.super Lo/blk;
.source "SourceFile"


# instance fields
.field private f:Lo/egd;

.field private h:Lo/blu;

.field private k:Lo/egd;

.field private l:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;Ljava/lang/String;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3, p4}, Lo/blk;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;Ljava/lang/String;)V

    .line 59
    invoke-direct {p0, p1}, Lo/blj;->e(Landroid/app/Activity;)V

    .line 60
    return-void
.end method

.method private e(Landroid/app/Activity;)V
    .locals 1

    .line 64
    iput-object p1, p0, Lo/blj;->l:Landroid/app/Activity;

    .line 67
    sget v0, Lcom/huawei/android/sns/R$id;->friend_button:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/blj;->k:Lo/egd;

    .line 68
    iget-object v0, p0, Lo/blj;->k:Lo/egd;

    invoke-static {p1, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 69
    iget-object v0, p0, Lo/blj;->k:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    sget v0, Lcom/huawei/android/sns/R$id;->complain_button:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/blj;->f:Lo/egd;

    .line 72
    iget-object v0, p0, Lo/blj;->f:Lo/egd;

    invoke-static {p1, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 73
    iget-object v0, p0, Lo/blj;->f:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    return-void
.end method

.method private g()V
    .locals 5

    .line 147
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/blj;->l:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 148
    const-string v0, "complain_category_type"

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 149
    const-string v0, "complain_id"

    iget-object v1, p0, Lo/blj;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 150
    iget-object v0, p0, Lo/blj;->c:Lcom/huawei/health/sns/model/user/User;

    iget-object v1, p0, Lo/blj;->l:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 151
    const-string v0, "complain_info"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 152
    iget-object v0, p0, Lo/blj;->l:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 153
    return-void
.end method

.method private i()V
    .locals 2

    .line 136
    iget-object v0, p0, Lo/blj;->f:Lo/egd;

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lo/blj;->f:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 140
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 27
    invoke-super {p0}, Lo/blk;->a()V

    return-void
.end method

.method public bridge synthetic a(I)V
    .locals 0

    .line 27
    invoke-super {p0, p1}, Lo/blk;->a(I)V

    return-void
.end method

.method public bridge synthetic a(JI)V
    .locals 0

    .line 27
    invoke-super {p0, p1, p2, p3}, Lo/blk;->a(JI)V

    return-void
.end method

.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 2

    .line 80
    invoke-super {p0, p1}, Lo/blk;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 81
    iget-object v0, p0, Lo/blj;->k:Lo/egd;

    if-eqz v0, :cond_4

    .line 83
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/blj;->h:Lo/blu;

    sget-object v1, Lo/blu;->e:Lo/blu;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lo/blj;->h:Lo/blu;

    sget-object v1, Lo/blu;->d:Lo/blu;

    if-ne v0, v1, :cond_1

    .line 85
    :cond_0
    iget-object v0, p0, Lo/blj;->k:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_0

    .line 90
    :cond_1
    iget-object v0, p0, Lo/blj;->h:Lo/blu;

    sget-object v1, Lo/blu;->c:Lo/blu;

    if-ne v0, v1, :cond_2

    .line 92
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend:I

    invoke-virtual {p0, v0}, Lo/blj;->d(I)V

    goto :goto_0

    .line 94
    :cond_2
    iget-object v0, p0, Lo/blj;->h:Lo/blu;

    sget-object v1, Lo/blu;->b:Lo/blu;

    if-ne v0, v1, :cond_3

    .line 96
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_pass:I

    invoke-virtual {p0, v0}, Lo/blj;->d(I)V

    .line 97
    invoke-direct {p0}, Lo/blj;->i()V

    goto :goto_0

    .line 99
    :cond_3
    iget-object v0, p0, Lo/blj;->h:Lo/blu;

    sget-object v1, Lo/blu;->a:Lo/blu;

    if-ne v0, v1, :cond_4

    .line 101
    sget v0, Lcom/huawei/android/sns/R$string;->sns_btn_invite_to_join:I

    invoke-virtual {p0, v0}, Lo/blj;->d(I)V

    .line 105
    :cond_4
    :goto_0
    return-void
.end method

.method public bridge synthetic a(Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-super {p0, p1, p2}, Lo/blk;->a(Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic b(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;
    .locals 1

    .line 27
    invoke-super {p0, p1, p2}, Lo/blk;->b(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()V
    .locals 0

    .line 27
    invoke-super {p0}, Lo/blk;->b()V

    return-void
.end method

.method public bridge synthetic b(Lo/aws;)V
    .locals 0

    .line 27
    invoke-super {p0, p1}, Lo/blk;->b(Lo/aws;)V

    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    .line 27
    invoke-super {p0}, Lo/blk;->c()V

    return-void
.end method

.method public bridge synthetic c(I)V
    .locals 0

    .line 27
    invoke-super {p0, p1}, Lo/blk;->c(I)V

    return-void
.end method

.method public bridge synthetic c(ILjava/lang/String;)V
    .locals 0

    .line 27
    invoke-super {p0, p1, p2}, Lo/blk;->c(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;
    .locals 1

    .line 27
    invoke-super {p0, p1, p2}, Lo/blk;->d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;

    move-result-object v0

    return-object v0
.end method

.method public d(I)V
    .locals 2

    .line 124
    iget-object v0, p0, Lo/blj;->k:Lo/egd;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lo/blj;->k:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 127
    iget-object v0, p0, Lo/blj;->k:Lo/egd;

    invoke-virtual {v0, p1}, Lo/egd;->setText(I)V

    .line 129
    :cond_0
    return-void
.end method

.method public d(Lo/blu;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/blj;->h:Lo/blu;

    .line 115
    return-void
.end method

.method public bridge synthetic e()V
    .locals 0

    .line 27
    invoke-super {p0}, Lo/blk;->e()V

    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 27
    invoke-super {p0, p1}, Lo/blk;->e(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/server/user/AddFriendRequest;ILjava/lang/String;)V
    .locals 0

    .line 27
    invoke-super {p0, p1, p2, p3}, Lo/blk;->e(Lcom/huawei/health/sns/server/user/AddFriendRequest;ILjava/lang/String;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 159
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->complain_button:I

    if-ne v0, v1, :cond_0

    .line 161
    invoke-direct {p0}, Lo/blj;->g()V

    .line 162
    return-void

    .line 166
    :cond_0
    iget-object v0, p0, Lo/blj;->h:Lo/blu;

    sget-object v1, Lo/blu;->c:Lo/blu;

    if-ne v0, v1, :cond_1

    .line 168
    invoke-virtual {p0}, Lo/blj;->d()V

    goto :goto_0

    .line 170
    :cond_1
    iget-object v0, p0, Lo/blj;->h:Lo/blu;

    sget-object v1, Lo/blu;->b:Lo/blu;

    if-ne v0, v1, :cond_2

    .line 173
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->b:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 174
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/blj;->c(ILjava/lang/String;)V

    goto :goto_0

    .line 176
    :cond_2
    iget-object v0, p0, Lo/blj;->h:Lo/blu;

    sget-object v1, Lo/blu;->a:Lo/blu;

    if-ne v0, v1, :cond_3

    .line 178
    iget-object v0, p0, Lo/blj;->a:Lo/bly;

    if-eqz v0, :cond_3

    .line 180
    iget-object v0, p0, Lo/blj;->a:Lo/bly;

    invoke-interface {v0}, Lo/bly;->b()V

    .line 183
    :cond_3
    :goto_0
    return-void
.end method
