.class public Lcom/shopkick/app/bnc/BCRulesScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "BCRulesScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/bnc/LinkedCardsViewController$ILinkedCardsViewCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;,
        Lcom/shopkick/app/bnc/BCRulesScreen$LearnMoreClickHandler;,
        Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;
    }
.end annotation


# static fields
.field private static final CHAIN_LOGO_DIMENSION_DIP:I = 0x30

.field private static final CHAIN_LOGO_DIMENSION_DIP_BBY_SMALL:I = 0x26

.field private static final DEFAULT_MARGIN_PADDING:I = 0xf

.field private static final DEFAULT_TOP_BOTTOM_PADDING:I = 0x14

.field private static final HOW_IT_WORKS_BANNER_1X_HEIGHT:I = 0x64

.field private static final HOW_IT_WORKS_BANNER_1X_WIDTH:I = 0x140

.field private static final LOGO_ROUNDED_CORNER_RADIUS:I = 0x5

.field private static final MAX_THRESHOLD_RULES:I = 0x3


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private bbyQRCode:Ljava/lang/String;

.field private cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

.field private dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

.field private flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private locationId:Ljava/lang/String;

.field private mainView:Landroid/view/View;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

.field private progressBar:Landroid/widget/ProgressBar;

.field private request:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationRequest;

.field private response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

.field private scrollView:Landroid/widget/ScrollView;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/bnc/BCRulesScreen;)Landroid/view/View;
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getRulesLayout()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/bnc/BCRulesScreen;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->handleLearnMoreClick()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/bnc/BCRulesScreen;Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;I)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/bnc/BCRulesScreen;->handleButtonClick(Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;I)V

    return-void
.end method

