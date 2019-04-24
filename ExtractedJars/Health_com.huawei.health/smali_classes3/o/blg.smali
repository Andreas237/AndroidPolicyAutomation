.class public Lo/blg;
.super Lo/blh;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Lo/blh;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    .line 49
    invoke-direct {p0}, Lo/blg;->e()V

    .line 50
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 78
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/blg;->g:Z

    .line 81
    iget-object v0, p0, Lo/blg;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 82
    iget-object v0, p0, Lo/blg;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 86
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/blg;->g:Z

    .line 87
    iget-object v0, p0, Lo/blg;->f:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 89
    :goto_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 55
    iget-object v0, p0, Lo/blg;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->contact_relative_layout:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/blg;->f:Landroid/widget/RelativeLayout;

    .line 56
    iget-object v0, p0, Lo/blg;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->contact_phone:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/blg;->h:Landroid/widget/TextView;

    .line 57
    iget-object v0, p0, Lo/blg;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    return-void
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 25
    invoke-super {p0}, Lo/blh;->a()V

    return-void
.end method

.method public bridge synthetic a(I)V
    .locals 0

    .line 25
    invoke-super {p0, p1}, Lo/blh;->a(I)V

    return-void
.end method

.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 2

    .line 63
    if-eqz p1, :cond_0

    .line 66
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/blg;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    :cond_0
    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    .line 25
    invoke-super {p0}, Lo/blh;->c()V

    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 25
    invoke-super {p0, p1}, Lo/blh;->e(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 94
    iget-object v0, p0, Lo/blg;->c:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lo/blg;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqz;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    const-string v0, "mailto:"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 99
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.SENDTO"

    invoke-direct {v5, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 100
    const-string v0, "android.intent.extra.EMAIL"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Lo/blg;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    iget-object v0, p0, Lo/blg;->e:Landroid/app/Activity;

    const-string v1, "com.android.email"

    invoke-static {v0, v5, v1}, Lo/bnx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 102
    goto :goto_0

    .line 105
    :cond_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/blg;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 106
    iget-object v0, p0, Lo/blg;->e:Landroid/app/Activity;

    const-string v1, "com.android.contacts"

    invoke-static {v0, v4, v1}, Lo/bnx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 109
    :cond_1
    :goto_0
    return-void
.end method
