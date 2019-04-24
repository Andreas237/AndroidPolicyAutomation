.class public Lo/bjh;
.super Lo/bjd;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .line 30
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lo/bjd;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Z)V

    .line 31
    invoke-virtual {p0, p2}, Lo/bjh;->b(Z)V

    .line 32
    return-void
.end method

.method private e(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 76
    iget-object v0, p0, Lo/bjh;->i:Landroid/content/Context;

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 78
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v2

    .line 82
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 84
    iget-object v0, p1, Lo/bjd$a;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    iget-object v0, p1, Lo/bjd$a;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_search_sub_tips_text_user_nickname:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 86
    iget-object v0, p1, Lo/bjd$a;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 87
    iget-object v0, p1, Lo/bjd$a;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 91
    :cond_1
    iget-object v0, p1, Lo/bjd$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 92
    iget-object v0, p1, Lo/bjd$a;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 96
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 98
    iget-object v0, p1, Lo/bjd$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 102
    :cond_2
    iget-object v0, p1, Lo/bjd$a;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    :goto_1
    return-void
.end method


# virtual methods
.method protected d(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V
    .locals 2

    .line 54
    if-eqz p2, :cond_1

    .line 56
    instance-of v0, p2, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-eqz v0, :cond_0

    .line 58
    move-object v1, p2

    check-cast v1, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 59
    invoke-virtual {p0, p1, v1}, Lo/bjh;->d(Lo/bjd$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    .line 60
    goto :goto_0

    .line 63
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/bjh;->e(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V

    .line 66
    :cond_1
    :goto_0
    return-void
.end method