.method private configureActionButton(Landroid/view/View;IIIILcom/shopkick/app/bnc/BCRulesScreen$ButtonType;)V
    .locals 2

    const v0, 0x7f0900c0

    .line 383
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f090014

    .line 384
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    .line 386
    invoke-virtual {p0, p2}, Lcom/shopkick/app/bnc/BCRulesScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 387
    invoke-virtual {v1, p3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    const p2, 0x7f090447

    .line 388
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    .line 389
    invoke-direct {p0, v1, p5}, Lcom/shopkick/app/bnc/BCRulesScreen;->setupButtonClickLogging(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 390
    new-instance p1, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;

    invoke-direct {p1, p0, p6, p5}, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonClickHandler;-><init>(Lcom/shopkick/app/bnc/BCRulesScreen;Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;I)V

    invoke-virtual {v1, p1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private configureBBYInstructions()V
    .locals 6

    .line 394
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBBYBrightnessEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 395
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/controllers/WindowBrightnessController;->setScreenBrightnessToMaximum(Landroid/view/Window;)V

    .line 398
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f09006c

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 399
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v2, 0x7f09006d

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 400
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v2, 0x7f090074

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 401
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isBestBuyLocation:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 405
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getBBYInstructionsBarcodeLayout()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v2, 0x0

    .line 406
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 408
    iget-object v3, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v4, 0x7f090732

    invoke-virtual {v3, v4}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f110078

    .line 409
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    .line 410
    iget-object v4, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v5, 0x7f09040b

    invoke-virtual {v4, v5}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 411
    iget-object v4, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v4}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsPhoneRegistered()Z

    move-result v4

    if-nez v4, :cond_2

    return-void

    .line 416
    :cond_2
    iget-object v4, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBBYBarcodeDigitsEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    const v5, 0x7f09068c

    if-nez v4, :cond_3

    .line 417
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 420
    :cond_3
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/widget/SKTextView;

    iget-object v5, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->bbyQRCode:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 423
    :goto_0
    iget-object v4, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBBYEmailEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 425
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v4, 0x7f090236

    invoke-virtual {v1, v4}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v4, Lcom/shopkick/app/bnc/-$$Lambda$BCRulesScreen$qt7SwYV-aQikdcwWor6BA49ZrJQ;

    invoke-direct {v4, p0}, Lcom/shopkick/app/bnc/-$$Lambda$BCRulesScreen$qt7SwYV-aQikdcwWor6BA49ZrJQ;-><init>(Lcom/shopkick/app/bnc/BCRulesScreen;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 428
    :cond_4
    iget-object v4, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v5, 0x7f0907ec

    invoke-virtual {v4, v5}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    const/16 v1, 0xf

    .line 431
    invoke-static {v1, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    const/16 v4, 0x14

    .line 432
    invoke-static {v4, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v4

    .line 433
    invoke-virtual {v3, v1, v4, v1, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    const v1, 0x7f09068d

    .line 434
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 436
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getBBYInstructionsBarcodeLayout()Landroid/widget/RelativeLayout;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 437
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->userBarcodeImageUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 440
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBBYEmailEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 441
    invoke-direct {p0, v0}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureBBYInstructionsV3(Landroid/widget/RelativeLayout;)V

    :cond_5
    return-void
.end method

.method private configureBBYInstructionsV3(Landroid/widget/RelativeLayout;)V
    .locals 5

    const v0, 0x7f090427

    .line 486
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    .line 487
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f1101a4

    invoke-virtual {p0, v3, v2}, Lcom/shopkick/app/bnc/BCRulesScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f090428

    .line 488
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 489
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-virtual {p0, v3, v0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private configureButton()V
    .locals 9

    .line 339
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isBestBuyLocation:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const v1, 0x7f0906db

    if-eqz v0, :cond_1

    .line 340
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsPhoneRegistered()Z

    move-result v0

    if-nez v0, :cond_0

    .line 341
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->showStickyButton()V

    .line 342
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f110061

    const v5, 0x7f110066

    const/4 v6, 0x4

    const/4 v7, 0x3

    sget-object v8, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;->RegisterPhone:Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureActionButton(Landroid/view/View;IIIILcom/shopkick/app/bnc/BCRulesScreen$ButtonType;)V

    goto :goto_0

    .line 349
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->hideStickyButton()V

    goto :goto_0

    .line 352
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->enrolledCards:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->enrolledCards:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 353
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->hideStickyButton()V

    goto :goto_0

    .line 356
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->showStickyButton()V

    .line 357
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f110062

    const v5, 0x7f110064

    const/4 v6, 0x0

    const/16 v7, 0xf

    sget-object v8, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;->LinkCard:Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureActionButton(Landroid/view/View;IIIILcom/shopkick/app/bnc/BCRulesScreen$ButtonType;)V

    :goto_0
    return-void
.end method

.method private configureEnrolledCardsV2()V
    .locals 2

    .line 493
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->setContainingScrollView(Landroid/widget/ScrollView;)V

    .line 494
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->enrolledCards:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureEnrolledCards(Ljava/util/List;)V

    return-void
.end method

.method private configureHowItWorksView()V
    .locals 6

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f0902ec

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 244
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->enrolledCards:Ljava/util/List;

    const/16 v2, 0x8

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->enrolledCards:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 246
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 248
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v3, 0x7f090063

    .line 249
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const/16 v4, 0x140

    const/16 v5, 0x64

    .line 250
    invoke-static {v3, v4, v5}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    const v3, 0x7f090229

    .line 253
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v3, 0x7f110330

    const/4 v4, 0x1

    .line 254
    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->chainName:Ljava/lang/String;

    aput-object v5, v4, v1

    invoke-virtual {p0, v3, v4}, Lcom/shopkick/app/bnc/BCRulesScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->isVisaOnlyLocation()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v3, 0x7f0902ee

    invoke-virtual {v0, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 258
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v2, 0x7f0906d8

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private configureRulesView()V
    .locals 11

    .line 264
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f09007a

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 265
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v2, 0x7f09007b

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 267
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isBestBuyLocation:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->isVisaOnlyLocation()Z

    move-result v0

    if-nez v0, :cond_1

    .line 268
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v2, 0x7f090079

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 271
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getRulesLayout()Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0903ed

    .line 272
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const/4 v4, 0x0

    .line 273
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 274
    iget-object v5, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreRateRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    const v6, 0x7f090760

    const v7, 0x7f09075f

    const/4 v8, 0x1

    if-eqz v5, :cond_2

    const v2, 0x7f0f0008

    .line 275
    iget-object v5, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreRateRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;->kickAmount:Ljava/lang/Integer;

    .line 276
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    new-array v9, v8, [Ljava/lang/Object;

    iget-object v10, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreRateRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;->kickAmount:Ljava/lang/Integer;

    aput-object v10, v9, v4

    .line 275
    invoke-virtual {p0, v2, v5, v9}, Lcom/shopkick/app/bnc/BCRulesScreen;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 278
    :cond_2
    iget-object v5, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStorePerTransactionRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    if-eqz v5, :cond_3

    .line 279
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStorePerTransactionRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;->ruleText:Ljava/lang/String;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 281
    :cond_3
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 282
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 283
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 286
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreThresholdRules:Ljava/util/List;

    const v3, 0x7f09075e

    const v5, 0x7f09075d

    const v9, 0x7f09075c

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreThresholdRules:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_6

    move v2, v4

    :goto_1
    const/4 v6, 0x3

    if-ge v2, v6, :cond_7

    packed-switch v2, :pswitch_data_0

    const/4 v6, 0x0

    goto :goto_2

    .line 297
    :pswitch_0
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    goto :goto_2

    .line 294
    :pswitch_1
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    goto :goto_2

    .line 291
    :pswitch_2
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    :goto_2
    if-nez v6, :cond_4

    goto :goto_4

    .line 304
    :cond_4
    iget-object v7, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreThresholdRules:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-lt v2, v7, :cond_5

    .line 305
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 307
    :cond_5
    iget-object v7, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreThresholdRules:Ljava/util/List;

    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    .line 308
    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;->ruleText:Ljava/lang/String;

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 312
    :cond_6
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 313
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 314
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 315
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 316
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    :goto_4
    const v2, 0x7f09025b

    .line 318
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 319
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->restrictionsText:Ljava/lang/String;

    if-eqz v2, :cond_8

    .line 320
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->restrictionsText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 321
    :cond_8
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isBestBuyLocation:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_9

    const v2, 0x7f11006a

    .line 322
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 323
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBBYEmailEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 325
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_5

    .line 328
    :cond_9
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->escrowPeriodDays:Ljava/lang/Integer;

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->escrowPeriodDays:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lez v2, :cond_a

    const v1, 0x7f0f0006

    .line 329
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->escrowPeriodDays:Ljava/lang/Integer;

    .line 330
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    new-array v3, v8, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->escrowPeriodDays:Ljava/lang/Integer;

    aput-object v5, v3, v4

    .line 329
    invoke-virtual {p0, v1, v2, v3}, Lcom/shopkick/app/bnc/BCRulesScreen;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 333
    :cond_a
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_b
    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private fetchRules()V
    .locals 3

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationRequest;

    if-eqz v0, :cond_0

    return-void

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 153
    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    new-instance v2, Lcom/shopkick/app/bnc/-$$Lambda$BCRulesScreen$9l3o4FBTQHOKvFs0VSrDh0pQlbs;

    invoke-direct {v2, p0}, Lcom/shopkick/app/bnc/-$$Lambda$BCRulesScreen$9l3o4FBTQHOKvFs0VSrDh0pQlbs;-><init>(Lcom/shopkick/app/bnc/BCRulesScreen;)V

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    .line 156
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    const v2, 0x7f0906db

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 158
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationRequest;

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationRequest;

    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->locationId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationRequest;->locationId:Ljava/lang/String;

    .line 160
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private getBBYInstructionsBarcodeLayout()Landroid/widget/RelativeLayout;
    .locals 2

    .line 508
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsPhoneRegistered()Z

    move-result v0

    if-nez v0, :cond_0

    .line 509
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f090074

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    goto :goto_0

    .line 511
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBBYEmailEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 512
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f09006d

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    goto :goto_0

    .line 515
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f09006c

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    :goto_0
    return-object v0
.end method

.method private getRulesLayout()Landroid/view/View;
    .locals 2

    .line 521
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isBestBuyLocation:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 522
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f09007b

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 524
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f09007a

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private handleBcLinkCardClick()V
    .locals 11

    .line 565
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->enrolledCards:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 566
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->enrolledCards:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v1

    move v3, v2

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    .line 567
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 569
    :cond_1
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0xa

    if-ne v4, v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move v2, v1

    move v3, v2

    .line 574
    :cond_3
    new-instance v0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v5

    iget-object v6, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v6, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLinkedCardsVisa:Ljava/lang/Integer;

    .line 576
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v7, 0x1

    if-ge v2, v4, :cond_4

    move v2, v7

    goto :goto_1

    :cond_4
    move v2, v1

    :goto_1
    iget-object v4, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v4, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLinkedCardsMastercard:Ljava/lang/Integer;

    .line 577
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ge v3, v4, :cond_5

    move v8, v7

    goto :goto_2

    :cond_5
    move v8, v1

    :goto_2
    iget-object v10, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v4, v0

    move v7, v2

    move-object v9, p0

    invoke-direct/range {v4 .. v10}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;-><init>(Landroid/app/Activity;Lcom/shopkick/app/application/ClientFlagsManager;ZZLcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    .line 580
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->showDialog()V

    return-void
.end method

.method private handleButtonClick(Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;I)V
    .locals 3

    .line 543
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "origin_screen"

    const/16 v2, 0x6b

    .line 544
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_element"

    .line 545
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    sget-object p2, Lcom/shopkick/app/bnc/BCRulesScreen$2;->$SwitchMap$com$shopkick$app$bnc$BCRulesScreen$ButtonType:[I

    invoke-virtual {p1}, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 556
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->handleBcLinkCardClick()V

    goto :goto_0

    .line 549
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 550
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/controllers/PhoneVerificationController;->launchVerifyPhoneFlow(Ljava/lang/String;)V

    goto :goto_0

    .line 552
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f11007f

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private handleLearnMoreClick()V
    .locals 3

    .line 533
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x78

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 534
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 535
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 537
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "url"

    .line 538
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->learnMoreWebview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    const-class v1, Lcom/shopkick/app/webview/WebViewScreen;

    const-string v2, "anon"

    invoke-virtual {p0, v1, v0, v2}, Lcom/shopkick/app/bnc/BCRulesScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method private hideStickyButton()V
    .locals 3

    .line 368
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f0906da

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 369
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    const v2, 0x7f0906db

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private isVisaOnlyLocation()Z
    .locals 1

    .line 529
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isK4PEverywhereEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isVisaOnlyLocation:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic lambda$configureBBYInstructions$36(Lcom/shopkick/app/bnc/BCRulesScreen;Landroid/view/View;)V
    .locals 0

    .line 425
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->showUserEmailDialog()V

    return-void
.end method

.method public static synthetic lambda$fetchRules$35(Lcom/shopkick/app/bnc/BCRulesScreen;)V
    .locals 2

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->fullScroll(I)Z

    return-void
.end method

.method public static synthetic lambda$null$37(Lcom/shopkick/app/bnc/BCRulesScreen;Landroid/widget/EditText;Landroid/support/v7/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 470
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 471
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_0

    sget-object p3, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/regex/Matcher;->matches()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 472
    new-instance p3, Lcom/shopkick/app/fetchers/api/skapi/SendBestBuyQRCodeEmailRequest;

    invoke-direct {p3}, Lcom/shopkick/app/fetchers/api/skapi/SendBestBuyQRCodeEmailRequest;-><init>()V

    .line 473
    iput-object p1, p3, Lcom/shopkick/app/fetchers/api/skapi/SendBestBuyQRCodeEmailRequest;->emailAddress:Ljava/lang/String;

    .line 474
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, p3, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 475
    invoke-virtual {p2}, Landroid/support/v7/app/AlertDialog;->dismiss()V

    goto :goto_0

    .line 477
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    const p2, 0x7f11013f

    invoke-virtual {p0, p2}, Lcom/shopkick/app/bnc/BCRulesScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$showUserEmailDialog$38(Lcom/shopkick/app/bnc/BCRulesScreen;Landroid/support/v7/app/AlertDialog;Landroid/widget/EditText;Landroid/content/DialogInterface;)V
    .locals 1

    const/4 p3, -0x1

    .line 468
    invoke-virtual {p1, p3}, Landroid/support/v7/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object p3

    .line 469
    new-instance v0, Lcom/shopkick/app/bnc/-$$Lambda$BCRulesScreen$9FemId_gVzupTD2gKCJNSUW0N8Y;

    invoke-direct {v0, p0, p2, p1}, Lcom/shopkick/app/bnc/-$$Lambda$BCRulesScreen$9FemId_gVzupTD2gKCJNSUW0N8Y;-><init>(Lcom/shopkick/app/bnc/BCRulesScreen;Landroid/widget/EditText;Landroid/support/v7/app/AlertDialog;)V

    invoke-virtual {p3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private loadChainLogo(Ljava/lang/String;Z)V
    .locals 4

    .line 219
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getRulesLayout()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0900e5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/4 v1, 0x5

    .line 220
    invoke-static {v1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    if-eqz p2, :cond_0

    const/16 p2, 0x26

    goto :goto_0

    :cond_0
    const/16 p2, 0x30

    .line 222
    :goto_0
    invoke-static {p2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p2

    .line 223
    new-instance v2, Lcom/shopkick/app/bnc/BCRulesScreen$1;

    invoke-direct {v2, p0}, Lcom/shopkick/app/bnc/BCRulesScreen$1;-><init>(Lcom/shopkick/app/bnc/BCRulesScreen;)V

    .line 234
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    .line 235
    invoke-virtual {v3, p1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    .line 236
    invoke-virtual {p1, p2, p2}, Lcom/shopkick/app/util/GlideRequest;->override(II)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    new-instance p2, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {p2, v1}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    .line 237
    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->transform(Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    .line 238
    invoke-virtual {p1, v2}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    .line 239
    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method private populateView()V
    .locals 10

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreRateRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreThresholdRules:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStorePerTransactionRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    if-nez v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    const v2, 0x7f0904ae

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 188
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->chainLogoImageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isBestBuyLocation:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/bnc/BCRulesScreen;->loadChainLogo(Ljava/lang/String;Z)V

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isBestBuyLocation:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureRulesView()V

    .line 196
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureBBYInstructions()V

    .line 197
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureButton()V

    goto :goto_0

    .line 199
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    if-nez v0, :cond_2

    .line 200
    new-instance v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;

    .line 202
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v2, 0x7f09041e

    .line 204
    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/RelativeLayout;

    iget-object v7, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v8, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v9, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p0

    invoke-direct/range {v1 .. v9}, Lcom/shopkick/app/bnc/LinkedCardsViewController;-><init>(Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;Lcom/shopkick/app/bnc/LinkedCardsViewController$ILinkedCardsViewCallback;Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Landroid/widget/RelativeLayout;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    .line 209
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->isVisaOnlyLocation()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->setIsVisaOnly(Z)V

    .line 210
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureHowItWorksView()V

    .line 211
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureRulesView()V

    .line 212
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureEnrolledCardsV2()V

    .line 213
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->configureButton()V

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f09040b

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/bnc/BCRulesScreen$LearnMoreClickHandler;

    invoke-direct {v1, p0}, Lcom/shopkick/app/bnc/BCRulesScreen$LearnMoreClickHandler;-><init>(Lcom/shopkick/app/bnc/BCRulesScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private setupButtonClickLogging(Lcom/shopkick/app/logging/IUserEventView;I)V
    .locals 2

    .line 498
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 499
    iget-object p2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->locationId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 500
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v1, 0x1

    .line 501
    iput-boolean v1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 502
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v0, v1, p2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private showStickyButton()V
    .locals 3

    .line 373
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    const v1, 0x7f0906da

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 374
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    const v2, 0x7f0906db

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private showUserEmailDialog()V
    .locals 4

    .line 449
    new-instance v0, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f110045

    .line 450
    invoke-virtual {p0, v1}, Lcom/shopkick/app/bnc/BCRulesScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    const v1, 0x7f110044

    .line 451
    invoke-virtual {p0, v1}, Lcom/shopkick/app/bnc/BCRulesScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 454
    new-instance v1, Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const/16 v2, 0x20

    .line 457
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setInputType(I)V

    const v2, 0x7f11017b

    .line 458
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setHint(I)V

    .line 459
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 461
    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/support/v7/app/AlertDialog$Builder;

    const v2, 0x7f110043

    .line 463
    invoke-virtual {p0, v2}, Lcom/shopkick/app/bnc/BCRulesScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    const v2, 0x7f110140

    .line 464
    invoke-virtual {p0, v2}, Lcom/shopkick/app/bnc/BCRulesScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v3}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 466
    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object v0

    .line 467
    new-instance v2, Lcom/shopkick/app/bnc/-$$Lambda$BCRulesScreen$lu7uz37fMM4Gj576yAU5-_1J4Tk;

    invoke-direct {v2, p0, v0, v1}, Lcom/shopkick/app/bnc/-$$Lambda$BCRulesScreen$lu7uz37fMM4Gj576yAU5-_1J4Tk;-><init>(Lcom/shopkick/app/bnc/BCRulesScreen;Landroid/support/v7/app/AlertDialog;Landroid/widget/EditText;)V

    invoke-virtual {v0, v2}, Landroid/support/v7/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 481
    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method


# virtual methods
.method public buttonTapped(I)V
    .locals 2

    .line 584
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    if-eqz v0, :cond_0

    .line 585
    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->dismissDialog()V

    const/4 v0, 0x0

    .line 586
    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    .line 588
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    const-string p1, "origin_element"

    const/16 v1, 0x19

    .line 590
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    const-class p1, Lcom/shopkick/app/activities/BncActivity;

    const-class v1, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;

    invoke-virtual {p0, p1, v1, v0}, Lcom/shopkick/app/bnc/BCRulesScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    const-string p1, "origin_element"

    const/16 v1, 0x1a

    .line 593
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    const-class p1, Lcom/shopkick/app/activities/BncActivity;

    const-class v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p0, p1, v1, v0}, Lcom/shopkick/app/bnc/BCRulesScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 169
    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SendBestBuyQRCodeEmailRequest;

    if-eqz p1, :cond_0

    return-void

    .line 172
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->progressBar:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const/4 p1, 0x0

    .line 173
    iput-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationRequest;

    .line 174
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 175
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    const-string p1, "%s\n%s"

    const/4 p2, 0x2

    .line 176
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->qrCodeLine_1:Ljava/lang/String;

    aput-object v1, p2, v0

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->qrCodeLine_2:Ljava/lang/String;

    aput-object v1, p2, v0

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->bbyQRCode:Ljava/lang/String;

    .line 177
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->populateView()V

    .line 178
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/BCRulesScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    goto :goto_0

    .line 180
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :goto_0
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0031

    const/4 v0, 0x0

    .line 118
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    .line 120
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    const p2, 0x7f090078

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->scrollView:Landroid/widget/ScrollView;

    .line 121
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    const p2, 0x7f090434

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->progressBar:Landroid/widget/ProgressBar;

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "BUY_AND_COLLECT_ENROLL_COMPLETE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 123
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "VerifyPhoneCompleteEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "BUY_AND_COLLECT_UNENROLL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 126
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public dialogCanceled()V
    .locals 1

    const/4 v0, 0x0

    .line 599
    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    return-void
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 105
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 106
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 107
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 108
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 109
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 110
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    const-string v0, "location_id"

    .line 111
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->locationId:Ljava/lang/String;

    .line 112
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    .line 113
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/BCRulesScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->request:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    if-eqz v0, :cond_0

    .line 134
    invoke-virtual {v0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->destroy()V

    .line 137
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/controllers/WindowBrightnessController;->restoreScreenBrightness(Landroid/view/Window;)V

    .line 138
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 603
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0xc6b7379

    if-eq p2, v0, :cond_2

    const v0, 0x2e16ee9c

    if-eq p2, v0, :cond_1

    const v0, 0x733d7e8c

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "VerifyPhoneCompleteEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string p2, "BUY_AND_COLLECT_ENROLL_COMPLETE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    const-string p2, "BUY_AND_COLLECT_UNENROLL_SUCCESS"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 613
    :pswitch_0
    iput-object p2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    .line 614
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->fetchRules()V

    goto :goto_2

    .line 609
    :pswitch_1
    iput-object p2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    .line 610
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->fetchRules()V

    goto :goto_2

    .line 605
    :pswitch_2
    iput-object p2, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onLinkAnotherCardClicked()V
    .locals 2

    .line 621
    sget-object v0, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;->LinkCard:Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;

    const/16 v1, 0xf

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/bnc/BCRulesScreen;->handleButtonClick(Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;I)V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCRulesScreen;->response:Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    if-nez v0, :cond_0

    .line 144
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCRulesScreen;->fetchRules()V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
