.class public Lo/bdn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V
    .locals 3

    .line 29
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 31
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 33
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTips()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 35
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 36
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTips()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 43
    :goto_0
    invoke-virtual {p3}, Lo/bla;->d()Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 44
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    goto :goto_1

    .line 48
    :cond_1
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 49
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 51
    :goto_1
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V
    .locals 3

    .line 62
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p3}, Lo/bla;->c()Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 65
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->b:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 74
    :cond_1
    iget-object v0, p1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    :goto_0
    return-void
.end method
