.class public Lo/eqe;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# instance fields
.field private final a:Lo/epy;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/ImageView;

.field private final d:Lo/eqc;

.field private e:Landroid/widget/ImageView;

.field private g:I

.field private h:Z

.field private i:Z

.field private k:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Lo/epy;Landroid/content/Context;Lo/eqc;ILandroid/widget/LinearLayout;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eqe;->h:Z

    .line 33
    iput-object p1, p0, Lo/eqe;->a:Lo/epy;

    .line 34
    iput-object p2, p0, Lo/eqe;->b:Landroid/content/Context;

    .line 35
    iput-object p3, p0, Lo/eqe;->d:Lo/eqc;

    .line 36
    iput p4, p0, Lo/eqe;->g:I

    .line 37
    invoke-direct {p0, p5}, Lo/eqe;->a(Landroid/widget/LinearLayout;)V

    .line 38
    return-void
.end method

.method private a(Landroid/widget/LinearLayout;)V
    .locals 2

    .line 70
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_navigation_spot_first:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    .line 71
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_navigation_spot_second:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/eqe;->e:Landroid/widget/ImageView;

    .line 72
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_navigation_spot_third:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    .line 74
    iget v0, p0, Lo/eqe;->g:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 77
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eqe;->h:Z

    goto :goto_0

    .line 79
    :cond_1
    iget v0, p0, Lo/eqe;->g:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_2

    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eqe;->i:Z

    goto :goto_0

    .line 82
    :cond_2
    iget v0, p0, Lo/eqe;->g:I

    const/16 v1, 0x9

    if-gt v0, v1, :cond_3

    .line 83
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eqe;->i:Z

    .line 85
    :cond_3
    :goto_0
    return-void
.end method

.method private b(II)V
    .locals 9

    .line 88
    iget-object v0, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v5, v0, Landroid/util/DisplayMetrics;->density:F

    .line 89
    const-string v0, "FunctionSetViewTouchOnScrollListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "       end"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "            listSize"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eqe;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "            navigationGone"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/eqe;->h:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-boolean v0, p0, Lo/eqe;->h:Z

    if-eqz v0, :cond_0

    .line 93
    return-void

    .line 96
    :cond_0
    iget-boolean v0, p0, Lo/eqe;->i:Z

    if-eqz v0, :cond_3

    .line 97
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    add-int/lit8 v0, p1, 0x3

    if-gt p2, v0, :cond_1

    .line 98
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40c00000    # 6.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 99
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 100
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_selecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 102
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 103
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 104
    iget-object v0, p0, Lo/eqe;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    iget-object v0, p0, Lo/eqe;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 108
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v8, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 109
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 110
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 112
    goto/16 :goto_0

    .line 113
    :cond_1
    iget v0, p0, Lo/eqe;->g:I

    add-int/lit8 v0, v0, -0x1

    if-ne v0, p2, :cond_2

    add-int/lit8 v0, p2, -0x3

    if-lt p1, v0, :cond_2

    .line 114
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 115
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 116
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 118
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 119
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 120
    iget-object v0, p0, Lo/eqe;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    iget-object v0, p0, Lo/eqe;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 123
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40c00000    # 6.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v8, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 124
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 125
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_selecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 127
    goto/16 :goto_0

    .line 129
    :cond_2
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 130
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 133
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40c00000    # 6.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 134
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 135
    iget-object v0, p0, Lo/eqe;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    iget-object v0, p0, Lo/eqe;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_selecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 138
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v8, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 139
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 140
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 142
    goto/16 :goto_0

    .line 145
    :cond_3
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    add-int/lit8 v0, p1, 0x3

    if-gt p2, v0, :cond_4

    .line 146
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40c00000    # 6.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 147
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_selecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 150
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 151
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 152
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 153
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 154
    goto/16 :goto_0

    .line 155
    :cond_4
    iget v0, p0, Lo/eqe;->g:I

    add-int/lit8 v0, v0, -0x1

    if-ne v0, p2, :cond_5

    add-int/lit8 v0, p2, -0x3

    if-lt p1, v0, :cond_5

    .line 156
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 157
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 158
    iget-object v0, p0, Lo/eqe;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 160
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x40c00000    # 6.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v1, v5

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 161
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, v5

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 162
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 163
    iget-object v0, p0, Lo/eqe;->k:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/eqe;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_page_selecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 166
    :cond_5
    :goto_0
    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 6

    .line 41
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 43
    if-nez p2, :cond_0

    .line 44
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v4

    .line 45
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v5

    .line 46
    const-string v0, "FunctionSetViewTouchOnScrollListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FirstVisibleItemPosition: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "       findLastVisibleItemPosition"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-direct {p0, v4, v5}, Lo/eqe;->b(II)V

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 50
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v4

    .line 51
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v5

    .line 52
    const-string v0, "FunctionSetViewTouchOnScrollListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FirstVisibleItemPosition: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "       findLastVisibleItemPosition"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    iget-object v0, p0, Lo/eqe;->d:Lo/eqc;

    invoke-virtual {v0, v4}, Lo/eqc;->c(I)V

    .line 54
    iget-object v0, p0, Lo/eqe;->d:Lo/eqc;

    invoke-virtual {v0, v5}, Lo/eqc;->e(I)V

    .line 56
    :cond_1
    :goto_0
    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 4

    .line 59
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 60
    iget-object v0, p0, Lo/eqe;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "has_slip_home_cards"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 64
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    const-string v0, ""

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 65
    iget-object v0, p0, Lo/eqe;->a:Lo/epy;

    invoke-virtual {v0}, Lo/epy;->a()V

    .line 67
    :cond_0
    return-void
.end method
