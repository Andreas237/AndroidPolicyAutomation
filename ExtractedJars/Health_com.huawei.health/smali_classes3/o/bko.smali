.class public Lo/bko;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

.field private c:Lcom/huawei/health/sns/model/user/User;

.field private d:Lo/axf;

.field private e:Landroid/os/Handler;

.field private i:Landroid/app/AlertDialog;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Handler;J)V
    .locals 1

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bko;->c:Lcom/huawei/health/sns/model/user/User;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bko;->d:Lo/axf;

    .line 86
    iput-object p1, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    .line 87
    iput-wide p3, p0, Lo/bko;->a:J

    .line 88
    iput-object p2, p0, Lo/bko;->e:Landroid/os/Handler;

    .line 89
    return-void
.end method

.method static synthetic b(Lo/bko;)J
    .locals 2

    .line 43
    iget-wide v0, p0, Lo/bko;->a:J

    return-wide v0
.end method

.method private b()Landroid/app/AlertDialog;
    .locals 7

    .line 213
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_delete_friend_notice:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/bko;->c:Lcom/huawei/health/sns/model/user/User;

    iget-object v4, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {v3, v4}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 215
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    const-string v1, ""

    move-object v2, v6

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_delete:I

    new-instance v5, Lo/bko$1;

    invoke-direct {v5, p0}, Lo/bko$1;-><init>(Lo/bko;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lo/bko;->i:Landroid/app/AlertDialog;

    .line 236
    iget-object v0, p0, Lo/bko;->i:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic d(Lo/bko;)Lcom/huawei/health/sns/ui/user/UserDetailActivity;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 180
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 181
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    const-class v1, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 182
    const/high16 v0, 0x4000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 183
    iget-wide v0, p0, Lo/bko;->a:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 185
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 186
    const-string v0, "userId"

    iget-wide v1, p0, Lo/bko;->a:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 187
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 188
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 189
    goto :goto_0

    .line 192
    :cond_0
    const-string v0, "UserDetailActivityEvent"

    const-string v1, "jumpToSingleChat, userId is -1."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    :goto_0
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->finish()V

    .line 195
    return-void
.end method

.method static synthetic e(Lo/bko;)Lcom/huawei/health/sns/model/user/User;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/bko;->c:Lcom/huawei/health/sns/model/user/User;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 257
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    const-class v1, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 258
    const-string v0, "complain_category_type"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 259
    const-string v0, "complain_id"

    iget-object v1, p0, Lo/bko;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 260
    iget-object v0, p0, Lo/bko;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v4

    .line 261
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 265
    :cond_0
    const-string v0, "complain_info"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 266
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {v0, v3}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 267
    return-void
.end method

.method private h()V
    .locals 4

    .line 244
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 245
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    const-class v1, Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 246
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 247
    const-string v0, "vCardUser"

    iget-object v1, p0, Lo/bko;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 248
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 249
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 250
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 339
    invoke-virtual {p0}, Lo/bko;->c()Lo/axf;

    move-result-object v0

    const/16 v1, 0x25

    invoke-virtual {v0, v1}, Lo/axf;->d(I)V

    .line 340
    return-void
.end method

.method public a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/bko;->c:Lcom/huawei/health/sns/model/user/User;

    .line 104
    return-void
.end method

.method public b(Lo/blq;JLjava/lang/String;)V
    .locals 8

    .line 327
    invoke-virtual {p1}, Lo/blq;->b()I

    move-result v6

    .line 329
    new-instance v7, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-direct {v7}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;-><init>()V

    .line 330
    move-object v0, v7

    iget-wide v1, p0, Lo/bko;->a:J

    move v3, v6

    move-wide v4, p2

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->setData(JIJ)V

    .line 331
    invoke-virtual {p0}, Lo/bko;->c()Lo/axf;

    move-result-object v0

    iget-object v1, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    const/16 v2, 0x25

    invoke-virtual {v0, v2, v1, v7, p4}, Lo/axf;->c(ILandroid/content/Context;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Ljava/lang/String;)V

    .line 332
    return-void
.end method

.method protected c()Lo/axf;
    .locals 2

    .line 349
    iget-object v0, p0, Lo/bko;->d:Lo/axf;

    if-nez v0, :cond_0

    .line 351
    new-instance v0, Lo/axf;

    iget-object v1, p0, Lo/bko;->e:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lo/bko;->d:Lo/axf;

    .line 353
    :cond_0
    iget-object v0, p0, Lo/bko;->d:Lo/axf;

    return-object v0
.end method

.method public c(Z)V
    .locals 3

    .line 312
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    const-class v1, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 313
    const-string v0, "messageTab"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 314
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 315
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 316
    return-void
.end method

.method public d(I)V
    .locals 2

    .line 276
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 279
    :sswitch_0
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_not_exist:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 280
    goto :goto_1

    .line 282
    :sswitch_1
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_num_limite:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 283
    goto :goto_1

    .line 285
    :sswitch_2
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_more_req:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 286
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->finish()V

    .line 287
    goto :goto_1

    .line 289
    :sswitch_3
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->finish()V

    .line 290
    goto :goto_1

    .line 292
    :sswitch_4
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_two_dimcode_overdue:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 293
    goto :goto_1

    .line 296
    :sswitch_5
    iget-object v0, p0, Lo/bko;->c:Lcom/huawei/health/sns/model/user/User;

    if-nez v0, :cond_0

    .line 298
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_1

    .line 302
    :goto_0
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    const/4 v1, 0x0

    invoke-static {v1, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 305
    :cond_0
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe3 -> :sswitch_1
        0xe5 -> :sswitch_2
        0x3f0 -> :sswitch_0
        0x3f1 -> :sswitch_3
        0x3f4 -> :sswitch_4
        0x3f9 -> :sswitch_5
    .end sparse-switch
.end method

.method public d(Landroid/view/MenuItem;)V
    .locals 2

    .line 156
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_send_message:I

    if-ne v0, v1, :cond_0

    .line 159
    invoke-direct {p0}, Lo/bko;->d()V

    goto :goto_0

    .line 161
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_delete:I

    if-ne v0, v1, :cond_1

    .line 163
    invoke-direct {p0}, Lo/bko;->b()Landroid/app/AlertDialog;

    goto :goto_0

    .line 165
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_send_card:I

    if-ne v0, v1, :cond_2

    .line 167
    invoke-direct {p0}, Lo/bko;->h()V

    goto :goto_0

    .line 169
    :cond_2
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_complain:I

    if-ne v0, v1, :cond_3

    .line 171
    invoke-direct {p0}, Lo/bko;->g()V

    .line 173
    :cond_3
    :goto_0
    return-void
.end method

.method public e()V
    .locals 1

    .line 202
    iget-object v0, p0, Lo/bko;->i:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bko;->i:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, p0, Lo/bko;->i:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 206
    :cond_0
    return-void
.end method

.method public e(Landroid/view/Menu;Lcom/huawei/health/sns/model/user/User;)V
    .locals 8

    .line 114
    const/4 v2, 0x0

    .line 115
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 117
    const/4 v2, 0x1

    .line 119
    :cond_0
    iget-object v0, p0, Lo/bko;->b:Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_friend_detail_menu_50:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 120
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v3

    .line 121
    const/4 v4, 0x0

    .line 123
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 124
    :goto_0
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v3, :cond_6

    .line 126
    invoke-interface {p1, v7}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v4

    .line 127
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    move-result v5

    .line 128
    sget v0, Lcom/huawei/android/sns/R$id;->menu_send_message:I

    if-eq v5, v0, :cond_2

    sget v0, Lcom/huawei/android/sns/R$id;->menu_send_card:I

    if-eq v5, v0, :cond_2

    sget v0, Lcom/huawei/android/sns/R$id;->menu_complain:I

    if-ne v5, v0, :cond_4

    .line 130
    :cond_2
    invoke-interface {v4, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 133
    if-eqz v6, :cond_3

    .line 135
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    goto :goto_2

    .line 139
    :cond_3
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    goto :goto_2

    .line 142
    :cond_4
    sget v0, Lcom/huawei/android/sns/R$id;->menu_delete:I

    if-ne v5, v0, :cond_5

    .line 144
    invoke-interface {v4, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 124
    :cond_5
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 147
    :cond_6
    return-void
.end method
