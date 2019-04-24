.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "LoyaltyCardShowActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;
.implements Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;",
        "Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;"
    }
.end annotation


# static fields
.field private static final ACTION_SHEET_OPTION_HELP_CENTER:I = 0x1

.field private static final ACTION_SHEET_OPTION_INSTRUCTIONS:I = 0x2


# instance fields
.field protected bAddCard:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09007b
    .end annotation
.end field

.field protected bRemoveCard:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09009c
    .end annotation
.end field

.field protected bUseReceipt:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900af
    .end annotation
.end field

.field protected blcvBarcodeCard:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b9
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
    .end annotation
.end field

.field protected livInstructions:Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902f7
    .end annotation
.end field

.field protected llButtons:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090300
    .end annotation
.end field

.field protected ncvNotConnected:Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090379
    .end annotation
.end field

.field protected nlcvNumericCard:Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09037c
    .end annotation
.end field

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private hideButtons()V
    .locals 2

    .line 282
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->llButtons:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 283
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bAddCard:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 284
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bUseReceipt:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 285
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bRemoveCard:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method private hideInfoViews()V
    .locals 2

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->ncvNotConnected:Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;->setVisibility(I)V

    .line 277
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->nlcvNumericCard:Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->blcvBarcodeCard:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->setVisibility(I)V

    return-void
.end method

