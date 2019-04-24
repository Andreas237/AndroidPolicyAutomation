.class public Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;
.super Landroid/support/constraint/ConstraintLayout;
.source "SpotlightAvailableAtView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;
    }
.end annotation


# instance fields
.field private alsoAvailableAtRetailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private availableAtRetailer:Lcom/ibotta/api/model/RetailerModel;

.field protected bCantFindThisItem:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090080
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;

.field protected llAlsoAvalableAt:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902fc
    .end annotation
.end field

.field protected rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903d4
    .end annotation
.end field

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field

.field protected tvAlsoAvailableAt:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904ed
    .end annotation
.end field

.field protected tvShowMore:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090577
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 65
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->alsoAvailableAtRetailers:Ljava/util/List;

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->initLayout()V

    return-void
.end method

.method private getSeeAllVisibility()I
    .locals 2

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->alsoAvailableAtRetailers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->getMaxRetailers()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/16 v0, 0x8

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private initCantFindItemButton()V
    .locals 7

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->availableAtRetailer:Lcom/ibotta/api/model/RetailerModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 155
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f1105e6

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 157
    new-instance v2, Landroid/support/constraint/ConstraintSet;

    invoke-direct {v2}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 158
    invoke-virtual {v2, p0}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    const v3, 0x7f090080

    const/4 v4, 0x4

    .line 159
    invoke-virtual {v2, v3, v4, v1, v4}, Landroid/support/constraint/ConstraintSet;->connect(IIII)V

    const v5, 0x7f0903d4

    const/4 v6, 0x3

    .line 161
    invoke-virtual {v2, v5, v4, v3, v6}, Landroid/support/constraint/ConstraintSet;->connect(IIII)V

    const v3, 0x7f09044e

    const v5, 0x7f0902fc

    .line 163
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/support/constraint/ConstraintSet;->connect(IIII)V

    .line 165
    invoke-virtual {v2, p0}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    .line 167
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->bCantFindThisItem:Landroid/widget/Button;

    invoke-virtual {v2}, Landroid/widget/Button;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    iput v1, v2, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    goto :goto_0

    .line 169
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f1105e7

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->availableAtRetailer:Lcom/ibotta/api/model/RetailerModel;

    .line 170
    invoke-interface {v4}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    .line 169
    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 172
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    iput v1, v2, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    .line 175
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->bCantFindThisItem:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 89
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;)V

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01cb

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 92
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->bCantFindThisItem:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$1;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v1, p0, v2}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;Lcom/ibotta/android/util/AppHelper;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initStores()V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->alsoAvailableAtRetailers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->llAlsoAvalableAt:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->setVisibility(I)V

    goto :goto_0

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->alsoAvailableAtRetailers:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->setRetailers(Ljava/util/List;)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tvShowMore:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->getSeeAllVisibility()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->availableAtRetailer:Lcom/ibotta/api/model/RetailerModel;

    if-nez v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/title/TitleBarView;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tvAlsoAvailableAt:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private onSetup(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0

    .line 127
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->initTitleBar(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 128
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->initStores()V

    .line 129
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->initCantFindItemButton()V

    return-void
.end method


# virtual methods
.method protected onCantFindItemClicked()V
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;

    if-nez v0, :cond_0

    return-void

    .line 107
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->availableAtRetailer:Lcom/ibotta/api/model/RetailerModel;

    if-eqz v1, :cond_1

    .line 108
    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;->onAvailableAtCantFindThisItem(Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    .line 110
    :cond_1
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;->onAvailableAtCantFindThisItem()V

    :goto_0
    return-void
.end method

.method protected onToggleShowMore()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090577
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->onToggleShowAll()V

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->isShowingAll()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1101eb

    goto :goto_0

    :cond_0
    const v0, 0x7f1101ec

    .line 123
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tvShowMore:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setCantFindItemVisibility(I)V
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->bCantFindThisItem:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView$SpotlightAvailableAtListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            ")V"
        }
    .end annotation

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->availableAtRetailer:Lcom/ibotta/api/model/RetailerModel;

    if-eqz p2, :cond_0

    .line 80
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->alsoAvailableAtRetailers:Ljava/util/List;

    goto :goto_0

    .line 82
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->alsoAvailableAtRetailers:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 85
    :goto_0
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->onSetup(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
