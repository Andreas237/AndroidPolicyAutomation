.class public Lo/bkx;
.super Lo/bfl;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/awx$c;
.implements Lo/awm$d;


# instance fields
.field protected f:Landroid/widget/TextView;

.field protected g:Lo/egd;

.field protected h:Lo/egd;

.field private i:Lo/bkw;

.field protected k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 62
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkx;->h:Lo/egd;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkx;->g:Lo/egd;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkx;->f:Landroid/widget/TextView;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkx;->i:Lo/bkw;

    .line 63
    new-instance v0, Lo/bkw;

    invoke-direct {v0, p1, p0}, Lo/bkw;-><init>(Landroid/content/Context;Lo/bkx;)V

    iput-object v0, p0, Lo/bkx;->i:Lo/bkw;

    .line 64
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/user/UserNotify;)Lcom/huawei/health/sns/model/user/UserNotify$b;
    .locals 1

    .line 152
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/bkx;)Landroid/content/Context;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    return-object v0
.end method

.method private b(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 8

    .line 198
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNote()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 201
    invoke-direct {p0, p1}, Lo/bkx;->c(Lcom/huawei/health/sns/model/user/UserNotify;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Lo/bkx;->a(Lcom/huawei/health/sns/model/user/UserNotify;)Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_0

    .line 203
    iget-object v0, p0, Lo/bkx;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_already_add_friend:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Lo/bkx;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    :goto_0
    iget-object v0, p0, Lo/bkx;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 212
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 214
    iget-object v0, p0, Lo/bkx;->k:Landroid/widget/TextView;

    const-string v1, "<font color=\'#B3B3B3\'>%1$s</font>  <font color=\'#767676\'>%2$s</font>"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/bkx;->d:Landroid/content/Context;

    sget v4, Lcom/huawei/android/sns/R$string;->sns_contact:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, " "

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 215
    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getContactName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 214
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    iget-object v0, p0, Lo/bkx;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 220
    :cond_2
    iget-object v0, p0, Lo/bkx;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 222
    :goto_1
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/user/UserNotify;)I
    .locals 1

    .line 130
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getIsFriend()I

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/bkx;)Lo/bfh;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/bkx;->e:Lo/bfh;

    return-object v0
.end method

.method private d(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 3

    .line 162
    invoke-direct {p0, p1}, Lo/bkx;->a(Lcom/huawei/health/sns/model/user/UserNotify;)Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v2

    .line 164
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v2, v0, :cond_0

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v2, v0, :cond_0

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->g:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v2, v0, :cond_0

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->d:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v2, v0, :cond_1

    .line 167
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNotifiedSide()I

    move-result v0

    if-nez v0, :cond_1

    .line 169
    :cond_0
    iget-object v0, p0, Lo/bkx;->h:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 170
    iget-object v0, p0, Lo/bkx;->g:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lo/bkx;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 174
    :cond_1
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->i:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v2, v0, :cond_2

    .line 176
    iget-object v0, p0, Lo/bkx;->h:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lo/bkx;->g:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 178
    iget-object v0, p0, Lo/bkx;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lo/bkx;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_btn_verify:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 182
    :cond_2
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->c:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v2, v0, :cond_3

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->d:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v2, v0, :cond_4

    .line 183
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNotifiedSide()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 185
    :cond_3
    iget-object v0, p0, Lo/bkx;->h:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lo/bkx;->g:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lo/bkx;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 189
    :cond_4
    :goto_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/user/UserNotify;)J
    .locals 2

    .line 141
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic e(Lo/bkx;)Landroid/content/Context;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    return-object v0
.end method

