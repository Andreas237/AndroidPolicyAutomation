.class public Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;
.super Landroid/widget/LinearLayout;
.source "GridModuleView.java"


# instance fields
.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected llRows:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090328
    .end annotation
.end field

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->initLayout()V

    return-void
.end method

.method private addCategoryRow(ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;",
            ">;)V"
        }
    .end annotation

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;-><init>(Landroid/content/Context;)V

    .line 76
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0701bb

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 78
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 80
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardRowView;->updateViewModel(ILjava/util/List;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 48
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;)V

    const/4 v0, 0x1

    .line 50
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->setOrientation(I)V

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c013b

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 53
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    return-void
.end method

.method private updateTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method private updateViewModels(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;",
            ">;)V"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/util/AppHelper;->mapItemsToItemRows(Ljava/util/List;I)Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    .line 67
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 68
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 69
    invoke-direct {p0, p1, v1}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->addCategoryRow(ILjava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public updateRows(Lcom/ibotta/api/model/base/Module;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/base/Module;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;",
            ">;",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            ")V"
        }
    .end annotation

    .line 43
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->updateTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    const/4 p1, 0x4

    .line 44
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->updateViewModels(ILjava/util/List;)V

    return-void
.end method
