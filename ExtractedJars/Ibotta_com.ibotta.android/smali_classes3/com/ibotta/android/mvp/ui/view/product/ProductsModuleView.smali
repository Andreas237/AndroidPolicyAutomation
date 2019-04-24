.class public Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;
.super Landroid/widget/LinearLayout;
.source "ProductsModuleView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;
.implements Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;
.implements Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;
    }
.end annotation


# instance fields
.field protected bViewAll:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b1
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;

.field protected llRows:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090328
    .end annotation
.end field

.field private module:Lcom/ibotta/api/model/base/Module;

.field private productModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ProductModel;",
            ">;"
        }
    .end annotation
.end field

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 56
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 67
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->initLayout()V

    return-void
.end method

.method private addDividerRow()V
    .locals 3

    .line 133
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 134
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07015d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 135
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 137
    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0600fa

    .line 138
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 140
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private addProductRow(Lcom/ibotta/api/model/ProductModel;)V
    .locals 3

    .line 124
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;-><init>(Landroid/content/Context;)V

    .line 125
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->setup(Lcom/ibotta/api/model/ProductModel;)V

    .line 126
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;)V

    .line 128
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {p1, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 129
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 83
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->setOrientation(I)V

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0195

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 86
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initProducts()V
    .locals 4

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 103
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->productModels:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->addDividerRow()V

    .line 105
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->productModels:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/ProductModel;

    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->addProductRow(Lcom/ibotta/api/model/ProductModel;)V

    .line 107
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->productModels:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_1

    .line 109
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->addDividerRow()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private initTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 97
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->bindViewEvents(Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;)V

    return-void
.end method

.method private initViewAllButton()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->bViewAll:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->bViewAll:Landroid/widget/Button;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 116
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->bViewAll:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private onSetup(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0

    .line 90
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->initTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->initProducts()V

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->initViewAllButton()V

    return-void
.end method


# virtual methods
.method public onProductCardClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;

    if-eqz v0, :cond_0

    .line 170
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;->onProductRowClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method

.method public onProductRowClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;

    if-eqz v0, :cond_0

    .line 163
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;->onProductRowClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method

.method public onProductShopClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;

    if-eqz v0, :cond_0

    .line 177
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;->onProductShopClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method

.method public onTitleMenuClicked()V
    .locals 0

    return-void
.end method

.method public onTitleMenuItemClicked(Lcom/ibotta/api/model/base/Actionable;)V
    .locals 0

    return-void
.end method

.method protected onViewAllClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900b1
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;

    if-eqz v0, :cond_0

    .line 146
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;->onActionClicked(Lcom/ibotta/api/model/base/Actionable;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/base/Module;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/base/Module;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ProductModel;",
            ">;",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            ")V"
        }
    .end annotation

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->module:Lcom/ibotta/api/model/base/Module;

    .line 77
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->productModels:Ljava/util/List;

    .line 79
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->onSetup(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
