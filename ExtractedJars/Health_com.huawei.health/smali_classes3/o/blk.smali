.class abstract Lo/blk;
.super Lo/blh;
.source "SourceFile"

# interfaces
.implements Lo/awm$d;
.implements Lo/awx$c;
.implements Lo/awm$c;
.implements Lo/awx$a;


# instance fields
.field private f:Lo/blf;

.field private h:Lo/axd;

.field private k:I

.field private m:Ljava/lang/String;

.field private n:Lo/aws;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;Ljava/lang/String;)V
    .locals 1

    .line 81
    invoke-direct {p0, p1, p2, p3}, Lo/blh;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    .line 53
    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v0

    iput v0, p0, Lo/blk;->k:I

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blk;->f:Lo/blf;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/blk;->m:Ljava/lang/String;

    .line 82
    new-instance v0, Lo/blf;

    invoke-direct {v0}, Lo/blf;-><init>()V

    iput-object v0, p0, Lo/blk;->f:Lo/blf;

    .line 83
    iput-object p4, p0, Lo/blk;->m:Ljava/lang/String;

    .line 84
    return-void
.end method

.method static synthetic a(Lo/blk;)Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/blk;->m:Ljava/lang/String;

    return-object v0
.end method

.method private b(I)V
    .locals 3

    .line 183
    const/16 v0, 0x402

    if-eq p1, v0, :cond_0

    .line 185
    invoke-virtual {p0}, Lo/blk;->c()V

    .line 187
    :cond_0
    if-nez p1, :cond_1

    .line 189
    iget-object v0, p0, Lo/blk;->a:Lo/bly;

    if-eqz v0, :cond_2

    .line 191
    iget-object v0, p0, Lo/blk;->a:Lo/bly;

    invoke-interface {v0}, Lo/bly;->a()V

    .line 192
    iget-object v0, p0, Lo/blk;->f:Lo/blf;

    iget-object v1, p0, Lo/blk;->e:Landroid/app/Activity;

    iget-object v2, p0, Lo/blk;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1, v2}, Lo/blf;->d(Landroid/app/Activity;Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_0

    .line 197
    :cond_1
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 200
    :pswitch_0
    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_more_req:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 201
    goto :goto_0

    .line 203
    :pswitch_1
    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_self_friend_over:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 204
    goto :goto_0

    .line 206
    :pswitch_2
    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_other_friend_over:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 207
    goto :goto_0

    .line 209
    :pswitch_3
    iget-object v0, p0, Lo/blk;->a:Lo/bly;

    if-eqz v0, :cond_2

    .line 211
    iget-object v0, p0, Lo/blk;->a:Lo/bly;

    invoke-interface {v0}, Lo/bly;->a()V

    .line 218
    :cond_2
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic c(Lo/blk;)Lo/aws;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/blk;->n:Lo/aws;

    return-object v0
.end method

.method private c(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 277
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 279
    invoke-direct {p0}, Lo/blk;->k()Lo/axd;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/axd;->c(Ljava/lang/String;JLjava/lang/String;)V

    .line 281
    :cond_0
    return-void
.end method

.method private f()V
    .locals 7

    .line 302
    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 304
    :cond_0
    return-void

    .line 307
    :cond_1
    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_expire_dialog_content:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 309
    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    move-object v2, v6

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_btn_add:I

    new-instance v5, Lo/blk$1;

    invoke-direct {v5, p0}, Lo/blk$1;-><init>(Lo/blk;)V

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lo/blk;->i:Landroid/app/AlertDialog;

    .line 323
    return-void
.end method

.method private h()V
    .locals 3

    .line 111
    iget-object v0, p0, Lo/blk;->c:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 113
    new-instance v2, Lo/blk$2;

    invoke-direct {v2, p0}, Lo/blk$2;-><init>(Lo/blk;)V

    .line 128
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 130
    :cond_0
    return-void
.end method

.method private k()Lo/axd;
    .locals 2

    .line 290
    iget-object v0, p0, Lo/blk;->h:Lo/axd;

    if-nez v0, :cond_0

    .line 292
    new-instance v0, Lo/axd;

    iget-object v1, p0, Lo/blk;->b:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/axd;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lo/blk;->h:Lo/axd;

    .line 294
    :cond_0
    iget-object v0, p0, Lo/blk;->h:Lo/axd;

    return-object v0
.end method


# virtual methods
.method public a(JI)V
    .locals 0

    .line 165
    invoke-direct {p0, p3}, Lo/blk;->b(I)V

    .line 166
    return-void
.end method

.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lo/blk;->c:Lcom/huawei/health/sns/model/user/User;

    .line 172
    return-void
.end method

.method public a(Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Ljava/lang/String;)V
    .locals 3

    .line 242
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->getReply_()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 244
    iget-object v0, p0, Lo/blk;->a:Lo/bly;

    if-eqz v0, :cond_1

    .line 246
    iget-object v0, p0, Lo/blk;->a:Lo/bly;

    invoke-interface {v0}, Lo/bly;->a()V

    .line 247
    new-instance v0, Lo/awz;

    invoke-direct {v0}, Lo/awz;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->getFrdUID_()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/awz;->e(J)V

    goto :goto_0

    .line 250
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->getReply_()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 252
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->getAnsNote_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->getFrdUID_()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2, p2}, Lo/blk;->c(Ljava/lang/String;JLjava/lang/String;)V

    .line 254
    :cond_1
    :goto_0
    return-void
.end method

.method public b(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;
    .locals 6

    .line 223
    new-instance v3, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/user/UserNotifyNote;-><init>()V

    .line 224
    instance-of v0, p1, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    if-eqz v0, :cond_0

    .line 226
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    .line 228
    :cond_0
    new-instance v4, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;-><init>()V

    .line 230
    const/4 v5, 0x0

    .line 231
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 233
    move-object v5, p2

    .line 235
    :cond_1
    iget-object v0, p0, Lo/blk;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getType()I

    move-result v2

    invoke-virtual {v4, v0, v1, v2, v5}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->setData(JILjava/lang/String;)V

    .line 236
    return-object v4
.end method

.method public b()V
    .locals 0

    .line 260
    invoke-direct {p0}, Lo/blk;->f()V

    .line 261
    return-void
.end method

.method public b(Lo/aws;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lo/blk;->n:Lo/aws;

    .line 328
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 93
    iput p1, p0, Lo/blk;->k:I

    .line 94
    return-void
.end method

.method public c(ILjava/lang/String;)V
    .locals 2

    .line 101
    new-instance v1, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    invoke-direct {v1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;-><init>()V

    .line 102
    invoke-virtual {v1, p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setType(I)V

    .line 103
    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    invoke-static {v0, v1, p0, p0, p2}, Lo/awx;->d(Landroid/content/Context;Lo/bfh;Lo/awx$c;Lo/awx$a;Ljava/lang/String;)V

    .line 104
    return-void
.end method

.method public d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;
    .locals 5

    .line 150
    new-instance v0, Lo/bld;

    invoke-direct {v0}, Lo/bld;-><init>()V

    iget-object v1, p0, Lo/blk;->c:Lcom/huawei/health/sns/model/user/User;

    iget v2, p0, Lo/blk;->k:I

    invoke-virtual {v0, v1, v2, p2}, Lo/bld;->b(Lcom/huawei/health/sns/model/user/User;ILjava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;

    move-result-object v3

    .line 152
    iget-object v0, p0, Lo/blk;->a:Lo/bly;

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lo/blk;->a:Lo/bly;

    invoke-interface {v0}, Lo/bly;->c()[Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v4

    .line 155
    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setFrdOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 156
    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setMyOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 159
    :cond_0
    return-object v3
.end method

.method protected d()V
    .locals 4

    .line 335
    iget-object v0, p0, Lo/blk;->c:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/blk;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getNeedVerify()I

    move-result v0

    if-nez v0, :cond_1

    .line 337
    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    invoke-static {v0}, Lo/awm;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 338
    const-string v0, "addFriend"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "user:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/blk;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " verifyNote:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " formPkg:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/blk;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    iget-object v0, p0, Lo/blk;->e:Landroid/app/Activity;

    iget-object v1, p0, Lo/blk;->c:Lcom/huawei/health/sns/model/user/User;

    iget-object v2, p0, Lo/blk;->m:Ljava/lang/String;

    invoke-static {v0, v1, p0, v3, v2}, Lo/awm;->d(Landroid/content/Context;Lo/bfh;Lo/awm$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    iget-object v0, p0, Lo/blk;->n:Lo/aws;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 342
    iget-object v0, p0, Lo/blk;->n:Lo/aws;

    invoke-interface {v0}, Lo/aws;->c()V

    .line 344
    :cond_0
    goto :goto_0

    .line 348
    :cond_1
    invoke-direct {p0}, Lo/blk;->h()V

    .line 350
    :goto_0
    return-void
.end method

.method public e()V
    .locals 0

    .line 266
    invoke-virtual {p0}, Lo/blk;->c()V

    .line 267
    return-void
.end method

.method public e(Lcom/huawei/health/sns/server/user/AddFriendRequest;ILjava/lang/String;)V
    .locals 3

    .line 135
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 137
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->getVerifyNote_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->getFrdUID_()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2, p3}, Lo/blk;->c(Ljava/lang/String;JLjava/lang/String;)V

    goto :goto_0

    .line 139
    :cond_0
    if-nez p2, :cond_1

    .line 141
    iget-object v0, p0, Lo/blk;->f:Lo/blf;

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->getFrdUID_()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/blf;->e(J)V

    .line 144
    :cond_1
    :goto_0
    invoke-direct {p0, p2}, Lo/blk;->b(I)V

    .line 145
    return-void
.end method
