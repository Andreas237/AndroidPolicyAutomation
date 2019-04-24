.class public Lo/bfx;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 29
    const/4 v0, 0x1

    iput v0, p0, Lo/bfx;->e:I

    .line 30
    return-void
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 6

    .line 35
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 36
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 38
    iget-object v0, p0, Lo/bfx;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 40
    new-instance v4, Lo/bfz;

    iget-object v0, p0, Lo/bfx;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/bfz;-><init>(Landroid/content/Context;)V

    .line 42
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_contact_card_layout:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 43
    invoke-virtual {v4, v5}, Lo/bfz;->d(Landroid/view/View;)Lo/bfl;

    .line 44
    invoke-virtual {p0, v4}, Lo/bfx;->d(Lo/bfl;)V

    .line 45
    invoke-virtual {p1, v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    const/4 v0, 0x1

    return v0
.end method
