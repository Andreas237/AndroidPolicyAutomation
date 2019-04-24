.class public Lo/bmb;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 27
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 28
    const/16 v0, 0x17

    iput v0, p0, Lo/bmb;->e:I

    .line 29
    return-void
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 5

    .line 34
    iget-object v0, p0, Lo/bmb;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 36
    new-instance v3, Lcom/huawei/health/sns/ui/user/card/LinkCard;

    iget-object v0, p0, Lo/bmb;->b:Landroid/content/Context;

    invoke-direct {v3, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard;-><init>(Landroid/content/Context;)V

    .line 38
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_user_link_item:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 39
    invoke-virtual {v3, v4}, Lcom/huawei/health/sns/ui/user/card/LinkCard;->d(Landroid/view/View;)Lo/bfl;

    .line 40
    invoke-virtual {p0, v3}, Lo/bmb;->d(Lo/bfl;)V

    .line 41
    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 42
    const/4 v0, 0x1

    return v0
.end method
