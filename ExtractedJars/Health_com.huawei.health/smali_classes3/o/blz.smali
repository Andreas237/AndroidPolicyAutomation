.class public Lo/blz;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 29
    const/16 v0, 0x19

    iput v0, p0, Lo/blz;->e:I

    .line 30
    return-void
.end method

.method private a(Landroid/content/Context;)I
    .locals 5

    .line 68
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 69
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_user_link_double_item:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 70
    sget v0, Lcom/huawei/android/sns/R$id;->sub_title_textview:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 71
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/widget/LinearLayout;->measure(II)V

    .line 72
    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v0

    return v0
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 12

    .line 35
    iget-object v0, p0, Lo/blz;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 37
    new-instance v3, Lo/bkr;

    iget-object v0, p0, Lo/blz;->b:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/bkr;-><init>(Landroid/content/Context;)V

    .line 39
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_add_friend_account_layout:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 41
    invoke-virtual {v3, v4}, Lo/bkr;->d(Landroid/view/View;)Lo/bfl;

    .line 42
    invoke-virtual {p0, v3}, Lo/blz;->d(Lo/bfl;)V

    .line 43
    iget-object v0, p0, Lo/blz;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    .line 44
    invoke-virtual {v4}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 45
    const/4 v0, -0x1

    iput v0, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 47
    iget-object v0, p0, Lo/blz;->b:Landroid/content/Context;

    const/high16 v1, 0x42920000    # 73.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v7

    .line 48
    iget-object v0, p0, Lo/blz;->b:Landroid/content/Context;

    const/high16 v1, 0x42400000    # 48.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v8

    .line 49
    iget-object v0, p0, Lo/blz;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/blz;->a(Landroid/content/Context;)I

    move-result v0

    mul-int/lit8 v9, v0, 0x3

    .line 50
    iget-object v0, p0, Lo/blz;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_divider_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v10, v0

    .line 53
    iget v0, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    add-int v1, v7, v8

    add-int/2addr v1, v9

    add-int/2addr v1, v10

    sub-int v11, v0, v1

    .line 55
    iget-object v0, p0, Lo/blz;->b:Landroid/content/Context;

    const/high16 v1, 0x43af0000    # 350.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 56
    invoke-virtual {p1, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    const/4 v0, 0x1

    return v0
.end method
