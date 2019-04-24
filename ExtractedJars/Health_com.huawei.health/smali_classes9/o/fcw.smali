.class public Lo/fcw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Landroid/content/Context;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lo/fcw;->d:Landroid/widget/LinearLayout;

    .line 23
    iput-object p2, p0, Lo/fcw;->c:Landroid/content/Context;

    .line 24
    iget-object v0, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lo/fcw;->a:F

    .line 25
    iget-object v0, p0, Lo/fcw;->d:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lo/fcw;->e(Landroid/widget/LinearLayout;)V

    .line 26
    return-void
.end method

.method private e(Landroid/widget/LinearLayout;)V
    .locals 1

    .line 80
    sget v0, Lcom/huawei/ui/main/R$id;->function_set_navigation_spot_first:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fcw;->e:Landroid/widget/ImageView;

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->function_set_navigation_spot_second:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fcw;->b:Landroid/widget/ImageView;

    .line 82
    return-void
.end method


# virtual methods
.method public c(Lo/fde;IIII)V
    .locals 7

    .line 29
    if-le p2, p4, :cond_1

    .line 30
    const-string v0, "FitnessHorizontalScrollViewListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "scrollView scroll X = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   oldx = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    const/16 v0, 0x42

    invoke-virtual {p1, v0}, Lo/fde;->fullScroll(I)Z

    .line 32
    iget-object v0, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iget v1, p0, Lo/fcw;->a:F

    const/high16 v2, 0x40c00000    # 6.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 34
    iget-object v0, p0, Lo/fcw;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    iget-object v0, p0, Lo/fcw;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_page_selecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 37
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iget v1, p0, Lo/fcw;->a:F

    const/high16 v2, 0x40800000    # 4.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 38
    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x41000000    # 8.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 39
    iget-object v0, p0, Lo/fcw;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    iget-object v0, p0, Lo/fcw;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 41
    goto/16 :goto_0

    .line 43
    :cond_0
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iget v1, p0, Lo/fcw;->a:F

    const/high16 v2, 0x40800000    # 4.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 44
    iget-object v0, p0, Lo/fcw;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    iget-object v0, p0, Lo/fcw;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 47
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iget v1, p0, Lo/fcw;->a:F

    const/high16 v2, 0x40c00000    # 6.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 48
    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x41000000    # 8.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 49
    iget-object v0, p0, Lo/fcw;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    iget-object v0, p0, Lo/fcw;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_page_selecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 51
    goto/16 :goto_0

    .line 53
    :cond_1
    if-ge p2, p4, :cond_3

    .line 54
    const-string v0, "FitnessHorizontalScrollViewListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "scrollView scroll -X = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   oldx = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Lo/fde;->fullScroll(I)Z

    .line 56
    iget-object v0, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 57
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iget v1, p0, Lo/fcw;->a:F

    const/high16 v2, 0x40800000    # 4.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 58
    iget-object v0, p0, Lo/fcw;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    iget-object v0, p0, Lo/fcw;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 61
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iget v1, p0, Lo/fcw;->a:F

    const/high16 v2, 0x40c00000    # 6.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 62
    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x41000000    # 8.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 63
    iget-object v0, p0, Lo/fcw;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    iget-object v0, p0, Lo/fcw;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_page_selecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 65
    goto/16 :goto_0

    .line 67
    :cond_2
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iget v1, p0, Lo/fcw;->a:F

    const/high16 v2, 0x40c00000    # 6.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 68
    iget-object v0, p0, Lo/fcw;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    iget-object v0, p0, Lo/fcw;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_page_selecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 71
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    iget v1, p0, Lo/fcw;->a:F

    const/high16 v2, 0x40800000    # 4.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 72
    iget v0, p0, Lo/fcw;->a:F

    const/high16 v1, 0x41000000    # 8.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 73
    iget-object v0, p0, Lo/fcw;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 74
    iget-object v0, p0, Lo/fcw;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fcw;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_page_unselecet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 77
    :cond_3
    :goto_0
    return-void
.end method
