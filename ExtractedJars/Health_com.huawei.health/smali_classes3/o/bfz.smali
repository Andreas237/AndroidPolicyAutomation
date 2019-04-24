.class public Lo/bfz;
.super Lo/bfl;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/awm$d;


# instance fields
.field private f:Lo/bla;

.field protected g:Lo/egd;

.field protected h:Landroid/widget/TextView;

.field protected i:Landroid/widget/TextView;

.field protected k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 70
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfz;->h:Landroid/widget/TextView;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfz;->k:Landroid/widget/TextView;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfz;->g:Lo/egd;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfz;->i:Landroid/widget/TextView;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfz;->f:Lo/bla;

    .line 71
    return-void
.end method

.method static synthetic a(Lo/bfz;)Lo/bfh;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bfz;->e:Lo/bfh;

    return-object v0
.end method

.method private static a(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 300
    new-instance v0, Lo/bfz$4;

    invoke-direct {v0, p0, p1}, Lo/bfz$4;-><init>(J)V

    return-object v0
.end method

.method private a()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 243
    const/4 v2, 0x0

    .line 244
    iget-object v0, p0, Lo/bfz;->e:Lo/bfh;

    instance-of v0, v0, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 246
    iget-object v0, p0, Lo/bfz;->e:Lo/bfh;

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 249
    :cond_0
    iget-object v0, p0, Lo/bfz;->g:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 250
    iget-object v0, p0, Lo/bfz;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 251
    iget-object v0, p0, Lo/bfz;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_btn_verify:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 253
    invoke-static {}, Lo/arw;->a()Lo/arw;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/arw;->d(Lcom/huawei/health/sns/model/user/User;)V

    .line 254
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 5

    .line 213
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 215
    iget-object v0, p0, Lo/bfz;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 220
    :cond_0
    iget-object v0, p0, Lo/bfz;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 225
    iget-object v0, p0, Lo/bfz;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_search_sub_tips_text_user_nickname:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 226
    iget-object v0, p0, Lo/bfz;->h:Landroid/widget/TextView;

    const-string v1, "<font color=\'#767676\'>%1$s</font>"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    iget-object v0, p0, Lo/bfz;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lo/bfz;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 232
    :cond_1
    iget-object v0, p0, Lo/bfz;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 233
    iget-object v0, p0, Lo/bfz;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 235
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/bfz;)Lo/bfh;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bfz;->e:Lo/bfh;

    return-object v0
.end method

.method private b(J)V
    .locals 3

    .line 282
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/bfz;->a(J)Lo/brd;

    move-result-object v1

    new-instance v2, Lo/bfz$1;

    invoke-direct {v2, p0}, Lo/bfz$1;-><init>(Lo/bfz;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 296
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V
    .locals 3

    .line 154
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 156
    iget-object v0, p0, Lo/bfz;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 158
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTips()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 160
    iget-object v0, p0, Lo/bfz;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 161
    iget-object v0, p0, Lo/bfz;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTips()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lo/bfz;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 169
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMatchType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 171
    iget-object v0, p0, Lo/bfz;->f:Lo/bla;

    invoke-virtual {v0}, Lo/bla;->d()Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 172
    iget-object v0, p0, Lo/bfz;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    goto :goto_1

    .line 176
    :cond_1
    iget-object v0, p0, Lo/bfz;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 181
    :cond_2
    iget-object v0, p0, Lo/bfz;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 182
    iget-object v0, p0, Lo/bfz;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 184
    :goto_1
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;)V
    .locals 6

    .line 402
    const/4 v3, 0x4

    .line 403
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 405
    const/4 v3, 0x0

    .line 407
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 408
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 409
    const-string v0, "bundleKeyUserId"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 410
    const-string v0, "bundleKeysrcType"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 411
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->e:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 414
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 415
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 417
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 418
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 419
    return-void
.end method

