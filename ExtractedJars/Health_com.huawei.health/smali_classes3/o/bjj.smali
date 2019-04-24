.class public Lo/bjj;
.super Lo/bjd;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;ZZ)V
    .locals 2

    .line 29
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/bjd;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Z)V

    .line 30
    invoke-virtual {p0, p2}, Lo/bjj;->b(Z)V

    .line 31
    invoke-virtual {p0, p3}, Lo/bjj;->d(Z)V

    .line 32
    return-void
.end method


# virtual methods
.method protected a(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 70
    iget-object v0, p0, Lo/bjj;->i:Landroid/content/Context;

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 72
    iget-object v0, p1, Lo/bjd$a;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 73
    iget-object v0, p1, Lo/bjd$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 75
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p1, Lo/bjd$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 81
    :cond_0
    iget-object v0, p1, Lo/bjd$a;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    :goto_0
    return-void
.end method

.method protected d(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V
    .locals 2

    .line 47
    if-eqz p2, :cond_1

    .line 49
    instance-of v0, p2, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-eqz v0, :cond_0

    .line 51
    move-object v1, p2

    check-cast v1, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 52
    invoke-virtual {p0, p1, v1}, Lo/bjj;->d(Lo/bjd$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    .line 53
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo/bjj;->a(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V

    .line 59
    :cond_1
    :goto_0
    return-void
.end method
