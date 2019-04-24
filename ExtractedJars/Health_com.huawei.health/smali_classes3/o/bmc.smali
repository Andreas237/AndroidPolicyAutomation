.class public Lo/bmc;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 18
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 19
    const/16 v0, 0x1e

    iput v0, p0, Lo/bmc;->e:I

    .line 20
    return-void
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 5

    .line 25
    iget-object v0, p0, Lo/bmc;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 27
    new-instance v3, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;

    iget-object v0, p0, Lo/bmc;->b:Landroid/content/Context;

    invoke-direct {v3, v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;-><init>(Landroid/content/Context;)V

    .line 29
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_recommend_user_item:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 30
    invoke-virtual {v3, v4}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->d(Landroid/view/View;)Lo/bfl;

    .line 31
    invoke-virtual {p0, v3}, Lo/bmc;->d(Lo/bfl;)V

    .line 32
    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 33
    const/4 v0, 0x1

    return v0
.end method