.method static synthetic b(Lo/bfz;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/bfz;->b(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method static synthetic c(Lo/bfz;)Lo/bfh;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bfz;->e:Lo/bfh;

    return-object v0
.end method

.method static synthetic d(Lo/bfz;)Lo/bfh;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bfz;->e:Lo/bfh;

    return-object v0
.end method

.method private d(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V
    .locals 3

    .line 193
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 195
    iget-object v0, p0, Lo/bfz;->f:Lo/bla;

    invoke-virtual {v0}, Lo/bla;->c()Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 196
    iget-object v0, p0, Lo/bfz;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    goto :goto_0

    .line 202
    :cond_0
    iget-object v0, p0, Lo/bfz;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/bfz;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    return-object v0
.end method

.method private e(J)V
    .locals 2

    .line 378
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bfz$2;

    invoke-direct {v1, p0, p1, p2}, Lo/bfz$2;-><init>(Lo/bfz;J)V

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 392
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 6

    .line 127
    iget-object v0, p0, Lo/bfz;->g:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 129
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lo/bfz;->a:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    .line 130
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 129
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    iget-object v0, p0, Lo/bfz;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 135
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 138
    iget-object v0, p0, Lo/bfz;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_btn_added:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lo/bfz;->i:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    :goto_0
    return-void
.end method

.method static synthetic f(Lo/bfz;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(JI)V
    .locals 2

    .line 347
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 350
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lo/bfz;->e(J)V

    .line 351
    goto :goto_0

    .line 353
    :pswitch_1
    invoke-direct {p0}, Lo/bfz;->a()V

    .line 354
    goto :goto_0

    .line 356
    :pswitch_2
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_more_req:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 357
    goto :goto_0

    .line 359
    :pswitch_3
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_self_friend_over:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 360
    goto :goto_0

    .line 362
    :pswitch_4
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_other_friend_over:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 363
    .line 367
    :goto_0
    if-eqz p3, :cond_0

    const/4 v0, 0x5

    if-ne p3, v0, :cond_1

    .line 369
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/bfz;->b(J)V

    .line 371
    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;
    .locals 4

    .line 324
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 325
    instance-of v0, p1, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 327
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 329
    :cond_0
    new-instance v3, Lcom/huawei/health/sns/server/user/AddFriendRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/user/AddFriendRequest;-><init>()V

    .line 330
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setFrdUID_(J)V

    .line 331
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 333
    invoke-virtual {v3, p2}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setVerifyNote_(Ljava/lang/String;)V

    .line 335
    :cond_1
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setRemarkName_(Ljava/lang/String;)V

    .line 336
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setPhoneDigest_(Ljava/lang/String;)V

    .line 339
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setFrdOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 340
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setMyOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 341
    return-object v3
.end method

.method public d(Landroid/view/View;)Lo/bfl;
    .locals 4

    .line 77
    sget v0, Lcom/huawei/android/sns/R$id;->user_head_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bfz;->a:Landroid/widget/ImageView;

    .line 78
    sget v0, Lcom/huawei/android/sns/R$id;->name_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bfz;->b:Landroid/widget/TextView;

    .line 79
    sget v0, Lcom/huawei/android/sns/R$id;->nickname_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bfz;->h:Landroid/widget/TextView;

    .line 80
    sget v0, Lcom/huawei/android/sns/R$id;->subtip_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bfz;->k:Landroid/widget/TextView;

    .line 81
    sget v0, Lcom/huawei/android/sns/R$id;->button_add:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/bfz;->g:Lo/egd;

    .line 82
    iget-object v0, p0, Lo/bfz;->g:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lo/bfz;->g:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 86
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_button_width_emui_five:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 87
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_button_height_emui_five:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 88
    iget-object v0, p0, Lo/bfz;->g:Lo/egd;

    invoke-virtual {v0, v3}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 89
    iget-object v0, p0, Lo/bfz;->g:Lo/egd;

    iget-object v1, p0, Lo/bfz;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_contact_btn_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 92
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->txt_state:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bfz;->i:Landroid/widget/TextView;

    .line 93
    invoke-virtual {p0, p1}, Lo/bfz;->a(Landroid/view/View;)V

    .line 94
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 101
    if-eqz p1, :cond_1

    .line 104
    instance-of v0, p1, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-eqz v0, :cond_0

    .line 106
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 107
    new-instance v0, Lo/bla;

    iget-object v1, p0, Lo/bfz;->d:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lo/bla;-><init>(Landroid/content/Context;Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    iput-object v0, p0, Lo/bfz;->f:Lo/bla;

    .line 109
    invoke-direct {p0, v2}, Lo/bfz;->d(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    .line 110
    invoke-direct {p0, v2}, Lo/bfz;->b(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    .line 112
    invoke-direct {p0, v2}, Lo/bfz;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 113
    goto :goto_0

    .line 114
    :cond_0
    instance-of v0, p1, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_1

    .line 116
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 117
    invoke-direct {p0, v2}, Lo/bfz;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 118
    invoke-direct {p0, v2}, Lo/bfz;->e(Lcom/huawei/health/sns/model/user/User;)V

    .line 121
    :cond_1
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 262
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->button_add:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/bfz;->e:Lo/bfh;

    instance-of v0, v0, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 265
    iget-object v0, p0, Lo/bfz;->e:Lo/bfh;

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 266
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 268
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/awm;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 269
    iget-object v0, p0, Lo/bfz;->d:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v2, p0, v3, v1}, Lo/awm;->d(Landroid/content/Context;Lo/bfh;Lo/awm$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    :cond_0
    return-void
.end method