.method private h(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 4

    .line 255
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->isReaded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 258
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.health.sns.local_action_read_notify"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 259
    const-string v0, "readNotifyUserId"

    invoke-direct {p0, p1}, Lo/bkx;->e(Lcom/huawei/health/sns/model/user/UserNotify;)J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 260
    invoke-static {v3}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 262
    :cond_0
    return-void
.end method


# virtual methods
.method public a(JI)V
    .locals 2

    .line 335
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 338
    :pswitch_0
    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_self_friend_over:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 339
    goto :goto_0

    .line 341
    :pswitch_1
    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_other_friend_over:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 342
    goto :goto_0

    .line 344
    :pswitch_2
    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_more_req:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 345
    .line 350
    :goto_0
    iget-object v0, p0, Lo/bkx;->e:Lo/bfh;

    instance-of v0, v0, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_0

    .line 352
    iget-object v0, p0, Lo/bkx;->i:Lo/bkw;

    iget-object v1, p0, Lo/bkx;->e:Lo/bfh;

    check-cast v1, Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-virtual {v0, p3, p1, p2, v1}, Lo/bkw;->c(IJLcom/huawei/health/sns/model/user/UserNotify;)V

    .line 354
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Ljava/lang/String;)V
    .locals 4

    .line 267
    iget-object v0, p0, Lo/bkx;->e:Lo/bfh;

    instance-of v0, v0, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lo/bkx;->e:Lo/bfh;

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 271
    iget-object v0, p0, Lo/bkx;->i:Lo/bkw;

    invoke-direct {p0, v3}, Lo/bkx;->e(Lcom/huawei/health/sns/model/user/UserNotify;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/bkw;->d(J)V

    .line 272
    new-instance v0, Lo/awz;

    invoke-direct {v0}, Lo/awz;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->getFrdUID_()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/awz;->e(J)V

    .line 273
    goto :goto_0

    .line 276
    :cond_0
    const-string v0, "UserNotifyCard"

    const-string v1, "replyFriendSucc bean not instanceof UserNotify"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    :goto_0
    return-void
.end method

.method public b(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;
    .locals 6

    .line 283
    instance-of v0, p1, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_0

    .line 285
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 286
    new-instance v5, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    invoke-direct {v5}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;-><init>()V

    .line 287
    invoke-direct {p0, v4}, Lo/bkx;->e(Lcom/huawei/health/sns/model/user/UserNotify;)J

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->setData(JILjava/lang/String;)V

    .line 288
    return-object v5

    .line 292
    :cond_0
    const-string v0, "UserNotifyCard"

    const-string v1, "getReplyFriendRequest bean not instanceof UserNotify"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const/4 v0, 0x0

    return-object v0
.end method

.method public b()V
    .locals 7

    .line 300
    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 302
    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    move-object v6, v0

    check-cast v6, Landroid/app/Activity;

    .line 303
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    return-void

    .line 308
    :cond_0
    move-object v0, v6

    const-string v1, ""

    iget-object v2, p0, Lo/bkx;->d:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->sns_add_friend_expire_dialog_content:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_btn_add:I

    new-instance v5, Lo/bkx$2;

    invoke-direct {v5, p0}, Lo/bkx$2;-><init>(Lo/bkx;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 324
    :cond_1
    return-void
.end method

.method public d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;
    .locals 1

    .line 329
    new-instance v0, Lo/bld;

    invoke-direct {v0}, Lo/bld;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/bld;->d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/view/View;)Lo/bfl;
    .locals 3

    .line 70
    sget v0, Lcom/huawei/android/sns/R$id;->user_head_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bkx;->a:Landroid/widget/ImageView;

    .line 71
    sget v0, Lcom/huawei/android/sns/R$id;->name_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bkx;->b:Landroid/widget/TextView;

    .line 72
    sget v0, Lcom/huawei/android/sns/R$id;->nickname_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bkx;->k:Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/huawei/android/sns/R$id;->button_add:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/bkx;->h:Lo/egd;

    .line 74
    iget-object v0, p0, Lo/bkx;->h:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    sget v0, Lcom/huawei/android/sns/R$id;->button_accept:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/bkx;->g:Lo/egd;

    .line 76
    iget-object v0, p0, Lo/bkx;->g:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    sget v0, Lcom/huawei/android/sns/R$id;->txt_state:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bkx;->f:Landroid/widget/TextView;

    .line 78
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/bkx;->h:Lo/egd;

    iget-object v1, p0, Lo/bkx;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_contact_btn_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 83
    iget-object v0, p0, Lo/bkx;->g:Lo/egd;

    iget-object v1, p0, Lo/bkx;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_contact_btn_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 86
    :cond_0
    invoke-virtual {p0, p1}, Lo/bkx;->a(Landroid/view/View;)V

    .line 87
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 94
    if-eqz p1, :cond_1

    instance-of v0, p1, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_1

    .line 96
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 98
    iget-object v0, p0, Lo/bkx;->i:Lo/bkw;

    iget-object v1, p0, Lo/bkx;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v2, v1}, Lo/bkw;->e(Lcom/huawei/health/sns/model/user/UserNotify;Landroid/widget/ImageView;)V

    .line 100
    iget-object v0, p0, Lo/bkx;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bkx;->d:Landroid/content/Context;

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    invoke-direct {p0, v2}, Lo/bkx;->b(Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 105
    invoke-direct {p0, v2}, Lo/bkx;->c(Lcom/huawei/health/sns/model/user/UserNotify;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 107
    iget-object v0, p0, Lo/bkx;->h:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 108
    iget-object v0, p0, Lo/bkx;->g:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 109
    iget-object v0, p0, Lo/bkx;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 110
    iget-object v0, p0, Lo/bkx;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_btn_added:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 115
    :cond_0
    invoke-direct {p0, v2}, Lo/bkx;->d(Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 118
    :goto_0
    iget-object v0, p0, Lo/bkx;->i:Lo/bkw;

    invoke-virtual {p0}, Lo/bkx;->c()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lo/bkw;->a(Landroid/view/View;Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 120
    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 228
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    .line 229
    sget v0, Lcom/huawei/android/sns/R$id;->button_add:I

    if-ne v3, v0, :cond_0

    iget-object v0, p0, Lo/bkx;->e:Lo/bfh;

    instance-of v0, v0, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_0

    .line 232
    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/awm;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 233
    iget-object v0, p0, Lo/bkx;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/bkx;->e:Lo/bfh;

    const/4 v2, 0x0

    invoke-static {v0, v1, p0, v4, v2}, Lo/awm;->d(Landroid/content/Context;Lo/bfh;Lo/awm$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lo/bkx;->e:Lo/bfh;

    check-cast v0, Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {p0, v0}, Lo/bkx;->h(Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 236
    goto :goto_0

    .line 237
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->button_accept:I

    if-ne v3, v0, :cond_1

    .line 239
    iget-object v0, p0, Lo/bkx;->e:Lo/bfh;

    instance-of v0, v0, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_1

    .line 241
    iget-object v0, p0, Lo/bkx;->e:Lo/bfh;

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 242
    iget-object v0, p0, Lo/bkx;->i:Lo/bkw;

    invoke-virtual {v0, v4}, Lo/bkw;->d(Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 243
    invoke-direct {p0, v4}, Lo/bkx;->h(Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 246
    :cond_1
    :goto_0
    return-void
.end method
