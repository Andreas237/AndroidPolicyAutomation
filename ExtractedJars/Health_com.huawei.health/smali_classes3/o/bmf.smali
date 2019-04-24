.class public Lo/bmf;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 30
    const/16 v0, 0x15

    iput v0, p0, Lo/bmf;->e:I

    .line 31
    return-void
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 8

    .line 36
    iget-object v0, p0, Lo/bmf;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 38
    new-instance v5, Lo/bky;

    iget-object v0, p0, Lo/bmf;->b:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/bky;-><init>(Landroid/content/Context;)V

    .line 40
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_subtitle_card_layout:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 41
    iget-object v0, p0, Lo/bmf;->b:Landroid/content/Context;

    instance-of v0, v0, Lcom/huawei/health/sns/ui/HomeActivity;

    if-eqz v0, :cond_1

    .line 43
    iget-object v0, p0, Lo/bmf;->b:Landroid/content/Context;

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/HomeActivity;

    .line 44
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/HomeActivity;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/HomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 46
    iget-object v0, p0, Lo/bmf;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_listview_divider_margin_Right_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v1, v2, v0, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    goto :goto_0

    .line 50
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 52
    :goto_0
    goto :goto_1

    .line 55
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 57
    :goto_1
    invoke-virtual {v5, v6}, Lo/bky;->d(Landroid/view/View;)Lo/bfl;

    .line 58
    invoke-virtual {p0, v5}, Lo/bmf;->d(Lo/bfl;)V

    .line 59
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 60
    const/4 v0, 0x1

    return v0
.end method
