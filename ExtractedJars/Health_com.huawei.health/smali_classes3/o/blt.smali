.class public Lo/blt;
.super Lo/blh;
.source "SourceFile"


# instance fields
.field private f:Landroid/view/View;

.field private h:Landroid/widget/TextView;

.field private k:Landroid/widget/RelativeLayout;

.field private p:Lo/blu;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2, p3}, Lo/blh;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    .line 54
    invoke-direct {p0}, Lo/blt;->d()V

    .line 55
    return-void
.end method

.method private b()Z
    .locals 2

    .line 92
    iget v0, p0, Lo/blt;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d()V
    .locals 2

    .line 60
    iget-object v0, p0, Lo/blt;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->signature_relative_layout:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/blt;->k:Landroid/widget/RelativeLayout;

    .line 61
    iget-object v0, p0, Lo/blt;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->divider_signature_imageview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/blt;->f:Landroid/view/View;

    .line 62
    iget-object v0, p0, Lo/blt;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->signature_textview:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/blt;->h:Landroid/widget/TextView;

    .line 63
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/user/User;)V
    .locals 2

    .line 116
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSignature()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 117
    invoke-direct {p0}, Lo/blt;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo/blt;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/blt;->p:Lo/blu;

    sget-object v1, Lo/blu;->b:Lo/blu;

    if-ne v0, v1, :cond_4

    .line 119
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/blt;->g:Z

    .line 120
    iget-object v0, p0, Lo/blt;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 122
    iget-object v0, p0, Lo/blt;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 124
    :cond_1
    iget-object v0, p0, Lo/blt;->f:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 127
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getCity()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 128
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getProvince()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 131
    iget-object v0, p0, Lo/blt;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 135
    :cond_2
    iget-object v0, p0, Lo/blt;->f:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 138
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/blt;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 140
    iget-object v0, p0, Lo/blt;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSignature()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 145
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/blt;->g:Z

    .line 146
    iget-object v0, p0, Lo/blt;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 148
    iget-object v0, p0, Lo/blt;->k:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 150
    :cond_5
    iget-object v0, p0, Lo/blt;->f:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 152
    iget-object v0, p0, Lo/blt;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 155
    :cond_6
    :goto_1
    return-void
.end method

.method private e()Z
    .locals 2

    .line 80
    iget-object v0, p0, Lo/blt;->c:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/blt;->c:Lcom/huawei/health/sns/model/user/User;

    .line 81
    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 80
    :goto_0
    return v0
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 21
    invoke-super {p0}, Lo/blh;->a()V

    return-void
.end method

.method public bridge synthetic a(I)V
    .locals 0

    .line 21
    invoke-super {p0, p1}, Lo/blh;->a(I)V

    return-void
.end method

.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lo/blt;->d(Lcom/huawei/health/sns/model/user/User;)V

    .line 70
    return-void
.end method

.method public a(Lo/blu;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/blt;->p:Lo/blu;

    .line 103
    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    .line 21
    invoke-super {p0}, Lo/blh;->c()V

    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 21
    invoke-super {p0, p1}, Lo/blh;->e(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 161
    return-void
.end method
