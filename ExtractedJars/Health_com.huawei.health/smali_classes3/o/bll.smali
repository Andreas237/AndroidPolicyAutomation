.class public Lo/bll;
.super Lo/blh;
.source "SourceFile"


# instance fields
.field private f:Landroid/view/View;

.field private h:Landroid/widget/RelativeLayout;

.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Handler;Lo/bly;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lo/blh;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    .line 41
    invoke-direct {p0}, Lo/bll;->b()V

    .line 42
    return-void
.end method

.method private b()V
    .locals 2

    .line 47
    iget-object v0, p0, Lo/bll;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->from_relative_layout:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bll;->h:Landroid/widget/RelativeLayout;

    .line 48
    iget-object v0, p0, Lo/bll;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->divider_from_imageview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bll;->f:Landroid/view/View;

    .line 49
    iget-object v0, p0, Lo/bll;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->from_textview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bll;->k:Landroid/widget/TextView;

    .line 50
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .line 69
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bll;->g:Z

    .line 72
    iget-object v0, p0, Lo/bll;->h:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/bll;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 77
    :cond_0
    iget-object v0, p0, Lo/bll;->f:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 80
    iget-object v0, p0, Lo/bll;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 85
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bll;->g:Z

    .line 86
    iget-object v0, p0, Lo/bll;->h:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    .line 89
    iget-object v0, p0, Lo/bll;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 91
    :cond_2
    iget-object v0, p0, Lo/bll;->f:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 94
    iget-object v0, p0, Lo/bll;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/bll;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getCity()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/bll;->c:Lcom/huawei/health/sns/model/user/User;

    .line 95
    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getProvince()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/bll;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getSignature()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 98
    iget-object v0, p0, Lo/bll;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 102
    :cond_3
    iget-object v0, p0, Lo/bll;->f:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 106
    :cond_4
    :goto_0
    iget-object v0, p0, Lo/bll;->k:Landroid/widget/TextView;

    if-eqz v0, :cond_5

    .line 109
    iget-object v0, p0, Lo/bll;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 14
    invoke-super {p0}, Lo/blh;->a()V

    return-void
.end method

.method public bridge synthetic a(I)V
    .locals 0

    .line 14
    invoke-super {p0, p1}, Lo/blh;->a(I)V

    return-void
.end method

.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 55
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->isAlreadyFriend()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lo/bll;->e:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOriginType()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOriginDesc()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/server/user/Origin;->getStringByType(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bll;->d(Ljava/lang/String;)V

    .line 60
    :cond_0
    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    .line 14
    invoke-super {p0}, Lo/blh;->c()V

    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 14
    invoke-super {p0, p1}, Lo/blh;->e(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 118
    return-void
.end method
