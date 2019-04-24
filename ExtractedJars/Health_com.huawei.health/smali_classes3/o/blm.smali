.class public Lo/blm;
.super Lo/blh;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/ImageView;

.field private h:Landroid/widget/ImageView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Ljava/lang/String;

.field private o:I

.field private p:Landroid/widget/TextView;

.field private r:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V
    .locals 0

    .line 90
    invoke-direct {p0, p1, p2, p3}, Lo/blh;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    .line 91
    invoke-direct {p0}, Lo/blm;->e()V

    .line 92
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;)V
    .locals 6

    .line 168
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 170
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lo/blm;->f:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 171
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 170
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 175
    :cond_0
    iget-object v0, p0, Lo/blm;->f:Landroid/widget/ImageView;

    invoke-static {}, Lo/bbq;->d()I

    move-result v1

    invoke-static {v0, v1}, Lo/bbq;->a(Landroid/widget/ImageView;I)V

    .line 177
    :goto_0
    return-void
.end method

.method private b()Z
    .locals 2

    .line 337
    iget-object v0, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c(ILjava/lang/String;)Landroid/text/SpannableString;
    .locals 7

    .line 200
    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, -0x5

    .line 201
    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 202
    new-instance v5, Landroid/text/SpannableString;

    invoke-direct {v5, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 203
    new-instance v6, Landroid/text/style/ForegroundColorSpan;

    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_black_30:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v6, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 204
    const/4 v0, 0x0

    const/16 v1, 0x21

    invoke-virtual {v5, v6, v0, v3, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 205
    return-object v5
.end method

.method private c(I)V
    .locals 2

    .line 281
    invoke-direct {p0}, Lo/blm;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo/blm;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 283
    iget-object v0, p0, Lo/blm;->h:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 284
    return-void

    .line 287
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 290
    :pswitch_0
    iget-object v0, p0, Lo/blm;->h:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 291
    goto :goto_0

    .line 293
    :pswitch_1
    iget-object v0, p0, Lo/blm;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_img_man:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 294
    iget-object v0, p0, Lo/blm;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 295
    goto :goto_0

    .line 297
    :pswitch_2
    iget-object v0, p0, Lo/blm;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_img_woman:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 298
    iget-object v0, p0, Lo/blm;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 299
    goto :goto_0

    .line 301
    :pswitch_3
    iget-object v0, p0, Lo/blm;->h:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 302
    const-string v0, "DetailInfoView"

    const-string v1, "User.TYPE_GENDER_CLASSIFIED"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 307
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 252
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    iget-object v0, p0, Lo/blm;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 255
    iget-object v0, p0, Lo/blm;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_detail_nickname:I

    invoke-static {p1}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lo/blm;->c(ILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 259
    :cond_0
    const-string v0, "DetailInfoView"

    const-string v1, "UserDetail nickName is null."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    iget-object v0, p0, Lo/blm;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 262
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 217
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    iget-object v0, p0, Lo/blm;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    invoke-direct {p0, p3}, Lo/blm;->c(Ljava/lang/String;)V

    goto :goto_1

    .line 225
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 227
    iget-object v0, p0, Lo/blm;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 231
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 233
    iget-object v0, p0, Lo/blm;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 238
    :cond_2
    iget-object v0, p0, Lo/blm;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 241
    :goto_0
    iget-object v0, p0, Lo/blm;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 243
    :goto_1
    return-void
.end method

.method private e()V
    .locals 2

    .line 112
    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->head_imageview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/blm;->f:Landroid/widget/ImageView;

    .line 113
    iget-object v0, p0, Lo/blm;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->name_textview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/blm;->k:Landroid/widget/TextView;

    .line 117
    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->gender_imgview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/blm;->h:Landroid/widget/ImageView;

    .line 118
    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->account_textview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/blm;->m:Landroid/widget/TextView;

    .line 119
    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->nickname_textview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/blm;->l:Landroid/widget/TextView;

    .line 120
    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_nickname_textview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/blm;->p:Landroid/widget/TextView;

    .line 121
    return-void
.end method

.method private e(Ljava/lang/String;Z)V
    .locals 4

    .line 317
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lo/blm;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lo/blm;->r:Z

    if-eqz v0, :cond_1

    .line 319
    :cond_0
    invoke-static {p1}, Lo/bqz;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 320
    iget-object v0, p0, Lo/blm;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 321
    iget-object v0, p0, Lo/blm;->m:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_detail_account:I

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lo/blm;->c(ILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    goto :goto_0

    .line 325
    :cond_1
    iget-object v0, p0, Lo/blm;->m:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 327
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;)Z
    .locals 1

    .line 158
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/blm;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f()Z
    .locals 2

    .line 348
    iget v0, p0, Lo/blm;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private i()V
    .locals 3

    .line 357
    iget-object v0, p0, Lo/blm;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 359
    iget-object v0, p0, Lo/blm;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 360
    iget v0, p0, Lo/blm;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 362
    iget-object v0, p0, Lo/blm;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_detail_group_nickname:I

    iget-object v2, p0, Lo/blm;->n:Ljava/lang/String;

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lo/blm;->c(ILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 366
    :cond_0
    iget-object v0, p0, Lo/blm;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_detail_normal_group_nickname:I

    iget-object v2, p0, Lo/blm;->n:Ljava/lang/String;

    .line 367
    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lo/blm;->c(ILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 373
    :cond_1
    iget-object v0, p0, Lo/blm;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 375
    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 32
    invoke-super {p0}, Lo/blh;->a()V

    return-void
.end method

.method public bridge synthetic a(I)V
    .locals 0

    .line 32
    invoke-super {p0, p1}, Lo/blh;->a(I)V

    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 0

    .line 102
    iput p1, p0, Lo/blm;->o:I

    .line 103
    iput-object p2, p0, Lo/blm;->n:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 130
    if-nez p1, :cond_0

    .line 132
    return-void

    .line 135
    :cond_0
    invoke-direct {p0, p1}, Lo/blm;->b(Lcom/huawei/health/sns/model/user/User;)V

    .line 138
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lo/blm;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getGender()I

    move-result v0

    invoke-direct {p0, v0}, Lo/blm;->c(I)V

    .line 144
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getAccount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lo/blm;->e(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/blm;->e(Ljava/lang/String;Z)V

    .line 147
    invoke-direct {p0}, Lo/blm;->i()V

    .line 148
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 271
    iput-boolean p1, p0, Lo/blm;->r:Z

    .line 272
    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    .line 32
    invoke-super {p0}, Lo/blh;->c()V

    return-void
.end method

.method public d()V
    .locals 3

    .line 184
    iget-object v0, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lo/blm;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getAccount()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lo/blm;->e(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/blm;->e(Ljava/lang/String;Z)V

    .line 192
    :cond_0
    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 32
    invoke-super {p0, p1}, Lo/blh;->e(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 380
    iget-object v0, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 382
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 383
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 384
    const-string v0, "bundleKeyUser"

    iget-object v1, p0, Lo/blm;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 385
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 386
    iget-object v0, p0, Lo/blm;->e:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 388
    :cond_0
    return-void
.end method
