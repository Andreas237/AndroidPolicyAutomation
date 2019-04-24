.class public Lo/bmd;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 33
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 34
    const/16 v0, 0x1c

    iput v0, p0, Lo/bmd;->e:I

    .line 35
    return-void
.end method

.method private a(Landroid/content/Context;)I
    .locals 5

    .line 84
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 85
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_user_link_item:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 86
    sget v0, Lcom/huawei/android/sns/R$id;->sub_title_textview:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 87
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/widget/LinearLayout;->measure(II)V

    .line 88
    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v0

    return v0
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 13

    .line 40
    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 42
    new-instance v3, Lo/bkv;

    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/bkv;-><init>(Landroid/content/Context;)V

    .line 44
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_no_friend_item:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 45
    invoke-virtual {v3, v4}, Lo/bkv;->d(Landroid/view/View;)Lo/bfl;

    .line 46
    invoke-virtual {p0, v3}, Lo/bmd;->d(Lo/bfl;)V

    .line 48
    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    .line 49
    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 50
    const/4 v0, -0x1

    iput v0, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 52
    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    const/high16 v1, 0x42920000    # 73.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v7

    .line 53
    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    const/high16 v1, 0x42400000    # 48.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v8

    .line 54
    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/bmd;->a(Landroid/content/Context;)I

    move-result v0

    mul-int/lit8 v9, v0, 0x4

    .line 55
    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_divider_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    mul-int/lit8 v10, v0, 0x5

    .line 56
    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v11

    .line 59
    iget v0, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v1, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    if-lt v0, v1, :cond_0

    .line 61
    iget v0, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    sub-int/2addr v0, v7

    sub-int/2addr v0, v8

    sub-int/2addr v0, v9

    sub-int v12, v0, v10

    goto :goto_0

    .line 66
    :cond_0
    iget v0, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    sub-int/2addr v0, v7

    sub-int/2addr v0, v8

    sub-int/2addr v0, v9

    sub-int/2addr v0, v10

    sub-int v12, v0, v11

    .line 69
    :goto_0
    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    const/high16 v1, 0x42f00000    # 120.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    if-le v12, v0, :cond_1

    move v0, v12

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lo/bmd;->b:Landroid/content/Context;

    const/high16 v1, 0x42f00000    # 120.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    :goto_1
    iput v0, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 71
    invoke-virtual {p1, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 73
    const/4 v0, 0x1

    return v0
.end method
