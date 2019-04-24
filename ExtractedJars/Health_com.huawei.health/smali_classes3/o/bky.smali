.class public Lo/bky;
.super Lo/bfl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 26
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 31
    sget v0, Lcom/huawei/android/sns/R$id;->title_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bky;->b:Landroid/widget/TextView;

    .line 32
    invoke-virtual {p0, p1}, Lo/bky;->a(Landroid/view/View;)V

    .line 33
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 4

    .line 39
    if-eqz p1, :cond_2

    instance-of v0, p1, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_2

    .line 41
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/model/user/User;

    .line 42
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 45
    invoke-static {}, Lo/bmo;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lo/bky;->b:Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 51
    :cond_0
    iget-object v0, p0, Lo/bky;->b:Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 57
    :cond_1
    iget-object v0, p0, Lo/bky;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    :cond_2
    :goto_0
    return-void
.end method
