.class public Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;
.super Landroid/widget/LinearLayout;
.source "PopularRetailerModuleView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;
.implements Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView$RecommendedRetailerModuleListener;
    }
.end annotation


# instance fields
.field protected bViewAll:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b1
    .end annotation
.end field

.field private currentRetailerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

.field private listener:Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView$RecommendedRetailerModuleListener;

.field protected llRows:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090328
    .end annotation
.end field

.field private module:Lcom/ibotta/api/model/base/Module;

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->initLayout()V

    return-void
.end method

.method private addDividerRow()V
    .locals 3

    .line 138
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07015d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 140
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 142
    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0600fa

    .line 143
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 145
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private addRetailerRow(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 3

    .line 124
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 126
    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->initWithContentViewModel(Lcom/ibotta/api/model/RetailerModel;Z)V

    .line 128
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-interface {v2, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->isFavorited(I)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->setFavorite(Z)V

    .line 129
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->setShowFavorite(Z)V

    .line 131
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;)V

    .line 133
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {p1, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 134
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 84
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->setOrientation(I)V

    .line 86
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01b0

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 87
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initRetailers()V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    .line 104
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->currentRetailerModels:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    if-nez v0, :cond_0

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->addDividerRow()V

    .line 109
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->currentRetailerModels:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->addRetailerRow(Lcom/ibotta/api/model/RetailerModel;)V

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->addDividerRow()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private initTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 98
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->bindViewEvents(Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;)V

    return-void
.end method

.method private initViewAllButton()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->module:Lcom/ibotta/api/model/base/Module;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->bViewAll:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->bViewAll:Landroid/widget/Button;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 116
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->bViewAll:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private onSetup(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->initTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->initRetailers()V

    .line 93
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->initViewAllButton()V

    return-void
.end method


# virtual methods
.method public onFavoriteClicked(Lcom/ibotta/api/model/RetailerModel;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 167
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->unfavorite(I)V

    goto :goto_0

    .line 170
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->favorite(I)V

    :goto_0
    return-void
.end method

.method public onRetailerRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView$RecommendedRetailerModuleListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView$RecommendedRetailerModuleListener;->onRetailerRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

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

.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView$RecommendedRetailerModuleListener;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView$RecommendedRetailerModuleListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/base/Module;",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 74
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->module:Lcom/ibotta/api/model/base/Module;

    .line 75
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->currentRetailerModels:Ljava/util/List;

    .line 77
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/android/di/MainComponent;->getFavoriteRetailersManagerFactory()Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance()Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    .line 80
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;->onSetup(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
