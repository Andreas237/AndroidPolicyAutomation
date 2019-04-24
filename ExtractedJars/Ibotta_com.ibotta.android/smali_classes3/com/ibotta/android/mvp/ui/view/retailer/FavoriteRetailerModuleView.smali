.class public Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;
.super Landroid/widget/LinearLayout;
.source "FavoriteRetailerModuleView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;
.implements Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;
    }
.end annotation


# instance fields
.field protected bViewAll:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b1
    .end annotation
.end field

.field protected buildProfile:Lcom/ibotta/android/profile/BuildProfile;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private contentLists:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;

.field protected llRows:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090328
    .end annotation
.end field

.field private models:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end field

.field protected offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private retailerModule:Lcom/ibotta/api/model/module/RetailerModule;

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 57
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 77
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 82
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 57
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 88
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 57
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    .line 89
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->initLayout()V

    return-void
.end method

.method private addRebateCardRow(Ljava/util/List;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;Z)V"
        }
    .end annotation

    .line 172
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;-><init>(Landroid/content/Context;)V

    .line 173
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    .line 175
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701bb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    .line 176
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v3, 0x7f07017b

    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 177
    :goto_0
    invoke-virtual {v0, v1, p2, v1, v2}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->setPadding(IIII)V

    .line 179
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 181
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->retailerModule:Lcom/ibotta/api/model/module/RetailerModule;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->setup(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method private generateRows()V
    .locals 7

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move-object v2, v0

    const/4 v0, 0x0

    .line 109
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->models:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_6

    .line 110
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->models:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/OfferModel;

    .line 111
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v4, v3}, Lcom/ibotta/api/helper/offer/OfferHelper;->isHeroOfferType(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 112
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    .line 114
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 118
    :cond_1
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    .line 122
    :cond_2
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    :goto_1
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v3}, Lcom/ibotta/android/profile/BuildProfile;->getMaxCardsPerRow()I

    move-result v3

    add-int/lit8 v0, v0, 0x1

    .line 126
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->models:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ne v0, v4, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    .line 127
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    rem-int/2addr v6, v3

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    .line 129
    :goto_3
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    if-nez v5, :cond_5

    if-eqz v4, :cond_0

    .line 130
    :cond_5
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_6
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 137
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)V

    const/4 v0, 0x1

    .line 139
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->setOrientation(I)V

    .line 141
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0158

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 142
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    return-void
.end method

.method private initRebates()V
    .locals 3

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->llRows:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    .line 160
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 161
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 162
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->isPreviousRebateRow(I)Z

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->addRebateCardRow(Ljava/util/List;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private initTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 154
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->bindViewEvents(Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;)V

    return-void
.end method

.method private initViewAllButton()V
    .locals 3

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->retailerModule:Lcom/ibotta/api/model/module/RetailerModule;

    invoke-virtual {v0}, Lcom/ibotta/api/model/module/RetailerModule;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->retailerModule:Lcom/ibotta/api/model/module/RetailerModule;

    invoke-virtual {v0}, Lcom/ibotta/api/model/module/RetailerModule;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->bViewAll:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->bViewAll:Landroid/widget/Button;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->retailerModule:Lcom/ibotta/api/model/module/RetailerModule;

    invoke-virtual {v1}, Lcom/ibotta/api/model/module/RetailerModule;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->bViewAll:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701cd

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    goto :goto_1

    .line 187
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f070180

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p0, v1, v1, v1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->setPadding(IIII)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->bViewAll:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private isPreviousRebateRow(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 168
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->llRows:Landroid/widget/LinearLayout;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private onSetup(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0

    .line 147
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->initTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 148
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->initRebates()V

    .line 149
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->initViewAllButton()V

    return-void
.end method


# virtual methods
.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;

    if-eqz v0, :cond_0

    .line 208
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public onContentImageClicked()V
    .locals 0

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;

    if-eqz v0, :cond_0

    .line 229
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public onTitleMenuClicked()V
    .locals 2

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;

    if-eqz v0, :cond_0

    .line 248
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->retailerModule:Lcom/ibotta/api/model/module/RetailerModule;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;->onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V

    :cond_0
    return-void
.end method

.method public onTitleMenuItemClicked(Lcom/ibotta/api/model/base/Actionable;)V
    .locals 2

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;

    if-eqz v0, :cond_0

    .line 241
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->retailerModule:Lcom/ibotta/api/model/module/RetailerModule;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;->onTitleMenuActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V

    :cond_0
    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;

    if-eqz v0, :cond_0

    .line 222
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;

    if-eqz v0, :cond_0

    .line 215
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method protected onViewAllClicked()V
    .locals 3
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900b1
        }
    .end annotation

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;

    if-eqz v0, :cond_0

    .line 201
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->retailerModule:Lcom/ibotta/api/model/module/RetailerModule;

    invoke-virtual {v1}, Lcom/ibotta/api/model/module/RetailerModule;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;->onActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/module/RetailerModule;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/module/RetailerModule;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            ")V"
        }
    .end annotation

    .line 97
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->retailerModule:Lcom/ibotta/api/model/module/RetailerModule;

    .line 98
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->models:Ljava/util/List;

    .line 100
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->contentLists:Ljava/util/List;

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->generateRows()V

    .line 104
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->onSetup(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
