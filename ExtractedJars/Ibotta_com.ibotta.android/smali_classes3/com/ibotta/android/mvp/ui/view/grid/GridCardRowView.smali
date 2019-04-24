.class public Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;
.super Landroid/widget/LinearLayout;
.source "GridCardRowView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->initLayout()V

    return-void
.end method

.method private addGridCardToWrapper(Landroid/widget/FrameLayout;FLcom/ibotta/android/mvp/ui/view/grid/GridCardView;)V
    .locals 3

    .line 50
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 51
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p2, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 54
    invoke-virtual {p1, p3, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private attachGridItem(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;F)V
    .locals 2

    .line 40
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;-><init>(Landroid/content/Context;)V

    .line 41
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView;->updateViewModel(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;)V

    .line 43
    new-instance p1, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 44
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->addGridCardToWrapper(Landroid/widget/FrameLayout;FLcom/ibotta/android/mvp/ui/view/grid/GridCardView;)V

    .line 46
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initLayout()V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->setOrientation(I)V

    const/high16 v0, 0x42c80000    # 100.0f

    .line 27
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->setWeightSum(F)V

    return-void
.end method


# virtual methods
.method public updateViewModel(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->removeAllViews()V

    .line 33
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;

    const/high16 v1, 0x3f800000    # 1.0f

    int-to-float v2, p1

    div-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float v1, v1, v2

    .line 35
    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->attachGridItem(Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;F)V

    goto :goto_0

    :cond_0
    return-void
.end method
