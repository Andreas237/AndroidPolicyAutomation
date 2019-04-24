.class public Lo/bhv;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 33
    const/16 v0, 0x1f

    iput v0, p0, Lo/bhv;->e:I

    .line 34
    return-void
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 6

    .line 39
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 40
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 42
    iget-object v0, p0, Lo/bhv;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 44
    new-instance v4, Lo/bgx;

    iget-object v0, p0, Lo/bhv;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/bgx;-><init>(Landroid/content/Context;)V

    .line 45
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_family_item:I

    .line 46
    const/4 v1, 0x0

    invoke-virtual {v3, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 47
    invoke-virtual {v4, v5}, Lo/bgx;->d(Landroid/view/View;)Lo/bfl;

    .line 48
    invoke-virtual {p0, v4}, Lo/bhv;->d(Lo/bfl;)V

    .line 49
    invoke-virtual {p1, v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    const/4 v0, 0x1

    return v0
.end method