.method private initBarcodeCard(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V
    .locals 8

    .line 301
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->blcvBarcodeCard:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->setVisibility(I)V

    .line 302
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->blcvBarcodeCard:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    .line 303
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getFormat()Lcom/ibotta/android/barcode/Format;

    move-result-object v3

    .line 304
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getBarcode()Ljava/lang/String;

    move-result-object v4

    .line 305
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getDisplayValue()Ljava/lang/String;

    move-result-object v5

    .line 306
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getCardName()Ljava/lang/String;

    move-result-object v6

    .line 307
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getCardNumberName()Ljava/lang/String;

    move-result-object v7

    .line 302
    invoke-virtual/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->setup(Lcom/ibotta/android/barcode/Format;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getCardDescription()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->initInstructions(Ljava/lang/String;)V

    return-void
.end method

.method private initButtons(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V
    .locals 3

    .line 316
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getState()Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->NOT_CONNECTED:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bAddCard:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 318
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->isCanRemove()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 319
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bRemoveCard:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 322
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->isCanUseReceipt()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 323
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bUseReceipt:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 326
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bAddCard:Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/widget/Button;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bRemoveCard:Landroid/widget/Button;

    .line 327
    invoke-virtual {p1}, Landroid/widget/Button;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bUseReceipt:Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/widget/Button;->getVisibility()I

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    .line 330
    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->llButtons:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 328
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->llButtons:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method private initInstructions(Ljava/lang/String;)V
    .locals 1

    .line 312
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->livInstructions:Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;->setInstructions(Ljava/lang/String;)V

    return-void
.end method

.method private initLogo(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V
    .locals 3

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getLargeCardLogoUrl()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->ivLogo:Landroid/widget/ImageView;

    sget-object v2, Lcom/ibotta/android/views/images/Sizes;->LOYALTY_CARD_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, p0, p1, v1, v2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initNotConnected(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V
    .locals 2

    .line 289
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->ncvNotConnected:Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;->setVisibility(I)V

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->ncvNotConnected:Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getCardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;->setCardName(Ljava/lang/String;)V

    .line 291
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getCardLinkText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->initInstructions(Ljava/lang/String;)V

    return-void
.end method

.method private initNumericCard(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V
    .locals 3

    .line 295
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->nlcvNumericCard:Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->setVisibility(I)V

    .line 296
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->nlcvNumericCard:Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getCardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getDisplayValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->setup(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getCardDescription()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->initInstructions(Ljava/lang/String;)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 108
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 110
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 113
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 57
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowComponent;
    .locals 1

    .line 85
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/DaggerLoyaltyCardShowComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/loyalty/show/DaggerLoyaltyCardShowComponent$Builder;

    move-result-object v0

    .line 86
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/DaggerLoyaltyCardShowComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/show/DaggerLoyaltyCardShowComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;)V

    .line 87
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/DaggerLoyaltyCardShowComponent$Builder;->loyaltyCardShowModule(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowModule;)Lcom/ibotta/android/mvp/ui/activity/loyalty/show/DaggerLoyaltyCardShowComponent$Builder;

    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/DaggerLoyaltyCardShowComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowComponent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 57
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowComponent;)V
    .locals 0

    .line 93
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)V

    return-void
.end method

.method public onActionSheetOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 2

    .line 351
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 352
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;->onHelpCenterClicked()V

    goto :goto_0

    .line 353
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 354
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;->onHelpInstructionsClicked()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 143
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x18

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    const-string p1, "id"

    const/4 p2, 0x0

    .line 147
    invoke-virtual {p3, p1, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v0, "retailer_id"

    .line 148
    invoke-virtual {p3, v0, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    const-string v0, "value"

    .line 149
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "display_value"

    .line 150
    invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 152
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;

    invoke-interface {v1, p1, p2, v0, p3}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;->onCardAdded(IILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onAddCardClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007b
        }
    .end annotation

    .line 336
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;->onAddCardClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 98
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 100
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c004b

    .line 102
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->setContentView(I)V

    .line 103
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 124
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d000c

    .line 125
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 127
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 132
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f09001c

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 134
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;->onHelpClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method protected onRemoveCardClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09009c
        }
    .end annotation

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;->onRemoveCardClicked()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 118
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 119
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onUseReceiptClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900af
        }
    .end annotation

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;->onUseReceiptClicked()V

    return-void
.end method

.method public setPresentation(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V
    .locals 2

    .line 163
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->initLogo(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V

    .line 165
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->hideInfoViews()V

    .line 166
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->hideButtons()V

    .line 168
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$3;->$SwitchMap$com$ibotta$android$mvp$ui$activity$loyalty$show$Presentation$State:[I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->getState()Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 176
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->initBarcodeCard(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V

    goto :goto_0

    .line 173
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->initNumericCard(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V

    goto :goto_0

    .line 170
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->initNotConnected(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V

    .line 180
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->initButtons(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->initTitle()V

    return-void
.end method

.method public setTitleForLoadFailure()V
    .locals 1

    const v0, 0x7f1101ab

    .line 360
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->setTitle(I)V

    return-void
.end method

.method public showCardAddedSuccess()V
    .locals 2

    .line 229
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1103ec

    .line 230
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->setMessage(Ljava/lang/String;)V

    .line 231
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->show()V

    return-void
.end method

.method public showFailedToGenerateCard()V
    .locals 3

    const v0, 0x7f1103ee

    .line 185
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->showQuickMessage(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public showFailedToRemoveCard()V
    .locals 3

    const v0, 0x7f1103ef

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 190
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showHelp()V
    .locals 4

    .line 236
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v1, 0x1

    .line 237
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v1, 0x7f080264

    .line 238
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setIconResId(I)V

    const v1, 0x7f110186

    .line 239
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 241
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v2, 0x2

    .line 242
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v3, 0x7f08026b

    .line 243
    invoke-virtual {v1, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setIconResId(I)V

    const v3, 0x7f110198

    .line 244
    invoke-virtual {v1, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 246
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 251
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;)V

    .line 252
    invoke-virtual {v0, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setOptions(Ljava/util/List;)V

    .line 254
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->show()V

    return-void
.end method

.method public showHelpCenter()V
    .locals 1

    .line 259
    new-instance v0, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showHelpInstructions(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 264
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public showLoyaltyCardAdd(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 195
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->startForResult(Landroid/app/Activity;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public showRedeemReqs(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 200
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public showRemoveCardConfirmation()V
    .locals 3

    const v0, 0x7f1103ed

    .line 205
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 207
    new-instance v1, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 208
    invoke-virtual {v1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 210
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)V

    const v2, 0x7f110142

    invoke-virtual {v1, v2, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 217
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)V

    const v2, 0x7f11020d

    invoke-virtual {v1, v2, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 224
    invoke-virtual {v1}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method
