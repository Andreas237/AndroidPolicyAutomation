.class public Lo/bme;
.super Lo/bfk;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 30
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 31
    iput-object p1, p0, Lo/bme;->a:Landroid/content/Context;

    .line 32
    const/16 v0, 0x1a

    iput v0, p0, Lo/bme;->e:I

    .line 33
    return-void
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 16

    .line 38
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 40
    new-instance v5, Lo/bkz;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->b:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/bkz;-><init>(Landroid/content/Context;)V

    .line 42
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_no_recommed_user_item:I

    .line 43
    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 44
    invoke-virtual {v5, v6}, Lo/bkz;->d(Landroid/view/View;)Lo/bfl;

    .line 45
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 46
    sget v0, Lcom/huawei/android/sns/R$id;->contact_imageview:I

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 47
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lo/bme;->d(Lo/bfl;)V

    .line 49
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lo/boi;->i(Landroid/app/Activity;)I

    move-result v9

    .line 50
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lo/boi;->k(Landroid/app/Activity;)I

    move-result v10

    .line 52
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_search_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v11

    .line 53
    invoke-virtual {v7}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 55
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    move-object v0, v12

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v1, 0x11

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 58
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->b:Landroid/content/Context;

    const/high16 v1, 0x43b40000    # 360.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 59
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v0

    iput v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 60
    neg-int v0, v9

    sub-int/2addr v0, v11

    iput v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_0

    .line 64
    :cond_0
    move-object v0, v12

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 65
    const/4 v0, -0x1

    iput v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 66
    const/4 v0, -0x2

    iput v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 67
    const/4 v0, 0x0

    iput v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 69
    :goto_0
    invoke-virtual {v7, v12}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v13

    .line 72
    invoke-virtual {v8}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 73
    int-to-double v0, v13

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    double-to-int v0, v0

    sub-int/2addr v0, v9

    sub-int/2addr v0, v10

    sub-int v15, v0, v11

    .line 75
    if-gez v15, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    move v0, v15

    :goto_1
    move v15, v0

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bme;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    move v0, v15

    :goto_2
    iput v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 77
    invoke-virtual {v8, v14}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 78
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    const/4 v0, 0x1

    return v0
.end method
