.class public Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;
.super Landroid/widget/LinearLayout;
.source "RebateCardRowView.java"


# instance fields
.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected buildProfile:Lcom/ibotta/android/profile/BuildProfile;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

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

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 58
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 64
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->initLayout()V

    return-void
.end method

.method private attachRebateCard(FLcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)V
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 131
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;-><init>(Landroid/content/Context;)V

    .line 133
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->getLayoutParams(F)Landroid/widget/LinearLayout$LayoutParams;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    .line 135
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    new-instance v1, Lcom/ibotta/android/content/OfferDisplayContent;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-direct {v1, p2, v2, p3}, Lcom/ibotta/android/content/OfferDisplayContent;-><init>(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    invoke-virtual {p1, v1}, Lcom/ibotta/android/content/card/ContentCardReducer;->create(Lcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    .line 138
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->addView(Landroid/view/View;)V

    return-void
.end method

.method private getLayoutParams(F)Landroid/widget/LinearLayout$LayoutParams;
    .locals 4

    .line 142
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 144
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0701bb

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 145
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070173

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 146
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070180

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 148
    invoke-virtual {v0, p1, v2, p1, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    return-object v0
.end method

.method private initLayout()V
    .locals 3

    .line 80
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;)V

    const/4 v0, 0x0

    .line 82
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->setOrientation(I)V

    const/high16 v0, 0x42c80000    # 100.0f

    .line 83
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->setWeightSum(F)V

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    new-instance v0, Lcom/ibotta/api/model/content/OfferContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/OfferContent;-><init>()V

    .line 88
    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    const/high16 v2, 0x42040000    # 33.0f

    invoke-direct {p0, v2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->attachRebateCard(FLcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 89
    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {p0, v2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->attachRebateCard(FLcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 90
    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {p0, v2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->attachRebateCard(FLcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    :cond_0
    return-void
.end method

.method private initStyle()Lcom/ibotta/android/views/content/ContentStyle;
    .locals 3

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->models:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isHeroOfferType(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    return-object v0

    .line 114
    :cond_0
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    return-object v0
.end method

.method private initWeight(Lcom/ibotta/android/views/content/ContentStyle;)F
    .locals 1

    .line 120
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p1, v0, :cond_0

    const/high16 p1, 0x42c80000    # 100.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x42480000    # 50.0f

    :goto_0
    return p1
.end method

.method private onSetup()V
    .locals 4

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->removeAllViews()V

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->models:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 101
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->initStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v0

    .line 102
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->initWeight(Lcom/ibotta/android/views/content/ContentStyle;)F

    move-result v1

    .line 104
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->models:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/OfferModel;

    .line 105
    invoke-direct {p0, v1, v3, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->attachRebateCard(FLcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    return-void
.end method

.method public setup(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ")V"
        }
    .end annotation

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->models:Ljava/util/List;

    .line 70
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateCardRowView;->onSetup()V

    return-void
.end method
